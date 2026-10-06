package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class seleccioncolortinte_impl extends GXDataArea
{
   public seleccioncolortinte_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public seleccioncolortinte_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( seleccioncolortinte_impl.class ));
   }

   public seleccioncolortinte_impl( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavEquiv = new HTMLChoice();
      cmbForBlo = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetFirstPar( "InOutEmprCod") ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "InOutEmprCod") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "InOutEmprCod") ;
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
            AV18InOutEmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18InOutEmprCod", AV18InOutEmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV19InOutCliCod = (int)(GXutil.lval( httpContext.GetPar( "InOutCliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19InOutCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19InOutCliCod), 6, 0));
               AV20InOutForSer = httpContext.GetPar( "InOutForSer") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV20InOutForSer", AV20InOutForSer);
               AV21InOutForColNom = httpContext.GetPar( "InOutForColNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV21InOutForColNom", AV21InOutForColNom);
               AV22InOutForColNum = (int)(GXutil.lval( httpContext.GetPar( "InOutForColNum"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV22InOutForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22InOutForColNum), 6, 0));
               AV23InOutTipColCod = (byte)(GXutil.lval( httpContext.GetPar( "InOutTipColCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV23InOutTipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23InOutTipColCod), 2, 0));
               AV70InOutForNomCli = httpContext.GetPar( "InOutForNomCli") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV70InOutForNomCli", AV70InOutForNomCli);
               AV71InOutForNumCli = (int)(GXutil.lval( httpContext.GetPar( "InOutForNumCli"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV71InOutForNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71InOutForNumCli), 6, 0));
               AV72InOutForTonal = httpContext.GetPar( "InOutForTonal") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV72InOutForTonal", AV72InOutForTonal);
               AV73InOutForblo = httpContext.GetPar( "InOutForblo") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV73InOutForblo", AV73InOutForblo);
               AV15TipColDsc = httpContext.GetPar( "TipColDsc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15TipColDsc", AV15TipColDsc);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOLDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15TipColDsc, ""))));
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
      nRC_GXsfl_88 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_88"))) ;
      nGXsfl_88_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_88_idx"))) ;
      sGXsfl_88_idx = httpContext.GetPar( "sGXsfl_88_idx") ;
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
      AV80CliCodIN = (int)(GXutil.lval( httpContext.GetPar( "CliCodIN"))) ;
      AV81ForSerIN = httpContext.GetPar( "ForSerIN") ;
      AV82ForColNomIN = httpContext.GetPar( "ForColNomIN") ;
      AV83ForColNumIN = (int)(GXutil.lval( httpContext.GetPar( "ForColNumIN"))) ;
      AV87TipColCodIN = (byte)(GXutil.lval( httpContext.GetPar( "TipColCodIN"))) ;
      AV30FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV18InOutEmprCod = httpContext.GetPar( "InOutEmprCod") ;
      AV12TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
      AV15TipColDsc = httpContext.GetPar( "TipColDsc") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV80CliCodIN, AV81ForSerIN, AV82ForColNomIN, AV83ForColNumIN, AV87TipColCodIN, AV30FilterFullText, AV18InOutEmprCod, AV12TipColCod, AV15TipColDsc) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         MasterPageObj= createMasterPage(remoteHandle, "app.wwpbaseobjects.workwithplusmasterpageprompt");
         MasterPageObj.setDataArea(this,true);
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
      pa2D92( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2D92( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.writeText( " "+"class=\"form-horizontal FormNoBackgroundColor\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal FormNoBackgroundColor\" data-gx-class=\"form-horizontal FormNoBackgroundColor\" novalidate action=\""+formatLink("app.formulaciontinte.seleccioncolortinte", new String[] {GXutil.URLEncode(GXutil.rtrim(AV18InOutEmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV19InOutCliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV20InOutForSer)),GXutil.URLEncode(GXutil.rtrim(AV21InOutForColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV22InOutForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV23InOutTipColCod,2,0)),GXutil.URLEncode(GXutil.rtrim(AV70InOutForNomCli)),GXutil.URLEncode(GXutil.ltrimstr(AV71InOutForNumCli,6,0)),GXutil.URLEncode(GXutil.rtrim(AV72InOutForTonal)),GXutil.URLEncode(GXutil.rtrim(AV73InOutForblo)),GXutil.URLEncode(GXutil.rtrim(AV15TipColDsc))}, new String[] {"InOutEmprCod","InOutCliCod","InOutForSer","InOutForColNom","InOutForColNum","InOutTipColCod","InOutForNomCli","InOutForNumCli","InOutForTonal","InOutForblo","TipColDsc"}) +"\">") ;
      app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "form-horizontal FormNoBackgroundColor", true);
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
   }

   public void send_integrity_footer_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOLDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15TipColDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOLCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12TipColCod), "Z9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vCLICODIN", GXutil.ltrim( localUtil.ntoc( AV80CliCodIN, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFORSERIN", GXutil.rtrim( AV81ForSerIN));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFORCOLNOMIN", GXutil.rtrim( AV82ForColNomIN));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFORCOLNUMIN", GXutil.ltrim( localUtil.ntoc( AV83ForColNumIN, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vTIPCOLCODIN", GXutil.ltrim( localUtil.ntoc( AV87TipColCodIN, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFILTERFULLTEXT", AV30FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_88", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_88, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV64GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV65GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV62DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV62DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV28OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV29OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPCOLDSC", GXutil.rtrim( AV15TipColDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOLDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15TipColDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vINOUTFORBLO", GXutil.rtrim( AV73InOutForblo));
      app.GxWebStd.gx_hidden_field( httpContext, "vINOUTFORTONAL", GXutil.rtrim( AV72InOutForTonal));
      app.GxWebStd.gx_hidden_field( httpContext, "vINOUTFORNUMCLI", GXutil.ltrim( localUtil.ntoc( AV71InOutForNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINOUTFORNOMCLI", GXutil.rtrim( AV70InOutForNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, "vINOUTTIPCOLCOD", GXutil.ltrim( localUtil.ntoc( AV23InOutTipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINOUTFORCOLNUM", GXutil.ltrim( localUtil.ntoc( AV22InOutForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINOUTFORCOLNOM", GXutil.rtrim( AV21InOutForColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vINOUTEMPRCOD", GXutil.rtrim( AV18InOutEmprCod));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFILTERSELECCIONCOLORTINTE_SDT", AV86FilterSeleccionColorTinte_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFILTERSELECCIONCOLORTINTE_SDT", AV86FilterSeleccionColorTinte_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPCOLCOD", GXutil.ltrim( localUtil.ntoc( AV12TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOLCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12TipColCod), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Width", GXutil.rtrim( Dvpanel_unnamedtable6_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable6_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable6_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Cls", GXutil.rtrim( Dvpanel_unnamedtable6_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Title", GXutil.rtrim( Dvpanel_unnamedtable6_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable6_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable6_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable6_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable6_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable6_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CREARCOLOR_Title", GXutil.rtrim( Dvelop_confirmpanel_crearcolor_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CREARCOLOR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_crearcolor_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CREARCOLOR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_crearcolor_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CREARCOLOR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_crearcolor_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CREARCOLOR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_crearcolor_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CREARCOLOR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_crearcolor_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CREARCOLOR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_crearcolor_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CREARCOLOR_Result", GXutil.rtrim( Dvelop_confirmpanel_crearcolor_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CREARCOLOR_Result", GXutil.rtrim( Dvelop_confirmpanel_crearcolor_Result));
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
         app.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal FormNoBackgroundColor" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         we2D92( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2D92( ) ;
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
      return formatLink("app.formulaciontinte.seleccioncolortinte", new String[] {GXutil.URLEncode(GXutil.rtrim(AV18InOutEmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV19InOutCliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV20InOutForSer)),GXutil.URLEncode(GXutil.rtrim(AV21InOutForColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV22InOutForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV23InOutTipColCod,2,0)),GXutil.URLEncode(GXutil.rtrim(AV70InOutForNomCli)),GXutil.URLEncode(GXutil.ltrimstr(AV71InOutForNumCli,6,0)),GXutil.URLEncode(GXutil.rtrim(AV72InOutForTonal)),GXutil.URLEncode(GXutil.rtrim(AV73InOutForblo)),GXutil.URLEncode(GXutil.rtrim(AV15TipColDsc))}, new String[] {"InOutEmprCod","InOutCliCod","InOutForSer","InOutForColNom","InOutForColNum","InOutTipColCod","InOutForNomCli","InOutForNumCli","InOutForTonal","InOutForblo","TipColDsc"})  ;
   }

   public String getPgmname( )
   {
      return "FormulacionTinte.SeleccionColorTinte" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Selecciona Mto Formulas Tinte", "") ;
   }

   public void wb2D90( )
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
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), "", "", "", "false");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", 0, "px", "TableMainPrompt", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavEquiv.getInternalname()+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'" + sGXsfl_88_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavEquiv, cmbavEquiv.getInternalname(), GXutil.trim( GXutil.str( AV93Equiv, 1, 0)), 1, cmbavEquiv.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavEquiv.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,19);\"", "", true, (byte)(0), "HLP_FormulacionTinte\\SeleccionColorTinte.htm");
         cmbavEquiv.setValue( GXutil.trim( GXutil.str( AV93Equiv, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavEquiv.getInternalname(), "Values", cmbavEquiv.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncrearcolor_Internalname, "gx.evt.setGridEvt("+GXutil.str( 88, 2, 0)+","+"null"+");", httpContext.getMessage( "Crear Color", ""), bttBtncrearcolor_Jsonclick, 5, httpContext.getMessage( "Crear Color", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCREARCOLOR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\SeleccionColorTinte.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 28,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 88, 2, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\SeleccionColorTinte.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
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
         ucDvpanel_unnamedtable6.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable6_Internalname, "DVPANEL_UNNAMEDTABLE6Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE6Container"+"UnnamedTable6"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavInoutclicod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavInoutclicod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavInoutclicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV19InOutCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavInoutclicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV19InOutCliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV19InOutCliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavInoutclicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavInoutclicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\SeleccionColorTinte.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavInoutforser_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavInoutforser_Internalname, httpContext.getMessage( "Articulo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavInoutforser_Internalname, GXutil.rtrim( AV20InOutForSer), GXutil.rtrim( localUtil.format( AV20InOutForSer, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavInoutforser_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavInoutforser_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\SeleccionColorTinte.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicodin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicodin_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_88_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicodin_Internalname, GXutil.ltrim( localUtil.ntoc( AV80CliCodIN, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicodin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV80CliCodIN), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV80CliCodIN), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicodin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicodin_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\SeleccionColorTinte.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavForserin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavForserin_Internalname, httpContext.getMessage( "Articulo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_88_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavForserin_Internalname, GXutil.rtrim( AV81ForSerIN), GXutil.rtrim( localUtil.format( AV81ForSerIN, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,58);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavForserin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavForserin_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\SeleccionColorTinte.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavForcolnomin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavForcolnomin_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_88_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavForcolnomin_Internalname, GXutil.rtrim( AV82ForColNomIN), GXutil.rtrim( localUtil.format( AV82ForColNomIN, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,62);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavForcolnomin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavForcolnomin_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\SeleccionColorTinte.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavForcolnumin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavForcolnumin_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_88_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavForcolnumin_Internalname, GXutil.ltrim( localUtil.ntoc( AV83ForColNumIN, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavForcolnumin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV83ForColNumIN), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV83ForColNumIN), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavForcolnumin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavForcolnumin_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\SeleccionColorTinte.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTipcolcodin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTipcolcodin_Internalname, httpContext.getMessage( "TC", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'" + sGXsfl_88_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipcolcodin_Internalname, GXutil.ltrim( localUtil.ntoc( AV87TipColCodIN, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTipcolcodin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV87TipColCodIN), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV87TipColCodIN), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,70);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipcolcodin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTipcolcodin_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\SeleccionColorTinte.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 hidden-xs", "left", "top", "", "", "div");
         wb_table1_76_2D92( true) ;
      }
      else
      {
         wb_table1_76_2D92( false) ;
      }
      return  ;
   }

   public void wb_table1_76_2D92e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginPrompt GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol88( ) ;
      }
      if ( wbEnd == 88 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_88 = (int)(nGXsfl_88_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV64GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV65GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, "GRIDPAGINATIONBARContainer");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV99Pgmname), GXutil.rtrim( localUtil.format( AV99Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\SeleccionColorTinte.htm");
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
         /* User Defined Control */
         ucDdo_grid.setProperty("Caption", Ddo_grid_Caption);
         ucDdo_grid.setProperty("ColumnIds", Ddo_grid_Columnids);
         ucDdo_grid.setProperty("ColumnsSortValues", Ddo_grid_Columnssortvalues);
         ucDdo_grid.setProperty("IncludeSortASC", Ddo_grid_Includesortasc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV62DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, 0, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\SeleccionColorTinte.htm");
         wb_table2_123_2D92( true) ;
      }
      else
      {
         wb_table2_123_2D92( false) ;
      }
      return  ;
   }

   public void wb_table2_123_2D92e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 88 )
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

   public void start2D92( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Selecciona Mto Formulas Tinte", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2D90( ) ;
   }

   public void ws2D92( )
   {
      start2D92( ) ;
      evt2D92( ) ;
   }

   public void evt2D92( )
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
                           e112D92 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e122D92 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e132D92 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_CREARCOLOR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e142D92 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCLEANFILTERS'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCleanFilters' */
                           e152D92 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCREARCOLOR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCrearColor' */
                           e162D92 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e172D92 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCLICODIN.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e182D92 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VFORSERIN.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e192D92 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VFORCOLNOMIN.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e202D92 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VFORCOLNUMIN.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e212D92 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VTIPCOLCODIN.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e222D92 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) )
                        {
                           nGXsfl_88_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_88_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_88_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_882( ) ;
                           AV66Select = httpContext.cgiGet( edtavSelect_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavSelect_Internalname, AV66Select);
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A494ForSer = httpContext.cgiGet( edtForSer_Internalname) ;
                           A5742ForSerDsc = httpContext.cgiGet( edtForSerDsc_Internalname) ;
                           n5742ForSerDsc = false ;
                           A482ForColNom = httpContext.cgiGet( edtForColNom_Internalname) ;
                           A483ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtForColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A832TipColDsc = httpContext.cgiGet( edtTipColDsc_Internalname) ;
                           n832TipColDsc = false ;
                           A1191ForNomCli = httpContext.cgiGet( edtForNomCli_Internalname) ;
                           n1191ForNomCli = false ;
                           A1192ForNumCli = (int)(localUtil.ctol( httpContext.cgiGet( edtForNumCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n1192ForNumCli = false ;
                           A584IntDsc = httpContext.cgiGet( edtIntDsc_Internalname) ;
                           n584IntDsc = false ;
                           A995ForTonal = httpContext.cgiGet( edtForTonal_Internalname) ;
                           n995ForTonal = false ;
                           A485ForFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtForFec_Internalname), 0)) ;
                           n485ForFec = false ;
                           A495ForUltMod = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtForUltMod_Internalname), 0)) ;
                           n495ForUltMod = false ;
                           cmbForBlo.setName( cmbForBlo.getInternalname() );
                           cmbForBlo.setValue( httpContext.cgiGet( cmbForBlo.getInternalname()) );
                           A7781ForBlo = httpContext.cgiGet( cmbForBlo.getInternalname()) ;
                           n7781ForBlo = false ;
                           A3315ForNumArc = (int)(localUtil.ctol( httpContext.cgiGet( edtForNumArc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n3315ForNumArc = false ;
                           A3558ForFecApr = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtForFecApr_Internalname), 0)) ;
                           n3558ForFecApr = false ;
                           A3560ForOpcCli = GXutil.upper( httpContext.cgiGet( edtForOpcCli_Internalname)) ;
                           n3560ForOpcCli = false ;
                           A486ForNumCol = (int)(localUtil.ctol( httpContext.cgiGet( edtForNumCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e232D92 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e242D92 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e252D92 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Clicodin Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLICODIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV80CliCodIN )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Forserin Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFORSERIN"), AV81ForSerIN) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Forcolnomin Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFORCOLNOMIN"), AV82ForColNomIN) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Forcolnumin Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vFORCOLNUMIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV83ForColNumIN )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Tipcolcodin Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vTIPCOLCODIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV87TipColCodIN )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Filterfulltext Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV30FilterFullText) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e262D92 ();
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

   public void we2D92( )
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

   public void pa2D92( )
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
            GX_FocusControl = cmbavEquiv.getInternalname() ;
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
      subsflControlProps_882( ) ;
      while ( nGXsfl_88_idx <= nRC_GXsfl_88 )
      {
         sendrow_882( ) ;
         nGXsfl_88_idx = ((subGrid_Islastpage==1)&&(nGXsfl_88_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_88_idx+1) ;
         sGXsfl_88_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_88_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_882( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 int AV80CliCodIN ,
                                 String AV81ForSerIN ,
                                 String AV82ForColNomIN ,
                                 int AV83ForColNumIN ,
                                 byte AV87TipColCodIN ,
                                 String AV30FilterFullText ,
                                 String AV18InOutEmprCod ,
                                 byte AV12TipColCod ,
                                 String AV15TipColDsc )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e242D92 ();
      GRID_nCurrentRecord = 0 ;
      rf2D92( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FORBLO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A7781ForBlo, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "FORBLO", GXutil.rtrim( A7781ForBlo));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FORTONAL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A995ForTonal, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "FORTONAL", GXutil.rtrim( A995ForTonal));
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
      if ( cmbavEquiv.getItemCount() > 0 )
      {
         AV93Equiv = (byte)(GXutil.lval( cmbavEquiv.getValidValue(GXutil.trim( GXutil.str( AV93Equiv, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV93Equiv", GXutil.str( AV93Equiv, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavEquiv.setValue( GXutil.trim( GXutil.str( AV93Equiv, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavEquiv.getInternalname(), "Values", cmbavEquiv.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf2D92( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV99Pgmname = "FormulacionTinte.SeleccionColorTinte" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV99Pgmname", AV99Pgmname);
      Gx_err = (short)(0) ;
      edtavInoutclicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavInoutclicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInoutclicod_Enabled), 5, 0), true);
      edtavInoutforser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavInoutforser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInoutforser_Enabled), 5, 0), true);
      edtavSelect_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSelect_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSelect_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public int subgridclient_rec_count_fnc( )
   {
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV80CliCodIN) ,
                                           AV81ForSerIN ,
                                           AV82ForColNomIN ,
                                           Integer.valueOf(AV83ForColNumIN) ,
                                           Byte.valueOf(AV87TipColCodIN) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A494ForSer ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV30FilterFullText ,
                                           A5742ForSerDsc ,
                                           A832TipColDsc ,
                                           A1191ForNomCli ,
                                           Integer.valueOf(A1192ForNumCli) ,
                                           A584IntDsc ,
                                           A995ForTonal ,
                                           A7781ForBlo ,
                                           Integer.valueOf(A3315ForNumArc) ,
                                           A3560ForOpcCli ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           A10045CliAct ,
                                           AV18InOutEmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV81ForSerIN = GXutil.padr( GXutil.rtrim( AV81ForSerIN), 16, "%") ;
      lV82ForColNomIN = GXutil.padr( GXutil.rtrim( AV82ForColNomIN), 13, "%") ;
      /* Using cursor H02D92 */
      pr_default.execute(0, new Object[] {AV18InOutEmprCod, Integer.valueOf(AV80CliCodIN), lV81ForSerIN, lV82ForColNomIN, Integer.valueOf(AV83ForColNumIN), Byte.valueOf(AV87TipColCodIN)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A583IntCod = H02D92_A583IntCod[0] ;
         A10045CliAct = H02D92_A10045CliAct[0] ;
         A396EmprCod = H02D92_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A486ForNumCol = H02D92_A486ForNumCol[0] ;
         A3560ForOpcCli = H02D92_A3560ForOpcCli[0] ;
         n3560ForOpcCli = H02D92_n3560ForOpcCli[0] ;
         A3558ForFecApr = H02D92_A3558ForFecApr[0] ;
         n3558ForFecApr = H02D92_n3558ForFecApr[0] ;
         A3315ForNumArc = H02D92_A3315ForNumArc[0] ;
         n3315ForNumArc = H02D92_n3315ForNumArc[0] ;
         A7781ForBlo = H02D92_A7781ForBlo[0] ;
         n7781ForBlo = H02D92_n7781ForBlo[0] ;
         A495ForUltMod = H02D92_A495ForUltMod[0] ;
         n495ForUltMod = H02D92_n495ForUltMod[0] ;
         A485ForFec = H02D92_A485ForFec[0] ;
         n485ForFec = H02D92_n485ForFec[0] ;
         A995ForTonal = H02D92_A995ForTonal[0] ;
         n995ForTonal = H02D92_n995ForTonal[0] ;
         A584IntDsc = H02D92_A584IntDsc[0] ;
         n584IntDsc = H02D92_n584IntDsc[0] ;
         A1192ForNumCli = H02D92_A1192ForNumCli[0] ;
         n1192ForNumCli = H02D92_n1192ForNumCli[0] ;
         A1191ForNomCli = H02D92_A1191ForNomCli[0] ;
         n1191ForNomCli = H02D92_n1191ForNomCli[0] ;
         A832TipColDsc = H02D92_A832TipColDsc[0] ;
         n832TipColDsc = H02D92_n832TipColDsc[0] ;
         A831TipColCod = H02D92_A831TipColCod[0] ;
         A483ForColNum = H02D92_A483ForColNum[0] ;
         A482ForColNom = H02D92_A482ForColNom[0] ;
         A5742ForSerDsc = H02D92_A5742ForSerDsc[0] ;
         n5742ForSerDsc = H02D92_n5742ForSerDsc[0] ;
         A494ForSer = H02D92_A494ForSer[0] ;
         A252CliCod = H02D92_A252CliCod[0] ;
         A584IntDsc = H02D92_A584IntDsc[0] ;
         n584IntDsc = H02D92_n584IntDsc[0] ;
         A832TipColDsc = H02D92_A832TipColDsc[0] ;
         n832TipColDsc = H02D92_n832TipColDsc[0] ;
         A10045CliAct = H02D92_A10045CliAct[0] ;
         if ( (GXutil.strcmp("", AV30FilterFullText)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV30FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A494ForSer) , GXutil.padr( "%" + GXutil.upper( AV30FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5742ForSerDsc) , GXutil.padr( "%" + GXutil.upper( AV30FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A482ForColNom) , GXutil.padr( "%" + GXutil.upper( AV30FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A483ForColNum, 6, 0) , GXutil.padr( "%" + AV30FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A831TipColCod, 2, 0) , GXutil.padr( "%" + AV30FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A832TipColDsc) , GXutil.padr( "%" + GXutil.upper( AV30FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1191ForNomCli) , GXutil.padr( "%" + GXutil.upper( AV30FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1192ForNumCli, 6, 0) , GXutil.padr( "%" + AV30FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A584IntDsc) , GXutil.padr( "%" + GXutil.upper( AV30FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A995ForTonal) , GXutil.padr( "%" + GXutil.upper( AV30FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "n", "") , GXutil.padr( "%" + GXutil.lower( AV30FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, "N") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "s", "") , GXutil.padr( "%" + GXutil.lower( AV30FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, "S") == 0 ) ) || ( GXutil.like( GXutil.str( A3315ForNumArc, 8, 0) , GXutil.padr( "%" + AV30FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3560ForOpcCli) , GXutil.padr( "%" + GXutil.upper( AV30FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A486ForNumCol, 8, 0) , GXutil.padr( "%" + AV30FilterFullText , 254 , "%"),  ' ' ) ) ) )
         {
            GRID_nRecordCount = (long)(GRID_nRecordCount+1) ;
         }
         pr_default.readNext(0);
      }
      GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      pr_default.close(0);
      return (int)(GRID_nRecordCount) ;
   }

   public void rf2D92( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(88) ;
      /* Execute user event: Refresh */
      e242D92 ();
      nGXsfl_88_idx = 1 ;
      sGXsfl_88_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_88_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_882( ) ;
      bGXsfl_88_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
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
         subsflControlProps_882( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              Integer.valueOf(AV80CliCodIN) ,
                                              AV81ForSerIN ,
                                              AV82ForColNomIN ,
                                              Integer.valueOf(AV83ForColNumIN) ,
                                              Byte.valueOf(AV87TipColCodIN) ,
                                              Integer.valueOf(A252CliCod) ,
                                              A494ForSer ,
                                              A482ForColNom ,
                                              Integer.valueOf(A483ForColNum) ,
                                              Byte.valueOf(A831TipColCod) ,
                                              Short.valueOf(AV28OrderedBy) ,
                                              Boolean.valueOf(AV29OrderedDsc) ,
                                              AV30FilterFullText ,
                                              A5742ForSerDsc ,
                                              A832TipColDsc ,
                                              A1191ForNomCli ,
                                              Integer.valueOf(A1192ForNumCli) ,
                                              A584IntDsc ,
                                              A995ForTonal ,
                                              A7781ForBlo ,
                                              Integer.valueOf(A3315ForNumArc) ,
                                              A3560ForOpcCli ,
                                              Integer.valueOf(A486ForNumCol) ,
                                              A10045CliAct ,
                                              AV18InOutEmprCod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                              TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV81ForSerIN = GXutil.padr( GXutil.rtrim( AV81ForSerIN), 16, "%") ;
         lV82ForColNomIN = GXutil.padr( GXutil.rtrim( AV82ForColNomIN), 13, "%") ;
         /* Using cursor H02D93 */
         pr_default.execute(1, new Object[] {AV18InOutEmprCod, Integer.valueOf(AV80CliCodIN), lV81ForSerIN, lV82ForColNomIN, Integer.valueOf(AV83ForColNumIN), Byte.valueOf(AV87TipColCodIN)});
         nGXsfl_88_idx = 1 ;
         sGXsfl_88_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_88_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_882( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A583IntCod = H02D93_A583IntCod[0] ;
            A10045CliAct = H02D93_A10045CliAct[0] ;
            A396EmprCod = H02D93_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A486ForNumCol = H02D93_A486ForNumCol[0] ;
            A3560ForOpcCli = H02D93_A3560ForOpcCli[0] ;
            n3560ForOpcCli = H02D93_n3560ForOpcCli[0] ;
            A3558ForFecApr = H02D93_A3558ForFecApr[0] ;
            n3558ForFecApr = H02D93_n3558ForFecApr[0] ;
            A3315ForNumArc = H02D93_A3315ForNumArc[0] ;
            n3315ForNumArc = H02D93_n3315ForNumArc[0] ;
            A7781ForBlo = H02D93_A7781ForBlo[0] ;
            n7781ForBlo = H02D93_n7781ForBlo[0] ;
            A495ForUltMod = H02D93_A495ForUltMod[0] ;
            n495ForUltMod = H02D93_n495ForUltMod[0] ;
            A485ForFec = H02D93_A485ForFec[0] ;
            n485ForFec = H02D93_n485ForFec[0] ;
            A995ForTonal = H02D93_A995ForTonal[0] ;
            n995ForTonal = H02D93_n995ForTonal[0] ;
            A584IntDsc = H02D93_A584IntDsc[0] ;
            n584IntDsc = H02D93_n584IntDsc[0] ;
            A1192ForNumCli = H02D93_A1192ForNumCli[0] ;
            n1192ForNumCli = H02D93_n1192ForNumCli[0] ;
            A1191ForNomCli = H02D93_A1191ForNomCli[0] ;
            n1191ForNomCli = H02D93_n1191ForNomCli[0] ;
            A832TipColDsc = H02D93_A832TipColDsc[0] ;
            n832TipColDsc = H02D93_n832TipColDsc[0] ;
            A831TipColCod = H02D93_A831TipColCod[0] ;
            A483ForColNum = H02D93_A483ForColNum[0] ;
            A482ForColNom = H02D93_A482ForColNom[0] ;
            A5742ForSerDsc = H02D93_A5742ForSerDsc[0] ;
            n5742ForSerDsc = H02D93_n5742ForSerDsc[0] ;
            A494ForSer = H02D93_A494ForSer[0] ;
            A252CliCod = H02D93_A252CliCod[0] ;
            A584IntDsc = H02D93_A584IntDsc[0] ;
            n584IntDsc = H02D93_n584IntDsc[0] ;
            A832TipColDsc = H02D93_A832TipColDsc[0] ;
            n832TipColDsc = H02D93_n832TipColDsc[0] ;
            A10045CliAct = H02D93_A10045CliAct[0] ;
            if ( (GXutil.strcmp("", AV30FilterFullText)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV30FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A494ForSer) , GXutil.padr( "%" + GXutil.upper( AV30FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5742ForSerDsc) , GXutil.padr( "%" + GXutil.upper( AV30FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A482ForColNom) , GXutil.padr( "%" + GXutil.upper( AV30FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A483ForColNum, 6, 0) , GXutil.padr( "%" + AV30FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A831TipColCod, 2, 0) , GXutil.padr( "%" + AV30FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A832TipColDsc) , GXutil.padr( "%" + GXutil.upper( AV30FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1191ForNomCli) , GXutil.padr( "%" + GXutil.upper( AV30FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1192ForNumCli, 6, 0) , GXutil.padr( "%" + AV30FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A584IntDsc) , GXutil.padr( "%" + GXutil.upper( AV30FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A995ForTonal) , GXutil.padr( "%" + GXutil.upper( AV30FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "n", "") , GXutil.padr( "%" + GXutil.lower( AV30FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, "N") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "s", "") , GXutil.padr( "%" + GXutil.lower( AV30FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, "S") == 0 ) ) || ( GXutil.like( GXutil.str( A3315ForNumArc, 8, 0) , GXutil.padr( "%" + AV30FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3560ForOpcCli) , GXutil.padr( "%" + GXutil.upper( AV30FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A486ForNumCol, 8, 0) , GXutil.padr( "%" + AV30FilterFullText , 254 , "%"),  ' ' ) ) ) )
            {
               e252D92 ();
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(88) ;
         wb2D90( ) ;
      }
      bGXsfl_88_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2D92( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FORBLO"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( A7781ForBlo, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FORTONAL"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( A995ForTonal, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPCOLDSC", GXutil.rtrim( AV15TipColDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOLDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15TipColDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPCOLCOD", GXutil.ltrim( localUtil.ntoc( AV12TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOLCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12TipColCod), "Z9")));
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
      return (int)(subgridclient_rec_count_fnc()) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV80CliCodIN, AV81ForSerIN, AV82ForColNomIN, AV83ForColNumIN, AV87TipColCodIN, AV30FilterFullText, AV18InOutEmprCod, AV12TipColCod, AV15TipColDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV80CliCodIN, AV81ForSerIN, AV82ForColNomIN, AV83ForColNumIN, AV87TipColCodIN, AV30FilterFullText, AV18InOutEmprCod, AV12TipColCod, AV15TipColDsc) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV80CliCodIN, AV81ForSerIN, AV82ForColNomIN, AV83ForColNumIN, AV87TipColCodIN, AV30FilterFullText, AV18InOutEmprCod, AV12TipColCod, AV15TipColDsc) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV80CliCodIN, AV81ForSerIN, AV82ForColNomIN, AV83ForColNumIN, AV87TipColCodIN, AV30FilterFullText, AV18InOutEmprCod, AV12TipColCod, AV15TipColDsc) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV80CliCodIN, AV81ForSerIN, AV82ForColNomIN, AV83ForColNumIN, AV87TipColCodIN, AV30FilterFullText, AV18InOutEmprCod, AV12TipColCod, AV15TipColDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV99Pgmname = "FormulacionTinte.SeleccionColorTinte" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV99Pgmname", AV99Pgmname);
      Gx_err = (short)(0) ;
      edtavInoutclicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavInoutclicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInoutclicod_Enabled), 5, 0), true);
      edtavInoutforser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavInoutforser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInoutforser_Enabled), 5, 0), true);
      edtavSelect_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSelect_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSelect_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2D90( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e232D92 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV62DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_88 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_88"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV64GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV65GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvpanel_unnamedtable6_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Width") ;
         Dvpanel_unnamedtable6_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Autowidth")) ;
         Dvpanel_unnamedtable6_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Autoheight")) ;
         Dvpanel_unnamedtable6_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Cls") ;
         Dvpanel_unnamedtable6_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Title") ;
         Dvpanel_unnamedtable6_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Collapsible")) ;
         Dvpanel_unnamedtable6_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Collapsed")) ;
         Dvpanel_unnamedtable6_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Showcollapseicon")) ;
         Dvpanel_unnamedtable6_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Iconposition") ;
         Dvpanel_unnamedtable6_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Autoscroll")) ;
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
         Ddo_grid_Caption = httpContext.cgiGet( "DDO_GRID_Caption") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( "DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( "DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( "DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( "DDO_GRID_Includesortasc") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( "DDO_GRID_Sortedstatus") ;
         Dvelop_confirmpanel_crearcolor_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CREARCOLOR_Title") ;
         Dvelop_confirmpanel_crearcolor_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CREARCOLOR_Confirmationtext") ;
         Dvelop_confirmpanel_crearcolor_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CREARCOLOR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_crearcolor_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CREARCOLOR_Nobuttoncaption") ;
         Dvelop_confirmpanel_crearcolor_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CREARCOLOR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_crearcolor_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CREARCOLOR_Yesbuttonposition") ;
         Dvelop_confirmpanel_crearcolor_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CREARCOLOR_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Dvelop_confirmpanel_crearcolor_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CREARCOLOR_Result") ;
         /* Read variables values. */
         cmbavEquiv.setName( cmbavEquiv.getInternalname() );
         cmbavEquiv.setValue( httpContext.cgiGet( cmbavEquiv.getInternalname()) );
         AV93Equiv = (byte)(GXutil.lval( httpContext.cgiGet( cmbavEquiv.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV93Equiv", GXutil.str( AV93Equiv, 1, 0));
         AV19InOutCliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavInoutclicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19InOutCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19InOutCliCod), 6, 0));
         AV20InOutForSer = httpContext.cgiGet( edtavInoutforser_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20InOutForSer", AV20InOutForSer);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICODIN");
            GX_FocusControl = edtavClicodin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV80CliCodIN = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV80CliCodIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80CliCodIN), 6, 0));
         }
         else
         {
            AV80CliCodIN = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicodin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV80CliCodIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80CliCodIN), 6, 0));
         }
         AV81ForSerIN = httpContext.cgiGet( edtavForserin_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV81ForSerIN", AV81ForSerIN);
         AV82ForColNomIN = httpContext.cgiGet( edtavForcolnomin_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV82ForColNomIN", AV82ForColNomIN);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavForcolnumin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavForcolnumin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFORCOLNUMIN");
            GX_FocusControl = edtavForcolnumin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV83ForColNumIN = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83ForColNumIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83ForColNumIN), 6, 0));
         }
         else
         {
            AV83ForColNumIN = (int)(localUtil.ctol( httpContext.cgiGet( edtavForcolnumin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83ForColNumIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83ForColNumIN), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTipcolcodin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTipcolcodin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTIPCOLCODIN");
            GX_FocusControl = edtavTipcolcodin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV87TipColCodIN = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87TipColCodIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV87TipColCodIN), 2, 0));
         }
         else
         {
            AV87TipColCodIN = (byte)(localUtil.ctol( httpContext.cgiGet( edtavTipcolcodin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87TipColCodIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV87TipColCodIN), 2, 0));
         }
         AV30FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30FilterFullText", AV30FilterFullText);
         AV99Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV99Pgmname", AV99Pgmname);
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLICODIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV80CliCodIN )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFORSERIN"), AV81ForSerIN) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFORCOLNOMIN"), AV82ForColNomIN) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vFORCOLNUMIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV83ForColNumIN )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vTIPCOLCODIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV87TipColCodIN )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV30FilterFullText) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
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
      e232D92 ();
      if (returnInSub) return;
   }

   public void e232D92( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_int1 = (byte)(AV96moda21) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV18InOutEmprCod, httpContext.getMessage( "MODA21", ""), GXv_int2) ;
      seleccioncolortinte_impl.this.GXt_int1 = GXv_int2[0] ;
      AV96moda21 = GXt_int1 ;
      AV80CliCodIN = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80CliCodIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80CliCodIN), 6, 0));
      AV81ForSerIN = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV81ForSerIN", AV81ForSerIN);
      AV82ForColNomIN = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV82ForColNomIN", AV82ForColNomIN);
      AV83ForColNumIN = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV83ForColNumIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83ForColNumIN), 6, 0));
      AV87TipColCodIN = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87TipColCodIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV87TipColCodIN), 2, 0));
      /* Execute user subroutine: 'LOADFILTERFORM' */
      S112 ();
      if (returnInSub) return;
      if ( (0==AV86FilterSeleccionColorTinte_SDT.getgxTv_SdtFilterSeleccionColorTinte_SDT_Clicod()) )
      {
         AV80CliCodIN = AV19InOutCliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV80CliCodIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80CliCodIN), 6, 0));
      }
      if ( (GXutil.strcmp("", AV86FilterSeleccionColorTinte_SDT.getgxTv_SdtFilterSeleccionColorTinte_SDT_Forser())==0) )
      {
         AV81ForSerIN = ((AV96moda21==1) ? " " : AV20InOutForSer) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV81ForSerIN", AV81ForSerIN);
      }
      if ( (GXutil.strcmp("", AV86FilterSeleccionColorTinte_SDT.getgxTv_SdtFilterSeleccionColorTinte_SDT_Forcolnom())==0) )
      {
         AV82ForColNomIN = AV21InOutForColNom ;
         httpContext.ajax_rsp_assign_attri("", false, "AV82ForColNomIN", AV82ForColNomIN);
      }
      if ( (0==AV86FilterSeleccionColorTinte_SDT.getgxTv_SdtFilterSeleccionColorTinte_SDT_Forcolnum()) )
      {
         AV83ForColNumIN = AV22InOutForColNum ;
         httpContext.ajax_rsp_assign_attri("", false, "AV83ForColNumIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83ForColNumIN), 6, 0));
      }
      if ( (0==AV86FilterSeleccionColorTinte_SDT.getgxTv_SdtFilterSeleccionColorTinte_SDT_Tipcolcod()) )
      {
         AV87TipColCodIN = AV23InOutTipColCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV87TipColCodIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV87TipColCodIN), 2, 0));
      }
      GXt_char3 = AV74Station ;
      GXv_char4[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      seleccioncolortinte_impl.this.GXt_char3 = GXv_char4[0] ;
      AV74Station = GXt_char3 ;
      GXv_char4[0] = AV5EmprCod ;
      GXv_char5[0] = AV68EmprNom ;
      GXv_char6[0] = AV69UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV74Station, GXv_char4, GXv_char5, GXv_char6) ;
      seleccioncolortinte_impl.this.AV5EmprCod = GXv_char4[0] ;
      seleccioncolortinte_impl.this.AV68EmprNom = GXv_char5[0] ;
      seleccioncolortinte_impl.this.AV69UsurCod = GXv_char6[0] ;
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( "Selecciona Mto Formulas Tinte", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      if ( AV28OrderedBy < 1 )
      {
         AV28OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S122 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = AV62DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] ;
      AV62DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      AV93Equiv = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV93Equiv", GXutil.str( AV93Equiv, 1, 0));
      this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "RemoveElement", "", new Object[] {httpContext.getMessage( ".gx-popup-close", "")});
   }

   public void e242D92( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext9[0] = AV17WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV17WWPContext = GXv_SdtWWPContext9[0] ;
      AV64GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64GridCurrentPage), 10, 0));
      AV65GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65GridPageCount), 10, 0));
      edtavSelect_Columnheaderclass = "WWIconActionColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSelect_Internalname, "Columnheaderclass", edtavSelect_Columnheaderclass, !bGXsfl_88_Refreshing);
      edtCliCod_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Columnheaderclass", edtCliCod_Columnheaderclass, !bGXsfl_88_Refreshing);
      edtForSer_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtForSer_Internalname, "Columnheaderclass", edtForSer_Columnheaderclass, !bGXsfl_88_Refreshing);
      edtForSerDsc_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtForSerDsc_Internalname, "Columnheaderclass", edtForSerDsc_Columnheaderclass, !bGXsfl_88_Refreshing);
      edtForColNom_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtForColNom_Internalname, "Columnheaderclass", edtForColNom_Columnheaderclass, !bGXsfl_88_Refreshing);
      edtForColNum_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtForColNum_Internalname, "Columnheaderclass", edtForColNum_Columnheaderclass, !bGXsfl_88_Refreshing);
      edtTipColCod_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipColCod_Internalname, "Columnheaderclass", edtTipColCod_Columnheaderclass, !bGXsfl_88_Refreshing);
      edtTipColDsc_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipColDsc_Internalname, "Columnheaderclass", edtTipColDsc_Columnheaderclass, !bGXsfl_88_Refreshing);
      edtForNomCli_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtForNomCli_Internalname, "Columnheaderclass", edtForNomCli_Columnheaderclass, !bGXsfl_88_Refreshing);
      edtForNumCli_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtForNumCli_Internalname, "Columnheaderclass", edtForNumCli_Columnheaderclass, !bGXsfl_88_Refreshing);
      edtIntDsc_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntDsc_Internalname, "Columnheaderclass", edtIntDsc_Columnheaderclass, !bGXsfl_88_Refreshing);
      edtForTonal_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtForTonal_Internalname, "Columnheaderclass", edtForTonal_Columnheaderclass, !bGXsfl_88_Refreshing);
      edtForFec_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtForFec_Internalname, "Columnheaderclass", edtForFec_Columnheaderclass, !bGXsfl_88_Refreshing);
      edtForUltMod_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtForUltMod_Internalname, "Columnheaderclass", edtForUltMod_Columnheaderclass, !bGXsfl_88_Refreshing);
      cmbForBlo.setColumnHeaderClass( "WWColumn hidden-xs" );
      httpContext.ajax_rsp_assign_prop("", false, cmbForBlo.getInternalname(), "Columnheaderclass", cmbForBlo.getColumnHeaderClass(), !bGXsfl_88_Refreshing);
      edtForNumArc_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtForNumArc_Internalname, "Columnheaderclass", edtForNumArc_Columnheaderclass, !bGXsfl_88_Refreshing);
      edtForFecApr_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtForFecApr_Internalname, "Columnheaderclass", edtForFecApr_Columnheaderclass, !bGXsfl_88_Refreshing);
      edtForOpcCli_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtForOpcCli_Internalname, "Columnheaderclass", edtForOpcCli_Columnheaderclass, !bGXsfl_88_Refreshing);
      edtForNumCol_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtForNumCol_Internalname, "Columnheaderclass", edtForNumCol_Columnheaderclass, !bGXsfl_88_Refreshing);
      /*  Sending Event outputs  */
   }

   public void e112D92( )
   {
      /* Gridpaginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gridpaginationbar_Selectedpage, "Previous") == 0 )
      {
         subgrid_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Gridpaginationbar_Selectedpage, "Next") == 0 )
      {
         subgrid_nextpage( ) ;
      }
      else
      {
         AV63PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV63PageToGo) ;
      }
   }

   public void e122D92( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e132D92( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV28OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28OrderedBy), 4, 0));
         AV29OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29OrderedDsc", AV29OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S122 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e252D92( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         AV66Select = "<i class=\"fas fa-check\"></i>" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavSelect_Internalname, AV66Select);
         edtavSelect_Columnclass = ((GXutil.strcmp(A7781ForBlo, "S")==0) ? "WWIconActionColumn WWColumnDanger WWColumnDangerFirstColumn" : "WWIconActionColumn") ;
         edtCliCod_Columnclass = ((GXutil.strcmp(A7781ForBlo, "S")==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
         edtForSer_Columnclass = ((GXutil.strcmp(A7781ForBlo, "S")==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
         edtForSerDsc_Columnclass = ((GXutil.strcmp(A7781ForBlo, "S")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
         edtForColNom_Columnclass = ((GXutil.strcmp(A7781ForBlo, "S")==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
         edtForColNum_Columnclass = ((GXutil.strcmp(A7781ForBlo, "S")==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
         edtTipColCod_Columnclass = ((GXutil.strcmp(A7781ForBlo, "S")==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
         edtTipColDsc_Columnclass = ((GXutil.strcmp(A7781ForBlo, "S")==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
         edtForNomCli_Columnclass = ((GXutil.strcmp(A7781ForBlo, "S")==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
         edtForNumCli_Columnclass = ((GXutil.strcmp(A7781ForBlo, "S")==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
         edtIntDsc_Columnclass = ((GXutil.strcmp(A7781ForBlo, "S")==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
         edtForTonal_Columnclass = ((GXutil.strcmp(A7781ForBlo, "S")==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
         edtForFec_Columnclass = ((GXutil.strcmp(A7781ForBlo, "S")==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
         edtForUltMod_Columnclass = ((GXutil.strcmp(A7781ForBlo, "S")==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
         cmbForBlo.setColumnClass( ((GXutil.strcmp(A7781ForBlo, "S")==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") );
         edtForNumArc_Columnclass = ((GXutil.strcmp(A7781ForBlo, "S")==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
         edtForFecApr_Columnclass = ((GXutil.strcmp(A7781ForBlo, "S")==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
         edtForOpcCli_Columnclass = ((GXutil.strcmp(A7781ForBlo, "S")==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
         edtForNumCol_Columnclass = ((GXutil.strcmp(A7781ForBlo, "S")==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(88) ;
         }
         sendrow_882( ) ;
         GRID_nEOF = (byte)(1) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         if ( ( subGrid_Islastpage == 1 ) && ( ((int)((GRID_nCurrentRecord) % (subgrid_fnc_recordsperpage( )))) == 0 ) )
         {
            GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
         }
      }
      if ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) )
      {
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      }
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_88_Refreshing )
      {
         httpContext.doAjaxLoad(88, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e262D92 ();
      if (returnInSub) return;
   }

   public void e262D92( )
   {
      /* Enter Routine */
      returnInSub = false ;
      AV18InOutEmprCod = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18InOutEmprCod", AV18InOutEmprCod);
      AV19InOutCliCod = A252CliCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19InOutCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19InOutCliCod), 6, 0));
      AV20InOutForSer = A494ForSer ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20InOutForSer", AV20InOutForSer);
      AV21InOutForColNom = A482ForColNom ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21InOutForColNom", AV21InOutForColNom);
      AV22InOutForColNum = A483ForColNum ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22InOutForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22InOutForColNum), 6, 0));
      AV23InOutTipColCod = A831TipColCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23InOutTipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23InOutTipColCod), 2, 0));
      AV73InOutForblo = A7781ForBlo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73InOutForblo", AV73InOutForblo);
      AV70InOutForNomCli = A1191ForNomCli ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70InOutForNomCli", AV70InOutForNomCli);
      AV71InOutForNumCli = A1192ForNumCli ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71InOutForNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71InOutForNumCli), 6, 0));
      AV72InOutForTonal = A995ForTonal ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72InOutForTonal", AV72InOutForTonal);
      AV95inouttipcoldsc = A832TipColDsc ;
      AV85WebSession.remove(httpContext.getMessage( "&FilterSeleccionColorTinte_SDT", ""));
      httpContext.setWebReturnParms(new Object[] {AV18InOutEmprCod,Integer.valueOf(AV19InOutCliCod),AV20InOutForSer,AV21InOutForColNom,Integer.valueOf(AV22InOutForColNum),Byte.valueOf(AV23InOutTipColCod),AV70InOutForNomCli,Integer.valueOf(AV71InOutForNumCli),AV72InOutForTonal,AV73InOutForblo,AV15TipColDsc});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV18InOutEmprCod","AV19InOutCliCod","AV20InOutForSer","AV21InOutForColNom","AV22InOutForColNum","AV23InOutTipColCod","AV70InOutForNomCli","AV71InOutForNumCli","AV72InOutForTonal","AV73InOutForblo","AV15TipColDsc"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
      if ( 1 == 0 )
      {
         AV18InOutEmprCod = A396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18InOutEmprCod", AV18InOutEmprCod);
         AV19InOutCliCod = A252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19InOutCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19InOutCliCod), 6, 0));
         AV20InOutForSer = A494ForSer ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20InOutForSer", AV20InOutForSer);
         AV21InOutForColNom = A482ForColNom ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21InOutForColNom", AV21InOutForColNom);
         AV22InOutForColNum = A483ForColNum ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22InOutForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22InOutForColNum), 6, 0));
         AV23InOutTipColCod = A831TipColCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23InOutTipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23InOutTipColCod), 2, 0));
         httpContext.setWebReturnParms(new Object[] {AV18InOutEmprCod,Integer.valueOf(AV19InOutCliCod),AV20InOutForSer,AV21InOutForColNom,Integer.valueOf(AV22InOutForColNum),Byte.valueOf(AV23InOutTipColCod),AV70InOutForNomCli,Integer.valueOf(AV71InOutForNumCli),AV72InOutForTonal,AV73InOutForblo,AV15TipColDsc});
         httpContext.setWebReturnParmsMetadata(new Object[] {"AV18InOutEmprCod","AV19InOutCliCod","AV20InOutForSer","AV21InOutForColNom","AV22InOutForColNum","AV23InOutTipColCod","AV70InOutForNomCli","AV71InOutForNumCli","AV72InOutForTonal","AV73InOutForblo","AV15TipColDsc"});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      /*  Sending Event outputs  */
   }

   public void e152D92( )
   {
      /* 'DoCleanFilters' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'CLEANFILTERS' */
      S132 ();
      if (returnInSub) return;
      subgrid_firstpage( ) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e162D92( )
   {
      /* 'DoCrearColor' Routine */
      returnInSub = false ;
      Dvelop_confirmpanel_crearcolor_Confirmationtext = httpContext.getMessage( "Origen", "")+GXutil.newLine( ) ;
      ucDvelop_confirmpanel_crearcolor.sendProperty(context, "", false, Dvelop_confirmpanel_crearcolor_Internalname, "ConfirmationText", Dvelop_confirmpanel_crearcolor_Confirmationtext);
      Dvelop_confirmpanel_crearcolor_Confirmationtext = Dvelop_confirmpanel_crearcolor_Confirmationtext+httpContext.getMessage( "Cliente :", "")+GXutil.trim( GXutil.str( A252CliCod, 6, 0))+GXutil.newLine( ) ;
      ucDvelop_confirmpanel_crearcolor.sendProperty(context, "", false, Dvelop_confirmpanel_crearcolor_Internalname, "ConfirmationText", Dvelop_confirmpanel_crearcolor_Confirmationtext);
      Dvelop_confirmpanel_crearcolor_Confirmationtext = Dvelop_confirmpanel_crearcolor_Confirmationtext+httpContext.getMessage( "Articulo:", "")+GXutil.trim( A494ForSer)+GXutil.newLine( ) ;
      ucDvelop_confirmpanel_crearcolor.sendProperty(context, "", false, Dvelop_confirmpanel_crearcolor_Internalname, "ConfirmationText", Dvelop_confirmpanel_crearcolor_Confirmationtext);
      Dvelop_confirmpanel_crearcolor_Confirmationtext = Dvelop_confirmpanel_crearcolor_Confirmationtext+httpContext.getMessage( "Color   :", "")+GXutil.trim( A482ForColNom)+GXutil.newLine( ) ;
      ucDvelop_confirmpanel_crearcolor.sendProperty(context, "", false, Dvelop_confirmpanel_crearcolor_Internalname, "ConfirmationText", Dvelop_confirmpanel_crearcolor_Confirmationtext);
      Dvelop_confirmpanel_crearcolor_Confirmationtext = Dvelop_confirmpanel_crearcolor_Confirmationtext+httpContext.getMessage( "Numero  :", "")+GXutil.trim( GXutil.str( A483ForColNum, 6, 0))+GXutil.newLine( ) ;
      ucDvelop_confirmpanel_crearcolor.sendProperty(context, "", false, Dvelop_confirmpanel_crearcolor_Internalname, "ConfirmationText", Dvelop_confirmpanel_crearcolor_Confirmationtext);
      Dvelop_confirmpanel_crearcolor_Confirmationtext = Dvelop_confirmpanel_crearcolor_Confirmationtext+httpContext.getMessage( "TC      :", "")+GXutil.trim( GXutil.str( A831TipColCod, 2, 0))+GXutil.newLine( ) ;
      ucDvelop_confirmpanel_crearcolor.sendProperty(context, "", false, Dvelop_confirmpanel_crearcolor_Internalname, "ConfirmationText", Dvelop_confirmpanel_crearcolor_Confirmationtext);
      Dvelop_confirmpanel_crearcolor_Confirmationtext = Dvelop_confirmpanel_crearcolor_Confirmationtext+httpContext.getMessage( "Destino", "")+GXutil.newLine( ) ;
      ucDvelop_confirmpanel_crearcolor.sendProperty(context, "", false, Dvelop_confirmpanel_crearcolor_Internalname, "ConfirmationText", Dvelop_confirmpanel_crearcolor_Confirmationtext);
      Dvelop_confirmpanel_crearcolor_Confirmationtext = Dvelop_confirmpanel_crearcolor_Confirmationtext+httpContext.getMessage( "Cliente :", "")+GXutil.trim( GXutil.str( AV19InOutCliCod, 6, 0))+GXutil.newLine( ) ;
      ucDvelop_confirmpanel_crearcolor.sendProperty(context, "", false, Dvelop_confirmpanel_crearcolor_Internalname, "ConfirmationText", Dvelop_confirmpanel_crearcolor_Confirmationtext);
      Dvelop_confirmpanel_crearcolor_Confirmationtext = Dvelop_confirmpanel_crearcolor_Confirmationtext+httpContext.getMessage( "Articulo:", "")+GXutil.trim( AV20InOutForSer)+GXutil.newLine( ) ;
      ucDvelop_confirmpanel_crearcolor.sendProperty(context, "", false, Dvelop_confirmpanel_crearcolor_Internalname, "ConfirmationText", Dvelop_confirmpanel_crearcolor_Confirmationtext);
      Dvelop_confirmpanel_crearcolor_Confirmationtext = Dvelop_confirmpanel_crearcolor_Confirmationtext+httpContext.getMessage( "Color   :", "")+GXutil.trim( A482ForColNom)+GXutil.newLine( ) ;
      ucDvelop_confirmpanel_crearcolor.sendProperty(context, "", false, Dvelop_confirmpanel_crearcolor_Internalname, "ConfirmationText", Dvelop_confirmpanel_crearcolor_Confirmationtext);
      Dvelop_confirmpanel_crearcolor_Confirmationtext = Dvelop_confirmpanel_crearcolor_Confirmationtext+httpContext.getMessage( "Numero  :", "")+GXutil.trim( GXutil.str( A483ForColNum, 6, 0))+GXutil.newLine( ) ;
      ucDvelop_confirmpanel_crearcolor.sendProperty(context, "", false, Dvelop_confirmpanel_crearcolor_Internalname, "ConfirmationText", Dvelop_confirmpanel_crearcolor_Confirmationtext);
      Dvelop_confirmpanel_crearcolor_Confirmationtext = Dvelop_confirmpanel_crearcolor_Confirmationtext+httpContext.getMessage( "TC      :", "")+GXutil.trim( GXutil.str( A831TipColCod, 2, 0))+GXutil.newLine( ) ;
      ucDvelop_confirmpanel_crearcolor.sendProperty(context, "", false, Dvelop_confirmpanel_crearcolor_Internalname, "ConfirmationText", Dvelop_confirmpanel_crearcolor_Confirmationtext);
      Dvelop_confirmpanel_crearcolor_Confirmationtext = Dvelop_confirmpanel_crearcolor_Confirmationtext+" "+GXutil.newLine( ) ;
      ucDvelop_confirmpanel_crearcolor.sendProperty(context, "", false, Dvelop_confirmpanel_crearcolor_Internalname, "ConfirmationText", Dvelop_confirmpanel_crearcolor_Confirmationtext);
      Dvelop_confirmpanel_crearcolor_Confirmationtext = Dvelop_confirmpanel_crearcolor_Confirmationtext+((AV93Equiv==0) ? httpContext.getMessage( "opcion DUPLICADO", "") : httpContext.getMessage( "opcion EQUIVALENTE", ""))+GXutil.newLine( ) ;
      ucDvelop_confirmpanel_crearcolor.sendProperty(context, "", false, Dvelop_confirmpanel_crearcolor_Internalname, "ConfirmationText", Dvelop_confirmpanel_crearcolor_Confirmationtext);
      GXv_int2[0] = AV94Flag ;
      new app.formulaciontinte.pbufori(remoteHandle, context).execute( A396EmprCod, AV19InOutCliCod, AV20InOutForSer, A482ForColNom, A483ForColNum, A831TipColCod, GXv_int2) ;
      seleccioncolortinte_impl.this.AV94Flag = GXv_int2[0] ;
      if ( AV94Flag == 1 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Color Destino, existe ¡¡¡", ""));
      }
      else
      {
         if ( GXutil.strcmp(A7781ForBlo, "S") == 0 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Color Bloqueado !", ""));
         }
         else
         {
            this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_CREARCOLORContainer", "Confirm", "", new Object[] {});
         }
      }
      /*  Sending Event outputs  */
   }

   public void e142D92( )
   {
      /* Dvelop_confirmpanel_crearcolor_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_crearcolor_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION CREARCOLOR' */
         S142 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      cmbavEquiv.setValue( GXutil.trim( GXutil.str( AV93Equiv, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavEquiv.getInternalname(), "Values", cmbavEquiv.ToJavascriptSource(), true);
   }

   public void e172D92( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      AV85WebSession.remove(httpContext.getMessage( "&FilterSeleccionColorTinte_SDT", ""));
      httpContext.setWebReturnParms(new Object[] {AV18InOutEmprCod,Integer.valueOf(AV19InOutCliCod),AV20InOutForSer,AV21InOutForColNom,Integer.valueOf(AV22InOutForColNum),Byte.valueOf(AV23InOutTipColCod),AV70InOutForNomCli,Integer.valueOf(AV71InOutForNumCli),AV72InOutForTonal,AV73InOutForblo,AV15TipColDsc});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV18InOutEmprCod","AV19InOutCliCod","AV20InOutForSer","AV21InOutForColNom","AV22InOutForColNum","AV23InOutTipColCod","AV70InOutForNomCli","AV71InOutForNumCli","AV72InOutForTonal","AV73InOutForblo","AV15TipColDsc"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S122( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV28OrderedBy, 4, 0))+":"+(AV29OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S132( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV30FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30FilterFullText", AV30FilterFullText);
   }

   public void S142( )
   {
      /* 'DO ACTION CREARCOLOR' Routine */
      returnInSub = false ;
      GXv_char6[0] = A396EmprCod ;
      GXv_int10[0] = A252CliCod ;
      GXv_char5[0] = A494ForSer ;
      GXv_char4[0] = A482ForColNom ;
      GXv_int11[0] = A483ForColNum ;
      GXv_int2[0] = A831TipColCod ;
      GXv_int12[0] = AV19InOutCliCod ;
      GXv_char13[0] = AV20InOutForSer ;
      GXv_char14[0] = A482ForColNom ;
      GXv_int15[0] = A483ForColNum ;
      GXv_int16[0] = A831TipColCod ;
      GXv_char17[0] = A1191ForNomCli ;
      GXv_int18[0] = A1192ForNumCli ;
      GXv_int19[0] = AV93Equiv ;
      new app.pdupfork(remoteHandle, context).execute( GXv_char6, GXv_int10, GXv_char5, GXv_char4, GXv_int11, GXv_int2, GXv_int12, GXv_char13, GXv_char14, GXv_int15, GXv_int16, GXv_char17, GXv_int18, GXv_int19) ;
      seleccioncolortinte_impl.this.A396EmprCod = GXv_char6[0] ;
      seleccioncolortinte_impl.this.A252CliCod = GXv_int10[0] ;
      seleccioncolortinte_impl.this.A494ForSer = GXv_char5[0] ;
      seleccioncolortinte_impl.this.A482ForColNom = GXv_char4[0] ;
      seleccioncolortinte_impl.this.A483ForColNum = GXv_int11[0] ;
      seleccioncolortinte_impl.this.A831TipColCod = GXv_int2[0] ;
      seleccioncolortinte_impl.this.AV19InOutCliCod = GXv_int12[0] ;
      seleccioncolortinte_impl.this.AV20InOutForSer = GXv_char13[0] ;
      seleccioncolortinte_impl.this.A482ForColNom = GXv_char14[0] ;
      seleccioncolortinte_impl.this.A483ForColNum = GXv_int15[0] ;
      seleccioncolortinte_impl.this.A831TipColCod = GXv_int16[0] ;
      seleccioncolortinte_impl.this.A1191ForNomCli = GXv_char17[0] ;
      seleccioncolortinte_impl.this.A1192ForNumCli = GXv_int18[0] ;
      seleccioncolortinte_impl.this.AV93Equiv = GXv_int19[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV19InOutCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19InOutCliCod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV20InOutForSer", AV20InOutForSer);
      httpContext.ajax_rsp_assign_attri("", false, "AV93Equiv", GXutil.str( AV93Equiv, 1, 0));
      AV18InOutEmprCod = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18InOutEmprCod", AV18InOutEmprCod);
      AV19InOutCliCod = A252CliCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19InOutCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19InOutCliCod), 6, 0));
      AV20InOutForSer = A494ForSer ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20InOutForSer", AV20InOutForSer);
      AV21InOutForColNom = A482ForColNom ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21InOutForColNom", AV21InOutForColNom);
      AV22InOutForColNum = A483ForColNum ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22InOutForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22InOutForColNum), 6, 0));
      AV23InOutTipColCod = A831TipColCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23InOutTipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23InOutTipColCod), 2, 0));
      AV73InOutForblo = A7781ForBlo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73InOutForblo", AV73InOutForblo);
      AV70InOutForNomCli = A1191ForNomCli ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70InOutForNomCli", AV70InOutForNomCli);
      AV71InOutForNumCli = A1192ForNumCli ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71InOutForNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71InOutForNumCli), 6, 0));
      AV72InOutForTonal = A995ForTonal ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72InOutForTonal", AV72InOutForTonal);
      AV95inouttipcoldsc = A832TipColDsc ;
      AV85WebSession.remove(httpContext.getMessage( "&FilterSeleccionColorTinte_SDT", ""));
      httpContext.setWebReturnParms(new Object[] {AV18InOutEmprCod,Integer.valueOf(AV19InOutCliCod),AV20InOutForSer,AV21InOutForColNom,Integer.valueOf(AV22InOutForColNum),Byte.valueOf(AV23InOutTipColCod),AV70InOutForNomCli,Integer.valueOf(AV71InOutForNumCli),AV72InOutForTonal,AV73InOutForblo,AV15TipColDsc});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV18InOutEmprCod","AV19InOutCliCod","AV20InOutForSer","AV21InOutForColNom","AV22InOutForColNum","AV23InOutTipColCod","AV70InOutForNomCli","AV71InOutForNumCli","AV72InOutForTonal","AV73InOutForblo","AV15TipColDsc"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void e182D92( )
   {
      /* Clicodin_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S152 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV86FilterSeleccionColorTinte_SDT", AV86FilterSeleccionColorTinte_SDT);
   }

   public void e192D92( )
   {
      /* Forserin_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S152 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV86FilterSeleccionColorTinte_SDT", AV86FilterSeleccionColorTinte_SDT);
   }

   public void e202D92( )
   {
      /* Forcolnomin_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S152 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV86FilterSeleccionColorTinte_SDT", AV86FilterSeleccionColorTinte_SDT);
   }

   public void e212D92( )
   {
      /* Forcolnumin_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S152 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV86FilterSeleccionColorTinte_SDT", AV86FilterSeleccionColorTinte_SDT);
   }

   public void e222D92( )
   {
      /* Tipcolcodin_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S152 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV86FilterSeleccionColorTinte_SDT", AV86FilterSeleccionColorTinte_SDT);
   }

   public void S112( )
   {
      /* 'LOADFILTERFORM' Routine */
      returnInSub = false ;
      AV86FilterSeleccionColorTinte_SDT.fromJSonString(AV85WebSession.getValue(httpContext.getMessage( "&FilterSeleccionColorTinte_SDT", "")), null);
      AV80CliCodIN = AV86FilterSeleccionColorTinte_SDT.getgxTv_SdtFilterSeleccionColorTinte_SDT_Clicod() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80CliCodIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80CliCodIN), 6, 0));
      AV81ForSerIN = AV86FilterSeleccionColorTinte_SDT.getgxTv_SdtFilterSeleccionColorTinte_SDT_Forser() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV81ForSerIN", AV81ForSerIN);
      AV82ForColNomIN = AV86FilterSeleccionColorTinte_SDT.getgxTv_SdtFilterSeleccionColorTinte_SDT_Forcolnom() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV82ForColNomIN", AV82ForColNomIN);
      AV83ForColNumIN = AV86FilterSeleccionColorTinte_SDT.getgxTv_SdtFilterSeleccionColorTinte_SDT_Forcolnum() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV83ForColNumIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83ForColNumIN), 6, 0));
      AV12TipColCod = AV86FilterSeleccionColorTinte_SDT.getgxTv_SdtFilterSeleccionColorTinte_SDT_Tipcolcod() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12TipColCod), 2, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOLCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12TipColCod), "Z9")));
   }

   public void S152( )
   {
      /* 'SAVEFILTERFORM' Routine */
      returnInSub = false ;
      AV86FilterSeleccionColorTinte_SDT.setgxTv_SdtFilterSeleccionColorTinte_SDT_Clicod( AV80CliCodIN );
      AV86FilterSeleccionColorTinte_SDT.setgxTv_SdtFilterSeleccionColorTinte_SDT_Forser( AV81ForSerIN );
      AV86FilterSeleccionColorTinte_SDT.setgxTv_SdtFilterSeleccionColorTinte_SDT_Forcolnom( AV82ForColNomIN );
      AV86FilterSeleccionColorTinte_SDT.setgxTv_SdtFilterSeleccionColorTinte_SDT_Forcolnum( AV83ForColNumIN );
      AV86FilterSeleccionColorTinte_SDT.setgxTv_SdtFilterSeleccionColorTinte_SDT_Tipcolcod( AV12TipColCod );
      AV85WebSession.setValue(httpContext.getMessage( "&FilterSeleccionColorTinte_SDT", ""), AV86FilterSeleccionColorTinte_SDT.toJSonString(false, true));
   }

   public void wb_table2_123_2D92( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_crearcolor_Internalname, tblTabledvelop_confirmpanel_crearcolor_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_crearcolor.setProperty("Title", Dvelop_confirmpanel_crearcolor_Title);
         ucDvelop_confirmpanel_crearcolor.setProperty("ConfirmationText", Dvelop_confirmpanel_crearcolor_Confirmationtext);
         ucDvelop_confirmpanel_crearcolor.setProperty("YesButtonCaption", Dvelop_confirmpanel_crearcolor_Yesbuttoncaption);
         ucDvelop_confirmpanel_crearcolor.setProperty("NoButtonCaption", Dvelop_confirmpanel_crearcolor_Nobuttoncaption);
         ucDvelop_confirmpanel_crearcolor.setProperty("CancelButtonCaption", Dvelop_confirmpanel_crearcolor_Cancelbuttoncaption);
         ucDvelop_confirmpanel_crearcolor.setProperty("YesButtonPosition", Dvelop_confirmpanel_crearcolor_Yesbuttonposition);
         ucDvelop_confirmpanel_crearcolor.setProperty("ConfirmType", Dvelop_confirmpanel_crearcolor_Confirmtype);
         ucDvelop_confirmpanel_crearcolor.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_crearcolor_Internalname, "DVELOP_CONFIRMPANEL_CREARCOLORContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_CREARCOLORContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_123_2D92e( true) ;
      }
      else
      {
         wb_table2_123_2D92e( false) ;
      }
   }

   public void wb_table1_76_2D92( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablefilters_Internalname, tblTablefilters_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='CellAlignTopPaddingTop10'>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblCleanfilters_Internalname, httpContext.getMessage( "<i class=\"fas fa-filter CleanFiltersIcon\"></i>", ""), "", "", lblCleanfilters_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'DOCLEANFILTERS\\'."+"'", "", "TextBlock", 5, httpContext.getMessage( "WWP_CleanFiltersTooltip", ""), 1, 1, 0, (short)(1), "HLP_FormulacionTinte\\SeleccionColorTinte.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFilterfulltext_Internalname, httpContext.getMessage( "Filter Full Text", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'" + sGXsfl_88_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV30FilterFullText, GXutil.rtrim( localUtil.format( AV30FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,82);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_FormulacionTinte\\SeleccionColorTinte.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_76_2D92e( true) ;
      }
      else
      {
         wb_table1_76_2D92e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV18InOutEmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18InOutEmprCod", AV18InOutEmprCod);
      AV19InOutCliCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19InOutCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19InOutCliCod), 6, 0));
      AV20InOutForSer = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20InOutForSer", AV20InOutForSer);
      AV21InOutForColNom = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21InOutForColNom", AV21InOutForColNom);
      AV22InOutForColNum = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22InOutForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22InOutForColNum), 6, 0));
      AV23InOutTipColCod = ((Number) GXutil.testNumericType( getParm(obj,5), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23InOutTipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23InOutTipColCod), 2, 0));
      AV70InOutForNomCli = (String)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70InOutForNomCli", AV70InOutForNomCli);
      AV71InOutForNumCli = ((Number) GXutil.testNumericType( getParm(obj,7), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71InOutForNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71InOutForNumCli), 6, 0));
      AV72InOutForTonal = (String)getParm(obj,8) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72InOutForTonal", AV72InOutForTonal);
      AV73InOutForblo = (String)getParm(obj,9) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73InOutForblo", AV73InOutForblo);
      AV15TipColDsc = (String)getParm(obj,10) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15TipColDsc", AV15TipColDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOLDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15TipColDsc, ""))));
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
      pa2D92( ) ;
      ws2D92( ) ;
      we2D92( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20269178551536", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/seleccioncolortinte.js", "?20269178551536", false, true);
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
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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

   public void subsflControlProps_882( )
   {
      edtavSelect_Internalname = "vSELECT_"+sGXsfl_88_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_88_idx ;
      edtForSer_Internalname = "FORSER_"+sGXsfl_88_idx ;
      edtForSerDsc_Internalname = "FORSERDSC_"+sGXsfl_88_idx ;
      edtForColNom_Internalname = "FORCOLNOM_"+sGXsfl_88_idx ;
      edtForColNum_Internalname = "FORCOLNUM_"+sGXsfl_88_idx ;
      edtTipColCod_Internalname = "TIPCOLCOD_"+sGXsfl_88_idx ;
      edtTipColDsc_Internalname = "TIPCOLDSC_"+sGXsfl_88_idx ;
      edtForNomCli_Internalname = "FORNOMCLI_"+sGXsfl_88_idx ;
      edtForNumCli_Internalname = "FORNUMCLI_"+sGXsfl_88_idx ;
      edtIntDsc_Internalname = "INTDSC_"+sGXsfl_88_idx ;
      edtForTonal_Internalname = "FORTONAL_"+sGXsfl_88_idx ;
      edtForFec_Internalname = "FORFEC_"+sGXsfl_88_idx ;
      edtForUltMod_Internalname = "FORULTMOD_"+sGXsfl_88_idx ;
      cmbForBlo.setInternalname( "FORBLO_"+sGXsfl_88_idx );
      edtForNumArc_Internalname = "FORNUMARC_"+sGXsfl_88_idx ;
      edtForFecApr_Internalname = "FORFECAPR_"+sGXsfl_88_idx ;
      edtForOpcCli_Internalname = "FOROPCCLI_"+sGXsfl_88_idx ;
      edtForNumCol_Internalname = "FORNUMCOL_"+sGXsfl_88_idx ;
   }

   public void subsflControlProps_fel_882( )
   {
      edtavSelect_Internalname = "vSELECT_"+sGXsfl_88_fel_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_88_fel_idx ;
      edtForSer_Internalname = "FORSER_"+sGXsfl_88_fel_idx ;
      edtForSerDsc_Internalname = "FORSERDSC_"+sGXsfl_88_fel_idx ;
      edtForColNom_Internalname = "FORCOLNOM_"+sGXsfl_88_fel_idx ;
      edtForColNum_Internalname = "FORCOLNUM_"+sGXsfl_88_fel_idx ;
      edtTipColCod_Internalname = "TIPCOLCOD_"+sGXsfl_88_fel_idx ;
      edtTipColDsc_Internalname = "TIPCOLDSC_"+sGXsfl_88_fel_idx ;
      edtForNomCli_Internalname = "FORNOMCLI_"+sGXsfl_88_fel_idx ;
      edtForNumCli_Internalname = "FORNUMCLI_"+sGXsfl_88_fel_idx ;
      edtIntDsc_Internalname = "INTDSC_"+sGXsfl_88_fel_idx ;
      edtForTonal_Internalname = "FORTONAL_"+sGXsfl_88_fel_idx ;
      edtForFec_Internalname = "FORFEC_"+sGXsfl_88_fel_idx ;
      edtForUltMod_Internalname = "FORULTMOD_"+sGXsfl_88_fel_idx ;
      cmbForBlo.setInternalname( "FORBLO_"+sGXsfl_88_fel_idx );
      edtForNumArc_Internalname = "FORNUMARC_"+sGXsfl_88_fel_idx ;
      edtForFecApr_Internalname = "FORFECAPR_"+sGXsfl_88_fel_idx ;
      edtForOpcCli_Internalname = "FOROPCCLI_"+sGXsfl_88_fel_idx ;
      edtForNumCol_Internalname = "FORNUMCOL_"+sGXsfl_88_fel_idx ;
   }

   public void sendrow_882( )
   {
      subsflControlProps_882( ) ;
      wb2D90( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_88_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_88_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_88_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavSelect_Enabled!=0)&&(edtavSelect_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 89,'',false,'"+sGXsfl_88_idx+"',88)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSelect_Internalname,GXutil.rtrim( AV66Select),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavSelect_Enabled!=0)&&(edtavSelect_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,89);\"" : " "),"'"+""+"'"+",false,"+"'"+"EENTER."+sGXsfl_88_idx+"'","","",httpContext.getMessage( "GX_BtnSelect", ""),"",edtavSelect_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,edtavSelect_Columnclass,edtavSelect_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavSelect_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtCliCod_Columnclass,edtCliCod_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForSer_Internalname,GXutil.rtrim( A494ForSer),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtForSer_Columnclass,edtForSer_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForSerDsc_Internalname,GXutil.rtrim( A5742ForSerDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForSerDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtForSerDsc_Columnclass,edtForSerDsc_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForColNom_Internalname,GXutil.rtrim( A482ForColNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtForColNom_Columnclass,edtForColNom_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A483ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtForColNum_Columnclass,edtForColNum_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipColCod_Internalname,GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipColCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtTipColCod_Columnclass,edtTipColCod_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipColDsc_Internalname,GXutil.rtrim( A832TipColDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipColDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtTipColDsc_Columnclass,edtTipColDsc_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForNomCli_Internalname,GXutil.rtrim( A1191ForNomCli),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForNomCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtForNomCli_Columnclass,edtForNomCli_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForNumCli_Internalname,GXutil.ltrim( localUtil.ntoc( A1192ForNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1192ForNumCli), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForNumCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtForNumCli_Columnclass,edtForNumCli_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtIntDsc_Internalname,GXutil.rtrim( A584IntDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtIntDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtIntDsc_Columnclass,edtIntDsc_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForTonal_Internalname,GXutil.rtrim( A995ForTonal),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForTonal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtForTonal_Columnclass,edtForTonal_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForFec_Internalname,localUtil.format(A485ForFec, "99/99/99"),localUtil.format( A485ForFec, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtForFec_Columnclass,edtForFec_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForUltMod_Internalname,localUtil.format(A495ForUltMod, "99/99/99"),localUtil.format( A495ForUltMod, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForUltMod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtForUltMod_Columnclass,edtForUltMod_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( cmbForBlo.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "FORBLO_" + sGXsfl_88_idx ;
            cmbForBlo.setName( GXCCtl );
            cmbForBlo.setWebtags( "" );
            cmbForBlo.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
            cmbForBlo.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
            if ( cmbForBlo.getItemCount() > 0 )
            {
               A7781ForBlo = cmbForBlo.getValidValue(A7781ForBlo) ;
               n7781ForBlo = false ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbForBlo,cmbForBlo.getInternalname(),GXutil.rtrim( A7781ForBlo),Integer.valueOf(1),cmbForBlo.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute",cmbForBlo.getColumnClass(),cmbForBlo.getColumnHeaderClass(),"","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbForBlo.setValue( GXutil.rtrim( A7781ForBlo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbForBlo.getInternalname(), "Values", cmbForBlo.ToJavascriptSource(), !bGXsfl_88_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForNumArc_Internalname,GXutil.ltrim( localUtil.ntoc( A3315ForNumArc, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3315ForNumArc), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForNumArc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtForNumArc_Columnclass,edtForNumArc_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForFecApr_Internalname,localUtil.format(A3558ForFecApr, "99/99/99"),localUtil.format( A3558ForFecApr, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForFecApr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtForFecApr_Columnclass,edtForFecApr_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForOpcCli_Internalname,GXutil.rtrim( A3560ForOpcCli),GXutil.rtrim( localUtil.format( A3560ForOpcCli, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForOpcCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtForOpcCli_Columnclass,edtForOpcCli_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForNumCol_Internalname,GXutil.ltrim( localUtil.ntoc( A486ForNumCol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A486ForNumCol), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForNumCol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtForNumCol_Columnclass,edtForNumCol_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes2D92( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_88_idx = ((subGrid_Islastpage==1)&&(nGXsfl_88_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_88_idx+1) ;
         sGXsfl_88_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_88_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_882( ) ;
      }
      /* End function sendrow_882 */
   }

   public void startgridcontrol88( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"88\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "TC", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Intensidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coleccion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Formula", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ultima Modificacion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Blq?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Ensayo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Aprob.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Opcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Formula", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV66Select));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavSelect_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavSelect_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSelect_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtCliCod_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtCliCod_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A494ForSer));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtForSer_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtForSer_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5742ForSerDsc));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtForSerDsc_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtForSerDsc_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A482ForColNom));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtForColNom_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtForColNom_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A483ForColNum, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtForColNum_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtForColNum_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtTipColCod_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtTipColCod_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A832TipColDsc));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtTipColDsc_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtTipColDsc_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1191ForNomCli));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtForNomCli_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtForNomCli_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1192ForNumCli, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtForNumCli_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtForNumCli_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A584IntDsc));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtIntDsc_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtIntDsc_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A995ForTonal));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtForTonal_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtForTonal_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A485ForFec, "99/99/99"));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtForFec_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtForFec_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A495ForUltMod, "99/99/99"));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtForUltMod_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtForUltMod_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A7781ForBlo));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbForBlo.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbForBlo.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3315ForNumArc, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtForNumArc_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtForNumArc_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A3558ForFecApr, "99/99/99"));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtForFecApr_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtForFecApr_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3560ForOpcCli));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtForOpcCli_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtForOpcCli_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A486ForNumCol, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtForNumCol_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtForNumCol_Columnheaderclass));
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
      cmbavEquiv.setInternalname( "vEQUIV" );
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      bttBtncrearcolor_Internalname = "BTNCREARCOLOR" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      edtavInoutclicod_Internalname = "vINOUTCLICOD" ;
      edtavInoutforser_Internalname = "vINOUTFORSER" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      Dvpanel_unnamedtable6_Internalname = "DVPANEL_UNNAMEDTABLE6" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      edtavClicodin_Internalname = "vCLICODIN" ;
      edtavForserin_Internalname = "vFORSERIN" ;
      edtavForcolnomin_Internalname = "vFORCOLNOMIN" ;
      edtavForcolnumin_Internalname = "vFORCOLNUMIN" ;
      edtavTipcolcodin_Internalname = "vTIPCOLCODIN" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      lblCleanfilters_Internalname = "CLEANFILTERS" ;
      edtavFilterfulltext_Internalname = "vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = "TABLEFILTERS" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      edtavSelect_Internalname = "vSELECT" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtForSer_Internalname = "FORSER" ;
      edtForSerDsc_Internalname = "FORSERDSC" ;
      edtForColNom_Internalname = "FORCOLNOM" ;
      edtForColNum_Internalname = "FORCOLNUM" ;
      edtTipColCod_Internalname = "TIPCOLCOD" ;
      edtTipColDsc_Internalname = "TIPCOLDSC" ;
      edtForNomCli_Internalname = "FORNOMCLI" ;
      edtForNumCli_Internalname = "FORNUMCLI" ;
      edtIntDsc_Internalname = "INTDSC" ;
      edtForTonal_Internalname = "FORTONAL" ;
      edtForFec_Internalname = "FORFEC" ;
      edtForUltMod_Internalname = "FORULTMOD" ;
      cmbForBlo.setInternalname( "FORBLO" );
      edtForNumArc_Internalname = "FORNUMARC" ;
      edtForFecApr_Internalname = "FORFECAPR" ;
      edtForOpcCli_Internalname = "FOROPCCLI" ;
      edtForNumCol_Internalname = "FORNUMCOL" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      Dvelop_confirmpanel_crearcolor_Internalname = "DVELOP_CONFIRMPANEL_CREARCOLOR" ;
      tblTabledvelop_confirmpanel_crearcolor_Internalname = "TABLEDVELOP_CONFIRMPANEL_CREARCOLOR" ;
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
      edtForNumCol_Jsonclick = "" ;
      edtForNumCol_Columnclass = "WWColumn hidden-xs" ;
      edtForOpcCli_Jsonclick = "" ;
      edtForOpcCli_Columnclass = "WWColumn hidden-xs" ;
      edtForFecApr_Jsonclick = "" ;
      edtForFecApr_Columnclass = "WWColumn hidden-xs" ;
      edtForNumArc_Jsonclick = "" ;
      edtForNumArc_Columnclass = "WWColumn hidden-xs" ;
      cmbForBlo.setJsonclick( "" );
      cmbForBlo.setColumnClass( "WWColumn hidden-xs" );
      edtForUltMod_Jsonclick = "" ;
      edtForUltMod_Columnclass = "WWColumn hidden-xs" ;
      edtForFec_Jsonclick = "" ;
      edtForFec_Columnclass = "WWColumn hidden-xs" ;
      edtForTonal_Jsonclick = "" ;
      edtForTonal_Columnclass = "WWColumn hidden-xs" ;
      edtIntDsc_Jsonclick = "" ;
      edtIntDsc_Columnclass = "WWColumn hidden-xs" ;
      edtForNumCli_Jsonclick = "" ;
      edtForNumCli_Columnclass = "WWColumn hidden-xs" ;
      edtForNomCli_Jsonclick = "" ;
      edtForNomCli_Columnclass = "WWColumn hidden-xs" ;
      edtTipColDsc_Jsonclick = "" ;
      edtTipColDsc_Columnclass = "WWColumn hidden-xs" ;
      edtTipColCod_Jsonclick = "" ;
      edtTipColCod_Columnclass = "WWColumn hidden-xs" ;
      edtForColNum_Jsonclick = "" ;
      edtForColNum_Columnclass = "WWColumn hidden-xs" ;
      edtForColNom_Jsonclick = "" ;
      edtForColNom_Columnclass = "WWColumn hidden-xs" ;
      edtForSerDsc_Jsonclick = "" ;
      edtForSerDsc_Columnclass = "WWColumn" ;
      edtForSer_Jsonclick = "" ;
      edtForSer_Columnclass = "WWColumn hidden-xs" ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Columnclass = "WWColumn hidden-xs" ;
      edtavSelect_Jsonclick = "" ;
      edtavSelect_Columnclass = "WWIconActionColumn" ;
      edtavSelect_Visible = -1 ;
      edtavSelect_Enabled = 1 ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtForNumCol_Columnheaderclass = "" ;
      edtForOpcCli_Columnheaderclass = "" ;
      edtForFecApr_Columnheaderclass = "" ;
      edtForNumArc_Columnheaderclass = "" ;
      cmbForBlo.setColumnHeaderClass( "" );
      edtForUltMod_Columnheaderclass = "" ;
      edtForFec_Columnheaderclass = "" ;
      edtForTonal_Columnheaderclass = "" ;
      edtIntDsc_Columnheaderclass = "" ;
      edtForNumCli_Columnheaderclass = "" ;
      edtForNomCli_Columnheaderclass = "" ;
      edtTipColDsc_Columnheaderclass = "" ;
      edtTipColCod_Columnheaderclass = "" ;
      edtForColNum_Columnheaderclass = "" ;
      edtForColNom_Columnheaderclass = "" ;
      edtForSerDsc_Columnheaderclass = "" ;
      edtForSer_Columnheaderclass = "" ;
      edtCliCod_Columnheaderclass = "" ;
      edtavSelect_Columnheaderclass = "" ;
      subGrid_Sortable = (byte)(0) ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavTipcolcodin_Jsonclick = "" ;
      edtavTipcolcodin_Enabled = 1 ;
      edtavForcolnumin_Jsonclick = "" ;
      edtavForcolnumin_Enabled = 1 ;
      edtavForcolnomin_Jsonclick = "" ;
      edtavForcolnomin_Enabled = 1 ;
      edtavForserin_Jsonclick = "" ;
      edtavForserin_Enabled = 1 ;
      edtavClicodin_Jsonclick = "" ;
      edtavClicodin_Enabled = 1 ;
      edtavInoutforser_Jsonclick = "" ;
      edtavInoutforser_Enabled = 0 ;
      edtavInoutclicod_Jsonclick = "" ;
      edtavInoutclicod_Enabled = 0 ;
      cmbavEquiv.setJsonclick( "" );
      cmbavEquiv.setEnabled( 1 );
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_crearcolor_Confirmtype = "1" ;
      Dvelop_confirmpanel_crearcolor_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_crearcolor_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_crearcolor_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_crearcolor_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_crearcolor_Confirmationtext = "¿Desea Crear Color?" ;
      Dvelop_confirmpanel_crearcolor_Title = "" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19" ;
      Ddo_grid_Columnids = "1:CliCod|2:ForSer|3:ForSerDsc|4:ForColNom|5:ForColNum|6:TipColCod|7:TipColDsc|8:ForNomCli|9:ForNumCli|10:IntDsc|11:ForTonal|12:ForFec|13:ForUltMod|14:ForBlo|15:ForNumArc|16:ForFecApr|17:ForOpcCli|18:ForNumCol" ;
      Ddo_grid_Gridinternalname = "" ;
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
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "Filtros", "") ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Crear Color", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Dvpanel_unnamedtable6_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Iconposition = "Right" ;
      Dvpanel_unnamedtable6_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable6_Title = httpContext.getMessage( "Origen", "") ;
      Dvpanel_unnamedtable6_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable6_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable6_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Selecciona Mto Formulas Tinte", "") );
      subGrid_Rows = 0 ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavEquiv.setName( "vEQUIV" );
      cmbavEquiv.setWebtags( "" );
      cmbavEquiv.addItem("1", httpContext.getMessage( "Equivalente", ""), (short)(0));
      cmbavEquiv.addItem("0", httpContext.getMessage( "Duplicado", ""), (short)(0));
      if ( cmbavEquiv.getItemCount() > 0 )
      {
         AV93Equiv = (byte)(GXutil.lval( cmbavEquiv.getValidValue(GXutil.trim( GXutil.str( AV93Equiv, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV93Equiv", GXutil.str( AV93Equiv, 1, 0));
      }
      GXCCtl = "FORBLO_" + sGXsfl_88_idx ;
      cmbForBlo.setName( GXCCtl );
      cmbForBlo.setWebtags( "" );
      cmbForBlo.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbForBlo.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbForBlo.getItemCount() > 0 )
      {
         A7781ForBlo = cmbForBlo.getValidValue(A7781ForBlo) ;
         n7781ForBlo = false ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV80CliCodIN',fld:'vCLICODIN',pic:'ZZZZZ9'},{av:'AV81ForSerIN',fld:'vFORSERIN',pic:''},{av:'AV82ForColNomIN',fld:'vFORCOLNOMIN',pic:''},{av:'AV83ForColNumIN',fld:'vFORCOLNUMIN',pic:'ZZZZZ9'},{av:'AV87TipColCodIN',fld:'vTIPCOLCODIN',pic:'Z9'},{av:'AV30FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV18InOutEmprCod',fld:'vINOUTEMPRCOD',pic:'@!'},{av:'AV12TipColCod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true},{av:'AV15TipColDsc',fld:'vTIPCOLDSC',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV64GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV65GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtavSelect_Columnheaderclass',ctrl:'vSELECT',prop:'Columnheaderclass'},{av:'edtCliCod_Columnheaderclass',ctrl:'CLICOD',prop:'Columnheaderclass'},{av:'edtForSer_Columnheaderclass',ctrl:'FORSER',prop:'Columnheaderclass'},{av:'edtForSerDsc_Columnheaderclass',ctrl:'FORSERDSC',prop:'Columnheaderclass'},{av:'edtForColNom_Columnheaderclass',ctrl:'FORCOLNOM',prop:'Columnheaderclass'},{av:'edtForColNum_Columnheaderclass',ctrl:'FORCOLNUM',prop:'Columnheaderclass'},{av:'edtTipColCod_Columnheaderclass',ctrl:'TIPCOLCOD',prop:'Columnheaderclass'},{av:'edtTipColDsc_Columnheaderclass',ctrl:'TIPCOLDSC',prop:'Columnheaderclass'},{av:'edtForNomCli_Columnheaderclass',ctrl:'FORNOMCLI',prop:'Columnheaderclass'},{av:'edtForNumCli_Columnheaderclass',ctrl:'FORNUMCLI',prop:'Columnheaderclass'},{av:'edtIntDsc_Columnheaderclass',ctrl:'INTDSC',prop:'Columnheaderclass'},{av:'edtForTonal_Columnheaderclass',ctrl:'FORTONAL',prop:'Columnheaderclass'},{av:'edtForFec_Columnheaderclass',ctrl:'FORFEC',prop:'Columnheaderclass'},{av:'edtForUltMod_Columnheaderclass',ctrl:'FORULTMOD',prop:'Columnheaderclass'},{av:'cmbForBlo'},{av:'edtForNumArc_Columnheaderclass',ctrl:'FORNUMARC',prop:'Columnheaderclass'},{av:'edtForFecApr_Columnheaderclass',ctrl:'FORFECAPR',prop:'Columnheaderclass'},{av:'edtForOpcCli_Columnheaderclass',ctrl:'FOROPCCLI',prop:'Columnheaderclass'},{av:'edtForNumCol_Columnheaderclass',ctrl:'FORNUMCOL',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e112D92',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV80CliCodIN',fld:'vCLICODIN',pic:'ZZZZZ9'},{av:'AV81ForSerIN',fld:'vFORSERIN',pic:''},{av:'AV82ForColNomIN',fld:'vFORCOLNOMIN',pic:''},{av:'AV83ForColNumIN',fld:'vFORCOLNUMIN',pic:'ZZZZZ9'},{av:'AV87TipColCodIN',fld:'vTIPCOLCODIN',pic:'Z9'},{av:'AV30FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV18InOutEmprCod',fld:'vINOUTEMPRCOD',pic:'@!'},{av:'AV12TipColCod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true},{av:'AV15TipColDsc',fld:'vTIPCOLDSC',pic:'',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e122D92',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV80CliCodIN',fld:'vCLICODIN',pic:'ZZZZZ9'},{av:'AV81ForSerIN',fld:'vFORSERIN',pic:''},{av:'AV82ForColNomIN',fld:'vFORCOLNOMIN',pic:''},{av:'AV83ForColNumIN',fld:'vFORCOLNUMIN',pic:'ZZZZZ9'},{av:'AV87TipColCodIN',fld:'vTIPCOLCODIN',pic:'Z9'},{av:'AV30FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV18InOutEmprCod',fld:'vINOUTEMPRCOD',pic:'@!'},{av:'AV12TipColCod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true},{av:'AV15TipColDsc',fld:'vTIPCOLDSC',pic:'',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e132D92',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV80CliCodIN',fld:'vCLICODIN',pic:'ZZZZZ9'},{av:'AV81ForSerIN',fld:'vFORSERIN',pic:''},{av:'AV82ForColNomIN',fld:'vFORCOLNOMIN',pic:''},{av:'AV83ForColNumIN',fld:'vFORCOLNUMIN',pic:'ZZZZZ9'},{av:'AV87TipColCodIN',fld:'vTIPCOLCODIN',pic:'Z9'},{av:'AV30FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV18InOutEmprCod',fld:'vINOUTEMPRCOD',pic:'@!'},{av:'AV12TipColCod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true},{av:'AV15TipColDsc',fld:'vTIPCOLDSC',pic:'',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'AV28OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV29OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV28OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV29OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e252D92',iparms:[{av:'cmbForBlo'},{av:'A7781ForBlo',fld:'FORBLO',pic:'@!',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV66Select',fld:'vSELECT',pic:''},{av:'edtavSelect_Columnclass',ctrl:'vSELECT',prop:'Columnclass'},{av:'edtCliCod_Columnclass',ctrl:'CLICOD',prop:'Columnclass'},{av:'edtForSer_Columnclass',ctrl:'FORSER',prop:'Columnclass'},{av:'edtForSerDsc_Columnclass',ctrl:'FORSERDSC',prop:'Columnclass'},{av:'edtForColNom_Columnclass',ctrl:'FORCOLNOM',prop:'Columnclass'},{av:'edtForColNum_Columnclass',ctrl:'FORCOLNUM',prop:'Columnclass'},{av:'edtTipColCod_Columnclass',ctrl:'TIPCOLCOD',prop:'Columnclass'},{av:'edtTipColDsc_Columnclass',ctrl:'TIPCOLDSC',prop:'Columnclass'},{av:'edtForNomCli_Columnclass',ctrl:'FORNOMCLI',prop:'Columnclass'},{av:'edtForNumCli_Columnclass',ctrl:'FORNUMCLI',prop:'Columnclass'},{av:'edtIntDsc_Columnclass',ctrl:'INTDSC',prop:'Columnclass'},{av:'edtForTonal_Columnclass',ctrl:'FORTONAL',prop:'Columnclass'},{av:'edtForFec_Columnclass',ctrl:'FORFEC',prop:'Columnclass'},{av:'edtForUltMod_Columnclass',ctrl:'FORULTMOD',prop:'Columnclass'},{av:'cmbForBlo'},{av:'edtForNumArc_Columnclass',ctrl:'FORNUMARC',prop:'Columnclass'},{av:'edtForFecApr_Columnclass',ctrl:'FORFECAPR',prop:'Columnclass'},{av:'edtForOpcCli_Columnclass',ctrl:'FOROPCCLI',prop:'Columnclass'},{av:'edtForNumCol_Columnclass',ctrl:'FORNUMCOL',prop:'Columnclass'}]}");
      setEventMetadata("ENTER","{handler:'e262D92',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'cmbForBlo'},{av:'A7781ForBlo',fld:'FORBLO',pic:'@!',hsh:true},{av:'A1191ForNomCli',fld:'FORNOMCLI',pic:''},{av:'A1192ForNumCli',fld:'FORNUMCLI',pic:'ZZZZZ9'},{av:'A995ForTonal',fld:'FORTONAL',pic:'',hsh:true},{av:'A832TipColDsc',fld:'TIPCOLDSC',pic:''},{av:'AV15TipColDsc',fld:'vTIPCOLDSC',pic:'',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV18InOutEmprCod',fld:'vINOUTEMPRCOD',pic:'@!'},{av:'AV19InOutCliCod',fld:'vINOUTCLICOD',pic:'ZZZZZ9'},{av:'AV20InOutForSer',fld:'vINOUTFORSER',pic:''},{av:'AV21InOutForColNom',fld:'vINOUTFORCOLNOM',pic:''},{av:'AV22InOutForColNum',fld:'vINOUTFORCOLNUM',pic:'ZZZZZ9'},{av:'AV23InOutTipColCod',fld:'vINOUTTIPCOLCOD',pic:'Z9'},{av:'AV73InOutForblo',fld:'vINOUTFORBLO',pic:'@!'},{av:'AV70InOutForNomCli',fld:'vINOUTFORNOMCLI',pic:''},{av:'AV71InOutForNumCli',fld:'vINOUTFORNUMCLI',pic:'ZZZZZ9'},{av:'AV72InOutForTonal',fld:'vINOUTFORTONAL',pic:''}]}");
      setEventMetadata("'DOCLEANFILTERS'","{handler:'e152D92',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV80CliCodIN',fld:'vCLICODIN',pic:'ZZZZZ9'},{av:'AV81ForSerIN',fld:'vFORSERIN',pic:''},{av:'AV82ForColNomIN',fld:'vFORCOLNOMIN',pic:''},{av:'AV83ForColNumIN',fld:'vFORCOLNUMIN',pic:'ZZZZZ9'},{av:'AV87TipColCodIN',fld:'vTIPCOLCODIN',pic:'Z9'},{av:'AV30FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV18InOutEmprCod',fld:'vINOUTEMPRCOD',pic:'@!'},{av:'AV12TipColCod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true},{av:'AV15TipColDsc',fld:'vTIPCOLDSC',pic:'',hsh:true}]");
      setEventMetadata("'DOCLEANFILTERS'",",oparms:[{av:'AV30FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV64GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV65GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtavSelect_Columnheaderclass',ctrl:'vSELECT',prop:'Columnheaderclass'},{av:'edtCliCod_Columnheaderclass',ctrl:'CLICOD',prop:'Columnheaderclass'},{av:'edtForSer_Columnheaderclass',ctrl:'FORSER',prop:'Columnheaderclass'},{av:'edtForSerDsc_Columnheaderclass',ctrl:'FORSERDSC',prop:'Columnheaderclass'},{av:'edtForColNom_Columnheaderclass',ctrl:'FORCOLNOM',prop:'Columnheaderclass'},{av:'edtForColNum_Columnheaderclass',ctrl:'FORCOLNUM',prop:'Columnheaderclass'},{av:'edtTipColCod_Columnheaderclass',ctrl:'TIPCOLCOD',prop:'Columnheaderclass'},{av:'edtTipColDsc_Columnheaderclass',ctrl:'TIPCOLDSC',prop:'Columnheaderclass'},{av:'edtForNomCli_Columnheaderclass',ctrl:'FORNOMCLI',prop:'Columnheaderclass'},{av:'edtForNumCli_Columnheaderclass',ctrl:'FORNUMCLI',prop:'Columnheaderclass'},{av:'edtIntDsc_Columnheaderclass',ctrl:'INTDSC',prop:'Columnheaderclass'},{av:'edtForTonal_Columnheaderclass',ctrl:'FORTONAL',prop:'Columnheaderclass'},{av:'edtForFec_Columnheaderclass',ctrl:'FORFEC',prop:'Columnheaderclass'},{av:'edtForUltMod_Columnheaderclass',ctrl:'FORULTMOD',prop:'Columnheaderclass'},{av:'cmbForBlo'},{av:'edtForNumArc_Columnheaderclass',ctrl:'FORNUMARC',prop:'Columnheaderclass'},{av:'edtForFecApr_Columnheaderclass',ctrl:'FORFECAPR',prop:'Columnheaderclass'},{av:'edtForOpcCli_Columnheaderclass',ctrl:'FOROPCCLI',prop:'Columnheaderclass'},{av:'edtForNumCol_Columnheaderclass',ctrl:'FORNUMCOL',prop:'Columnheaderclass'}]}");
      setEventMetadata("'DOCREARCOLOR'","{handler:'e162D92',iparms:[{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'AV19InOutCliCod',fld:'vINOUTCLICOD',pic:'ZZZZZ9'},{av:'AV20InOutForSer',fld:'vINOUTFORSER',pic:''},{av:'cmbavEquiv'},{av:'AV93Equiv',fld:'vEQUIV',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'cmbForBlo'},{av:'A7781ForBlo',fld:'FORBLO',pic:'@!',hsh:true}]");
      setEventMetadata("'DOCREARCOLOR'",",oparms:[{av:'Dvelop_confirmpanel_crearcolor_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_CREARCOLOR',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_CREARCOLOR.CLOSE","{handler:'e142D92',iparms:[{av:'Dvelop_confirmpanel_crearcolor_Result',ctrl:'DVELOP_CONFIRMPANEL_CREARCOLOR',prop:'Result'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'AV19InOutCliCod',fld:'vINOUTCLICOD',pic:'ZZZZZ9'},{av:'AV20InOutForSer',fld:'vINOUTFORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A1191ForNomCli',fld:'FORNOMCLI',pic:''},{av:'A1192ForNumCli',fld:'FORNUMCLI',pic:'ZZZZZ9'},{av:'cmbavEquiv'},{av:'AV93Equiv',fld:'vEQUIV',pic:'9'},{av:'cmbForBlo'},{av:'A7781ForBlo',fld:'FORBLO',pic:'@!',hsh:true},{av:'A995ForTonal',fld:'FORTONAL',pic:'',hsh:true},{av:'A832TipColDsc',fld:'TIPCOLDSC',pic:''},{av:'AV15TipColDsc',fld:'vTIPCOLDSC',pic:'',hsh:true}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_CREARCOLOR.CLOSE",",oparms:[{av:'cmbavEquiv'},{av:'AV93Equiv',fld:'vEQUIV',pic:'9'},{av:'A1192ForNumCli',fld:'FORNUMCLI',pic:'ZZZZZ9'},{av:'A1191ForNomCli',fld:'FORNOMCLI',pic:''},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'AV20InOutForSer',fld:'vINOUTFORSER',pic:''},{av:'AV19InOutCliCod',fld:'vINOUTCLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV18InOutEmprCod',fld:'vINOUTEMPRCOD',pic:'@!'},{av:'AV21InOutForColNom',fld:'vINOUTFORCOLNOM',pic:''},{av:'AV22InOutForColNum',fld:'vINOUTFORCOLNUM',pic:'ZZZZZ9'},{av:'AV23InOutTipColCod',fld:'vINOUTTIPCOLCOD',pic:'Z9'},{av:'AV73InOutForblo',fld:'vINOUTFORBLO',pic:'@!'},{av:'AV70InOutForNomCli',fld:'vINOUTFORNOMCLI',pic:''},{av:'AV71InOutForNumCli',fld:'vINOUTFORNUMCLI',pic:'ZZZZZ9'},{av:'AV72InOutForTonal',fld:'vINOUTFORTONAL',pic:''}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e172D92',iparms:[{av:'AV15TipColDsc',fld:'vTIPCOLDSC',pic:'',hsh:true},{av:'AV73InOutForblo',fld:'vINOUTFORBLO',pic:'@!'},{av:'AV72InOutForTonal',fld:'vINOUTFORTONAL',pic:''},{av:'AV71InOutForNumCli',fld:'vINOUTFORNUMCLI',pic:'ZZZZZ9'},{av:'AV70InOutForNomCli',fld:'vINOUTFORNOMCLI',pic:''},{av:'AV23InOutTipColCod',fld:'vINOUTTIPCOLCOD',pic:'Z9'},{av:'AV22InOutForColNum',fld:'vINOUTFORCOLNUM',pic:'ZZZZZ9'},{av:'AV21InOutForColNom',fld:'vINOUTFORCOLNOM',pic:''},{av:'AV20InOutForSer',fld:'vINOUTFORSER',pic:''},{av:'AV19InOutCliCod',fld:'vINOUTCLICOD',pic:'ZZZZZ9'},{av:'AV18InOutEmprCod',fld:'vINOUTEMPRCOD',pic:'@!'}]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("VCLICODIN.CONTROLVALUECHANGED","{handler:'e182D92',iparms:[{av:'AV80CliCodIN',fld:'vCLICODIN',pic:'ZZZZZ9'},{av:'AV86FilterSeleccionColorTinte_SDT',fld:'vFILTERSELECCIONCOLORTINTE_SDT',pic:''},{av:'AV81ForSerIN',fld:'vFORSERIN',pic:''},{av:'AV82ForColNomIN',fld:'vFORCOLNOMIN',pic:''},{av:'AV83ForColNumIN',fld:'vFORCOLNUMIN',pic:'ZZZZZ9'},{av:'AV12TipColCod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true}]");
      setEventMetadata("VCLICODIN.CONTROLVALUECHANGED",",oparms:[{av:'AV86FilterSeleccionColorTinte_SDT',fld:'vFILTERSELECCIONCOLORTINTE_SDT',pic:''}]}");
      setEventMetadata("VFORSERIN.CONTROLVALUECHANGED","{handler:'e192D92',iparms:[{av:'AV80CliCodIN',fld:'vCLICODIN',pic:'ZZZZZ9'},{av:'AV86FilterSeleccionColorTinte_SDT',fld:'vFILTERSELECCIONCOLORTINTE_SDT',pic:''},{av:'AV81ForSerIN',fld:'vFORSERIN',pic:''},{av:'AV82ForColNomIN',fld:'vFORCOLNOMIN',pic:''},{av:'AV83ForColNumIN',fld:'vFORCOLNUMIN',pic:'ZZZZZ9'},{av:'AV12TipColCod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true}]");
      setEventMetadata("VFORSERIN.CONTROLVALUECHANGED",",oparms:[{av:'AV86FilterSeleccionColorTinte_SDT',fld:'vFILTERSELECCIONCOLORTINTE_SDT',pic:''}]}");
      setEventMetadata("VFORCOLNOMIN.CONTROLVALUECHANGED","{handler:'e202D92',iparms:[{av:'AV80CliCodIN',fld:'vCLICODIN',pic:'ZZZZZ9'},{av:'AV86FilterSeleccionColorTinte_SDT',fld:'vFILTERSELECCIONCOLORTINTE_SDT',pic:''},{av:'AV81ForSerIN',fld:'vFORSERIN',pic:''},{av:'AV82ForColNomIN',fld:'vFORCOLNOMIN',pic:''},{av:'AV83ForColNumIN',fld:'vFORCOLNUMIN',pic:'ZZZZZ9'},{av:'AV12TipColCod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true}]");
      setEventMetadata("VFORCOLNOMIN.CONTROLVALUECHANGED",",oparms:[{av:'AV86FilterSeleccionColorTinte_SDT',fld:'vFILTERSELECCIONCOLORTINTE_SDT',pic:''}]}");
      setEventMetadata("VFORCOLNUMIN.CONTROLVALUECHANGED","{handler:'e212D92',iparms:[{av:'AV80CliCodIN',fld:'vCLICODIN',pic:'ZZZZZ9'},{av:'AV86FilterSeleccionColorTinte_SDT',fld:'vFILTERSELECCIONCOLORTINTE_SDT',pic:''},{av:'AV81ForSerIN',fld:'vFORSERIN',pic:''},{av:'AV82ForColNomIN',fld:'vFORCOLNOMIN',pic:''},{av:'AV83ForColNumIN',fld:'vFORCOLNUMIN',pic:'ZZZZZ9'},{av:'AV12TipColCod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true}]");
      setEventMetadata("VFORCOLNUMIN.CONTROLVALUECHANGED",",oparms:[{av:'AV86FilterSeleccionColorTinte_SDT',fld:'vFILTERSELECCIONCOLORTINTE_SDT',pic:''}]}");
      setEventMetadata("VTIPCOLCODIN.CONTROLVALUECHANGED","{handler:'e222D92',iparms:[{av:'AV80CliCodIN',fld:'vCLICODIN',pic:'ZZZZZ9'},{av:'AV86FilterSeleccionColorTinte_SDT',fld:'vFILTERSELECCIONCOLORTINTE_SDT',pic:''},{av:'AV81ForSerIN',fld:'vFORSERIN',pic:''},{av:'AV82ForColNomIN',fld:'vFORCOLNOMIN',pic:''},{av:'AV83ForColNumIN',fld:'vFORCOLNUMIN',pic:'ZZZZZ9'},{av:'AV12TipColCod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true}]");
      setEventMetadata("VTIPCOLCODIN.CONTROLVALUECHANGED",",oparms:[{av:'AV86FilterSeleccionColorTinte_SDT',fld:'vFILTERSELECCIONCOLORTINTE_SDT',pic:''}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_FORSER","{handler:'valid_Forser',iparms:[]");
      setEventMetadata("VALID_FORSER",",oparms:[]}");
      setEventMetadata("VALID_FORSERDSC","{handler:'valid_Forserdsc',iparms:[]");
      setEventMetadata("VALID_FORSERDSC",",oparms:[]}");
      setEventMetadata("VALID_FORCOLNOM","{handler:'valid_Forcolnom',iparms:[]");
      setEventMetadata("VALID_FORCOLNOM",",oparms:[]}");
      setEventMetadata("VALID_FORCOLNUM","{handler:'valid_Forcolnum',iparms:[]");
      setEventMetadata("VALID_FORCOLNUM",",oparms:[]}");
      setEventMetadata("VALID_TIPCOLCOD","{handler:'valid_Tipcolcod',iparms:[]");
      setEventMetadata("VALID_TIPCOLCOD",",oparms:[]}");
      setEventMetadata("VALID_TIPCOLDSC","{handler:'valid_Tipcoldsc',iparms:[]");
      setEventMetadata("VALID_TIPCOLDSC",",oparms:[]}");
      setEventMetadata("VALID_FORNOMCLI","{handler:'valid_Fornomcli',iparms:[]");
      setEventMetadata("VALID_FORNOMCLI",",oparms:[]}");
      setEventMetadata("VALID_FORNUMCLI","{handler:'valid_Fornumcli',iparms:[]");
      setEventMetadata("VALID_FORNUMCLI",",oparms:[]}");
      setEventMetadata("VALID_INTDSC","{handler:'valid_Intdsc',iparms:[]");
      setEventMetadata("VALID_INTDSC",",oparms:[]}");
      setEventMetadata("VALID_FORTONAL","{handler:'valid_Fortonal',iparms:[]");
      setEventMetadata("VALID_FORTONAL",",oparms:[]}");
      setEventMetadata("VALID_FORBLO","{handler:'valid_Forblo',iparms:[]");
      setEventMetadata("VALID_FORBLO",",oparms:[]}");
      setEventMetadata("VALID_FORNUMARC","{handler:'valid_Fornumarc',iparms:[]");
      setEventMetadata("VALID_FORNUMARC",",oparms:[]}");
      setEventMetadata("VALID_FOROPCCLI","{handler:'valid_Foropccli',iparms:[]");
      setEventMetadata("VALID_FOROPCCLI",",oparms:[]}");
      setEventMetadata("VALID_FORNUMCOL","{handler:'valid_Fornumcol',iparms:[]");
      setEventMetadata("VALID_FORNUMCOL",",oparms:[]}");
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
      wcpOAV18InOutEmprCod = "" ;
      wcpOAV20InOutForSer = "" ;
      wcpOAV21InOutForColNom = "" ;
      wcpOAV70InOutForNomCli = "" ;
      wcpOAV72InOutForTonal = "" ;
      wcpOAV73InOutForblo = "" ;
      wcpOAV15TipColDsc = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Dvelop_confirmpanel_crearcolor_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV18InOutEmprCod = "" ;
      AV20InOutForSer = "" ;
      AV21InOutForColNom = "" ;
      AV70InOutForNomCli = "" ;
      AV72InOutForTonal = "" ;
      AV73InOutForblo = "" ;
      AV15TipColDsc = "" ;
      AV81ForSerIN = "" ;
      AV82ForColNomIN = "" ;
      AV30FilterFullText = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV62DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV86FilterSeleccionColorTinte_SDT = new app.formulaciontinte.SdtFilterSeleccionColorTinte_SDT(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtncrearcolor_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucDvpanel_unnamedtable6 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      AV99Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      A396EmprCod = "" ;
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV66Select = "" ;
      A494ForSer = "" ;
      A5742ForSerDsc = "" ;
      A482ForColNom = "" ;
      A832TipColDsc = "" ;
      A1191ForNomCli = "" ;
      A584IntDsc = "" ;
      A995ForTonal = "" ;
      A485ForFec = GXutil.nullDate() ;
      A495ForUltMod = GXutil.nullDate() ;
      A7781ForBlo = "" ;
      A3558ForFecApr = GXutil.nullDate() ;
      A3560ForOpcCli = "" ;
      scmdbuf = "" ;
      lV30FilterFullText = "" ;
      lV81ForSerIN = "" ;
      lV82ForColNomIN = "" ;
      A10045CliAct = "" ;
      H02D92_A583IntCod = new byte[1] ;
      H02D92_A10045CliAct = new String[] {""} ;
      H02D92_A396EmprCod = new String[] {""} ;
      H02D92_A486ForNumCol = new int[1] ;
      H02D92_A3560ForOpcCli = new String[] {""} ;
      H02D92_n3560ForOpcCli = new boolean[] {false} ;
      H02D92_A3558ForFecApr = new java.util.Date[] {GXutil.nullDate()} ;
      H02D92_n3558ForFecApr = new boolean[] {false} ;
      H02D92_A3315ForNumArc = new int[1] ;
      H02D92_n3315ForNumArc = new boolean[] {false} ;
      H02D92_A7781ForBlo = new String[] {""} ;
      H02D92_n7781ForBlo = new boolean[] {false} ;
      H02D92_A495ForUltMod = new java.util.Date[] {GXutil.nullDate()} ;
      H02D92_n495ForUltMod = new boolean[] {false} ;
      H02D92_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      H02D92_n485ForFec = new boolean[] {false} ;
      H02D92_A995ForTonal = new String[] {""} ;
      H02D92_n995ForTonal = new boolean[] {false} ;
      H02D92_A584IntDsc = new String[] {""} ;
      H02D92_n584IntDsc = new boolean[] {false} ;
      H02D92_A1192ForNumCli = new int[1] ;
      H02D92_n1192ForNumCli = new boolean[] {false} ;
      H02D92_A1191ForNomCli = new String[] {""} ;
      H02D92_n1191ForNomCli = new boolean[] {false} ;
      H02D92_A832TipColDsc = new String[] {""} ;
      H02D92_n832TipColDsc = new boolean[] {false} ;
      H02D92_A831TipColCod = new byte[1] ;
      H02D92_A483ForColNum = new int[1] ;
      H02D92_A482ForColNom = new String[] {""} ;
      H02D92_A5742ForSerDsc = new String[] {""} ;
      H02D92_n5742ForSerDsc = new boolean[] {false} ;
      H02D92_A494ForSer = new String[] {""} ;
      H02D92_A252CliCod = new int[1] ;
      H02D93_A583IntCod = new byte[1] ;
      H02D93_A10045CliAct = new String[] {""} ;
      H02D93_A396EmprCod = new String[] {""} ;
      H02D93_A486ForNumCol = new int[1] ;
      H02D93_A3560ForOpcCli = new String[] {""} ;
      H02D93_n3560ForOpcCli = new boolean[] {false} ;
      H02D93_A3558ForFecApr = new java.util.Date[] {GXutil.nullDate()} ;
      H02D93_n3558ForFecApr = new boolean[] {false} ;
      H02D93_A3315ForNumArc = new int[1] ;
      H02D93_n3315ForNumArc = new boolean[] {false} ;
      H02D93_A7781ForBlo = new String[] {""} ;
      H02D93_n7781ForBlo = new boolean[] {false} ;
      H02D93_A495ForUltMod = new java.util.Date[] {GXutil.nullDate()} ;
      H02D93_n495ForUltMod = new boolean[] {false} ;
      H02D93_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      H02D93_n485ForFec = new boolean[] {false} ;
      H02D93_A995ForTonal = new String[] {""} ;
      H02D93_n995ForTonal = new boolean[] {false} ;
      H02D93_A584IntDsc = new String[] {""} ;
      H02D93_n584IntDsc = new boolean[] {false} ;
      H02D93_A1192ForNumCli = new int[1] ;
      H02D93_n1192ForNumCli = new boolean[] {false} ;
      H02D93_A1191ForNomCli = new String[] {""} ;
      H02D93_n1191ForNomCli = new boolean[] {false} ;
      H02D93_A832TipColDsc = new String[] {""} ;
      H02D93_n832TipColDsc = new boolean[] {false} ;
      H02D93_A831TipColCod = new byte[1] ;
      H02D93_A483ForColNum = new int[1] ;
      H02D93_A482ForColNom = new String[] {""} ;
      H02D93_A5742ForSerDsc = new String[] {""} ;
      H02D93_n5742ForSerDsc = new boolean[] {false} ;
      H02D93_A494ForSer = new String[] {""} ;
      H02D93_A252CliCod = new int[1] ;
      AV74Station = "" ;
      GXt_char3 = "" ;
      AV5EmprCod = "" ;
      AV68EmprNom = "" ;
      AV69UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV17WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV95inouttipcoldsc = "" ;
      AV85WebSession = httpContext.getWebSession();
      ucDvelop_confirmpanel_crearcolor = new com.genexus.webpanels.GXUserControl();
      GXv_char6 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int11 = new int[1] ;
      GXv_int2 = new byte[1] ;
      GXv_int12 = new int[1] ;
      GXv_char13 = new String[1] ;
      GXv_char14 = new String[1] ;
      GXv_int15 = new int[1] ;
      GXv_int16 = new byte[1] ;
      GXv_char17 = new String[1] ;
      GXv_int18 = new int[1] ;
      GXv_int19 = new byte[1] ;
      lblCleanfilters_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.seleccioncolortinte__default(),
         new Object[] {
             new Object[] {
            H02D92_A583IntCod, H02D92_A10045CliAct, H02D92_A396EmprCod, H02D92_A486ForNumCol, H02D92_A3560ForOpcCli, H02D92_n3560ForOpcCli, H02D92_A3558ForFecApr, H02D92_n3558ForFecApr, H02D92_A3315ForNumArc, H02D92_n3315ForNumArc,
            H02D92_A7781ForBlo, H02D92_n7781ForBlo, H02D92_A495ForUltMod, H02D92_n495ForUltMod, H02D92_A485ForFec, H02D92_n485ForFec, H02D92_A995ForTonal, H02D92_n995ForTonal, H02D92_A584IntDsc, H02D92_n584IntDsc,
            H02D92_A1192ForNumCli, H02D92_n1192ForNumCli, H02D92_A1191ForNomCli, H02D92_n1191ForNomCli, H02D92_A832TipColDsc, H02D92_n832TipColDsc, H02D92_A831TipColCod, H02D92_A483ForColNum, H02D92_A482ForColNom, H02D92_A5742ForSerDsc,
            H02D92_n5742ForSerDsc, H02D92_A494ForSer, H02D92_A252CliCod
            }
            , new Object[] {
            H02D93_A583IntCod, H02D93_A10045CliAct, H02D93_A396EmprCod, H02D93_A486ForNumCol, H02D93_A3560ForOpcCli, H02D93_n3560ForOpcCli, H02D93_A3558ForFecApr, H02D93_n3558ForFecApr, H02D93_A3315ForNumArc, H02D93_n3315ForNumArc,
            H02D93_A7781ForBlo, H02D93_n7781ForBlo, H02D93_A495ForUltMod, H02D93_n495ForUltMod, H02D93_A485ForFec, H02D93_n485ForFec, H02D93_A995ForTonal, H02D93_n995ForTonal, H02D93_A584IntDsc, H02D93_n584IntDsc,
            H02D93_A1192ForNumCli, H02D93_n1192ForNumCli, H02D93_A1191ForNomCli, H02D93_n1191ForNomCli, H02D93_A832TipColDsc, H02D93_n832TipColDsc, H02D93_A831TipColCod, H02D93_A483ForColNum, H02D93_A482ForColNom, H02D93_A5742ForSerDsc,
            H02D93_n5742ForSerDsc, H02D93_A494ForSer, H02D93_A252CliCod
            }
         }
      );
      AV99Pgmname = "FormulacionTinte.SeleccionColorTinte" ;
      /* GeneXus formulas. */
      AV99Pgmname = "FormulacionTinte.SeleccionColorTinte" ;
      Gx_err = (short)(0) ;
      edtavInoutclicod_Enabled = 0 ;
      edtavInoutforser_Enabled = 0 ;
      edtavSelect_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV23InOutTipColCod ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV23InOutTipColCod ;
   private byte AV87TipColCodIN ;
   private byte AV12TipColCod ;
   private byte gxajaxcallmode ;
   private byte AV93Equiv ;
   private byte A831TipColCod ;
   private byte nDonePA ;
   private byte A583IntCod ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int1 ;
   private byte AV94Flag ;
   private byte GXv_int2[] ;
   private byte GXv_int16[] ;
   private byte GXv_int19[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV28OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV96moda21 ;
   private int wcpOAV19InOutCliCod ;
   private int wcpOAV22InOutForColNum ;
   private int wcpOAV71InOutForNumCli ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_88 ;
   private int subGrid_Rows ;
   private int AV19InOutCliCod ;
   private int AV22InOutForColNum ;
   private int AV71InOutForNumCli ;
   private int nGXsfl_88_idx=1 ;
   private int AV80CliCodIN ;
   private int AV83ForColNumIN ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavInoutclicod_Enabled ;
   private int edtavInoutforser_Enabled ;
   private int edtavClicodin_Enabled ;
   private int edtavForserin_Enabled ;
   private int edtavForcolnomin_Enabled ;
   private int edtavForcolnumin_Enabled ;
   private int edtavTipcolcodin_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtEmprCod_Visible ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int A1192ForNumCli ;
   private int A3315ForNumArc ;
   private int A486ForNumCol ;
   private int subGrid_Islastpage ;
   private int edtavSelect_Enabled ;
   private int AV63PageToGo ;
   private int GXv_int10[] ;
   private int GXv_int11[] ;
   private int GXv_int12[] ;
   private int GXv_int15[] ;
   private int GXv_int18[] ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavSelect_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV64GridCurrentPage ;
   private long AV65GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String wcpOAV18InOutEmprCod ;
   private String wcpOAV20InOutForSer ;
   private String wcpOAV21InOutForColNom ;
   private String wcpOAV70InOutForNomCli ;
   private String wcpOAV72InOutForTonal ;
   private String wcpOAV73InOutForblo ;
   private String wcpOAV15TipColDsc ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Dvelop_confirmpanel_crearcolor_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV18InOutEmprCod ;
   private String AV20InOutForSer ;
   private String AV21InOutForColNom ;
   private String AV70InOutForNomCli ;
   private String AV72InOutForTonal ;
   private String AV73InOutForblo ;
   private String AV15TipColDsc ;
   private String sGXsfl_88_idx="0001" ;
   private String AV81ForSerIN ;
   private String AV82ForColNomIN ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Dvpanel_unnamedtable6_Width ;
   private String Dvpanel_unnamedtable6_Cls ;
   private String Dvpanel_unnamedtable6_Title ;
   private String Dvpanel_unnamedtable6_Iconposition ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
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
   private String Ddo_grid_Caption ;
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Includesortasc ;
   private String Ddo_grid_Sortedstatus ;
   private String Dvelop_confirmpanel_crearcolor_Title ;
   private String Dvelop_confirmpanel_crearcolor_Confirmationtext ;
   private String Dvelop_confirmpanel_crearcolor_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_crearcolor_Nobuttoncaption ;
   private String Dvelop_confirmpanel_crearcolor_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_crearcolor_Yesbuttonposition ;
   private String Dvelop_confirmpanel_crearcolor_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String TempTags ;
   private String divUnnamedtable5_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtncrearcolor_Internalname ;
   private String bttBtncrearcolor_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String Dvpanel_unnamedtable6_Internalname ;
   private String divUnnamedtable6_Internalname ;
   private String edtavInoutclicod_Internalname ;
   private String edtavInoutclicod_Jsonclick ;
   private String edtavInoutforser_Internalname ;
   private String edtavInoutforser_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtavClicodin_Internalname ;
   private String edtavClicodin_Jsonclick ;
   private String edtavForserin_Internalname ;
   private String edtavForserin_Jsonclick ;
   private String edtavForcolnomin_Internalname ;
   private String edtavForcolnomin_Jsonclick ;
   private String edtavForcolnumin_Internalname ;
   private String edtavForcolnumin_Jsonclick ;
   private String edtavTipcolcodin_Internalname ;
   private String edtavTipcolcodin_Jsonclick ;
   private String divTableheader_Internalname ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String AV99Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String edtEmprCod_Internalname ;
   private String A396EmprCod ;
   private String edtEmprCod_Jsonclick ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV66Select ;
   private String edtavSelect_Internalname ;
   private String edtCliCod_Internalname ;
   private String A494ForSer ;
   private String edtForSer_Internalname ;
   private String A5742ForSerDsc ;
   private String edtForSerDsc_Internalname ;
   private String A482ForColNom ;
   private String edtForColNom_Internalname ;
   private String edtForColNum_Internalname ;
   private String edtTipColCod_Internalname ;
   private String A832TipColDsc ;
   private String edtTipColDsc_Internalname ;
   private String A1191ForNomCli ;
   private String edtForNomCli_Internalname ;
   private String edtForNumCli_Internalname ;
   private String A584IntDsc ;
   private String edtIntDsc_Internalname ;
   private String A995ForTonal ;
   private String edtForTonal_Internalname ;
   private String edtForFec_Internalname ;
   private String edtForUltMod_Internalname ;
   private String A7781ForBlo ;
   private String edtForNumArc_Internalname ;
   private String edtForFecApr_Internalname ;
   private String A3560ForOpcCli ;
   private String edtForOpcCli_Internalname ;
   private String edtForNumCol_Internalname ;
   private String scmdbuf ;
   private String lV81ForSerIN ;
   private String lV82ForColNomIN ;
   private String A10045CliAct ;
   private String edtavFilterfulltext_Internalname ;
   private String AV74Station ;
   private String GXt_char3 ;
   private String AV5EmprCod ;
   private String AV68EmprNom ;
   private String AV69UsurCod ;
   private String edtavSelect_Columnheaderclass ;
   private String edtCliCod_Columnheaderclass ;
   private String edtForSer_Columnheaderclass ;
   private String edtForSerDsc_Columnheaderclass ;
   private String edtForColNom_Columnheaderclass ;
   private String edtForColNum_Columnheaderclass ;
   private String edtTipColCod_Columnheaderclass ;
   private String edtTipColDsc_Columnheaderclass ;
   private String edtForNomCli_Columnheaderclass ;
   private String edtForNumCli_Columnheaderclass ;
   private String edtIntDsc_Columnheaderclass ;
   private String edtForTonal_Columnheaderclass ;
   private String edtForFec_Columnheaderclass ;
   private String edtForUltMod_Columnheaderclass ;
   private String edtForNumArc_Columnheaderclass ;
   private String edtForFecApr_Columnheaderclass ;
   private String edtForOpcCli_Columnheaderclass ;
   private String edtForNumCol_Columnheaderclass ;
   private String edtavSelect_Columnclass ;
   private String edtCliCod_Columnclass ;
   private String edtForSer_Columnclass ;
   private String edtForSerDsc_Columnclass ;
   private String edtForColNom_Columnclass ;
   private String edtForColNum_Columnclass ;
   private String edtTipColCod_Columnclass ;
   private String edtTipColDsc_Columnclass ;
   private String edtForNomCli_Columnclass ;
   private String edtForNumCli_Columnclass ;
   private String edtIntDsc_Columnclass ;
   private String edtForTonal_Columnclass ;
   private String edtForFec_Columnclass ;
   private String edtForUltMod_Columnclass ;
   private String edtForNumArc_Columnclass ;
   private String edtForFecApr_Columnclass ;
   private String edtForOpcCli_Columnclass ;
   private String edtForNumCol_Columnclass ;
   private String AV95inouttipcoldsc ;
   private String Dvelop_confirmpanel_crearcolor_Internalname ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char13[] ;
   private String GXv_char14[] ;
   private String GXv_char17[] ;
   private String tblTabledvelop_confirmpanel_crearcolor_Internalname ;
   private String tblTablefilters_Internalname ;
   private String lblCleanfilters_Internalname ;
   private String lblCleanfilters_Jsonclick ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sGXsfl_88_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavSelect_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtForSer_Jsonclick ;
   private String edtForSerDsc_Jsonclick ;
   private String edtForColNom_Jsonclick ;
   private String edtForColNum_Jsonclick ;
   private String edtTipColCod_Jsonclick ;
   private String edtTipColDsc_Jsonclick ;
   private String edtForNomCli_Jsonclick ;
   private String edtForNumCli_Jsonclick ;
   private String edtIntDsc_Jsonclick ;
   private String edtForTonal_Jsonclick ;
   private String edtForFec_Jsonclick ;
   private String edtForUltMod_Jsonclick ;
   private String GXCCtl ;
   private String edtForNumArc_Jsonclick ;
   private String edtForFecApr_Jsonclick ;
   private String edtForOpcCli_Jsonclick ;
   private String edtForNumCol_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date A485ForFec ;
   private java.util.Date A495ForUltMod ;
   private java.util.Date A3558ForFecApr ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV29OrderedDsc ;
   private boolean Dvpanel_unnamedtable6_Autowidth ;
   private boolean Dvpanel_unnamedtable6_Autoheight ;
   private boolean Dvpanel_unnamedtable6_Collapsible ;
   private boolean Dvpanel_unnamedtable6_Collapsed ;
   private boolean Dvpanel_unnamedtable6_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable6_Autoscroll ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Dvpanel_unnamedtable2_Autowidth ;
   private boolean Dvpanel_unnamedtable2_Autoheight ;
   private boolean Dvpanel_unnamedtable2_Collapsible ;
   private boolean Dvpanel_unnamedtable2_Collapsed ;
   private boolean Dvpanel_unnamedtable2_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable2_Autoscroll ;
   private boolean Gridpaginationbar_Showfirst ;
   private boolean Gridpaginationbar_Showprevious ;
   private boolean Gridpaginationbar_Shownext ;
   private boolean Gridpaginationbar_Showlast ;
   private boolean Gridpaginationbar_Rowsperpageselector ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n5742ForSerDsc ;
   private boolean n832TipColDsc ;
   private boolean n1191ForNomCli ;
   private boolean n1192ForNumCli ;
   private boolean n584IntDsc ;
   private boolean n995ForTonal ;
   private boolean n485ForFec ;
   private boolean n495ForUltMod ;
   private boolean n7781ForBlo ;
   private boolean n3315ForNumArc ;
   private boolean n3558ForFecApr ;
   private boolean n3560ForOpcCli ;
   private boolean bGXsfl_88_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV30FilterFullText ;
   private String lV30FilterFullText ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable6 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_crearcolor ;
   private HTMLChoice cmbavEquiv ;
   private HTMLChoice cmbForBlo ;
   private IDataStoreProvider pr_default ;
   private byte[] H02D92_A583IntCod ;
   private String[] H02D92_A10045CliAct ;
   private String[] H02D92_A396EmprCod ;
   private int[] H02D92_A486ForNumCol ;
   private String[] H02D92_A3560ForOpcCli ;
   private boolean[] H02D92_n3560ForOpcCli ;
   private java.util.Date[] H02D92_A3558ForFecApr ;
   private boolean[] H02D92_n3558ForFecApr ;
   private int[] H02D92_A3315ForNumArc ;
   private boolean[] H02D92_n3315ForNumArc ;
   private String[] H02D92_A7781ForBlo ;
   private boolean[] H02D92_n7781ForBlo ;
   private java.util.Date[] H02D92_A495ForUltMod ;
   private boolean[] H02D92_n495ForUltMod ;
   private java.util.Date[] H02D92_A485ForFec ;
   private boolean[] H02D92_n485ForFec ;
   private String[] H02D92_A995ForTonal ;
   private boolean[] H02D92_n995ForTonal ;
   private String[] H02D92_A584IntDsc ;
   private boolean[] H02D92_n584IntDsc ;
   private int[] H02D92_A1192ForNumCli ;
   private boolean[] H02D92_n1192ForNumCli ;
   private String[] H02D92_A1191ForNomCli ;
   private boolean[] H02D92_n1191ForNomCli ;
   private String[] H02D92_A832TipColDsc ;
   private boolean[] H02D92_n832TipColDsc ;
   private byte[] H02D92_A831TipColCod ;
   private int[] H02D92_A483ForColNum ;
   private String[] H02D92_A482ForColNom ;
   private String[] H02D92_A5742ForSerDsc ;
   private boolean[] H02D92_n5742ForSerDsc ;
   private String[] H02D92_A494ForSer ;
   private int[] H02D92_A252CliCod ;
   private byte[] H02D93_A583IntCod ;
   private String[] H02D93_A10045CliAct ;
   private String[] H02D93_A396EmprCod ;
   private int[] H02D93_A486ForNumCol ;
   private String[] H02D93_A3560ForOpcCli ;
   private boolean[] H02D93_n3560ForOpcCli ;
   private java.util.Date[] H02D93_A3558ForFecApr ;
   private boolean[] H02D93_n3558ForFecApr ;
   private int[] H02D93_A3315ForNumArc ;
   private boolean[] H02D93_n3315ForNumArc ;
   private String[] H02D93_A7781ForBlo ;
   private boolean[] H02D93_n7781ForBlo ;
   private java.util.Date[] H02D93_A495ForUltMod ;
   private boolean[] H02D93_n495ForUltMod ;
   private java.util.Date[] H02D93_A485ForFec ;
   private boolean[] H02D93_n485ForFec ;
   private String[] H02D93_A995ForTonal ;
   private boolean[] H02D93_n995ForTonal ;
   private String[] H02D93_A584IntDsc ;
   private boolean[] H02D93_n584IntDsc ;
   private int[] H02D93_A1192ForNumCli ;
   private boolean[] H02D93_n1192ForNumCli ;
   private String[] H02D93_A1191ForNomCli ;
   private boolean[] H02D93_n1191ForNomCli ;
   private String[] H02D93_A832TipColDsc ;
   private boolean[] H02D93_n832TipColDsc ;
   private byte[] H02D93_A831TipColCod ;
   private int[] H02D93_A483ForColNum ;
   private String[] H02D93_A482ForColNom ;
   private String[] H02D93_A5742ForSerDsc ;
   private boolean[] H02D93_n5742ForSerDsc ;
   private String[] H02D93_A494ForSer ;
   private int[] H02D93_A252CliCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.webpanels.WebSession AV85WebSession ;
   private app.wwpbaseobjects.SdtWWPContext AV17WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV62DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[] ;
   private app.formulaciontinte.SdtFilterSeleccionColorTinte_SDT AV86FilterSeleccionColorTinte_SDT ;
}

final  class seleccioncolortinte__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H02D92( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV80CliCodIN ,
                                          String AV81ForSerIN ,
                                          String AV82ForColNomIN ,
                                          int AV83ForColNumIN ,
                                          byte AV87TipColCodIN ,
                                          int A252CliCod ,
                                          String A494ForSer ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV30FilterFullText ,
                                          String A5742ForSerDsc ,
                                          String A832TipColDsc ,
                                          String A1191ForNomCli ,
                                          int A1192ForNumCli ,
                                          String A584IntDsc ,
                                          String A995ForTonal ,
                                          String A7781ForBlo ,
                                          int A3315ForNumArc ,
                                          String A3560ForOpcCli ,
                                          int A486ForNumCol ,
                                          String A10045CliAct ,
                                          String AV18InOutEmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[6];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT T1.IntCod, T4.CliAct, T1.EmprCod, T1.ForNumCol, T1.ForOpcCli, T1.ForFecApr, T1.ForNumArc, T1.ForBlo, T1.ForUltMod, T1.ForFec, T1.ForTonal, T2.IntDsc, T1.ForNumCli," ;
      scmdbuf += " T1.ForNomCli, T3.TipColDsc, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSerDsc, T1.ForSer, T1.CliCod FROM (((TXPCFORMU T1 INNER JOIN TXPINTENS T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.IntCod = T1.IntCod) INNER JOIN TXPTIPCOL T3 ON T3.EmprCod = T1.EmprCod AND T3.TipColCod = T1.TipColCod) INNER JOIN TXPCLIENT T4 ON T4.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T4.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T4.CliAct = 'S')");
      if ( ! (0==AV80CliCodIN) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int20[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81ForSerIN)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer like ?)");
      }
      else
      {
         GXv_int20[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82ForColNomIN)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom like ?)");
      }
      else
      {
         GXv_int20[3] = (byte)(1) ;
      }
      if ( ! (0==AV83ForColNumIN) )
      {
         addWhere(sWhereString, "(T1.ForColNum = ?)");
      }
      else
      {
         GXv_int20[4] = (byte)(1) ;
      }
      if ( ! (0==AV87TipColCodIN) )
      {
         addWhere(sWhereString, "(T1.TipColCod = ?)");
      }
      else
      {
         GXv_int20[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV28OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForSer" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForSer DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForSerDsc" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForSerDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForColNom" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForColNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForColNum" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForColNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TipColCod" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TipColCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.TipColDsc" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.TipColDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForNomCli" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForNomCli DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForNumCli" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForNumCli DESC" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.IntDsc" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.IntDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForTonal" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForTonal DESC" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForFec" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForFec DESC" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForUltMod" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForUltMod DESC" ;
      }
      else if ( ( AV28OrderedBy == 15 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForBlo" ;
      }
      else if ( ( AV28OrderedBy == 15 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForBlo DESC" ;
      }
      else if ( ( AV28OrderedBy == 16 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForNumArc" ;
      }
      else if ( ( AV28OrderedBy == 16 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForNumArc DESC" ;
      }
      else if ( ( AV28OrderedBy == 17 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForFecApr" ;
      }
      else if ( ( AV28OrderedBy == 17 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForFecApr DESC" ;
      }
      else if ( ( AV28OrderedBy == 18 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForOpcCli" ;
      }
      else if ( ( AV28OrderedBy == 18 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForOpcCli DESC" ;
      }
      else if ( ( AV28OrderedBy == 19 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForNumCol" ;
      }
      else if ( ( AV28OrderedBy == 19 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForNumCol DESC" ;
      }
      GXv_Object21[0] = scmdbuf ;
      GXv_Object21[1] = GXv_int20 ;
      return GXv_Object21 ;
   }

   protected Object[] conditional_H02D93( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV80CliCodIN ,
                                          String AV81ForSerIN ,
                                          String AV82ForColNomIN ,
                                          int AV83ForColNumIN ,
                                          byte AV87TipColCodIN ,
                                          int A252CliCod ,
                                          String A494ForSer ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV30FilterFullText ,
                                          String A5742ForSerDsc ,
                                          String A832TipColDsc ,
                                          String A1191ForNomCli ,
                                          int A1192ForNumCli ,
                                          String A584IntDsc ,
                                          String A995ForTonal ,
                                          String A7781ForBlo ,
                                          int A3315ForNumArc ,
                                          String A3560ForOpcCli ,
                                          int A486ForNumCol ,
                                          String A10045CliAct ,
                                          String AV18InOutEmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int22 = new byte[6];
      Object[] GXv_Object23 = new Object[2];
      scmdbuf = "SELECT T1.IntCod, T4.CliAct, T1.EmprCod, T1.ForNumCol, T1.ForOpcCli, T1.ForFecApr, T1.ForNumArc, T1.ForBlo, T1.ForUltMod, T1.ForFec, T1.ForTonal, T2.IntDsc, T1.ForNumCli," ;
      scmdbuf += " T1.ForNomCli, T3.TipColDsc, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSerDsc, T1.ForSer, T1.CliCod FROM (((TXPCFORMU T1 INNER JOIN TXPINTENS T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.IntCod = T1.IntCod) INNER JOIN TXPTIPCOL T3 ON T3.EmprCod = T1.EmprCod AND T3.TipColCod = T1.TipColCod) INNER JOIN TXPCLIENT T4 ON T4.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T4.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T4.CliAct = 'S')");
      if ( ! (0==AV80CliCodIN) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int22[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81ForSerIN)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer like ?)");
      }
      else
      {
         GXv_int22[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82ForColNomIN)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom like ?)");
      }
      else
      {
         GXv_int22[3] = (byte)(1) ;
      }
      if ( ! (0==AV83ForColNumIN) )
      {
         addWhere(sWhereString, "(T1.ForColNum = ?)");
      }
      else
      {
         GXv_int22[4] = (byte)(1) ;
      }
      if ( ! (0==AV87TipColCodIN) )
      {
         addWhere(sWhereString, "(T1.TipColCod = ?)");
      }
      else
      {
         GXv_int22[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV28OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForSer" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForSer DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForSerDsc" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForSerDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForColNom" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForColNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForColNum" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForColNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TipColCod" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TipColCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.TipColDsc" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.TipColDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForNomCli" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForNomCli DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForNumCli" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForNumCli DESC" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.IntDsc" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.IntDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForTonal" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForTonal DESC" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForFec" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForFec DESC" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForUltMod" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForUltMod DESC" ;
      }
      else if ( ( AV28OrderedBy == 15 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForBlo" ;
      }
      else if ( ( AV28OrderedBy == 15 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForBlo DESC" ;
      }
      else if ( ( AV28OrderedBy == 16 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForNumArc" ;
      }
      else if ( ( AV28OrderedBy == 16 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForNumArc DESC" ;
      }
      else if ( ( AV28OrderedBy == 17 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForFecApr" ;
      }
      else if ( ( AV28OrderedBy == 17 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForFecApr DESC" ;
      }
      else if ( ( AV28OrderedBy == 18 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForOpcCli" ;
      }
      else if ( ( AV28OrderedBy == 18 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForOpcCli DESC" ;
      }
      else if ( ( AV28OrderedBy == 19 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForNumCol" ;
      }
      else if ( ( AV28OrderedBy == 19 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForNumCol DESC" ;
      }
      GXv_Object23[0] = scmdbuf ;
      GXv_Object23[1] = GXv_int22 ;
      return GXv_Object23 ;
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
                  return conditional_H02D92(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).shortValue() , ((Boolean) dynConstraints[11]).booleanValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] );
            case 1 :
                  return conditional_H02D93(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).shortValue() , ((Boolean) dynConstraints[11]).booleanValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02D92", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02D93", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 20);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(13);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(14, 13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((byte[]) buf[26])[0] = rslt.getByte(16);
               ((int[]) buf[27])[0] = rslt.getInt(17);
               ((String[]) buf[28])[0] = rslt.getString(18, 13);
               ((String[]) buf[29])[0] = rslt.getString(19, 26);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(20, 16);
               ((int[]) buf[32])[0] = rslt.getInt(21);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 20);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(13);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(14, 13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((byte[]) buf[26])[0] = rslt.getByte(16);
               ((int[]) buf[27])[0] = rslt.getInt(17);
               ((String[]) buf[28])[0] = rslt.getString(18, 13);
               ((String[]) buf[29])[0] = rslt.getString(19, 26);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(20, 16);
               ((int[]) buf[32])[0] = rslt.getInt(21);
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
                  stmt.setString(sIdx, (String)parms[8], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 13);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[11]).byteValue());
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
                  stmt.setString(sIdx, (String)parms[8], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 13);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[11]).byteValue());
               }
               return;
      }
   }

}

