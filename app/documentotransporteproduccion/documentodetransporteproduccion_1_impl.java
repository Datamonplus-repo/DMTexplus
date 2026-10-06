package app.documentotransporteproduccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class documentodetransporteproduccion_1_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action50") == 0 )
      {
         AV7EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
         AV21ContCod = httpContext.GetPar( "ContCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21ContCod", AV21ContCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV21ContCod, "@!"))));
         A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_50_1U63( AV7EmprCod, AV21ContCod, A30AlbProCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action53") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_53_1U63( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel3"+"_"+"ALBFECANT") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
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
         gx3asaalbfecant1U63( A396EmprCod, A30AlbProCod, A39AlbProPri) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"ALBIMPORTE") == 0 )
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
         gx4asaalbimporte1U63( A396EmprCod, A30AlbProCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel5"+"_"+"ALBLINEASA") == 0 )
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
         gx5asaalblineasa1U63( A396EmprCod, A30AlbProCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"ALBFACTURA") == 0 )
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
         gx6asaalbfactura1U63( A396EmprCod, A30AlbProCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel30"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_56") == 0 )
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
         gxload_56( A1253EmprGuiRem, A1243GuiRemCli) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_61") == 0 )
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
         gxload_61( A1253EmprGuiRem, A1243GuiRemCli, A1259AlbDomEnv) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_59") == 0 )
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
         gxload_59( A1253EmprGuiRem, A840TrnCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_60") == 0 )
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
         gxload_60( A3108AlbDivCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_58") == 0 )
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
         gxload_58( A396EmprCod, A840TrnCod) ;
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
            AV17AlbProPri = httpContext.GetPar( "AlbProPri") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17AlbProPri", AV17AlbProPri);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROPRI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17AlbProPri, "9"))));
            AV21ContCod = httpContext.GetPar( "ContCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21ContCod", AV21ContCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV21ContCod, "@!"))));
            AV22AlbSec = httpContext.GetPar( "AlbSec") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22AlbSec", AV22AlbSec);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBSEC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV22AlbSec, "@!"))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Documento de Transporte Produccion", ""), (short)(0)) ;
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

   public documentodetransporteproduccion_1_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public documentodetransporteproduccion_1_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentodetransporteproduccion_1_impl.class ));
   }

   public documentodetransporteproduccion_1_impl( int remoteHandle ,
                                                  ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavAlbpropri = new HTMLChoice();
      cmbAlbEnvFtp = new HTMLChoice();
      cmbAlbProAT = new HTMLChoice();
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
      if ( cmbavAlbpropri.getItemCount() > 0 )
      {
         AV17AlbProPri = cmbavAlbpropri.getValidValue(AV17AlbProPri) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17AlbProPri", AV17AlbProPri);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROPRI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17AlbProPri, "9"))));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavAlbpropri.setValue( GXutil.rtrim( AV17AlbProPri) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlbpropri.getInternalname(), "Values", cmbavAlbpropri.ToJavascriptSource(), true);
      }
      if ( cmbAlbEnvFtp.getItemCount() > 0 )
      {
         A5805AlbEnvFtp = (byte)(GXutil.lval( cmbAlbEnvFtp.getValidValue(GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBENVFTP", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A5805AlbEnvFtp), "9")));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbEnvFtp.setValue( GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbEnvFtp.getInternalname(), "Values", cmbAlbEnvFtp.ToJavascriptSource(), true);
      }
      if ( cmbAlbProAT.getItemCount() > 0 )
      {
         A10765AlbProAT = cmbAlbProAT.getValidValue(A10765AlbProAT) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10765AlbProAT", A10765AlbProAT);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbProAT.setValue( GXutil.rtrim( A10765AlbProAT) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbProAT.getInternalname(), "Values", cmbAlbProAT.ToJavascriptSource(), true);
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProCod_Internalname, httpContext.getMessage( "Nº Guia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProCod_Internalname, GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProCod_Enabled, 1, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProfch_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProfch_Internalname, httpContext.getMessage( "Data", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtAlbProfch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProfch_Internalname, localUtil.format(A34AlbProfch, "99/99/99"), localUtil.format( A34AlbProfch, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProfch_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProfch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbProfch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbProfch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbFecAnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbFecAnt_Internalname, httpContext.getMessage( "Data Ant.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtAlbFecAnt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbFecAnt_Internalname, localUtil.format(A14396AlbFecAnt, "99/99/99"), localUtil.format( A14396AlbFecAnt, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbFecAnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbFecAnt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbFecAnt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbFecAnt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedguiremcli_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockguiremcli_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblockguiremcli_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_guiremcli.setProperty("Caption", Combo_guiremcli_Caption);
      ucCombo_guiremcli.setProperty("Cls", Combo_guiremcli_Cls);
      ucCombo_guiremcli.setProperty("EmptyItem", Combo_guiremcli_Emptyitem);
      ucCombo_guiremcli.setProperty("DropDownOptionsData", AV23GuiRemCli_Data);
      ucCombo_guiremcli.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_guiremcli_Internalname, "COMBO_GUIREMCLIContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtGuiRemCli_Internalname, httpContext.getMessage( "Codigo Cliente", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtGuiRemCli_Internalname, GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1243GuiRemCli), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,43);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGuiRemCli_Jsonclick, 0, "Attribute", "", "", "", "", edtGuiRemCli_Visible, edtGuiRemCli_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedalbclides_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbclides_Internalname, httpContext.getMessage( "Cliente Destino", ""), "", "", lblTextblockalbclides_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_albclides.setProperty("Caption", Combo_albclides_Caption);
      ucCombo_albclides.setProperty("Cls", Combo_albclides_Cls);
      ucCombo_albclides.setProperty("EmptyItem", Combo_albclides_Emptyitem);
      ucCombo_albclides.setProperty("DropDownOptionsData", AV26AlbCliDes_Data);
      ucCombo_albclides.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_albclides_Internalname, "COMBO_ALBCLIDESContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbCliDes_Internalname, httpContext.getMessage( "Cliente Destino", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbCliDes_Internalname, GXutil.ltrim( localUtil.ntoc( A3869AlbCliDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbCliDes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3869AlbCliDes), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3869AlbCliDes), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbCliDes_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbCliDes_Visible, edtAlbCliDes_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbUsu_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbUsu_Internalname, httpContext.getMessage( "Usuario", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbUsu_Internalname, GXutil.rtrim( A7098AlbUsu), GXutil.rtrim( localUtil.format( A7098AlbUsu, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbUsu_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbUsu_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1.htm");
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedalbdomenv_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbdomenv_Internalname, httpContext.getMessage( "Domicilio Envio", ""), "", "", lblTextblockalbdomenv_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_albdomenv.setProperty("Caption", Combo_albdomenv_Caption);
      ucCombo_albdomenv.setProperty("Cls", Combo_albdomenv_Cls);
      ucCombo_albdomenv.setProperty("EmptyItemText", Combo_albdomenv_Emptyitemtext);
      ucCombo_albdomenv.setProperty("DropDownOptionsTitleSettingsIcons", AV33DDO_TitleSettingsIcons);
      ucCombo_albdomenv.setProperty("DropDownOptionsData", AV31AlbDomEnv_Data);
      ucCombo_albdomenv.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_albdomenv_Internalname, "COMBO_ALBDOMENVContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbDomEnv_Internalname, httpContext.getMessage( "Domicilio de Envio", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDomEnv_Internalname, GXutil.ltrim( localUtil.ntoc( A1259AlbDomEnv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbDomEnv_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1259AlbDomEnv), "9") : localUtil.format( DecimalUtil.doubleToDec(A1259AlbDomEnv), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDomEnv_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbDomEnv_Visible, edtAlbDomEnv_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocktrncod_Internalname, httpContext.getMessage( "Transportista", ""), "", "", lblTextblocktrncod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_trncod.setProperty("Caption", Combo_trncod_Caption);
      ucCombo_trncod.setProperty("Cls", Combo_trncod_Cls);
      ucCombo_trncod.setProperty("EmptyItemText", Combo_trncod_Emptyitemtext);
      ucCombo_trncod.setProperty("DropDownOptionsData", AV29TrnCod_Data);
      ucCombo_trncod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_trncod_Internalname, "COMBO_TRNCODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTrnCod_Internalname, httpContext.getMessage( "Codigo Transportista", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnCod_Internalname, GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtTrnCod_Jsonclick, 0, "Attribute", "", "", "", "", edtTrnCod_Visible, edtTrnCod_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbMat_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbMat_Internalname, httpContext.getMessage( "Matricula", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbMat_Internalname, GXutil.rtrim( A3868AlbMat), GXutil.rtrim( localUtil.format( A3868AlbMat, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,85);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbMat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbMat_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbFecSal_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbFecSal_Internalname, httpContext.getMessage( "Data Saida", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtAlbFecSal_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbFecSal_Internalname, localUtil.format(A4023AlbFecSal, "99/99/99"), localUtil.format( A4023AlbFecSal, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbFecSal_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbFecSal_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbFecSal_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbFecSal_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbHorSal_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbHorSal_Internalname, httpContext.getMessage( "Hora Saida", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbHorSal_Internalname, GXutil.rtrim( A3865AlbHorSal), GXutil.rtrim( localUtil.format( A3865AlbHorSal, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbHorSal_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbHorSal_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1.htm");
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavAlbpropri.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbavAlbpropri.getInternalname(), httpContext.getMessage( "Tipo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavAlbpropri, cmbavAlbpropri.getInternalname(), GXutil.rtrim( AV17AlbProPri), 1, cmbavAlbpropri.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavAlbpropri.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1.htm");
      cmbavAlbpropri.setValue( GXutil.rtrim( AV17AlbProPri) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbpropri.getInternalname(), "Values", cmbavAlbpropri.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavContcod_Internalname, GXutil.rtrim( AV21ContCod), GXutil.rtrim( localUtil.format( AV21ContCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavContcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavContcod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbLineasA_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbLineasA_Internalname, httpContext.getMessage( "Lineas?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbLineasA_Internalname, GXutil.ltrim( localUtil.ntoc( A14252AlbLineasA, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbLineasA_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14252AlbLineasA), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14252AlbLineasA), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbLineasA_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbLineasA_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable11_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell CellMarginTop24 DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbEnvFtp.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbAlbEnvFtp.getInternalname(), httpContext.getMessage( "Envio a AT", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbEnvFtp, cmbAlbEnvFtp.getInternalname(), GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0)), 1, cmbAlbEnvFtp.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbAlbEnvFtp.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1.htm");
      cmbAlbEnvFtp.setValue( GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbEnvFtp.getInternalname(), "Values", cmbAlbEnvFtp.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell CellMarginTop24 DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbLic_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbLic_Internalname, httpContext.getMessage( "Codigo AT", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbLic_Internalname, GXutil.rtrim( A7101AlbLic), GXutil.rtrim( localUtil.format( A7101AlbLic, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbLic_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbLic_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell CellMarginTop24 DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbProAT.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbAlbProAT.getInternalname(), httpContext.getMessage( "A/M", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbProAT, cmbAlbProAT.getInternalname(), GXutil.rtrim( A10765AlbProAT), 1, cmbAlbProAT.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbProAT.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1.htm");
      cmbAlbProAT.setValue( GXutil.rtrim( A10765AlbProAT) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProAT.getInternalname(), "Values", cmbAlbProAT.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell CellMarginTop24 DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbHhfm_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbHhfm_Internalname, httpContext.getMessage( "Data System Hash", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtAlbHhfm_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbHhfm_Internalname, localUtil.ttoc( A10019AlbHhfm, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A10019AlbHhfm, "99/99/99 99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbHhfm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbHhfm_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbHhfm_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbHhfm_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell CellMarginTop24 DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbPdATCUD_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbPdATCUD_Internalname, httpContext.getMessage( "ATCUD", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbPdATCUD_Internalname, GXutil.rtrim( A14069AlbPdATCUD), GXutil.rtrim( localUtil.format( A14069AlbPdATCUD, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbPdATCUD_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbPdATCUD_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell CellMarginTop24 DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFirma4dig_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFirma4dig_Internalname, httpContext.getMessage( "Hash", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFirma4dig_Internalname, GXutil.rtrim( A14362Firma4dig), GXutil.rtrim( localUtil.format( A14362Firma4dig, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFirma4dig_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFirma4dig_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divDvpanel_unnamedtable8_cell_Internalname, 1, 0, "px", 0, "px", divDvpanel_unnamedtable8_cell_Class, "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable9_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbTrnNm_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbTrnNm_Internalname, httpContext.getMessage( "Nome", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 164,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbTrnNm_Internalname, GXutil.rtrim( A10835AlbTrnNm), GXutil.rtrim( localUtil.format( A10835AlbTrnNm, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,164);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbTrnNm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbTrnNm_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbTrnDm_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbTrnDm_Internalname, httpContext.getMessage( "Endeço", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 168,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbTrnDm_Internalname, GXutil.rtrim( A10836AlbTrnDm), GXutil.rtrim( localUtil.format( A10836AlbTrnDm, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,168);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbTrnDm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbTrnDm_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable10_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbTrnNc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbTrnNc_Internalname, httpContext.getMessage( "Contribuiente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbTrnNc_Internalname, GXutil.rtrim( A10837AlbTrnNc), GXutil.rtrim( localUtil.format( A10837AlbTrnNc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,176);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbTrnNc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbTrnNc_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 181,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 183,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 185,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV54Pgmname), GXutil.rtrim( localUtil.format( AV54Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_guiremcli_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavComboguiremcli_Internalname, GXutil.ltrim( localUtil.ntoc( AV25ComboGuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavComboguiremcli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV25ComboGuiRemCli), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV25ComboGuiRemCli), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavComboguiremcli_Jsonclick, 0, "Attribute", "", "", "", "", edtavComboguiremcli_Visible, edtavComboguiremcli_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_albclides_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavComboalbclides_Internalname, GXutil.ltrim( localUtil.ntoc( AV27ComboAlbCliDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavComboalbclides_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV27ComboAlbCliDes), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV27ComboAlbCliDes), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavComboalbclides_Jsonclick, 0, "Attribute", "", "", "", "", edtavComboalbclides_Visible, edtavComboalbclides_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_albdomenv_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavComboalbdomenv_Internalname, GXutil.ltrim( localUtil.ntoc( AV32ComboAlbDomEnv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavComboalbdomenv_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV32ComboAlbDomEnv), "9") : localUtil.format( DecimalUtil.doubleToDec(AV32ComboAlbDomEnv), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavComboalbdomenv_Jsonclick, 0, "Attribute", "", "", "", "", edtavComboalbdomenv_Visible, edtavComboalbdomenv_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_trncod_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombotrncod_Internalname, GXutil.ltrim( localUtil.ntoc( AV30ComboTrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCombotrncod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV30ComboTrnCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV30ComboTrnCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtavCombotrncod_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombotrncod_Visible, edtavCombotrncod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbGrossT_Internalname, GXutil.ltrim( localUtil.ntoc( A10020AlbGrossT, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbGrossT_Enabled!=0) ? localUtil.format( A10020AlbGrossT, "ZZZZZZZZZ9.99") : localUtil.format( A10020AlbGrossT, "ZZZZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbGrossT_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbGrossT_Visible, edtAlbGrossT_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1.htm");
      drawcontrols1( ) ;
   }

   public void drawcontrols1( )
   {
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbSec_Internalname, GXutil.rtrim( A2242AlbSec), GXutil.rtrim( localUtil.format( A2242AlbSec, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbSec_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbSec_Visible, edtAlbSec_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProPri_Internalname, GXutil.rtrim( A39AlbProPri), GXutil.rtrim( localUtil.format( A39AlbProPri, "9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProPri_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbProPri_Visible, edtAlbProPri_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProEst_Internalname, GXutil.ltrim( localUtil.ntoc( A33AlbProEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbProEst_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A33AlbProEst), "9") : localUtil.format( DecimalUtil.doubleToDec(A33AlbProEst), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProEst_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbProEst_Visible, edtAlbProEst_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1.htm");
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
      e111U62 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vGUIREMCLI_DATA"), AV23GuiRemCli_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vALBCLIDES_DATA"), AV26AlbCliDes_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV33DDO_TitleSettingsIcons);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vALBDOMENV_DATA"), AV31AlbDomEnv_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vTRNCOD_DATA"), AV29TrnCod_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z30AlbProCod = localUtil.ctol( httpContext.cgiGet( "Z30AlbProCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z1259AlbDomEnv = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1259AlbDomEnv"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3869AlbCliDes = (int)(localUtil.ctol( httpContext.cgiGet( "Z3869AlbCliDes"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z39AlbProPri = httpContext.cgiGet( "Z39AlbProPri") ;
            Z3093AlbDivTCod = httpContext.cgiGet( "Z3093AlbDivTCod") ;
            Z1258GuiRemDom = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1258GuiRemDom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2242AlbSec = httpContext.cgiGet( "Z2242AlbSec") ;
            Z33AlbProEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z33AlbProEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z34AlbProfch = localUtil.ctod( httpContext.cgiGet( "Z34AlbProfch"), 0) ;
            Z4023AlbFecSal = localUtil.ctod( httpContext.cgiGet( "Z4023AlbFecSal"), 0) ;
            Z3865AlbHorSal = httpContext.cgiGet( "Z3865AlbHorSal") ;
            Z7098AlbUsu = httpContext.cgiGet( "Z7098AlbUsu") ;
            Z3868AlbMat = httpContext.cgiGet( "Z3868AlbMat") ;
            Z5805AlbEnvFtp = (byte)(localUtil.ctol( httpContext.cgiGet( "Z5805AlbEnvFtp"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7101AlbLic = httpContext.cgiGet( "Z7101AlbLic") ;
            Z10765AlbProAT = httpContext.cgiGet( "Z10765AlbProAT") ;
            Z10019AlbHhfm = localUtil.ctot( httpContext.cgiGet( "Z10019AlbHhfm"), 0) ;
            Z10020AlbGrossT = localUtil.ctond( httpContext.cgiGet( "Z10020AlbGrossT")) ;
            Z10837AlbTrnNc = httpContext.cgiGet( "Z10837AlbTrnNc") ;
            Z10017AlbFmd = httpContext.cgiGet( "Z10017AlbFmd") ;
            Z10835AlbTrnNm = httpContext.cgiGet( "Z10835AlbTrnNm") ;
            Z10018ALbFmdc = httpContext.cgiGet( "Z10018ALbFmdc") ;
            Z10836AlbTrnDm = httpContext.cgiGet( "Z10836AlbTrnDm") ;
            Z5140AlbMarca = httpContext.cgiGet( "Z5140AlbMarca") ;
            Z3867AlbLocDes = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3867AlbLocDes"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3866AlbLocCar = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3866AlbLocCar"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z914AlbPObsCon = (byte)(localUtil.ctol( httpContext.cgiGet( "Z914AlbPObsCon"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5141AlbIvaCod = httpContext.cgiGet( "Z5141AlbIvaCod") ;
            Z7987AlbColCa = httpContext.cgiGet( "Z7987AlbColCa") ;
            Z7162AlbDesp = (int)(localUtil.ctol( httpContext.cgiGet( "Z7162AlbDesp"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7986AlbCambio = localUtil.ctond( httpContext.cgiGet( "Z7986AlbCambio")) ;
            Z7985AlbTipDoc = (int)(localUtil.ctol( httpContext.cgiGet( "Z7985AlbTipDoc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7984AlbMotTr = httpContext.cgiGet( "Z7984AlbMotTr") ;
            Z5803AlbTipCal = (byte)(localUtil.ctol( httpContext.cgiGet( "Z5803AlbTipCal"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7988AlbObsCb = httpContext.cgiGet( "Z7988AlbObsCb") ;
            Z7102AlbNumT = localUtil.ctol( httpContext.cgiGet( "Z7102AlbNumT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z7100AlbMarCo = httpContext.cgiGet( "Z7100AlbMarCo") ;
            Z7099AlbOComp = httpContext.cgiGet( "Z7099AlbOComp") ;
            Z14074AlbPdTipAT = httpContext.cgiGet( "Z14074AlbPdTipAT") ;
            Z14073AlbPdSerAT = httpContext.cgiGet( "Z14073AlbPdSerAT") ;
            Z14069AlbPdATCUD = httpContext.cgiGet( "Z14069AlbPdATCUD") ;
            Z14404AlbEnvMail = localUtil.ctot( httpContext.cgiGet( "Z14404AlbEnvMail"), 0) ;
            Z1253EmprGuiRem = httpContext.cgiGet( "Z1253EmprGuiRem") ;
            Z1243GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( "Z1243GuiRemCli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3108AlbDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3108AlbDivCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3093AlbDivTCod = httpContext.cgiGet( "Z3093AlbDivTCod") ;
            n3093AlbDivTCod = false ;
            A1258GuiRemDom = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1258GuiRemDom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1258GuiRemDom = false ;
            A10017AlbFmd = httpContext.cgiGet( "Z10017AlbFmd") ;
            n10017AlbFmd = false ;
            A10018ALbFmdc = httpContext.cgiGet( "Z10018ALbFmdc") ;
            A5140AlbMarca = httpContext.cgiGet( "Z5140AlbMarca") ;
            A3867AlbLocDes = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3867AlbLocDes"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3866AlbLocCar = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3866AlbLocCar"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A914AlbPObsCon = (byte)(localUtil.ctol( httpContext.cgiGet( "Z914AlbPObsCon"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A5141AlbIvaCod = httpContext.cgiGet( "Z5141AlbIvaCod") ;
            A7987AlbColCa = httpContext.cgiGet( "Z7987AlbColCa") ;
            A7162AlbDesp = (int)(localUtil.ctol( httpContext.cgiGet( "Z7162AlbDesp"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A7986AlbCambio = localUtil.ctond( httpContext.cgiGet( "Z7986AlbCambio")) ;
            A7985AlbTipDoc = (int)(localUtil.ctol( httpContext.cgiGet( "Z7985AlbTipDoc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A7984AlbMotTr = httpContext.cgiGet( "Z7984AlbMotTr") ;
            A5803AlbTipCal = (byte)(localUtil.ctol( httpContext.cgiGet( "Z5803AlbTipCal"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A7988AlbObsCb = httpContext.cgiGet( "Z7988AlbObsCb") ;
            A7102AlbNumT = localUtil.ctol( httpContext.cgiGet( "Z7102AlbNumT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            A7100AlbMarCo = httpContext.cgiGet( "Z7100AlbMarCo") ;
            A7099AlbOComp = httpContext.cgiGet( "Z7099AlbOComp") ;
            A14074AlbPdTipAT = httpContext.cgiGet( "Z14074AlbPdTipAT") ;
            A14073AlbPdSerAT = httpContext.cgiGet( "Z14073AlbPdSerAT") ;
            A14404AlbEnvMail = localUtil.ctot( httpContext.cgiGet( "Z14404AlbEnvMail"), 0) ;
            A1253EmprGuiRem = httpContext.cgiGet( "Z1253EmprGuiRem") ;
            A3108AlbDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3108AlbDivCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3108AlbDivCod = false ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N1243GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( "N1243GuiRemCli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "N840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N3108AlbDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( "N3108AlbDivCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N1253EmprGuiRem = httpContext.cgiGet( "N1253EmprGuiRem") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            A14253AlbImporte = localUtil.ctond( httpContext.cgiGet( "ALBIMPORTE")) ;
            A14251AlbFactura = (byte)(localUtil.ctol( httpContext.cgiGet( "ALBFACTURA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A10017AlbFmd = httpContext.cgiGet( "ALBFMD") ;
            AV7EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV8AlbProCod = localUtil.ctol( httpContext.cgiGet( "vALBPROCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            AV12Insert_GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( "vINSERT_GUIREMCLI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV13Insert_TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_TRNCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV14Insert_AlbDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( "vINSERT_ALBDIVCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3108AlbDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( "ALBDIVCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV15Insert_EmprGuiRem = httpContext.cgiGet( "vINSERT_EMPRGUIREM") ;
            A1253EmprGuiRem = httpContext.cgiGet( "EMPRGUIREM") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3093AlbDivTCod = httpContext.cgiGet( "ALBDIVTCOD") ;
            A1258GuiRemDom = (byte)(localUtil.ctol( httpContext.cgiGet( "GUIREMDOM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV22AlbSec = httpContext.cgiGet( "vALBSEC") ;
            A5140AlbMarca = httpContext.cgiGet( "ALBMARCA") ;
            AV20UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV55Pgmdesc = httpContext.cgiGet( "vPGMDESC") ;
            A14073AlbPdSerAT = httpContext.cgiGet( "ALBPDSERAT") ;
            A14074AlbPdTipAT = httpContext.cgiGet( "ALBPDTIPAT") ;
            A10018ALbFmdc = httpContext.cgiGet( "ALBFMDC") ;
            A3867AlbLocDes = (byte)(localUtil.ctol( httpContext.cgiGet( "ALBLOCDES"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3866AlbLocCar = (byte)(localUtil.ctol( httpContext.cgiGet( "ALBLOCCAR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A914AlbPObsCon = (byte)(localUtil.ctol( httpContext.cgiGet( "ALBPOBSCON"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A5141AlbIvaCod = httpContext.cgiGet( "ALBIVACOD") ;
            A7987AlbColCa = httpContext.cgiGet( "ALBCOLCA") ;
            A7162AlbDesp = (int)(localUtil.ctol( httpContext.cgiGet( "ALBDESP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A7986AlbCambio = localUtil.ctond( httpContext.cgiGet( "ALBCAMBIO")) ;
            A7985AlbTipDoc = (int)(localUtil.ctol( httpContext.cgiGet( "ALBTIPDOC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A7984AlbMotTr = httpContext.cgiGet( "ALBMOTTR") ;
            A5803AlbTipCal = (byte)(localUtil.ctol( httpContext.cgiGet( "ALBTIPCAL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A7988AlbObsCb = httpContext.cgiGet( "ALBOBSCB") ;
            A7102AlbNumT = localUtil.ctol( httpContext.cgiGet( "ALBNUMT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            A7100AlbMarCo = httpContext.cgiGet( "ALBMARCO") ;
            A7099AlbOComp = httpContext.cgiGet( "ALBOCOMP") ;
            A14404AlbEnvMail = localUtil.ctot( httpContext.cgiGet( "ALBENVMAIL"), 0) ;
            A1244GuiRemCln = httpContext.cgiGet( "GUIREMCLN") ;
            A3145GuiRemDivT = httpContext.cgiGet( "GUIREMDIVT") ;
            n3145GuiRemDivT = false ;
            A3110GuiRemDiv = (byte)(localUtil.ctol( httpContext.cgiGet( "GUIREMDIV"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3110GuiRemDiv = false ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A841TrnNom = httpContext.cgiGet( "TRNNOM") ;
            n841TrnNom = false ;
            A3643TrnNif = httpContext.cgiGet( "TRNNIF") ;
            n3643TrnNif = false ;
            A3109AlbDivAbr = httpContext.cgiGet( "ALBDIVABR") ;
            n3109AlbDivAbr = false ;
            A1260BusDomEnv = (byte)(localUtil.ctol( httpContext.cgiGet( "BUSDOMENV"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1260BusDomEnv = false ;
            Combo_guiremcli_Objectcall = httpContext.cgiGet( "COMBO_GUIREMCLI_Objectcall") ;
            Combo_guiremcli_Class = httpContext.cgiGet( "COMBO_GUIREMCLI_Class") ;
            Combo_guiremcli_Icontype = httpContext.cgiGet( "COMBO_GUIREMCLI_Icontype") ;
            Combo_guiremcli_Icon = httpContext.cgiGet( "COMBO_GUIREMCLI_Icon") ;
            Combo_guiremcli_Caption = httpContext.cgiGet( "COMBO_GUIREMCLI_Caption") ;
            Combo_guiremcli_Tooltip = httpContext.cgiGet( "COMBO_GUIREMCLI_Tooltip") ;
            Combo_guiremcli_Cls = httpContext.cgiGet( "COMBO_GUIREMCLI_Cls") ;
            Combo_guiremcli_Selectedvalue_set = httpContext.cgiGet( "COMBO_GUIREMCLI_Selectedvalue_set") ;
            Combo_guiremcli_Selectedvalue_get = httpContext.cgiGet( "COMBO_GUIREMCLI_Selectedvalue_get") ;
            Combo_guiremcli_Selectedtext_set = httpContext.cgiGet( "COMBO_GUIREMCLI_Selectedtext_set") ;
            Combo_guiremcli_Selectedtext_get = httpContext.cgiGet( "COMBO_GUIREMCLI_Selectedtext_get") ;
            Combo_guiremcli_Gamoauthtoken = httpContext.cgiGet( "COMBO_GUIREMCLI_Gamoauthtoken") ;
            Combo_guiremcli_Ddointernalname = httpContext.cgiGet( "COMBO_GUIREMCLI_Ddointernalname") ;
            Combo_guiremcli_Titlecontrolalign = httpContext.cgiGet( "COMBO_GUIREMCLI_Titlecontrolalign") ;
            Combo_guiremcli_Dropdownoptionstype = httpContext.cgiGet( "COMBO_GUIREMCLI_Dropdownoptionstype") ;
            Combo_guiremcli_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_GUIREMCLI_Enabled")) ;
            Combo_guiremcli_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_GUIREMCLI_Visible")) ;
            Combo_guiremcli_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_GUIREMCLI_Titlecontrolidtoreplace") ;
            Combo_guiremcli_Datalisttype = httpContext.cgiGet( "COMBO_GUIREMCLI_Datalisttype") ;
            Combo_guiremcli_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_GUIREMCLI_Allowmultipleselection")) ;
            Combo_guiremcli_Datalistfixedvalues = httpContext.cgiGet( "COMBO_GUIREMCLI_Datalistfixedvalues") ;
            Combo_guiremcli_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_GUIREMCLI_Isgriditem")) ;
            Combo_guiremcli_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_GUIREMCLI_Hasdescription")) ;
            Combo_guiremcli_Datalistproc = httpContext.cgiGet( "COMBO_GUIREMCLI_Datalistproc") ;
            Combo_guiremcli_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_GUIREMCLI_Datalistprocparametersprefix") ;
            Combo_guiremcli_Remoteservicesparameters = httpContext.cgiGet( "COMBO_GUIREMCLI_Remoteservicesparameters") ;
            Combo_guiremcli_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_GUIREMCLI_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_guiremcli_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_GUIREMCLI_Includeonlyselectedoption")) ;
            Combo_guiremcli_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_GUIREMCLI_Includeselectalloption")) ;
            Combo_guiremcli_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_GUIREMCLI_Emptyitem")) ;
            Combo_guiremcli_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_GUIREMCLI_Includeaddnewoption")) ;
            Combo_guiremcli_Htmltemplate = httpContext.cgiGet( "COMBO_GUIREMCLI_Htmltemplate") ;
            Combo_guiremcli_Multiplevaluestype = httpContext.cgiGet( "COMBO_GUIREMCLI_Multiplevaluestype") ;
            Combo_guiremcli_Loadingdata = httpContext.cgiGet( "COMBO_GUIREMCLI_Loadingdata") ;
            Combo_guiremcli_Noresultsfound = httpContext.cgiGet( "COMBO_GUIREMCLI_Noresultsfound") ;
            Combo_guiremcli_Emptyitemtext = httpContext.cgiGet( "COMBO_GUIREMCLI_Emptyitemtext") ;
            Combo_guiremcli_Onlyselectedvalues = httpContext.cgiGet( "COMBO_GUIREMCLI_Onlyselectedvalues") ;
            Combo_guiremcli_Selectalltext = httpContext.cgiGet( "COMBO_GUIREMCLI_Selectalltext") ;
            Combo_guiremcli_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_GUIREMCLI_Multiplevaluesseparator") ;
            Combo_guiremcli_Addnewoptiontext = httpContext.cgiGet( "COMBO_GUIREMCLI_Addnewoptiontext") ;
            Combo_albclides_Objectcall = httpContext.cgiGet( "COMBO_ALBCLIDES_Objectcall") ;
            Combo_albclides_Class = httpContext.cgiGet( "COMBO_ALBCLIDES_Class") ;
            Combo_albclides_Icontype = httpContext.cgiGet( "COMBO_ALBCLIDES_Icontype") ;
            Combo_albclides_Icon = httpContext.cgiGet( "COMBO_ALBCLIDES_Icon") ;
            Combo_albclides_Caption = httpContext.cgiGet( "COMBO_ALBCLIDES_Caption") ;
            Combo_albclides_Tooltip = httpContext.cgiGet( "COMBO_ALBCLIDES_Tooltip") ;
            Combo_albclides_Cls = httpContext.cgiGet( "COMBO_ALBCLIDES_Cls") ;
            Combo_albclides_Selectedvalue_set = httpContext.cgiGet( "COMBO_ALBCLIDES_Selectedvalue_set") ;
            Combo_albclides_Selectedvalue_get = httpContext.cgiGet( "COMBO_ALBCLIDES_Selectedvalue_get") ;
            Combo_albclides_Selectedtext_set = httpContext.cgiGet( "COMBO_ALBCLIDES_Selectedtext_set") ;
            Combo_albclides_Selectedtext_get = httpContext.cgiGet( "COMBO_ALBCLIDES_Selectedtext_get") ;
            Combo_albclides_Gamoauthtoken = httpContext.cgiGet( "COMBO_ALBCLIDES_Gamoauthtoken") ;
            Combo_albclides_Ddointernalname = httpContext.cgiGet( "COMBO_ALBCLIDES_Ddointernalname") ;
            Combo_albclides_Titlecontrolalign = httpContext.cgiGet( "COMBO_ALBCLIDES_Titlecontrolalign") ;
            Combo_albclides_Dropdownoptionstype = httpContext.cgiGet( "COMBO_ALBCLIDES_Dropdownoptionstype") ;
            Combo_albclides_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBCLIDES_Enabled")) ;
            Combo_albclides_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBCLIDES_Visible")) ;
            Combo_albclides_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_ALBCLIDES_Titlecontrolidtoreplace") ;
            Combo_albclides_Datalisttype = httpContext.cgiGet( "COMBO_ALBCLIDES_Datalisttype") ;
            Combo_albclides_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBCLIDES_Allowmultipleselection")) ;
            Combo_albclides_Datalistfixedvalues = httpContext.cgiGet( "COMBO_ALBCLIDES_Datalistfixedvalues") ;
            Combo_albclides_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBCLIDES_Isgriditem")) ;
            Combo_albclides_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBCLIDES_Hasdescription")) ;
            Combo_albclides_Datalistproc = httpContext.cgiGet( "COMBO_ALBCLIDES_Datalistproc") ;
            Combo_albclides_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_ALBCLIDES_Datalistprocparametersprefix") ;
            Combo_albclides_Remoteservicesparameters = httpContext.cgiGet( "COMBO_ALBCLIDES_Remoteservicesparameters") ;
            Combo_albclides_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_ALBCLIDES_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_albclides_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBCLIDES_Includeonlyselectedoption")) ;
            Combo_albclides_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBCLIDES_Includeselectalloption")) ;
            Combo_albclides_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBCLIDES_Emptyitem")) ;
            Combo_albclides_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBCLIDES_Includeaddnewoption")) ;
            Combo_albclides_Htmltemplate = httpContext.cgiGet( "COMBO_ALBCLIDES_Htmltemplate") ;
            Combo_albclides_Multiplevaluestype = httpContext.cgiGet( "COMBO_ALBCLIDES_Multiplevaluestype") ;
            Combo_albclides_Loadingdata = httpContext.cgiGet( "COMBO_ALBCLIDES_Loadingdata") ;
            Combo_albclides_Noresultsfound = httpContext.cgiGet( "COMBO_ALBCLIDES_Noresultsfound") ;
            Combo_albclides_Emptyitemtext = httpContext.cgiGet( "COMBO_ALBCLIDES_Emptyitemtext") ;
            Combo_albclides_Onlyselectedvalues = httpContext.cgiGet( "COMBO_ALBCLIDES_Onlyselectedvalues") ;
            Combo_albclides_Selectalltext = httpContext.cgiGet( "COMBO_ALBCLIDES_Selectalltext") ;
            Combo_albclides_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_ALBCLIDES_Multiplevaluesseparator") ;
            Combo_albclides_Addnewoptiontext = httpContext.cgiGet( "COMBO_ALBCLIDES_Addnewoptiontext") ;
            Combo_albdomenv_Objectcall = httpContext.cgiGet( "COMBO_ALBDOMENV_Objectcall") ;
            Combo_albdomenv_Class = httpContext.cgiGet( "COMBO_ALBDOMENV_Class") ;
            Combo_albdomenv_Icontype = httpContext.cgiGet( "COMBO_ALBDOMENV_Icontype") ;
            Combo_albdomenv_Icon = httpContext.cgiGet( "COMBO_ALBDOMENV_Icon") ;
            Combo_albdomenv_Caption = httpContext.cgiGet( "COMBO_ALBDOMENV_Caption") ;
            Combo_albdomenv_Tooltip = httpContext.cgiGet( "COMBO_ALBDOMENV_Tooltip") ;
            Combo_albdomenv_Cls = httpContext.cgiGet( "COMBO_ALBDOMENV_Cls") ;
            Combo_albdomenv_Selectedvalue_set = httpContext.cgiGet( "COMBO_ALBDOMENV_Selectedvalue_set") ;
            Combo_albdomenv_Selectedvalue_get = httpContext.cgiGet( "COMBO_ALBDOMENV_Selectedvalue_get") ;
            Combo_albdomenv_Selectedtext_set = httpContext.cgiGet( "COMBO_ALBDOMENV_Selectedtext_set") ;
            Combo_albdomenv_Selectedtext_get = httpContext.cgiGet( "COMBO_ALBDOMENV_Selectedtext_get") ;
            Combo_albdomenv_Gamoauthtoken = httpContext.cgiGet( "COMBO_ALBDOMENV_Gamoauthtoken") ;
            Combo_albdomenv_Ddointernalname = httpContext.cgiGet( "COMBO_ALBDOMENV_Ddointernalname") ;
            Combo_albdomenv_Titlecontrolalign = httpContext.cgiGet( "COMBO_ALBDOMENV_Titlecontrolalign") ;
            Combo_albdomenv_Dropdownoptionstype = httpContext.cgiGet( "COMBO_ALBDOMENV_Dropdownoptionstype") ;
            Combo_albdomenv_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBDOMENV_Enabled")) ;
            Combo_albdomenv_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBDOMENV_Visible")) ;
            Combo_albdomenv_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_ALBDOMENV_Titlecontrolidtoreplace") ;
            Combo_albdomenv_Datalisttype = httpContext.cgiGet( "COMBO_ALBDOMENV_Datalisttype") ;
            Combo_albdomenv_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBDOMENV_Allowmultipleselection")) ;
            Combo_albdomenv_Datalistfixedvalues = httpContext.cgiGet( "COMBO_ALBDOMENV_Datalistfixedvalues") ;
            Combo_albdomenv_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBDOMENV_Isgriditem")) ;
            Combo_albdomenv_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBDOMENV_Hasdescription")) ;
            Combo_albdomenv_Datalistproc = httpContext.cgiGet( "COMBO_ALBDOMENV_Datalistproc") ;
            Combo_albdomenv_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_ALBDOMENV_Datalistprocparametersprefix") ;
            Combo_albdomenv_Remoteservicesparameters = httpContext.cgiGet( "COMBO_ALBDOMENV_Remoteservicesparameters") ;
            Combo_albdomenv_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_ALBDOMENV_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_albdomenv_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBDOMENV_Includeonlyselectedoption")) ;
            Combo_albdomenv_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBDOMENV_Includeselectalloption")) ;
            Combo_albdomenv_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBDOMENV_Emptyitem")) ;
            Combo_albdomenv_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBDOMENV_Includeaddnewoption")) ;
            Combo_albdomenv_Htmltemplate = httpContext.cgiGet( "COMBO_ALBDOMENV_Htmltemplate") ;
            Combo_albdomenv_Multiplevaluestype = httpContext.cgiGet( "COMBO_ALBDOMENV_Multiplevaluestype") ;
            Combo_albdomenv_Loadingdata = httpContext.cgiGet( "COMBO_ALBDOMENV_Loadingdata") ;
            Combo_albdomenv_Noresultsfound = httpContext.cgiGet( "COMBO_ALBDOMENV_Noresultsfound") ;
            Combo_albdomenv_Emptyitemtext = httpContext.cgiGet( "COMBO_ALBDOMENV_Emptyitemtext") ;
            Combo_albdomenv_Onlyselectedvalues = httpContext.cgiGet( "COMBO_ALBDOMENV_Onlyselectedvalues") ;
            Combo_albdomenv_Selectalltext = httpContext.cgiGet( "COMBO_ALBDOMENV_Selectalltext") ;
            Combo_albdomenv_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_ALBDOMENV_Multiplevaluesseparator") ;
            Combo_albdomenv_Addnewoptiontext = httpContext.cgiGet( "COMBO_ALBDOMENV_Addnewoptiontext") ;
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
            A14396AlbFecAnt = localUtil.ctod( httpContext.cgiGet( edtAlbFecAnt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14396AlbFecAnt", localUtil.format(A14396AlbFecAnt, "99/99/99"));
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
            A7098AlbUsu = httpContext.cgiGet( edtAlbUsu_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7098AlbUsu", A7098AlbUsu);
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
            A3868AlbMat = httpContext.cgiGet( edtAlbMat_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3868AlbMat", A3868AlbMat);
            A4023AlbFecSal = localUtil.ctod( httpContext.cgiGet( edtAlbFecSal_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4023AlbFecSal", localUtil.format(A4023AlbFecSal, "99/99/99"));
            A3865AlbHorSal = httpContext.cgiGet( edtAlbHorSal_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3865AlbHorSal", A3865AlbHorSal);
            cmbavAlbpropri.setValue( httpContext.cgiGet( cmbavAlbpropri.getInternalname()) );
            AV17AlbProPri = httpContext.cgiGet( cmbavAlbpropri.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17AlbProPri", AV17AlbProPri);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROPRI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17AlbProPri, "9"))));
            AV21ContCod = GXutil.upper( httpContext.cgiGet( edtavContcod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21ContCod", AV21ContCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV21ContCod, "@!"))));
            A14252AlbLineasA = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbLineasA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14252AlbLineasA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14252AlbLineasA), 4, 0));
            cmbAlbEnvFtp.setValue( httpContext.cgiGet( cmbAlbEnvFtp.getInternalname()) );
            A5805AlbEnvFtp = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbEnvFtp.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBENVFTP", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A5805AlbEnvFtp), "9")));
            A7101AlbLic = httpContext.cgiGet( edtAlbLic_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7101AlbLic", A7101AlbLic);
            cmbAlbProAT.setValue( httpContext.cgiGet( cmbAlbProAT.getInternalname()) );
            A10765AlbProAT = httpContext.cgiGet( cmbAlbProAT.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10765AlbProAT", A10765AlbProAT);
            A10019AlbHhfm = localUtil.ctot( httpContext.cgiGet( edtAlbHhfm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10019AlbHhfm", localUtil.ttoc( A10019AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            A14069AlbPdATCUD = httpContext.cgiGet( edtAlbPdATCUD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14069AlbPdATCUD", A14069AlbPdATCUD);
            A14362Firma4dig = httpContext.cgiGet( edtFirma4dig_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14362Firma4dig", A14362Firma4dig);
            A10835AlbTrnNm = httpContext.cgiGet( edtAlbTrnNm_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10835AlbTrnNm", A10835AlbTrnNm);
            A10836AlbTrnDm = httpContext.cgiGet( edtAlbTrnDm_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10836AlbTrnDm", A10836AlbTrnDm);
            A10837AlbTrnNc = httpContext.cgiGet( edtAlbTrnNc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10837AlbTrnNc", A10837AlbTrnNc);
            AV54Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54Pgmname", AV54Pgmname);
            AV25ComboGuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( edtavComboguiremcli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25ComboGuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25ComboGuiRemCli), 6, 0));
            AV27ComboAlbCliDes = (int)(localUtil.ctol( httpContext.cgiGet( edtavComboalbclides_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27ComboAlbCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27ComboAlbCliDes), 6, 0));
            AV32ComboAlbDomEnv = (byte)(localUtil.ctol( httpContext.cgiGet( edtavComboalbdomenv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32ComboAlbDomEnv", GXutil.str( AV32ComboAlbDomEnv, 1, 0));
            AV30ComboTrnCod = (short)(localUtil.ctol( httpContext.cgiGet( edtavCombotrncod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30ComboTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30ComboTrnCod), 4, 0));
            A10020AlbGrossT = localUtil.ctond( httpContext.cgiGet( edtAlbGrossT_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10020AlbGrossT", GXutil.ltrimstr( A10020AlbGrossT, 13, 2));
            A2242AlbSec = GXutil.upper( httpContext.cgiGet( edtAlbSec_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2242AlbSec", A2242AlbSec);
            A39AlbProPri = httpContext.cgiGet( edtAlbProPri_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
            A33AlbProEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbProEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A33AlbProEst", GXutil.str( A33AlbProEst, 1, 0));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"DocumentodeTransporteProduccion_1");
            A5805AlbEnvFtp = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbEnvFtp.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBENVFTP", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A5805AlbEnvFtp), "9")));
            forbiddenHiddens.add("AlbEnvFtp", localUtil.format( DecimalUtil.doubleToDec(A5805AlbEnvFtp), "9"));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            A39AlbProPri = httpContext.cgiGet( edtAlbProPri_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
            forbiddenHiddens.add("AlbProPri", GXutil.rtrim( localUtil.format( A39AlbProPri, "9")));
            forbiddenHiddens.add("AlbDivTCod", GXutil.rtrim( localUtil.format( A3093AlbDivTCod, "")));
            forbiddenHiddens.add("GuiRemDom", localUtil.format( DecimalUtil.doubleToDec(A1258GuiRemDom), "9"));
            A2242AlbSec = httpContext.cgiGet( edtAlbSec_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2242AlbSec", A2242AlbSec);
            forbiddenHiddens.add("AlbSec", GXutil.rtrim( localUtil.format( A2242AlbSec, "@!")));
            AV54Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54Pgmname", AV54Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV54Pgmname, "")));
            A33AlbProEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbProEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A33AlbProEst", GXutil.str( A33AlbProEst, 1, 0));
            forbiddenHiddens.add("AlbProEst", localUtil.format( DecimalUtil.doubleToDec(A33AlbProEst), "9"));
            A4023AlbFecSal = localUtil.ctod( httpContext.cgiGet( edtAlbFecSal_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4023AlbFecSal", localUtil.format(A4023AlbFecSal, "99/99/99"));
            forbiddenHiddens.add("AlbFecSal", localUtil.format(A4023AlbFecSal, "99/99/99"));
            A3865AlbHorSal = httpContext.cgiGet( edtAlbHorSal_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3865AlbHorSal", A3865AlbHorSal);
            forbiddenHiddens.add("AlbHorSal", GXutil.rtrim( localUtil.format( A3865AlbHorSal, "")));
            A7098AlbUsu = httpContext.cgiGet( edtAlbUsu_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7098AlbUsu", A7098AlbUsu);
            forbiddenHiddens.add("AlbUsu", GXutil.rtrim( localUtil.format( A7098AlbUsu, "")));
            A7101AlbLic = httpContext.cgiGet( edtAlbLic_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7101AlbLic", A7101AlbLic);
            forbiddenHiddens.add("AlbLic", GXutil.rtrim( localUtil.format( A7101AlbLic, "")));
            A10765AlbProAT = httpContext.cgiGet( cmbAlbProAT.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10765AlbProAT", A10765AlbProAT);
            forbiddenHiddens.add("AlbProAT", GXutil.rtrim( localUtil.format( A10765AlbProAT, "")));
            A10019AlbHhfm = localUtil.ctot( httpContext.cgiGet( edtAlbHhfm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10019AlbHhfm", localUtil.ttoc( A10019AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            forbiddenHiddens.add("AlbHhfm", localUtil.format( A10019AlbHhfm, "99/99/99 99:99"));
            A10020AlbGrossT = localUtil.ctond( httpContext.cgiGet( edtAlbGrossT_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10020AlbGrossT", GXutil.ltrimstr( A10020AlbGrossT, 13, 2));
            forbiddenHiddens.add("AlbGrossT", localUtil.format( A10020AlbGrossT, "ZZZZZZZZZ9.99"));
            forbiddenHiddens.add("AlbFmd", GXutil.rtrim( localUtil.format( A10017AlbFmd, "")));
            forbiddenHiddens.add("ALbFmdc", GXutil.rtrim( localUtil.format( A10018ALbFmdc, "")));
            forbiddenHiddens.add("AlbMarca", GXutil.rtrim( localUtil.format( A5140AlbMarca, "")));
            forbiddenHiddens.add("AlbLocDes", localUtil.format( DecimalUtil.doubleToDec(A3867AlbLocDes), "9"));
            forbiddenHiddens.add("AlbLocCar", localUtil.format( DecimalUtil.doubleToDec(A3866AlbLocCar), "9"));
            forbiddenHiddens.add("AlbPObsCon", localUtil.format( DecimalUtil.doubleToDec(A914AlbPObsCon), "Z9"));
            forbiddenHiddens.add("AlbIvaCod", GXutil.rtrim( localUtil.format( A5141AlbIvaCod, "@!")));
            forbiddenHiddens.add("AlbColCa", GXutil.rtrim( localUtil.format( A7987AlbColCa, "")));
            forbiddenHiddens.add("AlbDesp", localUtil.format( DecimalUtil.doubleToDec(A7162AlbDesp), "ZZZZZ9"));
            forbiddenHiddens.add("AlbCambio", localUtil.format( A7986AlbCambio, "Z9.9999"));
            forbiddenHiddens.add("AlbTipDoc", localUtil.format( DecimalUtil.doubleToDec(A7985AlbTipDoc), "ZZZZZZZ9"));
            forbiddenHiddens.add("AlbMotTr", GXutil.rtrim( localUtil.format( A7984AlbMotTr, "")));
            forbiddenHiddens.add("AlbTipCal", localUtil.format( DecimalUtil.doubleToDec(A5803AlbTipCal), "9"));
            forbiddenHiddens.add("AlbObsCb", GXutil.rtrim( localUtil.format( A7988AlbObsCb, "")));
            forbiddenHiddens.add("AlbNumT", localUtil.format( DecimalUtil.doubleToDec(A7102AlbNumT), "ZZZZZZZZZ9"));
            forbiddenHiddens.add("AlbMarCo", GXutil.rtrim( localUtil.format( A7100AlbMarCo, "")));
            forbiddenHiddens.add("AlbOComp", GXutil.rtrim( localUtil.format( A7099AlbOComp, "")));
            forbiddenHiddens.add("AlbEnvMail", localUtil.format( A14404AlbEnvMail, "99/99/99 99:99"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A30AlbProCod != Z30AlbProCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("documentotransporteproduccion\\documentodetransporteproduccion_1:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               getEqualNoModal( ) ;
               if ( ! (0==AV8AlbProCod) )
               {
                  A30AlbProCod = AV8AlbProCod ;
                  httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
               }
               else
               {
                  if ( ! isIns( )  )
                  {
                     A30AlbProCod = AV8AlbProCod ;
                     httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
                  }
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
                  if ( ! (0==AV8AlbProCod) )
                  {
                     A30AlbProCod = AV8AlbProCod ;
                     httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
                  }
                  else
                  {
                     if ( ! isIns( )  )
                     {
                        A30AlbProCod = AV8AlbProCod ;
                        httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
                     }
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
                        confirm_1U60( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "ALBPROCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbProCod_Internalname ;
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
                     if ( GXutil.strcmp(sEvt, "COMBO_GUIREMCLI.ONOPTIONCLICKED") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        e121U62 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e111U62 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e131U62 ();
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
         e131U62 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1U63( ) ;
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
         disableAttributes1U63( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbpropri.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavAlbpropri.getEnabled(), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavContcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavContcod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavComboguiremcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboguiremcli_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavComboalbclides_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboalbclides_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavComboalbdomenv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboalbdomenv_Enabled), 5, 0), true);
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

   public void confirm_1U60( )
   {
      beforeValidate1U63( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1U63( ) ;
         }
         else
         {
            checkExtendedTable1U63( ) ;
            closeExtendedTableCursors1U63( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1U60( )
   {
   }

   public void e111U62( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV18Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      documentodetransporteproduccion_1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Station", AV18Station);
      GXv_char2[0] = AV7EmprCod ;
      GXv_char3[0] = AV19EmprNom ;
      GXv_char4[0] = AV20UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char2, GXv_char3, GXv_char4) ;
      documentodetransporteproduccion_1_impl.this.AV7EmprCod = GXv_char2[0] ;
      documentodetransporteproduccion_1_impl.this.AV19EmprNom = GXv_char3[0] ;
      documentodetransporteproduccion_1_impl.this.AV20UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV19EmprNom", AV19EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV20UsurCod", AV20UsurCod);
      GXv_SdtWWPContext5[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV9WWPContext = GXv_SdtWWPContext5[0] ;
      edtTrnCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Visible), 5, 0), true);
      AV30ComboTrnCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30ComboTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30ComboTrnCod), 4, 0));
      edtavCombotrncod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombotrncod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombotrncod_Visible), 5, 0), true);
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = AV33DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] ;
      AV33DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      edtAlbDomEnv_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDomEnv_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDomEnv_Visible), 5, 0), true);
      AV32ComboAlbDomEnv = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32ComboAlbDomEnv", GXutil.str( AV32ComboAlbDomEnv, 1, 0));
      edtavComboalbdomenv_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboalbdomenv_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboalbdomenv_Visible), 5, 0), true);
      edtAlbCliDes_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbCliDes_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCliDes_Visible), 5, 0), true);
      AV27ComboAlbCliDes = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27ComboAlbCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27ComboAlbCliDes), 6, 0));
      edtavComboalbclides_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboalbclides_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboalbclides_Visible), 5, 0), true);
      edtGuiRemCli_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiRemCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemCli_Visible), 5, 0), true);
      AV25ComboGuiRemCli = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25ComboGuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25ComboGuiRemCli), 6, 0));
      edtavComboguiremcli_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboguiremcli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboguiremcli_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOGUIREMCLI' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADCOMBOALBCLIDES' */
      S122 ();
      if ( returnInSub )
      {
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADCOMBOALBDOMENV' */
      S132 ();
      if ( returnInSub )
      {
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADCOMBOTRNCOD' */
      S142 ();
      if ( returnInSub )
      {
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S152 ();
      if ( returnInSub )
      {
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV10TrnContext.fromxml(AV11WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV10TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV54Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV56GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV56GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56GXV1), 8, 0));
         while ( AV56GXV1 <= AV10TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV16TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV10TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV56GXV1));
            if ( GXutil.strcmp(AV16TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "GuiRemCli") == 0 )
            {
               AV12Insert_GuiRemCli = (int)(GXutil.lval( AV16TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12Insert_GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12Insert_GuiRemCli), 6, 0));
               if ( ! (0==AV12Insert_GuiRemCli) )
               {
                  AV25ComboGuiRemCli = AV12Insert_GuiRemCli ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV25ComboGuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25ComboGuiRemCli), 6, 0));
                  Combo_guiremcli_Selectedvalue_set = GXutil.trim( GXutil.str( AV25ComboGuiRemCli, 6, 0)) ;
                  ucCombo_guiremcli.sendProperty(context, "", false, Combo_guiremcli_Internalname, "SelectedValue_set", Combo_guiremcli_Selectedvalue_set);
                  Combo_guiremcli_Enabled = false ;
                  ucCombo_guiremcli.sendProperty(context, "", false, Combo_guiremcli_Internalname, "Enabled", GXutil.booltostr( Combo_guiremcli_Enabled));
               }
            }
            else if ( GXutil.strcmp(AV16TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "TrnCod") == 0 )
            {
               AV13Insert_TrnCod = (short)(GXutil.lval( AV16TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13Insert_TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13Insert_TrnCod), 4, 0));
               if ( ! (0==AV13Insert_TrnCod) )
               {
                  AV30ComboTrnCod = AV13Insert_TrnCod ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV30ComboTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30ComboTrnCod), 4, 0));
                  Combo_trncod_Selectedvalue_set = GXutil.trim( GXutil.str( AV30ComboTrnCod, 4, 0)) ;
                  ucCombo_trncod.sendProperty(context, "", false, Combo_trncod_Internalname, "SelectedValue_set", Combo_trncod_Selectedvalue_set);
                  Combo_trncod_Enabled = false ;
                  ucCombo_trncod.sendProperty(context, "", false, Combo_trncod_Internalname, "Enabled", GXutil.booltostr( Combo_trncod_Enabled));
               }
            }
            else if ( GXutil.strcmp(AV16TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "AlbDivCod") == 0 )
            {
               AV14Insert_AlbDivCod = (byte)(GXutil.lval( AV16TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14Insert_AlbDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14Insert_AlbDivCod), 2, 0));
            }
            else if ( GXutil.strcmp(AV16TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "EmprGuiRem") == 0 )
            {
               AV15Insert_EmprGuiRem = AV16TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15Insert_EmprGuiRem", AV15Insert_EmprGuiRem);
            }
            AV56GXV1 = (int)(AV56GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56GXV1), 8, 0));
         }
      }
      edtAlbGrossT_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbGrossT_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbGrossT_Visible), 5, 0), true);
      edtAlbSec_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbSec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbSec_Visible), 5, 0), true);
      edtAlbProPri_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProPri_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProPri_Visible), 5, 0), true);
      edtAlbProEst_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProEst_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProEst_Visible), 5, 0), true);
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         GXt_int8 = AV37Tmp_CliCod ;
         GXv_int9[0] = GXt_int8 ;
         new app.documentotransporteproduccion.documentodetransporteproduccion_obtenerclicod(remoteHandle, context).execute( AV7EmprCod, AV8AlbProCod, GXv_int9) ;
         documentodetransporteproduccion_1_impl.this.GXt_int8 = GXv_int9[0] ;
         AV37Tmp_CliCod = GXt_int8 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37Tmp_CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37Tmp_CliCod), 6, 0));
         AV11WebSession.setValue("&ComboGuiRemCli", GXutil.str( AV37Tmp_CliCod, 6, 0));
         /* Execute user subroutine: 'LOADCOMBOALBDOMENV' */
         S132 ();
         if ( returnInSub )
         {
            pr_default.close(7);
            pr_default.close(6);
            pr_default.close(5);
            pr_default.close(3);
            pr_default.close(2);
            pr_default.close(1);
            returnInSub = true;
            if (true) return;
         }
      }
      GXt_int10 = (byte)(AV49Moda21) ;
      GXv_int11[0] = GXt_int10 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int11) ;
      documentodetransporteproduccion_1_impl.this.GXt_int10 = GXv_int11[0] ;
      AV49Moda21 = GXt_int10 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49Moda21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV49Moda21), "ZZZ9")));
   }

   public void e131U62( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      AV11WebSession.remove("&ComboGuiRemCli");
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) || ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) )
      {
         AV48CliFacMtsP = "N" ;
         if ( AV49Moda21 == 1 )
         {
            GXv_char4[0] = AV7EmprCod ;
            GXv_int9[0] = A1243GuiRemCli ;
            GXv_char3[0] = AV48CliFacMtsP ;
            new app.pclimtspl(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_char3) ;
            documentodetransporteproduccion_1_impl.this.AV7EmprCod = GXv_char4[0] ;
            documentodetransporteproduccion_1_impl.this.A1243GuiRemCli = GXv_int9[0] ;
            documentodetransporteproduccion_1_impl.this.AV48CliFacMtsP = GXv_char3[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
            httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
         }
         httpContext.popup(formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_40", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(A1243GuiRemCli,6,0)),GXutil.URLEncode(GXutil.rtrim(A1244GuiRemCln)),GXutil.URLEncode(GXutil.formatDateParm(A34AlbProfch)),GXutil.URLEncode(GXutil.rtrim(A2242AlbSec)),GXutil.URLEncode(GXutil.rtrim(A39AlbProPri)),GXutil.URLEncode(GXutil.ltrimstr(A5805AlbEnvFtp,1,0)),GXutil.URLEncode(GXutil.rtrim(A7101AlbLic)),GXutil.URLEncode(GXutil.formatDateTimeParm(A10019AlbHhfm)),GXutil.URLEncode(GXutil.ltrimstr(A33AlbProEst,1,0)),GXutil.URLEncode(GXutil.rtrim(A5140AlbMarca)),GXutil.URLEncode(GXutil.rtrim(AV47Hash)),GXutil.URLEncode(GXutil.booltostr(AV44ok)),GXutil.URLEncode(GXutil.rtrim(AV45Messages_json)),GXutil.URLEncode(GXutil.rtrim(AV48CliFacMtsP))}, new String[] {"EmprCod","AlbProCod","Guiremcli","GuiRemCln","AlbProFch","AlbSec","AlbProPri","AlbEnvFtp","AlbLic","AlbHhfm","AlbProEst","AlbMarca","Hash","ok","Messages_json","CliFacMtsP"}) , new Object[] {});
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(7);
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   public void e121U62( )
   {
      /* Combo_guiremcli_Onoptionclicked Routine */
      returnInSub = false ;
      AV25ComboGuiRemCli = (int)(GXutil.lval( Combo_guiremcli_Selectedvalue_get)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25ComboGuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25ComboGuiRemCli), 6, 0));
      AV11WebSession.setValue("&ComboGuiRemCli", GXutil.trim( GXutil.str( AV25ComboGuiRemCli, 6, 0)));
      AV27ComboAlbCliDes = AV25ComboGuiRemCli ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27ComboAlbCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27ComboAlbCliDes), 6, 0));
      Combo_albclides_Selectedvalue_set = GXutil.trim( GXutil.str( AV27ComboAlbCliDes, 6, 0)) ;
      ucCombo_albclides.sendProperty(context, "", false, Combo_albclides_Internalname, "SelectedValue_set", Combo_albclides_Selectedvalue_set);
      /* Execute user subroutine: 'LOADCOMBOALBDOMENV' */
      S132 ();
      if ( returnInSub )
      {
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31AlbDomEnv_Data", AV31AlbDomEnv_Data);
   }

   public void S152( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      divDvpanel_unnamedtable8_cell_Class = "col-xs-12 CellMarginTop" ;
      httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable8_cell_Internalname, "Class", divDvpanel_unnamedtable8_cell_Class, true);
   }

   public void S142( )
   {
      /* 'LOADCOMBOTRNCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item12 = AV29TrnCod_Data ;
      GXv_char4[0] = AV24ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item13[0] = GXt_objcol_SdtDVB_SDTComboData_Item12 ;
      new app.documentotransporteproduccion.documentodetransporteproduccion_1loaddvcombo(remoteHandle, context).execute( "TrnCod", Gx_mode, AV7EmprCod, AV8AlbProCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item13) ;
      documentodetransporteproduccion_1_impl.this.AV24ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item12 = GXv_objcol_SdtDVB_SDTComboData_Item13[0] ;
      AV29TrnCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item12 ;
      Combo_trncod_Selectedvalue_set = AV24ComboSelectedValue ;
      ucCombo_trncod.sendProperty(context, "", false, Combo_trncod_Internalname, "SelectedValue_set", Combo_trncod_Selectedvalue_set);
      AV30ComboTrnCod = (short)(GXutil.lval( AV24ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30ComboTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30ComboTrnCod), 4, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_trncod_Enabled = false ;
         ucCombo_trncod.sendProperty(context, "", false, Combo_trncod_Internalname, "Enabled", GXutil.booltostr( Combo_trncod_Enabled));
      }
   }

   public void S132( )
   {
      /* 'LOADCOMBOALBDOMENV' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item12 = AV31AlbDomEnv_Data ;
      GXv_char4[0] = AV24ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item13[0] = GXt_objcol_SdtDVB_SDTComboData_Item12 ;
      new app.documentotransporteproduccion.documentodetransporteproduccion_1loaddvcombo(remoteHandle, context).execute( "AlbDomEnv", Gx_mode, AV7EmprCod, AV8AlbProCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item13) ;
      documentodetransporteproduccion_1_impl.this.AV24ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item12 = GXv_objcol_SdtDVB_SDTComboData_Item13[0] ;
      AV31AlbDomEnv_Data = GXt_objcol_SdtDVB_SDTComboData_Item12 ;
      Combo_albdomenv_Selectedvalue_set = AV24ComboSelectedValue ;
      ucCombo_albdomenv.sendProperty(context, "", false, Combo_albdomenv_Internalname, "SelectedValue_set", Combo_albdomenv_Selectedvalue_set);
      AV32ComboAlbDomEnv = (byte)(GXutil.lval( AV24ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32ComboAlbDomEnv", GXutil.str( AV32ComboAlbDomEnv, 1, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_albdomenv_Enabled = false ;
         ucCombo_albdomenv.sendProperty(context, "", false, Combo_albdomenv_Internalname, "Enabled", GXutil.booltostr( Combo_albdomenv_Enabled));
      }
   }

   public void S122( )
   {
      /* 'LOADCOMBOALBCLIDES' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item12 = AV26AlbCliDes_Data ;
      GXv_char4[0] = AV24ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item13[0] = GXt_objcol_SdtDVB_SDTComboData_Item12 ;
      new app.documentotransporteproduccion.documentodetransporteproduccion_1loaddvcombo(remoteHandle, context).execute( "AlbCliDes", Gx_mode, AV7EmprCod, AV8AlbProCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item13) ;
      documentodetransporteproduccion_1_impl.this.AV24ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item12 = GXv_objcol_SdtDVB_SDTComboData_Item13[0] ;
      AV26AlbCliDes_Data = GXt_objcol_SdtDVB_SDTComboData_Item12 ;
      Combo_albclides_Selectedvalue_set = AV24ComboSelectedValue ;
      ucCombo_albclides.sendProperty(context, "", false, Combo_albclides_Internalname, "SelectedValue_set", Combo_albclides_Selectedvalue_set);
      AV27ComboAlbCliDes = (int)(GXutil.lval( AV24ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27ComboAlbCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27ComboAlbCliDes), 6, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_albclides_Enabled = false ;
         ucCombo_albclides.sendProperty(context, "", false, Combo_albclides_Internalname, "Enabled", GXutil.booltostr( Combo_albclides_Enabled));
      }
   }

   public void S112( )
   {
      /* 'LOADCOMBOGUIREMCLI' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item12 = AV23GuiRemCli_Data ;
      GXv_char4[0] = AV24ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item13[0] = GXt_objcol_SdtDVB_SDTComboData_Item12 ;
      new app.documentotransporteproduccion.documentodetransporteproduccion_1loaddvcombo(remoteHandle, context).execute( "GuiRemCli", Gx_mode, AV7EmprCod, AV8AlbProCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item13) ;
      documentodetransporteproduccion_1_impl.this.AV24ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item12 = GXv_objcol_SdtDVB_SDTComboData_Item13[0] ;
      AV23GuiRemCli_Data = GXt_objcol_SdtDVB_SDTComboData_Item12 ;
      Combo_guiremcli_Selectedvalue_set = AV24ComboSelectedValue ;
      ucCombo_guiremcli.sendProperty(context, "", false, Combo_guiremcli_Internalname, "SelectedValue_set", Combo_guiremcli_Selectedvalue_set);
      AV25ComboGuiRemCli = (int)(GXutil.lval( AV24ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25ComboGuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25ComboGuiRemCli), 6, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_guiremcli_Enabled = false ;
         ucCombo_guiremcli.sendProperty(context, "", false, Combo_guiremcli_Internalname, "Enabled", GXutil.booltostr( Combo_guiremcli_Enabled));
      }
   }

   public void zm1U63( int GX_JID )
   {
      if ( ( GX_JID == 55 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1259AlbDomEnv = T01U63_A1259AlbDomEnv[0] ;
            Z3869AlbCliDes = T01U63_A3869AlbCliDes[0] ;
            Z39AlbProPri = T01U63_A39AlbProPri[0] ;
            Z3093AlbDivTCod = T01U63_A3093AlbDivTCod[0] ;
            Z1258GuiRemDom = T01U63_A1258GuiRemDom[0] ;
            Z2242AlbSec = T01U63_A2242AlbSec[0] ;
            Z33AlbProEst = T01U63_A33AlbProEst[0] ;
            Z34AlbProfch = T01U63_A34AlbProfch[0] ;
            Z4023AlbFecSal = T01U63_A4023AlbFecSal[0] ;
            Z3865AlbHorSal = T01U63_A3865AlbHorSal[0] ;
            Z7098AlbUsu = T01U63_A7098AlbUsu[0] ;
            Z3868AlbMat = T01U63_A3868AlbMat[0] ;
            Z5805AlbEnvFtp = T01U63_A5805AlbEnvFtp[0] ;
            Z7101AlbLic = T01U63_A7101AlbLic[0] ;
            Z10765AlbProAT = T01U63_A10765AlbProAT[0] ;
            Z10019AlbHhfm = T01U63_A10019AlbHhfm[0] ;
            Z10020AlbGrossT = T01U63_A10020AlbGrossT[0] ;
            Z10837AlbTrnNc = T01U63_A10837AlbTrnNc[0] ;
            Z10017AlbFmd = T01U63_A10017AlbFmd[0] ;
            Z10835AlbTrnNm = T01U63_A10835AlbTrnNm[0] ;
            Z10018ALbFmdc = T01U63_A10018ALbFmdc[0] ;
            Z10836AlbTrnDm = T01U63_A10836AlbTrnDm[0] ;
            Z5140AlbMarca = T01U63_A5140AlbMarca[0] ;
            Z3867AlbLocDes = T01U63_A3867AlbLocDes[0] ;
            Z3866AlbLocCar = T01U63_A3866AlbLocCar[0] ;
            Z914AlbPObsCon = T01U63_A914AlbPObsCon[0] ;
            Z5141AlbIvaCod = T01U63_A5141AlbIvaCod[0] ;
            Z7987AlbColCa = T01U63_A7987AlbColCa[0] ;
            Z7162AlbDesp = T01U63_A7162AlbDesp[0] ;
            Z7986AlbCambio = T01U63_A7986AlbCambio[0] ;
            Z7985AlbTipDoc = T01U63_A7985AlbTipDoc[0] ;
            Z7984AlbMotTr = T01U63_A7984AlbMotTr[0] ;
            Z5803AlbTipCal = T01U63_A5803AlbTipCal[0] ;
            Z7988AlbObsCb = T01U63_A7988AlbObsCb[0] ;
            Z7102AlbNumT = T01U63_A7102AlbNumT[0] ;
            Z7100AlbMarCo = T01U63_A7100AlbMarCo[0] ;
            Z7099AlbOComp = T01U63_A7099AlbOComp[0] ;
            Z14074AlbPdTipAT = T01U63_A14074AlbPdTipAT[0] ;
            Z14073AlbPdSerAT = T01U63_A14073AlbPdSerAT[0] ;
            Z14069AlbPdATCUD = T01U63_A14069AlbPdATCUD[0] ;
            Z14404AlbEnvMail = T01U63_A14404AlbEnvMail[0] ;
            Z1253EmprGuiRem = T01U63_A1253EmprGuiRem[0] ;
            Z1243GuiRemCli = T01U63_A1243GuiRemCli[0] ;
            Z840TrnCod = T01U63_A840TrnCod[0] ;
            Z3108AlbDivCod = T01U63_A3108AlbDivCod[0] ;
         }
         else
         {
            Z1259AlbDomEnv = A1259AlbDomEnv ;
            Z3869AlbCliDes = A3869AlbCliDes ;
            Z39AlbProPri = A39AlbProPri ;
            Z3093AlbDivTCod = A3093AlbDivTCod ;
            Z1258GuiRemDom = A1258GuiRemDom ;
            Z2242AlbSec = A2242AlbSec ;
            Z33AlbProEst = A33AlbProEst ;
            Z34AlbProfch = A34AlbProfch ;
            Z4023AlbFecSal = A4023AlbFecSal ;
            Z3865AlbHorSal = A3865AlbHorSal ;
            Z7098AlbUsu = A7098AlbUsu ;
            Z3868AlbMat = A3868AlbMat ;
            Z5805AlbEnvFtp = A5805AlbEnvFtp ;
            Z7101AlbLic = A7101AlbLic ;
            Z10765AlbProAT = A10765AlbProAT ;
            Z10019AlbHhfm = A10019AlbHhfm ;
            Z10020AlbGrossT = A10020AlbGrossT ;
            Z10837AlbTrnNc = A10837AlbTrnNc ;
            Z10017AlbFmd = A10017AlbFmd ;
            Z10835AlbTrnNm = A10835AlbTrnNm ;
            Z10018ALbFmdc = A10018ALbFmdc ;
            Z10836AlbTrnDm = A10836AlbTrnDm ;
            Z5140AlbMarca = A5140AlbMarca ;
            Z3867AlbLocDes = A3867AlbLocDes ;
            Z3866AlbLocCar = A3866AlbLocCar ;
            Z914AlbPObsCon = A914AlbPObsCon ;
            Z5141AlbIvaCod = A5141AlbIvaCod ;
            Z7987AlbColCa = A7987AlbColCa ;
            Z7162AlbDesp = A7162AlbDesp ;
            Z7986AlbCambio = A7986AlbCambio ;
            Z7985AlbTipDoc = A7985AlbTipDoc ;
            Z7984AlbMotTr = A7984AlbMotTr ;
            Z5803AlbTipCal = A5803AlbTipCal ;
            Z7988AlbObsCb = A7988AlbObsCb ;
            Z7102AlbNumT = A7102AlbNumT ;
            Z7100AlbMarCo = A7100AlbMarCo ;
            Z7099AlbOComp = A7099AlbOComp ;
            Z14074AlbPdTipAT = A14074AlbPdTipAT ;
            Z14073AlbPdSerAT = A14073AlbPdSerAT ;
            Z14069AlbPdATCUD = A14069AlbPdATCUD ;
            Z14404AlbEnvMail = A14404AlbEnvMail ;
            Z1253EmprGuiRem = A1253EmprGuiRem ;
            Z1243GuiRemCli = A1243GuiRemCli ;
            Z840TrnCod = A840TrnCod ;
            Z3108AlbDivCod = A3108AlbDivCod ;
         }
      }
      if ( GX_JID == -55 )
      {
         Z30AlbProCod = A30AlbProCod ;
         Z1259AlbDomEnv = A1259AlbDomEnv ;
         Z3869AlbCliDes = A3869AlbCliDes ;
         Z39AlbProPri = A39AlbProPri ;
         Z3093AlbDivTCod = A3093AlbDivTCod ;
         Z1258GuiRemDom = A1258GuiRemDom ;
         Z2242AlbSec = A2242AlbSec ;
         Z33AlbProEst = A33AlbProEst ;
         Z34AlbProfch = A34AlbProfch ;
         Z4023AlbFecSal = A4023AlbFecSal ;
         Z3865AlbHorSal = A3865AlbHorSal ;
         Z7098AlbUsu = A7098AlbUsu ;
         Z3868AlbMat = A3868AlbMat ;
         Z5805AlbEnvFtp = A5805AlbEnvFtp ;
         Z7101AlbLic = A7101AlbLic ;
         Z10765AlbProAT = A10765AlbProAT ;
         Z10019AlbHhfm = A10019AlbHhfm ;
         Z10020AlbGrossT = A10020AlbGrossT ;
         Z10837AlbTrnNc = A10837AlbTrnNc ;
         Z10017AlbFmd = A10017AlbFmd ;
         Z10835AlbTrnNm = A10835AlbTrnNm ;
         Z10018ALbFmdc = A10018ALbFmdc ;
         Z10836AlbTrnDm = A10836AlbTrnDm ;
         Z5140AlbMarca = A5140AlbMarca ;
         Z3867AlbLocDes = A3867AlbLocDes ;
         Z3866AlbLocCar = A3866AlbLocCar ;
         Z914AlbPObsCon = A914AlbPObsCon ;
         Z5141AlbIvaCod = A5141AlbIvaCod ;
         Z7987AlbColCa = A7987AlbColCa ;
         Z7162AlbDesp = A7162AlbDesp ;
         Z7986AlbCambio = A7986AlbCambio ;
         Z7985AlbTipDoc = A7985AlbTipDoc ;
         Z7984AlbMotTr = A7984AlbMotTr ;
         Z5803AlbTipCal = A5803AlbTipCal ;
         Z7988AlbObsCb = A7988AlbObsCb ;
         Z7102AlbNumT = A7102AlbNumT ;
         Z7100AlbMarCo = A7100AlbMarCo ;
         Z7099AlbOComp = A7099AlbOComp ;
         Z14074AlbPdTipAT = A14074AlbPdTipAT ;
         Z14073AlbPdSerAT = A14073AlbPdSerAT ;
         Z14069AlbPdATCUD = A14069AlbPdATCUD ;
         Z14404AlbEnvMail = A14404AlbEnvMail ;
         Z1253EmprGuiRem = A1253EmprGuiRem ;
         Z1243GuiRemCli = A1243GuiRemCli ;
         Z396EmprCod = A396EmprCod ;
         Z840TrnCod = A840TrnCod ;
         Z3108AlbDivCod = A3108AlbDivCod ;
         Z3109AlbDivAbr = A3109AlbDivAbr ;
         Z407EmprNom = A407EmprNom ;
         Z1244GuiRemCln = A1244GuiRemCln ;
         Z3145GuiRemDivT = A3145GuiRemDivT ;
         Z3110GuiRemDiv = A3110GuiRemDiv ;
         Z1260BusDomEnv = A1260BusDomEnv ;
      }
   }

   public void standaloneNotModal( )
   {
      cmbAlbEnvFtp.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbEnvFtp.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbEnvFtp.getEnabled(), 5, 0), true);
      edtAlbLic_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbLic_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbLic_Enabled), 5, 0), true);
      cmbAlbProAT.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProAT.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbProAT.getEnabled(), 5, 0), true);
      edtAlbHhfm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHhfm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHhfm_Enabled), 5, 0), true);
      edtAlbGrossT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbGrossT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbGrossT_Enabled), 5, 0), true);
      edtAlbPdATCUD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPdATCUD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPdATCUD_Enabled), 5, 0), true);
      edtFirma4dig_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFirma4dig_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFirma4dig_Enabled), 5, 0), true);
      edtAlbFecSal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbFecSal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbFecSal_Enabled), 5, 0), true);
      edtAlbHorSal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHorSal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHorSal_Enabled), 5, 0), true);
      edtAlbUsu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbUsu_Enabled), 5, 0), true);
      edtAlbSec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbSec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbSec_Enabled), 5, 0), true);
      edtAlbProEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProEst_Enabled), 5, 0), true);
      edtAlbProPri_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProPri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProPri_Enabled), 5, 0), true);
      AV55Pgmdesc = httpContext.getMessage( "Documento de Transporte Produccion", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55Pgmdesc", AV55Pgmdesc);
      AV54Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54Pgmname", AV54Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      cmbAlbEnvFtp.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbEnvFtp.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbEnvFtp.getEnabled(), 5, 0), true);
      edtAlbLic_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbLic_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbLic_Enabled), 5, 0), true);
      cmbAlbProAT.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProAT.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbProAT.getEnabled(), 5, 0), true);
      edtAlbHhfm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHhfm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHhfm_Enabled), 5, 0), true);
      edtAlbGrossT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbGrossT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbGrossT_Enabled), 5, 0), true);
      edtAlbPdATCUD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPdATCUD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPdATCUD_Enabled), 5, 0), true);
      edtFirma4dig_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFirma4dig_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFirma4dig_Enabled), 5, 0), true);
      edtAlbFecSal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbFecSal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbFecSal_Enabled), 5, 0), true);
      edtAlbHorSal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHorSal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHorSal_Enabled), 5, 0), true);
      edtAlbUsu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbUsu_Enabled), 5, 0), true);
      edtAlbSec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbSec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbSec_Enabled), 5, 0), true);
      edtAlbProEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProEst_Enabled), 5, 0), true);
      edtAlbProPri_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProPri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProPri_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         A396EmprCod = AV7EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01U65 */
      pr_default.execute(3, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01U65_A407EmprNom[0] ;
      n407EmprNom = T01U65_n407EmprNom[0] ;
      pr_default.close(3);
      GXt_int10 = (byte)(0) ;
      GXv_int11[0] = GXt_int10 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( httpContext.getMessage( "ERFOC", ""), ""), GXv_int11) ;
      documentodetransporteproduccion_1_impl.this.GXt_int10 = GXv_int11[0] ;
      if ( ! ( ( GXt_int10 == 1 ) ) )
      {
         divDvpanel_unnamedtable8_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable8_cell_Internalname, "Class", divDvpanel_unnamedtable8_cell_Class, true);
      }
      else
      {
         GXt_int10 = (byte)(0) ;
         GXv_int11[0] = GXt_int10 ;
         new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( httpContext.getMessage( "ERFOC", ""), ""), GXv_int11) ;
         documentodetransporteproduccion_1_impl.this.GXt_int10 = GXv_int11[0] ;
         if ( GXt_int10 == 1 )
         {
            divDvpanel_unnamedtable8_cell_Class = httpContext.getMessage( "col-xs-12 CellMarginTop", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable8_cell_Internalname, "Class", divDvpanel_unnamedtable8_cell_Class, true);
         }
      }
      if ( ! (0==AV8AlbProCod) )
      {
         edtAlbProCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV12Insert_GuiRemCli) )
      {
         edtGuiRemCli_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtGuiRemCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemCli_Enabled), 5, 0), true);
      }
      else
      {
         edtGuiRemCli_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtGuiRemCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemCli_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV13Insert_TrnCod) )
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
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         A3093AlbDivTCod = httpContext.getMessage( "E", "") ;
         n3093AlbDivTCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3093AlbDivTCod", A3093AlbDivTCod);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         A1258GuiRemDom = (byte)(0) ;
         n1258GuiRemDom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1258GuiRemDom", GXutil.str( A1258GuiRemDom, 1, 0));
      }
      if ( isUpd( )  || isDlt( )  || isIns( )  )
      {
         edtAlbProCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV14Insert_AlbDivCod) )
      {
         A3108AlbDivCod = AV14Insert_AlbDivCod ;
         n3108AlbDivCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3108AlbDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3108AlbDivCod), 2, 0));
      }
      else
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            A3108AlbDivCod = (byte)(2) ;
            n3108AlbDivCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3108AlbDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3108AlbDivCod), 2, 0));
         }
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV12Insert_GuiRemCli) )
      {
         A1243GuiRemCli = AV12Insert_GuiRemCli ;
         httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
      }
      else
      {
         A1243GuiRemCli = AV25ComboGuiRemCli ;
         httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
      }
      A1259AlbDomEnv = AV32ComboAlbDomEnv ;
      n1259AlbDomEnv = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1259AlbDomEnv", GXutil.str( A1259AlbDomEnv, 1, 0));
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV13Insert_TrnCod) )
      {
         A840TrnCod = AV13Insert_TrnCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      }
      else
      {
         if ( (0==AV30ComboTrnCod) )
         {
            A840TrnCod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         }
         else
         {
            if ( ! (0==AV30ComboTrnCod) )
            {
               A840TrnCod = AV30ComboTrnCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            }
         }
      }
      if ( ! (GXutil.strcmp("", AV22AlbSec)==0) )
      {
         A2242AlbSec = GXutil.trim( AV22AlbSec) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2242AlbSec", A2242AlbSec);
      }
      A39AlbProPri = AV17AlbProPri ;
      httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
      if ( ! (0==AV8AlbProCod) )
      {
         A30AlbProCod = AV8AlbProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
      else
      {
         if ( ! isIns( )  )
         {
            A30AlbProCod = AV8AlbProCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         }
      }
      if ( ! (0==AV8AlbProCod) )
      {
         edtAlbProCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      }
      else
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
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV15Insert_EmprGuiRem)==0) )
      {
         A1253EmprGuiRem = AV15Insert_EmprGuiRem ;
         httpContext.ajax_rsp_assign_attri("", false, "A1253EmprGuiRem", A1253EmprGuiRem);
      }
      else
      {
         A1253EmprGuiRem = A396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A1253EmprGuiRem", A1253EmprGuiRem);
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
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A34AlbProfch)) && ( Gx_BScreen == 0 ) )
      {
         A34AlbProfch = GXutil.today( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
      }
      if ( isIns( )  && (GXutil.strcmp("", A5140AlbMarca)==0) && ( Gx_BScreen == 0 ) )
      {
         A5140AlbMarca = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "A5140AlbMarca", A5140AlbMarca);
      }
      if ( isIns( )  && (GXutil.strcmp("", A7098AlbUsu)==0) && ( Gx_BScreen == 0 ) )
      {
         A7098AlbUsu = AV20UsurCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A7098AlbUsu", A7098AlbUsu);
      }
      if ( isIns( )  && (GXutil.strcmp("", A10765AlbProAT)==0) && ( Gx_BScreen == 0 ) )
      {
         A10765AlbProAT = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "A10765AlbProAT", A10765AlbProAT);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T01U68 */
         pr_default.execute(6, new Object[] {Boolean.valueOf(n3108AlbDivCod), Byte.valueOf(A3108AlbDivCod)});
         A3109AlbDivAbr = T01U68_A3109AlbDivAbr[0] ;
         n3109AlbDivAbr = T01U68_n3109AlbDivAbr[0] ;
         pr_default.close(6);
         /* Using cursor T01U66 */
         pr_default.execute(4, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod)});
         A841TrnNom = T01U66_A841TrnNom[0] ;
         n841TrnNom = T01U66_n841TrnNom[0] ;
         A3643TrnNif = T01U66_A3643TrnNif[0] ;
         n3643TrnNif = T01U66_n3643TrnNif[0] ;
         pr_default.close(5);
         GXt_date14 = A14396AlbFecAnt ;
         GXv_date15[0] = GXt_date14 ;
         new app.documentotransporteproduccion.documentotransporteproduccion_fechadocumentoanterior(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, A39AlbProPri, GXv_date15) ;
         documentodetransporteproduccion_1_impl.this.GXt_date14 = GXv_date15[0] ;
         A14396AlbFecAnt = GXt_date14 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14396AlbFecAnt", localUtil.format(A14396AlbFecAnt, "99/99/99"));
         GXt_decimal16 = A14253AlbImporte ;
         GXv_decimal17[0] = GXt_decimal16 ;
         new app.importedocumento(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, GXv_decimal17) ;
         documentodetransporteproduccion_1_impl.this.GXt_decimal16 = GXv_decimal17[0] ;
         A14253AlbImporte = GXt_decimal16 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14253AlbImporte", GXutil.ltrimstr( A14253AlbImporte, 15, 2));
         GXt_int18 = A14252AlbLineasA ;
         GXv_int19[0] = GXt_int18 ;
         new app.documentotransporteproduccion.haydatosalbbar(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, GXv_int19) ;
         documentodetransporteproduccion_1_impl.this.GXt_int18 = GXv_int19[0] ;
         A14252AlbLineasA = GXt_int18 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14252AlbLineasA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14252AlbLineasA), 4, 0));
         if ( ( GXutil.strcmp(Gx_mode, "INS") != 0 ) && ( A14252AlbLineasA == 1 ) )
         {
            Combo_guiremcli_Enabled = false ;
            ucCombo_guiremcli.sendProperty(context, "", false, Combo_guiremcli_Internalname, "Enabled", GXutil.booltostr( Combo_guiremcli_Enabled));
         }
         GXt_int18 = A14251AlbFactura ;
         GXv_int19[0] = GXt_int18 ;
         new app.facturacion.documentofacturable(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, GXv_int19) ;
         documentodetransporteproduccion_1_impl.this.GXt_int18 = GXv_int19[0] ;
         A14251AlbFactura = (byte)(GXt_int18) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14251AlbFactura", GXutil.str( A14251AlbFactura, 1, 0));
         /* Using cursor T01U64 */
         pr_default.execute(2, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
         A1244GuiRemCln = T01U64_A1244GuiRemCln[0] ;
         A3145GuiRemDivT = T01U64_A3145GuiRemDivT[0] ;
         n3145GuiRemDivT = T01U64_n3145GuiRemDivT[0] ;
         A3110GuiRemDiv = T01U64_A3110GuiRemDiv[0] ;
         n3110GuiRemDiv = T01U64_n3110GuiRemDiv[0] ;
         pr_default.close(2);
         /* Using cursor T01U67 */
         pr_default.execute(5, new Object[] {A1253EmprGuiRem, Short.valueOf(A840TrnCod)});
         A841TrnNom = T01U67_A841TrnNom[0] ;
         n841TrnNom = T01U67_n841TrnNom[0] ;
         A3643TrnNif = T01U67_A3643TrnNif[0] ;
         n3643TrnNif = T01U67_n3643TrnNif[0] ;
         pr_default.close(5);
         /* Using cursor T01U69 */
         pr_default.execute(7, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli), Boolean.valueOf(n1259AlbDomEnv), Byte.valueOf(A1259AlbDomEnv)});
         if ( (pr_default.getStatus(7) != 101) )
         {
            A1260BusDomEnv = T01U69_A1260BusDomEnv[0] ;
            n1260BusDomEnv = T01U69_n1260BusDomEnv[0] ;
         }
         else
         {
            A1260BusDomEnv = (byte)(0) ;
            n1260BusDomEnv = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1260BusDomEnv", GXutil.str( A1260BusDomEnv, 1, 0));
         }
         pr_default.close(7);
      }
   }

   public void load1U63( )
   {
      /* Using cursor T01U610 */
      pr_default.execute(8, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A1259AlbDomEnv = T01U610_A1259AlbDomEnv[0] ;
         n1259AlbDomEnv = T01U610_n1259AlbDomEnv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1259AlbDomEnv", GXutil.str( A1259AlbDomEnv, 1, 0));
         A3869AlbCliDes = T01U610_A3869AlbCliDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3869AlbCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3869AlbCliDes), 6, 0));
         A39AlbProPri = T01U610_A39AlbProPri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
         A3093AlbDivTCod = T01U610_A3093AlbDivTCod[0] ;
         n3093AlbDivTCod = T01U610_n3093AlbDivTCod[0] ;
         A1258GuiRemDom = T01U610_A1258GuiRemDom[0] ;
         n1258GuiRemDom = T01U610_n1258GuiRemDom[0] ;
         A2242AlbSec = T01U610_A2242AlbSec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2242AlbSec", A2242AlbSec);
         A33AlbProEst = T01U610_A33AlbProEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A33AlbProEst", GXutil.str( A33AlbProEst, 1, 0));
         A34AlbProfch = T01U610_A34AlbProfch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
         A4023AlbFecSal = T01U610_A4023AlbFecSal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4023AlbFecSal", localUtil.format(A4023AlbFecSal, "99/99/99"));
         A3865AlbHorSal = T01U610_A3865AlbHorSal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3865AlbHorSal", A3865AlbHorSal);
         A7098AlbUsu = T01U610_A7098AlbUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7098AlbUsu", A7098AlbUsu);
         A1244GuiRemCln = T01U610_A1244GuiRemCln[0] ;
         A3868AlbMat = T01U610_A3868AlbMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3868AlbMat", A3868AlbMat);
         A5805AlbEnvFtp = T01U610_A5805AlbEnvFtp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBENVFTP", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A5805AlbEnvFtp), "9")));
         A7101AlbLic = T01U610_A7101AlbLic[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7101AlbLic", A7101AlbLic);
         A10765AlbProAT = T01U610_A10765AlbProAT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10765AlbProAT", A10765AlbProAT);
         A10019AlbHhfm = T01U610_A10019AlbHhfm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10019AlbHhfm", localUtil.ttoc( A10019AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A10020AlbGrossT = T01U610_A10020AlbGrossT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10020AlbGrossT", GXutil.ltrimstr( A10020AlbGrossT, 13, 2));
         A10837AlbTrnNc = T01U610_A10837AlbTrnNc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10837AlbTrnNc", A10837AlbTrnNc);
         A10017AlbFmd = T01U610_A10017AlbFmd[0] ;
         n10017AlbFmd = T01U610_n10017AlbFmd[0] ;
         A10835AlbTrnNm = T01U610_A10835AlbTrnNm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10835AlbTrnNm", A10835AlbTrnNm);
         A10018ALbFmdc = T01U610_A10018ALbFmdc[0] ;
         A10836AlbTrnDm = T01U610_A10836AlbTrnDm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10836AlbTrnDm", A10836AlbTrnDm);
         A5140AlbMarca = T01U610_A5140AlbMarca[0] ;
         A3867AlbLocDes = T01U610_A3867AlbLocDes[0] ;
         A3866AlbLocCar = T01U610_A3866AlbLocCar[0] ;
         A914AlbPObsCon = T01U610_A914AlbPObsCon[0] ;
         A5141AlbIvaCod = T01U610_A5141AlbIvaCod[0] ;
         A7987AlbColCa = T01U610_A7987AlbColCa[0] ;
         A7162AlbDesp = T01U610_A7162AlbDesp[0] ;
         A7986AlbCambio = T01U610_A7986AlbCambio[0] ;
         A7985AlbTipDoc = T01U610_A7985AlbTipDoc[0] ;
         A7984AlbMotTr = T01U610_A7984AlbMotTr[0] ;
         A5803AlbTipCal = T01U610_A5803AlbTipCal[0] ;
         A7988AlbObsCb = T01U610_A7988AlbObsCb[0] ;
         A7102AlbNumT = T01U610_A7102AlbNumT[0] ;
         A7100AlbMarCo = T01U610_A7100AlbMarCo[0] ;
         A7099AlbOComp = T01U610_A7099AlbOComp[0] ;
         A3109AlbDivAbr = T01U610_A3109AlbDivAbr[0] ;
         n3109AlbDivAbr = T01U610_n3109AlbDivAbr[0] ;
         A3145GuiRemDivT = T01U610_A3145GuiRemDivT[0] ;
         n3145GuiRemDivT = T01U610_n3145GuiRemDivT[0] ;
         A407EmprNom = T01U610_A407EmprNom[0] ;
         n407EmprNom = T01U610_n407EmprNom[0] ;
         A14074AlbPdTipAT = T01U610_A14074AlbPdTipAT[0] ;
         A14073AlbPdSerAT = T01U610_A14073AlbPdSerAT[0] ;
         A14069AlbPdATCUD = T01U610_A14069AlbPdATCUD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14069AlbPdATCUD", A14069AlbPdATCUD);
         A14404AlbEnvMail = T01U610_A14404AlbEnvMail[0] ;
         A1253EmprGuiRem = T01U610_A1253EmprGuiRem[0] ;
         A1243GuiRemCli = T01U610_A1243GuiRemCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
         A840TrnCod = T01U610_A840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A3108AlbDivCod = T01U610_A3108AlbDivCod[0] ;
         n3108AlbDivCod = T01U610_n3108AlbDivCod[0] ;
         A3110GuiRemDiv = T01U610_A3110GuiRemDiv[0] ;
         n3110GuiRemDiv = T01U610_n3110GuiRemDiv[0] ;
         A1260BusDomEnv = T01U610_A1260BusDomEnv[0] ;
         n1260BusDomEnv = T01U610_n1260BusDomEnv[0] ;
         zm1U63( -55) ;
      }
      pr_default.close(8);
      onLoadActions1U63( ) ;
   }

   public void onLoadActions1U63( )
   {
      /* Using cursor T01U67 */
      pr_default.execute(5, new Object[] {A1253EmprGuiRem, Short.valueOf(A840TrnCod)});
      A841TrnNom = T01U67_A841TrnNom[0] ;
      n841TrnNom = T01U67_n841TrnNom[0] ;
      A3643TrnNif = T01U67_A3643TrnNif[0] ;
      n3643TrnNif = T01U67_n3643TrnNif[0] ;
      pr_default.close(5);
      A14362Firma4dig = GXutil.substring( A10017AlbFmd, 1, 1) + GXutil.substring( A10017AlbFmd, 11, 1) + GXutil.substring( A10017AlbFmd, 21, 1) + GXutil.substring( A10017AlbFmd, 31, 1) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14362Firma4dig", A14362Firma4dig);
      if ( true )
      {
         A3869AlbCliDes = AV27ComboAlbCliDes ;
         httpContext.ajax_rsp_assign_attri("", false, "A3869AlbCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3869AlbCliDes), 6, 0));
      }
      else
      {
         if ( isIns( )  && (0==A3869AlbCliDes) && ( Gx_BScreen == 0 ) )
         {
            A3869AlbCliDes = A1243GuiRemCli ;
            httpContext.ajax_rsp_assign_attri("", false, "A3869AlbCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3869AlbCliDes), 6, 0));
         }
      }
      /* Using cursor T01U66 */
      pr_default.execute(4, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod)});
      A841TrnNom = T01U66_A841TrnNom[0] ;
      n841TrnNom = T01U66_n841TrnNom[0] ;
      A3643TrnNif = T01U66_A3643TrnNif[0] ;
      n3643TrnNif = T01U66_n3643TrnNif[0] ;
      pr_default.close(5);
      GXt_date14 = A14396AlbFecAnt ;
      GXv_date15[0] = GXt_date14 ;
      new app.documentotransporteproduccion.documentotransporteproduccion_fechadocumentoanterior(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, A39AlbProPri, GXv_date15) ;
      documentodetransporteproduccion_1_impl.this.GXt_date14 = GXv_date15[0] ;
      A14396AlbFecAnt = GXt_date14 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14396AlbFecAnt", localUtil.format(A14396AlbFecAnt, "99/99/99"));
      GXt_decimal16 = A14253AlbImporte ;
      GXv_decimal17[0] = GXt_decimal16 ;
      new app.importedocumento(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, GXv_decimal17) ;
      documentodetransporteproduccion_1_impl.this.GXt_decimal16 = GXv_decimal17[0] ;
      A14253AlbImporte = GXt_decimal16 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14253AlbImporte", GXutil.ltrimstr( A14253AlbImporte, 15, 2));
      GXt_int18 = A14252AlbLineasA ;
      GXv_int19[0] = GXt_int18 ;
      new app.documentotransporteproduccion.haydatosalbbar(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, GXv_int19) ;
      documentodetransporteproduccion_1_impl.this.GXt_int18 = GXv_int19[0] ;
      A14252AlbLineasA = GXt_int18 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14252AlbLineasA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14252AlbLineasA), 4, 0));
      if ( ( GXutil.strcmp(sMode3, "INS") != 0 ) && ( A14252AlbLineasA == 1 ) )
      {
         Combo_guiremcli_Enabled = false ;
         ucCombo_guiremcli.sendProperty(context, "", false, Combo_guiremcli_Internalname, "Enabled", GXutil.booltostr( Combo_guiremcli_Enabled));
      }
      GXt_int18 = A14251AlbFactura ;
      GXv_int19[0] = GXt_int18 ;
      new app.facturacion.documentofacturable(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, GXv_int19) ;
      documentodetransporteproduccion_1_impl.this.GXt_int18 = GXv_int19[0] ;
      A14251AlbFactura = (byte)(GXt_int18) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14251AlbFactura", GXutil.str( A14251AlbFactura, 1, 0));
   }

   public void checkExtendedTable1U63( )
   {
      nIsDirty_3 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A14396AlbFecAnt)) && GXutil.resetTime(A34AlbProfch).before( GXutil.resetTime( A14396AlbFecAnt )) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Data documento ", "")+GXutil.trim( localUtil.dtoc( A34AlbProfch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+httpContext.getMessage( ", inferior a Data Doc. Ant. ", "")+GXutil.trim( localUtil.dtoc( A14396AlbFecAnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), 1, "ALBPROFCH");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProfch_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T01U64 */
      pr_default.execute(2, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GuiRemCli", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GUIREMCLI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtGuiRemCli_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1244GuiRemCln = T01U64_A1244GuiRemCln[0] ;
      A3145GuiRemDivT = T01U64_A3145GuiRemDivT[0] ;
      n3145GuiRemDivT = T01U64_n3145GuiRemDivT[0] ;
      A3110GuiRemDiv = T01U64_A3110GuiRemDiv[0] ;
      n3110GuiRemDiv = T01U64_n3110GuiRemDiv[0] ;
      pr_default.close(2);
      /* Using cursor T01U69 */
      pr_default.execute(7, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli), Boolean.valueOf(n1259AlbDomEnv), Byte.valueOf(A1259AlbDomEnv)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         A1260BusDomEnv = T01U69_A1260BusDomEnv[0] ;
         n1260BusDomEnv = T01U69_n1260BusDomEnv[0] ;
      }
      else
      {
         nIsDirty_3 = (short)(1) ;
         A1260BusDomEnv = (byte)(0) ;
         n1260BusDomEnv = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1260BusDomEnv", GXutil.str( A1260BusDomEnv, 1, 0));
      }
      pr_default.close(7);
      /* Using cursor T01U67 */
      pr_default.execute(5, new Object[] {A1253EmprGuiRem, Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTrnCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A841TrnNom = T01U67_A841TrnNom[0] ;
      n841TrnNom = T01U67_n841TrnNom[0] ;
      A3643TrnNif = T01U67_A3643TrnNif[0] ;
      n3643TrnNif = T01U67_n3643TrnNif[0] ;
      pr_default.close(5);
      nIsDirty_3 = (short)(1) ;
      A14362Firma4dig = GXutil.substring( A10017AlbFmd, 1, 1) + GXutil.substring( A10017AlbFmd, 11, 1) + GXutil.substring( A10017AlbFmd, 21, 1) + GXutil.substring( A10017AlbFmd, 31, 1) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14362Firma4dig", A14362Firma4dig);
      /* Using cursor T01U68 */
      pr_default.execute(6, new Object[] {Boolean.valueOf(n3108AlbDivCod), Byte.valueOf(A3108AlbDivCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         if ( ! ( (0==A3108AlbDivCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DivAlb", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBDIVCOD");
            AnyError = (short)(1) ;
         }
      }
      A3109AlbDivAbr = T01U68_A3109AlbDivAbr[0] ;
      n3109AlbDivAbr = T01U68_n3109AlbDivAbr[0] ;
      pr_default.close(6);
      if ( true )
      {
         nIsDirty_3 = (short)(1) ;
         A3869AlbCliDes = AV27ComboAlbCliDes ;
         httpContext.ajax_rsp_assign_attri("", false, "A3869AlbCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3869AlbCliDes), 6, 0));
      }
      else
      {
         if ( isIns( )  && (0==A3869AlbCliDes) && ( Gx_BScreen == 0 ) )
         {
            nIsDirty_3 = (short)(1) ;
            A3869AlbCliDes = A1243GuiRemCli ;
            httpContext.ajax_rsp_assign_attri("", false, "A3869AlbCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3869AlbCliDes), 6, 0));
         }
      }
      /* Using cursor T01U66 */
      pr_default.execute(4, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod)});
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
      A841TrnNom = T01U66_A841TrnNom[0] ;
      n841TrnNom = T01U66_n841TrnNom[0] ;
      A3643TrnNif = T01U66_A3643TrnNif[0] ;
      n3643TrnNif = T01U66_n3643TrnNif[0] ;
      pr_default.close(5);
      nIsDirty_3 = (short)(1) ;
      GXt_date14 = A14396AlbFecAnt ;
      GXv_date15[0] = GXt_date14 ;
      new app.documentotransporteproduccion.documentotransporteproduccion_fechadocumentoanterior(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, A39AlbProPri, GXv_date15) ;
      documentodetransporteproduccion_1_impl.this.GXt_date14 = GXv_date15[0] ;
      A14396AlbFecAnt = GXt_date14 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14396AlbFecAnt", localUtil.format(A14396AlbFecAnt, "99/99/99"));
      nIsDirty_3 = (short)(1) ;
      GXt_decimal16 = A14253AlbImporte ;
      GXv_decimal17[0] = GXt_decimal16 ;
      new app.importedocumento(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, GXv_decimal17) ;
      documentodetransporteproduccion_1_impl.this.GXt_decimal16 = GXv_decimal17[0] ;
      A14253AlbImporte = GXt_decimal16 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14253AlbImporte", GXutil.ltrimstr( A14253AlbImporte, 15, 2));
      nIsDirty_3 = (short)(1) ;
      GXt_int18 = A14252AlbLineasA ;
      GXv_int19[0] = GXt_int18 ;
      new app.documentotransporteproduccion.haydatosalbbar(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, GXv_int19) ;
      documentodetransporteproduccion_1_impl.this.GXt_int18 = GXv_int19[0] ;
      A14252AlbLineasA = GXt_int18 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14252AlbLineasA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14252AlbLineasA), 4, 0));
      if ( ( GXutil.strcmp(Gx_mode, "INS") != 0 ) && ( A14252AlbLineasA == 1 ) )
      {
         Combo_guiremcli_Enabled = false ;
         ucCombo_guiremcli.sendProperty(context, "", false, Combo_guiremcli_Internalname, "Enabled", GXutil.booltostr( Combo_guiremcli_Enabled));
      }
      nIsDirty_3 = (short)(1) ;
      GXt_int18 = A14251AlbFactura ;
      GXv_int19[0] = GXt_int18 ;
      new app.facturacion.documentofacturable(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, GXv_int19) ;
      documentodetransporteproduccion_1_impl.this.GXt_int18 = GXv_int19[0] ;
      A14251AlbFactura = (byte)(GXt_int18) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14251AlbFactura", GXutil.str( A14251AlbFactura, 1, 0));
   }

   public void closeExtendedTableCursors1U63( )
   {
      pr_default.close(2);
      pr_default.close(7);
      pr_default.close(5);
      pr_default.close(6);
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void gxload_56( String A1253EmprGuiRem ,
                          int A1243GuiRemCli )
   {
      /* Using cursor T01U611 */
      pr_default.execute(9, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GuiRemCli", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GUIREMCLI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtGuiRemCli_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1244GuiRemCln = T01U611_A1244GuiRemCln[0] ;
      A3145GuiRemDivT = T01U611_A3145GuiRemDivT[0] ;
      n3145GuiRemDivT = T01U611_n3145GuiRemDivT[0] ;
      A3110GuiRemDiv = T01U611_A3110GuiRemDiv[0] ;
      n3110GuiRemDiv = T01U611_n3110GuiRemDiv[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1244GuiRemCln))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3145GuiRemDivT))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A3110GuiRemDiv, (byte)(2), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void gxload_61( String A1253EmprGuiRem ,
                          int A1243GuiRemCli ,
                          byte A1259AlbDomEnv )
   {
      /* Using cursor T01U612 */
      pr_default.execute(10, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli), Boolean.valueOf(n1259AlbDomEnv), Byte.valueOf(A1259AlbDomEnv)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         A1260BusDomEnv = T01U612_A1260BusDomEnv[0] ;
         n1260BusDomEnv = T01U612_n1260BusDomEnv[0] ;
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
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void gxload_59( String A1253EmprGuiRem ,
                          short A840TrnCod )
   {
      /* Using cursor T01U613 */
      pr_default.execute(11, new Object[] {A1253EmprGuiRem, Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTrnCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A841TrnNom = T01U613_A841TrnNom[0] ;
      n841TrnNom = T01U613_n841TrnNom[0] ;
      A3643TrnNif = T01U613_A3643TrnNif[0] ;
      n3643TrnNif = T01U613_n3643TrnNif[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A841TrnNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3643TrnNif))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void gxload_60( byte A3108AlbDivCod )
   {
      /* Using cursor T01U614 */
      pr_default.execute(12, new Object[] {Boolean.valueOf(n3108AlbDivCod), Byte.valueOf(A3108AlbDivCod)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         if ( ! ( (0==A3108AlbDivCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DivAlb", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBDIVCOD");
            AnyError = (short)(1) ;
         }
      }
      A3109AlbDivAbr = T01U614_A3109AlbDivAbr[0] ;
      n3109AlbDivAbr = T01U614_n3109AlbDivAbr[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3109AlbDivAbr))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void gxload_58( String A396EmprCod ,
                          short A840TrnCod )
   {
      /* Using cursor T01U615 */
      pr_default.execute(13, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A841TrnNom = T01U615_A841TrnNom[0] ;
      n841TrnNom = T01U615_n841TrnNom[0] ;
      A3643TrnNif = T01U615_A3643TrnNif[0] ;
      n3643TrnNif = T01U615_n3643TrnNif[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A841TrnNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3643TrnNif))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void getKey1U63( )
   {
      /* Using cursor T01U616 */
      pr_default.execute(14, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound3 = (short)(1) ;
      }
      else
      {
         RcdFound3 = (short)(0) ;
      }
      pr_default.close(14);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01U63 */
      pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1U63( 55) ;
         RcdFound3 = (short)(1) ;
         A30AlbProCod = T01U63_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A1259AlbDomEnv = T01U63_A1259AlbDomEnv[0] ;
         n1259AlbDomEnv = T01U63_n1259AlbDomEnv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1259AlbDomEnv", GXutil.str( A1259AlbDomEnv, 1, 0));
         A3869AlbCliDes = T01U63_A3869AlbCliDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3869AlbCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3869AlbCliDes), 6, 0));
         A39AlbProPri = T01U63_A39AlbProPri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
         A3093AlbDivTCod = T01U63_A3093AlbDivTCod[0] ;
         n3093AlbDivTCod = T01U63_n3093AlbDivTCod[0] ;
         A1258GuiRemDom = T01U63_A1258GuiRemDom[0] ;
         n1258GuiRemDom = T01U63_n1258GuiRemDom[0] ;
         A2242AlbSec = T01U63_A2242AlbSec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2242AlbSec", A2242AlbSec);
         A33AlbProEst = T01U63_A33AlbProEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A33AlbProEst", GXutil.str( A33AlbProEst, 1, 0));
         A34AlbProfch = T01U63_A34AlbProfch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
         A4023AlbFecSal = T01U63_A4023AlbFecSal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4023AlbFecSal", localUtil.format(A4023AlbFecSal, "99/99/99"));
         A3865AlbHorSal = T01U63_A3865AlbHorSal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3865AlbHorSal", A3865AlbHorSal);
         A7098AlbUsu = T01U63_A7098AlbUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7098AlbUsu", A7098AlbUsu);
         A3868AlbMat = T01U63_A3868AlbMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3868AlbMat", A3868AlbMat);
         A5805AlbEnvFtp = T01U63_A5805AlbEnvFtp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBENVFTP", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A5805AlbEnvFtp), "9")));
         A7101AlbLic = T01U63_A7101AlbLic[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7101AlbLic", A7101AlbLic);
         A10765AlbProAT = T01U63_A10765AlbProAT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10765AlbProAT", A10765AlbProAT);
         A10019AlbHhfm = T01U63_A10019AlbHhfm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10019AlbHhfm", localUtil.ttoc( A10019AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A10020AlbGrossT = T01U63_A10020AlbGrossT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10020AlbGrossT", GXutil.ltrimstr( A10020AlbGrossT, 13, 2));
         A10837AlbTrnNc = T01U63_A10837AlbTrnNc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10837AlbTrnNc", A10837AlbTrnNc);
         A10017AlbFmd = T01U63_A10017AlbFmd[0] ;
         n10017AlbFmd = T01U63_n10017AlbFmd[0] ;
         A10835AlbTrnNm = T01U63_A10835AlbTrnNm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10835AlbTrnNm", A10835AlbTrnNm);
         A10018ALbFmdc = T01U63_A10018ALbFmdc[0] ;
         A10836AlbTrnDm = T01U63_A10836AlbTrnDm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10836AlbTrnDm", A10836AlbTrnDm);
         A5140AlbMarca = T01U63_A5140AlbMarca[0] ;
         A3867AlbLocDes = T01U63_A3867AlbLocDes[0] ;
         A3866AlbLocCar = T01U63_A3866AlbLocCar[0] ;
         A914AlbPObsCon = T01U63_A914AlbPObsCon[0] ;
         A5141AlbIvaCod = T01U63_A5141AlbIvaCod[0] ;
         A7987AlbColCa = T01U63_A7987AlbColCa[0] ;
         A7162AlbDesp = T01U63_A7162AlbDesp[0] ;
         A7986AlbCambio = T01U63_A7986AlbCambio[0] ;
         A7985AlbTipDoc = T01U63_A7985AlbTipDoc[0] ;
         A7984AlbMotTr = T01U63_A7984AlbMotTr[0] ;
         A5803AlbTipCal = T01U63_A5803AlbTipCal[0] ;
         A7988AlbObsCb = T01U63_A7988AlbObsCb[0] ;
         A7102AlbNumT = T01U63_A7102AlbNumT[0] ;
         A7100AlbMarCo = T01U63_A7100AlbMarCo[0] ;
         A7099AlbOComp = T01U63_A7099AlbOComp[0] ;
         A14074AlbPdTipAT = T01U63_A14074AlbPdTipAT[0] ;
         A14073AlbPdSerAT = T01U63_A14073AlbPdSerAT[0] ;
         A14069AlbPdATCUD = T01U63_A14069AlbPdATCUD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14069AlbPdATCUD", A14069AlbPdATCUD);
         A14404AlbEnvMail = T01U63_A14404AlbEnvMail[0] ;
         A1253EmprGuiRem = T01U63_A1253EmprGuiRem[0] ;
         A1243GuiRemCli = T01U63_A1243GuiRemCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
         A396EmprCod = T01U63_A396EmprCod[0] ;
         A840TrnCod = T01U63_A840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A3108AlbDivCod = T01U63_A3108AlbDivCod[0] ;
         n3108AlbDivCod = T01U63_n3108AlbDivCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         sMode3 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1U63( ) ;
         if ( AnyError == 1 )
         {
            RcdFound3 = (short)(0) ;
            initializeNonKey1U63( ) ;
         }
         Gx_mode = sMode3 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound3 = (short)(0) ;
         initializeNonKey1U63( ) ;
         sMode3 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode3 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1U63( ) ;
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
      /* Using cursor T01U617 */
      pr_default.execute(15, new Object[] {A396EmprCod, A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         while ( (pr_default.getStatus(15) != 101) && ( ( GXutil.strcmp(T01U617_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01U617_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01U617_A30AlbProCod[0] < A30AlbProCod ) ) )
         {
            pr_default.readNext(15);
         }
         if ( (pr_default.getStatus(15) != 101) && ( ( GXutil.strcmp(T01U617_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01U617_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01U617_A30AlbProCod[0] > A30AlbProCod ) ) )
         {
            A396EmprCod = T01U617_A396EmprCod[0] ;
            A30AlbProCod = T01U617_A30AlbProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            RcdFound3 = (short)(1) ;
         }
      }
      pr_default.close(15);
   }

   public void move_previous( )
   {
      RcdFound3 = (short)(0) ;
      /* Using cursor T01U618 */
      pr_default.execute(16, new Object[] {A396EmprCod, A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         while ( (pr_default.getStatus(16) != 101) && ( ( GXutil.strcmp(T01U618_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01U618_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01U618_A30AlbProCod[0] > A30AlbProCod ) ) )
         {
            pr_default.readNext(16);
         }
         if ( (pr_default.getStatus(16) != 101) && ( ( GXutil.strcmp(T01U618_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01U618_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01U618_A30AlbProCod[0] < A30AlbProCod ) ) )
         {
            A396EmprCod = T01U618_A396EmprCod[0] ;
            A30AlbProCod = T01U618_A30AlbProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            RcdFound3 = (short)(1) ;
         }
      }
      pr_default.close(16);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1U63( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtAlbProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1U63( ) ;
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
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A30AlbProCod = Z30AlbProCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "ALBPROCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbProCod_Internalname ;
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
               update1U63( ) ;
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
               insert1U63( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "ALBPROCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAlbProCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtAlbProCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1U63( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = Z30AlbProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "ALBPROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProCod_Internalname ;
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

   public void checkOptimisticConcurrency1U63( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01U62 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCALPRD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z1259AlbDomEnv != T01U62_A1259AlbDomEnv[0] ) || ( Z3869AlbCliDes != T01U62_A3869AlbCliDes[0] ) || ( GXutil.strcmp(Z39AlbProPri, T01U62_A39AlbProPri[0]) != 0 ) || ( GXutil.strcmp(Z3093AlbDivTCod, T01U62_A3093AlbDivTCod[0]) != 0 ) || ( Z1258GuiRemDom != T01U62_A1258GuiRemDom[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z2242AlbSec, T01U62_A2242AlbSec[0]) != 0 ) || ( Z33AlbProEst != T01U62_A33AlbProEst[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z34AlbProfch), GXutil.resetTime(T01U62_A34AlbProfch[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z4023AlbFecSal), GXutil.resetTime(T01U62_A4023AlbFecSal[0])) ) || ( GXutil.strcmp(Z3865AlbHorSal, T01U62_A3865AlbHorSal[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z7098AlbUsu, T01U62_A7098AlbUsu[0]) != 0 ) || ( GXutil.strcmp(Z3868AlbMat, T01U62_A3868AlbMat[0]) != 0 ) || ( Z5805AlbEnvFtp != T01U62_A5805AlbEnvFtp[0] ) || ( GXutil.strcmp(Z7101AlbLic, T01U62_A7101AlbLic[0]) != 0 ) || ( GXutil.strcmp(Z10765AlbProAT, T01U62_A10765AlbProAT[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z10019AlbHhfm, T01U62_A10019AlbHhfm[0]) ) || ( DecimalUtil.compareTo(Z10020AlbGrossT, T01U62_A10020AlbGrossT[0]) != 0 ) || ( GXutil.strcmp(Z10837AlbTrnNc, T01U62_A10837AlbTrnNc[0]) != 0 ) || ( GXutil.strcmp(Z10017AlbFmd, T01U62_A10017AlbFmd[0]) != 0 ) || ( GXutil.strcmp(Z10835AlbTrnNm, T01U62_A10835AlbTrnNm[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10018ALbFmdc, T01U62_A10018ALbFmdc[0]) != 0 ) || ( GXutil.strcmp(Z10836AlbTrnDm, T01U62_A10836AlbTrnDm[0]) != 0 ) || ( GXutil.strcmp(Z5140AlbMarca, T01U62_A5140AlbMarca[0]) != 0 ) || ( Z3867AlbLocDes != T01U62_A3867AlbLocDes[0] ) || ( Z3866AlbLocCar != T01U62_A3866AlbLocCar[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z914AlbPObsCon != T01U62_A914AlbPObsCon[0] ) || ( GXutil.strcmp(Z5141AlbIvaCod, T01U62_A5141AlbIvaCod[0]) != 0 ) || ( GXutil.strcmp(Z7987AlbColCa, T01U62_A7987AlbColCa[0]) != 0 ) || ( Z7162AlbDesp != T01U62_A7162AlbDesp[0] ) || ( DecimalUtil.compareTo(Z7986AlbCambio, T01U62_A7986AlbCambio[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z7985AlbTipDoc != T01U62_A7985AlbTipDoc[0] ) || ( GXutil.strcmp(Z7984AlbMotTr, T01U62_A7984AlbMotTr[0]) != 0 ) || ( Z5803AlbTipCal != T01U62_A5803AlbTipCal[0] ) || ( GXutil.strcmp(Z7988AlbObsCb, T01U62_A7988AlbObsCb[0]) != 0 ) || ( Z7102AlbNumT != T01U62_A7102AlbNumT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z7100AlbMarCo, T01U62_A7100AlbMarCo[0]) != 0 ) || ( GXutil.strcmp(Z7099AlbOComp, T01U62_A7099AlbOComp[0]) != 0 ) || ( GXutil.strcmp(Z14074AlbPdTipAT, T01U62_A14074AlbPdTipAT[0]) != 0 ) || ( GXutil.strcmp(Z14073AlbPdSerAT, T01U62_A14073AlbPdSerAT[0]) != 0 ) || ( GXutil.strcmp(Z14069AlbPdATCUD, T01U62_A14069AlbPdATCUD[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z14404AlbEnvMail, T01U62_A14404AlbEnvMail[0]) ) || ( GXutil.strcmp(Z1253EmprGuiRem, T01U62_A1253EmprGuiRem[0]) != 0 ) || ( Z1243GuiRemCli != T01U62_A1243GuiRemCli[0] ) || ( Z840TrnCod != T01U62_A840TrnCod[0] ) || ( Z3108AlbDivCod != T01U62_A3108AlbDivCod[0] ) )
         {
            if ( Z1259AlbDomEnv != T01U62_A1259AlbDomEnv[0] )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_1:[seudo value changed for attri]"+"AlbDomEnv");
               GXutil.writeLogRaw("Old: ",Z1259AlbDomEnv);
               GXutil.writeLogRaw("Current: ",T01U62_A1259AlbDomEnv[0]);
            }
            if ( Z3869AlbCliDes != T01U62_A3869AlbCliDes[0] )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_1:[seudo value changed for attri]"+"AlbCliDes");
               GXutil.writeLogRaw("Old: ",Z3869AlbCliDes);
               GXutil.writeLogRaw("Current: ",T01U62_A3869AlbCliDes[0]);
            }
            if ( GXutil.strcmp(Z39AlbProPri, T01U62_A39AlbProPri[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_1:[seudo value changed for attri]"+"AlbProPri");
               GXutil.writeLogRaw("Old: ",Z39AlbProPri);
               GXutil.writeLogRaw("Current: ",T01U62_A39AlbProPri[0]);
            }
            if ( GXutil.strcmp(Z3093AlbDivTCod, T01U62_A3093AlbDivTCod[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_1:[seudo value changed for attri]"+"AlbDivTCod");
               GXutil.writeLogRaw("Old: ",Z3093AlbDivTCod);
               GXutil.writeLogRaw("Current: ",T01U62_A3093AlbDivTCod[0]);
            }
            if ( Z1258GuiRemDom != T01U62_A1258GuiRemDom[0] )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_1:[seudo value changed for attri]"+"GuiRemDom");
               GXutil.writeLogRaw("Old: ",Z1258GuiRemDom);
               GXutil.writeLogRaw("Current: ",T01U62_A1258GuiRemDom[0]);
            }
            if ( GXutil.strcmp(Z2242AlbSec, T01U62_A2242AlbSec[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_1:[seudo value changed for attri]"+"AlbSec");
               GXutil.writeLogRaw("Old: ",Z2242AlbSec);
               GXutil.writeLogRaw("Current: ",T01U62_A2242AlbSec[0]);
            }
            if ( Z33AlbProEst != T01U62_A33AlbProEst[0] )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_1:[seudo value changed for attri]"+"AlbProEst");
               GXutil.writeLogRaw("Old: ",Z33AlbProEst);
               GXutil.writeLogRaw("Current: ",T01U62_A33AlbProEst[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z34AlbProfch), GXutil.resetTime(T01U62_A34AlbProfch[0])) ) )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_1:[seudo value changed for attri]"+"AlbProfch");
               GXutil.writeLogRaw("Old: ",Z34AlbProfch);
               GXutil.writeLogRaw("Current: ",T01U62_A34AlbProfch[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z4023AlbFecSal), GXutil.resetTime(T01U62_A4023AlbFecSal[0])) ) )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_1:[seudo value changed for attri]"+"AlbFecSal");
               GXutil.writeLogRaw("Old: ",Z4023AlbFecSal);
               GXutil.writeLogRaw("Current: ",T01U62_A4023AlbFecSal[0]);
            }
            if ( GXutil.strcmp(Z3865AlbHorSal, T01U62_A3865AlbHorSal[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_1:[seudo value changed for attri]"+"AlbHorSal");
               GXutil.writeLogRaw("Old: ",Z3865AlbHorSal);
               GXutil.writeLogRaw("Current: ",T01U62_A3865AlbHorSal[0]);
            }
            if ( GXutil.strcmp(Z7098AlbUsu, T01U62_A7098AlbUsu[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_1:[seudo value changed for attri]"+"AlbUsu");
               GXutil.writeLogRaw("Old: ",Z7098AlbUsu);
               GXutil.writeLogRaw("Current: ",T01U62_A7098AlbUsu[0]);
            }
            if ( GXutil.strcmp(Z3868AlbMat, T01U62_A3868AlbMat[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_1:[seudo value changed for attri]"+"AlbMat");
               GXutil.writeLogRaw("Old: ",Z3868AlbMat);
               GXutil.writeLogRaw("Current: ",T01U62_A3868AlbMat[0]);
            }
            if ( Z5805AlbEnvFtp != T01U62_A5805AlbEnvFtp[0] )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_1:[seudo value changed for attri]"+"AlbEnvFtp");
               GXutil.writeLogRaw("Old: ",Z5805AlbEnvFtp);
               GXutil.writeLogRaw("Current: ",T01U62_A5805AlbEnvFtp[0]);
            }
            if ( GXutil.strcmp(Z7101AlbLic, T01U62_A7101AlbLic[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_1:[seudo value changed for attri]"+"AlbLic");
               GXutil.writeLogRaw("Old: ",Z7101AlbLic);
               GXutil.writeLogRaw("Current: ",T01U62_A7101AlbLic[0]);
            }
            if ( GXutil.strcmp(Z10765AlbProAT, T01U62_A10765AlbProAT[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_1:[seudo value changed for attri]"+"AlbProAT");
               GXutil.writeLogRaw("Old: ",Z10765AlbProAT);
               GXutil.writeLogRaw("Current: ",T01U62_A10765AlbProAT[0]);
            }
            if ( !( GXutil.dateCompare(Z10019AlbHhfm, T01U62_A10019AlbHhfm[0]) ) )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_1:[seudo value changed for attri]"+"AlbHhfm");
               GXutil.writeLogRaw("Old: ",Z10019AlbHhfm);
               GXutil.writeLogRaw("Current: ",T01U62_A10019AlbHhfm[0]);
            }
            if ( DecimalUtil.compareTo(Z10020AlbGrossT, T01U62_A10020AlbGrossT[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_1:[seudo value changed for attri]"+"AlbGrossT");
               GXutil.writeLogRaw("Old: ",Z10020AlbGrossT);
               GXutil.writeLogRaw("Current: ",T01U62_A10020AlbGrossT[0]);
            }
            if ( GXutil.strcmp(Z10837AlbTrnNc, T01U62_A10837AlbTrnNc[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_1:[seudo value changed for attri]"+"AlbTrnNc");
               GXutil.writeLogRaw("Old: ",Z10837AlbTrnNc);
               GXutil.writeLogRaw("Current: ",T01U62_A10837AlbTrnNc[0]);
            }
            if ( GXutil.strcmp(Z10017AlbFmd, T01U62_A10017AlbFmd[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_1:[seudo value changed for attri]"+"AlbFmd");
               GXutil.writeLogRaw("Old: ",Z10017AlbFmd);
               GXutil.writeLogRaw("Current: ",T01U62_A10017AlbFmd[0]);
            }
            if ( GXutil.strcmp(Z10835AlbTrnNm, T01U62_A10835AlbTrnNm[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_1:[seudo value changed for attri]"+"AlbTrnNm");
               GXutil.writeLogRaw("Old: ",Z10835AlbTrnNm);
               GXutil.writeLogRaw("Current: ",T01U62_A10835AlbTrnNm[0]);
            }
            if ( GXutil.strcmp(Z10018ALbFmdc, T01U62_A10018ALbFmdc[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_1:[seudo value changed for attri]"+"ALbFmdc");
               GXutil.writeLogRaw("Old: ",Z10018ALbFmdc);
               GXutil.writeLogRaw("Current: ",T01U62_A10018ALbFmdc[0]);
            }
            if ( GXutil.strcmp(Z10836AlbTrnDm, T01U62_A10836AlbTrnDm[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_1:[seudo value changed for attri]"+"AlbTrnDm");
               GXutil.writeLogRaw("Old: ",Z10836AlbTrnDm);
               GXutil.writeLogRaw("Current: ",T01U62_A10836AlbTrnDm[0]);
            }
            if ( GXutil.strcmp(Z5140AlbMarca, T01U62_A5140AlbMarca[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_1:[seudo value changed for attri]"+"AlbMarca");
               GXutil.writeLogRaw("Old: ",Z5140AlbMarca);
               GXutil.writeLogRaw("Current: ",T01U62_A5140AlbMarca[0]);
            }
            if ( Z3867AlbLocDes != T01U62_A3867AlbLocDes[0] )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_1:[seudo value changed for attri]"+"AlbLocDes");
               GXutil.writeLogRaw("Old: ",Z3867AlbLocDes);
               GXutil.writeLogRaw("Current: ",T01U62_A3867AlbLocDes[0]);
            }
            if ( Z3866AlbLocCar != T01U62_A3866AlbLocCar[0] )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_1:[seudo value changed for attri]"+"AlbLocCar");
               GXutil.writeLogRaw("Old: ",Z3866AlbLocCar);
               GXutil.writeLogRaw("Current: ",T01U62_A3866AlbLocCar[0]);
            }
            if ( Z914AlbPObsCon != T01U62_A914AlbPObsCon[0] )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_1:[seudo value changed for attri]"+"AlbPObsCon");
               GXutil.writeLogRaw("Old: ",Z914AlbPObsCon);
               GXutil.writeLogRaw("Current: ",T01U62_A914AlbPObsCon[0]);
            }
            if ( GXutil.strcmp(Z5141AlbIvaCod, T01U62_A5141AlbIvaCod[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_1:[seudo value changed for attri]"+"AlbIvaCod");
               GXutil.writeLogRaw("Old: ",Z5141AlbIvaCod);
               GXutil.writeLogRaw("Current: ",T01U62_A5141AlbIvaCod[0]);
            }
            if ( GXutil.strcmp(Z7987AlbColCa, T01U62_A7987AlbColCa[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_1:[seudo value changed for attri]"+"AlbColCa");
               GXutil.writeLogRaw("Old: ",Z7987AlbColCa);
               GXutil.writeLogRaw("Current: ",T01U62_A7987AlbColCa[0]);
            }
            if ( Z7162AlbDesp != T01U62_A7162AlbDesp[0] )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_1:[seudo value changed for attri]"+"AlbDesp");
               GXutil.writeLogRaw("Old: ",Z7162AlbDesp);
               GXutil.writeLogRaw("Current: ",T01U62_A7162AlbDesp[0]);
            }
            if ( DecimalUtil.compareTo(Z7986AlbCambio, T01U62_A7986AlbCambio[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_1:[seudo value changed for attri]"+"AlbCambio");
               GXutil.writeLogRaw("Old: ",Z7986AlbCambio);
               GXutil.writeLogRaw("Current: ",T01U62_A7986AlbCambio[0]);
            }
            if ( Z7985AlbTipDoc != T01U62_A7985AlbTipDoc[0] )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_1:[seudo value changed for attri]"+"AlbTipDoc");
               GXutil.writeLogRaw("Old: ",Z7985AlbTipDoc);
               GXutil.writeLogRaw("Current: ",T01U62_A7985AlbTipDoc[0]);
            }
            if ( GXutil.strcmp(Z7984AlbMotTr, T01U62_A7984AlbMotTr[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_1:[seudo value changed for attri]"+"AlbMotTr");
               GXutil.writeLogRaw("Old: ",Z7984AlbMotTr);
               GXutil.writeLogRaw("Current: ",T01U62_A7984AlbMotTr[0]);
            }
            if ( Z5803AlbTipCal != T01U62_A5803AlbTipCal[0] )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_1:[seudo value changed for attri]"+"AlbTipCal");
               GXutil.writeLogRaw("Old: ",Z5803AlbTipCal);
               GXutil.writeLogRaw("Current: ",T01U62_A5803AlbTipCal[0]);
            }
            if ( GXutil.strcmp(Z7988AlbObsCb, T01U62_A7988AlbObsCb[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_1:[seudo value changed for attri]"+"AlbObsCb");
               GXutil.writeLogRaw("Old: ",Z7988AlbObsCb);
               GXutil.writeLogRaw("Current: ",T01U62_A7988AlbObsCb[0]);
            }
            if ( Z7102AlbNumT != T01U62_A7102AlbNumT[0] )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_1:[seudo value changed for attri]"+"AlbNumT");
               GXutil.writeLogRaw("Old: ",Z7102AlbNumT);
               GXutil.writeLogRaw("Current: ",T01U62_A7102AlbNumT[0]);
            }
            if ( GXutil.strcmp(Z7100AlbMarCo, T01U62_A7100AlbMarCo[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_1:[seudo value changed for attri]"+"AlbMarCo");
               GXutil.writeLogRaw("Old: ",Z7100AlbMarCo);
               GXutil.writeLogRaw("Current: ",T01U62_A7100AlbMarCo[0]);
            }
            if ( GXutil.strcmp(Z7099AlbOComp, T01U62_A7099AlbOComp[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_1:[seudo value changed for attri]"+"AlbOComp");
               GXutil.writeLogRaw("Old: ",Z7099AlbOComp);
               GXutil.writeLogRaw("Current: ",T01U62_A7099AlbOComp[0]);
            }
            if ( GXutil.strcmp(Z14074AlbPdTipAT, T01U62_A14074AlbPdTipAT[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_1:[seudo value changed for attri]"+"AlbPdTipAT");
               GXutil.writeLogRaw("Old: ",Z14074AlbPdTipAT);
               GXutil.writeLogRaw("Current: ",T01U62_A14074AlbPdTipAT[0]);
            }
            if ( GXutil.strcmp(Z14073AlbPdSerAT, T01U62_A14073AlbPdSerAT[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_1:[seudo value changed for attri]"+"AlbPdSerAT");
               GXutil.writeLogRaw("Old: ",Z14073AlbPdSerAT);
               GXutil.writeLogRaw("Current: ",T01U62_A14073AlbPdSerAT[0]);
            }
            if ( GXutil.strcmp(Z14069AlbPdATCUD, T01U62_A14069AlbPdATCUD[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_1:[seudo value changed for attri]"+"AlbPdATCUD");
               GXutil.writeLogRaw("Old: ",Z14069AlbPdATCUD);
               GXutil.writeLogRaw("Current: ",T01U62_A14069AlbPdATCUD[0]);
            }
            if ( !( GXutil.dateCompare(Z14404AlbEnvMail, T01U62_A14404AlbEnvMail[0]) ) )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_1:[seudo value changed for attri]"+"AlbEnvMail");
               GXutil.writeLogRaw("Old: ",Z14404AlbEnvMail);
               GXutil.writeLogRaw("Current: ",T01U62_A14404AlbEnvMail[0]);
            }
            if ( GXutil.strcmp(Z1253EmprGuiRem, T01U62_A1253EmprGuiRem[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_1:[seudo value changed for attri]"+"EmprGuiRem");
               GXutil.writeLogRaw("Old: ",Z1253EmprGuiRem);
               GXutil.writeLogRaw("Current: ",T01U62_A1253EmprGuiRem[0]);
            }
            if ( Z1243GuiRemCli != T01U62_A1243GuiRemCli[0] )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_1:[seudo value changed for attri]"+"GuiRemCli");
               GXutil.writeLogRaw("Old: ",Z1243GuiRemCli);
               GXutil.writeLogRaw("Current: ",T01U62_A1243GuiRemCli[0]);
            }
            if ( Z840TrnCod != T01U62_A840TrnCod[0] )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_1:[seudo value changed for attri]"+"TrnCod");
               GXutil.writeLogRaw("Old: ",Z840TrnCod);
               GXutil.writeLogRaw("Current: ",T01U62_A840TrnCod[0]);
            }
            if ( Z3108AlbDivCod != T01U62_A3108AlbDivCod[0] )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_1:[seudo value changed for attri]"+"AlbDivCod");
               GXutil.writeLogRaw("Old: ",Z3108AlbDivCod);
               GXutil.writeLogRaw("Current: ",T01U62_A3108AlbDivCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCALPRD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1U63( )
   {
      beforeValidate1U63( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1U63( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1U63( 0) ;
         checkOptimisticConcurrency1U63( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1U63( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1U63( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01U619 */
                  pr_default.execute(17, new Object[] {Long.valueOf(A30AlbProCod), Boolean.valueOf(n1259AlbDomEnv), Byte.valueOf(A1259AlbDomEnv), Integer.valueOf(A3869AlbCliDes), A39AlbProPri, Boolean.valueOf(n3093AlbDivTCod), A3093AlbDivTCod, Boolean.valueOf(n1258GuiRemDom), Byte.valueOf(A1258GuiRemDom), A2242AlbSec, Byte.valueOf(A33AlbProEst), A34AlbProfch, A4023AlbFecSal, A3865AlbHorSal, A7098AlbUsu, A3868AlbMat, Byte.valueOf(A5805AlbEnvFtp), A7101AlbLic, A10765AlbProAT, A10019AlbHhfm, A10020AlbGrossT, A10837AlbTrnNc, Boolean.valueOf(n10017AlbFmd), A10017AlbFmd, A10835AlbTrnNm, A10018ALbFmdc, A10836AlbTrnDm, A5140AlbMarca, Byte.valueOf(A3867AlbLocDes), Byte.valueOf(A3866AlbLocCar), Byte.valueOf(A914AlbPObsCon), A5141AlbIvaCod, A7987AlbColCa, Integer.valueOf(A7162AlbDesp), A7986AlbCambio, Integer.valueOf(A7985AlbTipDoc), A7984AlbMotTr, Byte.valueOf(A5803AlbTipCal), A7988AlbObsCb, Long.valueOf(A7102AlbNumT), A7100AlbMarCo, A7099AlbOComp, A14074AlbPdTipAT, A14073AlbPdSerAT, A14069AlbPdATCUD, A14404AlbEnvMail, A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli), A396EmprCod, Short.valueOf(A840TrnCod), Boolean.valueOf(n3108AlbDivCod), Byte.valueOf(A3108AlbDivCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
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
                        resetCaption1U60( ) ;
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
            load1U63( ) ;
         }
         endLevel1U63( ) ;
      }
      closeExtendedTableCursors1U63( ) ;
   }

   public void update1U63( )
   {
      beforeValidate1U63( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1U63( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1U63( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1U63( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1U63( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01U620 */
                  pr_default.execute(18, new Object[] {Boolean.valueOf(n1259AlbDomEnv), Byte.valueOf(A1259AlbDomEnv), Integer.valueOf(A3869AlbCliDes), A39AlbProPri, Boolean.valueOf(n3093AlbDivTCod), A3093AlbDivTCod, Boolean.valueOf(n1258GuiRemDom), Byte.valueOf(A1258GuiRemDom), A2242AlbSec, Byte.valueOf(A33AlbProEst), A34AlbProfch, A4023AlbFecSal, A3865AlbHorSal, A7098AlbUsu, A3868AlbMat, Byte.valueOf(A5805AlbEnvFtp), A7101AlbLic, A10765AlbProAT, A10019AlbHhfm, A10020AlbGrossT, A10837AlbTrnNc, Boolean.valueOf(n10017AlbFmd), A10017AlbFmd, A10835AlbTrnNm, A10018ALbFmdc, A10836AlbTrnDm, A5140AlbMarca, Byte.valueOf(A3867AlbLocDes), Byte.valueOf(A3866AlbLocCar), Byte.valueOf(A914AlbPObsCon), A5141AlbIvaCod, A7987AlbColCa, Integer.valueOf(A7162AlbDesp), A7986AlbCambio, Integer.valueOf(A7985AlbTipDoc), A7984AlbMotTr, Byte.valueOf(A5803AlbTipCal), A7988AlbObsCb, Long.valueOf(A7102AlbNumT), A7100AlbMarCo, A7099AlbOComp, A14074AlbPdTipAT, A14073AlbPdSerAT, A14069AlbPdATCUD, A14404AlbEnvMail, A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli), Short.valueOf(A840TrnCod), Boolean.valueOf(n3108AlbDivCod), Byte.valueOf(A3108AlbDivCod), A396EmprCod, Long.valueOf(A30AlbProCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
                  if ( (pr_default.getStatus(18) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCALPRD"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1U63( ) ;
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
         endLevel1U63( ) ;
      }
      closeExtendedTableCursors1U63( ) ;
   }

   public void deferredUpdate1U63( )
   {
   }

   public void delete( )
   {
      beforeValidate1U63( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1U63( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1U63( ) ;
         afterConfirm1U63( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1U63( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01U621 */
               pr_default.execute(19, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
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
      sMode3 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1U63( ) ;
      Gx_mode = sMode3 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1U63( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A14362Firma4dig = GXutil.substring( A10017AlbFmd, 1, 1) + GXutil.substring( A10017AlbFmd, 11, 1) + GXutil.substring( A10017AlbFmd, 21, 1) + GXutil.substring( A10017AlbFmd, 31, 1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14362Firma4dig", A14362Firma4dig);
         /* Using cursor T01U622 */
         pr_default.execute(20, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
         A1244GuiRemCln = T01U622_A1244GuiRemCln[0] ;
         A3145GuiRemDivT = T01U622_A3145GuiRemDivT[0] ;
         n3145GuiRemDivT = T01U622_n3145GuiRemDivT[0] ;
         A3110GuiRemDiv = T01U622_A3110GuiRemDiv[0] ;
         n3110GuiRemDiv = T01U622_n3110GuiRemDiv[0] ;
         pr_default.close(20);
         /* Using cursor T01U623 */
         pr_default.execute(21, new Object[] {A1253EmprGuiRem, Short.valueOf(A840TrnCod)});
         A841TrnNom = T01U623_A841TrnNom[0] ;
         n841TrnNom = T01U623_n841TrnNom[0] ;
         A3643TrnNif = T01U623_A3643TrnNif[0] ;
         n3643TrnNif = T01U623_n3643TrnNif[0] ;
         pr_default.close(21);
         /* Using cursor T01U624 */
         pr_default.execute(22, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli), Boolean.valueOf(n1259AlbDomEnv), Byte.valueOf(A1259AlbDomEnv)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            A1260BusDomEnv = T01U624_A1260BusDomEnv[0] ;
            n1260BusDomEnv = T01U624_n1260BusDomEnv[0] ;
         }
         else
         {
            A1260BusDomEnv = (byte)(0) ;
            n1260BusDomEnv = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1260BusDomEnv", GXutil.str( A1260BusDomEnv, 1, 0));
         }
         pr_default.close(22);
         /* Using cursor T01U625 */
         pr_default.execute(23, new Object[] {Boolean.valueOf(n3108AlbDivCod), Byte.valueOf(A3108AlbDivCod)});
         A3109AlbDivAbr = T01U625_A3109AlbDivAbr[0] ;
         n3109AlbDivAbr = T01U625_n3109AlbDivAbr[0] ;
         pr_default.close(23);
         /* Using cursor T01U626 */
         pr_default.execute(24, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod)});
         A841TrnNom = T01U626_A841TrnNom[0] ;
         n841TrnNom = T01U626_n841TrnNom[0] ;
         A3643TrnNif = T01U626_A3643TrnNif[0] ;
         n3643TrnNif = T01U626_n3643TrnNif[0] ;
         pr_default.close(24);
         GXt_date14 = A14396AlbFecAnt ;
         GXv_date15[0] = GXt_date14 ;
         new app.documentotransporteproduccion.documentotransporteproduccion_fechadocumentoanterior(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, A39AlbProPri, GXv_date15) ;
         documentodetransporteproduccion_1_impl.this.GXt_date14 = GXv_date15[0] ;
         A14396AlbFecAnt = GXt_date14 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14396AlbFecAnt", localUtil.format(A14396AlbFecAnt, "99/99/99"));
         GXt_decimal16 = A14253AlbImporte ;
         GXv_decimal17[0] = GXt_decimal16 ;
         new app.importedocumento(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, GXv_decimal17) ;
         documentodetransporteproduccion_1_impl.this.GXt_decimal16 = GXv_decimal17[0] ;
         A14253AlbImporte = GXt_decimal16 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14253AlbImporte", GXutil.ltrimstr( A14253AlbImporte, 15, 2));
         GXt_int18 = A14252AlbLineasA ;
         GXv_int19[0] = GXt_int18 ;
         new app.documentotransporteproduccion.haydatosalbbar(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, GXv_int19) ;
         documentodetransporteproduccion_1_impl.this.GXt_int18 = GXv_int19[0] ;
         A14252AlbLineasA = GXt_int18 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14252AlbLineasA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14252AlbLineasA), 4, 0));
         if ( ( GXutil.strcmp(Gx_mode, "INS") != 0 ) && ( A14252AlbLineasA == 1 ) )
         {
            Combo_guiremcli_Enabled = false ;
            ucCombo_guiremcli.sendProperty(context, "", false, Combo_guiremcli_Internalname, "Enabled", GXutil.booltostr( Combo_guiremcli_Enabled));
         }
         GXt_int18 = A14251AlbFactura ;
         GXv_int19[0] = GXt_int18 ;
         new app.facturacion.documentofacturable(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, GXv_int19) ;
         documentodetransporteproduccion_1_impl.this.GXt_int18 = GXv_int19[0] ;
         A14251AlbFactura = (byte)(GXt_int18) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14251AlbFactura", GXutil.str( A14251AlbFactura, 1, 0));
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01U627 */
         pr_default.execute(25, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tabla Observaciones ALBARAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T01U628 */
         pr_default.execute(26, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tabla Hdrs Albaran", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T01U629 */
         pr_default.execute(27, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CNOTRET", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T01U630 */
         pr_default.execute(28, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBBAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T01U631 */
         pr_default.execute(29, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSALB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
      }
   }

   public void endLevel1U63( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1U63( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "documentotransporteproduccion.documentodetransporteproduccion_1");
         if ( AnyError == 0 )
         {
            confirmValues1U60( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "documentotransporteproduccion.documentodetransporteproduccion_1");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1U63( )
   {
      /* Scan By routine */
      /* Using cursor T01U632 */
      pr_default.execute(30);
      RcdFound3 = (short)(0) ;
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A396EmprCod = T01U632_A396EmprCod[0] ;
         A30AlbProCod = T01U632_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1U63( )
   {
      /* Scan next routine */
      pr_default.readNext(30);
      RcdFound3 = (short)(0) ;
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A396EmprCod = T01U632_A396EmprCod[0] ;
         A30AlbProCod = T01U632_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
   }

   public void scanEnd1U63( )
   {
      pr_default.close(30);
   }

   public void afterConfirm1U63( )
   {
      /* After Confirm Rules */
      if ( ( A1243GuiRemCli == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente NO valido", ""), 1, "GUIREMCLI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtGuiRemCli_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert1U63( )
   {
      /* Before Insert Rules */
      GXv_char4[0] = A14069AlbPdATCUD ;
      GXv_char3[0] = A14073AlbPdSerAT ;
      GXv_char2[0] = A14074AlbPdTipAT ;
      new app.patcud(remoteHandle, context).execute( A396EmprCod, AV21ContCod, GXv_char4, GXv_char3, GXv_char2, GXutil.trim( Gx_mode)+"/"+GXutil.trim( AV54Pgmname)+"."+GXutil.trim( AV55Pgmdesc)) ;
      documentodetransporteproduccion_1_impl.this.A14069AlbPdATCUD = GXv_char4[0] ;
      documentodetransporteproduccion_1_impl.this.A14073AlbPdSerAT = GXv_char3[0] ;
      documentodetransporteproduccion_1_impl.this.A14074AlbPdTipAT = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A14069AlbPdATCUD", A14069AlbPdATCUD);
      httpContext.ajax_rsp_assign_attri("", false, "A14073AlbPdSerAT", A14073AlbPdSerAT);
      httpContext.ajax_rsp_assign_attri("", false, "A14074AlbPdTipAT", A14074AlbPdTipAT);
      if ( (GXutil.strcmp("", A14069AlbPdATCUD)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta codigo ATCUD", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( (0==A840TrnCod) )
      {
         A840TrnCod = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      }
      if ( (0==A30AlbProCod) )
      {
         GXv_int9[0] = (int)(A30AlbProCod) ;
         new app.pnumdoc(remoteHandle, context).execute( AV7EmprCod, AV21ContCod, GXv_int9) ;
         documentodetransporteproduccion_1_impl.this.A30AlbProCod = GXv_int9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
   }

   public void beforeUpdate1U63( )
   {
      /* Before Update Rules */
      GXv_char4[0] = A14069AlbPdATCUD ;
      GXv_char3[0] = A14073AlbPdSerAT ;
      GXv_char2[0] = A14074AlbPdTipAT ;
      new app.patcud(remoteHandle, context).execute( A396EmprCod, AV21ContCod, GXv_char4, GXv_char3, GXv_char2, GXutil.trim( Gx_mode)+"/"+GXutil.trim( AV54Pgmname)+"."+GXutil.trim( AV55Pgmdesc)) ;
      documentodetransporteproduccion_1_impl.this.A14069AlbPdATCUD = GXv_char4[0] ;
      documentodetransporteproduccion_1_impl.this.A14073AlbPdSerAT = GXv_char3[0] ;
      documentodetransporteproduccion_1_impl.this.A14074AlbPdTipAT = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A14069AlbPdATCUD", A14069AlbPdATCUD);
      httpContext.ajax_rsp_assign_attri("", false, "A14073AlbPdSerAT", A14073AlbPdSerAT);
      httpContext.ajax_rsp_assign_attri("", false, "A14074AlbPdTipAT", A14074AlbPdTipAT);
      if ( (GXutil.strcmp("", A14069AlbPdATCUD)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta codigo ATCUD", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( (0==A840TrnCod) )
      {
         A840TrnCod = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      }
   }

   public void beforeDelete1U63( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1U63( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1U63( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1U63( )
   {
      edtAlbProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      edtAlbProfch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProfch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProfch_Enabled), 5, 0), true);
      edtAlbFecAnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbFecAnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbFecAnt_Enabled), 5, 0), true);
      edtGuiRemCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiRemCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemCli_Enabled), 5, 0), true);
      edtAlbCliDes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbCliDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCliDes_Enabled), 5, 0), true);
      edtAlbUsu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbUsu_Enabled), 5, 0), true);
      edtAlbDomEnv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDomEnv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDomEnv_Enabled), 5, 0), true);
      edtTrnCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      edtAlbMat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbMat_Enabled), 5, 0), true);
      edtAlbFecSal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbFecSal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbFecSal_Enabled), 5, 0), true);
      edtAlbHorSal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHorSal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHorSal_Enabled), 5, 0), true);
      cmbavAlbpropri.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbpropri.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavAlbpropri.getEnabled(), 5, 0), true);
      edtavContcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavContcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavContcod_Enabled), 5, 0), true);
      edtAlbLineasA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbLineasA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbLineasA_Enabled), 5, 0), true);
      cmbAlbEnvFtp.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbEnvFtp.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbEnvFtp.getEnabled(), 5, 0), true);
      edtAlbLic_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbLic_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbLic_Enabled), 5, 0), true);
      cmbAlbProAT.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProAT.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbProAT.getEnabled(), 5, 0), true);
      edtAlbHhfm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHhfm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHhfm_Enabled), 5, 0), true);
      edtAlbPdATCUD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPdATCUD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPdATCUD_Enabled), 5, 0), true);
      edtFirma4dig_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFirma4dig_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFirma4dig_Enabled), 5, 0), true);
      edtAlbTrnNm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbTrnNm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTrnNm_Enabled), 5, 0), true);
      edtAlbTrnDm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbTrnDm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTrnDm_Enabled), 5, 0), true);
      edtAlbTrnNc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbTrnNc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTrnNc_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavComboguiremcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboguiremcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboguiremcli_Enabled), 5, 0), true);
      edtavComboalbclides_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboalbclides_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboalbclides_Enabled), 5, 0), true);
      edtavComboalbdomenv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboalbdomenv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboalbdomenv_Enabled), 5, 0), true);
      edtavCombotrncod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombotrncod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombotrncod_Enabled), 5, 0), true);
      edtAlbGrossT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbGrossT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbGrossT_Enabled), 5, 0), true);
      edtAlbSec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbSec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbSec_Enabled), 5, 0), true);
      edtAlbProPri_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProPri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProPri_Enabled), 5, 0), true);
      edtAlbProEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProEst_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1U63( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROPRI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17AlbProPri, "9"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV21ContCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBENVFTP", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A5805AlbEnvFtp), "9")));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1U60( )
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_1", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8AlbProCod,10,0)),GXutil.URLEncode(GXutil.rtrim(AV17AlbProPri)),GXutil.URLEncode(GXutil.rtrim(AV21ContCod)),GXutil.URLEncode(GXutil.rtrim(AV22AlbSec))}, new String[] {"Gx_mode","EmprCod","AlbProCod","AlbProPri","ContCod","AlbSec"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROPRI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17AlbProPri, "9"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV21ContCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBENVFTP", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A5805AlbEnvFtp), "9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"DocumentodeTransporteProduccion_1");
      forbiddenHiddens.add("AlbEnvFtp", localUtil.format( DecimalUtil.doubleToDec(A5805AlbEnvFtp), "9"));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("AlbProPri", GXutil.rtrim( localUtil.format( A39AlbProPri, "9")));
      forbiddenHiddens.add("AlbDivTCod", GXutil.rtrim( localUtil.format( A3093AlbDivTCod, "")));
      forbiddenHiddens.add("GuiRemDom", localUtil.format( DecimalUtil.doubleToDec(A1258GuiRemDom), "9"));
      forbiddenHiddens.add("AlbSec", GXutil.rtrim( localUtil.format( A2242AlbSec, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV54Pgmname, "")));
      forbiddenHiddens.add("AlbProEst", localUtil.format( DecimalUtil.doubleToDec(A33AlbProEst), "9"));
      forbiddenHiddens.add("AlbFecSal", localUtil.format(A4023AlbFecSal, "99/99/99"));
      forbiddenHiddens.add("AlbHorSal", GXutil.rtrim( localUtil.format( A3865AlbHorSal, "")));
      forbiddenHiddens.add("AlbUsu", GXutil.rtrim( localUtil.format( A7098AlbUsu, "")));
      forbiddenHiddens.add("AlbLic", GXutil.rtrim( localUtil.format( A7101AlbLic, "")));
      forbiddenHiddens.add("AlbProAT", GXutil.rtrim( localUtil.format( A10765AlbProAT, "")));
      forbiddenHiddens.add("AlbHhfm", localUtil.format( A10019AlbHhfm, "99/99/99 99:99"));
      forbiddenHiddens.add("AlbGrossT", localUtil.format( A10020AlbGrossT, "ZZZZZZZZZ9.99"));
      forbiddenHiddens.add("AlbFmd", GXutil.rtrim( localUtil.format( A10017AlbFmd, "")));
      forbiddenHiddens.add("ALbFmdc", GXutil.rtrim( localUtil.format( A10018ALbFmdc, "")));
      forbiddenHiddens.add("AlbMarca", GXutil.rtrim( localUtil.format( A5140AlbMarca, "")));
      forbiddenHiddens.add("AlbLocDes", localUtil.format( DecimalUtil.doubleToDec(A3867AlbLocDes), "9"));
      forbiddenHiddens.add("AlbLocCar", localUtil.format( DecimalUtil.doubleToDec(A3866AlbLocCar), "9"));
      forbiddenHiddens.add("AlbPObsCon", localUtil.format( DecimalUtil.doubleToDec(A914AlbPObsCon), "Z9"));
      forbiddenHiddens.add("AlbIvaCod", GXutil.rtrim( localUtil.format( A5141AlbIvaCod, "@!")));
      forbiddenHiddens.add("AlbColCa", GXutil.rtrim( localUtil.format( A7987AlbColCa, "")));
      forbiddenHiddens.add("AlbDesp", localUtil.format( DecimalUtil.doubleToDec(A7162AlbDesp), "ZZZZZ9"));
      forbiddenHiddens.add("AlbCambio", localUtil.format( A7986AlbCambio, "Z9.9999"));
      forbiddenHiddens.add("AlbTipDoc", localUtil.format( DecimalUtil.doubleToDec(A7985AlbTipDoc), "ZZZZZZZ9"));
      forbiddenHiddens.add("AlbMotTr", GXutil.rtrim( localUtil.format( A7984AlbMotTr, "")));
      forbiddenHiddens.add("AlbTipCal", localUtil.format( DecimalUtil.doubleToDec(A5803AlbTipCal), "9"));
      forbiddenHiddens.add("AlbObsCb", GXutil.rtrim( localUtil.format( A7988AlbObsCb, "")));
      forbiddenHiddens.add("AlbNumT", localUtil.format( DecimalUtil.doubleToDec(A7102AlbNumT), "ZZZZZZZZZ9"));
      forbiddenHiddens.add("AlbMarCo", GXutil.rtrim( localUtil.format( A7100AlbMarCo, "")));
      forbiddenHiddens.add("AlbOComp", GXutil.rtrim( localUtil.format( A7099AlbOComp, "")));
      forbiddenHiddens.add("AlbEnvMail", localUtil.format( A14404AlbEnvMail, "99/99/99 99:99"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("documentotransporteproduccion\\documentodetransporteproduccion_1:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z30AlbProCod", GXutil.ltrim( localUtil.ntoc( Z30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1259AlbDomEnv", GXutil.ltrim( localUtil.ntoc( Z1259AlbDomEnv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3869AlbCliDes", GXutil.ltrim( localUtil.ntoc( Z3869AlbCliDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z39AlbProPri", GXutil.rtrim( Z39AlbProPri));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3093AlbDivTCod", GXutil.rtrim( Z3093AlbDivTCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1258GuiRemDom", GXutil.ltrim( localUtil.ntoc( Z1258GuiRemDom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2242AlbSec", GXutil.rtrim( Z2242AlbSec));
      app.GxWebStd.gx_hidden_field( httpContext, "Z33AlbProEst", GXutil.ltrim( localUtil.ntoc( Z33AlbProEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z34AlbProfch", localUtil.dtoc( Z34AlbProfch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4023AlbFecSal", localUtil.dtoc( Z4023AlbFecSal, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3865AlbHorSal", GXutil.rtrim( Z3865AlbHorSal));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7098AlbUsu", GXutil.rtrim( Z7098AlbUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3868AlbMat", GXutil.rtrim( Z3868AlbMat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5805AlbEnvFtp", GXutil.ltrim( localUtil.ntoc( Z5805AlbEnvFtp, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7101AlbLic", GXutil.rtrim( Z7101AlbLic));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10765AlbProAT", GXutil.rtrim( Z10765AlbProAT));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10019AlbHhfm", localUtil.ttoc( Z10019AlbHhfm, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10020AlbGrossT", GXutil.ltrim( localUtil.ntoc( Z10020AlbGrossT, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10837AlbTrnNc", GXutil.rtrim( Z10837AlbTrnNc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10017AlbFmd", Z10017AlbFmd);
      app.GxWebStd.gx_hidden_field( httpContext, "Z10835AlbTrnNm", GXutil.rtrim( Z10835AlbTrnNm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10018ALbFmdc", GXutil.rtrim( Z10018ALbFmdc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10836AlbTrnDm", GXutil.rtrim( Z10836AlbTrnDm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5140AlbMarca", GXutil.rtrim( Z5140AlbMarca));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3867AlbLocDes", GXutil.ltrim( localUtil.ntoc( Z3867AlbLocDes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3866AlbLocCar", GXutil.ltrim( localUtil.ntoc( Z3866AlbLocCar, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z914AlbPObsCon", GXutil.ltrim( localUtil.ntoc( Z914AlbPObsCon, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5141AlbIvaCod", GXutil.rtrim( Z5141AlbIvaCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7987AlbColCa", GXutil.rtrim( Z7987AlbColCa));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7162AlbDesp", GXutil.ltrim( localUtil.ntoc( Z7162AlbDesp, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7986AlbCambio", GXutil.ltrim( localUtil.ntoc( Z7986AlbCambio, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7985AlbTipDoc", GXutil.ltrim( localUtil.ntoc( Z7985AlbTipDoc, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7984AlbMotTr", GXutil.rtrim( Z7984AlbMotTr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5803AlbTipCal", GXutil.ltrim( localUtil.ntoc( Z5803AlbTipCal, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7988AlbObsCb", GXutil.rtrim( Z7988AlbObsCb));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7102AlbNumT", GXutil.ltrim( localUtil.ntoc( Z7102AlbNumT, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7100AlbMarCo", GXutil.rtrim( Z7100AlbMarCo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7099AlbOComp", GXutil.rtrim( Z7099AlbOComp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14074AlbPdTipAT", GXutil.rtrim( Z14074AlbPdTipAT));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14073AlbPdSerAT", GXutil.rtrim( Z14073AlbPdSerAT));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14069AlbPdATCUD", GXutil.rtrim( Z14069AlbPdATCUD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14404AlbEnvMail", localUtil.ttoc( Z14404AlbEnvMail, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1253EmprGuiRem", GXutil.rtrim( Z1253EmprGuiRem));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1243GuiRemCli", GXutil.ltrim( localUtil.ntoc( Z1243GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z840TrnCod", GXutil.ltrim( localUtil.ntoc( Z840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3108AlbDivCod", GXutil.ltrim( localUtil.ntoc( Z3108AlbDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N1243GuiRemCli", GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N840TrnCod", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N3108AlbDivCod", GXutil.ltrim( localUtil.ntoc( A3108AlbDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N1253EmprGuiRem", GXutil.rtrim( A1253EmprGuiRem));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGUIREMCLI_DATA", AV23GuiRemCli_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGUIREMCLI_DATA", AV23GuiRemCli_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vALBCLIDES_DATA", AV26AlbCliDes_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vALBCLIDES_DATA", AV26AlbCliDes_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV33DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV33DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vALBDOMENV_DATA", AV31AlbDomEnv_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vALBDOMENV_DATA", AV31AlbDomEnv_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCOD_DATA", AV29TrnCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCOD_DATA", AV29TrnCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV49Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV49Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHASH", AV47Hash);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHASH", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV47Hash, ""))));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vOK", AV44ok);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOK", getSecureSignedToken( "", AV44ok));
      app.GxWebStd.gx_hidden_field( httpContext, "vMESSAGES_JSON", AV45Messages_json);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMESSAGES_JSON", getSecureSignedToken( "", AV45Messages_json));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBIMPORTE", GXutil.ltrim( localUtil.ntoc( A14253AlbImporte, (byte)(15), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBFACTURA", GXutil.ltrim( localUtil.ntoc( A14251AlbFactura, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBFMD", A10017AlbFmd);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROCOD", GXutil.ltrim( localUtil.ntoc( AV8AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8AlbProCod), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_GUIREMCLI", GXutil.ltrim( localUtil.ntoc( AV12Insert_GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_TRNCOD", GXutil.ltrim( localUtil.ntoc( AV13Insert_TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_ALBDIVCOD", GXutil.ltrim( localUtil.ntoc( AV14Insert_AlbDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBDIVCOD", GXutil.ltrim( localUtil.ntoc( A3108AlbDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_EMPRGUIREM", GXutil.rtrim( AV15Insert_EmprGuiRem));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRGUIREM", GXutil.rtrim( A1253EmprGuiRem));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBDIVTCOD", GXutil.rtrim( A3093AlbDivTCod));
      app.GxWebStd.gx_hidden_field( httpContext, "GUIREMDOM", GXutil.ltrim( localUtil.ntoc( A1258GuiRemDom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBSEC", GXutil.rtrim( AV22AlbSec));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBSEC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV22AlbSec, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBMARCA", GXutil.rtrim( A5140AlbMarca));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV20UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMDESC", GXutil.rtrim( AV55Pgmdesc));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPDSERAT", GXutil.rtrim( A14073AlbPdSerAT));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPDTIPAT", GXutil.rtrim( A14074AlbPdTipAT));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBFMDC", GXutil.rtrim( A10018ALbFmdc));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBLOCDES", GXutil.ltrim( localUtil.ntoc( A3867AlbLocDes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBLOCCAR", GXutil.ltrim( localUtil.ntoc( A3866AlbLocCar, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPOBSCON", GXutil.ltrim( localUtil.ntoc( A914AlbPObsCon, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBIVACOD", GXutil.rtrim( A5141AlbIvaCod));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOLCA", GXutil.rtrim( A7987AlbColCa));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBDESP", GXutil.ltrim( localUtil.ntoc( A7162AlbDesp, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCAMBIO", GXutil.ltrim( localUtil.ntoc( A7986AlbCambio, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBTIPDOC", GXutil.ltrim( localUtil.ntoc( A7985AlbTipDoc, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBMOTTR", GXutil.rtrim( A7984AlbMotTr));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBTIPCAL", GXutil.ltrim( localUtil.ntoc( A5803AlbTipCal, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBOBSCB", GXutil.rtrim( A7988AlbObsCb));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBNUMT", GXutil.ltrim( localUtil.ntoc( A7102AlbNumT, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBMARCO", GXutil.rtrim( A7100AlbMarCo));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBOCOMP", GXutil.rtrim( A7099AlbOComp));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBENVMAIL", localUtil.ttoc( A14404AlbEnvMail, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "GUIREMCLN", GXutil.rtrim( A1244GuiRemCln));
      app.GxWebStd.gx_hidden_field( httpContext, "GUIREMDIVT", GXutil.rtrim( A3145GuiRemDivT));
      app.GxWebStd.gx_hidden_field( httpContext, "GUIREMDIV", GXutil.ltrim( localUtil.ntoc( A3110GuiRemDiv, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "TRNNOM", GXutil.rtrim( A841TrnNom));
      app.GxWebStd.gx_hidden_field( httpContext, "TRNNIF", GXutil.rtrim( A3643TrnNif));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBDIVABR", GXutil.rtrim( A3109AlbDivAbr));
      app.GxWebStd.gx_hidden_field( httpContext, "BUSDOMENV", GXutil.ltrim( localUtil.ntoc( A1260BusDomEnv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_GUIREMCLI_Objectcall", GXutil.rtrim( Combo_guiremcli_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_GUIREMCLI_Cls", GXutil.rtrim( Combo_guiremcli_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_GUIREMCLI_Selectedvalue_set", GXutil.rtrim( Combo_guiremcli_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_GUIREMCLI_Enabled", GXutil.booltostr( Combo_guiremcli_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_GUIREMCLI_Emptyitem", GXutil.booltostr( Combo_guiremcli_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBCLIDES_Objectcall", GXutil.rtrim( Combo_albclides_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBCLIDES_Cls", GXutil.rtrim( Combo_albclides_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBCLIDES_Selectedvalue_set", GXutil.rtrim( Combo_albclides_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBCLIDES_Enabled", GXutil.booltostr( Combo_albclides_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBCLIDES_Emptyitem", GXutil.booltostr( Combo_albclides_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBDOMENV_Objectcall", GXutil.rtrim( Combo_albdomenv_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBDOMENV_Cls", GXutil.rtrim( Combo_albdomenv_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBDOMENV_Selectedvalue_set", GXutil.rtrim( Combo_albdomenv_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBDOMENV_Enabled", GXutil.booltostr( Combo_albdomenv_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBDOMENV_Emptyitemtext", GXutil.rtrim( Combo_albdomenv_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRNCOD_Objectcall", GXutil.rtrim( Combo_trncod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRNCOD_Cls", GXutil.rtrim( Combo_trncod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRNCOD_Selectedvalue_set", GXutil.rtrim( Combo_trncod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRNCOD_Enabled", GXutil.booltostr( Combo_trncod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRNCOD_Emptyitemtext", GXutil.rtrim( Combo_trncod_Emptyitemtext));
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
      return formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_1", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8AlbProCod,10,0)),GXutil.URLEncode(GXutil.rtrim(AV17AlbProPri)),GXutil.URLEncode(GXutil.rtrim(AV21ContCod)),GXutil.URLEncode(GXutil.rtrim(AV22AlbSec))}, new String[] {"Gx_mode","EmprCod","AlbProCod","AlbProPri","ContCod","AlbSec"})  ;
   }

   public String getPgmname( )
   {
      return "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_1" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Documento de Transporte Produccion", "") ;
   }

   public void initializeNonKey1U63( )
   {
      A1243GuiRemCli = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
      A840TrnCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      A3108AlbDivCod = (byte)(0) ;
      n3108AlbDivCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3108AlbDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3108AlbDivCod), 2, 0));
      A1253EmprGuiRem = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1253EmprGuiRem", A1253EmprGuiRem);
      A1259AlbDomEnv = (byte)(0) ;
      n1259AlbDomEnv = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1259AlbDomEnv", GXutil.str( A1259AlbDomEnv, 1, 0));
      A39AlbProPri = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
      A3093AlbDivTCod = "" ;
      n3093AlbDivTCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3093AlbDivTCod", A3093AlbDivTCod);
      A1258GuiRemDom = (byte)(0) ;
      n1258GuiRemDom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1258GuiRemDom", GXutil.str( A1258GuiRemDom, 1, 0));
      A2242AlbSec = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2242AlbSec", A2242AlbSec);
      A14362Firma4dig = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14362Firma4dig", A14362Firma4dig);
      A1260BusDomEnv = (byte)(0) ;
      n1260BusDomEnv = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1260BusDomEnv", GXutil.str( A1260BusDomEnv, 1, 0));
      A14251AlbFactura = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14251AlbFactura", GXutil.str( A14251AlbFactura, 1, 0));
      A14252AlbLineasA = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14252AlbLineasA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14252AlbLineasA), 4, 0));
      A14253AlbImporte = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14253AlbImporte", GXutil.ltrimstr( A14253AlbImporte, 15, 2));
      A14396AlbFecAnt = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A14396AlbFecAnt", localUtil.format(A14396AlbFecAnt, "99/99/99"));
      A33AlbProEst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A33AlbProEst", GXutil.str( A33AlbProEst, 1, 0));
      A4023AlbFecSal = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A4023AlbFecSal", localUtil.format(A4023AlbFecSal, "99/99/99"));
      A3865AlbHorSal = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3865AlbHorSal", A3865AlbHorSal);
      A1244GuiRemCln = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", A1244GuiRemCln);
      A841TrnNom = "" ;
      n841TrnNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      A3868AlbMat = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3868AlbMat", A3868AlbMat);
      A5805AlbEnvFtp = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBENVFTP", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A5805AlbEnvFtp), "9")));
      A7101AlbLic = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7101AlbLic", A7101AlbLic);
      A10019AlbHhfm = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A10019AlbHhfm", localUtil.ttoc( A10019AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A10020AlbGrossT = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A10020AlbGrossT", GXutil.ltrimstr( A10020AlbGrossT, 13, 2));
      A10837AlbTrnNc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10837AlbTrnNc", A10837AlbTrnNc);
      A10017AlbFmd = "" ;
      n10017AlbFmd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10017AlbFmd", A10017AlbFmd);
      A10835AlbTrnNm = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10835AlbTrnNm", A10835AlbTrnNm);
      A10018ALbFmdc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10018ALbFmdc", A10018ALbFmdc);
      A10836AlbTrnDm = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10836AlbTrnDm", A10836AlbTrnDm);
      A3867AlbLocDes = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3867AlbLocDes", GXutil.str( A3867AlbLocDes, 1, 0));
      A3866AlbLocCar = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3866AlbLocCar", GXutil.str( A3866AlbLocCar, 1, 0));
      A914AlbPObsCon = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
      A5141AlbIvaCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5141AlbIvaCod", A5141AlbIvaCod);
      A7987AlbColCa = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7987AlbColCa", A7987AlbColCa);
      A7162AlbDesp = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A7162AlbDesp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7162AlbDesp), 6, 0));
      A7986AlbCambio = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A7986AlbCambio", GXutil.ltrimstr( A7986AlbCambio, 7, 4));
      A7985AlbTipDoc = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A7985AlbTipDoc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7985AlbTipDoc), 8, 0));
      A7984AlbMotTr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7984AlbMotTr", A7984AlbMotTr);
      A5803AlbTipCal = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5803AlbTipCal", GXutil.str( A5803AlbTipCal, 1, 0));
      A7988AlbObsCb = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7988AlbObsCb", A7988AlbObsCb);
      A7102AlbNumT = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A7102AlbNumT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7102AlbNumT), 10, 0));
      A7100AlbMarCo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7100AlbMarCo", A7100AlbMarCo);
      A7099AlbOComp = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7099AlbOComp", A7099AlbOComp);
      A3643TrnNif = "" ;
      n3643TrnNif = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3643TrnNif", A3643TrnNif);
      A3109AlbDivAbr = "" ;
      n3109AlbDivAbr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3109AlbDivAbr", A3109AlbDivAbr);
      A3145GuiRemDivT = "" ;
      n3145GuiRemDivT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3145GuiRemDivT", A3145GuiRemDivT);
      A3110GuiRemDiv = (byte)(0) ;
      n3110GuiRemDiv = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3110GuiRemDiv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3110GuiRemDiv), 2, 0));
      A14074AlbPdTipAT = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14074AlbPdTipAT", A14074AlbPdTipAT);
      A14073AlbPdSerAT = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14073AlbPdSerAT", A14073AlbPdSerAT);
      A14069AlbPdATCUD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14069AlbPdATCUD", A14069AlbPdATCUD);
      A14404AlbEnvMail = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A14404AlbEnvMail", localUtil.ttoc( A14404AlbEnvMail, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A3869AlbCliDes = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3869AlbCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3869AlbCliDes), 6, 0));
      A34AlbProfch = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
      A7098AlbUsu = AV20UsurCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A7098AlbUsu", A7098AlbUsu);
      A10765AlbProAT = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "A10765AlbProAT", A10765AlbProAT);
      A5140AlbMarca = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "A5140AlbMarca", A5140AlbMarca);
      Z1259AlbDomEnv = (byte)(0) ;
      Z3869AlbCliDes = 0 ;
      Z39AlbProPri = "" ;
      Z3093AlbDivTCod = "" ;
      Z1258GuiRemDom = (byte)(0) ;
      Z2242AlbSec = "" ;
      Z33AlbProEst = (byte)(0) ;
      Z34AlbProfch = GXutil.nullDate() ;
      Z4023AlbFecSal = GXutil.nullDate() ;
      Z3865AlbHorSal = "" ;
      Z7098AlbUsu = "" ;
      Z3868AlbMat = "" ;
      Z5805AlbEnvFtp = (byte)(0) ;
      Z7101AlbLic = "" ;
      Z10765AlbProAT = "" ;
      Z10019AlbHhfm = GXutil.resetTime( GXutil.nullDate() );
      Z10020AlbGrossT = DecimalUtil.ZERO ;
      Z10837AlbTrnNc = "" ;
      Z10017AlbFmd = "" ;
      Z10835AlbTrnNm = "" ;
      Z10018ALbFmdc = "" ;
      Z10836AlbTrnDm = "" ;
      Z5140AlbMarca = "" ;
      Z3867AlbLocDes = (byte)(0) ;
      Z3866AlbLocCar = (byte)(0) ;
      Z914AlbPObsCon = (byte)(0) ;
      Z5141AlbIvaCod = "" ;
      Z7987AlbColCa = "" ;
      Z7162AlbDesp = 0 ;
      Z7986AlbCambio = DecimalUtil.ZERO ;
      Z7985AlbTipDoc = 0 ;
      Z7984AlbMotTr = "" ;
      Z5803AlbTipCal = (byte)(0) ;
      Z7988AlbObsCb = "" ;
      Z7102AlbNumT = 0 ;
      Z7100AlbMarCo = "" ;
      Z7099AlbOComp = "" ;
      Z14074AlbPdTipAT = "" ;
      Z14073AlbPdSerAT = "" ;
      Z14069AlbPdATCUD = "" ;
      Z14404AlbEnvMail = GXutil.resetTime( GXutil.nullDate() );
      Z1253EmprGuiRem = "" ;
      Z1243GuiRemCli = 0 ;
      Z840TrnCod = (short)(0) ;
      Z3108AlbDivCod = (byte)(0) ;
   }

   public void initAll1U63( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A30AlbProCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      initializeNonKey1U63( ) ;
   }

   public void standaloneModalInsert( )
   {
      A34AlbProfch = i34AlbProfch ;
      httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
      A5140AlbMarca = i5140AlbMarca ;
      httpContext.ajax_rsp_assign_attri("", false, "A5140AlbMarca", A5140AlbMarca);
      A7098AlbUsu = i7098AlbUsu ;
      httpContext.ajax_rsp_assign_attri("", false, "A7098AlbUsu", A7098AlbUsu);
      A10765AlbProAT = i10765AlbProAT ;
      httpContext.ajax_rsp_assign_attri("", false, "A10765AlbProAT", A10765AlbProAT);
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116103184", true, true);
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
      httpContext.AddJavascriptSource("documentotransporteproduccion/documentodetransporteproduccion_1.js", "?202682116103185", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      edtAlbProCod_Internalname = "ALBPROCOD" ;
      edtAlbProfch_Internalname = "ALBPROFCH" ;
      edtAlbFecAnt_Internalname = "ALBFECANT" ;
      lblTextblockguiremcli_Internalname = "TEXTBLOCKGUIREMCLI" ;
      Combo_guiremcli_Internalname = "COMBO_GUIREMCLI" ;
      edtGuiRemCli_Internalname = "GUIREMCLI" ;
      divTablesplittedguiremcli_Internalname = "TABLESPLITTEDGUIREMCLI" ;
      lblTextblockalbclides_Internalname = "TEXTBLOCKALBCLIDES" ;
      Combo_albclides_Internalname = "COMBO_ALBCLIDES" ;
      edtAlbCliDes_Internalname = "ALBCLIDES" ;
      divTablesplittedalbclides_Internalname = "TABLESPLITTEDALBCLIDES" ;
      edtAlbUsu_Internalname = "ALBUSU" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      lblTextblockalbdomenv_Internalname = "TEXTBLOCKALBDOMENV" ;
      Combo_albdomenv_Internalname = "COMBO_ALBDOMENV" ;
      edtAlbDomEnv_Internalname = "ALBDOMENV" ;
      divTablesplittedalbdomenv_Internalname = "TABLESPLITTEDALBDOMENV" ;
      lblTextblocktrncod_Internalname = "TEXTBLOCKTRNCOD" ;
      Combo_trncod_Internalname = "COMBO_TRNCOD" ;
      edtTrnCod_Internalname = "TRNCOD" ;
      divTablesplittedtrncod_Internalname = "TABLESPLITTEDTRNCOD" ;
      edtAlbMat_Internalname = "ALBMAT" ;
      edtAlbFecSal_Internalname = "ALBFECSAL" ;
      edtAlbHorSal_Internalname = "ALBHORSAL" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      cmbavAlbpropri.setInternalname( "vALBPROPRI" );
      edtavContcod_Internalname = "vCONTCOD" ;
      edtAlbLineasA_Internalname = "ALBLINEASA" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      cmbAlbEnvFtp.setInternalname( "ALBENVFTP" );
      edtAlbLic_Internalname = "ALBLIC" ;
      cmbAlbProAT.setInternalname( "ALBPROAT" );
      edtAlbHhfm_Internalname = "ALBHHFM" ;
      edtAlbPdATCUD_Internalname = "ALBPDATCUD" ;
      edtFirma4dig_Internalname = "FIRMA4DIG" ;
      divUnnamedtable11_Internalname = "UNNAMEDTABLE11" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      Dvpanel_unnamedtable7_Internalname = "DVPANEL_UNNAMEDTABLE7" ;
      edtAlbTrnNm_Internalname = "ALBTRNNM" ;
      edtAlbTrnDm_Internalname = "ALBTRNDM" ;
      divUnnamedtable9_Internalname = "UNNAMEDTABLE9" ;
      edtAlbTrnNc_Internalname = "ALBTRNNC" ;
      divUnnamedtable10_Internalname = "UNNAMEDTABLE10" ;
      divUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
      Dvpanel_unnamedtable8_Internalname = "DVPANEL_UNNAMEDTABLE8" ;
      divDvpanel_unnamedtable8_cell_Internalname = "DVPANEL_UNNAMEDTABLE8_CELL" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavComboguiremcli_Internalname = "vCOMBOGUIREMCLI" ;
      divSectionattribute_guiremcli_Internalname = "SECTIONATTRIBUTE_GUIREMCLI" ;
      edtavComboalbclides_Internalname = "vCOMBOALBCLIDES" ;
      divSectionattribute_albclides_Internalname = "SECTIONATTRIBUTE_ALBCLIDES" ;
      edtavComboalbdomenv_Internalname = "vCOMBOALBDOMENV" ;
      divSectionattribute_albdomenv_Internalname = "SECTIONATTRIBUTE_ALBDOMENV" ;
      edtavCombotrncod_Internalname = "vCOMBOTRNCOD" ;
      divSectionattribute_trncod_Internalname = "SECTIONATTRIBUTE_TRNCOD" ;
      edtAlbGrossT_Internalname = "ALBGROSST" ;
      edtAlbSec_Internalname = "ALBSEC" ;
      edtAlbProPri_Internalname = "ALBPROPRI" ;
      edtAlbProEst_Internalname = "ALBPROEST" ;
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
      Form.setCaption( httpContext.getMessage( "Documento de Transporte Produccion", "") );
      edtAlbProEst_Jsonclick = "" ;
      edtAlbProEst_Enabled = 0 ;
      edtAlbProEst_Visible = 1 ;
      edtAlbProPri_Jsonclick = "" ;
      edtAlbProPri_Enabled = 0 ;
      edtAlbProPri_Visible = 1 ;
      edtAlbSec_Jsonclick = "" ;
      edtAlbSec_Enabled = 0 ;
      edtAlbSec_Visible = 1 ;
      edtAlbGrossT_Jsonclick = "" ;
      edtAlbGrossT_Enabled = 0 ;
      edtAlbGrossT_Visible = 1 ;
      edtavCombotrncod_Jsonclick = "" ;
      edtavCombotrncod_Enabled = 0 ;
      edtavCombotrncod_Visible = 1 ;
      edtavComboalbdomenv_Jsonclick = "" ;
      edtavComboalbdomenv_Enabled = 0 ;
      edtavComboalbdomenv_Visible = 1 ;
      edtavComboalbclides_Jsonclick = "" ;
      edtavComboalbclides_Enabled = 0 ;
      edtavComboalbclides_Visible = 1 ;
      edtavComboguiremcli_Jsonclick = "" ;
      edtavComboguiremcli_Enabled = 0 ;
      edtavComboguiremcli_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtAlbTrnNc_Jsonclick = "" ;
      edtAlbTrnNc_Enabled = 1 ;
      edtAlbTrnDm_Jsonclick = "" ;
      edtAlbTrnDm_Enabled = 1 ;
      edtAlbTrnNm_Jsonclick = "" ;
      edtAlbTrnNm_Enabled = 1 ;
      Dvpanel_unnamedtable8_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable8_Iconposition = "Right" ;
      Dvpanel_unnamedtable8_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable8_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable8_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable8_Title = httpContext.getMessage( "Transportador", "") ;
      Dvpanel_unnamedtable8_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable8_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable8_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable8_Width = "100%" ;
      divDvpanel_unnamedtable8_cell_Class = "col-xs-12" ;
      edtFirma4dig_Jsonclick = "" ;
      edtFirma4dig_Enabled = 0 ;
      edtAlbPdATCUD_Jsonclick = "" ;
      edtAlbPdATCUD_Enabled = 0 ;
      edtAlbHhfm_Jsonclick = "" ;
      edtAlbHhfm_Enabled = 0 ;
      cmbAlbProAT.setJsonclick( "" );
      cmbAlbProAT.setEnabled( 0 );
      edtAlbLic_Jsonclick = "" ;
      edtAlbLic_Enabled = 0 ;
      cmbAlbEnvFtp.setJsonclick( "" );
      cmbAlbEnvFtp.setEnabled( 0 );
      Dvpanel_unnamedtable7_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Iconposition = "Right" ;
      Dvpanel_unnamedtable7_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable7_Title = httpContext.getMessage( "AT", "") ;
      Dvpanel_unnamedtable7_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable7_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable7_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Width = "100%" ;
      edtAlbLineasA_Jsonclick = "" ;
      edtAlbLineasA_Enabled = 0 ;
      edtavContcod_Jsonclick = "" ;
      edtavContcod_Enabled = 0 ;
      cmbavAlbpropri.setJsonclick( "" );
      cmbavAlbpropri.setEnabled( 0 );
      edtAlbHorSal_Jsonclick = "" ;
      edtAlbHorSal_Enabled = 0 ;
      edtAlbFecSal_Jsonclick = "" ;
      edtAlbFecSal_Enabled = 0 ;
      edtAlbMat_Jsonclick = "" ;
      edtAlbMat_Enabled = 1 ;
      edtTrnCod_Jsonclick = "" ;
      edtTrnCod_Enabled = 1 ;
      edtTrnCod_Visible = 1 ;
      Combo_trncod_Emptyitemtext = "" ;
      Combo_trncod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_trncod_Enabled = GXutil.toBoolean( -1) ;
      edtAlbDomEnv_Jsonclick = "" ;
      edtAlbDomEnv_Enabled = 1 ;
      edtAlbDomEnv_Visible = 1 ;
      Combo_albdomenv_Emptyitemtext = "" ;
      Combo_albdomenv_Cls = "ExtendedCombo AttributeFL" ;
      Combo_albdomenv_Caption = "" ;
      Combo_albdomenv_Enabled = GXutil.toBoolean( -1) ;
      edtAlbUsu_Jsonclick = "" ;
      edtAlbUsu_Enabled = 0 ;
      edtAlbCliDes_Jsonclick = "" ;
      edtAlbCliDes_Enabled = 1 ;
      edtAlbCliDes_Visible = 1 ;
      Combo_albclides_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_albclides_Cls = "ExtendedCombo AttributeFL" ;
      Combo_albclides_Enabled = GXutil.toBoolean( -1) ;
      edtGuiRemCli_Jsonclick = "" ;
      edtGuiRemCli_Enabled = 1 ;
      edtGuiRemCli_Visible = 1 ;
      Combo_guiremcli_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_guiremcli_Cls = "ExtendedCombo AttributeFL" ;
      Combo_guiremcli_Enabled = GXutil.toBoolean( -1) ;
      edtAlbFecAnt_Jsonclick = "" ;
      edtAlbFecAnt_Enabled = 0 ;
      edtAlbProfch_Jsonclick = "" ;
      edtAlbProfch_Enabled = 1 ;
      edtAlbProCod_Jsonclick = "" ;
      edtAlbProCod_Enabled = 1 ;
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

   public void gx3asaalbfecant1U63( String A396EmprCod ,
                                    long A30AlbProCod ,
                                    String A39AlbProPri )
   {
      GXt_date14 = A14396AlbFecAnt ;
      GXv_date15[0] = GXt_date14 ;
      new app.documentotransporteproduccion.documentotransporteproduccion_fechadocumentoanterior(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, A39AlbProPri, GXv_date15) ;
      documentodetransporteproduccion_1_impl.this.GXt_date14 = GXv_date15[0] ;
      A14396AlbFecAnt = GXt_date14 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14396AlbFecAnt", localUtil.format(A14396AlbFecAnt, "99/99/99"));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( localUtil.format(A14396AlbFecAnt, "99/99/99"))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx4asaalbimporte1U63( String A396EmprCod ,
                                     long A30AlbProCod )
   {
      GXt_decimal16 = A14253AlbImporte ;
      GXv_decimal17[0] = GXt_decimal16 ;
      new app.importedocumento(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, GXv_decimal17) ;
      documentodetransporteproduccion_1_impl.this.GXt_decimal16 = GXv_decimal17[0] ;
      A14253AlbImporte = GXt_decimal16 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14253AlbImporte", GXutil.ltrimstr( A14253AlbImporte, 15, 2));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A14253AlbImporte, (byte)(15), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx5asaalblineasa1U63( String A396EmprCod ,
                                     long A30AlbProCod )
   {
      GXt_int18 = A14252AlbLineasA ;
      GXv_int19[0] = GXt_int18 ;
      new app.documentotransporteproduccion.haydatosalbbar(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, GXv_int19) ;
      documentodetransporteproduccion_1_impl.this.GXt_int18 = GXv_int19[0] ;
      A14252AlbLineasA = GXt_int18 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14252AlbLineasA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14252AlbLineasA), 4, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A14252AlbLineasA, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx6asaalbfactura1U63( String A396EmprCod ,
                                     long A30AlbProCod )
   {
      GXt_int18 = A14251AlbFactura ;
      GXv_int19[0] = GXt_int18 ;
      new app.facturacion.documentofacturable(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, GXv_int19) ;
      documentodetransporteproduccion_1_impl.this.GXt_int18 = GXv_int19[0] ;
      A14251AlbFactura = (byte)(GXt_int18) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14251AlbFactura", GXutil.str( A14251AlbFactura, 1, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A14251AlbFactura, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_50_1U63( String AV7EmprCod ,
                           String AV21ContCod ,
                           long A30AlbProCod )
   {
      if ( (0==A30AlbProCod) )
      {
         GXv_int9[0] = (int)(A30AlbProCod) ;
         new app.pnumdoc(remoteHandle, context).execute( AV7EmprCod, AV21ContCod, GXv_int9) ;
         A30AlbProCod = GXv_int9[0] ;
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

   public void xc_53_1U63( )
   {
      GXv_char4[0] = A14069AlbPdATCUD ;
      GXv_char3[0] = A14073AlbPdSerAT ;
      GXv_char2[0] = A14074AlbPdTipAT ;
      new app.patcud(remoteHandle, context).execute( A396EmprCod, AV21ContCod, GXv_char4, GXv_char3, GXv_char2, GXutil.trim( Gx_mode)+"/"+GXutil.trim( AV54Pgmname)+"."+GXutil.trim( AV55Pgmdesc)) ;
      A14069AlbPdATCUD = GXv_char4[0] ;
      A14073AlbPdSerAT = GXv_char3[0] ;
      A14074AlbPdTipAT = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A14069AlbPdATCUD", A14069AlbPdATCUD);
      httpContext.ajax_rsp_assign_attri("", false, "A14073AlbPdSerAT", A14073AlbPdSerAT);
      httpContext.ajax_rsp_assign_attri("", false, "A14074AlbPdTipAT", A14074AlbPdTipAT);
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
      cmbavAlbpropri.setName( "vALBPROPRI" );
      cmbavAlbpropri.setWebtags( "" );
      cmbavAlbpropri.addItem("1", httpContext.getMessage( "Guia Remessa", ""), (short)(0));
      cmbavAlbpropri.addItem("0", httpContext.getMessage( "Guia Transporte sem encargos", ""), (short)(0));
      if ( cmbavAlbpropri.getItemCount() > 0 )
      {
         AV17AlbProPri = cmbavAlbpropri.getValidValue(AV17AlbProPri) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17AlbProPri", AV17AlbProPri);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROPRI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17AlbProPri, "9"))));
      }
      cmbAlbEnvFtp.setName( "ALBENVFTP" );
      cmbAlbEnvFtp.setWebtags( "" );
      cmbAlbEnvFtp.addItem("0", httpContext.getMessage( "Não Enviada", ""), (short)(0));
      cmbAlbEnvFtp.addItem("3", httpContext.getMessage( "Enviada a AT", ""), (short)(0));
      if ( cmbAlbEnvFtp.getItemCount() > 0 )
      {
         A5805AlbEnvFtp = (byte)(GXutil.lval( cmbAlbEnvFtp.getValidValue(GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBENVFTP", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A5805AlbEnvFtp), "9")));
      }
      cmbAlbProAT.setName( "ALBPROAT" );
      cmbAlbProAT.setWebtags( "" );
      cmbAlbProAT.addItem("M", httpContext.getMessage( "Manual", ""), (short)(0));
      cmbAlbProAT.addItem("A", httpContext.getMessage( "Automatica", ""), (short)(0));
      if ( cmbAlbProAT.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A10765AlbProAT)==0) )
         {
            A10765AlbProAT = " " ;
            httpContext.ajax_rsp_assign_attri("", false, "A10765AlbProAT", A10765AlbProAT);
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

   public void valid_Albprocod( )
   {
      GXt_decimal16 = A14253AlbImporte ;
      GXv_decimal17[0] = GXt_decimal16 ;
      new app.importedocumento(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, GXv_decimal17) ;
      documentodetransporteproduccion_1_impl.this.GXt_decimal16 = GXv_decimal17[0] ;
      A14253AlbImporte = GXt_decimal16 ;
      GXt_int18 = A14252AlbLineasA ;
      GXv_int19[0] = GXt_int18 ;
      new app.documentotransporteproduccion.haydatosalbbar(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, GXv_int19) ;
      documentodetransporteproduccion_1_impl.this.GXt_int18 = GXv_int19[0] ;
      A14252AlbLineasA = GXt_int18 ;
      if ( ( GXutil.strcmp(Gx_mode, "INS") != 0 ) && ( A14252AlbLineasA == 1 ) )
      {
         Combo_guiremcli_Enabled = false ;
      }
      GXt_int18 = A14251AlbFactura ;
      GXv_int19[0] = GXt_int18 ;
      new app.facturacion.documentofacturable(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, GXv_int19) ;
      documentodetransporteproduccion_1_impl.this.GXt_int18 = GXv_int19[0] ;
      A14251AlbFactura = (byte)(GXt_int18) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A14253AlbImporte", GXutil.ltrim( localUtil.ntoc( A14253AlbImporte, (byte)(15), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14252AlbLineasA", GXutil.ltrim( localUtil.ntoc( A14252AlbLineasA, (byte)(4), (byte)(0), ".", "")));
      ucCombo_guiremcli.sendProperty(context, "", false, Combo_guiremcli_Internalname, "Enabled", GXutil.booltostr( Combo_guiremcli_Enabled));
      httpContext.ajax_rsp_assign_attri("", false, "A14251AlbFactura", GXutil.ltrim( localUtil.ntoc( A14251AlbFactura, (byte)(1), (byte)(0), ".", "")));
   }

   public void valid_Guiremcli( )
   {
      if ( true )
      {
         A3869AlbCliDes = AV27ComboAlbCliDes ;
      }
      else
      {
         if ( isIns( )  && (0==A3869AlbCliDes) && ( Gx_BScreen == 0 ) )
         {
            A3869AlbCliDes = A1243GuiRemCli ;
         }
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A3869AlbCliDes", GXutil.ltrim( localUtil.ntoc( A3869AlbCliDes, (byte)(6), (byte)(0), ".", "")));
   }

   public void valid_Trncod( )
   {
      n841TrnNom = false ;
      n3643TrnNif = false ;
      /* Using cursor T01U626 */
      pr_default.execute(24, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
         }
      }
      A841TrnNom = T01U626_A841TrnNom[0] ;
      n841TrnNom = T01U626_n841TrnNom[0] ;
      A3643TrnNif = T01U626_A3643TrnNif[0] ;
      n3643TrnNif = T01U626_n3643TrnNif[0] ;
      pr_default.close(24);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", GXutil.rtrim( A841TrnNom));
      httpContext.ajax_rsp_assign_attri("", false, "A3643TrnNif", GXutil.rtrim( A3643TrnNif));
   }

   public void valid_Albpropri( )
   {
      GXt_date14 = A14396AlbFecAnt ;
      GXv_date15[0] = GXt_date14 ;
      new app.documentotransporteproduccion.documentotransporteproduccion_fechadocumentoanterior(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, A39AlbProPri, GXv_date15) ;
      documentodetransporteproduccion_1_impl.this.GXt_date14 = GXv_date15[0] ;
      A14396AlbFecAnt = GXt_date14 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A14396AlbFecAnt", localUtil.format(A14396AlbFecAnt, "99/99/99"));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true},{av:'cmbavAlbpropri'},{av:'AV17AlbProPri',fld:'vALBPROPRI',pic:'9',hsh:true},{av:'AV21ContCod',fld:'vCONTCOD',pic:'@!',hsh:true},{av:'AV22AlbSec',fld:'vALBSEC',pic:'@!',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'cmbAlbEnvFtp'},{av:'A5805AlbEnvFtp',fld:'ALBENVFTP',pic:'9',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV49Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV47Hash',fld:'vHASH',pic:'',hsh:true},{av:'AV44ok',fld:'vOK',pic:'',hsh:true},{av:'AV45Messages_json',fld:'vMESSAGES_JSON',pic:'',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV22AlbSec',fld:'vALBSEC',pic:'@!',hsh:true},{av:'cmbavAlbpropri'},{av:'AV17AlbProPri',fld:'vALBPROPRI',pic:'9',hsh:true},{av:'AV21ContCod',fld:'vCONTCOD',pic:'@!',hsh:true},{av:'A39AlbProPri',fld:'ALBPROPRI',pic:'9'},{av:'A3093AlbDivTCod',fld:'ALBDIVTCOD',pic:''},{av:'A1258GuiRemDom',fld:'GUIREMDOM',pic:'9'},{av:'A2242AlbSec',fld:'ALBSEC',pic:'@!'},{av:'AV54Pgmname',fld:'vPGMNAME',pic:''},{av:'A33AlbProEst',fld:'ALBPROEST',pic:'9'},{av:'A4023AlbFecSal',fld:'ALBFECSAL',pic:''},{av:'A3865AlbHorSal',fld:'ALBHORSAL',pic:''},{av:'A7098AlbUsu',fld:'ALBUSU',pic:''},{av:'A7101AlbLic',fld:'ALBLIC',pic:''},{av:'cmbAlbProAT'},{av:'A10765AlbProAT',fld:'ALBPROAT',pic:''},{av:'A10019AlbHhfm',fld:'ALBHHFM',pic:'99/99/99 99:99'},{av:'A10020AlbGrossT',fld:'ALBGROSST',pic:'ZZZZZZZZZ9.99'},{av:'A10017AlbFmd',fld:'ALBFMD',pic:''},{av:'A10018ALbFmdc',fld:'ALBFMDC',pic:''},{av:'A5140AlbMarca',fld:'ALBMARCA',pic:''},{av:'A3867AlbLocDes',fld:'ALBLOCDES',pic:'9'},{av:'A3866AlbLocCar',fld:'ALBLOCCAR',pic:'9'},{av:'A914AlbPObsCon',fld:'ALBPOBSCON',pic:'Z9'},{av:'A5141AlbIvaCod',fld:'ALBIVACOD',pic:'@!'},{av:'A7987AlbColCa',fld:'ALBCOLCA',pic:''},{av:'A7162AlbDesp',fld:'ALBDESP',pic:'ZZZZZ9'},{av:'A7986AlbCambio',fld:'ALBCAMBIO',pic:'Z9.9999'},{av:'A7985AlbTipDoc',fld:'ALBTIPDOC',pic:'ZZZZZZZ9'},{av:'A7984AlbMotTr',fld:'ALBMOTTR',pic:''},{av:'A5803AlbTipCal',fld:'ALBTIPCAL',pic:'9'},{av:'A7988AlbObsCb',fld:'ALBOBSCB',pic:''},{av:'A7102AlbNumT',fld:'ALBNUMT',pic:'ZZZZZZZZZ9'},{av:'A7100AlbMarCo',fld:'ALBMARCO',pic:''},{av:'A7099AlbOComp',fld:'ALBOCOMP',pic:''},{av:'A14404AlbEnvMail',fld:'ALBENVMAIL',pic:'99/99/99 99:99'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e131U62',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV49Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A1243GuiRemCli',fld:'GUIREMCLI',pic:'ZZZZZ9'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A1244GuiRemCln',fld:'GUIREMCLN',pic:''},{av:'A34AlbProfch',fld:'ALBPROFCH',pic:''},{av:'A2242AlbSec',fld:'ALBSEC',pic:'@!'},{av:'A39AlbProPri',fld:'ALBPROPRI',pic:'9'},{av:'cmbAlbEnvFtp'},{av:'A5805AlbEnvFtp',fld:'ALBENVFTP',pic:'9',hsh:true},{av:'A7101AlbLic',fld:'ALBLIC',pic:''},{av:'A10019AlbHhfm',fld:'ALBHHFM',pic:'99/99/99 99:99'},{av:'A33AlbProEst',fld:'ALBPROEST',pic:'9'},{av:'A5140AlbMarca',fld:'ALBMARCA',pic:''},{av:'AV47Hash',fld:'vHASH',pic:'',hsh:true},{av:'AV44ok',fld:'vOK',pic:'',hsh:true},{av:'AV45Messages_json',fld:'vMESSAGES_JSON',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A1243GuiRemCli',fld:'GUIREMCLI',pic:'ZZZZZ9'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true}]}");
      setEventMetadata("COMBO_GUIREMCLI.ONOPTIONCLICKED","{handler:'e121U62',iparms:[{av:'Combo_guiremcli_Selectedvalue_get',ctrl:'COMBO_GUIREMCLI',prop:'SelectedValue_get'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true}]");
      setEventMetadata("COMBO_GUIREMCLI.ONOPTIONCLICKED",",oparms:[{av:'AV25ComboGuiRemCli',fld:'vCOMBOGUIREMCLI',pic:'ZZZZZ9'},{av:'AV27ComboAlbCliDes',fld:'vCOMBOALBCLIDES',pic:'ZZZZZ9'},{av:'Combo_albclides_Selectedvalue_set',ctrl:'COMBO_ALBCLIDES',prop:'SelectedValue_set'},{av:'AV31AlbDomEnv_Data',fld:'vALBDOMENV_DATA',pic:''},{av:'Combo_albdomenv_Selectedvalue_set',ctrl:'COMBO_ALBDOMENV',prop:'SelectedValue_set'},{av:'AV32ComboAlbDomEnv',fld:'vCOMBOALBDOMENV',pic:'9'},{av:'Combo_albdomenv_Enabled',ctrl:'COMBO_ALBDOMENV',prop:'Enabled'}]}");
      setEventMetadata("VALID_ALBPROCOD","{handler:'valid_Albprocod',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A14252AlbLineasA',fld:'ALBLINEASA',pic:'ZZZ9'},{av:'A14253AlbImporte',fld:'ALBIMPORTE',pic:'ZZZZZZZZZZZ9.99'},{av:'A14251AlbFactura',fld:'ALBFACTURA',pic:'9'}]");
      setEventMetadata("VALID_ALBPROCOD",",oparms:[{av:'A14253AlbImporte',fld:'ALBIMPORTE',pic:'ZZZZZZZZZZZ9.99'},{av:'A14252AlbLineasA',fld:'ALBLINEASA',pic:'ZZZ9'},{av:'Combo_guiremcli_Enabled',ctrl:'COMBO_GUIREMCLI',prop:'Enabled'},{av:'A14251AlbFactura',fld:'ALBFACTURA',pic:'9'}]}");
      setEventMetadata("VALID_ALBPROFCH","{handler:'valid_Albprofch',iparms:[]");
      setEventMetadata("VALID_ALBPROFCH",",oparms:[]}");
      setEventMetadata("VALID_GUIREMCLI","{handler:'valid_Guiremcli',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV27ComboAlbCliDes',fld:'vCOMBOALBCLIDES',pic:'ZZZZZ9'},{av:'A1243GuiRemCli',fld:'GUIREMCLI',pic:'ZZZZZ9'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A3869AlbCliDes',fld:'ALBCLIDES',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_GUIREMCLI",",oparms:[{av:'A3869AlbCliDes',fld:'ALBCLIDES',pic:'ZZZZZ9'}]}");
      setEventMetadata("VALID_ALBDOMENV","{handler:'valid_Albdomenv',iparms:[]");
      setEventMetadata("VALID_ALBDOMENV",",oparms:[]}");
      setEventMetadata("VALID_TRNCOD","{handler:'valid_Trncod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A841TrnNom',fld:'TRNNOM',pic:''},{av:'A3643TrnNif',fld:'TRNNIF',pic:'@!'}]");
      setEventMetadata("VALID_TRNCOD",",oparms:[{av:'A841TrnNom',fld:'TRNNOM',pic:''},{av:'A3643TrnNif',fld:'TRNNIF',pic:'@!'}]}");
      setEventMetadata("VALIDV_ALBPROPRI","{handler:'validv_Albpropri',iparms:[]");
      setEventMetadata("VALIDV_ALBPROPRI",",oparms:[]}");
      setEventMetadata("VALIDV_CONTCOD","{handler:'validv_Contcod',iparms:[]");
      setEventMetadata("VALIDV_CONTCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBLINEASA","{handler:'valid_Alblineasa',iparms:[]");
      setEventMetadata("VALID_ALBLINEASA",",oparms:[]}");
      setEventMetadata("VALID_ALBPDATCUD","{handler:'valid_Albpdatcud',iparms:[]");
      setEventMetadata("VALID_ALBPDATCUD",",oparms:[]}");
      setEventMetadata("VALIDV_PGMNAME","{handler:'validv_Pgmname',iparms:[]");
      setEventMetadata("VALIDV_PGMNAME",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOGUIREMCLI","{handler:'validv_Comboguiremcli',iparms:[]");
      setEventMetadata("VALIDV_COMBOGUIREMCLI",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOALBCLIDES","{handler:'validv_Comboalbclides',iparms:[]");
      setEventMetadata("VALIDV_COMBOALBCLIDES",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOALBDOMENV","{handler:'validv_Comboalbdomenv',iparms:[]");
      setEventMetadata("VALIDV_COMBOALBDOMENV",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOTRNCOD","{handler:'validv_Combotrncod',iparms:[]");
      setEventMetadata("VALIDV_COMBOTRNCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBPROPRI","{handler:'valid_Albpropri',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A39AlbProPri',fld:'ALBPROPRI',pic:'9'},{av:'A14396AlbFecAnt',fld:'ALBFECANT',pic:''}]");
      setEventMetadata("VALID_ALBPROPRI",",oparms:[{av:'A14396AlbFecAnt',fld:'ALBFECANT',pic:''}]}");
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
      pr_default.close(20);
      pr_default.close(24);
      pr_default.close(21);
      pr_default.close(23);
      pr_default.close(22);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV7EmprCod = "" ;
      wcpOAV17AlbProPri = "" ;
      wcpOAV21ContCod = "" ;
      wcpOAV22AlbSec = "" ;
      Z396EmprCod = "" ;
      Z39AlbProPri = "" ;
      Z3093AlbDivTCod = "" ;
      Z2242AlbSec = "" ;
      Z34AlbProfch = GXutil.nullDate() ;
      Z4023AlbFecSal = GXutil.nullDate() ;
      Z3865AlbHorSal = "" ;
      Z7098AlbUsu = "" ;
      Z3868AlbMat = "" ;
      Z7101AlbLic = "" ;
      Z10765AlbProAT = "" ;
      Z10019AlbHhfm = GXutil.resetTime( GXutil.nullDate() );
      Z10020AlbGrossT = DecimalUtil.ZERO ;
      Z10837AlbTrnNc = "" ;
      Z10017AlbFmd = "" ;
      Z10835AlbTrnNm = "" ;
      Z10018ALbFmdc = "" ;
      Z10836AlbTrnDm = "" ;
      Z5140AlbMarca = "" ;
      Z5141AlbIvaCod = "" ;
      Z7987AlbColCa = "" ;
      Z7986AlbCambio = DecimalUtil.ZERO ;
      Z7984AlbMotTr = "" ;
      Z7988AlbObsCb = "" ;
      Z7100AlbMarCo = "" ;
      Z7099AlbOComp = "" ;
      Z14074AlbPdTipAT = "" ;
      Z14073AlbPdSerAT = "" ;
      Z14069AlbPdATCUD = "" ;
      Z14404AlbEnvMail = GXutil.resetTime( GXutil.nullDate() );
      Z1253EmprGuiRem = "" ;
      N1253EmprGuiRem = "" ;
      Combo_trncod_Selectedvalue_get = "" ;
      Combo_albdomenv_Selectedvalue_get = "" ;
      Combo_albclides_Selectedvalue_get = "" ;
      Combo_guiremcli_Selectedvalue_get = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV7EmprCod = "" ;
      AV21ContCod = "" ;
      A396EmprCod = "" ;
      A39AlbProPri = "" ;
      A1253EmprGuiRem = "" ;
      Gx_mode = "" ;
      AV17AlbProPri = "" ;
      AV22AlbSec = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A10765AlbProAT = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A14396AlbFecAnt = GXutil.nullDate() ;
      lblTextblockguiremcli_Jsonclick = "" ;
      ucCombo_guiremcli = new com.genexus.webpanels.GXUserControl();
      Combo_guiremcli_Caption = "" ;
      AV23GuiRemCli_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      lblTextblockalbclides_Jsonclick = "" ;
      ucCombo_albclides = new com.genexus.webpanels.GXUserControl();
      Combo_albclides_Caption = "" ;
      AV26AlbCliDes_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A7098AlbUsu = "" ;
      lblTextblockalbdomenv_Jsonclick = "" ;
      ucCombo_albdomenv = new com.genexus.webpanels.GXUserControl();
      AV33DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV31AlbDomEnv_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      lblTextblocktrncod_Jsonclick = "" ;
      ucCombo_trncod = new com.genexus.webpanels.GXUserControl();
      Combo_trncod_Caption = "" ;
      AV29TrnCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A3868AlbMat = "" ;
      A4023AlbFecSal = GXutil.nullDate() ;
      A3865AlbHorSal = "" ;
      ucDvpanel_unnamedtable7 = new com.genexus.webpanels.GXUserControl();
      A7101AlbLic = "" ;
      A10019AlbHhfm = GXutil.resetTime( GXutil.nullDate() );
      A14069AlbPdATCUD = "" ;
      A14362Firma4dig = "" ;
      ucDvpanel_unnamedtable8 = new com.genexus.webpanels.GXUserControl();
      A10835AlbTrnNm = "" ;
      A10836AlbTrnDm = "" ;
      A10837AlbTrnNc = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV54Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      A10020AlbGrossT = DecimalUtil.ZERO ;
      A2242AlbSec = "" ;
      A3093AlbDivTCod = "" ;
      A10017AlbFmd = "" ;
      A10018ALbFmdc = "" ;
      A5140AlbMarca = "" ;
      A5141AlbIvaCod = "" ;
      A7987AlbColCa = "" ;
      A7986AlbCambio = DecimalUtil.ZERO ;
      A7984AlbMotTr = "" ;
      A7988AlbObsCb = "" ;
      A7100AlbMarCo = "" ;
      A7099AlbOComp = "" ;
      A14074AlbPdTipAT = "" ;
      A14073AlbPdSerAT = "" ;
      A14404AlbEnvMail = GXutil.resetTime( GXutil.nullDate() );
      A14253AlbImporte = DecimalUtil.ZERO ;
      AV15Insert_EmprGuiRem = "" ;
      AV20UsurCod = "" ;
      AV55Pgmdesc = "" ;
      A1244GuiRemCln = "" ;
      A3145GuiRemDivT = "" ;
      A407EmprNom = "" ;
      A841TrnNom = "" ;
      A3643TrnNif = "" ;
      A3109AlbDivAbr = "" ;
      Combo_guiremcli_Objectcall = "" ;
      Combo_guiremcli_Class = "" ;
      Combo_guiremcli_Icontype = "" ;
      Combo_guiremcli_Icon = "" ;
      Combo_guiremcli_Tooltip = "" ;
      Combo_guiremcli_Selectedvalue_set = "" ;
      Combo_guiremcli_Selectedtext_set = "" ;
      Combo_guiremcli_Selectedtext_get = "" ;
      Combo_guiremcli_Gamoauthtoken = "" ;
      Combo_guiremcli_Ddointernalname = "" ;
      Combo_guiremcli_Titlecontrolalign = "" ;
      Combo_guiremcli_Dropdownoptionstype = "" ;
      Combo_guiremcli_Titlecontrolidtoreplace = "" ;
      Combo_guiremcli_Datalisttype = "" ;
      Combo_guiremcli_Datalistfixedvalues = "" ;
      Combo_guiremcli_Datalistproc = "" ;
      Combo_guiremcli_Datalistprocparametersprefix = "" ;
      Combo_guiremcli_Remoteservicesparameters = "" ;
      Combo_guiremcli_Htmltemplate = "" ;
      Combo_guiremcli_Multiplevaluestype = "" ;
      Combo_guiremcli_Loadingdata = "" ;
      Combo_guiremcli_Noresultsfound = "" ;
      Combo_guiremcli_Emptyitemtext = "" ;
      Combo_guiremcli_Onlyselectedvalues = "" ;
      Combo_guiremcli_Selectalltext = "" ;
      Combo_guiremcli_Multiplevaluesseparator = "" ;
      Combo_guiremcli_Addnewoptiontext = "" ;
      Combo_albclides_Objectcall = "" ;
      Combo_albclides_Class = "" ;
      Combo_albclides_Icontype = "" ;
      Combo_albclides_Icon = "" ;
      Combo_albclides_Tooltip = "" ;
      Combo_albclides_Selectedvalue_set = "" ;
      Combo_albclides_Selectedtext_set = "" ;
      Combo_albclides_Selectedtext_get = "" ;
      Combo_albclides_Gamoauthtoken = "" ;
      Combo_albclides_Ddointernalname = "" ;
      Combo_albclides_Titlecontrolalign = "" ;
      Combo_albclides_Dropdownoptionstype = "" ;
      Combo_albclides_Titlecontrolidtoreplace = "" ;
      Combo_albclides_Datalisttype = "" ;
      Combo_albclides_Datalistfixedvalues = "" ;
      Combo_albclides_Datalistproc = "" ;
      Combo_albclides_Datalistprocparametersprefix = "" ;
      Combo_albclides_Remoteservicesparameters = "" ;
      Combo_albclides_Htmltemplate = "" ;
      Combo_albclides_Multiplevaluestype = "" ;
      Combo_albclides_Loadingdata = "" ;
      Combo_albclides_Noresultsfound = "" ;
      Combo_albclides_Emptyitemtext = "" ;
      Combo_albclides_Onlyselectedvalues = "" ;
      Combo_albclides_Selectalltext = "" ;
      Combo_albclides_Multiplevaluesseparator = "" ;
      Combo_albclides_Addnewoptiontext = "" ;
      Combo_albdomenv_Objectcall = "" ;
      Combo_albdomenv_Class = "" ;
      Combo_albdomenv_Icontype = "" ;
      Combo_albdomenv_Icon = "" ;
      Combo_albdomenv_Tooltip = "" ;
      Combo_albdomenv_Selectedvalue_set = "" ;
      Combo_albdomenv_Selectedtext_set = "" ;
      Combo_albdomenv_Selectedtext_get = "" ;
      Combo_albdomenv_Gamoauthtoken = "" ;
      Combo_albdomenv_Ddointernalname = "" ;
      Combo_albdomenv_Titlecontrolalign = "" ;
      Combo_albdomenv_Dropdownoptionstype = "" ;
      Combo_albdomenv_Titlecontrolidtoreplace = "" ;
      Combo_albdomenv_Datalisttype = "" ;
      Combo_albdomenv_Datalistfixedvalues = "" ;
      Combo_albdomenv_Datalistproc = "" ;
      Combo_albdomenv_Datalistprocparametersprefix = "" ;
      Combo_albdomenv_Remoteservicesparameters = "" ;
      Combo_albdomenv_Htmltemplate = "" ;
      Combo_albdomenv_Multiplevaluestype = "" ;
      Combo_albdomenv_Loadingdata = "" ;
      Combo_albdomenv_Noresultsfound = "" ;
      Combo_albdomenv_Onlyselectedvalues = "" ;
      Combo_albdomenv_Selectalltext = "" ;
      Combo_albdomenv_Multiplevaluesseparator = "" ;
      Combo_albdomenv_Addnewoptiontext = "" ;
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
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode3 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV18Station = "" ;
      GXt_char1 = "" ;
      AV19EmprNom = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV10TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV11WebSession = httpContext.getWebSession();
      AV16TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV48CliFacMtsP = "" ;
      AV47Hash = "" ;
      AV45Messages_json = "" ;
      AV24ComboSelectedValue = "" ;
      GXt_objcol_SdtDVB_SDTComboData_Item12 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTComboData_Item13 = new GXBaseCollection[1] ;
      Z3109AlbDivAbr = "" ;
      Z407EmprNom = "" ;
      Z1244GuiRemCln = "" ;
      Z3145GuiRemDivT = "" ;
      T01U65_A407EmprNom = new String[] {""} ;
      T01U65_n407EmprNom = new boolean[] {false} ;
      GXv_int11 = new byte[1] ;
      T01U68_A3109AlbDivAbr = new String[] {""} ;
      T01U68_n3109AlbDivAbr = new boolean[] {false} ;
      T01U66_A841TrnNom = new String[] {""} ;
      T01U66_n841TrnNom = new boolean[] {false} ;
      T01U66_A3643TrnNif = new String[] {""} ;
      T01U66_n3643TrnNif = new boolean[] {false} ;
      T01U64_A1244GuiRemCln = new String[] {""} ;
      T01U64_A3145GuiRemDivT = new String[] {""} ;
      T01U64_n3145GuiRemDivT = new boolean[] {false} ;
      T01U64_A3110GuiRemDiv = new byte[1] ;
      T01U64_n3110GuiRemDiv = new boolean[] {false} ;
      T01U67_A841TrnNom = new String[] {""} ;
      T01U67_n841TrnNom = new boolean[] {false} ;
      T01U67_A3643TrnNif = new String[] {""} ;
      T01U67_n3643TrnNif = new boolean[] {false} ;
      T01U69_A1260BusDomEnv = new byte[1] ;
      T01U69_n1260BusDomEnv = new boolean[] {false} ;
      T01U610_A252CliCod = new int[1] ;
      T01U610_A266CliEnvLin = new byte[1] ;
      T01U610_A30AlbProCod = new long[1] ;
      T01U610_A1259AlbDomEnv = new byte[1] ;
      T01U610_n1259AlbDomEnv = new boolean[] {false} ;
      T01U610_A3869AlbCliDes = new int[1] ;
      T01U610_A39AlbProPri = new String[] {""} ;
      T01U610_A3093AlbDivTCod = new String[] {""} ;
      T01U610_n3093AlbDivTCod = new boolean[] {false} ;
      T01U610_A1258GuiRemDom = new byte[1] ;
      T01U610_n1258GuiRemDom = new boolean[] {false} ;
      T01U610_A2242AlbSec = new String[] {""} ;
      T01U610_A33AlbProEst = new byte[1] ;
      T01U610_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      T01U610_A4023AlbFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01U610_A3865AlbHorSal = new String[] {""} ;
      T01U610_A7098AlbUsu = new String[] {""} ;
      T01U610_A1244GuiRemCln = new String[] {""} ;
      T01U610_A3868AlbMat = new String[] {""} ;
      T01U610_A5805AlbEnvFtp = new byte[1] ;
      T01U610_A7101AlbLic = new String[] {""} ;
      T01U610_A10765AlbProAT = new String[] {""} ;
      T01U610_A10019AlbHhfm = new java.util.Date[] {GXutil.nullDate()} ;
      T01U610_A10020AlbGrossT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U610_A10837AlbTrnNc = new String[] {""} ;
      T01U610_A10017AlbFmd = new String[] {""} ;
      T01U610_n10017AlbFmd = new boolean[] {false} ;
      T01U610_A10835AlbTrnNm = new String[] {""} ;
      T01U610_A10018ALbFmdc = new String[] {""} ;
      T01U610_A10836AlbTrnDm = new String[] {""} ;
      T01U610_A5140AlbMarca = new String[] {""} ;
      T01U610_A3867AlbLocDes = new byte[1] ;
      T01U610_A3866AlbLocCar = new byte[1] ;
      T01U610_A914AlbPObsCon = new byte[1] ;
      T01U610_A5141AlbIvaCod = new String[] {""} ;
      T01U610_A7987AlbColCa = new String[] {""} ;
      T01U610_A7162AlbDesp = new int[1] ;
      T01U610_A7986AlbCambio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U610_A7985AlbTipDoc = new int[1] ;
      T01U610_A7984AlbMotTr = new String[] {""} ;
      T01U610_A5803AlbTipCal = new byte[1] ;
      T01U610_A7988AlbObsCb = new String[] {""} ;
      T01U610_A7102AlbNumT = new long[1] ;
      T01U610_A7100AlbMarCo = new String[] {""} ;
      T01U610_A7099AlbOComp = new String[] {""} ;
      T01U610_A3109AlbDivAbr = new String[] {""} ;
      T01U610_n3109AlbDivAbr = new boolean[] {false} ;
      T01U610_A3145GuiRemDivT = new String[] {""} ;
      T01U610_n3145GuiRemDivT = new boolean[] {false} ;
      T01U610_A407EmprNom = new String[] {""} ;
      T01U610_n407EmprNom = new boolean[] {false} ;
      T01U610_A14074AlbPdTipAT = new String[] {""} ;
      T01U610_A14073AlbPdSerAT = new String[] {""} ;
      T01U610_A14069AlbPdATCUD = new String[] {""} ;
      T01U610_A14404AlbEnvMail = new java.util.Date[] {GXutil.nullDate()} ;
      T01U610_A1253EmprGuiRem = new String[] {""} ;
      T01U610_A1243GuiRemCli = new int[1] ;
      T01U610_A396EmprCod = new String[] {""} ;
      T01U610_A840TrnCod = new short[1] ;
      T01U610_A3108AlbDivCod = new byte[1] ;
      T01U610_n3108AlbDivCod = new boolean[] {false} ;
      T01U610_A3110GuiRemDiv = new byte[1] ;
      T01U610_n3110GuiRemDiv = new boolean[] {false} ;
      T01U610_A1260BusDomEnv = new byte[1] ;
      T01U610_n1260BusDomEnv = new boolean[] {false} ;
      T01U611_A1244GuiRemCln = new String[] {""} ;
      T01U611_A3145GuiRemDivT = new String[] {""} ;
      T01U611_n3145GuiRemDivT = new boolean[] {false} ;
      T01U611_A3110GuiRemDiv = new byte[1] ;
      T01U611_n3110GuiRemDiv = new boolean[] {false} ;
      T01U612_A1260BusDomEnv = new byte[1] ;
      T01U612_n1260BusDomEnv = new boolean[] {false} ;
      T01U613_A841TrnNom = new String[] {""} ;
      T01U613_n841TrnNom = new boolean[] {false} ;
      T01U613_A3643TrnNif = new String[] {""} ;
      T01U613_n3643TrnNif = new boolean[] {false} ;
      T01U614_A3109AlbDivAbr = new String[] {""} ;
      T01U614_n3109AlbDivAbr = new boolean[] {false} ;
      T01U615_A841TrnNom = new String[] {""} ;
      T01U615_n841TrnNom = new boolean[] {false} ;
      T01U615_A3643TrnNif = new String[] {""} ;
      T01U615_n3643TrnNif = new boolean[] {false} ;
      T01U616_A396EmprCod = new String[] {""} ;
      T01U616_A30AlbProCod = new long[1] ;
      T01U63_A30AlbProCod = new long[1] ;
      T01U63_A1259AlbDomEnv = new byte[1] ;
      T01U63_n1259AlbDomEnv = new boolean[] {false} ;
      T01U63_A3869AlbCliDes = new int[1] ;
      T01U63_A39AlbProPri = new String[] {""} ;
      T01U63_A3093AlbDivTCod = new String[] {""} ;
      T01U63_n3093AlbDivTCod = new boolean[] {false} ;
      T01U63_A1258GuiRemDom = new byte[1] ;
      T01U63_n1258GuiRemDom = new boolean[] {false} ;
      T01U63_A2242AlbSec = new String[] {""} ;
      T01U63_A33AlbProEst = new byte[1] ;
      T01U63_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      T01U63_A4023AlbFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01U63_A3865AlbHorSal = new String[] {""} ;
      T01U63_A7098AlbUsu = new String[] {""} ;
      T01U63_A3868AlbMat = new String[] {""} ;
      T01U63_A5805AlbEnvFtp = new byte[1] ;
      T01U63_A7101AlbLic = new String[] {""} ;
      T01U63_A10765AlbProAT = new String[] {""} ;
      T01U63_A10019AlbHhfm = new java.util.Date[] {GXutil.nullDate()} ;
      T01U63_A10020AlbGrossT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U63_A10837AlbTrnNc = new String[] {""} ;
      T01U63_A10017AlbFmd = new String[] {""} ;
      T01U63_n10017AlbFmd = new boolean[] {false} ;
      T01U63_A10835AlbTrnNm = new String[] {""} ;
      T01U63_A10018ALbFmdc = new String[] {""} ;
      T01U63_A10836AlbTrnDm = new String[] {""} ;
      T01U63_A5140AlbMarca = new String[] {""} ;
      T01U63_A3867AlbLocDes = new byte[1] ;
      T01U63_A3866AlbLocCar = new byte[1] ;
      T01U63_A914AlbPObsCon = new byte[1] ;
      T01U63_A5141AlbIvaCod = new String[] {""} ;
      T01U63_A7987AlbColCa = new String[] {""} ;
      T01U63_A7162AlbDesp = new int[1] ;
      T01U63_A7986AlbCambio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U63_A7985AlbTipDoc = new int[1] ;
      T01U63_A7984AlbMotTr = new String[] {""} ;
      T01U63_A5803AlbTipCal = new byte[1] ;
      T01U63_A7988AlbObsCb = new String[] {""} ;
      T01U63_A7102AlbNumT = new long[1] ;
      T01U63_A7100AlbMarCo = new String[] {""} ;
      T01U63_A7099AlbOComp = new String[] {""} ;
      T01U63_A14074AlbPdTipAT = new String[] {""} ;
      T01U63_A14073AlbPdSerAT = new String[] {""} ;
      T01U63_A14069AlbPdATCUD = new String[] {""} ;
      T01U63_A14404AlbEnvMail = new java.util.Date[] {GXutil.nullDate()} ;
      T01U63_A1253EmprGuiRem = new String[] {""} ;
      T01U63_A1243GuiRemCli = new int[1] ;
      T01U63_A396EmprCod = new String[] {""} ;
      T01U63_A840TrnCod = new short[1] ;
      T01U63_A3108AlbDivCod = new byte[1] ;
      T01U63_n3108AlbDivCod = new boolean[] {false} ;
      T01U617_A396EmprCod = new String[] {""} ;
      T01U617_A30AlbProCod = new long[1] ;
      T01U618_A396EmprCod = new String[] {""} ;
      T01U618_A30AlbProCod = new long[1] ;
      T01U62_A30AlbProCod = new long[1] ;
      T01U62_A1259AlbDomEnv = new byte[1] ;
      T01U62_n1259AlbDomEnv = new boolean[] {false} ;
      T01U62_A3869AlbCliDes = new int[1] ;
      T01U62_A39AlbProPri = new String[] {""} ;
      T01U62_A3093AlbDivTCod = new String[] {""} ;
      T01U62_n3093AlbDivTCod = new boolean[] {false} ;
      T01U62_A1258GuiRemDom = new byte[1] ;
      T01U62_n1258GuiRemDom = new boolean[] {false} ;
      T01U62_A2242AlbSec = new String[] {""} ;
      T01U62_A33AlbProEst = new byte[1] ;
      T01U62_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      T01U62_A4023AlbFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01U62_A3865AlbHorSal = new String[] {""} ;
      T01U62_A7098AlbUsu = new String[] {""} ;
      T01U62_A3868AlbMat = new String[] {""} ;
      T01U62_A5805AlbEnvFtp = new byte[1] ;
      T01U62_A7101AlbLic = new String[] {""} ;
      T01U62_A10765AlbProAT = new String[] {""} ;
      T01U62_A10019AlbHhfm = new java.util.Date[] {GXutil.nullDate()} ;
      T01U62_A10020AlbGrossT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U62_A10837AlbTrnNc = new String[] {""} ;
      T01U62_A10017AlbFmd = new String[] {""} ;
      T01U62_n10017AlbFmd = new boolean[] {false} ;
      T01U62_A10835AlbTrnNm = new String[] {""} ;
      T01U62_A10018ALbFmdc = new String[] {""} ;
      T01U62_A10836AlbTrnDm = new String[] {""} ;
      T01U62_A5140AlbMarca = new String[] {""} ;
      T01U62_A3867AlbLocDes = new byte[1] ;
      T01U62_A3866AlbLocCar = new byte[1] ;
      T01U62_A914AlbPObsCon = new byte[1] ;
      T01U62_A5141AlbIvaCod = new String[] {""} ;
      T01U62_A7987AlbColCa = new String[] {""} ;
      T01U62_A7162AlbDesp = new int[1] ;
      T01U62_A7986AlbCambio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U62_A7985AlbTipDoc = new int[1] ;
      T01U62_A7984AlbMotTr = new String[] {""} ;
      T01U62_A5803AlbTipCal = new byte[1] ;
      T01U62_A7988AlbObsCb = new String[] {""} ;
      T01U62_A7102AlbNumT = new long[1] ;
      T01U62_A7100AlbMarCo = new String[] {""} ;
      T01U62_A7099AlbOComp = new String[] {""} ;
      T01U62_A14074AlbPdTipAT = new String[] {""} ;
      T01U62_A14073AlbPdSerAT = new String[] {""} ;
      T01U62_A14069AlbPdATCUD = new String[] {""} ;
      T01U62_A14404AlbEnvMail = new java.util.Date[] {GXutil.nullDate()} ;
      T01U62_A1253EmprGuiRem = new String[] {""} ;
      T01U62_A1243GuiRemCli = new int[1] ;
      T01U62_A396EmprCod = new String[] {""} ;
      T01U62_A840TrnCod = new short[1] ;
      T01U62_A3108AlbDivCod = new byte[1] ;
      T01U62_n3108AlbDivCod = new boolean[] {false} ;
      T01U622_A1244GuiRemCln = new String[] {""} ;
      T01U622_A3145GuiRemDivT = new String[] {""} ;
      T01U622_n3145GuiRemDivT = new boolean[] {false} ;
      T01U622_A3110GuiRemDiv = new byte[1] ;
      T01U622_n3110GuiRemDiv = new boolean[] {false} ;
      T01U623_A841TrnNom = new String[] {""} ;
      T01U623_n841TrnNom = new boolean[] {false} ;
      T01U623_A3643TrnNif = new String[] {""} ;
      T01U623_n3643TrnNif = new boolean[] {false} ;
      T01U624_A1260BusDomEnv = new byte[1] ;
      T01U624_n1260BusDomEnv = new boolean[] {false} ;
      T01U625_A3109AlbDivAbr = new String[] {""} ;
      T01U625_n3109AlbDivAbr = new boolean[] {false} ;
      T01U626_A841TrnNom = new String[] {""} ;
      T01U626_n841TrnNom = new boolean[] {false} ;
      T01U626_A3643TrnNif = new String[] {""} ;
      T01U626_n3643TrnNif = new boolean[] {false} ;
      T01U627_A396EmprCod = new String[] {""} ;
      T01U627_A30AlbProCod = new long[1] ;
      T01U627_A12185DltLinObs = new byte[1] ;
      T01U628_A396EmprCod = new String[] {""} ;
      T01U628_A30AlbProCod = new long[1] ;
      T01U628_A12176DltHdr = new int[1] ;
      T01U628_A12177DltR = new byte[1] ;
      T01U628_A12178DltP = new String[] {""} ;
      T01U629_A396EmprCod = new String[] {""} ;
      T01U629_A30AlbProCod = new long[1] ;
      T01U629_A7540Alb_NFisca = new String[] {""} ;
      T01U630_A396EmprCod = new String[] {""} ;
      T01U630_A30AlbProCod = new long[1] ;
      T01U630_A129BarCod = new int[1] ;
      T01U630_A132BarCodReo = new byte[1] ;
      T01U630_A130BarCodPar = new String[] {""} ;
      T01U631_A396EmprCod = new String[] {""} ;
      T01U631_A30AlbProCod = new long[1] ;
      T01U631_A915AlbPObsLin = new byte[1] ;
      T01U632_A396EmprCod = new String[] {""} ;
      T01U632_A30AlbProCod = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i34AlbProfch = GXutil.nullDate() ;
      i5140AlbMarca = "" ;
      i7098AlbUsu = "" ;
      i10765AlbProAT = "" ;
      GXv_int9 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXt_decimal16 = DecimalUtil.ZERO ;
      GXv_decimal17 = new java.math.BigDecimal[1] ;
      GXv_int19 = new short[1] ;
      Z14253AlbImporte = DecimalUtil.ZERO ;
      Z841TrnNom = "" ;
      Z3643TrnNif = "" ;
      GXt_date14 = GXutil.nullDate() ;
      GXv_date15 = new java.util.Date[1] ;
      Z14396AlbFecAnt = GXutil.nullDate() ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.documentodetransporteproduccion_1__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.documentodetransporteproduccion_1__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.documentodetransporteproduccion_1__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.documentodetransporteproduccion_1__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.documentodetransporteproduccion_1__default(),
         new Object[] {
             new Object[] {
            T01U62_A30AlbProCod, T01U62_A1259AlbDomEnv, T01U62_n1259AlbDomEnv, T01U62_A3869AlbCliDes, T01U62_A39AlbProPri, T01U62_A3093AlbDivTCod, T01U62_n3093AlbDivTCod, T01U62_A1258GuiRemDom, T01U62_n1258GuiRemDom, T01U62_A2242AlbSec,
            T01U62_A33AlbProEst, T01U62_A34AlbProfch, T01U62_A4023AlbFecSal, T01U62_A3865AlbHorSal, T01U62_A7098AlbUsu, T01U62_A3868AlbMat, T01U62_A5805AlbEnvFtp, T01U62_A7101AlbLic, T01U62_A10765AlbProAT, T01U62_A10019AlbHhfm,
            T01U62_A10020AlbGrossT, T01U62_A10837AlbTrnNc, T01U62_A10017AlbFmd, T01U62_n10017AlbFmd, T01U62_A10835AlbTrnNm, T01U62_A10018ALbFmdc, T01U62_A10836AlbTrnDm, T01U62_A5140AlbMarca, T01U62_A3867AlbLocDes, T01U62_A3866AlbLocCar,
            T01U62_A914AlbPObsCon, T01U62_A5141AlbIvaCod, T01U62_A7987AlbColCa, T01U62_A7162AlbDesp, T01U62_A7986AlbCambio, T01U62_A7985AlbTipDoc, T01U62_A7984AlbMotTr, T01U62_A5803AlbTipCal, T01U62_A7988AlbObsCb, T01U62_A7102AlbNumT,
            T01U62_A7100AlbMarCo, T01U62_A7099AlbOComp, T01U62_A14074AlbPdTipAT, T01U62_A14073AlbPdSerAT, T01U62_A14069AlbPdATCUD, T01U62_A14404AlbEnvMail, T01U62_A1253EmprGuiRem, T01U62_A1243GuiRemCli, T01U62_A396EmprCod, T01U62_A840TrnCod,
            T01U62_A3108AlbDivCod, T01U62_n3108AlbDivCod
            }
            , new Object[] {
            T01U63_A30AlbProCod, T01U63_A1259AlbDomEnv, T01U63_n1259AlbDomEnv, T01U63_A3869AlbCliDes, T01U63_A39AlbProPri, T01U63_A3093AlbDivTCod, T01U63_n3093AlbDivTCod, T01U63_A1258GuiRemDom, T01U63_n1258GuiRemDom, T01U63_A2242AlbSec,
            T01U63_A33AlbProEst, T01U63_A34AlbProfch, T01U63_A4023AlbFecSal, T01U63_A3865AlbHorSal, T01U63_A7098AlbUsu, T01U63_A3868AlbMat, T01U63_A5805AlbEnvFtp, T01U63_A7101AlbLic, T01U63_A10765AlbProAT, T01U63_A10019AlbHhfm,
            T01U63_A10020AlbGrossT, T01U63_A10837AlbTrnNc, T01U63_A10017AlbFmd, T01U63_n10017AlbFmd, T01U63_A10835AlbTrnNm, T01U63_A10018ALbFmdc, T01U63_A10836AlbTrnDm, T01U63_A5140AlbMarca, T01U63_A3867AlbLocDes, T01U63_A3866AlbLocCar,
            T01U63_A914AlbPObsCon, T01U63_A5141AlbIvaCod, T01U63_A7987AlbColCa, T01U63_A7162AlbDesp, T01U63_A7986AlbCambio, T01U63_A7985AlbTipDoc, T01U63_A7984AlbMotTr, T01U63_A5803AlbTipCal, T01U63_A7988AlbObsCb, T01U63_A7102AlbNumT,
            T01U63_A7100AlbMarCo, T01U63_A7099AlbOComp, T01U63_A14074AlbPdTipAT, T01U63_A14073AlbPdSerAT, T01U63_A14069AlbPdATCUD, T01U63_A14404AlbEnvMail, T01U63_A1253EmprGuiRem, T01U63_A1243GuiRemCli, T01U63_A396EmprCod, T01U63_A840TrnCod,
            T01U63_A3108AlbDivCod, T01U63_n3108AlbDivCod
            }
            , new Object[] {
            T01U64_A1244GuiRemCln, T01U64_A3145GuiRemDivT, T01U64_n3145GuiRemDivT, T01U64_A3110GuiRemDiv, T01U64_n3110GuiRemDiv
            }
            , new Object[] {
            T01U65_A407EmprNom, T01U65_n407EmprNom
            }
            , new Object[] {
            T01U66_A841TrnNom, T01U66_n841TrnNom, T01U66_A3643TrnNif, T01U66_n3643TrnNif
            }
            , new Object[] {
            T01U67_A841TrnNom, T01U67_n841TrnNom, T01U67_A3643TrnNif, T01U67_n3643TrnNif
            }
            , new Object[] {
            T01U68_A3109AlbDivAbr, T01U68_n3109AlbDivAbr
            }
            , new Object[] {
            T01U69_A1260BusDomEnv, T01U69_n1260BusDomEnv
            }
            , new Object[] {
            T01U610_A252CliCod, T01U610_A266CliEnvLin, T01U610_A30AlbProCod, T01U610_A1259AlbDomEnv, T01U610_n1259AlbDomEnv, T01U610_A3869AlbCliDes, T01U610_A39AlbProPri, T01U610_A3093AlbDivTCod, T01U610_n3093AlbDivTCod, T01U610_A1258GuiRemDom,
            T01U610_n1258GuiRemDom, T01U610_A2242AlbSec, T01U610_A33AlbProEst, T01U610_A34AlbProfch, T01U610_A4023AlbFecSal, T01U610_A3865AlbHorSal, T01U610_A7098AlbUsu, T01U610_A1244GuiRemCln, T01U610_A3868AlbMat, T01U610_A5805AlbEnvFtp,
            T01U610_A7101AlbLic, T01U610_A10765AlbProAT, T01U610_A10019AlbHhfm, T01U610_A10020AlbGrossT, T01U610_A10837AlbTrnNc, T01U610_A10017AlbFmd, T01U610_n10017AlbFmd, T01U610_A10835AlbTrnNm, T01U610_A10018ALbFmdc, T01U610_A10836AlbTrnDm,
            T01U610_A5140AlbMarca, T01U610_A3867AlbLocDes, T01U610_A3866AlbLocCar, T01U610_A914AlbPObsCon, T01U610_A5141AlbIvaCod, T01U610_A7987AlbColCa, T01U610_A7162AlbDesp, T01U610_A7986AlbCambio, T01U610_A7985AlbTipDoc, T01U610_A7984AlbMotTr,
            T01U610_A5803AlbTipCal, T01U610_A7988AlbObsCb, T01U610_A7102AlbNumT, T01U610_A7100AlbMarCo, T01U610_A7099AlbOComp, T01U610_A3109AlbDivAbr, T01U610_n3109AlbDivAbr, T01U610_A3145GuiRemDivT, T01U610_n3145GuiRemDivT, T01U610_A407EmprNom,
            T01U610_n407EmprNom, T01U610_A14074AlbPdTipAT, T01U610_A14073AlbPdSerAT, T01U610_A14069AlbPdATCUD, T01U610_A14404AlbEnvMail, T01U610_A1253EmprGuiRem, T01U610_A1243GuiRemCli, T01U610_A396EmprCod, T01U610_A840TrnCod, T01U610_A3108AlbDivCod,
            T01U610_n3108AlbDivCod, T01U610_A3110GuiRemDiv, T01U610_n3110GuiRemDiv, T01U610_A1260BusDomEnv, T01U610_n1260BusDomEnv
            }
            , new Object[] {
            T01U611_A1244GuiRemCln, T01U611_A3145GuiRemDivT, T01U611_n3145GuiRemDivT, T01U611_A3110GuiRemDiv, T01U611_n3110GuiRemDiv
            }
            , new Object[] {
            T01U612_A1260BusDomEnv, T01U612_n1260BusDomEnv
            }
            , new Object[] {
            T01U613_A841TrnNom, T01U613_n841TrnNom, T01U613_A3643TrnNif, T01U613_n3643TrnNif
            }
            , new Object[] {
            T01U614_A3109AlbDivAbr, T01U614_n3109AlbDivAbr
            }
            , new Object[] {
            T01U615_A841TrnNom, T01U615_n841TrnNom, T01U615_A3643TrnNif, T01U615_n3643TrnNif
            }
            , new Object[] {
            T01U616_A396EmprCod, T01U616_A30AlbProCod
            }
            , new Object[] {
            T01U617_A396EmprCod, T01U617_A30AlbProCod
            }
            , new Object[] {
            T01U618_A396EmprCod, T01U618_A30AlbProCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01U622_A1244GuiRemCln, T01U622_A3145GuiRemDivT, T01U622_n3145GuiRemDivT, T01U622_A3110GuiRemDiv, T01U622_n3110GuiRemDiv
            }
            , new Object[] {
            T01U623_A841TrnNom, T01U623_n841TrnNom, T01U623_A3643TrnNif, T01U623_n3643TrnNif
            }
            , new Object[] {
            T01U624_A1260BusDomEnv, T01U624_n1260BusDomEnv
            }
            , new Object[] {
            T01U625_A3109AlbDivAbr, T01U625_n3109AlbDivAbr
            }
            , new Object[] {
            T01U626_A841TrnNom, T01U626_n841TrnNom, T01U626_A3643TrnNif, T01U626_n3643TrnNif
            }
            , new Object[] {
            T01U627_A396EmprCod, T01U627_A30AlbProCod, T01U627_A12185DltLinObs
            }
            , new Object[] {
            T01U628_A396EmprCod, T01U628_A30AlbProCod, T01U628_A12176DltHdr, T01U628_A12177DltR, T01U628_A12178DltP
            }
            , new Object[] {
            T01U629_A396EmprCod, T01U629_A30AlbProCod, T01U629_A7540Alb_NFisca
            }
            , new Object[] {
            T01U630_A396EmprCod, T01U630_A30AlbProCod, T01U630_A129BarCod, T01U630_A132BarCodReo, T01U630_A130BarCodPar
            }
            , new Object[] {
            T01U631_A396EmprCod, T01U631_A30AlbProCod, T01U631_A915AlbPObsLin
            }
            , new Object[] {
            T01U632_A396EmprCod, T01U632_A30AlbProCod
            }
         }
      );
      AV55Pgmdesc = httpContext.getMessage( "Documento de Transporte Produccion", "") ;
      AV54Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_1" ;
      Z10765AlbProAT = " " ;
      A10765AlbProAT = " " ;
      i10765AlbProAT = " " ;
      Z7098AlbUsu = "" ;
      A7098AlbUsu = "" ;
      i7098AlbUsu = "" ;
      Z3869AlbCliDes = 0 ;
      A3869AlbCliDes = 0 ;
      Z5140AlbMarca = " " ;
      A5140AlbMarca = " " ;
      i5140AlbMarca = " " ;
      Z34AlbProfch = GXutil.today( ) ;
      A34AlbProfch = GXutil.today( ) ;
      i34AlbProfch = GXutil.today( ) ;
   }

   private byte Z1259AlbDomEnv ;
   private byte Z1258GuiRemDom ;
   private byte Z33AlbProEst ;
   private byte Z5805AlbEnvFtp ;
   private byte Z3867AlbLocDes ;
   private byte Z3866AlbLocCar ;
   private byte Z914AlbPObsCon ;
   private byte Z5803AlbTipCal ;
   private byte Z3108AlbDivCod ;
   private byte N3108AlbDivCod ;
   private byte GxWebError ;
   private byte A1259AlbDomEnv ;
   private byte A3108AlbDivCod ;
   private byte nKeyPressed ;
   private byte A5805AlbEnvFtp ;
   private byte AV32ComboAlbDomEnv ;
   private byte A33AlbProEst ;
   private byte A1258GuiRemDom ;
   private byte A3867AlbLocDes ;
   private byte A3866AlbLocCar ;
   private byte A914AlbPObsCon ;
   private byte A5803AlbTipCal ;
   private byte A14251AlbFactura ;
   private byte AV14Insert_AlbDivCod ;
   private byte Gx_BScreen ;
   private byte A3110GuiRemDiv ;
   private byte A1260BusDomEnv ;
   private byte Z3110GuiRemDiv ;
   private byte Z1260BusDomEnv ;
   private byte GXt_int10 ;
   private byte GXv_int11[] ;
   private byte gxajaxcallmode ;
   private byte Z14251AlbFactura ;
   private short Z840TrnCod ;
   private short N840TrnCod ;
   private short A840TrnCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A14252AlbLineasA ;
   private short AV30ComboTrnCod ;
   private short AV13Insert_TrnCod ;
   private short RcdFound3 ;
   private short AV49Moda21 ;
   private short nIsDirty_3 ;
   private short GXt_int18 ;
   private short GXv_int19[] ;
   private short Z14252AlbLineasA ;
   private int Z3869AlbCliDes ;
   private int Z7162AlbDesp ;
   private int Z7985AlbTipDoc ;
   private int Z1243GuiRemCli ;
   private int N1243GuiRemCli ;
   private int A1243GuiRemCli ;
   private int trnEnded ;
   private int edtAlbProCod_Enabled ;
   private int edtAlbProfch_Enabled ;
   private int edtAlbFecAnt_Enabled ;
   private int edtGuiRemCli_Visible ;
   private int edtGuiRemCli_Enabled ;
   private int A3869AlbCliDes ;
   private int edtAlbCliDes_Enabled ;
   private int edtAlbCliDes_Visible ;
   private int edtAlbUsu_Enabled ;
   private int edtAlbDomEnv_Enabled ;
   private int edtAlbDomEnv_Visible ;
   private int edtTrnCod_Visible ;
   private int edtTrnCod_Enabled ;
   private int edtAlbMat_Enabled ;
   private int edtAlbFecSal_Enabled ;
   private int edtAlbHorSal_Enabled ;
   private int edtavContcod_Enabled ;
   private int edtAlbLineasA_Enabled ;
   private int edtAlbLic_Enabled ;
   private int edtAlbHhfm_Enabled ;
   private int edtAlbPdATCUD_Enabled ;
   private int edtFirma4dig_Enabled ;
   private int edtAlbTrnNm_Enabled ;
   private int edtAlbTrnDm_Enabled ;
   private int edtAlbTrnNc_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int AV25ComboGuiRemCli ;
   private int edtavComboguiremcli_Enabled ;
   private int edtavComboguiremcli_Visible ;
   private int AV27ComboAlbCliDes ;
   private int edtavComboalbclides_Enabled ;
   private int edtavComboalbclides_Visible ;
   private int edtavComboalbdomenv_Enabled ;
   private int edtavComboalbdomenv_Visible ;
   private int edtavCombotrncod_Enabled ;
   private int edtavCombotrncod_Visible ;
   private int edtAlbGrossT_Enabled ;
   private int edtAlbGrossT_Visible ;
   private int edtAlbSec_Visible ;
   private int edtAlbSec_Enabled ;
   private int edtAlbProPri_Visible ;
   private int edtAlbProPri_Enabled ;
   private int edtAlbProEst_Enabled ;
   private int edtAlbProEst_Visible ;
   private int A7162AlbDesp ;
   private int A7985AlbTipDoc ;
   private int AV12Insert_GuiRemCli ;
   private int Combo_guiremcli_Datalistupdateminimumcharacters ;
   private int Combo_albclides_Datalistupdateminimumcharacters ;
   private int Combo_albdomenv_Datalistupdateminimumcharacters ;
   private int Combo_trncod_Datalistupdateminimumcharacters ;
   private int Datamonjs_Gxcontroltype ;
   private int AV56GXV1 ;
   private int AV37Tmp_CliCod ;
   private int GXt_int8 ;
   private int GX_JID ;
   private int idxLst ;
   private int GXv_int9[] ;
   private long wcpOAV8AlbProCod ;
   private long Z30AlbProCod ;
   private long Z7102AlbNumT ;
   private long A30AlbProCod ;
   private long AV8AlbProCod ;
   private long A7102AlbNumT ;
   private java.math.BigDecimal Z10020AlbGrossT ;
   private java.math.BigDecimal Z7986AlbCambio ;
   private java.math.BigDecimal A10020AlbGrossT ;
   private java.math.BigDecimal A7986AlbCambio ;
   private java.math.BigDecimal A14253AlbImporte ;
   private java.math.BigDecimal GXt_decimal16 ;
   private java.math.BigDecimal GXv_decimal17[] ;
   private java.math.BigDecimal Z14253AlbImporte ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV7EmprCod ;
   private String wcpOAV17AlbProPri ;
   private String wcpOAV21ContCod ;
   private String wcpOAV22AlbSec ;
   private String Z396EmprCod ;
   private String Z39AlbProPri ;
   private String Z3093AlbDivTCod ;
   private String Z2242AlbSec ;
   private String Z3865AlbHorSal ;
   private String Z7098AlbUsu ;
   private String Z3868AlbMat ;
   private String Z7101AlbLic ;
   private String Z10765AlbProAT ;
   private String Z10837AlbTrnNc ;
   private String Z10835AlbTrnNm ;
   private String Z10018ALbFmdc ;
   private String Z10836AlbTrnDm ;
   private String Z5140AlbMarca ;
   private String Z5141AlbIvaCod ;
   private String Z7987AlbColCa ;
   private String Z7984AlbMotTr ;
   private String Z7988AlbObsCb ;
   private String Z7100AlbMarCo ;
   private String Z7099AlbOComp ;
   private String Z14074AlbPdTipAT ;
   private String Z14073AlbPdSerAT ;
   private String Z14069AlbPdATCUD ;
   private String Z1253EmprGuiRem ;
   private String N1253EmprGuiRem ;
   private String Combo_trncod_Selectedvalue_get ;
   private String Combo_albdomenv_Selectedvalue_get ;
   private String Combo_albclides_Selectedvalue_get ;
   private String Combo_guiremcli_Selectedvalue_get ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV7EmprCod ;
   private String AV21ContCod ;
   private String A396EmprCod ;
   private String A39AlbProPri ;
   private String A1253EmprGuiRem ;
   private String Gx_mode ;
   private String AV17AlbProPri ;
   private String AV22AlbSec ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtAlbProCod_Internalname ;
   private String A10765AlbProAT ;
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
   private String edtAlbProCod_Jsonclick ;
   private String edtAlbProfch_Internalname ;
   private String edtAlbProfch_Jsonclick ;
   private String edtAlbFecAnt_Internalname ;
   private String edtAlbFecAnt_Jsonclick ;
   private String divTablesplittedguiremcli_Internalname ;
   private String lblTextblockguiremcli_Internalname ;
   private String lblTextblockguiremcli_Jsonclick ;
   private String Combo_guiremcli_Caption ;
   private String Combo_guiremcli_Cls ;
   private String Combo_guiremcli_Internalname ;
   private String edtGuiRemCli_Internalname ;
   private String edtGuiRemCli_Jsonclick ;
   private String divTablesplittedalbclides_Internalname ;
   private String lblTextblockalbclides_Internalname ;
   private String lblTextblockalbclides_Jsonclick ;
   private String Combo_albclides_Caption ;
   private String Combo_albclides_Cls ;
   private String Combo_albclides_Internalname ;
   private String edtAlbCliDes_Internalname ;
   private String edtAlbCliDes_Jsonclick ;
   private String edtAlbUsu_Internalname ;
   private String A7098AlbUsu ;
   private String edtAlbUsu_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String divTablesplittedalbdomenv_Internalname ;
   private String lblTextblockalbdomenv_Internalname ;
   private String lblTextblockalbdomenv_Jsonclick ;
   private String Combo_albdomenv_Caption ;
   private String Combo_albdomenv_Cls ;
   private String Combo_albdomenv_Emptyitemtext ;
   private String Combo_albdomenv_Internalname ;
   private String edtAlbDomEnv_Internalname ;
   private String edtAlbDomEnv_Jsonclick ;
   private String divTablesplittedtrncod_Internalname ;
   private String lblTextblocktrncod_Internalname ;
   private String lblTextblocktrncod_Jsonclick ;
   private String Combo_trncod_Caption ;
   private String Combo_trncod_Cls ;
   private String Combo_trncod_Emptyitemtext ;
   private String Combo_trncod_Internalname ;
   private String edtTrnCod_Internalname ;
   private String edtTrnCod_Jsonclick ;
   private String edtAlbMat_Internalname ;
   private String A3868AlbMat ;
   private String edtAlbMat_Jsonclick ;
   private String edtAlbFecSal_Internalname ;
   private String edtAlbFecSal_Jsonclick ;
   private String edtAlbHorSal_Internalname ;
   private String A3865AlbHorSal ;
   private String edtAlbHorSal_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String divUnnamedtable6_Internalname ;
   private String edtavContcod_Internalname ;
   private String edtavContcod_Jsonclick ;
   private String edtAlbLineasA_Internalname ;
   private String edtAlbLineasA_Jsonclick ;
   private String Dvpanel_unnamedtable7_Width ;
   private String Dvpanel_unnamedtable7_Cls ;
   private String Dvpanel_unnamedtable7_Title ;
   private String Dvpanel_unnamedtable7_Iconposition ;
   private String Dvpanel_unnamedtable7_Internalname ;
   private String divUnnamedtable7_Internalname ;
   private String divUnnamedtable11_Internalname ;
   private String edtAlbLic_Internalname ;
   private String A7101AlbLic ;
   private String edtAlbLic_Jsonclick ;
   private String edtAlbHhfm_Internalname ;
   private String edtAlbHhfm_Jsonclick ;
   private String edtAlbPdATCUD_Internalname ;
   private String A14069AlbPdATCUD ;
   private String edtAlbPdATCUD_Jsonclick ;
   private String edtFirma4dig_Internalname ;
   private String A14362Firma4dig ;
   private String edtFirma4dig_Jsonclick ;
   private String divDvpanel_unnamedtable8_cell_Internalname ;
   private String divDvpanel_unnamedtable8_cell_Class ;
   private String Dvpanel_unnamedtable8_Width ;
   private String Dvpanel_unnamedtable8_Cls ;
   private String Dvpanel_unnamedtable8_Title ;
   private String Dvpanel_unnamedtable8_Iconposition ;
   private String Dvpanel_unnamedtable8_Internalname ;
   private String divUnnamedtable8_Internalname ;
   private String divUnnamedtable9_Internalname ;
   private String edtAlbTrnNm_Internalname ;
   private String A10835AlbTrnNm ;
   private String edtAlbTrnNm_Jsonclick ;
   private String edtAlbTrnDm_Internalname ;
   private String A10836AlbTrnDm ;
   private String edtAlbTrnDm_Jsonclick ;
   private String divUnnamedtable10_Internalname ;
   private String edtAlbTrnNc_Internalname ;
   private String A10837AlbTrnNc ;
   private String edtAlbTrnNc_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV54Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_guiremcli_Internalname ;
   private String edtavComboguiremcli_Internalname ;
   private String edtavComboguiremcli_Jsonclick ;
   private String divSectionattribute_albclides_Internalname ;
   private String edtavComboalbclides_Internalname ;
   private String edtavComboalbclides_Jsonclick ;
   private String divSectionattribute_albdomenv_Internalname ;
   private String edtavComboalbdomenv_Internalname ;
   private String edtavComboalbdomenv_Jsonclick ;
   private String divSectionattribute_trncod_Internalname ;
   private String edtavCombotrncod_Internalname ;
   private String edtavCombotrncod_Jsonclick ;
   private String edtAlbGrossT_Internalname ;
   private String edtAlbGrossT_Jsonclick ;
   private String edtAlbSec_Internalname ;
   private String A2242AlbSec ;
   private String edtAlbSec_Jsonclick ;
   private String edtAlbProPri_Internalname ;
   private String edtAlbProPri_Jsonclick ;
   private String edtAlbProEst_Internalname ;
   private String edtAlbProEst_Jsonclick ;
   private String A3093AlbDivTCod ;
   private String A10018ALbFmdc ;
   private String A5140AlbMarca ;
   private String A5141AlbIvaCod ;
   private String A7987AlbColCa ;
   private String A7984AlbMotTr ;
   private String A7988AlbObsCb ;
   private String A7100AlbMarCo ;
   private String A7099AlbOComp ;
   private String A14074AlbPdTipAT ;
   private String A14073AlbPdSerAT ;
   private String AV15Insert_EmprGuiRem ;
   private String AV20UsurCod ;
   private String AV55Pgmdesc ;
   private String A1244GuiRemCln ;
   private String A3145GuiRemDivT ;
   private String A407EmprNom ;
   private String A841TrnNom ;
   private String A3643TrnNif ;
   private String A3109AlbDivAbr ;
   private String Combo_guiremcli_Objectcall ;
   private String Combo_guiremcli_Class ;
   private String Combo_guiremcli_Icontype ;
   private String Combo_guiremcli_Icon ;
   private String Combo_guiremcli_Tooltip ;
   private String Combo_guiremcli_Selectedvalue_set ;
   private String Combo_guiremcli_Selectedtext_set ;
   private String Combo_guiremcli_Selectedtext_get ;
   private String Combo_guiremcli_Gamoauthtoken ;
   private String Combo_guiremcli_Ddointernalname ;
   private String Combo_guiremcli_Titlecontrolalign ;
   private String Combo_guiremcli_Dropdownoptionstype ;
   private String Combo_guiremcli_Titlecontrolidtoreplace ;
   private String Combo_guiremcli_Datalisttype ;
   private String Combo_guiremcli_Datalistfixedvalues ;
   private String Combo_guiremcli_Datalistproc ;
   private String Combo_guiremcli_Datalistprocparametersprefix ;
   private String Combo_guiremcli_Remoteservicesparameters ;
   private String Combo_guiremcli_Htmltemplate ;
   private String Combo_guiremcli_Multiplevaluestype ;
   private String Combo_guiremcli_Loadingdata ;
   private String Combo_guiremcli_Noresultsfound ;
   private String Combo_guiremcli_Emptyitemtext ;
   private String Combo_guiremcli_Onlyselectedvalues ;
   private String Combo_guiremcli_Selectalltext ;
   private String Combo_guiremcli_Multiplevaluesseparator ;
   private String Combo_guiremcli_Addnewoptiontext ;
   private String Combo_albclides_Objectcall ;
   private String Combo_albclides_Class ;
   private String Combo_albclides_Icontype ;
   private String Combo_albclides_Icon ;
   private String Combo_albclides_Tooltip ;
   private String Combo_albclides_Selectedvalue_set ;
   private String Combo_albclides_Selectedtext_set ;
   private String Combo_albclides_Selectedtext_get ;
   private String Combo_albclides_Gamoauthtoken ;
   private String Combo_albclides_Ddointernalname ;
   private String Combo_albclides_Titlecontrolalign ;
   private String Combo_albclides_Dropdownoptionstype ;
   private String Combo_albclides_Titlecontrolidtoreplace ;
   private String Combo_albclides_Datalisttype ;
   private String Combo_albclides_Datalistfixedvalues ;
   private String Combo_albclides_Datalistproc ;
   private String Combo_albclides_Datalistprocparametersprefix ;
   private String Combo_albclides_Remoteservicesparameters ;
   private String Combo_albclides_Htmltemplate ;
   private String Combo_albclides_Multiplevaluestype ;
   private String Combo_albclides_Loadingdata ;
   private String Combo_albclides_Noresultsfound ;
   private String Combo_albclides_Emptyitemtext ;
   private String Combo_albclides_Onlyselectedvalues ;
   private String Combo_albclides_Selectalltext ;
   private String Combo_albclides_Multiplevaluesseparator ;
   private String Combo_albclides_Addnewoptiontext ;
   private String Combo_albdomenv_Objectcall ;
   private String Combo_albdomenv_Class ;
   private String Combo_albdomenv_Icontype ;
   private String Combo_albdomenv_Icon ;
   private String Combo_albdomenv_Tooltip ;
   private String Combo_albdomenv_Selectedvalue_set ;
   private String Combo_albdomenv_Selectedtext_set ;
   private String Combo_albdomenv_Selectedtext_get ;
   private String Combo_albdomenv_Gamoauthtoken ;
   private String Combo_albdomenv_Ddointernalname ;
   private String Combo_albdomenv_Titlecontrolalign ;
   private String Combo_albdomenv_Dropdownoptionstype ;
   private String Combo_albdomenv_Titlecontrolidtoreplace ;
   private String Combo_albdomenv_Datalisttype ;
   private String Combo_albdomenv_Datalistfixedvalues ;
   private String Combo_albdomenv_Datalistproc ;
   private String Combo_albdomenv_Datalistprocparametersprefix ;
   private String Combo_albdomenv_Remoteservicesparameters ;
   private String Combo_albdomenv_Htmltemplate ;
   private String Combo_albdomenv_Multiplevaluestype ;
   private String Combo_albdomenv_Loadingdata ;
   private String Combo_albdomenv_Noresultsfound ;
   private String Combo_albdomenv_Onlyselectedvalues ;
   private String Combo_albdomenv_Selectalltext ;
   private String Combo_albdomenv_Multiplevaluesseparator ;
   private String Combo_albdomenv_Addnewoptiontext ;
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
   private String hsh ;
   private String sMode3 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV18Station ;
   private String GXt_char1 ;
   private String AV19EmprNom ;
   private String AV48CliFacMtsP ;
   private String Z3109AlbDivAbr ;
   private String Z407EmprNom ;
   private String Z1244GuiRemCln ;
   private String Z3145GuiRemDivT ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i5140AlbMarca ;
   private String i7098AlbUsu ;
   private String i10765AlbProAT ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z841TrnNom ;
   private String Z3643TrnNif ;
   private java.util.Date Z10019AlbHhfm ;
   private java.util.Date Z14404AlbEnvMail ;
   private java.util.Date A10019AlbHhfm ;
   private java.util.Date A14404AlbEnvMail ;
   private java.util.Date Z34AlbProfch ;
   private java.util.Date Z4023AlbFecSal ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date A14396AlbFecAnt ;
   private java.util.Date A4023AlbFecSal ;
   private java.util.Date i34AlbProfch ;
   private java.util.Date GXt_date14 ;
   private java.util.Date GXv_date15[] ;
   private java.util.Date Z14396AlbFecAnt ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n1259AlbDomEnv ;
   private boolean n3108AlbDivCod ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_guiremcli_Emptyitem ;
   private boolean Combo_albclides_Emptyitem ;
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
   private boolean n3093AlbDivTCod ;
   private boolean n1258GuiRemDom ;
   private boolean n10017AlbFmd ;
   private boolean n3145GuiRemDivT ;
   private boolean n3110GuiRemDiv ;
   private boolean n407EmprNom ;
   private boolean n841TrnNom ;
   private boolean n3643TrnNif ;
   private boolean n3109AlbDivAbr ;
   private boolean n1260BusDomEnv ;
   private boolean Combo_guiremcli_Enabled ;
   private boolean Combo_guiremcli_Visible ;
   private boolean Combo_guiremcli_Allowmultipleselection ;
   private boolean Combo_guiremcli_Isgriditem ;
   private boolean Combo_guiremcli_Hasdescription ;
   private boolean Combo_guiremcli_Includeonlyselectedoption ;
   private boolean Combo_guiremcli_Includeselectalloption ;
   private boolean Combo_guiremcli_Includeaddnewoption ;
   private boolean Combo_albclides_Enabled ;
   private boolean Combo_albclides_Visible ;
   private boolean Combo_albclides_Allowmultipleselection ;
   private boolean Combo_albclides_Isgriditem ;
   private boolean Combo_albclides_Hasdescription ;
   private boolean Combo_albclides_Includeonlyselectedoption ;
   private boolean Combo_albclides_Includeselectalloption ;
   private boolean Combo_albclides_Includeaddnewoption ;
   private boolean Combo_albdomenv_Enabled ;
   private boolean Combo_albdomenv_Visible ;
   private boolean Combo_albdomenv_Allowmultipleselection ;
   private boolean Combo_albdomenv_Isgriditem ;
   private boolean Combo_albdomenv_Hasdescription ;
   private boolean Combo_albdomenv_Includeonlyselectedoption ;
   private boolean Combo_albdomenv_Includeselectalloption ;
   private boolean Combo_albdomenv_Emptyitem ;
   private boolean Combo_albdomenv_Includeaddnewoption ;
   private boolean Combo_trncod_Enabled ;
   private boolean Combo_trncod_Visible ;
   private boolean Combo_trncod_Allowmultipleselection ;
   private boolean Combo_trncod_Isgriditem ;
   private boolean Combo_trncod_Hasdescription ;
   private boolean Combo_trncod_Includeonlyselectedoption ;
   private boolean Combo_trncod_Includeselectalloption ;
   private boolean Combo_trncod_Emptyitem ;
   private boolean Combo_trncod_Includeaddnewoption ;
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
   private boolean returnInSub ;
   private boolean AV44ok ;
   private boolean Gx_longc ;
   private String AV45Messages_json ;
   private String Z10017AlbFmd ;
   private String A10017AlbFmd ;
   private String AV47Hash ;
   private String AV24ComboSelectedValue ;
   private com.genexus.webpanels.WebSession AV11WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_guiremcli ;
   private com.genexus.webpanels.GXUserControl ucCombo_albclides ;
   private com.genexus.webpanels.GXUserControl ucCombo_albdomenv ;
   private com.genexus.webpanels.GXUserControl ucCombo_trncod ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable7 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable8 ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavAlbpropri ;
   private HTMLChoice cmbAlbEnvFtp ;
   private HTMLChoice cmbAlbProAT ;
   private IDataStoreProvider pr_default ;
   private String[] T01U65_A407EmprNom ;
   private boolean[] T01U65_n407EmprNom ;
   private String[] T01U68_A3109AlbDivAbr ;
   private boolean[] T01U68_n3109AlbDivAbr ;
   private String[] T01U66_A841TrnNom ;
   private boolean[] T01U66_n841TrnNom ;
   private String[] T01U66_A3643TrnNif ;
   private boolean[] T01U66_n3643TrnNif ;
   private String[] T01U64_A1244GuiRemCln ;
   private String[] T01U64_A3145GuiRemDivT ;
   private boolean[] T01U64_n3145GuiRemDivT ;
   private byte[] T01U64_A3110GuiRemDiv ;
   private boolean[] T01U64_n3110GuiRemDiv ;
   private String[] T01U67_A841TrnNom ;
   private boolean[] T01U67_n841TrnNom ;
   private String[] T01U67_A3643TrnNif ;
   private boolean[] T01U67_n3643TrnNif ;
   private byte[] T01U69_A1260BusDomEnv ;
   private boolean[] T01U69_n1260BusDomEnv ;
   private int[] T01U610_A252CliCod ;
   private byte[] T01U610_A266CliEnvLin ;
   private long[] T01U610_A30AlbProCod ;
   private byte[] T01U610_A1259AlbDomEnv ;
   private boolean[] T01U610_n1259AlbDomEnv ;
   private int[] T01U610_A3869AlbCliDes ;
   private String[] T01U610_A39AlbProPri ;
   private String[] T01U610_A3093AlbDivTCod ;
   private boolean[] T01U610_n3093AlbDivTCod ;
   private byte[] T01U610_A1258GuiRemDom ;
   private boolean[] T01U610_n1258GuiRemDom ;
   private String[] T01U610_A2242AlbSec ;
   private byte[] T01U610_A33AlbProEst ;
   private java.util.Date[] T01U610_A34AlbProfch ;
   private java.util.Date[] T01U610_A4023AlbFecSal ;
   private String[] T01U610_A3865AlbHorSal ;
   private String[] T01U610_A7098AlbUsu ;
   private String[] T01U610_A1244GuiRemCln ;
   private String[] T01U610_A3868AlbMat ;
   private byte[] T01U610_A5805AlbEnvFtp ;
   private String[] T01U610_A7101AlbLic ;
   private String[] T01U610_A10765AlbProAT ;
   private java.util.Date[] T01U610_A10019AlbHhfm ;
   private java.math.BigDecimal[] T01U610_A10020AlbGrossT ;
   private String[] T01U610_A10837AlbTrnNc ;
   private String[] T01U610_A10017AlbFmd ;
   private boolean[] T01U610_n10017AlbFmd ;
   private String[] T01U610_A10835AlbTrnNm ;
   private String[] T01U610_A10018ALbFmdc ;
   private String[] T01U610_A10836AlbTrnDm ;
   private String[] T01U610_A5140AlbMarca ;
   private byte[] T01U610_A3867AlbLocDes ;
   private byte[] T01U610_A3866AlbLocCar ;
   private byte[] T01U610_A914AlbPObsCon ;
   private String[] T01U610_A5141AlbIvaCod ;
   private String[] T01U610_A7987AlbColCa ;
   private int[] T01U610_A7162AlbDesp ;
   private java.math.BigDecimal[] T01U610_A7986AlbCambio ;
   private int[] T01U610_A7985AlbTipDoc ;
   private String[] T01U610_A7984AlbMotTr ;
   private byte[] T01U610_A5803AlbTipCal ;
   private String[] T01U610_A7988AlbObsCb ;
   private long[] T01U610_A7102AlbNumT ;
   private String[] T01U610_A7100AlbMarCo ;
   private String[] T01U610_A7099AlbOComp ;
   private String[] T01U610_A3109AlbDivAbr ;
   private boolean[] T01U610_n3109AlbDivAbr ;
   private String[] T01U610_A3145GuiRemDivT ;
   private boolean[] T01U610_n3145GuiRemDivT ;
   private String[] T01U610_A407EmprNom ;
   private boolean[] T01U610_n407EmprNom ;
   private String[] T01U610_A14074AlbPdTipAT ;
   private String[] T01U610_A14073AlbPdSerAT ;
   private String[] T01U610_A14069AlbPdATCUD ;
   private java.util.Date[] T01U610_A14404AlbEnvMail ;
   private String[] T01U610_A1253EmprGuiRem ;
   private int[] T01U610_A1243GuiRemCli ;
   private String[] T01U610_A396EmprCod ;
   private short[] T01U610_A840TrnCod ;
   private byte[] T01U610_A3108AlbDivCod ;
   private boolean[] T01U610_n3108AlbDivCod ;
   private byte[] T01U610_A3110GuiRemDiv ;
   private boolean[] T01U610_n3110GuiRemDiv ;
   private byte[] T01U610_A1260BusDomEnv ;
   private boolean[] T01U610_n1260BusDomEnv ;
   private String[] T01U611_A1244GuiRemCln ;
   private String[] T01U611_A3145GuiRemDivT ;
   private boolean[] T01U611_n3145GuiRemDivT ;
   private byte[] T01U611_A3110GuiRemDiv ;
   private boolean[] T01U611_n3110GuiRemDiv ;
   private byte[] T01U612_A1260BusDomEnv ;
   private boolean[] T01U612_n1260BusDomEnv ;
   private String[] T01U613_A841TrnNom ;
   private boolean[] T01U613_n841TrnNom ;
   private String[] T01U613_A3643TrnNif ;
   private boolean[] T01U613_n3643TrnNif ;
   private String[] T01U614_A3109AlbDivAbr ;
   private boolean[] T01U614_n3109AlbDivAbr ;
   private String[] T01U615_A841TrnNom ;
   private boolean[] T01U615_n841TrnNom ;
   private String[] T01U615_A3643TrnNif ;
   private boolean[] T01U615_n3643TrnNif ;
   private String[] T01U616_A396EmprCod ;
   private long[] T01U616_A30AlbProCod ;
   private long[] T01U63_A30AlbProCod ;
   private byte[] T01U63_A1259AlbDomEnv ;
   private boolean[] T01U63_n1259AlbDomEnv ;
   private int[] T01U63_A3869AlbCliDes ;
   private String[] T01U63_A39AlbProPri ;
   private String[] T01U63_A3093AlbDivTCod ;
   private boolean[] T01U63_n3093AlbDivTCod ;
   private byte[] T01U63_A1258GuiRemDom ;
   private boolean[] T01U63_n1258GuiRemDom ;
   private String[] T01U63_A2242AlbSec ;
   private byte[] T01U63_A33AlbProEst ;
   private java.util.Date[] T01U63_A34AlbProfch ;
   private java.util.Date[] T01U63_A4023AlbFecSal ;
   private String[] T01U63_A3865AlbHorSal ;
   private String[] T01U63_A7098AlbUsu ;
   private String[] T01U63_A3868AlbMat ;
   private byte[] T01U63_A5805AlbEnvFtp ;
   private String[] T01U63_A7101AlbLic ;
   private String[] T01U63_A10765AlbProAT ;
   private java.util.Date[] T01U63_A10019AlbHhfm ;
   private java.math.BigDecimal[] T01U63_A10020AlbGrossT ;
   private String[] T01U63_A10837AlbTrnNc ;
   private String[] T01U63_A10017AlbFmd ;
   private boolean[] T01U63_n10017AlbFmd ;
   private String[] T01U63_A10835AlbTrnNm ;
   private String[] T01U63_A10018ALbFmdc ;
   private String[] T01U63_A10836AlbTrnDm ;
   private String[] T01U63_A5140AlbMarca ;
   private byte[] T01U63_A3867AlbLocDes ;
   private byte[] T01U63_A3866AlbLocCar ;
   private byte[] T01U63_A914AlbPObsCon ;
   private String[] T01U63_A5141AlbIvaCod ;
   private String[] T01U63_A7987AlbColCa ;
   private int[] T01U63_A7162AlbDesp ;
   private java.math.BigDecimal[] T01U63_A7986AlbCambio ;
   private int[] T01U63_A7985AlbTipDoc ;
   private String[] T01U63_A7984AlbMotTr ;
   private byte[] T01U63_A5803AlbTipCal ;
   private String[] T01U63_A7988AlbObsCb ;
   private long[] T01U63_A7102AlbNumT ;
   private String[] T01U63_A7100AlbMarCo ;
   private String[] T01U63_A7099AlbOComp ;
   private String[] T01U63_A14074AlbPdTipAT ;
   private String[] T01U63_A14073AlbPdSerAT ;
   private String[] T01U63_A14069AlbPdATCUD ;
   private java.util.Date[] T01U63_A14404AlbEnvMail ;
   private String[] T01U63_A1253EmprGuiRem ;
   private int[] T01U63_A1243GuiRemCli ;
   private String[] T01U63_A396EmprCod ;
   private short[] T01U63_A840TrnCod ;
   private byte[] T01U63_A3108AlbDivCod ;
   private boolean[] T01U63_n3108AlbDivCod ;
   private String[] T01U617_A396EmprCod ;
   private long[] T01U617_A30AlbProCod ;
   private String[] T01U618_A396EmprCod ;
   private long[] T01U618_A30AlbProCod ;
   private long[] T01U62_A30AlbProCod ;
   private byte[] T01U62_A1259AlbDomEnv ;
   private boolean[] T01U62_n1259AlbDomEnv ;
   private int[] T01U62_A3869AlbCliDes ;
   private String[] T01U62_A39AlbProPri ;
   private String[] T01U62_A3093AlbDivTCod ;
   private boolean[] T01U62_n3093AlbDivTCod ;
   private byte[] T01U62_A1258GuiRemDom ;
   private boolean[] T01U62_n1258GuiRemDom ;
   private String[] T01U62_A2242AlbSec ;
   private byte[] T01U62_A33AlbProEst ;
   private java.util.Date[] T01U62_A34AlbProfch ;
   private java.util.Date[] T01U62_A4023AlbFecSal ;
   private String[] T01U62_A3865AlbHorSal ;
   private String[] T01U62_A7098AlbUsu ;
   private String[] T01U62_A3868AlbMat ;
   private byte[] T01U62_A5805AlbEnvFtp ;
   private String[] T01U62_A7101AlbLic ;
   private String[] T01U62_A10765AlbProAT ;
   private java.util.Date[] T01U62_A10019AlbHhfm ;
   private java.math.BigDecimal[] T01U62_A10020AlbGrossT ;
   private String[] T01U62_A10837AlbTrnNc ;
   private String[] T01U62_A10017AlbFmd ;
   private boolean[] T01U62_n10017AlbFmd ;
   private String[] T01U62_A10835AlbTrnNm ;
   private String[] T01U62_A10018ALbFmdc ;
   private String[] T01U62_A10836AlbTrnDm ;
   private String[] T01U62_A5140AlbMarca ;
   private byte[] T01U62_A3867AlbLocDes ;
   private byte[] T01U62_A3866AlbLocCar ;
   private byte[] T01U62_A914AlbPObsCon ;
   private String[] T01U62_A5141AlbIvaCod ;
   private String[] T01U62_A7987AlbColCa ;
   private int[] T01U62_A7162AlbDesp ;
   private java.math.BigDecimal[] T01U62_A7986AlbCambio ;
   private int[] T01U62_A7985AlbTipDoc ;
   private String[] T01U62_A7984AlbMotTr ;
   private byte[] T01U62_A5803AlbTipCal ;
   private String[] T01U62_A7988AlbObsCb ;
   private long[] T01U62_A7102AlbNumT ;
   private String[] T01U62_A7100AlbMarCo ;
   private String[] T01U62_A7099AlbOComp ;
   private String[] T01U62_A14074AlbPdTipAT ;
   private String[] T01U62_A14073AlbPdSerAT ;
   private String[] T01U62_A14069AlbPdATCUD ;
   private java.util.Date[] T01U62_A14404AlbEnvMail ;
   private String[] T01U62_A1253EmprGuiRem ;
   private int[] T01U62_A1243GuiRemCli ;
   private String[] T01U62_A396EmprCod ;
   private short[] T01U62_A840TrnCod ;
   private byte[] T01U62_A3108AlbDivCod ;
   private boolean[] T01U62_n3108AlbDivCod ;
   private String[] T01U622_A1244GuiRemCln ;
   private String[] T01U622_A3145GuiRemDivT ;
   private boolean[] T01U622_n3145GuiRemDivT ;
   private byte[] T01U622_A3110GuiRemDiv ;
   private boolean[] T01U622_n3110GuiRemDiv ;
   private String[] T01U623_A841TrnNom ;
   private boolean[] T01U623_n841TrnNom ;
   private String[] T01U623_A3643TrnNif ;
   private boolean[] T01U623_n3643TrnNif ;
   private byte[] T01U624_A1260BusDomEnv ;
   private boolean[] T01U624_n1260BusDomEnv ;
   private String[] T01U625_A3109AlbDivAbr ;
   private boolean[] T01U625_n3109AlbDivAbr ;
   private String[] T01U626_A841TrnNom ;
   private boolean[] T01U626_n841TrnNom ;
   private String[] T01U626_A3643TrnNif ;
   private boolean[] T01U626_n3643TrnNif ;
   private String[] T01U627_A396EmprCod ;
   private long[] T01U627_A30AlbProCod ;
   private byte[] T01U627_A12185DltLinObs ;
   private String[] T01U628_A396EmprCod ;
   private long[] T01U628_A30AlbProCod ;
   private int[] T01U628_A12176DltHdr ;
   private byte[] T01U628_A12177DltR ;
   private String[] T01U628_A12178DltP ;
   private String[] T01U629_A396EmprCod ;
   private long[] T01U629_A30AlbProCod ;
   private String[] T01U629_A7540Alb_NFisca ;
   private String[] T01U630_A396EmprCod ;
   private long[] T01U630_A30AlbProCod ;
   private int[] T01U630_A129BarCod ;
   private byte[] T01U630_A132BarCodReo ;
   private String[] T01U630_A130BarCodPar ;
   private String[] T01U631_A396EmprCod ;
   private long[] T01U631_A30AlbProCod ;
   private byte[] T01U631_A915AlbPObsLin ;
   private String[] T01U632_A396EmprCod ;
   private long[] T01U632_A30AlbProCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV23GuiRemCli_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV26AlbCliDes_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV31AlbDomEnv_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV29TrnCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item12 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item13[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV10TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV16TrnContextAtt ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV33DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[] ;
}

final  class documentodetransporteproduccion_1__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class documentodetransporteproduccion_1__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class documentodetransporteproduccion_1__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class documentodetransporteproduccion_1__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class documentodetransporteproduccion_1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01U62", "SELECT AlbProCod, AlbDomEnv, AlbCliDes, AlbProPri, AlbDivTCod, GuiRemDom, AlbSec, AlbProEst, AlbProfch, AlbFecSal, AlbHorSal, AlbUsu, AlbMat, AlbEnvFtp, AlbLic, AlbProAT, AlbHhfm, AlbGrossT, AlbTrnNc, AlbFmd, AlbTrnNm, ALbFmdc, AlbTrnDm, AlbMarca, AlbLocDes, AlbLocCar, AlbPObsCon, AlbIvaCod, AlbColCa, AlbDesp, AlbCambio, AlbTipDoc, AlbMotTr, AlbTipCal, AlbObsCb, AlbNumT, AlbMarCo, AlbOComp, AlbPdTipAT, AlbPdSerAT, AlbPdATCUD, AlbEnvMail, EmprGuiRem, GuiRemCli, EmprCod, TrnCod, AlbDivCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ?  FOR UPDATE OF AlbDomEnv, AlbCliDes, AlbProPri, AlbDivTCod, GuiRemDom, AlbSec, AlbProEst, AlbProfch, AlbFecSal, AlbHorSal, AlbUsu, AlbMat, AlbEnvFtp, AlbLic, AlbProAT, AlbHhfm, AlbGrossT, AlbTrnNc, AlbFmd, AlbTrnNm, ALbFmdc, AlbTrnDm, AlbMarca, AlbLocDes, AlbLocCar, AlbPObsCon, AlbIvaCod, AlbColCa, AlbDesp, AlbCambio, AlbTipDoc, AlbMotTr, AlbTipCal, AlbObsCb, AlbNumT, AlbMarCo, AlbOComp, AlbPdTipAT, AlbPdSerAT, AlbPdATCUD, AlbEnvMail, EmprGuiRem, GuiRemCli, TrnCod, AlbDivCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U63", "SELECT AlbProCod, AlbDomEnv, AlbCliDes, AlbProPri, AlbDivTCod, GuiRemDom, AlbSec, AlbProEst, AlbProfch, AlbFecSal, AlbHorSal, AlbUsu, AlbMat, AlbEnvFtp, AlbLic, AlbProAT, AlbHhfm, AlbGrossT, AlbTrnNc, AlbFmd, AlbTrnNm, ALbFmdc, AlbTrnDm, AlbMarca, AlbLocDes, AlbLocCar, AlbPObsCon, AlbIvaCod, AlbColCa, AlbDesp, AlbCambio, AlbTipDoc, AlbMotTr, AlbTipCal, AlbObsCb, AlbNumT, AlbMarCo, AlbOComp, AlbPdTipAT, AlbPdSerAT, AlbPdATCUD, AlbEnvMail, EmprGuiRem, GuiRemCli, EmprCod, TrnCod, AlbDivCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U64", "SELECT CliNom AS GuiRemCln, CliDivTra AS GuiRemDivT, CliDivCod AS GuiRemDiv FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U65", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U66", "SELECT TrnNom, TrnNif FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U67", "SELECT TrnNom, TrnNif FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U68", "SELECT DivAbr AS AlbDivAbr FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U69", "SELECT COALESCE( CliEnvLin, 0) AS BusDomEnv FROM TXPCLIENV WHERE EmprCod = ? AND CliCod = ? AND CliEnvLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U610", "SELECT /*+ FIRST_ROWS(100) */ T5.CliCod, T5.CliEnvLin, TM1.AlbProCod, TM1.AlbDomEnv, TM1.AlbCliDes, TM1.AlbProPri, TM1.AlbDivTCod, TM1.GuiRemDom, TM1.AlbSec, TM1.AlbProEst, TM1.AlbProfch, TM1.AlbFecSal, TM1.AlbHorSal, TM1.AlbUsu, T4.CliNom AS GuiRemCln, TM1.AlbMat, TM1.AlbEnvFtp, TM1.AlbLic, TM1.AlbProAT, TM1.AlbHhfm, TM1.AlbGrossT, TM1.AlbTrnNc, TM1.AlbFmd, TM1.AlbTrnNm, TM1.ALbFmdc, TM1.AlbTrnDm, TM1.AlbMarca, TM1.AlbLocDes, TM1.AlbLocCar, TM1.AlbPObsCon, TM1.AlbIvaCod, TM1.AlbColCa, TM1.AlbDesp, TM1.AlbCambio, TM1.AlbTipDoc, TM1.AlbMotTr, TM1.AlbTipCal, TM1.AlbObsCb, TM1.AlbNumT, TM1.AlbMarCo, TM1.AlbOComp, T2.DivAbr AS AlbDivAbr, T4.CliDivTra AS GuiRemDivT, T3.EmprNom, TM1.AlbPdTipAT, TM1.AlbPdSerAT, TM1.AlbPdATCUD, TM1.AlbEnvMail, TM1.EmprGuiRem AS EmprGuiRem, TM1.GuiRemCli AS GuiRemCli, TM1.EmprCod, TM1.TrnCod, TM1.AlbDivCod AS AlbDivCod, T4.CliDivCod AS GuiRemDiv, COALESCE( T5.CliEnvLin, 0) AS BusDomEnv FROM ((((TXPCALPRD TM1 LEFT JOIN TXPDIVISA T2 ON T2.DivCod = TM1.AlbDivCod) INNER JOIN TXPEMPRES T3 ON T3.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T4 ON T4.EmprCod = TM1.EmprGuiRem AND T4.CliCod = TM1.GuiRemCli) LEFT JOIN TXPCLIENV T5 ON T5.EmprCod = TM1.EmprGuiRem AND T5.CliCod = TM1.GuiRemCli AND T5.CliEnvLin = TM1.AlbDomEnv) WHERE TM1.EmprCod = ? and TM1.AlbProCod = ? ORDER BY TM1.EmprCod, TM1.AlbProCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U611", "SELECT CliNom AS GuiRemCln, CliDivTra AS GuiRemDivT, CliDivCod AS GuiRemDiv FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U612", "SELECT COALESCE( CliEnvLin, 0) AS BusDomEnv FROM TXPCLIENV WHERE EmprCod = ? AND CliCod = ? AND CliEnvLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U613", "SELECT TrnNom, TrnNif FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U614", "SELECT DivAbr AS AlbDivAbr FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U615", "SELECT TrnNom, TrnNif FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U616", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U617", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod FROM TXPCALPRD WHERE ( EmprCod > ? or EmprCod = ? and AlbProCod > ?) ORDER BY EmprCod, AlbProCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01U618", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod FROM TXPCALPRD WHERE ( EmprCod < ? or EmprCod = ? and AlbProCod < ?) ORDER BY EmprCod DESC, AlbProCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01U619", "INSERT INTO TXPCALPRD(AlbProCod, AlbDomEnv, AlbCliDes, AlbProPri, AlbDivTCod, GuiRemDom, AlbSec, AlbProEst, AlbProfch, AlbFecSal, AlbHorSal, AlbUsu, AlbMat, AlbEnvFtp, AlbLic, AlbProAT, AlbHhfm, AlbGrossT, AlbTrnNc, AlbFmd, AlbTrnNm, ALbFmdc, AlbTrnDm, AlbMarca, AlbLocDes, AlbLocCar, AlbPObsCon, AlbIvaCod, AlbColCa, AlbDesp, AlbCambio, AlbTipDoc, AlbMotTr, AlbTipCal, AlbObsCb, AlbNumT, AlbMarCo, AlbOComp, AlbPdTipAT, AlbPdSerAT, AlbPdATCUD, AlbEnvMail, EmprGuiRem, GuiRemCli, EmprCod, TrnCod, AlbDivCod, AlbProEso, AlbProEnt, AlbProBon, AlbProTBo, AlbKilRea, AlbProNroF, AlbDomEv, DltUltob, FpgCod, AlbFecAnu, AlbUsuAnu, AlbHorAnu) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', 0, ' ', 0, 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK, "TXPCALPRD")
         ,new UpdateCursor("T01U620", "UPDATE TXPCALPRD SET AlbDomEnv=?, AlbCliDes=?, AlbProPri=?, AlbDivTCod=?, GuiRemDom=?, AlbSec=?, AlbProEst=?, AlbProfch=?, AlbFecSal=?, AlbHorSal=?, AlbUsu=?, AlbMat=?, AlbEnvFtp=?, AlbLic=?, AlbProAT=?, AlbHhfm=?, AlbGrossT=?, AlbTrnNc=?, AlbFmd=?, AlbTrnNm=?, ALbFmdc=?, AlbTrnDm=?, AlbMarca=?, AlbLocDes=?, AlbLocCar=?, AlbPObsCon=?, AlbIvaCod=?, AlbColCa=?, AlbDesp=?, AlbCambio=?, AlbTipDoc=?, AlbMotTr=?, AlbTipCal=?, AlbObsCb=?, AlbNumT=?, AlbMarCo=?, AlbOComp=?, AlbPdTipAT=?, AlbPdSerAT=?, AlbPdATCUD=?, AlbEnvMail=?, EmprGuiRem=?, GuiRemCli=?, TrnCod=?, AlbDivCod=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK, "TXPCALPRD")
         ,new UpdateCursor("T01U621", "DELETE FROM TXPCALPRD  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK, "TXPCALPRD")
         ,new ForEachCursor("T01U622", "SELECT CliNom AS GuiRemCln, CliDivTra AS GuiRemDivT, CliDivCod AS GuiRemDiv FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U623", "SELECT TrnNom, TrnNif FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U624", "SELECT COALESCE( CliEnvLin, 0) AS BusDomEnv FROM TXPCLIENV WHERE EmprCod = ? AND CliCod = ? AND CliEnvLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U625", "SELECT DivAbr AS AlbDivAbr FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U626", "SELECT TrnNom, TrnNif FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U627", "SELECT * FROM (SELECT EmprCod, AlbProCod, DltLinObs FROM TXPDLT005 WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01U628", "SELECT * FROM (SELECT EmprCod, AlbProCod, DltHdr, DltR, DltP FROM TXPDLT001 WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01U629", "SELECT * FROM (SELECT EmprCod, AlbProCod, Alb_NFisca FROM TXPCNOTRE WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01U630", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01U631", "SELECT * FROM (SELECT EmprCod, AlbProCod, AlbPObsLin FROM TXPOBSALB WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01U632", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, AlbProCod FROM TXPCALPRD ORDER BY EmprCod, AlbProCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(10);
               ((String[]) buf[13])[0] = rslt.getString(11, 8);
               ((String[]) buf[14])[0] = rslt.getString(12, 8);
               ((String[]) buf[15])[0] = rslt.getString(13, 20);
               ((byte[]) buf[16])[0] = rslt.getByte(14);
               ((String[]) buf[17])[0] = rslt.getString(15, 20);
               ((String[]) buf[18])[0] = rslt.getString(16, 1);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(17);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(18,2);
               ((String[]) buf[21])[0] = rslt.getString(19, 20);
               ((String[]) buf[22])[0] = rslt.getVarchar(20);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(21, 60);
               ((String[]) buf[25])[0] = rslt.getString(22, 255);
               ((String[]) buf[26])[0] = rslt.getString(23, 60);
               ((String[]) buf[27])[0] = rslt.getString(24, 1);
               ((byte[]) buf[28])[0] = rslt.getByte(25);
               ((byte[]) buf[29])[0] = rslt.getByte(26);
               ((byte[]) buf[30])[0] = rslt.getByte(27);
               ((String[]) buf[31])[0] = rslt.getString(28, 3);
               ((String[]) buf[32])[0] = rslt.getString(29, 20);
               ((int[]) buf[33])[0] = rslt.getInt(30);
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(31,4);
               ((int[]) buf[35])[0] = rslt.getInt(32);
               ((String[]) buf[36])[0] = rslt.getString(33, 25);
               ((byte[]) buf[37])[0] = rslt.getByte(34);
               ((String[]) buf[38])[0] = rslt.getString(35, 60);
               ((long[]) buf[39])[0] = rslt.getLong(36);
               ((String[]) buf[40])[0] = rslt.getString(37, 30);
               ((String[]) buf[41])[0] = rslt.getString(38, 30);
               ((String[]) buf[42])[0] = rslt.getString(39, 4);
               ((String[]) buf[43])[0] = rslt.getString(40, 20);
               ((String[]) buf[44])[0] = rslt.getString(41, 20);
               ((java.util.Date[]) buf[45])[0] = rslt.getGXDateTime(42);
               ((String[]) buf[46])[0] = rslt.getString(43, 3);
               ((int[]) buf[47])[0] = rslt.getInt(44);
               ((String[]) buf[48])[0] = rslt.getString(45, 3);
               ((short[]) buf[49])[0] = rslt.getShort(46);
               ((byte[]) buf[50])[0] = rslt.getByte(47);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(10);
               ((String[]) buf[13])[0] = rslt.getString(11, 8);
               ((String[]) buf[14])[0] = rslt.getString(12, 8);
               ((String[]) buf[15])[0] = rslt.getString(13, 20);
               ((byte[]) buf[16])[0] = rslt.getByte(14);
               ((String[]) buf[17])[0] = rslt.getString(15, 20);
               ((String[]) buf[18])[0] = rslt.getString(16, 1);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(17);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(18,2);
               ((String[]) buf[21])[0] = rslt.getString(19, 20);
               ((String[]) buf[22])[0] = rslt.getVarchar(20);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(21, 60);
               ((String[]) buf[25])[0] = rslt.getString(22, 255);
               ((String[]) buf[26])[0] = rslt.getString(23, 60);
               ((String[]) buf[27])[0] = rslt.getString(24, 1);
               ((byte[]) buf[28])[0] = rslt.getByte(25);
               ((byte[]) buf[29])[0] = rslt.getByte(26);
               ((byte[]) buf[30])[0] = rslt.getByte(27);
               ((String[]) buf[31])[0] = rslt.getString(28, 3);
               ((String[]) buf[32])[0] = rslt.getString(29, 20);
               ((int[]) buf[33])[0] = rslt.getInt(30);
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(31,4);
               ((int[]) buf[35])[0] = rslt.getInt(32);
               ((String[]) buf[36])[0] = rslt.getString(33, 25);
               ((byte[]) buf[37])[0] = rslt.getByte(34);
               ((String[]) buf[38])[0] = rslt.getString(35, 60);
               ((long[]) buf[39])[0] = rslt.getLong(36);
               ((String[]) buf[40])[0] = rslt.getString(37, 30);
               ((String[]) buf[41])[0] = rslt.getString(38, 30);
               ((String[]) buf[42])[0] = rslt.getString(39, 4);
               ((String[]) buf[43])[0] = rslt.getString(40, 20);
               ((String[]) buf[44])[0] = rslt.getString(41, 20);
               ((java.util.Date[]) buf[45])[0] = rslt.getGXDateTime(42);
               ((String[]) buf[46])[0] = rslt.getString(43, 3);
               ((int[]) buf[47])[0] = rslt.getInt(44);
               ((String[]) buf[48])[0] = rslt.getString(45, 3);
               ((short[]) buf[49])[0] = rslt.getShort(46);
               ((byte[]) buf[50])[0] = rslt.getByte(47);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 1);
               ((byte[]) buf[12])[0] = rslt.getByte(10);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(11);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(12);
               ((String[]) buf[15])[0] = rslt.getString(13, 8);
               ((String[]) buf[16])[0] = rslt.getString(14, 8);
               ((String[]) buf[17])[0] = rslt.getString(15, 30);
               ((String[]) buf[18])[0] = rslt.getString(16, 20);
               ((byte[]) buf[19])[0] = rslt.getByte(17);
               ((String[]) buf[20])[0] = rslt.getString(18, 20);
               ((String[]) buf[21])[0] = rslt.getString(19, 1);
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDateTime(20);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(21,2);
               ((String[]) buf[24])[0] = rslt.getString(22, 20);
               ((String[]) buf[25])[0] = rslt.getVarchar(23);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(24, 60);
               ((String[]) buf[28])[0] = rslt.getString(25, 255);
               ((String[]) buf[29])[0] = rslt.getString(26, 60);
               ((String[]) buf[30])[0] = rslt.getString(27, 1);
               ((byte[]) buf[31])[0] = rslt.getByte(28);
               ((byte[]) buf[32])[0] = rslt.getByte(29);
               ((byte[]) buf[33])[0] = rslt.getByte(30);
               ((String[]) buf[34])[0] = rslt.getString(31, 3);
               ((String[]) buf[35])[0] = rslt.getString(32, 20);
               ((int[]) buf[36])[0] = rslt.getInt(33);
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(34,4);
               ((int[]) buf[38])[0] = rslt.getInt(35);
               ((String[]) buf[39])[0] = rslt.getString(36, 25);
               ((byte[]) buf[40])[0] = rslt.getByte(37);
               ((String[]) buf[41])[0] = rslt.getString(38, 60);
               ((long[]) buf[42])[0] = rslt.getLong(39);
               ((String[]) buf[43])[0] = rslt.getString(40, 30);
               ((String[]) buf[44])[0] = rslt.getString(41, 30);
               ((String[]) buf[45])[0] = rslt.getString(42, 6);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(43, 1);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(44, 30);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(45, 4);
               ((String[]) buf[52])[0] = rslt.getString(46, 20);
               ((String[]) buf[53])[0] = rslt.getString(47, 20);
               ((java.util.Date[]) buf[54])[0] = rslt.getGXDateTime(48);
               ((String[]) buf[55])[0] = rslt.getString(49, 3);
               ((int[]) buf[56])[0] = rslt.getInt(50);
               ((String[]) buf[57])[0] = rslt.getString(51, 3);
               ((short[]) buf[58])[0] = rslt.getShort(52);
               ((byte[]) buf[59])[0] = rslt.getByte(53);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((byte[]) buf[61])[0] = rslt.getByte(54);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((byte[]) buf[63])[0] = rslt.getByte(55);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 10 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 22 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               return;
            case 7 :
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
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
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
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 17 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 1);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[6], 1);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[8]).byteValue());
               }
               stmt.setString(7, (String)parms[9], 1);
               stmt.setByte(8, ((Number) parms[10]).byteValue());
               stmt.setDate(9, (java.util.Date)parms[11]);
               stmt.setDate(10, (java.util.Date)parms[12]);
               stmt.setString(11, (String)parms[13], 8);
               stmt.setString(12, (String)parms[14], 8);
               stmt.setString(13, (String)parms[15], 20);
               stmt.setByte(14, ((Number) parms[16]).byteValue());
               stmt.setString(15, (String)parms[17], 20);
               stmt.setString(16, (String)parms[18], 1);
               stmt.setDateTime(17, (java.util.Date)parms[19], false);
               stmt.setBigDecimal(18, (java.math.BigDecimal)parms[20], 2);
               stmt.setString(19, (String)parms[21], 20);
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[23], 255);
               }
               stmt.setString(21, (String)parms[24], 60);
               stmt.setString(22, (String)parms[25], 255);
               stmt.setString(23, (String)parms[26], 60);
               stmt.setString(24, (String)parms[27], 1);
               stmt.setByte(25, ((Number) parms[28]).byteValue());
               stmt.setByte(26, ((Number) parms[29]).byteValue());
               stmt.setByte(27, ((Number) parms[30]).byteValue());
               stmt.setString(28, (String)parms[31], 3);
               stmt.setString(29, (String)parms[32], 20);
               stmt.setInt(30, ((Number) parms[33]).intValue());
               stmt.setBigDecimal(31, (java.math.BigDecimal)parms[34], 4);
               stmt.setInt(32, ((Number) parms[35]).intValue());
               stmt.setString(33, (String)parms[36], 25);
               stmt.setByte(34, ((Number) parms[37]).byteValue());
               stmt.setString(35, (String)parms[38], 60);
               stmt.setLong(36, ((Number) parms[39]).longValue());
               stmt.setString(37, (String)parms[40], 30);
               stmt.setString(38, (String)parms[41], 30);
               stmt.setString(39, (String)parms[42], 4);
               stmt.setString(40, (String)parms[43], 20);
               stmt.setString(41, (String)parms[44], 20);
               stmt.setDateTime(42, (java.util.Date)parms[45], false);
               stmt.setString(43, (String)parms[46], 3);
               stmt.setInt(44, ((Number) parms[47]).intValue());
               stmt.setString(45, (String)parms[48], 3);
               stmt.setShort(46, ((Number) parms[49]).shortValue());
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(47, ((Number) parms[51]).byteValue());
               }
               return;
            case 18 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               stmt.setString(3, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[7]).byteValue());
               }
               stmt.setString(6, (String)parms[8], 1);
               stmt.setByte(7, ((Number) parms[9]).byteValue());
               stmt.setDate(8, (java.util.Date)parms[10]);
               stmt.setDate(9, (java.util.Date)parms[11]);
               stmt.setString(10, (String)parms[12], 8);
               stmt.setString(11, (String)parms[13], 8);
               stmt.setString(12, (String)parms[14], 20);
               stmt.setByte(13, ((Number) parms[15]).byteValue());
               stmt.setString(14, (String)parms[16], 20);
               stmt.setString(15, (String)parms[17], 1);
               stmt.setDateTime(16, (java.util.Date)parms[18], false);
               stmt.setBigDecimal(17, (java.math.BigDecimal)parms[19], 2);
               stmt.setString(18, (String)parms[20], 20);
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[22], 255);
               }
               stmt.setString(20, (String)parms[23], 60);
               stmt.setString(21, (String)parms[24], 255);
               stmt.setString(22, (String)parms[25], 60);
               stmt.setString(23, (String)parms[26], 1);
               stmt.setByte(24, ((Number) parms[27]).byteValue());
               stmt.setByte(25, ((Number) parms[28]).byteValue());
               stmt.setByte(26, ((Number) parms[29]).byteValue());
               stmt.setString(27, (String)parms[30], 3);
               stmt.setString(28, (String)parms[31], 20);
               stmt.setInt(29, ((Number) parms[32]).intValue());
               stmt.setBigDecimal(30, (java.math.BigDecimal)parms[33], 4);
               stmt.setInt(31, ((Number) parms[34]).intValue());
               stmt.setString(32, (String)parms[35], 25);
               stmt.setByte(33, ((Number) parms[36]).byteValue());
               stmt.setString(34, (String)parms[37], 60);
               stmt.setLong(35, ((Number) parms[38]).longValue());
               stmt.setString(36, (String)parms[39], 30);
               stmt.setString(37, (String)parms[40], 30);
               stmt.setString(38, (String)parms[41], 4);
               stmt.setString(39, (String)parms[42], 20);
               stmt.setString(40, (String)parms[43], 20);
               stmt.setDateTime(41, (java.util.Date)parms[44], false);
               stmt.setString(42, (String)parms[45], 3);
               stmt.setInt(43, ((Number) parms[46]).intValue());
               stmt.setShort(44, ((Number) parms[47]).shortValue());
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(45, ((Number) parms[49]).byteValue());
               }
               stmt.setString(46, (String)parms[50], 3);
               stmt.setLong(47, ((Number) parms[51]).longValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 22 :
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
            case 23 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

