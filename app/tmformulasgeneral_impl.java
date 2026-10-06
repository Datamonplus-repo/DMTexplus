package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmformulasgeneral_impl extends GXWebComponent
{
   public tmformulasgeneral_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmformulasgeneral_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmformulasgeneral_impl.class ));
   }

   public tmformulasgeneral_impl( int remoteHandle ,
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
      cmbForCon = new HTMLChoice();
      cmbForBlo = new HTMLChoice();
      chkForPro = UIFactory.getCheckbox(this);
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
               A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A494ForSer = httpContext.GetPar( "ForSer") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A494ForSer", A494ForSer);
               A482ForColNom = httpContext.GetPar( "ForColNom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A482ForColNom", A482ForColNom);
               A483ForColNum = (int)(GXutil.lval( httpContext.GetPar( "ForColNum"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
               A831TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,A396EmprCod,Integer.valueOf(A252CliCod),A494ForSer,A482ForColNom,Integer.valueOf(A483ForColNum),Byte.valueOf(A831TipColCod)});
               componentstart();
               httpContext.ajax_rspStartCmp(sPrefix);
               componentdraw();
               httpContext.ajax_rspEndCmp();
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"CLICOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A13735CliCNom = httpContext.GetPar( "CliCNom") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgaclicodR90( A396EmprCod, A13735CliCNom) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"FORSER") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A13751ArtCDsc = httpContext.GetPar( "ArtCDsc") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgaforserR90( A396EmprCod, A252CliCod, A13751ArtCDsc) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"TIPCOLCOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A13731TipColCDsc = httpContext.GetPar( "TipColCDsc") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgatipcolcodR90( A396EmprCod, A13731TipColCDsc) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"INTCOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A13744IntCDsc = httpContext.GetPar( "IntCDsc") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgaintcodR90( A396EmprCod, A13744IntCDsc) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"MATCOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A13743MatCDsc = httpContext.GetPar( "MatCDsc") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgamatcodR90( A396EmprCod, A13743MatCDsc) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"CODSOL") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A13752CodSDsc = httpContext.GetPar( "CodSDsc") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgacodsolR90( A396EmprCod, A13752CodSDsc) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"INTCODF") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A13753IntCFDsc = httpContext.GetPar( "IntCFDsc") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgaintcodfR90( A396EmprCod, A13753IntCFDsc) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"MACPROCOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A13755MacProCDsc = httpContext.GetPar( "MacProCDsc") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgamacprocodR90( A396EmprCod, A13755MacProCDsc) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"CLICOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A13735CliCNom = httpContext.GetPar( "CliCNom") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgaclicodR90( A396EmprCod, A13735CliCNom) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"CLICOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               h252CliCod = httpContext.GetPar( "h252CliCod") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxhcaclicodR92( A396EmprCod, h252CliCod) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"FORSER") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A13751ArtCDsc = httpContext.GetPar( "ArtCDsc") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgaforserR90( A396EmprCod, A252CliCod, A13751ArtCDsc) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"FORSER") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               h494ForSer = httpContext.GetPar( "h494ForSer") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxhcaforserR92( A396EmprCod, A252CliCod, h494ForSer) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"TIPCOLCOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A13731TipColCDsc = httpContext.GetPar( "TipColCDsc") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgatipcolcodR90( A396EmprCod, A13731TipColCDsc) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"TIPCOLCOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               h831TipColCod = httpContext.GetPar( "h831TipColCod") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxhcatipcolcodR92( A396EmprCod, h831TipColCod) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"INTCOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A13744IntCDsc = httpContext.GetPar( "IntCDsc") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgaintcodR90( A396EmprCod, A13744IntCDsc) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"INTCOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               h583IntCod = httpContext.GetPar( "h583IntCod") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxhcaintcodR92( A396EmprCod, h583IntCod) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"MATCOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A13743MatCDsc = httpContext.GetPar( "MatCDsc") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgamatcodR90( A396EmprCod, A13743MatCDsc) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"MATCOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               h626MatCod = httpContext.GetPar( "h626MatCod") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxhcamatcodR92( A396EmprCod, h626MatCod) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"CODSOL") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A13752CodSDsc = httpContext.GetPar( "CodSDsc") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgacodsolR90( A396EmprCod, A13752CodSDsc) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"CODSOL") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               h3316CodSol = httpContext.GetPar( "h3316CodSol") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxhcacodsolR92( A396EmprCod, h3316CodSol) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"INTCODF") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A13753IntCFDsc = httpContext.GetPar( "IntCFDsc") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgaintcodfR90( A396EmprCod, A13753IntCFDsc) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"INTCODF") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               h5362IntCodF = httpContext.GetPar( "h5362IntCodF") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxhcaintcodfR92( A396EmprCod, h5362IntCodF) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"MACPROCOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A13755MacProCDsc = httpContext.GetPar( "MacProCDsc") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgamacprocodR90( A396EmprCod, A13755MacProCDsc) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"MACPROCOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               h1514MacProCod = httpContext.GetPar( "h1514MacProCod") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxhcamacprocodR92( A396EmprCod, h1514MacProCod) ;
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
         paR92( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "TMFormulas General", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tmformulasgeneral", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A494ForSer)),GXutil.URLEncode(GXutil.rtrim(A482ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(A483ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A831TipColCod,2,0))}, new String[] {"EmprCod","CliCod","ForSer","ForColNom","ForColNum","TipColCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA252CliCod", GXutil.ltrim( localUtil.ntoc( wcpOA252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA494ForSer", GXutil.rtrim( wcpOA494ForSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA482ForColNom", GXutil.rtrim( wcpOA482ForColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA483ForColNum", GXutil.ltrim( localUtil.ntoc( wcpOA483ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA831TipColCod", GXutil.ltrim( localUtil.ntoc( wcpOA831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXHCCLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXHCFORSER", GXutil.rtrim( A494ForSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXHCTIPCOLCOD", GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXHCINTCOD", GXutil.ltrim( localUtil.ntoc( A583IntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXHCMATCOD", GXutil.ltrim( localUtil.ntoc( A626MatCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXHCCODSOL", GXutil.ltrim( localUtil.ntoc( A3316CodSol, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXHCINTCODF", GXutil.ltrim( localUtil.ntoc( A5362IntCodF, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXHCMACPROCOD", GXutil.rtrim( A1514MacProCod));
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
   }

   public void renderHtmlCloseFormR92( )
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
      return "TMFormulasGeneral" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TMFormulas General", "") ;
   }

   public void wbR90( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.tmformulasgeneral");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, h252CliCod, GXutil.rtrim( localUtil.format( h252CliCod, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_TMFormulasGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForSer_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForSer_Internalname, httpContext.getMessage( "Articulo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForSer_Internalname, h494ForSer, GXutil.rtrim( localUtil.format( h494ForSer, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForSer_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForSer_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_TMFormulasGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForColNom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForColNom_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForColNom_Internalname, GXutil.rtrim( A482ForColNom), GXutil.rtrim( localUtil.format( A482ForColNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForColNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMFormulasGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForColNum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForColNum_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A483ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForColNum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMFormulasGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTipColCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtTipColCod_Internalname, httpContext.getMessage( "Tc", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtTipColCod_Internalname, h831TipColCod, GXutil.rtrim( localUtil.format( h831TipColCod, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipColCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTipColCod_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_TMFormulasGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForPanto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForPanto_Internalname, httpContext.getMessage( "Pantone", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForPanto_Internalname, GXutil.rtrim( A12130ForPanto), GXutil.rtrim( localUtil.format( A12130ForPanto, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForPanto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForPanto_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMFormulasGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForNomCli_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForNomCli_Internalname, httpContext.getMessage( "Color Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForNomCli_Internalname, GXutil.rtrim( A1191ForNomCli), GXutil.rtrim( localUtil.format( A1191ForNomCli, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForNomCli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForNomCli_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMFormulasGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForNumCli_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForNumCli_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForNumCli_Internalname, GXutil.ltrim( localUtil.ntoc( A1192ForNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForNumCli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1192ForNumCli), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1192ForNumCli), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForNumCli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForNumCli_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMFormulasGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForTonal_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForTonal_Internalname, httpContext.getMessage( "Coleccion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForTonal_Internalname, GXutil.rtrim( A995ForTonal), GXutil.rtrim( localUtil.format( A995ForTonal, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForTonal_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForTonal_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMFormulasGeneral.htm");
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
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup5_Internalname, httpContext.getMessage( "Lab", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_TMFormulasGeneral.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForNumArc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForNumArc_Internalname, httpContext.getMessage( "Nº Ensayo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForNumArc_Internalname, GXutil.ltrim( localUtil.ntoc( A3315ForNumArc, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForNumArc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3315ForNumArc), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3315ForNumArc), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForNumArc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForNumArc_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMFormulasGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divForopccli_cell_Internalname, 1, 0, "px", 0, "px", divForopccli_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtForOpcCli_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForOpcCli_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForOpcCli_Internalname, httpContext.getMessage( "Opcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForOpcCli_Internalname, GXutil.rtrim( A3560ForOpcCli), GXutil.rtrim( localUtil.format( A3560ForOpcCli, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForOpcCli_Jsonclick, 0, "AttributeFL", "", "", "", "", edtForOpcCli_Visible, edtForOpcCli_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMFormulasGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divForopnum_cell_Internalname, 1, 0, "px", 0, "px", divForopnum_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtForOpNum_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForOpNum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForOpNum_Internalname, httpContext.getMessage( "Opcion (#)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForOpNum_Internalname, GXutil.ltrim( localUtil.ntoc( A7537ForOpNum, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForOpNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7537ForOpNum), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A7537ForOpNum), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForOpNum_Jsonclick, 0, "AttributeFL", "", "", "", "", edtForOpNum_Visible, edtForOpNum_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMFormulasGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divForfecapr_cell_Internalname, 1, 0, "px", 0, "px", divForfecapr_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtForFecApr_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForFecApr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForFecApr_Internalname, httpContext.getMessage( "Fecha Aprobacion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtForFecApr_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtForFecApr_Internalname, localUtil.format(A3558ForFecApr, "99/99/99"), localUtil.format( A3558ForFecApr, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForFecApr_Jsonclick, 0, "AttributeFL", "", "", "", "", edtForFecApr_Visible, edtForFecApr_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMFormulasGeneral.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtForFecApr_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtForFecApr_Visible==0)||(edtForFecApr_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TMFormulasGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForRelBan_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForRelBan_Internalname, httpContext.getMessage( "Rb", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForRelBan_Internalname, GXutil.ltrim( localUtil.ntoc( A2838ForRelBan, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForRelBan_Enabled!=0) ? localUtil.format( A2838ForRelBan, "ZZZ9.99") : localUtil.format( A2838ForRelBan, "ZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForRelBan_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForRelBan_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMFormulasGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtIntCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtIntCod_Internalname, httpContext.getMessage( "Intensidad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtIntCod_Internalname, h583IntCod, GXutil.rtrim( localUtil.format( h583IntCod, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtIntCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtIntCod_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_TMFormulasGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMatCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMatCod_Internalname, httpContext.getMessage( "Matiz", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMatCod_Internalname, h626MatCod, GXutil.rtrim( localUtil.format( h626MatCod, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMatCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMatCod_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_TMFormulasGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCodSol_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCodSol_Internalname, httpContext.getMessage( "Cod. Sol.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCodSol_Internalname, h3316CodSol, GXutil.rtrim( localUtil.format( h3316CodSol, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCodSol_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCodSol_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_TMFormulasGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbForCon.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbForCon.getInternalname(), httpContext.getMessage( "Control", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbForCon, cmbForCon.getInternalname(), GXutil.trim( GXutil.str( A484ForCon, 1, 0)), 1, cmbForCon.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbForCon.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TMFormulasGeneral.htm");
         cmbForCon.setValue( GXutil.trim( GXutil.str( A484ForCon, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbForCon.getInternalname(), "Values", cmbForCon.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divIntcodf_cell_Internalname, 1, 0, "px", 0, "px", divIntcodf_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtIntCodF_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtIntCodF_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtIntCodF_Internalname, httpContext.getMessage( "Int Fact", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtIntCodF_Internalname, h5362IntCodF, GXutil.rtrim( localUtil.format( h5362IntCodF, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtIntCodF_Jsonclick, 0, "AttributeFL", "", "", "", "", edtIntCodF_Visible, edtIntCodF_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_TMFormulasGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divForblo_cell_Internalname, 1, 0, "px", 0, "px", divForblo_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", cmbForBlo.getVisible(), 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbForBlo.getInternalname()+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbForBlo, cmbForBlo.getInternalname(), GXutil.rtrim( A7781ForBlo), 1, cmbForBlo.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", cmbForBlo.getVisible(), cmbForBlo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TMFormulasGeneral.htm");
         cmbForBlo.setValue( GXutil.rtrim( A7781ForBlo) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbForBlo.getInternalname(), "Values", cmbForBlo.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divFam_cod_cell_Internalname, 1, 0, "px", 0, "px", divFam_cod_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtFam_Cod_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFam_Cod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtFam_Cod_Internalname, httpContext.getMessage( "Famila", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtFam_Cod_Internalname, GXutil.ltrim( localUtil.ntoc( A8561Fam_Cod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFam_Cod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8561Fam_Cod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8561Fam_Cod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFam_Cod_Jsonclick, 0, "AttributeFL", "", "", "", "", edtFam_Cod_Visible, edtFam_Cod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMFormulasGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, divUnnamedtable7_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divFornomcli2_cell_Internalname, 1, 0, "px", 0, "px", divFornomcli2_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtForNomCli2_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForNomCli2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForNomCli2_Internalname, httpContext.getMessage( "Hilaza", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForNomCli2_Internalname, GXutil.rtrim( A6379ForNomCli2), GXutil.rtrim( localUtil.format( A6379ForNomCli2, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForNomCli2_Jsonclick, 0, "AttributeFL", "", "", "", "", edtForNomCli2_Visible, edtForNomCli2_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMFormulasGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divFornomcli3_cell_Internalname, 1, 0, "px", 0, "px", divFornomcli3_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtForNomCli3_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForNomCli3_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForNomCli3_Internalname, GXutil.rtrim( A7029ForNomCli3), GXutil.rtrim( localUtil.format( A7029ForNomCli3, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForNomCli3_Jsonclick, 0, "AttributeFL", "", "", "", "", edtForNomCli3_Visible, edtForNomCli3_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMFormulasGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divForlothil2_cell_Internalname, 1, 0, "px", 0, "px", divForlothil2_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtForLotHil2_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForLotHil2_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForLotHil2_Internalname, GXutil.rtrim( A12403ForLotHil2), GXutil.rtrim( localUtil.format( A12403ForLotHil2, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForLotHil2_Jsonclick, 0, "AttributeFL", "", "", "", "", edtForLotHil2_Visible, edtForLotHil2_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMFormulasGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divForlothil3_cell_Internalname, 1, 0, "px", 0, "px", divForlothil3_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtForLotHil3_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForLotHil3_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForLotHil3_Internalname, GXutil.rtrim( A12404ForLotHil3), GXutil.rtrim( localUtil.format( A12404ForLotHil3, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForLotHil3_Jsonclick, 0, "AttributeFL", "", "", "", "", edtForLotHil3_Visible, edtForLotHil3_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMFormulasGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkForPro.getInternalname()+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkForPro.getInternalname(), A2749ForPro, "", "", 1, chkForPro.getEnabled(), "S", "", StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForNumCol_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForNumCol_Internalname, httpContext.getMessage( "Nº Interno", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForNumCol_Internalname, GXutil.ltrim( localUtil.ntoc( A486ForNumCol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForNumCol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A486ForNumCol), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A486ForNumCol), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForNumCol_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForNumCol_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMFormulasGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForFec_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForFec_Internalname, httpContext.getMessage( "Fecha", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtForFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtForFec_Internalname, localUtil.format(A485ForFec, "99/99/99"), localUtil.format( A485ForFec, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForFec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMFormulasGeneral.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtForFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtForFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TMFormulasGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForUltMod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForUltMod_Internalname, httpContext.getMessage( "Fec Ult Mod", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtForUltMod_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtForUltMod_Internalname, localUtil.format(A495ForUltMod, "99/99/99"), localUtil.format( A495ForUltMod, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForUltMod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForUltMod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMFormulasGeneral.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtForUltMod_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtForUltMod_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TMFormulasGeneral.htm");
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
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup10_Internalname, httpContext.getMessage( "Control Accesos", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_TMFormulasGeneral.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable9_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForFecHor_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForFecHor_Internalname, httpContext.getMessage( "Ultimo Acceso", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtForFecHor_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtForFecHor_Internalname, localUtil.ttoc( A5625ForFecHor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A5625ForFecHor, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForFecHor_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForFecHor_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMFormulasGeneral.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtForFecHor_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtForFecHor_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TMFormulasGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForUsrCod_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForUsrCod_Internalname, GXutil.rtrim( A5624ForUsrCod), GXutil.rtrim( localUtil.format( A5624ForUsrCod, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForUsrCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForUsrCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMFormulasGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForFecCre_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForFecCre_Internalname, httpContext.getMessage( "Fecha Creacion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtForFecCre_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtForFecCre_Internalname, localUtil.ttoc( A6609ForFecCre, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A6609ForFecCre, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForFecCre_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForFecCre_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMFormulasGeneral.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtForFecCre_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtForFecCre_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TMFormulasGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForUsrCre_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForUsrCre_Internalname, GXutil.rtrim( A6608ForUsrCre), GXutil.rtrim( localUtil.format( A6608ForUsrCre, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForUsrCre_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForUsrCre_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMFormulasGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable11_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMacProCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMacProCod_Internalname, httpContext.getMessage( "Nº Programa", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMacProCod_Internalname, h1514MacProCod, GXutil.rtrim( localUtil.format( h1514MacProCod, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMacProCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMacProCod_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_TMFormulasGeneral.htm");
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
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_tableleaflevel_level1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 202,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", httpContext.getMessage( "GXM_update", ""), bttBtnupdate_Jsonclick, 7, httpContext.getMessage( "GXM_update", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e11r91_client"+"'", TempTags, "", 2, "HLP_TMFormulasGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 204,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterialDefault" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtndelete_Jsonclick, 7, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e12r91_client"+"'", TempTags, "", 2, "HLP_TMFormulasGeneral.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtForTipArt_Internalname, GXutil.ltrim( localUtil.ntoc( A4384ForTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4384ForTipArt), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForTipArt_Jsonclick, 0, "Attribute", "", "", "", "", edtForTipArt_Visible, 0, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMFormulasGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForTipT_Internalname, GXutil.ltrim( localUtil.ntoc( A8043ForTipT, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A8043ForTipT), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForTipT_Jsonclick, 0, "Attribute", "", "", "", "", edtForTipT_Visible, 0, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMFormulasGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForEst_Internalname, GXutil.rtrim( A3588ForEst), GXutil.rtrim( localUtil.format( A3588ForEst, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForEst_Jsonclick, 0, "Attribute", "", "", "", "", edtForEst_Visible, 0, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMFormulasGeneral.htm");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtForFecCtrl_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtForFecCtrl_Internalname, localUtil.ttoc( A11041ForFecCtrl, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A11041ForFecCtrl, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForFecCtrl_Jsonclick, 0, "Attribute", "", "", "", "", edtForFecCtrl_Visible, 0, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMFormulasGeneral.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtForFecCtrl_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtForFecCtrl_Visible==0)||(0==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TMFormulasGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtForFecCtrf_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtForFecCtrf_Internalname, localUtil.ttoc( A11042ForFecCtrf, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A11042ForFecCtrf, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForFecCtrf_Jsonclick, 0, "Attribute", "", "", "", "", edtForFecCtrf_Visible, 0, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMFormulasGeneral.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtForFecCtrf_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtForFecCtrf_Visible==0)||(0==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TMFormulasGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForRGB_Internalname, GXutil.ltrim( localUtil.ntoc( A4339ForRGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4339ForRGB), "ZZZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForRGB_Jsonclick, 0, "Attribute", "", "", "", "", edtForRGB_Visible, 0, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMFormulasGeneral.htm");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtForUltUti_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtForUltUti_Internalname, localUtil.format(A496ForUltUti, "99/99/99"), localUtil.format( A496ForUltUti, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForUltUti_Jsonclick, 0, "Attribute", "", "", "", "", edtForUltUti_Visible, 0, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMFormulasGeneral.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtForUltUti_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtForUltUti_Visible==0)||(0==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TMFormulasGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForPreKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A492ForPreKgm, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( A492ForPreKgm, "ZZZZZ9.999")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForPreKgm_Jsonclick, 0, "Attribute", "", "", "", "", edtForPreKgm_Visible, 0, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMFormulasGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForPreMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A493ForPreMtr, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( A493ForPreMtr, "ZZZZZ9.999")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForPreMtr_Jsonclick, 0, "Attribute", "", "", "", "", edtForPreMtr_Visible, 0, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMFormulasGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForUltLin_Internalname, GXutil.ltrim( localUtil.ntoc( A1159ForUltLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1159ForUltLin), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForUltLin_Jsonclick, 0, "Attribute", "", "", "", "", edtForUltLin_Visible, 0, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMFormulasGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForCosForm_Internalname, GXutil.ltrim( localUtil.ntoc( A4380ForCosForm, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( A4380ForCosForm, "ZZZZ9.99999")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForCosForm_Jsonclick, 0, "Attribute", "", "", "", "", edtForCosForm_Visible, 0, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMFormulasGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtFor_Reo_Internalname, GXutil.rtrim( A9792For_Reo), GXutil.rtrim( localUtil.format( A9792For_Reo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFor_Reo_Jsonclick, 0, "Attribute", "", "", "", "", edtFor_Reo_Visible, 0, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMFormulasGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtFor_item1_Internalname, GXutil.rtrim( A8777For_item1), GXutil.rtrim( localUtil.format( A8777For_item1, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFor_item1_Jsonclick, 0, "Attribute", "", "", "", "", edtFor_item1_Visible, 0, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMFormulasGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtFor_item2_Internalname, GXutil.rtrim( A11705For_item2), GXutil.rtrim( localUtil.format( A11705For_item2, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFor_item2_Jsonclick, 0, "Attribute", "", "", "", "", edtFor_item2_Visible, 0, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMFormulasGeneral.htm");
         /* Multiple line edit */
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtForObs2_Internalname, A11706ForObs2, "", "", (short)(0), edtForObs2_Visible, 0, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "1000", -1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_TMFormulasGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForMT_Internalname, GXutil.ltrim( localUtil.ntoc( A12399ForMT, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12399ForMT), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForMT_Jsonclick, 0, "Attribute", "", "", "", "", edtForMT_Visible, 0, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMFormulasGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForTRabs_Internalname, GXutil.ltrim( localUtil.ntoc( A12400ForTRabs, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12400ForTRabs), "Z9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForTRabs_Jsonclick, 0, "Attribute", "", "", "", "", edtForTRabs_Visible, 0, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMFormulasGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForKgMn_Internalname, GXutil.ltrim( localUtil.ntoc( A12401ForKgMn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( A12401ForKgMn, "ZZZZZ9.99")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForKgMn_Jsonclick, 0, "Attribute", "", "", "", "", edtForKgMn_Visible, 0, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMFormulasGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMacProDsc_Internalname, GXutil.rtrim( A1515MacProDsc), GXutil.rtrim( localUtil.format( A1515MacProDsc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMacProDsc_Jsonclick, 0, "Attribute", "", "", "", "", edtMacProDsc_Visible, 0, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMFormulasGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtIntDsc_Internalname, GXutil.rtrim( A584IntDsc), GXutil.rtrim( localUtil.format( A584IntDsc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtIntDsc_Jsonclick, 0, "Attribute", "", "", "", "", edtIntDsc_Visible, 0, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMFormulasGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMatDsc_Internalname, GXutil.rtrim( A627MatDsc), GXutil.rtrim( localUtil.format( A627MatDsc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMatDsc_Jsonclick, 0, "Attribute", "", "", "", "", edtMatDsc_Visible, 0, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMFormulasGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDscSol_Internalname, GXutil.rtrim( A3317DscSol), GXutil.rtrim( localUtil.format( A3317DscSol, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDscSol_Jsonclick, 0, "Attribute", "", "", "", "", edtDscSol_Visible, 0, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMFormulasGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForConDsc_Internalname, GXutil.rtrim( A3792ForConDsc), GXutil.rtrim( localUtil.format( A3792ForConDsc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForConDsc_Jsonclick, 0, "Attribute", "", "", "", "", edtForConDsc_Visible, 0, 0, "text", "", 25, "chr", 1, "row", 25, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMFormulasGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtIntDscF_Internalname, GXutil.rtrim( A5363IntDscF), GXutil.rtrim( localUtil.format( A5363IntDscF, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtIntDscF_Jsonclick, 0, "Attribute", "", "", "", "", edtIntDscF_Visible, 0, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMFormulasGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "Attribute", "", "", "", "", edtCliNom_Visible, 0, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMFormulasGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForSerDsc_Internalname, GXutil.rtrim( A5742ForSerDsc), GXutil.rtrim( localUtil.format( A5742ForSerDsc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForSerDsc_Jsonclick, 0, "Attribute", "", "", "", "", edtForSerDsc_Visible, 0, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMFormulasGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtTipColDsc_Internalname, GXutil.rtrim( A832TipColDsc), GXutil.rtrim( localUtil.format( A832TipColDsc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipColDsc_Jsonclick, 0, "Attribute", "", "", "", "", edtTipColDsc_Visible, 0, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMFormulasGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void startR92( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "TMFormulas General", ""), (short)(0)) ;
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
            strupR90( ) ;
         }
      }
   }

   public void wsR92( )
   {
      startR92( ) ;
      evtR92( ) ;
   }

   public void evtR92( )
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
                              strupR90( ) ;
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
                              strupR90( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e13R92 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupR90( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e14R92 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupR90( ) ;
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
                              strupR90( ) ;
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

   public void weR92( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormR92( ) ;
         }
      }
   }

   public void paR92( )
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

   public void gxsgaclicodR90( String A396EmprCod ,
                               String A13735CliCNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgaclicod_dataR90( A396EmprCod, A13735CliCNom) ;
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

   protected void gxsgaclicod_dataR90( String A396EmprCod ,
                                       String A13735CliCNom )
   {
      l13735CliCNom = GXutil.concat( GXutil.rtrim( A13735CliCNom), "%", "") ;
      /* Using cursor H00R92 */
      pr_default.execute(0, new Object[] {A396EmprCod, l13735CliCNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(0) != 101) )
      {
         gxdynajaxctrlcodr.add(H00R92_A13735CliCNom[0]);
         gxdynajaxctrldescr.add(H00R92_A13735CliCNom[0]);
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxsgaforserR90( String A396EmprCod ,
                               int A252CliCod ,
                               String A13751ArtCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgaforser_dataR90( A396EmprCod, A252CliCod, A13751ArtCDsc) ;
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

   protected void gxsgaforser_dataR90( String A396EmprCod ,
                                       int A252CliCod ,
                                       String A13751ArtCDsc )
   {
      l13751ArtCDsc = GXutil.concat( GXutil.rtrim( A13751ArtCDsc), "%", "") ;
      /* Using cursor H00R93 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), l13751ArtCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(1) != 101) )
      {
         gxdynajaxctrlcodr.add(H00R93_A13751ArtCDsc[0]);
         gxdynajaxctrldescr.add(H00R93_A13751ArtCDsc[0]);
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void gxsgatipcolcodR90( String A396EmprCod ,
                                  String A13731TipColCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgatipcolcod_dataR90( A396EmprCod, A13731TipColCDsc) ;
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

   protected void gxsgatipcolcod_dataR90( String A396EmprCod ,
                                          String A13731TipColCDsc )
   {
      l13731TipColCDsc = GXutil.concat( GXutil.rtrim( A13731TipColCDsc), "%", "") ;
      /* Using cursor H00R94 */
      pr_default.execute(2, new Object[] {A396EmprCod, l13731TipColCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(2) != 101) )
      {
         gxdynajaxctrlcodr.add(H00R94_A13731TipColCDsc[0]);
         gxdynajaxctrldescr.add(H00R94_A13731TipColCDsc[0]);
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void gxsgaintcodR90( String A396EmprCod ,
                               String A13744IntCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgaintcod_dataR90( A396EmprCod, A13744IntCDsc) ;
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

   protected void gxsgaintcod_dataR90( String A396EmprCod ,
                                       String A13744IntCDsc )
   {
      l13744IntCDsc = GXutil.concat( GXutil.rtrim( A13744IntCDsc), "%", "") ;
      /* Using cursor H00R95 */
      pr_default.execute(3, new Object[] {A396EmprCod, l13744IntCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(3) != 101) )
      {
         gxdynajaxctrlcodr.add(H00R95_A13744IntCDsc[0]);
         gxdynajaxctrldescr.add(H00R95_A13744IntCDsc[0]);
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void gxsgamatcodR90( String A396EmprCod ,
                               String A13743MatCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgamatcod_dataR90( A396EmprCod, A13743MatCDsc) ;
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

   protected void gxsgamatcod_dataR90( String A396EmprCod ,
                                       String A13743MatCDsc )
   {
      l13743MatCDsc = GXutil.concat( GXutil.rtrim( A13743MatCDsc), "%", "") ;
      /* Using cursor H00R96 */
      pr_default.execute(4, new Object[] {A396EmprCod, l13743MatCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(4) != 101) )
      {
         gxdynajaxctrlcodr.add(H00R96_A13743MatCDsc[0]);
         gxdynajaxctrldescr.add(H00R96_A13743MatCDsc[0]);
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void gxsgacodsolR90( String A396EmprCod ,
                               String A13752CodSDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgacodsol_dataR90( A396EmprCod, A13752CodSDsc) ;
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

   protected void gxsgacodsol_dataR90( String A396EmprCod ,
                                       String A13752CodSDsc )
   {
      l13752CodSDsc = GXutil.concat( GXutil.rtrim( A13752CodSDsc), "%", "") ;
      /* Using cursor H00R97 */
      pr_default.execute(5, new Object[] {A396EmprCod, l13752CodSDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(5) != 101) )
      {
         gxdynajaxctrlcodr.add(H00R97_A13752CodSDsc[0]);
         gxdynajaxctrldescr.add(H00R97_A13752CodSDsc[0]);
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   public void gxsgaintcodfR90( String A396EmprCod ,
                                String A13753IntCFDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgaintcodf_dataR90( A396EmprCod, A13753IntCFDsc) ;
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

   protected void gxsgaintcodf_dataR90( String A396EmprCod ,
                                        String A13753IntCFDsc )
   {
      l13753IntCFDsc = GXutil.concat( GXutil.rtrim( A13753IntCFDsc), "%", "") ;
      /* Using cursor H00R98 */
      pr_default.execute(6, new Object[] {A396EmprCod, l13753IntCFDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(6) != 101) )
      {
         gxdynajaxctrlcodr.add(H00R98_A13753IntCFDsc[0]);
         gxdynajaxctrldescr.add(H00R98_A13753IntCFDsc[0]);
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   public void gxsgamacprocodR90( String A396EmprCod ,
                                  String A13755MacProCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgamacprocod_dataR90( A396EmprCod, A13755MacProCDsc) ;
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

   protected void gxsgamacprocod_dataR90( String A396EmprCod ,
                                          String A13755MacProCDsc )
   {
      l13755MacProCDsc = GXutil.concat( GXutil.rtrim( A13755MacProCDsc), "%", "") ;
      /* Using cursor H00R99 */
      pr_default.execute(7, new Object[] {A396EmprCod, l13755MacProCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(7) != 101) )
      {
         gxdynajaxctrlcodr.add(H00R99_A13755MacProCDsc[0]);
         gxdynajaxctrldescr.add(H00R99_A13755MacProCDsc[0]);
         pr_default.readNext(7);
      }
      pr_default.close(7);
   }

   public void gxhcaclicodR92( String A396EmprCod ,
                               String A13735CliCNom )
   {
      /* Using cursor H00R910 */
      pr_default.execute(8, new Object[] {A13735CliCNom, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(8) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13735CliCNom = H00R910_A13735CliCNom[0] ;
         A396EmprCod = H00R910_A396EmprCod[0] ;
         A252CliCod = H00R910_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         pr_default.readNext(8);
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
      pr_default.close(8);
   }

   public void gxhcaforserR92( String A396EmprCod ,
                               int A252CliCod ,
                               String A13751ArtCDsc )
   {
      /* Using cursor H00R911 */
      pr_default.execute(9, new Object[] {A13751ArtCDsc, A396EmprCod, Integer.valueOf(A252CliCod)});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(9) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13751ArtCDsc = H00R911_A13751ArtCDsc[0] ;
         A396EmprCod = H00R911_A396EmprCod[0] ;
         A252CliCod = H00R911_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = H00R911_A65ArtCod[0] ;
         pr_default.readNext(9);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A65ArtCod))+"\"") ;
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

   public void gxhcatipcolcodR92( String A396EmprCod ,
                                  String A13731TipColCDsc )
   {
      /* Using cursor H00R912 */
      pr_default.execute(10, new Object[] {A13731TipColCDsc, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(10) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13731TipColCDsc = H00R912_A13731TipColCDsc[0] ;
         A396EmprCod = H00R912_A396EmprCod[0] ;
         A831TipColCod = H00R912_A831TipColCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
         pr_default.readNext(10);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), ".", "")))+"\"") ;
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
      pr_default.close(10);
   }

   public void gxhcaintcodR92( String A396EmprCod ,
                               String A13744IntCDsc )
   {
      /* Using cursor H00R913 */
      pr_default.execute(11, new Object[] {A13744IntCDsc, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(11) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13744IntCDsc = H00R913_A13744IntCDsc[0] ;
         A396EmprCod = H00R913_A396EmprCod[0] ;
         A583IntCod = H00R913_A583IntCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
         pr_default.readNext(11);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A583IntCod, (byte)(2), (byte)(0), ".", "")))+"\"") ;
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
      pr_default.close(11);
   }

   public void gxhcamatcodR92( String A396EmprCod ,
                               String A13743MatCDsc )
   {
      /* Using cursor H00R914 */
      pr_default.execute(12, new Object[] {A13743MatCDsc, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(12) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13743MatCDsc = H00R914_A13743MatCDsc[0] ;
         A396EmprCod = H00R914_A396EmprCod[0] ;
         A626MatCod = H00R914_A626MatCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A626MatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A626MatCod), 3, 0));
         pr_default.readNext(12);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A626MatCod, (byte)(3), (byte)(0), ".", "")))+"\"") ;
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
      pr_default.close(12);
   }

   public void gxhcacodsolR92( String A396EmprCod ,
                               String A13752CodSDsc )
   {
      /* Using cursor H00R915 */
      pr_default.execute(13, new Object[] {A13752CodSDsc, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(13) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13752CodSDsc = H00R915_A13752CodSDsc[0] ;
         A396EmprCod = H00R915_A396EmprCod[0] ;
         A3316CodSol = H00R915_A3316CodSol[0] ;
         n3316CodSol = H00R915_n3316CodSol[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3316CodSol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3316CodSol), 3, 0));
         pr_default.readNext(13);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A3316CodSol, (byte)(3), (byte)(0), ".", "")))+"\"") ;
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
      pr_default.close(13);
   }

   public void gxhcaintcodfR92( String A396EmprCod ,
                                String A13753IntCFDsc )
   {
      /* Using cursor H00R916 */
      pr_default.execute(14, new Object[] {A13753IntCFDsc, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(14) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13753IntCFDsc = H00R916_A13753IntCFDsc[0] ;
         A396EmprCod = H00R916_A396EmprCod[0] ;
         A5362IntCodF = H00R916_A5362IntCodF[0] ;
         n5362IntCodF = H00R916_n5362IntCodF[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5362IntCodF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5362IntCodF), 2, 0));
         pr_default.readNext(14);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5362IntCodF, (byte)(2), (byte)(0), ".", "")))+"\"") ;
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
      pr_default.close(14);
   }

   public void gxhcamacprocodR92( String A396EmprCod ,
                                  String A13755MacProCDsc )
   {
      /* Using cursor H00R917 */
      pr_default.execute(15, new Object[] {A13755MacProCDsc, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(15) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13755MacProCDsc = H00R917_A13755MacProCDsc[0] ;
         A396EmprCod = H00R917_A396EmprCod[0] ;
         A1514MacProCod = H00R917_A1514MacProCod[0] ;
         n1514MacProCod = H00R917_n1514MacProCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1514MacProCod", A1514MacProCod);
         pr_default.readNext(15);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1514MacProCod))+"\"") ;
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
      pr_default.close(15);
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
      if ( cmbForCon.getItemCount() > 0 )
      {
         A484ForCon = (byte)(GXutil.lval( cmbForCon.getValidValue(GXutil.trim( GXutil.str( A484ForCon, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A484ForCon", GXutil.str( A484ForCon, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbForCon.setValue( GXutil.trim( GXutil.str( A484ForCon, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbForCon.getInternalname(), "Values", cmbForCon.ToJavascriptSource(), true);
      }
      if ( cmbForBlo.getItemCount() > 0 )
      {
         A7781ForBlo = cmbForBlo.getValidValue(A7781ForBlo) ;
         n7781ForBlo = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7781ForBlo", A7781ForBlo);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbForBlo.setValue( GXutil.rtrim( A7781ForBlo) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbForBlo.getInternalname(), "Values", cmbForBlo.ToJavascriptSource(), true);
      }
      A2749ForPro = ((GXutil.strcmp(GXutil.rtrim( A2749ForPro), "S")==0) ? "S" : "N") ;
      n2749ForPro = false ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2749ForPro", A2749ForPro);
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rfR92( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV17Pgmname = "TMFormulasGeneral" ;
      Gx_err = (short)(0) ;
   }

   public void rfR92( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H00R918 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         while ( (pr_default.getStatus(16) != 101) )
         {
            A5742ForSerDsc = H00R918_A5742ForSerDsc[0] ;
            n5742ForSerDsc = H00R918_n5742ForSerDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5742ForSerDsc", A5742ForSerDsc);
            A5363IntDscF = H00R918_A5363IntDscF[0] ;
            n5363IntDscF = H00R918_n5363IntDscF[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5363IntDscF", A5363IntDscF);
            A3792ForConDsc = H00R918_A3792ForConDsc[0] ;
            n3792ForConDsc = H00R918_n3792ForConDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3792ForConDsc", A3792ForConDsc);
            A3317DscSol = H00R918_A3317DscSol[0] ;
            n3317DscSol = H00R918_n3317DscSol[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3317DscSol", A3317DscSol);
            A627MatDsc = H00R918_A627MatDsc[0] ;
            n627MatDsc = H00R918_n627MatDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A627MatDsc", A627MatDsc);
            A584IntDsc = H00R918_A584IntDsc[0] ;
            n584IntDsc = H00R918_n584IntDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A584IntDsc", A584IntDsc);
            A1515MacProDsc = H00R918_A1515MacProDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1515MacProDsc", A1515MacProDsc);
            A12401ForKgMn = H00R918_A12401ForKgMn[0] ;
            n12401ForKgMn = H00R918_n12401ForKgMn[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12401ForKgMn", GXutil.ltrimstr( A12401ForKgMn, 9, 2));
            A12400ForTRabs = H00R918_A12400ForTRabs[0] ;
            n12400ForTRabs = H00R918_n12400ForTRabs[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12400ForTRabs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12400ForTRabs), 2, 0));
            A12399ForMT = H00R918_A12399ForMT[0] ;
            n12399ForMT = H00R918_n12399ForMT[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12399ForMT", GXutil.str( A12399ForMT, 1, 0));
            A11706ForObs2 = H00R918_A11706ForObs2[0] ;
            n11706ForObs2 = H00R918_n11706ForObs2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11706ForObs2", A11706ForObs2);
            A11705For_item2 = H00R918_A11705For_item2[0] ;
            n11705For_item2 = H00R918_n11705For_item2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11705For_item2", A11705For_item2);
            A8777For_item1 = H00R918_A8777For_item1[0] ;
            n8777For_item1 = H00R918_n8777For_item1[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8777For_item1", A8777For_item1);
            A9792For_Reo = H00R918_A9792For_Reo[0] ;
            n9792For_Reo = H00R918_n9792For_Reo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9792For_Reo", A9792For_Reo);
            A4380ForCosForm = H00R918_A4380ForCosForm[0] ;
            n4380ForCosForm = H00R918_n4380ForCosForm[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4380ForCosForm", GXutil.ltrimstr( A4380ForCosForm, 11, 5));
            A1159ForUltLin = H00R918_A1159ForUltLin[0] ;
            n1159ForUltLin = H00R918_n1159ForUltLin[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1159ForUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1159ForUltLin), 4, 0));
            A493ForPreMtr = H00R918_A493ForPreMtr[0] ;
            n493ForPreMtr = H00R918_n493ForPreMtr[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A493ForPreMtr", GXutil.ltrimstr( A493ForPreMtr, 12, 5));
            A492ForPreKgm = H00R918_A492ForPreKgm[0] ;
            n492ForPreKgm = H00R918_n492ForPreKgm[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A492ForPreKgm", GXutil.ltrimstr( A492ForPreKgm, 12, 5));
            A496ForUltUti = H00R918_A496ForUltUti[0] ;
            n496ForUltUti = H00R918_n496ForUltUti[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A496ForUltUti", localUtil.format(A496ForUltUti, "99/99/99"));
            A4339ForRGB = H00R918_A4339ForRGB[0] ;
            n4339ForRGB = H00R918_n4339ForRGB[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4339ForRGB", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4339ForRGB), 10, 0));
            A11042ForFecCtrf = H00R918_A11042ForFecCtrf[0] ;
            n11042ForFecCtrf = H00R918_n11042ForFecCtrf[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11042ForFecCtrf", localUtil.ttoc( A11042ForFecCtrf, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            A11041ForFecCtrl = H00R918_A11041ForFecCtrl[0] ;
            n11041ForFecCtrl = H00R918_n11041ForFecCtrl[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11041ForFecCtrl", localUtil.ttoc( A11041ForFecCtrl, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            A3588ForEst = H00R918_A3588ForEst[0] ;
            n3588ForEst = H00R918_n3588ForEst[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3588ForEst", A3588ForEst);
            A8043ForTipT = H00R918_A8043ForTipT[0] ;
            n8043ForTipT = H00R918_n8043ForTipT[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8043ForTipT", GXutil.str( A8043ForTipT, 1, 0));
            A4384ForTipArt = H00R918_A4384ForTipArt[0] ;
            n4384ForTipArt = H00R918_n4384ForTipArt[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4384ForTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4384ForTipArt), 4, 0));
            A1514MacProCod = H00R918_A1514MacProCod[0] ;
            n1514MacProCod = H00R918_n1514MacProCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1514MacProCod", A1514MacProCod);
            A6608ForUsrCre = H00R918_A6608ForUsrCre[0] ;
            n6608ForUsrCre = H00R918_n6608ForUsrCre[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6608ForUsrCre", A6608ForUsrCre);
            A6609ForFecCre = H00R918_A6609ForFecCre[0] ;
            n6609ForFecCre = H00R918_n6609ForFecCre[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6609ForFecCre", localUtil.ttoc( A6609ForFecCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            A5624ForUsrCod = H00R918_A5624ForUsrCod[0] ;
            n5624ForUsrCod = H00R918_n5624ForUsrCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5624ForUsrCod", A5624ForUsrCod);
            A5625ForFecHor = H00R918_A5625ForFecHor[0] ;
            n5625ForFecHor = H00R918_n5625ForFecHor[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5625ForFecHor", localUtil.ttoc( A5625ForFecHor, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            A495ForUltMod = H00R918_A495ForUltMod[0] ;
            n495ForUltMod = H00R918_n495ForUltMod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A495ForUltMod", localUtil.format(A495ForUltMod, "99/99/99"));
            A485ForFec = H00R918_A485ForFec[0] ;
            n485ForFec = H00R918_n485ForFec[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A485ForFec", localUtil.format(A485ForFec, "99/99/99"));
            A486ForNumCol = H00R918_A486ForNumCol[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
            A2749ForPro = H00R918_A2749ForPro[0] ;
            n2749ForPro = H00R918_n2749ForPro[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2749ForPro", A2749ForPro);
            A12404ForLotHil3 = H00R918_A12404ForLotHil3[0] ;
            n12404ForLotHil3 = H00R918_n12404ForLotHil3[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12404ForLotHil3", A12404ForLotHil3);
            A12403ForLotHil2 = H00R918_A12403ForLotHil2[0] ;
            n12403ForLotHil2 = H00R918_n12403ForLotHil2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12403ForLotHil2", A12403ForLotHil2);
            A7029ForNomCli3 = H00R918_A7029ForNomCli3[0] ;
            n7029ForNomCli3 = H00R918_n7029ForNomCli3[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7029ForNomCli3", A7029ForNomCli3);
            A6379ForNomCli2 = H00R918_A6379ForNomCli2[0] ;
            n6379ForNomCli2 = H00R918_n6379ForNomCli2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6379ForNomCli2", A6379ForNomCli2);
            A8561Fam_Cod = H00R918_A8561Fam_Cod[0] ;
            n8561Fam_Cod = H00R918_n8561Fam_Cod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8561Fam_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8561Fam_Cod), 4, 0));
            A7781ForBlo = H00R918_A7781ForBlo[0] ;
            n7781ForBlo = H00R918_n7781ForBlo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7781ForBlo", A7781ForBlo);
            A5362IntCodF = H00R918_A5362IntCodF[0] ;
            n5362IntCodF = H00R918_n5362IntCodF[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5362IntCodF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5362IntCodF), 2, 0));
            A484ForCon = H00R918_A484ForCon[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A484ForCon", GXutil.str( A484ForCon, 1, 0));
            A3316CodSol = H00R918_A3316CodSol[0] ;
            n3316CodSol = H00R918_n3316CodSol[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3316CodSol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3316CodSol), 3, 0));
            A626MatCod = H00R918_A626MatCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A626MatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A626MatCod), 3, 0));
            A583IntCod = H00R918_A583IntCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
            A2838ForRelBan = H00R918_A2838ForRelBan[0] ;
            n2838ForRelBan = H00R918_n2838ForRelBan[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2838ForRelBan", GXutil.ltrimstr( A2838ForRelBan, 7, 2));
            A3558ForFecApr = H00R918_A3558ForFecApr[0] ;
            n3558ForFecApr = H00R918_n3558ForFecApr[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3558ForFecApr", localUtil.format(A3558ForFecApr, "99/99/99"));
            A7537ForOpNum = H00R918_A7537ForOpNum[0] ;
            n7537ForOpNum = H00R918_n7537ForOpNum[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7537ForOpNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7537ForOpNum), 2, 0));
            A3560ForOpcCli = H00R918_A3560ForOpcCli[0] ;
            n3560ForOpcCli = H00R918_n3560ForOpcCli[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3560ForOpcCli", A3560ForOpcCli);
            A3315ForNumArc = H00R918_A3315ForNumArc[0] ;
            n3315ForNumArc = H00R918_n3315ForNumArc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3315ForNumArc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3315ForNumArc), 8, 0));
            A995ForTonal = H00R918_A995ForTonal[0] ;
            n995ForTonal = H00R918_n995ForTonal[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A995ForTonal", A995ForTonal);
            A1192ForNumCli = H00R918_A1192ForNumCli[0] ;
            n1192ForNumCli = H00R918_n1192ForNumCli[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1192ForNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1192ForNumCli), 6, 0));
            A1191ForNomCli = H00R918_A1191ForNomCli[0] ;
            n1191ForNomCli = H00R918_n1191ForNomCli[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1191ForNomCli", A1191ForNomCli);
            A12130ForPanto = H00R918_A12130ForPanto[0] ;
            n12130ForPanto = H00R918_n12130ForPanto[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12130ForPanto", A12130ForPanto);
            A584IntDsc = H00R918_A584IntDsc[0] ;
            n584IntDsc = H00R918_n584IntDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A584IntDsc", A584IntDsc);
            A627MatDsc = H00R918_A627MatDsc[0] ;
            n627MatDsc = H00R918_n627MatDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A627MatDsc", A627MatDsc);
            A1515MacProDsc = H00R918_A1515MacProDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1515MacProDsc", A1515MacProDsc);
            A3317DscSol = H00R918_A3317DscSol[0] ;
            n3317DscSol = H00R918_n3317DscSol[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3317DscSol", A3317DscSol);
            A3792ForConDsc = H00R918_A3792ForConDsc[0] ;
            n3792ForConDsc = H00R918_n3792ForConDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3792ForConDsc", A3792ForConDsc);
            A5363IntDscF = H00R918_A5363IntDscF[0] ;
            n5363IntDscF = H00R918_n5363IntDscF[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5363IntDscF", A5363IntDscF);
            if ( (GXutil.strcmp("", h583IntCod)==0) )
            {
               A583IntCod = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
            }
            else
            {
               A13744IntCDsc = h583IntCod ;
               /* Using cursor H00R919 */
               pr_default.execute(17, new Object[] {A13744IntCDsc, A396EmprCod});
               A583IntCod = H00R919_A583IntCod[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
               A583IntCod = H00R919_A583IntCod[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
               if ( ! ( (pr_default.getStatus(17) == 101) ) )
               {
                  pr_default.readNext(17);
                  if ( ! ( (pr_default.getStatus(17) == 101) ) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "INTCOD");
                  }
               }
               else
               {
               }
               pr_default.close(17);
            }
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "h583IntCod", h583IntCod);
            if ( (GXutil.strcmp("", h626MatCod)==0) )
            {
               A626MatCod = (short)(0) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A626MatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A626MatCod), 3, 0));
            }
            else
            {
               A13743MatCDsc = h626MatCod ;
               /* Using cursor H00R920 */
               pr_default.execute(18, new Object[] {A13743MatCDsc, A396EmprCod});
               A626MatCod = H00R920_A626MatCod[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A626MatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A626MatCod), 3, 0));
               A626MatCod = H00R920_A626MatCod[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A626MatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A626MatCod), 3, 0));
               if ( ! ( (pr_default.getStatus(18) == 101) ) )
               {
                  pr_default.readNext(18);
                  if ( ! ( (pr_default.getStatus(18) == 101) ) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "MATCOD");
                  }
               }
               else
               {
               }
               pr_default.close(18);
            }
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "h626MatCod", h626MatCod);
            if ( (GXutil.strcmp("", h3316CodSol)==0) )
            {
               A3316CodSol = (short)(0) ;
               n3316CodSol = false ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3316CodSol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3316CodSol), 3, 0));
            }
            else
            {
               A13752CodSDsc = h3316CodSol ;
               /* Using cursor H00R921 */
               pr_default.execute(19, new Object[] {A13752CodSDsc, A396EmprCod});
               A3316CodSol = H00R921_A3316CodSol[0] ;
               n3316CodSol = H00R921_n3316CodSol[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3316CodSol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3316CodSol), 3, 0));
               A3316CodSol = H00R921_A3316CodSol[0] ;
               n3316CodSol = H00R921_n3316CodSol[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3316CodSol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3316CodSol), 3, 0));
               if ( ! ( (pr_default.getStatus(19) == 101) ) )
               {
                  pr_default.readNext(19);
                  if ( ! ( (pr_default.getStatus(19) == 101) ) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "CODSOL");
                  }
               }
               else
               {
               }
               pr_default.close(19);
            }
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "h3316CodSol", h3316CodSol);
            if ( (GXutil.strcmp("", h5362IntCodF)==0) )
            {
               A5362IntCodF = (byte)(0) ;
               n5362IntCodF = false ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5362IntCodF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5362IntCodF), 2, 0));
            }
            else
            {
               A13753IntCFDsc = h5362IntCodF ;
               /* Using cursor H00R922 */
               pr_default.execute(20, new Object[] {A13753IntCFDsc, A396EmprCod});
               A5362IntCodF = H00R922_A5362IntCodF[0] ;
               n5362IntCodF = H00R922_n5362IntCodF[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5362IntCodF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5362IntCodF), 2, 0));
               A5362IntCodF = H00R922_A5362IntCodF[0] ;
               n5362IntCodF = H00R922_n5362IntCodF[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5362IntCodF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5362IntCodF), 2, 0));
               if ( ! ( (pr_default.getStatus(20) == 101) ) )
               {
                  pr_default.readNext(20);
                  if ( ! ( (pr_default.getStatus(20) == 101) ) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "INTCODF");
                  }
               }
               else
               {
               }
               pr_default.close(20);
            }
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "h5362IntCodF", h5362IntCodF);
            if ( (GXutil.strcmp("", h1514MacProCod)==0) )
            {
               A1514MacProCod = "" ;
               n1514MacProCod = false ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1514MacProCod", A1514MacProCod);
            }
            else
            {
               A13755MacProCDsc = h1514MacProCod ;
               /* Using cursor H00R923 */
               pr_default.execute(21, new Object[] {A13755MacProCDsc, A396EmprCod});
               A1514MacProCod = H00R923_A1514MacProCod[0] ;
               n1514MacProCod = H00R923_n1514MacProCod[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1514MacProCod", A1514MacProCod);
               A1514MacProCod = H00R923_A1514MacProCod[0] ;
               n1514MacProCod = H00R923_n1514MacProCod[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1514MacProCod", A1514MacProCod);
               if ( ! ( (pr_default.getStatus(21) == 101) ) )
               {
                  pr_default.readNext(21);
                  if ( ! ( (pr_default.getStatus(21) == 101) ) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "MACPROCOD");
                  }
               }
               else
               {
               }
               pr_default.close(21);
            }
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "h1514MacProCod", h1514MacProCod);
            /* Execute user event: Load */
            e14R92 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(16);
         wbR90( ) ;
      }
   }

   public void send_integrity_lvl_hashesR92( )
   {
   }

   public void before_start_formulas( )
   {
      AV17Pgmname = "TMFormulasGeneral" ;
      Gx_err = (short)(0) ;
      if ( (GXutil.strcmp("", h252CliCod)==0) )
      {
         A252CliCod = 0 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      else
      {
         A13735CliCNom = h252CliCod ;
         /* Using cursor H00R924 */
         pr_default.execute(22, new Object[] {A13735CliCNom, A396EmprCod});
         A252CliCod = H00R924_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         if ( ! ( (pr_default.getStatus(22) == 101) ) )
         {
            pr_default.readNext(22);
            if ( ! ( (pr_default.getStatus(22) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Cliente-Nombre", "")}), 1, "CLICOD");
            }
         }
         else
         {
         }
         pr_default.close(22);
      }
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "h252CliCod", h252CliCod);
      /* Using cursor H00R925 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      A279CliNom = H00R925_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A279CliNom", A279CliNom);
      pr_default.close(23);
      if ( (GXutil.strcmp("", h831TipColCod)==0) )
      {
         A831TipColCod = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
      }
      else
      {
         A13731TipColCDsc = h831TipColCod ;
         /* Using cursor H00R926 */
         pr_default.execute(24, new Object[] {A13731TipColCDsc, A396EmprCod});
         A831TipColCod = H00R926_A831TipColCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
         if ( ! ( (pr_default.getStatus(24) == 101) ) )
         {
            pr_default.readNext(24);
            if ( ! ( (pr_default.getStatus(24) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Código - Tipo Colorante", "")}), 1, "TIPCOLCOD");
            }
         }
         else
         {
         }
         pr_default.close(24);
      }
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "h831TipColCod", h831TipColCod);
      /* Using cursor H00R927 */
      pr_default.execute(25, new Object[] {A396EmprCod, Byte.valueOf(A831TipColCod)});
      A832TipColDsc = H00R927_A832TipColDsc[0] ;
      n832TipColDsc = H00R927_n832TipColDsc[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A832TipColDsc", A832TipColDsc);
      pr_default.close(25);
      pr_default.close(23);
      pr_default.close(25);
      fix_multi_value_controls( ) ;
   }

   public void strupR90( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e13R92 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
         wcpOA252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOA494ForSer = httpContext.cgiGet( sPrefix+"wcpOA494ForSer") ;
         wcpOA482ForColNom = httpContext.cgiGet( sPrefix+"wcpOA482ForColNom") ;
         wcpOA483ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA483ForColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOA831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA831TipColCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         /* Read variables values. */
         A12130ForPanto = httpContext.cgiGet( edtForPanto_Internalname) ;
         n12130ForPanto = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12130ForPanto", A12130ForPanto);
         A1191ForNomCli = httpContext.cgiGet( edtForNomCli_Internalname) ;
         n1191ForNomCli = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1191ForNomCli", A1191ForNomCli);
         A1192ForNumCli = (int)(localUtil.ctol( httpContext.cgiGet( edtForNumCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n1192ForNumCli = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1192ForNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1192ForNumCli), 6, 0));
         A995ForTonal = httpContext.cgiGet( edtForTonal_Internalname) ;
         n995ForTonal = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A995ForTonal", A995ForTonal);
         A3315ForNumArc = (int)(localUtil.ctol( httpContext.cgiGet( edtForNumArc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n3315ForNumArc = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3315ForNumArc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3315ForNumArc), 8, 0));
         A3560ForOpcCli = GXutil.upper( httpContext.cgiGet( edtForOpcCli_Internalname)) ;
         n3560ForOpcCli = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3560ForOpcCli", A3560ForOpcCli);
         A7537ForOpNum = (byte)(localUtil.ctol( httpContext.cgiGet( edtForOpNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n7537ForOpNum = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7537ForOpNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7537ForOpNum), 2, 0));
         A3558ForFecApr = localUtil.ctod( httpContext.cgiGet( edtForFecApr_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         n3558ForFecApr = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3558ForFecApr", localUtil.format(A3558ForFecApr, "99/99/99"));
         A2838ForRelBan = localUtil.ctond( httpContext.cgiGet( edtForRelBan_Internalname)) ;
         n2838ForRelBan = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2838ForRelBan", GXutil.ltrimstr( A2838ForRelBan, 7, 2));
         h583IntCod = httpContext.cgiGet( edtIntCod_Internalname) ;
         if ( (GXutil.strcmp("", h583IntCod)==0) )
         {
            A583IntCod = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
         }
         else
         {
            A13744IntCDsc = h583IntCod ;
            /* Using cursor H00R928 */
            pr_default.execute(26, new Object[] {A13744IntCDsc, A396EmprCod});
            A583IntCod = H00R928_A583IntCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
            A583IntCod = H00R928_A583IntCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
            if ( ! ( (pr_default.getStatus(26) == 101) ) )
            {
               pr_default.readNext(26);
               if ( ! ( (pr_default.getStatus(26) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "INTCOD");
               }
            }
            else
            {
            }
            pr_default.close(26);
         }
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "h583IntCod", h583IntCod);
         h626MatCod = httpContext.cgiGet( edtMatCod_Internalname) ;
         if ( (GXutil.strcmp("", h626MatCod)==0) )
         {
            A626MatCod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A626MatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A626MatCod), 3, 0));
         }
         else
         {
            A13743MatCDsc = h626MatCod ;
            /* Using cursor H00R929 */
            pr_default.execute(27, new Object[] {A13743MatCDsc, A396EmprCod});
            A626MatCod = H00R929_A626MatCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A626MatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A626MatCod), 3, 0));
            A626MatCod = H00R929_A626MatCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A626MatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A626MatCod), 3, 0));
            if ( ! ( (pr_default.getStatus(27) == 101) ) )
            {
               pr_default.readNext(27);
               if ( ! ( (pr_default.getStatus(27) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "MATCOD");
               }
            }
            else
            {
            }
            pr_default.close(27);
         }
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "h626MatCod", h626MatCod);
         h3316CodSol = httpContext.cgiGet( edtCodSol_Internalname) ;
         if ( (GXutil.strcmp("", h3316CodSol)==0) )
         {
            A3316CodSol = (short)(0) ;
            n3316CodSol = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3316CodSol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3316CodSol), 3, 0));
         }
         else
         {
            A13752CodSDsc = h3316CodSol ;
            /* Using cursor H00R930 */
            pr_default.execute(28, new Object[] {A13752CodSDsc, A396EmprCod});
            A3316CodSol = H00R930_A3316CodSol[0] ;
            n3316CodSol = H00R930_n3316CodSol[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3316CodSol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3316CodSol), 3, 0));
            A3316CodSol = H00R930_A3316CodSol[0] ;
            n3316CodSol = H00R930_n3316CodSol[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3316CodSol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3316CodSol), 3, 0));
            if ( ! ( (pr_default.getStatus(28) == 101) ) )
            {
               pr_default.readNext(28);
               if ( ! ( (pr_default.getStatus(28) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "CODSOL");
               }
            }
            else
            {
            }
            pr_default.close(28);
         }
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "h3316CodSol", h3316CodSol);
         cmbForCon.setValue( httpContext.cgiGet( cmbForCon.getInternalname()) );
         A484ForCon = (byte)(GXutil.lval( httpContext.cgiGet( cmbForCon.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A484ForCon", GXutil.str( A484ForCon, 1, 0));
         h5362IntCodF = httpContext.cgiGet( edtIntCodF_Internalname) ;
         if ( (GXutil.strcmp("", h5362IntCodF)==0) )
         {
            A5362IntCodF = (byte)(0) ;
            n5362IntCodF = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5362IntCodF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5362IntCodF), 2, 0));
         }
         else
         {
            A13753IntCFDsc = h5362IntCodF ;
            /* Using cursor H00R931 */
            pr_default.execute(29, new Object[] {A13753IntCFDsc, A396EmprCod});
            A5362IntCodF = H00R931_A5362IntCodF[0] ;
            n5362IntCodF = H00R931_n5362IntCodF[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5362IntCodF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5362IntCodF), 2, 0));
            A5362IntCodF = H00R931_A5362IntCodF[0] ;
            n5362IntCodF = H00R931_n5362IntCodF[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5362IntCodF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5362IntCodF), 2, 0));
            if ( ! ( (pr_default.getStatus(29) == 101) ) )
            {
               pr_default.readNext(29);
               if ( ! ( (pr_default.getStatus(29) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "INTCODF");
               }
            }
            else
            {
            }
            pr_default.close(29);
         }
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "h5362IntCodF", h5362IntCodF);
         cmbForBlo.setValue( httpContext.cgiGet( cmbForBlo.getInternalname()) );
         A7781ForBlo = httpContext.cgiGet( cmbForBlo.getInternalname()) ;
         n7781ForBlo = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7781ForBlo", A7781ForBlo);
         A8561Fam_Cod = (short)(localUtil.ctol( httpContext.cgiGet( edtFam_Cod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n8561Fam_Cod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8561Fam_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8561Fam_Cod), 4, 0));
         A6379ForNomCli2 = httpContext.cgiGet( edtForNomCli2_Internalname) ;
         n6379ForNomCli2 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6379ForNomCli2", A6379ForNomCli2);
         A7029ForNomCli3 = httpContext.cgiGet( edtForNomCli3_Internalname) ;
         n7029ForNomCli3 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7029ForNomCli3", A7029ForNomCli3);
         A12403ForLotHil2 = httpContext.cgiGet( edtForLotHil2_Internalname) ;
         n12403ForLotHil2 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12403ForLotHil2", A12403ForLotHil2);
         A12404ForLotHil3 = httpContext.cgiGet( edtForLotHil3_Internalname) ;
         n12404ForLotHil3 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12404ForLotHil3", A12404ForLotHil3);
         A2749ForPro = ((GXutil.strcmp(httpContext.cgiGet( chkForPro.getInternalname()), "S")==0) ? "S" : "N") ;
         n2749ForPro = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2749ForPro", A2749ForPro);
         A486ForNumCol = (int)(localUtil.ctol( httpContext.cgiGet( edtForNumCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
         A485ForFec = localUtil.ctod( httpContext.cgiGet( edtForFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         n485ForFec = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A485ForFec", localUtil.format(A485ForFec, "99/99/99"));
         A495ForUltMod = localUtil.ctod( httpContext.cgiGet( edtForUltMod_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         n495ForUltMod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A495ForUltMod", localUtil.format(A495ForUltMod, "99/99/99"));
         A5625ForFecHor = localUtil.ctot( httpContext.cgiGet( edtForFecHor_Internalname)) ;
         n5625ForFecHor = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5625ForFecHor", localUtil.ttoc( A5625ForFecHor, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A5624ForUsrCod = GXutil.upper( httpContext.cgiGet( edtForUsrCod_Internalname)) ;
         n5624ForUsrCod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5624ForUsrCod", A5624ForUsrCod);
         A6609ForFecCre = localUtil.ctot( httpContext.cgiGet( edtForFecCre_Internalname)) ;
         n6609ForFecCre = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6609ForFecCre", localUtil.ttoc( A6609ForFecCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A6608ForUsrCre = httpContext.cgiGet( edtForUsrCre_Internalname) ;
         n6608ForUsrCre = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6608ForUsrCre", A6608ForUsrCre);
         h1514MacProCod = httpContext.cgiGet( edtMacProCod_Internalname) ;
         if ( (GXutil.strcmp("", h1514MacProCod)==0) )
         {
            A1514MacProCod = "" ;
            n1514MacProCod = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1514MacProCod", A1514MacProCod);
         }
         else
         {
            A13755MacProCDsc = h1514MacProCod ;
            /* Using cursor H00R932 */
            pr_default.execute(30, new Object[] {A13755MacProCDsc, A396EmprCod});
            A1514MacProCod = H00R932_A1514MacProCod[0] ;
            n1514MacProCod = H00R932_n1514MacProCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1514MacProCod", A1514MacProCod);
            A1514MacProCod = H00R932_A1514MacProCod[0] ;
            n1514MacProCod = H00R932_n1514MacProCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1514MacProCod", A1514MacProCod);
            if ( ! ( (pr_default.getStatus(30) == 101) ) )
            {
               pr_default.readNext(30);
               if ( ! ( (pr_default.getStatus(30) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "MACPROCOD");
               }
            }
            else
            {
            }
            pr_default.close(30);
         }
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "h1514MacProCod", h1514MacProCod);
         A4384ForTipArt = (short)(localUtil.ctol( httpContext.cgiGet( edtForTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n4384ForTipArt = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4384ForTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4384ForTipArt), 4, 0));
         A8043ForTipT = (byte)(localUtil.ctol( httpContext.cgiGet( edtForTipT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n8043ForTipT = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8043ForTipT", GXutil.str( A8043ForTipT, 1, 0));
         A3588ForEst = httpContext.cgiGet( edtForEst_Internalname) ;
         n3588ForEst = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3588ForEst", A3588ForEst);
         A11041ForFecCtrl = localUtil.ctot( httpContext.cgiGet( edtForFecCtrl_Internalname)) ;
         n11041ForFecCtrl = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11041ForFecCtrl", localUtil.ttoc( A11041ForFecCtrl, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A11042ForFecCtrf = localUtil.ctot( httpContext.cgiGet( edtForFecCtrf_Internalname)) ;
         n11042ForFecCtrf = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11042ForFecCtrf", localUtil.ttoc( A11042ForFecCtrf, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A4339ForRGB = localUtil.ctol( httpContext.cgiGet( edtForRGB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         n4339ForRGB = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4339ForRGB", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4339ForRGB), 10, 0));
         A496ForUltUti = localUtil.ctod( httpContext.cgiGet( edtForUltUti_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         n496ForUltUti = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A496ForUltUti", localUtil.format(A496ForUltUti, "99/99/99"));
         A492ForPreKgm = localUtil.ctond( httpContext.cgiGet( edtForPreKgm_Internalname)) ;
         n492ForPreKgm = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A492ForPreKgm", GXutil.ltrimstr( A492ForPreKgm, 12, 5));
         A493ForPreMtr = localUtil.ctond( httpContext.cgiGet( edtForPreMtr_Internalname)) ;
         n493ForPreMtr = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A493ForPreMtr", GXutil.ltrimstr( A493ForPreMtr, 12, 5));
         A1159ForUltLin = (short)(localUtil.ctol( httpContext.cgiGet( edtForUltLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n1159ForUltLin = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1159ForUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1159ForUltLin), 4, 0));
         A4380ForCosForm = localUtil.ctond( httpContext.cgiGet( edtForCosForm_Internalname)) ;
         n4380ForCosForm = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4380ForCosForm", GXutil.ltrimstr( A4380ForCosForm, 11, 5));
         A9792For_Reo = httpContext.cgiGet( edtFor_Reo_Internalname) ;
         n9792For_Reo = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9792For_Reo", A9792For_Reo);
         A8777For_item1 = httpContext.cgiGet( edtFor_item1_Internalname) ;
         n8777For_item1 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8777For_item1", A8777For_item1);
         A11705For_item2 = httpContext.cgiGet( edtFor_item2_Internalname) ;
         n11705For_item2 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11705For_item2", A11705For_item2);
         A11706ForObs2 = httpContext.cgiGet( edtForObs2_Internalname) ;
         n11706ForObs2 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11706ForObs2", A11706ForObs2);
         A12399ForMT = (byte)(localUtil.ctol( httpContext.cgiGet( edtForMT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n12399ForMT = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12399ForMT", GXutil.str( A12399ForMT, 1, 0));
         A12400ForTRabs = (byte)(localUtil.ctol( httpContext.cgiGet( edtForTRabs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n12400ForTRabs = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12400ForTRabs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12400ForTRabs), 2, 0));
         A12401ForKgMn = localUtil.ctond( httpContext.cgiGet( edtForKgMn_Internalname)) ;
         n12401ForKgMn = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12401ForKgMn", GXutil.ltrimstr( A12401ForKgMn, 9, 2));
         A1515MacProDsc = httpContext.cgiGet( edtMacProDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1515MacProDsc", A1515MacProDsc);
         A584IntDsc = httpContext.cgiGet( edtIntDsc_Internalname) ;
         n584IntDsc = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A584IntDsc", A584IntDsc);
         A627MatDsc = httpContext.cgiGet( edtMatDsc_Internalname) ;
         n627MatDsc = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A627MatDsc", A627MatDsc);
         A3317DscSol = httpContext.cgiGet( edtDscSol_Internalname) ;
         n3317DscSol = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3317DscSol", A3317DscSol);
         A3792ForConDsc = httpContext.cgiGet( edtForConDsc_Internalname) ;
         n3792ForConDsc = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3792ForConDsc", A3792ForConDsc);
         A5363IntDscF = httpContext.cgiGet( edtIntDscF_Internalname) ;
         n5363IntDscF = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5363IntDscF", A5363IntDscF);
         A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A279CliNom", A279CliNom);
         A5742ForSerDsc = httpContext.cgiGet( edtForSerDsc_Internalname) ;
         n5742ForSerDsc = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5742ForSerDsc", A5742ForSerDsc);
         A832TipColDsc = httpContext.cgiGet( edtTipColDsc_Internalname) ;
         n832TipColDsc = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A832TipColDsc", A832TipColDsc);
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
      e13R92 ();
      if (returnInSub) return;
   }

   public void e13R92( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV13Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tmformulasgeneral_impl.this.GXt_char1 = GXv_char2[0] ;
      AV13Station = GXt_char1 ;
      GXv_char2[0] = AV14Emprcod ;
      GXv_char3[0] = AV15Emprnom ;
      GXv_char4[0] = AV16Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV13Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmformulasgeneral_impl.this.AV14Emprcod = GXv_char2[0] ;
      tmformulasgeneral_impl.this.AV15Emprnom = GXv_char3[0] ;
      tmformulasgeneral_impl.this.AV16Usurcod = GXv_char4[0] ;
      GXv_SdtWWPContext5[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV6WWPContext = GXv_SdtWWPContext5[0] ;
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
   }

   protected void nextLoad( )
   {
   }

   protected void e14R92( )
   {
      /* Load Routine */
      returnInSub = false ;
      edtForTipArt_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForTipArt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForTipArt_Visible), 5, 0), true);
      edtForTipT_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForTipT_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForTipT_Visible), 5, 0), true);
      edtForEst_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForEst_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForEst_Visible), 5, 0), true);
      edtForFecCtrl_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForFecCtrl_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForFecCtrl_Visible), 5, 0), true);
      edtForFecCtrf_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForFecCtrf_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForFecCtrf_Visible), 5, 0), true);
      edtForRGB_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForRGB_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForRGB_Visible), 5, 0), true);
      edtForUltUti_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForUltUti_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForUltUti_Visible), 5, 0), true);
      edtForPreKgm_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForPreKgm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPreKgm_Visible), 5, 0), true);
      edtForPreMtr_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForPreMtr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPreMtr_Visible), 5, 0), true);
      edtForUltLin_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForUltLin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForUltLin_Visible), 5, 0), true);
      edtForCosForm_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForCosForm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForCosForm_Visible), 5, 0), true);
      edtFor_Reo_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFor_Reo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFor_Reo_Visible), 5, 0), true);
      edtFor_item1_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFor_item1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFor_item1_Visible), 5, 0), true);
      edtFor_item2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFor_item2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFor_item2_Visible), 5, 0), true);
      edtForObs2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForObs2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForObs2_Visible), 5, 0), true);
      edtForMT_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForMT_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForMT_Visible), 5, 0), true);
      edtForTRabs_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForTRabs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForTRabs_Visible), 5, 0), true);
      edtForKgMn_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForKgMn_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForKgMn_Visible), 5, 0), true);
      edtMacProDsc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMacProDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacProDsc_Visible), 5, 0), true);
      edtIntDsc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtIntDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntDsc_Visible), 5, 0), true);
      edtMatDsc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMatDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMatDsc_Visible), 5, 0), true);
      edtDscSol_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDscSol_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDscSol_Visible), 5, 0), true);
      edtForConDsc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForConDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForConDsc_Visible), 5, 0), true);
      edtIntDscF_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtIntDscF_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntDscF_Visible), 5, 0), true);
      edtCliNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), true);
      edtForSerDsc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForSerDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForSerDsc_Visible), 5, 0), true);
      edtTipColDsc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTipColDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColDsc_Visible), 5, 0), true);
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "HILLOT", "")) == 1 ) || ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "ERFOC", "")) == 1 ) || ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "ELIOT", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtForNomCli2_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForNomCli2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForNomCli2_Visible), 5, 0), true);
         divFornomcli2_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divFornomcli2_cell_Internalname, "Class", divFornomcli2_cell_Class, true);
      }
      else
      {
         edtForNomCli2_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForNomCli2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForNomCli2_Visible), 5, 0), true);
         divFornomcli2_cell_Class = "col-xs-12 col-sm-6 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divFornomcli2_cell_Internalname, "Class", divFornomcli2_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "KIMEX", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtForNomCli3_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForNomCli3_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForNomCli3_Visible), 5, 0), true);
         divFornomcli3_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divFornomcli3_cell_Internalname, "Class", divFornomcli3_cell_Class, true);
      }
      else
      {
         edtForNomCli3_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForNomCli3_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForNomCli3_Visible), 5, 0), true);
         divFornomcli3_cell_Class = "col-xs-12 col-sm-6 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divFornomcli3_cell_Internalname, "Class", divFornomcli3_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "KIMEX", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtForLotHil2_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForLotHil2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForLotHil2_Visible), 5, 0), true);
         divForlothil2_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divForlothil2_cell_Internalname, "Class", divForlothil2_cell_Class, true);
      }
      else
      {
         edtForLotHil2_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForLotHil2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForLotHil2_Visible), 5, 0), true);
         divForlothil2_cell_Class = "col-xs-12 col-sm-6 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divForlothil2_cell_Internalname, "Class", divForlothil2_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "KIMEX", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtForLotHil3_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForLotHil3_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForLotHil3_Visible), 5, 0), true);
         divForlothil3_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divForlothil3_cell_Internalname, "Class", divForlothil3_cell_Class, true);
      }
      else
      {
         edtForLotHil3_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForLotHil3_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForLotHil3_Visible), 5, 0), true);
         divForlothil3_cell_Class = "col-xs-12 col-sm-6 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divForlothil3_cell_Internalname, "Class", divForlothil3_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "FRAINT", "")) == 1 ) || ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "LAVAND", "")) == 1 ) || ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "ELIOT", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtIntCodF_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtIntCodF_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntCodF_Visible), 5, 0), true);
         divIntcodf_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divIntcodf_cell_Internalname, "Class", divIntcodf_cell_Class, true);
      }
      else
      {
         edtIntCodF_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtIntCodF_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntCodF_Visible), 5, 0), true);
         divIntcodf_cell_Class = "col-xs-12 col-sm-4 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divIntcodf_cell_Internalname, "Class", divIntcodf_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "COLBLO", "")) == 1 ) || ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "ELIOT", "")) == 1 ) || ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "LINDAL", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         cmbForBlo.setVisible( 0 );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbForBlo.getInternalname(), "Visible", GXutil.ltrimstr( cmbForBlo.getVisible(), 5, 0), true);
         divForblo_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divForblo_cell_Internalname, "Class", divForblo_cell_Class, true);
      }
      else
      {
         cmbForBlo.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbForBlo.getInternalname(), "Visible", GXutil.ltrimstr( cmbForBlo.getVisible(), 5, 0), true);
         divForblo_cell_Class = "col-xs-12 col-sm-4 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divForblo_cell_Internalname, "Class", divForblo_cell_Class, true);
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
         edtFam_Cod_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFam_Cod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFam_Cod_Visible), 5, 0), true);
         divFam_cod_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divFam_cod_cell_Internalname, "Class", divFam_cod_cell_Class, true);
      }
      else
      {
         edtFam_Cod_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFam_Cod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFam_Cod_Visible), 5, 0), true);
         divFam_cod_cell_Class = "col-xs-12 col-sm-4 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divFam_cod_cell_Internalname, "Class", divFam_cod_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "ENSAIO", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtForOpcCli_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForOpcCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForOpcCli_Visible), 5, 0), true);
         divForopccli_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divForopccli_cell_Internalname, "Class", divForopccli_cell_Class, true);
      }
      else
      {
         edtForOpcCli_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForOpcCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForOpcCli_Visible), 5, 0), true);
         divForopccli_cell_Class = "col-xs-12 col-sm-3 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divForopccli_cell_Internalname, "Class", divForopccli_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "ENSAIO", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtForOpNum_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForOpNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForOpNum_Visible), 5, 0), true);
         divForopnum_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divForopnum_cell_Internalname, "Class", divForopnum_cell_Class, true);
      }
      else
      {
         edtForOpNum_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForOpNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForOpNum_Visible), 5, 0), true);
         divForopnum_cell_Class = "col-xs-12 col-sm-2 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divForopnum_cell_Internalname, "Class", divForopnum_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "ENSAIO", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtForFecApr_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForFecApr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForFecApr_Visible), 5, 0), true);
         divForfecapr_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divForfecapr_cell_Internalname, "Class", divForfecapr_cell_Class, true);
      }
      else
      {
         edtForFecApr_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForFecApr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForFecApr_Visible), 5, 0), true);
         divForfecapr_cell_Class = "col-xs-12 col-sm-2 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divForfecapr_cell_Internalname, "Class", divForfecapr_cell_Class, true);
      }
      if ( ( edtForNomCli2_Visible == ( 0 )) && ( edtForNomCli3_Visible == ( 0 )) && ( edtForLotHil2_Visible == ( 0 )) && ( edtForLotHil3_Visible == ( 0 )) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         divUnnamedtable7_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divUnnamedtable7_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable7_Visible), 5, 0), true);
      }
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV7TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV17Pgmname );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( false );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV10HTTPRequest.getScriptName()+"?"+AV10HTTPRequest.getQuerystring() );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TMFormulas" );
      AV9Session.setValue("TrnContext", AV7TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      A252CliCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A494ForSer = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A494ForSer", A494ForSer);
      A482ForColNom = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A482ForColNom", A482ForColNom);
      A483ForColNum = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
      A831TipColCod = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
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
      paR92( ) ;
      wsR92( ) ;
      weR92( ) ;
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
      sCtrlA252CliCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlA494ForSer = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlA482ForColNom = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlA483ForColNum = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlA831TipColCod = (String)getParm(obj,5,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paR92( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "tmformulasgeneral", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paR92( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A396EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A252CliCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A494ForSer = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A494ForSer", A494ForSer);
         A482ForColNom = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A482ForColNom", A482ForColNom);
         A483ForColNum = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
         A831TipColCod = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
      }
      wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
      wcpOA252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOA494ForSer = httpContext.cgiGet( sPrefix+"wcpOA494ForSer") ;
      wcpOA482ForColNom = httpContext.cgiGet( sPrefix+"wcpOA482ForColNom") ;
      wcpOA483ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA483ForColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOA831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA831TipColCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(A396EmprCod, wcpOA396EmprCod) != 0 ) || ( A252CliCod != wcpOA252CliCod ) || ( GXutil.strcmp(A494ForSer, wcpOA494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, wcpOA482ForColNom) != 0 ) || ( A483ForColNum != wcpOA483ForColNum ) || ( A831TipColCod != wcpOA831TipColCod ) ) )
      {
         setjustcreated();
      }
      wcpOA396EmprCod = A396EmprCod ;
      wcpOA252CliCod = A252CliCod ;
      wcpOA494ForSer = A494ForSer ;
      wcpOA482ForColNom = A482ForColNom ;
      wcpOA483ForColNum = A483ForColNum ;
      wcpOA831TipColCod = A831TipColCod ;
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
      sCtrlA252CliCod = httpContext.cgiGet( sPrefix+"A252CliCod_CTRL") ;
      if ( GXutil.len( sCtrlA252CliCod) > 0 )
      {
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlA252CliCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      else
      {
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"A252CliCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlA494ForSer = httpContext.cgiGet( sPrefix+"A494ForSer_CTRL") ;
      if ( GXutil.len( sCtrlA494ForSer) > 0 )
      {
         A494ForSer = httpContext.cgiGet( sCtrlA494ForSer) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A494ForSer", A494ForSer);
      }
      else
      {
         A494ForSer = httpContext.cgiGet( sPrefix+"A494ForSer_PARM") ;
      }
      sCtrlA482ForColNom = httpContext.cgiGet( sPrefix+"A482ForColNom_CTRL") ;
      if ( GXutil.len( sCtrlA482ForColNom) > 0 )
      {
         A482ForColNom = httpContext.cgiGet( sCtrlA482ForColNom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A482ForColNom", A482ForColNom);
      }
      else
      {
         A482ForColNom = httpContext.cgiGet( sPrefix+"A482ForColNom_PARM") ;
      }
      sCtrlA483ForColNum = httpContext.cgiGet( sPrefix+"A483ForColNum_CTRL") ;
      if ( GXutil.len( sCtrlA483ForColNum) > 0 )
      {
         A483ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlA483ForColNum), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
      }
      else
      {
         A483ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"A483ForColNum_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlA831TipColCod = httpContext.cgiGet( sPrefix+"A831TipColCod_CTRL") ;
      if ( GXutil.len( sCtrlA831TipColCod) > 0 )
      {
         A831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlA831TipColCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
      }
      else
      {
         A831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"A831TipColCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      paR92( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsR92( ) ;
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
      wsR92( ) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A252CliCod_PARM", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA252CliCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A252CliCod_CTRL", GXutil.rtrim( sCtrlA252CliCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A494ForSer_PARM", GXutil.rtrim( A494ForSer));
      if ( GXutil.len( GXutil.rtrim( sCtrlA494ForSer)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A494ForSer_CTRL", GXutil.rtrim( sCtrlA494ForSer));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A482ForColNom_PARM", GXutil.rtrim( A482ForColNom));
      if ( GXutil.len( GXutil.rtrim( sCtrlA482ForColNom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A482ForColNom_CTRL", GXutil.rtrim( sCtrlA482ForColNom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A483ForColNum_PARM", GXutil.ltrim( localUtil.ntoc( A483ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA483ForColNum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A483ForColNum_CTRL", GXutil.rtrim( sCtrlA483ForColNum));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A831TipColCod_PARM", GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA831TipColCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A831TipColCod_CTRL", GXutil.rtrim( sCtrlA831TipColCod));
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
      weR92( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211665782", true, true);
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
      httpContext.AddJavascriptSource("tmformulasgeneral.js", "?20268211665782", false, true);
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
      edtCliCod_Internalname = sPrefix+"CLICOD" ;
      edtForSer_Internalname = sPrefix+"FORSER" ;
      edtForColNom_Internalname = sPrefix+"FORCOLNOM" ;
      edtForColNum_Internalname = sPrefix+"FORCOLNUM" ;
      edtTipColCod_Internalname = sPrefix+"TIPCOLCOD" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      edtForPanto_Internalname = sPrefix+"FORPANTO" ;
      edtForNomCli_Internalname = sPrefix+"FORNOMCLI" ;
      edtForNumCli_Internalname = sPrefix+"FORNUMCLI" ;
      edtForTonal_Internalname = sPrefix+"FORTONAL" ;
      divUnnamedtable3_Internalname = sPrefix+"UNNAMEDTABLE3" ;
      edtForNumArc_Internalname = sPrefix+"FORNUMARC" ;
      edtForOpcCli_Internalname = sPrefix+"FOROPCCLI" ;
      divForopccli_cell_Internalname = sPrefix+"FOROPCCLI_CELL" ;
      edtForOpNum_Internalname = sPrefix+"FOROPNUM" ;
      divForopnum_cell_Internalname = sPrefix+"FOROPNUM_CELL" ;
      edtForFecApr_Internalname = sPrefix+"FORFECAPR" ;
      divForfecapr_cell_Internalname = sPrefix+"FORFECAPR_CELL" ;
      edtForRelBan_Internalname = sPrefix+"FORRELBAN" ;
      divUnnamedtable4_Internalname = sPrefix+"UNNAMEDTABLE4" ;
      grpUnnamedgroup5_Internalname = sPrefix+"UNNAMEDGROUP5" ;
      edtIntCod_Internalname = sPrefix+"INTCOD" ;
      edtMatCod_Internalname = sPrefix+"MATCOD" ;
      edtCodSol_Internalname = sPrefix+"CODSOL" ;
      cmbForCon.setInternalname( sPrefix+"FORCON" );
      edtIntCodF_Internalname = sPrefix+"INTCODF" ;
      divIntcodf_cell_Internalname = sPrefix+"INTCODF_CELL" ;
      cmbForBlo.setInternalname( sPrefix+"FORBLO" );
      divForblo_cell_Internalname = sPrefix+"FORBLO_CELL" ;
      edtFam_Cod_Internalname = sPrefix+"FAM_COD" ;
      divFam_cod_cell_Internalname = sPrefix+"FAM_COD_CELL" ;
      divUnnamedtable6_Internalname = sPrefix+"UNNAMEDTABLE6" ;
      edtForNomCli2_Internalname = sPrefix+"FORNOMCLI2" ;
      divFornomcli2_cell_Internalname = sPrefix+"FORNOMCLI2_CELL" ;
      edtForNomCli3_Internalname = sPrefix+"FORNOMCLI3" ;
      divFornomcli3_cell_Internalname = sPrefix+"FORNOMCLI3_CELL" ;
      edtForLotHil2_Internalname = sPrefix+"FORLOTHIL2" ;
      divForlothil2_cell_Internalname = sPrefix+"FORLOTHIL2_CELL" ;
      edtForLotHil3_Internalname = sPrefix+"FORLOTHIL3" ;
      divForlothil3_cell_Internalname = sPrefix+"FORLOTHIL3_CELL" ;
      divUnnamedtable7_Internalname = sPrefix+"UNNAMEDTABLE7" ;
      chkForPro.setInternalname( sPrefix+"FORPRO" );
      edtForNumCol_Internalname = sPrefix+"FORNUMCOL" ;
      edtForFec_Internalname = sPrefix+"FORFEC" ;
      edtForUltMod_Internalname = sPrefix+"FORULTMOD" ;
      divUnnamedtable8_Internalname = sPrefix+"UNNAMEDTABLE8" ;
      edtForFecHor_Internalname = sPrefix+"FORFECHOR" ;
      edtForUsrCod_Internalname = sPrefix+"FORUSRCOD" ;
      edtForFecCre_Internalname = sPrefix+"FORFECCRE" ;
      edtForUsrCre_Internalname = sPrefix+"FORUSRCRE" ;
      divUnnamedtable9_Internalname = sPrefix+"UNNAMEDTABLE9" ;
      grpUnnamedgroup10_Internalname = sPrefix+"UNNAMEDGROUP10" ;
      edtMacProCod_Internalname = sPrefix+"MACPROCOD" ;
      divUnnamedtable11_Internalname = sPrefix+"UNNAMEDTABLE11" ;
      divTransactiondetail_tableattributes_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLEATTRIBUTES" ;
      Dvpanel_transactiondetail_tableattributes_Internalname = sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES" ;
      divTransactiondetail_tablecontent_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLECONTENT" ;
      divTransactiondetail_tableleaflevel_level1_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLELEAFLEVEL_LEVEL1" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE1" ;
      divTransactiondetail_tablemain_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLEMAIN" ;
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      divTable_Internalname = sPrefix+"TABLE" ;
      edtForTipArt_Internalname = sPrefix+"FORTIPART" ;
      edtForTipT_Internalname = sPrefix+"FORTIPT" ;
      edtForEst_Internalname = sPrefix+"FOREST" ;
      edtForFecCtrl_Internalname = sPrefix+"FORFECCTRL" ;
      edtForFecCtrf_Internalname = sPrefix+"FORFECCTRF" ;
      edtForRGB_Internalname = sPrefix+"FORRGB" ;
      edtForUltUti_Internalname = sPrefix+"FORULTUTI" ;
      edtForPreKgm_Internalname = sPrefix+"FORPREKGM" ;
      edtForPreMtr_Internalname = sPrefix+"FORPREMTR" ;
      edtForUltLin_Internalname = sPrefix+"FORULTLIN" ;
      edtForCosForm_Internalname = sPrefix+"FORCOSFORM" ;
      edtFor_Reo_Internalname = sPrefix+"FOR_REO" ;
      edtFor_item1_Internalname = sPrefix+"FOR_ITEM1" ;
      edtFor_item2_Internalname = sPrefix+"FOR_ITEM2" ;
      edtForObs2_Internalname = sPrefix+"FOROBS2" ;
      edtForMT_Internalname = sPrefix+"FORMT" ;
      edtForTRabs_Internalname = sPrefix+"FORTRABS" ;
      edtForKgMn_Internalname = sPrefix+"FORKGMN" ;
      edtMacProDsc_Internalname = sPrefix+"MACPRODSC" ;
      edtIntDsc_Internalname = sPrefix+"INTDSC" ;
      edtMatDsc_Internalname = sPrefix+"MATDSC" ;
      edtDscSol_Internalname = sPrefix+"DSCSOL" ;
      edtForConDsc_Internalname = sPrefix+"FORCONDSC" ;
      edtIntDscF_Internalname = sPrefix+"INTDSCF" ;
      edtCliNom_Internalname = sPrefix+"CLINOM" ;
      edtForSerDsc_Internalname = sPrefix+"FORSERDSC" ;
      edtTipColDsc_Internalname = sPrefix+"TIPCOLDSC" ;
      divHtml_bottomauxiliarcontrols_Internalname = sPrefix+"HTML_BOTTOMAUXILIARCONTROLS" ;
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
      edtTipColDsc_Jsonclick = "" ;
      edtTipColDsc_Visible = 1 ;
      edtForSerDsc_Jsonclick = "" ;
      edtForSerDsc_Visible = 1 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Visible = 1 ;
      edtIntDscF_Jsonclick = "" ;
      edtIntDscF_Visible = 1 ;
      edtForConDsc_Jsonclick = "" ;
      edtForConDsc_Visible = 1 ;
      edtDscSol_Jsonclick = "" ;
      edtDscSol_Visible = 1 ;
      edtMatDsc_Jsonclick = "" ;
      edtMatDsc_Visible = 1 ;
      edtIntDsc_Jsonclick = "" ;
      edtIntDsc_Visible = 1 ;
      edtMacProDsc_Jsonclick = "" ;
      edtMacProDsc_Visible = 1 ;
      edtForKgMn_Jsonclick = "" ;
      edtForKgMn_Visible = 1 ;
      edtForTRabs_Jsonclick = "" ;
      edtForTRabs_Visible = 1 ;
      edtForMT_Jsonclick = "" ;
      edtForMT_Visible = 1 ;
      edtForObs2_Visible = 1 ;
      edtFor_item2_Jsonclick = "" ;
      edtFor_item2_Visible = 1 ;
      edtFor_item1_Jsonclick = "" ;
      edtFor_item1_Visible = 1 ;
      edtFor_Reo_Jsonclick = "" ;
      edtFor_Reo_Visible = 1 ;
      edtForCosForm_Jsonclick = "" ;
      edtForCosForm_Visible = 1 ;
      edtForUltLin_Jsonclick = "" ;
      edtForUltLin_Visible = 1 ;
      edtForPreMtr_Jsonclick = "" ;
      edtForPreMtr_Visible = 1 ;
      edtForPreKgm_Jsonclick = "" ;
      edtForPreKgm_Visible = 1 ;
      edtForUltUti_Jsonclick = "" ;
      edtForUltUti_Visible = 1 ;
      edtForRGB_Jsonclick = "" ;
      edtForRGB_Visible = 1 ;
      edtForFecCtrf_Jsonclick = "" ;
      edtForFecCtrf_Visible = 1 ;
      edtForFecCtrl_Jsonclick = "" ;
      edtForFecCtrl_Visible = 1 ;
      edtForEst_Jsonclick = "" ;
      edtForEst_Visible = 1 ;
      edtForTipT_Jsonclick = "" ;
      edtForTipT_Visible = 1 ;
      edtForTipArt_Jsonclick = "" ;
      edtForTipArt_Visible = 1 ;
      edtMacProCod_Jsonclick = "" ;
      edtMacProCod_Enabled = 0 ;
      edtForUsrCre_Jsonclick = "" ;
      edtForUsrCre_Enabled = 0 ;
      edtForFecCre_Jsonclick = "" ;
      edtForFecCre_Enabled = 0 ;
      edtForUsrCod_Jsonclick = "" ;
      edtForUsrCod_Enabled = 0 ;
      edtForFecHor_Jsonclick = "" ;
      edtForFecHor_Enabled = 0 ;
      edtForUltMod_Jsonclick = "" ;
      edtForUltMod_Enabled = 0 ;
      edtForFec_Jsonclick = "" ;
      edtForFec_Enabled = 0 ;
      edtForNumCol_Jsonclick = "" ;
      edtForNumCol_Enabled = 0 ;
      chkForPro.setEnabled( 0 );
      edtForLotHil3_Jsonclick = "" ;
      edtForLotHil3_Enabled = 0 ;
      edtForLotHil3_Visible = 1 ;
      divForlothil3_cell_Class = "col-xs-12 col-sm-6" ;
      edtForLotHil2_Jsonclick = "" ;
      edtForLotHil2_Enabled = 0 ;
      edtForLotHil2_Visible = 1 ;
      divForlothil2_cell_Class = "col-xs-12 col-sm-6" ;
      edtForNomCli3_Jsonclick = "" ;
      edtForNomCli3_Enabled = 0 ;
      edtForNomCli3_Visible = 1 ;
      divFornomcli3_cell_Class = "col-xs-12 col-sm-6" ;
      edtForNomCli2_Jsonclick = "" ;
      edtForNomCli2_Enabled = 0 ;
      edtForNomCli2_Visible = 1 ;
      divFornomcli2_cell_Class = "col-xs-12 col-sm-6" ;
      divUnnamedtable7_Visible = 1 ;
      edtFam_Cod_Jsonclick = "" ;
      edtFam_Cod_Enabled = 0 ;
      edtFam_Cod_Visible = 1 ;
      divFam_cod_cell_Class = "col-xs-12 col-sm-4" ;
      cmbForBlo.setJsonclick( "" );
      cmbForBlo.setEnabled( 0 );
      cmbForBlo.setVisible( 1 );
      divForblo_cell_Class = "col-xs-12 col-sm-4" ;
      edtIntCodF_Jsonclick = "" ;
      edtIntCodF_Enabled = 0 ;
      edtIntCodF_Visible = 1 ;
      divIntcodf_cell_Class = "col-xs-12 col-sm-4" ;
      cmbForCon.setJsonclick( "" );
      cmbForCon.setEnabled( 0 );
      edtCodSol_Jsonclick = "" ;
      edtCodSol_Enabled = 0 ;
      edtMatCod_Jsonclick = "" ;
      edtMatCod_Enabled = 0 ;
      edtIntCod_Jsonclick = "" ;
      edtIntCod_Enabled = 0 ;
      edtForRelBan_Jsonclick = "" ;
      edtForRelBan_Enabled = 0 ;
      edtForFecApr_Jsonclick = "" ;
      edtForFecApr_Enabled = 0 ;
      edtForFecApr_Visible = 1 ;
      divForfecapr_cell_Class = "col-xs-12 col-sm-2" ;
      edtForOpNum_Jsonclick = "" ;
      edtForOpNum_Enabled = 0 ;
      edtForOpNum_Visible = 1 ;
      divForopnum_cell_Class = "col-xs-12 col-sm-2" ;
      edtForOpcCli_Jsonclick = "" ;
      edtForOpcCli_Enabled = 0 ;
      edtForOpcCli_Visible = 1 ;
      divForopccli_cell_Class = "col-xs-12 col-sm-3" ;
      edtForNumArc_Jsonclick = "" ;
      edtForNumArc_Enabled = 0 ;
      edtForTonal_Jsonclick = "" ;
      edtForTonal_Enabled = 0 ;
      edtForNumCli_Jsonclick = "" ;
      edtForNumCli_Enabled = 0 ;
      edtForNomCli_Jsonclick = "" ;
      edtForNomCli_Enabled = 0 ;
      edtForPanto_Jsonclick = "" ;
      edtForPanto_Enabled = 0 ;
      edtTipColCod_Jsonclick = "" ;
      edtTipColCod_Enabled = 0 ;
      edtForColNum_Jsonclick = "" ;
      edtForColNum_Enabled = 0 ;
      edtForColNom_Jsonclick = "" ;
      edtForColNom_Enabled = 0 ;
      edtForSer_Jsonclick = "" ;
      edtForSer_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 0 ;
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
      cmbForCon.setName( "FORCON" );
      cmbForCon.setWebtags( "" );
      if ( cmbForCon.getItemCount() > 0 )
      {
      }
      cmbForBlo.setName( "FORBLO" );
      cmbForBlo.setWebtags( "" );
      cmbForBlo.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbForBlo.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbForBlo.getItemCount() > 0 )
      {
      }
      chkForPro.setName( "FORPRO" );
      chkForPro.setWebtags( "" );
      chkForPro.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkForPro.getInternalname(), "TitleCaption", chkForPro.getCaption(), true);
      chkForPro.setCheckedValue( "N" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A2749ForPro',fld:'FORPRO',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOUPDATE'","{handler:'e11R91',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'}]");
      setEventMetadata("'DOUPDATE'",",oparms:[]}");
      setEventMetadata("'DODELETE'","{handler:'e12R91',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'}]");
      setEventMetadata("'DODELETE'",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_FORSER","{handler:'valid_Forser',iparms:[]");
      setEventMetadata("VALID_FORSER",",oparms:[]}");
      setEventMetadata("VALID_FORCOLNOM","{handler:'valid_Forcolnom',iparms:[]");
      setEventMetadata("VALID_FORCOLNOM",",oparms:[]}");
      setEventMetadata("VALID_FORCOLNUM","{handler:'valid_Forcolnum',iparms:[]");
      setEventMetadata("VALID_FORCOLNUM",",oparms:[]}");
      setEventMetadata("VALID_TIPCOLCOD","{handler:'valid_Tipcolcod',iparms:[]");
      setEventMetadata("VALID_TIPCOLCOD",",oparms:[]}");
      setEventMetadata("VALID_INTCOD","{handler:'valid_Intcod',iparms:[]");
      setEventMetadata("VALID_INTCOD",",oparms:[]}");
      setEventMetadata("VALID_MATCOD","{handler:'valid_Matcod',iparms:[]");
      setEventMetadata("VALID_MATCOD",",oparms:[]}");
      setEventMetadata("VALID_CODSOL","{handler:'valid_Codsol',iparms:[]");
      setEventMetadata("VALID_CODSOL",",oparms:[]}");
      setEventMetadata("VALID_FORCON","{handler:'valid_Forcon',iparms:[]");
      setEventMetadata("VALID_FORCON",",oparms:[]}");
      setEventMetadata("VALID_INTCODF","{handler:'valid_Intcodf',iparms:[]");
      setEventMetadata("VALID_INTCODF",",oparms:[]}");
      setEventMetadata("VALID_MACPROCOD","{handler:'valid_Macprocod',iparms:[]");
      setEventMetadata("VALID_MACPROCOD",",oparms:[]}");
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
      wcpOA494ForSer = "" ;
      wcpOA482ForColNom = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      A396EmprCod = "" ;
      A494ForSer = "" ;
      A482ForColNom = "" ;
      A13735CliCNom = "" ;
      A13751ArtCDsc = "" ;
      A13731TipColCDsc = "" ;
      A13744IntCDsc = "" ;
      A13743MatCDsc = "" ;
      A13752CodSDsc = "" ;
      A13753IntCFDsc = "" ;
      A13755MacProCDsc = "" ;
      h252CliCod = "" ;
      h494ForSer = "" ;
      h831TipColCod = "" ;
      h583IntCod = "" ;
      h626MatCod = "" ;
      h3316CodSol = "" ;
      h5362IntCodF = "" ;
      h1514MacProCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      A1514MacProCod = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_transactiondetail_tableattributes = new com.genexus.webpanels.GXUserControl();
      A12130ForPanto = "" ;
      A1191ForNomCli = "" ;
      A995ForTonal = "" ;
      A3560ForOpcCli = "" ;
      A3558ForFecApr = GXutil.nullDate() ;
      A2838ForRelBan = DecimalUtil.ZERO ;
      A7781ForBlo = "" ;
      A6379ForNomCli2 = "" ;
      A7029ForNomCli3 = "" ;
      A12403ForLotHil2 = "" ;
      A12404ForLotHil3 = "" ;
      ClassString = "" ;
      StyleString = "" ;
      A2749ForPro = "" ;
      A485ForFec = GXutil.nullDate() ;
      A495ForUltMod = GXutil.nullDate() ;
      A5625ForFecHor = GXutil.resetTime( GXutil.nullDate() );
      A5624ForUsrCod = "" ;
      A6609ForFecCre = GXutil.resetTime( GXutil.nullDate() );
      A6608ForUsrCre = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtnupdate_Jsonclick = "" ;
      bttBtndelete_Jsonclick = "" ;
      A3588ForEst = "" ;
      A11041ForFecCtrl = GXutil.resetTime( GXutil.nullDate() );
      A11042ForFecCtrf = GXutil.resetTime( GXutil.nullDate() );
      A496ForUltUti = GXutil.nullDate() ;
      A492ForPreKgm = DecimalUtil.ZERO ;
      A493ForPreMtr = DecimalUtil.ZERO ;
      A4380ForCosForm = DecimalUtil.ZERO ;
      A9792For_Reo = "" ;
      A8777For_item1 = "" ;
      A11705For_item2 = "" ;
      A11706ForObs2 = "" ;
      A12401ForKgMn = DecimalUtil.ZERO ;
      A1515MacProDsc = "" ;
      A584IntDsc = "" ;
      A627MatDsc = "" ;
      A3317DscSol = "" ;
      A3792ForConDsc = "" ;
      A5363IntDscF = "" ;
      A279CliNom = "" ;
      A5742ForSerDsc = "" ;
      A832TipColDsc = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      l13735CliCNom = "" ;
      H00R92_A13735CliCNom = new String[] {""} ;
      l13751ArtCDsc = "" ;
      H00R93_A13751ArtCDsc = new String[] {""} ;
      l13731TipColCDsc = "" ;
      H00R94_A13731TipColCDsc = new String[] {""} ;
      l13744IntCDsc = "" ;
      H00R95_A13744IntCDsc = new String[] {""} ;
      l13743MatCDsc = "" ;
      H00R96_A13743MatCDsc = new String[] {""} ;
      l13752CodSDsc = "" ;
      H00R97_A13752CodSDsc = new String[] {""} ;
      l13753IntCFDsc = "" ;
      H00R98_A13753IntCFDsc = new String[] {""} ;
      l13755MacProCDsc = "" ;
      H00R99_A13755MacProCDsc = new String[] {""} ;
      H00R910_A13735CliCNom = new String[] {""} ;
      H00R910_A396EmprCod = new String[] {""} ;
      H00R910_A252CliCod = new int[1] ;
      H00R911_A13751ArtCDsc = new String[] {""} ;
      H00R911_A396EmprCod = new String[] {""} ;
      H00R911_A252CliCod = new int[1] ;
      H00R911_A65ArtCod = new String[] {""} ;
      A65ArtCod = "" ;
      H00R912_A13731TipColCDsc = new String[] {""} ;
      H00R912_A396EmprCod = new String[] {""} ;
      H00R912_A831TipColCod = new byte[1] ;
      H00R913_A13744IntCDsc = new String[] {""} ;
      H00R913_A396EmprCod = new String[] {""} ;
      H00R913_A583IntCod = new byte[1] ;
      H00R914_A13743MatCDsc = new String[] {""} ;
      H00R914_A396EmprCod = new String[] {""} ;
      H00R914_A626MatCod = new short[1] ;
      H00R915_A13752CodSDsc = new String[] {""} ;
      H00R915_A396EmprCod = new String[] {""} ;
      H00R915_A3316CodSol = new short[1] ;
      H00R915_n3316CodSol = new boolean[] {false} ;
      H00R916_A13753IntCFDsc = new String[] {""} ;
      H00R916_A396EmprCod = new String[] {""} ;
      H00R916_A5362IntCodF = new byte[1] ;
      H00R916_n5362IntCodF = new boolean[] {false} ;
      H00R917_A13755MacProCDsc = new String[] {""} ;
      H00R917_A396EmprCod = new String[] {""} ;
      H00R917_A1514MacProCod = new String[] {""} ;
      H00R917_n1514MacProCod = new boolean[] {false} ;
      AV17Pgmname = "" ;
      H00R918_A396EmprCod = new String[] {""} ;
      H00R918_A252CliCod = new int[1] ;
      H00R918_A494ForSer = new String[] {""} ;
      H00R918_A482ForColNom = new String[] {""} ;
      H00R918_A483ForColNum = new int[1] ;
      H00R918_A831TipColCod = new byte[1] ;
      H00R918_A832TipColDsc = new String[] {""} ;
      H00R918_n832TipColDsc = new boolean[] {false} ;
      H00R918_A5742ForSerDsc = new String[] {""} ;
      H00R918_n5742ForSerDsc = new boolean[] {false} ;
      H00R918_A279CliNom = new String[] {""} ;
      H00R918_A5363IntDscF = new String[] {""} ;
      H00R918_n5363IntDscF = new boolean[] {false} ;
      H00R918_A3792ForConDsc = new String[] {""} ;
      H00R918_n3792ForConDsc = new boolean[] {false} ;
      H00R918_A3317DscSol = new String[] {""} ;
      H00R918_n3317DscSol = new boolean[] {false} ;
      H00R918_A627MatDsc = new String[] {""} ;
      H00R918_n627MatDsc = new boolean[] {false} ;
      H00R918_A584IntDsc = new String[] {""} ;
      H00R918_n584IntDsc = new boolean[] {false} ;
      H00R918_A1515MacProDsc = new String[] {""} ;
      H00R918_A12401ForKgMn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00R918_n12401ForKgMn = new boolean[] {false} ;
      H00R918_A12400ForTRabs = new byte[1] ;
      H00R918_n12400ForTRabs = new boolean[] {false} ;
      H00R918_A12399ForMT = new byte[1] ;
      H00R918_n12399ForMT = new boolean[] {false} ;
      H00R918_A11706ForObs2 = new String[] {""} ;
      H00R918_n11706ForObs2 = new boolean[] {false} ;
      H00R918_A11705For_item2 = new String[] {""} ;
      H00R918_n11705For_item2 = new boolean[] {false} ;
      H00R918_A8777For_item1 = new String[] {""} ;
      H00R918_n8777For_item1 = new boolean[] {false} ;
      H00R918_A9792For_Reo = new String[] {""} ;
      H00R918_n9792For_Reo = new boolean[] {false} ;
      H00R918_A4380ForCosForm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00R918_n4380ForCosForm = new boolean[] {false} ;
      H00R918_A1159ForUltLin = new short[1] ;
      H00R918_n1159ForUltLin = new boolean[] {false} ;
      H00R918_A493ForPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00R918_n493ForPreMtr = new boolean[] {false} ;
      H00R918_A492ForPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00R918_n492ForPreKgm = new boolean[] {false} ;
      H00R918_A496ForUltUti = new java.util.Date[] {GXutil.nullDate()} ;
      H00R918_n496ForUltUti = new boolean[] {false} ;
      H00R918_A4339ForRGB = new long[1] ;
      H00R918_n4339ForRGB = new boolean[] {false} ;
      H00R918_A11042ForFecCtrf = new java.util.Date[] {GXutil.nullDate()} ;
      H00R918_n11042ForFecCtrf = new boolean[] {false} ;
      H00R918_A11041ForFecCtrl = new java.util.Date[] {GXutil.nullDate()} ;
      H00R918_n11041ForFecCtrl = new boolean[] {false} ;
      H00R918_A3588ForEst = new String[] {""} ;
      H00R918_n3588ForEst = new boolean[] {false} ;
      H00R918_A8043ForTipT = new byte[1] ;
      H00R918_n8043ForTipT = new boolean[] {false} ;
      H00R918_A4384ForTipArt = new short[1] ;
      H00R918_n4384ForTipArt = new boolean[] {false} ;
      H00R918_A1514MacProCod = new String[] {""} ;
      H00R918_n1514MacProCod = new boolean[] {false} ;
      H00R918_A6608ForUsrCre = new String[] {""} ;
      H00R918_n6608ForUsrCre = new boolean[] {false} ;
      H00R918_A6609ForFecCre = new java.util.Date[] {GXutil.nullDate()} ;
      H00R918_n6609ForFecCre = new boolean[] {false} ;
      H00R918_A5624ForUsrCod = new String[] {""} ;
      H00R918_n5624ForUsrCod = new boolean[] {false} ;
      H00R918_A5625ForFecHor = new java.util.Date[] {GXutil.nullDate()} ;
      H00R918_n5625ForFecHor = new boolean[] {false} ;
      H00R918_A495ForUltMod = new java.util.Date[] {GXutil.nullDate()} ;
      H00R918_n495ForUltMod = new boolean[] {false} ;
      H00R918_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      H00R918_n485ForFec = new boolean[] {false} ;
      H00R918_A486ForNumCol = new int[1] ;
      H00R918_A2749ForPro = new String[] {""} ;
      H00R918_n2749ForPro = new boolean[] {false} ;
      H00R918_A12404ForLotHil3 = new String[] {""} ;
      H00R918_n12404ForLotHil3 = new boolean[] {false} ;
      H00R918_A12403ForLotHil2 = new String[] {""} ;
      H00R918_n12403ForLotHil2 = new boolean[] {false} ;
      H00R918_A7029ForNomCli3 = new String[] {""} ;
      H00R918_n7029ForNomCli3 = new boolean[] {false} ;
      H00R918_A6379ForNomCli2 = new String[] {""} ;
      H00R918_n6379ForNomCli2 = new boolean[] {false} ;
      H00R918_A8561Fam_Cod = new short[1] ;
      H00R918_n8561Fam_Cod = new boolean[] {false} ;
      H00R918_A7781ForBlo = new String[] {""} ;
      H00R918_n7781ForBlo = new boolean[] {false} ;
      H00R918_A5362IntCodF = new byte[1] ;
      H00R918_n5362IntCodF = new boolean[] {false} ;
      H00R918_A484ForCon = new byte[1] ;
      H00R918_A3316CodSol = new short[1] ;
      H00R918_n3316CodSol = new boolean[] {false} ;
      H00R918_A626MatCod = new short[1] ;
      H00R918_A583IntCod = new byte[1] ;
      H00R918_A2838ForRelBan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00R918_n2838ForRelBan = new boolean[] {false} ;
      H00R918_A3558ForFecApr = new java.util.Date[] {GXutil.nullDate()} ;
      H00R918_n3558ForFecApr = new boolean[] {false} ;
      H00R918_A7537ForOpNum = new byte[1] ;
      H00R918_n7537ForOpNum = new boolean[] {false} ;
      H00R918_A3560ForOpcCli = new String[] {""} ;
      H00R918_n3560ForOpcCli = new boolean[] {false} ;
      H00R918_A3315ForNumArc = new int[1] ;
      H00R918_n3315ForNumArc = new boolean[] {false} ;
      H00R918_A995ForTonal = new String[] {""} ;
      H00R918_n995ForTonal = new boolean[] {false} ;
      H00R918_A1192ForNumCli = new int[1] ;
      H00R918_n1192ForNumCli = new boolean[] {false} ;
      H00R918_A1191ForNomCli = new String[] {""} ;
      H00R918_n1191ForNomCli = new boolean[] {false} ;
      H00R918_A12130ForPanto = new String[] {""} ;
      H00R918_n12130ForPanto = new boolean[] {false} ;
      H00R919_A13744IntCDsc = new String[] {""} ;
      H00R919_A396EmprCod = new String[] {""} ;
      H00R919_A583IntCod = new byte[1] ;
      H00R920_A13743MatCDsc = new String[] {""} ;
      H00R920_A396EmprCod = new String[] {""} ;
      H00R920_A626MatCod = new short[1] ;
      H00R921_A13752CodSDsc = new String[] {""} ;
      H00R921_A396EmprCod = new String[] {""} ;
      H00R921_A3316CodSol = new short[1] ;
      H00R921_n3316CodSol = new boolean[] {false} ;
      H00R922_A13753IntCFDsc = new String[] {""} ;
      H00R922_A396EmprCod = new String[] {""} ;
      H00R922_A5362IntCodF = new byte[1] ;
      H00R922_n5362IntCodF = new boolean[] {false} ;
      H00R923_A13755MacProCDsc = new String[] {""} ;
      H00R923_A396EmprCod = new String[] {""} ;
      H00R923_A1514MacProCod = new String[] {""} ;
      H00R923_n1514MacProCod = new boolean[] {false} ;
      H00R924_A13735CliCNom = new String[] {""} ;
      H00R924_A396EmprCod = new String[] {""} ;
      H00R924_A252CliCod = new int[1] ;
      H00R925_A279CliNom = new String[] {""} ;
      H00R926_A13731TipColCDsc = new String[] {""} ;
      H00R926_A396EmprCod = new String[] {""} ;
      H00R926_A831TipColCod = new byte[1] ;
      H00R927_A832TipColDsc = new String[] {""} ;
      H00R927_n832TipColDsc = new boolean[] {false} ;
      H00R928_A13744IntCDsc = new String[] {""} ;
      H00R928_A396EmprCod = new String[] {""} ;
      H00R928_A583IntCod = new byte[1] ;
      H00R929_A13743MatCDsc = new String[] {""} ;
      H00R929_A396EmprCod = new String[] {""} ;
      H00R929_A626MatCod = new short[1] ;
      H00R930_A13752CodSDsc = new String[] {""} ;
      H00R930_A396EmprCod = new String[] {""} ;
      H00R930_A3316CodSol = new short[1] ;
      H00R930_n3316CodSol = new boolean[] {false} ;
      H00R931_A13753IntCFDsc = new String[] {""} ;
      H00R931_A396EmprCod = new String[] {""} ;
      H00R931_A5362IntCodF = new byte[1] ;
      H00R931_n5362IntCodF = new boolean[] {false} ;
      H00R932_A13755MacProCDsc = new String[] {""} ;
      H00R932_A396EmprCod = new String[] {""} ;
      H00R932_A1514MacProCod = new String[] {""} ;
      H00R932_n1514MacProCod = new boolean[] {false} ;
      AV13Station = "" ;
      GXt_char1 = "" ;
      AV14Emprcod = "" ;
      GXv_char2 = new String[1] ;
      AV15Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV16Usurcod = "" ;
      GXv_char4 = new String[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV7TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV10HTTPRequest = httpContext.getHttpRequest();
      AV9Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA396EmprCod = "" ;
      sCtrlA252CliCod = "" ;
      sCtrlA494ForSer = "" ;
      sCtrlA482ForColNom = "" ;
      sCtrlA483ForColNum = "" ;
      sCtrlA831TipColCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmformulasgeneral__default(),
         new Object[] {
             new Object[] {
            H00R92_A13735CliCNom
            }
            , new Object[] {
            H00R93_A13751ArtCDsc
            }
            , new Object[] {
            H00R94_A13731TipColCDsc
            }
            , new Object[] {
            H00R95_A13744IntCDsc
            }
            , new Object[] {
            H00R96_A13743MatCDsc
            }
            , new Object[] {
            H00R97_A13752CodSDsc
            }
            , new Object[] {
            H00R98_A13753IntCFDsc
            }
            , new Object[] {
            H00R99_A13755MacProCDsc
            }
            , new Object[] {
            H00R910_A13735CliCNom, H00R910_A396EmprCod, H00R910_A252CliCod
            }
            , new Object[] {
            H00R911_A13751ArtCDsc, H00R911_A396EmprCod, H00R911_A252CliCod, H00R911_A65ArtCod
            }
            , new Object[] {
            H00R912_A13731TipColCDsc, H00R912_A396EmprCod, H00R912_A831TipColCod
            }
            , new Object[] {
            H00R913_A13744IntCDsc, H00R913_A396EmprCod, H00R913_A583IntCod
            }
            , new Object[] {
            H00R914_A13743MatCDsc, H00R914_A396EmprCod, H00R914_A626MatCod
            }
            , new Object[] {
            H00R915_A13752CodSDsc, H00R915_A396EmprCod, H00R915_A3316CodSol
            }
            , new Object[] {
            H00R916_A13753IntCFDsc, H00R916_A396EmprCod, H00R916_A5362IntCodF
            }
            , new Object[] {
            H00R917_A13755MacProCDsc, H00R917_A396EmprCod, H00R917_A1514MacProCod
            }
            , new Object[] {
            H00R918_A396EmprCod, H00R918_A252CliCod, H00R918_A494ForSer, H00R918_A482ForColNom, H00R918_A483ForColNum, H00R918_A831TipColCod, H00R918_A832TipColDsc, H00R918_n832TipColDsc, H00R918_A5742ForSerDsc, H00R918_n5742ForSerDsc,
            H00R918_A279CliNom, H00R918_A5363IntDscF, H00R918_n5363IntDscF, H00R918_A3792ForConDsc, H00R918_n3792ForConDsc, H00R918_A3317DscSol, H00R918_n3317DscSol, H00R918_A627MatDsc, H00R918_n627MatDsc, H00R918_A584IntDsc,
            H00R918_n584IntDsc, H00R918_A1515MacProDsc, H00R918_A12401ForKgMn, H00R918_n12401ForKgMn, H00R918_A12400ForTRabs, H00R918_n12400ForTRabs, H00R918_A12399ForMT, H00R918_n12399ForMT, H00R918_A11706ForObs2, H00R918_n11706ForObs2,
            H00R918_A11705For_item2, H00R918_n11705For_item2, H00R918_A8777For_item1, H00R918_n8777For_item1, H00R918_A9792For_Reo, H00R918_n9792For_Reo, H00R918_A4380ForCosForm, H00R918_n4380ForCosForm, H00R918_A1159ForUltLin, H00R918_n1159ForUltLin,
            H00R918_A493ForPreMtr, H00R918_n493ForPreMtr, H00R918_A492ForPreKgm, H00R918_n492ForPreKgm, H00R918_A496ForUltUti, H00R918_n496ForUltUti, H00R918_A4339ForRGB, H00R918_n4339ForRGB, H00R918_A11042ForFecCtrf, H00R918_n11042ForFecCtrf,
            H00R918_A11041ForFecCtrl, H00R918_n11041ForFecCtrl, H00R918_A3588ForEst, H00R918_n3588ForEst, H00R918_A8043ForTipT, H00R918_n8043ForTipT, H00R918_A4384ForTipArt, H00R918_n4384ForTipArt, H00R918_A1514MacProCod, H00R918_n1514MacProCod,
            H00R918_A6608ForUsrCre, H00R918_n6608ForUsrCre, H00R918_A6609ForFecCre, H00R918_n6609ForFecCre, H00R918_A5624ForUsrCod, H00R918_n5624ForUsrCod, H00R918_A5625ForFecHor, H00R918_n5625ForFecHor, H00R918_A495ForUltMod, H00R918_n495ForUltMod,
            H00R918_A485ForFec, H00R918_n485ForFec, H00R918_A486ForNumCol, H00R918_A2749ForPro, H00R918_n2749ForPro, H00R918_A12404ForLotHil3, H00R918_n12404ForLotHil3, H00R918_A12403ForLotHil2, H00R918_n12403ForLotHil2, H00R918_A7029ForNomCli3,
            H00R918_n7029ForNomCli3, H00R918_A6379ForNomCli2, H00R918_n6379ForNomCli2, H00R918_A8561Fam_Cod, H00R918_n8561Fam_Cod, H00R918_A7781ForBlo, H00R918_n7781ForBlo, H00R918_A5362IntCodF, H00R918_n5362IntCodF, H00R918_A484ForCon,
            H00R918_A3316CodSol, H00R918_n3316CodSol, H00R918_A626MatCod, H00R918_A583IntCod, H00R918_A2838ForRelBan, H00R918_n2838ForRelBan, H00R918_A3558ForFecApr, H00R918_n3558ForFecApr, H00R918_A7537ForOpNum, H00R918_n7537ForOpNum,
            H00R918_A3560ForOpcCli, H00R918_n3560ForOpcCli, H00R918_A3315ForNumArc, H00R918_n3315ForNumArc, H00R918_A995ForTonal, H00R918_n995ForTonal, H00R918_A1192ForNumCli, H00R918_n1192ForNumCli, H00R918_A1191ForNomCli, H00R918_n1191ForNomCli,
            H00R918_A12130ForPanto, H00R918_n12130ForPanto
            }
            , new Object[] {
            H00R919_A13744IntCDsc, H00R919_A396EmprCod, H00R919_A583IntCod
            }
            , new Object[] {
            H00R920_A13743MatCDsc, H00R920_A396EmprCod, H00R920_A626MatCod
            }
            , new Object[] {
            H00R921_A13752CodSDsc, H00R921_A396EmprCod, H00R921_A3316CodSol
            }
            , new Object[] {
            H00R922_A13753IntCFDsc, H00R922_A396EmprCod, H00R922_A5362IntCodF
            }
            , new Object[] {
            H00R923_A13755MacProCDsc, H00R923_A396EmprCod, H00R923_A1514MacProCod
            }
            , new Object[] {
            H00R924_A13735CliCNom, H00R924_A396EmprCod, H00R924_A252CliCod
            }
            , new Object[] {
            H00R925_A279CliNom
            }
            , new Object[] {
            H00R926_A13731TipColCDsc, H00R926_A396EmprCod, H00R926_A831TipColCod
            }
            , new Object[] {
            H00R927_A832TipColDsc, H00R927_n832TipColDsc
            }
            , new Object[] {
            H00R928_A13744IntCDsc, H00R928_A396EmprCod, H00R928_A583IntCod
            }
            , new Object[] {
            H00R929_A13743MatCDsc, H00R929_A396EmprCod, H00R929_A626MatCod
            }
            , new Object[] {
            H00R930_A13752CodSDsc, H00R930_A396EmprCod, H00R930_A3316CodSol
            }
            , new Object[] {
            H00R931_A13753IntCFDsc, H00R931_A396EmprCod, H00R931_A5362IntCodF
            }
            , new Object[] {
            H00R932_A13755MacProCDsc, H00R932_A396EmprCod, H00R932_A1514MacProCod
            }
         }
      );
      AV17Pgmname = "TMFormulasGeneral" ;
      /* GeneXus formulas. */
      AV17Pgmname = "TMFormulasGeneral" ;
      Gx_err = (short)(0) ;
   }

   private byte wcpOA831TipColCod ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte A831TipColCod ;
   private byte A583IntCod ;
   private byte A5362IntCodF ;
   private byte A7537ForOpNum ;
   private byte A484ForCon ;
   private byte A8043ForTipT ;
   private byte A12399ForMT ;
   private byte A12400ForTRabs ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short A626MatCod ;
   private short A3316CodSol ;
   private short wbEnd ;
   private short wbStart ;
   private short A8561Fam_Cod ;
   private short A4384ForTipArt ;
   private short A1159ForUltLin ;
   private short gxcookieaux ;
   private short gxhchits ;
   private short Gx_err ;
   private int wcpOA252CliCod ;
   private int wcpOA483ForColNum ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int edtCliCod_Enabled ;
   private int edtForSer_Enabled ;
   private int edtForColNom_Enabled ;
   private int edtForColNum_Enabled ;
   private int edtTipColCod_Enabled ;
   private int edtForPanto_Enabled ;
   private int edtForNomCli_Enabled ;
   private int A1192ForNumCli ;
   private int edtForNumCli_Enabled ;
   private int edtForTonal_Enabled ;
   private int A3315ForNumArc ;
   private int edtForNumArc_Enabled ;
   private int edtForOpcCli_Visible ;
   private int edtForOpcCli_Enabled ;
   private int edtForOpNum_Visible ;
   private int edtForOpNum_Enabled ;
   private int edtForFecApr_Visible ;
   private int edtForFecApr_Enabled ;
   private int edtForRelBan_Enabled ;
   private int edtIntCod_Enabled ;
   private int edtMatCod_Enabled ;
   private int edtCodSol_Enabled ;
   private int edtIntCodF_Visible ;
   private int edtIntCodF_Enabled ;
   private int edtFam_Cod_Visible ;
   private int edtFam_Cod_Enabled ;
   private int divUnnamedtable7_Visible ;
   private int edtForNomCli2_Visible ;
   private int edtForNomCli2_Enabled ;
   private int edtForNomCli3_Visible ;
   private int edtForNomCli3_Enabled ;
   private int edtForLotHil2_Visible ;
   private int edtForLotHil2_Enabled ;
   private int edtForLotHil3_Visible ;
   private int edtForLotHil3_Enabled ;
   private int A486ForNumCol ;
   private int edtForNumCol_Enabled ;
   private int edtForFec_Enabled ;
   private int edtForUltMod_Enabled ;
   private int edtForFecHor_Enabled ;
   private int edtForUsrCod_Enabled ;
   private int edtForFecCre_Enabled ;
   private int edtForUsrCre_Enabled ;
   private int edtMacProCod_Enabled ;
   private int edtForTipArt_Visible ;
   private int edtForTipT_Visible ;
   private int edtForEst_Visible ;
   private int edtForFecCtrl_Visible ;
   private int edtForFecCtrf_Visible ;
   private int edtForRGB_Visible ;
   private int edtForUltUti_Visible ;
   private int edtForPreKgm_Visible ;
   private int edtForPreMtr_Visible ;
   private int edtForUltLin_Visible ;
   private int edtForCosForm_Visible ;
   private int edtFor_Reo_Visible ;
   private int edtFor_item1_Visible ;
   private int edtFor_item2_Visible ;
   private int edtForObs2_Visible ;
   private int edtForMT_Visible ;
   private int edtForTRabs_Visible ;
   private int edtForKgMn_Visible ;
   private int edtMacProDsc_Visible ;
   private int edtIntDsc_Visible ;
   private int edtMatDsc_Visible ;
   private int edtDscSol_Visible ;
   private int edtForConDsc_Visible ;
   private int edtIntDscF_Visible ;
   private int edtCliNom_Visible ;
   private int edtForSerDsc_Visible ;
   private int edtTipColDsc_Visible ;
   private int gxdynajaxindex ;
   private int idxLst ;
   private long A4339ForRGB ;
   private java.math.BigDecimal A2838ForRelBan ;
   private java.math.BigDecimal A492ForPreKgm ;
   private java.math.BigDecimal A493ForPreMtr ;
   private java.math.BigDecimal A4380ForCosForm ;
   private java.math.BigDecimal A12401ForKgMn ;
   private String wcpOA396EmprCod ;
   private String wcpOA494ForSer ;
   private String wcpOA482ForColNom ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A1514MacProCod ;
   private String Dvpanel_transactiondetail_tableattributes_Width ;
   private String Dvpanel_transactiondetail_tableattributes_Cls ;
   private String Dvpanel_transactiondetail_tableattributes_Title ;
   private String Dvpanel_transactiondetail_tableattributes_Iconposition ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTable_Internalname ;
   private String divTransactiondetail_tablemain_Internalname ;
   private String divTransactiondetail_tablecontent_Internalname ;
   private String Dvpanel_transactiondetail_tableattributes_Internalname ;
   private String divTransactiondetail_tableattributes_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String edtForSer_Internalname ;
   private String edtForSer_Jsonclick ;
   private String edtForColNom_Internalname ;
   private String edtForColNom_Jsonclick ;
   private String edtForColNum_Internalname ;
   private String edtForColNum_Jsonclick ;
   private String edtTipColCod_Internalname ;
   private String edtTipColCod_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtForPanto_Internalname ;
   private String A12130ForPanto ;
   private String edtForPanto_Jsonclick ;
   private String edtForNomCli_Internalname ;
   private String A1191ForNomCli ;
   private String edtForNomCli_Jsonclick ;
   private String edtForNumCli_Internalname ;
   private String edtForNumCli_Jsonclick ;
   private String edtForTonal_Internalname ;
   private String A995ForTonal ;
   private String edtForTonal_Jsonclick ;
   private String grpUnnamedgroup5_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtForNumArc_Internalname ;
   private String edtForNumArc_Jsonclick ;
   private String divForopccli_cell_Internalname ;
   private String divForopccli_cell_Class ;
   private String edtForOpcCli_Internalname ;
   private String A3560ForOpcCli ;
   private String edtForOpcCli_Jsonclick ;
   private String divForopnum_cell_Internalname ;
   private String divForopnum_cell_Class ;
   private String edtForOpNum_Internalname ;
   private String edtForOpNum_Jsonclick ;
   private String divForfecapr_cell_Internalname ;
   private String divForfecapr_cell_Class ;
   private String edtForFecApr_Internalname ;
   private String edtForFecApr_Jsonclick ;
   private String edtForRelBan_Internalname ;
   private String edtForRelBan_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String edtIntCod_Internalname ;
   private String edtIntCod_Jsonclick ;
   private String edtMatCod_Internalname ;
   private String edtMatCod_Jsonclick ;
   private String edtCodSol_Internalname ;
   private String edtCodSol_Jsonclick ;
   private String divIntcodf_cell_Internalname ;
   private String divIntcodf_cell_Class ;
   private String edtIntCodF_Internalname ;
   private String edtIntCodF_Jsonclick ;
   private String divForblo_cell_Internalname ;
   private String divForblo_cell_Class ;
   private String A7781ForBlo ;
   private String divFam_cod_cell_Internalname ;
   private String divFam_cod_cell_Class ;
   private String edtFam_Cod_Internalname ;
   private String edtFam_Cod_Jsonclick ;
   private String divUnnamedtable7_Internalname ;
   private String divFornomcli2_cell_Internalname ;
   private String divFornomcli2_cell_Class ;
   private String edtForNomCli2_Internalname ;
   private String A6379ForNomCli2 ;
   private String edtForNomCli2_Jsonclick ;
   private String divFornomcli3_cell_Internalname ;
   private String divFornomcli3_cell_Class ;
   private String edtForNomCli3_Internalname ;
   private String A7029ForNomCli3 ;
   private String edtForNomCli3_Jsonclick ;
   private String divForlothil2_cell_Internalname ;
   private String divForlothil2_cell_Class ;
   private String edtForLotHil2_Internalname ;
   private String A12403ForLotHil2 ;
   private String edtForLotHil2_Jsonclick ;
   private String divForlothil3_cell_Internalname ;
   private String divForlothil3_cell_Class ;
   private String edtForLotHil3_Internalname ;
   private String A12404ForLotHil3 ;
   private String edtForLotHil3_Jsonclick ;
   private String divUnnamedtable8_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String A2749ForPro ;
   private String edtForNumCol_Internalname ;
   private String edtForNumCol_Jsonclick ;
   private String edtForFec_Internalname ;
   private String edtForFec_Jsonclick ;
   private String edtForUltMod_Internalname ;
   private String edtForUltMod_Jsonclick ;
   private String grpUnnamedgroup10_Internalname ;
   private String divUnnamedtable9_Internalname ;
   private String edtForFecHor_Internalname ;
   private String edtForFecHor_Jsonclick ;
   private String edtForUsrCod_Internalname ;
   private String A5624ForUsrCod ;
   private String edtForUsrCod_Jsonclick ;
   private String edtForFecCre_Internalname ;
   private String edtForFecCre_Jsonclick ;
   private String edtForUsrCre_Internalname ;
   private String A6608ForUsrCre ;
   private String edtForUsrCre_Jsonclick ;
   private String divUnnamedtable11_Internalname ;
   private String edtMacProCod_Internalname ;
   private String edtMacProCod_Jsonclick ;
   private String divTransactiondetail_tableleaflevel_level1_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String TempTags ;
   private String bttBtnupdate_Internalname ;
   private String bttBtnupdate_Jsonclick ;
   private String bttBtndelete_Internalname ;
   private String bttBtndelete_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtForTipArt_Internalname ;
   private String edtForTipArt_Jsonclick ;
   private String edtForTipT_Internalname ;
   private String edtForTipT_Jsonclick ;
   private String edtForEst_Internalname ;
   private String A3588ForEst ;
   private String edtForEst_Jsonclick ;
   private String edtForFecCtrl_Internalname ;
   private String edtForFecCtrl_Jsonclick ;
   private String edtForFecCtrf_Internalname ;
   private String edtForFecCtrf_Jsonclick ;
   private String edtForRGB_Internalname ;
   private String edtForRGB_Jsonclick ;
   private String edtForUltUti_Internalname ;
   private String edtForUltUti_Jsonclick ;
   private String edtForPreKgm_Internalname ;
   private String edtForPreKgm_Jsonclick ;
   private String edtForPreMtr_Internalname ;
   private String edtForPreMtr_Jsonclick ;
   private String edtForUltLin_Internalname ;
   private String edtForUltLin_Jsonclick ;
   private String edtForCosForm_Internalname ;
   private String edtForCosForm_Jsonclick ;
   private String edtFor_Reo_Internalname ;
   private String A9792For_Reo ;
   private String edtFor_Reo_Jsonclick ;
   private String edtFor_item1_Internalname ;
   private String A8777For_item1 ;
   private String edtFor_item1_Jsonclick ;
   private String edtFor_item2_Internalname ;
   private String A11705For_item2 ;
   private String edtFor_item2_Jsonclick ;
   private String edtForObs2_Internalname ;
   private String edtForMT_Internalname ;
   private String edtForMT_Jsonclick ;
   private String edtForTRabs_Internalname ;
   private String edtForTRabs_Jsonclick ;
   private String edtForKgMn_Internalname ;
   private String edtForKgMn_Jsonclick ;
   private String edtMacProDsc_Internalname ;
   private String A1515MacProDsc ;
   private String edtMacProDsc_Jsonclick ;
   private String edtIntDsc_Internalname ;
   private String A584IntDsc ;
   private String edtIntDsc_Jsonclick ;
   private String edtMatDsc_Internalname ;
   private String A627MatDsc ;
   private String edtMatDsc_Jsonclick ;
   private String edtDscSol_Internalname ;
   private String A3317DscSol ;
   private String edtDscSol_Jsonclick ;
   private String edtForConDsc_Internalname ;
   private String A3792ForConDsc ;
   private String edtForConDsc_Jsonclick ;
   private String edtIntDscF_Internalname ;
   private String A5363IntDscF ;
   private String edtIntDscF_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String edtForSerDsc_Internalname ;
   private String A5742ForSerDsc ;
   private String edtForSerDsc_Jsonclick ;
   private String edtTipColDsc_Internalname ;
   private String A832TipColDsc ;
   private String edtTipColDsc_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String A65ArtCod ;
   private String AV17Pgmname ;
   private String AV13Station ;
   private String GXt_char1 ;
   private String AV14Emprcod ;
   private String GXv_char2[] ;
   private String AV15Emprnom ;
   private String GXv_char3[] ;
   private String AV16Usurcod ;
   private String GXv_char4[] ;
   private String sCtrlA396EmprCod ;
   private String sCtrlA252CliCod ;
   private String sCtrlA494ForSer ;
   private String sCtrlA482ForColNom ;
   private String sCtrlA483ForColNum ;
   private String sCtrlA831TipColCod ;
   private java.util.Date A5625ForFecHor ;
   private java.util.Date A6609ForFecCre ;
   private java.util.Date A11041ForFecCtrl ;
   private java.util.Date A11042ForFecCtrf ;
   private java.util.Date A3558ForFecApr ;
   private java.util.Date A485ForFec ;
   private java.util.Date A495ForUltMod ;
   private java.util.Date A496ForUltUti ;
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
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n3316CodSol ;
   private boolean n5362IntCodF ;
   private boolean n1514MacProCod ;
   private boolean n7781ForBlo ;
   private boolean n2749ForPro ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n5742ForSerDsc ;
   private boolean n5363IntDscF ;
   private boolean n3792ForConDsc ;
   private boolean n3317DscSol ;
   private boolean n627MatDsc ;
   private boolean n584IntDsc ;
   private boolean n12401ForKgMn ;
   private boolean n12400ForTRabs ;
   private boolean n12399ForMT ;
   private boolean n11706ForObs2 ;
   private boolean n11705For_item2 ;
   private boolean n8777For_item1 ;
   private boolean n9792For_Reo ;
   private boolean n4380ForCosForm ;
   private boolean n1159ForUltLin ;
   private boolean n493ForPreMtr ;
   private boolean n492ForPreKgm ;
   private boolean n496ForUltUti ;
   private boolean n4339ForRGB ;
   private boolean n11042ForFecCtrf ;
   private boolean n11041ForFecCtrl ;
   private boolean n3588ForEst ;
   private boolean n8043ForTipT ;
   private boolean n4384ForTipArt ;
   private boolean n6608ForUsrCre ;
   private boolean n6609ForFecCre ;
   private boolean n5624ForUsrCod ;
   private boolean n5625ForFecHor ;
   private boolean n495ForUltMod ;
   private boolean n485ForFec ;
   private boolean n12404ForLotHil3 ;
   private boolean n12403ForLotHil2 ;
   private boolean n7029ForNomCli3 ;
   private boolean n6379ForNomCli2 ;
   private boolean n8561Fam_Cod ;
   private boolean n2838ForRelBan ;
   private boolean n3558ForFecApr ;
   private boolean n7537ForOpNum ;
   private boolean n3560ForOpcCli ;
   private boolean n3315ForNumArc ;
   private boolean n995ForTonal ;
   private boolean n1192ForNumCli ;
   private boolean n1191ForNomCli ;
   private boolean n12130ForPanto ;
   private boolean n832TipColDsc ;
   private boolean returnInSub ;
   private boolean Cond_result ;
   private String A13735CliCNom ;
   private String A13751ArtCDsc ;
   private String A13731TipColCDsc ;
   private String A13744IntCDsc ;
   private String A13743MatCDsc ;
   private String A13752CodSDsc ;
   private String A13753IntCFDsc ;
   private String A13755MacProCDsc ;
   private String h252CliCod ;
   private String h494ForSer ;
   private String h831TipColCod ;
   private String h583IntCod ;
   private String h626MatCod ;
   private String h3316CodSol ;
   private String h5362IntCodF ;
   private String h1514MacProCod ;
   private String A11706ForObs2 ;
   private String l13735CliCNom ;
   private String l13751ArtCDsc ;
   private String l13731TipColCDsc ;
   private String l13744IntCDsc ;
   private String l13743MatCDsc ;
   private String l13752CodSDsc ;
   private String l13753IntCFDsc ;
   private String l13755MacProCDsc ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV10HTTPRequest ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_transactiondetail_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private HTMLChoice cmbForCon ;
   private HTMLChoice cmbForBlo ;
   private ICheckbox chkForPro ;
   private IDataStoreProvider pr_default ;
   private String[] H00R92_A13735CliCNom ;
   private String[] H00R93_A13751ArtCDsc ;
   private String[] H00R94_A13731TipColCDsc ;
   private String[] H00R95_A13744IntCDsc ;
   private String[] H00R96_A13743MatCDsc ;
   private String[] H00R97_A13752CodSDsc ;
   private String[] H00R98_A13753IntCFDsc ;
   private String[] H00R99_A13755MacProCDsc ;
   private String[] H00R910_A13735CliCNom ;
   private String[] H00R910_A396EmprCod ;
   private int[] H00R910_A252CliCod ;
   private String[] H00R911_A13751ArtCDsc ;
   private String[] H00R911_A396EmprCod ;
   private int[] H00R911_A252CliCod ;
   private String[] H00R911_A65ArtCod ;
   private String[] H00R912_A13731TipColCDsc ;
   private String[] H00R912_A396EmprCod ;
   private byte[] H00R912_A831TipColCod ;
   private String[] H00R913_A13744IntCDsc ;
   private String[] H00R913_A396EmprCod ;
   private byte[] H00R913_A583IntCod ;
   private String[] H00R914_A13743MatCDsc ;
   private String[] H00R914_A396EmprCod ;
   private short[] H00R914_A626MatCod ;
   private String[] H00R915_A13752CodSDsc ;
   private String[] H00R915_A396EmprCod ;
   private short[] H00R915_A3316CodSol ;
   private boolean[] H00R915_n3316CodSol ;
   private String[] H00R916_A13753IntCFDsc ;
   private String[] H00R916_A396EmprCod ;
   private byte[] H00R916_A5362IntCodF ;
   private boolean[] H00R916_n5362IntCodF ;
   private String[] H00R917_A13755MacProCDsc ;
   private String[] H00R917_A396EmprCod ;
   private String[] H00R917_A1514MacProCod ;
   private boolean[] H00R917_n1514MacProCod ;
   private String[] H00R918_A396EmprCod ;
   private int[] H00R918_A252CliCod ;
   private String[] H00R918_A494ForSer ;
   private String[] H00R918_A482ForColNom ;
   private int[] H00R918_A483ForColNum ;
   private byte[] H00R918_A831TipColCod ;
   private String[] H00R918_A832TipColDsc ;
   private boolean[] H00R918_n832TipColDsc ;
   private String[] H00R918_A5742ForSerDsc ;
   private boolean[] H00R918_n5742ForSerDsc ;
   private String[] H00R918_A279CliNom ;
   private String[] H00R918_A5363IntDscF ;
   private boolean[] H00R918_n5363IntDscF ;
   private String[] H00R918_A3792ForConDsc ;
   private boolean[] H00R918_n3792ForConDsc ;
   private String[] H00R918_A3317DscSol ;
   private boolean[] H00R918_n3317DscSol ;
   private String[] H00R918_A627MatDsc ;
   private boolean[] H00R918_n627MatDsc ;
   private String[] H00R918_A584IntDsc ;
   private boolean[] H00R918_n584IntDsc ;
   private String[] H00R918_A1515MacProDsc ;
   private java.math.BigDecimal[] H00R918_A12401ForKgMn ;
   private boolean[] H00R918_n12401ForKgMn ;
   private byte[] H00R918_A12400ForTRabs ;
   private boolean[] H00R918_n12400ForTRabs ;
   private byte[] H00R918_A12399ForMT ;
   private boolean[] H00R918_n12399ForMT ;
   private String[] H00R918_A11706ForObs2 ;
   private boolean[] H00R918_n11706ForObs2 ;
   private String[] H00R918_A11705For_item2 ;
   private boolean[] H00R918_n11705For_item2 ;
   private String[] H00R918_A8777For_item1 ;
   private boolean[] H00R918_n8777For_item1 ;
   private String[] H00R918_A9792For_Reo ;
   private boolean[] H00R918_n9792For_Reo ;
   private java.math.BigDecimal[] H00R918_A4380ForCosForm ;
   private boolean[] H00R918_n4380ForCosForm ;
   private short[] H00R918_A1159ForUltLin ;
   private boolean[] H00R918_n1159ForUltLin ;
   private java.math.BigDecimal[] H00R918_A493ForPreMtr ;
   private boolean[] H00R918_n493ForPreMtr ;
   private java.math.BigDecimal[] H00R918_A492ForPreKgm ;
   private boolean[] H00R918_n492ForPreKgm ;
   private java.util.Date[] H00R918_A496ForUltUti ;
   private boolean[] H00R918_n496ForUltUti ;
   private long[] H00R918_A4339ForRGB ;
   private boolean[] H00R918_n4339ForRGB ;
   private java.util.Date[] H00R918_A11042ForFecCtrf ;
   private boolean[] H00R918_n11042ForFecCtrf ;
   private java.util.Date[] H00R918_A11041ForFecCtrl ;
   private boolean[] H00R918_n11041ForFecCtrl ;
   private String[] H00R918_A3588ForEst ;
   private boolean[] H00R918_n3588ForEst ;
   private byte[] H00R918_A8043ForTipT ;
   private boolean[] H00R918_n8043ForTipT ;
   private short[] H00R918_A4384ForTipArt ;
   private boolean[] H00R918_n4384ForTipArt ;
   private String[] H00R918_A1514MacProCod ;
   private boolean[] H00R918_n1514MacProCod ;
   private String[] H00R918_A6608ForUsrCre ;
   private boolean[] H00R918_n6608ForUsrCre ;
   private java.util.Date[] H00R918_A6609ForFecCre ;
   private boolean[] H00R918_n6609ForFecCre ;
   private String[] H00R918_A5624ForUsrCod ;
   private boolean[] H00R918_n5624ForUsrCod ;
   private java.util.Date[] H00R918_A5625ForFecHor ;
   private boolean[] H00R918_n5625ForFecHor ;
   private java.util.Date[] H00R918_A495ForUltMod ;
   private boolean[] H00R918_n495ForUltMod ;
   private java.util.Date[] H00R918_A485ForFec ;
   private boolean[] H00R918_n485ForFec ;
   private int[] H00R918_A486ForNumCol ;
   private String[] H00R918_A2749ForPro ;
   private boolean[] H00R918_n2749ForPro ;
   private String[] H00R918_A12404ForLotHil3 ;
   private boolean[] H00R918_n12404ForLotHil3 ;
   private String[] H00R918_A12403ForLotHil2 ;
   private boolean[] H00R918_n12403ForLotHil2 ;
   private String[] H00R918_A7029ForNomCli3 ;
   private boolean[] H00R918_n7029ForNomCli3 ;
   private String[] H00R918_A6379ForNomCli2 ;
   private boolean[] H00R918_n6379ForNomCli2 ;
   private short[] H00R918_A8561Fam_Cod ;
   private boolean[] H00R918_n8561Fam_Cod ;
   private String[] H00R918_A7781ForBlo ;
   private boolean[] H00R918_n7781ForBlo ;
   private byte[] H00R918_A5362IntCodF ;
   private boolean[] H00R918_n5362IntCodF ;
   private byte[] H00R918_A484ForCon ;
   private short[] H00R918_A3316CodSol ;
   private boolean[] H00R918_n3316CodSol ;
   private short[] H00R918_A626MatCod ;
   private byte[] H00R918_A583IntCod ;
   private java.math.BigDecimal[] H00R918_A2838ForRelBan ;
   private boolean[] H00R918_n2838ForRelBan ;
   private java.util.Date[] H00R918_A3558ForFecApr ;
   private boolean[] H00R918_n3558ForFecApr ;
   private byte[] H00R918_A7537ForOpNum ;
   private boolean[] H00R918_n7537ForOpNum ;
   private String[] H00R918_A3560ForOpcCli ;
   private boolean[] H00R918_n3560ForOpcCli ;
   private int[] H00R918_A3315ForNumArc ;
   private boolean[] H00R918_n3315ForNumArc ;
   private String[] H00R918_A995ForTonal ;
   private boolean[] H00R918_n995ForTonal ;
   private int[] H00R918_A1192ForNumCli ;
   private boolean[] H00R918_n1192ForNumCli ;
   private String[] H00R918_A1191ForNomCli ;
   private boolean[] H00R918_n1191ForNomCli ;
   private String[] H00R918_A12130ForPanto ;
   private boolean[] H00R918_n12130ForPanto ;
   private String[] H00R919_A13744IntCDsc ;
   private String[] H00R919_A396EmprCod ;
   private byte[] H00R919_A583IntCod ;
   private String[] H00R920_A13743MatCDsc ;
   private String[] H00R920_A396EmprCod ;
   private short[] H00R920_A626MatCod ;
   private String[] H00R921_A13752CodSDsc ;
   private String[] H00R921_A396EmprCod ;
   private short[] H00R921_A3316CodSol ;
   private boolean[] H00R921_n3316CodSol ;
   private String[] H00R922_A13753IntCFDsc ;
   private String[] H00R922_A396EmprCod ;
   private byte[] H00R922_A5362IntCodF ;
   private boolean[] H00R922_n5362IntCodF ;
   private String[] H00R923_A13755MacProCDsc ;
   private String[] H00R923_A396EmprCod ;
   private String[] H00R923_A1514MacProCod ;
   private boolean[] H00R923_n1514MacProCod ;
   private String[] H00R924_A13735CliCNom ;
   private String[] H00R924_A396EmprCod ;
   private int[] H00R924_A252CliCod ;
   private String[] H00R925_A279CliNom ;
   private String[] H00R926_A13731TipColCDsc ;
   private String[] H00R926_A396EmprCod ;
   private byte[] H00R926_A831TipColCod ;
   private String[] H00R927_A832TipColDsc ;
   private boolean[] H00R927_n832TipColDsc ;
   private String[] H00R928_A13744IntCDsc ;
   private String[] H00R928_A396EmprCod ;
   private byte[] H00R928_A583IntCod ;
   private String[] H00R929_A13743MatCDsc ;
   private String[] H00R929_A396EmprCod ;
   private short[] H00R929_A626MatCod ;
   private String[] H00R930_A13752CodSDsc ;
   private String[] H00R930_A396EmprCod ;
   private short[] H00R930_A3316CodSol ;
   private boolean[] H00R930_n3316CodSol ;
   private String[] H00R931_A13753IntCFDsc ;
   private String[] H00R931_A396EmprCod ;
   private byte[] H00R931_A5362IntCodF ;
   private boolean[] H00R931_n5362IntCodF ;
   private String[] H00R932_A13755MacProCDsc ;
   private String[] H00R932_A396EmprCod ;
   private String[] H00R932_A1514MacProCod ;
   private boolean[] H00R932_n1514MacProCod ;
   private com.genexus.webpanels.WebSession AV9Session ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV7TrnContext ;
}

final  class tmformulasgeneral__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00R92", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom FROM TXPCLIENT WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom))) like '%' || UPPER(?))) WHERE rownum <= 15 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00R93", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(ArtCod)) || '-' || RTRIM(LTRIM(COALESCE( ArtDsc, ''))) AS ArtCDsc FROM TXPARTICU WHERE (EmprCod = ? and CliCod = ?) AND (UPPER(RTRIM(LTRIM(ArtCod)) || '-' || RTRIM(LTRIM(COALESCE( ArtDsc, '')))) like '%' || UPPER(?))) WHERE rownum <= 15 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00R94", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(TipColCod,'90'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( TipColDsc, ''))) AS TipColCDsc FROM TXPTIPCOL WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(TipColCod,'90'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( TipColDsc, '')))) like '%' || UPPER(?))) WHERE rownum <= 5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00R95", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(IntCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( IntDsc, ''))) AS IntCDsc FROM TXPINTENS WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(IntCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( IntDsc, '')))) like '%' || UPPER(?))) WHERE rownum <= 10 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00R96", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(MatCod,'990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( MatDsc, ''))) AS MatCDsc FROM TXPMATICE WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(MatCod,'990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( MatDsc, '')))) like '%' || UPPER(?))) WHERE rownum <= 15 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00R97", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(CodSol,'990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( DscSol, ''))) AS CodSDsc FROM TXPSOLIDE WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(CodSol,'990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( DscSol, '')))) like '%' || UPPER(?))) WHERE rownum <= 5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00R98", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(IntCodF,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( IntDscF, ''))) AS IntCFDsc FROM TXPINTFAC WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(IntCodF,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( IntDscF, '')))) like '%' || UPPER(?))) WHERE rownum <= 5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00R99", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(MacProCod)) || '-' || RTRIM(LTRIM(MacProDsc)) AS MacProCDsc FROM TXPCMACPR WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(MacProCod)) || '-' || RTRIM(LTRIM(MacProDsc))) like '%' || UPPER(?))) WHERE rownum <= 10 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00R910", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00R911", "SELECT RTRIM(LTRIM(ArtCod)) || '-' || RTRIM(LTRIM(COALESCE( ArtDsc, ''))) AS ArtCDsc, EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE (RTRIM(LTRIM(ArtCod)) || '-' || RTRIM(LTRIM(COALESCE( ArtDsc, ''))) = ?) AND (EmprCod = ? and CliCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00R912", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TipColCod,'90'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( TipColDsc, ''))) AS TipColCDsc, EmprCod, TipColCod FROM TXPTIPCOL WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TipColCod,'90'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( TipColDsc, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00R913", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(IntCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( IntDsc, ''))) AS IntCDsc, EmprCod, IntCod FROM TXPINTENS WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(IntCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( IntDsc, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00R914", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(MatCod,'990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( MatDsc, ''))) AS MatCDsc, EmprCod, MatCod FROM TXPMATICE WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(MatCod,'990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( MatDsc, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00R915", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CodSol,'990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( DscSol, ''))) AS CodSDsc, EmprCod, CodSol FROM TXPSOLIDE WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(CodSol,'990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( DscSol, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00R916", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(IntCodF,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( IntDscF, ''))) AS IntCFDsc, EmprCod, IntCodF FROM TXPINTFAC WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(IntCodF,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( IntDscF, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00R917", "SELECT RTRIM(LTRIM(MacProCod)) || '-' || RTRIM(LTRIM(MacProDsc)) AS MacProCDsc, EmprCod, MacProCod FROM TXPCMACPR WHERE (RTRIM(LTRIM(MacProCod)) || '-' || RTRIM(LTRIM(MacProDsc)) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00R918", "SELECT T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod, T9.TipColDsc, T1.ForSerDsc, T8.CliNom, T7.IntDscF, T6.ForConDsc, T5.DscSol, T3.MatDsc, T2.IntDsc, T4.MacProDsc, T1.ForKgMn, T1.ForTRabs, T1.ForMT, T1.ForObs2, T1.For_item2, T1.For_item1, T1.For_Reo, T1.ForCosForm, T1.ForUltLin, T1.ForPreMtr, T1.ForPreKgm, T1.ForUltUti, T1.ForRGB, T1.ForFecCtrf, T1.ForFecCtrl, T1.ForEst, T1.ForTipT, T1.ForTipArt, T1.MacProCod, T1.ForUsrCre, T1.ForFecCre, T1.ForUsrCod, T1.ForFecHor, T1.ForUltMod, T1.ForFec, T1.ForNumCol, T1.ForPro, T1.ForLotHil3, T1.ForLotHil2, T1.ForNomCli3, T1.ForNomCli2, T1.Fam_Cod, T1.ForBlo, T1.IntCodF, T1.ForCon, T1.CodSol, T1.MatCod, T1.IntCod, T1.ForRelBan, T1.ForFecApr, T1.ForOpNum, T1.ForOpcCli, T1.ForNumArc, T1.ForTonal, T1.ForNumCli, T1.ForNomCli, T1.ForPanto FROM ((((((((TXPCFORMU T1 INNER JOIN TXPINTENS T2 ON T2.EmprCod = T1.EmprCod AND T2.IntCod = T1.IntCod) INNER JOIN TXPMATICE T3 ON T3.EmprCod = T1.EmprCod AND T3.MatCod = T1.MatCod) LEFT JOIN TXPCMACPR T4 ON T4.EmprCod = T1.EmprCod AND T4.MacProCod = T1.MacProCod) LEFT JOIN TXPSOLIDE T5 ON T5.EmprCod = T1.EmprCod AND T5.CodSol = T1.CodSol) INNER JOIN TXPFORCTR T6 ON T6.EmprCod = T1.EmprCod AND T6.ForCon = T1.ForCon) LEFT JOIN TXPINTFAC T7 ON T7.EmprCod = T1.EmprCod AND T7.IntCodF = T1.IntCodF) INNER JOIN TXPCLIENT T8 ON T8.EmprCod = T1.EmprCod AND T8.CliCod = T1.CliCod) INNER JOIN TXPTIPCOL T9 ON T9.EmprCod = T1.EmprCod AND T9.TipColCod = T1.TipColCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00R919", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(IntCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( IntDsc, ''))) AS IntCDsc, EmprCod, IntCod FROM TXPINTENS WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(IntCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( IntDsc, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00R920", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(MatCod,'990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( MatDsc, ''))) AS MatCDsc, EmprCod, MatCod FROM TXPMATICE WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(MatCod,'990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( MatDsc, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00R921", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CodSol,'990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( DscSol, ''))) AS CodSDsc, EmprCod, CodSol FROM TXPSOLIDE WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(CodSol,'990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( DscSol, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00R922", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(IntCodF,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( IntDscF, ''))) AS IntCFDsc, EmprCod, IntCodF FROM TXPINTFAC WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(IntCodF,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( IntDscF, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00R923", "SELECT RTRIM(LTRIM(MacProCod)) || '-' || RTRIM(LTRIM(MacProDsc)) AS MacProCDsc, EmprCod, MacProCod FROM TXPCMACPR WHERE (RTRIM(LTRIM(MacProCod)) || '-' || RTRIM(LTRIM(MacProDsc)) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00R924", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00R925", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00R926", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TipColCod,'90'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( TipColDsc, ''))) AS TipColCDsc, EmprCod, TipColCod FROM TXPTIPCOL WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TipColCod,'90'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( TipColDsc, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00R927", "SELECT TipColDsc FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00R928", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(IntCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( IntDsc, ''))) AS IntCDsc, EmprCod, IntCod FROM TXPINTENS WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(IntCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( IntDsc, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00R929", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(MatCod,'990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( MatDsc, ''))) AS MatCDsc, EmprCod, MatCod FROM TXPMATICE WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(MatCod,'990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( MatDsc, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00R930", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CodSol,'990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( DscSol, ''))) AS CodSDsc, EmprCod, CodSol FROM TXPSOLIDE WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(CodSol,'990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( DscSol, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00R931", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(IntCodF,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( IntDscF, ''))) AS IntCFDsc, EmprCod, IntCodF FROM TXPINTFAC WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(IntCodF,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( IntDscF, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00R932", "SELECT RTRIM(LTRIM(MacProCod)) || '-' || RTRIM(LTRIM(MacProDsc)) AS MacProCDsc, EmprCod, MacProCod FROM TXPCMACPR WHERE (RTRIM(LTRIM(MacProCod)) || '-' || RTRIM(LTRIM(MacProDsc)) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
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
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 25);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(15, 20);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((byte[]) buf[24])[0] = rslt.getByte(17);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((byte[]) buf[26])[0] = rslt.getByte(18);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(19);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(20, 30);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(21, 30);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(23,5);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((short[]) buf[38])[0] = rslt.getShort(24);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[40])[0] = rslt.getBigDecimal(25,5);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[42])[0] = rslt.getBigDecimal(26,5);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[44])[0] = rslt.getGXDate(27);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((long[]) buf[46])[0] = rslt.getLong(28);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[48])[0] = rslt.getGXDateTime(29);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[50])[0] = rslt.getGXDateTime(30);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getString(31, 1);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((byte[]) buf[54])[0] = rslt.getByte(32);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((short[]) buf[56])[0] = rslt.getShort(33);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((String[]) buf[58])[0] = rslt.getString(34, 6);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((String[]) buf[60])[0] = rslt.getString(35, 8);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[62])[0] = rslt.getGXDateTime(36);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((String[]) buf[64])[0] = rslt.getString(37, 8);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[66])[0] = rslt.getGXDateTime(38);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[68])[0] = rslt.getGXDate(39);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[70])[0] = rslt.getGXDate(40);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((int[]) buf[72])[0] = rslt.getInt(41);
               ((String[]) buf[73])[0] = rslt.getString(42, 1);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((String[]) buf[75])[0] = rslt.getString(43, 20);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((String[]) buf[77])[0] = rslt.getString(44, 20);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getString(45, 30);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((String[]) buf[81])[0] = rslt.getString(46, 20);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((short[]) buf[83])[0] = rslt.getShort(47);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((String[]) buf[85])[0] = rslt.getString(48, 1);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((byte[]) buf[87])[0] = rslt.getByte(49);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((byte[]) buf[89])[0] = rslt.getByte(50);
               ((short[]) buf[90])[0] = rslt.getShort(51);
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((short[]) buf[92])[0] = rslt.getShort(52);
               ((byte[]) buf[93])[0] = rslt.getByte(53);
               ((java.math.BigDecimal[]) buf[94])[0] = rslt.getBigDecimal(54,2);
               ((boolean[]) buf[95])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[96])[0] = rslt.getGXDate(55);
               ((boolean[]) buf[97])[0] = rslt.wasNull();
               ((byte[]) buf[98])[0] = rslt.getByte(56);
               ((boolean[]) buf[99])[0] = rslt.wasNull();
               ((String[]) buf[100])[0] = rslt.getString(57, 1);
               ((boolean[]) buf[101])[0] = rslt.wasNull();
               ((int[]) buf[102])[0] = rslt.getInt(58);
               ((boolean[]) buf[103])[0] = rslt.wasNull();
               ((String[]) buf[104])[0] = rslt.getString(59, 20);
               ((boolean[]) buf[105])[0] = rslt.wasNull();
               ((int[]) buf[106])[0] = rslt.getInt(60);
               ((boolean[]) buf[107])[0] = rslt.wasNull();
               ((String[]) buf[108])[0] = rslt.getString(61, 13);
               ((boolean[]) buf[109])[0] = rslt.wasNull();
               ((String[]) buf[110])[0] = rslt.getString(62, 100);
               ((boolean[]) buf[111])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
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
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setVarchar(3, (String)parms[2], 60);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 40);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 60);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 60);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 60);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 11 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 12 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 13 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 14 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 15 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 17 :
               stmt.setVarchar(1, (String)parms[0], 60);
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
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 22 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 24 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 26 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 27 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 28 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 29 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
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
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
      }
   }

}

