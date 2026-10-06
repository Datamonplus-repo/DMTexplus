package app.almacensindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class almacentejido_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action93") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A45AlbRef = httpContext.GetPar( "AlbRef") ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_93_1S17( Gx_mode, A396EmprCod, A44AlbRecCod, A45AlbRef) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action94") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A45AlbRef = httpContext.GetPar( "AlbRef") ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_94_1S17( Gx_mode, A396EmprCod, A252CliCod, A45AlbRef) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel5"+"_"+"COMPOSICIO") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A45AlbRef = httpContext.GetPar( "AlbRef") ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx5asacomposicio1S17( A396EmprCod, A252CliCod, A45AlbRef) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel40"+"_"+"") == 0 )
      {
         AV8EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8EmprCod", AV8EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa103581S17( AV8EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel41"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel42"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_106") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_106( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_107") == 0 )
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
         gxload_107( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_108") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6263AlbRTartC = (short)(GXutil.lval( httpContext.GetPar( "AlbRTartC"))) ;
         n6263AlbRTartC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6263AlbRTartC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6263AlbRTartC), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_108( A396EmprCod, A6263AlbRTartC) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_109") == 0 )
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
         gxload_109( A396EmprCod, A840TrnCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_110") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A970ProceCod = (short)(GXutil.lval( httpContext.GetPar( "ProceCod"))) ;
         n970ProceCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_110( A396EmprCod, A970ProceCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_111") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1211TipEntCod = (short)(GXutil.lval( httpContext.GetPar( "TipEntCod"))) ;
         n1211TipEntCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_111( A396EmprCod, A1211TipEntCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_112") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4792AlmCod = (byte)(GXutil.lval( httpContext.GetPar( "AlmCod"))) ;
         n4792AlmCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4792AlmCod", GXutil.str( A4792AlmCod, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_112( A396EmprCod, A4792AlmCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_113") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A45AlbRef = httpContext.GetPar( "AlbRef") ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_113( A396EmprCod, A252CliCod, A45AlbRef) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_observacion") == 0 )
      {
         gxnrgridlevel_observacion_newrow_invoke( ) ;
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
            AV8EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8EmprCod", AV8EmprCod);
            AV77AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77AlbRecCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBRECCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV77AlbRecCod), "ZZZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Almacen Tejido", ""), (short)(0)) ;
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

   public void gxnrgridlevel_observacion_newrow_invoke( )
   {
      nRC_GXsfl_347 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_347"))) ;
      nGXsfl_347_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_347_idx"))) ;
      sGXsfl_347_idx = httpContext.GetPar( "sGXsfl_347_idx") ;
      A1301AlbRUlin = (byte)(GXutil.lval( httpContext.GetPar( "AlbRUlin"))) ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_observacion_newrow( ) ;
      /* End function gxnrGridlevel_observacion_newrow_invoke */
   }

   public almacentejido_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public almacentejido_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( almacentejido_impl.class ));
   }

   public almacentejido_impl( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbAlbRTam = new HTMLChoice();
      cmbAlbRUni = new HTMLChoice();
      cmbAlbREst = new HTMLChoice();
      cmbAlbRReo = new HTMLChoice();
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
      if ( cmbAlbRTam.getItemCount() > 0 )
      {
         A4601AlbRTam = cmbAlbRTam.getValidValue(A4601AlbRTam) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4601AlbRTam", A4601AlbRTam);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbRTam.setValue( GXutil.rtrim( A4601AlbRTam) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbRTam.getInternalname(), "Values", cmbAlbRTam.ToJavascriptSource(), true);
      }
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
      if ( cmbAlbREst.getItemCount() > 0 )
      {
         A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValidValue(GXutil.trim( GXutil.str( A47AlbREst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Values", cmbAlbREst.ToJavascriptSource(), true);
      }
      if ( cmbAlbRReo.getItemCount() > 0 )
      {
         A55AlbRReo = cmbAlbRReo.getValidValue(A55AlbRReo) ;
         httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbRReo.setValue( GXutil.rtrim( A55AlbRReo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Values", cmbAlbRReo.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable25_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRecCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRecCod_Internalname, httpContext.getMessage( "N Recepcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 28,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,28);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRecCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRecCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavUsurcod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavUsurcod_Internalname, httpContext.getMessage( "Usuario", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavUsurcod_Internalname, GXutil.rtrim( AV7UsurCod), GXutil.rtrim( localUtil.format( AV7UsurCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavUsurcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavUsurcod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "Center", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableintegracion_pontway_Internalname, divTableintegracion_pontway_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
      /* Static images/pictures */
      ClassString = "Image" + " " + ((GXutil.strcmp(imgAlert_gximage, "")==0) ? "GX_Image_Alert_Class" : "GX_Image_"+imgAlert_gximage+"_Class") ;
      StyleString = "" ;
      sImgUrl = context.getHttpContext().getImagePath( "6afee861-19ff-431c-9fb3-795b2d9cddb9", "", context.getHttpContext().getTheme( )) ;
      app.GxWebStd.gx_bitmap( httpContext, imgAlert_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), imgAlert_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" ", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblAlert_text_Internalname, httpContext.getMessage( "<h4> Integracion PontWay </h4>", ""), "", "", lblAlert_text_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(1), "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRFen_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRFen_Internalname, httpContext.getMessage( "Fecha Entrada", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtAlbRFen_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRFen_Internalname, localUtil.format(A49AlbRFen, "99/99/99"), localUtil.format( A49AlbRFen, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,48);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRFen_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRFen_Enabled, 1, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbRFen_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbRFen_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbrHor_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbrHor_Internalname, httpContext.getMessage( "Hora entrada", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtAlbrHor_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbrHor_Internalname, localUtil.ttoc( A6179AlbrHor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A6179AlbrHor, "99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,52);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbrHor_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbrHor_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbrHor_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbrHor_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbrUsu_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbrUsu_Internalname, httpContext.getMessage( "Usuario", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbrUsu_Internalname, GXutil.rtrim( A6178AlbrUsu), GXutil.rtrim( localUtil.format( A6178AlbrUsu, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbrUsu_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbrUsu_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedclicod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockclicod_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblockclicod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_clicod.setProperty("Caption", Combo_clicod_Caption);
      ucCombo_clicod.setProperty("Cls", Combo_clicod_Cls);
      ucCombo_clicod.setProperty("EmptyItem", Combo_clicod_Emptyitem);
      ucCombo_clicod.setProperty("DropDownOptionsData", AV94CliCod_Data);
      ucCombo_clicod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clicod_Internalname, "COMBO_CLICODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,70);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "Attribute", "", "", "", "", edtCliCod_Visible, edtCliCod_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedalbref_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbref_Internalname, httpContext.getMessage( "Referencia", ""), "", "", lblTextblockalbref_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_albref.setProperty("Caption", Combo_albref_Caption);
      ucCombo_albref.setProperty("Cls", Combo_albref_Cls);
      ucCombo_albref.setProperty("EmptyItem", Combo_albref_Emptyitem);
      ucCombo_albref.setProperty("DropDownOptionsTitleSettingsIcons", AV103DDO_TitleSettingsIcons);
      ucCombo_albref.setProperty("DropDownOptionsData", AV101AlbRef_Data);
      ucCombo_albref.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_albref_Internalname, "COMBO_ALBREFContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRef_Internalname, httpContext.getMessage( "Codigo Referencia", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRef_Internalname, GXutil.rtrim( A45AlbRef), GXutil.rtrim( localUtil.format( A45AlbRef, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,80);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRef_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbRef_Visible, edtAlbRef_Enabled, 1, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRefDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRefDsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRefDsc_Internalname, GXutil.rtrim( A3613AlbRefDsc), GXutil.rtrim( localUtil.format( A3613AlbRefDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRefDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRefDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable23_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Tipo Articulo", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "gx-label AttributeFLLabel control-label", 0, "", 1, 1, 0, (short)(0), "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRTartC_Internalname, httpContext.getMessage( "Tipo Articulo", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRTartC_Internalname, GXutil.ltrim( localUtil.ntoc( A6263AlbRTartC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6263AlbRTartC), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,97);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRTartC_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRTartC_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      /* Static images/pictures */
      ClassString = "gx-prompt Image" + " " + ((GXutil.strcmp(imgprompt_6263_gximage, "")==0) ? "" : "GX_Image_"+imgprompt_6263_gximage+"_Class") ;
      StyleString = "" ;
      sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      app.GxWebStd.gx_bitmap( httpContext, imgprompt_6263_Internalname, sImgUrl, imgprompt_6263_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_6263_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable24_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2desc_Internalname, httpContext.getMessage( "Descrição", ""), "", "", lblTextblock2desc_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "gx-label AttributeFLLabel control-label", 0, "", 1, 1, 0, (short)(0), "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRTartD_Internalname, httpContext.getMessage( "Tipo artículo", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRTartD_Internalname, GXutil.rtrim( A6264AlbRTartD), GXutil.rtrim( localUtil.format( A6264AlbRTartD, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRTartD_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRTartD_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtComposicio_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtComposicio_Internalname, httpContext.getMessage( "Composicion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtComposicio_Internalname, GXutil.rtrim( A13981Composicio), GXutil.rtrim( localUtil.format( A13981Composicio, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtComposicio_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtComposicio_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divAlbrent_cell_Internalname, 1, 0, "px", 0, "px", divAlbrent_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtAlbREnt_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbREnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbREnt_Internalname, httpContext.getMessage( "Albaran Entrega", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 118,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbREnt_Internalname, GXutil.rtrim( A46AlbREnt), GXutil.rtrim( localUtil.format( A46AlbREnt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,118);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbREnt_Jsonclick, 0, "AttributeFL", "", "", "", "", edtAlbREnt_Visible, edtAlbREnt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divAlbrent2_cell_Internalname, 1, 0, "px", 0, "px", divAlbrent2_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtAlbREnt2_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbREnt2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbREnt2_Internalname, httpContext.getMessage( "Nº Albaran Entrega", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 122,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbREnt2_Internalname, GXutil.rtrim( A5806AlbREnt2), GXutil.rtrim( localUtil.format( A5806AlbREnt2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,122);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbREnt2_Jsonclick, 0, "AttributeFL", "", "", "", "", edtAlbREnt2_Visible, edtAlbREnt2_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRDisCli_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRDisCli_Internalname, httpContext.getMessage( "Disp. Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRDisCli_Internalname, GXutil.rtrim( A3359AlbRDisCli), GXutil.rtrim( localUtil.format( A3359AlbRDisCli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRDisCli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRDisCli_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbNumB_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbNumB_Internalname, httpContext.getMessage( "Analisis Composicion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 130,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbNumB_Internalname, GXutil.rtrim( A8028AlbNumB), GXutil.rtrim( localUtil.format( A8028AlbNumB, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,130);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbNumB_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbNumB_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divAlbturno_cell_Internalname, 1, 0, "px", 0, "px", divAlbturno_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtAlbTurno_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbTurno_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbTurno_Internalname, httpContext.getMessage( "Turno", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbTurno_Internalname, GXutil.ltrim( localUtil.ntoc( A10358AlbTurno, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbTurno_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10358AlbTurno), "9") : localUtil.format( DecimalUtil.doubleToDec(A10358AlbTurno), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,134);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbTurno_Jsonclick, 0, "AttributeFL", "", "", "", "", edtAlbTurno_Visible, edtAlbTurno_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedtrncod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocktrncod_Internalname, httpContext.getMessage( "Transportista", ""), "", "", lblTextblocktrncod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_trncod.setProperty("Caption", Combo_trncod_Caption);
      ucCombo_trncod.setProperty("Cls", Combo_trncod_Cls);
      ucCombo_trncod.setProperty("EmptyItem", Combo_trncod_Emptyitem);
      ucCombo_trncod.setProperty("DropDownOptionsData", AV95TrnCod_Data);
      ucCombo_trncod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_trncod_Internalname, "COMBO_TRNCODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTrnCod_Internalname, httpContext.getMessage( "Codigo Transportista", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 148,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnCod_Internalname, GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,148);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtTrnCod_Jsonclick, 0, "Attribute", "", "", "", "", edtTrnCod_Visible, edtTrnCod_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedprocecod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockprocecod_Internalname, httpContext.getMessage( "Tejedor_Hilador", ""), "", "", lblTextblockprocecod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_procecod.setProperty("Caption", Combo_procecod_Caption);
      ucCombo_procecod.setProperty("Cls", Combo_procecod_Cls);
      ucCombo_procecod.setProperty("EmptyItem", Combo_procecod_Emptyitem);
      ucCombo_procecod.setProperty("DropDownOptionsData", AV96ProceCod_Data);
      ucCombo_procecod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_procecod_Internalname, "COMBO_PROCECODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProceCod_Internalname, httpContext.getMessage( "Codigo Procedencia", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 158,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProceCod_Internalname, GXutil.ltrim( localUtil.ntoc( A970ProceCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A970ProceCod), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,158);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProceCod_Jsonclick, 0, "Attribute", "", "", "", "", edtProceCod_Visible, edtProceCod_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divDvpanel_unnamedtable7_cell_Internalname, 1, 0, "px", 0, "px", divDvpanel_unnamedtable7_cell_Class, "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable22_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divAlbrlot2_cell_Internalname, 1, 0, "px", 0, "px", divAlbrlot2_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtAlbRLot2_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRLot2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRLot2_Internalname, httpContext.getMessage( "Lote", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRLot2_Internalname, A14525AlbRLot2, GXutil.rtrim( localUtil.format( A14525AlbRLot2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,171);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRLot2_Jsonclick, 0, "AttributeFL", "", "", "", "", edtAlbRLot2_Visible, edtAlbRLot2_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divAlbrlote_cell_Internalname, 1, 0, "px", 0, "px", divAlbrlote_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtAlbRLote_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRLote_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRLote_Internalname, httpContext.getMessage( "Lote", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 175,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRLote_Internalname, GXutil.rtrim( A6463AlbRLote), GXutil.rtrim( localUtil.format( A6463AlbRLote, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,175);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRLote_Jsonclick, 0, "AttributeFL", "", "", "", "", edtAlbRLote_Visible, edtAlbRLote_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRMdlCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRMdlCod_Internalname, httpContext.getMessage( "Juego", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 179,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRMdlCod_Internalname, GXutil.rtrim( A4602AlbRMdlCod), GXutil.rtrim( localUtil.format( A4602AlbRMdlCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,179);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRMdlCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRMdlCod_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRLu_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRLu_Internalname, httpContext.getMessage( "Pulgadas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 183,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRLu_Internalname, GXutil.ltrim( localUtil.ntoc( A6465AlbRLu, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRLu_Enabled!=0) ? localUtil.format( A6465AlbRLu, "ZZ9.99") : localUtil.format( A6465AlbRLu, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,183);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRLu_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRLu_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRTelar_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRTelar_Internalname, httpContext.getMessage( "Hilo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 187,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRTelar_Internalname, GXutil.rtrim( A6464AlbRTelar), GXutil.rtrim( localUtil.format( A6464AlbRTelar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,187);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRTelar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRTelar_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbMaqTej_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbMaqTej_Internalname, httpContext.getMessage( "Maquina", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 191,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbMaqTej_Internalname, GXutil.rtrim( A8035AlbMaqTej), GXutil.rtrim( localUtil.format( A8035AlbMaqTej, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,191);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbMaqTej_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbMaqTej_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbRTam.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbAlbRTam.getInternalname(), httpContext.getMessage( "Aberto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 196,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbRTam, cmbAlbRTam.getInternalname(), GXutil.rtrim( A4601AlbRTam), 1, cmbAlbRTam.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbRTam.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,196);\"", "", true, (byte)(0), "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      cmbAlbRTam.setValue( GXutil.rtrim( A4601AlbRTam) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRTam.getInternalname(), "Values", cmbAlbRTam.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRTara_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRTara_Internalname, httpContext.getMessage( "LFA", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 200,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRTara_Internalname, GXutil.ltrim( localUtil.ntoc( A6470AlbRTara, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRTara_Enabled!=0) ? localUtil.format( A6470AlbRTara, "ZZ9.99") : localUtil.format( A6470AlbRTara, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,200);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRTara_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRTara_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
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
      drawcontrols1( ) ;
   }

   public void drawcontrols1( )
   {
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedtipentcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocktipentcod_Internalname, httpContext.getMessage( "Tipo Entrada", ""), "", "", lblTextblocktipentcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_tipentcod.setProperty("Caption", Combo_tipentcod_Caption);
      ucCombo_tipentcod.setProperty("Cls", Combo_tipentcod_Cls);
      ucCombo_tipentcod.setProperty("EmptyItem", Combo_tipentcod_Emptyitem);
      ucCombo_tipentcod.setProperty("DropDownOptionsTitleSettingsIcons", AV103DDO_TitleSettingsIcons);
      ucCombo_tipentcod.setProperty("DropDownOptionsData", AV98TipEntCod_Data);
      ucCombo_tipentcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_tipentcod_Internalname, "COMBO_TIPENTCODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTipEntCod_Internalname, httpContext.getMessage( "Tipo Entrada", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 214,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipEntCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1211TipEntCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1211TipEntCod), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,214);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipEntCod_Jsonclick, 0, "Attribute", "", "", "", "", edtTipEntCod_Visible, edtTipEntCod_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRDes_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRDes_Internalname, httpContext.getMessage( "Destino", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 218,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRDes_Internalname, GXutil.rtrim( A1291AlbRDes), GXutil.rtrim( localUtil.format( A1291AlbRDes, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,218);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRDes_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRDes_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
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
      /* User Defined Control */
      ucDvpanel_unnamedtable9.setProperty("Width", Dvpanel_unnamedtable9_Width);
      ucDvpanel_unnamedtable9.setProperty("AutoWidth", Dvpanel_unnamedtable9_Autowidth);
      ucDvpanel_unnamedtable9.setProperty("AutoHeight", Dvpanel_unnamedtable9_Autoheight);
      ucDvpanel_unnamedtable9.setProperty("Cls", Dvpanel_unnamedtable9_Cls);
      ucDvpanel_unnamedtable9.setProperty("Title", Dvpanel_unnamedtable9_Title);
      ucDvpanel_unnamedtable9.setProperty("Collapsible", Dvpanel_unnamedtable9_Collapsible);
      ucDvpanel_unnamedtable9.setProperty("Collapsed", Dvpanel_unnamedtable9_Collapsed);
      ucDvpanel_unnamedtable9.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable9_Showcollapseicon);
      ucDvpanel_unnamedtable9.setProperty("IconPosition", Dvpanel_unnamedtable9_Iconposition);
      ucDvpanel_unnamedtable9.setProperty("AutoScroll", Dvpanel_unnamedtable9_Autoscroll);
      ucDvpanel_unnamedtable9.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable9_Internalname, "DVPANEL_UNNAMEDTABLE9Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE9Container"+"UnnamedTable9"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable9_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
      /* Control Group */
      app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup14_Internalname, httpContext.getMessage( "Entradas", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable13_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable20_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRPieEnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRPieEnt_Internalname, httpContext.getMessage( "Piezas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 235,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieEnt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,235);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieEnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRPieEnt_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtAlbPmPPza_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbPmPPza_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbPmPPza_Internalname, httpContext.getMessage( "Peso 1 peça", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 239,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbPmPPza_Internalname, GXutil.ltrim( localUtil.ntoc( A4290AlbPmPPza, (byte)(6), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbPmPPza_Enabled!=0) ? localUtil.format( A4290AlbPmPPza, "Z9.999") : localUtil.format( A4290AlbPmPPza, "Z9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,239);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbPmPPza_Jsonclick, 0, "AttributeFL", "", "", "", "", edtAlbPmPPza_Visible, edtAlbPmPPza_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbrPieC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbrPieC_Internalname, httpContext.getMessage( "Piezas Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 243,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbrPieC_Internalname, GXutil.ltrim( localUtil.ntoc( A6181AlbrPieC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbrPieC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6181AlbrPieC), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6181AlbrPieC), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,243);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbrPieC_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbrPieC_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable21_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRUniEnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRUniEnt_Internalname, httpContext.getMessage( "Unidades", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 251,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniEnt_Enabled!=0) ? localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99") : localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,251);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniEnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRUniEnt_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbRUni.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbAlbRUni.getInternalname(), httpContext.getMessage( "Unidad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 255,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbRUni, cmbAlbRUni.getInternalname(), GXutil.rtrim( A56AlbRUni), 1, cmbAlbRUni.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbRUni.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,255);\"", "", true, (byte)(0), "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbrUniC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbrUniC_Internalname, httpContext.getMessage( "Unidades Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 259,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbrUniC_Internalname, GXutil.ltrim( localUtil.ntoc( A6180AlbrUniC, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbrUniC_Enabled!=0) ? localUtil.format( A6180AlbrUniC, "ZZZZZ9.99") : localUtil.format( A6180AlbrUniC, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,259);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbrUniC_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbrUniC_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</fieldset>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
      /* Control Group */
      app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup16_Internalname, httpContext.getMessage( "Stock", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable15_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable17_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRPieUti_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRPieUti_Internalname, httpContext.getMessage( "Piezas Utilizadas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 270,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieUti_Internalname, GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,270);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieUti_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRPieUti_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRPieDis_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRPieDis_Internalname, httpContext.getMessage( "Piezas Disponibles", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieDis_Internalname, GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieDis_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieDis_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRPieDis_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable18_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRUniUti_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRUniUti_Internalname, httpContext.getMessage( "Unidades Utilizadas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 282,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniUti_Internalname, GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( A60AlbRUniUti, "ZZZZZ9.99")), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,282);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniUti_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRUniUti_Enabled, 1, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRUniDis_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRUniDis_Internalname, httpContext.getMessage( "Unidades Disponibles", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniDis_Internalname, GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniDis_Enabled!=0) ? localUtil.format( A57AlbRUniDis, "ZZZZZ9.99") : localUtil.format( A57AlbRUniDis, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniDis_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRUniDis_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable19_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRFecUlt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRFecUlt_Internalname, httpContext.getMessage( "Fecha Ult Uti", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtAlbRFecUlt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRFecUlt_Internalname, localUtil.format(A48AlbRFecUlt, "99/99/99"), localUtil.format( A48AlbRFecUlt, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRFecUlt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRFecUlt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbRFecUlt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbRFecUlt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbREst.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbAlbREst.getInternalname(), httpContext.getMessage( "Estado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbREst, cmbAlbREst.getInternalname(), GXutil.trim( GXutil.str( A47AlbREst, 1, 0)), 1, cmbAlbREst.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbAlbREst.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Values", cmbAlbREst.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</fieldset>") ;
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable10_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedalmcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalmcod_Internalname, httpContext.getMessage( "Almacen", ""), "", "", lblTextblockalmcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_almcod.setProperty("Caption", Combo_almcod_Caption);
      ucCombo_almcod.setProperty("Cls", Combo_almcod_Cls);
      ucCombo_almcod.setProperty("EmptyItem", Combo_almcod_Emptyitem);
      ucCombo_almcod.setProperty("DropDownOptionsData", AV104AlmCod_Data);
      ucCombo_almcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_almcod_Internalname, "COMBO_ALMCODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlmCod_Internalname, httpContext.getMessage( "Almacen", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 312,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlmCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4792AlmCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4792AlmCod), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,312);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlmCod_Jsonclick, 0, "Attribute", "", "", "", "", edtAlmCod_Visible, edtAlmCod_Enabled, 1, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRLoc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRLoc_Internalname, httpContext.getMessage( "Localizacion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 316,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRLoc_Internalname, GXutil.rtrim( A50AlbRLoc), GXutil.rtrim( localUtil.format( A50AlbRLoc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,316);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRLoc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRLoc_Enabled, 1, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbRReo.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbAlbRReo.getInternalname(), httpContext.getMessage( "Reclamacion?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 320,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbRReo, cmbAlbRReo.getInternalname(), GXutil.rtrim( A55AlbRReo), 1, cmbAlbRReo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbRReo.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,320);\"", "", true, (byte)(0), "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      cmbAlbRReo.setValue( GXutil.rtrim( A55AlbRReo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Values", cmbAlbRReo.ToJavascriptSource(), true);
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
      /* User Defined Control */
      ucDvpanel_unnamedtable11.setProperty("Width", Dvpanel_unnamedtable11_Width);
      ucDvpanel_unnamedtable11.setProperty("AutoWidth", Dvpanel_unnamedtable11_Autowidth);
      ucDvpanel_unnamedtable11.setProperty("AutoHeight", Dvpanel_unnamedtable11_Autoheight);
      ucDvpanel_unnamedtable11.setProperty("Cls", Dvpanel_unnamedtable11_Cls);
      ucDvpanel_unnamedtable11.setProperty("Title", Dvpanel_unnamedtable11_Title);
      ucDvpanel_unnamedtable11.setProperty("Collapsible", Dvpanel_unnamedtable11_Collapsible);
      ucDvpanel_unnamedtable11.setProperty("Collapsed", Dvpanel_unnamedtable11_Collapsed);
      ucDvpanel_unnamedtable11.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable11_Showcollapseicon);
      ucDvpanel_unnamedtable11.setProperty("IconPosition", Dvpanel_unnamedtable11_Iconposition);
      ucDvpanel_unnamedtable11.setProperty("AutoScroll", Dvpanel_unnamedtable11_Autoscroll);
      ucDvpanel_unnamedtable11.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable11_Internalname, "DVPANEL_UNNAMEDTABLE11Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE11Container"+"UnnamedTable11"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable11_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable12_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRGrm2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRGrm2_Internalname, httpContext.getMessage( "Grm2", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 333,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRGrm2_Internalname, GXutil.ltrim( localUtil.ntoc( A4920AlbRGrm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRGrm2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4920AlbRGrm2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4920AlbRGrm2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,333);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRGrm2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRGrm2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRAnc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRAnc_Internalname, httpContext.getMessage( "Ancho", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 337,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A4921AlbRAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRAnc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4921AlbRAnc), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4921AlbRAnc), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,337);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRAnc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRAnc_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbPml_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbPml_Internalname, httpContext.getMessage( "Pml", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 341,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbPml_Internalname, GXutil.ltrim( localUtil.ntoc( A4922AlbPml, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbPml_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4922AlbPml), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4922AlbPml), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,341);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbPml_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbPml_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_observacion_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      gxdraw_gridlevel_observacion( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 354,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 356,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 358,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV110Pgmname), GXutil.rtrim( localUtil.format( AV110Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavComboclicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV69ComboCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavComboclicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV69ComboCliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV69ComboCliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavComboclicod_Jsonclick, 0, "Attribute", "", "", "", "", edtavComboclicod_Visible, edtavComboclicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_albref_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavComboalbref_Internalname, GXutil.rtrim( AV102ComboAlbRef), GXutil.rtrim( localUtil.format( AV102ComboAlbRef, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavComboalbref_Jsonclick, 0, "Attribute", "", "", "", "", edtavComboalbref_Visible, edtavComboalbref_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_trncod_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombotrncod_Internalname, GXutil.ltrim( localUtil.ntoc( AV76ComboTrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCombotrncod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV76ComboTrnCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV76ComboTrnCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtavCombotrncod_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombotrncod_Visible, edtavCombotrncod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_procecod_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavComboprocecod_Internalname, GXutil.ltrim( localUtil.ntoc( AV97ComboProceCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavComboprocecod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV97ComboProceCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV97ComboProceCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavComboprocecod_Jsonclick, 0, "Attribute", "", "", "", "", edtavComboprocecod_Visible, edtavComboprocecod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_tipentcod_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombotipentcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV99ComboTipEntCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCombotipentcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV99ComboTipEntCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV99ComboTipEntCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCombotipentcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombotipentcod_Visible, edtavCombotipentcod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_almcod_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavComboalmcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV105ComboAlmCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavComboalmcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV105ComboAlmCod), "9") : localUtil.format( DecimalUtil.doubleToDec(AV105ComboAlmCod), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavComboalmcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavComboalmcod_Visible, edtavComboalmcod_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_observacion( )
   {
      /*  Grid Control  */
      startgridcontrol347( ) ;
      nGXsfl_347_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount191 = (short)(1) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_191 = (short)(1) ;
            scanStart1S1191( ) ;
            while ( RcdFound191 != 0 )
            {
               init_level_properties191( ) ;
               getByPrimaryKey1S1191( ) ;
               addRow1S1191( ) ;
               scanNext1S1191( ) ;
            }
            scanEnd1S1191( ) ;
            nBlankRcdCount191 = (short)(1) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B1301AlbRUlin = A1301AlbRUlin ;
         httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
         standaloneNotModal1S1191( ) ;
         standaloneModal1S1191( ) ;
         sMode191 = Gx_mode ;
         while ( nGXsfl_347_idx < nRC_GXsfl_347 )
         {
            bGXsfl_347_Refreshing = true ;
            readRow1S1191( ) ;
            edtAlbRLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRLIN_"+sGXsfl_347_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLin_Enabled), 5, 0), !bGXsfl_347_Refreshing);
            edtAlbRObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBROBS_"+sGXsfl_347_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRObs_Enabled), 5, 0), !bGXsfl_347_Refreshing);
            if ( ( nRcdExists_191 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1S1191( ) ;
            }
            sendRow1S1191( ) ;
            bGXsfl_347_Refreshing = false ;
         }
         Gx_mode = sMode191 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A1301AlbRUlin = B1301AlbRUlin ;
         httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount191 = (short)(1) ;
         nRcdExists_191 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1S1191( ) ;
            while ( RcdFound191 != 0 )
            {
               sGXsfl_347_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_347_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_347191( ) ;
               init_level_properties191( ) ;
               standaloneNotModal1S1191( ) ;
               getByPrimaryKey1S1191( ) ;
               standaloneModal1S1191( ) ;
               addRow1S1191( ) ;
               scanNext1S1191( ) ;
            }
            scanEnd1S1191( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode191 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_347_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_347_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_347191( ) ;
         initAll1S1191( ) ;
         init_level_properties191( ) ;
         B1301AlbRUlin = A1301AlbRUlin ;
         httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
         nRcdExists_191 = (short)(0) ;
         nIsMod_191 = (short)(0) ;
         nRcdDeleted_191 = (short)(0) ;
         nBlankRcdCount191 = (short)(nBlankRcdUsr191+nBlankRcdCount191) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount191 > 0 )
         {
            standaloneNotModal1S1191( ) ;
            standaloneModal1S1191( ) ;
            addRow1S1191( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtAlbRLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount191 = (short)(nBlankRcdCount191-1) ;
         }
         Gx_mode = sMode191 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A1301AlbRUlin = B1301AlbRUlin ;
         httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_observacionContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_observacion", Gridlevel_observacionContainer, subGridlevel_observacion_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_observacionContainerData", Gridlevel_observacionContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_observacionContainerData"+"V", Gridlevel_observacionContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_observacionContainerData"+"V"+"\" value='"+Gridlevel_observacionContainer.GridValuesHidden()+"'/>") ;
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
      e111S12 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICOD_DATA"), AV94CliCod_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV103DDO_TitleSettingsIcons);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vALBREF_DATA"), AV101AlbRef_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vTRNCOD_DATA"), AV95TrnCod_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPROCECOD_DATA"), AV96ProceCod_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vTIPENTCOD_DATA"), AV98TipEntCod_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vALMCOD_DATA"), AV104AlmCod_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z44AlbRecCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z45AlbRef = httpContext.cgiGet( "Z45AlbRef") ;
            Z58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( "Z58AlbRUniEnt")) ;
            Z46AlbREnt = httpContext.cgiGet( "Z46AlbREnt") ;
            Z5806AlbREnt2 = httpContext.cgiGet( "Z5806AlbREnt2") ;
            Z56AlbRUni = httpContext.cgiGet( "Z56AlbRUni") ;
            Z47AlbREst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z47AlbREst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12879AlbOEKOTEX = httpContext.cgiGet( "Z12879AlbOEKOTEX") ;
            Z3613AlbRefDsc = httpContext.cgiGet( "Z3613AlbRefDsc") ;
            Z49AlbRFen = localUtil.ctod( httpContext.cgiGet( "Z49AlbRFen"), 0) ;
            Z6179AlbrHor = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( "Z6179AlbrHor"), 0)) ;
            Z4601AlbRTam = httpContext.cgiGet( "Z4601AlbRTam") ;
            Z9749Emp_Item1 = httpContext.cgiGet( "Z9749Emp_Item1") ;
            Z1291AlbRDes = httpContext.cgiGet( "Z1291AlbRDes") ;
            Z6463AlbRLote = httpContext.cgiGet( "Z6463AlbRLote") ;
            Z14525AlbRLot2 = httpContext.cgiGet( "Z14525AlbRLot2") ;
            Z6464AlbRTelar = httpContext.cgiGet( "Z6464AlbRTelar") ;
            Z6465AlbRLu = localUtil.ctond( httpContext.cgiGet( "Z6465AlbRLu")) ;
            Z6470AlbRTara = localUtil.ctond( httpContext.cgiGet( "Z6470AlbRTara")) ;
            Z4602AlbRMdlCod = httpContext.cgiGet( "Z4602AlbRMdlCod") ;
            Z8035AlbMaqTej = httpContext.cgiGet( "Z8035AlbMaqTej") ;
            Z8028AlbNumB = httpContext.cgiGet( "Z8028AlbNumB") ;
            Z60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( "Z60AlbRUniUti")) ;
            Z52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( "Z52AlbRPieEnt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( "Z54AlbRPieUti"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6180AlbrUniC = localUtil.ctond( httpContext.cgiGet( "Z6180AlbrUniC")) ;
            Z6181AlbrPieC = (int)(localUtil.ctol( httpContext.cgiGet( "Z6181AlbrPieC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z50AlbRLoc = httpContext.cgiGet( "Z50AlbRLoc") ;
            Z55AlbRReo = httpContext.cgiGet( "Z55AlbRReo") ;
            Z53AlbRPieReb = (int)(localUtil.ctol( httpContext.cgiGet( "Z53AlbRPieReb"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z59AlbRUniReb = localUtil.ctond( httpContext.cgiGet( "Z59AlbRUniReb")) ;
            Z48AlbRFecUlt = localUtil.ctod( httpContext.cgiGet( "Z48AlbRFecUlt"), 0) ;
            Z1222AlbNumEti = (short)(localUtil.ctol( httpContext.cgiGet( "Z1222AlbNumEti"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1301AlbRUlin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1301AlbRUlin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4290AlbPmPPza = localUtil.ctond( httpContext.cgiGet( "Z4290AlbPmPPza")) ;
            Z4920AlbRGrm2 = (short)(localUtil.ctol( httpContext.cgiGet( "Z4920AlbRGrm2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4921AlbRAnc = (short)(localUtil.ctol( httpContext.cgiGet( "Z4921AlbRAnc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4922AlbPml = (short)(localUtil.ctol( httpContext.cgiGet( "Z4922AlbPml"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5743AlbRPre = localUtil.ctond( httpContext.cgiGet( "Z5743AlbRPre")) ;
            Z5744AlbRAju = localUtil.ctond( httpContext.cgiGet( "Z5744AlbRAju")) ;
            Z5745AlbRRep = (byte)(localUtil.ctol( httpContext.cgiGet( "Z5745AlbRRep"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6178AlbrUsu = httpContext.cgiGet( "Z6178AlbrUsu") ;
            Z6182AlbrNF = httpContext.cgiGet( "Z6182AlbrNF") ;
            Z6183AlbrFeNf = localUtil.ctod( httpContext.cgiGet( "Z6183AlbrFeNf"), 0) ;
            Z6184AlbrCfop = httpContext.cgiGet( "Z6184AlbrCfop") ;
            Z3359AlbRDisCli = httpContext.cgiGet( "Z3359AlbRDisCli") ;
            Z3360AlbRImp = httpContext.cgiGet( "Z3360AlbRImp") ;
            Z6471AlbRUniB = localUtil.ctond( httpContext.cgiGet( "Z6471AlbRUniB")) ;
            Z6488AlbDocPrv = httpContext.cgiGet( "Z6488AlbDocPrv") ;
            Z6523AlbRUdas = localUtil.ctond( httpContext.cgiGet( "Z6523AlbRUdas")) ;
            Z8023AlbColor = httpContext.cgiGet( "Z8023AlbColor") ;
            Z8024AlbOpsT = httpContext.cgiGet( "Z8024AlbOpsT") ;
            Z8025AlbOpsC = httpContext.cgiGet( "Z8025AlbOpsC") ;
            Z8026AlbOC = httpContext.cgiGet( "Z8026AlbOC") ;
            Z8027AlbHdri = httpContext.cgiGet( "Z8027AlbHdri") ;
            Z8029AlbNumM = httpContext.cgiGet( "Z8029AlbNumM") ;
            Z8030AlbAncC = localUtil.ctond( httpContext.cgiGet( "Z8030AlbAncC")) ;
            Z8031AlbDndC = (short)(localUtil.ctol( httpContext.cgiGet( "Z8031AlbDndC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z8032AlbAncCr = localUtil.ctond( httpContext.cgiGet( "Z8032AlbAncCr")) ;
            Z8033AlbDndCr = (short)(localUtil.ctol( httpContext.cgiGet( "Z8033AlbDndCr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z8036AlbDmt = (short)(localUtil.ctol( httpContext.cgiGet( "Z8036AlbDmt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z8034AlbGalga = (short)(localUtil.ctol( httpContext.cgiGet( "Z8034AlbGalga"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z9793AlbPdaC = httpContext.cgiGet( "Z9793AlbPdaC") ;
            Z9794AlbOStj = httpContext.cgiGet( "Z9794AlbOStj") ;
            Z317AlbStLot = (byte)(localUtil.ctol( httpContext.cgiGet( "Z317AlbStLot"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10358AlbTurno = (byte)(localUtil.ctol( httpContext.cgiGet( "Z10358AlbTurno"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6263AlbRTartC = (short)(localUtil.ctol( httpContext.cgiGet( "Z6263AlbRTartC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z970ProceCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z970ProceCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1211TipEntCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z1211TipEntCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4792AlmCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4792AlmCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A12879AlbOEKOTEX = httpContext.cgiGet( "Z12879AlbOEKOTEX") ;
            A9749Emp_Item1 = httpContext.cgiGet( "Z9749Emp_Item1") ;
            A53AlbRPieReb = (int)(localUtil.ctol( httpContext.cgiGet( "Z53AlbRPieReb"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A59AlbRUniReb = localUtil.ctond( httpContext.cgiGet( "Z59AlbRUniReb")) ;
            A1222AlbNumEti = (short)(localUtil.ctol( httpContext.cgiGet( "Z1222AlbNumEti"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1301AlbRUlin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1301AlbRUlin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A5743AlbRPre = localUtil.ctond( httpContext.cgiGet( "Z5743AlbRPre")) ;
            A5744AlbRAju = localUtil.ctond( httpContext.cgiGet( "Z5744AlbRAju")) ;
            A5745AlbRRep = (byte)(localUtil.ctol( httpContext.cgiGet( "Z5745AlbRRep"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A6182AlbrNF = httpContext.cgiGet( "Z6182AlbrNF") ;
            A6183AlbrFeNf = localUtil.ctod( httpContext.cgiGet( "Z6183AlbrFeNf"), 0) ;
            A6184AlbrCfop = httpContext.cgiGet( "Z6184AlbrCfop") ;
            A3360AlbRImp = httpContext.cgiGet( "Z3360AlbRImp") ;
            A6471AlbRUniB = localUtil.ctond( httpContext.cgiGet( "Z6471AlbRUniB")) ;
            A6488AlbDocPrv = httpContext.cgiGet( "Z6488AlbDocPrv") ;
            A6523AlbRUdas = localUtil.ctond( httpContext.cgiGet( "Z6523AlbRUdas")) ;
            A8023AlbColor = httpContext.cgiGet( "Z8023AlbColor") ;
            A8024AlbOpsT = httpContext.cgiGet( "Z8024AlbOpsT") ;
            A8025AlbOpsC = httpContext.cgiGet( "Z8025AlbOpsC") ;
            A8026AlbOC = httpContext.cgiGet( "Z8026AlbOC") ;
            A8027AlbHdri = httpContext.cgiGet( "Z8027AlbHdri") ;
            A8029AlbNumM = httpContext.cgiGet( "Z8029AlbNumM") ;
            A8030AlbAncC = localUtil.ctond( httpContext.cgiGet( "Z8030AlbAncC")) ;
            A8031AlbDndC = (short)(localUtil.ctol( httpContext.cgiGet( "Z8031AlbDndC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A8032AlbAncCr = localUtil.ctond( httpContext.cgiGet( "Z8032AlbAncCr")) ;
            A8033AlbDndCr = (short)(localUtil.ctol( httpContext.cgiGet( "Z8033AlbDndCr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A8036AlbDmt = (short)(localUtil.ctol( httpContext.cgiGet( "Z8036AlbDmt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A8034AlbGalga = (short)(localUtil.ctol( httpContext.cgiGet( "Z8034AlbGalga"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A9793AlbPdaC = httpContext.cgiGet( "Z9793AlbPdaC") ;
            A9794AlbOStj = httpContext.cgiGet( "Z9794AlbOStj") ;
            A317AlbStLot = (byte)(localUtil.ctol( httpContext.cgiGet( "Z317AlbStLot"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O1301AlbRUlin = (byte)(localUtil.ctol( httpContext.cgiGet( "O1301AlbRUlin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_347 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_347"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "N252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N6263AlbRTartC = (short)(localUtil.ctol( httpContext.cgiGet( "N6263AlbRTartC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "N840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N970ProceCod = (short)(localUtil.ctol( httpContext.cgiGet( "N970ProceCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N1211TipEntCod = (short)(localUtil.ctol( httpContext.cgiGet( "N1211TipEntCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N4792AlmCod = (byte)(localUtil.ctol( httpContext.cgiGet( "N4792AlmCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N50AlbRLoc = httpContext.cgiGet( "N50AlbRLoc") ;
            N45AlbRef = httpContext.cgiGet( "N45AlbRef") ;
            N49AlbRFen = localUtil.ctod( httpContext.cgiGet( "N49AlbRFen"), 0) ;
            N56AlbRUni = httpContext.cgiGet( "N56AlbRUni") ;
            N55AlbRReo = httpContext.cgiGet( "N55AlbRReo") ;
            A4291AlbPzaEst = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPZAEST"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV8EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV77AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( "vALBRECCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV81Insert_CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "vINSERT_CLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV82Insert_AlbRTartC = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_ALBRTARTC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV83Insert_TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_TRNCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV84Insert_ProceCod = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_PROCECOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV85Insert_TipEntCod = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_TIPENTCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV86Insert_AlmCod = (byte)(localUtil.ctol( httpContext.cgiGet( "vINSERT_ALMCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV25Moda21 = (short)(localUtil.ctol( httpContext.cgiGet( "vMODA21"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV106Lote2 = (short)(localUtil.ctol( httpContext.cgiGet( "vLOTE2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV39EncCli_20 = (short)(localUtil.ctol( httpContext.cgiGet( "vENCCLI_20"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A8024AlbOpsT = httpContext.cgiGet( "ALBOPST") ;
            AV14FlagKgs = (short)(localUtil.ctol( httpContext.cgiGet( "vFLAGKGS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV15FlagMts = (short)(localUtil.ctol( httpContext.cgiGet( "vFLAGMTS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV72AlbCum = httpContext.cgiGet( "vALBCUM") ;
            A12879AlbOEKOTEX = httpContext.cgiGet( "ALBOEKOTEX") ;
            AV37okotex = (short)(localUtil.ctol( httpContext.cgiGet( "vOKOTEX"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A6183AlbrFeNf = localUtil.ctod( httpContext.cgiGet( "ALBRFENF"), 0) ;
            A6182AlbrNF = httpContext.cgiGet( "ALBRNF") ;
            A3360AlbRImp = httpContext.cgiGet( "ALBRIMP") ;
            A13982AlbRArtLu = localUtil.ctond( httpContext.cgiGet( "ALBRARTLU")) ;
            n13982AlbRArtLu = false ;
            A6471AlbRUniB = localUtil.ctond( httpContext.cgiGet( "ALBRUNIB")) ;
            A6523AlbRUdas = localUtil.ctond( httpContext.cgiGet( "ALBRUDAS")) ;
            AV91ExisteReferencia = (short)(localUtil.ctol( httpContext.cgiGet( "vEXISTEREFERENCIA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV26Cli350 = (short)(localUtil.ctol( httpContext.cgiGet( "vCLI350"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV27ContVal = (int)(localUtil.ctol( httpContext.cgiGet( "vCONTVAL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A8723CliEst = httpContext.cgiGet( "CLIEST") ;
            A9749Emp_Item1 = httpContext.cgiGet( "EMP_ITEM1") ;
            A53AlbRPieReb = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEREB"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A59AlbRUniReb = localUtil.ctond( httpContext.cgiGet( "ALBRUNIREB")) ;
            A1222AlbNumEti = (short)(localUtil.ctol( httpContext.cgiGet( "ALBNUMETI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1301AlbRUlin = (byte)(localUtil.ctol( httpContext.cgiGet( "ALBRULIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A5743AlbRPre = localUtil.ctond( httpContext.cgiGet( "ALBRPRE")) ;
            A5744AlbRAju = localUtil.ctond( httpContext.cgiGet( "ALBRAJU")) ;
            A5745AlbRRep = (byte)(localUtil.ctol( httpContext.cgiGet( "ALBRREP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A6184AlbrCfop = httpContext.cgiGet( "ALBRCFOP") ;
            A6488AlbDocPrv = httpContext.cgiGet( "ALBDOCPRV") ;
            A8023AlbColor = httpContext.cgiGet( "ALBCOLOR") ;
            A8025AlbOpsC = httpContext.cgiGet( "ALBOPSC") ;
            A8026AlbOC = httpContext.cgiGet( "ALBOC") ;
            A8027AlbHdri = httpContext.cgiGet( "ALBHDRI") ;
            A8029AlbNumM = httpContext.cgiGet( "ALBNUMM") ;
            A8030AlbAncC = localUtil.ctond( httpContext.cgiGet( "ALBANCC")) ;
            A8031AlbDndC = (short)(localUtil.ctol( httpContext.cgiGet( "ALBDNDC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A8032AlbAncCr = localUtil.ctond( httpContext.cgiGet( "ALBANCCR")) ;
            A8033AlbDndCr = (short)(localUtil.ctol( httpContext.cgiGet( "ALBDNDCR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A8036AlbDmt = (short)(localUtil.ctol( httpContext.cgiGet( "ALBDMT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A8034AlbGalga = (short)(localUtil.ctol( httpContext.cgiGet( "ALBGALGA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A9793AlbPdaC = httpContext.cgiGet( "ALBPDAC") ;
            A9794AlbOStj = httpContext.cgiGet( "ALBOSTJ") ;
            A317AlbStLot = (byte)(localUtil.ctol( httpContext.cgiGet( "ALBSTLOT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A279CliNom = httpContext.cgiGet( "CLINOM") ;
            A841TrnNom = httpContext.cgiGet( "TRNNOM") ;
            n841TrnNom = false ;
            A971ProceNom = httpContext.cgiGet( "PROCENOM") ;
            n971ProceNom = false ;
            A1212TipEntNom = httpContext.cgiGet( "TIPENTNOM") ;
            n1212TipEntNom = false ;
            A4793AlmNom = httpContext.cgiGet( "ALMNOM") ;
            n4793AlmNom = false ;
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
            Combo_albref_Objectcall = httpContext.cgiGet( "COMBO_ALBREF_Objectcall") ;
            Combo_albref_Class = httpContext.cgiGet( "COMBO_ALBREF_Class") ;
            Combo_albref_Icontype = httpContext.cgiGet( "COMBO_ALBREF_Icontype") ;
            Combo_albref_Icon = httpContext.cgiGet( "COMBO_ALBREF_Icon") ;
            Combo_albref_Caption = httpContext.cgiGet( "COMBO_ALBREF_Caption") ;
            Combo_albref_Tooltip = httpContext.cgiGet( "COMBO_ALBREF_Tooltip") ;
            Combo_albref_Cls = httpContext.cgiGet( "COMBO_ALBREF_Cls") ;
            Combo_albref_Selectedvalue_set = httpContext.cgiGet( "COMBO_ALBREF_Selectedvalue_set") ;
            Combo_albref_Selectedvalue_get = httpContext.cgiGet( "COMBO_ALBREF_Selectedvalue_get") ;
            Combo_albref_Selectedtext_set = httpContext.cgiGet( "COMBO_ALBREF_Selectedtext_set") ;
            Combo_albref_Selectedtext_get = httpContext.cgiGet( "COMBO_ALBREF_Selectedtext_get") ;
            Combo_albref_Gamoauthtoken = httpContext.cgiGet( "COMBO_ALBREF_Gamoauthtoken") ;
            Combo_albref_Ddointernalname = httpContext.cgiGet( "COMBO_ALBREF_Ddointernalname") ;
            Combo_albref_Titlecontrolalign = httpContext.cgiGet( "COMBO_ALBREF_Titlecontrolalign") ;
            Combo_albref_Dropdownoptionstype = httpContext.cgiGet( "COMBO_ALBREF_Dropdownoptionstype") ;
            Combo_albref_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBREF_Enabled")) ;
            Combo_albref_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBREF_Visible")) ;
            Combo_albref_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_ALBREF_Titlecontrolidtoreplace") ;
            Combo_albref_Datalisttype = httpContext.cgiGet( "COMBO_ALBREF_Datalisttype") ;
            Combo_albref_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBREF_Allowmultipleselection")) ;
            Combo_albref_Datalistfixedvalues = httpContext.cgiGet( "COMBO_ALBREF_Datalistfixedvalues") ;
            Combo_albref_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBREF_Isgriditem")) ;
            Combo_albref_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBREF_Hasdescription")) ;
            Combo_albref_Datalistproc = httpContext.cgiGet( "COMBO_ALBREF_Datalistproc") ;
            Combo_albref_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_ALBREF_Datalistprocparametersprefix") ;
            Combo_albref_Remoteservicesparameters = httpContext.cgiGet( "COMBO_ALBREF_Remoteservicesparameters") ;
            Combo_albref_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_ALBREF_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_albref_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBREF_Includeonlyselectedoption")) ;
            Combo_albref_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBREF_Includeselectalloption")) ;
            Combo_albref_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBREF_Emptyitem")) ;
            Combo_albref_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBREF_Includeaddnewoption")) ;
            Combo_albref_Htmltemplate = httpContext.cgiGet( "COMBO_ALBREF_Htmltemplate") ;
            Combo_albref_Multiplevaluestype = httpContext.cgiGet( "COMBO_ALBREF_Multiplevaluestype") ;
            Combo_albref_Loadingdata = httpContext.cgiGet( "COMBO_ALBREF_Loadingdata") ;
            Combo_albref_Noresultsfound = httpContext.cgiGet( "COMBO_ALBREF_Noresultsfound") ;
            Combo_albref_Emptyitemtext = httpContext.cgiGet( "COMBO_ALBREF_Emptyitemtext") ;
            Combo_albref_Onlyselectedvalues = httpContext.cgiGet( "COMBO_ALBREF_Onlyselectedvalues") ;
            Combo_albref_Selectalltext = httpContext.cgiGet( "COMBO_ALBREF_Selectalltext") ;
            Combo_albref_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_ALBREF_Multiplevaluesseparator") ;
            Combo_albref_Addnewoptiontext = httpContext.cgiGet( "COMBO_ALBREF_Addnewoptiontext") ;
            Combo_albref_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_ALBREF_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            Combo_procecod_Objectcall = httpContext.cgiGet( "COMBO_PROCECOD_Objectcall") ;
            Combo_procecod_Class = httpContext.cgiGet( "COMBO_PROCECOD_Class") ;
            Combo_procecod_Icontype = httpContext.cgiGet( "COMBO_PROCECOD_Icontype") ;
            Combo_procecod_Icon = httpContext.cgiGet( "COMBO_PROCECOD_Icon") ;
            Combo_procecod_Caption = httpContext.cgiGet( "COMBO_PROCECOD_Caption") ;
            Combo_procecod_Tooltip = httpContext.cgiGet( "COMBO_PROCECOD_Tooltip") ;
            Combo_procecod_Cls = httpContext.cgiGet( "COMBO_PROCECOD_Cls") ;
            Combo_procecod_Selectedvalue_set = httpContext.cgiGet( "COMBO_PROCECOD_Selectedvalue_set") ;
            Combo_procecod_Selectedvalue_get = httpContext.cgiGet( "COMBO_PROCECOD_Selectedvalue_get") ;
            Combo_procecod_Selectedtext_set = httpContext.cgiGet( "COMBO_PROCECOD_Selectedtext_set") ;
            Combo_procecod_Selectedtext_get = httpContext.cgiGet( "COMBO_PROCECOD_Selectedtext_get") ;
            Combo_procecod_Gamoauthtoken = httpContext.cgiGet( "COMBO_PROCECOD_Gamoauthtoken") ;
            Combo_procecod_Ddointernalname = httpContext.cgiGet( "COMBO_PROCECOD_Ddointernalname") ;
            Combo_procecod_Titlecontrolalign = httpContext.cgiGet( "COMBO_PROCECOD_Titlecontrolalign") ;
            Combo_procecod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_PROCECOD_Dropdownoptionstype") ;
            Combo_procecod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROCECOD_Enabled")) ;
            Combo_procecod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROCECOD_Visible")) ;
            Combo_procecod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_PROCECOD_Titlecontrolidtoreplace") ;
            Combo_procecod_Datalisttype = httpContext.cgiGet( "COMBO_PROCECOD_Datalisttype") ;
            Combo_procecod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROCECOD_Allowmultipleselection")) ;
            Combo_procecod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_PROCECOD_Datalistfixedvalues") ;
            Combo_procecod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROCECOD_Isgriditem")) ;
            Combo_procecod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROCECOD_Hasdescription")) ;
            Combo_procecod_Datalistproc = httpContext.cgiGet( "COMBO_PROCECOD_Datalistproc") ;
            Combo_procecod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_PROCECOD_Datalistprocparametersprefix") ;
            Combo_procecod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_PROCECOD_Remoteservicesparameters") ;
            Combo_procecod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_PROCECOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_procecod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROCECOD_Includeonlyselectedoption")) ;
            Combo_procecod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROCECOD_Includeselectalloption")) ;
            Combo_procecod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROCECOD_Emptyitem")) ;
            Combo_procecod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROCECOD_Includeaddnewoption")) ;
            Combo_procecod_Htmltemplate = httpContext.cgiGet( "COMBO_PROCECOD_Htmltemplate") ;
            Combo_procecod_Multiplevaluestype = httpContext.cgiGet( "COMBO_PROCECOD_Multiplevaluestype") ;
            Combo_procecod_Loadingdata = httpContext.cgiGet( "COMBO_PROCECOD_Loadingdata") ;
            Combo_procecod_Noresultsfound = httpContext.cgiGet( "COMBO_PROCECOD_Noresultsfound") ;
            Combo_procecod_Emptyitemtext = httpContext.cgiGet( "COMBO_PROCECOD_Emptyitemtext") ;
            Combo_procecod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_PROCECOD_Onlyselectedvalues") ;
            Combo_procecod_Selectalltext = httpContext.cgiGet( "COMBO_PROCECOD_Selectalltext") ;
            Combo_procecod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_PROCECOD_Multiplevaluesseparator") ;
            Combo_procecod_Addnewoptiontext = httpContext.cgiGet( "COMBO_PROCECOD_Addnewoptiontext") ;
            Combo_procecod_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_PROCECOD_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            Combo_tipentcod_Objectcall = httpContext.cgiGet( "COMBO_TIPENTCOD_Objectcall") ;
            Combo_tipentcod_Class = httpContext.cgiGet( "COMBO_TIPENTCOD_Class") ;
            Combo_tipentcod_Icontype = httpContext.cgiGet( "COMBO_TIPENTCOD_Icontype") ;
            Combo_tipentcod_Icon = httpContext.cgiGet( "COMBO_TIPENTCOD_Icon") ;
            Combo_tipentcod_Caption = httpContext.cgiGet( "COMBO_TIPENTCOD_Caption") ;
            Combo_tipentcod_Tooltip = httpContext.cgiGet( "COMBO_TIPENTCOD_Tooltip") ;
            Combo_tipentcod_Cls = httpContext.cgiGet( "COMBO_TIPENTCOD_Cls") ;
            Combo_tipentcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_TIPENTCOD_Selectedvalue_set") ;
            Combo_tipentcod_Selectedvalue_get = httpContext.cgiGet( "COMBO_TIPENTCOD_Selectedvalue_get") ;
            Combo_tipentcod_Selectedtext_set = httpContext.cgiGet( "COMBO_TIPENTCOD_Selectedtext_set") ;
            Combo_tipentcod_Selectedtext_get = httpContext.cgiGet( "COMBO_TIPENTCOD_Selectedtext_get") ;
            Combo_tipentcod_Gamoauthtoken = httpContext.cgiGet( "COMBO_TIPENTCOD_Gamoauthtoken") ;
            Combo_tipentcod_Ddointernalname = httpContext.cgiGet( "COMBO_TIPENTCOD_Ddointernalname") ;
            Combo_tipentcod_Titlecontrolalign = httpContext.cgiGet( "COMBO_TIPENTCOD_Titlecontrolalign") ;
            Combo_tipentcod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_TIPENTCOD_Dropdownoptionstype") ;
            Combo_tipentcod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPENTCOD_Enabled")) ;
            Combo_tipentcod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPENTCOD_Visible")) ;
            Combo_tipentcod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_TIPENTCOD_Titlecontrolidtoreplace") ;
            Combo_tipentcod_Datalisttype = httpContext.cgiGet( "COMBO_TIPENTCOD_Datalisttype") ;
            Combo_tipentcod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPENTCOD_Allowmultipleselection")) ;
            Combo_tipentcod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_TIPENTCOD_Datalistfixedvalues") ;
            Combo_tipentcod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPENTCOD_Isgriditem")) ;
            Combo_tipentcod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPENTCOD_Hasdescription")) ;
            Combo_tipentcod_Datalistproc = httpContext.cgiGet( "COMBO_TIPENTCOD_Datalistproc") ;
            Combo_tipentcod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_TIPENTCOD_Datalistprocparametersprefix") ;
            Combo_tipentcod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_TIPENTCOD_Remoteservicesparameters") ;
            Combo_tipentcod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_TIPENTCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_tipentcod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPENTCOD_Includeonlyselectedoption")) ;
            Combo_tipentcod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPENTCOD_Includeselectalloption")) ;
            Combo_tipentcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPENTCOD_Emptyitem")) ;
            Combo_tipentcod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPENTCOD_Includeaddnewoption")) ;
            Combo_tipentcod_Htmltemplate = httpContext.cgiGet( "COMBO_TIPENTCOD_Htmltemplate") ;
            Combo_tipentcod_Multiplevaluestype = httpContext.cgiGet( "COMBO_TIPENTCOD_Multiplevaluestype") ;
            Combo_tipentcod_Loadingdata = httpContext.cgiGet( "COMBO_TIPENTCOD_Loadingdata") ;
            Combo_tipentcod_Noresultsfound = httpContext.cgiGet( "COMBO_TIPENTCOD_Noresultsfound") ;
            Combo_tipentcod_Emptyitemtext = httpContext.cgiGet( "COMBO_TIPENTCOD_Emptyitemtext") ;
            Combo_tipentcod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_TIPENTCOD_Onlyselectedvalues") ;
            Combo_tipentcod_Selectalltext = httpContext.cgiGet( "COMBO_TIPENTCOD_Selectalltext") ;
            Combo_tipentcod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_TIPENTCOD_Multiplevaluesseparator") ;
            Combo_tipentcod_Addnewoptiontext = httpContext.cgiGet( "COMBO_TIPENTCOD_Addnewoptiontext") ;
            Combo_tipentcod_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_TIPENTCOD_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Dvpanel_unnamedtable9_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Objectcall") ;
            Dvpanel_unnamedtable9_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Class") ;
            Dvpanel_unnamedtable9_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Enabled")) ;
            Dvpanel_unnamedtable9_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Width") ;
            Dvpanel_unnamedtable9_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Height") ;
            Dvpanel_unnamedtable9_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Autowidth")) ;
            Dvpanel_unnamedtable9_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Autoheight")) ;
            Dvpanel_unnamedtable9_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Cls") ;
            Dvpanel_unnamedtable9_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Showheader")) ;
            Dvpanel_unnamedtable9_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Title") ;
            Dvpanel_unnamedtable9_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Collapsible")) ;
            Dvpanel_unnamedtable9_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Collapsed")) ;
            Dvpanel_unnamedtable9_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Showcollapseicon")) ;
            Dvpanel_unnamedtable9_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Iconposition") ;
            Dvpanel_unnamedtable9_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Autoscroll")) ;
            Dvpanel_unnamedtable9_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Visible")) ;
            Dvpanel_unnamedtable9_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_almcod_Objectcall = httpContext.cgiGet( "COMBO_ALMCOD_Objectcall") ;
            Combo_almcod_Class = httpContext.cgiGet( "COMBO_ALMCOD_Class") ;
            Combo_almcod_Icontype = httpContext.cgiGet( "COMBO_ALMCOD_Icontype") ;
            Combo_almcod_Icon = httpContext.cgiGet( "COMBO_ALMCOD_Icon") ;
            Combo_almcod_Caption = httpContext.cgiGet( "COMBO_ALMCOD_Caption") ;
            Combo_almcod_Tooltip = httpContext.cgiGet( "COMBO_ALMCOD_Tooltip") ;
            Combo_almcod_Cls = httpContext.cgiGet( "COMBO_ALMCOD_Cls") ;
            Combo_almcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_ALMCOD_Selectedvalue_set") ;
            Combo_almcod_Selectedvalue_get = httpContext.cgiGet( "COMBO_ALMCOD_Selectedvalue_get") ;
            Combo_almcod_Selectedtext_set = httpContext.cgiGet( "COMBO_ALMCOD_Selectedtext_set") ;
            Combo_almcod_Selectedtext_get = httpContext.cgiGet( "COMBO_ALMCOD_Selectedtext_get") ;
            Combo_almcod_Gamoauthtoken = httpContext.cgiGet( "COMBO_ALMCOD_Gamoauthtoken") ;
            Combo_almcod_Ddointernalname = httpContext.cgiGet( "COMBO_ALMCOD_Ddointernalname") ;
            Combo_almcod_Titlecontrolalign = httpContext.cgiGet( "COMBO_ALMCOD_Titlecontrolalign") ;
            Combo_almcod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_ALMCOD_Dropdownoptionstype") ;
            Combo_almcod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALMCOD_Enabled")) ;
            Combo_almcod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALMCOD_Visible")) ;
            Combo_almcod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_ALMCOD_Titlecontrolidtoreplace") ;
            Combo_almcod_Datalisttype = httpContext.cgiGet( "COMBO_ALMCOD_Datalisttype") ;
            Combo_almcod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALMCOD_Allowmultipleselection")) ;
            Combo_almcod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_ALMCOD_Datalistfixedvalues") ;
            Combo_almcod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALMCOD_Isgriditem")) ;
            Combo_almcod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALMCOD_Hasdescription")) ;
            Combo_almcod_Datalistproc = httpContext.cgiGet( "COMBO_ALMCOD_Datalistproc") ;
            Combo_almcod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_ALMCOD_Datalistprocparametersprefix") ;
            Combo_almcod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_ALMCOD_Remoteservicesparameters") ;
            Combo_almcod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_ALMCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_almcod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALMCOD_Includeonlyselectedoption")) ;
            Combo_almcod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALMCOD_Includeselectalloption")) ;
            Combo_almcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALMCOD_Emptyitem")) ;
            Combo_almcod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALMCOD_Includeaddnewoption")) ;
            Combo_almcod_Htmltemplate = httpContext.cgiGet( "COMBO_ALMCOD_Htmltemplate") ;
            Combo_almcod_Multiplevaluestype = httpContext.cgiGet( "COMBO_ALMCOD_Multiplevaluestype") ;
            Combo_almcod_Loadingdata = httpContext.cgiGet( "COMBO_ALMCOD_Loadingdata") ;
            Combo_almcod_Noresultsfound = httpContext.cgiGet( "COMBO_ALMCOD_Noresultsfound") ;
            Combo_almcod_Emptyitemtext = httpContext.cgiGet( "COMBO_ALMCOD_Emptyitemtext") ;
            Combo_almcod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_ALMCOD_Onlyselectedvalues") ;
            Combo_almcod_Selectalltext = httpContext.cgiGet( "COMBO_ALMCOD_Selectalltext") ;
            Combo_almcod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_ALMCOD_Multiplevaluesseparator") ;
            Combo_almcod_Addnewoptiontext = httpContext.cgiGet( "COMBO_ALMCOD_Addnewoptiontext") ;
            Combo_almcod_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_ALMCOD_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Dvpanel_unnamedtable11_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE11_Objectcall") ;
            Dvpanel_unnamedtable11_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE11_Class") ;
            Dvpanel_unnamedtable11_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE11_Enabled")) ;
            Dvpanel_unnamedtable11_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE11_Width") ;
            Dvpanel_unnamedtable11_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE11_Height") ;
            Dvpanel_unnamedtable11_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE11_Autowidth")) ;
            Dvpanel_unnamedtable11_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE11_Autoheight")) ;
            Dvpanel_unnamedtable11_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE11_Cls") ;
            Dvpanel_unnamedtable11_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE11_Showheader")) ;
            Dvpanel_unnamedtable11_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE11_Title") ;
            Dvpanel_unnamedtable11_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE11_Collapsible")) ;
            Dvpanel_unnamedtable11_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE11_Collapsed")) ;
            Dvpanel_unnamedtable11_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE11_Showcollapseicon")) ;
            Dvpanel_unnamedtable11_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE11_Iconposition") ;
            Dvpanel_unnamedtable11_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE11_Autoscroll")) ;
            Dvpanel_unnamedtable11_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE11_Visible")) ;
            Dvpanel_unnamedtable11_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE11_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRECCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbRecCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A44AlbRecCod = 0 ;
               n44AlbRecCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            }
            else
            {
               A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n44AlbRecCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            }
            AV7UsurCod = GXutil.upper( httpContext.cgiGet( edtavUsurcod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7UsurCod", AV7UsurCod);
            if ( localUtil.vcdate( httpContext.cgiGet( edtAlbRFen_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "ALBRFEN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbRFen_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A49AlbRFen = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
            }
            else
            {
               A49AlbRFen = localUtil.ctod( httpContext.cgiGet( edtAlbRFen_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtAlbrHor_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badtime", new Object[] {}), 1, "ALBRHOR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbrHor_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6179AlbrHor = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri("", false, "A6179AlbrHor", localUtil.ttoc( A6179AlbrHor, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A6179AlbrHor = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtAlbrHor_Internalname))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6179AlbrHor", localUtil.ttoc( A6179AlbrHor, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            A6178AlbrUsu = httpContext.cgiGet( edtAlbrUsu_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6178AlbrUsu", A6178AlbrUsu);
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
            A45AlbRef = httpContext.cgiGet( edtAlbRef_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
            A3613AlbRefDsc = httpContext.cgiGet( edtAlbRefDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRTartC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRTartC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRTARTC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbRTartC_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6263AlbRTartC = (short)(0) ;
               n6263AlbRTartC = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6263AlbRTartC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6263AlbRTartC), 4, 0));
            }
            else
            {
               A6263AlbRTartC = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbRTartC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n6263AlbRTartC = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6263AlbRTartC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6263AlbRTartC), 4, 0));
            }
            A6264AlbRTartD = httpContext.cgiGet( edtAlbRTartD_Internalname) ;
            n6264AlbRTartD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6264AlbRTartD", A6264AlbRTartD);
            A13981Composicio = httpContext.cgiGet( edtComposicio_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13981Composicio", A13981Composicio);
            A46AlbREnt = httpContext.cgiGet( edtAlbREnt_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", A46AlbREnt);
            A5806AlbREnt2 = httpContext.cgiGet( edtAlbREnt2_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5806AlbREnt2", A5806AlbREnt2);
            A3359AlbRDisCli = httpContext.cgiGet( edtAlbRDisCli_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3359AlbRDisCli", A3359AlbRDisCli);
            A8028AlbNumB = httpContext.cgiGet( edtAlbNumB_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8028AlbNumB", A8028AlbNumB);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbTurno_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbTurno_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBTURNO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbTurno_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10358AlbTurno = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10358AlbTurno", GXutil.str( A10358AlbTurno, 1, 0));
            }
            else
            {
               A10358AlbTurno = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbTurno_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10358AlbTurno", GXutil.str( A10358AlbTurno, 1, 0));
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProceCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProceCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROCECOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProceCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A970ProceCod = (short)(0) ;
               n970ProceCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
            }
            else
            {
               A970ProceCod = (short)(localUtil.ctol( httpContext.cgiGet( edtProceCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n970ProceCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
            }
            A14525AlbRLot2 = httpContext.cgiGet( edtAlbRLot2_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14525AlbRLot2", A14525AlbRLot2);
            A6463AlbRLote = httpContext.cgiGet( edtAlbRLote_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", A6463AlbRLote);
            A4602AlbRMdlCod = httpContext.cgiGet( edtAlbRMdlCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4602AlbRMdlCod", A4602AlbRMdlCod);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRLu_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRLu_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRLU");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbRLu_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6465AlbRLu = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A6465AlbRLu", GXutil.ltrimstr( A6465AlbRLu, 6, 2));
            }
            else
            {
               A6465AlbRLu = localUtil.ctond( httpContext.cgiGet( edtAlbRLu_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6465AlbRLu", GXutil.ltrimstr( A6465AlbRLu, 6, 2));
            }
            A6464AlbRTelar = httpContext.cgiGet( edtAlbRTelar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6464AlbRTelar", A6464AlbRTelar);
            A8035AlbMaqTej = httpContext.cgiGet( edtAlbMaqTej_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8035AlbMaqTej", A8035AlbMaqTej);
            cmbAlbRTam.setName( cmbAlbRTam.getInternalname() );
            cmbAlbRTam.setValue( httpContext.cgiGet( cmbAlbRTam.getInternalname()) );
            A4601AlbRTam = httpContext.cgiGet( cmbAlbRTam.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4601AlbRTam", A4601AlbRTam);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRTara_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRTara_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRTARA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbRTara_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6470AlbRTara = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A6470AlbRTara", GXutil.ltrimstr( A6470AlbRTara, 6, 2));
            }
            else
            {
               A6470AlbRTara = localUtil.ctond( httpContext.cgiGet( edtAlbRTara_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6470AlbRTara", GXutil.ltrimstr( A6470AlbRTara, 6, 2));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTipEntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTipEntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIPENTCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTipEntCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1211TipEntCod = (short)(0) ;
               n1211TipEntCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
            }
            else
            {
               A1211TipEntCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTipEntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n1211TipEntCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
            }
            A1291AlbRDes = httpContext.cgiGet( edtAlbRDes_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", A1291AlbRDes);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRPieEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRPieEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRPIEENT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbRPieEnt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A52AlbRPieEnt = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
            }
            else
            {
               A52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbPmPPza_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbPmPPza_Internalname)), DecimalUtil.stringToDec("99.999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBPMPPZA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbPmPPza_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4290AlbPmPPza = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A4290AlbPmPPza", GXutil.ltrimstr( A4290AlbPmPPza, 6, 3));
            }
            else
            {
               A4290AlbPmPPza = localUtil.ctond( httpContext.cgiGet( edtAlbPmPPza_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4290AlbPmPPza", GXutil.ltrimstr( A4290AlbPmPPza, 6, 3));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbrPieC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbrPieC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRPIEC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbrPieC_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6181AlbrPieC = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A6181AlbrPieC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6181AlbrPieC), 6, 0));
            }
            else
            {
               A6181AlbrPieC = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbrPieC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6181AlbrPieC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6181AlbrPieC), 6, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRUniEnt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRUniEnt_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRUNIENT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbRUniEnt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A58AlbRUniEnt = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
            }
            else
            {
               A58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( edtAlbRUniEnt_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
            }
            cmbAlbRUni.setName( cmbAlbRUni.getInternalname() );
            cmbAlbRUni.setValue( httpContext.cgiGet( cmbAlbRUni.getInternalname()) );
            A56AlbRUni = httpContext.cgiGet( cmbAlbRUni.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbrUniC_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbrUniC_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRUNIC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbrUniC_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6180AlbrUniC = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A6180AlbrUniC", GXutil.ltrimstr( A6180AlbrUniC, 9, 2));
            }
            else
            {
               A6180AlbrUniC = localUtil.ctond( httpContext.cgiGet( edtAlbrUniC_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6180AlbrUniC", GXutil.ltrimstr( A6180AlbrUniC, 9, 2));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRPieUti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRPieUti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRPIEUTI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbRPieUti_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A54AlbRPieUti = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
            }
            else
            {
               A54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieUti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
            }
            A51AlbRPieDis = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieDis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRUniUti_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRUniUti_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRUNIUTI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbRUniUti_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A60AlbRUniUti = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
            }
            else
            {
               A60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( edtAlbRUniUti_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
            }
            A57AlbRUniDis = localUtil.ctond( httpContext.cgiGet( edtAlbRUniDis_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
            A48AlbRFecUlt = localUtil.ctod( httpContext.cgiGet( edtAlbRFecUlt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
            cmbAlbREst.setName( cmbAlbREst.getInternalname() );
            cmbAlbREst.setValue( httpContext.cgiGet( cmbAlbREst.getInternalname()) );
            A47AlbREst = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbREst.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlmCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlmCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALMCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlmCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4792AlmCod = (byte)(0) ;
               n4792AlmCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4792AlmCod", GXutil.str( A4792AlmCod, 1, 0));
            }
            else
            {
               A4792AlmCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlmCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n4792AlmCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4792AlmCod", GXutil.str( A4792AlmCod, 1, 0));
            }
            A50AlbRLoc = httpContext.cgiGet( edtAlbRLoc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", A50AlbRLoc);
            cmbAlbRReo.setName( cmbAlbRReo.getInternalname() );
            cmbAlbRReo.setValue( httpContext.cgiGet( cmbAlbRReo.getInternalname()) );
            A55AlbRReo = httpContext.cgiGet( cmbAlbRReo.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRGrm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRGrm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRGRM2");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbRGrm2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4920AlbRGrm2 = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
            }
            else
            {
               A4920AlbRGrm2 = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbRGrm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRANC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbRAnc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4921AlbRAnc = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
            }
            else
            {
               A4921AlbRAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbRAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbPml_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbPml_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBPML");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbPml_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4922AlbPml = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4922AlbPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4922AlbPml), 4, 0));
            }
            else
            {
               A4922AlbPml = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbPml_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4922AlbPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4922AlbPml), 4, 0));
            }
            AV110Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV110Pgmname", AV110Pgmname);
            AV69ComboCliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavComboclicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69ComboCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69ComboCliCod), 6, 0));
            AV102ComboAlbRef = httpContext.cgiGet( edtavComboalbref_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV102ComboAlbRef", AV102ComboAlbRef);
            AV76ComboTrnCod = (short)(localUtil.ctol( httpContext.cgiGet( edtavCombotrncod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76ComboTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76ComboTrnCod), 4, 0));
            AV97ComboProceCod = (short)(localUtil.ctol( httpContext.cgiGet( edtavComboprocecod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV97ComboProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV97ComboProceCod), 4, 0));
            AV99ComboTipEntCod = (short)(localUtil.ctol( httpContext.cgiGet( edtavCombotipentcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV99ComboTipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV99ComboTipEntCod), 4, 0));
            AV105ComboAlmCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtavComboalmcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV105ComboAlmCod", GXutil.str( AV105ComboAlmCod, 1, 0));
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"AlmacenTejido");
            A48AlbRFecUlt = localUtil.ctod( httpContext.cgiGet( edtAlbRFecUlt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
            forbiddenHiddens.add("AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            AV110Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV110Pgmname", AV110Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV110Pgmname, "")));
            forbiddenHiddens.add("Emp_Item1", GXutil.rtrim( localUtil.format( A9749Emp_Item1, "")));
            forbiddenHiddens.add("AlbRPieReb", localUtil.format( DecimalUtil.doubleToDec(A53AlbRPieReb), "ZZZ9"));
            forbiddenHiddens.add("AlbRUniReb", localUtil.format( A59AlbRUniReb, "ZZZZZ9.99"));
            forbiddenHiddens.add("AlbNumEti", localUtil.format( DecimalUtil.doubleToDec(A1222AlbNumEti), "ZZZ9"));
            forbiddenHiddens.add("AlbRPre", localUtil.format( A5743AlbRPre, "ZZZZZ9.99"));
            forbiddenHiddens.add("AlbRAju", localUtil.format( A5744AlbRAju, "ZZZZ9.99"));
            forbiddenHiddens.add("AlbRRep", localUtil.format( DecimalUtil.doubleToDec(A5745AlbRRep), "9"));
            A6178AlbrUsu = httpContext.cgiGet( edtAlbrUsu_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6178AlbrUsu", A6178AlbrUsu);
            forbiddenHiddens.add("AlbrUsu", GXutil.rtrim( localUtil.format( A6178AlbrUsu, "")));
            forbiddenHiddens.add("AlbrNF", GXutil.rtrim( localUtil.format( A6182AlbrNF, "@!")));
            forbiddenHiddens.add("AlbrFeNf", localUtil.format(A6183AlbrFeNf, "99/99/99"));
            forbiddenHiddens.add("AlbrCfop", GXutil.rtrim( localUtil.format( A6184AlbrCfop, "")));
            forbiddenHiddens.add("AlbRImp", GXutil.rtrim( localUtil.format( A3360AlbRImp, "@!")));
            forbiddenHiddens.add("AlbRUniB", localUtil.format( A6471AlbRUniB, "ZZZZZ9.99"));
            forbiddenHiddens.add("AlbDocPrv", GXutil.rtrim( localUtil.format( A6488AlbDocPrv, "")));
            forbiddenHiddens.add("AlbRUdas", localUtil.format( A6523AlbRUdas, "ZZZZZ9.99"));
            forbiddenHiddens.add("AlbColor", GXutil.rtrim( localUtil.format( A8023AlbColor, "")));
            forbiddenHiddens.add("AlbOpsT", GXutil.rtrim( localUtil.format( A8024AlbOpsT, "")));
            forbiddenHiddens.add("AlbOpsC", GXutil.rtrim( localUtil.format( A8025AlbOpsC, "")));
            forbiddenHiddens.add("AlbOC", GXutil.rtrim( localUtil.format( A8026AlbOC, "")));
            forbiddenHiddens.add("AlbHdri", GXutil.rtrim( localUtil.format( A8027AlbHdri, "")));
            forbiddenHiddens.add("AlbNumM", GXutil.rtrim( localUtil.format( A8029AlbNumM, "")));
            forbiddenHiddens.add("AlbAncC", localUtil.format( A8030AlbAncC, "Z9.99"));
            forbiddenHiddens.add("AlbDndC", localUtil.format( DecimalUtil.doubleToDec(A8031AlbDndC), "ZZZ9"));
            forbiddenHiddens.add("AlbAncCr", localUtil.format( A8032AlbAncCr, "Z9.99"));
            forbiddenHiddens.add("AlbDndCr", localUtil.format( DecimalUtil.doubleToDec(A8033AlbDndCr), "ZZZ9"));
            forbiddenHiddens.add("AlbDmt", localUtil.format( DecimalUtil.doubleToDec(A8036AlbDmt), "ZZ9"));
            forbiddenHiddens.add("AlbGalga", localUtil.format( DecimalUtil.doubleToDec(A8034AlbGalga), "ZZ9"));
            forbiddenHiddens.add("AlbPdaC", GXutil.rtrim( localUtil.format( A9793AlbPdaC, "")));
            forbiddenHiddens.add("AlbOStj", GXutil.rtrim( localUtil.format( A9794AlbOStj, "")));
            forbiddenHiddens.add("AlbStLot", localUtil.format( DecimalUtil.doubleToDec(A317AlbStLot), "9"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("almacensindetalle\\almacentejido:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
               n44AlbRecCod = false ;
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
                  sMode7 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode7 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound7 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1S10( ) ;
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
                     if ( GXutil.strcmp(sEvt, "COMBO_CLICOD.ONOPTIONCLICKED") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        e121S12 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "COMBO_ALBREF.ONOPTIONCLICKED") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        e131S12 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e111S12 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e141S12 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "TABLEINTEGRACION_PONTWAY.CLICK") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        e151S12 ();
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
         e141S12 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1S17( ) ;
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
         disableAttributes1S17( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavUsurcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavUsurcod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavComboclicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboclicod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavComboalbref_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboalbref_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombotrncod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombotrncod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavComboprocecod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboprocecod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombotipentcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombotipentcod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavComboalmcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboalmcod_Enabled), 5, 0), true);
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

   public void confirm_1S10( )
   {
      beforeValidate1S17( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1S17( ) ;
         }
         else
         {
            checkExtendedTable1S17( ) ;
            closeExtendedTableCursors1S17( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode7 = Gx_mode ;
         confirm_1S1191( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode7 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode7 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1S1191( )
   {
      s1301AlbRUlin = O1301AlbRUlin ;
      httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
      nGXsfl_347_idx = 0 ;
      while ( nGXsfl_347_idx < nRC_GXsfl_347 )
      {
         readRow1S1191( ) ;
         if ( ( nRcdExists_191 != 0 ) || ( nIsMod_191 != 0 ) )
         {
            getKey1S1191( ) ;
            if ( ( nRcdExists_191 == 0 ) && ( nRcdDeleted_191 == 0 ) )
            {
               if ( RcdFound191 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1S1191( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1S1191( ) ;
                     closeExtendedTableCursors1S1191( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O1301AlbRUlin = A1301AlbRUlin ;
                     httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
                  }
               }
               else
               {
                  GXCCtl = "ALBRLIN_" + sGXsfl_347_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAlbRLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound191 != 0 )
               {
                  if ( nRcdDeleted_191 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1S1191( ) ;
                     load1S1191( ) ;
                     beforeValidate1S1191( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1S1191( ) ;
                        O1301AlbRUlin = A1301AlbRUlin ;
                        httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_191 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1S1191( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1S1191( ) ;
                           closeExtendedTableCursors1S1191( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O1301AlbRUlin = A1301AlbRUlin ;
                           httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_191 == 0 )
                  {
                     GXCCtl = "ALBRLIN_" + sGXsfl_347_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbRLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtAlbRLin_Internalname, GXutil.ltrim( localUtil.ntoc( A1299AlbRLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRObs_Internalname, GXutil.rtrim( A1300AlbRObs)) ;
         httpContext.changePostValue( "ZT_"+"Z1299AlbRLin_"+sGXsfl_347_idx, GXutil.ltrim( localUtil.ntoc( Z1299AlbRLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1300AlbRObs_"+sGXsfl_347_idx, GXutil.rtrim( Z1300AlbRObs)) ;
         httpContext.changePostValue( "nRcdDeleted_191_"+sGXsfl_347_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_191, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_191_"+sGXsfl_347_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_191, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_191_"+sGXsfl_347_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_191, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_191 != 0 )
         {
            httpContext.changePostValue( "ALBRLIN_"+sGXsfl_347_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBROBS_"+sGXsfl_347_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O1301AlbRUlin = s1301AlbRUlin ;
      httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1S10( )
   {
   }

   public void e111S12( )
   {
      /* Start Routine */
      returnInSub = false ;
      divTableintegracion_pontway_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divTableintegracion_pontway_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTableintegracion_pontway_Visible), 5, 0), true);
      GXt_char1 = AV9Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      almacentejido_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Station", AV9Station);
      GXv_char2[0] = AV8EmprCod ;
      GXv_char3[0] = AV10EmprNom ;
      GXv_char4[0] = AV7UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV9Station, GXv_char2, GXv_char3, GXv_char4) ;
      almacentejido_impl.this.AV8EmprCod = GXv_char2[0] ;
      almacentejido_impl.this.AV10EmprNom = GXv_char3[0] ;
      almacentejido_impl.this.AV7UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8EmprCod", AV8EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV10EmprNom", AV10EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV7UsurCod", AV7UsurCod);
      GXv_SdtWWPContext5[0] = AV78WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV78WWPContext = GXv_SdtWWPContext5[0] ;
      AV80WebSession.remove("EMPRCOD");
      AV80WebSession.remove("ALBRECCOD");
      AV80WebSession.remove("ALBRFEN");
      edtAlmCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlmCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlmCod_Visible), 5, 0), true);
      AV105ComboAlmCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV105ComboAlmCod", GXutil.str( AV105ComboAlmCod, 1, 0));
      edtavComboalmcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboalmcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboalmcod_Visible), 5, 0), true);
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = AV103DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] ;
      AV103DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      edtTipEntCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipEntCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipEntCod_Visible), 5, 0), true);
      AV99ComboTipEntCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV99ComboTipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV99ComboTipEntCod), 4, 0));
      edtavCombotipentcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombotipentcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombotipentcod_Visible), 5, 0), true);
      edtProceCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProceCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceCod_Visible), 5, 0), true);
      AV97ComboProceCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV97ComboProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV97ComboProceCod), 4, 0));
      edtavComboprocecod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboprocecod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboprocecod_Visible), 5, 0), true);
      edtTrnCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Visible), 5, 0), true);
      AV76ComboTrnCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV76ComboTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76ComboTrnCod), 4, 0));
      edtavCombotrncod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombotrncod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombotrncod_Visible), 5, 0), true);
      edtAlbRef_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Visible), 5, 0), true);
      AV102ComboAlbRef = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV102ComboAlbRef", AV102ComboAlbRef);
      edtavComboalbref_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboalbref_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboalbref_Visible), 5, 0), true);
      edtCliCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), true);
      AV69ComboCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69ComboCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69ComboCliCod), 6, 0));
      edtavComboclicod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboclicod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboclicod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOCLICOD' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(11);
         pr_default.close(10);
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
      /* Execute user subroutine: 'LOADCOMBOALBREF' */
      S122 ();
      if ( returnInSub )
      {
         pr_default.close(11);
         pr_default.close(10);
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
      /* Execute user subroutine: 'LOADCOMBOTRNCOD' */
      S132 ();
      if ( returnInSub )
      {
         pr_default.close(11);
         pr_default.close(10);
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
      /* Execute user subroutine: 'LOADCOMBOPROCECOD' */
      S142 ();
      if ( returnInSub )
      {
         pr_default.close(11);
         pr_default.close(10);
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
      /* Execute user subroutine: 'LOADCOMBOTIPENTCOD' */
      S152 ();
      if ( returnInSub )
      {
         pr_default.close(11);
         pr_default.close(10);
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
      /* Execute user subroutine: 'LOADCOMBOALMCOD' */
      S162 ();
      if ( returnInSub )
      {
         pr_default.close(11);
         pr_default.close(10);
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
      S172 ();
      if ( returnInSub )
      {
         pr_default.close(11);
         pr_default.close(10);
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
      AV79TrnContext.fromxml(AV80WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV79TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV110Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV111GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV111GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV111GXV1), 8, 0));
         while ( AV111GXV1 <= AV79TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV87TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV79TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV111GXV1));
            if ( GXutil.strcmp(AV87TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "CliCod") == 0 )
            {
               AV81Insert_CliCod = (int)(GXutil.lval( AV87TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV81Insert_CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81Insert_CliCod), 6, 0));
               if ( ! (0==AV81Insert_CliCod) )
               {
                  AV69ComboCliCod = AV81Insert_CliCod ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV69ComboCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69ComboCliCod), 6, 0));
                  Combo_clicod_Selectedvalue_set = GXutil.trim( GXutil.str( AV69ComboCliCod, 6, 0)) ;
                  ucCombo_clicod.sendProperty(context, "", false, Combo_clicod_Internalname, "SelectedValue_set", Combo_clicod_Selectedvalue_set);
                  Combo_clicod_Enabled = false ;
                  ucCombo_clicod.sendProperty(context, "", false, Combo_clicod_Internalname, "Enabled", GXutil.booltostr( Combo_clicod_Enabled));
               }
            }
            else if ( GXutil.strcmp(AV87TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "AlbRTartC") == 0 )
            {
               AV82Insert_AlbRTartC = (short)(GXutil.lval( AV87TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV82Insert_AlbRTartC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82Insert_AlbRTartC), 4, 0));
            }
            else if ( GXutil.strcmp(AV87TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "TrnCod") == 0 )
            {
               AV83Insert_TrnCod = (short)(GXutil.lval( AV87TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV83Insert_TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83Insert_TrnCod), 4, 0));
               if ( ! (0==AV83Insert_TrnCod) )
               {
                  AV76ComboTrnCod = AV83Insert_TrnCod ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV76ComboTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76ComboTrnCod), 4, 0));
                  Combo_trncod_Selectedvalue_set = GXutil.trim( GXutil.str( AV76ComboTrnCod, 4, 0)) ;
                  ucCombo_trncod.sendProperty(context, "", false, Combo_trncod_Internalname, "SelectedValue_set", Combo_trncod_Selectedvalue_set);
                  Combo_trncod_Enabled = false ;
                  ucCombo_trncod.sendProperty(context, "", false, Combo_trncod_Internalname, "Enabled", GXutil.booltostr( Combo_trncod_Enabled));
               }
            }
            else if ( GXutil.strcmp(AV87TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "ProceCod") == 0 )
            {
               AV84Insert_ProceCod = (short)(GXutil.lval( AV87TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV84Insert_ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84Insert_ProceCod), 4, 0));
               if ( ! (0==AV84Insert_ProceCod) )
               {
                  AV97ComboProceCod = AV84Insert_ProceCod ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV97ComboProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV97ComboProceCod), 4, 0));
                  Combo_procecod_Selectedvalue_set = GXutil.trim( GXutil.str( AV97ComboProceCod, 4, 0)) ;
                  ucCombo_procecod.sendProperty(context, "", false, Combo_procecod_Internalname, "SelectedValue_set", Combo_procecod_Selectedvalue_set);
                  Combo_procecod_Enabled = false ;
                  ucCombo_procecod.sendProperty(context, "", false, Combo_procecod_Internalname, "Enabled", GXutil.booltostr( Combo_procecod_Enabled));
               }
            }
            else if ( GXutil.strcmp(AV87TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "TipEntCod") == 0 )
            {
               AV85Insert_TipEntCod = (short)(GXutil.lval( AV87TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV85Insert_TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85Insert_TipEntCod), 4, 0));
               if ( ! (0==AV85Insert_TipEntCod) )
               {
                  AV99ComboTipEntCod = AV85Insert_TipEntCod ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV99ComboTipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV99ComboTipEntCod), 4, 0));
                  Combo_tipentcod_Selectedvalue_set = GXutil.trim( GXutil.str( AV99ComboTipEntCod, 4, 0)) ;
                  ucCombo_tipentcod.sendProperty(context, "", false, Combo_tipentcod_Internalname, "SelectedValue_set", Combo_tipentcod_Selectedvalue_set);
                  Combo_tipentcod_Enabled = false ;
                  ucCombo_tipentcod.sendProperty(context, "", false, Combo_tipentcod_Internalname, "Enabled", GXutil.booltostr( Combo_tipentcod_Enabled));
               }
            }
            else if ( GXutil.strcmp(AV87TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "AlmCod") == 0 )
            {
               AV86Insert_AlmCod = (byte)(GXutil.lval( AV87TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV86Insert_AlmCod", GXutil.str( AV86Insert_AlmCod, 1, 0));
               if ( ! (0==AV86Insert_AlmCod) )
               {
                  AV105ComboAlmCod = AV86Insert_AlmCod ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV105ComboAlmCod", GXutil.str( AV105ComboAlmCod, 1, 0));
                  Combo_almcod_Selectedvalue_set = GXutil.trim( GXutil.str( AV105ComboAlmCod, 1, 0)) ;
                  ucCombo_almcod.sendProperty(context, "", false, Combo_almcod_Internalname, "SelectedValue_set", Combo_almcod_Selectedvalue_set);
                  Combo_almcod_Enabled = false ;
                  ucCombo_almcod.sendProperty(context, "", false, Combo_almcod_Internalname, "Enabled", GXutil.booltostr( Combo_almcod_Enabled));
               }
            }
            AV111GXV1 = (int)(AV111GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV111GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV111GXV1), 8, 0));
         }
      }
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      GXt_int8 = (byte)(AV36Enc20) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "20ENCO", ""), GXv_int9) ;
      almacentejido_impl.this.GXt_int8 = GXv_int9[0] ;
      AV36Enc20 = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Enc20", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36Enc20), 4, 0));
      GXt_int8 = (byte)(AV25Moda21) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int9) ;
      almacentejido_impl.this.GXt_int8 = GXv_int9[0] ;
      AV25Moda21 = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25Moda21), 4, 0));
      GXt_int8 = (byte)(AV26Cli350) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "CLI350", ""), GXv_int9) ;
      almacentejido_impl.this.GXt_int8 = GXv_int9[0] ;
      AV26Cli350 = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Cli350", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26Cli350), 4, 0));
      GXt_int10 = AV27ContVal ;
      GXv_int11[0] = GXt_int10 ;
      new app.pbuscon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "CLI350", ""), GXv_int11) ;
      almacentejido_impl.this.GXt_int10 = GXv_int11[0] ;
      AV27ContVal = GXt_int10 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27ContVal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27ContVal), 8, 0));
      AV39EncCli_20 = (short)(((AV21Enc20c==1) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39EncCli_20", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39EncCli_20), 4, 0));
      GXt_int8 = (byte)(AV14FlagKgs) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "KILOS", ""), GXv_int9) ;
      almacentejido_impl.this.GXt_int8 = GXv_int9[0] ;
      AV14FlagKgs = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14FlagKgs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14FlagKgs), 4, 0));
      GXt_int8 = (byte)(AV15FlagMts) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "METROS", ""), GXv_int9) ;
      almacentejido_impl.this.GXt_int8 = GXv_int9[0] ;
      AV15FlagMts = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15FlagMts", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15FlagMts), 4, 0));
      GXt_int8 = (byte)(AV37okotex) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "TEXOKO", ""), GXv_int9) ;
      almacentejido_impl.this.GXt_int8 = GXv_int9[0] ;
      AV37okotex = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37okotex", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37okotex), 4, 0));
      GXt_int8 = (byte)(AV38normas) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "STDNOR", ""), GXv_int9) ;
      almacentejido_impl.this.GXt_int8 = GXv_int9[0] ;
      AV38normas = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38normas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38normas), 4, 0));
      GXt_int8 = (byte)(AV13CtrlArt) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "ARTEXI", ""), GXv_int9) ;
      almacentejido_impl.this.GXt_int8 = GXv_int9[0] ;
      AV13CtrlArt = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13CtrlArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13CtrlArt), 4, 0));
      GXt_int8 = (byte)(AV100Sicrudo) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "SICRU0", ""), GXv_int9) ;
      almacentejido_impl.this.GXt_int8 = GXv_int9[0] ;
      AV100Sicrudo = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV100Sicrudo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV100Sicrudo), 4, 0));
      GXt_char1 = AV9Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      almacentejido_impl.this.GXt_char1 = GXv_char4[0] ;
      AV9Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Station", AV9Station);
      GXt_int8 = (byte)(AV36Enc20) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "20ENCO", ""), GXv_int9) ;
      almacentejido_impl.this.GXt_int8 = GXv_int9[0] ;
      AV36Enc20 = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Enc20", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36Enc20), 4, 0));
      GXt_int8 = (byte)(AV25Moda21) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int9) ;
      almacentejido_impl.this.GXt_int8 = GXv_int9[0] ;
      AV25Moda21 = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25Moda21), 4, 0));
      GXt_int8 = (byte)(AV26Cli350) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "CLI350", ""), GXv_int9) ;
      almacentejido_impl.this.GXt_int8 = GXv_int9[0] ;
      AV26Cli350 = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Cli350", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26Cli350), 4, 0));
      GXt_int10 = AV27ContVal ;
      GXv_int11[0] = GXt_int10 ;
      new app.pbuscon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "CLI350", ""), GXv_int11) ;
      almacentejido_impl.this.GXt_int10 = GXv_int11[0] ;
      AV27ContVal = GXt_int10 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27ContVal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27ContVal), 8, 0));
      AV39EncCli_20 = (short)(((AV21Enc20c==1) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39EncCli_20", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39EncCli_20), 4, 0));
      GXt_int8 = (byte)(AV14FlagKgs) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "KILOS", ""), GXv_int9) ;
      almacentejido_impl.this.GXt_int8 = GXv_int9[0] ;
      AV14FlagKgs = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14FlagKgs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14FlagKgs), 4, 0));
      GXt_int8 = (byte)(AV15FlagMts) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "METROS", ""), GXv_int9) ;
      almacentejido_impl.this.GXt_int8 = GXv_int9[0] ;
      AV15FlagMts = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15FlagMts", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15FlagMts), 4, 0));
      GXt_int8 = (byte)(AV37okotex) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "TEXOKO", ""), GXv_int9) ;
      almacentejido_impl.this.GXt_int8 = GXv_int9[0] ;
      AV37okotex = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37okotex", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37okotex), 4, 0));
      GXt_int8 = (byte)(AV38normas) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "STDNOR", ""), GXv_int9) ;
      almacentejido_impl.this.GXt_int8 = GXv_int9[0] ;
      AV38normas = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38normas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38normas), 4, 0));
      GXt_int8 = (byte)(AV13CtrlArt) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "ARTEXI", ""), GXv_int9) ;
      almacentejido_impl.this.GXt_int8 = GXv_int9[0] ;
      AV13CtrlArt = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13CtrlArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13CtrlArt), 4, 0));
      GXt_int8 = (byte)(AV100Sicrudo) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "SICRU0", ""), GXv_int9) ;
      almacentejido_impl.this.GXt_int8 = GXv_int9[0] ;
      AV100Sicrudo = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV100Sicrudo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV100Sicrudo), 4, 0));
      GXt_int8 = (byte)(AV106Lote2) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "LOT002", ""), GXv_int9) ;
      almacentejido_impl.this.GXt_int8 = GXv_int9[0] ;
      AV106Lote2 = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV106Lote2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106Lote2), 4, 0));
      GXt_int8 = AV107lavanderiaprecio ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "PVPPDA", ""), GXv_int9) ;
      almacentejido_impl.this.GXt_int8 = GXv_int9[0] ;
      AV107lavanderiaprecio = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV107lavanderiaprecio", GXutil.str( AV107lavanderiaprecio, 1, 0));
      edtAlbPmPPza_Visible = AV107lavanderiaprecio ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPmPPza_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPmPPza_Visible), 5, 0), true);
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( AV25Moda21 == 1 ) )
      {
         AV99ComboTipEntCod = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV99ComboTipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV99ComboTipEntCod), 4, 0));
         Combo_tipentcod_Selectedvalue_set = GXutil.trim( GXutil.str( AV99ComboTipEntCod, 4, 0)) ;
         ucCombo_tipentcod.sendProperty(context, "", false, Combo_tipentcod_Internalname, "SelectedValue_set", Combo_tipentcod_Selectedvalue_set);
      }
   }

   public void e141S12( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      AV80WebSession.setValue("EMPRCOD", A396EmprCod);
      AV80WebSession.setValue("ALBRECCOD", GXutil.trim( GXutil.str( A44AlbRecCod, 8, 0)));
      AV80WebSession.setValue("ALBRFEN", GXutil.trim( localUtil.dtoc( A49AlbRFen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")));
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV79TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.almacensindetalle.almacentejidoww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(11);
      pr_default.close(10);
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
      /*  Sending Event outputs  */
   }

   public void e131S12( )
   {
      /* Combo_albref_Onoptionclicked Routine */
      returnInSub = false ;
      AV102ComboAlbRef = Combo_albref_Selectedvalue_get ;
      httpContext.ajax_rsp_assign_attri("", false, "AV102ComboAlbRef", AV102ComboAlbRef);
      GXv_char4[0] = A3613AlbRefDsc ;
      GXv_int12[0] = A6263AlbRTartC ;
      GXv_char3[0] = A6264AlbRTartD ;
      GXv_int13[0] = AV91ExisteReferencia ;
      new app.almacensindetalle.datosreferencia(remoteHandle, context).execute( A396EmprCod, A252CliCod, AV102ComboAlbRef, GXv_char4, GXv_int12, GXv_char3, GXv_int13) ;
      almacentejido_impl.this.A3613AlbRefDsc = GXv_char4[0] ;
      almacentejido_impl.this.A6263AlbRTartC = GXv_int12[0] ;
      almacentejido_impl.this.A6264AlbRTartD = GXv_char3[0] ;
      almacentejido_impl.this.AV91ExisteReferencia = GXv_int13[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
      httpContext.ajax_rsp_assign_attri("", false, "A6263AlbRTartC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6263AlbRTartC), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A6264AlbRTartD", A6264AlbRTartD);
      httpContext.ajax_rsp_assign_attri("", false, "AV91ExisteReferencia", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV91ExisteReferencia), 4, 0));
      /*  Sending Event outputs  */
   }

   public void e121S12( )
   {
      /* Combo_clicod_Onoptionclicked Routine */
      returnInSub = false ;
      AV69ComboCliCod = (int)(GXutil.lval( Combo_clicod_Selectedvalue_get)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69ComboCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69ComboCliCod), 6, 0));
      AV80WebSession.setValue("CliCod", GXutil.str( AV69ComboCliCod, 6, 0));
      /* Execute user subroutine: 'LOADCOMBOALBREF' */
      S122 ();
      if ( returnInSub )
      {
         pr_default.close(11);
         pr_default.close(10);
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV101AlbRef_Data", AV101AlbRef_Data);
   }

   public void S172( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      edtAlbRLot2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRLot2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLot2_Visible), 5, 0), true);
      divAlbrlot2_cell_Class = "Invisible" ;
      httpContext.ajax_rsp_assign_prop("", false, divAlbrlot2_cell_Internalname, "Class", divAlbrlot2_cell_Class, true);
      edtAlbRLote_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRLote_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLote_Visible), 5, 0), true);
      divAlbrlote_cell_Class = "Invisible" ;
      httpContext.ajax_rsp_assign_prop("", false, divAlbrlote_cell_Internalname, "Class", divAlbrlote_cell_Class, true);
      edtAlbREnt_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt_Visible), 5, 0), true);
      divAlbrent_cell_Class = "Invisible" ;
      httpContext.ajax_rsp_assign_prop("", false, divAlbrent_cell_Internalname, "Class", divAlbrent_cell_Class, true);
      edtAlbREnt2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt2_Visible), 5, 0), true);
      divAlbrent2_cell_Class = "Invisible" ;
      httpContext.ajax_rsp_assign_prop("", false, divAlbrent2_cell_Internalname, "Class", divAlbrent2_cell_Class, true);
      edtAlbTurno_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbTurno_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTurno_Visible), 5, 0), true);
      divAlbturno_cell_Class = "Invisible" ;
      httpContext.ajax_rsp_assign_prop("", false, divAlbturno_cell_Internalname, "Class", divAlbturno_cell_Class, true);
      divDvpanel_unnamedtable7_cell_Class = "col-xs-12" ;
      httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable7_cell_Internalname, "Class", divDvpanel_unnamedtable7_cell_Class, true);
   }

   public void S162( )
   {
      /* 'LOADCOMBOALMCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item14 = AV104AlmCod_Data ;
      GXv_char4[0] = AV93ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item15[0] = GXt_objcol_SdtDVB_SDTComboData_Item14 ;
      new app.almacensindetalle.almacentejidoloaddvcombo(remoteHandle, context).execute( "AlmCod", Gx_mode, AV8EmprCod, AV77AlbRecCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item15) ;
      almacentejido_impl.this.AV93ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item14 = GXv_objcol_SdtDVB_SDTComboData_Item15[0] ;
      AV104AlmCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item14 ;
      Combo_almcod_Selectedvalue_set = AV93ComboSelectedValue ;
      ucCombo_almcod.sendProperty(context, "", false, Combo_almcod_Internalname, "SelectedValue_set", Combo_almcod_Selectedvalue_set);
      AV105ComboAlmCod = (byte)(GXutil.lval( AV93ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV105ComboAlmCod", GXutil.str( AV105ComboAlmCod, 1, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_almcod_Enabled = false ;
         ucCombo_almcod.sendProperty(context, "", false, Combo_almcod_Internalname, "Enabled", GXutil.booltostr( Combo_almcod_Enabled));
      }
   }

   public void S152( )
   {
      /* 'LOADCOMBOTIPENTCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item14 = AV98TipEntCod_Data ;
      GXv_char4[0] = AV93ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item15[0] = GXt_objcol_SdtDVB_SDTComboData_Item14 ;
      new app.almacensindetalle.almacentejidoloaddvcombo(remoteHandle, context).execute( "TipEntCod", Gx_mode, AV8EmprCod, AV77AlbRecCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item15) ;
      almacentejido_impl.this.AV93ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item14 = GXv_objcol_SdtDVB_SDTComboData_Item15[0] ;
      AV98TipEntCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item14 ;
      Combo_tipentcod_Selectedvalue_set = AV93ComboSelectedValue ;
      ucCombo_tipentcod.sendProperty(context, "", false, Combo_tipentcod_Internalname, "SelectedValue_set", Combo_tipentcod_Selectedvalue_set);
      AV99ComboTipEntCod = (short)(GXutil.lval( AV93ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV99ComboTipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV99ComboTipEntCod), 4, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_tipentcod_Enabled = false ;
         ucCombo_tipentcod.sendProperty(context, "", false, Combo_tipentcod_Internalname, "Enabled", GXutil.booltostr( Combo_tipentcod_Enabled));
      }
   }

   public void S142( )
   {
      /* 'LOADCOMBOPROCECOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item14 = AV96ProceCod_Data ;
      GXv_char4[0] = AV93ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item15[0] = GXt_objcol_SdtDVB_SDTComboData_Item14 ;
      new app.almacensindetalle.almacentejidoloaddvcombo(remoteHandle, context).execute( "ProceCod", Gx_mode, AV8EmprCod, AV77AlbRecCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item15) ;
      almacentejido_impl.this.AV93ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item14 = GXv_objcol_SdtDVB_SDTComboData_Item15[0] ;
      AV96ProceCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item14 ;
      Combo_procecod_Selectedvalue_set = AV93ComboSelectedValue ;
      ucCombo_procecod.sendProperty(context, "", false, Combo_procecod_Internalname, "SelectedValue_set", Combo_procecod_Selectedvalue_set);
      AV97ComboProceCod = (short)(GXutil.lval( AV93ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV97ComboProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV97ComboProceCod), 4, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_procecod_Enabled = false ;
         ucCombo_procecod.sendProperty(context, "", false, Combo_procecod_Internalname, "Enabled", GXutil.booltostr( Combo_procecod_Enabled));
      }
   }

   public void S132( )
   {
      /* 'LOADCOMBOTRNCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item14 = AV95TrnCod_Data ;
      GXv_char4[0] = AV93ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item15[0] = GXt_objcol_SdtDVB_SDTComboData_Item14 ;
      new app.almacensindetalle.almacentejidoloaddvcombo(remoteHandle, context).execute( "TrnCod", Gx_mode, AV8EmprCod, AV77AlbRecCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item15) ;
      almacentejido_impl.this.AV93ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item14 = GXv_objcol_SdtDVB_SDTComboData_Item15[0] ;
      AV95TrnCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item14 ;
      Combo_trncod_Selectedvalue_set = AV93ComboSelectedValue ;
      ucCombo_trncod.sendProperty(context, "", false, Combo_trncod_Internalname, "SelectedValue_set", Combo_trncod_Selectedvalue_set);
      AV76ComboTrnCod = (short)(GXutil.lval( AV93ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV76ComboTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76ComboTrnCod), 4, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_trncod_Enabled = false ;
         ucCombo_trncod.sendProperty(context, "", false, Combo_trncod_Internalname, "Enabled", GXutil.booltostr( Combo_trncod_Enabled));
      }
   }

   public void S122( )
   {
      /* 'LOADCOMBOALBREF' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item14 = AV101AlbRef_Data ;
      GXv_char4[0] = AV93ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item15[0] = GXt_objcol_SdtDVB_SDTComboData_Item14 ;
      new app.almacensindetalle.almacentejidoloaddvcombo(remoteHandle, context).execute( "AlbRef", Gx_mode, AV8EmprCod, AV77AlbRecCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item15) ;
      almacentejido_impl.this.AV93ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item14 = GXv_objcol_SdtDVB_SDTComboData_Item15[0] ;
      AV101AlbRef_Data = GXt_objcol_SdtDVB_SDTComboData_Item14 ;
      Combo_albref_Selectedvalue_set = AV93ComboSelectedValue ;
      ucCombo_albref.sendProperty(context, "", false, Combo_albref_Internalname, "SelectedValue_set", Combo_albref_Selectedvalue_set);
      AV102ComboAlbRef = AV93ComboSelectedValue ;
      httpContext.ajax_rsp_assign_attri("", false, "AV102ComboAlbRef", AV102ComboAlbRef);
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_albref_Enabled = false ;
         ucCombo_albref.sendProperty(context, "", false, Combo_albref_Internalname, "Enabled", GXutil.booltostr( Combo_albref_Enabled));
      }
   }

   public void S112( )
   {
      /* 'LOADCOMBOCLICOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item14 = AV94CliCod_Data ;
      GXv_char4[0] = AV93ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item15[0] = GXt_objcol_SdtDVB_SDTComboData_Item14 ;
      new app.almacensindetalle.almacentejidoloaddvcombo(remoteHandle, context).execute( "CliCod", Gx_mode, AV8EmprCod, AV77AlbRecCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item15) ;
      almacentejido_impl.this.AV93ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item14 = GXv_objcol_SdtDVB_SDTComboData_Item15[0] ;
      AV94CliCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item14 ;
      Combo_clicod_Selectedvalue_set = AV93ComboSelectedValue ;
      ucCombo_clicod.sendProperty(context, "", false, Combo_clicod_Internalname, "SelectedValue_set", Combo_clicod_Selectedvalue_set);
      AV69ComboCliCod = (int)(GXutil.lval( AV93ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69ComboCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69ComboCliCod), 6, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_clicod_Enabled = false ;
         ucCombo_clicod.sendProperty(context, "", false, Combo_clicod_Internalname, "Enabled", GXutil.booltostr( Combo_clicod_Enabled));
      }
   }

   public void e151S12( )
   {
      /* Tableintegracion_pontway_Click Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.ponteway.ogguiaimportview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"ogEmprCod","ogCliCod","ogARecCod","TabCode"}) , new Object[] {});
   }

   public void zm1S17( int GX_JID )
   {
      if ( ( GX_JID == 105 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z45AlbRef = T01S15_A45AlbRef[0] ;
            Z58AlbRUniEnt = T01S15_A58AlbRUniEnt[0] ;
            Z46AlbREnt = T01S15_A46AlbREnt[0] ;
            Z5806AlbREnt2 = T01S15_A5806AlbREnt2[0] ;
            Z56AlbRUni = T01S15_A56AlbRUni[0] ;
            Z47AlbREst = T01S15_A47AlbREst[0] ;
            Z12879AlbOEKOTEX = T01S15_A12879AlbOEKOTEX[0] ;
            Z3613AlbRefDsc = T01S15_A3613AlbRefDsc[0] ;
            Z49AlbRFen = T01S15_A49AlbRFen[0] ;
            Z6179AlbrHor = T01S15_A6179AlbrHor[0] ;
            Z4601AlbRTam = T01S15_A4601AlbRTam[0] ;
            Z9749Emp_Item1 = T01S15_A9749Emp_Item1[0] ;
            Z1291AlbRDes = T01S15_A1291AlbRDes[0] ;
            Z6463AlbRLote = T01S15_A6463AlbRLote[0] ;
            Z14525AlbRLot2 = T01S15_A14525AlbRLot2[0] ;
            Z6464AlbRTelar = T01S15_A6464AlbRTelar[0] ;
            Z6465AlbRLu = T01S15_A6465AlbRLu[0] ;
            Z6470AlbRTara = T01S15_A6470AlbRTara[0] ;
            Z4602AlbRMdlCod = T01S15_A4602AlbRMdlCod[0] ;
            Z8035AlbMaqTej = T01S15_A8035AlbMaqTej[0] ;
            Z8028AlbNumB = T01S15_A8028AlbNumB[0] ;
            Z60AlbRUniUti = T01S15_A60AlbRUniUti[0] ;
            Z52AlbRPieEnt = T01S15_A52AlbRPieEnt[0] ;
            Z54AlbRPieUti = T01S15_A54AlbRPieUti[0] ;
            Z6180AlbrUniC = T01S15_A6180AlbrUniC[0] ;
            Z6181AlbrPieC = T01S15_A6181AlbrPieC[0] ;
            Z50AlbRLoc = T01S15_A50AlbRLoc[0] ;
            Z55AlbRReo = T01S15_A55AlbRReo[0] ;
            Z53AlbRPieReb = T01S15_A53AlbRPieReb[0] ;
            Z59AlbRUniReb = T01S15_A59AlbRUniReb[0] ;
            Z48AlbRFecUlt = T01S15_A48AlbRFecUlt[0] ;
            Z1222AlbNumEti = T01S15_A1222AlbNumEti[0] ;
            Z1301AlbRUlin = T01S15_A1301AlbRUlin[0] ;
            Z4290AlbPmPPza = T01S15_A4290AlbPmPPza[0] ;
            Z4920AlbRGrm2 = T01S15_A4920AlbRGrm2[0] ;
            Z4921AlbRAnc = T01S15_A4921AlbRAnc[0] ;
            Z4922AlbPml = T01S15_A4922AlbPml[0] ;
            Z5743AlbRPre = T01S15_A5743AlbRPre[0] ;
            Z5744AlbRAju = T01S15_A5744AlbRAju[0] ;
            Z5745AlbRRep = T01S15_A5745AlbRRep[0] ;
            Z6178AlbrUsu = T01S15_A6178AlbrUsu[0] ;
            Z6182AlbrNF = T01S15_A6182AlbrNF[0] ;
            Z6183AlbrFeNf = T01S15_A6183AlbrFeNf[0] ;
            Z6184AlbrCfop = T01S15_A6184AlbrCfop[0] ;
            Z3359AlbRDisCli = T01S15_A3359AlbRDisCli[0] ;
            Z3360AlbRImp = T01S15_A3360AlbRImp[0] ;
            Z6471AlbRUniB = T01S15_A6471AlbRUniB[0] ;
            Z6488AlbDocPrv = T01S15_A6488AlbDocPrv[0] ;
            Z6523AlbRUdas = T01S15_A6523AlbRUdas[0] ;
            Z8023AlbColor = T01S15_A8023AlbColor[0] ;
            Z8024AlbOpsT = T01S15_A8024AlbOpsT[0] ;
            Z8025AlbOpsC = T01S15_A8025AlbOpsC[0] ;
            Z8026AlbOC = T01S15_A8026AlbOC[0] ;
            Z8027AlbHdri = T01S15_A8027AlbHdri[0] ;
            Z8029AlbNumM = T01S15_A8029AlbNumM[0] ;
            Z8030AlbAncC = T01S15_A8030AlbAncC[0] ;
            Z8031AlbDndC = T01S15_A8031AlbDndC[0] ;
            Z8032AlbAncCr = T01S15_A8032AlbAncCr[0] ;
            Z8033AlbDndCr = T01S15_A8033AlbDndCr[0] ;
            Z8036AlbDmt = T01S15_A8036AlbDmt[0] ;
            Z8034AlbGalga = T01S15_A8034AlbGalga[0] ;
            Z9793AlbPdaC = T01S15_A9793AlbPdaC[0] ;
            Z9794AlbOStj = T01S15_A9794AlbOStj[0] ;
            Z317AlbStLot = T01S15_A317AlbStLot[0] ;
            Z10358AlbTurno = T01S15_A10358AlbTurno[0] ;
            Z252CliCod = T01S15_A252CliCod[0] ;
            Z6263AlbRTartC = T01S15_A6263AlbRTartC[0] ;
            Z840TrnCod = T01S15_A840TrnCod[0] ;
            Z970ProceCod = T01S15_A970ProceCod[0] ;
            Z1211TipEntCod = T01S15_A1211TipEntCod[0] ;
            Z4792AlmCod = T01S15_A4792AlmCod[0] ;
         }
         else
         {
            Z45AlbRef = A45AlbRef ;
            Z58AlbRUniEnt = A58AlbRUniEnt ;
            Z46AlbREnt = A46AlbREnt ;
            Z5806AlbREnt2 = A5806AlbREnt2 ;
            Z56AlbRUni = A56AlbRUni ;
            Z47AlbREst = A47AlbREst ;
            Z12879AlbOEKOTEX = A12879AlbOEKOTEX ;
            Z3613AlbRefDsc = A3613AlbRefDsc ;
            Z49AlbRFen = A49AlbRFen ;
            Z6179AlbrHor = A6179AlbrHor ;
            Z4601AlbRTam = A4601AlbRTam ;
            Z9749Emp_Item1 = A9749Emp_Item1 ;
            Z1291AlbRDes = A1291AlbRDes ;
            Z6463AlbRLote = A6463AlbRLote ;
            Z14525AlbRLot2 = A14525AlbRLot2 ;
            Z6464AlbRTelar = A6464AlbRTelar ;
            Z6465AlbRLu = A6465AlbRLu ;
            Z6470AlbRTara = A6470AlbRTara ;
            Z4602AlbRMdlCod = A4602AlbRMdlCod ;
            Z8035AlbMaqTej = A8035AlbMaqTej ;
            Z8028AlbNumB = A8028AlbNumB ;
            Z60AlbRUniUti = A60AlbRUniUti ;
            Z52AlbRPieEnt = A52AlbRPieEnt ;
            Z54AlbRPieUti = A54AlbRPieUti ;
            Z6180AlbrUniC = A6180AlbrUniC ;
            Z6181AlbrPieC = A6181AlbrPieC ;
            Z50AlbRLoc = A50AlbRLoc ;
            Z55AlbRReo = A55AlbRReo ;
            Z53AlbRPieReb = A53AlbRPieReb ;
            Z59AlbRUniReb = A59AlbRUniReb ;
            Z48AlbRFecUlt = A48AlbRFecUlt ;
            Z1222AlbNumEti = A1222AlbNumEti ;
            Z1301AlbRUlin = A1301AlbRUlin ;
            Z4290AlbPmPPza = A4290AlbPmPPza ;
            Z4920AlbRGrm2 = A4920AlbRGrm2 ;
            Z4921AlbRAnc = A4921AlbRAnc ;
            Z4922AlbPml = A4922AlbPml ;
            Z5743AlbRPre = A5743AlbRPre ;
            Z5744AlbRAju = A5744AlbRAju ;
            Z5745AlbRRep = A5745AlbRRep ;
            Z6178AlbrUsu = A6178AlbrUsu ;
            Z6182AlbrNF = A6182AlbrNF ;
            Z6183AlbrFeNf = A6183AlbrFeNf ;
            Z6184AlbrCfop = A6184AlbrCfop ;
            Z3359AlbRDisCli = A3359AlbRDisCli ;
            Z3360AlbRImp = A3360AlbRImp ;
            Z6471AlbRUniB = A6471AlbRUniB ;
            Z6488AlbDocPrv = A6488AlbDocPrv ;
            Z6523AlbRUdas = A6523AlbRUdas ;
            Z8023AlbColor = A8023AlbColor ;
            Z8024AlbOpsT = A8024AlbOpsT ;
            Z8025AlbOpsC = A8025AlbOpsC ;
            Z8026AlbOC = A8026AlbOC ;
            Z8027AlbHdri = A8027AlbHdri ;
            Z8029AlbNumM = A8029AlbNumM ;
            Z8030AlbAncC = A8030AlbAncC ;
            Z8031AlbDndC = A8031AlbDndC ;
            Z8032AlbAncCr = A8032AlbAncCr ;
            Z8033AlbDndCr = A8033AlbDndCr ;
            Z8036AlbDmt = A8036AlbDmt ;
            Z8034AlbGalga = A8034AlbGalga ;
            Z9793AlbPdaC = A9793AlbPdaC ;
            Z9794AlbOStj = A9794AlbOStj ;
            Z317AlbStLot = A317AlbStLot ;
            Z10358AlbTurno = A10358AlbTurno ;
            Z252CliCod = A252CliCod ;
            Z6263AlbRTartC = A6263AlbRTartC ;
            Z840TrnCod = A840TrnCod ;
            Z970ProceCod = A970ProceCod ;
            Z1211TipEntCod = A1211TipEntCod ;
            Z4792AlmCod = A4792AlmCod ;
         }
      }
      if ( GX_JID == -105 )
      {
         Z44AlbRecCod = A44AlbRecCod ;
         Z45AlbRef = A45AlbRef ;
         Z58AlbRUniEnt = A58AlbRUniEnt ;
         Z46AlbREnt = A46AlbREnt ;
         Z5806AlbREnt2 = A5806AlbREnt2 ;
         Z56AlbRUni = A56AlbRUni ;
         Z47AlbREst = A47AlbREst ;
         Z12879AlbOEKOTEX = A12879AlbOEKOTEX ;
         Z3613AlbRefDsc = A3613AlbRefDsc ;
         Z49AlbRFen = A49AlbRFen ;
         Z6179AlbrHor = A6179AlbrHor ;
         Z4601AlbRTam = A4601AlbRTam ;
         Z9749Emp_Item1 = A9749Emp_Item1 ;
         Z1291AlbRDes = A1291AlbRDes ;
         Z6463AlbRLote = A6463AlbRLote ;
         Z14525AlbRLot2 = A14525AlbRLot2 ;
         Z6464AlbRTelar = A6464AlbRTelar ;
         Z6465AlbRLu = A6465AlbRLu ;
         Z6470AlbRTara = A6470AlbRTara ;
         Z4602AlbRMdlCod = A4602AlbRMdlCod ;
         Z8035AlbMaqTej = A8035AlbMaqTej ;
         Z8028AlbNumB = A8028AlbNumB ;
         Z60AlbRUniUti = A60AlbRUniUti ;
         Z52AlbRPieEnt = A52AlbRPieEnt ;
         Z54AlbRPieUti = A54AlbRPieUti ;
         Z6180AlbrUniC = A6180AlbrUniC ;
         Z6181AlbrPieC = A6181AlbrPieC ;
         Z50AlbRLoc = A50AlbRLoc ;
         Z55AlbRReo = A55AlbRReo ;
         Z53AlbRPieReb = A53AlbRPieReb ;
         Z59AlbRUniReb = A59AlbRUniReb ;
         Z48AlbRFecUlt = A48AlbRFecUlt ;
         Z1222AlbNumEti = A1222AlbNumEti ;
         Z1301AlbRUlin = A1301AlbRUlin ;
         Z4290AlbPmPPza = A4290AlbPmPPza ;
         Z4920AlbRGrm2 = A4920AlbRGrm2 ;
         Z4921AlbRAnc = A4921AlbRAnc ;
         Z4922AlbPml = A4922AlbPml ;
         Z5743AlbRPre = A5743AlbRPre ;
         Z5744AlbRAju = A5744AlbRAju ;
         Z5745AlbRRep = A5745AlbRRep ;
         Z6178AlbrUsu = A6178AlbrUsu ;
         Z6182AlbrNF = A6182AlbrNF ;
         Z6183AlbrFeNf = A6183AlbrFeNf ;
         Z6184AlbrCfop = A6184AlbrCfop ;
         Z3359AlbRDisCli = A3359AlbRDisCli ;
         Z3360AlbRImp = A3360AlbRImp ;
         Z6471AlbRUniB = A6471AlbRUniB ;
         Z6488AlbDocPrv = A6488AlbDocPrv ;
         Z6523AlbRUdas = A6523AlbRUdas ;
         Z8023AlbColor = A8023AlbColor ;
         Z8024AlbOpsT = A8024AlbOpsT ;
         Z8025AlbOpsC = A8025AlbOpsC ;
         Z8026AlbOC = A8026AlbOC ;
         Z8027AlbHdri = A8027AlbHdri ;
         Z8029AlbNumM = A8029AlbNumM ;
         Z8030AlbAncC = A8030AlbAncC ;
         Z8031AlbDndC = A8031AlbDndC ;
         Z8032AlbAncCr = A8032AlbAncCr ;
         Z8033AlbDndCr = A8033AlbDndCr ;
         Z8036AlbDmt = A8036AlbDmt ;
         Z8034AlbGalga = A8034AlbGalga ;
         Z9793AlbPdaC = A9793AlbPdaC ;
         Z9794AlbOStj = A9794AlbOStj ;
         Z317AlbStLot = A317AlbStLot ;
         Z10358AlbTurno = A10358AlbTurno ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z6263AlbRTartC = A6263AlbRTartC ;
         Z840TrnCod = A840TrnCod ;
         Z970ProceCod = A970ProceCod ;
         Z1211TipEntCod = A1211TipEntCod ;
         Z4792AlmCod = A4792AlmCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z8723CliEst = A8723CliEst ;
         Z13982AlbRArtLu = A13982AlbRArtLu ;
         Z6264AlbRTartD = A6264AlbRTartD ;
         Z841TrnNom = A841TrnNom ;
         Z971ProceNom = A971ProceNom ;
         Z1212TipEntNom = A1212TipEntNom ;
         Z4793AlmNom = A4793AlmNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtAlbRFecUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRFecUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFecUlt_Enabled), 5, 0), true);
      cmbAlbREst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbREst.getEnabled(), 5, 0), true);
      edtAlbrUsu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbrUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbrUsu_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      AV110Pgmname = "AlmacenSinDetalle.AlmacenTejido" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV110Pgmname", AV110Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      imgprompt_6263_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"app.ttipartprompt"+"',["+"{Ctrl:gx.dom.el('"+"vEMPRCOD"+"'), id:'"+"vEMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"ALBRTARTC"+"'), id:'"+"ALBRTARTC"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"ALBRTARTD"+"'), id:'"+"ALBRTARTD"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      edtAlbRFecUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRFecUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFecUlt_Enabled), 5, 0), true);
      cmbAlbREst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbREst.getEnabled(), 5, 0), true);
      edtAlbrUsu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbrUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbrUsu_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV8EmprCod)==0) )
      {
         A396EmprCod = AV8EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( httpContext.getMessage( "MODA21", ""), ""), GXv_int9) ;
      almacentejido_impl.this.GXt_int8 = GXv_int9[0] ;
      edtAlbTurno_Visible = ((GXt_int8==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbTurno_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTurno_Visible), 5, 0), true);
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( httpContext.getMessage( "MODA21", ""), ""), GXv_int9) ;
      almacentejido_impl.this.GXt_int8 = GXv_int9[0] ;
      if ( ! ( ( GXt_int8 == 1 ) ) )
      {
         divAlbturno_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divAlbturno_cell_Internalname, "Class", divAlbturno_cell_Class, true);
      }
      else
      {
         GXt_int8 = (byte)(0) ;
         GXv_int9[0] = GXt_int8 ;
         new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( httpContext.getMessage( "MODA21", ""), ""), GXv_int9) ;
         almacentejido_impl.this.GXt_int8 = GXv_int9[0] ;
         if ( GXt_int8 == 1 )
         {
            divAlbturno_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-2 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divAlbturno_cell_Internalname, "Class", divAlbturno_cell_Class, true);
         }
      }
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( httpContext.getMessage( "MODA21", ""), ""), GXv_int9) ;
      almacentejido_impl.this.GXt_int8 = GXv_int9[0] ;
      if ( ! ( ( GXt_int8 == 1 ) ) )
      {
         divDvpanel_unnamedtable7_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable7_cell_Internalname, "Class", divDvpanel_unnamedtable7_cell_Class, true);
      }
      else
      {
         GXt_int8 = (byte)(0) ;
         GXv_int9[0] = GXt_int8 ;
         new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( httpContext.getMessage( "MODA21", ""), ""), GXv_int9) ;
         almacentejido_impl.this.GXt_int8 = GXv_int9[0] ;
         if ( GXt_int8 == 1 )
         {
            divDvpanel_unnamedtable7_cell_Class = httpContext.getMessage( "col-xs-12", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable7_cell_Internalname, "Class", divDvpanel_unnamedtable7_cell_Class, true);
         }
      }
      if ( ! (0==AV77AlbRecCod) )
      {
         A44AlbRecCod = AV77AlbRecCod ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
      if ( ! (0==AV77AlbRecCod) )
      {
         edtAlbRecCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV82Insert_AlbRTartC) )
      {
         edtAlbRTartC_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRTartC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRTartC_Enabled), 5, 0), true);
      }
      else
      {
         edtAlbRTartC_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRTartC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRTartC_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV83Insert_TrnCod) )
      {
         edtTrnCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      }
      else
      {
         edtTrnCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV84Insert_ProceCod) )
      {
         edtProceCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProceCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceCod_Enabled), 5, 0), true);
      }
      else
      {
         edtProceCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProceCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV86Insert_AlmCod) )
      {
         edtAlmCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlmCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlmCod_Enabled), 5, 0), true);
      }
      else
      {
         edtAlmCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlmCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlmCod_Enabled), 5, 0), true);
      }
      edtAlbREnt_Visible = ((AV39EncCli_20==0) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt_Visible), 5, 0), true);
      if ( ! ( ( AV39EncCli_20 == 0 ) ) )
      {
         divAlbrent_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divAlbrent_cell_Internalname, "Class", divAlbrent_cell_Class, true);
      }
      else
      {
         if ( AV39EncCli_20 == 0 )
         {
            divAlbrent_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-3 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divAlbrent_cell_Internalname, "Class", divAlbrent_cell_Class, true);
         }
      }
      edtAlbREnt2_Visible = ((AV39EncCli_20==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt2_Visible), 5, 0), true);
      if ( ! ( ( AV39EncCli_20 == 1 ) ) )
      {
         divAlbrent2_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divAlbrent2_cell_Internalname, "Class", divAlbrent2_cell_Class, true);
      }
      else
      {
         if ( AV39EncCli_20 == 1 )
         {
            divAlbrent2_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-3 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divAlbrent2_cell_Internalname, "Class", divAlbrent2_cell_Class, true);
         }
      }
      edtAlbRLot2_Visible = ((AV25Moda21==1)&&(AV106Lote2==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRLot2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLot2_Visible), 5, 0), true);
      if ( ! ( ( AV25Moda21 == 1 ) && ( AV106Lote2 == 1 ) ) )
      {
         divAlbrlot2_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divAlbrlot2_cell_Internalname, "Class", divAlbrlot2_cell_Class, true);
      }
      else
      {
         if ( ( AV25Moda21 == 1 ) && ( AV106Lote2 == 1 ) )
         {
            divAlbrlot2_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-2 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divAlbrlot2_cell_Internalname, "Class", divAlbrlot2_cell_Class, true);
         }
      }
      edtAlbRLote_Visible = ((AV106Lote2==0) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRLote_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLote_Visible), 5, 0), true);
      if ( ! ( ( AV106Lote2 == 0 ) ) )
      {
         divAlbrlote_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divAlbrlote_cell_Internalname, "Class", divAlbrlote_cell_Class, true);
      }
      else
      {
         if ( AV106Lote2 == 0 )
         {
            divAlbrlote_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-2 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divAlbrlote_cell_Internalname, "Class", divAlbrlote_cell_Class, true);
         }
      }
   }

   public void standaloneModal( )
   {
      if ( isIns( )  )
      {
         edtAlbRPieUti_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), true);
      }
      else
      {
         edtAlbRPieUti_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), true);
      }
      if ( isIns( )  )
      {
         edtAlbRUniUti_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), true);
      }
      else
      {
         edtAlbRUniUti_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), true);
      }
      if ( isUpd( )  || isDlt( )  || isIns( )  )
      {
         edtAlbRecCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      }
      if ( isIns( )  )
      {
         edtAlbRPieUti_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), true);
      }
      if ( isIns( )  )
      {
         edtAlbRUniUti_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), true);
      }
      if ( (0==AV39EncCli_20) )
      {
         A5806AlbREnt2 = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "A5806AlbREnt2", A5806AlbREnt2);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV82Insert_AlbRTartC) )
      {
         A6263AlbRTartC = AV82Insert_AlbRTartC ;
         n6263AlbRTartC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6263AlbRTartC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6263AlbRTartC), 4, 0));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV81Insert_CliCod) )
      {
         A252CliCod = AV81Insert_CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      else
      {
         A252CliCod = AV69ComboCliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      A45AlbRef = AV102ComboAlbRef ;
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
      if ( ! (0==AV77AlbRecCod) )
      {
         edtAlbRecCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      }
      else
      {
         if ( isUpd( )  || isDlt( )  || isIns( )  )
         {
            edtAlbRecCod_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
         }
         else
         {
            edtAlbRecCod_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
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
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV83Insert_TrnCod) )
      {
         A840TrnCod = AV83Insert_TrnCod ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      }
      else
      {
         if ( (0==AV76ComboTrnCod) )
         {
            A840TrnCod = (short)(0) ;
            n840TrnCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            n840TrnCod = true ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         }
         else
         {
            if ( ! (0==AV76ComboTrnCod) )
            {
               A840TrnCod = AV76ComboTrnCod ;
               n840TrnCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            }
            else
            {
               if ( isIns( )  && (0==A840TrnCod) && ( Gx_BScreen == 0 ) )
               {
                  A840TrnCod = (short)(0) ;
                  n840TrnCod = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
               }
            }
         }
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV84Insert_ProceCod) )
      {
         A970ProceCod = AV84Insert_ProceCod ;
         n970ProceCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
      }
      else
      {
         if ( (0==AV97ComboProceCod) )
         {
            A970ProceCod = (short)(0) ;
            n970ProceCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
            n970ProceCod = true ;
            httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         }
         else
         {
            if ( ! (0==AV97ComboProceCod) )
            {
               A970ProceCod = AV97ComboProceCod ;
               n970ProceCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
            }
            else
            {
               if ( isIns( )  && (0==A970ProceCod) && ( Gx_BScreen == 0 ) )
               {
                  A970ProceCod = (short)(0) ;
                  n970ProceCod = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
               }
            }
         }
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV85Insert_TipEntCod) )
      {
         A1211TipEntCod = AV85Insert_TipEntCod ;
         n1211TipEntCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
      }
      else
      {
         if ( (0==AV99ComboTipEntCod) )
         {
            A1211TipEntCod = (short)(0) ;
            n1211TipEntCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
            n1211TipEntCod = true ;
            httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
         }
         else
         {
            if ( ! (0==AV99ComboTipEntCod) )
            {
               A1211TipEntCod = AV99ComboTipEntCod ;
               n1211TipEntCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
            }
            else
            {
               if ( isIns( )  && (0==A1211TipEntCod) && ( Gx_BScreen == 0 ) )
               {
                  A1211TipEntCod = (short)(1) ;
                  n1211TipEntCod = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
               }
            }
         }
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV86Insert_AlmCod) )
      {
         A4792AlmCod = AV86Insert_AlmCod ;
         n4792AlmCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4792AlmCod", GXutil.str( A4792AlmCod, 1, 0));
      }
      else
      {
         if ( (0==AV105ComboAlmCod) )
         {
            A4792AlmCod = (byte)(0) ;
            n4792AlmCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4792AlmCod", GXutil.str( A4792AlmCod, 1, 0));
            n4792AlmCod = true ;
            httpContext.ajax_rsp_assign_attri("", false, "A4792AlmCod", GXutil.str( A4792AlmCod, 1, 0));
         }
         else
         {
            if ( ! (0==AV105ComboAlmCod) )
            {
               A4792AlmCod = AV105ComboAlmCod ;
               n4792AlmCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4792AlmCod", GXutil.str( A4792AlmCod, 1, 0));
            }
            else
            {
               if ( isIns( )  && (0==A4792AlmCod) && ( Gx_BScreen == 0 ) )
               {
                  A4792AlmCod = (byte)(0) ;
                  n4792AlmCod = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4792AlmCod", GXutil.str( A4792AlmCod, 1, 0));
               }
            }
         }
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A49AlbRFen)) && ( Gx_BScreen == 0 ) )
      {
         A49AlbRFen = GXutil.today( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A6183AlbrFeNf)) && ( Gx_BScreen == 0 ) )
      {
         A6183AlbrFeNf = GXutil.today( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6183AlbrFeNf", localUtil.format(A6183AlbrFeNf, "99/99/99"));
      }
      if ( isIns( )  && (GXutil.strcmp("", A55AlbRReo)==0) && ( Gx_BScreen == 0 ) )
      {
         A55AlbRReo = httpContext.getMessage( httpContext.getMessage( "NO", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A48AlbRFecUlt)) && ( Gx_BScreen == 0 ) )
      {
         A48AlbRFecUlt = GXutil.today( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
      }
      if ( isIns( )  && (GXutil.strcmp("", A6182AlbrNF)==0) && ( Gx_BScreen == 0 ) )
      {
         A6182AlbrNF = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A6182AlbrNF", A6182AlbrNF);
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A6179AlbrHor) && ( Gx_BScreen == 0 ) )
      {
         A6179AlbrHor = GXutil.resetDate(GXutil.serverNow( context, remoteHandle, pr_default)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6179AlbrHor", localUtil.ttoc( A6179AlbrHor, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      if ( isIns( )  && (GXutil.strcmp("", A6178AlbrUsu)==0) && ( Gx_BScreen == 0 ) )
      {
         A6178AlbrUsu = AV7UsurCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A6178AlbrUsu", A6178AlbrUsu);
      }
      if ( isIns( )  && (GXutil.strcmp("", A3360AlbRImp)==0) && ( Gx_BScreen == 0 ) )
      {
         A3360AlbRImp = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A3360AlbRImp", A3360AlbRImp);
      }
      if ( isIns( )  && (GXutil.strcmp("", A4602AlbRMdlCod)==0) && ( Gx_BScreen == 0 ) )
      {
         A4602AlbRMdlCod = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "A4602AlbRMdlCod", A4602AlbRMdlCod);
      }
      if ( isIns( )  && (GXutil.strcmp("", A6463AlbRLote)==0) && ( Gx_BScreen == 0 ) )
      {
         A6463AlbRLote = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", A6463AlbRLote);
      }
      if ( isIns( )  && (GXutil.strcmp("", A6464AlbRTelar)==0) && ( Gx_BScreen == 0 ) )
      {
         A6464AlbRTelar = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "A6464AlbRTelar", A6464AlbRTelar);
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A6470AlbRTara)==0) && ( Gx_BScreen == 0 ) )
      {
         A6470AlbRTara = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6470AlbRTara", GXutil.ltrimstr( A6470AlbRTara, 6, 2));
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A6471AlbRUniB)==0) && ( Gx_BScreen == 0 ) )
      {
         A6471AlbRUniB = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6471AlbRUniB", GXutil.ltrimstr( A6471AlbRUniB, 9, 2));
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A6523AlbRUdas)==0) && ( Gx_BScreen == 0 ) )
      {
         A6523AlbRUdas = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6523AlbRUdas", GXutil.ltrimstr( A6523AlbRUdas, 9, 2));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T01S16 */
         pr_default.execute(4, new Object[] {A396EmprCod});
         A407EmprNom = T01S16_A407EmprNom[0] ;
         n407EmprNom = T01S16_n407EmprNom[0] ;
         pr_default.close(4);
         /* Using cursor T01S18 */
         pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n6263AlbRTartC), Short.valueOf(A6263AlbRTartC)});
         A6264AlbRTartD = T01S18_A6264AlbRTartD[0] ;
         n6264AlbRTartD = T01S18_n6264AlbRTartD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6264AlbRTartD", A6264AlbRTartD);
         pr_default.close(6);
         /* Using cursor T01S17 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01S17_A279CliNom[0] ;
         A8723CliEst = T01S17_A8723CliEst[0] ;
         pr_default.close(5);
         /* Using cursor T01S113 */
         pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A45AlbRef});
         if ( (pr_default.getStatus(11) != 101) )
         {
            A13982AlbRArtLu = T01S113_A13982AlbRArtLu[0] ;
            n13982AlbRArtLu = T01S113_n13982AlbRArtLu[0] ;
         }
         else
         {
            A13982AlbRArtLu = DecimalUtil.doubleToDec(0) ;
            n13982AlbRArtLu = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13982AlbRArtLu", GXutil.ltrimstr( A13982AlbRArtLu, 6, 2));
         }
         pr_default.close(11);
         GXt_char1 = A13981Composicio ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int11[0] = A252CliCod ;
         GXv_char3[0] = A45AlbRef ;
         GXv_char2[0] = GXt_char1 ;
         new app.almacensindetalle.composicion(remoteHandle, context).execute( GXv_char4, GXv_int11, GXv_char3, GXv_char2) ;
         almacentejido_impl.this.A396EmprCod = GXv_char4[0] ;
         almacentejido_impl.this.A252CliCod = GXv_int11[0] ;
         almacentejido_impl.this.A45AlbRef = GXv_char3[0] ;
         almacentejido_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         A13981Composicio = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A13981Composicio", A13981Composicio);
         /* Using cursor T01S19 */
         pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         A841TrnNom = T01S19_A841TrnNom[0] ;
         n841TrnNom = T01S19_n841TrnNom[0] ;
         pr_default.close(7);
         /* Using cursor T01S110 */
         pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
         A971ProceNom = T01S110_A971ProceNom[0] ;
         n971ProceNom = T01S110_n971ProceNom[0] ;
         pr_default.close(8);
         /* Using cursor T01S111 */
         pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod)});
         A1212TipEntNom = T01S111_A1212TipEntNom[0] ;
         n1212TipEntNom = T01S111_n1212TipEntNom[0] ;
         pr_default.close(9);
         if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
         {
            edtAlbRLoc_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLoc_Enabled), 5, 0), true);
         }
         else
         {
            edtAlbRLoc_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLoc_Enabled), 5, 0), true);
         }
         if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
         {
            edtAlbRef_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Enabled), 5, 0), true);
         }
         else
         {
            edtAlbRef_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Enabled), 5, 0), true);
         }
         if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
         {
            edtAlbRFen_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRFen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFen_Enabled), 5, 0), true);
         }
         else
         {
            edtAlbRFen_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRFen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFen_Enabled), 5, 0), true);
         }
         if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
         {
            cmbAlbRUni.setEnabled( 0 );
            httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRUni.getEnabled(), 5, 0), true);
         }
         else
         {
            cmbAlbRUni.setEnabled( 1 );
            httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRUni.getEnabled(), 5, 0), true);
         }
         if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
         {
            cmbAlbRReo.setEnabled( 0 );
            httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRReo.getEnabled(), 5, 0), true);
         }
         else
         {
            cmbAlbRReo.setEnabled( 1 );
            httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRReo.getEnabled(), 5, 0), true);
         }
         /* Using cursor T01S112 */
         pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n4792AlmCod), Byte.valueOf(A4792AlmCod)});
         A4793AlmNom = T01S112_A4793AlmNom[0] ;
         n4793AlmNom = T01S112_n4793AlmNom[0] ;
         pr_default.close(10);
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV81Insert_CliCod) )
         {
            edtCliCod_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
         }
         else
         {
            if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
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
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV85Insert_TipEntCod) )
         {
            edtTipEntCod_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtTipEntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipEntCod_Enabled), 5, 0), true);
         }
         else
         {
            if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
            {
               edtTipEntCod_Enabled = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtTipEntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipEntCod_Enabled), 5, 0), true);
            }
            else
            {
               edtTipEntCod_Enabled = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtTipEntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipEntCod_Enabled), 5, 0), true);
            }
         }
         if ( AV39EncCli_20 == 1 )
         {
            A46AlbREnt = GXutil.substring( A5806AlbREnt2, 1, 8) ;
            httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", A46AlbREnt);
         }
      }
   }

   public void load1S17( )
   {
      /* Using cursor T01S114 */
      pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound7 = (short)(1) ;
         A45AlbRef = T01S114_A45AlbRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         A58AlbRUniEnt = T01S114_A58AlbRUniEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         A46AlbREnt = T01S114_A46AlbREnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", A46AlbREnt);
         A5806AlbREnt2 = T01S114_A5806AlbREnt2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5806AlbREnt2", A5806AlbREnt2);
         A56AlbRUni = T01S114_A56AlbRUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         A47AlbREst = T01S114_A47AlbREst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         A12879AlbOEKOTEX = T01S114_A12879AlbOEKOTEX[0] ;
         A3613AlbRefDsc = T01S114_A3613AlbRefDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
         A6264AlbRTartD = T01S114_A6264AlbRTartD[0] ;
         n6264AlbRTartD = T01S114_n6264AlbRTartD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6264AlbRTartD", A6264AlbRTartD);
         A407EmprNom = T01S114_A407EmprNom[0] ;
         n407EmprNom = T01S114_n407EmprNom[0] ;
         A279CliNom = T01S114_A279CliNom[0] ;
         A49AlbRFen = T01S114_A49AlbRFen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
         A6179AlbrHor = T01S114_A6179AlbrHor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6179AlbrHor", localUtil.ttoc( A6179AlbrHor, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A4601AlbRTam = T01S114_A4601AlbRTam[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4601AlbRTam", A4601AlbRTam);
         A9749Emp_Item1 = T01S114_A9749Emp_Item1[0] ;
         A841TrnNom = T01S114_A841TrnNom[0] ;
         n841TrnNom = T01S114_n841TrnNom[0] ;
         A1291AlbRDes = T01S114_A1291AlbRDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", A1291AlbRDes);
         A971ProceNom = T01S114_A971ProceNom[0] ;
         n971ProceNom = T01S114_n971ProceNom[0] ;
         A6463AlbRLote = T01S114_A6463AlbRLote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", A6463AlbRLote);
         A14525AlbRLot2 = T01S114_A14525AlbRLot2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14525AlbRLot2", A14525AlbRLot2);
         A6464AlbRTelar = T01S114_A6464AlbRTelar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6464AlbRTelar", A6464AlbRTelar);
         A6465AlbRLu = T01S114_A6465AlbRLu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6465AlbRLu", GXutil.ltrimstr( A6465AlbRLu, 6, 2));
         A6470AlbRTara = T01S114_A6470AlbRTara[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6470AlbRTara", GXutil.ltrimstr( A6470AlbRTara, 6, 2));
         A4602AlbRMdlCod = T01S114_A4602AlbRMdlCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4602AlbRMdlCod", A4602AlbRMdlCod);
         A8035AlbMaqTej = T01S114_A8035AlbMaqTej[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8035AlbMaqTej", A8035AlbMaqTej);
         A8028AlbNumB = T01S114_A8028AlbNumB[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8028AlbNumB", A8028AlbNumB);
         A60AlbRUniUti = T01S114_A60AlbRUniUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         A52AlbRPieEnt = T01S114_A52AlbRPieEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         A54AlbRPieUti = T01S114_A54AlbRPieUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         A6180AlbrUniC = T01S114_A6180AlbrUniC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6180AlbrUniC", GXutil.ltrimstr( A6180AlbrUniC, 9, 2));
         A6181AlbrPieC = T01S114_A6181AlbrPieC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6181AlbrPieC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6181AlbrPieC), 6, 0));
         A50AlbRLoc = T01S114_A50AlbRLoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", A50AlbRLoc);
         A55AlbRReo = T01S114_A55AlbRReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
         A53AlbRPieReb = T01S114_A53AlbRPieReb[0] ;
         A59AlbRUniReb = T01S114_A59AlbRUniReb[0] ;
         A48AlbRFecUlt = T01S114_A48AlbRFecUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
         A1212TipEntNom = T01S114_A1212TipEntNom[0] ;
         n1212TipEntNom = T01S114_n1212TipEntNom[0] ;
         A1222AlbNumEti = T01S114_A1222AlbNumEti[0] ;
         A1301AlbRUlin = T01S114_A1301AlbRUlin[0] ;
         A4290AlbPmPPza = T01S114_A4290AlbPmPPza[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4290AlbPmPPza", GXutil.ltrimstr( A4290AlbPmPPza, 6, 3));
         A4920AlbRGrm2 = T01S114_A4920AlbRGrm2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
         A4921AlbRAnc = T01S114_A4921AlbRAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
         A4922AlbPml = T01S114_A4922AlbPml[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4922AlbPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4922AlbPml), 4, 0));
         A5743AlbRPre = T01S114_A5743AlbRPre[0] ;
         A5744AlbRAju = T01S114_A5744AlbRAju[0] ;
         A5745AlbRRep = T01S114_A5745AlbRRep[0] ;
         A6178AlbrUsu = T01S114_A6178AlbrUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6178AlbrUsu", A6178AlbrUsu);
         A6182AlbrNF = T01S114_A6182AlbrNF[0] ;
         A6183AlbrFeNf = T01S114_A6183AlbrFeNf[0] ;
         A6184AlbrCfop = T01S114_A6184AlbrCfop[0] ;
         A3359AlbRDisCli = T01S114_A3359AlbRDisCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3359AlbRDisCli", A3359AlbRDisCli);
         A3360AlbRImp = T01S114_A3360AlbRImp[0] ;
         A6471AlbRUniB = T01S114_A6471AlbRUniB[0] ;
         A6488AlbDocPrv = T01S114_A6488AlbDocPrv[0] ;
         A6523AlbRUdas = T01S114_A6523AlbRUdas[0] ;
         A4793AlmNom = T01S114_A4793AlmNom[0] ;
         n4793AlmNom = T01S114_n4793AlmNom[0] ;
         A8023AlbColor = T01S114_A8023AlbColor[0] ;
         A8024AlbOpsT = T01S114_A8024AlbOpsT[0] ;
         A8025AlbOpsC = T01S114_A8025AlbOpsC[0] ;
         A8026AlbOC = T01S114_A8026AlbOC[0] ;
         A8027AlbHdri = T01S114_A8027AlbHdri[0] ;
         A8029AlbNumM = T01S114_A8029AlbNumM[0] ;
         A8030AlbAncC = T01S114_A8030AlbAncC[0] ;
         A8031AlbDndC = T01S114_A8031AlbDndC[0] ;
         A8032AlbAncCr = T01S114_A8032AlbAncCr[0] ;
         A8033AlbDndCr = T01S114_A8033AlbDndCr[0] ;
         A8036AlbDmt = T01S114_A8036AlbDmt[0] ;
         A8034AlbGalga = T01S114_A8034AlbGalga[0] ;
         A9793AlbPdaC = T01S114_A9793AlbPdaC[0] ;
         A9794AlbOStj = T01S114_A9794AlbOStj[0] ;
         A317AlbStLot = T01S114_A317AlbStLot[0] ;
         A10358AlbTurno = T01S114_A10358AlbTurno[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10358AlbTurno", GXutil.str( A10358AlbTurno, 1, 0));
         A8723CliEst = T01S114_A8723CliEst[0] ;
         A252CliCod = T01S114_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A6263AlbRTartC = T01S114_A6263AlbRTartC[0] ;
         n6263AlbRTartC = T01S114_n6263AlbRTartC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6263AlbRTartC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6263AlbRTartC), 4, 0));
         A840TrnCod = T01S114_A840TrnCod[0] ;
         n840TrnCod = T01S114_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A970ProceCod = T01S114_A970ProceCod[0] ;
         n970ProceCod = T01S114_n970ProceCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         A1211TipEntCod = T01S114_A1211TipEntCod[0] ;
         n1211TipEntCod = T01S114_n1211TipEntCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
         A4792AlmCod = T01S114_A4792AlmCod[0] ;
         n4792AlmCod = T01S114_n4792AlmCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4792AlmCod", GXutil.str( A4792AlmCod, 1, 0));
         A13982AlbRArtLu = T01S114_A13982AlbRArtLu[0] ;
         n13982AlbRArtLu = T01S114_n13982AlbRArtLu[0] ;
         zm1S17( -105) ;
      }
      pr_default.close(12);
      onLoadActions1S17( ) ;
   }

   public void onLoadActions1S17( )
   {
      if ( ( GXutil.strcmp(sMode7, "INS") == 0 ) && ! (0==AV81Insert_CliCod) )
      {
         edtCliCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      else
      {
         if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
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
      if ( ( GXutil.strcmp(sMode7, "INS") == 0 ) && ! (0==AV85Insert_TipEntCod) )
      {
         edtTipEntCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTipEntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipEntCod_Enabled), 5, 0), true);
      }
      else
      {
         if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
         {
            edtTipEntCod_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtTipEntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipEntCod_Enabled), 5, 0), true);
         }
         else
         {
            edtTipEntCod_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtTipEntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipEntCod_Enabled), 5, 0), true);
         }
      }
      if ( AV39EncCli_20 == 1 )
      {
         A46AlbREnt = GXutil.substring( A5806AlbREnt2, 1, 8) ;
         httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", A46AlbREnt);
      }
      if ( isIns( )  && ( AV14FlagKgs == 1 ) && (GXutil.strcmp("", A56AlbRUni)==0) )
      {
         A56AlbRUni = httpContext.getMessage( httpContext.getMessage( "K", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      }
      else
      {
         if ( isIns( )  && ( AV15FlagMts == 1 ) && (GXutil.strcmp("", A56AlbRUni)==0) )
         {
            A56AlbRUni = httpContext.getMessage( httpContext.getMessage( "M", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         }
      }
      if ( isIns( )  && (GXutil.strcmp("", A12879AlbOEKOTEX)==0) && ( AV37okotex == 0 ) )
      {
         A12879AlbOEKOTEX = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A12879AlbOEKOTEX", A12879AlbOEKOTEX);
      }
      GXt_char1 = A13981Composicio ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int11[0] = A252CliCod ;
      GXv_char3[0] = A45AlbRef ;
      GXv_char2[0] = GXt_char1 ;
      new app.almacensindetalle.composicion(remoteHandle, context).execute( GXv_char4, GXv_int11, GXv_char3, GXv_char2) ;
      almacentejido_impl.this.A396EmprCod = GXv_char4[0] ;
      almacentejido_impl.this.A252CliCod = GXv_int11[0] ;
      almacentejido_impl.this.A45AlbRef = GXv_char3[0] ;
      almacentejido_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
      A13981Composicio = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13981Composicio", A13981Composicio);
      if ( isDsp( )  )
      {
         GXv_char4[0] = A3613AlbRefDsc ;
         GXv_int13[0] = A6263AlbRTartC ;
         GXv_char3[0] = A6264AlbRTartD ;
         GXv_int12[0] = AV91ExisteReferencia ;
         new app.almacensindetalle.datosreferencia(remoteHandle, context).execute( A396EmprCod, A252CliCod, A45AlbRef, GXv_char4, GXv_int13, GXv_char3, GXv_int12) ;
         almacentejido_impl.this.A3613AlbRefDsc = GXv_char4[0] ;
         almacentejido_impl.this.A6263AlbRTartC = GXv_int13[0] ;
         almacentejido_impl.this.A6264AlbRTartD = GXv_char3[0] ;
         almacentejido_impl.this.AV91ExisteReferencia = GXv_int12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
         httpContext.ajax_rsp_assign_attri("", false, "A6263AlbRTartC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6263AlbRTartC), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A6264AlbRTartD", A6264AlbRTartD);
         httpContext.ajax_rsp_assign_attri("", false, "AV91ExisteReferencia", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV91ExisteReferencia), 4, 0));
      }
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
      {
         edtAlbRLoc_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLoc_Enabled), 5, 0), true);
      }
      else
      {
         edtAlbRLoc_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLoc_Enabled), 5, 0), true);
      }
      if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
      {
         edtAlbRef_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Enabled), 5, 0), true);
      }
      else
      {
         edtAlbRef_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Enabled), 5, 0), true);
      }
      if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
      {
         edtAlbRFen_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRFen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFen_Enabled), 5, 0), true);
      }
      else
      {
         edtAlbRFen_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRFen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFen_Enabled), 5, 0), true);
      }
      if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
      {
         cmbAlbRUni.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRUni.getEnabled(), 5, 0), true);
      }
      else
      {
         cmbAlbRUni.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRUni.getEnabled(), 5, 0), true);
      }
      if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
      {
         cmbAlbRReo.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRReo.getEnabled(), 5, 0), true);
      }
      else
      {
         cmbAlbRReo.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRReo.getEnabled(), 5, 0), true);
      }
      if ( ( A4290AlbPmPPza.doubleValue() > 0 ) && true /* After */ )
      {
         A58AlbRUniEnt = DecimalUtil.doubleToDec(A52AlbRPieEnt).multiply(A4290AlbPmPPza) ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      }
      if ( A4290AlbPmPPza.doubleValue() > 0 )
      {
         A4291AlbPzaEst = (int)(DecimalUtil.decToDouble(GXutil.roundDecimal( A58AlbRUniEnt.divide(A4290AlbPmPPza, 18, java.math.RoundingMode.DOWN), 0))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4291AlbPzaEst", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4291AlbPzaEst), 8, 0));
      }
      else
      {
         A4291AlbPzaEst = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A4291AlbPzaEst", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4291AlbPzaEst), 8, 0));
      }
      divTableintegracion_pontway_Visible = (((GXutil.strcmp(A8024AlbOpsT, httpContext.getMessage( "IMPORTED", ""))==0)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, divTableintegracion_pontway_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTableintegracion_pontway_Visible), 5, 0), true);
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A6465AlbRLu)==0) && ( Gx_BScreen == 0 ) )
      {
         A6465AlbRLu = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6465AlbRLu", GXutil.ltrimstr( A6465AlbRLu, 6, 2));
      }
      else
      {
         if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A6465AlbRLu)==0) && ( Gx_BScreen == 0 ) )
         {
            A6465AlbRLu = A13982AlbRArtLu ;
            httpContext.ajax_rsp_assign_attri("", false, "A6465AlbRLu", GXutil.ltrimstr( A6465AlbRLu, 6, 2));
         }
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A6180AlbrUniC)==0) && ( Gx_BScreen == 0 ) )
      {
         A6180AlbrUniC = A58AlbRUniEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A6180AlbrUniC", GXutil.ltrimstr( A6180AlbrUniC, 9, 2));
      }
      if ( isIns( )  && (0==A6181AlbrPieC) && ( Gx_BScreen == 0 ) )
      {
         A6181AlbrPieC = A52AlbRPieEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A6181AlbrPieC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6181AlbrPieC), 6, 0));
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
      if ( isIns( )  && (0==A47AlbREst) && ( Gx_BScreen == 0 ) )
      {
         A47AlbREst = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      }
      else
      {
         if ( A57AlbRUniDis.doubleValue() == 0 )
         {
            A47AlbREst = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         }
         else
         {
            if ( A57AlbRUniDis.doubleValue() != 0 )
            {
               A47AlbREst = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
            }
         }
      }
      if ( A47AlbREst == 1 )
      {
         AV72AlbCum = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV72AlbCum", AV72AlbCum);
      }
      else
      {
         if ( A47AlbREst == 0 )
         {
            AV72AlbCum = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72AlbCum", AV72AlbCum);
         }
      }
   }

   public void checkExtendedTable1S17( )
   {
      nIsDirty_7 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV81Insert_CliCod) )
      {
         edtCliCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      else
      {
         if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
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
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV85Insert_TipEntCod) )
      {
         edtTipEntCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTipEntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipEntCod_Enabled), 5, 0), true);
      }
      else
      {
         if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
         {
            edtTipEntCod_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtTipEntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipEntCod_Enabled), 5, 0), true);
         }
         else
         {
            edtTipEntCod_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtTipEntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipEntCod_Enabled), 5, 0), true);
         }
      }
      if ( AV39EncCli_20 == 1 )
      {
         nIsDirty_7 = (short)(1) ;
         A46AlbREnt = GXutil.substring( A5806AlbREnt2, 1, 8) ;
         httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", A46AlbREnt);
      }
      if ( isIns( )  && ( AV14FlagKgs == 1 ) && (GXutil.strcmp("", A56AlbRUni)==0) )
      {
         nIsDirty_7 = (short)(1) ;
         A56AlbRUni = httpContext.getMessage( httpContext.getMessage( "K", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      }
      else
      {
         if ( isIns( )  && ( AV15FlagMts == 1 ) && (GXutil.strcmp("", A56AlbRUni)==0) )
         {
            nIsDirty_7 = (short)(1) ;
            A56AlbRUni = httpContext.getMessage( httpContext.getMessage( "M", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         }
      }
      if ( isIns( )  && (GXutil.strcmp("", A12879AlbOEKOTEX)==0) && ( AV37okotex == 0 ) )
      {
         nIsDirty_7 = (short)(1) ;
         A12879AlbOEKOTEX = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A12879AlbOEKOTEX", A12879AlbOEKOTEX);
      }
      /* Using cursor T01S16 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01S16_A407EmprNom[0] ;
      n407EmprNom = T01S16_n407EmprNom[0] ;
      pr_default.close(4);
      /* Using cursor T01S17 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe Cliente", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01S17_A279CliNom[0] ;
      A8723CliEst = T01S17_A8723CliEst[0] ;
      pr_default.close(5);
      /* Using cursor T01S18 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n6263AlbRTartC), Short.valueOf(A6263AlbRTartC)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A6263AlbRTartC) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tipo de Articulo", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRTARTC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A6264AlbRTartD = T01S18_A6264AlbRTartD[0] ;
      n6264AlbRTartD = T01S18_n6264AlbRTartD[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A6264AlbRTartD", A6264AlbRTartD);
      pr_default.close(6);
      /* Using cursor T01S19 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A841TrnNom = T01S19_A841TrnNom[0] ;
      n841TrnNom = T01S19_n841TrnNom[0] ;
      pr_default.close(7);
      /* Using cursor T01S110 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A970ProceCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCED", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCECOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A971ProceNom = T01S110_A971ProceNom[0] ;
      n971ProceNom = T01S110_n971ProceNom[0] ;
      pr_default.close(8);
      /* Using cursor T01S111 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A1211TipEntCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENTRAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPENTCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A1212TipEntNom = T01S111_A1212TipEntNom[0] ;
      n1212TipEntNom = T01S111_n1212TipEntNom[0] ;
      pr_default.close(9);
      /* Using cursor T01S112 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n4792AlmCod), Byte.valueOf(A4792AlmCod)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A4792AlmCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Almacen", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALMCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A4793AlmNom = T01S112_A4793AlmNom[0] ;
      n4793AlmNom = T01S112_n4793AlmNom[0] ;
      pr_default.close(10);
      /* Using cursor T01S113 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A45AlbRef});
      if ( (pr_default.getStatus(11) != 101) )
      {
         A13982AlbRArtLu = T01S113_A13982AlbRArtLu[0] ;
         n13982AlbRArtLu = T01S113_n13982AlbRArtLu[0] ;
      }
      else
      {
         nIsDirty_7 = (short)(1) ;
         A13982AlbRArtLu = DecimalUtil.doubleToDec(0) ;
         n13982AlbRArtLu = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13982AlbRArtLu", GXutil.ltrimstr( A13982AlbRArtLu, 6, 2));
      }
      pr_default.close(11);
      nIsDirty_7 = (short)(1) ;
      GXt_char1 = A13981Composicio ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int11[0] = A252CliCod ;
      GXv_char3[0] = A45AlbRef ;
      GXv_char2[0] = GXt_char1 ;
      new app.almacensindetalle.composicion(remoteHandle, context).execute( GXv_char4, GXv_int11, GXv_char3, GXv_char2) ;
      almacentejido_impl.this.A396EmprCod = GXv_char4[0] ;
      almacentejido_impl.this.A252CliCod = GXv_int11[0] ;
      almacentejido_impl.this.A45AlbRef = GXv_char3[0] ;
      almacentejido_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
      A13981Composicio = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13981Composicio", A13981Composicio);
      if ( isDsp( )  )
      {
         GXv_char4[0] = A3613AlbRefDsc ;
         GXv_int13[0] = A6263AlbRTartC ;
         GXv_char3[0] = A6264AlbRTartD ;
         GXv_int12[0] = AV91ExisteReferencia ;
         new app.almacensindetalle.datosreferencia(remoteHandle, context).execute( A396EmprCod, A252CliCod, A45AlbRef, GXv_char4, GXv_int13, GXv_char3, GXv_int12) ;
         almacentejido_impl.this.A3613AlbRefDsc = GXv_char4[0] ;
         almacentejido_impl.this.A6263AlbRTartC = GXv_int13[0] ;
         almacentejido_impl.this.A6264AlbRTartD = GXv_char3[0] ;
         almacentejido_impl.this.AV91ExisteReferencia = GXv_int12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
         httpContext.ajax_rsp_assign_attri("", false, "A6263AlbRTartC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6263AlbRTartC), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A6264AlbRTartD", A6264AlbRTartD);
         httpContext.ajax_rsp_assign_attri("", false, "AV91ExisteReferencia", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV91ExisteReferencia), 4, 0));
      }
      if ( isIns( )  && ( ! (0==A44AlbRecCod) ) && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "N Recepcion Inexistente", ""), 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( AV25Moda21 == 1 ) && ( AV26Cli350 == 1 ) && ( AV27ContVal == 1 ) && true /* After */ && ( A252CliCod == 350 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente INEXISTENTE ¡¡¡", ""), 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( (0==A252CliCod) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente NO valido, Cliente igual a 0", ""), 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A56AlbRUni, "K") == 0 ) || ( GXutil.strcmp(A56AlbRUni, "M") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ALBRUNI");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbAlbRUni.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      nIsDirty_7 = (short)(1) ;
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      if ( ! ( ( GXutil.strcmp(A55AlbRReo, "SI") == 0 ) || ( GXutil.strcmp(A55AlbRReo, "NO") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Reclamacion?", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ALBRREO");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbAlbRReo.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
      {
         edtAlbRLoc_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLoc_Enabled), 5, 0), true);
      }
      else
      {
         edtAlbRLoc_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLoc_Enabled), 5, 0), true);
      }
      if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
      {
         edtAlbRef_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Enabled), 5, 0), true);
      }
      else
      {
         edtAlbRef_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Enabled), 5, 0), true);
      }
      if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
      {
         edtAlbRFen_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRFen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFen_Enabled), 5, 0), true);
      }
      else
      {
         edtAlbRFen_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRFen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFen_Enabled), 5, 0), true);
      }
      if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
      {
         cmbAlbRUni.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRUni.getEnabled(), 5, 0), true);
      }
      else
      {
         cmbAlbRUni.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRUni.getEnabled(), 5, 0), true);
      }
      if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
      {
         cmbAlbRReo.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRReo.getEnabled(), 5, 0), true);
      }
      else
      {
         cmbAlbRReo.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRReo.getEnabled(), 5, 0), true);
      }
      if ( ( A4290AlbPmPPza.doubleValue() > 0 ) && true /* After */ )
      {
         nIsDirty_7 = (short)(1) ;
         A58AlbRUniEnt = DecimalUtil.doubleToDec(A52AlbRPieEnt).multiply(A4290AlbPmPPza) ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      }
      if ( A4290AlbPmPPza.doubleValue() > 0 )
      {
         nIsDirty_7 = (short)(1) ;
         A4291AlbPzaEst = (int)(DecimalUtil.decToDouble(GXutil.roundDecimal( A58AlbRUniEnt.divide(A4290AlbPmPPza, 18, java.math.RoundingMode.DOWN), 0))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4291AlbPzaEst", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4291AlbPzaEst), 8, 0));
      }
      else
      {
         nIsDirty_7 = (short)(1) ;
         A4291AlbPzaEst = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A4291AlbPzaEst", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4291AlbPzaEst), 8, 0));
      }
      divTableintegracion_pontway_Visible = (((GXutil.strcmp(A8024AlbOpsT, httpContext.getMessage( "IMPORTED", ""))==0)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, divTableintegracion_pontway_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTableintegracion_pontway_Visible), 5, 0), true);
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A6465AlbRLu)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_7 = (short)(1) ;
         A6465AlbRLu = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6465AlbRLu", GXutil.ltrimstr( A6465AlbRLu, 6, 2));
      }
      else
      {
         if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A6465AlbRLu)==0) && ( Gx_BScreen == 0 ) )
         {
            nIsDirty_7 = (short)(1) ;
            A6465AlbRLu = A13982AlbRArtLu ;
            httpContext.ajax_rsp_assign_attri("", false, "A6465AlbRLu", GXutil.ltrimstr( A6465AlbRLu, 6, 2));
         }
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A6180AlbrUniC)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_7 = (short)(1) ;
         A6180AlbrUniC = A58AlbRUniEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A6180AlbrUniC", GXutil.ltrimstr( A6180AlbrUniC, 9, 2));
      }
      if ( isIns( )  && (0==A6181AlbrPieC) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_7 = (short)(1) ;
         A6181AlbrPieC = A52AlbRPieEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A6181AlbrPieC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6181AlbrPieC), 6, 0));
      }
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         nIsDirty_7 = (short)(1) ;
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            nIsDirty_7 = (short)(1) ;
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
         else
         {
            nIsDirty_7 = (short)(1) ;
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
      }
      if ( isIns( )  && (0==A47AlbREst) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_7 = (short)(1) ;
         A47AlbREst = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      }
      else
      {
         if ( A57AlbRUniDis.doubleValue() == 0 )
         {
            nIsDirty_7 = (short)(1) ;
            A47AlbREst = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         }
         else
         {
            if ( A57AlbRUniDis.doubleValue() != 0 )
            {
               nIsDirty_7 = (short)(1) ;
               A47AlbREst = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
            }
         }
      }
      if ( A47AlbREst == 1 )
      {
         AV72AlbCum = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV72AlbCum", AV72AlbCum);
      }
      else
      {
         if ( A47AlbREst == 0 )
         {
            AV72AlbCum = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72AlbCum", AV72AlbCum);
         }
      }
   }

   public void closeExtendedTableCursors1S17( )
   {
      pr_default.close(4);
      pr_default.close(5);
      pr_default.close(6);
      pr_default.close(7);
      pr_default.close(8);
      pr_default.close(9);
      pr_default.close(10);
      pr_default.close(11);
   }

   public void enableDisable( )
   {
   }

   public void gxload_106( String A396EmprCod )
   {
      /* Using cursor T01S115 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01S115_A407EmprNom[0] ;
      n407EmprNom = T01S115_n407EmprNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void gxload_107( String A396EmprCod ,
                           int A252CliCod )
   {
      /* Using cursor T01S116 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe Cliente", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01S116_A279CliNom[0] ;
      A8723CliEst = T01S116_A8723CliEst[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A8723CliEst))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(14) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(14);
   }

   public void gxload_108( String A396EmprCod ,
                           short A6263AlbRTartC )
   {
      /* Using cursor T01S117 */
      pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n6263AlbRTartC), Short.valueOf(A6263AlbRTartC)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A6263AlbRTartC) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tipo de Articulo", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRTARTC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A6264AlbRTartD = T01S117_A6264AlbRTartD[0] ;
      n6264AlbRTartD = T01S117_n6264AlbRTartD[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A6264AlbRTartD", A6264AlbRTartD);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6264AlbRTartD))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(15) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(15);
   }

   public void gxload_109( String A396EmprCod ,
                           short A840TrnCod )
   {
      /* Using cursor T01S118 */
      pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A841TrnNom = T01S118_A841TrnNom[0] ;
      n841TrnNom = T01S118_n841TrnNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A841TrnNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(16) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(16);
   }

   public void gxload_110( String A396EmprCod ,
                           short A970ProceCod )
   {
      /* Using cursor T01S119 */
      pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A970ProceCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCED", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCECOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A971ProceNom = T01S119_A971ProceNom[0] ;
      n971ProceNom = T01S119_n971ProceNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A971ProceNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(17) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(17);
   }

   public void gxload_111( String A396EmprCod ,
                           short A1211TipEntCod )
   {
      /* Using cursor T01S120 */
      pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A1211TipEntCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENTRAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPENTCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A1212TipEntNom = T01S120_A1212TipEntNom[0] ;
      n1212TipEntNom = T01S120_n1212TipEntNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1212TipEntNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(18) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(18);
   }

   public void gxload_112( String A396EmprCod ,
                           byte A4792AlmCod )
   {
      /* Using cursor T01S121 */
      pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n4792AlmCod), Byte.valueOf(A4792AlmCod)});
      if ( (pr_default.getStatus(19) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A4792AlmCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Almacen", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALMCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A4793AlmNom = T01S121_A4793AlmNom[0] ;
      n4793AlmNom = T01S121_n4793AlmNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4793AlmNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(19) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(19);
   }

   public void gxload_113( String A396EmprCod ,
                           int A252CliCod ,
                           String A45AlbRef )
   {
      /* Using cursor T01S122 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A45AlbRef});
      if ( (pr_default.getStatus(20) != 101) )
      {
         A13982AlbRArtLu = T01S122_A13982AlbRArtLu[0] ;
         n13982AlbRArtLu = T01S122_n13982AlbRArtLu[0] ;
      }
      else
      {
         A13982AlbRArtLu = DecimalUtil.doubleToDec(0) ;
         n13982AlbRArtLu = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13982AlbRArtLu", GXutil.ltrimstr( A13982AlbRArtLu, 6, 2));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13982AlbRArtLu, (byte)(6), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(20) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(20);
   }

   public void getKey1S17( )
   {
      /* Using cursor T01S123 */
      pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound7 = (short)(1) ;
      }
      else
      {
         RcdFound7 = (short)(0) ;
      }
      pr_default.close(21);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01S15 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zm1S17( 105) ;
         RcdFound7 = (short)(1) ;
         A44AlbRecCod = T01S15_A44AlbRecCod[0] ;
         n44AlbRecCod = T01S15_n44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A45AlbRef = T01S15_A45AlbRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         A58AlbRUniEnt = T01S15_A58AlbRUniEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         A46AlbREnt = T01S15_A46AlbREnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", A46AlbREnt);
         A5806AlbREnt2 = T01S15_A5806AlbREnt2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5806AlbREnt2", A5806AlbREnt2);
         A56AlbRUni = T01S15_A56AlbRUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         A47AlbREst = T01S15_A47AlbREst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         A12879AlbOEKOTEX = T01S15_A12879AlbOEKOTEX[0] ;
         A3613AlbRefDsc = T01S15_A3613AlbRefDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
         A49AlbRFen = T01S15_A49AlbRFen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
         A6179AlbrHor = T01S15_A6179AlbrHor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6179AlbrHor", localUtil.ttoc( A6179AlbrHor, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A4601AlbRTam = T01S15_A4601AlbRTam[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4601AlbRTam", A4601AlbRTam);
         A9749Emp_Item1 = T01S15_A9749Emp_Item1[0] ;
         A1291AlbRDes = T01S15_A1291AlbRDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", A1291AlbRDes);
         A6463AlbRLote = T01S15_A6463AlbRLote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", A6463AlbRLote);
         A14525AlbRLot2 = T01S15_A14525AlbRLot2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14525AlbRLot2", A14525AlbRLot2);
         A6464AlbRTelar = T01S15_A6464AlbRTelar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6464AlbRTelar", A6464AlbRTelar);
         A6465AlbRLu = T01S15_A6465AlbRLu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6465AlbRLu", GXutil.ltrimstr( A6465AlbRLu, 6, 2));
         A6470AlbRTara = T01S15_A6470AlbRTara[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6470AlbRTara", GXutil.ltrimstr( A6470AlbRTara, 6, 2));
         A4602AlbRMdlCod = T01S15_A4602AlbRMdlCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4602AlbRMdlCod", A4602AlbRMdlCod);
         A8035AlbMaqTej = T01S15_A8035AlbMaqTej[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8035AlbMaqTej", A8035AlbMaqTej);
         A8028AlbNumB = T01S15_A8028AlbNumB[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8028AlbNumB", A8028AlbNumB);
         A60AlbRUniUti = T01S15_A60AlbRUniUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         A52AlbRPieEnt = T01S15_A52AlbRPieEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         A54AlbRPieUti = T01S15_A54AlbRPieUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         A6180AlbrUniC = T01S15_A6180AlbrUniC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6180AlbrUniC", GXutil.ltrimstr( A6180AlbrUniC, 9, 2));
         A6181AlbrPieC = T01S15_A6181AlbrPieC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6181AlbrPieC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6181AlbrPieC), 6, 0));
         A50AlbRLoc = T01S15_A50AlbRLoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", A50AlbRLoc);
         A55AlbRReo = T01S15_A55AlbRReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
         A53AlbRPieReb = T01S15_A53AlbRPieReb[0] ;
         A59AlbRUniReb = T01S15_A59AlbRUniReb[0] ;
         A48AlbRFecUlt = T01S15_A48AlbRFecUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
         A1222AlbNumEti = T01S15_A1222AlbNumEti[0] ;
         A1301AlbRUlin = T01S15_A1301AlbRUlin[0] ;
         A4290AlbPmPPza = T01S15_A4290AlbPmPPza[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4290AlbPmPPza", GXutil.ltrimstr( A4290AlbPmPPza, 6, 3));
         A4920AlbRGrm2 = T01S15_A4920AlbRGrm2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
         A4921AlbRAnc = T01S15_A4921AlbRAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
         A4922AlbPml = T01S15_A4922AlbPml[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4922AlbPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4922AlbPml), 4, 0));
         A5743AlbRPre = T01S15_A5743AlbRPre[0] ;
         A5744AlbRAju = T01S15_A5744AlbRAju[0] ;
         A5745AlbRRep = T01S15_A5745AlbRRep[0] ;
         A6178AlbrUsu = T01S15_A6178AlbrUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6178AlbrUsu", A6178AlbrUsu);
         A6182AlbrNF = T01S15_A6182AlbrNF[0] ;
         A6183AlbrFeNf = T01S15_A6183AlbrFeNf[0] ;
         A6184AlbrCfop = T01S15_A6184AlbrCfop[0] ;
         A3359AlbRDisCli = T01S15_A3359AlbRDisCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3359AlbRDisCli", A3359AlbRDisCli);
         A3360AlbRImp = T01S15_A3360AlbRImp[0] ;
         A6471AlbRUniB = T01S15_A6471AlbRUniB[0] ;
         A6488AlbDocPrv = T01S15_A6488AlbDocPrv[0] ;
         A6523AlbRUdas = T01S15_A6523AlbRUdas[0] ;
         A8023AlbColor = T01S15_A8023AlbColor[0] ;
         A8024AlbOpsT = T01S15_A8024AlbOpsT[0] ;
         A8025AlbOpsC = T01S15_A8025AlbOpsC[0] ;
         A8026AlbOC = T01S15_A8026AlbOC[0] ;
         A8027AlbHdri = T01S15_A8027AlbHdri[0] ;
         A8029AlbNumM = T01S15_A8029AlbNumM[0] ;
         A8030AlbAncC = T01S15_A8030AlbAncC[0] ;
         A8031AlbDndC = T01S15_A8031AlbDndC[0] ;
         A8032AlbAncCr = T01S15_A8032AlbAncCr[0] ;
         A8033AlbDndCr = T01S15_A8033AlbDndCr[0] ;
         A8036AlbDmt = T01S15_A8036AlbDmt[0] ;
         A8034AlbGalga = T01S15_A8034AlbGalga[0] ;
         A9793AlbPdaC = T01S15_A9793AlbPdaC[0] ;
         A9794AlbOStj = T01S15_A9794AlbOStj[0] ;
         A317AlbStLot = T01S15_A317AlbStLot[0] ;
         A10358AlbTurno = T01S15_A10358AlbTurno[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10358AlbTurno", GXutil.str( A10358AlbTurno, 1, 0));
         A396EmprCod = T01S15_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T01S15_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A6263AlbRTartC = T01S15_A6263AlbRTartC[0] ;
         n6263AlbRTartC = T01S15_n6263AlbRTartC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6263AlbRTartC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6263AlbRTartC), 4, 0));
         A840TrnCod = T01S15_A840TrnCod[0] ;
         n840TrnCod = T01S15_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A970ProceCod = T01S15_A970ProceCod[0] ;
         n970ProceCod = T01S15_n970ProceCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         A1211TipEntCod = T01S15_A1211TipEntCod[0] ;
         n1211TipEntCod = T01S15_n1211TipEntCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
         A4792AlmCod = T01S15_A4792AlmCod[0] ;
         n4792AlmCod = T01S15_n4792AlmCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4792AlmCod", GXutil.str( A4792AlmCod, 1, 0));
         O1301AlbRUlin = A1301AlbRUlin ;
         httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         sMode7 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1S17( ) ;
         if ( AnyError == 1 )
         {
            RcdFound7 = (short)(0) ;
            initializeNonKey1S17( ) ;
         }
         Gx_mode = sMode7 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound7 = (short)(0) ;
         initializeNonKey1S17( ) ;
         sMode7 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode7 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1S17( ) ;
      if ( RcdFound7 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound7 = (short)(0) ;
      /* Using cursor T01S124 */
      pr_default.execute(22, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(22) != 101) )
      {
         while ( (pr_default.getStatus(22) != 101) && ( ( GXutil.strcmp(T01S124_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01S124_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01S124_A44AlbRecCod[0] < A44AlbRecCod ) ) )
         {
            pr_default.readNext(22);
         }
         if ( (pr_default.getStatus(22) != 101) && ( ( GXutil.strcmp(T01S124_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01S124_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01S124_A44AlbRecCod[0] > A44AlbRecCod ) ) )
         {
            A396EmprCod = T01S124_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A44AlbRecCod = T01S124_A44AlbRecCod[0] ;
            n44AlbRecCod = T01S124_n44AlbRecCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            RcdFound7 = (short)(1) ;
         }
      }
      pr_default.close(22);
   }

   public void move_previous( )
   {
      RcdFound7 = (short)(0) ;
      /* Using cursor T01S125 */
      pr_default.execute(23, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(23) != 101) )
      {
         while ( (pr_default.getStatus(23) != 101) && ( ( GXutil.strcmp(T01S125_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01S125_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01S125_A44AlbRecCod[0] > A44AlbRecCod ) ) )
         {
            pr_default.readNext(23);
         }
         if ( (pr_default.getStatus(23) != 101) && ( ( GXutil.strcmp(T01S125_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01S125_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01S125_A44AlbRecCod[0] < A44AlbRecCod ) ) )
         {
            A396EmprCod = T01S125_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A44AlbRecCod = T01S125_A44AlbRecCod[0] ;
            n44AlbRecCod = T01S125_n44AlbRecCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            RcdFound7 = (short)(1) ;
         }
      }
      pr_default.close(23);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1S17( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A1301AlbRUlin = O1301AlbRUlin ;
         httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1S17( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound7 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A44AlbRecCod = Z44AlbRecCod ;
               n44AlbRecCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A1301AlbRUlin = O1301AlbRUlin ;
               httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtAlbRecCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               A1301AlbRUlin = O1301AlbRUlin ;
               httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
               update1S17( ) ;
               GX_FocusControl = edtAlbRecCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) )
            {
               /* Insert record */
               A1301AlbRUlin = O1301AlbRUlin ;
               httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
               GX_FocusControl = edtAlbRecCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1S17( ) ;
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
                  A1301AlbRUlin = O1301AlbRUlin ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
                  GX_FocusControl = edtAlbRecCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1S17( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = Z44AlbRecCod ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A1301AlbRUlin = O1301AlbRUlin ;
         httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1S17( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01S14 */
         pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBREC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z45AlbRef, T01S14_A45AlbRef[0]) != 0 ) || ( DecimalUtil.compareTo(Z58AlbRUniEnt, T01S14_A58AlbRUniEnt[0]) != 0 ) || ( GXutil.strcmp(Z46AlbREnt, T01S14_A46AlbREnt[0]) != 0 ) || ( GXutil.strcmp(Z5806AlbREnt2, T01S14_A5806AlbREnt2[0]) != 0 ) || ( GXutil.strcmp(Z56AlbRUni, T01S14_A56AlbRUni[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z47AlbREst != T01S14_A47AlbREst[0] ) || ( GXutil.strcmp(Z12879AlbOEKOTEX, T01S14_A12879AlbOEKOTEX[0]) != 0 ) || ( GXutil.strcmp(Z3613AlbRefDsc, T01S14_A3613AlbRefDsc[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z49AlbRFen), GXutil.resetTime(T01S14_A49AlbRFen[0])) ) || !( GXutil.dateCompare(Z6179AlbrHor, T01S14_A6179AlbrHor[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4601AlbRTam, T01S14_A4601AlbRTam[0]) != 0 ) || ( GXutil.strcmp(Z9749Emp_Item1, T01S14_A9749Emp_Item1[0]) != 0 ) || ( GXutil.strcmp(Z1291AlbRDes, T01S14_A1291AlbRDes[0]) != 0 ) || ( GXutil.strcmp(Z6463AlbRLote, T01S14_A6463AlbRLote[0]) != 0 ) || ( GXutil.strcmp(Z14525AlbRLot2, T01S14_A14525AlbRLot2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z6464AlbRTelar, T01S14_A6464AlbRTelar[0]) != 0 ) || ( DecimalUtil.compareTo(Z6465AlbRLu, T01S14_A6465AlbRLu[0]) != 0 ) || ( DecimalUtil.compareTo(Z6470AlbRTara, T01S14_A6470AlbRTara[0]) != 0 ) || ( GXutil.strcmp(Z4602AlbRMdlCod, T01S14_A4602AlbRMdlCod[0]) != 0 ) || ( GXutil.strcmp(Z8035AlbMaqTej, T01S14_A8035AlbMaqTej[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z8028AlbNumB, T01S14_A8028AlbNumB[0]) != 0 ) || ( DecimalUtil.compareTo(Z60AlbRUniUti, T01S14_A60AlbRUniUti[0]) != 0 ) || ( Z52AlbRPieEnt != T01S14_A52AlbRPieEnt[0] ) || ( Z54AlbRPieUti != T01S14_A54AlbRPieUti[0] ) || ( DecimalUtil.compareTo(Z6180AlbrUniC, T01S14_A6180AlbrUniC[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z6181AlbrPieC != T01S14_A6181AlbrPieC[0] ) || ( GXutil.strcmp(Z50AlbRLoc, T01S14_A50AlbRLoc[0]) != 0 ) || ( GXutil.strcmp(Z55AlbRReo, T01S14_A55AlbRReo[0]) != 0 ) || ( Z53AlbRPieReb != T01S14_A53AlbRPieReb[0] ) || ( DecimalUtil.compareTo(Z59AlbRUniReb, T01S14_A59AlbRUniReb[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z48AlbRFecUlt), GXutil.resetTime(T01S14_A48AlbRFecUlt[0])) ) || ( Z1222AlbNumEti != T01S14_A1222AlbNumEti[0] ) || ( Z1301AlbRUlin != T01S14_A1301AlbRUlin[0] ) || ( DecimalUtil.compareTo(Z4290AlbPmPPza, T01S14_A4290AlbPmPPza[0]) != 0 ) || ( Z4920AlbRGrm2 != T01S14_A4920AlbRGrm2[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z4921AlbRAnc != T01S14_A4921AlbRAnc[0] ) || ( Z4922AlbPml != T01S14_A4922AlbPml[0] ) || ( DecimalUtil.compareTo(Z5743AlbRPre, T01S14_A5743AlbRPre[0]) != 0 ) || ( DecimalUtil.compareTo(Z5744AlbRAju, T01S14_A5744AlbRAju[0]) != 0 ) || ( Z5745AlbRRep != T01S14_A5745AlbRRep[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z6178AlbrUsu, T01S14_A6178AlbrUsu[0]) != 0 ) || ( GXutil.strcmp(Z6182AlbrNF, T01S14_A6182AlbrNF[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z6183AlbrFeNf), GXutil.resetTime(T01S14_A6183AlbrFeNf[0])) ) || ( GXutil.strcmp(Z6184AlbrCfop, T01S14_A6184AlbrCfop[0]) != 0 ) || ( GXutil.strcmp(Z3359AlbRDisCli, T01S14_A3359AlbRDisCli[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z3360AlbRImp, T01S14_A3360AlbRImp[0]) != 0 ) || ( DecimalUtil.compareTo(Z6471AlbRUniB, T01S14_A6471AlbRUniB[0]) != 0 ) || ( GXutil.strcmp(Z6488AlbDocPrv, T01S14_A6488AlbDocPrv[0]) != 0 ) || ( DecimalUtil.compareTo(Z6523AlbRUdas, T01S14_A6523AlbRUdas[0]) != 0 ) || ( GXutil.strcmp(Z8023AlbColor, T01S14_A8023AlbColor[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z8024AlbOpsT, T01S14_A8024AlbOpsT[0]) != 0 ) || ( GXutil.strcmp(Z8025AlbOpsC, T01S14_A8025AlbOpsC[0]) != 0 ) || ( GXutil.strcmp(Z8026AlbOC, T01S14_A8026AlbOC[0]) != 0 ) || ( GXutil.strcmp(Z8027AlbHdri, T01S14_A8027AlbHdri[0]) != 0 ) || ( GXutil.strcmp(Z8029AlbNumM, T01S14_A8029AlbNumM[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z8030AlbAncC, T01S14_A8030AlbAncC[0]) != 0 ) || ( Z8031AlbDndC != T01S14_A8031AlbDndC[0] ) || ( DecimalUtil.compareTo(Z8032AlbAncCr, T01S14_A8032AlbAncCr[0]) != 0 ) || ( Z8033AlbDndCr != T01S14_A8033AlbDndCr[0] ) || ( Z8036AlbDmt != T01S14_A8036AlbDmt[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z8034AlbGalga != T01S14_A8034AlbGalga[0] ) || ( GXutil.strcmp(Z9793AlbPdaC, T01S14_A9793AlbPdaC[0]) != 0 ) || ( GXutil.strcmp(Z9794AlbOStj, T01S14_A9794AlbOStj[0]) != 0 ) || ( Z317AlbStLot != T01S14_A317AlbStLot[0] ) || ( Z10358AlbTurno != T01S14_A10358AlbTurno[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z252CliCod != T01S14_A252CliCod[0] ) || ( Z6263AlbRTartC != T01S14_A6263AlbRTartC[0] ) || ( Z840TrnCod != T01S14_A840TrnCod[0] ) || ( Z970ProceCod != T01S14_A970ProceCod[0] ) || ( Z1211TipEntCod != T01S14_A1211TipEntCod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z4792AlmCod != T01S14_A4792AlmCod[0] ) )
         {
            if ( GXutil.strcmp(Z45AlbRef, T01S14_A45AlbRef[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbRef");
               GXutil.writeLogRaw("Old: ",Z45AlbRef);
               GXutil.writeLogRaw("Current: ",T01S14_A45AlbRef[0]);
            }
            if ( DecimalUtil.compareTo(Z58AlbRUniEnt, T01S14_A58AlbRUniEnt[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbRUniEnt");
               GXutil.writeLogRaw("Old: ",Z58AlbRUniEnt);
               GXutil.writeLogRaw("Current: ",T01S14_A58AlbRUniEnt[0]);
            }
            if ( GXutil.strcmp(Z46AlbREnt, T01S14_A46AlbREnt[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbREnt");
               GXutil.writeLogRaw("Old: ",Z46AlbREnt);
               GXutil.writeLogRaw("Current: ",T01S14_A46AlbREnt[0]);
            }
            if ( GXutil.strcmp(Z5806AlbREnt2, T01S14_A5806AlbREnt2[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbREnt2");
               GXutil.writeLogRaw("Old: ",Z5806AlbREnt2);
               GXutil.writeLogRaw("Current: ",T01S14_A5806AlbREnt2[0]);
            }
            if ( GXutil.strcmp(Z56AlbRUni, T01S14_A56AlbRUni[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbRUni");
               GXutil.writeLogRaw("Old: ",Z56AlbRUni);
               GXutil.writeLogRaw("Current: ",T01S14_A56AlbRUni[0]);
            }
            if ( Z47AlbREst != T01S14_A47AlbREst[0] )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbREst");
               GXutil.writeLogRaw("Old: ",Z47AlbREst);
               GXutil.writeLogRaw("Current: ",T01S14_A47AlbREst[0]);
            }
            if ( GXutil.strcmp(Z12879AlbOEKOTEX, T01S14_A12879AlbOEKOTEX[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbOEKOTEX");
               GXutil.writeLogRaw("Old: ",Z12879AlbOEKOTEX);
               GXutil.writeLogRaw("Current: ",T01S14_A12879AlbOEKOTEX[0]);
            }
            if ( GXutil.strcmp(Z3613AlbRefDsc, T01S14_A3613AlbRefDsc[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbRefDsc");
               GXutil.writeLogRaw("Old: ",Z3613AlbRefDsc);
               GXutil.writeLogRaw("Current: ",T01S14_A3613AlbRefDsc[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z49AlbRFen), GXutil.resetTime(T01S14_A49AlbRFen[0])) ) )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbRFen");
               GXutil.writeLogRaw("Old: ",Z49AlbRFen);
               GXutil.writeLogRaw("Current: ",T01S14_A49AlbRFen[0]);
            }
            if ( !( GXutil.dateCompare(Z6179AlbrHor, T01S14_A6179AlbrHor[0]) ) )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbrHor");
               GXutil.writeLogRaw("Old: ",Z6179AlbrHor);
               GXutil.writeLogRaw("Current: ",T01S14_A6179AlbrHor[0]);
            }
            if ( GXutil.strcmp(Z4601AlbRTam, T01S14_A4601AlbRTam[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbRTam");
               GXutil.writeLogRaw("Old: ",Z4601AlbRTam);
               GXutil.writeLogRaw("Current: ",T01S14_A4601AlbRTam[0]);
            }
            if ( GXutil.strcmp(Z9749Emp_Item1, T01S14_A9749Emp_Item1[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"Emp_Item1");
               GXutil.writeLogRaw("Old: ",Z9749Emp_Item1);
               GXutil.writeLogRaw("Current: ",T01S14_A9749Emp_Item1[0]);
            }
            if ( GXutil.strcmp(Z1291AlbRDes, T01S14_A1291AlbRDes[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbRDes");
               GXutil.writeLogRaw("Old: ",Z1291AlbRDes);
               GXutil.writeLogRaw("Current: ",T01S14_A1291AlbRDes[0]);
            }
            if ( GXutil.strcmp(Z6463AlbRLote, T01S14_A6463AlbRLote[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbRLote");
               GXutil.writeLogRaw("Old: ",Z6463AlbRLote);
               GXutil.writeLogRaw("Current: ",T01S14_A6463AlbRLote[0]);
            }
            if ( GXutil.strcmp(Z14525AlbRLot2, T01S14_A14525AlbRLot2[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbRLot2");
               GXutil.writeLogRaw("Old: ",Z14525AlbRLot2);
               GXutil.writeLogRaw("Current: ",T01S14_A14525AlbRLot2[0]);
            }
            if ( GXutil.strcmp(Z6464AlbRTelar, T01S14_A6464AlbRTelar[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbRTelar");
               GXutil.writeLogRaw("Old: ",Z6464AlbRTelar);
               GXutil.writeLogRaw("Current: ",T01S14_A6464AlbRTelar[0]);
            }
            if ( DecimalUtil.compareTo(Z6465AlbRLu, T01S14_A6465AlbRLu[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbRLu");
               GXutil.writeLogRaw("Old: ",Z6465AlbRLu);
               GXutil.writeLogRaw("Current: ",T01S14_A6465AlbRLu[0]);
            }
            if ( DecimalUtil.compareTo(Z6470AlbRTara, T01S14_A6470AlbRTara[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbRTara");
               GXutil.writeLogRaw("Old: ",Z6470AlbRTara);
               GXutil.writeLogRaw("Current: ",T01S14_A6470AlbRTara[0]);
            }
            if ( GXutil.strcmp(Z4602AlbRMdlCod, T01S14_A4602AlbRMdlCod[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbRMdlCod");
               GXutil.writeLogRaw("Old: ",Z4602AlbRMdlCod);
               GXutil.writeLogRaw("Current: ",T01S14_A4602AlbRMdlCod[0]);
            }
            if ( GXutil.strcmp(Z8035AlbMaqTej, T01S14_A8035AlbMaqTej[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbMaqTej");
               GXutil.writeLogRaw("Old: ",Z8035AlbMaqTej);
               GXutil.writeLogRaw("Current: ",T01S14_A8035AlbMaqTej[0]);
            }
            if ( GXutil.strcmp(Z8028AlbNumB, T01S14_A8028AlbNumB[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbNumB");
               GXutil.writeLogRaw("Old: ",Z8028AlbNumB);
               GXutil.writeLogRaw("Current: ",T01S14_A8028AlbNumB[0]);
            }
            if ( DecimalUtil.compareTo(Z60AlbRUniUti, T01S14_A60AlbRUniUti[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbRUniUti");
               GXutil.writeLogRaw("Old: ",Z60AlbRUniUti);
               GXutil.writeLogRaw("Current: ",T01S14_A60AlbRUniUti[0]);
            }
            if ( Z52AlbRPieEnt != T01S14_A52AlbRPieEnt[0] )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbRPieEnt");
               GXutil.writeLogRaw("Old: ",Z52AlbRPieEnt);
               GXutil.writeLogRaw("Current: ",T01S14_A52AlbRPieEnt[0]);
            }
            if ( Z54AlbRPieUti != T01S14_A54AlbRPieUti[0] )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbRPieUti");
               GXutil.writeLogRaw("Old: ",Z54AlbRPieUti);
               GXutil.writeLogRaw("Current: ",T01S14_A54AlbRPieUti[0]);
            }
            if ( DecimalUtil.compareTo(Z6180AlbrUniC, T01S14_A6180AlbrUniC[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbrUniC");
               GXutil.writeLogRaw("Old: ",Z6180AlbrUniC);
               GXutil.writeLogRaw("Current: ",T01S14_A6180AlbrUniC[0]);
            }
            if ( Z6181AlbrPieC != T01S14_A6181AlbrPieC[0] )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbrPieC");
               GXutil.writeLogRaw("Old: ",Z6181AlbrPieC);
               GXutil.writeLogRaw("Current: ",T01S14_A6181AlbrPieC[0]);
            }
            if ( GXutil.strcmp(Z50AlbRLoc, T01S14_A50AlbRLoc[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbRLoc");
               GXutil.writeLogRaw("Old: ",Z50AlbRLoc);
               GXutil.writeLogRaw("Current: ",T01S14_A50AlbRLoc[0]);
            }
            if ( GXutil.strcmp(Z55AlbRReo, T01S14_A55AlbRReo[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbRReo");
               GXutil.writeLogRaw("Old: ",Z55AlbRReo);
               GXutil.writeLogRaw("Current: ",T01S14_A55AlbRReo[0]);
            }
            if ( Z53AlbRPieReb != T01S14_A53AlbRPieReb[0] )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbRPieReb");
               GXutil.writeLogRaw("Old: ",Z53AlbRPieReb);
               GXutil.writeLogRaw("Current: ",T01S14_A53AlbRPieReb[0]);
            }
            if ( DecimalUtil.compareTo(Z59AlbRUniReb, T01S14_A59AlbRUniReb[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbRUniReb");
               GXutil.writeLogRaw("Old: ",Z59AlbRUniReb);
               GXutil.writeLogRaw("Current: ",T01S14_A59AlbRUniReb[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z48AlbRFecUlt), GXutil.resetTime(T01S14_A48AlbRFecUlt[0])) ) )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbRFecUlt");
               GXutil.writeLogRaw("Old: ",Z48AlbRFecUlt);
               GXutil.writeLogRaw("Current: ",T01S14_A48AlbRFecUlt[0]);
            }
            if ( Z1222AlbNumEti != T01S14_A1222AlbNumEti[0] )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbNumEti");
               GXutil.writeLogRaw("Old: ",Z1222AlbNumEti);
               GXutil.writeLogRaw("Current: ",T01S14_A1222AlbNumEti[0]);
            }
            if ( Z1301AlbRUlin != T01S14_A1301AlbRUlin[0] )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbRUlin");
               GXutil.writeLogRaw("Old: ",Z1301AlbRUlin);
               GXutil.writeLogRaw("Current: ",T01S14_A1301AlbRUlin[0]);
            }
            if ( DecimalUtil.compareTo(Z4290AlbPmPPza, T01S14_A4290AlbPmPPza[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbPmPPza");
               GXutil.writeLogRaw("Old: ",Z4290AlbPmPPza);
               GXutil.writeLogRaw("Current: ",T01S14_A4290AlbPmPPza[0]);
            }
            if ( Z4920AlbRGrm2 != T01S14_A4920AlbRGrm2[0] )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbRGrm2");
               GXutil.writeLogRaw("Old: ",Z4920AlbRGrm2);
               GXutil.writeLogRaw("Current: ",T01S14_A4920AlbRGrm2[0]);
            }
            if ( Z4921AlbRAnc != T01S14_A4921AlbRAnc[0] )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbRAnc");
               GXutil.writeLogRaw("Old: ",Z4921AlbRAnc);
               GXutil.writeLogRaw("Current: ",T01S14_A4921AlbRAnc[0]);
            }
            if ( Z4922AlbPml != T01S14_A4922AlbPml[0] )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbPml");
               GXutil.writeLogRaw("Old: ",Z4922AlbPml);
               GXutil.writeLogRaw("Current: ",T01S14_A4922AlbPml[0]);
            }
            if ( DecimalUtil.compareTo(Z5743AlbRPre, T01S14_A5743AlbRPre[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbRPre");
               GXutil.writeLogRaw("Old: ",Z5743AlbRPre);
               GXutil.writeLogRaw("Current: ",T01S14_A5743AlbRPre[0]);
            }
            if ( DecimalUtil.compareTo(Z5744AlbRAju, T01S14_A5744AlbRAju[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbRAju");
               GXutil.writeLogRaw("Old: ",Z5744AlbRAju);
               GXutil.writeLogRaw("Current: ",T01S14_A5744AlbRAju[0]);
            }
            if ( Z5745AlbRRep != T01S14_A5745AlbRRep[0] )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbRRep");
               GXutil.writeLogRaw("Old: ",Z5745AlbRRep);
               GXutil.writeLogRaw("Current: ",T01S14_A5745AlbRRep[0]);
            }
            if ( GXutil.strcmp(Z6178AlbrUsu, T01S14_A6178AlbrUsu[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbrUsu");
               GXutil.writeLogRaw("Old: ",Z6178AlbrUsu);
               GXutil.writeLogRaw("Current: ",T01S14_A6178AlbrUsu[0]);
            }
            if ( GXutil.strcmp(Z6182AlbrNF, T01S14_A6182AlbrNF[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbrNF");
               GXutil.writeLogRaw("Old: ",Z6182AlbrNF);
               GXutil.writeLogRaw("Current: ",T01S14_A6182AlbrNF[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z6183AlbrFeNf), GXutil.resetTime(T01S14_A6183AlbrFeNf[0])) ) )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbrFeNf");
               GXutil.writeLogRaw("Old: ",Z6183AlbrFeNf);
               GXutil.writeLogRaw("Current: ",T01S14_A6183AlbrFeNf[0]);
            }
            if ( GXutil.strcmp(Z6184AlbrCfop, T01S14_A6184AlbrCfop[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbrCfop");
               GXutil.writeLogRaw("Old: ",Z6184AlbrCfop);
               GXutil.writeLogRaw("Current: ",T01S14_A6184AlbrCfop[0]);
            }
            if ( GXutil.strcmp(Z3359AlbRDisCli, T01S14_A3359AlbRDisCli[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbRDisCli");
               GXutil.writeLogRaw("Old: ",Z3359AlbRDisCli);
               GXutil.writeLogRaw("Current: ",T01S14_A3359AlbRDisCli[0]);
            }
            if ( GXutil.strcmp(Z3360AlbRImp, T01S14_A3360AlbRImp[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbRImp");
               GXutil.writeLogRaw("Old: ",Z3360AlbRImp);
               GXutil.writeLogRaw("Current: ",T01S14_A3360AlbRImp[0]);
            }
            if ( DecimalUtil.compareTo(Z6471AlbRUniB, T01S14_A6471AlbRUniB[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbRUniB");
               GXutil.writeLogRaw("Old: ",Z6471AlbRUniB);
               GXutil.writeLogRaw("Current: ",T01S14_A6471AlbRUniB[0]);
            }
            if ( GXutil.strcmp(Z6488AlbDocPrv, T01S14_A6488AlbDocPrv[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbDocPrv");
               GXutil.writeLogRaw("Old: ",Z6488AlbDocPrv);
               GXutil.writeLogRaw("Current: ",T01S14_A6488AlbDocPrv[0]);
            }
            if ( DecimalUtil.compareTo(Z6523AlbRUdas, T01S14_A6523AlbRUdas[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbRUdas");
               GXutil.writeLogRaw("Old: ",Z6523AlbRUdas);
               GXutil.writeLogRaw("Current: ",T01S14_A6523AlbRUdas[0]);
            }
            if ( GXutil.strcmp(Z8023AlbColor, T01S14_A8023AlbColor[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbColor");
               GXutil.writeLogRaw("Old: ",Z8023AlbColor);
               GXutil.writeLogRaw("Current: ",T01S14_A8023AlbColor[0]);
            }
            if ( GXutil.strcmp(Z8024AlbOpsT, T01S14_A8024AlbOpsT[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbOpsT");
               GXutil.writeLogRaw("Old: ",Z8024AlbOpsT);
               GXutil.writeLogRaw("Current: ",T01S14_A8024AlbOpsT[0]);
            }
            if ( GXutil.strcmp(Z8025AlbOpsC, T01S14_A8025AlbOpsC[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbOpsC");
               GXutil.writeLogRaw("Old: ",Z8025AlbOpsC);
               GXutil.writeLogRaw("Current: ",T01S14_A8025AlbOpsC[0]);
            }
            if ( GXutil.strcmp(Z8026AlbOC, T01S14_A8026AlbOC[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbOC");
               GXutil.writeLogRaw("Old: ",Z8026AlbOC);
               GXutil.writeLogRaw("Current: ",T01S14_A8026AlbOC[0]);
            }
            if ( GXutil.strcmp(Z8027AlbHdri, T01S14_A8027AlbHdri[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbHdri");
               GXutil.writeLogRaw("Old: ",Z8027AlbHdri);
               GXutil.writeLogRaw("Current: ",T01S14_A8027AlbHdri[0]);
            }
            if ( GXutil.strcmp(Z8029AlbNumM, T01S14_A8029AlbNumM[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbNumM");
               GXutil.writeLogRaw("Old: ",Z8029AlbNumM);
               GXutil.writeLogRaw("Current: ",T01S14_A8029AlbNumM[0]);
            }
            if ( DecimalUtil.compareTo(Z8030AlbAncC, T01S14_A8030AlbAncC[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbAncC");
               GXutil.writeLogRaw("Old: ",Z8030AlbAncC);
               GXutil.writeLogRaw("Current: ",T01S14_A8030AlbAncC[0]);
            }
            if ( Z8031AlbDndC != T01S14_A8031AlbDndC[0] )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbDndC");
               GXutil.writeLogRaw("Old: ",Z8031AlbDndC);
               GXutil.writeLogRaw("Current: ",T01S14_A8031AlbDndC[0]);
            }
            if ( DecimalUtil.compareTo(Z8032AlbAncCr, T01S14_A8032AlbAncCr[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbAncCr");
               GXutil.writeLogRaw("Old: ",Z8032AlbAncCr);
               GXutil.writeLogRaw("Current: ",T01S14_A8032AlbAncCr[0]);
            }
            if ( Z8033AlbDndCr != T01S14_A8033AlbDndCr[0] )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbDndCr");
               GXutil.writeLogRaw("Old: ",Z8033AlbDndCr);
               GXutil.writeLogRaw("Current: ",T01S14_A8033AlbDndCr[0]);
            }
            if ( Z8036AlbDmt != T01S14_A8036AlbDmt[0] )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbDmt");
               GXutil.writeLogRaw("Old: ",Z8036AlbDmt);
               GXutil.writeLogRaw("Current: ",T01S14_A8036AlbDmt[0]);
            }
            if ( Z8034AlbGalga != T01S14_A8034AlbGalga[0] )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbGalga");
               GXutil.writeLogRaw("Old: ",Z8034AlbGalga);
               GXutil.writeLogRaw("Current: ",T01S14_A8034AlbGalga[0]);
            }
            if ( GXutil.strcmp(Z9793AlbPdaC, T01S14_A9793AlbPdaC[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbPdaC");
               GXutil.writeLogRaw("Old: ",Z9793AlbPdaC);
               GXutil.writeLogRaw("Current: ",T01S14_A9793AlbPdaC[0]);
            }
            if ( GXutil.strcmp(Z9794AlbOStj, T01S14_A9794AlbOStj[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbOStj");
               GXutil.writeLogRaw("Old: ",Z9794AlbOStj);
               GXutil.writeLogRaw("Current: ",T01S14_A9794AlbOStj[0]);
            }
            if ( Z317AlbStLot != T01S14_A317AlbStLot[0] )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbStLot");
               GXutil.writeLogRaw("Old: ",Z317AlbStLot);
               GXutil.writeLogRaw("Current: ",T01S14_A317AlbStLot[0]);
            }
            if ( Z10358AlbTurno != T01S14_A10358AlbTurno[0] )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbTurno");
               GXutil.writeLogRaw("Old: ",Z10358AlbTurno);
               GXutil.writeLogRaw("Current: ",T01S14_A10358AlbTurno[0]);
            }
            if ( Z252CliCod != T01S14_A252CliCod[0] )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T01S14_A252CliCod[0]);
            }
            if ( Z6263AlbRTartC != T01S14_A6263AlbRTartC[0] )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbRTartC");
               GXutil.writeLogRaw("Old: ",Z6263AlbRTartC);
               GXutil.writeLogRaw("Current: ",T01S14_A6263AlbRTartC[0]);
            }
            if ( Z840TrnCod != T01S14_A840TrnCod[0] )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"TrnCod");
               GXutil.writeLogRaw("Old: ",Z840TrnCod);
               GXutil.writeLogRaw("Current: ",T01S14_A840TrnCod[0]);
            }
            if ( Z970ProceCod != T01S14_A970ProceCod[0] )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"ProceCod");
               GXutil.writeLogRaw("Old: ",Z970ProceCod);
               GXutil.writeLogRaw("Current: ",T01S14_A970ProceCod[0]);
            }
            if ( Z1211TipEntCod != T01S14_A1211TipEntCod[0] )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"TipEntCod");
               GXutil.writeLogRaw("Old: ",Z1211TipEntCod);
               GXutil.writeLogRaw("Current: ",T01S14_A1211TipEntCod[0]);
            }
            if ( Z4792AlmCod != T01S14_A4792AlmCod[0] )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlmCod");
               GXutil.writeLogRaw("Old: ",Z4792AlmCod);
               GXutil.writeLogRaw("Current: ",T01S14_A4792AlmCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBREC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1S17( )
   {
      beforeValidate1S17( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1S17( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1S17( 0) ;
         checkOptimisticConcurrency1S17( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1S17( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1S17( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01S126 */
                  pr_default.execute(24, new Object[] {Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A45AlbRef, A58AlbRUniEnt, A46AlbREnt, A5806AlbREnt2, A56AlbRUni, Byte.valueOf(A47AlbREst), A12879AlbOEKOTEX, A3613AlbRefDsc, A49AlbRFen, A6179AlbrHor, A4601AlbRTam, A9749Emp_Item1, A1291AlbRDes, A6463AlbRLote, A14525AlbRLot2, A6464AlbRTelar, A6465AlbRLu, A6470AlbRTara, A4602AlbRMdlCod, A8035AlbMaqTej, A8028AlbNumB, A60AlbRUniUti, Integer.valueOf(A52AlbRPieEnt), Integer.valueOf(A54AlbRPieUti), A6180AlbrUniC, Integer.valueOf(A6181AlbrPieC), A50AlbRLoc, A55AlbRReo, Integer.valueOf(A53AlbRPieReb), A59AlbRUniReb, A48AlbRFecUlt, Short.valueOf(A1222AlbNumEti), Byte.valueOf(A1301AlbRUlin), A4290AlbPmPPza, Short.valueOf(A4920AlbRGrm2), Short.valueOf(A4921AlbRAnc), Short.valueOf(A4922AlbPml), A5743AlbRPre, A5744AlbRAju, Byte.valueOf(A5745AlbRRep), A6178AlbrUsu, A6182AlbrNF, A6183AlbrFeNf, A6184AlbrCfop, A3359AlbRDisCli, A3360AlbRImp, A6471AlbRUniB, A6488AlbDocPrv, A6523AlbRUdas, A8023AlbColor, A8024AlbOpsT, A8025AlbOpsC, A8026AlbOC, A8027AlbHdri, A8029AlbNumM, A8030AlbAncC, Short.valueOf(A8031AlbDndC), A8032AlbAncCr, Short.valueOf(A8033AlbDndCr), Short.valueOf(A8036AlbDmt), Short.valueOf(A8034AlbGalga), A9793AlbPdaC, A9794AlbOStj, Byte.valueOf(A317AlbStLot), Byte.valueOf(A10358AlbTurno), A396EmprCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n6263AlbRTartC), Short.valueOf(A6263AlbRTartC), Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod), Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod), Boolean.valueOf(n4792AlmCod), Byte.valueOf(A4792AlmCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
                  if ( (pr_default.getStatus(24) == 1) )
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
                        processLevel1S17( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1S10( ) ;
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
            load1S17( ) ;
         }
         endLevel1S17( ) ;
      }
      closeExtendedTableCursors1S17( ) ;
   }

   public void update1S17( )
   {
      beforeValidate1S17( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1S17( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1S17( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1S17( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1S17( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01S127 */
                  pr_default.execute(25, new Object[] {A45AlbRef, A58AlbRUniEnt, A46AlbREnt, A5806AlbREnt2, A56AlbRUni, Byte.valueOf(A47AlbREst), A12879AlbOEKOTEX, A3613AlbRefDsc, A49AlbRFen, A6179AlbrHor, A4601AlbRTam, A9749Emp_Item1, A1291AlbRDes, A6463AlbRLote, A14525AlbRLot2, A6464AlbRTelar, A6465AlbRLu, A6470AlbRTara, A4602AlbRMdlCod, A8035AlbMaqTej, A8028AlbNumB, A60AlbRUniUti, Integer.valueOf(A52AlbRPieEnt), Integer.valueOf(A54AlbRPieUti), A6180AlbrUniC, Integer.valueOf(A6181AlbrPieC), A50AlbRLoc, A55AlbRReo, Integer.valueOf(A53AlbRPieReb), A59AlbRUniReb, A48AlbRFecUlt, Short.valueOf(A1222AlbNumEti), Byte.valueOf(A1301AlbRUlin), A4290AlbPmPPza, Short.valueOf(A4920AlbRGrm2), Short.valueOf(A4921AlbRAnc), Short.valueOf(A4922AlbPml), A5743AlbRPre, A5744AlbRAju, Byte.valueOf(A5745AlbRRep), A6178AlbrUsu, A6182AlbrNF, A6183AlbrFeNf, A6184AlbrCfop, A3359AlbRDisCli, A3360AlbRImp, A6471AlbRUniB, A6488AlbDocPrv, A6523AlbRUdas, A8023AlbColor, A8024AlbOpsT, A8025AlbOpsC, A8026AlbOC, A8027AlbHdri, A8029AlbNumM, A8030AlbAncC, Short.valueOf(A8031AlbDndC), A8032AlbAncCr, Short.valueOf(A8033AlbDndCr), Short.valueOf(A8036AlbDmt), Short.valueOf(A8034AlbGalga), A9793AlbPdaC, A9794AlbOStj, Byte.valueOf(A317AlbStLot), Byte.valueOf(A10358AlbTurno), Integer.valueOf(A252CliCod), Boolean.valueOf(n6263AlbRTartC), Short.valueOf(A6263AlbRTartC), Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod), Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod), Boolean.valueOf(n4792AlmCod), Byte.valueOf(A4792AlmCod), A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
                  if ( (pr_default.getStatus(25) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBREC"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1S17( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char4[0] = A396EmprCod ;
                     GXv_int11[0] = A44AlbRecCod ;
                     new app.txpalbrecupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_int11) ;
                     almacentejido_impl.this.A396EmprCod = GXv_char4[0] ;
                     almacentejido_impl.this.A44AlbRecCod = GXv_int11[0] ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1S17( ) ;
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
         endLevel1S17( ) ;
      }
      closeExtendedTableCursors1S17( ) ;
   }

   public void deferredUpdate1S17( )
   {
   }

   public void delete( )
   {
      beforeValidate1S17( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1S17( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1S17( ) ;
         afterConfirm1S17( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1S17( ) ;
            if ( AnyError == 0 )
            {
               A1301AlbRUlin = O1301AlbRUlin ;
               httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
               scanStart1S1191( ) ;
               while ( RcdFound191 != 0 )
               {
                  getByPrimaryKey1S1191( ) ;
                  delete1S1191( ) ;
                  scanNext1S1191( ) ;
                  O1301AlbRUlin = A1301AlbRUlin ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
               }
               scanEnd1S1191( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01S128 */
                  pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
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
      sMode7 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1S17( ) ;
      Gx_mode = sMode7 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1S17( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  && ( ! (0==A44AlbRecCod) ) && true /* Level */ )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "N Recepcion Inexistente", ""), 1, "ALBRECCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRecCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         if ( isDsp( )  )
         {
            GXv_char4[0] = A3613AlbRefDsc ;
            GXv_int13[0] = A6263AlbRTartC ;
            GXv_char3[0] = A6264AlbRTartD ;
            GXv_int12[0] = AV91ExisteReferencia ;
            new app.almacensindetalle.datosreferencia(remoteHandle, context).execute( A396EmprCod, A252CliCod, A45AlbRef, GXv_char4, GXv_int13, GXv_char3, GXv_int12) ;
            almacentejido_impl.this.A3613AlbRefDsc = GXv_char4[0] ;
            almacentejido_impl.this.A6263AlbRTartC = GXv_int13[0] ;
            almacentejido_impl.this.A6264AlbRTartD = GXv_char3[0] ;
            almacentejido_impl.this.AV91ExisteReferencia = GXv_int12[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
            httpContext.ajax_rsp_assign_attri("", false, "A6263AlbRTartC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6263AlbRTartC), 4, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A6264AlbRTartD", A6264AlbRTartD);
            httpContext.ajax_rsp_assign_attri("", false, "AV91ExisteReferencia", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV91ExisteReferencia), 4, 0));
         }
         /* Using cursor T01S129 */
         pr_default.execute(27, new Object[] {A396EmprCod});
         A407EmprNom = T01S129_A407EmprNom[0] ;
         n407EmprNom = T01S129_n407EmprNom[0] ;
         pr_default.close(27);
         /* Using cursor T01S130 */
         pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01S130_A279CliNom[0] ;
         A8723CliEst = T01S130_A8723CliEst[0] ;
         pr_default.close(28);
         /* Using cursor T01S131 */
         pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A45AlbRef});
         if ( (pr_default.getStatus(29) != 101) )
         {
            A13982AlbRArtLu = T01S131_A13982AlbRArtLu[0] ;
            n13982AlbRArtLu = T01S131_n13982AlbRArtLu[0] ;
         }
         else
         {
            A13982AlbRArtLu = DecimalUtil.doubleToDec(0) ;
            n13982AlbRArtLu = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13982AlbRArtLu", GXutil.ltrimstr( A13982AlbRArtLu, 6, 2));
         }
         pr_default.close(29);
         GXt_char1 = A13981Composicio ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int11[0] = A252CliCod ;
         GXv_char3[0] = A45AlbRef ;
         GXv_char2[0] = GXt_char1 ;
         new app.almacensindetalle.composicion(remoteHandle, context).execute( GXv_char4, GXv_int11, GXv_char3, GXv_char2) ;
         almacentejido_impl.this.A396EmprCod = GXv_char4[0] ;
         almacentejido_impl.this.A252CliCod = GXv_int11[0] ;
         almacentejido_impl.this.A45AlbRef = GXv_char3[0] ;
         almacentejido_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         A13981Composicio = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A13981Composicio", A13981Composicio);
         /* Using cursor T01S132 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n6263AlbRTartC), Short.valueOf(A6263AlbRTartC)});
         A6264AlbRTartD = T01S132_A6264AlbRTartD[0] ;
         n6264AlbRTartD = T01S132_n6264AlbRTartD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6264AlbRTartD", A6264AlbRTartD);
         pr_default.close(30);
         /* Using cursor T01S133 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         A841TrnNom = T01S133_A841TrnNom[0] ;
         n841TrnNom = T01S133_n841TrnNom[0] ;
         pr_default.close(31);
         /* Using cursor T01S134 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
         A971ProceNom = T01S134_A971ProceNom[0] ;
         n971ProceNom = T01S134_n971ProceNom[0] ;
         pr_default.close(32);
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
         /* Using cursor T01S135 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod)});
         A1212TipEntNom = T01S135_A1212TipEntNom[0] ;
         n1212TipEntNom = T01S135_n1212TipEntNom[0] ;
         pr_default.close(33);
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV81Insert_CliCod) )
         {
            edtCliCod_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
         }
         else
         {
            if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
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
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV85Insert_TipEntCod) )
         {
            edtTipEntCod_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtTipEntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipEntCod_Enabled), 5, 0), true);
         }
         else
         {
            if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
            {
               edtTipEntCod_Enabled = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtTipEntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipEntCod_Enabled), 5, 0), true);
            }
            else
            {
               edtTipEntCod_Enabled = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtTipEntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipEntCod_Enabled), 5, 0), true);
            }
         }
         if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
         {
            edtAlbRLoc_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLoc_Enabled), 5, 0), true);
         }
         else
         {
            edtAlbRLoc_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLoc_Enabled), 5, 0), true);
         }
         if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
         {
            edtAlbRef_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Enabled), 5, 0), true);
         }
         else
         {
            edtAlbRef_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Enabled), 5, 0), true);
         }
         if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
         {
            edtAlbRFen_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRFen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFen_Enabled), 5, 0), true);
         }
         else
         {
            edtAlbRFen_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRFen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFen_Enabled), 5, 0), true);
         }
         if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
         {
            cmbAlbRUni.setEnabled( 0 );
            httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRUni.getEnabled(), 5, 0), true);
         }
         else
         {
            cmbAlbRUni.setEnabled( 1 );
            httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRUni.getEnabled(), 5, 0), true);
         }
         if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
         {
            cmbAlbRReo.setEnabled( 0 );
            httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRReo.getEnabled(), 5, 0), true);
         }
         else
         {
            cmbAlbRReo.setEnabled( 1 );
            httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRReo.getEnabled(), 5, 0), true);
         }
         if ( A4290AlbPmPPza.doubleValue() > 0 )
         {
            A4291AlbPzaEst = (int)(DecimalUtil.decToDouble(GXutil.roundDecimal( A58AlbRUniEnt.divide(A4290AlbPmPPza, 18, java.math.RoundingMode.DOWN), 0))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4291AlbPzaEst", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4291AlbPzaEst), 8, 0));
         }
         else
         {
            A4291AlbPzaEst = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A4291AlbPzaEst", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4291AlbPzaEst), 8, 0));
         }
         /* Using cursor T01S136 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n4792AlmCod), Byte.valueOf(A4792AlmCod)});
         A4793AlmNom = T01S136_A4793AlmNom[0] ;
         n4793AlmNom = T01S136_n4793AlmNom[0] ;
         pr_default.close(34);
         if ( A47AlbREst == 1 )
         {
            AV72AlbCum = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72AlbCum", AV72AlbCum);
         }
         else
         {
            if ( A47AlbREst == 0 )
            {
               AV72AlbCum = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV72AlbCum", AV72AlbCum);
            }
         }
         divTableintegracion_pontway_Visible = (((GXutil.strcmp(A8024AlbOpsT, httpContext.getMessage( "IMPORTED", ""))==0)) ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop("", false, divTableintegracion_pontway_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTableintegracion_pontway_Visible), 5, 0), true);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01S137 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Entradas Almacen Crudo", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T01S138 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T01S139 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "UBIIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T01S140 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REPPZS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T01S141 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REPTAL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T01S142 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REPMAT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T01S143 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBREPg", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T01S144 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVEM1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T01S145 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBRDF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T01S146 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBDET", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T01S147 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISEMP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T01S148 */
         pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISALB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T01S149 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVGEN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T01S150 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARPIE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
      }
   }

   public void processNestedLevel1S1191( )
   {
      s1301AlbRUlin = O1301AlbRUlin ;
      httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
      nGXsfl_347_idx = 0 ;
      while ( nGXsfl_347_idx < nRC_GXsfl_347 )
      {
         readRow1S1191( ) ;
         if ( ( nRcdExists_191 != 0 ) || ( nIsMod_191 != 0 ) )
         {
            standaloneNotModal1S1191( ) ;
            getKey1S1191( ) ;
            if ( ( nRcdExists_191 == 0 ) && ( nRcdDeleted_191 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1S1191( ) ;
            }
            else
            {
               if ( RcdFound191 != 0 )
               {
                  if ( ( nRcdDeleted_191 != 0 ) && ( nRcdExists_191 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1S1191( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_191 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1S1191( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_191 == 0 )
                  {
                     GXCCtl = "ALBRLIN_" + sGXsfl_347_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbRLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O1301AlbRUlin = A1301AlbRUlin ;
            httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
         }
         httpContext.changePostValue( edtAlbRLin_Internalname, GXutil.ltrim( localUtil.ntoc( A1299AlbRLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRObs_Internalname, GXutil.rtrim( A1300AlbRObs)) ;
         httpContext.changePostValue( "ZT_"+"Z1299AlbRLin_"+sGXsfl_347_idx, GXutil.ltrim( localUtil.ntoc( Z1299AlbRLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1300AlbRObs_"+sGXsfl_347_idx, GXutil.rtrim( Z1300AlbRObs)) ;
         httpContext.changePostValue( "nRcdDeleted_191_"+sGXsfl_347_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_191, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_191_"+sGXsfl_347_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_191, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_191_"+sGXsfl_347_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_191, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_191 != 0 )
         {
            httpContext.changePostValue( "ALBRLIN_"+sGXsfl_347_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBROBS_"+sGXsfl_347_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1S1191( ) ;
      if ( AnyError != 0 )
      {
         O1301AlbRUlin = s1301AlbRUlin ;
         httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
      }
      nRcdExists_191 = (short)(0) ;
      nIsMod_191 = (short)(0) ;
      nRcdDeleted_191 = (short)(0) ;
   }

   public void processLevel1S17( )
   {
      /* Save parent mode. */
      sMode7 = Gx_mode ;
      processNestedLevel1S1191( ) ;
      if ( AnyError != 0 )
      {
         O1301AlbRUlin = s1301AlbRUlin ;
         httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode7 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01S151 */
      pr_default.execute(49, new Object[] {Byte.valueOf(A1301AlbRUlin), A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
   }

   public void endLevel1S17( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeComplete1S17( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "almacensindetalle.almacentejido");
         if ( AnyError == 0 )
         {
            confirmValues1S10( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "almacensindetalle.almacentejido");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1S17( )
   {
      /* Scan By routine */
      /* Using cursor T01S152 */
      pr_default.execute(50);
      RcdFound7 = (short)(0) ;
      if ( (pr_default.getStatus(50) != 101) )
      {
         RcdFound7 = (short)(1) ;
         A396EmprCod = T01S152_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = T01S152_A44AlbRecCod[0] ;
         n44AlbRecCod = T01S152_n44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1S17( )
   {
      /* Scan next routine */
      pr_default.readNext(50);
      RcdFound7 = (short)(0) ;
      if ( (pr_default.getStatus(50) != 101) )
      {
         RcdFound7 = (short)(1) ;
         A396EmprCod = T01S152_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = T01S152_A44AlbRecCod[0] ;
         n44AlbRecCod = T01S152_n44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
   }

   public void scanEnd1S17( )
   {
      pr_default.close(50);
   }

   public void afterConfirm1S17( )
   {
      /* After Confirm Rules */
      if ( ( AV25Moda21 == 1 ) && ( AV26Cli350 == 1 ) && ( AV27ContVal == 1 ) && true /* After */ && ( A252CliCod == 350 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente INEXISTENTE ¡¡¡", ""), 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( ( AV25Moda21 == 1 ) && ( A1211TipEntCod == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Tipo entrada sin valor", ""), 1, "TIPENTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipEntCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( (GXutil.strcmp("", A45AlbRef)==0) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Referencia NO valida", ""), 1, "ALBREF");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRef_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( true /* After */ && ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A58AlbRUniEnt)==0) || (0==A52AlbRPieEnt) ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Tiene que entrar Unidades o Piezas", ""), 1, "ALBRPIEENT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRPieEnt_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( ( AV25Moda21 == 1 ) && true /* After */ && ( GXutil.strcmp(A8723CliEst, httpContext.getMessage( "S", "")) == 0 ) && ( ( GXutil.strcmp(A6463AlbRLote, " ") == 0 ) || ( GXutil.strcmp(A4602AlbRMdlCod, " ") == 0 ) || ( GXutil.strcmp(A6464AlbRTelar, " ") == 0 ) || ( A6465AlbRLu.doubleValue() == 0 ) || ( GXutil.strcmp(A8035AlbMaqTej, " ") == 0 ) || ( A6470AlbRTara.doubleValue() == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Obrigatorio campos: Lote,Jogo,Fio,Polegadas,Maq,LFA ¡¡¡", ""), 1, "ALBRLOTE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRLote_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( isIns( )  && (0==A44AlbRecCod) && true /* Level */ && true /* After */ )
      {
         GXv_int11[0] = A44AlbRecCod ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, "020100", GXv_int11) ;
         almacentejido_impl.this.A44AlbRecCod = GXv_int11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
   }

   public void beforeInsert1S17( )
   {
      /* Before Insert Rules */
      if ( (0==A1211TipEntCod) )
      {
         A1211TipEntCod = (short)(0) ;
         n1211TipEntCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
         n1211TipEntCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
      }
      if ( (0==A970ProceCod) )
      {
         A970ProceCod = (short)(0) ;
         n970ProceCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         n970ProceCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
      }
      if ( (0==A840TrnCod) )
      {
         A840TrnCod = (short)(0) ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      }
      if ( (0==A6263AlbRTartC) )
      {
         A6263AlbRTartC = (short)(0) ;
         n6263AlbRTartC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6263AlbRTartC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6263AlbRTartC), 4, 0));
         n6263AlbRTartC = true ;
         httpContext.ajax_rsp_assign_attri("", false, "A6263AlbRTartC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6263AlbRTartC), 4, 0));
      }
   }

   public void beforeUpdate1S17( )
   {
      /* Before Update Rules */
      if ( (0==A1211TipEntCod) )
      {
         A1211TipEntCod = (short)(0) ;
         n1211TipEntCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
         n1211TipEntCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
      }
      if ( (0==A970ProceCod) )
      {
         A970ProceCod = (short)(0) ;
         n970ProceCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         n970ProceCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
      }
      if ( (0==A840TrnCod) )
      {
         A840TrnCod = (short)(0) ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      }
      if ( (0==A6263AlbRTartC) )
      {
         A6263AlbRTartC = (short)(0) ;
         n6263AlbRTartC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6263AlbRTartC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6263AlbRTartC), 4, 0));
         n6263AlbRTartC = true ;
         httpContext.ajax_rsp_assign_attri("", false, "A6263AlbRTartC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6263AlbRTartC), 4, 0));
      }
   }

   public void beforeDelete1S17( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1S17( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1S17( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1S17( )
   {
      edtAlbRecCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      edtavUsurcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUsurcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavUsurcod_Enabled), 5, 0), true);
      edtAlbRFen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRFen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFen_Enabled), 5, 0), true);
      edtAlbrHor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbrHor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbrHor_Enabled), 5, 0), true);
      edtAlbrUsu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbrUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbrUsu_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtAlbRef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Enabled), 5, 0), true);
      edtAlbRefDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRefDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRefDsc_Enabled), 5, 0), true);
      edtAlbRTartC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRTartC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRTartC_Enabled), 5, 0), true);
      edtAlbRTartD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRTartD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRTartD_Enabled), 5, 0), true);
      edtComposicio_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtComposicio_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtComposicio_Enabled), 5, 0), true);
      edtAlbREnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt_Enabled), 5, 0), true);
      edtAlbREnt2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt2_Enabled), 5, 0), true);
      edtAlbRDisCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRDisCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRDisCli_Enabled), 5, 0), true);
      edtAlbNumB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbNumB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbNumB_Enabled), 5, 0), true);
      edtAlbTurno_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbTurno_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTurno_Enabled), 5, 0), true);
      edtTrnCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      edtProceCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProceCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceCod_Enabled), 5, 0), true);
      edtAlbRLot2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRLot2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLot2_Enabled), 5, 0), true);
      edtAlbRLote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLote_Enabled), 5, 0), true);
      edtAlbRMdlCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRMdlCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRMdlCod_Enabled), 5, 0), true);
      edtAlbRLu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRLu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLu_Enabled), 5, 0), true);
      edtAlbRTelar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRTelar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRTelar_Enabled), 5, 0), true);
      edtAlbMaqTej_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbMaqTej_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbMaqTej_Enabled), 5, 0), true);
      cmbAlbRTam.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRTam.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRTam.getEnabled(), 5, 0), true);
      edtAlbRTara_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRTara_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRTara_Enabled), 5, 0), true);
      edtTipEntCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipEntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipEntCod_Enabled), 5, 0), true);
      edtAlbRDes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRDes_Enabled), 5, 0), true);
      edtAlbRPieEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Enabled), 5, 0), true);
      edtAlbPmPPza_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPmPPza_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPmPPza_Enabled), 5, 0), true);
      edtAlbrPieC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbrPieC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbrPieC_Enabled), 5, 0), true);
      edtAlbRUniEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Enabled), 5, 0), true);
      cmbAlbRUni.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRUni.getEnabled(), 5, 0), true);
      edtAlbrUniC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbrUniC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbrUniC_Enabled), 5, 0), true);
      edtAlbRPieUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), true);
      edtAlbRPieDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieDis_Enabled), 5, 0), true);
      edtAlbRUniUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), true);
      edtAlbRUniDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniDis_Enabled), 5, 0), true);
      edtAlbRFecUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRFecUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFecUlt_Enabled), 5, 0), true);
      cmbAlbREst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbREst.getEnabled(), 5, 0), true);
      edtAlmCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlmCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlmCod_Enabled), 5, 0), true);
      edtAlbRLoc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLoc_Enabled), 5, 0), true);
      cmbAlbRReo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRReo.getEnabled(), 5, 0), true);
      edtAlbRGrm2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRGrm2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRGrm2_Enabled), 5, 0), true);
      edtAlbRAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRAnc_Enabled), 5, 0), true);
      edtAlbPml_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPml_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPml_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavComboclicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboclicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboclicod_Enabled), 5, 0), true);
      edtavComboalbref_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboalbref_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboalbref_Enabled), 5, 0), true);
      edtavCombotrncod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombotrncod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombotrncod_Enabled), 5, 0), true);
      edtavComboprocecod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboprocecod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboprocecod_Enabled), 5, 0), true);
      edtavCombotipentcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombotipentcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombotipentcod_Enabled), 5, 0), true);
      edtavComboalmcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboalmcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboalmcod_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
   }

   public void zm1S1191( int GX_JID )
   {
      if ( ( GX_JID == 114 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1300AlbRObs = T01S13_A1300AlbRObs[0] ;
         }
         else
         {
            Z1300AlbRObs = A1300AlbRObs ;
         }
      }
      if ( GX_JID == -114 )
      {
         Z44AlbRecCod = A44AlbRecCod ;
         Z1299AlbRLin = A1299AlbRLin ;
         Z1300AlbRObs = A1300AlbRObs ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1S1191( )
   {
   }

   public void standaloneModal1S1191( )
   {
      if ( isIns( )  )
      {
         A1301AlbRUlin = (byte)(O1301AlbRUlin+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A1299AlbRLin = A1301AlbRUlin ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAlbRLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLin_Enabled), 5, 0), !bGXsfl_347_Refreshing);
      }
      else
      {
         edtAlbRLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLin_Enabled), 5, 0), !bGXsfl_347_Refreshing);
      }
   }

   public void load1S1191( )
   {
      /* Using cursor T01S153 */
      pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Byte.valueOf(A1299AlbRLin)});
      if ( (pr_default.getStatus(51) != 101) )
      {
         RcdFound191 = (short)(1) ;
         A1300AlbRObs = T01S153_A1300AlbRObs[0] ;
         zm1S1191( -114) ;
      }
      pr_default.close(51);
      onLoadActions1S1191( ) ;
   }

   public void onLoadActions1S1191( )
   {
   }

   public void checkExtendedTable1S1191( )
   {
      nIsDirty_191 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1S1191( ) ;
   }

   public void closeExtendedTableCursors1S1191( )
   {
   }

   public void enableDisable1S1191( )
   {
   }

   public void getKey1S1191( )
   {
      /* Using cursor T01S154 */
      pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Byte.valueOf(A1299AlbRLin)});
      if ( (pr_default.getStatus(52) != 101) )
      {
         RcdFound191 = (short)(1) ;
      }
      else
      {
         RcdFound191 = (short)(0) ;
      }
      pr_default.close(52);
   }

   public void getByPrimaryKey1S1191( )
   {
      /* Using cursor T01S13 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Byte.valueOf(A1299AlbRLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1S1191( 114) ;
         RcdFound191 = (short)(1) ;
         initializeNonKey1S1191( ) ;
         A1299AlbRLin = T01S13_A1299AlbRLin[0] ;
         A1300AlbRObs = T01S13_A1300AlbRObs[0] ;
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z1299AlbRLin = A1299AlbRLin ;
         sMode191 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1S1191( ) ;
         Gx_mode = sMode191 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound191 = (short)(0) ;
         initializeNonKey1S1191( ) ;
         sMode191 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1S1191( ) ;
         Gx_mode = sMode191 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1S1191( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1S1191( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01S12 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Byte.valueOf(A1299AlbRLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBROB"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z1300AlbRObs, T01S12_A1300AlbRObs[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z1300AlbRObs, T01S12_A1300AlbRObs[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejido:[seudo value changed for attri]"+"AlbRObs");
               GXutil.writeLogRaw("Old: ",Z1300AlbRObs);
               GXutil.writeLogRaw("Current: ",T01S12_A1300AlbRObs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBROB"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1S1191( )
   {
      beforeValidate1S1191( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1S1191( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1S1191( 0) ;
         checkOptimisticConcurrency1S1191( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1S1191( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1S1191( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01S155 */
                  pr_default.execute(53, new Object[] {Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Byte.valueOf(A1299AlbRLin), A1300AlbRObs, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBROB");
                  if ( (pr_default.getStatus(53) == 1) )
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
            load1S1191( ) ;
         }
         endLevel1S1191( ) ;
      }
      closeExtendedTableCursors1S1191( ) ;
   }

   public void update1S1191( )
   {
      beforeValidate1S1191( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1S1191( ) ;
      }
      if ( ( nIsMod_191 != 0 ) || ( nIsDirty_191 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1S1191( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1S1191( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1S1191( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01S156 */
                     pr_default.execute(54, new Object[] {A1300AlbRObs, A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Byte.valueOf(A1299AlbRLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBROB");
                     if ( (pr_default.getStatus(54) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBROB"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1S1191( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int11[0] = A44AlbRecCod ;
                        new app.txpalbrecupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_int11) ;
                        almacentejido_impl.this.A396EmprCod = GXv_char4[0] ;
                        almacentejido_impl.this.A44AlbRecCod = GXv_int11[0] ;
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1S1191( ) ;
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
            endLevel1S1191( ) ;
         }
      }
      closeExtendedTableCursors1S1191( ) ;
   }

   public void deferredUpdate1S1191( )
   {
   }

   public void delete1S1191( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1S1191( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1S1191( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1S1191( ) ;
         afterConfirm1S1191( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1S1191( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01S157 */
               pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Byte.valueOf(A1299AlbRLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBROB");
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
      sMode191 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1S1191( ) ;
      Gx_mode = sMode191 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1S1191( )
   {
      standaloneModal1S1191( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1S1191( )
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

   public void scanStart1S1191( )
   {
      /* Scan By routine */
      /* Using cursor T01S158 */
      pr_default.execute(56, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      RcdFound191 = (short)(0) ;
      if ( (pr_default.getStatus(56) != 101) )
      {
         RcdFound191 = (short)(1) ;
         A1299AlbRLin = T01S158_A1299AlbRLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1S1191( )
   {
      /* Scan next routine */
      pr_default.readNext(56);
      RcdFound191 = (short)(0) ;
      if ( (pr_default.getStatus(56) != 101) )
      {
         RcdFound191 = (short)(1) ;
         A1299AlbRLin = T01S158_A1299AlbRLin[0] ;
      }
   }

   public void scanEnd1S1191( )
   {
      pr_default.close(56);
   }

   public void afterConfirm1S1191( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1S1191( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1S1191( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1S1191( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1S1191( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1S1191( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1S1191( )
   {
      edtAlbRLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLin_Enabled), 5, 0), !bGXsfl_347_Refreshing);
      edtAlbRObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRObs_Enabled), 5, 0), !bGXsfl_347_Refreshing);
   }

   public void send_integrity_lvl_hashes1S1191( )
   {
   }

   public void send_integrity_lvl_hashes1S17( )
   {
   }

   public void subsflControlProps_347191( )
   {
      edtAlbRLin_Internalname = "ALBRLIN_"+sGXsfl_347_idx ;
      edtAlbRObs_Internalname = "ALBROBS_"+sGXsfl_347_idx ;
   }

   public void subsflControlProps_fel_347191( )
   {
      edtAlbRLin_Internalname = "ALBRLIN_"+sGXsfl_347_fel_idx ;
      edtAlbRObs_Internalname = "ALBROBS_"+sGXsfl_347_fel_idx ;
   }

   public void addRow1S1191( )
   {
      nGXsfl_347_idx = (int)(nGXsfl_347_idx+1) ;
      sGXsfl_347_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_347_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_347191( ) ;
      sendRow1S1191( ) ;
   }

   public void sendRow1S1191( )
   {
      Gridlevel_observacionRow = GXWebRow.GetNew(context) ;
      if ( subGridlevel_observacion_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_observacion_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_observacion_Class, "") != 0 )
         {
            subGridlevel_observacion_Linesclass = subGridlevel_observacion_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_observacion_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_observacion_Backstyle = (byte)(0) ;
         subGridlevel_observacion_Backcolor = subGridlevel_observacion_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_observacion_Class, "") != 0 )
         {
            subGridlevel_observacion_Linesclass = subGridlevel_observacion_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_observacion_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_observacion_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_observacion_Class, "") != 0 )
         {
            subGridlevel_observacion_Linesclass = subGridlevel_observacion_Class+"Odd" ;
         }
         subGridlevel_observacion_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_observacion_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_observacion_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_347_idx) % (2))) == 0 )
         {
            subGridlevel_observacion_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_observacion_Class, "") != 0 )
            {
               subGridlevel_observacion_Linesclass = subGridlevel_observacion_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_observacion_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_observacion_Class, "") != 0 )
            {
               subGridlevel_observacion_Linesclass = subGridlevel_observacion_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_191_" + sGXsfl_347_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 348,'',false,'" + sGXsfl_347_idx + "',347)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_observacionRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRLin_Internalname,GXutil.ltrim( localUtil.ntoc( A1299AlbRLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1299AlbRLin), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,348);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn WWActionColumn WWActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbRLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(347),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_191_" + sGXsfl_347_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 349,'',false,'" + sGXsfl_347_idx + "',347)\"" ;
      ROClassString = "AttributeWidth100Porc" ;
      Gridlevel_observacionRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRObs_Internalname,GXutil.rtrim( A1300AlbRObs),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,349);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRObs_Jsonclick,Integer.valueOf(0),"AttributeWidth100Porc","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbRObs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(347),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_observacionRow);
      send_integrity_lvl_hashes1S1191( ) ;
      GXCCtl = "Z1299AlbRLin_" + sGXsfl_347_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1299AlbRLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1300AlbRObs_" + sGXsfl_347_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z1300AlbRObs));
      GXCCtl = "nRcdDeleted_191_" + sGXsfl_347_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_191, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_191_" + sGXsfl_347_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_191, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_191_" + sGXsfl_347_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_191, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_347_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_347_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV79TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV79TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_347_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV8EmprCod));
      GXCCtl = "vALBRECCOD_" + sGXsfl_347_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV77AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRLIN_"+sGXsfl_347_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBROBS_"+sGXsfl_347_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_observacionContainer.AddRow(Gridlevel_observacionRow);
   }

   public void readRow1S1191( )
   {
      nGXsfl_347_idx = (int)(nGXsfl_347_idx+1) ;
      sGXsfl_347_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_347_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_347191( ) ;
      edtAlbRLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRLIN_"+sGXsfl_347_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBROBS_"+sGXsfl_347_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "ALBRLIN_" + sGXsfl_347_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRLin_Internalname ;
         wbErr = true ;
         A1299AlbRLin = (byte)(0) ;
      }
      else
      {
         A1299AlbRLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbRLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A1300AlbRObs = httpContext.cgiGet( edtAlbRObs_Internalname) ;
      GXCCtl = "Z1299AlbRLin_" + sGXsfl_347_idx ;
      Z1299AlbRLin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1300AlbRObs_" + sGXsfl_347_idx ;
      Z1300AlbRObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_191_" + sGXsfl_347_idx ;
      nRcdDeleted_191 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_191_" + sGXsfl_347_idx ;
      nRcdExists_191 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_191_" + sGXsfl_347_idx ;
      nIsMod_191 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtAlbRLin_Enabled = edtAlbRLin_Enabled ;
   }

   public void confirmValues1S10( )
   {
      nGXsfl_347_idx = 0 ;
      sGXsfl_347_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_347_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_347191( ) ;
      while ( nGXsfl_347_idx < nRC_GXsfl_347 )
      {
         nGXsfl_347_idx = (int)(nGXsfl_347_idx+1) ;
         sGXsfl_347_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_347_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_347191( ) ;
         httpContext.changePostValue( "Z1299AlbRLin_"+sGXsfl_347_idx, httpContext.cgiGet( "ZT_"+"Z1299AlbRLin_"+sGXsfl_347_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1299AlbRLin_"+sGXsfl_347_idx) ;
         httpContext.changePostValue( "Z1300AlbRObs_"+sGXsfl_347_idx, httpContext.cgiGet( "ZT_"+"Z1300AlbRObs_"+sGXsfl_347_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1300AlbRObs_"+sGXsfl_347_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.almacensindetalle.almacentejido", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV8EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV77AlbRecCod,8,0))}, new String[] {"Gx_mode","EmprCod","AlbRecCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"AlmacenTejido");
      forbiddenHiddens.add("AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV110Pgmname, "")));
      forbiddenHiddens.add("Emp_Item1", GXutil.rtrim( localUtil.format( A9749Emp_Item1, "")));
      forbiddenHiddens.add("AlbRPieReb", localUtil.format( DecimalUtil.doubleToDec(A53AlbRPieReb), "ZZZ9"));
      forbiddenHiddens.add("AlbRUniReb", localUtil.format( A59AlbRUniReb, "ZZZZZ9.99"));
      forbiddenHiddens.add("AlbNumEti", localUtil.format( DecimalUtil.doubleToDec(A1222AlbNumEti), "ZZZ9"));
      forbiddenHiddens.add("AlbRPre", localUtil.format( A5743AlbRPre, "ZZZZZ9.99"));
      forbiddenHiddens.add("AlbRAju", localUtil.format( A5744AlbRAju, "ZZZZ9.99"));
      forbiddenHiddens.add("AlbRRep", localUtil.format( DecimalUtil.doubleToDec(A5745AlbRRep), "9"));
      forbiddenHiddens.add("AlbrUsu", GXutil.rtrim( localUtil.format( A6178AlbrUsu, "")));
      forbiddenHiddens.add("AlbrNF", GXutil.rtrim( localUtil.format( A6182AlbrNF, "@!")));
      forbiddenHiddens.add("AlbrFeNf", localUtil.format(A6183AlbrFeNf, "99/99/99"));
      forbiddenHiddens.add("AlbrCfop", GXutil.rtrim( localUtil.format( A6184AlbrCfop, "")));
      forbiddenHiddens.add("AlbRImp", GXutil.rtrim( localUtil.format( A3360AlbRImp, "@!")));
      forbiddenHiddens.add("AlbRUniB", localUtil.format( A6471AlbRUniB, "ZZZZZ9.99"));
      forbiddenHiddens.add("AlbDocPrv", GXutil.rtrim( localUtil.format( A6488AlbDocPrv, "")));
      forbiddenHiddens.add("AlbRUdas", localUtil.format( A6523AlbRUdas, "ZZZZZ9.99"));
      forbiddenHiddens.add("AlbColor", GXutil.rtrim( localUtil.format( A8023AlbColor, "")));
      forbiddenHiddens.add("AlbOpsT", GXutil.rtrim( localUtil.format( A8024AlbOpsT, "")));
      forbiddenHiddens.add("AlbOpsC", GXutil.rtrim( localUtil.format( A8025AlbOpsC, "")));
      forbiddenHiddens.add("AlbOC", GXutil.rtrim( localUtil.format( A8026AlbOC, "")));
      forbiddenHiddens.add("AlbHdri", GXutil.rtrim( localUtil.format( A8027AlbHdri, "")));
      forbiddenHiddens.add("AlbNumM", GXutil.rtrim( localUtil.format( A8029AlbNumM, "")));
      forbiddenHiddens.add("AlbAncC", localUtil.format( A8030AlbAncC, "Z9.99"));
      forbiddenHiddens.add("AlbDndC", localUtil.format( DecimalUtil.doubleToDec(A8031AlbDndC), "ZZZ9"));
      forbiddenHiddens.add("AlbAncCr", localUtil.format( A8032AlbAncCr, "Z9.99"));
      forbiddenHiddens.add("AlbDndCr", localUtil.format( DecimalUtil.doubleToDec(A8033AlbDndCr), "ZZZ9"));
      forbiddenHiddens.add("AlbDmt", localUtil.format( DecimalUtil.doubleToDec(A8036AlbDmt), "ZZ9"));
      forbiddenHiddens.add("AlbGalga", localUtil.format( DecimalUtil.doubleToDec(A8034AlbGalga), "ZZ9"));
      forbiddenHiddens.add("AlbPdaC", GXutil.rtrim( localUtil.format( A9793AlbPdaC, "")));
      forbiddenHiddens.add("AlbOStj", GXutil.rtrim( localUtil.format( A9794AlbOStj, "")));
      forbiddenHiddens.add("AlbStLot", localUtil.format( DecimalUtil.doubleToDec(A317AlbStLot), "9"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("almacensindetalle\\almacentejido:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z44AlbRecCod", GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z45AlbRef", GXutil.rtrim( Z45AlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, "Z58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( Z58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z46AlbREnt", GXutil.rtrim( Z46AlbREnt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5806AlbREnt2", GXutil.rtrim( Z5806AlbREnt2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z56AlbRUni", GXutil.rtrim( Z56AlbRUni));
      app.GxWebStd.gx_hidden_field( httpContext, "Z47AlbREst", GXutil.ltrim( localUtil.ntoc( Z47AlbREst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12879AlbOEKOTEX", GXutil.rtrim( Z12879AlbOEKOTEX));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3613AlbRefDsc", GXutil.rtrim( Z3613AlbRefDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z49AlbRFen", localUtil.dtoc( Z49AlbRFen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6179AlbrHor", localUtil.ttoc( Z6179AlbrHor, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4601AlbRTam", GXutil.rtrim( Z4601AlbRTam));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9749Emp_Item1", GXutil.rtrim( Z9749Emp_Item1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1291AlbRDes", GXutil.rtrim( Z1291AlbRDes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6463AlbRLote", GXutil.rtrim( Z6463AlbRLote));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14525AlbRLot2", Z14525AlbRLot2);
      app.GxWebStd.gx_hidden_field( httpContext, "Z6464AlbRTelar", GXutil.rtrim( Z6464AlbRTelar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6465AlbRLu", GXutil.ltrim( localUtil.ntoc( Z6465AlbRLu, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6470AlbRTara", GXutil.ltrim( localUtil.ntoc( Z6470AlbRTara, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4602AlbRMdlCod", GXutil.rtrim( Z4602AlbRMdlCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8035AlbMaqTej", GXutil.rtrim( Z8035AlbMaqTej));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8028AlbNumB", GXutil.rtrim( Z8028AlbNumB));
      app.GxWebStd.gx_hidden_field( httpContext, "Z60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( Z60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( Z52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( Z54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6180AlbrUniC", GXutil.ltrim( localUtil.ntoc( Z6180AlbrUniC, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6181AlbrPieC", GXutil.ltrim( localUtil.ntoc( Z6181AlbrPieC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z50AlbRLoc", GXutil.rtrim( Z50AlbRLoc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z55AlbRReo", GXutil.rtrim( Z55AlbRReo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z53AlbRPieReb", GXutil.ltrim( localUtil.ntoc( Z53AlbRPieReb, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z59AlbRUniReb", GXutil.ltrim( localUtil.ntoc( Z59AlbRUniReb, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z48AlbRFecUlt", localUtil.dtoc( Z48AlbRFecUlt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1222AlbNumEti", GXutil.ltrim( localUtil.ntoc( Z1222AlbNumEti, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1301AlbRUlin", GXutil.ltrim( localUtil.ntoc( Z1301AlbRUlin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4290AlbPmPPza", GXutil.ltrim( localUtil.ntoc( Z4290AlbPmPPza, (byte)(6), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4920AlbRGrm2", GXutil.ltrim( localUtil.ntoc( Z4920AlbRGrm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4921AlbRAnc", GXutil.ltrim( localUtil.ntoc( Z4921AlbRAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4922AlbPml", GXutil.ltrim( localUtil.ntoc( Z4922AlbPml, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5743AlbRPre", GXutil.ltrim( localUtil.ntoc( Z5743AlbRPre, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5744AlbRAju", GXutil.ltrim( localUtil.ntoc( Z5744AlbRAju, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5745AlbRRep", GXutil.ltrim( localUtil.ntoc( Z5745AlbRRep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6178AlbrUsu", GXutil.rtrim( Z6178AlbrUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6182AlbrNF", GXutil.rtrim( Z6182AlbrNF));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6183AlbrFeNf", localUtil.dtoc( Z6183AlbrFeNf, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6184AlbrCfop", GXutil.rtrim( Z6184AlbrCfop));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3359AlbRDisCli", GXutil.rtrim( Z3359AlbRDisCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3360AlbRImp", GXutil.rtrim( Z3360AlbRImp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6471AlbRUniB", GXutil.ltrim( localUtil.ntoc( Z6471AlbRUniB, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6488AlbDocPrv", GXutil.rtrim( Z6488AlbDocPrv));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6523AlbRUdas", GXutil.ltrim( localUtil.ntoc( Z6523AlbRUdas, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8023AlbColor", GXutil.rtrim( Z8023AlbColor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8024AlbOpsT", GXutil.rtrim( Z8024AlbOpsT));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8025AlbOpsC", GXutil.rtrim( Z8025AlbOpsC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8026AlbOC", GXutil.rtrim( Z8026AlbOC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8027AlbHdri", GXutil.rtrim( Z8027AlbHdri));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8029AlbNumM", GXutil.rtrim( Z8029AlbNumM));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8030AlbAncC", GXutil.ltrim( localUtil.ntoc( Z8030AlbAncC, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8031AlbDndC", GXutil.ltrim( localUtil.ntoc( Z8031AlbDndC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8032AlbAncCr", GXutil.ltrim( localUtil.ntoc( Z8032AlbAncCr, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8033AlbDndCr", GXutil.ltrim( localUtil.ntoc( Z8033AlbDndCr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8036AlbDmt", GXutil.ltrim( localUtil.ntoc( Z8036AlbDmt, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8034AlbGalga", GXutil.ltrim( localUtil.ntoc( Z8034AlbGalga, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9793AlbPdaC", GXutil.rtrim( Z9793AlbPdaC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9794AlbOStj", GXutil.rtrim( Z9794AlbOStj));
      app.GxWebStd.gx_hidden_field( httpContext, "Z317AlbStLot", GXutil.ltrim( localUtil.ntoc( Z317AlbStLot, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10358AlbTurno", GXutil.ltrim( localUtil.ntoc( Z10358AlbTurno, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6263AlbRTartC", GXutil.ltrim( localUtil.ntoc( Z6263AlbRTartC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z840TrnCod", GXutil.ltrim( localUtil.ntoc( Z840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z970ProceCod", GXutil.ltrim( localUtil.ntoc( Z970ProceCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1211TipEntCod", GXutil.ltrim( localUtil.ntoc( Z1211TipEntCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4792AlmCod", GXutil.ltrim( localUtil.ntoc( Z4792AlmCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O1301AlbRUlin", GXutil.ltrim( localUtil.ntoc( O1301AlbRUlin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_347", GXutil.ltrim( localUtil.ntoc( nGXsfl_347_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N6263AlbRTartC", GXutil.ltrim( localUtil.ntoc( A6263AlbRTartC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N840TrnCod", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N970ProceCod", GXutil.ltrim( localUtil.ntoc( A970ProceCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N1211TipEntCod", GXutil.ltrim( localUtil.ntoc( A1211TipEntCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N4792AlmCod", GXutil.ltrim( localUtil.ntoc( A4792AlmCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N50AlbRLoc", GXutil.rtrim( A50AlbRLoc));
      app.GxWebStd.gx_hidden_field( httpContext, "N45AlbRef", GXutil.rtrim( A45AlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, "N49AlbRFen", localUtil.dtoc( A49AlbRFen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "N56AlbRUni", GXutil.rtrim( A56AlbRUni));
      app.GxWebStd.gx_hidden_field( httpContext, "N55AlbRReo", GXutil.rtrim( A55AlbRReo));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICOD_DATA", AV94CliCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICOD_DATA", AV94CliCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV103DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV103DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vALBREF_DATA", AV101AlbRef_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vALBREF_DATA", AV101AlbRef_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCOD_DATA", AV95TrnCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCOD_DATA", AV95TrnCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPROCECOD_DATA", AV96ProceCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPROCECOD_DATA", AV96ProceCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTIPENTCOD_DATA", AV98TipEntCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTIPENTCOD_DATA", AV98TipEntCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vALMCOD_DATA", AV104AlmCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vALMCOD_DATA", AV104AlmCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV79TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV79TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV79TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPZAEST", GXutil.ltrim( localUtil.ntoc( A4291AlbPzaEst, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV8EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRECCOD", GXutil.ltrim( localUtil.ntoc( AV77AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBRECCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV77AlbRecCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_CLICOD", GXutil.ltrim( localUtil.ntoc( AV81Insert_CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_ALBRTARTC", GXutil.ltrim( localUtil.ntoc( AV82Insert_AlbRTartC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_TRNCOD", GXutil.ltrim( localUtil.ntoc( AV83Insert_TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_PROCECOD", GXutil.ltrim( localUtil.ntoc( AV84Insert_ProceCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_TIPENTCOD", GXutil.ltrim( localUtil.ntoc( AV85Insert_TipEntCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_ALMCOD", GXutil.ltrim( localUtil.ntoc( AV86Insert_AlmCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV25Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vLOTE2", GXutil.ltrim( localUtil.ntoc( AV106Lote2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vENCCLI_20", GXutil.ltrim( localUtil.ntoc( AV39EncCli_20, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBOPST", GXutil.rtrim( A8024AlbOpsT));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGKGS", GXutil.ltrim( localUtil.ntoc( AV14FlagKgs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGMTS", GXutil.ltrim( localUtil.ntoc( AV15FlagMts, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBCUM", GXutil.rtrim( AV72AlbCum));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBOEKOTEX", GXutil.rtrim( A12879AlbOEKOTEX));
      app.GxWebStd.gx_hidden_field( httpContext, "vOKOTEX", GXutil.ltrim( localUtil.ntoc( AV37okotex, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRFENF", localUtil.dtoc( A6183AlbrFeNf, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRNF", GXutil.rtrim( A6182AlbrNF));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRIMP", GXutil.rtrim( A3360AlbRImp));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRARTLU", GXutil.ltrim( localUtil.ntoc( A13982AlbRArtLu, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRUNIB", GXutil.ltrim( localUtil.ntoc( A6471AlbRUniB, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRUDAS", GXutil.ltrim( localUtil.ntoc( A6523AlbRUdas, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEXISTEREFERENCIA", GXutil.ltrim( localUtil.ntoc( AV91ExisteReferencia, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLI350", GXutil.ltrim( localUtil.ntoc( AV26Cli350, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONTVAL", GXutil.ltrim( localUtil.ntoc( AV27ContVal, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIEST", GXutil.rtrim( A8723CliEst));
      app.GxWebStd.gx_hidden_field( httpContext, "EMP_ITEM1", GXutil.rtrim( A9749Emp_Item1));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRPIEREB", GXutil.ltrim( localUtil.ntoc( A53AlbRPieReb, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRUNIREB", GXutil.ltrim( localUtil.ntoc( A59AlbRUniReb, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBNUMETI", GXutil.ltrim( localUtil.ntoc( A1222AlbNumEti, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRULIN", GXutil.ltrim( localUtil.ntoc( A1301AlbRUlin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRPRE", GXutil.ltrim( localUtil.ntoc( A5743AlbRPre, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRAJU", GXutil.ltrim( localUtil.ntoc( A5744AlbRAju, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRREP", GXutil.ltrim( localUtil.ntoc( A5745AlbRRep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRCFOP", GXutil.rtrim( A6184AlbrCfop));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBDOCPRV", GXutil.rtrim( A6488AlbDocPrv));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOLOR", GXutil.rtrim( A8023AlbColor));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBOPSC", GXutil.rtrim( A8025AlbOpsC));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBOC", GXutil.rtrim( A8026AlbOC));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBHDRI", GXutil.rtrim( A8027AlbHdri));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBNUMM", GXutil.rtrim( A8029AlbNumM));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBANCC", GXutil.ltrim( localUtil.ntoc( A8030AlbAncC, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBDNDC", GXutil.ltrim( localUtil.ntoc( A8031AlbDndC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBANCCR", GXutil.ltrim( localUtil.ntoc( A8032AlbAncCr, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBDNDCR", GXutil.ltrim( localUtil.ntoc( A8033AlbDndCr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBDMT", GXutil.ltrim( localUtil.ntoc( A8036AlbDmt, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBGALGA", GXutil.ltrim( localUtil.ntoc( A8034AlbGalga, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPDAC", GXutil.rtrim( A9793AlbPdaC));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBOSTJ", GXutil.rtrim( A9794AlbOStj));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBSTLOT", GXutil.ltrim( localUtil.ntoc( A317AlbStLot, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "CLINOM", GXutil.rtrim( A279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "TRNNOM", GXutil.rtrim( A841TrnNom));
      app.GxWebStd.gx_hidden_field( httpContext, "PROCENOM", GXutil.rtrim( A971ProceNom));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPENTNOM", GXutil.rtrim( A1212TipEntNom));
      app.GxWebStd.gx_hidden_field( httpContext, "ALMNOM", GXutil.rtrim( A4793AlmNom));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Objectcall", GXutil.rtrim( Combo_clicod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Cls", GXutil.rtrim( Combo_clicod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Selectedvalue_set", GXutil.rtrim( Combo_clicod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Enabled", GXutil.booltostr( Combo_clicod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Emptyitem", GXutil.booltostr( Combo_clicod_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBREF_Objectcall", GXutil.rtrim( Combo_albref_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBREF_Cls", GXutil.rtrim( Combo_albref_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBREF_Selectedvalue_set", GXutil.rtrim( Combo_albref_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBREF_Enabled", GXutil.booltostr( Combo_albref_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBREF_Emptyitem", GXutil.booltostr( Combo_albref_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRNCOD_Objectcall", GXutil.rtrim( Combo_trncod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRNCOD_Cls", GXutil.rtrim( Combo_trncod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRNCOD_Selectedvalue_set", GXutil.rtrim( Combo_trncod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRNCOD_Enabled", GXutil.booltostr( Combo_trncod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRNCOD_Emptyitem", GXutil.booltostr( Combo_trncod_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROCECOD_Objectcall", GXutil.rtrim( Combo_procecod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROCECOD_Cls", GXutil.rtrim( Combo_procecod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROCECOD_Selectedvalue_set", GXutil.rtrim( Combo_procecod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROCECOD_Enabled", GXutil.booltostr( Combo_procecod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROCECOD_Emptyitem", GXutil.booltostr( Combo_procecod_Emptyitem));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPENTCOD_Objectcall", GXutil.rtrim( Combo_tipentcod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPENTCOD_Cls", GXutil.rtrim( Combo_tipentcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPENTCOD_Selectedvalue_set", GXutil.rtrim( Combo_tipentcod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPENTCOD_Enabled", GXutil.booltostr( Combo_tipentcod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPENTCOD_Emptyitem", GXutil.booltostr( Combo_tipentcod_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable9_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Enabled", GXutil.booltostr( Dvpanel_unnamedtable9_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Width", GXutil.rtrim( Dvpanel_unnamedtable9_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable9_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable9_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Cls", GXutil.rtrim( Dvpanel_unnamedtable9_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Title", GXutil.rtrim( Dvpanel_unnamedtable9_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable9_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable9_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable9_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable9_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable9_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALMCOD_Objectcall", GXutil.rtrim( Combo_almcod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALMCOD_Cls", GXutil.rtrim( Combo_almcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALMCOD_Selectedvalue_set", GXutil.rtrim( Combo_almcod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALMCOD_Enabled", GXutil.booltostr( Combo_almcod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALMCOD_Emptyitem", GXutil.booltostr( Combo_almcod_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE11_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable11_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE11_Enabled", GXutil.booltostr( Dvpanel_unnamedtable11_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE11_Width", GXutil.rtrim( Dvpanel_unnamedtable11_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE11_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable11_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE11_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable11_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE11_Cls", GXutil.rtrim( Dvpanel_unnamedtable11_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE11_Title", GXutil.rtrim( Dvpanel_unnamedtable11_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE11_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable11_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE11_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable11_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE11_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable11_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE11_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable11_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE11_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable11_Autoscroll));
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
      return formatLink("app.almacensindetalle.almacentejido", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV8EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV77AlbRecCod,8,0))}, new String[] {"Gx_mode","EmprCod","AlbRecCod"})  ;
   }

   public String getPgmname( )
   {
      return "AlmacenSinDetalle.AlmacenTejido" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Almacen Tejido", "") ;
   }

   public void initializeNonKey1S17( )
   {
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A6263AlbRTartC = (short)(0) ;
      n6263AlbRTartC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6263AlbRTartC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6263AlbRTartC), 4, 0));
      A45AlbRef = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      A46AlbREnt = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", A46AlbREnt);
      A5806AlbREnt2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5806AlbREnt2", A5806AlbREnt2);
      A56AlbRUni = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      AV72AlbCum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72AlbCum", AV72AlbCum);
      A12879AlbOEKOTEX = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12879AlbOEKOTEX", A12879AlbOEKOTEX);
      A3613AlbRefDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
      A6264AlbRTartD = "" ;
      n6264AlbRTartD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6264AlbRTartD", A6264AlbRTartD);
      AV91ExisteReferencia = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91ExisteReferencia", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV91ExisteReferencia), 4, 0));
      A51AlbRPieDis = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      A57AlbRUniDis = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      A4291AlbPzaEst = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4291AlbPzaEst", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4291AlbPzaEst), 8, 0));
      A13981Composicio = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13981Composicio", A13981Composicio);
      A13982AlbRArtLu = DecimalUtil.ZERO ;
      n13982AlbRArtLu = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13982AlbRArtLu", GXutil.ltrimstr( A13982AlbRArtLu, 6, 2));
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A4601AlbRTam = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4601AlbRTam", A4601AlbRTam);
      A9749Emp_Item1 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9749Emp_Item1", A9749Emp_Item1);
      A841TrnNom = "" ;
      n841TrnNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      A1291AlbRDes = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", A1291AlbRDes);
      A971ProceNom = "" ;
      n971ProceNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
      A14525AlbRLot2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14525AlbRLot2", A14525AlbRLot2);
      A6465AlbRLu = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A6465AlbRLu", GXutil.ltrimstr( A6465AlbRLu, 6, 2));
      A8035AlbMaqTej = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8035AlbMaqTej", A8035AlbMaqTej);
      A8028AlbNumB = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8028AlbNumB", A8028AlbNumB);
      A60AlbRUniUti = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      A52AlbRPieEnt = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      A54AlbRPieUti = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      A50AlbRLoc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", A50AlbRLoc);
      A53AlbRPieReb = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A53AlbRPieReb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A53AlbRPieReb), 6, 0));
      A59AlbRUniReb = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A59AlbRUniReb", GXutil.ltrimstr( A59AlbRUniReb, 9, 2));
      A1212TipEntNom = "" ;
      n1212TipEntNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", A1212TipEntNom);
      A1222AlbNumEti = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1222AlbNumEti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1222AlbNumEti), 4, 0));
      A1301AlbRUlin = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
      A4290AlbPmPPza = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A4290AlbPmPPza", GXutil.ltrimstr( A4290AlbPmPPza, 6, 3));
      A4920AlbRGrm2 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
      A4921AlbRAnc = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
      A4922AlbPml = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4922AlbPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4922AlbPml), 4, 0));
      A5743AlbRPre = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A5743AlbRPre", GXutil.ltrimstr( A5743AlbRPre, 12, 5));
      A5744AlbRAju = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A5744AlbRAju", GXutil.ltrimstr( A5744AlbRAju, 8, 2));
      A5745AlbRRep = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5745AlbRRep", GXutil.str( A5745AlbRRep, 1, 0));
      A6184AlbrCfop = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6184AlbrCfop", A6184AlbrCfop);
      A3359AlbRDisCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3359AlbRDisCli", A3359AlbRDisCli);
      A6488AlbDocPrv = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6488AlbDocPrv", A6488AlbDocPrv);
      A4793AlmNom = "" ;
      n4793AlmNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4793AlmNom", A4793AlmNom);
      A8023AlbColor = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8023AlbColor", A8023AlbColor);
      A8024AlbOpsT = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8024AlbOpsT", A8024AlbOpsT);
      A8025AlbOpsC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8025AlbOpsC", A8025AlbOpsC);
      A8026AlbOC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8026AlbOC", A8026AlbOC);
      A8027AlbHdri = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8027AlbHdri", A8027AlbHdri);
      A8029AlbNumM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8029AlbNumM", A8029AlbNumM);
      A8030AlbAncC = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A8030AlbAncC", GXutil.ltrimstr( A8030AlbAncC, 5, 2));
      A8031AlbDndC = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8031AlbDndC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8031AlbDndC), 4, 0));
      A8032AlbAncCr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A8032AlbAncCr", GXutil.ltrimstr( A8032AlbAncCr, 5, 2));
      A8033AlbDndCr = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8033AlbDndCr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8033AlbDndCr), 4, 0));
      A8036AlbDmt = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8036AlbDmt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8036AlbDmt), 3, 0));
      A8034AlbGalga = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8034AlbGalga", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8034AlbGalga), 3, 0));
      A9793AlbPdaC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9793AlbPdaC", A9793AlbPdaC);
      A9794AlbOStj = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9794AlbOStj", A9794AlbOStj);
      A317AlbStLot = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A317AlbStLot", GXutil.str( A317AlbStLot, 1, 0));
      A10358AlbTurno = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10358AlbTurno", GXutil.str( A10358AlbTurno, 1, 0));
      A8723CliEst = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8723CliEst", A8723CliEst);
      A840TrnCod = (short)(0) ;
      n840TrnCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      A970ProceCod = (short)(0) ;
      n970ProceCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
      A1211TipEntCod = (short)(1) ;
      n1211TipEntCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
      A4792AlmCod = (byte)(0) ;
      n4792AlmCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4792AlmCod", GXutil.str( A4792AlmCod, 1, 0));
      A47AlbREst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      A49AlbRFen = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
      A6179AlbrHor = GXutil.resetDate(GXutil.serverNow( context, remoteHandle, pr_default)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6179AlbrHor", localUtil.ttoc( A6179AlbrHor, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A6463AlbRLote = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", A6463AlbRLote);
      A6464AlbRTelar = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "A6464AlbRTelar", A6464AlbRTelar);
      A6470AlbRTara = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6470AlbRTara", GXutil.ltrimstr( A6470AlbRTara, 6, 2));
      A4602AlbRMdlCod = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "A4602AlbRMdlCod", A4602AlbRMdlCod);
      A6180AlbrUniC = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A6180AlbrUniC", GXutil.ltrimstr( A6180AlbrUniC, 9, 2));
      A6181AlbrPieC = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A6181AlbrPieC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6181AlbrPieC), 6, 0));
      A55AlbRReo = httpContext.getMessage( "NO", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
      A48AlbRFecUlt = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
      A6178AlbrUsu = AV7UsurCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A6178AlbrUsu", A6178AlbrUsu);
      A6182AlbrNF = httpContext.getMessage( "N", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "A6182AlbrNF", A6182AlbrNF);
      A6183AlbrFeNf = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6183AlbrFeNf", localUtil.format(A6183AlbrFeNf, "99/99/99"));
      A3360AlbRImp = httpContext.getMessage( "N", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "A3360AlbRImp", A3360AlbRImp);
      A6471AlbRUniB = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6471AlbRUniB", GXutil.ltrimstr( A6471AlbRUniB, 9, 2));
      A6523AlbRUdas = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6523AlbRUdas", GXutil.ltrimstr( A6523AlbRUdas, 9, 2));
      O1301AlbRUlin = A1301AlbRUlin ;
      httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
      Z45AlbRef = "" ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
      Z46AlbREnt = "" ;
      Z5806AlbREnt2 = "" ;
      Z56AlbRUni = "" ;
      Z47AlbREst = (byte)(0) ;
      Z12879AlbOEKOTEX = "" ;
      Z3613AlbRefDsc = "" ;
      Z49AlbRFen = GXutil.nullDate() ;
      Z6179AlbrHor = GXutil.resetTime( GXutil.nullDate() );
      Z4601AlbRTam = "" ;
      Z9749Emp_Item1 = "" ;
      Z1291AlbRDes = "" ;
      Z6463AlbRLote = "" ;
      Z14525AlbRLot2 = "" ;
      Z6464AlbRTelar = "" ;
      Z6465AlbRLu = DecimalUtil.ZERO ;
      Z6470AlbRTara = DecimalUtil.ZERO ;
      Z4602AlbRMdlCod = "" ;
      Z8035AlbMaqTej = "" ;
      Z8028AlbNumB = "" ;
      Z60AlbRUniUti = DecimalUtil.ZERO ;
      Z52AlbRPieEnt = 0 ;
      Z54AlbRPieUti = 0 ;
      Z6180AlbrUniC = DecimalUtil.ZERO ;
      Z6181AlbrPieC = 0 ;
      Z50AlbRLoc = "" ;
      Z55AlbRReo = "" ;
      Z53AlbRPieReb = 0 ;
      Z59AlbRUniReb = DecimalUtil.ZERO ;
      Z48AlbRFecUlt = GXutil.nullDate() ;
      Z1222AlbNumEti = (short)(0) ;
      Z1301AlbRUlin = (byte)(0) ;
      Z4290AlbPmPPza = DecimalUtil.ZERO ;
      Z4920AlbRGrm2 = (short)(0) ;
      Z4921AlbRAnc = (short)(0) ;
      Z4922AlbPml = (short)(0) ;
      Z5743AlbRPre = DecimalUtil.ZERO ;
      Z5744AlbRAju = DecimalUtil.ZERO ;
      Z5745AlbRRep = (byte)(0) ;
      Z6178AlbrUsu = "" ;
      Z6182AlbrNF = "" ;
      Z6183AlbrFeNf = GXutil.nullDate() ;
      Z6184AlbrCfop = "" ;
      Z3359AlbRDisCli = "" ;
      Z3360AlbRImp = "" ;
      Z6471AlbRUniB = DecimalUtil.ZERO ;
      Z6488AlbDocPrv = "" ;
      Z6523AlbRUdas = DecimalUtil.ZERO ;
      Z8023AlbColor = "" ;
      Z8024AlbOpsT = "" ;
      Z8025AlbOpsC = "" ;
      Z8026AlbOC = "" ;
      Z8027AlbHdri = "" ;
      Z8029AlbNumM = "" ;
      Z8030AlbAncC = DecimalUtil.ZERO ;
      Z8031AlbDndC = (short)(0) ;
      Z8032AlbAncCr = DecimalUtil.ZERO ;
      Z8033AlbDndCr = (short)(0) ;
      Z8036AlbDmt = (short)(0) ;
      Z8034AlbGalga = (short)(0) ;
      Z9793AlbPdaC = "" ;
      Z9794AlbOStj = "" ;
      Z317AlbStLot = (byte)(0) ;
      Z10358AlbTurno = (byte)(0) ;
      Z252CliCod = 0 ;
      Z6263AlbRTartC = (short)(0) ;
      Z840TrnCod = (short)(0) ;
      Z970ProceCod = (short)(0) ;
      Z1211TipEntCod = (short)(0) ;
      Z4792AlmCod = (byte)(0) ;
   }

   public void initAll1S17( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A44AlbRecCod = 0 ;
      n44AlbRecCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      initializeNonKey1S17( ) ;
   }

   public void standaloneModalInsert( )
   {
      A840TrnCod = i840TrnCod ;
      n840TrnCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      A970ProceCod = i970ProceCod ;
      n970ProceCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
      A1211TipEntCod = i1211TipEntCod ;
      n1211TipEntCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
      A4792AlmCod = i4792AlmCod ;
      n4792AlmCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4792AlmCod", GXutil.str( A4792AlmCod, 1, 0));
      A49AlbRFen = i49AlbRFen ;
      httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
      A6183AlbrFeNf = i6183AlbrFeNf ;
      httpContext.ajax_rsp_assign_attri("", false, "A6183AlbrFeNf", localUtil.format(A6183AlbrFeNf, "99/99/99"));
      A55AlbRReo = i55AlbRReo ;
      httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
      A48AlbRFecUlt = i48AlbRFecUlt ;
      httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
      A6182AlbrNF = i6182AlbrNF ;
      httpContext.ajax_rsp_assign_attri("", false, "A6182AlbrNF", A6182AlbrNF);
      A6179AlbrHor = i6179AlbrHor ;
      httpContext.ajax_rsp_assign_attri("", false, "A6179AlbrHor", localUtil.ttoc( A6179AlbrHor, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A6178AlbrUsu = i6178AlbrUsu ;
      httpContext.ajax_rsp_assign_attri("", false, "A6178AlbrUsu", A6178AlbrUsu);
      A3360AlbRImp = i3360AlbRImp ;
      httpContext.ajax_rsp_assign_attri("", false, "A3360AlbRImp", A3360AlbRImp);
      A4602AlbRMdlCod = i4602AlbRMdlCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A4602AlbRMdlCod", A4602AlbRMdlCod);
      A6463AlbRLote = i6463AlbRLote ;
      httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", A6463AlbRLote);
      A6464AlbRTelar = i6464AlbRTelar ;
      httpContext.ajax_rsp_assign_attri("", false, "A6464AlbRTelar", A6464AlbRTelar);
      A6470AlbRTara = i6470AlbRTara ;
      httpContext.ajax_rsp_assign_attri("", false, "A6470AlbRTara", GXutil.ltrimstr( A6470AlbRTara, 6, 2));
      A6471AlbRUniB = i6471AlbRUniB ;
      httpContext.ajax_rsp_assign_attri("", false, "A6471AlbRUniB", GXutil.ltrimstr( A6471AlbRUniB, 9, 2));
      A6523AlbRUdas = i6523AlbRUdas ;
      httpContext.ajax_rsp_assign_attri("", false, "A6523AlbRUdas", GXutil.ltrimstr( A6523AlbRUdas, 9, 2));
   }

   public void initializeNonKey1S1191( )
   {
      A1300AlbRObs = "" ;
      Z1300AlbRObs = "" ;
   }

   public void initAll1S1191( )
   {
      A1299AlbRLin = (byte)(0) ;
      initializeNonKey1S1191( ) ;
   }

   public void standaloneModalInsert1S1191( )
   {
      A1301AlbRUlin = i1301AlbRUlin ;
      httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241512198", true, true);
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
      httpContext.AddJavascriptSource("almacensindetalle/almacentejido.js", "?20268241512199", false, true);
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties191( )
   {
      edtAlbRLin_Enabled = defedtAlbRLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLin_Enabled), 5, 0), !bGXsfl_347_Refreshing);
   }

   public void startgridcontrol347( )
   {
      Gridlevel_observacionContainer.AddObjectProperty("GridName", "Gridlevel_observacion");
      Gridlevel_observacionContainer.AddObjectProperty("Header", subGridlevel_observacion_Header);
      Gridlevel_observacionContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_observacionContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_observacionContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_observacionContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_observacion_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_observacionContainer.AddObjectProperty("CmpContext", "");
      Gridlevel_observacionContainer.AddObjectProperty("InMasterPage", "false");
      Gridlevel_observacionColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_observacionColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1299AlbRLin, (byte)(2), (byte)(0), ".", "")));
      Gridlevel_observacionColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_observacionContainer.AddColumnProperties(Gridlevel_observacionColumn);
      Gridlevel_observacionColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_observacionColumn.AddObjectProperty("Value", GXutil.rtrim( A1300AlbRObs));
      Gridlevel_observacionColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_observacionContainer.AddColumnProperties(Gridlevel_observacionColumn);
      Gridlevel_observacionContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_observacion_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_observacionContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_observacion_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_observacionContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_observacion_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_observacionContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_observacion_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_observacionContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_observacion_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_observacionContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_observacion_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_observacionContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_observacion_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      edtAlbRecCod_Internalname = "ALBRECCOD" ;
      edtavUsurcod_Internalname = "vUSURCOD" ;
      divUnnamedtable25_Internalname = "UNNAMEDTABLE25" ;
      imgAlert_Internalname = "ALERT" ;
      lblAlert_text_Internalname = "ALERT_TEXT" ;
      divTableintegracion_pontway_Internalname = "TABLEINTEGRACION_PONTWAY" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtAlbRFen_Internalname = "ALBRFEN" ;
      edtAlbrHor_Internalname = "ALBRHOR" ;
      edtAlbrUsu_Internalname = "ALBRUSU" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      lblTextblockclicod_Internalname = "TEXTBLOCKCLICOD" ;
      Combo_clicod_Internalname = "COMBO_CLICOD" ;
      edtCliCod_Internalname = "CLICOD" ;
      divTablesplittedclicod_Internalname = "TABLESPLITTEDCLICOD" ;
      lblTextblockalbref_Internalname = "TEXTBLOCKALBREF" ;
      Combo_albref_Internalname = "COMBO_ALBREF" ;
      edtAlbRef_Internalname = "ALBREF" ;
      divTablesplittedalbref_Internalname = "TABLESPLITTEDALBREF" ;
      edtAlbRefDsc_Internalname = "ALBREFDSC" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      edtAlbRTartC_Internalname = "ALBRTARTC" ;
      divUnnamedtable23_Internalname = "UNNAMEDTABLE23" ;
      lblTextblock2desc_Internalname = "TEXTBLOCK2DESC" ;
      edtAlbRTartD_Internalname = "ALBRTARTD" ;
      divUnnamedtable24_Internalname = "UNNAMEDTABLE24" ;
      edtComposicio_Internalname = "COMPOSICIO" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      edtAlbREnt_Internalname = "ALBRENT" ;
      divAlbrent_cell_Internalname = "ALBRENT_CELL" ;
      edtAlbREnt2_Internalname = "ALBRENT2" ;
      divAlbrent2_cell_Internalname = "ALBRENT2_CELL" ;
      edtAlbRDisCli_Internalname = "ALBRDISCLI" ;
      edtAlbNumB_Internalname = "ALBNUMB" ;
      edtAlbTurno_Internalname = "ALBTURNO" ;
      divAlbturno_cell_Internalname = "ALBTURNO_CELL" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      lblTextblocktrncod_Internalname = "TEXTBLOCKTRNCOD" ;
      Combo_trncod_Internalname = "COMBO_TRNCOD" ;
      edtTrnCod_Internalname = "TRNCOD" ;
      divTablesplittedtrncod_Internalname = "TABLESPLITTEDTRNCOD" ;
      lblTextblockprocecod_Internalname = "TEXTBLOCKPROCECOD" ;
      Combo_procecod_Internalname = "COMBO_PROCECOD" ;
      edtProceCod_Internalname = "PROCECOD" ;
      divTablesplittedprocecod_Internalname = "TABLESPLITTEDPROCECOD" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      edtAlbRLot2_Internalname = "ALBRLOT2" ;
      divAlbrlot2_cell_Internalname = "ALBRLOT2_CELL" ;
      edtAlbRLote_Internalname = "ALBRLOTE" ;
      divAlbrlote_cell_Internalname = "ALBRLOTE_CELL" ;
      edtAlbRMdlCod_Internalname = "ALBRMDLCOD" ;
      edtAlbRLu_Internalname = "ALBRLU" ;
      edtAlbRTelar_Internalname = "ALBRTELAR" ;
      edtAlbMaqTej_Internalname = "ALBMAQTEJ" ;
      cmbAlbRTam.setInternalname( "ALBRTAM" );
      edtAlbRTara_Internalname = "ALBRTARA" ;
      divUnnamedtable22_Internalname = "UNNAMEDTABLE22" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      Dvpanel_unnamedtable7_Internalname = "DVPANEL_UNNAMEDTABLE7" ;
      divDvpanel_unnamedtable7_cell_Internalname = "DVPANEL_UNNAMEDTABLE7_CELL" ;
      lblTextblocktipentcod_Internalname = "TEXTBLOCKTIPENTCOD" ;
      Combo_tipentcod_Internalname = "COMBO_TIPENTCOD" ;
      edtTipEntCod_Internalname = "TIPENTCOD" ;
      divTablesplittedtipentcod_Internalname = "TABLESPLITTEDTIPENTCOD" ;
      edtAlbRDes_Internalname = "ALBRDES" ;
      divUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
      edtAlbRPieEnt_Internalname = "ALBRPIEENT" ;
      edtAlbPmPPza_Internalname = "ALBPMPPZA" ;
      edtAlbrPieC_Internalname = "ALBRPIEC" ;
      divUnnamedtable20_Internalname = "UNNAMEDTABLE20" ;
      edtAlbRUniEnt_Internalname = "ALBRUNIENT" ;
      cmbAlbRUni.setInternalname( "ALBRUNI" );
      edtAlbrUniC_Internalname = "ALBRUNIC" ;
      divUnnamedtable21_Internalname = "UNNAMEDTABLE21" ;
      divUnnamedtable13_Internalname = "UNNAMEDTABLE13" ;
      grpUnnamedgroup14_Internalname = "UNNAMEDGROUP14" ;
      edtAlbRPieUti_Internalname = "ALBRPIEUTI" ;
      edtAlbRPieDis_Internalname = "ALBRPIEDIS" ;
      divUnnamedtable17_Internalname = "UNNAMEDTABLE17" ;
      edtAlbRUniUti_Internalname = "ALBRUNIUTI" ;
      edtAlbRUniDis_Internalname = "ALBRUNIDIS" ;
      divUnnamedtable18_Internalname = "UNNAMEDTABLE18" ;
      edtAlbRFecUlt_Internalname = "ALBRFECULT" ;
      cmbAlbREst.setInternalname( "ALBREST" );
      divUnnamedtable19_Internalname = "UNNAMEDTABLE19" ;
      divUnnamedtable15_Internalname = "UNNAMEDTABLE15" ;
      grpUnnamedgroup16_Internalname = "UNNAMEDGROUP16" ;
      divUnnamedtable9_Internalname = "UNNAMEDTABLE9" ;
      Dvpanel_unnamedtable9_Internalname = "DVPANEL_UNNAMEDTABLE9" ;
      lblTextblockalmcod_Internalname = "TEXTBLOCKALMCOD" ;
      Combo_almcod_Internalname = "COMBO_ALMCOD" ;
      edtAlmCod_Internalname = "ALMCOD" ;
      divTablesplittedalmcod_Internalname = "TABLESPLITTEDALMCOD" ;
      edtAlbRLoc_Internalname = "ALBRLOC" ;
      cmbAlbRReo.setInternalname( "ALBRREO" );
      divUnnamedtable10_Internalname = "UNNAMEDTABLE10" ;
      edtAlbRGrm2_Internalname = "ALBRGRM2" ;
      edtAlbRAnc_Internalname = "ALBRANC" ;
      edtAlbPml_Internalname = "ALBPML" ;
      divUnnamedtable12_Internalname = "UNNAMEDTABLE12" ;
      divUnnamedtable11_Internalname = "UNNAMEDTABLE11" ;
      Dvpanel_unnamedtable11_Internalname = "DVPANEL_UNNAMEDTABLE11" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtAlbRLin_Internalname = "ALBRLIN" ;
      edtAlbRObs_Internalname = "ALBROBS" ;
      divTableleaflevel_observacion_Internalname = "TABLELEAFLEVEL_OBSERVACION" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavComboclicod_Internalname = "vCOMBOCLICOD" ;
      divSectionattribute_clicod_Internalname = "SECTIONATTRIBUTE_CLICOD" ;
      edtavComboalbref_Internalname = "vCOMBOALBREF" ;
      divSectionattribute_albref_Internalname = "SECTIONATTRIBUTE_ALBREF" ;
      edtavCombotrncod_Internalname = "vCOMBOTRNCOD" ;
      divSectionattribute_trncod_Internalname = "SECTIONATTRIBUTE_TRNCOD" ;
      edtavComboprocecod_Internalname = "vCOMBOPROCECOD" ;
      divSectionattribute_procecod_Internalname = "SECTIONATTRIBUTE_PROCECOD" ;
      edtavCombotipentcod_Internalname = "vCOMBOTIPENTCOD" ;
      divSectionattribute_tipentcod_Internalname = "SECTIONATTRIBUTE_TIPENTCOD" ;
      edtavComboalmcod_Internalname = "vCOMBOALMCOD" ;
      divSectionattribute_almcod_Internalname = "SECTIONATTRIBUTE_ALMCOD" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_6263_Internalname = "PROMPT_6263" ;
      subGridlevel_observacion_Internalname = "GRIDLEVEL_OBSERVACION" ;
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
      subGridlevel_observacion_Allowcollapsing = (byte)(0) ;
      subGridlevel_observacion_Allowselection = (byte)(0) ;
      subGridlevel_observacion_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Almacen Tejido", "") );
      edtAlbRObs_Jsonclick = "" ;
      edtAlbRLin_Jsonclick = "" ;
      subGridlevel_observacion_Class = "GridNoBorder WorkWith" ;
      subGridlevel_observacion_Backcolorstyle = (byte)(0) ;
      edtAlbRObs_Enabled = 1 ;
      edtAlbRLin_Enabled = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 0 ;
      edtEmprCod_Visible = 1 ;
      edtavComboalmcod_Jsonclick = "" ;
      edtavComboalmcod_Enabled = 0 ;
      edtavComboalmcod_Visible = 1 ;
      edtavCombotipentcod_Jsonclick = "" ;
      edtavCombotipentcod_Enabled = 0 ;
      edtavCombotipentcod_Visible = 1 ;
      edtavComboprocecod_Jsonclick = "" ;
      edtavComboprocecod_Enabled = 0 ;
      edtavComboprocecod_Visible = 1 ;
      edtavCombotrncod_Jsonclick = "" ;
      edtavCombotrncod_Enabled = 0 ;
      edtavCombotrncod_Visible = 1 ;
      edtavComboalbref_Jsonclick = "" ;
      edtavComboalbref_Enabled = 0 ;
      edtavComboalbref_Visible = 1 ;
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
      edtAlbPml_Jsonclick = "" ;
      edtAlbPml_Enabled = 1 ;
      edtAlbRAnc_Jsonclick = "" ;
      edtAlbRAnc_Enabled = 1 ;
      edtAlbRGrm2_Jsonclick = "" ;
      edtAlbRGrm2_Enabled = 1 ;
      Dvpanel_unnamedtable11_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable11_Iconposition = "Right" ;
      Dvpanel_unnamedtable11_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable11_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable11_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable11_Title = httpContext.getMessage( "Datos Crudo", "") ;
      Dvpanel_unnamedtable11_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable11_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable11_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable11_Width = "100%" ;
      cmbAlbRReo.setJsonclick( "" );
      cmbAlbRReo.setEnabled( 1 );
      edtAlbRLoc_Jsonclick = "" ;
      edtAlbRLoc_Enabled = 1 ;
      edtAlmCod_Jsonclick = "" ;
      edtAlmCod_Enabled = 1 ;
      edtAlmCod_Visible = 1 ;
      Combo_almcod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_almcod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_almcod_Enabled = GXutil.toBoolean( -1) ;
      cmbAlbREst.setJsonclick( "" );
      cmbAlbREst.setEnabled( 0 );
      edtAlbRFecUlt_Jsonclick = "" ;
      edtAlbRFecUlt_Enabled = 0 ;
      edtAlbRUniDis_Jsonclick = "" ;
      edtAlbRUniDis_Enabled = 0 ;
      edtAlbRUniUti_Jsonclick = "" ;
      edtAlbRUniUti_Enabled = 1 ;
      edtAlbRPieDis_Jsonclick = "" ;
      edtAlbRPieDis_Enabled = 0 ;
      edtAlbRPieUti_Jsonclick = "" ;
      edtAlbRPieUti_Enabled = 1 ;
      edtAlbrUniC_Jsonclick = "" ;
      edtAlbrUniC_Enabled = 1 ;
      cmbAlbRUni.setJsonclick( "" );
      cmbAlbRUni.setEnabled( 1 );
      edtAlbRUniEnt_Jsonclick = "" ;
      edtAlbRUniEnt_Enabled = 1 ;
      edtAlbrPieC_Jsonclick = "" ;
      edtAlbrPieC_Enabled = 1 ;
      edtAlbPmPPza_Jsonclick = "" ;
      edtAlbPmPPza_Enabled = 1 ;
      edtAlbPmPPza_Visible = 1 ;
      edtAlbRPieEnt_Jsonclick = "" ;
      edtAlbRPieEnt_Enabled = 1 ;
      Dvpanel_unnamedtable9_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable9_Iconposition = "Right" ;
      Dvpanel_unnamedtable9_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable9_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable9_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable9_Title = httpContext.getMessage( "Piezas, Unidades", "") ;
      Dvpanel_unnamedtable9_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable9_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable9_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable9_Width = "100%" ;
      edtAlbRDes_Jsonclick = "" ;
      edtAlbRDes_Enabled = 1 ;
      edtTipEntCod_Jsonclick = "" ;
      edtTipEntCod_Enabled = 1 ;
      edtTipEntCod_Visible = 1 ;
      Combo_tipentcod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_tipentcod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_tipentcod_Caption = "" ;
      Combo_tipentcod_Enabled = GXutil.toBoolean( -1) ;
      edtAlbRTara_Jsonclick = "" ;
      edtAlbRTara_Enabled = 1 ;
      cmbAlbRTam.setJsonclick( "" );
      cmbAlbRTam.setEnabled( 1 );
      edtAlbMaqTej_Jsonclick = "" ;
      edtAlbMaqTej_Enabled = 1 ;
      edtAlbRTelar_Jsonclick = "" ;
      edtAlbRTelar_Enabled = 1 ;
      edtAlbRLu_Jsonclick = "" ;
      edtAlbRLu_Enabled = 1 ;
      edtAlbRMdlCod_Jsonclick = "" ;
      edtAlbRMdlCod_Enabled = 1 ;
      edtAlbRLote_Jsonclick = "" ;
      edtAlbRLote_Enabled = 1 ;
      edtAlbRLote_Visible = 1 ;
      divAlbrlote_cell_Class = "col-xs-12 col-sm-2" ;
      edtAlbRLot2_Jsonclick = "" ;
      edtAlbRLot2_Enabled = 1 ;
      edtAlbRLot2_Visible = 1 ;
      divAlbrlot2_cell_Class = "col-xs-12 col-sm-2" ;
      Dvpanel_unnamedtable7_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Iconposition = "Right" ;
      Dvpanel_unnamedtable7_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable7_Title = httpContext.getMessage( "Datos Tejedor", "") ;
      Dvpanel_unnamedtable7_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable7_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable7_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Width = "100%" ;
      divDvpanel_unnamedtable7_cell_Class = "col-xs-12" ;
      edtProceCod_Jsonclick = "" ;
      edtProceCod_Enabled = 1 ;
      edtProceCod_Visible = 1 ;
      Combo_procecod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_procecod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_procecod_Enabled = GXutil.toBoolean( -1) ;
      edtTrnCod_Jsonclick = "" ;
      edtTrnCod_Enabled = 1 ;
      edtTrnCod_Visible = 1 ;
      Combo_trncod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_trncod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_trncod_Enabled = GXutil.toBoolean( -1) ;
      edtAlbTurno_Jsonclick = "" ;
      edtAlbTurno_Enabled = 1 ;
      edtAlbTurno_Visible = 1 ;
      divAlbturno_cell_Class = "col-xs-12 col-sm-2" ;
      edtAlbNumB_Jsonclick = "" ;
      edtAlbNumB_Enabled = 1 ;
      edtAlbRDisCli_Jsonclick = "" ;
      edtAlbRDisCli_Enabled = 1 ;
      edtAlbREnt2_Jsonclick = "" ;
      edtAlbREnt2_Enabled = 1 ;
      edtAlbREnt2_Visible = 1 ;
      divAlbrent2_cell_Class = "col-xs-12 col-sm-3" ;
      edtAlbREnt_Jsonclick = "" ;
      edtAlbREnt_Enabled = 1 ;
      edtAlbREnt_Visible = 1 ;
      divAlbrent_cell_Class = "col-xs-12 col-sm-3" ;
      edtComposicio_Jsonclick = "" ;
      edtComposicio_Enabled = 0 ;
      edtAlbRTartD_Jsonclick = "" ;
      edtAlbRTartD_Enabled = 0 ;
      imgprompt_6263_Visible = 1 ;
      imgprompt_6263_Link = "" ;
      edtAlbRTartC_Jsonclick = "" ;
      edtAlbRTartC_Enabled = 1 ;
      edtAlbRefDsc_Jsonclick = "" ;
      edtAlbRefDsc_Enabled = 1 ;
      edtAlbRef_Jsonclick = "" ;
      edtAlbRef_Enabled = 1 ;
      edtAlbRef_Visible = 1 ;
      Combo_albref_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_albref_Cls = "ExtendedCombo AttributeFL" ;
      Combo_albref_Caption = "" ;
      Combo_albref_Enabled = GXutil.toBoolean( -1) ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 1 ;
      edtCliCod_Visible = 1 ;
      Combo_clicod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_clicod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_clicod_Enabled = GXutil.toBoolean( -1) ;
      edtAlbrUsu_Jsonclick = "" ;
      edtAlbrUsu_Enabled = 0 ;
      edtAlbrHor_Jsonclick = "" ;
      edtAlbrHor_Enabled = 1 ;
      edtAlbRFen_Jsonclick = "" ;
      edtAlbRFen_Enabled = 1 ;
      imgAlert_Visible = 1 ;
      divTableintegracion_pontway_Visible = 1 ;
      edtavUsurcod_Jsonclick = "" ;
      edtavUsurcod_Enabled = 0 ;
      edtAlbRecCod_Jsonclick = "" ;
      edtAlbRecCod_Enabled = 1 ;
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

   public void gx5asacomposicio1S17( String A396EmprCod ,
                                     int A252CliCod ,
                                     String A45AlbRef )
   {
      GXt_char1 = A13981Composicio ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int11[0] = A252CliCod ;
      GXv_char3[0] = A45AlbRef ;
      GXv_char2[0] = GXt_char1 ;
      new app.almacensindetalle.composicion(remoteHandle, context).execute( GXv_char4, GXv_int11, GXv_char3, GXv_char2) ;
      almacentejido_impl.this.A396EmprCod = GXv_char4[0] ;
      almacentejido_impl.this.A252CliCod = GXv_int11[0] ;
      almacentejido_impl.this.A45AlbRef = GXv_char3[0] ;
      almacentejido_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
      A13981Composicio = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13981Composicio", A13981Composicio);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13981Composicio))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxasa103581S17( String AV8EmprCod )
   {
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( httpContext.getMessage( "MODA21", ""), ""), GXv_int9) ;
      almacentejido_impl.this.GXt_int8 = GXv_int9[0] ;
      edtAlbTurno_Visible = ((GXt_int8==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbTurno_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTurno_Visible), 5, 0), true);
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

   public void xc_93_1S17( String Gx_mode ,
                           String A396EmprCod ,
                           int A44AlbRecCod ,
                           String A45AlbRef )
   {
      if ( isIns( )  && (0==A44AlbRecCod) && true /* Level */ && true /* After */ )
      {
         GXv_int11[0] = A44AlbRecCod ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, "020100", GXv_int11) ;
         A44AlbRecCod = GXv_int11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_94_1S17( String Gx_mode ,
                           String A396EmprCod ,
                           int A252CliCod ,
                           String A45AlbRef )
   {
      if ( isDsp( )  )
      {
         GXv_char4[0] = A3613AlbRefDsc ;
         GXv_int13[0] = A6263AlbRTartC ;
         GXv_char3[0] = A6264AlbRTartD ;
         GXv_int12[0] = AV91ExisteReferencia ;
         new app.almacensindetalle.datosreferencia(remoteHandle, context).execute( A396EmprCod, A252CliCod, A45AlbRef, GXv_char4, GXv_int13, GXv_char3, GXv_int12) ;
         A3613AlbRefDsc = GXv_char4[0] ;
         A6263AlbRTartC = GXv_int13[0] ;
         A6264AlbRTartD = GXv_char3[0] ;
         AV91ExisteReferencia = GXv_int12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
         httpContext.ajax_rsp_assign_attri("", false, "A6263AlbRTartC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6263AlbRTartC), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A6264AlbRTartD", A6264AlbRTartD);
         httpContext.ajax_rsp_assign_attri("", false, "AV91ExisteReferencia", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV91ExisteReferencia), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3613AlbRefDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6263AlbRTartC, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6264AlbRTartD))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV91ExisteReferencia, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxnrgridlevel_observacion_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_347191( ) ;
      while ( nGXsfl_347_idx <= nRC_GXsfl_347 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1S1191( ) ;
         standaloneModal1S1191( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1S1191( ) ;
         nGXsfl_347_idx = (int)(nGXsfl_347_idx+1) ;
         sGXsfl_347_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_347_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_347191( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_observacionContainer)) ;
      /* End function gxnrGridlevel_observacion_newrow */
   }

   public void init_web_controls( )
   {
      cmbAlbRTam.setName( "ALBRTAM" );
      cmbAlbRTam.setWebtags( "" );
      cmbAlbRTam.addItem("", httpContext.getMessage( "GX_EmptyItemText", ""), (short)(0));
      cmbAlbRTam.addItem("F", httpContext.getMessage( "Fechado", ""), (short)(0));
      cmbAlbRTam.addItem("A", httpContext.getMessage( "Aberto", ""), (short)(0));
      if ( cmbAlbRTam.getItemCount() > 0 )
      {
         A4601AlbRTam = cmbAlbRTam.getValidValue(A4601AlbRTam) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4601AlbRTam", A4601AlbRTam);
      }
      cmbAlbRUni.setName( "ALBRUNI" );
      cmbAlbRUni.setWebtags( "" );
      cmbAlbRUni.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
      cmbAlbRUni.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      }
      cmbAlbREst.setName( "ALBREST" );
      cmbAlbREst.setWebtags( "" );
      cmbAlbREst.addItem("0", httpContext.getMessage( "Abierta", ""), (short)(0));
      cmbAlbREst.addItem("1", httpContext.getMessage( "Cerrada", ""), (short)(0));
      if ( cmbAlbREst.getItemCount() > 0 )
      {
         if ( isIns( ) && (0==A47AlbREst) )
         {
            A47AlbREst = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         }
      }
      cmbAlbRReo.setName( "ALBRREO" );
      cmbAlbRReo.setWebtags( "" );
      cmbAlbRReo.addItem("NO", httpContext.getMessage( "NO", ""), (short)(0));
      cmbAlbRReo.addItem("SI", httpContext.getMessage( "SI", ""), (short)(0));
      if ( cmbAlbRReo.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A55AlbRReo)==0) )
         {
            A55AlbRReo = httpContext.getMessage( "NO", "") ;
            httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
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

   public void valid_Albreccod( )
   {
      n44AlbRecCod = false ;
      if ( isIns( )  && ( ! (0==A44AlbRecCod) ) && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "N Recepcion Inexistente", ""), 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Emprcod( )
   {
      n407EmprNom = false ;
      /* Using cursor T01S129 */
      pr_default.execute(27, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01S129_A407EmprNom[0] ;
      n407EmprNom = T01S129_n407EmprNom[0] ;
      pr_default.close(27);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Clicod( )
   {
      /* Using cursor T01S130 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(28) == 101) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe Cliente", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A279CliNom = T01S130_A279CliNom[0] ;
      A8723CliEst = T01S130_A8723CliEst[0] ;
      pr_default.close(28);
      if ( ( AV25Moda21 == 1 ) && ( AV26Cli350 == 1 ) && ( AV27ContVal == 1 ) && true /* After */ && ( A252CliCod == 350 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente INEXISTENTE ¡¡¡", ""), 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      if ( (0==A252CliCod) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente NO valido, Cliente igual a 0", ""), 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A8723CliEst", GXutil.rtrim( A8723CliEst));
   }

   public void valid_Albref( )
   {
      n13982AlbRArtLu = false ;
      n6263AlbRTartC = false ;
      n6264AlbRTartD = false ;
      /* Using cursor T01S131 */
      pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A45AlbRef});
      if ( (pr_default.getStatus(29) != 101) )
      {
         A13982AlbRArtLu = T01S131_A13982AlbRArtLu[0] ;
         n13982AlbRArtLu = T01S131_n13982AlbRArtLu[0] ;
      }
      else
      {
         A13982AlbRArtLu = DecimalUtil.doubleToDec(0) ;
         n13982AlbRArtLu = false ;
      }
      pr_default.close(29);
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A6465AlbRLu)==0) && ( Gx_BScreen == 0 ) )
      {
         A6465AlbRLu = DecimalUtil.doubleToDec(0) ;
      }
      else
      {
         if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A6465AlbRLu)==0) && ( Gx_BScreen == 0 ) )
         {
            A6465AlbRLu = A13982AlbRArtLu ;
         }
      }
      GXt_char1 = A13981Composicio ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int11[0] = A252CliCod ;
      GXv_char3[0] = A45AlbRef ;
      GXv_char2[0] = GXt_char1 ;
      new app.almacensindetalle.composicion(remoteHandle, context).execute( GXv_char4, GXv_int11, GXv_char3, GXv_char2) ;
      almacentejido_impl.this.A396EmprCod = GXv_char4[0] ;
      almacentejido_impl.this.A252CliCod = GXv_int11[0] ;
      almacentejido_impl.this.A45AlbRef = GXv_char3[0] ;
      almacentejido_impl.this.GXt_char1 = GXv_char2[0] ;
      A13981Composicio = GXt_char1 ;
      if ( isDsp( )  )
      {
         GXv_char4[0] = A3613AlbRefDsc ;
         GXv_int13[0] = A6263AlbRTartC ;
         GXv_char3[0] = A6264AlbRTartD ;
         GXv_int12[0] = AV91ExisteReferencia ;
         new app.almacensindetalle.datosreferencia(remoteHandle, context).execute( A396EmprCod, A252CliCod, A45AlbRef, GXv_char4, GXv_int13, GXv_char3, GXv_int12) ;
         almacentejido_impl.this.A3613AlbRefDsc = GXv_char4[0] ;
         A3613AlbRefDsc = this.A3613AlbRefDsc ;
         almacentejido_impl.this.A6263AlbRTartC = GXv_int13[0] ;
         A6263AlbRTartC = this.A6263AlbRTartC ;
         almacentejido_impl.this.A6264AlbRTartD = GXv_char3[0] ;
         A6264AlbRTartD = this.A6264AlbRTartD ;
         almacentejido_impl.this.AV91ExisteReferencia = GXv_int12[0] ;
         AV91ExisteReferencia = this.AV91ExisteReferencia ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13982AlbRArtLu", GXutil.ltrim( localUtil.ntoc( A13982AlbRArtLu, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6465AlbRLu", GXutil.ltrim( localUtil.ntoc( A6465AlbRLu, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13981Composicio", GXutil.rtrim( A13981Composicio));
      httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", GXutil.rtrim( A3613AlbRefDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A6263AlbRTartC", GXutil.ltrim( localUtil.ntoc( A6263AlbRTartC, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6264AlbRTartD", GXutil.rtrim( A6264AlbRTartD));
      httpContext.ajax_rsp_assign_attri("", false, "AV91ExisteReferencia", GXutil.ltrim( localUtil.ntoc( AV91ExisteReferencia, (byte)(4), (byte)(0), ".", "")));
   }

   public void valid_Albrtartc( )
   {
      n6263AlbRTartC = false ;
      n6264AlbRTartD = false ;
      /* Using cursor T01S132 */
      pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n6263AlbRTartC), Short.valueOf(A6263AlbRTartC)});
      if ( (pr_default.getStatus(30) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A6263AlbRTartC) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tipo de Articulo", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRTARTC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A6264AlbRTartD = T01S132_A6264AlbRTartD[0] ;
      n6264AlbRTartD = T01S132_n6264AlbRTartD[0] ;
      pr_default.close(30);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A6264AlbRTartD", GXutil.rtrim( A6264AlbRTartD));
   }

   public void valid_Trncod( )
   {
      n840TrnCod = false ;
      n841TrnNom = false ;
      /* Using cursor T01S133 */
      pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(31) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A841TrnNom = T01S133_A841TrnNom[0] ;
      n841TrnNom = T01S133_n841TrnNom[0] ;
      pr_default.close(31);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", GXutil.rtrim( A841TrnNom));
   }

   public void valid_Procecod( )
   {
      n970ProceCod = false ;
      n971ProceNom = false ;
      /* Using cursor T01S134 */
      pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
      if ( (pr_default.getStatus(32) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A970ProceCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCED", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCECOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A971ProceNom = T01S134_A971ProceNom[0] ;
      n971ProceNom = T01S134_n971ProceNom[0] ;
      pr_default.close(32);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", GXutil.rtrim( A971ProceNom));
   }

   public void valid_Tipentcod( )
   {
      n1211TipEntCod = false ;
      n1212TipEntNom = false ;
      /* Using cursor T01S135 */
      pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod)});
      if ( (pr_default.getStatus(33) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A1211TipEntCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENTRAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPENTCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A1212TipEntNom = T01S135_A1212TipEntNom[0] ;
      n1212TipEntNom = T01S135_n1212TipEntNom[0] ;
      pr_default.close(33);
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV81Insert_CliCod) )
      {
         edtCliCod_Enabled = 0 ;
      }
      else
      {
         if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
         {
            edtCliCod_Enabled = 0 ;
         }
         else
         {
            edtCliCod_Enabled = 1 ;
         }
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV85Insert_TipEntCod) )
      {
         edtTipEntCod_Enabled = 0 ;
      }
      else
      {
         if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
         {
            edtTipEntCod_Enabled = 0 ;
         }
         else
         {
            edtTipEntCod_Enabled = 1 ;
         }
      }
      if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
      {
         edtAlbRLoc_Enabled = 0 ;
      }
      else
      {
         edtAlbRLoc_Enabled = 1 ;
      }
      if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
      {
         edtAlbRef_Enabled = 0 ;
      }
      else
      {
         edtAlbRef_Enabled = 1 ;
      }
      if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
      {
         edtAlbRFen_Enabled = 0 ;
      }
      else
      {
         edtAlbRFen_Enabled = 1 ;
      }
      if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
      {
         cmbAlbRUni.setEnabled( 0 );
      }
      else
      {
         cmbAlbRUni.setEnabled( 1 );
      }
      if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
      {
         cmbAlbRReo.setEnabled( 0 );
      }
      else
      {
         cmbAlbRReo.setEnabled( 1 );
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", GXutil.rtrim( A1212TipEntNom));
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtTipEntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipEntCod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLoc_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRFen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFen_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRUni.getEnabled(), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRReo.getEnabled(), 5, 0), true);
   }

   public void valid_Albrpieent( )
   {
      if ( isIns( )  && (0==A6181AlbrPieC) && ( Gx_BScreen == 0 ) )
      {
         A6181AlbrPieC = A52AlbRPieEnt ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A6181AlbrPieC", GXutil.ltrim( localUtil.ntoc( A6181AlbrPieC, (byte)(6), (byte)(0), ".", "")));
   }

   public void valid_Albrunient( )
   {
      if ( A4290AlbPmPPza.doubleValue() > 0 )
      {
         A4291AlbPzaEst = (int)(DecimalUtil.decToDouble(GXutil.roundDecimal( A58AlbRUniEnt.divide(A4290AlbPmPPza, 18, java.math.RoundingMode.DOWN), 0))) ;
      }
      else
      {
         A4291AlbPzaEst = 0 ;
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A6180AlbrUniC)==0) && ( Gx_BScreen == 0 ) )
      {
         A6180AlbrUniC = A58AlbRUniEnt ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4291AlbPzaEst", GXutil.ltrim( localUtil.ntoc( A4291AlbPzaEst, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6180AlbrUniC", GXutil.ltrim( localUtil.ntoc( A6180AlbrUniC, (byte)(9), (byte)(2), ".", "")));
   }

   public void valid_Albruniuti( )
   {
      A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValue())) ;
      cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
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
      if ( isIns( )  && (0==A47AlbREst) && ( Gx_BScreen == 0 ) )
      {
         A47AlbREst = (byte)(0) ;
         cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
      }
      else
      {
         if ( A57AlbRUniDis.doubleValue() == 0 )
         {
            A47AlbREst = (byte)(1) ;
            cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
         }
         else
         {
            if ( A57AlbRUniDis.doubleValue() != 0 )
            {
               A47AlbREst = (byte)(0) ;
               cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
            }
         }
      }
      if ( A47AlbREst == 1 )
      {
         AV72AlbCum = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
      }
      else
      {
         if ( A47AlbREst == 0 )
         {
            AV72AlbCum = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         }
      }
      dynload_actions( ) ;
      if ( cmbAlbREst.getItemCount() > 0 )
      {
         A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValidValue(GXutil.trim( GXutil.str( A47AlbREst, 1, 0))))) ;
         cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", "")));
      cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Values", cmbAlbREst.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "AV72AlbCum", GXutil.rtrim( AV72AlbCum));
   }

   public void valid_Almcod( )
   {
      n4792AlmCod = false ;
      n4793AlmNom = false ;
      /* Using cursor T01S136 */
      pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n4792AlmCod), Byte.valueOf(A4792AlmCod)});
      if ( (pr_default.getStatus(34) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A4792AlmCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Almacen", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALMCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A4793AlmNom = T01S136_A4793AlmNom[0] ;
      n4793AlmNom = T01S136_n4793AlmNom[0] ;
      pr_default.close(34);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4793AlmNom", GXutil.rtrim( A4793AlmNom));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV8EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV77AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV79TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV77AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A48AlbRFecUlt',fld:'ALBRFECULT',pic:''},{av:'AV110Pgmname',fld:'vPGMNAME',pic:''},{av:'A9749Emp_Item1',fld:'EMP_ITEM1',pic:''},{av:'A53AlbRPieReb',fld:'ALBRPIEREB',pic:'ZZZ9'},{av:'A59AlbRUniReb',fld:'ALBRUNIREB',pic:'ZZZZZ9.99'},{av:'A1222AlbNumEti',fld:'ALBNUMETI',pic:'ZZZ9'},{av:'A5743AlbRPre',fld:'ALBRPRE',pic:'ZZZZZ9.99'},{av:'A5744AlbRAju',fld:'ALBRAJU',pic:'ZZZZ9.99'},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'},{av:'A6178AlbrUsu',fld:'ALBRUSU',pic:''},{av:'A6182AlbrNF',fld:'ALBRNF',pic:'@!'},{av:'A6183AlbrFeNf',fld:'ALBRFENF',pic:''},{av:'A6184AlbrCfop',fld:'ALBRCFOP',pic:''},{av:'A3360AlbRImp',fld:'ALBRIMP',pic:'@!'},{av:'A6471AlbRUniB',fld:'ALBRUNIB',pic:'ZZZZZ9.99'},{av:'A6488AlbDocPrv',fld:'ALBDOCPRV',pic:''},{av:'A6523AlbRUdas',fld:'ALBRUDAS',pic:'ZZZZZ9.99'},{av:'A8023AlbColor',fld:'ALBCOLOR',pic:''},{av:'A8024AlbOpsT',fld:'ALBOPST',pic:''},{av:'A8025AlbOpsC',fld:'ALBOPSC',pic:''},{av:'A8026AlbOC',fld:'ALBOC',pic:''},{av:'A8027AlbHdri',fld:'ALBHDRI',pic:''},{av:'A8029AlbNumM',fld:'ALBNUMM',pic:''},{av:'A8030AlbAncC',fld:'ALBANCC',pic:'Z9.99'},{av:'A8031AlbDndC',fld:'ALBDNDC',pic:'ZZZ9'},{av:'A8032AlbAncCr',fld:'ALBANCCR',pic:'Z9.99'},{av:'A8033AlbDndCr',fld:'ALBDNDCR',pic:'ZZZ9'},{av:'A8036AlbDmt',fld:'ALBDMT',pic:'ZZ9'},{av:'A8034AlbGalga',fld:'ALBGALGA',pic:'ZZ9'},{av:'A9793AlbPdaC',fld:'ALBPDAC',pic:''},{av:'A9794AlbOStj',fld:'ALBOSTJ',pic:''},{av:'A317AlbStLot',fld:'ALBSTLOT',pic:'9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e141S12',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A49AlbRFen',fld:'ALBRFEN',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV79TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("COMBO_ALBREF.ONOPTIONCLICKED","{handler:'e131S12',iparms:[{av:'Combo_albref_Selectedvalue_get',ctrl:'COMBO_ALBREF',prop:'SelectedValue_get'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'}]");
      setEventMetadata("COMBO_ALBREF.ONOPTIONCLICKED",",oparms:[{av:'AV102ComboAlbRef',fld:'vCOMBOALBREF',pic:''},{av:'AV91ExisteReferencia',fld:'vEXISTEREFERENCIA',pic:'ZZZ9'},{av:'A6264AlbRTartD',fld:'ALBRTARTD',pic:''},{av:'A6263AlbRTartC',fld:'ALBRTARTC',pic:'ZZZ9'},{av:'A3613AlbRefDsc',fld:'ALBREFDSC',pic:''}]}");
      setEventMetadata("COMBO_CLICOD.ONOPTIONCLICKED","{handler:'e121S12',iparms:[{av:'Combo_clicod_Selectedvalue_get',ctrl:'COMBO_CLICOD',prop:'SelectedValue_get'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV8EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV77AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("COMBO_CLICOD.ONOPTIONCLICKED",",oparms:[{av:'AV69ComboCliCod',fld:'vCOMBOCLICOD',pic:'ZZZZZ9'},{av:'AV101AlbRef_Data',fld:'vALBREF_DATA',pic:''},{av:'Combo_albref_Selectedvalue_set',ctrl:'COMBO_ALBREF',prop:'SelectedValue_set'},{av:'AV102ComboAlbRef',fld:'vCOMBOALBREF',pic:''},{av:'Combo_albref_Enabled',ctrl:'COMBO_ALBREF',prop:'Enabled'}]}");
      setEventMetadata("TABLEINTEGRACION_PONTWAY.CLICK","{handler:'e151S12',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("TABLEINTEGRACION_PONTWAY.CLICK",",oparms:[]}");
      setEventMetadata("VALID_ALBRECCOD","{handler:'valid_Albreccod',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VALID_ALBRECCOD",",oparms:[]}");
      setEventMetadata("VALIDV_USURCOD","{handler:'validv_Usurcod',iparms:[]");
      setEventMetadata("VALIDV_USURCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A8723CliEst',fld:'CLIEST',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A8723CliEst',fld:'CLIEST',pic:''}]}");
      setEventMetadata("VALID_ALBREF","{handler:'valid_Albref',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A13982AlbRArtLu',fld:'ALBRARTLU',pic:'ZZ9.99'},{av:'A6465AlbRLu',fld:'ALBRLU',pic:'ZZ9.99'},{av:'A13981Composicio',fld:'COMPOSICIO',pic:''},{av:'A3613AlbRefDsc',fld:'ALBREFDSC',pic:''},{av:'A6263AlbRTartC',fld:'ALBRTARTC',pic:'ZZZ9'},{av:'A6264AlbRTartD',fld:'ALBRTARTD',pic:''},{av:'AV91ExisteReferencia',fld:'vEXISTEREFERENCIA',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ALBREF",",oparms:[{av:'A13982AlbRArtLu',fld:'ALBRARTLU',pic:'ZZ9.99'},{av:'A6465AlbRLu',fld:'ALBRLU',pic:'ZZ9.99'},{av:'A13981Composicio',fld:'COMPOSICIO',pic:''},{av:'A3613AlbRefDsc',fld:'ALBREFDSC',pic:''},{av:'A6263AlbRTartC',fld:'ALBRTARTC',pic:'ZZZ9'},{av:'A6264AlbRTartD',fld:'ALBRTARTD',pic:''},{av:'AV91ExisteReferencia',fld:'vEXISTEREFERENCIA',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ALBRTARTC","{handler:'valid_Albrtartc',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6263AlbRTartC',fld:'ALBRTARTC',pic:'ZZZ9'},{av:'A6264AlbRTartD',fld:'ALBRTARTD',pic:''}]");
      setEventMetadata("VALID_ALBRTARTC",",oparms:[{av:'A6264AlbRTartD',fld:'ALBRTARTD',pic:''}]}");
      setEventMetadata("VALID_ALBRENT2","{handler:'valid_Albrent2',iparms:[]");
      setEventMetadata("VALID_ALBRENT2",",oparms:[]}");
      setEventMetadata("VALID_TRNCOD","{handler:'valid_Trncod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A841TrnNom',fld:'TRNNOM',pic:''}]");
      setEventMetadata("VALID_TRNCOD",",oparms:[{av:'A841TrnNom',fld:'TRNNOM',pic:''}]}");
      setEventMetadata("VALID_PROCECOD","{handler:'valid_Procecod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'A971ProceNom',fld:'PROCENOM',pic:''}]");
      setEventMetadata("VALID_PROCECOD",",oparms:[{av:'A971ProceNom',fld:'PROCENOM',pic:''}]}");
      setEventMetadata("VALID_ALBRLOTE","{handler:'valid_Albrlote',iparms:[]");
      setEventMetadata("VALID_ALBRLOTE",",oparms:[]}");
      setEventMetadata("VALID_ALBRMDLCOD","{handler:'valid_Albrmdlcod',iparms:[]");
      setEventMetadata("VALID_ALBRMDLCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBRLU","{handler:'valid_Albrlu',iparms:[]");
      setEventMetadata("VALID_ALBRLU",",oparms:[]}");
      setEventMetadata("VALID_ALBRTELAR","{handler:'valid_Albrtelar',iparms:[]");
      setEventMetadata("VALID_ALBRTELAR",",oparms:[]}");
      setEventMetadata("VALID_ALBMAQTEJ","{handler:'valid_Albmaqtej',iparms:[]");
      setEventMetadata("VALID_ALBMAQTEJ",",oparms:[]}");
      setEventMetadata("VALID_ALBRTARA","{handler:'valid_Albrtara',iparms:[]");
      setEventMetadata("VALID_ALBRTARA",",oparms:[]}");
      setEventMetadata("VALID_TIPENTCOD","{handler:'valid_Tipentcod',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'},{av:'AV81Insert_CliCod',fld:'vINSERT_CLICOD',pic:'ZZZZZ9'},{av:'AV85Insert_TipEntCod',fld:'vINSERT_TIPENTCOD',pic:'ZZZ9'},{av:'A1212TipEntNom',fld:'TIPENTNOM',pic:''}]");
      setEventMetadata("VALID_TIPENTCOD",",oparms:[{av:'A1212TipEntNom',fld:'TIPENTNOM',pic:''},{av:'edtCliCod_Enabled',ctrl:'CLICOD',prop:'Enabled'},{av:'edtTipEntCod_Enabled',ctrl:'TIPENTCOD',prop:'Enabled'},{av:'edtAlbRLoc_Enabled',ctrl:'ALBRLOC',prop:'Enabled'},{av:'edtAlbRef_Enabled',ctrl:'ALBREF',prop:'Enabled'},{av:'edtAlbRFen_Enabled',ctrl:'ALBRFEN',prop:'Enabled'},{av:'cmbAlbRUni'},{av:'cmbAlbRReo'}]}");
      setEventMetadata("VALID_ALBRPIEENT","{handler:'valid_Albrpieent',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A6181AlbrPieC',fld:'ALBRPIEC',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_ALBRPIEENT",",oparms:[{av:'A6181AlbrPieC',fld:'ALBRPIEC',pic:'ZZZZZ9'}]}");
      setEventMetadata("VALID_ALBPMPPZA","{handler:'valid_Albpmppza',iparms:[]");
      setEventMetadata("VALID_ALBPMPPZA",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNIENT","{handler:'valid_Albrunient',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A4290AlbPmPPza',fld:'ALBPMPPZA',pic:'Z9.999'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A4291AlbPzaEst',fld:'ALBPZAEST',pic:'ZZZZZZZ9'},{av:'A6180AlbrUniC',fld:'ALBRUNIC',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VALID_ALBRUNIENT",",oparms:[{av:'A4291AlbPzaEst',fld:'ALBPZAEST',pic:'ZZZZZZZ9'},{av:'A6180AlbrUniC',fld:'ALBRUNIC',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("VALID_ALBRUNI","{handler:'valid_Albruni',iparms:[]");
      setEventMetadata("VALID_ALBRUNI",",oparms:[]}");
      setEventMetadata("VALID_ALBRPIEUTI","{handler:'valid_Albrpieuti',iparms:[]");
      setEventMetadata("VALID_ALBRPIEUTI",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNIUTI","{handler:'valid_Albruniuti',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A57AlbRUniDis',fld:'ALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'cmbAlbREst'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'AV72AlbCum',fld:'vALBCUM',pic:''}]");
      setEventMetadata("VALID_ALBRUNIUTI",",oparms:[{av:'A57AlbRUniDis',fld:'ALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'cmbAlbREst'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'AV72AlbCum',fld:'vALBCUM',pic:''}]}");
      setEventMetadata("VALID_ALBRUNIDIS","{handler:'valid_Albrunidis',iparms:[]");
      setEventMetadata("VALID_ALBRUNIDIS",",oparms:[]}");
      setEventMetadata("VALID_ALBREST","{handler:'valid_Albrest',iparms:[]");
      setEventMetadata("VALID_ALBREST",",oparms:[]}");
      setEventMetadata("VALID_ALMCOD","{handler:'valid_Almcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4792AlmCod',fld:'ALMCOD',pic:'9'},{av:'A4793AlmNom',fld:'ALMNOM',pic:''}]");
      setEventMetadata("VALID_ALMCOD",",oparms:[{av:'A4793AlmNom',fld:'ALMNOM',pic:''}]}");
      setEventMetadata("VALID_ALBRREO","{handler:'valid_Albrreo',iparms:[]");
      setEventMetadata("VALID_ALBRREO",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOCLICOD","{handler:'validv_Comboclicod',iparms:[]");
      setEventMetadata("VALIDV_COMBOCLICOD",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOALBREF","{handler:'validv_Comboalbref',iparms:[]");
      setEventMetadata("VALIDV_COMBOALBREF",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOTRNCOD","{handler:'validv_Combotrncod',iparms:[]");
      setEventMetadata("VALIDV_COMBOTRNCOD",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOPROCECOD","{handler:'validv_Comboprocecod',iparms:[]");
      setEventMetadata("VALIDV_COMBOPROCECOD",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOTIPENTCOD","{handler:'validv_Combotipentcod',iparms:[]");
      setEventMetadata("VALIDV_COMBOTIPENTCOD",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOALMCOD","{handler:'validv_Comboalmcod',iparms:[]");
      setEventMetadata("VALIDV_COMBOALMCOD",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]}");
      setEventMetadata("VALID_ALBRLIN","{handler:'valid_Albrlin',iparms:[]");
      setEventMetadata("VALID_ALBRLIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Albrobs',iparms:[]");
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
      pr_default.close(28);
      pr_default.close(27);
      pr_default.close(30);
      pr_default.close(31);
      pr_default.close(32);
      pr_default.close(33);
      pr_default.close(34);
      pr_default.close(29);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV8EmprCod = "" ;
      Z396EmprCod = "" ;
      Z45AlbRef = "" ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
      Z46AlbREnt = "" ;
      Z5806AlbREnt2 = "" ;
      Z56AlbRUni = "" ;
      Z12879AlbOEKOTEX = "" ;
      Z3613AlbRefDsc = "" ;
      Z49AlbRFen = GXutil.nullDate() ;
      Z6179AlbrHor = GXutil.resetTime( GXutil.nullDate() );
      Z4601AlbRTam = "" ;
      Z9749Emp_Item1 = "" ;
      Z1291AlbRDes = "" ;
      Z6463AlbRLote = "" ;
      Z14525AlbRLot2 = "" ;
      Z6464AlbRTelar = "" ;
      Z6465AlbRLu = DecimalUtil.ZERO ;
      Z6470AlbRTara = DecimalUtil.ZERO ;
      Z4602AlbRMdlCod = "" ;
      Z8035AlbMaqTej = "" ;
      Z8028AlbNumB = "" ;
      Z60AlbRUniUti = DecimalUtil.ZERO ;
      Z6180AlbrUniC = DecimalUtil.ZERO ;
      Z50AlbRLoc = "" ;
      Z55AlbRReo = "" ;
      Z59AlbRUniReb = DecimalUtil.ZERO ;
      Z48AlbRFecUlt = GXutil.nullDate() ;
      Z4290AlbPmPPza = DecimalUtil.ZERO ;
      Z5743AlbRPre = DecimalUtil.ZERO ;
      Z5744AlbRAju = DecimalUtil.ZERO ;
      Z6178AlbrUsu = "" ;
      Z6182AlbrNF = "" ;
      Z6183AlbrFeNf = GXutil.nullDate() ;
      Z6184AlbrCfop = "" ;
      Z3359AlbRDisCli = "" ;
      Z3360AlbRImp = "" ;
      Z6471AlbRUniB = DecimalUtil.ZERO ;
      Z6488AlbDocPrv = "" ;
      Z6523AlbRUdas = DecimalUtil.ZERO ;
      Z8023AlbColor = "" ;
      Z8024AlbOpsT = "" ;
      Z8025AlbOpsC = "" ;
      Z8026AlbOC = "" ;
      Z8027AlbHdri = "" ;
      Z8029AlbNumM = "" ;
      Z8030AlbAncC = DecimalUtil.ZERO ;
      Z8032AlbAncCr = DecimalUtil.ZERO ;
      Z9793AlbPdaC = "" ;
      Z9794AlbOStj = "" ;
      N50AlbRLoc = "" ;
      N45AlbRef = "" ;
      N49AlbRFen = GXutil.nullDate() ;
      N56AlbRUni = "" ;
      N55AlbRReo = "" ;
      Combo_almcod_Selectedvalue_get = "" ;
      Combo_tipentcod_Selectedvalue_get = "" ;
      Combo_procecod_Selectedvalue_get = "" ;
      Combo_trncod_Selectedvalue_get = "" ;
      Combo_albref_Selectedvalue_get = "" ;
      Combo_clicod_Selectedvalue_get = "" ;
      Z1300AlbRObs = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      A396EmprCod = "" ;
      A45AlbRef = "" ;
      AV8EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A4601AlbRTam = "" ;
      A56AlbRUni = "" ;
      A55AlbRReo = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV7UsurCod = "" ;
      imgAlert_gximage = "" ;
      sImgUrl = "" ;
      lblAlert_text_Jsonclick = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A6179AlbrHor = GXutil.resetTime( GXutil.nullDate() );
      A6178AlbrUsu = "" ;
      lblTextblockclicod_Jsonclick = "" ;
      ucCombo_clicod = new com.genexus.webpanels.GXUserControl();
      Combo_clicod_Caption = "" ;
      AV94CliCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      lblTextblockalbref_Jsonclick = "" ;
      ucCombo_albref = new com.genexus.webpanels.GXUserControl();
      AV103DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV101AlbRef_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A3613AlbRefDsc = "" ;
      lblTextblock1_Jsonclick = "" ;
      imgprompt_6263_gximage = "" ;
      lblTextblock2desc_Jsonclick = "" ;
      A6264AlbRTartD = "" ;
      A13981Composicio = "" ;
      A46AlbREnt = "" ;
      A5806AlbREnt2 = "" ;
      A3359AlbRDisCli = "" ;
      A8028AlbNumB = "" ;
      lblTextblocktrncod_Jsonclick = "" ;
      ucCombo_trncod = new com.genexus.webpanels.GXUserControl();
      Combo_trncod_Caption = "" ;
      AV95TrnCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      lblTextblockprocecod_Jsonclick = "" ;
      ucCombo_procecod = new com.genexus.webpanels.GXUserControl();
      Combo_procecod_Caption = "" ;
      AV96ProceCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      ucDvpanel_unnamedtable7 = new com.genexus.webpanels.GXUserControl();
      A14525AlbRLot2 = "" ;
      A6463AlbRLote = "" ;
      A4602AlbRMdlCod = "" ;
      A6465AlbRLu = DecimalUtil.ZERO ;
      A6464AlbRTelar = "" ;
      A8035AlbMaqTej = "" ;
      A6470AlbRTara = DecimalUtil.ZERO ;
      lblTextblocktipentcod_Jsonclick = "" ;
      ucCombo_tipentcod = new com.genexus.webpanels.GXUserControl();
      AV98TipEntCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A1291AlbRDes = "" ;
      ucDvpanel_unnamedtable9 = new com.genexus.webpanels.GXUserControl();
      A4290AlbPmPPza = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A6180AlbrUniC = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      A48AlbRFecUlt = GXutil.nullDate() ;
      lblTextblockalmcod_Jsonclick = "" ;
      ucCombo_almcod = new com.genexus.webpanels.GXUserControl();
      Combo_almcod_Caption = "" ;
      AV104AlmCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A50AlbRLoc = "" ;
      ucDvpanel_unnamedtable11 = new com.genexus.webpanels.GXUserControl();
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV110Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      AV102ComboAlbRef = "" ;
      Gridlevel_observacionContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode191 = "" ;
      sStyleString = "" ;
      A12879AlbOEKOTEX = "" ;
      A9749Emp_Item1 = "" ;
      A59AlbRUniReb = DecimalUtil.ZERO ;
      A5743AlbRPre = DecimalUtil.ZERO ;
      A5744AlbRAju = DecimalUtil.ZERO ;
      A6182AlbrNF = "" ;
      A6183AlbrFeNf = GXutil.nullDate() ;
      A6184AlbrCfop = "" ;
      A3360AlbRImp = "" ;
      A6471AlbRUniB = DecimalUtil.ZERO ;
      A6488AlbDocPrv = "" ;
      A6523AlbRUdas = DecimalUtil.ZERO ;
      A8023AlbColor = "" ;
      A8024AlbOpsT = "" ;
      A8025AlbOpsC = "" ;
      A8026AlbOC = "" ;
      A8027AlbHdri = "" ;
      A8029AlbNumM = "" ;
      A8030AlbAncC = DecimalUtil.ZERO ;
      A8032AlbAncCr = DecimalUtil.ZERO ;
      A9793AlbPdaC = "" ;
      A9794AlbOStj = "" ;
      AV72AlbCum = "" ;
      A13982AlbRArtLu = DecimalUtil.ZERO ;
      A8723CliEst = "" ;
      A407EmprNom = "" ;
      A279CliNom = "" ;
      A841TrnNom = "" ;
      A971ProceNom = "" ;
      A1212TipEntNom = "" ;
      A4793AlmNom = "" ;
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
      Combo_albref_Objectcall = "" ;
      Combo_albref_Class = "" ;
      Combo_albref_Icontype = "" ;
      Combo_albref_Icon = "" ;
      Combo_albref_Tooltip = "" ;
      Combo_albref_Selectedvalue_set = "" ;
      Combo_albref_Selectedtext_set = "" ;
      Combo_albref_Selectedtext_get = "" ;
      Combo_albref_Gamoauthtoken = "" ;
      Combo_albref_Ddointernalname = "" ;
      Combo_albref_Titlecontrolalign = "" ;
      Combo_albref_Dropdownoptionstype = "" ;
      Combo_albref_Titlecontrolidtoreplace = "" ;
      Combo_albref_Datalisttype = "" ;
      Combo_albref_Datalistfixedvalues = "" ;
      Combo_albref_Datalistproc = "" ;
      Combo_albref_Datalistprocparametersprefix = "" ;
      Combo_albref_Remoteservicesparameters = "" ;
      Combo_albref_Htmltemplate = "" ;
      Combo_albref_Multiplevaluestype = "" ;
      Combo_albref_Loadingdata = "" ;
      Combo_albref_Noresultsfound = "" ;
      Combo_albref_Emptyitemtext = "" ;
      Combo_albref_Onlyselectedvalues = "" ;
      Combo_albref_Selectalltext = "" ;
      Combo_albref_Multiplevaluesseparator = "" ;
      Combo_albref_Addnewoptiontext = "" ;
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
      Combo_trncod_Emptyitemtext = "" ;
      Combo_trncod_Onlyselectedvalues = "" ;
      Combo_trncod_Selectalltext = "" ;
      Combo_trncod_Multiplevaluesseparator = "" ;
      Combo_trncod_Addnewoptiontext = "" ;
      Combo_procecod_Objectcall = "" ;
      Combo_procecod_Class = "" ;
      Combo_procecod_Icontype = "" ;
      Combo_procecod_Icon = "" ;
      Combo_procecod_Tooltip = "" ;
      Combo_procecod_Selectedvalue_set = "" ;
      Combo_procecod_Selectedtext_set = "" ;
      Combo_procecod_Selectedtext_get = "" ;
      Combo_procecod_Gamoauthtoken = "" ;
      Combo_procecod_Ddointernalname = "" ;
      Combo_procecod_Titlecontrolalign = "" ;
      Combo_procecod_Dropdownoptionstype = "" ;
      Combo_procecod_Titlecontrolidtoreplace = "" ;
      Combo_procecod_Datalisttype = "" ;
      Combo_procecod_Datalistfixedvalues = "" ;
      Combo_procecod_Datalistproc = "" ;
      Combo_procecod_Datalistprocparametersprefix = "" ;
      Combo_procecod_Remoteservicesparameters = "" ;
      Combo_procecod_Htmltemplate = "" ;
      Combo_procecod_Multiplevaluestype = "" ;
      Combo_procecod_Loadingdata = "" ;
      Combo_procecod_Noresultsfound = "" ;
      Combo_procecod_Emptyitemtext = "" ;
      Combo_procecod_Onlyselectedvalues = "" ;
      Combo_procecod_Selectalltext = "" ;
      Combo_procecod_Multiplevaluesseparator = "" ;
      Combo_procecod_Addnewoptiontext = "" ;
      Dvpanel_unnamedtable7_Objectcall = "" ;
      Dvpanel_unnamedtable7_Class = "" ;
      Dvpanel_unnamedtable7_Height = "" ;
      Combo_tipentcod_Objectcall = "" ;
      Combo_tipentcod_Class = "" ;
      Combo_tipentcod_Icontype = "" ;
      Combo_tipentcod_Icon = "" ;
      Combo_tipentcod_Tooltip = "" ;
      Combo_tipentcod_Selectedvalue_set = "" ;
      Combo_tipentcod_Selectedtext_set = "" ;
      Combo_tipentcod_Selectedtext_get = "" ;
      Combo_tipentcod_Gamoauthtoken = "" ;
      Combo_tipentcod_Ddointernalname = "" ;
      Combo_tipentcod_Titlecontrolalign = "" ;
      Combo_tipentcod_Dropdownoptionstype = "" ;
      Combo_tipentcod_Titlecontrolidtoreplace = "" ;
      Combo_tipentcod_Datalisttype = "" ;
      Combo_tipentcod_Datalistfixedvalues = "" ;
      Combo_tipentcod_Datalistproc = "" ;
      Combo_tipentcod_Datalistprocparametersprefix = "" ;
      Combo_tipentcod_Remoteservicesparameters = "" ;
      Combo_tipentcod_Htmltemplate = "" ;
      Combo_tipentcod_Multiplevaluestype = "" ;
      Combo_tipentcod_Loadingdata = "" ;
      Combo_tipentcod_Noresultsfound = "" ;
      Combo_tipentcod_Emptyitemtext = "" ;
      Combo_tipentcod_Onlyselectedvalues = "" ;
      Combo_tipentcod_Selectalltext = "" ;
      Combo_tipentcod_Multiplevaluesseparator = "" ;
      Combo_tipentcod_Addnewoptiontext = "" ;
      Dvpanel_unnamedtable9_Objectcall = "" ;
      Dvpanel_unnamedtable9_Class = "" ;
      Dvpanel_unnamedtable9_Height = "" ;
      Combo_almcod_Objectcall = "" ;
      Combo_almcod_Class = "" ;
      Combo_almcod_Icontype = "" ;
      Combo_almcod_Icon = "" ;
      Combo_almcod_Tooltip = "" ;
      Combo_almcod_Selectedvalue_set = "" ;
      Combo_almcod_Selectedtext_set = "" ;
      Combo_almcod_Selectedtext_get = "" ;
      Combo_almcod_Gamoauthtoken = "" ;
      Combo_almcod_Ddointernalname = "" ;
      Combo_almcod_Titlecontrolalign = "" ;
      Combo_almcod_Dropdownoptionstype = "" ;
      Combo_almcod_Titlecontrolidtoreplace = "" ;
      Combo_almcod_Datalisttype = "" ;
      Combo_almcod_Datalistfixedvalues = "" ;
      Combo_almcod_Datalistproc = "" ;
      Combo_almcod_Datalistprocparametersprefix = "" ;
      Combo_almcod_Remoteservicesparameters = "" ;
      Combo_almcod_Htmltemplate = "" ;
      Combo_almcod_Multiplevaluestype = "" ;
      Combo_almcod_Loadingdata = "" ;
      Combo_almcod_Noresultsfound = "" ;
      Combo_almcod_Emptyitemtext = "" ;
      Combo_almcod_Onlyselectedvalues = "" ;
      Combo_almcod_Selectalltext = "" ;
      Combo_almcod_Multiplevaluesseparator = "" ;
      Combo_almcod_Addnewoptiontext = "" ;
      Dvpanel_unnamedtable11_Objectcall = "" ;
      Dvpanel_unnamedtable11_Class = "" ;
      Dvpanel_unnamedtable11_Height = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode7 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A1300AlbRObs = "" ;
      AV9Station = "" ;
      AV10EmprNom = "" ;
      AV78WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV80WebSession = httpContext.getWebSession();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV79TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV87TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV93ComboSelectedValue = "" ;
      GXt_objcol_SdtDVB_SDTComboData_Item14 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTComboData_Item15 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      Z8723CliEst = "" ;
      Z13982AlbRArtLu = DecimalUtil.ZERO ;
      Z6264AlbRTartD = "" ;
      Z841TrnNom = "" ;
      Z971ProceNom = "" ;
      Z1212TipEntNom = "" ;
      Z4793AlmNom = "" ;
      T01S16_A407EmprNom = new String[] {""} ;
      T01S16_n407EmprNom = new boolean[] {false} ;
      T01S18_A6264AlbRTartD = new String[] {""} ;
      T01S18_n6264AlbRTartD = new boolean[] {false} ;
      T01S17_A279CliNom = new String[] {""} ;
      T01S17_A8723CliEst = new String[] {""} ;
      T01S113_A13982AlbRArtLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S113_n13982AlbRArtLu = new boolean[] {false} ;
      T01S19_A841TrnNom = new String[] {""} ;
      T01S19_n841TrnNom = new boolean[] {false} ;
      T01S110_A971ProceNom = new String[] {""} ;
      T01S110_n971ProceNom = new boolean[] {false} ;
      T01S111_A1212TipEntNom = new String[] {""} ;
      T01S111_n1212TipEntNom = new boolean[] {false} ;
      T01S112_A4793AlmNom = new String[] {""} ;
      T01S112_n4793AlmNom = new boolean[] {false} ;
      T01S114_A65ArtCod = new String[] {""} ;
      T01S114_A44AlbRecCod = new int[1] ;
      T01S114_n44AlbRecCod = new boolean[] {false} ;
      T01S114_A45AlbRef = new String[] {""} ;
      T01S114_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S114_A46AlbREnt = new String[] {""} ;
      T01S114_A5806AlbREnt2 = new String[] {""} ;
      T01S114_A56AlbRUni = new String[] {""} ;
      T01S114_A47AlbREst = new byte[1] ;
      T01S114_A12879AlbOEKOTEX = new String[] {""} ;
      T01S114_A3613AlbRefDsc = new String[] {""} ;
      T01S114_A6264AlbRTartD = new String[] {""} ;
      T01S114_n6264AlbRTartD = new boolean[] {false} ;
      T01S114_A407EmprNom = new String[] {""} ;
      T01S114_n407EmprNom = new boolean[] {false} ;
      T01S114_A279CliNom = new String[] {""} ;
      T01S114_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      T01S114_A6179AlbrHor = new java.util.Date[] {GXutil.nullDate()} ;
      T01S114_A4601AlbRTam = new String[] {""} ;
      T01S114_A9749Emp_Item1 = new String[] {""} ;
      T01S114_A841TrnNom = new String[] {""} ;
      T01S114_n841TrnNom = new boolean[] {false} ;
      T01S114_A1291AlbRDes = new String[] {""} ;
      T01S114_A971ProceNom = new String[] {""} ;
      T01S114_n971ProceNom = new boolean[] {false} ;
      T01S114_A6463AlbRLote = new String[] {""} ;
      T01S114_A14525AlbRLot2 = new String[] {""} ;
      T01S114_A6464AlbRTelar = new String[] {""} ;
      T01S114_A6465AlbRLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S114_A6470AlbRTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S114_A4602AlbRMdlCod = new String[] {""} ;
      T01S114_A8035AlbMaqTej = new String[] {""} ;
      T01S114_A8028AlbNumB = new String[] {""} ;
      T01S114_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S114_A52AlbRPieEnt = new int[1] ;
      T01S114_A54AlbRPieUti = new int[1] ;
      T01S114_A6180AlbrUniC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S114_A6181AlbrPieC = new int[1] ;
      T01S114_A50AlbRLoc = new String[] {""} ;
      T01S114_A55AlbRReo = new String[] {""} ;
      T01S114_A53AlbRPieReb = new int[1] ;
      T01S114_A59AlbRUniReb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S114_A48AlbRFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      T01S114_A1212TipEntNom = new String[] {""} ;
      T01S114_n1212TipEntNom = new boolean[] {false} ;
      T01S114_A1222AlbNumEti = new short[1] ;
      T01S114_A1301AlbRUlin = new byte[1] ;
      T01S114_A4290AlbPmPPza = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S114_A4920AlbRGrm2 = new short[1] ;
      T01S114_A4921AlbRAnc = new short[1] ;
      T01S114_A4922AlbPml = new short[1] ;
      T01S114_A5743AlbRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S114_A5744AlbRAju = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S114_A5745AlbRRep = new byte[1] ;
      T01S114_A6178AlbrUsu = new String[] {""} ;
      T01S114_A6182AlbrNF = new String[] {""} ;
      T01S114_A6183AlbrFeNf = new java.util.Date[] {GXutil.nullDate()} ;
      T01S114_A6184AlbrCfop = new String[] {""} ;
      T01S114_A3359AlbRDisCli = new String[] {""} ;
      T01S114_A3360AlbRImp = new String[] {""} ;
      T01S114_A6471AlbRUniB = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S114_A6488AlbDocPrv = new String[] {""} ;
      T01S114_A6523AlbRUdas = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S114_A4793AlmNom = new String[] {""} ;
      T01S114_n4793AlmNom = new boolean[] {false} ;
      T01S114_A8023AlbColor = new String[] {""} ;
      T01S114_A8024AlbOpsT = new String[] {""} ;
      T01S114_A8025AlbOpsC = new String[] {""} ;
      T01S114_A8026AlbOC = new String[] {""} ;
      T01S114_A8027AlbHdri = new String[] {""} ;
      T01S114_A8029AlbNumM = new String[] {""} ;
      T01S114_A8030AlbAncC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S114_A8031AlbDndC = new short[1] ;
      T01S114_A8032AlbAncCr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S114_A8033AlbDndCr = new short[1] ;
      T01S114_A8036AlbDmt = new short[1] ;
      T01S114_A8034AlbGalga = new short[1] ;
      T01S114_A9793AlbPdaC = new String[] {""} ;
      T01S114_A9794AlbOStj = new String[] {""} ;
      T01S114_A317AlbStLot = new byte[1] ;
      T01S114_A10358AlbTurno = new byte[1] ;
      T01S114_A8723CliEst = new String[] {""} ;
      T01S114_A396EmprCod = new String[] {""} ;
      T01S114_A252CliCod = new int[1] ;
      T01S114_A6263AlbRTartC = new short[1] ;
      T01S114_n6263AlbRTartC = new boolean[] {false} ;
      T01S114_A840TrnCod = new short[1] ;
      T01S114_n840TrnCod = new boolean[] {false} ;
      T01S114_A970ProceCod = new short[1] ;
      T01S114_n970ProceCod = new boolean[] {false} ;
      T01S114_A1211TipEntCod = new short[1] ;
      T01S114_n1211TipEntCod = new boolean[] {false} ;
      T01S114_A4792AlmCod = new byte[1] ;
      T01S114_n4792AlmCod = new boolean[] {false} ;
      T01S114_A13982AlbRArtLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S114_n13982AlbRArtLu = new boolean[] {false} ;
      T01S115_A407EmprNom = new String[] {""} ;
      T01S115_n407EmprNom = new boolean[] {false} ;
      T01S116_A279CliNom = new String[] {""} ;
      T01S116_A8723CliEst = new String[] {""} ;
      T01S117_A6264AlbRTartD = new String[] {""} ;
      T01S117_n6264AlbRTartD = new boolean[] {false} ;
      T01S118_A841TrnNom = new String[] {""} ;
      T01S118_n841TrnNom = new boolean[] {false} ;
      T01S119_A971ProceNom = new String[] {""} ;
      T01S119_n971ProceNom = new boolean[] {false} ;
      T01S120_A1212TipEntNom = new String[] {""} ;
      T01S120_n1212TipEntNom = new boolean[] {false} ;
      T01S121_A4793AlmNom = new String[] {""} ;
      T01S121_n4793AlmNom = new boolean[] {false} ;
      T01S122_A13982AlbRArtLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S122_n13982AlbRArtLu = new boolean[] {false} ;
      T01S123_A396EmprCod = new String[] {""} ;
      T01S123_A44AlbRecCod = new int[1] ;
      T01S123_n44AlbRecCod = new boolean[] {false} ;
      T01S15_A44AlbRecCod = new int[1] ;
      T01S15_n44AlbRecCod = new boolean[] {false} ;
      T01S15_A45AlbRef = new String[] {""} ;
      T01S15_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S15_A46AlbREnt = new String[] {""} ;
      T01S15_A5806AlbREnt2 = new String[] {""} ;
      T01S15_A56AlbRUni = new String[] {""} ;
      T01S15_A47AlbREst = new byte[1] ;
      T01S15_A12879AlbOEKOTEX = new String[] {""} ;
      T01S15_A3613AlbRefDsc = new String[] {""} ;
      T01S15_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      T01S15_A6179AlbrHor = new java.util.Date[] {GXutil.nullDate()} ;
      T01S15_A4601AlbRTam = new String[] {""} ;
      T01S15_A9749Emp_Item1 = new String[] {""} ;
      T01S15_A1291AlbRDes = new String[] {""} ;
      T01S15_A6463AlbRLote = new String[] {""} ;
      T01S15_A14525AlbRLot2 = new String[] {""} ;
      T01S15_A6464AlbRTelar = new String[] {""} ;
      T01S15_A6465AlbRLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S15_A6470AlbRTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S15_A4602AlbRMdlCod = new String[] {""} ;
      T01S15_A8035AlbMaqTej = new String[] {""} ;
      T01S15_A8028AlbNumB = new String[] {""} ;
      T01S15_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S15_A52AlbRPieEnt = new int[1] ;
      T01S15_A54AlbRPieUti = new int[1] ;
      T01S15_A6180AlbrUniC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S15_A6181AlbrPieC = new int[1] ;
      T01S15_A50AlbRLoc = new String[] {""} ;
      T01S15_A55AlbRReo = new String[] {""} ;
      T01S15_A53AlbRPieReb = new int[1] ;
      T01S15_A59AlbRUniReb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S15_A48AlbRFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      T01S15_A1222AlbNumEti = new short[1] ;
      T01S15_A1301AlbRUlin = new byte[1] ;
      T01S15_A4290AlbPmPPza = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S15_A4920AlbRGrm2 = new short[1] ;
      T01S15_A4921AlbRAnc = new short[1] ;
      T01S15_A4922AlbPml = new short[1] ;
      T01S15_A5743AlbRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S15_A5744AlbRAju = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S15_A5745AlbRRep = new byte[1] ;
      T01S15_A6178AlbrUsu = new String[] {""} ;
      T01S15_A6182AlbrNF = new String[] {""} ;
      T01S15_A6183AlbrFeNf = new java.util.Date[] {GXutil.nullDate()} ;
      T01S15_A6184AlbrCfop = new String[] {""} ;
      T01S15_A3359AlbRDisCli = new String[] {""} ;
      T01S15_A3360AlbRImp = new String[] {""} ;
      T01S15_A6471AlbRUniB = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S15_A6488AlbDocPrv = new String[] {""} ;
      T01S15_A6523AlbRUdas = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S15_A8023AlbColor = new String[] {""} ;
      T01S15_A8024AlbOpsT = new String[] {""} ;
      T01S15_A8025AlbOpsC = new String[] {""} ;
      T01S15_A8026AlbOC = new String[] {""} ;
      T01S15_A8027AlbHdri = new String[] {""} ;
      T01S15_A8029AlbNumM = new String[] {""} ;
      T01S15_A8030AlbAncC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S15_A8031AlbDndC = new short[1] ;
      T01S15_A8032AlbAncCr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S15_A8033AlbDndCr = new short[1] ;
      T01S15_A8036AlbDmt = new short[1] ;
      T01S15_A8034AlbGalga = new short[1] ;
      T01S15_A9793AlbPdaC = new String[] {""} ;
      T01S15_A9794AlbOStj = new String[] {""} ;
      T01S15_A317AlbStLot = new byte[1] ;
      T01S15_A10358AlbTurno = new byte[1] ;
      T01S15_A396EmprCod = new String[] {""} ;
      T01S15_A252CliCod = new int[1] ;
      T01S15_A6263AlbRTartC = new short[1] ;
      T01S15_n6263AlbRTartC = new boolean[] {false} ;
      T01S15_A840TrnCod = new short[1] ;
      T01S15_n840TrnCod = new boolean[] {false} ;
      T01S15_A970ProceCod = new short[1] ;
      T01S15_n970ProceCod = new boolean[] {false} ;
      T01S15_A1211TipEntCod = new short[1] ;
      T01S15_n1211TipEntCod = new boolean[] {false} ;
      T01S15_A4792AlmCod = new byte[1] ;
      T01S15_n4792AlmCod = new boolean[] {false} ;
      T01S124_A396EmprCod = new String[] {""} ;
      T01S124_A44AlbRecCod = new int[1] ;
      T01S124_n44AlbRecCod = new boolean[] {false} ;
      T01S125_A396EmprCod = new String[] {""} ;
      T01S125_A44AlbRecCod = new int[1] ;
      T01S125_n44AlbRecCod = new boolean[] {false} ;
      T01S14_A44AlbRecCod = new int[1] ;
      T01S14_n44AlbRecCod = new boolean[] {false} ;
      T01S14_A45AlbRef = new String[] {""} ;
      T01S14_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S14_A46AlbREnt = new String[] {""} ;
      T01S14_A5806AlbREnt2 = new String[] {""} ;
      T01S14_A56AlbRUni = new String[] {""} ;
      T01S14_A47AlbREst = new byte[1] ;
      T01S14_A12879AlbOEKOTEX = new String[] {""} ;
      T01S14_A3613AlbRefDsc = new String[] {""} ;
      T01S14_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      T01S14_A6179AlbrHor = new java.util.Date[] {GXutil.nullDate()} ;
      T01S14_A4601AlbRTam = new String[] {""} ;
      T01S14_A9749Emp_Item1 = new String[] {""} ;
      T01S14_A1291AlbRDes = new String[] {""} ;
      T01S14_A6463AlbRLote = new String[] {""} ;
      T01S14_A14525AlbRLot2 = new String[] {""} ;
      T01S14_A6464AlbRTelar = new String[] {""} ;
      T01S14_A6465AlbRLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S14_A6470AlbRTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S14_A4602AlbRMdlCod = new String[] {""} ;
      T01S14_A8035AlbMaqTej = new String[] {""} ;
      T01S14_A8028AlbNumB = new String[] {""} ;
      T01S14_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S14_A52AlbRPieEnt = new int[1] ;
      T01S14_A54AlbRPieUti = new int[1] ;
      T01S14_A6180AlbrUniC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S14_A6181AlbrPieC = new int[1] ;
      T01S14_A50AlbRLoc = new String[] {""} ;
      T01S14_A55AlbRReo = new String[] {""} ;
      T01S14_A53AlbRPieReb = new int[1] ;
      T01S14_A59AlbRUniReb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S14_A48AlbRFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      T01S14_A1222AlbNumEti = new short[1] ;
      T01S14_A1301AlbRUlin = new byte[1] ;
      T01S14_A4290AlbPmPPza = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S14_A4920AlbRGrm2 = new short[1] ;
      T01S14_A4921AlbRAnc = new short[1] ;
      T01S14_A4922AlbPml = new short[1] ;
      T01S14_A5743AlbRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S14_A5744AlbRAju = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S14_A5745AlbRRep = new byte[1] ;
      T01S14_A6178AlbrUsu = new String[] {""} ;
      T01S14_A6182AlbrNF = new String[] {""} ;
      T01S14_A6183AlbrFeNf = new java.util.Date[] {GXutil.nullDate()} ;
      T01S14_A6184AlbrCfop = new String[] {""} ;
      T01S14_A3359AlbRDisCli = new String[] {""} ;
      T01S14_A3360AlbRImp = new String[] {""} ;
      T01S14_A6471AlbRUniB = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S14_A6488AlbDocPrv = new String[] {""} ;
      T01S14_A6523AlbRUdas = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S14_A8023AlbColor = new String[] {""} ;
      T01S14_A8024AlbOpsT = new String[] {""} ;
      T01S14_A8025AlbOpsC = new String[] {""} ;
      T01S14_A8026AlbOC = new String[] {""} ;
      T01S14_A8027AlbHdri = new String[] {""} ;
      T01S14_A8029AlbNumM = new String[] {""} ;
      T01S14_A8030AlbAncC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S14_A8031AlbDndC = new short[1] ;
      T01S14_A8032AlbAncCr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S14_A8033AlbDndCr = new short[1] ;
      T01S14_A8036AlbDmt = new short[1] ;
      T01S14_A8034AlbGalga = new short[1] ;
      T01S14_A9793AlbPdaC = new String[] {""} ;
      T01S14_A9794AlbOStj = new String[] {""} ;
      T01S14_A317AlbStLot = new byte[1] ;
      T01S14_A10358AlbTurno = new byte[1] ;
      T01S14_A396EmprCod = new String[] {""} ;
      T01S14_A252CliCod = new int[1] ;
      T01S14_A6263AlbRTartC = new short[1] ;
      T01S14_n6263AlbRTartC = new boolean[] {false} ;
      T01S14_A840TrnCod = new short[1] ;
      T01S14_n840TrnCod = new boolean[] {false} ;
      T01S14_A970ProceCod = new short[1] ;
      T01S14_n970ProceCod = new boolean[] {false} ;
      T01S14_A1211TipEntCod = new short[1] ;
      T01S14_n1211TipEntCod = new boolean[] {false} ;
      T01S14_A4792AlmCod = new byte[1] ;
      T01S14_n4792AlmCod = new boolean[] {false} ;
      T01S129_A407EmprNom = new String[] {""} ;
      T01S129_n407EmprNom = new boolean[] {false} ;
      T01S130_A279CliNom = new String[] {""} ;
      T01S130_A8723CliEst = new String[] {""} ;
      T01S131_A13982AlbRArtLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S131_n13982AlbRArtLu = new boolean[] {false} ;
      T01S132_A6264AlbRTartD = new String[] {""} ;
      T01S132_n6264AlbRTartD = new boolean[] {false} ;
      T01S133_A841TrnNom = new String[] {""} ;
      T01S133_n841TrnNom = new boolean[] {false} ;
      T01S134_A971ProceNom = new String[] {""} ;
      T01S134_n971ProceNom = new boolean[] {false} ;
      T01S135_A1212TipEntNom = new String[] {""} ;
      T01S135_n1212TipEntNom = new boolean[] {false} ;
      T01S136_A4793AlmNom = new String[] {""} ;
      T01S136_n4793AlmNom = new boolean[] {false} ;
      T01S137_A396EmprCod = new String[] {""} ;
      T01S137_A13026PedDGId = new int[1] ;
      T01S137_A44AlbRecCod = new int[1] ;
      T01S137_n44AlbRecCod = new boolean[] {false} ;
      T01S138_A396EmprCod = new String[] {""} ;
      T01S138_A11669DevCruId = new int[1] ;
      T01S138_A44AlbRecCod = new int[1] ;
      T01S138_n44AlbRecCod = new boolean[] {false} ;
      T01S139_A396EmprCod = new String[] {""} ;
      T01S139_A44AlbRecCod = new int[1] ;
      T01S139_n44AlbRecCod = new boolean[] {false} ;
      T01S139_A9743Emp_CUb = new String[] {""} ;
      T01S139_A5860Emp_Anp = new short[1] ;
      T01S140_A396EmprCod = new String[] {""} ;
      T01S140_A44AlbRecCod = new int[1] ;
      T01S140_n44AlbRecCod = new boolean[] {false} ;
      T01S140_A7130MatC_Pz = new String[] {""} ;
      T01S141_A396EmprCod = new String[] {""} ;
      T01S141_A44AlbRecCod = new int[1] ;
      T01S141_n44AlbRecCod = new boolean[] {false} ;
      T01S141_A7132MatC_Talla = new String[] {""} ;
      T01S142_A396EmprCod = new String[] {""} ;
      T01S142_A44AlbRecCod = new int[1] ;
      T01S142_n44AlbRecCod = new boolean[] {false} ;
      T01S142_A7115MatC_Lin = new short[1] ;
      T01S143_A396EmprCod = new String[] {""} ;
      T01S143_A30AlbProCod = new long[1] ;
      T01S143_A129BarCod = new int[1] ;
      T01S143_A132BarCodReo = new byte[1] ;
      T01S143_A130BarCodPar = new String[] {""} ;
      T01S143_A6622AlbHdRLn = new short[1] ;
      T01S144_A396EmprCod = new String[] {""} ;
      T01S144_A6235DevEmpCod = new int[1] ;
      T01S144_A6243DevNumLin = new byte[1] ;
      T01S145_A396EmprCod = new String[] {""} ;
      T01S145_A44AlbRecCod = new int[1] ;
      T01S145_n44AlbRecCod = new boolean[] {false} ;
      T01S145_A4596AlbRDefCod = new short[1] ;
      T01S146_A396EmprCod = new String[] {""} ;
      T01S146_A44AlbRecCod = new int[1] ;
      T01S146_n44AlbRecCod = new boolean[] {false} ;
      T01S146_A2159AlbRecPie = new String[] {""} ;
      T01S147_A396EmprCod = new String[] {""} ;
      T01S147_A44AlbRecCod = new int[1] ;
      T01S147_n44AlbRecCod = new boolean[] {false} ;
      T01S147_A2165HisEmpLin = new short[1] ;
      T01S148_A396EmprCod = new String[] {""} ;
      T01S148_A361DisCod = new int[1] ;
      T01S148_A44AlbRecCod = new int[1] ;
      T01S148_n44AlbRecCod = new boolean[] {false} ;
      T01S149_A396EmprCod = new String[] {""} ;
      T01S149_A323DevGenCod = new int[1] ;
      T01S150_A396EmprCod = new String[] {""} ;
      T01S150_A129BarCod = new int[1] ;
      T01S150_A132BarCodReo = new byte[1] ;
      T01S150_A130BarCodPar = new String[] {""} ;
      T01S150_A200BarPieCod = new String[] {""} ;
      T01S152_A396EmprCod = new String[] {""} ;
      T01S152_A44AlbRecCod = new int[1] ;
      T01S152_n44AlbRecCod = new boolean[] {false} ;
      T01S153_A44AlbRecCod = new int[1] ;
      T01S153_n44AlbRecCod = new boolean[] {false} ;
      T01S153_A1299AlbRLin = new byte[1] ;
      T01S153_A1300AlbRObs = new String[] {""} ;
      T01S153_A396EmprCod = new String[] {""} ;
      T01S154_A396EmprCod = new String[] {""} ;
      T01S154_A44AlbRecCod = new int[1] ;
      T01S154_n44AlbRecCod = new boolean[] {false} ;
      T01S154_A1299AlbRLin = new byte[1] ;
      T01S13_A44AlbRecCod = new int[1] ;
      T01S13_n44AlbRecCod = new boolean[] {false} ;
      T01S13_A1299AlbRLin = new byte[1] ;
      T01S13_A1300AlbRObs = new String[] {""} ;
      T01S13_A396EmprCod = new String[] {""} ;
      T01S12_A44AlbRecCod = new int[1] ;
      T01S12_n44AlbRecCod = new boolean[] {false} ;
      T01S12_A1299AlbRLin = new byte[1] ;
      T01S12_A1300AlbRObs = new String[] {""} ;
      T01S12_A396EmprCod = new String[] {""} ;
      T01S158_A396EmprCod = new String[] {""} ;
      T01S158_A44AlbRecCod = new int[1] ;
      T01S158_n44AlbRecCod = new boolean[] {false} ;
      T01S158_A1299AlbRLin = new byte[1] ;
      Gridlevel_observacionRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_observacion_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i49AlbRFen = GXutil.nullDate() ;
      i6183AlbrFeNf = GXutil.nullDate() ;
      i55AlbRReo = "" ;
      i48AlbRFecUlt = GXutil.nullDate() ;
      i6182AlbrNF = "" ;
      i6179AlbrHor = GXutil.resetTime( GXutil.nullDate() );
      i6178AlbrUsu = "" ;
      i3360AlbRImp = "" ;
      i4602AlbRMdlCod = "" ;
      i6463AlbRLote = "" ;
      i6464AlbRTelar = "" ;
      i6470AlbRTara = DecimalUtil.ZERO ;
      i6471AlbRUniB = DecimalUtil.ZERO ;
      i6523AlbRUdas = DecimalUtil.ZERO ;
      Gridlevel_observacionColumn = new com.genexus.webpanels.GXWebColumn();
      GXv_int9 = new byte[1] ;
      GXt_char1 = "" ;
      GXv_int11 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int13 = new short[1] ;
      GXv_char3 = new String[1] ;
      GXv_int12 = new short[1] ;
      Z13981Composicio = "" ;
      Z57AlbRUniDis = DecimalUtil.ZERO ;
      ZV72AlbCum = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.almacentejido__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.almacentejido__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.almacentejido__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.almacentejido__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.almacentejido__default(),
         new Object[] {
             new Object[] {
            T01S12_A44AlbRecCod, T01S12_A1299AlbRLin, T01S12_A1300AlbRObs, T01S12_A396EmprCod
            }
            , new Object[] {
            T01S13_A44AlbRecCod, T01S13_A1299AlbRLin, T01S13_A1300AlbRObs, T01S13_A396EmprCod
            }
            , new Object[] {
            T01S14_A44AlbRecCod, T01S14_A45AlbRef, T01S14_A58AlbRUniEnt, T01S14_A46AlbREnt, T01S14_A5806AlbREnt2, T01S14_A56AlbRUni, T01S14_A47AlbREst, T01S14_A12879AlbOEKOTEX, T01S14_A3613AlbRefDsc, T01S14_A49AlbRFen,
            T01S14_A6179AlbrHor, T01S14_A4601AlbRTam, T01S14_A9749Emp_Item1, T01S14_A1291AlbRDes, T01S14_A6463AlbRLote, T01S14_A14525AlbRLot2, T01S14_A6464AlbRTelar, T01S14_A6465AlbRLu, T01S14_A6470AlbRTara, T01S14_A4602AlbRMdlCod,
            T01S14_A8035AlbMaqTej, T01S14_A8028AlbNumB, T01S14_A60AlbRUniUti, T01S14_A52AlbRPieEnt, T01S14_A54AlbRPieUti, T01S14_A6180AlbrUniC, T01S14_A6181AlbrPieC, T01S14_A50AlbRLoc, T01S14_A55AlbRReo, T01S14_A53AlbRPieReb,
            T01S14_A59AlbRUniReb, T01S14_A48AlbRFecUlt, T01S14_A1222AlbNumEti, T01S14_A1301AlbRUlin, T01S14_A4290AlbPmPPza, T01S14_A4920AlbRGrm2, T01S14_A4921AlbRAnc, T01S14_A4922AlbPml, T01S14_A5743AlbRPre, T01S14_A5744AlbRAju,
            T01S14_A5745AlbRRep, T01S14_A6178AlbrUsu, T01S14_A6182AlbrNF, T01S14_A6183AlbrFeNf, T01S14_A6184AlbrCfop, T01S14_A3359AlbRDisCli, T01S14_A3360AlbRImp, T01S14_A6471AlbRUniB, T01S14_A6488AlbDocPrv, T01S14_A6523AlbRUdas,
            T01S14_A8023AlbColor, T01S14_A8024AlbOpsT, T01S14_A8025AlbOpsC, T01S14_A8026AlbOC, T01S14_A8027AlbHdri, T01S14_A8029AlbNumM, T01S14_A8030AlbAncC, T01S14_A8031AlbDndC, T01S14_A8032AlbAncCr, T01S14_A8033AlbDndCr,
            T01S14_A8036AlbDmt, T01S14_A8034AlbGalga, T01S14_A9793AlbPdaC, T01S14_A9794AlbOStj, T01S14_A317AlbStLot, T01S14_A10358AlbTurno, T01S14_A396EmprCod, T01S14_A252CliCod, T01S14_A6263AlbRTartC, T01S14_n6263AlbRTartC,
            T01S14_A840TrnCod, T01S14_n840TrnCod, T01S14_A970ProceCod, T01S14_n970ProceCod, T01S14_A1211TipEntCod, T01S14_n1211TipEntCod, T01S14_A4792AlmCod, T01S14_n4792AlmCod
            }
            , new Object[] {
            T01S15_A44AlbRecCod, T01S15_A45AlbRef, T01S15_A58AlbRUniEnt, T01S15_A46AlbREnt, T01S15_A5806AlbREnt2, T01S15_A56AlbRUni, T01S15_A47AlbREst, T01S15_A12879AlbOEKOTEX, T01S15_A3613AlbRefDsc, T01S15_A49AlbRFen,
            T01S15_A6179AlbrHor, T01S15_A4601AlbRTam, T01S15_A9749Emp_Item1, T01S15_A1291AlbRDes, T01S15_A6463AlbRLote, T01S15_A14525AlbRLot2, T01S15_A6464AlbRTelar, T01S15_A6465AlbRLu, T01S15_A6470AlbRTara, T01S15_A4602AlbRMdlCod,
            T01S15_A8035AlbMaqTej, T01S15_A8028AlbNumB, T01S15_A60AlbRUniUti, T01S15_A52AlbRPieEnt, T01S15_A54AlbRPieUti, T01S15_A6180AlbrUniC, T01S15_A6181AlbrPieC, T01S15_A50AlbRLoc, T01S15_A55AlbRReo, T01S15_A53AlbRPieReb,
            T01S15_A59AlbRUniReb, T01S15_A48AlbRFecUlt, T01S15_A1222AlbNumEti, T01S15_A1301AlbRUlin, T01S15_A4290AlbPmPPza, T01S15_A4920AlbRGrm2, T01S15_A4921AlbRAnc, T01S15_A4922AlbPml, T01S15_A5743AlbRPre, T01S15_A5744AlbRAju,
            T01S15_A5745AlbRRep, T01S15_A6178AlbrUsu, T01S15_A6182AlbrNF, T01S15_A6183AlbrFeNf, T01S15_A6184AlbrCfop, T01S15_A3359AlbRDisCli, T01S15_A3360AlbRImp, T01S15_A6471AlbRUniB, T01S15_A6488AlbDocPrv, T01S15_A6523AlbRUdas,
            T01S15_A8023AlbColor, T01S15_A8024AlbOpsT, T01S15_A8025AlbOpsC, T01S15_A8026AlbOC, T01S15_A8027AlbHdri, T01S15_A8029AlbNumM, T01S15_A8030AlbAncC, T01S15_A8031AlbDndC, T01S15_A8032AlbAncCr, T01S15_A8033AlbDndCr,
            T01S15_A8036AlbDmt, T01S15_A8034AlbGalga, T01S15_A9793AlbPdaC, T01S15_A9794AlbOStj, T01S15_A317AlbStLot, T01S15_A10358AlbTurno, T01S15_A396EmprCod, T01S15_A252CliCod, T01S15_A6263AlbRTartC, T01S15_n6263AlbRTartC,
            T01S15_A840TrnCod, T01S15_n840TrnCod, T01S15_A970ProceCod, T01S15_n970ProceCod, T01S15_A1211TipEntCod, T01S15_n1211TipEntCod, T01S15_A4792AlmCod, T01S15_n4792AlmCod
            }
            , new Object[] {
            T01S16_A407EmprNom, T01S16_n407EmprNom
            }
            , new Object[] {
            T01S17_A279CliNom, T01S17_A8723CliEst
            }
            , new Object[] {
            T01S18_A6264AlbRTartD, T01S18_n6264AlbRTartD
            }
            , new Object[] {
            T01S19_A841TrnNom, T01S19_n841TrnNom
            }
            , new Object[] {
            T01S110_A971ProceNom, T01S110_n971ProceNom
            }
            , new Object[] {
            T01S111_A1212TipEntNom, T01S111_n1212TipEntNom
            }
            , new Object[] {
            T01S112_A4793AlmNom, T01S112_n4793AlmNom
            }
            , new Object[] {
            T01S113_A13982AlbRArtLu, T01S113_n13982AlbRArtLu
            }
            , new Object[] {
            T01S114_A65ArtCod, T01S114_A44AlbRecCod, T01S114_A45AlbRef, T01S114_A58AlbRUniEnt, T01S114_A46AlbREnt, T01S114_A5806AlbREnt2, T01S114_A56AlbRUni, T01S114_A47AlbREst, T01S114_A12879AlbOEKOTEX, T01S114_A3613AlbRefDsc,
            T01S114_A6264AlbRTartD, T01S114_n6264AlbRTartD, T01S114_A407EmprNom, T01S114_n407EmprNom, T01S114_A279CliNom, T01S114_A49AlbRFen, T01S114_A6179AlbrHor, T01S114_A4601AlbRTam, T01S114_A9749Emp_Item1, T01S114_A841TrnNom,
            T01S114_n841TrnNom, T01S114_A1291AlbRDes, T01S114_A971ProceNom, T01S114_n971ProceNom, T01S114_A6463AlbRLote, T01S114_A14525AlbRLot2, T01S114_A6464AlbRTelar, T01S114_A6465AlbRLu, T01S114_A6470AlbRTara, T01S114_A4602AlbRMdlCod,
            T01S114_A8035AlbMaqTej, T01S114_A8028AlbNumB, T01S114_A60AlbRUniUti, T01S114_A52AlbRPieEnt, T01S114_A54AlbRPieUti, T01S114_A6180AlbrUniC, T01S114_A6181AlbrPieC, T01S114_A50AlbRLoc, T01S114_A55AlbRReo, T01S114_A53AlbRPieReb,
            T01S114_A59AlbRUniReb, T01S114_A48AlbRFecUlt, T01S114_A1212TipEntNom, T01S114_n1212TipEntNom, T01S114_A1222AlbNumEti, T01S114_A1301AlbRUlin, T01S114_A4290AlbPmPPza, T01S114_A4920AlbRGrm2, T01S114_A4921AlbRAnc, T01S114_A4922AlbPml,
            T01S114_A5743AlbRPre, T01S114_A5744AlbRAju, T01S114_A5745AlbRRep, T01S114_A6178AlbrUsu, T01S114_A6182AlbrNF, T01S114_A6183AlbrFeNf, T01S114_A6184AlbrCfop, T01S114_A3359AlbRDisCli, T01S114_A3360AlbRImp, T01S114_A6471AlbRUniB,
            T01S114_A6488AlbDocPrv, T01S114_A6523AlbRUdas, T01S114_A4793AlmNom, T01S114_n4793AlmNom, T01S114_A8023AlbColor, T01S114_A8024AlbOpsT, T01S114_A8025AlbOpsC, T01S114_A8026AlbOC, T01S114_A8027AlbHdri, T01S114_A8029AlbNumM,
            T01S114_A8030AlbAncC, T01S114_A8031AlbDndC, T01S114_A8032AlbAncCr, T01S114_A8033AlbDndCr, T01S114_A8036AlbDmt, T01S114_A8034AlbGalga, T01S114_A9793AlbPdaC, T01S114_A9794AlbOStj, T01S114_A317AlbStLot, T01S114_A10358AlbTurno,
            T01S114_A8723CliEst, T01S114_A396EmprCod, T01S114_A252CliCod, T01S114_A6263AlbRTartC, T01S114_n6263AlbRTartC, T01S114_A840TrnCod, T01S114_n840TrnCod, T01S114_A970ProceCod, T01S114_n970ProceCod, T01S114_A1211TipEntCod,
            T01S114_n1211TipEntCod, T01S114_A4792AlmCod, T01S114_n4792AlmCod, T01S114_A13982AlbRArtLu, T01S114_n13982AlbRArtLu
            }
            , new Object[] {
            T01S115_A407EmprNom, T01S115_n407EmprNom
            }
            , new Object[] {
            T01S116_A279CliNom, T01S116_A8723CliEst
            }
            , new Object[] {
            T01S117_A6264AlbRTartD, T01S117_n6264AlbRTartD
            }
            , new Object[] {
            T01S118_A841TrnNom, T01S118_n841TrnNom
            }
            , new Object[] {
            T01S119_A971ProceNom, T01S119_n971ProceNom
            }
            , new Object[] {
            T01S120_A1212TipEntNom, T01S120_n1212TipEntNom
            }
            , new Object[] {
            T01S121_A4793AlmNom, T01S121_n4793AlmNom
            }
            , new Object[] {
            T01S122_A13982AlbRArtLu, T01S122_n13982AlbRArtLu
            }
            , new Object[] {
            T01S123_A396EmprCod, T01S123_A44AlbRecCod
            }
            , new Object[] {
            T01S124_A396EmprCod, T01S124_A44AlbRecCod
            }
            , new Object[] {
            T01S125_A396EmprCod, T01S125_A44AlbRecCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01S129_A407EmprNom, T01S129_n407EmprNom
            }
            , new Object[] {
            T01S130_A279CliNom, T01S130_A8723CliEst
            }
            , new Object[] {
            T01S131_A13982AlbRArtLu, T01S131_n13982AlbRArtLu
            }
            , new Object[] {
            T01S132_A6264AlbRTartD, T01S132_n6264AlbRTartD
            }
            , new Object[] {
            T01S133_A841TrnNom, T01S133_n841TrnNom
            }
            , new Object[] {
            T01S134_A971ProceNom, T01S134_n971ProceNom
            }
            , new Object[] {
            T01S135_A1212TipEntNom, T01S135_n1212TipEntNom
            }
            , new Object[] {
            T01S136_A4793AlmNom, T01S136_n4793AlmNom
            }
            , new Object[] {
            T01S137_A396EmprCod, T01S137_A13026PedDGId, T01S137_A44AlbRecCod
            }
            , new Object[] {
            T01S138_A396EmprCod, T01S138_A11669DevCruId, T01S138_A44AlbRecCod
            }
            , new Object[] {
            T01S139_A396EmprCod, T01S139_A44AlbRecCod, T01S139_A9743Emp_CUb, T01S139_A5860Emp_Anp
            }
            , new Object[] {
            T01S140_A396EmprCod, T01S140_A44AlbRecCod, T01S140_A7130MatC_Pz
            }
            , new Object[] {
            T01S141_A396EmprCod, T01S141_A44AlbRecCod, T01S141_A7132MatC_Talla
            }
            , new Object[] {
            T01S142_A396EmprCod, T01S142_A44AlbRecCod, T01S142_A7115MatC_Lin
            }
            , new Object[] {
            T01S143_A396EmprCod, T01S143_A30AlbProCod, T01S143_A129BarCod, T01S143_A132BarCodReo, T01S143_A130BarCodPar, T01S143_A6622AlbHdRLn
            }
            , new Object[] {
            T01S144_A396EmprCod, T01S144_A6235DevEmpCod, T01S144_A6243DevNumLin
            }
            , new Object[] {
            T01S145_A396EmprCod, T01S145_A44AlbRecCod, T01S145_A4596AlbRDefCod
            }
            , new Object[] {
            T01S146_A396EmprCod, T01S146_A44AlbRecCod, T01S146_A2159AlbRecPie
            }
            , new Object[] {
            T01S147_A396EmprCod, T01S147_A44AlbRecCod, T01S147_A2165HisEmpLin
            }
            , new Object[] {
            T01S148_A396EmprCod, T01S148_A361DisCod, T01S148_A44AlbRecCod
            }
            , new Object[] {
            T01S149_A396EmprCod, T01S149_A323DevGenCod
            }
            , new Object[] {
            T01S150_A396EmprCod, T01S150_A129BarCod, T01S150_A132BarCodReo, T01S150_A130BarCodPar, T01S150_A200BarPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            T01S152_A396EmprCod, T01S152_A44AlbRecCod
            }
            , new Object[] {
            T01S153_A44AlbRecCod, T01S153_A1299AlbRLin, T01S153_A1300AlbRObs, T01S153_A396EmprCod
            }
            , new Object[] {
            T01S154_A396EmprCod, T01S154_A44AlbRecCod, T01S154_A1299AlbRLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01S158_A396EmprCod, T01S158_A44AlbRecCod, T01S158_A1299AlbRLin
            }
         }
      );
      AV110Pgmname = "AlmacenSinDetalle.AlmacenTejido" ;
      Z6181AlbrPieC = 0 ;
      A6181AlbrPieC = 0 ;
      Z6180AlbrUniC = DecimalUtil.ZERO ;
      A6180AlbrUniC = DecimalUtil.ZERO ;
      Z1211TipEntCod = (short)(1) ;
      n1211TipEntCod = false ;
      N1211TipEntCod = (short)(1) ;
      n1211TipEntCod = false ;
      i1211TipEntCod = (short)(1) ;
      n1211TipEntCod = false ;
      A1211TipEntCod = (short)(1) ;
      n1211TipEntCod = false ;
      Z4792AlmCod = (byte)(0) ;
      n4792AlmCod = false ;
      N4792AlmCod = (byte)(0) ;
      n4792AlmCod = false ;
      i4792AlmCod = (byte)(0) ;
      n4792AlmCod = false ;
      A4792AlmCod = (byte)(0) ;
      n4792AlmCod = false ;
      Z970ProceCod = (short)(0) ;
      n970ProceCod = false ;
      N970ProceCod = (short)(0) ;
      n970ProceCod = false ;
      i970ProceCod = (short)(0) ;
      n970ProceCod = false ;
      A970ProceCod = (short)(0) ;
      n970ProceCod = false ;
      Z840TrnCod = (short)(0) ;
      n840TrnCod = false ;
      N840TrnCod = (short)(0) ;
      n840TrnCod = false ;
      i840TrnCod = (short)(0) ;
      n840TrnCod = false ;
      A840TrnCod = (short)(0) ;
      n840TrnCod = false ;
      Z6523AlbRUdas = DecimalUtil.doubleToDec(0) ;
      A6523AlbRUdas = DecimalUtil.doubleToDec(0) ;
      i6523AlbRUdas = DecimalUtil.doubleToDec(0) ;
      Z6471AlbRUniB = DecimalUtil.doubleToDec(0) ;
      A6471AlbRUniB = DecimalUtil.doubleToDec(0) ;
      i6471AlbRUniB = DecimalUtil.doubleToDec(0) ;
      Z6470AlbRTara = DecimalUtil.doubleToDec(0) ;
      A6470AlbRTara = DecimalUtil.doubleToDec(0) ;
      i6470AlbRTara = DecimalUtil.doubleToDec(0) ;
      Z6465AlbRLu = DecimalUtil.ZERO ;
      A6465AlbRLu = DecimalUtil.ZERO ;
      Z6465AlbRLu = DecimalUtil.ZERO ;
      A6465AlbRLu = DecimalUtil.ZERO ;
      Z6464AlbRTelar = " " ;
      A6464AlbRTelar = " " ;
      i6464AlbRTelar = " " ;
      Z6463AlbRLote = " " ;
      A6463AlbRLote = " " ;
      i6463AlbRLote = " " ;
      Z4602AlbRMdlCod = " " ;
      A4602AlbRMdlCod = " " ;
      i4602AlbRMdlCod = " " ;
      Z3360AlbRImp = httpContext.getMessage( "N", "") ;
      A3360AlbRImp = httpContext.getMessage( "N", "") ;
      i3360AlbRImp = httpContext.getMessage( "N", "") ;
      Z6178AlbrUsu = "" ;
      A6178AlbrUsu = "" ;
      i6178AlbrUsu = "" ;
      Z6179AlbrHor = GXutil.resetDate(GXutil.serverNow( context, remoteHandle, pr_default)) ;
      A6179AlbrHor = GXutil.resetDate(GXutil.serverNow( context, remoteHandle, pr_default)) ;
      i6179AlbrHor = GXutil.resetDate(GXutil.serverNow( context, remoteHandle, pr_default)) ;
      Z6182AlbrNF = httpContext.getMessage( "N", "") ;
      A6182AlbrNF = httpContext.getMessage( "N", "") ;
      i6182AlbrNF = httpContext.getMessage( "N", "") ;
      Z48AlbRFecUlt = GXutil.today( ) ;
      A48AlbRFecUlt = GXutil.today( ) ;
      i48AlbRFecUlt = GXutil.today( ) ;
      Z47AlbREst = (byte)(0) ;
      A47AlbREst = (byte)(0) ;
      Z55AlbRReo = httpContext.getMessage( "NO", "") ;
      N55AlbRReo = httpContext.getMessage( "NO", "") ;
      A55AlbRReo = httpContext.getMessage( "NO", "") ;
      i55AlbRReo = httpContext.getMessage( "NO", "") ;
      Z6183AlbrFeNf = GXutil.today( ) ;
      A6183AlbrFeNf = GXutil.today( ) ;
      i6183AlbrFeNf = GXutil.today( ) ;
      Z49AlbRFen = GXutil.today( ) ;
      N49AlbRFen = GXutil.today( ) ;
      A49AlbRFen = GXutil.today( ) ;
      i49AlbRFen = GXutil.today( ) ;
   }

   private byte Z47AlbREst ;
   private byte Z1301AlbRUlin ;
   private byte Z5745AlbRRep ;
   private byte Z317AlbStLot ;
   private byte Z10358AlbTurno ;
   private byte Z4792AlmCod ;
   private byte O1301AlbRUlin ;
   private byte N4792AlmCod ;
   private byte Z1299AlbRLin ;
   private byte GxWebError ;
   private byte A4792AlmCod ;
   private byte nKeyPressed ;
   private byte A1301AlbRUlin ;
   private byte Gx_BScreen ;
   private byte A47AlbREst ;
   private byte A10358AlbTurno ;
   private byte AV105ComboAlmCod ;
   private byte B1301AlbRUlin ;
   private byte A5745AlbRRep ;
   private byte A317AlbStLot ;
   private byte AV86Insert_AlmCod ;
   private byte s1301AlbRUlin ;
   private byte A1299AlbRLin ;
   private byte AV107lavanderiaprecio ;
   private byte subGridlevel_observacion_Backcolorstyle ;
   private byte subGridlevel_observacion_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i4792AlmCod ;
   private byte i1301AlbRUlin ;
   private byte subGridlevel_observacion_Allowselection ;
   private byte subGridlevel_observacion_Allowhovering ;
   private byte subGridlevel_observacion_Allowcollapsing ;
   private byte subGridlevel_observacion_Collapsed ;
   private byte GXt_int8 ;
   private byte GXv_int9[] ;
   private short Z1222AlbNumEti ;
   private short Z4920AlbRGrm2 ;
   private short Z4921AlbRAnc ;
   private short Z4922AlbPml ;
   private short Z8031AlbDndC ;
   private short Z8033AlbDndCr ;
   private short Z8036AlbDmt ;
   private short Z8034AlbGalga ;
   private short Z6263AlbRTartC ;
   private short Z840TrnCod ;
   private short Z970ProceCod ;
   private short Z1211TipEntCod ;
   private short N6263AlbRTartC ;
   private short N840TrnCod ;
   private short N970ProceCod ;
   private short N1211TipEntCod ;
   private short nRcdDeleted_191 ;
   private short nRcdExists_191 ;
   private short nIsMod_191 ;
   private short A6263AlbRTartC ;
   private short A840TrnCod ;
   private short A970ProceCod ;
   private short A1211TipEntCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A4920AlbRGrm2 ;
   private short A4921AlbRAnc ;
   private short A4922AlbPml ;
   private short AV76ComboTrnCod ;
   private short AV97ComboProceCod ;
   private short AV99ComboTipEntCod ;
   private short nBlankRcdCount191 ;
   private short RcdFound191 ;
   private short nBlankRcdUsr191 ;
   private short A1222AlbNumEti ;
   private short A8031AlbDndC ;
   private short A8033AlbDndCr ;
   private short A8036AlbDmt ;
   private short A8034AlbGalga ;
   private short AV82Insert_AlbRTartC ;
   private short AV83Insert_TrnCod ;
   private short AV84Insert_ProceCod ;
   private short AV85Insert_TipEntCod ;
   private short AV25Moda21 ;
   private short AV106Lote2 ;
   private short AV39EncCli_20 ;
   private short AV14FlagKgs ;
   private short AV15FlagMts ;
   private short AV37okotex ;
   private short AV91ExisteReferencia ;
   private short AV26Cli350 ;
   private short RcdFound7 ;
   private short AV36Enc20 ;
   private short AV21Enc20c ;
   private short AV38normas ;
   private short AV13CtrlArt ;
   private short AV100Sicrudo ;
   private short nIsDirty_7 ;
   private short nIsDirty_191 ;
   private short i840TrnCod ;
   private short i970ProceCod ;
   private short i1211TipEntCod ;
   private short GXv_int13[] ;
   private short GXv_int12[] ;
   private short ZV91ExisteReferencia ;
   private int wcpOAV77AlbRecCod ;
   private int Z44AlbRecCod ;
   private int Z52AlbRPieEnt ;
   private int Z54AlbRPieUti ;
   private int Z6181AlbrPieC ;
   private int Z53AlbRPieReb ;
   private int Z252CliCod ;
   private int nRC_GXsfl_347 ;
   private int nGXsfl_347_idx=1 ;
   private int N252CliCod ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int AV77AlbRecCod ;
   private int trnEnded ;
   private int edtAlbRecCod_Enabled ;
   private int edtavUsurcod_Enabled ;
   private int divTableintegracion_pontway_Visible ;
   private int imgAlert_Visible ;
   private int edtAlbRFen_Enabled ;
   private int edtAlbrHor_Enabled ;
   private int edtAlbrUsu_Enabled ;
   private int edtCliCod_Visible ;
   private int edtCliCod_Enabled ;
   private int edtAlbRef_Visible ;
   private int edtAlbRef_Enabled ;
   private int edtAlbRefDsc_Enabled ;
   private int edtAlbRTartC_Enabled ;
   private int imgprompt_6263_Visible ;
   private int edtAlbRTartD_Enabled ;
   private int edtComposicio_Enabled ;
   private int edtAlbREnt_Visible ;
   private int edtAlbREnt_Enabled ;
   private int edtAlbREnt2_Visible ;
   private int edtAlbREnt2_Enabled ;
   private int edtAlbRDisCli_Enabled ;
   private int edtAlbNumB_Enabled ;
   private int edtAlbTurno_Visible ;
   private int edtAlbTurno_Enabled ;
   private int edtTrnCod_Visible ;
   private int edtTrnCod_Enabled ;
   private int edtProceCod_Visible ;
   private int edtProceCod_Enabled ;
   private int edtAlbRLot2_Visible ;
   private int edtAlbRLot2_Enabled ;
   private int edtAlbRLote_Visible ;
   private int edtAlbRLote_Enabled ;
   private int edtAlbRMdlCod_Enabled ;
   private int edtAlbRLu_Enabled ;
   private int edtAlbRTelar_Enabled ;
   private int edtAlbMaqTej_Enabled ;
   private int edtAlbRTara_Enabled ;
   private int edtTipEntCod_Visible ;
   private int edtTipEntCod_Enabled ;
   private int edtAlbRDes_Enabled ;
   private int A52AlbRPieEnt ;
   private int edtAlbRPieEnt_Enabled ;
   private int edtAlbPmPPza_Visible ;
   private int edtAlbPmPPza_Enabled ;
   private int A6181AlbrPieC ;
   private int edtAlbrPieC_Enabled ;
   private int edtAlbRUniEnt_Enabled ;
   private int edtAlbrUniC_Enabled ;
   private int A54AlbRPieUti ;
   private int edtAlbRPieUti_Enabled ;
   private int A51AlbRPieDis ;
   private int edtAlbRPieDis_Enabled ;
   private int edtAlbRUniUti_Enabled ;
   private int edtAlbRUniDis_Enabled ;
   private int edtAlbRFecUlt_Enabled ;
   private int edtAlmCod_Visible ;
   private int edtAlmCod_Enabled ;
   private int edtAlbRLoc_Enabled ;
   private int edtAlbRGrm2_Enabled ;
   private int edtAlbRAnc_Enabled ;
   private int edtAlbPml_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int AV69ComboCliCod ;
   private int edtavComboclicod_Enabled ;
   private int edtavComboclicod_Visible ;
   private int edtavComboalbref_Visible ;
   private int edtavComboalbref_Enabled ;
   private int edtavCombotrncod_Enabled ;
   private int edtavCombotrncod_Visible ;
   private int edtavComboprocecod_Enabled ;
   private int edtavComboprocecod_Visible ;
   private int edtavCombotipentcod_Enabled ;
   private int edtavCombotipentcod_Visible ;
   private int edtavComboalmcod_Enabled ;
   private int edtavComboalmcod_Visible ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtAlbRLin_Enabled ;
   private int edtAlbRObs_Enabled ;
   private int fRowAdded ;
   private int A53AlbRPieReb ;
   private int A4291AlbPzaEst ;
   private int AV81Insert_CliCod ;
   private int AV27ContVal ;
   private int Combo_clicod_Datalistupdateminimumcharacters ;
   private int Combo_clicod_Gxcontroltype ;
   private int Combo_albref_Datalistupdateminimumcharacters ;
   private int Combo_albref_Gxcontroltype ;
   private int Combo_trncod_Datalistupdateminimumcharacters ;
   private int Combo_trncod_Gxcontroltype ;
   private int Combo_procecod_Datalistupdateminimumcharacters ;
   private int Combo_procecod_Gxcontroltype ;
   private int Dvpanel_unnamedtable7_Gxcontroltype ;
   private int Combo_tipentcod_Datalistupdateminimumcharacters ;
   private int Combo_tipentcod_Gxcontroltype ;
   private int Dvpanel_unnamedtable9_Gxcontroltype ;
   private int Combo_almcod_Datalistupdateminimumcharacters ;
   private int Combo_almcod_Gxcontroltype ;
   private int Dvpanel_unnamedtable11_Gxcontroltype ;
   private int Dvpanel_tableattributes_Gxcontroltype ;
   private int Datamonjs_Gxcontroltype ;
   private int AV111GXV1 ;
   private int GXt_int10 ;
   private int GX_JID ;
   private int subGridlevel_observacion_Backcolor ;
   private int subGridlevel_observacion_Allbackcolor ;
   private int defedtAlbRLin_Enabled ;
   private int idxLst ;
   private int subGridlevel_observacion_Selectedindex ;
   private int subGridlevel_observacion_Selectioncolor ;
   private int subGridlevel_observacion_Hoveringcolor ;
   private int GXv_int11[] ;
   private int Z4291AlbPzaEst ;
   private long GRIDLEVEL_OBSERVACION_nFirstRecordOnPage ;
   private java.math.BigDecimal Z58AlbRUniEnt ;
   private java.math.BigDecimal Z6465AlbRLu ;
   private java.math.BigDecimal Z6470AlbRTara ;
   private java.math.BigDecimal Z60AlbRUniUti ;
   private java.math.BigDecimal Z6180AlbrUniC ;
   private java.math.BigDecimal Z59AlbRUniReb ;
   private java.math.BigDecimal Z4290AlbPmPPza ;
   private java.math.BigDecimal Z5743AlbRPre ;
   private java.math.BigDecimal Z5744AlbRAju ;
   private java.math.BigDecimal Z6471AlbRUniB ;
   private java.math.BigDecimal Z6523AlbRUdas ;
   private java.math.BigDecimal Z8030AlbAncC ;
   private java.math.BigDecimal Z8032AlbAncCr ;
   private java.math.BigDecimal A6465AlbRLu ;
   private java.math.BigDecimal A6470AlbRTara ;
   private java.math.BigDecimal A4290AlbPmPPza ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A6180AlbrUniC ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal A59AlbRUniReb ;
   private java.math.BigDecimal A5743AlbRPre ;
   private java.math.BigDecimal A5744AlbRAju ;
   private java.math.BigDecimal A6471AlbRUniB ;
   private java.math.BigDecimal A6523AlbRUdas ;
   private java.math.BigDecimal A8030AlbAncC ;
   private java.math.BigDecimal A8032AlbAncCr ;
   private java.math.BigDecimal A13982AlbRArtLu ;
   private java.math.BigDecimal Z13982AlbRArtLu ;
   private java.math.BigDecimal i6470AlbRTara ;
   private java.math.BigDecimal i6471AlbRUniB ;
   private java.math.BigDecimal i6523AlbRUdas ;
   private java.math.BigDecimal Z57AlbRUniDis ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV8EmprCod ;
   private String Z396EmprCod ;
   private String Z45AlbRef ;
   private String Z46AlbREnt ;
   private String Z5806AlbREnt2 ;
   private String Z56AlbRUni ;
   private String Z12879AlbOEKOTEX ;
   private String Z3613AlbRefDsc ;
   private String Z4601AlbRTam ;
   private String Z9749Emp_Item1 ;
   private String Z1291AlbRDes ;
   private String Z6463AlbRLote ;
   private String Z6464AlbRTelar ;
   private String Z4602AlbRMdlCod ;
   private String Z8035AlbMaqTej ;
   private String Z8028AlbNumB ;
   private String Z50AlbRLoc ;
   private String Z55AlbRReo ;
   private String Z6178AlbrUsu ;
   private String Z6182AlbrNF ;
   private String Z6184AlbrCfop ;
   private String Z3359AlbRDisCli ;
   private String Z3360AlbRImp ;
   private String Z6488AlbDocPrv ;
   private String Z8023AlbColor ;
   private String Z8024AlbOpsT ;
   private String Z8025AlbOpsC ;
   private String Z8026AlbOC ;
   private String Z8027AlbHdri ;
   private String Z8029AlbNumM ;
   private String Z9793AlbPdaC ;
   private String Z9794AlbOStj ;
   private String N50AlbRLoc ;
   private String N45AlbRef ;
   private String N56AlbRUni ;
   private String N55AlbRReo ;
   private String Combo_almcod_Selectedvalue_get ;
   private String Combo_tipentcod_Selectedvalue_get ;
   private String Combo_procecod_Selectedvalue_get ;
   private String Combo_trncod_Selectedvalue_get ;
   private String Combo_albref_Selectedvalue_get ;
   private String Combo_clicod_Selectedvalue_get ;
   private String Z1300AlbRObs ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String A396EmprCod ;
   private String A45AlbRef ;
   private String AV8EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtAlbRecCod_Internalname ;
   private String sGXsfl_347_idx="0001" ;
   private String A4601AlbRTam ;
   private String A56AlbRUni ;
   private String A55AlbRReo ;
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
   private String divUnnamedtable25_Internalname ;
   private String TempTags ;
   private String edtAlbRecCod_Jsonclick ;
   private String edtavUsurcod_Internalname ;
   private String AV7UsurCod ;
   private String edtavUsurcod_Jsonclick ;
   private String divTableintegracion_pontway_Internalname ;
   private String imgAlert_gximage ;
   private String sImgUrl ;
   private String imgAlert_Internalname ;
   private String lblAlert_text_Internalname ;
   private String lblAlert_text_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtAlbRFen_Internalname ;
   private String edtAlbRFen_Jsonclick ;
   private String edtAlbrHor_Internalname ;
   private String edtAlbrHor_Jsonclick ;
   private String edtAlbrUsu_Internalname ;
   private String A6178AlbrUsu ;
   private String edtAlbrUsu_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String divTablesplittedclicod_Internalname ;
   private String lblTextblockclicod_Internalname ;
   private String lblTextblockclicod_Jsonclick ;
   private String Combo_clicod_Caption ;
   private String Combo_clicod_Cls ;
   private String Combo_clicod_Internalname ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String divTablesplittedalbref_Internalname ;
   private String lblTextblockalbref_Internalname ;
   private String lblTextblockalbref_Jsonclick ;
   private String Combo_albref_Caption ;
   private String Combo_albref_Cls ;
   private String Combo_albref_Internalname ;
   private String edtAlbRef_Internalname ;
   private String edtAlbRef_Jsonclick ;
   private String edtAlbRefDsc_Internalname ;
   private String A3613AlbRefDsc ;
   private String edtAlbRefDsc_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String divUnnamedtable23_Internalname ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String edtAlbRTartC_Internalname ;
   private String edtAlbRTartC_Jsonclick ;
   private String imgprompt_6263_gximage ;
   private String imgprompt_6263_Internalname ;
   private String imgprompt_6263_Link ;
   private String divUnnamedtable24_Internalname ;
   private String lblTextblock2desc_Internalname ;
   private String lblTextblock2desc_Jsonclick ;
   private String edtAlbRTartD_Internalname ;
   private String A6264AlbRTartD ;
   private String edtAlbRTartD_Jsonclick ;
   private String edtComposicio_Internalname ;
   private String A13981Composicio ;
   private String edtComposicio_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String divAlbrent_cell_Internalname ;
   private String divAlbrent_cell_Class ;
   private String edtAlbREnt_Internalname ;
   private String A46AlbREnt ;
   private String edtAlbREnt_Jsonclick ;
   private String divAlbrent2_cell_Internalname ;
   private String divAlbrent2_cell_Class ;
   private String edtAlbREnt2_Internalname ;
   private String A5806AlbREnt2 ;
   private String edtAlbREnt2_Jsonclick ;
   private String edtAlbRDisCli_Internalname ;
   private String A3359AlbRDisCli ;
   private String edtAlbRDisCli_Jsonclick ;
   private String edtAlbNumB_Internalname ;
   private String A8028AlbNumB ;
   private String edtAlbNumB_Jsonclick ;
   private String divAlbturno_cell_Internalname ;
   private String divAlbturno_cell_Class ;
   private String edtAlbTurno_Internalname ;
   private String edtAlbTurno_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String divTablesplittedtrncod_Internalname ;
   private String lblTextblocktrncod_Internalname ;
   private String lblTextblocktrncod_Jsonclick ;
   private String Combo_trncod_Caption ;
   private String Combo_trncod_Cls ;
   private String Combo_trncod_Internalname ;
   private String edtTrnCod_Internalname ;
   private String edtTrnCod_Jsonclick ;
   private String divTablesplittedprocecod_Internalname ;
   private String lblTextblockprocecod_Internalname ;
   private String lblTextblockprocecod_Jsonclick ;
   private String Combo_procecod_Caption ;
   private String Combo_procecod_Cls ;
   private String Combo_procecod_Internalname ;
   private String edtProceCod_Internalname ;
   private String edtProceCod_Jsonclick ;
   private String divDvpanel_unnamedtable7_cell_Internalname ;
   private String divDvpanel_unnamedtable7_cell_Class ;
   private String Dvpanel_unnamedtable7_Width ;
   private String Dvpanel_unnamedtable7_Cls ;
   private String Dvpanel_unnamedtable7_Title ;
   private String Dvpanel_unnamedtable7_Iconposition ;
   private String Dvpanel_unnamedtable7_Internalname ;
   private String divUnnamedtable7_Internalname ;
   private String divUnnamedtable22_Internalname ;
   private String divAlbrlot2_cell_Internalname ;
   private String divAlbrlot2_cell_Class ;
   private String edtAlbRLot2_Internalname ;
   private String edtAlbRLot2_Jsonclick ;
   private String divAlbrlote_cell_Internalname ;
   private String divAlbrlote_cell_Class ;
   private String edtAlbRLote_Internalname ;
   private String A6463AlbRLote ;
   private String edtAlbRLote_Jsonclick ;
   private String edtAlbRMdlCod_Internalname ;
   private String A4602AlbRMdlCod ;
   private String edtAlbRMdlCod_Jsonclick ;
   private String edtAlbRLu_Internalname ;
   private String edtAlbRLu_Jsonclick ;
   private String edtAlbRTelar_Internalname ;
   private String A6464AlbRTelar ;
   private String edtAlbRTelar_Jsonclick ;
   private String edtAlbMaqTej_Internalname ;
   private String A8035AlbMaqTej ;
   private String edtAlbMaqTej_Jsonclick ;
   private String edtAlbRTara_Internalname ;
   private String edtAlbRTara_Jsonclick ;
   private String divUnnamedtable8_Internalname ;
   private String divTablesplittedtipentcod_Internalname ;
   private String lblTextblocktipentcod_Internalname ;
   private String lblTextblocktipentcod_Jsonclick ;
   private String Combo_tipentcod_Caption ;
   private String Combo_tipentcod_Cls ;
   private String Combo_tipentcod_Internalname ;
   private String edtTipEntCod_Internalname ;
   private String edtTipEntCod_Jsonclick ;
   private String edtAlbRDes_Internalname ;
   private String A1291AlbRDes ;
   private String edtAlbRDes_Jsonclick ;
   private String Dvpanel_unnamedtable9_Width ;
   private String Dvpanel_unnamedtable9_Cls ;
   private String Dvpanel_unnamedtable9_Title ;
   private String Dvpanel_unnamedtable9_Iconposition ;
   private String Dvpanel_unnamedtable9_Internalname ;
   private String divUnnamedtable9_Internalname ;
   private String grpUnnamedgroup14_Internalname ;
   private String divUnnamedtable13_Internalname ;
   private String divUnnamedtable20_Internalname ;
   private String edtAlbRPieEnt_Internalname ;
   private String edtAlbRPieEnt_Jsonclick ;
   private String edtAlbPmPPza_Internalname ;
   private String edtAlbPmPPza_Jsonclick ;
   private String edtAlbrPieC_Internalname ;
   private String edtAlbrPieC_Jsonclick ;
   private String divUnnamedtable21_Internalname ;
   private String edtAlbRUniEnt_Internalname ;
   private String edtAlbRUniEnt_Jsonclick ;
   private String edtAlbrUniC_Internalname ;
   private String edtAlbrUniC_Jsonclick ;
   private String grpUnnamedgroup16_Internalname ;
   private String divUnnamedtable15_Internalname ;
   private String divUnnamedtable17_Internalname ;
   private String edtAlbRPieUti_Internalname ;
   private String edtAlbRPieUti_Jsonclick ;
   private String edtAlbRPieDis_Internalname ;
   private String edtAlbRPieDis_Jsonclick ;
   private String divUnnamedtable18_Internalname ;
   private String edtAlbRUniUti_Internalname ;
   private String edtAlbRUniUti_Jsonclick ;
   private String edtAlbRUniDis_Internalname ;
   private String edtAlbRUniDis_Jsonclick ;
   private String divUnnamedtable19_Internalname ;
   private String edtAlbRFecUlt_Internalname ;
   private String edtAlbRFecUlt_Jsonclick ;
   private String divUnnamedtable10_Internalname ;
   private String divTablesplittedalmcod_Internalname ;
   private String lblTextblockalmcod_Internalname ;
   private String lblTextblockalmcod_Jsonclick ;
   private String Combo_almcod_Caption ;
   private String Combo_almcod_Cls ;
   private String Combo_almcod_Internalname ;
   private String edtAlmCod_Internalname ;
   private String edtAlmCod_Jsonclick ;
   private String edtAlbRLoc_Internalname ;
   private String A50AlbRLoc ;
   private String edtAlbRLoc_Jsonclick ;
   private String Dvpanel_unnamedtable11_Width ;
   private String Dvpanel_unnamedtable11_Cls ;
   private String Dvpanel_unnamedtable11_Title ;
   private String Dvpanel_unnamedtable11_Iconposition ;
   private String Dvpanel_unnamedtable11_Internalname ;
   private String divUnnamedtable11_Internalname ;
   private String divUnnamedtable12_Internalname ;
   private String edtAlbRGrm2_Internalname ;
   private String edtAlbRGrm2_Jsonclick ;
   private String edtAlbRAnc_Internalname ;
   private String edtAlbRAnc_Jsonclick ;
   private String edtAlbPml_Internalname ;
   private String edtAlbPml_Jsonclick ;
   private String divTableleaflevel_observacion_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV110Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_clicod_Internalname ;
   private String edtavComboclicod_Internalname ;
   private String edtavComboclicod_Jsonclick ;
   private String divSectionattribute_albref_Internalname ;
   private String edtavComboalbref_Internalname ;
   private String AV102ComboAlbRef ;
   private String edtavComboalbref_Jsonclick ;
   private String divSectionattribute_trncod_Internalname ;
   private String edtavCombotrncod_Internalname ;
   private String edtavCombotrncod_Jsonclick ;
   private String divSectionattribute_procecod_Internalname ;
   private String edtavComboprocecod_Internalname ;
   private String edtavComboprocecod_Jsonclick ;
   private String divSectionattribute_tipentcod_Internalname ;
   private String edtavCombotipentcod_Internalname ;
   private String edtavCombotipentcod_Jsonclick ;
   private String divSectionattribute_almcod_Internalname ;
   private String edtavComboalmcod_Internalname ;
   private String edtavComboalmcod_Jsonclick ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String sMode191 ;
   private String edtAlbRLin_Internalname ;
   private String edtAlbRObs_Internalname ;
   private String sStyleString ;
   private String subGridlevel_observacion_Internalname ;
   private String A12879AlbOEKOTEX ;
   private String A9749Emp_Item1 ;
   private String A6182AlbrNF ;
   private String A6184AlbrCfop ;
   private String A3360AlbRImp ;
   private String A6488AlbDocPrv ;
   private String A8023AlbColor ;
   private String A8024AlbOpsT ;
   private String A8025AlbOpsC ;
   private String A8026AlbOC ;
   private String A8027AlbHdri ;
   private String A8029AlbNumM ;
   private String A9793AlbPdaC ;
   private String A9794AlbOStj ;
   private String AV72AlbCum ;
   private String A8723CliEst ;
   private String A407EmprNom ;
   private String A279CliNom ;
   private String A841TrnNom ;
   private String A971ProceNom ;
   private String A1212TipEntNom ;
   private String A4793AlmNom ;
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
   private String Combo_albref_Objectcall ;
   private String Combo_albref_Class ;
   private String Combo_albref_Icontype ;
   private String Combo_albref_Icon ;
   private String Combo_albref_Tooltip ;
   private String Combo_albref_Selectedvalue_set ;
   private String Combo_albref_Selectedtext_set ;
   private String Combo_albref_Selectedtext_get ;
   private String Combo_albref_Gamoauthtoken ;
   private String Combo_albref_Ddointernalname ;
   private String Combo_albref_Titlecontrolalign ;
   private String Combo_albref_Dropdownoptionstype ;
   private String Combo_albref_Titlecontrolidtoreplace ;
   private String Combo_albref_Datalisttype ;
   private String Combo_albref_Datalistfixedvalues ;
   private String Combo_albref_Datalistproc ;
   private String Combo_albref_Datalistprocparametersprefix ;
   private String Combo_albref_Remoteservicesparameters ;
   private String Combo_albref_Htmltemplate ;
   private String Combo_albref_Multiplevaluestype ;
   private String Combo_albref_Loadingdata ;
   private String Combo_albref_Noresultsfound ;
   private String Combo_albref_Emptyitemtext ;
   private String Combo_albref_Onlyselectedvalues ;
   private String Combo_albref_Selectalltext ;
   private String Combo_albref_Multiplevaluesseparator ;
   private String Combo_albref_Addnewoptiontext ;
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
   private String Combo_trncod_Emptyitemtext ;
   private String Combo_trncod_Onlyselectedvalues ;
   private String Combo_trncod_Selectalltext ;
   private String Combo_trncod_Multiplevaluesseparator ;
   private String Combo_trncod_Addnewoptiontext ;
   private String Combo_procecod_Objectcall ;
   private String Combo_procecod_Class ;
   private String Combo_procecod_Icontype ;
   private String Combo_procecod_Icon ;
   private String Combo_procecod_Tooltip ;
   private String Combo_procecod_Selectedvalue_set ;
   private String Combo_procecod_Selectedtext_set ;
   private String Combo_procecod_Selectedtext_get ;
   private String Combo_procecod_Gamoauthtoken ;
   private String Combo_procecod_Ddointernalname ;
   private String Combo_procecod_Titlecontrolalign ;
   private String Combo_procecod_Dropdownoptionstype ;
   private String Combo_procecod_Titlecontrolidtoreplace ;
   private String Combo_procecod_Datalisttype ;
   private String Combo_procecod_Datalistfixedvalues ;
   private String Combo_procecod_Datalistproc ;
   private String Combo_procecod_Datalistprocparametersprefix ;
   private String Combo_procecod_Remoteservicesparameters ;
   private String Combo_procecod_Htmltemplate ;
   private String Combo_procecod_Multiplevaluestype ;
   private String Combo_procecod_Loadingdata ;
   private String Combo_procecod_Noresultsfound ;
   private String Combo_procecod_Emptyitemtext ;
   private String Combo_procecod_Onlyselectedvalues ;
   private String Combo_procecod_Selectalltext ;
   private String Combo_procecod_Multiplevaluesseparator ;
   private String Combo_procecod_Addnewoptiontext ;
   private String Dvpanel_unnamedtable7_Objectcall ;
   private String Dvpanel_unnamedtable7_Class ;
   private String Dvpanel_unnamedtable7_Height ;
   private String Combo_tipentcod_Objectcall ;
   private String Combo_tipentcod_Class ;
   private String Combo_tipentcod_Icontype ;
   private String Combo_tipentcod_Icon ;
   private String Combo_tipentcod_Tooltip ;
   private String Combo_tipentcod_Selectedvalue_set ;
   private String Combo_tipentcod_Selectedtext_set ;
   private String Combo_tipentcod_Selectedtext_get ;
   private String Combo_tipentcod_Gamoauthtoken ;
   private String Combo_tipentcod_Ddointernalname ;
   private String Combo_tipentcod_Titlecontrolalign ;
   private String Combo_tipentcod_Dropdownoptionstype ;
   private String Combo_tipentcod_Titlecontrolidtoreplace ;
   private String Combo_tipentcod_Datalisttype ;
   private String Combo_tipentcod_Datalistfixedvalues ;
   private String Combo_tipentcod_Datalistproc ;
   private String Combo_tipentcod_Datalistprocparametersprefix ;
   private String Combo_tipentcod_Remoteservicesparameters ;
   private String Combo_tipentcod_Htmltemplate ;
   private String Combo_tipentcod_Multiplevaluestype ;
   private String Combo_tipentcod_Loadingdata ;
   private String Combo_tipentcod_Noresultsfound ;
   private String Combo_tipentcod_Emptyitemtext ;
   private String Combo_tipentcod_Onlyselectedvalues ;
   private String Combo_tipentcod_Selectalltext ;
   private String Combo_tipentcod_Multiplevaluesseparator ;
   private String Combo_tipentcod_Addnewoptiontext ;
   private String Dvpanel_unnamedtable9_Objectcall ;
   private String Dvpanel_unnamedtable9_Class ;
   private String Dvpanel_unnamedtable9_Height ;
   private String Combo_almcod_Objectcall ;
   private String Combo_almcod_Class ;
   private String Combo_almcod_Icontype ;
   private String Combo_almcod_Icon ;
   private String Combo_almcod_Tooltip ;
   private String Combo_almcod_Selectedvalue_set ;
   private String Combo_almcod_Selectedtext_set ;
   private String Combo_almcod_Selectedtext_get ;
   private String Combo_almcod_Gamoauthtoken ;
   private String Combo_almcod_Ddointernalname ;
   private String Combo_almcod_Titlecontrolalign ;
   private String Combo_almcod_Dropdownoptionstype ;
   private String Combo_almcod_Titlecontrolidtoreplace ;
   private String Combo_almcod_Datalisttype ;
   private String Combo_almcod_Datalistfixedvalues ;
   private String Combo_almcod_Datalistproc ;
   private String Combo_almcod_Datalistprocparametersprefix ;
   private String Combo_almcod_Remoteservicesparameters ;
   private String Combo_almcod_Htmltemplate ;
   private String Combo_almcod_Multiplevaluestype ;
   private String Combo_almcod_Loadingdata ;
   private String Combo_almcod_Noresultsfound ;
   private String Combo_almcod_Emptyitemtext ;
   private String Combo_almcod_Onlyselectedvalues ;
   private String Combo_almcod_Selectalltext ;
   private String Combo_almcod_Multiplevaluesseparator ;
   private String Combo_almcod_Addnewoptiontext ;
   private String Dvpanel_unnamedtable11_Objectcall ;
   private String Dvpanel_unnamedtable11_Class ;
   private String Dvpanel_unnamedtable11_Height ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String hsh ;
   private String sMode7 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A1300AlbRObs ;
   private String AV9Station ;
   private String AV10EmprNom ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z8723CliEst ;
   private String Z6264AlbRTartD ;
   private String Z841TrnNom ;
   private String Z971ProceNom ;
   private String Z1212TipEntNom ;
   private String Z4793AlmNom ;
   private String sGXsfl_347_fel_idx="0001" ;
   private String subGridlevel_observacion_Class ;
   private String subGridlevel_observacion_Linesclass ;
   private String ROClassString ;
   private String edtAlbRLin_Jsonclick ;
   private String edtAlbRObs_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i55AlbRReo ;
   private String i6182AlbrNF ;
   private String i6178AlbrUsu ;
   private String i3360AlbRImp ;
   private String i4602AlbRMdlCod ;
   private String i6463AlbRLote ;
   private String i6464AlbRTelar ;
   private String subGridlevel_observacion_Header ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String Z13981Composicio ;
   private String ZV72AlbCum ;
   private java.util.Date Z6179AlbrHor ;
   private java.util.Date A6179AlbrHor ;
   private java.util.Date i6179AlbrHor ;
   private java.util.Date Z49AlbRFen ;
   private java.util.Date Z48AlbRFecUlt ;
   private java.util.Date Z6183AlbrFeNf ;
   private java.util.Date N49AlbRFen ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date A48AlbRFecUlt ;
   private java.util.Date A6183AlbrFeNf ;
   private java.util.Date i49AlbRFen ;
   private java.util.Date i6183AlbrFeNf ;
   private java.util.Date i48AlbRFecUlt ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n44AlbRecCod ;
   private boolean n6263AlbRTartC ;
   private boolean n840TrnCod ;
   private boolean n970ProceCod ;
   private boolean n1211TipEntCod ;
   private boolean n4792AlmCod ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_clicod_Emptyitem ;
   private boolean Combo_albref_Emptyitem ;
   private boolean Combo_trncod_Emptyitem ;
   private boolean Combo_procecod_Emptyitem ;
   private boolean Dvpanel_unnamedtable7_Autowidth ;
   private boolean Dvpanel_unnamedtable7_Autoheight ;
   private boolean Dvpanel_unnamedtable7_Collapsible ;
   private boolean Dvpanel_unnamedtable7_Collapsed ;
   private boolean Dvpanel_unnamedtable7_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable7_Autoscroll ;
   private boolean Combo_tipentcod_Emptyitem ;
   private boolean Dvpanel_unnamedtable9_Autowidth ;
   private boolean Dvpanel_unnamedtable9_Autoheight ;
   private boolean Dvpanel_unnamedtable9_Collapsible ;
   private boolean Dvpanel_unnamedtable9_Collapsed ;
   private boolean Dvpanel_unnamedtable9_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable9_Autoscroll ;
   private boolean Combo_almcod_Emptyitem ;
   private boolean Dvpanel_unnamedtable11_Autowidth ;
   private boolean Dvpanel_unnamedtable11_Autoheight ;
   private boolean Dvpanel_unnamedtable11_Collapsible ;
   private boolean Dvpanel_unnamedtable11_Collapsed ;
   private boolean Dvpanel_unnamedtable11_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable11_Autoscroll ;
   private boolean bGXsfl_347_Refreshing=false ;
   private boolean n13982AlbRArtLu ;
   private boolean n407EmprNom ;
   private boolean n841TrnNom ;
   private boolean n971ProceNom ;
   private boolean n1212TipEntNom ;
   private boolean n4793AlmNom ;
   private boolean Combo_clicod_Enabled ;
   private boolean Combo_clicod_Visible ;
   private boolean Combo_clicod_Allowmultipleselection ;
   private boolean Combo_clicod_Isgriditem ;
   private boolean Combo_clicod_Hasdescription ;
   private boolean Combo_clicod_Includeonlyselectedoption ;
   private boolean Combo_clicod_Includeselectalloption ;
   private boolean Combo_clicod_Includeaddnewoption ;
   private boolean Combo_albref_Enabled ;
   private boolean Combo_albref_Visible ;
   private boolean Combo_albref_Allowmultipleselection ;
   private boolean Combo_albref_Isgriditem ;
   private boolean Combo_albref_Hasdescription ;
   private boolean Combo_albref_Includeonlyselectedoption ;
   private boolean Combo_albref_Includeselectalloption ;
   private boolean Combo_albref_Includeaddnewoption ;
   private boolean Combo_trncod_Enabled ;
   private boolean Combo_trncod_Visible ;
   private boolean Combo_trncod_Allowmultipleselection ;
   private boolean Combo_trncod_Isgriditem ;
   private boolean Combo_trncod_Hasdescription ;
   private boolean Combo_trncod_Includeonlyselectedoption ;
   private boolean Combo_trncod_Includeselectalloption ;
   private boolean Combo_trncod_Includeaddnewoption ;
   private boolean Combo_procecod_Enabled ;
   private boolean Combo_procecod_Visible ;
   private boolean Combo_procecod_Allowmultipleselection ;
   private boolean Combo_procecod_Isgriditem ;
   private boolean Combo_procecod_Hasdescription ;
   private boolean Combo_procecod_Includeonlyselectedoption ;
   private boolean Combo_procecod_Includeselectalloption ;
   private boolean Combo_procecod_Includeaddnewoption ;
   private boolean Dvpanel_unnamedtable7_Enabled ;
   private boolean Dvpanel_unnamedtable7_Showheader ;
   private boolean Dvpanel_unnamedtable7_Visible ;
   private boolean Combo_tipentcod_Enabled ;
   private boolean Combo_tipentcod_Visible ;
   private boolean Combo_tipentcod_Allowmultipleselection ;
   private boolean Combo_tipentcod_Isgriditem ;
   private boolean Combo_tipentcod_Hasdescription ;
   private boolean Combo_tipentcod_Includeonlyselectedoption ;
   private boolean Combo_tipentcod_Includeselectalloption ;
   private boolean Combo_tipentcod_Includeaddnewoption ;
   private boolean Dvpanel_unnamedtable9_Enabled ;
   private boolean Dvpanel_unnamedtable9_Showheader ;
   private boolean Dvpanel_unnamedtable9_Visible ;
   private boolean Combo_almcod_Enabled ;
   private boolean Combo_almcod_Visible ;
   private boolean Combo_almcod_Allowmultipleselection ;
   private boolean Combo_almcod_Isgriditem ;
   private boolean Combo_almcod_Hasdescription ;
   private boolean Combo_almcod_Includeonlyselectedoption ;
   private boolean Combo_almcod_Includeselectalloption ;
   private boolean Combo_almcod_Includeaddnewoption ;
   private boolean Dvpanel_unnamedtable11_Enabled ;
   private boolean Dvpanel_unnamedtable11_Showheader ;
   private boolean Dvpanel_unnamedtable11_Visible ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean n6264AlbRTartD ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z14525AlbRLot2 ;
   private String A14525AlbRLot2 ;
   private String AV93ComboSelectedValue ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_observacionContainer ;
   private com.genexus.webpanels.GXWebRow Gridlevel_observacionRow ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_observacionColumn ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicod ;
   private com.genexus.webpanels.GXUserControl ucCombo_albref ;
   private com.genexus.webpanels.GXUserControl ucCombo_trncod ;
   private com.genexus.webpanels.GXUserControl ucCombo_procecod ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable7 ;
   private com.genexus.webpanels.GXUserControl ucCombo_tipentcod ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable9 ;
   private com.genexus.webpanels.GXUserControl ucCombo_almcod ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable11 ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbAlbRTam ;
   private HTMLChoice cmbAlbRUni ;
   private HTMLChoice cmbAlbREst ;
   private HTMLChoice cmbAlbRReo ;
   private IDataStoreProvider pr_default ;
   private String[] T01S16_A407EmprNom ;
   private boolean[] T01S16_n407EmprNom ;
   private String[] T01S18_A6264AlbRTartD ;
   private boolean[] T01S18_n6264AlbRTartD ;
   private String[] T01S17_A279CliNom ;
   private String[] T01S17_A8723CliEst ;
   private java.math.BigDecimal[] T01S113_A13982AlbRArtLu ;
   private boolean[] T01S113_n13982AlbRArtLu ;
   private String[] T01S19_A841TrnNom ;
   private boolean[] T01S19_n841TrnNom ;
   private String[] T01S110_A971ProceNom ;
   private boolean[] T01S110_n971ProceNom ;
   private String[] T01S111_A1212TipEntNom ;
   private boolean[] T01S111_n1212TipEntNom ;
   private String[] T01S112_A4793AlmNom ;
   private boolean[] T01S112_n4793AlmNom ;
   private String[] T01S114_A65ArtCod ;
   private int[] T01S114_A44AlbRecCod ;
   private boolean[] T01S114_n44AlbRecCod ;
   private String[] T01S114_A45AlbRef ;
   private java.math.BigDecimal[] T01S114_A58AlbRUniEnt ;
   private String[] T01S114_A46AlbREnt ;
   private String[] T01S114_A5806AlbREnt2 ;
   private String[] T01S114_A56AlbRUni ;
   private byte[] T01S114_A47AlbREst ;
   private String[] T01S114_A12879AlbOEKOTEX ;
   private String[] T01S114_A3613AlbRefDsc ;
   private String[] T01S114_A6264AlbRTartD ;
   private boolean[] T01S114_n6264AlbRTartD ;
   private String[] T01S114_A407EmprNom ;
   private boolean[] T01S114_n407EmprNom ;
   private String[] T01S114_A279CliNom ;
   private java.util.Date[] T01S114_A49AlbRFen ;
   private java.util.Date[] T01S114_A6179AlbrHor ;
   private String[] T01S114_A4601AlbRTam ;
   private String[] T01S114_A9749Emp_Item1 ;
   private String[] T01S114_A841TrnNom ;
   private boolean[] T01S114_n841TrnNom ;
   private String[] T01S114_A1291AlbRDes ;
   private String[] T01S114_A971ProceNom ;
   private boolean[] T01S114_n971ProceNom ;
   private String[] T01S114_A6463AlbRLote ;
   private String[] T01S114_A14525AlbRLot2 ;
   private String[] T01S114_A6464AlbRTelar ;
   private java.math.BigDecimal[] T01S114_A6465AlbRLu ;
   private java.math.BigDecimal[] T01S114_A6470AlbRTara ;
   private String[] T01S114_A4602AlbRMdlCod ;
   private String[] T01S114_A8035AlbMaqTej ;
   private String[] T01S114_A8028AlbNumB ;
   private java.math.BigDecimal[] T01S114_A60AlbRUniUti ;
   private int[] T01S114_A52AlbRPieEnt ;
   private int[] T01S114_A54AlbRPieUti ;
   private java.math.BigDecimal[] T01S114_A6180AlbrUniC ;
   private int[] T01S114_A6181AlbrPieC ;
   private String[] T01S114_A50AlbRLoc ;
   private String[] T01S114_A55AlbRReo ;
   private int[] T01S114_A53AlbRPieReb ;
   private java.math.BigDecimal[] T01S114_A59AlbRUniReb ;
   private java.util.Date[] T01S114_A48AlbRFecUlt ;
   private String[] T01S114_A1212TipEntNom ;
   private boolean[] T01S114_n1212TipEntNom ;
   private short[] T01S114_A1222AlbNumEti ;
   private byte[] T01S114_A1301AlbRUlin ;
   private java.math.BigDecimal[] T01S114_A4290AlbPmPPza ;
   private short[] T01S114_A4920AlbRGrm2 ;
   private short[] T01S114_A4921AlbRAnc ;
   private short[] T01S114_A4922AlbPml ;
   private java.math.BigDecimal[] T01S114_A5743AlbRPre ;
   private java.math.BigDecimal[] T01S114_A5744AlbRAju ;
   private byte[] T01S114_A5745AlbRRep ;
   private String[] T01S114_A6178AlbrUsu ;
   private String[] T01S114_A6182AlbrNF ;
   private java.util.Date[] T01S114_A6183AlbrFeNf ;
   private String[] T01S114_A6184AlbrCfop ;
   private String[] T01S114_A3359AlbRDisCli ;
   private String[] T01S114_A3360AlbRImp ;
   private java.math.BigDecimal[] T01S114_A6471AlbRUniB ;
   private String[] T01S114_A6488AlbDocPrv ;
   private java.math.BigDecimal[] T01S114_A6523AlbRUdas ;
   private String[] T01S114_A4793AlmNom ;
   private boolean[] T01S114_n4793AlmNom ;
   private String[] T01S114_A8023AlbColor ;
   private String[] T01S114_A8024AlbOpsT ;
   private String[] T01S114_A8025AlbOpsC ;
   private String[] T01S114_A8026AlbOC ;
   private String[] T01S114_A8027AlbHdri ;
   private String[] T01S114_A8029AlbNumM ;
   private java.math.BigDecimal[] T01S114_A8030AlbAncC ;
   private short[] T01S114_A8031AlbDndC ;
   private java.math.BigDecimal[] T01S114_A8032AlbAncCr ;
   private short[] T01S114_A8033AlbDndCr ;
   private short[] T01S114_A8036AlbDmt ;
   private short[] T01S114_A8034AlbGalga ;
   private String[] T01S114_A9793AlbPdaC ;
   private String[] T01S114_A9794AlbOStj ;
   private byte[] T01S114_A317AlbStLot ;
   private byte[] T01S114_A10358AlbTurno ;
   private String[] T01S114_A8723CliEst ;
   private String[] T01S114_A396EmprCod ;
   private int[] T01S114_A252CliCod ;
   private short[] T01S114_A6263AlbRTartC ;
   private boolean[] T01S114_n6263AlbRTartC ;
   private short[] T01S114_A840TrnCod ;
   private boolean[] T01S114_n840TrnCod ;
   private short[] T01S114_A970ProceCod ;
   private boolean[] T01S114_n970ProceCod ;
   private short[] T01S114_A1211TipEntCod ;
   private boolean[] T01S114_n1211TipEntCod ;
   private byte[] T01S114_A4792AlmCod ;
   private boolean[] T01S114_n4792AlmCod ;
   private java.math.BigDecimal[] T01S114_A13982AlbRArtLu ;
   private boolean[] T01S114_n13982AlbRArtLu ;
   private String[] T01S115_A407EmprNom ;
   private boolean[] T01S115_n407EmprNom ;
   private String[] T01S116_A279CliNom ;
   private String[] T01S116_A8723CliEst ;
   private String[] T01S117_A6264AlbRTartD ;
   private boolean[] T01S117_n6264AlbRTartD ;
   private String[] T01S118_A841TrnNom ;
   private boolean[] T01S118_n841TrnNom ;
   private String[] T01S119_A971ProceNom ;
   private boolean[] T01S119_n971ProceNom ;
   private String[] T01S120_A1212TipEntNom ;
   private boolean[] T01S120_n1212TipEntNom ;
   private String[] T01S121_A4793AlmNom ;
   private boolean[] T01S121_n4793AlmNom ;
   private java.math.BigDecimal[] T01S122_A13982AlbRArtLu ;
   private boolean[] T01S122_n13982AlbRArtLu ;
   private String[] T01S123_A396EmprCod ;
   private int[] T01S123_A44AlbRecCod ;
   private boolean[] T01S123_n44AlbRecCod ;
   private int[] T01S15_A44AlbRecCod ;
   private boolean[] T01S15_n44AlbRecCod ;
   private String[] T01S15_A45AlbRef ;
   private java.math.BigDecimal[] T01S15_A58AlbRUniEnt ;
   private String[] T01S15_A46AlbREnt ;
   private String[] T01S15_A5806AlbREnt2 ;
   private String[] T01S15_A56AlbRUni ;
   private byte[] T01S15_A47AlbREst ;
   private String[] T01S15_A12879AlbOEKOTEX ;
   private String[] T01S15_A3613AlbRefDsc ;
   private java.util.Date[] T01S15_A49AlbRFen ;
   private java.util.Date[] T01S15_A6179AlbrHor ;
   private String[] T01S15_A4601AlbRTam ;
   private String[] T01S15_A9749Emp_Item1 ;
   private String[] T01S15_A1291AlbRDes ;
   private String[] T01S15_A6463AlbRLote ;
   private String[] T01S15_A14525AlbRLot2 ;
   private String[] T01S15_A6464AlbRTelar ;
   private java.math.BigDecimal[] T01S15_A6465AlbRLu ;
   private java.math.BigDecimal[] T01S15_A6470AlbRTara ;
   private String[] T01S15_A4602AlbRMdlCod ;
   private String[] T01S15_A8035AlbMaqTej ;
   private String[] T01S15_A8028AlbNumB ;
   private java.math.BigDecimal[] T01S15_A60AlbRUniUti ;
   private int[] T01S15_A52AlbRPieEnt ;
   private int[] T01S15_A54AlbRPieUti ;
   private java.math.BigDecimal[] T01S15_A6180AlbrUniC ;
   private int[] T01S15_A6181AlbrPieC ;
   private String[] T01S15_A50AlbRLoc ;
   private String[] T01S15_A55AlbRReo ;
   private int[] T01S15_A53AlbRPieReb ;
   private java.math.BigDecimal[] T01S15_A59AlbRUniReb ;
   private java.util.Date[] T01S15_A48AlbRFecUlt ;
   private short[] T01S15_A1222AlbNumEti ;
   private byte[] T01S15_A1301AlbRUlin ;
   private java.math.BigDecimal[] T01S15_A4290AlbPmPPza ;
   private short[] T01S15_A4920AlbRGrm2 ;
   private short[] T01S15_A4921AlbRAnc ;
   private short[] T01S15_A4922AlbPml ;
   private java.math.BigDecimal[] T01S15_A5743AlbRPre ;
   private java.math.BigDecimal[] T01S15_A5744AlbRAju ;
   private byte[] T01S15_A5745AlbRRep ;
   private String[] T01S15_A6178AlbrUsu ;
   private String[] T01S15_A6182AlbrNF ;
   private java.util.Date[] T01S15_A6183AlbrFeNf ;
   private String[] T01S15_A6184AlbrCfop ;
   private String[] T01S15_A3359AlbRDisCli ;
   private String[] T01S15_A3360AlbRImp ;
   private java.math.BigDecimal[] T01S15_A6471AlbRUniB ;
   private String[] T01S15_A6488AlbDocPrv ;
   private java.math.BigDecimal[] T01S15_A6523AlbRUdas ;
   private String[] T01S15_A8023AlbColor ;
   private String[] T01S15_A8024AlbOpsT ;
   private String[] T01S15_A8025AlbOpsC ;
   private String[] T01S15_A8026AlbOC ;
   private String[] T01S15_A8027AlbHdri ;
   private String[] T01S15_A8029AlbNumM ;
   private java.math.BigDecimal[] T01S15_A8030AlbAncC ;
   private short[] T01S15_A8031AlbDndC ;
   private java.math.BigDecimal[] T01S15_A8032AlbAncCr ;
   private short[] T01S15_A8033AlbDndCr ;
   private short[] T01S15_A8036AlbDmt ;
   private short[] T01S15_A8034AlbGalga ;
   private String[] T01S15_A9793AlbPdaC ;
   private String[] T01S15_A9794AlbOStj ;
   private byte[] T01S15_A317AlbStLot ;
   private byte[] T01S15_A10358AlbTurno ;
   private String[] T01S15_A396EmprCod ;
   private int[] T01S15_A252CliCod ;
   private short[] T01S15_A6263AlbRTartC ;
   private boolean[] T01S15_n6263AlbRTartC ;
   private short[] T01S15_A840TrnCod ;
   private boolean[] T01S15_n840TrnCod ;
   private short[] T01S15_A970ProceCod ;
   private boolean[] T01S15_n970ProceCod ;
   private short[] T01S15_A1211TipEntCod ;
   private boolean[] T01S15_n1211TipEntCod ;
   private byte[] T01S15_A4792AlmCod ;
   private boolean[] T01S15_n4792AlmCod ;
   private String[] T01S124_A396EmprCod ;
   private int[] T01S124_A44AlbRecCod ;
   private boolean[] T01S124_n44AlbRecCod ;
   private String[] T01S125_A396EmprCod ;
   private int[] T01S125_A44AlbRecCod ;
   private boolean[] T01S125_n44AlbRecCod ;
   private int[] T01S14_A44AlbRecCod ;
   private boolean[] T01S14_n44AlbRecCod ;
   private String[] T01S14_A45AlbRef ;
   private java.math.BigDecimal[] T01S14_A58AlbRUniEnt ;
   private String[] T01S14_A46AlbREnt ;
   private String[] T01S14_A5806AlbREnt2 ;
   private String[] T01S14_A56AlbRUni ;
   private byte[] T01S14_A47AlbREst ;
   private String[] T01S14_A12879AlbOEKOTEX ;
   private String[] T01S14_A3613AlbRefDsc ;
   private java.util.Date[] T01S14_A49AlbRFen ;
   private java.util.Date[] T01S14_A6179AlbrHor ;
   private String[] T01S14_A4601AlbRTam ;
   private String[] T01S14_A9749Emp_Item1 ;
   private String[] T01S14_A1291AlbRDes ;
   private String[] T01S14_A6463AlbRLote ;
   private String[] T01S14_A14525AlbRLot2 ;
   private String[] T01S14_A6464AlbRTelar ;
   private java.math.BigDecimal[] T01S14_A6465AlbRLu ;
   private java.math.BigDecimal[] T01S14_A6470AlbRTara ;
   private String[] T01S14_A4602AlbRMdlCod ;
   private String[] T01S14_A8035AlbMaqTej ;
   private String[] T01S14_A8028AlbNumB ;
   private java.math.BigDecimal[] T01S14_A60AlbRUniUti ;
   private int[] T01S14_A52AlbRPieEnt ;
   private int[] T01S14_A54AlbRPieUti ;
   private java.math.BigDecimal[] T01S14_A6180AlbrUniC ;
   private int[] T01S14_A6181AlbrPieC ;
   private String[] T01S14_A50AlbRLoc ;
   private String[] T01S14_A55AlbRReo ;
   private int[] T01S14_A53AlbRPieReb ;
   private java.math.BigDecimal[] T01S14_A59AlbRUniReb ;
   private java.util.Date[] T01S14_A48AlbRFecUlt ;
   private short[] T01S14_A1222AlbNumEti ;
   private byte[] T01S14_A1301AlbRUlin ;
   private java.math.BigDecimal[] T01S14_A4290AlbPmPPza ;
   private short[] T01S14_A4920AlbRGrm2 ;
   private short[] T01S14_A4921AlbRAnc ;
   private short[] T01S14_A4922AlbPml ;
   private java.math.BigDecimal[] T01S14_A5743AlbRPre ;
   private java.math.BigDecimal[] T01S14_A5744AlbRAju ;
   private byte[] T01S14_A5745AlbRRep ;
   private String[] T01S14_A6178AlbrUsu ;
   private String[] T01S14_A6182AlbrNF ;
   private java.util.Date[] T01S14_A6183AlbrFeNf ;
   private String[] T01S14_A6184AlbrCfop ;
   private String[] T01S14_A3359AlbRDisCli ;
   private String[] T01S14_A3360AlbRImp ;
   private java.math.BigDecimal[] T01S14_A6471AlbRUniB ;
   private String[] T01S14_A6488AlbDocPrv ;
   private java.math.BigDecimal[] T01S14_A6523AlbRUdas ;
   private String[] T01S14_A8023AlbColor ;
   private String[] T01S14_A8024AlbOpsT ;
   private String[] T01S14_A8025AlbOpsC ;
   private String[] T01S14_A8026AlbOC ;
   private String[] T01S14_A8027AlbHdri ;
   private String[] T01S14_A8029AlbNumM ;
   private java.math.BigDecimal[] T01S14_A8030AlbAncC ;
   private short[] T01S14_A8031AlbDndC ;
   private java.math.BigDecimal[] T01S14_A8032AlbAncCr ;
   private short[] T01S14_A8033AlbDndCr ;
   private short[] T01S14_A8036AlbDmt ;
   private short[] T01S14_A8034AlbGalga ;
   private String[] T01S14_A9793AlbPdaC ;
   private String[] T01S14_A9794AlbOStj ;
   private byte[] T01S14_A317AlbStLot ;
   private byte[] T01S14_A10358AlbTurno ;
   private String[] T01S14_A396EmprCod ;
   private int[] T01S14_A252CliCod ;
   private short[] T01S14_A6263AlbRTartC ;
   private boolean[] T01S14_n6263AlbRTartC ;
   private short[] T01S14_A840TrnCod ;
   private boolean[] T01S14_n840TrnCod ;
   private short[] T01S14_A970ProceCod ;
   private boolean[] T01S14_n970ProceCod ;
   private short[] T01S14_A1211TipEntCod ;
   private boolean[] T01S14_n1211TipEntCod ;
   private byte[] T01S14_A4792AlmCod ;
   private boolean[] T01S14_n4792AlmCod ;
   private String[] T01S129_A407EmprNom ;
   private boolean[] T01S129_n407EmprNom ;
   private String[] T01S130_A279CliNom ;
   private String[] T01S130_A8723CliEst ;
   private java.math.BigDecimal[] T01S131_A13982AlbRArtLu ;
   private boolean[] T01S131_n13982AlbRArtLu ;
   private String[] T01S132_A6264AlbRTartD ;
   private boolean[] T01S132_n6264AlbRTartD ;
   private String[] T01S133_A841TrnNom ;
   private boolean[] T01S133_n841TrnNom ;
   private String[] T01S134_A971ProceNom ;
   private boolean[] T01S134_n971ProceNom ;
   private String[] T01S135_A1212TipEntNom ;
   private boolean[] T01S135_n1212TipEntNom ;
   private String[] T01S136_A4793AlmNom ;
   private boolean[] T01S136_n4793AlmNom ;
   private String[] T01S137_A396EmprCod ;
   private int[] T01S137_A13026PedDGId ;
   private int[] T01S137_A44AlbRecCod ;
   private boolean[] T01S137_n44AlbRecCod ;
   private String[] T01S138_A396EmprCod ;
   private int[] T01S138_A11669DevCruId ;
   private int[] T01S138_A44AlbRecCod ;
   private boolean[] T01S138_n44AlbRecCod ;
   private String[] T01S139_A396EmprCod ;
   private int[] T01S139_A44AlbRecCod ;
   private boolean[] T01S139_n44AlbRecCod ;
   private String[] T01S139_A9743Emp_CUb ;
   private short[] T01S139_A5860Emp_Anp ;
   private String[] T01S140_A396EmprCod ;
   private int[] T01S140_A44AlbRecCod ;
   private boolean[] T01S140_n44AlbRecCod ;
   private String[] T01S140_A7130MatC_Pz ;
   private String[] T01S141_A396EmprCod ;
   private int[] T01S141_A44AlbRecCod ;
   private boolean[] T01S141_n44AlbRecCod ;
   private String[] T01S141_A7132MatC_Talla ;
   private String[] T01S142_A396EmprCod ;
   private int[] T01S142_A44AlbRecCod ;
   private boolean[] T01S142_n44AlbRecCod ;
   private short[] T01S142_A7115MatC_Lin ;
   private String[] T01S143_A396EmprCod ;
   private long[] T01S143_A30AlbProCod ;
   private int[] T01S143_A129BarCod ;
   private byte[] T01S143_A132BarCodReo ;
   private String[] T01S143_A130BarCodPar ;
   private short[] T01S143_A6622AlbHdRLn ;
   private String[] T01S144_A396EmprCod ;
   private int[] T01S144_A6235DevEmpCod ;
   private byte[] T01S144_A6243DevNumLin ;
   private String[] T01S145_A396EmprCod ;
   private int[] T01S145_A44AlbRecCod ;
   private boolean[] T01S145_n44AlbRecCod ;
   private short[] T01S145_A4596AlbRDefCod ;
   private String[] T01S146_A396EmprCod ;
   private int[] T01S146_A44AlbRecCod ;
   private boolean[] T01S146_n44AlbRecCod ;
   private String[] T01S146_A2159AlbRecPie ;
   private String[] T01S147_A396EmprCod ;
   private int[] T01S147_A44AlbRecCod ;
   private boolean[] T01S147_n44AlbRecCod ;
   private short[] T01S147_A2165HisEmpLin ;
   private String[] T01S148_A396EmprCod ;
   private int[] T01S148_A361DisCod ;
   private int[] T01S148_A44AlbRecCod ;
   private boolean[] T01S148_n44AlbRecCod ;
   private String[] T01S149_A396EmprCod ;
   private int[] T01S149_A323DevGenCod ;
   private String[] T01S150_A396EmprCod ;
   private int[] T01S150_A129BarCod ;
   private byte[] T01S150_A132BarCodReo ;
   private String[] T01S150_A130BarCodPar ;
   private String[] T01S150_A200BarPieCod ;
   private String[] T01S152_A396EmprCod ;
   private int[] T01S152_A44AlbRecCod ;
   private boolean[] T01S152_n44AlbRecCod ;
   private int[] T01S153_A44AlbRecCod ;
   private boolean[] T01S153_n44AlbRecCod ;
   private byte[] T01S153_A1299AlbRLin ;
   private String[] T01S153_A1300AlbRObs ;
   private String[] T01S153_A396EmprCod ;
   private String[] T01S154_A396EmprCod ;
   private int[] T01S154_A44AlbRecCod ;
   private boolean[] T01S154_n44AlbRecCod ;
   private byte[] T01S154_A1299AlbRLin ;
   private int[] T01S13_A44AlbRecCod ;
   private boolean[] T01S13_n44AlbRecCod ;
   private byte[] T01S13_A1299AlbRLin ;
   private String[] T01S13_A1300AlbRObs ;
   private String[] T01S13_A396EmprCod ;
   private int[] T01S12_A44AlbRecCod ;
   private boolean[] T01S12_n44AlbRecCod ;
   private byte[] T01S12_A1299AlbRLin ;
   private String[] T01S12_A1300AlbRObs ;
   private String[] T01S12_A396EmprCod ;
   private String[] T01S158_A396EmprCod ;
   private int[] T01S158_A44AlbRecCod ;
   private boolean[] T01S158_n44AlbRecCod ;
   private byte[] T01S158_A1299AlbRLin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.webpanels.WebSession AV80WebSession ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV94CliCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV101AlbRef_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV95TrnCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV96ProceCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV98TipEntCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV104AlmCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item14 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item15[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV79TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV87TrnContextAtt ;
   private app.wwpbaseobjects.SdtWWPContext AV78WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV103DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[] ;
}

final  class almacentejido__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class almacentejido__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class almacentejido__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class almacentejido__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class almacentejido__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01S12", "SELECT AlbRecCod, AlbRLin, AlbRObs, EmprCod FROM TXPALBROB WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRLin = ?  FOR UPDATE OF AlbRObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01S13", "SELECT AlbRecCod, AlbRLin, AlbRObs, EmprCod FROM TXPALBROB WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01S14", "SELECT AlbRecCod, AlbRef, AlbRUniEnt, AlbREnt, AlbREnt2, AlbRUni, AlbREst, AlbOEKOTEX, AlbRefDsc, AlbRFen, AlbrHor, AlbRTam, Emp_Item1, AlbRDes, AlbRLote, AlbRLot2, AlbRTelar, AlbRLu, AlbRTara, AlbRMdlCod, AlbMaqTej, AlbNumB, AlbRUniUti, AlbRPieEnt, AlbRPieUti, AlbrUniC, AlbrPieC, AlbRLoc, AlbRReo, AlbRPieReb, AlbRUniReb, AlbRFecUlt, AlbNumEti, AlbRUlin, AlbPmPPza, AlbRGrm2, AlbRAnc, AlbPml, AlbRPre, AlbRAju, AlbRRep, AlbrUsu, AlbrNF, AlbrFeNf, AlbrCfop, AlbRDisCli, AlbRImp, AlbRUniB, AlbDocPrv, AlbRUdas, AlbColor, AlbOpsT, AlbOpsC, AlbOC, AlbHdri, AlbNumM, AlbAncC, AlbDndC, AlbAncCr, AlbDndCr, AlbDmt, AlbGalga, AlbPdaC, AlbOStj, AlbStLot, AlbTurno, EmprCod, CliCod, AlbRTartC, TrnCod, ProceCod, TipEntCod, AlmCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ?  FOR UPDATE OF AlbRef, AlbRUniEnt, AlbREnt, AlbREnt2, AlbRUni, AlbREst, AlbOEKOTEX, AlbRefDsc, AlbRFen, AlbrHor, AlbRTam, Emp_Item1, AlbRDes, AlbRLote, AlbRLot2, AlbRTelar, AlbRLu, AlbRTara, AlbRMdlCod, AlbMaqTej, AlbNumB, AlbRUniUti, AlbRPieEnt, AlbRPieUti, AlbrUniC, AlbrPieC, AlbRLoc, AlbRReo, AlbRPieReb, AlbRUniReb, AlbRFecUlt, AlbNumEti, AlbRUlin, AlbPmPPza, AlbRGrm2, AlbRAnc, AlbPml, AlbRPre, AlbRAju, AlbRRep, AlbrUsu, AlbrNF, AlbrFeNf, AlbrCfop, AlbRDisCli, AlbRImp, AlbRUniB, AlbDocPrv, AlbRUdas, AlbColor, AlbOpsT, AlbOpsC, AlbOC, AlbHdri, AlbNumM, AlbAncC, AlbDndC, AlbAncCr, AlbDndCr, AlbDmt, AlbGalga, AlbPdaC, AlbOStj, AlbStLot, AlbTurno, CliCod, AlbRTartC, TrnCod, ProceCod, TipEntCod, AlmCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01S15", "SELECT AlbRecCod, AlbRef, AlbRUniEnt, AlbREnt, AlbREnt2, AlbRUni, AlbREst, AlbOEKOTEX, AlbRefDsc, AlbRFen, AlbrHor, AlbRTam, Emp_Item1, AlbRDes, AlbRLote, AlbRLot2, AlbRTelar, AlbRLu, AlbRTara, AlbRMdlCod, AlbMaqTej, AlbNumB, AlbRUniUti, AlbRPieEnt, AlbRPieUti, AlbrUniC, AlbrPieC, AlbRLoc, AlbRReo, AlbRPieReb, AlbRUniReb, AlbRFecUlt, AlbNumEti, AlbRUlin, AlbPmPPza, AlbRGrm2, AlbRAnc, AlbPml, AlbRPre, AlbRAju, AlbRRep, AlbrUsu, AlbrNF, AlbrFeNf, AlbrCfop, AlbRDisCli, AlbRImp, AlbRUniB, AlbDocPrv, AlbRUdas, AlbColor, AlbOpsT, AlbOpsC, AlbOC, AlbHdri, AlbNumM, AlbAncC, AlbDndC, AlbAncCr, AlbDndCr, AlbDmt, AlbGalga, AlbPdaC, AlbOStj, AlbStLot, AlbTurno, EmprCod, CliCod, AlbRTartC, TrnCod, ProceCod, TipEntCod, AlmCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01S16", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01S17", "SELECT CliNom, CliEst FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01S18", "SELECT TipArtDsc AS AlbRTartD FROM TXPTIPART WHERE EmprCod = ? AND TipArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01S19", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01S110", "SELECT ProceNom FROM TXPPROCED WHERE EmprCod = ? AND ProceCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01S111", "SELECT TipEntNom FROM TXPENTRAD WHERE EmprCod = ? AND TipEntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01S112", "SELECT AlmNom FROM TXPAlmace WHERE EmprCod = ? AND AlmCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01S113", "SELECT COALESCE( ArtLu, 0) AS AlbRArtLu FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01S114", "SELECT /*+ FIRST_ROWS(100) */ T4.ArtCod, TM1.AlbRecCod, TM1.AlbRef, TM1.AlbRUniEnt, TM1.AlbREnt, TM1.AlbREnt2, TM1.AlbRUni, TM1.AlbREst, TM1.AlbOEKOTEX, TM1.AlbRefDsc, T5.TipArtDsc AS AlbRTartD, T2.EmprNom, T3.CliNom, TM1.AlbRFen, TM1.AlbrHor, TM1.AlbRTam, TM1.Emp_Item1, T6.TrnNom, TM1.AlbRDes, T7.ProceNom, TM1.AlbRLote, TM1.AlbRLot2, TM1.AlbRTelar, TM1.AlbRLu, TM1.AlbRTara, TM1.AlbRMdlCod, TM1.AlbMaqTej, TM1.AlbNumB, TM1.AlbRUniUti, TM1.AlbRPieEnt, TM1.AlbRPieUti, TM1.AlbrUniC, TM1.AlbrPieC, TM1.AlbRLoc, TM1.AlbRReo, TM1.AlbRPieReb, TM1.AlbRUniReb, TM1.AlbRFecUlt, T8.TipEntNom, TM1.AlbNumEti, TM1.AlbRUlin, TM1.AlbPmPPza, TM1.AlbRGrm2, TM1.AlbRAnc, TM1.AlbPml, TM1.AlbRPre, TM1.AlbRAju, TM1.AlbRRep, TM1.AlbrUsu, TM1.AlbrNF, TM1.AlbrFeNf, TM1.AlbrCfop, TM1.AlbRDisCli, TM1.AlbRImp, TM1.AlbRUniB, TM1.AlbDocPrv, TM1.AlbRUdas, T9.AlmNom, TM1.AlbColor, TM1.AlbOpsT, TM1.AlbOpsC, TM1.AlbOC, TM1.AlbHdri, TM1.AlbNumM, TM1.AlbAncC, TM1.AlbDndC, TM1.AlbAncCr, TM1.AlbDndCr, TM1.AlbDmt, TM1.AlbGalga, TM1.AlbPdaC, TM1.AlbOStj, TM1.AlbStLot, TM1.AlbTurno, T3.CliEst, TM1.EmprCod, TM1.CliCod, TM1.AlbRTartC AS AlbRTartC, TM1.TrnCod, TM1.ProceCod, TM1.TipEntCod, TM1.AlmCod, COALESCE( T4.ArtLu, 0) AS AlbRArtLu FROM ((((((((TXPALBREC TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) LEFT JOIN TXPARTICU T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = TM1.CliCod AND T4.ArtCod = TM1.AlbRef) LEFT JOIN TXPTIPART T5 ON T5.EmprCod = TM1.EmprCod AND T5.TipArtCod = TM1.AlbRTartC) LEFT JOIN TXPTRANSP T6 ON T6.EmprCod = TM1.EmprCod AND T6.TrnCod = TM1.TrnCod) LEFT JOIN TXPPROCED T7 ON T7.EmprCod = TM1.EmprCod AND T7.ProceCod = TM1.ProceCod) LEFT JOIN TXPENTRAD T8 ON T8.EmprCod = TM1.EmprCod AND T8.TipEntCod = TM1.TipEntCod) LEFT JOIN TXPAlmace T9 ON T9.EmprCod = TM1.EmprCod AND T9.AlmCod = TM1.AlmCod) WHERE TM1.EmprCod = ? and TM1.AlbRecCod = ? ORDER BY TM1.EmprCod, TM1.AlbRecCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01S115", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01S116", "SELECT CliNom, CliEst FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01S117", "SELECT TipArtDsc AS AlbRTartD FROM TXPTIPART WHERE EmprCod = ? AND TipArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01S118", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01S119", "SELECT ProceNom FROM TXPPROCED WHERE EmprCod = ? AND ProceCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01S120", "SELECT TipEntNom FROM TXPENTRAD WHERE EmprCod = ? AND TipEntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01S121", "SELECT AlmNom FROM TXPAlmace WHERE EmprCod = ? AND AlmCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01S122", "SELECT COALESCE( ArtLu, 0) AS AlbRArtLu FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01S123", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbRecCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01S124", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbRecCod FROM TXPALBREC WHERE ( EmprCod > ? or EmprCod = ? and AlbRecCod > ?) ORDER BY EmprCod, AlbRecCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01S125", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbRecCod FROM TXPALBREC WHERE ( EmprCod < ? or EmprCod = ? and AlbRecCod < ?) ORDER BY EmprCod DESC, AlbRecCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01S126", "INSERT INTO TXPALBREC(AlbRecCod, AlbRef, AlbRUniEnt, AlbREnt, AlbREnt2, AlbRUni, AlbREst, AlbOEKOTEX, AlbRefDsc, AlbRFen, AlbrHor, AlbRTam, Emp_Item1, AlbRDes, AlbRLote, AlbRLot2, AlbRTelar, AlbRLu, AlbRTara, AlbRMdlCod, AlbMaqTej, AlbNumB, AlbRUniUti, AlbRPieEnt, AlbRPieUti, AlbrUniC, AlbrPieC, AlbRLoc, AlbRReo, AlbRPieReb, AlbRUniReb, AlbRFecUlt, AlbNumEti, AlbRUlin, AlbPmPPza, AlbRGrm2, AlbRAnc, AlbPml, AlbRPre, AlbRAju, AlbRRep, AlbrUsu, AlbrNF, AlbrFeNf, AlbrCfop, AlbRDisCli, AlbRImp, AlbRUniB, AlbDocPrv, AlbRUdas, AlbColor, AlbOpsT, AlbOpsC, AlbOC, AlbHdri, AlbNumM, AlbAncC, AlbDndC, AlbAncCr, AlbDndCr, AlbDmt, AlbGalga, AlbPdaC, AlbOStj, AlbStLot, AlbTurno, EmprCod, CliCod, AlbRTartC, TrnCod, ProceCod, TipEntCod, AlmCod, HisEmpULin, AlbRUniLot, AlbRPieLot, AlbRHEn, ClasCod, MatC_ULin, AlbRecSec, Bod_UltPz, AlbUltP, Cod_mta, AlbRPh, AlbRRLong, AlbRRTrans) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', 0, 0, 0, 0, 0)", GX_NOMASK, "TXPALBREC")
         ,new UpdateCursor("T01S127", "UPDATE TXPALBREC SET AlbRef=?, AlbRUniEnt=?, AlbREnt=?, AlbREnt2=?, AlbRUni=?, AlbREst=?, AlbOEKOTEX=?, AlbRefDsc=?, AlbRFen=?, AlbrHor=?, AlbRTam=?, Emp_Item1=?, AlbRDes=?, AlbRLote=?, AlbRLot2=?, AlbRTelar=?, AlbRLu=?, AlbRTara=?, AlbRMdlCod=?, AlbMaqTej=?, AlbNumB=?, AlbRUniUti=?, AlbRPieEnt=?, AlbRPieUti=?, AlbrUniC=?, AlbrPieC=?, AlbRLoc=?, AlbRReo=?, AlbRPieReb=?, AlbRUniReb=?, AlbRFecUlt=?, AlbNumEti=?, AlbRUlin=?, AlbPmPPza=?, AlbRGrm2=?, AlbRAnc=?, AlbPml=?, AlbRPre=?, AlbRAju=?, AlbRRep=?, AlbrUsu=?, AlbrNF=?, AlbrFeNf=?, AlbrCfop=?, AlbRDisCli=?, AlbRImp=?, AlbRUniB=?, AlbDocPrv=?, AlbRUdas=?, AlbColor=?, AlbOpsT=?, AlbOpsC=?, AlbOC=?, AlbHdri=?, AlbNumM=?, AlbAncC=?, AlbDndC=?, AlbAncCr=?, AlbDndCr=?, AlbDmt=?, AlbGalga=?, AlbPdaC=?, AlbOStj=?, AlbStLot=?, AlbTurno=?, CliCod=?, AlbRTartC=?, TrnCod=?, ProceCod=?, TipEntCod=?, AlmCod=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPALBREC")
         ,new UpdateCursor("T01S128", "DELETE FROM TXPALBREC  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPALBREC")
         ,new ForEachCursor("T01S129", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01S130", "SELECT CliNom, CliEst FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01S131", "SELECT COALESCE( ArtLu, 0) AS AlbRArtLu FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01S132", "SELECT TipArtDsc AS AlbRTartD FROM TXPTIPART WHERE EmprCod = ? AND TipArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01S133", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01S134", "SELECT ProceNom FROM TXPPROCED WHERE EmprCod = ? AND ProceCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01S135", "SELECT TipEntNom FROM TXPENTRAD WHERE EmprCod = ? AND TipEntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01S136", "SELECT AlmNom FROM TXPAlmace WHERE EmprCod = ? AND AlmCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01S137", "SELECT * FROM (SELECT EmprCod, PedDGId, AlbRecCod FROM TXPPEDDG3 WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01S138", "SELECT * FROM (SELECT EmprCod, DevCruId, AlbRecCod FROM TXPDEVCR1 WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01S139", "SELECT * FROM (SELECT EmprCod, AlbRecCod, Emp_CUb, Emp_Anp FROM TXPUBIIN WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01S140", "SELECT * FROM (SELECT EmprCod, AlbRecCod, MatC_Pz FROM TXPREPPZS WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01S141", "SELECT * FROM (SELECT EmprCod, AlbRecCod, MatC_Talla FROM TXPREPTAL WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01S142", "SELECT * FROM (SELECT EmprCod, AlbRecCod, MatC_Lin FROM TXPREPMAT WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01S143", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdRLn FROM TXPALBREP WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01S144", "SELECT * FROM (SELECT EmprCod, DevEmpCod, DevNumLin FROM TXPDEVEM1 WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01S145", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRDefCod FROM TXPALBRDF WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01S146", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRecPie FROM TXPALBDET WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01S147", "SELECT * FROM (SELECT EmprCod, AlbRecCod, HisEmpLin FROM TXPHISEMP WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01S148", "SELECT * FROM (SELECT EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01S149", "SELECT * FROM (SELECT EmprCod, DevGenCod FROM TXPDEVGEN WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01S150", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01S151", "UPDATE TXPALBREC SET AlbRUlin=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPALBREC")
         ,new ForEachCursor("T01S152", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, AlbRecCod FROM TXPALBREC ORDER BY EmprCod, AlbRecCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01S153", "SELECT AlbRecCod, AlbRLin, AlbRObs, EmprCod FROM TXPALBROB WHERE EmprCod = ? and AlbRecCod = ? and AlbRLin = ? ORDER BY EmprCod, AlbRecCod, AlbRLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01S154", "SELECT EmprCod, AlbRecCod, AlbRLin FROM TXPALBROB WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01S155", "INSERT INTO TXPALBROB(AlbRecCod, AlbRLin, AlbRObs, EmprCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPALBROB")
         ,new UpdateCursor("T01S156", "UPDATE TXPALBROB SET AlbRObs=?  WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRLin = ?", GX_NOMASK, "TXPALBROB")
         ,new UpdateCursor("T01S157", "DELETE FROM TXPALBROB  WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRLin = ?", GX_NOMASK, "TXPALBROB")
         ,new ForEachCursor("T01S158", "SELECT EmprCod, AlbRecCod, AlbRLin FROM TXPALBROB WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod, AlbRLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((java.util.Date[]) buf[10])[0] = GXutil.resetDate(rslt.getGXDateTime(11));
               ((String[]) buf[11])[0] = rslt.getString(12, 4);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((String[]) buf[13])[0] = rslt.getString(14, 20);
               ((String[]) buf[14])[0] = rslt.getString(15, 20);
               ((String[]) buf[15])[0] = rslt.getVarchar(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 20);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(19,2);
               ((String[]) buf[19])[0] = rslt.getString(20, 13);
               ((String[]) buf[20])[0] = rslt.getString(21, 12);
               ((String[]) buf[21])[0] = rslt.getString(22, 20);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(23,2);
               ((int[]) buf[23])[0] = rslt.getInt(24);
               ((int[]) buf[24])[0] = rslt.getInt(25);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(26,2);
               ((int[]) buf[26])[0] = rslt.getInt(27);
               ((String[]) buf[27])[0] = rslt.getString(28, 10);
               ((String[]) buf[28])[0] = rslt.getString(29, 2);
               ((int[]) buf[29])[0] = rslt.getInt(30);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(31,2);
               ((java.util.Date[]) buf[31])[0] = rslt.getGXDate(32);
               ((short[]) buf[32])[0] = rslt.getShort(33);
               ((byte[]) buf[33])[0] = rslt.getByte(34);
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(35,3);
               ((short[]) buf[35])[0] = rslt.getShort(36);
               ((short[]) buf[36])[0] = rslt.getShort(37);
               ((short[]) buf[37])[0] = rslt.getShort(38);
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(39,5);
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(40,2);
               ((byte[]) buf[40])[0] = rslt.getByte(41);
               ((String[]) buf[41])[0] = rslt.getString(42, 10);
               ((String[]) buf[42])[0] = rslt.getString(43, 1);
               ((java.util.Date[]) buf[43])[0] = rslt.getGXDate(44);
               ((String[]) buf[44])[0] = rslt.getString(45, 5);
               ((String[]) buf[45])[0] = rslt.getString(46, 20);
               ((String[]) buf[46])[0] = rslt.getString(47, 1);
               ((java.math.BigDecimal[]) buf[47])[0] = rslt.getBigDecimal(48,2);
               ((String[]) buf[48])[0] = rslt.getString(49, 10);
               ((java.math.BigDecimal[]) buf[49])[0] = rslt.getBigDecimal(50,2);
               ((String[]) buf[50])[0] = rslt.getString(51, 40);
               ((String[]) buf[51])[0] = rslt.getString(52, 30);
               ((String[]) buf[52])[0] = rslt.getString(53, 30);
               ((String[]) buf[53])[0] = rslt.getString(54, 12);
               ((String[]) buf[54])[0] = rslt.getString(55, 20);
               ((String[]) buf[55])[0] = rslt.getString(56, 10);
               ((java.math.BigDecimal[]) buf[56])[0] = rslt.getBigDecimal(57,2);
               ((short[]) buf[57])[0] = rslt.getShort(58);
               ((java.math.BigDecimal[]) buf[58])[0] = rslt.getBigDecimal(59,2);
               ((short[]) buf[59])[0] = rslt.getShort(60);
               ((short[]) buf[60])[0] = rslt.getShort(61);
               ((short[]) buf[61])[0] = rslt.getShort(62);
               ((String[]) buf[62])[0] = rslt.getString(63, 20);
               ((String[]) buf[63])[0] = rslt.getString(64, 20);
               ((byte[]) buf[64])[0] = rslt.getByte(65);
               ((byte[]) buf[65])[0] = rslt.getByte(66);
               ((String[]) buf[66])[0] = rslt.getString(67, 3);
               ((int[]) buf[67])[0] = rslt.getInt(68);
               ((short[]) buf[68])[0] = rslt.getShort(69);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((short[]) buf[70])[0] = rslt.getShort(70);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((short[]) buf[72])[0] = rslt.getShort(71);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((short[]) buf[74])[0] = rslt.getShort(72);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((byte[]) buf[76])[0] = rslt.getByte(73);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((java.util.Date[]) buf[10])[0] = GXutil.resetDate(rslt.getGXDateTime(11));
               ((String[]) buf[11])[0] = rslt.getString(12, 4);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((String[]) buf[13])[0] = rslt.getString(14, 20);
               ((String[]) buf[14])[0] = rslt.getString(15, 20);
               ((String[]) buf[15])[0] = rslt.getVarchar(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 20);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(19,2);
               ((String[]) buf[19])[0] = rslt.getString(20, 13);
               ((String[]) buf[20])[0] = rslt.getString(21, 12);
               ((String[]) buf[21])[0] = rslt.getString(22, 20);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(23,2);
               ((int[]) buf[23])[0] = rslt.getInt(24);
               ((int[]) buf[24])[0] = rslt.getInt(25);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(26,2);
               ((int[]) buf[26])[0] = rslt.getInt(27);
               ((String[]) buf[27])[0] = rslt.getString(28, 10);
               ((String[]) buf[28])[0] = rslt.getString(29, 2);
               ((int[]) buf[29])[0] = rslt.getInt(30);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(31,2);
               ((java.util.Date[]) buf[31])[0] = rslt.getGXDate(32);
               ((short[]) buf[32])[0] = rslt.getShort(33);
               ((byte[]) buf[33])[0] = rslt.getByte(34);
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(35,3);
               ((short[]) buf[35])[0] = rslt.getShort(36);
               ((short[]) buf[36])[0] = rslt.getShort(37);
               ((short[]) buf[37])[0] = rslt.getShort(38);
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(39,5);
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(40,2);
               ((byte[]) buf[40])[0] = rslt.getByte(41);
               ((String[]) buf[41])[0] = rslt.getString(42, 10);
               ((String[]) buf[42])[0] = rslt.getString(43, 1);
               ((java.util.Date[]) buf[43])[0] = rslt.getGXDate(44);
               ((String[]) buf[44])[0] = rslt.getString(45, 5);
               ((String[]) buf[45])[0] = rslt.getString(46, 20);
               ((String[]) buf[46])[0] = rslt.getString(47, 1);
               ((java.math.BigDecimal[]) buf[47])[0] = rslt.getBigDecimal(48,2);
               ((String[]) buf[48])[0] = rslt.getString(49, 10);
               ((java.math.BigDecimal[]) buf[49])[0] = rslt.getBigDecimal(50,2);
               ((String[]) buf[50])[0] = rslt.getString(51, 40);
               ((String[]) buf[51])[0] = rslt.getString(52, 30);
               ((String[]) buf[52])[0] = rslt.getString(53, 30);
               ((String[]) buf[53])[0] = rslt.getString(54, 12);
               ((String[]) buf[54])[0] = rslt.getString(55, 20);
               ((String[]) buf[55])[0] = rslt.getString(56, 10);
               ((java.math.BigDecimal[]) buf[56])[0] = rslt.getBigDecimal(57,2);
               ((short[]) buf[57])[0] = rslt.getShort(58);
               ((java.math.BigDecimal[]) buf[58])[0] = rslt.getBigDecimal(59,2);
               ((short[]) buf[59])[0] = rslt.getShort(60);
               ((short[]) buf[60])[0] = rslt.getShort(61);
               ((short[]) buf[61])[0] = rslt.getShort(62);
               ((String[]) buf[62])[0] = rslt.getString(63, 20);
               ((String[]) buf[63])[0] = rslt.getString(64, 20);
               ((byte[]) buf[64])[0] = rslt.getByte(65);
               ((byte[]) buf[65])[0] = rslt.getByte(66);
               ((String[]) buf[66])[0] = rslt.getString(67, 3);
               ((int[]) buf[67])[0] = rslt.getInt(68);
               ((short[]) buf[68])[0] = rslt.getShort(69);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((short[]) buf[70])[0] = rslt.getShort(70);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((short[]) buf[72])[0] = rslt.getShort(71);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((short[]) buf[74])[0] = rslt.getShort(72);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((byte[]) buf[76])[0] = rslt.getByte(73);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 25);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((String[]) buf[10])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(13, 30);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(14);
               ((java.util.Date[]) buf[16])[0] = GXutil.resetDate(rslt.getGXDateTime(15));
               ((String[]) buf[17])[0] = rslt.getString(16, 4);
               ((String[]) buf[18])[0] = rslt.getString(17, 1);
               ((String[]) buf[19])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(19, 20);
               ((String[]) buf[22])[0] = rslt.getString(20, 30);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(21, 20);
               ((String[]) buf[25])[0] = rslt.getVarchar(22);
               ((String[]) buf[26])[0] = rslt.getString(23, 20);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(24,2);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(25,2);
               ((String[]) buf[29])[0] = rslt.getString(26, 13);
               ((String[]) buf[30])[0] = rslt.getString(27, 12);
               ((String[]) buf[31])[0] = rslt.getString(28, 20);
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(29,2);
               ((int[]) buf[33])[0] = rslt.getInt(30);
               ((int[]) buf[34])[0] = rslt.getInt(31);
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(32,2);
               ((int[]) buf[36])[0] = rslt.getInt(33);
               ((String[]) buf[37])[0] = rslt.getString(34, 10);
               ((String[]) buf[38])[0] = rslt.getString(35, 2);
               ((int[]) buf[39])[0] = rslt.getInt(36);
               ((java.math.BigDecimal[]) buf[40])[0] = rslt.getBigDecimal(37,2);
               ((java.util.Date[]) buf[41])[0] = rslt.getGXDate(38);
               ((String[]) buf[42])[0] = rslt.getString(39, 25);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((short[]) buf[44])[0] = rslt.getShort(40);
               ((byte[]) buf[45])[0] = rslt.getByte(41);
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(42,3);
               ((short[]) buf[47])[0] = rslt.getShort(43);
               ((short[]) buf[48])[0] = rslt.getShort(44);
               ((short[]) buf[49])[0] = rslt.getShort(45);
               ((java.math.BigDecimal[]) buf[50])[0] = rslt.getBigDecimal(46,5);
               ((java.math.BigDecimal[]) buf[51])[0] = rslt.getBigDecimal(47,2);
               ((byte[]) buf[52])[0] = rslt.getByte(48);
               ((String[]) buf[53])[0] = rslt.getString(49, 10);
               ((String[]) buf[54])[0] = rslt.getString(50, 1);
               ((java.util.Date[]) buf[55])[0] = rslt.getGXDate(51);
               ((String[]) buf[56])[0] = rslt.getString(52, 5);
               ((String[]) buf[57])[0] = rslt.getString(53, 20);
               ((String[]) buf[58])[0] = rslt.getString(54, 1);
               ((java.math.BigDecimal[]) buf[59])[0] = rslt.getBigDecimal(55,2);
               ((String[]) buf[60])[0] = rslt.getString(56, 10);
               ((java.math.BigDecimal[]) buf[61])[0] = rslt.getBigDecimal(57,2);
               ((String[]) buf[62])[0] = rslt.getString(58, 30);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((String[]) buf[64])[0] = rslt.getString(59, 40);
               ((String[]) buf[65])[0] = rslt.getString(60, 30);
               ((String[]) buf[66])[0] = rslt.getString(61, 30);
               ((String[]) buf[67])[0] = rslt.getString(62, 12);
               ((String[]) buf[68])[0] = rslt.getString(63, 20);
               ((String[]) buf[69])[0] = rslt.getString(64, 10);
               ((java.math.BigDecimal[]) buf[70])[0] = rslt.getBigDecimal(65,2);
               ((short[]) buf[71])[0] = rslt.getShort(66);
               ((java.math.BigDecimal[]) buf[72])[0] = rslt.getBigDecimal(67,2);
               ((short[]) buf[73])[0] = rslt.getShort(68);
               ((short[]) buf[74])[0] = rslt.getShort(69);
               ((short[]) buf[75])[0] = rslt.getShort(70);
               ((String[]) buf[76])[0] = rslt.getString(71, 20);
               ((String[]) buf[77])[0] = rslt.getString(72, 20);
               ((byte[]) buf[78])[0] = rslt.getByte(73);
               ((byte[]) buf[79])[0] = rslt.getByte(74);
               ((String[]) buf[80])[0] = rslt.getString(75, 1);
               ((String[]) buf[81])[0] = rslt.getString(76, 3);
               ((int[]) buf[82])[0] = rslt.getInt(77);
               ((short[]) buf[83])[0] = rslt.getShort(78);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((short[]) buf[85])[0] = rslt.getShort(79);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((short[]) buf[87])[0] = rslt.getShort(80);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((short[]) buf[89])[0] = rslt.getShort(81);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((byte[]) buf[91])[0] = rslt.getByte(82);
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[93])[0] = rslt.getBigDecimal(83,2);
               ((boolean[]) buf[94])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 25);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 20 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 29 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 25);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 51 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
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
               stmt.setByte(3, ((Number) parms[3]).byteValue());
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
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               return;
            case 2 :
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
            case 3 :
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
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 12 :
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
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
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
            case 16 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
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
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               return;
            case 24 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 16);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[3], 2);
               stmt.setString(4, (String)parms[4], 8);
               stmt.setString(5, (String)parms[5], 20);
               stmt.setString(6, (String)parms[6], 1);
               stmt.setByte(7, ((Number) parms[7]).byteValue());
               stmt.setString(8, (String)parms[8], 1);
               stmt.setString(9, (String)parms[9], 26);
               stmt.setDate(10, (java.util.Date)parms[10]);
               stmt.setDateTime(11, (java.util.Date)parms[11], true);
               stmt.setString(12, (String)parms[12], 4);
               stmt.setString(13, (String)parms[13], 1);
               stmt.setString(14, (String)parms[14], 20);
               stmt.setString(15, (String)parms[15], 20);
               stmt.setVarchar(16, (String)parms[16], 60, false);
               stmt.setString(17, (String)parms[17], 20);
               stmt.setBigDecimal(18, (java.math.BigDecimal)parms[18], 2);
               stmt.setBigDecimal(19, (java.math.BigDecimal)parms[19], 2);
               stmt.setString(20, (String)parms[20], 13);
               stmt.setString(21, (String)parms[21], 12);
               stmt.setString(22, (String)parms[22], 20);
               stmt.setBigDecimal(23, (java.math.BigDecimal)parms[23], 2);
               stmt.setInt(24, ((Number) parms[24]).intValue());
               stmt.setInt(25, ((Number) parms[25]).intValue());
               stmt.setBigDecimal(26, (java.math.BigDecimal)parms[26], 2);
               stmt.setInt(27, ((Number) parms[27]).intValue());
               stmt.setString(28, (String)parms[28], 10);
               stmt.setString(29, (String)parms[29], 2);
               stmt.setInt(30, ((Number) parms[30]).intValue());
               stmt.setBigDecimal(31, (java.math.BigDecimal)parms[31], 2);
               stmt.setDate(32, (java.util.Date)parms[32]);
               stmt.setShort(33, ((Number) parms[33]).shortValue());
               stmt.setByte(34, ((Number) parms[34]).byteValue());
               stmt.setBigDecimal(35, (java.math.BigDecimal)parms[35], 3);
               stmt.setShort(36, ((Number) parms[36]).shortValue());
               stmt.setShort(37, ((Number) parms[37]).shortValue());
               stmt.setShort(38, ((Number) parms[38]).shortValue());
               stmt.setBigDecimal(39, (java.math.BigDecimal)parms[39], 5);
               stmt.setBigDecimal(40, (java.math.BigDecimal)parms[40], 2);
               stmt.setByte(41, ((Number) parms[41]).byteValue());
               stmt.setString(42, (String)parms[42], 10);
               stmt.setString(43, (String)parms[43], 1);
               stmt.setDate(44, (java.util.Date)parms[44]);
               stmt.setString(45, (String)parms[45], 5);
               stmt.setString(46, (String)parms[46], 20);
               stmt.setString(47, (String)parms[47], 1);
               stmt.setBigDecimal(48, (java.math.BigDecimal)parms[48], 2);
               stmt.setString(49, (String)parms[49], 10);
               stmt.setBigDecimal(50, (java.math.BigDecimal)parms[50], 2);
               stmt.setString(51, (String)parms[51], 40);
               stmt.setString(52, (String)parms[52], 30);
               stmt.setString(53, (String)parms[53], 30);
               stmt.setString(54, (String)parms[54], 12);
               stmt.setString(55, (String)parms[55], 20);
               stmt.setString(56, (String)parms[56], 10);
               stmt.setBigDecimal(57, (java.math.BigDecimal)parms[57], 2);
               stmt.setShort(58, ((Number) parms[58]).shortValue());
               stmt.setBigDecimal(59, (java.math.BigDecimal)parms[59], 2);
               stmt.setShort(60, ((Number) parms[60]).shortValue());
               stmt.setShort(61, ((Number) parms[61]).shortValue());
               stmt.setShort(62, ((Number) parms[62]).shortValue());
               stmt.setString(63, (String)parms[63], 20);
               stmt.setString(64, (String)parms[64], 20);
               stmt.setByte(65, ((Number) parms[65]).byteValue());
               stmt.setByte(66, ((Number) parms[66]).byteValue());
               stmt.setString(67, (String)parms[67], 3);
               stmt.setInt(68, ((Number) parms[68]).intValue());
               if ( ((Boolean) parms[69]).booleanValue() )
               {
                  stmt.setNull( 69 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(69, ((Number) parms[70]).shortValue());
               }
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 70 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(70, ((Number) parms[72]).shortValue());
               }
               if ( ((Boolean) parms[73]).booleanValue() )
               {
                  stmt.setNull( 71 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(71, ((Number) parms[74]).shortValue());
               }
               if ( ((Boolean) parms[75]).booleanValue() )
               {
                  stmt.setNull( 72 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(72, ((Number) parms[76]).shortValue());
               }
               if ( ((Boolean) parms[77]).booleanValue() )
               {
                  stmt.setNull( 73 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(73, ((Number) parms[78]).byteValue());
               }
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 16);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 20);
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 26);
               stmt.setDate(9, (java.util.Date)parms[8]);
               stmt.setDateTime(10, (java.util.Date)parms[9], true);
               stmt.setString(11, (String)parms[10], 4);
               stmt.setString(12, (String)parms[11], 1);
               stmt.setString(13, (String)parms[12], 20);
               stmt.setString(14, (String)parms[13], 20);
               stmt.setVarchar(15, (String)parms[14], 60, false);
               stmt.setString(16, (String)parms[15], 20);
               stmt.setBigDecimal(17, (java.math.BigDecimal)parms[16], 2);
               stmt.setBigDecimal(18, (java.math.BigDecimal)parms[17], 2);
               stmt.setString(19, (String)parms[18], 13);
               stmt.setString(20, (String)parms[19], 12);
               stmt.setString(21, (String)parms[20], 20);
               stmt.setBigDecimal(22, (java.math.BigDecimal)parms[21], 2);
               stmt.setInt(23, ((Number) parms[22]).intValue());
               stmt.setInt(24, ((Number) parms[23]).intValue());
               stmt.setBigDecimal(25, (java.math.BigDecimal)parms[24], 2);
               stmt.setInt(26, ((Number) parms[25]).intValue());
               stmt.setString(27, (String)parms[26], 10);
               stmt.setString(28, (String)parms[27], 2);
               stmt.setInt(29, ((Number) parms[28]).intValue());
               stmt.setBigDecimal(30, (java.math.BigDecimal)parms[29], 2);
               stmt.setDate(31, (java.util.Date)parms[30]);
               stmt.setShort(32, ((Number) parms[31]).shortValue());
               stmt.setByte(33, ((Number) parms[32]).byteValue());
               stmt.setBigDecimal(34, (java.math.BigDecimal)parms[33], 3);
               stmt.setShort(35, ((Number) parms[34]).shortValue());
               stmt.setShort(36, ((Number) parms[35]).shortValue());
               stmt.setShort(37, ((Number) parms[36]).shortValue());
               stmt.setBigDecimal(38, (java.math.BigDecimal)parms[37], 5);
               stmt.setBigDecimal(39, (java.math.BigDecimal)parms[38], 2);
               stmt.setByte(40, ((Number) parms[39]).byteValue());
               stmt.setString(41, (String)parms[40], 10);
               stmt.setString(42, (String)parms[41], 1);
               stmt.setDate(43, (java.util.Date)parms[42]);
               stmt.setString(44, (String)parms[43], 5);
               stmt.setString(45, (String)parms[44], 20);
               stmt.setString(46, (String)parms[45], 1);
               stmt.setBigDecimal(47, (java.math.BigDecimal)parms[46], 2);
               stmt.setString(48, (String)parms[47], 10);
               stmt.setBigDecimal(49, (java.math.BigDecimal)parms[48], 2);
               stmt.setString(50, (String)parms[49], 40);
               stmt.setString(51, (String)parms[50], 30);
               stmt.setString(52, (String)parms[51], 30);
               stmt.setString(53, (String)parms[52], 12);
               stmt.setString(54, (String)parms[53], 20);
               stmt.setString(55, (String)parms[54], 10);
               stmt.setBigDecimal(56, (java.math.BigDecimal)parms[55], 2);
               stmt.setShort(57, ((Number) parms[56]).shortValue());
               stmt.setBigDecimal(58, (java.math.BigDecimal)parms[57], 2);
               stmt.setShort(59, ((Number) parms[58]).shortValue());
               stmt.setShort(60, ((Number) parms[59]).shortValue());
               stmt.setShort(61, ((Number) parms[60]).shortValue());
               stmt.setString(62, (String)parms[61], 20);
               stmt.setString(63, (String)parms[62], 20);
               stmt.setByte(64, ((Number) parms[63]).byteValue());
               stmt.setByte(65, ((Number) parms[64]).byteValue());
               stmt.setInt(66, ((Number) parms[65]).intValue());
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 67 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(67, ((Number) parms[67]).shortValue());
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 68 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(68, ((Number) parms[69]).shortValue());
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 69 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(69, ((Number) parms[71]).shortValue());
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 70 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(70, ((Number) parms[73]).shortValue());
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 71 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(71, ((Number) parms[75]).byteValue());
               }
               stmt.setString(72, (String)parms[76], 3);
               if ( ((Boolean) parms[77]).booleanValue() )
               {
                  stmt.setNull( 73 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(73, ((Number) parms[78]).intValue());
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
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
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
               return;
            case 49 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
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
               stmt.setByte(3, ((Number) parms[3]).byteValue());
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
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               return;
            case 53 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setByte(2, ((Number) parms[2]).byteValue());
               stmt.setString(3, (String)parms[3], 60);
               stmt.setString(4, (String)parms[4], 3);
               return;
            case 54 :
               stmt.setString(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               stmt.setByte(4, ((Number) parms[4]).byteValue());
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
               stmt.setByte(3, ((Number) parms[3]).byteValue());
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
               return;
      }
   }

}

