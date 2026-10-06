package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class selecciontablaalbrec_impl extends GXDataArea
{
   public selecciontablaalbrec_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public selecciontablaalbrec_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( selecciontablaalbrec_impl.class ));
   }

   public selecciontablaalbrec_impl( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void executeCmdLine( String args[] )
   {
      try
      {
         A396EmprCod = (String) args[0];
         AV23Clicodin = (int) GXutil.lval( args[1]);
         AV5AlbReccod = (int) GXutil.lval( args[2]);
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      nGotPars = 1 ;
      webExecute();
   }

   protected void createObjects( )
   {
      cmbavAlbruni = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vCLICOD1") == 0 )
         {
            A396EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A279CliNom = httpContext.GetPar( "CliNom") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvclicod1CO0( A396EmprCod, A279CliNom) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vCLICOD1") == 0 )
         {
            A396EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A279CliNom = httpContext.GetPar( "CliNom") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvclicod1CO0( A396EmprCod, A279CliNom) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vCLICOD1") == 0 )
         {
            A396EmprCod = httpContext.GetPar( "EmprCod") ;
            hV21CliCod1 = httpContext.GetPar( "hV21CliCod1") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvclicod1CO2( A396EmprCod, hV21CliCod1) ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
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
            A396EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV23Clicodin = (int)(GXutil.lval( httpContext.GetPar( "Clicodin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV23Clicodin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Clicodin), 6, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICODIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV23Clicodin), "ZZZZZ9")));
               AV5AlbReccod = (int)(GXutil.lval( httpContext.GetPar( "AlbReccod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV5AlbReccod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5AlbReccod), 8, 0));
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
      nRC_GXsfl_58 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_58"))) ;
      nGXsfl_58_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_58_idx"))) ;
      sGXsfl_58_idx = httpContext.GetPar( "sGXsfl_58_idx") ;
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
      AV15AlbRFen1 = localUtil.parseDateParm( httpContext.GetPar( "AlbRFen1")) ;
      AV16AlbRFen2 = localUtil.parseDateParm( httpContext.GetPar( "AlbRFen2")) ;
      AV21CliCod1 = (int)(GXutil.lval( httpContext.GetPar( "CliCod1"))) ;
      AV12AlbRef1 = httpContext.GetPar( "AlbRef1") ;
      AV13AlbRefDsc1 = httpContext.GetPar( "AlbRefDsc1") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      AV23Clicodin = (int)(GXutil.lval( httpContext.GetPar( "Clicodin"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV15AlbRFen1, AV16AlbRFen2, AV21CliCod1, AV12AlbRef1, AV13AlbRefDsc1, A396EmprCod, AV23Clicodin) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
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

   public byte executeStartEvent( )
   {
      paCO2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startCO2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"true\"" ;
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
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.selecciontablaalbrec", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV23Clicodin,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV5AlbReccod,8,0))}, new String[] {"EmprCod","Clicodin","AlbReccod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICODIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV23Clicodin), "ZZZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vALBRFEN1", localUtil.format(AV15AlbRFen1, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vALBRFEN2", localUtil.format(AV16AlbRFen2, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vCLICOD1", GXutil.ltrim( localUtil.ntoc( AV21CliCod1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vALBREF1", GXutil.rtrim( AV12AlbRef1));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vALBREFDSC1", GXutil.rtrim( AV13AlbRefDsc1));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_58", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_58, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV20GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECCOD", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBREF", GXutil.rtrim( A45AlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBREFDSC", GXutil.rtrim( A3613AlbRefDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRFEN", localUtil.dtoc( A49AlbRFen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRUNI", GXutil.rtrim( A56AlbRUni));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICODIN", GXutil.ltrim( localUtil.ntoc( AV23Clicodin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICODIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV23Clicodin), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRECCOD", GXutil.ltrim( localUtil.ntoc( AV5AlbReccod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvCLICOD1", GXutil.ltrim( localUtil.ntoc( AV21CliCod1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRUNIENT", GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRUNIUTI", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRUNIDIS", GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRPIEENT", GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRPIEUTI", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRPIEDIS", GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Width", GXutil.rtrim( Dvpanel_unnamedtable2_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable2_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable2_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Cls", GXutil.rtrim( Dvpanel_unnamedtable2_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Title", GXutil.rtrim( Dvpanel_unnamedtable2_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable2_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable2_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable2_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
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
         app.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         weCO2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtCO2( ) ;
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
      return formatLink("app.selecciontablaalbrec", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV23Clicodin,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV5AlbReccod,8,0))}, new String[] {"EmprCod","Clicodin","AlbReccod"})  ;
   }

   public String getPgmname( )
   {
      return "SeleccionTablaAlbrec" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Entradas Almacen", "") ;
   }

   public void wbCO0( )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", 0, "px", "TableMain", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
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
         wb_table1_17_CO2( true) ;
      }
      else
      {
         wb_table1_17_CO2( false) ;
      }
      return  ;
   }

   public void wb_table1_17_CO2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable2.setProperty("Width", Dvpanel_unnamedtable2_Width);
         ucDvpanel_unnamedtable2.setProperty("AutoWidth", Dvpanel_unnamedtable2_Autowidth);
         ucDvpanel_unnamedtable2.setProperty("AutoHeight", Dvpanel_unnamedtable2_Autoheight);
         ucDvpanel_unnamedtable2.setProperty("Cls", Dvpanel_unnamedtable2_Cls);
         ucDvpanel_unnamedtable2.setProperty("Title", Dvpanel_unnamedtable2_Title);
         ucDvpanel_unnamedtable2.setProperty("Collapsible", Dvpanel_unnamedtable2_Collapsible);
         ucDvpanel_unnamedtable2.setProperty("Collapsed", Dvpanel_unnamedtable2_Collapsed);
         ucDvpanel_unnamedtable2.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable2_Showcollapseicon);
         ucDvpanel_unnamedtable2.setProperty("IconPosition", Dvpanel_unnamedtable2_Iconposition);
         ucDvpanel_unnamedtable2.setProperty("AutoScroll", Dvpanel_unnamedtable2_Autoscroll);
         ucDvpanel_unnamedtable2.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable2_Internalname, "DVPANEL_UNNAMEDTABLE2Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE2Container"+"UnnamedTable2"+"\" style=\"display:none;\">") ;
         wb_table2_50_CO2( true) ;
      }
      else
      {
         wb_table2_50_CO2( false) ;
      }
      return  ;
   }

   public void wb_table2_50_CO2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
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
         wb_table3_73_CO2( true) ;
      }
      else
      {
         wb_table3_73_CO2( false) ;
      }
      return  ;
   }

   public void wb_table3_73_CO2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</div>") ;
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
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'" + sGXsfl_58_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavGridcurrentpage_Internalname, GXutil.ltrim( localUtil.ntoc( AV19GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV19GridCurrentPage), "ZZZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,82);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavGridcurrentpage_Jsonclick, 0, "Attribute", "", "", "", "", edtavGridcurrentpage_Visible, 1, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_SeleccionTablaAlbrec.htm");
         /* User Defined Control */
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 58 )
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

   public void startCO2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Entradas Almacen", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupCO0( ) ;
   }

   public void wsCO2( )
   {
      startCO2( ) ;
      evtCO2( ) ;
   }

   public void evtCO2( )
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
                           e11CO2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e12CO2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCONFIRMAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoConfirmar' */
                           e13CO2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_58_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_582( ) ;
                           AV22AlbRecCod1 = (int)(localUtil.ctol( httpContext.cgiGet( edtavAlbreccod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavAlbreccod1_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22AlbRecCod1), 8, 0));
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBRECCOD1"+"_"+sGXsfl_58_idx, getSecureSignedToken( sGXsfl_58_idx, localUtil.format( DecimalUtil.doubleToDec(AV22AlbRecCod1), "ZZZZZZZ9")));
                           AV6AlbRef = httpContext.cgiGet( edtavAlbref_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavAlbref_Internalname, AV6AlbRef);
                           AV7AlbRefDsc = httpContext.cgiGet( edtavAlbrefdsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavAlbrefdsc_Internalname, AV7AlbRefDsc);
                           AV8AlbRFen = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavAlbrfen_Internalname), 0)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavAlbrfen_Internalname, localUtil.format(AV8AlbRFen, "99/99/99"));
                           AV9AlbRUniDis = localUtil.ctond( httpContext.cgiGet( edtavAlbrunidis_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavAlbrunidis_Internalname, GXutil.ltrimstr( AV9AlbRUniDis, 9, 2));
                           cmbavAlbruni.setName( cmbavAlbruni.getInternalname() );
                           cmbavAlbruni.setValue( httpContext.cgiGet( cmbavAlbruni.getInternalname()) );
                           AV10AlbRUni = httpContext.cgiGet( cmbavAlbruni.getInternalname()) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavAlbruni.getInternalname(), AV10AlbRUni);
                           AV11AlbRPieDis = (int)(localUtil.ctol( httpContext.cgiGet( edtavAlbrpiedis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavAlbrpiedis_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11AlbRPieDis), 6, 0));
                           if ( ! httpContext.isAjaxRequest( ) )
                           {
                              GXCCtl = "GXHCvCLICOD1_" + sGXsfl_58_idx ;
                              AV21CliCod1 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           }
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e14CO2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e15CO2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e16CO2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Albrfen1 Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vALBRFEN1"), 0), AV15AlbRFen1) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Albrfen2 Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vALBRFEN2"), 0), AV16AlbRFen2) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Clicod1 Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLICOD1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV21CliCod1 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Albref1 Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vALBREF1"), AV12AlbRef1) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Albrefdsc1 Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vALBREFDSC1"), AV13AlbRefDsc1) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e17CO2 ();
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

   public void weCO2( )
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

   public void paCO2( )
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
            GX_FocusControl = edtavAlbrfen1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxsgvvclicod1CO0( String A396EmprCod ,
                                 String A279CliNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvclicod1_dataCO0( A396EmprCod, A279CliNom) ;
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

   protected void gxsgvvclicod1_dataCO0( String A396EmprCod ,
                                         String A279CliNom )
   {
      l279CliNom = GXutil.padr( GXutil.rtrim( A279CliNom), 30, "%") ;
      /* Using cursor H00CO2 */
      pr_default.execute(0, new Object[] {A396EmprCod, l279CliNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(0) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( H00CO2_A279CliNom[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( H00CO2_A279CliNom[0]));
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxhcvvclicod1CO2( String A396EmprCod ,
                                 String A279CliNom )
   {
      /* Using cursor H00CO3 */
      pr_default.execute(1, new Object[] {A279CliNom, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(1) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A279CliNom = H00CO3_A279CliNom[0] ;
         A396EmprCod = H00CO3_A396EmprCod[0] ;
         A252CliCod = H00CO3_A252CliCod[0] ;
         pr_default.readNext(1);
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
      pr_default.close(1);
   }

   public void gxnrgrid_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_582( ) ;
      while ( nGXsfl_58_idx <= nRC_GXsfl_58 )
      {
         sendrow_582( ) ;
         nGXsfl_58_idx = ((subGrid_Islastpage==1)&&(nGXsfl_58_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_58_idx+1) ;
         sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_582( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 java.util.Date AV15AlbRFen1 ,
                                 java.util.Date AV16AlbRFen2 ,
                                 int AV21CliCod1 ,
                                 String AV12AlbRef1 ,
                                 String AV13AlbRefDsc1 ,
                                 String A396EmprCod ,
                                 int AV23Clicodin )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e15CO2 ();
      GRID_nCurrentRecord = 0 ;
      rfCO2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBRECCOD1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV22AlbRecCod1), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRECCOD1", GXutil.ltrim( localUtil.ntoc( AV22AlbRecCod1, (byte)(8), (byte)(0), ".", "")));
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
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rfCO2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavAlbreccod1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbreccod1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbreccod1_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtavAlbref_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbref_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbref_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtavAlbrefdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbrefdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrefdsc_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtavAlbrfen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbrfen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrfen_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtavAlbrunidis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbrunidis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrunidis_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      cmbavAlbruni.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbruni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavAlbruni.getEnabled(), 5, 0), !bGXsfl_58_Refreshing);
      edtavAlbrpiedis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbrpiedis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrpiedis_Enabled), 5, 0), !bGXsfl_58_Refreshing);
   }

   public void rfCO2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(58) ;
      /* Execute user event: Refresh */
      e15CO2 ();
      nGXsfl_58_idx = 1 ;
      sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_582( ) ;
      bGXsfl_58_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_582( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 0 : GRID_nFirstRecordOnPage)) ;
         GXPagingTo2 = ((subGrid_Rows==0) ? 10000 : subgrid_fnc_recordsperpage( )+1) ;
         lV12AlbRef1 = GXutil.padr( GXutil.rtrim( AV12AlbRef1), 16, "%") ;
         lV13AlbRefDsc1 = GXutil.padr( GXutil.rtrim( AV13AlbRefDsc1), 26, "%") ;
         /* Using cursor H00CO4 */
         pr_default.execute(2, new Object[] {A396EmprCod, AV16AlbRFen2, Integer.valueOf(AV21CliCod1), lV12AlbRef1, lV13AlbRefDsc1, AV15AlbRFen1, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2)});
         nGXsfl_58_idx = 1 ;
         sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_582( ) ;
         while ( ( (pr_default.getStatus(2) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A47AlbREst = H00CO4_A47AlbREst[0] ;
            A252CliCod = H00CO4_A252CliCod[0] ;
            A44AlbRecCod = H00CO4_A44AlbRecCod[0] ;
            A45AlbRef = H00CO4_A45AlbRef[0] ;
            A3613AlbRefDsc = H00CO4_A3613AlbRefDsc[0] ;
            A56AlbRUni = H00CO4_A56AlbRUni[0] ;
            A49AlbRFen = H00CO4_A49AlbRFen[0] ;
            A60AlbRUniUti = H00CO4_A60AlbRUniUti[0] ;
            A58AlbRUniEnt = H00CO4_A58AlbRUniEnt[0] ;
            A54AlbRPieUti = H00CO4_A54AlbRPieUti[0] ;
            A52AlbRPieEnt = H00CO4_A52AlbRPieEnt[0] ;
            A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
            httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
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
            e16CO2 ();
            pr_default.readNext(2);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(2) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(2);
         wbEnd = (short)(58) ;
         wbCO0( ) ;
      }
      bGXsfl_58_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesCO2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBRECCOD1"+"_"+sGXsfl_58_idx, getSecureSignedToken( sGXsfl_58_idx, localUtil.format( DecimalUtil.doubleToDec(AV22AlbRecCod1), "ZZZZZZZ9")));
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
      lV12AlbRef1 = GXutil.padr( GXutil.rtrim( AV12AlbRef1), 16, "%") ;
      lV13AlbRefDsc1 = GXutil.padr( GXutil.rtrim( AV13AlbRefDsc1), 26, "%") ;
      /* Using cursor H00CO5 */
      pr_default.execute(3, new Object[] {A396EmprCod, AV16AlbRFen2, Integer.valueOf(AV21CliCod1), lV12AlbRef1, lV13AlbRefDsc1, AV15AlbRFen1});
      GRID_nRecordCount = H00CO5_AGRID_nRecordCount[0] ;
      pr_default.close(3);
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
         gxgrgrid_refresh( subGrid_Rows, AV15AlbRFen1, AV16AlbRFen2, AV21CliCod1, AV12AlbRef1, AV13AlbRefDsc1, A396EmprCod, AV23Clicodin) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15AlbRFen1, AV16AlbRFen2, AV21CliCod1, AV12AlbRef1, AV13AlbRefDsc1, A396EmprCod, AV23Clicodin) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15AlbRFen1, AV16AlbRFen2, AV21CliCod1, AV12AlbRef1, AV13AlbRefDsc1, A396EmprCod, AV23Clicodin) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15AlbRFen1, AV16AlbRFen2, AV21CliCod1, AV12AlbRef1, AV13AlbRefDsc1, A396EmprCod, AV23Clicodin) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15AlbRFen1, AV16AlbRFen2, AV21CliCod1, AV12AlbRef1, AV13AlbRefDsc1, A396EmprCod, AV23Clicodin) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavAlbreccod1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbreccod1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbreccod1_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtavAlbref_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbref_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbref_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtavAlbrefdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbrefdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrefdsc_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtavAlbrfen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbrfen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrfen_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtavAlbrunidis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbrunidis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrunidis_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      cmbavAlbruni.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbruni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavAlbruni.getEnabled(), 5, 0), !bGXsfl_58_Refreshing);
      edtavAlbrpiedis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbrpiedis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrpiedis_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strupCO0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e14CO2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         nRC_GXsfl_58 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_58"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV20GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvpanel_unnamedtable1_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Width") ;
         Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autowidth")) ;
         Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoheight")) ;
         Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Cls") ;
         Dvpanel_unnamedtable1_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Title") ;
         Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsible")) ;
         Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsed")) ;
         Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Showcollapseicon")) ;
         Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Iconposition") ;
         Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoscroll")) ;
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
         Dvpanel_unnamedtable2_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Width") ;
         Dvpanel_unnamedtable2_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autowidth")) ;
         Dvpanel_unnamedtable2_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autoheight")) ;
         Dvpanel_unnamedtable2_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Cls") ;
         Dvpanel_unnamedtable2_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Title") ;
         Dvpanel_unnamedtable2_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Collapsible")) ;
         Dvpanel_unnamedtable2_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Collapsed")) ;
         Dvpanel_unnamedtable2_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Showcollapseicon")) ;
         Dvpanel_unnamedtable2_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Iconposition") ;
         Dvpanel_unnamedtable2_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autoscroll")) ;
         Dvpanel_unnamedtable3_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Width") ;
         Dvpanel_unnamedtable3_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Autowidth")) ;
         Dvpanel_unnamedtable3_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Autoheight")) ;
         Dvpanel_unnamedtable3_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Cls") ;
         Dvpanel_unnamedtable3_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Title") ;
         Dvpanel_unnamedtable3_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Collapsible")) ;
         Dvpanel_unnamedtable3_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Collapsed")) ;
         Dvpanel_unnamedtable3_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Showcollapseicon")) ;
         Dvpanel_unnamedtable3_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Iconposition") ;
         Dvpanel_unnamedtable3_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Autoscroll")) ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         if ( localUtil.vcdate( httpContext.cgiGet( edtavAlbrfen1_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vALBRFEN1");
            GX_FocusControl = edtavAlbrfen1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV15AlbRFen1 = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15AlbRFen1", localUtil.format(AV15AlbRFen1, "99/99/99"));
         }
         else
         {
            AV15AlbRFen1 = localUtil.ctod( httpContext.cgiGet( edtavAlbrfen1_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15AlbRFen1", localUtil.format(AV15AlbRFen1, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavAlbrfen2_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vALBRFEN2");
            GX_FocusControl = edtavAlbrfen2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV16AlbRFen2 = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16AlbRFen2", localUtil.format(AV16AlbRFen2, "99/99/99"));
         }
         else
         {
            AV16AlbRFen2 = localUtil.ctod( httpContext.cgiGet( edtavAlbrfen2_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16AlbRFen2", localUtil.format(AV16AlbRFen2, "99/99/99"));
         }
         hV21CliCod1 = httpContext.cgiGet( edtavClicod1_Internalname) ;
         if ( (GXutil.strcmp("", hV21CliCod1)==0) )
         {
            AV21CliCod1 = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21CliCod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21CliCod1), 6, 0));
         }
         else
         {
            A279CliNom = hV21CliCod1 ;
            /* Using cursor H00CO6 */
            pr_default.execute(4, new Object[] {A279CliNom, A396EmprCod});
            AV21CliCod1 = H00CO6_A252CliCod[0] ;
            if ( ! ( (pr_default.getStatus(4) == 101) ) )
            {
               pr_default.readNext(4);
               if ( ! ( (pr_default.getStatus(4) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Nombre Cliente", "")}), 1, "vCLICOD1");
                  GX_FocusControl = edtavClicod1_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(4);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV21CliCod1", hV21CliCod1);
         AV12AlbRef1 = httpContext.cgiGet( edtavAlbref1_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12AlbRef1", AV12AlbRef1);
         AV13AlbRefDsc1 = httpContext.cgiGet( edtavAlbrefdsc1_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13AlbRefDsc1", AV13AlbRefDsc1);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGridcurrentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGridcurrentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGRIDCURRENTPAGE");
            GX_FocusControl = edtavGridcurrentpage_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV19GridCurrentPage = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19GridCurrentPage), 10, 0));
         }
         else
         {
            AV19GridCurrentPage = localUtil.ctol( httpContext.cgiGet( edtavGridcurrentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19GridCurrentPage), 10, 0));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         AV21CliCod1 = (int)(localUtil.ctol( httpContext.cgiGet( "GXH_vCLICOD1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21CliCod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21CliCod1), 6, 0));
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vALBRFEN1"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV15AlbRFen1)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vALBRFEN2"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV16AlbRFen2)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLICOD1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV21CliCod1 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vALBREF1"), AV12AlbRef1) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vALBREFDSC1"), AV13AlbRefDsc1) != 0 )
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
      e14CO2 ();
      if (returnInSub) return;
   }

   public void e14CO2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV26Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      selecciontablaalbrec_impl.this.GXt_char1 = GXv_char2[0] ;
      AV26Station = GXt_char1 ;
      GXv_char2[0] = AV27Emprcod ;
      GXv_char3[0] = AV28Emprnom ;
      GXv_char4[0] = AV29Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV26Station, GXv_char2, GXv_char3, GXv_char4) ;
      selecciontablaalbrec_impl.this.AV27Emprcod = GXv_char2[0] ;
      selecciontablaalbrec_impl.this.AV28Emprnom = GXv_char3[0] ;
      selecciontablaalbrec_impl.this.AV29Usurcod = GXv_char4[0] ;
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      AV19GridCurrentPage = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19GridCurrentPage), 10, 0));
      edtavGridcurrentpage_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGridcurrentpage_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGridcurrentpage_Visible), 5, 0), true);
      AV20GridPageCount = -1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20GridPageCount), 10, 0));
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      AV16AlbRFen2 = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16AlbRFen2", localUtil.format(AV16AlbRFen2, "99/99/99"));
      AV21CliCod1 = AV23Clicodin ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21CliCod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21CliCod1), 6, 0));
      /* Using cursor H00CO7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV21CliCod1)});
      hV21CliCod1 = "" ;
      while ( (pr_default.getStatus(5) != 101) )
      {
         hV21CliCod1 = H00CO7_A279CliNom[0] ;
         if (true) break;
      }
      pr_default.close(5);
      httpContext.ajax_rsp_assign_attri("", false, "hV21CliCod1", hV21CliCod1);
   }

   public void e15CO2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
   }

   private void e16CO2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV22AlbRecCod1 = A44AlbRecCod ;
      httpContext.ajax_rsp_assign_attri("", false, edtavAlbreccod1_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22AlbRecCod1), 8, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBRECCOD1"+"_"+sGXsfl_58_idx, getSecureSignedToken( sGXsfl_58_idx, localUtil.format( DecimalUtil.doubleToDec(AV22AlbRecCod1), "ZZZZZZZ9")));
      AV6AlbRef = A45AlbRef ;
      httpContext.ajax_rsp_assign_attri("", false, edtavAlbref_Internalname, AV6AlbRef);
      AV7AlbRefDsc = A3613AlbRefDsc ;
      httpContext.ajax_rsp_assign_attri("", false, edtavAlbrefdsc_Internalname, AV7AlbRefDsc);
      AV8AlbRFen = A49AlbRFen ;
      httpContext.ajax_rsp_assign_attri("", false, edtavAlbrfen_Internalname, localUtil.format(AV8AlbRFen, "99/99/99"));
      AV11AlbRPieDis = A51AlbRPieDis ;
      httpContext.ajax_rsp_assign_attri("", false, edtavAlbrpiedis_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11AlbRPieDis), 6, 0));
      AV10AlbRUni = A56AlbRUni ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavAlbruni.getInternalname(), AV10AlbRUni);
      AV9AlbRUniDis = A57AlbRUniDis ;
      httpContext.ajax_rsp_assign_attri("", false, edtavAlbrunidis_Internalname, GXutil.ltrimstr( AV9AlbRUniDis, 9, 2));
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(58) ;
      }
      sendrow_582( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_58_Refreshing )
      {
         httpContext.doAjaxLoad(58, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavAlbruni.setValue( GXutil.rtrim( AV10AlbRUni) );
   }

   public void e11CO2( )
   {
      /* Gridpaginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gridpaginationbar_Selectedpage, "Previous") == 0 )
      {
         AV19GridCurrentPage = (long)(AV19GridCurrentPage-1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19GridCurrentPage), 10, 0));
         subgrid_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Gridpaginationbar_Selectedpage, "Next") == 0 )
      {
         AV19GridCurrentPage = (long)(AV19GridCurrentPage+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19GridCurrentPage), 10, 0));
         subgrid_nextpage( ) ;
      }
      else
      {
         AV18PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         AV19GridCurrentPage = AV18PageToGo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19GridCurrentPage), 10, 0));
         subgrid_gotopage( AV18PageToGo) ;
      }
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e12CO2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      AV19GridCurrentPage = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19GridCurrentPage), 10, 0));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e13CO2( )
   {
      /* 'DoConfirmar' Routine */
      returnInSub = false ;
      AV5AlbReccod = AV22AlbRecCod1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5AlbReccod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5AlbReccod), 8, 0));
      httpContext.setWebReturnParms(new Object[] {Integer.valueOf(AV5AlbReccod)});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV5AlbReccod"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e17CO2 ();
      if (returnInSub) return;
   }

   public void e17CO2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      AV5AlbReccod = AV22AlbRecCod1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5AlbReccod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5AlbReccod), 8, 0));
      httpContext.setWebReturnParms(new Object[] {Integer.valueOf(AV5AlbReccod)});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV5AlbReccod"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   public void wb_table3_73_CO2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable3_Internalname, tblUnnamedtable3_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 58, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 5, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCONFIRMAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SeleccionTablaAlbrec.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_73_CO2e( true) ;
      }
      else
      {
         wb_table3_73_CO2e( false) ;
      }
   }

   public void wb_table2_50_CO2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable2_Internalname, tblUnnamedtable2_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "HasGridEmpowerer", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol58( ) ;
      }
      if ( wbEnd == 58 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_58 = (int)(nGXsfl_58_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV19GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV20GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, "GRIDPAGINATIONBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_50_CO2e( true) ;
      }
      else
      {
         wb_table2_50_CO2e( false) ;
      }
   }

   public void wb_table1_17_CO2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable1_Internalname, tblUnnamedtable1_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbrfen1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbrfen1_Internalname, httpContext.getMessage( "Fecha Entrada", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'" + sGXsfl_58_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavAlbrfen1_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbrfen1_Internalname, localUtil.format(AV15AlbRFen1, "99/99/99"), localUtil.format( AV15AlbRFen1, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,24);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbrfen1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbrfen1_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_SeleccionTablaAlbrec.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavAlbrfen1_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavAlbrfen1_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_SeleccionTablaAlbrec.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbrfen2_Internalname, httpContext.getMessage( "Alb RFen2", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'" + sGXsfl_58_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavAlbrfen2_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbrfen2_Internalname, localUtil.format(AV16AlbRFen2, "99/99/99"), localUtil.format( AV16AlbRFen2, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,27);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbrfen2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbrfen2_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_SeleccionTablaAlbrec.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavAlbrfen2_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavAlbrfen2_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_SeleccionTablaAlbrec.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicod1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicod1_Internalname, httpContext.getMessage( "Cliente", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'" + sGXsfl_58_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod1_Internalname, GXutil.rtrim( hV21CliCod1), GXutil.rtrim( localUtil.format( hV21CliCod1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod1_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_SeleccionTablaAlbrec.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbref1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbref1_Internalname, httpContext.getMessage( "Referencia", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_58_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbref1_Internalname, GXutil.rtrim( AV12AlbRef1), GXutil.rtrim( localUtil.format( AV12AlbRef1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbref1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbref1_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_SeleccionTablaAlbrec.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbrefdsc1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbrefdsc1_Internalname, httpContext.getMessage( "Descripcion ", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'" + sGXsfl_58_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbrefdsc1_Internalname, GXutil.rtrim( AV13AlbRefDsc1), GXutil.rtrim( localUtil.format( AV13AlbRefDsc1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbrefdsc1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbrefdsc1_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_SeleccionTablaAlbrec.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_17_CO2e( true) ;
      }
      else
      {
         wb_table1_17_CO2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      AV23Clicodin = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Clicodin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Clicodin), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICODIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV23Clicodin), "ZZZZZ9")));
      AV5AlbReccod = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5AlbReccod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5AlbReccod), 8, 0));
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
      paCO2( ) ;
      wsCO2( ) ;
      weCO2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026610164105", true, true);
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
      httpContext.AddJavascriptSource("selecciontablaalbrec.js", "?2026610164105", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_582( )
   {
      edtavAlbreccod1_Internalname = "vALBRECCOD1_"+sGXsfl_58_idx ;
      edtavAlbref_Internalname = "vALBREF_"+sGXsfl_58_idx ;
      edtavAlbrefdsc_Internalname = "vALBREFDSC_"+sGXsfl_58_idx ;
      edtavAlbrfen_Internalname = "vALBRFEN_"+sGXsfl_58_idx ;
      edtavAlbrunidis_Internalname = "vALBRUNIDIS_"+sGXsfl_58_idx ;
      cmbavAlbruni.setInternalname( "vALBRUNI_"+sGXsfl_58_idx );
      edtavAlbrpiedis_Internalname = "vALBRPIEDIS_"+sGXsfl_58_idx ;
   }

   public void subsflControlProps_fel_582( )
   {
      edtavAlbreccod1_Internalname = "vALBRECCOD1_"+sGXsfl_58_fel_idx ;
      edtavAlbref_Internalname = "vALBREF_"+sGXsfl_58_fel_idx ;
      edtavAlbrefdsc_Internalname = "vALBREFDSC_"+sGXsfl_58_fel_idx ;
      edtavAlbrfen_Internalname = "vALBRFEN_"+sGXsfl_58_fel_idx ;
      edtavAlbrunidis_Internalname = "vALBRUNIDIS_"+sGXsfl_58_fel_idx ;
      cmbavAlbruni.setInternalname( "vALBRUNI_"+sGXsfl_58_fel_idx );
      edtavAlbrpiedis_Internalname = "vALBRPIEDIS_"+sGXsfl_58_fel_idx ;
   }

   public void sendrow_582( )
   {
      subsflControlProps_582( ) ;
      wbCO0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_58_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_58_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_58_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlbreccod1_Internalname,GXutil.ltrim( localUtil.ntoc( AV22AlbRecCod1, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAlbreccod1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV22AlbRecCod1), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV22AlbRecCod1), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAlbreccod1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavAlbreccod1_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(58),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlbref_Internalname,GXutil.rtrim( AV6AlbRef),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAlbref_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavAlbref_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(58),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlbrefdsc_Internalname,GXutil.rtrim( AV7AlbRefDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAlbrefdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavAlbrefdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(58),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlbrfen_Internalname,localUtil.format(AV8AlbRFen, "99/99/99"),localUtil.format( AV8AlbRFen, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAlbrfen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavAlbrfen_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(58),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlbrunidis_Internalname,GXutil.ltrim( localUtil.ntoc( AV9AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAlbrunidis_Enabled!=0) ? localUtil.format( AV9AlbRUniDis, "ZZZZZ9.99") : localUtil.format( AV9AlbRUniDis, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAlbrunidis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavAlbrunidis_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(58),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( cmbavAlbruni.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vALBRUNI_" + sGXsfl_58_idx ;
            cmbavAlbruni.setName( GXCCtl );
            cmbavAlbruni.setWebtags( "" );
            cmbavAlbruni.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
            cmbavAlbruni.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
            if ( cmbavAlbruni.getItemCount() > 0 )
            {
               AV10AlbRUni = cmbavAlbruni.getValidValue(AV10AlbRUni) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavAlbruni.getInternalname(), AV10AlbRUni);
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavAlbruni,cmbavAlbruni.getInternalname(),GXutil.rtrim( AV10AlbRUni),Integer.valueOf(1),cmbavAlbruni.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(cmbavAlbruni.getEnabled()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavAlbruni.setValue( GXutil.rtrim( AV10AlbRUni) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlbruni.getInternalname(), "Values", cmbavAlbruni.ToJavascriptSource(), !bGXsfl_58_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlbrpiedis_Internalname,GXutil.ltrim( localUtil.ntoc( AV11AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAlbrpiedis_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV11AlbRPieDis), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV11AlbRPieDis), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAlbrpiedis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavAlbrpiedis_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(58),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashesCO2( ) ;
         GXCCtl = "GXHCvCLICOD1_" + sGXsfl_58_idx ;
         app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV21CliCod1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
         GridContainer.AddRow(GridRow);
         nGXsfl_58_idx = ((subGrid_Islastpage==1)&&(nGXsfl_58_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_58_idx+1) ;
         sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_582( ) ;
      }
      /* End function sendrow_582 */
   }

   public void startgridcontrol58( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"58\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Recepcion ID", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Referencia", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion ", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Entrada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidades Disponibles", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidad Medida", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas Disponibles", "")) ;
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
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV22AlbRecCod1, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlbreccod1_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV6AlbRef));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlbref_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV7AlbRefDsc));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlbrefdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(AV8AlbRFen, "99/99/99"));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlbrfen_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV9AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlbrunidis_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV10AlbRUni));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbavAlbruni.getEnabled(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV11AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlbrpiedis_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtavAlbrfen1_Internalname = "vALBRFEN1" ;
      edtavAlbrfen2_Internalname = "vALBRFEN2" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      edtavClicod1_Internalname = "vCLICOD1" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      edtavAlbref1_Internalname = "vALBREF1" ;
      edtavAlbrefdsc1_Internalname = "vALBREFDSC1" ;
      divUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
      tblUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      edtavAlbreccod1_Internalname = "vALBRECCOD1" ;
      edtavAlbref_Internalname = "vALBREF" ;
      edtavAlbrefdsc_Internalname = "vALBREFDSC" ;
      edtavAlbrfen_Internalname = "vALBRFEN" ;
      edtavAlbrunidis_Internalname = "vALBRUNIDIS" ;
      cmbavAlbruni.setInternalname( "vALBRUNI" );
      edtavAlbrpiedis_Internalname = "vALBRPIEDIS" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      tblUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      tblUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      Dvpanel_unnamedtable3_Internalname = "DVPANEL_UNNAMEDTABLE3" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavGridcurrentpage_Internalname = "vGRIDCURRENTPAGE" ;
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
      edtavAlbrpiedis_Jsonclick = "" ;
      edtavAlbrpiedis_Enabled = 0 ;
      cmbavAlbruni.setJsonclick( "" );
      cmbavAlbruni.setEnabled( 0 );
      edtavAlbrunidis_Jsonclick = "" ;
      edtavAlbrunidis_Enabled = 0 ;
      edtavAlbrfen_Jsonclick = "" ;
      edtavAlbrfen_Enabled = 0 ;
      edtavAlbrefdsc_Jsonclick = "" ;
      edtavAlbrefdsc_Enabled = 0 ;
      edtavAlbref_Jsonclick = "" ;
      edtavAlbref_Enabled = 0 ;
      edtavAlbreccod1_Jsonclick = "" ;
      edtavAlbreccod1_Enabled = 0 ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavAlbrefdsc1_Jsonclick = "" ;
      edtavAlbrefdsc1_Enabled = 1 ;
      edtavAlbref1_Jsonclick = "" ;
      edtavAlbref1_Enabled = 1 ;
      edtavClicod1_Jsonclick = "" ;
      edtavClicod1_Enabled = 1 ;
      edtavAlbrfen2_Jsonclick = "" ;
      edtavAlbrfen2_Enabled = 1 ;
      edtavAlbrfen1_Jsonclick = "" ;
      edtavAlbrfen1_Enabled = 1 ;
      edtavGridcurrentpage_Jsonclick = "" ;
      edtavGridcurrentpage_Visible = 1 ;
      Dvpanel_unnamedtable3_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Iconposition = "Right" ;
      Dvpanel_unnamedtable3_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Title = "" ;
      Dvpanel_unnamedtable3_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable3_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Width = "100%" ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = "" ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
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
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = "" ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Entradas Almacen", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vALBRUNI_" + sGXsfl_58_idx ;
      cmbavAlbruni.setName( GXCCtl );
      cmbavAlbruni.setWebtags( "" );
      cmbavAlbruni.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
      cmbavAlbruni.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
      if ( cmbavAlbruni.getItemCount() > 0 )
      {
         AV10AlbRUni = cmbavAlbruni.getValidValue(AV10AlbRUni) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavAlbruni.getInternalname(), AV10AlbRUni);
      }
      /* End function init_web_controls */
   }

   public void validv_Clicod1( )
   {
      if ( (GXutil.strcmp("", hV21CliCod1)==0) )
      {
         AV21CliCod1 = 0 ;
      }
      else
      {
         A279CliNom = hV21CliCod1 ;
         /* Using cursor H00CO8 */
         pr_default.execute(6, new Object[] {A279CliNom, A396EmprCod});
         AV21CliCod1 = H00CO8_A252CliCod[0] ;
         if ( ! ( (pr_default.getStatus(6) == 101) ) )
         {
            pr_default.readNext(6);
            if ( ! ( (pr_default.getStatus(6) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Nombre Cliente", "")}), 1, "vCLICOD1");
               GX_FocusControl = edtavClicod1_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(6);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV21CliCod1", hV21CliCod1);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV21CliCod1", GXutil.ltrim( localUtil.ntoc( AV21CliCod1, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "hV21CliCod1", GXutil.rtrim( hV21CliCod1));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15AlbRFen1',fld:'vALBRFEN1',pic:''},{av:'AV16AlbRFen2',fld:'vALBRFEN2',pic:''},{av:'AV21CliCod1',fld:'vCLICOD1',pic:'ZZZZZ9'},{av:'AV12AlbRef1',fld:'vALBREF1',pic:''},{av:'AV13AlbRefDsc1',fld:'vALBREFDSC1',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV23Clicodin',fld:'vCLICODIN',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("GRID.LOAD","{handler:'e16CO2',iparms:[{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'A3613AlbRefDsc',fld:'ALBREFDSC',pic:''},{av:'A49AlbRFen',fld:'ALBRFEN',pic:''},{av:'A51AlbRPieDis',fld:'ALBRPIEDIS',pic:'ZZZZZ9'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'A57AlbRUniDis',fld:'ALBRUNIDIS',pic:'ZZZZZ9.99'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV22AlbRecCod1',fld:'vALBRECCOD1',pic:'ZZZZZZZ9',hsh:true},{av:'AV6AlbRef',fld:'vALBREF',pic:''},{av:'AV7AlbRefDsc',fld:'vALBREFDSC',pic:''},{av:'AV8AlbRFen',fld:'vALBRFEN',pic:''},{av:'AV11AlbRPieDis',fld:'vALBRPIEDIS',pic:'ZZZZZ9'},{av:'cmbavAlbruni'},{av:'AV10AlbRUni',fld:'vALBRUNI',pic:'@!'},{av:'AV9AlbRUniDis',fld:'vALBRUNIDIS',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e11CO2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15AlbRFen1',fld:'vALBRFEN1',pic:''},{av:'AV16AlbRFen2',fld:'vALBRFEN2',pic:''},{av:'AV21CliCod1',fld:'vCLICOD1',pic:'ZZZZZ9'},{av:'AV12AlbRef1',fld:'vALBREF1',pic:''},{av:'AV13AlbRefDsc1',fld:'vALBREFDSC1',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV23Clicodin',fld:'vCLICODIN',pic:'ZZZZZ9',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'},{av:'AV19GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[{av:'AV19GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e12CO2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15AlbRFen1',fld:'vALBRFEN1',pic:''},{av:'AV16AlbRFen2',fld:'vALBRFEN2',pic:''},{av:'AV21CliCod1',fld:'vCLICOD1',pic:'ZZZZZ9'},{av:'AV12AlbRef1',fld:'vALBREF1',pic:''},{av:'AV13AlbRefDsc1',fld:'vALBREFDSC1',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV23Clicodin',fld:'vCLICODIN',pic:'ZZZZZ9',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV19GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e13CO2',iparms:[{av:'AV22AlbRecCod1',fld:'vALBRECCOD1',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{av:'AV5AlbReccod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'}]}");
      setEventMetadata("ENTER","{handler:'e17CO2',iparms:[{av:'AV22AlbRecCod1',fld:'vALBRECCOD1',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV5AlbReccod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'}]}");
      setEventMetadata("VALIDV_CLICOD1","{handler:'validv_Clicod1',iparms:[{av:'hV21CliCod1'},{av:'AV21CliCod1',fld:'vCLICOD1',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("VALIDV_CLICOD1",",oparms:[{av:'AV21CliCod1',fld:'vCLICOD1',pic:'ZZZZZ9'},{av:'hV21CliCod1'}]}");
      setEventMetadata("VALIDV_ALBRUNI","{handler:'validv_Albruni',iparms:[]");
      setEventMetadata("VALIDV_ALBRUNI",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Albrpiedis',iparms:[]");
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
      wcpOA396EmprCod = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A279CliNom = "" ;
      hV21CliCod1 = "" ;
      AV15AlbRFen1 = GXutil.nullDate() ;
      AV16AlbRFen2 = GXutil.nullDate() ;
      AV12AlbRef1 = "" ;
      AV13AlbRefDsc1 = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      A45AlbRef = "" ;
      A3613AlbRefDsc = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A56AlbRUni = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable3 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV6AlbRef = "" ;
      AV7AlbRefDsc = "" ;
      AV8AlbRFen = GXutil.nullDate() ;
      AV9AlbRUniDis = DecimalUtil.ZERO ;
      AV10AlbRUni = "" ;
      GXCCtl = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      l279CliNom = "" ;
      H00CO2_A279CliNom = new String[] {""} ;
      H00CO3_A279CliNom = new String[] {""} ;
      H00CO3_A396EmprCod = new String[] {""} ;
      H00CO3_A252CliCod = new int[1] ;
      lV12AlbRef1 = "" ;
      lV13AlbRefDsc1 = "" ;
      H00CO4_A396EmprCod = new String[] {""} ;
      H00CO4_A47AlbREst = new byte[1] ;
      H00CO4_A252CliCod = new int[1] ;
      H00CO4_A44AlbRecCod = new int[1] ;
      H00CO4_A45AlbRef = new String[] {""} ;
      H00CO4_A3613AlbRefDsc = new String[] {""} ;
      H00CO4_A56AlbRUni = new String[] {""} ;
      H00CO4_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      H00CO4_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00CO4_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00CO4_A54AlbRPieUti = new int[1] ;
      H00CO4_A52AlbRPieEnt = new int[1] ;
      H00CO5_AGRID_nRecordCount = new long[1] ;
      H00CO6_A279CliNom = new String[] {""} ;
      H00CO6_A396EmprCod = new String[] {""} ;
      H00CO6_A252CliCod = new int[1] ;
      AV26Station = "" ;
      GXt_char1 = "" ;
      AV27Emprcod = "" ;
      GXv_char2 = new String[1] ;
      AV28Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV29Usurcod = "" ;
      GXv_char4 = new String[1] ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      H00CO7_A279CliNom = new String[] {""} ;
      H00CO7_A396EmprCod = new String[] {""} ;
      H00CO7_A252CliCod = new int[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      bttBtnconfirmar_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      H00CO8_A279CliNom = new String[] {""} ;
      H00CO8_A396EmprCod = new String[] {""} ;
      H00CO8_A252CliCod = new int[1] ;
      ZhV21CliCod1 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.selecciontablaalbrec__default(),
         new Object[] {
             new Object[] {
            H00CO2_A279CliNom
            }
            , new Object[] {
            H00CO3_A279CliNom, H00CO3_A396EmprCod, H00CO3_A252CliCod
            }
            , new Object[] {
            H00CO4_A396EmprCod, H00CO4_A47AlbREst, H00CO4_A252CliCod, H00CO4_A44AlbRecCod, H00CO4_A45AlbRef, H00CO4_A3613AlbRefDsc, H00CO4_A56AlbRUni, H00CO4_A49AlbRFen, H00CO4_A60AlbRUniUti, H00CO4_A58AlbRUniEnt,
            H00CO4_A54AlbRPieUti, H00CO4_A52AlbRPieEnt
            }
            , new Object[] {
            H00CO5_AGRID_nRecordCount
            }
            , new Object[] {
            H00CO6_A279CliNom, H00CO6_A396EmprCod, H00CO6_A252CliCod
            }
            , new Object[] {
            H00CO7_A279CliNom, H00CO7_A396EmprCod, H00CO7_A252CliCod
            }
            , new Object[] {
            H00CO8_A279CliNom, H00CO8_A396EmprCod, H00CO8_A252CliCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavAlbreccod1_Enabled = 0 ;
      edtavAlbref_Enabled = 0 ;
      edtavAlbrefdsc_Enabled = 0 ;
      edtavAlbrfen_Enabled = 0 ;
      edtavAlbrunidis_Enabled = 0 ;
      cmbavAlbruni.setEnabled( 0 );
      edtavAlbrpiedis_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GRID_nEOF ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte A47AlbREst ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short gxhchits ;
   private short Gx_err ;
   private int wcpOAV23Clicodin ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_58 ;
   private int subGrid_Rows ;
   private int AV23Clicodin ;
   private int AV5AlbReccod ;
   private int nGXsfl_58_idx=1 ;
   private int AV21CliCod1 ;
   private int A44AlbRecCod ;
   private int A52AlbRPieEnt ;
   private int A54AlbRPieUti ;
   private int A51AlbRPieDis ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavGridcurrentpage_Visible ;
   private int AV22AlbRecCod1 ;
   private int AV11AlbRPieDis ;
   private int gxdynajaxindex ;
   private int A252CliCod ;
   private int subGrid_Islastpage ;
   private int edtavAlbreccod1_Enabled ;
   private int edtavAlbref_Enabled ;
   private int edtavAlbrefdsc_Enabled ;
   private int edtavAlbrfen_Enabled ;
   private int edtavAlbrunidis_Enabled ;
   private int edtavAlbrpiedis_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV18PageToGo ;
   private int edtavAlbrfen1_Enabled ;
   private int edtavAlbrfen2_Enabled ;
   private int edtavClicod1_Enabled ;
   private int edtavAlbref1_Enabled ;
   private int edtavAlbrefdsc1_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private int ZV21CliCod1 ;
   private long GRID_nFirstRecordOnPage ;
   private long AV20GridPageCount ;
   private long AV19GridCurrentPage ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal AV9AlbRUniDis ;
   private String wcpOA396EmprCod ;
   private String Gridpaginationbar_Selectedpage ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A279CliNom ;
   private String hV21CliCod1 ;
   private String sGXsfl_58_idx="0001" ;
   private String AV12AlbRef1 ;
   private String AV13AlbRefDsc1 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A45AlbRef ;
   private String A3613AlbRefDsc ;
   private String A56AlbRUni ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
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
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String Dvpanel_unnamedtable3_Width ;
   private String Dvpanel_unnamedtable3_Cls ;
   private String Dvpanel_unnamedtable3_Title ;
   private String Dvpanel_unnamedtable3_Iconposition ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String Dvpanel_unnamedtable3_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String TempTags ;
   private String edtavGridcurrentpage_Internalname ;
   private String edtavGridcurrentpage_Jsonclick ;
   private String Grid_empowerer_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavAlbreccod1_Internalname ;
   private String AV6AlbRef ;
   private String edtavAlbref_Internalname ;
   private String AV7AlbRefDsc ;
   private String edtavAlbrefdsc_Internalname ;
   private String edtavAlbrfen_Internalname ;
   private String edtavAlbrunidis_Internalname ;
   private String AV10AlbRUni ;
   private String edtavAlbrpiedis_Internalname ;
   private String GXCCtl ;
   private String edtavAlbrfen1_Internalname ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String l279CliNom ;
   private String lV12AlbRef1 ;
   private String lV13AlbRefDsc1 ;
   private String edtavAlbrfen2_Internalname ;
   private String edtavClicod1_Internalname ;
   private String edtavAlbref1_Internalname ;
   private String edtavAlbrefdsc1_Internalname ;
   private String AV26Station ;
   private String GXt_char1 ;
   private String AV27Emprcod ;
   private String GXv_char2[] ;
   private String AV28Emprnom ;
   private String GXv_char3[] ;
   private String AV29Usurcod ;
   private String GXv_char4[] ;
   private String Gridpaginationbar_Internalname ;
   private String tblUnnamedtable3_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String tblUnnamedtable2_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String tblUnnamedtable1_Internalname ;
   private String divUnnamedtable6_Internalname ;
   private String edtavAlbrfen1_Jsonclick ;
   private String edtavAlbrfen2_Jsonclick ;
   private String divUnnamedtable7_Internalname ;
   private String edtavClicod1_Jsonclick ;
   private String divUnnamedtable8_Internalname ;
   private String edtavAlbref1_Jsonclick ;
   private String edtavAlbrefdsc1_Jsonclick ;
   private String sGXsfl_58_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavAlbreccod1_Jsonclick ;
   private String edtavAlbref_Jsonclick ;
   private String edtavAlbrefdsc_Jsonclick ;
   private String edtavAlbrfen_Jsonclick ;
   private String edtavAlbrunidis_Jsonclick ;
   private String edtavAlbrpiedis_Jsonclick ;
   private String subGrid_Header ;
   private String ZhV21CliCod1 ;
   private java.util.Date AV15AlbRFen1 ;
   private java.util.Date AV16AlbRFen2 ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date AV8AlbRFen ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Gridpaginationbar_Showfirst ;
   private boolean Gridpaginationbar_Showprevious ;
   private boolean Gridpaginationbar_Shownext ;
   private boolean Gridpaginationbar_Showlast ;
   private boolean Gridpaginationbar_Rowsperpageselector ;
   private boolean Dvpanel_unnamedtable2_Autowidth ;
   private boolean Dvpanel_unnamedtable2_Autoheight ;
   private boolean Dvpanel_unnamedtable2_Collapsible ;
   private boolean Dvpanel_unnamedtable2_Collapsed ;
   private boolean Dvpanel_unnamedtable2_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable2_Autoscroll ;
   private boolean Dvpanel_unnamedtable3_Autowidth ;
   private boolean Dvpanel_unnamedtable3_Autoheight ;
   private boolean Dvpanel_unnamedtable3_Collapsible ;
   private boolean Dvpanel_unnamedtable3_Collapsed ;
   private boolean Dvpanel_unnamedtable3_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable3_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_58_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable3 ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private HTMLChoice cmbavAlbruni ;
   private IDataStoreProvider pr_default ;
   private String[] H00CO2_A279CliNom ;
   private String[] H00CO3_A279CliNom ;
   private String[] H00CO3_A396EmprCod ;
   private int[] H00CO3_A252CliCod ;
   private String[] H00CO4_A396EmprCod ;
   private byte[] H00CO4_A47AlbREst ;
   private int[] H00CO4_A252CliCod ;
   private int[] H00CO4_A44AlbRecCod ;
   private String[] H00CO4_A45AlbRef ;
   private String[] H00CO4_A3613AlbRefDsc ;
   private String[] H00CO4_A56AlbRUni ;
   private java.util.Date[] H00CO4_A49AlbRFen ;
   private java.math.BigDecimal[] H00CO4_A60AlbRUniUti ;
   private java.math.BigDecimal[] H00CO4_A58AlbRUniEnt ;
   private int[] H00CO4_A54AlbRPieUti ;
   private int[] H00CO4_A52AlbRPieEnt ;
   private long[] H00CO5_AGRID_nRecordCount ;
   private String[] H00CO6_A279CliNom ;
   private String[] H00CO6_A396EmprCod ;
   private int[] H00CO6_A252CliCod ;
   private String[] H00CO7_A279CliNom ;
   private String[] H00CO7_A396EmprCod ;
   private int[] H00CO7_A252CliCod ;
   private String[] H00CO8_A279CliNom ;
   private String[] H00CO8_A396EmprCod ;
   private int[] H00CO8_A252CliCod ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class selecciontablaalbrec__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00CO2", "SELECT * FROM (SELECT DISTINCT CliNom FROM TXPCLIENT WHERE (EmprCod = ?) AND (UPPER(CliNom) like '%' || UPPER(?)) ORDER BY CliNom) WHERE rownum <= 5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00CO3", "SELECT CliNom, EmprCod, CliCod FROM TXPCLIENT WHERE (CliNom = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00CO4", "SELECT EmprCod, AlbREst, CliCod, AlbRecCod, AlbRef, AlbRefDsc, AlbRUni, AlbRFen, AlbRUniUti, AlbRUniEnt, AlbRPieUti, AlbRPieEnt FROM TXPALBREC WHERE (EmprCod = ? and AlbRFen <= ?) AND (AlbREst = 0) AND (CliCod = ?) AND (AlbRef like ?) AND (AlbRefDsc like ?) AND (AlbRFen >= ?) ORDER BY EmprCod, AlbRFen DESC  OFFSET ? ROWS FETCH NEXT (CASE WHEN ? > 0 THEN ? ELSE 1e9 END) ROWS ONLY",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00CO5", "SELECT COUNT(*) FROM TXPALBREC WHERE (EmprCod = ? and AlbRFen <= ?) AND (AlbREst = 0) AND (CliCod = ?) AND (AlbRef like ?) AND (AlbRefDsc like ?) AND (AlbRFen >= ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00CO6", "SELECT CliNom, EmprCod, CliCod FROM TXPCLIENT WHERE (CliNom = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00CO7", "SELECT CliNom, EmprCod, CliCod FROM TXPCLIENT WHERE (EmprCod = ?) AND (CliCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00CO8", "SELECT CliNom, EmprCod, CliCod FROM TXPCLIENT WHERE (CliNom = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
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
               stmt.setString(2, (String)parms[1], 30);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 30);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setString(5, (String)parms[4], 26);
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setString(5, (String)parms[4], 26);
               stmt.setDate(6, (java.util.Date)parms[5]);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 30);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 30);
               stmt.setString(2, (String)parms[1], 3);
               return;
      }
   }

}

