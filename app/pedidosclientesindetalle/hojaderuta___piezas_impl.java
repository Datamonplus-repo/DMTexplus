package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class hojaderuta___piezas_impl extends GXDataArea
{
   public hojaderuta___piezas_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public hojaderuta___piezas_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( hojaderuta___piezas_impl.class ));
   }

   public hojaderuta___piezas_impl( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavHayrec = UIFactory.getCheckbox(this);
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
            AV24EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24EmprCod", AV24EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV21BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV21BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21BarCod), 8, 0));
               AV22BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV22BarCodReo", GXutil.str( AV22BarCodReo, 1, 0));
               AV23BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV23BarCodPar", AV23BarCodPar);
               AV18CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18CliCod), 6, 0));
               AV25Discod = (int)(GXutil.lval( httpContext.GetPar( "Discod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV25Discod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25Discod), 8, 0));
               AV14BarUniMed = httpContext.GetPar( "BarUniMed") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14BarUniMed", AV14BarUniMed);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARUNIMED", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14BarUniMed, "@!"))));
               AV13BarPes = (short)(GXutil.lval( httpContext.GetPar( "BarPes"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13BarPes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarPes), 4, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13BarPes), "ZZZ9")));
               AV15BarSer = httpContext.GetPar( "BarSer") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15BarSer", AV15BarSer);
               AV20PedidoCliente = httpContext.GetPar( "PedidoCliente") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV20PedidoCliente", AV20PedidoCliente);
               AV16BarColNom = httpContext.GetPar( "BarColNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16BarColNom", AV16BarColNom);
               AV17BarColNum = (int)(GXutil.lval( httpContext.GetPar( "BarColNum"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17BarColNum), 6, 0));
               AV10BarPie = (int)(GXutil.lval( httpContext.GetPar( "BarPie"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10BarPie), 6, 0));
               AV11BarKgm = CommonUtil.decimalVal( httpContext.GetPar( "BarKgm"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11BarKgm", GXutil.ltrimstr( AV11BarKgm, 9, 2));
               AV12BarMtr = CommonUtil.decimalVal( httpContext.GetPar( "BarMtr"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12BarMtr", GXutil.ltrimstr( AV12BarMtr, 9, 2));
               AV19CliNom = httpContext.GetPar( "CliNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19CliNom", AV19CliNom);
               AV26BarSerDsc = httpContext.GetPar( "BarSerDsc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26BarSerDsc", AV26BarSerDsc);
               AV50BarAgrEst = httpContext.GetPar( "BarAgrEst") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV50BarAgrEst", AV50BarAgrEst);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARAGREST", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV50BarAgrEst, "@!"))));
               AV53Hayrec = (byte)(GXutil.lval( httpContext.GetPar( "Hayrec"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV53Hayrec", GXutil.str( AV53Hayrec, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHAYREC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV53Hayrec), "9")));
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
      pa29A2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start29A2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.pedidosclientesindetalle.hojaderuta___piezas", new String[] {GXutil.URLEncode(GXutil.rtrim(AV24EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV21BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV22BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV23BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV18CliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV25Discod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV14BarUniMed)),GXutil.URLEncode(GXutil.ltrimstr(AV13BarPes,4,0)),GXutil.URLEncode(GXutil.rtrim(AV15BarSer)),GXutil.URLEncode(GXutil.rtrim(AV20PedidoCliente)),GXutil.URLEncode(GXutil.rtrim(AV16BarColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV17BarColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10BarPie,6,0)),GXutil.URLEncode(DecimalUtil.decToString(AV11BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(AV12BarMtr)),GXutil.URLEncode(GXutil.rtrim(AV19CliNom)),GXutil.URLEncode(GXutil.rtrim(AV26BarSerDsc)),GXutil.URLEncode(GXutil.rtrim(AV50BarAgrEst)),GXutil.URLEncode(GXutil.ltrimstr(AV53Hayrec,1,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","CliCod","Discod","BarUniMed","BarPes","BarSer","PedidoCliente","BarColNom","BarColNum","BarPie","BarKgm","BarMtr","CliNom","BarSerDsc","BarAgrEst","Hayrec"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARAGREST", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV50BarAgrEst, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARUNIMED", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14BarUniMed, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13BarPes), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHAYREC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV53Hayrec), "9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV24EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARAGREST", GXutil.rtrim( AV50BarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARAGREST", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV50BarAgrEst, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vDISCOD", GXutil.ltrim( localUtil.ntoc( AV25Discod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSERDSC", GXutil.rtrim( AV26BarSerDsc));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Width", GXutil.rtrim( Dvpanel_tableheader_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Autowidth", GXutil.booltostr( Dvpanel_tableheader_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Autoheight", GXutil.booltostr( Dvpanel_tableheader_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Cls", GXutil.rtrim( Dvpanel_tableheader_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Title", GXutil.rtrim( Dvpanel_tableheader_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Collapsible", GXutil.booltostr( Dvpanel_tableheader_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Collapsed", GXutil.booltostr( Dvpanel_tableheader_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Showcollapseicon", GXutil.booltostr( Dvpanel_tableheader_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Iconposition", GXutil.rtrim( Dvpanel_tableheader_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Autoscroll", GXutil.booltostr( Dvpanel_tableheader_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Title", GXutil.rtrim( Dvelop_confirmpanel_enter_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_enter_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_enter_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_enter_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Result", GXutil.rtrim( Dvelop_confirmpanel_enter_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Result", GXutil.rtrim( Dvelop_confirmpanel_enter_Result));
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
      if ( ! ( WebComp_Wchojaderuta___piezas_wc == null ) )
      {
         WebComp_Wchojaderuta___piezas_wc.componentjscripts();
      }
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
         we29A2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt29A2( ) ;
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
      return formatLink("app.pedidosclientesindetalle.hojaderuta___piezas", new String[] {GXutil.URLEncode(GXutil.rtrim(AV24EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV21BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV22BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV23BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV18CliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV25Discod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV14BarUniMed)),GXutil.URLEncode(GXutil.ltrimstr(AV13BarPes,4,0)),GXutil.URLEncode(GXutil.rtrim(AV15BarSer)),GXutil.URLEncode(GXutil.rtrim(AV20PedidoCliente)),GXutil.URLEncode(GXutil.rtrim(AV16BarColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV17BarColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10BarPie,6,0)),GXutil.URLEncode(DecimalUtil.decToString(AV11BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(AV12BarMtr)),GXutil.URLEncode(GXutil.rtrim(AV19CliNom)),GXutil.URLEncode(GXutil.rtrim(AV26BarSerDsc)),GXutil.URLEncode(GXutil.rtrim(AV50BarAgrEst)),GXutil.URLEncode(GXutil.ltrimstr(AV53Hayrec,1,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","CliCod","Discod","BarUniMed","BarPes","BarSer","PedidoCliente","BarColNom","BarColNum","BarPie","BarKgm","BarMtr","CliNom","BarSerDsc","BarAgrEst","Hayrec"})  ;
   }

   public String getPgmname( )
   {
      return "PedidosClienteSinDetalle.HojadeRuta___Piezas" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Mantenimiento de Piezas (Hdr)", "") ;
   }

   public void wb29A0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 CellMarginTop", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV21BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV21BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV21BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta___Piezas.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreo_Internalname, GXutil.ltrim( localUtil.ntoc( AV22BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV22BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV22BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodreo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta___Piezas.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodpar_Internalname, GXutil.rtrim( AV23BarCodPar), GXutil.rtrim( localUtil.format( AV23BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodpar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodpar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta___Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV18CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV18CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV18CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta___Piezas.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClinom_Internalname, GXutil.rtrim( AV19CliNom), GXutil.rtrim( localUtil.format( AV19CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClinom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClinom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta___Piezas.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPedidocliente_Internalname, GXutil.rtrim( AV20PedidoCliente), GXutil.rtrim( localUtil.format( AV20PedidoCliente, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPedidocliente_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPedidocliente_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta___Piezas.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarser_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarser_Internalname, httpContext.getMessage( "Articulo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarser_Internalname, GXutil.rtrim( AV15BarSer), GXutil.rtrim( localUtil.format( AV15BarSer, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarser_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarser_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta___Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnom_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnom_Internalname, GXutil.rtrim( AV16BarColNom), GXutil.rtrim( localUtil.format( AV16BarColNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta___Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnum_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV17BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV17BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV17BarColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta___Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavHayrec.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavHayrec.getInternalname(), httpContext.getMessage( "Receta?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavHayrec.getInternalname(), GXutil.str( AV53Hayrec, 1, 0), "", httpContext.getMessage( "Receta?", ""), 1, chkavHayrec.getEnabled(), "1", "", StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarpie_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarpie_Internalname, httpContext.getMessage( "Piezas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarpie_Internalname, GXutil.ltrim( localUtil.ntoc( AV10BarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarpie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV10BarPie), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV10BarPie), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarpie_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarpie_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta___Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarkgm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarkgm_Internalname, httpContext.getMessage( "Kilos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarkgm_Internalname, GXutil.ltrim( localUtil.ntoc( AV11BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarkgm_Enabled!=0) ? localUtil.format( AV11BarKgm, "ZZZZZ9.99") : localUtil.format( AV11BarKgm, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarkgm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarkgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta___Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarmtr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarmtr_Internalname, httpContext.getMessage( "Metros", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarmtr_Internalname, GXutil.ltrim( localUtil.ntoc( AV12BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarmtr_Enabled!=0) ? localUtil.format( AV12BarMtr, "ZZZZZ9.99") : localUtil.format( AV12BarMtr, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarmtr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarmtr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta___Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarpes_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarpes_Internalname, httpContext.getMessage( "Pml", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarpes_Internalname, GXutil.ltrim( localUtil.ntoc( AV13BarPes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarpes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV13BarPes), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV13BarPes), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarpes_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarpes_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta___Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarunimed_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarunimed_Internalname, httpContext.getMessage( "Unidad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarunimed_Internalname, GXutil.rtrim( AV14BarUniMed), GXutil.rtrim( localUtil.format( AV14BarUniMed, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarunimed_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarunimed_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta___Piezas.htm");
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
         ucDvpanel_tableheader.setProperty("Width", Dvpanel_tableheader_Width);
         ucDvpanel_tableheader.setProperty("AutoWidth", Dvpanel_tableheader_Autowidth);
         ucDvpanel_tableheader.setProperty("AutoHeight", Dvpanel_tableheader_Autoheight);
         ucDvpanel_tableheader.setProperty("Cls", Dvpanel_tableheader_Cls);
         ucDvpanel_tableheader.setProperty("Title", Dvpanel_tableheader_Title);
         ucDvpanel_tableheader.setProperty("Collapsible", Dvpanel_tableheader_Collapsible);
         ucDvpanel_tableheader.setProperty("Collapsed", Dvpanel_tableheader_Collapsed);
         ucDvpanel_tableheader.setProperty("ShowCollapseIcon", Dvpanel_tableheader_Showcollapseicon);
         ucDvpanel_tableheader.setProperty("IconPosition", Dvpanel_tableheader_Iconposition);
         ucDvpanel_tableheader.setProperty("AutoScroll", Dvpanel_tableheader_Autoscroll);
         ucDvpanel_tableheader.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableheader_Internalname, "DVPANEL_TABLEHEADERContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLEHEADERContainer"+"TableHeader"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbreccod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbreccod_Internalname, httpContext.getMessage( "Nº Recepcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbreccod_Internalname, GXutil.ltrim( localUtil.ntoc( AV5AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbreccod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV5AlbRecCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV5AlbRecCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbreccod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbreccod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta___Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 CellMarginTop30", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+imgavPromptalbrec_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Active Bitmap Variable */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
         ClassString = "ImagePrompt" + " " + ((GXutil.strcmp(imgavPromptalbrec_gximage, "")==0) ? "" : "GX_Image_"+imgavPromptalbrec_gximage+"_Class") ;
         StyleString = "" ;
         AV6promptalbrec_IsBlob = (boolean)(((GXutil.strcmp("", AV6promptalbrec)==0)&&(GXutil.strcmp("", AV57Promptalbrec_GXI)==0))||!(GXutil.strcmp("", AV6promptalbrec)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV6promptalbrec)==0) ? AV57Promptalbrec_GXI : httpContext.getResourceRelative(AV6promptalbrec)) ;
         app.GxWebStd.gx_bitmap( httpContext, imgavPromptalbrec_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, -1, 0, "", 0, "", 0, 0, 7, imgavPromptalbrec_Jsonclick, "'"+""+"'"+",false,"+"'"+"e1129a1_client"+"'", StyleString, ClassString, "", "", "", "", ""+TempTags, "", "", 1, AV6promptalbrec_IsBlob, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_PedidosClienteSinDetalle\\HojadeRuta___Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarpiekil_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarpiekil_Internalname, httpContext.getMessage( "Kilos", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 112,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarpiekil_Internalname, GXutil.ltrim( localUtil.ntoc( AV7BarPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( AV7BarPieKil, "ZZZZZ9.99")), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,112);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarpiekil_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarpiekil_Enabled, 1, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta___Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarpiemet_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarpiemet_Internalname, httpContext.getMessage( "Metros", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarpiemet_Internalname, GXutil.ltrim( localUtil.ntoc( AV8BarPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( AV8BarPieMet, "ZZZZZ9.99")), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarpiemet_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarpiemet_Enabled, 1, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta___Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarpiepie_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarpiepie_Internalname, httpContext.getMessage( "Piezas", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 120,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarpiepie_Internalname, GXutil.ltrim( localUtil.ntoc( AV9BarPiePie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV9BarPiePie), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,120);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarpiepie_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarpiepie_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta___Piezas.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 125,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PedidosClienteSinDetalle\\HojadeRuta___Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 127,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PedidosClienteSinDetalle\\HojadeRuta___Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTbmessage_Internalname, lblTbmessage_Caption, "", "", lblTbmessage_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextDanger", 0, "", 1, 1, 0, (short)(0), "HLP_PedidosClienteSinDetalle\\HojadeRuta___Piezas.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0136"+"", GXutil.rtrim( WebComp_Wchojaderuta___piezas_wc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0136"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wchojaderuta___piezas_wc_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWchojaderuta___piezas_wc), GXutil.lower( WebComp_Wchojaderuta___piezas_wc_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0136"+"");
               }
               WebComp_Wchojaderuta___piezas_wc.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWchojaderuta___piezas_wc), GXutil.lower( WebComp_Wchojaderuta___piezas_wc_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDvpanel_unnamedtable3_cell_Internalname, 1, 0, "px", 0, "px", divDvpanel_unnamedtable3_cell_Class, "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbrec_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbrec_Internalname, httpContext.getMessage( "albrec", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbrec_Internalname, GXutil.ltrim( localUtil.ntoc( AV41albrec, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbrec_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV41albrec), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV41albrec), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbrec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbrec_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta___Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarpietabla_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarpietabla_Internalname, httpContext.getMessage( "barpie", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 150,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarpietabla_Internalname, GXutil.ltrim( localUtil.ntoc( AV42barpietabla, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarpietabla_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV42barpietabla), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV42barpietabla), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,150);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarpietabla_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarpietabla_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta___Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbrunient_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbrunient_Internalname, httpContext.getMessage( "Unds. Ent.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 154,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbrunient_Internalname, GXutil.ltrim( localUtil.ntoc( AV48Albrunient, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbrunient_Enabled!=0) ? localUtil.format( AV48Albrunient, "ZZZZZ9.99") : localUtil.format( AV48Albrunient, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,154);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbrunient_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbrunient_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta___Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbruniuti_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbruniuti_Internalname, httpContext.getMessage( "Unds. Uti.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 158,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbruniuti_Internalname, GXutil.ltrim( localUtil.ntoc( AV44Albruniuti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbruniuti_Enabled!=0) ? localUtil.format( AV44Albruniuti, "ZZZZZ9.99") : localUtil.format( AV44Albruniuti, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,158);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbruniuti_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbruniuti_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta___Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbrunidis_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbrunidis_Internalname, httpContext.getMessage( "Unds. Disp.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 162,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbrunidis_Internalname, GXutil.ltrim( localUtil.ntoc( AV35Albrunidis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbrunidis_Enabled!=0) ? localUtil.format( AV35Albrunidis, "ZZZZZ9.99") : localUtil.format( AV35Albrunidis, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,162);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbrunidis_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbrunidis_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta___Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbrpieent_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbrpieent_Internalname, httpContext.getMessage( "Pzs. Ent.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbrpieent_Internalname, GXutil.ltrim( localUtil.ntoc( AV49AlbRPieent, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbrpieent_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV49AlbRPieent), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV49AlbRPieent), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,166);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbrpieent_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbrpieent_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta___Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbrpieuti_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbrpieuti_Internalname, httpContext.getMessage( "Pzs. Uti.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 170,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbrpieuti_Internalname, GXutil.ltrim( localUtil.ntoc( AV43AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbrpieuti_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV43AlbRPieUti), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV43AlbRPieUti), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,170);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbrpieuti_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbrpieuti_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta___Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbrpiedis_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbrpiedis_Internalname, httpContext.getMessage( "Pzs. Disp.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 174,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbrpiedis_Internalname, GXutil.ltrim( localUtil.ntoc( AV36albrpiedis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbrpiedis_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV36albrpiedis), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV36albrpiedis), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,174);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbrpiedis_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbrpiedis_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta___Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavOldbarpiekil_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavOldbarpiekil_Internalname, httpContext.getMessage( "oldbarpiekil", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 178,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavOldbarpiekil_Internalname, GXutil.ltrim( localUtil.ntoc( AV46oldbarpiekil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavOldbarpiekil_Enabled!=0) ? localUtil.format( AV46oldbarpiekil, "ZZZZZ9.99") : localUtil.format( AV46oldbarpiekil, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,178);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavOldbarpiekil_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavOldbarpiekil_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta___Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavOldbarpiemet_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavOldbarpiemet_Internalname, httpContext.getMessage( "oldbarpiemet", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 182,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavOldbarpiemet_Internalname, GXutil.ltrim( localUtil.ntoc( AV47oldbarpiemet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavOldbarpiemet_Enabled!=0) ? localUtil.format( AV47oldbarpiemet, "ZZZZZ9.99") : localUtil.format( AV47oldbarpiemet, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,182);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavOldbarpiemet_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavOldbarpiemet_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta___Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavOldbarpiepie_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavOldbarpiepie_Internalname, httpContext.getMessage( "oldbarpiepie", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavOldbarpiepie_Internalname, GXutil.ltrim( localUtil.ntoc( AV45oldbarpiepie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavOldbarpiepie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV45oldbarpiepie), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV45oldbarpiepie), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,186);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavOldbarpiepie_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavOldbarpiepie_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta___Piezas.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV56Pgmname), GXutil.rtrim( localUtil.format( AV56Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta___Piezas.htm");
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
         wb_table1_194_29A2( true) ;
      }
      else
      {
         wb_table1_194_29A2( false) ;
      }
      return  ;
   }

   public void wb_table1_194_29A2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start29A2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Mantenimiento de Piezas (Hdr)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup29A0( ) ;
   }

   public void ws29A2( )
   {
      start29A2( ) ;
      evt29A2( ) ;
   }

   public void evt29A2( )
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
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ENTER.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1229A2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e1329A2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ! wbErr )
                           {
                              Rfr0gs = false ;
                              if ( ! Rfr0gs )
                              {
                                 /* Execute user event: Enter */
                                 e1429A2 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e1529A2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VALBRECCOD.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1629A2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e1729A2 ();
                           /* No code required for Cancel button. It is implemented as the Reset button. */
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
                     }
                  }
                  else if ( GXutil.strcmp(sEvtType, "W") == 0 )
                  {
                     sEvtType = GXutil.left( sEvt, 4) ;
                     sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-4) ;
                     nCmpId = (short)(GXutil.lval( sEvtType)) ;
                     if ( nCmpId == 136 )
                     {
                        OldWchojaderuta___piezas_wc = httpContext.cgiGet( "W0136") ;
                        if ( ( GXutil.len( OldWchojaderuta___piezas_wc) == 0 ) || ( GXutil.strcmp(OldWchojaderuta___piezas_wc, WebComp_Wchojaderuta___piezas_wc_Component) != 0 ) )
                        {
                           WebComp_Wchojaderuta___piezas_wc = WebUtils.getWebComponent(getClass(), "app." + OldWchojaderuta___piezas_wc + "_impl", remoteHandle, context);
                           WebComp_Wchojaderuta___piezas_wc_Component = OldWchojaderuta___piezas_wc ;
                        }
                        if ( GXutil.len( WebComp_Wchojaderuta___piezas_wc_Component) != 0 )
                        {
                           WebComp_Wchojaderuta___piezas_wc.componentprocess("W0136", "", sEvt);
                        }
                        WebComp_Wchojaderuta___piezas_wc_Component = OldWchojaderuta___piezas_wc ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we29A2( )
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

   public void pa29A2( )
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
            GX_FocusControl = edtavAlbreccod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
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
      AV53Hayrec = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( AV53Hayrec, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53Hayrec", GXutil.str( AV53Hayrec, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHAYREC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV53Hayrec), "9")));
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf29A2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV56Pgmname = "PedidosClienteSinDetalle.HojadeRuta___Piezas" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56Pgmname", AV56Pgmname);
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
      chkavHayrec.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavHayrec.getInternalname(), "Enabled", GXutil.ltrimstr( chkavHayrec.getEnabled(), 5, 0), true);
      edtavBarpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpie_Enabled), 5, 0), true);
      edtavBarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm_Enabled), 5, 0), true);
      edtavBarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr_Enabled), 5, 0), true);
      edtavBarpes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarpes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpes_Enabled), 5, 0), true);
      edtavBarunimed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarunimed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarunimed_Enabled), 5, 0), true);
      edtavAlbrec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbrec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrec_Enabled), 5, 0), true);
      edtavBarpietabla_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarpietabla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpietabla_Enabled), 5, 0), true);
      edtavAlbrunient_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbrunient_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrunient_Enabled), 5, 0), true);
      edtavAlbruniuti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbruniuti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbruniuti_Enabled), 5, 0), true);
      edtavAlbrunidis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbrunidis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrunidis_Enabled), 5, 0), true);
      edtavAlbrpieent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbrpieent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrpieent_Enabled), 5, 0), true);
      edtavAlbrpieuti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbrpieuti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrpieuti_Enabled), 5, 0), true);
      edtavAlbrpiedis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbrpiedis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrpiedis_Enabled), 5, 0), true);
      edtavOldbarpiekil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavOldbarpiekil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOldbarpiekil_Enabled), 5, 0), true);
      edtavOldbarpiemet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavOldbarpiemet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOldbarpiemet_Enabled), 5, 0), true);
      edtavOldbarpiepie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavOldbarpiepie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOldbarpiepie_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf29A2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wchojaderuta___piezas_wc_Component) != 0 )
            {
               WebComp_Wchojaderuta___piezas_wc.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e1729A2 ();
         wb29A0( ) ;
      }
   }

   public void send_integrity_lvl_hashes29A2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vBARAGREST", GXutil.rtrim( AV50BarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARAGREST", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV50BarAgrEst, "@!"))));
   }

   public void before_start_formulas( )
   {
      AV56Pgmname = "PedidosClienteSinDetalle.HojadeRuta___Piezas" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56Pgmname", AV56Pgmname);
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
      chkavHayrec.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavHayrec.getInternalname(), "Enabled", GXutil.ltrimstr( chkavHayrec.getEnabled(), 5, 0), true);
      edtavBarpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpie_Enabled), 5, 0), true);
      edtavBarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm_Enabled), 5, 0), true);
      edtavBarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr_Enabled), 5, 0), true);
      edtavBarpes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarpes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpes_Enabled), 5, 0), true);
      edtavBarunimed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarunimed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarunimed_Enabled), 5, 0), true);
      edtavAlbrec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbrec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrec_Enabled), 5, 0), true);
      edtavBarpietabla_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarpietabla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpietabla_Enabled), 5, 0), true);
      edtavAlbrunient_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbrunient_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrunient_Enabled), 5, 0), true);
      edtavAlbruniuti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbruniuti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbruniuti_Enabled), 5, 0), true);
      edtavAlbrunidis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbrunidis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrunidis_Enabled), 5, 0), true);
      edtavAlbrpieent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbrpieent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrpieent_Enabled), 5, 0), true);
      edtavAlbrpieuti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbrpieuti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrpieuti_Enabled), 5, 0), true);
      edtavAlbrpiedis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbrpiedis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrpiedis_Enabled), 5, 0), true);
      edtavOldbarpiekil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavOldbarpiekil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOldbarpiekil_Enabled), 5, 0), true);
      edtavOldbarpiemet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavOldbarpiemet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOldbarpiemet_Enabled), 5, 0), true);
      edtavOldbarpiepie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavOldbarpiepie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOldbarpiepie_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup29A0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1329A2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         AV24EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
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
         Dvpanel_tableheader_Width = httpContext.cgiGet( "DVPANEL_TABLEHEADER_Width") ;
         Dvpanel_tableheader_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Autowidth")) ;
         Dvpanel_tableheader_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Autoheight")) ;
         Dvpanel_tableheader_Cls = httpContext.cgiGet( "DVPANEL_TABLEHEADER_Cls") ;
         Dvpanel_tableheader_Title = httpContext.cgiGet( "DVPANEL_TABLEHEADER_Title") ;
         Dvpanel_tableheader_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Collapsible")) ;
         Dvpanel_tableheader_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Collapsed")) ;
         Dvpanel_tableheader_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Showcollapseicon")) ;
         Dvpanel_tableheader_Iconposition = httpContext.cgiGet( "DVPANEL_TABLEHEADER_Iconposition") ;
         Dvpanel_tableheader_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Autoscroll")) ;
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
         Dvelop_confirmpanel_enter_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Title") ;
         Dvelop_confirmpanel_enter_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Confirmationtext") ;
         Dvelop_confirmpanel_enter_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Yesbuttoncaption") ;
         Dvelop_confirmpanel_enter_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Nobuttoncaption") ;
         Dvelop_confirmpanel_enter_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_enter_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Yesbuttonposition") ;
         Dvelop_confirmpanel_enter_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Confirmtype") ;
         Dvelop_confirmpanel_enter_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Result") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbreccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbreccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBRECCOD");
            GX_FocusControl = edtavAlbreccod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5AlbRecCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5AlbRecCod), 8, 0));
         }
         else
         {
            AV5AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavAlbreccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5AlbRecCod), 8, 0));
         }
         AV6promptalbrec = httpContext.cgiGet( imgavPromptalbrec_Internalname) ;
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavBarpiekil_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavBarpiekil_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARPIEKIL");
            GX_FocusControl = edtavBarpiekil_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7BarPieKil = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7BarPieKil", GXutil.ltrimstr( AV7BarPieKil, 9, 2));
         }
         else
         {
            AV7BarPieKil = localUtil.ctond( httpContext.cgiGet( edtavBarpiekil_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7BarPieKil", GXutil.ltrimstr( AV7BarPieKil, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavBarpiemet_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavBarpiemet_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARPIEMET");
            GX_FocusControl = edtavBarpiemet_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8BarPieMet = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8BarPieMet", GXutil.ltrimstr( AV8BarPieMet, 9, 2));
         }
         else
         {
            AV8BarPieMet = localUtil.ctond( httpContext.cgiGet( edtavBarpiemet_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8BarPieMet", GXutil.ltrimstr( AV8BarPieMet, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarpiepie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarpiepie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARPIEPIE");
            GX_FocusControl = edtavBarpiepie_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9BarPiePie = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9BarPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarPiePie), 6, 0));
         }
         else
         {
            AV9BarPiePie = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarpiepie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9BarPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarPiePie), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbrec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbrec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBREC");
            GX_FocusControl = edtavAlbrec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV41albrec = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41albrec", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41albrec), 4, 0));
         }
         else
         {
            AV41albrec = (short)(localUtil.ctol( httpContext.cgiGet( edtavAlbrec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41albrec", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41albrec), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarpietabla_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarpietabla_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARPIETABLA");
            GX_FocusControl = edtavBarpietabla_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV42barpietabla = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42barpietabla", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42barpietabla), 4, 0));
         }
         else
         {
            AV42barpietabla = (short)(localUtil.ctol( httpContext.cgiGet( edtavBarpietabla_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42barpietabla", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42barpietabla), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAlbrunient_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAlbrunient_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBRUNIENT");
            GX_FocusControl = edtavAlbrunient_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV48Albrunient = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48Albrunient", GXutil.ltrimstr( AV48Albrunient, 9, 2));
         }
         else
         {
            AV48Albrunient = localUtil.ctond( httpContext.cgiGet( edtavAlbrunient_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48Albrunient", GXutil.ltrimstr( AV48Albrunient, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAlbruniuti_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAlbruniuti_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBRUNIUTI");
            GX_FocusControl = edtavAlbruniuti_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV44Albruniuti = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44Albruniuti", GXutil.ltrimstr( AV44Albruniuti, 9, 2));
         }
         else
         {
            AV44Albruniuti = localUtil.ctond( httpContext.cgiGet( edtavAlbruniuti_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44Albruniuti", GXutil.ltrimstr( AV44Albruniuti, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAlbrunidis_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAlbrunidis_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBRUNIDIS");
            GX_FocusControl = edtavAlbrunidis_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV35Albrunidis = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35Albrunidis", GXutil.ltrimstr( AV35Albrunidis, 9, 2));
         }
         else
         {
            AV35Albrunidis = localUtil.ctond( httpContext.cgiGet( edtavAlbrunidis_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35Albrunidis", GXutil.ltrimstr( AV35Albrunidis, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbrpieent_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbrpieent_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBRPIEENT");
            GX_FocusControl = edtavAlbrpieent_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV49AlbRPieent = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49AlbRPieent", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49AlbRPieent), 6, 0));
         }
         else
         {
            AV49AlbRPieent = (int)(localUtil.ctol( httpContext.cgiGet( edtavAlbrpieent_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49AlbRPieent", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49AlbRPieent), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbrpieuti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbrpieuti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBRPIEUTI");
            GX_FocusControl = edtavAlbrpieuti_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV43AlbRPieUti = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43AlbRPieUti), 6, 0));
         }
         else
         {
            AV43AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( edtavAlbrpieuti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43AlbRPieUti), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbrpiedis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbrpiedis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBRPIEDIS");
            GX_FocusControl = edtavAlbrpiedis_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV36albrpiedis = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36albrpiedis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36albrpiedis), 6, 0));
         }
         else
         {
            AV36albrpiedis = (int)(localUtil.ctol( httpContext.cgiGet( edtavAlbrpiedis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36albrpiedis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36albrpiedis), 6, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavOldbarpiekil_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavOldbarpiekil_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vOLDBARPIEKIL");
            GX_FocusControl = edtavOldbarpiekil_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV46oldbarpiekil = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46oldbarpiekil", GXutil.ltrimstr( AV46oldbarpiekil, 9, 2));
         }
         else
         {
            AV46oldbarpiekil = localUtil.ctond( httpContext.cgiGet( edtavOldbarpiekil_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46oldbarpiekil", GXutil.ltrimstr( AV46oldbarpiekil, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavOldbarpiemet_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavOldbarpiemet_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vOLDBARPIEMET");
            GX_FocusControl = edtavOldbarpiemet_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV47oldbarpiemet = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47oldbarpiemet", GXutil.ltrimstr( AV47oldbarpiemet, 9, 2));
         }
         else
         {
            AV47oldbarpiemet = localUtil.ctond( httpContext.cgiGet( edtavOldbarpiemet_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47oldbarpiemet", GXutil.ltrimstr( AV47oldbarpiemet, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavOldbarpiepie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavOldbarpiepie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vOLDBARPIEPIE");
            GX_FocusControl = edtavOldbarpiepie_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV45oldbarpiepie = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45oldbarpiepie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45oldbarpiepie), 6, 0));
         }
         else
         {
            AV45oldbarpiepie = (int)(localUtil.ctol( httpContext.cgiGet( edtavOldbarpiepie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45oldbarpiepie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45oldbarpiepie), 6, 0));
         }
         AV56Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV56Pgmname", AV56Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e1329A2 ();
      if (returnInSub) return;
   }

   public void e1329A2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV27Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      hojaderuta___piezas_impl.this.GXt_char1 = GXv_char2[0] ;
      AV27Station = GXt_char1 ;
      GXv_char2[0] = AV24EmprCod ;
      GXv_char3[0] = AV28EmprNom ;
      GXv_char4[0] = AV29UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV27Station, GXv_char2, GXv_char3, GXv_char4) ;
      hojaderuta___piezas_impl.this.AV24EmprCod = GXv_char2[0] ;
      hojaderuta___piezas_impl.this.AV28EmprNom = GXv_char3[0] ;
      hojaderuta___piezas_impl.this.AV29UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24EmprCod", AV24EmprCod);
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if (returnInSub) return;
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wchojaderuta___piezas_wc = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wchojaderuta___piezas_wc_Component), GXutil.lower( "PedidosClienteSinDetalle.HojadeRuta___Piezas_WC")) != 0 )
      {
         WebComp_Wchojaderuta___piezas_wc = WebUtils.getWebComponent(getClass(), "app.pedidosclientesindetalle.hojaderuta___piezas_wc_impl", remoteHandle, context);
         WebComp_Wchojaderuta___piezas_wc_Component = "PedidosClienteSinDetalle.HojadeRuta___Piezas_WC" ;
      }
      if ( GXutil.len( WebComp_Wchojaderuta___piezas_wc_Component) != 0 )
      {
         WebComp_Wchojaderuta___piezas_wc.setjustcreated();
         WebComp_Wchojaderuta___piezas_wc.componentprepare(new Object[] {"W0136","",AV24EmprCod,Integer.valueOf(AV21BarCod),Byte.valueOf(AV22BarCodReo),AV23BarCodPar,Byte.valueOf(AV53Hayrec)});
         WebComp_Wchojaderuta___piezas_wc.componentbind(new Object[] {"","vBARCOD","vBARCODREO","vBARCODPAR","vHAYREC"});
      }
      GXt_int5 = (byte)(AV30TinEst) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV24EmprCod, httpContext.getMessage( "TINEST", ""), GXv_int6) ;
      hojaderuta___piezas_impl.this.GXt_int5 = GXv_int6[0] ;
      AV30TinEst = GXt_int5 ;
      GXv_int6[0] = (byte)(AV31Vertic) ;
      new app.pexicon(remoteHandle, context).execute( AV24EmprCod, httpContext.getMessage( "VERTIC", ""), GXv_int6) ;
      hojaderuta___piezas_impl.this.AV31Vertic = GXv_int6[0] ;
      GXt_int5 = (byte)(AV32Tela) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV24EmprCod, httpContext.getMessage( "TEJIDO", ""), GXv_int6) ;
      hojaderuta___piezas_impl.this.GXt_int5 = GXv_int6[0] ;
      AV32Tela = GXt_int5 ;
      GXt_int5 = (byte)(AV33Erfoc) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV24EmprCod, httpContext.getMessage( "ERFOC", ""), GXv_int6) ;
      hojaderuta___piezas_impl.this.GXt_int5 = GXv_int6[0] ;
      AV33Erfoc = GXt_int5 ;
      GXt_int5 = (byte)(AV34TTRN22) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV24EmprCod, httpContext.getMessage( "TTRN22", ""), GXv_int6) ;
      hojaderuta___piezas_impl.this.GXt_int5 = GXv_int6[0] ;
      AV34TTRN22 = GXt_int5 ;
      GXt_int5 = (byte)(AV51Flag2) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV24EmprCod, "999999", GXv_int6) ;
      hojaderuta___piezas_impl.this.GXt_int5 = GXv_int6[0] ;
      AV51Flag2 = GXt_int5 ;
      imgavPromptalbrec_gximage = "prompt" ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPromptalbrec_Internalname, "gximage", imgavPromptalbrec_gximage, true);
      AV6promptalbrec = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPromptalbrec_Internalname, "Bitmap", ((GXutil.strcmp("", AV6promptalbrec)==0) ? AV57Promptalbrec_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV6promptalbrec))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavPromptalbrec_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV6promptalbrec), true);
      AV57Promptalbrec_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPromptalbrec_Internalname, "Bitmap", ((GXutil.strcmp("", AV6promptalbrec)==0) ? AV57Promptalbrec_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV6promptalbrec))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavPromptalbrec_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV6promptalbrec), true);
      if ( AV53Hayrec == 1 )
      {
         edtavBarpiekil_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavBarpiekil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpiekil_Enabled), 5, 0), true);
         edtavBarpiemet_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavBarpiemet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpiemet_Enabled), 5, 0), true);
         edtavBarpiepie_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavBarpiepie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpiepie_Enabled), 5, 0), true);
      }
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e1429A2 ();
      if (returnInSub) return;
   }

   public void e1429A2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( AV53Hayrec == 1 )
      {
         GX_FocusControl = edtavBarpiepie_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         httpContext.doAjaxRefresh();
         lblTbmessage_Caption = httpContext.getMessage( "No se puede modificar los kilos, hay Receta¡¡¡", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      }
      else
      {
         if ( (0==AV9BarPiePie) )
         {
            GX_FocusControl = edtavBarpiepie_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
            httpContext.doAjaxRefresh();
            lblTbmessage_Caption = httpContext.getMessage( "Debe entrar Piezas", "") ;
            httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         }
         else
         {
            if ( (0==AV5AlbRecCod) )
            {
               GX_FocusControl = edtavAlbreccod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
               httpContext.doAjaxRefresh();
               lblTbmessage_Caption = httpContext.getMessage( "N Recepcion nulo", "") ;
               httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
            }
            else
            {
               if ( ( GXutil.strcmp(AV14BarUniMed, "K") == 0 ) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV7BarPieKil)==0) )
               {
                  GX_FocusControl = edtavBarpiekil_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  httpContext.doAjaxSetFocus(GX_FocusControl);
                  httpContext.doAjaxRefresh();
                  lblTbmessage_Caption = httpContext.getMessage( "Debe de entrar Kilos", "") ;
                  httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
               }
               else
               {
                  if ( ( GXutil.strcmp(AV14BarUniMed, "M") == 0 ) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV8BarPieMet)==0) )
                  {
                     httpContext.GX_msglist.addItem(httpContext.getMessage( "Debe de entrar Metros", ""));
                     GX_FocusControl = edtavBarpiemet_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                     httpContext.doAjaxSetFocus(GX_FocusControl);
                     httpContext.doAjaxRefresh();
                     lblTbmessage_Caption = httpContext.getMessage( "Debe de entrar Metros", "") ;
                     httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                  }
                  else
                  {
                     GXv_decimal7[0] = AV37KilosDisp ;
                     GXv_decimal8[0] = AV38MetrosDisp ;
                     GXv_int9[0] = AV39PiezasDisp ;
                     GXv_char4[0] = AV40Errmessages ;
                     new app.unidadespiezasdisponibles(remoteHandle, context).execute( AV24EmprCod, AV5AlbRecCod, AV14BarUniMed, GXv_decimal7, GXv_decimal8, GXv_int9, GXv_char4) ;
                     hojaderuta___piezas_impl.this.AV37KilosDisp = GXv_decimal7[0] ;
                     hojaderuta___piezas_impl.this.AV38MetrosDisp = GXv_decimal8[0] ;
                     hojaderuta___piezas_impl.this.AV39PiezasDisp = GXv_int9[0] ;
                     hojaderuta___piezas_impl.this.AV40Errmessages = GXv_char4[0] ;
                     if ( ! (GXutil.strcmp("", AV40Errmessages)==0) && ( AV42barpietabla == 0 ) )
                     {
                        GX_FocusControl = edtavAlbreccod_Internalname ;
                        httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        httpContext.doAjaxSetFocus(GX_FocusControl);
                        httpContext.doAjaxRefresh();
                        lblTbmessage_Caption = AV40Errmessages ;
                        httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                     }
                     else
                     {
                        if ( ( GXutil.strcmp(AV14BarUniMed, "M") == 0 ) && ( DecimalUtil.compareTo(AV8BarPieMet, AV38MetrosDisp) > 0 ) && ( AV42barpietabla == 0 ) )
                        {
                           Gx_msg = httpContext.getMessage( "Los metros ", "") + GXutil.trim( GXutil.str( AV8BarPieMet, 9, 2)) + httpContext.getMessage( " es mayor a los disponibles ", "") + GXutil.trim( GXutil.str( AV38MetrosDisp, 9, 2)) ;
                           GX_FocusControl = edtavBarpiemet_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           httpContext.doAjaxSetFocus(GX_FocusControl);
                           httpContext.doAjaxRefresh();
                           lblTbmessage_Caption = Gx_msg ;
                           httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                        }
                        else
                        {
                           if ( ( GXutil.strcmp(AV14BarUniMed, "K") == 0 ) && ( DecimalUtil.compareTo(AV7BarPieKil, AV37KilosDisp) > 0 ) && ( AV42barpietabla == 0 ) )
                           {
                              Gx_msg = httpContext.getMessage( "Los kilos ", "") + GXutil.trim( GXutil.str( AV7BarPieKil, 9, 2)) + httpContext.getMessage( " es mayor a los disponibles ", "") + GXutil.trim( GXutil.str( AV37KilosDisp, 9, 2)) ;
                              GX_FocusControl = edtavBarpiekil_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              httpContext.doAjaxSetFocus(GX_FocusControl);
                              httpContext.doAjaxRefresh();
                              lblTbmessage_Caption = Gx_msg ;
                              httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                           }
                           else
                           {
                              if ( ( ( AV43AlbRPieUti - AV45oldbarpiepie + AV9BarPiePie ) > AV49AlbRPieent ) && ( AV42barpietabla == 1 ) )
                              {
                                 GX_FocusControl = edtavBarpiepie_Internalname ;
                                 httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                                 httpContext.doAjaxSetFocus(GX_FocusControl);
                                 httpContext.doAjaxRefresh();
                                 lblTbmessage_Caption = httpContext.getMessage( "Error. Cantidad de piezas dispuestas superior a la disponible", "") ;
                                 httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                              }
                              else
                              {
                                 if ( ( ( DecimalUtil.compareTo((AV44Albruniuti.subtract(AV47oldbarpiemet).add(AV8BarPieMet)), AV48Albrunient) > 0 ) ) && ( GXutil.strcmp(AV14BarUniMed, "M") == 0 ) && ( AV42barpietabla == 1 ) )
                                 {
                                    GX_FocusControl = edtavBarpiemet_Internalname ;
                                    httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                                    httpContext.doAjaxSetFocus(GX_FocusControl);
                                    httpContext.doAjaxRefresh();
                                    lblTbmessage_Caption = httpContext.getMessage( "Error. Cantidad de unidades dispuestas superior a la disponible", "") ;
                                    httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                                 }
                                 else
                                 {
                                    AV52varcant = AV44Albruniuti.subtract(AV46oldbarpiekil).add(AV7BarPieKil) ;
                                    if ( ( DecimalUtil.compareTo(AV52varcant, AV48Albrunient) > 0 ) && ( GXutil.strcmp(AV14BarUniMed, "K") == 0 ) && ( AV42barpietabla == 1 ) )
                                    {
                                       GX_FocusControl = edtavBarpiekil_Internalname ;
                                       httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                                       httpContext.doAjaxSetFocus(GX_FocusControl);
                                       httpContext.doAjaxRefresh();
                                       Gx_msg = httpContext.getMessage( "Error. Cantidad de unidades dispuestas ", "") + GXutil.trim( GXutil.str( AV52varcant, 9, 2)) + httpContext.getMessage( " superior a la disponible ", "") + GXutil.trim( GXutil.str( AV48Albrunient, 9, 2)) ;
                                       lblTbmessage_Caption = httpContext.getMessage( "Error. Cantidad de unidades dispuestas ", "")+GXutil.trim( GXutil.str( AV52varcant, 9, 2))+httpContext.getMessage( " superior a la disponible ", "")+GXutil.trim( GXutil.str( AV48Albrunient, 9, 2)) ;
                                       httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                                    }
                                    else
                                    {
                                       this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ENTERContainer", "Confirm", "", new Object[] {});
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void e1229A2( )
   {
      /* Dvelop_confirmpanel_enter_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_enter_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ENTER' */
         S122 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e1529A2( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S122( )
   {
      /* 'DO ACTION ENTER' Routine */
      returnInSub = false ;
      new app.pedidosclientesindetalle.hojaderuta___piezas_ins_upd(remoteHandle, context).execute( AV24EmprCod, AV21BarCod, AV22BarCodReo, AV23BarCodPar, AV5AlbRecCod, AV14BarUniMed, AV7BarPieKil, AV8BarPieMet, AV9BarPiePie, AV41albrec, AV42barpietabla, AV46oldbarpiekil, AV47oldbarpiemet, AV45oldbarpiepie, AV13BarPes, AV50BarAgrEst, AV46oldbarpiekil, AV47oldbarpiemet, AV45oldbarpiepie) ;
      if ( GXutil.strcmp(AV50BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
      {
         GXv_char4[0] = AV24EmprCod ;
         GXv_int9[0] = AV21BarCod ;
         GXv_int6[0] = AV22BarCodReo ;
         GXv_char3[0] = AV23BarCodPar ;
         new app.pactagr(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_int6, GXv_char3) ;
         hojaderuta___piezas_impl.this.AV24EmprCod = GXv_char4[0] ;
         hojaderuta___piezas_impl.this.AV21BarCod = GXv_int9[0] ;
         hojaderuta___piezas_impl.this.AV22BarCodReo = GXv_int6[0] ;
         hojaderuta___piezas_impl.this.AV23BarCodPar = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24EmprCod", AV24EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV21BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV22BarCodReo", GXutil.str( AV22BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV23BarCodPar", AV23BarCodPar);
      }
      AV5AlbRecCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5AlbRecCod), 8, 0));
      AV7BarPieKil = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7BarPieKil", GXutil.ltrimstr( AV7BarPieKil, 9, 2));
      AV8BarPieMet = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8BarPieMet", GXutil.ltrimstr( AV8BarPieMet, 9, 2));
      AV9BarPiePie = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9BarPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarPiePie), 6, 0));
      GX_FocusControl = edtavAlbreccod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      httpContext.doAjaxSetFocus(GX_FocusControl);
      AV41albrec = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41albrec", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41albrec), 4, 0));
      AV42barpietabla = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42barpietabla", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42barpietabla), 4, 0));
      AV36albrpiedis = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36albrpiedis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36albrpiedis), 6, 0));
      AV49AlbRPieent = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49AlbRPieent", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49AlbRPieent), 6, 0));
      AV43AlbRPieUti = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43AlbRPieUti), 6, 0));
      AV35Albrunidis = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Albrunidis", GXutil.ltrimstr( AV35Albrunidis, 9, 2));
      AV48Albrunient = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48Albrunient", GXutil.ltrimstr( AV48Albrunient, 9, 2));
      AV44Albruniuti = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44Albruniuti", GXutil.ltrimstr( AV44Albruniuti, 9, 2));
      AV46oldbarpiekil = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46oldbarpiekil", GXutil.ltrimstr( AV46oldbarpiekil, 9, 2));
      AV47oldbarpiemet = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47oldbarpiemet", GXutil.ltrimstr( AV47oldbarpiemet, 9, 2));
      AV45oldbarpiepie = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45oldbarpiepie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45oldbarpiepie), 6, 0));
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wchojaderuta___piezas_wc = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wchojaderuta___piezas_wc_Component), GXutil.lower( "PedidosClienteSinDetalle.HojadeRuta___Piezas_WC")) != 0 )
      {
         WebComp_Wchojaderuta___piezas_wc = WebUtils.getWebComponent(getClass(), "app.pedidosclientesindetalle.hojaderuta___piezas_wc_impl", remoteHandle, context);
         WebComp_Wchojaderuta___piezas_wc_Component = "PedidosClienteSinDetalle.HojadeRuta___Piezas_WC" ;
      }
      if ( GXutil.len( WebComp_Wchojaderuta___piezas_wc_Component) != 0 )
      {
         WebComp_Wchojaderuta___piezas_wc.setjustcreated();
         WebComp_Wchojaderuta___piezas_wc.componentprepare(new Object[] {"W0136","",AV24EmprCod,Integer.valueOf(AV21BarCod),Byte.valueOf(AV22BarCodReo),AV23BarCodPar,Byte.valueOf(AV53Hayrec)});
         WebComp_Wchojaderuta___piezas_wc.componentbind(new Object[] {"","vBARCOD","vBARCODREO","vBARCODPAR","vHAYREC"});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wchojaderuta___piezas_wc )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0136"+"");
         WebComp_Wchojaderuta___piezas_wc.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      httpContext.doAjaxRefresh();
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      if ( ! ( ( 1 == 2 ) ) )
      {
         divDvpanel_unnamedtable3_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable3_cell_Internalname, "Class", divDvpanel_unnamedtable3_cell_Class, true);
      }
      else
      {
         divDvpanel_unnamedtable3_cell_Class = "col-xs-12" ;
         httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable3_cell_Internalname, "Class", divDvpanel_unnamedtable3_cell_Class, true);
      }
   }

   public void e1629A2( )
   {
      /* Albreccod_Isvalid Routine */
      returnInSub = false ;
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( (0==AV5AlbRecCod) )
      {
         GX_FocusControl = edtavAlbreccod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         httpContext.doAjaxRefresh();
         lblTbmessage_Caption = httpContext.getMessage( "NO hay valor en N Recepcion", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      }
      else
      {
         GXv_decimal8[0] = AV7BarPieKil ;
         GXv_decimal7[0] = AV8BarPieMet ;
         GXv_int9[0] = AV9BarPiePie ;
         GXv_int10[0] = AV41albrec ;
         GXv_int11[0] = AV42barpietabla ;
         GXv_decimal12[0] = AV48Albrunient ;
         GXv_int13[0] = AV49AlbRPieent ;
         GXv_decimal14[0] = AV44Albruniuti ;
         GXv_int15[0] = AV43AlbRPieUti ;
         GXv_int16[0] = AV45oldbarpiepie ;
         GXv_decimal17[0] = AV46oldbarpiekil ;
         GXv_decimal18[0] = AV47oldbarpiemet ;
         GXv_int19[0] = AV36albrpiedis ;
         GXv_decimal20[0] = AV35Albrunidis ;
         new app.pedidosclientesindetalle.hojaderuta___piezas_prc(remoteHandle, context).execute( AV24EmprCod, AV21BarCod, AV22BarCodReo, AV23BarCodPar, AV5AlbRecCod, AV14BarUniMed, GXv_decimal8, GXv_decimal7, GXv_int9, GXv_int10, GXv_int11, GXv_decimal12, GXv_int13, GXv_decimal14, GXv_int15, GXv_int16, GXv_decimal17, GXv_decimal18, GXv_int19, GXv_decimal20) ;
         hojaderuta___piezas_impl.this.AV7BarPieKil = GXv_decimal8[0] ;
         hojaderuta___piezas_impl.this.AV8BarPieMet = GXv_decimal7[0] ;
         hojaderuta___piezas_impl.this.AV9BarPiePie = GXv_int9[0] ;
         hojaderuta___piezas_impl.this.AV41albrec = GXv_int10[0] ;
         hojaderuta___piezas_impl.this.AV42barpietabla = GXv_int11[0] ;
         hojaderuta___piezas_impl.this.AV48Albrunient = GXv_decimal12[0] ;
         hojaderuta___piezas_impl.this.AV49AlbRPieent = GXv_int13[0] ;
         hojaderuta___piezas_impl.this.AV44Albruniuti = GXv_decimal14[0] ;
         hojaderuta___piezas_impl.this.AV43AlbRPieUti = GXv_int15[0] ;
         hojaderuta___piezas_impl.this.AV45oldbarpiepie = GXv_int16[0] ;
         hojaderuta___piezas_impl.this.AV46oldbarpiekil = GXv_decimal17[0] ;
         hojaderuta___piezas_impl.this.AV47oldbarpiemet = GXv_decimal18[0] ;
         hojaderuta___piezas_impl.this.AV36albrpiedis = GXv_int19[0] ;
         hojaderuta___piezas_impl.this.AV35Albrunidis = GXv_decimal20[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7BarPieKil", GXutil.ltrimstr( AV7BarPieKil, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV8BarPieMet", GXutil.ltrimstr( AV8BarPieMet, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV9BarPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarPiePie), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV41albrec", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41albrec), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV42barpietabla", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42barpietabla), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV48Albrunient", GXutil.ltrimstr( AV48Albrunient, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV49AlbRPieent", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49AlbRPieent), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV44Albruniuti", GXutil.ltrimstr( AV44Albruniuti, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV43AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43AlbRPieUti), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV45oldbarpiepie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45oldbarpiepie), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV46oldbarpiekil", GXutil.ltrimstr( AV46oldbarpiekil, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV47oldbarpiemet", GXutil.ltrimstr( AV47oldbarpiemet, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV36albrpiedis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36albrpiedis), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV35Albrunidis", GXutil.ltrimstr( AV35Albrunidis, 9, 2));
      }
      /*  Sending Event outputs  */
   }

   protected void nextLoad( )
   {
   }

   protected void e1729A2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table1_194_29A2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_enter_Internalname, tblTabledvelop_confirmpanel_enter_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_enter.setProperty("Title", Dvelop_confirmpanel_enter_Title);
         ucDvelop_confirmpanel_enter.setProperty("ConfirmationText", Dvelop_confirmpanel_enter_Confirmationtext);
         ucDvelop_confirmpanel_enter.setProperty("YesButtonCaption", Dvelop_confirmpanel_enter_Yesbuttoncaption);
         ucDvelop_confirmpanel_enter.setProperty("NoButtonCaption", Dvelop_confirmpanel_enter_Nobuttoncaption);
         ucDvelop_confirmpanel_enter.setProperty("CancelButtonCaption", Dvelop_confirmpanel_enter_Cancelbuttoncaption);
         ucDvelop_confirmpanel_enter.setProperty("YesButtonPosition", Dvelop_confirmpanel_enter_Yesbuttonposition);
         ucDvelop_confirmpanel_enter.setProperty("ConfirmType", Dvelop_confirmpanel_enter_Confirmtype);
         ucDvelop_confirmpanel_enter.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_enter_Internalname, "DVELOP_CONFIRMPANEL_ENTERContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_ENTERContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_194_29A2e( true) ;
      }
      else
      {
         wb_table1_194_29A2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV24EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24EmprCod", AV24EmprCod);
      AV21BarCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21BarCod), 8, 0));
      AV22BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22BarCodReo", GXutil.str( AV22BarCodReo, 1, 0));
      AV23BarCodPar = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23BarCodPar", AV23BarCodPar);
      AV18CliCod = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18CliCod), 6, 0));
      AV25Discod = ((Number) GXutil.testNumericType( getParm(obj,5), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Discod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25Discod), 8, 0));
      AV14BarUniMed = (String)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14BarUniMed", AV14BarUniMed);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARUNIMED", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14BarUniMed, "@!"))));
      AV13BarPes = ((Number) GXutil.testNumericType( getParm(obj,7), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13BarPes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarPes), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13BarPes), "ZZZ9")));
      AV15BarSer = (String)getParm(obj,8) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15BarSer", AV15BarSer);
      AV20PedidoCliente = (String)getParm(obj,9) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20PedidoCliente", AV20PedidoCliente);
      AV16BarColNom = (String)getParm(obj,10) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16BarColNom", AV16BarColNom);
      AV17BarColNum = ((Number) GXutil.testNumericType( getParm(obj,11), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17BarColNum), 6, 0));
      AV10BarPie = ((Number) GXutil.testNumericType( getParm(obj,12), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10BarPie), 6, 0));
      AV11BarKgm = (java.math.BigDecimal)getParm(obj,13) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11BarKgm", GXutil.ltrimstr( AV11BarKgm, 9, 2));
      AV12BarMtr = (java.math.BigDecimal)getParm(obj,14) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12BarMtr", GXutil.ltrimstr( AV12BarMtr, 9, 2));
      AV19CliNom = (String)getParm(obj,15) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19CliNom", AV19CliNom);
      AV26BarSerDsc = (String)getParm(obj,16) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26BarSerDsc", AV26BarSerDsc);
      AV50BarAgrEst = (String)getParm(obj,17) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50BarAgrEst", AV50BarAgrEst);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARAGREST", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV50BarAgrEst, "@!"))));
      AV53Hayrec = ((Number) GXutil.testNumericType( getParm(obj,18), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53Hayrec", GXutil.str( AV53Hayrec, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHAYREC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV53Hayrec), "9")));
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
      pa29A2( ) ;
      ws29A2( ) ;
      we29A2( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Wchojaderuta___piezas_wc == null ) )
      {
         if ( GXutil.len( WebComp_Wchojaderuta___piezas_wc_Component) != 0 )
         {
            WebComp_Wchojaderuta___piezas_wc.componentthemes();
         }
      }
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20267613491480", true, true);
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
      httpContext.AddJavascriptSource("pedidosclientesindetalle/hojaderuta___piezas.js", "?20267613491480", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavBarcod_Internalname = "vBARCOD" ;
      edtavBarcodreo_Internalname = "vBARCODREO" ;
      edtavBarcodpar_Internalname = "vBARCODPAR" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      edtavClicod_Internalname = "vCLICOD" ;
      edtavClinom_Internalname = "vCLINOM" ;
      edtavPedidocliente_Internalname = "vPEDIDOCLIENTE" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      edtavBarser_Internalname = "vBARSER" ;
      edtavBarcolnom_Internalname = "vBARCOLNOM" ;
      edtavBarcolnum_Internalname = "vBARCOLNUM" ;
      chkavHayrec.setInternalname( "vHAYREC" );
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      edtavBarpie_Internalname = "vBARPIE" ;
      edtavBarkgm_Internalname = "vBARKGM" ;
      edtavBarmtr_Internalname = "vBARMTR" ;
      edtavBarpes_Internalname = "vBARPES" ;
      edtavBarunimed_Internalname = "vBARUNIMED" ;
      divUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      edtavAlbreccod_Internalname = "vALBRECCOD" ;
      imgavPromptalbrec_Internalname = "vPROMPTALBREC" ;
      edtavBarpiekil_Internalname = "vBARPIEKIL" ;
      edtavBarpiemet_Internalname = "vBARPIEMET" ;
      edtavBarpiepie_Internalname = "vBARPIEPIE" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      lblTbmessage_Internalname = "TBMESSAGE" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtavAlbrec_Internalname = "vALBREC" ;
      edtavBarpietabla_Internalname = "vBARPIETABLA" ;
      edtavAlbrunient_Internalname = "vALBRUNIENT" ;
      edtavAlbruniuti_Internalname = "vALBRUNIUTI" ;
      edtavAlbrunidis_Internalname = "vALBRUNIDIS" ;
      edtavAlbrpieent_Internalname = "vALBRPIEENT" ;
      edtavAlbrpieuti_Internalname = "vALBRPIEUTI" ;
      edtavAlbrpiedis_Internalname = "vALBRPIEDIS" ;
      edtavOldbarpiekil_Internalname = "vOLDBARPIEKIL" ;
      edtavOldbarpiemet_Internalname = "vOLDBARPIEMET" ;
      edtavOldbarpiepie_Internalname = "vOLDBARPIEPIE" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      Dvpanel_unnamedtable3_Internalname = "DVPANEL_UNNAMEDTABLE3" ;
      divDvpanel_unnamedtable3_cell_Internalname = "DVPANEL_UNNAMEDTABLE3_CELL" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Dvelop_confirmpanel_enter_Internalname = "DVELOP_CONFIRMPANEL_ENTER" ;
      tblTabledvelop_confirmpanel_enter_Internalname = "TABLEDVELOP_CONFIRMPANEL_ENTER" ;
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
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavOldbarpiepie_Jsonclick = "" ;
      edtavOldbarpiepie_Enabled = 1 ;
      edtavOldbarpiemet_Jsonclick = "" ;
      edtavOldbarpiemet_Enabled = 1 ;
      edtavOldbarpiekil_Jsonclick = "" ;
      edtavOldbarpiekil_Enabled = 1 ;
      edtavAlbrpiedis_Jsonclick = "" ;
      edtavAlbrpiedis_Enabled = 1 ;
      edtavAlbrpieuti_Jsonclick = "" ;
      edtavAlbrpieuti_Enabled = 1 ;
      edtavAlbrpieent_Jsonclick = "" ;
      edtavAlbrpieent_Enabled = 1 ;
      edtavAlbrunidis_Jsonclick = "" ;
      edtavAlbrunidis_Enabled = 1 ;
      edtavAlbruniuti_Jsonclick = "" ;
      edtavAlbruniuti_Enabled = 1 ;
      edtavAlbrunient_Jsonclick = "" ;
      edtavAlbrunient_Enabled = 1 ;
      edtavBarpietabla_Jsonclick = "" ;
      edtavBarpietabla_Enabled = 1 ;
      edtavAlbrec_Jsonclick = "" ;
      edtavAlbrec_Enabled = 1 ;
      divDvpanel_unnamedtable3_cell_Class = "col-xs-12" ;
      lblTbmessage_Caption = "  " ;
      edtavBarpiepie_Jsonclick = "" ;
      edtavBarpiepie_Enabled = 1 ;
      edtavBarpiemet_Jsonclick = "" ;
      edtavBarpiemet_Enabled = 1 ;
      edtavBarpiekil_Jsonclick = "" ;
      edtavBarpiekil_Enabled = 1 ;
      imgavPromptalbrec_Jsonclick = "" ;
      imgavPromptalbrec_gximage = "" ;
      edtavAlbreccod_Jsonclick = "" ;
      edtavAlbreccod_Enabled = 1 ;
      edtavBarunimed_Jsonclick = "" ;
      edtavBarunimed_Enabled = 0 ;
      edtavBarpes_Jsonclick = "" ;
      edtavBarpes_Enabled = 0 ;
      edtavBarmtr_Jsonclick = "" ;
      edtavBarmtr_Enabled = 0 ;
      edtavBarkgm_Jsonclick = "" ;
      edtavBarkgm_Enabled = 0 ;
      edtavBarpie_Jsonclick = "" ;
      edtavBarpie_Enabled = 0 ;
      chkavHayrec.setEnabled( 0 );
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
      edtavBarcodpar_Jsonclick = "" ;
      edtavBarcodpar_Enabled = 0 ;
      edtavBarcodreo_Jsonclick = "" ;
      edtavBarcodreo_Enabled = 0 ;
      edtavBarcod_Jsonclick = "" ;
      edtavBarcod_Enabled = 0 ;
      Dvelop_confirmpanel_enter_Confirmtype = "1" ;
      Dvelop_confirmpanel_enter_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_enter_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_enter_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_enter_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_enter_Confirmationtext = "¿Confirma el dato?" ;
      Dvelop_confirmpanel_enter_Title = "" ;
      Dvpanel_unnamedtable3_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Iconposition = "Right" ;
      Dvpanel_unnamedtable3_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Title = httpContext.getMessage( "Control", "") ;
      Dvpanel_unnamedtable3_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable3_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Width = "100%" ;
      Dvpanel_tableheader_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Iconposition = "Right" ;
      Dvpanel_tableheader_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tableheader_Title = "" ;
      Dvpanel_tableheader_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableheader_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableheader_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Width = "100%" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 1) ;
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
      Form.setCaption( httpContext.getMessage( "Mantenimiento de Piezas (Hdr)", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      chkavHayrec.setName( "vHAYREC" );
      chkavHayrec.setWebtags( "" );
      chkavHayrec.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavHayrec.getInternalname(), "TitleCaption", chkavHayrec.getCaption(), true);
      chkavHayrec.setCheckedValue( "0" );
      AV53Hayrec = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( AV53Hayrec, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53Hayrec", GXutil.str( AV53Hayrec, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHAYREC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV53Hayrec), "9")));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV50BarAgrEst',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV14BarUniMed',fld:'vBARUNIMED',pic:'@!',hsh:true},{av:'AV13BarPes',fld:'vBARPES',pic:'ZZZ9',hsh:true},{av:'AV53Hayrec',fld:'vHAYREC',pic:'9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("ENTER","{handler:'e1429A2',iparms:[{av:'AV53Hayrec',fld:'vHAYREC',pic:'9',hsh:true},{av:'AV9BarPiePie',fld:'vBARPIEPIE',pic:'ZZZZZ9'},{av:'AV5AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV14BarUniMed',fld:'vBARUNIMED',pic:'@!',hsh:true},{av:'AV7BarPieKil',fld:'vBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV8BarPieMet',fld:'vBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV24EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV42barpietabla',fld:'vBARPIETABLA',pic:'ZZZ9'},{av:'AV43AlbRPieUti',fld:'vALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV45oldbarpiepie',fld:'vOLDBARPIEPIE',pic:'ZZZZZ9'},{av:'AV49AlbRPieent',fld:'vALBRPIEENT',pic:'ZZZZZ9'},{av:'AV44Albruniuti',fld:'vALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV47oldbarpiemet',fld:'vOLDBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV48Albrunient',fld:'vALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV46oldbarpiekil',fld:'vOLDBARPIEKIL',pic:'ZZZZZ9.99'}]");
      setEventMetadata("ENTER",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE","{handler:'e1229A2',iparms:[{av:'Dvelop_confirmpanel_enter_Result',ctrl:'DVELOP_CONFIRMPANEL_ENTER',prop:'Result'},{av:'AV24EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV21BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV22BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV23BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV5AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV14BarUniMed',fld:'vBARUNIMED',pic:'@!',hsh:true},{av:'AV7BarPieKil',fld:'vBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV8BarPieMet',fld:'vBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV9BarPiePie',fld:'vBARPIEPIE',pic:'ZZZZZ9'},{av:'AV41albrec',fld:'vALBREC',pic:'ZZZ9'},{av:'AV42barpietabla',fld:'vBARPIETABLA',pic:'ZZZ9'},{av:'AV13BarPes',fld:'vBARPES',pic:'ZZZ9',hsh:true},{av:'AV50BarAgrEst',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV46oldbarpiekil',fld:'vOLDBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV47oldbarpiemet',fld:'vOLDBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV45oldbarpiepie',fld:'vOLDBARPIEPIE',pic:'ZZZZZ9'},{av:'AV53Hayrec',fld:'vHAYREC',pic:'9',hsh:true}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE",",oparms:[{av:'AV23BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV22BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV21BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV24EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV7BarPieKil',fld:'vBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV8BarPieMet',fld:'vBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV9BarPiePie',fld:'vBARPIEPIE',pic:'ZZZZZ9'},{av:'AV41albrec',fld:'vALBREC',pic:'ZZZ9'},{av:'AV42barpietabla',fld:'vBARPIETABLA',pic:'ZZZ9'},{av:'AV36albrpiedis',fld:'vALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV49AlbRPieent',fld:'vALBRPIEENT',pic:'ZZZZZ9'},{av:'AV43AlbRPieUti',fld:'vALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV35Albrunidis',fld:'vALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV48Albrunient',fld:'vALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV44Albruniuti',fld:'vALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV46oldbarpiekil',fld:'vOLDBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV47oldbarpiemet',fld:'vOLDBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV45oldbarpiepie',fld:'vOLDBARPIEPIE',pic:'ZZZZZ9'},{ctrl:'WCHOJADERUTA___PIEZAS_WC'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e1529A2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("VPROMPTALBREC.CLICK","{handler:'e1129A1',iparms:[{av:'AV24EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV18CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV14BarUniMed',fld:'vBARUNIMED',pic:'@!',hsh:true}]");
      setEventMetadata("VPROMPTALBREC.CLICK",",oparms:[{av:'AV36albrpiedis',fld:'vALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV35Albrunidis',fld:'vALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV18CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV5AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV24EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9BarPiePie',fld:'vBARPIEPIE',pic:'ZZZZZ9'},{av:'AV7BarPieKil',fld:'vBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV8BarPieMet',fld:'vBARPIEMET',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("VALBRECCOD.ISVALID","{handler:'e1629A2',iparms:[{av:'AV5AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV24EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV21BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV22BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV23BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV14BarUniMed',fld:'vBARUNIMED',pic:'@!',hsh:true}]");
      setEventMetadata("VALBRECCOD.ISVALID",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV35Albrunidis',fld:'vALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV36albrpiedis',fld:'vALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV47oldbarpiemet',fld:'vOLDBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV46oldbarpiekil',fld:'vOLDBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV45oldbarpiepie',fld:'vOLDBARPIEPIE',pic:'ZZZZZ9'},{av:'AV43AlbRPieUti',fld:'vALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV44Albruniuti',fld:'vALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV49AlbRPieent',fld:'vALBRPIEENT',pic:'ZZZZZ9'},{av:'AV48Albrunient',fld:'vALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV42barpietabla',fld:'vBARPIETABLA',pic:'ZZZ9'},{av:'AV41albrec',fld:'vALBREC',pic:'ZZZ9'},{av:'AV9BarPiePie',fld:'vBARPIEPIE',pic:'ZZZZZ9'},{av:'AV8BarPieMet',fld:'vBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV7BarPieKil',fld:'vBARPIEKIL',pic:'ZZZZZ9.99'}]}");
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
      wcpOAV24EmprCod = "" ;
      wcpOAV23BarCodPar = "" ;
      wcpOAV14BarUniMed = "" ;
      wcpOAV15BarSer = "" ;
      wcpOAV20PedidoCliente = "" ;
      wcpOAV16BarColNom = "" ;
      wcpOAV11BarKgm = DecimalUtil.ZERO ;
      wcpOAV12BarMtr = DecimalUtil.ZERO ;
      wcpOAV19CliNom = "" ;
      wcpOAV26BarSerDsc = "" ;
      wcpOAV50BarAgrEst = "" ;
      Dvelop_confirmpanel_enter_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV24EmprCod = "" ;
      AV23BarCodPar = "" ;
      AV14BarUniMed = "" ;
      AV15BarSer = "" ;
      AV20PedidoCliente = "" ;
      AV16BarColNom = "" ;
      AV11BarKgm = DecimalUtil.ZERO ;
      AV12BarMtr = DecimalUtil.ZERO ;
      AV19CliNom = "" ;
      AV26BarSerDsc = "" ;
      AV50BarAgrEst = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV6promptalbrec = "" ;
      AV57Promptalbrec_GXI = "" ;
      sImgUrl = "" ;
      AV7BarPieKil = DecimalUtil.ZERO ;
      AV8BarPieMet = DecimalUtil.ZERO ;
      bttBtnenter_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      lblTbmessage_Jsonclick = "" ;
      WebComp_Wchojaderuta___piezas_wc_Component = "" ;
      OldWchojaderuta___piezas_wc = "" ;
      ucDvpanel_unnamedtable3 = new com.genexus.webpanels.GXUserControl();
      AV48Albrunient = DecimalUtil.ZERO ;
      AV44Albruniuti = DecimalUtil.ZERO ;
      AV35Albrunidis = DecimalUtil.ZERO ;
      AV46oldbarpiekil = DecimalUtil.ZERO ;
      AV47oldbarpiemet = DecimalUtil.ZERO ;
      AV56Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV27Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV28EmprNom = "" ;
      AV29UsurCod = "" ;
      AV37KilosDisp = DecimalUtil.ZERO ;
      AV38MetrosDisp = DecimalUtil.ZERO ;
      AV40Errmessages = "" ;
      Gx_msg = "" ;
      AV52varcant = DecimalUtil.ZERO ;
      GXv_char4 = new String[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_int9 = new int[1] ;
      GXv_int10 = new short[1] ;
      GXv_int11 = new short[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_int13 = new int[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_int15 = new int[1] ;
      GXv_int16 = new int[1] ;
      GXv_decimal17 = new java.math.BigDecimal[1] ;
      GXv_decimal18 = new java.math.BigDecimal[1] ;
      GXv_int19 = new int[1] ;
      GXv_decimal20 = new java.math.BigDecimal[1] ;
      sStyleString = "" ;
      ucDvelop_confirmpanel_enter = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      AV56Pgmname = "PedidosClienteSinDetalle.HojadeRuta___Piezas" ;
      /* GeneXus formulas. */
      AV56Pgmname = "PedidosClienteSinDetalle.HojadeRuta___Piezas" ;
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
      chkavHayrec.setEnabled( 0 );
      edtavBarpie_Enabled = 0 ;
      edtavBarkgm_Enabled = 0 ;
      edtavBarmtr_Enabled = 0 ;
      edtavBarpes_Enabled = 0 ;
      edtavBarunimed_Enabled = 0 ;
      edtavAlbrec_Enabled = 0 ;
      edtavBarpietabla_Enabled = 0 ;
      edtavAlbrunient_Enabled = 0 ;
      edtavAlbruniuti_Enabled = 0 ;
      edtavAlbrunidis_Enabled = 0 ;
      edtavAlbrpieent_Enabled = 0 ;
      edtavAlbrpieuti_Enabled = 0 ;
      edtavAlbrpiedis_Enabled = 0 ;
      edtavOldbarpiekil_Enabled = 0 ;
      edtavOldbarpiemet_Enabled = 0 ;
      edtavOldbarpiepie_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      WebComp_Wchojaderuta___piezas_wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV22BarCodReo ;
   private byte wcpOAV53Hayrec ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV22BarCodReo ;
   private byte AV53Hayrec ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte nGXWrapped ;
   private short wcpOAV13BarPes ;
   private short AV13BarPes ;
   private short wbEnd ;
   private short wbStart ;
   private short AV41albrec ;
   private short AV42barpietabla ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV30TinEst ;
   private short AV31Vertic ;
   private short AV32Tela ;
   private short AV33Erfoc ;
   private short AV34TTRN22 ;
   private short AV51Flag2 ;
   private short GXv_int10[] ;
   private short GXv_int11[] ;
   private int wcpOAV21BarCod ;
   private int wcpOAV18CliCod ;
   private int wcpOAV25Discod ;
   private int wcpOAV17BarColNum ;
   private int wcpOAV10BarPie ;
   private int AV21BarCod ;
   private int AV18CliCod ;
   private int AV25Discod ;
   private int AV17BarColNum ;
   private int AV10BarPie ;
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
   private int edtavBarpes_Enabled ;
   private int edtavBarunimed_Enabled ;
   private int AV5AlbRecCod ;
   private int edtavAlbreccod_Enabled ;
   private int edtavBarpiekil_Enabled ;
   private int edtavBarpiemet_Enabled ;
   private int AV9BarPiePie ;
   private int edtavBarpiepie_Enabled ;
   private int edtavAlbrec_Enabled ;
   private int edtavBarpietabla_Enabled ;
   private int edtavAlbrunient_Enabled ;
   private int edtavAlbruniuti_Enabled ;
   private int edtavAlbrunidis_Enabled ;
   private int AV49AlbRPieent ;
   private int edtavAlbrpieent_Enabled ;
   private int AV43AlbRPieUti ;
   private int edtavAlbrpieuti_Enabled ;
   private int AV36albrpiedis ;
   private int edtavAlbrpiedis_Enabled ;
   private int edtavOldbarpiekil_Enabled ;
   private int edtavOldbarpiemet_Enabled ;
   private int AV45oldbarpiepie ;
   private int edtavOldbarpiepie_Enabled ;
   private int edtavPgmname_Enabled ;
   private int AV39PiezasDisp ;
   private int GXv_int9[] ;
   private int GXv_int13[] ;
   private int GXv_int15[] ;
   private int GXv_int16[] ;
   private int GXv_int19[] ;
   private int idxLst ;
   private java.math.BigDecimal wcpOAV11BarKgm ;
   private java.math.BigDecimal wcpOAV12BarMtr ;
   private java.math.BigDecimal AV11BarKgm ;
   private java.math.BigDecimal AV12BarMtr ;
   private java.math.BigDecimal AV7BarPieKil ;
   private java.math.BigDecimal AV8BarPieMet ;
   private java.math.BigDecimal AV48Albrunient ;
   private java.math.BigDecimal AV44Albruniuti ;
   private java.math.BigDecimal AV35Albrunidis ;
   private java.math.BigDecimal AV46oldbarpiekil ;
   private java.math.BigDecimal AV47oldbarpiemet ;
   private java.math.BigDecimal AV37KilosDisp ;
   private java.math.BigDecimal AV38MetrosDisp ;
   private java.math.BigDecimal AV52varcant ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal GXv_decimal17[] ;
   private java.math.BigDecimal GXv_decimal18[] ;
   private java.math.BigDecimal GXv_decimal20[] ;
   private String wcpOAV24EmprCod ;
   private String wcpOAV23BarCodPar ;
   private String wcpOAV14BarUniMed ;
   private String wcpOAV15BarSer ;
   private String wcpOAV20PedidoCliente ;
   private String wcpOAV16BarColNom ;
   private String wcpOAV19CliNom ;
   private String wcpOAV26BarSerDsc ;
   private String wcpOAV50BarAgrEst ;
   private String Dvelop_confirmpanel_enter_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV24EmprCod ;
   private String AV23BarCodPar ;
   private String AV14BarUniMed ;
   private String AV15BarSer ;
   private String AV20PedidoCliente ;
   private String AV16BarColNom ;
   private String AV19CliNom ;
   private String AV26BarSerDsc ;
   private String AV50BarAgrEst ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
   private String Dvpanel_unnamedtable3_Width ;
   private String Dvpanel_unnamedtable3_Cls ;
   private String Dvpanel_unnamedtable3_Title ;
   private String Dvpanel_unnamedtable3_Iconposition ;
   private String Dvelop_confirmpanel_enter_Title ;
   private String Dvelop_confirmpanel_enter_Confirmationtext ;
   private String Dvelop_confirmpanel_enter_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_enter_Nobuttoncaption ;
   private String Dvelop_confirmpanel_enter_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_enter_Yesbuttonposition ;
   private String Dvelop_confirmpanel_enter_Confirmtype ;
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
   private String edtavBarpes_Internalname ;
   private String edtavBarpes_Jsonclick ;
   private String edtavBarunimed_Internalname ;
   private String edtavBarunimed_Jsonclick ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtavAlbreccod_Internalname ;
   private String TempTags ;
   private String edtavAlbreccod_Jsonclick ;
   private String imgavPromptalbrec_Internalname ;
   private String imgavPromptalbrec_gximage ;
   private String sImgUrl ;
   private String imgavPromptalbrec_Jsonclick ;
   private String edtavBarpiekil_Internalname ;
   private String edtavBarpiekil_Jsonclick ;
   private String edtavBarpiemet_Internalname ;
   private String edtavBarpiemet_Jsonclick ;
   private String edtavBarpiepie_Internalname ;
   private String edtavBarpiepie_Jsonclick ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String lblTbmessage_Internalname ;
   private String lblTbmessage_Caption ;
   private String lblTbmessage_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String WebComp_Wchojaderuta___piezas_wc_Component ;
   private String OldWchojaderuta___piezas_wc ;
   private String divDvpanel_unnamedtable3_cell_Internalname ;
   private String divDvpanel_unnamedtable3_cell_Class ;
   private String Dvpanel_unnamedtable3_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtavAlbrec_Internalname ;
   private String edtavAlbrec_Jsonclick ;
   private String edtavBarpietabla_Internalname ;
   private String edtavBarpietabla_Jsonclick ;
   private String edtavAlbrunient_Internalname ;
   private String edtavAlbrunient_Jsonclick ;
   private String edtavAlbruniuti_Internalname ;
   private String edtavAlbruniuti_Jsonclick ;
   private String edtavAlbrunidis_Internalname ;
   private String edtavAlbrunidis_Jsonclick ;
   private String edtavAlbrpieent_Internalname ;
   private String edtavAlbrpieent_Jsonclick ;
   private String edtavAlbrpieuti_Internalname ;
   private String edtavAlbrpieuti_Jsonclick ;
   private String edtavAlbrpiedis_Internalname ;
   private String edtavAlbrpiedis_Jsonclick ;
   private String edtavOldbarpiekil_Internalname ;
   private String edtavOldbarpiekil_Jsonclick ;
   private String edtavOldbarpiemet_Internalname ;
   private String edtavOldbarpiemet_Jsonclick ;
   private String edtavOldbarpiepie_Internalname ;
   private String edtavOldbarpiepie_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV56Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV27Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV28EmprNom ;
   private String AV29UsurCod ;
   private String Gx_msg ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String sStyleString ;
   private String tblTabledvelop_confirmpanel_enter_Internalname ;
   private String Dvelop_confirmpanel_enter_Internalname ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Dvpanel_unnamedtable3_Autowidth ;
   private boolean Dvpanel_unnamedtable3_Autoheight ;
   private boolean Dvpanel_unnamedtable3_Collapsible ;
   private boolean Dvpanel_unnamedtable3_Collapsed ;
   private boolean Dvpanel_unnamedtable3_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable3_Autoscroll ;
   private boolean wbLoad ;
   private boolean AV6promptalbrec_IsBlob ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean bDynCreated_Wchojaderuta___piezas_wc ;
   private String AV57Promptalbrec_GXI ;
   private String AV40Errmessages ;
   private String AV6promptalbrec ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wchojaderuta___piezas_wc ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable3 ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_enter ;
   private ICheckbox chkavHayrec ;
   private com.genexus.webpanels.GXWebForm Form ;
}

