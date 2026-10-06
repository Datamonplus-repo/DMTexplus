package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class productosfunciontablaalcali_impl extends GXDataArea
{
   public productosfunciontablaalcali_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public productosfunciontablaalcali_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( productosfunciontablaalcali_impl.class ));
   }

   public productosfunciontablaalcali_impl( int remoteHandle ,
                                            ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
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
            AV6EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6EmprCod", AV6EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV5Lb_TaAuxC = httpContext.GetPar( "Lb_TaAuxC") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV5Lb_TaAuxC", AV5Lb_TaAuxC);
               AV7ForCanSum = CommonUtil.decimalVal( httpContext.GetPar( "ForCanSum"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7ForCanSum", GXutil.ltrimstr( AV7ForCanSum, 11, 5));
               AV8ForNumCol = (int)(GXutil.lval( httpContext.GetPar( "ForNumCol"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8ForNumCol), 8, 0));
               AV9Lb_fam1 = (byte)(GXutil.lval( httpContext.GetPar( "Lb_fam1"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9Lb_fam1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Lb_fam1), 2, 0));
               AV10Lb_fam2 = (byte)(GXutil.lval( httpContext.GetPar( "Lb_fam2"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10Lb_fam2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Lb_fam2), 2, 0));
               AV11Lb_fam3 = (byte)(GXutil.lval( httpContext.GetPar( "Lb_fam3"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11Lb_fam3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11Lb_fam3), 2, 0));
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
      nRC_GXsfl_68 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_68"))) ;
      nGXsfl_68_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_68_idx"))) ;
      sGXsfl_68_idx = httpContext.GetPar( "sGXsfl_68_idx") ;
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
      AV6EmprCod = httpContext.GetPar( "EmprCod") ;
      AV5Lb_TaAuxC = httpContext.GetPar( "Lb_TaAuxC") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A6310Lb_TaAuxC = httpContext.GetPar( "Lb_TaAuxC") ;
      A6313lb_TaAuxL = (short)(GXutil.lval( httpContext.GetPar( "lb_TaAuxL"))) ;
      A6378Lb_TauxLP = (short)(GXutil.lval( httpContext.GetPar( "Lb_TauxLP"))) ;
      AV29lb_TaAuxL = (short)(GXutil.lval( httpContext.GetPar( "lb_TaAuxL"))) ;
      A719PrdNum = httpContext.GetPar( "PrdNum") ;
      A718PrdNom = httpContext.GetPar( "PrdNom") ;
      A6316Lb_TaAuxCt = CommonUtil.decimalVal( httpContext.GetPar( "Lb_TaAuxCt"), ".") ;
      A488ForPrdDsc = httpContext.GetPar( "ForPrdDsc") ;
      n488ForPrdDsc = false ;
      A490ForPrdUMe = (byte)(GXutil.lval( httpContext.GetPar( "ForPrdUMe"))) ;
      A6317Lb_TauxOrd = (short)(GXutil.lval( httpContext.GetPar( "Lb_TauxOrd"))) ;
      AV12Lprfor = (short)(GXutil.lval( httpContext.GetPar( "Lprfor"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV6EmprCod, AV5Lb_TaAuxC, A396EmprCod, A6310Lb_TaAuxC, A6313lb_TaAuxL, A6378Lb_TauxLP, AV29lb_TaAuxL, A719PrdNum, A718PrdNom, A6316Lb_TaAuxCt, A488ForPrdDsc, A490ForPrdUMe, A6317Lb_TauxOrd, AV12Lprfor) ;
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
      pa1G32( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1G32( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = ((nGXWrapped==0) ? " data-HasEnter=\"false\" data-Skiponenter=\"true\"" : "") ;
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
      if ( nGXWrapped != 1 )
      {
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.productosfunciontablaalcali", new String[] {GXutil.URLEncode(GXutil.rtrim(AV6EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV5Lb_TaAuxC)),GXutil.URLEncode(DecimalUtil.decToString(AV7ForCanSum)),GXutil.URLEncode(GXutil.ltrimstr(AV8ForNumCol,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9Lb_fam1,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10Lb_fam2,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11Lb_fam3,2,0))}, new String[] {"EmprCod","Lb_TaAuxC","ForCanSum","ForNumCol","Lb_fam1","Lb_fam2","Lb_fam3"}) +"\">") ;
         app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
         app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
         app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
         httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
         httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "form-horizontal Form", true);
      }
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
   }

   public void send_integrity_footer_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLB_TAAUXL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV29lb_TaAuxL), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLPRFOR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12Lprfor), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_68", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_68, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV28GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV6EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_TAAUXC", GXutil.rtrim( A6310Lb_TaAuxC));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_TAAUXL", GXutil.ltrim( localUtil.ntoc( A6313lb_TaAuxL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_TAUXLP", GXutil.ltrim( localUtil.ntoc( A6378Lb_TauxLP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vLB_TAAUXL", GXutil.ltrim( localUtil.ntoc( AV29lb_TaAuxL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLB_TAAUXL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV29lb_TaAuxL), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNUM", GXutil.rtrim( A719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNOM", GXutil.rtrim( A718PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_TAAUXCT", GXutil.ltrim( localUtil.ntoc( A6316Lb_TaAuxCt, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDDSC", GXutil.rtrim( A488ForPrdDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDUME", GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_TAUXORD", GXutil.ltrim( localUtil.ntoc( A6317Lb_TauxOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vLPRFOR", GXutil.ltrim( localUtil.ntoc( AV12Lprfor, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLPRFOR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12Lprfor), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORNUMCOL", GXutil.ltrim( localUtil.ntoc( AV8ForNumCol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Title", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
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
      if ( nGXWrapped != 1 )
      {
         httpContext.writeTextNL( "</form>") ;
      }
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
         we1G32( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1G32( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return false ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("app.formulaciontinte.productosfunciontablaalcali", new String[] {GXutil.URLEncode(GXutil.rtrim(AV6EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV5Lb_TaAuxC)),GXutil.URLEncode(DecimalUtil.decToString(AV7ForCanSum)),GXutil.URLEncode(GXutil.ltrimstr(AV8ForNumCol,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9Lb_fam1,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10Lb_fam2,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11Lb_fam3,2,0))}, new String[] {"EmprCod","Lb_TaAuxC","ForCanSum","ForNumCol","Lb_fam1","Lb_fam2","Lb_fam3"})  ;
   }

   public String getPgmname( )
   {
      return "FormulacionTinte.ProductosfuncionTablaAlcali" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Productos en funcion de Tabla Alcali", "") ;
   }

   public void wb1G30( )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavLb_taauxc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLb_taauxc_Internalname, httpContext.getMessage( "Codigo Tabla", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLb_taauxc_Internalname, GXutil.rtrim( AV5Lb_TaAuxC), GXutil.rtrim( localUtil.format( AV5Lb_TaAuxC, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLb_taauxc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLb_taauxc_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProductosfuncionTablaAlcali.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavLb_taauxd_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLb_taauxd_Internalname, httpContext.getMessage( "Tabla Auxiliares", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'" + sGXsfl_68_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLb_taauxd_Internalname, GXutil.rtrim( AV17Lb_TaAuxD), GXutil.rtrim( localUtil.format( AV17Lb_TaAuxD, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLb_taauxd_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLb_taauxd_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProductosfuncionTablaAlcali.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavForcansum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavForcansum_Internalname, httpContext.getMessage( "Cantidad de Colorante", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavForcansum_Internalname, GXutil.ltrim( localUtil.ntoc( AV7ForCanSum, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavForcansum_Enabled!=0) ? localUtil.format( AV7ForCanSum, "ZZZZ9.99999") : localUtil.format( AV7ForCanSum, "ZZZZ9.99999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavForcansum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavForcansum_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProductosfuncionTablaAlcali.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavLb_taauxci_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLb_taauxci_Internalname, httpContext.getMessage( "Cant Ini ", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_68_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLb_taauxci_Internalname, GXutil.ltrim( localUtil.ntoc( AV15Lb_TaAuxCi, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavLb_taauxci_Enabled!=0) ? localUtil.format( AV15Lb_TaAuxCi, "ZZZZ9.99999") : localUtil.format( AV15Lb_TaAuxCi, "ZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLb_taauxci_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLb_taauxci_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProductosfuncionTablaAlcali.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavLb_taauxcf_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLb_taauxcf_Internalname, httpContext.getMessage( "Cant Fin", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'" + sGXsfl_68_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLb_taauxcf_Internalname, GXutil.ltrim( localUtil.ntoc( AV14Lb_TaAuxCf, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavLb_taauxcf_Enabled!=0) ? localUtil.format( AV14Lb_TaAuxCf, "ZZZZ9.99999") : localUtil.format( AV14Lb_TaAuxCf, "ZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLb_taauxcf_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLb_taauxcf_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProductosfuncionTablaAlcali.htm");
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
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup6_Internalname, httpContext.getMessage( "Familia Colorantes", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_FormulacionTinte\\ProductosfuncionTablaAlcali.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavLb_fam1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLb_fam1_Internalname, "1", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLb_fam1_Internalname, GXutil.ltrim( localUtil.ntoc( AV9Lb_fam1, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavLb_fam1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV9Lb_fam1), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV9Lb_fam1), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLb_fam1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLb_fam1_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProductosfuncionTablaAlcali.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavLb_fam2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLb_fam2_Internalname, "2", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLb_fam2_Internalname, GXutil.ltrim( localUtil.ntoc( AV10Lb_fam2, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavLb_fam2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV10Lb_fam2), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV10Lb_fam2), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLb_fam2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLb_fam2_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProductosfuncionTablaAlcali.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavLb_fam3_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLb_fam3_Internalname, "3", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLb_fam3_Internalname, GXutil.ltrim( localUtil.ntoc( AV11Lb_fam3, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavLb_fam3_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV11Lb_fam3), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV11Lb_fam3), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLb_fam3_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLb_fam3_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProductosfuncionTablaAlcali.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol68( ) ;
      }
      if ( wbEnd == 68 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_68 = (int)(nGXsfl_68_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV27GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV28GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, "GRIDPAGINATIONBARContainer");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 68, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 7, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e111g31_client"+"'", TempTags, "", 2, "HLP_FormulacionTinte\\ProductosfuncionTablaAlcali.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 68, 2, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ProductosfuncionTablaAlcali.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'" + sGXsfl_68_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavGridcurrentpage_Internalname, GXutil.ltrim( localUtil.ntoc( AV27GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV27GridCurrentPage), "ZZZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavGridcurrentpage_Jsonclick, 0, "Attribute", "", "", "", "", edtavGridcurrentpage_Visible, 1, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProductosfuncionTablaAlcali.htm");
         wb_table1_95_1G32( true) ;
      }
      else
      {
         wb_table1_95_1G32( false) ;
      }
      return  ;
   }

   public void wb_table1_95_1G32e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 68 )
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

   public void start1G32( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Productos en funcion de Tabla Alcali", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1G30( ) ;
   }

   public void ws1G32( )
   {
      start1G32( ) ;
      evt1G32( ) ;
   }

   public void evt1G32( )
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
                           e121G32 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131G32 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e141G32 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e151G32 ();
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
                           nGXsfl_68_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_682( ) ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavLb_tauxlp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavLb_tauxlp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vLB_TAUXLP");
                              GX_FocusControl = edtavLb_tauxlp_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV18Lb_TauxLP = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavLb_tauxlp_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Lb_TauxLP), 4, 0));
                           }
                           else
                           {
                              AV18Lb_TauxLP = (short)(localUtil.ctol( httpContext.cgiGet( edtavLb_tauxlp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavLb_tauxlp_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Lb_TauxLP), 4, 0));
                           }
                           AV20PrdNum = httpContext.cgiGet( edtavPrdnum_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavPrdnum_Internalname, AV20PrdNum);
                           AV21PrdNom = httpContext.cgiGet( edtavPrdnom_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavPrdnom_Internalname, AV21PrdNom);
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavLb_taauxct_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavLb_taauxct_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vLB_TAAUXCT");
                              GX_FocusControl = edtavLb_taauxct_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV16Lb_TaAuxCt = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavLb_taauxct_Internalname, GXutil.ltrimstr( AV16Lb_TaAuxCt, 11, 5));
                           }
                           else
                           {
                              AV16Lb_TaAuxCt = localUtil.ctond( httpContext.cgiGet( edtavLb_taauxct_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavLb_taauxct_Internalname, GXutil.ltrimstr( AV16Lb_TaAuxCt, 11, 5));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavForprdume_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavForprdume_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFORPRDUME");
                              GX_FocusControl = edtavForprdume_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV23ForPrdUMe = (byte)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavForprdume_Internalname, GXutil.str( AV23ForPrdUMe, 1, 0));
                           }
                           else
                           {
                              AV23ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( edtavForprdume_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavForprdume_Internalname, GXutil.str( AV23ForPrdUMe, 1, 0));
                           }
                           AV22ForPrdDsc = httpContext.cgiGet( edtavForprddsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavForprddsc_Internalname, AV22ForPrdDsc);
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavLb_tauxord_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavLb_tauxord_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vLB_TAUXORD");
                              GX_FocusControl = edtavLb_tauxord_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV19Lb_TauxOrd = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavLb_tauxord_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Lb_TauxOrd), 4, 0));
                           }
                           else
                           {
                              AV19Lb_TauxOrd = (short)(localUtil.ctol( httpContext.cgiGet( edtavLb_tauxord_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavLb_tauxord_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Lb_TauxOrd), 4, 0));
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
                                 e161G32 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e171G32 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e181G32 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    if ( ! Rfr0gs )
                                    {
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

   public void we1G32( )
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

   public void pa1G32( )
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
            GX_FocusControl = edtavLb_taauxd_Internalname ;
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
      subsflControlProps_682( ) ;
      while ( nGXsfl_68_idx <= nRC_GXsfl_68 )
      {
         sendrow_682( ) ;
         nGXsfl_68_idx = ((subGrid_Islastpage==1)&&(nGXsfl_68_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_68_idx+1) ;
         sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_682( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV6EmprCod ,
                                 String AV5Lb_TaAuxC ,
                                 String A396EmprCod ,
                                 String A6310Lb_TaAuxC ,
                                 short A6313lb_TaAuxL ,
                                 short A6378Lb_TauxLP ,
                                 short AV29lb_TaAuxL ,
                                 String A719PrdNum ,
                                 String A718PrdNom ,
                                 java.math.BigDecimal A6316Lb_TaAuxCt ,
                                 String A488ForPrdDsc ,
                                 byte A490ForPrdUMe ,
                                 short A6317Lb_TauxOrd ,
                                 short AV12Lprfor )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e171G32 ();
      GRID_nCurrentRecord = 0 ;
      rf1G32( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
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
      rf1G32( ) ;
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
      edtavLb_taauxc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLb_taauxc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLb_taauxc_Enabled), 5, 0), true);
      edtavLb_taauxd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLb_taauxd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLb_taauxd_Enabled), 5, 0), true);
      edtavForcansum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavForcansum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavForcansum_Enabled), 5, 0), true);
      edtavLb_taauxci_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLb_taauxci_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLb_taauxci_Enabled), 5, 0), true);
      edtavLb_taauxcf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLb_taauxcf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLb_taauxcf_Enabled), 5, 0), true);
      edtavLb_fam1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLb_fam1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLb_fam1_Enabled), 5, 0), true);
      edtavLb_fam2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLb_fam2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLb_fam2_Enabled), 5, 0), true);
      edtavLb_fam3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLb_fam3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLb_fam3_Enabled), 5, 0), true);
      edtavLb_tauxlp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLb_tauxlp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLb_tauxlp_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavPrdnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrdnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdnum_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavPrdnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrdnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdnom_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavLb_taauxct_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLb_taauxct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLb_taauxct_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavForprdume_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavForprdume_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavForprdume_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavForprddsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavForprddsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavForprddsc_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavLb_tauxord_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLb_tauxord_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLb_tauxord_Enabled), 5, 0), !bGXsfl_68_Refreshing);
   }

   public void rf1G32( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(68) ;
      /* Execute user event: Refresh */
      e171G32 ();
      nGXsfl_68_idx = 1 ;
      sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_682( ) ;
      bGXsfl_68_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      if ( subGrid_Islastpage != 0 )
      {
         GRID_nFirstRecordOnPage = (long)(subgrid_fnc_recordcount( )-subgrid_fnc_recordsperpage( )) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_682( ) ;
         e181G32 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_68_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e181G32 ();
         }
         wbEnd = (short)(68) ;
         wb1G30( ) ;
      }
      bGXsfl_68_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1G32( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vLB_TAAUXL", GXutil.ltrim( localUtil.ntoc( AV29lb_TaAuxL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLB_TAAUXL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV29lb_TaAuxL), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vLPRFOR", GXutil.ltrim( localUtil.ntoc( AV12Lprfor, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLPRFOR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12Lprfor), "ZZZ9")));
   }

   public int subgrid_fnc_pagecount( )
   {
      return -1 ;
   }

   public int subgrid_fnc_recordcount( )
   {
      return (int)(((subGrid_Recordcount==0) ? GRID_nFirstRecordOnPage+1 : subGrid_Recordcount)) ;
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
      return (int)(((subGrid_Islastpage==1) ? subgrid_fnc_recordcount( )/ (double) (subgrid_fnc_recordsperpage( ))+((((int)((subgrid_fnc_recordcount( )) % (subgrid_fnc_recordsperpage( ))))==0) ? 0 : 1) : GXutil.Int( GRID_nFirstRecordOnPage/ (double) (subgrid_fnc_recordsperpage( )))+1)) ;
   }

   public short subgrid_firstpage( )
   {
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV6EmprCod, AV5Lb_TaAuxC, A396EmprCod, A6310Lb_TaAuxC, A6313lb_TaAuxL, A6378Lb_TauxLP, AV29lb_TaAuxL, A719PrdNum, A718PrdNom, A6316Lb_TaAuxCt, A488ForPrdDsc, A490ForPrdUMe, A6317Lb_TauxOrd, AV12Lprfor) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV6EmprCod, AV5Lb_TaAuxC, A396EmprCod, A6310Lb_TaAuxC, A6313lb_TaAuxL, A6378Lb_TauxLP, AV29lb_TaAuxL, A719PrdNum, A718PrdNom, A6316Lb_TaAuxCt, A488ForPrdDsc, A490ForPrdUMe, A6317Lb_TauxOrd, AV12Lprfor) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV6EmprCod, AV5Lb_TaAuxC, A396EmprCod, A6310Lb_TaAuxC, A6313lb_TaAuxL, A6378Lb_TauxLP, AV29lb_TaAuxL, A719PrdNum, A718PrdNom, A6316Lb_TaAuxCt, A488ForPrdDsc, A490ForPrdUMe, A6317Lb_TauxOrd, AV12Lprfor) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      subGrid_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV6EmprCod, AV5Lb_TaAuxC, A396EmprCod, A6310Lb_TaAuxC, A6313lb_TaAuxL, A6378Lb_TauxLP, AV29lb_TaAuxL, A719PrdNum, A718PrdNom, A6316Lb_TaAuxCt, A488ForPrdDsc, A490ForPrdUMe, A6317Lb_TauxOrd, AV12Lprfor) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV6EmprCod, AV5Lb_TaAuxC, A396EmprCod, A6310Lb_TaAuxC, A6313lb_TaAuxL, A6378Lb_TauxLP, AV29lb_TaAuxL, A719PrdNum, A718PrdNom, A6316Lb_TaAuxCt, A488ForPrdDsc, A490ForPrdUMe, A6317Lb_TauxOrd, AV12Lprfor) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavLb_taauxc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLb_taauxc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLb_taauxc_Enabled), 5, 0), true);
      edtavLb_taauxd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLb_taauxd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLb_taauxd_Enabled), 5, 0), true);
      edtavForcansum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavForcansum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavForcansum_Enabled), 5, 0), true);
      edtavLb_taauxci_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLb_taauxci_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLb_taauxci_Enabled), 5, 0), true);
      edtavLb_taauxcf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLb_taauxcf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLb_taauxcf_Enabled), 5, 0), true);
      edtavLb_fam1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLb_fam1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLb_fam1_Enabled), 5, 0), true);
      edtavLb_fam2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLb_fam2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLb_fam2_Enabled), 5, 0), true);
      edtavLb_fam3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLb_fam3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLb_fam3_Enabled), 5, 0), true);
      edtavLb_tauxlp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLb_tauxlp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLb_tauxlp_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavPrdnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrdnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdnum_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavPrdnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrdnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdnom_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavLb_taauxct_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLb_taauxct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLb_taauxct_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavForprdume_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavForprdume_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavForprdume_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavForprddsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavForprddsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavForprddsc_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavLb_tauxord_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLb_tauxord_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLb_tauxord_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strup1G30( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e161G32 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         nRC_GXsfl_68 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_68"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV28GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV12Lprfor = (short)(localUtil.ctol( httpContext.cgiGet( "vLPRFOR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Dvelop_confirmpanel_confirmar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Title") ;
         Dvelop_confirmpanel_confirmar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext") ;
         Dvelop_confirmpanel_confirmar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_confirmar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Dvelop_confirmpanel_confirmar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Result") ;
         /* Read variables values. */
         AV17Lb_TaAuxD = httpContext.cgiGet( edtavLb_taauxd_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Lb_TaAuxD", AV17Lb_TaAuxD);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavLb_taauxci_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavLb_taauxci_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vLB_TAAUXCI");
            GX_FocusControl = edtavLb_taauxci_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV15Lb_TaAuxCi = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15Lb_TaAuxCi", GXutil.ltrimstr( AV15Lb_TaAuxCi, 11, 5));
         }
         else
         {
            AV15Lb_TaAuxCi = localUtil.ctond( httpContext.cgiGet( edtavLb_taauxci_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15Lb_TaAuxCi", GXutil.ltrimstr( AV15Lb_TaAuxCi, 11, 5));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavLb_taauxcf_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavLb_taauxcf_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vLB_TAAUXCF");
            GX_FocusControl = edtavLb_taauxcf_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14Lb_TaAuxCf = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14Lb_TaAuxCf", GXutil.ltrimstr( AV14Lb_TaAuxCf, 11, 5));
         }
         else
         {
            AV14Lb_TaAuxCf = localUtil.ctond( httpContext.cgiGet( edtavLb_taauxcf_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14Lb_TaAuxCf", GXutil.ltrimstr( AV14Lb_TaAuxCf, 11, 5));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGridcurrentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGridcurrentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGRIDCURRENTPAGE");
            GX_FocusControl = edtavGridcurrentpage_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV27GridCurrentPage = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27GridCurrentPage), 10, 0));
         }
         else
         {
            AV27GridCurrentPage = localUtil.ctol( httpContext.cgiGet( edtavGridcurrentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27GridCurrentPage), 10, 0));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e161G32 ();
      if (returnInSub) return;
   }

   public void e161G32( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV12Lprfor = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Lprfor", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12Lprfor), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLPRFOR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12Lprfor), "ZZZ9")));
      /* Using cursor H01G32 */
      pr_default.execute(0, new Object[] {AV6EmprCod, Integer.valueOf(AV8ForNumCol)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A486ForNumCol = H01G32_A486ForNumCol[0] ;
         A396EmprCod = H01G32_A396EmprCod[0] ;
         A715PrdLin = H01G32_A715PrdLin[0] ;
         AV12Lprfor = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12Lprfor", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12Lprfor), 4, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLPRFOR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12Lprfor), "ZZZ9")));
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV13Ens008 = (short)(0) ;
      /* Using cursor H01G33 */
      pr_default.execute(1, new Object[] {AV6EmprCod, AV5Lb_TaAuxC, AV7ForCanSum, AV7ForCanSum});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A6315Lb_TaAuxCf = H01G33_A6315Lb_TaAuxCf[0] ;
         A6314Lb_TaAuxCi = H01G33_A6314Lb_TaAuxCi[0] ;
         A6310Lb_TaAuxC = H01G33_A6310Lb_TaAuxC[0] ;
         A396EmprCod = H01G33_A396EmprCod[0] ;
         A6311Lb_TaAuxD = H01G33_A6311Lb_TaAuxD[0] ;
         A6313lb_TaAuxL = H01G33_A6313lb_TaAuxL[0] ;
         A6311Lb_TaAuxD = H01G33_A6311Lb_TaAuxD[0] ;
         AV29lb_TaAuxL = A6313lb_TaAuxL ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29lb_TaAuxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29lb_TaAuxL), 4, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLB_TAAUXL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV29lb_TaAuxL), "ZZZ9")));
         AV17Lb_TaAuxD = A6311Lb_TaAuxD ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Lb_TaAuxD", AV17Lb_TaAuxD);
         AV15Lb_TaAuxCi = A6314Lb_TaAuxCi ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Lb_TaAuxCi", GXutil.ltrimstr( AV15Lb_TaAuxCi, 11, 5));
         AV14Lb_TaAuxCf = A6315Lb_TaAuxCf ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Lb_TaAuxCf", GXutil.ltrimstr( AV14Lb_TaAuxCf, 11, 5));
         AV13Ens008 = (short)(1) ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      GXt_char1 = AV35Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      productosfunciontablaalcali_impl.this.GXt_char1 = GXv_char2[0] ;
      AV35Station = GXt_char1 ;
      GXv_char2[0] = AV6EmprCod ;
      GXv_char3[0] = AV36Emprnom ;
      GXv_char4[0] = AV37Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV35Station, GXv_char2, GXv_char3, GXv_char4) ;
      productosfunciontablaalcali_impl.this.AV6EmprCod = GXv_char2[0] ;
      productosfunciontablaalcali_impl.this.AV36Emprnom = GXv_char3[0] ;
      productosfunciontablaalcali_impl.this.AV37Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6EmprCod", AV6EmprCod);
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      AV27GridCurrentPage = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27GridCurrentPage), 10, 0));
      edtavGridcurrentpage_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGridcurrentpage_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGridcurrentpage_Visible), 5, 0), true);
      AV28GridPageCount = -1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28GridPageCount), 10, 0));
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e171G32( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXt_int5 = AV30NumeroRegistros ;
      GXv_char4[0] = AV6EmprCod ;
      GXv_char3[0] = AV5Lb_TaAuxC ;
      GXv_int6[0] = GXt_int5 ;
      new app.registrostablaens007(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int6) ;
      productosfunciontablaalcali_impl.this.AV6EmprCod = GXv_char4[0] ;
      productosfunciontablaalcali_impl.this.AV5Lb_TaAuxC = GXv_char3[0] ;
      productosfunciontablaalcali_impl.this.GXt_int5 = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6EmprCod", AV6EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV5Lb_TaAuxC", AV5Lb_TaAuxC);
      AV30NumeroRegistros = GXt_int5 ;
      AV28GridPageCount = (long)((AV30NumeroRegistros/ (double) (10))+1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28GridPageCount), 10, 0));
      /*  Sending Event outputs  */
   }

   private void e181G32( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV13Ens008 = (short)(0) ;
      /* Using cursor H01G34 */
      pr_default.execute(2, new Object[] {AV6EmprCod, AV5Lb_TaAuxC, Short.valueOf(AV29lb_TaAuxL)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A6313lb_TaAuxL = H01G34_A6313lb_TaAuxL[0] ;
         A6310Lb_TaAuxC = H01G34_A6310Lb_TaAuxC[0] ;
         A396EmprCod = H01G34_A396EmprCod[0] ;
         A719PrdNum = H01G34_A719PrdNum[0] ;
         A718PrdNom = H01G34_A718PrdNom[0] ;
         A6316Lb_TaAuxCt = H01G34_A6316Lb_TaAuxCt[0] ;
         A488ForPrdDsc = H01G34_A488ForPrdDsc[0] ;
         n488ForPrdDsc = H01G34_n488ForPrdDsc[0] ;
         A490ForPrdUMe = H01G34_A490ForPrdUMe[0] ;
         A6317Lb_TauxOrd = H01G34_A6317Lb_TauxOrd[0] ;
         A6378Lb_TauxLP = H01G34_A6378Lb_TauxLP[0] ;
         A718PrdNom = H01G34_A718PrdNom[0] ;
         A488ForPrdDsc = H01G34_A488ForPrdDsc[0] ;
         n488ForPrdDsc = H01G34_n488ForPrdDsc[0] ;
         AV18Lb_TauxLP = A6378Lb_TauxLP ;
         httpContext.ajax_rsp_assign_attri("", false, edtavLb_tauxlp_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Lb_TauxLP), 4, 0));
         AV20PrdNum = A719PrdNum ;
         httpContext.ajax_rsp_assign_attri("", false, edtavPrdnum_Internalname, AV20PrdNum);
         AV21PrdNom = A718PrdNom ;
         httpContext.ajax_rsp_assign_attri("", false, edtavPrdnom_Internalname, AV21PrdNom);
         AV16Lb_TaAuxCt = A6316Lb_TaAuxCt ;
         httpContext.ajax_rsp_assign_attri("", false, edtavLb_taauxct_Internalname, GXutil.ltrimstr( AV16Lb_TaAuxCt, 11, 5));
         AV22ForPrdDsc = A488ForPrdDsc ;
         httpContext.ajax_rsp_assign_attri("", false, edtavForprddsc_Internalname, AV22ForPrdDsc);
         AV23ForPrdUMe = A490ForPrdUMe ;
         httpContext.ajax_rsp_assign_attri("", false, edtavForprdume_Internalname, GXutil.str( AV23ForPrdUMe, 1, 0));
         AV19Lb_TauxOrd = A6317Lb_TauxOrd ;
         httpContext.ajax_rsp_assign_attri("", false, edtavLb_tauxord_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Lb_TauxOrd), 4, 0));
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(68) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_682( ) ;
            GRID_nEOF = (byte)(1) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( ( subGrid_Islastpage == 1 ) && ( ((int)((GRID_nCurrentRecord) % (subgrid_fnc_recordsperpage( )))) == 0 ) )
            {
               GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
            }
         }
         if ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) )
         {
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_68_Refreshing )
         {
            httpContext.doAjaxLoad(68, GridRow);
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
      /*  Sending Event outputs  */
   }

   public void e121G32( )
   {
      /* Gridpaginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gridpaginationbar_Selectedpage, "Previous") == 0 )
      {
         AV27GridCurrentPage = (long)(AV27GridCurrentPage-1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27GridCurrentPage), 10, 0));
         subgrid_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Gridpaginationbar_Selectedpage, "Next") == 0 )
      {
         AV27GridCurrentPage = (long)(AV27GridCurrentPage+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27GridCurrentPage), 10, 0));
         subgrid_nextpage( ) ;
      }
      else
      {
         AV26PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         AV27GridCurrentPage = AV26PageToGo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27GridCurrentPage), 10, 0));
         subgrid_gotopage( AV26PageToGo) ;
      }
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e131G32( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      AV27GridCurrentPage = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27GridCurrentPage), 10, 0));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e141G32( )
   {
      /* Dvelop_confirmpanel_confirmar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_confirmar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION CONFIRMAR' */
         S112 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e151G32( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {AV6EmprCod,AV5Lb_TaAuxC,AV7ForCanSum,Integer.valueOf(AV8ForNumCol),Byte.valueOf(AV9Lb_fam1),Byte.valueOf(AV10Lb_fam2),Byte.valueOf(AV11Lb_fam3)});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV6EmprCod","AV5Lb_TaAuxC","AV7ForCanSum","AV8ForNumCol","AV9Lb_fam1","AV10Lb_fam2","AV11Lb_fam3"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S112( )
   {
      /* 'DO ACTION CONFIRMAR' Routine */
      returnInSub = false ;
      if ( AV12Lprfor == 1 )
      {
         GXv_char4[0] = AV6EmprCod ;
         GXv_int7[0] = AV8ForNumCol ;
         new app.pprdauxe(remoteHandle, context).execute( GXv_char4, GXv_int7) ;
         productosfunciontablaalcali_impl.this.AV6EmprCod = GXv_char4[0] ;
         productosfunciontablaalcali_impl.this.AV8ForNumCol = GXv_int7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6EmprCod", AV6EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV8ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8ForNumCol), 8, 0));
      }
      /* Start For Each Line */
      nRC_GXsfl_68 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_68"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_68_fel_idx = 0 ;
      while ( nGXsfl_68_fel_idx < nRC_GXsfl_68 )
      {
         nGXsfl_68_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_68_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_68_fel_idx+1) ;
         sGXsfl_68_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_682( ) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavLb_tauxlp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavLb_tauxlp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vLB_TAUXLP");
            GX_FocusControl = edtavLb_tauxlp_Internalname ;
            wbErr = true ;
            AV18Lb_TauxLP = (short)(0) ;
         }
         else
         {
            AV18Lb_TauxLP = (short)(localUtil.ctol( httpContext.cgiGet( edtavLb_tauxlp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         AV20PrdNum = httpContext.cgiGet( edtavPrdnum_Internalname) ;
         AV21PrdNom = httpContext.cgiGet( edtavPrdnom_Internalname) ;
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavLb_taauxct_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavLb_taauxct_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vLB_TAAUXCT");
            GX_FocusControl = edtavLb_taauxct_Internalname ;
            wbErr = true ;
            AV16Lb_TaAuxCt = DecimalUtil.ZERO ;
         }
         else
         {
            AV16Lb_TaAuxCt = localUtil.ctond( httpContext.cgiGet( edtavLb_taauxct_Internalname)) ;
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavForprdume_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavForprdume_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFORPRDUME");
            GX_FocusControl = edtavForprdume_Internalname ;
            wbErr = true ;
            AV23ForPrdUMe = (byte)(0) ;
         }
         else
         {
            AV23ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( edtavForprdume_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         AV22ForPrdDsc = httpContext.cgiGet( edtavForprddsc_Internalname) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavLb_tauxord_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavLb_tauxord_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vLB_TAUXORD");
            GX_FocusControl = edtavLb_tauxord_Internalname ;
            wbErr = true ;
            AV19Lb_TauxOrd = (short)(0) ;
         }
         else
         {
            AV19Lb_TauxOrd = (short)(localUtil.ctol( httpContext.cgiGet( edtavLb_tauxord_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         if ( ( AV18Lb_TauxLP > 0 ) && ( AV16Lb_TaAuxCt.doubleValue() > 0 ) )
         {
            GXv_char4[0] = AV6EmprCod ;
            GXv_int8[0] = AV18Lb_TauxLP ;
            GXv_int7[0] = AV8ForNumCol ;
            GXv_char3[0] = AV20PrdNum ;
            GXv_decimal9[0] = AV16Lb_TaAuxCt ;
            GXv_int10[0] = AV23ForPrdUMe ;
            GXv_int11[0] = AV19Lb_TauxOrd ;
            new app.pprdauxa(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int7, GXv_char3, GXv_decimal9, GXv_int10, GXv_int11) ;
            productosfunciontablaalcali_impl.this.AV6EmprCod = GXv_char4[0] ;
            productosfunciontablaalcali_impl.this.AV18Lb_TauxLP = GXv_int8[0] ;
            productosfunciontablaalcali_impl.this.AV8ForNumCol = GXv_int7[0] ;
            productosfunciontablaalcali_impl.this.AV20PrdNum = GXv_char3[0] ;
            productosfunciontablaalcali_impl.this.AV16Lb_TaAuxCt = GXv_decimal9[0] ;
            productosfunciontablaalcali_impl.this.AV23ForPrdUMe = GXv_int10[0] ;
            productosfunciontablaalcali_impl.this.AV19Lb_TauxOrd = GXv_int11[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6EmprCod", AV6EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, edtavLb_tauxlp_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Lb_TauxLP), 4, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV8ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8ForNumCol), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, edtavPrdnum_Internalname, AV20PrdNum);
            httpContext.ajax_rsp_assign_attri("", false, edtavLb_taauxct_Internalname, GXutil.ltrimstr( AV16Lb_TaAuxCt, 11, 5));
            httpContext.ajax_rsp_assign_attri("", false, edtavForprdume_Internalname, GXutil.str( AV23ForPrdUMe, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, edtavLb_tauxord_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Lb_TauxOrd), 4, 0));
         }
         /* End For Each Line */
      }
      if ( nGXsfl_68_fel_idx == 0 )
      {
         nGXsfl_68_idx = 1 ;
         sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_682( ) ;
      }
      nGXsfl_68_fel_idx = 1 ;
      GXv_char4[0] = AV6EmprCod ;
      GXv_int7[0] = AV8ForNumCol ;
      new app.pprdfor(remoteHandle, context).execute( GXv_char4, GXv_int7) ;
      productosfunciontablaalcali_impl.this.AV6EmprCod = GXv_char4[0] ;
      productosfunciontablaalcali_impl.this.AV8ForNumCol = GXv_int7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6EmprCod", AV6EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV8ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8ForNumCol), 8, 0));
      httpContext.setWebReturnParms(new Object[] {AV6EmprCod,AV5Lb_TaAuxC,AV7ForCanSum,Integer.valueOf(AV8ForNumCol),Byte.valueOf(AV9Lb_fam1),Byte.valueOf(AV10Lb_fam2),Byte.valueOf(AV11Lb_fam3)});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV6EmprCod","AV5Lb_TaAuxC","AV7ForCanSum","AV8ForNumCol","AV9Lb_fam1","AV10Lb_fam2","AV11Lb_fam3"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void wb_table1_95_1G32( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_confirmar_Internalname, tblTabledvelop_confirmpanel_confirmar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_confirmar.setProperty("Title", Dvelop_confirmpanel_confirmar_Title);
         ucDvelop_confirmpanel_confirmar.setProperty("ConfirmationText", Dvelop_confirmpanel_confirmar_Confirmationtext);
         ucDvelop_confirmpanel_confirmar.setProperty("YesButtonCaption", Dvelop_confirmpanel_confirmar_Yesbuttoncaption);
         ucDvelop_confirmpanel_confirmar.setProperty("NoButtonCaption", Dvelop_confirmpanel_confirmar_Nobuttoncaption);
         ucDvelop_confirmpanel_confirmar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_confirmar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_confirmar.setProperty("YesButtonPosition", Dvelop_confirmpanel_confirmar_Yesbuttonposition);
         ucDvelop_confirmpanel_confirmar.setProperty("ConfirmType", Dvelop_confirmpanel_confirmar_Confirmtype);
         ucDvelop_confirmpanel_confirmar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_confirmar_Internalname, "DVELOP_CONFIRMPANEL_CONFIRMARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_CONFIRMARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_95_1G32e( true) ;
      }
      else
      {
         wb_table1_95_1G32e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV6EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6EmprCod", AV6EmprCod);
      AV5Lb_TaAuxC = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5Lb_TaAuxC", AV5Lb_TaAuxC);
      AV7ForCanSum = (java.math.BigDecimal)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7ForCanSum", GXutil.ltrimstr( AV7ForCanSum, 11, 5));
      AV8ForNumCol = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8ForNumCol), 8, 0));
      AV9Lb_fam1 = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Lb_fam1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Lb_fam1), 2, 0));
      AV10Lb_fam2 = ((Number) GXutil.testNumericType( getParm(obj,5), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lb_fam2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Lb_fam2), 2, 0));
      AV11Lb_fam3 = ((Number) GXutil.testNumericType( getParm(obj,6), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Lb_fam3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11Lb_fam3), 2, 0));
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
      pa1G32( ) ;
      ws1G32( ) ;
      we1G32( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016431472", true, true);
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
      if ( nGXWrapped != 1 )
      {
         httpContext.AddJavascriptSource("messages."+httpContext.getLanguageProperty( "code")+".js", "?"+httpContext.getCacheInvalidationToken( ), false, true);
         httpContext.AddJavascriptSource("formulaciontinte/productosfunciontablaalcali.js", "?202661016431472", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_682( )
   {
      edtavLb_tauxlp_Internalname = "vLB_TAUXLP_"+sGXsfl_68_idx ;
      edtavPrdnum_Internalname = "vPRDNUM_"+sGXsfl_68_idx ;
      edtavPrdnom_Internalname = "vPRDNOM_"+sGXsfl_68_idx ;
      edtavLb_taauxct_Internalname = "vLB_TAAUXCT_"+sGXsfl_68_idx ;
      edtavForprdume_Internalname = "vFORPRDUME_"+sGXsfl_68_idx ;
      edtavForprddsc_Internalname = "vFORPRDDSC_"+sGXsfl_68_idx ;
      edtavLb_tauxord_Internalname = "vLB_TAUXORD_"+sGXsfl_68_idx ;
   }

   public void subsflControlProps_fel_682( )
   {
      edtavLb_tauxlp_Internalname = "vLB_TAUXLP_"+sGXsfl_68_fel_idx ;
      edtavPrdnum_Internalname = "vPRDNUM_"+sGXsfl_68_fel_idx ;
      edtavPrdnom_Internalname = "vPRDNOM_"+sGXsfl_68_fel_idx ;
      edtavLb_taauxct_Internalname = "vLB_TAAUXCT_"+sGXsfl_68_fel_idx ;
      edtavForprdume_Internalname = "vFORPRDUME_"+sGXsfl_68_fel_idx ;
      edtavForprddsc_Internalname = "vFORPRDDSC_"+sGXsfl_68_fel_idx ;
      edtavLb_tauxord_Internalname = "vLB_TAUXORD_"+sGXsfl_68_fel_idx ;
   }

   public void sendrow_682( )
   {
      subsflControlProps_682( ) ;
      wb1G30( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_68_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_68_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_68_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavLb_tauxlp_Enabled!=0)&&(edtavLb_tauxlp_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 69,'',false,'"+sGXsfl_68_idx+"',68)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLb_tauxlp_Internalname,GXutil.ltrim( localUtil.ntoc( AV18Lb_TauxLP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavLb_tauxlp_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV18Lb_TauxLP), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV18Lb_TauxLP), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavLb_tauxlp_Enabled!=0)&&(edtavLb_tauxlp_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,69);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLb_tauxlp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavLb_tauxlp_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPrdnum_Enabled!=0)&&(edtavPrdnum_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 70,'',false,'"+sGXsfl_68_idx+"',68)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrdnum_Internalname,GXutil.rtrim( AV20PrdNum),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavPrdnum_Enabled!=0)&&(edtavPrdnum_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,70);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPrdnum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavPrdnum_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPrdnom_Enabled!=0)&&(edtavPrdnom_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 71,'',false,'"+sGXsfl_68_idx+"',68)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrdnom_Internalname,GXutil.rtrim( AV21PrdNom),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavPrdnom_Enabled!=0)&&(edtavPrdnom_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,71);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPrdnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavPrdnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavLb_taauxct_Enabled!=0)&&(edtavLb_taauxct_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 72,'',false,'"+sGXsfl_68_idx+"',68)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLb_taauxct_Internalname,GXutil.ltrim( localUtil.ntoc( AV16Lb_TaAuxCt, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavLb_taauxct_Enabled!=0) ? localUtil.format( AV16Lb_TaAuxCt, "ZZZZ9.99999") : localUtil.format( AV16Lb_TaAuxCt, "ZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+((edtavLb_taauxct_Enabled!=0)&&(edtavLb_taauxct_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,72);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLb_taauxct_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavLb_taauxct_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavForprdume_Enabled!=0)&&(edtavForprdume_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 73,'',false,'"+sGXsfl_68_idx+"',68)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavForprdume_Internalname,GXutil.ltrim( localUtil.ntoc( AV23ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavForprdume_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV23ForPrdUMe), "9") : localUtil.format( DecimalUtil.doubleToDec(AV23ForPrdUMe), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavForprdume_Enabled!=0)&&(edtavForprdume_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,73);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavForprdume_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavForprdume_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavForprddsc_Enabled!=0)&&(edtavForprddsc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 74,'',false,'"+sGXsfl_68_idx+"',68)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavForprddsc_Internalname,GXutil.rtrim( AV22ForPrdDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavForprddsc_Enabled!=0)&&(edtavForprddsc_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,74);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavForprddsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavForprddsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavLb_tauxord_Enabled!=0)&&(edtavLb_tauxord_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 75,'',false,'"+sGXsfl_68_idx+"',68)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLb_tauxord_Internalname,GXutil.ltrim( localUtil.ntoc( AV19Lb_TauxOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavLb_tauxord_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV19Lb_TauxOrd), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV19Lb_TauxOrd), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavLb_tauxord_Enabled!=0)&&(edtavLb_tauxord_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,75);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLb_tauxord_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavLb_tauxord_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1G32( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_68_idx = ((subGrid_Islastpage==1)&&(nGXsfl_68_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_68_idx+1) ;
         sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_682( ) ;
      }
      /* End function sendrow_682 */
   }

   public void startgridcontrol68( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"68\">") ;
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
         httpContext.writeValue( httpContext.getMessage( "Linea", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cantidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cod. Und.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ordem(#)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
         GridContainer.AddObjectProperty("GridName", "Grid");
         GridContainer.AddObjectProperty("Header", subGrid_Header);
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV18Lb_TauxLP, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLb_tauxlp_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV20PrdNum));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrdnum_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV21PrdNom));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrdnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV16Lb_TaAuxCt, (byte)(11), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLb_taauxct_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV23ForPrdUMe, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavForprdume_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV22ForPrdDsc));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavForprddsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV19Lb_TauxOrd, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLb_tauxord_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtavLb_taauxc_Internalname = "vLB_TAAUXC" ;
      edtavLb_taauxd_Internalname = "vLB_TAAUXD" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtavForcansum_Internalname = "vFORCANSUM" ;
      edtavLb_taauxci_Internalname = "vLB_TAAUXCI" ;
      edtavLb_taauxcf_Internalname = "vLB_TAAUXCF" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      edtavLb_fam1_Internalname = "vLB_FAM1" ;
      edtavLb_fam2_Internalname = "vLB_FAM2" ;
      edtavLb_fam3_Internalname = "vLB_FAM3" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      grpUnnamedgroup6_Internalname = "UNNAMEDGROUP6" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      edtavLb_tauxlp_Internalname = "vLB_TAUXLP" ;
      edtavPrdnum_Internalname = "vPRDNUM" ;
      edtavPrdnom_Internalname = "vPRDNOM" ;
      edtavLb_taauxct_Internalname = "vLB_TAAUXCT" ;
      edtavForprdume_Internalname = "vFORPRDUME" ;
      edtavForprddsc_Internalname = "vFORPRDDSC" ;
      edtavLb_tauxord_Internalname = "vLB_TAUXORD" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavGridcurrentpage_Internalname = "vGRIDCURRENTPAGE" ;
      Dvelop_confirmpanel_confirmar_Internalname = "DVELOP_CONFIRMPANEL_CONFIRMAR" ;
      tblTabledvelop_confirmpanel_confirmar_Internalname = "TABLEDVELOP_CONFIRMPANEL_CONFIRMAR" ;
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
      edtavLb_tauxord_Jsonclick = "" ;
      edtavLb_tauxord_Visible = -1 ;
      edtavLb_tauxord_Enabled = 1 ;
      edtavForprddsc_Jsonclick = "" ;
      edtavForprddsc_Visible = -1 ;
      edtavForprddsc_Enabled = 1 ;
      edtavForprdume_Jsonclick = "" ;
      edtavForprdume_Visible = -1 ;
      edtavForprdume_Enabled = 1 ;
      edtavLb_taauxct_Jsonclick = "" ;
      edtavLb_taauxct_Visible = -1 ;
      edtavLb_taauxct_Enabled = 1 ;
      edtavPrdnom_Jsonclick = "" ;
      edtavPrdnom_Visible = -1 ;
      edtavPrdnom_Enabled = 1 ;
      edtavPrdnum_Jsonclick = "" ;
      edtavPrdnum_Visible = -1 ;
      edtavPrdnum_Enabled = 1 ;
      edtavLb_tauxlp_Jsonclick = "" ;
      edtavLb_tauxlp_Visible = -1 ;
      edtavLb_tauxlp_Enabled = 1 ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavGridcurrentpage_Jsonclick = "" ;
      edtavGridcurrentpage_Visible = 1 ;
      edtavLb_fam3_Jsonclick = "" ;
      edtavLb_fam3_Enabled = 0 ;
      edtavLb_fam2_Jsonclick = "" ;
      edtavLb_fam2_Enabled = 0 ;
      edtavLb_fam1_Jsonclick = "" ;
      edtavLb_fam1_Enabled = 0 ;
      edtavLb_taauxcf_Jsonclick = "" ;
      edtavLb_taauxcf_Enabled = 1 ;
      edtavLb_taauxci_Jsonclick = "" ;
      edtavLb_taauxci_Enabled = 1 ;
      edtavForcansum_Jsonclick = "" ;
      edtavForcansum_Enabled = 0 ;
      edtavLb_taauxd_Jsonclick = "" ;
      edtavLb_taauxd_Enabled = 1 ;
      edtavLb_taauxc_Jsonclick = "" ;
      edtavLb_taauxc_Enabled = 0 ;
      Dvelop_confirmpanel_confirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_confirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_confirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_confirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_confirmar_Confirmationtext = "Confirma" ;
      Dvelop_confirmpanel_confirmar_Title = "" ;
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
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Informacion", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Productos en funcion de Tabla Alcali", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6310Lb_TaAuxC',fld:'LB_TAAUXC',pic:''},{av:'A6313lb_TaAuxL',fld:'LB_TAAUXL',pic:'ZZZ9'},{av:'A6378Lb_TauxLP',fld:'LB_TAUXLP',pic:'ZZZ9'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A6316Lb_TaAuxCt',fld:'LB_TAAUXCT',pic:'ZZZZ9.99999'},{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'},{av:'A6317Lb_TauxOrd',fld:'LB_TAUXORD',pic:'ZZZ9'},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5Lb_TaAuxC',fld:'vLB_TAAUXC',pic:''},{av:'AV29lb_TaAuxL',fld:'vLB_TAAUXL',pic:'ZZZ9',hsh:true},{av:'AV12Lprfor',fld:'vLPRFOR',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV28GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e181G32',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6310Lb_TaAuxC',fld:'LB_TAAUXC',pic:''},{av:'A6313lb_TaAuxL',fld:'LB_TAAUXL',pic:'ZZZ9'},{av:'A6378Lb_TauxLP',fld:'LB_TAUXLP',pic:'ZZZ9'},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5Lb_TaAuxC',fld:'vLB_TAAUXC',pic:''},{av:'AV29lb_TaAuxL',fld:'vLB_TAAUXL',pic:'ZZZ9',hsh:true},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A6316Lb_TaAuxCt',fld:'LB_TAAUXCT',pic:'ZZZZ9.99999'},{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'},{av:'A6317Lb_TauxOrd',fld:'LB_TAUXORD',pic:'ZZZ9'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV18Lb_TauxLP',fld:'vLB_TAUXLP',pic:'ZZZ9'},{av:'AV20PrdNum',fld:'vPRDNUM',pic:''},{av:'AV21PrdNom',fld:'vPRDNOM',pic:''},{av:'AV16Lb_TaAuxCt',fld:'vLB_TAAUXCT',pic:'ZZZZ9.99999'},{av:'AV22ForPrdDsc',fld:'vFORPRDDSC',pic:''},{av:'AV23ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'AV19Lb_TauxOrd',fld:'vLB_TAUXORD',pic:'ZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e121G32',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5Lb_TaAuxC',fld:'vLB_TAAUXC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6310Lb_TaAuxC',fld:'LB_TAAUXC',pic:''},{av:'A6313lb_TaAuxL',fld:'LB_TAAUXL',pic:'ZZZ9'},{av:'A6378Lb_TauxLP',fld:'LB_TAUXLP',pic:'ZZZ9'},{av:'AV29lb_TaAuxL',fld:'vLB_TAAUXL',pic:'ZZZ9',hsh:true},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A6316Lb_TaAuxCt',fld:'LB_TAAUXCT',pic:'ZZZZ9.99999'},{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'},{av:'A6317Lb_TauxOrd',fld:'LB_TAUXORD',pic:'ZZZ9'},{av:'AV12Lprfor',fld:'vLPRFOR',pic:'ZZZ9',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'},{av:'AV27GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[{av:'AV27GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV28GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e131G32',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5Lb_TaAuxC',fld:'vLB_TAAUXC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6310Lb_TaAuxC',fld:'LB_TAAUXC',pic:''},{av:'A6313lb_TaAuxL',fld:'LB_TAAUXL',pic:'ZZZ9'},{av:'A6378Lb_TauxLP',fld:'LB_TAUXLP',pic:'ZZZ9'},{av:'AV29lb_TaAuxL',fld:'vLB_TAAUXL',pic:'ZZZ9',hsh:true},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A6316Lb_TaAuxCt',fld:'LB_TAAUXCT',pic:'ZZZZ9.99999'},{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'},{av:'A6317Lb_TauxOrd',fld:'LB_TAUXORD',pic:'ZZZ9'},{av:'AV12Lprfor',fld:'vLPRFOR',pic:'ZZZ9',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e111G31',iparms:[{av:'AV12Lprfor',fld:'vLPRFOR',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{av:'Dvelop_confirmpanel_confirmar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMAR',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE","{handler:'e141G32',iparms:[{av:'Dvelop_confirmpanel_confirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMAR',prop:'Result'},{av:'AV12Lprfor',fld:'vLPRFOR',pic:'ZZZ9',hsh:true},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV18Lb_TauxLP',fld:'vLB_TAUXLP',grid:68,pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_68',ctrl:'GRID',grid:68,prop:'GridRC',grid:68},{av:'AV16Lb_TaAuxCt',fld:'vLB_TAAUXCT',grid:68,pic:'ZZZZ9.99999'},{av:'AV20PrdNum',fld:'vPRDNUM',grid:68,pic:''},{av:'AV23ForPrdUMe',fld:'vFORPRDUME',grid:68,pic:'9'},{av:'AV19Lb_TauxOrd',fld:'vLB_TAUXORD',grid:68,pic:'ZZZ9'},{av:'AV11Lb_fam3',fld:'vLB_FAM3',pic:'Z9'},{av:'AV10Lb_fam2',fld:'vLB_FAM2',pic:'Z9'},{av:'AV9Lb_fam1',fld:'vLB_FAM1',pic:'Z9'},{av:'AV7ForCanSum',fld:'vFORCANSUM',pic:'ZZZZ9.99999'},{av:'AV5Lb_TaAuxC',fld:'vLB_TAAUXC',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE",",oparms:[{av:'AV8ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV19Lb_TauxOrd',fld:'vLB_TAUXORD',pic:'ZZZ9'},{av:'AV23ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'AV16Lb_TaAuxCt',fld:'vLB_TAAUXCT',pic:'ZZZZ9.99999'},{av:'AV20PrdNum',fld:'vPRDNUM',pic:''},{av:'AV18Lb_TauxLP',fld:'vLB_TAUXLP',pic:'ZZZ9'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e151G32',iparms:[{av:'AV11Lb_fam3',fld:'vLB_FAM3',pic:'Z9'},{av:'AV10Lb_fam2',fld:'vLB_FAM2',pic:'Z9'},{av:'AV9Lb_fam1',fld:'vLB_FAM1',pic:'Z9'},{av:'AV8ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV7ForCanSum',fld:'vFORCANSUM',pic:'ZZZZ9.99999'},{av:'AV5Lb_TaAuxC',fld:'vLB_TAAUXC',pic:''},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("VALIDV_LB_TAAUXC","{handler:'validv_Lb_taauxc',iparms:[]");
      setEventMetadata("VALIDV_LB_TAAUXC",",oparms:[]}");
      setEventMetadata("VALIDV_FORPRDUME","{handler:'validv_Forprdume',iparms:[]");
      setEventMetadata("VALIDV_FORPRDUME",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Lb_tauxord',iparms:[]");
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
      wcpOAV6EmprCod = "" ;
      wcpOAV5Lb_TaAuxC = "" ;
      wcpOAV7ForCanSum = DecimalUtil.ZERO ;
      Gridpaginationbar_Selectedpage = "" ;
      Dvelop_confirmpanel_confirmar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV6EmprCod = "" ;
      AV5Lb_TaAuxC = "" ;
      AV7ForCanSum = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      A6310Lb_TaAuxC = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A6316Lb_TaAuxCt = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV17Lb_TaAuxD = "" ;
      AV15Lb_TaAuxCi = DecimalUtil.ZERO ;
      AV14Lb_TaAuxCf = DecimalUtil.ZERO ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV20PrdNum = "" ;
      AV21PrdNom = "" ;
      AV16Lb_TaAuxCt = DecimalUtil.ZERO ;
      AV22ForPrdDsc = "" ;
      scmdbuf = "" ;
      H01G32_A486ForNumCol = new int[1] ;
      H01G32_A396EmprCod = new String[] {""} ;
      H01G32_A715PrdLin = new short[1] ;
      H01G33_A6315Lb_TaAuxCf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01G33_A6314Lb_TaAuxCi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01G33_A6310Lb_TaAuxC = new String[] {""} ;
      H01G33_A396EmprCod = new String[] {""} ;
      H01G33_A6311Lb_TaAuxD = new String[] {""} ;
      H01G33_A6313lb_TaAuxL = new short[1] ;
      A6315Lb_TaAuxCf = DecimalUtil.ZERO ;
      A6314Lb_TaAuxCi = DecimalUtil.ZERO ;
      A6311Lb_TaAuxD = "" ;
      AV35Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV36Emprnom = "" ;
      AV37Usurcod = "" ;
      GXv_int6 = new long[1] ;
      H01G34_A6313lb_TaAuxL = new short[1] ;
      H01G34_A6310Lb_TaAuxC = new String[] {""} ;
      H01G34_A396EmprCod = new String[] {""} ;
      H01G34_A719PrdNum = new String[] {""} ;
      H01G34_A718PrdNom = new String[] {""} ;
      H01G34_A6316Lb_TaAuxCt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01G34_A488ForPrdDsc = new String[] {""} ;
      H01G34_n488ForPrdDsc = new boolean[] {false} ;
      H01G34_A490ForPrdUMe = new byte[1] ;
      H01G34_A6317Lb_TauxOrd = new short[1] ;
      H01G34_A6378Lb_TauxLP = new short[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      GXv_int8 = new short[1] ;
      GXv_char3 = new String[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_int10 = new byte[1] ;
      GXv_int11 = new short[1] ;
      GXv_char4 = new String[1] ;
      GXv_int7 = new int[1] ;
      ucDvelop_confirmpanel_confirmar = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.productosfunciontablaalcali__default(),
         new Object[] {
             new Object[] {
            H01G32_A486ForNumCol, H01G32_A396EmprCod, H01G32_A715PrdLin
            }
            , new Object[] {
            H01G33_A6315Lb_TaAuxCf, H01G33_A6314Lb_TaAuxCi, H01G33_A6310Lb_TaAuxC, H01G33_A396EmprCod, H01G33_A6311Lb_TaAuxD, H01G33_A6313lb_TaAuxL
            }
            , new Object[] {
            H01G34_A6313lb_TaAuxL, H01G34_A6310Lb_TaAuxC, H01G34_A396EmprCod, H01G34_A719PrdNum, H01G34_A718PrdNom, H01G34_A6316Lb_TaAuxCt, H01G34_A488ForPrdDsc, H01G34_n488ForPrdDsc, H01G34_A490ForPrdUMe, H01G34_A6317Lb_TauxOrd,
            H01G34_A6378Lb_TauxLP
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavLb_taauxc_Enabled = 0 ;
      edtavLb_taauxd_Enabled = 0 ;
      edtavForcansum_Enabled = 0 ;
      edtavLb_taauxci_Enabled = 0 ;
      edtavLb_taauxcf_Enabled = 0 ;
      edtavLb_fam1_Enabled = 0 ;
      edtavLb_fam2_Enabled = 0 ;
      edtavLb_fam3_Enabled = 0 ;
      edtavLb_tauxlp_Enabled = 0 ;
      edtavPrdnum_Enabled = 0 ;
      edtavPrdnom_Enabled = 0 ;
      edtavLb_taauxct_Enabled = 0 ;
      edtavForprdume_Enabled = 0 ;
      edtavForprddsc_Enabled = 0 ;
      edtavLb_tauxord_Enabled = 0 ;
   }

   private byte wcpOAV9Lb_fam1 ;
   private byte wcpOAV10Lb_fam2 ;
   private byte wcpOAV11Lb_fam3 ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV9Lb_fam1 ;
   private byte AV10Lb_fam2 ;
   private byte AV11Lb_fam3 ;
   private byte A490ForPrdUMe ;
   private byte gxajaxcallmode ;
   private byte nGXWrapped ;
   private byte AV23ForPrdUMe ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte GXv_int10[] ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short A6313lb_TaAuxL ;
   private short A6378Lb_TauxLP ;
   private short AV29lb_TaAuxL ;
   private short A6317Lb_TauxOrd ;
   private short AV12Lprfor ;
   private short wbEnd ;
   private short wbStart ;
   private short AV18Lb_TauxLP ;
   private short AV19Lb_TauxOrd ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short A715PrdLin ;
   private short AV13Ens008 ;
   private short GXv_int8[] ;
   private short GXv_int11[] ;
   private int wcpOAV8ForNumCol ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_68 ;
   private int subGrid_Rows ;
   private int AV8ForNumCol ;
   private int nGXsfl_68_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavLb_taauxc_Enabled ;
   private int edtavLb_taauxd_Enabled ;
   private int edtavForcansum_Enabled ;
   private int edtavLb_taauxci_Enabled ;
   private int edtavLb_taauxcf_Enabled ;
   private int edtavLb_fam1_Enabled ;
   private int edtavLb_fam2_Enabled ;
   private int edtavLb_fam3_Enabled ;
   private int edtavGridcurrentpage_Visible ;
   private int subGrid_Islastpage ;
   private int edtavLb_tauxlp_Enabled ;
   private int edtavPrdnum_Enabled ;
   private int edtavPrdnom_Enabled ;
   private int edtavLb_taauxct_Enabled ;
   private int edtavForprdume_Enabled ;
   private int edtavForprddsc_Enabled ;
   private int edtavLb_tauxord_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int subGrid_Recordcount ;
   private int A486ForNumCol ;
   private int AV26PageToGo ;
   private int nGXsfl_68_fel_idx=1 ;
   private int GXv_int7[] ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavLb_tauxlp_Visible ;
   private int edtavPrdnum_Visible ;
   private int edtavPrdnom_Visible ;
   private int edtavLb_taauxct_Visible ;
   private int edtavForprdume_Visible ;
   private int edtavForprddsc_Visible ;
   private int edtavLb_tauxord_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV28GridPageCount ;
   private long AV27GridCurrentPage ;
   private long GRID_nCurrentRecord ;
   private long AV30NumeroRegistros ;
   private long GXt_int5 ;
   private long GXv_int6[] ;
   private java.math.BigDecimal wcpOAV7ForCanSum ;
   private java.math.BigDecimal AV7ForCanSum ;
   private java.math.BigDecimal A6316Lb_TaAuxCt ;
   private java.math.BigDecimal AV15Lb_TaAuxCi ;
   private java.math.BigDecimal AV14Lb_TaAuxCf ;
   private java.math.BigDecimal AV16Lb_TaAuxCt ;
   private java.math.BigDecimal A6315Lb_TaAuxCf ;
   private java.math.BigDecimal A6314Lb_TaAuxCi ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private String wcpOAV6EmprCod ;
   private String wcpOAV5Lb_TaAuxC ;
   private String Gridpaginationbar_Selectedpage ;
   private String Dvelop_confirmpanel_confirmar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV6EmprCod ;
   private String AV5Lb_TaAuxC ;
   private String sGXsfl_68_idx="0001" ;
   private String A396EmprCod ;
   private String A6310Lb_TaAuxC ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A488ForPrdDsc ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
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
   private String Dvelop_confirmpanel_confirmar_Title ;
   private String Dvelop_confirmpanel_confirmar_Confirmationtext ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_confirmar_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtavLb_taauxc_Internalname ;
   private String edtavLb_taauxc_Jsonclick ;
   private String edtavLb_taauxd_Internalname ;
   private String TempTags ;
   private String AV17Lb_TaAuxD ;
   private String edtavLb_taauxd_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String edtavForcansum_Internalname ;
   private String edtavForcansum_Jsonclick ;
   private String edtavLb_taauxci_Internalname ;
   private String edtavLb_taauxci_Jsonclick ;
   private String edtavLb_taauxcf_Internalname ;
   private String edtavLb_taauxcf_Jsonclick ;
   private String grpUnnamedgroup6_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String edtavLb_fam1_Internalname ;
   private String edtavLb_fam1_Jsonclick ;
   private String edtavLb_fam2_Internalname ;
   private String edtavLb_fam2_Jsonclick ;
   private String edtavLb_fam3_Internalname ;
   private String edtavLb_fam3_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavGridcurrentpage_Internalname ;
   private String edtavGridcurrentpage_Jsonclick ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLb_tauxlp_Internalname ;
   private String AV20PrdNum ;
   private String edtavPrdnum_Internalname ;
   private String AV21PrdNom ;
   private String edtavPrdnom_Internalname ;
   private String edtavLb_taauxct_Internalname ;
   private String edtavForprdume_Internalname ;
   private String AV22ForPrdDsc ;
   private String edtavForprddsc_Internalname ;
   private String edtavLb_tauxord_Internalname ;
   private String scmdbuf ;
   private String A6311Lb_TaAuxD ;
   private String AV35Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV36Emprnom ;
   private String AV37Usurcod ;
   private String sGXsfl_68_fel_idx="0001" ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String tblTabledvelop_confirmpanel_confirmar_Internalname ;
   private String Dvelop_confirmpanel_confirmar_Internalname ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavLb_tauxlp_Jsonclick ;
   private String edtavPrdnum_Jsonclick ;
   private String edtavPrdnom_Jsonclick ;
   private String edtavLb_taauxct_Jsonclick ;
   private String edtavForprdume_Jsonclick ;
   private String edtavForprddsc_Jsonclick ;
   private String edtavLb_tauxord_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n488ForPrdDsc ;
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
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_68_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_confirmar ;
   private IDataStoreProvider pr_default ;
   private int[] H01G32_A486ForNumCol ;
   private String[] H01G32_A396EmprCod ;
   private short[] H01G32_A715PrdLin ;
   private java.math.BigDecimal[] H01G33_A6315Lb_TaAuxCf ;
   private java.math.BigDecimal[] H01G33_A6314Lb_TaAuxCi ;
   private String[] H01G33_A6310Lb_TaAuxC ;
   private String[] H01G33_A396EmprCod ;
   private String[] H01G33_A6311Lb_TaAuxD ;
   private short[] H01G33_A6313lb_TaAuxL ;
   private short[] H01G34_A6313lb_TaAuxL ;
   private String[] H01G34_A6310Lb_TaAuxC ;
   private String[] H01G34_A396EmprCod ;
   private String[] H01G34_A719PrdNum ;
   private String[] H01G34_A718PrdNom ;
   private java.math.BigDecimal[] H01G34_A6316Lb_TaAuxCt ;
   private String[] H01G34_A488ForPrdDsc ;
   private boolean[] H01G34_n488ForPrdDsc ;
   private byte[] H01G34_A490ForPrdUMe ;
   private short[] H01G34_A6317Lb_TauxOrd ;
   private short[] H01G34_A6378Lb_TauxLP ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class productosfunciontablaalcali__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01G32", "SELECT ForNumCol, EmprCod, PrdLin FROM TXPLPRFOR WHERE EmprCod = ? and ForNumCol = ? ORDER BY EmprCod, ForNumCol, PrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01G33", "SELECT T1.Lb_TaAuxCf, T1.Lb_TaAuxCi, T1.Lb_TaAuxC, T1.EmprCod, T2.Lb_TaAuxD, T1.lb_TaAuxL FROM (TXPENS008 T1 INNER JOIN TXPENS005 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_TaAuxC = T1.Lb_TaAuxC) WHERE (T1.EmprCod = ? and T1.Lb_TaAuxC = ?) AND (? >= T1.Lb_TaAuxCi) AND (? <= T1.Lb_TaAuxCf) ORDER BY T1.EmprCod, T1.Lb_TaAuxC, T1.lb_TaAuxL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01G34", "SELECT T1.lb_TaAuxL, T1.Lb_TaAuxC, T1.EmprCod, T1.PrdNum, T2.PrdNom, T1.Lb_TaAuxCt, T3.ForPrdDsc, T1.ForPrdUMe, T1.Lb_TauxOrd, T1.Lb_TauxLP FROM ((TXPENS007 T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.Lb_TaAuxC = ? and T1.lb_TaAuxL = ? ORDER BY T1.EmprCod, T1.Lb_TaAuxC, T1.lb_TaAuxL, T1.Lb_TauxLP ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 60);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((String[]) buf[6])[0] = rslt.getString(7, 5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((short[]) buf[10])[0] = rslt.getShort(10);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 5);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 5);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

