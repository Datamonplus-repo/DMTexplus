package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttproducgeneral_impl extends GXWebComponent
{
   public ttproducgeneral_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttproducgeneral_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttproducgeneral_impl.class ));
   }

   public ttproducgeneral_impl( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void setPrefix( String sPPrefix )
   {
      sPrefix = sPPrefix;
   }

   protected void createObjects( )
   {
      dynPrdUMeFo = new HTMLChoice();
      chkPrdLoteOb = UIFactory.getCheckbox(this);
      dynPrdUniCom = new HTMLChoice();
      dynPrdUniCon = new HTMLChoice();
      dynValCod = new HTMLChoice();
      cmbPrdRec = new HTMLChoice();
      cmbPrdCalNec = new HTMLChoice();
      cmbPrdDetPar = new HTMLChoice();
      cmbPrdTip = new HTMLChoice();
      chkPrdSalM = UIFactory.getCheckbox(this);
      chkPrdSal = UIFactory.getCheckbox(this);
      chkPrdPesCon = UIFactory.getCheckbox(this);
      cmbPrdFT = new HTMLChoice();
      cmbPrdHS = new HTMLChoice();
      cmbPrdReach = new HTMLChoice();
      cmbPrdOkotex = new HTMLChoice();
      cmbPrdZDHC = new HTMLChoice();
      cmbPrdList = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
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
            else if ( GXutil.strcmp(gxfirstwebparm, "dyncomponent") == 0 )
            {
               httpContext.setAjaxEventMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               nDynComponent = (byte)(1) ;
               sCompPrefix = httpContext.GetPar( "sCompPrefix") ;
               sSFPrefix = httpContext.GetPar( "sSFPrefix") ;
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A719PrdNum = httpContext.GetPar( "PrdNum") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A719PrdNum", A719PrdNum);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,A396EmprCod,A719PrdNum});
               componentstart();
               httpContext.ajax_rspStartCmp(sPrefix);
               componentdraw();
               httpContext.ajax_rspEndCmp();
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"TIPPRDCOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A13777TipPrdCDsc = httpContext.GetPar( "TipPrdCDsc") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgatipprdcodVC0( A396EmprCod, A13777TipPrdCDsc) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"PRVNUM") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A13719PrvNNom = httpContext.GetPar( "PrvNNom") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgaprvnumVC0( A396EmprCod, A13719PrvNNom) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"PRDFABID") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A13776PrdFabIDNm = httpContext.GetPar( "PrdFabIDNm") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgaprdfabidVC0( A396EmprCod, A13776PrdFabIDNm) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"TIPDTOCOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A13774TipDtoCDsc = httpContext.GetPar( "TipDtoCDsc") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgatipdtocodVC0( A396EmprCod, A13774TipDtoCDsc) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"METCOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A13778MetCDsc = httpContext.GetPar( "MetCDsc") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgametcodVC0( A396EmprCod, A13778MetCDsc) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"TIPPRDCOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A13777TipPrdCDsc = httpContext.GetPar( "TipPrdCDsc") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgatipprdcodVC0( A396EmprCod, A13777TipPrdCDsc) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"TIPPRDCOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               h6301TipPrdCod = httpContext.GetPar( "h6301TipPrdCod") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxhcatipprdcodVC2( A396EmprCod, h6301TipPrdCod) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"PRVNUM") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A13719PrvNNom = httpContext.GetPar( "PrvNNom") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgaprvnumVC0( A396EmprCod, A13719PrvNNom) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"PRVNUM") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               h795PrvNum = httpContext.GetPar( "h795PrvNum") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxhcaprvnumVC2( A396EmprCod, h795PrvNum) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"PRDFABID") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A13776PrdFabIDNm = httpContext.GetPar( "PrdFabIDNm") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgaprdfabidVC0( A396EmprCod, A13776PrdFabIDNm) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"PRDFABID") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               h12714PrdFabId = httpContext.GetPar( "h12714PrdFabId") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxhcaprdfabidVC2( A396EmprCod, h12714PrdFabId) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"TIPDTOCOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A13774TipDtoCDsc = httpContext.GetPar( "TipDtoCDsc") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgatipdtocodVC0( A396EmprCod, A13774TipDtoCDsc) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"TIPDTOCOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               h835TipDtoCod = httpContext.GetPar( "h835TipDtoCod") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxhcatipdtocodVC2( A396EmprCod, h835TipDtoCod) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"METCOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A13778MetCDsc = httpContext.GetPar( "MetCDsc") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgametcodVC0( A396EmprCod, A13778MetCDsc) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"METCOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               h629MetCod = httpContext.GetPar( "h629MetCod") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxhcametcodVC2( A396EmprCod, h629MetCod) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"PRDUMEFO") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxdlaprdumefoVC2( A396EmprCod) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"PRDUNICOM") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxdlaprdunicomVC2( A396EmprCod) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"PRDUNICON") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxdlaprduniconVC2( A396EmprCod) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"VALCOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxdlavalcodVC2( A396EmprCod) ;
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
            if ( toggleJsOutput )
            {
               if ( httpContext.isSpaRequest( ) )
               {
                  httpContext.enableJsOutput();
               }
            }
         }
      }
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isLocalStorageSupported( ) )
         {
            httpContext.pushCurrentUrl();
         }
      }
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         paVC2( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            validateSpaRequest();
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( ! isAjaxCallMode( ) )
            {
               if ( nDynComponent == 0 )
               {
                  httpContext.sendError( 404 );
                  GXutil.writeLog("send_http_error_code 404");
                  GxWebError = (byte)(1) ;
               }
            }
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            if ( nDynComponent == 0 )
            {
               throw new RuntimeException("WebComponent is not allowed to run");
            }
         }
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
      cleanup();
   }

   public void renderHtmlHeaders( )
   {
      app.GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), true);
   }

   public void renderHtmlOpenForm( )
   {
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
         httpContext.writeText( "<title>") ;
         httpContext.writeValue( httpContext.getMessage( "TTproduc General", "")) ;
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
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.closeHtmlHeader();
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
         FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"false\"" ;
         httpContext.writeText( "<body ") ;
         bodyStyle = "" ;
         if ( nGXWrapped == 0 )
         {
            bodyStyle += "-moz-opacity:0;opacity:0;" ;
         }
         httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
         httpContext.writeText( FormProcess+">") ;
         httpContext.skipLines( 1 );
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ttproducgeneral", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum))}, new String[] {"EmprCod","PrdNum"}) +"\">") ;
         app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
         app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
         app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
         httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, "FORM", "Class", "form-horizontal Form", true);
      }
      else
      {
         boolean toggleHtmlOutput = httpContext.isOutputEnabled( );
         if ( GXutil.strSearch( sPrefix, "MP", 1) == 1 )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.disableOutput();
            }
         }
         httpContext.writeText( "<div") ;
         app.GxWebStd.classAttribute( httpContext, "gxwebcomponent-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         if ( toggleHtmlOutput )
         {
            if ( GXutil.strSearch( sPrefix, "MP", 1) == 1 )
            {
               if ( httpContext.isSpaRequest( ) )
               {
                  httpContext.enableOutput();
               }
            }
         }
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
      }
      if ( GXutil.strSearch( sPrefix, "MP", 1) == 1 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
      }
   }

   public void send_integrity_footer_hashes( )
   {
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA396EmprCod", GXutil.rtrim( wcpOA396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA719PrdNum", GXutil.rtrim( wcpOA719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXHCTIPPRDCOD", GXutil.ltrim( localUtil.ntoc( A6301TipPrdCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXHCPRVNUM", GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXHCPRDFABID", GXutil.ltrim( localUtil.ntoc( A12714PrdFabId, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXHCTIPDTOCOD", GXutil.ltrim( localUtil.ntoc( A835TipDtoCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXHCMETCOD", GXutil.ltrim( localUtil.ntoc( A629MetCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Width", GXutil.rtrim( Dvpanel_transactiondetail_tableattributes_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Autowidth", GXutil.booltostr( Dvpanel_transactiondetail_tableattributes_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Autoheight", GXutil.booltostr( Dvpanel_transactiondetail_tableattributes_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Cls", GXutil.rtrim( Dvpanel_transactiondetail_tableattributes_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Title", GXutil.rtrim( Dvpanel_transactiondetail_tableattributes_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Collapsible", GXutil.booltostr( Dvpanel_transactiondetail_tableattributes_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Collapsed", GXutil.booltostr( Dvpanel_transactiondetail_tableattributes_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Showcollapseicon", GXutil.booltostr( Dvpanel_transactiondetail_tableattributes_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Iconposition", GXutil.rtrim( Dvpanel_transactiondetail_tableattributes_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Autoscroll", GXutil.booltostr( Dvpanel_transactiondetail_tableattributes_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Width", GXutil.rtrim( Dvpanel_unnamedtable1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable1_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable1_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Cls", GXutil.rtrim( Dvpanel_unnamedtable1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Title", GXutil.rtrim( Dvpanel_unnamedtable1_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable1_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable1_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable1_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE5_Width", GXutil.rtrim( Dvpanel_unnamedtable5_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE5_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable5_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE5_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable5_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE5_Cls", GXutil.rtrim( Dvpanel_unnamedtable5_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE5_Title", GXutil.rtrim( Dvpanel_unnamedtable5_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE5_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable5_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE5_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable5_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE5_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable5_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE5_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable5_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE5_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable5_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE6_Width", GXutil.rtrim( Dvpanel_unnamedtable6_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE6_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable6_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE6_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable6_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE6_Cls", GXutil.rtrim( Dvpanel_unnamedtable6_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE6_Title", GXutil.rtrim( Dvpanel_unnamedtable6_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE6_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable6_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE6_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable6_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE6_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable6_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE6_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable6_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE6_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable6_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE7_Width", GXutil.rtrim( Dvpanel_unnamedtable7_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE7_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable7_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE7_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable7_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE7_Cls", GXutil.rtrim( Dvpanel_unnamedtable7_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE7_Title", GXutil.rtrim( Dvpanel_unnamedtable7_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE7_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable7_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE7_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable7_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE7_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable7_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE7_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable7_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE7_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable7_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE8_Width", GXutil.rtrim( Dvpanel_unnamedtable8_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE8_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable8_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE8_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable8_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE8_Cls", GXutil.rtrim( Dvpanel_unnamedtable8_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE8_Title", GXutil.rtrim( Dvpanel_unnamedtable8_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE8_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable8_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE8_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable8_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE8_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable8_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE8_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable8_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE8_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable8_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE9_Width", GXutil.rtrim( Dvpanel_unnamedtable9_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE9_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable9_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE9_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable9_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE9_Cls", GXutil.rtrim( Dvpanel_unnamedtable9_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE9_Title", GXutil.rtrim( Dvpanel_unnamedtable9_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE9_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable9_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE9_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable9_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE9_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable9_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE9_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable9_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE9_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable9_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE10_Width", GXutil.rtrim( Dvpanel_unnamedtable10_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE10_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable10_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE10_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable10_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE10_Cls", GXutil.rtrim( Dvpanel_unnamedtable10_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE10_Title", GXutil.rtrim( Dvpanel_unnamedtable10_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE10_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable10_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE10_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable10_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE10_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable10_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE10_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable10_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE10_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable10_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXUITABSPANEL_TRANSACTIONDETAIL_TABCONTROL_Pagecount", GXutil.ltrim( localUtil.ntoc( Gxuitabspanel_transactiondetail_tabcontrol_Pagecount, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXUITABSPANEL_TRANSACTIONDETAIL_TABCONTROL_Class", GXutil.rtrim( Gxuitabspanel_transactiondetail_tabcontrol_Class));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXUITABSPANEL_TRANSACTIONDETAIL_TABCONTROL_Historymanagement", GXutil.booltostr( Gxuitabspanel_transactiondetail_tabcontrol_Historymanagement));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Width", GXutil.rtrim( Dvpanel_unnamedtable2_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable2_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable2_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Cls", GXutil.rtrim( Dvpanel_unnamedtable2_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Title", GXutil.rtrim( Dvpanel_unnamedtable2_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable2_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable2_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable2_Autoscroll));
   }

   public void renderHtmlCloseFormVC2( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) ) )
      {
         componentjscripts();
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GX_FocusControl", GX_FocusControl);
      define_styles( ) ;
      sendSecurityToken(sPrefix);
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.SendAjaxEncryptionKey();
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
         httpContext.writeTextNL( "</body>") ;
         httpContext.writeTextNL( "</html>") ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
      }
      else
      {
         httpContext.SendWebComponentState();
         httpContext.writeText( "</div>") ;
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
      }
   }

   public String getPgmname( )
   {
      return "TTproducGeneral" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TTproduc General", "") ;
   }

   public void wbVC0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         if ( GXutil.len( sPrefix) == 0 )
         {
            renderHtmlHeaders( ) ;
         }
         renderHtmlOpenForm( ) ;
         if ( GXutil.len( sPrefix) != 0 )
         {
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.ttproducgeneral");
            httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "", false, true);
            httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "", false, true);
            httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "", false, true);
            httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
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
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
         }
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), "", "", sPrefix, "false");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_tablemain_Internalname, 1, 0, "px", 0, "px", "TableMainTransaction", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_tablecontent_Internalname, 1, 0, "px", 0, "px", "TableContent", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_transactiondetail_tableattributes.setProperty("Width", Dvpanel_transactiondetail_tableattributes_Width);
         ucDvpanel_transactiondetail_tableattributes.setProperty("AutoWidth", Dvpanel_transactiondetail_tableattributes_Autowidth);
         ucDvpanel_transactiondetail_tableattributes.setProperty("AutoHeight", Dvpanel_transactiondetail_tableattributes_Autoheight);
         ucDvpanel_transactiondetail_tableattributes.setProperty("Cls", Dvpanel_transactiondetail_tableattributes_Cls);
         ucDvpanel_transactiondetail_tableattributes.setProperty("Title", Dvpanel_transactiondetail_tableattributes_Title);
         ucDvpanel_transactiondetail_tableattributes.setProperty("Collapsible", Dvpanel_transactiondetail_tableattributes_Collapsible);
         ucDvpanel_transactiondetail_tableattributes.setProperty("Collapsed", Dvpanel_transactiondetail_tableattributes_Collapsed);
         ucDvpanel_transactiondetail_tableattributes.setProperty("ShowCollapseIcon", Dvpanel_transactiondetail_tableattributes_Showcollapseicon);
         ucDvpanel_transactiondetail_tableattributes.setProperty("IconPosition", Dvpanel_transactiondetail_tableattributes_Iconposition);
         ucDvpanel_transactiondetail_tableattributes.setProperty("AutoScroll", Dvpanel_transactiondetail_tableattributes_Autoscroll);
         ucDvpanel_transactiondetail_tableattributes.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_transactiondetail_tableattributes_Internalname, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTESContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTESContainer"+"TransactionDetail_TableAttributes"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_tableattributes_Internalname, 1, 0, "px", 0, "px", "TableData", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdDisponi_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdDisponi_Internalname, httpContext.getMessage( "Disponible", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdDisponi_Internalname, GXutil.ltrim( localUtil.ntoc( A13831PrdDisponi, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdDisponi_Enabled!=0) ? localUtil.format( A13831PrdDisponi, "ZZZZZZ9.9999") : localUtil.format( A13831PrdDisponi, "ZZZZZZ9.9999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdDisponi_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdDisponi_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable25_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdNum_Internalname, httpContext.getMessage( "Producto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum), GXutil.rtrim( localUtil.format( A719PrdNum, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdNum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdNom_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom), GXutil.rtrim( localUtil.format( A718PrdNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", edtPrdNom_Link, "", "", "", edtPrdNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdNom_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTipPrdCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtTipPrdCod_Internalname, httpContext.getMessage( "Tipo Producto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtTipPrdCod_Internalname, h6301TipPrdCod, GXutil.rtrim( localUtil.format( h6301TipPrdCod, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipPrdCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTipPrdCod_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_TTproducGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable26_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNum2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdNum2_Internalname, httpContext.getMessage( "Producto Aux", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNum2_Internalname, GXutil.rtrim( A4693PrdNum2), GXutil.rtrim( localUtil.format( A4693PrdNum2, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNum2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdNum2_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNom2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdNom2_Internalname, httpContext.getMessage( "Descripcion (large)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNom2_Internalname, GXutil.rtrim( A4692PrdNom2), GXutil.rtrim( localUtil.format( A4692PrdNom2, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNom2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdNom2_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTproducGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable27_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvNum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrvNum_Internalname, httpContext.getMessage( "Proveedor", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrvNum_Internalname, h795PrvNum, GXutil.rtrim( localUtil.format( h795PrvNum, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvNum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvNum_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdRefPrv_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdRefPrv_Internalname, httpContext.getMessage( "Referencia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdRefPrv_Internalname, GXutil.rtrim( A728PrdRefPrv), GXutil.rtrim( localUtil.format( A728PrdRefPrv, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdRefPrv_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdRefPrv_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTproducGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable28_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdFabId_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdFabId_Internalname, httpContext.getMessage( "Fabricante", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdFabId_Internalname, h12714PrdFabId, GXutil.rtrim( localUtil.format( h12714PrdFabId, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdFabId_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdFabId_Enabled, 0, "text", "", 70, "chr", 1, "row", 70, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_TTproducGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable29_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+dynPrdUMeFo.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, dynPrdUMeFo.getInternalname(), httpContext.getMessage( "Und Formula", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, dynPrdUMeFo, dynPrdUMeFo.getInternalname(), GXutil.trim( GXutil.str( A4338PrdUMeFo, 1, 0)), 1, dynPrdUMeFo.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "int", "", 1, dynPrdUMeFo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TTproducGeneral.htm");
         dynPrdUMeFo.setValue( GXutil.trim( GXutil.str( A4338PrdUMeFo, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, dynPrdUMeFo.getInternalname(), "Values", dynPrdUMeFo.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdColIdx_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdColIdx_Internalname, httpContext.getMessage( "Color Index", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdColIdx_Internalname, GXutil.rtrim( A10119PrdColIdx), GXutil.rtrim( localUtil.format( A10119PrdColIdx, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdColIdx_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdColIdx_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTproducGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable30_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdLote_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdLote_Internalname, httpContext.getMessage( "Lote", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdLote_Internalname, GXutil.rtrim( A10881PrdLote), GXutil.rtrim( localUtil.format( A10881PrdLote, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdLote_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdLote_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPrdloteob_cell_Internalname, 1, 0, "px", 0, "px", divPrdloteob_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", chkPrdLoteOb.getVisible(), 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkPrdLoteOb.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkPrdLoteOb.getInternalname(), httpContext.getMessage( "Lote Obligatorio?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkPrdLoteOb.getInternalname(), A12957PrdLoteOb, "", httpContext.getMessage( "Lote Obligatorio?", ""), chkPrdLoteOb.getVisible(), chkPrdLoteOb.getEnabled(), "S", "", StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divSubfamcod_cell_Internalname, 1, 0, "px", 0, "px", divSubfamcod_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtSubFamCod_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSubFamCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtSubFamCod_Internalname, httpContext.getMessage( "Familia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtSubFamCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9609SubFamCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSubFamCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9609SubFamCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A9609SubFamCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSubFamCod_Jsonclick, 0, "AttributeFL", "", "", "", "", edtSubFamCod_Visible, edtSubFamCod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTproducGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable31_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+dynPrdUniCom.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, dynPrdUniCom.getInternalname(), httpContext.getMessage( "Und Compra", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, dynPrdUniCom, dynPrdUniCom.getInternalname(), GXutil.trim( GXutil.str( A742PrdUniCom, 1, 0)), 1, dynPrdUniCom.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "int", "", 1, dynPrdUniCom.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TTproducGeneral.htm");
         dynPrdUniCom.setValue( GXutil.trim( GXutil.str( A742PrdUniCom, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, dynPrdUniCom.getInternalname(), "Values", dynPrdUniCom.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+dynPrdUniCon.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, dynPrdUniCon.getInternalname(), httpContext.getMessage( "Und Consumo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, dynPrdUniCon, dynPrdUniCon.getInternalname(), GXutil.trim( GXutil.str( A743PrdUniCon, 1, 0)), 1, dynPrdUniCon.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "int", "", 1, dynPrdUniCon.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TTproducGeneral.htm");
         dynPrdUniCon.setValue( GXutil.trim( GXutil.str( A743PrdUniCon, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, dynPrdUniCon.getInternalname(), "Values", dynPrdUniCon.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdFacCon_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdFacCon_Internalname, httpContext.getMessage( "Factor Conversion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdFacCon_Internalname, GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdFacCon_Enabled!=0) ? localUtil.format( A707PrdFacCon, "Z9.9999") : localUtil.format( A707PrdFacCon, "Z9.9999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdFacCon_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdFacCon_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTproducGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable32_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+dynValCod.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, dynValCod.getInternalname(), httpContext.getMessage( "Validez", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, dynValCod, dynValCod.getInternalname(), GXutil.trim( GXutil.str( A856ValCod, 1, 0)), 1, dynValCod.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "int", "", 1, dynValCod.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TTproducGeneral.htm");
         dynValCod.setValue( GXutil.trim( GXutil.str( A856ValCod, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, dynValCod.getInternalname(), "Values", dynValCod.ToJavascriptSource(), true);
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable33_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdConct_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdConct_Internalname, httpContext.getMessage( "Concentracion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdConct_Internalname, GXutil.ltrim( localUtil.ntoc( A11470PrdConct, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdConct_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11470PrdConct), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11470PrdConct), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdConct_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdConct_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdRev_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdRev_Internalname, httpContext.getMessage( "Revision", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdRev_Internalname, GXutil.rtrim( A3004PrdRev), GXutil.rtrim( localUtil.format( A3004PrdRev, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdRev_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdRev_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbPrdRec.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbPrdRec.getInternalname(), httpContext.getMessage( "En recuento?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbPrdRec, cmbPrdRec.getInternalname(), GXutil.rtrim( A727PrdRec), 1, cmbPrdRec.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbPrdRec.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TTproducGeneral.htm");
         cmbPrdRec.setValue( GXutil.rtrim( A727PrdRec) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPrdRec.getInternalname(), "Values", cmbPrdRec.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdDqo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdDqo_Internalname, httpContext.getMessage( "DQO", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdDqo_Internalname, GXutil.ltrim( localUtil.ntoc( A1644PrdDqo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdDqo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1644PrdDqo), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1644PrdDqo), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdDqo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdDqo_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTproducGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable34_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbPrdCalNec.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbPrdCalNec.getInternalname(), httpContext.getMessage( "Calculo Necesidades", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbPrdCalNec, cmbPrdCalNec.getInternalname(), GXutil.rtrim( A682PrdCalNec), 1, cmbPrdCalNec.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbPrdCalNec.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TTproducGeneral.htm");
         cmbPrdCalNec.setValue( GXutil.rtrim( A682PrdCalNec) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPrdCalNec.getInternalname(), "Values", cmbPrdCalNec.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbPrdDetPar.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbPrdDetPar.getInternalname(), httpContext.getMessage( "Detalle Partidas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbPrdDetPar, cmbPrdDetPar.getInternalname(), GXutil.rtrim( A698PrdDetPar), 1, cmbPrdDetPar.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbPrdDetPar.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TTproducGeneral.htm");
         cmbPrdDetPar.setValue( GXutil.rtrim( A698PrdDetPar) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPrdDetPar.getInternalname(), "Values", cmbPrdDetPar.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTipDtoCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtTipDtoCod_Internalname, httpContext.getMessage( "Tipo Descuento", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtTipDtoCod_Internalname, h835TipDtoCod, GXutil.rtrim( localUtil.format( h835TipDtoCod, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipDtoCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTipDtoCod_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_TTproducGeneral.htm");
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
         ucDvpanel_unnamedtable1.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable1_Internalname, sPrefix+"DVPANEL_UNNAMEDTABLE1Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_UNNAMEDTABLE1Container"+"UnnamedTable1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable23_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdExiAlm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdExiAlm_Internalname, httpContext.getMessage( "Existencias Almacen", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdExiAlm_Internalname, GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdExiAlm_Enabled!=0) ? localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999") : localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdExiAlm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdExiAlm_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdExiAlmc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdExiAlmc_Internalname, httpContext.getMessage( "Existencias Consigna", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdExiAlmc_Internalname, GXutil.ltrim( localUtil.ntoc( A8659PrdExiAlmc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdExiAlmc_Enabled!=0) ? localUtil.format( A8659PrdExiAlmc, "ZZZZZZ9.9999") : localUtil.format( A8659PrdExiAlmc, "ZZZZZZ9.9999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdExiAlmc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdExiAlmc_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdCanRes_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdCanRes_Internalname, httpContext.getMessage( "Cant Reservada", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdCanRes_Internalname, GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdCanRes_Enabled!=0) ? localUtil.format( A685PrdCanRes, "ZZZZZZ9.9999") : localUtil.format( A685PrdCanRes, "ZZZZZZ9.9999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdCanRes_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdCanRes_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdCanPen_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdCanPen_Internalname, httpContext.getMessage( "Cant Pendiente Recep", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdCanPen_Internalname, GXutil.ltrim( localUtil.ntoc( A684PrdCanPen, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdCanPen_Enabled!=0) ? localUtil.format( A684PrdCanPen, "ZZZZZZ9.9999") : localUtil.format( A684PrdCanPen, "ZZZZZZ9.9999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdCanPen_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdCanPen_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTproducGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable24_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdExiCC_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdExiCC_Internalname, httpContext.getMessage( "Cuarto Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdExiCC_Internalname, GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdExiCC_Enabled!=0) ? localUtil.format( A705PrdExiCC, "ZZZZZZ9.9999") : localUtil.format( A705PrdExiCC, "ZZZZZZ9.9999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdExiCC_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdExiCC_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdFulEnt_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdFulEnt_Internalname, httpContext.getMessage( "Fec Ult Ent", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtPrdFulEnt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdFulEnt_Internalname, localUtil.format(A713PrdFulEnt, "99/99/99"), localUtil.format( A713PrdFulEnt, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdFulEnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdFulEnt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtPrdFulEnt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPrdFulEnt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TTproducGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdFulPed_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdFulPed_Internalname, httpContext.getMessage( "Fec Ult Ped", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtPrdFulPed_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdFulPed_Internalname, localUtil.format(A714PrdFulPed, "99/99/99"), localUtil.format( A714PrdFulPed, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdFulPed_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdFulPed_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtPrdFulPed_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPrdFulPed_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TTproducGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
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
         ucDvpanel_unnamedtable2.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable2_Internalname, sPrefix+"DVPANEL_UNNAMEDTABLE2Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_UNNAMEDTABLE2Container"+"UnnamedTable2"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGxuitabspanel_transactiondetail_tabcontrol.setProperty("PageCount", Gxuitabspanel_transactiondetail_tabcontrol_Pagecount);
         ucGxuitabspanel_transactiondetail_tabcontrol.setProperty("Class", Gxuitabspanel_transactiondetail_tabcontrol_Class);
         ucGxuitabspanel_transactiondetail_tabcontrol.setProperty("HistoryManagement", Gxuitabspanel_transactiondetail_tabcontrol_Historymanagement);
         ucGxuitabspanel_transactiondetail_tabcontrol.render(context, "tab", Gxuitabspanel_transactiondetail_tabcontrol_Internalname, sPrefix+"GXUITABSPANEL_TRANSACTIONDETAIL_TABCONTROLContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TRANSACTIONDETAIL_TABCONTROLContainer"+"title1"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTabs1_title_Internalname, httpContext.getMessage( "Precios", ""), "", "", lblTabs1_title_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTproducGeneral.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Tabs1") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TRANSACTIONDETAIL_TABCONTROLContainer"+"panel1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable22_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdPreAct_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdPreAct_Internalname, httpContext.getMessage( "Precio Actual", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdPreAct_Internalname, GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdPreAct_Enabled!=0) ? localUtil.format( A724PrdPreAct, "ZZZZZZZ9.999") : localUtil.format( A724PrdPreAct, "ZZZZZZZ9.999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdPreAct_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdPreAct_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdPreAc2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdPreAc2_Internalname, httpContext.getMessage( "Precio (2)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdPreAc2_Internalname, GXutil.ltrim( localUtil.ntoc( A5255PrdPreAc2, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdPreAc2_Enabled!=0) ? localUtil.format( A5255PrdPreAc2, "ZZZZZZZ9.999") : localUtil.format( A5255PrdPreAc2, "ZZZZZZZ9.999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdPreAc2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdPreAc2_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdFecPre_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdFecPre_Internalname, httpContext.getMessage( "Fecha Ult Precio", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtPrdFecPre_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdFecPre_Internalname, localUtil.format(A709PrdFecPre, "99/99/99"), localUtil.format( A709PrdFecPre, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdFecPre_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdFecPre_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtPrdFecPre_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPrdFecPre_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TTproducGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdPreAnt_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdPreAnt_Internalname, httpContext.getMessage( "Precio Anterior", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdPreAnt_Internalname, GXutil.ltrim( localUtil.ntoc( A725PrdPreAnt, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdPreAnt_Enabled!=0) ? localUtil.format( A725PrdPreAnt, "ZZZZZZZ9.999") : localUtil.format( A725PrdPreAnt, "ZZZZZZZ9.999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdPreAnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdPreAnt_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPrdpremed_cell_Internalname, 1, 0, "px", 0, "px", divPrdpremed_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtPrdPreMed_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdPreMed_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdPreMed_Internalname, httpContext.getMessage( "Precio Medio", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdPreMed_Internalname, GXutil.ltrim( localUtil.ntoc( A726PrdPreMed, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdPreMed_Enabled!=0) ? localUtil.format( A726PrdPreMed, "ZZZZZZZ9.999") : localUtil.format( A726PrdPreMed, "ZZZZZZZ9.999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdPreMed_Jsonclick, 0, "AttributeFL", "", "", "", "", edtPrdPreMed_Visible, edtPrdPreMed_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TRANSACTIONDETAIL_TABCONTROLContainer"+"title2"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTabs2_title_Internalname, httpContext.getMessage( "Consumos", ""), "", "", lblTabs2_title_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTproducGeneral.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Tabs2") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TRANSACTIONDETAIL_TABCONTROLContainer"+"panel2"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable21_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdConDia_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdConDia_Internalname, httpContext.getMessage( "Consumo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdConDia_Internalname, GXutil.ltrim( localUtil.ntoc( A696PrdConDia, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdConDia_Enabled!=0) ? localUtil.format( A696PrdConDia, "ZZZ9.99") : localUtil.format( A696PrdConDia, "ZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdConDia_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdConDia_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdStkMinU_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdStkMinU_Internalname, httpContext.getMessage( "Stock Minimo (Und)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdStkMinU_Internalname, GXutil.ltrim( localUtil.ntoc( A732PrdStkMinU, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdStkMinU_Enabled!=0) ? localUtil.format( A732PrdStkMinU, "ZZZZ9.99") : localUtil.format( A732PrdStkMinU, "ZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdStkMinU_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdStkMinU_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdStkMinD_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdStkMinD_Internalname, httpContext.getMessage( "Stock Minimo (dias)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdStkMinD_Internalname, GXutil.ltrim( localUtil.ntoc( A731PrdStkMinD, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdStkMinD_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A731PrdStkMinD), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A731PrdStkMinD), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdStkMinD_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdStkMinD_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdDiaRot_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdDiaRot_Internalname, httpContext.getMessage( "Dias de Rotacion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdDiaRot_Internalname, GXutil.ltrim( localUtil.ntoc( A699PrdDiaRot, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdDiaRot_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A699PrdDiaRot), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A699PrdDiaRot), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdDiaRot_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdDiaRot_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdPlaEnt_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdPlaEnt_Internalname, httpContext.getMessage( "Plazo Entrega", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdPlaEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A722PrdPlaEnt, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdPlaEnt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A722PrdPlaEnt), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A722PrdPlaEnt), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdPlaEnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdPlaEnt_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMetCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMetCod_Internalname, httpContext.getMessage( "Metodo Pedido", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMetCod_Internalname, h629MetCod, GXutil.rtrim( localUtil.format( h629MetCod, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMetCod_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdLotMin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdLotMin_Internalname, httpContext.getMessage( "Lote Min /Multiplo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdLotMin_Internalname, GXutil.ltrim( localUtil.ntoc( A716PrdLotMin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdLotMin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A716PrdLotMin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A716PrdLotMin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdLotMin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdLotMin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNumUco_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdNumUco_Internalname, httpContext.getMessage( "Unidades por Contenedor", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNumUco_Internalname, GXutil.ltrim( localUtil.ntoc( A721PrdNumUco, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdNumUco_Enabled!=0) ? localUtil.format( A721PrdNumUco, "ZZZ9.99") : localUtil.format( A721PrdNumUco, "ZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNumUco_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdNumUco_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TRANSACTIONDETAIL_TABCONTROLContainer"+"title3"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTabs3_title_Internalname, httpContext.getMessage( "Otros", ""), "", "", lblTabs3_title_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTproducGeneral.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Tabs3") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TRANSACTIONDETAIL_TABCONTROLContainer"+"panel3"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable12_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable13_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdPosX_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdPosX_Internalname, httpContext.getMessage( "Estante", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdPosX_Internalname, GXutil.ltrim( localUtil.ntoc( A1193PrdPosX, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdPosX_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1193PrdPosX), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1193PrdPosX), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdPosX_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdPosX_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdPosY_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdPosY_Internalname, httpContext.getMessage( "Posicion en el estante", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdPosY_Internalname, GXutil.ltrim( localUtil.ntoc( A1194PrdPosY, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdPosY_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1194PrdPosY), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A1194PrdPosY), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdPosY_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdPosY_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbPrdTip.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbPrdTip.getInternalname(), httpContext.getMessage( "Tipo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbPrdTip, cmbPrdTip.getInternalname(), GXutil.rtrim( A1643PrdTip), 1, cmbPrdTip.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbPrdTip.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TTproducGeneral.htm");
         cmbPrdTip.setValue( GXutil.rtrim( A1643PrdTip) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPrdTip.getInternalname(), "Values", cmbPrdTip.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdTnq_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdTnq_Internalname, httpContext.getMessage( "Tanque", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdTnq_Internalname, GXutil.ltrim( localUtil.ntoc( A3273PrdTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdTnq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3273PrdTnq), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3273PrdTnq), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdTnq_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdTnq_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTproducGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable14_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdSolub_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdSolub_Internalname, httpContext.getMessage( "Solubilidad /gr/l)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdSolub_Internalname, GXutil.ltrim( localUtil.ntoc( A5590PrdSolub, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdSolub_Enabled!=0) ? localUtil.format( A5590PrdSolub, "ZZZ9.99") : localUtil.format( A5590PrdSolub, "ZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdSolub_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdSolub_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNumCent_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdNumCent_Internalname, httpContext.getMessage( "C. Centra", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNumCent_Internalname, GXutil.rtrim( A6191PrdNumCent), GXutil.rtrim( localUtil.format( A6191PrdNumCent, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNumCent_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdNumCent_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdHorMad_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdHorMad_Internalname, httpContext.getMessage( "Horas Maduracion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdHorMad_Internalname, GXutil.ltrim( localUtil.ntoc( A7260PrdHorMad, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdHorMad_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7260PrdHorMad), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A7260PrdHorMad), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdHorMad_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdHorMad_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTproducGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable15_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup20_Internalname, httpContext.getMessage( "Sal", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_TTproducGeneral.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable19_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkPrdSalM.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkPrdSalM.getInternalname(), httpContext.getMessage( "Sal Muera", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkPrdSalM.getInternalname(), A5418PrdSalM, "", httpContext.getMessage( "Sal Muera", ""), 1, chkPrdSalM.getEnabled(), "S", "", StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkPrdSal.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkPrdSal.getInternalname(), httpContext.getMessage( "Sal Comun", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkPrdSal.getInternalname(), A8936PrdSal, "", httpContext.getMessage( "Sal Comun", ""), 1, chkPrdSal.getEnabled(), "S", "", StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdDensS_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdDensS_Internalname, httpContext.getMessage( "Densidad Sal Muera (g/l)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdDensS_Internalname, GXutil.ltrim( localUtil.ntoc( A5416PrdDensS, (byte)(7), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdDensS_Enabled!=0) ? localUtil.format( A5416PrdDensS, "ZZ9.999") : localUtil.format( A5416PrdDensS, "ZZ9.999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdDensS_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdDensS_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdConcS_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdConcS_Internalname, httpContext.getMessage( "Conentracion Sal Muera (g/l)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdConcS_Internalname, GXutil.ltrim( localUtil.ntoc( A5417PrdConcS, (byte)(7), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdConcS_Enabled!=0) ? localUtil.format( A5417PrdConcS, "ZZ9.999") : localUtil.format( A5417PrdConcS, "ZZ9.999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdConcS_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdConcS_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable16_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup18_Internalname, httpContext.getMessage( "Reactivos", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_TTproducGeneral.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable17_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNumct1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdNumct1_Internalname, httpContext.getMessage( "Ctc %", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNumct1_Internalname, GXutil.ltrim( localUtil.ntoc( A7226PrdNumct1, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdNumct1_Enabled!=0) ? localUtil.format( A7226PrdNumct1, "ZZ9.99") : localUtil.format( A7226PrdNumct1, "ZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNumct1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdNumct1_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNumct2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdNumct2_Internalname, httpContext.getMessage( "Ctc 2 %", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNumct2_Internalname, GXutil.ltrim( localUtil.ntoc( A7227PrdNumct2, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdNumct2_Enabled!=0) ? localUtil.format( A7227PrdNumct2, "ZZ9.99") : localUtil.format( A7227PrdNumct2, "ZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNumct2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdNumct2_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TRANSACTIONDETAIL_TABCONTROLContainer"+"title4"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTabs4_title_Internalname, httpContext.getMessage( "Pesaje", ""), "", "", lblTabs4_title_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTproducGeneral.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Tabs4") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TRANSACTIONDETAIL_TABCONTROLContainer"+"panel4"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable11_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkPrdPesCon.getInternalname()+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkPrdPesCon.getInternalname(), GXutil.str( A8896PrdPesCon, 1, 0), "", "", 1, chkPrdPesCon.getEnabled(), "1", httpContext.getMessage( "Controlar", ""), StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdPesTerm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdPesTerm_Internalname, httpContext.getMessage( "Estación de Pesaje", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdPesTerm_Internalname, GXutil.rtrim( A8897PrdPesTerm), GXutil.rtrim( localUtil.format( A8897PrdPesTerm, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdPesTerm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdPesTerm_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TRANSACTIONDETAIL_TABCONTROLContainer"+"title5"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTabs5_title_Internalname, httpContext.getMessage( "Normas Seguridad Otros datos", ""), "", "", lblTabs5_title_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTproducGeneral.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Tabs5") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TRANSACTIONDETAIL_TABCONTROLContainer"+"panel5"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable5.setProperty("Width", Dvpanel_unnamedtable5_Width);
         ucDvpanel_unnamedtable5.setProperty("AutoWidth", Dvpanel_unnamedtable5_Autowidth);
         ucDvpanel_unnamedtable5.setProperty("AutoHeight", Dvpanel_unnamedtable5_Autoheight);
         ucDvpanel_unnamedtable5.setProperty("Cls", Dvpanel_unnamedtable5_Cls);
         ucDvpanel_unnamedtable5.setProperty("Title", Dvpanel_unnamedtable5_Title);
         ucDvpanel_unnamedtable5.setProperty("Collapsible", Dvpanel_unnamedtable5_Collapsible);
         ucDvpanel_unnamedtable5.setProperty("Collapsed", Dvpanel_unnamedtable5_Collapsed);
         ucDvpanel_unnamedtable5.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable5_Showcollapseicon);
         ucDvpanel_unnamedtable5.setProperty("IconPosition", Dvpanel_unnamedtable5_Iconposition);
         ucDvpanel_unnamedtable5.setProperty("AutoScroll", Dvpanel_unnamedtable5_Autoscroll);
         ucDvpanel_unnamedtable5.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable5_Internalname, sPrefix+"DVPANEL_UNNAMEDTABLE5Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_UNNAMEDTABLE5Container"+"UnnamedTable5"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPrdinc_cell_Internalname, 1, 0, "px", 0, "px", divPrdinc_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtPrdInc_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdInc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdInc_Internalname, httpContext.getMessage( "Incidencia?", ""), "col-sm-5 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-7 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdInc_Internalname, GXutil.rtrim( A9731PrdInc), GXutil.rtrim( localUtil.format( A9731PrdInc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdInc_Jsonclick, 0, "AttributeFL", "", "", "", "", edtPrdInc_Visible, edtPrdInc_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdComp_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdComp_Internalname, httpContext.getMessage( "Complejidad", ""), "col-sm-5 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-7 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdComp_Internalname, GXutil.rtrim( A9732PrdComp), GXutil.rtrim( localUtil.format( A9732PrdComp, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdComp_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdComp_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable6.setProperty("Width", Dvpanel_unnamedtable6_Width);
         ucDvpanel_unnamedtable6.setProperty("AutoWidth", Dvpanel_unnamedtable6_Autowidth);
         ucDvpanel_unnamedtable6.setProperty("AutoHeight", Dvpanel_unnamedtable6_Autoheight);
         ucDvpanel_unnamedtable6.setProperty("Cls", Dvpanel_unnamedtable6_Cls);
         ucDvpanel_unnamedtable6.setProperty("Title", Dvpanel_unnamedtable6_Title);
         ucDvpanel_unnamedtable6.setProperty("Collapsible", Dvpanel_unnamedtable6_Collapsible);
         ucDvpanel_unnamedtable6.setProperty("Collapsed", Dvpanel_unnamedtable6_Collapsed);
         ucDvpanel_unnamedtable6.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable6_Showcollapseicon);
         ucDvpanel_unnamedtable6.setProperty("IconPosition", Dvpanel_unnamedtable6_Iconposition);
         ucDvpanel_unnamedtable6.setProperty("AutoScroll", Dvpanel_unnamedtable6_Autoscroll);
         ucDvpanel_unnamedtable6.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable6_Internalname, sPrefix+"DVPANEL_UNNAMEDTABLE6Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_UNNAMEDTABLE6Container"+"UnnamedTable6"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbPrdFT.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbPrdFT.getInternalname(), httpContext.getMessage( "Ficha Tecnica?", ""), "col-sm-5 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-7 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbPrdFT, cmbPrdFT.getInternalname(), GXutil.rtrim( A9739PrdFT), 1, cmbPrdFT.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbPrdFT.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TTproducGeneral.htm");
         cmbPrdFT.setValue( GXutil.rtrim( A9739PrdFT) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPrdFT.getInternalname(), "Values", cmbPrdFT.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdFFT_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdFFT_Internalname, httpContext.getMessage( "Fecha", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtPrdFFT_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdFFT_Internalname, localUtil.format(A9740PrdFFT, "99/99/99"), localUtil.format( A9740PrdFFT, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdFFT_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdFFT_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtPrdFFT_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPrdFFT_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TTproducGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbPrdHS.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbPrdHS.getInternalname(), httpContext.getMessage( "Hoja Seguridad?", ""), "col-sm-5 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-7 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbPrdHS, cmbPrdHS.getInternalname(), GXutil.rtrim( A9741PrdHS), 1, cmbPrdHS.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbPrdHS.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TTproducGeneral.htm");
         cmbPrdHS.setValue( GXutil.rtrim( A9741PrdHS) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPrdHS.getInternalname(), "Values", cmbPrdHS.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdFHS_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdFHS_Internalname, httpContext.getMessage( "Fecha", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtPrdFHS_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdFHS_Internalname, localUtil.format(A9742PrdFHS, "99/99/99"), localUtil.format( A9742PrdFHS, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdFHS_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdFHS_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtPrdFHS_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPrdFHS_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TTproducGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 CellMarginTop", "left", "top", "", "", "div");
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
         ucDvpanel_unnamedtable7.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable7_Internalname, sPrefix+"DVPANEL_UNNAMEDTABLE7Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_UNNAMEDTABLE7Container"+"UnnamedTable7"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdAox_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdAox_Internalname, httpContext.getMessage( "AOX (adsorbable organic halogens)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdAox_Internalname, GXutil.ltrim( localUtil.ntoc( A9733PrdAox, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdAox_Enabled!=0) ? localUtil.format( A9733PrdAox, "ZZ9.99") : localUtil.format( A9733PrdAox, "ZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdAox_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdAox_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbPrdReach.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbPrdReach.getInternalname(), httpContext.getMessage( "REACH", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbPrdReach, cmbPrdReach.getInternalname(), GXutil.rtrim( A5887PrdReach), 1, cmbPrdReach.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbPrdReach.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TTproducGeneral.htm");
         cmbPrdReach.setValue( GXutil.rtrim( A5887PrdReach) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPrdReach.getInternalname(), "Values", cmbPrdReach.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbPrdOkotex.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbPrdOkotex.getInternalname(), httpContext.getMessage( "OEKO-TEX", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbPrdOkotex, cmbPrdOkotex.getInternalname(), GXutil.rtrim( A5888PrdOkotex), 1, cmbPrdOkotex.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbPrdOkotex.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TTproducGeneral.htm");
         cmbPrdOkotex.setValue( GXutil.rtrim( A5888PrdOkotex) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPrdOkotex.getInternalname(), "Values", cmbPrdOkotex.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdGots_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdGots_Internalname, httpContext.getMessage( "GOTS", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdGots_Internalname, GXutil.rtrim( A11363PrdGots), GXutil.rtrim( localUtil.format( A11363PrdGots, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdGots_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdGots_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdHm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdHm_Internalname, httpContext.getMessage( "HM", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdHm_Internalname, GXutil.rtrim( A11364PrdHm), GXutil.rtrim( localUtil.format( A11364PrdHm, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdHm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdHm_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbPrdZDHC.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbPrdZDHC.getInternalname(), httpContext.getMessage( "ZDHC", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbPrdZDHC, cmbPrdZDHC.getInternalname(), GXutil.rtrim( A13301PrdZDHC), 1, cmbPrdZDHC.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbPrdZDHC.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TTproducGeneral.htm");
         cmbPrdZDHC.setValue( GXutil.rtrim( A13301PrdZDHC) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPrdZDHC.getInternalname(), "Values", cmbPrdZDHC.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdTHELIST_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdTHELIST_Internalname, httpContext.getMessage( "THELIST", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdTHELIST_Internalname, GXutil.rtrim( A13302PrdTHELIST), GXutil.rtrim( localUtil.format( A13302PrdTHELIST, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdTHELIST_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdTHELIST_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPrdlist_cell_Internalname, 1, 0, "px", 0, "px", divPrdlist_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", cmbPrdList.getVisible(), 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbPrdList.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbPrdList.getInternalname(), httpContext.getMessage( "List by Inditex ", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbPrdList, cmbPrdList.getInternalname(), GXutil.rtrim( A11687PrdList), 1, cmbPrdList.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", cmbPrdList.getVisible(), cmbPrdList.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TTproducGeneral.htm");
         cmbPrdList.setValue( GXutil.rtrim( A11687PrdList) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPrdList.getInternalname(), "Values", cmbPrdList.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         ucDvpanel_unnamedtable8.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable8_Internalname, sPrefix+"DVPANEL_UNNAMEDTABLE8Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_UNNAMEDTABLE8Container"+"UnnamedTable8"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdCtw1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdCtw1_Internalname, httpContext.getMessage( "Formaldeido", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdCtw1_Internalname, GXutil.rtrim( A10936PrdCtw1), GXutil.rtrim( localUtil.format( A10936PrdCtw1, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdCtw1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdCtw1_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdCtw2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdCtw2_Internalname, httpContext.getMessage( "Airlaminas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdCtw2_Internalname, GXutil.rtrim( A10937PrdCtw2), GXutil.rtrim( localUtil.format( A10937PrdCtw2, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdCtw2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdCtw2_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdCtw3_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdCtw3_Internalname, httpContext.getMessage( "Apeo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdCtw3_Internalname, GXutil.rtrim( A10938PrdCtw3), GXutil.rtrim( localUtil.format( A10938PrdCtw3, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdCtw3_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdCtw3_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdCtw4_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdCtw4_Internalname, httpContext.getMessage( "PFC", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdCtw4_Internalname, GXutil.rtrim( A11663PrdCtw4), GXutil.rtrim( localUtil.format( A11663PrdCtw4, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdCtw4_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdCtw4_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTproducGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 CellMarginTop", "left", "top", "", "", "div");
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
         ucDvpanel_unnamedtable9.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable9_Internalname, sPrefix+"DVPANEL_UNNAMEDTABLE9Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_UNNAMEDTABLE9Container"+"UnnamedTable9"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable9_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdRTM_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdRTM_Internalname, httpContext.getMessage( "Manual RTM (Requirement Tracability Matrix)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdRTM_Internalname, GXutil.rtrim( A10935PrdRTM), GXutil.rtrim( localUtil.format( A10935PrdRTM, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdRTM_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdRTM_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdEINECS_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdEINECS_Internalname, httpContext.getMessage( "N EINECS", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdEINECS_Internalname, GXutil.rtrim( A11614PrdEINECS), GXutil.rtrim( localUtil.format( A11614PrdEINECS, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdEINECS_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdEINECS_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable10.setProperty("Width", Dvpanel_unnamedtable10_Width);
         ucDvpanel_unnamedtable10.setProperty("AutoWidth", Dvpanel_unnamedtable10_Autowidth);
         ucDvpanel_unnamedtable10.setProperty("AutoHeight", Dvpanel_unnamedtable10_Autoheight);
         ucDvpanel_unnamedtable10.setProperty("Cls", Dvpanel_unnamedtable10_Cls);
         ucDvpanel_unnamedtable10.setProperty("Title", Dvpanel_unnamedtable10_Title);
         ucDvpanel_unnamedtable10.setProperty("Collapsible", Dvpanel_unnamedtable10_Collapsible);
         ucDvpanel_unnamedtable10.setProperty("Collapsed", Dvpanel_unnamedtable10_Collapsed);
         ucDvpanel_unnamedtable10.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable10_Showcollapseicon);
         ucDvpanel_unnamedtable10.setProperty("IconPosition", Dvpanel_unnamedtable10_Iconposition);
         ucDvpanel_unnamedtable10.setProperty("AutoScroll", Dvpanel_unnamedtable10_Autoscroll);
         ucDvpanel_unnamedtable10.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable10_Internalname, sPrefix+"DVPANEL_UNNAMEDTABLE10Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_UNNAMEDTABLE10Container"+"UnnamedTable10"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable10_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdFuncion_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdFuncion_Internalname, httpContext.getMessage( "Funcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdFuncion_Internalname, GXutil.rtrim( A11615PrdFuncion), GXutil.rtrim( localUtil.format( A11615PrdFuncion, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdFuncion_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdFuncion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNmQu_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdNmQu_Internalname, httpContext.getMessage( "Nombre Substancia Quimica", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtPrdNmQu_Internalname, A11616PrdNmQu, "", "", (short)(0), 1, edtPrdNmQu_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNroCAS_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdNroCAS_Internalname, httpContext.getMessage( "Numero de CAS (Chemical Abstracts Service)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNroCAS_Internalname, GXutil.rtrim( A11196PrdNroCAS), GXutil.rtrim( localUtil.format( A11196PrdNroCAS, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNroCAS_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdNroCAS_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTproducGeneral.htm");
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
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TRANSACTIONDETAIL_TABCONTROLContainer"+"title6"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTabs6_title_Internalname, httpContext.getMessage( "Observaciones", ""), "", "", lblTabs6_title_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTproducGeneral.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Tabs6") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TRANSACTIONDETAIL_TABCONTROLContainer"+"panel6"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdObs_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdObs_Internalname, httpContext.getMessage( "Observaciones", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtPrdObs_Internalname, A4694PrdObs, "", "", (short)(0), 1, edtPrdObs_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "1024", -1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_TTproducGeneral.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 522,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", httpContext.getMessage( "GXM_update", ""), bttBtnupdate_Jsonclick, 7, httpContext.getMessage( "GXM_update", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e11vc1_client"+"'", TempTags, "", 2, "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 524,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterialDefault" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtndelete_Jsonclick, 7, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e12vc1_client"+"'", TempTags, "", 2, "HLP_TTproducGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void startVC2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            if ( httpContext.exposeMetadata( ) )
            {
               Form.getMeta().addItem("generator", "GeneXus Java 17_0_11-163677", (short)(0)) ;
            }
            Form.getMeta().addItem("description", httpContext.getMessage( "TTproduc General", ""), (short)(0)) ;
         }
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
         httpContext.wbHandled = (byte)(0) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            sXEvt = httpContext.cgiGet( "_EventName") ;
            if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
            {
            }
         }
      }
      wbErr = false ;
      if ( ( GXutil.len( sPrefix) == 0 ) || ( nDraw == 1 ) )
      {
         if ( nDoneStart == 0 )
         {
            strupVC0( ) ;
         }
      }
   }

   public void wsVC2( )
   {
      startVC2( ) ;
      evtVC2( ) ;
   }

   public void evtVC2( )
   {
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ( ( ( GXutil.len( sPrefix) == 0 ) ) || ( GXutil.strSearch( sXEvt, sPrefix, 1) > 0 ) ) && ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
            if ( httpContext.wbHandled == 0 )
            {
               if ( GXutil.len( sPrefix) == 0 )
               {
                  sEvt = httpContext.cgiGet( "_EventName") ;
                  EvtGridId = httpContext.cgiGet( "_EventGridId") ;
                  EvtRowId = httpContext.cgiGet( "_EventRowId") ;
               }
               if ( GXutil.len( sEvt) > 0 )
               {
                  sEvtType = GXutil.left( sEvt, 1) ;
                  sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-1) ;
                  if ( GXutil.strcmp(sEvtType, "E") == 0 )
                  {
                     sEvtType = GXutil.right( sEvt, 1) ;
                     if ( GXutil.strcmp(sEvtType, ".") == 0 )
                     {
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                        if ( GXutil.strcmp(sEvt, "RFR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupVC0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupVC0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e13VC2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupVC0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e14VC2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupVC0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    if ( ! Rfr0gs )
                                    {
                                    }
                                    dynload_actions( ) ;
                                 }
                              }
                           }
                           /* No code required for Cancel button. It is implemented as the Reset button. */
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupVC0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                              }
                           }
                           dynload_actions( ) ;
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
   }

   public void weVC2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormVC2( ) ;
         }
      }
   }

   public void paVC2( )
   {
      if ( nDonePA == 0 )
      {
         if ( GXutil.len( sPrefix) != 0 )
         {
            initialize_properties( ) ;
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
            {
               gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
            }
         }
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.disableJsOutput();
            }
         }
         init_web_controls( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( toggleJsOutput )
            {
               if ( httpContext.isSpaRequest( ) )
               {
                  httpContext.enableJsOutput();
               }
            }
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxsgatipprdcodVC0( String A396EmprCod ,
                                  String A13777TipPrdCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgatipprdcod_dataVC0( A396EmprCod, A13777TipPrdCDsc) ;
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

   protected void gxsgatipprdcod_dataVC0( String A396EmprCod ,
                                          String A13777TipPrdCDsc )
   {
      l13777TipPrdCDsc = GXutil.concat( GXutil.rtrim( A13777TipPrdCDsc), "%", "") ;
      /* Using cursor H00VC2 */
      pr_default.execute(0, new Object[] {A396EmprCod, l13777TipPrdCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(0) != 101) )
      {
         gxdynajaxctrlcodr.add(H00VC2_A13777TipPrdCDsc[0]);
         gxdynajaxctrldescr.add(H00VC2_A13777TipPrdCDsc[0]);
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxsgaprvnumVC0( String A396EmprCod ,
                               String A13719PrvNNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgaprvnum_dataVC0( A396EmprCod, A13719PrvNNom) ;
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

   protected void gxsgaprvnum_dataVC0( String A396EmprCod ,
                                       String A13719PrvNNom )
   {
      l13719PrvNNom = GXutil.concat( GXutil.rtrim( A13719PrvNNom), "%", "") ;
      /* Using cursor H00VC3 */
      pr_default.execute(1, new Object[] {A396EmprCod, l13719PrvNNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(1) != 101) )
      {
         gxdynajaxctrlcodr.add(H00VC3_A13719PrvNNom[0]);
         gxdynajaxctrldescr.add(H00VC3_A13719PrvNNom[0]);
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void gxsgaprdfabidVC0( String A396EmprCod ,
                                 String A13776PrdFabIDNm )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgaprdfabid_dataVC0( A396EmprCod, A13776PrdFabIDNm) ;
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

   protected void gxsgaprdfabid_dataVC0( String A396EmprCod ,
                                         String A13776PrdFabIDNm )
   {
      l13776PrdFabIDNm = GXutil.concat( GXutil.rtrim( A13776PrdFabIDNm), "%", "") ;
      /* Using cursor H00VC4 */
      pr_default.execute(2, new Object[] {A396EmprCod, l13776PrdFabIDNm});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(2) != 101) )
      {
         gxdynajaxctrlcodr.add(H00VC4_A13776PrdFabIDNm[0]);
         gxdynajaxctrldescr.add(H00VC4_A13776PrdFabIDNm[0]);
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void gxsgatipdtocodVC0( String A396EmprCod ,
                                  String A13774TipDtoCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgatipdtocod_dataVC0( A396EmprCod, A13774TipDtoCDsc) ;
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

   protected void gxsgatipdtocod_dataVC0( String A396EmprCod ,
                                          String A13774TipDtoCDsc )
   {
      l13774TipDtoCDsc = GXutil.concat( GXutil.rtrim( A13774TipDtoCDsc), "%", "") ;
      /* Using cursor H00VC5 */
      pr_default.execute(3, new Object[] {A396EmprCod, l13774TipDtoCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(3) != 101) )
      {
         gxdynajaxctrlcodr.add(H00VC5_A13774TipDtoCDsc[0]);
         gxdynajaxctrldescr.add(H00VC5_A13774TipDtoCDsc[0]);
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void gxsgametcodVC0( String A396EmprCod ,
                               String A13778MetCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgametcod_dataVC0( A396EmprCod, A13778MetCDsc) ;
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

   protected void gxsgametcod_dataVC0( String A396EmprCod ,
                                       String A13778MetCDsc )
   {
      l13778MetCDsc = GXutil.concat( GXutil.rtrim( A13778MetCDsc), "%", "") ;
      /* Using cursor H00VC6 */
      pr_default.execute(4, new Object[] {A396EmprCod, l13778MetCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(4) != 101) )
      {
         gxdynajaxctrlcodr.add(H00VC6_A13778MetCDsc[0]);
         gxdynajaxctrldescr.add(H00VC6_A13778MetCDsc[0]);
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void gxhcatipprdcodVC2( String A396EmprCod ,
                                  String A13777TipPrdCDsc )
   {
      /* Using cursor H00VC7 */
      pr_default.execute(5, new Object[] {A13777TipPrdCDsc, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(5) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13777TipPrdCDsc = H00VC7_A13777TipPrdCDsc[0] ;
         A396EmprCod = H00VC7_A396EmprCod[0] ;
         A6301TipPrdCod = H00VC7_A6301TipPrdCod[0] ;
         n6301TipPrdCod = H00VC7_n6301TipPrdCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6301TipPrdCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6301TipPrdCod), 4, 0));
         pr_default.readNext(5);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6301TipPrdCod, (byte)(4), (byte)(0), ".", "")))+"\"") ;
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
      pr_default.close(5);
   }

   public void gxhcaprvnumVC2( String A396EmprCod ,
                               String A13719PrvNNom )
   {
      /* Using cursor H00VC8 */
      pr_default.execute(6, new Object[] {A13719PrvNNom, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(6) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13719PrvNNom = H00VC8_A13719PrvNNom[0] ;
         A396EmprCod = H00VC8_A396EmprCod[0] ;
         A795PrvNum = H00VC8_A795PrvNum[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         pr_default.readNext(6);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), ".", "")))+"\"") ;
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
      pr_default.close(6);
   }

   public void gxhcaprdfabidVC2( String A396EmprCod ,
                                 String A13776PrdFabIDNm )
   {
      /* Using cursor H00VC9 */
      pr_default.execute(7, new Object[] {A13776PrdFabIDNm, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(7) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13776PrdFabIDNm = H00VC9_A13776PrdFabIDNm[0] ;
         A396EmprCod = H00VC9_A396EmprCod[0] ;
         A12714PrdFabId = H00VC9_A12714PrdFabId[0] ;
         n12714PrdFabId = H00VC9_n12714PrdFabId[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12714PrdFabId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12714PrdFabId), 6, 0));
         pr_default.readNext(7);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A12714PrdFabId, (byte)(6), (byte)(0), ".", "")))+"\"") ;
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
      pr_default.close(7);
   }

   public void gxhcatipdtocodVC2( String A396EmprCod ,
                                  String A13774TipDtoCDsc )
   {
      /* Using cursor H00VC10 */
      pr_default.execute(8, new Object[] {A13774TipDtoCDsc, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(8) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13774TipDtoCDsc = H00VC10_A13774TipDtoCDsc[0] ;
         A396EmprCod = H00VC10_A396EmprCod[0] ;
         A835TipDtoCod = H00VC10_A835TipDtoCod[0] ;
         n835TipDtoCod = H00VC10_n835TipDtoCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A835TipDtoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A835TipDtoCod), 2, 0));
         pr_default.readNext(8);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A835TipDtoCod, (byte)(2), (byte)(0), ".", "")))+"\"") ;
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
      pr_default.close(8);
   }

   public void gxhcametcodVC2( String A396EmprCod ,
                               String A13778MetCDsc )
   {
      /* Using cursor H00VC11 */
      pr_default.execute(9, new Object[] {A13778MetCDsc, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(9) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13778MetCDsc = H00VC11_A13778MetCDsc[0] ;
         A396EmprCod = H00VC11_A396EmprCod[0] ;
         A629MetCod = H00VC11_A629MetCod[0] ;
         n629MetCod = H00VC11_n629MetCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A629MetCod", GXutil.str( A629MetCod, 1, 0));
         pr_default.readNext(9);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A629MetCod, (byte)(1), (byte)(0), ".", "")))+"\"") ;
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
      pr_default.close(9);
   }

   public void gxdlaprdumefoVC2( String A396EmprCod )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxdlaprdumefo_dataVC2( A396EmprCod) ;
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

   public void gxaprdumefo_htmlVC2( String A396EmprCod )
   {
      byte gxdynajaxvalue;
      gxdlaprdumefo_dataVC2( A396EmprCod) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynPrdUMeFo.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = (byte)(GXutil.lval( gxdynajaxctrlcodr.item(gxdynajaxindex))) ;
         dynPrdUMeFo.addItem(GXutil.trim( GXutil.str( gxdynajaxvalue, 1, 0)), gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
      if ( dynPrdUMeFo.getItemCount() > 0 )
      {
         A4338PrdUMeFo = (byte)(GXutil.lval( dynPrdUMeFo.getValidValue(GXutil.trim( GXutil.str( A4338PrdUMeFo, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4338PrdUMeFo", GXutil.str( A4338PrdUMeFo, 1, 0));
      }
   }

   protected void gxdlaprdumefo_dataVC2( String A396EmprCod )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor H00VC12 */
      pr_default.execute(10, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(10) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.ltrim( localUtil.ntoc( H00VC12_A490ForPrdUMe[0], (byte)(1), (byte)(0), ".", "")));
         gxdynajaxctrldescr.add(GXutil.rtrim( H00VC12_A488ForPrdDsc[0]));
         pr_default.readNext(10);
      }
      pr_default.close(10);
   }

   public void gxdlaprdunicomVC2( String A396EmprCod )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxdlaprdunicom_dataVC2( A396EmprCod) ;
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

   public void gxaprdunicom_htmlVC2( String A396EmprCod )
   {
      byte gxdynajaxvalue;
      gxdlaprdunicom_dataVC2( A396EmprCod) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynPrdUniCom.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = (byte)(GXutil.lval( gxdynajaxctrlcodr.item(gxdynajaxindex))) ;
         dynPrdUniCom.addItem(GXutil.trim( GXutil.str( gxdynajaxvalue, 1, 0)), gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
      if ( dynPrdUniCom.getItemCount() > 0 )
      {
         A742PrdUniCom = (byte)(GXutil.lval( dynPrdUniCom.getValidValue(GXutil.trim( GXutil.str( A742PrdUniCom, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A742PrdUniCom", GXutil.str( A742PrdUniCom, 1, 0));
      }
   }

   protected void gxdlaprdunicom_dataVC2( String A396EmprCod )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor H00VC13 */
      pr_default.execute(11, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(11) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.ltrim( localUtil.ntoc( H00VC13_A742PrdUniCom[0], (byte)(1), (byte)(0), ".", "")));
         gxdynajaxctrldescr.add(GXutil.rtrim( H00VC13_A737PrdUcpDsc[0]));
         pr_default.readNext(11);
      }
      pr_default.close(11);
   }

   public void gxdlaprduniconVC2( String A396EmprCod )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxdlaprdunicon_dataVC2( A396EmprCod) ;
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

   public void gxaprdunicon_htmlVC2( String A396EmprCod )
   {
      byte gxdynajaxvalue;
      gxdlaprdunicon_dataVC2( A396EmprCod) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynPrdUniCon.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = (byte)(GXutil.lval( gxdynajaxctrlcodr.item(gxdynajaxindex))) ;
         dynPrdUniCon.addItem(GXutil.trim( GXutil.str( gxdynajaxvalue, 1, 0)), gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
      if ( dynPrdUniCon.getItemCount() > 0 )
      {
         A743PrdUniCon = (byte)(GXutil.lval( dynPrdUniCon.getValidValue(GXutil.trim( GXutil.str( A743PrdUniCon, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A743PrdUniCon", GXutil.str( A743PrdUniCon, 1, 0));
      }
   }

   protected void gxdlaprdunicon_dataVC2( String A396EmprCod )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor H00VC14 */
      pr_default.execute(12, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(12) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.ltrim( localUtil.ntoc( H00VC14_A743PrdUniCon[0], (byte)(1), (byte)(0), ".", "")));
         gxdynajaxctrldescr.add(GXutil.rtrim( H00VC14_A736PrdUcoDsc[0]));
         pr_default.readNext(12);
      }
      pr_default.close(12);
   }

   public void gxdlavalcodVC2( String A396EmprCod )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxdlavalcod_dataVC2( A396EmprCod) ;
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

   public void gxavalcod_htmlVC2( String A396EmprCod )
   {
      byte gxdynajaxvalue;
      gxdlavalcod_dataVC2( A396EmprCod) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynValCod.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = (byte)(GXutil.lval( gxdynajaxctrlcodr.item(gxdynajaxindex))) ;
         dynValCod.addItem(GXutil.trim( GXutil.str( gxdynajaxvalue, 1, 0)), gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
      if ( dynValCod.getItemCount() > 0 )
      {
         A856ValCod = (byte)(GXutil.lval( dynValCod.getValidValue(GXutil.trim( GXutil.str( A856ValCod, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
      }
   }

   protected void gxdlavalcod_dataVC2( String A396EmprCod )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor H00VC15 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(13) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.ltrim( localUtil.ntoc( H00VC15_A856ValCod[0], (byte)(1), (byte)(0), ".", "")));
         gxdynajaxctrldescr.add(GXutil.rtrim( H00VC15_A857ValDsc[0]));
         pr_default.readNext(13);
      }
      pr_default.close(13);
   }

   public void send_integrity_hashes( )
   {
   }

   public void clear_multi_value_controls( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         gxaprdumefo_htmlVC2( A396EmprCod) ;
         gxaprdunicom_htmlVC2( A396EmprCod) ;
         gxaprdunicon_htmlVC2( A396EmprCod) ;
         gxavalcod_htmlVC2( A396EmprCod) ;
         dynload_actions( ) ;
         before_start_formulas( ) ;
      }
   }

   public void fix_multi_value_controls( )
   {
      if ( dynPrdUMeFo.getItemCount() > 0 )
      {
         A4338PrdUMeFo = (byte)(GXutil.lval( dynPrdUMeFo.getValidValue(GXutil.trim( GXutil.str( A4338PrdUMeFo, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4338PrdUMeFo", GXutil.str( A4338PrdUMeFo, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynPrdUMeFo.setValue( GXutil.trim( GXutil.str( A4338PrdUMeFo, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, dynPrdUMeFo.getInternalname(), "Values", dynPrdUMeFo.ToJavascriptSource(), true);
      }
      A12957PrdLoteOb = ((GXutil.strcmp(GXutil.rtrim( A12957PrdLoteOb), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12957PrdLoteOb", A12957PrdLoteOb);
      if ( dynPrdUniCom.getItemCount() > 0 )
      {
         A742PrdUniCom = (byte)(GXutil.lval( dynPrdUniCom.getValidValue(GXutil.trim( GXutil.str( A742PrdUniCom, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A742PrdUniCom", GXutil.str( A742PrdUniCom, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynPrdUniCom.setValue( GXutil.trim( GXutil.str( A742PrdUniCom, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, dynPrdUniCom.getInternalname(), "Values", dynPrdUniCom.ToJavascriptSource(), true);
      }
      if ( dynPrdUniCon.getItemCount() > 0 )
      {
         A743PrdUniCon = (byte)(GXutil.lval( dynPrdUniCon.getValidValue(GXutil.trim( GXutil.str( A743PrdUniCon, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A743PrdUniCon", GXutil.str( A743PrdUniCon, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynPrdUniCon.setValue( GXutil.trim( GXutil.str( A743PrdUniCon, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, dynPrdUniCon.getInternalname(), "Values", dynPrdUniCon.ToJavascriptSource(), true);
      }
      if ( dynValCod.getItemCount() > 0 )
      {
         A856ValCod = (byte)(GXutil.lval( dynValCod.getValidValue(GXutil.trim( GXutil.str( A856ValCod, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynValCod.setValue( GXutil.trim( GXutil.str( A856ValCod, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, dynValCod.getInternalname(), "Values", dynValCod.ToJavascriptSource(), true);
      }
      if ( cmbPrdRec.getItemCount() > 0 )
      {
         A727PrdRec = cmbPrdRec.getValidValue(A727PrdRec) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A727PrdRec", A727PrdRec);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbPrdRec.setValue( GXutil.rtrim( A727PrdRec) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPrdRec.getInternalname(), "Values", cmbPrdRec.ToJavascriptSource(), true);
      }
      if ( cmbPrdCalNec.getItemCount() > 0 )
      {
         A682PrdCalNec = cmbPrdCalNec.getValidValue(A682PrdCalNec) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A682PrdCalNec", A682PrdCalNec);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbPrdCalNec.setValue( GXutil.rtrim( A682PrdCalNec) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPrdCalNec.getInternalname(), "Values", cmbPrdCalNec.ToJavascriptSource(), true);
      }
      if ( cmbPrdDetPar.getItemCount() > 0 )
      {
         A698PrdDetPar = cmbPrdDetPar.getValidValue(A698PrdDetPar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A698PrdDetPar", A698PrdDetPar);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbPrdDetPar.setValue( GXutil.rtrim( A698PrdDetPar) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPrdDetPar.getInternalname(), "Values", cmbPrdDetPar.ToJavascriptSource(), true);
      }
      if ( cmbPrdTip.getItemCount() > 0 )
      {
         A1643PrdTip = cmbPrdTip.getValidValue(A1643PrdTip) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1643PrdTip", A1643PrdTip);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbPrdTip.setValue( GXutil.rtrim( A1643PrdTip) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPrdTip.getInternalname(), "Values", cmbPrdTip.ToJavascriptSource(), true);
      }
      A5418PrdSalM = ((GXutil.strcmp(GXutil.rtrim( A5418PrdSalM), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5418PrdSalM", A5418PrdSalM);
      A8936PrdSal = ((GXutil.strcmp(GXutil.rtrim( A8936PrdSal), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8936PrdSal", A8936PrdSal);
      A8896PrdPesCon = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A8896PrdPesCon, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8896PrdPesCon", GXutil.str( A8896PrdPesCon, 1, 0));
      if ( cmbPrdFT.getItemCount() > 0 )
      {
         A9739PrdFT = cmbPrdFT.getValidValue(A9739PrdFT) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9739PrdFT", A9739PrdFT);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbPrdFT.setValue( GXutil.rtrim( A9739PrdFT) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPrdFT.getInternalname(), "Values", cmbPrdFT.ToJavascriptSource(), true);
      }
      if ( cmbPrdHS.getItemCount() > 0 )
      {
         A9741PrdHS = cmbPrdHS.getValidValue(A9741PrdHS) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9741PrdHS", A9741PrdHS);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbPrdHS.setValue( GXutil.rtrim( A9741PrdHS) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPrdHS.getInternalname(), "Values", cmbPrdHS.ToJavascriptSource(), true);
      }
      if ( cmbPrdReach.getItemCount() > 0 )
      {
         A5887PrdReach = cmbPrdReach.getValidValue(A5887PrdReach) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5887PrdReach", A5887PrdReach);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbPrdReach.setValue( GXutil.rtrim( A5887PrdReach) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPrdReach.getInternalname(), "Values", cmbPrdReach.ToJavascriptSource(), true);
      }
      if ( cmbPrdOkotex.getItemCount() > 0 )
      {
         A5888PrdOkotex = cmbPrdOkotex.getValidValue(A5888PrdOkotex) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5888PrdOkotex", A5888PrdOkotex);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbPrdOkotex.setValue( GXutil.rtrim( A5888PrdOkotex) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPrdOkotex.getInternalname(), "Values", cmbPrdOkotex.ToJavascriptSource(), true);
      }
      if ( cmbPrdZDHC.getItemCount() > 0 )
      {
         A13301PrdZDHC = cmbPrdZDHC.getValidValue(A13301PrdZDHC) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13301PrdZDHC", A13301PrdZDHC);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbPrdZDHC.setValue( GXutil.rtrim( A13301PrdZDHC) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPrdZDHC.getInternalname(), "Values", cmbPrdZDHC.ToJavascriptSource(), true);
      }
      if ( cmbPrdList.getItemCount() > 0 )
      {
         A11687PrdList = cmbPrdList.getValidValue(A11687PrdList) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11687PrdList", A11687PrdList);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbPrdList.setValue( GXutil.rtrim( A11687PrdList) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPrdList.getInternalname(), "Values", cmbPrdList.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rfVC2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV15Pgmname = "TTproducGeneral" ;
      Gx_err = (short)(0) ;
   }

   public void rfVC2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H00VC16 */
         pr_default.execute(14, new Object[] {A396EmprCod, A719PrdNum});
         while ( (pr_default.getStatus(14) != 101) )
         {
            A4694PrdObs = H00VC16_A4694PrdObs[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4694PrdObs", A4694PrdObs);
            A11196PrdNroCAS = H00VC16_A11196PrdNroCAS[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11196PrdNroCAS", A11196PrdNroCAS);
            A11616PrdNmQu = H00VC16_A11616PrdNmQu[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11616PrdNmQu", A11616PrdNmQu);
            A11615PrdFuncion = H00VC16_A11615PrdFuncion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11615PrdFuncion", A11615PrdFuncion);
            A11614PrdEINECS = H00VC16_A11614PrdEINECS[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11614PrdEINECS", A11614PrdEINECS);
            A10935PrdRTM = H00VC16_A10935PrdRTM[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10935PrdRTM", A10935PrdRTM);
            A11663PrdCtw4 = H00VC16_A11663PrdCtw4[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11663PrdCtw4", A11663PrdCtw4);
            A10938PrdCtw3 = H00VC16_A10938PrdCtw3[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10938PrdCtw3", A10938PrdCtw3);
            A10937PrdCtw2 = H00VC16_A10937PrdCtw2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10937PrdCtw2", A10937PrdCtw2);
            A10936PrdCtw1 = H00VC16_A10936PrdCtw1[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10936PrdCtw1", A10936PrdCtw1);
            A11687PrdList = H00VC16_A11687PrdList[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11687PrdList", A11687PrdList);
            A13302PrdTHELIST = H00VC16_A13302PrdTHELIST[0] ;
            n13302PrdTHELIST = H00VC16_n13302PrdTHELIST[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13302PrdTHELIST", A13302PrdTHELIST);
            A13301PrdZDHC = H00VC16_A13301PrdZDHC[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13301PrdZDHC", A13301PrdZDHC);
            A11364PrdHm = H00VC16_A11364PrdHm[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11364PrdHm", A11364PrdHm);
            A11363PrdGots = H00VC16_A11363PrdGots[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11363PrdGots", A11363PrdGots);
            A5888PrdOkotex = H00VC16_A5888PrdOkotex[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5888PrdOkotex", A5888PrdOkotex);
            A5887PrdReach = H00VC16_A5887PrdReach[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5887PrdReach", A5887PrdReach);
            A9733PrdAox = H00VC16_A9733PrdAox[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9733PrdAox", GXutil.ltrimstr( A9733PrdAox, 6, 2));
            A9742PrdFHS = H00VC16_A9742PrdFHS[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9742PrdFHS", localUtil.format(A9742PrdFHS, "99/99/99"));
            A9741PrdHS = H00VC16_A9741PrdHS[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9741PrdHS", A9741PrdHS);
            A9740PrdFFT = H00VC16_A9740PrdFFT[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9740PrdFFT", localUtil.format(A9740PrdFFT, "99/99/99"));
            A9739PrdFT = H00VC16_A9739PrdFT[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9739PrdFT", A9739PrdFT);
            A9732PrdComp = H00VC16_A9732PrdComp[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9732PrdComp", A9732PrdComp);
            A9731PrdInc = H00VC16_A9731PrdInc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9731PrdInc", A9731PrdInc);
            A8897PrdPesTerm = H00VC16_A8897PrdPesTerm[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8897PrdPesTerm", A8897PrdPesTerm);
            A8896PrdPesCon = H00VC16_A8896PrdPesCon[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8896PrdPesCon", GXutil.str( A8896PrdPesCon, 1, 0));
            A7227PrdNumct2 = H00VC16_A7227PrdNumct2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7227PrdNumct2", GXutil.ltrimstr( A7227PrdNumct2, 6, 2));
            A7226PrdNumct1 = H00VC16_A7226PrdNumct1[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7226PrdNumct1", GXutil.ltrimstr( A7226PrdNumct1, 6, 2));
            A5417PrdConcS = H00VC16_A5417PrdConcS[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5417PrdConcS", GXutil.ltrimstr( A5417PrdConcS, 7, 3));
            A5416PrdDensS = H00VC16_A5416PrdDensS[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5416PrdDensS", GXutil.ltrimstr( A5416PrdDensS, 7, 3));
            A8936PrdSal = H00VC16_A8936PrdSal[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8936PrdSal", A8936PrdSal);
            A5418PrdSalM = H00VC16_A5418PrdSalM[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5418PrdSalM", A5418PrdSalM);
            A7260PrdHorMad = H00VC16_A7260PrdHorMad[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7260PrdHorMad", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7260PrdHorMad), 2, 0));
            A6191PrdNumCent = H00VC16_A6191PrdNumCent[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6191PrdNumCent", A6191PrdNumCent);
            A5590PrdSolub = H00VC16_A5590PrdSolub[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5590PrdSolub", GXutil.ltrimstr( A5590PrdSolub, 7, 2));
            A3273PrdTnq = H00VC16_A3273PrdTnq[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3273PrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3273PrdTnq), 2, 0));
            A1643PrdTip = H00VC16_A1643PrdTip[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1643PrdTip", A1643PrdTip);
            A1194PrdPosY = H00VC16_A1194PrdPosY[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1194PrdPosY", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1194PrdPosY), 2, 0));
            A1193PrdPosX = H00VC16_A1193PrdPosX[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1193PrdPosX", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1193PrdPosX), 4, 0));
            A721PrdNumUco = H00VC16_A721PrdNumUco[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A721PrdNumUco", GXutil.ltrimstr( A721PrdNumUco, 7, 2));
            A716PrdLotMin = H00VC16_A716PrdLotMin[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A716PrdLotMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A716PrdLotMin), 4, 0));
            A629MetCod = H00VC16_A629MetCod[0] ;
            n629MetCod = H00VC16_n629MetCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A629MetCod", GXutil.str( A629MetCod, 1, 0));
            A722PrdPlaEnt = H00VC16_A722PrdPlaEnt[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A722PrdPlaEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A722PrdPlaEnt), 3, 0));
            A699PrdDiaRot = H00VC16_A699PrdDiaRot[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A699PrdDiaRot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A699PrdDiaRot), 3, 0));
            A731PrdStkMinD = H00VC16_A731PrdStkMinD[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A731PrdStkMinD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A731PrdStkMinD), 4, 0));
            A732PrdStkMinU = H00VC16_A732PrdStkMinU[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A732PrdStkMinU", GXutil.ltrimstr( A732PrdStkMinU, 8, 2));
            A696PrdConDia = H00VC16_A696PrdConDia[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A696PrdConDia", GXutil.ltrimstr( A696PrdConDia, 7, 2));
            A726PrdPreMed = H00VC16_A726PrdPreMed[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
            A725PrdPreAnt = H00VC16_A725PrdPreAnt[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A725PrdPreAnt", GXutil.ltrimstr( A725PrdPreAnt, 14, 5));
            A709PrdFecPre = H00VC16_A709PrdFecPre[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
            A5255PrdPreAc2 = H00VC16_A5255PrdPreAc2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5255PrdPreAc2", GXutil.ltrimstr( A5255PrdPreAc2, 14, 5));
            A724PrdPreAct = H00VC16_A724PrdPreAct[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
            A714PrdFulPed = H00VC16_A714PrdFulPed[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A714PrdFulPed", localUtil.format(A714PrdFulPed, "99/99/99"));
            A713PrdFulEnt = H00VC16_A713PrdFulEnt[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
            A705PrdExiCC = H00VC16_A705PrdExiCC[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
            A684PrdCanPen = H00VC16_A684PrdCanPen[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
            A8659PrdExiAlmc = H00VC16_A8659PrdExiAlmc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8659PrdExiAlmc", GXutil.ltrimstr( A8659PrdExiAlmc, 12, 4));
            A835TipDtoCod = H00VC16_A835TipDtoCod[0] ;
            n835TipDtoCod = H00VC16_n835TipDtoCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A835TipDtoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A835TipDtoCod), 2, 0));
            A698PrdDetPar = H00VC16_A698PrdDetPar[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A698PrdDetPar", A698PrdDetPar);
            A682PrdCalNec = H00VC16_A682PrdCalNec[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A682PrdCalNec", A682PrdCalNec);
            A1644PrdDqo = H00VC16_A1644PrdDqo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1644PrdDqo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1644PrdDqo), 4, 0));
            A727PrdRec = H00VC16_A727PrdRec[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A727PrdRec", A727PrdRec);
            A3004PrdRev = H00VC16_A3004PrdRev[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3004PrdRev", A3004PrdRev);
            A11470PrdConct = H00VC16_A11470PrdConct[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11470PrdConct", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11470PrdConct), 3, 0));
            A856ValCod = H00VC16_A856ValCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
            A707PrdFacCon = H00VC16_A707PrdFacCon[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A707PrdFacCon", GXutil.ltrimstr( A707PrdFacCon, 7, 4));
            A743PrdUniCon = H00VC16_A743PrdUniCon[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A743PrdUniCon", GXutil.str( A743PrdUniCon, 1, 0));
            A742PrdUniCom = H00VC16_A742PrdUniCom[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A742PrdUniCom", GXutil.str( A742PrdUniCom, 1, 0));
            A9609SubFamCod = H00VC16_A9609SubFamCod[0] ;
            n9609SubFamCod = H00VC16_n9609SubFamCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9609SubFamCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9609SubFamCod), 2, 0));
            A12957PrdLoteOb = H00VC16_A12957PrdLoteOb[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12957PrdLoteOb", A12957PrdLoteOb);
            A10881PrdLote = H00VC16_A10881PrdLote[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10881PrdLote", A10881PrdLote);
            A10119PrdColIdx = H00VC16_A10119PrdColIdx[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10119PrdColIdx", A10119PrdColIdx);
            A4338PrdUMeFo = H00VC16_A4338PrdUMeFo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4338PrdUMeFo", GXutil.str( A4338PrdUMeFo, 1, 0));
            A12714PrdFabId = H00VC16_A12714PrdFabId[0] ;
            n12714PrdFabId = H00VC16_n12714PrdFabId[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12714PrdFabId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12714PrdFabId), 6, 0));
            A728PrdRefPrv = H00VC16_A728PrdRefPrv[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A728PrdRefPrv", A728PrdRefPrv);
            A795PrvNum = H00VC16_A795PrvNum[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
            A4692PrdNom2 = H00VC16_A4692PrdNom2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4692PrdNom2", A4692PrdNom2);
            A4693PrdNum2 = H00VC16_A4693PrdNum2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4693PrdNum2", A4693PrdNum2);
            A6301TipPrdCod = H00VC16_A6301TipPrdCod[0] ;
            n6301TipPrdCod = H00VC16_n6301TipPrdCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6301TipPrdCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6301TipPrdCod), 4, 0));
            A718PrdNom = H00VC16_A718PrdNom[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A718PrdNom", A718PrdNom);
            A685PrdCanRes = H00VC16_A685PrdCanRes[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A685PrdCanRes", GXutil.ltrimstr( A685PrdCanRes, 12, 4));
            A704PrdExiAlm = H00VC16_A704PrdExiAlm[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
            if ( (GXutil.strcmp("", h6301TipPrdCod)==0) )
            {
               A6301TipPrdCod = (short)(0) ;
               n6301TipPrdCod = false ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6301TipPrdCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6301TipPrdCod), 4, 0));
            }
            else
            {
               A13777TipPrdCDsc = h6301TipPrdCod ;
               /* Using cursor H00VC17 */
               pr_default.execute(15, new Object[] {A13777TipPrdCDsc, A396EmprCod});
               A6301TipPrdCod = H00VC17_A6301TipPrdCod[0] ;
               n6301TipPrdCod = H00VC17_n6301TipPrdCod[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6301TipPrdCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6301TipPrdCod), 4, 0));
               A6301TipPrdCod = H00VC17_A6301TipPrdCod[0] ;
               n6301TipPrdCod = H00VC17_n6301TipPrdCod[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6301TipPrdCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6301TipPrdCod), 4, 0));
               if ( ! ( (pr_default.getStatus(15) == 101) ) )
               {
                  pr_default.readNext(15);
                  if ( ! ( (pr_default.getStatus(15) == 101) ) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "TIPPRDCOD");
                  }
               }
               else
               {
               }
               pr_default.close(15);
            }
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "h6301TipPrdCod", h6301TipPrdCod);
            if ( (GXutil.strcmp("", h795PrvNum)==0) )
            {
               A795PrvNum = 0 ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
            }
            else
            {
               A13719PrvNNom = h795PrvNum ;
               /* Using cursor H00VC18 */
               pr_default.execute(16, new Object[] {A13719PrvNNom, A396EmprCod});
               A795PrvNum = H00VC18_A795PrvNum[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
               A795PrvNum = H00VC18_A795PrvNum[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
               if ( ! ( (pr_default.getStatus(16) == 101) ) )
               {
                  pr_default.readNext(16);
                  if ( ! ( (pr_default.getStatus(16) == 101) ) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Numero y Nombre", "")}), 1, "PRVNUM");
                  }
               }
               else
               {
               }
               pr_default.close(16);
            }
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "h795PrvNum", h795PrvNum);
            if ( (GXutil.strcmp("", h12714PrdFabId)==0) )
            {
               A12714PrdFabId = 0 ;
               n12714PrdFabId = false ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12714PrdFabId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12714PrdFabId), 6, 0));
            }
            else
            {
               A13776PrdFabIDNm = h12714PrdFabId ;
               /* Using cursor H00VC19 */
               pr_default.execute(17, new Object[] {A13776PrdFabIDNm, A396EmprCod});
               A12714PrdFabId = H00VC19_A12714PrdFabId[0] ;
               n12714PrdFabId = H00VC19_n12714PrdFabId[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12714PrdFabId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12714PrdFabId), 6, 0));
               A12714PrdFabId = H00VC19_A12714PrdFabId[0] ;
               n12714PrdFabId = H00VC19_n12714PrdFabId[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12714PrdFabId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12714PrdFabId), 6, 0));
               if ( ! ( (pr_default.getStatus(17) == 101) ) )
               {
                  pr_default.readNext(17);
                  if ( ! ( (pr_default.getStatus(17) == 101) ) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "codigo-Descripcion", "")}), 1, "PRDFABID");
                  }
               }
               else
               {
               }
               pr_default.close(17);
            }
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "h12714PrdFabId", h12714PrdFabId);
            if ( (GXutil.strcmp("", h835TipDtoCod)==0) )
            {
               A835TipDtoCod = (byte)(0) ;
               n835TipDtoCod = false ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A835TipDtoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A835TipDtoCod), 2, 0));
            }
            else
            {
               A13774TipDtoCDsc = h835TipDtoCod ;
               /* Using cursor H00VC20 */
               pr_default.execute(18, new Object[] {A13774TipDtoCDsc, A396EmprCod});
               A835TipDtoCod = H00VC20_A835TipDtoCod[0] ;
               n835TipDtoCod = H00VC20_n835TipDtoCod[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A835TipDtoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A835TipDtoCod), 2, 0));
               A835TipDtoCod = H00VC20_A835TipDtoCod[0] ;
               n835TipDtoCod = H00VC20_n835TipDtoCod[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A835TipDtoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A835TipDtoCod), 2, 0));
               if ( ! ( (pr_default.getStatus(18) == 101) ) )
               {
                  pr_default.readNext(18);
                  if ( ! ( (pr_default.getStatus(18) == 101) ) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "TIPDTOCOD");
                  }
               }
               else
               {
               }
               pr_default.close(18);
            }
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "h835TipDtoCod", h835TipDtoCod);
            if ( (GXutil.strcmp("", h629MetCod)==0) )
            {
               A629MetCod = (byte)(0) ;
               n629MetCod = false ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A629MetCod", GXutil.str( A629MetCod, 1, 0));
            }
            else
            {
               A13778MetCDsc = h629MetCod ;
               /* Using cursor H00VC21 */
               pr_default.execute(19, new Object[] {A13778MetCDsc, A396EmprCod});
               A629MetCod = H00VC21_A629MetCod[0] ;
               n629MetCod = H00VC21_n629MetCod[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A629MetCod", GXutil.str( A629MetCod, 1, 0));
               A629MetCod = H00VC21_A629MetCod[0] ;
               n629MetCod = H00VC21_n629MetCod[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A629MetCod", GXutil.str( A629MetCod, 1, 0));
               if ( ! ( (pr_default.getStatus(19) == 101) ) )
               {
                  pr_default.readNext(19);
                  if ( ! ( (pr_default.getStatus(19) == 101) ) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "METCOD");
                  }
               }
               else
               {
               }
               pr_default.close(19);
            }
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "h629MetCod", h629MetCod);
            gxaprdumefo_htmlVC2( A396EmprCod) ;
            gxaprdunicom_htmlVC2( A396EmprCod) ;
            gxaprdunicon_htmlVC2( A396EmprCod) ;
            gxavalcod_htmlVC2( A396EmprCod) ;
            A13831PrdDisponi = A704PrdExiAlm.subtract(A685PrdCanRes) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13831PrdDisponi", GXutil.ltrimstr( A13831PrdDisponi, 12, 4));
            /* Execute user event: Load */
            e14VC2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(14);
         wbVC0( ) ;
      }
   }

   public void send_integrity_lvl_hashesVC2( )
   {
   }

   public void before_start_formulas( )
   {
      AV15Pgmname = "TTproducGeneral" ;
      Gx_err = (short)(0) ;
      gxaprdumefo_htmlVC2( A396EmprCod) ;
      gxaprdunicom_htmlVC2( A396EmprCod) ;
      gxaprdunicon_htmlVC2( A396EmprCod) ;
      gxavalcod_htmlVC2( A396EmprCod) ;
      fix_multi_value_controls( ) ;
   }

   public void strupVC0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e13VC2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
         wcpOA719PrdNum = httpContext.cgiGet( sPrefix+"wcpOA719PrdNum") ;
         A396EmprCod = httpContext.cgiGet( sPrefix+"EMPRCOD") ;
         Dvpanel_transactiondetail_tableattributes_Width = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Width") ;
         Dvpanel_transactiondetail_tableattributes_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Autowidth")) ;
         Dvpanel_transactiondetail_tableattributes_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Autoheight")) ;
         Dvpanel_transactiondetail_tableattributes_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Cls") ;
         Dvpanel_transactiondetail_tableattributes_Title = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Title") ;
         Dvpanel_transactiondetail_tableattributes_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Collapsible")) ;
         Dvpanel_transactiondetail_tableattributes_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Collapsed")) ;
         Dvpanel_transactiondetail_tableattributes_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Showcollapseicon")) ;
         Dvpanel_transactiondetail_tableattributes_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Iconposition") ;
         Dvpanel_transactiondetail_tableattributes_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Autoscroll")) ;
         Dvpanel_unnamedtable1_Width = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Width") ;
         Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Autowidth")) ;
         Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoheight")) ;
         Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Cls") ;
         Dvpanel_unnamedtable1_Title = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Title") ;
         Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsible")) ;
         Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsed")) ;
         Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Showcollapseicon")) ;
         Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Iconposition") ;
         Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoscroll")) ;
         Dvpanel_unnamedtable5_Width = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE5_Width") ;
         Dvpanel_unnamedtable5_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE5_Autowidth")) ;
         Dvpanel_unnamedtable5_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE5_Autoheight")) ;
         Dvpanel_unnamedtable5_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE5_Cls") ;
         Dvpanel_unnamedtable5_Title = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE5_Title") ;
         Dvpanel_unnamedtable5_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE5_Collapsible")) ;
         Dvpanel_unnamedtable5_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE5_Collapsed")) ;
         Dvpanel_unnamedtable5_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE5_Showcollapseicon")) ;
         Dvpanel_unnamedtable5_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE5_Iconposition") ;
         Dvpanel_unnamedtable5_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE5_Autoscroll")) ;
         Dvpanel_unnamedtable6_Width = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE6_Width") ;
         Dvpanel_unnamedtable6_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE6_Autowidth")) ;
         Dvpanel_unnamedtable6_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE6_Autoheight")) ;
         Dvpanel_unnamedtable6_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE6_Cls") ;
         Dvpanel_unnamedtable6_Title = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE6_Title") ;
         Dvpanel_unnamedtable6_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE6_Collapsible")) ;
         Dvpanel_unnamedtable6_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE6_Collapsed")) ;
         Dvpanel_unnamedtable6_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE6_Showcollapseicon")) ;
         Dvpanel_unnamedtable6_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE6_Iconposition") ;
         Dvpanel_unnamedtable6_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE6_Autoscroll")) ;
         Dvpanel_unnamedtable7_Width = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE7_Width") ;
         Dvpanel_unnamedtable7_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE7_Autowidth")) ;
         Dvpanel_unnamedtable7_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE7_Autoheight")) ;
         Dvpanel_unnamedtable7_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE7_Cls") ;
         Dvpanel_unnamedtable7_Title = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE7_Title") ;
         Dvpanel_unnamedtable7_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE7_Collapsible")) ;
         Dvpanel_unnamedtable7_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE7_Collapsed")) ;
         Dvpanel_unnamedtable7_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE7_Showcollapseicon")) ;
         Dvpanel_unnamedtable7_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE7_Iconposition") ;
         Dvpanel_unnamedtable7_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE7_Autoscroll")) ;
         Dvpanel_unnamedtable8_Width = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE8_Width") ;
         Dvpanel_unnamedtable8_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE8_Autowidth")) ;
         Dvpanel_unnamedtable8_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE8_Autoheight")) ;
         Dvpanel_unnamedtable8_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE8_Cls") ;
         Dvpanel_unnamedtable8_Title = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE8_Title") ;
         Dvpanel_unnamedtable8_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE8_Collapsible")) ;
         Dvpanel_unnamedtable8_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE8_Collapsed")) ;
         Dvpanel_unnamedtable8_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE8_Showcollapseicon")) ;
         Dvpanel_unnamedtable8_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE8_Iconposition") ;
         Dvpanel_unnamedtable8_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE8_Autoscroll")) ;
         Dvpanel_unnamedtable9_Width = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE9_Width") ;
         Dvpanel_unnamedtable9_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE9_Autowidth")) ;
         Dvpanel_unnamedtable9_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE9_Autoheight")) ;
         Dvpanel_unnamedtable9_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE9_Cls") ;
         Dvpanel_unnamedtable9_Title = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE9_Title") ;
         Dvpanel_unnamedtable9_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE9_Collapsible")) ;
         Dvpanel_unnamedtable9_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE9_Collapsed")) ;
         Dvpanel_unnamedtable9_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE9_Showcollapseicon")) ;
         Dvpanel_unnamedtable9_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE9_Iconposition") ;
         Dvpanel_unnamedtable9_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE9_Autoscroll")) ;
         Dvpanel_unnamedtable10_Width = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE10_Width") ;
         Dvpanel_unnamedtable10_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE10_Autowidth")) ;
         Dvpanel_unnamedtable10_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE10_Autoheight")) ;
         Dvpanel_unnamedtable10_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE10_Cls") ;
         Dvpanel_unnamedtable10_Title = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE10_Title") ;
         Dvpanel_unnamedtable10_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE10_Collapsible")) ;
         Dvpanel_unnamedtable10_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE10_Collapsed")) ;
         Dvpanel_unnamedtable10_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE10_Showcollapseicon")) ;
         Dvpanel_unnamedtable10_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE10_Iconposition") ;
         Dvpanel_unnamedtable10_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE10_Autoscroll")) ;
         Gxuitabspanel_transactiondetail_tabcontrol_Pagecount = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GXUITABSPANEL_TRANSACTIONDETAIL_TABCONTROL_Pagecount"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gxuitabspanel_transactiondetail_tabcontrol_Class = httpContext.cgiGet( sPrefix+"GXUITABSPANEL_TRANSACTIONDETAIL_TABCONTROL_Class") ;
         Gxuitabspanel_transactiondetail_tabcontrol_Historymanagement = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GXUITABSPANEL_TRANSACTIONDETAIL_TABCONTROL_Historymanagement")) ;
         Dvpanel_unnamedtable2_Width = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Width") ;
         Dvpanel_unnamedtable2_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Autowidth")) ;
         Dvpanel_unnamedtable2_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Autoheight")) ;
         Dvpanel_unnamedtable2_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Cls") ;
         Dvpanel_unnamedtable2_Title = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Title") ;
         Dvpanel_unnamedtable2_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Collapsible")) ;
         Dvpanel_unnamedtable2_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Collapsed")) ;
         Dvpanel_unnamedtable2_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Showcollapseicon")) ;
         Dvpanel_unnamedtable2_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Iconposition") ;
         Dvpanel_unnamedtable2_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Autoscroll")) ;
         /* Read variables values. */
         A13831PrdDisponi = localUtil.ctond( httpContext.cgiGet( edtPrdDisponi_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13831PrdDisponi", GXutil.ltrimstr( A13831PrdDisponi, 12, 4));
         A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A718PrdNom", A718PrdNom);
         h6301TipPrdCod = httpContext.cgiGet( edtTipPrdCod_Internalname) ;
         if ( (GXutil.strcmp("", h6301TipPrdCod)==0) )
         {
            A6301TipPrdCod = (short)(0) ;
            n6301TipPrdCod = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6301TipPrdCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6301TipPrdCod), 4, 0));
         }
         else
         {
            A13777TipPrdCDsc = h6301TipPrdCod ;
            /* Using cursor H00VC22 */
            pr_default.execute(20, new Object[] {A13777TipPrdCDsc, A396EmprCod});
            A6301TipPrdCod = H00VC22_A6301TipPrdCod[0] ;
            n6301TipPrdCod = H00VC22_n6301TipPrdCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6301TipPrdCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6301TipPrdCod), 4, 0));
            A6301TipPrdCod = H00VC22_A6301TipPrdCod[0] ;
            n6301TipPrdCod = H00VC22_n6301TipPrdCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6301TipPrdCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6301TipPrdCod), 4, 0));
            if ( ! ( (pr_default.getStatus(20) == 101) ) )
            {
               pr_default.readNext(20);
               if ( ! ( (pr_default.getStatus(20) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "TIPPRDCOD");
               }
            }
            else
            {
            }
            pr_default.close(20);
         }
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "h6301TipPrdCod", h6301TipPrdCod);
         A4693PrdNum2 = httpContext.cgiGet( edtPrdNum2_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4693PrdNum2", A4693PrdNum2);
         A4692PrdNom2 = httpContext.cgiGet( edtPrdNom2_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4692PrdNom2", A4692PrdNom2);
         h795PrvNum = httpContext.cgiGet( edtPrvNum_Internalname) ;
         if ( (GXutil.strcmp("", h795PrvNum)==0) )
         {
            A795PrvNum = 0 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         }
         else
         {
            A13719PrvNNom = h795PrvNum ;
            /* Using cursor H00VC23 */
            pr_default.execute(21, new Object[] {A13719PrvNNom, A396EmprCod});
            A795PrvNum = H00VC23_A795PrvNum[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
            A795PrvNum = H00VC23_A795PrvNum[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
            if ( ! ( (pr_default.getStatus(21) == 101) ) )
            {
               pr_default.readNext(21);
               if ( ! ( (pr_default.getStatus(21) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Numero y Nombre", "")}), 1, "PRVNUM");
               }
            }
            else
            {
            }
            pr_default.close(21);
         }
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "h795PrvNum", h795PrvNum);
         A728PrdRefPrv = httpContext.cgiGet( edtPrdRefPrv_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A728PrdRefPrv", A728PrdRefPrv);
         h12714PrdFabId = httpContext.cgiGet( edtPrdFabId_Internalname) ;
         if ( (GXutil.strcmp("", h12714PrdFabId)==0) )
         {
            A12714PrdFabId = 0 ;
            n12714PrdFabId = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12714PrdFabId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12714PrdFabId), 6, 0));
         }
         else
         {
            A13776PrdFabIDNm = h12714PrdFabId ;
            /* Using cursor H00VC24 */
            pr_default.execute(22, new Object[] {A13776PrdFabIDNm, A396EmprCod});
            A12714PrdFabId = H00VC24_A12714PrdFabId[0] ;
            n12714PrdFabId = H00VC24_n12714PrdFabId[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12714PrdFabId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12714PrdFabId), 6, 0));
            A12714PrdFabId = H00VC24_A12714PrdFabId[0] ;
            n12714PrdFabId = H00VC24_n12714PrdFabId[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12714PrdFabId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12714PrdFabId), 6, 0));
            if ( ! ( (pr_default.getStatus(22) == 101) ) )
            {
               pr_default.readNext(22);
               if ( ! ( (pr_default.getStatus(22) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "codigo-Descripcion", "")}), 1, "PRDFABID");
               }
            }
            else
            {
            }
            pr_default.close(22);
         }
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "h12714PrdFabId", h12714PrdFabId);
         dynPrdUMeFo.setValue( httpContext.cgiGet( dynPrdUMeFo.getInternalname()) );
         A4338PrdUMeFo = (byte)(GXutil.lval( httpContext.cgiGet( dynPrdUMeFo.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4338PrdUMeFo", GXutil.str( A4338PrdUMeFo, 1, 0));
         A10119PrdColIdx = httpContext.cgiGet( edtPrdColIdx_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10119PrdColIdx", A10119PrdColIdx);
         A10881PrdLote = httpContext.cgiGet( edtPrdLote_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10881PrdLote", A10881PrdLote);
         A12957PrdLoteOb = ((GXutil.strcmp(httpContext.cgiGet( chkPrdLoteOb.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12957PrdLoteOb", A12957PrdLoteOb);
         A9609SubFamCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtSubFamCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n9609SubFamCod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9609SubFamCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9609SubFamCod), 2, 0));
         dynPrdUniCom.setValue( httpContext.cgiGet( dynPrdUniCom.getInternalname()) );
         A742PrdUniCom = (byte)(GXutil.lval( httpContext.cgiGet( dynPrdUniCom.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A742PrdUniCom", GXutil.str( A742PrdUniCom, 1, 0));
         dynPrdUniCon.setValue( httpContext.cgiGet( dynPrdUniCon.getInternalname()) );
         A743PrdUniCon = (byte)(GXutil.lval( httpContext.cgiGet( dynPrdUniCon.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A743PrdUniCon", GXutil.str( A743PrdUniCon, 1, 0));
         A707PrdFacCon = localUtil.ctond( httpContext.cgiGet( edtPrdFacCon_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A707PrdFacCon", GXutil.ltrimstr( A707PrdFacCon, 7, 4));
         dynValCod.setValue( httpContext.cgiGet( dynValCod.getInternalname()) );
         A856ValCod = (byte)(GXutil.lval( httpContext.cgiGet( dynValCod.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
         A11470PrdConct = (short)(localUtil.ctol( httpContext.cgiGet( edtPrdConct_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11470PrdConct", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11470PrdConct), 3, 0));
         A3004PrdRev = GXutil.upper( httpContext.cgiGet( edtPrdRev_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3004PrdRev", A3004PrdRev);
         cmbPrdRec.setValue( httpContext.cgiGet( cmbPrdRec.getInternalname()) );
         A727PrdRec = httpContext.cgiGet( cmbPrdRec.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A727PrdRec", A727PrdRec);
         A1644PrdDqo = (short)(localUtil.ctol( httpContext.cgiGet( edtPrdDqo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1644PrdDqo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1644PrdDqo), 4, 0));
         cmbPrdCalNec.setValue( httpContext.cgiGet( cmbPrdCalNec.getInternalname()) );
         A682PrdCalNec = httpContext.cgiGet( cmbPrdCalNec.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A682PrdCalNec", A682PrdCalNec);
         cmbPrdDetPar.setValue( httpContext.cgiGet( cmbPrdDetPar.getInternalname()) );
         A698PrdDetPar = httpContext.cgiGet( cmbPrdDetPar.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A698PrdDetPar", A698PrdDetPar);
         h835TipDtoCod = httpContext.cgiGet( edtTipDtoCod_Internalname) ;
         if ( (GXutil.strcmp("", h835TipDtoCod)==0) )
         {
            A835TipDtoCod = (byte)(0) ;
            n835TipDtoCod = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A835TipDtoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A835TipDtoCod), 2, 0));
         }
         else
         {
            A13774TipDtoCDsc = h835TipDtoCod ;
            /* Using cursor H00VC25 */
            pr_default.execute(23, new Object[] {A13774TipDtoCDsc, A396EmprCod});
            A835TipDtoCod = H00VC25_A835TipDtoCod[0] ;
            n835TipDtoCod = H00VC25_n835TipDtoCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A835TipDtoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A835TipDtoCod), 2, 0));
            A835TipDtoCod = H00VC25_A835TipDtoCod[0] ;
            n835TipDtoCod = H00VC25_n835TipDtoCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A835TipDtoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A835TipDtoCod), 2, 0));
            if ( ! ( (pr_default.getStatus(23) == 101) ) )
            {
               pr_default.readNext(23);
               if ( ! ( (pr_default.getStatus(23) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "TIPDTOCOD");
               }
            }
            else
            {
            }
            pr_default.close(23);
         }
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "h835TipDtoCod", h835TipDtoCod);
         A704PrdExiAlm = localUtil.ctond( httpContext.cgiGet( edtPrdExiAlm_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         A8659PrdExiAlmc = localUtil.ctond( httpContext.cgiGet( edtPrdExiAlmc_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8659PrdExiAlmc", GXutil.ltrimstr( A8659PrdExiAlmc, 12, 4));
         A685PrdCanRes = localUtil.ctond( httpContext.cgiGet( edtPrdCanRes_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A685PrdCanRes", GXutil.ltrimstr( A685PrdCanRes, 12, 4));
         A684PrdCanPen = localUtil.ctond( httpContext.cgiGet( edtPrdCanPen_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
         A705PrdExiCC = localUtil.ctond( httpContext.cgiGet( edtPrdExiCC_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
         A713PrdFulEnt = localUtil.ctod( httpContext.cgiGet( edtPrdFulEnt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
         A714PrdFulPed = localUtil.ctod( httpContext.cgiGet( edtPrdFulPed_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A714PrdFulPed", localUtil.format(A714PrdFulPed, "99/99/99"));
         A724PrdPreAct = localUtil.ctond( httpContext.cgiGet( edtPrdPreAct_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
         A5255PrdPreAc2 = localUtil.ctond( httpContext.cgiGet( edtPrdPreAc2_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5255PrdPreAc2", GXutil.ltrimstr( A5255PrdPreAc2, 14, 5));
         A709PrdFecPre = localUtil.ctod( httpContext.cgiGet( edtPrdFecPre_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
         A725PrdPreAnt = localUtil.ctond( httpContext.cgiGet( edtPrdPreAnt_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A725PrdPreAnt", GXutil.ltrimstr( A725PrdPreAnt, 14, 5));
         A726PrdPreMed = localUtil.ctond( httpContext.cgiGet( edtPrdPreMed_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
         A696PrdConDia = localUtil.ctond( httpContext.cgiGet( edtPrdConDia_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A696PrdConDia", GXutil.ltrimstr( A696PrdConDia, 7, 2));
         A732PrdStkMinU = localUtil.ctond( httpContext.cgiGet( edtPrdStkMinU_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A732PrdStkMinU", GXutil.ltrimstr( A732PrdStkMinU, 8, 2));
         A731PrdStkMinD = (short)(localUtil.ctol( httpContext.cgiGet( edtPrdStkMinD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A731PrdStkMinD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A731PrdStkMinD), 4, 0));
         A699PrdDiaRot = (short)(localUtil.ctol( httpContext.cgiGet( edtPrdDiaRot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A699PrdDiaRot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A699PrdDiaRot), 3, 0));
         A722PrdPlaEnt = (short)(localUtil.ctol( httpContext.cgiGet( edtPrdPlaEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A722PrdPlaEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A722PrdPlaEnt), 3, 0));
         h629MetCod = httpContext.cgiGet( edtMetCod_Internalname) ;
         if ( (GXutil.strcmp("", h629MetCod)==0) )
         {
            A629MetCod = (byte)(0) ;
            n629MetCod = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A629MetCod", GXutil.str( A629MetCod, 1, 0));
         }
         else
         {
            A13778MetCDsc = h629MetCod ;
            /* Using cursor H00VC26 */
            pr_default.execute(24, new Object[] {A13778MetCDsc, A396EmprCod});
            A629MetCod = H00VC26_A629MetCod[0] ;
            n629MetCod = H00VC26_n629MetCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A629MetCod", GXutil.str( A629MetCod, 1, 0));
            A629MetCod = H00VC26_A629MetCod[0] ;
            n629MetCod = H00VC26_n629MetCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A629MetCod", GXutil.str( A629MetCod, 1, 0));
            if ( ! ( (pr_default.getStatus(24) == 101) ) )
            {
               pr_default.readNext(24);
               if ( ! ( (pr_default.getStatus(24) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "METCOD");
               }
            }
            else
            {
            }
            pr_default.close(24);
         }
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "h629MetCod", h629MetCod);
         A716PrdLotMin = (short)(localUtil.ctol( httpContext.cgiGet( edtPrdLotMin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A716PrdLotMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A716PrdLotMin), 4, 0));
         A721PrdNumUco = localUtil.ctond( httpContext.cgiGet( edtPrdNumUco_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A721PrdNumUco", GXutil.ltrimstr( A721PrdNumUco, 7, 2));
         A1193PrdPosX = (short)(localUtil.ctol( httpContext.cgiGet( edtPrdPosX_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1193PrdPosX", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1193PrdPosX), 4, 0));
         A1194PrdPosY = (byte)(localUtil.ctol( httpContext.cgiGet( edtPrdPosY_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1194PrdPosY", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1194PrdPosY), 2, 0));
         cmbPrdTip.setValue( httpContext.cgiGet( cmbPrdTip.getInternalname()) );
         A1643PrdTip = httpContext.cgiGet( cmbPrdTip.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1643PrdTip", A1643PrdTip);
         A3273PrdTnq = (byte)(localUtil.ctol( httpContext.cgiGet( edtPrdTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3273PrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3273PrdTnq), 2, 0));
         A5590PrdSolub = localUtil.ctond( httpContext.cgiGet( edtPrdSolub_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5590PrdSolub", GXutil.ltrimstr( A5590PrdSolub, 7, 2));
         A6191PrdNumCent = httpContext.cgiGet( edtPrdNumCent_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6191PrdNumCent", A6191PrdNumCent);
         A7260PrdHorMad = (byte)(localUtil.ctol( httpContext.cgiGet( edtPrdHorMad_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7260PrdHorMad", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7260PrdHorMad), 2, 0));
         A5418PrdSalM = ((GXutil.strcmp(httpContext.cgiGet( chkPrdSalM.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5418PrdSalM", A5418PrdSalM);
         A8936PrdSal = ((GXutil.strcmp(httpContext.cgiGet( chkPrdSal.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8936PrdSal", A8936PrdSal);
         A5416PrdDensS = localUtil.ctond( httpContext.cgiGet( edtPrdDensS_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5416PrdDensS", GXutil.ltrimstr( A5416PrdDensS, 7, 3));
         A5417PrdConcS = localUtil.ctond( httpContext.cgiGet( edtPrdConcS_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5417PrdConcS", GXutil.ltrimstr( A5417PrdConcS, 7, 3));
         A7226PrdNumct1 = localUtil.ctond( httpContext.cgiGet( edtPrdNumct1_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7226PrdNumct1", GXutil.ltrimstr( A7226PrdNumct1, 6, 2));
         A7227PrdNumct2 = localUtil.ctond( httpContext.cgiGet( edtPrdNumct2_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7227PrdNumct2", GXutil.ltrimstr( A7227PrdNumct2, 6, 2));
         A8896PrdPesCon = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkPrdPesCon.getInternalname()), "1")==0) ? 1 : 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8896PrdPesCon", GXutil.str( A8896PrdPesCon, 1, 0));
         A8897PrdPesTerm = httpContext.cgiGet( edtPrdPesTerm_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8897PrdPesTerm", A8897PrdPesTerm);
         A9731PrdInc = httpContext.cgiGet( edtPrdInc_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9731PrdInc", A9731PrdInc);
         A9732PrdComp = httpContext.cgiGet( edtPrdComp_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9732PrdComp", A9732PrdComp);
         cmbPrdFT.setValue( httpContext.cgiGet( cmbPrdFT.getInternalname()) );
         A9739PrdFT = httpContext.cgiGet( cmbPrdFT.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9739PrdFT", A9739PrdFT);
         A9740PrdFFT = localUtil.ctod( httpContext.cgiGet( edtPrdFFT_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9740PrdFFT", localUtil.format(A9740PrdFFT, "99/99/99"));
         cmbPrdHS.setValue( httpContext.cgiGet( cmbPrdHS.getInternalname()) );
         A9741PrdHS = httpContext.cgiGet( cmbPrdHS.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9741PrdHS", A9741PrdHS);
         A9742PrdFHS = localUtil.ctod( httpContext.cgiGet( edtPrdFHS_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9742PrdFHS", localUtil.format(A9742PrdFHS, "99/99/99"));
         A9733PrdAox = localUtil.ctond( httpContext.cgiGet( edtPrdAox_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9733PrdAox", GXutil.ltrimstr( A9733PrdAox, 6, 2));
         cmbPrdReach.setValue( httpContext.cgiGet( cmbPrdReach.getInternalname()) );
         A5887PrdReach = httpContext.cgiGet( cmbPrdReach.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5887PrdReach", A5887PrdReach);
         cmbPrdOkotex.setValue( httpContext.cgiGet( cmbPrdOkotex.getInternalname()) );
         A5888PrdOkotex = httpContext.cgiGet( cmbPrdOkotex.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5888PrdOkotex", A5888PrdOkotex);
         A11363PrdGots = httpContext.cgiGet( edtPrdGots_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11363PrdGots", A11363PrdGots);
         A11364PrdHm = httpContext.cgiGet( edtPrdHm_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11364PrdHm", A11364PrdHm);
         cmbPrdZDHC.setValue( httpContext.cgiGet( cmbPrdZDHC.getInternalname()) );
         A13301PrdZDHC = httpContext.cgiGet( cmbPrdZDHC.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13301PrdZDHC", A13301PrdZDHC);
         A13302PrdTHELIST = GXutil.upper( httpContext.cgiGet( edtPrdTHELIST_Internalname)) ;
         n13302PrdTHELIST = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13302PrdTHELIST", A13302PrdTHELIST);
         cmbPrdList.setValue( httpContext.cgiGet( cmbPrdList.getInternalname()) );
         A11687PrdList = httpContext.cgiGet( cmbPrdList.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11687PrdList", A11687PrdList);
         A10936PrdCtw1 = httpContext.cgiGet( edtPrdCtw1_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10936PrdCtw1", A10936PrdCtw1);
         A10937PrdCtw2 = httpContext.cgiGet( edtPrdCtw2_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10937PrdCtw2", A10937PrdCtw2);
         A10938PrdCtw3 = httpContext.cgiGet( edtPrdCtw3_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10938PrdCtw3", A10938PrdCtw3);
         A11663PrdCtw4 = httpContext.cgiGet( edtPrdCtw4_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11663PrdCtw4", A11663PrdCtw4);
         A10935PrdRTM = httpContext.cgiGet( edtPrdRTM_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10935PrdRTM", A10935PrdRTM);
         A11614PrdEINECS = httpContext.cgiGet( edtPrdEINECS_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11614PrdEINECS", A11614PrdEINECS);
         A11615PrdFuncion = httpContext.cgiGet( edtPrdFuncion_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11615PrdFuncion", A11615PrdFuncion);
         A11616PrdNmQu = httpContext.cgiGet( edtPrdNmQu_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11616PrdNmQu", A11616PrdNmQu);
         A11196PrdNroCAS = httpContext.cgiGet( edtPrdNroCAS_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11196PrdNroCAS", A11196PrdNroCAS);
         A4694PrdObs = httpContext.cgiGet( edtPrdObs_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4694PrdObs", A4694PrdObs);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         gxaprdumefo_htmlVC2( A396EmprCod) ;
         gxaprdunicom_htmlVC2( A396EmprCod) ;
         gxaprdunicon_htmlVC2( A396EmprCod) ;
         gxavalcod_htmlVC2( A396EmprCod) ;
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e13VC2 ();
      if (returnInSub) return;
   }

   public void e13VC2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXv_SdtWWPContext1[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV6WWPContext = GXv_SdtWWPContext1[0] ;
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
   }

   protected void nextLoad( )
   {
   }

   protected void e14VC2( )
   {
      /* Load Routine */
      returnInSub = false ;
      edtPrdNom_Link = formatLink("app.tnprovprdview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","PrdNum","TabCode"})  ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdNom_Internalname, "Link", edtPrdNom_Link, true);
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "PDNO00", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         cmbPrdList.setVisible( 0 );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPrdList.getInternalname(), "Visible", GXutil.ltrimstr( cmbPrdList.getVisible(), 5, 0), true);
         divPrdlist_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divPrdlist_cell_Internalname, "Class", divPrdlist_cell_Class, true);
      }
      else
      {
         cmbPrdList.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPrdList.getInternalname(), "Visible", GXutil.ltrimstr( cmbPrdList.getVisible(), 5, 0), true);
         divPrdlist_cell_Class = "col-xs-12 col-sm-6 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divPrdlist_cell_Internalname, "Class", divPrdlist_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( AV14Emprcod, httpContext.getMessage( "INNO00", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtPrdInc_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdInc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdInc_Visible), 5, 0), true);
         divPrdinc_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divPrdinc_cell_Internalname, "Class", divPrdinc_cell_Class, true);
      }
      else
      {
         edtPrdInc_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdInc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdInc_Visible), 5, 0), true);
         divPrdinc_cell_Class = "col-xs-12 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divPrdinc_cell_Internalname, "Class", divPrdinc_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "PREMED", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtPrdPreMed_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdPreMed_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPreMed_Visible), 5, 0), true);
         divPrdpremed_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divPrdpremed_cell_Internalname, "Class", divPrdpremed_cell_Class, true);
      }
      else
      {
         edtPrdPreMed_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdPreMed_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPreMed_Visible), 5, 0), true);
         divPrdpremed_cell_Class = "col-xs-12 col-sm-6 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divPrdpremed_cell_Internalname, "Class", divPrdpremed_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "GAVIM", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         chkPrdLoteOb.setVisible( 0 );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkPrdLoteOb.getInternalname(), "Visible", GXutil.ltrimstr( chkPrdLoteOb.getVisible(), 5, 0), true);
         divPrdloteob_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divPrdloteob_cell_Internalname, "Class", divPrdloteob_cell_Class, true);
      }
      else
      {
         chkPrdLoteOb.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkPrdLoteOb.getInternalname(), "Visible", GXutil.ltrimstr( chkPrdLoteOb.getVisible(), 5, 0), true);
         divPrdloteob_cell_Class = "col-xs-12 col-sm-4 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divPrdloteob_cell_Internalname, "Class", divPrdloteob_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "ELIOT", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtSubFamCod_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtSubFamCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSubFamCod_Visible), 5, 0), true);
         divSubfamcod_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divSubfamcod_cell_Internalname, "Class", divSubfamcod_cell_Class, true);
      }
      else
      {
         edtSubFamCod_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtSubFamCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSubFamCod_Visible), 5, 0), true);
         divSubfamcod_cell_Class = "col-xs-12 col-sm-4 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divSubfamcod_cell_Internalname, "Class", divSubfamcod_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "THESUS", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         divDvpanel_unnamedtable8_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divDvpanel_unnamedtable8_cell_Internalname, "Class", divDvpanel_unnamedtable8_cell_Class, true);
      }
      else
      {
         divDvpanel_unnamedtable8_cell_Class = "col-xs-12 col-sm-6 CellMarginTop" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divDvpanel_unnamedtable8_cell_Internalname, "Class", divDvpanel_unnamedtable8_cell_Class, true);
      }
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV7TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV15Pgmname );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( false );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV10HTTPRequest.getScriptName()+"?"+AV10HTTPRequest.getQuerystring() );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TTproduc" );
      AV9Session.setValue("TrnContext", AV7TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      A719PrdNum = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A719PrdNum", A719PrdNum);
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
      paVC2( ) ;
      wsVC2( ) ;
      weVC2( ) ;
      httpContext.setWrapped(false);
      httpContext.SaveComponentMsgList(sPrefix);
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

   public void componentbind( Object[] obj )
   {
      if ( IsUrlCreated( ) )
      {
         return  ;
      }
      sCtrlA396EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlA719PrdNum = (String)getParm(obj,1,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paVC2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "ttproducgeneral", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paVC2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A396EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A719PrdNum = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A719PrdNum", A719PrdNum);
      }
      wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
      wcpOA719PrdNum = httpContext.cgiGet( sPrefix+"wcpOA719PrdNum") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(A396EmprCod, wcpOA396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, wcpOA719PrdNum) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOA396EmprCod = A396EmprCod ;
      wcpOA719PrdNum = A719PrdNum ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlA396EmprCod = httpContext.cgiGet( sPrefix+"A396EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlA396EmprCod) > 0 )
      {
         A396EmprCod = httpContext.cgiGet( sCtrlA396EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      }
      else
      {
         A396EmprCod = httpContext.cgiGet( sPrefix+"A396EmprCod_PARM") ;
      }
      sCtrlA719PrdNum = httpContext.cgiGet( sPrefix+"A719PrdNum_CTRL") ;
      if ( GXutil.len( sCtrlA719PrdNum) > 0 )
      {
         A719PrdNum = httpContext.cgiGet( sCtrlA719PrdNum) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A719PrdNum", A719PrdNum);
      }
      else
      {
         A719PrdNum = httpContext.cgiGet( sPrefix+"A719PrdNum_PARM") ;
      }
   }

   public void componentprocess( String sPPrefix ,
                                 String sPSFPrefix ,
                                 String sCompEvt )
   {
      sCompPrefix = sPPrefix ;
      sSFPrefix = sPSFPrefix ;
      sPrefix = sCompPrefix + sSFPrefix ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      initweb( ) ;
      nDraw = (byte)(0) ;
      paVC2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsVC2( ) ;
      if ( isFullAjaxMode( ) )
      {
         componentdraw();
      }
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void componentstart( )
   {
      if ( nDoneStart == 0 )
      {
         wcstart( ) ;
      }
   }

   public void wcstart( )
   {
      nDraw = (byte)(1) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      wsVC2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A396EmprCod_PARM", GXutil.rtrim( A396EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlA396EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A396EmprCod_CTRL", GXutil.rtrim( sCtrlA396EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A719PrdNum_PARM", GXutil.rtrim( A719PrdNum));
      if ( GXutil.len( GXutil.rtrim( sCtrlA719PrdNum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A719PrdNum_CTRL", GXutil.rtrim( sCtrlA719PrdNum));
      }
   }

   public void componentdraw( )
   {
      if ( nDoneStart == 0 )
      {
         wcstart( ) ;
      }
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      wcparametersset( ) ;
      weVC2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public String componentgetstring( String sGXControl )
   {
      String sCtrlName;
      if ( GXutil.strcmp(GXutil.substring( sGXControl, 1, 1), "&") == 0 )
      {
         sCtrlName = GXutil.substring( sGXControl, 2, GXutil.len( sGXControl)-1) ;
      }
      else
      {
         sCtrlName = sGXControl ;
      }
      return httpContext.cgiGet( sPrefix+"v"+GXutil.upper( sCtrlName)) ;
   }

   public void componentjscripts( )
   {
      include_jscripts( ) ;
   }

   public void componentthemes( )
   {
      define_styles( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211674851", true, true);
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
      httpContext.AddJavascriptSource("ttproducgeneral.js", "?20268211674851", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      edtPrdDisponi_Internalname = sPrefix+"PRDDISPONI" ;
      edtPrdNum_Internalname = sPrefix+"PRDNUM" ;
      edtPrdNom_Internalname = sPrefix+"PRDNOM" ;
      edtTipPrdCod_Internalname = sPrefix+"TIPPRDCOD" ;
      divUnnamedtable25_Internalname = sPrefix+"UNNAMEDTABLE25" ;
      edtPrdNum2_Internalname = sPrefix+"PRDNUM2" ;
      edtPrdNom2_Internalname = sPrefix+"PRDNOM2" ;
      divUnnamedtable26_Internalname = sPrefix+"UNNAMEDTABLE26" ;
      edtPrvNum_Internalname = sPrefix+"PRVNUM" ;
      edtPrdRefPrv_Internalname = sPrefix+"PRDREFPRV" ;
      divUnnamedtable27_Internalname = sPrefix+"UNNAMEDTABLE27" ;
      edtPrdFabId_Internalname = sPrefix+"PRDFABID" ;
      divUnnamedtable28_Internalname = sPrefix+"UNNAMEDTABLE28" ;
      dynPrdUMeFo.setInternalname( sPrefix+"PRDUMEFO" );
      edtPrdColIdx_Internalname = sPrefix+"PRDCOLIDX" ;
      divUnnamedtable29_Internalname = sPrefix+"UNNAMEDTABLE29" ;
      edtPrdLote_Internalname = sPrefix+"PRDLOTE" ;
      chkPrdLoteOb.setInternalname( sPrefix+"PRDLOTEOB" );
      divPrdloteob_cell_Internalname = sPrefix+"PRDLOTEOB_CELL" ;
      edtSubFamCod_Internalname = sPrefix+"SUBFAMCOD" ;
      divSubfamcod_cell_Internalname = sPrefix+"SUBFAMCOD_CELL" ;
      divUnnamedtable30_Internalname = sPrefix+"UNNAMEDTABLE30" ;
      dynPrdUniCom.setInternalname( sPrefix+"PRDUNICOM" );
      dynPrdUniCon.setInternalname( sPrefix+"PRDUNICON" );
      edtPrdFacCon_Internalname = sPrefix+"PRDFACCON" ;
      divUnnamedtable31_Internalname = sPrefix+"UNNAMEDTABLE31" ;
      dynValCod.setInternalname( sPrefix+"VALCOD" );
      divUnnamedtable32_Internalname = sPrefix+"UNNAMEDTABLE32" ;
      edtPrdConct_Internalname = sPrefix+"PRDCONCT" ;
      edtPrdRev_Internalname = sPrefix+"PRDREV" ;
      cmbPrdRec.setInternalname( sPrefix+"PRDREC" );
      edtPrdDqo_Internalname = sPrefix+"PRDDQO" ;
      divUnnamedtable33_Internalname = sPrefix+"UNNAMEDTABLE33" ;
      cmbPrdCalNec.setInternalname( sPrefix+"PRDCALNEC" );
      cmbPrdDetPar.setInternalname( sPrefix+"PRDDETPAR" );
      edtTipDtoCod_Internalname = sPrefix+"TIPDTOCOD" ;
      divUnnamedtable34_Internalname = sPrefix+"UNNAMEDTABLE34" ;
      divTransactiondetail_tableattributes_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLEATTRIBUTES" ;
      Dvpanel_transactiondetail_tableattributes_Internalname = sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES" ;
      edtPrdExiAlm_Internalname = sPrefix+"PRDEXIALM" ;
      edtPrdExiAlmc_Internalname = sPrefix+"PRDEXIALMC" ;
      edtPrdCanRes_Internalname = sPrefix+"PRDCANRES" ;
      edtPrdCanPen_Internalname = sPrefix+"PRDCANPEN" ;
      divUnnamedtable23_Internalname = sPrefix+"UNNAMEDTABLE23" ;
      edtPrdExiCC_Internalname = sPrefix+"PRDEXICC" ;
      edtPrdFulEnt_Internalname = sPrefix+"PRDFULENT" ;
      edtPrdFulPed_Internalname = sPrefix+"PRDFULPED" ;
      divUnnamedtable24_Internalname = sPrefix+"UNNAMEDTABLE24" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE1" ;
      lblTabs1_title_Internalname = sPrefix+"TABS1_TITLE" ;
      edtPrdPreAct_Internalname = sPrefix+"PRDPREACT" ;
      edtPrdPreAc2_Internalname = sPrefix+"PRDPREAC2" ;
      edtPrdFecPre_Internalname = sPrefix+"PRDFECPRE" ;
      edtPrdPreAnt_Internalname = sPrefix+"PRDPREANT" ;
      edtPrdPreMed_Internalname = sPrefix+"PRDPREMED" ;
      divPrdpremed_cell_Internalname = sPrefix+"PRDPREMED_CELL" ;
      divUnnamedtable22_Internalname = sPrefix+"UNNAMEDTABLE22" ;
      lblTabs2_title_Internalname = sPrefix+"TABS2_TITLE" ;
      edtPrdConDia_Internalname = sPrefix+"PRDCONDIA" ;
      edtPrdStkMinU_Internalname = sPrefix+"PRDSTKMINU" ;
      edtPrdStkMinD_Internalname = sPrefix+"PRDSTKMIND" ;
      edtPrdDiaRot_Internalname = sPrefix+"PRDDIAROT" ;
      edtPrdPlaEnt_Internalname = sPrefix+"PRDPLAENT" ;
      edtMetCod_Internalname = sPrefix+"METCOD" ;
      edtPrdLotMin_Internalname = sPrefix+"PRDLOTMIN" ;
      edtPrdNumUco_Internalname = sPrefix+"PRDNUMUCO" ;
      divUnnamedtable21_Internalname = sPrefix+"UNNAMEDTABLE21" ;
      lblTabs3_title_Internalname = sPrefix+"TABS3_TITLE" ;
      edtPrdPosX_Internalname = sPrefix+"PRDPOSX" ;
      edtPrdPosY_Internalname = sPrefix+"PRDPOSY" ;
      cmbPrdTip.setInternalname( sPrefix+"PRDTIP" );
      edtPrdTnq_Internalname = sPrefix+"PRDTNQ" ;
      divUnnamedtable13_Internalname = sPrefix+"UNNAMEDTABLE13" ;
      edtPrdSolub_Internalname = sPrefix+"PRDSOLUB" ;
      edtPrdNumCent_Internalname = sPrefix+"PRDNUMCENT" ;
      edtPrdHorMad_Internalname = sPrefix+"PRDHORMAD" ;
      divUnnamedtable14_Internalname = sPrefix+"UNNAMEDTABLE14" ;
      chkPrdSalM.setInternalname( sPrefix+"PRDSALM" );
      chkPrdSal.setInternalname( sPrefix+"PRDSAL" );
      edtPrdDensS_Internalname = sPrefix+"PRDDENSS" ;
      edtPrdConcS_Internalname = sPrefix+"PRDCONCS" ;
      divUnnamedtable19_Internalname = sPrefix+"UNNAMEDTABLE19" ;
      grpUnnamedgroup20_Internalname = sPrefix+"UNNAMEDGROUP20" ;
      divUnnamedtable15_Internalname = sPrefix+"UNNAMEDTABLE15" ;
      edtPrdNumct1_Internalname = sPrefix+"PRDNUMCT1" ;
      edtPrdNumct2_Internalname = sPrefix+"PRDNUMCT2" ;
      divUnnamedtable17_Internalname = sPrefix+"UNNAMEDTABLE17" ;
      grpUnnamedgroup18_Internalname = sPrefix+"UNNAMEDGROUP18" ;
      divUnnamedtable16_Internalname = sPrefix+"UNNAMEDTABLE16" ;
      divUnnamedtable12_Internalname = sPrefix+"UNNAMEDTABLE12" ;
      lblTabs4_title_Internalname = sPrefix+"TABS4_TITLE" ;
      chkPrdPesCon.setInternalname( sPrefix+"PRDPESCON" );
      edtPrdPesTerm_Internalname = sPrefix+"PRDPESTERM" ;
      divUnnamedtable11_Internalname = sPrefix+"UNNAMEDTABLE11" ;
      lblTabs5_title_Internalname = sPrefix+"TABS5_TITLE" ;
      edtPrdInc_Internalname = sPrefix+"PRDINC" ;
      divPrdinc_cell_Internalname = sPrefix+"PRDINC_CELL" ;
      edtPrdComp_Internalname = sPrefix+"PRDCOMP" ;
      divUnnamedtable5_Internalname = sPrefix+"UNNAMEDTABLE5" ;
      Dvpanel_unnamedtable5_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE5" ;
      cmbPrdFT.setInternalname( sPrefix+"PRDFT" );
      edtPrdFFT_Internalname = sPrefix+"PRDFFT" ;
      cmbPrdHS.setInternalname( sPrefix+"PRDHS" );
      edtPrdFHS_Internalname = sPrefix+"PRDFHS" ;
      divUnnamedtable6_Internalname = sPrefix+"UNNAMEDTABLE6" ;
      Dvpanel_unnamedtable6_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE6" ;
      edtPrdAox_Internalname = sPrefix+"PRDAOX" ;
      cmbPrdReach.setInternalname( sPrefix+"PRDREACH" );
      cmbPrdOkotex.setInternalname( sPrefix+"PRDOKOTEX" );
      edtPrdGots_Internalname = sPrefix+"PRDGOTS" ;
      edtPrdHm_Internalname = sPrefix+"PRDHM" ;
      cmbPrdZDHC.setInternalname( sPrefix+"PRDZDHC" );
      edtPrdTHELIST_Internalname = sPrefix+"PRDTHELIST" ;
      cmbPrdList.setInternalname( sPrefix+"PRDLIST" );
      divPrdlist_cell_Internalname = sPrefix+"PRDLIST_CELL" ;
      divUnnamedtable7_Internalname = sPrefix+"UNNAMEDTABLE7" ;
      Dvpanel_unnamedtable7_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE7" ;
      edtPrdCtw1_Internalname = sPrefix+"PRDCTW1" ;
      edtPrdCtw2_Internalname = sPrefix+"PRDCTW2" ;
      edtPrdCtw3_Internalname = sPrefix+"PRDCTW3" ;
      edtPrdCtw4_Internalname = sPrefix+"PRDCTW4" ;
      divUnnamedtable8_Internalname = sPrefix+"UNNAMEDTABLE8" ;
      Dvpanel_unnamedtable8_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE8" ;
      divDvpanel_unnamedtable8_cell_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE8_CELL" ;
      edtPrdRTM_Internalname = sPrefix+"PRDRTM" ;
      edtPrdEINECS_Internalname = sPrefix+"PRDEINECS" ;
      divUnnamedtable9_Internalname = sPrefix+"UNNAMEDTABLE9" ;
      Dvpanel_unnamedtable9_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE9" ;
      edtPrdFuncion_Internalname = sPrefix+"PRDFUNCION" ;
      edtPrdNmQu_Internalname = sPrefix+"PRDNMQU" ;
      edtPrdNroCAS_Internalname = sPrefix+"PRDNROCAS" ;
      divUnnamedtable10_Internalname = sPrefix+"UNNAMEDTABLE10" ;
      Dvpanel_unnamedtable10_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE10" ;
      divUnnamedtable4_Internalname = sPrefix+"UNNAMEDTABLE4" ;
      lblTabs6_title_Internalname = sPrefix+"TABS6_TITLE" ;
      edtPrdObs_Internalname = sPrefix+"PRDOBS" ;
      divUnnamedtable3_Internalname = sPrefix+"UNNAMEDTABLE3" ;
      Gxuitabspanel_transactiondetail_tabcontrol_Internalname = sPrefix+"GXUITABSPANEL_TRANSACTIONDETAIL_TABCONTROL" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE2" ;
      divTransactiondetail_tablecontent_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLECONTENT" ;
      divTransactiondetail_tablemain_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLEMAIN" ;
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      divTable_Internalname = sPrefix+"TABLE" ;
      divLayoutmaintable_Internalname = sPrefix+"LAYOUTMAINTABLE" ;
      Form.setInternalname( sPrefix+"FORM" );
   }

   public void initialize_properties( )
   {
      httpContext.setAjaxOnSessionTimeout(ajaxOnSessionTimeout());
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      }
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
      }
      init_default_properties( ) ;
      edtPrdObs_Enabled = 0 ;
      edtPrdNroCAS_Jsonclick = "" ;
      edtPrdNroCAS_Enabled = 0 ;
      edtPrdNmQu_Enabled = 0 ;
      edtPrdFuncion_Jsonclick = "" ;
      edtPrdFuncion_Enabled = 0 ;
      edtPrdEINECS_Jsonclick = "" ;
      edtPrdEINECS_Enabled = 0 ;
      edtPrdRTM_Jsonclick = "" ;
      edtPrdRTM_Enabled = 0 ;
      edtPrdCtw4_Jsonclick = "" ;
      edtPrdCtw4_Enabled = 0 ;
      edtPrdCtw3_Jsonclick = "" ;
      edtPrdCtw3_Enabled = 0 ;
      edtPrdCtw2_Jsonclick = "" ;
      edtPrdCtw2_Enabled = 0 ;
      edtPrdCtw1_Jsonclick = "" ;
      edtPrdCtw1_Enabled = 0 ;
      divDvpanel_unnamedtable8_cell_Class = "col-xs-12 col-sm-6" ;
      cmbPrdList.setJsonclick( "" );
      cmbPrdList.setEnabled( 0 );
      cmbPrdList.setVisible( 1 );
      divPrdlist_cell_Class = "col-xs-12 col-sm-6" ;
      edtPrdTHELIST_Jsonclick = "" ;
      edtPrdTHELIST_Enabled = 0 ;
      cmbPrdZDHC.setJsonclick( "" );
      cmbPrdZDHC.setEnabled( 0 );
      edtPrdHm_Jsonclick = "" ;
      edtPrdHm_Enabled = 0 ;
      edtPrdGots_Jsonclick = "" ;
      edtPrdGots_Enabled = 0 ;
      cmbPrdOkotex.setJsonclick( "" );
      cmbPrdOkotex.setEnabled( 0 );
      cmbPrdReach.setJsonclick( "" );
      cmbPrdReach.setEnabled( 0 );
      edtPrdAox_Jsonclick = "" ;
      edtPrdAox_Enabled = 0 ;
      edtPrdFHS_Jsonclick = "" ;
      edtPrdFHS_Enabled = 0 ;
      cmbPrdHS.setJsonclick( "" );
      cmbPrdHS.setEnabled( 0 );
      edtPrdFFT_Jsonclick = "" ;
      edtPrdFFT_Enabled = 0 ;
      cmbPrdFT.setJsonclick( "" );
      cmbPrdFT.setEnabled( 0 );
      edtPrdComp_Jsonclick = "" ;
      edtPrdComp_Enabled = 0 ;
      edtPrdInc_Jsonclick = "" ;
      edtPrdInc_Enabled = 0 ;
      edtPrdInc_Visible = 1 ;
      divPrdinc_cell_Class = "col-xs-12" ;
      edtPrdPesTerm_Jsonclick = "" ;
      edtPrdPesTerm_Enabled = 0 ;
      chkPrdPesCon.setEnabled( 0 );
      edtPrdNumct2_Jsonclick = "" ;
      edtPrdNumct2_Enabled = 0 ;
      edtPrdNumct1_Jsonclick = "" ;
      edtPrdNumct1_Enabled = 0 ;
      edtPrdConcS_Jsonclick = "" ;
      edtPrdConcS_Enabled = 0 ;
      edtPrdDensS_Jsonclick = "" ;
      edtPrdDensS_Enabled = 0 ;
      chkPrdSal.setEnabled( 0 );
      chkPrdSalM.setEnabled( 0 );
      edtPrdHorMad_Jsonclick = "" ;
      edtPrdHorMad_Enabled = 0 ;
      edtPrdNumCent_Jsonclick = "" ;
      edtPrdNumCent_Enabled = 0 ;
      edtPrdSolub_Jsonclick = "" ;
      edtPrdSolub_Enabled = 0 ;
      edtPrdTnq_Jsonclick = "" ;
      edtPrdTnq_Enabled = 0 ;
      cmbPrdTip.setJsonclick( "" );
      cmbPrdTip.setEnabled( 0 );
      edtPrdPosY_Jsonclick = "" ;
      edtPrdPosY_Enabled = 0 ;
      edtPrdPosX_Jsonclick = "" ;
      edtPrdPosX_Enabled = 0 ;
      edtPrdNumUco_Jsonclick = "" ;
      edtPrdNumUco_Enabled = 0 ;
      edtPrdLotMin_Jsonclick = "" ;
      edtPrdLotMin_Enabled = 0 ;
      edtMetCod_Jsonclick = "" ;
      edtMetCod_Enabled = 0 ;
      edtPrdPlaEnt_Jsonclick = "" ;
      edtPrdPlaEnt_Enabled = 0 ;
      edtPrdDiaRot_Jsonclick = "" ;
      edtPrdDiaRot_Enabled = 0 ;
      edtPrdStkMinD_Jsonclick = "" ;
      edtPrdStkMinD_Enabled = 0 ;
      edtPrdStkMinU_Jsonclick = "" ;
      edtPrdStkMinU_Enabled = 0 ;
      edtPrdConDia_Jsonclick = "" ;
      edtPrdConDia_Enabled = 0 ;
      edtPrdPreMed_Jsonclick = "" ;
      edtPrdPreMed_Enabled = 0 ;
      edtPrdPreMed_Visible = 1 ;
      divPrdpremed_cell_Class = "col-xs-12 col-sm-6" ;
      edtPrdPreAnt_Jsonclick = "" ;
      edtPrdPreAnt_Enabled = 0 ;
      edtPrdFecPre_Jsonclick = "" ;
      edtPrdFecPre_Enabled = 0 ;
      edtPrdPreAc2_Jsonclick = "" ;
      edtPrdPreAc2_Enabled = 0 ;
      edtPrdPreAct_Jsonclick = "" ;
      edtPrdPreAct_Enabled = 0 ;
      edtPrdFulPed_Jsonclick = "" ;
      edtPrdFulPed_Enabled = 0 ;
      edtPrdFulEnt_Jsonclick = "" ;
      edtPrdFulEnt_Enabled = 0 ;
      edtPrdExiCC_Jsonclick = "" ;
      edtPrdExiCC_Enabled = 0 ;
      edtPrdCanPen_Jsonclick = "" ;
      edtPrdCanPen_Enabled = 0 ;
      edtPrdCanRes_Jsonclick = "" ;
      edtPrdCanRes_Enabled = 0 ;
      edtPrdExiAlmc_Jsonclick = "" ;
      edtPrdExiAlmc_Enabled = 0 ;
      edtPrdExiAlm_Jsonclick = "" ;
      edtPrdExiAlm_Enabled = 0 ;
      edtTipDtoCod_Jsonclick = "" ;
      edtTipDtoCod_Enabled = 0 ;
      cmbPrdDetPar.setJsonclick( "" );
      cmbPrdDetPar.setEnabled( 0 );
      cmbPrdCalNec.setJsonclick( "" );
      cmbPrdCalNec.setEnabled( 0 );
      edtPrdDqo_Jsonclick = "" ;
      edtPrdDqo_Enabled = 0 ;
      cmbPrdRec.setJsonclick( "" );
      cmbPrdRec.setEnabled( 0 );
      edtPrdRev_Jsonclick = "" ;
      edtPrdRev_Enabled = 0 ;
      edtPrdConct_Jsonclick = "" ;
      edtPrdConct_Enabled = 0 ;
      dynValCod.setJsonclick( "" );
      dynValCod.setEnabled( 0 );
      edtPrdFacCon_Jsonclick = "" ;
      edtPrdFacCon_Enabled = 0 ;
      dynPrdUniCon.setJsonclick( "" );
      dynPrdUniCon.setEnabled( 0 );
      dynPrdUniCom.setJsonclick( "" );
      dynPrdUniCom.setEnabled( 0 );
      edtSubFamCod_Jsonclick = "" ;
      edtSubFamCod_Enabled = 0 ;
      edtSubFamCod_Visible = 1 ;
      divSubfamcod_cell_Class = "col-xs-12 col-sm-4" ;
      chkPrdLoteOb.setEnabled( 0 );
      chkPrdLoteOb.setVisible( 1 );
      divPrdloteob_cell_Class = "col-xs-12 col-sm-4" ;
      edtPrdLote_Jsonclick = "" ;
      edtPrdLote_Enabled = 0 ;
      edtPrdColIdx_Jsonclick = "" ;
      edtPrdColIdx_Enabled = 0 ;
      dynPrdUMeFo.setJsonclick( "" );
      dynPrdUMeFo.setEnabled( 0 );
      edtPrdFabId_Jsonclick = "" ;
      edtPrdFabId_Enabled = 0 ;
      edtPrdRefPrv_Jsonclick = "" ;
      edtPrdRefPrv_Enabled = 0 ;
      edtPrvNum_Jsonclick = "" ;
      edtPrvNum_Enabled = 0 ;
      edtPrdNom2_Jsonclick = "" ;
      edtPrdNom2_Enabled = 0 ;
      edtPrdNum2_Jsonclick = "" ;
      edtPrdNum2_Enabled = 0 ;
      edtTipPrdCod_Jsonclick = "" ;
      edtTipPrdCod_Enabled = 0 ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNom_Link = "" ;
      edtPrdNom_Enabled = 0 ;
      edtPrdNum_Jsonclick = "" ;
      edtPrdNum_Enabled = 0 ;
      edtPrdDisponi_Jsonclick = "" ;
      edtPrdDisponi_Enabled = 0 ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "Mas Datos", "") ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      Gxuitabspanel_transactiondetail_tabcontrol_Historymanagement = GXutil.toBoolean( 0) ;
      Gxuitabspanel_transactiondetail_tabcontrol_Class = "" ;
      Gxuitabspanel_transactiondetail_tabcontrol_Pagecount = 6 ;
      Dvpanel_unnamedtable10_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable10_Iconposition = "Right" ;
      Dvpanel_unnamedtable10_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable10_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable10_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable10_Title = httpContext.getMessage( "Otros", "") ;
      Dvpanel_unnamedtable10_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable10_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable10_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable10_Width = "100%" ;
      Dvpanel_unnamedtable9_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable9_Iconposition = "Right" ;
      Dvpanel_unnamedtable9_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable9_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable9_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable9_Title = httpContext.getMessage( "RTM", "") ;
      Dvpanel_unnamedtable9_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable9_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable9_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable9_Width = "100%" ;
      Dvpanel_unnamedtable8_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable8_Iconposition = "Right" ;
      Dvpanel_unnamedtable8_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable8_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable8_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable8_Title = httpContext.getMessage( "Inditex", "") ;
      Dvpanel_unnamedtable8_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable8_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable8_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable8_Width = "100%" ;
      Dvpanel_unnamedtable7_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Iconposition = "Right" ;
      Dvpanel_unnamedtable7_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable7_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable7_Title = httpContext.getMessage( "Normas ", "") ;
      Dvpanel_unnamedtable7_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable7_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable7_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Width = "100%" ;
      Dvpanel_unnamedtable6_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Iconposition = "Right" ;
      Dvpanel_unnamedtable6_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable6_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable6_Title = httpContext.getMessage( "Ficha", "") ;
      Dvpanel_unnamedtable6_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable6_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable6_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Width = "100%" ;
      Dvpanel_unnamedtable5_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Iconposition = "Right" ;
      Dvpanel_unnamedtable5_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable5_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable5_Title = httpContext.getMessage( "ISO", "") ;
      Dvpanel_unnamedtable5_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable5_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable5_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Width = "100%" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Informacion Existencias", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Dvpanel_transactiondetail_tableattributes_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tableattributes_Iconposition = "Right" ;
      Dvpanel_transactiondetail_tableattributes_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tableattributes_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tableattributes_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tableattributes_Title = httpContext.getMessage( "WWP_TemplateDataPanelTitle", "") ;
      Dvpanel_transactiondetail_tableattributes_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_transactiondetail_tableattributes_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_transactiondetail_tableattributes_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tableattributes_Width = "100%" ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
      }
   }

   public void init_web_controls( )
   {
      dynPrdUMeFo.setName( "PRDUMEFO" );
      dynPrdUMeFo.setWebtags( "" );
      chkPrdLoteOb.setName( "PRDLOTEOB" );
      chkPrdLoteOb.setWebtags( "" );
      chkPrdLoteOb.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkPrdLoteOb.getInternalname(), "TitleCaption", chkPrdLoteOb.getCaption(), true);
      chkPrdLoteOb.setCheckedValue( "N" );
      dynPrdUniCom.setName( "PRDUNICOM" );
      dynPrdUniCom.setWebtags( "" );
      dynPrdUniCon.setName( "PRDUNICON" );
      dynPrdUniCon.setWebtags( "" );
      dynValCod.setName( "VALCOD" );
      dynValCod.setWebtags( "" );
      cmbPrdRec.setName( "PRDREC" );
      cmbPrdRec.setWebtags( "" );
      cmbPrdRec.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbPrdRec.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbPrdRec.getItemCount() > 0 )
      {
      }
      cmbPrdCalNec.setName( "PRDCALNEC" );
      cmbPrdCalNec.setWebtags( "" );
      cmbPrdCalNec.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbPrdCalNec.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbPrdCalNec.getItemCount() > 0 )
      {
      }
      cmbPrdDetPar.setName( "PRDDETPAR" );
      cmbPrdDetPar.setWebtags( "" );
      cmbPrdDetPar.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbPrdDetPar.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbPrdDetPar.getItemCount() > 0 )
      {
      }
      cmbPrdTip.setName( "PRDTIP" );
      cmbPrdTip.setWebtags( "" );
      cmbPrdTip.addItem("M", httpContext.getMessage( "Manual", ""), (short)(0));
      cmbPrdTip.addItem("A", httpContext.getMessage( "Automatico", ""), (short)(0));
      if ( cmbPrdTip.getItemCount() > 0 )
      {
      }
      chkPrdSalM.setName( "PRDSALM" );
      chkPrdSalM.setWebtags( "" );
      chkPrdSalM.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkPrdSalM.getInternalname(), "TitleCaption", chkPrdSalM.getCaption(), true);
      chkPrdSalM.setCheckedValue( "N" );
      chkPrdSal.setName( "PRDSAL" );
      chkPrdSal.setWebtags( "" );
      chkPrdSal.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkPrdSal.getInternalname(), "TitleCaption", chkPrdSal.getCaption(), true);
      chkPrdSal.setCheckedValue( "N" );
      chkPrdPesCon.setName( "PRDPESCON" );
      chkPrdPesCon.setWebtags( "" );
      chkPrdPesCon.setCaption( httpContext.getMessage( "Controlar", "") );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkPrdPesCon.getInternalname(), "TitleCaption", chkPrdPesCon.getCaption(), true);
      chkPrdPesCon.setCheckedValue( "0" );
      cmbPrdFT.setName( "PRDFT" );
      cmbPrdFT.setWebtags( "" );
      cmbPrdFT.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbPrdFT.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbPrdFT.getItemCount() > 0 )
      {
      }
      cmbPrdHS.setName( "PRDHS" );
      cmbPrdHS.setWebtags( "" );
      cmbPrdHS.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbPrdHS.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbPrdHS.getItemCount() > 0 )
      {
      }
      cmbPrdReach.setName( "PRDREACH" );
      cmbPrdReach.setWebtags( "" );
      cmbPrdReach.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbPrdReach.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbPrdReach.getItemCount() > 0 )
      {
      }
      cmbPrdOkotex.setName( "PRDOKOTEX" );
      cmbPrdOkotex.setWebtags( "" );
      cmbPrdOkotex.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbPrdOkotex.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbPrdOkotex.getItemCount() > 0 )
      {
      }
      cmbPrdZDHC.setName( "PRDZDHC" );
      cmbPrdZDHC.setWebtags( "" );
      cmbPrdZDHC.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbPrdZDHC.addItem("1", httpContext.getMessage( "Nivel 1", ""), (short)(0));
      cmbPrdZDHC.addItem("2", httpContext.getMessage( "Nivel 2", ""), (short)(0));
      cmbPrdZDHC.addItem("3", httpContext.getMessage( "Nivel 3", ""), (short)(0));
      if ( cmbPrdZDHC.getItemCount() > 0 )
      {
      }
      cmbPrdList.setName( "PRDLIST" );
      cmbPrdList.setWebtags( "" );
      cmbPrdList.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      cmbPrdList.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      if ( cmbPrdList.getItemCount() > 0 )
      {
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynPrdUMeFo'},{av:'A4338PrdUMeFo',fld:'PRDUMEFO',pic:'9'},{av:'dynPrdUniCom'},{av:'A742PrdUniCom',fld:'PRDUNICOM',pic:'9'},{av:'dynPrdUniCon'},{av:'A743PrdUniCon',fld:'PRDUNICON',pic:'9'},{av:'dynValCod'},{av:'A856ValCod',fld:'VALCOD',pic:'9'},{av:'A12957PrdLoteOb',fld:'PRDLOTEOB',pic:''},{av:'A5418PrdSalM',fld:'PRDSALM',pic:''},{av:'A8936PrdSal',fld:'PRDSAL',pic:''},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOUPDATE'","{handler:'e11VC1',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''}]");
      setEventMetadata("'DOUPDATE'",",oparms:[]}");
      setEventMetadata("'DODELETE'","{handler:'e12VC1',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''}]");
      setEventMetadata("'DODELETE'",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[]");
      setEventMetadata("VALID_PRDNUM",",oparms:[]}");
      setEventMetadata("VALID_TIPPRDCOD","{handler:'valid_Tipprdcod',iparms:[]");
      setEventMetadata("VALID_TIPPRDCOD",",oparms:[]}");
      setEventMetadata("VALID_PRVNUM","{handler:'valid_Prvnum',iparms:[]");
      setEventMetadata("VALID_PRVNUM",",oparms:[]}");
      setEventMetadata("VALID_PRDFABID","{handler:'valid_Prdfabid',iparms:[]");
      setEventMetadata("VALID_PRDFABID",",oparms:[]}");
      setEventMetadata("VALID_TIPDTOCOD","{handler:'valid_Tipdtocod',iparms:[]");
      setEventMetadata("VALID_TIPDTOCOD",",oparms:[]}");
      setEventMetadata("VALID_PRDEXIALM","{handler:'valid_Prdexialm',iparms:[]");
      setEventMetadata("VALID_PRDEXIALM",",oparms:[]}");
      setEventMetadata("VALID_PRDCANRES","{handler:'valid_Prdcanres',iparms:[]");
      setEventMetadata("VALID_PRDCANRES",",oparms:[]}");
      setEventMetadata("VALID_METCOD","{handler:'valid_Metcod',iparms:[]");
      setEventMetadata("VALID_METCOD",",oparms:[]}");
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
      wcpOA719PrdNum = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      A13777TipPrdCDsc = "" ;
      A13719PrvNNom = "" ;
      A13776PrdFabIDNm = "" ;
      A13774TipDtoCDsc = "" ;
      A13778MetCDsc = "" ;
      h6301TipPrdCod = "" ;
      h795PrvNum = "" ;
      h12714PrdFabId = "" ;
      h835TipDtoCod = "" ;
      h629MetCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_transactiondetail_tableattributes = new com.genexus.webpanels.GXUserControl();
      A13831PrdDisponi = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      A4693PrdNum2 = "" ;
      A4692PrdNom2 = "" ;
      A728PrdRefPrv = "" ;
      A10119PrdColIdx = "" ;
      A10881PrdLote = "" ;
      ClassString = "" ;
      StyleString = "" ;
      A12957PrdLoteOb = "" ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A3004PrdRev = "" ;
      A727PrdRec = "" ;
      A682PrdCalNec = "" ;
      A698PrdDetPar = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A8659PrdExiAlmc = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A684PrdCanPen = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A713PrdFulEnt = GXutil.nullDate() ;
      A714PrdFulPed = GXutil.nullDate() ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      ucGxuitabspanel_transactiondetail_tabcontrol = new com.genexus.webpanels.GXUserControl();
      lblTabs1_title_Jsonclick = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A5255PrdPreAc2 = DecimalUtil.ZERO ;
      A709PrdFecPre = GXutil.nullDate() ;
      A725PrdPreAnt = DecimalUtil.ZERO ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      lblTabs2_title_Jsonclick = "" ;
      A696PrdConDia = DecimalUtil.ZERO ;
      A732PrdStkMinU = DecimalUtil.ZERO ;
      A721PrdNumUco = DecimalUtil.ZERO ;
      lblTabs3_title_Jsonclick = "" ;
      A1643PrdTip = "" ;
      A5590PrdSolub = DecimalUtil.ZERO ;
      A6191PrdNumCent = "" ;
      A5418PrdSalM = "" ;
      A8936PrdSal = "" ;
      A5416PrdDensS = DecimalUtil.ZERO ;
      A5417PrdConcS = DecimalUtil.ZERO ;
      A7226PrdNumct1 = DecimalUtil.ZERO ;
      A7227PrdNumct2 = DecimalUtil.ZERO ;
      lblTabs4_title_Jsonclick = "" ;
      A8897PrdPesTerm = "" ;
      lblTabs5_title_Jsonclick = "" ;
      ucDvpanel_unnamedtable5 = new com.genexus.webpanels.GXUserControl();
      A9731PrdInc = "" ;
      A9732PrdComp = "" ;
      ucDvpanel_unnamedtable6 = new com.genexus.webpanels.GXUserControl();
      A9739PrdFT = "" ;
      A9740PrdFFT = GXutil.nullDate() ;
      A9741PrdHS = "" ;
      A9742PrdFHS = GXutil.nullDate() ;
      ucDvpanel_unnamedtable7 = new com.genexus.webpanels.GXUserControl();
      A9733PrdAox = DecimalUtil.ZERO ;
      A5887PrdReach = "" ;
      A5888PrdOkotex = "" ;
      A11363PrdGots = "" ;
      A11364PrdHm = "" ;
      A13301PrdZDHC = "" ;
      A13302PrdTHELIST = "" ;
      A11687PrdList = "" ;
      ucDvpanel_unnamedtable8 = new com.genexus.webpanels.GXUserControl();
      A10936PrdCtw1 = "" ;
      A10937PrdCtw2 = "" ;
      A10938PrdCtw3 = "" ;
      A11663PrdCtw4 = "" ;
      ucDvpanel_unnamedtable9 = new com.genexus.webpanels.GXUserControl();
      A10935PrdRTM = "" ;
      A11614PrdEINECS = "" ;
      ucDvpanel_unnamedtable10 = new com.genexus.webpanels.GXUserControl();
      A11615PrdFuncion = "" ;
      A11616PrdNmQu = "" ;
      A11196PrdNroCAS = "" ;
      lblTabs6_title_Jsonclick = "" ;
      A4694PrdObs = "" ;
      TempTags = "" ;
      bttBtnupdate_Jsonclick = "" ;
      bttBtndelete_Jsonclick = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      l13777TipPrdCDsc = "" ;
      H00VC2_A13777TipPrdCDsc = new String[] {""} ;
      l13719PrvNNom = "" ;
      H00VC3_A13719PrvNNom = new String[] {""} ;
      l13776PrdFabIDNm = "" ;
      H00VC4_A13776PrdFabIDNm = new String[] {""} ;
      l13774TipDtoCDsc = "" ;
      H00VC5_A13774TipDtoCDsc = new String[] {""} ;
      l13778MetCDsc = "" ;
      H00VC6_A13778MetCDsc = new String[] {""} ;
      H00VC7_A13777TipPrdCDsc = new String[] {""} ;
      H00VC7_A396EmprCod = new String[] {""} ;
      H00VC7_A6301TipPrdCod = new short[1] ;
      H00VC7_n6301TipPrdCod = new boolean[] {false} ;
      H00VC8_A13719PrvNNom = new String[] {""} ;
      H00VC8_A396EmprCod = new String[] {""} ;
      H00VC8_A795PrvNum = new int[1] ;
      H00VC9_A13776PrdFabIDNm = new String[] {""} ;
      H00VC9_A396EmprCod = new String[] {""} ;
      H00VC9_A12714PrdFabId = new int[1] ;
      H00VC9_n12714PrdFabId = new boolean[] {false} ;
      H00VC10_A13774TipDtoCDsc = new String[] {""} ;
      H00VC10_A396EmprCod = new String[] {""} ;
      H00VC10_A835TipDtoCod = new byte[1] ;
      H00VC10_n835TipDtoCod = new boolean[] {false} ;
      H00VC11_A13778MetCDsc = new String[] {""} ;
      H00VC11_A396EmprCod = new String[] {""} ;
      H00VC11_A629MetCod = new byte[1] ;
      H00VC11_n629MetCod = new boolean[] {false} ;
      H00VC12_A396EmprCod = new String[] {""} ;
      H00VC12_A490ForPrdUMe = new byte[1] ;
      H00VC12_A488ForPrdDsc = new String[] {""} ;
      H00VC12_n488ForPrdDsc = new boolean[] {false} ;
      H00VC13_A396EmprCod = new String[] {""} ;
      H00VC13_A742PrdUniCom = new byte[1] ;
      H00VC13_A737PrdUcpDsc = new String[] {""} ;
      H00VC13_n737PrdUcpDsc = new boolean[] {false} ;
      H00VC14_A396EmprCod = new String[] {""} ;
      H00VC14_A743PrdUniCon = new byte[1] ;
      H00VC14_A736PrdUcoDsc = new String[] {""} ;
      H00VC14_n736PrdUcoDsc = new boolean[] {false} ;
      H00VC15_A396EmprCod = new String[] {""} ;
      H00VC15_A856ValCod = new byte[1] ;
      H00VC15_A857ValDsc = new String[] {""} ;
      H00VC15_n857ValDsc = new boolean[] {false} ;
      AV15Pgmname = "" ;
      H00VC16_A396EmprCod = new String[] {""} ;
      H00VC16_A719PrdNum = new String[] {""} ;
      H00VC16_A4694PrdObs = new String[] {""} ;
      H00VC16_A11196PrdNroCAS = new String[] {""} ;
      H00VC16_A11616PrdNmQu = new String[] {""} ;
      H00VC16_A11615PrdFuncion = new String[] {""} ;
      H00VC16_A11614PrdEINECS = new String[] {""} ;
      H00VC16_A10935PrdRTM = new String[] {""} ;
      H00VC16_A11663PrdCtw4 = new String[] {""} ;
      H00VC16_A10938PrdCtw3 = new String[] {""} ;
      H00VC16_A10937PrdCtw2 = new String[] {""} ;
      H00VC16_A10936PrdCtw1 = new String[] {""} ;
      H00VC16_A11687PrdList = new String[] {""} ;
      H00VC16_A13302PrdTHELIST = new String[] {""} ;
      H00VC16_n13302PrdTHELIST = new boolean[] {false} ;
      H00VC16_A13301PrdZDHC = new String[] {""} ;
      H00VC16_A11364PrdHm = new String[] {""} ;
      H00VC16_A11363PrdGots = new String[] {""} ;
      H00VC16_A5888PrdOkotex = new String[] {""} ;
      H00VC16_A5887PrdReach = new String[] {""} ;
      H00VC16_A9733PrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00VC16_A9742PrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      H00VC16_A9741PrdHS = new String[] {""} ;
      H00VC16_A9740PrdFFT = new java.util.Date[] {GXutil.nullDate()} ;
      H00VC16_A9739PrdFT = new String[] {""} ;
      H00VC16_A9732PrdComp = new String[] {""} ;
      H00VC16_A9731PrdInc = new String[] {""} ;
      H00VC16_A8897PrdPesTerm = new String[] {""} ;
      H00VC16_A8896PrdPesCon = new byte[1] ;
      H00VC16_A7227PrdNumct2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00VC16_A7226PrdNumct1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00VC16_A5417PrdConcS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00VC16_A5416PrdDensS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00VC16_A8936PrdSal = new String[] {""} ;
      H00VC16_A5418PrdSalM = new String[] {""} ;
      H00VC16_A7260PrdHorMad = new byte[1] ;
      H00VC16_A6191PrdNumCent = new String[] {""} ;
      H00VC16_A5590PrdSolub = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00VC16_A3273PrdTnq = new byte[1] ;
      H00VC16_A1643PrdTip = new String[] {""} ;
      H00VC16_A1194PrdPosY = new byte[1] ;
      H00VC16_A1193PrdPosX = new short[1] ;
      H00VC16_A721PrdNumUco = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00VC16_A716PrdLotMin = new short[1] ;
      H00VC16_A629MetCod = new byte[1] ;
      H00VC16_n629MetCod = new boolean[] {false} ;
      H00VC16_A722PrdPlaEnt = new short[1] ;
      H00VC16_A699PrdDiaRot = new short[1] ;
      H00VC16_A731PrdStkMinD = new short[1] ;
      H00VC16_A732PrdStkMinU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00VC16_A696PrdConDia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00VC16_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00VC16_A725PrdPreAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00VC16_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      H00VC16_A5255PrdPreAc2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00VC16_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00VC16_A714PrdFulPed = new java.util.Date[] {GXutil.nullDate()} ;
      H00VC16_A713PrdFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      H00VC16_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00VC16_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00VC16_A8659PrdExiAlmc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00VC16_A835TipDtoCod = new byte[1] ;
      H00VC16_n835TipDtoCod = new boolean[] {false} ;
      H00VC16_A698PrdDetPar = new String[] {""} ;
      H00VC16_A682PrdCalNec = new String[] {""} ;
      H00VC16_A1644PrdDqo = new short[1] ;
      H00VC16_A727PrdRec = new String[] {""} ;
      H00VC16_A3004PrdRev = new String[] {""} ;
      H00VC16_A11470PrdConct = new short[1] ;
      H00VC16_A856ValCod = new byte[1] ;
      H00VC16_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00VC16_A743PrdUniCon = new byte[1] ;
      H00VC16_A742PrdUniCom = new byte[1] ;
      H00VC16_A9609SubFamCod = new byte[1] ;
      H00VC16_n9609SubFamCod = new boolean[] {false} ;
      H00VC16_A12957PrdLoteOb = new String[] {""} ;
      H00VC16_A10881PrdLote = new String[] {""} ;
      H00VC16_A10119PrdColIdx = new String[] {""} ;
      H00VC16_A4338PrdUMeFo = new byte[1] ;
      H00VC16_A12714PrdFabId = new int[1] ;
      H00VC16_n12714PrdFabId = new boolean[] {false} ;
      H00VC16_A728PrdRefPrv = new String[] {""} ;
      H00VC16_A795PrvNum = new int[1] ;
      H00VC16_A4692PrdNom2 = new String[] {""} ;
      H00VC16_A4693PrdNum2 = new String[] {""} ;
      H00VC16_A6301TipPrdCod = new short[1] ;
      H00VC16_n6301TipPrdCod = new boolean[] {false} ;
      H00VC16_A718PrdNom = new String[] {""} ;
      H00VC16_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00VC16_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00VC17_A13777TipPrdCDsc = new String[] {""} ;
      H00VC17_A396EmprCod = new String[] {""} ;
      H00VC17_A6301TipPrdCod = new short[1] ;
      H00VC17_n6301TipPrdCod = new boolean[] {false} ;
      H00VC18_A13719PrvNNom = new String[] {""} ;
      H00VC18_A396EmprCod = new String[] {""} ;
      H00VC18_A795PrvNum = new int[1] ;
      H00VC19_A13776PrdFabIDNm = new String[] {""} ;
      H00VC19_A396EmprCod = new String[] {""} ;
      H00VC19_A12714PrdFabId = new int[1] ;
      H00VC19_n12714PrdFabId = new boolean[] {false} ;
      H00VC20_A13774TipDtoCDsc = new String[] {""} ;
      H00VC20_A396EmprCod = new String[] {""} ;
      H00VC20_A835TipDtoCod = new byte[1] ;
      H00VC20_n835TipDtoCod = new boolean[] {false} ;
      H00VC21_A13778MetCDsc = new String[] {""} ;
      H00VC21_A396EmprCod = new String[] {""} ;
      H00VC21_A629MetCod = new byte[1] ;
      H00VC21_n629MetCod = new boolean[] {false} ;
      H00VC22_A13777TipPrdCDsc = new String[] {""} ;
      H00VC22_A396EmprCod = new String[] {""} ;
      H00VC22_A6301TipPrdCod = new short[1] ;
      H00VC22_n6301TipPrdCod = new boolean[] {false} ;
      H00VC23_A13719PrvNNom = new String[] {""} ;
      H00VC23_A396EmprCod = new String[] {""} ;
      H00VC23_A795PrvNum = new int[1] ;
      H00VC24_A13776PrdFabIDNm = new String[] {""} ;
      H00VC24_A396EmprCod = new String[] {""} ;
      H00VC24_A12714PrdFabId = new int[1] ;
      H00VC24_n12714PrdFabId = new boolean[] {false} ;
      H00VC25_A13774TipDtoCDsc = new String[] {""} ;
      H00VC25_A396EmprCod = new String[] {""} ;
      H00VC25_A835TipDtoCod = new byte[1] ;
      H00VC25_n835TipDtoCod = new boolean[] {false} ;
      H00VC26_A13778MetCDsc = new String[] {""} ;
      H00VC26_A396EmprCod = new String[] {""} ;
      H00VC26_A629MetCod = new byte[1] ;
      H00VC26_n629MetCod = new boolean[] {false} ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV14Emprcod = "" ;
      AV7TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV10HTTPRequest = httpContext.getHttpRequest();
      AV9Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA396EmprCod = "" ;
      sCtrlA719PrdNum = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttproducgeneral__default(),
         new Object[] {
             new Object[] {
            H00VC2_A13777TipPrdCDsc
            }
            , new Object[] {
            H00VC3_A13719PrvNNom
            }
            , new Object[] {
            H00VC4_A13776PrdFabIDNm
            }
            , new Object[] {
            H00VC5_A13774TipDtoCDsc
            }
            , new Object[] {
            H00VC6_A13778MetCDsc
            }
            , new Object[] {
            H00VC7_A13777TipPrdCDsc, H00VC7_A396EmprCod, H00VC7_A6301TipPrdCod
            }
            , new Object[] {
            H00VC8_A13719PrvNNom, H00VC8_A396EmprCod, H00VC8_A795PrvNum
            }
            , new Object[] {
            H00VC9_A13776PrdFabIDNm, H00VC9_A396EmprCod, H00VC9_A12714PrdFabId
            }
            , new Object[] {
            H00VC10_A13774TipDtoCDsc, H00VC10_A396EmprCod, H00VC10_A835TipDtoCod
            }
            , new Object[] {
            H00VC11_A13778MetCDsc, H00VC11_A396EmprCod, H00VC11_A629MetCod
            }
            , new Object[] {
            H00VC12_A396EmprCod, H00VC12_A490ForPrdUMe, H00VC12_A488ForPrdDsc, H00VC12_n488ForPrdDsc
            }
            , new Object[] {
            H00VC13_A396EmprCod, H00VC13_A742PrdUniCom, H00VC13_A737PrdUcpDsc, H00VC13_n737PrdUcpDsc
            }
            , new Object[] {
            H00VC14_A396EmprCod, H00VC14_A743PrdUniCon, H00VC14_A736PrdUcoDsc, H00VC14_n736PrdUcoDsc
            }
            , new Object[] {
            H00VC15_A396EmprCod, H00VC15_A856ValCod, H00VC15_A857ValDsc, H00VC15_n857ValDsc
            }
            , new Object[] {
            H00VC16_A396EmprCod, H00VC16_A719PrdNum, H00VC16_A4694PrdObs, H00VC16_A11196PrdNroCAS, H00VC16_A11616PrdNmQu, H00VC16_A11615PrdFuncion, H00VC16_A11614PrdEINECS, H00VC16_A10935PrdRTM, H00VC16_A11663PrdCtw4, H00VC16_A10938PrdCtw3,
            H00VC16_A10937PrdCtw2, H00VC16_A10936PrdCtw1, H00VC16_A11687PrdList, H00VC16_A13302PrdTHELIST, H00VC16_n13302PrdTHELIST, H00VC16_A13301PrdZDHC, H00VC16_A11364PrdHm, H00VC16_A11363PrdGots, H00VC16_A5888PrdOkotex, H00VC16_A5887PrdReach,
            H00VC16_A9733PrdAox, H00VC16_A9742PrdFHS, H00VC16_A9741PrdHS, H00VC16_A9740PrdFFT, H00VC16_A9739PrdFT, H00VC16_A9732PrdComp, H00VC16_A9731PrdInc, H00VC16_A8897PrdPesTerm, H00VC16_A8896PrdPesCon, H00VC16_A7227PrdNumct2,
            H00VC16_A7226PrdNumct1, H00VC16_A5417PrdConcS, H00VC16_A5416PrdDensS, H00VC16_A8936PrdSal, H00VC16_A5418PrdSalM, H00VC16_A7260PrdHorMad, H00VC16_A6191PrdNumCent, H00VC16_A5590PrdSolub, H00VC16_A3273PrdTnq, H00VC16_A1643PrdTip,
            H00VC16_A1194PrdPosY, H00VC16_A1193PrdPosX, H00VC16_A721PrdNumUco, H00VC16_A716PrdLotMin, H00VC16_A629MetCod, H00VC16_n629MetCod, H00VC16_A722PrdPlaEnt, H00VC16_A699PrdDiaRot, H00VC16_A731PrdStkMinD, H00VC16_A732PrdStkMinU,
            H00VC16_A696PrdConDia, H00VC16_A726PrdPreMed, H00VC16_A725PrdPreAnt, H00VC16_A709PrdFecPre, H00VC16_A5255PrdPreAc2, H00VC16_A724PrdPreAct, H00VC16_A714PrdFulPed, H00VC16_A713PrdFulEnt, H00VC16_A705PrdExiCC, H00VC16_A684PrdCanPen,
            H00VC16_A8659PrdExiAlmc, H00VC16_A835TipDtoCod, H00VC16_n835TipDtoCod, H00VC16_A698PrdDetPar, H00VC16_A682PrdCalNec, H00VC16_A1644PrdDqo, H00VC16_A727PrdRec, H00VC16_A3004PrdRev, H00VC16_A11470PrdConct, H00VC16_A856ValCod,
            H00VC16_A707PrdFacCon, H00VC16_A743PrdUniCon, H00VC16_A742PrdUniCom, H00VC16_A9609SubFamCod, H00VC16_n9609SubFamCod, H00VC16_A12957PrdLoteOb, H00VC16_A10881PrdLote, H00VC16_A10119PrdColIdx, H00VC16_A4338PrdUMeFo, H00VC16_A12714PrdFabId,
            H00VC16_n12714PrdFabId, H00VC16_A728PrdRefPrv, H00VC16_A795PrvNum, H00VC16_A4692PrdNom2, H00VC16_A4693PrdNum2, H00VC16_A6301TipPrdCod, H00VC16_n6301TipPrdCod, H00VC16_A718PrdNom, H00VC16_A685PrdCanRes, H00VC16_A704PrdExiAlm
            }
            , new Object[] {
            H00VC17_A13777TipPrdCDsc, H00VC17_A396EmprCod, H00VC17_A6301TipPrdCod
            }
            , new Object[] {
            H00VC18_A13719PrvNNom, H00VC18_A396EmprCod, H00VC18_A795PrvNum
            }
            , new Object[] {
            H00VC19_A13776PrdFabIDNm, H00VC19_A396EmprCod, H00VC19_A12714PrdFabId
            }
            , new Object[] {
            H00VC20_A13774TipDtoCDsc, H00VC20_A396EmprCod, H00VC20_A835TipDtoCod
            }
            , new Object[] {
            H00VC21_A13778MetCDsc, H00VC21_A396EmprCod, H00VC21_A629MetCod
            }
            , new Object[] {
            H00VC22_A13777TipPrdCDsc, H00VC22_A396EmprCod, H00VC22_A6301TipPrdCod
            }
            , new Object[] {
            H00VC23_A13719PrvNNom, H00VC23_A396EmprCod, H00VC23_A795PrvNum
            }
            , new Object[] {
            H00VC24_A13776PrdFabIDNm, H00VC24_A396EmprCod, H00VC24_A12714PrdFabId
            }
            , new Object[] {
            H00VC25_A13774TipDtoCDsc, H00VC25_A396EmprCod, H00VC25_A835TipDtoCod
            }
            , new Object[] {
            H00VC26_A13778MetCDsc, H00VC26_A396EmprCod, H00VC26_A629MetCod
            }
         }
      );
      AV15Pgmname = "TTproducGeneral" ;
      /* GeneXus formulas. */
      AV15Pgmname = "TTproducGeneral" ;
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte A835TipDtoCod ;
   private byte A629MetCod ;
   private byte A4338PrdUMeFo ;
   private byte A9609SubFamCod ;
   private byte A742PrdUniCom ;
   private byte A743PrdUniCon ;
   private byte A856ValCod ;
   private byte A1194PrdPosY ;
   private byte A3273PrdTnq ;
   private byte A7260PrdHorMad ;
   private byte A8896PrdPesCon ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short A6301TipPrdCod ;
   private short wbEnd ;
   private short wbStart ;
   private short A11470PrdConct ;
   private short A1644PrdDqo ;
   private short A731PrdStkMinD ;
   private short A699PrdDiaRot ;
   private short A722PrdPlaEnt ;
   private short A716PrdLotMin ;
   private short A1193PrdPosX ;
   private short gxcookieaux ;
   private short gxhchits ;
   private short Gx_err ;
   private int A795PrvNum ;
   private int A12714PrdFabId ;
   private int Gxuitabspanel_transactiondetail_tabcontrol_Pagecount ;
   private int edtPrdDisponi_Enabled ;
   private int edtPrdNum_Enabled ;
   private int edtPrdNom_Enabled ;
   private int edtTipPrdCod_Enabled ;
   private int edtPrdNum2_Enabled ;
   private int edtPrdNom2_Enabled ;
   private int edtPrvNum_Enabled ;
   private int edtPrdRefPrv_Enabled ;
   private int edtPrdFabId_Enabled ;
   private int edtPrdColIdx_Enabled ;
   private int edtPrdLote_Enabled ;
   private int edtSubFamCod_Visible ;
   private int edtSubFamCod_Enabled ;
   private int edtPrdFacCon_Enabled ;
   private int edtPrdConct_Enabled ;
   private int edtPrdRev_Enabled ;
   private int edtPrdDqo_Enabled ;
   private int edtTipDtoCod_Enabled ;
   private int edtPrdExiAlm_Enabled ;
   private int edtPrdExiAlmc_Enabled ;
   private int edtPrdCanRes_Enabled ;
   private int edtPrdCanPen_Enabled ;
   private int edtPrdExiCC_Enabled ;
   private int edtPrdFulEnt_Enabled ;
   private int edtPrdFulPed_Enabled ;
   private int edtPrdPreAct_Enabled ;
   private int edtPrdPreAc2_Enabled ;
   private int edtPrdFecPre_Enabled ;
   private int edtPrdPreAnt_Enabled ;
   private int edtPrdPreMed_Visible ;
   private int edtPrdPreMed_Enabled ;
   private int edtPrdConDia_Enabled ;
   private int edtPrdStkMinU_Enabled ;
   private int edtPrdStkMinD_Enabled ;
   private int edtPrdDiaRot_Enabled ;
   private int edtPrdPlaEnt_Enabled ;
   private int edtMetCod_Enabled ;
   private int edtPrdLotMin_Enabled ;
   private int edtPrdNumUco_Enabled ;
   private int edtPrdPosX_Enabled ;
   private int edtPrdPosY_Enabled ;
   private int edtPrdTnq_Enabled ;
   private int edtPrdSolub_Enabled ;
   private int edtPrdNumCent_Enabled ;
   private int edtPrdHorMad_Enabled ;
   private int edtPrdDensS_Enabled ;
   private int edtPrdConcS_Enabled ;
   private int edtPrdNumct1_Enabled ;
   private int edtPrdNumct2_Enabled ;
   private int edtPrdPesTerm_Enabled ;
   private int edtPrdInc_Visible ;
   private int edtPrdInc_Enabled ;
   private int edtPrdComp_Enabled ;
   private int edtPrdFFT_Enabled ;
   private int edtPrdFHS_Enabled ;
   private int edtPrdAox_Enabled ;
   private int edtPrdGots_Enabled ;
   private int edtPrdHm_Enabled ;
   private int edtPrdTHELIST_Enabled ;
   private int edtPrdCtw1_Enabled ;
   private int edtPrdCtw2_Enabled ;
   private int edtPrdCtw3_Enabled ;
   private int edtPrdCtw4_Enabled ;
   private int edtPrdRTM_Enabled ;
   private int edtPrdEINECS_Enabled ;
   private int edtPrdFuncion_Enabled ;
   private int edtPrdNmQu_Enabled ;
   private int edtPrdNroCAS_Enabled ;
   private int edtPrdObs_Enabled ;
   private int gxdynajaxindex ;
   private int idxLst ;
   private java.math.BigDecimal A13831PrdDisponi ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A8659PrdExiAlmc ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A684PrdCanPen ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A5255PrdPreAc2 ;
   private java.math.BigDecimal A725PrdPreAnt ;
   private java.math.BigDecimal A726PrdPreMed ;
   private java.math.BigDecimal A696PrdConDia ;
   private java.math.BigDecimal A732PrdStkMinU ;
   private java.math.BigDecimal A721PrdNumUco ;
   private java.math.BigDecimal A5590PrdSolub ;
   private java.math.BigDecimal A5416PrdDensS ;
   private java.math.BigDecimal A5417PrdConcS ;
   private java.math.BigDecimal A7226PrdNumct1 ;
   private java.math.BigDecimal A7227PrdNumct2 ;
   private java.math.BigDecimal A9733PrdAox ;
   private String wcpOA396EmprCod ;
   private String wcpOA719PrdNum ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Dvpanel_transactiondetail_tableattributes_Width ;
   private String Dvpanel_transactiondetail_tableattributes_Cls ;
   private String Dvpanel_transactiondetail_tableattributes_Title ;
   private String Dvpanel_transactiondetail_tableattributes_Iconposition ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable5_Width ;
   private String Dvpanel_unnamedtable5_Cls ;
   private String Dvpanel_unnamedtable5_Title ;
   private String Dvpanel_unnamedtable5_Iconposition ;
   private String Dvpanel_unnamedtable6_Width ;
   private String Dvpanel_unnamedtable6_Cls ;
   private String Dvpanel_unnamedtable6_Title ;
   private String Dvpanel_unnamedtable6_Iconposition ;
   private String Dvpanel_unnamedtable7_Width ;
   private String Dvpanel_unnamedtable7_Cls ;
   private String Dvpanel_unnamedtable7_Title ;
   private String Dvpanel_unnamedtable7_Iconposition ;
   private String Dvpanel_unnamedtable8_Width ;
   private String Dvpanel_unnamedtable8_Cls ;
   private String Dvpanel_unnamedtable8_Title ;
   private String Dvpanel_unnamedtable8_Iconposition ;
   private String Dvpanel_unnamedtable9_Width ;
   private String Dvpanel_unnamedtable9_Cls ;
   private String Dvpanel_unnamedtable9_Title ;
   private String Dvpanel_unnamedtable9_Iconposition ;
   private String Dvpanel_unnamedtable10_Width ;
   private String Dvpanel_unnamedtable10_Cls ;
   private String Dvpanel_unnamedtable10_Title ;
   private String Dvpanel_unnamedtable10_Iconposition ;
   private String Gxuitabspanel_transactiondetail_tabcontrol_Class ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTable_Internalname ;
   private String divTransactiondetail_tablemain_Internalname ;
   private String divTransactiondetail_tablecontent_Internalname ;
   private String Dvpanel_transactiondetail_tableattributes_Internalname ;
   private String divTransactiondetail_tableattributes_Internalname ;
   private String edtPrdDisponi_Internalname ;
   private String edtPrdDisponi_Jsonclick ;
   private String divUnnamedtable25_Internalname ;
   private String edtPrdNum_Internalname ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Internalname ;
   private String A718PrdNom ;
   private String edtPrdNom_Link ;
   private String edtPrdNom_Jsonclick ;
   private String edtTipPrdCod_Internalname ;
   private String edtTipPrdCod_Jsonclick ;
   private String divUnnamedtable26_Internalname ;
   private String edtPrdNum2_Internalname ;
   private String A4693PrdNum2 ;
   private String edtPrdNum2_Jsonclick ;
   private String edtPrdNom2_Internalname ;
   private String A4692PrdNom2 ;
   private String edtPrdNom2_Jsonclick ;
   private String divUnnamedtable27_Internalname ;
   private String edtPrvNum_Internalname ;
   private String edtPrvNum_Jsonclick ;
   private String edtPrdRefPrv_Internalname ;
   private String A728PrdRefPrv ;
   private String edtPrdRefPrv_Jsonclick ;
   private String divUnnamedtable28_Internalname ;
   private String edtPrdFabId_Internalname ;
   private String edtPrdFabId_Jsonclick ;
   private String divUnnamedtable29_Internalname ;
   private String edtPrdColIdx_Internalname ;
   private String A10119PrdColIdx ;
   private String edtPrdColIdx_Jsonclick ;
   private String divUnnamedtable30_Internalname ;
   private String edtPrdLote_Internalname ;
   private String A10881PrdLote ;
   private String edtPrdLote_Jsonclick ;
   private String divPrdloteob_cell_Internalname ;
   private String divPrdloteob_cell_Class ;
   private String ClassString ;
   private String StyleString ;
   private String A12957PrdLoteOb ;
   private String divSubfamcod_cell_Internalname ;
   private String divSubfamcod_cell_Class ;
   private String edtSubFamCod_Internalname ;
   private String edtSubFamCod_Jsonclick ;
   private String divUnnamedtable31_Internalname ;
   private String edtPrdFacCon_Internalname ;
   private String edtPrdFacCon_Jsonclick ;
   private String divUnnamedtable32_Internalname ;
   private String divUnnamedtable33_Internalname ;
   private String edtPrdConct_Internalname ;
   private String edtPrdConct_Jsonclick ;
   private String edtPrdRev_Internalname ;
   private String A3004PrdRev ;
   private String edtPrdRev_Jsonclick ;
   private String A727PrdRec ;
   private String edtPrdDqo_Internalname ;
   private String edtPrdDqo_Jsonclick ;
   private String divUnnamedtable34_Internalname ;
   private String A682PrdCalNec ;
   private String A698PrdDetPar ;
   private String edtTipDtoCod_Internalname ;
   private String edtTipDtoCod_Jsonclick ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable23_Internalname ;
   private String edtPrdExiAlm_Internalname ;
   private String edtPrdExiAlm_Jsonclick ;
   private String edtPrdExiAlmc_Internalname ;
   private String edtPrdExiAlmc_Jsonclick ;
   private String edtPrdCanRes_Internalname ;
   private String edtPrdCanRes_Jsonclick ;
   private String edtPrdCanPen_Internalname ;
   private String edtPrdCanPen_Jsonclick ;
   private String divUnnamedtable24_Internalname ;
   private String edtPrdExiCC_Internalname ;
   private String edtPrdExiCC_Jsonclick ;
   private String edtPrdFulEnt_Internalname ;
   private String edtPrdFulEnt_Jsonclick ;
   private String edtPrdFulPed_Internalname ;
   private String edtPrdFulPed_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String Gxuitabspanel_transactiondetail_tabcontrol_Internalname ;
   private String lblTabs1_title_Internalname ;
   private String lblTabs1_title_Jsonclick ;
   private String divUnnamedtable22_Internalname ;
   private String edtPrdPreAct_Internalname ;
   private String edtPrdPreAct_Jsonclick ;
   private String edtPrdPreAc2_Internalname ;
   private String edtPrdPreAc2_Jsonclick ;
   private String edtPrdFecPre_Internalname ;
   private String edtPrdFecPre_Jsonclick ;
   private String edtPrdPreAnt_Internalname ;
   private String edtPrdPreAnt_Jsonclick ;
   private String divPrdpremed_cell_Internalname ;
   private String divPrdpremed_cell_Class ;
   private String edtPrdPreMed_Internalname ;
   private String edtPrdPreMed_Jsonclick ;
   private String lblTabs2_title_Internalname ;
   private String lblTabs2_title_Jsonclick ;
   private String divUnnamedtable21_Internalname ;
   private String edtPrdConDia_Internalname ;
   private String edtPrdConDia_Jsonclick ;
   private String edtPrdStkMinU_Internalname ;
   private String edtPrdStkMinU_Jsonclick ;
   private String edtPrdStkMinD_Internalname ;
   private String edtPrdStkMinD_Jsonclick ;
   private String edtPrdDiaRot_Internalname ;
   private String edtPrdDiaRot_Jsonclick ;
   private String edtPrdPlaEnt_Internalname ;
   private String edtPrdPlaEnt_Jsonclick ;
   private String edtMetCod_Internalname ;
   private String edtMetCod_Jsonclick ;
   private String edtPrdLotMin_Internalname ;
   private String edtPrdLotMin_Jsonclick ;
   private String edtPrdNumUco_Internalname ;
   private String edtPrdNumUco_Jsonclick ;
   private String lblTabs3_title_Internalname ;
   private String lblTabs3_title_Jsonclick ;
   private String divUnnamedtable12_Internalname ;
   private String divUnnamedtable13_Internalname ;
   private String edtPrdPosX_Internalname ;
   private String edtPrdPosX_Jsonclick ;
   private String edtPrdPosY_Internalname ;
   private String edtPrdPosY_Jsonclick ;
   private String A1643PrdTip ;
   private String edtPrdTnq_Internalname ;
   private String edtPrdTnq_Jsonclick ;
   private String divUnnamedtable14_Internalname ;
   private String edtPrdSolub_Internalname ;
   private String edtPrdSolub_Jsonclick ;
   private String edtPrdNumCent_Internalname ;
   private String A6191PrdNumCent ;
   private String edtPrdNumCent_Jsonclick ;
   private String edtPrdHorMad_Internalname ;
   private String edtPrdHorMad_Jsonclick ;
   private String divUnnamedtable15_Internalname ;
   private String grpUnnamedgroup20_Internalname ;
   private String divUnnamedtable19_Internalname ;
   private String A5418PrdSalM ;
   private String A8936PrdSal ;
   private String edtPrdDensS_Internalname ;
   private String edtPrdDensS_Jsonclick ;
   private String edtPrdConcS_Internalname ;
   private String edtPrdConcS_Jsonclick ;
   private String divUnnamedtable16_Internalname ;
   private String grpUnnamedgroup18_Internalname ;
   private String divUnnamedtable17_Internalname ;
   private String edtPrdNumct1_Internalname ;
   private String edtPrdNumct1_Jsonclick ;
   private String edtPrdNumct2_Internalname ;
   private String edtPrdNumct2_Jsonclick ;
   private String lblTabs4_title_Internalname ;
   private String lblTabs4_title_Jsonclick ;
   private String divUnnamedtable11_Internalname ;
   private String edtPrdPesTerm_Internalname ;
   private String A8897PrdPesTerm ;
   private String edtPrdPesTerm_Jsonclick ;
   private String lblTabs5_title_Internalname ;
   private String lblTabs5_title_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String Dvpanel_unnamedtable5_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String divPrdinc_cell_Internalname ;
   private String divPrdinc_cell_Class ;
   private String edtPrdInc_Internalname ;
   private String A9731PrdInc ;
   private String edtPrdInc_Jsonclick ;
   private String edtPrdComp_Internalname ;
   private String A9732PrdComp ;
   private String edtPrdComp_Jsonclick ;
   private String Dvpanel_unnamedtable6_Internalname ;
   private String divUnnamedtable6_Internalname ;
   private String A9739PrdFT ;
   private String edtPrdFFT_Internalname ;
   private String edtPrdFFT_Jsonclick ;
   private String A9741PrdHS ;
   private String edtPrdFHS_Internalname ;
   private String edtPrdFHS_Jsonclick ;
   private String Dvpanel_unnamedtable7_Internalname ;
   private String divUnnamedtable7_Internalname ;
   private String edtPrdAox_Internalname ;
   private String edtPrdAox_Jsonclick ;
   private String A5887PrdReach ;
   private String A5888PrdOkotex ;
   private String edtPrdGots_Internalname ;
   private String A11363PrdGots ;
   private String edtPrdGots_Jsonclick ;
   private String edtPrdHm_Internalname ;
   private String A11364PrdHm ;
   private String edtPrdHm_Jsonclick ;
   private String A13301PrdZDHC ;
   private String edtPrdTHELIST_Internalname ;
   private String A13302PrdTHELIST ;
   private String edtPrdTHELIST_Jsonclick ;
   private String divPrdlist_cell_Internalname ;
   private String divPrdlist_cell_Class ;
   private String A11687PrdList ;
   private String divDvpanel_unnamedtable8_cell_Internalname ;
   private String divDvpanel_unnamedtable8_cell_Class ;
   private String Dvpanel_unnamedtable8_Internalname ;
   private String divUnnamedtable8_Internalname ;
   private String edtPrdCtw1_Internalname ;
   private String A10936PrdCtw1 ;
   private String edtPrdCtw1_Jsonclick ;
   private String edtPrdCtw2_Internalname ;
   private String A10937PrdCtw2 ;
   private String edtPrdCtw2_Jsonclick ;
   private String edtPrdCtw3_Internalname ;
   private String A10938PrdCtw3 ;
   private String edtPrdCtw3_Jsonclick ;
   private String edtPrdCtw4_Internalname ;
   private String A11663PrdCtw4 ;
   private String edtPrdCtw4_Jsonclick ;
   private String Dvpanel_unnamedtable9_Internalname ;
   private String divUnnamedtable9_Internalname ;
   private String edtPrdRTM_Internalname ;
   private String A10935PrdRTM ;
   private String edtPrdRTM_Jsonclick ;
   private String edtPrdEINECS_Internalname ;
   private String A11614PrdEINECS ;
   private String edtPrdEINECS_Jsonclick ;
   private String Dvpanel_unnamedtable10_Internalname ;
   private String divUnnamedtable10_Internalname ;
   private String edtPrdFuncion_Internalname ;
   private String A11615PrdFuncion ;
   private String edtPrdFuncion_Jsonclick ;
   private String edtPrdNmQu_Internalname ;
   private String edtPrdNroCAS_Internalname ;
   private String A11196PrdNroCAS ;
   private String edtPrdNroCAS_Jsonclick ;
   private String lblTabs6_title_Internalname ;
   private String lblTabs6_title_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtPrdObs_Internalname ;
   private String TempTags ;
   private String bttBtnupdate_Internalname ;
   private String bttBtnupdate_Jsonclick ;
   private String bttBtndelete_Internalname ;
   private String bttBtndelete_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String AV15Pgmname ;
   private String AV14Emprcod ;
   private String sCtrlA396EmprCod ;
   private String sCtrlA719PrdNum ;
   private java.util.Date A713PrdFulEnt ;
   private java.util.Date A714PrdFulPed ;
   private java.util.Date A709PrdFecPre ;
   private java.util.Date A9740PrdFFT ;
   private java.util.Date A9742PrdFHS ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_transactiondetail_tableattributes_Autowidth ;
   private boolean Dvpanel_transactiondetail_tableattributes_Autoheight ;
   private boolean Dvpanel_transactiondetail_tableattributes_Collapsible ;
   private boolean Dvpanel_transactiondetail_tableattributes_Collapsed ;
   private boolean Dvpanel_transactiondetail_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_transactiondetail_tableattributes_Autoscroll ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Dvpanel_unnamedtable5_Autowidth ;
   private boolean Dvpanel_unnamedtable5_Autoheight ;
   private boolean Dvpanel_unnamedtable5_Collapsible ;
   private boolean Dvpanel_unnamedtable5_Collapsed ;
   private boolean Dvpanel_unnamedtable5_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable5_Autoscroll ;
   private boolean Dvpanel_unnamedtable6_Autowidth ;
   private boolean Dvpanel_unnamedtable6_Autoheight ;
   private boolean Dvpanel_unnamedtable6_Collapsible ;
   private boolean Dvpanel_unnamedtable6_Collapsed ;
   private boolean Dvpanel_unnamedtable6_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable6_Autoscroll ;
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
   private boolean Dvpanel_unnamedtable9_Autowidth ;
   private boolean Dvpanel_unnamedtable9_Autoheight ;
   private boolean Dvpanel_unnamedtable9_Collapsible ;
   private boolean Dvpanel_unnamedtable9_Collapsed ;
   private boolean Dvpanel_unnamedtable9_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable9_Autoscroll ;
   private boolean Dvpanel_unnamedtable10_Autowidth ;
   private boolean Dvpanel_unnamedtable10_Autoheight ;
   private boolean Dvpanel_unnamedtable10_Collapsible ;
   private boolean Dvpanel_unnamedtable10_Collapsed ;
   private boolean Dvpanel_unnamedtable10_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable10_Autoscroll ;
   private boolean Gxuitabspanel_transactiondetail_tabcontrol_Historymanagement ;
   private boolean Dvpanel_unnamedtable2_Autowidth ;
   private boolean Dvpanel_unnamedtable2_Autoheight ;
   private boolean Dvpanel_unnamedtable2_Collapsible ;
   private boolean Dvpanel_unnamedtable2_Collapsed ;
   private boolean Dvpanel_unnamedtable2_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable2_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n6301TipPrdCod ;
   private boolean n12714PrdFabId ;
   private boolean n835TipDtoCod ;
   private boolean n629MetCod ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n13302PrdTHELIST ;
   private boolean n9609SubFamCod ;
   private boolean returnInSub ;
   private boolean Cond_result ;
   private String A13777TipPrdCDsc ;
   private String A13719PrvNNom ;
   private String A13776PrdFabIDNm ;
   private String A13774TipDtoCDsc ;
   private String A13778MetCDsc ;
   private String h6301TipPrdCod ;
   private String h795PrvNum ;
   private String h12714PrdFabId ;
   private String h835TipDtoCod ;
   private String h629MetCod ;
   private String A11616PrdNmQu ;
   private String A4694PrdObs ;
   private String l13777TipPrdCDsc ;
   private String l13719PrvNNom ;
   private String l13776PrdFabIDNm ;
   private String l13774TipDtoCDsc ;
   private String l13778MetCDsc ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV10HTTPRequest ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_transactiondetail_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucGxuitabspanel_transactiondetail_tabcontrol ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable5 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable6 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable7 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable8 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable9 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable10 ;
   private HTMLChoice dynPrdUMeFo ;
   private ICheckbox chkPrdLoteOb ;
   private HTMLChoice dynPrdUniCom ;
   private HTMLChoice dynPrdUniCon ;
   private HTMLChoice dynValCod ;
   private HTMLChoice cmbPrdRec ;
   private HTMLChoice cmbPrdCalNec ;
   private HTMLChoice cmbPrdDetPar ;
   private HTMLChoice cmbPrdTip ;
   private ICheckbox chkPrdSalM ;
   private ICheckbox chkPrdSal ;
   private ICheckbox chkPrdPesCon ;
   private HTMLChoice cmbPrdFT ;
   private HTMLChoice cmbPrdHS ;
   private HTMLChoice cmbPrdReach ;
   private HTMLChoice cmbPrdOkotex ;
   private HTMLChoice cmbPrdZDHC ;
   private HTMLChoice cmbPrdList ;
   private IDataStoreProvider pr_default ;
   private String[] H00VC2_A13777TipPrdCDsc ;
   private String[] H00VC3_A13719PrvNNom ;
   private String[] H00VC4_A13776PrdFabIDNm ;
   private String[] H00VC5_A13774TipDtoCDsc ;
   private String[] H00VC6_A13778MetCDsc ;
   private String[] H00VC7_A13777TipPrdCDsc ;
   private String[] H00VC7_A396EmprCod ;
   private short[] H00VC7_A6301TipPrdCod ;
   private boolean[] H00VC7_n6301TipPrdCod ;
   private String[] H00VC8_A13719PrvNNom ;
   private String[] H00VC8_A396EmprCod ;
   private int[] H00VC8_A795PrvNum ;
   private String[] H00VC9_A13776PrdFabIDNm ;
   private String[] H00VC9_A396EmprCod ;
   private int[] H00VC9_A12714PrdFabId ;
   private boolean[] H00VC9_n12714PrdFabId ;
   private String[] H00VC10_A13774TipDtoCDsc ;
   private String[] H00VC10_A396EmprCod ;
   private byte[] H00VC10_A835TipDtoCod ;
   private boolean[] H00VC10_n835TipDtoCod ;
   private String[] H00VC11_A13778MetCDsc ;
   private String[] H00VC11_A396EmprCod ;
   private byte[] H00VC11_A629MetCod ;
   private boolean[] H00VC11_n629MetCod ;
   private String[] H00VC12_A396EmprCod ;
   private byte[] H00VC12_A490ForPrdUMe ;
   private String[] H00VC12_A488ForPrdDsc ;
   private boolean[] H00VC12_n488ForPrdDsc ;
   private String[] H00VC13_A396EmprCod ;
   private byte[] H00VC13_A742PrdUniCom ;
   private String[] H00VC13_A737PrdUcpDsc ;
   private boolean[] H00VC13_n737PrdUcpDsc ;
   private String[] H00VC14_A396EmprCod ;
   private byte[] H00VC14_A743PrdUniCon ;
   private String[] H00VC14_A736PrdUcoDsc ;
   private boolean[] H00VC14_n736PrdUcoDsc ;
   private String[] H00VC15_A396EmprCod ;
   private byte[] H00VC15_A856ValCod ;
   private String[] H00VC15_A857ValDsc ;
   private boolean[] H00VC15_n857ValDsc ;
   private String[] H00VC16_A396EmprCod ;
   private String[] H00VC16_A719PrdNum ;
   private String[] H00VC16_A4694PrdObs ;
   private String[] H00VC16_A11196PrdNroCAS ;
   private String[] H00VC16_A11616PrdNmQu ;
   private String[] H00VC16_A11615PrdFuncion ;
   private String[] H00VC16_A11614PrdEINECS ;
   private String[] H00VC16_A10935PrdRTM ;
   private String[] H00VC16_A11663PrdCtw4 ;
   private String[] H00VC16_A10938PrdCtw3 ;
   private String[] H00VC16_A10937PrdCtw2 ;
   private String[] H00VC16_A10936PrdCtw1 ;
   private String[] H00VC16_A11687PrdList ;
   private String[] H00VC16_A13302PrdTHELIST ;
   private boolean[] H00VC16_n13302PrdTHELIST ;
   private String[] H00VC16_A13301PrdZDHC ;
   private String[] H00VC16_A11364PrdHm ;
   private String[] H00VC16_A11363PrdGots ;
   private String[] H00VC16_A5888PrdOkotex ;
   private String[] H00VC16_A5887PrdReach ;
   private java.math.BigDecimal[] H00VC16_A9733PrdAox ;
   private java.util.Date[] H00VC16_A9742PrdFHS ;
   private String[] H00VC16_A9741PrdHS ;
   private java.util.Date[] H00VC16_A9740PrdFFT ;
   private String[] H00VC16_A9739PrdFT ;
   private String[] H00VC16_A9732PrdComp ;
   private String[] H00VC16_A9731PrdInc ;
   private String[] H00VC16_A8897PrdPesTerm ;
   private byte[] H00VC16_A8896PrdPesCon ;
   private java.math.BigDecimal[] H00VC16_A7227PrdNumct2 ;
   private java.math.BigDecimal[] H00VC16_A7226PrdNumct1 ;
   private java.math.BigDecimal[] H00VC16_A5417PrdConcS ;
   private java.math.BigDecimal[] H00VC16_A5416PrdDensS ;
   private String[] H00VC16_A8936PrdSal ;
   private String[] H00VC16_A5418PrdSalM ;
   private byte[] H00VC16_A7260PrdHorMad ;
   private String[] H00VC16_A6191PrdNumCent ;
   private java.math.BigDecimal[] H00VC16_A5590PrdSolub ;
   private byte[] H00VC16_A3273PrdTnq ;
   private String[] H00VC16_A1643PrdTip ;
   private byte[] H00VC16_A1194PrdPosY ;
   private short[] H00VC16_A1193PrdPosX ;
   private java.math.BigDecimal[] H00VC16_A721PrdNumUco ;
   private short[] H00VC16_A716PrdLotMin ;
   private byte[] H00VC16_A629MetCod ;
   private boolean[] H00VC16_n629MetCod ;
   private short[] H00VC16_A722PrdPlaEnt ;
   private short[] H00VC16_A699PrdDiaRot ;
   private short[] H00VC16_A731PrdStkMinD ;
   private java.math.BigDecimal[] H00VC16_A732PrdStkMinU ;
   private java.math.BigDecimal[] H00VC16_A696PrdConDia ;
   private java.math.BigDecimal[] H00VC16_A726PrdPreMed ;
   private java.math.BigDecimal[] H00VC16_A725PrdPreAnt ;
   private java.util.Date[] H00VC16_A709PrdFecPre ;
   private java.math.BigDecimal[] H00VC16_A5255PrdPreAc2 ;
   private java.math.BigDecimal[] H00VC16_A724PrdPreAct ;
   private java.util.Date[] H00VC16_A714PrdFulPed ;
   private java.util.Date[] H00VC16_A713PrdFulEnt ;
   private java.math.BigDecimal[] H00VC16_A705PrdExiCC ;
   private java.math.BigDecimal[] H00VC16_A684PrdCanPen ;
   private java.math.BigDecimal[] H00VC16_A8659PrdExiAlmc ;
   private byte[] H00VC16_A835TipDtoCod ;
   private boolean[] H00VC16_n835TipDtoCod ;
   private String[] H00VC16_A698PrdDetPar ;
   private String[] H00VC16_A682PrdCalNec ;
   private short[] H00VC16_A1644PrdDqo ;
   private String[] H00VC16_A727PrdRec ;
   private String[] H00VC16_A3004PrdRev ;
   private short[] H00VC16_A11470PrdConct ;
   private byte[] H00VC16_A856ValCod ;
   private java.math.BigDecimal[] H00VC16_A707PrdFacCon ;
   private byte[] H00VC16_A743PrdUniCon ;
   private byte[] H00VC16_A742PrdUniCom ;
   private byte[] H00VC16_A9609SubFamCod ;
   private boolean[] H00VC16_n9609SubFamCod ;
   private String[] H00VC16_A12957PrdLoteOb ;
   private String[] H00VC16_A10881PrdLote ;
   private String[] H00VC16_A10119PrdColIdx ;
   private byte[] H00VC16_A4338PrdUMeFo ;
   private int[] H00VC16_A12714PrdFabId ;
   private boolean[] H00VC16_n12714PrdFabId ;
   private String[] H00VC16_A728PrdRefPrv ;
   private int[] H00VC16_A795PrvNum ;
   private String[] H00VC16_A4692PrdNom2 ;
   private String[] H00VC16_A4693PrdNum2 ;
   private short[] H00VC16_A6301TipPrdCod ;
   private boolean[] H00VC16_n6301TipPrdCod ;
   private String[] H00VC16_A718PrdNom ;
   private java.math.BigDecimal[] H00VC16_A685PrdCanRes ;
   private java.math.BigDecimal[] H00VC16_A704PrdExiAlm ;
   private String[] H00VC17_A13777TipPrdCDsc ;
   private String[] H00VC17_A396EmprCod ;
   private short[] H00VC17_A6301TipPrdCod ;
   private boolean[] H00VC17_n6301TipPrdCod ;
   private String[] H00VC18_A13719PrvNNom ;
   private String[] H00VC18_A396EmprCod ;
   private int[] H00VC18_A795PrvNum ;
   private String[] H00VC19_A13776PrdFabIDNm ;
   private String[] H00VC19_A396EmprCod ;
   private int[] H00VC19_A12714PrdFabId ;
   private boolean[] H00VC19_n12714PrdFabId ;
   private String[] H00VC20_A13774TipDtoCDsc ;
   private String[] H00VC20_A396EmprCod ;
   private byte[] H00VC20_A835TipDtoCod ;
   private boolean[] H00VC20_n835TipDtoCod ;
   private String[] H00VC21_A13778MetCDsc ;
   private String[] H00VC21_A396EmprCod ;
   private byte[] H00VC21_A629MetCod ;
   private boolean[] H00VC21_n629MetCod ;
   private String[] H00VC22_A13777TipPrdCDsc ;
   private String[] H00VC22_A396EmprCod ;
   private short[] H00VC22_A6301TipPrdCod ;
   private boolean[] H00VC22_n6301TipPrdCod ;
   private String[] H00VC23_A13719PrvNNom ;
   private String[] H00VC23_A396EmprCod ;
   private int[] H00VC23_A795PrvNum ;
   private String[] H00VC24_A13776PrdFabIDNm ;
   private String[] H00VC24_A396EmprCod ;
   private int[] H00VC24_A12714PrdFabId ;
   private boolean[] H00VC24_n12714PrdFabId ;
   private String[] H00VC25_A13774TipDtoCDsc ;
   private String[] H00VC25_A396EmprCod ;
   private byte[] H00VC25_A835TipDtoCod ;
   private boolean[] H00VC25_n835TipDtoCod ;
   private String[] H00VC26_A13778MetCDsc ;
   private String[] H00VC26_A396EmprCod ;
   private byte[] H00VC26_A629MetCod ;
   private boolean[] H00VC26_n629MetCod ;
   private com.genexus.webpanels.WebSession AV9Session ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV7TrnContext ;
}

final  class ttproducgeneral__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00VC2", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(TipPrdCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipPrdDsc, ''))) AS TipPrdCDsc FROM TXPTIPPRD WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(TipPrdCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipPrdDsc, '')))) like '%' || UPPER(?))) WHERE rownum <= 10 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00VC3", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom FROM TXPPRVGEN WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, '')))) like UPPER(?))) WHERE rownum <= 20 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00VC4", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrdFabId,'999990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( PrdFabNm, ''))) AS PrdFabIDNm FROM TXPPRDFAB WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(PrdFabId,'999990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( PrdFabNm, '')))) like '%' || UPPER(?))) WHERE rownum <= 10 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00VC5", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(TipDtoCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipDtoDsc, ''))) AS TipDtoCDsc FROM TXPTIPDTO WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(TipDtoCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipDtoDsc, '')))) like '%' || UPPER(?))) WHERE rownum <= 5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00VC6", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(MetCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( MetDsc, ''))) AS MetCDsc FROM TXPMETPED WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(MetCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( MetDsc, '')))) like '%' || UPPER(?))) WHERE rownum <= 5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00VC7", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TipPrdCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipPrdDsc, ''))) AS TipPrdCDsc, EmprCod, TipPrdCod FROM TXPTIPPRD WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TipPrdCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipPrdDsc, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00VC8", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom, EmprCod, PrvNum FROM TXPPRVGEN WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00VC9", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrdFabId,'999990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( PrdFabNm, ''))) AS PrdFabIDNm, EmprCod, PrdFabId FROM TXPPRDFAB WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(PrdFabId,'999990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( PrdFabNm, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00VC10", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TipDtoCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipDtoDsc, ''))) AS TipDtoCDsc, EmprCod, TipDtoCod FROM TXPTIPDTO WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TipDtoCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipDtoDsc, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00VC11", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(MetCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( MetDsc, ''))) AS MetCDsc, EmprCod, MetCod FROM TXPMETPED WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(MetCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( MetDsc, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00VC12", "SELECT EmprCod, ForPrdUMe, ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00VC13", "SELECT EmprCod, UniCod AS PrdUniCom, UniDsc AS PrdUcpDsc FROM TXPTIPUNI WHERE EmprCod = ? ORDER BY UniDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00VC14", "SELECT EmprCod, UniCod AS PrdUniCon, UniDsc AS PrdUcoDsc FROM TXPTIPUNI WHERE EmprCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00VC15", "SELECT EmprCod, ValCod, ValDsc FROM TXPTIPVAL WHERE EmprCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00VC16", "SELECT EmprCod, PrdNum, PrdObs, PrdNroCAS, PrdNmQu, PrdFuncion, PrdEINECS, PrdRTM, PrdCtw4, PrdCtw3, PrdCtw2, PrdCtw1, PrdList, PrdTHELIST, PrdZDHC, PrdHm, PrdGots, PrdOkotex, PrdReach, PrdAox, PrdFHS, PrdHS, PrdFFT, PrdFT, PrdComp, PrdInc, PrdPesTerm, PrdPesCon, PrdNumct2, PrdNumct1, PrdConcS, PrdDensS, PrdSal, PrdSalM, PrdHorMad, PrdNumCent, PrdSolub, PrdTnq, PrdTip, PrdPosY, PrdPosX, PrdNumUco, PrdLotMin, MetCod, PrdPlaEnt, PrdDiaRot, PrdStkMinD, PrdStkMinU, PrdConDia, PrdPreMed, PrdPreAnt, PrdFecPre, PrdPreAc2, PrdPreAct, PrdFulPed, PrdFulEnt, PrdExiCC, PrdCanPen, PrdExiAlmc, TipDtoCod, PrdDetPar, PrdCalNec, PrdDqo, PrdRec, PrdRev, PrdConct, ValCod, PrdFacCon, PrdUniCon, PrdUniCom, SubFamCod, PrdLoteOb, PrdLote, PrdColIdx, PrdUMeFo, PrdFabId, PrdRefPrv, PrvNum, PrdNom2, PrdNum2, TipPrdCod, PrdNom, PrdCanRes, PrdExiAlm FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00VC17", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TipPrdCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipPrdDsc, ''))) AS TipPrdCDsc, EmprCod, TipPrdCod FROM TXPTIPPRD WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TipPrdCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipPrdDsc, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00VC18", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom, EmprCod, PrvNum FROM TXPPRVGEN WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00VC19", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrdFabId,'999990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( PrdFabNm, ''))) AS PrdFabIDNm, EmprCod, PrdFabId FROM TXPPRDFAB WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(PrdFabId,'999990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( PrdFabNm, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00VC20", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TipDtoCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipDtoDsc, ''))) AS TipDtoCDsc, EmprCod, TipDtoCod FROM TXPTIPDTO WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TipDtoCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipDtoDsc, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00VC21", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(MetCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( MetDsc, ''))) AS MetCDsc, EmprCod, MetCod FROM TXPMETPED WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(MetCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( MetDsc, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00VC22", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TipPrdCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipPrdDsc, ''))) AS TipPrdCDsc, EmprCod, TipPrdCod FROM TXPTIPPRD WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TipPrdCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipPrdDsc, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00VC23", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom, EmprCod, PrvNum FROM TXPPRVGEN WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00VC24", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrdFabId,'999990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( PrdFabNm, ''))) AS PrdFabIDNm, EmprCod, PrdFabId FROM TXPPRDFAB WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(PrdFabId,'999990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( PrdFabNm, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00VC25", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TipDtoCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipDtoDsc, ''))) AS TipDtoCDsc, EmprCod, TipDtoCod FROM TXPTIPDTO WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TipDtoCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipDtoDsc, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00VC26", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(MetCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( MetDsc, ''))) AS MetCDsc, EmprCod, MetCod FROM TXPMETPED WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(MetCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( MetDsc, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 50);
               ((String[]) buf[6])[0] = rslt.getString(7, 40);
               ((String[]) buf[7])[0] = rslt.getString(8, 10);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((String[]) buf[11])[0] = rslt.getString(12, 3);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((String[]) buf[13])[0] = rslt.getString(14, 4);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(15, 1);
               ((String[]) buf[16])[0] = rslt.getString(16, 1);
               ((String[]) buf[17])[0] = rslt.getString(17, 1);
               ((String[]) buf[18])[0] = rslt.getString(18, 1);
               ((String[]) buf[19])[0] = rslt.getString(19, 1);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,2);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(21);
               ((String[]) buf[22])[0] = rslt.getString(22, 1);
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(23);
               ((String[]) buf[24])[0] = rslt.getString(24, 1);
               ((String[]) buf[25])[0] = rslt.getString(25, 2);
               ((String[]) buf[26])[0] = rslt.getString(26, 2);
               ((String[]) buf[27])[0] = rslt.getString(27, 10);
               ((byte[]) buf[28])[0] = rslt.getByte(28);
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(29,2);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(30,2);
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(31,3);
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(32,3);
               ((String[]) buf[33])[0] = rslt.getString(33, 1);
               ((String[]) buf[34])[0] = rslt.getString(34, 1);
               ((byte[]) buf[35])[0] = rslt.getByte(35);
               ((String[]) buf[36])[0] = rslt.getString(36, 6);
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(37,2);
               ((byte[]) buf[38])[0] = rslt.getByte(38);
               ((String[]) buf[39])[0] = rslt.getString(39, 1);
               ((byte[]) buf[40])[0] = rslt.getByte(40);
               ((short[]) buf[41])[0] = rslt.getShort(41);
               ((java.math.BigDecimal[]) buf[42])[0] = rslt.getBigDecimal(42,2);
               ((short[]) buf[43])[0] = rslt.getShort(43);
               ((byte[]) buf[44])[0] = rslt.getByte(44);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((short[]) buf[46])[0] = rslt.getShort(45);
               ((short[]) buf[47])[0] = rslt.getShort(46);
               ((short[]) buf[48])[0] = rslt.getShort(47);
               ((java.math.BigDecimal[]) buf[49])[0] = rslt.getBigDecimal(48,2);
               ((java.math.BigDecimal[]) buf[50])[0] = rslt.getBigDecimal(49,2);
               ((java.math.BigDecimal[]) buf[51])[0] = rslt.getBigDecimal(50,5);
               ((java.math.BigDecimal[]) buf[52])[0] = rslt.getBigDecimal(51,5);
               ((java.util.Date[]) buf[53])[0] = rslt.getGXDate(52);
               ((java.math.BigDecimal[]) buf[54])[0] = rslt.getBigDecimal(53,5);
               ((java.math.BigDecimal[]) buf[55])[0] = rslt.getBigDecimal(54,5);
               ((java.util.Date[]) buf[56])[0] = rslt.getGXDate(55);
               ((java.util.Date[]) buf[57])[0] = rslt.getGXDate(56);
               ((java.math.BigDecimal[]) buf[58])[0] = rslt.getBigDecimal(57,4);
               ((java.math.BigDecimal[]) buf[59])[0] = rslt.getBigDecimal(58,4);
               ((java.math.BigDecimal[]) buf[60])[0] = rslt.getBigDecimal(59,4);
               ((byte[]) buf[61])[0] = rslt.getByte(60);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getString(61, 1);
               ((String[]) buf[64])[0] = rslt.getString(62, 1);
               ((short[]) buf[65])[0] = rslt.getShort(63);
               ((String[]) buf[66])[0] = rslt.getString(64, 1);
               ((String[]) buf[67])[0] = rslt.getString(65, 1);
               ((short[]) buf[68])[0] = rslt.getShort(66);
               ((byte[]) buf[69])[0] = rslt.getByte(67);
               ((java.math.BigDecimal[]) buf[70])[0] = rslt.getBigDecimal(68,4);
               ((byte[]) buf[71])[0] = rslt.getByte(69);
               ((byte[]) buf[72])[0] = rslt.getByte(70);
               ((byte[]) buf[73])[0] = rslt.getByte(71);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((String[]) buf[75])[0] = rslt.getString(72, 1);
               ((String[]) buf[76])[0] = rslt.getString(73, 26);
               ((String[]) buf[77])[0] = rslt.getString(74, 10);
               ((byte[]) buf[78])[0] = rslt.getByte(75);
               ((int[]) buf[79])[0] = rslt.getInt(76);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((String[]) buf[81])[0] = rslt.getString(77, 30);
               ((int[]) buf[82])[0] = rslt.getInt(78);
               ((String[]) buf[83])[0] = rslt.getString(79, 40);
               ((String[]) buf[84])[0] = rslt.getString(80, 16);
               ((short[]) buf[85])[0] = rslt.getShort(81);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((String[]) buf[87])[0] = rslt.getString(82, 26);
               ((java.math.BigDecimal[]) buf[88])[0] = rslt.getBigDecimal(83,4);
               ((java.math.BigDecimal[]) buf[89])[0] = rslt.getBigDecimal(84,4);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
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
               stmt.setVarchar(2, (String)parms[1], 60);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 50);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 70);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 60);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 60);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 70);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 15 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 16 :
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 17 :
               stmt.setVarchar(1, (String)parms[0], 70);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 18 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 19 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 20 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 21 :
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 22 :
               stmt.setVarchar(1, (String)parms[0], 70);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 23 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 24 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
      }
   }

}

