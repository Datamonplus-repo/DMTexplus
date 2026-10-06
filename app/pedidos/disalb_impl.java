package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class disalb_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action32") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         AV20Albrpiedis = (int)(GXutil.lval( httpContext.GetPar( "Albrpiedis"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20Albrpiedis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20Albrpiedis), 6, 0));
         AV21AlbrUniDis = CommonUtil.decimalVal( httpContext.GetPar( "AlbrUniDis"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21AlbrUniDis", GXutil.ltrimstr( AV21AlbrUniDis, 9, 2));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_32_1PZ35( A396EmprCod, A44AlbRecCod, AV20Albrpiedis, AV21AlbrUniDis) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action40") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         AV30UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30UsurCod", AV30UsurCod);
         AV31Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31Station", AV31Station);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_40_1PZ35( A396EmprCod, A44AlbRecCod, AV30UsurCod, AV31Station) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action41") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A55AlbRReo = httpContext.GetPar( "AlbRReo") ;
         httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_41_1PZ35( A396EmprCod, A44AlbRecCod, A361DisCod, A55AlbRReo) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action42") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_42_1PZ35( A396EmprCod, A44AlbRecCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel19"+"_"+"vDISPIENOR") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         AV24AuxPie = (int)(GXutil.lval( httpContext.GetPar( "AuxPie"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24AuxPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24AuxPie), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx19asadispienor1PZ35( A396EmprCod, A361DisCod, AV24AuxPie) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel20"+"_"+"vDISPIENOR") == 0 )
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
         gx20asadispienor1PZ35( A396EmprCod, A361DisCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel21"+"_"+"vDISPIEKGM") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         AV25AuxKil = CommonUtil.decimalVal( httpContext.GetPar( "AuxKil"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25AuxKil", GXutil.ltrimstr( AV25AuxKil, 9, 2));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx21asadispiekgm1PZ35( A396EmprCod, A361DisCod, AV25AuxKil) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel22"+"_"+"vDISPIEKGM") == 0 )
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
         gx22asadispiekgm1PZ35( A396EmprCod, A361DisCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel23"+"_"+"vDISPIEMTR") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         AV26AuxMtr = CommonUtil.decimalVal( httpContext.GetPar( "AuxMtr"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26AuxMtr", GXutil.ltrimstr( AV26AuxMtr, 9, 2));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx23asadispiemtr1PZ35( A396EmprCod, A361DisCod, AV26AuxMtr) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel24"+"_"+"vDISPIEMTR") == 0 )
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
         gx24asadispiemtr1PZ35( A396EmprCod, A361DisCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_48") == 0 )
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
         gxload_48( A396EmprCod, A44AlbRecCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_49") == 0 )
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
         gxload_49( A396EmprCod, A361DisCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_50") == 0 )
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
         gxload_50( A396EmprCod, A252CliCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Entrada de Almacén", ""), (short)(0)) ;
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

   public disalb_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public disalb_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( disalb_impl.class ));
   }

   public disalb_impl( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbAlbRReo = new HTMLChoice();
      cmbAlbRUni = new HTMLChoice();
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
      app.GxWebStd.gx_div_start( httpContext, divDvpanel_tablepedido_cell_Internalname, 1, 0, "px", 0, "px", divDvpanel_tablepedido_cell_Class, "left", "top", "", "", "div");
      /* User Defined Control */
      ucDvpanel_tablepedido.setProperty("Width", Dvpanel_tablepedido_Width);
      ucDvpanel_tablepedido.setProperty("AutoWidth", Dvpanel_tablepedido_Autowidth);
      ucDvpanel_tablepedido.setProperty("AutoHeight", Dvpanel_tablepedido_Autoheight);
      ucDvpanel_tablepedido.setProperty("Cls", Dvpanel_tablepedido_Cls);
      ucDvpanel_tablepedido.setProperty("Title", Dvpanel_tablepedido_Title);
      ucDvpanel_tablepedido.setProperty("Collapsible", Dvpanel_tablepedido_Collapsible);
      ucDvpanel_tablepedido.setProperty("Collapsed", Dvpanel_tablepedido_Collapsed);
      ucDvpanel_tablepedido.setProperty("ShowCollapseIcon", Dvpanel_tablepedido_Showcollapseicon);
      ucDvpanel_tablepedido.setProperty("IconPosition", Dvpanel_tablepedido_Iconposition);
      ucDvpanel_tablepedido.setProperty("AutoScroll", Dvpanel_tablepedido_Autoscroll);
      ucDvpanel_tablepedido.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tablepedido_Internalname, "DVPANEL_TABLEPEDIDOContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLEPEDIDOContainer"+"TablePedido"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablepedido_Internalname, 1, 0, "px", 0, "px", "TableData", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 CellMarginTop25", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTbngruia_Internalname, httpContext.getMessage( "<b>Nº Disp Int</b>", ""), "", "", lblTbngruia_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(1), "HLP_Pedidos\\DisAlb.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDisCod_Internalname, httpContext.getMessage( "Codigo Disposicion", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisCod_Internalname, GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDisFec_Internalname, httpContext.getMessage( "Fecha Generación Pedido", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtDisFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisFec_Internalname, localUtil.format(A369DisFec, "99/99/99"), localUtil.format( A369DisFec, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisFec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDisFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDisFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Pedidos\\DisAlb.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "Right", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliNom_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisAlb.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDisArtDsc_Internalname, httpContext.getMessage( "Artículo", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtDsc_Internalname, GXutil.rtrim( A337DisArtDsc), GXutil.rtrim( localUtil.format( A337DisArtDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisAlb.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedalbreccod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbreccod_Internalname, httpContext.getMessage( "N Recepcion", ""), "", "", lblTextblockalbreccod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Pedidos\\DisAlb.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblTablemergedalbreccod_Internalname, tblTablemergedalbreccod_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td class='MergeDataCell'>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRecCod_Internalname, httpContext.getMessage( "N Recepcion", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,55);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRecCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRecCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesearch_albreccod_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "CellMarginTop20", "left", "top", "", "flex-grow:1;", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblImgbsc_albreccod_Internalname, httpContext.getMessage( "<i class=\"fas fa-search fa-2x\"></i>", ""), "", "", lblImgbsc_albreccod_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'DOIMGBSC_ALBRECCOD\\'."+"'", "", "TextBlock", 5, "", 1, 1, 0, (short)(1), "HLP_Pedidos\\DisAlb.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRef_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRef_Internalname, httpContext.getMessage( "Referencia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRef_Internalname, GXutil.rtrim( A45AlbRef), GXutil.rtrim( localUtil.format( A45AlbRef, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRef_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRef_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisAlb.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbRReo.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbAlbRReo.getInternalname(), httpContext.getMessage( "RC", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbRReo, cmbAlbRReo.getInternalname(), GXutil.rtrim( A55AlbRReo), 1, cmbAlbRReo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbRReo.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_Pedidos\\DisAlb.htm");
      cmbAlbRReo.setValue( GXutil.rtrim( A55AlbRReo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Values", cmbAlbRReo.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRLote_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRLote_Internalname, httpContext.getMessage( "Lote", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRLote_Internalname, GXutil.rtrim( A6463AlbRLote), GXutil.rtrim( localUtil.format( A6463AlbRLote, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRLote_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRLote_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisAlb.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRGrm2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRGrm2_Internalname, httpContext.getMessage( "Grm2", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRGrm2_Internalname, GXutil.ltrim( localUtil.ntoc( A4920AlbRGrm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRGrm2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4920AlbRGrm2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4920AlbRGrm2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRGrm2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRGrm2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A4921AlbRAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRAnc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4921AlbRAnc), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4921AlbRAnc), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRAnc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRAnc_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRPieEnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRPieEnt_Internalname, httpContext.getMessage( "Piezas Entregadas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieEnt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieEnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRPieEnt_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRUniEnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRUniEnt_Internalname, httpContext.getMessage( "Unidades Entrada", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniEnt_Enabled!=0) ? localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99") : localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniEnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRUniEnt_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb.htm");
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
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbRUni, cmbAlbRUni.getInternalname(), GXutil.rtrim( A56AlbRUni), 1, cmbAlbRUni.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbRUni.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_Pedidos\\DisAlb.htm");
      cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRUniDis_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRUniDis_Internalname, httpContext.getMessage( "Cantidad Entregada", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniDis_Internalname, GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniDis_Enabled!=0) ? localUtil.format( A57AlbRUniDis, "ZZZZZ9.99") : localUtil.format( A57AlbRUniDis, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniDis_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRUniDis_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRPieDis_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRPieDis_Internalname, httpContext.getMessage( "Piezas Disponibles", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieDis_Internalname, GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieDis_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieDis_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRPieDis_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtKilos_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtKilos_Internalname, httpContext.getMessage( "Kilos Dispuestos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtKilos_Internalname, GXutil.ltrim( localUtil.ntoc( A595Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtKilos_Enabled!=0) ? localUtil.format( A595Kilos, "ZZZZZ9.99") : localUtil.format( A595Kilos, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,107);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtKilos_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtKilos_Enabled, 0, "text", "", edtKilos_Width, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtMetros_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMetros_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMetros_Internalname, httpContext.getMessage( "Metros Dispuestos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetros_Internalname, GXutil.ltrim( localUtil.ntoc( A631Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMetros_Enabled!=0) ? localUtil.format( A631Metros, "ZZZZZ9.99") : localUtil.format( A631Metros, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetros_Jsonclick, 0, "AttributeFL", "", "", "", "", edtMetros_Visible, edtMetros_Enabled, 0, "text", "", edtMetros_Width, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPiezas_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPiezas_Internalname, httpContext.getMessage( "Piezas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 115,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPiezas_Internalname, GXutil.ltrim( localUtil.ntoc( A673Piezas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPiezas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A673Piezas), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A673Piezas), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,115);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPiezas_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPiezas_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 120,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Pedidos\\DisAlb.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 122,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Pedidos\\DisAlb.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Pedidos\\DisAlb.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV37Pgmname), GXutil.rtrim( localUtil.format( AV37Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisAlb.htm");
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
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 132,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,132);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisAlb.htm");
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
      e111PZ2 ();
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
            O631Metros = localUtil.ctond( httpContext.cgiGet( "O631Metros")) ;
            O595Kilos = localUtil.ctond( httpContext.cgiGet( "O595Kilos")) ;
            O673Piezas = (int)(localUtil.ctol( httpContext.cgiGet( "O673Piezas"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( "O54AlbRPieUti"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( "O60AlbRUniUti")) ;
            O392DisUniMed = httpContext.cgiGet( "O392DisUniMed") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            A60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( "ALBRUNIUTI")) ;
            A54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEUTI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV7EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV8DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "vDISCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV9AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( "vALBRECCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV21AlbrUniDis = localUtil.ctond( httpContext.cgiGet( "vALBRUNIDIS")) ;
            A392DisUniMed = httpContext.cgiGet( "DISUNIMED") ;
            AV22Kilos = localUtil.ctond( httpContext.cgiGet( "vKILOS")) ;
            AV23Metros = localUtil.ctond( httpContext.cgiGet( "vMETROS")) ;
            AV24AuxPie = (int)(localUtil.ctol( httpContext.cgiGet( "vAUXPIE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV25AuxKil = localUtil.ctond( httpContext.cgiGet( "vAUXKIL")) ;
            AV26AuxMtr = localUtil.ctond( httpContext.cgiGet( "vAUXMTR")) ;
            AV27DisPieNor = (short)(localUtil.ctol( httpContext.cgiGet( "vDISPIENOR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV28DisPieKgm = localUtil.ctond( httpContext.cgiGet( "vDISPIEKGM")) ;
            AV29DisPieMtr = localUtil.ctond( httpContext.cgiGet( "vDISPIEMTR")) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV20Albrpiedis = (int)(localUtil.ctol( httpContext.cgiGet( "vALBRPIEDIS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV31Station = httpContext.cgiGet( "vSTATION") ;
            AV30UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV32FlagCli = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAGCLI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33FlagEmp = (short)(localUtil.ctol( httpContext.cgiGet( "vFLAGEMP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV19msg7 = httpContext.cgiGet( "vMSG7") ;
            A335DisArtCod = httpContext.cgiGet( "DISARTCOD") ;
            AV18errartref = (byte)(localUtil.ctol( httpContext.cgiGet( "vERRARTREF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A47AlbREst = (byte)(localUtil.ctol( httpContext.cgiGet( "ALBREST"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Dvpanel_tablepedido_Objectcall = httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Objectcall") ;
            Dvpanel_tablepedido_Class = httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Class") ;
            Dvpanel_tablepedido_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Enabled")) ;
            Dvpanel_tablepedido_Width = httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Width") ;
            Dvpanel_tablepedido_Height = httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Height") ;
            Dvpanel_tablepedido_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Autowidth")) ;
            Dvpanel_tablepedido_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Autoheight")) ;
            Dvpanel_tablepedido_Cls = httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Cls") ;
            Dvpanel_tablepedido_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Showheader")) ;
            Dvpanel_tablepedido_Title = httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Title") ;
            Dvpanel_tablepedido_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Collapsible")) ;
            Dvpanel_tablepedido_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Collapsed")) ;
            Dvpanel_tablepedido_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Showcollapseicon")) ;
            Dvpanel_tablepedido_Iconposition = httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Iconposition") ;
            Dvpanel_tablepedido_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Autoscroll")) ;
            Dvpanel_tablepedido_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Visible")) ;
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
            A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            A369DisFec = localUtil.ctod( httpContext.cgiGet( edtDisFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A369DisFec", localUtil.format(A369DisFec, "99/99/99"));
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A337DisArtDsc = httpContext.cgiGet( edtDisArtDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A337DisArtDsc", A337DisArtDsc);
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
            A45AlbRef = httpContext.cgiGet( edtAlbRef_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
            cmbAlbRReo.setValue( httpContext.cgiGet( cmbAlbRReo.getInternalname()) );
            A55AlbRReo = httpContext.cgiGet( cmbAlbRReo.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
            A6463AlbRLote = httpContext.cgiGet( edtAlbRLote_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", A6463AlbRLote);
            A4920AlbRGrm2 = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbRGrm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
            A4921AlbRAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbRAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
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
            AV37Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37Pgmname", AV37Pgmname);
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"DisAlb");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A361DisCod != Z361DisCod ) || ( A44AlbRecCod != Z44AlbRecCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("pedidos\\disalb:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
                        confirm_1PZ0( ) ;
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
                        e111PZ2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121PZ2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'DOIMGBSC_ALBRECCOD'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'DoImgBsc_AlbRecCod' */
                        e131PZ2 ();
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
         e121PZ2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1PZ35( ) ;
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
         disableAttributes1PZ35( ) ;
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

   public void confirm_1PZ0( )
   {
      beforeValidate1PZ35( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1PZ35( ) ;
         }
         else
         {
            checkExtendedTable1PZ35( ) ;
            closeExtendedTableCursors1PZ35( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1PZ0( )
   {
   }

   public void e111PZ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV31Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      disalb_impl.this.GXt_char1 = GXv_char2[0] ;
      AV31Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Station", AV31Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV34EmprNom ;
      GXv_char4[0] = AV30UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV31Station, GXv_char2, GXv_char3, GXv_char4) ;
      disalb_impl.this.A396EmprCod = GXv_char2[0] ;
      disalb_impl.this.AV34EmprNom = GXv_char3[0] ;
      disalb_impl.this.AV30UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV34EmprNom", AV34EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV30UsurCod", AV30UsurCod);
      GXt_int5 = (byte)(AV33FlagEmp) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "JL0000", ""), GXv_int6) ;
      disalb_impl.this.GXt_int5 = GXv_int6[0] ;
      AV33FlagEmp = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33FlagEmp", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33FlagEmp), 4, 0));
      GXt_char1 = AV19msg7 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG253_", ""), (byte)(99), GXv_char4) ;
      disalb_impl.this.GXt_char1 = GXv_char4[0] ;
      AV19msg7 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19msg7", AV19msg7);
      GXt_int5 = AV18errartref ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ERARRF", ""), GXv_int6) ;
      disalb_impl.this.GXt_int5 = GXv_int6[0] ;
      AV18errartref = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18errartref", GXutil.str( AV18errartref, 1, 0));
      GXt_char1 = AV31Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      disalb_impl.this.GXt_char1 = GXv_char4[0] ;
      AV31Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Station", AV31Station);
      GXv_char4[0] = AV7EmprCod ;
      GXv_char3[0] = AV34EmprNom ;
      GXv_char2[0] = AV30UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV31Station, GXv_char4, GXv_char3, GXv_char2) ;
      disalb_impl.this.AV7EmprCod = GXv_char4[0] ;
      disalb_impl.this.AV34EmprNom = GXv_char3[0] ;
      disalb_impl.this.AV30UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV34EmprNom", AV34EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV30UsurCod", AV30UsurCod);
      GXv_SdtWWPContext7[0] = AV10WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV10WWPContext = GXv_SdtWWPContext7[0] ;
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV11TrnContext.fromxml(AV12WebSession.getValue("TrnContext"), null, null);
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      AV20Albrpiedis = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Albrpiedis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20Albrpiedis), 6, 0));
      AV21AlbrUniDis = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21AlbrUniDis", GXutil.ltrimstr( AV21AlbrUniDis, 9, 2));
   }

   public void e121PZ2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) || ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) )
      {
         httpContext.popup(formatLink("app.pedidos.disdef__ww", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.booltostr(true)),GXutil.URLEncode(GXutil.booltostr(false))}, new String[] {"EmprCod","DisCod","VisualizarAcciones","AccionesEnPopup"}) , new Object[] {});
      }
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

   public void e131PZ2( )
   {
      /* 'DoImgBsc_AlbRecCod' Routine */
      returnInSub = false ;
      AV16AlbRfeni = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16AlbRfeni", localUtil.format(AV16AlbRfeni, "99/99/99"));
      AV17Albrfenff = GXutil.today( ) ;
      AV14AlbRef = A335DisArtCod ;
      AV15CliCod = A252CliCod ;
      httpContext.popup(formatLink("app.pedidos.disalb_albreccod_prompt", new String[] {GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(AV14AlbRef)),GXutil.URLEncode(GXutil.rtrim(" ")),GXutil.URLEncode(GXutil.rtrim(A392DisUniMed)),GXutil.URLEncode(GXutil.ltrimstr(AV15CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "T", ""))),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim("0")),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(" ")),GXutil.URLEncode(GXutil.rtrim(" ")),GXutil.URLEncode(GXutil.formatDateParm(AV16AlbRfeni)),GXutil.URLEncode(GXutil.formatDateParm(AV17Albrfenff)),GXutil.URLEncode(GXutil.rtrim(" ")),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"Nrecep","Nrefer","Nentre","Unid","CliCod","Opreo","InEmprCod","AlbREst","TipEnt","AlbRLoc","AlbRDisCli","AlbRfeni","Albrfenf","Albrent2i","Albreccod"}) , new Object[] {"A44AlbRecCod"});
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      divDvpanel_tablepedido_cell_Class = "col-xs-12" ;
      httpContext.ajax_rsp_assign_prop("", false, divDvpanel_tablepedido_cell_Internalname, "Class", divDvpanel_tablepedido_cell_Class, true);
   }

   public void zm1PZ35( int GX_JID )
   {
      if ( ( GX_JID == 47 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z595Kilos = T01PZ3_A595Kilos[0] ;
            Z631Metros = T01PZ3_A631Metros[0] ;
            Z673Piezas = T01PZ3_A673Piezas[0] ;
         }
         else
         {
            Z595Kilos = A595Kilos ;
            Z631Metros = A631Metros ;
            Z673Piezas = A673Piezas ;
         }
      }
      if ( ( GX_JID == 48 ) || ( GX_JID == 0 ) )
      {
         Z58AlbRUniEnt = T01PZ5_A58AlbRUniEnt[0] ;
         Z52AlbRPieEnt = T01PZ5_A52AlbRPieEnt[0] ;
         Z56AlbRUni = T01PZ5_A56AlbRUni[0] ;
         Z47AlbREst = T01PZ5_A47AlbREst[0] ;
         Z55AlbRReo = T01PZ5_A55AlbRReo[0] ;
         Z45AlbRef = T01PZ5_A45AlbRef[0] ;
         Z4920AlbRGrm2 = T01PZ5_A4920AlbRGrm2[0] ;
         Z4921AlbRAnc = T01PZ5_A4921AlbRAnc[0] ;
         Z6463AlbRLote = T01PZ5_A6463AlbRLote[0] ;
         Z252CliCod = T01PZ5_A252CliCod[0] ;
      }
      if ( GX_JID == -47 )
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
      AV37Pgmname = "Pedidos.DisAlb" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Pgmname", AV37Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
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
      if ( isIns( )  && (0==A673Piezas) && ( Gx_BScreen == 0 ) )
      {
         A673Piezas = AV20Albrpiedis ;
         httpContext.ajax_rsp_assign_attri("", false, "A673Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A673Piezas), 6, 0));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T01PZ6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         A369DisFec = T01PZ6_A369DisFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A369DisFec", localUtil.format(A369DisFec, "99/99/99"));
         A392DisUniMed = T01PZ6_A392DisUniMed[0] ;
         A335DisArtCod = T01PZ6_A335DisArtCod[0] ;
         A337DisArtDsc = T01PZ6_A337DisArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A337DisArtDsc", A337DisArtDsc);
         O392DisUniMed = A392DisUniMed ;
         httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
         pr_default.close(4);
         if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 )
         {
            edtMetros_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetros_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetros_Visible), 5, 0), true);
         }
         if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 )
         {
            edtMetros_Width = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetros_Internalname, "Width", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetros_Width), 9, 0), true);
         }
         if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 )
         {
            edtKilos_Width = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtKilos_Internalname, "Width", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtKilos_Width), 9, 0), true);
         }
         /* * Property Visible not supported in */
         /* * Property Visible not supported in */
         /* * Property Visible not supported in */
         if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 )
         {
            /* * Property Visible not supported in */
            /*
               Assignment error:
               ================
               Expression: [ t('0',3) ]
               Target    : [ t('&Dispiemtr',23),t('Visible',3) ]
               ForType   : 29
               Type      : []
            */
         }
         /* * Property Visible not supported in */
         /* * Property Visible not supported in */
         /* * Property Visible not supported in */
         if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 )
         {
            /* * Property Visible not supported in */
            /*
               Assignment error:
               ================
               Expression: [ t('0',3) ]
               Target    : [ t('&Dispiekgm',23),t('Visible',3) ]
               ForType   : 29
               Type      : []
            */
         }
         GXt_int8 = AV27DisPieNor ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int9[0] = A361DisCod ;
         GXv_int10[0] = 0 ;
         GXv_int11[0] = GXt_int8 ;
         new app.pdisaln1(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_int10, GXv_int11) ;
         disalb_impl.this.A396EmprCod = GXv_char4[0] ;
         disalb_impl.this.A361DisCod = GXv_int9[0] ;
         disalb_impl.this.GXt_int8 = GXv_int11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         AV27DisPieNor = GXt_int8 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27DisPieNor", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27DisPieNor), 4, 0));
         GXt_decimal12 = AV28DisPieKgm ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int10[0] = A361DisCod ;
         GXv_decimal13[0] = DecimalUtil.doubleToDec(0) ;
         GXv_decimal14[0] = GXt_decimal12 ;
         new app.pdisaln2(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_decimal13, GXv_decimal14) ;
         disalb_impl.this.A396EmprCod = GXv_char4[0] ;
         disalb_impl.this.A361DisCod = GXv_int10[0] ;
         disalb_impl.this.GXt_decimal12 = GXv_decimal14[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         AV28DisPieKgm = GXt_decimal12 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28DisPieKgm", GXutil.ltrimstr( AV28DisPieKgm, 9, 2));
         GXt_decimal12 = AV29DisPieMtr ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int10[0] = A361DisCod ;
         GXv_decimal14[0] = DecimalUtil.doubleToDec(0) ;
         GXv_decimal13[0] = GXt_decimal12 ;
         new app.pdisaln3(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_decimal14, GXv_decimal13) ;
         disalb_impl.this.A396EmprCod = GXv_char4[0] ;
         disalb_impl.this.A361DisCod = GXv_int10[0] ;
         disalb_impl.this.GXt_decimal12 = GXv_decimal13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         AV29DisPieMtr = GXt_decimal12 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29DisPieMtr", GXutil.ltrimstr( AV29DisPieMtr, 9, 2));
         /* Using cursor T01PZ5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         zm1PZ35( 48) ;
         A60AlbRUniUti = T01PZ5_A60AlbRUniUti[0] ;
         A54AlbRPieUti = T01PZ5_A54AlbRPieUti[0] ;
         A58AlbRUniEnt = T01PZ5_A58AlbRUniEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         A52AlbRPieEnt = T01PZ5_A52AlbRPieEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         A56AlbRUni = T01PZ5_A56AlbRUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         A47AlbREst = T01PZ5_A47AlbREst[0] ;
         A55AlbRReo = T01PZ5_A55AlbRReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
         A45AlbRef = T01PZ5_A45AlbRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         A4920AlbRGrm2 = T01PZ5_A4920AlbRGrm2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
         A4921AlbRAnc = T01PZ5_A4921AlbRAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
         A6463AlbRLote = T01PZ5_A6463AlbRLote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", A6463AlbRLote);
         A252CliCod = T01PZ5_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         O54AlbRPieUti = A54AlbRPieUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         O60AlbRUniUti = A60AlbRUniUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         pr_default.close(3);
         /* Using cursor T01PZ7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01PZ7_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(5);
         if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 )
         {
            AV22Kilos = AV21AlbrUniDis ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22Kilos", GXutil.ltrimstr( AV22Kilos, 9, 2));
         }
         if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 )
         {
            AV23Metros = AV21AlbrUniDis ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23Metros", GXutil.ltrimstr( AV23Metros, 9, 2));
         }
      }
   }

   public void load1PZ35( )
   {
      /* Using cursor T01PZ8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound35 = (short)(1) ;
         A60AlbRUniUti = T01PZ8_A60AlbRUniUti[0] ;
         A54AlbRPieUti = T01PZ8_A54AlbRPieUti[0] ;
         A369DisFec = T01PZ8_A369DisFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A369DisFec", localUtil.format(A369DisFec, "99/99/99"));
         A392DisUniMed = T01PZ8_A392DisUniMed[0] ;
         A279CliNom = T01PZ8_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A335DisArtCod = T01PZ8_A335DisArtCod[0] ;
         A337DisArtDsc = T01PZ8_A337DisArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A337DisArtDsc", A337DisArtDsc);
         A595Kilos = T01PZ8_A595Kilos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A595Kilos", GXutil.ltrimstr( A595Kilos, 9, 2));
         A631Metros = T01PZ8_A631Metros[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A631Metros", GXutil.ltrimstr( A631Metros, 9, 2));
         A673Piezas = T01PZ8_A673Piezas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A673Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A673Piezas), 6, 0));
         A58AlbRUniEnt = T01PZ8_A58AlbRUniEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         A52AlbRPieEnt = T01PZ8_A52AlbRPieEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         A56AlbRUni = T01PZ8_A56AlbRUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         A47AlbREst = T01PZ8_A47AlbREst[0] ;
         A55AlbRReo = T01PZ8_A55AlbRReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
         A45AlbRef = T01PZ8_A45AlbRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         A4920AlbRGrm2 = T01PZ8_A4920AlbRGrm2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
         A4921AlbRAnc = T01PZ8_A4921AlbRAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
         A6463AlbRLote = T01PZ8_A6463AlbRLote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", A6463AlbRLote);
         A252CliCod = T01PZ8_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         zm1PZ35( -47) ;
      }
      pr_default.close(6);
      onLoadActions1PZ35( ) ;
   }

   public void onLoadActions1PZ35( )
   {
      O54AlbRPieUti = A54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      O60AlbRUniUti = A60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      O392DisUniMed = A392DisUniMed ;
      httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
      if ( isIns( )  )
      {
         AV24AuxPie = A673Piezas ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24AuxPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24AuxPie), 6, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            AV24AuxPie = (int)(A673Piezas-O673Piezas) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24AuxPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24AuxPie), 6, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               AV24AuxPie = (int)(-O673Piezas) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV24AuxPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24AuxPie), 6, 0));
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
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 )
      {
         AV22Kilos = AV21AlbrUniDis ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22Kilos", GXutil.ltrimstr( AV22Kilos, 9, 2));
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A595Kilos)==0) && ( Gx_BScreen == 0 ) )
      {
         A595Kilos = AV22Kilos ;
         httpContext.ajax_rsp_assign_attri("", false, "A595Kilos", GXutil.ltrimstr( A595Kilos, 9, 2));
      }
      if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 )
      {
         AV23Metros = AV21AlbrUniDis ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23Metros", GXutil.ltrimstr( AV23Metros, 9, 2));
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A631Metros)==0) && ( Gx_BScreen == 0 ) )
      {
         A631Metros = AV23Metros ;
         httpContext.ajax_rsp_assign_attri("", false, "A631Metros", GXutil.ltrimstr( A631Metros, 9, 2));
      }
      if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 )
      {
         edtMetros_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMetros_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetros_Visible), 5, 0), true);
      }
      if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 )
      {
         edtMetros_Width = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMetros_Internalname, "Width", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetros_Width), 9, 0), true);
      }
      if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 )
      {
         edtKilos_Width = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtKilos_Internalname, "Width", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtKilos_Width), 9, 0), true);
      }
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
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 )
      {
         /* * Property Visible not supported in */
         /*
            Assignment error:
            ================
            Expression: [ t('0',3) ]
            Target    : [ t('&Dispiemtr',23),t('Visible',3) ]
            ForType   : 29
            Type      : []
         */
      }
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 )
      {
         /* * Property Visible not supported in */
         /*
            Assignment error:
            ================
            Expression: [ t('0',3) ]
            Target    : [ t('&Dispiekgm',23),t('Visible',3) ]
            ForType   : 29
            Type      : []
         */
      }
      GXt_int8 = AV27DisPieNor ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int10[0] = A361DisCod ;
      GXv_int9[0] = 0 ;
      GXv_int11[0] = GXt_int8 ;
      new app.pdisaln1(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int9, GXv_int11) ;
      disalb_impl.this.A396EmprCod = GXv_char4[0] ;
      disalb_impl.this.A361DisCod = GXv_int10[0] ;
      disalb_impl.this.GXt_int8 = GXv_int11[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      AV27DisPieNor = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27DisPieNor", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27DisPieNor), 4, 0));
      GXt_decimal12 = AV28DisPieKgm ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int10[0] = A361DisCod ;
      GXv_decimal14[0] = DecimalUtil.doubleToDec(0) ;
      GXv_decimal13[0] = GXt_decimal12 ;
      new app.pdisaln2(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_decimal14, GXv_decimal13) ;
      disalb_impl.this.A396EmprCod = GXv_char4[0] ;
      disalb_impl.this.A361DisCod = GXv_int10[0] ;
      disalb_impl.this.GXt_decimal12 = GXv_decimal13[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      AV28DisPieKgm = GXt_decimal12 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28DisPieKgm", GXutil.ltrimstr( AV28DisPieKgm, 9, 2));
      GXt_decimal12 = AV29DisPieMtr ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int10[0] = A361DisCod ;
      GXv_decimal14[0] = DecimalUtil.doubleToDec(0) ;
      GXv_decimal13[0] = GXt_decimal12 ;
      new app.pdisaln3(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_decimal14, GXv_decimal13) ;
      disalb_impl.this.A396EmprCod = GXv_char4[0] ;
      disalb_impl.this.A361DisCod = GXv_int10[0] ;
      disalb_impl.this.GXt_decimal12 = GXv_decimal13[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      AV29DisPieMtr = GXt_decimal12 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29DisPieMtr", GXutil.ltrimstr( AV29DisPieMtr, 9, 2));
      if ( isIns( )  )
      {
         AV25AuxKil = A595Kilos ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25AuxKil", GXutil.ltrimstr( AV25AuxKil, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            AV25AuxKil = A595Kilos.subtract(O595Kilos) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25AuxKil", GXutil.ltrimstr( AV25AuxKil, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               AV25AuxKil = O595Kilos.negate() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV25AuxKil", GXutil.ltrimstr( AV25AuxKil, 9, 2));
            }
         }
      }
      if ( isIns( )  )
      {
         AV26AuxMtr = A631Metros ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26AuxMtr", GXutil.ltrimstr( AV26AuxMtr, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            AV26AuxMtr = A631Metros.subtract(O631Metros) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26AuxMtr", GXutil.ltrimstr( AV26AuxMtr, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               AV26AuxMtr = O631Metros.negate() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26AuxMtr", GXutil.ltrimstr( AV26AuxMtr, 9, 2));
            }
         }
      }
   }

   public void checkExtendedTable1PZ35( )
   {
      nIsDirty_35 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( ! (0==A44AlbRecCod) && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int10[0] = A44AlbRecCod ;
         GXv_int9[0] = AV20Albrpiedis ;
         GXv_decimal14[0] = AV21AlbrUniDis ;
         new app.pbusstk(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int9, GXv_decimal14) ;
         disalb_impl.this.A396EmprCod = GXv_char4[0] ;
         disalb_impl.this.A44AlbRecCod = GXv_int10[0] ;
         disalb_impl.this.AV20Albrpiedis = GXv_int9[0] ;
         disalb_impl.this.AV21AlbrUniDis = GXv_decimal14[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV20Albrpiedis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20Albrpiedis), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV21AlbrUniDis", GXutil.ltrimstr( AV21AlbrUniDis, 9, 2));
      }
      if ( (0==A44AlbRecCod) && true /* After */ && isIns( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "N Repecion INVALIDO", ""), 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( GXutil.strcmp(A56AlbRUni, A392DisUniMed) != 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Unidad Pedido diferente Unidad Almacen", ""), 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( true /* After */ && ! (0==A44AlbRecCod) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int10[0] = A44AlbRecCod ;
         GXv_int9[0] = A252CliCod ;
         GXv_int6[0] = AV32FlagCli ;
         new app.pctrcli(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int9, GXv_int6) ;
         disalb_impl.this.A396EmprCod = GXv_char4[0] ;
         disalb_impl.this.A44AlbRecCod = GXv_int10[0] ;
         disalb_impl.this.A252CliCod = GXv_int9[0] ;
         disalb_impl.this.AV32FlagCli = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV32FlagCli", GXutil.str( AV32FlagCli, 1, 0));
      }
      if ( true /* After */ && ( AV32FlagCli == 1 ) && ! (0==A44AlbRecCod) && ( AV33FlagEmp == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente Disposicion Diferente a Cliente Empesa", ""), 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( true /* After */ && ( AV32FlagCli == 1 ) && ! (0==A44AlbRecCod) && ( AV33FlagEmp == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "AVISO: Cliente Disposicion Diferente a Cliente Empesa", ""), 0, "ALBRECCOD");
      }
      if ( isIns( )  )
      {
         AV24AuxPie = A673Piezas ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24AuxPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24AuxPie), 6, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            AV24AuxPie = (int)(A673Piezas-O673Piezas) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24AuxPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24AuxPie), 6, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               AV24AuxPie = (int)(-O673Piezas) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV24AuxPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24AuxPie), 6, 0));
            }
         }
      }
      if ( ( AV20Albrpiedis < 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "AVISO.Cantidad de Piezas Pedido superior a Piezas Disponibles", ""), 0, "PIEZAS");
      }
      /* Using cursor T01PZ5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "N Recepcion Inexistente", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A60AlbRUniUti = T01PZ5_A60AlbRUniUti[0] ;
      A54AlbRPieUti = T01PZ5_A54AlbRPieUti[0] ;
      A58AlbRUniEnt = T01PZ5_A58AlbRUniEnt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      A52AlbRPieEnt = T01PZ5_A52AlbRPieEnt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      A56AlbRUni = T01PZ5_A56AlbRUni[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      A47AlbREst = T01PZ5_A47AlbREst[0] ;
      A55AlbRReo = T01PZ5_A55AlbRReo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
      A45AlbRef = T01PZ5_A45AlbRef[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
      A4920AlbRGrm2 = T01PZ5_A4920AlbRGrm2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
      A4921AlbRAnc = T01PZ5_A4921AlbRAnc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
      A6463AlbRLote = T01PZ5_A6463AlbRLote[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", A6463AlbRLote);
      A252CliCod = T01PZ5_A252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      nIsDirty_35 = (short)(1) ;
      O54AlbRPieUti = A54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      nIsDirty_35 = (short)(1) ;
      O60AlbRUniUti = A60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      pr_default.close(3);
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
      nIsDirty_35 = (short)(1) ;
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      /* Using cursor T01PZ6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A369DisFec = T01PZ6_A369DisFec[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A369DisFec", localUtil.format(A369DisFec, "99/99/99"));
      A392DisUniMed = T01PZ6_A392DisUniMed[0] ;
      A335DisArtCod = T01PZ6_A335DisArtCod[0] ;
      A337DisArtDsc = T01PZ6_A337DisArtDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A337DisArtDsc", A337DisArtDsc);
      nIsDirty_35 = (short)(1) ;
      O392DisUniMed = A392DisUniMed ;
      httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
      pr_default.close(4);
      if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 )
      {
         AV22Kilos = AV21AlbrUniDis ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22Kilos", GXutil.ltrimstr( AV22Kilos, 9, 2));
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A595Kilos)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_35 = (short)(1) ;
         A595Kilos = AV22Kilos ;
         httpContext.ajax_rsp_assign_attri("", false, "A595Kilos", GXutil.ltrimstr( A595Kilos, 9, 2));
      }
      if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 )
      {
         AV23Metros = AV21AlbrUniDis ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23Metros", GXutil.ltrimstr( AV23Metros, 9, 2));
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A631Metros)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_35 = (short)(1) ;
         A631Metros = AV23Metros ;
         httpContext.ajax_rsp_assign_attri("", false, "A631Metros", GXutil.ltrimstr( A631Metros, 9, 2));
      }
      if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 )
      {
         edtMetros_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMetros_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetros_Visible), 5, 0), true);
      }
      if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 )
      {
         edtMetros_Width = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMetros_Internalname, "Width", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetros_Width), 9, 0), true);
      }
      if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 )
      {
         edtKilos_Width = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtKilos_Internalname, "Width", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtKilos_Width), 9, 0), true);
      }
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
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 )
      {
         /* * Property Visible not supported in */
         /*
            Assignment error:
            ================
            Expression: [ t('0',3) ]
            Target    : [ t('&Dispiemtr',23),t('Visible',3) ]
            ForType   : 29
            Type      : []
         */
      }
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 )
      {
         /* * Property Visible not supported in */
         /*
            Assignment error:
            ================
            Expression: [ t('0',3) ]
            Target    : [ t('&Dispiekgm',23),t('Visible',3) ]
            ForType   : 29
            Type      : []
         */
      }
      if ( ( GXutil.strcmp(A335DisArtCod, A45AlbRef) != 0 ) && ( AV18errartref == 0 ) )
      {
         httpContext.GX_msglist.addItem(AV19msg7, 0, "");
      }
      if ( ( GXutil.strcmp(A335DisArtCod, A45AlbRef) != 0 ) && ( AV18errartref == 1 ) )
      {
         httpContext.GX_msglist.addItem(AV19msg7, 1, "");
         AnyError = (short)(1) ;
      }
      /* Using cursor T01PZ7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01PZ7_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(5);
      GXt_int8 = AV27DisPieNor ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int10[0] = A361DisCod ;
      GXv_int9[0] = 0 ;
      GXv_int11[0] = GXt_int8 ;
      new app.pdisaln1(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int9, GXv_int11) ;
      disalb_impl.this.A396EmprCod = GXv_char4[0] ;
      disalb_impl.this.A361DisCod = GXv_int10[0] ;
      disalb_impl.this.GXt_int8 = GXv_int11[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      AV27DisPieNor = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27DisPieNor", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27DisPieNor), 4, 0));
      GXt_decimal12 = AV28DisPieKgm ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int10[0] = A361DisCod ;
      GXv_decimal14[0] = DecimalUtil.doubleToDec(0) ;
      GXv_decimal13[0] = GXt_decimal12 ;
      new app.pdisaln2(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_decimal14, GXv_decimal13) ;
      disalb_impl.this.A396EmprCod = GXv_char4[0] ;
      disalb_impl.this.A361DisCod = GXv_int10[0] ;
      disalb_impl.this.GXt_decimal12 = GXv_decimal13[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      AV28DisPieKgm = GXt_decimal12 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28DisPieKgm", GXutil.ltrimstr( AV28DisPieKgm, 9, 2));
      GXt_decimal12 = AV29DisPieMtr ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int10[0] = A361DisCod ;
      GXv_decimal14[0] = DecimalUtil.doubleToDec(0) ;
      GXv_decimal13[0] = GXt_decimal12 ;
      new app.pdisaln3(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_decimal14, GXv_decimal13) ;
      disalb_impl.this.A396EmprCod = GXv_char4[0] ;
      disalb_impl.this.A361DisCod = GXv_int10[0] ;
      disalb_impl.this.GXt_decimal12 = GXv_decimal13[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      AV29DisPieMtr = GXt_decimal12 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29DisPieMtr", GXutil.ltrimstr( AV29DisPieMtr, 9, 2));
      if ( isIns( )  )
      {
         AV25AuxKil = A595Kilos ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25AuxKil", GXutil.ltrimstr( AV25AuxKil, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            AV25AuxKil = A595Kilos.subtract(O595Kilos) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25AuxKil", GXutil.ltrimstr( AV25AuxKil, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               AV25AuxKil = O595Kilos.negate() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV25AuxKil", GXutil.ltrimstr( AV25AuxKil, 9, 2));
            }
         }
      }
      if ( ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 ) && true /* After */ && ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "K", "")) == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cantidad de Unidades Pedido superior a Unidades Disponibles", ""), 1, "KILOS");
         AnyError = (short)(1) ;
         GX_FocusControl = edtKilos_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( isIns( )  )
      {
         AV26AuxMtr = A631Metros ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26AuxMtr", GXutil.ltrimstr( AV26AuxMtr, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            AV26AuxMtr = A631Metros.subtract(O631Metros) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26AuxMtr", GXutil.ltrimstr( AV26AuxMtr, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               AV26AuxMtr = O631Metros.negate() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26AuxMtr", GXutil.ltrimstr( AV26AuxMtr, 9, 2));
            }
         }
      }
      if ( ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 ) && true /* After */ && ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "M", "")) == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cantidad de Unidades Pedido superior a Unidades Disponibles", ""), 1, "METROS");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMetros_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1PZ35( )
   {
      pr_default.close(2);
      pr_default.close(4);
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_48( String A396EmprCod ,
                          int A44AlbRecCod )
   {
      /* Using cursor T01PZ5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "N Recepcion Inexistente", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A60AlbRUniUti = T01PZ5_A60AlbRUniUti[0] ;
      A54AlbRPieUti = T01PZ5_A54AlbRPieUti[0] ;
      A58AlbRUniEnt = T01PZ5_A58AlbRUniEnt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      A52AlbRPieEnt = T01PZ5_A52AlbRPieEnt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      A56AlbRUni = T01PZ5_A56AlbRUni[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      A47AlbREst = T01PZ5_A47AlbREst[0] ;
      A55AlbRReo = T01PZ5_A55AlbRReo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
      A45AlbRef = T01PZ5_A45AlbRef[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
      A4920AlbRGrm2 = T01PZ5_A4920AlbRGrm2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
      A4921AlbRAnc = T01PZ5_A4921AlbRAnc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
      A6463AlbRLote = T01PZ5_A6463AlbRLote[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", A6463AlbRLote);
      A252CliCod = T01PZ5_A252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
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

   public void gxload_49( String A396EmprCod ,
                          int A361DisCod )
   {
      /* Using cursor T01PZ9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A369DisFec = T01PZ9_A369DisFec[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A369DisFec", localUtil.format(A369DisFec, "99/99/99"));
      A392DisUniMed = T01PZ9_A392DisUniMed[0] ;
      A335DisArtCod = T01PZ9_A335DisArtCod[0] ;
      A337DisArtDsc = T01PZ9_A337DisArtDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A337DisArtDsc", A337DisArtDsc);
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

   public void gxload_50( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T01PZ10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01PZ10_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
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

   public void getKey1PZ35( )
   {
      /* Using cursor T01PZ11 */
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
      /* Using cursor T01PZ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01PZ3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1PZ35( 47) ;
         RcdFound35 = (short)(1) ;
         A595Kilos = T01PZ3_A595Kilos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A595Kilos", GXutil.ltrimstr( A595Kilos, 9, 2));
         A631Metros = T01PZ3_A631Metros[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A631Metros", GXutil.ltrimstr( A631Metros, 9, 2));
         A673Piezas = T01PZ3_A673Piezas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A673Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A673Piezas), 6, 0));
         A44AlbRecCod = T01PZ3_A44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A361DisCod = T01PZ3_A361DisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         O631Metros = A631Metros ;
         httpContext.ajax_rsp_assign_attri("", false, "A631Metros", GXutil.ltrimstr( A631Metros, 9, 2));
         O595Kilos = A595Kilos ;
         httpContext.ajax_rsp_assign_attri("", false, "A595Kilos", GXutil.ltrimstr( A595Kilos, 9, 2));
         O673Piezas = A673Piezas ;
         httpContext.ajax_rsp_assign_attri("", false, "A673Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A673Piezas), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         sMode35 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1PZ35( ) ;
         if ( AnyError == 1 )
         {
            RcdFound35 = (short)(0) ;
            initializeNonKey1PZ35( ) ;
         }
         Gx_mode = sMode35 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound35 = (short)(0) ;
         initializeNonKey1PZ35( ) ;
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
      getKey1PZ35( ) ;
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
      /* Using cursor T01PZ12 */
      pr_default.execute(10, new Object[] {Integer.valueOf(A44AlbRecCod), Integer.valueOf(A44AlbRecCod), Integer.valueOf(A361DisCod), A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( T01PZ12_A44AlbRecCod[0] < A44AlbRecCod ) || ( T01PZ12_A44AlbRecCod[0] == A44AlbRecCod ) && ( T01PZ12_A361DisCod[0] < A361DisCod ) ) && ( GXutil.strcmp(T01PZ12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( T01PZ12_A44AlbRecCod[0] > A44AlbRecCod ) || ( T01PZ12_A44AlbRecCod[0] == A44AlbRecCod ) && ( T01PZ12_A361DisCod[0] > A361DisCod ) ) && ( GXutil.strcmp(T01PZ12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A44AlbRecCod = T01PZ12_A44AlbRecCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            A361DisCod = T01PZ12_A361DisCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            RcdFound35 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound35 = (short)(0) ;
      /* Using cursor T01PZ13 */
      pr_default.execute(11, new Object[] {Integer.valueOf(A44AlbRecCod), Integer.valueOf(A44AlbRecCod), Integer.valueOf(A361DisCod), A396EmprCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( T01PZ13_A44AlbRecCod[0] > A44AlbRecCod ) || ( T01PZ13_A44AlbRecCod[0] == A44AlbRecCod ) && ( T01PZ13_A361DisCod[0] > A361DisCod ) ) && ( GXutil.strcmp(T01PZ13_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( T01PZ13_A44AlbRecCod[0] < A44AlbRecCod ) || ( T01PZ13_A44AlbRecCod[0] == A44AlbRecCod ) && ( T01PZ13_A361DisCod[0] < A361DisCod ) ) && ( GXutil.strcmp(T01PZ13_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A44AlbRecCod = T01PZ13_A44AlbRecCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            A361DisCod = T01PZ13_A361DisCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            RcdFound35 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1PZ35( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1PZ35( ) ;
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
               update1PZ35( ) ;
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
               insert1PZ35( ) ;
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
                  insert1PZ35( ) ;
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

   public void checkOptimisticConcurrency1PZ35( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01PZ2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISALB"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z595Kilos, T01PZ2_A595Kilos[0]) != 0 ) || ( DecimalUtil.compareTo(Z631Metros, T01PZ2_A631Metros[0]) != 0 ) || ( Z673Piezas != T01PZ2_A673Piezas[0] ) )
         {
            if ( DecimalUtil.compareTo(Z595Kilos, T01PZ2_A595Kilos[0]) != 0 )
            {
               GXutil.writeLogln("pedidos.disalb:[seudo value changed for attri]"+"Kilos");
               GXutil.writeLogRaw("Old: ",Z595Kilos);
               GXutil.writeLogRaw("Current: ",T01PZ2_A595Kilos[0]);
            }
            if ( DecimalUtil.compareTo(Z631Metros, T01PZ2_A631Metros[0]) != 0 )
            {
               GXutil.writeLogln("pedidos.disalb:[seudo value changed for attri]"+"Metros");
               GXutil.writeLogRaw("Old: ",Z631Metros);
               GXutil.writeLogRaw("Current: ",T01PZ2_A631Metros[0]);
            }
            if ( Z673Piezas != T01PZ2_A673Piezas[0] )
            {
               GXutil.writeLogln("pedidos.disalb:[seudo value changed for attri]"+"Piezas");
               GXutil.writeLogRaw("Old: ",Z673Piezas);
               GXutil.writeLogRaw("Current: ",T01PZ2_A673Piezas[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISALB"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
      /* Using cursor T01PZ14 */
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
         if ( false || ( DecimalUtil.compareTo(Z58AlbRUniEnt, T01PZ14_A58AlbRUniEnt[0]) != 0 ) || ( Z52AlbRPieEnt != T01PZ14_A52AlbRPieEnt[0] ) || ( GXutil.strcmp(Z56AlbRUni, T01PZ14_A56AlbRUni[0]) != 0 ) || ( Z47AlbREst != T01PZ14_A47AlbREst[0] ) || ( GXutil.strcmp(Z55AlbRReo, T01PZ14_A55AlbRReo[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z45AlbRef, T01PZ14_A45AlbRef[0]) != 0 ) || ( Z4920AlbRGrm2 != T01PZ14_A4920AlbRGrm2[0] ) || ( Z4921AlbRAnc != T01PZ14_A4921AlbRAnc[0] ) || ( GXutil.strcmp(Z6463AlbRLote, T01PZ14_A6463AlbRLote[0]) != 0 ) || ( Z252CliCod != T01PZ14_A252CliCod[0] ) )
         {
            if ( DecimalUtil.compareTo(Z58AlbRUniEnt, T01PZ14_A58AlbRUniEnt[0]) != 0 )
            {
               GXutil.writeLogln("pedidos.disalb:[seudo value changed for attri]"+"AlbRUniEnt");
               GXutil.writeLogRaw("Old: ",Z58AlbRUniEnt);
               GXutil.writeLogRaw("Current: ",T01PZ14_A58AlbRUniEnt[0]);
            }
            if ( Z52AlbRPieEnt != T01PZ14_A52AlbRPieEnt[0] )
            {
               GXutil.writeLogln("pedidos.disalb:[seudo value changed for attri]"+"AlbRPieEnt");
               GXutil.writeLogRaw("Old: ",Z52AlbRPieEnt);
               GXutil.writeLogRaw("Current: ",T01PZ14_A52AlbRPieEnt[0]);
            }
            if ( GXutil.strcmp(Z56AlbRUni, T01PZ14_A56AlbRUni[0]) != 0 )
            {
               GXutil.writeLogln("pedidos.disalb:[seudo value changed for attri]"+"AlbRUni");
               GXutil.writeLogRaw("Old: ",Z56AlbRUni);
               GXutil.writeLogRaw("Current: ",T01PZ14_A56AlbRUni[0]);
            }
            if ( Z47AlbREst != T01PZ14_A47AlbREst[0] )
            {
               GXutil.writeLogln("pedidos.disalb:[seudo value changed for attri]"+"AlbREst");
               GXutil.writeLogRaw("Old: ",Z47AlbREst);
               GXutil.writeLogRaw("Current: ",T01PZ14_A47AlbREst[0]);
            }
            if ( GXutil.strcmp(Z55AlbRReo, T01PZ14_A55AlbRReo[0]) != 0 )
            {
               GXutil.writeLogln("pedidos.disalb:[seudo value changed for attri]"+"AlbRReo");
               GXutil.writeLogRaw("Old: ",Z55AlbRReo);
               GXutil.writeLogRaw("Current: ",T01PZ14_A55AlbRReo[0]);
            }
            if ( GXutil.strcmp(Z45AlbRef, T01PZ14_A45AlbRef[0]) != 0 )
            {
               GXutil.writeLogln("pedidos.disalb:[seudo value changed for attri]"+"AlbRef");
               GXutil.writeLogRaw("Old: ",Z45AlbRef);
               GXutil.writeLogRaw("Current: ",T01PZ14_A45AlbRef[0]);
            }
            if ( Z4920AlbRGrm2 != T01PZ14_A4920AlbRGrm2[0] )
            {
               GXutil.writeLogln("pedidos.disalb:[seudo value changed for attri]"+"AlbRGrm2");
               GXutil.writeLogRaw("Old: ",Z4920AlbRGrm2);
               GXutil.writeLogRaw("Current: ",T01PZ14_A4920AlbRGrm2[0]);
            }
            if ( Z4921AlbRAnc != T01PZ14_A4921AlbRAnc[0] )
            {
               GXutil.writeLogln("pedidos.disalb:[seudo value changed for attri]"+"AlbRAnc");
               GXutil.writeLogRaw("Old: ",Z4921AlbRAnc);
               GXutil.writeLogRaw("Current: ",T01PZ14_A4921AlbRAnc[0]);
            }
            if ( GXutil.strcmp(Z6463AlbRLote, T01PZ14_A6463AlbRLote[0]) != 0 )
            {
               GXutil.writeLogln("pedidos.disalb:[seudo value changed for attri]"+"AlbRLote");
               GXutil.writeLogRaw("Old: ",Z6463AlbRLote);
               GXutil.writeLogRaw("Current: ",T01PZ14_A6463AlbRLote[0]);
            }
            if ( Z252CliCod != T01PZ14_A252CliCod[0] )
            {
               GXutil.writeLogln("pedidos.disalb:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T01PZ14_A252CliCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBREC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1PZ35( )
   {
      beforeValidate1PZ35( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1PZ35( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1PZ35( 0) ;
         checkOptimisticConcurrency1PZ35( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1PZ35( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1PZ35( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01PZ15 */
                  pr_default.execute(13, new Object[] {A595Kilos, A631Metros, Integer.valueOf(A673Piezas), A396EmprCod, Integer.valueOf(A44AlbRecCod), Integer.valueOf(A361DisCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
                  if ( (pr_default.getStatus(13) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN11PZ35( ) ;
                     /* Start of After( Insert) rules */
                     if ( true /* After */ || true /* After */ )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int10[0] = A44AlbRecCod ;
                        GXv_char3[0] = AV30UsurCod ;
                        GXv_char2[0] = AV31Station ;
                        new app.pestalbr(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_char3, GXv_char2) ;
                        disalb_impl.this.A396EmprCod = GXv_char4[0] ;
                        disalb_impl.this.A44AlbRecCod = GXv_int10[0] ;
                        disalb_impl.this.AV30UsurCod = GXv_char3[0] ;
                        disalb_impl.this.AV31Station = GXv_char2[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "AV30UsurCod", AV30UsurCod);
                        httpContext.ajax_rsp_assign_attri("", false, "AV31Station", AV31Station);
                     }
                     if ( true /* Level */ && true /* After */ && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int10[0] = A44AlbRecCod ;
                        GXv_int9[0] = A361DisCod ;
                        new app.ptdisdef(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int9) ;
                        disalb_impl.this.A396EmprCod = GXv_char4[0] ;
                        disalb_impl.this.A44AlbRecCod = GXv_int10[0] ;
                        disalb_impl.this.A361DisCod = GXv_int9[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
                     }
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1PZ0( ) ;
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
            load1PZ35( ) ;
         }
         endLevel1PZ35( ) ;
      }
      closeExtendedTableCursors1PZ35( ) ;
   }

   public void update1PZ35( )
   {
      beforeValidate1PZ35( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1PZ35( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1PZ35( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1PZ35( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1PZ35( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01PZ16 */
                  pr_default.execute(14, new Object[] {A595Kilos, A631Metros, Integer.valueOf(A673Piezas), A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
                  if ( (pr_default.getStatus(14) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISALB"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1PZ35( ) ;
                  if ( AnyError == 0 )
                  {
                     updateTablesN11PZ35( ) ;
                     /* Start of After( update) rules */
                     if ( true /* After */ || true /* After */ )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int10[0] = A44AlbRecCod ;
                        GXv_char3[0] = AV30UsurCod ;
                        GXv_char2[0] = AV31Station ;
                        new app.pestalbr(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_char3, GXv_char2) ;
                        disalb_impl.this.A396EmprCod = GXv_char4[0] ;
                        disalb_impl.this.A44AlbRecCod = GXv_int10[0] ;
                        disalb_impl.this.AV30UsurCod = GXv_char3[0] ;
                        disalb_impl.this.AV31Station = GXv_char2[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "AV30UsurCod", AV30UsurCod);
                        httpContext.ajax_rsp_assign_attri("", false, "AV31Station", AV31Station);
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
         endLevel1PZ35( ) ;
      }
      closeExtendedTableCursors1PZ35( ) ;
   }

   public void deferredUpdate1PZ35( )
   {
   }

   public void delete( )
   {
      beforeValidate1PZ35( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1PZ35( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1PZ35( ) ;
         afterConfirm1PZ35( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1PZ35( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01PZ17 */
               pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
               if ( AnyError == 0 )
               {
                  updateTablesN11PZ35( ) ;
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
      endLevel1PZ35( ) ;
      Gx_mode = sMode35 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1PZ35( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( (0==A44AlbRecCod) && true /* After */ && isIns( )  )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "N Repecion INVALIDO", ""), 1, "ALBRECCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRecCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         if ( isIns( )  )
         {
            AV25AuxKil = A595Kilos ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25AuxKil", GXutil.ltrimstr( AV25AuxKil, 9, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               AV25AuxKil = A595Kilos.subtract(O595Kilos) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV25AuxKil", GXutil.ltrimstr( AV25AuxKil, 9, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  AV25AuxKil = O595Kilos.negate() ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV25AuxKil", GXutil.ltrimstr( AV25AuxKil, 9, 2));
               }
            }
         }
         if ( isIns( )  )
         {
            AV26AuxMtr = A631Metros ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26AuxMtr", GXutil.ltrimstr( AV26AuxMtr, 9, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               AV26AuxMtr = A631Metros.subtract(O631Metros) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26AuxMtr", GXutil.ltrimstr( AV26AuxMtr, 9, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  AV26AuxMtr = O631Metros.negate() ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV26AuxMtr", GXutil.ltrimstr( AV26AuxMtr, 9, 2));
               }
            }
         }
         if ( isIns( )  )
         {
            AV24AuxPie = A673Piezas ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24AuxPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24AuxPie), 6, 0));
         }
         else
         {
            if ( isUpd( )  )
            {
               AV24AuxPie = (int)(A673Piezas-O673Piezas) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV24AuxPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24AuxPie), 6, 0));
            }
            else
            {
               if ( isDlt( )  )
               {
                  AV24AuxPie = (int)(-O673Piezas) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV24AuxPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24AuxPie), 6, 0));
               }
            }
         }
         /* Using cursor T01PZ18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         Z58AlbRUniEnt = T01PZ18_A58AlbRUniEnt[0] ;
         Z52AlbRPieEnt = T01PZ18_A52AlbRPieEnt[0] ;
         Z56AlbRUni = T01PZ18_A56AlbRUni[0] ;
         Z47AlbREst = T01PZ18_A47AlbREst[0] ;
         Z55AlbRReo = T01PZ18_A55AlbRReo[0] ;
         Z45AlbRef = T01PZ18_A45AlbRef[0] ;
         Z4920AlbRGrm2 = T01PZ18_A4920AlbRGrm2[0] ;
         Z4921AlbRAnc = T01PZ18_A4921AlbRAnc[0] ;
         Z6463AlbRLote = T01PZ18_A6463AlbRLote[0] ;
         Z252CliCod = T01PZ18_A252CliCod[0] ;
         A60AlbRUniUti = T01PZ18_A60AlbRUniUti[0] ;
         A54AlbRPieUti = T01PZ18_A54AlbRPieUti[0] ;
         A58AlbRUniEnt = T01PZ18_A58AlbRUniEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         A52AlbRPieEnt = T01PZ18_A52AlbRPieEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         A56AlbRUni = T01PZ18_A56AlbRUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         A47AlbREst = T01PZ18_A47AlbREst[0] ;
         A55AlbRReo = T01PZ18_A55AlbRReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
         A45AlbRef = T01PZ18_A45AlbRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         A4920AlbRGrm2 = T01PZ18_A4920AlbRGrm2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
         A4921AlbRAnc = T01PZ18_A4921AlbRAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
         A6463AlbRLote = T01PZ18_A6463AlbRLote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", A6463AlbRLote);
         A252CliCod = T01PZ18_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         O54AlbRPieUti = A54AlbRPieUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         O60AlbRUniUti = A60AlbRUniUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         pr_default.close(16);
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
         /* Using cursor T01PZ19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         A369DisFec = T01PZ19_A369DisFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A369DisFec", localUtil.format(A369DisFec, "99/99/99"));
         A392DisUniMed = T01PZ19_A392DisUniMed[0] ;
         A335DisArtCod = T01PZ19_A335DisArtCod[0] ;
         A337DisArtDsc = T01PZ19_A337DisArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A337DisArtDsc", A337DisArtDsc);
         pr_default.close(17);
         if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 )
         {
            AV22Kilos = AV21AlbrUniDis ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22Kilos", GXutil.ltrimstr( AV22Kilos, 9, 2));
         }
         if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 )
         {
            AV23Metros = AV21AlbrUniDis ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23Metros", GXutil.ltrimstr( AV23Metros, 9, 2));
         }
         if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 )
         {
            edtMetros_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetros_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetros_Visible), 5, 0), true);
         }
         if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 )
         {
            edtMetros_Width = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetros_Internalname, "Width", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetros_Width), 9, 0), true);
         }
         if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 )
         {
            edtKilos_Width = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtKilos_Internalname, "Width", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtKilos_Width), 9, 0), true);
         }
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
         /* * Property Visible not supported in */
         /* * Property Visible not supported in */
         /* * Property Visible not supported in */
         if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 )
         {
            /* * Property Visible not supported in */
            /*
               Assignment error:
               ================
               Expression: [ t('0',3) ]
               Target    : [ t('&Dispiemtr',23),t('Visible',3) ]
               ForType   : 29
               Type      : []
            */
         }
         /* * Property Visible not supported in */
         /* * Property Visible not supported in */
         /* * Property Visible not supported in */
         if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 )
         {
            /* * Property Visible not supported in */
            /*
               Assignment error:
               ================
               Expression: [ t('0',3) ]
               Target    : [ t('&Dispiekgm',23),t('Visible',3) ]
               ForType   : 29
               Type      : []
            */
         }
         /* Using cursor T01PZ20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01PZ20_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(18);
         GXt_int8 = AV27DisPieNor ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int10[0] = A361DisCod ;
         GXv_int9[0] = 0 ;
         GXv_int11[0] = GXt_int8 ;
         new app.pdisaln1(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int9, GXv_int11) ;
         disalb_impl.this.A396EmprCod = GXv_char4[0] ;
         disalb_impl.this.A361DisCod = GXv_int10[0] ;
         disalb_impl.this.GXt_int8 = GXv_int11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         AV27DisPieNor = GXt_int8 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27DisPieNor", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27DisPieNor), 4, 0));
         GXt_decimal12 = AV28DisPieKgm ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int10[0] = A361DisCod ;
         GXv_decimal14[0] = DecimalUtil.doubleToDec(0) ;
         GXv_decimal13[0] = GXt_decimal12 ;
         new app.pdisaln2(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_decimal14, GXv_decimal13) ;
         disalb_impl.this.A396EmprCod = GXv_char4[0] ;
         disalb_impl.this.A361DisCod = GXv_int10[0] ;
         disalb_impl.this.GXt_decimal12 = GXv_decimal13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         AV28DisPieKgm = GXt_decimal12 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28DisPieKgm", GXutil.ltrimstr( AV28DisPieKgm, 9, 2));
         GXt_decimal12 = AV29DisPieMtr ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int10[0] = A361DisCod ;
         GXv_decimal14[0] = DecimalUtil.doubleToDec(0) ;
         GXv_decimal13[0] = GXt_decimal12 ;
         new app.pdisaln3(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_decimal14, GXv_decimal13) ;
         disalb_impl.this.A396EmprCod = GXv_char4[0] ;
         disalb_impl.this.A361DisCod = GXv_int10[0] ;
         disalb_impl.this.GXt_decimal12 = GXv_decimal13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         AV29DisPieMtr = GXt_decimal12 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29DisPieMtr", GXutil.ltrimstr( AV29DisPieMtr, 9, 2));
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01PZ21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "UBIOUT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01PZ22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISALD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
      }
   }

   public void updateTablesN11PZ35( )
   {
      /* Using cursor T01PZ23 */
      pr_default.execute(21, new Object[] {A60AlbRUniUti, Integer.valueOf(A54AlbRPieUti), A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
   }

   public void endLevel1PZ35( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      pr_default.close(12);
      if ( AnyError == 0 )
      {
         beforeComplete1PZ35( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pedidos.disalb");
         if ( AnyError == 0 )
         {
            confirmValues1PZ0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "pedidos.disalb");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1PZ35( )
   {
      /* Scan By routine */
      /* Using cursor T01PZ24 */
      pr_default.execute(22, new Object[] {A396EmprCod});
      RcdFound35 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound35 = (short)(1) ;
         A361DisCod = T01PZ24_A361DisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A44AlbRecCod = T01PZ24_A44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1PZ35( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound35 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound35 = (short)(1) ;
         A361DisCod = T01PZ24_A361DisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A44AlbRecCod = T01PZ24_A44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
   }

   public void scanEnd1PZ35( )
   {
      pr_default.close(22);
   }

   public void afterConfirm1PZ35( )
   {
      /* After Confirm Rules */
      if ( ( AV20Albrpiedis < 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "AVISO.Cantidad de Piezas Pedido superior a Piezas Disponibles", ""), 0, "");
      }
      if ( true /* After */ )
      {
         GXt_int8 = AV27DisPieNor ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int10[0] = A361DisCod ;
         GXv_int9[0] = AV24AuxPie ;
         GXv_int11[0] = GXt_int8 ;
         new app.pdisaln1(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int9, GXv_int11) ;
         disalb_impl.this.A396EmprCod = GXv_char4[0] ;
         disalb_impl.this.A361DisCod = GXv_int10[0] ;
         disalb_impl.this.AV24AuxPie = GXv_int9[0] ;
         disalb_impl.this.GXt_int8 = GXv_int11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV24AuxPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24AuxPie), 6, 0));
         AV27DisPieNor = GXt_int8 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27DisPieNor", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27DisPieNor), 4, 0));
      }
      if ( true /* After */ )
      {
         GXt_decimal12 = AV28DisPieKgm ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int10[0] = A361DisCod ;
         GXv_decimal14[0] = AV25AuxKil ;
         GXv_decimal13[0] = GXt_decimal12 ;
         new app.pdisaln2(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_decimal14, GXv_decimal13) ;
         disalb_impl.this.A396EmprCod = GXv_char4[0] ;
         disalb_impl.this.A361DisCod = GXv_int10[0] ;
         disalb_impl.this.AV25AuxKil = GXv_decimal14[0] ;
         disalb_impl.this.GXt_decimal12 = GXv_decimal13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV25AuxKil", GXutil.ltrimstr( AV25AuxKil, 9, 2));
         AV28DisPieKgm = GXt_decimal12 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28DisPieKgm", GXutil.ltrimstr( AV28DisPieKgm, 9, 2));
      }
      if ( true /* After */ )
      {
         GXt_decimal12 = AV29DisPieMtr ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int10[0] = A361DisCod ;
         GXv_decimal14[0] = AV26AuxMtr ;
         GXv_decimal13[0] = GXt_decimal12 ;
         new app.pdisaln3(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_decimal14, GXv_decimal13) ;
         disalb_impl.this.A396EmprCod = GXv_char4[0] ;
         disalb_impl.this.A361DisCod = GXv_int10[0] ;
         disalb_impl.this.AV26AuxMtr = GXv_decimal14[0] ;
         disalb_impl.this.GXt_decimal12 = GXv_decimal13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV26AuxMtr", GXutil.ltrimstr( AV26AuxMtr, 9, 2));
         AV29DisPieMtr = GXt_decimal12 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29DisPieMtr", GXutil.ltrimstr( AV29DisPieMtr, 9, 2));
      }
      if ( ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cantidad de Unidades Pedido superior a Unidades Disponibles", ""), 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
   }

   public void beforeInsert1PZ35( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1PZ35( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1PZ35( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1PZ35( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1PZ35( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1PZ35( )
   {
      edtDisCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      edtDisFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFec_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtDisArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtDsc_Enabled), 5, 0), true);
      edtAlbRecCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      edtAlbRef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Enabled), 5, 0), true);
      cmbAlbRReo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRReo.getEnabled(), 5, 0), true);
      edtAlbRLote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLote_Enabled), 5, 0), true);
      edtAlbRGrm2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRGrm2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRGrm2_Enabled), 5, 0), true);
      edtAlbRAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRAnc_Enabled), 5, 0), true);
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
      edtKilos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtKilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtKilos_Enabled), 5, 0), true);
      edtMetros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetros_Enabled), 5, 0), true);
      edtPiezas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPiezas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPiezas_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1PZ35( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1PZ0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.pedidos.disalb", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8DisCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9AlbRecCod,8,0))}, new String[] {"Gx_mode","EmprCod","DisCod","AlbRecCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"DisAlb");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("pedidos\\disalb:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      app.GxWebStd.gx_hidden_field( httpContext, "O631Metros", GXutil.ltrim( localUtil.ntoc( O631Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O595Kilos", GXutil.ltrim( localUtil.ntoc( O595Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O673Piezas", GXutil.ltrim( localUtil.ntoc( O673Piezas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( O54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( O60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O392DisUniMed", GXutil.rtrim( O392DisUniMed));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRFENI", localUtil.dtoc( AV16AlbRfeni, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRUNIUTI", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRPIEUTI", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vDISCOD", GXutil.ltrim( localUtil.ntoc( AV8DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8DisCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRECCOD", GXutil.ltrim( localUtil.ntoc( AV9AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBRECCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9AlbRecCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRUNIDIS", GXutil.ltrim( localUtil.ntoc( AV21AlbrUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISUNIMED", GXutil.rtrim( A392DisUniMed));
      app.GxWebStd.gx_hidden_field( httpContext, "vKILOS", GXutil.ltrim( localUtil.ntoc( AV22Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMETROS", GXutil.ltrim( localUtil.ntoc( AV23Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vAUXPIE", GXutil.ltrim( localUtil.ntoc( AV24AuxPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vAUXKIL", GXutil.ltrim( localUtil.ntoc( AV25AuxKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vAUXMTR", GXutil.ltrim( localUtil.ntoc( AV26AuxMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vDISPIENOR", GXutil.ltrim( localUtil.ntoc( AV27DisPieNor, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vDISPIEKGM", GXutil.ltrim( localUtil.ntoc( AV28DisPieKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vDISPIEMTR", GXutil.ltrim( localUtil.ntoc( AV29DisPieMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRPIEDIS", GXutil.ltrim( localUtil.ntoc( AV20Albrpiedis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV31Station));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV30UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGCLI", GXutil.ltrim( localUtil.ntoc( AV32FlagCli, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGEMP", GXutil.ltrim( localUtil.ntoc( AV33FlagEmp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG7", GXutil.rtrim( AV19msg7));
      app.GxWebStd.gx_hidden_field( httpContext, "DISARTCOD", GXutil.rtrim( A335DisArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vERRARTREF", GXutil.ltrim( localUtil.ntoc( AV18errartref, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBREST", GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Objectcall", GXutil.rtrim( Dvpanel_tablepedido_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Enabled", GXutil.booltostr( Dvpanel_tablepedido_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Width", GXutil.rtrim( Dvpanel_tablepedido_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Autowidth", GXutil.booltostr( Dvpanel_tablepedido_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Autoheight", GXutil.booltostr( Dvpanel_tablepedido_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Cls", GXutil.rtrim( Dvpanel_tablepedido_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Title", GXutil.rtrim( Dvpanel_tablepedido_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Collapsible", GXutil.booltostr( Dvpanel_tablepedido_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Collapsed", GXutil.booltostr( Dvpanel_tablepedido_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Showcollapseicon", GXutil.booltostr( Dvpanel_tablepedido_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Iconposition", GXutil.rtrim( Dvpanel_tablepedido_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Autoscroll", GXutil.booltostr( Dvpanel_tablepedido_Autoscroll));
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
      return formatLink("app.pedidos.disalb", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8DisCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9AlbRecCod,8,0))}, new String[] {"Gx_mode","EmprCod","DisCod","AlbRecCod"})  ;
   }

   public String getPgmname( )
   {
      return "Pedidos.DisAlb" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Entrada de Almacén", "") ;
   }

   public void initializeNonKey1PZ35( )
   {
      AV22Kilos = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Kilos", GXutil.ltrimstr( AV22Kilos, 9, 2));
      AV23Metros = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Metros", GXutil.ltrimstr( AV23Metros, 9, 2));
      A60AlbRUniUti = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      A54AlbRPieUti = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      AV24AuxPie = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24AuxPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24AuxPie), 6, 0));
      AV25AuxKil = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25AuxKil", GXutil.ltrimstr( AV25AuxKil, 9, 2));
      AV26AuxMtr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26AuxMtr", GXutil.ltrimstr( AV26AuxMtr, 9, 2));
      AV27DisPieNor = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27DisPieNor", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27DisPieNor), 4, 0));
      AV28DisPieKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28DisPieKgm", GXutil.ltrimstr( AV28DisPieKgm, 9, 2));
      AV29DisPieMtr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29DisPieMtr", GXutil.ltrimstr( AV29DisPieMtr, 9, 2));
      AV32FlagCli = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32FlagCli", GXutil.str( AV32FlagCli, 1, 0));
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
      A595Kilos = AV22Kilos ;
      httpContext.ajax_rsp_assign_attri("", false, "A595Kilos", GXutil.ltrimstr( A595Kilos, 9, 2));
      A631Metros = AV23Metros ;
      httpContext.ajax_rsp_assign_attri("", false, "A631Metros", GXutil.ltrimstr( A631Metros, 9, 2));
      A673Piezas = AV20Albrpiedis ;
      httpContext.ajax_rsp_assign_attri("", false, "A673Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A673Piezas), 6, 0));
      O631Metros = A631Metros ;
      httpContext.ajax_rsp_assign_attri("", false, "A631Metros", GXutil.ltrimstr( A631Metros, 9, 2));
      O595Kilos = A595Kilos ;
      httpContext.ajax_rsp_assign_attri("", false, "A595Kilos", GXutil.ltrimstr( A595Kilos, 9, 2));
      O673Piezas = A673Piezas ;
      httpContext.ajax_rsp_assign_attri("", false, "A673Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A673Piezas), 6, 0));
      O54AlbRPieUti = A54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      O60AlbRUniUti = A60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      O392DisUniMed = A392DisUniMed ;
      httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
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

   public void initAll1PZ35( )
   {
      A361DisCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      A44AlbRecCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      initializeNonKey1PZ35( ) ;
   }

   public void standaloneModalInsert( )
   {
      A673Piezas = i673Piezas ;
      httpContext.ajax_rsp_assign_attri("", false, "A673Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A673Piezas), 6, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211684380", true, true);
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
      httpContext.AddJavascriptSource("pedidos/disalb.js", "?20268211684380", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTbngruia_Internalname = "TBNGRUIA" ;
      edtDisCod_Internalname = "DISCOD" ;
      edtDisFec_Internalname = "DISFEC" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtDisArtDsc_Internalname = "DISARTDSC" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divTablepedido_Internalname = "TABLEPEDIDO" ;
      Dvpanel_tablepedido_Internalname = "DVPANEL_TABLEPEDIDO" ;
      divDvpanel_tablepedido_cell_Internalname = "DVPANEL_TABLEPEDIDO_CELL" ;
      lblTextblockalbreccod_Internalname = "TEXTBLOCKALBRECCOD" ;
      edtAlbRecCod_Internalname = "ALBRECCOD" ;
      lblImgbsc_albreccod_Internalname = "IMGBSC_ALBRECCOD" ;
      divTablesearch_albreccod_Internalname = "TABLESEARCH_ALBRECCOD" ;
      tblTablemergedalbreccod_Internalname = "TABLEMERGEDALBRECCOD" ;
      divTablesplittedalbreccod_Internalname = "TABLESPLITTEDALBRECCOD" ;
      edtAlbRef_Internalname = "ALBREF" ;
      cmbAlbRReo.setInternalname( "ALBRREO" );
      edtAlbRLote_Internalname = "ALBRLOTE" ;
      edtAlbRGrm2_Internalname = "ALBRGRM2" ;
      edtAlbRAnc_Internalname = "ALBRANC" ;
      edtAlbRPieEnt_Internalname = "ALBRPIEENT" ;
      edtAlbRUniEnt_Internalname = "ALBRUNIENT" ;
      cmbAlbRUni.setInternalname( "ALBRUNI" );
      edtAlbRUniDis_Internalname = "ALBRUNIDIS" ;
      edtAlbRPieDis_Internalname = "ALBRPIEDIS" ;
      edtKilos_Internalname = "KILOS" ;
      edtMetros_Internalname = "METROS" ;
      edtPiezas_Internalname = "PIEZAS" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
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
      Form.setCaption( httpContext.getMessage( "Entrada de Almacén", "") );
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
      edtPiezas_Jsonclick = "" ;
      edtPiezas_Enabled = 1 ;
      edtMetros_Jsonclick = "" ;
      edtMetros_Width = 9 ;
      edtMetros_Enabled = 1 ;
      edtMetros_Visible = 1 ;
      edtKilos_Jsonclick = "" ;
      edtKilos_Width = 9 ;
      edtKilos_Enabled = 1 ;
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
      edtAlbRAnc_Jsonclick = "" ;
      edtAlbRAnc_Enabled = 0 ;
      edtAlbRGrm2_Jsonclick = "" ;
      edtAlbRGrm2_Enabled = 0 ;
      edtAlbRLote_Jsonclick = "" ;
      edtAlbRLote_Enabled = 0 ;
      cmbAlbRReo.setJsonclick( "" );
      cmbAlbRReo.setEnabled( 0 );
      edtAlbRef_Jsonclick = "" ;
      edtAlbRef_Enabled = 0 ;
      edtAlbRecCod_Jsonclick = "" ;
      edtAlbRecCod_Enabled = 1 ;
      Dvpanel_tableattributes_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Iconposition = "Right" ;
      Dvpanel_tableattributes_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Title = httpContext.getMessage( "Entrada de almacén", "") ;
      Dvpanel_tableattributes_Cls = "PanelNoHeader" ;
      Dvpanel_tableattributes_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Width = "100%" ;
      edtDisArtDsc_Jsonclick = "" ;
      edtDisArtDsc_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 0 ;
      edtDisFec_Jsonclick = "" ;
      edtDisFec_Enabled = 0 ;
      edtDisCod_Jsonclick = "" ;
      edtDisCod_Enabled = 0 ;
      Dvpanel_tablepedido_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tablepedido_Iconposition = "Right" ;
      Dvpanel_tablepedido_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tablepedido_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tablepedido_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_tablepedido_Title = "" ;
      Dvpanel_tablepedido_Cls = "PanelNoHeader" ;
      Dvpanel_tablepedido_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tablepedido_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tablepedido_Width = "100%" ;
      divDvpanel_tablepedido_cell_Class = "col-xs-12" ;
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

   public void gx19asadispienor1PZ35( String A396EmprCod ,
                                      int A361DisCod ,
                                      int AV24AuxPie )
   {
      if ( true /* After */ )
      {
         GXt_int8 = AV27DisPieNor ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int10[0] = A361DisCod ;
         GXv_int9[0] = AV24AuxPie ;
         GXv_int11[0] = GXt_int8 ;
         new app.pdisaln1(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int9, GXv_int11) ;
         disalb_impl.this.A396EmprCod = GXv_char4[0] ;
         disalb_impl.this.A361DisCod = GXv_int10[0] ;
         disalb_impl.this.AV24AuxPie = GXv_int9[0] ;
         disalb_impl.this.GXt_int8 = GXv_int11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV24AuxPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24AuxPie), 6, 0));
         AV27DisPieNor = GXt_int8 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27DisPieNor", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27DisPieNor), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV27DisPieNor, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx20asadispienor1PZ35( String A396EmprCod ,
                                      int A361DisCod )
   {
      GXt_int8 = AV27DisPieNor ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int10[0] = A361DisCod ;
      GXv_int9[0] = 0 ;
      GXv_int11[0] = GXt_int8 ;
      new app.pdisaln1(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int9, GXv_int11) ;
      disalb_impl.this.A396EmprCod = GXv_char4[0] ;
      disalb_impl.this.A361DisCod = GXv_int10[0] ;
      disalb_impl.this.GXt_int8 = GXv_int11[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      AV27DisPieNor = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27DisPieNor", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27DisPieNor), 4, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV27DisPieNor, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx21asadispiekgm1PZ35( String A396EmprCod ,
                                      int A361DisCod ,
                                      java.math.BigDecimal AV25AuxKil )
   {
      if ( true /* After */ )
      {
         GXt_decimal12 = AV28DisPieKgm ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int10[0] = A361DisCod ;
         GXv_decimal14[0] = AV25AuxKil ;
         GXv_decimal13[0] = GXt_decimal12 ;
         new app.pdisaln2(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_decimal14, GXv_decimal13) ;
         disalb_impl.this.A396EmprCod = GXv_char4[0] ;
         disalb_impl.this.A361DisCod = GXv_int10[0] ;
         disalb_impl.this.AV25AuxKil = GXv_decimal14[0] ;
         disalb_impl.this.GXt_decimal12 = GXv_decimal13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV25AuxKil", GXutil.ltrimstr( AV25AuxKil, 9, 2));
         AV28DisPieKgm = GXt_decimal12 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28DisPieKgm", GXutil.ltrimstr( AV28DisPieKgm, 9, 2));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV28DisPieKgm, (byte)(9), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx22asadispiekgm1PZ35( String A396EmprCod ,
                                      int A361DisCod )
   {
      GXt_decimal12 = AV28DisPieKgm ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int10[0] = A361DisCod ;
      GXv_decimal14[0] = DecimalUtil.doubleToDec(0) ;
      GXv_decimal13[0] = GXt_decimal12 ;
      new app.pdisaln2(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_decimal14, GXv_decimal13) ;
      disalb_impl.this.A396EmprCod = GXv_char4[0] ;
      disalb_impl.this.A361DisCod = GXv_int10[0] ;
      disalb_impl.this.GXt_decimal12 = GXv_decimal13[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      AV28DisPieKgm = GXt_decimal12 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28DisPieKgm", GXutil.ltrimstr( AV28DisPieKgm, 9, 2));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV28DisPieKgm, (byte)(9), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx23asadispiemtr1PZ35( String A396EmprCod ,
                                      int A361DisCod ,
                                      java.math.BigDecimal AV26AuxMtr )
   {
      if ( true /* After */ )
      {
         GXt_decimal12 = AV29DisPieMtr ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int10[0] = A361DisCod ;
         GXv_decimal14[0] = AV26AuxMtr ;
         GXv_decimal13[0] = GXt_decimal12 ;
         new app.pdisaln3(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_decimal14, GXv_decimal13) ;
         disalb_impl.this.A396EmprCod = GXv_char4[0] ;
         disalb_impl.this.A361DisCod = GXv_int10[0] ;
         disalb_impl.this.AV26AuxMtr = GXv_decimal14[0] ;
         disalb_impl.this.GXt_decimal12 = GXv_decimal13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV26AuxMtr", GXutil.ltrimstr( AV26AuxMtr, 9, 2));
         AV29DisPieMtr = GXt_decimal12 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29DisPieMtr", GXutil.ltrimstr( AV29DisPieMtr, 9, 2));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV29DisPieMtr, (byte)(9), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx24asadispiemtr1PZ35( String A396EmprCod ,
                                      int A361DisCod )
   {
      GXt_decimal12 = AV29DisPieMtr ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int10[0] = A361DisCod ;
      GXv_decimal14[0] = DecimalUtil.doubleToDec(0) ;
      GXv_decimal13[0] = GXt_decimal12 ;
      new app.pdisaln3(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_decimal14, GXv_decimal13) ;
      disalb_impl.this.A396EmprCod = GXv_char4[0] ;
      disalb_impl.this.A361DisCod = GXv_int10[0] ;
      disalb_impl.this.GXt_decimal12 = GXv_decimal13[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      AV29DisPieMtr = GXt_decimal12 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29DisPieMtr", GXutil.ltrimstr( AV29DisPieMtr, 9, 2));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV29DisPieMtr, (byte)(9), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_32_1PZ35( String A396EmprCod ,
                            int A44AlbRecCod ,
                            int AV20Albrpiedis ,
                            java.math.BigDecimal AV21AlbrUniDis )
   {
      if ( ! (0==A44AlbRecCod) && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int10[0] = A44AlbRecCod ;
         GXv_int9[0] = AV20Albrpiedis ;
         GXv_decimal14[0] = AV21AlbrUniDis ;
         new app.pbusstk(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int9, GXv_decimal14) ;
         A396EmprCod = GXv_char4[0] ;
         A44AlbRecCod = GXv_int10[0] ;
         AV20Albrpiedis = GXv_int9[0] ;
         AV21AlbrUniDis = GXv_decimal14[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV20Albrpiedis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20Albrpiedis), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV21AlbrUniDis", GXutil.ltrimstr( AV21AlbrUniDis, 9, 2));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV20Albrpiedis, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV21AlbrUniDis, (byte)(9), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_40_1PZ35( String A396EmprCod ,
                            int A44AlbRecCod ,
                            String AV30UsurCod ,
                            String AV31Station )
   {
      if ( true /* After */ || true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int10[0] = A44AlbRecCod ;
         GXv_char3[0] = AV30UsurCod ;
         GXv_char2[0] = AV31Station ;
         new app.pestalbr(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_char3, GXv_char2) ;
         A396EmprCod = GXv_char4[0] ;
         A44AlbRecCod = GXv_int10[0] ;
         AV30UsurCod = GXv_char3[0] ;
         AV31Station = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV30UsurCod", AV30UsurCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV31Station", AV31Station);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV30UsurCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV31Station))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_41_1PZ35( String A396EmprCod ,
                            int A44AlbRecCod ,
                            int A361DisCod ,
                            String A55AlbRReo )
   {
      if ( true /* Level */ && true /* After */ && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int10[0] = A44AlbRecCod ;
         GXv_int9[0] = A361DisCod ;
         new app.ptdisdef(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int9) ;
         A396EmprCod = GXv_char4[0] ;
         A44AlbRecCod = GXv_int10[0] ;
         A361DisCod = GXv_int9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_42_1PZ35( String A396EmprCod ,
                            int A44AlbRecCod ,
                            int A252CliCod )
   {
      if ( true /* After */ && ! (0==A44AlbRecCod) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int10[0] = A44AlbRecCod ;
         GXv_int9[0] = A252CliCod ;
         GXv_int6[0] = AV32FlagCli ;
         new app.pctrcli(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int9, GXv_int6) ;
         A396EmprCod = GXv_char4[0] ;
         A44AlbRecCod = GXv_int10[0] ;
         A252CliCod = GXv_int9[0] ;
         AV32FlagCli = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV32FlagCli", GXutil.str( AV32FlagCli, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV32FlagCli, (byte)(1), (byte)(0), ".", "")))+"\"") ;
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
      cmbAlbRReo.setName( "ALBRREO" );
      cmbAlbRReo.setWebtags( "" );
      cmbAlbRReo.addItem("NO", httpContext.getMessage( "NO", ""), (short)(0));
      cmbAlbRReo.addItem("SI", httpContext.getMessage( "SI", ""), (short)(0));
      if ( cmbAlbRReo.getItemCount() > 0 )
      {
         A55AlbRReo = cmbAlbRReo.getValidValue(A55AlbRReo) ;
         httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
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

   public void valid_Discod( )
   {
      /* Using cursor T01PZ19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisCod_Internalname ;
      }
      A369DisFec = T01PZ19_A369DisFec[0] ;
      A392DisUniMed = T01PZ19_A392DisUniMed[0] ;
      A335DisArtCod = T01PZ19_A335DisArtCod[0] ;
      A337DisArtDsc = T01PZ19_A337DisArtDsc[0] ;
      O392DisUniMed = A392DisUniMed ;
      pr_default.close(17);
      if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 )
      {
         AV22Kilos = AV21AlbrUniDis ;
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A595Kilos)==0) && ( Gx_BScreen == 0 ) )
      {
         A595Kilos = AV22Kilos ;
      }
      if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 )
      {
         AV23Metros = AV21AlbrUniDis ;
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A631Metros)==0) && ( Gx_BScreen == 0 ) )
      {
         A631Metros = AV23Metros ;
      }
      if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 )
      {
         edtMetros_Visible = 0 ;
      }
      if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 )
      {
         edtMetros_Width = 0 ;
      }
      if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 )
      {
         edtKilos_Width = 0 ;
      }
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 )
      {
         /* * Property Visible not supported in */
         /*
            Assignment error:
            ================
            Expression: [ t('0',3) ]
            Target    : [ t('&Dispiemtr',23),t('Visible',3) ]
            ForType   : 29
            Type      : []
         */
      }
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 )
      {
         /* * Property Visible not supported in */
         /*
            Assignment error:
            ================
            Expression: [ t('0',3) ]
            Target    : [ t('&Dispiekgm',23),t('Visible',3) ]
            ForType   : 29
            Type      : []
         */
      }
      GXt_int8 = AV27DisPieNor ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int10[0] = A361DisCod ;
      GXv_int9[0] = 0 ;
      GXv_int11[0] = GXt_int8 ;
      new app.pdisaln1(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int9, GXv_int11) ;
      disalb_impl.this.A396EmprCod = GXv_char4[0] ;
      disalb_impl.this.A361DisCod = GXv_int10[0] ;
      disalb_impl.this.GXt_int8 = GXv_int11[0] ;
      AV27DisPieNor = GXt_int8 ;
      GXt_decimal12 = AV28DisPieKgm ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int10[0] = A361DisCod ;
      GXv_decimal14[0] = DecimalUtil.doubleToDec(0) ;
      GXv_decimal13[0] = GXt_decimal12 ;
      new app.pdisaln2(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_decimal14, GXv_decimal13) ;
      disalb_impl.this.A396EmprCod = GXv_char4[0] ;
      disalb_impl.this.A361DisCod = GXv_int10[0] ;
      disalb_impl.this.GXt_decimal12 = GXv_decimal13[0] ;
      AV28DisPieKgm = GXt_decimal12 ;
      GXt_decimal12 = AV29DisPieMtr ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int10[0] = A361DisCod ;
      GXv_decimal14[0] = DecimalUtil.doubleToDec(0) ;
      GXv_decimal13[0] = GXt_decimal12 ;
      new app.pdisaln3(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_decimal14, GXv_decimal13) ;
      disalb_impl.this.A396EmprCod = GXv_char4[0] ;
      disalb_impl.this.A361DisCod = GXv_int10[0] ;
      disalb_impl.this.GXt_decimal12 = GXv_decimal13[0] ;
      AV29DisPieMtr = GXt_decimal12 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "O392DisUniMed", GXutil.rtrim( O392DisUniMed));
      httpContext.ajax_rsp_assign_attri("", false, "A369DisFec", localUtil.format(A369DisFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", GXutil.rtrim( A392DisUniMed));
      httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", GXutil.rtrim( A335DisArtCod));
      httpContext.ajax_rsp_assign_attri("", false, "A337DisArtDsc", GXutil.rtrim( A337DisArtDsc));
      httpContext.ajax_rsp_assign_attri("", false, "AV22Kilos", GXutil.ltrim( localUtil.ntoc( AV22Kilos, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A595Kilos", GXutil.ltrim( localUtil.ntoc( A595Kilos, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV23Metros", GXutil.ltrim( localUtil.ntoc( AV23Metros, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A631Metros", GXutil.ltrim( localUtil.ntoc( A631Metros, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, edtMetros_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetros_Visible), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtMetros_Internalname, "Width", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetros_Width), 9, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtKilos_Internalname, "Width", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtKilos_Width), 9, 0), true);
      httpContext.ajax_rsp_assign_attri("", false, "AV27DisPieNor", GXutil.ltrim( localUtil.ntoc( AV27DisPieNor, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV28DisPieKgm", GXutil.ltrim( localUtil.ntoc( AV28DisPieKgm, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV29DisPieMtr", GXutil.ltrim( localUtil.ntoc( AV29DisPieMtr, (byte)(9), (byte)(2), ".", "")));
   }

   public void valid_Albreccod( )
   {
      A56AlbRUni = cmbAlbRUni.getValue() ;
      cmbAlbRUni.setValue( A56AlbRUni );
      A55AlbRReo = cmbAlbRReo.getValue() ;
      cmbAlbRReo.setValue( A55AlbRReo );
      /* Using cursor T01PZ18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      Z58AlbRUniEnt = T01PZ18_A58AlbRUniEnt[0] ;
      Z52AlbRPieEnt = T01PZ18_A52AlbRPieEnt[0] ;
      Z56AlbRUni = T01PZ18_A56AlbRUni[0] ;
      Z47AlbREst = T01PZ18_A47AlbREst[0] ;
      Z55AlbRReo = T01PZ18_A55AlbRReo[0] ;
      Z45AlbRef = T01PZ18_A45AlbRef[0] ;
      Z4920AlbRGrm2 = T01PZ18_A4920AlbRGrm2[0] ;
      Z4921AlbRAnc = T01PZ18_A4921AlbRAnc[0] ;
      Z6463AlbRLote = T01PZ18_A6463AlbRLote[0] ;
      Z252CliCod = T01PZ18_A252CliCod[0] ;
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "N Recepcion Inexistente", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
      }
      A60AlbRUniUti = T01PZ18_A60AlbRUniUti[0] ;
      A54AlbRPieUti = T01PZ18_A54AlbRPieUti[0] ;
      A58AlbRUniEnt = T01PZ18_A58AlbRUniEnt[0] ;
      A52AlbRPieEnt = T01PZ18_A52AlbRPieEnt[0] ;
      A56AlbRUni = T01PZ18_A56AlbRUni[0] ;
      cmbAlbRUni.setValue( A56AlbRUni );
      A47AlbREst = T01PZ18_A47AlbREst[0] ;
      A55AlbRReo = T01PZ18_A55AlbRReo[0] ;
      cmbAlbRReo.setValue( A55AlbRReo );
      A45AlbRef = T01PZ18_A45AlbRef[0] ;
      A4920AlbRGrm2 = T01PZ18_A4920AlbRGrm2[0] ;
      A4921AlbRAnc = T01PZ18_A4921AlbRAnc[0] ;
      A6463AlbRLote = T01PZ18_A6463AlbRLote[0] ;
      A252CliCod = T01PZ18_A252CliCod[0] ;
      O54AlbRPieUti = A54AlbRPieUti ;
      O60AlbRUniUti = A60AlbRUniUti ;
      pr_default.close(16);
      if ( ( GXutil.strcmp(A335DisArtCod, A45AlbRef) != 0 ) && ( AV18errartref == 0 ) )
      {
         httpContext.GX_msglist.addItem(AV19msg7, 0, "");
      }
      if ( ( GXutil.strcmp(A335DisArtCod, A45AlbRef) != 0 ) && ( AV18errartref == 1 ) )
      {
         httpContext.GX_msglist.addItem(AV19msg7, 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
      }
      /* Using cursor T01PZ20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01PZ20_A279CliNom[0] ;
      pr_default.close(18);
      if ( ! (0==A44AlbRecCod) && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int10[0] = A44AlbRecCod ;
         GXv_int9[0] = AV20Albrpiedis ;
         GXv_decimal14[0] = AV21AlbrUniDis ;
         new app.pbusstk(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int9, GXv_decimal14) ;
         disalb_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         disalb_impl.this.A44AlbRecCod = GXv_int10[0] ;
         A44AlbRecCod = this.A44AlbRecCod ;
         disalb_impl.this.AV20Albrpiedis = GXv_int9[0] ;
         AV20Albrpiedis = this.AV20Albrpiedis ;
         disalb_impl.this.AV21AlbrUniDis = GXv_decimal14[0] ;
         AV21AlbrUniDis = this.AV21AlbrUniDis ;
      }
      if ( (0==A44AlbRecCod) && true /* After */ && isIns( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "N Repecion INVALIDO", ""), 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
      }
      if ( ( GXutil.strcmp(A56AlbRUni, A392DisUniMed) != 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Unidad Pedido diferente Unidad Almacen", ""), 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
      }
      if ( true /* After */ && ! (0==A44AlbRecCod) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int10[0] = A44AlbRecCod ;
         GXv_int9[0] = A252CliCod ;
         GXv_int6[0] = AV32FlagCli ;
         new app.pctrcli(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int9, GXv_int6) ;
         disalb_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         disalb_impl.this.A44AlbRecCod = GXv_int10[0] ;
         A44AlbRecCod = this.A44AlbRecCod ;
         disalb_impl.this.A252CliCod = GXv_int9[0] ;
         A252CliCod = this.A252CliCod ;
         disalb_impl.this.AV32FlagCli = GXv_int6[0] ;
         AV32FlagCli = this.AV32FlagCli ;
      }
      if ( true /* After */ && ( AV32FlagCli == 1 ) && ! (0==A44AlbRecCod) && ( AV33FlagEmp == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente Disposicion Diferente a Cliente Empesa", ""), 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
      }
      if ( true /* After */ && ( AV32FlagCli == 1 ) && ! (0==A44AlbRecCod) && ( AV33FlagEmp == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "AVISO: Cliente Disposicion Diferente a Cliente Empesa", ""), 0, "ALBRECCOD");
      }
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
      if ( cmbAlbRReo.getItemCount() > 0 )
      {
         A55AlbRReo = cmbAlbRReo.getValidValue(A55AlbRReo) ;
         cmbAlbRReo.setValue( A55AlbRReo );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbRReo.setValue( GXutil.rtrim( A55AlbRReo) );
      }
      /*  Sending validation outputs */
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
      cmbAlbRReo.setValue( GXutil.rtrim( A55AlbRReo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Values", cmbAlbRReo.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", GXutil.rtrim( A45AlbRef));
      httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrim( localUtil.ntoc( A4920AlbRGrm2, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrim( localUtil.ntoc( A4921AlbRAnc, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", GXutil.rtrim( A6463AlbRLote));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "AV20Albrpiedis", GXutil.ltrim( localUtil.ntoc( AV20Albrpiedis, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV21AlbrUniDis", GXutil.ltrim( localUtil.ntoc( AV21AlbrUniDis, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV32FlagCli", GXutil.ltrim( localUtil.ntoc( AV32FlagCli, (byte)(1), (byte)(0), ".", "")));
   }

   public void valid_Kilos( )
   {
      if ( isIns( )  )
      {
         AV25AuxKil = A595Kilos ;
      }
      else
      {
         if ( isUpd( )  )
         {
            AV25AuxKil = A595Kilos.subtract(O595Kilos) ;
         }
         else
         {
            if ( isDlt( )  )
            {
               AV25AuxKil = O595Kilos.negate() ;
            }
         }
      }
      if ( ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 ) && true /* After */ && ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "K", "")) == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cantidad de Unidades Pedido superior a Unidades Disponibles", ""), 1, "KILOS");
         AnyError = (short)(1) ;
         GX_FocusControl = edtKilos_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV25AuxKil", GXutil.ltrim( localUtil.ntoc( AV25AuxKil, (byte)(9), (byte)(2), ".", "")));
   }

   public void valid_Metros( )
   {
      if ( isDlt( )  && ( ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
      {
         A60AlbRUniUti = O60AlbRUniUti.subtract(O595Kilos) ;
      }
      else
      {
         if ( isUpd( )  && ! ( ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) && ( ( GXutil.strcmp(O392DisUniMed, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
         {
            A60AlbRUniUti = O60AlbRUniUti.subtract(O595Kilos) ;
         }
         else
         {
            if ( isUpd( )  && ( ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) && ! ( ( GXutil.strcmp(O392DisUniMed, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
            {
               A60AlbRUniUti = O60AlbRUniUti.add(A595Kilos) ;
            }
            else
            {
               if ( ( isIns( )  || isUpd( )  || isDlt( )  ) && ( ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
               {
                  A60AlbRUniUti = O60AlbRUniUti.add(A595Kilos).subtract(O595Kilos) ;
               }
               else
               {
                  if ( isDlt( )  && ( ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
                  {
                     A60AlbRUniUti = O60AlbRUniUti.subtract(O631Metros) ;
                  }
                  else
                  {
                     if ( isUpd( )  && ! ( ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) && ( ( GXutil.strcmp(O392DisUniMed, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
                     {
                        A60AlbRUniUti = O60AlbRUniUti.subtract(O631Metros) ;
                     }
                     else
                     {
                        if ( isUpd( )  && ( ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) && ! ( ( GXutil.strcmp(O392DisUniMed, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
                        {
                           A60AlbRUniUti = O60AlbRUniUti.add(A631Metros) ;
                        }
                        else
                        {
                           if ( ( isIns( )  || isUpd( )  || isDlt( )  ) && ( ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
                           {
                              A60AlbRUniUti = O60AlbRUniUti.add(A631Metros).subtract(O631Metros) ;
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
      if ( isIns( )  )
      {
         AV26AuxMtr = A631Metros ;
      }
      else
      {
         if ( isUpd( )  )
         {
            AV26AuxMtr = A631Metros.subtract(O631Metros) ;
         }
         else
         {
            if ( isDlt( )  )
            {
               AV26AuxMtr = O631Metros.negate() ;
            }
         }
      }
      if ( ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 ) && true /* After */ && ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "M", "")) == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cantidad de Unidades Pedido superior a Unidades Disponibles", ""), 1, "METROS");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMetros_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV26AuxMtr", GXutil.ltrim( localUtil.ntoc( AV26AuxMtr, (byte)(9), (byte)(2), ".", "")));
   }

   public void valid_Piezas( )
   {
      if ( isDlt( )  )
      {
         A54AlbRPieUti = (int)(O54AlbRPieUti-O673Piezas) ;
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            A54AlbRPieUti = (int)(O54AlbRPieUti+A673Piezas-O673Piezas) ;
         }
      }
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      if ( isIns( )  )
      {
         AV24AuxPie = A673Piezas ;
      }
      else
      {
         if ( isUpd( )  )
         {
            AV24AuxPie = (int)(A673Piezas-O673Piezas) ;
         }
         else
         {
            if ( isDlt( )  )
            {
               AV24AuxPie = (int)(-O673Piezas) ;
            }
         }
      }
      if ( ( AV20Albrpiedis < 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "AVISO.Cantidad de Piezas Pedido superior a Piezas Disponibles", ""), 0, "PIEZAS");
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV24AuxPie", GXutil.ltrim( localUtil.ntoc( AV24AuxPie, (byte)(6), (byte)(0), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV9AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV9AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121PZ2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("'DOIMGBSC_ALBRECCOD'","{handler:'e131PZ2',iparms:[{av:'AV16AlbRfeni',fld:'vALBRFENI',pic:''},{av:'A335DisArtCod',fld:'DISARTCOD',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A392DisUniMed',fld:'DISUNIMED',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("'DOIMGBSC_ALBRECCOD'",",oparms:[{av:'AV16AlbRfeni',fld:'vALBRFENI',pic:''},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'}]}");
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      setEventMetadata("VALID_DISCOD","{handler:'valid_Discod',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'AV21AlbrUniDis',fld:'vALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'A392DisUniMed',fld:'DISUNIMED',pic:'@!'},{av:'AV22Kilos',fld:'vKILOS',pic:'ZZZZZ9.99'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'AV23Metros',fld:'vMETROS',pic:'ZZZZZ9.99'},{av:'A369DisFec',fld:'DISFEC',pic:''},{av:'A335DisArtCod',fld:'DISARTCOD',pic:''},{av:'A337DisArtDsc',fld:'DISARTDSC',pic:''},{av:'A595Kilos',fld:'KILOS',pic:'ZZZZZ9.99'},{av:'A631Metros',fld:'METROS',pic:'ZZZZZ9.99'},{av:'AV27DisPieNor',fld:'vDISPIENOR',pic:'ZZZ9'},{av:'AV28DisPieKgm',fld:'vDISPIEKGM',pic:'ZZZZZ9.99'},{av:'AV29DisPieMtr',fld:'vDISPIEMTR',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VALID_DISCOD",",oparms:[{av:'O392DisUniMed'},{av:'A369DisFec',fld:'DISFEC',pic:''},{av:'A392DisUniMed',fld:'DISUNIMED',pic:'@!'},{av:'A335DisArtCod',fld:'DISARTCOD',pic:''},{av:'A337DisArtDsc',fld:'DISARTDSC',pic:''},{av:'AV22Kilos',fld:'vKILOS',pic:'ZZZZZ9.99'},{av:'A595Kilos',fld:'KILOS',pic:'ZZZZZ9.99'},{av:'AV23Metros',fld:'vMETROS',pic:'ZZZZZ9.99'},{av:'A631Metros',fld:'METROS',pic:'ZZZZZ9.99'},{av:'edtMetros_Visible',ctrl:'METROS',prop:'Visible'},{av:'edtMetros_Width',ctrl:'METROS',prop:'Width'},{av:'edtKilos_Width',ctrl:'KILOS',prop:'Width'},{ctrl:'vDISPIEMTR',prop:'Visible'},{ctrl:'vDISPIEKGM',prop:'Visible'},{av:'AV27DisPieNor',fld:'vDISPIENOR',pic:'ZZZ9'},{av:'AV28DisPieKgm',fld:'vDISPIEKGM',pic:'ZZZZZ9.99'},{av:'AV29DisPieMtr',fld:'vDISPIEMTR',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_ALBRECCOD","{handler:'valid_Albreccod',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV19msg7',fld:'vMSG7',pic:''},{av:'A335DisArtCod',fld:'DISARTCOD',pic:''},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'AV18errartref',fld:'vERRARTREF',pic:'9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'cmbAlbRReo'},{av:'A55AlbRReo',fld:'ALBRREO',pic:'@!'},{av:'A4920AlbRGrm2',fld:'ALBRGRM2',pic:'ZZZ9'},{av:'A4921AlbRAnc',fld:'ALBRANC',pic:'ZZZ9'},{av:'A6463AlbRLote',fld:'ALBRLOTE',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'AV21AlbrUniDis',fld:'vALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV20Albrpiedis',fld:'vALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV32FlagCli',fld:'vFLAGCLI',pic:'9'}]");
      setEventMetadata("VALID_ALBRECCOD",",oparms:[{av:'O60AlbRUniUti'},{av:'O54AlbRPieUti'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'cmbAlbRReo'},{av:'A55AlbRReo',fld:'ALBRREO',pic:'@!'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'A4920AlbRGrm2',fld:'ALBRGRM2',pic:'ZZZ9'},{av:'A4921AlbRAnc',fld:'ALBRANC',pic:'ZZZ9'},{av:'A6463AlbRLote',fld:'ALBRLOTE',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'AV20Albrpiedis',fld:'vALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV21AlbrUniDis',fld:'vALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV32FlagCli',fld:'vFLAGCLI',pic:'9'}]}");
      setEventMetadata("VALID_ALBREF","{handler:'valid_Albref',iparms:[]");
      setEventMetadata("VALID_ALBREF",",oparms:[]}");
      setEventMetadata("VALID_ALBRREO","{handler:'valid_Albrreo',iparms:[]");
      setEventMetadata("VALID_ALBRREO",",oparms:[]}");
      setEventMetadata("VALID_ALBRPIEENT","{handler:'valid_Albrpieent',iparms:[]");
      setEventMetadata("VALID_ALBRPIEENT",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNIENT","{handler:'valid_Albrunient',iparms:[]");
      setEventMetadata("VALID_ALBRUNIENT",",oparms:[]}");
      setEventMetadata("VALID_KILOS","{handler:'valid_Kilos',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'O595Kilos'},{av:'A595Kilos',fld:'KILOS',pic:'ZZZZZ9.99'},{av:'AV25AuxKil',fld:'vAUXKIL',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VALID_KILOS",",oparms:[{av:'AV25AuxKil',fld:'vAUXKIL',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("VALID_METROS","{handler:'valid_Metros',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'O631Metros'},{av:'O392DisUniMed'},{av:'O595Kilos'},{av:'O60AlbRUniUti'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A595Kilos',fld:'KILOS',pic:'ZZZZZ9.99'},{av:'A392DisUniMed',fld:'DISUNIMED',pic:'@!'},{av:'A631Metros',fld:'METROS',pic:'ZZZZZ9.99'},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A57AlbRUniDis',fld:'ALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV26AuxMtr',fld:'vAUXMTR',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VALID_METROS",",oparms:[{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A57AlbRUniDis',fld:'ALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV26AuxMtr',fld:'vAUXMTR',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("VALID_PIEZAS","{handler:'valid_Piezas',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'O673Piezas'},{av:'O54AlbRPieUti'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A673Piezas',fld:'PIEZAS',pic:'ZZZZZ9'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'A51AlbRPieDis',fld:'ALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV24AuxPie',fld:'vAUXPIE',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_PIEZAS",",oparms:[{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A51AlbRPieDis',fld:'ALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV24AuxPie',fld:'vAUXPIE',pic:'ZZZZZ9'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
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
      pr_default.close(16);
      pr_default.close(17);
      pr_default.close(18);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV7EmprCod = "" ;
      Z396EmprCod = "" ;
      Z595Kilos = DecimalUtil.ZERO ;
      Z631Metros = DecimalUtil.ZERO ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
      Z56AlbRUni = "" ;
      Z55AlbRReo = "" ;
      Z45AlbRef = "" ;
      Z6463AlbRLote = "" ;
      O631Metros = DecimalUtil.ZERO ;
      O595Kilos = DecimalUtil.ZERO ;
      O60AlbRUniUti = DecimalUtil.ZERO ;
      O392DisUniMed = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      AV21AlbrUniDis = DecimalUtil.ZERO ;
      AV30UsurCod = "" ;
      AV31Station = "" ;
      A55AlbRReo = "" ;
      AV25AuxKil = DecimalUtil.ZERO ;
      AV26AuxMtr = DecimalUtil.ZERO ;
      Gx_mode = "" ;
      AV7EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A56AlbRUni = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tablepedido = new com.genexus.webpanels.GXUserControl();
      lblTbngruia_Jsonclick = "" ;
      A369DisFec = GXutil.nullDate() ;
      A279CliNom = "" ;
      A337DisArtDsc = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      lblTextblockalbreccod_Jsonclick = "" ;
      sStyleString = "" ;
      TempTags = "" ;
      lblImgbsc_albreccod_Jsonclick = "" ;
      A45AlbRef = "" ;
      A6463AlbRLote = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      A595Kilos = DecimalUtil.ZERO ;
      A631Metros = DecimalUtil.ZERO ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV37Pgmname = "" ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A392DisUniMed = "" ;
      AV22Kilos = DecimalUtil.ZERO ;
      AV23Metros = DecimalUtil.ZERO ;
      AV28DisPieKgm = DecimalUtil.ZERO ;
      AV29DisPieMtr = DecimalUtil.ZERO ;
      AV19msg7 = "" ;
      A335DisArtCod = "" ;
      Dvpanel_tablepedido_Objectcall = "" ;
      Dvpanel_tablepedido_Class = "" ;
      Dvpanel_tablepedido_Height = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode35 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV34EmprNom = "" ;
      GXt_char1 = "" ;
      AV10WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV11TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV12WebSession = httpContext.getWebSession();
      AV16AlbRfeni = GXutil.nullDate() ;
      AV17Albrfenff = GXutil.nullDate() ;
      AV14AlbRef = "" ;
      Z369DisFec = GXutil.nullDate() ;
      Z392DisUniMed = "" ;
      Z335DisArtCod = "" ;
      Z337DisArtDsc = "" ;
      Z60AlbRUniUti = DecimalUtil.ZERO ;
      Z279CliNom = "" ;
      T01PZ6_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01PZ6_A392DisUniMed = new String[] {""} ;
      T01PZ6_A335DisArtCod = new String[] {""} ;
      T01PZ6_A337DisArtDsc = new String[] {""} ;
      T01PZ5_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PZ5_A54AlbRPieUti = new int[1] ;
      T01PZ5_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PZ5_A52AlbRPieEnt = new int[1] ;
      T01PZ5_A56AlbRUni = new String[] {""} ;
      T01PZ5_A47AlbREst = new byte[1] ;
      T01PZ5_A55AlbRReo = new String[] {""} ;
      T01PZ5_A45AlbRef = new String[] {""} ;
      T01PZ5_A4920AlbRGrm2 = new short[1] ;
      T01PZ5_A4921AlbRAnc = new short[1] ;
      T01PZ5_A6463AlbRLote = new String[] {""} ;
      T01PZ5_A252CliCod = new int[1] ;
      T01PZ7_A279CliNom = new String[] {""} ;
      T01PZ8_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PZ8_A54AlbRPieUti = new int[1] ;
      T01PZ8_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01PZ8_A392DisUniMed = new String[] {""} ;
      T01PZ8_A279CliNom = new String[] {""} ;
      T01PZ8_A335DisArtCod = new String[] {""} ;
      T01PZ8_A337DisArtDsc = new String[] {""} ;
      T01PZ8_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PZ8_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PZ8_A673Piezas = new int[1] ;
      T01PZ8_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PZ8_A52AlbRPieEnt = new int[1] ;
      T01PZ8_A56AlbRUni = new String[] {""} ;
      T01PZ8_A47AlbREst = new byte[1] ;
      T01PZ8_A55AlbRReo = new String[] {""} ;
      T01PZ8_A45AlbRef = new String[] {""} ;
      T01PZ8_A4920AlbRGrm2 = new short[1] ;
      T01PZ8_A4921AlbRAnc = new short[1] ;
      T01PZ8_A6463AlbRLote = new String[] {""} ;
      T01PZ8_A396EmprCod = new String[] {""} ;
      T01PZ8_A44AlbRecCod = new int[1] ;
      T01PZ8_A361DisCod = new int[1] ;
      T01PZ8_A252CliCod = new int[1] ;
      T01PZ9_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01PZ9_A392DisUniMed = new String[] {""} ;
      T01PZ9_A335DisArtCod = new String[] {""} ;
      T01PZ9_A337DisArtDsc = new String[] {""} ;
      T01PZ10_A279CliNom = new String[] {""} ;
      T01PZ11_A396EmprCod = new String[] {""} ;
      T01PZ11_A361DisCod = new int[1] ;
      T01PZ11_A44AlbRecCod = new int[1] ;
      T01PZ3_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PZ3_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PZ3_A673Piezas = new int[1] ;
      T01PZ3_A396EmprCod = new String[] {""} ;
      T01PZ3_A44AlbRecCod = new int[1] ;
      T01PZ3_A361DisCod = new int[1] ;
      T01PZ12_A396EmprCod = new String[] {""} ;
      T01PZ12_A44AlbRecCod = new int[1] ;
      T01PZ12_A361DisCod = new int[1] ;
      T01PZ13_A396EmprCod = new String[] {""} ;
      T01PZ13_A44AlbRecCod = new int[1] ;
      T01PZ13_A361DisCod = new int[1] ;
      T01PZ2_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PZ2_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PZ2_A673Piezas = new int[1] ;
      T01PZ2_A396EmprCod = new String[] {""} ;
      T01PZ2_A44AlbRecCod = new int[1] ;
      T01PZ2_A361DisCod = new int[1] ;
      T01PZ14_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PZ14_A54AlbRPieUti = new int[1] ;
      T01PZ14_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PZ14_A52AlbRPieEnt = new int[1] ;
      T01PZ14_A56AlbRUni = new String[] {""} ;
      T01PZ14_A47AlbREst = new byte[1] ;
      T01PZ14_A55AlbRReo = new String[] {""} ;
      T01PZ14_A45AlbRef = new String[] {""} ;
      T01PZ14_A4920AlbRGrm2 = new short[1] ;
      T01PZ14_A4921AlbRAnc = new short[1] ;
      T01PZ14_A6463AlbRLote = new String[] {""} ;
      T01PZ14_A252CliCod = new int[1] ;
      T01PZ18_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PZ18_A54AlbRPieUti = new int[1] ;
      T01PZ18_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PZ18_A52AlbRPieEnt = new int[1] ;
      T01PZ18_A56AlbRUni = new String[] {""} ;
      T01PZ18_A47AlbREst = new byte[1] ;
      T01PZ18_A55AlbRReo = new String[] {""} ;
      T01PZ18_A45AlbRef = new String[] {""} ;
      T01PZ18_A4920AlbRGrm2 = new short[1] ;
      T01PZ18_A4921AlbRAnc = new short[1] ;
      T01PZ18_A6463AlbRLote = new String[] {""} ;
      T01PZ18_A252CliCod = new int[1] ;
      T01PZ19_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01PZ19_A392DisUniMed = new String[] {""} ;
      T01PZ19_A335DisArtCod = new String[] {""} ;
      T01PZ19_A337DisArtDsc = new String[] {""} ;
      T01PZ20_A279CliNom = new String[] {""} ;
      T01PZ21_A396EmprCod = new String[] {""} ;
      T01PZ21_A361DisCod = new int[1] ;
      T01PZ21_A44AlbRecCod = new int[1] ;
      T01PZ21_A9756Dis_CUb = new String[] {""} ;
      T01PZ22_A396EmprCod = new String[] {""} ;
      T01PZ22_A361DisCod = new int[1] ;
      T01PZ22_A44AlbRecCod = new int[1] ;
      T01PZ22_A380DisPieCod = new String[] {""} ;
      T01PZ24_A396EmprCod = new String[] {""} ;
      T01PZ24_A361DisCod = new int[1] ;
      T01PZ24_A44AlbRecCod = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int11 = new short[1] ;
      GXt_decimal12 = DecimalUtil.ZERO ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      ZO392DisUniMed = "" ;
      ZV22Kilos = DecimalUtil.ZERO ;
      ZV23Metros = DecimalUtil.ZERO ;
      ZV28DisPieKgm = DecimalUtil.ZERO ;
      ZV29DisPieMtr = DecimalUtil.ZERO ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_char4 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_int9 = new int[1] ;
      GXv_int6 = new byte[1] ;
      ZO60AlbRUniUti = DecimalUtil.ZERO ;
      ZV21AlbrUniDis = DecimalUtil.ZERO ;
      ZV25AuxKil = DecimalUtil.ZERO ;
      Z57AlbRUniDis = DecimalUtil.ZERO ;
      ZV26AuxMtr = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.pedidos.disalb__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.pedidos.disalb__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.pedidos.disalb__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.pedidos.disalb__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.disalb__default(),
         new Object[] {
             new Object[] {
            T01PZ2_A595Kilos, T01PZ2_A631Metros, T01PZ2_A673Piezas, T01PZ2_A396EmprCod, T01PZ2_A44AlbRecCod, T01PZ2_A361DisCod
            }
            , new Object[] {
            T01PZ3_A595Kilos, T01PZ3_A631Metros, T01PZ3_A673Piezas, T01PZ3_A396EmprCod, T01PZ3_A44AlbRecCod, T01PZ3_A361DisCod
            }
            , new Object[] {
            T01PZ4_A60AlbRUniUti, T01PZ4_A54AlbRPieUti, T01PZ4_A58AlbRUniEnt, T01PZ4_A52AlbRPieEnt, T01PZ4_A56AlbRUni, T01PZ4_A47AlbREst, T01PZ4_A55AlbRReo, T01PZ4_A45AlbRef, T01PZ4_A4920AlbRGrm2, T01PZ4_A4921AlbRAnc,
            T01PZ4_A6463AlbRLote, T01PZ4_A252CliCod
            }
            , new Object[] {
            T01PZ5_A60AlbRUniUti, T01PZ5_A54AlbRPieUti, T01PZ5_A58AlbRUniEnt, T01PZ5_A52AlbRPieEnt, T01PZ5_A56AlbRUni, T01PZ5_A47AlbREst, T01PZ5_A55AlbRReo, T01PZ5_A45AlbRef, T01PZ5_A4920AlbRGrm2, T01PZ5_A4921AlbRAnc,
            T01PZ5_A6463AlbRLote, T01PZ5_A252CliCod
            }
            , new Object[] {
            T01PZ6_A369DisFec, T01PZ6_A392DisUniMed, T01PZ6_A335DisArtCod, T01PZ6_A337DisArtDsc
            }
            , new Object[] {
            T01PZ7_A279CliNom
            }
            , new Object[] {
            T01PZ8_A60AlbRUniUti, T01PZ8_A54AlbRPieUti, T01PZ8_A369DisFec, T01PZ8_A392DisUniMed, T01PZ8_A279CliNom, T01PZ8_A335DisArtCod, T01PZ8_A337DisArtDsc, T01PZ8_A595Kilos, T01PZ8_A631Metros, T01PZ8_A673Piezas,
            T01PZ8_A58AlbRUniEnt, T01PZ8_A52AlbRPieEnt, T01PZ8_A56AlbRUni, T01PZ8_A47AlbREst, T01PZ8_A55AlbRReo, T01PZ8_A45AlbRef, T01PZ8_A4920AlbRGrm2, T01PZ8_A4921AlbRAnc, T01PZ8_A6463AlbRLote, T01PZ8_A396EmprCod,
            T01PZ8_A44AlbRecCod, T01PZ8_A361DisCod, T01PZ8_A252CliCod
            }
            , new Object[] {
            T01PZ9_A369DisFec, T01PZ9_A392DisUniMed, T01PZ9_A335DisArtCod, T01PZ9_A337DisArtDsc
            }
            , new Object[] {
            T01PZ10_A279CliNom
            }
            , new Object[] {
            T01PZ11_A396EmprCod, T01PZ11_A361DisCod, T01PZ11_A44AlbRecCod
            }
            , new Object[] {
            T01PZ12_A396EmprCod, T01PZ12_A44AlbRecCod, T01PZ12_A361DisCod
            }
            , new Object[] {
            T01PZ13_A396EmprCod, T01PZ13_A44AlbRecCod, T01PZ13_A361DisCod
            }
            , new Object[] {
            T01PZ14_A60AlbRUniUti, T01PZ14_A54AlbRPieUti, T01PZ14_A58AlbRUniEnt, T01PZ14_A52AlbRPieEnt, T01PZ14_A56AlbRUni, T01PZ14_A47AlbREst, T01PZ14_A55AlbRReo, T01PZ14_A45AlbRef, T01PZ14_A4920AlbRGrm2, T01PZ14_A4921AlbRAnc,
            T01PZ14_A6463AlbRLote, T01PZ14_A252CliCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01PZ18_A60AlbRUniUti, T01PZ18_A54AlbRPieUti, T01PZ18_A58AlbRUniEnt, T01PZ18_A52AlbRPieEnt, T01PZ18_A56AlbRUni, T01PZ18_A47AlbREst, T01PZ18_A55AlbRReo, T01PZ18_A45AlbRef, T01PZ18_A4920AlbRGrm2, T01PZ18_A4921AlbRAnc,
            T01PZ18_A6463AlbRLote, T01PZ18_A252CliCod
            }
            , new Object[] {
            T01PZ19_A369DisFec, T01PZ19_A392DisUniMed, T01PZ19_A335DisArtCod, T01PZ19_A337DisArtDsc
            }
            , new Object[] {
            T01PZ20_A279CliNom
            }
            , new Object[] {
            T01PZ21_A396EmprCod, T01PZ21_A361DisCod, T01PZ21_A44AlbRecCod, T01PZ21_A9756Dis_CUb
            }
            , new Object[] {
            T01PZ22_A396EmprCod, T01PZ22_A361DisCod, T01PZ22_A44AlbRecCod, T01PZ22_A380DisPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            T01PZ24_A396EmprCod, T01PZ24_A361DisCod, T01PZ24_A44AlbRecCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV37Pgmname = "Pedidos.DisAlb" ;
      Z673Piezas = 0 ;
      O673Piezas = 0 ;
      A673Piezas = 0 ;
      i673Piezas = 0 ;
      Z631Metros = DecimalUtil.ZERO ;
      O631Metros = DecimalUtil.ZERO ;
      A631Metros = DecimalUtil.ZERO ;
      Z595Kilos = DecimalUtil.ZERO ;
      O595Kilos = DecimalUtil.ZERO ;
      A595Kilos = DecimalUtil.ZERO ;
   }

   private byte Z47AlbREst ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A47AlbREst ;
   private byte Gx_BScreen ;
   private byte AV32FlagCli ;
   private byte AV18errartref ;
   private byte GXt_int5 ;
   private byte gxajaxcallmode ;
   private byte GXv_int6[] ;
   private byte ZV32FlagCli ;
   private short Z4920AlbRGrm2 ;
   private short Z4921AlbRAnc ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A4920AlbRGrm2 ;
   private short A4921AlbRAnc ;
   private short AV27DisPieNor ;
   private short AV33FlagEmp ;
   private short RcdFound35 ;
   private short nIsDirty_35 ;
   private short GXt_int8 ;
   private short GXv_int11[] ;
   private short ZV27DisPieNor ;
   private int wcpOAV8DisCod ;
   private int wcpOAV9AlbRecCod ;
   private int Z361DisCod ;
   private int Z44AlbRecCod ;
   private int Z673Piezas ;
   private int Z52AlbRPieEnt ;
   private int Z252CliCod ;
   private int O673Piezas ;
   private int O54AlbRPieUti ;
   private int A44AlbRecCod ;
   private int AV20Albrpiedis ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int AV24AuxPie ;
   private int AV8DisCod ;
   private int AV9AlbRecCod ;
   private int trnEnded ;
   private int edtDisCod_Enabled ;
   private int edtDisFec_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtDisArtDsc_Enabled ;
   private int edtAlbRecCod_Enabled ;
   private int edtAlbRef_Enabled ;
   private int edtAlbRLote_Enabled ;
   private int edtAlbRGrm2_Enabled ;
   private int edtAlbRAnc_Enabled ;
   private int A52AlbRPieEnt ;
   private int edtAlbRPieEnt_Enabled ;
   private int edtAlbRUniEnt_Enabled ;
   private int edtAlbRUniDis_Enabled ;
   private int A51AlbRPieDis ;
   private int edtAlbRPieDis_Enabled ;
   private int edtKilos_Enabled ;
   private int edtKilos_Width ;
   private int edtMetros_Visible ;
   private int edtMetros_Enabled ;
   private int edtMetros_Width ;
   private int A673Piezas ;
   private int edtPiezas_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int A54AlbRPieUti ;
   private int AV15CliCod ;
   private int GX_JID ;
   private int Z54AlbRPieUti ;
   private int i673Piezas ;
   private int idxLst ;
   private int GXv_int10[] ;
   private int GXv_int9[] ;
   private int ZO54AlbRPieUti ;
   private int ZV20Albrpiedis ;
   private int Z51AlbRPieDis ;
   private int ZV24AuxPie ;
   private java.math.BigDecimal Z595Kilos ;
   private java.math.BigDecimal Z631Metros ;
   private java.math.BigDecimal Z58AlbRUniEnt ;
   private java.math.BigDecimal O631Metros ;
   private java.math.BigDecimal O595Kilos ;
   private java.math.BigDecimal O60AlbRUniUti ;
   private java.math.BigDecimal AV21AlbrUniDis ;
   private java.math.BigDecimal AV25AuxKil ;
   private java.math.BigDecimal AV26AuxMtr ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal A595Kilos ;
   private java.math.BigDecimal A631Metros ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal AV22Kilos ;
   private java.math.BigDecimal AV23Metros ;
   private java.math.BigDecimal AV28DisPieKgm ;
   private java.math.BigDecimal AV29DisPieMtr ;
   private java.math.BigDecimal Z60AlbRUniUti ;
   private java.math.BigDecimal GXt_decimal12 ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal ZV22Kilos ;
   private java.math.BigDecimal ZV23Metros ;
   private java.math.BigDecimal ZV28DisPieKgm ;
   private java.math.BigDecimal ZV29DisPieMtr ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal ZO60AlbRUniUti ;
   private java.math.BigDecimal ZV21AlbrUniDis ;
   private java.math.BigDecimal ZV25AuxKil ;
   private java.math.BigDecimal Z57AlbRUniDis ;
   private java.math.BigDecimal ZV26AuxMtr ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV7EmprCod ;
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
   private String AV30UsurCod ;
   private String AV31Station ;
   private String A55AlbRReo ;
   private String Gx_mode ;
   private String AV7EmprCod ;
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
   private String divDvpanel_tablepedido_cell_Internalname ;
   private String divDvpanel_tablepedido_cell_Class ;
   private String Dvpanel_tablepedido_Width ;
   private String Dvpanel_tablepedido_Cls ;
   private String Dvpanel_tablepedido_Title ;
   private String Dvpanel_tablepedido_Iconposition ;
   private String Dvpanel_tablepedido_Internalname ;
   private String divTablepedido_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String lblTbngruia_Internalname ;
   private String lblTbngruia_Jsonclick ;
   private String edtDisCod_Internalname ;
   private String edtDisCod_Jsonclick ;
   private String edtDisFec_Internalname ;
   private String edtDisFec_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String edtDisArtDsc_Internalname ;
   private String A337DisArtDsc ;
   private String edtDisArtDsc_Jsonclick ;
   private String Dvpanel_tableattributes_Width ;
   private String Dvpanel_tableattributes_Cls ;
   private String Dvpanel_tableattributes_Title ;
   private String Dvpanel_tableattributes_Iconposition ;
   private String Dvpanel_tableattributes_Internalname ;
   private String divTableattributes_Internalname ;
   private String divTablesplittedalbreccod_Internalname ;
   private String lblTextblockalbreccod_Internalname ;
   private String lblTextblockalbreccod_Jsonclick ;
   private String sStyleString ;
   private String tblTablemergedalbreccod_Internalname ;
   private String TempTags ;
   private String edtAlbRecCod_Jsonclick ;
   private String divTablesearch_albreccod_Internalname ;
   private String lblImgbsc_albreccod_Internalname ;
   private String lblImgbsc_albreccod_Jsonclick ;
   private String edtAlbRef_Internalname ;
   private String A45AlbRef ;
   private String edtAlbRef_Jsonclick ;
   private String edtAlbRLote_Internalname ;
   private String A6463AlbRLote ;
   private String edtAlbRLote_Jsonclick ;
   private String edtAlbRGrm2_Internalname ;
   private String edtAlbRGrm2_Jsonclick ;
   private String edtAlbRAnc_Internalname ;
   private String edtAlbRAnc_Jsonclick ;
   private String edtAlbRPieEnt_Internalname ;
   private String edtAlbRPieEnt_Jsonclick ;
   private String edtAlbRUniEnt_Internalname ;
   private String edtAlbRUniEnt_Jsonclick ;
   private String edtAlbRUniDis_Internalname ;
   private String edtAlbRUniDis_Jsonclick ;
   private String edtAlbRPieDis_Internalname ;
   private String edtAlbRPieDis_Jsonclick ;
   private String edtKilos_Internalname ;
   private String edtKilos_Jsonclick ;
   private String edtMetros_Internalname ;
   private String edtMetros_Jsonclick ;
   private String edtPiezas_Internalname ;
   private String edtPiezas_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV37Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String A392DisUniMed ;
   private String AV19msg7 ;
   private String A335DisArtCod ;
   private String Dvpanel_tablepedido_Objectcall ;
   private String Dvpanel_tablepedido_Class ;
   private String Dvpanel_tablepedido_Height ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode35 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV34EmprNom ;
   private String GXt_char1 ;
   private String AV14AlbRef ;
   private String Z392DisUniMed ;
   private String Z335DisArtCod ;
   private String Z337DisArtDsc ;
   private String Z279CliNom ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String ZO392DisUniMed ;
   private String GXv_char4[] ;
   private java.util.Date A369DisFec ;
   private java.util.Date AV16AlbRfeni ;
   private java.util.Date AV17Albrfenff ;
   private java.util.Date Z369DisFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Dvpanel_tablepedido_Autowidth ;
   private boolean Dvpanel_tablepedido_Autoheight ;
   private boolean Dvpanel_tablepedido_Collapsible ;
   private boolean Dvpanel_tablepedido_Collapsed ;
   private boolean Dvpanel_tablepedido_Showcollapseicon ;
   private boolean Dvpanel_tablepedido_Autoscroll ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Dvpanel_tablepedido_Enabled ;
   private boolean Dvpanel_tablepedido_Showheader ;
   private boolean Dvpanel_tablepedido_Visible ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.WebSession AV12WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tablepedido ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbAlbRReo ;
   private HTMLChoice cmbAlbRUni ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] T01PZ6_A369DisFec ;
   private String[] T01PZ6_A392DisUniMed ;
   private String[] T01PZ6_A335DisArtCod ;
   private String[] T01PZ6_A337DisArtDsc ;
   private java.math.BigDecimal[] T01PZ5_A60AlbRUniUti ;
   private int[] T01PZ5_A54AlbRPieUti ;
   private java.math.BigDecimal[] T01PZ5_A58AlbRUniEnt ;
   private int[] T01PZ5_A52AlbRPieEnt ;
   private String[] T01PZ5_A56AlbRUni ;
   private byte[] T01PZ5_A47AlbREst ;
   private String[] T01PZ5_A55AlbRReo ;
   private String[] T01PZ5_A45AlbRef ;
   private short[] T01PZ5_A4920AlbRGrm2 ;
   private short[] T01PZ5_A4921AlbRAnc ;
   private String[] T01PZ5_A6463AlbRLote ;
   private int[] T01PZ5_A252CliCod ;
   private String[] T01PZ7_A279CliNom ;
   private java.math.BigDecimal[] T01PZ8_A60AlbRUniUti ;
   private int[] T01PZ8_A54AlbRPieUti ;
   private java.util.Date[] T01PZ8_A369DisFec ;
   private String[] T01PZ8_A392DisUniMed ;
   private String[] T01PZ8_A279CliNom ;
   private String[] T01PZ8_A335DisArtCod ;
   private String[] T01PZ8_A337DisArtDsc ;
   private java.math.BigDecimal[] T01PZ8_A595Kilos ;
   private java.math.BigDecimal[] T01PZ8_A631Metros ;
   private int[] T01PZ8_A673Piezas ;
   private java.math.BigDecimal[] T01PZ8_A58AlbRUniEnt ;
   private int[] T01PZ8_A52AlbRPieEnt ;
   private String[] T01PZ8_A56AlbRUni ;
   private byte[] T01PZ8_A47AlbREst ;
   private String[] T01PZ8_A55AlbRReo ;
   private String[] T01PZ8_A45AlbRef ;
   private short[] T01PZ8_A4920AlbRGrm2 ;
   private short[] T01PZ8_A4921AlbRAnc ;
   private String[] T01PZ8_A6463AlbRLote ;
   private String[] T01PZ8_A396EmprCod ;
   private int[] T01PZ8_A44AlbRecCod ;
   private int[] T01PZ8_A361DisCod ;
   private int[] T01PZ8_A252CliCod ;
   private java.util.Date[] T01PZ9_A369DisFec ;
   private String[] T01PZ9_A392DisUniMed ;
   private String[] T01PZ9_A335DisArtCod ;
   private String[] T01PZ9_A337DisArtDsc ;
   private String[] T01PZ10_A279CliNom ;
   private String[] T01PZ11_A396EmprCod ;
   private int[] T01PZ11_A361DisCod ;
   private int[] T01PZ11_A44AlbRecCod ;
   private java.math.BigDecimal[] T01PZ3_A595Kilos ;
   private java.math.BigDecimal[] T01PZ3_A631Metros ;
   private int[] T01PZ3_A673Piezas ;
   private String[] T01PZ3_A396EmprCod ;
   private int[] T01PZ3_A44AlbRecCod ;
   private int[] T01PZ3_A361DisCod ;
   private String[] T01PZ12_A396EmprCod ;
   private int[] T01PZ12_A44AlbRecCod ;
   private int[] T01PZ12_A361DisCod ;
   private String[] T01PZ13_A396EmprCod ;
   private int[] T01PZ13_A44AlbRecCod ;
   private int[] T01PZ13_A361DisCod ;
   private java.math.BigDecimal[] T01PZ2_A595Kilos ;
   private java.math.BigDecimal[] T01PZ2_A631Metros ;
   private int[] T01PZ2_A673Piezas ;
   private String[] T01PZ2_A396EmprCod ;
   private int[] T01PZ2_A44AlbRecCod ;
   private int[] T01PZ2_A361DisCod ;
   private java.math.BigDecimal[] T01PZ14_A60AlbRUniUti ;
   private int[] T01PZ14_A54AlbRPieUti ;
   private java.math.BigDecimal[] T01PZ14_A58AlbRUniEnt ;
   private int[] T01PZ14_A52AlbRPieEnt ;
   private String[] T01PZ14_A56AlbRUni ;
   private byte[] T01PZ14_A47AlbREst ;
   private String[] T01PZ14_A55AlbRReo ;
   private String[] T01PZ14_A45AlbRef ;
   private short[] T01PZ14_A4920AlbRGrm2 ;
   private short[] T01PZ14_A4921AlbRAnc ;
   private String[] T01PZ14_A6463AlbRLote ;
   private int[] T01PZ14_A252CliCod ;
   private java.math.BigDecimal[] T01PZ18_A60AlbRUniUti ;
   private int[] T01PZ18_A54AlbRPieUti ;
   private java.math.BigDecimal[] T01PZ18_A58AlbRUniEnt ;
   private int[] T01PZ18_A52AlbRPieEnt ;
   private String[] T01PZ18_A56AlbRUni ;
   private byte[] T01PZ18_A47AlbREst ;
   private String[] T01PZ18_A55AlbRReo ;
   private String[] T01PZ18_A45AlbRef ;
   private short[] T01PZ18_A4920AlbRGrm2 ;
   private short[] T01PZ18_A4921AlbRAnc ;
   private String[] T01PZ18_A6463AlbRLote ;
   private int[] T01PZ18_A252CliCod ;
   private java.util.Date[] T01PZ19_A369DisFec ;
   private String[] T01PZ19_A392DisUniMed ;
   private String[] T01PZ19_A335DisArtCod ;
   private String[] T01PZ19_A337DisArtDsc ;
   private String[] T01PZ20_A279CliNom ;
   private String[] T01PZ21_A396EmprCod ;
   private int[] T01PZ21_A361DisCod ;
   private int[] T01PZ21_A44AlbRecCod ;
   private String[] T01PZ21_A9756Dis_CUb ;
   private String[] T01PZ22_A396EmprCod ;
   private int[] T01PZ22_A361DisCod ;
   private int[] T01PZ22_A44AlbRecCod ;
   private String[] T01PZ22_A380DisPieCod ;
   private String[] T01PZ24_A396EmprCod ;
   private int[] T01PZ24_A361DisCod ;
   private int[] T01PZ24_A44AlbRecCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private java.math.BigDecimal[] T01PZ4_A60AlbRUniUti ;
   private int[] T01PZ4_A54AlbRPieUti ;
   private java.math.BigDecimal[] T01PZ4_A58AlbRUniEnt ;
   private int[] T01PZ4_A52AlbRPieEnt ;
   private String[] T01PZ4_A56AlbRUni ;
   private byte[] T01PZ4_A47AlbREst ;
   private String[] T01PZ4_A55AlbRReo ;
   private String[] T01PZ4_A45AlbRef ;
   private short[] T01PZ4_A4920AlbRGrm2 ;
   private short[] T01PZ4_A4921AlbRAnc ;
   private String[] T01PZ4_A6463AlbRLote ;
   private int[] T01PZ4_A252CliCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV11TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV10WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class disalb__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class disalb__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class disalb__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class disalb__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class disalb__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01PZ2", "SELECT Kilos, Metros, Piezas, EmprCod, AlbRecCod, DisCod FROM TXPDISALB WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?  FOR UPDATE OF Kilos, Metros, Piezas NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PZ3", "SELECT Kilos, Metros, Piezas, EmprCod, AlbRecCod, DisCod FROM TXPDISALB WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PZ4", "SELECT AlbRUniUti, AlbRPieUti, AlbRUniEnt, AlbRPieEnt, AlbRUni, AlbREst, AlbRReo, AlbRef, AlbRGrm2, AlbRAnc, AlbRLote, CliCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ?  FOR UPDATE OF AlbRUniUti, AlbRPieUti NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PZ5", "SELECT AlbRUniUti, AlbRPieUti, AlbRUniEnt, AlbRPieEnt, AlbRUni, AlbREst, AlbRReo, AlbRef, AlbRGrm2, AlbRAnc, AlbRLote, CliCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PZ6", "SELECT DisFec, DisUniMed, DisArtCod, DisArtDsc FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PZ7", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PZ8", "SELECT /*+ FIRST_ROWS(100) */ T3.AlbRUniUti, T3.AlbRPieUti, T2.DisFec, T2.DisUniMed, T4.CliNom, T2.DisArtCod, T2.DisArtDsc, TM1.Kilos, TM1.Metros, TM1.Piezas, T3.AlbRUniEnt, T3.AlbRPieEnt, T3.AlbRUni, T3.AlbREst, T3.AlbRReo, T3.AlbRef, T3.AlbRGrm2, T3.AlbRAnc, T3.AlbRLote, TM1.EmprCod, TM1.AlbRecCod, TM1.DisCod, T3.CliCod FROM (((TXPDISALB TM1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = TM1.EmprCod AND T2.DisCod = TM1.DisCod) INNER JOIN TXPALBREC T3 ON T3.EmprCod = TM1.EmprCod AND T3.AlbRecCod = TM1.AlbRecCod) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = T3.CliCod) WHERE TM1.EmprCod = ? and TM1.AlbRecCod = ? and TM1.DisCod = ? ORDER BY TM1.EmprCod, TM1.DisCod, TM1.AlbRecCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PZ9", "SELECT DisFec, DisUniMed, DisArtCod, DisArtDsc FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PZ10", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PZ11", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PZ12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbRecCod, DisCod FROM TXPDISALB WHERE ( AlbRecCod > ? or AlbRecCod = ? and DisCod > ?) and EmprCod = ? ORDER BY EmprCod, DisCod, AlbRecCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PZ13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbRecCod, DisCod FROM TXPDISALB WHERE ( AlbRecCod < ? or AlbRecCod = ? and DisCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, DisCod DESC, AlbRecCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PZ14", "SELECT AlbRUniUti, AlbRPieUti, AlbRUniEnt, AlbRPieEnt, AlbRUni, AlbREst, AlbRReo, AlbRef, AlbRGrm2, AlbRAnc, AlbRLote, CliCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ?  FOR UPDATE OF AlbRUniUti, AlbRPieUti NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01PZ15", "INSERT INTO TXPDISALB(Kilos, Metros, Piezas, EmprCod, AlbRecCod, DisCod, KilosUti, MetrosUti, PiezasUti) VALUES(?, ?, ?, ?, ?, ?, 0, 0, 0)", GX_NOMASK, "TXPDISALB")
         ,new UpdateCursor("T01PZ16", "UPDATE TXPDISALB SET Kilos=?, Metros=?, Piezas=?  WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPDISALB")
         ,new UpdateCursor("T01PZ17", "DELETE FROM TXPDISALB  WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPDISALB")
         ,new ForEachCursor("T01PZ18", "SELECT AlbRUniUti, AlbRPieUti, AlbRUniEnt, AlbRPieEnt, AlbRUni, AlbREst, AlbRReo, AlbRef, AlbRGrm2, AlbRAnc, AlbRLote, CliCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PZ19", "SELECT DisFec, DisUniMed, DisArtCod, DisArtDsc FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PZ20", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PZ21", "SELECT * FROM (SELECT EmprCod, DisCod, AlbRecCod, Dis_CUb FROM TXPUBIOUT WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PZ22", "SELECT * FROM (SELECT EmprCod, DisCod, AlbRecCod, DisPieCod FROM TXPDISALD WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01PZ23", "UPDATE TXPALBREC SET AlbRUniUti=?, AlbRPieUti=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPALBREC")
         ,new ForEachCursor("T01PZ24", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? ORDER BY EmprCod, DisCod, AlbRecCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
            case 17 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 11 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 3);
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
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

