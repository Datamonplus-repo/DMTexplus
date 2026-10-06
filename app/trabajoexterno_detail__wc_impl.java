package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class trabajoexterno_detail__wc_impl extends GXWebComponent
{
   public trabajoexterno_detail__wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public trabajoexterno_detail__wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trabajoexterno_detail__wc_impl.class ));
   }

   public trabajoexterno_detail__wc_impl( int remoteHandle ,
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
      cmbavGridactions = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( nGotPars == 0 )
         {
            entryPointCalled = false ;
            gxfirstwebparm = httpContext.GetFirstPar( "emprcod") ;
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
               AV46emprcod = httpContext.GetPar( "emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46emprcod", AV46emprcod);
               AV47SalExtAlb = (int)(GXutil.lval( httpContext.GetPar( "SalExtAlb"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47SalExtAlb), 8, 0));
               AV51SalExtFec = localUtil.parseDateParm( httpContext.GetPar( "SalExtFec")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51SalExtFec", localUtil.format(AV51SalExtFec, "99/99/99"));
               AV52SalFhh = localUtil.parseDTimeParm( httpContext.GetPar( "SalFhh")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52SalFhh", localUtil.ttoc( AV52SalFhh, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV53Mancod = (short)(GXutil.lval( httpContext.GetPar( "Mancod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53Mancod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53Mancod), 4, 0));
               AV54ManNom = httpContext.GetPar( "ManNom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54ManNom", AV54ManNom);
               AV55SalCodeID = httpContext.GetPar( "SalCodeID") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55SalCodeID", AV55SalCodeID);
               AV56SalEnvAT = (byte)(GXutil.lval( httpContext.GetPar( "SalEnvAT"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56SalEnvAT", GXutil.str( AV56SalEnvAT, 1, 0));
               AV57HashIN = httpContext.GetPar( "HashIN") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57HashIN", AV57HashIN);
               AV58okIN = GXutil.strtobool( httpContext.GetPar( "okIN")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58okIN", AV58okIN);
               AV59Messages_jsonIN = httpContext.GetPar( "Messages_jsonIN") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59Messages_jsonIN", AV59Messages_jsonIN);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV46emprcod,Integer.valueOf(AV47SalExtAlb),AV51SalExtFec,AV52SalFhh,Short.valueOf(AV53Mancod),AV54ManNom,AV55SalCodeID,Byte.valueOf(AV56SalEnvAT),AV57HashIN,Boolean.valueOf(AV58okIN),AV59Messages_jsonIN});
               componentstart();
               httpContext.ajax_rspStartCmp(sPrefix);
               componentdraw();
               httpContext.ajax_rspEndCmp();
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
               gxfirstwebparm = httpContext.GetFirstPar( "emprcod") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
            {
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetFirstPar( "emprcod") ;
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

   public void gxnrgrid_newrow_invoke( )
   {
      nRC_GXsfl_17 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_17"))) ;
      nGXsfl_17_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_17_idx"))) ;
      sGXsfl_17_idx = httpContext.GetPar( "sGXsfl_17_idx") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
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
      AV46emprcod = httpContext.GetPar( "emprcod") ;
      AV47SalExtAlb = (int)(GXutil.lval( httpContext.GetPar( "SalExtAlb"))) ;
      AV16TFSalExNln = (short)(GXutil.lval( httpContext.GetPar( "TFSalExNln"))) ;
      AV17TFSalExNln_To = (short)(GXutil.lval( httpContext.GetPar( "TFSalExNln_To"))) ;
      AV18TFBarCod = (int)(GXutil.lval( httpContext.GetPar( "TFBarCod"))) ;
      AV19TFBarCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarCod_To"))) ;
      AV20TFBarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "TFBarCodReo"))) ;
      AV21TFBarCodReo_To = (byte)(GXutil.lval( httpContext.GetPar( "TFBarCodReo_To"))) ;
      AV22TFBarCodPar = httpContext.GetPar( "TFBarCodPar") ;
      AV23TFBarCodPar_Sel = httpContext.GetPar( "TFBarCodPar_Sel") ;
      AV24TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV25TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV26TFBarSer = httpContext.GetPar( "TFBarSer") ;
      AV27TFBarSer_Sel = httpContext.GetPar( "TFBarSer_Sel") ;
      AV28TFBarColNom = httpContext.GetPar( "TFBarColNom") ;
      AV29TFBarColNom_Sel = httpContext.GetPar( "TFBarColNom_Sel") ;
      AV30TFBarNomCli = httpContext.GetPar( "TFBarNomCli") ;
      AV31TFBarNomCli_Sel = httpContext.GetPar( "TFBarNomCli_Sel") ;
      AV32TFFasCodn = httpContext.GetPar( "TFFasCodn") ;
      AV33TFFasCodn_Sel = httpContext.GetPar( "TFFasCodn_Sel") ;
      AV34TFOrdLin = (short)(GXutil.lval( httpContext.GetPar( "TFOrdLin"))) ;
      AV35TFOrdLin_To = (short)(GXutil.lval( httpContext.GetPar( "TFOrdLin_To"))) ;
      AV36TFSalExCoE = (int)(GXutil.lval( httpContext.GetPar( "TFSalExCoE"))) ;
      AV37TFSalExCoE_To = (int)(GXutil.lval( httpContext.GetPar( "TFSalExCoE_To"))) ;
      AV38TFSalExKgE = CommonUtil.decimalVal( httpContext.GetPar( "TFSalExKgE"), ".") ;
      AV39TFSalExKgE_To = CommonUtil.decimalVal( httpContext.GetPar( "TFSalExKgE_To"), ".") ;
      AV40TFSalExMtE = CommonUtil.decimalVal( httpContext.GetPar( "TFSalExMtE"), ".") ;
      AV41TFSalExMtE_To = CommonUtil.decimalVal( httpContext.GetPar( "TFSalExMtE_To"), ".") ;
      AV42TFSalExObs = httpContext.GetPar( "TFSalExObs") ;
      AV43TFSalExObs_Sel = httpContext.GetPar( "TFSalExObs_Sel") ;
      AV63Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV51SalExtFec = localUtil.parseDateParm( httpContext.GetPar( "SalExtFec")) ;
      AV52SalFhh = localUtil.parseDTimeParm( httpContext.GetPar( "SalFhh")) ;
      AV53Mancod = (short)(GXutil.lval( httpContext.GetPar( "Mancod"))) ;
      AV54ManNom = httpContext.GetPar( "ManNom") ;
      AV55SalCodeID = httpContext.GetPar( "SalCodeID") ;
      AV56SalEnvAT = (byte)(GXutil.lval( httpContext.GetPar( "SalEnvAT"))) ;
      AV57HashIN = httpContext.GetPar( "HashIN") ;
      AV58okIN = GXutil.strtobool( httpContext.GetPar( "okIN")) ;
      AV59Messages_jsonIN = httpContext.GetPar( "Messages_jsonIN") ;
      A6558FasCodn = httpContext.GetPar( "FasCodn") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A2253SalExtAlb = (int)(GXutil.lval( httpContext.GetPar( "SalExtAlb"))) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV46emprcod, AV47SalExtAlb, AV16TFSalExNln, AV17TFSalExNln_To, AV18TFBarCod, AV19TFBarCod_To, AV20TFBarCodReo, AV21TFBarCodReo_To, AV22TFBarCodPar, AV23TFBarCodPar_Sel, AV24TFCliCod, AV25TFCliCod_To, AV26TFBarSer, AV27TFBarSer_Sel, AV28TFBarColNom, AV29TFBarColNom_Sel, AV30TFBarNomCli, AV31TFBarNomCli_Sel, AV32TFFasCodn, AV33TFFasCodn_Sel, AV34TFOrdLin, AV35TFOrdLin_To, AV36TFSalExCoE, AV37TFSalExCoE_To, AV38TFSalExKgE, AV39TFSalExKgE_To, AV40TFSalExMtE, AV41TFSalExMtE_To, AV42TFSalExObs, AV43TFSalExObs_Sel, AV63Pgmname, AV12OrderedBy, AV13OrderedDsc, AV51SalExtFec, AV52SalFhh, AV53Mancod, AV54ManNom, AV55SalCodeID, AV56SalEnvAT, AV57HashIN, AV58okIN, AV59Messages_jsonIN, A6558FasCodn, A396EmprCod, A2253SalExtAlb, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa29L2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " Envio de Trabajos Externos", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.trabajoexterno_detail__wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV46emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV47SalExtAlb,8,0)),GXutil.URLEncode(GXutil.formatDateParm(AV51SalExtFec)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV52SalFhh)),GXutil.URLEncode(GXutil.ltrimstr(AV53Mancod,4,0)),GXutil.URLEncode(GXutil.rtrim(AV54ManNom)),GXutil.URLEncode(GXutil.rtrim(AV55SalCodeID)),GXutil.URLEncode(GXutil.ltrimstr(AV56SalEnvAT,1,0)),GXutil.URLEncode(GXutil.rtrim(AV57HashIN)),GXutil.URLEncode(GXutil.booltostr(AV58okIN)),GXutil.URLEncode(GXutil.rtrim(AV59Messages_jsonIN))}, new String[] {"emprcod","SalExtAlb","SalExtFec","SalFhh","Mancod","ManNom","SalCodeID","SalEnvAT","HashIN","okIN","Messages_jsonIN"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_SALEXTALB", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A2253SalExtAlb), "ZZZZZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"TrabajoExterno_Detail__WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV63Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("trabajoexterno_detail__wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_17", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_17, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV44DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV44DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV46emprcod", GXutil.rtrim( wcpOAV46emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV47SalExtAlb", GXutil.ltrim( localUtil.ntoc( wcpOAV47SalExtAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV51SalExtFec", localUtil.dtoc( wcpOAV51SalExtFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV52SalFhh", localUtil.ttoc( wcpOAV52SalFhh, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV53Mancod", GXutil.ltrim( localUtil.ntoc( wcpOAV53Mancod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV54ManNom", GXutil.rtrim( wcpOAV54ManNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV55SalCodeID", GXutil.rtrim( wcpOAV55SalCodeID));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV56SalEnvAT", GXutil.ltrim( localUtil.ntoc( wcpOAV56SalEnvAT, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV57HashIN", wcpOAV57HashIN);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"wcpOAV58okIN", wcpOAV58okIN);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV59Messages_jsonIN", wcpOAV59Messages_jsonIN);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSALEXNLN", GXutil.ltrim( localUtil.ntoc( AV16TFSalExNln, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSALEXNLN_TO", GXutil.ltrim( localUtil.ntoc( AV17TFSalExNln_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOD", GXutil.ltrim( localUtil.ntoc( AV18TFBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOD_TO", GXutil.ltrim( localUtil.ntoc( AV19TFBarCod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCODREO", GXutil.ltrim( localUtil.ntoc( AV20TFBarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCODREO_TO", GXutil.ltrim( localUtil.ntoc( AV21TFBarCodReo_To, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCODPAR", GXutil.rtrim( AV22TFBarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCODPAR_SEL", GXutil.rtrim( AV23TFBarCodPar_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV24TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV25TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSER", GXutil.rtrim( AV26TFBarSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSER_SEL", GXutil.rtrim( AV27TFBarSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNOM", GXutil.rtrim( AV28TFBarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNOM_SEL", GXutil.rtrim( AV29TFBarColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNOMCLI", GXutil.rtrim( AV30TFBarNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNOMCLI_SEL", GXutil.rtrim( AV31TFBarNomCli_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASCODN", GXutil.rtrim( AV32TFFasCodn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASCODN_SEL", GXutil.rtrim( AV33TFFasCodn_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFORDLIN", GXutil.ltrim( localUtil.ntoc( AV34TFOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFORDLIN_TO", GXutil.ltrim( localUtil.ntoc( AV35TFOrdLin_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSALEXCOE", GXutil.ltrim( localUtil.ntoc( AV36TFSalExCoE, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSALEXCOE_TO", GXutil.ltrim( localUtil.ntoc( AV37TFSalExCoE_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSALEXKGE", GXutil.ltrim( localUtil.ntoc( AV38TFSalExKgE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSALEXKGE_TO", GXutil.ltrim( localUtil.ntoc( AV39TFSalExKgE_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSALEXMTE", GXutil.ltrim( localUtil.ntoc( AV40TFSalExMtE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSALEXMTE_TO", GXutil.ltrim( localUtil.ntoc( AV41TFSalExMtE_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSALEXOBS", GXutil.rtrim( AV42TFSalExObs));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSALEXOBS_SEL", GXutil.rtrim( AV43TFSalExObs_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV46emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSALEXTALB", GXutil.ltrim( localUtil.ntoc( AV47SalExtAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSALEXTFEC", localUtil.dtoc( AV51SalExtFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSALFHH", localUtil.ttoc( AV52SalFhh, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANCOD", GXutil.ltrim( localUtil.ntoc( AV53Mancod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANNOM", GXutil.rtrim( AV54ManNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSALCODEID", GXutil.rtrim( AV55SalCodeID));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSALENVAT", GXutil.ltrim( localUtil.ntoc( AV56SalEnvAT, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHASHIN", AV57HashIN);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vOKIN", AV58okIN);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMESSAGES_JSONIN", AV59Messages_jsonIN);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"SALEXTALB", GXutil.ltrim( localUtil.ntoc( A2253SalExtAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_SALEXTALB", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A2253SalExtAlb), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_set", GXutil.rtrim( Ddo_grid_Filteredtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_set", GXutil.rtrim( Ddo_grid_Filteredtextto_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_set", GXutil.rtrim( Ddo_grid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Infinitescrolling", GXutil.rtrim( Grid_empowerer_Infinitescrolling));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Result));
   }

   public void renderHtmlCloseForm29L2( )
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
      return "TrabajoExterno_Detail__WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Envio de Trabajos Externos", "") ;
   }

   public void wb29L0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.trabajoexterno_detail__wc");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
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
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, sPrefix, "false");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTbmessage_Internalname, lblTbmessage_Caption, "", "", lblTbmessage_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextDanger", 0, "", 1, 1, 0, (short)(0), "HLP_TrabajoExterno_Detail__WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 hidden-xs", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol17( ) ;
      }
      if ( wbEnd == 17 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_17 = (int)(nGXsfl_17_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            GridContainer.AddObjectProperty("GRID_nEOF", GRID_nEOF);
            GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Grid", GridContainer, subGrid_Internalname);
            if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData", GridContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData"+"V", GridContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
            }
         }
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV63Pgmname), GXutil.rtrim( localUtil.format( AV63Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajoExterno_Detail__WC.htm");
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
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV44DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         wb_table1_43_29L2( true) ;
      }
      else
      {
         wb_table1_43_29L2( false) ;
      }
      return  ;
   }

   public void wb_table1_43_29L2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("InfiniteScrolling", Grid_empowerer_Infinitescrolling);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 17 )
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
               GridContainer.AddObjectProperty("GRID_nEOF", GRID_nEOF);
               GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Grid", GridContainer, subGrid_Internalname);
               if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData", GridContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData"+"V", GridContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start29L2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " Envio de Trabajos Externos", ""), (short)(0)) ;
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
            strup29L0( ) ;
         }
      }
   }

   public void ws29L2( )
   {
      start29L2( ) ;
      evt29L2( ) ;
   }

   public void evt29L2( )
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
                              strup29L0( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup29L0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1129L2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINARLINEA.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup29L0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1229L2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup29L0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = cmbavGridactions.getInternalname() ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup29L0( ) ;
                           }
                           AV64Trabajoexterno_detail__wcds_1_tfsalexnln = AV16TFSalExNln ;
                           AV65Trabajoexterno_detail__wcds_2_tfsalexnln_to = AV17TFSalExNln_To ;
                           AV66Trabajoexterno_detail__wcds_3_tfbarcod = AV18TFBarCod ;
                           AV67Trabajoexterno_detail__wcds_4_tfbarcod_to = AV19TFBarCod_To ;
                           AV68Trabajoexterno_detail__wcds_5_tfbarcodreo = AV20TFBarCodReo ;
                           AV69Trabajoexterno_detail__wcds_6_tfbarcodreo_to = AV21TFBarCodReo_To ;
                           AV70Trabajoexterno_detail__wcds_7_tfbarcodpar = AV22TFBarCodPar ;
                           AV71Trabajoexterno_detail__wcds_8_tfbarcodpar_sel = AV23TFBarCodPar_Sel ;
                           AV72Trabajoexterno_detail__wcds_9_tfclicod = AV24TFCliCod ;
                           AV73Trabajoexterno_detail__wcds_10_tfclicod_to = AV25TFCliCod_To ;
                           AV74Trabajoexterno_detail__wcds_11_tfbarser = AV26TFBarSer ;
                           AV75Trabajoexterno_detail__wcds_12_tfbarser_sel = AV27TFBarSer_Sel ;
                           AV76Trabajoexterno_detail__wcds_13_tfbarcolnom = AV28TFBarColNom ;
                           AV77Trabajoexterno_detail__wcds_14_tfbarcolnom_sel = AV29TFBarColNom_Sel ;
                           AV78Trabajoexterno_detail__wcds_15_tfbarnomcli = AV30TFBarNomCli ;
                           AV79Trabajoexterno_detail__wcds_16_tfbarnomcli_sel = AV31TFBarNomCli_Sel ;
                           AV80Trabajoexterno_detail__wcds_17_tffascodn = AV32TFFasCodn ;
                           AV81Trabajoexterno_detail__wcds_18_tffascodn_sel = AV33TFFasCodn_Sel ;
                           AV82Trabajoexterno_detail__wcds_19_tfordlin = AV34TFOrdLin ;
                           AV83Trabajoexterno_detail__wcds_20_tfordlin_to = AV35TFOrdLin_To ;
                           AV84Trabajoexterno_detail__wcds_21_tfsalexcoe = AV36TFSalExCoE ;
                           AV85Trabajoexterno_detail__wcds_22_tfsalexcoe_to = AV37TFSalExCoE_To ;
                           AV86Trabajoexterno_detail__wcds_23_tfsalexkge = AV38TFSalExKgE ;
                           AV87Trabajoexterno_detail__wcds_24_tfsalexkge_to = AV39TFSalExKgE_To ;
                           AV88Trabajoexterno_detail__wcds_25_tfsalexmte = AV40TFSalExMtE ;
                           AV89Trabajoexterno_detail__wcds_26_tfsalexmte_to = AV41TFSalExMtE_To ;
                           AV90Trabajoexterno_detail__wcds_27_tfsalexobs = AV42TFSalExObs ;
                           AV91Trabajoexterno_detail__wcds_28_tfsalexobs_sel = AV43TFSalExObs_Sel ;
                           sEvt = httpContext.cgiGet( sPrefix+"GRIDPAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgrid_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgrid_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgrid_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgrid_lastpage( ) ;
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup29L0( ) ;
                           }
                           nGXsfl_17_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_17_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_17_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_172( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV45GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45GridActions), 4, 0));
                           A6248SalExNln = (short)(localUtil.ctol( httpContext.cgiGet( edtSalExNln_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
                           A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
                           A1234BarNomCli = httpContext.cgiGet( edtBarNomCli_Internalname) ;
                           A6558FasCodn = GXutil.upper( httpContext.cgiGet( edtFasCodn_Internalname)) ;
                           AV14FasDsc = httpContext.cgiGet( edtavFasdsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFasdsc_Internalname, AV14FasDsc);
                           A654OrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A6257SalExCoE = (int)(localUtil.ctol( httpContext.cgiGet( edtSalExCoE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A6256SalExKgE = localUtil.ctond( httpContext.cgiGet( edtSalExKgE_Internalname)) ;
                           A6258SalExMtE = localUtil.ctond( httpContext.cgiGet( edtSalExMtE_Internalname)) ;
                           A6249SalExObs = httpContext.cgiGet( edtSalExObs_Internalname) ;
                           A2265BarExt = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarExt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGridactions.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e1329L2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGridactions.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e1429L2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGridactions.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e1529L2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGridactions.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e1629L2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
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
                                    strup29L0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGridactions.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                    }
                                 }
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

   public void we29L2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm29L2( ) ;
         }
      }
   }

   public void pa29L2( )
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

   public void gxnrgrid_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_172( ) ;
      while ( nGXsfl_17_idx <= nRC_GXsfl_17 )
      {
         sendrow_172( ) ;
         nGXsfl_17_idx = ((subGrid_Islastpage==1)&&(nGXsfl_17_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_17_idx+1) ;
         sGXsfl_17_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_17_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_172( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV46emprcod ,
                                 int AV47SalExtAlb ,
                                 short AV16TFSalExNln ,
                                 short AV17TFSalExNln_To ,
                                 int AV18TFBarCod ,
                                 int AV19TFBarCod_To ,
                                 byte AV20TFBarCodReo ,
                                 byte AV21TFBarCodReo_To ,
                                 String AV22TFBarCodPar ,
                                 String AV23TFBarCodPar_Sel ,
                                 int AV24TFCliCod ,
                                 int AV25TFCliCod_To ,
                                 String AV26TFBarSer ,
                                 String AV27TFBarSer_Sel ,
                                 String AV28TFBarColNom ,
                                 String AV29TFBarColNom_Sel ,
                                 String AV30TFBarNomCli ,
                                 String AV31TFBarNomCli_Sel ,
                                 String AV32TFFasCodn ,
                                 String AV33TFFasCodn_Sel ,
                                 short AV34TFOrdLin ,
                                 short AV35TFOrdLin_To ,
                                 int AV36TFSalExCoE ,
                                 int AV37TFSalExCoE_To ,
                                 java.math.BigDecimal AV38TFSalExKgE ,
                                 java.math.BigDecimal AV39TFSalExKgE_To ,
                                 java.math.BigDecimal AV40TFSalExMtE ,
                                 java.math.BigDecimal AV41TFSalExMtE_To ,
                                 String AV42TFSalExObs ,
                                 String AV43TFSalExObs_Sel ,
                                 String AV63Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 java.util.Date AV51SalExtFec ,
                                 java.util.Date AV52SalFhh ,
                                 short AV53Mancod ,
                                 String AV54ManNom ,
                                 String AV55SalCodeID ,
                                 byte AV56SalEnvAT ,
                                 String AV57HashIN ,
                                 boolean AV58okIN ,
                                 String AV59Messages_jsonIN ,
                                 String A6558FasCodn ,
                                 String A396EmprCod ,
                                 int A2253SalExtAlb ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e1429L2 ();
      GRID_nCurrentRecord = 0 ;
      rf29L2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"TrabajoExterno_Detail__WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV63Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("trabajoexterno_detail__wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BAREXT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A2265BarExt), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BAREXT", GXutil.ltrim( localUtil.ntoc( A2265BarExt, (byte)(1), (byte)(0), ".", "")));
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
      GRID_nFirstRecordOnPage = 0 ;
      GRID_nCurrentRecord = 0 ;
      GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_17_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      send_integrity_hashes( ) ;
      rf29L2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV63Pgmname = "TrabajoExterno_Detail__WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63Pgmname", AV63Pgmname);
      Gx_err = (short)(0) ;
      edtavFasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFasdsc_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf29L2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(17) ;
      /* Execute user event: Refresh */
      e1429L2 ();
      nGXsfl_17_idx = (int)(1+GRID_nFirstRecordOnPage) ;
      sGXsfl_17_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_17_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_172( ) ;
      bGXsfl_17_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
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
         subsflControlProps_172( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Short.valueOf(AV64Trabajoexterno_detail__wcds_1_tfsalexnln) ,
                                              Short.valueOf(AV65Trabajoexterno_detail__wcds_2_tfsalexnln_to) ,
                                              Integer.valueOf(AV66Trabajoexterno_detail__wcds_3_tfbarcod) ,
                                              Integer.valueOf(AV67Trabajoexterno_detail__wcds_4_tfbarcod_to) ,
                                              Byte.valueOf(AV68Trabajoexterno_detail__wcds_5_tfbarcodreo) ,
                                              Byte.valueOf(AV69Trabajoexterno_detail__wcds_6_tfbarcodreo_to) ,
                                              AV71Trabajoexterno_detail__wcds_8_tfbarcodpar_sel ,
                                              AV70Trabajoexterno_detail__wcds_7_tfbarcodpar ,
                                              Integer.valueOf(AV72Trabajoexterno_detail__wcds_9_tfclicod) ,
                                              Integer.valueOf(AV73Trabajoexterno_detail__wcds_10_tfclicod_to) ,
                                              AV75Trabajoexterno_detail__wcds_12_tfbarser_sel ,
                                              AV74Trabajoexterno_detail__wcds_11_tfbarser ,
                                              AV77Trabajoexterno_detail__wcds_14_tfbarcolnom_sel ,
                                              AV76Trabajoexterno_detail__wcds_13_tfbarcolnom ,
                                              AV79Trabajoexterno_detail__wcds_16_tfbarnomcli_sel ,
                                              AV78Trabajoexterno_detail__wcds_15_tfbarnomcli ,
                                              AV81Trabajoexterno_detail__wcds_18_tffascodn_sel ,
                                              AV80Trabajoexterno_detail__wcds_17_tffascodn ,
                                              Short.valueOf(AV82Trabajoexterno_detail__wcds_19_tfordlin) ,
                                              Short.valueOf(AV83Trabajoexterno_detail__wcds_20_tfordlin_to) ,
                                              Integer.valueOf(AV84Trabajoexterno_detail__wcds_21_tfsalexcoe) ,
                                              Integer.valueOf(AV85Trabajoexterno_detail__wcds_22_tfsalexcoe_to) ,
                                              AV86Trabajoexterno_detail__wcds_23_tfsalexkge ,
                                              AV87Trabajoexterno_detail__wcds_24_tfsalexkge_to ,
                                              AV88Trabajoexterno_detail__wcds_25_tfsalexmte ,
                                              AV89Trabajoexterno_detail__wcds_26_tfsalexmte_to ,
                                              AV91Trabajoexterno_detail__wcds_28_tfsalexobs_sel ,
                                              AV90Trabajoexterno_detail__wcds_27_tfsalexobs ,
                                              Short.valueOf(A6248SalExNln) ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              Integer.valueOf(A252CliCod) ,
                                              A212BarSer ,
                                              A135BarColNom ,
                                              A1234BarNomCli ,
                                              A6558FasCodn ,
                                              Short.valueOf(A654OrdLin) ,
                                              Integer.valueOf(A6257SalExCoE) ,
                                              A6256SalExKgE ,
                                              A6258SalExMtE ,
                                              A6249SalExObs ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV46emprcod ,
                                              Integer.valueOf(AV47SalExtAlb) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A2253SalExtAlb) } ,
                                              new int[]{
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT,
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                              }
         });
         /* Using cursor H029L2 */
         pr_default.execute(0, new Object[] {AV46emprcod, Integer.valueOf(AV47SalExtAlb), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_17_idx = (int)(1+GRID_nFirstRecordOnPage) ;
         sGXsfl_17_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_17_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_172( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H029L2_A396EmprCod[0] ;
            A2253SalExtAlb = H029L2_A2253SalExtAlb[0] ;
            e1529L2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(17) ;
         wb29L0( ) ;
      }
      bGXsfl_17_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes29L2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BAREXT"+"_"+sGXsfl_17_idx, getSecureSignedToken( sPrefix+sGXsfl_17_idx, localUtil.format( DecimalUtil.doubleToDec(A2265BarExt), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"SALEXTALB", GXutil.ltrim( localUtil.ntoc( A2253SalExtAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_SALEXTALB", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A2253SalExtAlb), "ZZZZZZZ9")));
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
      AV64Trabajoexterno_detail__wcds_1_tfsalexnln = AV16TFSalExNln ;
      AV65Trabajoexterno_detail__wcds_2_tfsalexnln_to = AV17TFSalExNln_To ;
      AV66Trabajoexterno_detail__wcds_3_tfbarcod = AV18TFBarCod ;
      AV67Trabajoexterno_detail__wcds_4_tfbarcod_to = AV19TFBarCod_To ;
      AV68Trabajoexterno_detail__wcds_5_tfbarcodreo = AV20TFBarCodReo ;
      AV69Trabajoexterno_detail__wcds_6_tfbarcodreo_to = AV21TFBarCodReo_To ;
      AV70Trabajoexterno_detail__wcds_7_tfbarcodpar = AV22TFBarCodPar ;
      AV71Trabajoexterno_detail__wcds_8_tfbarcodpar_sel = AV23TFBarCodPar_Sel ;
      AV72Trabajoexterno_detail__wcds_9_tfclicod = AV24TFCliCod ;
      AV73Trabajoexterno_detail__wcds_10_tfclicod_to = AV25TFCliCod_To ;
      AV74Trabajoexterno_detail__wcds_11_tfbarser = AV26TFBarSer ;
      AV75Trabajoexterno_detail__wcds_12_tfbarser_sel = AV27TFBarSer_Sel ;
      AV76Trabajoexterno_detail__wcds_13_tfbarcolnom = AV28TFBarColNom ;
      AV77Trabajoexterno_detail__wcds_14_tfbarcolnom_sel = AV29TFBarColNom_Sel ;
      AV78Trabajoexterno_detail__wcds_15_tfbarnomcli = AV30TFBarNomCli ;
      AV79Trabajoexterno_detail__wcds_16_tfbarnomcli_sel = AV31TFBarNomCli_Sel ;
      AV80Trabajoexterno_detail__wcds_17_tffascodn = AV32TFFasCodn ;
      AV81Trabajoexterno_detail__wcds_18_tffascodn_sel = AV33TFFasCodn_Sel ;
      AV82Trabajoexterno_detail__wcds_19_tfordlin = AV34TFOrdLin ;
      AV83Trabajoexterno_detail__wcds_20_tfordlin_to = AV35TFOrdLin_To ;
      AV84Trabajoexterno_detail__wcds_21_tfsalexcoe = AV36TFSalExCoE ;
      AV85Trabajoexterno_detail__wcds_22_tfsalexcoe_to = AV37TFSalExCoE_To ;
      AV86Trabajoexterno_detail__wcds_23_tfsalexkge = AV38TFSalExKgE ;
      AV87Trabajoexterno_detail__wcds_24_tfsalexkge_to = AV39TFSalExKgE_To ;
      AV88Trabajoexterno_detail__wcds_25_tfsalexmte = AV40TFSalExMtE ;
      AV89Trabajoexterno_detail__wcds_26_tfsalexmte_to = AV41TFSalExMtE_To ;
      AV90Trabajoexterno_detail__wcds_27_tfsalexobs = AV42TFSalExObs ;
      AV91Trabajoexterno_detail__wcds_28_tfsalexobs_sel = AV43TFSalExObs_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV64Trabajoexterno_detail__wcds_1_tfsalexnln) ,
                                           Short.valueOf(AV65Trabajoexterno_detail__wcds_2_tfsalexnln_to) ,
                                           Integer.valueOf(AV66Trabajoexterno_detail__wcds_3_tfbarcod) ,
                                           Integer.valueOf(AV67Trabajoexterno_detail__wcds_4_tfbarcod_to) ,
                                           Byte.valueOf(AV68Trabajoexterno_detail__wcds_5_tfbarcodreo) ,
                                           Byte.valueOf(AV69Trabajoexterno_detail__wcds_6_tfbarcodreo_to) ,
                                           AV71Trabajoexterno_detail__wcds_8_tfbarcodpar_sel ,
                                           AV70Trabajoexterno_detail__wcds_7_tfbarcodpar ,
                                           Integer.valueOf(AV72Trabajoexterno_detail__wcds_9_tfclicod) ,
                                           Integer.valueOf(AV73Trabajoexterno_detail__wcds_10_tfclicod_to) ,
                                           AV75Trabajoexterno_detail__wcds_12_tfbarser_sel ,
                                           AV74Trabajoexterno_detail__wcds_11_tfbarser ,
                                           AV77Trabajoexterno_detail__wcds_14_tfbarcolnom_sel ,
                                           AV76Trabajoexterno_detail__wcds_13_tfbarcolnom ,
                                           AV79Trabajoexterno_detail__wcds_16_tfbarnomcli_sel ,
                                           AV78Trabajoexterno_detail__wcds_15_tfbarnomcli ,
                                           AV81Trabajoexterno_detail__wcds_18_tffascodn_sel ,
                                           AV80Trabajoexterno_detail__wcds_17_tffascodn ,
                                           Short.valueOf(AV82Trabajoexterno_detail__wcds_19_tfordlin) ,
                                           Short.valueOf(AV83Trabajoexterno_detail__wcds_20_tfordlin_to) ,
                                           Integer.valueOf(AV84Trabajoexterno_detail__wcds_21_tfsalexcoe) ,
                                           Integer.valueOf(AV85Trabajoexterno_detail__wcds_22_tfsalexcoe_to) ,
                                           AV86Trabajoexterno_detail__wcds_23_tfsalexkge ,
                                           AV87Trabajoexterno_detail__wcds_24_tfsalexkge_to ,
                                           AV88Trabajoexterno_detail__wcds_25_tfsalexmte ,
                                           AV89Trabajoexterno_detail__wcds_26_tfsalexmte_to ,
                                           AV91Trabajoexterno_detail__wcds_28_tfsalexobs_sel ,
                                           AV90Trabajoexterno_detail__wcds_27_tfsalexobs ,
                                           Short.valueOf(A6248SalExNln) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           A6558FasCodn ,
                                           Short.valueOf(A654OrdLin) ,
                                           Integer.valueOf(A6257SalExCoE) ,
                                           A6256SalExKgE ,
                                           A6258SalExMtE ,
                                           A6249SalExObs ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV46emprcod ,
                                           Integer.valueOf(AV47SalExtAlb) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A2253SalExtAlb) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      /* Using cursor H029L3 */
      pr_default.execute(1, new Object[] {AV46emprcod, Integer.valueOf(AV47SalExtAlb)});
      GRID_nRecordCount = H029L3_AGRID_nRecordCount[0] ;
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
      AV64Trabajoexterno_detail__wcds_1_tfsalexnln = AV16TFSalExNln ;
      AV65Trabajoexterno_detail__wcds_2_tfsalexnln_to = AV17TFSalExNln_To ;
      AV66Trabajoexterno_detail__wcds_3_tfbarcod = AV18TFBarCod ;
      AV67Trabajoexterno_detail__wcds_4_tfbarcod_to = AV19TFBarCod_To ;
      AV68Trabajoexterno_detail__wcds_5_tfbarcodreo = AV20TFBarCodReo ;
      AV69Trabajoexterno_detail__wcds_6_tfbarcodreo_to = AV21TFBarCodReo_To ;
      AV70Trabajoexterno_detail__wcds_7_tfbarcodpar = AV22TFBarCodPar ;
      AV71Trabajoexterno_detail__wcds_8_tfbarcodpar_sel = AV23TFBarCodPar_Sel ;
      AV72Trabajoexterno_detail__wcds_9_tfclicod = AV24TFCliCod ;
      AV73Trabajoexterno_detail__wcds_10_tfclicod_to = AV25TFCliCod_To ;
      AV74Trabajoexterno_detail__wcds_11_tfbarser = AV26TFBarSer ;
      AV75Trabajoexterno_detail__wcds_12_tfbarser_sel = AV27TFBarSer_Sel ;
      AV76Trabajoexterno_detail__wcds_13_tfbarcolnom = AV28TFBarColNom ;
      AV77Trabajoexterno_detail__wcds_14_tfbarcolnom_sel = AV29TFBarColNom_Sel ;
      AV78Trabajoexterno_detail__wcds_15_tfbarnomcli = AV30TFBarNomCli ;
      AV79Trabajoexterno_detail__wcds_16_tfbarnomcli_sel = AV31TFBarNomCli_Sel ;
      AV80Trabajoexterno_detail__wcds_17_tffascodn = AV32TFFasCodn ;
      AV81Trabajoexterno_detail__wcds_18_tffascodn_sel = AV33TFFasCodn_Sel ;
      AV82Trabajoexterno_detail__wcds_19_tfordlin = AV34TFOrdLin ;
      AV83Trabajoexterno_detail__wcds_20_tfordlin_to = AV35TFOrdLin_To ;
      AV84Trabajoexterno_detail__wcds_21_tfsalexcoe = AV36TFSalExCoE ;
      AV85Trabajoexterno_detail__wcds_22_tfsalexcoe_to = AV37TFSalExCoE_To ;
      AV86Trabajoexterno_detail__wcds_23_tfsalexkge = AV38TFSalExKgE ;
      AV87Trabajoexterno_detail__wcds_24_tfsalexkge_to = AV39TFSalExKgE_To ;
      AV88Trabajoexterno_detail__wcds_25_tfsalexmte = AV40TFSalExMtE ;
      AV89Trabajoexterno_detail__wcds_26_tfsalexmte_to = AV41TFSalExMtE_To ;
      AV90Trabajoexterno_detail__wcds_27_tfsalexobs = AV42TFSalExObs ;
      AV91Trabajoexterno_detail__wcds_28_tfsalexobs_sel = AV43TFSalExObs_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV46emprcod, AV47SalExtAlb, AV16TFSalExNln, AV17TFSalExNln_To, AV18TFBarCod, AV19TFBarCod_To, AV20TFBarCodReo, AV21TFBarCodReo_To, AV22TFBarCodPar, AV23TFBarCodPar_Sel, AV24TFCliCod, AV25TFCliCod_To, AV26TFBarSer, AV27TFBarSer_Sel, AV28TFBarColNom, AV29TFBarColNom_Sel, AV30TFBarNomCli, AV31TFBarNomCli_Sel, AV32TFFasCodn, AV33TFFasCodn_Sel, AV34TFOrdLin, AV35TFOrdLin_To, AV36TFSalExCoE, AV37TFSalExCoE_To, AV38TFSalExKgE, AV39TFSalExKgE_To, AV40TFSalExMtE, AV41TFSalExMtE_To, AV42TFSalExObs, AV43TFSalExObs_Sel, AV63Pgmname, AV12OrderedBy, AV13OrderedDsc, AV51SalExtFec, AV52SalFhh, AV53Mancod, AV54ManNom, AV55SalCodeID, AV56SalEnvAT, AV57HashIN, AV58okIN, AV59Messages_jsonIN, A6558FasCodn, A396EmprCod, A2253SalExtAlb, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV64Trabajoexterno_detail__wcds_1_tfsalexnln = AV16TFSalExNln ;
      AV65Trabajoexterno_detail__wcds_2_tfsalexnln_to = AV17TFSalExNln_To ;
      AV66Trabajoexterno_detail__wcds_3_tfbarcod = AV18TFBarCod ;
      AV67Trabajoexterno_detail__wcds_4_tfbarcod_to = AV19TFBarCod_To ;
      AV68Trabajoexterno_detail__wcds_5_tfbarcodreo = AV20TFBarCodReo ;
      AV69Trabajoexterno_detail__wcds_6_tfbarcodreo_to = AV21TFBarCodReo_To ;
      AV70Trabajoexterno_detail__wcds_7_tfbarcodpar = AV22TFBarCodPar ;
      AV71Trabajoexterno_detail__wcds_8_tfbarcodpar_sel = AV23TFBarCodPar_Sel ;
      AV72Trabajoexterno_detail__wcds_9_tfclicod = AV24TFCliCod ;
      AV73Trabajoexterno_detail__wcds_10_tfclicod_to = AV25TFCliCod_To ;
      AV74Trabajoexterno_detail__wcds_11_tfbarser = AV26TFBarSer ;
      AV75Trabajoexterno_detail__wcds_12_tfbarser_sel = AV27TFBarSer_Sel ;
      AV76Trabajoexterno_detail__wcds_13_tfbarcolnom = AV28TFBarColNom ;
      AV77Trabajoexterno_detail__wcds_14_tfbarcolnom_sel = AV29TFBarColNom_Sel ;
      AV78Trabajoexterno_detail__wcds_15_tfbarnomcli = AV30TFBarNomCli ;
      AV79Trabajoexterno_detail__wcds_16_tfbarnomcli_sel = AV31TFBarNomCli_Sel ;
      AV80Trabajoexterno_detail__wcds_17_tffascodn = AV32TFFasCodn ;
      AV81Trabajoexterno_detail__wcds_18_tffascodn_sel = AV33TFFasCodn_Sel ;
      AV82Trabajoexterno_detail__wcds_19_tfordlin = AV34TFOrdLin ;
      AV83Trabajoexterno_detail__wcds_20_tfordlin_to = AV35TFOrdLin_To ;
      AV84Trabajoexterno_detail__wcds_21_tfsalexcoe = AV36TFSalExCoE ;
      AV85Trabajoexterno_detail__wcds_22_tfsalexcoe_to = AV37TFSalExCoE_To ;
      AV86Trabajoexterno_detail__wcds_23_tfsalexkge = AV38TFSalExKgE ;
      AV87Trabajoexterno_detail__wcds_24_tfsalexkge_to = AV39TFSalExKgE_To ;
      AV88Trabajoexterno_detail__wcds_25_tfsalexmte = AV40TFSalExMtE ;
      AV89Trabajoexterno_detail__wcds_26_tfsalexmte_to = AV41TFSalExMtE_To ;
      AV90Trabajoexterno_detail__wcds_27_tfsalexobs = AV42TFSalExObs ;
      AV91Trabajoexterno_detail__wcds_28_tfsalexobs_sel = AV43TFSalExObs_Sel ;
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( ( GRID_nRecordCount >= subgrid_fnc_recordsperpage( ) ) && ( GRID_nEOF == 0 ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      if ( GRID_nEOF == 1 )
      {
         GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV46emprcod, AV47SalExtAlb, AV16TFSalExNln, AV17TFSalExNln_To, AV18TFBarCod, AV19TFBarCod_To, AV20TFBarCodReo, AV21TFBarCodReo_To, AV22TFBarCodPar, AV23TFBarCodPar_Sel, AV24TFCliCod, AV25TFCliCod_To, AV26TFBarSer, AV27TFBarSer_Sel, AV28TFBarColNom, AV29TFBarColNom_Sel, AV30TFBarNomCli, AV31TFBarNomCli_Sel, AV32TFFasCodn, AV33TFFasCodn_Sel, AV34TFOrdLin, AV35TFOrdLin_To, AV36TFSalExCoE, AV37TFSalExCoE_To, AV38TFSalExKgE, AV39TFSalExKgE_To, AV40TFSalExMtE, AV41TFSalExMtE_To, AV42TFSalExObs, AV43TFSalExObs_Sel, AV63Pgmname, AV12OrderedBy, AV13OrderedDsc, AV51SalExtFec, AV52SalFhh, AV53Mancod, AV54ManNom, AV55SalCodeID, AV56SalEnvAT, AV57HashIN, AV58okIN, AV59Messages_jsonIN, A6558FasCodn, A396EmprCod, A2253SalExtAlb, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV64Trabajoexterno_detail__wcds_1_tfsalexnln = AV16TFSalExNln ;
      AV65Trabajoexterno_detail__wcds_2_tfsalexnln_to = AV17TFSalExNln_To ;
      AV66Trabajoexterno_detail__wcds_3_tfbarcod = AV18TFBarCod ;
      AV67Trabajoexterno_detail__wcds_4_tfbarcod_to = AV19TFBarCod_To ;
      AV68Trabajoexterno_detail__wcds_5_tfbarcodreo = AV20TFBarCodReo ;
      AV69Trabajoexterno_detail__wcds_6_tfbarcodreo_to = AV21TFBarCodReo_To ;
      AV70Trabajoexterno_detail__wcds_7_tfbarcodpar = AV22TFBarCodPar ;
      AV71Trabajoexterno_detail__wcds_8_tfbarcodpar_sel = AV23TFBarCodPar_Sel ;
      AV72Trabajoexterno_detail__wcds_9_tfclicod = AV24TFCliCod ;
      AV73Trabajoexterno_detail__wcds_10_tfclicod_to = AV25TFCliCod_To ;
      AV74Trabajoexterno_detail__wcds_11_tfbarser = AV26TFBarSer ;
      AV75Trabajoexterno_detail__wcds_12_tfbarser_sel = AV27TFBarSer_Sel ;
      AV76Trabajoexterno_detail__wcds_13_tfbarcolnom = AV28TFBarColNom ;
      AV77Trabajoexterno_detail__wcds_14_tfbarcolnom_sel = AV29TFBarColNom_Sel ;
      AV78Trabajoexterno_detail__wcds_15_tfbarnomcli = AV30TFBarNomCli ;
      AV79Trabajoexterno_detail__wcds_16_tfbarnomcli_sel = AV31TFBarNomCli_Sel ;
      AV80Trabajoexterno_detail__wcds_17_tffascodn = AV32TFFasCodn ;
      AV81Trabajoexterno_detail__wcds_18_tffascodn_sel = AV33TFFasCodn_Sel ;
      AV82Trabajoexterno_detail__wcds_19_tfordlin = AV34TFOrdLin ;
      AV83Trabajoexterno_detail__wcds_20_tfordlin_to = AV35TFOrdLin_To ;
      AV84Trabajoexterno_detail__wcds_21_tfsalexcoe = AV36TFSalExCoE ;
      AV85Trabajoexterno_detail__wcds_22_tfsalexcoe_to = AV37TFSalExCoE_To ;
      AV86Trabajoexterno_detail__wcds_23_tfsalexkge = AV38TFSalExKgE ;
      AV87Trabajoexterno_detail__wcds_24_tfsalexkge_to = AV39TFSalExKgE_To ;
      AV88Trabajoexterno_detail__wcds_25_tfsalexmte = AV40TFSalExMtE ;
      AV89Trabajoexterno_detail__wcds_26_tfsalexmte_to = AV41TFSalExMtE_To ;
      AV90Trabajoexterno_detail__wcds_27_tfsalexobs = AV42TFSalExObs ;
      AV91Trabajoexterno_detail__wcds_28_tfsalexobs_sel = AV43TFSalExObs_Sel ;
      if ( GRID_nFirstRecordOnPage >= subgrid_fnc_recordsperpage( ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage-subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV46emprcod, AV47SalExtAlb, AV16TFSalExNln, AV17TFSalExNln_To, AV18TFBarCod, AV19TFBarCod_To, AV20TFBarCodReo, AV21TFBarCodReo_To, AV22TFBarCodPar, AV23TFBarCodPar_Sel, AV24TFCliCod, AV25TFCliCod_To, AV26TFBarSer, AV27TFBarSer_Sel, AV28TFBarColNom, AV29TFBarColNom_Sel, AV30TFBarNomCli, AV31TFBarNomCli_Sel, AV32TFFasCodn, AV33TFFasCodn_Sel, AV34TFOrdLin, AV35TFOrdLin_To, AV36TFSalExCoE, AV37TFSalExCoE_To, AV38TFSalExKgE, AV39TFSalExKgE_To, AV40TFSalExMtE, AV41TFSalExMtE_To, AV42TFSalExObs, AV43TFSalExObs_Sel, AV63Pgmname, AV12OrderedBy, AV13OrderedDsc, AV51SalExtFec, AV52SalFhh, AV53Mancod, AV54ManNom, AV55SalCodeID, AV56SalEnvAT, AV57HashIN, AV58okIN, AV59Messages_jsonIN, A6558FasCodn, A396EmprCod, A2253SalExtAlb, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV64Trabajoexterno_detail__wcds_1_tfsalexnln = AV16TFSalExNln ;
      AV65Trabajoexterno_detail__wcds_2_tfsalexnln_to = AV17TFSalExNln_To ;
      AV66Trabajoexterno_detail__wcds_3_tfbarcod = AV18TFBarCod ;
      AV67Trabajoexterno_detail__wcds_4_tfbarcod_to = AV19TFBarCod_To ;
      AV68Trabajoexterno_detail__wcds_5_tfbarcodreo = AV20TFBarCodReo ;
      AV69Trabajoexterno_detail__wcds_6_tfbarcodreo_to = AV21TFBarCodReo_To ;
      AV70Trabajoexterno_detail__wcds_7_tfbarcodpar = AV22TFBarCodPar ;
      AV71Trabajoexterno_detail__wcds_8_tfbarcodpar_sel = AV23TFBarCodPar_Sel ;
      AV72Trabajoexterno_detail__wcds_9_tfclicod = AV24TFCliCod ;
      AV73Trabajoexterno_detail__wcds_10_tfclicod_to = AV25TFCliCod_To ;
      AV74Trabajoexterno_detail__wcds_11_tfbarser = AV26TFBarSer ;
      AV75Trabajoexterno_detail__wcds_12_tfbarser_sel = AV27TFBarSer_Sel ;
      AV76Trabajoexterno_detail__wcds_13_tfbarcolnom = AV28TFBarColNom ;
      AV77Trabajoexterno_detail__wcds_14_tfbarcolnom_sel = AV29TFBarColNom_Sel ;
      AV78Trabajoexterno_detail__wcds_15_tfbarnomcli = AV30TFBarNomCli ;
      AV79Trabajoexterno_detail__wcds_16_tfbarnomcli_sel = AV31TFBarNomCli_Sel ;
      AV80Trabajoexterno_detail__wcds_17_tffascodn = AV32TFFasCodn ;
      AV81Trabajoexterno_detail__wcds_18_tffascodn_sel = AV33TFFasCodn_Sel ;
      AV82Trabajoexterno_detail__wcds_19_tfordlin = AV34TFOrdLin ;
      AV83Trabajoexterno_detail__wcds_20_tfordlin_to = AV35TFOrdLin_To ;
      AV84Trabajoexterno_detail__wcds_21_tfsalexcoe = AV36TFSalExCoE ;
      AV85Trabajoexterno_detail__wcds_22_tfsalexcoe_to = AV37TFSalExCoE_To ;
      AV86Trabajoexterno_detail__wcds_23_tfsalexkge = AV38TFSalExKgE ;
      AV87Trabajoexterno_detail__wcds_24_tfsalexkge_to = AV39TFSalExKgE_To ;
      AV88Trabajoexterno_detail__wcds_25_tfsalexmte = AV40TFSalExMtE ;
      AV89Trabajoexterno_detail__wcds_26_tfsalexmte_to = AV41TFSalExMtE_To ;
      AV90Trabajoexterno_detail__wcds_27_tfsalexobs = AV42TFSalExObs ;
      AV91Trabajoexterno_detail__wcds_28_tfsalexobs_sel = AV43TFSalExObs_Sel ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV46emprcod, AV47SalExtAlb, AV16TFSalExNln, AV17TFSalExNln_To, AV18TFBarCod, AV19TFBarCod_To, AV20TFBarCodReo, AV21TFBarCodReo_To, AV22TFBarCodPar, AV23TFBarCodPar_Sel, AV24TFCliCod, AV25TFCliCod_To, AV26TFBarSer, AV27TFBarSer_Sel, AV28TFBarColNom, AV29TFBarColNom_Sel, AV30TFBarNomCli, AV31TFBarNomCli_Sel, AV32TFFasCodn, AV33TFFasCodn_Sel, AV34TFOrdLin, AV35TFOrdLin_To, AV36TFSalExCoE, AV37TFSalExCoE_To, AV38TFSalExKgE, AV39TFSalExKgE_To, AV40TFSalExMtE, AV41TFSalExMtE_To, AV42TFSalExObs, AV43TFSalExObs_Sel, AV63Pgmname, AV12OrderedBy, AV13OrderedDsc, AV51SalExtFec, AV52SalFhh, AV53Mancod, AV54ManNom, AV55SalCodeID, AV56SalEnvAT, AV57HashIN, AV58okIN, AV59Messages_jsonIN, A6558FasCodn, A396EmprCod, A2253SalExtAlb, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV64Trabajoexterno_detail__wcds_1_tfsalexnln = AV16TFSalExNln ;
      AV65Trabajoexterno_detail__wcds_2_tfsalexnln_to = AV17TFSalExNln_To ;
      AV66Trabajoexterno_detail__wcds_3_tfbarcod = AV18TFBarCod ;
      AV67Trabajoexterno_detail__wcds_4_tfbarcod_to = AV19TFBarCod_To ;
      AV68Trabajoexterno_detail__wcds_5_tfbarcodreo = AV20TFBarCodReo ;
      AV69Trabajoexterno_detail__wcds_6_tfbarcodreo_to = AV21TFBarCodReo_To ;
      AV70Trabajoexterno_detail__wcds_7_tfbarcodpar = AV22TFBarCodPar ;
      AV71Trabajoexterno_detail__wcds_8_tfbarcodpar_sel = AV23TFBarCodPar_Sel ;
      AV72Trabajoexterno_detail__wcds_9_tfclicod = AV24TFCliCod ;
      AV73Trabajoexterno_detail__wcds_10_tfclicod_to = AV25TFCliCod_To ;
      AV74Trabajoexterno_detail__wcds_11_tfbarser = AV26TFBarSer ;
      AV75Trabajoexterno_detail__wcds_12_tfbarser_sel = AV27TFBarSer_Sel ;
      AV76Trabajoexterno_detail__wcds_13_tfbarcolnom = AV28TFBarColNom ;
      AV77Trabajoexterno_detail__wcds_14_tfbarcolnom_sel = AV29TFBarColNom_Sel ;
      AV78Trabajoexterno_detail__wcds_15_tfbarnomcli = AV30TFBarNomCli ;
      AV79Trabajoexterno_detail__wcds_16_tfbarnomcli_sel = AV31TFBarNomCli_Sel ;
      AV80Trabajoexterno_detail__wcds_17_tffascodn = AV32TFFasCodn ;
      AV81Trabajoexterno_detail__wcds_18_tffascodn_sel = AV33TFFasCodn_Sel ;
      AV82Trabajoexterno_detail__wcds_19_tfordlin = AV34TFOrdLin ;
      AV83Trabajoexterno_detail__wcds_20_tfordlin_to = AV35TFOrdLin_To ;
      AV84Trabajoexterno_detail__wcds_21_tfsalexcoe = AV36TFSalExCoE ;
      AV85Trabajoexterno_detail__wcds_22_tfsalexcoe_to = AV37TFSalExCoE_To ;
      AV86Trabajoexterno_detail__wcds_23_tfsalexkge = AV38TFSalExKgE ;
      AV87Trabajoexterno_detail__wcds_24_tfsalexkge_to = AV39TFSalExKgE_To ;
      AV88Trabajoexterno_detail__wcds_25_tfsalexmte = AV40TFSalExMtE ;
      AV89Trabajoexterno_detail__wcds_26_tfsalexmte_to = AV41TFSalExMtE_To ;
      AV90Trabajoexterno_detail__wcds_27_tfsalexobs = AV42TFSalExObs ;
      AV91Trabajoexterno_detail__wcds_28_tfsalexobs_sel = AV43TFSalExObs_Sel ;
      if ( nPageNo > 0 )
      {
         GRID_nFirstRecordOnPage = (long)(subgrid_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV46emprcod, AV47SalExtAlb, AV16TFSalExNln, AV17TFSalExNln_To, AV18TFBarCod, AV19TFBarCod_To, AV20TFBarCodReo, AV21TFBarCodReo_To, AV22TFBarCodPar, AV23TFBarCodPar_Sel, AV24TFCliCod, AV25TFCliCod_To, AV26TFBarSer, AV27TFBarSer_Sel, AV28TFBarColNom, AV29TFBarColNom_Sel, AV30TFBarNomCli, AV31TFBarNomCli_Sel, AV32TFFasCodn, AV33TFFasCodn_Sel, AV34TFOrdLin, AV35TFOrdLin_To, AV36TFSalExCoE, AV37TFSalExCoE_To, AV38TFSalExKgE, AV39TFSalExKgE_To, AV40TFSalExMtE, AV41TFSalExMtE_To, AV42TFSalExObs, AV43TFSalExObs_Sel, AV63Pgmname, AV12OrderedBy, AV13OrderedDsc, AV51SalExtFec, AV52SalFhh, AV53Mancod, AV54ManNom, AV55SalCodeID, AV56SalEnvAT, AV57HashIN, AV58okIN, AV59Messages_jsonIN, A6558FasCodn, A396EmprCod, A2253SalExtAlb, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV63Pgmname = "TrabajoExterno_Detail__WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63Pgmname", AV63Pgmname);
      Gx_err = (short)(0) ;
      edtavFasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFasdsc_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup29L0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1329L2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV44DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_17 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_17"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV46emprcod = httpContext.cgiGet( sPrefix+"wcpOAV46emprcod") ;
         wcpOAV47SalExtAlb = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV47SalExtAlb"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV51SalExtFec = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV51SalExtFec"), 0) ;
         wcpOAV52SalFhh = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV52SalFhh"), 0) ;
         wcpOAV53Mancod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV53Mancod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV54ManNom = httpContext.cgiGet( sPrefix+"wcpOAV54ManNom") ;
         wcpOAV55SalCodeID = httpContext.cgiGet( sPrefix+"wcpOAV55SalCodeID") ;
         wcpOAV56SalEnvAT = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV56SalEnvAT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV57HashIN = httpContext.cgiGet( sPrefix+"wcpOAV57HashIN") ;
         wcpOAV58okIN = GXutil.strtobool( httpContext.cgiGet( sPrefix+"wcpOAV58okIN")) ;
         wcpOAV59Messages_jsonIN = httpContext.cgiGet( sPrefix+"wcpOAV59Messages_jsonIN") ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Ddo_grid_Caption = httpContext.cgiGet( sPrefix+"DDO_GRID_Caption") ;
         Ddo_grid_Filteredtext_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_set") ;
         Ddo_grid_Filteredtextto_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_set") ;
         Ddo_grid_Selectedvalue_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_set") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( sPrefix+"DDO_GRID_Includesortasc") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( sPrefix+"DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( sPrefix+"DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( sPrefix+"DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( sPrefix+"DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( sPrefix+"DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalisttype") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalistproc") ;
         Dvelop_confirmpanel_eliminarlinea_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA_Title") ;
         Dvelop_confirmpanel_eliminarlinea_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA_Confirmationtext") ;
         Dvelop_confirmpanel_eliminarlinea_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminarlinea_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminarlinea_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminarlinea_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminarlinea_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Infinitescrolling = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Infinitescrolling") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Fixedcolumns = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Fixedcolumns") ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         Dvelop_confirmpanel_eliminarlinea_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA_Result") ;
         /* Read variables values. */
         AV63Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63Pgmname", AV63Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"TrabajoExterno_Detail__WC");
         AV63Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63Pgmname", AV63Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV63Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("trabajoexterno_detail__wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e1329L2 ();
      if (returnInSub) return;
   }

   public void e1329L2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV48Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      trabajoexterno_detail__wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV48Station = GXt_char1 ;
      GXv_char2[0] = AV46emprcod ;
      GXv_char3[0] = AV49EmprNom ;
      GXv_char4[0] = AV50UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV48Station, GXv_char2, GXv_char3, GXv_char4) ;
      trabajoexterno_detail__wc_impl.this.AV46emprcod = GXv_char2[0] ;
      trabajoexterno_detail__wc_impl.this.AV49EmprNom = GXv_char3[0] ;
      trabajoexterno_detail__wc_impl.this.AV50UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46emprcod", AV46emprcod);
      subGrid_Rows = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      if ( AV12OrderedBy < 1 )
      {
         AV12OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV44DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV44DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
   }

   public void e1429L2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV6WWPContext = GXv_SdtWWPContext7[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      AV64Trabajoexterno_detail__wcds_1_tfsalexnln = AV16TFSalExNln ;
      AV65Trabajoexterno_detail__wcds_2_tfsalexnln_to = AV17TFSalExNln_To ;
      AV66Trabajoexterno_detail__wcds_3_tfbarcod = AV18TFBarCod ;
      AV67Trabajoexterno_detail__wcds_4_tfbarcod_to = AV19TFBarCod_To ;
      AV68Trabajoexterno_detail__wcds_5_tfbarcodreo = AV20TFBarCodReo ;
      AV69Trabajoexterno_detail__wcds_6_tfbarcodreo_to = AV21TFBarCodReo_To ;
      AV70Trabajoexterno_detail__wcds_7_tfbarcodpar = AV22TFBarCodPar ;
      AV71Trabajoexterno_detail__wcds_8_tfbarcodpar_sel = AV23TFBarCodPar_Sel ;
      AV72Trabajoexterno_detail__wcds_9_tfclicod = AV24TFCliCod ;
      AV73Trabajoexterno_detail__wcds_10_tfclicod_to = AV25TFCliCod_To ;
      AV74Trabajoexterno_detail__wcds_11_tfbarser = AV26TFBarSer ;
      AV75Trabajoexterno_detail__wcds_12_tfbarser_sel = AV27TFBarSer_Sel ;
      AV76Trabajoexterno_detail__wcds_13_tfbarcolnom = AV28TFBarColNom ;
      AV77Trabajoexterno_detail__wcds_14_tfbarcolnom_sel = AV29TFBarColNom_Sel ;
      AV78Trabajoexterno_detail__wcds_15_tfbarnomcli = AV30TFBarNomCli ;
      AV79Trabajoexterno_detail__wcds_16_tfbarnomcli_sel = AV31TFBarNomCli_Sel ;
      AV80Trabajoexterno_detail__wcds_17_tffascodn = AV32TFFasCodn ;
      AV81Trabajoexterno_detail__wcds_18_tffascodn_sel = AV33TFFasCodn_Sel ;
      AV82Trabajoexterno_detail__wcds_19_tfordlin = AV34TFOrdLin ;
      AV83Trabajoexterno_detail__wcds_20_tfordlin_to = AV35TFOrdLin_To ;
      AV84Trabajoexterno_detail__wcds_21_tfsalexcoe = AV36TFSalExCoE ;
      AV85Trabajoexterno_detail__wcds_22_tfsalexcoe_to = AV37TFSalExCoE_To ;
      AV86Trabajoexterno_detail__wcds_23_tfsalexkge = AV38TFSalExKgE ;
      AV87Trabajoexterno_detail__wcds_24_tfsalexkge_to = AV39TFSalExKgE_To ;
      AV88Trabajoexterno_detail__wcds_25_tfsalexmte = AV40TFSalExMtE ;
      AV89Trabajoexterno_detail__wcds_26_tfsalexmte_to = AV41TFSalExMtE_To ;
      AV90Trabajoexterno_detail__wcds_27_tfsalexobs = AV42TFSalExObs ;
      AV91Trabajoexterno_detail__wcds_28_tfsalexobs_sel = AV43TFSalExObs_Sel ;
   }

   public void e1129L2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV12OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         AV13OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "SalExNln") == 0 )
         {
            AV16TFSalExNln = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16TFSalExNln", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16TFSalExNln), 4, 0));
            AV17TFSalExNln_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17TFSalExNln_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17TFSalExNln_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarCod") == 0 )
         {
            AV18TFBarCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18TFBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18TFBarCod), 8, 0));
            AV19TFBarCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19TFBarCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19TFBarCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarCodReo") == 0 )
         {
            AV20TFBarCodReo = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20TFBarCodReo", GXutil.str( AV20TFBarCodReo, 1, 0));
            AV21TFBarCodReo_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21TFBarCodReo_To", GXutil.str( AV21TFBarCodReo_To, 1, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarCodPar") == 0 )
         {
            AV22TFBarCodPar = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22TFBarCodPar", AV22TFBarCodPar);
            AV23TFBarCodPar_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23TFBarCodPar_Sel", AV23TFBarCodPar_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV24TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24TFCliCod), 6, 0));
            AV25TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSer") == 0 )
         {
            AV26TFBarSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFBarSer", AV26TFBarSer);
            AV27TFBarSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFBarSer_Sel", AV27TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarColNom") == 0 )
         {
            AV28TFBarColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFBarColNom", AV28TFBarColNom);
            AV29TFBarColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFBarColNom_Sel", AV29TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNomCli") == 0 )
         {
            AV30TFBarNomCli = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFBarNomCli", AV30TFBarNomCli);
            AV31TFBarNomCli_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFBarNomCli_Sel", AV31TFBarNomCli_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasCodn") == 0 )
         {
            AV32TFFasCodn = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFFasCodn", AV32TFFasCodn);
            AV33TFFasCodn_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFFasCodn_Sel", AV33TFFasCodn_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "OrdLin") == 0 )
         {
            AV34TFOrdLin = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFOrdLin), 4, 0));
            AV35TFOrdLin_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFOrdLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFOrdLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "SalExCoE") == 0 )
         {
            AV36TFSalExCoE = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFSalExCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFSalExCoE), 6, 0));
            AV37TFSalExCoE_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFSalExCoE_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFSalExCoE_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "SalExKgE") == 0 )
         {
            AV38TFSalExKgE = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFSalExKgE", GXutil.ltrimstr( AV38TFSalExKgE, 9, 2));
            AV39TFSalExKgE_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFSalExKgE_To", GXutil.ltrimstr( AV39TFSalExKgE_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "SalExMtE") == 0 )
         {
            AV40TFSalExMtE = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFSalExMtE", GXutil.ltrimstr( AV40TFSalExMtE, 9, 2));
            AV41TFSalExMtE_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFSalExMtE_To", GXutil.ltrimstr( AV41TFSalExMtE_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "SalExObs") == 0 )
         {
            AV42TFSalExObs = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFSalExObs", AV42TFSalExObs);
            AV43TFSalExObs_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFSalExObs_Sel", AV43TFSalExObs_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e1529L2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      GXt_char1 = AV14FasDsc ;
      GXv_char4[0] = GXt_char1 ;
      new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A6558FasCodn, GXv_char4) ;
      trabajoexterno_detail__wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV14FasDsc = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFasdsc_Internalname, AV14FasDsc);
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(17) ;
      }
      sendrow_172( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_17_Refreshing )
      {
         httpContext.doAjaxLoad(17, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV45GridActions, 4, 0)) );
   }

   public void e1629L2( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV45GridActions == 1 )
      {
         /* Execute user subroutine: 'DO ELIMINARLINEA' */
         S152 ();
         if (returnInSub) return;
      }
      AV45GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV45GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
   }

   public void e1229L2( )
   {
      /* Dvelop_confirmpanel_eliminarlinea_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminarlinea_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINARLINEA' */
         S162 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void S132( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S152( )
   {
      /* 'DO ELIMINARLINEA' Routine */
      returnInSub = false ;
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( ! (GXutil.strcmp("", AV55SalCodeID)==0) || ( AV56SalEnvAT == 3 ) )
      {
         httpContext.doAjaxRefreshCmp(sPrefix);
         lblTbmessage_Caption = httpContext.getMessage( "Atenção.Este guia foi enviado para AT ¡¡¡¡", "") ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      }
      else
      {
         AV60flag = (byte)(0) ;
         if ( A2265BarExt < 2 )
         {
            GXv_char4[0] = AV46emprcod ;
            GXv_int8[0] = AV47SalExtAlb ;
            GXv_int9[0] = A6248SalExNln ;
            GXv_int10[0] = AV60flag ;
            new app.trabajosexternos.phdrde33(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int9, GXv_int10) ;
            trabajoexterno_detail__wc_impl.this.AV46emprcod = GXv_char4[0] ;
            trabajoexterno_detail__wc_impl.this.AV47SalExtAlb = GXv_int8[0] ;
            trabajoexterno_detail__wc_impl.this.A6248SalExNln = GXv_int9[0] ;
            trabajoexterno_detail__wc_impl.this.AV60flag = GXv_int10[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46emprcod", AV46emprcod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47SalExtAlb), 8, 0));
         }
         if ( AV60flag == 1 )
         {
            httpContext.doAjaxRefreshCmp(sPrefix);
            lblTbmessage_Caption = httpContext.getMessage( "Esta Linea ya esta Recepcionada¡¡¡", "") ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         }
         else
         {
            AV92Emprcod_selected = A396EmprCod ;
            AV93Salextalb_selected = A2253SalExtAlb ;
            this.executeUsercontrolMethod(sPrefix, false, "DVELOP_CONFIRMPANEL_ELIMINARLINEAContainer", "Confirm", "", new Object[] {});
         }
      }
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S162( )
   {
      /* 'DO ACTION ELIMINARLINEA' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV46emprcod ;
      GXv_int8[0] = A129BarCod ;
      GXv_int10[0] = A132BarCodReo ;
      GXv_char3[0] = A130BarCodPar ;
      GXv_char2[0] = A6558FasCodn ;
      GXv_date11[0] = AV51SalExtFec ;
      GXv_int12[0] = (byte)(0) ;
      GXv_int13[0] = AV47SalExtAlb ;
      GXv_int9[0] = A6248SalExNln ;
      GXv_char14[0] = httpContext.getMessage( "HDR", "") ;
      new app.trabajosexternos.phdrex9copy1(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int10, GXv_char3, GXv_char2, GXv_date11, GXv_int12, GXv_int13, GXv_int9, GXv_char14) ;
      trabajoexterno_detail__wc_impl.this.AV46emprcod = GXv_char4[0] ;
      trabajoexterno_detail__wc_impl.this.A129BarCod = GXv_int8[0] ;
      trabajoexterno_detail__wc_impl.this.A132BarCodReo = GXv_int10[0] ;
      trabajoexterno_detail__wc_impl.this.A130BarCodPar = GXv_char3[0] ;
      trabajoexterno_detail__wc_impl.this.A6558FasCodn = GXv_char2[0] ;
      trabajoexterno_detail__wc_impl.this.AV51SalExtFec = GXv_date11[0] ;
      trabajoexterno_detail__wc_impl.this.AV47SalExtAlb = GXv_int13[0] ;
      trabajoexterno_detail__wc_impl.this.A6248SalExNln = GXv_int9[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46emprcod", AV46emprcod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51SalExtFec", localUtil.format(AV51SalExtFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47SalExtAlb), 8, 0));
      GXv_char14[0] = AV46emprcod ;
      GXv_int9[0] = AV53Mancod ;
      GXv_char4[0] = A6558FasCodn ;
      GXv_char3[0] = httpContext.getMessage( "E", "") ;
      GXv_int13[0] = AV47SalExtAlb ;
      GXv_int8[0] = A129BarCod ;
      GXv_int12[0] = A132BarCodReo ;
      GXv_char2[0] = A130BarCodPar ;
      new app.trabajosexternos.pbmvhdr(remoteHandle, context).execute( GXv_char14, GXv_int9, GXv_char4, GXv_char3, GXv_int13, GXv_int8, GXv_int12, GXv_char2) ;
      trabajoexterno_detail__wc_impl.this.AV46emprcod = GXv_char14[0] ;
      trabajoexterno_detail__wc_impl.this.AV53Mancod = GXv_int9[0] ;
      trabajoexterno_detail__wc_impl.this.A6558FasCodn = GXv_char4[0] ;
      trabajoexterno_detail__wc_impl.this.AV47SalExtAlb = GXv_int13[0] ;
      trabajoexterno_detail__wc_impl.this.A129BarCod = GXv_int8[0] ;
      trabajoexterno_detail__wc_impl.this.A132BarCodReo = GXv_int12[0] ;
      trabajoexterno_detail__wc_impl.this.A130BarCodPar = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46emprcod", AV46emprcod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53Mancod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53Mancod), 4, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47SalExtAlb), 8, 0));
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV15Session.getValue(AV63Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV63Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV15Session.getValue(AV63Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV94GXV1 = 1 ;
      while ( AV94GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV94GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALEXNLN") == 0 )
         {
            AV16TFSalExNln = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16TFSalExNln", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16TFSalExNln), 4, 0));
            AV17TFSalExNln_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17TFSalExNln_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17TFSalExNln_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOD") == 0 )
         {
            AV18TFBarCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18TFBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18TFBarCod), 8, 0));
            AV19TFBarCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19TFBarCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19TFBarCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODREO") == 0 )
         {
            AV20TFBarCodReo = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20TFBarCodReo", GXutil.str( AV20TFBarCodReo, 1, 0));
            AV21TFBarCodReo_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21TFBarCodReo_To", GXutil.str( AV21TFBarCodReo_To, 1, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR") == 0 )
         {
            AV22TFBarCodPar = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22TFBarCodPar", AV22TFBarCodPar);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR_SEL") == 0 )
         {
            AV23TFBarCodPar_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23TFBarCodPar_Sel", AV23TFBarCodPar_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV24TFCliCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24TFCliCod), 6, 0));
            AV25TFCliCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV26TFBarSer = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFBarSer", AV26TFBarSer);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV27TFBarSer_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFBarSer_Sel", AV27TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV28TFBarColNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFBarColNom", AV28TFBarColNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV29TFBarColNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFBarColNom_Sel", AV29TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV30TFBarNomCli = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFBarNomCli", AV30TFBarNomCli);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV31TFBarNomCli_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFBarNomCli_Sel", AV31TFBarNomCli_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCODN") == 0 )
         {
            AV32TFFasCodn = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFFasCodn", AV32TFFasCodn);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCODN_SEL") == 0 )
         {
            AV33TFFasCodn_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFFasCodn_Sel", AV33TFFasCodn_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFORDLIN") == 0 )
         {
            AV34TFOrdLin = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFOrdLin), 4, 0));
            AV35TFOrdLin_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFOrdLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFOrdLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALEXCOE") == 0 )
         {
            AV36TFSalExCoE = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFSalExCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFSalExCoE), 6, 0));
            AV37TFSalExCoE_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFSalExCoE_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFSalExCoE_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALEXKGE") == 0 )
         {
            AV38TFSalExKgE = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFSalExKgE", GXutil.ltrimstr( AV38TFSalExKgE, 9, 2));
            AV39TFSalExKgE_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFSalExKgE_To", GXutil.ltrimstr( AV39TFSalExKgE_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALEXMTE") == 0 )
         {
            AV40TFSalExMtE = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFSalExMtE", GXutil.ltrimstr( AV40TFSalExMtE, 9, 2));
            AV41TFSalExMtE_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFSalExMtE_To", GXutil.ltrimstr( AV41TFSalExMtE_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALEXOBS") == 0 )
         {
            AV42TFSalExObs = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFSalExObs", AV42TFSalExObs);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALEXOBS_SEL") == 0 )
         {
            AV43TFSalExObs_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFSalExObs_Sel", AV43TFSalExObs_Sel);
         }
         AV94GXV1 = (int)(AV94GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char14[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV23TFBarCodPar_Sel)==0), AV23TFBarCodPar_Sel, GXv_char14) ;
      trabajoexterno_detail__wc_impl.this.GXt_char1 = GXv_char14[0] ;
      GXt_char15 = "" ;
      GXv_char4[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV27TFBarSer_Sel)==0), AV27TFBarSer_Sel, GXv_char4) ;
      trabajoexterno_detail__wc_impl.this.GXt_char15 = GXv_char4[0] ;
      GXt_char16 = "" ;
      GXv_char3[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV29TFBarColNom_Sel)==0), AV29TFBarColNom_Sel, GXv_char3) ;
      trabajoexterno_detail__wc_impl.this.GXt_char16 = GXv_char3[0] ;
      GXt_char17 = "" ;
      GXv_char2[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV31TFBarNomCli_Sel)==0), AV31TFBarNomCli_Sel, GXv_char2) ;
      trabajoexterno_detail__wc_impl.this.GXt_char17 = GXv_char2[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFFasCodn_Sel)==0), AV33TFFasCodn_Sel, GXv_char19) ;
      trabajoexterno_detail__wc_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFSalExObs_Sel)==0), AV43TFSalExObs_Sel, GXv_char21) ;
      trabajoexterno_detail__wc_impl.this.GXt_char20 = GXv_char21[0] ;
      Ddo_grid_Selectedvalue_set = "|||"+GXt_char1+"||"+GXt_char15+"|"+GXt_char16+"|"+GXt_char17+"|"+GXt_char18+"|||||"+GXt_char20 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV22TFBarCodPar)==0), AV22TFBarCodPar, GXv_char21) ;
      trabajoexterno_detail__wc_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV26TFBarSer)==0), AV26TFBarSer, GXv_char19) ;
      trabajoexterno_detail__wc_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char17 = "" ;
      GXv_char14[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV28TFBarColNom)==0), AV28TFBarColNom, GXv_char14) ;
      trabajoexterno_detail__wc_impl.this.GXt_char17 = GXv_char14[0] ;
      GXt_char16 = "" ;
      GXv_char4[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV30TFBarNomCli)==0), AV30TFBarNomCli, GXv_char4) ;
      trabajoexterno_detail__wc_impl.this.GXt_char16 = GXv_char4[0] ;
      GXt_char15 = "" ;
      GXv_char3[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFFasCodn)==0), AV32TFFasCodn, GXv_char3) ;
      trabajoexterno_detail__wc_impl.this.GXt_char15 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV42TFSalExObs)==0), AV42TFSalExObs, GXv_char2) ;
      trabajoexterno_detail__wc_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV16TFSalExNln) ? "" : GXutil.str( AV16TFSalExNln, 4, 0))+"|"+((0==AV18TFBarCod) ? "" : GXutil.str( AV18TFBarCod, 8, 0))+"|"+((0==AV20TFBarCodReo) ? "" : GXutil.str( AV20TFBarCodReo, 1, 0))+"|"+GXt_char20+"|"+((0==AV24TFCliCod) ? "" : GXutil.str( AV24TFCliCod, 6, 0))+"|"+GXt_char18+"|"+GXt_char17+"|"+GXt_char16+"|"+GXt_char15+"|"+((0==AV34TFOrdLin) ? "" : GXutil.str( AV34TFOrdLin, 4, 0))+"|"+((0==AV36TFSalExCoE) ? "" : GXutil.str( AV36TFSalExCoE, 6, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV38TFSalExKgE)==0) ? "" : GXutil.str( AV38TFSalExKgE, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFSalExMtE)==0) ? "" : GXutil.str( AV40TFSalExMtE, 9, 2))+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV17TFSalExNln_To) ? "" : GXutil.str( AV17TFSalExNln_To, 4, 0))+"|"+((0==AV19TFBarCod_To) ? "" : GXutil.str( AV19TFBarCod_To, 8, 0))+"|"+((0==AV21TFBarCodReo_To) ? "" : GXutil.str( AV21TFBarCodReo_To, 1, 0))+"||"+((0==AV25TFCliCod_To) ? "" : GXutil.str( AV25TFCliCod_To, 6, 0))+"|||||"+((0==AV35TFOrdLin_To) ? "" : GXutil.str( AV35TFOrdLin_To, 4, 0))+"|"+((0==AV37TFSalExCoE_To) ? "" : GXutil.str( AV37TFSalExCoE_To, 6, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFSalExKgE_To)==0) ? "" : GXutil.str( AV39TFSalExKgE_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFSalExMtE_To)==0) ? "" : GXutil.str( AV41TFSalExMtE_To, 9, 2))+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S142( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV15Session.getValue(AV63Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFSALEXNLN", "", !((0==AV16TFSalExNln)&&(0==AV17TFSalExNln_To)), (short)(0), GXutil.trim( GXutil.str( AV16TFSalExNln, 4, 0)), GXutil.trim( GXutil.str( AV17TFSalExNln_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFBARCOD", "", !((0==AV18TFBarCod)&&(0==AV19TFBarCod_To)), (short)(0), GXutil.trim( GXutil.str( AV18TFBarCod, 8, 0)), GXutil.trim( GXutil.str( AV19TFBarCod_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFBARCODREO", "", !((0==AV20TFBarCodReo)&&(0==AV21TFBarCodReo_To)), (short)(0), GXutil.trim( GXutil.str( AV20TFBarCodReo, 1, 0)), GXutil.trim( GXutil.str( AV21TFBarCodReo_To, 1, 0))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFBARCODPAR", "", !(GXutil.strcmp("", AV22TFBarCodPar)==0), (short)(0), AV22TFBarCodPar, "", !(GXutil.strcmp("", AV23TFBarCodPar_Sel)==0), AV23TFBarCodPar_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFCLICOD", "", !((0==AV24TFCliCod)&&(0==AV25TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV24TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV25TFCliCod_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFBARSER", "", !(GXutil.strcmp("", AV26TFBarSer)==0), (short)(0), AV26TFBarSer, "", !(GXutil.strcmp("", AV27TFBarSer_Sel)==0), AV27TFBarSer_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFBARCOLNOM", "", !(GXutil.strcmp("", AV28TFBarColNom)==0), (short)(0), AV28TFBarColNom, "", !(GXutil.strcmp("", AV29TFBarColNom_Sel)==0), AV29TFBarColNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFBARNOMCLI", "", !(GXutil.strcmp("", AV30TFBarNomCli)==0), (short)(0), AV30TFBarNomCli, "", !(GXutil.strcmp("", AV31TFBarNomCli_Sel)==0), AV31TFBarNomCli_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFFASCODN", "", !(GXutil.strcmp("", AV32TFFasCodn)==0), (short)(0), AV32TFFasCodn, "", !(GXutil.strcmp("", AV33TFFasCodn_Sel)==0), AV33TFFasCodn_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFORDLIN", "", !((0==AV34TFOrdLin)&&(0==AV35TFOrdLin_To)), (short)(0), GXutil.trim( GXutil.str( AV34TFOrdLin, 4, 0)), GXutil.trim( GXutil.str( AV35TFOrdLin_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFSALEXCOE", "", !((0==AV36TFSalExCoE)&&(0==AV37TFSalExCoE_To)), (short)(0), GXutil.trim( GXutil.str( AV36TFSalExCoE, 6, 0)), GXutil.trim( GXutil.str( AV37TFSalExCoE_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFSALEXKGE", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV38TFSalExKgE)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFSalExKgE_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV38TFSalExKgE, 9, 2)), GXutil.trim( GXutil.str( AV39TFSalExKgE_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFSALEXMTE", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFSalExMtE)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFSalExMtE_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV40TFSalExMtE, 9, 2)), GXutil.trim( GXutil.str( AV41TFSalExMtE_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFSALEXOBS", "", !(GXutil.strcmp("", AV42TFSalExObs)==0), (short)(0), AV42TFSalExObs, "", !(GXutil.strcmp("", AV43TFSalExObs_Sel)==0), AV43TFSalExObs_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      if ( ! (GXutil.strcmp("", AV46emprcod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV46emprcod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV47SalExtAlb) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&SALEXTALB" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV47SalExtAlb, 8, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV51SalExtFec)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&SALEXTFEC" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV51SalExtFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV52SalFhh) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&SALFHH" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.ttoc( AV52SalFhh, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV53Mancod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MANCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV53Mancod, 4, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV54ManNom)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MANNOM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV54ManNom );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV55SalCodeID)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&SALCODEID" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV55SalCodeID );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV56SalEnvAT) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&SALENVAT" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV56SalEnvAT, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV57HashIN)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HASHIN" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV57HashIN );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (false==AV58okIN) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&OKIN" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.booltostr( AV58okIN) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV59Messages_jsonIN)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MESSAGES_JSONIN" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV59Messages_jsonIN );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV63Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV63Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TWORKEXT" );
      AV15Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_43_29L2( boolean wbgen )
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
         ucDvelop_confirmpanel_eliminarlinea.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_eliminarlinea_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEAContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEAContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_43_29L2e( true) ;
      }
      else
      {
         wb_table1_43_29L2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV46emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46emprcod", AV46emprcod);
      AV47SalExtAlb = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47SalExtAlb), 8, 0));
      AV51SalExtFec = (java.util.Date)getParm(obj,2,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51SalExtFec", localUtil.format(AV51SalExtFec, "99/99/99"));
      AV52SalFhh = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52SalFhh", localUtil.ttoc( AV52SalFhh, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV53Mancod = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53Mancod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53Mancod), 4, 0));
      AV54ManNom = (String)getParm(obj,5,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54ManNom", AV54ManNom);
      AV55SalCodeID = (String)getParm(obj,6,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55SalCodeID", AV55SalCodeID);
      AV56SalEnvAT = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56SalEnvAT", GXutil.str( AV56SalEnvAT, 1, 0));
      AV57HashIN = (String)getParm(obj,8,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57HashIN", AV57HashIN);
      AV58okIN = ((Boolean) getParm(obj,9,TypeConstants.BOOLEAN)).booleanValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58okIN", AV58okIN);
      AV59Messages_jsonIN = (String)getParm(obj,10,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59Messages_jsonIN", AV59Messages_jsonIN);
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
      pa29L2( ) ;
      ws29L2( ) ;
      we29L2( ) ;
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
      sCtrlAV46emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV47SalExtAlb = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV51SalExtFec = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV52SalFhh = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV53Mancod = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV54ManNom = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV55SalCodeID = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV56SalEnvAT = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV57HashIN = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV58okIN = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV59Messages_jsonIN = (String)getParm(obj,10,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa29L2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "trabajoexterno_detail__wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa29L2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV46emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46emprcod", AV46emprcod);
         AV47SalExtAlb = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47SalExtAlb), 8, 0));
         AV51SalExtFec = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51SalExtFec", localUtil.format(AV51SalExtFec, "99/99/99"));
         AV52SalFhh = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52SalFhh", localUtil.ttoc( AV52SalFhh, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV53Mancod = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53Mancod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53Mancod), 4, 0));
         AV54ManNom = (String)getParm(obj,7,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54ManNom", AV54ManNom);
         AV55SalCodeID = (String)getParm(obj,8,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55SalCodeID", AV55SalCodeID);
         AV56SalEnvAT = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56SalEnvAT", GXutil.str( AV56SalEnvAT, 1, 0));
         AV57HashIN = (String)getParm(obj,10,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57HashIN", AV57HashIN);
         AV58okIN = ((Boolean) getParm(obj,11,TypeConstants.BOOLEAN)).booleanValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58okIN", AV58okIN);
         AV59Messages_jsonIN = (String)getParm(obj,12,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59Messages_jsonIN", AV59Messages_jsonIN);
      }
      wcpOAV46emprcod = httpContext.cgiGet( sPrefix+"wcpOAV46emprcod") ;
      wcpOAV47SalExtAlb = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV47SalExtAlb"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV51SalExtFec = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV51SalExtFec"), 0) ;
      wcpOAV52SalFhh = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV52SalFhh"), 0) ;
      wcpOAV53Mancod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV53Mancod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV54ManNom = httpContext.cgiGet( sPrefix+"wcpOAV54ManNom") ;
      wcpOAV55SalCodeID = httpContext.cgiGet( sPrefix+"wcpOAV55SalCodeID") ;
      wcpOAV56SalEnvAT = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV56SalEnvAT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV57HashIN = httpContext.cgiGet( sPrefix+"wcpOAV57HashIN") ;
      wcpOAV58okIN = GXutil.strtobool( httpContext.cgiGet( sPrefix+"wcpOAV58okIN")) ;
      wcpOAV59Messages_jsonIN = httpContext.cgiGet( sPrefix+"wcpOAV59Messages_jsonIN") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV46emprcod, wcpOAV46emprcod) != 0 ) || ( AV47SalExtAlb != wcpOAV47SalExtAlb ) || !( GXutil.dateCompare(GXutil.resetTime(AV51SalExtFec), GXutil.resetTime(wcpOAV51SalExtFec)) ) || !( GXutil.dateCompare(AV52SalFhh, wcpOAV52SalFhh) ) || ( AV53Mancod != wcpOAV53Mancod ) || ( GXutil.strcmp(AV54ManNom, wcpOAV54ManNom) != 0 ) || ( GXutil.strcmp(AV55SalCodeID, wcpOAV55SalCodeID) != 0 ) || ( AV56SalEnvAT != wcpOAV56SalEnvAT ) || ( GXutil.strcmp(AV57HashIN, wcpOAV57HashIN) != 0 ) || ( AV58okIN != wcpOAV58okIN ) || ( GXutil.strcmp(AV59Messages_jsonIN, wcpOAV59Messages_jsonIN) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV46emprcod = AV46emprcod ;
      wcpOAV47SalExtAlb = AV47SalExtAlb ;
      wcpOAV51SalExtFec = AV51SalExtFec ;
      wcpOAV52SalFhh = AV52SalFhh ;
      wcpOAV53Mancod = AV53Mancod ;
      wcpOAV54ManNom = AV54ManNom ;
      wcpOAV55SalCodeID = AV55SalCodeID ;
      wcpOAV56SalEnvAT = AV56SalEnvAT ;
      wcpOAV57HashIN = AV57HashIN ;
      wcpOAV58okIN = AV58okIN ;
      wcpOAV59Messages_jsonIN = AV59Messages_jsonIN ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV46emprcod = httpContext.cgiGet( sPrefix+"AV46emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV46emprcod) > 0 )
      {
         AV46emprcod = httpContext.cgiGet( sCtrlAV46emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46emprcod", AV46emprcod);
      }
      else
      {
         AV46emprcod = httpContext.cgiGet( sPrefix+"AV46emprcod_PARM") ;
      }
      sCtrlAV47SalExtAlb = httpContext.cgiGet( sPrefix+"AV47SalExtAlb_CTRL") ;
      if ( GXutil.len( sCtrlAV47SalExtAlb) > 0 )
      {
         AV47SalExtAlb = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV47SalExtAlb), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47SalExtAlb), 8, 0));
      }
      else
      {
         AV47SalExtAlb = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV47SalExtAlb_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV51SalExtFec = httpContext.cgiGet( sPrefix+"AV51SalExtFec_CTRL") ;
      if ( GXutil.len( sCtrlAV51SalExtFec) > 0 )
      {
         AV51SalExtFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV51SalExtFec), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51SalExtFec", localUtil.format(AV51SalExtFec, "99/99/99"));
      }
      else
      {
         AV51SalExtFec = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV51SalExtFec_PARM"), 0) ;
      }
      sCtrlAV52SalFhh = httpContext.cgiGet( sPrefix+"AV52SalFhh_CTRL") ;
      if ( GXutil.len( sCtrlAV52SalFhh) > 0 )
      {
         AV52SalFhh = localUtil.ctot( httpContext.cgiGet( sCtrlAV52SalFhh), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52SalFhh", localUtil.ttoc( AV52SalFhh, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV52SalFhh = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV52SalFhh_PARM"), 0) ;
      }
      sCtrlAV53Mancod = httpContext.cgiGet( sPrefix+"AV53Mancod_CTRL") ;
      if ( GXutil.len( sCtrlAV53Mancod) > 0 )
      {
         AV53Mancod = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV53Mancod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53Mancod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53Mancod), 4, 0));
      }
      else
      {
         AV53Mancod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV53Mancod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV54ManNom = httpContext.cgiGet( sPrefix+"AV54ManNom_CTRL") ;
      if ( GXutil.len( sCtrlAV54ManNom) > 0 )
      {
         AV54ManNom = httpContext.cgiGet( sCtrlAV54ManNom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54ManNom", AV54ManNom);
      }
      else
      {
         AV54ManNom = httpContext.cgiGet( sPrefix+"AV54ManNom_PARM") ;
      }
      sCtrlAV55SalCodeID = httpContext.cgiGet( sPrefix+"AV55SalCodeID_CTRL") ;
      if ( GXutil.len( sCtrlAV55SalCodeID) > 0 )
      {
         AV55SalCodeID = httpContext.cgiGet( sCtrlAV55SalCodeID) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55SalCodeID", AV55SalCodeID);
      }
      else
      {
         AV55SalCodeID = httpContext.cgiGet( sPrefix+"AV55SalCodeID_PARM") ;
      }
      sCtrlAV56SalEnvAT = httpContext.cgiGet( sPrefix+"AV56SalEnvAT_CTRL") ;
      if ( GXutil.len( sCtrlAV56SalEnvAT) > 0 )
      {
         AV56SalEnvAT = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV56SalEnvAT), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56SalEnvAT", GXutil.str( AV56SalEnvAT, 1, 0));
      }
      else
      {
         AV56SalEnvAT = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV56SalEnvAT_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV57HashIN = httpContext.cgiGet( sPrefix+"AV57HashIN_CTRL") ;
      if ( GXutil.len( sCtrlAV57HashIN) > 0 )
      {
         AV57HashIN = httpContext.cgiGet( sCtrlAV57HashIN) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57HashIN", AV57HashIN);
      }
      else
      {
         AV57HashIN = httpContext.cgiGet( sPrefix+"AV57HashIN_PARM") ;
      }
      sCtrlAV58okIN = httpContext.cgiGet( sPrefix+"AV58okIN_CTRL") ;
      if ( GXutil.len( sCtrlAV58okIN) > 0 )
      {
         AV58okIN = GXutil.strtobool( httpContext.cgiGet( sCtrlAV58okIN)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58okIN", AV58okIN);
      }
      else
      {
         AV58okIN = GXutil.strtobool( httpContext.cgiGet( sPrefix+"AV58okIN_PARM")) ;
      }
      sCtrlAV59Messages_jsonIN = httpContext.cgiGet( sPrefix+"AV59Messages_jsonIN_CTRL") ;
      if ( GXutil.len( sCtrlAV59Messages_jsonIN) > 0 )
      {
         AV59Messages_jsonIN = httpContext.cgiGet( sCtrlAV59Messages_jsonIN) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59Messages_jsonIN", AV59Messages_jsonIN);
      }
      else
      {
         AV59Messages_jsonIN = httpContext.cgiGet( sPrefix+"AV59Messages_jsonIN_PARM") ;
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
      pa29L2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws29L2( ) ;
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
      ws29L2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV46emprcod_PARM", GXutil.rtrim( AV46emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV46emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV46emprcod_CTRL", GXutil.rtrim( sCtrlAV46emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV47SalExtAlb_PARM", GXutil.ltrim( localUtil.ntoc( AV47SalExtAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV47SalExtAlb)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV47SalExtAlb_CTRL", GXutil.rtrim( sCtrlAV47SalExtAlb));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV51SalExtFec_PARM", localUtil.dtoc( AV51SalExtFec, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV51SalExtFec)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV51SalExtFec_CTRL", GXutil.rtrim( sCtrlAV51SalExtFec));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV52SalFhh_PARM", localUtil.ttoc( AV52SalFhh, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV52SalFhh)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV52SalFhh_CTRL", GXutil.rtrim( sCtrlAV52SalFhh));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV53Mancod_PARM", GXutil.ltrim( localUtil.ntoc( AV53Mancod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV53Mancod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV53Mancod_CTRL", GXutil.rtrim( sCtrlAV53Mancod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV54ManNom_PARM", GXutil.rtrim( AV54ManNom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV54ManNom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV54ManNom_CTRL", GXutil.rtrim( sCtrlAV54ManNom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV55SalCodeID_PARM", GXutil.rtrim( AV55SalCodeID));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV55SalCodeID)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV55SalCodeID_CTRL", GXutil.rtrim( sCtrlAV55SalCodeID));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV56SalEnvAT_PARM", GXutil.ltrim( localUtil.ntoc( AV56SalEnvAT, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV56SalEnvAT)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV56SalEnvAT_CTRL", GXutil.rtrim( sCtrlAV56SalEnvAT));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV57HashIN_PARM", AV57HashIN);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV57HashIN)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV57HashIN_CTRL", GXutil.rtrim( sCtrlAV57HashIN));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV58okIN_PARM", GXutil.booltostr( AV58okIN));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV58okIN)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV58okIN_CTRL", GXutil.rtrim( sCtrlAV58okIN));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV59Messages_jsonIN_PARM", AV59Messages_jsonIN);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV59Messages_jsonIN)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV59Messages_jsonIN_CTRL", GXutil.rtrim( sCtrlAV59Messages_jsonIN));
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
      we29L2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115551344", true, true);
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
      httpContext.AddJavascriptSource("trabajoexterno_detail__wc.js", "?202682115551344", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_172( )
   {
      cmbavGridactions.setInternalname( sPrefix+"vGRIDACTIONS_"+sGXsfl_17_idx );
      edtSalExNln_Internalname = sPrefix+"SALEXNLN_"+sGXsfl_17_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_17_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_17_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_17_idx ;
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_17_idx ;
      edtBarSer_Internalname = sPrefix+"BARSER_"+sGXsfl_17_idx ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM_"+sGXsfl_17_idx ;
      edtBarNomCli_Internalname = sPrefix+"BARNOMCLI_"+sGXsfl_17_idx ;
      edtFasCodn_Internalname = sPrefix+"FASCODN_"+sGXsfl_17_idx ;
      edtavFasdsc_Internalname = sPrefix+"vFASDSC_"+sGXsfl_17_idx ;
      edtOrdLin_Internalname = sPrefix+"ORDLIN_"+sGXsfl_17_idx ;
      edtSalExCoE_Internalname = sPrefix+"SALEXCOE_"+sGXsfl_17_idx ;
      edtSalExKgE_Internalname = sPrefix+"SALEXKGE_"+sGXsfl_17_idx ;
      edtSalExMtE_Internalname = sPrefix+"SALEXMTE_"+sGXsfl_17_idx ;
      edtSalExObs_Internalname = sPrefix+"SALEXOBS_"+sGXsfl_17_idx ;
      edtBarExt_Internalname = sPrefix+"BAREXT_"+sGXsfl_17_idx ;
   }

   public void subsflControlProps_fel_172( )
   {
      cmbavGridactions.setInternalname( sPrefix+"vGRIDACTIONS_"+sGXsfl_17_fel_idx );
      edtSalExNln_Internalname = sPrefix+"SALEXNLN_"+sGXsfl_17_fel_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_17_fel_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_17_fel_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_17_fel_idx ;
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_17_fel_idx ;
      edtBarSer_Internalname = sPrefix+"BARSER_"+sGXsfl_17_fel_idx ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM_"+sGXsfl_17_fel_idx ;
      edtBarNomCli_Internalname = sPrefix+"BARNOMCLI_"+sGXsfl_17_fel_idx ;
      edtFasCodn_Internalname = sPrefix+"FASCODN_"+sGXsfl_17_fel_idx ;
      edtavFasdsc_Internalname = sPrefix+"vFASDSC_"+sGXsfl_17_fel_idx ;
      edtOrdLin_Internalname = sPrefix+"ORDLIN_"+sGXsfl_17_fel_idx ;
      edtSalExCoE_Internalname = sPrefix+"SALEXCOE_"+sGXsfl_17_fel_idx ;
      edtSalExKgE_Internalname = sPrefix+"SALEXKGE_"+sGXsfl_17_fel_idx ;
      edtSalExMtE_Internalname = sPrefix+"SALEXMTE_"+sGXsfl_17_fel_idx ;
      edtSalExObs_Internalname = sPrefix+"SALEXOBS_"+sGXsfl_17_fel_idx ;
      edtBarExt_Internalname = sPrefix+"BAREXT_"+sGXsfl_17_fel_idx ;
   }

   public void sendrow_172( )
   {
      subsflControlProps_172( ) ;
      wb29L0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_17_idx - GRID_nFirstRecordOnPage <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_17_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_17_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 18,'"+sPrefix+"',false,'"+sGXsfl_17_idx+"',17)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_17_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV45GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV45GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV45GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EVGRIDACTIONS.CLICK."+sGXsfl_17_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,18);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV45GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_17_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSalExNln_Internalname,GXutil.ltrim( localUtil.ntoc( A6248SalExNln, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6248SalExNln), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtSalExNln_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSer_Internalname,GXutil.rtrim( A212BarSer),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNom_Internalname,GXutil.rtrim( A135BarColNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNomCli_Internalname,GXutil.rtrim( A1234BarNomCli),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNomCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCodn_Internalname,GXutil.rtrim( A6558FasCodn),GXutil.rtrim( localUtil.format( A6558FasCodn, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFasCodn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavFasdsc_Enabled!=0)&&(edtavFasdsc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 28,'"+sPrefix+"',false,'"+sGXsfl_17_idx+"',17)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFasdsc_Internalname,GXutil.rtrim( AV14FasDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavFasdsc_Enabled!=0)&&(edtavFasdsc_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,28);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavFasdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavFasdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOrdLin_Internalname,GXutil.ltrim( localUtil.ntoc( A654OrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A654OrdLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtOrdLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSalExCoE_Internalname,GXutil.ltrim( localUtil.ntoc( A6257SalExCoE, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6257SalExCoE), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtSalExCoE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSalExKgE_Internalname,GXutil.ltrim( localUtil.ntoc( A6256SalExKgE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A6256SalExKgE, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtSalExKgE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSalExMtE_Internalname,GXutil.ltrim( localUtil.ntoc( A6258SalExMtE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A6258SalExMtE, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtSalExMtE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSalExObs_Internalname,GXutil.rtrim( A6249SalExObs),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtSalExObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarExt_Internalname,GXutil.ltrim( localUtil.ntoc( A2265BarExt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2265BarExt), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarExt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes29L2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_17_idx = ((subGrid_Islastpage==1)&&(nGXsfl_17_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_17_idx+1) ;
         sGXsfl_17_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_17_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_172( ) ;
      }
      /* End function sendrow_172 */
   }

   public void startgridcontrol17( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"17\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Cli.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Orden", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "KIlos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Observaciones", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Control HDR,1=sal/2=env", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV45GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6248SalExNln, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A130BarCodPar));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A212BarSer));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A135BarColNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1234BarNomCli));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A6558FasCodn));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV14FasDsc));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFasdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A654OrdLin, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6257SalExCoE, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6256SalExKgE, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6258SalExMtE, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A6249SalExObs));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2265BarExt, (byte)(1), (byte)(0), ".", "")));
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
      lblTbmessage_Internalname = sPrefix+"TBMESSAGE" ;
      cmbavGridactions.setInternalname( sPrefix+"vGRIDACTIONS" );
      edtSalExNln_Internalname = sPrefix+"SALEXNLN" ;
      edtBarCod_Internalname = sPrefix+"BARCOD" ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO" ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR" ;
      edtCliCod_Internalname = sPrefix+"CLICOD" ;
      edtBarSer_Internalname = sPrefix+"BARSER" ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM" ;
      edtBarNomCli_Internalname = sPrefix+"BARNOMCLI" ;
      edtFasCodn_Internalname = sPrefix+"FASCODN" ;
      edtavFasdsc_Internalname = sPrefix+"vFASDSC" ;
      edtOrdLin_Internalname = sPrefix+"ORDLIN" ;
      edtSalExCoE_Internalname = sPrefix+"SALEXCOE" ;
      edtSalExKgE_Internalname = sPrefix+"SALEXKGE" ;
      edtSalExMtE_Internalname = sPrefix+"SALEXMTE" ;
      edtSalExObs_Internalname = sPrefix+"SALEXOBS" ;
      edtBarExt_Internalname = sPrefix+"BAREXT" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Dvelop_confirmpanel_eliminarlinea_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA" ;
      tblTabledvelop_confirmpanel_eliminarlinea_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_ELIMINARLINEA" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      divHtml_bottomauxiliarcontrols_Internalname = sPrefix+"HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = sPrefix+"LAYOUTMAINTABLE" ;
      Form.setInternalname( sPrefix+"FORM" );
      subGrid_Internalname = sPrefix+"GRID" ;
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
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      subGrid_Header = "" ;
      edtBarExt_Jsonclick = "" ;
      edtSalExObs_Jsonclick = "" ;
      edtSalExMtE_Jsonclick = "" ;
      edtSalExKgE_Jsonclick = "" ;
      edtSalExCoE_Jsonclick = "" ;
      edtOrdLin_Jsonclick = "" ;
      edtavFasdsc_Jsonclick = "" ;
      edtavFasdsc_Visible = -1 ;
      edtavFasdsc_Enabled = 1 ;
      edtFasCodn_Jsonclick = "" ;
      edtBarNomCli_Jsonclick = "" ;
      edtBarColNom_Jsonclick = "" ;
      edtBarSer_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtSalExNln_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      lblTbmessage_Caption = "  " ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Infinitescrolling = "Form" ;
      Dvelop_confirmpanel_eliminarlinea_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminarlinea_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminarlinea_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminarlinea_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminarlinea_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminarlinea_Confirmationtext = "¿Desea eliminar la Linea?" ;
      Dvelop_confirmpanel_eliminarlinea_Title = "" ;
      Ddo_grid_Datalistproc = "TrabajoExterno_Detail__WCGetFilterData" ;
      Ddo_grid_Datalisttype = "|||Dynamic||Dynamic|Dynamic|Dynamic|Dynamic|||||Dynamic" ;
      Ddo_grid_Includedatalist = "|||T||T|T|T|T|||||T" ;
      Ddo_grid_Filterisrange = "T|T|T||T|||||T|T|T|T|" ;
      Ddo_grid_Filtertype = "Numeric|Numeric|Numeric|Character|Numeric|Character|Character|Character|Character|Numeric|Numeric|Numeric|Numeric|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7|8|9|10|11|12|13|14|15" ;
      Ddo_grid_Columnids = "1:SalExNln|2:BarCod|3:BarCodReo|4:BarCodPar|5:CliCod|6:BarSer|7:BarColNom|8:BarNomCli|9:FasCodn|11:OrdLin|12:SalExCoE|13:SalExKgE|14:SalExMtE|15:SalExObs" ;
      Ddo_grid_Gridinternalname = "" ;
      subGrid_Rows = 50 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
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
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_17_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A6558FasCodn',fld:'FASCODN',pic:'@!'},{av:'sPrefix'},{av:'AV16TFSalExNln',fld:'vTFSALEXNLN',pic:'ZZZ9'},{av:'AV17TFSalExNln_To',fld:'vTFSALEXNLN_TO',pic:'ZZZ9'},{av:'AV18TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV19TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV20TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV21TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV22TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV23TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV24TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV25TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV26TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV27TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV28TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV29TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV30TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV31TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV32TFFasCodn',fld:'vTFFASCODN',pic:'@!'},{av:'AV33TFFasCodn_Sel',fld:'vTFFASCODN_SEL',pic:'@!'},{av:'AV34TFOrdLin',fld:'vTFORDLIN',pic:'ZZZ9'},{av:'AV35TFOrdLin_To',fld:'vTFORDLIN_TO',pic:'ZZZ9'},{av:'AV36TFSalExCoE',fld:'vTFSALEXCOE',pic:'ZZZZZ9'},{av:'AV37TFSalExCoE_To',fld:'vTFSALEXCOE_TO',pic:'ZZZZZ9'},{av:'AV38TFSalExKgE',fld:'vTFSALEXKGE',pic:'ZZZZZ9.99'},{av:'AV39TFSalExKgE_To',fld:'vTFSALEXKGE_TO',pic:'ZZZZZ9.99'},{av:'AV40TFSalExMtE',fld:'vTFSALEXMTE',pic:'ZZZZZ9.99'},{av:'AV41TFSalExMtE_To',fld:'vTFSALEXMTE_TO',pic:'ZZZZZ9.99'},{av:'AV42TFSalExObs',fld:'vTFSALEXOBS',pic:''},{av:'AV43TFSalExObs_Sel',fld:'vTFSALEXOBS_SEL',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV46emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV47SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV51SalExtFec',fld:'vSALEXTFEC',pic:''},{av:'AV52SalFhh',fld:'vSALFHH',pic:'99/99/99 99:99'},{av:'AV53Mancod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV54ManNom',fld:'vMANNOM',pic:''},{av:'AV55SalCodeID',fld:'vSALCODEID',pic:''},{av:'AV56SalEnvAT',fld:'vSALENVAT',pic:'9'},{av:'AV57HashIN',fld:'vHASHIN',pic:''},{av:'AV58okIN',fld:'vOKIN',pic:''},{av:'AV59Messages_jsonIN',fld:'vMESSAGES_JSONIN',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9',hsh:true},{av:'AV63Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1129L2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV46emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV47SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV16TFSalExNln',fld:'vTFSALEXNLN',pic:'ZZZ9'},{av:'AV17TFSalExNln_To',fld:'vTFSALEXNLN_TO',pic:'ZZZ9'},{av:'AV18TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV19TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV20TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV21TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV22TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV23TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV24TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV25TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV26TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV27TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV28TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV29TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV30TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV31TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV32TFFasCodn',fld:'vTFFASCODN',pic:'@!'},{av:'AV33TFFasCodn_Sel',fld:'vTFFASCODN_SEL',pic:'@!'},{av:'AV34TFOrdLin',fld:'vTFORDLIN',pic:'ZZZ9'},{av:'AV35TFOrdLin_To',fld:'vTFORDLIN_TO',pic:'ZZZ9'},{av:'AV36TFSalExCoE',fld:'vTFSALEXCOE',pic:'ZZZZZ9'},{av:'AV37TFSalExCoE_To',fld:'vTFSALEXCOE_TO',pic:'ZZZZZ9'},{av:'AV38TFSalExKgE',fld:'vTFSALEXKGE',pic:'ZZZZZ9.99'},{av:'AV39TFSalExKgE_To',fld:'vTFSALEXKGE_TO',pic:'ZZZZZ9.99'},{av:'AV40TFSalExMtE',fld:'vTFSALEXMTE',pic:'ZZZZZ9.99'},{av:'AV41TFSalExMtE_To',fld:'vTFSALEXMTE_TO',pic:'ZZZZZ9.99'},{av:'AV42TFSalExObs',fld:'vTFSALEXOBS',pic:''},{av:'AV43TFSalExObs_Sel',fld:'vTFSALEXOBS_SEL',pic:''},{av:'AV63Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV51SalExtFec',fld:'vSALEXTFEC',pic:''},{av:'AV52SalFhh',fld:'vSALFHH',pic:'99/99/99 99:99'},{av:'AV53Mancod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV54ManNom',fld:'vMANNOM',pic:''},{av:'AV55SalCodeID',fld:'vSALCODEID',pic:''},{av:'AV56SalEnvAT',fld:'vSALENVAT',pic:'9'},{av:'AV57HashIN',fld:'vHASHIN',pic:''},{av:'AV58okIN',fld:'vOKIN',pic:''},{av:'AV59Messages_jsonIN',fld:'vMESSAGES_JSONIN',pic:''},{av:'A6558FasCodn',fld:'FASCODN',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV42TFSalExObs',fld:'vTFSALEXOBS',pic:''},{av:'AV43TFSalExObs_Sel',fld:'vTFSALEXOBS_SEL',pic:''},{av:'AV40TFSalExMtE',fld:'vTFSALEXMTE',pic:'ZZZZZ9.99'},{av:'AV41TFSalExMtE_To',fld:'vTFSALEXMTE_TO',pic:'ZZZZZ9.99'},{av:'AV38TFSalExKgE',fld:'vTFSALEXKGE',pic:'ZZZZZ9.99'},{av:'AV39TFSalExKgE_To',fld:'vTFSALEXKGE_TO',pic:'ZZZZZ9.99'},{av:'AV36TFSalExCoE',fld:'vTFSALEXCOE',pic:'ZZZZZ9'},{av:'AV37TFSalExCoE_To',fld:'vTFSALEXCOE_TO',pic:'ZZZZZ9'},{av:'AV34TFOrdLin',fld:'vTFORDLIN',pic:'ZZZ9'},{av:'AV35TFOrdLin_To',fld:'vTFORDLIN_TO',pic:'ZZZ9'},{av:'AV32TFFasCodn',fld:'vTFFASCODN',pic:'@!'},{av:'AV33TFFasCodn_Sel',fld:'vTFFASCODN_SEL',pic:'@!'},{av:'AV30TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV31TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV28TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV29TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV26TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV27TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV24TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV25TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV22TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV23TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV20TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV21TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV18TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV19TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV16TFSalExNln',fld:'vTFSALEXNLN',pic:'ZZZ9'},{av:'AV17TFSalExNln_To',fld:'vTFSALEXNLN_TO',pic:'ZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e1529L2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A6558FasCodn',fld:'FASCODN',pic:'@!'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV45GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'AV14FasDsc',fld:'vFASDSC',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e1629L2',iparms:[{av:'cmbavGridactions'},{av:'AV45GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV46emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV47SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV16TFSalExNln',fld:'vTFSALEXNLN',pic:'ZZZ9'},{av:'AV17TFSalExNln_To',fld:'vTFSALEXNLN_TO',pic:'ZZZ9'},{av:'AV18TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV19TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV20TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV21TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV22TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV23TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV24TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV25TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV26TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV27TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV28TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV29TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV30TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV31TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV32TFFasCodn',fld:'vTFFASCODN',pic:'@!'},{av:'AV33TFFasCodn_Sel',fld:'vTFFASCODN_SEL',pic:'@!'},{av:'AV34TFOrdLin',fld:'vTFORDLIN',pic:'ZZZ9'},{av:'AV35TFOrdLin_To',fld:'vTFORDLIN_TO',pic:'ZZZ9'},{av:'AV36TFSalExCoE',fld:'vTFSALEXCOE',pic:'ZZZZZ9'},{av:'AV37TFSalExCoE_To',fld:'vTFSALEXCOE_TO',pic:'ZZZZZ9'},{av:'AV38TFSalExKgE',fld:'vTFSALEXKGE',pic:'ZZZZZ9.99'},{av:'AV39TFSalExKgE_To',fld:'vTFSALEXKGE_TO',pic:'ZZZZZ9.99'},{av:'AV40TFSalExMtE',fld:'vTFSALEXMTE',pic:'ZZZZZ9.99'},{av:'AV41TFSalExMtE_To',fld:'vTFSALEXMTE_TO',pic:'ZZZZZ9.99'},{av:'AV42TFSalExObs',fld:'vTFSALEXOBS',pic:''},{av:'AV43TFSalExObs_Sel',fld:'vTFSALEXOBS_SEL',pic:''},{av:'AV63Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV51SalExtFec',fld:'vSALEXTFEC',pic:''},{av:'AV52SalFhh',fld:'vSALFHH',pic:'99/99/99 99:99'},{av:'AV53Mancod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV54ManNom',fld:'vMANNOM',pic:''},{av:'AV55SalCodeID',fld:'vSALCODEID',pic:''},{av:'AV56SalEnvAT',fld:'vSALENVAT',pic:'9'},{av:'AV57HashIN',fld:'vHASHIN',pic:''},{av:'AV58okIN',fld:'vOKIN',pic:''},{av:'AV59Messages_jsonIN',fld:'vMESSAGES_JSONIN',pic:''},{av:'A6558FasCodn',fld:'FASCODN',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'A2265BarExt',fld:'BAREXT',pic:'9',hsh:true},{av:'A6248SalExNln',fld:'SALEXNLN',pic:'ZZZ9'}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV45GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'A6248SalExNln',fld:'SALEXNLN',pic:'ZZZ9'},{av:'AV47SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV46emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARLINEA.CLOSE","{handler:'e1229L2',iparms:[{av:'Dvelop_confirmpanel_eliminarlinea_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINARLINEA',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV46emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV47SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV16TFSalExNln',fld:'vTFSALEXNLN',pic:'ZZZ9'},{av:'AV17TFSalExNln_To',fld:'vTFSALEXNLN_TO',pic:'ZZZ9'},{av:'AV18TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV19TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV20TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV21TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV22TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV23TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV24TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV25TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV26TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV27TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV28TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV29TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV30TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV31TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV32TFFasCodn',fld:'vTFFASCODN',pic:'@!'},{av:'AV33TFFasCodn_Sel',fld:'vTFFASCODN_SEL',pic:'@!'},{av:'AV34TFOrdLin',fld:'vTFORDLIN',pic:'ZZZ9'},{av:'AV35TFOrdLin_To',fld:'vTFORDLIN_TO',pic:'ZZZ9'},{av:'AV36TFSalExCoE',fld:'vTFSALEXCOE',pic:'ZZZZZ9'},{av:'AV37TFSalExCoE_To',fld:'vTFSALEXCOE_TO',pic:'ZZZZZ9'},{av:'AV38TFSalExKgE',fld:'vTFSALEXKGE',pic:'ZZZZZ9.99'},{av:'AV39TFSalExKgE_To',fld:'vTFSALEXKGE_TO',pic:'ZZZZZ9.99'},{av:'AV40TFSalExMtE',fld:'vTFSALEXMTE',pic:'ZZZZZ9.99'},{av:'AV41TFSalExMtE_To',fld:'vTFSALEXMTE_TO',pic:'ZZZZZ9.99'},{av:'AV42TFSalExObs',fld:'vTFSALEXOBS',pic:''},{av:'AV43TFSalExObs_Sel',fld:'vTFSALEXOBS_SEL',pic:''},{av:'AV63Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV51SalExtFec',fld:'vSALEXTFEC',pic:''},{av:'AV52SalFhh',fld:'vSALFHH',pic:'99/99/99 99:99'},{av:'AV53Mancod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV54ManNom',fld:'vMANNOM',pic:''},{av:'AV55SalCodeID',fld:'vSALCODEID',pic:''},{av:'AV56SalEnvAT',fld:'vSALENVAT',pic:'9'},{av:'AV57HashIN',fld:'vHASHIN',pic:''},{av:'AV58okIN',fld:'vOKIN',pic:''},{av:'AV59Messages_jsonIN',fld:'vMESSAGES_JSONIN',pic:''},{av:'A6558FasCodn',fld:'FASCODN',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A6248SalExNln',fld:'SALEXNLN',pic:'ZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARLINEA.CLOSE",",oparms:[{av:'A6248SalExNln',fld:'SALEXNLN',pic:'ZZZ9'},{av:'AV47SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV51SalExtFec',fld:'vSALEXTFEC',pic:''},{av:'A6558FasCodn',fld:'FASCODN',pic:'@!'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV46emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV53Mancod',fld:'vMANCOD',pic:'ZZZ9'}]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A6558FasCodn',fld:'FASCODN',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'AV16TFSalExNln',fld:'vTFSALEXNLN',pic:'ZZZ9'},{av:'AV17TFSalExNln_To',fld:'vTFSALEXNLN_TO',pic:'ZZZ9'},{av:'AV18TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV19TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV20TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV21TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV22TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV23TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV24TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV25TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV26TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV27TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV28TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV29TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV30TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV31TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV32TFFasCodn',fld:'vTFFASCODN',pic:'@!'},{av:'AV33TFFasCodn_Sel',fld:'vTFFASCODN_SEL',pic:'@!'},{av:'AV34TFOrdLin',fld:'vTFORDLIN',pic:'ZZZ9'},{av:'AV35TFOrdLin_To',fld:'vTFORDLIN_TO',pic:'ZZZ9'},{av:'AV36TFSalExCoE',fld:'vTFSALEXCOE',pic:'ZZZZZ9'},{av:'AV37TFSalExCoE_To',fld:'vTFSALEXCOE_TO',pic:'ZZZZZ9'},{av:'AV38TFSalExKgE',fld:'vTFSALEXKGE',pic:'ZZZZZ9.99'},{av:'AV39TFSalExKgE_To',fld:'vTFSALEXKGE_TO',pic:'ZZZZZ9.99'},{av:'AV40TFSalExMtE',fld:'vTFSALEXMTE',pic:'ZZZZZ9.99'},{av:'AV41TFSalExMtE_To',fld:'vTFSALEXMTE_TO',pic:'ZZZZZ9.99'},{av:'AV42TFSalExObs',fld:'vTFSALEXOBS',pic:''},{av:'AV43TFSalExObs_Sel',fld:'vTFSALEXOBS_SEL',pic:''},{av:'AV63Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV46emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV47SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV51SalExtFec',fld:'vSALEXTFEC',pic:''},{av:'AV52SalFhh',fld:'vSALFHH',pic:'99/99/99 99:99'},{av:'AV53Mancod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV54ManNom',fld:'vMANNOM',pic:''},{av:'AV55SalCodeID',fld:'vSALCODEID',pic:''},{av:'AV56SalEnvAT',fld:'vSALENVAT',pic:'9'},{av:'AV57HashIN',fld:'vHASHIN',pic:''},{av:'AV58okIN',fld:'vOKIN',pic:''},{av:'AV59Messages_jsonIN',fld:'vMESSAGES_JSONIN',pic:''}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A6558FasCodn',fld:'FASCODN',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'AV16TFSalExNln',fld:'vTFSALEXNLN',pic:'ZZZ9'},{av:'AV17TFSalExNln_To',fld:'vTFSALEXNLN_TO',pic:'ZZZ9'},{av:'AV18TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV19TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV20TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV21TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV22TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV23TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV24TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV25TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV26TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV27TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV28TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV29TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV30TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV31TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV32TFFasCodn',fld:'vTFFASCODN',pic:'@!'},{av:'AV33TFFasCodn_Sel',fld:'vTFFASCODN_SEL',pic:'@!'},{av:'AV34TFOrdLin',fld:'vTFORDLIN',pic:'ZZZ9'},{av:'AV35TFOrdLin_To',fld:'vTFORDLIN_TO',pic:'ZZZ9'},{av:'AV36TFSalExCoE',fld:'vTFSALEXCOE',pic:'ZZZZZ9'},{av:'AV37TFSalExCoE_To',fld:'vTFSALEXCOE_TO',pic:'ZZZZZ9'},{av:'AV38TFSalExKgE',fld:'vTFSALEXKGE',pic:'ZZZZZ9.99'},{av:'AV39TFSalExKgE_To',fld:'vTFSALEXKGE_TO',pic:'ZZZZZ9.99'},{av:'AV40TFSalExMtE',fld:'vTFSALEXMTE',pic:'ZZZZZ9.99'},{av:'AV41TFSalExMtE_To',fld:'vTFSALEXMTE_TO',pic:'ZZZZZ9.99'},{av:'AV42TFSalExObs',fld:'vTFSALEXOBS',pic:''},{av:'AV43TFSalExObs_Sel',fld:'vTFSALEXOBS_SEL',pic:''},{av:'AV63Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV46emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV47SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV51SalExtFec',fld:'vSALEXTFEC',pic:''},{av:'AV52SalFhh',fld:'vSALFHH',pic:'99/99/99 99:99'},{av:'AV53Mancod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV54ManNom',fld:'vMANNOM',pic:''},{av:'AV55SalCodeID',fld:'vSALCODEID',pic:''},{av:'AV56SalEnvAT',fld:'vSALENVAT',pic:'9'},{av:'AV57HashIN',fld:'vHASHIN',pic:''},{av:'AV58okIN',fld:'vOKIN',pic:''},{av:'AV59Messages_jsonIN',fld:'vMESSAGES_JSONIN',pic:''}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A6558FasCodn',fld:'FASCODN',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'AV16TFSalExNln',fld:'vTFSALEXNLN',pic:'ZZZ9'},{av:'AV17TFSalExNln_To',fld:'vTFSALEXNLN_TO',pic:'ZZZ9'},{av:'AV18TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV19TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV20TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV21TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV22TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV23TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV24TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV25TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV26TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV27TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV28TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV29TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV30TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV31TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV32TFFasCodn',fld:'vTFFASCODN',pic:'@!'},{av:'AV33TFFasCodn_Sel',fld:'vTFFASCODN_SEL',pic:'@!'},{av:'AV34TFOrdLin',fld:'vTFORDLIN',pic:'ZZZ9'},{av:'AV35TFOrdLin_To',fld:'vTFORDLIN_TO',pic:'ZZZ9'},{av:'AV36TFSalExCoE',fld:'vTFSALEXCOE',pic:'ZZZZZ9'},{av:'AV37TFSalExCoE_To',fld:'vTFSALEXCOE_TO',pic:'ZZZZZ9'},{av:'AV38TFSalExKgE',fld:'vTFSALEXKGE',pic:'ZZZZZ9.99'},{av:'AV39TFSalExKgE_To',fld:'vTFSALEXKGE_TO',pic:'ZZZZZ9.99'},{av:'AV40TFSalExMtE',fld:'vTFSALEXMTE',pic:'ZZZZZ9.99'},{av:'AV41TFSalExMtE_To',fld:'vTFSALEXMTE_TO',pic:'ZZZZZ9.99'},{av:'AV42TFSalExObs',fld:'vTFSALEXOBS',pic:''},{av:'AV43TFSalExObs_Sel',fld:'vTFSALEXOBS_SEL',pic:''},{av:'AV63Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV46emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV47SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV51SalExtFec',fld:'vSALEXTFEC',pic:''},{av:'AV52SalFhh',fld:'vSALFHH',pic:'99/99/99 99:99'},{av:'AV53Mancod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV54ManNom',fld:'vMANNOM',pic:''},{av:'AV55SalCodeID',fld:'vSALCODEID',pic:''},{av:'AV56SalEnvAT',fld:'vSALENVAT',pic:'9'},{av:'AV57HashIN',fld:'vHASHIN',pic:''},{av:'AV58okIN',fld:'vOKIN',pic:''},{av:'AV59Messages_jsonIN',fld:'vMESSAGES_JSONIN',pic:''}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A6558FasCodn',fld:'FASCODN',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'AV16TFSalExNln',fld:'vTFSALEXNLN',pic:'ZZZ9'},{av:'AV17TFSalExNln_To',fld:'vTFSALEXNLN_TO',pic:'ZZZ9'},{av:'AV18TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV19TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV20TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV21TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV22TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV23TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV24TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV25TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV26TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV27TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV28TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV29TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV30TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV31TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV32TFFasCodn',fld:'vTFFASCODN',pic:'@!'},{av:'AV33TFFasCodn_Sel',fld:'vTFFASCODN_SEL',pic:'@!'},{av:'AV34TFOrdLin',fld:'vTFORDLIN',pic:'ZZZ9'},{av:'AV35TFOrdLin_To',fld:'vTFORDLIN_TO',pic:'ZZZ9'},{av:'AV36TFSalExCoE',fld:'vTFSALEXCOE',pic:'ZZZZZ9'},{av:'AV37TFSalExCoE_To',fld:'vTFSALEXCOE_TO',pic:'ZZZZZ9'},{av:'AV38TFSalExKgE',fld:'vTFSALEXKGE',pic:'ZZZZZ9.99'},{av:'AV39TFSalExKgE_To',fld:'vTFSALEXKGE_TO',pic:'ZZZZZ9.99'},{av:'AV40TFSalExMtE',fld:'vTFSALEXMTE',pic:'ZZZZZ9.99'},{av:'AV41TFSalExMtE_To',fld:'vTFSALEXMTE_TO',pic:'ZZZZZ9.99'},{av:'AV42TFSalExObs',fld:'vTFSALEXOBS',pic:''},{av:'AV43TFSalExObs_Sel',fld:'vTFSALEXOBS_SEL',pic:''},{av:'AV63Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV46emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV47SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV51SalExtFec',fld:'vSALEXTFEC',pic:''},{av:'AV52SalFhh',fld:'vSALFHH',pic:'99/99/99 99:99'},{av:'AV53Mancod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV54ManNom',fld:'vMANNOM',pic:''},{av:'AV55SalCodeID',fld:'vSALCODEID',pic:''},{av:'AV56SalEnvAT',fld:'vSALENVAT',pic:'9'},{av:'AV57HashIN',fld:'vHASHIN',pic:''},{av:'AV58okIN',fld:'vOKIN',pic:''},{av:'AV59Messages_jsonIN',fld:'vMESSAGES_JSONIN',pic:''}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Barext',iparms:[]");
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
      wcpOAV46emprcod = "" ;
      wcpOAV51SalExtFec = GXutil.nullDate() ;
      wcpOAV52SalFhh = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV54ManNom = "" ;
      wcpOAV55SalCodeID = "" ;
      wcpOAV57HashIN = "" ;
      wcpOAV59Messages_jsonIN = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Dvelop_confirmpanel_eliminarlinea_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV46emprcod = "" ;
      AV51SalExtFec = GXutil.nullDate() ;
      AV52SalFhh = GXutil.resetTime( GXutil.nullDate() );
      AV54ManNom = "" ;
      AV55SalCodeID = "" ;
      AV57HashIN = "" ;
      AV59Messages_jsonIN = "" ;
      AV22TFBarCodPar = "" ;
      AV23TFBarCodPar_Sel = "" ;
      AV26TFBarSer = "" ;
      AV27TFBarSer_Sel = "" ;
      AV28TFBarColNom = "" ;
      AV29TFBarColNom_Sel = "" ;
      AV30TFBarNomCli = "" ;
      AV31TFBarNomCli_Sel = "" ;
      AV32TFFasCodn = "" ;
      AV33TFFasCodn_Sel = "" ;
      AV38TFSalExKgE = DecimalUtil.ZERO ;
      AV39TFSalExKgE_To = DecimalUtil.ZERO ;
      AV40TFSalExMtE = DecimalUtil.ZERO ;
      AV41TFSalExMtE_To = DecimalUtil.ZERO ;
      AV42TFSalExObs = "" ;
      AV43TFSalExObs_Sel = "" ;
      AV63Pgmname = "" ;
      A6558FasCodn = "" ;
      A396EmprCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV44DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblTbmessage_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV70Trabajoexterno_detail__wcds_7_tfbarcodpar = "" ;
      AV71Trabajoexterno_detail__wcds_8_tfbarcodpar_sel = "" ;
      AV74Trabajoexterno_detail__wcds_11_tfbarser = "" ;
      AV75Trabajoexterno_detail__wcds_12_tfbarser_sel = "" ;
      AV76Trabajoexterno_detail__wcds_13_tfbarcolnom = "" ;
      AV77Trabajoexterno_detail__wcds_14_tfbarcolnom_sel = "" ;
      AV78Trabajoexterno_detail__wcds_15_tfbarnomcli = "" ;
      AV79Trabajoexterno_detail__wcds_16_tfbarnomcli_sel = "" ;
      AV80Trabajoexterno_detail__wcds_17_tffascodn = "" ;
      AV81Trabajoexterno_detail__wcds_18_tffascodn_sel = "" ;
      AV86Trabajoexterno_detail__wcds_23_tfsalexkge = DecimalUtil.ZERO ;
      AV87Trabajoexterno_detail__wcds_24_tfsalexkge_to = DecimalUtil.ZERO ;
      AV88Trabajoexterno_detail__wcds_25_tfsalexmte = DecimalUtil.ZERO ;
      AV89Trabajoexterno_detail__wcds_26_tfsalexmte_to = DecimalUtil.ZERO ;
      AV90Trabajoexterno_detail__wcds_27_tfsalexobs = "" ;
      AV91Trabajoexterno_detail__wcds_28_tfsalexobs_sel = "" ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      AV14FasDsc = "" ;
      A6256SalExKgE = DecimalUtil.ZERO ;
      A6258SalExMtE = DecimalUtil.ZERO ;
      A6249SalExObs = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      H029L2_A396EmprCod = new String[] {""} ;
      H029L2_A2253SalExtAlb = new int[1] ;
      H029L3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV48Station = "" ;
      AV49EmprNom = "" ;
      AV50UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV92Emprcod_selected = "" ;
      GXv_int10 = new byte[1] ;
      GXv_date11 = new java.util.Date[1] ;
      GXv_int9 = new short[1] ;
      GXv_int13 = new int[1] ;
      GXv_int8 = new int[1] ;
      GXv_int12 = new byte[1] ;
      AV15Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char20 = "" ;
      GXv_char21 = new String[1] ;
      GXt_char18 = "" ;
      GXv_char19 = new String[1] ;
      GXt_char17 = "" ;
      GXv_char14 = new String[1] ;
      GXt_char16 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char15 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState22 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      ucDvelop_confirmpanel_eliminarlinea = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV46emprcod = "" ;
      sCtrlAV47SalExtAlb = "" ;
      sCtrlAV51SalExtFec = "" ;
      sCtrlAV52SalFhh = "" ;
      sCtrlAV53Mancod = "" ;
      sCtrlAV54ManNom = "" ;
      sCtrlAV55SalCodeID = "" ;
      sCtrlAV56SalEnvAT = "" ;
      sCtrlAV57HashIN = "" ;
      sCtrlAV58okIN = "" ;
      sCtrlAV59Messages_jsonIN = "" ;
      subGrid_Linesclass = "" ;
      TempTags = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajoexterno_detail__wc__default(),
         new Object[] {
             new Object[] {
            H029L2_A396EmprCod, H029L2_A2253SalExtAlb
            }
            , new Object[] {
            H029L3_AGRID_nRecordCount
            }
         }
      );
      AV63Pgmname = "TrabajoExterno_Detail__WC" ;
      /* GeneXus formulas. */
      AV63Pgmname = "TrabajoExterno_Detail__WC" ;
      Gx_err = (short)(0) ;
      edtavFasdsc_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV56SalEnvAT ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV56SalEnvAT ;
   private byte AV20TFBarCodReo ;
   private byte AV21TFBarCodReo_To ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte AV68Trabajoexterno_detail__wcds_5_tfbarcodreo ;
   private byte AV69Trabajoexterno_detail__wcds_6_tfbarcodreo_to ;
   private byte A132BarCodReo ;
   private byte A2265BarExt ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV60flag ;
   private byte GXv_int10[] ;
   private byte GXv_int12[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV53Mancod ;
   private short AV53Mancod ;
   private short AV16TFSalExNln ;
   private short AV17TFSalExNln_To ;
   private short AV34TFOrdLin ;
   private short AV35TFOrdLin_To ;
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV64Trabajoexterno_detail__wcds_1_tfsalexnln ;
   private short AV65Trabajoexterno_detail__wcds_2_tfsalexnln_to ;
   private short AV82Trabajoexterno_detail__wcds_19_tfordlin ;
   private short AV83Trabajoexterno_detail__wcds_20_tfordlin_to ;
   private short AV45GridActions ;
   private short A6248SalExNln ;
   private short A654OrdLin ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short GXv_int9[] ;
   private int wcpOAV47SalExtAlb ;
   private int nRC_GXsfl_17 ;
   private int AV47SalExtAlb ;
   private int subGrid_Rows ;
   private int nGXsfl_17_idx=1 ;
   private int AV18TFBarCod ;
   private int AV19TFBarCod_To ;
   private int AV24TFCliCod ;
   private int AV25TFCliCod_To ;
   private int AV36TFSalExCoE ;
   private int AV37TFSalExCoE_To ;
   private int A2253SalExtAlb ;
   private int edtavPgmname_Enabled ;
   private int AV66Trabajoexterno_detail__wcds_3_tfbarcod ;
   private int AV67Trabajoexterno_detail__wcds_4_tfbarcod_to ;
   private int AV72Trabajoexterno_detail__wcds_9_tfclicod ;
   private int AV73Trabajoexterno_detail__wcds_10_tfclicod_to ;
   private int AV84Trabajoexterno_detail__wcds_21_tfsalexcoe ;
   private int AV85Trabajoexterno_detail__wcds_22_tfsalexcoe_to ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A6257SalExCoE ;
   private int subGrid_Islastpage ;
   private int edtavFasdsc_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV93Salextalb_selected ;
   private int GXv_int13[] ;
   private int GXv_int8[] ;
   private int AV94GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavFasdsc_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV38TFSalExKgE ;
   private java.math.BigDecimal AV39TFSalExKgE_To ;
   private java.math.BigDecimal AV40TFSalExMtE ;
   private java.math.BigDecimal AV41TFSalExMtE_To ;
   private java.math.BigDecimal AV86Trabajoexterno_detail__wcds_23_tfsalexkge ;
   private java.math.BigDecimal AV87Trabajoexterno_detail__wcds_24_tfsalexkge_to ;
   private java.math.BigDecimal AV88Trabajoexterno_detail__wcds_25_tfsalexmte ;
   private java.math.BigDecimal AV89Trabajoexterno_detail__wcds_26_tfsalexmte_to ;
   private java.math.BigDecimal A6256SalExKgE ;
   private java.math.BigDecimal A6258SalExMtE ;
   private String wcpOAV46emprcod ;
   private String wcpOAV54ManNom ;
   private String wcpOAV55SalCodeID ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Dvelop_confirmpanel_eliminarlinea_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV46emprcod ;
   private String AV54ManNom ;
   private String AV55SalCodeID ;
   private String sGXsfl_17_idx="0001" ;
   private String AV22TFBarCodPar ;
   private String AV23TFBarCodPar_Sel ;
   private String AV26TFBarSer ;
   private String AV27TFBarSer_Sel ;
   private String AV28TFBarColNom ;
   private String AV29TFBarColNom_Sel ;
   private String AV30TFBarNomCli ;
   private String AV31TFBarNomCli_Sel ;
   private String AV32TFFasCodn ;
   private String AV33TFFasCodn_Sel ;
   private String AV42TFSalExObs ;
   private String AV43TFSalExObs_Sel ;
   private String AV63Pgmname ;
   private String A6558FasCodn ;
   private String A396EmprCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Ddo_grid_Caption ;
   private String Ddo_grid_Filteredtext_set ;
   private String Ddo_grid_Filteredtextto_set ;
   private String Ddo_grid_Selectedvalue_set ;
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Includesortasc ;
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Filterisrange ;
   private String Ddo_grid_Includedatalist ;
   private String Ddo_grid_Datalisttype ;
   private String Ddo_grid_Datalistproc ;
   private String Dvelop_confirmpanel_eliminarlinea_Title ;
   private String Dvelop_confirmpanel_eliminarlinea_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminarlinea_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminarlinea_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminarlinea_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminarlinea_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminarlinea_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Infinitescrolling ;
   private String Grid_empowerer_Fixedcolumns ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String lblTbmessage_Internalname ;
   private String lblTbmessage_Caption ;
   private String lblTbmessage_Jsonclick ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV70Trabajoexterno_detail__wcds_7_tfbarcodpar ;
   private String AV71Trabajoexterno_detail__wcds_8_tfbarcodpar_sel ;
   private String AV74Trabajoexterno_detail__wcds_11_tfbarser ;
   private String AV75Trabajoexterno_detail__wcds_12_tfbarser_sel ;
   private String AV76Trabajoexterno_detail__wcds_13_tfbarcolnom ;
   private String AV77Trabajoexterno_detail__wcds_14_tfbarcolnom_sel ;
   private String AV78Trabajoexterno_detail__wcds_15_tfbarnomcli ;
   private String AV79Trabajoexterno_detail__wcds_16_tfbarnomcli_sel ;
   private String AV80Trabajoexterno_detail__wcds_17_tffascodn ;
   private String AV81Trabajoexterno_detail__wcds_18_tffascodn_sel ;
   private String AV90Trabajoexterno_detail__wcds_27_tfsalexobs ;
   private String AV91Trabajoexterno_detail__wcds_28_tfsalexobs_sel ;
   private String edtSalExNln_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String edtCliCod_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Internalname ;
   private String A135BarColNom ;
   private String edtBarColNom_Internalname ;
   private String A1234BarNomCli ;
   private String edtBarNomCli_Internalname ;
   private String edtFasCodn_Internalname ;
   private String AV14FasDsc ;
   private String edtavFasdsc_Internalname ;
   private String edtOrdLin_Internalname ;
   private String edtSalExCoE_Internalname ;
   private String edtSalExKgE_Internalname ;
   private String edtSalExMtE_Internalname ;
   private String A6249SalExObs ;
   private String edtSalExObs_Internalname ;
   private String edtBarExt_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String hsh ;
   private String AV48Station ;
   private String AV49EmprNom ;
   private String AV50UsurCod ;
   private String AV92Emprcod_selected ;
   private String GXt_char20 ;
   private String GXv_char21[] ;
   private String GXt_char18 ;
   private String GXv_char19[] ;
   private String GXt_char17 ;
   private String GXv_char14[] ;
   private String GXt_char16 ;
   private String GXv_char4[] ;
   private String GXt_char15 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTabledvelop_confirmpanel_eliminarlinea_Internalname ;
   private String Dvelop_confirmpanel_eliminarlinea_Internalname ;
   private String sCtrlAV46emprcod ;
   private String sCtrlAV47SalExtAlb ;
   private String sCtrlAV51SalExtFec ;
   private String sCtrlAV52SalFhh ;
   private String sCtrlAV53Mancod ;
   private String sCtrlAV54ManNom ;
   private String sCtrlAV55SalCodeID ;
   private String sCtrlAV56SalEnvAT ;
   private String sCtrlAV57HashIN ;
   private String sCtrlAV58okIN ;
   private String sCtrlAV59Messages_jsonIN ;
   private String sGXsfl_17_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String TempTags ;
   private String ROClassString ;
   private String edtSalExNln_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtBarSer_Jsonclick ;
   private String edtBarColNom_Jsonclick ;
   private String edtBarNomCli_Jsonclick ;
   private String edtFasCodn_Jsonclick ;
   private String edtavFasdsc_Jsonclick ;
   private String edtOrdLin_Jsonclick ;
   private String edtSalExCoE_Jsonclick ;
   private String edtSalExKgE_Jsonclick ;
   private String edtSalExMtE_Jsonclick ;
   private String edtSalExObs_Jsonclick ;
   private String edtBarExt_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV52SalFhh ;
   private java.util.Date AV52SalFhh ;
   private java.util.Date wcpOAV51SalExtFec ;
   private java.util.Date AV51SalExtFec ;
   private java.util.Date GXv_date11[] ;
   private boolean wcpOAV58okIN ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV58okIN ;
   private boolean AV13OrderedDsc ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_17_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String wcpOAV59Messages_jsonIN ;
   private String AV59Messages_jsonIN ;
   private String wcpOAV57HashIN ;
   private String AV57HashIN ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV15Session ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminarlinea ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGridactions ;
   private IDataStoreProvider pr_default ;
   private String[] H029L2_A396EmprCod ;
   private int[] H029L2_A2253SalExtAlb ;
   private long[] H029L3_AGRID_nRecordCount ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState22[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV44DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class trabajoexterno_detail__wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H029L2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV64Trabajoexterno_detail__wcds_1_tfsalexnln ,
                                          short AV65Trabajoexterno_detail__wcds_2_tfsalexnln_to ,
                                          int AV66Trabajoexterno_detail__wcds_3_tfbarcod ,
                                          int AV67Trabajoexterno_detail__wcds_4_tfbarcod_to ,
                                          byte AV68Trabajoexterno_detail__wcds_5_tfbarcodreo ,
                                          byte AV69Trabajoexterno_detail__wcds_6_tfbarcodreo_to ,
                                          String AV71Trabajoexterno_detail__wcds_8_tfbarcodpar_sel ,
                                          String AV70Trabajoexterno_detail__wcds_7_tfbarcodpar ,
                                          int AV72Trabajoexterno_detail__wcds_9_tfclicod ,
                                          int AV73Trabajoexterno_detail__wcds_10_tfclicod_to ,
                                          String AV75Trabajoexterno_detail__wcds_12_tfbarser_sel ,
                                          String AV74Trabajoexterno_detail__wcds_11_tfbarser ,
                                          String AV77Trabajoexterno_detail__wcds_14_tfbarcolnom_sel ,
                                          String AV76Trabajoexterno_detail__wcds_13_tfbarcolnom ,
                                          String AV79Trabajoexterno_detail__wcds_16_tfbarnomcli_sel ,
                                          String AV78Trabajoexterno_detail__wcds_15_tfbarnomcli ,
                                          String AV81Trabajoexterno_detail__wcds_18_tffascodn_sel ,
                                          String AV80Trabajoexterno_detail__wcds_17_tffascodn ,
                                          short AV82Trabajoexterno_detail__wcds_19_tfordlin ,
                                          short AV83Trabajoexterno_detail__wcds_20_tfordlin_to ,
                                          int AV84Trabajoexterno_detail__wcds_21_tfsalexcoe ,
                                          int AV85Trabajoexterno_detail__wcds_22_tfsalexcoe_to ,
                                          java.math.BigDecimal AV86Trabajoexterno_detail__wcds_23_tfsalexkge ,
                                          java.math.BigDecimal AV87Trabajoexterno_detail__wcds_24_tfsalexkge_to ,
                                          java.math.BigDecimal AV88Trabajoexterno_detail__wcds_25_tfsalexmte ,
                                          java.math.BigDecimal AV89Trabajoexterno_detail__wcds_26_tfsalexmte_to ,
                                          String AV91Trabajoexterno_detail__wcds_28_tfsalexobs_sel ,
                                          String AV90Trabajoexterno_detail__wcds_27_tfsalexobs ,
                                          short A6248SalExNln ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A252CliCod ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          String A1234BarNomCli ,
                                          String A6558FasCodn ,
                                          short A654OrdLin ,
                                          int A6257SalExCoE ,
                                          java.math.BigDecimal A6256SalExKgE ,
                                          java.math.BigDecimal A6258SalExMtE ,
                                          String A6249SalExObs ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV46emprcod ,
                                          int AV47SalExtAlb ,
                                          String A396EmprCod ,
                                          int A2253SalExtAlb )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[7];
      Object[] GXv_Object24 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " /*+ FIRST_ROWS(1) */ EmprCod, SalExtAlb" ;
      sFromString = " FROM TXPCEXTSA" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(EmprCod = ? and SalExtAlb = ?)");
      if ( AV12OrderedBy == 1 )
      {
         sOrderString += " ORDER BY EmprCod, SalExtAlb" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY EmprCod, SalExtAlb" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
   }

   protected Object[] conditional_H029L3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV64Trabajoexterno_detail__wcds_1_tfsalexnln ,
                                          short AV65Trabajoexterno_detail__wcds_2_tfsalexnln_to ,
                                          int AV66Trabajoexterno_detail__wcds_3_tfbarcod ,
                                          int AV67Trabajoexterno_detail__wcds_4_tfbarcod_to ,
                                          byte AV68Trabajoexterno_detail__wcds_5_tfbarcodreo ,
                                          byte AV69Trabajoexterno_detail__wcds_6_tfbarcodreo_to ,
                                          String AV71Trabajoexterno_detail__wcds_8_tfbarcodpar_sel ,
                                          String AV70Trabajoexterno_detail__wcds_7_tfbarcodpar ,
                                          int AV72Trabajoexterno_detail__wcds_9_tfclicod ,
                                          int AV73Trabajoexterno_detail__wcds_10_tfclicod_to ,
                                          String AV75Trabajoexterno_detail__wcds_12_tfbarser_sel ,
                                          String AV74Trabajoexterno_detail__wcds_11_tfbarser ,
                                          String AV77Trabajoexterno_detail__wcds_14_tfbarcolnom_sel ,
                                          String AV76Trabajoexterno_detail__wcds_13_tfbarcolnom ,
                                          String AV79Trabajoexterno_detail__wcds_16_tfbarnomcli_sel ,
                                          String AV78Trabajoexterno_detail__wcds_15_tfbarnomcli ,
                                          String AV81Trabajoexterno_detail__wcds_18_tffascodn_sel ,
                                          String AV80Trabajoexterno_detail__wcds_17_tffascodn ,
                                          short AV82Trabajoexterno_detail__wcds_19_tfordlin ,
                                          short AV83Trabajoexterno_detail__wcds_20_tfordlin_to ,
                                          int AV84Trabajoexterno_detail__wcds_21_tfsalexcoe ,
                                          int AV85Trabajoexterno_detail__wcds_22_tfsalexcoe_to ,
                                          java.math.BigDecimal AV86Trabajoexterno_detail__wcds_23_tfsalexkge ,
                                          java.math.BigDecimal AV87Trabajoexterno_detail__wcds_24_tfsalexkge_to ,
                                          java.math.BigDecimal AV88Trabajoexterno_detail__wcds_25_tfsalexmte ,
                                          java.math.BigDecimal AV89Trabajoexterno_detail__wcds_26_tfsalexmte_to ,
                                          String AV91Trabajoexterno_detail__wcds_28_tfsalexobs_sel ,
                                          String AV90Trabajoexterno_detail__wcds_27_tfsalexobs ,
                                          short A6248SalExNln ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A252CliCod ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          String A1234BarNomCli ,
                                          String A6558FasCodn ,
                                          short A654OrdLin ,
                                          int A6257SalExCoE ,
                                          java.math.BigDecimal A6256SalExKgE ,
                                          java.math.BigDecimal A6258SalExMtE ,
                                          String A6249SalExObs ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV46emprcod ,
                                          int AV47SalExtAlb ,
                                          String A396EmprCod ,
                                          int A2253SalExtAlb )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int25 = new byte[2];
      Object[] GXv_Object26 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM TXPCEXTSA" ;
      addWhere(sWhereString, "(EmprCod = ? and SalExtAlb = ?)");
      scmdbuf += sWhereString ;
      if ( AV12OrderedBy == 1 )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object26[0] = scmdbuf ;
      GXv_Object26[1] = GXv_int25 ;
      return GXv_Object26 ;
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
                  return conditional_H029L2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , ((Boolean) dynConstraints[43]).booleanValue() , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() );
            case 1 :
                  return conditional_H029L3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , ((Boolean) dynConstraints[43]).booleanValue() , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H029L2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H029L3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[9]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[2], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[3]).intValue());
               }
               return;
      }
   }

}

