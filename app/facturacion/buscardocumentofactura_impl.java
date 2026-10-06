package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class buscardocumentofactura_impl extends GXDataArea
{
   public buscardocumentofactura_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public buscardocumentofactura_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( buscardocumentofactura_impl.class ));
   }

   public buscardocumentofactura_impl( int remoteHandle ,
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
         if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            AV38Emprcod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38Emprcod", AV38Emprcod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV36FacCod = (int)(GXutil.lval( httpContext.GetPar( "FacCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV36FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36FacCod), 8, 0));
               AV37FacAlbCod = GXutil.lval( httpContext.GetPar( "FacAlbCod")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV37FacAlbCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37FacAlbCod), 10, 0));
               AV40FacHor = localUtil.parseDTimeParm( httpContext.GetPar( "FacHor")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV40FacHor", localUtil.ttoc( AV40FacHor, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV39FacAlbTip = (byte)(GXutil.lval( httpContext.GetPar( "FacAlbTip"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV39FacAlbTip", GXutil.str( AV39FacAlbTip, 1, 0));
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
      nRC_GXsfl_41 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_41"))) ;
      nGXsfl_41_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_41_idx"))) ;
      sGXsfl_41_idx = httpContext.GetPar( "sGXsfl_41_idx") ;
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
      AV38Emprcod = httpContext.GetPar( "Emprcod") ;
      AV36FacCod = (int)(GXutil.lval( httpContext.GetPar( "FacCod"))) ;
      AV37FacAlbCod = GXutil.lval( httpContext.GetPar( "FacAlbCod")) ;
      AV19TFFacLin = (int)(GXutil.lval( httpContext.GetPar( "TFFacLin"))) ;
      AV20TFFacLin_To = (int)(GXutil.lval( httpContext.GetPar( "TFFacLin_To"))) ;
      AV21TFFacDsc = httpContext.GetPar( "TFFacDsc") ;
      AV22TFFacDsc_Sel = httpContext.GetPar( "TFFacDsc_Sel") ;
      AV23TFFacBarCod = (int)(GXutil.lval( httpContext.GetPar( "TFFacBarCod"))) ;
      AV24TFFacBarCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFFacBarCod_To"))) ;
      AV25TFFacBarReo = (byte)(GXutil.lval( httpContext.GetPar( "TFFacBarReo"))) ;
      AV26TFFacBarReo_To = (byte)(GXutil.lval( httpContext.GetPar( "TFFacBarReo_To"))) ;
      AV27TFFacBarPar = httpContext.GetPar( "TFFacBarPar") ;
      AV28TFFacBarPar_Sel = httpContext.GetPar( "TFFacBarPar_Sel") ;
      AV29TFFacSer = httpContext.GetPar( "TFFacSer") ;
      AV30TFFacSer_Sel = httpContext.GetPar( "TFFacSer_Sel") ;
      AV31TFFacColNom = httpContext.GetPar( "TFFacColNom") ;
      AV32TFFacColNom_Sel = httpContext.GetPar( "TFFacColNom_Sel") ;
      AV33TFFocColNum = (int)(GXutil.lval( httpContext.GetPar( "TFFocColNum"))) ;
      AV34TFFocColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFFocColNum_To"))) ;
      AV46Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV38Emprcod, AV36FacCod, AV37FacAlbCod, AV19TFFacLin, AV20TFFacLin_To, AV21TFFacDsc, AV22TFFacDsc_Sel, AV23TFFacBarCod, AV24TFFacBarCod_To, AV25TFFacBarReo, AV26TFFacBarReo_To, AV27TFFacBarPar, AV28TFFacBarPar_Sel, AV29TFFacSer, AV30TFFacSer_Sel, AV31TFFacColNom, AV32TFFacColNom_Sel, AV33TFFocColNum, AV34TFFocColNum_To, AV46Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
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
      pa2CG2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2CG2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.facturacion.buscardocumentofactura", new String[] {GXutil.URLEncode(GXutil.rtrim(AV38Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV36FacCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV37FacAlbCod,10,0)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV40FacHor)),GXutil.URLEncode(GXutil.ltrimstr(AV39FacAlbTip,1,0))}, new String[] {"Emprcod","FacCod","FacAlbCod","FacHor","FacAlbTip"}) +"\">") ;
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
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"BuscarDocumentoFactura");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV46Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\buscardocumentofactura:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_41", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_41, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV35DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV35DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACLIN", GXutil.ltrim( localUtil.ntoc( AV19TFFacLin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACLIN_TO", GXutil.ltrim( localUtil.ntoc( AV20TFFacLin_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACDSC", GXutil.rtrim( AV21TFFacDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACDSC_SEL", GXutil.rtrim( AV22TFFacDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACBARCOD", GXutil.ltrim( localUtil.ntoc( AV23TFFacBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACBARCOD_TO", GXutil.ltrim( localUtil.ntoc( AV24TFFacBarCod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACBARREO", GXutil.ltrim( localUtil.ntoc( AV25TFFacBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACBARREO_TO", GXutil.ltrim( localUtil.ntoc( AV26TFFacBarReo_To, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACBARPAR", GXutil.rtrim( AV27TFFacBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACBARPAR_SEL", GXutil.rtrim( AV28TFFacBarPar_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACSER", GXutil.rtrim( AV29TFFacSer));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACSER_SEL", GXutil.rtrim( AV30TFFacSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACCOLNOM", GXutil.rtrim( AV31TFFacColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACCOLNOM_SEL", GXutil.rtrim( AV32TFFacColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFOCCOLNUM", GXutil.ltrim( localUtil.ntoc( AV33TFFocColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFOCCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV34TFFocColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV38Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vFACALBTIP", GXutil.ltrim( localUtil.ntoc( AV39FacAlbTip, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFACHOR", localUtil.ttoc( AV40FacHor, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_set", GXutil.rtrim( Ddo_grid_Filteredtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_set", GXutil.rtrim( Ddo_grid_Filteredtextto_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_set", GXutil.rtrim( Ddo_grid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Title", GXutil.rtrim( Dvelop_confirmpanel_enter_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_enter_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_enter_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_enter_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminardocumento_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminardocumento_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminardocumento_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminardocumento_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminardocumento_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminardocumento_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminardocumento_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Infinitescrolling", GXutil.rtrim( Grid_empowerer_Infinitescrolling));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Result", GXutil.rtrim( Dvelop_confirmpanel_enter_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminardocumento_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Result", GXutil.rtrim( Dvelop_confirmpanel_enter_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminardocumento_Result));
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
         we2CG2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2CG2( ) ;
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
      return formatLink("app.facturacion.buscardocumentofactura", new String[] {GXutil.URLEncode(GXutil.rtrim(AV38Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV36FacCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV37FacAlbCod,10,0)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV40FacHor)),GXutil.URLEncode(GXutil.ltrimstr(AV39FacAlbTip,1,0))}, new String[] {"Emprcod","FacCod","FacAlbCod","FacHor","FacAlbTip"})  ;
   }

   public String getPgmname( )
   {
      return "Facturacion.BuscarDocumentoFactura" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Mantenimiento Factura", "") ;
   }

   public void wb2CG0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFaccod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFaccod_Internalname, httpContext.getMessage( "Nº Factura", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFaccod_Internalname, GXutil.ltrim( localUtil.ntoc( AV36FacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavFaccod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV36FacCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV36FacCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFaccod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFaccod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\BuscarDocumentoFactura.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFacalbcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFacalbcod_Internalname, httpContext.getMessage( "Nº Documento", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFacalbcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV37FacAlbCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavFacalbcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV37FacAlbCod), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV37FacAlbCod), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFacalbcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFacalbcod_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\BuscarDocumentoFactura.htm");
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
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\BuscarDocumentoFactura.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneliminardocumento_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "Eliminar Documento", ""), bttBtneliminardocumento_Jsonclick, 7, httpContext.getMessage( "Eliminar Documento", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e112cg1_client"+"'", TempTags, "", 2, "HLP_Facturacion\\BuscarDocumentoFactura.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\BuscarDocumentoFactura.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell CellMarginTop HasGridEmpowerer", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol41( ) ;
      }
      if ( wbEnd == 41 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_41 = (int)(nGXsfl_41_idx-1) ;
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV46Pgmname), GXutil.rtrim( localUtil.format( AV46Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\BuscarDocumentoFactura.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV35DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         wb_table1_62_2CG2( true) ;
      }
      else
      {
         wb_table1_62_2CG2( false) ;
      }
      return  ;
   }

   public void wb_table1_62_2CG2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_67_2CG2( true) ;
      }
      else
      {
         wb_table2_67_2CG2( false) ;
      }
      return  ;
   }

   public void wb_table2_67_2CG2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("InfiniteScrolling", Grid_empowerer_Infinitescrolling);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 41 )
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

   public void start2CG2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Mantenimiento Factura", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2CG0( ) ;
   }

   public void ws2CG2( )
   {
      start2CG2( ) ;
      evt2CG2( ) ;
   }

   public void evt2CG2( )
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
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e122CG2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ENTER.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e132CG2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e142CG2 ();
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
                                 e152CG2 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e162CG2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           AV47Facturacion_buscardocumentofacturads_1_tffaclin = AV19TFFacLin ;
                           AV48Facturacion_buscardocumentofacturads_2_tffaclin_to = AV20TFFacLin_To ;
                           AV49Facturacion_buscardocumentofacturads_3_tffacdsc = AV21TFFacDsc ;
                           AV50Facturacion_buscardocumentofacturads_4_tffacdsc_sel = AV22TFFacDsc_Sel ;
                           AV51Facturacion_buscardocumentofacturads_5_tffacbarcod = AV23TFFacBarCod ;
                           AV52Facturacion_buscardocumentofacturads_6_tffacbarcod_to = AV24TFFacBarCod_To ;
                           AV53Facturacion_buscardocumentofacturads_7_tffacbarreo = AV25TFFacBarReo ;
                           AV54Facturacion_buscardocumentofacturads_8_tffacbarreo_to = AV26TFFacBarReo_To ;
                           AV55Facturacion_buscardocumentofacturads_9_tffacbarpar = AV27TFFacBarPar ;
                           AV56Facturacion_buscardocumentofacturads_10_tffacbarpar_sel = AV28TFFacBarPar_Sel ;
                           AV57Facturacion_buscardocumentofacturads_11_tffacser = AV29TFFacSer ;
                           AV58Facturacion_buscardocumentofacturads_12_tffacser_sel = AV30TFFacSer_Sel ;
                           AV59Facturacion_buscardocumentofacturads_13_tffaccolnom = AV31TFFacColNom ;
                           AV60Facturacion_buscardocumentofacturads_14_tffaccolnom_sel = AV32TFFacColNom_Sel ;
                           AV61Facturacion_buscardocumentofacturads_15_tffoccolnum = AV33TFFocColNum ;
                           AV62Facturacion_buscardocumentofacturads_16_tffoccolnum_to = AV34TFFocColNum_To ;
                           sEvt = httpContext.cgiGet( "GRIDPAGING") ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_41_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_412( ) ;
                           A446FacLin = (int)(localUtil.ctol( httpContext.cgiGet( edtFacLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A432FacDsc = httpContext.cgiGet( edtFacDsc_Internalname) ;
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavFacmts_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavFacmts_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFACMTS");
                              GX_FocusControl = edtavFacmts_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV14FacMts = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavFacmts_Internalname, GXutil.ltrimstr( AV14FacMts, 9, 2));
                           }
                           else
                           {
                              AV14FacMts = localUtil.ctond( httpContext.cgiGet( edtavFacmts_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavFacmts_Internalname, GXutil.ltrimstr( AV14FacMts, 9, 2));
                           }
                           if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavFacpremts_Internalname)), DecimalUtil.stringToDec("-999999.99999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavFacpremts_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFACPREMTS");
                              GX_FocusControl = edtavFacpremts_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV15FacPreMts = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavFacpremts_Internalname, GXutil.ltrimstr( AV15FacPreMts, 13, 5));
                           }
                           else
                           {
                              AV15FacPreMts = localUtil.ctond( httpContext.cgiGet( edtavFacpremts_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavFacpremts_Internalname, GXutil.ltrimstr( AV15FacPreMts, 13, 5));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavFackgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavFackgs_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFACKGS");
                              GX_FocusControl = edtavFackgs_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV16FacKgs = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavFackgs_Internalname, GXutil.ltrimstr( AV16FacKgs, 9, 2));
                           }
                           else
                           {
                              AV16FacKgs = localUtil.ctond( httpContext.cgiGet( edtavFackgs_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavFackgs_Internalname, GXutil.ltrimstr( AV16FacKgs, 9, 2));
                           }
                           if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavFacprekgs_Internalname)), DecimalUtil.stringToDec("-999999.99999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavFacprekgs_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFACPREKGS");
                              GX_FocusControl = edtavFacprekgs_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV17FacPreKgs = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavFacprekgs_Internalname, GXutil.ltrimstr( AV17FacPreKgs, 13, 5));
                           }
                           else
                           {
                              AV17FacPreKgs = localUtil.ctond( httpContext.cgiGet( edtavFacprekgs_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavFacprekgs_Internalname, GXutil.ltrimstr( AV17FacPreKgs, 13, 5));
                           }
                           A1294FacBarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtFacBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1295FacBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtFacBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1296FacBarPar = httpContext.cgiGet( edtFacBarPar_Internalname) ;
                           A454FacSer = httpContext.cgiGet( edtFacSer_Internalname) ;
                           A3878FacColNom = httpContext.cgiGet( edtFacColNom_Internalname) ;
                           A3879FocColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtFocColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e172CG2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e182CG2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e192CG2 ();
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

   public void we2CG2( )
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

   public void pa2CG2( )
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
      subsflControlProps_412( ) ;
      while ( nGXsfl_41_idx <= nRC_GXsfl_41 )
      {
         sendrow_412( ) ;
         nGXsfl_41_idx = ((subGrid_Islastpage==1)&&(nGXsfl_41_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_41_idx+1) ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV38Emprcod ,
                                 int AV36FacCod ,
                                 long AV37FacAlbCod ,
                                 int AV19TFFacLin ,
                                 int AV20TFFacLin_To ,
                                 String AV21TFFacDsc ,
                                 String AV22TFFacDsc_Sel ,
                                 int AV23TFFacBarCod ,
                                 int AV24TFFacBarCod_To ,
                                 byte AV25TFFacBarReo ,
                                 byte AV26TFFacBarReo_To ,
                                 String AV27TFFacBarPar ,
                                 String AV28TFFacBarPar_Sel ,
                                 String AV29TFFacSer ,
                                 String AV30TFFacSer_Sel ,
                                 String AV31TFFacColNom ,
                                 String AV32TFFacColNom_Sel ,
                                 int AV33TFFocColNum ,
                                 int AV34TFFocColNum_To ,
                                 String AV46Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e182CG2 ();
      GRID_nCurrentRecord = 0 ;
      rf2CG2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"BuscarDocumentoFactura");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV46Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\buscardocumentofactura:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FACLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A446FacLin), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACLIN", GXutil.ltrim( localUtil.ntoc( A446FacLin, (byte)(6), (byte)(0), ".", "")));
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
      GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_41_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      send_integrity_hashes( ) ;
      rf2CG2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV46Pgmname = "Facturacion.BuscarDocumentoFactura" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46Pgmname", AV46Pgmname);
      Gx_err = (short)(0) ;
      edtavFaccod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFaccod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFaccod_Enabled), 5, 0), true);
      edtavFacalbcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFacalbcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacalbcod_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2CG2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(41) ;
      /* Execute user event: Refresh */
      e182CG2 ();
      nGXsfl_41_idx = (int)(1+GRID_nFirstRecordOnPage) ;
      sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_412( ) ;
      bGXsfl_41_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
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
         subsflControlProps_412( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Integer.valueOf(AV47Facturacion_buscardocumentofacturads_1_tffaclin) ,
                                              Integer.valueOf(AV48Facturacion_buscardocumentofacturads_2_tffaclin_to) ,
                                              AV50Facturacion_buscardocumentofacturads_4_tffacdsc_sel ,
                                              AV49Facturacion_buscardocumentofacturads_3_tffacdsc ,
                                              Integer.valueOf(AV51Facturacion_buscardocumentofacturads_5_tffacbarcod) ,
                                              Integer.valueOf(AV52Facturacion_buscardocumentofacturads_6_tffacbarcod_to) ,
                                              Byte.valueOf(AV53Facturacion_buscardocumentofacturads_7_tffacbarreo) ,
                                              Byte.valueOf(AV54Facturacion_buscardocumentofacturads_8_tffacbarreo_to) ,
                                              AV56Facturacion_buscardocumentofacturads_10_tffacbarpar_sel ,
                                              AV55Facturacion_buscardocumentofacturads_9_tffacbarpar ,
                                              AV58Facturacion_buscardocumentofacturads_12_tffacser_sel ,
                                              AV57Facturacion_buscardocumentofacturads_11_tffacser ,
                                              AV60Facturacion_buscardocumentofacturads_14_tffaccolnom_sel ,
                                              AV59Facturacion_buscardocumentofacturads_13_tffaccolnom ,
                                              Integer.valueOf(AV61Facturacion_buscardocumentofacturads_15_tffoccolnum) ,
                                              Integer.valueOf(AV62Facturacion_buscardocumentofacturads_16_tffoccolnum_to) ,
                                              Integer.valueOf(A446FacLin) ,
                                              A432FacDsc ,
                                              Integer.valueOf(A1294FacBarCod) ,
                                              Byte.valueOf(A1295FacBarReo) ,
                                              A1296FacBarPar ,
                                              A454FacSer ,
                                              A3878FacColNom ,
                                              Integer.valueOf(A3879FocColNum) ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV38Emprcod ,
                                              Long.valueOf(AV37FacAlbCod) ,
                                              Integer.valueOf(AV36FacCod) ,
                                              A396EmprCod ,
                                              Long.valueOf(A427FacAlbCod) ,
                                              Integer.valueOf(A430FacCod) } ,
                                              new int[]{
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.INT, TypeConstants.STRING,
                                              TypeConstants.LONG, TypeConstants.INT
                                              }
         });
         lV49Facturacion_buscardocumentofacturads_3_tffacdsc = GXutil.padr( GXutil.rtrim( AV49Facturacion_buscardocumentofacturads_3_tffacdsc), 40, "%") ;
         lV55Facturacion_buscardocumentofacturads_9_tffacbarpar = GXutil.padr( GXutil.rtrim( AV55Facturacion_buscardocumentofacturads_9_tffacbarpar), 1, "%") ;
         lV57Facturacion_buscardocumentofacturads_11_tffacser = GXutil.padr( GXutil.rtrim( AV57Facturacion_buscardocumentofacturads_11_tffacser), 16, "%") ;
         lV59Facturacion_buscardocumentofacturads_13_tffaccolnom = GXutil.padr( GXutil.rtrim( AV59Facturacion_buscardocumentofacturads_13_tffaccolnom), 13, "%") ;
         /* Using cursor H02CG2 */
         pr_default.execute(0, new Object[] {AV38Emprcod, Long.valueOf(AV37FacAlbCod), Integer.valueOf(AV36FacCod), Integer.valueOf(AV47Facturacion_buscardocumentofacturads_1_tffaclin), Integer.valueOf(AV48Facturacion_buscardocumentofacturads_2_tffaclin_to), lV49Facturacion_buscardocumentofacturads_3_tffacdsc, AV50Facturacion_buscardocumentofacturads_4_tffacdsc_sel, Integer.valueOf(AV51Facturacion_buscardocumentofacturads_5_tffacbarcod), Integer.valueOf(AV52Facturacion_buscardocumentofacturads_6_tffacbarcod_to), Byte.valueOf(AV53Facturacion_buscardocumentofacturads_7_tffacbarreo), Byte.valueOf(AV54Facturacion_buscardocumentofacturads_8_tffacbarreo_to), lV55Facturacion_buscardocumentofacturads_9_tffacbarpar, AV56Facturacion_buscardocumentofacturads_10_tffacbarpar_sel, lV57Facturacion_buscardocumentofacturads_11_tffacser, AV58Facturacion_buscardocumentofacturads_12_tffacser_sel, lV59Facturacion_buscardocumentofacturads_13_tffaccolnom, AV60Facturacion_buscardocumentofacturads_14_tffaccolnom_sel, Integer.valueOf(AV61Facturacion_buscardocumentofacturads_15_tffoccolnum), Integer.valueOf(AV62Facturacion_buscardocumentofacturads_16_tffoccolnum_to), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_41_idx = (int)(1+GRID_nFirstRecordOnPage) ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A427FacAlbCod = H02CG2_A427FacAlbCod[0] ;
            A430FacCod = H02CG2_A430FacCod[0] ;
            A396EmprCod = H02CG2_A396EmprCod[0] ;
            A3879FocColNum = H02CG2_A3879FocColNum[0] ;
            A3878FacColNom = H02CG2_A3878FacColNom[0] ;
            A454FacSer = H02CG2_A454FacSer[0] ;
            A1296FacBarPar = H02CG2_A1296FacBarPar[0] ;
            A1295FacBarReo = H02CG2_A1295FacBarReo[0] ;
            A1294FacBarCod = H02CG2_A1294FacBarCod[0] ;
            A432FacDsc = H02CG2_A432FacDsc[0] ;
            A446FacLin = H02CG2_A446FacLin[0] ;
            e192CG2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(41) ;
         wb2CG0( ) ;
      }
      bGXsfl_41_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2CG2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FACLIN"+"_"+sGXsfl_41_idx, getSecureSignedToken( sGXsfl_41_idx, localUtil.format( DecimalUtil.doubleToDec(A446FacLin), "ZZ9")));
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
      AV47Facturacion_buscardocumentofacturads_1_tffaclin = AV19TFFacLin ;
      AV48Facturacion_buscardocumentofacturads_2_tffaclin_to = AV20TFFacLin_To ;
      AV49Facturacion_buscardocumentofacturads_3_tffacdsc = AV21TFFacDsc ;
      AV50Facturacion_buscardocumentofacturads_4_tffacdsc_sel = AV22TFFacDsc_Sel ;
      AV51Facturacion_buscardocumentofacturads_5_tffacbarcod = AV23TFFacBarCod ;
      AV52Facturacion_buscardocumentofacturads_6_tffacbarcod_to = AV24TFFacBarCod_To ;
      AV53Facturacion_buscardocumentofacturads_7_tffacbarreo = AV25TFFacBarReo ;
      AV54Facturacion_buscardocumentofacturads_8_tffacbarreo_to = AV26TFFacBarReo_To ;
      AV55Facturacion_buscardocumentofacturads_9_tffacbarpar = AV27TFFacBarPar ;
      AV56Facturacion_buscardocumentofacturads_10_tffacbarpar_sel = AV28TFFacBarPar_Sel ;
      AV57Facturacion_buscardocumentofacturads_11_tffacser = AV29TFFacSer ;
      AV58Facturacion_buscardocumentofacturads_12_tffacser_sel = AV30TFFacSer_Sel ;
      AV59Facturacion_buscardocumentofacturads_13_tffaccolnom = AV31TFFacColNom ;
      AV60Facturacion_buscardocumentofacturads_14_tffaccolnom_sel = AV32TFFacColNom_Sel ;
      AV61Facturacion_buscardocumentofacturads_15_tffoccolnum = AV33TFFocColNum ;
      AV62Facturacion_buscardocumentofacturads_16_tffoccolnum_to = AV34TFFocColNum_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Integer.valueOf(AV47Facturacion_buscardocumentofacturads_1_tffaclin) ,
                                           Integer.valueOf(AV48Facturacion_buscardocumentofacturads_2_tffaclin_to) ,
                                           AV50Facturacion_buscardocumentofacturads_4_tffacdsc_sel ,
                                           AV49Facturacion_buscardocumentofacturads_3_tffacdsc ,
                                           Integer.valueOf(AV51Facturacion_buscardocumentofacturads_5_tffacbarcod) ,
                                           Integer.valueOf(AV52Facturacion_buscardocumentofacturads_6_tffacbarcod_to) ,
                                           Byte.valueOf(AV53Facturacion_buscardocumentofacturads_7_tffacbarreo) ,
                                           Byte.valueOf(AV54Facturacion_buscardocumentofacturads_8_tffacbarreo_to) ,
                                           AV56Facturacion_buscardocumentofacturads_10_tffacbarpar_sel ,
                                           AV55Facturacion_buscardocumentofacturads_9_tffacbarpar ,
                                           AV58Facturacion_buscardocumentofacturads_12_tffacser_sel ,
                                           AV57Facturacion_buscardocumentofacturads_11_tffacser ,
                                           AV60Facturacion_buscardocumentofacturads_14_tffaccolnom_sel ,
                                           AV59Facturacion_buscardocumentofacturads_13_tffaccolnom ,
                                           Integer.valueOf(AV61Facturacion_buscardocumentofacturads_15_tffoccolnum) ,
                                           Integer.valueOf(AV62Facturacion_buscardocumentofacturads_16_tffoccolnum_to) ,
                                           Integer.valueOf(A446FacLin) ,
                                           A432FacDsc ,
                                           Integer.valueOf(A1294FacBarCod) ,
                                           Byte.valueOf(A1295FacBarReo) ,
                                           A1296FacBarPar ,
                                           A454FacSer ,
                                           A3878FacColNom ,
                                           Integer.valueOf(A3879FocColNum) ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV38Emprcod ,
                                           Long.valueOf(AV37FacAlbCod) ,
                                           Integer.valueOf(AV36FacCod) ,
                                           A396EmprCod ,
                                           Long.valueOf(A427FacAlbCod) ,
                                           Integer.valueOf(A430FacCod) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.LONG, TypeConstants.INT
                                           }
      });
      lV49Facturacion_buscardocumentofacturads_3_tffacdsc = GXutil.padr( GXutil.rtrim( AV49Facturacion_buscardocumentofacturads_3_tffacdsc), 40, "%") ;
      lV55Facturacion_buscardocumentofacturads_9_tffacbarpar = GXutil.padr( GXutil.rtrim( AV55Facturacion_buscardocumentofacturads_9_tffacbarpar), 1, "%") ;
      lV57Facturacion_buscardocumentofacturads_11_tffacser = GXutil.padr( GXutil.rtrim( AV57Facturacion_buscardocumentofacturads_11_tffacser), 16, "%") ;
      lV59Facturacion_buscardocumentofacturads_13_tffaccolnom = GXutil.padr( GXutil.rtrim( AV59Facturacion_buscardocumentofacturads_13_tffaccolnom), 13, "%") ;
      /* Using cursor H02CG3 */
      pr_default.execute(1, new Object[] {AV38Emprcod, Long.valueOf(AV37FacAlbCod), Integer.valueOf(AV36FacCod), Integer.valueOf(AV47Facturacion_buscardocumentofacturads_1_tffaclin), Integer.valueOf(AV48Facturacion_buscardocumentofacturads_2_tffaclin_to), lV49Facturacion_buscardocumentofacturads_3_tffacdsc, AV50Facturacion_buscardocumentofacturads_4_tffacdsc_sel, Integer.valueOf(AV51Facturacion_buscardocumentofacturads_5_tffacbarcod), Integer.valueOf(AV52Facturacion_buscardocumentofacturads_6_tffacbarcod_to), Byte.valueOf(AV53Facturacion_buscardocumentofacturads_7_tffacbarreo), Byte.valueOf(AV54Facturacion_buscardocumentofacturads_8_tffacbarreo_to), lV55Facturacion_buscardocumentofacturads_9_tffacbarpar, AV56Facturacion_buscardocumentofacturads_10_tffacbarpar_sel, lV57Facturacion_buscardocumentofacturads_11_tffacser, AV58Facturacion_buscardocumentofacturads_12_tffacser_sel, lV59Facturacion_buscardocumentofacturads_13_tffaccolnom, AV60Facturacion_buscardocumentofacturads_14_tffaccolnom_sel, Integer.valueOf(AV61Facturacion_buscardocumentofacturads_15_tffoccolnum), Integer.valueOf(AV62Facturacion_buscardocumentofacturads_16_tffoccolnum_to)});
      GRID_nRecordCount = H02CG3_AGRID_nRecordCount[0] ;
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
      AV47Facturacion_buscardocumentofacturads_1_tffaclin = AV19TFFacLin ;
      AV48Facturacion_buscardocumentofacturads_2_tffaclin_to = AV20TFFacLin_To ;
      AV49Facturacion_buscardocumentofacturads_3_tffacdsc = AV21TFFacDsc ;
      AV50Facturacion_buscardocumentofacturads_4_tffacdsc_sel = AV22TFFacDsc_Sel ;
      AV51Facturacion_buscardocumentofacturads_5_tffacbarcod = AV23TFFacBarCod ;
      AV52Facturacion_buscardocumentofacturads_6_tffacbarcod_to = AV24TFFacBarCod_To ;
      AV53Facturacion_buscardocumentofacturads_7_tffacbarreo = AV25TFFacBarReo ;
      AV54Facturacion_buscardocumentofacturads_8_tffacbarreo_to = AV26TFFacBarReo_To ;
      AV55Facturacion_buscardocumentofacturads_9_tffacbarpar = AV27TFFacBarPar ;
      AV56Facturacion_buscardocumentofacturads_10_tffacbarpar_sel = AV28TFFacBarPar_Sel ;
      AV57Facturacion_buscardocumentofacturads_11_tffacser = AV29TFFacSer ;
      AV58Facturacion_buscardocumentofacturads_12_tffacser_sel = AV30TFFacSer_Sel ;
      AV59Facturacion_buscardocumentofacturads_13_tffaccolnom = AV31TFFacColNom ;
      AV60Facturacion_buscardocumentofacturads_14_tffaccolnom_sel = AV32TFFacColNom_Sel ;
      AV61Facturacion_buscardocumentofacturads_15_tffoccolnum = AV33TFFocColNum ;
      AV62Facturacion_buscardocumentofacturads_16_tffoccolnum_to = AV34TFFocColNum_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV38Emprcod, AV36FacCod, AV37FacAlbCod, AV19TFFacLin, AV20TFFacLin_To, AV21TFFacDsc, AV22TFFacDsc_Sel, AV23TFFacBarCod, AV24TFFacBarCod_To, AV25TFFacBarReo, AV26TFFacBarReo_To, AV27TFFacBarPar, AV28TFFacBarPar_Sel, AV29TFFacSer, AV30TFFacSer_Sel, AV31TFFacColNom, AV32TFFacColNom_Sel, AV33TFFocColNum, AV34TFFocColNum_To, AV46Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV47Facturacion_buscardocumentofacturads_1_tffaclin = AV19TFFacLin ;
      AV48Facturacion_buscardocumentofacturads_2_tffaclin_to = AV20TFFacLin_To ;
      AV49Facturacion_buscardocumentofacturads_3_tffacdsc = AV21TFFacDsc ;
      AV50Facturacion_buscardocumentofacturads_4_tffacdsc_sel = AV22TFFacDsc_Sel ;
      AV51Facturacion_buscardocumentofacturads_5_tffacbarcod = AV23TFFacBarCod ;
      AV52Facturacion_buscardocumentofacturads_6_tffacbarcod_to = AV24TFFacBarCod_To ;
      AV53Facturacion_buscardocumentofacturads_7_tffacbarreo = AV25TFFacBarReo ;
      AV54Facturacion_buscardocumentofacturads_8_tffacbarreo_to = AV26TFFacBarReo_To ;
      AV55Facturacion_buscardocumentofacturads_9_tffacbarpar = AV27TFFacBarPar ;
      AV56Facturacion_buscardocumentofacturads_10_tffacbarpar_sel = AV28TFFacBarPar_Sel ;
      AV57Facturacion_buscardocumentofacturads_11_tffacser = AV29TFFacSer ;
      AV58Facturacion_buscardocumentofacturads_12_tffacser_sel = AV30TFFacSer_Sel ;
      AV59Facturacion_buscardocumentofacturads_13_tffaccolnom = AV31TFFacColNom ;
      AV60Facturacion_buscardocumentofacturads_14_tffaccolnom_sel = AV32TFFacColNom_Sel ;
      AV61Facturacion_buscardocumentofacturads_15_tffoccolnum = AV33TFFocColNum ;
      AV62Facturacion_buscardocumentofacturads_16_tffoccolnum_to = AV34TFFocColNum_To ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV38Emprcod, AV36FacCod, AV37FacAlbCod, AV19TFFacLin, AV20TFFacLin_To, AV21TFFacDsc, AV22TFFacDsc_Sel, AV23TFFacBarCod, AV24TFFacBarCod_To, AV25TFFacBarReo, AV26TFFacBarReo_To, AV27TFFacBarPar, AV28TFFacBarPar_Sel, AV29TFFacSer, AV30TFFacSer_Sel, AV31TFFacColNom, AV32TFFacColNom_Sel, AV33TFFocColNum, AV34TFFocColNum_To, AV46Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV47Facturacion_buscardocumentofacturads_1_tffaclin = AV19TFFacLin ;
      AV48Facturacion_buscardocumentofacturads_2_tffaclin_to = AV20TFFacLin_To ;
      AV49Facturacion_buscardocumentofacturads_3_tffacdsc = AV21TFFacDsc ;
      AV50Facturacion_buscardocumentofacturads_4_tffacdsc_sel = AV22TFFacDsc_Sel ;
      AV51Facturacion_buscardocumentofacturads_5_tffacbarcod = AV23TFFacBarCod ;
      AV52Facturacion_buscardocumentofacturads_6_tffacbarcod_to = AV24TFFacBarCod_To ;
      AV53Facturacion_buscardocumentofacturads_7_tffacbarreo = AV25TFFacBarReo ;
      AV54Facturacion_buscardocumentofacturads_8_tffacbarreo_to = AV26TFFacBarReo_To ;
      AV55Facturacion_buscardocumentofacturads_9_tffacbarpar = AV27TFFacBarPar ;
      AV56Facturacion_buscardocumentofacturads_10_tffacbarpar_sel = AV28TFFacBarPar_Sel ;
      AV57Facturacion_buscardocumentofacturads_11_tffacser = AV29TFFacSer ;
      AV58Facturacion_buscardocumentofacturads_12_tffacser_sel = AV30TFFacSer_Sel ;
      AV59Facturacion_buscardocumentofacturads_13_tffaccolnom = AV31TFFacColNom ;
      AV60Facturacion_buscardocumentofacturads_14_tffaccolnom_sel = AV32TFFacColNom_Sel ;
      AV61Facturacion_buscardocumentofacturads_15_tffoccolnum = AV33TFFocColNum ;
      AV62Facturacion_buscardocumentofacturads_16_tffoccolnum_to = AV34TFFocColNum_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV38Emprcod, AV36FacCod, AV37FacAlbCod, AV19TFFacLin, AV20TFFacLin_To, AV21TFFacDsc, AV22TFFacDsc_Sel, AV23TFFacBarCod, AV24TFFacBarCod_To, AV25TFFacBarReo, AV26TFFacBarReo_To, AV27TFFacBarPar, AV28TFFacBarPar_Sel, AV29TFFacSer, AV30TFFacSer_Sel, AV31TFFacColNom, AV32TFFacColNom_Sel, AV33TFFocColNum, AV34TFFocColNum_To, AV46Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV47Facturacion_buscardocumentofacturads_1_tffaclin = AV19TFFacLin ;
      AV48Facturacion_buscardocumentofacturads_2_tffaclin_to = AV20TFFacLin_To ;
      AV49Facturacion_buscardocumentofacturads_3_tffacdsc = AV21TFFacDsc ;
      AV50Facturacion_buscardocumentofacturads_4_tffacdsc_sel = AV22TFFacDsc_Sel ;
      AV51Facturacion_buscardocumentofacturads_5_tffacbarcod = AV23TFFacBarCod ;
      AV52Facturacion_buscardocumentofacturads_6_tffacbarcod_to = AV24TFFacBarCod_To ;
      AV53Facturacion_buscardocumentofacturads_7_tffacbarreo = AV25TFFacBarReo ;
      AV54Facturacion_buscardocumentofacturads_8_tffacbarreo_to = AV26TFFacBarReo_To ;
      AV55Facturacion_buscardocumentofacturads_9_tffacbarpar = AV27TFFacBarPar ;
      AV56Facturacion_buscardocumentofacturads_10_tffacbarpar_sel = AV28TFFacBarPar_Sel ;
      AV57Facturacion_buscardocumentofacturads_11_tffacser = AV29TFFacSer ;
      AV58Facturacion_buscardocumentofacturads_12_tffacser_sel = AV30TFFacSer_Sel ;
      AV59Facturacion_buscardocumentofacturads_13_tffaccolnom = AV31TFFacColNom ;
      AV60Facturacion_buscardocumentofacturads_14_tffaccolnom_sel = AV32TFFacColNom_Sel ;
      AV61Facturacion_buscardocumentofacturads_15_tffoccolnum = AV33TFFocColNum ;
      AV62Facturacion_buscardocumentofacturads_16_tffoccolnum_to = AV34TFFocColNum_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV38Emprcod, AV36FacCod, AV37FacAlbCod, AV19TFFacLin, AV20TFFacLin_To, AV21TFFacDsc, AV22TFFacDsc_Sel, AV23TFFacBarCod, AV24TFFacBarCod_To, AV25TFFacBarReo, AV26TFFacBarReo_To, AV27TFFacBarPar, AV28TFFacBarPar_Sel, AV29TFFacSer, AV30TFFacSer_Sel, AV31TFFacColNom, AV32TFFacColNom_Sel, AV33TFFocColNum, AV34TFFocColNum_To, AV46Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV47Facturacion_buscardocumentofacturads_1_tffaclin = AV19TFFacLin ;
      AV48Facturacion_buscardocumentofacturads_2_tffaclin_to = AV20TFFacLin_To ;
      AV49Facturacion_buscardocumentofacturads_3_tffacdsc = AV21TFFacDsc ;
      AV50Facturacion_buscardocumentofacturads_4_tffacdsc_sel = AV22TFFacDsc_Sel ;
      AV51Facturacion_buscardocumentofacturads_5_tffacbarcod = AV23TFFacBarCod ;
      AV52Facturacion_buscardocumentofacturads_6_tffacbarcod_to = AV24TFFacBarCod_To ;
      AV53Facturacion_buscardocumentofacturads_7_tffacbarreo = AV25TFFacBarReo ;
      AV54Facturacion_buscardocumentofacturads_8_tffacbarreo_to = AV26TFFacBarReo_To ;
      AV55Facturacion_buscardocumentofacturads_9_tffacbarpar = AV27TFFacBarPar ;
      AV56Facturacion_buscardocumentofacturads_10_tffacbarpar_sel = AV28TFFacBarPar_Sel ;
      AV57Facturacion_buscardocumentofacturads_11_tffacser = AV29TFFacSer ;
      AV58Facturacion_buscardocumentofacturads_12_tffacser_sel = AV30TFFacSer_Sel ;
      AV59Facturacion_buscardocumentofacturads_13_tffaccolnom = AV31TFFacColNom ;
      AV60Facturacion_buscardocumentofacturads_14_tffaccolnom_sel = AV32TFFacColNom_Sel ;
      AV61Facturacion_buscardocumentofacturads_15_tffoccolnum = AV33TFFocColNum ;
      AV62Facturacion_buscardocumentofacturads_16_tffoccolnum_to = AV34TFFocColNum_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV38Emprcod, AV36FacCod, AV37FacAlbCod, AV19TFFacLin, AV20TFFacLin_To, AV21TFFacDsc, AV22TFFacDsc_Sel, AV23TFFacBarCod, AV24TFFacBarCod_To, AV25TFFacBarReo, AV26TFFacBarReo_To, AV27TFFacBarPar, AV28TFFacBarPar_Sel, AV29TFFacSer, AV30TFFacSer_Sel, AV31TFFacColNom, AV32TFFacColNom_Sel, AV33TFFocColNum, AV34TFFocColNum_To, AV46Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV46Pgmname = "Facturacion.BuscarDocumentoFactura" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46Pgmname", AV46Pgmname);
      Gx_err = (short)(0) ;
      edtavFaccod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFaccod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFaccod_Enabled), 5, 0), true);
      edtavFacalbcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFacalbcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacalbcod_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2CG0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e172CG2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV35DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_41 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_41"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Ddo_grid_Caption = httpContext.cgiGet( "DDO_GRID_Caption") ;
         Ddo_grid_Filteredtext_set = httpContext.cgiGet( "DDO_GRID_Filteredtext_set") ;
         Ddo_grid_Filteredtextto_set = httpContext.cgiGet( "DDO_GRID_Filteredtextto_set") ;
         Ddo_grid_Selectedvalue_set = httpContext.cgiGet( "DDO_GRID_Selectedvalue_set") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( "DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( "DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( "DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( "DDO_GRID_Includesortasc") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( "DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( "DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( "DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( "DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( "DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( "DDO_GRID_Datalisttype") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( "DDO_GRID_Datalistproc") ;
         Dvelop_confirmpanel_enter_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Title") ;
         Dvelop_confirmpanel_enter_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Confirmationtext") ;
         Dvelop_confirmpanel_enter_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Yesbuttoncaption") ;
         Dvelop_confirmpanel_enter_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Nobuttoncaption") ;
         Dvelop_confirmpanel_enter_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_enter_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Yesbuttonposition") ;
         Dvelop_confirmpanel_enter_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Confirmtype") ;
         Dvelop_confirmpanel_eliminardocumento_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Title") ;
         Dvelop_confirmpanel_eliminardocumento_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Confirmationtext") ;
         Dvelop_confirmpanel_eliminardocumento_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminardocumento_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminardocumento_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminardocumento_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminardocumento_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Infinitescrolling = httpContext.cgiGet( "GRID_EMPOWERER_Infinitescrolling") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( "DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         Dvelop_confirmpanel_enter_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Result") ;
         Dvelop_confirmpanel_eliminardocumento_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Result") ;
         /* Read variables values. */
         AV46Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46Pgmname", AV46Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"BuscarDocumentoFactura");
         AV46Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46Pgmname", AV46Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV46Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("facturacion\\buscardocumentofactura:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e172CG2 ();
      if (returnInSub) return;
   }

   public void e172CG2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV41Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      buscardocumentofactura_impl.this.GXt_char1 = GXv_char2[0] ;
      AV41Station = GXt_char1 ;
      GXv_char2[0] = AV38Emprcod ;
      GXv_char3[0] = AV42EmprNom ;
      GXv_char4[0] = AV43UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV41Station, GXv_char2, GXv_char3, GXv_char4) ;
      buscardocumentofactura_impl.this.AV38Emprcod = GXv_char2[0] ;
      buscardocumentofactura_impl.this.AV42EmprNom = GXv_char3[0] ;
      buscardocumentofactura_impl.this.AV43UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Emprcod", AV38Emprcod);
      subGrid_Rows = 50 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Mantenimiento Factura", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      if ( AV12OrderedBy < 1 )
      {
         AV12OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
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

   public void e182CG2( )
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
      AV47Facturacion_buscardocumentofacturads_1_tffaclin = AV19TFFacLin ;
      AV48Facturacion_buscardocumentofacturads_2_tffaclin_to = AV20TFFacLin_To ;
      AV49Facturacion_buscardocumentofacturads_3_tffacdsc = AV21TFFacDsc ;
      AV50Facturacion_buscardocumentofacturads_4_tffacdsc_sel = AV22TFFacDsc_Sel ;
      AV51Facturacion_buscardocumentofacturads_5_tffacbarcod = AV23TFFacBarCod ;
      AV52Facturacion_buscardocumentofacturads_6_tffacbarcod_to = AV24TFFacBarCod_To ;
      AV53Facturacion_buscardocumentofacturads_7_tffacbarreo = AV25TFFacBarReo ;
      AV54Facturacion_buscardocumentofacturads_8_tffacbarreo_to = AV26TFFacBarReo_To ;
      AV55Facturacion_buscardocumentofacturads_9_tffacbarpar = AV27TFFacBarPar ;
      AV56Facturacion_buscardocumentofacturads_10_tffacbarpar_sel = AV28TFFacBarPar_Sel ;
      AV57Facturacion_buscardocumentofacturads_11_tffacser = AV29TFFacSer ;
      AV58Facturacion_buscardocumentofacturads_12_tffacser_sel = AV30TFFacSer_Sel ;
      AV59Facturacion_buscardocumentofacturads_13_tffaccolnom = AV31TFFacColNom ;
      AV60Facturacion_buscardocumentofacturads_14_tffaccolnom_sel = AV32TFFacColNom_Sel ;
      AV61Facturacion_buscardocumentofacturads_15_tffoccolnum = AV33TFFocColNum ;
      AV62Facturacion_buscardocumentofacturads_16_tffoccolnum_to = AV34TFFocColNum_To ;
   }

   public void e122CG2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV12OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         AV13OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FacLin") == 0 )
         {
            AV19TFFacLin = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19TFFacLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19TFFacLin), 6, 0));
            AV20TFFacLin_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20TFFacLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20TFFacLin_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FacDsc") == 0 )
         {
            AV21TFFacDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21TFFacDsc", AV21TFFacDsc);
            AV22TFFacDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22TFFacDsc_Sel", AV22TFFacDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FacBarCod") == 0 )
         {
            AV23TFFacBarCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23TFFacBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23TFFacBarCod), 8, 0));
            AV24TFFacBarCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24TFFacBarCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24TFFacBarCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FacBarReo") == 0 )
         {
            AV25TFFacBarReo = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25TFFacBarReo", GXutil.str( AV25TFFacBarReo, 1, 0));
            AV26TFFacBarReo_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFFacBarReo_To", GXutil.str( AV26TFFacBarReo_To, 1, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FacBarPar") == 0 )
         {
            AV27TFFacBarPar = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFFacBarPar", AV27TFFacBarPar);
            AV28TFFacBarPar_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFFacBarPar_Sel", AV28TFFacBarPar_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FacSer") == 0 )
         {
            AV29TFFacSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFFacSer", AV29TFFacSer);
            AV30TFFacSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFFacSer_Sel", AV30TFFacSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FacColNom") == 0 )
         {
            AV31TFFacColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFFacColNom", AV31TFFacColNom);
            AV32TFFacColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFFacColNom_Sel", AV32TFFacColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FocColNum") == 0 )
         {
            AV33TFFocColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFFocColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TFFocColNum), 6, 0));
            AV34TFFocColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFFocColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFFocColNum_To), 6, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e192CG2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(41) ;
      }
      sendrow_412( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_41_Refreshing )
      {
         httpContext.doAjaxLoad(41, GridRow);
      }
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e152CG2 ();
      if (returnInSub) return;
   }

   public void e152CG2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ENTERContainer", "Confirm", "", new Object[] {});
   }

   public void e132CG2( )
   {
      /* Dvelop_confirmpanel_enter_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_enter_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ENTER' */
         S152 ();
         if (returnInSub) return;
      }
   }

   public void e142CG2( )
   {
      /* Dvelop_confirmpanel_eliminardocumento_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminardocumento_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINARDOCUMENTO' */
         S162 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e162CG2( )
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

   public void S132( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S152( )
   {
      /* 'DO ACTION ENTER' Routine */
      returnInSub = false ;
      /* Start For Each Line */
      nRC_GXsfl_41 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_41"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_41_fel_idx = 0 ;
      while ( nGXsfl_41_fel_idx < nRC_GXsfl_41 )
      {
         nGXsfl_41_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_41_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_41_fel_idx+1) ;
         sGXsfl_41_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_412( ) ;
         A446FacLin = (int)(localUtil.ctol( httpContext.cgiGet( edtFacLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A432FacDsc = httpContext.cgiGet( edtFacDsc_Internalname) ;
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavFacmts_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavFacmts_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFACMTS");
            GX_FocusControl = edtavFacmts_Internalname ;
            wbErr = true ;
            AV14FacMts = DecimalUtil.ZERO ;
         }
         else
         {
            AV14FacMts = localUtil.ctond( httpContext.cgiGet( edtavFacmts_Internalname)) ;
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavFacpremts_Internalname)), DecimalUtil.stringToDec("-999999.99999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavFacpremts_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFACPREMTS");
            GX_FocusControl = edtavFacpremts_Internalname ;
            wbErr = true ;
            AV15FacPreMts = DecimalUtil.ZERO ;
         }
         else
         {
            AV15FacPreMts = localUtil.ctond( httpContext.cgiGet( edtavFacpremts_Internalname)) ;
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavFackgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavFackgs_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFACKGS");
            GX_FocusControl = edtavFackgs_Internalname ;
            wbErr = true ;
            AV16FacKgs = DecimalUtil.ZERO ;
         }
         else
         {
            AV16FacKgs = localUtil.ctond( httpContext.cgiGet( edtavFackgs_Internalname)) ;
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavFacprekgs_Internalname)), DecimalUtil.stringToDec("-999999.99999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavFacprekgs_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFACPREKGS");
            GX_FocusControl = edtavFacprekgs_Internalname ;
            wbErr = true ;
            AV17FacPreKgs = DecimalUtil.ZERO ;
         }
         else
         {
            AV17FacPreKgs = localUtil.ctond( httpContext.cgiGet( edtavFacprekgs_Internalname)) ;
         }
         A1294FacBarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtFacBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A1295FacBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtFacBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A1296FacBarPar = httpContext.cgiGet( edtFacBarPar_Internalname) ;
         A454FacSer = httpContext.cgiGet( edtFacSer_Internalname) ;
         A3878FacColNom = httpContext.cgiGet( edtFacColNom_Internalname) ;
         A3879FocColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtFocColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         new app.facturacion.pbusalb(remoteHandle, context).execute( AV38Emprcod, AV36FacCod, A446FacLin, AV16FacKgs, AV17FacPreKgs, AV14FacMts, AV15FacPreMts) ;
         /* End For Each Line */
      }
      if ( nGXsfl_41_fel_idx == 0 )
      {
         nGXsfl_41_idx = 1 ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
      }
      nGXsfl_41_fel_idx = 1 ;
      new app.pcalvto(remoteHandle, context).execute( AV38Emprcod, AV36FacCod) ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S162( )
   {
      /* 'DO ACTION ELIMINARDOCUMENTO' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV38Emprcod ;
      GXv_int8[0] = AV36FacCod ;
      GXv_int9[0] = AV39FacAlbTip ;
      GXv_int10[0] = AV37FacAlbCod ;
      GXv_dtime11[0] = AV40FacHor ;
      new app.pelialb(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int9, GXv_int10, GXv_dtime11) ;
      buscardocumentofactura_impl.this.AV38Emprcod = GXv_char4[0] ;
      buscardocumentofactura_impl.this.AV36FacCod = GXv_int8[0] ;
      buscardocumentofactura_impl.this.AV39FacAlbTip = GXv_int9[0] ;
      buscardocumentofactura_impl.this.AV37FacAlbCod = GXv_int10[0] ;
      buscardocumentofactura_impl.this.AV40FacHor = GXv_dtime11[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Emprcod", AV38Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV36FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36FacCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV39FacAlbTip", GXutil.str( AV39FacAlbTip, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV37FacAlbCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37FacAlbCod), 10, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV40FacHor", localUtil.ttoc( AV40FacHor, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV18Session.getValue(AV46Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV46Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV18Session.getValue(AV46Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV64GXV1 = 1 ;
      while ( AV64GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV64GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACLIN") == 0 )
         {
            AV19TFFacLin = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19TFFacLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19TFFacLin), 6, 0));
            AV20TFFacLin_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20TFFacLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20TFFacLin_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACDSC") == 0 )
         {
            AV21TFFacDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21TFFacDsc", AV21TFFacDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACDSC_SEL") == 0 )
         {
            AV22TFFacDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22TFFacDsc_Sel", AV22TFFacDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACBARCOD") == 0 )
         {
            AV23TFFacBarCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23TFFacBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23TFFacBarCod), 8, 0));
            AV24TFFacBarCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24TFFacBarCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24TFFacBarCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACBARREO") == 0 )
         {
            AV25TFFacBarReo = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25TFFacBarReo", GXutil.str( AV25TFFacBarReo, 1, 0));
            AV26TFFacBarReo_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFFacBarReo_To", GXutil.str( AV26TFFacBarReo_To, 1, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACBARPAR") == 0 )
         {
            AV27TFFacBarPar = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFFacBarPar", AV27TFFacBarPar);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACBARPAR_SEL") == 0 )
         {
            AV28TFFacBarPar_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFFacBarPar_Sel", AV28TFFacBarPar_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACSER") == 0 )
         {
            AV29TFFacSer = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFFacSer", AV29TFFacSer);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACSER_SEL") == 0 )
         {
            AV30TFFacSer_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFFacSer_Sel", AV30TFFacSer_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACCOLNOM") == 0 )
         {
            AV31TFFacColNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFFacColNom", AV31TFFacColNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACCOLNOM_SEL") == 0 )
         {
            AV32TFFacColNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFFacColNom_Sel", AV32TFFacColNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFOCCOLNUM") == 0 )
         {
            AV33TFFocColNum = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFFocColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TFFocColNum), 6, 0));
            AV34TFFocColNum_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFFocColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFFocColNum_To), 6, 0));
         }
         AV64GXV1 = (int)(AV64GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV22TFFacDsc_Sel)==0), AV22TFFacDsc_Sel, GXv_char4) ;
      buscardocumentofactura_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV28TFFacBarPar_Sel)==0), AV28TFFacBarPar_Sel, GXv_char3) ;
      buscardocumentofactura_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV30TFFacSer_Sel)==0), AV30TFFacSer_Sel, GXv_char2) ;
      buscardocumentofactura_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFFacColNom_Sel)==0), AV32TFFacColNom_Sel, GXv_char15) ;
      buscardocumentofactura_impl.this.GXt_char14 = GXv_char15[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|||"+GXt_char12+"|"+GXt_char13+"|"+GXt_char14+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV21TFFacDsc)==0), AV21TFFacDsc, GXv_char15) ;
      buscardocumentofactura_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV27TFFacBarPar)==0), AV27TFFacBarPar, GXv_char4) ;
      buscardocumentofactura_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV29TFFacSer)==0), AV29TFFacSer, GXv_char3) ;
      buscardocumentofactura_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV31TFFacColNom)==0), AV31TFFacColNom, GXv_char2) ;
      buscardocumentofactura_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV19TFFacLin) ? "" : GXutil.str( AV19TFFacLin, 6, 0))+"|"+GXt_char14+"|"+((0==AV23TFFacBarCod) ? "" : GXutil.str( AV23TFFacBarCod, 8, 0))+"|"+((0==AV25TFFacBarReo) ? "" : GXutil.str( AV25TFFacBarReo, 1, 0))+"|"+GXt_char13+"|"+GXt_char12+"|"+GXt_char1+"|"+((0==AV33TFFocColNum) ? "" : GXutil.str( AV33TFFocColNum, 6, 0)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV20TFFacLin_To) ? "" : GXutil.str( AV20TFFacLin_To, 6, 0))+"||"+((0==AV24TFFacBarCod_To) ? "" : GXutil.str( AV24TFFacBarCod_To, 8, 0))+"|"+((0==AV26TFFacBarReo_To) ? "" : GXutil.str( AV26TFFacBarReo_To, 1, 0))+"||||"+((0==AV34TFFocColNum_To) ? "" : GXutil.str( AV34TFFocColNum_To, 6, 0)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S142( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV18Session.getValue(AV46Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFFACLIN", "", !((0==AV19TFFacLin)&&(0==AV20TFFacLin_To)), (short)(0), GXutil.trim( GXutil.str( AV19TFFacLin, 6, 0)), GXutil.trim( GXutil.str( AV20TFFacLin_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFFACDSC", "", !(GXutil.strcmp("", AV21TFFacDsc)==0), (short)(0), AV21TFFacDsc, "", !(GXutil.strcmp("", AV22TFFacDsc_Sel)==0), AV22TFFacDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFFACBARCOD", "", !((0==AV23TFFacBarCod)&&(0==AV24TFFacBarCod_To)), (short)(0), GXutil.trim( GXutil.str( AV23TFFacBarCod, 8, 0)), GXutil.trim( GXutil.str( AV24TFFacBarCod_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFFACBARREO", "", !((0==AV25TFFacBarReo)&&(0==AV26TFFacBarReo_To)), (short)(0), GXutil.trim( GXutil.str( AV25TFFacBarReo, 1, 0)), GXutil.trim( GXutil.str( AV26TFFacBarReo_To, 1, 0))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFFACBARPAR", "", !(GXutil.strcmp("", AV27TFFacBarPar)==0), (short)(0), AV27TFFacBarPar, "", !(GXutil.strcmp("", AV28TFFacBarPar_Sel)==0), AV28TFFacBarPar_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFFACSER", "", !(GXutil.strcmp("", AV29TFFacSer)==0), (short)(0), AV29TFFacSer, "", !(GXutil.strcmp("", AV30TFFacSer_Sel)==0), AV30TFFacSer_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFFACCOLNOM", "", !(GXutil.strcmp("", AV31TFFacColNom)==0), (short)(0), AV31TFFacColNom, "", !(GXutil.strcmp("", AV32TFFacColNom_Sel)==0), AV32TFFacColNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFFOCCOLNUM", "", !((0==AV33TFFocColNum)&&(0==AV34TFFocColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV33TFFocColNum, 6, 0)), GXutil.trim( GXutil.str( AV34TFFocColNum_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV46Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV46Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "Facturacion.MantenimientoFactura" );
      AV18Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table2_67_2CG2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_eliminardocumento_Internalname, tblTabledvelop_confirmpanel_eliminardocumento_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_eliminardocumento.setProperty("Title", Dvelop_confirmpanel_eliminardocumento_Title);
         ucDvelop_confirmpanel_eliminardocumento.setProperty("ConfirmationText", Dvelop_confirmpanel_eliminardocumento_Confirmationtext);
         ucDvelop_confirmpanel_eliminardocumento.setProperty("YesButtonCaption", Dvelop_confirmpanel_eliminardocumento_Yesbuttoncaption);
         ucDvelop_confirmpanel_eliminardocumento.setProperty("NoButtonCaption", Dvelop_confirmpanel_eliminardocumento_Nobuttoncaption);
         ucDvelop_confirmpanel_eliminardocumento.setProperty("CancelButtonCaption", Dvelop_confirmpanel_eliminardocumento_Cancelbuttoncaption);
         ucDvelop_confirmpanel_eliminardocumento.setProperty("YesButtonPosition", Dvelop_confirmpanel_eliminardocumento_Yesbuttonposition);
         ucDvelop_confirmpanel_eliminardocumento.setProperty("ConfirmType", Dvelop_confirmpanel_eliminardocumento_Confirmtype);
         ucDvelop_confirmpanel_eliminardocumento.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_eliminardocumento_Internalname, "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTOContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTOContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_67_2CG2e( true) ;
      }
      else
      {
         wb_table2_67_2CG2e( false) ;
      }
   }

   public void wb_table1_62_2CG2( boolean wbgen )
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
         wb_table1_62_2CG2e( true) ;
      }
      else
      {
         wb_table1_62_2CG2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV38Emprcod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Emprcod", AV38Emprcod);
      AV36FacCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36FacCod), 8, 0));
      AV37FacAlbCod = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37FacAlbCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37FacAlbCod), 10, 0));
      AV40FacHor = (java.util.Date)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40FacHor", localUtil.ttoc( AV40FacHor, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV39FacAlbTip = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39FacAlbTip", GXutil.str( AV39FacAlbTip, 1, 0));
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
      pa2CG2( ) ;
      ws2CG2( ) ;
      we2CG2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116153671", true, true);
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
      httpContext.AddJavascriptSource("facturacion/buscardocumentofactura.js", "?202682116153672", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_412( )
   {
      edtFacLin_Internalname = "FACLIN_"+sGXsfl_41_idx ;
      edtFacDsc_Internalname = "FACDSC_"+sGXsfl_41_idx ;
      edtavFacmts_Internalname = "vFACMTS_"+sGXsfl_41_idx ;
      edtavFacpremts_Internalname = "vFACPREMTS_"+sGXsfl_41_idx ;
      edtavFackgs_Internalname = "vFACKGS_"+sGXsfl_41_idx ;
      edtavFacprekgs_Internalname = "vFACPREKGS_"+sGXsfl_41_idx ;
      edtFacBarCod_Internalname = "FACBARCOD_"+sGXsfl_41_idx ;
      edtFacBarReo_Internalname = "FACBARREO_"+sGXsfl_41_idx ;
      edtFacBarPar_Internalname = "FACBARPAR_"+sGXsfl_41_idx ;
      edtFacSer_Internalname = "FACSER_"+sGXsfl_41_idx ;
      edtFacColNom_Internalname = "FACCOLNOM_"+sGXsfl_41_idx ;
      edtFocColNum_Internalname = "FOCCOLNUM_"+sGXsfl_41_idx ;
   }

   public void subsflControlProps_fel_412( )
   {
      edtFacLin_Internalname = "FACLIN_"+sGXsfl_41_fel_idx ;
      edtFacDsc_Internalname = "FACDSC_"+sGXsfl_41_fel_idx ;
      edtavFacmts_Internalname = "vFACMTS_"+sGXsfl_41_fel_idx ;
      edtavFacpremts_Internalname = "vFACPREMTS_"+sGXsfl_41_fel_idx ;
      edtavFackgs_Internalname = "vFACKGS_"+sGXsfl_41_fel_idx ;
      edtavFacprekgs_Internalname = "vFACPREKGS_"+sGXsfl_41_fel_idx ;
      edtFacBarCod_Internalname = "FACBARCOD_"+sGXsfl_41_fel_idx ;
      edtFacBarReo_Internalname = "FACBARREO_"+sGXsfl_41_fel_idx ;
      edtFacBarPar_Internalname = "FACBARPAR_"+sGXsfl_41_fel_idx ;
      edtFacSer_Internalname = "FACSER_"+sGXsfl_41_fel_idx ;
      edtFacColNom_Internalname = "FACCOLNOM_"+sGXsfl_41_fel_idx ;
      edtFocColNum_Internalname = "FOCCOLNUM_"+sGXsfl_41_fel_idx ;
   }

   public void sendrow_412( )
   {
      subsflControlProps_412( ) ;
      wb2CG0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_41_idx - GRID_nFirstRecordOnPage <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_41_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_41_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacLin_Internalname,GXutil.ltrim( localUtil.ntoc( A446FacLin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A446FacLin), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacDsc_Internalname,GXutil.rtrim( A432FacDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavFacmts_Enabled!=0)&&(edtavFacmts_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 44,'',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFacmts_Internalname,GXutil.ltrim( localUtil.ntoc( AV14FacMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( AV14FacMts, "ZZZZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavFacmts_Enabled!=0)&&(edtavFacmts_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,44);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavFacmts_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavFacpremts_Enabled!=0)&&(edtavFacpremts_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 45,'',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFacpremts_Internalname,GXutil.ltrim( localUtil.ntoc( AV15FacPreMts, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( AV15FacPreMts, "ZZZZZZ9.999")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+((edtavFacpremts_Enabled!=0)&&(edtavFacpremts_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,45);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavFacpremts_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavFackgs_Enabled!=0)&&(edtavFackgs_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 46,'',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFackgs_Internalname,GXutil.ltrim( localUtil.ntoc( AV16FacKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( AV16FacKgs, "ZZZZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavFackgs_Enabled!=0)&&(edtavFackgs_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,46);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavFackgs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavFacprekgs_Enabled!=0)&&(edtavFacprekgs_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 47,'',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFacprekgs_Internalname,GXutil.ltrim( localUtil.ntoc( AV17FacPreKgs, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( AV17FacPreKgs, "ZZZZZZ9.999")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+((edtavFacprekgs_Enabled!=0)&&(edtavFacprekgs_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,47);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavFacprekgs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A1294FacBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1294FacBarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacBarReo_Internalname,GXutil.ltrim( localUtil.ntoc( A1295FacBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1295FacBarReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacBarReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacBarPar_Internalname,GXutil.rtrim( A1296FacBarPar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacBarPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacSer_Internalname,GXutil.rtrim( A454FacSer),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacColNom_Internalname,GXutil.rtrim( A3878FacColNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFocColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A3879FocColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3879FocColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFocColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes2CG2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_41_idx = ((subGrid_Islastpage==1)&&(nGXsfl_41_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_41_idx+1) ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
      }
      /* End function sendrow_412 */
   }

   public void startgridcontrol41( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"41\">") ;
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
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio", "")) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
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
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A446FacLin, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A432FacDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV14FacMts, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV15FacPreMts, (byte)(13), (byte)(5), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV16FacKgs, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV17FacPreKgs, (byte)(13), (byte)(5), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1294FacBarCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1295FacBarReo, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1296FacBarPar));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A454FacSer));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3878FacColNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3879FocColNum, (byte)(6), (byte)(0), ".", "")));
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
      edtavFaccod_Internalname = "vFACCOD" ;
      edtavFacalbcod_Internalname = "vFACALBCOD" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtneliminardocumento_Internalname = "BTNELIMINARDOCUMENTO" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtFacLin_Internalname = "FACLIN" ;
      edtFacDsc_Internalname = "FACDSC" ;
      edtavFacmts_Internalname = "vFACMTS" ;
      edtavFacpremts_Internalname = "vFACPREMTS" ;
      edtavFackgs_Internalname = "vFACKGS" ;
      edtavFacprekgs_Internalname = "vFACPREKGS" ;
      edtFacBarCod_Internalname = "FACBARCOD" ;
      edtFacBarReo_Internalname = "FACBARREO" ;
      edtFacBarPar_Internalname = "FACBARPAR" ;
      edtFacSer_Internalname = "FACSER" ;
      edtFacColNom_Internalname = "FACCOLNOM" ;
      edtFocColNum_Internalname = "FOCCOLNUM" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Dvelop_confirmpanel_enter_Internalname = "DVELOP_CONFIRMPANEL_ENTER" ;
      tblTabledvelop_confirmpanel_enter_Internalname = "TABLEDVELOP_CONFIRMPANEL_ENTER" ;
      Dvelop_confirmpanel_eliminardocumento_Internalname = "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO" ;
      tblTabledvelop_confirmpanel_eliminardocumento_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO" ;
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
      edtFocColNum_Jsonclick = "" ;
      edtFacColNom_Jsonclick = "" ;
      edtFacSer_Jsonclick = "" ;
      edtFacBarPar_Jsonclick = "" ;
      edtFacBarReo_Jsonclick = "" ;
      edtFacBarCod_Jsonclick = "" ;
      edtavFacprekgs_Jsonclick = "" ;
      edtavFacprekgs_Visible = -1 ;
      edtavFacprekgs_Enabled = 1 ;
      edtavFackgs_Jsonclick = "" ;
      edtavFackgs_Visible = -1 ;
      edtavFackgs_Enabled = 1 ;
      edtavFacpremts_Jsonclick = "" ;
      edtavFacpremts_Visible = -1 ;
      edtavFacpremts_Enabled = 1 ;
      edtavFacmts_Jsonclick = "" ;
      edtavFacmts_Visible = -1 ;
      edtavFacmts_Enabled = 1 ;
      edtFacDsc_Jsonclick = "" ;
      edtFacLin_Jsonclick = "" ;
      subGrid_Class = "GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavFacalbcod_Jsonclick = "" ;
      edtavFacalbcod_Enabled = 0 ;
      edtavFaccod_Jsonclick = "" ;
      edtavFaccod_Enabled = 0 ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Infinitescrolling = "Form" ;
      Dvelop_confirmpanel_eliminardocumento_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminardocumento_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminardocumento_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminardocumento_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminardocumento_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminardocumento_Confirmationtext = "¿Desea Eliminar el Documento?" ;
      Dvelop_confirmpanel_eliminardocumento_Title = "" ;
      Dvelop_confirmpanel_enter_Confirmtype = "1" ;
      Dvelop_confirmpanel_enter_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_enter_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_enter_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_enter_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_enter_Confirmationtext = "¿Confirma los datos?" ;
      Dvelop_confirmpanel_enter_Title = "" ;
      Ddo_grid_Datalistproc = "Facturacion.BuscarDocumentoFacturaGetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic|||Dynamic|Dynamic|Dynamic|" ;
      Ddo_grid_Includedatalist = "|T|||T|T|T|" ;
      Ddo_grid_Filterisrange = "T||T|T||||T" ;
      Ddo_grid_Filtertype = "Numeric|Character|Numeric|Numeric|Character|Character|Character|Numeric" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7|8|9" ;
      Ddo_grid_Columnids = "0:FacLin|1:FacDsc|6:FacBarCod|7:FacBarReo|8:FacBarPar|9:FacSer|10:FacColNom|11:FocColNum" ;
      Ddo_grid_Gridinternalname = "" ;
      Dvpanel_tableheader_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Iconposition = "Right" ;
      Dvpanel_tableheader_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tableheader_Title = httpContext.getMessage( "WWP_FilterOptions", "") ;
      Dvpanel_tableheader_Cls = "PanelNoHeader" ;
      Dvpanel_tableheader_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableheader_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( " Mantenimiento Factura", "") );
      subGrid_Rows = 50 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV38Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV36FacCod',fld:'vFACCOD',pic:'ZZZZZZZ9'},{av:'AV37FacAlbCod',fld:'vFACALBCOD',pic:'ZZZZZZZZZ9'},{av:'AV19TFFacLin',fld:'vTFFACLIN',pic:'ZZ9'},{av:'AV20TFFacLin_To',fld:'vTFFACLIN_TO',pic:'ZZ9'},{av:'AV21TFFacDsc',fld:'vTFFACDSC',pic:''},{av:'AV22TFFacDsc_Sel',fld:'vTFFACDSC_SEL',pic:''},{av:'AV23TFFacBarCod',fld:'vTFFACBARCOD',pic:'ZZZZZZZ9'},{av:'AV24TFFacBarCod_To',fld:'vTFFACBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV25TFFacBarReo',fld:'vTFFACBARREO',pic:'9'},{av:'AV26TFFacBarReo_To',fld:'vTFFACBARREO_TO',pic:'9'},{av:'AV27TFFacBarPar',fld:'vTFFACBARPAR',pic:''},{av:'AV28TFFacBarPar_Sel',fld:'vTFFACBARPAR_SEL',pic:''},{av:'AV29TFFacSer',fld:'vTFFACSER',pic:''},{av:'AV30TFFacSer_Sel',fld:'vTFFACSER_SEL',pic:''},{av:'AV31TFFacColNom',fld:'vTFFACCOLNOM',pic:''},{av:'AV32TFFacColNom_Sel',fld:'vTFFACCOLNOM_SEL',pic:''},{av:'AV33TFFocColNum',fld:'vTFFOCCOLNUM',pic:'ZZZZZ9'},{av:'AV34TFFocColNum_To',fld:'vTFFOCCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV46Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e122CG2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV38Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV36FacCod',fld:'vFACCOD',pic:'ZZZZZZZ9'},{av:'AV37FacAlbCod',fld:'vFACALBCOD',pic:'ZZZZZZZZZ9'},{av:'AV19TFFacLin',fld:'vTFFACLIN',pic:'ZZ9'},{av:'AV20TFFacLin_To',fld:'vTFFACLIN_TO',pic:'ZZ9'},{av:'AV21TFFacDsc',fld:'vTFFACDSC',pic:''},{av:'AV22TFFacDsc_Sel',fld:'vTFFACDSC_SEL',pic:''},{av:'AV23TFFacBarCod',fld:'vTFFACBARCOD',pic:'ZZZZZZZ9'},{av:'AV24TFFacBarCod_To',fld:'vTFFACBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV25TFFacBarReo',fld:'vTFFACBARREO',pic:'9'},{av:'AV26TFFacBarReo_To',fld:'vTFFACBARREO_TO',pic:'9'},{av:'AV27TFFacBarPar',fld:'vTFFACBARPAR',pic:''},{av:'AV28TFFacBarPar_Sel',fld:'vTFFACBARPAR_SEL',pic:''},{av:'AV29TFFacSer',fld:'vTFFACSER',pic:''},{av:'AV30TFFacSer_Sel',fld:'vTFFACSER_SEL',pic:''},{av:'AV31TFFacColNom',fld:'vTFFACCOLNOM',pic:''},{av:'AV32TFFacColNom_Sel',fld:'vTFFACCOLNOM_SEL',pic:''},{av:'AV33TFFocColNum',fld:'vTFFOCCOLNUM',pic:'ZZZZZ9'},{av:'AV34TFFocColNum_To',fld:'vTFFOCCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV46Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV33TFFocColNum',fld:'vTFFOCCOLNUM',pic:'ZZZZZ9'},{av:'AV34TFFocColNum_To',fld:'vTFFOCCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV31TFFacColNom',fld:'vTFFACCOLNOM',pic:''},{av:'AV32TFFacColNom_Sel',fld:'vTFFACCOLNOM_SEL',pic:''},{av:'AV29TFFacSer',fld:'vTFFACSER',pic:''},{av:'AV30TFFacSer_Sel',fld:'vTFFACSER_SEL',pic:''},{av:'AV27TFFacBarPar',fld:'vTFFACBARPAR',pic:''},{av:'AV28TFFacBarPar_Sel',fld:'vTFFACBARPAR_SEL',pic:''},{av:'AV25TFFacBarReo',fld:'vTFFACBARREO',pic:'9'},{av:'AV26TFFacBarReo_To',fld:'vTFFACBARREO_TO',pic:'9'},{av:'AV23TFFacBarCod',fld:'vTFFACBARCOD',pic:'ZZZZZZZ9'},{av:'AV24TFFacBarCod_To',fld:'vTFFACBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV21TFFacDsc',fld:'vTFFACDSC',pic:''},{av:'AV22TFFacDsc_Sel',fld:'vTFFACDSC_SEL',pic:''},{av:'AV19TFFacLin',fld:'vTFFACLIN',pic:'ZZ9'},{av:'AV20TFFacLin_To',fld:'vTFFACLIN_TO',pic:'ZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e192CG2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("ENTER","{handler:'e152CG2',iparms:[]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE","{handler:'e132CG2',iparms:[{av:'Dvelop_confirmpanel_enter_Result',ctrl:'DVELOP_CONFIRMPANEL_ENTER',prop:'Result'},{av:'AV38Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV36FacCod',fld:'vFACCOD',pic:'ZZZZZZZ9'},{av:'A446FacLin',fld:'FACLIN',grid:41,pic:'ZZ9',hsh:true},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_41',ctrl:'GRID',grid:41,prop:'GridRC',grid:41},{av:'AV16FacKgs',fld:'vFACKGS',grid:41,pic:'ZZZZZ9.99'},{av:'AV17FacPreKgs',fld:'vFACPREKGS',grid:41,pic:'ZZZZZZ9.999'},{av:'AV14FacMts',fld:'vFACMTS',grid:41,pic:'ZZZZZ9.99'},{av:'AV15FacPreMts',fld:'vFACPREMTS',grid:41,pic:'ZZZZZZ9.999'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE",",oparms:[]}");
      setEventMetadata("'DOELIMINARDOCUMENTO'","{handler:'e112CG1',iparms:[]");
      setEventMetadata("'DOELIMINARDOCUMENTO'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO.CLOSE","{handler:'e142CG2',iparms:[{av:'Dvelop_confirmpanel_eliminardocumento_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO',prop:'Result'},{av:'AV38Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV36FacCod',fld:'vFACCOD',pic:'ZZZZZZZ9'},{av:'AV39FacAlbTip',fld:'vFACALBTIP',pic:'9'},{av:'AV37FacAlbCod',fld:'vFACALBCOD',pic:'ZZZZZZZZZ9'},{av:'AV40FacHor',fld:'vFACHOR',pic:'99/99/99 99:99'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO.CLOSE",",oparms:[{av:'AV40FacHor',fld:'vFACHOR',pic:'99/99/99 99:99'},{av:'AV37FacAlbCod',fld:'vFACALBCOD',pic:'ZZZZZZZZZ9'},{av:'AV39FacAlbTip',fld:'vFACALBTIP',pic:'9'},{av:'AV36FacCod',fld:'vFACCOD',pic:'ZZZZZZZ9'},{av:'AV38Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e162CG2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV38Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV36FacCod',fld:'vFACCOD',pic:'ZZZZZZZ9'},{av:'AV37FacAlbCod',fld:'vFACALBCOD',pic:'ZZZZZZZZZ9'},{av:'AV19TFFacLin',fld:'vTFFACLIN',pic:'ZZ9'},{av:'AV20TFFacLin_To',fld:'vTFFACLIN_TO',pic:'ZZ9'},{av:'AV21TFFacDsc',fld:'vTFFACDSC',pic:''},{av:'AV22TFFacDsc_Sel',fld:'vTFFACDSC_SEL',pic:''},{av:'AV23TFFacBarCod',fld:'vTFFACBARCOD',pic:'ZZZZZZZ9'},{av:'AV24TFFacBarCod_To',fld:'vTFFACBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV25TFFacBarReo',fld:'vTFFACBARREO',pic:'9'},{av:'AV26TFFacBarReo_To',fld:'vTFFACBARREO_TO',pic:'9'},{av:'AV27TFFacBarPar',fld:'vTFFACBARPAR',pic:''},{av:'AV28TFFacBarPar_Sel',fld:'vTFFACBARPAR_SEL',pic:''},{av:'AV29TFFacSer',fld:'vTFFACSER',pic:''},{av:'AV30TFFacSer_Sel',fld:'vTFFACSER_SEL',pic:''},{av:'AV31TFFacColNom',fld:'vTFFACCOLNOM',pic:''},{av:'AV32TFFacColNom_Sel',fld:'vTFFACCOLNOM_SEL',pic:''},{av:'AV33TFFocColNum',fld:'vTFFOCCOLNUM',pic:'ZZZZZ9'},{av:'AV34TFFocColNum_To',fld:'vTFFOCCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV46Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV38Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV36FacCod',fld:'vFACCOD',pic:'ZZZZZZZ9'},{av:'AV37FacAlbCod',fld:'vFACALBCOD',pic:'ZZZZZZZZZ9'},{av:'AV19TFFacLin',fld:'vTFFACLIN',pic:'ZZ9'},{av:'AV20TFFacLin_To',fld:'vTFFACLIN_TO',pic:'ZZ9'},{av:'AV21TFFacDsc',fld:'vTFFACDSC',pic:''},{av:'AV22TFFacDsc_Sel',fld:'vTFFACDSC_SEL',pic:''},{av:'AV23TFFacBarCod',fld:'vTFFACBARCOD',pic:'ZZZZZZZ9'},{av:'AV24TFFacBarCod_To',fld:'vTFFACBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV25TFFacBarReo',fld:'vTFFACBARREO',pic:'9'},{av:'AV26TFFacBarReo_To',fld:'vTFFACBARREO_TO',pic:'9'},{av:'AV27TFFacBarPar',fld:'vTFFACBARPAR',pic:''},{av:'AV28TFFacBarPar_Sel',fld:'vTFFACBARPAR_SEL',pic:''},{av:'AV29TFFacSer',fld:'vTFFACSER',pic:''},{av:'AV30TFFacSer_Sel',fld:'vTFFACSER_SEL',pic:''},{av:'AV31TFFacColNom',fld:'vTFFACCOLNOM',pic:''},{av:'AV32TFFacColNom_Sel',fld:'vTFFACCOLNOM_SEL',pic:''},{av:'AV33TFFocColNum',fld:'vTFFOCCOLNUM',pic:'ZZZZZ9'},{av:'AV34TFFocColNum_To',fld:'vTFFOCCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV46Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV38Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV36FacCod',fld:'vFACCOD',pic:'ZZZZZZZ9'},{av:'AV37FacAlbCod',fld:'vFACALBCOD',pic:'ZZZZZZZZZ9'},{av:'AV19TFFacLin',fld:'vTFFACLIN',pic:'ZZ9'},{av:'AV20TFFacLin_To',fld:'vTFFACLIN_TO',pic:'ZZ9'},{av:'AV21TFFacDsc',fld:'vTFFACDSC',pic:''},{av:'AV22TFFacDsc_Sel',fld:'vTFFACDSC_SEL',pic:''},{av:'AV23TFFacBarCod',fld:'vTFFACBARCOD',pic:'ZZZZZZZ9'},{av:'AV24TFFacBarCod_To',fld:'vTFFACBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV25TFFacBarReo',fld:'vTFFACBARREO',pic:'9'},{av:'AV26TFFacBarReo_To',fld:'vTFFACBARREO_TO',pic:'9'},{av:'AV27TFFacBarPar',fld:'vTFFACBARPAR',pic:''},{av:'AV28TFFacBarPar_Sel',fld:'vTFFACBARPAR_SEL',pic:''},{av:'AV29TFFacSer',fld:'vTFFACSER',pic:''},{av:'AV30TFFacSer_Sel',fld:'vTFFACSER_SEL',pic:''},{av:'AV31TFFacColNom',fld:'vTFFACCOLNOM',pic:''},{av:'AV32TFFacColNom_Sel',fld:'vTFFACCOLNOM_SEL',pic:''},{av:'AV33TFFocColNum',fld:'vTFFOCCOLNUM',pic:'ZZZZZ9'},{av:'AV34TFFocColNum_To',fld:'vTFFOCCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV46Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV38Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV36FacCod',fld:'vFACCOD',pic:'ZZZZZZZ9'},{av:'AV37FacAlbCod',fld:'vFACALBCOD',pic:'ZZZZZZZZZ9'},{av:'AV19TFFacLin',fld:'vTFFACLIN',pic:'ZZ9'},{av:'AV20TFFacLin_To',fld:'vTFFACLIN_TO',pic:'ZZ9'},{av:'AV21TFFacDsc',fld:'vTFFACDSC',pic:''},{av:'AV22TFFacDsc_Sel',fld:'vTFFACDSC_SEL',pic:''},{av:'AV23TFFacBarCod',fld:'vTFFACBARCOD',pic:'ZZZZZZZ9'},{av:'AV24TFFacBarCod_To',fld:'vTFFACBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV25TFFacBarReo',fld:'vTFFACBARREO',pic:'9'},{av:'AV26TFFacBarReo_To',fld:'vTFFACBARREO_TO',pic:'9'},{av:'AV27TFFacBarPar',fld:'vTFFACBARPAR',pic:''},{av:'AV28TFFacBarPar_Sel',fld:'vTFFACBARPAR_SEL',pic:''},{av:'AV29TFFacSer',fld:'vTFFACSER',pic:''},{av:'AV30TFFacSer_Sel',fld:'vTFFACSER_SEL',pic:''},{av:'AV31TFFacColNom',fld:'vTFFACCOLNOM',pic:''},{av:'AV32TFFacColNom_Sel',fld:'vTFFACCOLNOM_SEL',pic:''},{av:'AV33TFFocColNum',fld:'vTFFOCCOLNUM',pic:'ZZZZZ9'},{av:'AV34TFFocColNum_To',fld:'vTFFOCCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV46Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[]}");
      setEventMetadata("VALIDV_FACCOD","{handler:'validv_Faccod',iparms:[]");
      setEventMetadata("VALIDV_FACCOD",",oparms:[]}");
      setEventMetadata("VALIDV_FACALBCOD","{handler:'validv_Facalbcod',iparms:[]");
      setEventMetadata("VALIDV_FACALBCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Foccolnum',iparms:[]");
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
      wcpOAV38Emprcod = "" ;
      wcpOAV40FacHor = GXutil.resetTime( GXutil.nullDate() );
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Dvelop_confirmpanel_enter_Result = "" ;
      Dvelop_confirmpanel_eliminardocumento_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV38Emprcod = "" ;
      AV40FacHor = GXutil.resetTime( GXutil.nullDate() );
      AV21TFFacDsc = "" ;
      AV22TFFacDsc_Sel = "" ;
      AV27TFFacBarPar = "" ;
      AV28TFFacBarPar_Sel = "" ;
      AV29TFFacSer = "" ;
      AV30TFFacSer_Sel = "" ;
      AV31TFFacColNom = "" ;
      AV32TFFacColNom_Sel = "" ;
      AV46Pgmname = "" ;
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
      sPrefix = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      bttBtnenter_Jsonclick = "" ;
      bttBtneliminardocumento_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV49Facturacion_buscardocumentofacturads_3_tffacdsc = "" ;
      AV50Facturacion_buscardocumentofacturads_4_tffacdsc_sel = "" ;
      AV55Facturacion_buscardocumentofacturads_9_tffacbarpar = "" ;
      AV56Facturacion_buscardocumentofacturads_10_tffacbarpar_sel = "" ;
      AV57Facturacion_buscardocumentofacturads_11_tffacser = "" ;
      AV58Facturacion_buscardocumentofacturads_12_tffacser_sel = "" ;
      AV59Facturacion_buscardocumentofacturads_13_tffaccolnom = "" ;
      AV60Facturacion_buscardocumentofacturads_14_tffaccolnom_sel = "" ;
      A432FacDsc = "" ;
      AV14FacMts = DecimalUtil.ZERO ;
      AV15FacPreMts = DecimalUtil.ZERO ;
      AV16FacKgs = DecimalUtil.ZERO ;
      AV17FacPreKgs = DecimalUtil.ZERO ;
      A1296FacBarPar = "" ;
      A454FacSer = "" ;
      A3878FacColNom = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV49Facturacion_buscardocumentofacturads_3_tffacdsc = "" ;
      lV55Facturacion_buscardocumentofacturads_9_tffacbarpar = "" ;
      lV57Facturacion_buscardocumentofacturads_11_tffacser = "" ;
      lV59Facturacion_buscardocumentofacturads_13_tffaccolnom = "" ;
      A396EmprCod = "" ;
      H02CG2_A427FacAlbCod = new long[1] ;
      H02CG2_A430FacCod = new int[1] ;
      H02CG2_A396EmprCod = new String[] {""} ;
      H02CG2_A3879FocColNum = new int[1] ;
      H02CG2_A3878FacColNom = new String[] {""} ;
      H02CG2_A454FacSer = new String[] {""} ;
      H02CG2_A1296FacBarPar = new String[] {""} ;
      H02CG2_A1295FacBarReo = new byte[1] ;
      H02CG2_A1294FacBarCod = new int[1] ;
      H02CG2_A432FacDsc = new String[] {""} ;
      H02CG2_A446FacLin = new int[1] ;
      H02CG3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV41Station = "" ;
      AV42EmprNom = "" ;
      AV43UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      GXv_int8 = new int[1] ;
      GXv_int9 = new byte[1] ;
      GXv_int10 = new long[1] ;
      GXv_dtime11 = new java.util.Date[1] ;
      AV18Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char14 = "" ;
      GXv_char15 = new String[1] ;
      GXt_char13 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char12 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState16 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      ucDvelop_confirmpanel_eliminardocumento = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_enter = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.buscardocumentofactura__default(),
         new Object[] {
             new Object[] {
            H02CG2_A427FacAlbCod, H02CG2_A430FacCod, H02CG2_A396EmprCod, H02CG2_A3879FocColNum, H02CG2_A3878FacColNom, H02CG2_A454FacSer, H02CG2_A1296FacBarPar, H02CG2_A1295FacBarReo, H02CG2_A1294FacBarCod, H02CG2_A432FacDsc,
            H02CG2_A446FacLin
            }
            , new Object[] {
            H02CG3_AGRID_nRecordCount
            }
         }
      );
      AV46Pgmname = "Facturacion.BuscarDocumentoFactura" ;
      /* GeneXus formulas. */
      AV46Pgmname = "Facturacion.BuscarDocumentoFactura" ;
      Gx_err = (short)(0) ;
      edtavFaccod_Enabled = 0 ;
      edtavFacalbcod_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV39FacAlbTip ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV39FacAlbTip ;
   private byte AV25TFFacBarReo ;
   private byte AV26TFFacBarReo_To ;
   private byte gxajaxcallmode ;
   private byte AV53Facturacion_buscardocumentofacturads_7_tffacbarreo ;
   private byte AV54Facturacion_buscardocumentofacturads_8_tffacbarreo_to ;
   private byte A1295FacBarReo ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXv_int9[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV36FacCod ;
   private int nRC_GXsfl_41 ;
   private int subGrid_Rows ;
   private int AV36FacCod ;
   private int nGXsfl_41_idx=1 ;
   private int AV19TFFacLin ;
   private int AV20TFFacLin_To ;
   private int AV23TFFacBarCod ;
   private int AV24TFFacBarCod_To ;
   private int AV33TFFocColNum ;
   private int AV34TFFocColNum_To ;
   private int edtavFaccod_Enabled ;
   private int edtavFacalbcod_Enabled ;
   private int edtavPgmname_Enabled ;
   private int AV47Facturacion_buscardocumentofacturads_1_tffaclin ;
   private int AV48Facturacion_buscardocumentofacturads_2_tffaclin_to ;
   private int AV51Facturacion_buscardocumentofacturads_5_tffacbarcod ;
   private int AV52Facturacion_buscardocumentofacturads_6_tffacbarcod_to ;
   private int AV61Facturacion_buscardocumentofacturads_15_tffoccolnum ;
   private int AV62Facturacion_buscardocumentofacturads_16_tffoccolnum_to ;
   private int A446FacLin ;
   private int A1294FacBarCod ;
   private int A3879FocColNum ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int A430FacCod ;
   private int nGXsfl_41_fel_idx=1 ;
   private int GXv_int8[] ;
   private int AV64GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavFacmts_Enabled ;
   private int edtavFacmts_Visible ;
   private int edtavFacpremts_Enabled ;
   private int edtavFacpremts_Visible ;
   private int edtavFackgs_Enabled ;
   private int edtavFackgs_Visible ;
   private int edtavFacprekgs_Enabled ;
   private int edtavFacprekgs_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long wcpOAV37FacAlbCod ;
   private long GRID_nFirstRecordOnPage ;
   private long AV37FacAlbCod ;
   private long GRID_nCurrentRecord ;
   private long A427FacAlbCod ;
   private long GRID_nRecordCount ;
   private long GXv_int10[] ;
   private java.math.BigDecimal AV14FacMts ;
   private java.math.BigDecimal AV15FacPreMts ;
   private java.math.BigDecimal AV16FacKgs ;
   private java.math.BigDecimal AV17FacPreKgs ;
   private String wcpOAV38Emprcod ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Dvelop_confirmpanel_enter_Result ;
   private String Dvelop_confirmpanel_eliminardocumento_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV38Emprcod ;
   private String sGXsfl_41_idx="0001" ;
   private String AV21TFFacDsc ;
   private String AV22TFFacDsc_Sel ;
   private String AV27TFFacBarPar ;
   private String AV28TFFacBarPar_Sel ;
   private String AV29TFFacSer ;
   private String AV30TFFacSer_Sel ;
   private String AV31TFFacColNom ;
   private String AV32TFFacColNom_Sel ;
   private String AV46Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
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
   private String Dvelop_confirmpanel_enter_Title ;
   private String Dvelop_confirmpanel_enter_Confirmationtext ;
   private String Dvelop_confirmpanel_enter_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_enter_Nobuttoncaption ;
   private String Dvelop_confirmpanel_enter_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_enter_Yesbuttonposition ;
   private String Dvelop_confirmpanel_enter_Confirmtype ;
   private String Dvelop_confirmpanel_eliminardocumento_Title ;
   private String Dvelop_confirmpanel_eliminardocumento_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminardocumento_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminardocumento_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminardocumento_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminardocumento_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminardocumento_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Infinitescrolling ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtavFaccod_Internalname ;
   private String edtavFaccod_Jsonclick ;
   private String edtavFacalbcod_Internalname ;
   private String edtavFacalbcod_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String divUnnamedtable1_Internalname ;
   private String TempTags ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtneliminardocumento_Internalname ;
   private String bttBtneliminardocumento_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV49Facturacion_buscardocumentofacturads_3_tffacdsc ;
   private String AV50Facturacion_buscardocumentofacturads_4_tffacdsc_sel ;
   private String AV55Facturacion_buscardocumentofacturads_9_tffacbarpar ;
   private String AV56Facturacion_buscardocumentofacturads_10_tffacbarpar_sel ;
   private String AV57Facturacion_buscardocumentofacturads_11_tffacser ;
   private String AV58Facturacion_buscardocumentofacturads_12_tffacser_sel ;
   private String AV59Facturacion_buscardocumentofacturads_13_tffaccolnom ;
   private String AV60Facturacion_buscardocumentofacturads_14_tffaccolnom_sel ;
   private String edtFacLin_Internalname ;
   private String A432FacDsc ;
   private String edtFacDsc_Internalname ;
   private String edtavFacmts_Internalname ;
   private String edtavFacpremts_Internalname ;
   private String edtavFackgs_Internalname ;
   private String edtavFacprekgs_Internalname ;
   private String edtFacBarCod_Internalname ;
   private String edtFacBarReo_Internalname ;
   private String A1296FacBarPar ;
   private String edtFacBarPar_Internalname ;
   private String A454FacSer ;
   private String edtFacSer_Internalname ;
   private String A3878FacColNom ;
   private String edtFacColNom_Internalname ;
   private String edtFocColNum_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String lV49Facturacion_buscardocumentofacturads_3_tffacdsc ;
   private String lV55Facturacion_buscardocumentofacturads_9_tffacbarpar ;
   private String lV57Facturacion_buscardocumentofacturads_11_tffacser ;
   private String lV59Facturacion_buscardocumentofacturads_13_tffaccolnom ;
   private String A396EmprCod ;
   private String hsh ;
   private String AV41Station ;
   private String AV42EmprNom ;
   private String AV43UsurCod ;
   private String sGXsfl_41_fel_idx="0001" ;
   private String GXt_char14 ;
   private String GXv_char15[] ;
   private String GXt_char13 ;
   private String GXv_char4[] ;
   private String GXt_char12 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTabledvelop_confirmpanel_eliminardocumento_Internalname ;
   private String Dvelop_confirmpanel_eliminardocumento_Internalname ;
   private String tblTabledvelop_confirmpanel_enter_Internalname ;
   private String Dvelop_confirmpanel_enter_Internalname ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtFacLin_Jsonclick ;
   private String edtFacDsc_Jsonclick ;
   private String edtavFacmts_Jsonclick ;
   private String edtavFacpremts_Jsonclick ;
   private String edtavFackgs_Jsonclick ;
   private String edtavFacprekgs_Jsonclick ;
   private String edtFacBarCod_Jsonclick ;
   private String edtFacBarReo_Jsonclick ;
   private String edtFacBarPar_Jsonclick ;
   private String edtFacSer_Jsonclick ;
   private String edtFacColNom_Jsonclick ;
   private String edtFocColNum_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV40FacHor ;
   private java.util.Date AV40FacHor ;
   private java.util.Date GXv_dtime11[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV13OrderedDsc ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_41_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV18Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminardocumento ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_enter ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private long[] H02CG2_A427FacAlbCod ;
   private int[] H02CG2_A430FacCod ;
   private String[] H02CG2_A396EmprCod ;
   private int[] H02CG2_A3879FocColNum ;
   private String[] H02CG2_A3878FacColNom ;
   private String[] H02CG2_A454FacSer ;
   private String[] H02CG2_A1296FacBarPar ;
   private byte[] H02CG2_A1295FacBarReo ;
   private int[] H02CG2_A1294FacBarCod ;
   private String[] H02CG2_A432FacDsc ;
   private int[] H02CG2_A446FacLin ;
   private long[] H02CG3_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState16[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV35DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class buscardocumentofactura__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H02CG2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV47Facturacion_buscardocumentofacturads_1_tffaclin ,
                                          int AV48Facturacion_buscardocumentofacturads_2_tffaclin_to ,
                                          String AV50Facturacion_buscardocumentofacturads_4_tffacdsc_sel ,
                                          String AV49Facturacion_buscardocumentofacturads_3_tffacdsc ,
                                          int AV51Facturacion_buscardocumentofacturads_5_tffacbarcod ,
                                          int AV52Facturacion_buscardocumentofacturads_6_tffacbarcod_to ,
                                          byte AV53Facturacion_buscardocumentofacturads_7_tffacbarreo ,
                                          byte AV54Facturacion_buscardocumentofacturads_8_tffacbarreo_to ,
                                          String AV56Facturacion_buscardocumentofacturads_10_tffacbarpar_sel ,
                                          String AV55Facturacion_buscardocumentofacturads_9_tffacbarpar ,
                                          String AV58Facturacion_buscardocumentofacturads_12_tffacser_sel ,
                                          String AV57Facturacion_buscardocumentofacturads_11_tffacser ,
                                          String AV60Facturacion_buscardocumentofacturads_14_tffaccolnom_sel ,
                                          String AV59Facturacion_buscardocumentofacturads_13_tffaccolnom ,
                                          int AV61Facturacion_buscardocumentofacturads_15_tffoccolnum ,
                                          int AV62Facturacion_buscardocumentofacturads_16_tffoccolnum_to ,
                                          int A446FacLin ,
                                          String A432FacDsc ,
                                          int A1294FacBarCod ,
                                          byte A1295FacBarReo ,
                                          String A1296FacBarPar ,
                                          String A454FacSer ,
                                          String A3878FacColNom ,
                                          int A3879FocColNum ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV38Emprcod ,
                                          long AV37FacAlbCod ,
                                          int AV36FacCod ,
                                          String A396EmprCod ,
                                          long A427FacAlbCod ,
                                          int A430FacCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[24];
      Object[] GXv_Object18 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " /*+ FIRST_ROWS(51) */ FacAlbCod, FacCod, EmprCod, FocColNum, FacColNom, FacSer, FacBarPar, FacBarReo, FacBarCod, FacDsc, FacLin" ;
      sFromString = " FROM TXPLFAVEN" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(EmprCod = ? and FacAlbCod = ? and FacCod = ?)");
      if ( ! (0==AV47Facturacion_buscardocumentofacturads_1_tffaclin) )
      {
         addWhere(sWhereString, "(FacLin >= ?)");
      }
      else
      {
         GXv_int17[3] = (byte)(1) ;
      }
      if ( ! (0==AV48Facturacion_buscardocumentofacturads_2_tffaclin_to) )
      {
         addWhere(sWhereString, "(FacLin <= ?)");
      }
      else
      {
         GXv_int17[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50Facturacion_buscardocumentofacturads_4_tffacdsc_sel)==0) && ( ! (GXutil.strcmp("", AV49Facturacion_buscardocumentofacturads_3_tffacdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FacDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50Facturacion_buscardocumentofacturads_4_tffacdsc_sel)==0) )
      {
         addWhere(sWhereString, "(FacDsc = ?)");
      }
      else
      {
         GXv_int17[6] = (byte)(1) ;
      }
      if ( ! (0==AV51Facturacion_buscardocumentofacturads_5_tffacbarcod) )
      {
         addWhere(sWhereString, "(FacBarCod >= ?)");
      }
      else
      {
         GXv_int17[7] = (byte)(1) ;
      }
      if ( ! (0==AV52Facturacion_buscardocumentofacturads_6_tffacbarcod_to) )
      {
         addWhere(sWhereString, "(FacBarCod <= ?)");
      }
      else
      {
         GXv_int17[8] = (byte)(1) ;
      }
      if ( ! (0==AV53Facturacion_buscardocumentofacturads_7_tffacbarreo) )
      {
         addWhere(sWhereString, "(FacBarReo >= ?)");
      }
      else
      {
         GXv_int17[9] = (byte)(1) ;
      }
      if ( ! (0==AV54Facturacion_buscardocumentofacturads_8_tffacbarreo_to) )
      {
         addWhere(sWhereString, "(FacBarReo <= ?)");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Facturacion_buscardocumentofacturads_10_tffacbarpar_sel)==0) && ( ! (GXutil.strcmp("", AV55Facturacion_buscardocumentofacturads_9_tffacbarpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FacBarPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Facturacion_buscardocumentofacturads_10_tffacbarpar_sel)==0) )
      {
         addWhere(sWhereString, "(FacBarPar = ?)");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Facturacion_buscardocumentofacturads_12_tffacser_sel)==0) && ( ! (GXutil.strcmp("", AV57Facturacion_buscardocumentofacturads_11_tffacser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FacSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Facturacion_buscardocumentofacturads_12_tffacser_sel)==0) )
      {
         addWhere(sWhereString, "(FacSer = ?)");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Facturacion_buscardocumentofacturads_14_tffaccolnom_sel)==0) && ( ! (GXutil.strcmp("", AV59Facturacion_buscardocumentofacturads_13_tffaccolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FacColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Facturacion_buscardocumentofacturads_14_tffaccolnom_sel)==0) )
      {
         addWhere(sWhereString, "(FacColNom = ?)");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
      }
      if ( ! (0==AV61Facturacion_buscardocumentofacturads_15_tffoccolnum) )
      {
         addWhere(sWhereString, "(FocColNum >= ?)");
      }
      else
      {
         GXv_int17[17] = (byte)(1) ;
      }
      if ( ! (0==AV62Facturacion_buscardocumentofacturads_16_tffoccolnum_to) )
      {
         addWhere(sWhereString, "(FocColNum <= ?)");
      }
      else
      {
         GXv_int17[18] = (byte)(1) ;
      }
      if ( AV12OrderedBy == 1 )
      {
         sOrderString += " ORDER BY EmprCod, FacCod, FacLin" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY FacLin" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY FacLin DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY FacDsc" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY FacDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY FacBarCod" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY FacBarCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY FacBarReo" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY FacBarReo DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY FacBarPar" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY FacBarPar DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY FacSer" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY FacSer DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY FacColNom" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY FacColNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY FocColNum" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY FocColNum DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY EmprCod, FacCod, FacLin" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_H02CG3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV47Facturacion_buscardocumentofacturads_1_tffaclin ,
                                          int AV48Facturacion_buscardocumentofacturads_2_tffaclin_to ,
                                          String AV50Facturacion_buscardocumentofacturads_4_tffacdsc_sel ,
                                          String AV49Facturacion_buscardocumentofacturads_3_tffacdsc ,
                                          int AV51Facturacion_buscardocumentofacturads_5_tffacbarcod ,
                                          int AV52Facturacion_buscardocumentofacturads_6_tffacbarcod_to ,
                                          byte AV53Facturacion_buscardocumentofacturads_7_tffacbarreo ,
                                          byte AV54Facturacion_buscardocumentofacturads_8_tffacbarreo_to ,
                                          String AV56Facturacion_buscardocumentofacturads_10_tffacbarpar_sel ,
                                          String AV55Facturacion_buscardocumentofacturads_9_tffacbarpar ,
                                          String AV58Facturacion_buscardocumentofacturads_12_tffacser_sel ,
                                          String AV57Facturacion_buscardocumentofacturads_11_tffacser ,
                                          String AV60Facturacion_buscardocumentofacturads_14_tffaccolnom_sel ,
                                          String AV59Facturacion_buscardocumentofacturads_13_tffaccolnom ,
                                          int AV61Facturacion_buscardocumentofacturads_15_tffoccolnum ,
                                          int AV62Facturacion_buscardocumentofacturads_16_tffoccolnum_to ,
                                          int A446FacLin ,
                                          String A432FacDsc ,
                                          int A1294FacBarCod ,
                                          byte A1295FacBarReo ,
                                          String A1296FacBarPar ,
                                          String A454FacSer ,
                                          String A3878FacColNom ,
                                          int A3879FocColNum ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV38Emprcod ,
                                          long AV37FacAlbCod ,
                                          int AV36FacCod ,
                                          String A396EmprCod ,
                                          long A427FacAlbCod ,
                                          int A430FacCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[19];
      Object[] GXv_Object20 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM TXPLFAVEN" ;
      addWhere(sWhereString, "(EmprCod = ? and FacAlbCod = ? and FacCod = ?)");
      if ( ! (0==AV47Facturacion_buscardocumentofacturads_1_tffaclin) )
      {
         addWhere(sWhereString, "(FacLin >= ?)");
      }
      else
      {
         GXv_int19[3] = (byte)(1) ;
      }
      if ( ! (0==AV48Facturacion_buscardocumentofacturads_2_tffaclin_to) )
      {
         addWhere(sWhereString, "(FacLin <= ?)");
      }
      else
      {
         GXv_int19[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50Facturacion_buscardocumentofacturads_4_tffacdsc_sel)==0) && ( ! (GXutil.strcmp("", AV49Facturacion_buscardocumentofacturads_3_tffacdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FacDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50Facturacion_buscardocumentofacturads_4_tffacdsc_sel)==0) )
      {
         addWhere(sWhereString, "(FacDsc = ?)");
      }
      else
      {
         GXv_int19[6] = (byte)(1) ;
      }
      if ( ! (0==AV51Facturacion_buscardocumentofacturads_5_tffacbarcod) )
      {
         addWhere(sWhereString, "(FacBarCod >= ?)");
      }
      else
      {
         GXv_int19[7] = (byte)(1) ;
      }
      if ( ! (0==AV52Facturacion_buscardocumentofacturads_6_tffacbarcod_to) )
      {
         addWhere(sWhereString, "(FacBarCod <= ?)");
      }
      else
      {
         GXv_int19[8] = (byte)(1) ;
      }
      if ( ! (0==AV53Facturacion_buscardocumentofacturads_7_tffacbarreo) )
      {
         addWhere(sWhereString, "(FacBarReo >= ?)");
      }
      else
      {
         GXv_int19[9] = (byte)(1) ;
      }
      if ( ! (0==AV54Facturacion_buscardocumentofacturads_8_tffacbarreo_to) )
      {
         addWhere(sWhereString, "(FacBarReo <= ?)");
      }
      else
      {
         GXv_int19[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Facturacion_buscardocumentofacturads_10_tffacbarpar_sel)==0) && ( ! (GXutil.strcmp("", AV55Facturacion_buscardocumentofacturads_9_tffacbarpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FacBarPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Facturacion_buscardocumentofacturads_10_tffacbarpar_sel)==0) )
      {
         addWhere(sWhereString, "(FacBarPar = ?)");
      }
      else
      {
         GXv_int19[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Facturacion_buscardocumentofacturads_12_tffacser_sel)==0) && ( ! (GXutil.strcmp("", AV57Facturacion_buscardocumentofacturads_11_tffacser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FacSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Facturacion_buscardocumentofacturads_12_tffacser_sel)==0) )
      {
         addWhere(sWhereString, "(FacSer = ?)");
      }
      else
      {
         GXv_int19[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Facturacion_buscardocumentofacturads_14_tffaccolnom_sel)==0) && ( ! (GXutil.strcmp("", AV59Facturacion_buscardocumentofacturads_13_tffaccolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FacColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Facturacion_buscardocumentofacturads_14_tffaccolnom_sel)==0) )
      {
         addWhere(sWhereString, "(FacColNom = ?)");
      }
      else
      {
         GXv_int19[16] = (byte)(1) ;
      }
      if ( ! (0==AV61Facturacion_buscardocumentofacturads_15_tffoccolnum) )
      {
         addWhere(sWhereString, "(FocColNum >= ?)");
      }
      else
      {
         GXv_int19[17] = (byte)(1) ;
      }
      if ( ! (0==AV62Facturacion_buscardocumentofacturads_16_tffoccolnum_to) )
      {
         addWhere(sWhereString, "(FocColNum <= ?)");
      }
      else
      {
         GXv_int19[18] = (byte)(1) ;
      }
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
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object20[0] = scmdbuf ;
      GXv_Object20[1] = GXv_int19 ;
      return GXv_Object20 ;
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
                  return conditional_H02CG2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).shortValue() , ((Boolean) dynConstraints[25]).booleanValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).longValue() , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).longValue() , ((Number) dynConstraints[31]).intValue() );
            case 1 :
                  return conditional_H02CG3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).shortValue() , ((Boolean) dynConstraints[25]).booleanValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).longValue() , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).longValue() , ((Number) dynConstraints[31]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02CG2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,51, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02CG3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 40);
               ((int[]) buf[10])[0] = rslt.getInt(11);
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
                  stmt.setString(sIdx, (String)parms[24], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[25]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 40);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 40);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[20]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 40);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 40);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[28]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[29]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               return;
      }
   }

}

