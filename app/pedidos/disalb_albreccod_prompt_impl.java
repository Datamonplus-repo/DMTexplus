package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class disalb_albreccod_prompt_impl extends GXDataArea
{
   public disalb_albreccod_prompt_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public disalb_albreccod_prompt_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( disalb_albreccod_prompt_impl.class ));
   }

   public disalb_albreccod_prompt_impl( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbAlbRReo = new HTMLChoice();
      cmbAlbRUni = new HTMLChoice();
      cmbavEstado = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetFirstPar( "Nrecep") ;
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxEvt") == 0 )
         {
            httpContext.setAjaxEventMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "Nrecep") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "Nrecep") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid") == 0 )
         {
            gxnrgrid_newrow_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Grid") == 0 )
         {
            gxgrgrid_refresh_invoke( ) ;
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
            AV69Nrecep = (int)(GXutil.lval( gxfirstwebparm)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69Nrecep", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69Nrecep), 8, 0));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV70Nrefer = httpContext.GetPar( "Nrefer") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV70Nrefer", AV70Nrefer);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNREFER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV70Nrefer, ""))));
               AV68Nentre = httpContext.GetPar( "Nentre") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV68Nentre", AV68Nentre);
               AV106Unid = httpContext.GetPar( "Unid") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV106Unid", AV106Unid);
               AV22CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV22CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22CliCod), 6, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV22CliCod), "ZZZZZ9")));
               AV73Opreo = httpContext.GetPar( "Opreo") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV73Opreo", AV73Opreo);
               AV39InEmprCod = httpContext.GetPar( "InEmprCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV39InEmprCod", AV39InEmprCod);
               AV12AlbREst = httpContext.GetPar( "AlbREst") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12AlbREst", AV12AlbREst);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBREST", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12AlbREst, ""))));
               AV101TipEnt = (short)(GXutil.lval( httpContext.GetPar( "TipEnt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV101TipEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV101TipEnt), 4, 0));
               AV15AlbRLoc = httpContext.GetPar( "AlbRLoc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15AlbRLoc", AV15AlbRLoc);
               AV7AlbRDisCli = httpContext.GetPar( "AlbRDisCli") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7AlbRDisCli", AV7AlbRDisCli);
               AV14AlbRfeni = localUtil.parseDateParm( httpContext.GetPar( "AlbRfeni")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14AlbRfeni", localUtil.format(AV14AlbRfeni, "99/99/99"));
               AV13Albrfenf = localUtil.parseDateParm( httpContext.GetPar( "Albrfenf")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13Albrfenf", localUtil.format(AV13Albrfenf, "99/99/99"));
               AV11Albrent2i = httpContext.GetPar( "Albrent2i") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11Albrent2i", AV11Albrent2i);
               AV8Albreccod = (int)(GXutil.lval( httpContext.GetPar( "Albreccod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8Albreccod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Albreccod), 8, 0));
            }
         }
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
      }
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgrid_newrow_invoke( )
   {
      nRC_GXsfl_41 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_41"))) ;
      nGXsfl_41_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_41_idx"))) ;
      sGXsfl_41_idx = httpContext.GetPar( "sGXsfl_41_idx") ;
      edtAlbRecCod_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Title", edtAlbRecCod_Title, !bGXsfl_41_Refreshing);
      edtCliCod_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Title", edtCliCod_Title, !bGXsfl_41_Refreshing);
      edtAlbRef_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Title", edtAlbRef_Title, !bGXsfl_41_Refreshing);
      edtAlbRFen_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRFen_Internalname, "Title", edtAlbRFen_Title, !bGXsfl_41_Refreshing);
      edtAlbRLoc_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRLoc_Internalname, "Title", edtAlbRLoc_Title, !bGXsfl_41_Refreshing);
      edtAlbRTartD_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRTartD_Internalname, "Title", edtAlbRTartD_Title, !bGXsfl_41_Refreshing);
      edtAlbRLote_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRLote_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLote_Visible), 5, 0), !bGXsfl_41_Refreshing);
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid_newrow( ) ;
      /* End function gxnrGrid_newrow_invoke */
   }

   public void gxgrgrid_refresh_invoke( )
   {
      subGrid_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid_Rows"))) ;
      AV9AlbRef = httpContext.GetPar( "AlbRef") ;
      AV23Clicodd = (int)(GXutil.lval( httpContext.GetPar( "Clicodd"))) ;
      AV39InEmprCod = httpContext.GetPar( "InEmprCod") ;
      edtAlbRecCod_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Title", edtAlbRecCod_Title, !bGXsfl_41_Refreshing);
      edtCliCod_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Title", edtCliCod_Title, !bGXsfl_41_Refreshing);
      edtAlbRef_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Title", edtAlbRef_Title, !bGXsfl_41_Refreshing);
      edtAlbRFen_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRFen_Internalname, "Title", edtAlbRFen_Title, !bGXsfl_41_Refreshing);
      edtAlbRLoc_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRLoc_Internalname, "Title", edtAlbRLoc_Title, !bGXsfl_41_Refreshing);
      edtAlbRTartD_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRTartD_Internalname, "Title", edtAlbRTartD_Title, !bGXsfl_41_Refreshing);
      edtAlbRLote_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRLote_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLote_Visible), 5, 0), !bGXsfl_41_Refreshing);
      AV102Tot_Pd = (int)(GXutil.lval( httpContext.GetPar( "Tot_Pd"))) ;
      AV16AlbRPieDis = (int)(GXutil.lval( httpContext.GetPar( "AlbRPieDis"))) ;
      AV103Tot_Pe = (int)(GXutil.lval( httpContext.GetPar( "Tot_Pe"))) ;
      AV104Tot_Ud = CommonUtil.decimalVal( httpContext.GetPar( "Tot_Ud"), ".") ;
      AV17AlbRUniDis = CommonUtil.decimalVal( httpContext.GetPar( "AlbRUniDis"), ".") ;
      AV105Tot_Ue = CommonUtil.decimalVal( httpContext.GetPar( "Tot_Ue"), ".") ;
      A1299AlbRLin = (byte)(GXutil.lval( httpContext.GetPar( "AlbRLin"))) ;
      A1300AlbRObs = httpContext.GetPar( "AlbRObs") ;
      cmbavEstado.fromJSonString( httpContext.GetNextPar( ));
      AV31Estado = (byte)(GXutil.lval( httpContext.GetPar( "Estado"))) ;
      AV71Num_r = (int)(GXutil.lval( httpContext.GetPar( "Num_r"))) ;
      AV70Nrefer = httpContext.GetPar( "Nrefer") ;
      AV12AlbREst = httpContext.GetPar( "AlbREst") ;
      AV22CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV9AlbRef, AV23Clicodd, AV39InEmprCod, AV102Tot_Pd, AV16AlbRPieDis, AV103Tot_Pe, AV104Tot_Ud, AV17AlbRUniDis, AV105Tot_Ue, A1299AlbRLin, A1300AlbRObs, AV31Estado, AV71Num_r, AV70Nrefer, AV12AlbREst, AV22CliCod) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         MasterPageObj= createMasterPage(remoteHandle, "app.wwpbaseobjects.workwithplusmasterpageprompt");
         MasterPageObj.setDataArea(this,true);
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

   public byte executeStartEvent( )
   {
      pa1XU2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1XU2( ) ;
      }
      return gxajaxcallmode ;
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
      if ( nGXWrapped != 1 )
      {
         MasterPageObj.master_styles();
      }
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
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"false\"" ;
      httpContext.writeText( "<body ") ;
      bodyStyle = "" + "background-color:" + WebUtils.getHTMLColor( Form.getIBackground()) + ";color:" + WebUtils.getHTMLColor( Form.getTextcolor()) + ";" ;
      if ( nGXWrapped == 0 )
      {
         bodyStyle += "-moz-opacity:0;opacity:0;" ;
      }
      if ( ! ( (GXutil.strcmp("", Form.getBackground())==0) ) )
      {
         bodyStyle += " background-image:url(" + httpContext.convertURL( Form.getBackground()) + ")" ;
      }
      httpContext.writeText( " "+"class=\"form-horizontal FormNoBackgroundColor\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal FormNoBackgroundColor\" data-gx-class=\"form-horizontal FormNoBackgroundColor\" novalidate action=\""+formatLink("app.pedidos.disalb_albreccod_prompt", new String[] {GXutil.URLEncode(GXutil.ltrimstr(AV69Nrecep,8,0)),GXutil.URLEncode(GXutil.rtrim(AV70Nrefer)),GXutil.URLEncode(GXutil.rtrim(AV68Nentre)),GXutil.URLEncode(GXutil.rtrim(AV106Unid)),GXutil.URLEncode(GXutil.ltrimstr(AV22CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV73Opreo)),GXutil.URLEncode(GXutil.rtrim(AV39InEmprCod)),GXutil.URLEncode(GXutil.rtrim(AV12AlbREst)),GXutil.URLEncode(GXutil.ltrimstr(AV101TipEnt,4,0)),GXutil.URLEncode(GXutil.rtrim(AV15AlbRLoc)),GXutil.URLEncode(GXutil.rtrim(AV7AlbRDisCli)),GXutil.URLEncode(GXutil.formatDateParm(AV14AlbRfeni)),GXutil.URLEncode(GXutil.formatDateParm(AV13Albrfenf)),GXutil.URLEncode(GXutil.rtrim(AV11Albrent2i)),GXutil.URLEncode(GXutil.ltrimstr(AV8Albreccod,8,0))}, new String[] {"Nrecep","Nrefer","Nentre","Unid","CliCod","Opreo","InEmprCod","AlbREst","TipEnt","AlbRLoc","AlbRDisCli","AlbRfeni","Albrfenf","Albrent2i","Albreccod"}) +"\">") ;
      app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "form-horizontal FormNoBackgroundColor", true);
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
   }

   public void send_integrity_footer_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOT_PD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV102Tot_Pd), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBRPIEDIS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV16AlbRPieDis), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOT_PE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV103Tot_Pe), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOT_UD", getSecureSignedToken( "", localUtil.format( AV104Tot_Ud, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBRUNIDIS", getSecureSignedToken( "", localUtil.format( AV17AlbRUniDis, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOT_UE", getSecureSignedToken( "", localUtil.format( AV105Tot_Ue, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNUM_R", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV71Num_r), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNREFER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV70Nrefer, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV22CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBREST", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12AlbREst, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vALBREF", GXutil.rtrim( AV9AlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vCLICODD", GXutil.ltrim( localUtil.ntoc( AV23Clicodd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_41", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_41, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV34GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV35GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV27DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV27DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV74OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV75OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vTOT_PD", GXutil.ltrim( localUtil.ntoc( AV102Tot_Pd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOT_PD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV102Tot_Pd), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRPIEDIS", GXutil.ltrim( localUtil.ntoc( AV16AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBRPIEDIS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV16AlbRPieDis), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOT_PE", GXutil.ltrim( localUtil.ntoc( AV103Tot_Pe, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOT_PE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV103Tot_Pe), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOT_UD", GXutil.ltrim( localUtil.ntoc( AV104Tot_Ud, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOT_UD", getSecureSignedToken( "", localUtil.format( AV104Tot_Ud, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRUNIDIS", GXutil.ltrim( localUtil.ntoc( AV17AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBRUNIDIS", getSecureSignedToken( "", localUtil.format( AV17AlbRUniDis, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOT_UE", GXutil.ltrim( localUtil.ntoc( AV105Tot_Ue, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOT_UE", getSecureSignedToken( "", localUtil.format( AV105Tot_Ue, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRLIN", GXutil.ltrim( localUtil.ntoc( A1299AlbRLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBROBS", GXutil.rtrim( A1300AlbRObs));
      app.GxWebStd.gx_hidden_field( httpContext, "vNUM_R", GXutil.ltrim( localUtil.ntoc( AV71Num_r, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNUM_R", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV71Num_r), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRECEP", GXutil.ltrim( localUtil.ntoc( AV69Nrecep, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNREFER", GXutil.rtrim( AV70Nrefer));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNREFER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV70Nrefer, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vNENTRE", GXutil.rtrim( AV68Nentre));
      app.GxWebStd.gx_hidden_field( httpContext, "vUNID", GXutil.rtrim( AV106Unid));
      app.GxWebStd.gx_hidden_field( httpContext, "vOPREO", GXutil.rtrim( AV73Opreo));
      app.GxWebStd.gx_hidden_field( httpContext, "vINEMPRCOD", GXutil.rtrim( AV39InEmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBREST", GXutil.rtrim( AV12AlbREst));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBREST", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12AlbREst, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPENT", GXutil.ltrim( localUtil.ntoc( AV101TipEnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRLOC", GXutil.rtrim( AV15AlbRLoc));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRDISCLI", GXutil.rtrim( AV7AlbRDisCli));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRFENI", localUtil.dtoc( AV14AlbRfeni, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRFENF", localUtil.dtoc( AV13Albrfenf, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRENT2I", GXutil.rtrim( AV11Albrent2i));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRECCOD", GXutil.ltrim( localUtil.ntoc( AV8Albreccod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRPIEUTI", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRUNIUTI", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Class", GXutil.rtrim( Gridpaginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Showfirst", GXutil.booltostr( Gridpaginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Showprevious", GXutil.booltostr( Gridpaginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Shownext", GXutil.booltostr( Gridpaginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Showlast", GXutil.booltostr( Gridpaginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Gridpaginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Gridpaginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Emptygridclass", GXutil.rtrim( Gridpaginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Gridpaginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Gridpaginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Previous", GXutil.rtrim( Gridpaginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Next", GXutil.rtrim( Gridpaginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Caption", GXutil.rtrim( Gridpaginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Gridpaginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Gridpaginationbar_Rowsperpagecaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECCOD_Title", GXutil.rtrim( edtAlbRecCod_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD_Title", GXutil.rtrim( edtCliCod_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBREF_Title", GXutil.rtrim( edtAlbRef_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRFEN_Title", GXutil.rtrim( edtAlbRFen_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRLOC_Title", GXutil.rtrim( edtAlbRLoc_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRTARTD_Title", GXutil.rtrim( edtAlbRTartD_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRLOTE_Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRLote_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
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

   public void renderHtmlContent( )
   {
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         httpContext.writeText( "<div") ;
         app.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal FormNoBackgroundColor" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         we1XU2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1XU2( ) ;
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
      return formatLink("app.pedidos.disalb_albreccod_prompt", new String[] {GXutil.URLEncode(GXutil.ltrimstr(AV69Nrecep,8,0)),GXutil.URLEncode(GXutil.rtrim(AV70Nrefer)),GXutil.URLEncode(GXutil.rtrim(AV68Nentre)),GXutil.URLEncode(GXutil.rtrim(AV106Unid)),GXutil.URLEncode(GXutil.ltrimstr(AV22CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV73Opreo)),GXutil.URLEncode(GXutil.rtrim(AV39InEmprCod)),GXutil.URLEncode(GXutil.rtrim(AV12AlbREst)),GXutil.URLEncode(GXutil.ltrimstr(AV101TipEnt,4,0)),GXutil.URLEncode(GXutil.rtrim(AV15AlbRLoc)),GXutil.URLEncode(GXutil.rtrim(AV7AlbRDisCli)),GXutil.URLEncode(GXutil.formatDateParm(AV14AlbRfeni)),GXutil.URLEncode(GXutil.formatDateParm(AV13Albrfenf)),GXutil.URLEncode(GXutil.rtrim(AV11Albrent2i)),GXutil.URLEncode(GXutil.ltrimstr(AV8Albreccod,8,0))}, new String[] {"Nrecep","Nrefer","Nentre","Unid","CliCod","Opreo","InEmprCod","AlbREst","TipEnt","AlbRLoc","AlbRDisCli","AlbRfeni","Albrfenf","Albrent2i","Albreccod"})  ;
   }

   public String getPgmname( )
   {
      return "Pedidos.DisAlb_AlbRecCod_Prompt" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Selecciona Almacen Tejido", "") ;
   }

   public void wb1XU0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         if ( nGXWrapped == 1 )
         {
            renderHtmlHeaders( ) ;
            renderHtmlOpenForm( ) ;
         }
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), "", "", "", "false");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", 0, "px", "TableMainPrompt", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 hidden-xs", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLit30_Internalname, httpContext.getMessage( "Lit30", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'" + sGXsfl_41_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLit30_Internalname, GXutil.rtrim( AV63Lit30), GXutil.rtrim( localUtil.format( AV63Lit30, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,17);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLit30_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLit30_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisAlb_AlbRecCod_Prompt.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbref_Internalname, httpContext.getMessage( "Referencia", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'" + sGXsfl_41_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbref_Internalname, GXutil.rtrim( AV9AlbRef), GXutil.rtrim( localUtil.format( AV9AlbRef, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbref_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbref_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisAlb_AlbRecCod_Prompt.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLit90_Internalname, httpContext.getMessage( "Lit90", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'" + sGXsfl_41_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLit90_Internalname, GXutil.rtrim( AV65Lit90), GXutil.rtrim( localUtil.format( AV65Lit90, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,23);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLit90_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLit90_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisAlb_AlbRecCod_Prompt.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicodd_Internalname, httpContext.getMessage( "Clicodd", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_41_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicodd_Internalname, GXutil.ltrim( localUtil.ntoc( AV23Clicodd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicodd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV23Clicodd), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV23Clicodd), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicodd_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicodd_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb_AlbRecCod_Prompt.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicod_Internalname, httpContext.getMessage( "Cli Cod", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV22CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV22CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV22CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb_AlbRecCod_Prompt.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLit31_Internalname, httpContext.getMessage( "Lit31", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'',false,'" + sGXsfl_41_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLit31_Internalname, GXutil.rtrim( AV64Lit31), GXutil.rtrim( localUtil.format( AV64Lit31, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLit31_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLit31_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisAlb_AlbRecCod_Prompt.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavProcenom_Internalname, httpContext.getMessage( "Nombre de la Procedencia", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'" + sGXsfl_41_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavProcenom_Internalname, GXutil.rtrim( AV5ProceNom), GXutil.rtrim( localUtil.format( AV5ProceNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavProcenom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavProcenom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisAlb_AlbRecCod_Prompt.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell CellMarginPrompt HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol41( ) ;
      }
      if ( wbEnd == 41 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_41 = (int)(nGXsfl_41_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Grid", GridContainer, subGrid_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData", GridContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData"+"V", GridContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGridpaginationbar.setProperty("Class", Gridpaginationbar_Class);
         ucGridpaginationbar.setProperty("ShowFirst", Gridpaginationbar_Showfirst);
         ucGridpaginationbar.setProperty("ShowPrevious", Gridpaginationbar_Showprevious);
         ucGridpaginationbar.setProperty("ShowNext", Gridpaginationbar_Shownext);
         ucGridpaginationbar.setProperty("ShowLast", Gridpaginationbar_Showlast);
         ucGridpaginationbar.setProperty("PagesToShow", Gridpaginationbar_Pagestoshow);
         ucGridpaginationbar.setProperty("PagingButtonsPosition", Gridpaginationbar_Pagingbuttonsposition);
         ucGridpaginationbar.setProperty("PagingCaptionPosition", Gridpaginationbar_Pagingcaptionposition);
         ucGridpaginationbar.setProperty("EmptyGridClass", Gridpaginationbar_Emptygridclass);
         ucGridpaginationbar.setProperty("RowsPerPageSelector", Gridpaginationbar_Rowsperpageselector);
         ucGridpaginationbar.setProperty("RowsPerPageOptions", Gridpaginationbar_Rowsperpageoptions);
         ucGridpaginationbar.setProperty("Previous", Gridpaginationbar_Previous);
         ucGridpaginationbar.setProperty("Next", Gridpaginationbar_Next);
         ucGridpaginationbar.setProperty("Caption", Gridpaginationbar_Caption);
         ucGridpaginationbar.setProperty("EmptyGridCaption", Gridpaginationbar_Emptygridcaption);
         ucGridpaginationbar.setProperty("RowsPerPageCaption", Gridpaginationbar_Rowsperpagecaption);
         ucGridpaginationbar.setProperty("CurrentPage", AV34GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV35GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, "GRIDPAGINATIONBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV126Pgmname), GXutil.rtrim( localUtil.format( AV126Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisAlb_AlbRecCod_Prompt.htm");
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
         /* User Defined Control */
         ucDdo_grid.setProperty("Caption", Ddo_grid_Caption);
         ucDdo_grid.setProperty("ColumnIds", Ddo_grid_Columnids);
         ucDdo_grid.setProperty("ColumnsSortValues", Ddo_grid_Columnssortvalues);
         ucDdo_grid.setProperty("IncludeSortASC", Ddo_grid_Includesortasc);
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV27DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'" + sGXsfl_41_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavEstado, cmbavEstado.getInternalname(), GXutil.trim( GXutil.str( AV31Estado, 1, 0)), 1, cmbavEstado.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", cmbavEstado.getVisible(), 1, 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,70);\"", "", true, (byte)(0), "HLP_Pedidos\\DisAlb_AlbRecCod_Prompt.htm");
         cmbavEstado.setValue( GXutil.trim( GXutil.str( AV31Estado, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavEstado.getInternalname(), "Values", cmbavEstado.ToJavascriptSource(), true);
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 41 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( GridContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Grid", GridContainer, subGrid_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData", GridContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData"+"V", GridContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start1XU2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         if ( httpContext.exposeMetadata( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 17_0_11-163677", (short)(0)) ;
         }
         Form.getMeta().addItem("description", httpContext.getMessage( "Selecciona Almacen Tejido", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1XU0( ) ;
   }

   public void ws1XU2( )
   {
      start1XU2( ) ;
      evt1XU2( ) ;
   }

   public void evt1XU2( )
   {
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
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
                        if ( GXutil.strcmp(sEvt, "RFR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e111XU2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121XU2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131XU2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) )
                        {
                           nGXsfl_41_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_412( ) ;
                           AV78Select = httpContext.cgiGet( edtavSelect_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavSelect_Internalname, AV78Select);
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A3359AlbRDisCli = httpContext.cgiGet( edtAlbRDisCli_Internalname) ;
                           cmbAlbRReo.setName( cmbAlbRReo.getInternalname() );
                           cmbAlbRReo.setValue( httpContext.cgiGet( cmbAlbRReo.getInternalname()) );
                           A55AlbRReo = httpContext.cgiGet( cmbAlbRReo.getInternalname()) ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A45AlbRef = httpContext.cgiGet( edtAlbRef_Internalname) ;
                           A3613AlbRefDsc = httpContext.cgiGet( edtAlbRefDsc_Internalname) ;
                           A6264AlbRTartD = httpContext.cgiGet( edtAlbRTartD_Internalname) ;
                           n6264AlbRTartD = false ;
                           A49AlbRFen = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtAlbRFen_Internalname), 0)) ;
                           A6463AlbRLote = httpContext.cgiGet( edtAlbRLote_Internalname) ;
                           A50AlbRLoc = httpContext.cgiGet( edtAlbRLoc_Internalname) ;
                           A52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( edtAlbRUniEnt_Internalname)) ;
                           cmbAlbRUni.setName( cmbAlbRUni.getInternalname() );
                           cmbAlbRUni.setValue( httpContext.cgiGet( cmbAlbRUni.getInternalname()) );
                           A56AlbRUni = httpContext.cgiGet( cmbAlbRUni.getInternalname()) ;
                           A51AlbRPieDis = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieDis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A57AlbRUniDis = localUtil.ctond( httpContext.cgiGet( edtAlbRUniDis_Internalname)) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e141XU2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e151XU2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e161XU2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Albref Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vALBREF"), AV9AlbRef) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Clicodd Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLICODD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV23Clicodd )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e171XU2 ();
                                    }
                                    dynload_actions( ) ;
                                 }
                                 /* No code required for Cancel button. It is implemented as the Reset button. */
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
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
   }

   public void we1XU2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            if ( nGXWrapped == 1 )
            {
               renderHtmlCloseForm( ) ;
            }
         }
      }
   }

   public void pa1XU2( )
   {
      if ( nDonePA == 0 )
      {
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
         if ( ! httpContext.isAjaxRequest( ) )
         {
            GX_FocusControl = edtavLit30_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_412( ) ;
      while ( nGXsfl_41_idx <= nRC_GXsfl_41 )
      {
         sendrow_412( ) ;
         nGXsfl_41_idx = ((subGrid_Islastpage==1)&&(nGXsfl_41_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_41_idx+1) ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV9AlbRef ,
                                 int AV23Clicodd ,
                                 String AV39InEmprCod ,
                                 int AV102Tot_Pd ,
                                 int AV16AlbRPieDis ,
                                 int AV103Tot_Pe ,
                                 java.math.BigDecimal AV104Tot_Ud ,
                                 java.math.BigDecimal AV17AlbRUniDis ,
                                 java.math.BigDecimal AV105Tot_Ue ,
                                 byte A1299AlbRLin ,
                                 String A1300AlbRObs ,
                                 byte AV31Estado ,
                                 int AV71Num_r ,
                                 String AV70Nrefer ,
                                 String AV12AlbREst ,
                                 int AV22CliCod )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e151XU2 ();
      GRID_nCurrentRecord = 0 ;
      rf1XU2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBRECCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECCOD", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
   }

   public void clear_multi_value_controls( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         dynload_actions( ) ;
         before_start_formulas( ) ;
      }
   }

   public void fix_multi_value_controls( )
   {
      if ( cmbavEstado.getItemCount() > 0 )
      {
         AV31Estado = (byte)(GXutil.lval( cmbavEstado.getValidValue(GXutil.trim( GXutil.str( AV31Estado, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31Estado", GXutil.str( AV31Estado, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavEstado.setValue( GXutil.trim( GXutil.str( AV31Estado, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavEstado.getInternalname(), "Values", cmbavEstado.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1XU2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV126Pgmname = "Pedidos.DisAlb_AlbRecCod_Prompt" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV126Pgmname", AV126Pgmname);
      Gx_err = (short)(0) ;
      edtavLit30_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLit30_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLit30_Enabled), 5, 0), true);
      edtavLit90_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLit90_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLit90_Enabled), 5, 0), true);
      edtavLit31_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLit31_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLit31_Enabled), 5, 0), true);
      edtavSelect_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSelect_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSelect_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1XU2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(41) ;
      /* Execute user event: Refresh */
      e151XU2 ();
      nGXsfl_41_idx = 1 ;
      sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_412( ) ;
      bGXsfl_41_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_412( ) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Integer.valueOf(AV83TFAlbRecCod) ,
                                              Integer.valueOf(AV84TFAlbRecCod_To) ,
                                              AV9AlbRef ,
                                              Integer.valueOf(A44AlbRecCod) ,
                                              A45AlbRef ,
                                              Short.valueOf(AV74OrderedBy) ,
                                              Boolean.valueOf(AV75OrderedDsc) ,
                                              Byte.valueOf(A47AlbREst) ,
                                              AV39InEmprCod ,
                                              Integer.valueOf(AV23Clicodd) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A252CliCod) } ,
                                              new int[]{
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.STRING, TypeConstants.INT
                                              }
         });
         lV9AlbRef = GXutil.padr( GXutil.rtrim( AV9AlbRef), 16, "%") ;
         /* Using cursor H01XU2 */
         pr_default.execute(0, new Object[] {AV39InEmprCod, Integer.valueOf(AV23Clicodd), Integer.valueOf(AV83TFAlbRecCod), Integer.valueOf(AV84TFAlbRecCod_To), lV9AlbRef});
         nGXsfl_41_idx = 1 ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A6263AlbRTartC = H01XU2_A6263AlbRTartC[0] ;
            n6263AlbRTartC = H01XU2_n6263AlbRTartC[0] ;
            A44AlbRecCod = H01XU2_A44AlbRecCod[0] ;
            A396EmprCod = H01XU2_A396EmprCod[0] ;
            A47AlbREst = H01XU2_A47AlbREst[0] ;
            A56AlbRUni = H01XU2_A56AlbRUni[0] ;
            A50AlbRLoc = H01XU2_A50AlbRLoc[0] ;
            A6463AlbRLote = H01XU2_A6463AlbRLote[0] ;
            A49AlbRFen = H01XU2_A49AlbRFen[0] ;
            A6264AlbRTartD = H01XU2_A6264AlbRTartD[0] ;
            n6264AlbRTartD = H01XU2_n6264AlbRTartD[0] ;
            A3613AlbRefDsc = H01XU2_A3613AlbRefDsc[0] ;
            A45AlbRef = H01XU2_A45AlbRef[0] ;
            A252CliCod = H01XU2_A252CliCod[0] ;
            A55AlbRReo = H01XU2_A55AlbRReo[0] ;
            A3359AlbRDisCli = H01XU2_A3359AlbRDisCli[0] ;
            A54AlbRPieUti = H01XU2_A54AlbRPieUti[0] ;
            A52AlbRPieEnt = H01XU2_A52AlbRPieEnt[0] ;
            A60AlbRUniUti = H01XU2_A60AlbRUniUti[0] ;
            A58AlbRUniEnt = H01XU2_A58AlbRUniEnt[0] ;
            A6264AlbRTartD = H01XU2_A6264AlbRTartD[0] ;
            n6264AlbRTartD = H01XU2_n6264AlbRTartD[0] ;
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
            A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
            e161XU2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(41) ;
         wb1XU0( ) ;
      }
      bGXsfl_41_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1XU2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vTOT_PD", GXutil.ltrim( localUtil.ntoc( AV102Tot_Pd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOT_PD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV102Tot_Pd), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRPIEDIS", GXutil.ltrim( localUtil.ntoc( AV16AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBRPIEDIS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV16AlbRPieDis), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOT_PE", GXutil.ltrim( localUtil.ntoc( AV103Tot_Pe, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOT_PE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV103Tot_Pe), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOT_UD", GXutil.ltrim( localUtil.ntoc( AV104Tot_Ud, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOT_UD", getSecureSignedToken( "", localUtil.format( AV104Tot_Ud, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRUNIDIS", GXutil.ltrim( localUtil.ntoc( AV17AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBRUNIDIS", getSecureSignedToken( "", localUtil.format( AV17AlbRUniDis, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOT_UE", GXutil.ltrim( localUtil.ntoc( AV105Tot_Ue, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOT_UE", getSecureSignedToken( "", localUtil.format( AV105Tot_Ue, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNUM_R", GXutil.ltrim( localUtil.ntoc( AV71Num_r, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNUM_R", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV71Num_r), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBRECCOD"+"_"+sGXsfl_41_idx, getSecureSignedToken( sGXsfl_41_idx, localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")));
   }

   public int subgrid_fnc_pagecount( )
   {
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( ((int)((GRID_nRecordCount) % (subgrid_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRID_nRecordCount/ (double) (subgrid_fnc_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRID_nRecordCount/ (double) (subgrid_fnc_recordsperpage( )))+1) ;
   }

   public int subgrid_fnc_recordcount( )
   {
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Integer.valueOf(AV83TFAlbRecCod) ,
                                           Integer.valueOf(AV84TFAlbRecCod_To) ,
                                           AV9AlbRef ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A45AlbRef ,
                                           Short.valueOf(AV74OrderedBy) ,
                                           Boolean.valueOf(AV75OrderedDsc) ,
                                           Byte.valueOf(A47AlbREst) ,
                                           AV39InEmprCod ,
                                           Integer.valueOf(AV23Clicodd) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV9AlbRef = GXutil.padr( GXutil.rtrim( AV9AlbRef), 16, "%") ;
      /* Using cursor H01XU3 */
      pr_default.execute(1, new Object[] {AV39InEmprCod, Integer.valueOf(AV23Clicodd), Integer.valueOf(AV83TFAlbRecCod), Integer.valueOf(AV84TFAlbRecCod_To), lV9AlbRef});
      GRID_nRecordCount = H01XU3_AGRID_nRecordCount[0] ;
      pr_default.close(1);
      return (int)(GRID_nRecordCount) ;
   }

   public int subgrid_fnc_recordsperpage( )
   {
      if ( subGrid_Rows > 0 )
      {
         return subGrid_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgrid_fnc_currentpage( )
   {
      return (int)(GXutil.Int( GRID_nFirstRecordOnPage/ (double) (subgrid_fnc_recordsperpage( )))+1) ;
   }

   public short subgrid_firstpage( )
   {
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV9AlbRef, AV23Clicodd, AV39InEmprCod, AV102Tot_Pd, AV16AlbRPieDis, AV103Tot_Pe, AV104Tot_Ud, AV17AlbRUniDis, AV105Tot_Ue, A1299AlbRLin, A1300AlbRObs, AV31Estado, AV71Num_r, AV70Nrefer, AV12AlbREst, AV22CliCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( ( GRID_nRecordCount >= subgrid_fnc_recordsperpage( ) ) && ( GRID_nEOF == 0 ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV9AlbRef, AV23Clicodd, AV39InEmprCod, AV102Tot_Pd, AV16AlbRPieDis, AV103Tot_Pe, AV104Tot_Ud, AV17AlbRUniDis, AV105Tot_Ue, A1299AlbRLin, A1300AlbRObs, AV31Estado, AV71Num_r, AV70Nrefer, AV12AlbREst, AV22CliCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      if ( GRID_nFirstRecordOnPage >= subgrid_fnc_recordsperpage( ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage-subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV9AlbRef, AV23Clicodd, AV39InEmprCod, AV102Tot_Pd, AV16AlbRPieDis, AV103Tot_Pe, AV104Tot_Ud, AV17AlbRUniDis, AV105Tot_Ue, A1299AlbRLin, A1300AlbRObs, AV31Estado, AV71Num_r, AV70Nrefer, AV12AlbREst, AV22CliCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( GRID_nRecordCount > subgrid_fnc_recordsperpage( ) )
      {
         if ( ((int)((GRID_nRecordCount) % (subgrid_fnc_recordsperpage( )))) == 0 )
         {
            GRID_nFirstRecordOnPage = (long)(GRID_nRecordCount-subgrid_fnc_recordsperpage( )) ;
         }
         else
         {
            GRID_nFirstRecordOnPage = (long)(GRID_nRecordCount-((int)((GRID_nRecordCount) % (subgrid_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRID_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV9AlbRef, AV23Clicodd, AV39InEmprCod, AV102Tot_Pd, AV16AlbRPieDis, AV103Tot_Pe, AV104Tot_Ud, AV17AlbRUniDis, AV105Tot_Ue, A1299AlbRLin, A1300AlbRObs, AV31Estado, AV71Num_r, AV70Nrefer, AV12AlbREst, AV22CliCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRID_nFirstRecordOnPage = (long)(subgrid_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV9AlbRef, AV23Clicodd, AV39InEmprCod, AV102Tot_Pd, AV16AlbRPieDis, AV103Tot_Pe, AV104Tot_Ud, AV17AlbRUniDis, AV105Tot_Ue, A1299AlbRLin, A1300AlbRObs, AV31Estado, AV71Num_r, AV70Nrefer, AV12AlbREst, AV22CliCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV126Pgmname = "Pedidos.DisAlb_AlbRecCod_Prompt" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV126Pgmname", AV126Pgmname);
      Gx_err = (short)(0) ;
      edtavLit30_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLit30_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLit30_Enabled), 5, 0), true);
      edtavLit90_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLit90_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLit90_Enabled), 5, 0), true);
      edtavLit31_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLit31_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLit31_Enabled), 5, 0), true);
      edtavSelect_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSelect_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSelect_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1XU0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e141XU2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV27DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_41 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_41"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV34GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV35GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Class = httpContext.cgiGet( "GRIDPAGINATIONBAR_Class") ;
         Gridpaginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Showfirst")) ;
         Gridpaginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Showprevious")) ;
         Gridpaginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Shownext")) ;
         Gridpaginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Showlast")) ;
         Gridpaginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Pagingbuttonsposition = httpContext.cgiGet( "GRIDPAGINATIONBAR_Pagingbuttonsposition") ;
         Gridpaginationbar_Pagingcaptionposition = httpContext.cgiGet( "GRIDPAGINATIONBAR_Pagingcaptionposition") ;
         Gridpaginationbar_Emptygridclass = httpContext.cgiGet( "GRIDPAGINATIONBAR_Emptygridclass") ;
         Gridpaginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselector")) ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Rowsperpageoptions = httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageoptions") ;
         Gridpaginationbar_Previous = httpContext.cgiGet( "GRIDPAGINATIONBAR_Previous") ;
         Gridpaginationbar_Next = httpContext.cgiGet( "GRIDPAGINATIONBAR_Next") ;
         Gridpaginationbar_Caption = httpContext.cgiGet( "GRIDPAGINATIONBAR_Caption") ;
         Gridpaginationbar_Emptygridcaption = httpContext.cgiGet( "GRIDPAGINATIONBAR_Emptygridcaption") ;
         Gridpaginationbar_Rowsperpagecaption = httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpagecaption") ;
         Ddo_grid_Caption = httpContext.cgiGet( "DDO_GRID_Caption") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( "DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( "DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( "DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( "DDO_GRID_Includesortasc") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( "DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( "DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( "DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( "DDO_GRID_Filterisrange") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( "DDO_GRID_Filteredtextto_get") ;
         /* Read variables values. */
         AV63Lit30 = httpContext.cgiGet( edtavLit30_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV63Lit30", AV63Lit30);
         AV9AlbRef = httpContext.cgiGet( edtavAlbref_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRef", AV9AlbRef);
         AV65Lit90 = httpContext.cgiGet( edtavLit90_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV65Lit90", AV65Lit90);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICODD");
            GX_FocusControl = edtavClicodd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV23Clicodd = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23Clicodd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Clicodd), 6, 0));
         }
         else
         {
            AV23Clicodd = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicodd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23Clicodd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Clicodd), 6, 0));
         }
         AV64Lit31 = httpContext.cgiGet( edtavLit31_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV64Lit31", AV64Lit31);
         AV5ProceNom = httpContext.cgiGet( edtavProcenom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5ProceNom", AV5ProceNom);
         AV126Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV126Pgmname", AV126Pgmname);
         cmbavEstado.setName( cmbavEstado.getInternalname() );
         cmbavEstado.setValue( httpContext.cgiGet( cmbavEstado.getInternalname()) );
         AV31Estado = (byte)(GXutil.lval( httpContext.cgiGet( cmbavEstado.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31Estado", GXutil.str( AV31Estado, 1, 0));
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vALBREF"), AV9AlbRef) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLICODD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV23Clicodd )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e141XU2 ();
      if (returnInSub) return;
   }

   public void e141XU2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV80Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      disalb_albreccod_prompt_impl.this.GXt_char1 = GXv_char2[0] ;
      AV80Station = GXt_char1 ;
      GXv_char2[0] = AV29EmprCod ;
      GXv_char3[0] = AV30EmprNom ;
      GXv_char4[0] = AV107UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV80Station, GXv_char2, GXv_char3, GXv_char4) ;
      disalb_albreccod_prompt_impl.this.AV29EmprCod = GXv_char2[0] ;
      disalb_albreccod_prompt_impl.this.AV30EmprNom = GXv_char3[0] ;
      disalb_albreccod_prompt_impl.this.AV107UsurCod = GXv_char4[0] ;
      cmbavEstado.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavEstado.getInternalname(), "Visible", GXutil.ltrimstr( cmbavEstado.getVisible(), 5, 0), true);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( "Selecciona Almacen Tejido", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      if ( AV74OrderedBy < 1 )
      {
         AV74OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV74OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S112 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV27DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV27DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_char1 = AV80Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      disalb_albreccod_prompt_impl.this.GXt_char1 = GXv_char4[0] ;
      AV80Station = GXt_char1 ;
      GXv_char4[0] = AV29EmprCod ;
      GXv_char3[0] = AV30EmprNom ;
      GXv_char2[0] = AV107UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV80Station, GXv_char4, GXv_char3, GXv_char2) ;
      disalb_albreccod_prompt_impl.this.AV29EmprCod = GXv_char4[0] ;
      disalb_albreccod_prompt_impl.this.AV30EmprNom = GXv_char3[0] ;
      disalb_albreccod_prompt_impl.this.AV107UsurCod = GXv_char2[0] ;
      GXt_char1 = AV66LitFe ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char4) ;
      disalb_albreccod_prompt_impl.this.GXt_char1 = GXv_char4[0] ;
      AV66LitFe = GXt_char1 ;
      GXt_char1 = AV44Lit0 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(8), GXv_char4) ;
      disalb_albreccod_prompt_impl.this.GXt_char1 = GXv_char4[0] ;
      AV44Lit0 = GXt_char1 ;
      GXt_char1 = AV53Lit2 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT330_", ""), (byte)(99), GXv_char4) ;
      disalb_albreccod_prompt_impl.this.GXt_char1 = GXv_char4[0] ;
      AV53Lit2 = GXt_char1 ;
      GXt_char1 = AV45Lit12 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN847_", ""), (byte)(99), GXv_char4) ;
      disalb_albreccod_prompt_impl.this.GXt_char1 = GXv_char4[0] ;
      AV45Lit12 = GXt_char1 ;
      GXt_char1 = AV46Lit13 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN848_", ""), (byte)(99), GXv_char4) ;
      disalb_albreccod_prompt_impl.this.GXt_char1 = GXv_char4[0] ;
      AV46Lit13 = GXt_char1 ;
      GXt_char1 = AV47Lit14 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN849_", ""), (byte)(99), GXv_char4) ;
      disalb_albreccod_prompt_impl.this.GXt_char1 = GXv_char4[0] ;
      AV47Lit14 = GXt_char1 ;
      GXt_char1 = AV48Lit15 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN435_", ""), (byte)(99), GXv_char4) ;
      disalb_albreccod_prompt_impl.this.GXt_char1 = GXv_char4[0] ;
      AV48Lit15 = GXt_char1 ;
      GXt_char1 = AV49Lit16 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN506_", ""), (byte)(99), GXv_char4) ;
      disalb_albreccod_prompt_impl.this.GXt_char1 = GXv_char4[0] ;
      AV49Lit16 = GXt_char1 ;
      GXt_char1 = AV50Lit17 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char4) ;
      disalb_albreccod_prompt_impl.this.GXt_char1 = GXv_char4[0] ;
      AV50Lit17 = GXt_char1 ;
      GXt_char1 = AV51Lit18 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN357_", ""), (byte)(99), GXv_char4) ;
      disalb_albreccod_prompt_impl.this.GXt_char1 = GXv_char4[0] ;
      AV51Lit18 = GXt_char1 ;
      GXt_char1 = AV52Lit19 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN235_", ""), (byte)(99), GXv_char4) ;
      disalb_albreccod_prompt_impl.this.GXt_char1 = GXv_char4[0] ;
      AV52Lit19 = GXt_char1 ;
      GXt_char1 = AV54Lit20 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN744_", ""), (byte)(99), GXv_char4) ;
      disalb_albreccod_prompt_impl.this.GXt_char1 = GXv_char4[0] ;
      AV54Lit20 = GXt_char1 ;
      GXt_char1 = AV55Lit21 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN856_", ""), (byte)(99), GXv_char4) ;
      disalb_albreccod_prompt_impl.this.GXt_char1 = GXv_char4[0] ;
      AV55Lit21 = GXt_char1 ;
      GXt_char1 = AV56Lit22 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN744_", ""), (byte)(99), GXv_char4) ;
      disalb_albreccod_prompt_impl.this.GXt_char1 = GXv_char4[0] ;
      AV56Lit22 = GXt_char1 ;
      GXt_char1 = AV57Lit23 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN856_", ""), (byte)(99), GXv_char4) ;
      disalb_albreccod_prompt_impl.this.GXt_char1 = GXv_char4[0] ;
      AV57Lit23 = GXt_char1 ;
      GXt_char1 = AV58Lit24 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN584_", ""), (byte)(99), GXv_char4) ;
      disalb_albreccod_prompt_impl.this.GXt_char1 = GXv_char4[0] ;
      AV58Lit24 = GXt_char1 ;
      GXt_char1 = AV59Lit25 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1217_", ""), (byte)(99), GXv_char4) ;
      disalb_albreccod_prompt_impl.this.GXt_char1 = GXv_char4[0] ;
      AV59Lit25 = GXt_char1 ;
      GXt_char1 = AV60Lit26 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN072_", ""), (byte)(99), GXv_char4) ;
      disalb_albreccod_prompt_impl.this.GXt_char1 = GXv_char4[0] ;
      AV60Lit26 = GXt_char1 ;
      GXt_char1 = AV61Lit27 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1480_", ""), (byte)(99), GXv_char4) ;
      disalb_albreccod_prompt_impl.this.GXt_char1 = GXv_char4[0] ;
      AV61Lit27 = GXt_char1 ;
      GXt_char1 = AV62Lit28 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN207_", ""), (byte)(99), GXv_char4) ;
      disalb_albreccod_prompt_impl.this.GXt_char1 = GXv_char4[0] ;
      AV62Lit28 = GXt_char1 ;
      GXt_char1 = AV63Lit30 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN235_", ""), (byte)(99), GXv_char4) ;
      disalb_albreccod_prompt_impl.this.GXt_char1 = GXv_char4[0] ;
      AV63Lit30 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63Lit30", AV63Lit30);
      GXt_char1 = AV64Lit31 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1325_", ""), (byte)(99), GXv_char4) ;
      disalb_albreccod_prompt_impl.this.GXt_char1 = GXv_char4[0] ;
      AV64Lit31 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64Lit31", AV64Lit31);
      GXt_int7 = AV43Kohler ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV29EmprCod, httpContext.getMessage( "KOHLER", ""), GXv_int8) ;
      disalb_albreccod_prompt_impl.this.GXt_int7 = GXv_int8[0] ;
      AV43Kohler = GXt_int7 ;
      GXt_int7 = AV79Staack ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV29EmprCod, httpContext.getMessage( "STAACK", ""), GXv_int8) ;
      disalb_albreccod_prompt_impl.this.GXt_int7 = GXv_int8[0] ;
      AV79Staack = GXt_int7 ;
      GXt_int9 = AV108Valor4 ;
      GXv_int10[0] = GXt_int9 ;
      new app.pbuscon(remoteHandle, context).execute( AV29EmprCod, httpContext.getMessage( "CONAL4", ""), GXv_int10) ;
      disalb_albreccod_prompt_impl.this.GXt_int9 = GXv_int10[0] ;
      AV108Valor4 = (byte)(GXt_int9) ;
      if ( GXutil.strcmp(AV12AlbREst, "0") == 0 )
      {
         AV31Estado = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31Estado", GXutil.str( AV31Estado, 1, 0));
      }
      else
      {
         if ( GXutil.strcmp(AV12AlbREst, "1") == 0 )
         {
            AV31Estado = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31Estado", GXutil.str( AV31Estado, 1, 0));
            if ( GXutil.strcmp(AV12AlbREst, httpContext.getMessage( "T", "")) == 0 )
            {
               AV31Estado = (byte)(2) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV31Estado", GXutil.str( AV31Estado, 1, 0));
            }
         }
      }
      edtAlbRecCod_Title = AV47Lit14 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Title", edtAlbRecCod_Title, !bGXsfl_41_Refreshing);
      /* * Property Title not supported in */
      /* * Property Title not supported in */
      /* * Property Title not supported in */
      /* * Property Title not supported in */
      /*
         Assignment error:
         ================
         Expression: [ t('Lit15',23) ]
         Target    : [ t('Albrent2',23),t('Title',3) ]
         ForType   : 29
         Type      : []
      */
      /* * Property Title not supported in */
      /* * Property Title not supported in */
      /* * Property Title not supported in */
      /* * Property Title not supported in */
      /*
         Assignment error:
         ================
         Expression: [ t('Lit16',23) ]
         Target    : [ t('Reo',23),t('Title',3) ]
         ForType   : 29
         Type      : []
      */
      edtCliCod_Title = AV51Lit18 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Title", edtCliCod_Title, !bGXsfl_41_Refreshing);
      edtAlbRef_Title = AV52Lit19 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Title", edtAlbRef_Title, !bGXsfl_41_Refreshing);
      /* * Property Title not supported in */
      /* * Property Title not supported in */
      /* * Property Title not supported in */
      /* * Property Title not supported in */
      /*
         Assignment error:
         ================
         Expression: [ t('Lit27',23) ]
         Target    : [ t('Artdsc',23),t('Title',3) ]
         ForType   : 29
         Type      : []
      */
      edtAlbRFen_Title = AV62Lit28 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRFen_Internalname, "Title", edtAlbRFen_Title, !bGXsfl_41_Refreshing);
      edtAlbRLoc_Title = AV59Lit25 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRLoc_Internalname, "Title", edtAlbRLoc_Title, !bGXsfl_41_Refreshing);
      edtAlbRTartD_Title = AV60Lit26 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRTartD_Internalname, "Title", edtAlbRTartD_Title, !bGXsfl_41_Refreshing);
      A971ProceNom_Title = AV64Lit31 ;
      AV71Num_r = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71Num_r", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71Num_r), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNUM_R", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV71Num_r), "ZZZZZ9")));
      if ( AV79Staack == 0 )
      {
         edtAlbRLote_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRLote_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLote_Visible), 5, 0), !bGXsfl_41_Refreshing);
      }
      AV9AlbRef = AV70Nrefer ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRef", AV9AlbRef);
      GXt_char1 = AV65Lit90 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN357_", ""), (byte)(99), GXv_char4) ;
      disalb_albreccod_prompt_impl.this.GXt_char1 = GXv_char4[0] ;
      AV65Lit90 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65Lit90", AV65Lit90);
      AV23Clicodd = AV22CliCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Clicodd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Clicodd), 6, 0));
   }

   public void e151XU2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext11[0] = AV109WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext11) ;
      AV109WWPContext = GXv_SdtWWPContext11[0] ;
      AV34GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34GridCurrentPage), 10, 0));
      AV35GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35GridPageCount), 10, 0));
      AV71Num_r = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71Num_r", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71Num_r), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNUM_R", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV71Num_r), "ZZZZZ9")));
      AV102Tot_Pd = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV102Tot_Pd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV102Tot_Pd), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOT_PD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV102Tot_Pd), "ZZZZZ9")));
      AV103Tot_Pe = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV103Tot_Pe", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV103Tot_Pe), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOT_PE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV103Tot_Pe), "ZZZZZ9")));
      AV104Tot_Ud = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV104Tot_Ud", GXutil.ltrimstr( AV104Tot_Ud, 10, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOT_UD", getSecureSignedToken( "", localUtil.format( AV104Tot_Ud, "ZZZZZZ9.99")));
      AV105Tot_Ue = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV105Tot_Ue", GXutil.ltrimstr( AV105Tot_Ue, 10, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOT_UE", getSecureSignedToken( "", localUtil.format( AV105Tot_Ue, "ZZZZZZ9.99")));
      /*  Sending Event outputs  */
   }

   public void e111XU2( )
   {
      /* Gridpaginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gridpaginationbar_Selectedpage, "Previous") == 0 )
      {
         subgrid_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Gridpaginationbar_Selectedpage, "Next") == 0 )
      {
         subgrid_nextpage( ) ;
      }
      else
      {
         AV76PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV76PageToGo) ;
      }
   }

   public void e121XU2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e131XU2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV74OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV74OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74OrderedBy), 4, 0));
         AV75OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV75OrderedDsc", AV75OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S112 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRecCod") == 0 )
         {
            AV83TFAlbRecCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83TFAlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83TFAlbRecCod), 8, 0));
            AV84TFAlbRecCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV84TFAlbRecCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84TFAlbRecCod_To), 8, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e161XU2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV78Select = "<i class=\"fas fa-check\"></i>" ;
      httpContext.ajax_rsp_assign_attri("", false, edtavSelect_Internalname, AV78Select);
      AV32Fecha = localUtil.dtoc( A49AlbRFen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
      AV28Dia = GXutil.substring( AV32Fecha, 1, 2) ;
      AV67Mes = GXutil.substring( AV32Fecha, 4, 2) ;
      AV19Any = GXutil.substring( AV32Fecha, 7, 2) ;
      AV6AlbFen = GXutil.concat( AV28Dia, AV19Any, AV67Mes) ;
      AV102Tot_Pd = (int)(AV102Tot_Pd+AV16AlbRPieDis) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV102Tot_Pd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV102Tot_Pd), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOT_PD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV102Tot_Pd), "ZZZZZ9")));
      AV103Tot_Pe = (int)(AV103Tot_Pe+A52AlbRPieEnt) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV103Tot_Pe", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV103Tot_Pe), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOT_PE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV103Tot_Pe), "ZZZZZ9")));
      AV104Tot_Ud = AV104Tot_Ud.add(AV17AlbRUniDis) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV104Tot_Ud", GXutil.ltrimstr( AV104Tot_Ud, 10, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOT_UD", getSecureSignedToken( "", localUtil.format( AV104Tot_Ud, "ZZZZZZ9.99")));
      AV105Tot_Ue = AV105Tot_Ue.add(A58AlbRUniEnt) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV105Tot_Ue", GXutil.ltrimstr( AV105Tot_Ue, 10, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOT_UE", getSecureSignedToken( "", localUtil.format( AV105Tot_Ue, "ZZZZZZ9.99")));
      AV72Obs = " " ;
      /* Using cursor H01XU4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A1300AlbRObs = H01XU4_A1300AlbRObs[0] ;
         A1299AlbRLin = H01XU4_A1299AlbRLin[0] ;
         AV72Obs += A1300AlbRObs + GXutil.chr( (short)(13)) ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      if ( ( ( AV31Estado == 0 ) && ( AV17AlbRUniDis.doubleValue() > 0 ) ) || ( AV31Estado == 1 ) || ( AV31Estado == 2 ) )
      {
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(41) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_412( ) ;
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_41_Refreshing )
         {
            httpContext.doAjaxLoad(41, GridRow);
         }
         AV71Num_r = (int)(AV71Num_r+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV71Num_r", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71Num_r), 6, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNUM_R", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV71Num_r), "ZZZZZ9")));
      }
      /*  Sending Event outputs  */
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e171XU2 ();
      if (returnInSub) return;
   }

   public void e171XU2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      AV8Albreccod = A44AlbRecCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Albreccod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Albreccod), 8, 0));
      httpContext.setWebReturnParms(new Object[] {Integer.valueOf(AV8Albreccod)});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV8Albreccod"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV74OrderedBy, 4, 0))+":"+(AV75OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV69Nrecep = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69Nrecep", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69Nrecep), 8, 0));
      AV70Nrefer = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70Nrefer", AV70Nrefer);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNREFER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV70Nrefer, ""))));
      AV68Nentre = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68Nentre", AV68Nentre);
      AV106Unid = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV106Unid", AV106Unid);
      AV22CliCod = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22CliCod), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV22CliCod), "ZZZZZ9")));
      AV73Opreo = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73Opreo", AV73Opreo);
      AV39InEmprCod = (String)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39InEmprCod", AV39InEmprCod);
      AV12AlbREst = (String)getParm(obj,7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12AlbREst", AV12AlbREst);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBREST", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12AlbREst, ""))));
      AV101TipEnt = ((Number) GXutil.testNumericType( getParm(obj,8), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV101TipEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV101TipEnt), 4, 0));
      AV15AlbRLoc = (String)getParm(obj,9) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15AlbRLoc", AV15AlbRLoc);
      AV7AlbRDisCli = (String)getParm(obj,10) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7AlbRDisCli", AV7AlbRDisCli);
      AV14AlbRfeni = (java.util.Date)getParm(obj,11) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14AlbRfeni", localUtil.format(AV14AlbRfeni, "99/99/99"));
      AV13Albrfenf = (java.util.Date)getParm(obj,12) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Albrfenf", localUtil.format(AV13Albrfenf, "99/99/99"));
      AV11Albrent2i = (String)getParm(obj,13) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Albrent2i", AV11Albrent2i);
      AV8Albreccod = ((Number) GXutil.testNumericType( getParm(obj,14), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Albreccod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Albreccod), 8, 0));
   }

   public String getresponse( String sGXDynURL )
   {
      initialize_properties( ) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      sDynURL = sGXDynURL ;
      nGotPars = 1 ;
      nGXWrapped = 1 ;
      httpContext.setWrapped(true);
      pa1XU2( ) ;
      ws1XU2( ) ;
      we1XU2( ) ;
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
      httpContext.setWrapped(false);
      httpContext.GX_msglist = BackMsgLst ;
      String response = "";
      try
      {
         response = ((java.io.ByteArrayOutputStream) httpContext.getOutputStream()).toString("UTF8");
      }
      catch (java.io.UnsupportedEncodingException e)
      {
         Application.printWarning(e.getMessage(), e);
      }
      finally
      {
         httpContext.closeOutputStream();
      }
      return response;
   }

   public void responsestatic( String sGXDynURL )
   {
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("DVelop/DVPaginationBar/DVPaginationBar.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116142122", true, true);
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
      httpContext.AddJavascriptSource("pedidos/disalb_albreccod_prompt.js", "?202682116142122", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_412( )
   {
      edtavSelect_Internalname = "vSELECT_"+sGXsfl_41_idx ;
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_41_idx ;
      edtAlbRecCod_Internalname = "ALBRECCOD_"+sGXsfl_41_idx ;
      edtAlbRDisCli_Internalname = "ALBRDISCLI_"+sGXsfl_41_idx ;
      cmbAlbRReo.setInternalname( "ALBRREO_"+sGXsfl_41_idx );
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_41_idx ;
      edtAlbRef_Internalname = "ALBREF_"+sGXsfl_41_idx ;
      edtAlbRefDsc_Internalname = "ALBREFDSC_"+sGXsfl_41_idx ;
      edtAlbRTartD_Internalname = "ALBRTARTD_"+sGXsfl_41_idx ;
      edtAlbRFen_Internalname = "ALBRFEN_"+sGXsfl_41_idx ;
      edtAlbRLote_Internalname = "ALBRLOTE_"+sGXsfl_41_idx ;
      edtAlbRLoc_Internalname = "ALBRLOC_"+sGXsfl_41_idx ;
      edtAlbRPieEnt_Internalname = "ALBRPIEENT_"+sGXsfl_41_idx ;
      edtAlbRUniEnt_Internalname = "ALBRUNIENT_"+sGXsfl_41_idx ;
      cmbAlbRUni.setInternalname( "ALBRUNI_"+sGXsfl_41_idx );
      edtAlbRPieDis_Internalname = "ALBRPIEDIS_"+sGXsfl_41_idx ;
      edtAlbRUniDis_Internalname = "ALBRUNIDIS_"+sGXsfl_41_idx ;
   }

   public void subsflControlProps_fel_412( )
   {
      edtavSelect_Internalname = "vSELECT_"+sGXsfl_41_fel_idx ;
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_41_fel_idx ;
      edtAlbRecCod_Internalname = "ALBRECCOD_"+sGXsfl_41_fel_idx ;
      edtAlbRDisCli_Internalname = "ALBRDISCLI_"+sGXsfl_41_fel_idx ;
      cmbAlbRReo.setInternalname( "ALBRREO_"+sGXsfl_41_fel_idx );
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_41_fel_idx ;
      edtAlbRef_Internalname = "ALBREF_"+sGXsfl_41_fel_idx ;
      edtAlbRefDsc_Internalname = "ALBREFDSC_"+sGXsfl_41_fel_idx ;
      edtAlbRTartD_Internalname = "ALBRTARTD_"+sGXsfl_41_fel_idx ;
      edtAlbRFen_Internalname = "ALBRFEN_"+sGXsfl_41_fel_idx ;
      edtAlbRLote_Internalname = "ALBRLOTE_"+sGXsfl_41_fel_idx ;
      edtAlbRLoc_Internalname = "ALBRLOC_"+sGXsfl_41_fel_idx ;
      edtAlbRPieEnt_Internalname = "ALBRPIEENT_"+sGXsfl_41_fel_idx ;
      edtAlbRUniEnt_Internalname = "ALBRUNIENT_"+sGXsfl_41_fel_idx ;
      cmbAlbRUni.setInternalname( "ALBRUNI_"+sGXsfl_41_fel_idx );
      edtAlbRPieDis_Internalname = "ALBRPIEDIS_"+sGXsfl_41_fel_idx ;
      edtAlbRUniDis_Internalname = "ALBRUNIDIS_"+sGXsfl_41_fel_idx ;
   }

   public void sendrow_412( )
   {
      subsflControlProps_412( ) ;
      wb1XU0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_41_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
      {
         GridRow = GXWebRow.GetNew(context,GridContainer) ;
         if ( subGrid_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGrid_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGrid_Class, "") != 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Odd" ;
            }
         }
         else if ( subGrid_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGrid_Backstyle = (byte)(0) ;
            subGrid_Backcolor = subGrid_Allbackcolor ;
            if ( GXutil.strcmp(subGrid_Class, "") != 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Uniform" ;
            }
         }
         else if ( subGrid_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGrid_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGrid_Class, "") != 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Odd" ;
            }
            subGrid_Backcolor = (int)(0x0) ;
         }
         else if ( subGrid_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGrid_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_41_idx) % (2))) == 0 )
            {
               subGrid_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid_Class, "") != 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"Even" ;
               }
            }
            else
            {
               subGrid_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid_Class, "") != 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"Odd" ;
               }
            }
         }
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_41_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavSelect_Enabled!=0)&&(edtavSelect_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 42,'',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSelect_Internalname,GXutil.rtrim( AV78Select),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavSelect_Enabled!=0)&&(edtavSelect_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,42);\"" : " "),"'"+""+"'"+",false,"+"'"+"EENTER."+sGXsfl_41_idx+"'","","",httpContext.getMessage( "GX_BtnSelect", ""),"",edtavSelect_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,"WWIconActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSelect_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecCod_Internalname,GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRDisCli_Internalname,GXutil.rtrim( A3359AlbRDisCli),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRDisCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         if ( ( cmbAlbRReo.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBRREO_" + sGXsfl_41_idx ;
            cmbAlbRReo.setName( GXCCtl );
            cmbAlbRReo.setWebtags( "" );
            cmbAlbRReo.addItem("NO", httpContext.getMessage( "NO", ""), (short)(0));
            cmbAlbRReo.addItem("SI", httpContext.getMessage( "SI", ""), (short)(0));
            if ( cmbAlbRReo.getItemCount() > 0 )
            {
               A55AlbRReo = cmbAlbRReo.getValidValue(A55AlbRReo) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbRReo,cmbAlbRReo.getInternalname(),GXutil.rtrim( A55AlbRReo),Integer.valueOf(1),cmbAlbRReo.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbRReo.setValue( GXutil.rtrim( A55AlbRReo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Values", cmbAlbRReo.ToJavascriptSource(), !bGXsfl_41_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRef_Internalname,GXutil.rtrim( A45AlbRef),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRef_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRefDsc_Internalname,GXutil.rtrim( A3613AlbRefDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRefDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRTartD_Internalname,GXutil.rtrim( A6264AlbRTartD),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRTartD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRFen_Internalname,localUtil.format(A49AlbRFen, "99/99/99"),localUtil.format( A49AlbRFen, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRFen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbRLote_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRLote_Internalname,GXutil.rtrim( A6463AlbRLote),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRLote_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbRLote_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRLoc_Internalname,GXutil.rtrim( A50AlbRLoc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRLoc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRPieEnt_Internalname,GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRPieEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRUniEnt_Internalname,GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRUniEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         if ( ( cmbAlbRUni.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBRUNI_" + sGXsfl_41_idx ;
            cmbAlbRUni.setName( GXCCtl );
            cmbAlbRUni.setWebtags( "" );
            cmbAlbRUni.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
            cmbAlbRUni.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
            if ( cmbAlbRUni.getItemCount() > 0 )
            {
               A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbRUni,cmbAlbRUni.getInternalname(),GXutil.rtrim( A56AlbRUni),Integer.valueOf(1),cmbAlbRUni.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), !bGXsfl_41_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRPieDis_Internalname,GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRPieDis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRUniDis_Internalname,GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A57AlbRUniDis, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRUniDis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1XU2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_41_idx = ((subGrid_Islastpage==1)&&(nGXsfl_41_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_41_idx+1) ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
      }
      /* End function sendrow_412 */
   }

   public void startgridcontrol41( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"41\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGrid_Backcolorstyle == 0 )
         {
            subGrid_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGrid_Class) > 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Title" ;
            }
         }
         else
         {
            subGrid_Titlebackstyle = (byte)(1) ;
            if ( subGrid_Backcolorstyle == 1 )
            {
               subGrid_Titlebackcolor = subGrid_Allbackcolor ;
               if ( GXutil.len( subGrid_Class) > 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGrid_Class) > 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Empresa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtAlbRecCod_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Enc. Cli.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtCliCod_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtAlbRef_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descrição", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtAlbRTartD_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtAlbRFen_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRLote_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lote", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( edtAlbRLoc_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pzs. ent", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Und.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pzs. Disp.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Und.Disp.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
         if ( isAjaxCallMode( ) )
         {
            GridContainer = new com.genexus.webpanels.GXWebGrid(context);
         }
         else
         {
            GridContainer.Clear();
         }
         GridContainer.SetWrapped(nGXWrapped);
         GridContainer.AddObjectProperty("GridName", "Grid");
         GridContainer.AddObjectProperty("Header", subGrid_Header);
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV78Select));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSelect_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtAlbRecCod_Title));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3359AlbRDisCli));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A55AlbRReo));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtCliCod_Title));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A45AlbRef));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtAlbRef_Title));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3613AlbRefDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A6264AlbRTartD));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtAlbRTartD_Title));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A49AlbRFen, "99/99/99"));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtAlbRFen_Title));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A6463AlbRLote));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRLote_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A50AlbRLoc));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtAlbRLoc_Title));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A56AlbRUni));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid_Allowselection, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      edtavLit30_Internalname = "vLIT30" ;
      edtavAlbref_Internalname = "vALBREF" ;
      edtavLit90_Internalname = "vLIT90" ;
      edtavClicodd_Internalname = "vCLICODD" ;
      edtavClicod_Internalname = "vCLICOD" ;
      edtavLit31_Internalname = "vLIT31" ;
      edtavProcenom_Internalname = "vPROCENOM" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      edtavSelect_Internalname = "vSELECT" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtAlbRecCod_Internalname = "ALBRECCOD" ;
      edtAlbRDisCli_Internalname = "ALBRDISCLI" ;
      cmbAlbRReo.setInternalname( "ALBRREO" );
      edtCliCod_Internalname = "CLICOD" ;
      edtAlbRef_Internalname = "ALBREF" ;
      edtAlbRefDsc_Internalname = "ALBREFDSC" ;
      edtAlbRTartD_Internalname = "ALBRTARTD" ;
      edtAlbRFen_Internalname = "ALBRFEN" ;
      edtAlbRLote_Internalname = "ALBRLOTE" ;
      edtAlbRLoc_Internalname = "ALBRLOC" ;
      edtAlbRPieEnt_Internalname = "ALBRPIEENT" ;
      edtAlbRUniEnt_Internalname = "ALBRUNIENT" ;
      cmbAlbRUni.setInternalname( "ALBRUNI" );
      edtAlbRPieDis_Internalname = "ALBRPIEDIS" ;
      edtAlbRUniDis_Internalname = "ALBRUNIDIS" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      cmbavEstado.setInternalname( "vESTADO" );
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGrid_Internalname = "GRID" ;
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
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      subGrid_Header = "" ;
      edtAlbRUniDis_Jsonclick = "" ;
      edtAlbRPieDis_Jsonclick = "" ;
      cmbAlbRUni.setJsonclick( "" );
      edtAlbRUniEnt_Jsonclick = "" ;
      edtAlbRPieEnt_Jsonclick = "" ;
      edtAlbRLoc_Jsonclick = "" ;
      edtAlbRLote_Jsonclick = "" ;
      edtAlbRFen_Jsonclick = "" ;
      edtAlbRTartD_Jsonclick = "" ;
      edtAlbRefDsc_Jsonclick = "" ;
      edtAlbRef_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      cmbAlbRReo.setJsonclick( "" );
      edtAlbRDisCli_Jsonclick = "" ;
      edtAlbRecCod_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      edtavSelect_Jsonclick = "" ;
      edtavSelect_Visible = -1 ;
      edtavSelect_Enabled = 1 ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      subGrid_Sortable = (byte)(0) ;
      cmbavEstado.setJsonclick( "" );
      cmbavEstado.setVisible( 1 );
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavProcenom_Jsonclick = "" ;
      edtavProcenom_Enabled = 1 ;
      edtavLit31_Jsonclick = "" ;
      edtavLit31_Enabled = 1 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 0 ;
      edtavClicodd_Jsonclick = "" ;
      edtavClicodd_Enabled = 1 ;
      edtavLit90_Jsonclick = "" ;
      edtavLit90_Enabled = 1 ;
      edtavAlbref_Jsonclick = "" ;
      edtavAlbref_Enabled = 1 ;
      edtavLit30_Jsonclick = "" ;
      edtavLit30_Enabled = 1 ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_grid_Filterisrange = "T|" ;
      Ddo_grid_Filtertype = "Numeric|" ;
      Ddo_grid_Includefilter = "T|" ;
      Ddo_grid_Includesortasc = "|T" ;
      Ddo_grid_Columnssortvalues = "|2" ;
      Ddo_grid_Columnids = "2:AlbRecCod|7:AlbRefDsc" ;
      Ddo_grid_Gridinternalname = "" ;
      Gridpaginationbar_Rowsperpagecaption = "WWP_PagingRowsPerPage" ;
      Gridpaginationbar_Emptygridcaption = "WWP_PagingEmptyGridCaption" ;
      Gridpaginationbar_Caption = httpContext.getMessage( "WWP_PagingCaption", "") ;
      Gridpaginationbar_Next = "WWP_PagingNextCaption" ;
      Gridpaginationbar_Previous = "WWP_PagingPreviousCaption" ;
      Gridpaginationbar_Rowsperpageoptions = "5:WWP_Rows5,10:WWP_Rows10,20:WWP_Rows20,50:WWP_Rows50" ;
      Gridpaginationbar_Rowsperpageselectedvalue = 10 ;
      Gridpaginationbar_Rowsperpageselector = GXutil.toBoolean( -1) ;
      Gridpaginationbar_Emptygridclass = "PaginationBarEmptyGrid" ;
      Gridpaginationbar_Pagingcaptionposition = "Left" ;
      Gridpaginationbar_Pagingbuttonsposition = "Right" ;
      Gridpaginationbar_Pagestoshow = 5 ;
      Gridpaginationbar_Showlast = GXutil.toBoolean( 0) ;
      Gridpaginationbar_Shownext = GXutil.toBoolean( -1) ;
      Gridpaginationbar_Showprevious = GXutil.toBoolean( -1) ;
      Gridpaginationbar_Showfirst = GXutil.toBoolean( 0) ;
      Gridpaginationbar_Class = "PaginationBar" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Selecciona Almacen Tejido", "") );
      edtAlbRLote_Visible = 0 ;
      edtAlbRTartD_Title = httpContext.getMessage( "T. Art.", "") ;
      edtAlbRLoc_Title = httpContext.getMessage( "Localiz.", "") ;
      edtAlbRFen_Title = httpContext.getMessage( "F.Entr.", "") ;
      edtAlbRef_Title = httpContext.getMessage( "Artigo", "") ;
      edtCliCod_Title = httpContext.getMessage( "Cliente", "") ;
      edtAlbRecCod_Title = httpContext.getMessage( "N Recepcion", "") ;
      subGrid_Rows = 0 ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "ALBRREO_" + sGXsfl_41_idx ;
      cmbAlbRReo.setName( GXCCtl );
      cmbAlbRReo.setWebtags( "" );
      cmbAlbRReo.addItem("NO", httpContext.getMessage( "NO", ""), (short)(0));
      cmbAlbRReo.addItem("SI", httpContext.getMessage( "SI", ""), (short)(0));
      if ( cmbAlbRReo.getItemCount() > 0 )
      {
         A55AlbRReo = cmbAlbRReo.getValidValue(A55AlbRReo) ;
      }
      GXCCtl = "ALBRUNI_" + sGXsfl_41_idx ;
      cmbAlbRUni.setName( GXCCtl );
      cmbAlbRUni.setWebtags( "" );
      cmbAlbRUni.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
      cmbAlbRUni.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
      }
      cmbavEstado.setName( "vESTADO" );
      cmbavEstado.setWebtags( "" );
      if ( cmbavEstado.getItemCount() > 0 )
      {
         AV31Estado = (byte)(GXutil.lval( cmbavEstado.getValidValue(GXutil.trim( GXutil.str( AV31Estado, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31Estado", GXutil.str( AV31Estado, 1, 0));
      }
      /* End function init_web_controls */
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV9AlbRef',fld:'vALBREF',pic:''},{av:'AV23Clicodd',fld:'vCLICODD',pic:'ZZZZZ9'},{av:'AV39InEmprCod',fld:'vINEMPRCOD',pic:'@!'},{av:'edtAlbRecCod_Title',ctrl:'ALBRECCOD',prop:'Title'},{av:'edtCliCod_Title',ctrl:'CLICOD',prop:'Title'},{av:'edtAlbRef_Title',ctrl:'ALBREF',prop:'Title'},{av:'edtAlbRFen_Title',ctrl:'ALBRFEN',prop:'Title'},{av:'edtAlbRLoc_Title',ctrl:'ALBRLOC',prop:'Title'},{av:'edtAlbRTartD_Title',ctrl:'ALBRTARTD',prop:'Title'},{av:'edtAlbRLote_Visible',ctrl:'ALBRLOTE',prop:'Visible'},{av:'A1299AlbRLin',fld:'ALBRLIN',pic:'Z9'},{av:'A1300AlbRObs',fld:'ALBROBS',pic:''},{av:'cmbavEstado'},{av:'AV31Estado',fld:'vESTADO',pic:'9'},{av:'AV102Tot_Pd',fld:'vTOT_PD',pic:'ZZZZZ9',hsh:true},{av:'AV16AlbRPieDis',fld:'vALBRPIEDIS',pic:'ZZZZZ9',hsh:true},{av:'AV103Tot_Pe',fld:'vTOT_PE',pic:'ZZZZZ9',hsh:true},{av:'AV104Tot_Ud',fld:'vTOT_UD',pic:'ZZZZZZ9.99',hsh:true},{av:'AV17AlbRUniDis',fld:'vALBRUNIDIS',pic:'ZZZZZ9.99',hsh:true},{av:'AV105Tot_Ue',fld:'vTOT_UE',pic:'ZZZZZZ9.99',hsh:true},{av:'AV71Num_r',fld:'vNUM_R',pic:'ZZZZZ9',hsh:true},{av:'AV70Nrefer',fld:'vNREFER',pic:'',hsh:true},{av:'AV12AlbREst',fld:'vALBREST',pic:'',hsh:true},{av:'AV22CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV34GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV35GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV71Num_r',fld:'vNUM_R',pic:'ZZZZZ9',hsh:true},{av:'AV102Tot_Pd',fld:'vTOT_PD',pic:'ZZZZZ9',hsh:true},{av:'AV103Tot_Pe',fld:'vTOT_PE',pic:'ZZZZZ9',hsh:true},{av:'AV104Tot_Ud',fld:'vTOT_UD',pic:'ZZZZZZ9.99',hsh:true},{av:'AV105Tot_Ue',fld:'vTOT_UE',pic:'ZZZZZZ9.99',hsh:true}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e111XU2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV9AlbRef',fld:'vALBREF',pic:''},{av:'AV23Clicodd',fld:'vCLICODD',pic:'ZZZZZ9'},{av:'AV39InEmprCod',fld:'vINEMPRCOD',pic:'@!'},{av:'edtAlbRecCod_Title',ctrl:'ALBRECCOD',prop:'Title'},{av:'edtCliCod_Title',ctrl:'CLICOD',prop:'Title'},{av:'edtAlbRef_Title',ctrl:'ALBREF',prop:'Title'},{av:'edtAlbRFen_Title',ctrl:'ALBRFEN',prop:'Title'},{av:'edtAlbRLoc_Title',ctrl:'ALBRLOC',prop:'Title'},{av:'edtAlbRTartD_Title',ctrl:'ALBRTARTD',prop:'Title'},{av:'edtAlbRLote_Visible',ctrl:'ALBRLOTE',prop:'Visible'},{av:'AV102Tot_Pd',fld:'vTOT_PD',pic:'ZZZZZ9',hsh:true},{av:'AV16AlbRPieDis',fld:'vALBRPIEDIS',pic:'ZZZZZ9',hsh:true},{av:'AV103Tot_Pe',fld:'vTOT_PE',pic:'ZZZZZ9',hsh:true},{av:'AV104Tot_Ud',fld:'vTOT_UD',pic:'ZZZZZZ9.99',hsh:true},{av:'AV17AlbRUniDis',fld:'vALBRUNIDIS',pic:'ZZZZZ9.99',hsh:true},{av:'AV105Tot_Ue',fld:'vTOT_UE',pic:'ZZZZZZ9.99',hsh:true},{av:'A1299AlbRLin',fld:'ALBRLIN',pic:'Z9'},{av:'A1300AlbRObs',fld:'ALBROBS',pic:''},{av:'cmbavEstado'},{av:'AV31Estado',fld:'vESTADO',pic:'9'},{av:'AV71Num_r',fld:'vNUM_R',pic:'ZZZZZ9',hsh:true},{av:'AV70Nrefer',fld:'vNREFER',pic:'',hsh:true},{av:'AV12AlbREst',fld:'vALBREST',pic:'',hsh:true},{av:'AV22CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e121XU2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV9AlbRef',fld:'vALBREF',pic:''},{av:'AV23Clicodd',fld:'vCLICODD',pic:'ZZZZZ9'},{av:'AV39InEmprCod',fld:'vINEMPRCOD',pic:'@!'},{av:'edtAlbRecCod_Title',ctrl:'ALBRECCOD',prop:'Title'},{av:'edtCliCod_Title',ctrl:'CLICOD',prop:'Title'},{av:'edtAlbRef_Title',ctrl:'ALBREF',prop:'Title'},{av:'edtAlbRFen_Title',ctrl:'ALBRFEN',prop:'Title'},{av:'edtAlbRLoc_Title',ctrl:'ALBRLOC',prop:'Title'},{av:'edtAlbRTartD_Title',ctrl:'ALBRTARTD',prop:'Title'},{av:'edtAlbRLote_Visible',ctrl:'ALBRLOTE',prop:'Visible'},{av:'AV102Tot_Pd',fld:'vTOT_PD',pic:'ZZZZZ9',hsh:true},{av:'AV16AlbRPieDis',fld:'vALBRPIEDIS',pic:'ZZZZZ9',hsh:true},{av:'AV103Tot_Pe',fld:'vTOT_PE',pic:'ZZZZZ9',hsh:true},{av:'AV104Tot_Ud',fld:'vTOT_UD',pic:'ZZZZZZ9.99',hsh:true},{av:'AV17AlbRUniDis',fld:'vALBRUNIDIS',pic:'ZZZZZ9.99',hsh:true},{av:'AV105Tot_Ue',fld:'vTOT_UE',pic:'ZZZZZZ9.99',hsh:true},{av:'A1299AlbRLin',fld:'ALBRLIN',pic:'Z9'},{av:'A1300AlbRObs',fld:'ALBROBS',pic:''},{av:'cmbavEstado'},{av:'AV31Estado',fld:'vESTADO',pic:'9'},{av:'AV71Num_r',fld:'vNUM_R',pic:'ZZZZZ9',hsh:true},{av:'AV70Nrefer',fld:'vNREFER',pic:'',hsh:true},{av:'AV12AlbREst',fld:'vALBREST',pic:'',hsh:true},{av:'AV22CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e131XU2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV9AlbRef',fld:'vALBREF',pic:''},{av:'AV23Clicodd',fld:'vCLICODD',pic:'ZZZZZ9'},{av:'AV39InEmprCod',fld:'vINEMPRCOD',pic:'@!'},{av:'edtAlbRecCod_Title',ctrl:'ALBRECCOD',prop:'Title'},{av:'edtCliCod_Title',ctrl:'CLICOD',prop:'Title'},{av:'edtAlbRef_Title',ctrl:'ALBREF',prop:'Title'},{av:'edtAlbRFen_Title',ctrl:'ALBRFEN',prop:'Title'},{av:'edtAlbRLoc_Title',ctrl:'ALBRLOC',prop:'Title'},{av:'edtAlbRTartD_Title',ctrl:'ALBRTARTD',prop:'Title'},{av:'edtAlbRLote_Visible',ctrl:'ALBRLOTE',prop:'Visible'},{av:'AV102Tot_Pd',fld:'vTOT_PD',pic:'ZZZZZ9',hsh:true},{av:'AV16AlbRPieDis',fld:'vALBRPIEDIS',pic:'ZZZZZ9',hsh:true},{av:'AV103Tot_Pe',fld:'vTOT_PE',pic:'ZZZZZ9',hsh:true},{av:'AV104Tot_Ud',fld:'vTOT_UD',pic:'ZZZZZZ9.99',hsh:true},{av:'AV17AlbRUniDis',fld:'vALBRUNIDIS',pic:'ZZZZZ9.99',hsh:true},{av:'AV105Tot_Ue',fld:'vTOT_UE',pic:'ZZZZZZ9.99',hsh:true},{av:'A1299AlbRLin',fld:'ALBRLIN',pic:'Z9'},{av:'A1300AlbRObs',fld:'ALBROBS',pic:''},{av:'cmbavEstado'},{av:'AV31Estado',fld:'vESTADO',pic:'9'},{av:'AV71Num_r',fld:'vNUM_R',pic:'ZZZZZ9',hsh:true},{av:'AV70Nrefer',fld:'vNREFER',pic:'',hsh:true},{av:'AV12AlbREst',fld:'vALBREST',pic:'',hsh:true},{av:'AV22CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'AV74OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV75OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV74OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV75OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV83TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV84TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e161XU2',iparms:[{av:'A49AlbRFen',fld:'ALBRFEN',pic:''},{av:'AV102Tot_Pd',fld:'vTOT_PD',pic:'ZZZZZ9',hsh:true},{av:'AV16AlbRPieDis',fld:'vALBRPIEDIS',pic:'ZZZZZ9',hsh:true},{av:'AV103Tot_Pe',fld:'vTOT_PE',pic:'ZZZZZ9',hsh:true},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'AV104Tot_Ud',fld:'vTOT_UD',pic:'ZZZZZZ9.99',hsh:true},{av:'AV17AlbRUniDis',fld:'vALBRUNIDIS',pic:'ZZZZZ9.99',hsh:true},{av:'AV105Tot_Ue',fld:'vTOT_UE',pic:'ZZZZZZ9.99',hsh:true},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A1299AlbRLin',fld:'ALBRLIN',pic:'Z9'},{av:'A1300AlbRObs',fld:'ALBROBS',pic:''},{av:'cmbavEstado'},{av:'AV31Estado',fld:'vESTADO',pic:'9'},{av:'AV71Num_r',fld:'vNUM_R',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV78Select',fld:'vSELECT',pic:''},{av:'AV102Tot_Pd',fld:'vTOT_PD',pic:'ZZZZZ9',hsh:true},{av:'AV103Tot_Pe',fld:'vTOT_PE',pic:'ZZZZZ9',hsh:true},{av:'AV104Tot_Ud',fld:'vTOT_UD',pic:'ZZZZZZ9.99',hsh:true},{av:'AV105Tot_Ue',fld:'vTOT_UE',pic:'ZZZZZZ9.99',hsh:true},{av:'AV71Num_r',fld:'vNUM_R',pic:'ZZZZZ9',hsh:true}]}");
      setEventMetadata("ENTER","{handler:'e171XU2',iparms:[{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV8Albreccod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'}]}");
      setEventMetadata("VALIDV_CLICODD","{handler:'validv_Clicodd',iparms:[]");
      setEventMetadata("VALIDV_CLICODD",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBRECCOD","{handler:'valid_Albreccod',iparms:[]");
      setEventMetadata("VALID_ALBRECCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBRPIEENT","{handler:'valid_Albrpieent',iparms:[]");
      setEventMetadata("VALID_ALBRPIEENT",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNIENT","{handler:'valid_Albrunient',iparms:[]");
      setEventMetadata("VALID_ALBRUNIENT",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Albrunidis',iparms:[]");
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
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      wcpOAV70Nrefer = "" ;
      wcpOAV68Nentre = "" ;
      wcpOAV106Unid = "" ;
      wcpOAV73Opreo = "" ;
      wcpOAV39InEmprCod = "" ;
      wcpOAV12AlbREst = "" ;
      wcpOAV15AlbRLoc = "" ;
      wcpOAV7AlbRDisCli = "" ;
      wcpOAV14AlbRfeni = GXutil.nullDate() ;
      wcpOAV13Albrfenf = GXutil.nullDate() ;
      wcpOAV11Albrent2i = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV70Nrefer = "" ;
      AV68Nentre = "" ;
      AV106Unid = "" ;
      AV73Opreo = "" ;
      AV39InEmprCod = "" ;
      AV12AlbREst = "" ;
      AV15AlbRLoc = "" ;
      AV7AlbRDisCli = "" ;
      AV14AlbRfeni = GXutil.nullDate() ;
      AV13Albrfenf = GXutil.nullDate() ;
      AV11Albrent2i = "" ;
      AV9AlbRef = "" ;
      AV104Tot_Ud = DecimalUtil.ZERO ;
      AV17AlbRUniDis = DecimalUtil.ZERO ;
      AV105Tot_Ue = DecimalUtil.ZERO ;
      A1300AlbRObs = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV27DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A60AlbRUniUti = DecimalUtil.ZERO ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      TempTags = "" ;
      AV63Lit30 = "" ;
      AV65Lit90 = "" ;
      AV64Lit31 = "" ;
      AV5ProceNom = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      AV126Pgmname = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV78Select = "" ;
      A396EmprCod = "" ;
      A3359AlbRDisCli = "" ;
      A55AlbRReo = "" ;
      A45AlbRef = "" ;
      A3613AlbRefDsc = "" ;
      A6264AlbRTartD = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A6463AlbRLote = "" ;
      A50AlbRLoc = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A56AlbRUni = "" ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV9AlbRef = "" ;
      H01XU2_A6263AlbRTartC = new short[1] ;
      H01XU2_n6263AlbRTartC = new boolean[] {false} ;
      H01XU2_A44AlbRecCod = new int[1] ;
      H01XU2_A396EmprCod = new String[] {""} ;
      H01XU2_A47AlbREst = new byte[1] ;
      H01XU2_A56AlbRUni = new String[] {""} ;
      H01XU2_A50AlbRLoc = new String[] {""} ;
      H01XU2_A6463AlbRLote = new String[] {""} ;
      H01XU2_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      H01XU2_A6264AlbRTartD = new String[] {""} ;
      H01XU2_n6264AlbRTartD = new boolean[] {false} ;
      H01XU2_A3613AlbRefDsc = new String[] {""} ;
      H01XU2_A45AlbRef = new String[] {""} ;
      H01XU2_A252CliCod = new int[1] ;
      H01XU2_A55AlbRReo = new String[] {""} ;
      H01XU2_A3359AlbRDisCli = new String[] {""} ;
      H01XU2_A54AlbRPieUti = new int[1] ;
      H01XU2_A52AlbRPieEnt = new int[1] ;
      H01XU2_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01XU2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01XU3_AGRID_nRecordCount = new long[1] ;
      AV80Station = "" ;
      AV29EmprCod = "" ;
      AV30EmprNom = "" ;
      AV107UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV66LitFe = "" ;
      AV44Lit0 = "" ;
      AV53Lit2 = "" ;
      AV45Lit12 = "" ;
      AV46Lit13 = "" ;
      AV47Lit14 = "" ;
      AV48Lit15 = "" ;
      AV49Lit16 = "" ;
      AV50Lit17 = "" ;
      AV51Lit18 = "" ;
      AV52Lit19 = "" ;
      AV54Lit20 = "" ;
      AV55Lit21 = "" ;
      AV56Lit22 = "" ;
      AV57Lit23 = "" ;
      AV58Lit24 = "" ;
      AV59Lit25 = "" ;
      AV60Lit26 = "" ;
      AV61Lit27 = "" ;
      AV62Lit28 = "" ;
      GXv_int8 = new byte[1] ;
      GXv_int10 = new int[1] ;
      A971ProceNom_Title = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      AV109WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext11 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV32Fecha = "" ;
      AV28Dia = "" ;
      AV67Mes = "" ;
      AV19Any = "" ;
      AV6AlbFen = "" ;
      AV72Obs = "" ;
      H01XU4_A396EmprCod = new String[] {""} ;
      H01XU4_A44AlbRecCod = new int[1] ;
      H01XU4_A1300AlbRObs = new String[] {""} ;
      H01XU4_A1299AlbRLin = new byte[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.disalb_albreccod_prompt__default(),
         new Object[] {
             new Object[] {
            H01XU2_A6263AlbRTartC, H01XU2_n6263AlbRTartC, H01XU2_A44AlbRecCod, H01XU2_A396EmprCod, H01XU2_A47AlbREst, H01XU2_A56AlbRUni, H01XU2_A50AlbRLoc, H01XU2_A6463AlbRLote, H01XU2_A49AlbRFen, H01XU2_A6264AlbRTartD,
            H01XU2_n6264AlbRTartD, H01XU2_A3613AlbRefDsc, H01XU2_A45AlbRef, H01XU2_A252CliCod, H01XU2_A55AlbRReo, H01XU2_A3359AlbRDisCli, H01XU2_A54AlbRPieUti, H01XU2_A52AlbRPieEnt, H01XU2_A60AlbRUniUti, H01XU2_A58AlbRUniEnt
            }
            , new Object[] {
            H01XU3_AGRID_nRecordCount
            }
            , new Object[] {
            H01XU4_A396EmprCod, H01XU4_A44AlbRecCod, H01XU4_A1300AlbRObs, H01XU4_A1299AlbRLin
            }
         }
      );
      AV126Pgmname = "Pedidos.DisAlb_AlbRecCod_Prompt" ;
      /* GeneXus formulas. */
      AV126Pgmname = "Pedidos.DisAlb_AlbRecCod_Prompt" ;
      Gx_err = (short)(0) ;
      edtavLit30_Enabled = 0 ;
      edtavLit90_Enabled = 0 ;
      edtavLit31_Enabled = 0 ;
      edtavSelect_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte A1299AlbRLin ;
   private byte AV31Estado ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte A47AlbREst ;
   private byte AV43Kohler ;
   private byte AV79Staack ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private byte AV108Valor4 ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV101TipEnt ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV101TipEnt ;
   private short AV74OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short A6263AlbRTartC ;
   private int wcpOAV69Nrecep ;
   private int wcpOAV22CliCod ;
   private int edtAlbRLote_Visible ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_41 ;
   private int subGrid_Rows ;
   private int AV69Nrecep ;
   private int AV22CliCod ;
   private int AV8Albreccod ;
   private int nGXsfl_41_idx=1 ;
   private int AV23Clicodd ;
   private int AV102Tot_Pd ;
   private int AV16AlbRPieDis ;
   private int AV103Tot_Pe ;
   private int AV71Num_r ;
   private int A54AlbRPieUti ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavLit30_Enabled ;
   private int edtavAlbref_Enabled ;
   private int edtavLit90_Enabled ;
   private int edtavClicodd_Enabled ;
   private int edtavClicod_Enabled ;
   private int edtavLit31_Enabled ;
   private int edtavProcenom_Enabled ;
   private int edtavPgmname_Enabled ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int A52AlbRPieEnt ;
   private int A51AlbRPieDis ;
   private int subGrid_Islastpage ;
   private int edtavSelect_Enabled ;
   private int AV83TFAlbRecCod ;
   private int AV84TFAlbRecCod_To ;
   private int GXt_int9 ;
   private int GXv_int10[] ;
   private int AV76PageToGo ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavSelect_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV34GridCurrentPage ;
   private long AV35GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV104Tot_Ud ;
   private java.math.BigDecimal AV17AlbRUniDis ;
   private java.math.BigDecimal AV105Tot_Ue ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private String wcpOAV70Nrefer ;
   private String wcpOAV68Nentre ;
   private String wcpOAV106Unid ;
   private String wcpOAV73Opreo ;
   private String wcpOAV39InEmprCod ;
   private String wcpOAV12AlbREst ;
   private String wcpOAV15AlbRLoc ;
   private String wcpOAV7AlbRDisCli ;
   private String wcpOAV11Albrent2i ;
   private String edtAlbRecCod_Title ;
   private String edtCliCod_Title ;
   private String edtAlbRef_Title ;
   private String edtAlbRFen_Title ;
   private String edtAlbRLoc_Title ;
   private String edtAlbRTartD_Title ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV70Nrefer ;
   private String AV68Nentre ;
   private String AV106Unid ;
   private String AV73Opreo ;
   private String AV39InEmprCod ;
   private String AV12AlbREst ;
   private String AV15AlbRLoc ;
   private String AV7AlbRDisCli ;
   private String AV11Albrent2i ;
   private String sGXsfl_41_idx="0001" ;
   private String edtAlbRecCod_Internalname ;
   private String edtCliCod_Internalname ;
   private String edtAlbRef_Internalname ;
   private String edtAlbRFen_Internalname ;
   private String edtAlbRLoc_Internalname ;
   private String edtAlbRTartD_Internalname ;
   private String edtAlbRLote_Internalname ;
   private String AV9AlbRef ;
   private String A1300AlbRObs ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Gridpaginationbar_Class ;
   private String Gridpaginationbar_Pagingbuttonsposition ;
   private String Gridpaginationbar_Pagingcaptionposition ;
   private String Gridpaginationbar_Emptygridclass ;
   private String Gridpaginationbar_Rowsperpageoptions ;
   private String Gridpaginationbar_Previous ;
   private String Gridpaginationbar_Next ;
   private String Gridpaginationbar_Caption ;
   private String Gridpaginationbar_Emptygridcaption ;
   private String Gridpaginationbar_Rowsperpagecaption ;
   private String Ddo_grid_Caption ;
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Includesortasc ;
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Filterisrange ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String divTableheader_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtavLit30_Internalname ;
   private String TempTags ;
   private String AV63Lit30 ;
   private String edtavLit30_Jsonclick ;
   private String edtavAlbref_Internalname ;
   private String edtavAlbref_Jsonclick ;
   private String edtavLit90_Internalname ;
   private String AV65Lit90 ;
   private String edtavLit90_Jsonclick ;
   private String edtavClicodd_Internalname ;
   private String edtavClicodd_Jsonclick ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String edtavLit31_Internalname ;
   private String AV64Lit31 ;
   private String edtavLit31_Jsonclick ;
   private String edtavProcenom_Internalname ;
   private String AV5ProceNom ;
   private String edtavProcenom_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String AV126Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV78Select ;
   private String edtavSelect_Internalname ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String A3359AlbRDisCli ;
   private String edtAlbRDisCli_Internalname ;
   private String A55AlbRReo ;
   private String A45AlbRef ;
   private String A3613AlbRefDsc ;
   private String edtAlbRefDsc_Internalname ;
   private String A6264AlbRTartD ;
   private String A6463AlbRLote ;
   private String A50AlbRLoc ;
   private String edtAlbRPieEnt_Internalname ;
   private String edtAlbRUniEnt_Internalname ;
   private String A56AlbRUni ;
   private String edtAlbRPieDis_Internalname ;
   private String edtAlbRUniDis_Internalname ;
   private String scmdbuf ;
   private String lV9AlbRef ;
   private String AV80Station ;
   private String AV29EmprCod ;
   private String AV30EmprNom ;
   private String AV107UsurCod ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String AV66LitFe ;
   private String AV44Lit0 ;
   private String AV53Lit2 ;
   private String AV45Lit12 ;
   private String AV46Lit13 ;
   private String AV47Lit14 ;
   private String AV48Lit15 ;
   private String AV49Lit16 ;
   private String AV50Lit17 ;
   private String AV51Lit18 ;
   private String AV52Lit19 ;
   private String AV54Lit20 ;
   private String AV55Lit21 ;
   private String AV56Lit22 ;
   private String AV57Lit23 ;
   private String AV58Lit24 ;
   private String AV59Lit25 ;
   private String AV60Lit26 ;
   private String AV61Lit27 ;
   private String AV62Lit28 ;
   private String A971ProceNom_Title ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String AV32Fecha ;
   private String AV28Dia ;
   private String AV67Mes ;
   private String AV19Any ;
   private String AV6AlbFen ;
   private String sGXsfl_41_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavSelect_Jsonclick ;
   private String edtEmprCod_Jsonclick ;
   private String edtAlbRecCod_Jsonclick ;
   private String edtAlbRDisCli_Jsonclick ;
   private String GXCCtl ;
   private String edtCliCod_Jsonclick ;
   private String edtAlbRef_Jsonclick ;
   private String edtAlbRefDsc_Jsonclick ;
   private String edtAlbRTartD_Jsonclick ;
   private String edtAlbRFen_Jsonclick ;
   private String edtAlbRLote_Jsonclick ;
   private String edtAlbRLoc_Jsonclick ;
   private String edtAlbRPieEnt_Jsonclick ;
   private String edtAlbRUniEnt_Jsonclick ;
   private String edtAlbRPieDis_Jsonclick ;
   private String edtAlbRUniDis_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV14AlbRfeni ;
   private java.util.Date wcpOAV13Albrfenf ;
   private java.util.Date AV14AlbRfeni ;
   private java.util.Date AV13Albrfenf ;
   private java.util.Date A49AlbRFen ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean bGXsfl_41_Refreshing=false ;
   private boolean AV75OrderedDsc ;
   private boolean Gridpaginationbar_Showfirst ;
   private boolean Gridpaginationbar_Showprevious ;
   private boolean Gridpaginationbar_Shownext ;
   private boolean Gridpaginationbar_Showlast ;
   private boolean Gridpaginationbar_Rowsperpageselector ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n6264AlbRTartD ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n6263AlbRTartC ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV72Obs ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private HTMLChoice cmbAlbRReo ;
   private HTMLChoice cmbAlbRUni ;
   private HTMLChoice cmbavEstado ;
   private IDataStoreProvider pr_default ;
   private short[] H01XU2_A6263AlbRTartC ;
   private boolean[] H01XU2_n6263AlbRTartC ;
   private int[] H01XU2_A44AlbRecCod ;
   private String[] H01XU2_A396EmprCod ;
   private byte[] H01XU2_A47AlbREst ;
   private String[] H01XU2_A56AlbRUni ;
   private String[] H01XU2_A50AlbRLoc ;
   private String[] H01XU2_A6463AlbRLote ;
   private java.util.Date[] H01XU2_A49AlbRFen ;
   private String[] H01XU2_A6264AlbRTartD ;
   private boolean[] H01XU2_n6264AlbRTartD ;
   private String[] H01XU2_A3613AlbRefDsc ;
   private String[] H01XU2_A45AlbRef ;
   private int[] H01XU2_A252CliCod ;
   private String[] H01XU2_A55AlbRReo ;
   private String[] H01XU2_A3359AlbRDisCli ;
   private int[] H01XU2_A54AlbRPieUti ;
   private int[] H01XU2_A52AlbRPieEnt ;
   private java.math.BigDecimal[] H01XU2_A60AlbRUniUti ;
   private java.math.BigDecimal[] H01XU2_A58AlbRUniEnt ;
   private long[] H01XU3_AGRID_nRecordCount ;
   private String[] H01XU4_A396EmprCod ;
   private int[] H01XU4_A44AlbRecCod ;
   private String[] H01XU4_A1300AlbRObs ;
   private byte[] H01XU4_A1299AlbRLin ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV27DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPContext AV109WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext11[] ;
}

final  class disalb_albreccod_prompt__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01XU2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV83TFAlbRecCod ,
                                          int AV84TFAlbRecCod_To ,
                                          String AV9AlbRef ,
                                          int A44AlbRecCod ,
                                          String A45AlbRef ,
                                          short AV74OrderedBy ,
                                          boolean AV75OrderedDsc ,
                                          byte A47AlbREst ,
                                          String AV39InEmprCod ,
                                          int AV23Clicodd ,
                                          String A396EmprCod ,
                                          int A252CliCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[5];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.AlbRTartC AS AlbRTartC, T1.AlbRecCod, T1.EmprCod, T1.AlbREst, T1.AlbRUni, T1.AlbRLoc, T1.AlbRLote, T1.AlbRFen, T2.TipArtDsc AS AlbRTartD, T1.AlbRefDsc," ;
      scmdbuf += " T1.AlbRef, T1.CliCod, T1.AlbRReo, T1.AlbRDisCli, T1.AlbRPieUti, T1.AlbRPieEnt, T1.AlbRUniUti, T1.AlbRUniEnt FROM (TXPALBREC T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.TipArtCod = T1.AlbRTartC)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.CliCod = ?)");
      addWhere(sWhereString, "(T1.AlbREst = 0)");
      if ( ! (0==AV83TFAlbRecCod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int12[2] = (byte)(1) ;
      }
      if ( ! (0==AV84TFAlbRecCod_To) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int12[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9AlbRef)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef like ?)");
      }
      else
      {
         GXv_int12[4] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV74OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.AlbRecCod" ;
      }
      else if ( ( AV74OrderedBy == 2 ) && ! AV75OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.AlbRefDsc" ;
      }
      else if ( ( AV74OrderedBy == 2 ) && ( AV75OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.AlbRefDsc DESC" ;
      }
      else if ( true )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.AlbRecCod" ;
      }
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_H01XU3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV83TFAlbRecCod ,
                                          int AV84TFAlbRecCod_To ,
                                          String AV9AlbRef ,
                                          int A44AlbRecCod ,
                                          String A45AlbRef ,
                                          short AV74OrderedBy ,
                                          boolean AV75OrderedDsc ,
                                          byte A47AlbREst ,
                                          String AV39InEmprCod ,
                                          int AV23Clicodd ,
                                          String A396EmprCod ,
                                          int A252CliCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[5];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPALBREC T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.AlbRTartC)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.CliCod = ?)");
      addWhere(sWhereString, "(T1.AlbREst = 0)");
      if ( ! (0==AV83TFAlbRecCod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int14[2] = (byte)(1) ;
      }
      if ( ! (0==AV84TFAlbRecCod_To) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int14[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9AlbRef)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef like ?)");
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV74OrderedBy == 1 )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV74OrderedBy == 2 ) && ! AV75OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV74OrderedBy == 2 ) && ( AV75OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_H01XU2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Boolean) dynConstraints[6]).booleanValue() , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() );
            case 1 :
                  return conditional_H01XU3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Boolean) dynConstraints[6]).booleanValue() , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01XU2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01XU3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01XU4", "SELECT EmprCod, AlbRecCod, AlbRObs, AlbRLin FROM TXPALBROB WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod, AlbRLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 10);
               ((String[]) buf[7])[0] = rslt.getString(7, 20);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 26);
               ((String[]) buf[12])[0] = rslt.getString(11, 16);
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((String[]) buf[14])[0] = rslt.getString(13, 2);
               ((String[]) buf[15])[0] = rslt.getString(14, 20);
               ((int[]) buf[16])[0] = rslt.getInt(15);
               ((int[]) buf[17])[0] = rslt.getInt(16);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(18,2);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[5], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[6]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[7]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 16);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[5], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[6]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[7]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 16);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

