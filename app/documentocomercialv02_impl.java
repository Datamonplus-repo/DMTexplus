package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class documentocomercialv02_impl extends GXDataArea
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
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV32ContCod = httpContext.GetPar( "ContCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32ContCod", AV32ContCod);
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
         xc_39_1PR1( A396EmprCod, AV32ContCod, A14AlbComCod, A22AlbComPri) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action40") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A22AlbComPri = httpContext.GetPar( "AlbComPri") ;
         httpContext.ajax_rsp_assign_attri("", false, "A22AlbComPri", A22AlbComPri);
         AV33Fch = localUtil.parseDateParm( httpContext.GetPar( "Fch")) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Fch", localUtil.format(AV33Fch, "99/99/99"));
         AV34AlbLast = (int)(GXutil.lval( httpContext.GetPar( "AlbLast"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34AlbLast", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34AlbLast), 8, 0));
         A17AlbComFch = localUtil.parseDateParm( httpContext.GetPar( "AlbComFch")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A17AlbComFch", localUtil.format(A17AlbComFch, "99/99/99"));
         AV35Msg_f = httpContext.GetPar( "Msg_f") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35Msg_f", AV35Msg_f);
         AV11Ctrlf = (short)(GXutil.lval( httpContext.GetPar( "Ctrlf"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11Ctrlf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11Ctrlf), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_40_1PR1( A396EmprCod, A22AlbComPri, AV33Fch, AV34AlbLast, A17AlbComFch, AV35Msg_f, AV11Ctrlf) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action49") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_49_1PR1( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel19"+"_"+"ALBCOMHOR") == 0 )
      {
         A17AlbComFch = localUtil.parseDateParm( httpContext.GetPar( "AlbComFch")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A17AlbComFch", localUtil.format(A17AlbComFch, "99/99/99"));
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
         gx19asaalbcomhor1PR1( A17AlbComFch, Gx_mode, A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_71") == 0 )
      {
         A3111AlcDivCod = (byte)(GXutil.lval( httpContext.GetPar( "AlcDivCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3111AlcDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3111AlcDivCod), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_71( A3111AlcDivCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_69") == 0 )
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
         gxload_69( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_70") == 0 )
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
         gxload_70( A396EmprCod, A840TrnCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_72") == 0 )
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
         gxload_72( A396EmprCod, A252CliCod, A5142AlcDomEnv) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_73") == 0 )
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
         gxload_73( A396EmprCod, A14AlbComCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_75") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4717AlbComUni = (byte)(GXutil.lval( httpContext.GetPar( "AlbComUni"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_75( A396EmprCod, A4717AlbComUni) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_albcom") == 0 )
      {
         gxnrgridlevel_albcom_newrow_invoke( ) ;
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
            AV20EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20EmprCod", AV20EmprCod);
            AV23AlbComCod = (int)(GXutil.lval( httpContext.GetPar( "AlbComCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23AlbComCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBCOMCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV23AlbComCod), "ZZZZZZZ9")));
            AV31AlbComPri = httpContext.GetPar( "AlbComPri") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31AlbComPri", AV31AlbComPri);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBCOMPRI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV31AlbComPri, "9"))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Documento Comercial (v02)", ""), (short)(0)) ;
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

   public void gxnrgridlevel_albcom_newrow_invoke( )
   {
      nRC_GXsfl_113 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_113"))) ;
      nGXsfl_113_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_113_idx"))) ;
      sGXsfl_113_idx = httpContext.GetPar( "sGXsfl_113_idx") ;
      edtAlbComUni_Horizontalalignment = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComUni_Internalname, "Horizontalalignment", edtAlbComUni_Horizontalalignment, !bGXsfl_113_Refreshing);
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      A19AlbComLiC = (short)(GXutil.lval( httpContext.GetPar( "AlbComLiC"))) ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_albcom_newrow( ) ;
      /* End function gxnrGridlevel_albcom_newrow_invoke */
   }

   public documentocomercialv02_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public documentocomercialv02_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentocomercialv02_impl.class ));
   }

   public documentocomercialv02_impl( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbAlbComEAT = new HTMLChoice();
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbComCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbComCod_Internalname, httpContext.getMessage( "Nº Documento", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComCod_Internalname, GXutil.ltrim( localUtil.ntoc( A14AlbComCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14AlbComCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbComCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoComercialv02.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbComFch_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbComFch_Internalname, httpContext.getMessage( "Fecha", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtAlbComFch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComFch_Internalname, localUtil.format(A17AlbComFch, "99/99/99"), localUtil.format( A17AlbComFch, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComFch_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbComFch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoComercialv02.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbComFch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbComFch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_DocumentoComercialv02.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbComHor_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbComHor_Internalname, httpContext.getMessage( "Fecha Hora Salida", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtAlbComHor_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComHor_Internalname, localUtil.ttoc( A4829AlbComHor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A4829AlbComHor, "99/99/99 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComHor_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbComHor_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoComercialv02.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbComHor_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbComHor_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_DocumentoComercialv02.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedclicod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockclicod_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblockclicod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_DocumentoComercialv02.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_clicod.setProperty("Caption", Combo_clicod_Caption);
      ucCombo_clicod.setProperty("Cls", Combo_clicod_Cls);
      ucCombo_clicod.setProperty("EmptyItem", Combo_clicod_Emptyitem);
      ucCombo_clicod.setProperty("DropDownOptionsData", AV43CliCod_Data);
      ucCombo_clicod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clicod_Internalname, "COMBO_CLICODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,47);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "Attribute", "", "", "", "", edtCliCod_Visible, edtCliCod_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoComercialv02.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedalcdomenv_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalcdomenv_Internalname, httpContext.getMessage( "Envio", ""), "", "", lblTextblockalcdomenv_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_DocumentoComercialv02.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblTablemergedalcdomenv_Internalname, tblTablemergedalcdomenv_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td class='MergeDataCell'>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlcDomEnv_Internalname, httpContext.getMessage( "Domicilio de Envio", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlcDomEnv_Internalname, GXutil.ltrim( localUtil.ntoc( A5142AlcDomEnv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlcDomEnv_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5142AlcDomEnv), "9") : localUtil.format( DecimalUtil.doubleToDec(A5142AlcDomEnv), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,58);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlcDomEnv_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlcDomEnv_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoComercialv02.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblTablesearcrroot_Internalname, tblTablesearcrroot_Internalname, "", "Prompt", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblPromptclienv_Internalname, httpContext.getMessage( "<i class=\"fas fa-search\"></i>", ""), "", "", lblPromptclienv_Jsonclick, "'"+""+"'"+",false,"+"'"+"e111pr2_client"+"'", "", "TextBlock", 7, httpContext.getMessage( "Clicar aca para selecionar una direccion", ""), 1, 1, 0, (short)(1), "HLP_DocumentoComercialv02.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedtrncod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocktrncod_Internalname, httpContext.getMessage( "Transportista", ""), "", "", lblTextblocktrncod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_DocumentoComercialv02.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_trncod.setProperty("Caption", Combo_trncod_Caption);
      ucCombo_trncod.setProperty("Cls", Combo_trncod_Cls);
      ucCombo_trncod.setProperty("EmptyItemText", Combo_trncod_Emptyitemtext);
      ucCombo_trncod.setProperty("DropDownOptionsData", AV40TrnCod_Data);
      ucCombo_trncod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_trncod_Internalname, "COMBO_TRNCODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTrnCod_Internalname, httpContext.getMessage( "Codigo Transportista", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnCod_Internalname, GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtTrnCod_Jsonclick, 0, "Attribute", "", "", "", "", edtTrnCod_Visible, edtTrnCod_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoComercialv02.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbComMat_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbComMat_Internalname, httpContext.getMessage( "Matricula", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComMat_Internalname, GXutil.rtrim( A4830AlbComMat), GXutil.rtrim( localUtil.format( A4830AlbComMat, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComMat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbComMat_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoComercialv02.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbComFs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbComFs_Internalname, httpContext.getMessage( "Fecha Sistema", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtAlbComFs_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComFs_Internalname, localUtil.ttoc( A10013AlbComFs, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A10013AlbComFs, "99/99/99 99:99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComFs_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbComFs_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoComercialv02.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbComFs_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbComFs_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_DocumentoComercialv02.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbComATCU_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbComATCU_Internalname, httpContext.getMessage( "ATCUD", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComATCU_Internalname, GXutil.rtrim( A14248AlbComATCU), GXutil.rtrim( localUtil.format( A14248AlbComATCU, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComATCU_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbComATCU_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoComercialv02.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbComEAT.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbAlbComEAT.getInternalname(), httpContext.getMessage( "Envio AT", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbComEAT, cmbAlbComEAT.getInternalname(), GXutil.trim( GXutil.str( A10739AlbComEAT, 1, 0)), 1, cmbAlbComEAT.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbAlbComEAT.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_DocumentoComercialv02.htm");
      cmbAlbComEAT.setValue( GXutil.trim( GXutil.str( A10739AlbComEAT, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbComEAT.getInternalname(), "Values", cmbAlbComEAT.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbComID_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbComID_Internalname, httpContext.getMessage( "Codigo AT", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComID_Internalname, GXutil.rtrim( A10740AlbComID), GXutil.rtrim( localUtil.format( A10740AlbComID, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComID_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbComID_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoComercialv02.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbComAT_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbComAT_Internalname, httpContext.getMessage( "M/A", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComAT_Internalname, GXutil.rtrim( A10764AlbComAT), GXutil.rtrim( localUtil.format( A10764AlbComAT, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComAT_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbComAT_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoComercialv02.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_albcom_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_albcom( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoComercialv02.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 133,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoComercialv02.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 135,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoComercialv02.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV55Pgmname), GXutil.rtrim( localUtil.format( AV55Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoComercialv02.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavComboclicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV44ComboCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavComboclicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV44ComboCliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV44ComboCliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavComboclicod_Jsonclick, 0, "Attribute", "", "", "", "", edtavComboclicod_Visible, edtavComboclicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoComercialv02.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_trncod_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombotrncod_Internalname, GXutil.ltrim( localUtil.ntoc( AV42ComboTrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCombotrncod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV42ComboTrnCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV42ComboTrnCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtavCombotrncod_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombotrncod_Visible, edtavCombotrncod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoComercialv02.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* User Defined Control */
      ucCombo_albcomuni.setProperty("Caption", Combo_albcomuni_Caption);
      ucCombo_albcomuni.setProperty("Cls", Combo_albcomuni_Cls);
      ucCombo_albcomuni.setProperty("IsGridItem", Combo_albcomuni_Isgriditem);
      ucCombo_albcomuni.setProperty("EmptyItem", Combo_albcomuni_Emptyitem);
      ucCombo_albcomuni.setProperty("DropDownOptionsData", AV52AlbComUni_Data);
      ucCombo_albcomuni.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_albcomuni_Internalname, "COMBO_ALBCOMUNIContainer");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnNom_Internalname, GXutil.rtrim( A841TrnNom), GXutil.rtrim( localUtil.format( A841TrnNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTrnNom_Jsonclick, 0, "Attribute", "", "", "", "", edtTrnNom_Visible, edtTrnNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoComercialv02.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "Attribute", "", "", "", "", edtCliNom_Visible, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoComercialv02.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 153,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComPri_Internalname, GXutil.rtrim( A22AlbComPri), GXutil.rtrim( localUtil.format( A22AlbComPri, "9")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,153);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComPri_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbComPri_Visible, edtAlbComPri_Enabled, 1, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoComercialv02.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_albcom( )
   {
      /*  Grid Control  */
      startgridcontrol113( ) ;
      nGXsfl_113_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount2 = (short)(2) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_2 = (short)(1) ;
            scanStart1PR2( ) ;
            while ( RcdFound2 != 0 )
            {
               init_level_properties2( ) ;
               getByPrimaryKey1PR2( ) ;
               addRow1PR2( ) ;
               scanNext1PR2( ) ;
            }
            scanEnd1PR2( ) ;
            nBlankRcdCount2 = (short)(2) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B19AlbComLiC = A19AlbComLiC ;
         httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
         B18AlbComImp = A18AlbComImp ;
         n18AlbComImp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
         B252CliCod = A252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         B22AlbComPri = A22AlbComPri ;
         httpContext.ajax_rsp_assign_attri("", false, "A22AlbComPri", A22AlbComPri);
         standaloneNotModal1PR2( ) ;
         standaloneModal1PR2( ) ;
         sMode2 = Gx_mode ;
         while ( nGXsfl_113_idx < nRC_GXsfl_113 )
         {
            bGXsfl_113_Refreshing = true ;
            readRow1PR2( ) ;
            edtAlbComLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMLIN_"+sGXsfl_113_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbComLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComLin_Enabled), 5, 0), !bGXsfl_113_Refreshing);
            edtAlbComDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMDSC_"+sGXsfl_113_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbComDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComDsc_Enabled), 5, 0), !bGXsfl_113_Refreshing);
            edtAlbComDc2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMDC2_"+sGXsfl_113_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbComDc2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComDc2_Enabled), 5, 0), !bGXsfl_113_Refreshing);
            edtAlbComUni_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMUNI_"+sGXsfl_113_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbComUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComUni_Enabled), 5, 0), !bGXsfl_113_Refreshing);
            edtAlbComUni_Horizontalalignment = httpContext.cgiGet( "ALBCOMUNI_"+sGXsfl_113_idx+"Horizontalalignment") ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbComUni_Internalname, "Horizontalalignment", edtAlbComUni_Horizontalalignment, !bGXsfl_113_Refreshing);
            edtAlbUcoDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBUCODSC_"+sGXsfl_113_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbUcoDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbUcoDsc_Enabled), 5, 0), !bGXsfl_113_Refreshing);
            edtAlbComCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMCNT_"+sGXsfl_113_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbComCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComCnt_Enabled), 5, 0), !bGXsfl_113_Refreshing);
            edtAlbComPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMPRE_"+sGXsfl_113_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbComPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComPre_Enabled), 5, 0), !bGXsfl_113_Refreshing);
            edtAlbCImpLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCIMPLIN_"+sGXsfl_113_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbCImpLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCImpLin_Enabled), 5, 0), !bGXsfl_113_Refreshing);
            edtAlbCImpL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCIMPL_"+sGXsfl_113_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbCImpL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCImpL_Enabled), 5, 0), !bGXsfl_113_Refreshing);
            edtAlbComHd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMHD_"+sGXsfl_113_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbComHd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComHd_Enabled), 5, 0), !bGXsfl_113_Refreshing);
            edtALbComR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMR_"+sGXsfl_113_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtALbComR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtALbComR_Enabled), 5, 0), !bGXsfl_113_Refreshing);
            edtAlbComP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMP_"+sGXsfl_113_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbComP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComP_Enabled), 5, 0), !bGXsfl_113_Refreshing);
            edtAlbComProd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMPROD_"+sGXsfl_113_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbComProd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComProd_Enabled), 5, 0), !bGXsfl_113_Refreshing);
            if ( ( nRcdExists_2 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1PR2( ) ;
            }
            sendRow1PR2( ) ;
            bGXsfl_113_Refreshing = false ;
         }
         Gx_mode = sMode2 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A19AlbComLiC = B19AlbComLiC ;
         httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
         A18AlbComImp = B18AlbComImp ;
         n18AlbComImp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
         A252CliCod = B252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A22AlbComPri = B22AlbComPri ;
         httpContext.ajax_rsp_assign_attri("", false, "A22AlbComPri", A22AlbComPri);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount2 = (short)(2) ;
         nRcdExists_2 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1PR2( ) ;
            while ( RcdFound2 != 0 )
            {
               sGXsfl_113_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_113_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_1132( ) ;
               init_level_properties2( ) ;
               standaloneNotModal1PR2( ) ;
               getByPrimaryKey1PR2( ) ;
               standaloneModal1PR2( ) ;
               addRow1PR2( ) ;
               scanNext1PR2( ) ;
            }
            scanEnd1PR2( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode2 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_113_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_113_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_1132( ) ;
         initAll1PR2( ) ;
         init_level_properties2( ) ;
         B19AlbComLiC = A19AlbComLiC ;
         httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
         B18AlbComImp = A18AlbComImp ;
         n18AlbComImp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
         B252CliCod = A252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         B22AlbComPri = A22AlbComPri ;
         httpContext.ajax_rsp_assign_attri("", false, "A22AlbComPri", A22AlbComPri);
         nRcdExists_2 = (short)(0) ;
         nIsMod_2 = (short)(0) ;
         nRcdDeleted_2 = (short)(0) ;
         nBlankRcdCount2 = (short)(nBlankRcdUsr2+nBlankRcdCount2) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount2 > 0 )
         {
            standaloneNotModal1PR2( ) ;
            standaloneModal1PR2( ) ;
            addRow1PR2( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtAlbComLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount2 = (short)(nBlankRcdCount2-1) ;
         }
         Gx_mode = sMode2 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A19AlbComLiC = B19AlbComLiC ;
         httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
         A18AlbComImp = B18AlbComImp ;
         n18AlbComImp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
         A252CliCod = B252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A22AlbComPri = B22AlbComPri ;
         httpContext.ajax_rsp_assign_attri("", false, "A22AlbComPri", A22AlbComPri);
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_albcomContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_albcom", Gridlevel_albcomContainer, subGridlevel_albcom_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_albcomContainerData", Gridlevel_albcomContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_albcomContainerData"+"V", Gridlevel_albcomContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_albcomContainerData"+"V"+"\" value='"+Gridlevel_albcomContainer.GridValuesHidden()+"'/>") ;
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
      e121PR2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICOD_DATA"), AV43CliCod_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vTRNCOD_DATA"), AV40TrnCod_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vALBCOMUNI_DATA"), AV52AlbComUni_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z14AlbComCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z14AlbComCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4829AlbComHor = localUtil.ctot( httpContext.cgiGet( "Z4829AlbComHor"), 0) ;
            Z17AlbComFch = localUtil.ctod( httpContext.cgiGet( "Z17AlbComFch"), 0) ;
            Z22AlbComPri = httpContext.cgiGet( "Z22AlbComPri") ;
            Z16AlbComEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z16AlbComEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z19AlbComLiC = (short)(localUtil.ctol( httpContext.cgiGet( "Z19AlbComLiC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1783AlbComEso = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1783AlbComEso"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3095AlcDivTCod = httpContext.cgiGet( "Z3095AlcDivTCod") ;
            Z4830AlbComMat = httpContext.cgiGet( "Z4830AlbComMat") ;
            Z5142AlcDomEnv = (byte)(localUtil.ctol( httpContext.cgiGet( "Z5142AlcDomEnv"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            A16AlbComEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z16AlbComEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            O19AlbComLiC = (short)(localUtil.ctol( httpContext.cgiGet( "O19AlbComLiC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O18AlbComImp = localUtil.ctond( httpContext.cgiGet( "O18AlbComImp")) ;
            O252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "O252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O22AlbComPri = httpContext.cgiGet( "O22AlbComPri") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_113 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_113"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "N252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N3111AlcDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( "N3111AlcDivCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "N840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV20EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV23AlbComCod = (int)(localUtil.ctol( httpContext.cgiGet( "vALBCOMCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV27Insert_CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "vINSERT_CLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV28Insert_AlcDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( "vINSERT_ALCDIVCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3111AlcDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( "ALCDIVCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV29Insert_TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_TRNCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV31AlbComPri = httpContext.cgiGet( "vALBCOMPRI") ;
            AV32ContCod = httpContext.cgiGet( "vCONTCOD") ;
            AV36oldAlbComPri = httpContext.cgiGet( "vOLDALBCOMPRI") ;
            AV37guiremcli = (int)(localUtil.ctol( httpContext.cgiGet( "vGUIREMCLI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A10738AlbComSt = httpContext.cgiGet( "ALBCOMST") ;
            A3095AlcDivTCod = httpContext.cgiGet( "ALCDIVTCOD") ;
            AV35Msg_f = httpContext.cgiGet( "vMSG_F") ;
            AV34AlbLast = (int)(localUtil.ctol( httpContext.cgiGet( "vALBLAST"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33Fch = localUtil.ctod( httpContext.cgiGet( "vFCH"), 0) ;
            AV7FirmaD = (short)(localUtil.ctol( httpContext.cgiGet( "vFIRMAD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV17cernum = (short)(localUtil.ctol( httpContext.cgiGet( "vCERNUM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV18Msg_errAT = httpContext.cgiGet( "vMSG_ERRAT") ;
            A16AlbComEst = (byte)(localUtil.ctol( httpContext.cgiGet( "ALBCOMEST"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A13739findDomEnv = (byte)(localUtil.ctol( httpContext.cgiGet( "FINDDOMENV"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n13739findDomEnv = false ;
            AV16CambioP = (short)(localUtil.ctol( httpContext.cgiGet( "vCAMBIOP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV54Pgmdesc = httpContext.cgiGet( "vPGMDESC") ;
            A14249AlbComSerA = httpContext.cgiGet( "ALBCOMSERA") ;
            A14250AlbComTipA = httpContext.cgiGet( "ALBCOMTIPA") ;
            A19AlbComLiC = (short)(localUtil.ctol( httpContext.cgiGet( "ALBCOMLIC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1783AlbComEso = (byte)(localUtil.ctol( httpContext.cgiGet( "ALBCOMESO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A10014AlbComFd = httpContext.cgiGet( "ALBCOMFD") ;
            A10015AlbComFdD = httpContext.cgiGet( "ALBCOMFDD") ;
            A3094AlbCSec = httpContext.cgiGet( "ALBCSEC") ;
            A5143AlcIvaCod = httpContext.cgiGet( "ALCIVACOD") ;
            A11719AlbCTrNm = httpContext.cgiGet( "ALBCTRNM") ;
            A11720AlbCTrDm = httpContext.cgiGet( "ALBCTRDM") ;
            A11721AlbCTrNc = httpContext.cgiGet( "ALBCTRNC") ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A3091CliDivTra = httpContext.cgiGet( "CLIDIVTRA") ;
            n3091CliDivTra = false ;
            A3140CliDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( "CLIDIVCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3140CliDivCod = false ;
            A3112AlcDivAbr = httpContext.cgiGet( "ALCDIVABR") ;
            n3112AlcDivAbr = false ;
            A18AlbComImp = localUtil.ctond( httpContext.cgiGet( "ALBCOMIMP")) ;
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
            Dvpanel_unnamedtable1_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Datamonjs_Objectcall = httpContext.cgiGet( "DATAMONJS_Objectcall") ;
            Datamonjs_Class = httpContext.cgiGet( "DATAMONJS_Class") ;
            Datamonjs_Enabled = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Enabled")) ;
            Datamonjs_Paramstr = httpContext.cgiGet( "DATAMONJS_Paramstr") ;
            Datamonjs_Visible = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Visible")) ;
            Datamonjs_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DATAMONJS_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_albcomuni_Objectcall = httpContext.cgiGet( "COMBO_ALBCOMUNI_Objectcall") ;
            Combo_albcomuni_Class = httpContext.cgiGet( "COMBO_ALBCOMUNI_Class") ;
            Combo_albcomuni_Icontype = httpContext.cgiGet( "COMBO_ALBCOMUNI_Icontype") ;
            Combo_albcomuni_Icon = httpContext.cgiGet( "COMBO_ALBCOMUNI_Icon") ;
            Combo_albcomuni_Caption = httpContext.cgiGet( "COMBO_ALBCOMUNI_Caption") ;
            Combo_albcomuni_Tooltip = httpContext.cgiGet( "COMBO_ALBCOMUNI_Tooltip") ;
            Combo_albcomuni_Cls = httpContext.cgiGet( "COMBO_ALBCOMUNI_Cls") ;
            Combo_albcomuni_Selectedvalue_set = httpContext.cgiGet( "COMBO_ALBCOMUNI_Selectedvalue_set") ;
            Combo_albcomuni_Selectedvalue_get = httpContext.cgiGet( "COMBO_ALBCOMUNI_Selectedvalue_get") ;
            Combo_albcomuni_Selectedtext_set = httpContext.cgiGet( "COMBO_ALBCOMUNI_Selectedtext_set") ;
            Combo_albcomuni_Selectedtext_get = httpContext.cgiGet( "COMBO_ALBCOMUNI_Selectedtext_get") ;
            Combo_albcomuni_Gamoauthtoken = httpContext.cgiGet( "COMBO_ALBCOMUNI_Gamoauthtoken") ;
            Combo_albcomuni_Ddointernalname = httpContext.cgiGet( "COMBO_ALBCOMUNI_Ddointernalname") ;
            Combo_albcomuni_Titlecontrolalign = httpContext.cgiGet( "COMBO_ALBCOMUNI_Titlecontrolalign") ;
            Combo_albcomuni_Dropdownoptionstype = httpContext.cgiGet( "COMBO_ALBCOMUNI_Dropdownoptionstype") ;
            Combo_albcomuni_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBCOMUNI_Enabled")) ;
            Combo_albcomuni_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBCOMUNI_Visible")) ;
            Combo_albcomuni_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_ALBCOMUNI_Titlecontrolidtoreplace") ;
            Combo_albcomuni_Datalisttype = httpContext.cgiGet( "COMBO_ALBCOMUNI_Datalisttype") ;
            Combo_albcomuni_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBCOMUNI_Allowmultipleselection")) ;
            Combo_albcomuni_Datalistfixedvalues = httpContext.cgiGet( "COMBO_ALBCOMUNI_Datalistfixedvalues") ;
            Combo_albcomuni_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBCOMUNI_Isgriditem")) ;
            Combo_albcomuni_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBCOMUNI_Hasdescription")) ;
            Combo_albcomuni_Datalistproc = httpContext.cgiGet( "COMBO_ALBCOMUNI_Datalistproc") ;
            Combo_albcomuni_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_ALBCOMUNI_Datalistprocparametersprefix") ;
            Combo_albcomuni_Remoteservicesparameters = httpContext.cgiGet( "COMBO_ALBCOMUNI_Remoteservicesparameters") ;
            Combo_albcomuni_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_ALBCOMUNI_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_albcomuni_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBCOMUNI_Includeonlyselectedoption")) ;
            Combo_albcomuni_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBCOMUNI_Includeselectalloption")) ;
            Combo_albcomuni_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBCOMUNI_Emptyitem")) ;
            Combo_albcomuni_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBCOMUNI_Includeaddnewoption")) ;
            Combo_albcomuni_Htmltemplate = httpContext.cgiGet( "COMBO_ALBCOMUNI_Htmltemplate") ;
            Combo_albcomuni_Multiplevaluestype = httpContext.cgiGet( "COMBO_ALBCOMUNI_Multiplevaluestype") ;
            Combo_albcomuni_Loadingdata = httpContext.cgiGet( "COMBO_ALBCOMUNI_Loadingdata") ;
            Combo_albcomuni_Noresultsfound = httpContext.cgiGet( "COMBO_ALBCOMUNI_Noresultsfound") ;
            Combo_albcomuni_Emptyitemtext = httpContext.cgiGet( "COMBO_ALBCOMUNI_Emptyitemtext") ;
            Combo_albcomuni_Onlyselectedvalues = httpContext.cgiGet( "COMBO_ALBCOMUNI_Onlyselectedvalues") ;
            Combo_albcomuni_Selectalltext = httpContext.cgiGet( "COMBO_ALBCOMUNI_Selectalltext") ;
            Combo_albcomuni_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_ALBCOMUNI_Multiplevaluesseparator") ;
            Combo_albcomuni_Addnewoptiontext = httpContext.cgiGet( "COMBO_ALBCOMUNI_Addnewoptiontext") ;
            Combo_albcomuni_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_ALBCOMUNI_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            if ( localUtil.vcdtime( httpContext.cgiGet( edtAlbComHor_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "ALBCOMHOR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbComHor_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4829AlbComHor = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri("", false, "A4829AlbComHor", localUtil.ttoc( A4829AlbComHor, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A4829AlbComHor = localUtil.ctot( httpContext.cgiGet( edtAlbComHor_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4829AlbComHor", localUtil.ttoc( A4829AlbComHor, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
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
            A10013AlbComFs = localUtil.ctot( httpContext.cgiGet( edtAlbComFs_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10013AlbComFs", localUtil.ttoc( A10013AlbComFs, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            A14248AlbComATCU = httpContext.cgiGet( edtAlbComATCU_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14248AlbComATCU", A14248AlbComATCU);
            cmbAlbComEAT.setName( cmbAlbComEAT.getInternalname() );
            cmbAlbComEAT.setValue( httpContext.cgiGet( cmbAlbComEAT.getInternalname()) );
            A10739AlbComEAT = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbComEAT.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10739AlbComEAT", GXutil.str( A10739AlbComEAT, 1, 0));
            A10740AlbComID = httpContext.cgiGet( edtAlbComID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10740AlbComID", A10740AlbComID);
            A10764AlbComAT = httpContext.cgiGet( edtAlbComAT_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10764AlbComAT", A10764AlbComAT);
            AV55Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55Pgmname", AV55Pgmname);
            AV44ComboCliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavComboclicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44ComboCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44ComboCliCod), 6, 0));
            AV42ComboTrnCod = (short)(localUtil.ctol( httpContext.cgiGet( edtavCombotrncod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42ComboTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42ComboTrnCod), 4, 0));
            A841TrnNom = httpContext.cgiGet( edtTrnNom_Internalname) ;
            n841TrnNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A22AlbComPri = httpContext.cgiGet( edtAlbComPri_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A22AlbComPri", A22AlbComPri);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"DocumentoComercialv02");
            A10013AlbComFs = localUtil.ctot( httpContext.cgiGet( edtAlbComFs_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10013AlbComFs", localUtil.ttoc( A10013AlbComFs, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            forbiddenHiddens.add("AlbComFs", localUtil.format( A10013AlbComFs, "99/99/99 99:99:99"));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            AV55Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55Pgmname", AV55Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV55Pgmname, "")));
            forbiddenHiddens.add("AlbComEst", localUtil.format( DecimalUtil.doubleToDec(A16AlbComEst), "9"));
            forbiddenHiddens.add("AlbComEso", localUtil.format( DecimalUtil.doubleToDec(A1783AlbComEso), "9"));
            forbiddenHiddens.add("AlcDivTCod", GXutil.rtrim( localUtil.format( A3095AlcDivTCod, "")));
            forbiddenHiddens.add("AlbComFd", GXutil.rtrim( localUtil.format( A10014AlbComFd, "")));
            forbiddenHiddens.add("AlbComFdD", GXutil.rtrim( localUtil.format( A10015AlbComFdD, "")));
            forbiddenHiddens.add("AlbCSec", GXutil.rtrim( localUtil.format( A3094AlbCSec, "")));
            forbiddenHiddens.add("AlbComSt", GXutil.rtrim( localUtil.format( A10738AlbComSt, "")));
            A10739AlbComEAT = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbComEAT.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10739AlbComEAT", GXutil.str( A10739AlbComEAT, 1, 0));
            forbiddenHiddens.add("AlbComEAT", localUtil.format( DecimalUtil.doubleToDec(A10739AlbComEAT), "9"));
            A10740AlbComID = httpContext.cgiGet( edtAlbComID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10740AlbComID", A10740AlbComID);
            forbiddenHiddens.add("AlbComID", GXutil.rtrim( localUtil.format( A10740AlbComID, "")));
            A10764AlbComAT = httpContext.cgiGet( edtAlbComAT_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10764AlbComAT", A10764AlbComAT);
            forbiddenHiddens.add("AlbComAT", GXutil.rtrim( localUtil.format( A10764AlbComAT, "")));
            forbiddenHiddens.add("AlcIvaCod", GXutil.rtrim( localUtil.format( A5143AlcIvaCod, "@!")));
            forbiddenHiddens.add("AlbCTrNm", GXutil.rtrim( localUtil.format( A11719AlbCTrNm, "")));
            forbiddenHiddens.add("AlbCTrDm", GXutil.rtrim( localUtil.format( A11720AlbCTrDm, "")));
            forbiddenHiddens.add("AlbCTrNc", GXutil.rtrim( localUtil.format( A11721AlbCTrNc, "")));
            A14248AlbComATCU = httpContext.cgiGet( edtAlbComATCU_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14248AlbComATCU", A14248AlbComATCU);
            forbiddenHiddens.add("AlbComATCU", GXutil.rtrim( localUtil.format( A14248AlbComATCU, "")));
            forbiddenHiddens.add("AlbComSerA", GXutil.rtrim( localUtil.format( A14249AlbComSerA, "")));
            forbiddenHiddens.add("AlbComTipA", GXutil.rtrim( localUtil.format( A14250AlbComTipA, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A14AlbComCod != Z14AlbComCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("documentocomercialv02:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
                        confirm_1PR0( ) ;
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
                     if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "AFTER TRN") == 0 ) )
                     {
                        nGXsfl_113_idx = (int)(GXutil.lval( sEvtType)) ;
                        sGXsfl_113_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_113_idx), 4, 0), (short)(4), "0") ;
                        subsflControlProps_1132( ) ;
                        if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbComLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbComLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                        {
                           GXCCtl = "ALBCOMLIN_" + sGXsfl_113_idx ;
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
                           AnyError = (short)(1) ;
                           GX_FocusControl = edtAlbComLin_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           wbErr = true ;
                           A20AlbComLin = (short)(0) ;
                        }
                        else
                        {
                           A20AlbComLin = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbComLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        }
                        A15AlbComDsc = httpContext.cgiGet( edtAlbComDsc_Internalname) ;
                        A10806AlbComDc2 = httpContext.cgiGet( edtAlbComDc2_Internalname) ;
                        if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbComUni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbComUni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
                        {
                           GXCCtl = "ALBCOMUNI_" + sGXsfl_113_idx ;
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
                           AnyError = (short)(1) ;
                           GX_FocusControl = edtAlbComUni_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           wbErr = true ;
                           A4717AlbComUni = (byte)(0) ;
                        }
                        else
                        {
                           A4717AlbComUni = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbComUni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        }
                        A5144AlbUcoDsc = httpContext.cgiGet( edtAlbUcoDsc_Internalname) ;
                        n5144AlbUcoDsc = false ;
                        if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbComCnt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbComCnt_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
                        {
                           GXCCtl = "ALBCOMCNT_" + sGXsfl_113_idx ;
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
                           AnyError = (short)(1) ;
                           GX_FocusControl = edtAlbComCnt_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           wbErr = true ;
                           A13AlbComCnt = DecimalUtil.ZERO ;
                        }
                        else
                        {
                           A13AlbComCnt = localUtil.ctond( httpContext.cgiGet( edtAlbComCnt_Internalname)) ;
                        }
                        if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbComPre_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbComPre_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
                        {
                           GXCCtl = "ALBCOMPRE_" + sGXsfl_113_idx ;
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
                           AnyError = (short)(1) ;
                           GX_FocusControl = edtAlbComPre_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           wbErr = true ;
                           A21AlbComPre = DecimalUtil.ZERO ;
                        }
                        else
                        {
                           A21AlbComPre = localUtil.ctond( httpContext.cgiGet( edtAlbComPre_Internalname)) ;
                        }
                        A12AlbCImpLin = localUtil.ctond( httpContext.cgiGet( edtAlbCImpLin_Internalname)) ;
                        A3914AlbCImpL = localUtil.ctond( httpContext.cgiGet( edtAlbCImpL_Internalname)) ;
                        A10355AlbComHd = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbComHd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        A10356ALbComR = (byte)(localUtil.ctol( httpContext.cgiGet( edtALbComR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        A10357AlbComP = httpContext.cgiGet( edtAlbComP_Internalname) ;
                        A5010AlbComProd = httpContext.cgiGet( edtAlbComProd_Internalname) ;
                        GXCCtl = "Z20AlbComLin_" + sGXsfl_113_idx ;
                        Z20AlbComLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        GXCCtl = "Z10355AlbComHd_" + sGXsfl_113_idx ;
                        Z10355AlbComHd = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        GXCCtl = "Z10356ALbComR_" + sGXsfl_113_idx ;
                        Z10356ALbComR = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        GXCCtl = "Z10357AlbComP_" + sGXsfl_113_idx ;
                        Z10357AlbComP = httpContext.cgiGet( GXCCtl) ;
                        GXCCtl = "Z15AlbComDsc_" + sGXsfl_113_idx ;
                        Z15AlbComDsc = httpContext.cgiGet( GXCCtl) ;
                        GXCCtl = "Z10806AlbComDc2_" + sGXsfl_113_idx ;
                        Z10806AlbComDc2 = httpContext.cgiGet( GXCCtl) ;
                        GXCCtl = "Z13AlbComCnt_" + sGXsfl_113_idx ;
                        Z13AlbComCnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
                        GXCCtl = "Z21AlbComPre_" + sGXsfl_113_idx ;
                        Z21AlbComPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
                        GXCCtl = "Z5010AlbComProd_" + sGXsfl_113_idx ;
                        Z5010AlbComProd = httpContext.cgiGet( GXCCtl) ;
                        GXCCtl = "Z4717AlbComUni_" + sGXsfl_113_idx ;
                        Z4717AlbComUni = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        GXCCtl = "O12AlbCImpLin_" + sGXsfl_113_idx ;
                        O12AlbCImpLin = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
                        GXCCtl = "nRcdDeleted_2_" + sGXsfl_113_idx ;
                        nRcdDeleted_2 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        GXCCtl = "nRcdExists_2_" + sGXsfl_113_idx ;
                        nRcdExists_2 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        GXCCtl = "nIsMod_2_" + sGXsfl_113_idx ;
                        nIsMod_2 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        GXCCtl = "vCLICOD_" + sGXsfl_113_idx ;
                        AV39CliCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        GXCCtl = "vEMPRCOD_" + sGXsfl_113_idx ;
                        AV20EmprCod = httpContext.cgiGet( GXCCtl) ;
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "START") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: Start */
                              e121PR2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: After Trn */
                              e131PR2 ();
                           }
                        }
                        else
                        {
                        }
                     }
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
         e131PR2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1PR1( ) ;
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
         disableAttributes1PR1( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavComboclicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboclicod_Enabled), 5, 0), true);
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

   public void confirm_1PR0( )
   {
      beforeValidate1PR1( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1PR1( ) ;
         }
         else
         {
            checkExtendedTable1PR1( ) ;
            closeExtendedTableCursors1PR1( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1 = Gx_mode ;
         confirm_1PR2( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1PR2( )
   {
      s19AlbComLiC = O19AlbComLiC ;
      httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
      s18AlbComImp = O18AlbComImp ;
      n18AlbComImp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
      nGXsfl_113_idx = 0 ;
      while ( nGXsfl_113_idx < nRC_GXsfl_113 )
      {
         readRow1PR2( ) ;
         if ( ( nRcdExists_2 != 0 ) || ( nIsMod_2 != 0 ) )
         {
            getKey1PR2( ) ;
            if ( ( nRcdExists_2 == 0 ) && ( nRcdDeleted_2 == 0 ) )
            {
               if ( RcdFound2 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1PR2( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1PR2( ) ;
                     closeExtendedTableCursors1PR2( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O19AlbComLiC = A19AlbComLiC ;
                     httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
                     O18AlbComImp = A18AlbComImp ;
                     n18AlbComImp = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
                  }
               }
               else
               {
                  GXCCtl = "ALBCOMLIN_" + sGXsfl_113_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAlbComLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound2 != 0 )
               {
                  if ( nRcdDeleted_2 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1PR2( ) ;
                     load1PR2( ) ;
                     beforeValidate1PR2( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1PR2( ) ;
                        O19AlbComLiC = A19AlbComLiC ;
                        httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
                        O18AlbComImp = A18AlbComImp ;
                        n18AlbComImp = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
                     }
                  }
                  else
                  {
                     if ( nIsMod_2 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1PR2( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1PR2( ) ;
                           closeExtendedTableCursors1PR2( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O19AlbComLiC = A19AlbComLiC ;
                           httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
                           O18AlbComImp = A18AlbComImp ;
                           n18AlbComImp = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_2 == 0 )
                  {
                     GXCCtl = "ALBCOMLIN_" + sGXsfl_113_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbComLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtAlbComLin_Internalname, GXutil.ltrim( localUtil.ntoc( A20AlbComLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbComDsc_Internalname, GXutil.rtrim( A15AlbComDsc)) ;
         httpContext.changePostValue( edtAlbComDc2_Internalname, GXutil.rtrim( A10806AlbComDc2)) ;
         httpContext.changePostValue( edtAlbComUni_Internalname, GXutil.ltrim( localUtil.ntoc( A4717AlbComUni, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbUcoDsc_Internalname, GXutil.rtrim( A5144AlbUcoDsc)) ;
         httpContext.changePostValue( edtAlbComCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A13AlbComCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbComPre_Internalname, GXutil.ltrim( localUtil.ntoc( A21AlbComPre, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbCImpLin_Internalname, GXutil.ltrim( localUtil.ntoc( A12AlbCImpLin, (byte)(14), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbCImpL_Internalname, GXutil.ltrim( localUtil.ntoc( A3914AlbCImpL, (byte)(16), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbComHd_Internalname, GXutil.ltrim( localUtil.ntoc( A10355AlbComHd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtALbComR_Internalname, GXutil.ltrim( localUtil.ntoc( A10356ALbComR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbComP_Internalname, GXutil.rtrim( A10357AlbComP)) ;
         httpContext.changePostValue( edtAlbComProd_Internalname, GXutil.rtrim( A5010AlbComProd)) ;
         httpContext.changePostValue( "ZT_"+"Z20AlbComLin_"+sGXsfl_113_idx, GXutil.ltrim( localUtil.ntoc( Z20AlbComLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10355AlbComHd_"+sGXsfl_113_idx, GXutil.ltrim( localUtil.ntoc( Z10355AlbComHd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10356ALbComR_"+sGXsfl_113_idx, GXutil.ltrim( localUtil.ntoc( Z10356ALbComR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10357AlbComP_"+sGXsfl_113_idx, GXutil.rtrim( Z10357AlbComP)) ;
         httpContext.changePostValue( "ZT_"+"Z15AlbComDsc_"+sGXsfl_113_idx, GXutil.rtrim( Z15AlbComDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z10806AlbComDc2_"+sGXsfl_113_idx, GXutil.rtrim( Z10806AlbComDc2)) ;
         httpContext.changePostValue( "ZT_"+"Z13AlbComCnt_"+sGXsfl_113_idx, GXutil.ltrim( localUtil.ntoc( Z13AlbComCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z21AlbComPre_"+sGXsfl_113_idx, GXutil.ltrim( localUtil.ntoc( Z21AlbComPre, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5010AlbComProd_"+sGXsfl_113_idx, GXutil.rtrim( Z5010AlbComProd)) ;
         httpContext.changePostValue( "ZT_"+"Z4717AlbComUni_"+sGXsfl_113_idx, GXutil.ltrim( localUtil.ntoc( Z4717AlbComUni, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T12AlbCImpLin_"+sGXsfl_113_idx, GXutil.ltrim( localUtil.ntoc( O12AlbCImpLin, (byte)(14), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_2_"+sGXsfl_113_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_2_"+sGXsfl_113_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_2_"+sGXsfl_113_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_2 != 0 )
         {
            httpContext.changePostValue( "ALBCOMLIN_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMDSC_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMDC2_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComDc2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMUNI_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComUni_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMUNI_"+sGXsfl_113_idx+"Horizontalalignment", GXutil.rtrim( edtAlbComUni_Horizontalalignment)) ;
            httpContext.changePostValue( "ALBUCODSC_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbUcoDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMCNT_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMPRE_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCIMPLIN_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbCImpLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCIMPL_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbCImpL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMHD_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComHd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMR_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtALbComR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMP_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMPROD_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComProd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O19AlbComLiC = s19AlbComLiC ;
      httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
      O18AlbComImp = s18AlbComImp ;
      n18AlbComImp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1PR0( )
   {
   }

   public void e121PR2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV19Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      documentocomercialv02_impl.this.GXt_char1 = GXv_char2[0] ;
      AV19Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Station", AV19Station);
      GXv_char2[0] = AV20EmprCod ;
      GXv_char3[0] = AV21EmprNom ;
      GXv_char4[0] = AV22UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV19Station, GXv_char2, GXv_char3, GXv_char4) ;
      documentocomercialv02_impl.this.AV20EmprCod = GXv_char2[0] ;
      documentocomercialv02_impl.this.AV21EmprNom = GXv_char3[0] ;
      documentocomercialv02_impl.this.AV22UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20EmprCod", AV20EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV21EmprNom", AV21EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV22UsurCod", AV22UsurCod);
      GXt_int5 = (byte)(AV38FlagTintu) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, httpContext.getMessage( "TINTUT", ""), GXv_int6) ;
      documentocomercialv02_impl.this.GXt_int5 = GXv_int6[0] ;
      AV38FlagTintu = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38FlagTintu", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38FlagTintu), 4, 0));
      GXt_int5 = (byte)(AV7FirmaD) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_int6) ;
      documentocomercialv02_impl.this.GXt_int5 = GXv_int6[0] ;
      AV7FirmaD = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7FirmaD", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7FirmaD), 4, 0));
      GXt_int5 = (byte)(AV8Torient) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, httpContext.getMessage( "TORIEN", ""), GXv_int6) ;
      documentocomercialv02_impl.this.GXt_int5 = GXv_int6[0] ;
      AV8Torient = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Torient", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Torient), 4, 0));
      GXt_int5 = (byte)(AV9Moda21) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int6) ;
      documentocomercialv02_impl.this.GXt_int5 = GXv_int6[0] ;
      AV9Moda21 = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Moda21), 4, 0));
      GXt_int5 = (byte)(AV10Ws) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, httpContext.getMessage( "WSGC", ""), GXv_int6) ;
      documentocomercialv02_impl.this.GXt_int5 = GXv_int6[0] ;
      AV10Ws = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Ws", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Ws), 4, 0));
      GXt_int5 = (byte)(AV11Ctrlf) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, httpContext.getMessage( "CTRDAT", ""), GXv_int6) ;
      documentocomercialv02_impl.this.GXt_int5 = GXv_int6[0] ;
      AV11Ctrlf = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Ctrlf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11Ctrlf), 4, 0));
      GXt_int5 = (byte)(AV12Modhh) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, httpContext.getMessage( "UPDHHS", ""), GXv_int6) ;
      documentocomercialv02_impl.this.GXt_int5 = GXv_int6[0] ;
      AV12Modhh = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Modhh", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12Modhh), 4, 0));
      GXt_int5 = (byte)(AV13Tinamar) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, httpContext.getMessage( "TINAMA", ""), GXv_int6) ;
      documentocomercialv02_impl.this.GXt_int5 = GXv_int6[0] ;
      AV13Tinamar = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Tinamar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13Tinamar), 4, 0));
      GXt_int5 = (byte)(AV14Erfoc) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, httpContext.getMessage( "ERFOC", ""), GXv_int6) ;
      documentocomercialv02_impl.this.GXt_int5 = GXv_int6[0] ;
      AV14Erfoc = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Erfoc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14Erfoc), 4, 0));
      GXt_int5 = (byte)(AV15Carvema) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int6) ;
      documentocomercialv02_impl.this.GXt_int5 = GXv_int6[0] ;
      AV15Carvema = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Carvema", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15Carvema), 4, 0));
      GXt_int5 = (byte)(AV16CambioP) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, httpContext.getMessage( "CAMPRI", ""), GXv_int6) ;
      documentocomercialv02_impl.this.GXt_int5 = GXv_int6[0] ;
      AV16CambioP = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16CambioP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16CambioP), 4, 0));
      GXt_int5 = (byte)(AV17cernum) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, httpContext.getMessage( "CERNUM", ""), GXv_int6) ;
      documentocomercialv02_impl.this.GXt_int5 = GXv_int6[0] ;
      AV17cernum = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17cernum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17cernum), 4, 0));
      AV18Msg_errAT = ((AV17cernum==1) ? httpContext.getMessage( "NO se puede eliminar. Esta activo contador CERNUM", "") : httpContext.getMessage( "NO se puede eliminar. Esta activo FIRMA DIGITAL", "")) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Msg_errAT", AV18Msg_errAT);
      GXt_char1 = AV19Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      documentocomercialv02_impl.this.GXt_char1 = GXv_char4[0] ;
      AV19Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Station", AV19Station);
      GXv_char4[0] = AV20EmprCod ;
      GXv_char3[0] = AV21EmprNom ;
      GXv_char2[0] = AV22UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV19Station, GXv_char4, GXv_char3, GXv_char2) ;
      documentocomercialv02_impl.this.AV20EmprCod = GXv_char4[0] ;
      documentocomercialv02_impl.this.AV21EmprNom = GXv_char3[0] ;
      documentocomercialv02_impl.this.AV22UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20EmprCod", AV20EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV21EmprNom", AV21EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV22UsurCod", AV22UsurCod);
      GXv_SdtWWPContext7[0] = AV24WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV24WWPContext = GXv_SdtWWPContext7[0] ;
      Combo_albcomuni_Titlecontrolidtoreplace = edtAlbComUni_Internalname ;
      ucCombo_albcomuni.sendProperty(context, "", false, Combo_albcomuni_Internalname, "TitleControlIdToReplace", Combo_albcomuni_Titlecontrolidtoreplace);
      edtAlbComUni_Horizontalalignment = "Left" ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComUni_Internalname, "Horizontalalignment", edtAlbComUni_Horizontalalignment, !bGXsfl_113_Refreshing);
      edtTrnCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Visible), 5, 0), true);
      AV42ComboTrnCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42ComboTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42ComboTrnCod), 4, 0));
      edtavCombotrncod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombotrncod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombotrncod_Visible), 5, 0), true);
      edtCliCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), true);
      AV44ComboCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44ComboCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44ComboCliCod), 6, 0));
      edtavComboclicod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboclicod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboclicod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOCLICOD' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADCOMBOTRNCOD' */
      S122 ();
      if ( returnInSub )
      {
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADCOMBOALBCOMUNI' */
      S132 ();
      if ( returnInSub )
      {
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV25TrnContext.fromxml(AV26WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV25TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV55Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV56GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV56GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56GXV1), 8, 0));
         while ( AV56GXV1 <= AV25TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV30TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV25TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV56GXV1));
            if ( GXutil.strcmp(AV30TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "CliCod") == 0 )
            {
               AV27Insert_CliCod = (int)(GXutil.lval( AV30TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV27Insert_CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27Insert_CliCod), 6, 0));
               if ( ! (0==AV27Insert_CliCod) )
               {
                  AV44ComboCliCod = AV27Insert_CliCod ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV44ComboCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44ComboCliCod), 6, 0));
                  Combo_clicod_Selectedvalue_set = GXutil.trim( GXutil.str( AV44ComboCliCod, 6, 0)) ;
                  ucCombo_clicod.sendProperty(context, "", false, Combo_clicod_Internalname, "SelectedValue_set", Combo_clicod_Selectedvalue_set);
                  Combo_clicod_Enabled = false ;
                  ucCombo_clicod.sendProperty(context, "", false, Combo_clicod_Internalname, "Enabled", GXutil.booltostr( Combo_clicod_Enabled));
               }
            }
            else if ( GXutil.strcmp(AV30TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "AlcDivCod") == 0 )
            {
               AV28Insert_AlcDivCod = (byte)(GXutil.lval( AV30TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV28Insert_AlcDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Insert_AlcDivCod), 2, 0));
            }
            else if ( GXutil.strcmp(AV30TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "TrnCod") == 0 )
            {
               AV29Insert_TrnCod = (short)(GXutil.lval( AV30TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV29Insert_TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29Insert_TrnCod), 4, 0));
               if ( ! (0==AV29Insert_TrnCod) )
               {
                  AV42ComboTrnCod = AV29Insert_TrnCod ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV42ComboTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42ComboTrnCod), 4, 0));
                  Combo_trncod_Selectedvalue_set = GXutil.trim( GXutil.str( AV42ComboTrnCod, 4, 0)) ;
                  ucCombo_trncod.sendProperty(context, "", false, Combo_trncod_Internalname, "SelectedValue_set", Combo_trncod_Selectedvalue_set);
                  Combo_trncod_Enabled = false ;
                  ucCombo_trncod.sendProperty(context, "", false, Combo_trncod_Internalname, "Enabled", GXutil.booltostr( Combo_trncod_Enabled));
               }
            }
            AV56GXV1 = (int)(AV56GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56GXV1), 8, 0));
         }
      }
      edtTrnNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnNom_Visible), 5, 0), true);
      edtCliNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), true);
      edtAlbComPri_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComPri_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComPri_Visible), 5, 0), true);
   }

   public void e131PR2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( 0 == 1 )
      {
         if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV25TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
         {
            callWebObject(formatLink("app.documentocomercialv02ww", new String[] {}, new String[] {}) );
            httpContext.wjLocDisableFrm = (byte)(1) ;
         }
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         httpContext.popup(formatLink("app.albaranescomerciales.talcobs", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(AV20EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A14AlbComCod,8,0))}, new String[] {"Mode","EmprCod","AlbComCod"}) , new Object[] {});
      }
      GXv_char4[0] = AV20EmprCod ;
      GXv_int8[0] = A14AlbComCod ;
      new app.pelcaco(remoteHandle, context).execute( GXv_char4, GXv_int8) ;
      documentocomercialv02_impl.this.AV20EmprCod = GXv_char4[0] ;
      documentocomercialv02_impl.this.A14AlbComCod = GXv_int8[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20EmprCod", AV20EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
      GXv_char4[0] = AV20EmprCod ;
      GXv_int8[0] = A14AlbComCod ;
      GXv_date9[0] = A17AlbComFch ;
      GXv_dtime10[0] = A10013AlbComFs ;
      GXv_int11[0] = (short)(2) ;
      GXv_int6[0] = (byte)(3) ;
      GXv_int12[0] = (byte)(1) ;
      GXv_char3[0] = AV45Cadena ;
      new app.albaranescomerciales.obtengocadenaparahashalbarancomercial(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_date9, GXv_dtime10, GXv_int11, GXv_int6, GXv_int12, GXv_char3) ;
      documentocomercialv02_impl.this.AV20EmprCod = GXv_char4[0] ;
      documentocomercialv02_impl.this.A14AlbComCod = GXv_int8[0] ;
      documentocomercialv02_impl.this.A17AlbComFch = GXv_date9[0] ;
      documentocomercialv02_impl.this.A10013AlbComFs = GXv_dtime10[0] ;
      documentocomercialv02_impl.this.AV45Cadena = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20EmprCod", AV20EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A17AlbComFch", localUtil.format(A17AlbComFch, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A10013AlbComFs", localUtil.ttoc( A10013AlbComFs, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      GXv_char4[0] = AV46Hash ;
      GXv_objcol_SdtMessages_Message13[0] = AV47Messages ;
      GXv_boolean14[0] = AV48OK ;
      new app.hash_obtener(remoteHandle, context).execute( AV45Cadena, GXv_char4, GXv_objcol_SdtMessages_Message13, GXv_boolean14) ;
      documentocomercialv02_impl.this.AV46Hash = GXv_char4[0] ;
      AV47Messages = GXv_objcol_SdtMessages_Message13[0] ;
      documentocomercialv02_impl.this.AV48OK = GXv_boolean14[0] ;
      if ( AV48OK )
      {
         GXv_char4[0] = AV20EmprCod ;
         GXv_int8[0] = A14AlbComCod ;
         GXv_char3[0] = AV45Cadena ;
         GXv_char2[0] = AV46Hash ;
         new app.albaranescomerciales.actualizohashalbarancomercial(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3, GXv_char2) ;
         documentocomercialv02_impl.this.AV20EmprCod = GXv_char4[0] ;
         documentocomercialv02_impl.this.A14AlbComCod = GXv_int8[0] ;
         documentocomercialv02_impl.this.AV45Cadena = GXv_char3[0] ;
         documentocomercialv02_impl.this.AV46Hash = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20EmprCod", AV20EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
         httpContext.popup(formatLink("app.albaranescomerciales.horasalidaalbarancomercialenvioat", new String[] {GXutil.URLEncode(GXutil.rtrim(AV20EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A14AlbComCod,8,0)),GXutil.URLEncode(GXutil.formatDateTimeParm(A10013AlbComFs)),GXutil.URLEncode(GXutil.formatDateTimeParm(A4829AlbComHor)),GXutil.URLEncode(GXutil.rtrim(A22AlbComPri)),GXutil.URLEncode(GXutil.rtrim(AV45Cadena)),GXutil.URLEncode(GXutil.rtrim(AV46Hash))}, new String[] {"Emprcod","ALbComCod","AlbComFs","AlbComHor","AlbComPri","Cadena","Hash"}) , new Object[] {"A4829AlbComHor",});
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      else
      {
         AV57GXV2 = 1 ;
         while ( AV57GXV2 <= AV47Messages.size() )
         {
            AV51Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV47Messages.elementAt(-1+AV57GXV2));
            httpContext.GX_msglist.addItem(AV51Message.getgxTv_SdtMessages_Message_Description());
            AV57GXV2 = (int)(AV57GXV2+1) ;
         }
      }
      /*  Sending Event outputs  */
   }

   public void S132( )
   {
      /* 'LOADCOMBOALBCOMUNI' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item15 = AV52AlbComUni_Data ;
      GXv_char4[0] = AV41ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item16[0] = GXt_objcol_SdtDVB_SDTComboData_Item15 ;
      new app.documentocomercialv02loaddvcombo(remoteHandle, context).execute( "AlbComUni", Gx_mode, AV20EmprCod, AV23AlbComCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item16) ;
      documentocomercialv02_impl.this.AV41ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item15 = GXv_objcol_SdtDVB_SDTComboData_Item16[0] ;
      AV52AlbComUni_Data = GXt_objcol_SdtDVB_SDTComboData_Item15 ;
   }

   public void S122( )
   {
      /* 'LOADCOMBOTRNCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item15 = AV40TrnCod_Data ;
      GXv_char4[0] = AV41ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item16[0] = GXt_objcol_SdtDVB_SDTComboData_Item15 ;
      new app.documentocomercialv02loaddvcombo(remoteHandle, context).execute( "TrnCod", Gx_mode, AV20EmprCod, AV23AlbComCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item16) ;
      documentocomercialv02_impl.this.AV41ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item15 = GXv_objcol_SdtDVB_SDTComboData_Item16[0] ;
      AV40TrnCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item15 ;
      Combo_trncod_Selectedvalue_set = AV41ComboSelectedValue ;
      ucCombo_trncod.sendProperty(context, "", false, Combo_trncod_Internalname, "SelectedValue_set", Combo_trncod_Selectedvalue_set);
      AV42ComboTrnCod = (short)(GXutil.lval( AV41ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42ComboTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42ComboTrnCod), 4, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_trncod_Enabled = false ;
         ucCombo_trncod.sendProperty(context, "", false, Combo_trncod_Internalname, "Enabled", GXutil.booltostr( Combo_trncod_Enabled));
      }
   }

   public void S112( )
   {
      /* 'LOADCOMBOCLICOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item15 = AV43CliCod_Data ;
      GXv_char4[0] = AV41ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item16[0] = GXt_objcol_SdtDVB_SDTComboData_Item15 ;
      new app.documentocomercialv02loaddvcombo(remoteHandle, context).execute( "CliCod", Gx_mode, AV20EmprCod, AV23AlbComCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item16) ;
      documentocomercialv02_impl.this.AV41ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item15 = GXv_objcol_SdtDVB_SDTComboData_Item16[0] ;
      AV43CliCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item15 ;
      Combo_clicod_Selectedvalue_set = AV41ComboSelectedValue ;
      ucCombo_clicod.sendProperty(context, "", false, Combo_clicod_Internalname, "SelectedValue_set", Combo_clicod_Selectedvalue_set);
      AV44ComboCliCod = (int)(GXutil.lval( AV41ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44ComboCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44ComboCliCod), 6, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_clicod_Enabled = false ;
         ucCombo_clicod.sendProperty(context, "", false, Combo_clicod_Internalname, "Enabled", GXutil.booltostr( Combo_clicod_Enabled));
      }
   }

   public void zm1PR1( int GX_JID )
   {
      if ( ( GX_JID == 67 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4829AlbComHor = T01PR6_A4829AlbComHor[0] ;
            Z17AlbComFch = T01PR6_A17AlbComFch[0] ;
            Z22AlbComPri = T01PR6_A22AlbComPri[0] ;
            Z16AlbComEst = T01PR6_A16AlbComEst[0] ;
            Z19AlbComLiC = T01PR6_A19AlbComLiC[0] ;
            Z1783AlbComEso = T01PR6_A1783AlbComEso[0] ;
            Z3095AlcDivTCod = T01PR6_A3095AlcDivTCod[0] ;
            Z4830AlbComMat = T01PR6_A4830AlbComMat[0] ;
            Z5142AlcDomEnv = T01PR6_A5142AlcDomEnv[0] ;
            Z10013AlbComFs = T01PR6_A10013AlbComFs[0] ;
            Z10014AlbComFd = T01PR6_A10014AlbComFd[0] ;
            Z10015AlbComFdD = T01PR6_A10015AlbComFdD[0] ;
            Z3094AlbCSec = T01PR6_A3094AlbCSec[0] ;
            Z10738AlbComSt = T01PR6_A10738AlbComSt[0] ;
            Z10739AlbComEAT = T01PR6_A10739AlbComEAT[0] ;
            Z10740AlbComID = T01PR6_A10740AlbComID[0] ;
            Z10764AlbComAT = T01PR6_A10764AlbComAT[0] ;
            Z5143AlcIvaCod = T01PR6_A5143AlcIvaCod[0] ;
            Z11719AlbCTrNm = T01PR6_A11719AlbCTrNm[0] ;
            Z11720AlbCTrDm = T01PR6_A11720AlbCTrDm[0] ;
            Z11721AlbCTrNc = T01PR6_A11721AlbCTrNc[0] ;
            Z14248AlbComATCU = T01PR6_A14248AlbComATCU[0] ;
            Z14249AlbComSerA = T01PR6_A14249AlbComSerA[0] ;
            Z14250AlbComTipA = T01PR6_A14250AlbComTipA[0] ;
            Z252CliCod = T01PR6_A252CliCod[0] ;
            Z840TrnCod = T01PR6_A840TrnCod[0] ;
            Z3111AlcDivCod = T01PR6_A3111AlcDivCod[0] ;
         }
         else
         {
            Z4829AlbComHor = A4829AlbComHor ;
            Z17AlbComFch = A17AlbComFch ;
            Z22AlbComPri = A22AlbComPri ;
            Z16AlbComEst = A16AlbComEst ;
            Z19AlbComLiC = A19AlbComLiC ;
            Z1783AlbComEso = A1783AlbComEso ;
            Z3095AlcDivTCod = A3095AlcDivTCod ;
            Z4830AlbComMat = A4830AlbComMat ;
            Z5142AlcDomEnv = A5142AlcDomEnv ;
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
      if ( GX_JID == -67 )
      {
         Z14AlbComCod = A14AlbComCod ;
         Z4829AlbComHor = A4829AlbComHor ;
         Z17AlbComFch = A17AlbComFch ;
         Z22AlbComPri = A22AlbComPri ;
         Z16AlbComEst = A16AlbComEst ;
         Z19AlbComLiC = A19AlbComLiC ;
         Z1783AlbComEso = A1783AlbComEso ;
         Z3095AlcDivTCod = A3095AlcDivTCod ;
         Z4830AlbComMat = A4830AlbComMat ;
         Z5142AlcDomEnv = A5142AlcDomEnv ;
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
      edtAlbComFs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComFs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComFs_Enabled), 5, 0), true);
      edtAlbComATCU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComATCU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComATCU_Enabled), 5, 0), true);
      cmbAlbComEAT.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbComEAT.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbComEAT.getEnabled(), 5, 0), true);
      edtAlbComID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComID_Enabled), 5, 0), true);
      edtAlbComAT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComAT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComAT_Enabled), 5, 0), true);
      if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
      {
         edtAlbComPri_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbComPri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComPri_Enabled), 5, 0), true);
      }
      else
      {
         edtAlbComPri_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbComPri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComPri_Enabled), 5, 0), true);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         Combo_clicod_Enabled = false ;
         ucCombo_clicod.sendProperty(context, "", false, Combo_clicod_Internalname, "Enabled", GXutil.booltostr( Combo_clicod_Enabled));
      }
      AV55Pgmname = "DocumentoComercialv02" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55Pgmname", AV55Pgmname);
      AV54Pgmdesc = httpContext.getMessage( "Documento Comercial (v02)", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54Pgmdesc", AV54Pgmdesc);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtAlbComFs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComFs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComFs_Enabled), 5, 0), true);
      edtAlbComATCU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComATCU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComATCU_Enabled), 5, 0), true);
      cmbAlbComEAT.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbComEAT.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbComEAT.getEnabled(), 5, 0), true);
      edtAlbComID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComID_Enabled), 5, 0), true);
      edtAlbComAT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComAT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComAT_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV20EmprCod)==0) )
      {
         A396EmprCod = AV20EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01PR7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01PR7_A407EmprNom[0] ;
      n407EmprNom = T01PR7_n407EmprNom[0] ;
      pr_default.close(5);
      if ( ! (0==AV23AlbComCod) )
      {
         A14AlbComCod = AV23AlbComCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
      }
      if ( ! (0==AV23AlbComCod) )
      {
         edtAlbComCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComCod_Enabled), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
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
      if ( ! (0==AV23AlbComCod) )
      {
         edtAlbComCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComCod_Enabled), 5, 0), true);
      }
      if ( GXutil.strcmp(AV31AlbComPri, "0") == 0 )
      {
         AV32ContCod = "100012" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32ContCod", AV32ContCod);
      }
      else
      {
         if ( GXutil.strcmp(AV31AlbComPri, "1") == 0 )
         {
            AV32ContCod = "100011" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32ContCod", AV32ContCod);
         }
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV29Insert_TrnCod) )
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
      if ( isUpd( )  )
      {
         edtCliCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV27Insert_CliCod) )
      {
         edtCliCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      else
      {
         if ( isUpd( )  )
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
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV27Insert_CliCod) )
      {
         A252CliCod = AV27Insert_CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      else
      {
         A252CliCod = AV44ComboCliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV29Insert_TrnCod) )
      {
         A840TrnCod = AV29Insert_TrnCod ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      }
      else
      {
         if ( (0==AV42ComboTrnCod) )
         {
            A840TrnCod = (short)(0) ;
            n840TrnCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            n840TrnCod = true ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         }
         else
         {
            if ( ! (0==AV42ComboTrnCod) )
            {
               A840TrnCod = AV42ComboTrnCod ;
               n840TrnCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            }
         }
      }
      if ( true /* Level */ && isDlt( )  && ( ( AV7FirmaD == 1 ) || ( AV17cernum == 1 ) ) )
      {
         httpContext.GX_msglist.addItem(AV18Msg_errAT, 1, "");
         AnyError = (short)(1) ;
      }
      if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
      {
         edtAlbComPri_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbComPri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComPri_Enabled), 5, 0), true);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         edtAlbComCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComCod_Enabled), 5, 0), true);
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
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV28Insert_AlcDivCod) )
      {
         A3111AlcDivCod = AV28Insert_AlcDivCod ;
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
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A10013AlbComFs) && ( Gx_BScreen == 0 ) )
      {
         A10013AlbComFs = GXutil.serverNow( context, remoteHandle, pr_default) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10013AlbComFs", localUtil.ttoc( A10013AlbComFs, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
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
         A22AlbComPri = AV31AlbComPri ;
         httpContext.ajax_rsp_assign_attri("", false, "A22AlbComPri", A22AlbComPri);
      }
      if ( isIns( )  )
      {
         GXv_char4[0] = A14248AlbComATCU ;
         GXv_char3[0] = A14249AlbComSerA ;
         GXv_char2[0] = A14250AlbComTipA ;
         new app.patcud(remoteHandle, context).execute( A396EmprCod, AV32ContCod, GXv_char4, GXv_char3, GXv_char2, GXutil.trim( AV54Pgmdesc)) ;
         documentocomercialv02_impl.this.A14248AlbComATCU = GXv_char4[0] ;
         documentocomercialv02_impl.this.A14249AlbComSerA = GXv_char3[0] ;
         documentocomercialv02_impl.this.A14250AlbComTipA = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14248AlbComATCU", A14248AlbComATCU);
         httpContext.ajax_rsp_assign_attri("", false, "A14249AlbComSerA", A14249AlbComSerA);
         httpContext.ajax_rsp_assign_attri("", false, "A14250AlbComTipA", A14250AlbComTipA);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T01PR13 */
         pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
         if ( (pr_default.getStatus(10) != 101) )
         {
            A18AlbComImp = T01PR13_A18AlbComImp[0] ;
            n18AlbComImp = T01PR13_n18AlbComImp[0] ;
         }
         else
         {
            A18AlbComImp = DecimalUtil.doubleToDec(0) ;
            n18AlbComImp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
         }
         O18AlbComImp = A18AlbComImp ;
         n18AlbComImp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
         pr_default.close(10);
         /* Using cursor T01PR8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01PR8_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A3091CliDivTra = T01PR8_A3091CliDivTra[0] ;
         n3091CliDivTra = T01PR8_n3091CliDivTra[0] ;
         A3140CliDivCod = T01PR8_A3140CliDivCod[0] ;
         n3140CliDivCod = T01PR8_n3140CliDivCod[0] ;
         pr_default.close(6);
         AV37guiremcli = O252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37guiremcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37guiremcli), 6, 0));
         /* Using cursor T01PR9 */
         pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         A841TrnNom = T01PR9_A841TrnNom[0] ;
         n841TrnNom = T01PR9_n841TrnNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
         pr_default.close(7);
         /* Using cursor T01PR10 */
         pr_default.execute(8, new Object[] {Byte.valueOf(A3111AlcDivCod)});
         A3112AlcDivAbr = T01PR10_A3112AlcDivAbr[0] ;
         n3112AlcDivAbr = T01PR10_n3112AlcDivAbr[0] ;
         pr_default.close(8);
         AV36oldAlbComPri = O22AlbComPri ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36oldAlbComPri", AV36oldAlbComPri);
      }
   }

   public void load1PR1( )
   {
      /* Using cursor T01PR15 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1 = (short)(1) ;
         A4829AlbComHor = T01PR15_A4829AlbComHor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4829AlbComHor", localUtil.ttoc( A4829AlbComHor, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A407EmprNom = T01PR15_A407EmprNom[0] ;
         n407EmprNom = T01PR15_n407EmprNom[0] ;
         A17AlbComFch = T01PR15_A17AlbComFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A17AlbComFch", localUtil.format(A17AlbComFch, "99/99/99"));
         A22AlbComPri = T01PR15_A22AlbComPri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A22AlbComPri", A22AlbComPri);
         A279CliNom = T01PR15_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A3091CliDivTra = T01PR15_A3091CliDivTra[0] ;
         n3091CliDivTra = T01PR15_n3091CliDivTra[0] ;
         A16AlbComEst = T01PR15_A16AlbComEst[0] ;
         A19AlbComLiC = T01PR15_A19AlbComLiC[0] ;
         A1783AlbComEso = T01PR15_A1783AlbComEso[0] ;
         A3095AlcDivTCod = T01PR15_A3095AlcDivTCod[0] ;
         A3112AlcDivAbr = T01PR15_A3112AlcDivAbr[0] ;
         n3112AlcDivAbr = T01PR15_n3112AlcDivAbr[0] ;
         A841TrnNom = T01PR15_A841TrnNom[0] ;
         n841TrnNom = T01PR15_n841TrnNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
         A4830AlbComMat = T01PR15_A4830AlbComMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4830AlbComMat", A4830AlbComMat);
         A5142AlcDomEnv = T01PR15_A5142AlcDomEnv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5142AlcDomEnv", GXutil.str( A5142AlcDomEnv, 1, 0));
         A10013AlbComFs = T01PR15_A10013AlbComFs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10013AlbComFs", localUtil.ttoc( A10013AlbComFs, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A10014AlbComFd = T01PR15_A10014AlbComFd[0] ;
         A10015AlbComFdD = T01PR15_A10015AlbComFdD[0] ;
         A3094AlbCSec = T01PR15_A3094AlbCSec[0] ;
         A10738AlbComSt = T01PR15_A10738AlbComSt[0] ;
         A10739AlbComEAT = T01PR15_A10739AlbComEAT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10739AlbComEAT", GXutil.str( A10739AlbComEAT, 1, 0));
         A10740AlbComID = T01PR15_A10740AlbComID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10740AlbComID", A10740AlbComID);
         A10764AlbComAT = T01PR15_A10764AlbComAT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10764AlbComAT", A10764AlbComAT);
         A5143AlcIvaCod = T01PR15_A5143AlcIvaCod[0] ;
         A11719AlbCTrNm = T01PR15_A11719AlbCTrNm[0] ;
         A11720AlbCTrDm = T01PR15_A11720AlbCTrDm[0] ;
         A11721AlbCTrNc = T01PR15_A11721AlbCTrNc[0] ;
         A14248AlbComATCU = T01PR15_A14248AlbComATCU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14248AlbComATCU", A14248AlbComATCU);
         A14249AlbComSerA = T01PR15_A14249AlbComSerA[0] ;
         A14250AlbComTipA = T01PR15_A14250AlbComTipA[0] ;
         A252CliCod = T01PR15_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A840TrnCod = T01PR15_A840TrnCod[0] ;
         n840TrnCod = T01PR15_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A3111AlcDivCod = T01PR15_A3111AlcDivCod[0] ;
         A3140CliDivCod = T01PR15_A3140CliDivCod[0] ;
         n3140CliDivCod = T01PR15_n3140CliDivCod[0] ;
         A13739findDomEnv = T01PR15_A13739findDomEnv[0] ;
         n13739findDomEnv = T01PR15_n13739findDomEnv[0] ;
         A18AlbComImp = T01PR15_A18AlbComImp[0] ;
         n18AlbComImp = T01PR15_n18AlbComImp[0] ;
         zm1PR1( -67) ;
      }
      pr_default.close(11);
      onLoadActions1PR1( ) ;
   }

   public void onLoadActions1PR1( )
   {
      O18AlbComImp = A18AlbComImp ;
      n18AlbComImp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A4829AlbComHor) && true /* After */ )
      {
         GXt_dtime17 = A4829AlbComHor ;
         GXv_dtime10[0] = GXt_dtime17 ;
         new app.stocksquimicos.ptrz001(remoteHandle, context).execute( A396EmprCod, GXv_dtime10) ;
         documentocomercialv02_impl.this.GXt_dtime17 = GXv_dtime10[0] ;
         A4829AlbComHor = GXt_dtime17 ;
         httpContext.ajax_rsp_assign_attri("", false, "A4829AlbComHor", localUtil.ttoc( A4829AlbComHor, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      AV36oldAlbComPri = O22AlbComPri ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36oldAlbComPri", AV36oldAlbComPri);
      AV37guiremcli = O252CliCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37guiremcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37guiremcli), 6, 0));
   }

   public void checkExtendedTable1PR1( )
   {
      nIsDirty_1 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A4829AlbComHor) && true /* After */ )
      {
         nIsDirty_1 = (short)(1) ;
         GXt_dtime17 = A4829AlbComHor ;
         GXv_dtime10[0] = GXt_dtime17 ;
         new app.stocksquimicos.ptrz001(remoteHandle, context).execute( A396EmprCod, GXv_dtime10) ;
         documentocomercialv02_impl.this.GXt_dtime17 = GXv_dtime10[0] ;
         A4829AlbComHor = GXt_dtime17 ;
         httpContext.ajax_rsp_assign_attri("", false, "A4829AlbComHor", localUtil.ttoc( A4829AlbComHor, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      if ( true /* Level */ && true /* After */ && ( AV11Ctrlf == 1 ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A22AlbComPri ;
         GXv_int12[0] = (byte)(2) ;
         GXv_date9[0] = AV33Fch ;
         GXv_int8[0] = AV34AlbLast ;
         GXv_date18[0] = A17AlbComFch ;
         GXv_char2[0] = AV35Msg_f ;
         new app.pdoc000(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int12, GXv_date9, GXv_int8, GXv_date18, GXv_char2) ;
         documentocomercialv02_impl.this.A396EmprCod = GXv_char4[0] ;
         documentocomercialv02_impl.this.A22AlbComPri = GXv_char3[0] ;
         documentocomercialv02_impl.this.AV33Fch = GXv_date9[0] ;
         documentocomercialv02_impl.this.AV34AlbLast = GXv_int8[0] ;
         documentocomercialv02_impl.this.A17AlbComFch = GXv_date18[0] ;
         documentocomercialv02_impl.this.AV35Msg_f = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A22AlbComPri", A22AlbComPri);
         httpContext.ajax_rsp_assign_attri("", false, "AV33Fch", localUtil.format(AV33Fch, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV34AlbLast", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34AlbLast), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A17AlbComFch", localUtil.format(A17AlbComFch, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV35Msg_f", AV35Msg_f);
      }
      if ( ( GXutil.strcmp(AV35Msg_f, " ") != 0 ) && true /* Level */ && true /* After */ )
      {
         httpContext.GX_msglist.addItem(AV35Msg_f, 1, "ALBCOMFCH");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbComFch_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A17AlbComFch)) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Campo Incorrecto", ""), 1, "ALBCOMFCH");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbComFch_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A22AlbComPri, "0") == 0 ) || ( GXutil.strcmp(A22AlbComPri, "1") == 0 ) || ( GXutil.strcmp(A22AlbComPri, "2") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "P", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ALBCOMPRI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbComPri_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      AV36oldAlbComPri = O22AlbComPri ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36oldAlbComPri", AV36oldAlbComPri);
      if ( isUpd( )  && ( GXutil.strcmp(A22AlbComPri, AV36oldAlbComPri) != 0 ) && ( AV16CambioP == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR.NO se puede cambiar este campo ¡¡¡", ""), 1, "ALBCOMPRI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbComPri_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      AV37guiremcli = O252CliCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37guiremcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37guiremcli), 6, 0));
      if ( isUpd( )  && ( A252CliCod != AV37guiremcli ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR.NO se puede cambiar Cliente, Guia comunicada AT ¡¡¡", ""), 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( A16AlbComEst > 1 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Albaran FACTURADO", ""), 1, "");
         AnyError = (short)(1) ;
      }
      /* Using cursor T01PR10 */
      pr_default.execute(8, new Object[] {Byte.valueOf(A3111AlcDivCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DivAlbC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALCDIVCOD");
         AnyError = (short)(1) ;
      }
      A3112AlcDivAbr = T01PR10_A3112AlcDivAbr[0] ;
      n3112AlcDivAbr = T01PR10_n3112AlcDivAbr[0] ;
      pr_default.close(8);
      /* Using cursor T01PR8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01PR8_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A3091CliDivTra = T01PR8_A3091CliDivTra[0] ;
      n3091CliDivTra = T01PR8_n3091CliDivTra[0] ;
      A3140CliDivCod = T01PR8_A3140CliDivCod[0] ;
      n3140CliDivCod = T01PR8_n3140CliDivCod[0] ;
      pr_default.close(6);
      /* Using cursor T01PR9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A841TrnNom = T01PR9_A841TrnNom[0] ;
      n841TrnNom = T01PR9_n841TrnNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      pr_default.close(7);
      /* Using cursor T01PR11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Byte.valueOf(A5142AlcDomEnv)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         A13739findDomEnv = T01PR11_A13739findDomEnv[0] ;
         n13739findDomEnv = T01PR11_n13739findDomEnv[0] ;
      }
      else
      {
         nIsDirty_1 = (short)(1) ;
         A13739findDomEnv = (byte)(0) ;
         n13739findDomEnv = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13739findDomEnv", GXutil.str( A13739findDomEnv, 1, 0));
      }
      pr_default.close(9);
      if ( (0==A13739findDomEnv) && ! (0==A5142AlcDomEnv) && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Endereço de entrega inexistente", ""), 1, "ALCDOMENV");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlcDomEnv_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T01PR13 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         A18AlbComImp = T01PR13_A18AlbComImp[0] ;
         n18AlbComImp = T01PR13_n18AlbComImp[0] ;
      }
      else
      {
         nIsDirty_1 = (short)(1) ;
         A18AlbComImp = DecimalUtil.doubleToDec(0) ;
         n18AlbComImp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
      }
      pr_default.close(10);
   }

   public void closeExtendedTableCursors1PR1( )
   {
      pr_default.close(8);
      pr_default.close(6);
      pr_default.close(7);
      pr_default.close(9);
      pr_default.close(10);
   }

   public void enableDisable( )
   {
   }

   public void gxload_71( byte A3111AlcDivCod )
   {
      /* Using cursor T01PR16 */
      pr_default.execute(12, new Object[] {Byte.valueOf(A3111AlcDivCod)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DivAlbC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALCDIVCOD");
         AnyError = (short)(1) ;
      }
      A3112AlcDivAbr = T01PR16_A3112AlcDivAbr[0] ;
      n3112AlcDivAbr = T01PR16_n3112AlcDivAbr[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3112AlcDivAbr))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void gxload_69( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T01PR17 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01PR17_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A3091CliDivTra = T01PR17_A3091CliDivTra[0] ;
      n3091CliDivTra = T01PR17_n3091CliDivTra[0] ;
      A3140CliDivCod = T01PR17_A3140CliDivCod[0] ;
      n3140CliDivCod = T01PR17_n3140CliDivCod[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3091CliDivTra))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A3140CliDivCod, (byte)(2), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void gxload_70( String A396EmprCod ,
                          short A840TrnCod )
   {
      /* Using cursor T01PR18 */
      pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
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
      A841TrnNom = T01PR18_A841TrnNom[0] ;
      n841TrnNom = T01PR18_n841TrnNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A841TrnNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(14) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(14);
   }

   public void gxload_72( String A396EmprCod ,
                          int A252CliCod ,
                          byte A5142AlcDomEnv )
   {
      /* Using cursor T01PR19 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Byte.valueOf(A5142AlcDomEnv)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         A13739findDomEnv = T01PR19_A13739findDomEnv[0] ;
         n13739findDomEnv = T01PR19_n13739findDomEnv[0] ;
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
      if ( (pr_default.getStatus(15) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(15);
   }

   public void gxload_73( String A396EmprCod ,
                          int A14AlbComCod )
   {
      /* Using cursor T01PR21 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         A18AlbComImp = T01PR21_A18AlbComImp[0] ;
         n18AlbComImp = T01PR21_n18AlbComImp[0] ;
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
      if ( (pr_default.getStatus(16) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(16);
   }

   public void getKey1PR1( )
   {
      /* Using cursor T01PR22 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1 = (short)(1) ;
      }
      else
      {
         RcdFound1 = (short)(0) ;
      }
      pr_default.close(17);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01PR6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm1PR1( 67) ;
         RcdFound1 = (short)(1) ;
         A14AlbComCod = T01PR6_A14AlbComCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
         A4829AlbComHor = T01PR6_A4829AlbComHor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4829AlbComHor", localUtil.ttoc( A4829AlbComHor, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A17AlbComFch = T01PR6_A17AlbComFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A17AlbComFch", localUtil.format(A17AlbComFch, "99/99/99"));
         A22AlbComPri = T01PR6_A22AlbComPri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A22AlbComPri", A22AlbComPri);
         A16AlbComEst = T01PR6_A16AlbComEst[0] ;
         A19AlbComLiC = T01PR6_A19AlbComLiC[0] ;
         A1783AlbComEso = T01PR6_A1783AlbComEso[0] ;
         A3095AlcDivTCod = T01PR6_A3095AlcDivTCod[0] ;
         A4830AlbComMat = T01PR6_A4830AlbComMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4830AlbComMat", A4830AlbComMat);
         A5142AlcDomEnv = T01PR6_A5142AlcDomEnv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5142AlcDomEnv", GXutil.str( A5142AlcDomEnv, 1, 0));
         A10013AlbComFs = T01PR6_A10013AlbComFs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10013AlbComFs", localUtil.ttoc( A10013AlbComFs, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A10014AlbComFd = T01PR6_A10014AlbComFd[0] ;
         A10015AlbComFdD = T01PR6_A10015AlbComFdD[0] ;
         A3094AlbCSec = T01PR6_A3094AlbCSec[0] ;
         A10738AlbComSt = T01PR6_A10738AlbComSt[0] ;
         A10739AlbComEAT = T01PR6_A10739AlbComEAT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10739AlbComEAT", GXutil.str( A10739AlbComEAT, 1, 0));
         A10740AlbComID = T01PR6_A10740AlbComID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10740AlbComID", A10740AlbComID);
         A10764AlbComAT = T01PR6_A10764AlbComAT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10764AlbComAT", A10764AlbComAT);
         A5143AlcIvaCod = T01PR6_A5143AlcIvaCod[0] ;
         A11719AlbCTrNm = T01PR6_A11719AlbCTrNm[0] ;
         A11720AlbCTrDm = T01PR6_A11720AlbCTrDm[0] ;
         A11721AlbCTrNc = T01PR6_A11721AlbCTrNc[0] ;
         A14248AlbComATCU = T01PR6_A14248AlbComATCU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14248AlbComATCU", A14248AlbComATCU);
         A14249AlbComSerA = T01PR6_A14249AlbComSerA[0] ;
         A14250AlbComTipA = T01PR6_A14250AlbComTipA[0] ;
         A396EmprCod = T01PR6_A396EmprCod[0] ;
         A252CliCod = T01PR6_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A840TrnCod = T01PR6_A840TrnCod[0] ;
         n840TrnCod = T01PR6_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A3111AlcDivCod = T01PR6_A3111AlcDivCod[0] ;
         O19AlbComLiC = A19AlbComLiC ;
         httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
         O252CliCod = A252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         O22AlbComPri = A22AlbComPri ;
         httpContext.ajax_rsp_assign_attri("", false, "A22AlbComPri", A22AlbComPri);
         Z396EmprCod = A396EmprCod ;
         Z14AlbComCod = A14AlbComCod ;
         sMode1 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1PR1( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1 = (short)(0) ;
            initializeNonKey1PR1( ) ;
         }
         Gx_mode = sMode1 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1 = (short)(0) ;
         initializeNonKey1PR1( ) ;
         sMode1 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1PR1( ) ;
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
      /* Using cursor T01PR23 */
      pr_default.execute(18, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A14AlbComCod)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         while ( (pr_default.getStatus(18) != 101) && ( ( GXutil.strcmp(T01PR23_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01PR23_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PR23_A14AlbComCod[0] < A14AlbComCod ) ) )
         {
            pr_default.readNext(18);
         }
         if ( (pr_default.getStatus(18) != 101) && ( ( GXutil.strcmp(T01PR23_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01PR23_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PR23_A14AlbComCod[0] > A14AlbComCod ) ) )
         {
            A396EmprCod = T01PR23_A396EmprCod[0] ;
            A14AlbComCod = T01PR23_A14AlbComCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
            RcdFound1 = (short)(1) ;
         }
      }
      pr_default.close(18);
   }

   public void move_previous( )
   {
      RcdFound1 = (short)(0) ;
      /* Using cursor T01PR24 */
      pr_default.execute(19, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A14AlbComCod)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         while ( (pr_default.getStatus(19) != 101) && ( ( GXutil.strcmp(T01PR24_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01PR24_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PR24_A14AlbComCod[0] > A14AlbComCod ) ) )
         {
            pr_default.readNext(19);
         }
         if ( (pr_default.getStatus(19) != 101) && ( ( GXutil.strcmp(T01PR24_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01PR24_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PR24_A14AlbComCod[0] < A14AlbComCod ) ) )
         {
            A396EmprCod = T01PR24_A396EmprCod[0] ;
            A14AlbComCod = T01PR24_A14AlbComCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
            RcdFound1 = (short)(1) ;
         }
      }
      pr_default.close(19);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1PR1( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A19AlbComLiC = O19AlbComLiC ;
         httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
         A18AlbComImp = O18AlbComImp ;
         n18AlbComImp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
         GX_FocusControl = edtAlbComCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1PR1( ) ;
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
               A19AlbComLiC = O19AlbComLiC ;
               httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
               A18AlbComImp = O18AlbComImp ;
               n18AlbComImp = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtAlbComCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               A19AlbComLiC = O19AlbComLiC ;
               httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
               A18AlbComImp = O18AlbComImp ;
               n18AlbComImp = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
               update1PR1( ) ;
               GX_FocusControl = edtAlbComCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A14AlbComCod != Z14AlbComCod ) )
            {
               /* Insert record */
               A19AlbComLiC = O19AlbComLiC ;
               httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
               A18AlbComImp = O18AlbComImp ;
               n18AlbComImp = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
               GX_FocusControl = edtAlbComCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1PR1( ) ;
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
                  A19AlbComLiC = O19AlbComLiC ;
                  httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
                  A18AlbComImp = O18AlbComImp ;
                  n18AlbComImp = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
                  GX_FocusControl = edtAlbComCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1PR1( ) ;
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
         A19AlbComLiC = O19AlbComLiC ;
         httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
         A18AlbComImp = O18AlbComImp ;
         n18AlbComImp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtAlbComCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1PR1( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01PR5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCALCOM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(3) == 101) || !( GXutil.dateCompare(Z4829AlbComHor, T01PR5_A4829AlbComHor[0]) ) || !( GXutil.dateCompare(GXutil.resetTime(Z17AlbComFch), GXutil.resetTime(T01PR5_A17AlbComFch[0])) ) || ( GXutil.strcmp(Z22AlbComPri, T01PR5_A22AlbComPri[0]) != 0 ) || ( Z16AlbComEst != T01PR5_A16AlbComEst[0] ) || ( Z19AlbComLiC != T01PR5_A19AlbComLiC[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z1783AlbComEso != T01PR5_A1783AlbComEso[0] ) || ( GXutil.strcmp(Z3095AlcDivTCod, T01PR5_A3095AlcDivTCod[0]) != 0 ) || ( GXutil.strcmp(Z4830AlbComMat, T01PR5_A4830AlbComMat[0]) != 0 ) || ( Z5142AlcDomEnv != T01PR5_A5142AlcDomEnv[0] ) || !( GXutil.dateCompare(Z10013AlbComFs, T01PR5_A10013AlbComFs[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10014AlbComFd, T01PR5_A10014AlbComFd[0]) != 0 ) || ( GXutil.strcmp(Z10015AlbComFdD, T01PR5_A10015AlbComFdD[0]) != 0 ) || ( GXutil.strcmp(Z3094AlbCSec, T01PR5_A3094AlbCSec[0]) != 0 ) || ( GXutil.strcmp(Z10738AlbComSt, T01PR5_A10738AlbComSt[0]) != 0 ) || ( Z10739AlbComEAT != T01PR5_A10739AlbComEAT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10740AlbComID, T01PR5_A10740AlbComID[0]) != 0 ) || ( GXutil.strcmp(Z10764AlbComAT, T01PR5_A10764AlbComAT[0]) != 0 ) || ( GXutil.strcmp(Z5143AlcIvaCod, T01PR5_A5143AlcIvaCod[0]) != 0 ) || ( GXutil.strcmp(Z11719AlbCTrNm, T01PR5_A11719AlbCTrNm[0]) != 0 ) || ( GXutil.strcmp(Z11720AlbCTrDm, T01PR5_A11720AlbCTrDm[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11721AlbCTrNc, T01PR5_A11721AlbCTrNc[0]) != 0 ) || ( GXutil.strcmp(Z14248AlbComATCU, T01PR5_A14248AlbComATCU[0]) != 0 ) || ( GXutil.strcmp(Z14249AlbComSerA, T01PR5_A14249AlbComSerA[0]) != 0 ) || ( GXutil.strcmp(Z14250AlbComTipA, T01PR5_A14250AlbComTipA[0]) != 0 ) || ( Z252CliCod != T01PR5_A252CliCod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z840TrnCod != T01PR5_A840TrnCod[0] ) || ( Z3111AlcDivCod != T01PR5_A3111AlcDivCod[0] ) )
         {
            if ( !( GXutil.dateCompare(Z4829AlbComHor, T01PR5_A4829AlbComHor[0]) ) )
            {
               GXutil.writeLogln("documentocomercialv02:[seudo value changed for attri]"+"AlbComHor");
               GXutil.writeLogRaw("Old: ",Z4829AlbComHor);
               GXutil.writeLogRaw("Current: ",T01PR5_A4829AlbComHor[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z17AlbComFch), GXutil.resetTime(T01PR5_A17AlbComFch[0])) ) )
            {
               GXutil.writeLogln("documentocomercialv02:[seudo value changed for attri]"+"AlbComFch");
               GXutil.writeLogRaw("Old: ",Z17AlbComFch);
               GXutil.writeLogRaw("Current: ",T01PR5_A17AlbComFch[0]);
            }
            if ( GXutil.strcmp(Z22AlbComPri, T01PR5_A22AlbComPri[0]) != 0 )
            {
               GXutil.writeLogln("documentocomercialv02:[seudo value changed for attri]"+"AlbComPri");
               GXutil.writeLogRaw("Old: ",Z22AlbComPri);
               GXutil.writeLogRaw("Current: ",T01PR5_A22AlbComPri[0]);
            }
            if ( Z16AlbComEst != T01PR5_A16AlbComEst[0] )
            {
               GXutil.writeLogln("documentocomercialv02:[seudo value changed for attri]"+"AlbComEst");
               GXutil.writeLogRaw("Old: ",Z16AlbComEst);
               GXutil.writeLogRaw("Current: ",T01PR5_A16AlbComEst[0]);
            }
            if ( Z19AlbComLiC != T01PR5_A19AlbComLiC[0] )
            {
               GXutil.writeLogln("documentocomercialv02:[seudo value changed for attri]"+"AlbComLiC");
               GXutil.writeLogRaw("Old: ",Z19AlbComLiC);
               GXutil.writeLogRaw("Current: ",T01PR5_A19AlbComLiC[0]);
            }
            if ( Z1783AlbComEso != T01PR5_A1783AlbComEso[0] )
            {
               GXutil.writeLogln("documentocomercialv02:[seudo value changed for attri]"+"AlbComEso");
               GXutil.writeLogRaw("Old: ",Z1783AlbComEso);
               GXutil.writeLogRaw("Current: ",T01PR5_A1783AlbComEso[0]);
            }
            if ( GXutil.strcmp(Z3095AlcDivTCod, T01PR5_A3095AlcDivTCod[0]) != 0 )
            {
               GXutil.writeLogln("documentocomercialv02:[seudo value changed for attri]"+"AlcDivTCod");
               GXutil.writeLogRaw("Old: ",Z3095AlcDivTCod);
               GXutil.writeLogRaw("Current: ",T01PR5_A3095AlcDivTCod[0]);
            }
            if ( GXutil.strcmp(Z4830AlbComMat, T01PR5_A4830AlbComMat[0]) != 0 )
            {
               GXutil.writeLogln("documentocomercialv02:[seudo value changed for attri]"+"AlbComMat");
               GXutil.writeLogRaw("Old: ",Z4830AlbComMat);
               GXutil.writeLogRaw("Current: ",T01PR5_A4830AlbComMat[0]);
            }
            if ( Z5142AlcDomEnv != T01PR5_A5142AlcDomEnv[0] )
            {
               GXutil.writeLogln("documentocomercialv02:[seudo value changed for attri]"+"AlcDomEnv");
               GXutil.writeLogRaw("Old: ",Z5142AlcDomEnv);
               GXutil.writeLogRaw("Current: ",T01PR5_A5142AlcDomEnv[0]);
            }
            if ( !( GXutil.dateCompare(Z10013AlbComFs, T01PR5_A10013AlbComFs[0]) ) )
            {
               GXutil.writeLogln("documentocomercialv02:[seudo value changed for attri]"+"AlbComFs");
               GXutil.writeLogRaw("Old: ",Z10013AlbComFs);
               GXutil.writeLogRaw("Current: ",T01PR5_A10013AlbComFs[0]);
            }
            if ( GXutil.strcmp(Z10014AlbComFd, T01PR5_A10014AlbComFd[0]) != 0 )
            {
               GXutil.writeLogln("documentocomercialv02:[seudo value changed for attri]"+"AlbComFd");
               GXutil.writeLogRaw("Old: ",Z10014AlbComFd);
               GXutil.writeLogRaw("Current: ",T01PR5_A10014AlbComFd[0]);
            }
            if ( GXutil.strcmp(Z10015AlbComFdD, T01PR5_A10015AlbComFdD[0]) != 0 )
            {
               GXutil.writeLogln("documentocomercialv02:[seudo value changed for attri]"+"AlbComFdD");
               GXutil.writeLogRaw("Old: ",Z10015AlbComFdD);
               GXutil.writeLogRaw("Current: ",T01PR5_A10015AlbComFdD[0]);
            }
            if ( GXutil.strcmp(Z3094AlbCSec, T01PR5_A3094AlbCSec[0]) != 0 )
            {
               GXutil.writeLogln("documentocomercialv02:[seudo value changed for attri]"+"AlbCSec");
               GXutil.writeLogRaw("Old: ",Z3094AlbCSec);
               GXutil.writeLogRaw("Current: ",T01PR5_A3094AlbCSec[0]);
            }
            if ( GXutil.strcmp(Z10738AlbComSt, T01PR5_A10738AlbComSt[0]) != 0 )
            {
               GXutil.writeLogln("documentocomercialv02:[seudo value changed for attri]"+"AlbComSt");
               GXutil.writeLogRaw("Old: ",Z10738AlbComSt);
               GXutil.writeLogRaw("Current: ",T01PR5_A10738AlbComSt[0]);
            }
            if ( Z10739AlbComEAT != T01PR5_A10739AlbComEAT[0] )
            {
               GXutil.writeLogln("documentocomercialv02:[seudo value changed for attri]"+"AlbComEAT");
               GXutil.writeLogRaw("Old: ",Z10739AlbComEAT);
               GXutil.writeLogRaw("Current: ",T01PR5_A10739AlbComEAT[0]);
            }
            if ( GXutil.strcmp(Z10740AlbComID, T01PR5_A10740AlbComID[0]) != 0 )
            {
               GXutil.writeLogln("documentocomercialv02:[seudo value changed for attri]"+"AlbComID");
               GXutil.writeLogRaw("Old: ",Z10740AlbComID);
               GXutil.writeLogRaw("Current: ",T01PR5_A10740AlbComID[0]);
            }
            if ( GXutil.strcmp(Z10764AlbComAT, T01PR5_A10764AlbComAT[0]) != 0 )
            {
               GXutil.writeLogln("documentocomercialv02:[seudo value changed for attri]"+"AlbComAT");
               GXutil.writeLogRaw("Old: ",Z10764AlbComAT);
               GXutil.writeLogRaw("Current: ",T01PR5_A10764AlbComAT[0]);
            }
            if ( GXutil.strcmp(Z5143AlcIvaCod, T01PR5_A5143AlcIvaCod[0]) != 0 )
            {
               GXutil.writeLogln("documentocomercialv02:[seudo value changed for attri]"+"AlcIvaCod");
               GXutil.writeLogRaw("Old: ",Z5143AlcIvaCod);
               GXutil.writeLogRaw("Current: ",T01PR5_A5143AlcIvaCod[0]);
            }
            if ( GXutil.strcmp(Z11719AlbCTrNm, T01PR5_A11719AlbCTrNm[0]) != 0 )
            {
               GXutil.writeLogln("documentocomercialv02:[seudo value changed for attri]"+"AlbCTrNm");
               GXutil.writeLogRaw("Old: ",Z11719AlbCTrNm);
               GXutil.writeLogRaw("Current: ",T01PR5_A11719AlbCTrNm[0]);
            }
            if ( GXutil.strcmp(Z11720AlbCTrDm, T01PR5_A11720AlbCTrDm[0]) != 0 )
            {
               GXutil.writeLogln("documentocomercialv02:[seudo value changed for attri]"+"AlbCTrDm");
               GXutil.writeLogRaw("Old: ",Z11720AlbCTrDm);
               GXutil.writeLogRaw("Current: ",T01PR5_A11720AlbCTrDm[0]);
            }
            if ( GXutil.strcmp(Z11721AlbCTrNc, T01PR5_A11721AlbCTrNc[0]) != 0 )
            {
               GXutil.writeLogln("documentocomercialv02:[seudo value changed for attri]"+"AlbCTrNc");
               GXutil.writeLogRaw("Old: ",Z11721AlbCTrNc);
               GXutil.writeLogRaw("Current: ",T01PR5_A11721AlbCTrNc[0]);
            }
            if ( GXutil.strcmp(Z14248AlbComATCU, T01PR5_A14248AlbComATCU[0]) != 0 )
            {
               GXutil.writeLogln("documentocomercialv02:[seudo value changed for attri]"+"AlbComATCU");
               GXutil.writeLogRaw("Old: ",Z14248AlbComATCU);
               GXutil.writeLogRaw("Current: ",T01PR5_A14248AlbComATCU[0]);
            }
            if ( GXutil.strcmp(Z14249AlbComSerA, T01PR5_A14249AlbComSerA[0]) != 0 )
            {
               GXutil.writeLogln("documentocomercialv02:[seudo value changed for attri]"+"AlbComSerA");
               GXutil.writeLogRaw("Old: ",Z14249AlbComSerA);
               GXutil.writeLogRaw("Current: ",T01PR5_A14249AlbComSerA[0]);
            }
            if ( GXutil.strcmp(Z14250AlbComTipA, T01PR5_A14250AlbComTipA[0]) != 0 )
            {
               GXutil.writeLogln("documentocomercialv02:[seudo value changed for attri]"+"AlbComTipA");
               GXutil.writeLogRaw("Old: ",Z14250AlbComTipA);
               GXutil.writeLogRaw("Current: ",T01PR5_A14250AlbComTipA[0]);
            }
            if ( Z252CliCod != T01PR5_A252CliCod[0] )
            {
               GXutil.writeLogln("documentocomercialv02:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T01PR5_A252CliCod[0]);
            }
            if ( Z840TrnCod != T01PR5_A840TrnCod[0] )
            {
               GXutil.writeLogln("documentocomercialv02:[seudo value changed for attri]"+"TrnCod");
               GXutil.writeLogRaw("Old: ",Z840TrnCod);
               GXutil.writeLogRaw("Current: ",T01PR5_A840TrnCod[0]);
            }
            if ( Z3111AlcDivCod != T01PR5_A3111AlcDivCod[0] )
            {
               GXutil.writeLogln("documentocomercialv02:[seudo value changed for attri]"+"AlcDivCod");
               GXutil.writeLogRaw("Old: ",Z3111AlcDivCod);
               GXutil.writeLogRaw("Current: ",T01PR5_A3111AlcDivCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCALCOM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1PR1( )
   {
      beforeValidate1PR1( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1PR1( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1PR1( 0) ;
         checkOptimisticConcurrency1PR1( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1PR1( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1PR1( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01PR25 */
                  pr_default.execute(20, new Object[] {Integer.valueOf(A14AlbComCod), A4829AlbComHor, A17AlbComFch, A22AlbComPri, Byte.valueOf(A16AlbComEst), Short.valueOf(A19AlbComLiC), Byte.valueOf(A1783AlbComEso), A3095AlcDivTCod, A4830AlbComMat, Byte.valueOf(A5142AlcDomEnv), A10013AlbComFs, A10014AlbComFd, A10015AlbComFdD, A3094AlbCSec, A10738AlbComSt, Byte.valueOf(A10739AlbComEAT), A10740AlbComID, A10764AlbComAT, A5143AlcIvaCod, A11719AlbCTrNm, A11720AlbCTrDm, A11721AlbCTrNc, A14248AlbComATCU, A14249AlbComSerA, A14250AlbComTipA, A396EmprCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), Byte.valueOf(A3111AlcDivCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALCOM");
                  if ( (pr_default.getStatus(20) == 1) )
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
                        processLevel1PR1( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1PR0( ) ;
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
            load1PR1( ) ;
         }
         endLevel1PR1( ) ;
      }
      closeExtendedTableCursors1PR1( ) ;
   }

   public void update1PR1( )
   {
      beforeValidate1PR1( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1PR1( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1PR1( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1PR1( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1PR1( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01PR26 */
                  pr_default.execute(21, new Object[] {A4829AlbComHor, A17AlbComFch, A22AlbComPri, Byte.valueOf(A16AlbComEst), Short.valueOf(A19AlbComLiC), Byte.valueOf(A1783AlbComEso), A3095AlcDivTCod, A4830AlbComMat, Byte.valueOf(A5142AlcDomEnv), A10013AlbComFs, A10014AlbComFd, A10015AlbComFdD, A3094AlbCSec, A10738AlbComSt, Byte.valueOf(A10739AlbComEAT), A10740AlbComID, A10764AlbComAT, A5143AlcIvaCod, A11719AlbCTrNm, A11720AlbCTrDm, A11721AlbCTrNc, A14248AlbComATCU, A14249AlbComSerA, A14250AlbComTipA, Integer.valueOf(A252CliCod), Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), Byte.valueOf(A3111AlcDivCod), A396EmprCod, Integer.valueOf(A14AlbComCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALCOM");
                  if ( (pr_default.getStatus(21) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCALCOM"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1PR1( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1PR1( ) ;
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
         endLevel1PR1( ) ;
      }
      closeExtendedTableCursors1PR1( ) ;
   }

   public void deferredUpdate1PR1( )
   {
   }

   public void delete( )
   {
      beforeValidate1PR1( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1PR1( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1PR1( ) ;
         afterConfirm1PR1( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1PR1( ) ;
            if ( AnyError == 0 )
            {
               A19AlbComLiC = O19AlbComLiC ;
               httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
               A18AlbComImp = O18AlbComImp ;
               n18AlbComImp = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
               scanStart1PR2( ) ;
               while ( RcdFound2 != 0 )
               {
                  getByPrimaryKey1PR2( ) ;
                  delete1PR2( ) ;
                  scanNext1PR2( ) ;
                  O19AlbComLiC = A19AlbComLiC ;
                  httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
                  O18AlbComImp = A18AlbComImp ;
                  n18AlbComImp = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
               }
               scanEnd1PR2( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01PR27 */
                  pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
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
      }
      sMode1 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1PR1( ) ;
      Gx_mode = sMode1 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1PR1( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isUpd( )  && ( GXutil.strcmp(A22AlbComPri, AV36oldAlbComPri) != 0 ) && ( AV16CambioP == 0 ) && true /* After */ )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR.NO se puede cambiar este campo ¡¡¡", ""), 1, "ALBCOMPRI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbComPri_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         if ( isUpd( )  && ( A252CliCod != AV37guiremcli ) && true /* After */ )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR.NO se puede cambiar Cliente, Guia comunicada AT ¡¡¡", ""), 1, "CLICOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCliCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         AV36oldAlbComPri = O22AlbComPri ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36oldAlbComPri", AV36oldAlbComPri);
         AV37guiremcli = O252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37guiremcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37guiremcli), 6, 0));
         if ( ( A16AlbComEst > 1 ) && isDlt( )  )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Albaran FACTURADO", ""), 1, "");
            AnyError = (short)(1) ;
         }
         /* Using cursor T01PR28 */
         pr_default.execute(23, new Object[] {Byte.valueOf(A3111AlcDivCod)});
         A3112AlcDivAbr = T01PR28_A3112AlcDivAbr[0] ;
         n3112AlcDivAbr = T01PR28_n3112AlcDivAbr[0] ;
         pr_default.close(23);
         /* Using cursor T01PR29 */
         pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01PR29_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A3091CliDivTra = T01PR29_A3091CliDivTra[0] ;
         n3091CliDivTra = T01PR29_n3091CliDivTra[0] ;
         A3140CliDivCod = T01PR29_A3140CliDivCod[0] ;
         n3140CliDivCod = T01PR29_n3140CliDivCod[0] ;
         pr_default.close(24);
         /* Using cursor T01PR30 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         A841TrnNom = T01PR30_A841TrnNom[0] ;
         n841TrnNom = T01PR30_n841TrnNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
         pr_default.close(25);
         /* Using cursor T01PR31 */
         pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Byte.valueOf(A5142AlcDomEnv)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            A13739findDomEnv = T01PR31_A13739findDomEnv[0] ;
            n13739findDomEnv = T01PR31_n13739findDomEnv[0] ;
         }
         else
         {
            A13739findDomEnv = (byte)(0) ;
            n13739findDomEnv = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13739findDomEnv", GXutil.str( A13739findDomEnv, 1, 0));
         }
         pr_default.close(26);
         /* Using cursor T01PR33 */
         pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            A18AlbComImp = T01PR33_A18AlbComImp[0] ;
            n18AlbComImp = T01PR33_n18AlbComImp[0] ;
         }
         else
         {
            A18AlbComImp = DecimalUtil.doubleToDec(0) ;
            n18AlbComImp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
         }
         pr_default.close(27);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01PR34 */
         pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSALC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
      }
   }

   public void processNestedLevel1PR2( )
   {
      s19AlbComLiC = O19AlbComLiC ;
      httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
      s18AlbComImp = O18AlbComImp ;
      n18AlbComImp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
      nGXsfl_113_idx = 0 ;
      while ( nGXsfl_113_idx < nRC_GXsfl_113 )
      {
         readRow1PR2( ) ;
         if ( ( nRcdExists_2 != 0 ) || ( nIsMod_2 != 0 ) )
         {
            standaloneNotModal1PR2( ) ;
            getKey1PR2( ) ;
            if ( ( nRcdExists_2 == 0 ) && ( nRcdDeleted_2 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1PR2( ) ;
            }
            else
            {
               if ( RcdFound2 != 0 )
               {
                  if ( ( nRcdDeleted_2 != 0 ) && ( nRcdExists_2 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1PR2( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_2 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1PR2( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_2 == 0 )
                  {
                     GXCCtl = "ALBCOMLIN_" + sGXsfl_113_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbComLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O19AlbComLiC = A19AlbComLiC ;
            httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
            O18AlbComImp = A18AlbComImp ;
            n18AlbComImp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
         }
         httpContext.changePostValue( edtAlbComLin_Internalname, GXutil.ltrim( localUtil.ntoc( A20AlbComLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbComDsc_Internalname, GXutil.rtrim( A15AlbComDsc)) ;
         httpContext.changePostValue( edtAlbComDc2_Internalname, GXutil.rtrim( A10806AlbComDc2)) ;
         httpContext.changePostValue( edtAlbComUni_Internalname, GXutil.ltrim( localUtil.ntoc( A4717AlbComUni, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbUcoDsc_Internalname, GXutil.rtrim( A5144AlbUcoDsc)) ;
         httpContext.changePostValue( edtAlbComCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A13AlbComCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbComPre_Internalname, GXutil.ltrim( localUtil.ntoc( A21AlbComPre, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbCImpLin_Internalname, GXutil.ltrim( localUtil.ntoc( A12AlbCImpLin, (byte)(14), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbCImpL_Internalname, GXutil.ltrim( localUtil.ntoc( A3914AlbCImpL, (byte)(16), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbComHd_Internalname, GXutil.ltrim( localUtil.ntoc( A10355AlbComHd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtALbComR_Internalname, GXutil.ltrim( localUtil.ntoc( A10356ALbComR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbComP_Internalname, GXutil.rtrim( A10357AlbComP)) ;
         httpContext.changePostValue( edtAlbComProd_Internalname, GXutil.rtrim( A5010AlbComProd)) ;
         httpContext.changePostValue( "ZT_"+"Z20AlbComLin_"+sGXsfl_113_idx, GXutil.ltrim( localUtil.ntoc( Z20AlbComLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10355AlbComHd_"+sGXsfl_113_idx, GXutil.ltrim( localUtil.ntoc( Z10355AlbComHd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10356ALbComR_"+sGXsfl_113_idx, GXutil.ltrim( localUtil.ntoc( Z10356ALbComR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10357AlbComP_"+sGXsfl_113_idx, GXutil.rtrim( Z10357AlbComP)) ;
         httpContext.changePostValue( "ZT_"+"Z15AlbComDsc_"+sGXsfl_113_idx, GXutil.rtrim( Z15AlbComDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z10806AlbComDc2_"+sGXsfl_113_idx, GXutil.rtrim( Z10806AlbComDc2)) ;
         httpContext.changePostValue( "ZT_"+"Z13AlbComCnt_"+sGXsfl_113_idx, GXutil.ltrim( localUtil.ntoc( Z13AlbComCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z21AlbComPre_"+sGXsfl_113_idx, GXutil.ltrim( localUtil.ntoc( Z21AlbComPre, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5010AlbComProd_"+sGXsfl_113_idx, GXutil.rtrim( Z5010AlbComProd)) ;
         httpContext.changePostValue( "ZT_"+"Z4717AlbComUni_"+sGXsfl_113_idx, GXutil.ltrim( localUtil.ntoc( Z4717AlbComUni, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T12AlbCImpLin_"+sGXsfl_113_idx, GXutil.ltrim( localUtil.ntoc( O12AlbCImpLin, (byte)(14), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_2_"+sGXsfl_113_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_2_"+sGXsfl_113_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_2_"+sGXsfl_113_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_2 != 0 )
         {
            httpContext.changePostValue( "ALBCOMLIN_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMDSC_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMDC2_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComDc2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMUNI_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComUni_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMUNI_"+sGXsfl_113_idx+"Horizontalalignment", GXutil.rtrim( edtAlbComUni_Horizontalalignment)) ;
            httpContext.changePostValue( "ALBUCODSC_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbUcoDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMCNT_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMPRE_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCIMPLIN_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbCImpLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCIMPL_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbCImpL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMHD_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComHd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMR_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtALbComR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMP_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMPROD_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComProd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1PR2( ) ;
      if ( AnyError != 0 )
      {
         O19AlbComLiC = s19AlbComLiC ;
         httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
         O18AlbComImp = s18AlbComImp ;
         n18AlbComImp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
      }
      nRcdExists_2 = (short)(0) ;
      nIsMod_2 = (short)(0) ;
      nRcdDeleted_2 = (short)(0) ;
   }

   public void processLevel1PR1( )
   {
      /* Save parent mode. */
      sMode1 = Gx_mode ;
      processNestedLevel1PR2( ) ;
      if ( AnyError != 0 )
      {
         O19AlbComLiC = s19AlbComLiC ;
         httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
         O18AlbComImp = s18AlbComImp ;
         n18AlbComImp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
      }
      /* Restore parent mode. */
      Gx_mode = sMode1 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01PR35 */
      pr_default.execute(29, new Object[] {Short.valueOf(A19AlbComLiC), A396EmprCod, Integer.valueOf(A14AlbComCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALCOM");
   }

   public void endLevel1PR1( )
   {
      pr_default.close(3);
      if ( AnyError == 0 )
      {
         beforeComplete1PR1( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "documentocomercialv02");
         if ( AnyError == 0 )
         {
            confirmValues1PR0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "documentocomercialv02");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1PR1( )
   {
      /* Scan By routine */
      /* Using cursor T01PR36 */
      pr_default.execute(30);
      RcdFound1 = (short)(0) ;
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound1 = (short)(1) ;
         A396EmprCod = T01PR36_A396EmprCod[0] ;
         A14AlbComCod = T01PR36_A14AlbComCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1PR1( )
   {
      /* Scan next routine */
      pr_default.readNext(30);
      RcdFound1 = (short)(0) ;
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound1 = (short)(1) ;
         A396EmprCod = T01PR36_A396EmprCod[0] ;
         A14AlbComCod = T01PR36_A14AlbComCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
      }
   }

   public void scanEnd1PR1( )
   {
      pr_default.close(30);
   }

   public void afterConfirm1PR1( )
   {
      /* After Confirm Rules */
      if ( (GXutil.strcmp("", A14248AlbComATCU)==0) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta codigo ATCUD", ""), 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
   }

   public void beforeInsert1PR1( )
   {
      /* Before Insert Rules */
      if ( (0==A14AlbComCod) && true /* Level */ )
      {
         GXv_int8[0] = A14AlbComCod ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, AV32ContCod, GXv_int8) ;
         documentocomercialv02_impl.this.A14AlbComCod = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
      }
   }

   public void beforeUpdate1PR1( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1PR1( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1PR1( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1PR1( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1PR1( )
   {
      edtAlbComCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComCod_Enabled), 5, 0), true);
      edtAlbComFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComFch_Enabled), 5, 0), true);
      edtAlbComHor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComHor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComHor_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtAlcDomEnv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlcDomEnv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlcDomEnv_Enabled), 5, 0), true);
      edtTrnCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      edtAlbComMat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComMat_Enabled), 5, 0), true);
      edtAlbComFs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComFs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComFs_Enabled), 5, 0), true);
      edtAlbComATCU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComATCU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComATCU_Enabled), 5, 0), true);
      cmbAlbComEAT.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbComEAT.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbComEAT.getEnabled(), 5, 0), true);
      edtAlbComID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComID_Enabled), 5, 0), true);
      edtAlbComAT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComAT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComAT_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavComboclicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboclicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboclicod_Enabled), 5, 0), true);
      edtavCombotrncod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombotrncod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombotrncod_Enabled), 5, 0), true);
      edtTrnNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnNom_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtAlbComPri_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComPri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComPri_Enabled), 5, 0), true);
   }

   public void zm1PR2( int GX_JID )
   {
      if ( ( GX_JID == 74 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10355AlbComHd = T01PR3_A10355AlbComHd[0] ;
            Z10356ALbComR = T01PR3_A10356ALbComR[0] ;
            Z10357AlbComP = T01PR3_A10357AlbComP[0] ;
            Z15AlbComDsc = T01PR3_A15AlbComDsc[0] ;
            Z10806AlbComDc2 = T01PR3_A10806AlbComDc2[0] ;
            Z13AlbComCnt = T01PR3_A13AlbComCnt[0] ;
            Z21AlbComPre = T01PR3_A21AlbComPre[0] ;
            Z5010AlbComProd = T01PR3_A5010AlbComProd[0] ;
            Z4717AlbComUni = T01PR3_A4717AlbComUni[0] ;
         }
         else
         {
            Z10355AlbComHd = A10355AlbComHd ;
            Z10356ALbComR = A10356ALbComR ;
            Z10357AlbComP = A10357AlbComP ;
            Z15AlbComDsc = A15AlbComDsc ;
            Z10806AlbComDc2 = A10806AlbComDc2 ;
            Z13AlbComCnt = A13AlbComCnt ;
            Z21AlbComPre = A21AlbComPre ;
            Z5010AlbComProd = A5010AlbComProd ;
            Z4717AlbComUni = A4717AlbComUni ;
         }
      }
      if ( GX_JID == -74 )
      {
         Z14AlbComCod = A14AlbComCod ;
         Z20AlbComLin = A20AlbComLin ;
         Z10355AlbComHd = A10355AlbComHd ;
         Z10356ALbComR = A10356ALbComR ;
         Z10357AlbComP = A10357AlbComP ;
         Z15AlbComDsc = A15AlbComDsc ;
         Z10806AlbComDc2 = A10806AlbComDc2 ;
         Z13AlbComCnt = A13AlbComCnt ;
         Z21AlbComPre = A21AlbComPre ;
         Z5010AlbComProd = A5010AlbComProd ;
         Z396EmprCod = A396EmprCod ;
         Z4717AlbComUni = A4717AlbComUni ;
         Z5144AlbUcoDsc = A5144AlbUcoDsc ;
      }
   }

   public void standaloneNotModal1PR2( )
   {
      edtAlbUcoDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbUcoDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbUcoDsc_Enabled), 5, 0), !bGXsfl_113_Refreshing);
      edtAlbCImpL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbCImpL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCImpL_Enabled), 5, 0), !bGXsfl_113_Refreshing);
      edtAlbComHd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComHd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComHd_Enabled), 5, 0), !bGXsfl_113_Refreshing);
      edtALbComR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtALbComR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtALbComR_Enabled), 5, 0), !bGXsfl_113_Refreshing);
      edtAlbComP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComP_Enabled), 5, 0), !bGXsfl_113_Refreshing);
      edtAlbComProd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComProd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComProd_Enabled), 5, 0), !bGXsfl_113_Refreshing);
   }

   public void standaloneModal1PR2( )
   {
      if ( isDlt( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Funcion no permitida", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( isIns( )  )
      {
         A19AlbComLiC = (short)(O19AlbComLiC+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
      }
      if ( isIns( )  && (0==A10355AlbComHd) && ( Gx_BScreen == 0 ) )
      {
         A10355AlbComHd = 0 ;
      }
      if ( isIns( )  && (0==A10356ALbComR) && ( Gx_BScreen == 0 ) )
      {
         A10356ALbComR = (byte)(0) ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A10357AlbComP)==0) && ( Gx_BScreen == 0 ) )
      {
         A10357AlbComP = " " ;
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A20AlbComLin = A19AlbComLiC ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAlbComLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbComLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComLin_Enabled), 5, 0), !bGXsfl_113_Refreshing);
      }
      else
      {
         edtAlbComLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbComLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComLin_Enabled), 5, 0), !bGXsfl_113_Refreshing);
      }
   }

   public void load1PR2( )
   {
      /* Using cursor T01PR37 */
      pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod), Short.valueOf(A20AlbComLin)});
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound2 = (short)(1) ;
         A10355AlbComHd = T01PR37_A10355AlbComHd[0] ;
         A10356ALbComR = T01PR37_A10356ALbComR[0] ;
         A10357AlbComP = T01PR37_A10357AlbComP[0] ;
         A15AlbComDsc = T01PR37_A15AlbComDsc[0] ;
         A10806AlbComDc2 = T01PR37_A10806AlbComDc2[0] ;
         A5144AlbUcoDsc = T01PR37_A5144AlbUcoDsc[0] ;
         n5144AlbUcoDsc = T01PR37_n5144AlbUcoDsc[0] ;
         A13AlbComCnt = T01PR37_A13AlbComCnt[0] ;
         A21AlbComPre = T01PR37_A21AlbComPre[0] ;
         A5010AlbComProd = T01PR37_A5010AlbComProd[0] ;
         A4717AlbComUni = T01PR37_A4717AlbComUni[0] ;
         zm1PR2( -74) ;
      }
      pr_default.close(31);
      onLoadActions1PR2( ) ;
   }

   public void onLoadActions1PR2( )
   {
      A3914AlbCImpL = A21AlbComPre.multiply(A13AlbComCnt) ;
      A12AlbCImpLin = GXutil.roundDecimal( A3914AlbCImpL, 2) ;
      O12AlbCImpLin = A12AlbCImpLin ;
      if ( isIns( )  )
      {
         A18AlbComImp = O18AlbComImp.add(A12AlbCImpLin) ;
         n18AlbComImp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A18AlbComImp = O18AlbComImp.add(A12AlbCImpLin).subtract(O12AlbCImpLin) ;
            n18AlbComImp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A18AlbComImp = O18AlbComImp.subtract(O12AlbCImpLin) ;
               n18AlbComImp = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
            }
         }
      }
   }

   public void checkExtendedTable1PR2( )
   {
      nIsDirty_2 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1PR2( ) ;
      /* Using cursor T01PR4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Byte.valueOf(A4717AlbComUni)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "ALBCOMUNI_" + sGXsfl_113_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Producto2", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbComUni_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A5144AlbUcoDsc = T01PR4_A5144AlbUcoDsc[0] ;
      n5144AlbUcoDsc = T01PR4_n5144AlbUcoDsc[0] ;
      pr_default.close(2);
      nIsDirty_2 = (short)(1) ;
      A3914AlbCImpL = A21AlbComPre.multiply(A13AlbComCnt) ;
      nIsDirty_2 = (short)(1) ;
      A12AlbCImpLin = GXutil.roundDecimal( A3914AlbCImpL, 2) ;
      if ( isIns( )  )
      {
         nIsDirty_2 = (short)(1) ;
         A18AlbComImp = O18AlbComImp.add(A12AlbCImpLin) ;
         n18AlbComImp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_2 = (short)(1) ;
            A18AlbComImp = O18AlbComImp.add(A12AlbCImpLin).subtract(O12AlbCImpLin) ;
            n18AlbComImp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_2 = (short)(1) ;
               A18AlbComImp = O18AlbComImp.subtract(O12AlbCImpLin) ;
               n18AlbComImp = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
            }
         }
      }
   }

   public void closeExtendedTableCursors1PR2( )
   {
      pr_default.close(2);
   }

   public void enableDisable1PR2( )
   {
   }

   public void gxload_75( String A396EmprCod ,
                          byte A4717AlbComUni )
   {
      /* Using cursor T01PR38 */
      pr_default.execute(32, new Object[] {A396EmprCod, Byte.valueOf(A4717AlbComUni)});
      if ( (pr_default.getStatus(32) == 101) )
      {
         GXCCtl = "ALBCOMUNI_" + sGXsfl_113_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Producto2", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbComUni_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A5144AlbUcoDsc = T01PR38_A5144AlbUcoDsc[0] ;
      n5144AlbUcoDsc = T01PR38_n5144AlbUcoDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A5144AlbUcoDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(32) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(32);
   }

   public void getKey1PR2( )
   {
      /* Using cursor T01PR39 */
      pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod), Short.valueOf(A20AlbComLin)});
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound2 = (short)(1) ;
      }
      else
      {
         RcdFound2 = (short)(0) ;
      }
      pr_default.close(33);
   }

   public void getByPrimaryKey1PR2( )
   {
      /* Using cursor T01PR3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod), Short.valueOf(A20AlbComLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1PR2( 74) ;
         RcdFound2 = (short)(1) ;
         initializeNonKey1PR2( ) ;
         A20AlbComLin = T01PR3_A20AlbComLin[0] ;
         A10355AlbComHd = T01PR3_A10355AlbComHd[0] ;
         A10356ALbComR = T01PR3_A10356ALbComR[0] ;
         A10357AlbComP = T01PR3_A10357AlbComP[0] ;
         A15AlbComDsc = T01PR3_A15AlbComDsc[0] ;
         A10806AlbComDc2 = T01PR3_A10806AlbComDc2[0] ;
         A13AlbComCnt = T01PR3_A13AlbComCnt[0] ;
         A21AlbComPre = T01PR3_A21AlbComPre[0] ;
         A5010AlbComProd = T01PR3_A5010AlbComProd[0] ;
         A4717AlbComUni = T01PR3_A4717AlbComUni[0] ;
         Z396EmprCod = A396EmprCod ;
         Z14AlbComCod = A14AlbComCod ;
         Z20AlbComLin = A20AlbComLin ;
         sMode2 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1PR2( ) ;
         Gx_mode = sMode2 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound2 = (short)(0) ;
         initializeNonKey1PR2( ) ;
         sMode2 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1PR2( ) ;
         Gx_mode = sMode2 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1PR2( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1PR2( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01PR2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod), Short.valueOf(A20AlbComLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLALCOM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z10355AlbComHd != T01PR2_A10355AlbComHd[0] ) || ( Z10356ALbComR != T01PR2_A10356ALbComR[0] ) || ( GXutil.strcmp(Z10357AlbComP, T01PR2_A10357AlbComP[0]) != 0 ) || ( GXutil.strcmp(Z15AlbComDsc, T01PR2_A15AlbComDsc[0]) != 0 ) || ( GXutil.strcmp(Z10806AlbComDc2, T01PR2_A10806AlbComDc2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z13AlbComCnt, T01PR2_A13AlbComCnt[0]) != 0 ) || ( DecimalUtil.compareTo(Z21AlbComPre, T01PR2_A21AlbComPre[0]) != 0 ) || ( GXutil.strcmp(Z5010AlbComProd, T01PR2_A5010AlbComProd[0]) != 0 ) || ( Z4717AlbComUni != T01PR2_A4717AlbComUni[0] ) )
         {
            if ( Z10355AlbComHd != T01PR2_A10355AlbComHd[0] )
            {
               GXutil.writeLogln("documentocomercialv02:[seudo value changed for attri]"+"AlbComHd");
               GXutil.writeLogRaw("Old: ",Z10355AlbComHd);
               GXutil.writeLogRaw("Current: ",T01PR2_A10355AlbComHd[0]);
            }
            if ( Z10356ALbComR != T01PR2_A10356ALbComR[0] )
            {
               GXutil.writeLogln("documentocomercialv02:[seudo value changed for attri]"+"ALbComR");
               GXutil.writeLogRaw("Old: ",Z10356ALbComR);
               GXutil.writeLogRaw("Current: ",T01PR2_A10356ALbComR[0]);
            }
            if ( GXutil.strcmp(Z10357AlbComP, T01PR2_A10357AlbComP[0]) != 0 )
            {
               GXutil.writeLogln("documentocomercialv02:[seudo value changed for attri]"+"AlbComP");
               GXutil.writeLogRaw("Old: ",Z10357AlbComP);
               GXutil.writeLogRaw("Current: ",T01PR2_A10357AlbComP[0]);
            }
            if ( GXutil.strcmp(Z15AlbComDsc, T01PR2_A15AlbComDsc[0]) != 0 )
            {
               GXutil.writeLogln("documentocomercialv02:[seudo value changed for attri]"+"AlbComDsc");
               GXutil.writeLogRaw("Old: ",Z15AlbComDsc);
               GXutil.writeLogRaw("Current: ",T01PR2_A15AlbComDsc[0]);
            }
            if ( GXutil.strcmp(Z10806AlbComDc2, T01PR2_A10806AlbComDc2[0]) != 0 )
            {
               GXutil.writeLogln("documentocomercialv02:[seudo value changed for attri]"+"AlbComDc2");
               GXutil.writeLogRaw("Old: ",Z10806AlbComDc2);
               GXutil.writeLogRaw("Current: ",T01PR2_A10806AlbComDc2[0]);
            }
            if ( DecimalUtil.compareTo(Z13AlbComCnt, T01PR2_A13AlbComCnt[0]) != 0 )
            {
               GXutil.writeLogln("documentocomercialv02:[seudo value changed for attri]"+"AlbComCnt");
               GXutil.writeLogRaw("Old: ",Z13AlbComCnt);
               GXutil.writeLogRaw("Current: ",T01PR2_A13AlbComCnt[0]);
            }
            if ( DecimalUtil.compareTo(Z21AlbComPre, T01PR2_A21AlbComPre[0]) != 0 )
            {
               GXutil.writeLogln("documentocomercialv02:[seudo value changed for attri]"+"AlbComPre");
               GXutil.writeLogRaw("Old: ",Z21AlbComPre);
               GXutil.writeLogRaw("Current: ",T01PR2_A21AlbComPre[0]);
            }
            if ( GXutil.strcmp(Z5010AlbComProd, T01PR2_A5010AlbComProd[0]) != 0 )
            {
               GXutil.writeLogln("documentocomercialv02:[seudo value changed for attri]"+"AlbComProd");
               GXutil.writeLogRaw("Old: ",Z5010AlbComProd);
               GXutil.writeLogRaw("Current: ",T01PR2_A5010AlbComProd[0]);
            }
            if ( Z4717AlbComUni != T01PR2_A4717AlbComUni[0] )
            {
               GXutil.writeLogln("documentocomercialv02:[seudo value changed for attri]"+"AlbComUni");
               GXutil.writeLogRaw("Old: ",Z4717AlbComUni);
               GXutil.writeLogRaw("Current: ",T01PR2_A4717AlbComUni[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLALCOM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1PR2( )
   {
      beforeValidate1PR2( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1PR2( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1PR2( 0) ;
         checkOptimisticConcurrency1PR2( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1PR2( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1PR2( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01PR40 */
                  pr_default.execute(34, new Object[] {Integer.valueOf(A14AlbComCod), Short.valueOf(A20AlbComLin), Integer.valueOf(A10355AlbComHd), Byte.valueOf(A10356ALbComR), A10357AlbComP, A15AlbComDsc, A10806AlbComDc2, A13AlbComCnt, A21AlbComPre, A5010AlbComProd, A396EmprCod, Byte.valueOf(A4717AlbComUni)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALCOM");
                  if ( (pr_default.getStatus(34) == 1) )
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
            load1PR2( ) ;
         }
         endLevel1PR2( ) ;
      }
      closeExtendedTableCursors1PR2( ) ;
   }

   public void update1PR2( )
   {
      beforeValidate1PR2( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1PR2( ) ;
      }
      if ( ( nIsMod_2 != 0 ) || ( nIsDirty_2 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1PR2( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1PR2( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1PR2( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01PR41 */
                     pr_default.execute(35, new Object[] {Integer.valueOf(A10355AlbComHd), Byte.valueOf(A10356ALbComR), A10357AlbComP, A15AlbComDsc, A10806AlbComDc2, A13AlbComCnt, A21AlbComPre, A5010AlbComProd, Byte.valueOf(A4717AlbComUni), A396EmprCod, Integer.valueOf(A14AlbComCod), Short.valueOf(A20AlbComLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALCOM");
                     if ( (pr_default.getStatus(35) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLALCOM"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1PR2( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1PR2( ) ;
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
            endLevel1PR2( ) ;
         }
      }
      closeExtendedTableCursors1PR2( ) ;
   }

   public void deferredUpdate1PR2( )
   {
   }

   public void delete1PR2( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1PR2( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1PR2( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1PR2( ) ;
         afterConfirm1PR2( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1PR2( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01PR42 */
               pr_default.execute(36, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod), Short.valueOf(A20AlbComLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALCOM");
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
      sMode2 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1PR2( ) ;
      Gx_mode = sMode2 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1PR2( )
   {
      standaloneModal1PR2( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01PR43 */
         pr_default.execute(37, new Object[] {A396EmprCod, Byte.valueOf(A4717AlbComUni)});
         A5144AlbUcoDsc = T01PR43_A5144AlbUcoDsc[0] ;
         n5144AlbUcoDsc = T01PR43_n5144AlbUcoDsc[0] ;
         pr_default.close(37);
         A3914AlbCImpL = A21AlbComPre.multiply(A13AlbComCnt) ;
         A12AlbCImpLin = GXutil.roundDecimal( A3914AlbCImpL, 2) ;
         if ( isIns( )  )
         {
            A18AlbComImp = O18AlbComImp.add(A12AlbCImpLin) ;
            n18AlbComImp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A18AlbComImp = O18AlbComImp.add(A12AlbCImpLin).subtract(O12AlbCImpLin) ;
               n18AlbComImp = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A18AlbComImp = O18AlbComImp.subtract(O12AlbCImpLin) ;
                  n18AlbComImp = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
               }
            }
         }
      }
   }

   public void endLevel1PR2( )
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

   public void scanStart1PR2( )
   {
      /* Scan By routine */
      /* Using cursor T01PR44 */
      pr_default.execute(38, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
      RcdFound2 = (short)(0) ;
      if ( (pr_default.getStatus(38) != 101) )
      {
         RcdFound2 = (short)(1) ;
         A20AlbComLin = T01PR44_A20AlbComLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1PR2( )
   {
      /* Scan next routine */
      pr_default.readNext(38);
      RcdFound2 = (short)(0) ;
      if ( (pr_default.getStatus(38) != 101) )
      {
         RcdFound2 = (short)(1) ;
         A20AlbComLin = T01PR44_A20AlbComLin[0] ;
      }
   }

   public void scanEnd1PR2( )
   {
      pr_default.close(38);
   }

   public void afterConfirm1PR2( )
   {
      /* After Confirm Rules */
      if ( ! ( ( A4717AlbComUni == 0 ) || ( A4717AlbComUni == 1 ) || ( A4717AlbComUni == 2 ) || ( A4717AlbComUni == 3 ) ) && true /* After */ )
      {
         GXCCtl = "ALBCOMUNI_" + sGXsfl_113_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Campo Unidad erroneo. Un=1,Kg=2,Mt=3,-=0", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbComUni_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert1PR2( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1PR2( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1PR2( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1PR2( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1PR2( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1PR2( )
   {
      edtAlbComLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComLin_Enabled), 5, 0), !bGXsfl_113_Refreshing);
      edtAlbComDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComDsc_Enabled), 5, 0), !bGXsfl_113_Refreshing);
      edtAlbComDc2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComDc2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComDc2_Enabled), 5, 0), !bGXsfl_113_Refreshing);
      edtAlbComUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComUni_Enabled), 5, 0), !bGXsfl_113_Refreshing);
      edtAlbUcoDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbUcoDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbUcoDsc_Enabled), 5, 0), !bGXsfl_113_Refreshing);
      edtAlbComCnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComCnt_Enabled), 5, 0), !bGXsfl_113_Refreshing);
      edtAlbComPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComPre_Enabled), 5, 0), !bGXsfl_113_Refreshing);
      edtAlbCImpLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbCImpLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCImpLin_Enabled), 5, 0), !bGXsfl_113_Refreshing);
      edtAlbCImpL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbCImpL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCImpL_Enabled), 5, 0), !bGXsfl_113_Refreshing);
      edtAlbComHd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComHd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComHd_Enabled), 5, 0), !bGXsfl_113_Refreshing);
      edtALbComR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtALbComR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtALbComR_Enabled), 5, 0), !bGXsfl_113_Refreshing);
      edtAlbComP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComP_Enabled), 5, 0), !bGXsfl_113_Refreshing);
      edtAlbComProd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComProd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComProd_Enabled), 5, 0), !bGXsfl_113_Refreshing);
   }

   public void send_integrity_lvl_hashes1PR2( )
   {
   }

   public void send_integrity_lvl_hashes1PR1( )
   {
   }

   public void subsflControlProps_1132( )
   {
      edtAlbComLin_Internalname = "ALBCOMLIN_"+sGXsfl_113_idx ;
      edtAlbComDsc_Internalname = "ALBCOMDSC_"+sGXsfl_113_idx ;
      edtAlbComDc2_Internalname = "ALBCOMDC2_"+sGXsfl_113_idx ;
      edtAlbComUni_Internalname = "ALBCOMUNI_"+sGXsfl_113_idx ;
      edtAlbUcoDsc_Internalname = "ALBUCODSC_"+sGXsfl_113_idx ;
      edtAlbComCnt_Internalname = "ALBCOMCNT_"+sGXsfl_113_idx ;
      edtAlbComPre_Internalname = "ALBCOMPRE_"+sGXsfl_113_idx ;
      edtAlbCImpLin_Internalname = "ALBCIMPLIN_"+sGXsfl_113_idx ;
      edtAlbCImpL_Internalname = "ALBCIMPL_"+sGXsfl_113_idx ;
      edtAlbComHd_Internalname = "ALBCOMHD_"+sGXsfl_113_idx ;
      edtALbComR_Internalname = "ALBCOMR_"+sGXsfl_113_idx ;
      edtAlbComP_Internalname = "ALBCOMP_"+sGXsfl_113_idx ;
      edtAlbComProd_Internalname = "ALBCOMPROD_"+sGXsfl_113_idx ;
   }

   public void subsflControlProps_fel_1132( )
   {
      edtAlbComLin_Internalname = "ALBCOMLIN_"+sGXsfl_113_fel_idx ;
      edtAlbComDsc_Internalname = "ALBCOMDSC_"+sGXsfl_113_fel_idx ;
      edtAlbComDc2_Internalname = "ALBCOMDC2_"+sGXsfl_113_fel_idx ;
      edtAlbComUni_Internalname = "ALBCOMUNI_"+sGXsfl_113_fel_idx ;
      edtAlbUcoDsc_Internalname = "ALBUCODSC_"+sGXsfl_113_fel_idx ;
      edtAlbComCnt_Internalname = "ALBCOMCNT_"+sGXsfl_113_fel_idx ;
      edtAlbComPre_Internalname = "ALBCOMPRE_"+sGXsfl_113_fel_idx ;
      edtAlbCImpLin_Internalname = "ALBCIMPLIN_"+sGXsfl_113_fel_idx ;
      edtAlbCImpL_Internalname = "ALBCIMPL_"+sGXsfl_113_fel_idx ;
      edtAlbComHd_Internalname = "ALBCOMHD_"+sGXsfl_113_fel_idx ;
      edtALbComR_Internalname = "ALBCOMR_"+sGXsfl_113_fel_idx ;
      edtAlbComP_Internalname = "ALBCOMP_"+sGXsfl_113_fel_idx ;
      edtAlbComProd_Internalname = "ALBCOMPROD_"+sGXsfl_113_fel_idx ;
   }

   public void addRow1PR2( )
   {
      nGXsfl_113_idx = (int)(nGXsfl_113_idx+1) ;
      sGXsfl_113_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_113_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1132( ) ;
      sendRow1PR2( ) ;
   }

   public void sendRow1PR2( )
   {
      Gridlevel_albcomRow = GXWebRow.GetNew(context) ;
      if ( subGridlevel_albcom_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_albcom_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_albcom_Class, "") != 0 )
         {
            subGridlevel_albcom_Linesclass = subGridlevel_albcom_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_albcom_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_albcom_Backstyle = (byte)(0) ;
         subGridlevel_albcom_Backcolor = subGridlevel_albcom_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_albcom_Class, "") != 0 )
         {
            subGridlevel_albcom_Linesclass = subGridlevel_albcom_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_albcom_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_albcom_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_albcom_Class, "") != 0 )
         {
            subGridlevel_albcom_Linesclass = subGridlevel_albcom_Class+"Odd" ;
         }
         subGridlevel_albcom_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_albcom_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_albcom_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_113_idx) % (2))) == 0 )
         {
            subGridlevel_albcom_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_albcom_Class, "") != 0 )
            {
               subGridlevel_albcom_Linesclass = subGridlevel_albcom_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_albcom_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_albcom_Class, "") != 0 )
            {
               subGridlevel_albcom_Linesclass = subGridlevel_albcom_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_2_" + sGXsfl_113_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 114,'',false,'" + sGXsfl_113_idx + "',113)\"" ;
      ROClassString = "TagColumn" ;
      Gridlevel_albcomRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComLin_Internalname,GXutil.ltrim( localUtil.ntoc( A20AlbComLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A20AlbComLin), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,114);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComLin_Jsonclick,Integer.valueOf(0),"TagColumn","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbComLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(113),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_2_" + sGXsfl_113_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 115,'',false,'" + sGXsfl_113_idx + "',113)\"" ;
      ROClassString = "TagColumn" ;
      Gridlevel_albcomRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComDsc_Internalname,GXutil.rtrim( A15AlbComDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,115);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComDsc_Jsonclick,Integer.valueOf(0),"TagColumn","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbComDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(113),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_2_" + sGXsfl_113_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 116,'',false,'" + sGXsfl_113_idx + "',113)\"" ;
      ROClassString = "TagColumn" ;
      Gridlevel_albcomRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComDc2_Internalname,GXutil.rtrim( A10806AlbComDc2),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,116);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComDc2_Jsonclick,Integer.valueOf(0),"TagColumn","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbComDc2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(113),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_2_" + sGXsfl_113_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 117,'',false,'" + sGXsfl_113_idx + "',113)\"" ;
      ROClassString = "TagColumn" ;
      Gridlevel_albcomRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComUni_Internalname,GXutil.ltrim( localUtil.ntoc( A4717AlbComUni, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbComUni_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4717AlbComUni), "9") : localUtil.format( DecimalUtil.doubleToDec(A4717AlbComUni), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,117);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComUni_Jsonclick,Integer.valueOf(0),"TagColumn","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbComUni_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(113),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"",edtAlbComUni_Horizontalalignment,Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_albcomRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbUcoDsc_Internalname,GXutil.rtrim( A5144AlbUcoDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbUcoDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbUcoDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(113),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_2_" + sGXsfl_113_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 119,'',false,'" + sGXsfl_113_idx + "',113)\"" ;
      ROClassString = "TagColumn" ;
      Gridlevel_albcomRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComCnt_Internalname,GXutil.ltrim( localUtil.ntoc( A13AlbComCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbComCnt_Enabled!=0) ? localUtil.format( A13AlbComCnt, "ZZZZZ9.99") : localUtil.format( A13AlbComCnt, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,119);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComCnt_Jsonclick,Integer.valueOf(0),"TagColumn","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbComCnt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(113),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_2_" + sGXsfl_113_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 120,'',false,'" + sGXsfl_113_idx + "',113)\"" ;
      ROClassString = "TagColumn" ;
      Gridlevel_albcomRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComPre_Internalname,GXutil.ltrim( localUtil.ntoc( A21AlbComPre, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbComPre_Enabled!=0) ? localUtil.format( A21AlbComPre, "ZZZZZZ9.999") : localUtil.format( A21AlbComPre, "ZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,120);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComPre_Jsonclick,Integer.valueOf(0),"TagColumn","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbComPre_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(113),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "TagColumn" ;
      Gridlevel_albcomRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbCImpLin_Internalname,GXutil.ltrim( localUtil.ntoc( A12AlbCImpLin, (byte)(14), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbCImpLin_Enabled!=0) ? localUtil.format( A12AlbCImpLin, "ZZZZZZZZZZ9.99") : localUtil.format( A12AlbCImpLin, "ZZZZZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbCImpLin_Jsonclick,Integer.valueOf(0),"TagColumn","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbCImpLin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(113),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_albcomRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbCImpL_Internalname,GXutil.ltrim( localUtil.ntoc( A3914AlbCImpL, (byte)(16), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbCImpL_Enabled!=0) ? localUtil.format( A3914AlbCImpL, "ZZZZZZZZZ9.99999") : localUtil.format( A3914AlbCImpL, "ZZZZZZZZZ9.99999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbCImpL_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbCImpL_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(113),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_albcomRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComHd_Internalname,GXutil.ltrim( localUtil.ntoc( A10355AlbComHd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbComHd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10355AlbComHd), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10355AlbComHd), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComHd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbComHd_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(113),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_albcomRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtALbComR_Internalname,GXutil.ltrim( localUtil.ntoc( A10356ALbComR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtALbComR_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10356ALbComR), "9") : localUtil.format( DecimalUtil.doubleToDec(A10356ALbComR), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtALbComR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtALbComR_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(113),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_albcomRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComP_Internalname,GXutil.rtrim( A10357AlbComP),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbComP_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(113),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_albcomRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComProd_Internalname,GXutil.rtrim( A5010AlbComProd),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComProd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbComProd_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(113),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_albcomRow);
      send_integrity_lvl_hashes1PR2( ) ;
      GXCCtl = "Z20AlbComLin_" + sGXsfl_113_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z20AlbComLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10355AlbComHd_" + sGXsfl_113_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10355AlbComHd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10356ALbComR_" + sGXsfl_113_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10356ALbComR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10357AlbComP_" + sGXsfl_113_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10357AlbComP));
      GXCCtl = "Z15AlbComDsc_" + sGXsfl_113_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z15AlbComDsc));
      GXCCtl = "Z10806AlbComDc2_" + sGXsfl_113_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10806AlbComDc2));
      GXCCtl = "Z13AlbComCnt_" + sGXsfl_113_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13AlbComCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z21AlbComPre_" + sGXsfl_113_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z21AlbComPre, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5010AlbComProd_" + sGXsfl_113_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z5010AlbComProd));
      GXCCtl = "Z4717AlbComUni_" + sGXsfl_113_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4717AlbComUni, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O12AlbCImpLin_" + sGXsfl_113_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O12AlbCImpLin, (byte)(14), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_2_" + sGXsfl_113_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_2_" + sGXsfl_113_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_2_" + sGXsfl_113_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_113_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_113_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV25TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV25TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_113_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV20EmprCod));
      GXCCtl = "vALBCOMCOD_" + sGXsfl_113_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV23AlbComCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vALBCOMPRI_" + sGXsfl_113_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV31AlbComPri));
      GXCCtl = "EMPRCOD_" + sGXsfl_113_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      GXCCtl = "vCLICOD_" + sGXsfl_113_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV39CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMLIN_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMDSC_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMDC2_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComDc2_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMUNI_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComUni_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMUNI_"+sGXsfl_113_idx+"Horizontalalignment", GXutil.rtrim( edtAlbComUni_Horizontalalignment));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBUCODSC_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbUcoDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMCNT_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMPRE_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCIMPLIN_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbCImpLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCIMPL_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbCImpL_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMHD_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComHd_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMR_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtALbComR_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMP_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComP_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMPROD_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComProd_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_albcomContainer.AddRow(Gridlevel_albcomRow);
   }

   public void readRow1PR2( )
   {
      nGXsfl_113_idx = (int)(nGXsfl_113_idx+1) ;
      sGXsfl_113_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_113_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1132( ) ;
      edtAlbComLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMLIN_"+sGXsfl_113_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbComDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMDSC_"+sGXsfl_113_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbComDc2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMDC2_"+sGXsfl_113_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbComUni_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMUNI_"+sGXsfl_113_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbComUni_Horizontalalignment = httpContext.cgiGet( "ALBCOMUNI_"+sGXsfl_113_idx+"Horizontalalignment") ;
      edtAlbUcoDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBUCODSC_"+sGXsfl_113_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbComCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMCNT_"+sGXsfl_113_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbComPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMPRE_"+sGXsfl_113_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbCImpLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCIMPLIN_"+sGXsfl_113_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbCImpL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCIMPL_"+sGXsfl_113_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbComHd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMHD_"+sGXsfl_113_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtALbComR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMR_"+sGXsfl_113_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbComP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMP_"+sGXsfl_113_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbComProd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMPROD_"+sGXsfl_113_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbComLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbComLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "ALBCOMLIN_" + sGXsfl_113_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbComLin_Internalname ;
         wbErr = true ;
         A20AlbComLin = (short)(0) ;
      }
      else
      {
         A20AlbComLin = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbComLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A15AlbComDsc = httpContext.cgiGet( edtAlbComDsc_Internalname) ;
      A10806AlbComDc2 = httpContext.cgiGet( edtAlbComDc2_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbComUni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbComUni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "ALBCOMUNI_" + sGXsfl_113_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbComUni_Internalname ;
         wbErr = true ;
         A4717AlbComUni = (byte)(0) ;
      }
      else
      {
         A4717AlbComUni = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbComUni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A5144AlbUcoDsc = httpContext.cgiGet( edtAlbUcoDsc_Internalname) ;
      n5144AlbUcoDsc = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbComCnt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbComCnt_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "ALBCOMCNT_" + sGXsfl_113_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbComCnt_Internalname ;
         wbErr = true ;
         A13AlbComCnt = DecimalUtil.ZERO ;
      }
      else
      {
         A13AlbComCnt = localUtil.ctond( httpContext.cgiGet( edtAlbComCnt_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbComPre_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbComPre_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "ALBCOMPRE_" + sGXsfl_113_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbComPre_Internalname ;
         wbErr = true ;
         A21AlbComPre = DecimalUtil.ZERO ;
      }
      else
      {
         A21AlbComPre = localUtil.ctond( httpContext.cgiGet( edtAlbComPre_Internalname)) ;
      }
      A12AlbCImpLin = localUtil.ctond( httpContext.cgiGet( edtAlbCImpLin_Internalname)) ;
      A3914AlbCImpL = localUtil.ctond( httpContext.cgiGet( edtAlbCImpL_Internalname)) ;
      A10355AlbComHd = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbComHd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A10356ALbComR = (byte)(localUtil.ctol( httpContext.cgiGet( edtALbComR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A10357AlbComP = httpContext.cgiGet( edtAlbComP_Internalname) ;
      A5010AlbComProd = httpContext.cgiGet( edtAlbComProd_Internalname) ;
      GXCCtl = "Z20AlbComLin_" + sGXsfl_113_idx ;
      Z20AlbComLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10355AlbComHd_" + sGXsfl_113_idx ;
      Z10355AlbComHd = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10356ALbComR_" + sGXsfl_113_idx ;
      Z10356ALbComR = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10357AlbComP_" + sGXsfl_113_idx ;
      Z10357AlbComP = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z15AlbComDsc_" + sGXsfl_113_idx ;
      Z15AlbComDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10806AlbComDc2_" + sGXsfl_113_idx ;
      Z10806AlbComDc2 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13AlbComCnt_" + sGXsfl_113_idx ;
      Z13AlbComCnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z21AlbComPre_" + sGXsfl_113_idx ;
      Z21AlbComPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z5010AlbComProd_" + sGXsfl_113_idx ;
      Z5010AlbComProd = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4717AlbComUni_" + sGXsfl_113_idx ;
      Z4717AlbComUni = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O12AlbCImpLin_" + sGXsfl_113_idx ;
      O12AlbCImpLin = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_2_" + sGXsfl_113_idx ;
      nRcdDeleted_2 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_2_" + sGXsfl_113_idx ;
      nRcdExists_2 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_2_" + sGXsfl_113_idx ;
      nIsMod_2 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "vCLICOD_" + sGXsfl_113_idx ;
      AV39CliCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "vEMPRCOD_" + sGXsfl_113_idx ;
      AV20EmprCod = httpContext.cgiGet( GXCCtl) ;
   }

   public void assign_properties_default( )
   {
      defedtAlbComProd_Enabled = edtAlbComProd_Enabled ;
      defedtAlbComP_Enabled = edtAlbComP_Enabled ;
      defedtALbComR_Enabled = edtALbComR_Enabled ;
      defedtAlbComHd_Enabled = edtAlbComHd_Enabled ;
      defedtAlbCImpL_Enabled = edtAlbCImpL_Enabled ;
      defedtAlbUcoDsc_Enabled = edtAlbUcoDsc_Enabled ;
      defedtAlbComLin_Enabled = edtAlbComLin_Enabled ;
   }

   public void confirmValues1PR0( )
   {
      nGXsfl_113_idx = 0 ;
      sGXsfl_113_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_113_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1132( ) ;
      while ( nGXsfl_113_idx < nRC_GXsfl_113 )
      {
         nGXsfl_113_idx = (int)(nGXsfl_113_idx+1) ;
         sGXsfl_113_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_113_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1132( ) ;
         httpContext.changePostValue( "Z20AlbComLin_"+sGXsfl_113_idx, httpContext.cgiGet( "ZT_"+"Z20AlbComLin_"+sGXsfl_113_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z20AlbComLin_"+sGXsfl_113_idx) ;
         httpContext.changePostValue( "Z10355AlbComHd_"+sGXsfl_113_idx, httpContext.cgiGet( "ZT_"+"Z10355AlbComHd_"+sGXsfl_113_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10355AlbComHd_"+sGXsfl_113_idx) ;
         httpContext.changePostValue( "Z10356ALbComR_"+sGXsfl_113_idx, httpContext.cgiGet( "ZT_"+"Z10356ALbComR_"+sGXsfl_113_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10356ALbComR_"+sGXsfl_113_idx) ;
         httpContext.changePostValue( "Z10357AlbComP_"+sGXsfl_113_idx, httpContext.cgiGet( "ZT_"+"Z10357AlbComP_"+sGXsfl_113_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10357AlbComP_"+sGXsfl_113_idx) ;
         httpContext.changePostValue( "Z15AlbComDsc_"+sGXsfl_113_idx, httpContext.cgiGet( "ZT_"+"Z15AlbComDsc_"+sGXsfl_113_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z15AlbComDsc_"+sGXsfl_113_idx) ;
         httpContext.changePostValue( "Z10806AlbComDc2_"+sGXsfl_113_idx, httpContext.cgiGet( "ZT_"+"Z10806AlbComDc2_"+sGXsfl_113_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10806AlbComDc2_"+sGXsfl_113_idx) ;
         httpContext.changePostValue( "Z13AlbComCnt_"+sGXsfl_113_idx, httpContext.cgiGet( "ZT_"+"Z13AlbComCnt_"+sGXsfl_113_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13AlbComCnt_"+sGXsfl_113_idx) ;
         httpContext.changePostValue( "Z21AlbComPre_"+sGXsfl_113_idx, httpContext.cgiGet( "ZT_"+"Z21AlbComPre_"+sGXsfl_113_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z21AlbComPre_"+sGXsfl_113_idx) ;
         httpContext.changePostValue( "Z5010AlbComProd_"+sGXsfl_113_idx, httpContext.cgiGet( "ZT_"+"Z5010AlbComProd_"+sGXsfl_113_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5010AlbComProd_"+sGXsfl_113_idx) ;
         httpContext.changePostValue( "Z4717AlbComUni_"+sGXsfl_113_idx, httpContext.cgiGet( "ZT_"+"Z4717AlbComUni_"+sGXsfl_113_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4717AlbComUni_"+sGXsfl_113_idx) ;
      }
      httpContext.changePostValue( "O12AlbCImpLin", httpContext.cgiGet( "T12AlbCImpLin")) ;
      httpContext.deletePostValue( "T12AlbCImpLin") ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.documentocomercialv02", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV20EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV23AlbComCod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV31AlbComPri))}, new String[] {"Gx_mode","EmprCod","AlbComCod","AlbComPri"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"DocumentoComercialv02");
      forbiddenHiddens.add("AlbComFs", localUtil.format( A10013AlbComFs, "99/99/99 99:99:99"));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV55Pgmname, "")));
      forbiddenHiddens.add("AlbComEst", localUtil.format( DecimalUtil.doubleToDec(A16AlbComEst), "9"));
      forbiddenHiddens.add("AlbComEso", localUtil.format( DecimalUtil.doubleToDec(A1783AlbComEso), "9"));
      forbiddenHiddens.add("AlcDivTCod", GXutil.rtrim( localUtil.format( A3095AlcDivTCod, "")));
      forbiddenHiddens.add("AlbComFd", GXutil.rtrim( localUtil.format( A10014AlbComFd, "")));
      forbiddenHiddens.add("AlbComFdD", GXutil.rtrim( localUtil.format( A10015AlbComFdD, "")));
      forbiddenHiddens.add("AlbCSec", GXutil.rtrim( localUtil.format( A3094AlbCSec, "")));
      forbiddenHiddens.add("AlbComSt", GXutil.rtrim( localUtil.format( A10738AlbComSt, "")));
      forbiddenHiddens.add("AlbComEAT", localUtil.format( DecimalUtil.doubleToDec(A10739AlbComEAT), "9"));
      forbiddenHiddens.add("AlbComID", GXutil.rtrim( localUtil.format( A10740AlbComID, "")));
      forbiddenHiddens.add("AlbComAT", GXutil.rtrim( localUtil.format( A10764AlbComAT, "")));
      forbiddenHiddens.add("AlcIvaCod", GXutil.rtrim( localUtil.format( A5143AlcIvaCod, "@!")));
      forbiddenHiddens.add("AlbCTrNm", GXutil.rtrim( localUtil.format( A11719AlbCTrNm, "")));
      forbiddenHiddens.add("AlbCTrDm", GXutil.rtrim( localUtil.format( A11720AlbCTrDm, "")));
      forbiddenHiddens.add("AlbCTrNc", GXutil.rtrim( localUtil.format( A11721AlbCTrNc, "")));
      forbiddenHiddens.add("AlbComATCU", GXutil.rtrim( localUtil.format( A14248AlbComATCU, "")));
      forbiddenHiddens.add("AlbComSerA", GXutil.rtrim( localUtil.format( A14249AlbComSerA, "")));
      forbiddenHiddens.add("AlbComTipA", GXutil.rtrim( localUtil.format( A14250AlbComTipA, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("documentocomercialv02:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14AlbComCod", GXutil.ltrim( localUtil.ntoc( Z14AlbComCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4829AlbComHor", localUtil.ttoc( Z4829AlbComHor, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z17AlbComFch", localUtil.dtoc( Z17AlbComFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z22AlbComPri", GXutil.rtrim( Z22AlbComPri));
      app.GxWebStd.gx_hidden_field( httpContext, "Z16AlbComEst", GXutil.ltrim( localUtil.ntoc( Z16AlbComEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z19AlbComLiC", GXutil.ltrim( localUtil.ntoc( Z19AlbComLiC, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1783AlbComEso", GXutil.ltrim( localUtil.ntoc( Z1783AlbComEso, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3095AlcDivTCod", GXutil.rtrim( Z3095AlcDivTCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4830AlbComMat", GXutil.rtrim( Z4830AlbComMat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5142AlcDomEnv", GXutil.ltrim( localUtil.ntoc( Z5142AlcDomEnv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "O19AlbComLiC", GXutil.ltrim( localUtil.ntoc( O19AlbComLiC, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O18AlbComImp", GXutil.ltrim( localUtil.ntoc( O18AlbComImp, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O252CliCod", GXutil.ltrim( localUtil.ntoc( O252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O22AlbComPri", GXutil.rtrim( O22AlbComPri));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_113", GXutil.ltrim( localUtil.ntoc( nGXsfl_113_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N3111AlcDivCod", GXutil.ltrim( localUtil.ntoc( A3111AlcDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N840TrnCod", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICOD_DATA", AV43CliCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICOD_DATA", AV43CliCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCOD_DATA", AV40TrnCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCOD_DATA", AV40TrnCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vALBCOMUNI_DATA", AV52AlbComUni_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vALBCOMUNI_DATA", AV52AlbComUni_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV25TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV25TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV25TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV20EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBCOMCOD", GXutil.ltrim( localUtil.ntoc( AV23AlbComCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBCOMCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV23AlbComCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_CLICOD", GXutil.ltrim( localUtil.ntoc( AV27Insert_CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_ALCDIVCOD", GXutil.ltrim( localUtil.ntoc( AV28Insert_AlcDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALCDIVCOD", GXutil.ltrim( localUtil.ntoc( A3111AlcDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_TRNCOD", GXutil.ltrim( localUtil.ntoc( AV29Insert_TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBCOMPRI", GXutil.rtrim( AV31AlbComPri));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBCOMPRI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV31AlbComPri, "9"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONTCOD", GXutil.rtrim( AV32ContCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDALBCOMPRI", GXutil.rtrim( AV36oldAlbComPri));
      app.GxWebStd.gx_hidden_field( httpContext, "vGUIREMCLI", GXutil.ltrim( localUtil.ntoc( AV37guiremcli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMST", GXutil.rtrim( A10738AlbComSt));
      app.GxWebStd.gx_hidden_field( httpContext, "ALCDIVTCOD", GXutil.rtrim( A3095AlcDivTCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_F", AV35Msg_f);
      app.GxWebStd.gx_hidden_field( httpContext, "vALBLAST", GXutil.ltrim( localUtil.ntoc( AV34AlbLast, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFCH", localUtil.dtoc( AV33Fch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vFIRMAD", GXutil.ltrim( localUtil.ntoc( AV7FirmaD, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCERNUM", GXutil.ltrim( localUtil.ntoc( AV17cernum, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_ERRAT", AV18Msg_errAT);
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMEST", GXutil.ltrim( localUtil.ntoc( A16AlbComEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FINDDOMENV", GXutil.ltrim( localUtil.ntoc( A13739findDomEnv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCAMBIOP", GXutil.ltrim( localUtil.ntoc( AV16CambioP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMDESC", GXutil.rtrim( AV54Pgmdesc));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMSERA", GXutil.rtrim( A14249AlbComSerA));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMTIPA", GXutil.rtrim( A14250AlbComTipA));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMLIC", GXutil.ltrim( localUtil.ntoc( A19AlbComLiC, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMESO", GXutil.ltrim( localUtil.ntoc( A1783AlbComEso, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMFD", GXutil.rtrim( A10014AlbComFd));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMFDD", GXutil.rtrim( A10015AlbComFdD));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCSEC", GXutil.rtrim( A3094AlbCSec));
      app.GxWebStd.gx_hidden_field( httpContext, "ALCIVACOD", GXutil.rtrim( A5143AlcIvaCod));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCTRNM", GXutil.rtrim( A11719AlbCTrNm));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCTRDM", GXutil.rtrim( A11720AlbCTrDm));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCTRNC", GXutil.rtrim( A11721AlbCTrNc));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIDIVTRA", GXutil.rtrim( A3091CliDivTra));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIDIVCOD", GXutil.ltrim( localUtil.ntoc( A3140CliDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALCDIVABR", GXutil.rtrim( A3112AlcDivAbr));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMIMP", GXutil.ltrim( localUtil.ntoc( A18AlbComImp, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Objectcall", GXutil.rtrim( Combo_clicod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Cls", GXutil.rtrim( Combo_clicod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Selectedvalue_set", GXutil.rtrim( Combo_clicod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Enabled", GXutil.booltostr( Combo_clicod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Emptyitem", GXutil.booltostr( Combo_clicod_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRNCOD_Objectcall", GXutil.rtrim( Combo_trncod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRNCOD_Cls", GXutil.rtrim( Combo_trncod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRNCOD_Selectedvalue_set", GXutil.rtrim( Combo_trncod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRNCOD_Enabled", GXutil.booltostr( Combo_trncod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRNCOD_Emptyitemtext", GXutil.rtrim( Combo_trncod_Emptyitemtext));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DATAMONJS_Objectcall", GXutil.rtrim( Datamonjs_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DATAMONJS_Enabled", GXutil.booltostr( Datamonjs_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBCOMUNI_Objectcall", GXutil.rtrim( Combo_albcomuni_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBCOMUNI_Cls", GXutil.rtrim( Combo_albcomuni_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBCOMUNI_Enabled", GXutil.booltostr( Combo_albcomuni_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBCOMUNI_Titlecontrolidtoreplace", GXutil.rtrim( Combo_albcomuni_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBCOMUNI_Isgriditem", GXutil.booltostr( Combo_albcomuni_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBCOMUNI_Emptyitem", GXutil.booltostr( Combo_albcomuni_Emptyitem));
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
      return formatLink("app.documentocomercialv02", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV20EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV23AlbComCod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV31AlbComPri))}, new String[] {"Gx_mode","EmprCod","AlbComCod","AlbComPri"})  ;
   }

   public String getPgmname( )
   {
      return "DocumentoComercialv02" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Documento Comercial (v02)", "") ;
   }

   public void initializeNonKey1PR1( )
   {
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A840TrnCod = (short)(0) ;
      n840TrnCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      A4829AlbComHor = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A4829AlbComHor", localUtil.ttoc( A4829AlbComHor, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV35Msg_f = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Msg_f", AV35Msg_f);
      AV34AlbLast = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34AlbLast", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34AlbLast), 8, 0));
      AV33Fch = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Fch", localUtil.format(AV33Fch, "99/99/99"));
      AV36oldAlbComPri = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36oldAlbComPri", AV36oldAlbComPri);
      AV37guiremcli = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37guiremcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37guiremcli), 6, 0));
      A13739findDomEnv = (byte)(0) ;
      n13739findDomEnv = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13739findDomEnv", GXutil.str( A13739findDomEnv, 1, 0));
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
      A4830AlbComMat = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4830AlbComMat", A4830AlbComMat);
      A5142AlcDomEnv = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5142AlcDomEnv", GXutil.str( A5142AlcDomEnv, 1, 0));
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
      A22AlbComPri = AV31AlbComPri ;
      httpContext.ajax_rsp_assign_attri("", false, "A22AlbComPri", A22AlbComPri);
      A3095AlcDivTCod = httpContext.getMessage( "E", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "A3095AlcDivTCod", A3095AlcDivTCod);
      A10013AlbComFs = GXutil.serverNow( context, remoteHandle, pr_default) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10013AlbComFs", localUtil.ttoc( A10013AlbComFs, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A10738AlbComSt = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "A10738AlbComSt", A10738AlbComSt);
      A10739AlbComEAT = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10739AlbComEAT", GXutil.str( A10739AlbComEAT, 1, 0));
      A10740AlbComID = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "A10740AlbComID", A10740AlbComID);
      A10764AlbComAT = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "A10764AlbComAT", A10764AlbComAT);
      O19AlbComLiC = A19AlbComLiC ;
      httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
      O18AlbComImp = A18AlbComImp ;
      n18AlbComImp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
      O252CliCod = A252CliCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      O22AlbComPri = A22AlbComPri ;
      httpContext.ajax_rsp_assign_attri("", false, "A22AlbComPri", A22AlbComPri);
      Z4829AlbComHor = GXutil.resetTime( GXutil.nullDate() );
      Z17AlbComFch = GXutil.nullDate() ;
      Z22AlbComPri = "" ;
      Z16AlbComEst = (byte)(0) ;
      Z19AlbComLiC = (short)(0) ;
      Z1783AlbComEso = (byte)(0) ;
      Z3095AlcDivTCod = "" ;
      Z4830AlbComMat = "" ;
      Z5142AlcDomEnv = (byte)(0) ;
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

   public void initAll1PR1( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A14AlbComCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
      initializeNonKey1PR1( ) ;
   }

   public void standaloneModalInsert( )
   {
      A3111AlcDivCod = i3111AlcDivCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A3111AlcDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3111AlcDivCod), 2, 0));
      A10013AlbComFs = i10013AlbComFs ;
      httpContext.ajax_rsp_assign_attri("", false, "A10013AlbComFs", localUtil.ttoc( A10013AlbComFs, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
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
      A14248AlbComATCU = i14248AlbComATCU ;
      httpContext.ajax_rsp_assign_attri("", false, "A14248AlbComATCU", A14248AlbComATCU);
      A14249AlbComSerA = i14249AlbComSerA ;
      httpContext.ajax_rsp_assign_attri("", false, "A14249AlbComSerA", A14249AlbComSerA);
      A14250AlbComTipA = i14250AlbComTipA ;
      httpContext.ajax_rsp_assign_attri("", false, "A14250AlbComTipA", A14250AlbComTipA);
   }

   public void initializeNonKey1PR2( )
   {
      A12AlbCImpLin = DecimalUtil.ZERO ;
      A3914AlbCImpL = DecimalUtil.ZERO ;
      A15AlbComDsc = "" ;
      A10806AlbComDc2 = "" ;
      A4717AlbComUni = (byte)(0) ;
      A5144AlbUcoDsc = "" ;
      n5144AlbUcoDsc = false ;
      A13AlbComCnt = DecimalUtil.ZERO ;
      A21AlbComPre = DecimalUtil.ZERO ;
      A5010AlbComProd = "" ;
      A10355AlbComHd = 0 ;
      A10356ALbComR = (byte)(0) ;
      A10357AlbComP = " " ;
      O12AlbCImpLin = A12AlbCImpLin ;
      Z10355AlbComHd = 0 ;
      Z10356ALbComR = (byte)(0) ;
      Z10357AlbComP = "" ;
      Z15AlbComDsc = "" ;
      Z10806AlbComDc2 = "" ;
      Z13AlbComCnt = DecimalUtil.ZERO ;
      Z21AlbComPre = DecimalUtil.ZERO ;
      Z5010AlbComProd = "" ;
      Z4717AlbComUni = (byte)(0) ;
   }

   public void initAll1PR2( )
   {
      A20AlbComLin = (short)(0) ;
      initializeNonKey1PR2( ) ;
   }

   public void standaloneModalInsert1PR2( )
   {
      A19AlbComLiC = i19AlbComLiC ;
      httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
      A10355AlbComHd = i10355AlbComHd ;
      A10356ALbComR = i10356ALbComR ;
      A10357AlbComP = i10357AlbComP ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415112075", true, true);
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
      httpContext.AddJavascriptSource("documentocomercialv02.js", "?202682415112076", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties2( )
   {
      edtAlbComProd_Enabled = defedtAlbComProd_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComProd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComProd_Enabled), 5, 0), !bGXsfl_113_Refreshing);
      edtAlbComP_Enabled = defedtAlbComP_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComP_Enabled), 5, 0), !bGXsfl_113_Refreshing);
      edtALbComR_Enabled = defedtALbComR_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtALbComR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtALbComR_Enabled), 5, 0), !bGXsfl_113_Refreshing);
      edtAlbComHd_Enabled = defedtAlbComHd_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComHd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComHd_Enabled), 5, 0), !bGXsfl_113_Refreshing);
      edtAlbCImpL_Enabled = defedtAlbCImpL_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbCImpL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCImpL_Enabled), 5, 0), !bGXsfl_113_Refreshing);
      edtAlbUcoDsc_Enabled = defedtAlbUcoDsc_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbUcoDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbUcoDsc_Enabled), 5, 0), !bGXsfl_113_Refreshing);
      edtAlbComLin_Enabled = defedtAlbComLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComLin_Enabled), 5, 0), !bGXsfl_113_Refreshing);
   }

   public void startgridcontrol113( )
   {
      Gridlevel_albcomContainer.AddObjectProperty("GridName", "Gridlevel_albcom");
      Gridlevel_albcomContainer.AddObjectProperty("Header", subGridlevel_albcom_Header);
      Gridlevel_albcomContainer.AddObjectProperty("DeleteMethod", "none");
      Gridlevel_albcomContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_albcomContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_albcomContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_albcomContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_albcom_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_albcomContainer.AddObjectProperty("CmpContext", "");
      Gridlevel_albcomContainer.AddObjectProperty("InMasterPage", "false");
      Gridlevel_albcomColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_albcomColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A20AlbComLin, (byte)(3), (byte)(0), ".", "")));
      Gridlevel_albcomColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_albcomContainer.AddColumnProperties(Gridlevel_albcomColumn);
      Gridlevel_albcomColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_albcomColumn.AddObjectProperty("Value", GXutil.rtrim( A15AlbComDsc));
      Gridlevel_albcomColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_albcomContainer.AddColumnProperties(Gridlevel_albcomColumn);
      Gridlevel_albcomColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_albcomColumn.AddObjectProperty("Value", GXutil.rtrim( A10806AlbComDc2));
      Gridlevel_albcomColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComDc2_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_albcomContainer.AddColumnProperties(Gridlevel_albcomColumn);
      Gridlevel_albcomColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_albcomColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4717AlbComUni, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_albcomColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComUni_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_albcomColumn.AddObjectProperty("Horizontalalignment", GXutil.rtrim( edtAlbComUni_Horizontalalignment));
      Gridlevel_albcomContainer.AddColumnProperties(Gridlevel_albcomColumn);
      Gridlevel_albcomColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_albcomColumn.AddObjectProperty("Value", GXutil.rtrim( A5144AlbUcoDsc));
      Gridlevel_albcomColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbUcoDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_albcomContainer.AddColumnProperties(Gridlevel_albcomColumn);
      Gridlevel_albcomColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_albcomColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13AlbComCnt, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_albcomColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_albcomContainer.AddColumnProperties(Gridlevel_albcomColumn);
      Gridlevel_albcomColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_albcomColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A21AlbComPre, (byte)(13), (byte)(5), ".", "")));
      Gridlevel_albcomColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_albcomContainer.AddColumnProperties(Gridlevel_albcomColumn);
      Gridlevel_albcomColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_albcomColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12AlbCImpLin, (byte)(14), (byte)(2), ".", "")));
      Gridlevel_albcomColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbCImpLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_albcomContainer.AddColumnProperties(Gridlevel_albcomColumn);
      Gridlevel_albcomColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_albcomColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3914AlbCImpL, (byte)(16), (byte)(5), ".", "")));
      Gridlevel_albcomColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbCImpL_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_albcomContainer.AddColumnProperties(Gridlevel_albcomColumn);
      Gridlevel_albcomColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_albcomColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10355AlbComHd, (byte)(8), (byte)(0), ".", "")));
      Gridlevel_albcomColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComHd_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_albcomContainer.AddColumnProperties(Gridlevel_albcomColumn);
      Gridlevel_albcomColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_albcomColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10356ALbComR, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_albcomColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtALbComR_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_albcomContainer.AddColumnProperties(Gridlevel_albcomColumn);
      Gridlevel_albcomColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_albcomColumn.AddObjectProperty("Value", GXutil.rtrim( A10357AlbComP));
      Gridlevel_albcomColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComP_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_albcomContainer.AddColumnProperties(Gridlevel_albcomColumn);
      Gridlevel_albcomColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_albcomColumn.AddObjectProperty("Value", GXutil.rtrim( A5010AlbComProd));
      Gridlevel_albcomColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComProd_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_albcomContainer.AddColumnProperties(Gridlevel_albcomColumn);
      Gridlevel_albcomContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_albcom_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_albcomContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_albcom_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_albcomContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_albcom_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_albcomContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_albcom_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_albcomContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_albcom_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_albcomContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_albcom_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_albcomContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_albcom_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      edtAlbComCod_Internalname = "ALBCOMCOD" ;
      edtAlbComFch_Internalname = "ALBCOMFCH" ;
      edtAlbComHor_Internalname = "ALBCOMHOR" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      lblTextblockclicod_Internalname = "TEXTBLOCKCLICOD" ;
      Combo_clicod_Internalname = "COMBO_CLICOD" ;
      edtCliCod_Internalname = "CLICOD" ;
      divTablesplittedclicod_Internalname = "TABLESPLITTEDCLICOD" ;
      lblTextblockalcdomenv_Internalname = "TEXTBLOCKALCDOMENV" ;
      edtAlcDomEnv_Internalname = "ALCDOMENV" ;
      lblPromptclienv_Internalname = "PROMPTCLIENV" ;
      tblTablesearcrroot_Internalname = "TABLESEARCRROOT" ;
      tblTablemergedalcdomenv_Internalname = "TABLEMERGEDALCDOMENV" ;
      divTablesplittedalcdomenv_Internalname = "TABLESPLITTEDALCDOMENV" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      lblTextblocktrncod_Internalname = "TEXTBLOCKTRNCOD" ;
      Combo_trncod_Internalname = "COMBO_TRNCOD" ;
      edtTrnCod_Internalname = "TRNCOD" ;
      divTablesplittedtrncod_Internalname = "TABLESPLITTEDTRNCOD" ;
      edtAlbComMat_Internalname = "ALBCOMMAT" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      edtAlbComFs_Internalname = "ALBCOMFS" ;
      edtAlbComATCU_Internalname = "ALBCOMATCU" ;
      cmbAlbComEAT.setInternalname( "ALBCOMEAT" );
      edtAlbComID_Internalname = "ALBCOMID" ;
      edtAlbComAT_Internalname = "ALBCOMAT" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtAlbComLin_Internalname = "ALBCOMLIN" ;
      edtAlbComDsc_Internalname = "ALBCOMDSC" ;
      edtAlbComDc2_Internalname = "ALBCOMDC2" ;
      edtAlbComUni_Internalname = "ALBCOMUNI" ;
      edtAlbUcoDsc_Internalname = "ALBUCODSC" ;
      edtAlbComCnt_Internalname = "ALBCOMCNT" ;
      edtAlbComPre_Internalname = "ALBCOMPRE" ;
      edtAlbCImpLin_Internalname = "ALBCIMPLIN" ;
      edtAlbCImpL_Internalname = "ALBCIMPL" ;
      edtAlbComHd_Internalname = "ALBCOMHD" ;
      edtALbComR_Internalname = "ALBCOMR" ;
      edtAlbComP_Internalname = "ALBCOMP" ;
      edtAlbComProd_Internalname = "ALBCOMPROD" ;
      divTableleaflevel_albcom_Internalname = "TABLELEAFLEVEL_ALBCOM" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavComboclicod_Internalname = "vCOMBOCLICOD" ;
      divSectionattribute_clicod_Internalname = "SECTIONATTRIBUTE_CLICOD" ;
      edtavCombotrncod_Internalname = "vCOMBOTRNCOD" ;
      divSectionattribute_trncod_Internalname = "SECTIONATTRIBUTE_TRNCOD" ;
      Combo_albcomuni_Internalname = "COMBO_ALBCOMUNI" ;
      edtTrnNom_Internalname = "TRNNOM" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtAlbComPri_Internalname = "ALBCOMPRI" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridlevel_albcom_Internalname = "GRIDLEVEL_ALBCOM" ;
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
      subGridlevel_albcom_Allowcollapsing = (byte)(0) ;
      subGridlevel_albcom_Allowselection = (byte)(0) ;
      subGridlevel_albcom_Header = "" ;
      Combo_albcomuni_Enabled = GXutil.toBoolean( -1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Documento Comercial (v02)", "") );
      edtAlbComProd_Jsonclick = "" ;
      edtAlbComP_Jsonclick = "" ;
      edtALbComR_Jsonclick = "" ;
      edtAlbComHd_Jsonclick = "" ;
      edtAlbCImpL_Jsonclick = "" ;
      edtAlbCImpLin_Jsonclick = "" ;
      edtAlbComPre_Jsonclick = "" ;
      edtAlbComCnt_Jsonclick = "" ;
      edtAlbUcoDsc_Jsonclick = "" ;
      edtAlbComUni_Jsonclick = "" ;
      edtAlbComDc2_Jsonclick = "" ;
      edtAlbComDsc_Jsonclick = "" ;
      edtAlbComLin_Jsonclick = "" ;
      subGridlevel_albcom_Class = "GridNoBorder WorkWith" ;
      subGridlevel_albcom_Backcolorstyle = (byte)(0) ;
      Combo_albcomuni_Titlecontrolidtoreplace = "" ;
      edtAlbComProd_Enabled = 0 ;
      edtAlbComP_Enabled = 0 ;
      edtALbComR_Enabled = 0 ;
      edtAlbComHd_Enabled = 0 ;
      edtAlbCImpL_Enabled = 0 ;
      edtAlbCImpLin_Enabled = 0 ;
      edtAlbComPre_Enabled = 1 ;
      edtAlbComCnt_Enabled = 1 ;
      edtAlbUcoDsc_Enabled = 0 ;
      edtAlbComUni_Enabled = 1 ;
      edtAlbComDc2_Enabled = 1 ;
      edtAlbComDsc_Enabled = 1 ;
      edtAlbComLin_Enabled = 1 ;
      edtAlbComPri_Jsonclick = "" ;
      edtAlbComPri_Enabled = 1 ;
      edtAlbComPri_Visible = 1 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Enabled = 0 ;
      edtCliNom_Visible = 1 ;
      edtTrnNom_Jsonclick = "" ;
      edtTrnNom_Enabled = 0 ;
      edtTrnNom_Visible = 1 ;
      Combo_albcomuni_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_albcomuni_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_albcomuni_Cls = "ExtendedCombo" ;
      edtavCombotrncod_Jsonclick = "" ;
      edtavCombotrncod_Enabled = 0 ;
      edtavCombotrncod_Visible = 1 ;
      edtavComboclicod_Jsonclick = "" ;
      edtavComboclicod_Enabled = 0 ;
      edtavComboclicod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtAlbComAT_Jsonclick = "" ;
      edtAlbComAT_Enabled = 0 ;
      edtAlbComID_Jsonclick = "" ;
      edtAlbComID_Enabled = 0 ;
      cmbAlbComEAT.setJsonclick( "" );
      cmbAlbComEAT.setEnabled( 0 );
      edtAlbComATCU_Jsonclick = "" ;
      edtAlbComATCU_Enabled = 0 ;
      edtAlbComFs_Jsonclick = "" ;
      edtAlbComFs_Enabled = 0 ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "AT", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
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
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 1 ;
      edtCliCod_Visible = 1 ;
      Combo_clicod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_clicod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_clicod_Enabled = GXutil.toBoolean( -1) ;
      edtAlbComHor_Jsonclick = "" ;
      edtAlbComHor_Enabled = 1 ;
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
      edtAlbComUni_Horizontalalignment = "right" ;
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

   public void gx19asaalbcomhor1PR1( java.util.Date A17AlbComFch ,
                                     String Gx_mode ,
                                     String A396EmprCod )
   {
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A4829AlbComHor) && true /* After */ )
      {
         GXt_dtime17 = A4829AlbComHor ;
         GXv_dtime10[0] = GXt_dtime17 ;
         new app.stocksquimicos.ptrz001(remoteHandle, context).execute( A396EmprCod, GXv_dtime10) ;
         documentocomercialv02_impl.this.GXt_dtime17 = GXv_dtime10[0] ;
         A4829AlbComHor = GXt_dtime17 ;
         httpContext.ajax_rsp_assign_attri("", false, "A4829AlbComHor", localUtil.ttoc( A4829AlbComHor, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( localUtil.ttoc( A4829AlbComHor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_39_1PR1( String A396EmprCod ,
                           String AV32ContCod ,
                           int A14AlbComCod ,
                           String A22AlbComPri )
   {
      if ( (0==A14AlbComCod) && true /* Level */ )
      {
         GXv_int8[0] = A14AlbComCod ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, AV32ContCod, GXv_int8) ;
         A14AlbComCod = GXv_int8[0] ;
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

   public void xc_40_1PR1( String A396EmprCod ,
                           String A22AlbComPri ,
                           java.util.Date AV33Fch ,
                           int AV34AlbLast ,
                           java.util.Date A17AlbComFch ,
                           String AV35Msg_f ,
                           short AV11Ctrlf )
   {
      if ( true /* Level */ && true /* After */ && ( AV11Ctrlf == 1 ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A22AlbComPri ;
         GXv_int12[0] = (byte)(2) ;
         GXv_date18[0] = AV33Fch ;
         GXv_int8[0] = AV34AlbLast ;
         GXv_date9[0] = A17AlbComFch ;
         GXv_char2[0] = AV35Msg_f ;
         new app.pdoc000(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int12, GXv_date18, GXv_int8, GXv_date9, GXv_char2) ;
         A396EmprCod = GXv_char4[0] ;
         A22AlbComPri = GXv_char3[0] ;
         AV33Fch = GXv_date18[0] ;
         AV34AlbLast = GXv_int8[0] ;
         A17AlbComFch = GXv_date9[0] ;
         AV35Msg_f = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A22AlbComPri", A22AlbComPri);
         httpContext.ajax_rsp_assign_attri("", false, "AV33Fch", localUtil.format(AV33Fch, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV34AlbLast", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34AlbLast), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A17AlbComFch", localUtil.format(A17AlbComFch, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV35Msg_f", AV35Msg_f);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A22AlbComPri))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(AV33Fch, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV34AlbLast, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A17AlbComFch, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( AV35Msg_f)+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_49_1PR1( )
   {
      if ( isIns( )  )
      {
         GXv_char4[0] = A14248AlbComATCU ;
         GXv_char3[0] = A14249AlbComSerA ;
         GXv_char2[0] = A14250AlbComTipA ;
         new app.patcud(remoteHandle, context).execute( A396EmprCod, AV32ContCod, GXv_char4, GXv_char3, GXv_char2, GXutil.trim( AV54Pgmdesc)) ;
         A14248AlbComATCU = GXv_char4[0] ;
         A14249AlbComSerA = GXv_char3[0] ;
         A14250AlbComTipA = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14248AlbComATCU", A14248AlbComATCU);
         httpContext.ajax_rsp_assign_attri("", false, "A14249AlbComSerA", A14249AlbComSerA);
         httpContext.ajax_rsp_assign_attri("", false, "A14250AlbComTipA", A14250AlbComTipA);
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

   public void gxnrgridlevel_albcom_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_1132( ) ;
      while ( nGXsfl_113_idx <= nRC_GXsfl_113 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1PR2( ) ;
         standaloneModal1PR2( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1PR2( ) ;
         nGXsfl_113_idx = (int)(nGXsfl_113_idx+1) ;
         sGXsfl_113_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_113_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1132( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_albcomContainer)) ;
      /* End function gxnrGridlevel_albcom_newrow */
   }

   public void init_web_controls( )
   {
      cmbAlbComEAT.setName( "ALBCOMEAT" );
      cmbAlbComEAT.setWebtags( "" );
      cmbAlbComEAT.addItem("0", httpContext.getMessage( "Pdte. Enviar", ""), (short)(0));
      cmbAlbComEAT.addItem("3", httpContext.getMessage( "Enviada a AT", ""), (short)(0));
      if ( cmbAlbComEAT.getItemCount() > 0 )
      {
         if ( isIns( ) && (0==A10739AlbComEAT) )
         {
            A10739AlbComEAT = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10739AlbComEAT", GXutil.str( A10739AlbComEAT, 1, 0));
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
      /* Using cursor T01PR33 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
      if ( (pr_default.getStatus(27) != 101) )
      {
         A18AlbComImp = T01PR33_A18AlbComImp[0] ;
         n18AlbComImp = T01PR33_n18AlbComImp[0] ;
      }
      else
      {
         A18AlbComImp = DecimalUtil.doubleToDec(0) ;
         n18AlbComImp = false ;
      }
      pr_default.close(27);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrim( localUtil.ntoc( A18AlbComImp, (byte)(13), (byte)(2), ".", "")));
   }

   public void valid_Albcomfch( )
   {
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A4829AlbComHor) && true /* After */ )
      {
         GXt_dtime17 = A4829AlbComHor ;
         GXv_dtime10[0] = GXt_dtime17 ;
         new app.stocksquimicos.ptrz001(remoteHandle, context).execute( A396EmprCod, GXv_dtime10) ;
         documentocomercialv02_impl.this.GXt_dtime17 = GXv_dtime10[0] ;
         A4829AlbComHor = GXt_dtime17 ;
      }
      if ( true /* Level */ && true /* After */ && ( AV11Ctrlf == 1 ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A22AlbComPri ;
         GXv_int12[0] = (byte)(2) ;
         GXv_date18[0] = AV33Fch ;
         GXv_int8[0] = AV34AlbLast ;
         GXv_date9[0] = A17AlbComFch ;
         GXv_char2[0] = AV35Msg_f ;
         new app.pdoc000(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int12, GXv_date18, GXv_int8, GXv_date9, GXv_char2) ;
         documentocomercialv02_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         documentocomercialv02_impl.this.A22AlbComPri = GXv_char3[0] ;
         A22AlbComPri = this.A22AlbComPri ;
         documentocomercialv02_impl.this.AV33Fch = GXv_date18[0] ;
         AV33Fch = this.AV33Fch ;
         documentocomercialv02_impl.this.AV34AlbLast = GXv_int8[0] ;
         AV34AlbLast = this.AV34AlbLast ;
         documentocomercialv02_impl.this.A17AlbComFch = GXv_date9[0] ;
         A17AlbComFch = this.A17AlbComFch ;
         documentocomercialv02_impl.this.AV35Msg_f = GXv_char2[0] ;
         AV35Msg_f = this.AV35Msg_f ;
      }
      if ( ( GXutil.strcmp(AV35Msg_f, " ") != 0 ) && true /* Level */ && true /* After */ )
      {
         httpContext.GX_msglist.addItem(AV35Msg_f, 1, "ALBCOMFCH");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbComFch_Internalname ;
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A17AlbComFch)) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Campo Incorrecto", ""), 1, "ALBCOMFCH");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbComFch_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4829AlbComHor", localUtil.ttoc( A4829AlbComHor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A22AlbComPri", GXutil.rtrim( A22AlbComPri));
      httpContext.ajax_rsp_assign_attri("", false, "AV33Fch", localUtil.format(AV33Fch, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV34AlbLast", GXutil.ltrim( localUtil.ntoc( AV34AlbLast, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A17AlbComFch", localUtil.format(A17AlbComFch, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV35Msg_f", AV35Msg_f);
   }

   public void valid_Clicod( )
   {
      n3091CliDivTra = false ;
      n3140CliDivCod = false ;
      /* Using cursor T01PR29 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A279CliNom = T01PR29_A279CliNom[0] ;
      A3091CliDivTra = T01PR29_A3091CliDivTra[0] ;
      n3091CliDivTra = T01PR29_n3091CliDivTra[0] ;
      A3140CliDivCod = T01PR29_A3140CliDivCod[0] ;
      n3140CliDivCod = T01PR29_n3140CliDivCod[0] ;
      pr_default.close(24);
      AV37guiremcli = O252CliCod ;
      if ( isUpd( )  && ( A252CliCod != AV37guiremcli ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR.NO se puede cambiar Cliente, Guia comunicada AT ¡¡¡", ""), 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A3091CliDivTra", GXutil.rtrim( A3091CliDivTra));
      httpContext.ajax_rsp_assign_attri("", false, "A3140CliDivCod", GXutil.ltrim( localUtil.ntoc( A3140CliDivCod, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV37guiremcli", GXutil.ltrim( localUtil.ntoc( AV37guiremcli, (byte)(6), (byte)(0), ".", "")));
   }

   public void valid_Alcdomenv( )
   {
      n13739findDomEnv = false ;
      /* Using cursor T01PR31 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Byte.valueOf(A5142AlcDomEnv)});
      if ( (pr_default.getStatus(26) != 101) )
      {
         A13739findDomEnv = T01PR31_A13739findDomEnv[0] ;
         n13739findDomEnv = T01PR31_n13739findDomEnv[0] ;
      }
      else
      {
         A13739findDomEnv = (byte)(0) ;
         n13739findDomEnv = false ;
      }
      pr_default.close(26);
      if ( (0==A13739findDomEnv) && ! (0==A5142AlcDomEnv) && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Endereço de entrega inexistente", ""), 1, "ALCDOMENV");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlcDomEnv_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13739findDomEnv", GXutil.ltrim( localUtil.ntoc( A13739findDomEnv, (byte)(1), (byte)(0), ".", "")));
   }

   public void valid_Trncod( )
   {
      n840TrnCod = false ;
      n841TrnNom = false ;
      /* Using cursor T01PR30 */
      pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
         }
      }
      A841TrnNom = T01PR30_A841TrnNom[0] ;
      n841TrnNom = T01PR30_n841TrnNom[0] ;
      pr_default.close(25);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", GXutil.rtrim( A841TrnNom));
   }

   public void valid_Albcompri( )
   {
      if ( ! ( ( GXutil.strcmp(A22AlbComPri, "0") == 0 ) || ( GXutil.strcmp(A22AlbComPri, "1") == 0 ) || ( GXutil.strcmp(A22AlbComPri, "2") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "P", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ALBCOMPRI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbComPri_Internalname ;
      }
      AV36oldAlbComPri = O22AlbComPri ;
      if ( isUpd( )  && ( GXutil.strcmp(A22AlbComPri, AV36oldAlbComPri) != 0 ) && ( AV16CambioP == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR.NO se puede cambiar este campo ¡¡¡", ""), 1, "ALBCOMPRI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbComPri_Internalname ;
      }
      O252CliCod = A252CliCod ;
      O22AlbComPri = A22AlbComPri ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV36oldAlbComPri", GXutil.rtrim( AV36oldAlbComPri));
   }

   public void valid_Albcomuni( )
   {
      n5144AlbUcoDsc = false ;
      /* Using cursor T01PR43 */
      pr_default.execute(37, new Object[] {A396EmprCod, Byte.valueOf(A4717AlbComUni)});
      if ( (pr_default.getStatus(37) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Producto2", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBCOMUNI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbComUni_Internalname ;
      }
      A5144AlbUcoDsc = T01PR43_A5144AlbUcoDsc[0] ;
      n5144AlbUcoDsc = T01PR43_n5144AlbUcoDsc[0] ;
      pr_default.close(37);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A5144AlbUcoDsc", GXutil.rtrim( A5144AlbUcoDsc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV23AlbComCod',fld:'vALBCOMCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV31AlbComPri',fld:'vALBCOMPRI',pic:'9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV25TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV23AlbComCod',fld:'vALBCOMCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV31AlbComPri',fld:'vALBCOMPRI',pic:'9',hsh:true},{av:'A10013AlbComFs',fld:'ALBCOMFS',pic:'99/99/99 99:99:99'},{av:'AV55Pgmname',fld:'vPGMNAME',pic:''},{av:'A16AlbComEst',fld:'ALBCOMEST',pic:'9'},{av:'A1783AlbComEso',fld:'ALBCOMESO',pic:'9'},{av:'A3095AlcDivTCod',fld:'ALCDIVTCOD',pic:''},{av:'A10014AlbComFd',fld:'ALBCOMFD',pic:''},{av:'A10015AlbComFdD',fld:'ALBCOMFDD',pic:''},{av:'A3094AlbCSec',fld:'ALBCSEC',pic:''},{av:'A10738AlbComSt',fld:'ALBCOMST',pic:''},{av:'cmbAlbComEAT'},{av:'A10739AlbComEAT',fld:'ALBCOMEAT',pic:'9'},{av:'A10740AlbComID',fld:'ALBCOMID',pic:''},{av:'A10764AlbComAT',fld:'ALBCOMAT',pic:''},{av:'A5143AlcIvaCod',fld:'ALCIVACOD',pic:'@!'},{av:'A11719AlbCTrNm',fld:'ALBCTRNM',pic:''},{av:'A11720AlbCTrDm',fld:'ALBCTRDM',pic:''},{av:'A11721AlbCTrNc',fld:'ALBCTRNC',pic:''},{av:'A14248AlbComATCU',fld:'ALBCOMATCU',pic:''},{av:'A14249AlbComSerA',fld:'ALBCOMSERA',pic:''},{av:'A14250AlbComTipA',fld:'ALBCOMTIPA',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e131PR2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV25TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A14AlbComCod',fld:'ALBCOMCOD',pic:'ZZZZZZZ9'},{av:'A17AlbComFch',fld:'ALBCOMFCH',pic:''},{av:'A10013AlbComFs',fld:'ALBCOMFS',pic:'99/99/99 99:99:99'},{av:'A4829AlbComHor',fld:'ALBCOMHOR',pic:'99/99/99 99:99:99'},{av:'A22AlbComPri',fld:'ALBCOMPRI',pic:'9'}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A14AlbComCod',fld:'ALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A10013AlbComFs',fld:'ALBCOMFS',pic:'99/99/99 99:99:99'},{av:'A17AlbComFch',fld:'ALBCOMFCH',pic:''},{av:'A4829AlbComHor',fld:'ALBCOMHOR',pic:'99/99/99 99:99:99'}]}");
      setEventMetadata("'DOPROMPTCLIENV'","{handler:'e111PR2',iparms:[{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A5142AlcDomEnv',fld:'ALCDOMENV',pic:'9'}]");
      setEventMetadata("'DOPROMPTCLIENV'",",oparms:[{av:'A5142AlcDomEnv',fld:'ALCDOMENV',pic:'9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_ALBCOMCOD","{handler:'valid_Albcomcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A14AlbComCod',fld:'ALBCOMCOD',pic:'ZZZZZZZ9'},{av:'A18AlbComImp',fld:'ALBCOMIMP',pic:'ZZZZZZZZZ9.99'}]");
      setEventMetadata("VALID_ALBCOMCOD",",oparms:[{av:'A18AlbComImp',fld:'ALBCOMIMP',pic:'ZZZZZZZZZ9.99'}]}");
      setEventMetadata("VALID_ALBCOMFCH","{handler:'valid_Albcomfch',iparms:[{av:'AV11Ctrlf',fld:'vCTRLF',pic:'ZZZ9'},{av:'A22AlbComPri',fld:'ALBCOMPRI',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A17AlbComFch',fld:'ALBCOMFCH',pic:''},{av:'A4829AlbComHor',fld:'ALBCOMHOR',pic:'99/99/99 99:99:99'},{av:'AV35Msg_f',fld:'vMSG_F',pic:''},{av:'AV34AlbLast',fld:'vALBLAST',pic:'ZZZZZZZ9'},{av:'AV33Fch',fld:'vFCH',pic:''}]");
      setEventMetadata("VALID_ALBCOMFCH",",oparms:[{av:'A4829AlbComHor',fld:'ALBCOMHOR',pic:'99/99/99 99:99:99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A22AlbComPri',fld:'ALBCOMPRI',pic:'9'},{av:'AV33Fch',fld:'vFCH',pic:''},{av:'AV34AlbLast',fld:'vALBLAST',pic:'ZZZZZZZ9'},{av:'A17AlbComFch',fld:'ALBCOMFCH',pic:''},{av:'AV35Msg_f',fld:'vMSG_F',pic:''}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'O252CliCod'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A3091CliDivTra',fld:'CLIDIVTRA',pic:''},{av:'A3140CliDivCod',fld:'CLIDIVCOD',pic:'Z9'},{av:'AV37guiremcli',fld:'vGUIREMCLI',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A3091CliDivTra',fld:'CLIDIVTRA',pic:''},{av:'A3140CliDivCod',fld:'CLIDIVCOD',pic:'Z9'},{av:'AV37guiremcli',fld:'vGUIREMCLI',pic:'ZZZZZ9'}]}");
      setEventMetadata("VALID_ALCDOMENV","{handler:'valid_Alcdomenv',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A5142AlcDomEnv',fld:'ALCDOMENV',pic:'9'},{av:'A13739findDomEnv',fld:'FINDDOMENV',pic:'9'}]");
      setEventMetadata("VALID_ALCDOMENV",",oparms:[{av:'A13739findDomEnv',fld:'FINDDOMENV',pic:'9'}]}");
      setEventMetadata("VALID_TRNCOD","{handler:'valid_Trncod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A841TrnNom',fld:'TRNNOM',pic:''}]");
      setEventMetadata("VALID_TRNCOD",",oparms:[{av:'A841TrnNom',fld:'TRNNOM',pic:''}]}");
      setEventMetadata("VALID_ALBCOMATCU","{handler:'valid_Albcomatcu',iparms:[]");
      setEventMetadata("VALID_ALBCOMATCU",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOCLICOD","{handler:'validv_Comboclicod',iparms:[]");
      setEventMetadata("VALIDV_COMBOCLICOD",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOTRNCOD","{handler:'validv_Combotrncod',iparms:[]");
      setEventMetadata("VALIDV_COMBOTRNCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBCOMPRI","{handler:'valid_Albcompri',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'O22AlbComPri'},{av:'A22AlbComPri',fld:'ALBCOMPRI',pic:'9'},{av:'AV36oldAlbComPri',fld:'vOLDALBCOMPRI',pic:'9'}]");
      setEventMetadata("VALID_ALBCOMPRI",",oparms:[{av:'AV36oldAlbComPri',fld:'vOLDALBCOMPRI',pic:'9'}]}");
      setEventMetadata("VALID_ALBCOMLIN","{handler:'valid_Albcomlin',iparms:[]");
      setEventMetadata("VALID_ALBCOMLIN",",oparms:[]}");
      setEventMetadata("VALID_ALBCOMUNI","{handler:'valid_Albcomuni',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4717AlbComUni',fld:'ALBCOMUNI',pic:'9'},{av:'A5144AlbUcoDsc',fld:'ALBUCODSC',pic:''}]");
      setEventMetadata("VALID_ALBCOMUNI",",oparms:[{av:'A5144AlbUcoDsc',fld:'ALBUCODSC',pic:''}]}");
      setEventMetadata("VALID_ALBCOMCNT","{handler:'valid_Albcomcnt',iparms:[]");
      setEventMetadata("VALID_ALBCOMCNT",",oparms:[]}");
      setEventMetadata("VALID_ALBCOMPRE","{handler:'valid_Albcompre',iparms:[]");
      setEventMetadata("VALID_ALBCOMPRE",",oparms:[]}");
      setEventMetadata("VALID_ALBCIMPLIN","{handler:'valid_Albcimplin',iparms:[]");
      setEventMetadata("VALID_ALBCIMPLIN",",oparms:[]}");
      setEventMetadata("VALID_ALBCIMPL","{handler:'valid_Albcimpl',iparms:[]");
      setEventMetadata("VALID_ALBCIMPL",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Albcomprod',iparms:[]");
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
      pr_default.close(37);
      pr_default.close(24);
      pr_default.close(25);
      pr_default.close(23);
      pr_default.close(26);
      pr_default.close(27);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV20EmprCod = "" ;
      wcpOAV31AlbComPri = "" ;
      Z396EmprCod = "" ;
      Z4829AlbComHor = GXutil.resetTime( GXutil.nullDate() );
      Z17AlbComFch = GXutil.nullDate() ;
      Z22AlbComPri = "" ;
      Z3095AlcDivTCod = "" ;
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
      O18AlbComImp = DecimalUtil.ZERO ;
      O22AlbComPri = "" ;
      Combo_trncod_Selectedvalue_get = "" ;
      Combo_clicod_Selectedvalue_get = "" ;
      Z10357AlbComP = "" ;
      Z15AlbComDsc = "" ;
      Z10806AlbComDc2 = "" ;
      Z13AlbComCnt = DecimalUtil.ZERO ;
      Z21AlbComPre = DecimalUtil.ZERO ;
      Z5010AlbComProd = "" ;
      O12AlbCImpLin = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      AV32ContCod = "" ;
      A22AlbComPri = "" ;
      AV33Fch = GXutil.nullDate() ;
      A17AlbComFch = GXutil.nullDate() ;
      AV35Msg_f = "" ;
      Gx_mode = "" ;
      AV20EmprCod = "" ;
      AV31AlbComPri = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A4829AlbComHor = GXutil.resetTime( GXutil.nullDate() );
      lblTextblockclicod_Jsonclick = "" ;
      ucCombo_clicod = new com.genexus.webpanels.GXUserControl();
      Combo_clicod_Caption = "" ;
      AV43CliCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      lblTextblockalcdomenv_Jsonclick = "" ;
      sStyleString = "" ;
      lblPromptclienv_Jsonclick = "" ;
      lblTextblocktrncod_Jsonclick = "" ;
      ucCombo_trncod = new com.genexus.webpanels.GXUserControl();
      Combo_trncod_Caption = "" ;
      AV40TrnCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A4830AlbComMat = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      A10013AlbComFs = GXutil.resetTime( GXutil.nullDate() );
      A14248AlbComATCU = "" ;
      A10740AlbComID = "" ;
      A10764AlbComAT = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      AV55Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucCombo_albcomuni = new com.genexus.webpanels.GXUserControl();
      Combo_albcomuni_Caption = "" ;
      AV52AlbComUni_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A841TrnNom = "" ;
      A279CliNom = "" ;
      Gridlevel_albcomContainer = new com.genexus.webpanels.GXWebGrid(context);
      B18AlbComImp = DecimalUtil.ZERO ;
      A18AlbComImp = DecimalUtil.ZERO ;
      B22AlbComPri = "" ;
      sMode2 = "" ;
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
      AV36oldAlbComPri = "" ;
      AV18Msg_errAT = "" ;
      AV54Pgmdesc = "" ;
      A407EmprNom = "" ;
      A3091CliDivTra = "" ;
      A3112AlcDivAbr = "" ;
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
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Dvpanel_unnamedtable1_Objectcall = "" ;
      Dvpanel_unnamedtable1_Class = "" ;
      Dvpanel_unnamedtable1_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      Combo_albcomuni_Objectcall = "" ;
      Combo_albcomuni_Class = "" ;
      Combo_albcomuni_Icontype = "" ;
      Combo_albcomuni_Icon = "" ;
      Combo_albcomuni_Tooltip = "" ;
      Combo_albcomuni_Selectedvalue_set = "" ;
      Combo_albcomuni_Selectedvalue_get = "" ;
      Combo_albcomuni_Selectedtext_set = "" ;
      Combo_albcomuni_Selectedtext_get = "" ;
      Combo_albcomuni_Gamoauthtoken = "" ;
      Combo_albcomuni_Ddointernalname = "" ;
      Combo_albcomuni_Titlecontrolalign = "" ;
      Combo_albcomuni_Dropdownoptionstype = "" ;
      Combo_albcomuni_Datalisttype = "" ;
      Combo_albcomuni_Datalistfixedvalues = "" ;
      Combo_albcomuni_Datalistproc = "" ;
      Combo_albcomuni_Datalistprocparametersprefix = "" ;
      Combo_albcomuni_Remoteservicesparameters = "" ;
      Combo_albcomuni_Htmltemplate = "" ;
      Combo_albcomuni_Multiplevaluestype = "" ;
      Combo_albcomuni_Loadingdata = "" ;
      Combo_albcomuni_Noresultsfound = "" ;
      Combo_albcomuni_Emptyitemtext = "" ;
      Combo_albcomuni_Onlyselectedvalues = "" ;
      Combo_albcomuni_Selectalltext = "" ;
      Combo_albcomuni_Multiplevaluesseparator = "" ;
      Combo_albcomuni_Addnewoptiontext = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode1 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      GXCCtl = "" ;
      A15AlbComDsc = "" ;
      A10806AlbComDc2 = "" ;
      A5144AlbUcoDsc = "" ;
      A13AlbComCnt = DecimalUtil.ZERO ;
      A21AlbComPre = DecimalUtil.ZERO ;
      A12AlbCImpLin = DecimalUtil.ZERO ;
      A3914AlbCImpL = DecimalUtil.ZERO ;
      A10357AlbComP = "" ;
      A5010AlbComProd = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      s18AlbComImp = DecimalUtil.ZERO ;
      T12AlbCImpLin = DecimalUtil.ZERO ;
      AV19Station = "" ;
      AV21EmprNom = "" ;
      AV22UsurCod = "" ;
      GXt_char1 = "" ;
      AV24WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV25TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV26WebSession = httpContext.getWebSession();
      AV30TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      GXv_int11 = new short[1] ;
      GXv_int6 = new byte[1] ;
      AV45Cadena = "" ;
      AV46Hash = "" ;
      AV47Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXv_objcol_SdtMessages_Message13 = new GXBaseCollection[1] ;
      GXv_boolean14 = new boolean[1] ;
      AV51Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV41ComboSelectedValue = "" ;
      GXt_objcol_SdtDVB_SDTComboData_Item15 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTComboData_Item16 = new GXBaseCollection[1] ;
      Z3112AlcDivAbr = "" ;
      Z407EmprNom = "" ;
      Z18AlbComImp = DecimalUtil.ZERO ;
      Z279CliNom = "" ;
      Z3091CliDivTra = "" ;
      Z841TrnNom = "" ;
      T01PR7_A407EmprNom = new String[] {""} ;
      T01PR7_n407EmprNom = new boolean[] {false} ;
      T01PR13_A18AlbComImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PR13_n18AlbComImp = new boolean[] {false} ;
      T01PR8_A279CliNom = new String[] {""} ;
      T01PR8_A3091CliDivTra = new String[] {""} ;
      T01PR8_n3091CliDivTra = new boolean[] {false} ;
      T01PR8_A3140CliDivCod = new byte[1] ;
      T01PR8_n3140CliDivCod = new boolean[] {false} ;
      T01PR9_A841TrnNom = new String[] {""} ;
      T01PR9_n841TrnNom = new boolean[] {false} ;
      T01PR10_A3112AlcDivAbr = new String[] {""} ;
      T01PR10_n3112AlcDivAbr = new boolean[] {false} ;
      T01PR15_A266CliEnvLin = new byte[1] ;
      T01PR15_A14AlbComCod = new int[1] ;
      T01PR15_A4829AlbComHor = new java.util.Date[] {GXutil.nullDate()} ;
      T01PR15_A407EmprNom = new String[] {""} ;
      T01PR15_n407EmprNom = new boolean[] {false} ;
      T01PR15_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01PR15_A22AlbComPri = new String[] {""} ;
      T01PR15_A279CliNom = new String[] {""} ;
      T01PR15_A3091CliDivTra = new String[] {""} ;
      T01PR15_n3091CliDivTra = new boolean[] {false} ;
      T01PR15_A16AlbComEst = new byte[1] ;
      T01PR15_A19AlbComLiC = new short[1] ;
      T01PR15_A1783AlbComEso = new byte[1] ;
      T01PR15_A3095AlcDivTCod = new String[] {""} ;
      T01PR15_A3112AlcDivAbr = new String[] {""} ;
      T01PR15_n3112AlcDivAbr = new boolean[] {false} ;
      T01PR15_A841TrnNom = new String[] {""} ;
      T01PR15_n841TrnNom = new boolean[] {false} ;
      T01PR15_A4830AlbComMat = new String[] {""} ;
      T01PR15_A5142AlcDomEnv = new byte[1] ;
      T01PR15_A10013AlbComFs = new java.util.Date[] {GXutil.nullDate()} ;
      T01PR15_A10014AlbComFd = new String[] {""} ;
      T01PR15_A10015AlbComFdD = new String[] {""} ;
      T01PR15_A3094AlbCSec = new String[] {""} ;
      T01PR15_A10738AlbComSt = new String[] {""} ;
      T01PR15_A10739AlbComEAT = new byte[1] ;
      T01PR15_A10740AlbComID = new String[] {""} ;
      T01PR15_A10764AlbComAT = new String[] {""} ;
      T01PR15_A5143AlcIvaCod = new String[] {""} ;
      T01PR15_A11719AlbCTrNm = new String[] {""} ;
      T01PR15_A11720AlbCTrDm = new String[] {""} ;
      T01PR15_A11721AlbCTrNc = new String[] {""} ;
      T01PR15_A14248AlbComATCU = new String[] {""} ;
      T01PR15_A14249AlbComSerA = new String[] {""} ;
      T01PR15_A14250AlbComTipA = new String[] {""} ;
      T01PR15_A396EmprCod = new String[] {""} ;
      T01PR15_A252CliCod = new int[1] ;
      T01PR15_A840TrnCod = new short[1] ;
      T01PR15_n840TrnCod = new boolean[] {false} ;
      T01PR15_A3111AlcDivCod = new byte[1] ;
      T01PR15_A3140CliDivCod = new byte[1] ;
      T01PR15_n3140CliDivCod = new boolean[] {false} ;
      T01PR15_A13739findDomEnv = new byte[1] ;
      T01PR15_n13739findDomEnv = new boolean[] {false} ;
      T01PR15_A18AlbComImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PR15_n18AlbComImp = new boolean[] {false} ;
      T01PR11_A13739findDomEnv = new byte[1] ;
      T01PR11_n13739findDomEnv = new boolean[] {false} ;
      T01PR16_A3112AlcDivAbr = new String[] {""} ;
      T01PR16_n3112AlcDivAbr = new boolean[] {false} ;
      T01PR17_A279CliNom = new String[] {""} ;
      T01PR17_A3091CliDivTra = new String[] {""} ;
      T01PR17_n3091CliDivTra = new boolean[] {false} ;
      T01PR17_A3140CliDivCod = new byte[1] ;
      T01PR17_n3140CliDivCod = new boolean[] {false} ;
      T01PR18_A841TrnNom = new String[] {""} ;
      T01PR18_n841TrnNom = new boolean[] {false} ;
      T01PR19_A13739findDomEnv = new byte[1] ;
      T01PR19_n13739findDomEnv = new boolean[] {false} ;
      T01PR21_A18AlbComImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PR21_n18AlbComImp = new boolean[] {false} ;
      T01PR22_A396EmprCod = new String[] {""} ;
      T01PR22_A14AlbComCod = new int[1] ;
      T01PR6_A14AlbComCod = new int[1] ;
      T01PR6_A4829AlbComHor = new java.util.Date[] {GXutil.nullDate()} ;
      T01PR6_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01PR6_A22AlbComPri = new String[] {""} ;
      T01PR6_A16AlbComEst = new byte[1] ;
      T01PR6_A19AlbComLiC = new short[1] ;
      T01PR6_A1783AlbComEso = new byte[1] ;
      T01PR6_A3095AlcDivTCod = new String[] {""} ;
      T01PR6_A4830AlbComMat = new String[] {""} ;
      T01PR6_A5142AlcDomEnv = new byte[1] ;
      T01PR6_A10013AlbComFs = new java.util.Date[] {GXutil.nullDate()} ;
      T01PR6_A10014AlbComFd = new String[] {""} ;
      T01PR6_A10015AlbComFdD = new String[] {""} ;
      T01PR6_A3094AlbCSec = new String[] {""} ;
      T01PR6_A10738AlbComSt = new String[] {""} ;
      T01PR6_A10739AlbComEAT = new byte[1] ;
      T01PR6_A10740AlbComID = new String[] {""} ;
      T01PR6_A10764AlbComAT = new String[] {""} ;
      T01PR6_A5143AlcIvaCod = new String[] {""} ;
      T01PR6_A11719AlbCTrNm = new String[] {""} ;
      T01PR6_A11720AlbCTrDm = new String[] {""} ;
      T01PR6_A11721AlbCTrNc = new String[] {""} ;
      T01PR6_A14248AlbComATCU = new String[] {""} ;
      T01PR6_A14249AlbComSerA = new String[] {""} ;
      T01PR6_A14250AlbComTipA = new String[] {""} ;
      T01PR6_A396EmprCod = new String[] {""} ;
      T01PR6_A252CliCod = new int[1] ;
      T01PR6_A840TrnCod = new short[1] ;
      T01PR6_n840TrnCod = new boolean[] {false} ;
      T01PR6_A3111AlcDivCod = new byte[1] ;
      T01PR23_A396EmprCod = new String[] {""} ;
      T01PR23_A14AlbComCod = new int[1] ;
      T01PR24_A396EmprCod = new String[] {""} ;
      T01PR24_A14AlbComCod = new int[1] ;
      T01PR5_A14AlbComCod = new int[1] ;
      T01PR5_A4829AlbComHor = new java.util.Date[] {GXutil.nullDate()} ;
      T01PR5_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01PR5_A22AlbComPri = new String[] {""} ;
      T01PR5_A16AlbComEst = new byte[1] ;
      T01PR5_A19AlbComLiC = new short[1] ;
      T01PR5_A1783AlbComEso = new byte[1] ;
      T01PR5_A3095AlcDivTCod = new String[] {""} ;
      T01PR5_A4830AlbComMat = new String[] {""} ;
      T01PR5_A5142AlcDomEnv = new byte[1] ;
      T01PR5_A10013AlbComFs = new java.util.Date[] {GXutil.nullDate()} ;
      T01PR5_A10014AlbComFd = new String[] {""} ;
      T01PR5_A10015AlbComFdD = new String[] {""} ;
      T01PR5_A3094AlbCSec = new String[] {""} ;
      T01PR5_A10738AlbComSt = new String[] {""} ;
      T01PR5_A10739AlbComEAT = new byte[1] ;
      T01PR5_A10740AlbComID = new String[] {""} ;
      T01PR5_A10764AlbComAT = new String[] {""} ;
      T01PR5_A5143AlcIvaCod = new String[] {""} ;
      T01PR5_A11719AlbCTrNm = new String[] {""} ;
      T01PR5_A11720AlbCTrDm = new String[] {""} ;
      T01PR5_A11721AlbCTrNc = new String[] {""} ;
      T01PR5_A14248AlbComATCU = new String[] {""} ;
      T01PR5_A14249AlbComSerA = new String[] {""} ;
      T01PR5_A14250AlbComTipA = new String[] {""} ;
      T01PR5_A396EmprCod = new String[] {""} ;
      T01PR5_A252CliCod = new int[1] ;
      T01PR5_A840TrnCod = new short[1] ;
      T01PR5_n840TrnCod = new boolean[] {false} ;
      T01PR5_A3111AlcDivCod = new byte[1] ;
      T01PR28_A3112AlcDivAbr = new String[] {""} ;
      T01PR28_n3112AlcDivAbr = new boolean[] {false} ;
      T01PR29_A279CliNom = new String[] {""} ;
      T01PR29_A3091CliDivTra = new String[] {""} ;
      T01PR29_n3091CliDivTra = new boolean[] {false} ;
      T01PR29_A3140CliDivCod = new byte[1] ;
      T01PR29_n3140CliDivCod = new boolean[] {false} ;
      T01PR30_A841TrnNom = new String[] {""} ;
      T01PR30_n841TrnNom = new boolean[] {false} ;
      T01PR31_A13739findDomEnv = new byte[1] ;
      T01PR31_n13739findDomEnv = new boolean[] {false} ;
      T01PR33_A18AlbComImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PR33_n18AlbComImp = new boolean[] {false} ;
      T01PR34_A396EmprCod = new String[] {""} ;
      T01PR34_A14AlbComCod = new int[1] ;
      T01PR34_A2386AlbCObsLin = new byte[1] ;
      T01PR36_A396EmprCod = new String[] {""} ;
      T01PR36_A14AlbComCod = new int[1] ;
      Z5144AlbUcoDsc = "" ;
      T01PR37_A14AlbComCod = new int[1] ;
      T01PR37_A20AlbComLin = new short[1] ;
      T01PR37_A10355AlbComHd = new int[1] ;
      T01PR37_A10356ALbComR = new byte[1] ;
      T01PR37_A10357AlbComP = new String[] {""} ;
      T01PR37_A15AlbComDsc = new String[] {""} ;
      T01PR37_A10806AlbComDc2 = new String[] {""} ;
      T01PR37_A5144AlbUcoDsc = new String[] {""} ;
      T01PR37_n5144AlbUcoDsc = new boolean[] {false} ;
      T01PR37_A13AlbComCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PR37_A21AlbComPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PR37_A5010AlbComProd = new String[] {""} ;
      T01PR37_A396EmprCod = new String[] {""} ;
      T01PR37_A4717AlbComUni = new byte[1] ;
      T01PR4_A5144AlbUcoDsc = new String[] {""} ;
      T01PR4_n5144AlbUcoDsc = new boolean[] {false} ;
      T01PR38_A5144AlbUcoDsc = new String[] {""} ;
      T01PR38_n5144AlbUcoDsc = new boolean[] {false} ;
      T01PR39_A396EmprCod = new String[] {""} ;
      T01PR39_A14AlbComCod = new int[1] ;
      T01PR39_A20AlbComLin = new short[1] ;
      T01PR3_A14AlbComCod = new int[1] ;
      T01PR3_A20AlbComLin = new short[1] ;
      T01PR3_A10355AlbComHd = new int[1] ;
      T01PR3_A10356ALbComR = new byte[1] ;
      T01PR3_A10357AlbComP = new String[] {""} ;
      T01PR3_A15AlbComDsc = new String[] {""} ;
      T01PR3_A10806AlbComDc2 = new String[] {""} ;
      T01PR3_A13AlbComCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PR3_A21AlbComPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PR3_A5010AlbComProd = new String[] {""} ;
      T01PR3_A396EmprCod = new String[] {""} ;
      T01PR3_A4717AlbComUni = new byte[1] ;
      T01PR2_A14AlbComCod = new int[1] ;
      T01PR2_A20AlbComLin = new short[1] ;
      T01PR2_A10355AlbComHd = new int[1] ;
      T01PR2_A10356ALbComR = new byte[1] ;
      T01PR2_A10357AlbComP = new String[] {""} ;
      T01PR2_A15AlbComDsc = new String[] {""} ;
      T01PR2_A10806AlbComDc2 = new String[] {""} ;
      T01PR2_A13AlbComCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PR2_A21AlbComPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PR2_A5010AlbComProd = new String[] {""} ;
      T01PR2_A396EmprCod = new String[] {""} ;
      T01PR2_A4717AlbComUni = new byte[1] ;
      T01PR43_A5144AlbUcoDsc = new String[] {""} ;
      T01PR43_n5144AlbUcoDsc = new boolean[] {false} ;
      T01PR44_A396EmprCod = new String[] {""} ;
      T01PR44_A14AlbComCod = new int[1] ;
      T01PR44_A20AlbComLin = new short[1] ;
      Gridlevel_albcomRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_albcom_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i10013AlbComFs = GXutil.resetTime( GXutil.nullDate() );
      i10738AlbComSt = "" ;
      i10740AlbComID = "" ;
      i10764AlbComAT = "" ;
      i17AlbComFch = GXutil.nullDate() ;
      i3095AlcDivTCod = "" ;
      i22AlbComPri = "" ;
      i14248AlbComATCU = "" ;
      i14249AlbComSerA = "" ;
      i14250AlbComTipA = "" ;
      i10357AlbComP = "" ;
      Gridlevel_albcomColumn = new com.genexus.webpanels.GXWebColumn();
      GXt_dtime17 = GXutil.resetTime( GXutil.nullDate() );
      GXv_dtime10 = new java.util.Date[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int12 = new byte[1] ;
      GXv_date18 = new java.util.Date[1] ;
      GXv_int8 = new int[1] ;
      GXv_date9 = new java.util.Date[1] ;
      GXv_char2 = new String[1] ;
      ZV33Fch = GXutil.nullDate() ;
      ZV35Msg_f = "" ;
      ZV36oldAlbComPri = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.documentocomercialv02__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.documentocomercialv02__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.documentocomercialv02__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.documentocomercialv02__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentocomercialv02__default(),
         new Object[] {
             new Object[] {
            T01PR2_A14AlbComCod, T01PR2_A20AlbComLin, T01PR2_A10355AlbComHd, T01PR2_A10356ALbComR, T01PR2_A10357AlbComP, T01PR2_A15AlbComDsc, T01PR2_A10806AlbComDc2, T01PR2_A13AlbComCnt, T01PR2_A21AlbComPre, T01PR2_A5010AlbComProd,
            T01PR2_A396EmprCod, T01PR2_A4717AlbComUni
            }
            , new Object[] {
            T01PR3_A14AlbComCod, T01PR3_A20AlbComLin, T01PR3_A10355AlbComHd, T01PR3_A10356ALbComR, T01PR3_A10357AlbComP, T01PR3_A15AlbComDsc, T01PR3_A10806AlbComDc2, T01PR3_A13AlbComCnt, T01PR3_A21AlbComPre, T01PR3_A5010AlbComProd,
            T01PR3_A396EmprCod, T01PR3_A4717AlbComUni
            }
            , new Object[] {
            T01PR4_A5144AlbUcoDsc, T01PR4_n5144AlbUcoDsc
            }
            , new Object[] {
            T01PR5_A14AlbComCod, T01PR5_A4829AlbComHor, T01PR5_A17AlbComFch, T01PR5_A22AlbComPri, T01PR5_A16AlbComEst, T01PR5_A19AlbComLiC, T01PR5_A1783AlbComEso, T01PR5_A3095AlcDivTCod, T01PR5_A4830AlbComMat, T01PR5_A5142AlcDomEnv,
            T01PR5_A10013AlbComFs, T01PR5_A10014AlbComFd, T01PR5_A10015AlbComFdD, T01PR5_A3094AlbCSec, T01PR5_A10738AlbComSt, T01PR5_A10739AlbComEAT, T01PR5_A10740AlbComID, T01PR5_A10764AlbComAT, T01PR5_A5143AlcIvaCod, T01PR5_A11719AlbCTrNm,
            T01PR5_A11720AlbCTrDm, T01PR5_A11721AlbCTrNc, T01PR5_A14248AlbComATCU, T01PR5_A14249AlbComSerA, T01PR5_A14250AlbComTipA, T01PR5_A396EmprCod, T01PR5_A252CliCod, T01PR5_A840TrnCod, T01PR5_n840TrnCod, T01PR5_A3111AlcDivCod
            }
            , new Object[] {
            T01PR6_A14AlbComCod, T01PR6_A4829AlbComHor, T01PR6_A17AlbComFch, T01PR6_A22AlbComPri, T01PR6_A16AlbComEst, T01PR6_A19AlbComLiC, T01PR6_A1783AlbComEso, T01PR6_A3095AlcDivTCod, T01PR6_A4830AlbComMat, T01PR6_A5142AlcDomEnv,
            T01PR6_A10013AlbComFs, T01PR6_A10014AlbComFd, T01PR6_A10015AlbComFdD, T01PR6_A3094AlbCSec, T01PR6_A10738AlbComSt, T01PR6_A10739AlbComEAT, T01PR6_A10740AlbComID, T01PR6_A10764AlbComAT, T01PR6_A5143AlcIvaCod, T01PR6_A11719AlbCTrNm,
            T01PR6_A11720AlbCTrDm, T01PR6_A11721AlbCTrNc, T01PR6_A14248AlbComATCU, T01PR6_A14249AlbComSerA, T01PR6_A14250AlbComTipA, T01PR6_A396EmprCod, T01PR6_A252CliCod, T01PR6_A840TrnCod, T01PR6_n840TrnCod, T01PR6_A3111AlcDivCod
            }
            , new Object[] {
            T01PR7_A407EmprNom, T01PR7_n407EmprNom
            }
            , new Object[] {
            T01PR8_A279CliNom, T01PR8_A3091CliDivTra, T01PR8_n3091CliDivTra, T01PR8_A3140CliDivCod, T01PR8_n3140CliDivCod
            }
            , new Object[] {
            T01PR9_A841TrnNom, T01PR9_n841TrnNom
            }
            , new Object[] {
            T01PR10_A3112AlcDivAbr, T01PR10_n3112AlcDivAbr
            }
            , new Object[] {
            T01PR11_A13739findDomEnv, T01PR11_n13739findDomEnv
            }
            , new Object[] {
            T01PR13_A18AlbComImp, T01PR13_n18AlbComImp
            }
            , new Object[] {
            T01PR15_A266CliEnvLin, T01PR15_A14AlbComCod, T01PR15_A4829AlbComHor, T01PR15_A407EmprNom, T01PR15_n407EmprNom, T01PR15_A17AlbComFch, T01PR15_A22AlbComPri, T01PR15_A279CliNom, T01PR15_A3091CliDivTra, T01PR15_n3091CliDivTra,
            T01PR15_A16AlbComEst, T01PR15_A19AlbComLiC, T01PR15_A1783AlbComEso, T01PR15_A3095AlcDivTCod, T01PR15_A3112AlcDivAbr, T01PR15_n3112AlcDivAbr, T01PR15_A841TrnNom, T01PR15_n841TrnNom, T01PR15_A4830AlbComMat, T01PR15_A5142AlcDomEnv,
            T01PR15_A10013AlbComFs, T01PR15_A10014AlbComFd, T01PR15_A10015AlbComFdD, T01PR15_A3094AlbCSec, T01PR15_A10738AlbComSt, T01PR15_A10739AlbComEAT, T01PR15_A10740AlbComID, T01PR15_A10764AlbComAT, T01PR15_A5143AlcIvaCod, T01PR15_A11719AlbCTrNm,
            T01PR15_A11720AlbCTrDm, T01PR15_A11721AlbCTrNc, T01PR15_A14248AlbComATCU, T01PR15_A14249AlbComSerA, T01PR15_A14250AlbComTipA, T01PR15_A396EmprCod, T01PR15_A252CliCod, T01PR15_A840TrnCod, T01PR15_n840TrnCod, T01PR15_A3111AlcDivCod,
            T01PR15_A3140CliDivCod, T01PR15_n3140CliDivCod, T01PR15_A13739findDomEnv, T01PR15_n13739findDomEnv, T01PR15_A18AlbComImp, T01PR15_n18AlbComImp
            }
            , new Object[] {
            T01PR16_A3112AlcDivAbr, T01PR16_n3112AlcDivAbr
            }
            , new Object[] {
            T01PR17_A279CliNom, T01PR17_A3091CliDivTra, T01PR17_n3091CliDivTra, T01PR17_A3140CliDivCod, T01PR17_n3140CliDivCod
            }
            , new Object[] {
            T01PR18_A841TrnNom, T01PR18_n841TrnNom
            }
            , new Object[] {
            T01PR19_A13739findDomEnv, T01PR19_n13739findDomEnv
            }
            , new Object[] {
            T01PR21_A18AlbComImp, T01PR21_n18AlbComImp
            }
            , new Object[] {
            T01PR22_A396EmprCod, T01PR22_A14AlbComCod
            }
            , new Object[] {
            T01PR23_A396EmprCod, T01PR23_A14AlbComCod
            }
            , new Object[] {
            T01PR24_A396EmprCod, T01PR24_A14AlbComCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01PR28_A3112AlcDivAbr, T01PR28_n3112AlcDivAbr
            }
            , new Object[] {
            T01PR29_A279CliNom, T01PR29_A3091CliDivTra, T01PR29_n3091CliDivTra, T01PR29_A3140CliDivCod, T01PR29_n3140CliDivCod
            }
            , new Object[] {
            T01PR30_A841TrnNom, T01PR30_n841TrnNom
            }
            , new Object[] {
            T01PR31_A13739findDomEnv, T01PR31_n13739findDomEnv
            }
            , new Object[] {
            T01PR33_A18AlbComImp, T01PR33_n18AlbComImp
            }
            , new Object[] {
            T01PR34_A396EmprCod, T01PR34_A14AlbComCod, T01PR34_A2386AlbCObsLin
            }
            , new Object[] {
            }
            , new Object[] {
            T01PR36_A396EmprCod, T01PR36_A14AlbComCod
            }
            , new Object[] {
            T01PR37_A14AlbComCod, T01PR37_A20AlbComLin, T01PR37_A10355AlbComHd, T01PR37_A10356ALbComR, T01PR37_A10357AlbComP, T01PR37_A15AlbComDsc, T01PR37_A10806AlbComDc2, T01PR37_A5144AlbUcoDsc, T01PR37_n5144AlbUcoDsc, T01PR37_A13AlbComCnt,
            T01PR37_A21AlbComPre, T01PR37_A5010AlbComProd, T01PR37_A396EmprCod, T01PR37_A4717AlbComUni
            }
            , new Object[] {
            T01PR38_A5144AlbUcoDsc, T01PR38_n5144AlbUcoDsc
            }
            , new Object[] {
            T01PR39_A396EmprCod, T01PR39_A14AlbComCod, T01PR39_A20AlbComLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01PR43_A5144AlbUcoDsc, T01PR43_n5144AlbUcoDsc
            }
            , new Object[] {
            T01PR44_A396EmprCod, T01PR44_A14AlbComCod, T01PR44_A20AlbComLin
            }
         }
      );
      AV55Pgmname = "DocumentoComercialv02" ;
      AV54Pgmdesc = httpContext.getMessage( "Documento Comercial (v02)", "") ;
      Z22AlbComPri = "" ;
      O22AlbComPri = "" ;
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
      i17AlbComFch = GXutil.today( ) ;
      A17AlbComFch = GXutil.today( ) ;
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
      Z10357AlbComP = " " ;
      A10357AlbComP = " " ;
      i10357AlbComP = " " ;
      Z10356ALbComR = (byte)(0) ;
      A10356ALbComR = (byte)(0) ;
      i10356ALbComR = (byte)(0) ;
      Z10355AlbComHd = 0 ;
      A10355AlbComHd = 0 ;
      i10355AlbComHd = 0 ;
      Z10013AlbComFs = GXutil.serverNow( context, remoteHandle, pr_default) ;
      A10013AlbComFs = GXutil.serverNow( context, remoteHandle, pr_default) ;
      i10013AlbComFs = GXutil.serverNow( context, remoteHandle, pr_default) ;
   }

   private byte Z16AlbComEst ;
   private byte Z1783AlbComEso ;
   private byte Z5142AlcDomEnv ;
   private byte Z10739AlbComEAT ;
   private byte Z3111AlcDivCod ;
   private byte N3111AlcDivCod ;
   private byte Z10356ALbComR ;
   private byte Z4717AlbComUni ;
   private byte GxWebError ;
   private byte A3111AlcDivCod ;
   private byte A5142AlcDomEnv ;
   private byte A4717AlbComUni ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte A10739AlbComEAT ;
   private byte A16AlbComEst ;
   private byte A1783AlbComEso ;
   private byte AV28Insert_AlcDivCod ;
   private byte A13739findDomEnv ;
   private byte A3140CliDivCod ;
   private byte A10356ALbComR ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte Z3140CliDivCod ;
   private byte Z13739findDomEnv ;
   private byte subGridlevel_albcom_Backcolorstyle ;
   private byte subGridlevel_albcom_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i3111AlcDivCod ;
   private byte i10739AlbComEAT ;
   private byte i10356ALbComR ;
   private byte subGridlevel_albcom_Allowselection ;
   private byte subGridlevel_albcom_Allowhovering ;
   private byte subGridlevel_albcom_Allowcollapsing ;
   private byte subGridlevel_albcom_Collapsed ;
   private byte GXv_int12[] ;
   private short Z19AlbComLiC ;
   private short Z840TrnCod ;
   private short O19AlbComLiC ;
   private short N840TrnCod ;
   private short Z20AlbComLin ;
   private short nRcdDeleted_2 ;
   private short nRcdExists_2 ;
   private short nIsMod_2 ;
   private short AV11Ctrlf ;
   private short A840TrnCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A19AlbComLiC ;
   private short AV42ComboTrnCod ;
   private short nBlankRcdCount2 ;
   private short RcdFound2 ;
   private short B19AlbComLiC ;
   private short nBlankRcdUsr2 ;
   private short AV29Insert_TrnCod ;
   private short AV7FirmaD ;
   private short AV17cernum ;
   private short AV16CambioP ;
   private short RcdFound1 ;
   private short A20AlbComLin ;
   private short s19AlbComLiC ;
   private short AV38FlagTintu ;
   private short AV8Torient ;
   private short AV9Moda21 ;
   private short AV10Ws ;
   private short AV12Modhh ;
   private short AV13Tinamar ;
   private short AV14Erfoc ;
   private short AV15Carvema ;
   private short GXv_int11[] ;
   private short nIsDirty_1 ;
   private short nIsDirty_2 ;
   private short i19AlbComLiC ;
   private int wcpOAV23AlbComCod ;
   private int Z14AlbComCod ;
   private int Z252CliCod ;
   private int O252CliCod ;
   private int nRC_GXsfl_113 ;
   private int nGXsfl_113_idx=1 ;
   private int N252CliCod ;
   private int Z10355AlbComHd ;
   private int A14AlbComCod ;
   private int AV34AlbLast ;
   private int A252CliCod ;
   private int AV23AlbComCod ;
   private int trnEnded ;
   private int edtAlbComCod_Enabled ;
   private int edtAlbComFch_Enabled ;
   private int edtAlbComHor_Enabled ;
   private int edtCliCod_Visible ;
   private int edtCliCod_Enabled ;
   private int edtAlcDomEnv_Enabled ;
   private int edtTrnCod_Visible ;
   private int edtTrnCod_Enabled ;
   private int edtAlbComMat_Enabled ;
   private int edtAlbComFs_Enabled ;
   private int edtAlbComATCU_Enabled ;
   private int edtAlbComID_Enabled ;
   private int edtAlbComAT_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int edtavPgmname_Enabled ;
   private int AV44ComboCliCod ;
   private int edtavComboclicod_Enabled ;
   private int edtavComboclicod_Visible ;
   private int edtavCombotrncod_Enabled ;
   private int edtavCombotrncod_Visible ;
   private int edtTrnNom_Visible ;
   private int edtTrnNom_Enabled ;
   private int edtCliNom_Visible ;
   private int edtCliNom_Enabled ;
   private int edtAlbComPri_Visible ;
   private int edtAlbComPri_Enabled ;
   private int B252CliCod ;
   private int edtAlbComLin_Enabled ;
   private int edtAlbComDsc_Enabled ;
   private int edtAlbComDc2_Enabled ;
   private int edtAlbComUni_Enabled ;
   private int edtAlbUcoDsc_Enabled ;
   private int edtAlbComCnt_Enabled ;
   private int edtAlbComPre_Enabled ;
   private int edtAlbCImpLin_Enabled ;
   private int edtAlbCImpL_Enabled ;
   private int edtAlbComHd_Enabled ;
   private int edtALbComR_Enabled ;
   private int edtAlbComP_Enabled ;
   private int edtAlbComProd_Enabled ;
   private int fRowAdded ;
   private int AV27Insert_CliCod ;
   private int AV37guiremcli ;
   private int Combo_clicod_Datalistupdateminimumcharacters ;
   private int Combo_clicod_Gxcontroltype ;
   private int Combo_trncod_Datalistupdateminimumcharacters ;
   private int Combo_trncod_Gxcontroltype ;
   private int Dvpanel_tableattributes_Gxcontroltype ;
   private int Dvpanel_unnamedtable1_Gxcontroltype ;
   private int Datamonjs_Gxcontroltype ;
   private int Combo_albcomuni_Datalistupdateminimumcharacters ;
   private int Combo_albcomuni_Gxcontroltype ;
   private int A10355AlbComHd ;
   private int AV39CliCod ;
   private int AV56GXV1 ;
   private int AV57GXV2 ;
   private int GX_JID ;
   private int subGridlevel_albcom_Backcolor ;
   private int subGridlevel_albcom_Allbackcolor ;
   private int defedtAlbComProd_Enabled ;
   private int defedtAlbComP_Enabled ;
   private int defedtALbComR_Enabled ;
   private int defedtAlbComHd_Enabled ;
   private int defedtAlbCImpL_Enabled ;
   private int defedtAlbUcoDsc_Enabled ;
   private int defedtAlbComLin_Enabled ;
   private int i10355AlbComHd ;
   private int idxLst ;
   private int subGridlevel_albcom_Selectedindex ;
   private int subGridlevel_albcom_Selectioncolor ;
   private int subGridlevel_albcom_Hoveringcolor ;
   private int GXv_int8[] ;
   private int ZV34AlbLast ;
   private int ZV37guiremcli ;
   private long GRIDLEVEL_ALBCOM_nFirstRecordOnPage ;
   private java.math.BigDecimal O18AlbComImp ;
   private java.math.BigDecimal Z13AlbComCnt ;
   private java.math.BigDecimal Z21AlbComPre ;
   private java.math.BigDecimal O12AlbCImpLin ;
   private java.math.BigDecimal B18AlbComImp ;
   private java.math.BigDecimal A18AlbComImp ;
   private java.math.BigDecimal A13AlbComCnt ;
   private java.math.BigDecimal A21AlbComPre ;
   private java.math.BigDecimal A12AlbCImpLin ;
   private java.math.BigDecimal A3914AlbCImpL ;
   private java.math.BigDecimal s18AlbComImp ;
   private java.math.BigDecimal T12AlbCImpLin ;
   private java.math.BigDecimal Z18AlbComImp ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV20EmprCod ;
   private String wcpOAV31AlbComPri ;
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
   private String O22AlbComPri ;
   private String Combo_trncod_Selectedvalue_get ;
   private String Combo_clicod_Selectedvalue_get ;
   private String Z10357AlbComP ;
   private String Z15AlbComDsc ;
   private String Z10806AlbComDc2 ;
   private String Z5010AlbComProd ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String AV32ContCod ;
   private String A22AlbComPri ;
   private String Gx_mode ;
   private String AV20EmprCod ;
   private String AV31AlbComPri ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtAlbComCod_Internalname ;
   private String sGXsfl_113_idx="0001" ;
   private String edtAlbComUni_Horizontalalignment ;
   private String edtAlbComUni_Internalname ;
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
   private String divUnnamedtable2_Internalname ;
   private String TempTags ;
   private String edtAlbComCod_Jsonclick ;
   private String edtAlbComFch_Internalname ;
   private String edtAlbComFch_Jsonclick ;
   private String edtAlbComHor_Internalname ;
   private String edtAlbComHor_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String divTablesplittedclicod_Internalname ;
   private String lblTextblockclicod_Internalname ;
   private String lblTextblockclicod_Jsonclick ;
   private String Combo_clicod_Caption ;
   private String Combo_clicod_Cls ;
   private String Combo_clicod_Internalname ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String divTablesplittedalcdomenv_Internalname ;
   private String lblTextblockalcdomenv_Internalname ;
   private String lblTextblockalcdomenv_Jsonclick ;
   private String sStyleString ;
   private String tblTablemergedalcdomenv_Internalname ;
   private String edtAlcDomEnv_Internalname ;
   private String edtAlcDomEnv_Jsonclick ;
   private String tblTablesearcrroot_Internalname ;
   private String lblPromptclienv_Internalname ;
   private String lblPromptclienv_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
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
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtAlbComFs_Internalname ;
   private String edtAlbComFs_Jsonclick ;
   private String edtAlbComATCU_Internalname ;
   private String A14248AlbComATCU ;
   private String edtAlbComATCU_Jsonclick ;
   private String edtAlbComID_Internalname ;
   private String A10740AlbComID ;
   private String edtAlbComID_Jsonclick ;
   private String edtAlbComAT_Internalname ;
   private String A10764AlbComAT ;
   private String edtAlbComAT_Jsonclick ;
   private String divTableleaflevel_albcom_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV55Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_clicod_Internalname ;
   private String edtavComboclicod_Internalname ;
   private String edtavComboclicod_Jsonclick ;
   private String divSectionattribute_trncod_Internalname ;
   private String edtavCombotrncod_Internalname ;
   private String edtavCombotrncod_Jsonclick ;
   private String Combo_albcomuni_Caption ;
   private String Combo_albcomuni_Cls ;
   private String Combo_albcomuni_Internalname ;
   private String edtTrnNom_Internalname ;
   private String A841TrnNom ;
   private String edtTrnNom_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String edtAlbComPri_Internalname ;
   private String edtAlbComPri_Jsonclick ;
   private String B22AlbComPri ;
   private String sMode2 ;
   private String edtAlbComLin_Internalname ;
   private String edtAlbComDsc_Internalname ;
   private String edtAlbComDc2_Internalname ;
   private String edtAlbUcoDsc_Internalname ;
   private String edtAlbComCnt_Internalname ;
   private String edtAlbComPre_Internalname ;
   private String edtAlbCImpLin_Internalname ;
   private String edtAlbCImpL_Internalname ;
   private String edtAlbComHd_Internalname ;
   private String edtALbComR_Internalname ;
   private String edtAlbComP_Internalname ;
   private String edtAlbComProd_Internalname ;
   private String subGridlevel_albcom_Internalname ;
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
   private String AV36oldAlbComPri ;
   private String AV54Pgmdesc ;
   private String A407EmprNom ;
   private String A3091CliDivTra ;
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
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Dvpanel_unnamedtable1_Objectcall ;
   private String Dvpanel_unnamedtable1_Class ;
   private String Dvpanel_unnamedtable1_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String Combo_albcomuni_Objectcall ;
   private String Combo_albcomuni_Class ;
   private String Combo_albcomuni_Icontype ;
   private String Combo_albcomuni_Icon ;
   private String Combo_albcomuni_Tooltip ;
   private String Combo_albcomuni_Selectedvalue_set ;
   private String Combo_albcomuni_Selectedvalue_get ;
   private String Combo_albcomuni_Selectedtext_set ;
   private String Combo_albcomuni_Selectedtext_get ;
   private String Combo_albcomuni_Gamoauthtoken ;
   private String Combo_albcomuni_Ddointernalname ;
   private String Combo_albcomuni_Titlecontrolalign ;
   private String Combo_albcomuni_Dropdownoptionstype ;
   private String Combo_albcomuni_Titlecontrolidtoreplace ;
   private String Combo_albcomuni_Datalisttype ;
   private String Combo_albcomuni_Datalistfixedvalues ;
   private String Combo_albcomuni_Datalistproc ;
   private String Combo_albcomuni_Datalistprocparametersprefix ;
   private String Combo_albcomuni_Remoteservicesparameters ;
   private String Combo_albcomuni_Htmltemplate ;
   private String Combo_albcomuni_Multiplevaluestype ;
   private String Combo_albcomuni_Loadingdata ;
   private String Combo_albcomuni_Noresultsfound ;
   private String Combo_albcomuni_Emptyitemtext ;
   private String Combo_albcomuni_Onlyselectedvalues ;
   private String Combo_albcomuni_Selectalltext ;
   private String Combo_albcomuni_Multiplevaluesseparator ;
   private String Combo_albcomuni_Addnewoptiontext ;
   private String hsh ;
   private String sMode1 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String GXCCtl ;
   private String A15AlbComDsc ;
   private String A10806AlbComDc2 ;
   private String A5144AlbUcoDsc ;
   private String A10357AlbComP ;
   private String A5010AlbComProd ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV19Station ;
   private String AV21EmprNom ;
   private String AV22UsurCod ;
   private String GXt_char1 ;
   private String AV45Cadena ;
   private String AV46Hash ;
   private String Z3112AlcDivAbr ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z3091CliDivTra ;
   private String Z841TrnNom ;
   private String Z5144AlbUcoDsc ;
   private String sGXsfl_113_fel_idx="0001" ;
   private String subGridlevel_albcom_Class ;
   private String subGridlevel_albcom_Linesclass ;
   private String ROClassString ;
   private String edtAlbComLin_Jsonclick ;
   private String edtAlbComDsc_Jsonclick ;
   private String edtAlbComDc2_Jsonclick ;
   private String edtAlbComUni_Jsonclick ;
   private String edtAlbUcoDsc_Jsonclick ;
   private String edtAlbComCnt_Jsonclick ;
   private String edtAlbComPre_Jsonclick ;
   private String edtAlbCImpLin_Jsonclick ;
   private String edtAlbCImpL_Jsonclick ;
   private String edtAlbComHd_Jsonclick ;
   private String edtALbComR_Jsonclick ;
   private String edtAlbComP_Jsonclick ;
   private String edtAlbComProd_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i10738AlbComSt ;
   private String i10740AlbComID ;
   private String i10764AlbComAT ;
   private String i3095AlcDivTCod ;
   private String i22AlbComPri ;
   private String i14248AlbComATCU ;
   private String i14249AlbComSerA ;
   private String i14250AlbComTipA ;
   private String i10357AlbComP ;
   private String subGridlevel_albcom_Header ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String ZV36oldAlbComPri ;
   private java.util.Date Z4829AlbComHor ;
   private java.util.Date Z10013AlbComFs ;
   private java.util.Date A4829AlbComHor ;
   private java.util.Date A10013AlbComFs ;
   private java.util.Date i10013AlbComFs ;
   private java.util.Date GXt_dtime17 ;
   private java.util.Date GXv_dtime10[] ;
   private java.util.Date Z17AlbComFch ;
   private java.util.Date AV33Fch ;
   private java.util.Date A17AlbComFch ;
   private java.util.Date i17AlbComFch ;
   private java.util.Date GXv_date18[] ;
   private java.util.Date GXv_date9[] ;
   private java.util.Date ZV33Fch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n840TrnCod ;
   private boolean wbErr ;
   private boolean bGXsfl_113_Refreshing=false ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_clicod_Emptyitem ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Combo_albcomuni_Isgriditem ;
   private boolean Combo_albcomuni_Emptyitem ;
   private boolean n18AlbComImp ;
   private boolean n13739findDomEnv ;
   private boolean n407EmprNom ;
   private boolean n3091CliDivTra ;
   private boolean n3140CliDivCod ;
   private boolean n3112AlcDivAbr ;
   private boolean Combo_clicod_Enabled ;
   private boolean Combo_clicod_Visible ;
   private boolean Combo_clicod_Allowmultipleselection ;
   private boolean Combo_clicod_Isgriditem ;
   private boolean Combo_clicod_Hasdescription ;
   private boolean Combo_clicod_Includeonlyselectedoption ;
   private boolean Combo_clicod_Includeselectalloption ;
   private boolean Combo_clicod_Includeaddnewoption ;
   private boolean Combo_trncod_Enabled ;
   private boolean Combo_trncod_Visible ;
   private boolean Combo_trncod_Allowmultipleselection ;
   private boolean Combo_trncod_Isgriditem ;
   private boolean Combo_trncod_Hasdescription ;
   private boolean Combo_trncod_Includeonlyselectedoption ;
   private boolean Combo_trncod_Includeselectalloption ;
   private boolean Combo_trncod_Emptyitem ;
   private boolean Combo_trncod_Includeaddnewoption ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Dvpanel_unnamedtable1_Enabled ;
   private boolean Dvpanel_unnamedtable1_Showheader ;
   private boolean Dvpanel_unnamedtable1_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean Combo_albcomuni_Enabled ;
   private boolean Combo_albcomuni_Visible ;
   private boolean Combo_albcomuni_Allowmultipleselection ;
   private boolean Combo_albcomuni_Hasdescription ;
   private boolean Combo_albcomuni_Includeonlyselectedoption ;
   private boolean Combo_albcomuni_Includeselectalloption ;
   private boolean Combo_albcomuni_Includeaddnewoption ;
   private boolean n841TrnNom ;
   private boolean n5144AlbUcoDsc ;
   private boolean returnInSub ;
   private boolean AV48OK ;
   private boolean GXv_boolean14[] ;
   private boolean Gx_longc ;
   private String AV35Msg_f ;
   private String AV18Msg_errAT ;
   private String AV41ComboSelectedValue ;
   private String ZV35Msg_f ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_albcomContainer ;
   private com.genexus.webpanels.GXWebRow Gridlevel_albcomRow ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_albcomColumn ;
   private com.genexus.webpanels.WebSession AV26WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicod ;
   private com.genexus.webpanels.GXUserControl ucCombo_trncod ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucCombo_albcomuni ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbAlbComEAT ;
   private IDataStoreProvider pr_default ;
   private String[] T01PR7_A407EmprNom ;
   private boolean[] T01PR7_n407EmprNom ;
   private java.math.BigDecimal[] T01PR13_A18AlbComImp ;
   private boolean[] T01PR13_n18AlbComImp ;
   private String[] T01PR8_A279CliNom ;
   private String[] T01PR8_A3091CliDivTra ;
   private boolean[] T01PR8_n3091CliDivTra ;
   private byte[] T01PR8_A3140CliDivCod ;
   private boolean[] T01PR8_n3140CliDivCod ;
   private String[] T01PR9_A841TrnNom ;
   private boolean[] T01PR9_n841TrnNom ;
   private String[] T01PR10_A3112AlcDivAbr ;
   private boolean[] T01PR10_n3112AlcDivAbr ;
   private byte[] T01PR15_A266CliEnvLin ;
   private int[] T01PR15_A14AlbComCod ;
   private java.util.Date[] T01PR15_A4829AlbComHor ;
   private String[] T01PR15_A407EmprNom ;
   private boolean[] T01PR15_n407EmprNom ;
   private java.util.Date[] T01PR15_A17AlbComFch ;
   private String[] T01PR15_A22AlbComPri ;
   private String[] T01PR15_A279CliNom ;
   private String[] T01PR15_A3091CliDivTra ;
   private boolean[] T01PR15_n3091CliDivTra ;
   private byte[] T01PR15_A16AlbComEst ;
   private short[] T01PR15_A19AlbComLiC ;
   private byte[] T01PR15_A1783AlbComEso ;
   private String[] T01PR15_A3095AlcDivTCod ;
   private String[] T01PR15_A3112AlcDivAbr ;
   private boolean[] T01PR15_n3112AlcDivAbr ;
   private String[] T01PR15_A841TrnNom ;
   private boolean[] T01PR15_n841TrnNom ;
   private String[] T01PR15_A4830AlbComMat ;
   private byte[] T01PR15_A5142AlcDomEnv ;
   private java.util.Date[] T01PR15_A10013AlbComFs ;
   private String[] T01PR15_A10014AlbComFd ;
   private String[] T01PR15_A10015AlbComFdD ;
   private String[] T01PR15_A3094AlbCSec ;
   private String[] T01PR15_A10738AlbComSt ;
   private byte[] T01PR15_A10739AlbComEAT ;
   private String[] T01PR15_A10740AlbComID ;
   private String[] T01PR15_A10764AlbComAT ;
   private String[] T01PR15_A5143AlcIvaCod ;
   private String[] T01PR15_A11719AlbCTrNm ;
   private String[] T01PR15_A11720AlbCTrDm ;
   private String[] T01PR15_A11721AlbCTrNc ;
   private String[] T01PR15_A14248AlbComATCU ;
   private String[] T01PR15_A14249AlbComSerA ;
   private String[] T01PR15_A14250AlbComTipA ;
   private String[] T01PR15_A396EmprCod ;
   private int[] T01PR15_A252CliCod ;
   private short[] T01PR15_A840TrnCod ;
   private boolean[] T01PR15_n840TrnCod ;
   private byte[] T01PR15_A3111AlcDivCod ;
   private byte[] T01PR15_A3140CliDivCod ;
   private boolean[] T01PR15_n3140CliDivCod ;
   private byte[] T01PR15_A13739findDomEnv ;
   private boolean[] T01PR15_n13739findDomEnv ;
   private java.math.BigDecimal[] T01PR15_A18AlbComImp ;
   private boolean[] T01PR15_n18AlbComImp ;
   private byte[] T01PR11_A13739findDomEnv ;
   private boolean[] T01PR11_n13739findDomEnv ;
   private String[] T01PR16_A3112AlcDivAbr ;
   private boolean[] T01PR16_n3112AlcDivAbr ;
   private String[] T01PR17_A279CliNom ;
   private String[] T01PR17_A3091CliDivTra ;
   private boolean[] T01PR17_n3091CliDivTra ;
   private byte[] T01PR17_A3140CliDivCod ;
   private boolean[] T01PR17_n3140CliDivCod ;
   private String[] T01PR18_A841TrnNom ;
   private boolean[] T01PR18_n841TrnNom ;
   private byte[] T01PR19_A13739findDomEnv ;
   private boolean[] T01PR19_n13739findDomEnv ;
   private java.math.BigDecimal[] T01PR21_A18AlbComImp ;
   private boolean[] T01PR21_n18AlbComImp ;
   private String[] T01PR22_A396EmprCod ;
   private int[] T01PR22_A14AlbComCod ;
   private int[] T01PR6_A14AlbComCod ;
   private java.util.Date[] T01PR6_A4829AlbComHor ;
   private java.util.Date[] T01PR6_A17AlbComFch ;
   private String[] T01PR6_A22AlbComPri ;
   private byte[] T01PR6_A16AlbComEst ;
   private short[] T01PR6_A19AlbComLiC ;
   private byte[] T01PR6_A1783AlbComEso ;
   private String[] T01PR6_A3095AlcDivTCod ;
   private String[] T01PR6_A4830AlbComMat ;
   private byte[] T01PR6_A5142AlcDomEnv ;
   private java.util.Date[] T01PR6_A10013AlbComFs ;
   private String[] T01PR6_A10014AlbComFd ;
   private String[] T01PR6_A10015AlbComFdD ;
   private String[] T01PR6_A3094AlbCSec ;
   private String[] T01PR6_A10738AlbComSt ;
   private byte[] T01PR6_A10739AlbComEAT ;
   private String[] T01PR6_A10740AlbComID ;
   private String[] T01PR6_A10764AlbComAT ;
   private String[] T01PR6_A5143AlcIvaCod ;
   private String[] T01PR6_A11719AlbCTrNm ;
   private String[] T01PR6_A11720AlbCTrDm ;
   private String[] T01PR6_A11721AlbCTrNc ;
   private String[] T01PR6_A14248AlbComATCU ;
   private String[] T01PR6_A14249AlbComSerA ;
   private String[] T01PR6_A14250AlbComTipA ;
   private String[] T01PR6_A396EmprCod ;
   private int[] T01PR6_A252CliCod ;
   private short[] T01PR6_A840TrnCod ;
   private boolean[] T01PR6_n840TrnCod ;
   private byte[] T01PR6_A3111AlcDivCod ;
   private String[] T01PR23_A396EmprCod ;
   private int[] T01PR23_A14AlbComCod ;
   private String[] T01PR24_A396EmprCod ;
   private int[] T01PR24_A14AlbComCod ;
   private int[] T01PR5_A14AlbComCod ;
   private java.util.Date[] T01PR5_A4829AlbComHor ;
   private java.util.Date[] T01PR5_A17AlbComFch ;
   private String[] T01PR5_A22AlbComPri ;
   private byte[] T01PR5_A16AlbComEst ;
   private short[] T01PR5_A19AlbComLiC ;
   private byte[] T01PR5_A1783AlbComEso ;
   private String[] T01PR5_A3095AlcDivTCod ;
   private String[] T01PR5_A4830AlbComMat ;
   private byte[] T01PR5_A5142AlcDomEnv ;
   private java.util.Date[] T01PR5_A10013AlbComFs ;
   private String[] T01PR5_A10014AlbComFd ;
   private String[] T01PR5_A10015AlbComFdD ;
   private String[] T01PR5_A3094AlbCSec ;
   private String[] T01PR5_A10738AlbComSt ;
   private byte[] T01PR5_A10739AlbComEAT ;
   private String[] T01PR5_A10740AlbComID ;
   private String[] T01PR5_A10764AlbComAT ;
   private String[] T01PR5_A5143AlcIvaCod ;
   private String[] T01PR5_A11719AlbCTrNm ;
   private String[] T01PR5_A11720AlbCTrDm ;
   private String[] T01PR5_A11721AlbCTrNc ;
   private String[] T01PR5_A14248AlbComATCU ;
   private String[] T01PR5_A14249AlbComSerA ;
   private String[] T01PR5_A14250AlbComTipA ;
   private String[] T01PR5_A396EmprCod ;
   private int[] T01PR5_A252CliCod ;
   private short[] T01PR5_A840TrnCod ;
   private boolean[] T01PR5_n840TrnCod ;
   private byte[] T01PR5_A3111AlcDivCod ;
   private String[] T01PR28_A3112AlcDivAbr ;
   private boolean[] T01PR28_n3112AlcDivAbr ;
   private String[] T01PR29_A279CliNom ;
   private String[] T01PR29_A3091CliDivTra ;
   private boolean[] T01PR29_n3091CliDivTra ;
   private byte[] T01PR29_A3140CliDivCod ;
   private boolean[] T01PR29_n3140CliDivCod ;
   private String[] T01PR30_A841TrnNom ;
   private boolean[] T01PR30_n841TrnNom ;
   private byte[] T01PR31_A13739findDomEnv ;
   private boolean[] T01PR31_n13739findDomEnv ;
   private java.math.BigDecimal[] T01PR33_A18AlbComImp ;
   private boolean[] T01PR33_n18AlbComImp ;
   private String[] T01PR34_A396EmprCod ;
   private int[] T01PR34_A14AlbComCod ;
   private byte[] T01PR34_A2386AlbCObsLin ;
   private String[] T01PR36_A396EmprCod ;
   private int[] T01PR36_A14AlbComCod ;
   private int[] T01PR37_A14AlbComCod ;
   private short[] T01PR37_A20AlbComLin ;
   private int[] T01PR37_A10355AlbComHd ;
   private byte[] T01PR37_A10356ALbComR ;
   private String[] T01PR37_A10357AlbComP ;
   private String[] T01PR37_A15AlbComDsc ;
   private String[] T01PR37_A10806AlbComDc2 ;
   private String[] T01PR37_A5144AlbUcoDsc ;
   private boolean[] T01PR37_n5144AlbUcoDsc ;
   private java.math.BigDecimal[] T01PR37_A13AlbComCnt ;
   private java.math.BigDecimal[] T01PR37_A21AlbComPre ;
   private String[] T01PR37_A5010AlbComProd ;
   private String[] T01PR37_A396EmprCod ;
   private byte[] T01PR37_A4717AlbComUni ;
   private String[] T01PR4_A5144AlbUcoDsc ;
   private boolean[] T01PR4_n5144AlbUcoDsc ;
   private String[] T01PR38_A5144AlbUcoDsc ;
   private boolean[] T01PR38_n5144AlbUcoDsc ;
   private String[] T01PR39_A396EmprCod ;
   private int[] T01PR39_A14AlbComCod ;
   private short[] T01PR39_A20AlbComLin ;
   private int[] T01PR3_A14AlbComCod ;
   private short[] T01PR3_A20AlbComLin ;
   private int[] T01PR3_A10355AlbComHd ;
   private byte[] T01PR3_A10356ALbComR ;
   private String[] T01PR3_A10357AlbComP ;
   private String[] T01PR3_A15AlbComDsc ;
   private String[] T01PR3_A10806AlbComDc2 ;
   private java.math.BigDecimal[] T01PR3_A13AlbComCnt ;
   private java.math.BigDecimal[] T01PR3_A21AlbComPre ;
   private String[] T01PR3_A5010AlbComProd ;
   private String[] T01PR3_A396EmprCod ;
   private byte[] T01PR3_A4717AlbComUni ;
   private int[] T01PR2_A14AlbComCod ;
   private short[] T01PR2_A20AlbComLin ;
   private int[] T01PR2_A10355AlbComHd ;
   private byte[] T01PR2_A10356ALbComR ;
   private String[] T01PR2_A10357AlbComP ;
   private String[] T01PR2_A15AlbComDsc ;
   private String[] T01PR2_A10806AlbComDc2 ;
   private java.math.BigDecimal[] T01PR2_A13AlbComCnt ;
   private java.math.BigDecimal[] T01PR2_A21AlbComPre ;
   private String[] T01PR2_A5010AlbComProd ;
   private String[] T01PR2_A396EmprCod ;
   private byte[] T01PR2_A4717AlbComUni ;
   private String[] T01PR43_A5144AlbUcoDsc ;
   private boolean[] T01PR43_n5144AlbUcoDsc ;
   private String[] T01PR44_A396EmprCod ;
   private int[] T01PR44_A14AlbComCod ;
   private short[] T01PR44_A20AlbComLin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV43CliCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV40TrnCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV52AlbComUni_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item15 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item16[] ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV47Messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message13[] ;
   private com.genexus.SdtMessages_Message AV51Message ;
   private app.wwpbaseobjects.SdtWWPContext AV24WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV25TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV30TrnContextAtt ;
}

final  class documentocomercialv02__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class documentocomercialv02__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class documentocomercialv02__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class documentocomercialv02__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class documentocomercialv02__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01PR2", "SELECT AlbComCod, AlbComLin, AlbComHd, ALbComR, AlbComP, AlbComDsc, AlbComDc2, AlbComCnt, AlbComPre, AlbComProd, EmprCod, AlbComUni FROM TXPLALCOM WHERE EmprCod = ? AND AlbComCod = ? AND AlbComLin = ?  FOR UPDATE OF AlbComHd, ALbComR, AlbComP, AlbComDsc, AlbComDc2, AlbComCnt, AlbComPre, AlbComProd, AlbComUni NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PR3", "SELECT AlbComCod, AlbComLin, AlbComHd, ALbComR, AlbComP, AlbComDsc, AlbComDc2, AlbComCnt, AlbComPre, AlbComProd, EmprCod, AlbComUni FROM TXPLALCOM WHERE EmprCod = ? AND AlbComCod = ? AND AlbComLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PR4", "SELECT UniDsc AS AlbUcoDsc FROM TXPTIPUNI WHERE EmprCod = ? AND UniCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PR5", "SELECT AlbComCod, AlbComHor, AlbComFch, AlbComPri, AlbComEst, AlbComLiC, AlbComEso, AlcDivTCod, AlbComMat, AlcDomEnv, AlbComFs, AlbComFd, AlbComFdD, AlbCSec, AlbComSt, AlbComEAT, AlbComID, AlbComAT, AlcIvaCod, AlbCTrNm, AlbCTrDm, AlbCTrNc, AlbComATCU, AlbComSerA, AlbComTipA, EmprCod, CliCod, TrnCod, AlcDivCod FROM TXPCALCOM WHERE EmprCod = ? AND AlbComCod = ?  FOR UPDATE OF AlbComHor, AlbComFch, AlbComPri, AlbComEst, AlbComLiC, AlbComEso, AlcDivTCod, AlbComMat, AlcDomEnv, AlbComFs, AlbComFd, AlbComFdD, AlbCSec, AlbComSt, AlbComEAT, AlbComID, AlbComAT, AlcIvaCod, AlbCTrNm, AlbCTrDm, AlbCTrNc, AlbComATCU, AlbComSerA, AlbComTipA, CliCod, TrnCod, AlcDivCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PR6", "SELECT AlbComCod, AlbComHor, AlbComFch, AlbComPri, AlbComEst, AlbComLiC, AlbComEso, AlcDivTCod, AlbComMat, AlcDomEnv, AlbComFs, AlbComFd, AlbComFdD, AlbCSec, AlbComSt, AlbComEAT, AlbComID, AlbComAT, AlcIvaCod, AlbCTrNm, AlbCTrDm, AlbCTrNc, AlbComATCU, AlbComSerA, AlbComTipA, EmprCod, CliCod, TrnCod, AlcDivCod FROM TXPCALCOM WHERE EmprCod = ? AND AlbComCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PR7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PR8", "SELECT CliNom, CliDivTra, CliDivCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PR9", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PR10", "SELECT DivAbr AS AlcDivAbr FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PR11", "SELECT COALESCE( CliEnvLin, 0) AS findDomEnv FROM TXPCLIENV WHERE EmprCod = ? AND CliCod = ? AND CliEnvLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PR13", "SELECT COALESCE( T1.AlbComImp, 0) AS AlbComImp FROM (SELECT SUM(ROUND(( AlbComPre * CAST(AlbComCnt AS NUMERIC(23,10))), 2)) AS AlbComImp, EmprCod, AlbComCod FROM TXPLALCOM GROUP BY EmprCod, AlbComCod ) T1 WHERE T1.EmprCod = ? AND T1.AlbComCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PR15", "SELECT /*+ FIRST_ROWS(100) */ T7.CliEnvLin, TM1.AlbComCod, TM1.AlbComHor, T3.EmprNom, TM1.AlbComFch, TM1.AlbComPri, T5.CliNom, T5.CliDivTra, TM1.AlbComEst, TM1.AlbComLiC, TM1.AlbComEso, TM1.AlcDivTCod, T2.DivAbr AS AlcDivAbr, T6.TrnNom, TM1.AlbComMat, TM1.AlcDomEnv, TM1.AlbComFs, TM1.AlbComFd, TM1.AlbComFdD, TM1.AlbCSec, TM1.AlbComSt, TM1.AlbComEAT, TM1.AlbComID, TM1.AlbComAT, TM1.AlcIvaCod, TM1.AlbCTrNm, TM1.AlbCTrDm, TM1.AlbCTrNc, TM1.AlbComATCU, TM1.AlbComSerA, TM1.AlbComTipA, TM1.EmprCod, TM1.CliCod, TM1.TrnCod, TM1.AlcDivCod AS AlcDivCod, T5.CliDivCod, COALESCE( T7.CliEnvLin, 0) AS findDomEnv, COALESCE( T4.AlbComImp, 0) AS AlbComImp FROM ((((((TXPCALCOM TM1 INNER JOIN TXPDIVISA T2 ON T2.DivCod = TM1.AlcDivCod) INNER JOIN TXPEMPRES T3 ON T3.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT SUM(ROUND(( AlbComPre * CAST(AlbComCnt AS NUMERIC(23,10))), 2)) AS AlbComImp, EmprCod, AlbComCod FROM TXPLALCOM GROUP BY EmprCod, AlbComCod ) T4 ON T4.EmprCod = TM1.EmprCod AND T4.AlbComCod = TM1.AlbComCod) INNER JOIN TXPCLIENT T5 ON T5.EmprCod = TM1.EmprCod AND T5.CliCod = TM1.CliCod) LEFT JOIN TXPTRANSP T6 ON T6.EmprCod = TM1.EmprCod AND T6.TrnCod = TM1.TrnCod) LEFT JOIN TXPCLIENV T7 ON T7.EmprCod = TM1.EmprCod AND T7.CliCod = TM1.CliCod AND T7.CliEnvLin = TM1.AlcDomEnv) WHERE TM1.EmprCod = ? and TM1.AlbComCod = ? ORDER BY TM1.EmprCod, TM1.AlbComCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PR16", "SELECT DivAbr AS AlcDivAbr FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PR17", "SELECT CliNom, CliDivTra, CliDivCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PR18", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PR19", "SELECT COALESCE( CliEnvLin, 0) AS findDomEnv FROM TXPCLIENV WHERE EmprCod = ? AND CliCod = ? AND CliEnvLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PR21", "SELECT COALESCE( T1.AlbComImp, 0) AS AlbComImp FROM (SELECT SUM(ROUND(( AlbComPre * CAST(AlbComCnt AS NUMERIC(23,10))), 2)) AS AlbComImp, EmprCod, AlbComCod FROM TXPLALCOM GROUP BY EmprCod, AlbComCod ) T1 WHERE T1.EmprCod = ? AND T1.AlbComCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PR22", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbComCod FROM TXPCALCOM WHERE EmprCod = ? AND AlbComCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PR23", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbComCod FROM TXPCALCOM WHERE ( EmprCod > ? or EmprCod = ? and AlbComCod > ?) ORDER BY EmprCod, AlbComCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PR24", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbComCod FROM TXPCALCOM WHERE ( EmprCod < ? or EmprCod = ? and AlbComCod < ?) ORDER BY EmprCod DESC, AlbComCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01PR25", "INSERT INTO TXPCALCOM(AlbComCod, AlbComHor, AlbComFch, AlbComPri, AlbComEst, AlbComLiC, AlbComEso, AlcDivTCod, AlbComMat, AlcDomEnv, AlbComFs, AlbComFd, AlbComFdD, AlbCSec, AlbComSt, AlbComEAT, AlbComID, AlbComAT, AlcIvaCod, AlbCTrNm, AlbCTrDm, AlbCTrNc, AlbComATCU, AlbComSerA, AlbComTipA, EmprCod, CliCod, TrnCod, AlcDivCod, AlbCObsCon) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK, "TXPCALCOM")
         ,new UpdateCursor("T01PR26", "UPDATE TXPCALCOM SET AlbComHor=?, AlbComFch=?, AlbComPri=?, AlbComEst=?, AlbComLiC=?, AlbComEso=?, AlcDivTCod=?, AlbComMat=?, AlcDomEnv=?, AlbComFs=?, AlbComFd=?, AlbComFdD=?, AlbCSec=?, AlbComSt=?, AlbComEAT=?, AlbComID=?, AlbComAT=?, AlcIvaCod=?, AlbCTrNm=?, AlbCTrDm=?, AlbCTrNc=?, AlbComATCU=?, AlbComSerA=?, AlbComTipA=?, CliCod=?, TrnCod=?, AlcDivCod=?  WHERE EmprCod = ? AND AlbComCod = ?", GX_NOMASK, "TXPCALCOM")
         ,new UpdateCursor("T01PR27", "DELETE FROM TXPCALCOM  WHERE EmprCod = ? AND AlbComCod = ?", GX_NOMASK, "TXPCALCOM")
         ,new ForEachCursor("T01PR28", "SELECT DivAbr AS AlcDivAbr FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PR29", "SELECT CliNom, CliDivTra, CliDivCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PR30", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PR31", "SELECT COALESCE( CliEnvLin, 0) AS findDomEnv FROM TXPCLIENV WHERE EmprCod = ? AND CliCod = ? AND CliEnvLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PR33", "SELECT COALESCE( T1.AlbComImp, 0) AS AlbComImp FROM (SELECT SUM(ROUND(( AlbComPre * CAST(AlbComCnt AS NUMERIC(23,10))), 2)) AS AlbComImp, EmprCod, AlbComCod FROM TXPLALCOM GROUP BY EmprCod, AlbComCod ) T1 WHERE T1.EmprCod = ? AND T1.AlbComCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PR34", "SELECT * FROM (SELECT EmprCod, AlbComCod, AlbCObsLin FROM TXPOBSALC WHERE EmprCod = ? AND AlbComCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01PR35", "UPDATE TXPCALCOM SET AlbComLiC=?  WHERE EmprCod = ? AND AlbComCod = ?", GX_NOMASK, "TXPCALCOM")
         ,new ForEachCursor("T01PR36", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, AlbComCod FROM TXPCALCOM ORDER BY EmprCod, AlbComCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PR37", "SELECT T1.AlbComCod, T1.AlbComLin, T1.AlbComHd, T1.ALbComR, T1.AlbComP, T1.AlbComDsc, T1.AlbComDc2, T2.UniDsc AS AlbUcoDsc, T1.AlbComCnt, T1.AlbComPre, T1.AlbComProd, T1.EmprCod, T1.AlbComUni AS AlbComUni FROM (TXPLALCOM T1 INNER JOIN TXPTIPUNI T2 ON T2.EmprCod = T1.EmprCod AND T2.UniCod = T1.AlbComUni) WHERE T1.EmprCod = ? and T1.AlbComCod = ? and T1.AlbComLin = ? ORDER BY T1.EmprCod, T1.AlbComCod, T1.AlbComLin ",true, GX_NOMASK, false, this,3, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PR38", "SELECT UniDsc AS AlbUcoDsc FROM TXPTIPUNI WHERE EmprCod = ? AND UniCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PR39", "SELECT EmprCod, AlbComCod, AlbComLin FROM TXPLALCOM WHERE EmprCod = ? AND AlbComCod = ? AND AlbComLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01PR40", "INSERT INTO TXPLALCOM(AlbComCod, AlbComLin, AlbComHd, ALbComR, AlbComP, AlbComDsc, AlbComDc2, AlbComCnt, AlbComPre, AlbComProd, EmprCod, AlbComUni, AlbComNRef, AlbComVDoc, AlbComPzas, AlbComMts, AlbComKgs, AlbComArt, AlbComArtD, AlbComCol) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', 0, 0, 0, ' ', ' ', ' ')", GX_NOMASK, "TXPLALCOM")
         ,new UpdateCursor("T01PR41", "UPDATE TXPLALCOM SET AlbComHd=?, ALbComR=?, AlbComP=?, AlbComDsc=?, AlbComDc2=?, AlbComCnt=?, AlbComPre=?, AlbComProd=?, AlbComUni=?  WHERE EmprCod = ? AND AlbComCod = ? AND AlbComLin = ?", GX_NOMASK, "TXPLALCOM")
         ,new UpdateCursor("T01PR42", "DELETE FROM TXPLALCOM  WHERE EmprCod = ? AND AlbComCod = ? AND AlbComLin = ?", GX_NOMASK, "TXPLALCOM")
         ,new ForEachCursor("T01PR43", "SELECT UniDsc AS AlbUcoDsc FROM TXPTIPUNI WHERE EmprCod = ? AND UniCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PR44", "SELECT EmprCod, AlbComCod, AlbComLin FROM TXPLALCOM WHERE EmprCod = ? and AlbComCod = ? ORDER BY EmprCod, AlbComCod, AlbComLin ",true, GX_NOMASK, false, this,3, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 40);
               ((String[]) buf[6])[0] = rslt.getString(7, 100);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((String[]) buf[10])[0] = rslt.getString(11, 3);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 40);
               ((String[]) buf[6])[0] = rslt.getString(7, 100);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((String[]) buf[10])[0] = rslt.getString(11, 3);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
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
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
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
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
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
               ((String[]) buf[18])[0] = rslt.getString(15, 20);
               ((byte[]) buf[19])[0] = rslt.getByte(16);
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
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 26 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 27 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 31 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 40);
               ((String[]) buf[6])[0] = rslt.getString(7, 100);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,5);
               ((String[]) buf[11])[0] = rslt.getString(11, 6);
               ((String[]) buf[12])[0] = rslt.getString(12, 3);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 38 :
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
               stmt.setByte(2, ((Number) parms[1]).byteValue());
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
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
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
            case 8 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
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
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 14 :
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
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
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
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 20 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               stmt.setString(9, (String)parms[8], 20);
               stmt.setByte(10, ((Number) parms[9]).byteValue());
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
            case 21 :
               stmt.setDateTime(1, (java.util.Date)parms[0], false);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 20);
               stmt.setByte(9, ((Number) parms[8]).byteValue());
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
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 23 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 25 :
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
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 29 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 34 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 40);
               stmt.setString(7, (String)parms[6], 100);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 5);
               stmt.setString(10, (String)parms[9], 6);
               stmt.setString(11, (String)parms[10], 3);
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               return;
            case 35 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 40);
               stmt.setString(5, (String)parms[4], 100);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 5);
               stmt.setString(8, (String)parms[7], 6);
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 3);
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

