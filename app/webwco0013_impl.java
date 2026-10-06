package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webwco0013_impl extends GXDataArea
{
   public webwco0013_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webwco0013_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwco0013_impl.class ));
   }

   public webwco0013_impl( int remoteHandle ,
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
               AV39PrePrvNum = (int)(GXutil.lval( httpContext.GetPar( "PrePrvNum"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV39PrePrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39PrePrvNum), 6, 0));
               AV40PrvNom = httpContext.GetPar( "PrvNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV40PrvNom", AV40PrvNom);
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
      nRC_GXsfl_39 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_39"))) ;
      nGXsfl_39_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_39_idx"))) ;
      sGXsfl_39_idx = httpContext.GetPar( "sGXsfl_39_idx") ;
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
      AV39PrePrvNum = (int)(GXutil.lval( httpContext.GetPar( "PrePrvNum"))) ;
      AV30TFPrdNum = httpContext.GetPar( "TFPrdNum") ;
      AV31TFPrdNum_Sel = httpContext.GetPar( "TFPrdNum_Sel") ;
      AV33TFPrdNom = httpContext.GetPar( "TFPrdNom") ;
      AV34TFPrdNom_Sel = httpContext.GetPar( "TFPrdNom_Sel") ;
      AV81Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV40PrvNom = httpContext.GetPar( "PrvNom") ;
      AV15PrePedUni = CommonUtil.decimalVal( httpContext.GetPar( "PrePedUni"), ".") ;
      AV16PrePedPre = CommonUtil.decimalVal( httpContext.GetPar( "PrePedPre"), ".") ;
      AV17PrePedDto = CommonUtil.decimalVal( httpContext.GetPar( "PrePedDto"), ".") ;
      AV67Moda21 = (short)(GXutil.lval( httpContext.GetPar( "Moda21"))) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A756PrePrvNum = (int)(GXutil.lval( httpContext.GetPar( "PrePrvNum"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV38Emprcod, AV39PrePrvNum, AV30TFPrdNum, AV31TFPrdNum_Sel, AV33TFPrdNom, AV34TFPrdNom_Sel, AV81Pgmname, AV12OrderedBy, AV13OrderedDsc, AV40PrvNom, AV15PrePedUni, AV16PrePedPre, AV17PrePedDto, AV67Moda21, A396EmprCod, A756PrePrvNum) ;
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
      paZY2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startZY2( ) ;
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
      FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"false\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.webwco0013", new String[] {GXutil.URLEncode(GXutil.rtrim(AV38Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV39PrePrvNum,6,0)),GXutil.URLEncode(GXutil.rtrim(AV40PrvNom))}, new String[] {"Emprcod","PrePrvNum","PrvNom"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV81Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PREPRVNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A756PrePrvNum), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV67Moda21), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_39", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_39, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV36DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV36DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNUM", GXutil.rtrim( AV30TFPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNUM_SEL", GXutil.rtrim( AV31TFPrdNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNOM", GXutil.rtrim( AV33TFPrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNOM_SEL", GXutil.rtrim( AV34TFPrdNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV81Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV81Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV38Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vPREPRVNUM", GXutil.ltrim( localUtil.ntoc( AV39PrePrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PREPEDUNI", GXutil.ltrim( localUtil.ntoc( A755PrePedUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PREPEDPRE", GXutil.ltrim( localUtil.ntoc( A753PrePedPre, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PREPEDDTO", GXutil.ltrim( localUtil.ntoc( A752PrePedDto, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPEDCOD", GXutil.ltrim( localUtil.ntoc( AV45PedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPEDTOT", GXutil.ltrim( localUtil.ntoc( AV50PedTot, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "PREPRVNUM", GXutil.ltrim( localUtil.ntoc( A756PrePrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PREPRVNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A756PrePrvNum), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFECENT", localUtil.dtoc( AV46FecEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vPEDFECPEN", localUtil.dtoc( AV48PedFecPEn, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV67Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV67Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGERR", GXutil.ltrim( localUtil.ntoc( AV43FlagErr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRDNUM_SELECTED", GXutil.rtrim( AV54PrdNum_Selected));
      app.GxWebStd.gx_hidden_field( httpContext, "vPREPRVNUM_SELECTED", GXutil.ltrim( localUtil.ntoc( AV53PrePrvNum_Selected, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD_SELECTED", GXutil.rtrim( AV52EmprCod_Selected));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_set", GXutil.rtrim( Ddo_grid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Title", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Infinitescrolling", GXutil.rtrim( Grid_empowerer_Infinitescrolling));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Result));
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
         weZY2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtZY2( ) ;
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
      return formatLink("app.webwco0013", new String[] {GXutil.URLEncode(GXutil.rtrim(AV38Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV39PrePrvNum,6,0)),GXutil.URLEncode(GXutil.rtrim(AV40PrvNom))}, new String[] {"Emprcod","PrePrvNum","PrvNom"})  ;
   }

   public String getPgmname( )
   {
      return "WebWco0013" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Realizacion Pedidos", "") ;
   }

   public void wbZY0( )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPrvnom_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrvnom_Internalname, GXutil.rtrim( AV40PrvNom), GXutil.rtrim( localUtil.format( AV40PrvNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrvnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPrvnom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWco0013.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableactions_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 39, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWco0013.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_27_ZY2( true) ;
      }
      else
      {
         wb_table1_27_ZY2( false) ;
      }
      return  ;
   }

   public void wb_table1_27_ZY2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 39, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 7, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e11zy1_client"+"'", TempTags, "", 2, "HLP_WebWco0013.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 39, 2, 0)+","+"null"+");", httpContext.getMessage( "Cancelar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cancelar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWco0013.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol39( ) ;
      }
      if ( wbEnd == 39 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_39 = (int)(nGXsfl_39_idx-1) ;
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavValortotal_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavValortotal_Internalname, httpContext.getMessage( "Total", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_39_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavValortotal_Internalname, GXutil.ltrim( localUtil.ntoc( AV42ValorTotal, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavValortotal_Enabled!=0) ? localUtil.format( AV42ValorTotal, "ZZZZZZZZ9.99") : localUtil.format( AV42ValorTotal, "ZZZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavValortotal_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavValortotal_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWco0013.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableinvisible_Internalname, divTableinvisible_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnllamaremergente_Internalname, "gx.evt.setGridEvt("+GXutil.str( 39, 2, 0)+","+"null"+");", httpContext.getMessage( "Emergente", ""), bttBtnllamaremergente_Jsonclick, 5, httpContext.getMessage( "Emergente", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOLLAMAREMERGENTE\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWco0013.htm");
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
         /* User Defined Control */
         ucDdo_grid.setProperty("Caption", Ddo_grid_Caption);
         ucDdo_grid.setProperty("ColumnIds", Ddo_grid_Columnids);
         ucDdo_grid.setProperty("ColumnsSortValues", Ddo_grid_Columnssortvalues);
         ucDdo_grid.setProperty("IncludeSortASC", Ddo_grid_Includesortasc);
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV36DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         wb_table2_62_ZY2( true) ;
      }
      else
      {
         wb_table2_62_ZY2( false) ;
      }
      return  ;
   }

   public void wb_table2_62_ZY2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_67_ZY2( true) ;
      }
      else
      {
         wb_table3_67_ZY2( false) ;
      }
      return  ;
   }

   public void wb_table3_67_ZY2e( boolean wbgen )
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
      if ( wbEnd == 39 )
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

   public void startZY2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Realizacion Pedidos", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupZY0( ) ;
   }

   public void wsZY2( )
   {
      startZY2( ) ;
      evtZY2( ) ;
   }

   public void evtZY2( )
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
                           e12ZY2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINARLINEA.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e13ZY2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e14ZY2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOLLAMAREMERGENTE'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoLlamarEmergente' */
                           e15ZY2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e16ZY2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e17ZY2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           AV73Webwco0013ds_1_tfprdnum = AV30TFPrdNum ;
                           AV74Webwco0013ds_2_tfprdnum_sel = AV31TFPrdNum_Sel ;
                           AV75Webwco0013ds_3_tfprdnom = AV33TFPrdNom ;
                           AV76Webwco0013ds_4_tfprdnom_sel = AV34TFPrdNom_Sel ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_39_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_392( ) ;
                           AV51EliminarLinea = httpContext.cgiGet( edtavEliminarlinea_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavEliminarlinea_Internalname, "Bitmap", ((GXutil.strcmp("", AV51EliminarLinea)==0) ? AV77Eliminarlinea_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV51EliminarLinea))), !bGXsfl_39_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavEliminarlinea_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV51EliminarLinea), true);
                           A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
                           A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPrepeduni_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPrepeduni_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPREPEDUNI");
                              GX_FocusControl = edtavPrepeduni_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV15PrePedUni = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavPrepeduni_Internalname, GXutil.ltrimstr( AV15PrePedUni, 9, 2));
                           }
                           else
                           {
                              AV15PrePedUni = localUtil.ctond( httpContext.cgiGet( edtavPrepeduni_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavPrepeduni_Internalname, GXutil.ltrimstr( AV15PrePedUni, 9, 2));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPrepedpre_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPrepedpre_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPREPEDPRE");
                              GX_FocusControl = edtavPrepedpre_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV16PrePedPre = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavPrepedpre_Internalname, GXutil.ltrimstr( AV16PrePedPre, 12, 5));
                           }
                           else
                           {
                              AV16PrePedPre = localUtil.ctond( httpContext.cgiGet( edtavPrepedpre_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavPrepedpre_Internalname, GXutil.ltrimstr( AV16PrePedPre, 12, 5));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPrepeddto_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPrepeddto_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPREPEDDTO");
                              GX_FocusControl = edtavPrepeddto_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV17PrePedDto = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavPrepeddto_Internalname, GXutil.ltrimstr( AV17PrePedDto, 5, 2));
                           }
                           else
                           {
                              AV17PrePedDto = localUtil.ctond( httpContext.cgiGet( edtavPrepeddto_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavPrepeddto_Internalname, GXutil.ltrimstr( AV17PrePedDto, 5, 2));
                           }
                           if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavValor_Internalname)), DecimalUtil.stringToDec("-99999999.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavValor_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVALOR");
                              GX_FocusControl = edtavValor_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV41Valor = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavValor_Internalname, GXutil.ltrimstr( AV41Valor, 12, 2));
                           }
                           else
                           {
                              AV41Valor = localUtil.ctond( httpContext.cgiGet( edtavValor_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavValor_Internalname, GXutil.ltrimstr( AV41Valor, 12, 2));
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
                                 e18ZY2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e19ZY2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e20ZY2 ();
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

   public void weZY2( )
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

   public void paZY2( )
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
            GX_FocusControl = edtavValortotal_Internalname ;
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
      subsflControlProps_392( ) ;
      while ( nGXsfl_39_idx <= nRC_GXsfl_39 )
      {
         sendrow_392( ) ;
         nGXsfl_39_idx = ((subGrid_Islastpage==1)&&(nGXsfl_39_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_39_idx+1) ;
         sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_392( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV38Emprcod ,
                                 int AV39PrePrvNum ,
                                 String AV30TFPrdNum ,
                                 String AV31TFPrdNum_Sel ,
                                 String AV33TFPrdNom ,
                                 String AV34TFPrdNom_Sel ,
                                 String AV81Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 String AV40PrvNom ,
                                 java.math.BigDecimal AV15PrePedUni ,
                                 java.math.BigDecimal AV16PrePedPre ,
                                 java.math.BigDecimal AV17PrePedDto ,
                                 short AV67Moda21 ,
                                 String A396EmprCod ,
                                 int A756PrePrvNum )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e19ZY2 ();
      GRID_nCurrentRecord = 0 ;
      rfZY2( ) ;
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
      GRID_nFirstRecordOnPage = 0 ;
      GRID_nCurrentRecord = 0 ;
      GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_39_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      send_integrity_hashes( ) ;
      rfZY2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV81Pgmname = "WebWco0013" ;
      Gx_err = (short)(0) ;
      edtavPrvnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrvnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrvnom_Enabled), 5, 0), true);
      edtavValor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValor_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavValortotal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValortotal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValortotal_Enabled), 5, 0), true);
   }

   public void rfZY2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(39) ;
      /* Execute user event: Refresh */
      e19ZY2 ();
      nGXsfl_39_idx = (int)(1+GRID_nFirstRecordOnPage) ;
      sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_392( ) ;
      bGXsfl_39_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWithSelection WorkWith");
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
         subsflControlProps_392( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV74Webwco0013ds_2_tfprdnum_sel ,
                                              AV73Webwco0013ds_1_tfprdnum ,
                                              AV76Webwco0013ds_4_tfprdnom_sel ,
                                              AV75Webwco0013ds_3_tfprdnom ,
                                              A719PrdNum ,
                                              A718PrdNom ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              Integer.valueOf(A658PedCod) ,
                                              AV38Emprcod ,
                                              Integer.valueOf(AV39PrePrvNum) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A756PrePrvNum) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                              }
         });
         lV73Webwco0013ds_1_tfprdnum = GXutil.padr( GXutil.rtrim( AV73Webwco0013ds_1_tfprdnum), 6, "%") ;
         lV75Webwco0013ds_3_tfprdnom = GXutil.padr( GXutil.rtrim( AV75Webwco0013ds_3_tfprdnom), 26, "%") ;
         /* Using cursor H00ZY2 */
         pr_default.execute(0, new Object[] {AV38Emprcod, Integer.valueOf(AV39PrePrvNum), lV73Webwco0013ds_1_tfprdnum, AV74Webwco0013ds_2_tfprdnum_sel, lV75Webwco0013ds_3_tfprdnom, AV76Webwco0013ds_4_tfprdnom_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_39_idx = (int)(1+GRID_nFirstRecordOnPage) ;
         sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_392( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A658PedCod = H00ZY2_A658PedCod[0] ;
            n658PedCod = H00ZY2_n658PedCod[0] ;
            A755PrePedUni = H00ZY2_A755PrePedUni[0] ;
            n755PrePedUni = H00ZY2_n755PrePedUni[0] ;
            A753PrePedPre = H00ZY2_A753PrePedPre[0] ;
            n753PrePedPre = H00ZY2_n753PrePedPre[0] ;
            A752PrePedDto = H00ZY2_A752PrePedDto[0] ;
            n752PrePedDto = H00ZY2_n752PrePedDto[0] ;
            A396EmprCod = H00ZY2_A396EmprCod[0] ;
            A756PrePrvNum = H00ZY2_A756PrePrvNum[0] ;
            A718PrdNom = H00ZY2_A718PrdNom[0] ;
            A719PrdNum = H00ZY2_A719PrdNum[0] ;
            A718PrdNom = H00ZY2_A718PrdNom[0] ;
            e20ZY2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(39) ;
         wbZY0( ) ;
      }
      bGXsfl_39_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesZY2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV81Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV81Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "PREPRVNUM", GXutil.ltrim( localUtil.ntoc( A756PrePrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PREPRVNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A756PrePrvNum), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV67Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV67Moda21), "ZZZ9")));
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
      AV73Webwco0013ds_1_tfprdnum = AV30TFPrdNum ;
      AV74Webwco0013ds_2_tfprdnum_sel = AV31TFPrdNum_Sel ;
      AV75Webwco0013ds_3_tfprdnom = AV33TFPrdNom ;
      AV76Webwco0013ds_4_tfprdnom_sel = AV34TFPrdNom_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV74Webwco0013ds_2_tfprdnum_sel ,
                                           AV73Webwco0013ds_1_tfprdnum ,
                                           AV76Webwco0013ds_4_tfprdnom_sel ,
                                           AV75Webwco0013ds_3_tfprdnom ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           Integer.valueOf(A658PedCod) ,
                                           AV38Emprcod ,
                                           Integer.valueOf(AV39PrePrvNum) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A756PrePrvNum) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV73Webwco0013ds_1_tfprdnum = GXutil.padr( GXutil.rtrim( AV73Webwco0013ds_1_tfprdnum), 6, "%") ;
      lV75Webwco0013ds_3_tfprdnom = GXutil.padr( GXutil.rtrim( AV75Webwco0013ds_3_tfprdnom), 26, "%") ;
      /* Using cursor H00ZY3 */
      pr_default.execute(1, new Object[] {AV38Emprcod, Integer.valueOf(AV39PrePrvNum), lV73Webwco0013ds_1_tfprdnum, AV74Webwco0013ds_2_tfprdnum_sel, lV75Webwco0013ds_3_tfprdnom, AV76Webwco0013ds_4_tfprdnom_sel});
      GRID_nRecordCount = H00ZY3_AGRID_nRecordCount[0] ;
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
      AV73Webwco0013ds_1_tfprdnum = AV30TFPrdNum ;
      AV74Webwco0013ds_2_tfprdnum_sel = AV31TFPrdNum_Sel ;
      AV75Webwco0013ds_3_tfprdnom = AV33TFPrdNom ;
      AV76Webwco0013ds_4_tfprdnom_sel = AV34TFPrdNom_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV38Emprcod, AV39PrePrvNum, AV30TFPrdNum, AV31TFPrdNum_Sel, AV33TFPrdNom, AV34TFPrdNom_Sel, AV81Pgmname, AV12OrderedBy, AV13OrderedDsc, AV40PrvNom, AV15PrePedUni, AV16PrePedPre, AV17PrePedDto, AV67Moda21, A396EmprCod, A756PrePrvNum) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV73Webwco0013ds_1_tfprdnum = AV30TFPrdNum ;
      AV74Webwco0013ds_2_tfprdnum_sel = AV31TFPrdNum_Sel ;
      AV75Webwco0013ds_3_tfprdnom = AV33TFPrdNom ;
      AV76Webwco0013ds_4_tfprdnom_sel = AV34TFPrdNom_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV38Emprcod, AV39PrePrvNum, AV30TFPrdNum, AV31TFPrdNum_Sel, AV33TFPrdNom, AV34TFPrdNom_Sel, AV81Pgmname, AV12OrderedBy, AV13OrderedDsc, AV40PrvNom, AV15PrePedUni, AV16PrePedPre, AV17PrePedDto, AV67Moda21, A396EmprCod, A756PrePrvNum) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV73Webwco0013ds_1_tfprdnum = AV30TFPrdNum ;
      AV74Webwco0013ds_2_tfprdnum_sel = AV31TFPrdNum_Sel ;
      AV75Webwco0013ds_3_tfprdnom = AV33TFPrdNom ;
      AV76Webwco0013ds_4_tfprdnom_sel = AV34TFPrdNom_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV38Emprcod, AV39PrePrvNum, AV30TFPrdNum, AV31TFPrdNum_Sel, AV33TFPrdNom, AV34TFPrdNom_Sel, AV81Pgmname, AV12OrderedBy, AV13OrderedDsc, AV40PrvNom, AV15PrePedUni, AV16PrePedPre, AV17PrePedDto, AV67Moda21, A396EmprCod, A756PrePrvNum) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV73Webwco0013ds_1_tfprdnum = AV30TFPrdNum ;
      AV74Webwco0013ds_2_tfprdnum_sel = AV31TFPrdNum_Sel ;
      AV75Webwco0013ds_3_tfprdnom = AV33TFPrdNom ;
      AV76Webwco0013ds_4_tfprdnom_sel = AV34TFPrdNom_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV38Emprcod, AV39PrePrvNum, AV30TFPrdNum, AV31TFPrdNum_Sel, AV33TFPrdNom, AV34TFPrdNom_Sel, AV81Pgmname, AV12OrderedBy, AV13OrderedDsc, AV40PrvNom, AV15PrePedUni, AV16PrePedPre, AV17PrePedDto, AV67Moda21, A396EmprCod, A756PrePrvNum) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV73Webwco0013ds_1_tfprdnum = AV30TFPrdNum ;
      AV74Webwco0013ds_2_tfprdnum_sel = AV31TFPrdNum_Sel ;
      AV75Webwco0013ds_3_tfprdnom = AV33TFPrdNom ;
      AV76Webwco0013ds_4_tfprdnom_sel = AV34TFPrdNom_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV38Emprcod, AV39PrePrvNum, AV30TFPrdNum, AV31TFPrdNum_Sel, AV33TFPrdNom, AV34TFPrdNom_Sel, AV81Pgmname, AV12OrderedBy, AV13OrderedDsc, AV40PrvNom, AV15PrePedUni, AV16PrePedPre, AV17PrePedDto, AV67Moda21, A396EmprCod, A756PrePrvNum) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV81Pgmname = "WebWco0013" ;
      Gx_err = (short)(0) ;
      edtavPrvnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrvnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrvnom_Enabled), 5, 0), true);
      edtavValor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValor_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavValortotal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValortotal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValortotal_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strupZY0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e18ZY2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV36DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_39 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_39"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV43FlagErr = (short)(localUtil.ctol( httpContext.cgiGet( "vFLAGERR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV54PrdNum_Selected = httpContext.cgiGet( "vPRDNUM_SELECTED") ;
         A756PrePrvNum = (int)(localUtil.ctol( httpContext.cgiGet( "PREPRVNUM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV53PrePrvNum_Selected = (int)(localUtil.ctol( httpContext.cgiGet( "vPREPRVNUM_SELECTED"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
         AV52EmprCod_Selected = httpContext.cgiGet( "vEMPRCOD_SELECTED") ;
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
         Ddo_grid_Selectedvalue_set = httpContext.cgiGet( "DDO_GRID_Selectedvalue_set") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( "DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( "DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( "DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( "DDO_GRID_Includesortasc") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( "DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( "DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( "DDO_GRID_Filtertype") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( "DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( "DDO_GRID_Datalisttype") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( "DDO_GRID_Datalistproc") ;
         Dvelop_confirmpanel_eliminarlinea_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Title") ;
         Dvelop_confirmpanel_eliminarlinea_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Confirmationtext") ;
         Dvelop_confirmpanel_eliminarlinea_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminarlinea_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminarlinea_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminarlinea_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminarlinea_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Confirmtype") ;
         Dvelop_confirmpanel_btnconfirmar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Title") ;
         Dvelop_confirmpanel_btnconfirmar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmationtext") ;
         Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_btnconfirmar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Infinitescrolling = httpContext.cgiGet( "GRID_EMPOWERER_Infinitescrolling") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Dvelop_confirmpanel_eliminarlinea_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Result") ;
         Dvelop_confirmpanel_btnconfirmar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Result") ;
         /* Read variables values. */
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavValortotal_Internalname)), DecimalUtil.stringToDec("-99999999.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavValortotal_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVALORTOTAL");
            GX_FocusControl = edtavValortotal_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV42ValorTotal = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42ValorTotal", GXutil.ltrimstr( AV42ValorTotal, 12, 2));
         }
         else
         {
            AV42ValorTotal = localUtil.ctond( httpContext.cgiGet( edtavValortotal_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42ValorTotal", GXutil.ltrimstr( AV42ValorTotal, 12, 2));
         }
         /* Read subfile selected row values. */
         nGXsfl_39_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_392( ) ;
         if ( nGXsfl_39_idx > 0 )
         {
            AV51EliminarLinea = httpContext.cgiGet( edtavEliminarlinea_Internalname) ;
            A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
            A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPrepeduni_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPrepeduni_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPREPEDUNI");
               GX_FocusControl = edtavPrepeduni_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV15PrePedUni = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, edtavPrepeduni_Internalname, GXutil.ltrimstr( AV15PrePedUni, 9, 2));
            }
            else
            {
               AV15PrePedUni = localUtil.ctond( httpContext.cgiGet( edtavPrepeduni_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavPrepeduni_Internalname, GXutil.ltrimstr( AV15PrePedUni, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPrepedpre_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPrepedpre_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPREPEDPRE");
               GX_FocusControl = edtavPrepedpre_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV16PrePedPre = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, edtavPrepedpre_Internalname, GXutil.ltrimstr( AV16PrePedPre, 12, 5));
            }
            else
            {
               AV16PrePedPre = localUtil.ctond( httpContext.cgiGet( edtavPrepedpre_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavPrepedpre_Internalname, GXutil.ltrimstr( AV16PrePedPre, 12, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPrepeddto_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPrepeddto_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPREPEDDTO");
               GX_FocusControl = edtavPrepeddto_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV17PrePedDto = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, edtavPrepeddto_Internalname, GXutil.ltrimstr( AV17PrePedDto, 5, 2));
            }
            else
            {
               AV17PrePedDto = localUtil.ctond( httpContext.cgiGet( edtavPrepeddto_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavPrepeddto_Internalname, GXutil.ltrimstr( AV17PrePedDto, 5, 2));
            }
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavValor_Internalname)), DecimalUtil.stringToDec("-99999999.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavValor_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVALOR");
               GX_FocusControl = edtavValor_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV41Valor = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, edtavValor_Internalname, GXutil.ltrimstr( AV41Valor, 12, 2));
            }
            else
            {
               AV41Valor = localUtil.ctond( httpContext.cgiGet( edtavValor_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavValor_Internalname, GXutil.ltrimstr( AV41Valor, 12, 2));
            }
         }
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
      e18ZY2 ();
      if (returnInSub) return;
   }

   public void e18ZY2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_int1 = (byte)(AV67Moda21) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV38Emprcod, httpContext.getMessage( "MODA21", ""), GXv_int2) ;
      webwco0013_impl.this.GXt_int1 = GXv_int2[0] ;
      AV67Moda21 = GXt_int1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67Moda21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV67Moda21), "ZZZ9")));
      GXt_char3 = AV70Station ;
      GXv_char4[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      webwco0013_impl.this.GXt_char3 = GXv_char4[0] ;
      AV70Station = GXt_char3 ;
      GXv_char4[0] = AV38Emprcod ;
      GXv_char5[0] = AV71Emprnom ;
      GXv_char6[0] = AV72Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV70Station, GXv_char4, GXv_char5, GXv_char6) ;
      webwco0013_impl.this.AV38Emprcod = GXv_char4[0] ;
      webwco0013_impl.this.AV71Emprnom = GXv_char5[0] ;
      webwco0013_impl.this.AV72Usurcod = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Emprcod", AV38Emprcod);
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if (returnInSub) return;
      subGrid_Rows = 50 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( "Realizacion Pedidos", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV12OrderedBy < 1 )
      {
         AV12OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = AV36DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] ;
      AV36DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
   }

   public void e19ZY2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext9[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV6WWPContext = GXv_SdtWWPContext9[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'TOTAL' */
      S162 ();
      if (returnInSub) return;
      AV73Webwco0013ds_1_tfprdnum = AV30TFPrdNum ;
      AV74Webwco0013ds_2_tfprdnum_sel = AV31TFPrdNum_Sel ;
      AV75Webwco0013ds_3_tfprdnom = AV33TFPrdNom ;
      AV76Webwco0013ds_4_tfprdnom_sel = AV34TFPrdNom_Sel ;
      /*  Sending Event outputs  */
   }

   public void e12ZY2( )
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
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNum") == 0 )
         {
            AV30TFPrdNum = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFPrdNum", AV30TFPrdNum);
            AV31TFPrdNum_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFPrdNum_Sel", AV31TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNom") == 0 )
         {
            AV33TFPrdNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFPrdNom", AV33TFPrdNom);
            AV34TFPrdNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFPrdNom_Sel", AV34TFPrdNom_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e20ZY2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      edtavEliminarlinea_gximage = "DeleteRow" ;
      AV51EliminarLinea = context.getHttpContext().getImagePath( "28da6cce-b945-4cc5-8e39-a91759ac9224", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavEliminarlinea_Internalname, AV51EliminarLinea);
      AV77Eliminarlinea_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "28da6cce-b945-4cc5-8e39-a91759ac9224", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      edtavEliminarlinea_Tooltiptext = "" ;
      AV15PrePedUni = A755PrePedUni ;
      httpContext.ajax_rsp_assign_attri("", false, edtavPrepeduni_Internalname, GXutil.ltrimstr( AV15PrePedUni, 9, 2));
      edtavPrepeduni_Backcolor = GXutil.getColor( 0, 255, 0) ;
      edtavPrepeduni_Forecolor = GXutil.getColor( 0, 0, 0) ;
      AV16PrePedPre = A753PrePedPre ;
      httpContext.ajax_rsp_assign_attri("", false, edtavPrepedpre_Internalname, GXutil.ltrimstr( AV16PrePedPre, 12, 5));
      edtavPrepedpre_Backcolor = GXutil.getColor( 0, 255, 0) ;
      edtavPrepedpre_Forecolor = GXutil.getColor( 0, 0, 0) ;
      AV17PrePedDto = A752PrePedDto ;
      httpContext.ajax_rsp_assign_attri("", false, edtavPrepeddto_Internalname, GXutil.ltrimstr( AV17PrePedDto, 5, 2));
      edtavPrepeddto_Backcolor = GXutil.getColor( 0, 255, 0) ;
      edtavPrepeddto_Forecolor = GXutil.getColor( 0, 0, 0) ;
      AV41Valor = GXutil.roundDecimal( (AV15PrePedUni.multiply(AV16PrePedPre)).multiply((DecimalUtil.doubleToDec(1).subtract((AV17PrePedDto.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))))), 2) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavValor_Internalname, GXutil.ltrimstr( AV41Valor, 12, 2));
      if ( ! ( GXutil.roundDecimal( (AV15PrePedUni.multiply(AV16PrePedPre)).multiply((DecimalUtil.doubleToDec(1).subtract((AV17PrePedDto.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))))), 2).doubleValue() > 0 ) )
      {
         edtavValor_Backcolor = GXutil.getColor( 255, 255, 0) ;
         edtavValor_Forecolor = GXutil.getColor( 0, 0, 0) ;
      }
      else
      {
         edtavValor_Backcolor = GXutil.getColor( 0, 255, 0) ;
         edtavValor_Forecolor = GXutil.getColor( 0, 0, 0) ;
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(39) ;
      }
      sendrow_392( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_39_Refreshing )
      {
         httpContext.doAjaxLoad(39, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e15ZY2( )
   {
      /* 'DoLlamarEmergente' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.webseleccion", new String[] {GXutil.URLEncode(GXutil.rtrim(AV38Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV45PedCod,8,0)),GXutil.URLEncode(DecimalUtil.decToString(AV50PedTot))}, new String[] {"EmprCod","PedCod","PedTot"}) , new Object[] {"AV45PedCod","AV50PedTot"});
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e13ZY2( )
   {
      /* Dvelop_confirmpanel_eliminarlinea_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminarlinea_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ELIMINARLINEA' */
         S172 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e14ZY2( )
   {
      /* Dvelop_confirmpanel_btnconfirmar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_btnconfirmar_Result, "Yes") == 0 )
      {
         GXv_int10[0] = AV45PedCod ;
         GXv_char6[0] = "1" ;
         GXv_date11[0] = AV46FecEnt ;
         new app.pcabped(remoteHandle, context).execute( AV38Emprcod, AV39PrePrvNum, GXv_int10, GXv_char6, GXv_date11) ;
         webwco0013_impl.this.AV45PedCod = GXv_int10[0] ;
         webwco0013_impl.this.AV46FecEnt = GXv_date11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45PedCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV46FecEnt", localUtil.format(AV46FecEnt, "99/99/99"));
         /* Start For Each Line */
         nRC_GXsfl_39 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_39"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_39_fel_idx = 0 ;
         while ( nGXsfl_39_fel_idx < nRC_GXsfl_39 )
         {
            nGXsfl_39_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_39_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_39_fel_idx+1) ;
            sGXsfl_39_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_392( ) ;
            AV51EliminarLinea = httpContext.cgiGet( edtavEliminarlinea_Internalname) ;
            A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
            A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPrepeduni_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPrepeduni_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPREPEDUNI");
               GX_FocusControl = edtavPrepeduni_Internalname ;
               wbErr = true ;
               AV15PrePedUni = DecimalUtil.ZERO ;
            }
            else
            {
               AV15PrePedUni = localUtil.ctond( httpContext.cgiGet( edtavPrepeduni_Internalname)) ;
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPrepedpre_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPrepedpre_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPREPEDPRE");
               GX_FocusControl = edtavPrepedpre_Internalname ;
               wbErr = true ;
               AV16PrePedPre = DecimalUtil.ZERO ;
            }
            else
            {
               AV16PrePedPre = localUtil.ctond( httpContext.cgiGet( edtavPrepedpre_Internalname)) ;
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPrepeddto_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPrepeddto_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPREPEDDTO");
               GX_FocusControl = edtavPrepeddto_Internalname ;
               wbErr = true ;
               AV17PrePedDto = DecimalUtil.ZERO ;
            }
            else
            {
               AV17PrePedDto = localUtil.ctond( httpContext.cgiGet( edtavPrepeddto_Internalname)) ;
            }
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavValor_Internalname)), DecimalUtil.stringToDec("-99999999.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavValor_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVALOR");
               GX_FocusControl = edtavValor_Internalname ;
               wbErr = true ;
               AV41Valor = DecimalUtil.ZERO ;
            }
            else
            {
               AV41Valor = localUtil.ctond( httpContext.cgiGet( edtavValor_Internalname)) ;
            }
            GXv_decimal12[0] = AV15PrePedUni ;
            GXv_int10[0] = AV45PedCod ;
            new app.pmodprp(remoteHandle, context).execute( AV38Emprcod, AV39PrePrvNum, A719PrdNum, GXv_decimal12, GXv_int10) ;
            webwco0013_impl.this.AV15PrePedUni = GXv_decimal12[0] ;
            webwco0013_impl.this.AV45PedCod = GXv_int10[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtavPrepeduni_Internalname, GXutil.ltrimstr( AV15PrePedUni, 9, 2));
            httpContext.ajax_rsp_assign_attri("", false, "AV45PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45PedCod), 8, 0));
            GXv_decimal12[0] = AV15PrePedUni ;
            new app.pmodpen(remoteHandle, context).execute( AV38Emprcod, A719PrdNum, GXv_decimal12) ;
            webwco0013_impl.this.AV15PrePedUni = GXv_decimal12[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtavPrepeduni_Internalname, GXutil.ltrimstr( AV15PrePedUni, 9, 2));
            AV48PedFecPEn = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48PedFecPEn", localUtil.format(AV48PedFecPEn, "99/99/99"));
            AV49PedLinObs = " " ;
            GXv_int10[0] = AV45PedCod ;
            GXv_char6[0] = A719PrdNum ;
            GXv_decimal12[0] = AV15PrePedUni ;
            GXv_decimal13[0] = AV16PrePedPre ;
            GXv_decimal14[0] = AV17PrePedDto ;
            GXv_date11[0] = AV48PedFecPEn ;
            GXv_char5[0] = AV49PedLinObs ;
            new app.plinped(remoteHandle, context).execute( AV38Emprcod, GXv_int10, GXv_char6, GXv_decimal12, GXv_decimal13, GXv_decimal14, GXv_date11, GXv_char5) ;
            webwco0013_impl.this.AV45PedCod = GXv_int10[0] ;
            webwco0013_impl.this.A719PrdNum = GXv_char6[0] ;
            webwco0013_impl.this.AV15PrePedUni = GXv_decimal12[0] ;
            webwco0013_impl.this.AV16PrePedPre = GXv_decimal13[0] ;
            webwco0013_impl.this.AV17PrePedDto = GXv_decimal14[0] ;
            webwco0013_impl.this.AV48PedFecPEn = GXv_date11[0] ;
            webwco0013_impl.this.AV49PedLinObs = GXv_char5[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45PedCod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, edtavPrepeduni_Internalname, GXutil.ltrimstr( AV15PrePedUni, 9, 2));
            httpContext.ajax_rsp_assign_attri("", false, edtavPrepedpre_Internalname, GXutil.ltrimstr( AV16PrePedPre, 12, 5));
            httpContext.ajax_rsp_assign_attri("", false, edtavPrepeddto_Internalname, GXutil.ltrimstr( AV17PrePedDto, 5, 2));
            httpContext.ajax_rsp_assign_attri("", false, "AV48PedFecPEn", localUtil.format(AV48PedFecPEn, "99/99/99"));
            AV50PedTot = AV50PedTot.add((GXutil.roundDecimal( (AV15PrePedUni.multiply(AV16PrePedPre)).multiply((DecimalUtil.doubleToDec(1).subtract((AV17PrePedDto.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))))), 2))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50PedTot", GXutil.ltrimstr( AV50PedTot, 12, 2));
            /* End For Each Line */
         }
         if ( nGXsfl_39_fel_idx == 0 )
         {
            nGXsfl_39_idx = 1 ;
            sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_392( ) ;
         }
         nGXsfl_39_fel_idx = 1 ;
         httpContext.popup(formatLink("app.tpedobs", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(AV38Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV45PedCod,8,0))}, new String[] {"Mode","EmprCod","PedCod"}) , new Object[] {});
         httpContext.popup(formatLink("app.comprasquimicos.tpedido", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(AV38Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV45PedCod,8,0))}, new String[] {"Mode","EmprCod","PedCod"}) , new Object[] {});
         if ( AV67Moda21 == 1 )
         {
            httpContext.popup(formatLink("app.rmod001", new String[] {GXutil.URLEncode(GXutil.rtrim(AV38Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV45PedCod,8,0)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(DecimalUtil.decToString(AV50PedTot))}, new String[] {"EmprCod","PedCod","ImpCod","TotPed"}) , new Object[] {"","AV50PedTot"});
         }
         else
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Formato NO definido", ""));
         }
         Gx_msg = httpContext.getMessage( "Generado el pedido Nº ", "") + GXutil.str( AV45PedCod, 8, 0) ;
         httpContext.GX_msglist.addItem(Gx_msg);
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      /*  Sending Event outputs  */
   }

   public void e16ZY2( )
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

   public void e17ZY2( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.webwlinpr2", new String[] {GXutil.URLEncode(GXutil.rtrim(AV38Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV39PrePrvNum,6,0)),GXutil.URLEncode(GXutil.rtrim(AV40PrvNom))}, new String[] {"Emprcod","PrvNum","PrvNom"}) , new Object[] {"AV38Emprcod","AV39PrePrvNum","AV40PrvNom"});
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S172( )
   {
      /* 'DO ELIMINARLINEA' Routine */
      returnInSub = false ;
      GXv_char6[0] = AV38Emprcod ;
      GXv_int10[0] = AV39PrePrvNum ;
      GXv_char5[0] = A719PrdNum ;
      new app.pelipre(remoteHandle, context).execute( GXv_char6, GXv_int10, GXv_char5) ;
      webwco0013_impl.this.AV38Emprcod = GXv_char6[0] ;
      webwco0013_impl.this.AV39PrePrvNum = GXv_int10[0] ;
      webwco0013_impl.this.A719PrdNum = GXv_char5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Emprcod", AV38Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV39PrePrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39PrePrvNum), 6, 0));
      new app.pcommit(remoteHandle, context).execute( ) ;
      GRID_nFirstRecordOnPage = 0 ;
      GRID_nCurrentRecord = 0 ;
      GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_39_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      gxgrgrid_refresh( subGrid_Rows, AV38Emprcod, AV39PrePrvNum, AV30TFPrdNum, AV31TFPrdNum_Sel, AV33TFPrdNom, AV34TFPrdNom_Sel, AV81Pgmname, AV12OrderedBy, AV13OrderedDsc, AV40PrvNom, AV15PrePedUni, AV16PrePedPre, AV17PrePedDto, AV67Moda21, A396EmprCod, A756PrePrvNum) ;
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV25Session.getValue(AV81Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV81Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV25Session.getValue(AV81Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      AV82GXV1 = 1 ;
      while ( AV82GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV82GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV30TFPrdNum = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFPrdNum", AV30TFPrdNum);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV31TFPrdNum_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFPrdNum_Sel", AV31TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV33TFPrdNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFPrdNom", AV33TFPrdNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV34TFPrdNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFPrdNom_Sel", AV34TFPrdNom_Sel);
         }
         AV82GXV1 = (int)(AV82GXV1+1) ;
      }
      GXt_char3 = "" ;
      GXv_char6[0] = GXt_char3 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV31TFPrdNum_Sel)==0), AV31TFPrdNum_Sel, GXv_char6) ;
      webwco0013_impl.this.GXt_char3 = GXv_char6[0] ;
      GXt_char15 = "" ;
      GXv_char5[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFPrdNom_Sel)==0), AV34TFPrdNom_Sel, GXv_char5) ;
      webwco0013_impl.this.GXt_char15 = GXv_char5[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char3+"|"+GXt_char15 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char15 = "" ;
      GXv_char6[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV30TFPrdNum)==0), AV30TFPrdNum, GXv_char6) ;
      webwco0013_impl.this.GXt_char15 = GXv_char6[0] ;
      GXt_char3 = "" ;
      GXv_char5[0] = GXt_char3 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFPrdNom)==0), AV33TFPrdNom, GXv_char5) ;
      webwco0013_impl.this.GXt_char3 = GXv_char5[0] ;
      Ddo_grid_Filteredtext_set = GXt_char15+"|"+GXt_char3 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV25Session.getValue(AV81Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFPRDNUM", "", !(GXutil.strcmp("", AV30TFPrdNum)==0), (short)(0), AV30TFPrdNum, "", !(GXutil.strcmp("", AV31TFPrdNum_Sel)==0), AV31TFPrdNum_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFPRDNOM", "", !(GXutil.strcmp("", AV33TFPrdNom)==0), (short)(0), AV33TFPrdNom, "", !(GXutil.strcmp("", AV34TFPrdNom_Sel)==0), AV34TFPrdNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      if ( ! (GXutil.strcmp("", AV38Emprcod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV38Emprcod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV39PrePrvNum) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PREPRVNUM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV39PrePrvNum, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV40PrvNom)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PRVNOM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV40PrvNom );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV81Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV81Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TPREPED" );
      AV25Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      divTableinvisible_Visible = (((1==0)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, divTableinvisible_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTableinvisible_Visible), 5, 0), true);
   }

   public void S162( )
   {
      /* 'TOTAL' Routine */
      returnInSub = false ;
      AV42ValorTotal = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42ValorTotal", GXutil.ltrimstr( AV42ValorTotal, 12, 2));
      /* Start For Each Line */
      nRC_GXsfl_39 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_39"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_39_fel_idx = 0 ;
      while ( nGXsfl_39_fel_idx < nRC_GXsfl_39 )
      {
         nGXsfl_39_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_39_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_39_fel_idx+1) ;
         sGXsfl_39_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_392( ) ;
         AV51EliminarLinea = httpContext.cgiGet( edtavEliminarlinea_Internalname) ;
         A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
         A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPrepeduni_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPrepeduni_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPREPEDUNI");
            GX_FocusControl = edtavPrepeduni_Internalname ;
            wbErr = true ;
            AV15PrePedUni = DecimalUtil.ZERO ;
         }
         else
         {
            AV15PrePedUni = localUtil.ctond( httpContext.cgiGet( edtavPrepeduni_Internalname)) ;
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPrepedpre_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPrepedpre_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPREPEDPRE");
            GX_FocusControl = edtavPrepedpre_Internalname ;
            wbErr = true ;
            AV16PrePedPre = DecimalUtil.ZERO ;
         }
         else
         {
            AV16PrePedPre = localUtil.ctond( httpContext.cgiGet( edtavPrepedpre_Internalname)) ;
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPrepeddto_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPrepeddto_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPREPEDDTO");
            GX_FocusControl = edtavPrepeddto_Internalname ;
            wbErr = true ;
            AV17PrePedDto = DecimalUtil.ZERO ;
         }
         else
         {
            AV17PrePedDto = localUtil.ctond( httpContext.cgiGet( edtavPrepeddto_Internalname)) ;
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavValor_Internalname)), DecimalUtil.stringToDec("-99999999.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavValor_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVALOR");
            GX_FocusControl = edtavValor_Internalname ;
            wbErr = true ;
            AV41Valor = DecimalUtil.ZERO ;
         }
         else
         {
            AV41Valor = localUtil.ctond( httpContext.cgiGet( edtavValor_Internalname)) ;
         }
         AV42ValorTotal = AV42ValorTotal.add((GXutil.roundDecimal( (AV15PrePedUni.multiply(AV16PrePedPre)).multiply((DecimalUtil.doubleToDec(1).subtract((AV17PrePedDto.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))))), 2))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42ValorTotal", GXutil.ltrimstr( AV42ValorTotal, 12, 2));
         /* End For Each Line */
      }
      if ( nGXsfl_39_fel_idx == 0 )
      {
         nGXsfl_39_idx = 1 ;
         sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_392( ) ;
      }
      nGXsfl_39_fel_idx = 1 ;
   }

   public void S182( )
   {
      /* 'ACTUALIZAR VALORES' Routine */
      returnInSub = false ;
      AV41Valor = GXutil.roundDecimal( (AV15PrePedUni.multiply(AV16PrePedPre)).multiply((DecimalUtil.doubleToDec(1).subtract((AV17PrePedDto.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))))), 2) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavValor_Internalname, GXutil.ltrimstr( AV41Valor, 12, 2));
      /* Execute user subroutine: 'AJUSTAR BACKCOLOR &VALOR' */
      S192 ();
      if (returnInSub) return;
   }

   public void S192( )
   {
      /* 'AJUSTAR BACKCOLOR &VALOR' Routine */
      returnInSub = false ;
      edtavValor_Backcolor = (!(GXutil.roundDecimal( (AV15PrePedUni.multiply(AV16PrePedPre)).multiply((DecimalUtil.doubleToDec(1).subtract((AV17PrePedDto.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))))), 2).doubleValue()>0) ? GXutil.getColor( 255, 255, 0) : GXutil.getColor( 0, 255, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValor_Internalname, "Backcolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValor_Backcolor), 9, 0), !bGXsfl_39_Refreshing);
   }

   public void wb_table3_67_ZY2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_btnconfirmar_Internalname, tblTabledvelop_confirmpanel_btnconfirmar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_btnconfirmar.setProperty("Title", Dvelop_confirmpanel_btnconfirmar_Title);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("ConfirmationText", Dvelop_confirmpanel_btnconfirmar_Confirmationtext);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("YesButtonCaption", Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("NoButtonCaption", Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("YesButtonPosition", Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("ConfirmType", Dvelop_confirmpanel_btnconfirmar_Confirmtype);
         ucDvelop_confirmpanel_btnconfirmar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_btnconfirmar_Internalname, "DVELOP_CONFIRMPANEL_BTNCONFIRMARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_BTNCONFIRMARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_67_ZY2e( true) ;
      }
      else
      {
         wb_table3_67_ZY2e( false) ;
      }
   }

   public void wb_table2_62_ZY2( boolean wbgen )
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
         wb_table2_62_ZY2e( true) ;
      }
      else
      {
         wb_table2_62_ZY2e( false) ;
      }
   }

   public void wb_table1_27_ZY2( boolean wbgen )
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
         wb_table1_27_ZY2e( true) ;
      }
      else
      {
         wb_table1_27_ZY2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV38Emprcod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Emprcod", AV38Emprcod);
      AV39PrePrvNum = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39PrePrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39PrePrvNum), 6, 0));
      AV40PrvNom = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40PrvNom", AV40PrvNom);
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
      paZY2( ) ;
      wsZY2( ) ;
      weZY2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211613694", true, true);
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
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("webwco0013.js", "?20268211613694", false, true);
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

   public void subsflControlProps_392( )
   {
      edtavEliminarlinea_Internalname = "vELIMINARLINEA_"+sGXsfl_39_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_39_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_39_idx ;
      edtavPrepeduni_Internalname = "vPREPEDUNI_"+sGXsfl_39_idx ;
      edtavPrepedpre_Internalname = "vPREPEDPRE_"+sGXsfl_39_idx ;
      edtavPrepeddto_Internalname = "vPREPEDDTO_"+sGXsfl_39_idx ;
      edtavValor_Internalname = "vVALOR_"+sGXsfl_39_idx ;
   }

   public void subsflControlProps_fel_392( )
   {
      edtavEliminarlinea_Internalname = "vELIMINARLINEA_"+sGXsfl_39_fel_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_39_fel_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_39_fel_idx ;
      edtavPrepeduni_Internalname = "vPREPEDUNI_"+sGXsfl_39_fel_idx ;
      edtavPrepedpre_Internalname = "vPREPEDPRE_"+sGXsfl_39_fel_idx ;
      edtavPrepeddto_Internalname = "vPREPEDDTO_"+sGXsfl_39_fel_idx ;
      edtavValor_Internalname = "vVALOR_"+sGXsfl_39_fel_idx ;
   }

   public void sendrow_392( )
   {
      subsflControlProps_392( ) ;
      wbZY0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_39_idx - GRID_nFirstRecordOnPage <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_39_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridNoBorder WorkWithSelection WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_39_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Active Bitmap Variable */
         TempTags = " " + ((edtavEliminarlinea_Enabled!=0)&&(edtavEliminarlinea_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 40,'',false,'',39)\"" : " ") ;
         ClassString = "ActionBaseColorAttribute" + " " + ((GXutil.strcmp(edtavEliminarlinea_gximage, "")==0) ? "" : "GX_Image_"+edtavEliminarlinea_gximage+"_Class") ;
         StyleString = "" ;
         AV51EliminarLinea_IsBlob = (boolean)(((GXutil.strcmp("", AV51EliminarLinea)==0)&&(GXutil.strcmp("", AV77Eliminarlinea_GXI)==0))||!(GXutil.strcmp("", AV51EliminarLinea)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV51EliminarLinea)==0) ? AV77Eliminarlinea_GXI : httpContext.getResourceRelative(AV51EliminarLinea)) ;
         GridRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavEliminarlinea_Internalname,sImgUrl,"","","",context.getHttpContext().getTheme( ),Integer.valueOf(-1),Integer.valueOf(1),"",edtavEliminarlinea_Tooltiptext,Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),"px",Integer.valueOf(0),"px",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(7),edtavEliminarlinea_Jsonclick,"'"+""+"'"+",false,"+"'"+"e21zy2_client"+"'",StyleString,ClassString,"WWActionColumn","","","",""+TempTags,"","",Integer.valueOf(1),Boolean.valueOf(AV51EliminarLinea_IsBlob),Boolean.valueOf(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNom_Internalname,GXutil.rtrim( A718PrdNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavPrepeduni_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPrepeduni_Enabled!=0)&&(edtavPrepeduni_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 43,'',false,'"+sGXsfl_39_idx+"',39)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrepeduni_Internalname,GXutil.ltrim( localUtil.ntoc( AV15PrePedUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( AV15PrePedUni, "ZZZZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavPrepeduni_Enabled!=0)&&(edtavPrepeduni_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,43);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPrepeduni_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavPrepeduni_Forecolor)+";"+((edtavPrepeduni_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavPrepeduni_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavPrepedpre_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPrepedpre_Enabled!=0)&&(edtavPrepedpre_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 44,'',false,'"+sGXsfl_39_idx+"',39)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrepedpre_Internalname,GXutil.ltrim( localUtil.ntoc( AV16PrePedPre, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( AV16PrePedPre, "ZZZZZ9.999")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+((edtavPrepedpre_Enabled!=0)&&(edtavPrepedpre_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,44);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPrepedpre_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavPrepedpre_Forecolor)+";"+((edtavPrepedpre_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavPrepedpre_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavPrepeddto_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPrepeddto_Enabled!=0)&&(edtavPrepeddto_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 45,'',false,'"+sGXsfl_39_idx+"',39)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrepeddto_Internalname,GXutil.ltrim( localUtil.ntoc( AV17PrePedDto, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( AV17PrePedDto, "Z9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavPrepeddto_Enabled!=0)&&(edtavPrepeddto_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,45);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPrepeddto_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavPrepeddto_Forecolor)+";"+((edtavPrepeddto_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavPrepeddto_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavValor_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavValor_Enabled!=0)&&(edtavValor_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 46,'',false,'"+sGXsfl_39_idx+"',39)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavValor_Internalname,GXutil.ltrim( localUtil.ntoc( AV41Valor, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavValor_Enabled!=0) ? localUtil.format( AV41Valor, "ZZZZZZZZ9.99") : localUtil.format( AV41Valor, "ZZZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavValor_Enabled!=0)&&(edtavValor_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,46);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavValor_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavValor_Forecolor)+";"+((edtavValor_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavValor_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavValor_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashesZY2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_39_idx = ((subGrid_Islastpage==1)&&(nGXsfl_39_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_39_idx+1) ;
         sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_392( ) ;
      }
      /* End function sendrow_392 */
   }

   public void startgridcontrol39( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"39\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridNoBorder WorkWithSelection WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ActionBaseColorAttribute"+" "+((GXutil.strcmp(edtavEliminarlinea_gximage, "")==0) ? "" : "GX_Image_"+edtavEliminarlinea_gximage+"_Class")+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidades", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descuento", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Valor", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWithSelection WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", httpContext.convertURL( AV51EliminarLinea));
         GridColumn.AddObjectProperty("Tooltiptext", GXutil.rtrim( edtavEliminarlinea_Tooltiptext));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A718PrdNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV15PrePedUni, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavPrepeduni_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavPrepeduni_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV16PrePedPre, (byte)(12), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavPrepedpre_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavPrepedpre_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV17PrePedDto, (byte)(5), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavPrepeddto_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavPrepeddto_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV41Valor, (byte)(12), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavValor_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavValor_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavValor_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtavPrvnom_Internalname = "vPRVNOM" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      bttBtninsert_Internalname = "BTNINSERT" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      edtavEliminarlinea_Internalname = "vELIMINARLINEA" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      edtPrdNom_Internalname = "PRDNOM" ;
      edtavPrepeduni_Internalname = "vPREPEDUNI" ;
      edtavPrepedpre_Internalname = "vPREPEDPRE" ;
      edtavPrepeddto_Internalname = "vPREPEDDTO" ;
      edtavValor_Internalname = "vVALOR" ;
      edtavValortotal_Internalname = "vVALORTOTAL" ;
      bttBtnllamaremergente_Internalname = "BTNLLAMAREMERGENTE" ;
      divTableinvisible_Internalname = "TABLEINVISIBLE" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Dvelop_confirmpanel_eliminarlinea_Internalname = "DVELOP_CONFIRMPANEL_ELIMINARLINEA" ;
      tblTabledvelop_confirmpanel_eliminarlinea_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINARLINEA" ;
      Dvelop_confirmpanel_btnconfirmar_Internalname = "DVELOP_CONFIRMPANEL_BTNCONFIRMAR" ;
      tblTabledvelop_confirmpanel_btnconfirmar_Internalname = "TABLEDVELOP_CONFIRMPANEL_BTNCONFIRMAR" ;
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
      edtavValor_Jsonclick = "" ;
      edtavValor_Forecolor = (int)(0x000000) ;
      edtavValor_Visible = -1 ;
      edtavValor_Enabled = 1 ;
      edtavPrepeddto_Jsonclick = "" ;
      edtavPrepeddto_Forecolor = (int)(0x000000) ;
      edtavPrepeddto_Visible = -1 ;
      edtavPrepeddto_Enabled = 1 ;
      edtavPrepeddto_Backcolor = -1 ;
      edtavPrepedpre_Jsonclick = "" ;
      edtavPrepedpre_Forecolor = (int)(0x000000) ;
      edtavPrepedpre_Visible = -1 ;
      edtavPrepedpre_Enabled = 1 ;
      edtavPrepedpre_Backcolor = -1 ;
      edtavPrepeduni_Jsonclick = "" ;
      edtavPrepeduni_Forecolor = (int)(0x000000) ;
      edtavPrepeduni_Visible = -1 ;
      edtavPrepeduni_Enabled = 1 ;
      edtavPrepeduni_Backcolor = -1 ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      edtavEliminarlinea_Jsonclick = "" ;
      edtavEliminarlinea_gximage = "" ;
      edtavEliminarlinea_Visible = -1 ;
      edtavEliminarlinea_Enabled = 1 ;
      edtavEliminarlinea_Tooltiptext = "" ;
      subGrid_Class = "GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavValor_Backcolor = -1 ;
      subGrid_Sortable = (byte)(0) ;
      divTableinvisible_Visible = 1 ;
      edtavValortotal_Jsonclick = "" ;
      edtavValortotal_Enabled = 1 ;
      edtavPrvnom_Jsonclick = "" ;
      edtavPrvnom_Enabled = 0 ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Infinitescrolling = "Form" ;
      Dvelop_confirmpanel_btnconfirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btnconfirmar_Confirmationtext = "¿Confirma la realizacion del Prepedido?" ;
      Dvelop_confirmpanel_btnconfirmar_Title = "" ;
      Dvelop_confirmpanel_eliminarlinea_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminarlinea_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminarlinea_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminarlinea_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminarlinea_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminarlinea_Confirmationtext = "¿Desea Eliminar la Linea?" ;
      Dvelop_confirmpanel_eliminarlinea_Title = "" ;
      Ddo_grid_Datalistproc = "WebWco0013GetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic" ;
      Ddo_grid_Includedatalist = "T" ;
      Ddo_grid_Filtertype = "Character|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "1|2" ;
      Ddo_grid_Columnids = "1:PrdNum|2:PrdNom" ;
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
      Form.setCaption( httpContext.getMessage( "Realizacion Pedidos", "") );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV30TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV31TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV33TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV34TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV38Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV39PrePrvNum',fld:'vPREPRVNUM',pic:'ZZZZZ9'},{av:'AV40PrvNom',fld:'vPRVNOM',pic:''},{av:'AV15PrePedUni',fld:'vPREPEDUNI',grid:39,pic:'ZZZZZ9.99'},{av:'nRC_GXsfl_39',ctrl:'GRID',grid:39,prop:'GridRC',grid:39},{av:'AV16PrePedPre',fld:'vPREPEDPRE',grid:39,pic:'ZZZZZ9.999'},{av:'AV17PrePedDto',fld:'vPREPEDDTO',grid:39,pic:'Z9.99'},{av:'AV81Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV67Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A756PrePrvNum',fld:'PREPRVNUM',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV42ValorTotal',fld:'vVALORTOTAL',pic:'ZZZZZZZZ9.99'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e12ZY2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV38Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV39PrePrvNum',fld:'vPREPRVNUM',pic:'ZZZZZ9'},{av:'AV30TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV31TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV33TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV34TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV81Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV40PrvNom',fld:'vPRVNOM',pic:''},{av:'AV15PrePedUni',fld:'vPREPEDUNI',pic:'ZZZZZ9.99'},{av:'AV16PrePedPre',fld:'vPREPEDPRE',pic:'ZZZZZ9.999'},{av:'AV17PrePedDto',fld:'vPREPEDDTO',pic:'Z9.99'},{av:'AV67Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A756PrePrvNum',fld:'PREPRVNUM',pic:'ZZZZZ9',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV30TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV31TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV33TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV34TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e20ZY2',iparms:[{av:'A755PrePedUni',fld:'PREPEDUNI',pic:'ZZZZZ9.99'},{av:'A753PrePedPre',fld:'PREPEDPRE',pic:'ZZZZZ9.999'},{av:'A752PrePedDto',fld:'PREPEDDTO',pic:'Z9.99'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV51EliminarLinea',fld:'vELIMINARLINEA',pic:''},{av:'edtavEliminarlinea_Tooltiptext',ctrl:'vELIMINARLINEA',prop:'Tooltiptext'},{av:'AV15PrePedUni',fld:'vPREPEDUNI',pic:'ZZZZZ9.99'},{av:'edtavPrepeduni_Backcolor',ctrl:'vPREPEDUNI',prop:'Backcolor'},{av:'edtavPrepeduni_Forecolor',ctrl:'vPREPEDUNI',prop:'Forecolor'},{av:'AV16PrePedPre',fld:'vPREPEDPRE',pic:'ZZZZZ9.999'},{av:'edtavPrepedpre_Backcolor',ctrl:'vPREPEDPRE',prop:'Backcolor'},{av:'edtavPrepedpre_Forecolor',ctrl:'vPREPEDPRE',prop:'Forecolor'},{av:'AV17PrePedDto',fld:'vPREPEDDTO',pic:'Z9.99'},{av:'edtavPrepeddto_Backcolor',ctrl:'vPREPEDDTO',prop:'Backcolor'},{av:'edtavPrepeddto_Forecolor',ctrl:'vPREPEDDTO',prop:'Forecolor'},{av:'AV41Valor',fld:'vVALOR',pic:'ZZZZZZZZ9.99'},{av:'edtavValor_Backcolor',ctrl:'vVALOR',prop:'Backcolor'},{av:'edtavValor_Forecolor',ctrl:'vVALOR',prop:'Forecolor'}]}");
      setEventMetadata("'DOLLAMAREMERGENTE'","{handler:'e15ZY2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV38Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV39PrePrvNum',fld:'vPREPRVNUM',pic:'ZZZZZ9'},{av:'AV30TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV31TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV33TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV34TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV81Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV40PrvNom',fld:'vPRVNOM',pic:''},{av:'AV15PrePedUni',fld:'vPREPEDUNI',grid:39,pic:'ZZZZZ9.99'},{av:'nRC_GXsfl_39',ctrl:'GRID',grid:39,prop:'GridRC',grid:39},{av:'AV16PrePedPre',fld:'vPREPEDPRE',grid:39,pic:'ZZZZZ9.999'},{av:'AV17PrePedDto',fld:'vPREPEDDTO',grid:39,pic:'Z9.99'},{av:'AV67Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A756PrePrvNum',fld:'PREPRVNUM',pic:'ZZZZZ9',hsh:true},{av:'AV45PedCod',fld:'vPEDCOD',pic:'ZZZZZZZ9'},{av:'AV50PedTot',fld:'vPEDTOT',pic:'ZZZ,ZZZ,ZZ9.99'}]");
      setEventMetadata("'DOLLAMAREMERGENTE'",",oparms:[{av:'AV50PedTot',fld:'vPEDTOT',pic:'ZZZ,ZZZ,ZZ9.99'},{av:'AV45PedCod',fld:'vPEDCOD',pic:'ZZZZZZZ9'},{av:'AV42ValorTotal',fld:'vVALORTOTAL',pic:'ZZZZZZZZ9.99'}]}");
      setEventMetadata("'DOELIMINARLINEA'","{handler:'e21ZY2',iparms:[{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A756PrePrvNum',fld:'PREPRVNUM',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("'DOELIMINARLINEA'",",oparms:[{av:'Dvelop_confirmpanel_eliminarlinea_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_ELIMINARLINEA',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARLINEA.CLOSE","{handler:'e13ZY2',iparms:[{av:'Dvelop_confirmpanel_eliminarlinea_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINARLINEA',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV38Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV39PrePrvNum',fld:'vPREPRVNUM',pic:'ZZZZZ9'},{av:'AV30TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV31TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV33TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV34TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV81Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV40PrvNom',fld:'vPRVNOM',pic:''},{av:'AV15PrePedUni',fld:'vPREPEDUNI',grid:39,pic:'ZZZZZ9.99'},{av:'nRC_GXsfl_39',ctrl:'GRID',grid:39,prop:'GridRC',grid:39},{av:'AV16PrePedPre',fld:'vPREPEDPRE',grid:39,pic:'ZZZZZ9.999'},{av:'AV17PrePedDto',fld:'vPREPEDDTO',grid:39,pic:'Z9.99'},{av:'AV67Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A756PrePrvNum',fld:'PREPRVNUM',pic:'ZZZZZ9',hsh:true},{av:'A719PrdNum',fld:'PRDNUM',grid:39,pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARLINEA.CLOSE",",oparms:[{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'AV39PrePrvNum',fld:'vPREPRVNUM',pic:'ZZZZZ9'},{av:'AV38Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV42ValorTotal',fld:'vVALORTOTAL',pic:'ZZZZZZZZ9.99'}]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e11ZY1',iparms:[{av:'AV41Valor',fld:'vVALOR',grid:39,pic:'ZZZZZZZZ9.99'},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_39',ctrl:'GRID',grid:39,prop:'GridRC',grid:39}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE","{handler:'e14ZY2',iparms:[{av:'Dvelop_confirmpanel_btnconfirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNCONFIRMAR',prop:'Result'},{av:'AV38Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV39PrePrvNum',fld:'vPREPRVNUM',pic:'ZZZZZ9'},{av:'AV45PedCod',fld:'vPEDCOD',pic:'ZZZZZZZ9'},{av:'AV46FecEnt',fld:'vFECENT',pic:''},{av:'A719PrdNum',fld:'PRDNUM',grid:39,pic:''},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_39',ctrl:'GRID',grid:39,prop:'GridRC',grid:39},{av:'AV15PrePedUni',fld:'vPREPEDUNI',grid:39,pic:'ZZZZZ9.99'},{av:'AV48PedFecPEn',fld:'vPEDFECPEN',pic:''},{av:'AV16PrePedPre',fld:'vPREPEDPRE',grid:39,pic:'ZZZZZ9.999'},{av:'AV17PrePedDto',fld:'vPREPEDDTO',grid:39,pic:'Z9.99'},{av:'AV50PedTot',fld:'vPEDTOT',pic:'ZZZ,ZZZ,ZZ9.99'},{av:'AV67Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE",",oparms:[{av:'AV46FecEnt',fld:'vFECENT',pic:''},{av:'AV45PedCod',fld:'vPEDCOD',pic:'ZZZZZZZ9'},{av:'AV15PrePedUni',fld:'vPREPEDUNI',pic:'ZZZZZ9.99'},{av:'AV48PedFecPEn',fld:'vPEDFECPEN',pic:''},{av:'AV17PrePedDto',fld:'vPREPEDDTO',pic:'Z9.99'},{av:'AV16PrePedPre',fld:'vPREPEDPRE',pic:'ZZZZZ9.999'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'AV50PedTot',fld:'vPEDTOT',pic:'ZZZ,ZZZ,ZZ9.99'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e16ZY2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("'DOINSERT'","{handler:'e17ZY2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV38Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV39PrePrvNum',fld:'vPREPRVNUM',pic:'ZZZZZ9'},{av:'AV30TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV31TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV33TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV34TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV81Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV40PrvNom',fld:'vPRVNOM',pic:''},{av:'AV15PrePedUni',fld:'vPREPEDUNI',grid:39,pic:'ZZZZZ9.99'},{av:'nRC_GXsfl_39',ctrl:'GRID',grid:39,prop:'GridRC',grid:39},{av:'AV16PrePedPre',fld:'vPREPEDPRE',grid:39,pic:'ZZZZZ9.999'},{av:'AV17PrePedDto',fld:'vPREPEDDTO',grid:39,pic:'Z9.99'},{av:'AV67Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A756PrePrvNum',fld:'PREPRVNUM',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("'DOINSERT'",",oparms:[{av:'AV40PrvNom',fld:'vPRVNOM',pic:''},{av:'AV39PrePrvNum',fld:'vPREPRVNUM',pic:'ZZZZZ9'},{av:'AV38Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV42ValorTotal',fld:'vVALORTOTAL',pic:'ZZZZZZZZ9.99'}]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV67Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A756PrePrvNum',fld:'PREPRVNUM',pic:'ZZZZZ9',hsh:true},{av:'AV30TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV31TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV33TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV34TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV81Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV38Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV39PrePrvNum',fld:'vPREPRVNUM',pic:'ZZZZZ9'},{av:'AV40PrvNom',fld:'vPRVNOM',pic:''},{av:'AV15PrePedUni',fld:'vPREPEDUNI',grid:39,pic:'ZZZZZ9.99'},{av:'nRC_GXsfl_39',ctrl:'GRID',grid:39,prop:'GridRC',grid:39},{av:'AV16PrePedPre',fld:'vPREPEDPRE',grid:39,pic:'ZZZZZ9.999'},{av:'AV17PrePedDto',fld:'vPREPEDDTO',grid:39,pic:'Z9.99'}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[{av:'AV42ValorTotal',fld:'vVALORTOTAL',pic:'ZZZZZZZZ9.99'}]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV67Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A756PrePrvNum',fld:'PREPRVNUM',pic:'ZZZZZ9',hsh:true},{av:'AV30TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV31TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV33TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV34TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV81Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV38Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV39PrePrvNum',fld:'vPREPRVNUM',pic:'ZZZZZ9'},{av:'AV40PrvNom',fld:'vPRVNOM',pic:''},{av:'AV15PrePedUni',fld:'vPREPEDUNI',grid:39,pic:'ZZZZZ9.99'},{av:'nRC_GXsfl_39',ctrl:'GRID',grid:39,prop:'GridRC',grid:39},{av:'AV16PrePedPre',fld:'vPREPEDPRE',grid:39,pic:'ZZZZZ9.999'},{av:'AV17PrePedDto',fld:'vPREPEDDTO',grid:39,pic:'Z9.99'}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[{av:'AV42ValorTotal',fld:'vVALORTOTAL',pic:'ZZZZZZZZ9.99'}]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV67Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A756PrePrvNum',fld:'PREPRVNUM',pic:'ZZZZZ9',hsh:true},{av:'AV30TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV31TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV33TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV34TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV81Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV38Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV39PrePrvNum',fld:'vPREPRVNUM',pic:'ZZZZZ9'},{av:'AV40PrvNom',fld:'vPRVNOM',pic:''},{av:'AV15PrePedUni',fld:'vPREPEDUNI',grid:39,pic:'ZZZZZ9.99'},{av:'nRC_GXsfl_39',ctrl:'GRID',grid:39,prop:'GridRC',grid:39},{av:'AV16PrePedPre',fld:'vPREPEDPRE',grid:39,pic:'ZZZZZ9.999'},{av:'AV17PrePedDto',fld:'vPREPEDDTO',grid:39,pic:'Z9.99'}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[{av:'AV42ValorTotal',fld:'vVALORTOTAL',pic:'ZZZZZZZZ9.99'}]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV67Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A756PrePrvNum',fld:'PREPRVNUM',pic:'ZZZZZ9',hsh:true},{av:'AV30TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV31TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV33TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV34TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV81Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV38Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV39PrePrvNum',fld:'vPREPRVNUM',pic:'ZZZZZ9'},{av:'AV40PrvNom',fld:'vPRVNOM',pic:''},{av:'AV15PrePedUni',fld:'vPREPEDUNI',grid:39,pic:'ZZZZZ9.99'},{av:'nRC_GXsfl_39',ctrl:'GRID',grid:39,prop:'GridRC',grid:39},{av:'AV16PrePedPre',fld:'vPREPEDPRE',grid:39,pic:'ZZZZZ9.999'},{av:'AV17PrePedDto',fld:'vPREPEDDTO',grid:39,pic:'Z9.99'}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[{av:'AV42ValorTotal',fld:'vVALORTOTAL',pic:'ZZZZZZZZ9.99'}]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[]");
      setEventMetadata("VALID_PRDNUM",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Valor',iparms:[]");
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
      wcpOAV40PrvNom = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Dvelop_confirmpanel_eliminarlinea_Result = "" ;
      Dvelop_confirmpanel_btnconfirmar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV38Emprcod = "" ;
      AV40PrvNom = "" ;
      AV30TFPrdNum = "" ;
      AV31TFPrdNum_Sel = "" ;
      AV33TFPrdNom = "" ;
      AV34TFPrdNom_Sel = "" ;
      AV81Pgmname = "" ;
      AV15PrePedUni = DecimalUtil.ZERO ;
      AV16PrePedPre = DecimalUtil.ZERO ;
      AV17PrePedDto = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV36DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A755PrePedUni = DecimalUtil.ZERO ;
      A753PrePedPre = DecimalUtil.ZERO ;
      A752PrePedDto = DecimalUtil.ZERO ;
      AV50PedTot = DecimalUtil.ZERO ;
      AV46FecEnt = GXutil.nullDate() ;
      AV48PedFecPEn = GXutil.nullDate() ;
      AV54PrdNum_Selected = "" ;
      AV52EmprCod_Selected = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtninsert_Jsonclick = "" ;
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      AV42ValorTotal = DecimalUtil.ZERO ;
      bttBtnllamaremergente_Jsonclick = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV73Webwco0013ds_1_tfprdnum = "" ;
      AV74Webwco0013ds_2_tfprdnum_sel = "" ;
      AV75Webwco0013ds_3_tfprdnom = "" ;
      AV76Webwco0013ds_4_tfprdnom_sel = "" ;
      AV51EliminarLinea = "" ;
      AV77Eliminarlinea_GXI = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      AV41Valor = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV73Webwco0013ds_1_tfprdnum = "" ;
      lV75Webwco0013ds_3_tfprdnom = "" ;
      H00ZY2_A658PedCod = new int[1] ;
      H00ZY2_n658PedCod = new boolean[] {false} ;
      H00ZY2_A755PrePedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00ZY2_n755PrePedUni = new boolean[] {false} ;
      H00ZY2_A753PrePedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00ZY2_n753PrePedPre = new boolean[] {false} ;
      H00ZY2_A752PrePedDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00ZY2_n752PrePedDto = new boolean[] {false} ;
      H00ZY2_A396EmprCod = new String[] {""} ;
      H00ZY2_A756PrePrvNum = new int[1] ;
      H00ZY2_A718PrdNom = new String[] {""} ;
      H00ZY2_A719PrdNum = new String[] {""} ;
      H00ZY3_AGRID_nRecordCount = new long[1] ;
      GXv_int2 = new byte[1] ;
      AV70Station = "" ;
      GXv_char4 = new String[1] ;
      AV71Emprnom = "" ;
      AV72Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV49PedLinObs = "" ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_date11 = new java.util.Date[1] ;
      Gx_msg = "" ;
      GXv_int10 = new int[1] ;
      AV25Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char15 = "" ;
      GXv_char6 = new String[1] ;
      GXt_char3 = "" ;
      GXv_char5 = new String[1] ;
      GXv_SdtWWPGridState16 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      ucDvelop_confirmpanel_btnconfirmar = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_eliminarlinea = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      sImgUrl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwco0013__default(),
         new Object[] {
             new Object[] {
            H00ZY2_A658PedCod, H00ZY2_n658PedCod, H00ZY2_A755PrePedUni, H00ZY2_n755PrePedUni, H00ZY2_A753PrePedPre, H00ZY2_n753PrePedPre, H00ZY2_A752PrePedDto, H00ZY2_n752PrePedDto, H00ZY2_A396EmprCod, H00ZY2_A756PrePrvNum,
            H00ZY2_A718PrdNom, H00ZY2_A719PrdNum
            }
            , new Object[] {
            H00ZY3_AGRID_nRecordCount
            }
         }
      );
      AV81Pgmname = "WebWco0013" ;
      /* GeneXus formulas. */
      AV81Pgmname = "WebWco0013" ;
      Gx_err = (short)(0) ;
      edtavPrvnom_Enabled = 0 ;
      edtavValor_Enabled = 0 ;
      edtavValortotal_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV12OrderedBy ;
   private short AV67Moda21 ;
   private short AV43FlagErr ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV39PrePrvNum ;
   private int nRC_GXsfl_39 ;
   private int subGrid_Rows ;
   private int AV39PrePrvNum ;
   private int nGXsfl_39_idx=1 ;
   private int A756PrePrvNum ;
   private int AV45PedCod ;
   private int AV53PrePrvNum_Selected ;
   private int edtavPrvnom_Enabled ;
   private int edtavValortotal_Enabled ;
   private int divTableinvisible_Visible ;
   private int subGrid_Islastpage ;
   private int edtavValor_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int A658PedCod ;
   private int edtavPrepeduni_Backcolor ;
   private int edtavPrepeduni_Forecolor ;
   private int edtavPrepedpre_Backcolor ;
   private int edtavPrepedpre_Forecolor ;
   private int edtavPrepeddto_Backcolor ;
   private int edtavPrepeddto_Forecolor ;
   private int edtavValor_Backcolor ;
   private int edtavValor_Forecolor ;
   private int nGXsfl_39_fel_idx=1 ;
   private int GXv_int10[] ;
   private int AV82GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavEliminarlinea_Enabled ;
   private int edtavEliminarlinea_Visible ;
   private int edtavPrepeduni_Enabled ;
   private int edtavPrepeduni_Visible ;
   private int edtavPrepedpre_Enabled ;
   private int edtavPrepedpre_Visible ;
   private int edtavPrepeddto_Enabled ;
   private int edtavPrepeddto_Visible ;
   private int edtavValor_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV15PrePedUni ;
   private java.math.BigDecimal AV16PrePedPre ;
   private java.math.BigDecimal AV17PrePedDto ;
   private java.math.BigDecimal A755PrePedUni ;
   private java.math.BigDecimal A753PrePedPre ;
   private java.math.BigDecimal A752PrePedDto ;
   private java.math.BigDecimal AV50PedTot ;
   private java.math.BigDecimal AV42ValorTotal ;
   private java.math.BigDecimal AV41Valor ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private String wcpOAV38Emprcod ;
   private String wcpOAV40PrvNom ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_grid_Filteredtext_get ;
   private String Dvelop_confirmpanel_eliminarlinea_Result ;
   private String Dvelop_confirmpanel_btnconfirmar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV38Emprcod ;
   private String AV40PrvNom ;
   private String sGXsfl_39_idx="0001" ;
   private String AV30TFPrdNum ;
   private String AV31TFPrdNum_Sel ;
   private String AV33TFPrdNom ;
   private String AV34TFPrdNom_Sel ;
   private String AV81Pgmname ;
   private String A396EmprCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV54PrdNum_Selected ;
   private String AV52EmprCod_Selected ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
   private String Ddo_grid_Caption ;
   private String Ddo_grid_Filteredtext_set ;
   private String Ddo_grid_Selectedvalue_set ;
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Includesortasc ;
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
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
   private String Dvelop_confirmpanel_btnconfirmar_Title ;
   private String Dvelop_confirmpanel_btnconfirmar_Confirmationtext ;
   private String Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btnconfirmar_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Infinitescrolling ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtavPrvnom_Internalname ;
   private String edtavPrvnom_Jsonclick ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtninsert_Internalname ;
   private String bttBtninsert_Jsonclick ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String edtavValortotal_Internalname ;
   private String edtavValortotal_Jsonclick ;
   private String divTableinvisible_Internalname ;
   private String bttBtnllamaremergente_Internalname ;
   private String bttBtnllamaremergente_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV73Webwco0013ds_1_tfprdnum ;
   private String AV74Webwco0013ds_2_tfprdnum_sel ;
   private String AV75Webwco0013ds_3_tfprdnom ;
   private String AV76Webwco0013ds_4_tfprdnom_sel ;
   private String edtavEliminarlinea_Internalname ;
   private String A719PrdNum ;
   private String edtPrdNum_Internalname ;
   private String A718PrdNom ;
   private String edtPrdNom_Internalname ;
   private String edtavPrepeduni_Internalname ;
   private String edtavPrepedpre_Internalname ;
   private String edtavPrepeddto_Internalname ;
   private String edtavValor_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String lV73Webwco0013ds_1_tfprdnum ;
   private String lV75Webwco0013ds_3_tfprdnom ;
   private String AV70Station ;
   private String GXv_char4[] ;
   private String AV71Emprnom ;
   private String AV72Usurcod ;
   private String edtavEliminarlinea_gximage ;
   private String edtavEliminarlinea_Tooltiptext ;
   private String sGXsfl_39_fel_idx="0001" ;
   private String AV49PedLinObs ;
   private String Gx_msg ;
   private String GXt_char15 ;
   private String GXv_char6[] ;
   private String GXt_char3 ;
   private String GXv_char5[] ;
   private String tblTabledvelop_confirmpanel_btnconfirmar_Internalname ;
   private String Dvelop_confirmpanel_btnconfirmar_Internalname ;
   private String tblTabledvelop_confirmpanel_eliminarlinea_Internalname ;
   private String Dvelop_confirmpanel_eliminarlinea_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String sImgUrl ;
   private String edtavEliminarlinea_Jsonclick ;
   private String ROClassString ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Jsonclick ;
   private String edtavPrepeduni_Jsonclick ;
   private String edtavPrepedpre_Jsonclick ;
   private String edtavPrepeddto_Jsonclick ;
   private String edtavValor_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV46FecEnt ;
   private java.util.Date AV48PedFecPEn ;
   private java.util.Date GXv_date11[] ;
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
   private boolean bGXsfl_39_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n658PedCod ;
   private boolean n755PrePedUni ;
   private boolean n753PrePedPre ;
   private boolean n752PrePedDto ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV51EliminarLinea_IsBlob ;
   private String AV77Eliminarlinea_GXI ;
   private String AV51EliminarLinea ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV25Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btnconfirmar ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminarlinea ;
   private IDataStoreProvider pr_default ;
   private int[] H00ZY2_A658PedCod ;
   private boolean[] H00ZY2_n658PedCod ;
   private java.math.BigDecimal[] H00ZY2_A755PrePedUni ;
   private boolean[] H00ZY2_n755PrePedUni ;
   private java.math.BigDecimal[] H00ZY2_A753PrePedPre ;
   private boolean[] H00ZY2_n753PrePedPre ;
   private java.math.BigDecimal[] H00ZY2_A752PrePedDto ;
   private boolean[] H00ZY2_n752PrePedDto ;
   private String[] H00ZY2_A396EmprCod ;
   private int[] H00ZY2_A756PrePrvNum ;
   private String[] H00ZY2_A718PrdNom ;
   private String[] H00ZY2_A719PrdNum ;
   private long[] H00ZY3_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState16[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV36DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[] ;
}

final  class webwco0013__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00ZY2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV74Webwco0013ds_2_tfprdnum_sel ,
                                          String AV73Webwco0013ds_1_tfprdnum ,
                                          String AV76Webwco0013ds_4_tfprdnom_sel ,
                                          String AV75Webwco0013ds_3_tfprdnom ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          int A658PedCod ,
                                          String AV38Emprcod ,
                                          int AV39PrePrvNum ,
                                          String A396EmprCod ,
                                          int A756PrePrvNum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[11];
      Object[] GXv_Object18 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " /*+ FIRST_ROWS(51) */ T1.PedCod, T1.PrePedUni, T1.PrePedPre, T1.PrePedDto, T1.EmprCod, T1.PrePrvNum, T2.PrdNom, T1.PrdNum" ;
      sFromString = " FROM (TXPPREPED T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.PrePrvNum = ?)");
      addWhere(sWhereString, "((T1.PedCod = 0))");
      if ( (GXutil.strcmp("", AV74Webwco0013ds_2_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV73Webwco0013ds_1_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Webwco0013ds_2_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int17[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Webwco0013ds_4_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV75Webwco0013ds_3_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Webwco0013ds_4_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int17[5] = (byte)(1) ;
      }
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.PrdNom" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.PrdNom DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.PrePrvNum, T1.PrdNum" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_H00ZY3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV74Webwco0013ds_2_tfprdnum_sel ,
                                          String AV73Webwco0013ds_1_tfprdnum ,
                                          String AV76Webwco0013ds_4_tfprdnom_sel ,
                                          String AV75Webwco0013ds_3_tfprdnom ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          int A658PedCod ,
                                          String AV38Emprcod ,
                                          int AV39PrePrvNum ,
                                          String A396EmprCod ,
                                          int A756PrePrvNum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[6];
      Object[] GXv_Object20 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPPREPED T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.PrePrvNum = ?)");
      addWhere(sWhereString, "((T1.PedCod = 0))");
      if ( (GXutil.strcmp("", AV74Webwco0013ds_2_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV73Webwco0013ds_1_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Webwco0013ds_2_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int19[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Webwco0013ds_4_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV75Webwco0013ds_3_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Webwco0013ds_4_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int19[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
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
                  return conditional_H00ZY2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Boolean) dynConstraints[7]).booleanValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() );
            case 1 :
                  return conditional_H00ZY3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Boolean) dynConstraints[7]).booleanValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00ZY2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,51, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00ZY3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 3);
               ((int[]) buf[9])[0] = rslt.getInt(6);
               ((String[]) buf[10])[0] = rslt.getString(7, 26);
               ((String[]) buf[11])[0] = rslt.getString(8, 6);
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
                  stmt.setString(sIdx, (String)parms[11], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[7]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 26);
               }
               return;
      }
   }

}

