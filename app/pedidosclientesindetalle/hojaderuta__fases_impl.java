package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class hojaderuta__fases_impl extends GXDataArea
{
   public hojaderuta__fases_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public hojaderuta__fases_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( hojaderuta__fases_impl.class ));
   }

   public hojaderuta__fases_impl( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavBarfasest = new HTMLChoice();
      cmbavBarfascon = new HTMLChoice();
      cmbavBarfactin = new HTMLChoice();
      cmbavBarfasacab = new HTMLChoice();
      cmbavBarfasfor = new HTMLChoice();
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
            AV21EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21EmprCod", AV21EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV22BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV22BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22BarCod), 8, 0));
               AV23BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV23BarCodReo", GXutil.str( AV23BarCodReo, 1, 0));
               AV24BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV24BarCodPar", AV24BarCodPar);
               AV25ProCod = httpContext.GetPar( "ProCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV25ProCod", AV25ProCod);
               AV26ProDsc = httpContext.GetPar( "ProDsc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26ProDsc", AV26ProDsc);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRODSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26ProDsc, ""))));
               AV30BarExt = (byte)(GXutil.lval( httpContext.GetPar( "BarExt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV30BarExt", GXutil.str( AV30BarExt, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBAREXT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV30BarExt), "9")));
               AV31Discod = (int)(GXutil.lval( httpContext.GetPar( "Discod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV31Discod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31Discod), 8, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV31Discod), "ZZZZZZZ9")));
               AV32BarSit = (byte)(GXutil.lval( httpContext.GetPar( "BarSit"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV32BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32BarSit), 2, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSIT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV32BarSit), "Z9")));
               AV33Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV33Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Clicod), 6, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33Clicod), "ZZZZZ9")));
               AV34Barunimed = httpContext.GetPar( "Barunimed") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV34Barunimed", AV34Barunimed);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARUNIMED", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV34Barunimed, "@!"))));
               AV35Barpes = (short)(GXutil.lval( httpContext.GetPar( "Barpes"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV35Barpes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35Barpes), 4, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV35Barpes), "ZZZ9")));
               AV45barser = httpContext.GetPar( "barser") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV45barser", AV45barser);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV45barser, ""))));
               AV44PedidoCliente = httpContext.GetPar( "PedidoCliente") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV44PedidoCliente", AV44PedidoCliente);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPEDIDOCLIENTE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV44PedidoCliente, ""))));
               AV43barcolnom = httpContext.GetPar( "barcolnom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV43barcolnom", AV43barcolnom);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV43barcolnom, ""))));
               AV42barcolnum = (int)(GXutil.lval( httpContext.GetPar( "barcolnum"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV42barcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42barcolnum), 6, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV42barcolnum), "ZZZZZ9")));
               AV41Barpie = (int)(GXutil.lval( httpContext.GetPar( "Barpie"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV41Barpie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41Barpie), 6, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41Barpie), "ZZZZZ9")));
               AV40BarKgm = CommonUtil.decimalVal( httpContext.GetPar( "BarKgm"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV40BarKgm", GXutil.ltrimstr( AV40BarKgm, 9, 2));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARKGM", getSecureSignedToken( "", localUtil.format( AV40BarKgm, "ZZZZZ9.99")));
               AV39Barmtr = CommonUtil.decimalVal( httpContext.GetPar( "Barmtr"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV39Barmtr", GXutil.ltrimstr( AV39Barmtr, 9, 2));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARMTR", getSecureSignedToken( "", localUtil.format( AV39Barmtr, "ZZZZZ9.99")));
               AV38CliNom = httpContext.GetPar( "CliNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV38CliNom", AV38CliNom);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV38CliNom, ""))));
               AV37BarSerDsc = httpContext.GetPar( "BarSerDsc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV37BarSerDsc", AV37BarSerDsc);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSERDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV37BarSerDsc, ""))));
               AV36BarAgrest = httpContext.GetPar( "BarAgrest") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV36BarAgrest", AV36BarAgrest);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARAGREST", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV36BarAgrest, "@!"))));
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
      pa29C2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start29C2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.pedidosclientesindetalle.hojaderuta__fases", new String[] {GXutil.URLEncode(GXutil.rtrim(AV21EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV22BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV23BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV24BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV25ProCod)),GXutil.URLEncode(GXutil.rtrim(AV26ProDsc)),GXutil.URLEncode(GXutil.ltrimstr(AV30BarExt,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV31Discod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV32BarSit,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV33Clicod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV34Barunimed)),GXutil.URLEncode(GXutil.ltrimstr(AV35Barpes,4,0)),GXutil.URLEncode(GXutil.rtrim(AV45barser)),GXutil.URLEncode(GXutil.rtrim(AV44PedidoCliente)),GXutil.URLEncode(GXutil.rtrim(AV43barcolnom)),GXutil.URLEncode(GXutil.ltrimstr(AV42barcolnum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV41Barpie,6,0)),GXutil.URLEncode(DecimalUtil.decToString(AV40BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(AV39Barmtr)),GXutil.URLEncode(GXutil.rtrim(AV38CliNom)),GXutil.URLEncode(GXutil.rtrim(AV37BarSerDsc)),GXutil.URLEncode(GXutil.rtrim(AV36BarAgrest))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","ProDsc","BarExt","Discod","BarSit","Clicod","Barunimed","Barpes","barser","PedidoCliente","barcolnom","barcolnum","Barpie","BarKgm","Barmtr","CliNom","BarSerDsc","BarAgrest"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPLANING", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV50Planing), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFASESTIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV52BarFasEstIN), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRODSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26ProDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBAREXT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV30BarExt), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV31Discod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSIT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV32BarSit), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33Clicod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARUNIMED", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV34Barunimed, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV35Barpes), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV45barser, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPEDIDOCLIENTE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV44PedidoCliente, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV43barcolnom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV42barcolnum), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41Barpie), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARKGM", getSecureSignedToken( "", localUtil.format( AV40BarKgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARMTR", getSecureSignedToken( "", localUtil.format( AV39Barmtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV38CliNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSERDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV37BarSerDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARAGREST", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV36BarAgrest, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"HojadeRuta__Fases");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV58Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("pedidosclientesindetalle\\hojaderuta__fases:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMAQCODBIS_DATA", AV20MaqCodBis_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMAQCODBIS_DATA", AV20MaqCodBis_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV21EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV22BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV23BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV24BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV29UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV27Station));
      app.GxWebStd.gx_hidden_field( httpContext, "vPLANING", GXutil.ltrim( localUtil.ntoc( AV50Planing, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPLANING", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV50Planing), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBAREXT", GXutil.ltrim( localUtil.ntoc( AV30BarExt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBAREXT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV30BarExt), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vDISCOD", GXutil.ltrim( localUtil.ntoc( AV31Discod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV31Discod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSIT", GXutil.ltrim( localUtil.ntoc( AV32BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSIT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV32BarSit), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD", GXutil.ltrim( localUtil.ntoc( AV33Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33Clicod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARUNIMED", GXutil.rtrim( AV34Barunimed));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARUNIMED", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV34Barunimed, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPES", GXutil.ltrim( localUtil.ntoc( AV35Barpes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV35Barpes), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSER", GXutil.rtrim( AV45barser));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV45barser, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPEDIDOCLIENTE", GXutil.rtrim( AV44PedidoCliente));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPEDIDOCLIENTE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV44PedidoCliente, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOLNOM", GXutil.rtrim( AV43barcolnom));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV43barcolnom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV42barcolnum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV42barcolnum), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPIE", GXutil.ltrim( localUtil.ntoc( AV41Barpie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41Barpie), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARKGM", GXutil.ltrim( localUtil.ntoc( AV40BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARKGM", getSecureSignedToken( "", localUtil.format( AV40BarKgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARMTR", GXutil.ltrim( localUtil.ntoc( AV39Barmtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARMTR", getSecureSignedToken( "", localUtil.format( AV39Barmtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLINOM", GXutil.rtrim( AV38CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV38CliNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSERDSC", GXutil.rtrim( AV37BarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSERDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV37BarSerDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARAGREST", GXutil.rtrim( AV36BarAgrest));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARAGREST", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV36BarAgrest, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARFECRINI", localUtil.dtoc( AV48Barfecrini, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARTIETEO", GXutil.ltrim( localUtil.ntoc( AV17BarTieteo, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARUNI", GXutil.ltrim( localUtil.ntoc( AV47Baruni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARFASESTIN", GXutil.ltrim( localUtil.ntoc( AV52BarFasEstIN, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFASESTIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV52BarFasEstIN), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFASCODIN", GXutil.rtrim( AV55FascodIN));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCOD", GXutil.rtrim( A457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCON", GXutil.rtrim( A458FasCon));
      app.GxWebStd.gx_hidden_field( httpContext, "FASACTTIN", GXutil.rtrim( A456FasActTin));
      app.GxWebStd.gx_hidden_field( httpContext, "FASACAB", GXutil.rtrim( A4903FasAcab));
      app.GxWebStd.gx_hidden_field( httpContext, "FASFORMUL", GXutil.rtrim( A4286FasForMul));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCODBIS_Cls", GXutil.rtrim( Combo_maqcodbis_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCODBIS_Selectedvalue_set", GXutil.rtrim( Combo_maqcodbis_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCODBIS_Enabled", GXutil.booltostr( Combo_maqcodbis_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCODBIS_Emptyitem", GXutil.booltostr( Combo_maqcodbis_Emptyitem));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Title", GXutil.rtrim( Dvelop_confirmpanel_enter_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_enter_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_enter_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_enter_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Result", GXutil.rtrim( Dvelop_confirmpanel_enter_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCODBIS_Selectedvalue_get", GXutil.rtrim( Combo_maqcodbis_Selectedvalue_get));
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
      if ( ! ( WebComp_Wchojaderuta__fases_wc == null ) )
      {
         WebComp_Wchojaderuta__fases_wc.componentjscripts();
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
         we29C2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt29C2( ) ;
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
      return formatLink("app.pedidosclientesindetalle.hojaderuta__fases", new String[] {GXutil.URLEncode(GXutil.rtrim(AV21EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV22BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV23BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV24BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV25ProCod)),GXutil.URLEncode(GXutil.rtrim(AV26ProDsc)),GXutil.URLEncode(GXutil.ltrimstr(AV30BarExt,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV31Discod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV32BarSit,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV33Clicod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV34Barunimed)),GXutil.URLEncode(GXutil.ltrimstr(AV35Barpes,4,0)),GXutil.URLEncode(GXutil.rtrim(AV45barser)),GXutil.URLEncode(GXutil.rtrim(AV44PedidoCliente)),GXutil.URLEncode(GXutil.rtrim(AV43barcolnom)),GXutil.URLEncode(GXutil.ltrimstr(AV42barcolnum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV41Barpie,6,0)),GXutil.URLEncode(DecimalUtil.decToString(AV40BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(AV39Barmtr)),GXutil.URLEncode(GXutil.rtrim(AV38CliNom)),GXutil.URLEncode(GXutil.rtrim(AV37BarSerDsc)),GXutil.URLEncode(GXutil.rtrim(AV36BarAgrest))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","ProDsc","BarExt","Discod","BarSit","Clicod","Barunimed","Barpes","barser","PedidoCliente","barcolnom","barcolnum","Barpie","BarKgm","Barmtr","CliNom","BarSerDsc","BarAgrest"})  ;
   }

   public String getPgmname( )
   {
      return "PedidosClienteSinDetalle.HojadeRuta__Fases" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Fases (Hdr)", "") ;
   }

   public void wb29C0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavProcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavProcod_Internalname, httpContext.getMessage( "Proceso", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavProcod_Internalname, GXutil.rtrim( AV25ProCod), GXutil.rtrim( localUtil.format( AV25ProCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavProcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavProcod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Fases.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavProdsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavProdsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavProdsc_Internalname, GXutil.rtrim( AV26ProDsc), GXutil.rtrim( localUtil.format( AV26ProDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavProdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavProdsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Fases.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarordlin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarordlin_Internalname, httpContext.getMessage( "Orden", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarordlin_Internalname, GXutil.ltrim( localUtil.ntoc( AV5BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarordlin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV5BarOrdLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV5BarOrdLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,42);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarordlin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarordlin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Fases.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedfascod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockfascod_Internalname, httpContext.getMessage( "Fase", ""), "", "", lblTextblockfascod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_PedidosClienteSinDetalle\\HojadeRuta__Fases.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table1_49_29C2( true) ;
      }
      else
      {
         wb_table1_49_29C2( false) ;
      }
      return  ;
   }

   public void wb_table1_49_29C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFasdsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFasdsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFasdsc_Internalname, GXutil.rtrim( AV54FasDsc), GXutil.rtrim( localUtil.format( AV54FasDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFasdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFasdsc_Enabled, 0, "text", "", 28, "chr", 1, "row", 28, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Fases.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedmaqcodbis_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_maqcodbis_Internalname, httpContext.getMessage( "Maquina", ""), "", "", lblTextblockcombo_maqcodbis_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_PedidosClienteSinDetalle\\HojadeRuta__Fases.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_maqcodbis.setProperty("Caption", Combo_maqcodbis_Caption);
         ucCombo_maqcodbis.setProperty("Cls", Combo_maqcodbis_Cls);
         ucCombo_maqcodbis.setProperty("EmptyItem", Combo_maqcodbis_Emptyitem);
         ucCombo_maqcodbis.setProperty("DropDownOptionsData", AV20MaqCodBis_Data);
         ucCombo_maqcodbis.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_maqcodbis_Internalname, "COMBO_MAQCODBISContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavBarfasest.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavBarfasest.getInternalname(), httpContext.getMessage( "E", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavBarfasest, cmbavBarfasest.getInternalname(), GXutil.trim( GXutil.str( AV19BarFasEst, 1, 0)), 1, cmbavBarfasest.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavBarfasest.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,70);\"", "", true, (byte)(0), "HLP_PedidosClienteSinDetalle\\HojadeRuta__Fases.htm");
         cmbavBarfasest.setValue( GXutil.trim( GXutil.str( AV19BarFasEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasest.getInternalname(), "Values", cmbavBarfasest.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavBarfascon.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavBarfascon.getInternalname(), httpContext.getMessage( "C?", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavBarfascon, cmbavBarfascon.getInternalname(), GXutil.rtrim( AV9BarFascon), 1, cmbavBarfascon.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavBarfascon.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,74);\"", "", true, (byte)(0), "HLP_PedidosClienteSinDetalle\\HojadeRuta__Fases.htm");
         cmbavBarfascon.setValue( GXutil.rtrim( AV9BarFascon) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavBarfascon.getInternalname(), "Values", cmbavBarfascon.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavBarfactin.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavBarfactin.getInternalname(), httpContext.getMessage( "T?", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavBarfactin, cmbavBarfactin.getInternalname(), GXutil.rtrim( AV10Barfactin), 1, cmbavBarfactin.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavBarfactin.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,78);\"", "", true, (byte)(0), "HLP_PedidosClienteSinDetalle\\HojadeRuta__Fases.htm");
         cmbavBarfactin.setValue( GXutil.rtrim( AV10Barfactin) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavBarfactin.getInternalname(), "Values", cmbavBarfactin.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavBarfasacab.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavBarfasacab.getInternalname(), httpContext.getMessage( "A?", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavBarfasacab, cmbavBarfasacab.getInternalname(), GXutil.rtrim( AV11Barfasacab), 1, cmbavBarfasacab.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavBarfasacab.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,82);\"", "", true, (byte)(0), "HLP_PedidosClienteSinDetalle\\HojadeRuta__Fases.htm");
         cmbavBarfasacab.setValue( GXutil.rtrim( AV11Barfasacab) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasacab.getInternalname(), "Values", cmbavBarfasacab.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavBarfasfor.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavBarfasfor.getInternalname(), httpContext.getMessage( "F?", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavBarfasfor, cmbavBarfasfor.getInternalname(), GXutil.rtrim( AV12BarFasfor), 1, cmbavBarfasfor.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavBarfasfor.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"", "", true, (byte)(0), "HLP_PedidosClienteSinDetalle\\HojadeRuta__Fases.htm");
         cmbavBarfasfor.setValue( GXutil.rtrim( AV12BarFasfor) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasfor.getInternalname(), "Values", cmbavBarfasfor.ToJavascriptSource(), true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarfecini_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfecini_Internalname, httpContext.getMessage( "Inicio", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavBarfecini_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecini_Internalname, localUtil.format(AV13BarFecIni, "99/99/99"), localUtil.format( AV13BarFecIni, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfecini_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfecini_Enabled, 1, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Fases.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfecini_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfecini_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Fases.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarfecrea_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfecrea_Internalname, httpContext.getMessage( "Fin", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavBarfecrea_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecrea_Internalname, localUtil.format(AV14Barfecrea, "99/99/99"), localUtil.format( AV14Barfecrea, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,98);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfecrea_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfecrea_Enabled, 1, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Fases.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfecrea_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfecrea_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Fases.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarhorini_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarhorini_Internalname, httpContext.getMessage( "Hora Inicio", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarhorini_Internalname, GXutil.ltrim( localUtil.ntoc( AV15BarHorIni, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15BarHorIni), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,102);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarhorini_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarhorini_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Fases.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarhorfin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarhorfin_Internalname, httpContext.getMessage( "Hora Fin", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarhorfin_Internalname, GXutil.ltrim( localUtil.ntoc( AV16Barhorfin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV16Barhorfin), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarhorfin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarhorfin_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Fases.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarfas_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfas_Internalname, httpContext.getMessage( "Tabla", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 110,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfas_Internalname, GXutil.ltrim( localUtil.ntoc( AV46barfas, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarfas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV46barfas), "9") : localUtil.format( DecimalUtil.doubleToDec(AV46barfas), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,110);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfas_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfas_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Fases.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavErrmensaje_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavErrmensaje_Internalname, httpContext.getMessage( "Observaciones", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 118,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavErrmensaje_Internalname, AV49Errmensaje, GXutil.rtrim( localUtil.format( AV49Errmensaje, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,118);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavErrmensaje_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavErrmensaje_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Fases.htm");
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
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTbmessage_Internalname, lblTbmessage_Caption, "", "", lblTbmessage_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextDanger", 0, "", 1, 1, 0, (short)(0), "HLP_PedidosClienteSinDetalle\\HojadeRuta__Fases.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PedidosClienteSinDetalle\\HojadeRuta__Fases.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PedidosClienteSinDetalle\\HojadeRuta__Fases.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0137"+"", GXutil.rtrim( WebComp_Wchojaderuta__fases_wc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0137"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wchojaderuta__fases_wc_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWchojaderuta__fases_wc), GXutil.lower( WebComp_Wchojaderuta__fases_wc_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0137"+"");
               }
               WebComp_Wchojaderuta__fases_wc.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWchojaderuta__fases_wc), GXutil.lower( WebComp_Wchojaderuta__fases_wc_Component)) != 0 )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV58Pgmname), GXutil.rtrim( localUtil.format( AV58Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Fases.htm");
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
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 148,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqcodbis_Internalname, GXutil.rtrim( AV18MaqCodBis), GXutil.rtrim( localUtil.format( AV18MaqCodBis, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,148);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqcodbis_Jsonclick, 0, "Attribute", "", "", "", "", edtavMaqcodbis_Visible, edtavMaqcodbis_Enabled, 1, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Fases.htm");
         wb_table2_149_29C2( true) ;
      }
      else
      {
         wb_table2_149_29C2( false) ;
      }
      return  ;
   }

   public void wb_table2_149_29C2e( boolean wbgen )
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

   public void start29C2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Fases (Hdr)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup29C0( ) ;
   }

   public void ws29C2( )
   {
      start29C2( ) ;
      evt29C2( ) ;
   }

   public void evt29C2( )
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
                           e1129C2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e1229C2 ();
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
                                 e1329C2 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e1429C2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VBARORDLIN.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1529C2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Refresh */
                           e1629C2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VFASCOD.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1729C2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e1829C2 ();
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
                     if ( nCmpId == 137 )
                     {
                        OldWchojaderuta__fases_wc = httpContext.cgiGet( "W0137") ;
                        if ( ( GXutil.len( OldWchojaderuta__fases_wc) == 0 ) || ( GXutil.strcmp(OldWchojaderuta__fases_wc, WebComp_Wchojaderuta__fases_wc_Component) != 0 ) )
                        {
                           WebComp_Wchojaderuta__fases_wc = WebUtils.getWebComponent(getClass(), "app." + OldWchojaderuta__fases_wc + "_impl", remoteHandle, context);
                           WebComp_Wchojaderuta__fases_wc_Component = OldWchojaderuta__fases_wc ;
                        }
                        if ( GXutil.len( WebComp_Wchojaderuta__fases_wc_Component) != 0 )
                        {
                           WebComp_Wchojaderuta__fases_wc.componentprocess("W0137", "", sEvt);
                        }
                        WebComp_Wchojaderuta__fases_wc_Component = OldWchojaderuta__fases_wc ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we29C2( )
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

   public void pa29C2( )
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
            GX_FocusControl = edtavBarordlin_Internalname ;
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
      if ( cmbavBarfasest.getItemCount() > 0 )
      {
         AV19BarFasEst = (byte)(GXutil.lval( cmbavBarfasest.getValidValue(GXutil.trim( GXutil.str( AV19BarFasEst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19BarFasEst", GXutil.str( AV19BarFasEst, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavBarfasest.setValue( GXutil.trim( GXutil.str( AV19BarFasEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasest.getInternalname(), "Values", cmbavBarfasest.ToJavascriptSource(), true);
      }
      if ( cmbavBarfascon.getItemCount() > 0 )
      {
         AV9BarFascon = cmbavBarfascon.getValidValue(AV9BarFascon) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9BarFascon", AV9BarFascon);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavBarfascon.setValue( GXutil.rtrim( AV9BarFascon) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavBarfascon.getInternalname(), "Values", cmbavBarfascon.ToJavascriptSource(), true);
      }
      if ( cmbavBarfactin.getItemCount() > 0 )
      {
         AV10Barfactin = cmbavBarfactin.getValidValue(AV10Barfactin) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10Barfactin", AV10Barfactin);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavBarfactin.setValue( GXutil.rtrim( AV10Barfactin) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavBarfactin.getInternalname(), "Values", cmbavBarfactin.ToJavascriptSource(), true);
      }
      if ( cmbavBarfasacab.getItemCount() > 0 )
      {
         AV11Barfasacab = cmbavBarfasacab.getValidValue(AV11Barfasacab) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11Barfasacab", AV11Barfasacab);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavBarfasacab.setValue( GXutil.rtrim( AV11Barfasacab) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasacab.getInternalname(), "Values", cmbavBarfasacab.ToJavascriptSource(), true);
      }
      if ( cmbavBarfasfor.getItemCount() > 0 )
      {
         AV12BarFasfor = cmbavBarfasfor.getValidValue(AV12BarFasfor) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12BarFasfor", AV12BarFasfor);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavBarfasfor.setValue( GXutil.rtrim( AV12BarFasfor) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasfor.getInternalname(), "Values", cmbavBarfasfor.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf29C2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV58Pgmname = "PedidosClienteSinDetalle.HojadeRuta__Fases" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58Pgmname", AV58Pgmname);
      Gx_err = (short)(0) ;
      edtavProcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProcod_Enabled), 5, 0), true);
      edtavProdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProdsc_Enabled), 5, 0), true);
      edtavFasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFasdsc_Enabled), 5, 0), true);
      edtavBarfas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarfas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfas_Enabled), 5, 0), true);
      edtavErrmensaje_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavErrmensaje_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavErrmensaje_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      imgPrompt_fascod_Link = "javascript:"+"gx.popup.openPrompt('"+"app.tfasproprompt"+"',["+"{Ctrl:gx.dom.el('"+"vEMPRCOD"+"'), id:'"+"vEMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFASCOD"+"'), id:'"+"vFASCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"T(460,2)"+"'), id:'"+"T(460,2)"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      httpContext.ajax_rsp_assign_prop("", false, imgPrompt_fascod_Internalname, "Link", imgPrompt_fascod_Link, true);
   }

   public void rf29C2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      /* Execute user event: Refresh */
      e1629C2 ();
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wchojaderuta__fases_wc_Component) != 0 )
            {
               WebComp_Wchojaderuta__fases_wc.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e1829C2 ();
         wb29C0( ) ;
      }
   }

   public void send_integrity_lvl_hashes29C2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPLANING", GXutil.ltrim( localUtil.ntoc( AV50Planing, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPLANING", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV50Planing), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARFASESTIN", GXutil.ltrim( localUtil.ntoc( AV52BarFasEstIN, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFASESTIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV52BarFasEstIN), "ZZZ9")));
   }

   public void before_start_formulas( )
   {
      AV58Pgmname = "PedidosClienteSinDetalle.HojadeRuta__Fases" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58Pgmname", AV58Pgmname);
      Gx_err = (short)(0) ;
      edtavProcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProcod_Enabled), 5, 0), true);
      edtavProdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProdsc_Enabled), 5, 0), true);
      edtavFasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFasdsc_Enabled), 5, 0), true);
      edtavBarfas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarfas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfas_Enabled), 5, 0), true);
      edtavErrmensaje_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavErrmensaje_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavErrmensaje_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      imgPrompt_fascod_Link = "javascript:"+"gx.popup.openPrompt('"+"app.tfasproprompt"+"',["+"{Ctrl:gx.dom.el('"+"vEMPRCOD"+"'), id:'"+"vEMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFASCOD"+"'), id:'"+"vFASCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"T(460,2)"+"'), id:'"+"T(460,2)"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      httpContext.ajax_rsp_assign_prop("", false, imgPrompt_fascod_Internalname, "Link", imgPrompt_fascod_Link, true);
      fix_multi_value_controls( ) ;
   }

   public void strup29C0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1229C2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMAQCODBIS_DATA"), AV20MaqCodBis_Data);
         /* Read saved values. */
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
         Combo_maqcodbis_Cls = httpContext.cgiGet( "COMBO_MAQCODBIS_Cls") ;
         Combo_maqcodbis_Selectedvalue_set = httpContext.cgiGet( "COMBO_MAQCODBIS_Selectedvalue_set") ;
         Combo_maqcodbis_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQCODBIS_Enabled")) ;
         Combo_maqcodbis_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQCODBIS_Emptyitem")) ;
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
         Dvelop_confirmpanel_enter_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Title") ;
         Dvelop_confirmpanel_enter_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Confirmationtext") ;
         Dvelop_confirmpanel_enter_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Yesbuttoncaption") ;
         Dvelop_confirmpanel_enter_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Nobuttoncaption") ;
         Dvelop_confirmpanel_enter_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_enter_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Yesbuttonposition") ;
         Dvelop_confirmpanel_enter_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Confirmtype") ;
         Dvelop_confirmpanel_enter_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Result") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarordlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarordlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARORDLIN");
            GX_FocusControl = edtavBarordlin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5BarOrdLin = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarOrdLin), 4, 0));
         }
         else
         {
            AV5BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtavBarordlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarOrdLin), 4, 0));
         }
         AV6Fascod = GXutil.upper( httpContext.cgiGet( edtavFascod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6Fascod", AV6Fascod);
         AV54FasDsc = httpContext.cgiGet( edtavFasdsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV54FasDsc", AV54FasDsc);
         cmbavBarfasest.setValue( httpContext.cgiGet( cmbavBarfasest.getInternalname()) );
         AV19BarFasEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbavBarfasest.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19BarFasEst", GXutil.str( AV19BarFasEst, 1, 0));
         cmbavBarfascon.setValue( httpContext.cgiGet( cmbavBarfascon.getInternalname()) );
         AV9BarFascon = httpContext.cgiGet( cmbavBarfascon.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9BarFascon", AV9BarFascon);
         cmbavBarfactin.setValue( httpContext.cgiGet( cmbavBarfactin.getInternalname()) );
         AV10Barfactin = httpContext.cgiGet( cmbavBarfactin.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10Barfactin", AV10Barfactin);
         cmbavBarfasacab.setValue( httpContext.cgiGet( cmbavBarfasacab.getInternalname()) );
         AV11Barfasacab = httpContext.cgiGet( cmbavBarfasacab.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11Barfasacab", AV11Barfasacab);
         cmbavBarfasfor.setValue( httpContext.cgiGet( cmbavBarfasfor.getInternalname()) );
         AV12BarFasfor = httpContext.cgiGet( cmbavBarfasfor.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12BarFasfor", AV12BarFasfor);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfecini_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECINI");
            GX_FocusControl = edtavBarfecini_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13BarFecIni = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13BarFecIni", localUtil.format(AV13BarFecIni, "99/99/99"));
         }
         else
         {
            AV13BarFecIni = localUtil.ctod( httpContext.cgiGet( edtavBarfecini_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13BarFecIni", localUtil.format(AV13BarFecIni, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfecrea_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECREA");
            GX_FocusControl = edtavBarfecrea_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14Barfecrea = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14Barfecrea", localUtil.format(AV14Barfecrea, "99/99/99"));
         }
         else
         {
            AV14Barfecrea = localUtil.ctod( httpContext.cgiGet( edtavBarfecrea_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14Barfecrea", localUtil.format(AV14Barfecrea, "99/99/99"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarhorini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarhorini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARHORINI");
            GX_FocusControl = edtavBarhorini_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV15BarHorIni = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15BarHorIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15BarHorIni), 4, 0));
         }
         else
         {
            AV15BarHorIni = (short)(localUtil.ctol( httpContext.cgiGet( edtavBarhorini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15BarHorIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15BarHorIni), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarhorfin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarhorfin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARHORFIN");
            GX_FocusControl = edtavBarhorfin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV16Barhorfin = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16Barhorfin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Barhorfin), 4, 0));
         }
         else
         {
            AV16Barhorfin = (short)(localUtil.ctol( httpContext.cgiGet( edtavBarhorfin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16Barhorfin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Barhorfin), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarfas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarfas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARFAS");
            GX_FocusControl = edtavBarfas_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV46barfas = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46barfas", GXutil.str( AV46barfas, 1, 0));
         }
         else
         {
            AV46barfas = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarfas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46barfas", GXutil.str( AV46barfas, 1, 0));
         }
         AV49Errmensaje = httpContext.cgiGet( edtavErrmensaje_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49Errmensaje", AV49Errmensaje);
         AV58Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV58Pgmname", AV58Pgmname);
         AV18MaqCodBis = httpContext.cgiGet( edtavMaqcodbis_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18MaqCodBis", AV18MaqCodBis);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"HojadeRuta__Fases");
         AV58Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV58Pgmname", AV58Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV58Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("pedidosclientesindetalle\\hojaderuta__fases:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
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
      e1229C2 ();
      if (returnInSub) return;
   }

   public void e1229C2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV27Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      hojaderuta__fases_impl.this.GXt_char1 = GXv_char2[0] ;
      AV27Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Station", AV27Station);
      GXv_char2[0] = AV21EmprCod ;
      GXv_char3[0] = AV28EmprNom ;
      GXv_char4[0] = AV29UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV27Station, GXv_char2, GXv_char3, GXv_char4) ;
      hojaderuta__fases_impl.this.AV21EmprCod = GXv_char2[0] ;
      hojaderuta__fases_impl.this.AV28EmprNom = GXv_char3[0] ;
      hojaderuta__fases_impl.this.AV29UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21EmprCod", AV21EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV29UsurCod", AV29UsurCod);
      edtavMaqcodbis_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcodbis_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcodbis_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOMAQCODBIS' */
      S112 ();
      if (returnInSub) return;
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wchojaderuta__fases_wc = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wchojaderuta__fases_wc_Component), GXutil.lower( "PedidosClienteSinDetalle.HojadeRuta__Fases_WC")) != 0 )
      {
         WebComp_Wchojaderuta__fases_wc = WebUtils.getWebComponent(getClass(), "app.pedidosclientesindetalle.hojaderuta__fases_wc_impl", remoteHandle, context);
         WebComp_Wchojaderuta__fases_wc_Component = "PedidosClienteSinDetalle.HojadeRuta__Fases_WC" ;
      }
      if ( GXutil.len( WebComp_Wchojaderuta__fases_wc_Component) != 0 )
      {
         WebComp_Wchojaderuta__fases_wc.setjustcreated();
         WebComp_Wchojaderuta__fases_wc.componentprepare(new Object[] {"W0137","",AV21EmprCod,Integer.valueOf(AV22BarCod),Byte.valueOf(AV23BarCodReo),AV24BarCodPar,AV25ProCod,AV26ProDsc,Byte.valueOf(AV30BarExt),Integer.valueOf(AV31Discod),Byte.valueOf(AV32BarSit),Integer.valueOf(AV33Clicod),AV34Barunimed,Short.valueOf(AV35Barpes),AV45barser,AV44PedidoCliente,AV43barcolnom,Integer.valueOf(AV42barcolnum),Integer.valueOf(AV41Barpie),AV40BarKgm,AV39Barmtr,AV38CliNom,AV37BarSerDsc,AV36BarAgrest});
         WebComp_Wchojaderuta__fases_wc.componentbind(new Object[] {"","","","","vPROCOD","vPRODSC","","","","","","","","","","","","","","","",""});
      }
      GXt_int5 = AV5BarOrdLin ;
      GXv_int6[0] = GXt_int5 ;
      new app.pedidosclientesindetalle.getbarordlinultimo(remoteHandle, context).execute( AV21EmprCod, AV22BarCod, AV23BarCodReo, AV24BarCodPar, AV25ProCod, GXv_int6) ;
      hojaderuta__fases_impl.this.GXt_int5 = GXv_int6[0] ;
      AV5BarOrdLin = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarOrdLin), 4, 0));
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e1329C2 ();
      if (returnInSub) return;
   }

   public void e1329C2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      if ( (0==AV5BarOrdLin) )
      {
         GX_FocusControl = edtavBarordlin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         lblTbmessage_Caption = httpContext.getMessage( "Error.Orden NO puedo ser 0 ¡¡¡", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      }
      else
      {
         if ( (GXutil.strcmp("", AV6Fascod)==0) )
         {
            GX_FocusControl = edtavFascod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
            lblTbmessage_Caption = httpContext.getMessage( "Error.Fase NULA ¡¡¡", "") ;
            httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         }
         else
         {
            GXt_char1 = AV54FasDsc ;
            GXv_char4[0] = GXt_char1 ;
            new app.pfasdsc(remoteHandle, context).execute( AV21EmprCod, AV6Fascod, GXv_char4) ;
            hojaderuta__fases_impl.this.GXt_char1 = GXv_char4[0] ;
            AV54FasDsc = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54FasDsc", AV54FasDsc);
            if ( GXutil.strcmp(AV54FasDsc, "Error") == 0 )
            {
               GX_FocusControl = edtavFascod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
               lblTbmessage_Caption = httpContext.getMessage( "No Existe Fase", "") ;
               httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
            }
            else
            {
               if ( ! (GXutil.strcmp("", AV49Errmensaje)==0) )
               {
                  GX_FocusControl = edtavBarordlin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  httpContext.doAjaxSetFocus(GX_FocusControl);
                  lblTbmessage_Caption = AV49Errmensaje ;
                  httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
               }
               else
               {
                  this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ENTERContainer", "Confirm", "", new Object[] {});
               }
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void e1129C2( )
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
      cmbavBarfasest.setValue( GXutil.trim( GXutil.str( AV19BarFasEst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasest.getInternalname(), "Values", cmbavBarfasest.ToJavascriptSource(), true);
      cmbavBarfasacab.setValue( GXutil.rtrim( AV11Barfasacab) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasacab.getInternalname(), "Values", cmbavBarfasacab.ToJavascriptSource(), true);
      cmbavBarfasfor.setValue( GXutil.rtrim( AV12BarFasfor) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasfor.getInternalname(), "Values", cmbavBarfasfor.ToJavascriptSource(), true);
      cmbavBarfactin.setValue( GXutil.rtrim( AV10Barfactin) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavBarfactin.getInternalname(), "Values", cmbavBarfactin.ToJavascriptSource(), true);
      cmbavBarfascon.setValue( GXutil.rtrim( AV9BarFascon) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavBarfascon.getInternalname(), "Values", cmbavBarfascon.ToJavascriptSource(), true);
   }

   public void e1429C2( )
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
      if ( AV46barfas == 0 )
      {
         GXv_char4[0] = AV21EmprCod ;
         GXv_int7[0] = AV22BarCod ;
         GXv_int8[0] = AV23BarCodReo ;
         GXv_char3[0] = AV24BarCodPar ;
         GXv_char2[0] = AV25ProCod ;
         GXv_int6[0] = AV5BarOrdLin ;
         GXv_char9[0] = AV6Fascod ;
         GXv_char10[0] = AV29UsurCod ;
         GXv_char11[0] = AV27Station ;
         new app.pprofs04(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int8, GXv_char3, GXv_char2, GXv_int6, GXv_char9, GXv_char10, GXv_char11) ;
         hojaderuta__fases_impl.this.AV21EmprCod = GXv_char4[0] ;
         hojaderuta__fases_impl.this.AV22BarCod = GXv_int7[0] ;
         hojaderuta__fases_impl.this.AV23BarCodReo = GXv_int8[0] ;
         hojaderuta__fases_impl.this.AV24BarCodPar = GXv_char3[0] ;
         hojaderuta__fases_impl.this.AV25ProCod = GXv_char2[0] ;
         hojaderuta__fases_impl.this.AV5BarOrdLin = GXv_int6[0] ;
         hojaderuta__fases_impl.this.AV6Fascod = GXv_char9[0] ;
         hojaderuta__fases_impl.this.AV29UsurCod = GXv_char10[0] ;
         hojaderuta__fases_impl.this.AV27Station = GXv_char11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21EmprCod", AV21EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV22BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV23BarCodReo", GXutil.str( AV23BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV24BarCodPar", AV24BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "AV25ProCod", AV25ProCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV5BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarOrdLin), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV6Fascod", AV6Fascod);
         httpContext.ajax_rsp_assign_attri("", false, "AV29UsurCod", AV29UsurCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV27Station", AV27Station);
         new app.pcommit(remoteHandle, context).execute( ) ;
         if ( AV50Planing == 1 )
         {
            GXv_char11[0] = AV21EmprCod ;
            GXv_int7[0] = AV22BarCod ;
            GXv_int8[0] = AV23BarCodReo ;
            GXv_char10[0] = AV24BarCodPar ;
            GXv_char9[0] = AV25ProCod ;
            GXv_int6[0] = AV5BarOrdLin ;
            new app.pcaltiempoteorico(remoteHandle, context).execute( GXv_char11, GXv_int7, GXv_int8, GXv_char10, GXv_char9, GXv_int6) ;
            hojaderuta__fases_impl.this.AV21EmprCod = GXv_char11[0] ;
            hojaderuta__fases_impl.this.AV22BarCod = GXv_int7[0] ;
            hojaderuta__fases_impl.this.AV23BarCodReo = GXv_int8[0] ;
            hojaderuta__fases_impl.this.AV24BarCodPar = GXv_char10[0] ;
            hojaderuta__fases_impl.this.AV25ProCod = GXv_char9[0] ;
            hojaderuta__fases_impl.this.AV5BarOrdLin = GXv_int6[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21EmprCod", AV21EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV22BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22BarCod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV23BarCodReo", GXutil.str( AV23BarCodReo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV24BarCodPar", AV24BarCodPar);
            httpContext.ajax_rsp_assign_attri("", false, "AV25ProCod", AV25ProCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV5BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarOrdLin), 4, 0));
         }
         AV51Inc_obs = GXutil.trim( AV58Pgmname) + httpContext.getMessage( ",Fase= ", "") + AV6Fascod + httpContext.getMessage( " Linea= ", "") + GXutil.str( AV5BarOrdLin, 4, 0) + httpContext.getMessage( " Insertada", "") ;
         new app.pctrinc(remoteHandle, context).execute( AV21EmprCod, GXutil.substring( AV58Pgmname, 1, 10), AV29UsurCod, AV27Station, AV51Inc_obs, AV22BarCod, AV23BarCodReo, AV24BarCodPar) ;
         AV46barfas = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46barfas", GXutil.str( AV46barfas, 1, 0));
         AV11Barfasacab = "N" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11Barfasacab", AV11Barfasacab);
         AV12BarFasfor = "N" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12BarFasfor", AV12BarFasfor);
         AV10Barfactin = "N" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10Barfactin", AV10Barfactin);
         AV9BarFascon = "N" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9BarFascon", AV9BarFascon);
         AV14Barfecrea = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Barfecrea", localUtil.format(AV14Barfecrea, "99/99/99"));
         AV48Barfecrini = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48Barfecrini", localUtil.format(AV48Barfecrini, "99/99/99"));
         AV16Barhorfin = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Barhorfin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Barhorfin), 4, 0));
         AV15BarHorIni = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15BarHorIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15BarHorIni), 4, 0));
         AV47Baruni = DecimalUtil.ZERO ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47Baruni", GXutil.ltrimstr( AV47Baruni, 9, 2));
         AV6Fascod = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6Fascod", AV6Fascod);
         AV18MaqCodBis = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18MaqCodBis", AV18MaqCodBis);
         AV54FasDsc = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV54FasDsc", AV54FasDsc);
         Combo_maqcodbis_Selectedvalue_set = AV18MaqCodBis ;
         ucCombo_maqcodbis.sendProperty(context, "", false, Combo_maqcodbis_Internalname, "SelectedValue_set", Combo_maqcodbis_Selectedvalue_set);
         AV49Errmensaje = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49Errmensaje", AV49Errmensaje);
         GXt_int5 = AV5BarOrdLin ;
         GXv_int6[0] = GXt_int5 ;
         new app.pedidosclientesindetalle.getbarordlinultimo(remoteHandle, context).execute( AV21EmprCod, AV22BarCod, AV23BarCodReo, AV24BarCodPar, AV25ProCod, GXv_int6) ;
         hojaderuta__fases_impl.this.GXt_int5 = GXv_int6[0] ;
         AV5BarOrdLin = GXt_int5 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarOrdLin), 4, 0));
         /* Object Property */
         if ( true )
         {
            bDynCreated_Wchojaderuta__fases_wc = true ;
         }
         if ( GXutil.strcmp(GXutil.lower( WebComp_Wchojaderuta__fases_wc_Component), GXutil.lower( "PedidosClienteSinDetalle.HojadeRuta__Fases_WC")) != 0 )
         {
            WebComp_Wchojaderuta__fases_wc = WebUtils.getWebComponent(getClass(), "app.pedidosclientesindetalle.hojaderuta__fases_wc_impl", remoteHandle, context);
            WebComp_Wchojaderuta__fases_wc_Component = "PedidosClienteSinDetalle.HojadeRuta__Fases_WC" ;
         }
         if ( GXutil.len( WebComp_Wchojaderuta__fases_wc_Component) != 0 )
         {
            WebComp_Wchojaderuta__fases_wc.setjustcreated();
            WebComp_Wchojaderuta__fases_wc.componentprepare(new Object[] {"W0137","",AV21EmprCod,Integer.valueOf(AV22BarCod),Byte.valueOf(AV23BarCodReo),AV24BarCodPar,AV25ProCod,AV26ProDsc,Byte.valueOf(AV30BarExt),Integer.valueOf(AV31Discod),Byte.valueOf(AV32BarSit),Integer.valueOf(AV33Clicod),AV34Barunimed,Short.valueOf(AV35Barpes),AV45barser,AV44PedidoCliente,AV43barcolnom,Integer.valueOf(AV42barcolnum),Integer.valueOf(AV41Barpie),AV40BarKgm,AV39Barmtr,AV38CliNom,AV37BarSerDsc,AV36BarAgrest});
            WebComp_Wchojaderuta__fases_wc.componentbind(new Object[] {"","","","","vPROCOD","vPRODSC","","","","","","","","","","","","","","","",""});
         }
         if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wchojaderuta__fases_wc )
         {
            httpContext.ajax_rspStartCmp("gxHTMLWrpW0137"+"");
            WebComp_Wchojaderuta__fases_wc.componentdraw();
            httpContext.ajax_rspEndCmp();
         }
         GX_FocusControl = edtavBarordlin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXv_char11[0] = AV21EmprCod ;
         GXv_int7[0] = AV22BarCod ;
         GXv_int8[0] = AV23BarCodReo ;
         GXv_char10[0] = AV24BarCodPar ;
         GXv_char9[0] = AV25ProCod ;
         GXv_int6[0] = AV5BarOrdLin ;
         GXv_char4[0] = AV10Barfactin ;
         GXv_char3[0] = AV11Barfasacab ;
         GXv_char2[0] = AV9BarFascon ;
         GXv_int12[0] = AV19BarFasEst ;
         GXv_char13[0] = AV12BarFasfor ;
         GXv_date14[0] = AV14Barfecrea ;
         GXv_date15[0] = AV48Barfecrini ;
         GXv_int16[0] = AV16Barhorfin ;
         GXv_int17[0] = AV15BarHorIni ;
         GXv_decimal18[0] = AV17BarTieteo ;
         GXv_decimal19[0] = AV47Baruni ;
         GXv_char20[0] = AV18MaqCodBis ;
         GXv_char21[0] = AV6Fascod ;
         new app.pfasesmodif(remoteHandle, context).execute( GXv_char11, GXv_int7, GXv_int8, GXv_char10, GXv_char9, GXv_int6, GXv_char4, GXv_char3, GXv_char2, GXv_int12, GXv_char13, GXv_date14, GXv_date15, GXv_int16, GXv_int17, GXv_decimal18, GXv_decimal19, GXv_char20, GXv_char21) ;
         hojaderuta__fases_impl.this.AV21EmprCod = GXv_char11[0] ;
         hojaderuta__fases_impl.this.AV22BarCod = GXv_int7[0] ;
         hojaderuta__fases_impl.this.AV23BarCodReo = GXv_int8[0] ;
         hojaderuta__fases_impl.this.AV24BarCodPar = GXv_char10[0] ;
         hojaderuta__fases_impl.this.AV25ProCod = GXv_char9[0] ;
         hojaderuta__fases_impl.this.AV5BarOrdLin = GXv_int6[0] ;
         hojaderuta__fases_impl.this.AV10Barfactin = GXv_char4[0] ;
         hojaderuta__fases_impl.this.AV11Barfasacab = GXv_char3[0] ;
         hojaderuta__fases_impl.this.AV9BarFascon = GXv_char2[0] ;
         hojaderuta__fases_impl.this.AV19BarFasEst = GXv_int12[0] ;
         hojaderuta__fases_impl.this.AV12BarFasfor = GXv_char13[0] ;
         hojaderuta__fases_impl.this.AV14Barfecrea = GXv_date14[0] ;
         hojaderuta__fases_impl.this.AV48Barfecrini = GXv_date15[0] ;
         hojaderuta__fases_impl.this.AV16Barhorfin = GXv_int16[0] ;
         hojaderuta__fases_impl.this.AV15BarHorIni = GXv_int17[0] ;
         hojaderuta__fases_impl.this.AV17BarTieteo = GXv_decimal18[0] ;
         hojaderuta__fases_impl.this.AV47Baruni = GXv_decimal19[0] ;
         hojaderuta__fases_impl.this.AV18MaqCodBis = GXv_char20[0] ;
         hojaderuta__fases_impl.this.AV6Fascod = GXv_char21[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21EmprCod", AV21EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV22BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV23BarCodReo", GXutil.str( AV23BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV24BarCodPar", AV24BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "AV25ProCod", AV25ProCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV5BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarOrdLin), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV10Barfactin", AV10Barfactin);
         httpContext.ajax_rsp_assign_attri("", false, "AV11Barfasacab", AV11Barfasacab);
         httpContext.ajax_rsp_assign_attri("", false, "AV9BarFascon", AV9BarFascon);
         httpContext.ajax_rsp_assign_attri("", false, "AV19BarFasEst", GXutil.str( AV19BarFasEst, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV12BarFasfor", AV12BarFasfor);
         httpContext.ajax_rsp_assign_attri("", false, "AV14Barfecrea", localUtil.format(AV14Barfecrea, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV48Barfecrini", localUtil.format(AV48Barfecrini, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV16Barhorfin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Barhorfin), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV15BarHorIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15BarHorIni), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV17BarTieteo", GXutil.ltrimstr( AV17BarTieteo, 5, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV47Baruni", GXutil.ltrimstr( AV47Baruni, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV18MaqCodBis", AV18MaqCodBis);
         httpContext.ajax_rsp_assign_attri("", false, "AV6Fascod", AV6Fascod);
         new app.pcommit(remoteHandle, context).execute( ) ;
         AV51Inc_obs = "#=" + GXutil.str( AV5BarOrdLin, 4, 0) + GXutil.newLine( ) ;
         AV51Inc_obs += httpContext.getMessage( " >- New=,T=", "") + AV10Barfactin + httpContext.getMessage( " FA=", "") + AV11Barfasacab + httpContext.getMessage( " C=", "") + AV9BarFascon + httpContext.getMessage( " E=", "") + GXutil.trim( GXutil.str( AV52BarFasEstIN, 4, 0)) + httpContext.getMessage( " F=", "") + AV12BarFasfor + httpContext.getMessage( " FIn=", "") + GXutil.trim( localUtil.dtoc( AV14Barfecrea, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + httpContext.getMessage( " FIn=", "") + GXutil.trim( localUtil.dtoc( AV48Barfecrini, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + GXutil.newLine( ) ;
         AV51Inc_obs += httpContext.getMessage( " Hin=", "") + GXutil.trim( GXutil.str( AV16Barhorfin, 4, 0)) + httpContext.getMessage( "Hfi=", "") + GXutil.trim( GXutil.str( AV15BarHorIni, 4, 0)) + httpContext.getMessage( " Tteo=", "") + GXutil.trim( GXutil.str( AV17BarTieteo, 5, 2)) + httpContext.getMessage( " Und=", "") + GXutil.trim( GXutil.str( AV47Baruni, 9, 2)) + httpContext.getMessage( " Mq=", "") + AV18MaqCodBis + httpContext.getMessage( " Fase=", "") + AV6Fascod + GXutil.newLine( ) ;
         new app.pctrinc(remoteHandle, context).execute( AV21EmprCod, AV58Pgmname, AV29UsurCod, AV27Station, AV51Inc_obs, AV22BarCod, AV23BarCodReo, AV24BarCodPar) ;
         AV46barfas = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46barfas", GXutil.str( AV46barfas, 1, 0));
         AV11Barfasacab = "N" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11Barfasacab", AV11Barfasacab);
         AV12BarFasfor = "N" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12BarFasfor", AV12BarFasfor);
         AV14Barfecrea = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Barfecrea", localUtil.format(AV14Barfecrea, "99/99/99"));
         AV48Barfecrini = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48Barfecrini", localUtil.format(AV48Barfecrini, "99/99/99"));
         AV16Barhorfin = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Barhorfin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Barhorfin), 4, 0));
         AV15BarHorIni = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15BarHorIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15BarHorIni), 4, 0));
         AV47Baruni = DecimalUtil.ZERO ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47Baruni", GXutil.ltrimstr( AV47Baruni, 9, 2));
         AV6Fascod = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6Fascod", AV6Fascod);
         AV18MaqCodBis = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18MaqCodBis", AV18MaqCodBis);
         AV49Errmensaje = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49Errmensaje", AV49Errmensaje);
         AV54FasDsc = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV54FasDsc", AV54FasDsc);
         Combo_maqcodbis_Selectedvalue_set = AV18MaqCodBis ;
         ucCombo_maqcodbis.sendProperty(context, "", false, Combo_maqcodbis_Internalname, "SelectedValue_set", Combo_maqcodbis_Selectedvalue_set);
         GXt_int5 = AV5BarOrdLin ;
         GXv_int17[0] = GXt_int5 ;
         new app.pedidosclientesindetalle.getbarordlinultimo(remoteHandle, context).execute( AV21EmprCod, AV22BarCod, AV23BarCodReo, AV24BarCodPar, AV25ProCod, GXv_int17) ;
         hojaderuta__fases_impl.this.GXt_int5 = GXv_int17[0] ;
         AV5BarOrdLin = GXt_int5 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarOrdLin), 4, 0));
         /* Object Property */
         if ( true )
         {
            bDynCreated_Wchojaderuta__fases_wc = true ;
         }
         if ( GXutil.strcmp(GXutil.lower( WebComp_Wchojaderuta__fases_wc_Component), GXutil.lower( "PedidosClienteSinDetalle.HojadeRuta__Fases_WC")) != 0 )
         {
            WebComp_Wchojaderuta__fases_wc = WebUtils.getWebComponent(getClass(), "app.pedidosclientesindetalle.hojaderuta__fases_wc_impl", remoteHandle, context);
            WebComp_Wchojaderuta__fases_wc_Component = "PedidosClienteSinDetalle.HojadeRuta__Fases_WC" ;
         }
         if ( GXutil.len( WebComp_Wchojaderuta__fases_wc_Component) != 0 )
         {
            WebComp_Wchojaderuta__fases_wc.setjustcreated();
            WebComp_Wchojaderuta__fases_wc.componentprepare(new Object[] {"W0137","",AV21EmprCod,Integer.valueOf(AV22BarCod),Byte.valueOf(AV23BarCodReo),AV24BarCodPar,AV25ProCod,AV26ProDsc,Byte.valueOf(AV30BarExt),Integer.valueOf(AV31Discod),Byte.valueOf(AV32BarSit),Integer.valueOf(AV33Clicod),AV34Barunimed,Short.valueOf(AV35Barpes),AV45barser,AV44PedidoCliente,AV43barcolnom,Integer.valueOf(AV42barcolnum),Integer.valueOf(AV41Barpie),AV40BarKgm,AV39Barmtr,AV38CliNom,AV37BarSerDsc,AV36BarAgrest});
            WebComp_Wchojaderuta__fases_wc.componentbind(new Object[] {"","","","","vPROCOD","vPRODSC","","","","","","","","","","","","","","","",""});
         }
         if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wchojaderuta__fases_wc )
         {
            httpContext.ajax_rspStartCmp("gxHTMLWrpW0137"+"");
            WebComp_Wchojaderuta__fases_wc.componentdraw();
            httpContext.ajax_rspEndCmp();
         }
         GX_FocusControl = edtavBarordlin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         httpContext.doAjaxRefresh();
      }
   }

   public void S112( )
   {
      /* 'LOADCOMBOMAQCODBIS' Routine */
      returnInSub = false ;
      /* Using cursor H029C2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13734MaqCDsc = H029C2_A13734MaqCDsc[0] ;
         A602MaqCod = H029C2_A602MaqCod[0] ;
         A606MaqDsc = H029C2_A606MaqDsc[0] ;
         n606MaqDsc = H029C2_n606MaqDsc[0] ;
         if ( AV46barfas == 0 )
         {
            Combo_maqcodbis_Enabled = false ;
            ucCombo_maqcodbis.sendProperty(context, "", false, Combo_maqcodbis_Internalname, "Enabled", GXutil.booltostr( Combo_maqcodbis_Enabled));
         }
         if ( AV46barfas == 0 )
         {
            cmbavBarfascon.setEnabled( 0 );
            httpContext.ajax_rsp_assign_prop("", false, cmbavBarfascon.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavBarfascon.getEnabled(), 5, 0), true);
         }
         else
         {
            cmbavBarfascon.setEnabled( 1 );
            httpContext.ajax_rsp_assign_prop("", false, cmbavBarfascon.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavBarfascon.getEnabled(), 5, 0), true);
         }
         if ( AV46barfas == 0 )
         {
            cmbavBarfasest.setEnabled( 0 );
            httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasest.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavBarfasest.getEnabled(), 5, 0), true);
         }
         else
         {
            cmbavBarfasest.setEnabled( 1 );
            httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasest.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavBarfasest.getEnabled(), 5, 0), true);
         }
         if ( AV46barfas == 0 )
         {
            cmbavBarfasacab.setEnabled( 0 );
            httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasacab.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavBarfasacab.getEnabled(), 5, 0), true);
         }
         else
         {
            cmbavBarfasacab.setEnabled( 1 );
            httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasacab.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavBarfasacab.getEnabled(), 5, 0), true);
         }
         if ( AV46barfas == 0 )
         {
            cmbavBarfactin.setEnabled( 0 );
            httpContext.ajax_rsp_assign_prop("", false, cmbavBarfactin.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavBarfactin.getEnabled(), 5, 0), true);
         }
         else
         {
            cmbavBarfactin.setEnabled( 1 );
            httpContext.ajax_rsp_assign_prop("", false, cmbavBarfactin.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavBarfactin.getEnabled(), 5, 0), true);
         }
         if ( AV46barfas == 0 )
         {
            edtavMaqcodbis_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavMaqcodbis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcodbis_Enabled), 5, 0), true);
         }
         else
         {
            edtavMaqcodbis_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavMaqcodbis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcodbis_Enabled), 5, 0), true);
         }
         if ( AV46barfas == 0 )
         {
            cmbavBarfasfor.setEnabled( 0 );
            httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasfor.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavBarfasfor.getEnabled(), 5, 0), true);
         }
         else
         {
            cmbavBarfasfor.setEnabled( 1 );
            httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasfor.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavBarfasfor.getEnabled(), 5, 0), true);
         }
         if ( AV46barfas == 0 )
         {
            edtavBarhorini_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavBarhorini_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarhorini_Enabled), 5, 0), true);
         }
         else
         {
            edtavBarhorini_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavBarhorini_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarhorini_Enabled), 5, 0), true);
         }
         if ( AV46barfas == 0 )
         {
            edtavBarhorfin_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavBarhorfin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarhorfin_Enabled), 5, 0), true);
         }
         else
         {
            edtavBarhorfin_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavBarhorfin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarhorfin_Enabled), 5, 0), true);
         }
         if ( AV46barfas == 0 )
         {
            edtavBarfecini_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavBarfecini_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfecini_Enabled), 5, 0), true);
         }
         else
         {
            edtavBarfecini_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavBarfecini_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfecini_Enabled), 5, 0), true);
         }
         if ( AV46barfas == 0 )
         {
            edtavBarfecrea_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavBarfecrea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfecrea_Enabled), 5, 0), true);
         }
         else
         {
            edtavBarfecrea_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavBarfecrea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfecrea_Enabled), 5, 0), true);
         }
         AV8Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A602MaqCod );
         AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13734MaqCDsc );
         AV20MaqCodBis_Data.add(AV8Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      Combo_maqcodbis_Selectedvalue_set = AV18MaqCodBis ;
      ucCombo_maqcodbis.sendProperty(context, "", false, Combo_maqcodbis_Internalname, "SelectedValue_set", Combo_maqcodbis_Selectedvalue_set);
   }

   public void e1529C2( )
   {
      /* Barordlin_Isvalid Routine */
      returnInSub = false ;
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      AV55FascodIN = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55FascodIN", AV55FascodIN);
      if ( (0==AV5BarOrdLin) )
      {
         lblTbmessage_Caption = httpContext.getMessage( "No ha introducido Orden", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         AV46barfas = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46barfas", GXutil.str( AV46barfas, 1, 0));
         AV11Barfasacab = "N" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11Barfasacab", AV11Barfasacab);
         AV12BarFasfor = "N" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12BarFasfor", AV12BarFasfor);
         AV14Barfecrea = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Barfecrea", localUtil.format(AV14Barfecrea, "99/99/99"));
         AV48Barfecrini = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48Barfecrini", localUtil.format(AV48Barfecrini, "99/99/99"));
         AV16Barhorfin = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Barhorfin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Barhorfin), 4, 0));
         AV15BarHorIni = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15BarHorIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15BarHorIni), 4, 0));
         AV47Baruni = DecimalUtil.ZERO ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47Baruni", GXutil.ltrimstr( AV47Baruni, 9, 2));
         AV6Fascod = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6Fascod", AV6Fascod);
         AV18MaqCodBis = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18MaqCodBis", AV18MaqCodBis);
         GX_FocusControl = edtavBarordlin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         AV49Errmensaje = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49Errmensaje", AV49Errmensaje);
         AV54FasDsc = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV54FasDsc", AV54FasDsc);
         GXv_int17[0] = AV46barfas ;
         GXv_char21[0] = AV9BarFascon ;
         GXv_char20[0] = AV10Barfactin ;
         GXv_char13[0] = AV11Barfasacab ;
         GXv_char11[0] = AV12BarFasfor ;
         GXv_date15[0] = AV14Barfecrea ;
         GXv_date14[0] = AV48Barfecrini ;
         GXv_int16[0] = AV16Barhorfin ;
         GXv_int6[0] = AV15BarHorIni ;
         GXv_decimal19[0] = AV47Baruni ;
         GXv_char10[0] = AV55FascodIN ;
         GXv_char9[0] = AV18MaqCodBis ;
         GXv_char4[0] = AV49Errmensaje ;
         new app.pedidosclientesindetalle.obtengodatosordenfase(remoteHandle, context).execute( AV21EmprCod, AV22BarCod, AV23BarCodReo, AV24BarCodPar, AV25ProCod, AV5BarOrdLin, GXv_int17, GXv_char21, GXv_char20, GXv_char13, GXv_char11, GXv_date15, GXv_date14, GXv_int16, GXv_int6, GXv_decimal19, GXv_char10, GXv_char9, GXv_char4) ;
         hojaderuta__fases_impl.this.AV46barfas = (byte)((byte)(GXv_int17[0])) ;
         hojaderuta__fases_impl.this.AV9BarFascon = GXv_char21[0] ;
         hojaderuta__fases_impl.this.AV10Barfactin = GXv_char20[0] ;
         hojaderuta__fases_impl.this.AV11Barfasacab = GXv_char13[0] ;
         hojaderuta__fases_impl.this.AV12BarFasfor = GXv_char11[0] ;
         hojaderuta__fases_impl.this.AV14Barfecrea = GXv_date15[0] ;
         hojaderuta__fases_impl.this.AV48Barfecrini = GXv_date14[0] ;
         hojaderuta__fases_impl.this.AV16Barhorfin = GXv_int16[0] ;
         hojaderuta__fases_impl.this.AV15BarHorIni = GXv_int6[0] ;
         hojaderuta__fases_impl.this.AV47Baruni = GXv_decimal19[0] ;
         hojaderuta__fases_impl.this.AV55FascodIN = GXv_char10[0] ;
         hojaderuta__fases_impl.this.AV18MaqCodBis = GXv_char9[0] ;
         hojaderuta__fases_impl.this.AV49Errmensaje = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46barfas", GXutil.str( AV46barfas, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV9BarFascon", AV9BarFascon);
         httpContext.ajax_rsp_assign_attri("", false, "AV10Barfactin", AV10Barfactin);
         httpContext.ajax_rsp_assign_attri("", false, "AV11Barfasacab", AV11Barfasacab);
         httpContext.ajax_rsp_assign_attri("", false, "AV12BarFasfor", AV12BarFasfor);
         httpContext.ajax_rsp_assign_attri("", false, "AV14Barfecrea", localUtil.format(AV14Barfecrea, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV48Barfecrini", localUtil.format(AV48Barfecrini, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV16Barhorfin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Barhorfin), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV15BarHorIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15BarHorIni), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV47Baruni", GXutil.ltrimstr( AV47Baruni, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV55FascodIN", AV55FascodIN);
         httpContext.ajax_rsp_assign_attri("", false, "AV18MaqCodBis", AV18MaqCodBis);
         httpContext.ajax_rsp_assign_attri("", false, "AV49Errmensaje", AV49Errmensaje);
         AV6Fascod = AV55FascodIN ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6Fascod", AV6Fascod);
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXv_int17[0] = AV46barfas ;
         GXv_char21[0] = AV9BarFascon ;
         GXv_char20[0] = AV10Barfactin ;
         GXv_char13[0] = AV11Barfasacab ;
         GXv_char11[0] = AV12BarFasfor ;
         GXv_date15[0] = AV14Barfecrea ;
         GXv_date14[0] = AV48Barfecrini ;
         GXv_int16[0] = AV16Barhorfin ;
         GXv_int6[0] = AV15BarHorIni ;
         GXv_decimal19[0] = AV47Baruni ;
         GXv_char10[0] = AV55FascodIN ;
         GXv_char9[0] = AV18MaqCodBis ;
         GXv_char4[0] = AV49Errmensaje ;
         new app.pedidosclientesindetalle.obtengodatosordenfase(remoteHandle, context).execute( AV21EmprCod, AV22BarCod, AV23BarCodReo, AV24BarCodPar, AV25ProCod, AV5BarOrdLin, GXv_int17, GXv_char21, GXv_char20, GXv_char13, GXv_char11, GXv_date15, GXv_date14, GXv_int16, GXv_int6, GXv_decimal19, GXv_char10, GXv_char9, GXv_char4) ;
         hojaderuta__fases_impl.this.AV46barfas = (byte)((byte)(GXv_int17[0])) ;
         hojaderuta__fases_impl.this.AV9BarFascon = GXv_char21[0] ;
         hojaderuta__fases_impl.this.AV10Barfactin = GXv_char20[0] ;
         hojaderuta__fases_impl.this.AV11Barfasacab = GXv_char13[0] ;
         hojaderuta__fases_impl.this.AV12BarFasfor = GXv_char11[0] ;
         hojaderuta__fases_impl.this.AV14Barfecrea = GXv_date15[0] ;
         hojaderuta__fases_impl.this.AV48Barfecrini = GXv_date14[0] ;
         hojaderuta__fases_impl.this.AV16Barhorfin = GXv_int16[0] ;
         hojaderuta__fases_impl.this.AV15BarHorIni = GXv_int6[0] ;
         hojaderuta__fases_impl.this.AV47Baruni = GXv_decimal19[0] ;
         hojaderuta__fases_impl.this.AV55FascodIN = GXv_char10[0] ;
         hojaderuta__fases_impl.this.AV18MaqCodBis = GXv_char9[0] ;
         hojaderuta__fases_impl.this.AV49Errmensaje = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46barfas", GXutil.str( AV46barfas, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV9BarFascon", AV9BarFascon);
         httpContext.ajax_rsp_assign_attri("", false, "AV10Barfactin", AV10Barfactin);
         httpContext.ajax_rsp_assign_attri("", false, "AV11Barfasacab", AV11Barfasacab);
         httpContext.ajax_rsp_assign_attri("", false, "AV12BarFasfor", AV12BarFasfor);
         httpContext.ajax_rsp_assign_attri("", false, "AV14Barfecrea", localUtil.format(AV14Barfecrea, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV48Barfecrini", localUtil.format(AV48Barfecrini, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV16Barhorfin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Barhorfin), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV15BarHorIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15BarHorIni), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV47Baruni", GXutil.ltrimstr( AV47Baruni, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV55FascodIN", AV55FascodIN);
         httpContext.ajax_rsp_assign_attri("", false, "AV18MaqCodBis", AV18MaqCodBis);
         httpContext.ajax_rsp_assign_attri("", false, "AV49Errmensaje", AV49Errmensaje);
         AV6Fascod = AV55FascodIN ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6Fascod", AV6Fascod);
         GXt_char1 = AV54FasDsc ;
         GXv_char21[0] = GXt_char1 ;
         new app.pfasdsc(remoteHandle, context).execute( AV21EmprCod, AV6Fascod, GXv_char21) ;
         hojaderuta__fases_impl.this.GXt_char1 = GXv_char21[0] ;
         AV54FasDsc = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV54FasDsc", AV54FasDsc);
         Combo_maqcodbis_Selectedvalue_set = AV18MaqCodBis ;
         ucCombo_maqcodbis.sendProperty(context, "", false, Combo_maqcodbis_Internalname, "SelectedValue_set", Combo_maqcodbis_Selectedvalue_set);
      }
      /*  Sending Event outputs  */
      cmbavBarfasacab.setValue( GXutil.rtrim( AV11Barfasacab) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasacab.getInternalname(), "Values", cmbavBarfasacab.ToJavascriptSource(), true);
      cmbavBarfasfor.setValue( GXutil.rtrim( AV12BarFasfor) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasfor.getInternalname(), "Values", cmbavBarfasfor.ToJavascriptSource(), true);
      cmbavBarfactin.setValue( GXutil.rtrim( AV10Barfactin) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavBarfactin.getInternalname(), "Values", cmbavBarfactin.ToJavascriptSource(), true);
      cmbavBarfascon.setValue( GXutil.rtrim( AV9BarFascon) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavBarfascon.getInternalname(), "Values", cmbavBarfascon.ToJavascriptSource(), true);
   }

   public void e1629C2( )
   {
      /* Refresh Routine */
      returnInSub = false ;
      GXt_int5 = AV5BarOrdLin ;
      GXv_int17[0] = GXt_int5 ;
      new app.pedidosclientesindetalle.getbarordlinultimo(remoteHandle, context).execute( AV21EmprCod, AV22BarCod, AV23BarCodReo, AV24BarCodPar, AV25ProCod, GXv_int17) ;
      hojaderuta__fases_impl.this.GXt_int5 = GXv_int17[0] ;
      AV5BarOrdLin = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarOrdLin), 4, 0));
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wchojaderuta__fases_wc = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wchojaderuta__fases_wc_Component), GXutil.lower( "PedidosClienteSinDetalle.HojadeRuta__Fases_WC")) != 0 )
      {
         WebComp_Wchojaderuta__fases_wc = WebUtils.getWebComponent(getClass(), "app.pedidosclientesindetalle.hojaderuta__fases_wc_impl", remoteHandle, context);
         WebComp_Wchojaderuta__fases_wc_Component = "PedidosClienteSinDetalle.HojadeRuta__Fases_WC" ;
      }
      if ( GXutil.len( WebComp_Wchojaderuta__fases_wc_Component) != 0 )
      {
         WebComp_Wchojaderuta__fases_wc.setjustcreated();
         WebComp_Wchojaderuta__fases_wc.componentprepare(new Object[] {"W0137","",AV21EmprCod,Integer.valueOf(AV22BarCod),Byte.valueOf(AV23BarCodReo),AV24BarCodPar,AV25ProCod,AV26ProDsc,Byte.valueOf(AV30BarExt),Integer.valueOf(AV31Discod),Byte.valueOf(AV32BarSit),Integer.valueOf(AV33Clicod),AV34Barunimed,Short.valueOf(AV35Barpes),AV45barser,AV44PedidoCliente,AV43barcolnom,Integer.valueOf(AV42barcolnum),Integer.valueOf(AV41Barpie),AV40BarKgm,AV39Barmtr,AV38CliNom,AV37BarSerDsc,AV36BarAgrest});
         WebComp_Wchojaderuta__fases_wc.componentbind(new Object[] {"","","","","vPROCOD","vPRODSC","","","","","","","","","","","","","","","",""});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wchojaderuta__fases_wc )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0137"+"");
         WebComp_Wchojaderuta__fases_wc.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      /*  Sending Event outputs  */
   }

   public void e1729C2( )
   {
      /* Fascod_Controlvaluechanged Routine */
      returnInSub = false ;
      GXt_char1 = AV54FasDsc ;
      GXv_char21[0] = GXt_char1 ;
      new app.pfasdsc(remoteHandle, context).execute( AV21EmprCod, AV6Fascod, GXv_char21) ;
      hojaderuta__fases_impl.this.GXt_char1 = GXv_char21[0] ;
      AV54FasDsc = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54FasDsc", AV54FasDsc);
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( GXutil.strcmp(AV54FasDsc, "Error") == 0 )
      {
         GX_FocusControl = edtavFascod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         lblTbmessage_Caption = httpContext.getMessage( "No Existe Fase", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         httpContext.doAjaxRefresh();
      }
      else
      {
         if ( GXutil.strcmp(AV6Fascod, AV55FascodIN) != 0 )
         {
            /* Using cursor H029C3 */
            pr_default.execute(1, new Object[] {AV21EmprCod, AV6Fascod});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A457FasCod = H029C3_A457FasCod[0] ;
               A396EmprCod = H029C3_A396EmprCod[0] ;
               A458FasCon = H029C3_A458FasCon[0] ;
               n458FasCon = H029C3_n458FasCon[0] ;
               A456FasActTin = H029C3_A456FasActTin[0] ;
               n456FasActTin = H029C3_n456FasActTin[0] ;
               A4903FasAcab = H029C3_A4903FasAcab[0] ;
               n4903FasAcab = H029C3_n4903FasAcab[0] ;
               A4286FasForMul = H029C3_A4286FasForMul[0] ;
               n4286FasForMul = H029C3_n4286FasForMul[0] ;
               if ( AV46barfas == 0 )
               {
                  cmbavBarfascon.setEnabled( 0 );
                  httpContext.ajax_rsp_assign_prop("", false, cmbavBarfascon.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavBarfascon.getEnabled(), 5, 0), true);
               }
               else
               {
                  cmbavBarfascon.setEnabled( 1 );
                  httpContext.ajax_rsp_assign_prop("", false, cmbavBarfascon.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavBarfascon.getEnabled(), 5, 0), true);
               }
               if ( AV46barfas == 0 )
               {
                  cmbavBarfasest.setEnabled( 0 );
                  httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasest.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavBarfasest.getEnabled(), 5, 0), true);
               }
               else
               {
                  cmbavBarfasest.setEnabled( 1 );
                  httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasest.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavBarfasest.getEnabled(), 5, 0), true);
               }
               if ( AV46barfas == 0 )
               {
                  cmbavBarfasacab.setEnabled( 0 );
                  httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasacab.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavBarfasacab.getEnabled(), 5, 0), true);
               }
               else
               {
                  cmbavBarfasacab.setEnabled( 1 );
                  httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasacab.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavBarfasacab.getEnabled(), 5, 0), true);
               }
               if ( AV46barfas == 0 )
               {
                  cmbavBarfactin.setEnabled( 0 );
                  httpContext.ajax_rsp_assign_prop("", false, cmbavBarfactin.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavBarfactin.getEnabled(), 5, 0), true);
               }
               else
               {
                  cmbavBarfactin.setEnabled( 1 );
                  httpContext.ajax_rsp_assign_prop("", false, cmbavBarfactin.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavBarfactin.getEnabled(), 5, 0), true);
               }
               if ( AV46barfas == 0 )
               {
                  edtavMaqcodbis_Enabled = 0 ;
                  httpContext.ajax_rsp_assign_prop("", false, edtavMaqcodbis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcodbis_Enabled), 5, 0), true);
               }
               else
               {
                  edtavMaqcodbis_Enabled = 1 ;
                  httpContext.ajax_rsp_assign_prop("", false, edtavMaqcodbis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcodbis_Enabled), 5, 0), true);
               }
               if ( AV46barfas == 0 )
               {
                  cmbavBarfasfor.setEnabled( 0 );
                  httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasfor.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavBarfasfor.getEnabled(), 5, 0), true);
               }
               else
               {
                  cmbavBarfasfor.setEnabled( 1 );
                  httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasfor.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavBarfasfor.getEnabled(), 5, 0), true);
               }
               if ( AV46barfas == 0 )
               {
                  edtavBarhorini_Enabled = 0 ;
                  httpContext.ajax_rsp_assign_prop("", false, edtavBarhorini_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarhorini_Enabled), 5, 0), true);
               }
               else
               {
                  edtavBarhorini_Enabled = 1 ;
                  httpContext.ajax_rsp_assign_prop("", false, edtavBarhorini_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarhorini_Enabled), 5, 0), true);
               }
               if ( AV46barfas == 0 )
               {
                  edtavBarhorfin_Enabled = 0 ;
                  httpContext.ajax_rsp_assign_prop("", false, edtavBarhorfin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarhorfin_Enabled), 5, 0), true);
               }
               else
               {
                  edtavBarhorfin_Enabled = 1 ;
                  httpContext.ajax_rsp_assign_prop("", false, edtavBarhorfin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarhorfin_Enabled), 5, 0), true);
               }
               if ( AV46barfas == 0 )
               {
                  edtavBarfecini_Enabled = 0 ;
                  httpContext.ajax_rsp_assign_prop("", false, edtavBarfecini_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfecini_Enabled), 5, 0), true);
               }
               else
               {
                  edtavBarfecini_Enabled = 1 ;
                  httpContext.ajax_rsp_assign_prop("", false, edtavBarfecini_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfecini_Enabled), 5, 0), true);
               }
               if ( AV46barfas == 0 )
               {
                  edtavBarfecrea_Enabled = 0 ;
                  httpContext.ajax_rsp_assign_prop("", false, edtavBarfecrea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfecrea_Enabled), 5, 0), true);
               }
               else
               {
                  edtavBarfecrea_Enabled = 1 ;
                  httpContext.ajax_rsp_assign_prop("", false, edtavBarfecrea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfecrea_Enabled), 5, 0), true);
               }
               AV9BarFascon = A458FasCon ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9BarFascon", AV9BarFascon);
               AV10Barfactin = A456FasActTin ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10Barfactin", AV10Barfactin);
               AV11Barfasacab = A4903FasAcab ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11Barfasacab", AV11Barfasacab);
               AV12BarFasfor = A4286FasForMul ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12BarFasfor", AV12BarFasfor);
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(1);
         }
      }
      /*  Sending Event outputs  */
      cmbavBarfascon.setValue( GXutil.rtrim( AV9BarFascon) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavBarfascon.getInternalname(), "Values", cmbavBarfascon.ToJavascriptSource(), true);
      cmbavBarfactin.setValue( GXutil.rtrim( AV10Barfactin) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavBarfactin.getInternalname(), "Values", cmbavBarfactin.ToJavascriptSource(), true);
      cmbavBarfasacab.setValue( GXutil.rtrim( AV11Barfasacab) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasacab.getInternalname(), "Values", cmbavBarfasacab.ToJavascriptSource(), true);
      cmbavBarfasfor.setValue( GXutil.rtrim( AV12BarFasfor) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasfor.getInternalname(), "Values", cmbavBarfasfor.ToJavascriptSource(), true);
   }

   protected void nextLoad( )
   {
   }

   protected void e1829C2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table2_149_29C2( boolean wbgen )
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
         wb_table2_149_29C2e( true) ;
      }
      else
      {
         wb_table2_149_29C2e( false) ;
      }
   }

   public void wb_table1_49_29C2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedfascod_Internalname, tblTablemergedfascod_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFascod_Internalname, httpContext.getMessage( "Fascod", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFascod_Internalname, GXutil.rtrim( AV6Fascod), GXutil.rtrim( localUtil.format( AV6Fascod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFascod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFascod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Fases.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Static images/pictures */
         ClassString = "Image" + " " + ((GXutil.strcmp(imgPrompt_fascod_gximage, "")==0) ? "GX_Image_prompt_Class" : "GX_Image_"+imgPrompt_fascod_gximage+"_Class") ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         app.GxWebStd.gx_bitmap( httpContext, imgPrompt_fascod_Internalname, sImgUrl, imgPrompt_fascod_Link, "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" ", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_PedidosClienteSinDetalle\\HojadeRuta__Fases.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_49_29C2e( true) ;
      }
      else
      {
         wb_table1_49_29C2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV21EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21EmprCod", AV21EmprCod);
      AV22BarCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22BarCod), 8, 0));
      AV23BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23BarCodReo", GXutil.str( AV23BarCodReo, 1, 0));
      AV24BarCodPar = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24BarCodPar", AV24BarCodPar);
      AV25ProCod = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25ProCod", AV25ProCod);
      AV26ProDsc = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26ProDsc", AV26ProDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRODSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26ProDsc, ""))));
      AV30BarExt = ((Number) GXutil.testNumericType( getParm(obj,6), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30BarExt", GXutil.str( AV30BarExt, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBAREXT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV30BarExt), "9")));
      AV31Discod = ((Number) GXutil.testNumericType( getParm(obj,7), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Discod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31Discod), 8, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV31Discod), "ZZZZZZZ9")));
      AV32BarSit = ((Number) GXutil.testNumericType( getParm(obj,8), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32BarSit), 2, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSIT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV32BarSit), "Z9")));
      AV33Clicod = ((Number) GXutil.testNumericType( getParm(obj,9), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Clicod), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33Clicod), "ZZZZZ9")));
      AV34Barunimed = (String)getParm(obj,10) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Barunimed", AV34Barunimed);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARUNIMED", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV34Barunimed, "@!"))));
      AV35Barpes = ((Number) GXutil.testNumericType( getParm(obj,11), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Barpes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35Barpes), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV35Barpes), "ZZZ9")));
      AV45barser = (String)getParm(obj,12) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45barser", AV45barser);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV45barser, ""))));
      AV44PedidoCliente = (String)getParm(obj,13) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44PedidoCliente", AV44PedidoCliente);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPEDIDOCLIENTE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV44PedidoCliente, ""))));
      AV43barcolnom = (String)getParm(obj,14) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43barcolnom", AV43barcolnom);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV43barcolnom, ""))));
      AV42barcolnum = ((Number) GXutil.testNumericType( getParm(obj,15), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42barcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42barcolnum), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV42barcolnum), "ZZZZZ9")));
      AV41Barpie = ((Number) GXutil.testNumericType( getParm(obj,16), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41Barpie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41Barpie), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41Barpie), "ZZZZZ9")));
      AV40BarKgm = (java.math.BigDecimal)getParm(obj,17) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40BarKgm", GXutil.ltrimstr( AV40BarKgm, 9, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARKGM", getSecureSignedToken( "", localUtil.format( AV40BarKgm, "ZZZZZ9.99")));
      AV39Barmtr = (java.math.BigDecimal)getParm(obj,18) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Barmtr", GXutil.ltrimstr( AV39Barmtr, 9, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARMTR", getSecureSignedToken( "", localUtil.format( AV39Barmtr, "ZZZZZ9.99")));
      AV38CliNom = (String)getParm(obj,19) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38CliNom", AV38CliNom);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV38CliNom, ""))));
      AV37BarSerDsc = (String)getParm(obj,20) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37BarSerDsc", AV37BarSerDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSERDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV37BarSerDsc, ""))));
      AV36BarAgrest = (String)getParm(obj,21) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36BarAgrest", AV36BarAgrest);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARAGREST", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV36BarAgrest, "@!"))));
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
      pa29C2( ) ;
      ws29C2( ) ;
      we29C2( ) ;
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
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Wchojaderuta__fases_wc == null ) )
      {
         if ( GXutil.len( WebComp_Wchojaderuta__fases_wc_Component) != 0 )
         {
            WebComp_Wchojaderuta__fases_wc.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202681714305582", true, true);
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
      httpContext.AddJavascriptSource("pedidosclientesindetalle/hojaderuta__fases.js", "?202681714305583", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavProcod_Internalname = "vPROCOD" ;
      edtavProdsc_Internalname = "vPRODSC" ;
      divUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      edtavBarordlin_Internalname = "vBARORDLIN" ;
      lblTextblockfascod_Internalname = "TEXTBLOCKFASCOD" ;
      edtavFascod_Internalname = "vFASCOD" ;
      imgPrompt_fascod_Internalname = "PROMPT_FASCOD" ;
      tblTablemergedfascod_Internalname = "TABLEMERGEDFASCOD" ;
      divTablesplittedfascod_Internalname = "TABLESPLITTEDFASCOD" ;
      edtavFasdsc_Internalname = "vFASDSC" ;
      lblTextblockcombo_maqcodbis_Internalname = "TEXTBLOCKCOMBO_MAQCODBIS" ;
      Combo_maqcodbis_Internalname = "COMBO_MAQCODBIS" ;
      divTablesplittedmaqcodbis_Internalname = "TABLESPLITTEDMAQCODBIS" ;
      cmbavBarfasest.setInternalname( "vBARFASEST" );
      cmbavBarfascon.setInternalname( "vBARFASCON" );
      cmbavBarfactin.setInternalname( "vBARFACTIN" );
      cmbavBarfasacab.setInternalname( "vBARFASACAB" );
      cmbavBarfasfor.setInternalname( "vBARFASFOR" );
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      edtavBarfecini_Internalname = "vBARFECINI" ;
      edtavBarfecrea_Internalname = "vBARFECREA" ;
      edtavBarhorini_Internalname = "vBARHORINI" ;
      edtavBarhorfin_Internalname = "vBARHORFIN" ;
      edtavBarfas_Internalname = "vBARFAS" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      edtavErrmensaje_Internalname = "vERRMENSAJE" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      lblTbmessage_Internalname = "TBMESSAGE" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavMaqcodbis_Internalname = "vMAQCODBIS" ;
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
      imgPrompt_fascod_Link = "" ;
      edtavFascod_Jsonclick = "" ;
      edtavFascod_Enabled = 1 ;
      edtavMaqcodbis_Jsonclick = "" ;
      edtavMaqcodbis_Enabled = 1 ;
      edtavMaqcodbis_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      lblTbmessage_Caption = "  " ;
      edtavErrmensaje_Jsonclick = "" ;
      edtavErrmensaje_Enabled = 1 ;
      edtavBarfas_Jsonclick = "" ;
      edtavBarfas_Enabled = 1 ;
      edtavBarhorfin_Jsonclick = "" ;
      edtavBarhorfin_Enabled = 1 ;
      edtavBarhorini_Jsonclick = "" ;
      edtavBarhorini_Enabled = 1 ;
      edtavBarfecrea_Jsonclick = "" ;
      edtavBarfecrea_Enabled = 1 ;
      edtavBarfecini_Jsonclick = "" ;
      edtavBarfecini_Enabled = 1 ;
      cmbavBarfasfor.setJsonclick( "" );
      cmbavBarfasfor.setEnabled( 1 );
      cmbavBarfasacab.setJsonclick( "" );
      cmbavBarfasacab.setEnabled( 1 );
      cmbavBarfactin.setJsonclick( "" );
      cmbavBarfactin.setEnabled( 1 );
      cmbavBarfascon.setJsonclick( "" );
      cmbavBarfascon.setEnabled( 1 );
      cmbavBarfasest.setJsonclick( "" );
      cmbavBarfasest.setEnabled( 1 );
      edtavFasdsc_Jsonclick = "" ;
      edtavFasdsc_Enabled = 1 ;
      edtavBarordlin_Jsonclick = "" ;
      edtavBarordlin_Enabled = 1 ;
      edtavProdsc_Jsonclick = "" ;
      edtavProdsc_Enabled = 0 ;
      edtavProcod_Jsonclick = "" ;
      edtavProcod_Enabled = 0 ;
      Dvelop_confirmpanel_enter_Confirmtype = "1" ;
      Dvelop_confirmpanel_enter_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_enter_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_enter_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_enter_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_enter_Confirmationtext = "¿Confirma el dato?" ;
      Dvelop_confirmpanel_enter_Title = "" ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "Fase", "") ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      Combo_maqcodbis_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_maqcodbis_Enabled = GXutil.toBoolean( -1) ;
      Combo_maqcodbis_Cls = "ExtendedCombo AttributeFL" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Informacion General", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Fases (Hdr)", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavBarfasest.setName( "vBARFASEST" );
      cmbavBarfasest.setWebtags( "" );
      cmbavBarfasest.addItem("0", httpContext.getMessage( "Pdte.", ""), (short)(0));
      cmbavBarfasest.addItem("1", httpContext.getMessage( "Proc.", ""), (short)(0));
      cmbavBarfasest.addItem("2", httpContext.getMessage( "Fin.", ""), (short)(0));
      if ( cmbavBarfasest.getItemCount() > 0 )
      {
         AV19BarFasEst = (byte)(GXutil.lval( cmbavBarfasest.getValidValue(GXutil.trim( GXutil.str( AV19BarFasEst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19BarFasEst", GXutil.str( AV19BarFasEst, 1, 0));
      }
      cmbavBarfascon.setName( "vBARFASCON" );
      cmbavBarfascon.setWebtags( "" );
      cmbavBarfascon.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      cmbavBarfascon.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      if ( cmbavBarfascon.getItemCount() > 0 )
      {
         AV9BarFascon = cmbavBarfascon.getValidValue(AV9BarFascon) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9BarFascon", AV9BarFascon);
      }
      cmbavBarfactin.setName( "vBARFACTIN" );
      cmbavBarfactin.setWebtags( "" );
      cmbavBarfactin.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbavBarfactin.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbavBarfactin.getItemCount() > 0 )
      {
         AV10Barfactin = cmbavBarfactin.getValidValue(AV10Barfactin) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10Barfactin", AV10Barfactin);
      }
      cmbavBarfasacab.setName( "vBARFASACAB" );
      cmbavBarfasacab.setWebtags( "" );
      cmbavBarfasacab.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbavBarfasacab.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbavBarfasacab.getItemCount() > 0 )
      {
         AV11Barfasacab = cmbavBarfasacab.getValidValue(AV11Barfasacab) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11Barfasacab", AV11Barfasacab);
      }
      cmbavBarfasfor.setName( "vBARFASFOR" );
      cmbavBarfasfor.setWebtags( "" );
      cmbavBarfasfor.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbavBarfasfor.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbavBarfasfor.getItemCount() > 0 )
      {
         AV12BarFasfor = cmbavBarfasfor.getValidValue(AV12BarFasfor) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12BarFasfor", AV12BarFasfor);
      }
      /* End function init_web_controls */
   }

   public void validv_Barfas( )
   {
      if ( AV46barfas == 0 )
      {
         cmbavBarfascon.setEnabled( 0 );
      }
      else
      {
         cmbavBarfascon.setEnabled( 1 );
      }
      if ( AV46barfas == 0 )
      {
         cmbavBarfasest.setEnabled( 0 );
      }
      else
      {
         cmbavBarfasest.setEnabled( 1 );
      }
      if ( AV46barfas == 0 )
      {
         cmbavBarfasacab.setEnabled( 0 );
      }
      else
      {
         cmbavBarfasacab.setEnabled( 1 );
      }
      if ( AV46barfas == 0 )
      {
         cmbavBarfactin.setEnabled( 0 );
      }
      else
      {
         cmbavBarfactin.setEnabled( 1 );
      }
      if ( AV46barfas == 0 )
      {
         edtavMaqcodbis_Enabled = 0 ;
      }
      else
      {
         edtavMaqcodbis_Enabled = 1 ;
      }
      if ( AV46barfas == 0 )
      {
         cmbavBarfasfor.setEnabled( 0 );
      }
      else
      {
         cmbavBarfasfor.setEnabled( 1 );
      }
      if ( AV46barfas == 0 )
      {
         edtavBarhorini_Enabled = 0 ;
      }
      else
      {
         edtavBarhorini_Enabled = 1 ;
      }
      if ( AV46barfas == 0 )
      {
         edtavBarhorfin_Enabled = 0 ;
      }
      else
      {
         edtavBarhorfin_Enabled = 1 ;
      }
      if ( AV46barfas == 0 )
      {
         edtavBarfecini_Enabled = 0 ;
      }
      else
      {
         edtavBarfecini_Enabled = 1 ;
      }
      if ( AV46barfas == 0 )
      {
         edtavBarfecrea_Enabled = 0 ;
      }
      else
      {
         edtavBarfecrea_Enabled = 1 ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_prop("", false, cmbavBarfascon.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavBarfascon.getEnabled(), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasest.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavBarfasest.getEnabled(), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasacab.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavBarfasacab.getEnabled(), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, cmbavBarfactin.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavBarfactin.getEnabled(), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcodbis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcodbis_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasfor.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavBarfasfor.getEnabled(), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavBarhorini_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarhorini_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavBarhorfin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarhorfin_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavBarfecini_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfecini_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavBarfecrea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfecrea_Enabled), 5, 0), true);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV21EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV22BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV23BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV24BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV25ProCod',fld:'vPROCOD',pic:''},{av:'AV50Planing',fld:'vPLANING',pic:'ZZZ9',hsh:true},{av:'AV30BarExt',fld:'vBAREXT',pic:'9',hsh:true},{av:'AV31Discod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV32BarSit',fld:'vBARSIT',pic:'Z9',hsh:true},{av:'AV33Clicod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV34Barunimed',fld:'vBARUNIMED',pic:'@!',hsh:true},{av:'AV35Barpes',fld:'vBARPES',pic:'ZZZ9',hsh:true},{av:'AV45barser',fld:'vBARSER',pic:'',hsh:true},{av:'AV44PedidoCliente',fld:'vPEDIDOCLIENTE',pic:'',hsh:true},{av:'AV43barcolnom',fld:'vBARCOLNOM',pic:'',hsh:true},{av:'AV42barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV41Barpie',fld:'vBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV40BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV39Barmtr',fld:'vBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV38CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV37BarSerDsc',fld:'vBARSERDSC',pic:'',hsh:true},{av:'AV36BarAgrest',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV52BarFasEstIN',fld:'vBARFASESTIN',pic:'ZZZ9',hsh:true},{av:'AV26ProDsc',fld:'vPRODSC',pic:'',hsh:true},{av:'AV58Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV5BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9'},{ctrl:'WCHOJADERUTA__FASES_WC'}]}");
      setEventMetadata("ENTER","{handler:'e1329C2',iparms:[{av:'AV5BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9'},{av:'AV6Fascod',fld:'vFASCOD',pic:'@!'},{av:'AV21EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV49Errmensaje',fld:'vERRMENSAJE',pic:''}]");
      setEventMetadata("ENTER",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV54FasDsc',fld:'vFASDSC',pic:''}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE","{handler:'e1129C2',iparms:[{av:'Dvelop_confirmpanel_enter_Result',ctrl:'DVELOP_CONFIRMPANEL_ENTER',prop:'Result'},{av:'AV46barfas',fld:'vBARFAS',pic:'9'},{av:'AV21EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV22BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV23BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV24BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV25ProCod',fld:'vPROCOD',pic:''},{av:'AV5BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9'},{av:'AV6Fascod',fld:'vFASCOD',pic:'@!'},{av:'AV29UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV27Station',fld:'vSTATION',pic:''},{av:'AV50Planing',fld:'vPLANING',pic:'ZZZ9',hsh:true},{av:'AV58Pgmname',fld:'vPGMNAME',pic:''},{av:'AV26ProDsc',fld:'vPRODSC',pic:'',hsh:true},{av:'AV30BarExt',fld:'vBAREXT',pic:'9',hsh:true},{av:'AV31Discod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV32BarSit',fld:'vBARSIT',pic:'Z9',hsh:true},{av:'AV33Clicod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV34Barunimed',fld:'vBARUNIMED',pic:'@!',hsh:true},{av:'AV35Barpes',fld:'vBARPES',pic:'ZZZ9',hsh:true},{av:'AV45barser',fld:'vBARSER',pic:'',hsh:true},{av:'AV44PedidoCliente',fld:'vPEDIDOCLIENTE',pic:'',hsh:true},{av:'AV43barcolnom',fld:'vBARCOLNOM',pic:'',hsh:true},{av:'AV42barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV41Barpie',fld:'vBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV40BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV39Barmtr',fld:'vBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV38CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV37BarSerDsc',fld:'vBARSERDSC',pic:'',hsh:true},{av:'AV36BarAgrest',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'cmbavBarfactin'},{av:'AV10Barfactin',fld:'vBARFACTIN',pic:'@!'},{av:'cmbavBarfasacab'},{av:'AV11Barfasacab',fld:'vBARFASACAB',pic:'@!'},{av:'cmbavBarfascon'},{av:'AV9BarFascon',fld:'vBARFASCON',pic:'@!'},{av:'cmbavBarfasest'},{av:'AV19BarFasEst',fld:'vBARFASEST',pic:'9'},{av:'cmbavBarfasfor'},{av:'AV12BarFasfor',fld:'vBARFASFOR',pic:'@!'},{av:'AV14Barfecrea',fld:'vBARFECREA',pic:''},{av:'AV48Barfecrini',fld:'vBARFECRINI',pic:''},{av:'AV16Barhorfin',fld:'vBARHORFIN',pic:'ZZZ9'},{av:'AV15BarHorIni',fld:'vBARHORINI',pic:'ZZZ9'},{av:'AV17BarTieteo',fld:'vBARTIETEO',pic:'Z9.99'},{av:'AV47Baruni',fld:'vBARUNI',pic:'ZZZZZ9.99'},{av:'AV18MaqCodBis',fld:'vMAQCODBIS',pic:''},{av:'AV52BarFasEstIN',fld:'vBARFASESTIN',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE",",oparms:[{av:'AV27Station',fld:'vSTATION',pic:''},{av:'AV29UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV17BarTieteo',fld:'vBARTIETEO',pic:'Z9.99'},{av:'cmbavBarfasest'},{av:'AV19BarFasEst',fld:'vBARFASEST',pic:'9'},{av:'AV6Fascod',fld:'vFASCOD',pic:'@!'},{av:'AV5BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9'},{av:'AV25ProCod',fld:'vPROCOD',pic:''},{av:'AV24BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV23BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV22BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV21EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV46barfas',fld:'vBARFAS',pic:'9'},{av:'cmbavBarfasacab'},{av:'AV11Barfasacab',fld:'vBARFASACAB',pic:'@!'},{av:'cmbavBarfasfor'},{av:'AV12BarFasfor',fld:'vBARFASFOR',pic:'@!'},{av:'cmbavBarfactin'},{av:'AV10Barfactin',fld:'vBARFACTIN',pic:'@!'},{av:'cmbavBarfascon'},{av:'AV9BarFascon',fld:'vBARFASCON',pic:'@!'},{av:'AV14Barfecrea',fld:'vBARFECREA',pic:''},{av:'AV48Barfecrini',fld:'vBARFECRINI',pic:''},{av:'AV16Barhorfin',fld:'vBARHORFIN',pic:'ZZZ9'},{av:'AV15BarHorIni',fld:'vBARHORINI',pic:'ZZZ9'},{av:'AV47Baruni',fld:'vBARUNI',pic:'ZZZZZ9.99'},{av:'AV18MaqCodBis',fld:'vMAQCODBIS',pic:''},{av:'AV54FasDsc',fld:'vFASDSC',pic:''},{av:'Combo_maqcodbis_Selectedvalue_set',ctrl:'COMBO_MAQCODBIS',prop:'SelectedValue_set'},{av:'AV49Errmensaje',fld:'vERRMENSAJE',pic:''},{ctrl:'WCHOJADERUTA__FASES_WC'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e1429C2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("VBARORDLIN.ISVALID","{handler:'e1529C2',iparms:[{av:'AV5BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9'},{av:'AV21EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV22BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV23BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV24BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV25ProCod',fld:'vPROCOD',pic:''}]");
      setEventMetadata("VBARORDLIN.ISVALID",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV55FascodIN',fld:'vFASCODIN',pic:'@!'},{av:'Combo_maqcodbis_Selectedvalue_set',ctrl:'COMBO_MAQCODBIS',prop:'SelectedValue_set'},{av:'AV46barfas',fld:'vBARFAS',pic:'9'},{av:'cmbavBarfasacab'},{av:'AV11Barfasacab',fld:'vBARFASACAB',pic:'@!'},{av:'cmbavBarfasfor'},{av:'AV12BarFasfor',fld:'vBARFASFOR',pic:'@!'},{av:'AV14Barfecrea',fld:'vBARFECREA',pic:''},{av:'AV48Barfecrini',fld:'vBARFECRINI',pic:''},{av:'AV16Barhorfin',fld:'vBARHORFIN',pic:'ZZZ9'},{av:'AV15BarHorIni',fld:'vBARHORINI',pic:'ZZZ9'},{av:'AV47Baruni',fld:'vBARUNI',pic:'ZZZZZ9.99'},{av:'AV6Fascod',fld:'vFASCOD',pic:'@!'},{av:'AV18MaqCodBis',fld:'vMAQCODBIS',pic:''},{av:'AV49Errmensaje',fld:'vERRMENSAJE',pic:''},{av:'AV54FasDsc',fld:'vFASDSC',pic:''},{av:'cmbavBarfactin'},{av:'AV10Barfactin',fld:'vBARFACTIN',pic:'@!'},{av:'cmbavBarfascon'},{av:'AV9BarFascon',fld:'vBARFASCON',pic:'@!'}]}");
      setEventMetadata("VFASCOD.CONTROLVALUECHANGED","{handler:'e1729C2',iparms:[{av:'AV21EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Fascod',fld:'vFASCOD',pic:'@!'},{av:'AV55FascodIN',fld:'vFASCODIN',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A458FasCon',fld:'FASCON',pic:'@!'},{av:'A456FasActTin',fld:'FASACTTIN',pic:'@!'},{av:'A4903FasAcab',fld:'FASACAB',pic:'@!'},{av:'A4286FasForMul',fld:'FASFORMUL',pic:'@!'}]");
      setEventMetadata("VFASCOD.CONTROLVALUECHANGED",",oparms:[{av:'AV54FasDsc',fld:'vFASDSC',pic:''},{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'cmbavBarfascon'},{av:'AV9BarFascon',fld:'vBARFASCON',pic:'@!'},{av:'cmbavBarfactin'},{av:'AV10Barfactin',fld:'vBARFACTIN',pic:'@!'},{av:'cmbavBarfasacab'},{av:'AV11Barfasacab',fld:'vBARFASACAB',pic:'@!'},{av:'cmbavBarfasfor'},{av:'AV12BarFasfor',fld:'vBARFASFOR',pic:'@!'}]}");
      setEventMetadata("VALIDV_FASCOD","{handler:'validv_Fascod',iparms:[]");
      setEventMetadata("VALIDV_FASCOD",",oparms:[]}");
      setEventMetadata("VALIDV_BARFASEST","{handler:'validv_Barfasest',iparms:[]");
      setEventMetadata("VALIDV_BARFASEST",",oparms:[]}");
      setEventMetadata("VALIDV_BARFASCON","{handler:'validv_Barfascon',iparms:[]");
      setEventMetadata("VALIDV_BARFASCON",",oparms:[]}");
      setEventMetadata("VALIDV_BARFACTIN","{handler:'validv_Barfactin',iparms:[]");
      setEventMetadata("VALIDV_BARFACTIN",",oparms:[]}");
      setEventMetadata("VALIDV_BARFASACAB","{handler:'validv_Barfasacab',iparms:[]");
      setEventMetadata("VALIDV_BARFASACAB",",oparms:[]}");
      setEventMetadata("VALIDV_BARFASFOR","{handler:'validv_Barfasfor',iparms:[]");
      setEventMetadata("VALIDV_BARFASFOR",",oparms:[]}");
      setEventMetadata("VALIDV_BARFAS","{handler:'validv_Barfas',iparms:[{av:'AV46barfas',fld:'vBARFAS',pic:'9'}]");
      setEventMetadata("VALIDV_BARFAS",",oparms:[{av:'cmbavBarfascon'},{av:'cmbavBarfasest'},{av:'cmbavBarfasacab'},{av:'cmbavBarfactin'},{av:'edtavMaqcodbis_Enabled',ctrl:'vMAQCODBIS',prop:'Enabled'},{av:'cmbavBarfasfor'},{av:'edtavBarhorini_Enabled',ctrl:'vBARHORINI',prop:'Enabled'},{av:'edtavBarhorfin_Enabled',ctrl:'vBARHORFIN',prop:'Enabled'},{av:'edtavBarfecini_Enabled',ctrl:'vBARFECINI',prop:'Enabled'},{av:'edtavBarfecrea_Enabled',ctrl:'vBARFECREA',prop:'Enabled'}]}");
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
      wcpOAV21EmprCod = "" ;
      wcpOAV24BarCodPar = "" ;
      wcpOAV25ProCod = "" ;
      wcpOAV26ProDsc = "" ;
      wcpOAV34Barunimed = "" ;
      wcpOAV45barser = "" ;
      wcpOAV44PedidoCliente = "" ;
      wcpOAV43barcolnom = "" ;
      wcpOAV40BarKgm = DecimalUtil.ZERO ;
      wcpOAV39Barmtr = DecimalUtil.ZERO ;
      wcpOAV38CliNom = "" ;
      wcpOAV37BarSerDsc = "" ;
      wcpOAV36BarAgrest = "" ;
      Dvelop_confirmpanel_enter_Result = "" ;
      Combo_maqcodbis_Selectedvalue_get = "" ;
      NV9BarFascon = "" ;
      NV11Barfasacab = "" ;
      NV10Barfactin = "" ;
      NV18MaqCodBis = "" ;
      NV12BarFasfor = "" ;
      NV17BarTieteo = DecimalUtil.ZERO ;
      NV13BarFecIni = GXutil.nullDate() ;
      NV14Barfecrea = GXutil.nullDate() ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV21EmprCod = "" ;
      AV24BarCodPar = "" ;
      AV25ProCod = "" ;
      AV26ProDsc = "" ;
      AV34Barunimed = "" ;
      AV45barser = "" ;
      AV44PedidoCliente = "" ;
      AV43barcolnom = "" ;
      AV40BarKgm = DecimalUtil.ZERO ;
      AV39Barmtr = DecimalUtil.ZERO ;
      AV38CliNom = "" ;
      AV37BarSerDsc = "" ;
      AV36BarAgrest = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV58Pgmname = "" ;
      AV20MaqCodBis_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV29UsurCod = "" ;
      AV27Station = "" ;
      AV48Barfecrini = GXutil.nullDate() ;
      AV17BarTieteo = DecimalUtil.ZERO ;
      AV47Baruni = DecimalUtil.ZERO ;
      AV55FascodIN = "" ;
      A396EmprCod = "" ;
      A457FasCod = "" ;
      A458FasCon = "" ;
      A456FasActTin = "" ;
      A4903FasAcab = "" ;
      A4286FasForMul = "" ;
      Combo_maqcodbis_Selectedvalue_set = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      lblTextblockfascod_Jsonclick = "" ;
      AV54FasDsc = "" ;
      lblTextblockcombo_maqcodbis_Jsonclick = "" ;
      ucCombo_maqcodbis = new com.genexus.webpanels.GXUserControl();
      Combo_maqcodbis_Caption = "" ;
      AV9BarFascon = "" ;
      AV10Barfactin = "" ;
      AV11Barfasacab = "" ;
      AV12BarFasfor = "" ;
      AV13BarFecIni = GXutil.nullDate() ;
      AV14Barfecrea = GXutil.nullDate() ;
      AV49Errmensaje = "" ;
      lblTbmessage_Jsonclick = "" ;
      bttBtnenter_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      WebComp_Wchojaderuta__fases_wc_Component = "" ;
      OldWchojaderuta__fases_wc = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      AV18MaqCodBis = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV6Fascod = "" ;
      hsh = "" ;
      AV28EmprNom = "" ;
      AV51Inc_obs = "" ;
      GXv_int7 = new int[1] ;
      GXv_int8 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int12 = new byte[1] ;
      GXv_decimal18 = new java.math.BigDecimal[1] ;
      scmdbuf = "" ;
      H029C2_A396EmprCod = new String[] {""} ;
      H029C2_A13734MaqCDsc = new String[] {""} ;
      H029C2_A602MaqCod = new String[] {""} ;
      H029C2_A606MaqDsc = new String[] {""} ;
      H029C2_n606MaqDsc = new boolean[] {false} ;
      A13734MaqCDsc = "" ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      AV8Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      GXv_char20 = new String[1] ;
      GXv_char13 = new String[1] ;
      GXv_char11 = new String[1] ;
      GXv_date15 = new java.util.Date[1] ;
      GXv_date14 = new java.util.Date[1] ;
      GXv_int16 = new short[1] ;
      GXv_int6 = new short[1] ;
      GXv_decimal19 = new java.math.BigDecimal[1] ;
      GXv_char10 = new String[1] ;
      GXv_char9 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int17 = new short[1] ;
      GXt_char1 = "" ;
      GXv_char21 = new String[1] ;
      H029C3_A457FasCod = new String[] {""} ;
      H029C3_A396EmprCod = new String[] {""} ;
      H029C3_A458FasCon = new String[] {""} ;
      H029C3_n458FasCon = new boolean[] {false} ;
      H029C3_A456FasActTin = new String[] {""} ;
      H029C3_n456FasActTin = new boolean[] {false} ;
      H029C3_A4903FasAcab = new String[] {""} ;
      H029C3_n4903FasAcab = new boolean[] {false} ;
      H029C3_A4286FasForMul = new String[] {""} ;
      H029C3_n4286FasForMul = new boolean[] {false} ;
      sStyleString = "" ;
      ucDvelop_confirmpanel_enter = new com.genexus.webpanels.GXUserControl();
      imgPrompt_fascod_gximage = "" ;
      sImgUrl = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.hojaderuta__fases__default(),
         new Object[] {
             new Object[] {
            H029C2_A396EmprCod, H029C2_A13734MaqCDsc, H029C2_A602MaqCod, H029C2_A606MaqDsc, H029C2_n606MaqDsc
            }
            , new Object[] {
            H029C3_A457FasCod, H029C3_A396EmprCod, H029C3_A458FasCon, H029C3_n458FasCon, H029C3_A456FasActTin, H029C3_n456FasActTin, H029C3_A4903FasAcab, H029C3_n4903FasAcab, H029C3_A4286FasForMul, H029C3_n4286FasForMul
            }
         }
      );
      AV58Pgmname = "PedidosClienteSinDetalle.HojadeRuta__Fases" ;
      /* GeneXus formulas. */
      AV58Pgmname = "PedidosClienteSinDetalle.HojadeRuta__Fases" ;
      Gx_err = (short)(0) ;
      edtavProcod_Enabled = 0 ;
      edtavProdsc_Enabled = 0 ;
      edtavFasdsc_Enabled = 0 ;
      edtavBarfas_Enabled = 0 ;
      edtavErrmensaje_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      imgPrompt_fascod_Link = "javascript:"+"gx.popup.openPrompt('"+"app.tfasproprompt"+"',["+"{Ctrl:gx.dom.el('"+"vEMPRCOD"+"'), id:'"+"vEMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFASCOD"+"'), id:'"+"vFASCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"T(460,2)"+"'), id:'"+"T(460,2)"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      WebComp_Wchojaderuta__fases_wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV23BarCodReo ;
   private byte wcpOAV30BarExt ;
   private byte wcpOAV32BarSit ;
   private byte NV19BarFasEst ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV23BarCodReo ;
   private byte AV30BarExt ;
   private byte AV32BarSit ;
   private byte gxajaxcallmode ;
   private byte AV19BarFasEst ;
   private byte AV46barfas ;
   private byte nDonePA ;
   private byte GXv_int8[] ;
   private byte GXv_int12[] ;
   private byte nGXWrapped ;
   private short wcpOAV35Barpes ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short NV15BarHorIni ;
   private short NV16Barhorfin ;
   private short AV35Barpes ;
   private short AV50Planing ;
   private short AV52BarFasEstIN ;
   private short wbEnd ;
   private short wbStart ;
   private short AV5BarOrdLin ;
   private short AV15BarHorIni ;
   private short AV16Barhorfin ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short GXv_int16[] ;
   private short GXv_int6[] ;
   private short GXt_int5 ;
   private short GXv_int17[] ;
   private int wcpOAV22BarCod ;
   private int wcpOAV31Discod ;
   private int wcpOAV33Clicod ;
   private int wcpOAV42barcolnum ;
   private int wcpOAV41Barpie ;
   private int AV22BarCod ;
   private int AV31Discod ;
   private int AV33Clicod ;
   private int AV42barcolnum ;
   private int AV41Barpie ;
   private int edtavProcod_Enabled ;
   private int edtavProdsc_Enabled ;
   private int edtavBarordlin_Enabled ;
   private int edtavFasdsc_Enabled ;
   private int edtavBarfecini_Enabled ;
   private int edtavBarfecrea_Enabled ;
   private int edtavBarhorini_Enabled ;
   private int edtavBarhorfin_Enabled ;
   private int edtavBarfas_Enabled ;
   private int edtavErrmensaje_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavMaqcodbis_Visible ;
   private int edtavMaqcodbis_Enabled ;
   private int GXv_int7[] ;
   private int edtavFascod_Enabled ;
   private int idxLst ;
   private java.math.BigDecimal wcpOAV40BarKgm ;
   private java.math.BigDecimal wcpOAV39Barmtr ;
   private java.math.BigDecimal NV17BarTieteo ;
   private java.math.BigDecimal AV40BarKgm ;
   private java.math.BigDecimal AV39Barmtr ;
   private java.math.BigDecimal AV17BarTieteo ;
   private java.math.BigDecimal AV47Baruni ;
   private java.math.BigDecimal GXv_decimal18[] ;
   private java.math.BigDecimal GXv_decimal19[] ;
   private String wcpOAV21EmprCod ;
   private String wcpOAV24BarCodPar ;
   private String wcpOAV25ProCod ;
   private String wcpOAV26ProDsc ;
   private String wcpOAV34Barunimed ;
   private String wcpOAV45barser ;
   private String wcpOAV44PedidoCliente ;
   private String wcpOAV43barcolnom ;
   private String wcpOAV38CliNom ;
   private String wcpOAV37BarSerDsc ;
   private String wcpOAV36BarAgrest ;
   private String Dvelop_confirmpanel_enter_Result ;
   private String Combo_maqcodbis_Selectedvalue_get ;
   private String NV9BarFascon ;
   private String NV11Barfasacab ;
   private String NV10Barfactin ;
   private String NV18MaqCodBis ;
   private String NV12BarFasfor ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV21EmprCod ;
   private String AV24BarCodPar ;
   private String AV25ProCod ;
   private String AV26ProDsc ;
   private String AV34Barunimed ;
   private String AV45barser ;
   private String AV44PedidoCliente ;
   private String AV43barcolnom ;
   private String AV38CliNom ;
   private String AV37BarSerDsc ;
   private String AV36BarAgrest ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV58Pgmname ;
   private String AV29UsurCod ;
   private String AV27Station ;
   private String AV55FascodIN ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String A458FasCon ;
   private String A456FasActTin ;
   private String A4903FasAcab ;
   private String A4286FasForMul ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Combo_maqcodbis_Cls ;
   private String Combo_maqcodbis_Selectedvalue_set ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
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
   private String divUnnamedtable8_Internalname ;
   private String edtavProcod_Internalname ;
   private String edtavProcod_Jsonclick ;
   private String edtavProdsc_Internalname ;
   private String edtavProdsc_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String edtavBarordlin_Internalname ;
   private String TempTags ;
   private String edtavBarordlin_Jsonclick ;
   private String divTablesplittedfascod_Internalname ;
   private String lblTextblockfascod_Internalname ;
   private String lblTextblockfascod_Jsonclick ;
   private String edtavFasdsc_Internalname ;
   private String AV54FasDsc ;
   private String edtavFasdsc_Jsonclick ;
   private String divTablesplittedmaqcodbis_Internalname ;
   private String lblTextblockcombo_maqcodbis_Internalname ;
   private String lblTextblockcombo_maqcodbis_Jsonclick ;
   private String Combo_maqcodbis_Caption ;
   private String Combo_maqcodbis_Internalname ;
   private String AV9BarFascon ;
   private String AV10Barfactin ;
   private String AV11Barfasacab ;
   private String AV12BarFasfor ;
   private String divUnnamedtable6_Internalname ;
   private String edtavBarfecini_Internalname ;
   private String edtavBarfecini_Jsonclick ;
   private String edtavBarfecrea_Internalname ;
   private String edtavBarfecrea_Jsonclick ;
   private String edtavBarhorini_Internalname ;
   private String edtavBarhorini_Jsonclick ;
   private String edtavBarhorfin_Internalname ;
   private String edtavBarhorfin_Jsonclick ;
   private String edtavBarfas_Internalname ;
   private String edtavBarfas_Jsonclick ;
   private String divUnnamedtable7_Internalname ;
   private String edtavErrmensaje_Internalname ;
   private String edtavErrmensaje_Jsonclick ;
   private String lblTbmessage_Internalname ;
   private String lblTbmessage_Caption ;
   private String lblTbmessage_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String WebComp_Wchojaderuta__fases_wc_Component ;
   private String OldWchojaderuta__fases_wc ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavMaqcodbis_Internalname ;
   private String AV18MaqCodBis ;
   private String edtavMaqcodbis_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String imgPrompt_fascod_Link ;
   private String imgPrompt_fascod_Internalname ;
   private String AV6Fascod ;
   private String edtavFascod_Internalname ;
   private String hsh ;
   private String AV28EmprNom ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String GXv_char20[] ;
   private String GXv_char13[] ;
   private String GXv_char11[] ;
   private String GXv_char10[] ;
   private String GXv_char9[] ;
   private String GXv_char4[] ;
   private String GXt_char1 ;
   private String GXv_char21[] ;
   private String sStyleString ;
   private String tblTabledvelop_confirmpanel_enter_Internalname ;
   private String Dvelop_confirmpanel_enter_Internalname ;
   private String tblTablemergedfascod_Internalname ;
   private String edtavFascod_Jsonclick ;
   private String imgPrompt_fascod_gximage ;
   private String sImgUrl ;
   private java.util.Date NV13BarFecIni ;
   private java.util.Date NV14Barfecrea ;
   private java.util.Date AV48Barfecrini ;
   private java.util.Date AV13BarFecIni ;
   private java.util.Date AV14Barfecrea ;
   private java.util.Date GXv_date15[] ;
   private java.util.Date GXv_date14[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Combo_maqcodbis_Enabled ;
   private boolean Combo_maqcodbis_Emptyitem ;
   private boolean Dvpanel_unnamedtable2_Autowidth ;
   private boolean Dvpanel_unnamedtable2_Autoheight ;
   private boolean Dvpanel_unnamedtable2_Collapsible ;
   private boolean Dvpanel_unnamedtable2_Collapsed ;
   private boolean Dvpanel_unnamedtable2_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable2_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean bDynCreated_Wchojaderuta__fases_wc ;
   private boolean n606MaqDsc ;
   private boolean n458FasCon ;
   private boolean n456FasActTin ;
   private boolean n4903FasAcab ;
   private boolean n4286FasForMul ;
   private String AV49Errmensaje ;
   private String AV51Inc_obs ;
   private String A13734MaqCDsc ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wchojaderuta__fases_wc ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucCombo_maqcodbis ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_enter ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavBarfasest ;
   private HTMLChoice cmbavBarfascon ;
   private HTMLChoice cmbavBarfactin ;
   private HTMLChoice cmbavBarfasacab ;
   private HTMLChoice cmbavBarfasfor ;
   private IDataStoreProvider pr_default ;
   private String[] H029C2_A396EmprCod ;
   private String[] H029C2_A13734MaqCDsc ;
   private String[] H029C2_A602MaqCod ;
   private String[] H029C2_A606MaqDsc ;
   private boolean[] H029C2_n606MaqDsc ;
   private String[] H029C3_A457FasCod ;
   private String[] H029C3_A396EmprCod ;
   private String[] H029C3_A458FasCon ;
   private boolean[] H029C3_n458FasCon ;
   private String[] H029C3_A456FasActTin ;
   private boolean[] H029C3_n456FasActTin ;
   private String[] H029C3_A4903FasAcab ;
   private boolean[] H029C3_n4903FasAcab ;
   private String[] H029C3_A4286FasForMul ;
   private boolean[] H029C3_n4286FasForMul ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV20MaqCodBis_Data ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV8Combo_DataItem ;
}

final  class hojaderuta__fases__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H029C2", "SELECT EmprCod, RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, MaqCod, MaqDsc FROM TXPMAQUIN ORDER BY MaqCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H029C3", "SELECT FasCod, EmprCod, FasCon, FasActTin, FasAcab, FasForMul FROM TXPFASPRO WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
      }
   }

}

