package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class consultasituacioncoleccion_opciones_impl extends GXWebComponent
{
   public consultasituacioncoleccion_opciones_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public consultasituacioncoleccion_opciones_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultasituacioncoleccion_opciones_impl.class ));
   }

   public consultasituacioncoleccion_opciones_impl( int remoteHandle ,
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
      cmbLb_Estado = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( nGotPars == 0 )
         {
            entryPointCalled = false ;
            gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
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
               AV7Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Emprcod", AV7Emprcod);
               AV8Lb_numero = (int)(GXutil.lval( httpContext.GetPar( "Lb_numero"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Lb_numero), 8, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV7Emprcod,Integer.valueOf(AV8Lb_numero)});
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
               gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
            {
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
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
      AV7Emprcod = httpContext.GetPar( "Emprcod") ;
      AV8Lb_numero = (int)(GXutil.lval( httpContext.GetPar( "Lb_numero"))) ;
      AV21TFLb_opcion = httpContext.GetPar( "TFLb_opcion") ;
      AV22TFLb_opcion_Sel = httpContext.GetPar( "TFLb_opcion_Sel") ;
      AV23TFLb_FechaEn = localUtil.parseDateParm( httpContext.GetPar( "TFLb_FechaEn")) ;
      AV27TFLb_HoraEn = GXutil.resetDate(localUtil.parseDTimeParm( httpContext.GetPar( "TFLb_HoraEn"))) ;
      AV31TFLb_FechaR = localUtil.parseDateParm( httpContext.GetPar( "TFLb_FechaR")) ;
      AV35TFLb_HoraR = GXutil.resetDate(localUtil.parseDTimeParm( httpContext.GetPar( "TFLb_HoraR"))) ;
      AV39TFLb_CosteE = CommonUtil.decimalVal( httpContext.GetPar( "TFLb_CosteE"), ".") ;
      AV40TFLb_CosteE_To = CommonUtil.decimalVal( httpContext.GetPar( "TFLb_CosteE_To"), ".") ;
      AV57TFLb_CosteC = CommonUtil.decimalVal( httpContext.GetPar( "TFLb_CosteC"), ".") ;
      AV58TFLb_CosteC_To = CommonUtil.decimalVal( httpContext.GetPar( "TFLb_CosteC_To"), ".") ;
      AV49TFLb_FecNoa1 = localUtil.parseDateParm( httpContext.GetPar( "TFLb_FecNoa1")) ;
      AV53TFLb_hhnoa1 = GXutil.resetDate(localUtil.parseDTimeParm( httpContext.GetPar( "TFLb_hhnoa1"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV64TFLb_Estado_Sels);
      AV59TFLb_ProvDef = httpContext.GetPar( "TFLb_ProvDef") ;
      AV60TFLb_ProvDef_Sel = httpContext.GetPar( "TFLb_ProvDef_Sel") ;
      AV61TFLb_ObsCR = httpContext.GetPar( "TFLb_ObsCR") ;
      AV62TFLb_ObsCR_Sel = httpContext.GetPar( "TFLb_ObsCR_Sel") ;
      AV67Pgmname = httpContext.GetPar( "Pgmname") ;
      AV14OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV15OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV7Emprcod, AV8Lb_numero, AV21TFLb_opcion, AV22TFLb_opcion_Sel, AV23TFLb_FechaEn, AV27TFLb_HoraEn, AV31TFLb_FechaR, AV35TFLb_HoraR, AV39TFLb_CosteE, AV40TFLb_CosteE_To, AV57TFLb_CosteC, AV58TFLb_CosteC_To, AV49TFLb_FecNoa1, AV53TFLb_hhnoa1, AV64TFLb_Estado_Sels, AV59TFLb_ProvDef, AV60TFLb_ProvDef_Sel, AV61TFLb_ObsCR, AV62TFLb_ObsCR_Sel, AV67Pgmname, AV14OrderedBy, AV15OrderedDsc, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1U92( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Consulta Situacion Coleccion (Opciones)", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.gestionlaboratorio.consultasituacioncoleccion_opciones", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV8Lb_numero,8,0))}, new String[] {"Emprcod","Lb_numero"}) +"\">") ;
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
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ConsultaSituacionColeccion_Opciones");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV67Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("gestionlaboratorio\\consultasituacioncoleccion_opciones:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_17", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_17, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV45DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV45DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7Emprcod", GXutil.rtrim( wcpOAV7Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8Lb_numero", GXutil.ltrim( localUtil.ntoc( wcpOAV8Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_OPCION", GXutil.rtrim( AV21TFLb_opcion));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_OPCION_SEL", GXutil.rtrim( AV22TFLb_opcion_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_FECHAEN", localUtil.dtoc( AV23TFLb_FechaEn, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_HORAEN", localUtil.ttoc( AV27TFLb_HoraEn, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_FECHAR", localUtil.dtoc( AV31TFLb_FechaR, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_HORAR", localUtil.ttoc( AV35TFLb_HoraR, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_COSTEE", GXutil.ltrim( localUtil.ntoc( AV39TFLb_CosteE, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_COSTEE_TO", GXutil.ltrim( localUtil.ntoc( AV40TFLb_CosteE_To, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_COSTEC", GXutil.ltrim( localUtil.ntoc( AV57TFLb_CosteC, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_COSTEC_TO", GXutil.ltrim( localUtil.ntoc( AV58TFLb_CosteC_To, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_FECNOA1", localUtil.dtoc( AV49TFLb_FecNoa1, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_HHNOA1", localUtil.ttoc( AV53TFLb_hhnoa1, 10, 8, 0, 0, "/", ":", " "));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vTFLB_ESTADO_SELS", AV64TFLb_Estado_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vTFLB_ESTADO_SELS", AV64TFLb_Estado_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_PROVDEF", GXutil.rtrim( AV59TFLb_ProvDef));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_PROVDEF_SEL", GXutil.rtrim( AV60TFLb_ProvDef_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_OBSCR", AV61TFLb_ObsCR);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_OBSCR_SEL", AV62TFLb_ObsCR_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV14OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV15OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV7Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_NUMERO", GXutil.ltrim( localUtil.ntoc( AV8Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Allowmultipleselection", GXutil.rtrim( Ddo_grid_Allowmultipleselection));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalistfixedvalues", GXutil.rtrim( Ddo_grid_Datalistfixedvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Grid_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Grid_titlescategories_Gridtitlescategories));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascategories", GXutil.booltostr( Grid_empowerer_Hascategories));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
   }

   public void renderHtmlCloseForm1U92( )
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
      return "GestionLaboratorio.ConsultaSituacionColeccion_Opciones" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Consulta Situacion Coleccion (Opciones)", "") ;
   }

   public void wb1U90( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.gestionlaboratorio.consultasituacioncoleccion_opciones");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
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
         wb_table1_9_1U92( true) ;
      }
      else
      {
         wb_table1_9_1U92( false) ;
      }
      return  ;
   }

   public void wb_table1_9_1U92e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV67Pgmname), GXutil.rtrim( localUtil.format( AV67Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\ConsultaSituacionColeccion_Opciones.htm");
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
         ucDdo_grid.setProperty("AllowMultipleSelection", Ddo_grid_Allowmultipleselection);
         ucDdo_grid.setProperty("DataListFixedValues", Ddo_grid_Datalistfixedvalues);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV45DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucGrid_titlescategories.setProperty("GridTitlesCategories", Grid_titlescategories_Gridtitlescategories);
         ucGrid_titlescategories.render(context, "dvelop.gridtitlescategories", Grid_titlescategories_Internalname, sPrefix+"GRID_TITLESCATEGORIESContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasCategories", Grid_empowerer_Hascategories);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_lb_fechaenauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'" + sPrefix + "',false,'" + sGXsfl_17_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_lb_fechaenauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_lb_fechaenauxdate_Internalname, localUtil.format(AV25DDO_Lb_FechaEnAuxDate, "99/99/99"), localUtil.format( AV25DDO_Lb_FechaEnAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,41);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_lb_fechaenauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\ConsultaSituacionColeccion_Opciones.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_lb_fechaenauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_GestionLaboratorio\\ConsultaSituacionColeccion_Opciones.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_lb_horaenauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'" + sPrefix + "',false,'" + sGXsfl_17_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_lb_horaenauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_lb_horaenauxdate_Internalname, localUtil.format(AV29DDO_Lb_HoraEnAuxDate, "99/99/99"), localUtil.format( AV29DDO_Lb_HoraEnAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,43);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_lb_horaenauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\ConsultaSituacionColeccion_Opciones.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_lb_horaenauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_GestionLaboratorio\\ConsultaSituacionColeccion_Opciones.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_lb_fecharauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'" + sPrefix + "',false,'" + sGXsfl_17_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_lb_fecharauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_lb_fecharauxdate_Internalname, localUtil.format(AV33DDO_Lb_FechaRAuxDate, "99/99/99"), localUtil.format( AV33DDO_Lb_FechaRAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,45);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_lb_fecharauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\ConsultaSituacionColeccion_Opciones.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_lb_fecharauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_GestionLaboratorio\\ConsultaSituacionColeccion_Opciones.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_lb_horarauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'" + sPrefix + "',false,'" + sGXsfl_17_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_lb_horarauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_lb_horarauxdate_Internalname, localUtil.format(AV37DDO_Lb_HoraRAuxDate, "99/99/99"), localUtil.format( AV37DDO_Lb_HoraRAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,47);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_lb_horarauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\ConsultaSituacionColeccion_Opciones.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_lb_horarauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_GestionLaboratorio\\ConsultaSituacionColeccion_Opciones.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_lb_fecnoa1auxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'" + sPrefix + "',false,'" + sGXsfl_17_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_lb_fecnoa1auxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_lb_fecnoa1auxdate_Internalname, localUtil.format(AV51DDO_Lb_FecNoa1AuxDate, "99/99/99"), localUtil.format( AV51DDO_Lb_FecNoa1AuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,49);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_lb_fecnoa1auxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\ConsultaSituacionColeccion_Opciones.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_lb_fecnoa1auxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_GestionLaboratorio\\ConsultaSituacionColeccion_Opciones.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_lb_hhnoa1auxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'" + sPrefix + "',false,'" + sGXsfl_17_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_lb_hhnoa1auxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_lb_hhnoa1auxdate_Internalname, localUtil.format(AV55DDO_Lb_hhnoa1AuxDate, "99/99/99"), localUtil.format( AV55DDO_Lb_hhnoa1AuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,51);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_lb_hhnoa1auxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\ConsultaSituacionColeccion_Opciones.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_lb_hhnoa1auxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_GestionLaboratorio\\ConsultaSituacionColeccion_Opciones.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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

   public void start1U92( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Consulta Situacion Coleccion (Opciones)", ""), (short)(0)) ;
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
            strup1U90( ) ;
         }
      }
   }

   public void ws1U92( )
   {
      start1U92( ) ;
      evt1U92( ) ;
   }

   public void evt1U92( )
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
                              strup1U90( ) ;
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
                              strup1U90( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e111U92 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1U90( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavDdo_lb_fechaenauxdate_Internalname ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1U90( ) ;
                           }
                           AV71Gestionlaboratorio_consultasituacioncoleccion_opcionesds_1_tflb_opcion = AV21TFLb_opcion ;
                           AV72Gestionlaboratorio_consultasituacioncoleccion_opcionesds_2_tflb_opcion_sel = AV22TFLb_opcion_Sel ;
                           AV73Gestionlaboratorio_consultasituacioncoleccion_opcionesds_3_tflb_fechaen = AV23TFLb_FechaEn ;
                           AV74Gestionlaboratorio_consultasituacioncoleccion_opcionesds_4_tflb_horaen = AV27TFLb_HoraEn ;
                           AV75Gestionlaboratorio_consultasituacioncoleccion_opcionesds_5_tflb_fechar = AV31TFLb_FechaR ;
                           AV76Gestionlaboratorio_consultasituacioncoleccion_opcionesds_6_tflb_horar = AV35TFLb_HoraR ;
                           AV77Gestionlaboratorio_consultasituacioncoleccion_opcionesds_7_tflb_costee = AV39TFLb_CosteE ;
                           AV78Gestionlaboratorio_consultasituacioncoleccion_opcionesds_8_tflb_costee_to = AV40TFLb_CosteE_To ;
                           AV79Gestionlaboratorio_consultasituacioncoleccion_opcionesds_9_tflb_costec = AV57TFLb_CosteC ;
                           AV80Gestionlaboratorio_consultasituacioncoleccion_opcionesds_10_tflb_costec_to = AV58TFLb_CosteC_To ;
                           AV81Gestionlaboratorio_consultasituacioncoleccion_opcionesds_11_tflb_fecnoa1 = AV49TFLb_FecNoa1 ;
                           AV82Gestionlaboratorio_consultasituacioncoleccion_opcionesds_12_tflb_hhnoa1 = AV53TFLb_hhnoa1 ;
                           AV83Gestionlaboratorio_consultasituacioncoleccion_opcionesds_13_tflb_estado_sels = AV64TFLb_Estado_Sels ;
                           AV84Gestionlaboratorio_consultasituacioncoleccion_opcionesds_14_tflb_provdef = AV59TFLb_ProvDef ;
                           AV85Gestionlaboratorio_consultasituacioncoleccion_opcionesds_15_tflb_provdef_sel = AV60TFLb_ProvDef_Sel ;
                           AV86Gestionlaboratorio_consultasituacioncoleccion_opcionesds_16_tflb_obscr = AV61TFLb_ObsCR ;
                           AV87Gestionlaboratorio_consultasituacioncoleccion_opcionesds_17_tflb_obscr_sel = AV62TFLb_ObsCR_Sel ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1U90( ) ;
                           }
                           nGXsfl_17_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_17_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_17_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_172( ) ;
                           A5555Lb_opcion = GXutil.upper( httpContext.cgiGet( edtLb_opcion_Internalname)) ;
                           A5567Lb_FechaEn = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtLb_FechaEn_Internalname), 0)) ;
                           A5568Lb_HoraEn = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtLb_HoraEn_Internalname), 0)) ;
                           A5563Lb_FechaR = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtLb_FechaR_Internalname), 0)) ;
                           A5564Lb_HoraR = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtLb_HoraR_Internalname), 0)) ;
                           A5565Lb_CosteE = localUtil.ctond( httpContext.cgiGet( edtLb_CosteE_Internalname)) ;
                           A1127Lb_CosteC = localUtil.ctond( httpContext.cgiGet( edtLb_CosteC_Internalname)) ;
                           A6461Lb_FecNoa1 = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtLb_FecNoa1_Internalname), 0)) ;
                           A10082Lb_hhnoa1 = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtLb_hhnoa1_Internalname), 0)) ;
                           cmbLb_Estado.setName( cmbLb_Estado.getInternalname() );
                           cmbLb_Estado.setValue( httpContext.cgiGet( cmbLb_Estado.getInternalname()) );
                           A5566Lb_Estado = (byte)(GXutil.lval( httpContext.cgiGet( cmbLb_Estado.getInternalname()))) ;
                           A6631Lb_ProvDef = httpContext.cgiGet( edtLb_ProvDef_Internalname) ;
                           A10822Lb_ObsCR = httpContext.cgiGet( edtLb_ObsCR_Internalname) ;
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
                                       GX_FocusControl = edtavDdo_lb_fechaenauxdate_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e121U92 ();
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
                                       GX_FocusControl = edtavDdo_lb_fechaenauxdate_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e131U92 ();
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
                                       GX_FocusControl = edtavDdo_lb_fechaenauxdate_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e141U92 ();
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
                                    strup1U90( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavDdo_lb_fechaenauxdate_Internalname ;
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

   public void we1U92( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1U92( ) ;
         }
      }
   }

   public void pa1U92( )
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
            GX_FocusControl = edtavDdo_lb_fechaenauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
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
                                 String AV7Emprcod ,
                                 int AV8Lb_numero ,
                                 String AV21TFLb_opcion ,
                                 String AV22TFLb_opcion_Sel ,
                                 java.util.Date AV23TFLb_FechaEn ,
                                 java.util.Date AV27TFLb_HoraEn ,
                                 java.util.Date AV31TFLb_FechaR ,
                                 java.util.Date AV35TFLb_HoraR ,
                                 java.math.BigDecimal AV39TFLb_CosteE ,
                                 java.math.BigDecimal AV40TFLb_CosteE_To ,
                                 java.math.BigDecimal AV57TFLb_CosteC ,
                                 java.math.BigDecimal AV58TFLb_CosteC_To ,
                                 java.util.Date AV49TFLb_FecNoa1 ,
                                 java.util.Date AV53TFLb_hhnoa1 ,
                                 GXSimpleCollection<Byte> AV64TFLb_Estado_Sels ,
                                 String AV59TFLb_ProvDef ,
                                 String AV60TFLb_ProvDef_Sel ,
                                 String AV61TFLb_ObsCR ,
                                 String AV62TFLb_ObsCR_Sel ,
                                 String AV67Pgmname ,
                                 short AV14OrderedBy ,
                                 boolean AV15OrderedDsc ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e131U92 ();
      GRID_nCurrentRecord = 0 ;
      rf1U92( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ConsultaSituacionColeccion_Opciones");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV67Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("gestionlaboratorio\\consultasituacioncoleccion_opciones:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf1U92( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV67Pgmname = "GestionLaboratorio.ConsultaSituacionColeccion_Opciones" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67Pgmname", AV67Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1U92( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(17) ;
      /* Execute user event: Refresh */
      e131U92 ();
      nGXsfl_17_idx = 1 ;
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
                                              Byte.valueOf(A5566Lb_Estado) ,
                                              AV83Gestionlaboratorio_consultasituacioncoleccion_opcionesds_13_tflb_estado_sels ,
                                              AV72Gestionlaboratorio_consultasituacioncoleccion_opcionesds_2_tflb_opcion_sel ,
                                              AV71Gestionlaboratorio_consultasituacioncoleccion_opcionesds_1_tflb_opcion ,
                                              AV73Gestionlaboratorio_consultasituacioncoleccion_opcionesds_3_tflb_fechaen ,
                                              AV74Gestionlaboratorio_consultasituacioncoleccion_opcionesds_4_tflb_horaen ,
                                              AV75Gestionlaboratorio_consultasituacioncoleccion_opcionesds_5_tflb_fechar ,
                                              AV76Gestionlaboratorio_consultasituacioncoleccion_opcionesds_6_tflb_horar ,
                                              AV77Gestionlaboratorio_consultasituacioncoleccion_opcionesds_7_tflb_costee ,
                                              AV78Gestionlaboratorio_consultasituacioncoleccion_opcionesds_8_tflb_costee_to ,
                                              AV79Gestionlaboratorio_consultasituacioncoleccion_opcionesds_9_tflb_costec ,
                                              AV80Gestionlaboratorio_consultasituacioncoleccion_opcionesds_10_tflb_costec_to ,
                                              AV81Gestionlaboratorio_consultasituacioncoleccion_opcionesds_11_tflb_fecnoa1 ,
                                              AV82Gestionlaboratorio_consultasituacioncoleccion_opcionesds_12_tflb_hhnoa1 ,
                                              Integer.valueOf(AV83Gestionlaboratorio_consultasituacioncoleccion_opcionesds_13_tflb_estado_sels.size()) ,
                                              AV85Gestionlaboratorio_consultasituacioncoleccion_opcionesds_15_tflb_provdef_sel ,
                                              AV84Gestionlaboratorio_consultasituacioncoleccion_opcionesds_14_tflb_provdef ,
                                              AV87Gestionlaboratorio_consultasituacioncoleccion_opcionesds_17_tflb_obscr_sel ,
                                              AV86Gestionlaboratorio_consultasituacioncoleccion_opcionesds_16_tflb_obscr ,
                                              A5555Lb_opcion ,
                                              A5567Lb_FechaEn ,
                                              A5568Lb_HoraEn ,
                                              A5563Lb_FechaR ,
                                              A5564Lb_HoraR ,
                                              A5565Lb_CosteE ,
                                              A1127Lb_CosteC ,
                                              A6461Lb_FecNoa1 ,
                                              A10082Lb_hhnoa1 ,
                                              A6631Lb_ProvDef ,
                                              A10822Lb_ObsCR ,
                                              Short.valueOf(AV14OrderedBy) ,
                                              Boolean.valueOf(AV15OrderedDsc) ,
                                              AV7Emprcod ,
                                              Integer.valueOf(AV8Lb_numero) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A5532Lb_numero) } ,
                                              new int[]{
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                              }
         });
         lV71Gestionlaboratorio_consultasituacioncoleccion_opcionesds_1_tflb_opcion = GXutil.padr( GXutil.rtrim( AV71Gestionlaboratorio_consultasituacioncoleccion_opcionesds_1_tflb_opcion), 1, "%") ;
         lV84Gestionlaboratorio_consultasituacioncoleccion_opcionesds_14_tflb_provdef = GXutil.padr( GXutil.rtrim( AV84Gestionlaboratorio_consultasituacioncoleccion_opcionesds_14_tflb_provdef), 1, "%") ;
         lV86Gestionlaboratorio_consultasituacioncoleccion_opcionesds_16_tflb_obscr = GXutil.concat( GXutil.rtrim( AV86Gestionlaboratorio_consultasituacioncoleccion_opcionesds_16_tflb_obscr), "%", "") ;
         /* Using cursor H01U92 */
         pr_default.execute(0, new Object[] {AV7Emprcod, Integer.valueOf(AV8Lb_numero), lV71Gestionlaboratorio_consultasituacioncoleccion_opcionesds_1_tflb_opcion, AV72Gestionlaboratorio_consultasituacioncoleccion_opcionesds_2_tflb_opcion_sel, AV73Gestionlaboratorio_consultasituacioncoleccion_opcionesds_3_tflb_fechaen, AV74Gestionlaboratorio_consultasituacioncoleccion_opcionesds_4_tflb_horaen, AV75Gestionlaboratorio_consultasituacioncoleccion_opcionesds_5_tflb_fechar, AV76Gestionlaboratorio_consultasituacioncoleccion_opcionesds_6_tflb_horar, AV77Gestionlaboratorio_consultasituacioncoleccion_opcionesds_7_tflb_costee, AV78Gestionlaboratorio_consultasituacioncoleccion_opcionesds_8_tflb_costee_to, AV79Gestionlaboratorio_consultasituacioncoleccion_opcionesds_9_tflb_costec, AV80Gestionlaboratorio_consultasituacioncoleccion_opcionesds_10_tflb_costec_to, AV81Gestionlaboratorio_consultasituacioncoleccion_opcionesds_11_tflb_fecnoa1, AV82Gestionlaboratorio_consultasituacioncoleccion_opcionesds_12_tflb_hhnoa1, lV84Gestionlaboratorio_consultasituacioncoleccion_opcionesds_14_tflb_provdef, AV85Gestionlaboratorio_consultasituacioncoleccion_opcionesds_15_tflb_provdef_sel, lV86Gestionlaboratorio_consultasituacioncoleccion_opcionesds_16_tflb_obscr, AV87Gestionlaboratorio_consultasituacioncoleccion_opcionesds_17_tflb_obscr_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_17_idx = 1 ;
         sGXsfl_17_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_17_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_172( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H01U92_A396EmprCod[0] ;
            A5532Lb_numero = H01U92_A5532Lb_numero[0] ;
            A10822Lb_ObsCR = H01U92_A10822Lb_ObsCR[0] ;
            A6631Lb_ProvDef = H01U92_A6631Lb_ProvDef[0] ;
            A5566Lb_Estado = H01U92_A5566Lb_Estado[0] ;
            A10082Lb_hhnoa1 = H01U92_A10082Lb_hhnoa1[0] ;
            A6461Lb_FecNoa1 = H01U92_A6461Lb_FecNoa1[0] ;
            A1127Lb_CosteC = H01U92_A1127Lb_CosteC[0] ;
            A5565Lb_CosteE = H01U92_A5565Lb_CosteE[0] ;
            A5564Lb_HoraR = H01U92_A5564Lb_HoraR[0] ;
            A5563Lb_FechaR = H01U92_A5563Lb_FechaR[0] ;
            A5568Lb_HoraEn = H01U92_A5568Lb_HoraEn[0] ;
            A5567Lb_FechaEn = H01U92_A5567Lb_FechaEn[0] ;
            A5555Lb_opcion = H01U92_A5555Lb_opcion[0] ;
            e141U92 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(17) ;
         wb1U90( ) ;
      }
      bGXsfl_17_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1U92( )
   {
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
      AV71Gestionlaboratorio_consultasituacioncoleccion_opcionesds_1_tflb_opcion = AV21TFLb_opcion ;
      AV72Gestionlaboratorio_consultasituacioncoleccion_opcionesds_2_tflb_opcion_sel = AV22TFLb_opcion_Sel ;
      AV73Gestionlaboratorio_consultasituacioncoleccion_opcionesds_3_tflb_fechaen = AV23TFLb_FechaEn ;
      AV74Gestionlaboratorio_consultasituacioncoleccion_opcionesds_4_tflb_horaen = AV27TFLb_HoraEn ;
      AV75Gestionlaboratorio_consultasituacioncoleccion_opcionesds_5_tflb_fechar = AV31TFLb_FechaR ;
      AV76Gestionlaboratorio_consultasituacioncoleccion_opcionesds_6_tflb_horar = AV35TFLb_HoraR ;
      AV77Gestionlaboratorio_consultasituacioncoleccion_opcionesds_7_tflb_costee = AV39TFLb_CosteE ;
      AV78Gestionlaboratorio_consultasituacioncoleccion_opcionesds_8_tflb_costee_to = AV40TFLb_CosteE_To ;
      AV79Gestionlaboratorio_consultasituacioncoleccion_opcionesds_9_tflb_costec = AV57TFLb_CosteC ;
      AV80Gestionlaboratorio_consultasituacioncoleccion_opcionesds_10_tflb_costec_to = AV58TFLb_CosteC_To ;
      AV81Gestionlaboratorio_consultasituacioncoleccion_opcionesds_11_tflb_fecnoa1 = AV49TFLb_FecNoa1 ;
      AV82Gestionlaboratorio_consultasituacioncoleccion_opcionesds_12_tflb_hhnoa1 = AV53TFLb_hhnoa1 ;
      AV83Gestionlaboratorio_consultasituacioncoleccion_opcionesds_13_tflb_estado_sels = AV64TFLb_Estado_Sels ;
      AV84Gestionlaboratorio_consultasituacioncoleccion_opcionesds_14_tflb_provdef = AV59TFLb_ProvDef ;
      AV85Gestionlaboratorio_consultasituacioncoleccion_opcionesds_15_tflb_provdef_sel = AV60TFLb_ProvDef_Sel ;
      AV86Gestionlaboratorio_consultasituacioncoleccion_opcionesds_16_tflb_obscr = AV61TFLb_ObsCR ;
      AV87Gestionlaboratorio_consultasituacioncoleccion_opcionesds_17_tflb_obscr_sel = AV62TFLb_ObsCR_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(A5566Lb_Estado) ,
                                           AV83Gestionlaboratorio_consultasituacioncoleccion_opcionesds_13_tflb_estado_sels ,
                                           AV72Gestionlaboratorio_consultasituacioncoleccion_opcionesds_2_tflb_opcion_sel ,
                                           AV71Gestionlaboratorio_consultasituacioncoleccion_opcionesds_1_tflb_opcion ,
                                           AV73Gestionlaboratorio_consultasituacioncoleccion_opcionesds_3_tflb_fechaen ,
                                           AV74Gestionlaboratorio_consultasituacioncoleccion_opcionesds_4_tflb_horaen ,
                                           AV75Gestionlaboratorio_consultasituacioncoleccion_opcionesds_5_tflb_fechar ,
                                           AV76Gestionlaboratorio_consultasituacioncoleccion_opcionesds_6_tflb_horar ,
                                           AV77Gestionlaboratorio_consultasituacioncoleccion_opcionesds_7_tflb_costee ,
                                           AV78Gestionlaboratorio_consultasituacioncoleccion_opcionesds_8_tflb_costee_to ,
                                           AV79Gestionlaboratorio_consultasituacioncoleccion_opcionesds_9_tflb_costec ,
                                           AV80Gestionlaboratorio_consultasituacioncoleccion_opcionesds_10_tflb_costec_to ,
                                           AV81Gestionlaboratorio_consultasituacioncoleccion_opcionesds_11_tflb_fecnoa1 ,
                                           AV82Gestionlaboratorio_consultasituacioncoleccion_opcionesds_12_tflb_hhnoa1 ,
                                           Integer.valueOf(AV83Gestionlaboratorio_consultasituacioncoleccion_opcionesds_13_tflb_estado_sels.size()) ,
                                           AV85Gestionlaboratorio_consultasituacioncoleccion_opcionesds_15_tflb_provdef_sel ,
                                           AV84Gestionlaboratorio_consultasituacioncoleccion_opcionesds_14_tflb_provdef ,
                                           AV87Gestionlaboratorio_consultasituacioncoleccion_opcionesds_17_tflb_obscr_sel ,
                                           AV86Gestionlaboratorio_consultasituacioncoleccion_opcionesds_16_tflb_obscr ,
                                           A5555Lb_opcion ,
                                           A5567Lb_FechaEn ,
                                           A5568Lb_HoraEn ,
                                           A5563Lb_FechaR ,
                                           A5564Lb_HoraR ,
                                           A5565Lb_CosteE ,
                                           A1127Lb_CosteC ,
                                           A6461Lb_FecNoa1 ,
                                           A10082Lb_hhnoa1 ,
                                           A6631Lb_ProvDef ,
                                           A10822Lb_ObsCR ,
                                           Short.valueOf(AV14OrderedBy) ,
                                           Boolean.valueOf(AV15OrderedDsc) ,
                                           AV7Emprcod ,
                                           Integer.valueOf(AV8Lb_numero) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A5532Lb_numero) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV71Gestionlaboratorio_consultasituacioncoleccion_opcionesds_1_tflb_opcion = GXutil.padr( GXutil.rtrim( AV71Gestionlaboratorio_consultasituacioncoleccion_opcionesds_1_tflb_opcion), 1, "%") ;
      lV84Gestionlaboratorio_consultasituacioncoleccion_opcionesds_14_tflb_provdef = GXutil.padr( GXutil.rtrim( AV84Gestionlaboratorio_consultasituacioncoleccion_opcionesds_14_tflb_provdef), 1, "%") ;
      lV86Gestionlaboratorio_consultasituacioncoleccion_opcionesds_16_tflb_obscr = GXutil.concat( GXutil.rtrim( AV86Gestionlaboratorio_consultasituacioncoleccion_opcionesds_16_tflb_obscr), "%", "") ;
      /* Using cursor H01U93 */
      pr_default.execute(1, new Object[] {AV7Emprcod, Integer.valueOf(AV8Lb_numero), lV71Gestionlaboratorio_consultasituacioncoleccion_opcionesds_1_tflb_opcion, AV72Gestionlaboratorio_consultasituacioncoleccion_opcionesds_2_tflb_opcion_sel, AV73Gestionlaboratorio_consultasituacioncoleccion_opcionesds_3_tflb_fechaen, AV74Gestionlaboratorio_consultasituacioncoleccion_opcionesds_4_tflb_horaen, AV75Gestionlaboratorio_consultasituacioncoleccion_opcionesds_5_tflb_fechar, AV76Gestionlaboratorio_consultasituacioncoleccion_opcionesds_6_tflb_horar, AV77Gestionlaboratorio_consultasituacioncoleccion_opcionesds_7_tflb_costee, AV78Gestionlaboratorio_consultasituacioncoleccion_opcionesds_8_tflb_costee_to, AV79Gestionlaboratorio_consultasituacioncoleccion_opcionesds_9_tflb_costec, AV80Gestionlaboratorio_consultasituacioncoleccion_opcionesds_10_tflb_costec_to, AV81Gestionlaboratorio_consultasituacioncoleccion_opcionesds_11_tflb_fecnoa1, AV82Gestionlaboratorio_consultasituacioncoleccion_opcionesds_12_tflb_hhnoa1, lV84Gestionlaboratorio_consultasituacioncoleccion_opcionesds_14_tflb_provdef, AV85Gestionlaboratorio_consultasituacioncoleccion_opcionesds_15_tflb_provdef_sel, lV86Gestionlaboratorio_consultasituacioncoleccion_opcionesds_16_tflb_obscr, AV87Gestionlaboratorio_consultasituacioncoleccion_opcionesds_17_tflb_obscr_sel});
      GRID_nRecordCount = H01U93_AGRID_nRecordCount[0] ;
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
      AV71Gestionlaboratorio_consultasituacioncoleccion_opcionesds_1_tflb_opcion = AV21TFLb_opcion ;
      AV72Gestionlaboratorio_consultasituacioncoleccion_opcionesds_2_tflb_opcion_sel = AV22TFLb_opcion_Sel ;
      AV73Gestionlaboratorio_consultasituacioncoleccion_opcionesds_3_tflb_fechaen = AV23TFLb_FechaEn ;
      AV74Gestionlaboratorio_consultasituacioncoleccion_opcionesds_4_tflb_horaen = AV27TFLb_HoraEn ;
      AV75Gestionlaboratorio_consultasituacioncoleccion_opcionesds_5_tflb_fechar = AV31TFLb_FechaR ;
      AV76Gestionlaboratorio_consultasituacioncoleccion_opcionesds_6_tflb_horar = AV35TFLb_HoraR ;
      AV77Gestionlaboratorio_consultasituacioncoleccion_opcionesds_7_tflb_costee = AV39TFLb_CosteE ;
      AV78Gestionlaboratorio_consultasituacioncoleccion_opcionesds_8_tflb_costee_to = AV40TFLb_CosteE_To ;
      AV79Gestionlaboratorio_consultasituacioncoleccion_opcionesds_9_tflb_costec = AV57TFLb_CosteC ;
      AV80Gestionlaboratorio_consultasituacioncoleccion_opcionesds_10_tflb_costec_to = AV58TFLb_CosteC_To ;
      AV81Gestionlaboratorio_consultasituacioncoleccion_opcionesds_11_tflb_fecnoa1 = AV49TFLb_FecNoa1 ;
      AV82Gestionlaboratorio_consultasituacioncoleccion_opcionesds_12_tflb_hhnoa1 = AV53TFLb_hhnoa1 ;
      AV83Gestionlaboratorio_consultasituacioncoleccion_opcionesds_13_tflb_estado_sels = AV64TFLb_Estado_Sels ;
      AV84Gestionlaboratorio_consultasituacioncoleccion_opcionesds_14_tflb_provdef = AV59TFLb_ProvDef ;
      AV85Gestionlaboratorio_consultasituacioncoleccion_opcionesds_15_tflb_provdef_sel = AV60TFLb_ProvDef_Sel ;
      AV86Gestionlaboratorio_consultasituacioncoleccion_opcionesds_16_tflb_obscr = AV61TFLb_ObsCR ;
      AV87Gestionlaboratorio_consultasituacioncoleccion_opcionesds_17_tflb_obscr_sel = AV62TFLb_ObsCR_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV7Emprcod, AV8Lb_numero, AV21TFLb_opcion, AV22TFLb_opcion_Sel, AV23TFLb_FechaEn, AV27TFLb_HoraEn, AV31TFLb_FechaR, AV35TFLb_HoraR, AV39TFLb_CosteE, AV40TFLb_CosteE_To, AV57TFLb_CosteC, AV58TFLb_CosteC_To, AV49TFLb_FecNoa1, AV53TFLb_hhnoa1, AV64TFLb_Estado_Sels, AV59TFLb_ProvDef, AV60TFLb_ProvDef_Sel, AV61TFLb_ObsCR, AV62TFLb_ObsCR_Sel, AV67Pgmname, AV14OrderedBy, AV15OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV71Gestionlaboratorio_consultasituacioncoleccion_opcionesds_1_tflb_opcion = AV21TFLb_opcion ;
      AV72Gestionlaboratorio_consultasituacioncoleccion_opcionesds_2_tflb_opcion_sel = AV22TFLb_opcion_Sel ;
      AV73Gestionlaboratorio_consultasituacioncoleccion_opcionesds_3_tflb_fechaen = AV23TFLb_FechaEn ;
      AV74Gestionlaboratorio_consultasituacioncoleccion_opcionesds_4_tflb_horaen = AV27TFLb_HoraEn ;
      AV75Gestionlaboratorio_consultasituacioncoleccion_opcionesds_5_tflb_fechar = AV31TFLb_FechaR ;
      AV76Gestionlaboratorio_consultasituacioncoleccion_opcionesds_6_tflb_horar = AV35TFLb_HoraR ;
      AV77Gestionlaboratorio_consultasituacioncoleccion_opcionesds_7_tflb_costee = AV39TFLb_CosteE ;
      AV78Gestionlaboratorio_consultasituacioncoleccion_opcionesds_8_tflb_costee_to = AV40TFLb_CosteE_To ;
      AV79Gestionlaboratorio_consultasituacioncoleccion_opcionesds_9_tflb_costec = AV57TFLb_CosteC ;
      AV80Gestionlaboratorio_consultasituacioncoleccion_opcionesds_10_tflb_costec_to = AV58TFLb_CosteC_To ;
      AV81Gestionlaboratorio_consultasituacioncoleccion_opcionesds_11_tflb_fecnoa1 = AV49TFLb_FecNoa1 ;
      AV82Gestionlaboratorio_consultasituacioncoleccion_opcionesds_12_tflb_hhnoa1 = AV53TFLb_hhnoa1 ;
      AV83Gestionlaboratorio_consultasituacioncoleccion_opcionesds_13_tflb_estado_sels = AV64TFLb_Estado_Sels ;
      AV84Gestionlaboratorio_consultasituacioncoleccion_opcionesds_14_tflb_provdef = AV59TFLb_ProvDef ;
      AV85Gestionlaboratorio_consultasituacioncoleccion_opcionesds_15_tflb_provdef_sel = AV60TFLb_ProvDef_Sel ;
      AV86Gestionlaboratorio_consultasituacioncoleccion_opcionesds_16_tflb_obscr = AV61TFLb_ObsCR ;
      AV87Gestionlaboratorio_consultasituacioncoleccion_opcionesds_17_tflb_obscr_sel = AV62TFLb_ObsCR_Sel ;
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( ( GRID_nRecordCount >= subgrid_fnc_recordsperpage( ) ) && ( GRID_nEOF == 0 ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV7Emprcod, AV8Lb_numero, AV21TFLb_opcion, AV22TFLb_opcion_Sel, AV23TFLb_FechaEn, AV27TFLb_HoraEn, AV31TFLb_FechaR, AV35TFLb_HoraR, AV39TFLb_CosteE, AV40TFLb_CosteE_To, AV57TFLb_CosteC, AV58TFLb_CosteC_To, AV49TFLb_FecNoa1, AV53TFLb_hhnoa1, AV64TFLb_Estado_Sels, AV59TFLb_ProvDef, AV60TFLb_ProvDef_Sel, AV61TFLb_ObsCR, AV62TFLb_ObsCR_Sel, AV67Pgmname, AV14OrderedBy, AV15OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV71Gestionlaboratorio_consultasituacioncoleccion_opcionesds_1_tflb_opcion = AV21TFLb_opcion ;
      AV72Gestionlaboratorio_consultasituacioncoleccion_opcionesds_2_tflb_opcion_sel = AV22TFLb_opcion_Sel ;
      AV73Gestionlaboratorio_consultasituacioncoleccion_opcionesds_3_tflb_fechaen = AV23TFLb_FechaEn ;
      AV74Gestionlaboratorio_consultasituacioncoleccion_opcionesds_4_tflb_horaen = AV27TFLb_HoraEn ;
      AV75Gestionlaboratorio_consultasituacioncoleccion_opcionesds_5_tflb_fechar = AV31TFLb_FechaR ;
      AV76Gestionlaboratorio_consultasituacioncoleccion_opcionesds_6_tflb_horar = AV35TFLb_HoraR ;
      AV77Gestionlaboratorio_consultasituacioncoleccion_opcionesds_7_tflb_costee = AV39TFLb_CosteE ;
      AV78Gestionlaboratorio_consultasituacioncoleccion_opcionesds_8_tflb_costee_to = AV40TFLb_CosteE_To ;
      AV79Gestionlaboratorio_consultasituacioncoleccion_opcionesds_9_tflb_costec = AV57TFLb_CosteC ;
      AV80Gestionlaboratorio_consultasituacioncoleccion_opcionesds_10_tflb_costec_to = AV58TFLb_CosteC_To ;
      AV81Gestionlaboratorio_consultasituacioncoleccion_opcionesds_11_tflb_fecnoa1 = AV49TFLb_FecNoa1 ;
      AV82Gestionlaboratorio_consultasituacioncoleccion_opcionesds_12_tflb_hhnoa1 = AV53TFLb_hhnoa1 ;
      AV83Gestionlaboratorio_consultasituacioncoleccion_opcionesds_13_tflb_estado_sels = AV64TFLb_Estado_Sels ;
      AV84Gestionlaboratorio_consultasituacioncoleccion_opcionesds_14_tflb_provdef = AV59TFLb_ProvDef ;
      AV85Gestionlaboratorio_consultasituacioncoleccion_opcionesds_15_tflb_provdef_sel = AV60TFLb_ProvDef_Sel ;
      AV86Gestionlaboratorio_consultasituacioncoleccion_opcionesds_16_tflb_obscr = AV61TFLb_ObsCR ;
      AV87Gestionlaboratorio_consultasituacioncoleccion_opcionesds_17_tflb_obscr_sel = AV62TFLb_ObsCR_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7Emprcod, AV8Lb_numero, AV21TFLb_opcion, AV22TFLb_opcion_Sel, AV23TFLb_FechaEn, AV27TFLb_HoraEn, AV31TFLb_FechaR, AV35TFLb_HoraR, AV39TFLb_CosteE, AV40TFLb_CosteE_To, AV57TFLb_CosteC, AV58TFLb_CosteC_To, AV49TFLb_FecNoa1, AV53TFLb_hhnoa1, AV64TFLb_Estado_Sels, AV59TFLb_ProvDef, AV60TFLb_ProvDef_Sel, AV61TFLb_ObsCR, AV62TFLb_ObsCR_Sel, AV67Pgmname, AV14OrderedBy, AV15OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV71Gestionlaboratorio_consultasituacioncoleccion_opcionesds_1_tflb_opcion = AV21TFLb_opcion ;
      AV72Gestionlaboratorio_consultasituacioncoleccion_opcionesds_2_tflb_opcion_sel = AV22TFLb_opcion_Sel ;
      AV73Gestionlaboratorio_consultasituacioncoleccion_opcionesds_3_tflb_fechaen = AV23TFLb_FechaEn ;
      AV74Gestionlaboratorio_consultasituacioncoleccion_opcionesds_4_tflb_horaen = AV27TFLb_HoraEn ;
      AV75Gestionlaboratorio_consultasituacioncoleccion_opcionesds_5_tflb_fechar = AV31TFLb_FechaR ;
      AV76Gestionlaboratorio_consultasituacioncoleccion_opcionesds_6_tflb_horar = AV35TFLb_HoraR ;
      AV77Gestionlaboratorio_consultasituacioncoleccion_opcionesds_7_tflb_costee = AV39TFLb_CosteE ;
      AV78Gestionlaboratorio_consultasituacioncoleccion_opcionesds_8_tflb_costee_to = AV40TFLb_CosteE_To ;
      AV79Gestionlaboratorio_consultasituacioncoleccion_opcionesds_9_tflb_costec = AV57TFLb_CosteC ;
      AV80Gestionlaboratorio_consultasituacioncoleccion_opcionesds_10_tflb_costec_to = AV58TFLb_CosteC_To ;
      AV81Gestionlaboratorio_consultasituacioncoleccion_opcionesds_11_tflb_fecnoa1 = AV49TFLb_FecNoa1 ;
      AV82Gestionlaboratorio_consultasituacioncoleccion_opcionesds_12_tflb_hhnoa1 = AV53TFLb_hhnoa1 ;
      AV83Gestionlaboratorio_consultasituacioncoleccion_opcionesds_13_tflb_estado_sels = AV64TFLb_Estado_Sels ;
      AV84Gestionlaboratorio_consultasituacioncoleccion_opcionesds_14_tflb_provdef = AV59TFLb_ProvDef ;
      AV85Gestionlaboratorio_consultasituacioncoleccion_opcionesds_15_tflb_provdef_sel = AV60TFLb_ProvDef_Sel ;
      AV86Gestionlaboratorio_consultasituacioncoleccion_opcionesds_16_tflb_obscr = AV61TFLb_ObsCR ;
      AV87Gestionlaboratorio_consultasituacioncoleccion_opcionesds_17_tflb_obscr_sel = AV62TFLb_ObsCR_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7Emprcod, AV8Lb_numero, AV21TFLb_opcion, AV22TFLb_opcion_Sel, AV23TFLb_FechaEn, AV27TFLb_HoraEn, AV31TFLb_FechaR, AV35TFLb_HoraR, AV39TFLb_CosteE, AV40TFLb_CosteE_To, AV57TFLb_CosteC, AV58TFLb_CosteC_To, AV49TFLb_FecNoa1, AV53TFLb_hhnoa1, AV64TFLb_Estado_Sels, AV59TFLb_ProvDef, AV60TFLb_ProvDef_Sel, AV61TFLb_ObsCR, AV62TFLb_ObsCR_Sel, AV67Pgmname, AV14OrderedBy, AV15OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV71Gestionlaboratorio_consultasituacioncoleccion_opcionesds_1_tflb_opcion = AV21TFLb_opcion ;
      AV72Gestionlaboratorio_consultasituacioncoleccion_opcionesds_2_tflb_opcion_sel = AV22TFLb_opcion_Sel ;
      AV73Gestionlaboratorio_consultasituacioncoleccion_opcionesds_3_tflb_fechaen = AV23TFLb_FechaEn ;
      AV74Gestionlaboratorio_consultasituacioncoleccion_opcionesds_4_tflb_horaen = AV27TFLb_HoraEn ;
      AV75Gestionlaboratorio_consultasituacioncoleccion_opcionesds_5_tflb_fechar = AV31TFLb_FechaR ;
      AV76Gestionlaboratorio_consultasituacioncoleccion_opcionesds_6_tflb_horar = AV35TFLb_HoraR ;
      AV77Gestionlaboratorio_consultasituacioncoleccion_opcionesds_7_tflb_costee = AV39TFLb_CosteE ;
      AV78Gestionlaboratorio_consultasituacioncoleccion_opcionesds_8_tflb_costee_to = AV40TFLb_CosteE_To ;
      AV79Gestionlaboratorio_consultasituacioncoleccion_opcionesds_9_tflb_costec = AV57TFLb_CosteC ;
      AV80Gestionlaboratorio_consultasituacioncoleccion_opcionesds_10_tflb_costec_to = AV58TFLb_CosteC_To ;
      AV81Gestionlaboratorio_consultasituacioncoleccion_opcionesds_11_tflb_fecnoa1 = AV49TFLb_FecNoa1 ;
      AV82Gestionlaboratorio_consultasituacioncoleccion_opcionesds_12_tflb_hhnoa1 = AV53TFLb_hhnoa1 ;
      AV83Gestionlaboratorio_consultasituacioncoleccion_opcionesds_13_tflb_estado_sels = AV64TFLb_Estado_Sels ;
      AV84Gestionlaboratorio_consultasituacioncoleccion_opcionesds_14_tflb_provdef = AV59TFLb_ProvDef ;
      AV85Gestionlaboratorio_consultasituacioncoleccion_opcionesds_15_tflb_provdef_sel = AV60TFLb_ProvDef_Sel ;
      AV86Gestionlaboratorio_consultasituacioncoleccion_opcionesds_16_tflb_obscr = AV61TFLb_ObsCR ;
      AV87Gestionlaboratorio_consultasituacioncoleccion_opcionesds_17_tflb_obscr_sel = AV62TFLb_ObsCR_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7Emprcod, AV8Lb_numero, AV21TFLb_opcion, AV22TFLb_opcion_Sel, AV23TFLb_FechaEn, AV27TFLb_HoraEn, AV31TFLb_FechaR, AV35TFLb_HoraR, AV39TFLb_CosteE, AV40TFLb_CosteE_To, AV57TFLb_CosteC, AV58TFLb_CosteC_To, AV49TFLb_FecNoa1, AV53TFLb_hhnoa1, AV64TFLb_Estado_Sels, AV59TFLb_ProvDef, AV60TFLb_ProvDef_Sel, AV61TFLb_ObsCR, AV62TFLb_ObsCR_Sel, AV67Pgmname, AV14OrderedBy, AV15OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV67Pgmname = "GestionLaboratorio.ConsultaSituacionColeccion_Opciones" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67Pgmname", AV67Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1U90( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e121U92 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV45DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_17 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_17"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV7Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV7Emprcod") ;
         wcpOAV8Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV8Lb_numero"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Ddo_grid_Allowmultipleselection = httpContext.cgiGet( sPrefix+"DDO_GRID_Allowmultipleselection") ;
         Ddo_grid_Datalistfixedvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalistfixedvalues") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalistproc") ;
         Grid_titlescategories_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_TITLESCATEGORIES_Gridinternalname") ;
         Grid_titlescategories_Gridtitlescategories = httpContext.cgiGet( sPrefix+"GRID_TITLESCATEGORIES_Gridtitlescategories") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hascategories = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascategories")) ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         /* Read variables values. */
         AV67Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67Pgmname", AV67Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_lb_fechaenauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_LB_FECHAENAUXDATE");
            GX_FocusControl = edtavDdo_lb_fechaenauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV25DDO_Lb_FechaEnAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25DDO_Lb_FechaEnAuxDate", localUtil.format(AV25DDO_Lb_FechaEnAuxDate, "99/99/99"));
         }
         else
         {
            AV25DDO_Lb_FechaEnAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_lb_fechaenauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25DDO_Lb_FechaEnAuxDate", localUtil.format(AV25DDO_Lb_FechaEnAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_lb_horaenauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_LB_HORAENAUXDATE");
            GX_FocusControl = edtavDdo_lb_horaenauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV29DDO_Lb_HoraEnAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29DDO_Lb_HoraEnAuxDate", localUtil.format(AV29DDO_Lb_HoraEnAuxDate, "99/99/99"));
         }
         else
         {
            AV29DDO_Lb_HoraEnAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_lb_horaenauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29DDO_Lb_HoraEnAuxDate", localUtil.format(AV29DDO_Lb_HoraEnAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_lb_fecharauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_LB_FECHARAUXDATE");
            GX_FocusControl = edtavDdo_lb_fecharauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV33DDO_Lb_FechaRAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33DDO_Lb_FechaRAuxDate", localUtil.format(AV33DDO_Lb_FechaRAuxDate, "99/99/99"));
         }
         else
         {
            AV33DDO_Lb_FechaRAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_lb_fecharauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33DDO_Lb_FechaRAuxDate", localUtil.format(AV33DDO_Lb_FechaRAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_lb_horarauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_LB_HORARAUXDATE");
            GX_FocusControl = edtavDdo_lb_horarauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV37DDO_Lb_HoraRAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37DDO_Lb_HoraRAuxDate", localUtil.format(AV37DDO_Lb_HoraRAuxDate, "99/99/99"));
         }
         else
         {
            AV37DDO_Lb_HoraRAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_lb_horarauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37DDO_Lb_HoraRAuxDate", localUtil.format(AV37DDO_Lb_HoraRAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_lb_fecnoa1auxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_LB_FECNOA1AUXDATE");
            GX_FocusControl = edtavDdo_lb_fecnoa1auxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV51DDO_Lb_FecNoa1AuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51DDO_Lb_FecNoa1AuxDate", localUtil.format(AV51DDO_Lb_FecNoa1AuxDate, "99/99/99"));
         }
         else
         {
            AV51DDO_Lb_FecNoa1AuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_lb_fecnoa1auxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51DDO_Lb_FecNoa1AuxDate", localUtil.format(AV51DDO_Lb_FecNoa1AuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_lb_hhnoa1auxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_LB_HHNOA1AUXDATE");
            GX_FocusControl = edtavDdo_lb_hhnoa1auxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV55DDO_Lb_hhnoa1AuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55DDO_Lb_hhnoa1AuxDate", localUtil.format(AV55DDO_Lb_hhnoa1AuxDate, "99/99/99"));
         }
         else
         {
            AV55DDO_Lb_hhnoa1AuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_lb_hhnoa1auxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55DDO_Lb_hhnoa1AuxDate", localUtil.format(AV55DDO_Lb_hhnoa1AuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ConsultaSituacionColeccion_Opciones");
         AV67Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67Pgmname", AV67Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV67Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("gestionlaboratorio\\consultasituacioncoleccion_opciones:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e121U92 ();
      if (returnInSub) return;
   }

   public void e121U92( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV68Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      consultasituacioncoleccion_opciones_impl.this.GXt_char1 = GXv_char2[0] ;
      AV68Station = GXt_char1 ;
      GXv_char2[0] = AV7Emprcod ;
      GXv_char3[0] = AV69Emprnom ;
      GXv_char4[0] = AV70Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV68Station, GXv_char2, GXv_char3, GXv_char4) ;
      consultasituacioncoleccion_opciones_impl.this.AV7Emprcod = GXv_char2[0] ;
      consultasituacioncoleccion_opciones_impl.this.AV69Emprnom = GXv_char3[0] ;
      consultasituacioncoleccion_opciones_impl.this.AV70Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Emprcod", AV7Emprcod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Grid_titlescategories_Gridinternalname = subGrid_Internalname ;
      ucGrid_titlescategories.sendProperty(context, sPrefix, false, Grid_titlescategories_Internalname, "GridInternalName", Grid_titlescategories_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      if ( AV14OrderedBy < 1 )
      {
         AV14OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV45DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV45DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
   }

   public void e131U92( )
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
      AV71Gestionlaboratorio_consultasituacioncoleccion_opcionesds_1_tflb_opcion = AV21TFLb_opcion ;
      AV72Gestionlaboratorio_consultasituacioncoleccion_opcionesds_2_tflb_opcion_sel = AV22TFLb_opcion_Sel ;
      AV73Gestionlaboratorio_consultasituacioncoleccion_opcionesds_3_tflb_fechaen = AV23TFLb_FechaEn ;
      AV74Gestionlaboratorio_consultasituacioncoleccion_opcionesds_4_tflb_horaen = AV27TFLb_HoraEn ;
      AV75Gestionlaboratorio_consultasituacioncoleccion_opcionesds_5_tflb_fechar = AV31TFLb_FechaR ;
      AV76Gestionlaboratorio_consultasituacioncoleccion_opcionesds_6_tflb_horar = AV35TFLb_HoraR ;
      AV77Gestionlaboratorio_consultasituacioncoleccion_opcionesds_7_tflb_costee = AV39TFLb_CosteE ;
      AV78Gestionlaboratorio_consultasituacioncoleccion_opcionesds_8_tflb_costee_to = AV40TFLb_CosteE_To ;
      AV79Gestionlaboratorio_consultasituacioncoleccion_opcionesds_9_tflb_costec = AV57TFLb_CosteC ;
      AV80Gestionlaboratorio_consultasituacioncoleccion_opcionesds_10_tflb_costec_to = AV58TFLb_CosteC_To ;
      AV81Gestionlaboratorio_consultasituacioncoleccion_opcionesds_11_tflb_fecnoa1 = AV49TFLb_FecNoa1 ;
      AV82Gestionlaboratorio_consultasituacioncoleccion_opcionesds_12_tflb_hhnoa1 = AV53TFLb_hhnoa1 ;
      AV83Gestionlaboratorio_consultasituacioncoleccion_opcionesds_13_tflb_estado_sels = AV64TFLb_Estado_Sels ;
      AV84Gestionlaboratorio_consultasituacioncoleccion_opcionesds_14_tflb_provdef = AV59TFLb_ProvDef ;
      AV85Gestionlaboratorio_consultasituacioncoleccion_opcionesds_15_tflb_provdef_sel = AV60TFLb_ProvDef_Sel ;
      AV86Gestionlaboratorio_consultasituacioncoleccion_opcionesds_16_tflb_obscr = AV61TFLb_ObsCR ;
      AV87Gestionlaboratorio_consultasituacioncoleccion_opcionesds_17_tflb_obscr_sel = AV62TFLb_ObsCR_Sel ;
   }

   public void e111U92( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV14OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14OrderedBy), 4, 0));
         AV15OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15OrderedDsc", AV15OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_opcion") == 0 )
         {
            AV21TFLb_opcion = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21TFLb_opcion", AV21TFLb_opcion);
            AV22TFLb_opcion_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22TFLb_opcion_Sel", AV22TFLb_opcion_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_FechaEn") == 0 )
         {
            AV23TFLb_FechaEn = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23TFLb_FechaEn", localUtil.format(AV23TFLb_FechaEn, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_HoraEn") == 0 )
         {
            AV27TFLb_HoraEn = GXutil.resetDate(localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFLb_HoraEn", localUtil.ttoc( AV27TFLb_HoraEn, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_FechaR") == 0 )
         {
            AV31TFLb_FechaR = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFLb_FechaR", localUtil.format(AV31TFLb_FechaR, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_HoraR") == 0 )
         {
            AV35TFLb_HoraR = GXutil.resetDate(localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFLb_HoraR", localUtil.ttoc( AV35TFLb_HoraR, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_CosteE") == 0 )
         {
            AV39TFLb_CosteE = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFLb_CosteE", GXutil.ltrimstr( AV39TFLb_CosteE, 11, 5));
            AV40TFLb_CosteE_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFLb_CosteE_To", GXutil.ltrimstr( AV40TFLb_CosteE_To, 11, 5));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_CosteC") == 0 )
         {
            AV57TFLb_CosteC = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFLb_CosteC", GXutil.ltrimstr( AV57TFLb_CosteC, 11, 5));
            AV58TFLb_CosteC_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFLb_CosteC_To", GXutil.ltrimstr( AV58TFLb_CosteC_To, 11, 5));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_FecNoa1") == 0 )
         {
            AV49TFLb_FecNoa1 = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFLb_FecNoa1", localUtil.format(AV49TFLb_FecNoa1, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_hhnoa1") == 0 )
         {
            AV53TFLb_hhnoa1 = GXutil.resetDate(localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFLb_hhnoa1", localUtil.ttoc( AV53TFLb_hhnoa1, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_Estado") == 0 )
         {
            AV63TFLb_Estado_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFLb_Estado_SelsJson", AV63TFLb_Estado_SelsJson);
            AV64TFLb_Estado_Sels.fromJSonString(GXutil.strReplace( AV63TFLb_Estado_SelsJson, "\"", ""), null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_ProvDef") == 0 )
         {
            AV59TFLb_ProvDef = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFLb_ProvDef", AV59TFLb_ProvDef);
            AV60TFLb_ProvDef_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFLb_ProvDef_Sel", AV60TFLb_ProvDef_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_ObsCR") == 0 )
         {
            AV61TFLb_ObsCR = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFLb_ObsCR", AV61TFLb_ObsCR);
            AV62TFLb_ObsCR_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFLb_ObsCR_Sel", AV62TFLb_ObsCR_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV64TFLb_Estado_Sels", AV64TFLb_Estado_Sels);
   }

   private void e141U92( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
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
   }

   public void S132( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV14OrderedBy, 4, 0))+":"+(AV15OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV17Session.getValue(AV67Pgmname+"GridState"), "") == 0 )
      {
         AV12GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV67Pgmname+"GridState"), null, null);
      }
      else
      {
         AV12GridState.fromxml(AV17Session.getValue(AV67Pgmname+"GridState"), null, null);
      }
      AV14OrderedBy = AV12GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14OrderedBy), 4, 0));
      AV15OrderedDsc = AV12GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15OrderedDsc", AV15OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV88GXV1 = 1 ;
      while ( AV88GXV1 <= AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV13GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV88GXV1));
         if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OPCION") == 0 )
         {
            AV21TFLb_opcion = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21TFLb_opcion", AV21TFLb_opcion);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OPCION_SEL") == 0 )
         {
            AV22TFLb_opcion_Sel = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22TFLb_opcion_Sel", AV22TFLb_opcion_Sel);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAEN") == 0 )
         {
            AV23TFLb_FechaEn = localUtil.ctod( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23TFLb_FechaEn", localUtil.format(AV23TFLb_FechaEn, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_HORAEN") == 0 )
         {
            AV27TFLb_HoraEn = GXutil.resetDate(localUtil.ctot( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFLb_HoraEn", localUtil.ttoc( AV27TFLb_HoraEn, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV29DDO_Lb_HoraEnAuxDate = GXutil.resetTime(AV27TFLb_HoraEn) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29DDO_Lb_HoraEnAuxDate", localUtil.format(AV29DDO_Lb_HoraEnAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAR") == 0 )
         {
            AV31TFLb_FechaR = localUtil.ctod( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFLb_FechaR", localUtil.format(AV31TFLb_FechaR, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_HORAR") == 0 )
         {
            AV35TFLb_HoraR = GXutil.resetDate(localUtil.ctot( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFLb_HoraR", localUtil.ttoc( AV35TFLb_HoraR, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV37DDO_Lb_HoraRAuxDate = GXutil.resetTime(AV35TFLb_HoraR) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37DDO_Lb_HoraRAuxDate", localUtil.format(AV37DDO_Lb_HoraRAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COSTEE") == 0 )
         {
            AV39TFLb_CosteE = CommonUtil.decimalVal( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFLb_CosteE", GXutil.ltrimstr( AV39TFLb_CosteE, 11, 5));
            AV40TFLb_CosteE_To = CommonUtil.decimalVal( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFLb_CosteE_To", GXutil.ltrimstr( AV40TFLb_CosteE_To, 11, 5));
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COSTEC") == 0 )
         {
            AV57TFLb_CosteC = CommonUtil.decimalVal( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFLb_CosteC", GXutil.ltrimstr( AV57TFLb_CosteC, 11, 5));
            AV58TFLb_CosteC_To = CommonUtil.decimalVal( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFLb_CosteC_To", GXutil.ltrimstr( AV58TFLb_CosteC_To, 11, 5));
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECNOA1") == 0 )
         {
            AV49TFLb_FecNoa1 = localUtil.ctod( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFLb_FecNoa1", localUtil.format(AV49TFLb_FecNoa1, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_HHNOA1") == 0 )
         {
            AV53TFLb_hhnoa1 = GXutil.resetDate(localUtil.ctot( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFLb_hhnoa1", localUtil.ttoc( AV53TFLb_hhnoa1, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV55DDO_Lb_hhnoa1AuxDate = GXutil.resetTime(AV53TFLb_hhnoa1) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55DDO_Lb_hhnoa1AuxDate", localUtil.format(AV55DDO_Lb_hhnoa1AuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ESTADO_SEL") == 0 )
         {
            AV63TFLb_Estado_SelsJson = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFLb_Estado_SelsJson", AV63TFLb_Estado_SelsJson);
            AV64TFLb_Estado_Sels.fromJSonString(AV63TFLb_Estado_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_PROVDEF") == 0 )
         {
            AV59TFLb_ProvDef = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFLb_ProvDef", AV59TFLb_ProvDef);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_PROVDEF_SEL") == 0 )
         {
            AV60TFLb_ProvDef_Sel = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFLb_ProvDef_Sel", AV60TFLb_ProvDef_Sel);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OBSCR") == 0 )
         {
            AV61TFLb_ObsCR = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFLb_ObsCR", AV61TFLb_ObsCR);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OBSCR_SEL") == 0 )
         {
            AV62TFLb_ObsCR_Sel = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFLb_ObsCR_Sel", AV62TFLb_ObsCR_Sel);
         }
         AV88GXV1 = (int)(AV88GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV22TFLb_opcion_Sel)==0), AV22TFLb_opcion_Sel, GXv_char4) ;
      consultasituacioncoleccion_opciones_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char8 = "" ;
      GXv_char3[0] = GXt_char8 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV60TFLb_ProvDef_Sel)==0), AV60TFLb_ProvDef_Sel, GXv_char3) ;
      consultasituacioncoleccion_opciones_impl.this.GXt_char8 = GXv_char3[0] ;
      GXt_char9 = "" ;
      GXv_char2[0] = GXt_char9 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV62TFLb_ObsCR_Sel)==0), AV62TFLb_ObsCR_Sel, GXv_char2) ;
      consultasituacioncoleccion_opciones_impl.this.GXt_char9 = GXv_char2[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|||||||||"+((AV64TFLb_Estado_Sels.size()==0) ? "" : AV63TFLb_Estado_SelsJson)+"|"+GXt_char8+"|"+GXt_char9 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char9 = "" ;
      GXv_char4[0] = GXt_char9 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV21TFLb_opcion)==0), AV21TFLb_opcion, GXv_char4) ;
      consultasituacioncoleccion_opciones_impl.this.GXt_char9 = GXv_char4[0] ;
      GXt_char8 = "" ;
      GXv_char3[0] = GXt_char8 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV59TFLb_ProvDef)==0), AV59TFLb_ProvDef, GXv_char3) ;
      consultasituacioncoleccion_opciones_impl.this.GXt_char8 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV61TFLb_ObsCR)==0), AV61TFLb_ObsCR, GXv_char2) ;
      consultasituacioncoleccion_opciones_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = GXt_char9+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV23TFLb_FechaEn)) ? "" : localUtil.dtoc( AV23TFLb_FechaEn, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV27TFLb_HoraEn) ? "" : localUtil.dtoc( AV29DDO_Lb_HoraEnAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV31TFLb_FechaR)) ? "" : localUtil.dtoc( AV31TFLb_FechaR, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV35TFLb_HoraR) ? "" : localUtil.dtoc( AV37DDO_Lb_HoraRAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFLb_CosteE)==0) ? "" : GXutil.str( AV39TFLb_CosteE, 11, 5))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV57TFLb_CosteC)==0) ? "" : GXutil.str( AV57TFLb_CosteC, 11, 5))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV49TFLb_FecNoa1)) ? "" : localUtil.dtoc( AV49TFLb_FecNoa1, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV53TFLb_hhnoa1) ? "" : localUtil.dtoc( AV55DDO_Lb_hhnoa1AuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"||"+GXt_char8+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|||||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFLb_CosteE_To)==0) ? "" : GXutil.str( AV40TFLb_CosteE_To, 11, 5))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV58TFLb_CosteC_To)==0) ? "" : GXutil.str( AV58TFLb_CosteC_To, 11, 5))+"|||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV12GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV12GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV12GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S142( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV12GridState.fromxml(AV17Session.getValue(AV67Pgmname+"GridState"), null, null);
      AV12GridState.setgxTv_SdtWWPGridState_Orderedby( AV14OrderedBy );
      AV12GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV15OrderedDsc );
      AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState10[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFLB_OPCION", "", !(GXutil.strcmp("", AV21TFLb_opcion)==0), (short)(0), AV21TFLb_opcion, "", !(GXutil.strcmp("", AV22TFLb_opcion_Sel)==0), AV22TFLb_opcion_Sel, "") ;
      AV12GridState = GXv_SdtWWPGridState10[0] ;
      GXv_SdtWWPGridState10[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFLB_FECHAEN", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV23TFLb_FechaEn)), (short)(0), GXutil.trim( localUtil.dtoc( AV23TFLb_FechaEn, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV12GridState = GXv_SdtWWPGridState10[0] ;
      GXv_SdtWWPGridState10[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFLB_HORAEN", "", !GXutil.dateCompare(GXutil.nullDate(), AV27TFLb_HoraEn), (short)(0), GXutil.trim( localUtil.ttoc( AV27TFLb_HoraEn, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV12GridState = GXv_SdtWWPGridState10[0] ;
      GXv_SdtWWPGridState10[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFLB_FECHAR", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV31TFLb_FechaR)), (short)(0), GXutil.trim( localUtil.dtoc( AV31TFLb_FechaR, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV12GridState = GXv_SdtWWPGridState10[0] ;
      GXv_SdtWWPGridState10[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFLB_HORAR", "", !GXutil.dateCompare(GXutil.nullDate(), AV35TFLb_HoraR), (short)(0), GXutil.trim( localUtil.ttoc( AV35TFLb_HoraR, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV12GridState = GXv_SdtWWPGridState10[0] ;
      GXv_SdtWWPGridState10[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFLB_COSTEE", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFLb_CosteE)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFLb_CosteE_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV39TFLb_CosteE, 11, 5)), GXutil.trim( GXutil.str( AV40TFLb_CosteE_To, 11, 5))) ;
      AV12GridState = GXv_SdtWWPGridState10[0] ;
      GXv_SdtWWPGridState10[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFLB_COSTEC", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV57TFLb_CosteC)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV58TFLb_CosteC_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV57TFLb_CosteC, 11, 5)), GXutil.trim( GXutil.str( AV58TFLb_CosteC_To, 11, 5))) ;
      AV12GridState = GXv_SdtWWPGridState10[0] ;
      GXv_SdtWWPGridState10[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFLB_FECNOA1", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV49TFLb_FecNoa1)), (short)(0), GXutil.trim( localUtil.dtoc( AV49TFLb_FecNoa1, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV12GridState = GXv_SdtWWPGridState10[0] ;
      GXv_SdtWWPGridState10[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFLB_HHNOA1", "", !GXutil.dateCompare(GXutil.nullDate(), AV53TFLb_hhnoa1), (short)(0), GXutil.trim( localUtil.ttoc( AV53TFLb_hhnoa1, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV12GridState = GXv_SdtWWPGridState10[0] ;
      GXv_SdtWWPGridState10[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFLB_ESTADO_SEL", "", !(AV64TFLb_Estado_Sels.size()==0), (short)(0), AV64TFLb_Estado_Sels.toJSonString(false), "") ;
      AV12GridState = GXv_SdtWWPGridState10[0] ;
      GXv_SdtWWPGridState10[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFLB_PROVDEF", "", !(GXutil.strcmp("", AV59TFLb_ProvDef)==0), (short)(0), AV59TFLb_ProvDef, "", !(GXutil.strcmp("", AV60TFLb_ProvDef_Sel)==0), AV60TFLb_ProvDef_Sel, "") ;
      AV12GridState = GXv_SdtWWPGridState10[0] ;
      GXv_SdtWWPGridState10[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFLB_OBSCR", "", !(GXutil.strcmp("", AV61TFLb_ObsCR)==0), (short)(0), AV61TFLb_ObsCR, "", !(GXutil.strcmp("", AV62TFLb_ObsCR_Sel)==0), AV62TFLb_ObsCR_Sel, "") ;
      AV12GridState = GXv_SdtWWPGridState10[0] ;
      if ( ! (GXutil.strcmp("", AV7Emprcod)==0) )
      {
         AV13GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV13GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV13GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV7Emprcod );
         AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV13GridStateFilterValue, 0);
      }
      if ( ! (0==AV8Lb_numero) )
      {
         AV13GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV13GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_NUMERO" );
         AV13GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV8Lb_numero, 8, 0) );
         AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV13GridStateFilterValue, 0);
      }
      AV12GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV12GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV67Pgmname+"GridState", AV12GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV10TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV10TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV67Pgmname );
      AV10TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV10TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV9HTTPRequest.getScriptName()+"?"+AV9HTTPRequest.getQuerystring() );
      AV10TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "GestionLaboratorio.TENS003" );
      AV17Session.setValue("TrnContext", AV10TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_9_1U92( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablerightheader_Internalname, tblTablerightheader_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_9_1U92e( true) ;
      }
      else
      {
         wb_table1_9_1U92e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV7Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Emprcod", AV7Emprcod);
      AV8Lb_numero = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Lb_numero), 8, 0));
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
      pa1U92( ) ;
      ws1U92( ) ;
      we1U92( ) ;
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
      sCtrlAV7Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV8Lb_numero = (String)getParm(obj,1,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1U92( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "gestionlaboratorio\\consultasituacioncoleccion_opciones", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1U92( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV7Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Emprcod", AV7Emprcod);
         AV8Lb_numero = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Lb_numero), 8, 0));
      }
      wcpOAV7Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV7Emprcod") ;
      wcpOAV8Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV8Lb_numero"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV7Emprcod, wcpOAV7Emprcod) != 0 ) || ( AV8Lb_numero != wcpOAV8Lb_numero ) ) )
      {
         setjustcreated();
      }
      wcpOAV7Emprcod = AV7Emprcod ;
      wcpOAV8Lb_numero = AV8Lb_numero ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV7Emprcod = httpContext.cgiGet( sPrefix+"AV7Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV7Emprcod) > 0 )
      {
         AV7Emprcod = httpContext.cgiGet( sCtrlAV7Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Emprcod", AV7Emprcod);
      }
      else
      {
         AV7Emprcod = httpContext.cgiGet( sPrefix+"AV7Emprcod_PARM") ;
      }
      sCtrlAV8Lb_numero = httpContext.cgiGet( sPrefix+"AV8Lb_numero_CTRL") ;
      if ( GXutil.len( sCtrlAV8Lb_numero) > 0 )
      {
         AV8Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV8Lb_numero), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Lb_numero), 8, 0));
      }
      else
      {
         AV8Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV8Lb_numero_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa1U92( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1U92( ) ;
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
      ws1U92( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Emprcod_PARM", GXutil.rtrim( AV7Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Emprcod_CTRL", GXutil.rtrim( sCtrlAV7Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8Lb_numero_PARM", GXutil.ltrim( localUtil.ntoc( AV8Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8Lb_numero)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8Lb_numero_CTRL", GXutil.rtrim( sCtrlAV8Lb_numero));
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
      we1U92( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211655418", true, true);
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
      httpContext.AddJavascriptSource("gestionlaboratorio/consultasituacioncoleccion_opciones.js", "?20268211655418", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_172( )
   {
      edtLb_opcion_Internalname = sPrefix+"LB_OPCION_"+sGXsfl_17_idx ;
      edtLb_FechaEn_Internalname = sPrefix+"LB_FECHAEN_"+sGXsfl_17_idx ;
      edtLb_HoraEn_Internalname = sPrefix+"LB_HORAEN_"+sGXsfl_17_idx ;
      edtLb_FechaR_Internalname = sPrefix+"LB_FECHAR_"+sGXsfl_17_idx ;
      edtLb_HoraR_Internalname = sPrefix+"LB_HORAR_"+sGXsfl_17_idx ;
      edtLb_CosteE_Internalname = sPrefix+"LB_COSTEE_"+sGXsfl_17_idx ;
      edtLb_CosteC_Internalname = sPrefix+"LB_COSTEC_"+sGXsfl_17_idx ;
      edtLb_FecNoa1_Internalname = sPrefix+"LB_FECNOA1_"+sGXsfl_17_idx ;
      edtLb_hhnoa1_Internalname = sPrefix+"LB_HHNOA1_"+sGXsfl_17_idx ;
      cmbLb_Estado.setInternalname( sPrefix+"LB_ESTADO_"+sGXsfl_17_idx );
      edtLb_ProvDef_Internalname = sPrefix+"LB_PROVDEF_"+sGXsfl_17_idx ;
      edtLb_ObsCR_Internalname = sPrefix+"LB_OBSCR_"+sGXsfl_17_idx ;
   }

   public void subsflControlProps_fel_172( )
   {
      edtLb_opcion_Internalname = sPrefix+"LB_OPCION_"+sGXsfl_17_fel_idx ;
      edtLb_FechaEn_Internalname = sPrefix+"LB_FECHAEN_"+sGXsfl_17_fel_idx ;
      edtLb_HoraEn_Internalname = sPrefix+"LB_HORAEN_"+sGXsfl_17_fel_idx ;
      edtLb_FechaR_Internalname = sPrefix+"LB_FECHAR_"+sGXsfl_17_fel_idx ;
      edtLb_HoraR_Internalname = sPrefix+"LB_HORAR_"+sGXsfl_17_fel_idx ;
      edtLb_CosteE_Internalname = sPrefix+"LB_COSTEE_"+sGXsfl_17_fel_idx ;
      edtLb_CosteC_Internalname = sPrefix+"LB_COSTEC_"+sGXsfl_17_fel_idx ;
      edtLb_FecNoa1_Internalname = sPrefix+"LB_FECNOA1_"+sGXsfl_17_fel_idx ;
      edtLb_hhnoa1_Internalname = sPrefix+"LB_HHNOA1_"+sGXsfl_17_fel_idx ;
      cmbLb_Estado.setInternalname( sPrefix+"LB_ESTADO_"+sGXsfl_17_fel_idx );
      edtLb_ProvDef_Internalname = sPrefix+"LB_PROVDEF_"+sGXsfl_17_fel_idx ;
      edtLb_ObsCR_Internalname = sPrefix+"LB_OBSCR_"+sGXsfl_17_fel_idx ;
   }

   public void sendrow_172( )
   {
      subsflControlProps_172( ) ;
      wb1U90( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_17_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_opcion_Internalname,GXutil.rtrim( A5555Lb_opcion),GXutil.rtrim( localUtil.format( A5555Lb_opcion, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_opcion_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_FechaEn_Internalname,localUtil.format(A5567Lb_FechaEn, "99/99/99"),localUtil.format( A5567Lb_FechaEn, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_FechaEn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_HoraEn_Internalname,localUtil.ttoc( A5568Lb_HoraEn, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A5568Lb_HoraEn, "99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_HoraEn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_FechaR_Internalname,localUtil.format(A5563Lb_FechaR, "99/99/99"),localUtil.format( A5563Lb_FechaR, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_FechaR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_HoraR_Internalname,localUtil.ttoc( A5564Lb_HoraR, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A5564Lb_HoraR, "99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_HoraR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_CosteE_Internalname,GXutil.ltrim( localUtil.ntoc( A5565Lb_CosteE, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A5565Lb_CosteE, "ZZZZ9.99999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_CosteE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_CosteC_Internalname,GXutil.ltrim( localUtil.ntoc( A1127Lb_CosteC, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1127Lb_CosteC, "ZZZZ9.99999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_CosteC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_FecNoa1_Internalname,localUtil.format(A6461Lb_FecNoa1, "99/99/99"),localUtil.format( A6461Lb_FecNoa1, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_FecNoa1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_hhnoa1_Internalname,localUtil.ttoc( A10082Lb_hhnoa1, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A10082Lb_hhnoa1, "99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_hhnoa1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( cmbLb_Estado.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "LB_ESTADO_" + sGXsfl_17_idx ;
            cmbLb_Estado.setName( GXCCtl );
            cmbLb_Estado.setWebtags( "" );
            cmbLb_Estado.addItem("1", httpContext.getMessage( "Enviado", ""), (short)(0));
            cmbLb_Estado.addItem("2", httpContext.getMessage( "Recepcionado", ""), (short)(0));
            cmbLb_Estado.addItem("0", httpContext.getMessage( "Pendiente", ""), (short)(0));
            if ( cmbLb_Estado.getItemCount() > 0 )
            {
               A5566Lb_Estado = (byte)(GXutil.lval( cmbLb_Estado.getValidValue(GXutil.trim( GXutil.str( A5566Lb_Estado, 1, 0))))) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbLb_Estado,cmbLb_Estado.getInternalname(),GXutil.trim( GXutil.str( A5566Lb_Estado, 1, 0)),Integer.valueOf(1),cmbLb_Estado.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbLb_Estado.setValue( GXutil.trim( GXutil.str( A5566Lb_Estado, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbLb_Estado.getInternalname(), "Values", cmbLb_Estado.ToJavascriptSource(), !bGXsfl_17_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_ProvDef_Internalname,GXutil.rtrim( A6631Lb_ProvDef),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_ProvDef_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_ObsCR_Internalname,A10822Lb_ObsCR,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_ObsCR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(300),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1U92( ) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Opcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hora", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Recepcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hora", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste Col.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hora", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "E", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "D/P", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Obs.", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5555Lb_opcion));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A5567Lb_FechaEn, "99/99/99"));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A5568Lb_HoraEn, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A5563Lb_FechaR, "99/99/99"));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A5564Lb_HoraR, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5565Lb_CosteE, (byte)(11), (byte)(5), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1127Lb_CosteC, (byte)(11), (byte)(5), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A6461Lb_FecNoa1, "99/99/99"));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A10082Lb_hhnoa1, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5566Lb_Estado, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A6631Lb_ProvDef));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A10822Lb_ObsCR);
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
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      edtLb_opcion_Internalname = sPrefix+"LB_OPCION" ;
      edtLb_FechaEn_Internalname = sPrefix+"LB_FECHAEN" ;
      edtLb_HoraEn_Internalname = sPrefix+"LB_HORAEN" ;
      edtLb_FechaR_Internalname = sPrefix+"LB_FECHAR" ;
      edtLb_HoraR_Internalname = sPrefix+"LB_HORAR" ;
      edtLb_CosteE_Internalname = sPrefix+"LB_COSTEE" ;
      edtLb_CosteC_Internalname = sPrefix+"LB_COSTEC" ;
      edtLb_FecNoa1_Internalname = sPrefix+"LB_FECNOA1" ;
      edtLb_hhnoa1_Internalname = sPrefix+"LB_HHNOA1" ;
      cmbLb_Estado.setInternalname( sPrefix+"LB_ESTADO" );
      edtLb_ProvDef_Internalname = sPrefix+"LB_PROVDEF" ;
      edtLb_ObsCR_Internalname = sPrefix+"LB_OBSCR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Grid_titlescategories_Internalname = sPrefix+"GRID_TITLESCATEGORIES" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      edtavDdo_lb_fechaenauxdate_Internalname = sPrefix+"vDDO_LB_FECHAENAUXDATE" ;
      divDdo_lb_fechaenauxdates_Internalname = sPrefix+"DDO_LB_FECHAENAUXDATES" ;
      edtavDdo_lb_horaenauxdate_Internalname = sPrefix+"vDDO_LB_HORAENAUXDATE" ;
      divDdo_lb_horaenauxdates_Internalname = sPrefix+"DDO_LB_HORAENAUXDATES" ;
      edtavDdo_lb_fecharauxdate_Internalname = sPrefix+"vDDO_LB_FECHARAUXDATE" ;
      divDdo_lb_fecharauxdates_Internalname = sPrefix+"DDO_LB_FECHARAUXDATES" ;
      edtavDdo_lb_horarauxdate_Internalname = sPrefix+"vDDO_LB_HORARAUXDATE" ;
      divDdo_lb_horarauxdates_Internalname = sPrefix+"DDO_LB_HORARAUXDATES" ;
      edtavDdo_lb_fecnoa1auxdate_Internalname = sPrefix+"vDDO_LB_FECNOA1AUXDATE" ;
      divDdo_lb_fecnoa1auxdates_Internalname = sPrefix+"DDO_LB_FECNOA1AUXDATES" ;
      edtavDdo_lb_hhnoa1auxdate_Internalname = sPrefix+"vDDO_LB_HHNOA1AUXDATE" ;
      divDdo_lb_hhnoa1auxdates_Internalname = sPrefix+"DDO_LB_HHNOA1AUXDATES" ;
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
      edtLb_ObsCR_Jsonclick = "" ;
      edtLb_ProvDef_Jsonclick = "" ;
      cmbLb_Estado.setJsonclick( "" );
      edtLb_hhnoa1_Jsonclick = "" ;
      edtLb_FecNoa1_Jsonclick = "" ;
      edtLb_CosteC_Jsonclick = "" ;
      edtLb_CosteE_Jsonclick = "" ;
      edtLb_HoraR_Jsonclick = "" ;
      edtLb_FechaR_Jsonclick = "" ;
      edtLb_HoraEn_Jsonclick = "" ;
      edtLb_FechaEn_Jsonclick = "" ;
      edtLb_opcion_Jsonclick = "" ;
      subGrid_Class = "GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_lb_hhnoa1auxdate_Jsonclick = "" ;
      edtavDdo_lb_fecnoa1auxdate_Jsonclick = "" ;
      edtavDdo_lb_horarauxdate_Jsonclick = "" ;
      edtavDdo_lb_fecharauxdate_Jsonclick = "" ;
      edtavDdo_lb_horaenauxdate_Jsonclick = "" ;
      edtavDdo_lb_fechaenauxdate_Jsonclick = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";Envio;Envio;Recepcion;Recepcion;;;No Aceptacion;No Aceptacion;;;" ;
      Ddo_grid_Datalistproc = "GestionLaboratorio.ConsultaSituacionColeccion_OpcionesGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "|||||||||1:Enviado,2:Recepcionado,0:Pendiente||" ;
      Ddo_grid_Allowmultipleselection = "|||||||||T||" ;
      Ddo_grid_Datalisttype = "Dynamic|||||||||FixedValues|Dynamic|Dynamic" ;
      Ddo_grid_Includedatalist = "T|||||||||T|T|T" ;
      Ddo_grid_Filterisrange = "|||||T|T|||||" ;
      Ddo_grid_Filtertype = "Character|Date|Date|Date|Date|Numeric|Numeric|Date|Date||Character|Character" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T|T|T|T||T|T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7|8|9|10|11|12|13" ;
      Ddo_grid_Columnids = "0:Lb_opcion|1:Lb_FechaEn|2:Lb_HoraEn|3:Lb_FechaR|4:Lb_HoraR|5:Lb_CosteE|6:Lb_CosteC|7:Lb_FecNoa1|8:Lb_hhnoa1|9:Lb_Estado|10:Lb_ProvDef|11:Lb_ObsCR" ;
      Ddo_grid_Gridinternalname = "" ;
      subGrid_Rows = 0 ;
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
      GXCCtl = "LB_ESTADO_" + sGXsfl_17_idx ;
      cmbLb_Estado.setName( GXCCtl );
      cmbLb_Estado.setWebtags( "" );
      cmbLb_Estado.addItem("1", httpContext.getMessage( "Enviado", ""), (short)(0));
      cmbLb_Estado.addItem("2", httpContext.getMessage( "Recepcionado", ""), (short)(0));
      cmbLb_Estado.addItem("0", httpContext.getMessage( "Pendiente", ""), (short)(0));
      if ( cmbLb_Estado.getItemCount() > 0 )
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV21TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV22TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV23TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV27TFLb_HoraEn',fld:'vTFLB_HORAEN',pic:'99:99'},{av:'AV31TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV35TFLb_HoraR',fld:'vTFLB_HORAR',pic:'99:99'},{av:'AV39TFLb_CosteE',fld:'vTFLB_COSTEE',pic:'ZZZZ9.99999'},{av:'AV40TFLb_CosteE_To',fld:'vTFLB_COSTEE_TO',pic:'ZZZZ9.99999'},{av:'AV57TFLb_CosteC',fld:'vTFLB_COSTEC',pic:'ZZZZ9.99999'},{av:'AV58TFLb_CosteC_To',fld:'vTFLB_COSTEC_TO',pic:'ZZZZ9.99999'},{av:'AV49TFLb_FecNoa1',fld:'vTFLB_FECNOA1',pic:''},{av:'AV53TFLb_hhnoa1',fld:'vTFLB_HHNOA1',pic:'99:99'},{av:'AV64TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV59TFLb_ProvDef',fld:'vTFLB_PROVDEF',pic:''},{av:'AV60TFLb_ProvDef_Sel',fld:'vTFLB_PROVDEF_SEL',pic:''},{av:'AV61TFLb_ObsCR',fld:'vTFLB_OBSCR',pic:''},{av:'AV62TFLb_ObsCR_Sel',fld:'vTFLB_OBSCR_SEL',pic:''},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV67Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e111U92',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV21TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV22TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV23TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV27TFLb_HoraEn',fld:'vTFLB_HORAEN',pic:'99:99'},{av:'AV31TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV35TFLb_HoraR',fld:'vTFLB_HORAR',pic:'99:99'},{av:'AV39TFLb_CosteE',fld:'vTFLB_COSTEE',pic:'ZZZZ9.99999'},{av:'AV40TFLb_CosteE_To',fld:'vTFLB_COSTEE_TO',pic:'ZZZZ9.99999'},{av:'AV57TFLb_CosteC',fld:'vTFLB_COSTEC',pic:'ZZZZ9.99999'},{av:'AV58TFLb_CosteC_To',fld:'vTFLB_COSTEC_TO',pic:'ZZZZ9.99999'},{av:'AV49TFLb_FecNoa1',fld:'vTFLB_FECNOA1',pic:''},{av:'AV53TFLb_hhnoa1',fld:'vTFLB_HHNOA1',pic:'99:99'},{av:'AV64TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV59TFLb_ProvDef',fld:'vTFLB_PROVDEF',pic:''},{av:'AV60TFLb_ProvDef_Sel',fld:'vTFLB_PROVDEF_SEL',pic:''},{av:'AV61TFLb_ObsCR',fld:'vTFLB_OBSCR',pic:''},{av:'AV62TFLb_ObsCR_Sel',fld:'vTFLB_OBSCR_SEL',pic:''},{av:'AV67Pgmname',fld:'vPGMNAME',pic:''},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV61TFLb_ObsCR',fld:'vTFLB_OBSCR',pic:''},{av:'AV62TFLb_ObsCR_Sel',fld:'vTFLB_OBSCR_SEL',pic:''},{av:'AV59TFLb_ProvDef',fld:'vTFLB_PROVDEF',pic:''},{av:'AV60TFLb_ProvDef_Sel',fld:'vTFLB_PROVDEF_SEL',pic:''},{av:'AV63TFLb_Estado_SelsJson',fld:'vTFLB_ESTADO_SELSJSON',pic:''},{av:'AV64TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV53TFLb_hhnoa1',fld:'vTFLB_HHNOA1',pic:'99:99'},{av:'AV49TFLb_FecNoa1',fld:'vTFLB_FECNOA1',pic:''},{av:'AV57TFLb_CosteC',fld:'vTFLB_COSTEC',pic:'ZZZZ9.99999'},{av:'AV58TFLb_CosteC_To',fld:'vTFLB_COSTEC_TO',pic:'ZZZZ9.99999'},{av:'AV39TFLb_CosteE',fld:'vTFLB_COSTEE',pic:'ZZZZ9.99999'},{av:'AV40TFLb_CosteE_To',fld:'vTFLB_COSTEE_TO',pic:'ZZZZ9.99999'},{av:'AV35TFLb_HoraR',fld:'vTFLB_HORAR',pic:'99:99'},{av:'AV31TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV27TFLb_HoraEn',fld:'vTFLB_HORAEN',pic:'99:99'},{av:'AV23TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV21TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV22TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e141U92',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV21TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV22TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV23TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV27TFLb_HoraEn',fld:'vTFLB_HORAEN',pic:'99:99'},{av:'AV31TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV35TFLb_HoraR',fld:'vTFLB_HORAR',pic:'99:99'},{av:'AV39TFLb_CosteE',fld:'vTFLB_COSTEE',pic:'ZZZZ9.99999'},{av:'AV40TFLb_CosteE_To',fld:'vTFLB_COSTEE_TO',pic:'ZZZZ9.99999'},{av:'AV57TFLb_CosteC',fld:'vTFLB_COSTEC',pic:'ZZZZ9.99999'},{av:'AV58TFLb_CosteC_To',fld:'vTFLB_COSTEC_TO',pic:'ZZZZ9.99999'},{av:'AV49TFLb_FecNoa1',fld:'vTFLB_FECNOA1',pic:''},{av:'AV53TFLb_hhnoa1',fld:'vTFLB_HHNOA1',pic:'99:99'},{av:'AV64TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV59TFLb_ProvDef',fld:'vTFLB_PROVDEF',pic:''},{av:'AV60TFLb_ProvDef_Sel',fld:'vTFLB_PROVDEF_SEL',pic:''},{av:'AV61TFLb_ObsCR',fld:'vTFLB_OBSCR',pic:''},{av:'AV62TFLb_ObsCR_Sel',fld:'vTFLB_OBSCR_SEL',pic:''},{av:'AV67Pgmname',fld:'vPGMNAME',pic:''},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV21TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV22TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV23TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV27TFLb_HoraEn',fld:'vTFLB_HORAEN',pic:'99:99'},{av:'AV31TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV35TFLb_HoraR',fld:'vTFLB_HORAR',pic:'99:99'},{av:'AV39TFLb_CosteE',fld:'vTFLB_COSTEE',pic:'ZZZZ9.99999'},{av:'AV40TFLb_CosteE_To',fld:'vTFLB_COSTEE_TO',pic:'ZZZZ9.99999'},{av:'AV57TFLb_CosteC',fld:'vTFLB_COSTEC',pic:'ZZZZ9.99999'},{av:'AV58TFLb_CosteC_To',fld:'vTFLB_COSTEC_TO',pic:'ZZZZ9.99999'},{av:'AV49TFLb_FecNoa1',fld:'vTFLB_FECNOA1',pic:''},{av:'AV53TFLb_hhnoa1',fld:'vTFLB_HHNOA1',pic:'99:99'},{av:'AV64TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV59TFLb_ProvDef',fld:'vTFLB_PROVDEF',pic:''},{av:'AV60TFLb_ProvDef_Sel',fld:'vTFLB_PROVDEF_SEL',pic:''},{av:'AV61TFLb_ObsCR',fld:'vTFLB_OBSCR',pic:''},{av:'AV62TFLb_ObsCR_Sel',fld:'vTFLB_OBSCR_SEL',pic:''},{av:'AV67Pgmname',fld:'vPGMNAME',pic:''},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV21TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV22TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV23TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV27TFLb_HoraEn',fld:'vTFLB_HORAEN',pic:'99:99'},{av:'AV31TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV35TFLb_HoraR',fld:'vTFLB_HORAR',pic:'99:99'},{av:'AV39TFLb_CosteE',fld:'vTFLB_COSTEE',pic:'ZZZZ9.99999'},{av:'AV40TFLb_CosteE_To',fld:'vTFLB_COSTEE_TO',pic:'ZZZZ9.99999'},{av:'AV57TFLb_CosteC',fld:'vTFLB_COSTEC',pic:'ZZZZ9.99999'},{av:'AV58TFLb_CosteC_To',fld:'vTFLB_COSTEC_TO',pic:'ZZZZ9.99999'},{av:'AV49TFLb_FecNoa1',fld:'vTFLB_FECNOA1',pic:''},{av:'AV53TFLb_hhnoa1',fld:'vTFLB_HHNOA1',pic:'99:99'},{av:'AV64TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV59TFLb_ProvDef',fld:'vTFLB_PROVDEF',pic:''},{av:'AV60TFLb_ProvDef_Sel',fld:'vTFLB_PROVDEF_SEL',pic:''},{av:'AV61TFLb_ObsCR',fld:'vTFLB_OBSCR',pic:''},{av:'AV62TFLb_ObsCR_Sel',fld:'vTFLB_OBSCR_SEL',pic:''},{av:'AV67Pgmname',fld:'vPGMNAME',pic:''},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV21TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV22TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV23TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV27TFLb_HoraEn',fld:'vTFLB_HORAEN',pic:'99:99'},{av:'AV31TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV35TFLb_HoraR',fld:'vTFLB_HORAR',pic:'99:99'},{av:'AV39TFLb_CosteE',fld:'vTFLB_COSTEE',pic:'ZZZZ9.99999'},{av:'AV40TFLb_CosteE_To',fld:'vTFLB_COSTEE_TO',pic:'ZZZZ9.99999'},{av:'AV57TFLb_CosteC',fld:'vTFLB_COSTEC',pic:'ZZZZ9.99999'},{av:'AV58TFLb_CosteC_To',fld:'vTFLB_COSTEC_TO',pic:'ZZZZ9.99999'},{av:'AV49TFLb_FecNoa1',fld:'vTFLB_FECNOA1',pic:''},{av:'AV53TFLb_hhnoa1',fld:'vTFLB_HHNOA1',pic:'99:99'},{av:'AV64TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV59TFLb_ProvDef',fld:'vTFLB_PROVDEF',pic:''},{av:'AV60TFLb_ProvDef_Sel',fld:'vTFLB_PROVDEF_SEL',pic:''},{av:'AV61TFLb_ObsCR',fld:'vTFLB_OBSCR',pic:''},{av:'AV62TFLb_ObsCR_Sel',fld:'vTFLB_OBSCR_SEL',pic:''},{av:'AV67Pgmname',fld:'vPGMNAME',pic:''},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Lb_obscr',iparms:[]");
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
      wcpOAV7Emprcod = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV7Emprcod = "" ;
      AV21TFLb_opcion = "" ;
      AV22TFLb_opcion_Sel = "" ;
      AV23TFLb_FechaEn = GXutil.nullDate() ;
      AV27TFLb_HoraEn = GXutil.resetTime( GXutil.nullDate() );
      AV31TFLb_FechaR = GXutil.nullDate() ;
      AV35TFLb_HoraR = GXutil.resetTime( GXutil.nullDate() );
      AV39TFLb_CosteE = DecimalUtil.ZERO ;
      AV40TFLb_CosteE_To = DecimalUtil.ZERO ;
      AV57TFLb_CosteC = DecimalUtil.ZERO ;
      AV58TFLb_CosteC_To = DecimalUtil.ZERO ;
      AV49TFLb_FecNoa1 = GXutil.nullDate() ;
      AV53TFLb_hhnoa1 = GXutil.resetTime( GXutil.nullDate() );
      AV64TFLb_Estado_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV59TFLb_ProvDef = "" ;
      AV60TFLb_ProvDef_Sel = "" ;
      AV61TFLb_ObsCR = "" ;
      AV62TFLb_ObsCR_Sel = "" ;
      AV67Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV45DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_titlescategories_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV25DDO_Lb_FechaEnAuxDate = GXutil.nullDate() ;
      AV29DDO_Lb_HoraEnAuxDate = GXutil.nullDate() ;
      AV33DDO_Lb_FechaRAuxDate = GXutil.nullDate() ;
      AV37DDO_Lb_HoraRAuxDate = GXutil.nullDate() ;
      AV51DDO_Lb_FecNoa1AuxDate = GXutil.nullDate() ;
      AV55DDO_Lb_hhnoa1AuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV71Gestionlaboratorio_consultasituacioncoleccion_opcionesds_1_tflb_opcion = "" ;
      AV72Gestionlaboratorio_consultasituacioncoleccion_opcionesds_2_tflb_opcion_sel = "" ;
      AV73Gestionlaboratorio_consultasituacioncoleccion_opcionesds_3_tflb_fechaen = GXutil.nullDate() ;
      AV74Gestionlaboratorio_consultasituacioncoleccion_opcionesds_4_tflb_horaen = GXutil.resetTime( GXutil.nullDate() );
      AV75Gestionlaboratorio_consultasituacioncoleccion_opcionesds_5_tflb_fechar = GXutil.nullDate() ;
      AV76Gestionlaboratorio_consultasituacioncoleccion_opcionesds_6_tflb_horar = GXutil.resetTime( GXutil.nullDate() );
      AV77Gestionlaboratorio_consultasituacioncoleccion_opcionesds_7_tflb_costee = DecimalUtil.ZERO ;
      AV78Gestionlaboratorio_consultasituacioncoleccion_opcionesds_8_tflb_costee_to = DecimalUtil.ZERO ;
      AV79Gestionlaboratorio_consultasituacioncoleccion_opcionesds_9_tflb_costec = DecimalUtil.ZERO ;
      AV80Gestionlaboratorio_consultasituacioncoleccion_opcionesds_10_tflb_costec_to = DecimalUtil.ZERO ;
      AV81Gestionlaboratorio_consultasituacioncoleccion_opcionesds_11_tflb_fecnoa1 = GXutil.nullDate() ;
      AV82Gestionlaboratorio_consultasituacioncoleccion_opcionesds_12_tflb_hhnoa1 = GXutil.resetTime( GXutil.nullDate() );
      AV83Gestionlaboratorio_consultasituacioncoleccion_opcionesds_13_tflb_estado_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV84Gestionlaboratorio_consultasituacioncoleccion_opcionesds_14_tflb_provdef = "" ;
      AV85Gestionlaboratorio_consultasituacioncoleccion_opcionesds_15_tflb_provdef_sel = "" ;
      AV86Gestionlaboratorio_consultasituacioncoleccion_opcionesds_16_tflb_obscr = "" ;
      AV87Gestionlaboratorio_consultasituacioncoleccion_opcionesds_17_tflb_obscr_sel = "" ;
      A5555Lb_opcion = "" ;
      A5567Lb_FechaEn = GXutil.nullDate() ;
      A5568Lb_HoraEn = GXutil.resetTime( GXutil.nullDate() );
      A5563Lb_FechaR = GXutil.nullDate() ;
      A5564Lb_HoraR = GXutil.resetTime( GXutil.nullDate() );
      A5565Lb_CosteE = DecimalUtil.ZERO ;
      A1127Lb_CosteC = DecimalUtil.ZERO ;
      A6461Lb_FecNoa1 = GXutil.nullDate() ;
      A10082Lb_hhnoa1 = GXutil.resetTime( GXutil.nullDate() );
      A6631Lb_ProvDef = "" ;
      A10822Lb_ObsCR = "" ;
      scmdbuf = "" ;
      lV71Gestionlaboratorio_consultasituacioncoleccion_opcionesds_1_tflb_opcion = "" ;
      lV84Gestionlaboratorio_consultasituacioncoleccion_opcionesds_14_tflb_provdef = "" ;
      lV86Gestionlaboratorio_consultasituacioncoleccion_opcionesds_16_tflb_obscr = "" ;
      A396EmprCod = "" ;
      H01U92_A396EmprCod = new String[] {""} ;
      H01U92_A5532Lb_numero = new int[1] ;
      H01U92_A10822Lb_ObsCR = new String[] {""} ;
      H01U92_A6631Lb_ProvDef = new String[] {""} ;
      H01U92_A5566Lb_Estado = new byte[1] ;
      H01U92_A10082Lb_hhnoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      H01U92_A6461Lb_FecNoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      H01U92_A1127Lb_CosteC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01U92_A5565Lb_CosteE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01U92_A5564Lb_HoraR = new java.util.Date[] {GXutil.nullDate()} ;
      H01U92_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      H01U92_A5568Lb_HoraEn = new java.util.Date[] {GXutil.nullDate()} ;
      H01U92_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      H01U92_A5555Lb_opcion = new String[] {""} ;
      H01U93_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV68Station = "" ;
      AV69Emprnom = "" ;
      AV70Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV63TFLb_Estado_SelsJson = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV17Session = httpContext.getWebSession();
      AV12GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV13GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char9 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char8 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState10 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV10TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV9HTTPRequest = httpContext.getHttpRequest();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV7Emprcod = "" ;
      sCtrlAV8Lb_numero = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.consultasituacioncoleccion_opciones__default(),
         new Object[] {
             new Object[] {
            H01U92_A396EmprCod, H01U92_A5532Lb_numero, H01U92_A10822Lb_ObsCR, H01U92_A6631Lb_ProvDef, H01U92_A5566Lb_Estado, H01U92_A10082Lb_hhnoa1, H01U92_A6461Lb_FecNoa1, H01U92_A1127Lb_CosteC, H01U92_A5565Lb_CosteE, H01U92_A5564Lb_HoraR,
            H01U92_A5563Lb_FechaR, H01U92_A5568Lb_HoraEn, H01U92_A5567Lb_FechaEn, H01U92_A5555Lb_opcion
            }
            , new Object[] {
            H01U93_AGRID_nRecordCount
            }
         }
      );
      AV67Pgmname = "GestionLaboratorio.ConsultaSituacionColeccion_Opciones" ;
      /* GeneXus formulas. */
      AV67Pgmname = "GestionLaboratorio.ConsultaSituacionColeccion_Opciones" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A5566Lb_Estado ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV14OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV8Lb_numero ;
   private int subGrid_Rows ;
   private int nRC_GXsfl_17 ;
   private int AV8Lb_numero ;
   private int nGXsfl_17_idx=1 ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV83Gestionlaboratorio_consultasituacioncoleccion_opcionesds_13_tflb_estado_sels_size ;
   private int A5532Lb_numero ;
   private int AV88GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV39TFLb_CosteE ;
   private java.math.BigDecimal AV40TFLb_CosteE_To ;
   private java.math.BigDecimal AV57TFLb_CosteC ;
   private java.math.BigDecimal AV58TFLb_CosteC_To ;
   private java.math.BigDecimal AV77Gestionlaboratorio_consultasituacioncoleccion_opcionesds_7_tflb_costee ;
   private java.math.BigDecimal AV78Gestionlaboratorio_consultasituacioncoleccion_opcionesds_8_tflb_costee_to ;
   private java.math.BigDecimal AV79Gestionlaboratorio_consultasituacioncoleccion_opcionesds_9_tflb_costec ;
   private java.math.BigDecimal AV80Gestionlaboratorio_consultasituacioncoleccion_opcionesds_10_tflb_costec_to ;
   private java.math.BigDecimal A5565Lb_CosteE ;
   private java.math.BigDecimal A1127Lb_CosteC ;
   private String wcpOAV7Emprcod ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV7Emprcod ;
   private String sGXsfl_17_idx="0001" ;
   private String AV21TFLb_opcion ;
   private String AV22TFLb_opcion_Sel ;
   private String AV59TFLb_ProvDef ;
   private String AV60TFLb_ProvDef_Sel ;
   private String AV67Pgmname ;
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
   private String Ddo_grid_Allowmultipleselection ;
   private String Ddo_grid_Datalistfixedvalues ;
   private String Ddo_grid_Datalistproc ;
   private String Grid_titlescategories_Gridinternalname ;
   private String Grid_titlescategories_Gridtitlescategories ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_titlescategories_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_lb_fechaenauxdates_Internalname ;
   private String TempTags ;
   private String edtavDdo_lb_fechaenauxdate_Internalname ;
   private String edtavDdo_lb_fechaenauxdate_Jsonclick ;
   private String divDdo_lb_horaenauxdates_Internalname ;
   private String edtavDdo_lb_horaenauxdate_Internalname ;
   private String edtavDdo_lb_horaenauxdate_Jsonclick ;
   private String divDdo_lb_fecharauxdates_Internalname ;
   private String edtavDdo_lb_fecharauxdate_Internalname ;
   private String edtavDdo_lb_fecharauxdate_Jsonclick ;
   private String divDdo_lb_horarauxdates_Internalname ;
   private String edtavDdo_lb_horarauxdate_Internalname ;
   private String edtavDdo_lb_horarauxdate_Jsonclick ;
   private String divDdo_lb_fecnoa1auxdates_Internalname ;
   private String edtavDdo_lb_fecnoa1auxdate_Internalname ;
   private String edtavDdo_lb_fecnoa1auxdate_Jsonclick ;
   private String divDdo_lb_hhnoa1auxdates_Internalname ;
   private String edtavDdo_lb_hhnoa1auxdate_Internalname ;
   private String edtavDdo_lb_hhnoa1auxdate_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV71Gestionlaboratorio_consultasituacioncoleccion_opcionesds_1_tflb_opcion ;
   private String AV72Gestionlaboratorio_consultasituacioncoleccion_opcionesds_2_tflb_opcion_sel ;
   private String AV84Gestionlaboratorio_consultasituacioncoleccion_opcionesds_14_tflb_provdef ;
   private String AV85Gestionlaboratorio_consultasituacioncoleccion_opcionesds_15_tflb_provdef_sel ;
   private String A5555Lb_opcion ;
   private String edtLb_opcion_Internalname ;
   private String edtLb_FechaEn_Internalname ;
   private String edtLb_HoraEn_Internalname ;
   private String edtLb_FechaR_Internalname ;
   private String edtLb_HoraR_Internalname ;
   private String edtLb_CosteE_Internalname ;
   private String edtLb_CosteC_Internalname ;
   private String edtLb_FecNoa1_Internalname ;
   private String edtLb_hhnoa1_Internalname ;
   private String A6631Lb_ProvDef ;
   private String edtLb_ProvDef_Internalname ;
   private String edtLb_ObsCR_Internalname ;
   private String scmdbuf ;
   private String lV71Gestionlaboratorio_consultasituacioncoleccion_opcionesds_1_tflb_opcion ;
   private String lV84Gestionlaboratorio_consultasituacioncoleccion_opcionesds_14_tflb_provdef ;
   private String A396EmprCod ;
   private String hsh ;
   private String AV68Station ;
   private String AV69Emprnom ;
   private String AV70Usurcod ;
   private String GXt_char9 ;
   private String GXv_char4[] ;
   private String GXt_char8 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTablerightheader_Internalname ;
   private String sCtrlAV7Emprcod ;
   private String sCtrlAV8Lb_numero ;
   private String sGXsfl_17_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtLb_opcion_Jsonclick ;
   private String edtLb_FechaEn_Jsonclick ;
   private String edtLb_HoraEn_Jsonclick ;
   private String edtLb_FechaR_Jsonclick ;
   private String edtLb_HoraR_Jsonclick ;
   private String edtLb_CosteE_Jsonclick ;
   private String edtLb_CosteC_Jsonclick ;
   private String edtLb_FecNoa1_Jsonclick ;
   private String edtLb_hhnoa1_Jsonclick ;
   private String GXCCtl ;
   private String edtLb_ProvDef_Jsonclick ;
   private String edtLb_ObsCR_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV27TFLb_HoraEn ;
   private java.util.Date AV35TFLb_HoraR ;
   private java.util.Date AV53TFLb_hhnoa1 ;
   private java.util.Date AV74Gestionlaboratorio_consultasituacioncoleccion_opcionesds_4_tflb_horaen ;
   private java.util.Date AV76Gestionlaboratorio_consultasituacioncoleccion_opcionesds_6_tflb_horar ;
   private java.util.Date AV82Gestionlaboratorio_consultasituacioncoleccion_opcionesds_12_tflb_hhnoa1 ;
   private java.util.Date A5568Lb_HoraEn ;
   private java.util.Date A5564Lb_HoraR ;
   private java.util.Date A10082Lb_hhnoa1 ;
   private java.util.Date AV23TFLb_FechaEn ;
   private java.util.Date AV31TFLb_FechaR ;
   private java.util.Date AV49TFLb_FecNoa1 ;
   private java.util.Date AV25DDO_Lb_FechaEnAuxDate ;
   private java.util.Date AV29DDO_Lb_HoraEnAuxDate ;
   private java.util.Date AV33DDO_Lb_FechaRAuxDate ;
   private java.util.Date AV37DDO_Lb_HoraRAuxDate ;
   private java.util.Date AV51DDO_Lb_FecNoa1AuxDate ;
   private java.util.Date AV55DDO_Lb_hhnoa1AuxDate ;
   private java.util.Date AV73Gestionlaboratorio_consultasituacioncoleccion_opcionesds_3_tflb_fechaen ;
   private java.util.Date AV75Gestionlaboratorio_consultasituacioncoleccion_opcionesds_5_tflb_fechar ;
   private java.util.Date AV81Gestionlaboratorio_consultasituacioncoleccion_opcionesds_11_tflb_fecnoa1 ;
   private java.util.Date A5567Lb_FechaEn ;
   private java.util.Date A5563Lb_FechaR ;
   private java.util.Date A6461Lb_FecNoa1 ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV15OrderedDsc ;
   private boolean Grid_empowerer_Hascategories ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_17_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV63TFLb_Estado_SelsJson ;
   private String AV61TFLb_ObsCR ;
   private String AV62TFLb_ObsCR_Sel ;
   private String AV86Gestionlaboratorio_consultasituacioncoleccion_opcionesds_16_tflb_obscr ;
   private String AV87Gestionlaboratorio_consultasituacioncoleccion_opcionesds_17_tflb_obscr_sel ;
   private String A10822Lb_ObsCR ;
   private String lV86Gestionlaboratorio_consultasituacioncoleccion_opcionesds_16_tflb_obscr ;
   private GXSimpleCollection<Byte> AV64TFLb_Estado_Sels ;
   private GXSimpleCollection<Byte> AV83Gestionlaboratorio_consultasituacioncoleccion_opcionesds_13_tflb_estado_sels ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV9HTTPRequest ;
   private com.genexus.webpanels.WebSession AV17Session ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbLb_Estado ;
   private IDataStoreProvider pr_default ;
   private String[] H01U92_A396EmprCod ;
   private int[] H01U92_A5532Lb_numero ;
   private String[] H01U92_A10822Lb_ObsCR ;
   private String[] H01U92_A6631Lb_ProvDef ;
   private byte[] H01U92_A5566Lb_Estado ;
   private java.util.Date[] H01U92_A10082Lb_hhnoa1 ;
   private java.util.Date[] H01U92_A6461Lb_FecNoa1 ;
   private java.math.BigDecimal[] H01U92_A1127Lb_CosteC ;
   private java.math.BigDecimal[] H01U92_A5565Lb_CosteE ;
   private java.util.Date[] H01U92_A5564Lb_HoraR ;
   private java.util.Date[] H01U92_A5563Lb_FechaR ;
   private java.util.Date[] H01U92_A5568Lb_HoraEn ;
   private java.util.Date[] H01U92_A5567Lb_FechaEn ;
   private String[] H01U92_A5555Lb_opcion ;
   private long[] H01U93_AGRID_nRecordCount ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV10TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV12GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState10[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV13GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV45DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class consultasituacioncoleccion_opciones__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01U92( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5566Lb_Estado ,
                                          GXSimpleCollection<Byte> AV83Gestionlaboratorio_consultasituacioncoleccion_opcionesds_13_tflb_estado_sels ,
                                          String AV72Gestionlaboratorio_consultasituacioncoleccion_opcionesds_2_tflb_opcion_sel ,
                                          String AV71Gestionlaboratorio_consultasituacioncoleccion_opcionesds_1_tflb_opcion ,
                                          java.util.Date AV73Gestionlaboratorio_consultasituacioncoleccion_opcionesds_3_tflb_fechaen ,
                                          java.util.Date AV74Gestionlaboratorio_consultasituacioncoleccion_opcionesds_4_tflb_horaen ,
                                          java.util.Date AV75Gestionlaboratorio_consultasituacioncoleccion_opcionesds_5_tflb_fechar ,
                                          java.util.Date AV76Gestionlaboratorio_consultasituacioncoleccion_opcionesds_6_tflb_horar ,
                                          java.math.BigDecimal AV77Gestionlaboratorio_consultasituacioncoleccion_opcionesds_7_tflb_costee ,
                                          java.math.BigDecimal AV78Gestionlaboratorio_consultasituacioncoleccion_opcionesds_8_tflb_costee_to ,
                                          java.math.BigDecimal AV79Gestionlaboratorio_consultasituacioncoleccion_opcionesds_9_tflb_costec ,
                                          java.math.BigDecimal AV80Gestionlaboratorio_consultasituacioncoleccion_opcionesds_10_tflb_costec_to ,
                                          java.util.Date AV81Gestionlaboratorio_consultasituacioncoleccion_opcionesds_11_tflb_fecnoa1 ,
                                          java.util.Date AV82Gestionlaboratorio_consultasituacioncoleccion_opcionesds_12_tflb_hhnoa1 ,
                                          int AV83Gestionlaboratorio_consultasituacioncoleccion_opcionesds_13_tflb_estado_sels_size ,
                                          String AV85Gestionlaboratorio_consultasituacioncoleccion_opcionesds_15_tflb_provdef_sel ,
                                          String AV84Gestionlaboratorio_consultasituacioncoleccion_opcionesds_14_tflb_provdef ,
                                          String AV87Gestionlaboratorio_consultasituacioncoleccion_opcionesds_17_tflb_obscr_sel ,
                                          String AV86Gestionlaboratorio_consultasituacioncoleccion_opcionesds_16_tflb_obscr ,
                                          String A5555Lb_opcion ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          java.util.Date A5568Lb_HoraEn ,
                                          java.util.Date A5563Lb_FechaR ,
                                          java.util.Date A5564Lb_HoraR ,
                                          java.math.BigDecimal A5565Lb_CosteE ,
                                          java.math.BigDecimal A1127Lb_CosteC ,
                                          java.util.Date A6461Lb_FecNoa1 ,
                                          java.util.Date A10082Lb_hhnoa1 ,
                                          String A6631Lb_ProvDef ,
                                          String A10822Lb_ObsCR ,
                                          short AV14OrderedBy ,
                                          boolean AV15OrderedDsc ,
                                          String AV7Emprcod ,
                                          int AV8Lb_numero ,
                                          String A396EmprCod ,
                                          int A5532Lb_numero )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[23];
      Object[] GXv_Object12 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " EmprCod, Lb_numero, Lb_ObsCR, Lb_ProvDef, Lb_Estado, Lb_hhnoa1, Lb_FecNoa1, Lb_CosteC, Lb_CosteE, Lb_HoraR, Lb_FechaR, Lb_HoraEn, Lb_FechaEn, Lb_opcion" ;
      sFromString = " FROM TXPENS002" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(EmprCod = ? and Lb_numero = ?)");
      if ( (GXutil.strcmp("", AV72Gestionlaboratorio_consultasituacioncoleccion_opcionesds_2_tflb_opcion_sel)==0) && ( ! (GXutil.strcmp("", AV71Gestionlaboratorio_consultasituacioncoleccion_opcionesds_1_tflb_opcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Lb_opcion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Gestionlaboratorio_consultasituacioncoleccion_opcionesds_2_tflb_opcion_sel)==0) )
      {
         addWhere(sWhereString, "(Lb_opcion = ?)");
      }
      else
      {
         GXv_int11[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV73Gestionlaboratorio_consultasituacioncoleccion_opcionesds_3_tflb_fechaen)) )
      {
         addWhere(sWhereString, "(Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int11[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV74Gestionlaboratorio_consultasituacioncoleccion_opcionesds_4_tflb_horaen) )
      {
         addWhere(sWhereString, "(Lb_HoraEn >= ?)");
      }
      else
      {
         GXv_int11[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV75Gestionlaboratorio_consultasituacioncoleccion_opcionesds_5_tflb_fechar)) )
      {
         addWhere(sWhereString, "(Lb_FechaR >= ?)");
      }
      else
      {
         GXv_int11[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV76Gestionlaboratorio_consultasituacioncoleccion_opcionesds_6_tflb_horar) )
      {
         addWhere(sWhereString, "(Lb_HoraR >= ?)");
      }
      else
      {
         GXv_int11[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Gestionlaboratorio_consultasituacioncoleccion_opcionesds_7_tflb_costee)==0) )
      {
         addWhere(sWhereString, "(Lb_CosteE >= ?)");
      }
      else
      {
         GXv_int11[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Gestionlaboratorio_consultasituacioncoleccion_opcionesds_8_tflb_costee_to)==0) )
      {
         addWhere(sWhereString, "(Lb_CosteE <= ?)");
      }
      else
      {
         GXv_int11[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Gestionlaboratorio_consultasituacioncoleccion_opcionesds_9_tflb_costec)==0) )
      {
         addWhere(sWhereString, "(Lb_CosteC >= ?)");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Gestionlaboratorio_consultasituacioncoleccion_opcionesds_10_tflb_costec_to)==0) )
      {
         addWhere(sWhereString, "(Lb_CosteC <= ?)");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV81Gestionlaboratorio_consultasituacioncoleccion_opcionesds_11_tflb_fecnoa1)) )
      {
         addWhere(sWhereString, "(Lb_FecNoa1 >= ?)");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV82Gestionlaboratorio_consultasituacioncoleccion_opcionesds_12_tflb_hhnoa1) )
      {
         addWhere(sWhereString, "(Lb_hhnoa1 >= ?)");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( AV83Gestionlaboratorio_consultasituacioncoleccion_opcionesds_13_tflb_estado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV83Gestionlaboratorio_consultasituacioncoleccion_opcionesds_13_tflb_estado_sels, "Lb_Estado IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV85Gestionlaboratorio_consultasituacioncoleccion_opcionesds_15_tflb_provdef_sel)==0) && ( ! (GXutil.strcmp("", AV84Gestionlaboratorio_consultasituacioncoleccion_opcionesds_14_tflb_provdef)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Lb_ProvDef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Gestionlaboratorio_consultasituacioncoleccion_opcionesds_15_tflb_provdef_sel)==0) )
      {
         addWhere(sWhereString, "(Lb_ProvDef = ?)");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Gestionlaboratorio_consultasituacioncoleccion_opcionesds_17_tflb_obscr_sel)==0) && ( ! (GXutil.strcmp("", AV86Gestionlaboratorio_consultasituacioncoleccion_opcionesds_16_tflb_obscr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Lb_ObsCR) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Gestionlaboratorio_consultasituacioncoleccion_opcionesds_17_tflb_obscr_sel)==0) )
      {
         addWhere(sWhereString, "(Lb_ObsCR = ?)");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
      }
      if ( AV14OrderedBy == 1 )
      {
         sOrderString += " ORDER BY Lb_numero" ;
      }
      else if ( ( AV14OrderedBy == 2 ) && ! AV15OrderedDsc )
      {
         sOrderString += " ORDER BY Lb_opcion" ;
      }
      else if ( ( AV14OrderedBy == 2 ) && ( AV15OrderedDsc ) )
      {
         sOrderString += " ORDER BY Lb_opcion DESC" ;
      }
      else if ( ( AV14OrderedBy == 3 ) && ! AV15OrderedDsc )
      {
         sOrderString += " ORDER BY Lb_FechaEn" ;
      }
      else if ( ( AV14OrderedBy == 3 ) && ( AV15OrderedDsc ) )
      {
         sOrderString += " ORDER BY Lb_FechaEn DESC" ;
      }
      else if ( ( AV14OrderedBy == 4 ) && ! AV15OrderedDsc )
      {
         sOrderString += " ORDER BY Lb_HoraEn" ;
      }
      else if ( ( AV14OrderedBy == 4 ) && ( AV15OrderedDsc ) )
      {
         sOrderString += " ORDER BY Lb_HoraEn DESC" ;
      }
      else if ( ( AV14OrderedBy == 5 ) && ! AV15OrderedDsc )
      {
         sOrderString += " ORDER BY Lb_FechaR" ;
      }
      else if ( ( AV14OrderedBy == 5 ) && ( AV15OrderedDsc ) )
      {
         sOrderString += " ORDER BY Lb_FechaR DESC" ;
      }
      else if ( ( AV14OrderedBy == 6 ) && ! AV15OrderedDsc )
      {
         sOrderString += " ORDER BY Lb_HoraR" ;
      }
      else if ( ( AV14OrderedBy == 6 ) && ( AV15OrderedDsc ) )
      {
         sOrderString += " ORDER BY Lb_HoraR DESC" ;
      }
      else if ( ( AV14OrderedBy == 7 ) && ! AV15OrderedDsc )
      {
         sOrderString += " ORDER BY Lb_CosteE" ;
      }
      else if ( ( AV14OrderedBy == 7 ) && ( AV15OrderedDsc ) )
      {
         sOrderString += " ORDER BY Lb_CosteE DESC" ;
      }
      else if ( ( AV14OrderedBy == 8 ) && ! AV15OrderedDsc )
      {
         sOrderString += " ORDER BY Lb_CosteC" ;
      }
      else if ( ( AV14OrderedBy == 8 ) && ( AV15OrderedDsc ) )
      {
         sOrderString += " ORDER BY Lb_CosteC DESC" ;
      }
      else if ( ( AV14OrderedBy == 9 ) && ! AV15OrderedDsc )
      {
         sOrderString += " ORDER BY Lb_FecNoa1" ;
      }
      else if ( ( AV14OrderedBy == 9 ) && ( AV15OrderedDsc ) )
      {
         sOrderString += " ORDER BY Lb_FecNoa1 DESC" ;
      }
      else if ( ( AV14OrderedBy == 10 ) && ! AV15OrderedDsc )
      {
         sOrderString += " ORDER BY Lb_hhnoa1" ;
      }
      else if ( ( AV14OrderedBy == 10 ) && ( AV15OrderedDsc ) )
      {
         sOrderString += " ORDER BY Lb_hhnoa1 DESC" ;
      }
      else if ( ( AV14OrderedBy == 11 ) && ! AV15OrderedDsc )
      {
         sOrderString += " ORDER BY Lb_Estado" ;
      }
      else if ( ( AV14OrderedBy == 11 ) && ( AV15OrderedDsc ) )
      {
         sOrderString += " ORDER BY Lb_Estado DESC" ;
      }
      else if ( ( AV14OrderedBy == 12 ) && ! AV15OrderedDsc )
      {
         sOrderString += " ORDER BY Lb_ProvDef" ;
      }
      else if ( ( AV14OrderedBy == 12 ) && ( AV15OrderedDsc ) )
      {
         sOrderString += " ORDER BY Lb_ProvDef DESC" ;
      }
      else if ( ( AV14OrderedBy == 13 ) && ! AV15OrderedDsc )
      {
         sOrderString += " ORDER BY Lb_ObsCR" ;
      }
      else if ( ( AV14OrderedBy == 13 ) && ( AV15OrderedDsc ) )
      {
         sOrderString += " ORDER BY Lb_ObsCR DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY EmprCod, Lb_numero, Lb_opcion" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_H01U93( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5566Lb_Estado ,
                                          GXSimpleCollection<Byte> AV83Gestionlaboratorio_consultasituacioncoleccion_opcionesds_13_tflb_estado_sels ,
                                          String AV72Gestionlaboratorio_consultasituacioncoleccion_opcionesds_2_tflb_opcion_sel ,
                                          String AV71Gestionlaboratorio_consultasituacioncoleccion_opcionesds_1_tflb_opcion ,
                                          java.util.Date AV73Gestionlaboratorio_consultasituacioncoleccion_opcionesds_3_tflb_fechaen ,
                                          java.util.Date AV74Gestionlaboratorio_consultasituacioncoleccion_opcionesds_4_tflb_horaen ,
                                          java.util.Date AV75Gestionlaboratorio_consultasituacioncoleccion_opcionesds_5_tflb_fechar ,
                                          java.util.Date AV76Gestionlaboratorio_consultasituacioncoleccion_opcionesds_6_tflb_horar ,
                                          java.math.BigDecimal AV77Gestionlaboratorio_consultasituacioncoleccion_opcionesds_7_tflb_costee ,
                                          java.math.BigDecimal AV78Gestionlaboratorio_consultasituacioncoleccion_opcionesds_8_tflb_costee_to ,
                                          java.math.BigDecimal AV79Gestionlaboratorio_consultasituacioncoleccion_opcionesds_9_tflb_costec ,
                                          java.math.BigDecimal AV80Gestionlaboratorio_consultasituacioncoleccion_opcionesds_10_tflb_costec_to ,
                                          java.util.Date AV81Gestionlaboratorio_consultasituacioncoleccion_opcionesds_11_tflb_fecnoa1 ,
                                          java.util.Date AV82Gestionlaboratorio_consultasituacioncoleccion_opcionesds_12_tflb_hhnoa1 ,
                                          int AV83Gestionlaboratorio_consultasituacioncoleccion_opcionesds_13_tflb_estado_sels_size ,
                                          String AV85Gestionlaboratorio_consultasituacioncoleccion_opcionesds_15_tflb_provdef_sel ,
                                          String AV84Gestionlaboratorio_consultasituacioncoleccion_opcionesds_14_tflb_provdef ,
                                          String AV87Gestionlaboratorio_consultasituacioncoleccion_opcionesds_17_tflb_obscr_sel ,
                                          String AV86Gestionlaboratorio_consultasituacioncoleccion_opcionesds_16_tflb_obscr ,
                                          String A5555Lb_opcion ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          java.util.Date A5568Lb_HoraEn ,
                                          java.util.Date A5563Lb_FechaR ,
                                          java.util.Date A5564Lb_HoraR ,
                                          java.math.BigDecimal A5565Lb_CosteE ,
                                          java.math.BigDecimal A1127Lb_CosteC ,
                                          java.util.Date A6461Lb_FecNoa1 ,
                                          java.util.Date A10082Lb_hhnoa1 ,
                                          String A6631Lb_ProvDef ,
                                          String A10822Lb_ObsCR ,
                                          short AV14OrderedBy ,
                                          boolean AV15OrderedDsc ,
                                          String AV7Emprcod ,
                                          int AV8Lb_numero ,
                                          String A396EmprCod ,
                                          int A5532Lb_numero )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[18];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM TXPENS002" ;
      addWhere(sWhereString, "(EmprCod = ? and Lb_numero = ?)");
      if ( (GXutil.strcmp("", AV72Gestionlaboratorio_consultasituacioncoleccion_opcionesds_2_tflb_opcion_sel)==0) && ( ! (GXutil.strcmp("", AV71Gestionlaboratorio_consultasituacioncoleccion_opcionesds_1_tflb_opcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Lb_opcion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Gestionlaboratorio_consultasituacioncoleccion_opcionesds_2_tflb_opcion_sel)==0) )
      {
         addWhere(sWhereString, "(Lb_opcion = ?)");
      }
      else
      {
         GXv_int14[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV73Gestionlaboratorio_consultasituacioncoleccion_opcionesds_3_tflb_fechaen)) )
      {
         addWhere(sWhereString, "(Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV74Gestionlaboratorio_consultasituacioncoleccion_opcionesds_4_tflb_horaen) )
      {
         addWhere(sWhereString, "(Lb_HoraEn >= ?)");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV75Gestionlaboratorio_consultasituacioncoleccion_opcionesds_5_tflb_fechar)) )
      {
         addWhere(sWhereString, "(Lb_FechaR >= ?)");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV76Gestionlaboratorio_consultasituacioncoleccion_opcionesds_6_tflb_horar) )
      {
         addWhere(sWhereString, "(Lb_HoraR >= ?)");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Gestionlaboratorio_consultasituacioncoleccion_opcionesds_7_tflb_costee)==0) )
      {
         addWhere(sWhereString, "(Lb_CosteE >= ?)");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Gestionlaboratorio_consultasituacioncoleccion_opcionesds_8_tflb_costee_to)==0) )
      {
         addWhere(sWhereString, "(Lb_CosteE <= ?)");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Gestionlaboratorio_consultasituacioncoleccion_opcionesds_9_tflb_costec)==0) )
      {
         addWhere(sWhereString, "(Lb_CosteC >= ?)");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Gestionlaboratorio_consultasituacioncoleccion_opcionesds_10_tflb_costec_to)==0) )
      {
         addWhere(sWhereString, "(Lb_CosteC <= ?)");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV81Gestionlaboratorio_consultasituacioncoleccion_opcionesds_11_tflb_fecnoa1)) )
      {
         addWhere(sWhereString, "(Lb_FecNoa1 >= ?)");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV82Gestionlaboratorio_consultasituacioncoleccion_opcionesds_12_tflb_hhnoa1) )
      {
         addWhere(sWhereString, "(Lb_hhnoa1 >= ?)");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( AV83Gestionlaboratorio_consultasituacioncoleccion_opcionesds_13_tflb_estado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV83Gestionlaboratorio_consultasituacioncoleccion_opcionesds_13_tflb_estado_sels, "Lb_Estado IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV85Gestionlaboratorio_consultasituacioncoleccion_opcionesds_15_tflb_provdef_sel)==0) && ( ! (GXutil.strcmp("", AV84Gestionlaboratorio_consultasituacioncoleccion_opcionesds_14_tflb_provdef)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Lb_ProvDef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Gestionlaboratorio_consultasituacioncoleccion_opcionesds_15_tflb_provdef_sel)==0) )
      {
         addWhere(sWhereString, "(Lb_ProvDef = ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Gestionlaboratorio_consultasituacioncoleccion_opcionesds_17_tflb_obscr_sel)==0) && ( ! (GXutil.strcmp("", AV86Gestionlaboratorio_consultasituacioncoleccion_opcionesds_16_tflb_obscr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Lb_ObsCR) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Gestionlaboratorio_consultasituacioncoleccion_opcionesds_17_tflb_obscr_sel)==0) )
      {
         addWhere(sWhereString, "(Lb_ObsCR = ?)");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV14OrderedBy == 1 )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 2 ) && ! AV15OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 2 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 3 ) && ! AV15OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 3 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 4 ) && ! AV15OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 4 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 5 ) && ! AV15OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 5 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 6 ) && ! AV15OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 6 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 7 ) && ! AV15OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 7 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 8 ) && ! AV15OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 8 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 9 ) && ! AV15OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 9 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 10 ) && ! AV15OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 10 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 11 ) && ! AV15OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 11 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 12 ) && ! AV15OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 12 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 13 ) && ! AV15OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 13 ) && ( AV15OrderedDsc ) )
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
                  return conditional_H01U92(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Boolean) dynConstraints[31]).booleanValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() );
            case 1 :
                  return conditional_H01U93(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Boolean) dynConstraints[31]).booleanValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01U92", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01U93", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = GXutil.resetDate(rslt.getGXDateTime(6));
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((java.util.Date[]) buf[9])[0] = GXutil.resetDate(rslt.getGXDateTime(10));
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((java.util.Date[]) buf[11])[0] = GXutil.resetDate(rslt.getGXDateTime(12));
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
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
                  stmt.setString(sIdx, (String)parms[23], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[27]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[28], true);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[29]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[30], true);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 5);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[35]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[36], true);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 300);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 300);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[22]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[23], true);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[24]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[25], true);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 5);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[30]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[31], true);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 300);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 300);
               }
               return;
      }
   }

}

