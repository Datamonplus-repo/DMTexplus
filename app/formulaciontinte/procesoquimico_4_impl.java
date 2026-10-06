package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class procesoquimico_4_impl extends GXWebComponent
{
   public procesoquimico_4_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public procesoquimico_4_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( procesoquimico_4_impl.class ));
   }

   public procesoquimico_4_impl( int remoteHandle ,
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
               AV5Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
               AV6Proforcod = httpContext.GetPar( "Proforcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Proforcod", AV6Proforcod);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV5Emprcod,AV6Proforcod});
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
      nRC_GXsfl_14 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_14"))) ;
      nGXsfl_14_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_14_idx"))) ;
      sGXsfl_14_idx = httpContext.GetPar( "sGXsfl_14_idx") ;
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
      AV5Emprcod = httpContext.GetPar( "Emprcod") ;
      AV6Proforcod = httpContext.GetPar( "Proforcod") ;
      AV17TFProForLin = (short)(GXutil.lval( httpContext.GetPar( "TFProForLin"))) ;
      AV18TFProForLin_To = (short)(GXutil.lval( httpContext.GetPar( "TFProForLin_To"))) ;
      AV19TFProForPrd = httpContext.GetPar( "TFProForPrd") ;
      AV20TFProForPrd_Sel = httpContext.GetPar( "TFProForPrd_Sel") ;
      AV21TFProForDes = httpContext.GetPar( "TFProForDes") ;
      AV22TFProForDes_Sel = httpContext.GetPar( "TFProForDes_Sel") ;
      AV23TFProForCan = CommonUtil.decimalVal( httpContext.GetPar( "TFProForCan"), ".") ;
      AV24TFProForCan_To = CommonUtil.decimalVal( httpContext.GetPar( "TFProForCan_To"), ".") ;
      AV25TFForPrdDsc = httpContext.GetPar( "TFForPrdDsc") ;
      AV26TFForPrdDsc_Sel = httpContext.GetPar( "TFForPrdDsc_Sel") ;
      AV27TFProForNro = (byte)(GXutil.lval( httpContext.GetPar( "TFProForNro"))) ;
      AV28TFProForNro_To = (byte)(GXutil.lval( httpContext.GetPar( "TFProForNro_To"))) ;
      AV29TFProForTnq = (byte)(GXutil.lval( httpContext.GetPar( "TFProForTnq"))) ;
      AV30TFProForTnq_To = (byte)(GXutil.lval( httpContext.GetPar( "TFProForTnq_To"))) ;
      AV31TFProForCla = httpContext.GetPar( "TFProForCla") ;
      AV32TFProForCla_Sel = httpContext.GetPar( "TFProForCla_Sel") ;
      AV33TFProForClv = httpContext.GetPar( "TFProForClv") ;
      AV34TFProForClv_Sel = httpContext.GetPar( "TFProForClv_Sel") ;
      AV38Pgmname = httpContext.GetPar( "Pgmname") ;
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
      gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV6Proforcod, AV17TFProForLin, AV18TFProForLin_To, AV19TFProForPrd, AV20TFProForPrd_Sel, AV21TFProForDes, AV22TFProForDes_Sel, AV23TFProForCan, AV24TFProForCan_To, AV25TFForPrdDsc, AV26TFForPrdDsc_Sel, AV27TFProForNro, AV28TFProForNro_To, AV29TFProForTnq, AV30TFProForTnq_To, AV31TFProForCla, AV32TFProForCla_Sel, AV33TFProForClv, AV34TFProForClv_Sel, AV38Pgmname, AV14OrderedBy, AV15OrderedDsc, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1WT2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " Proceso Quimico (Lineas)", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.procesoquimico_4", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV6Proforcod))}, new String[] {"Emprcod","Proforcod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ProcesoQuimico_4");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV38Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\procesoquimico_4:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_14", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_14, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV35DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV35DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5Emprcod", GXutil.rtrim( wcpOAV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6Proforcod", GXutil.rtrim( wcpOAV6Proforcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPROFORLIN", GXutil.ltrim( localUtil.ntoc( AV17TFProForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPROFORLIN_TO", GXutil.ltrim( localUtil.ntoc( AV18TFProForLin_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPROFORPRD", GXutil.rtrim( AV19TFProForPrd));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPROFORPRD_SEL", GXutil.rtrim( AV20TFProForPrd_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPROFORDES", GXutil.rtrim( AV21TFProForDes));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPROFORDES_SEL", GXutil.rtrim( AV22TFProForDes_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPROFORCAN", GXutil.ltrim( localUtil.ntoc( AV23TFProForCan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPROFORCAN_TO", GXutil.ltrim( localUtil.ntoc( AV24TFProForCan_To, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORPRDDSC", GXutil.rtrim( AV25TFForPrdDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORPRDDSC_SEL", GXutil.rtrim( AV26TFForPrdDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPROFORNRO", GXutil.ltrim( localUtil.ntoc( AV27TFProForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPROFORNRO_TO", GXutil.ltrim( localUtil.ntoc( AV28TFProForNro_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPROFORTNQ", GXutil.ltrim( localUtil.ntoc( AV29TFProForTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPROFORTNQ_TO", GXutil.ltrim( localUtil.ntoc( AV30TFProForTnq_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPROFORCLA", GXutil.rtrim( AV31TFProForCla));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPROFORCLA_SEL", GXutil.rtrim( AV32TFProForCla_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPROFORCLV", GXutil.rtrim( AV33TFProForClv));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPROFORCLV_SEL", GXutil.rtrim( AV34TFProForClv_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV14OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV15OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPROFORCOD", GXutil.rtrim( AV6Proforcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEMAIN_Width", GXutil.rtrim( Dvpanel_tablemain_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEMAIN_Autowidth", GXutil.booltostr( Dvpanel_tablemain_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEMAIN_Autoheight", GXutil.booltostr( Dvpanel_tablemain_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEMAIN_Cls", GXutil.rtrim( Dvpanel_tablemain_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEMAIN_Title", GXutil.rtrim( Dvpanel_tablemain_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEMAIN_Collapsible", GXutil.booltostr( Dvpanel_tablemain_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEMAIN_Collapsed", GXutil.booltostr( Dvpanel_tablemain_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEMAIN_Showcollapseicon", GXutil.booltostr( Dvpanel_tablemain_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEMAIN_Iconposition", GXutil.rtrim( Dvpanel_tablemain_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEMAIN_Autoscroll", GXutil.booltostr( Dvpanel_tablemain_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Infinitescrolling", GXutil.rtrim( Grid_empowerer_Infinitescrolling));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
   }

   public void renderHtmlCloseForm1WT2( )
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
      return "FormulacionTinte.ProcesoQuimico_4" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Proceso Quimico (Lineas)", "") ;
   }

   public void wb1WT0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.formulaciontinte.procesoquimico_4");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
         /* User Defined Control */
         ucDvpanel_tablemain.setProperty("Width", Dvpanel_tablemain_Width);
         ucDvpanel_tablemain.setProperty("AutoWidth", Dvpanel_tablemain_Autowidth);
         ucDvpanel_tablemain.setProperty("AutoHeight", Dvpanel_tablemain_Autoheight);
         ucDvpanel_tablemain.setProperty("Cls", Dvpanel_tablemain_Cls);
         ucDvpanel_tablemain.setProperty("Title", Dvpanel_tablemain_Title);
         ucDvpanel_tablemain.setProperty("Collapsible", Dvpanel_tablemain_Collapsible);
         ucDvpanel_tablemain.setProperty("Collapsed", Dvpanel_tablemain_Collapsed);
         ucDvpanel_tablemain.setProperty("ShowCollapseIcon", Dvpanel_tablemain_Showcollapseicon);
         ucDvpanel_tablemain.setProperty("IconPosition", Dvpanel_tablemain_Iconposition);
         ucDvpanel_tablemain.setProperty("AutoScroll", Dvpanel_tablemain_Autoscroll);
         ucDvpanel_tablemain.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tablemain_Internalname, sPrefix+"DVPANEL_TABLEMAINContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_TABLEMAINContainer"+"TableMain"+"\" style=\"display:none;\">") ;
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol14( ) ;
      }
      if ( wbEnd == 14 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_14 = (int)(nGXsfl_14_idx-1) ;
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV38Pgmname), GXutil.rtrim( localUtil.format( AV38Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesoQuimico_4.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV35DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("InfiniteScrolling", Grid_empowerer_Infinitescrolling);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 14 )
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

   public void start1WT2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " Proceso Quimico (Lineas)", ""), (short)(0)) ;
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
            strup1WT0( ) ;
         }
      }
   }

   public void ws1WT2( )
   {
      start1WT2( ) ;
      evt1WT2( ) ;
   }

   public void evt1WT2( )
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
                              strup1WT0( ) ;
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
                              strup1WT0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e111WT2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1WT0( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1WT0( ) ;
                           }
                           AV42Formulaciontinte_procesoquimico_4ds_1_tfproforlin = AV17TFProForLin ;
                           AV43Formulaciontinte_procesoquimico_4ds_2_tfproforlin_to = AV18TFProForLin_To ;
                           AV44Formulaciontinte_procesoquimico_4ds_3_tfproforprd = AV19TFProForPrd ;
                           AV45Formulaciontinte_procesoquimico_4ds_4_tfproforprd_sel = AV20TFProForPrd_Sel ;
                           AV46Formulaciontinte_procesoquimico_4ds_5_tfprofordes = AV21TFProForDes ;
                           AV47Formulaciontinte_procesoquimico_4ds_6_tfprofordes_sel = AV22TFProForDes_Sel ;
                           AV48Formulaciontinte_procesoquimico_4ds_7_tfproforcan = AV23TFProForCan ;
                           AV49Formulaciontinte_procesoquimico_4ds_8_tfproforcan_to = AV24TFProForCan_To ;
                           AV50Formulaciontinte_procesoquimico_4ds_9_tfforprddsc = AV25TFForPrdDsc ;
                           AV51Formulaciontinte_procesoquimico_4ds_10_tfforprddsc_sel = AV26TFForPrdDsc_Sel ;
                           AV52Formulaciontinte_procesoquimico_4ds_11_tfprofornro = AV27TFProForNro ;
                           AV53Formulaciontinte_procesoquimico_4ds_12_tfprofornro_to = AV28TFProForNro_To ;
                           AV54Formulaciontinte_procesoquimico_4ds_13_tfprofortnq = AV29TFProForTnq ;
                           AV55Formulaciontinte_procesoquimico_4ds_14_tfprofortnq_to = AV30TFProForTnq_To ;
                           AV56Formulaciontinte_procesoquimico_4ds_15_tfproforcla = AV31TFProForCla ;
                           AV57Formulaciontinte_procesoquimico_4ds_16_tfproforcla_sel = AV32TFProForCla_Sel ;
                           AV58Formulaciontinte_procesoquimico_4ds_17_tfproforclv = AV33TFProForClv ;
                           AV59Formulaciontinte_procesoquimico_4ds_18_tfproforclv_sel = AV34TFProForClv_Sel ;
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
                              strup1WT0( ) ;
                           }
                           nGXsfl_14_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_14_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_14_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_142( ) ;
                           A767ProForLin = (short)(localUtil.ctol( httpContext.cgiGet( edtProForLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A770ProForPrd = httpContext.cgiGet( edtProForPrd_Internalname) ;
                           A765ProForDes = httpContext.cgiGet( edtProForDes_Internalname) ;
                           A762ProForCan = localUtil.ctond( httpContext.cgiGet( edtProForCan_Internalname)) ;
                           A488ForPrdDsc = httpContext.cgiGet( edtForPrdDsc_Internalname) ;
                           n488ForPrdDsc = false ;
                           A1645ProForNro = (byte)(localUtil.ctol( httpContext.cgiGet( edtProForNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A3379ProForTnq = (byte)(localUtil.ctol( httpContext.cgiGet( edtProForTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A763ProForCla = httpContext.cgiGet( edtProForCla_Internalname) ;
                           A5358ProForClv = httpContext.cgiGet( edtProForClv_Internalname) ;
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
                                       /* Execute user event: Start */
                                       e121WT2 ();
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
                                       /* Execute user event: Refresh */
                                       e131WT2 ();
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
                                       e141WT2 ();
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
                                    strup1WT0( ) ;
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

   public void we1WT2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1WT2( ) ;
         }
      }
   }

   public void pa1WT2( )
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
      subsflControlProps_142( ) ;
      while ( nGXsfl_14_idx <= nRC_GXsfl_14 )
      {
         sendrow_142( ) ;
         nGXsfl_14_idx = ((subGrid_Islastpage==1)&&(nGXsfl_14_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_14_idx+1) ;
         sGXsfl_14_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_14_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_142( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV5Emprcod ,
                                 String AV6Proforcod ,
                                 short AV17TFProForLin ,
                                 short AV18TFProForLin_To ,
                                 String AV19TFProForPrd ,
                                 String AV20TFProForPrd_Sel ,
                                 String AV21TFProForDes ,
                                 String AV22TFProForDes_Sel ,
                                 java.math.BigDecimal AV23TFProForCan ,
                                 java.math.BigDecimal AV24TFProForCan_To ,
                                 String AV25TFForPrdDsc ,
                                 String AV26TFForPrdDsc_Sel ,
                                 byte AV27TFProForNro ,
                                 byte AV28TFProForNro_To ,
                                 byte AV29TFProForTnq ,
                                 byte AV30TFProForTnq_To ,
                                 String AV31TFProForCla ,
                                 String AV32TFProForCla_Sel ,
                                 String AV33TFProForClv ,
                                 String AV34TFProForClv_Sel ,
                                 String AV38Pgmname ,
                                 short AV14OrderedBy ,
                                 boolean AV15OrderedDsc ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e131WT2 ();
      GRID_nCurrentRecord = 0 ;
      rf1WT2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ProcesoQuimico_4");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV38Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\procesoquimico_4:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      GRID_nFirstRecordOnPage = 0 ;
      GRID_nCurrentRecord = 0 ;
      GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_14_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      send_integrity_hashes( ) ;
      rf1WT2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV38Pgmname = "FormulacionTinte.ProcesoQuimico_4" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38Pgmname", AV38Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1WT2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(14) ;
      /* Execute user event: Refresh */
      e131WT2 ();
      nGXsfl_14_idx = (int)(1+GRID_nFirstRecordOnPage) ;
      sGXsfl_14_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_14_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_142( ) ;
      bGXsfl_14_Refreshing = true ;
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
         subsflControlProps_142( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Short.valueOf(AV42Formulaciontinte_procesoquimico_4ds_1_tfproforlin) ,
                                              Short.valueOf(AV43Formulaciontinte_procesoquimico_4ds_2_tfproforlin_to) ,
                                              AV45Formulaciontinte_procesoquimico_4ds_4_tfproforprd_sel ,
                                              AV44Formulaciontinte_procesoquimico_4ds_3_tfproforprd ,
                                              AV47Formulaciontinte_procesoquimico_4ds_6_tfprofordes_sel ,
                                              AV46Formulaciontinte_procesoquimico_4ds_5_tfprofordes ,
                                              AV48Formulaciontinte_procesoquimico_4ds_7_tfproforcan ,
                                              AV49Formulaciontinte_procesoquimico_4ds_8_tfproforcan_to ,
                                              AV51Formulaciontinte_procesoquimico_4ds_10_tfforprddsc_sel ,
                                              AV50Formulaciontinte_procesoquimico_4ds_9_tfforprddsc ,
                                              Byte.valueOf(AV52Formulaciontinte_procesoquimico_4ds_11_tfprofornro) ,
                                              Byte.valueOf(AV53Formulaciontinte_procesoquimico_4ds_12_tfprofornro_to) ,
                                              Byte.valueOf(AV54Formulaciontinte_procesoquimico_4ds_13_tfprofortnq) ,
                                              Byte.valueOf(AV55Formulaciontinte_procesoquimico_4ds_14_tfprofortnq_to) ,
                                              AV57Formulaciontinte_procesoquimico_4ds_16_tfproforcla_sel ,
                                              AV56Formulaciontinte_procesoquimico_4ds_15_tfproforcla ,
                                              AV59Formulaciontinte_procesoquimico_4ds_18_tfproforclv_sel ,
                                              AV58Formulaciontinte_procesoquimico_4ds_17_tfproforclv ,
                                              Short.valueOf(A767ProForLin) ,
                                              A770ProForPrd ,
                                              A765ProForDes ,
                                              A762ProForCan ,
                                              A488ForPrdDsc ,
                                              Byte.valueOf(A1645ProForNro) ,
                                              Byte.valueOf(A3379ProForTnq) ,
                                              A763ProForCla ,
                                              A5358ProForClv ,
                                              Short.valueOf(AV14OrderedBy) ,
                                              Boolean.valueOf(AV15OrderedDsc) ,
                                              AV5Emprcod ,
                                              AV6Proforcod ,
                                              A396EmprCod ,
                                              A764ProForCod } ,
                                              new int[]{
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV44Formulaciontinte_procesoquimico_4ds_3_tfproforprd = GXutil.padr( GXutil.rtrim( AV44Formulaciontinte_procesoquimico_4ds_3_tfproforprd), 6, "%") ;
         lV46Formulaciontinte_procesoquimico_4ds_5_tfprofordes = GXutil.padr( GXutil.rtrim( AV46Formulaciontinte_procesoquimico_4ds_5_tfprofordes), 26, "%") ;
         lV50Formulaciontinte_procesoquimico_4ds_9_tfforprddsc = GXutil.padr( GXutil.rtrim( AV50Formulaciontinte_procesoquimico_4ds_9_tfforprddsc), 5, "%") ;
         lV56Formulaciontinte_procesoquimico_4ds_15_tfproforcla = GXutil.padr( GXutil.rtrim( AV56Formulaciontinte_procesoquimico_4ds_15_tfproforcla), 16, "%") ;
         lV58Formulaciontinte_procesoquimico_4ds_17_tfproforclv = GXutil.padr( GXutil.rtrim( AV58Formulaciontinte_procesoquimico_4ds_17_tfproforclv), 30, "%") ;
         /* Using cursor H01WT2 */
         pr_default.execute(0, new Object[] {AV5Emprcod, AV6Proforcod, Short.valueOf(AV42Formulaciontinte_procesoquimico_4ds_1_tfproforlin), Short.valueOf(AV43Formulaciontinte_procesoquimico_4ds_2_tfproforlin_to), lV44Formulaciontinte_procesoquimico_4ds_3_tfproforprd, AV45Formulaciontinte_procesoquimico_4ds_4_tfproforprd_sel, lV46Formulaciontinte_procesoquimico_4ds_5_tfprofordes, AV47Formulaciontinte_procesoquimico_4ds_6_tfprofordes_sel, AV48Formulaciontinte_procesoquimico_4ds_7_tfproforcan, AV49Formulaciontinte_procesoquimico_4ds_8_tfproforcan_to, lV50Formulaciontinte_procesoquimico_4ds_9_tfforprddsc, AV51Formulaciontinte_procesoquimico_4ds_10_tfforprddsc_sel, Byte.valueOf(AV52Formulaciontinte_procesoquimico_4ds_11_tfprofornro), Byte.valueOf(AV53Formulaciontinte_procesoquimico_4ds_12_tfprofornro_to), Byte.valueOf(AV54Formulaciontinte_procesoquimico_4ds_13_tfprofortnq), Byte.valueOf(AV55Formulaciontinte_procesoquimico_4ds_14_tfprofortnq_to), lV56Formulaciontinte_procesoquimico_4ds_15_tfproforcla, AV57Formulaciontinte_procesoquimico_4ds_16_tfproforcla_sel, lV58Formulaciontinte_procesoquimico_4ds_17_tfproforclv, AV59Formulaciontinte_procesoquimico_4ds_18_tfproforclv_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_14_idx = (int)(1+GRID_nFirstRecordOnPage) ;
         sGXsfl_14_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_14_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_142( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A490ForPrdUMe = H01WT2_A490ForPrdUMe[0] ;
            A396EmprCod = H01WT2_A396EmprCod[0] ;
            A764ProForCod = H01WT2_A764ProForCod[0] ;
            A5358ProForClv = H01WT2_A5358ProForClv[0] ;
            A763ProForCla = H01WT2_A763ProForCla[0] ;
            A3379ProForTnq = H01WT2_A3379ProForTnq[0] ;
            A1645ProForNro = H01WT2_A1645ProForNro[0] ;
            A488ForPrdDsc = H01WT2_A488ForPrdDsc[0] ;
            n488ForPrdDsc = H01WT2_n488ForPrdDsc[0] ;
            A762ProForCan = H01WT2_A762ProForCan[0] ;
            A765ProForDes = H01WT2_A765ProForDes[0] ;
            A770ProForPrd = H01WT2_A770ProForPrd[0] ;
            A767ProForLin = H01WT2_A767ProForLin[0] ;
            A488ForPrdDsc = H01WT2_A488ForPrdDsc[0] ;
            n488ForPrdDsc = H01WT2_n488ForPrdDsc[0] ;
            e141WT2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(14) ;
         wb1WT0( ) ;
      }
      bGXsfl_14_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1WT2( )
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
      AV42Formulaciontinte_procesoquimico_4ds_1_tfproforlin = AV17TFProForLin ;
      AV43Formulaciontinte_procesoquimico_4ds_2_tfproforlin_to = AV18TFProForLin_To ;
      AV44Formulaciontinte_procesoquimico_4ds_3_tfproforprd = AV19TFProForPrd ;
      AV45Formulaciontinte_procesoquimico_4ds_4_tfproforprd_sel = AV20TFProForPrd_Sel ;
      AV46Formulaciontinte_procesoquimico_4ds_5_tfprofordes = AV21TFProForDes ;
      AV47Formulaciontinte_procesoquimico_4ds_6_tfprofordes_sel = AV22TFProForDes_Sel ;
      AV48Formulaciontinte_procesoquimico_4ds_7_tfproforcan = AV23TFProForCan ;
      AV49Formulaciontinte_procesoquimico_4ds_8_tfproforcan_to = AV24TFProForCan_To ;
      AV50Formulaciontinte_procesoquimico_4ds_9_tfforprddsc = AV25TFForPrdDsc ;
      AV51Formulaciontinte_procesoquimico_4ds_10_tfforprddsc_sel = AV26TFForPrdDsc_Sel ;
      AV52Formulaciontinte_procesoquimico_4ds_11_tfprofornro = AV27TFProForNro ;
      AV53Formulaciontinte_procesoquimico_4ds_12_tfprofornro_to = AV28TFProForNro_To ;
      AV54Formulaciontinte_procesoquimico_4ds_13_tfprofortnq = AV29TFProForTnq ;
      AV55Formulaciontinte_procesoquimico_4ds_14_tfprofortnq_to = AV30TFProForTnq_To ;
      AV56Formulaciontinte_procesoquimico_4ds_15_tfproforcla = AV31TFProForCla ;
      AV57Formulaciontinte_procesoquimico_4ds_16_tfproforcla_sel = AV32TFProForCla_Sel ;
      AV58Formulaciontinte_procesoquimico_4ds_17_tfproforclv = AV33TFProForClv ;
      AV59Formulaciontinte_procesoquimico_4ds_18_tfproforclv_sel = AV34TFProForClv_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV42Formulaciontinte_procesoquimico_4ds_1_tfproforlin) ,
                                           Short.valueOf(AV43Formulaciontinte_procesoquimico_4ds_2_tfproforlin_to) ,
                                           AV45Formulaciontinte_procesoquimico_4ds_4_tfproforprd_sel ,
                                           AV44Formulaciontinte_procesoquimico_4ds_3_tfproforprd ,
                                           AV47Formulaciontinte_procesoquimico_4ds_6_tfprofordes_sel ,
                                           AV46Formulaciontinte_procesoquimico_4ds_5_tfprofordes ,
                                           AV48Formulaciontinte_procesoquimico_4ds_7_tfproforcan ,
                                           AV49Formulaciontinte_procesoquimico_4ds_8_tfproforcan_to ,
                                           AV51Formulaciontinte_procesoquimico_4ds_10_tfforprddsc_sel ,
                                           AV50Formulaciontinte_procesoquimico_4ds_9_tfforprddsc ,
                                           Byte.valueOf(AV52Formulaciontinte_procesoquimico_4ds_11_tfprofornro) ,
                                           Byte.valueOf(AV53Formulaciontinte_procesoquimico_4ds_12_tfprofornro_to) ,
                                           Byte.valueOf(AV54Formulaciontinte_procesoquimico_4ds_13_tfprofortnq) ,
                                           Byte.valueOf(AV55Formulaciontinte_procesoquimico_4ds_14_tfprofortnq_to) ,
                                           AV57Formulaciontinte_procesoquimico_4ds_16_tfproforcla_sel ,
                                           AV56Formulaciontinte_procesoquimico_4ds_15_tfproforcla ,
                                           AV59Formulaciontinte_procesoquimico_4ds_18_tfproforclv_sel ,
                                           AV58Formulaciontinte_procesoquimico_4ds_17_tfproforclv ,
                                           Short.valueOf(A767ProForLin) ,
                                           A770ProForPrd ,
                                           A765ProForDes ,
                                           A762ProForCan ,
                                           A488ForPrdDsc ,
                                           Byte.valueOf(A1645ProForNro) ,
                                           Byte.valueOf(A3379ProForTnq) ,
                                           A763ProForCla ,
                                           A5358ProForClv ,
                                           Short.valueOf(AV14OrderedBy) ,
                                           Boolean.valueOf(AV15OrderedDsc) ,
                                           AV5Emprcod ,
                                           AV6Proforcod ,
                                           A396EmprCod ,
                                           A764ProForCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV44Formulaciontinte_procesoquimico_4ds_3_tfproforprd = GXutil.padr( GXutil.rtrim( AV44Formulaciontinte_procesoquimico_4ds_3_tfproforprd), 6, "%") ;
      lV46Formulaciontinte_procesoquimico_4ds_5_tfprofordes = GXutil.padr( GXutil.rtrim( AV46Formulaciontinte_procesoquimico_4ds_5_tfprofordes), 26, "%") ;
      lV50Formulaciontinte_procesoquimico_4ds_9_tfforprddsc = GXutil.padr( GXutil.rtrim( AV50Formulaciontinte_procesoquimico_4ds_9_tfforprddsc), 5, "%") ;
      lV56Formulaciontinte_procesoquimico_4ds_15_tfproforcla = GXutil.padr( GXutil.rtrim( AV56Formulaciontinte_procesoquimico_4ds_15_tfproforcla), 16, "%") ;
      lV58Formulaciontinte_procesoquimico_4ds_17_tfproforclv = GXutil.padr( GXutil.rtrim( AV58Formulaciontinte_procesoquimico_4ds_17_tfproforclv), 30, "%") ;
      /* Using cursor H01WT3 */
      pr_default.execute(1, new Object[] {AV5Emprcod, AV6Proforcod, Short.valueOf(AV42Formulaciontinte_procesoquimico_4ds_1_tfproforlin), Short.valueOf(AV43Formulaciontinte_procesoquimico_4ds_2_tfproforlin_to), lV44Formulaciontinte_procesoquimico_4ds_3_tfproforprd, AV45Formulaciontinte_procesoquimico_4ds_4_tfproforprd_sel, lV46Formulaciontinte_procesoquimico_4ds_5_tfprofordes, AV47Formulaciontinte_procesoquimico_4ds_6_tfprofordes_sel, AV48Formulaciontinte_procesoquimico_4ds_7_tfproforcan, AV49Formulaciontinte_procesoquimico_4ds_8_tfproforcan_to, lV50Formulaciontinte_procesoquimico_4ds_9_tfforprddsc, AV51Formulaciontinte_procesoquimico_4ds_10_tfforprddsc_sel, Byte.valueOf(AV52Formulaciontinte_procesoquimico_4ds_11_tfprofornro), Byte.valueOf(AV53Formulaciontinte_procesoquimico_4ds_12_tfprofornro_to), Byte.valueOf(AV54Formulaciontinte_procesoquimico_4ds_13_tfprofortnq), Byte.valueOf(AV55Formulaciontinte_procesoquimico_4ds_14_tfprofortnq_to), lV56Formulaciontinte_procesoquimico_4ds_15_tfproforcla, AV57Formulaciontinte_procesoquimico_4ds_16_tfproforcla_sel, lV58Formulaciontinte_procesoquimico_4ds_17_tfproforclv, AV59Formulaciontinte_procesoquimico_4ds_18_tfproforclv_sel});
      GRID_nRecordCount = H01WT3_AGRID_nRecordCount[0] ;
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
      AV42Formulaciontinte_procesoquimico_4ds_1_tfproforlin = AV17TFProForLin ;
      AV43Formulaciontinte_procesoquimico_4ds_2_tfproforlin_to = AV18TFProForLin_To ;
      AV44Formulaciontinte_procesoquimico_4ds_3_tfproforprd = AV19TFProForPrd ;
      AV45Formulaciontinte_procesoquimico_4ds_4_tfproforprd_sel = AV20TFProForPrd_Sel ;
      AV46Formulaciontinte_procesoquimico_4ds_5_tfprofordes = AV21TFProForDes ;
      AV47Formulaciontinte_procesoquimico_4ds_6_tfprofordes_sel = AV22TFProForDes_Sel ;
      AV48Formulaciontinte_procesoquimico_4ds_7_tfproforcan = AV23TFProForCan ;
      AV49Formulaciontinte_procesoquimico_4ds_8_tfproforcan_to = AV24TFProForCan_To ;
      AV50Formulaciontinte_procesoquimico_4ds_9_tfforprddsc = AV25TFForPrdDsc ;
      AV51Formulaciontinte_procesoquimico_4ds_10_tfforprddsc_sel = AV26TFForPrdDsc_Sel ;
      AV52Formulaciontinte_procesoquimico_4ds_11_tfprofornro = AV27TFProForNro ;
      AV53Formulaciontinte_procesoquimico_4ds_12_tfprofornro_to = AV28TFProForNro_To ;
      AV54Formulaciontinte_procesoquimico_4ds_13_tfprofortnq = AV29TFProForTnq ;
      AV55Formulaciontinte_procesoquimico_4ds_14_tfprofortnq_to = AV30TFProForTnq_To ;
      AV56Formulaciontinte_procesoquimico_4ds_15_tfproforcla = AV31TFProForCla ;
      AV57Formulaciontinte_procesoquimico_4ds_16_tfproforcla_sel = AV32TFProForCla_Sel ;
      AV58Formulaciontinte_procesoquimico_4ds_17_tfproforclv = AV33TFProForClv ;
      AV59Formulaciontinte_procesoquimico_4ds_18_tfproforclv_sel = AV34TFProForClv_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV6Proforcod, AV17TFProForLin, AV18TFProForLin_To, AV19TFProForPrd, AV20TFProForPrd_Sel, AV21TFProForDes, AV22TFProForDes_Sel, AV23TFProForCan, AV24TFProForCan_To, AV25TFForPrdDsc, AV26TFForPrdDsc_Sel, AV27TFProForNro, AV28TFProForNro_To, AV29TFProForTnq, AV30TFProForTnq_To, AV31TFProForCla, AV32TFProForCla_Sel, AV33TFProForClv, AV34TFProForClv_Sel, AV38Pgmname, AV14OrderedBy, AV15OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV42Formulaciontinte_procesoquimico_4ds_1_tfproforlin = AV17TFProForLin ;
      AV43Formulaciontinte_procesoquimico_4ds_2_tfproforlin_to = AV18TFProForLin_To ;
      AV44Formulaciontinte_procesoquimico_4ds_3_tfproforprd = AV19TFProForPrd ;
      AV45Formulaciontinte_procesoquimico_4ds_4_tfproforprd_sel = AV20TFProForPrd_Sel ;
      AV46Formulaciontinte_procesoquimico_4ds_5_tfprofordes = AV21TFProForDes ;
      AV47Formulaciontinte_procesoquimico_4ds_6_tfprofordes_sel = AV22TFProForDes_Sel ;
      AV48Formulaciontinte_procesoquimico_4ds_7_tfproforcan = AV23TFProForCan ;
      AV49Formulaciontinte_procesoquimico_4ds_8_tfproforcan_to = AV24TFProForCan_To ;
      AV50Formulaciontinte_procesoquimico_4ds_9_tfforprddsc = AV25TFForPrdDsc ;
      AV51Formulaciontinte_procesoquimico_4ds_10_tfforprddsc_sel = AV26TFForPrdDsc_Sel ;
      AV52Formulaciontinte_procesoquimico_4ds_11_tfprofornro = AV27TFProForNro ;
      AV53Formulaciontinte_procesoquimico_4ds_12_tfprofornro_to = AV28TFProForNro_To ;
      AV54Formulaciontinte_procesoquimico_4ds_13_tfprofortnq = AV29TFProForTnq ;
      AV55Formulaciontinte_procesoquimico_4ds_14_tfprofortnq_to = AV30TFProForTnq_To ;
      AV56Formulaciontinte_procesoquimico_4ds_15_tfproforcla = AV31TFProForCla ;
      AV57Formulaciontinte_procesoquimico_4ds_16_tfproforcla_sel = AV32TFProForCla_Sel ;
      AV58Formulaciontinte_procesoquimico_4ds_17_tfproforclv = AV33TFProForClv ;
      AV59Formulaciontinte_procesoquimico_4ds_18_tfproforclv_sel = AV34TFProForClv_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV6Proforcod, AV17TFProForLin, AV18TFProForLin_To, AV19TFProForPrd, AV20TFProForPrd_Sel, AV21TFProForDes, AV22TFProForDes_Sel, AV23TFProForCan, AV24TFProForCan_To, AV25TFForPrdDsc, AV26TFForPrdDsc_Sel, AV27TFProForNro, AV28TFProForNro_To, AV29TFProForTnq, AV30TFProForTnq_To, AV31TFProForCla, AV32TFProForCla_Sel, AV33TFProForClv, AV34TFProForClv_Sel, AV38Pgmname, AV14OrderedBy, AV15OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV42Formulaciontinte_procesoquimico_4ds_1_tfproforlin = AV17TFProForLin ;
      AV43Formulaciontinte_procesoquimico_4ds_2_tfproforlin_to = AV18TFProForLin_To ;
      AV44Formulaciontinte_procesoquimico_4ds_3_tfproforprd = AV19TFProForPrd ;
      AV45Formulaciontinte_procesoquimico_4ds_4_tfproforprd_sel = AV20TFProForPrd_Sel ;
      AV46Formulaciontinte_procesoquimico_4ds_5_tfprofordes = AV21TFProForDes ;
      AV47Formulaciontinte_procesoquimico_4ds_6_tfprofordes_sel = AV22TFProForDes_Sel ;
      AV48Formulaciontinte_procesoquimico_4ds_7_tfproforcan = AV23TFProForCan ;
      AV49Formulaciontinte_procesoquimico_4ds_8_tfproforcan_to = AV24TFProForCan_To ;
      AV50Formulaciontinte_procesoquimico_4ds_9_tfforprddsc = AV25TFForPrdDsc ;
      AV51Formulaciontinte_procesoquimico_4ds_10_tfforprddsc_sel = AV26TFForPrdDsc_Sel ;
      AV52Formulaciontinte_procesoquimico_4ds_11_tfprofornro = AV27TFProForNro ;
      AV53Formulaciontinte_procesoquimico_4ds_12_tfprofornro_to = AV28TFProForNro_To ;
      AV54Formulaciontinte_procesoquimico_4ds_13_tfprofortnq = AV29TFProForTnq ;
      AV55Formulaciontinte_procesoquimico_4ds_14_tfprofortnq_to = AV30TFProForTnq_To ;
      AV56Formulaciontinte_procesoquimico_4ds_15_tfproforcla = AV31TFProForCla ;
      AV57Formulaciontinte_procesoquimico_4ds_16_tfproforcla_sel = AV32TFProForCla_Sel ;
      AV58Formulaciontinte_procesoquimico_4ds_17_tfproforclv = AV33TFProForClv ;
      AV59Formulaciontinte_procesoquimico_4ds_18_tfproforclv_sel = AV34TFProForClv_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV6Proforcod, AV17TFProForLin, AV18TFProForLin_To, AV19TFProForPrd, AV20TFProForPrd_Sel, AV21TFProForDes, AV22TFProForDes_Sel, AV23TFProForCan, AV24TFProForCan_To, AV25TFForPrdDsc, AV26TFForPrdDsc_Sel, AV27TFProForNro, AV28TFProForNro_To, AV29TFProForTnq, AV30TFProForTnq_To, AV31TFProForCla, AV32TFProForCla_Sel, AV33TFProForClv, AV34TFProForClv_Sel, AV38Pgmname, AV14OrderedBy, AV15OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV42Formulaciontinte_procesoquimico_4ds_1_tfproforlin = AV17TFProForLin ;
      AV43Formulaciontinte_procesoquimico_4ds_2_tfproforlin_to = AV18TFProForLin_To ;
      AV44Formulaciontinte_procesoquimico_4ds_3_tfproforprd = AV19TFProForPrd ;
      AV45Formulaciontinte_procesoquimico_4ds_4_tfproforprd_sel = AV20TFProForPrd_Sel ;
      AV46Formulaciontinte_procesoquimico_4ds_5_tfprofordes = AV21TFProForDes ;
      AV47Formulaciontinte_procesoquimico_4ds_6_tfprofordes_sel = AV22TFProForDes_Sel ;
      AV48Formulaciontinte_procesoquimico_4ds_7_tfproforcan = AV23TFProForCan ;
      AV49Formulaciontinte_procesoquimico_4ds_8_tfproforcan_to = AV24TFProForCan_To ;
      AV50Formulaciontinte_procesoquimico_4ds_9_tfforprddsc = AV25TFForPrdDsc ;
      AV51Formulaciontinte_procesoquimico_4ds_10_tfforprddsc_sel = AV26TFForPrdDsc_Sel ;
      AV52Formulaciontinte_procesoquimico_4ds_11_tfprofornro = AV27TFProForNro ;
      AV53Formulaciontinte_procesoquimico_4ds_12_tfprofornro_to = AV28TFProForNro_To ;
      AV54Formulaciontinte_procesoquimico_4ds_13_tfprofortnq = AV29TFProForTnq ;
      AV55Formulaciontinte_procesoquimico_4ds_14_tfprofortnq_to = AV30TFProForTnq_To ;
      AV56Formulaciontinte_procesoquimico_4ds_15_tfproforcla = AV31TFProForCla ;
      AV57Formulaciontinte_procesoquimico_4ds_16_tfproforcla_sel = AV32TFProForCla_Sel ;
      AV58Formulaciontinte_procesoquimico_4ds_17_tfproforclv = AV33TFProForClv ;
      AV59Formulaciontinte_procesoquimico_4ds_18_tfproforclv_sel = AV34TFProForClv_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV6Proforcod, AV17TFProForLin, AV18TFProForLin_To, AV19TFProForPrd, AV20TFProForPrd_Sel, AV21TFProForDes, AV22TFProForDes_Sel, AV23TFProForCan, AV24TFProForCan_To, AV25TFForPrdDsc, AV26TFForPrdDsc_Sel, AV27TFProForNro, AV28TFProForNro_To, AV29TFProForTnq, AV30TFProForTnq_To, AV31TFProForCla, AV32TFProForCla_Sel, AV33TFProForClv, AV34TFProForClv_Sel, AV38Pgmname, AV14OrderedBy, AV15OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV42Formulaciontinte_procesoquimico_4ds_1_tfproforlin = AV17TFProForLin ;
      AV43Formulaciontinte_procesoquimico_4ds_2_tfproforlin_to = AV18TFProForLin_To ;
      AV44Formulaciontinte_procesoquimico_4ds_3_tfproforprd = AV19TFProForPrd ;
      AV45Formulaciontinte_procesoquimico_4ds_4_tfproforprd_sel = AV20TFProForPrd_Sel ;
      AV46Formulaciontinte_procesoquimico_4ds_5_tfprofordes = AV21TFProForDes ;
      AV47Formulaciontinte_procesoquimico_4ds_6_tfprofordes_sel = AV22TFProForDes_Sel ;
      AV48Formulaciontinte_procesoquimico_4ds_7_tfproforcan = AV23TFProForCan ;
      AV49Formulaciontinte_procesoquimico_4ds_8_tfproforcan_to = AV24TFProForCan_To ;
      AV50Formulaciontinte_procesoquimico_4ds_9_tfforprddsc = AV25TFForPrdDsc ;
      AV51Formulaciontinte_procesoquimico_4ds_10_tfforprddsc_sel = AV26TFForPrdDsc_Sel ;
      AV52Formulaciontinte_procesoquimico_4ds_11_tfprofornro = AV27TFProForNro ;
      AV53Formulaciontinte_procesoquimico_4ds_12_tfprofornro_to = AV28TFProForNro_To ;
      AV54Formulaciontinte_procesoquimico_4ds_13_tfprofortnq = AV29TFProForTnq ;
      AV55Formulaciontinte_procesoquimico_4ds_14_tfprofortnq_to = AV30TFProForTnq_To ;
      AV56Formulaciontinte_procesoquimico_4ds_15_tfproforcla = AV31TFProForCla ;
      AV57Formulaciontinte_procesoquimico_4ds_16_tfproforcla_sel = AV32TFProForCla_Sel ;
      AV58Formulaciontinte_procesoquimico_4ds_17_tfproforclv = AV33TFProForClv ;
      AV59Formulaciontinte_procesoquimico_4ds_18_tfproforclv_sel = AV34TFProForClv_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV6Proforcod, AV17TFProForLin, AV18TFProForLin_To, AV19TFProForPrd, AV20TFProForPrd_Sel, AV21TFProForDes, AV22TFProForDes_Sel, AV23TFProForCan, AV24TFProForCan_To, AV25TFForPrdDsc, AV26TFForPrdDsc_Sel, AV27TFProForNro, AV28TFProForNro_To, AV29TFProForTnq, AV30TFProForTnq_To, AV31TFProForCla, AV32TFProForCla_Sel, AV33TFProForClv, AV34TFProForClv_Sel, AV38Pgmname, AV14OrderedBy, AV15OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV38Pgmname = "FormulacionTinte.ProcesoQuimico_4" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38Pgmname", AV38Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1WT0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e121WT2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV35DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_14 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_14"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV5Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV5Emprcod") ;
         wcpOAV6Proforcod = httpContext.cgiGet( sPrefix+"wcpOAV6Proforcod") ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvpanel_tablemain_Width = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEMAIN_Width") ;
         Dvpanel_tablemain_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEMAIN_Autowidth")) ;
         Dvpanel_tablemain_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEMAIN_Autoheight")) ;
         Dvpanel_tablemain_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEMAIN_Cls") ;
         Dvpanel_tablemain_Title = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEMAIN_Title") ;
         Dvpanel_tablemain_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEMAIN_Collapsible")) ;
         Dvpanel_tablemain_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEMAIN_Collapsed")) ;
         Dvpanel_tablemain_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEMAIN_Showcollapseicon")) ;
         Dvpanel_tablemain_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEMAIN_Iconposition") ;
         Dvpanel_tablemain_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEMAIN_Autoscroll")) ;
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
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Infinitescrolling = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Infinitescrolling") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         /* Read variables values. */
         AV38Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38Pgmname", AV38Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ProcesoQuimico_4");
         AV38Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38Pgmname", AV38Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV38Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("formulaciontinte\\procesoquimico_4:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e121WT2 ();
      if (returnInSub) return;
   }

   public void e121WT2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV39Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      procesoquimico_4_impl.this.GXt_char1 = GXv_char2[0] ;
      AV39Station = GXt_char1 ;
      GXv_char2[0] = AV5Emprcod ;
      GXv_char3[0] = AV40Emprnom ;
      GXv_char4[0] = AV41Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV39Station, GXv_char2, GXv_char3, GXv_char4) ;
      procesoquimico_4_impl.this.AV5Emprcod = GXv_char2[0] ;
      procesoquimico_4_impl.this.AV40Emprnom = GXv_char3[0] ;
      procesoquimico_4_impl.this.AV41Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      subGrid_Rows = 50 ;
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
      if ( AV14OrderedBy < 1 )
      {
         AV14OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV35DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV35DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
   }

   public void e131WT2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV8WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV8WWPContext = GXv_SdtWWPContext7[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      AV42Formulaciontinte_procesoquimico_4ds_1_tfproforlin = AV17TFProForLin ;
      AV43Formulaciontinte_procesoquimico_4ds_2_tfproforlin_to = AV18TFProForLin_To ;
      AV44Formulaciontinte_procesoquimico_4ds_3_tfproforprd = AV19TFProForPrd ;
      AV45Formulaciontinte_procesoquimico_4ds_4_tfproforprd_sel = AV20TFProForPrd_Sel ;
      AV46Formulaciontinte_procesoquimico_4ds_5_tfprofordes = AV21TFProForDes ;
      AV47Formulaciontinte_procesoquimico_4ds_6_tfprofordes_sel = AV22TFProForDes_Sel ;
      AV48Formulaciontinte_procesoquimico_4ds_7_tfproforcan = AV23TFProForCan ;
      AV49Formulaciontinte_procesoquimico_4ds_8_tfproforcan_to = AV24TFProForCan_To ;
      AV50Formulaciontinte_procesoquimico_4ds_9_tfforprddsc = AV25TFForPrdDsc ;
      AV51Formulaciontinte_procesoquimico_4ds_10_tfforprddsc_sel = AV26TFForPrdDsc_Sel ;
      AV52Formulaciontinte_procesoquimico_4ds_11_tfprofornro = AV27TFProForNro ;
      AV53Formulaciontinte_procesoquimico_4ds_12_tfprofornro_to = AV28TFProForNro_To ;
      AV54Formulaciontinte_procesoquimico_4ds_13_tfprofortnq = AV29TFProForTnq ;
      AV55Formulaciontinte_procesoquimico_4ds_14_tfprofortnq_to = AV30TFProForTnq_To ;
      AV56Formulaciontinte_procesoquimico_4ds_15_tfproforcla = AV31TFProForCla ;
      AV57Formulaciontinte_procesoquimico_4ds_16_tfproforcla_sel = AV32TFProForCla_Sel ;
      AV58Formulaciontinte_procesoquimico_4ds_17_tfproforclv = AV33TFProForClv ;
      AV59Formulaciontinte_procesoquimico_4ds_18_tfproforclv_sel = AV34TFProForClv_Sel ;
   }

   public void e111WT2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProForLin") == 0 )
         {
            AV17TFProForLin = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17TFProForLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17TFProForLin), 4, 0));
            AV18TFProForLin_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18TFProForLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18TFProForLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProForPrd") == 0 )
         {
            AV19TFProForPrd = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19TFProForPrd", AV19TFProForPrd);
            AV20TFProForPrd_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20TFProForPrd_Sel", AV20TFProForPrd_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProForDes") == 0 )
         {
            AV21TFProForDes = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21TFProForDes", AV21TFProForDes);
            AV22TFProForDes_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22TFProForDes_Sel", AV22TFProForDes_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProForCan") == 0 )
         {
            AV23TFProForCan = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23TFProForCan", GXutil.ltrimstr( AV23TFProForCan, 12, 5));
            AV24TFProForCan_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24TFProForCan_To", GXutil.ltrimstr( AV24TFProForCan_To, 12, 5));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForPrdDsc") == 0 )
         {
            AV25TFForPrdDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25TFForPrdDsc", AV25TFForPrdDsc);
            AV26TFForPrdDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFForPrdDsc_Sel", AV26TFForPrdDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProForNro") == 0 )
         {
            AV27TFProForNro = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFProForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFProForNro), 2, 0));
            AV28TFProForNro_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFProForNro_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFProForNro_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProForTnq") == 0 )
         {
            AV29TFProForTnq = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFProForTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFProForTnq), 2, 0));
            AV30TFProForTnq_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFProForTnq_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFProForTnq_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProForCla") == 0 )
         {
            AV31TFProForCla = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFProForCla", AV31TFProForCla);
            AV32TFProForCla_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFProForCla_Sel", AV32TFProForCla_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProForClv") == 0 )
         {
            AV33TFProForClv = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFProForClv", AV33TFProForClv);
            AV34TFProForClv_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFProForClv_Sel", AV34TFProForClv_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e141WT2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(14) ;
      }
      sendrow_142( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_14_Refreshing )
      {
         httpContext.doAjaxLoad(14, GridRow);
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
      if ( GXutil.strcmp(AV16Session.getValue(AV38Pgmname+"GridState"), "") == 0 )
      {
         AV12GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV38Pgmname+"GridState"), null, null);
      }
      else
      {
         AV12GridState.fromxml(AV16Session.getValue(AV38Pgmname+"GridState"), null, null);
      }
      AV14OrderedBy = AV12GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14OrderedBy), 4, 0));
      AV15OrderedDsc = AV12GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15OrderedDsc", AV15OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV60GXV1 = 1 ;
      while ( AV60GXV1 <= AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV13GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV60GXV1));
         if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORLIN") == 0 )
         {
            AV17TFProForLin = (short)(GXutil.lval( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17TFProForLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17TFProForLin), 4, 0));
            AV18TFProForLin_To = (short)(GXutil.lval( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18TFProForLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18TFProForLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORPRD") == 0 )
         {
            AV19TFProForPrd = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19TFProForPrd", AV19TFProForPrd);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORPRD_SEL") == 0 )
         {
            AV20TFProForPrd_Sel = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20TFProForPrd_Sel", AV20TFProForPrd_Sel);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDES") == 0 )
         {
            AV21TFProForDes = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21TFProForDes", AV21TFProForDes);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDES_SEL") == 0 )
         {
            AV22TFProForDes_Sel = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22TFProForDes_Sel", AV22TFProForDes_Sel);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCAN") == 0 )
         {
            AV23TFProForCan = CommonUtil.decimalVal( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23TFProForCan", GXutil.ltrimstr( AV23TFProForCan, 12, 5));
            AV24TFProForCan_To = CommonUtil.decimalVal( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24TFProForCan_To", GXutil.ltrimstr( AV24TFProForCan_To, 12, 5));
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC") == 0 )
         {
            AV25TFForPrdDsc = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25TFForPrdDsc", AV25TFForPrdDsc);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC_SEL") == 0 )
         {
            AV26TFForPrdDsc_Sel = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFForPrdDsc_Sel", AV26TFForPrdDsc_Sel);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORNRO") == 0 )
         {
            AV27TFProForNro = (byte)(GXutil.lval( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFProForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFProForNro), 2, 0));
            AV28TFProForNro_To = (byte)(GXutil.lval( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFProForNro_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFProForNro_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORTNQ") == 0 )
         {
            AV29TFProForTnq = (byte)(GXutil.lval( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFProForTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFProForTnq), 2, 0));
            AV30TFProForTnq_To = (byte)(GXutil.lval( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFProForTnq_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFProForTnq_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCLA") == 0 )
         {
            AV31TFProForCla = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFProForCla", AV31TFProForCla);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCLA_SEL") == 0 )
         {
            AV32TFProForCla_Sel = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFProForCla_Sel", AV32TFProForCla_Sel);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCLV") == 0 )
         {
            AV33TFProForClv = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFProForClv", AV33TFProForClv);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCLV_SEL") == 0 )
         {
            AV34TFProForClv_Sel = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFProForClv_Sel", AV34TFProForClv_Sel);
         }
         AV60GXV1 = (int)(AV60GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV20TFProForPrd_Sel)==0), AV20TFProForPrd_Sel, GXv_char4) ;
      procesoquimico_4_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char8 = "" ;
      GXv_char3[0] = GXt_char8 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV22TFProForDes_Sel)==0), AV22TFProForDes_Sel, GXv_char3) ;
      procesoquimico_4_impl.this.GXt_char8 = GXv_char3[0] ;
      GXt_char9 = "" ;
      GXv_char2[0] = GXt_char9 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV26TFForPrdDsc_Sel)==0), AV26TFForPrdDsc_Sel, GXv_char2) ;
      procesoquimico_4_impl.this.GXt_char9 = GXv_char2[0] ;
      GXt_char10 = "" ;
      GXv_char11[0] = GXt_char10 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFProForCla_Sel)==0), AV32TFProForCla_Sel, GXv_char11) ;
      procesoquimico_4_impl.this.GXt_char10 = GXv_char11[0] ;
      GXt_char12 = "" ;
      GXv_char13[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFProForClv_Sel)==0), AV34TFProForClv_Sel, GXv_char13) ;
      procesoquimico_4_impl.this.GXt_char12 = GXv_char13[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char8+"||"+GXt_char9+"|||"+GXt_char10+"|"+GXt_char12 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char12 = "" ;
      GXv_char13[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV19TFProForPrd)==0), AV19TFProForPrd, GXv_char13) ;
      procesoquimico_4_impl.this.GXt_char12 = GXv_char13[0] ;
      GXt_char10 = "" ;
      GXv_char11[0] = GXt_char10 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV21TFProForDes)==0), AV21TFProForDes, GXv_char11) ;
      procesoquimico_4_impl.this.GXt_char10 = GXv_char11[0] ;
      GXt_char9 = "" ;
      GXv_char4[0] = GXt_char9 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV25TFForPrdDsc)==0), AV25TFForPrdDsc, GXv_char4) ;
      procesoquimico_4_impl.this.GXt_char9 = GXv_char4[0] ;
      GXt_char8 = "" ;
      GXv_char3[0] = GXt_char8 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV31TFProForCla)==0), AV31TFProForCla, GXv_char3) ;
      procesoquimico_4_impl.this.GXt_char8 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFProForClv)==0), AV33TFProForClv, GXv_char2) ;
      procesoquimico_4_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV17TFProForLin) ? "" : GXutil.str( AV17TFProForLin, 4, 0))+"|"+GXt_char12+"|"+GXt_char10+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV23TFProForCan)==0) ? "" : GXutil.str( AV23TFProForCan, 12, 5))+"|"+GXt_char9+"|"+((0==AV27TFProForNro) ? "" : GXutil.str( AV27TFProForNro, 2, 0))+"|"+((0==AV29TFProForTnq) ? "" : GXutil.str( AV29TFProForTnq, 2, 0))+"|"+GXt_char8+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV18TFProForLin_To) ? "" : GXutil.str( AV18TFProForLin_To, 4, 0))+"|||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV24TFProForCan_To)==0) ? "" : GXutil.str( AV24TFProForCan_To, 12, 5))+"||"+((0==AV28TFProForNro_To) ? "" : GXutil.str( AV28TFProForNro_To, 2, 0))+"|"+((0==AV30TFProForTnq_To) ? "" : GXutil.str( AV30TFProForTnq_To, 2, 0))+"||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S142( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV12GridState.fromxml(AV16Session.getValue(AV38Pgmname+"GridState"), null, null);
      AV12GridState.setgxTv_SdtWWPGridState_Orderedby( AV14OrderedBy );
      AV12GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV15OrderedDsc );
      AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState14[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFPROFORLIN", "", !((0==AV17TFProForLin)&&(0==AV18TFProForLin_To)), (short)(0), GXutil.trim( GXutil.str( AV17TFProForLin, 4, 0)), GXutil.trim( GXutil.str( AV18TFProForLin_To, 4, 0))) ;
      AV12GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFPROFORPRD", "", !(GXutil.strcmp("", AV19TFProForPrd)==0), (short)(0), AV19TFProForPrd, "", !(GXutil.strcmp("", AV20TFProForPrd_Sel)==0), AV20TFProForPrd_Sel, "") ;
      AV12GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFPROFORDES", "", !(GXutil.strcmp("", AV21TFProForDes)==0), (short)(0), AV21TFProForDes, "", !(GXutil.strcmp("", AV22TFProForDes_Sel)==0), AV22TFProForDes_Sel, "") ;
      AV12GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFPROFORCAN", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV23TFProForCan)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV24TFProForCan_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV23TFProForCan, 12, 5)), GXutil.trim( GXutil.str( AV24TFProForCan_To, 12, 5))) ;
      AV12GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFFORPRDDSC", "", !(GXutil.strcmp("", AV25TFForPrdDsc)==0), (short)(0), AV25TFForPrdDsc, "", !(GXutil.strcmp("", AV26TFForPrdDsc_Sel)==0), AV26TFForPrdDsc_Sel, "") ;
      AV12GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFPROFORNRO", "", !((0==AV27TFProForNro)&&(0==AV28TFProForNro_To)), (short)(0), GXutil.trim( GXutil.str( AV27TFProForNro, 2, 0)), GXutil.trim( GXutil.str( AV28TFProForNro_To, 2, 0))) ;
      AV12GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFPROFORTNQ", "", !((0==AV29TFProForTnq)&&(0==AV30TFProForTnq_To)), (short)(0), GXutil.trim( GXutil.str( AV29TFProForTnq, 2, 0)), GXutil.trim( GXutil.str( AV30TFProForTnq_To, 2, 0))) ;
      AV12GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFPROFORCLA", "", !(GXutil.strcmp("", AV31TFProForCla)==0), (short)(0), AV31TFProForCla, "", !(GXutil.strcmp("", AV32TFProForCla_Sel)==0), AV32TFProForCla_Sel, "") ;
      AV12GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFPROFORCLV", "", !(GXutil.strcmp("", AV33TFProForClv)==0), (short)(0), AV33TFProForClv, "", !(GXutil.strcmp("", AV34TFProForClv_Sel)==0), AV34TFProForClv_Sel, "") ;
      AV12GridState = GXv_SdtWWPGridState14[0] ;
      if ( ! (GXutil.strcmp("", AV5Emprcod)==0) )
      {
         AV13GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV13GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV13GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV5Emprcod );
         AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV13GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV6Proforcod)==0) )
      {
         AV13GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV13GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PROFORCOD" );
         AV13GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV6Proforcod );
         AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV13GridStateFilterValue, 0);
      }
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV38Pgmname+"GridState", AV12GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV10TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV10TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV38Pgmname );
      AV10TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV10TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV9HTTPRequest.getScriptName()+"?"+AV9HTTPRequest.getQuerystring() );
      AV10TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "FormulacionTinte.ProcesoQuimico_2" );
      AV16Session.setValue("TrnContext", AV10TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      AV6Proforcod = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Proforcod", AV6Proforcod);
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
      pa1WT2( ) ;
      ws1WT2( ) ;
      we1WT2( ) ;
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
      sCtrlAV5Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV6Proforcod = (String)getParm(obj,1,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1WT2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "formulaciontinte\\procesoquimico_4", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1WT2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV5Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
         AV6Proforcod = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Proforcod", AV6Proforcod);
      }
      wcpOAV5Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV5Emprcod") ;
      wcpOAV6Proforcod = httpContext.cgiGet( sPrefix+"wcpOAV6Proforcod") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV5Emprcod, wcpOAV5Emprcod) != 0 ) || ( GXutil.strcmp(AV6Proforcod, wcpOAV6Proforcod) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV5Emprcod = AV5Emprcod ;
      wcpOAV6Proforcod = AV6Proforcod ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV5Emprcod = httpContext.cgiGet( sPrefix+"AV5Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV5Emprcod) > 0 )
      {
         AV5Emprcod = httpContext.cgiGet( sCtrlAV5Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      }
      else
      {
         AV5Emprcod = httpContext.cgiGet( sPrefix+"AV5Emprcod_PARM") ;
      }
      sCtrlAV6Proforcod = httpContext.cgiGet( sPrefix+"AV6Proforcod_CTRL") ;
      if ( GXutil.len( sCtrlAV6Proforcod) > 0 )
      {
         AV6Proforcod = httpContext.cgiGet( sCtrlAV6Proforcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Proforcod", AV6Proforcod);
      }
      else
      {
         AV6Proforcod = httpContext.cgiGet( sPrefix+"AV6Proforcod_PARM") ;
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
      pa1WT2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1WT2( ) ;
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
      ws1WT2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5Emprcod_PARM", GXutil.rtrim( AV5Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV5Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5Emprcod_CTRL", GXutil.rtrim( sCtrlAV5Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6Proforcod_PARM", GXutil.rtrim( AV6Proforcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6Proforcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6Proforcod_CTRL", GXutil.rtrim( sCtrlAV6Proforcod));
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
      we1WT2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211610351", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/procesoquimico_4.js", "?20268211610351", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_142( )
   {
      edtProForLin_Internalname = sPrefix+"PROFORLIN_"+sGXsfl_14_idx ;
      edtProForPrd_Internalname = sPrefix+"PROFORPRD_"+sGXsfl_14_idx ;
      edtProForDes_Internalname = sPrefix+"PROFORDES_"+sGXsfl_14_idx ;
      edtProForCan_Internalname = sPrefix+"PROFORCAN_"+sGXsfl_14_idx ;
      edtForPrdDsc_Internalname = sPrefix+"FORPRDDSC_"+sGXsfl_14_idx ;
      edtProForNro_Internalname = sPrefix+"PROFORNRO_"+sGXsfl_14_idx ;
      edtProForTnq_Internalname = sPrefix+"PROFORTNQ_"+sGXsfl_14_idx ;
      edtProForCla_Internalname = sPrefix+"PROFORCLA_"+sGXsfl_14_idx ;
      edtProForClv_Internalname = sPrefix+"PROFORCLV_"+sGXsfl_14_idx ;
   }

   public void subsflControlProps_fel_142( )
   {
      edtProForLin_Internalname = sPrefix+"PROFORLIN_"+sGXsfl_14_fel_idx ;
      edtProForPrd_Internalname = sPrefix+"PROFORPRD_"+sGXsfl_14_fel_idx ;
      edtProForDes_Internalname = sPrefix+"PROFORDES_"+sGXsfl_14_fel_idx ;
      edtProForCan_Internalname = sPrefix+"PROFORCAN_"+sGXsfl_14_fel_idx ;
      edtForPrdDsc_Internalname = sPrefix+"FORPRDDSC_"+sGXsfl_14_fel_idx ;
      edtProForNro_Internalname = sPrefix+"PROFORNRO_"+sGXsfl_14_fel_idx ;
      edtProForTnq_Internalname = sPrefix+"PROFORTNQ_"+sGXsfl_14_fel_idx ;
      edtProForCla_Internalname = sPrefix+"PROFORCLA_"+sGXsfl_14_fel_idx ;
      edtProForClv_Internalname = sPrefix+"PROFORCLV_"+sGXsfl_14_fel_idx ;
   }

   public void sendrow_142( )
   {
      subsflControlProps_142( ) ;
      wb1WT0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_14_idx - GRID_nFirstRecordOnPage <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_14_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_14_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForLin_Internalname,GXutil.ltrim( localUtil.ntoc( A767ProForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A767ProForLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtProForLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForPrd_Internalname,GXutil.rtrim( A770ProForPrd),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtProForPrd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForDes_Internalname,GXutil.rtrim( A765ProForDes),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtProForDes_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForCan_Internalname,GXutil.ltrim( localUtil.ntoc( A762ProForCan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A762ProForCan, "ZZZZZ9.9999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtProForCan_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdDsc_Internalname,GXutil.rtrim( A488ForPrdDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtForPrdDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForNro_Internalname,GXutil.ltrim( localUtil.ntoc( A1645ProForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1645ProForNro), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtProForNro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForTnq_Internalname,GXutil.ltrim( localUtil.ntoc( A3379ProForTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3379ProForTnq), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtProForTnq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForCla_Internalname,GXutil.rtrim( A763ProForCla),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtProForCla_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForClv_Internalname,GXutil.rtrim( A5358ProForClv),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtProForClv_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1WT2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_14_idx = ((subGrid_Islastpage==1)&&(nGXsfl_14_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_14_idx+1) ;
         sGXsfl_14_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_14_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_142( ) ;
      }
      /* End function sendrow_142 */
   }

   public void startgridcontrol14( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"14\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cantidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tq.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Clave I", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Clave II", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A767ProForLin, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A770ProForPrd));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A765ProForDes));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A762ProForCan, (byte)(12), (byte)(5), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A488ForPrdDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1645ProForNro, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3379ProForTnq, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A763ProForCla));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5358ProForClv));
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
      edtProForLin_Internalname = sPrefix+"PROFORLIN" ;
      edtProForPrd_Internalname = sPrefix+"PROFORPRD" ;
      edtProForDes_Internalname = sPrefix+"PROFORDES" ;
      edtProForCan_Internalname = sPrefix+"PROFORCAN" ;
      edtForPrdDsc_Internalname = sPrefix+"FORPRDDSC" ;
      edtProForNro_Internalname = sPrefix+"PROFORNRO" ;
      edtProForTnq_Internalname = sPrefix+"PROFORTNQ" ;
      edtProForCla_Internalname = sPrefix+"PROFORCLA" ;
      edtProForClv_Internalname = sPrefix+"PROFORCLV" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Dvpanel_tablemain_Internalname = sPrefix+"DVPANEL_TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
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
      edtProForClv_Jsonclick = "" ;
      edtProForCla_Jsonclick = "" ;
      edtProForTnq_Jsonclick = "" ;
      edtProForNro_Jsonclick = "" ;
      edtForPrdDsc_Jsonclick = "" ;
      edtProForCan_Jsonclick = "" ;
      edtProForDes_Jsonclick = "" ;
      edtProForPrd_Jsonclick = "" ;
      edtProForLin_Jsonclick = "" ;
      subGrid_Class = "GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Infinitescrolling = "Form" ;
      Ddo_grid_Datalistproc = "FormulacionTinte.ProcesoQuimico_4GetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic||Dynamic|||Dynamic|Dynamic" ;
      Ddo_grid_Includedatalist = "|T|T||T|||T|T" ;
      Ddo_grid_Filterisrange = "T|||T||T|T||" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character|Numeric|Character|Numeric|Numeric|Character|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4|5|6|7|8|9" ;
      Ddo_grid_Columnids = "0:ProForLin|1:ProForPrd|2:ProForDes|3:ProForCan|4:ForPrdDsc|5:ProForNro|6:ProForTnq|7:ProForCla|8:ProForClv" ;
      Ddo_grid_Gridinternalname = "" ;
      Dvpanel_tablemain_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tablemain_Iconposition = "Right" ;
      Dvpanel_tablemain_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tablemain_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_tablemain_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tablemain_Title = httpContext.getMessage( "Lineas", "") ;
      Dvpanel_tablemain_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tablemain_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tablemain_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tablemain_Width = "100%" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'sPrefix'},{av:'AV17TFProForLin',fld:'vTFPROFORLIN',pic:'ZZZ9'},{av:'AV18TFProForLin_To',fld:'vTFPROFORLIN_TO',pic:'ZZZ9'},{av:'AV19TFProForPrd',fld:'vTFPROFORPRD',pic:''},{av:'AV20TFProForPrd_Sel',fld:'vTFPROFORPRD_SEL',pic:''},{av:'AV21TFProForDes',fld:'vTFPROFORDES',pic:''},{av:'AV22TFProForDes_Sel',fld:'vTFPROFORDES_SEL',pic:''},{av:'AV23TFProForCan',fld:'vTFPROFORCAN',pic:'ZZZZZ9.9999'},{av:'AV24TFProForCan_To',fld:'vTFPROFORCAN_TO',pic:'ZZZZZ9.9999'},{av:'AV25TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV26TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV27TFProForNro',fld:'vTFPROFORNRO',pic:'Z9'},{av:'AV28TFProForNro_To',fld:'vTFPROFORNRO_TO',pic:'Z9'},{av:'AV29TFProForTnq',fld:'vTFPROFORTNQ',pic:'Z9'},{av:'AV30TFProForTnq_To',fld:'vTFPROFORTNQ_TO',pic:'Z9'},{av:'AV31TFProForCla',fld:'vTFPROFORCLA',pic:''},{av:'AV32TFProForCla_Sel',fld:'vTFPROFORCLA_SEL',pic:''},{av:'AV33TFProForClv',fld:'vTFPROFORCLV',pic:''},{av:'AV34TFProForClv_Sel',fld:'vTFPROFORCLV_SEL',pic:''},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Proforcod',fld:'vPROFORCOD',pic:''},{av:'AV38Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e111WT2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Proforcod',fld:'vPROFORCOD',pic:''},{av:'AV17TFProForLin',fld:'vTFPROFORLIN',pic:'ZZZ9'},{av:'AV18TFProForLin_To',fld:'vTFPROFORLIN_TO',pic:'ZZZ9'},{av:'AV19TFProForPrd',fld:'vTFPROFORPRD',pic:''},{av:'AV20TFProForPrd_Sel',fld:'vTFPROFORPRD_SEL',pic:''},{av:'AV21TFProForDes',fld:'vTFPROFORDES',pic:''},{av:'AV22TFProForDes_Sel',fld:'vTFPROFORDES_SEL',pic:''},{av:'AV23TFProForCan',fld:'vTFPROFORCAN',pic:'ZZZZZ9.9999'},{av:'AV24TFProForCan_To',fld:'vTFPROFORCAN_TO',pic:'ZZZZZ9.9999'},{av:'AV25TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV26TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV27TFProForNro',fld:'vTFPROFORNRO',pic:'Z9'},{av:'AV28TFProForNro_To',fld:'vTFPROFORNRO_TO',pic:'Z9'},{av:'AV29TFProForTnq',fld:'vTFPROFORTNQ',pic:'Z9'},{av:'AV30TFProForTnq_To',fld:'vTFPROFORTNQ_TO',pic:'Z9'},{av:'AV31TFProForCla',fld:'vTFPROFORCLA',pic:''},{av:'AV32TFProForCla_Sel',fld:'vTFPROFORCLA_SEL',pic:''},{av:'AV33TFProForClv',fld:'vTFPROFORCLV',pic:''},{av:'AV34TFProForClv_Sel',fld:'vTFPROFORCLV_SEL',pic:''},{av:'AV38Pgmname',fld:'vPGMNAME',pic:''},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV33TFProForClv',fld:'vTFPROFORCLV',pic:''},{av:'AV34TFProForClv_Sel',fld:'vTFPROFORCLV_SEL',pic:''},{av:'AV31TFProForCla',fld:'vTFPROFORCLA',pic:''},{av:'AV32TFProForCla_Sel',fld:'vTFPROFORCLA_SEL',pic:''},{av:'AV29TFProForTnq',fld:'vTFPROFORTNQ',pic:'Z9'},{av:'AV30TFProForTnq_To',fld:'vTFPROFORTNQ_TO',pic:'Z9'},{av:'AV27TFProForNro',fld:'vTFPROFORNRO',pic:'Z9'},{av:'AV28TFProForNro_To',fld:'vTFPROFORNRO_TO',pic:'Z9'},{av:'AV25TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV26TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV23TFProForCan',fld:'vTFPROFORCAN',pic:'ZZZZZ9.9999'},{av:'AV24TFProForCan_To',fld:'vTFPROFORCAN_TO',pic:'ZZZZZ9.9999'},{av:'AV21TFProForDes',fld:'vTFPROFORDES',pic:''},{av:'AV22TFProForDes_Sel',fld:'vTFPROFORDES_SEL',pic:''},{av:'AV19TFProForPrd',fld:'vTFPROFORPRD',pic:''},{av:'AV20TFProForPrd_Sel',fld:'vTFPROFORPRD_SEL',pic:''},{av:'AV17TFProForLin',fld:'vTFPROFORLIN',pic:'ZZZ9'},{av:'AV18TFProForLin_To',fld:'vTFPROFORLIN_TO',pic:'ZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e141WT2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'sPrefix'},{av:'AV17TFProForLin',fld:'vTFPROFORLIN',pic:'ZZZ9'},{av:'AV18TFProForLin_To',fld:'vTFPROFORLIN_TO',pic:'ZZZ9'},{av:'AV19TFProForPrd',fld:'vTFPROFORPRD',pic:''},{av:'AV20TFProForPrd_Sel',fld:'vTFPROFORPRD_SEL',pic:''},{av:'AV21TFProForDes',fld:'vTFPROFORDES',pic:''},{av:'AV22TFProForDes_Sel',fld:'vTFPROFORDES_SEL',pic:''},{av:'AV23TFProForCan',fld:'vTFPROFORCAN',pic:'ZZZZZ9.9999'},{av:'AV24TFProForCan_To',fld:'vTFPROFORCAN_TO',pic:'ZZZZZ9.9999'},{av:'AV25TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV26TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV27TFProForNro',fld:'vTFPROFORNRO',pic:'Z9'},{av:'AV28TFProForNro_To',fld:'vTFPROFORNRO_TO',pic:'Z9'},{av:'AV29TFProForTnq',fld:'vTFPROFORTNQ',pic:'Z9'},{av:'AV30TFProForTnq_To',fld:'vTFPROFORTNQ_TO',pic:'Z9'},{av:'AV31TFProForCla',fld:'vTFPROFORCLA',pic:''},{av:'AV32TFProForCla_Sel',fld:'vTFPROFORCLA_SEL',pic:''},{av:'AV33TFProForClv',fld:'vTFPROFORCLV',pic:''},{av:'AV34TFProForClv_Sel',fld:'vTFPROFORCLV_SEL',pic:''},{av:'AV38Pgmname',fld:'vPGMNAME',pic:''},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Proforcod',fld:'vPROFORCOD',pic:''}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'sPrefix'},{av:'AV17TFProForLin',fld:'vTFPROFORLIN',pic:'ZZZ9'},{av:'AV18TFProForLin_To',fld:'vTFPROFORLIN_TO',pic:'ZZZ9'},{av:'AV19TFProForPrd',fld:'vTFPROFORPRD',pic:''},{av:'AV20TFProForPrd_Sel',fld:'vTFPROFORPRD_SEL',pic:''},{av:'AV21TFProForDes',fld:'vTFPROFORDES',pic:''},{av:'AV22TFProForDes_Sel',fld:'vTFPROFORDES_SEL',pic:''},{av:'AV23TFProForCan',fld:'vTFPROFORCAN',pic:'ZZZZZ9.9999'},{av:'AV24TFProForCan_To',fld:'vTFPROFORCAN_TO',pic:'ZZZZZ9.9999'},{av:'AV25TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV26TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV27TFProForNro',fld:'vTFPROFORNRO',pic:'Z9'},{av:'AV28TFProForNro_To',fld:'vTFPROFORNRO_TO',pic:'Z9'},{av:'AV29TFProForTnq',fld:'vTFPROFORTNQ',pic:'Z9'},{av:'AV30TFProForTnq_To',fld:'vTFPROFORTNQ_TO',pic:'Z9'},{av:'AV31TFProForCla',fld:'vTFPROFORCLA',pic:''},{av:'AV32TFProForCla_Sel',fld:'vTFPROFORCLA_SEL',pic:''},{av:'AV33TFProForClv',fld:'vTFPROFORCLV',pic:''},{av:'AV34TFProForClv_Sel',fld:'vTFPROFORCLV_SEL',pic:''},{av:'AV38Pgmname',fld:'vPGMNAME',pic:''},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Proforcod',fld:'vPROFORCOD',pic:''}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'sPrefix'},{av:'AV17TFProForLin',fld:'vTFPROFORLIN',pic:'ZZZ9'},{av:'AV18TFProForLin_To',fld:'vTFPROFORLIN_TO',pic:'ZZZ9'},{av:'AV19TFProForPrd',fld:'vTFPROFORPRD',pic:''},{av:'AV20TFProForPrd_Sel',fld:'vTFPROFORPRD_SEL',pic:''},{av:'AV21TFProForDes',fld:'vTFPROFORDES',pic:''},{av:'AV22TFProForDes_Sel',fld:'vTFPROFORDES_SEL',pic:''},{av:'AV23TFProForCan',fld:'vTFPROFORCAN',pic:'ZZZZZ9.9999'},{av:'AV24TFProForCan_To',fld:'vTFPROFORCAN_TO',pic:'ZZZZZ9.9999'},{av:'AV25TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV26TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV27TFProForNro',fld:'vTFPROFORNRO',pic:'Z9'},{av:'AV28TFProForNro_To',fld:'vTFPROFORNRO_TO',pic:'Z9'},{av:'AV29TFProForTnq',fld:'vTFPROFORTNQ',pic:'Z9'},{av:'AV30TFProForTnq_To',fld:'vTFPROFORTNQ_TO',pic:'Z9'},{av:'AV31TFProForCla',fld:'vTFPROFORCLA',pic:''},{av:'AV32TFProForCla_Sel',fld:'vTFPROFORCLA_SEL',pic:''},{av:'AV33TFProForClv',fld:'vTFPROFORCLV',pic:''},{av:'AV34TFProForClv_Sel',fld:'vTFPROFORCLV_SEL',pic:''},{av:'AV38Pgmname',fld:'vPGMNAME',pic:''},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Proforcod',fld:'vPROFORCOD',pic:''}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'sPrefix'},{av:'AV17TFProForLin',fld:'vTFPROFORLIN',pic:'ZZZ9'},{av:'AV18TFProForLin_To',fld:'vTFPROFORLIN_TO',pic:'ZZZ9'},{av:'AV19TFProForPrd',fld:'vTFPROFORPRD',pic:''},{av:'AV20TFProForPrd_Sel',fld:'vTFPROFORPRD_SEL',pic:''},{av:'AV21TFProForDes',fld:'vTFPROFORDES',pic:''},{av:'AV22TFProForDes_Sel',fld:'vTFPROFORDES_SEL',pic:''},{av:'AV23TFProForCan',fld:'vTFPROFORCAN',pic:'ZZZZZ9.9999'},{av:'AV24TFProForCan_To',fld:'vTFPROFORCAN_TO',pic:'ZZZZZ9.9999'},{av:'AV25TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV26TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV27TFProForNro',fld:'vTFPROFORNRO',pic:'Z9'},{av:'AV28TFProForNro_To',fld:'vTFPROFORNRO_TO',pic:'Z9'},{av:'AV29TFProForTnq',fld:'vTFPROFORTNQ',pic:'Z9'},{av:'AV30TFProForTnq_To',fld:'vTFPROFORTNQ_TO',pic:'Z9'},{av:'AV31TFProForCla',fld:'vTFPROFORCLA',pic:''},{av:'AV32TFProForCla_Sel',fld:'vTFPROFORCLA_SEL',pic:''},{av:'AV33TFProForClv',fld:'vTFPROFORCLV',pic:''},{av:'AV34TFProForClv_Sel',fld:'vTFPROFORCLV_SEL',pic:''},{av:'AV38Pgmname',fld:'vPGMNAME',pic:''},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Proforcod',fld:'vPROFORCOD',pic:''}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Proforclv',iparms:[]");
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
      wcpOAV5Emprcod = "" ;
      wcpOAV6Proforcod = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV5Emprcod = "" ;
      AV6Proforcod = "" ;
      AV19TFProForPrd = "" ;
      AV20TFProForPrd_Sel = "" ;
      AV21TFProForDes = "" ;
      AV22TFProForDes_Sel = "" ;
      AV23TFProForCan = DecimalUtil.ZERO ;
      AV24TFProForCan_To = DecimalUtil.ZERO ;
      AV25TFForPrdDsc = "" ;
      AV26TFForPrdDsc_Sel = "" ;
      AV31TFProForCla = "" ;
      AV32TFProForCla_Sel = "" ;
      AV33TFProForClv = "" ;
      AV34TFProForClv_Sel = "" ;
      AV38Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV35DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tablemain = new com.genexus.webpanels.GXUserControl();
      ClassString = "" ;
      StyleString = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV44Formulaciontinte_procesoquimico_4ds_3_tfproforprd = "" ;
      AV45Formulaciontinte_procesoquimico_4ds_4_tfproforprd_sel = "" ;
      AV46Formulaciontinte_procesoquimico_4ds_5_tfprofordes = "" ;
      AV47Formulaciontinte_procesoquimico_4ds_6_tfprofordes_sel = "" ;
      AV48Formulaciontinte_procesoquimico_4ds_7_tfproforcan = DecimalUtil.ZERO ;
      AV49Formulaciontinte_procesoquimico_4ds_8_tfproforcan_to = DecimalUtil.ZERO ;
      AV50Formulaciontinte_procesoquimico_4ds_9_tfforprddsc = "" ;
      AV51Formulaciontinte_procesoquimico_4ds_10_tfforprddsc_sel = "" ;
      AV56Formulaciontinte_procesoquimico_4ds_15_tfproforcla = "" ;
      AV57Formulaciontinte_procesoquimico_4ds_16_tfproforcla_sel = "" ;
      AV58Formulaciontinte_procesoquimico_4ds_17_tfproforclv = "" ;
      AV59Formulaciontinte_procesoquimico_4ds_18_tfproforclv_sel = "" ;
      A770ProForPrd = "" ;
      A765ProForDes = "" ;
      A762ProForCan = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      A763ProForCla = "" ;
      A5358ProForClv = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV44Formulaciontinte_procesoquimico_4ds_3_tfproforprd = "" ;
      lV46Formulaciontinte_procesoquimico_4ds_5_tfprofordes = "" ;
      lV50Formulaciontinte_procesoquimico_4ds_9_tfforprddsc = "" ;
      lV56Formulaciontinte_procesoquimico_4ds_15_tfproforcla = "" ;
      lV58Formulaciontinte_procesoquimico_4ds_17_tfproforclv = "" ;
      A396EmprCod = "" ;
      A764ProForCod = "" ;
      H01WT2_A490ForPrdUMe = new byte[1] ;
      H01WT2_A396EmprCod = new String[] {""} ;
      H01WT2_A764ProForCod = new String[] {""} ;
      H01WT2_A5358ProForClv = new String[] {""} ;
      H01WT2_A763ProForCla = new String[] {""} ;
      H01WT2_A3379ProForTnq = new byte[1] ;
      H01WT2_A1645ProForNro = new byte[1] ;
      H01WT2_A488ForPrdDsc = new String[] {""} ;
      H01WT2_n488ForPrdDsc = new boolean[] {false} ;
      H01WT2_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01WT2_A765ProForDes = new String[] {""} ;
      H01WT2_A770ProForPrd = new String[] {""} ;
      H01WT2_A767ProForLin = new short[1] ;
      H01WT3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV39Station = "" ;
      AV40Emprnom = "" ;
      AV41Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV8WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV16Session = httpContext.getWebSession();
      AV12GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV13GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char12 = "" ;
      GXv_char13 = new String[1] ;
      GXt_char10 = "" ;
      GXv_char11 = new String[1] ;
      GXt_char9 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char8 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState14 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV10TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV9HTTPRequest = httpContext.getHttpRequest();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV5Emprcod = "" ;
      sCtrlAV6Proforcod = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.procesoquimico_4__default(),
         new Object[] {
             new Object[] {
            H01WT2_A490ForPrdUMe, H01WT2_A396EmprCod, H01WT2_A764ProForCod, H01WT2_A5358ProForClv, H01WT2_A763ProForCla, H01WT2_A3379ProForTnq, H01WT2_A1645ProForNro, H01WT2_A488ForPrdDsc, H01WT2_n488ForPrdDsc, H01WT2_A762ProForCan,
            H01WT2_A765ProForDes, H01WT2_A770ProForPrd, H01WT2_A767ProForLin
            }
            , new Object[] {
            H01WT3_AGRID_nRecordCount
            }
         }
      );
      AV38Pgmname = "FormulacionTinte.ProcesoQuimico_4" ;
      /* GeneXus formulas. */
      AV38Pgmname = "FormulacionTinte.ProcesoQuimico_4" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV27TFProForNro ;
   private byte AV28TFProForNro_To ;
   private byte AV29TFProForTnq ;
   private byte AV30TFProForTnq_To ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte AV52Formulaciontinte_procesoquimico_4ds_11_tfprofornro ;
   private byte AV53Formulaciontinte_procesoquimico_4ds_12_tfprofornro_to ;
   private byte AV54Formulaciontinte_procesoquimico_4ds_13_tfprofortnq ;
   private byte AV55Formulaciontinte_procesoquimico_4ds_14_tfprofortnq_to ;
   private byte A1645ProForNro ;
   private byte A3379ProForTnq ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte A490ForPrdUMe ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV17TFProForLin ;
   private short AV18TFProForLin_To ;
   private short AV14OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV42Formulaciontinte_procesoquimico_4ds_1_tfproforlin ;
   private short AV43Formulaciontinte_procesoquimico_4ds_2_tfproforlin_to ;
   private short A767ProForLin ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int nRC_GXsfl_14 ;
   private int subGrid_Rows ;
   private int nGXsfl_14_idx=1 ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV60GXV1 ;
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
   private java.math.BigDecimal AV23TFProForCan ;
   private java.math.BigDecimal AV24TFProForCan_To ;
   private java.math.BigDecimal AV48Formulaciontinte_procesoquimico_4ds_7_tfproforcan ;
   private java.math.BigDecimal AV49Formulaciontinte_procesoquimico_4ds_8_tfproforcan_to ;
   private java.math.BigDecimal A762ProForCan ;
   private String wcpOAV5Emprcod ;
   private String wcpOAV6Proforcod ;
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
   private String AV5Emprcod ;
   private String AV6Proforcod ;
   private String sGXsfl_14_idx="0001" ;
   private String AV19TFProForPrd ;
   private String AV20TFProForPrd_Sel ;
   private String AV21TFProForDes ;
   private String AV22TFProForDes_Sel ;
   private String AV25TFForPrdDsc ;
   private String AV26TFForPrdDsc_Sel ;
   private String AV31TFProForCla ;
   private String AV32TFProForCla_Sel ;
   private String AV33TFProForClv ;
   private String AV34TFProForClv_Sel ;
   private String AV38Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Dvpanel_tablemain_Width ;
   private String Dvpanel_tablemain_Cls ;
   private String Dvpanel_tablemain_Title ;
   private String Dvpanel_tablemain_Iconposition ;
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
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Infinitescrolling ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String Dvpanel_tablemain_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
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
   private String AV44Formulaciontinte_procesoquimico_4ds_3_tfproforprd ;
   private String AV45Formulaciontinte_procesoquimico_4ds_4_tfproforprd_sel ;
   private String AV46Formulaciontinte_procesoquimico_4ds_5_tfprofordes ;
   private String AV47Formulaciontinte_procesoquimico_4ds_6_tfprofordes_sel ;
   private String AV50Formulaciontinte_procesoquimico_4ds_9_tfforprddsc ;
   private String AV51Formulaciontinte_procesoquimico_4ds_10_tfforprddsc_sel ;
   private String AV56Formulaciontinte_procesoquimico_4ds_15_tfproforcla ;
   private String AV57Formulaciontinte_procesoquimico_4ds_16_tfproforcla_sel ;
   private String AV58Formulaciontinte_procesoquimico_4ds_17_tfproforclv ;
   private String AV59Formulaciontinte_procesoquimico_4ds_18_tfproforclv_sel ;
   private String edtProForLin_Internalname ;
   private String A770ProForPrd ;
   private String edtProForPrd_Internalname ;
   private String A765ProForDes ;
   private String edtProForDes_Internalname ;
   private String edtProForCan_Internalname ;
   private String A488ForPrdDsc ;
   private String edtForPrdDsc_Internalname ;
   private String edtProForNro_Internalname ;
   private String edtProForTnq_Internalname ;
   private String A763ProForCla ;
   private String edtProForCla_Internalname ;
   private String A5358ProForClv ;
   private String edtProForClv_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String lV44Formulaciontinte_procesoquimico_4ds_3_tfproforprd ;
   private String lV46Formulaciontinte_procesoquimico_4ds_5_tfprofordes ;
   private String lV50Formulaciontinte_procesoquimico_4ds_9_tfforprddsc ;
   private String lV56Formulaciontinte_procesoquimico_4ds_15_tfproforcla ;
   private String lV58Formulaciontinte_procesoquimico_4ds_17_tfproforclv ;
   private String A396EmprCod ;
   private String A764ProForCod ;
   private String hsh ;
   private String AV39Station ;
   private String AV40Emprnom ;
   private String AV41Usurcod ;
   private String GXt_char12 ;
   private String GXv_char13[] ;
   private String GXt_char10 ;
   private String GXv_char11[] ;
   private String GXt_char9 ;
   private String GXv_char4[] ;
   private String GXt_char8 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String sCtrlAV5Emprcod ;
   private String sCtrlAV6Proforcod ;
   private String sGXsfl_14_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtProForLin_Jsonclick ;
   private String edtProForPrd_Jsonclick ;
   private String edtProForDes_Jsonclick ;
   private String edtProForCan_Jsonclick ;
   private String edtForPrdDsc_Jsonclick ;
   private String edtProForNro_Jsonclick ;
   private String edtProForTnq_Jsonclick ;
   private String edtProForCla_Jsonclick ;
   private String edtProForClv_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV15OrderedDsc ;
   private boolean Dvpanel_tablemain_Autowidth ;
   private boolean Dvpanel_tablemain_Autoheight ;
   private boolean Dvpanel_tablemain_Collapsible ;
   private boolean Dvpanel_tablemain_Collapsed ;
   private boolean Dvpanel_tablemain_Showcollapseicon ;
   private boolean Dvpanel_tablemain_Autoscroll ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n488ForPrdDsc ;
   private boolean bGXsfl_14_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV9HTTPRequest ;
   private com.genexus.webpanels.WebSession AV16Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tablemain ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private byte[] H01WT2_A490ForPrdUMe ;
   private String[] H01WT2_A396EmprCod ;
   private String[] H01WT2_A764ProForCod ;
   private String[] H01WT2_A5358ProForClv ;
   private String[] H01WT2_A763ProForCla ;
   private byte[] H01WT2_A3379ProForTnq ;
   private byte[] H01WT2_A1645ProForNro ;
   private String[] H01WT2_A488ForPrdDsc ;
   private boolean[] H01WT2_n488ForPrdDsc ;
   private java.math.BigDecimal[] H01WT2_A762ProForCan ;
   private String[] H01WT2_A765ProForDes ;
   private String[] H01WT2_A770ProForPrd ;
   private short[] H01WT2_A767ProForLin ;
   private long[] H01WT3_AGRID_nRecordCount ;
   private app.wwpbaseobjects.SdtWWPContext AV8WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV10TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV12GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState14[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV13GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV35DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class procesoquimico_4__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01WT2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV42Formulaciontinte_procesoquimico_4ds_1_tfproforlin ,
                                          short AV43Formulaciontinte_procesoquimico_4ds_2_tfproforlin_to ,
                                          String AV45Formulaciontinte_procesoquimico_4ds_4_tfproforprd_sel ,
                                          String AV44Formulaciontinte_procesoquimico_4ds_3_tfproforprd ,
                                          String AV47Formulaciontinte_procesoquimico_4ds_6_tfprofordes_sel ,
                                          String AV46Formulaciontinte_procesoquimico_4ds_5_tfprofordes ,
                                          java.math.BigDecimal AV48Formulaciontinte_procesoquimico_4ds_7_tfproforcan ,
                                          java.math.BigDecimal AV49Formulaciontinte_procesoquimico_4ds_8_tfproforcan_to ,
                                          String AV51Formulaciontinte_procesoquimico_4ds_10_tfforprddsc_sel ,
                                          String AV50Formulaciontinte_procesoquimico_4ds_9_tfforprddsc ,
                                          byte AV52Formulaciontinte_procesoquimico_4ds_11_tfprofornro ,
                                          byte AV53Formulaciontinte_procesoquimico_4ds_12_tfprofornro_to ,
                                          byte AV54Formulaciontinte_procesoquimico_4ds_13_tfprofortnq ,
                                          byte AV55Formulaciontinte_procesoquimico_4ds_14_tfprofortnq_to ,
                                          String AV57Formulaciontinte_procesoquimico_4ds_16_tfproforcla_sel ,
                                          String AV56Formulaciontinte_procesoquimico_4ds_15_tfproforcla ,
                                          String AV59Formulaciontinte_procesoquimico_4ds_18_tfproforclv_sel ,
                                          String AV58Formulaciontinte_procesoquimico_4ds_17_tfproforclv ,
                                          short A767ProForLin ,
                                          String A770ProForPrd ,
                                          String A765ProForDes ,
                                          java.math.BigDecimal A762ProForCan ,
                                          String A488ForPrdDsc ,
                                          byte A1645ProForNro ,
                                          byte A3379ProForTnq ,
                                          String A763ProForCla ,
                                          String A5358ProForClv ,
                                          short AV14OrderedBy ,
                                          boolean AV15OrderedDsc ,
                                          String AV5Emprcod ,
                                          String AV6Proforcod ,
                                          String A396EmprCod ,
                                          String A764ProForCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int15 = new byte[25];
      Object[] GXv_Object16 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " /*+ FIRST_ROWS(51) */ T1.ForPrdUMe, T1.EmprCod, T1.ProForCod, T1.ProForClv, T1.ProForCla, T1.ProForTnq, T1.ProForNro, T2.ForPrdDsc, T1.ProForCan, T1.ProForDes," ;
      sSelectString += " T1.ProForPrd, T1.ProForLin" ;
      sFromString = " FROM (TXPLPROFO T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.ProForCod = ?)");
      if ( ! (0==AV42Formulaciontinte_procesoquimico_4ds_1_tfproforlin) )
      {
         addWhere(sWhereString, "(T1.ProForLin >= ?)");
      }
      else
      {
         GXv_int15[2] = (byte)(1) ;
      }
      if ( ! (0==AV43Formulaciontinte_procesoquimico_4ds_2_tfproforlin_to) )
      {
         addWhere(sWhereString, "(T1.ProForLin <= ?)");
      }
      else
      {
         GXv_int15[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45Formulaciontinte_procesoquimico_4ds_4_tfproforprd_sel)==0) && ( ! (GXutil.strcmp("", AV44Formulaciontinte_procesoquimico_4ds_3_tfproforprd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForPrd) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45Formulaciontinte_procesoquimico_4ds_4_tfproforprd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForPrd = ?)");
      }
      else
      {
         GXv_int15[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47Formulaciontinte_procesoquimico_4ds_6_tfprofordes_sel)==0) && ( ! (GXutil.strcmp("", AV46Formulaciontinte_procesoquimico_4ds_5_tfprofordes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47Formulaciontinte_procesoquimico_4ds_6_tfprofordes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForDes = ?)");
      }
      else
      {
         GXv_int15[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV48Formulaciontinte_procesoquimico_4ds_7_tfproforcan)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCan >= ?)");
      }
      else
      {
         GXv_int15[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV49Formulaciontinte_procesoquimico_4ds_8_tfproforcan_to)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCan <= ?)");
      }
      else
      {
         GXv_int15[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Formulaciontinte_procesoquimico_4ds_10_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV50Formulaciontinte_procesoquimico_4ds_9_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Formulaciontinte_procesoquimico_4ds_10_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int15[11] = (byte)(1) ;
      }
      if ( ! (0==AV52Formulaciontinte_procesoquimico_4ds_11_tfprofornro) )
      {
         addWhere(sWhereString, "(T1.ProForNro >= ?)");
      }
      else
      {
         GXv_int15[12] = (byte)(1) ;
      }
      if ( ! (0==AV53Formulaciontinte_procesoquimico_4ds_12_tfprofornro_to) )
      {
         addWhere(sWhereString, "(T1.ProForNro <= ?)");
      }
      else
      {
         GXv_int15[13] = (byte)(1) ;
      }
      if ( ! (0==AV54Formulaciontinte_procesoquimico_4ds_13_tfprofortnq) )
      {
         addWhere(sWhereString, "(T1.ProForTnq >= ?)");
      }
      else
      {
         GXv_int15[14] = (byte)(1) ;
      }
      if ( ! (0==AV55Formulaciontinte_procesoquimico_4ds_14_tfprofortnq_to) )
      {
         addWhere(sWhereString, "(T1.ProForTnq <= ?)");
      }
      else
      {
         GXv_int15[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Formulaciontinte_procesoquimico_4ds_16_tfproforcla_sel)==0) && ( ! (GXutil.strcmp("", AV56Formulaciontinte_procesoquimico_4ds_15_tfproforcla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForCla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Formulaciontinte_procesoquimico_4ds_16_tfproforcla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCla = ?)");
      }
      else
      {
         GXv_int15[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Formulaciontinte_procesoquimico_4ds_18_tfproforclv_sel)==0) && ( ! (GXutil.strcmp("", AV58Formulaciontinte_procesoquimico_4ds_17_tfproforclv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForClv) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Formulaciontinte_procesoquimico_4ds_18_tfproforclv_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForClv = ?)");
      }
      else
      {
         GXv_int15[19] = (byte)(1) ;
      }
      if ( ( AV14OrderedBy == 1 ) && ! AV15OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ProForLin" ;
      }
      else if ( ( AV14OrderedBy == 1 ) && ( AV15OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ProForLin DESC" ;
      }
      else if ( ( AV14OrderedBy == 2 ) && ! AV15OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ProForPrd" ;
      }
      else if ( ( AV14OrderedBy == 2 ) && ( AV15OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ProForPrd DESC" ;
      }
      else if ( ( AV14OrderedBy == 3 ) && ! AV15OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ProForDes" ;
      }
      else if ( ( AV14OrderedBy == 3 ) && ( AV15OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ProForDes DESC" ;
      }
      else if ( ( AV14OrderedBy == 4 ) && ! AV15OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ProForCan" ;
      }
      else if ( ( AV14OrderedBy == 4 ) && ( AV15OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ProForCan DESC" ;
      }
      else if ( ( AV14OrderedBy == 5 ) && ! AV15OrderedDsc )
      {
         sOrderString += " ORDER BY T2.ForPrdDsc" ;
      }
      else if ( ( AV14OrderedBy == 5 ) && ( AV15OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.ForPrdDsc DESC" ;
      }
      else if ( ( AV14OrderedBy == 6 ) && ! AV15OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ProForNro" ;
      }
      else if ( ( AV14OrderedBy == 6 ) && ( AV15OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ProForNro DESC" ;
      }
      else if ( ( AV14OrderedBy == 7 ) && ! AV15OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ProForTnq" ;
      }
      else if ( ( AV14OrderedBy == 7 ) && ( AV15OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ProForTnq DESC" ;
      }
      else if ( ( AV14OrderedBy == 8 ) && ! AV15OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ProForCla" ;
      }
      else if ( ( AV14OrderedBy == 8 ) && ( AV15OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ProForCla DESC" ;
      }
      else if ( ( AV14OrderedBy == 9 ) && ! AV15OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ProForClv" ;
      }
      else if ( ( AV14OrderedBy == 9 ) && ( AV15OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ProForClv DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.ProForCod, T1.ProForLin" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object16[0] = scmdbuf ;
      GXv_Object16[1] = GXv_int15 ;
      return GXv_Object16 ;
   }

   protected Object[] conditional_H01WT3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV42Formulaciontinte_procesoquimico_4ds_1_tfproforlin ,
                                          short AV43Formulaciontinte_procesoquimico_4ds_2_tfproforlin_to ,
                                          String AV45Formulaciontinte_procesoquimico_4ds_4_tfproforprd_sel ,
                                          String AV44Formulaciontinte_procesoquimico_4ds_3_tfproforprd ,
                                          String AV47Formulaciontinte_procesoquimico_4ds_6_tfprofordes_sel ,
                                          String AV46Formulaciontinte_procesoquimico_4ds_5_tfprofordes ,
                                          java.math.BigDecimal AV48Formulaciontinte_procesoquimico_4ds_7_tfproforcan ,
                                          java.math.BigDecimal AV49Formulaciontinte_procesoquimico_4ds_8_tfproforcan_to ,
                                          String AV51Formulaciontinte_procesoquimico_4ds_10_tfforprddsc_sel ,
                                          String AV50Formulaciontinte_procesoquimico_4ds_9_tfforprddsc ,
                                          byte AV52Formulaciontinte_procesoquimico_4ds_11_tfprofornro ,
                                          byte AV53Formulaciontinte_procesoquimico_4ds_12_tfprofornro_to ,
                                          byte AV54Formulaciontinte_procesoquimico_4ds_13_tfprofortnq ,
                                          byte AV55Formulaciontinte_procesoquimico_4ds_14_tfprofortnq_to ,
                                          String AV57Formulaciontinte_procesoquimico_4ds_16_tfproforcla_sel ,
                                          String AV56Formulaciontinte_procesoquimico_4ds_15_tfproforcla ,
                                          String AV59Formulaciontinte_procesoquimico_4ds_18_tfproforclv_sel ,
                                          String AV58Formulaciontinte_procesoquimico_4ds_17_tfproforclv ,
                                          short A767ProForLin ,
                                          String A770ProForPrd ,
                                          String A765ProForDes ,
                                          java.math.BigDecimal A762ProForCan ,
                                          String A488ForPrdDsc ,
                                          byte A1645ProForNro ,
                                          byte A3379ProForTnq ,
                                          String A763ProForCla ,
                                          String A5358ProForClv ,
                                          short AV14OrderedBy ,
                                          boolean AV15OrderedDsc ,
                                          String AV5Emprcod ,
                                          String AV6Proforcod ,
                                          String A396EmprCod ,
                                          String A764ProForCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[20];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPLPROFO T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.ProForCod = ?)");
      if ( ! (0==AV42Formulaciontinte_procesoquimico_4ds_1_tfproforlin) )
      {
         addWhere(sWhereString, "(T1.ProForLin >= ?)");
      }
      else
      {
         GXv_int17[2] = (byte)(1) ;
      }
      if ( ! (0==AV43Formulaciontinte_procesoquimico_4ds_2_tfproforlin_to) )
      {
         addWhere(sWhereString, "(T1.ProForLin <= ?)");
      }
      else
      {
         GXv_int17[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45Formulaciontinte_procesoquimico_4ds_4_tfproforprd_sel)==0) && ( ! (GXutil.strcmp("", AV44Formulaciontinte_procesoquimico_4ds_3_tfproforprd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForPrd) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45Formulaciontinte_procesoquimico_4ds_4_tfproforprd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForPrd = ?)");
      }
      else
      {
         GXv_int17[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47Formulaciontinte_procesoquimico_4ds_6_tfprofordes_sel)==0) && ( ! (GXutil.strcmp("", AV46Formulaciontinte_procesoquimico_4ds_5_tfprofordes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47Formulaciontinte_procesoquimico_4ds_6_tfprofordes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForDes = ?)");
      }
      else
      {
         GXv_int17[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV48Formulaciontinte_procesoquimico_4ds_7_tfproforcan)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCan >= ?)");
      }
      else
      {
         GXv_int17[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV49Formulaciontinte_procesoquimico_4ds_8_tfproforcan_to)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCan <= ?)");
      }
      else
      {
         GXv_int17[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Formulaciontinte_procesoquimico_4ds_10_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV50Formulaciontinte_procesoquimico_4ds_9_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Formulaciontinte_procesoquimico_4ds_10_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( ! (0==AV52Formulaciontinte_procesoquimico_4ds_11_tfprofornro) )
      {
         addWhere(sWhereString, "(T1.ProForNro >= ?)");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      if ( ! (0==AV53Formulaciontinte_procesoquimico_4ds_12_tfprofornro_to) )
      {
         addWhere(sWhereString, "(T1.ProForNro <= ?)");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( ! (0==AV54Formulaciontinte_procesoquimico_4ds_13_tfprofortnq) )
      {
         addWhere(sWhereString, "(T1.ProForTnq >= ?)");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( ! (0==AV55Formulaciontinte_procesoquimico_4ds_14_tfprofortnq_to) )
      {
         addWhere(sWhereString, "(T1.ProForTnq <= ?)");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Formulaciontinte_procesoquimico_4ds_16_tfproforcla_sel)==0) && ( ! (GXutil.strcmp("", AV56Formulaciontinte_procesoquimico_4ds_15_tfproforcla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForCla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Formulaciontinte_procesoquimico_4ds_16_tfproforcla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCla = ?)");
      }
      else
      {
         GXv_int17[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Formulaciontinte_procesoquimico_4ds_18_tfproforclv_sel)==0) && ( ! (GXutil.strcmp("", AV58Formulaciontinte_procesoquimico_4ds_17_tfproforclv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForClv) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Formulaciontinte_procesoquimico_4ds_18_tfproforclv_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForClv = ?)");
      }
      else
      {
         GXv_int17[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV14OrderedBy == 1 ) && ! AV15OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 1 ) && ( AV15OrderedDsc ) )
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
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
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
                  return conditional_H01WT2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Boolean) dynConstraints[28]).booleanValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] );
            case 1 :
                  return conditional_H01WT3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Boolean) dynConstraints[28]).booleanValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01WT2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,51, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01WT3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               ((String[]) buf[10])[0] = rslt.getString(10, 26);
               ((String[]) buf[11])[0] = rslt.getString(11, 6);
               ((short[]) buf[12])[0] = rslt.getShort(12);
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
                  stmt.setString(sIdx, (String)parms[25], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 5);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[22]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 5);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[32]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[35]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               return;
      }
   }

}

