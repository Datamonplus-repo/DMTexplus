package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class hojaderuta_fases_impl extends GXDataArea
{
   public hojaderuta_fases_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public hojaderuta_fases_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( hojaderuta_fases_impl.class ));
   }

   public hojaderuta_fases_impl( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavAccionesfases = new HTMLChoice();
      cmbFaseExteri = new HTMLChoice();
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
            A396EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV6BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCod), 8, 0));
               AV8BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8BarCodReo", GXutil.str( AV8BarCodReo, 1, 0));
               AV7BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodPar", AV7BarCodPar);
               AV22ProCod = httpContext.GetPar( "ProCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV22ProCod", AV22ProCod);
               AV23Prodsc = httpContext.GetPar( "Prodsc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV23Prodsc", AV23Prodsc);
               AV9BarExt = (byte)(GXutil.lval( httpContext.GetPar( "BarExt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9BarExt", GXutil.str( AV9BarExt, 1, 0));
               AV40Discod = (int)(GXutil.lval( httpContext.GetPar( "Discod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV40Discod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40Discod), 8, 0));
               AV41BarSit = (byte)(GXutil.lval( httpContext.GetPar( "BarSit"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV41BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41BarSit), 2, 0));
               AV42CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV42CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42CliCod), 6, 0));
               AV43Barunimed = httpContext.GetPar( "Barunimed") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV43Barunimed", AV43Barunimed);
               AV44Barpes = (short)(GXutil.lval( httpContext.GetPar( "Barpes"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV44Barpes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44Barpes), 4, 0));
               AV45BarSer = httpContext.GetPar( "BarSer") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV45BarSer", AV45BarSer);
               AV46PedidoCliente = httpContext.GetPar( "PedidoCliente") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV46PedidoCliente", AV46PedidoCliente);
               AV47BarColNom = httpContext.GetPar( "BarColNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV47BarColNom", AV47BarColNom);
               AV48BarColNum = (int)(GXutil.lval( httpContext.GetPar( "BarColNum"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV48BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48BarColNum), 6, 0));
               AV49BarPie = (int)(GXutil.lval( httpContext.GetPar( "BarPie"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV49BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49BarPie), 6, 0));
               AV50BarKgm = CommonUtil.decimalVal( httpContext.GetPar( "BarKgm"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV50BarKgm", GXutil.ltrimstr( AV50BarKgm, 9, 2));
               AV51BarMtr = CommonUtil.decimalVal( httpContext.GetPar( "BarMtr"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV51BarMtr", GXutil.ltrimstr( AV51BarMtr, 9, 2));
               AV52CliNom = httpContext.GetPar( "CliNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV52CliNom", AV52CliNom);
               AV53BarSerDsc = httpContext.GetPar( "BarSerDsc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV53BarSerDsc", AV53BarSerDsc);
               AV54BarAgrest = httpContext.GetPar( "BarAgrest") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV54BarAgrest", AV54BarAgrest);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARAGREST", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV54BarAgrest, "@!"))));
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
      nRC_GXsfl_107 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_107"))) ;
      nGXsfl_107_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_107_idx"))) ;
      sGXsfl_107_idx = httpContext.GetPar( "sGXsfl_107_idx") ;
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
      AV6BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      AV8BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      AV7BarCodPar = httpContext.GetPar( "BarCodPar") ;
      AV22ProCod = httpContext.GetPar( "ProCod") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      AV12EmprCod = httpContext.GetPar( "EmprCod") ;
      AV9BarExt = (byte)(GXutil.lval( httpContext.GetPar( "BarExt"))) ;
      AV26Tinamar = (short)(GXutil.lval( httpContext.GetPar( "Tinamar"))) ;
      AV38CtrlUsu = (short)(GXutil.lval( httpContext.GetPar( "CtrlUsu"))) ;
      AV24Station = httpContext.GetPar( "Station") ;
      AV54BarAgrest = httpContext.GetPar( "BarAgrest") ;
      AV58Pgmname = httpContext.GetPar( "Pgmname") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV6BarCod, AV8BarCodReo, AV7BarCodPar, AV22ProCod, A396EmprCod, AV12EmprCod, AV9BarExt, AV26Tinamar, AV38CtrlUsu, AV24Station, AV54BarAgrest, AV58Pgmname) ;
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
      pa1S42( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1S42( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = ((nGXWrapped==0) ? " data-HasEnter=\"false\" data-Skiponenter=\"false\"" : "") ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.pedidosclientesindetalle.hojaderuta_fases", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV8BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV7BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV22ProCod)),GXutil.URLEncode(GXutil.rtrim(AV23Prodsc)),GXutil.URLEncode(GXutil.ltrimstr(AV9BarExt,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV40Discod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV41BarSit,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV42CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV43Barunimed)),GXutil.URLEncode(GXutil.ltrimstr(AV44Barpes,4,0)),GXutil.URLEncode(GXutil.rtrim(AV45BarSer)),GXutil.URLEncode(GXutil.rtrim(AV46PedidoCliente)),GXutil.URLEncode(GXutil.rtrim(AV47BarColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV48BarColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV49BarPie,6,0)),GXutil.URLEncode(DecimalUtil.decToString(AV50BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(AV51BarMtr)),GXutil.URLEncode(GXutil.rtrim(AV52CliNom)),GXutil.URLEncode(GXutil.rtrim(AV53BarSerDsc)),GXutil.URLEncode(GXutil.rtrim(AV54BarAgrest))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","Prodsc","BarExt","Discod","BarSit","CliCod","Barunimed","Barpes","BarSer","PedidoCliente","BarColNom","BarColNum","BarPie","BarKgm","BarMtr","CliNom","BarSerDsc","BarAgrest"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTINAMAR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV26Tinamar), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCTRLUSU", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV38CtrlUsu), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV24Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARAGREST", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV54BarAgrest, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"HojadeRuta_Fases");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV58Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("pedidosclientesindetalle\\hojaderuta_fases:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_107", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_107, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV17GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV12EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vBAREXT", GXutil.ltrim( localUtil.ntoc( AV9BarExt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROCOD", GXutil.rtrim( AV22ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRODSC", GXutil.rtrim( AV23Prodsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vSI_RGTO", GXutil.ltrim( localUtil.ntoc( AV29Si_rgto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTINAMAR", GXutil.ltrim( localUtil.ntoc( AV26Tinamar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTINAMAR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV26Tinamar), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCTRLUSU", GXutil.ltrim( localUtil.ntoc( AV38CtrlUsu, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCTRLUSU", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV38CtrlUsu), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV27UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV24Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV24Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "PRODSC", GXutil.rtrim( A759ProDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vDISCOD", GXutil.ltrim( localUtil.ntoc( AV40Discod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSIT", GXutil.ltrim( localUtil.ntoc( AV41BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARUNIMED", GXutil.rtrim( AV43Barunimed));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPES", GXutil.ltrim( localUtil.ntoc( AV44Barpes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSERDSC", GXutil.rtrim( AV53BarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARAGREST", GXutil.rtrim( AV54BarAgrest));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARAGREST", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV54BarAgrest, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR", GXutil.rtrim( A130BarCodPar));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Grid_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Grid_titlescategories_Gridtitlescategories));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hascategories", GXutil.booltostr( Grid_empowerer_Hascategories));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Result));
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
         we1S42( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1S42( ) ;
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
      return formatLink("app.pedidosclientesindetalle.hojaderuta_fases", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV8BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV7BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV22ProCod)),GXutil.URLEncode(GXutil.rtrim(AV23Prodsc)),GXutil.URLEncode(GXutil.ltrimstr(AV9BarExt,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV40Discod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV41BarSit,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV42CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV43Barunimed)),GXutil.URLEncode(GXutil.ltrimstr(AV44Barpes,4,0)),GXutil.URLEncode(GXutil.rtrim(AV45BarSer)),GXutil.URLEncode(GXutil.rtrim(AV46PedidoCliente)),GXutil.URLEncode(GXutil.rtrim(AV47BarColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV48BarColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV49BarPie,6,0)),GXutil.URLEncode(DecimalUtil.decToString(AV50BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(AV51BarMtr)),GXutil.URLEncode(GXutil.rtrim(AV52CliNom)),GXutil.URLEncode(GXutil.rtrim(AV53BarSerDsc)),GXutil.URLEncode(GXutil.rtrim(AV54BarAgrest))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","Prodsc","BarExt","Discod","BarSit","CliCod","Barunimed","Barpes","BarSer","PedidoCliente","BarColNom","BarColNum","BarPie","BarKgm","BarMtr","CliNom","BarSerDsc","BarAgrest"})  ;
   }

   public String getPgmname( )
   {
      return "PedidosClienteSinDetalle.HojadeRuta_Fases" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Fases", "") ;
   }

   public void wb1S40( )
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
         app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table TableWithSelectableGrid", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "TableContent15", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcod_Internalname, httpContext.getMessage( "Nº Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV6BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV6BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV6BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Fases.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodreo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodreo_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreo_Internalname, GXutil.ltrim( localUtil.ntoc( AV8BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV8BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV8BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodreo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Fases.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodpar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodpar_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodpar_Internalname, GXutil.rtrim( AV7BarCodPar), GXutil.rtrim( localUtil.format( AV7BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodpar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodpar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Fases.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-7", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, lblTextblock1_Caption, "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(1), "HLP_PedidosClienteSinDetalle\\HojadeRuta_Fases.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV42CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV42CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV42CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Fases.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClinom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClinom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClinom_Internalname, GXutil.rtrim( AV52CliNom), GXutil.rtrim( localUtil.format( AV52CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClinom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClinom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Fases.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPedidocliente_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPedidocliente_Internalname, httpContext.getMessage( "Pedido Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPedidocliente_Internalname, GXutil.rtrim( AV46PedidoCliente), GXutil.rtrim( localUtil.format( AV46PedidoCliente, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPedidocliente_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPedidocliente_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Fases.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarser_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarser_Internalname, httpContext.getMessage( "Articulo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarser_Internalname, GXutil.rtrim( AV45BarSer), GXutil.rtrim( localUtil.format( AV45BarSer, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarser_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarser_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Fases.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnom_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnom_Internalname, GXutil.rtrim( AV47BarColNom), GXutil.rtrim( localUtil.format( AV47BarColNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Fases.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnum_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV48BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV48BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV48BarColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Fases.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarpie_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarpie_Internalname, httpContext.getMessage( "Piezas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarpie_Internalname, GXutil.ltrim( localUtil.ntoc( AV49BarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarpie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV49BarPie), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV49BarPie), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarpie_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarpie_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Fases.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarkgm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarkgm_Internalname, httpContext.getMessage( "Kilos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarkgm_Internalname, GXutil.ltrim( localUtil.ntoc( AV50BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarkgm_Enabled!=0) ? localUtil.format( AV50BarKgm, "ZZZZZ9.99") : localUtil.format( AV50BarKgm, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarkgm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarkgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Fases.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarmtr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarmtr_Internalname, httpContext.getMessage( "Metros", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarmtr_Internalname, GXutil.ltrim( localUtil.ntoc( AV51BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarmtr_Enabled!=0) ? localUtil.format( AV51BarMtr, "ZZZZZ9.99") : localUtil.format( AV51BarMtr, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarmtr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarmtr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Fases.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsertarlinea_Internalname, "gx.evt.setGridEvt("+GXutil.str( 107, 3, 0)+","+"null"+");", httpContext.getMessage( "Agregar Fase", ""), bttBtninsertarlinea_Jsonclick, 5, httpContext.getMessage( "Agregar Fase", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERTARLINEA\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PedidosClienteSinDetalle\\HojadeRuta_Fases.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnsalir_Internalname, "gx.evt.setGridEvt("+GXutil.str( 107, 3, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtnsalir_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOSALIR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PedidosClienteSinDetalle\\HojadeRuta_Fases.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol107( ) ;
      }
      if ( wbEnd == 107 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_107 = (int)(nGXsfl_107_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV16GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV17GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, "GRIDPAGINATIONBARContainer");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV58Pgmname), GXutil.rtrim( localUtil.format( AV58Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Fases.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 138,'',false,'" + sGXsfl_107_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavGridcurrentpage_Internalname, GXutil.ltrim( localUtil.ntoc( AV16GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV16GridCurrentPage), "ZZZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,138);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavGridcurrentpage_Jsonclick, 0, "Attribute", "", "", "", "", edtavGridcurrentpage_Visible, 1, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Fases.htm");
         wb_table1_139_1S42( true) ;
      }
      else
      {
         wb_table1_139_1S42( false) ;
      }
      return  ;
   }

   public void wb_table1_139_1S42e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_titlescategories.setProperty("GridTitlesCategories", Grid_titlescategories_Gridtitlescategories);
         ucGrid_titlescategories.render(context, "dvelop.gridtitlescategories", Grid_titlescategories_Internalname, "GRID_TITLESCATEGORIESContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasCategories", Grid_empowerer_Hascategories);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 107 )
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

   public void start1S42( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Fases", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1S40( ) ;
   }

   public void ws1S42( )
   {
      start1S42( ) ;
      evt1S42( ) ;
   }

   public void evt1S42( )
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
                           e111S42 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121S42 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINARLINEA.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131S42 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERTARLINEA'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsertarLinea' */
                           e141S42 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOSALIR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoSalir' */
                           e151S42 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 20), "VACCIONESFASES.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 19), "'DOABRIRFASELECTOR'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 13), "'DOMODIFICAR'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 20), "VACCIONESFASES.CLICK") == 0 ) )
                        {
                           nGXsfl_107_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_107_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_107_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1072( ) ;
                           cmbavAccionesfases.setName( cmbavAccionesfases.getInternalname() );
                           cmbavAccionesfases.setValue( httpContext.cgiGet( cmbavAccionesfases.getInternalname()) );
                           AV36AccionesFases = (short)(GXutil.lval( httpContext.cgiGet( cmbavAccionesfases.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavAccionesfases.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36AccionesFases), 4, 0));
                           A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
                           A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
                           A603MaqCodBis = httpContext.cgiGet( edtMaqCodBis_Internalname) ;
                           A152BarFasCon = GXutil.upper( httpContext.cgiGet( edtBarFasCon_Internalname)) ;
                           A153BarFasEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarFasEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A150BarFacTin = GXutil.upper( httpContext.cgiGet( edtBarFacTin_Internalname)) ;
                           A4905BarFasAcab = GXutil.upper( httpContext.cgiGet( edtBarFasAcab_Internalname)) ;
                           A4287BarFasFor = GXutil.upper( httpContext.cgiGet( edtBarFasFor_Internalname)) ;
                           A216BarTieTeo = localUtil.ctond( httpContext.cgiGet( edtBarTieTeo_Internalname)) ;
                           A215BarTieRea = localUtil.ctond( httpContext.cgiGet( edtBarTieRea_Internalname)) ;
                           A4442BarFasDTI = localUtil.ctot( httpContext.cgiGet( edtBarFasDTI_Internalname), 0) ;
                           n4442BarFasDTI = false ;
                           A4443BarFasDTF = localUtil.ctot( httpContext.cgiGet( edtBarFasDTF_Internalname), 0) ;
                           n4443BarFasDTF = false ;
                           A3837BarFasKgm = localUtil.ctond( httpContext.cgiGet( edtBarFasKgm_Internalname)) ;
                           n3837BarFasKgm = false ;
                           A3838BarFasMtr = localUtil.ctond( httpContext.cgiGet( edtBarFasMtr_Internalname)) ;
                           n3838BarFasMtr = false ;
                           A5048BarFasUsu = GXutil.upper( httpContext.cgiGet( edtBarFasUsu_Internalname)) ;
                           n5048BarFasUsu = false ;
                           A3836BarFasPri = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarFasPri_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           cmbFaseExteri.setName( cmbFaseExteri.getInternalname() );
                           cmbFaseExteri.setValue( httpContext.cgiGet( cmbFaseExteri.getInternalname()) );
                           A14262FaseExteri = (byte)(GXutil.lval( httpContext.cgiGet( cmbFaseExteri.getInternalname()))) ;
                           A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e161S42 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e171S42 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e181S42 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VACCIONESFASES.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e191S42 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "'DOABRIRFASELECTOR'") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoAbrirFaseLector' */
                                 e201S42 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "'DOMODIFICAR'") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoModificar' */
                                 e211S42 ();
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

   public void we1S42( )
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

   public void pa1S42( )
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
            GX_FocusControl = edtavGridcurrentpage_Internalname ;
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
      subsflControlProps_1072( ) ;
      while ( nGXsfl_107_idx <= nRC_GXsfl_107 )
      {
         sendrow_1072( ) ;
         nGXsfl_107_idx = ((subGrid_Islastpage==1)&&(nGXsfl_107_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_107_idx+1) ;
         sGXsfl_107_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_107_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1072( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 int AV6BarCod ,
                                 byte AV8BarCodReo ,
                                 String AV7BarCodPar ,
                                 String AV22ProCod ,
                                 String A396EmprCod ,
                                 String AV12EmprCod ,
                                 byte AV9BarExt ,
                                 short AV26Tinamar ,
                                 short AV38CtrlUsu ,
                                 String AV24Station ,
                                 String AV54BarAgrest ,
                                 String AV58Pgmname )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e171S42 ();
      GRID_nCurrentRecord = 0 ;
      rf1S42( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"HojadeRuta_Fases");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV58Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("pedidosclientesindetalle\\hojaderuta_fases:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARFASEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A153BarFasEst), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASEST", GXutil.ltrim( localUtil.ntoc( A153BarFasEst, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARFASFOR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A4287BarFasFor, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASFOR", GXutil.rtrim( A4287BarFasFor));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARFASACAB", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A4905BarFasAcab, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASACAB", GXutil.rtrim( A4905BarFasAcab));
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
      rf1S42( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV58Pgmname = "PedidosClienteSinDetalle.HojadeRuta_Fases" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58Pgmname", AV58Pgmname);
      Gx_err = (short)(0) ;
      edtavBarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcod_Enabled), 5, 0), true);
      edtavBarcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodreo_Enabled), 5, 0), true);
      edtavBarcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodpar_Enabled), 5, 0), true);
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavPedidocliente_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPedidocliente_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPedidocliente_Enabled), 5, 0), true);
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), true);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), true);
      edtavBarcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnum_Enabled), 5, 0), true);
      edtavBarpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpie_Enabled), 5, 0), true);
      edtavBarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm_Enabled), 5, 0), true);
      edtavBarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1S42( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(107) ;
      /* Execute user event: Refresh */
      e171S42 ();
      nGXsfl_107_idx = 1 ;
      sGXsfl_107_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_107_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1072( ) ;
      bGXsfl_107_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_1072( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         /* Using cursor H01S42 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV6BarCod), Byte.valueOf(AV8BarCodReo), AV7BarCodPar, AV22ProCod, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_107_idx = 1 ;
         sGXsfl_107_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_107_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1072( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A759ProDsc = H01S42_A759ProDsc[0] ;
            A758ProCod = H01S42_A758ProCod[0] ;
            A3836BarFasPri = H01S42_A3836BarFasPri[0] ;
            A5048BarFasUsu = H01S42_A5048BarFasUsu[0] ;
            n5048BarFasUsu = H01S42_n5048BarFasUsu[0] ;
            A3838BarFasMtr = H01S42_A3838BarFasMtr[0] ;
            n3838BarFasMtr = H01S42_n3838BarFasMtr[0] ;
            A3837BarFasKgm = H01S42_A3837BarFasKgm[0] ;
            n3837BarFasKgm = H01S42_n3837BarFasKgm[0] ;
            A4443BarFasDTF = H01S42_A4443BarFasDTF[0] ;
            n4443BarFasDTF = H01S42_n4443BarFasDTF[0] ;
            A4442BarFasDTI = H01S42_A4442BarFasDTI[0] ;
            n4442BarFasDTI = H01S42_n4442BarFasDTI[0] ;
            A215BarTieRea = H01S42_A215BarTieRea[0] ;
            A216BarTieTeo = H01S42_A216BarTieTeo[0] ;
            A4287BarFasFor = H01S42_A4287BarFasFor[0] ;
            A4905BarFasAcab = H01S42_A4905BarFasAcab[0] ;
            A150BarFacTin = H01S42_A150BarFacTin[0] ;
            A153BarFasEst = H01S42_A153BarFasEst[0] ;
            A152BarFasCon = H01S42_A152BarFasCon[0] ;
            A603MaqCodBis = H01S42_A603MaqCodBis[0] ;
            A460FasDsc = H01S42_A460FasDsc[0] ;
            A194BarOrdLin = H01S42_A194BarOrdLin[0] ;
            A457FasCod = H01S42_A457FasCod[0] ;
            A130BarCodPar = H01S42_A130BarCodPar[0] ;
            A132BarCodReo = H01S42_A132BarCodReo[0] ;
            A129BarCod = H01S42_A129BarCod[0] ;
            A460FasDsc = H01S42_A460FasDsc[0] ;
            A759ProDsc = H01S42_A759ProDsc[0] ;
            GXt_int1 = A14262FaseExteri ;
            GXv_int2[0] = GXt_int1 ;
            new app.lectoroptico.faseenexterior(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A457FasCod, GXv_int2) ;
            hojaderuta_fases_impl.this.GXt_int1 = GXv_int2[0] ;
            A14262FaseExteri = (byte)(GXt_int1) ;
            e181S42 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(107) ;
         wb1S40( ) ;
      }
      bGXsfl_107_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1S42( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARFASEST"+"_"+sGXsfl_107_idx, getSecureSignedToken( sGXsfl_107_idx, localUtil.format( DecimalUtil.doubleToDec(A153BarFasEst), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARFASFOR"+"_"+sGXsfl_107_idx, getSecureSignedToken( sGXsfl_107_idx, GXutil.rtrim( localUtil.format( A4287BarFasFor, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARFASACAB"+"_"+sGXsfl_107_idx, getSecureSignedToken( sGXsfl_107_idx, GXutil.rtrim( localUtil.format( A4905BarFasAcab, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTINAMAR", GXutil.ltrim( localUtil.ntoc( AV26Tinamar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTINAMAR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV26Tinamar), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCTRLUSU", GXutil.ltrim( localUtil.ntoc( AV38CtrlUsu, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCTRLUSU", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV38CtrlUsu), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV24Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV24Station, ""))));
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
      /* Using cursor H01S43 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV6BarCod), Byte.valueOf(AV8BarCodReo), AV7BarCodPar, AV22ProCod});
      GRID_nRecordCount = H01S43_AGRID_nRecordCount[0] ;
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
         gxgrgrid_refresh( subGrid_Rows, AV6BarCod, AV8BarCodReo, AV7BarCodPar, AV22ProCod, A396EmprCod, AV12EmprCod, AV9BarExt, AV26Tinamar, AV38CtrlUsu, AV24Station, AV54BarAgrest, AV58Pgmname) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV6BarCod, AV8BarCodReo, AV7BarCodPar, AV22ProCod, A396EmprCod, AV12EmprCod, AV9BarExt, AV26Tinamar, AV38CtrlUsu, AV24Station, AV54BarAgrest, AV58Pgmname) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV6BarCod, AV8BarCodReo, AV7BarCodPar, AV22ProCod, A396EmprCod, AV12EmprCod, AV9BarExt, AV26Tinamar, AV38CtrlUsu, AV24Station, AV54BarAgrest, AV58Pgmname) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV6BarCod, AV8BarCodReo, AV7BarCodPar, AV22ProCod, A396EmprCod, AV12EmprCod, AV9BarExt, AV26Tinamar, AV38CtrlUsu, AV24Station, AV54BarAgrest, AV58Pgmname) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV6BarCod, AV8BarCodReo, AV7BarCodPar, AV22ProCod, A396EmprCod, AV12EmprCod, AV9BarExt, AV26Tinamar, AV38CtrlUsu, AV24Station, AV54BarAgrest, AV58Pgmname) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV58Pgmname = "PedidosClienteSinDetalle.HojadeRuta_Fases" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58Pgmname", AV58Pgmname);
      Gx_err = (short)(0) ;
      edtavBarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcod_Enabled), 5, 0), true);
      edtavBarcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodreo_Enabled), 5, 0), true);
      edtavBarcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodpar_Enabled), 5, 0), true);
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavPedidocliente_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPedidocliente_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPedidocliente_Enabled), 5, 0), true);
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), true);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), true);
      edtavBarcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnum_Enabled), 5, 0), true);
      edtavBarpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpie_Enabled), 5, 0), true);
      edtavBarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm_Enabled), 5, 0), true);
      edtavBarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1S40( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e161S42 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         nRC_GXsfl_107 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_107"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV17GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         A759ProDsc = httpContext.cgiGet( "PRODSC") ;
         AV22ProCod = httpContext.cgiGet( "vPROCOD") ;
         AV12EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
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
         Dvelop_confirmpanel_eliminarlinea_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Title") ;
         Dvelop_confirmpanel_eliminarlinea_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Confirmationtext") ;
         Dvelop_confirmpanel_eliminarlinea_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminarlinea_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminarlinea_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminarlinea_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminarlinea_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Confirmtype") ;
         Grid_titlescategories_Gridinternalname = httpContext.cgiGet( "GRID_TITLESCATEGORIES_Gridinternalname") ;
         Grid_titlescategories_Gridtitlescategories = httpContext.cgiGet( "GRID_TITLESCATEGORIES_Gridtitlescategories") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hascategories = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hascategories")) ;
         Grid_empowerer_Fixedcolumns = httpContext.cgiGet( "GRID_EMPOWERER_Fixedcolumns") ;
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Dvelop_confirmpanel_eliminarlinea_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Result") ;
         /* Read variables values. */
         AV58Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV58Pgmname", AV58Pgmname);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGridcurrentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGridcurrentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGRIDCURRENTPAGE");
            GX_FocusControl = edtavGridcurrentpage_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV16GridCurrentPage = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16GridCurrentPage), 10, 0));
         }
         else
         {
            AV16GridCurrentPage = localUtil.ctol( httpContext.cgiGet( edtavGridcurrentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16GridCurrentPage), 10, 0));
         }
         /* Read subfile selected row values. */
         nGXsfl_107_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_107_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_107_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1072( ) ;
         if ( nGXsfl_107_idx > 0 )
         {
            cmbavAccionesfases.setName( cmbavAccionesfases.getInternalname() );
            cmbavAccionesfases.setValue( httpContext.cgiGet( cmbavAccionesfases.getInternalname()) );
            AV36AccionesFases = (short)(GXutil.lval( httpContext.cgiGet( cmbavAccionesfases.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, cmbavAccionesfases.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36AccionesFases), 4, 0));
            A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
            A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
            A603MaqCodBis = httpContext.cgiGet( edtMaqCodBis_Internalname) ;
            A152BarFasCon = GXutil.upper( httpContext.cgiGet( edtBarFasCon_Internalname)) ;
            A153BarFasEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarFasEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A150BarFacTin = GXutil.upper( httpContext.cgiGet( edtBarFacTin_Internalname)) ;
            A4905BarFasAcab = GXutil.upper( httpContext.cgiGet( edtBarFasAcab_Internalname)) ;
            A4287BarFasFor = GXutil.upper( httpContext.cgiGet( edtBarFasFor_Internalname)) ;
            A216BarTieTeo = localUtil.ctond( httpContext.cgiGet( edtBarTieTeo_Internalname)) ;
            A215BarTieRea = localUtil.ctond( httpContext.cgiGet( edtBarTieRea_Internalname)) ;
            A4442BarFasDTI = localUtil.ctot( httpContext.cgiGet( edtBarFasDTI_Internalname)) ;
            n4442BarFasDTI = false ;
            A4443BarFasDTF = localUtil.ctot( httpContext.cgiGet( edtBarFasDTF_Internalname)) ;
            n4443BarFasDTF = false ;
            A3837BarFasKgm = localUtil.ctond( httpContext.cgiGet( edtBarFasKgm_Internalname)) ;
            n3837BarFasKgm = false ;
            A3838BarFasMtr = localUtil.ctond( httpContext.cgiGet( edtBarFasMtr_Internalname)) ;
            n3838BarFasMtr = false ;
            A5048BarFasUsu = GXutil.upper( httpContext.cgiGet( edtBarFasUsu_Internalname)) ;
            n5048BarFasUsu = false ;
            A3836BarFasPri = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarFasPri_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            cmbFaseExteri.setName( cmbFaseExteri.getInternalname() );
            cmbFaseExteri.setValue( httpContext.cgiGet( cmbFaseExteri.getInternalname()) );
            A14262FaseExteri = (byte)(GXutil.lval( httpContext.cgiGet( cmbFaseExteri.getInternalname()))) ;
            A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"HojadeRuta_Fases");
         AV58Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV58Pgmname", AV58Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV58Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("pedidosclientesindetalle\\hojaderuta_fases:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
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
      e161S42 ();
      if (returnInSub) return;
   }

   public void e161S42( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char3 = AV24Station ;
      GXv_char4[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      hojaderuta_fases_impl.this.GXt_char3 = GXv_char4[0] ;
      AV24Station = GXt_char3 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Station", AV24Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV24Station, ""))));
      GXv_char4[0] = AV12EmprCod ;
      GXv_char5[0] = AV13EmprNom ;
      GXv_char6[0] = AV27UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV24Station, GXv_char4, GXv_char5, GXv_char6) ;
      hojaderuta_fases_impl.this.AV12EmprCod = GXv_char4[0] ;
      hojaderuta_fases_impl.this.AV13EmprNom = GXv_char5[0] ;
      hojaderuta_fases_impl.this.AV27UsurCod = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12EmprCod", AV12EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV27UsurCod", AV27UsurCod);
      GXt_int7 = (byte)(AV11Eliot) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV12EmprCod, httpContext.getMessage( "ELIOT", ""), GXv_int8) ;
      hojaderuta_fases_impl.this.GXt_int7 = GXv_int8[0] ;
      AV11Eliot = GXt_int7 ;
      GXt_int7 = (byte)(AV26Tinamar) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV12EmprCod, httpContext.getMessage( "TINAMA", ""), GXv_int8) ;
      hojaderuta_fases_impl.this.GXt_int7 = GXv_int8[0] ;
      AV26Tinamar = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Tinamar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26Tinamar), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTINAMAR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV26Tinamar), "ZZZ9")));
      GXt_int7 = (byte)(AV21Planing) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV12EmprCod, httpContext.getMessage( "PLANNC", ""), GXv_int8) ;
      hojaderuta_fases_impl.this.GXt_int7 = GXv_int8[0] ;
      AV21Planing = GXt_int7 ;
      GXt_int7 = (byte)(AV38CtrlUsu) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV12EmprCod, httpContext.getMessage( "CTRLOS", ""), GXv_int8) ;
      hojaderuta_fases_impl.this.GXt_int7 = GXv_int8[0] ;
      AV38CtrlUsu = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38CtrlUsu", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38CtrlUsu), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCTRLUSU", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV38CtrlUsu), "ZZZ9")));
      GXt_char3 = AV24Station ;
      GXv_char6[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char6) ;
      hojaderuta_fases_impl.this.GXt_char3 = GXv_char6[0] ;
      AV24Station = GXt_char3 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Station", AV24Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV24Station, ""))));
      GXv_char6[0] = AV12EmprCod ;
      GXv_char5[0] = AV13EmprNom ;
      GXv_char4[0] = AV27UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV24Station, GXv_char6, GXv_char5, GXv_char4) ;
      hojaderuta_fases_impl.this.AV12EmprCod = GXv_char6[0] ;
      hojaderuta_fases_impl.this.AV13EmprNom = GXv_char5[0] ;
      hojaderuta_fases_impl.this.AV27UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12EmprCod", AV12EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV27UsurCod", AV27UsurCod);
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_titlescategories_Gridinternalname = subGrid_Internalname ;
      ucGrid_titlescategories.sendProperty(context, "", false, Grid_titlescategories_Internalname, "GridInternalName", Grid_titlescategories_Gridinternalname);
      AV16GridCurrentPage = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16GridCurrentPage), 10, 0));
      edtavGridcurrentpage_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGridcurrentpage_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGridcurrentpage_Visible), 5, 0), true);
      AV17GridPageCount = -1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17GridPageCount), 10, 0));
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      lblTextblock1_Caption = ((GXutil.strcmp(AV54BarAgrest, "S")==0) ? httpContext.getMessage( "Atencion. Hoja de Ruta Agrupada", "") : "") ;
      httpContext.ajax_rsp_assign_prop("", false, lblTextblock1_Internalname, "Caption", lblTextblock1_Caption, true);
      AV55var_agrupacion = ((GXutil.strcmp(AV54BarAgrest, "S")==0) ? httpContext.getMessage( "Atencion. Hoja de Ruta Agrupada", "") : "") ;
      if ( GXutil.strcmp(AV54BarAgrest, "S") == 0 )
      {
         httpContext.GX_msglist.addItem(AV55var_agrupacion);
      }
   }

   public void e171S42( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      cmbavAccionesfases.setColumnHeaderClass( "WWActionGroupColumn" );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAccionesfases.getInternalname(), "Columnheaderclass", cmbavAccionesfases.getColumnHeaderClass(), !bGXsfl_107_Refreshing);
      edtBarOrdLin_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarOrdLin_Internalname, "Columnheaderclass", edtBarOrdLin_Columnheaderclass, !bGXsfl_107_Refreshing);
      edtFasCod_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Columnheaderclass", edtFasCod_Columnheaderclass, !bGXsfl_107_Refreshing);
      edtFasDsc_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Columnheaderclass", edtFasDsc_Columnheaderclass, !bGXsfl_107_Refreshing);
      edtMaqCodBis_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCodBis_Internalname, "Columnheaderclass", edtMaqCodBis_Columnheaderclass, !bGXsfl_107_Refreshing);
      edtBarFasCon_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasCon_Internalname, "Columnheaderclass", edtBarFasCon_Columnheaderclass, !bGXsfl_107_Refreshing);
      edtBarFasEst_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasEst_Internalname, "Columnheaderclass", edtBarFasEst_Columnheaderclass, !bGXsfl_107_Refreshing);
      edtBarFacTin_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFacTin_Internalname, "Columnheaderclass", edtBarFacTin_Columnheaderclass, !bGXsfl_107_Refreshing);
      edtBarFasAcab_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasAcab_Internalname, "Columnheaderclass", edtBarFasAcab_Columnheaderclass, !bGXsfl_107_Refreshing);
      edtBarFasFor_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasFor_Internalname, "Columnheaderclass", edtBarFasFor_Columnheaderclass, !bGXsfl_107_Refreshing);
      edtBarTieTeo_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTieTeo_Internalname, "Columnheaderclass", edtBarTieTeo_Columnheaderclass, !bGXsfl_107_Refreshing);
      edtBarTieRea_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTieRea_Internalname, "Columnheaderclass", edtBarTieRea_Columnheaderclass, !bGXsfl_107_Refreshing);
      edtBarFasDTI_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasDTI_Internalname, "Columnheaderclass", edtBarFasDTI_Columnheaderclass, !bGXsfl_107_Refreshing);
      edtBarFasDTF_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasDTF_Internalname, "Columnheaderclass", edtBarFasDTF_Columnheaderclass, !bGXsfl_107_Refreshing);
      edtBarFasKgm_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasKgm_Internalname, "Columnheaderclass", edtBarFasKgm_Columnheaderclass, !bGXsfl_107_Refreshing);
      edtBarFasMtr_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasMtr_Internalname, "Columnheaderclass", edtBarFasMtr_Columnheaderclass, !bGXsfl_107_Refreshing);
      cmbFaseExteri.setColumnHeaderClass( "WWColumn" );
      httpContext.ajax_rsp_assign_prop("", false, cmbFaseExteri.getInternalname(), "Columnheaderclass", cmbFaseExteri.getColumnHeaderClass(), !bGXsfl_107_Refreshing);
      GXt_int9 = AV37NumeroRegistros ;
      GXv_char6[0] = AV12EmprCod ;
      GXv_int10[0] = AV6BarCod ;
      GXv_int8[0] = AV8BarCodReo ;
      GXv_char5[0] = AV7BarCodPar ;
      GXv_int11[0] = GXt_int9 ;
      new app.registrostablabarfas(remoteHandle, context).execute( GXv_char6, GXv_int10, GXv_int8, GXv_char5, GXv_int11) ;
      hojaderuta_fases_impl.this.AV12EmprCod = GXv_char6[0] ;
      hojaderuta_fases_impl.this.AV6BarCod = GXv_int10[0] ;
      hojaderuta_fases_impl.this.AV8BarCodReo = GXv_int8[0] ;
      hojaderuta_fases_impl.this.AV7BarCodPar = GXv_char5[0] ;
      hojaderuta_fases_impl.this.GXt_int9 = GXv_int11[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12EmprCod", AV12EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV6BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV8BarCodReo", GXutil.str( AV8BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodPar", AV7BarCodPar);
      AV37NumeroRegistros = GXt_int9 ;
      AV17GridPageCount = (long)((AV37NumeroRegistros/ (double) (10))+1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17GridPageCount), 10, 0));
      /*  Sending Event outputs  */
   }

   private void e181S42( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavAccionesfases.removeAllItems();
      cmbavAccionesfases.addItem("0", ";fa fa-bars", (short)(0));
      cmbavAccionesfases.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Modificar", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      if ( A153BarFasEst == 0 )
      {
         cmbavAccionesfases.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      }
      cmbavAccionesfases.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "Observaciones", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavAccionesfases.addItem("4", GXutil.format( "%1;%2", httpContext.getMessage( "Parametros", ""), "fa fa-shapes", "", "", "", "", "", "", ""), (short)(0));
      if ( GXutil.strcmp(A4287BarFasFor, httpContext.getMessage( "S", "")) == 0 )
      {
         cmbavAccionesfases.addItem("5", GXutil.format( "%1;%2", httpContext.getMessage( "Tratamiento Quimico", ""), "menu-icon fas fa-microscope", "", "", "", "", "", "", ""), (short)(0));
      }
      cmbavAccionesfases.addItem("6", GXutil.format( "%1;%2", httpContext.getMessage( "Abrir/Duplicar", ""), "fa fa-folder-open", "", "", "", "", "", "", ""), (short)(0));
      if ( ( A14262FaseExteri == 0 ) && ( A3836BarFasPri > 0 ) && ( A153BarFasEst == 0 ) && ! GXutil.dateCompare(GXutil.nullDate(), A4443BarFasDTF) )
      {
         cmbavAccionesfases.setColumnClass( "WWActionGroupColumn WWColumnDanger WWColumnDangerFirstColumn" );
         edtBarOrdLin_Columnclass = "WWColumn WWColumnDanger" ;
         edtFasCod_Columnclass = "WWColumn WWColumnDanger" ;
         edtFasDsc_Columnclass = "WWColumn WWColumnDanger" ;
         edtMaqCodBis_Columnclass = "WWColumn WWColumnDanger" ;
         edtBarFasCon_Columnclass = "WWColumn WWColumnDanger" ;
         edtBarFasEst_Columnclass = "WWColumn WWColumnDanger" ;
         edtBarFacTin_Columnclass = "WWColumn WWColumnDanger" ;
         edtBarFasAcab_Columnclass = "WWColumn WWColumnDanger" ;
         edtBarFasFor_Columnclass = "WWColumn WWColumnDanger" ;
         edtBarTieTeo_Columnclass = "WWColumn WWColumnDanger" ;
         edtBarTieRea_Columnclass = "WWColumn WWColumnDanger" ;
         edtBarFasDTI_Columnclass = "WWColumn WWColumnDanger" ;
         edtBarFasDTF_Columnclass = "WWColumn WWColumnDanger" ;
         edtBarFasKgm_Columnclass = "WWColumn WWColumnDanger" ;
         edtBarFasMtr_Columnclass = "WWColumn WWColumnDanger" ;
         cmbFaseExteri.setColumnClass( "WWColumn WWColumnDanger" );
      }
      else if ( ( A14262FaseExteri == 0 ) && ( A153BarFasEst == 1 ) )
      {
         cmbavAccionesfases.setColumnClass( "WWActionGroupColumn WWColumnSuccess WWColumnSuccessFirstColumn" );
         edtBarOrdLin_Columnclass = "WWColumn WWColumnSuccess" ;
         edtFasCod_Columnclass = "WWColumn WWColumnSuccess" ;
         edtFasDsc_Columnclass = "WWColumn WWColumnSuccess" ;
         edtMaqCodBis_Columnclass = "WWColumn WWColumnSuccess" ;
         edtBarFasCon_Columnclass = "WWColumn WWColumnSuccess" ;
         edtBarFasEst_Columnclass = "WWColumn WWColumnSuccess" ;
         edtBarFacTin_Columnclass = "WWColumn WWColumnSuccess" ;
         edtBarFasAcab_Columnclass = "WWColumn WWColumnSuccess" ;
         edtBarFasFor_Columnclass = "WWColumn WWColumnSuccess" ;
         edtBarTieTeo_Columnclass = "WWColumn WWColumnSuccess" ;
         edtBarTieRea_Columnclass = "WWColumn WWColumnSuccess" ;
         edtBarFasDTI_Columnclass = "WWColumn WWColumnSuccess" ;
         edtBarFasDTF_Columnclass = "WWColumn WWColumnSuccess" ;
         edtBarFasKgm_Columnclass = "WWColumn WWColumnSuccess" ;
         edtBarFasMtr_Columnclass = "WWColumn WWColumnSuccess" ;
         cmbFaseExteri.setColumnClass( "WWColumn WWColumnSuccess" );
      }
      else if ( ( A14262FaseExteri == 0 ) && ( A153BarFasEst == 2 ) )
      {
         cmbavAccionesfases.setColumnClass( "WWActionGroupColumn WWColumnInfo WWColumnInfoFirstColumn" );
         edtBarOrdLin_Columnclass = "WWColumn WWColumnInfo" ;
         edtFasCod_Columnclass = "WWColumn WWColumnInfo" ;
         edtFasDsc_Columnclass = "WWColumn WWColumnInfo" ;
         edtMaqCodBis_Columnclass = "WWColumn WWColumnInfo" ;
         edtBarFasCon_Columnclass = "WWColumn WWColumnInfo" ;
         edtBarFasEst_Columnclass = "WWColumn WWColumnInfo" ;
         edtBarFacTin_Columnclass = "WWColumn WWColumnInfo" ;
         edtBarFasAcab_Columnclass = "WWColumn WWColumnInfo" ;
         edtBarFasFor_Columnclass = "WWColumn WWColumnInfo" ;
         edtBarTieTeo_Columnclass = "WWColumn WWColumnInfo" ;
         edtBarTieRea_Columnclass = "WWColumn WWColumnInfo" ;
         edtBarFasDTI_Columnclass = "WWColumn WWColumnInfo" ;
         edtBarFasDTF_Columnclass = "WWColumn WWColumnInfo" ;
         edtBarFasKgm_Columnclass = "WWColumn WWColumnInfo" ;
         edtBarFasMtr_Columnclass = "WWColumn WWColumnInfo" ;
         cmbFaseExteri.setColumnClass( "WWColumn WWColumnInfo" );
      }
      else
      {
         cmbavAccionesfases.setColumnClass( httpContext.getMessage( "WWActionGroupColumn", "") );
         edtBarOrdLin_Columnclass = httpContext.getMessage( "WWColumn", "") ;
         if ( ( AV9BarExt == 1 ) && ( A14262FaseExteri == 1 ) )
         {
            edtFasCod_Columnclass = "WWColumn WWColumnTag WWColumnTagWarning WWColumnTagWarningSingleCell" ;
         }
         else if ( ( AV9BarExt == 2 ) && ( A14262FaseExteri == 2 ) )
         {
            edtFasCod_Columnclass = "WWColumn WWColumnTag WWColumnTagSuccess WWColumnTagSuccessSingleCell" ;
         }
         else
         {
            edtFasCod_Columnclass = httpContext.getMessage( "WWColumn", "") ;
         }
         if ( ( AV9BarExt == 1 ) && ( A14262FaseExteri == 1 ) )
         {
            edtFasDsc_Columnclass = "WWColumn WWColumnTag WWColumnTagWarning WWColumnTagWarningSingleCell" ;
         }
         else if ( ( AV9BarExt == 2 ) && ( A14262FaseExteri == 2 ) )
         {
            edtFasDsc_Columnclass = "WWColumn WWColumnTag WWColumnTagSuccess WWColumnTagSuccessSingleCell" ;
         }
         else
         {
            edtFasDsc_Columnclass = httpContext.getMessage( "WWColumn", "") ;
         }
         edtMaqCodBis_Columnclass = httpContext.getMessage( "WWColumn", "") ;
         edtBarFasCon_Columnclass = httpContext.getMessage( "WWColumn", "") ;
         edtBarFasEst_Columnclass = httpContext.getMessage( "WWColumn", "") ;
         edtBarFacTin_Columnclass = httpContext.getMessage( "WWColumn", "") ;
         edtBarFasAcab_Columnclass = httpContext.getMessage( "WWColumn", "") ;
         edtBarFasFor_Columnclass = httpContext.getMessage( "WWColumn", "") ;
         edtBarTieTeo_Columnclass = httpContext.getMessage( "WWColumn", "") ;
         edtBarTieRea_Columnclass = httpContext.getMessage( "WWColumn", "") ;
         edtBarFasDTI_Columnclass = httpContext.getMessage( "WWColumn", "") ;
         edtBarFasDTF_Columnclass = httpContext.getMessage( "WWColumn", "") ;
         edtBarFasKgm_Columnclass = httpContext.getMessage( "WWColumn", "") ;
         edtBarFasMtr_Columnclass = httpContext.getMessage( "WWColumn", "") ;
         if ( ( AV9BarExt == 1 ) && ( A14262FaseExteri == 1 ) )
         {
            cmbFaseExteri.setColumnClass( "WWColumn WWColumnTag WWColumnTagWarning WWColumnTagWarningSingleCell" );
         }
         else if ( ( AV9BarExt == 2 ) && ( A14262FaseExteri == 2 ) )
         {
            cmbFaseExteri.setColumnClass( "WWColumn WWColumnTag WWColumnTagSuccess WWColumnTagSuccessSingleCell" );
         }
         else
         {
            cmbFaseExteri.setColumnClass( httpContext.getMessage( "WWColumn", "") );
         }
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(107) ;
      }
      sendrow_1072( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_107_Refreshing )
      {
         httpContext.doAjaxLoad(107, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavAccionesfases.setValue( GXutil.trim( GXutil.str( AV36AccionesFases, 4, 0)) );
   }

   public void e111S42( )
   {
      /* Gridpaginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gridpaginationbar_Selectedpage, "Previous") == 0 )
      {
         AV16GridCurrentPage = (long)(AV16GridCurrentPage-1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16GridCurrentPage), 10, 0));
         subgrid_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Gridpaginationbar_Selectedpage, "Next") == 0 )
      {
         AV16GridCurrentPage = (long)(AV16GridCurrentPage+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16GridCurrentPage), 10, 0));
         subgrid_nextpage( ) ;
      }
      else
      {
         AV20PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         AV16GridCurrentPage = AV20PageToGo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16GridCurrentPage), 10, 0));
         subgrid_gotopage( AV20PageToGo) ;
      }
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e121S42( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      AV16GridCurrentPage = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16GridCurrentPage), 10, 0));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e191S42( )
   {
      /* Accionesfases_Click Routine */
      returnInSub = false ;
      if ( AV36AccionesFases == 1 )
      {
         /* Execute user subroutine: 'DO UPDLINEA' */
         S112 ();
         if (returnInSub) return;
      }
      else if ( AV36AccionesFases == 2 )
      {
         /* Execute user subroutine: 'DO ELIMINARLINEA' */
         S122 ();
         if (returnInSub) return;
      }
      else if ( AV36AccionesFases == 3 )
      {
         /* Execute user subroutine: 'DO OBSERVACIONES' */
         S132 ();
         if (returnInSub) return;
      }
      else if ( AV36AccionesFases == 4 )
      {
         /* Execute user subroutine: 'DO PARAMETROS' */
         S142 ();
         if (returnInSub) return;
      }
      else if ( AV36AccionesFases == 5 )
      {
         /* Execute user subroutine: 'DO TRATAMIENTOQUIMICO' */
         S152 ();
         if (returnInSub) return;
      }
      else if ( AV36AccionesFases == 6 )
      {
         /* Execute user subroutine: 'DO ABRIRFASE' */
         S162 ();
         if (returnInSub) return;
      }
      AV36AccionesFases = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavAccionesfases.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36AccionesFases), 4, 0));
      /*  Sending Event outputs  */
      cmbavAccionesfases.setValue( GXutil.trim( GXutil.str( AV36AccionesFases, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAccionesfases.getInternalname(), "Values", cmbavAccionesfases.ToJavascriptSource(), true);
   }

   public void e131S42( )
   {
      /* Dvelop_confirmpanel_eliminarlinea_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminarlinea_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINARLINEA' */
         S172 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e141S42( )
   {
      /* 'DoInsertarLinea' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.insertarfaseenhdr", new String[] {GXutil.URLEncode(GXutil.rtrim(AV12EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV8BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV7BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV22ProCod)),GXutil.URLEncode(GXutil.rtrim(AV23Prodsc)),GXutil.URLEncode(GXutil.ltrimstr(AV9BarExt,1,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","Prodsc","BarExt"}) , new Object[] {"AV12EmprCod","AV6BarCod","AV8BarCodReo","AV7BarCodPar","AV22ProCod","AV23Prodsc","AV9BarExt"});
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e151S42( )
   {
      /* 'DoSalir' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S112( )
   {
      /* 'DO UPDLINEA' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.pedidosclientesindetalle.hojaderuta_fases_upd", new String[] {GXutil.URLEncode(GXutil.rtrim(AV12EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV8BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV7BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV22ProCod)),GXutil.URLEncode(GXutil.rtrim(AV23Prodsc)),GXutil.URLEncode(GXutil.ltrimstr(A194BarOrdLin,4,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","ProDsc","BarOrdLin"}) , new Object[] {"AV12EmprCod","AV6BarCod","AV8BarCodReo","AV7BarCodPar","AV22ProCod","AV23Prodsc","A194BarOrdLin"});
      httpContext.doAjaxRefresh();
   }

   public void S122( )
   {
      /* 'DO ELIMINARLINEA' Routine */
      returnInSub = false ;
      if ( A153BarFasEst != 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Esta fase esta en Produccion", ""));
      }
      else
      {
         Dvelop_confirmpanel_eliminarlinea_Confirmationtext = httpContext.getMessage( "¿Desea eliminar la linea ", "")+GXutil.trim( GXutil.str( A194BarOrdLin, 4, 0))+" "+GXutil.trim( A457FasCod)+" "+GXutil.trim( A460FasDsc) ;
         ucDvelop_confirmpanel_eliminarlinea.sendProperty(context, "", false, Dvelop_confirmpanel_eliminarlinea_Internalname, "ConfirmationText", Dvelop_confirmpanel_eliminarlinea_Confirmationtext);
         this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ELIMINARLINEAContainer", "Confirm", "", new Object[] {});
      }
   }

   public void S172( )
   {
      /* 'DO ACTION ELIMINARLINEA' Routine */
      returnInSub = false ;
      GXv_char6[0] = AV12EmprCod ;
      GXv_int10[0] = AV6BarCod ;
      GXv_int8[0] = AV8BarCodReo ;
      GXv_char5[0] = AV7BarCodPar ;
      GXv_char4[0] = AV22ProCod ;
      GXv_int2[0] = A194BarOrdLin ;
      new app.pprofs03(remoteHandle, context).execute( GXv_char6, GXv_int10, GXv_int8, GXv_char5, GXv_char4, GXv_int2) ;
      hojaderuta_fases_impl.this.AV12EmprCod = GXv_char6[0] ;
      hojaderuta_fases_impl.this.AV6BarCod = GXv_int10[0] ;
      hojaderuta_fases_impl.this.AV8BarCodReo = GXv_int8[0] ;
      hojaderuta_fases_impl.this.AV7BarCodPar = GXv_char5[0] ;
      hojaderuta_fases_impl.this.AV22ProCod = GXv_char4[0] ;
      hojaderuta_fases_impl.this.A194BarOrdLin = GXv_int2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12EmprCod", AV12EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV6BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV8BarCodReo", GXutil.str( AV8BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodPar", AV7BarCodPar);
      httpContext.ajax_rsp_assign_attri("", false, "AV22ProCod", AV22ProCod);
      new app.pcommit(remoteHandle, context).execute( ) ;
      if ( ( AV26Tinamar == 1 ) || ( AV38CtrlUsu == 1 ) )
      {
         GXv_char6[0] = A396EmprCod ;
         GXv_int10[0] = AV6BarCod ;
         GXv_int8[0] = AV8BarCodReo ;
         GXv_char5[0] = AV7BarCodPar ;
         GXv_char4[0] = AV27UsurCod ;
         new app.pctrusu(remoteHandle, context).execute( GXv_char6, GXv_int10, GXv_int8, GXv_char5, GXv_char4) ;
         hojaderuta_fases_impl.this.A396EmprCod = GXv_char6[0] ;
         hojaderuta_fases_impl.this.AV6BarCod = GXv_int10[0] ;
         hojaderuta_fases_impl.this.AV8BarCodReo = GXv_int8[0] ;
         hojaderuta_fases_impl.this.AV7BarCodPar = GXv_char5[0] ;
         hojaderuta_fases_impl.this.AV27UsurCod = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV6BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV8BarCodReo", GXutil.str( AV8BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodPar", AV7BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "AV27UsurCod", AV27UsurCod);
      }
      AV5Inc_obs = httpContext.getMessage( "Fase= ", "") + A457FasCod + httpContext.getMessage( " Linea= ", "") + GXutil.str( A194BarOrdLin, 4, 0) + httpContext.getMessage( " Eliminada", "") ;
      new app.pctrinc(remoteHandle, context).execute( AV12EmprCod, GXutil.substring( AV58Pgmname, 1, 10), GXutil.substring( AV27UsurCod, 1, 8), AV24Station, AV5Inc_obs, AV6BarCod, AV8BarCodReo, AV7BarCodPar) ;
      httpContext.doAjaxRefresh();
   }

   public void S132( )
   {
      /* 'DO OBSERVACIONES' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.tbarfso", new String[] {GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "UPD", ""))),GXutil.URLEncode(GXutil.rtrim(AV12EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV8BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV7BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV22ProCod)),GXutil.URLEncode(GXutil.ltrimstr(A194BarOrdLin,4,0)),GXutil.URLEncode(GXutil.rtrim(A457FasCod)),GXutil.URLEncode(GXutil.rtrim(A460FasDsc)),GXutil.URLEncode(GXutil.rtrim(AV23Prodsc))}, new String[] {"Mode","EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","BarOrdLin","FasCod","FasDsc","ProDsc"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S142( )
   {
      /* 'DO PARAMETROS' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.tfaspar", new String[] {GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "UPD", ""))),GXutil.URLEncode(GXutil.rtrim(AV12EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV8BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV7BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV22ProCod)),GXutil.URLEncode(GXutil.ltrimstr(A194BarOrdLin,4,0))}, new String[] {"Mode","EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","BarOrdLin"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S152( )
   {
      /* 'DO TRATAMIENTOQUIMICO' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(A4287BarFasFor, httpContext.getMessage( "S", "")) == 0 )
      {
         GXv_char6[0] = AV12EmprCod ;
         GXv_int10[0] = AV6BarCod ;
         GXv_int8[0] = AV8BarCodReo ;
         GXv_char5[0] = AV7BarCodPar ;
         GXv_char4[0] = AV22ProCod ;
         GXv_int2[0] = A194BarOrdLin ;
         new app.phdfpq(remoteHandle, context).execute( GXv_char6, GXv_int10, GXv_int8, GXv_char5, GXv_char4, GXv_int2) ;
         hojaderuta_fases_impl.this.AV12EmprCod = GXv_char6[0] ;
         hojaderuta_fases_impl.this.AV6BarCod = GXv_int10[0] ;
         hojaderuta_fases_impl.this.AV8BarCodReo = GXv_int8[0] ;
         hojaderuta_fases_impl.this.AV7BarCodPar = GXv_char5[0] ;
         hojaderuta_fases_impl.this.AV22ProCod = GXv_char4[0] ;
         hojaderuta_fases_impl.this.A194BarOrdLin = GXv_int2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12EmprCod", AV12EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV6BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV8BarCodReo", GXutil.str( AV8BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodPar", AV7BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "AV22ProCod", AV22ProCod);
         httpContext.popup(formatLink("app.thdfpq", new String[] {GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "UPD", ""))),GXutil.URLEncode(GXutil.rtrim(AV12EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV8BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV7BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV22ProCod)),GXutil.URLEncode(GXutil.ltrimstr(A194BarOrdLin,4,0))}, new String[] {"Mode","EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","BarOrdLin"}) , new Object[] {});
         if ( GXutil.strcmp(A4905BarFasAcab, httpContext.getMessage( "S", "")) == 0 )
         {
            GXv_char6[0] = AV12EmprCod ;
            GXv_int10[0] = AV6BarCod ;
            GXv_int8[0] = AV8BarCodReo ;
            GXv_char5[0] = AV7BarCodPar ;
            GXv_char4[0] = AV22ProCod ;
            new app.pacbquh(remoteHandle, context).execute( GXv_char6, GXv_int10, GXv_int8, GXv_char5, GXv_char4) ;
            hojaderuta_fases_impl.this.AV12EmprCod = GXv_char6[0] ;
            hojaderuta_fases_impl.this.AV6BarCod = GXv_int10[0] ;
            hojaderuta_fases_impl.this.AV8BarCodReo = GXv_int8[0] ;
            hojaderuta_fases_impl.this.AV7BarCodPar = GXv_char5[0] ;
            hojaderuta_fases_impl.this.AV22ProCod = GXv_char4[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12EmprCod", AV12EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV6BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV8BarCodReo", GXutil.str( AV8BarCodReo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodPar", AV7BarCodPar);
            httpContext.ajax_rsp_assign_attri("", false, "AV22ProCod", AV22ProCod);
         }
         httpContext.doAjaxRefresh();
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "La fase debe tener item Formula=S", ""));
      }
      if ( 0 == 1 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.home", new String[] {}, new String[] {}) , new Object[] {});
         httpContext.doAjaxRefresh();
      }
   }

   public void S162( )
   {
      /* 'DO ABRIRFASE' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.pedidosclientesindetalle.hojaderuta_fases_abrir", new String[] {GXutil.URLEncode(GXutil.rtrim(AV12EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV8BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV7BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV22ProCod)),GXutil.URLEncode(GXutil.rtrim(AV23Prodsc)),GXutil.URLEncode(GXutil.ltrimstr(A194BarOrdLin,4,0)),GXutil.URLEncode(GXutil.rtrim(A457FasCod)),GXutil.URLEncode(GXutil.rtrim(A460FasDsc)),GXutil.URLEncode(GXutil.ltrimstr(AV29Si_rgto,4,0))}, new String[] {"EmprCod","Barcod","BarCodReo","BarCodPar","Procod","Prodsc","Barordlin","FasCod","FasDsc","Si_rgto"}) , new Object[] {"AV12EmprCod","AV6BarCod","AV8BarCodReo","AV7BarCodPar","AV22ProCod","AV23Prodsc","A194BarOrdLin","A457FasCod","A460FasDsc","AV29Si_rgto"});
      httpContext.doAjaxRefresh();
   }

   public void e201S42( )
   {
      /* 'DoAbrirFaseLector' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.webwopenfas", new String[] {GXutil.URLEncode(GXutil.rtrim(AV12EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV8BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV7BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV22ProCod)),GXutil.URLEncode(GXutil.rtrim(AV23Prodsc)),GXutil.URLEncode(GXutil.ltrimstr(A194BarOrdLin,4,0)),GXutil.URLEncode(GXutil.rtrim(A457FasCod)),GXutil.URLEncode(GXutil.rtrim(A460FasDsc)),GXutil.URLEncode(GXutil.ltrimstr(AV29Si_rgto,4,0))}, new String[] {"EmprCod","Barcod","BarCodReo","BarCodPar","Procod","Prodsc","Barordlin","FasCod","FasDsc","Si_rgto"}) , new Object[] {"AV12EmprCod","AV6BarCod","AV8BarCodReo","AV7BarCodPar","AV22ProCod","AV23Prodsc","A194BarOrdLin","A457FasCod","A460FasDsc","AV29Si_rgto"});
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e211S42( )
   {
      /* 'DoModificar' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.wpwfasesmodif", new String[] {GXutil.URLEncode(GXutil.rtrim(AV12EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV8BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV7BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV22ProCod)),GXutil.URLEncode(GXutil.rtrim(AV23Prodsc)),GXutil.URLEncode(GXutil.ltrimstr(A194BarOrdLin,4,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","ProDsc","BarOrdLin"}) , new Object[] {"AV12EmprCod","AV6BarCod","AV8BarCodReo","AV7BarCodPar","AV22ProCod","AV23Prodsc","A194BarOrdLin"});
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void wb_table1_139_1S42( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_eliminarlinea_Internalname, tblTabledvelop_confirmpanel_eliminarlinea_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_eliminarlinea.setProperty("Title", Dvelop_confirmpanel_eliminarlinea_Title);
         ucDvelop_confirmpanel_eliminarlinea.setProperty("ConfirmationText", Dvelop_confirmpanel_eliminarlinea_Confirmationtext);
         ucDvelop_confirmpanel_eliminarlinea.setProperty("YesButtonCaption", Dvelop_confirmpanel_eliminarlinea_Yesbuttoncaption);
         ucDvelop_confirmpanel_eliminarlinea.setProperty("NoButtonCaption", Dvelop_confirmpanel_eliminarlinea_Nobuttoncaption);
         ucDvelop_confirmpanel_eliminarlinea.setProperty("CancelButtonCaption", Dvelop_confirmpanel_eliminarlinea_Cancelbuttoncaption);
         ucDvelop_confirmpanel_eliminarlinea.setProperty("YesButtonPosition", Dvelop_confirmpanel_eliminarlinea_Yesbuttonposition);
         ucDvelop_confirmpanel_eliminarlinea.setProperty("ConfirmType", Dvelop_confirmpanel_eliminarlinea_Confirmtype);
         ucDvelop_confirmpanel_eliminarlinea.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_eliminarlinea_Internalname, "DVELOP_CONFIRMPANEL_ELIMINARLINEAContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_ELIMINARLINEAContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_139_1S42e( true) ;
      }
      else
      {
         wb_table1_139_1S42e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      AV6BarCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCod), 8, 0));
      AV8BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8BarCodReo", GXutil.str( AV8BarCodReo, 1, 0));
      AV7BarCodPar = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodPar", AV7BarCodPar);
      AV22ProCod = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22ProCod", AV22ProCod);
      AV23Prodsc = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Prodsc", AV23Prodsc);
      AV9BarExt = ((Number) GXutil.testNumericType( getParm(obj,6), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9BarExt", GXutil.str( AV9BarExt, 1, 0));
      AV40Discod = ((Number) GXutil.testNumericType( getParm(obj,7), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Discod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40Discod), 8, 0));
      AV41BarSit = ((Number) GXutil.testNumericType( getParm(obj,8), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41BarSit), 2, 0));
      AV42CliCod = ((Number) GXutil.testNumericType( getParm(obj,9), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42CliCod), 6, 0));
      AV43Barunimed = (String)getParm(obj,10) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43Barunimed", AV43Barunimed);
      AV44Barpes = ((Number) GXutil.testNumericType( getParm(obj,11), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44Barpes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44Barpes), 4, 0));
      AV45BarSer = (String)getParm(obj,12) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45BarSer", AV45BarSer);
      AV46PedidoCliente = (String)getParm(obj,13) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46PedidoCliente", AV46PedidoCliente);
      AV47BarColNom = (String)getParm(obj,14) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47BarColNom", AV47BarColNom);
      AV48BarColNum = ((Number) GXutil.testNumericType( getParm(obj,15), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48BarColNum), 6, 0));
      AV49BarPie = ((Number) GXutil.testNumericType( getParm(obj,16), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49BarPie), 6, 0));
      AV50BarKgm = (java.math.BigDecimal)getParm(obj,17) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50BarKgm", GXutil.ltrimstr( AV50BarKgm, 9, 2));
      AV51BarMtr = (java.math.BigDecimal)getParm(obj,18) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51BarMtr", GXutil.ltrimstr( AV51BarMtr, 9, 2));
      AV52CliNom = (String)getParm(obj,19) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52CliNom", AV52CliNom);
      AV53BarSerDsc = (String)getParm(obj,20) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53BarSerDsc", AV53BarSerDsc);
      AV54BarAgrest = (String)getParm(obj,21) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54BarAgrest", AV54BarAgrest);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARAGREST", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV54BarAgrest, "@!"))));
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
      pa1S42( ) ;
      ws1S42( ) ;
      we1S42( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202681714193929", true, true);
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
         httpContext.AddJavascriptSource("pedidosclientesindetalle/hojaderuta_fases.js", "?202681714193929", false, true);
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
         httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_1072( )
   {
      cmbavAccionesfases.setInternalname( "vACCIONESFASES_"+sGXsfl_107_idx );
      edtBarOrdLin_Internalname = "BARORDLIN_"+sGXsfl_107_idx ;
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_107_idx ;
      edtFasDsc_Internalname = "FASDSC_"+sGXsfl_107_idx ;
      edtMaqCodBis_Internalname = "MAQCODBIS_"+sGXsfl_107_idx ;
      edtBarFasCon_Internalname = "BARFASCON_"+sGXsfl_107_idx ;
      edtBarFasEst_Internalname = "BARFASEST_"+sGXsfl_107_idx ;
      edtBarFacTin_Internalname = "BARFACTIN_"+sGXsfl_107_idx ;
      edtBarFasAcab_Internalname = "BARFASACAB_"+sGXsfl_107_idx ;
      edtBarFasFor_Internalname = "BARFASFOR_"+sGXsfl_107_idx ;
      edtBarTieTeo_Internalname = "BARTIETEO_"+sGXsfl_107_idx ;
      edtBarTieRea_Internalname = "BARTIEREA_"+sGXsfl_107_idx ;
      edtBarFasDTI_Internalname = "BARFASDTI_"+sGXsfl_107_idx ;
      edtBarFasDTF_Internalname = "BARFASDTF_"+sGXsfl_107_idx ;
      edtBarFasKgm_Internalname = "BARFASKGM_"+sGXsfl_107_idx ;
      edtBarFasMtr_Internalname = "BARFASMTR_"+sGXsfl_107_idx ;
      edtBarFasUsu_Internalname = "BARFASUSU_"+sGXsfl_107_idx ;
      edtBarFasPri_Internalname = "BARFASPRI_"+sGXsfl_107_idx ;
      cmbFaseExteri.setInternalname( "FASEEXTERI_"+sGXsfl_107_idx );
      edtProCod_Internalname = "PROCOD_"+sGXsfl_107_idx ;
   }

   public void subsflControlProps_fel_1072( )
   {
      cmbavAccionesfases.setInternalname( "vACCIONESFASES_"+sGXsfl_107_fel_idx );
      edtBarOrdLin_Internalname = "BARORDLIN_"+sGXsfl_107_fel_idx ;
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_107_fel_idx ;
      edtFasDsc_Internalname = "FASDSC_"+sGXsfl_107_fel_idx ;
      edtMaqCodBis_Internalname = "MAQCODBIS_"+sGXsfl_107_fel_idx ;
      edtBarFasCon_Internalname = "BARFASCON_"+sGXsfl_107_fel_idx ;
      edtBarFasEst_Internalname = "BARFASEST_"+sGXsfl_107_fel_idx ;
      edtBarFacTin_Internalname = "BARFACTIN_"+sGXsfl_107_fel_idx ;
      edtBarFasAcab_Internalname = "BARFASACAB_"+sGXsfl_107_fel_idx ;
      edtBarFasFor_Internalname = "BARFASFOR_"+sGXsfl_107_fel_idx ;
      edtBarTieTeo_Internalname = "BARTIETEO_"+sGXsfl_107_fel_idx ;
      edtBarTieRea_Internalname = "BARTIEREA_"+sGXsfl_107_fel_idx ;
      edtBarFasDTI_Internalname = "BARFASDTI_"+sGXsfl_107_fel_idx ;
      edtBarFasDTF_Internalname = "BARFASDTF_"+sGXsfl_107_fel_idx ;
      edtBarFasKgm_Internalname = "BARFASKGM_"+sGXsfl_107_fel_idx ;
      edtBarFasMtr_Internalname = "BARFASMTR_"+sGXsfl_107_fel_idx ;
      edtBarFasUsu_Internalname = "BARFASUSU_"+sGXsfl_107_fel_idx ;
      edtBarFasPri_Internalname = "BARFASPRI_"+sGXsfl_107_fel_idx ;
      cmbFaseExteri.setInternalname( "FASEEXTERI_"+sGXsfl_107_fel_idx );
      edtProCod_Internalname = "PROCOD_"+sGXsfl_107_fel_idx ;
   }

   public void sendrow_1072( )
   {
      subsflControlProps_1072( ) ;
      wb1S40( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_107_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_107_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_107_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavAccionesfases.getEnabled()!=0)&&(cmbavAccionesfases.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 108,'',false,'"+sGXsfl_107_idx+"',107)\"" : " ") ;
         if ( ( cmbavAccionesfases.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vACCIONESFASES_" + sGXsfl_107_idx ;
            cmbavAccionesfases.setName( GXCCtl );
            cmbavAccionesfases.setWebtags( "" );
            if ( cmbavAccionesfases.getItemCount() > 0 )
            {
               AV36AccionesFases = (short)(GXutil.lval( cmbavAccionesfases.getValidValue(GXutil.trim( GXutil.str( AV36AccionesFases, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavAccionesfases.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36AccionesFases), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavAccionesfases,cmbavAccionesfases.getInternalname(),GXutil.trim( GXutil.str( AV36AccionesFases, 4, 0)),Integer.valueOf(1),cmbavAccionesfases.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVACCIONESFASES.CLICK."+sGXsfl_107_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO",cmbavAccionesfases.getColumnClass(),cmbavAccionesfases.getColumnHeaderClass(),TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavAccionesfases.getEnabled()!=0)&&(cmbavAccionesfases.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,108);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavAccionesfases.setValue( GXutil.trim( GXutil.str( AV36AccionesFases, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAccionesfases.getInternalname(), "Values", cmbavAccionesfases.ToJavascriptSource(), !bGXsfl_107_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColum" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarOrdLin_Internalname,GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarOrdLin_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,edtBarOrdLin_Columnclass,edtBarOrdLin_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(107),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCod_Internalname,GXutil.rtrim( A457FasCod),GXutil.rtrim( localUtil.format( A457FasCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtFasCod_Columnclass,edtFasCod_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(107),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColum" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasDsc_Internalname,GXutil.rtrim( A460FasDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasDsc_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,edtFasDsc_Columnclass,edtFasDsc_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(107),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColum" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCodBis_Internalname,GXutil.rtrim( A603MaqCodBis),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqCodBis_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,edtMaqCodBis_Columnclass,edtMaqCodBis_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(107),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColum" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasCon_Internalname,GXutil.rtrim( A152BarFasCon),GXutil.rtrim( localUtil.format( A152BarFasCon, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasCon_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,edtBarFasCon_Columnclass,edtBarFasCon_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(107),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColum" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasEst_Internalname,GXutil.ltrim( localUtil.ntoc( A153BarFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A153BarFasEst), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasEst_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,edtBarFasEst_Columnclass,edtBarFasEst_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(107),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColum" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFacTin_Internalname,GXutil.rtrim( A150BarFacTin),GXutil.rtrim( localUtil.format( A150BarFacTin, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFacTin_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,edtBarFacTin_Columnclass,edtBarFacTin_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(107),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColum" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasAcab_Internalname,GXutil.rtrim( A4905BarFasAcab),GXutil.rtrim( localUtil.format( A4905BarFasAcab, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasAcab_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,edtBarFasAcab_Columnclass,edtBarFasAcab_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(107),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColum" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasFor_Internalname,GXutil.rtrim( A4287BarFasFor),GXutil.rtrim( localUtil.format( A4287BarFasFor, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasFor_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,edtBarFasFor_Columnclass,edtBarFasFor_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(107),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColum" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTieTeo_Internalname,GXutil.ltrim( localUtil.ntoc( A216BarTieTeo, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A216BarTieTeo, "Z9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarTieTeo_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,edtBarTieTeo_Columnclass,edtBarTieTeo_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(107),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColum" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTieRea_Internalname,GXutil.ltrim( localUtil.ntoc( A215BarTieRea, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A215BarTieRea, "Z9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarTieRea_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,edtBarTieRea_Columnclass,edtBarTieRea_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(107),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColum" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasDTI_Internalname,localUtil.ttoc( A4442BarFasDTI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A4442BarFasDTI, "99/99/99 99:99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasDTI_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,edtBarFasDTI_Columnclass,edtBarFasDTI_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(107),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColum" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasDTF_Internalname,localUtil.ttoc( A4443BarFasDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A4443BarFasDTF, "99/99/99 99:99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasDTF_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,edtBarFasDTF_Columnclass,edtBarFasDTF_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(107),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColum" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A3837BarFasKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A3837BarFasKgm, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasKgm_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,edtBarFasKgm_Columnclass,edtBarFasKgm_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(107),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColum" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A3838BarFasMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A3838BarFasMtr, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasMtr_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,edtBarFasMtr_Columnclass,edtBarFasMtr_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(107),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasUsu_Internalname,GXutil.rtrim( A5048BarFasUsu),GXutil.rtrim( localUtil.format( A5048BarFasUsu, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasUsu_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(107),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasPri_Internalname,GXutil.ltrim( localUtil.ntoc( A3836BarFasPri, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3836BarFasPri), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasPri_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(107),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         GXCCtl = "FASEEXTERI_" + sGXsfl_107_idx ;
         cmbFaseExteri.setName( GXCCtl );
         cmbFaseExteri.setWebtags( "" );
         cmbFaseExteri.addItem("1", httpContext.getMessage( "Enviada", ""), (short)(0));
         cmbFaseExteri.addItem("2", httpContext.getMessage( "Recepcionada", ""), (short)(0));
         cmbFaseExteri.addItem("0", httpContext.getMessage( "No", ""), (short)(0));
         if ( cmbFaseExteri.getItemCount() > 0 )
         {
            A14262FaseExteri = (byte)(GXutil.lval( cmbFaseExteri.getValidValue(GXutil.trim( GXutil.str( A14262FaseExteri, 1, 0))))) ;
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbFaseExteri,cmbFaseExteri.getInternalname(),GXutil.trim( GXutil.str( A14262FaseExteri, 1, 0)),Integer.valueOf(1),cmbFaseExteri.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute",cmbFaseExteri.getColumnClass(),cmbFaseExteri.getColumnHeaderClass(),"","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbFaseExteri.setValue( GXutil.trim( GXutil.str( A14262FaseExteri, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbFaseExteri.getInternalname(), "Values", cmbFaseExteri.ToJavascriptSource(), !bGXsfl_107_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProCod_Internalname,GXutil.rtrim( A758ProCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(107),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1S42( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_107_idx = ((subGrid_Islastpage==1)&&(nGXsfl_107_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_107_idx+1) ;
         sGXsfl_107_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_107_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1072( ) ;
      }
      /* End function sendrow_1072 */
   }

   public void startgridcontrol107( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"107\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ConvertToDDO"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColum"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Orden", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColum"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColum"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColum"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "C", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColum"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "E", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColum"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "T", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColum"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "A", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColum"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "F", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColum"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Teorico", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColum"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Real", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColum"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Inicio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColum"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fin", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColum"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColum"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Usuario", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "BarFasPri", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase Exterior", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cód. Proc.", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV36AccionesFases, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbavAccionesfases.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbavAccionesfases.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarOrdLin_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarOrdLin_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A457FasCod));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtFasCod_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtFasCod_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A460FasDsc));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtFasDsc_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtFasDsc_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A603MaqCodBis));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtMaqCodBis_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtMaqCodBis_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A152BarFasCon));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarFasCon_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarFasCon_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A153BarFasEst, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarFasEst_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarFasEst_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A150BarFacTin));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarFacTin_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarFacTin_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4905BarFasAcab));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarFasAcab_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarFasAcab_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4287BarFasFor));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarFasFor_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarFasFor_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A216BarTieTeo, (byte)(5), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarTieTeo_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarTieTeo_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A215BarTieRea, (byte)(5), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarTieRea_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarTieRea_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A4442BarFasDTI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarFasDTI_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarFasDTI_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A4443BarFasDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarFasDTF_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarFasDTF_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3837BarFasKgm, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarFasKgm_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarFasKgm_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3838BarFasMtr, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarFasMtr_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarFasMtr_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5048BarFasUsu));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3836BarFasPri, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14262FaseExteri, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbFaseExteri.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbFaseExteri.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A758ProCod));
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
      edtavBarcod_Internalname = "vBARCOD" ;
      edtavBarcodreo_Internalname = "vBARCODREO" ;
      edtavBarcodpar_Internalname = "vBARCODPAR" ;
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      edtavClicod_Internalname = "vCLICOD" ;
      edtavClinom_Internalname = "vCLINOM" ;
      edtavPedidocliente_Internalname = "vPEDIDOCLIENTE" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      edtavBarser_Internalname = "vBARSER" ;
      edtavBarcolnom_Internalname = "vBARCOLNOM" ;
      edtavBarcolnum_Internalname = "vBARCOLNUM" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      edtavBarpie_Internalname = "vBARPIE" ;
      edtavBarkgm_Internalname = "vBARKGM" ;
      edtavBarmtr_Internalname = "vBARMTR" ;
      divUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      bttBtninsertarlinea_Internalname = "BTNINSERTARLINEA" ;
      bttBtnsalir_Internalname = "BTNSALIR" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      cmbavAccionesfases.setInternalname( "vACCIONESFASES" );
      edtBarOrdLin_Internalname = "BARORDLIN" ;
      edtFasCod_Internalname = "FASCOD" ;
      edtFasDsc_Internalname = "FASDSC" ;
      edtMaqCodBis_Internalname = "MAQCODBIS" ;
      edtBarFasCon_Internalname = "BARFASCON" ;
      edtBarFasEst_Internalname = "BARFASEST" ;
      edtBarFacTin_Internalname = "BARFACTIN" ;
      edtBarFasAcab_Internalname = "BARFASACAB" ;
      edtBarFasFor_Internalname = "BARFASFOR" ;
      edtBarTieTeo_Internalname = "BARTIETEO" ;
      edtBarTieRea_Internalname = "BARTIEREA" ;
      edtBarFasDTI_Internalname = "BARFASDTI" ;
      edtBarFasDTF_Internalname = "BARFASDTF" ;
      edtBarFasKgm_Internalname = "BARFASKGM" ;
      edtBarFasMtr_Internalname = "BARFASMTR" ;
      edtBarFasUsu_Internalname = "BARFASUSU" ;
      edtBarFasPri_Internalname = "BARFASPRI" ;
      cmbFaseExteri.setInternalname( "FASEEXTERI" );
      edtProCod_Internalname = "PROCOD" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      Dvpanel_unnamedtable3_Internalname = "DVPANEL_UNNAMEDTABLE3" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavGridcurrentpage_Internalname = "vGRIDCURRENTPAGE" ;
      Dvelop_confirmpanel_eliminarlinea_Internalname = "DVELOP_CONFIRMPANEL_ELIMINARLINEA" ;
      tblTabledvelop_confirmpanel_eliminarlinea_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINARLINEA" ;
      Grid_titlescategories_Internalname = "GRID_TITLESCATEGORIES" ;
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
      subGrid_Allowhovering = (byte)(-1) ;
      subGrid_Allowselection = (byte)(1) ;
      subGrid_Header = "" ;
      edtProCod_Jsonclick = "" ;
      cmbFaseExteri.setJsonclick( "" );
      cmbFaseExteri.setColumnClass( "WWColumn" );
      edtBarFasPri_Jsonclick = "" ;
      edtBarFasUsu_Jsonclick = "" ;
      edtBarFasMtr_Jsonclick = "" ;
      edtBarFasMtr_Columnclass = "WWColumn" ;
      edtBarFasKgm_Jsonclick = "" ;
      edtBarFasKgm_Columnclass = "WWColumn" ;
      edtBarFasDTF_Jsonclick = "" ;
      edtBarFasDTF_Columnclass = "WWColumn" ;
      edtBarFasDTI_Jsonclick = "" ;
      edtBarFasDTI_Columnclass = "WWColumn" ;
      edtBarTieRea_Jsonclick = "" ;
      edtBarTieRea_Columnclass = "WWColumn" ;
      edtBarTieTeo_Jsonclick = "" ;
      edtBarTieTeo_Columnclass = "WWColumn" ;
      edtBarFasFor_Jsonclick = "" ;
      edtBarFasFor_Columnclass = "WWColumn" ;
      edtBarFasAcab_Jsonclick = "" ;
      edtBarFasAcab_Columnclass = "WWColumn" ;
      edtBarFacTin_Jsonclick = "" ;
      edtBarFacTin_Columnclass = "WWColumn" ;
      edtBarFasEst_Jsonclick = "" ;
      edtBarFasEst_Columnclass = "WWColumn" ;
      edtBarFasCon_Jsonclick = "" ;
      edtBarFasCon_Columnclass = "WWColumn" ;
      edtMaqCodBis_Jsonclick = "" ;
      edtMaqCodBis_Columnclass = "WWColumn" ;
      edtFasDsc_Jsonclick = "" ;
      edtFasDsc_Columnclass = "WWColumn" ;
      edtFasCod_Jsonclick = "" ;
      edtFasCod_Columnclass = "WWColumn" ;
      edtBarOrdLin_Jsonclick = "" ;
      edtBarOrdLin_Columnclass = "WWColumn" ;
      cmbavAccionesfases.setJsonclick( "" );
      cmbavAccionesfases.setVisible( -1 );
      cmbavAccionesfases.setEnabled( 1 );
      cmbavAccionesfases.setColumnClass( "WWActionGroupColumn" );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      cmbFaseExteri.setColumnHeaderClass( "" );
      edtBarFasMtr_Columnheaderclass = "" ;
      edtBarFasKgm_Columnheaderclass = "" ;
      edtBarFasDTF_Columnheaderclass = "" ;
      edtBarFasDTI_Columnheaderclass = "" ;
      edtBarTieRea_Columnheaderclass = "" ;
      edtBarTieTeo_Columnheaderclass = "" ;
      edtBarFasFor_Columnheaderclass = "" ;
      edtBarFasAcab_Columnheaderclass = "" ;
      edtBarFacTin_Columnheaderclass = "" ;
      edtBarFasEst_Columnheaderclass = "" ;
      edtBarFasCon_Columnheaderclass = "" ;
      edtMaqCodBis_Columnheaderclass = "" ;
      edtFasDsc_Columnheaderclass = "" ;
      edtFasCod_Columnheaderclass = "" ;
      edtBarOrdLin_Columnheaderclass = "" ;
      cmbavAccionesfases.setColumnHeaderClass( "" );
      edtavGridcurrentpage_Jsonclick = "" ;
      edtavGridcurrentpage_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavBarmtr_Jsonclick = "" ;
      edtavBarmtr_Enabled = 0 ;
      edtavBarkgm_Jsonclick = "" ;
      edtavBarkgm_Enabled = 0 ;
      edtavBarpie_Jsonclick = "" ;
      edtavBarpie_Enabled = 0 ;
      edtavBarcolnum_Jsonclick = "" ;
      edtavBarcolnum_Enabled = 0 ;
      edtavBarcolnom_Jsonclick = "" ;
      edtavBarcolnom_Enabled = 0 ;
      edtavBarser_Jsonclick = "" ;
      edtavBarser_Enabled = 0 ;
      edtavPedidocliente_Jsonclick = "" ;
      edtavPedidocliente_Enabled = 0 ;
      edtavClinom_Jsonclick = "" ;
      edtavClinom_Enabled = 0 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 0 ;
      lblTextblock1_Caption = httpContext.getMessage( "<p><strong>Atencion. Hoja de Ruta Agrupada</strong></p>", "") ;
      edtavBarcodpar_Jsonclick = "" ;
      edtavBarcodpar_Enabled = 0 ;
      edtavBarcodreo_Jsonclick = "" ;
      edtavBarcodreo_Enabled = 0 ;
      edtavBarcod_Jsonclick = "" ;
      edtavBarcod_Enabled = 0 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;;;;;;;;Tiempo;Tiempo;Fecha;Fecha;;;;;;" ;
      Dvelop_confirmpanel_eliminarlinea_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminarlinea_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminarlinea_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminarlinea_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminarlinea_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminarlinea_Confirmationtext = "¿Desea eliminar la linea?" ;
      Dvelop_confirmpanel_eliminarlinea_Title = "" ;
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
      Form.setCaption( httpContext.getMessage( "Fases", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vACCIONESFASES_" + sGXsfl_107_idx ;
      cmbavAccionesfases.setName( GXCCtl );
      cmbavAccionesfases.setWebtags( "" );
      if ( cmbavAccionesfases.getItemCount() > 0 )
      {
         AV36AccionesFases = (short)(GXutil.lval( cmbavAccionesfases.getValidValue(GXutil.trim( GXutil.str( AV36AccionesFases, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavAccionesfases.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36AccionesFases), 4, 0));
      }
      GXCCtl = "FASEEXTERI_" + sGXsfl_107_idx ;
      cmbFaseExteri.setName( GXCCtl );
      cmbFaseExteri.setWebtags( "" );
      cmbFaseExteri.addItem("1", httpContext.getMessage( "Enviada", ""), (short)(0));
      cmbFaseExteri.addItem("2", httpContext.getMessage( "Recepcionada", ""), (short)(0));
      cmbFaseExteri.addItem("0", httpContext.getMessage( "No", ""), (short)(0));
      if ( cmbFaseExteri.getItemCount() > 0 )
      {
         A14262FaseExteri = (byte)(GXutil.lval( cmbFaseExteri.getValidValue(GXutil.trim( GXutil.str( A14262FaseExteri, 1, 0))))) ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV22ProCod',fld:'vPROCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV9BarExt',fld:'vBAREXT',pic:'9'},{av:'AV12EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV8BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV26Tinamar',fld:'vTINAMAR',pic:'ZZZ9',hsh:true},{av:'AV38CtrlUsu',fld:'vCTRLUSU',pic:'ZZZ9',hsh:true},{av:'AV24Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV54BarAgrest',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV58Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'cmbavAccionesfases'},{av:'edtBarOrdLin_Columnheaderclass',ctrl:'BARORDLIN',prop:'Columnheaderclass'},{av:'edtFasCod_Columnheaderclass',ctrl:'FASCOD',prop:'Columnheaderclass'},{av:'edtFasDsc_Columnheaderclass',ctrl:'FASDSC',prop:'Columnheaderclass'},{av:'edtMaqCodBis_Columnheaderclass',ctrl:'MAQCODBIS',prop:'Columnheaderclass'},{av:'edtBarFasCon_Columnheaderclass',ctrl:'BARFASCON',prop:'Columnheaderclass'},{av:'edtBarFasEst_Columnheaderclass',ctrl:'BARFASEST',prop:'Columnheaderclass'},{av:'edtBarFacTin_Columnheaderclass',ctrl:'BARFACTIN',prop:'Columnheaderclass'},{av:'edtBarFasAcab_Columnheaderclass',ctrl:'BARFASACAB',prop:'Columnheaderclass'},{av:'edtBarFasFor_Columnheaderclass',ctrl:'BARFASFOR',prop:'Columnheaderclass'},{av:'edtBarTieTeo_Columnheaderclass',ctrl:'BARTIETEO',prop:'Columnheaderclass'},{av:'edtBarTieRea_Columnheaderclass',ctrl:'BARTIEREA',prop:'Columnheaderclass'},{av:'edtBarFasDTI_Columnheaderclass',ctrl:'BARFASDTI',prop:'Columnheaderclass'},{av:'edtBarFasDTF_Columnheaderclass',ctrl:'BARFASDTF',prop:'Columnheaderclass'},{av:'edtBarFasKgm_Columnheaderclass',ctrl:'BARFASKGM',prop:'Columnheaderclass'},{av:'edtBarFasMtr_Columnheaderclass',ctrl:'BARFASMTR',prop:'Columnheaderclass'},{av:'cmbFaseExteri'},{av:'AV17GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e181S42',iparms:[{av:'A153BarFasEst',fld:'BARFASEST',pic:'9',hsh:true},{av:'A4287BarFasFor',fld:'BARFASFOR',pic:'@!',hsh:true},{av:'cmbFaseExteri'},{av:'A14262FaseExteri',fld:'FASEEXTERI',pic:'9'},{av:'A3836BarFasPri',fld:'BARFASPRI',pic:'Z9'},{av:'A4443BarFasDTF',fld:'BARFASDTF',pic:'99/99/99 99:99:99'},{av:'AV9BarExt',fld:'vBAREXT',pic:'9'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavAccionesfases'},{av:'AV36AccionesFases',fld:'vACCIONESFASES',pic:'ZZZ9'},{av:'edtBarOrdLin_Columnclass',ctrl:'BARORDLIN',prop:'Columnclass'},{av:'edtFasCod_Columnclass',ctrl:'FASCOD',prop:'Columnclass'},{av:'edtFasDsc_Columnclass',ctrl:'FASDSC',prop:'Columnclass'},{av:'edtMaqCodBis_Columnclass',ctrl:'MAQCODBIS',prop:'Columnclass'},{av:'edtBarFasCon_Columnclass',ctrl:'BARFASCON',prop:'Columnclass'},{av:'edtBarFasEst_Columnclass',ctrl:'BARFASEST',prop:'Columnclass'},{av:'edtBarFacTin_Columnclass',ctrl:'BARFACTIN',prop:'Columnclass'},{av:'edtBarFasAcab_Columnclass',ctrl:'BARFASACAB',prop:'Columnclass'},{av:'edtBarFasFor_Columnclass',ctrl:'BARFASFOR',prop:'Columnclass'},{av:'edtBarTieTeo_Columnclass',ctrl:'BARTIETEO',prop:'Columnclass'},{av:'edtBarTieRea_Columnclass',ctrl:'BARTIEREA',prop:'Columnclass'},{av:'edtBarFasDTI_Columnclass',ctrl:'BARFASDTI',prop:'Columnclass'},{av:'edtBarFasDTF_Columnclass',ctrl:'BARFASDTF',prop:'Columnclass'},{av:'edtBarFasKgm_Columnclass',ctrl:'BARFASKGM',prop:'Columnclass'},{av:'edtBarFasMtr_Columnclass',ctrl:'BARFASMTR',prop:'Columnclass'},{av:'cmbFaseExteri'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e111S42',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV8BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV22ProCod',fld:'vPROCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV12EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9BarExt',fld:'vBAREXT',pic:'9'},{av:'AV26Tinamar',fld:'vTINAMAR',pic:'ZZZ9',hsh:true},{av:'AV38CtrlUsu',fld:'vCTRLUSU',pic:'ZZZ9',hsh:true},{av:'AV24Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV54BarAgrest',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV58Pgmname',fld:'vPGMNAME',pic:''},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'},{av:'AV16GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[{av:'AV16GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'cmbavAccionesfases'},{av:'edtBarOrdLin_Columnheaderclass',ctrl:'BARORDLIN',prop:'Columnheaderclass'},{av:'edtFasCod_Columnheaderclass',ctrl:'FASCOD',prop:'Columnheaderclass'},{av:'edtFasDsc_Columnheaderclass',ctrl:'FASDSC',prop:'Columnheaderclass'},{av:'edtMaqCodBis_Columnheaderclass',ctrl:'MAQCODBIS',prop:'Columnheaderclass'},{av:'edtBarFasCon_Columnheaderclass',ctrl:'BARFASCON',prop:'Columnheaderclass'},{av:'edtBarFasEst_Columnheaderclass',ctrl:'BARFASEST',prop:'Columnheaderclass'},{av:'edtBarFacTin_Columnheaderclass',ctrl:'BARFACTIN',prop:'Columnheaderclass'},{av:'edtBarFasAcab_Columnheaderclass',ctrl:'BARFASACAB',prop:'Columnheaderclass'},{av:'edtBarFasFor_Columnheaderclass',ctrl:'BARFASFOR',prop:'Columnheaderclass'},{av:'edtBarTieTeo_Columnheaderclass',ctrl:'BARTIETEO',prop:'Columnheaderclass'},{av:'edtBarTieRea_Columnheaderclass',ctrl:'BARTIEREA',prop:'Columnheaderclass'},{av:'edtBarFasDTI_Columnheaderclass',ctrl:'BARFASDTI',prop:'Columnheaderclass'},{av:'edtBarFasDTF_Columnheaderclass',ctrl:'BARFASDTF',prop:'Columnheaderclass'},{av:'edtBarFasKgm_Columnheaderclass',ctrl:'BARFASKGM',prop:'Columnheaderclass'},{av:'edtBarFasMtr_Columnheaderclass',ctrl:'BARFASMTR',prop:'Columnheaderclass'},{av:'cmbFaseExteri'},{av:'AV17GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e121S42',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV8BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV22ProCod',fld:'vPROCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV12EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9BarExt',fld:'vBAREXT',pic:'9'},{av:'AV26Tinamar',fld:'vTINAMAR',pic:'ZZZ9',hsh:true},{av:'AV38CtrlUsu',fld:'vCTRLUSU',pic:'ZZZ9',hsh:true},{av:'AV24Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV54BarAgrest',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV58Pgmname',fld:'vPGMNAME',pic:''},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV16GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("VACCIONESFASES.CLICK","{handler:'e191S42',iparms:[{av:'cmbavAccionesfases'},{av:'AV36AccionesFases',fld:'vACCIONESFASES',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV8BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV22ProCod',fld:'vPROCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV12EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9BarExt',fld:'vBAREXT',pic:'9'},{av:'AV26Tinamar',fld:'vTINAMAR',pic:'ZZZ9',hsh:true},{av:'AV38CtrlUsu',fld:'vCTRLUSU',pic:'ZZZ9',hsh:true},{av:'AV24Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV54BarAgrest',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV58Pgmname',fld:'vPGMNAME',pic:''},{av:'AV23Prodsc',fld:'vPRODSC',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9',hsh:true},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A4287BarFasFor',fld:'BARFASFOR',pic:'@!',hsh:true},{av:'A4905BarFasAcab',fld:'BARFASACAB',pic:'@!',hsh:true},{av:'AV29Si_rgto',fld:'vSI_RGTO',pic:'ZZZ9'}]");
      setEventMetadata("VACCIONESFASES.CLICK",",oparms:[{av:'cmbavAccionesfases'},{av:'AV36AccionesFases',fld:'vACCIONESFASES',pic:'ZZZ9'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV23Prodsc',fld:'vPRODSC',pic:''},{av:'AV22ProCod',fld:'vPROCOD',pic:''},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV8BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV12EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'Dvelop_confirmpanel_eliminarlinea_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_ELIMINARLINEA',prop:'ConfirmationText'},{av:'AV29Si_rgto',fld:'vSI_RGTO',pic:'ZZZ9'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'edtBarOrdLin_Columnheaderclass',ctrl:'BARORDLIN',prop:'Columnheaderclass'},{av:'edtFasCod_Columnheaderclass',ctrl:'FASCOD',prop:'Columnheaderclass'},{av:'edtFasDsc_Columnheaderclass',ctrl:'FASDSC',prop:'Columnheaderclass'},{av:'edtMaqCodBis_Columnheaderclass',ctrl:'MAQCODBIS',prop:'Columnheaderclass'},{av:'edtBarFasCon_Columnheaderclass',ctrl:'BARFASCON',prop:'Columnheaderclass'},{av:'edtBarFasEst_Columnheaderclass',ctrl:'BARFASEST',prop:'Columnheaderclass'},{av:'edtBarFacTin_Columnheaderclass',ctrl:'BARFACTIN',prop:'Columnheaderclass'},{av:'edtBarFasAcab_Columnheaderclass',ctrl:'BARFASACAB',prop:'Columnheaderclass'},{av:'edtBarFasFor_Columnheaderclass',ctrl:'BARFASFOR',prop:'Columnheaderclass'},{av:'edtBarTieTeo_Columnheaderclass',ctrl:'BARTIETEO',prop:'Columnheaderclass'},{av:'edtBarTieRea_Columnheaderclass',ctrl:'BARTIEREA',prop:'Columnheaderclass'},{av:'edtBarFasDTI_Columnheaderclass',ctrl:'BARFASDTI',prop:'Columnheaderclass'},{av:'edtBarFasDTF_Columnheaderclass',ctrl:'BARFASDTF',prop:'Columnheaderclass'},{av:'edtBarFasKgm_Columnheaderclass',ctrl:'BARFASKGM',prop:'Columnheaderclass'},{av:'edtBarFasMtr_Columnheaderclass',ctrl:'BARFASMTR',prop:'Columnheaderclass'},{av:'cmbFaseExteri'},{av:'AV17GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARLINEA.CLOSE","{handler:'e131S42',iparms:[{av:'Dvelop_confirmpanel_eliminarlinea_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINARLINEA',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV8BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV22ProCod',fld:'vPROCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV12EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9BarExt',fld:'vBAREXT',pic:'9'},{av:'AV26Tinamar',fld:'vTINAMAR',pic:'ZZZ9',hsh:true},{av:'AV38CtrlUsu',fld:'vCTRLUSU',pic:'ZZZ9',hsh:true},{av:'AV24Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV54BarAgrest',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV58Pgmname',fld:'vPGMNAME',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV27UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARLINEA.CLOSE",",oparms:[{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV22ProCod',fld:'vPROCOD',pic:''},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV8BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV12EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV27UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'cmbavAccionesfases'},{av:'edtBarOrdLin_Columnheaderclass',ctrl:'BARORDLIN',prop:'Columnheaderclass'},{av:'edtFasCod_Columnheaderclass',ctrl:'FASCOD',prop:'Columnheaderclass'},{av:'edtFasDsc_Columnheaderclass',ctrl:'FASDSC',prop:'Columnheaderclass'},{av:'edtMaqCodBis_Columnheaderclass',ctrl:'MAQCODBIS',prop:'Columnheaderclass'},{av:'edtBarFasCon_Columnheaderclass',ctrl:'BARFASCON',prop:'Columnheaderclass'},{av:'edtBarFasEst_Columnheaderclass',ctrl:'BARFASEST',prop:'Columnheaderclass'},{av:'edtBarFacTin_Columnheaderclass',ctrl:'BARFACTIN',prop:'Columnheaderclass'},{av:'edtBarFasAcab_Columnheaderclass',ctrl:'BARFASACAB',prop:'Columnheaderclass'},{av:'edtBarFasFor_Columnheaderclass',ctrl:'BARFASFOR',prop:'Columnheaderclass'},{av:'edtBarTieTeo_Columnheaderclass',ctrl:'BARTIETEO',prop:'Columnheaderclass'},{av:'edtBarTieRea_Columnheaderclass',ctrl:'BARTIEREA',prop:'Columnheaderclass'},{av:'edtBarFasDTI_Columnheaderclass',ctrl:'BARFASDTI',prop:'Columnheaderclass'},{av:'edtBarFasDTF_Columnheaderclass',ctrl:'BARFASDTF',prop:'Columnheaderclass'},{av:'edtBarFasKgm_Columnheaderclass',ctrl:'BARFASKGM',prop:'Columnheaderclass'},{av:'edtBarFasMtr_Columnheaderclass',ctrl:'BARFASMTR',prop:'Columnheaderclass'},{av:'cmbFaseExteri'},{av:'AV17GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOINSERTARLINEA'","{handler:'e141S42',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV8BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV22ProCod',fld:'vPROCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV12EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9BarExt',fld:'vBAREXT',pic:'9'},{av:'AV26Tinamar',fld:'vTINAMAR',pic:'ZZZ9',hsh:true},{av:'AV38CtrlUsu',fld:'vCTRLUSU',pic:'ZZZ9',hsh:true},{av:'AV24Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV54BarAgrest',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV58Pgmname',fld:'vPGMNAME',pic:''},{av:'AV23Prodsc',fld:'vPRODSC',pic:''}]");
      setEventMetadata("'DOINSERTARLINEA'",",oparms:[{av:'AV9BarExt',fld:'vBAREXT',pic:'9'},{av:'AV23Prodsc',fld:'vPRODSC',pic:''},{av:'AV22ProCod',fld:'vPROCOD',pic:''},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV8BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV12EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'cmbavAccionesfases'},{av:'edtBarOrdLin_Columnheaderclass',ctrl:'BARORDLIN',prop:'Columnheaderclass'},{av:'edtFasCod_Columnheaderclass',ctrl:'FASCOD',prop:'Columnheaderclass'},{av:'edtFasDsc_Columnheaderclass',ctrl:'FASDSC',prop:'Columnheaderclass'},{av:'edtMaqCodBis_Columnheaderclass',ctrl:'MAQCODBIS',prop:'Columnheaderclass'},{av:'edtBarFasCon_Columnheaderclass',ctrl:'BARFASCON',prop:'Columnheaderclass'},{av:'edtBarFasEst_Columnheaderclass',ctrl:'BARFASEST',prop:'Columnheaderclass'},{av:'edtBarFacTin_Columnheaderclass',ctrl:'BARFACTIN',prop:'Columnheaderclass'},{av:'edtBarFasAcab_Columnheaderclass',ctrl:'BARFASACAB',prop:'Columnheaderclass'},{av:'edtBarFasFor_Columnheaderclass',ctrl:'BARFASFOR',prop:'Columnheaderclass'},{av:'edtBarTieTeo_Columnheaderclass',ctrl:'BARTIETEO',prop:'Columnheaderclass'},{av:'edtBarTieRea_Columnheaderclass',ctrl:'BARTIEREA',prop:'Columnheaderclass'},{av:'edtBarFasDTI_Columnheaderclass',ctrl:'BARFASDTI',prop:'Columnheaderclass'},{av:'edtBarFasDTF_Columnheaderclass',ctrl:'BARFASDTF',prop:'Columnheaderclass'},{av:'edtBarFasKgm_Columnheaderclass',ctrl:'BARFASKGM',prop:'Columnheaderclass'},{av:'edtBarFasMtr_Columnheaderclass',ctrl:'BARFASMTR',prop:'Columnheaderclass'},{av:'cmbFaseExteri'},{av:'AV17GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOSALIR'","{handler:'e151S42',iparms:[]");
      setEventMetadata("'DOSALIR'",",oparms:[]}");
      setEventMetadata("'DOABRIRFASELECTOR'","{handler:'e201S42',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV8BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV22ProCod',fld:'vPROCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV12EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9BarExt',fld:'vBAREXT',pic:'9'},{av:'AV26Tinamar',fld:'vTINAMAR',pic:'ZZZ9',hsh:true},{av:'AV38CtrlUsu',fld:'vCTRLUSU',pic:'ZZZ9',hsh:true},{av:'AV24Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV54BarAgrest',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV58Pgmname',fld:'vPGMNAME',pic:''},{av:'AV23Prodsc',fld:'vPRODSC',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'AV29Si_rgto',fld:'vSI_RGTO',pic:'ZZZ9'}]");
      setEventMetadata("'DOABRIRFASELECTOR'",",oparms:[{av:'AV29Si_rgto',fld:'vSI_RGTO',pic:'ZZZ9'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV23Prodsc',fld:'vPRODSC',pic:''},{av:'AV22ProCod',fld:'vPROCOD',pic:''},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV8BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV12EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'cmbavAccionesfases'},{av:'edtBarOrdLin_Columnheaderclass',ctrl:'BARORDLIN',prop:'Columnheaderclass'},{av:'edtFasCod_Columnheaderclass',ctrl:'FASCOD',prop:'Columnheaderclass'},{av:'edtFasDsc_Columnheaderclass',ctrl:'FASDSC',prop:'Columnheaderclass'},{av:'edtMaqCodBis_Columnheaderclass',ctrl:'MAQCODBIS',prop:'Columnheaderclass'},{av:'edtBarFasCon_Columnheaderclass',ctrl:'BARFASCON',prop:'Columnheaderclass'},{av:'edtBarFasEst_Columnheaderclass',ctrl:'BARFASEST',prop:'Columnheaderclass'},{av:'edtBarFacTin_Columnheaderclass',ctrl:'BARFACTIN',prop:'Columnheaderclass'},{av:'edtBarFasAcab_Columnheaderclass',ctrl:'BARFASACAB',prop:'Columnheaderclass'},{av:'edtBarFasFor_Columnheaderclass',ctrl:'BARFASFOR',prop:'Columnheaderclass'},{av:'edtBarTieTeo_Columnheaderclass',ctrl:'BARTIETEO',prop:'Columnheaderclass'},{av:'edtBarTieRea_Columnheaderclass',ctrl:'BARTIEREA',prop:'Columnheaderclass'},{av:'edtBarFasDTI_Columnheaderclass',ctrl:'BARFASDTI',prop:'Columnheaderclass'},{av:'edtBarFasDTF_Columnheaderclass',ctrl:'BARFASDTF',prop:'Columnheaderclass'},{av:'edtBarFasKgm_Columnheaderclass',ctrl:'BARFASKGM',prop:'Columnheaderclass'},{av:'edtBarFasMtr_Columnheaderclass',ctrl:'BARFASMTR',prop:'Columnheaderclass'},{av:'cmbFaseExteri'},{av:'AV17GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOMODIFICAR'","{handler:'e211S42',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV8BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV22ProCod',fld:'vPROCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV12EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9BarExt',fld:'vBAREXT',pic:'9'},{av:'AV26Tinamar',fld:'vTINAMAR',pic:'ZZZ9',hsh:true},{av:'AV38CtrlUsu',fld:'vCTRLUSU',pic:'ZZZ9',hsh:true},{av:'AV24Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV54BarAgrest',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV58Pgmname',fld:'vPGMNAME',pic:''},{av:'AV23Prodsc',fld:'vPRODSC',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'}]");
      setEventMetadata("'DOMODIFICAR'",",oparms:[{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV23Prodsc',fld:'vPRODSC',pic:''},{av:'AV22ProCod',fld:'vPROCOD',pic:''},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV8BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV12EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'cmbavAccionesfases'},{av:'edtBarOrdLin_Columnheaderclass',ctrl:'BARORDLIN',prop:'Columnheaderclass'},{av:'edtFasCod_Columnheaderclass',ctrl:'FASCOD',prop:'Columnheaderclass'},{av:'edtFasDsc_Columnheaderclass',ctrl:'FASDSC',prop:'Columnheaderclass'},{av:'edtMaqCodBis_Columnheaderclass',ctrl:'MAQCODBIS',prop:'Columnheaderclass'},{av:'edtBarFasCon_Columnheaderclass',ctrl:'BARFASCON',prop:'Columnheaderclass'},{av:'edtBarFasEst_Columnheaderclass',ctrl:'BARFASEST',prop:'Columnheaderclass'},{av:'edtBarFacTin_Columnheaderclass',ctrl:'BARFACTIN',prop:'Columnheaderclass'},{av:'edtBarFasAcab_Columnheaderclass',ctrl:'BARFASACAB',prop:'Columnheaderclass'},{av:'edtBarFasFor_Columnheaderclass',ctrl:'BARFASFOR',prop:'Columnheaderclass'},{av:'edtBarTieTeo_Columnheaderclass',ctrl:'BARTIETEO',prop:'Columnheaderclass'},{av:'edtBarTieRea_Columnheaderclass',ctrl:'BARTIEREA',prop:'Columnheaderclass'},{av:'edtBarFasDTI_Columnheaderclass',ctrl:'BARFASDTI',prop:'Columnheaderclass'},{av:'edtBarFasDTF_Columnheaderclass',ctrl:'BARFASDTF',prop:'Columnheaderclass'},{av:'edtBarFasKgm_Columnheaderclass',ctrl:'BARFASKGM',prop:'Columnheaderclass'},{av:'edtBarFasMtr_Columnheaderclass',ctrl:'BARFASMTR',prop:'Columnheaderclass'},{av:'cmbFaseExteri'},{av:'AV17GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("VALIDV_BARCOD","{handler:'validv_Barcod',iparms:[]");
      setEventMetadata("VALIDV_BARCOD",",oparms:[]}");
      setEventMetadata("VALIDV_BARCODREO","{handler:'validv_Barcodreo',iparms:[]");
      setEventMetadata("VALIDV_BARCODREO",",oparms:[]}");
      setEventMetadata("VALIDV_BARCODPAR","{handler:'validv_Barcodpar',iparms:[]");
      setEventMetadata("VALIDV_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[]");
      setEventMetadata("VALID_FASCOD",",oparms:[]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[]");
      setEventMetadata("VALID_PROCOD",",oparms:[]}");
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
      wcpOAV7BarCodPar = "" ;
      wcpOAV22ProCod = "" ;
      wcpOAV23Prodsc = "" ;
      wcpOAV43Barunimed = "" ;
      wcpOAV45BarSer = "" ;
      wcpOAV46PedidoCliente = "" ;
      wcpOAV47BarColNom = "" ;
      wcpOAV50BarKgm = DecimalUtil.ZERO ;
      wcpOAV51BarMtr = DecimalUtil.ZERO ;
      wcpOAV52CliNom = "" ;
      wcpOAV53BarSerDsc = "" ;
      wcpOAV54BarAgrest = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Dvelop_confirmpanel_eliminarlinea_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      AV7BarCodPar = "" ;
      AV22ProCod = "" ;
      AV23Prodsc = "" ;
      AV43Barunimed = "" ;
      AV45BarSer = "" ;
      AV46PedidoCliente = "" ;
      AV47BarColNom = "" ;
      AV50BarKgm = DecimalUtil.ZERO ;
      AV51BarMtr = DecimalUtil.ZERO ;
      AV52CliNom = "" ;
      AV53BarSerDsc = "" ;
      AV54BarAgrest = "" ;
      AV12EmprCod = "" ;
      AV24Station = "" ;
      AV58Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV27UsurCod = "" ;
      A759ProDsc = "" ;
      A130BarCodPar = "" ;
      Grid_titlescategories_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      lblTextblock1_Jsonclick = "" ;
      TempTags = "" ;
      bttBtninsertarlinea_Jsonclick = "" ;
      bttBtnsalir_Jsonclick = "" ;
      ucDvpanel_unnamedtable3 = new com.genexus.webpanels.GXUserControl();
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A603MaqCodBis = "" ;
      A152BarFasCon = "" ;
      A150BarFacTin = "" ;
      A4905BarFasAcab = "" ;
      A4287BarFasFor = "" ;
      A216BarTieTeo = DecimalUtil.ZERO ;
      A215BarTieRea = DecimalUtil.ZERO ;
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      A3837BarFasKgm = DecimalUtil.ZERO ;
      A3838BarFasMtr = DecimalUtil.ZERO ;
      A5048BarFasUsu = "" ;
      A758ProCod = "" ;
      scmdbuf = "" ;
      H01S42_A759ProDsc = new String[] {""} ;
      H01S42_A758ProCod = new String[] {""} ;
      H01S42_A3836BarFasPri = new byte[1] ;
      H01S42_A5048BarFasUsu = new String[] {""} ;
      H01S42_n5048BarFasUsu = new boolean[] {false} ;
      H01S42_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01S42_n3838BarFasMtr = new boolean[] {false} ;
      H01S42_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01S42_n3837BarFasKgm = new boolean[] {false} ;
      H01S42_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      H01S42_n4443BarFasDTF = new boolean[] {false} ;
      H01S42_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      H01S42_n4442BarFasDTI = new boolean[] {false} ;
      H01S42_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01S42_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01S42_A4287BarFasFor = new String[] {""} ;
      H01S42_A4905BarFasAcab = new String[] {""} ;
      H01S42_A150BarFacTin = new String[] {""} ;
      H01S42_A153BarFasEst = new byte[1] ;
      H01S42_A152BarFasCon = new String[] {""} ;
      H01S42_A603MaqCodBis = new String[] {""} ;
      H01S42_A460FasDsc = new String[] {""} ;
      H01S42_A194BarOrdLin = new short[1] ;
      H01S42_A396EmprCod = new String[] {""} ;
      H01S42_A457FasCod = new String[] {""} ;
      H01S42_A130BarCodPar = new String[] {""} ;
      H01S42_A132BarCodReo = new byte[1] ;
      H01S42_A129BarCod = new int[1] ;
      H01S43_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV13EmprNom = "" ;
      GXt_char3 = "" ;
      AV55var_agrupacion = "" ;
      GXv_int11 = new long[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      ucDvelop_confirmpanel_eliminarlinea = new com.genexus.webpanels.GXUserControl();
      AV5Inc_obs = "" ;
      GXv_int2 = new short[1] ;
      GXv_char6 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_int8 = new byte[1] ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.hojaderuta_fases__default(),
         new Object[] {
             new Object[] {
            H01S42_A759ProDsc, H01S42_A758ProCod, H01S42_A3836BarFasPri, H01S42_A5048BarFasUsu, H01S42_n5048BarFasUsu, H01S42_A3838BarFasMtr, H01S42_n3838BarFasMtr, H01S42_A3837BarFasKgm, H01S42_n3837BarFasKgm, H01S42_A4443BarFasDTF,
            H01S42_n4443BarFasDTF, H01S42_A4442BarFasDTI, H01S42_n4442BarFasDTI, H01S42_A215BarTieRea, H01S42_A216BarTieTeo, H01S42_A4287BarFasFor, H01S42_A4905BarFasAcab, H01S42_A150BarFacTin, H01S42_A153BarFasEst, H01S42_A152BarFasCon,
            H01S42_A603MaqCodBis, H01S42_A460FasDsc, H01S42_A194BarOrdLin, H01S42_A396EmprCod, H01S42_A457FasCod, H01S42_A130BarCodPar, H01S42_A132BarCodReo, H01S42_A129BarCod
            }
            , new Object[] {
            H01S43_AGRID_nRecordCount
            }
         }
      );
      AV58Pgmname = "PedidosClienteSinDetalle.HojadeRuta_Fases" ;
      /* GeneXus formulas. */
      AV58Pgmname = "PedidosClienteSinDetalle.HojadeRuta_Fases" ;
      Gx_err = (short)(0) ;
      edtavBarcod_Enabled = 0 ;
      edtavBarcodreo_Enabled = 0 ;
      edtavBarcodpar_Enabled = 0 ;
      edtavClicod_Enabled = 0 ;
      edtavClinom_Enabled = 0 ;
      edtavPedidocliente_Enabled = 0 ;
      edtavBarser_Enabled = 0 ;
      edtavBarcolnom_Enabled = 0 ;
      edtavBarcolnum_Enabled = 0 ;
      edtavBarpie_Enabled = 0 ;
      edtavBarkgm_Enabled = 0 ;
      edtavBarmtr_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV8BarCodReo ;
   private byte wcpOAV9BarExt ;
   private byte wcpOAV41BarSit ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV8BarCodReo ;
   private byte AV9BarExt ;
   private byte AV41BarSit ;
   private byte gxajaxcallmode ;
   private byte nGXWrapped ;
   private byte A132BarCodReo ;
   private byte A153BarFasEst ;
   private byte A3836BarFasPri ;
   private byte A14262FaseExteri ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV44Barpes ;
   private short AV44Barpes ;
   private short AV26Tinamar ;
   private short AV38CtrlUsu ;
   private short AV29Si_rgto ;
   private short wbEnd ;
   private short wbStart ;
   private short AV36AccionesFases ;
   private short A194BarOrdLin ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short GXt_int1 ;
   private short AV11Eliot ;
   private short AV21Planing ;
   private short GXv_int2[] ;
   private int wcpOAV6BarCod ;
   private int wcpOAV40Discod ;
   private int wcpOAV42CliCod ;
   private int wcpOAV48BarColNum ;
   private int wcpOAV49BarPie ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_107 ;
   private int subGrid_Rows ;
   private int AV6BarCod ;
   private int AV40Discod ;
   private int AV42CliCod ;
   private int AV48BarColNum ;
   private int AV49BarPie ;
   private int nGXsfl_107_idx=1 ;
   private int A129BarCod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavBarcod_Enabled ;
   private int edtavBarcodreo_Enabled ;
   private int edtavBarcodpar_Enabled ;
   private int edtavClicod_Enabled ;
   private int edtavClinom_Enabled ;
   private int edtavPedidocliente_Enabled ;
   private int edtavBarser_Enabled ;
   private int edtavBarcolnom_Enabled ;
   private int edtavBarcolnum_Enabled ;
   private int edtavBarpie_Enabled ;
   private int edtavBarkgm_Enabled ;
   private int edtavBarmtr_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavGridcurrentpage_Visible ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV20PageToGo ;
   private int GXv_int10[] ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV17GridPageCount ;
   private long AV16GridCurrentPage ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private long AV37NumeroRegistros ;
   private long GXt_int9 ;
   private long GXv_int11[] ;
   private java.math.BigDecimal wcpOAV50BarKgm ;
   private java.math.BigDecimal wcpOAV51BarMtr ;
   private java.math.BigDecimal AV50BarKgm ;
   private java.math.BigDecimal AV51BarMtr ;
   private java.math.BigDecimal A216BarTieTeo ;
   private java.math.BigDecimal A215BarTieRea ;
   private java.math.BigDecimal A3837BarFasKgm ;
   private java.math.BigDecimal A3838BarFasMtr ;
   private String wcpOA396EmprCod ;
   private String wcpOAV7BarCodPar ;
   private String wcpOAV22ProCod ;
   private String wcpOAV23Prodsc ;
   private String wcpOAV43Barunimed ;
   private String wcpOAV45BarSer ;
   private String wcpOAV46PedidoCliente ;
   private String wcpOAV47BarColNom ;
   private String wcpOAV52CliNom ;
   private String wcpOAV53BarSerDsc ;
   private String wcpOAV54BarAgrest ;
   private String Gridpaginationbar_Selectedpage ;
   private String Dvelop_confirmpanel_eliminarlinea_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String AV7BarCodPar ;
   private String AV22ProCod ;
   private String AV23Prodsc ;
   private String AV43Barunimed ;
   private String AV45BarSer ;
   private String AV46PedidoCliente ;
   private String AV47BarColNom ;
   private String AV52CliNom ;
   private String AV53BarSerDsc ;
   private String AV54BarAgrest ;
   private String sGXsfl_107_idx="0001" ;
   private String AV12EmprCod ;
   private String AV24Station ;
   private String AV58Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV27UsurCod ;
   private String A759ProDsc ;
   private String A130BarCodPar ;
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
   private String Dvpanel_unnamedtable3_Width ;
   private String Dvpanel_unnamedtable3_Cls ;
   private String Dvpanel_unnamedtable3_Title ;
   private String Dvpanel_unnamedtable3_Iconposition ;
   private String Dvelop_confirmpanel_eliminarlinea_Title ;
   private String Dvelop_confirmpanel_eliminarlinea_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminarlinea_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminarlinea_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminarlinea_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminarlinea_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminarlinea_Confirmtype ;
   private String Grid_titlescategories_Gridinternalname ;
   private String Grid_titlescategories_Gridtitlescategories ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Fixedcolumns ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String edtavBarcod_Internalname ;
   private String edtavBarcod_Jsonclick ;
   private String edtavBarcodreo_Internalname ;
   private String edtavBarcodreo_Jsonclick ;
   private String edtavBarcodpar_Internalname ;
   private String edtavBarcodpar_Jsonclick ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Caption ;
   private String lblTextblock1_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String edtavClinom_Internalname ;
   private String edtavClinom_Jsonclick ;
   private String edtavPedidocliente_Internalname ;
   private String edtavPedidocliente_Jsonclick ;
   private String divUnnamedtable7_Internalname ;
   private String edtavBarser_Internalname ;
   private String edtavBarser_Jsonclick ;
   private String edtavBarcolnom_Internalname ;
   private String edtavBarcolnom_Jsonclick ;
   private String edtavBarcolnum_Internalname ;
   private String edtavBarcolnum_Jsonclick ;
   private String divUnnamedtable8_Internalname ;
   private String edtavBarpie_Internalname ;
   private String edtavBarpie_Jsonclick ;
   private String edtavBarkgm_Internalname ;
   private String edtavBarkgm_Jsonclick ;
   private String edtavBarmtr_Internalname ;
   private String edtavBarmtr_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String TempTags ;
   private String bttBtninsertarlinea_Internalname ;
   private String bttBtninsertarlinea_Jsonclick ;
   private String bttBtnsalir_Internalname ;
   private String bttBtnsalir_Jsonclick ;
   private String Dvpanel_unnamedtable3_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavGridcurrentpage_Internalname ;
   private String edtavGridcurrentpage_Jsonclick ;
   private String Grid_titlescategories_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtBarOrdLin_Internalname ;
   private String A457FasCod ;
   private String edtFasCod_Internalname ;
   private String A460FasDsc ;
   private String edtFasDsc_Internalname ;
   private String A603MaqCodBis ;
   private String edtMaqCodBis_Internalname ;
   private String A152BarFasCon ;
   private String edtBarFasCon_Internalname ;
   private String edtBarFasEst_Internalname ;
   private String A150BarFacTin ;
   private String edtBarFacTin_Internalname ;
   private String A4905BarFasAcab ;
   private String edtBarFasAcab_Internalname ;
   private String A4287BarFasFor ;
   private String edtBarFasFor_Internalname ;
   private String edtBarTieTeo_Internalname ;
   private String edtBarTieRea_Internalname ;
   private String edtBarFasDTI_Internalname ;
   private String edtBarFasDTF_Internalname ;
   private String edtBarFasKgm_Internalname ;
   private String edtBarFasMtr_Internalname ;
   private String A5048BarFasUsu ;
   private String edtBarFasUsu_Internalname ;
   private String edtBarFasPri_Internalname ;
   private String A758ProCod ;
   private String edtProCod_Internalname ;
   private String scmdbuf ;
   private String hsh ;
   private String AV13EmprNom ;
   private String GXt_char3 ;
   private String edtBarOrdLin_Columnheaderclass ;
   private String edtFasCod_Columnheaderclass ;
   private String edtFasDsc_Columnheaderclass ;
   private String edtMaqCodBis_Columnheaderclass ;
   private String edtBarFasCon_Columnheaderclass ;
   private String edtBarFasEst_Columnheaderclass ;
   private String edtBarFacTin_Columnheaderclass ;
   private String edtBarFasAcab_Columnheaderclass ;
   private String edtBarFasFor_Columnheaderclass ;
   private String edtBarTieTeo_Columnheaderclass ;
   private String edtBarTieRea_Columnheaderclass ;
   private String edtBarFasDTI_Columnheaderclass ;
   private String edtBarFasDTF_Columnheaderclass ;
   private String edtBarFasKgm_Columnheaderclass ;
   private String edtBarFasMtr_Columnheaderclass ;
   private String edtBarOrdLin_Columnclass ;
   private String edtFasCod_Columnclass ;
   private String edtFasDsc_Columnclass ;
   private String edtMaqCodBis_Columnclass ;
   private String edtBarFasCon_Columnclass ;
   private String edtBarFasEst_Columnclass ;
   private String edtBarFacTin_Columnclass ;
   private String edtBarFasAcab_Columnclass ;
   private String edtBarFasFor_Columnclass ;
   private String edtBarTieTeo_Columnclass ;
   private String edtBarTieRea_Columnclass ;
   private String edtBarFasDTI_Columnclass ;
   private String edtBarFasDTF_Columnclass ;
   private String edtBarFasKgm_Columnclass ;
   private String edtBarFasMtr_Columnclass ;
   private String Dvelop_confirmpanel_eliminarlinea_Internalname ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String tblTabledvelop_confirmpanel_eliminarlinea_Internalname ;
   private String sGXsfl_107_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtBarOrdLin_Jsonclick ;
   private String edtFasCod_Jsonclick ;
   private String edtFasDsc_Jsonclick ;
   private String edtMaqCodBis_Jsonclick ;
   private String edtBarFasCon_Jsonclick ;
   private String edtBarFasEst_Jsonclick ;
   private String edtBarFacTin_Jsonclick ;
   private String edtBarFasAcab_Jsonclick ;
   private String edtBarFasFor_Jsonclick ;
   private String edtBarTieTeo_Jsonclick ;
   private String edtBarTieRea_Jsonclick ;
   private String edtBarFasDTI_Jsonclick ;
   private String edtBarFasDTF_Jsonclick ;
   private String edtBarFasKgm_Jsonclick ;
   private String edtBarFasMtr_Jsonclick ;
   private String edtBarFasUsu_Jsonclick ;
   private String edtBarFasPri_Jsonclick ;
   private String edtProCod_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date A4443BarFasDTF ;
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
   private boolean Dvpanel_unnamedtable3_Autowidth ;
   private boolean Dvpanel_unnamedtable3_Autoheight ;
   private boolean Dvpanel_unnamedtable3_Collapsible ;
   private boolean Dvpanel_unnamedtable3_Collapsed ;
   private boolean Dvpanel_unnamedtable3_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable3_Autoscroll ;
   private boolean Grid_empowerer_Hascategories ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n4442BarFasDTI ;
   private boolean n4443BarFasDTF ;
   private boolean n3837BarFasKgm ;
   private boolean n3838BarFasMtr ;
   private boolean n5048BarFasUsu ;
   private boolean bGXsfl_107_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV55var_agrupacion ;
   private String AV5Inc_obs ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable3 ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminarlinea ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavAccionesfases ;
   private HTMLChoice cmbFaseExteri ;
   private IDataStoreProvider pr_default ;
   private String[] H01S42_A759ProDsc ;
   private String[] H01S42_A758ProCod ;
   private byte[] H01S42_A3836BarFasPri ;
   private String[] H01S42_A5048BarFasUsu ;
   private boolean[] H01S42_n5048BarFasUsu ;
   private java.math.BigDecimal[] H01S42_A3838BarFasMtr ;
   private boolean[] H01S42_n3838BarFasMtr ;
   private java.math.BigDecimal[] H01S42_A3837BarFasKgm ;
   private boolean[] H01S42_n3837BarFasKgm ;
   private java.util.Date[] H01S42_A4443BarFasDTF ;
   private boolean[] H01S42_n4443BarFasDTF ;
   private java.util.Date[] H01S42_A4442BarFasDTI ;
   private boolean[] H01S42_n4442BarFasDTI ;
   private java.math.BigDecimal[] H01S42_A215BarTieRea ;
   private java.math.BigDecimal[] H01S42_A216BarTieTeo ;
   private String[] H01S42_A4287BarFasFor ;
   private String[] H01S42_A4905BarFasAcab ;
   private String[] H01S42_A150BarFacTin ;
   private byte[] H01S42_A153BarFasEst ;
   private String[] H01S42_A152BarFasCon ;
   private String[] H01S42_A603MaqCodBis ;
   private String[] H01S42_A460FasDsc ;
   private short[] H01S42_A194BarOrdLin ;
   private String[] H01S42_A396EmprCod ;
   private String[] H01S42_A457FasCod ;
   private String[] H01S42_A130BarCodPar ;
   private byte[] H01S42_A132BarCodReo ;
   private int[] H01S42_A129BarCod ;
   private long[] H01S43_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class hojaderuta_fases__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01S42", "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT  T3.ProDsc, T1.ProCod, T1.BarFasPri, T1.BarFasUsu, T1.BarFasMtr, T1.BarFasKgm, T1.BarFasDTF, T1.BarFasDTI, T1.BarTieRea, T1.BarTieTeo, T1.BarFasFor, T1.BarFasAcab, T1.BarFacTin, T1.BarFasEst, T1.BarFasCon, T1.MaqCodBis, T2.FasDsc, T1.BarOrdLin, T1.EmprCod, T1.FasCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM ((TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPPROCES T3 ON T3.EmprCod = T1.EmprCod AND T3.ProCod = T1.ProCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin) GX_CTE) WHERE GX_ROW_NUMBER BETWEEN ? AND ? OR ? < ? AND GX_ROW_NUMBER >= ?",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01S43", "SELECT COUNT(*) FROM ((TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPPROCES T3 ON T3.EmprCod = T1.EmprCod AND T3.ProCod = T1.ProCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[15])[0] = rslt.getString(11, 1);
               ((String[]) buf[16])[0] = rslt.getString(12, 1);
               ((String[]) buf[17])[0] = rslt.getString(13, 1);
               ((byte[]) buf[18])[0] = rslt.getByte(14);
               ((String[]) buf[19])[0] = rslt.getString(15, 1);
               ((String[]) buf[20])[0] = rslt.getString(16, 6);
               ((String[]) buf[21])[0] = rslt.getString(17, 28);
               ((short[]) buf[22])[0] = rslt.getShort(18);
               ((String[]) buf[23])[0] = rslt.getString(19, 3);
               ((String[]) buf[24])[0] = rslt.getString(20, 8);
               ((String[]) buf[25])[0] = rslt.getString(21, 1);
               ((byte[]) buf[26])[0] = rslt.getByte(22);
               ((int[]) buf[27])[0] = rslt.getInt(23);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
      }
   }

}

