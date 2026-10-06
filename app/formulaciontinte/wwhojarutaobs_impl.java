package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wwhojarutaobs_impl extends GXDataArea
{
   public wwhojarutaobs_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wwhojarutaobs_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wwhojarutaobs_impl.class ));
   }

   public wwhojarutaobs_impl( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGridactions = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetFirstPar( "Mode") ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "Mode") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "Mode") ;
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
            Gx_mode = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV24DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV24DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24DisCod), 8, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV24DisCod), "ZZZZZZZ9")));
               AV25BarPri = httpContext.GetPar( "BarPri") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV25BarPri", AV25BarPri);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPRI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV25BarPri, "9"))));
               AV26CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26CliCod), 6, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV26CliCod), "ZZZZZ9")));
               AV27CliNom = httpContext.GetPar( "CliNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV27CliNom", AV27CliNom);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27CliNom, ""))));
               AV28BarSer = httpContext.GetPar( "BarSer") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV28BarSer", AV28BarSer);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV28BarSer, ""))));
               AV29BarSerDsc = httpContext.GetPar( "BarSerDsc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV29BarSerDsc", AV29BarSerDsc);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSERDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV29BarSerDsc, ""))));
               AV30BarFecGen = localUtil.parseDateParm( httpContext.GetPar( "BarFecGen")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV30BarFecGen", localUtil.format(AV30BarFecGen, "99/99/99"));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFECGEN", getSecureSignedToken( "", AV30BarFecGen));
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
      nRC_GXsfl_46 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_46"))) ;
      nGXsfl_46_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_46_idx"))) ;
      sGXsfl_46_idx = httpContext.GetPar( "sGXsfl_46_idx") ;
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
      AV34EmprCod = httpContext.GetPar( "EmprCod") ;
      AV24DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
      AV25BarPri = httpContext.GetPar( "BarPri") ;
      AV15TFDisObsLin = (byte)(GXutil.lval( httpContext.GetPar( "TFDisObsLin"))) ;
      AV16TFDisObsLin_To = (byte)(GXutil.lval( httpContext.GetPar( "TFDisObsLin_To"))) ;
      AV17TFDisObsTxt = httpContext.GetPar( "TFDisObsTxt") ;
      AV18TFDisObsTxt_Sel = httpContext.GetPar( "TFDisObsTxt_Sel") ;
      AV48Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      AV26CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      AV27CliNom = httpContext.GetPar( "CliNom") ;
      AV28BarSer = httpContext.GetPar( "BarSer") ;
      AV29BarSerDsc = httpContext.GetPar( "BarSerDsc") ;
      AV30BarFecGen = localUtil.parseDateParm( httpContext.GetPar( "BarFecGen")) ;
      AV36UsurCod = httpContext.GetPar( "UsurCod") ;
      AV33Station = httpContext.GetPar( "Station") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV34EmprCod, AV24DisCod, AV25BarPri, AV15TFDisObsLin, AV16TFDisObsLin_To, AV17TFDisObsTxt, AV18TFDisObsTxt_Sel, AV48Pgmname, AV12OrderedBy, AV13OrderedDsc, Gx_mode, AV26CliCod, AV27CliNom, AV28BarSer, AV29BarSerDsc, AV30BarFecGen, AV36UsurCod, AV33Station) ;
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
      pa2832( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2832( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.wwhojarutaobs", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.ltrimstr(AV24DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV25BarPri)),GXutil.URLEncode(GXutil.ltrimstr(AV26CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV27CliNom)),GXutil.URLEncode(GXutil.rtrim(AV28BarSer)),GXutil.URLEncode(GXutil.rtrim(AV29BarSerDsc)),GXutil.URLEncode(GXutil.formatDateParm(AV30BarFecGen))}, new String[] {"Gx_mode","DisCod","BarPri","CliCod","CliNom","BarSer","BarSerDsc","BarFecGen"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV34EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV24DisCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPRI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV25BarPri, "9"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV26CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27CliNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV28BarSer, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSERDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV29BarSerDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFECGEN", getSecureSignedToken( "", AV30BarFecGen));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV36UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV33Station, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"WWHojaRutaObs");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV48Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\wwhojarutaobs:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_46", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_46, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV21GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV22GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV19DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV19DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV34EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV34EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vDISCOD", GXutil.ltrim( localUtil.ntoc( AV24DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV24DisCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPRI", GXutil.rtrim( AV25BarPri));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPRI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV25BarPri, "9"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISOBSLIN", GXutil.ltrim( localUtil.ntoc( AV15TFDisObsLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISOBSLIN_TO", GXutil.ltrim( localUtil.ntoc( AV16TFDisObsLin_To, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISOBSTXT", GXutil.rtrim( AV17TFDisObsTxt));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISOBSTXT_SEL", GXutil.rtrim( AV18TFDisObsTxt_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD", GXutil.ltrim( localUtil.ntoc( AV26CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV26CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLINOM", GXutil.rtrim( AV27CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27CliNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSER", GXutil.rtrim( AV28BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV28BarSer, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSERDSC", GXutil.rtrim( AV29BarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSERDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV29BarSerDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARFECGEN", localUtil.dtoc( AV30BarFecGen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFECGEN", getSecureSignedToken( "", AV30BarFecGen));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV36UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV36UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV33Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV33Station, ""))));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNOBSERVACIONESPEDIDOANTERIOR_Title", GXutil.rtrim( Dvelop_confirmpanel_btnobservacionespedidoanterior_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNOBSERVACIONESPEDIDOANTERIOR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btnobservacionespedidoanterior_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNOBSERVACIONESPEDIDOANTERIOR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnobservacionespedidoanterior_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNOBSERVACIONESPEDIDOANTERIOR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnobservacionespedidoanterior_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNOBSERVACIONESPEDIDOANTERIOR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnobservacionespedidoanterior_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNOBSERVACIONESPEDIDOANTERIOR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btnobservacionespedidoanterior_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNOBSERVACIONESPEDIDOANTERIOR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btnobservacionespedidoanterior_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNOBSERVACIONESPEDIDOANTERIOR_Result", GXutil.rtrim( Dvelop_confirmpanel_btnobservacionespedidoanterior_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNOBSERVACIONESPEDIDOANTERIOR_Result", GXutil.rtrim( Dvelop_confirmpanel_btnobservacionespedidoanterior_Result));
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
         we2832( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2832( ) ;
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
      return formatLink("app.formulaciontinte.wwhojarutaobs", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.ltrimstr(AV24DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV25BarPri)),GXutil.URLEncode(GXutil.ltrimstr(AV26CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV27CliNom)),GXutil.URLEncode(GXutil.rtrim(AV28BarSer)),GXutil.URLEncode(GXutil.rtrim(AV29BarSerDsc)),GXutil.URLEncode(GXutil.formatDateParm(AV30BarFecGen))}, new String[] {"Gx_mode","DisCod","BarPri","CliCod","CliNom","BarSer","BarSerDsc","BarFecGen"})  ;
   }

   public String getPgmname( )
   {
      return "FormulacionTinte.WWHojaRutaObs" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Observaciones del pedido", "") ;
   }

   public void wb2830( )
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
         app.GxWebStd.gx_div_start( httpContext, divTableforms_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDisobslin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDisobslin_Internalname, httpContext.getMessage( "Linea", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'" + sGXsfl_46_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDisobslin_Internalname, GXutil.ltrim( localUtil.ntoc( AV31DisObsLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavDisobslin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV31DisObsLin), "9") : localUtil.format( DecimalUtil.doubleToDec(AV31DisObsLin), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,19);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDisobslin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDisobslin_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\WWHojaRutaObs.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-10", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDisobstxt_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDisobstxt_Internalname, httpContext.getMessage( "Observacion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'" + sGXsfl_46_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDisobstxt_Internalname, GXutil.rtrim( AV32DisObsTxt), GXutil.rtrim( localUtil.format( AV32DisObsTxt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,23);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDisobstxt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDisobstxt_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\WWHojaRutaObs.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableactions_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 28,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnagregar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 46, 2, 0)+","+"null"+");", httpContext.getMessage( "Agregar", ""), bttBtnagregar_Jsonclick, 5, httpContext.getMessage( "Agregar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOAGREGAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\WWHojaRutaObs.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial btn btn-default" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtntipospresentacion_Internalname, "gx.evt.setGridEvt("+GXutil.str( 46, 2, 0)+","+"null"+");", httpContext.getMessage( "Tipos Presentacion", ""), bttBtntipospresentacion_Jsonclick, 5, httpContext.getMessage( "Tipos Presentacion", ""), "", StyleString, ClassString, bttBtntipospresentacion_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOTIPOSPRESENTACION\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\WWHojaRutaObs.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial btn btn-default" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnobservacionespedidoanterior_Internalname, "gx.evt.setGridEvt("+GXutil.str( 46, 2, 0)+","+"null"+");", httpContext.getMessage( "Copiar Obs. Pedido Anterior", ""), bttBtnobservacionespedidoanterior_Jsonclick, 7, httpContext.getMessage( "Copiar Obs. Pedido Anterior", ""), "", StyleString, ClassString, bttBtnobservacionespedidoanterior_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"e112831_client"+"'", TempTags, "", 2, "HLP_FormulacionTinte\\WWHojaRutaObs.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial btn btn-default" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 46, 2, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\WWHojaRutaObs.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divTablerightheader_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol46( ) ;
      }
      if ( wbEnd == 46 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_46 = (int)(nGXsfl_46_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV21GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV22GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV48Pgmname), GXutil.rtrim( localUtil.format( AV48Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\WWHojaRutaObs.htm");
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
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV19DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         wb_table1_72_2832( true) ;
      }
      else
      {
         wb_table1_72_2832( false) ;
      }
      return  ;
   }

   public void wb_table1_72_2832e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 46 )
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

   public void start2832( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Observaciones del pedido", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2830( ) ;
   }

   public void ws2832( )
   {
      start2832( ) ;
      evt2832( ) ;
   }

   public void evt2832( )
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
                           e122832 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e132832 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e142832 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_BTNOBSERVACIONESPEDIDOANTERIOR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e152832 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOAGREGAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoAgregar' */
                           e162832 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOTIPOSPRESENTACION'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoTiposPresentacion' */
                           e172832 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e182832 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_46_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_46_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_46_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_462( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV23GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23GridActions), 4, 0));
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A369DisFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtDisFec_Internalname), 0)) ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A335DisArtCod = httpContext.cgiGet( edtDisArtCod_Internalname) ;
                           A337DisArtDsc = httpContext.cgiGet( edtDisArtDsc_Internalname) ;
                           A378DisObsULin = (byte)(localUtil.ctol( httpContext.cgiGet( edtDisObsULin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A376DisObsLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtDisObsLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A377DisObsTxt = httpContext.cgiGet( edtDisObsTxt_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e192832 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e202832 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e212832 ();
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

   public void we2832( )
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

   public void pa2832( )
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
            GX_FocusControl = edtavDisobslin_Internalname ;
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
      subsflControlProps_462( ) ;
      while ( nGXsfl_46_idx <= nRC_GXsfl_46 )
      {
         sendrow_462( ) ;
         nGXsfl_46_idx = ((subGrid_Islastpage==1)&&(nGXsfl_46_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_46_idx+1) ;
         sGXsfl_46_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_46_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_462( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV34EmprCod ,
                                 int AV24DisCod ,
                                 String AV25BarPri ,
                                 byte AV15TFDisObsLin ,
                                 byte AV16TFDisObsLin_To ,
                                 String AV17TFDisObsTxt ,
                                 String AV18TFDisObsTxt_Sel ,
                                 String AV48Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 String Gx_mode ,
                                 int AV26CliCod ,
                                 String AV27CliNom ,
                                 String AV28BarSer ,
                                 String AV29BarSerDsc ,
                                 java.util.Date AV30BarFecGen ,
                                 String AV36UsurCod ,
                                 String AV33Station )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e202832 ();
      GRID_nCurrentRecord = 0 ;
      rf2832( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"WWHojaRutaObs");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV48Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\wwhojarutaobs:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_DISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOD", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_DISOBSLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A376DisObsLin), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISOBSLIN", GXutil.ltrim( localUtil.ntoc( A376DisObsLin, (byte)(1), (byte)(0), ".", "")));
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
      rf2832( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV48Pgmname = "FormulacionTinte.WWHojaRutaObs" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48Pgmname", AV48Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2832( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(46) ;
      /* Execute user event: Refresh */
      e202832 ();
      nGXsfl_46_idx = 1 ;
      sGXsfl_46_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_46_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_462( ) ;
      bGXsfl_46_Refreshing = true ;
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
         subsflControlProps_462( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Byte.valueOf(AV49Formulaciontinte_wwhojarutaobsds_1_tfdisobslin) ,
                                              Byte.valueOf(AV50Formulaciontinte_wwhojarutaobsds_2_tfdisobslin_to) ,
                                              AV52Formulaciontinte_wwhojarutaobsds_4_tfdisobstxt_sel ,
                                              AV51Formulaciontinte_wwhojarutaobsds_3_tfdisobstxt ,
                                              Byte.valueOf(A376DisObsLin) ,
                                              A377DisObsTxt ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV34EmprCod ,
                                              Integer.valueOf(AV24DisCod) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A361DisCod) } ,
                                              new int[]{
                                              TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.STRING, TypeConstants.INT
                                              }
         });
         lV51Formulaciontinte_wwhojarutaobsds_3_tfdisobstxt = GXutil.padr( GXutil.rtrim( AV51Formulaciontinte_wwhojarutaobsds_3_tfdisobstxt), 60, "%") ;
         /* Using cursor H02832 */
         pr_default.execute(0, new Object[] {AV34EmprCod, Integer.valueOf(AV24DisCod), Byte.valueOf(AV49Formulaciontinte_wwhojarutaobsds_1_tfdisobslin), Byte.valueOf(AV50Formulaciontinte_wwhojarutaobsds_2_tfdisobslin_to), lV51Formulaciontinte_wwhojarutaobsds_3_tfdisobstxt, AV52Formulaciontinte_wwhojarutaobsds_4_tfdisobstxt_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_46_idx = 1 ;
         sGXsfl_46_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_46_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_462( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A377DisObsTxt = H02832_A377DisObsTxt[0] ;
            A376DisObsLin = H02832_A376DisObsLin[0] ;
            A378DisObsULin = H02832_A378DisObsULin[0] ;
            A337DisArtDsc = H02832_A337DisArtDsc[0] ;
            A335DisArtCod = H02832_A335DisArtCod[0] ;
            A279CliNom = H02832_A279CliNom[0] ;
            A252CliCod = H02832_A252CliCod[0] ;
            A369DisFec = H02832_A369DisFec[0] ;
            A361DisCod = H02832_A361DisCod[0] ;
            A396EmprCod = H02832_A396EmprCod[0] ;
            A378DisObsULin = H02832_A378DisObsULin[0] ;
            A337DisArtDsc = H02832_A337DisArtDsc[0] ;
            A335DisArtCod = H02832_A335DisArtCod[0] ;
            A252CliCod = H02832_A252CliCod[0] ;
            A369DisFec = H02832_A369DisFec[0] ;
            A279CliNom = H02832_A279CliNom[0] ;
            e212832 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(46) ;
         wb2830( ) ;
      }
      bGXsfl_46_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2832( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV34EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV34EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vDISCOD", GXutil.ltrim( localUtil.ntoc( AV24DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV24DisCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPRI", GXutil.rtrim( AV25BarPri));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPRI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV25BarPri, "9"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD", GXutil.ltrim( localUtil.ntoc( AV26CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV26CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLINOM", GXutil.rtrim( AV27CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27CliNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSER", GXutil.rtrim( AV28BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV28BarSer, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSERDSC", GXutil.rtrim( AV29BarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSERDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV29BarSerDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARFECGEN", localUtil.dtoc( AV30BarFecGen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFECGEN", getSecureSignedToken( "", AV30BarFecGen));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD"+"_"+sGXsfl_46_idx, getSecureSignedToken( sGXsfl_46_idx, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_DISCOD"+"_"+sGXsfl_46_idx, getSecureSignedToken( sGXsfl_46_idx, localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_DISOBSLIN"+"_"+sGXsfl_46_idx, getSecureSignedToken( sGXsfl_46_idx, localUtil.format( DecimalUtil.doubleToDec(A376DisObsLin), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV36UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV36UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV33Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV33Station, ""))));
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
      AV49Formulaciontinte_wwhojarutaobsds_1_tfdisobslin = AV15TFDisObsLin ;
      AV50Formulaciontinte_wwhojarutaobsds_2_tfdisobslin_to = AV16TFDisObsLin_To ;
      AV51Formulaciontinte_wwhojarutaobsds_3_tfdisobstxt = AV17TFDisObsTxt ;
      AV52Formulaciontinte_wwhojarutaobsds_4_tfdisobstxt_sel = AV18TFDisObsTxt_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(AV49Formulaciontinte_wwhojarutaobsds_1_tfdisobslin) ,
                                           Byte.valueOf(AV50Formulaciontinte_wwhojarutaobsds_2_tfdisobslin_to) ,
                                           AV52Formulaciontinte_wwhojarutaobsds_4_tfdisobstxt_sel ,
                                           AV51Formulaciontinte_wwhojarutaobsds_3_tfdisobstxt ,
                                           Byte.valueOf(A376DisObsLin) ,
                                           A377DisObsTxt ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV34EmprCod ,
                                           Integer.valueOf(AV24DisCod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A361DisCod) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV51Formulaciontinte_wwhojarutaobsds_3_tfdisobstxt = GXutil.padr( GXutil.rtrim( AV51Formulaciontinte_wwhojarutaobsds_3_tfdisobstxt), 60, "%") ;
      /* Using cursor H02833 */
      pr_default.execute(1, new Object[] {AV34EmprCod, Integer.valueOf(AV24DisCod), Byte.valueOf(AV49Formulaciontinte_wwhojarutaobsds_1_tfdisobslin), Byte.valueOf(AV50Formulaciontinte_wwhojarutaobsds_2_tfdisobslin_to), lV51Formulaciontinte_wwhojarutaobsds_3_tfdisobstxt, AV52Formulaciontinte_wwhojarutaobsds_4_tfdisobstxt_sel});
      GRID_nRecordCount = H02833_AGRID_nRecordCount[0] ;
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
      AV49Formulaciontinte_wwhojarutaobsds_1_tfdisobslin = AV15TFDisObsLin ;
      AV50Formulaciontinte_wwhojarutaobsds_2_tfdisobslin_to = AV16TFDisObsLin_To ;
      AV51Formulaciontinte_wwhojarutaobsds_3_tfdisobstxt = AV17TFDisObsTxt ;
      AV52Formulaciontinte_wwhojarutaobsds_4_tfdisobstxt_sel = AV18TFDisObsTxt_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV34EmprCod, AV24DisCod, AV25BarPri, AV15TFDisObsLin, AV16TFDisObsLin_To, AV17TFDisObsTxt, AV18TFDisObsTxt_Sel, AV48Pgmname, AV12OrderedBy, AV13OrderedDsc, Gx_mode, AV26CliCod, AV27CliNom, AV28BarSer, AV29BarSerDsc, AV30BarFecGen, AV36UsurCod, AV33Station) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV49Formulaciontinte_wwhojarutaobsds_1_tfdisobslin = AV15TFDisObsLin ;
      AV50Formulaciontinte_wwhojarutaobsds_2_tfdisobslin_to = AV16TFDisObsLin_To ;
      AV51Formulaciontinte_wwhojarutaobsds_3_tfdisobstxt = AV17TFDisObsTxt ;
      AV52Formulaciontinte_wwhojarutaobsds_4_tfdisobstxt_sel = AV18TFDisObsTxt_Sel ;
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( ( GRID_nRecordCount >= subgrid_fnc_recordsperpage( ) ) && ( GRID_nEOF == 0 ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV34EmprCod, AV24DisCod, AV25BarPri, AV15TFDisObsLin, AV16TFDisObsLin_To, AV17TFDisObsTxt, AV18TFDisObsTxt_Sel, AV48Pgmname, AV12OrderedBy, AV13OrderedDsc, Gx_mode, AV26CliCod, AV27CliNom, AV28BarSer, AV29BarSerDsc, AV30BarFecGen, AV36UsurCod, AV33Station) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV49Formulaciontinte_wwhojarutaobsds_1_tfdisobslin = AV15TFDisObsLin ;
      AV50Formulaciontinte_wwhojarutaobsds_2_tfdisobslin_to = AV16TFDisObsLin_To ;
      AV51Formulaciontinte_wwhojarutaobsds_3_tfdisobstxt = AV17TFDisObsTxt ;
      AV52Formulaciontinte_wwhojarutaobsds_4_tfdisobstxt_sel = AV18TFDisObsTxt_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV34EmprCod, AV24DisCod, AV25BarPri, AV15TFDisObsLin, AV16TFDisObsLin_To, AV17TFDisObsTxt, AV18TFDisObsTxt_Sel, AV48Pgmname, AV12OrderedBy, AV13OrderedDsc, Gx_mode, AV26CliCod, AV27CliNom, AV28BarSer, AV29BarSerDsc, AV30BarFecGen, AV36UsurCod, AV33Station) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV49Formulaciontinte_wwhojarutaobsds_1_tfdisobslin = AV15TFDisObsLin ;
      AV50Formulaciontinte_wwhojarutaobsds_2_tfdisobslin_to = AV16TFDisObsLin_To ;
      AV51Formulaciontinte_wwhojarutaobsds_3_tfdisobstxt = AV17TFDisObsTxt ;
      AV52Formulaciontinte_wwhojarutaobsds_4_tfdisobstxt_sel = AV18TFDisObsTxt_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV34EmprCod, AV24DisCod, AV25BarPri, AV15TFDisObsLin, AV16TFDisObsLin_To, AV17TFDisObsTxt, AV18TFDisObsTxt_Sel, AV48Pgmname, AV12OrderedBy, AV13OrderedDsc, Gx_mode, AV26CliCod, AV27CliNom, AV28BarSer, AV29BarSerDsc, AV30BarFecGen, AV36UsurCod, AV33Station) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV49Formulaciontinte_wwhojarutaobsds_1_tfdisobslin = AV15TFDisObsLin ;
      AV50Formulaciontinte_wwhojarutaobsds_2_tfdisobslin_to = AV16TFDisObsLin_To ;
      AV51Formulaciontinte_wwhojarutaobsds_3_tfdisobstxt = AV17TFDisObsTxt ;
      AV52Formulaciontinte_wwhojarutaobsds_4_tfdisobstxt_sel = AV18TFDisObsTxt_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV34EmprCod, AV24DisCod, AV25BarPri, AV15TFDisObsLin, AV16TFDisObsLin_To, AV17TFDisObsTxt, AV18TFDisObsTxt_Sel, AV48Pgmname, AV12OrderedBy, AV13OrderedDsc, Gx_mode, AV26CliCod, AV27CliNom, AV28BarSer, AV29BarSerDsc, AV30BarFecGen, AV36UsurCod, AV33Station) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV48Pgmname = "FormulacionTinte.WWHojaRutaObs" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48Pgmname", AV48Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2830( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e192832 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV19DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_46 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_46"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV21GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV22GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         Dvelop_confirmpanel_btnobservacionespedidoanterior_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNOBSERVACIONESPEDIDOANTERIOR_Title") ;
         Dvelop_confirmpanel_btnobservacionespedidoanterior_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNOBSERVACIONESPEDIDOANTERIOR_Confirmationtext") ;
         Dvelop_confirmpanel_btnobservacionespedidoanterior_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNOBSERVACIONESPEDIDOANTERIOR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btnobservacionespedidoanterior_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNOBSERVACIONESPEDIDOANTERIOR_Nobuttoncaption") ;
         Dvelop_confirmpanel_btnobservacionespedidoanterior_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNOBSERVACIONESPEDIDOANTERIOR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btnobservacionespedidoanterior_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNOBSERVACIONESPEDIDOANTERIOR_Yesbuttonposition") ;
         Dvelop_confirmpanel_btnobservacionespedidoanterior_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNOBSERVACIONESPEDIDOANTERIOR_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Fixedcolumns = httpContext.cgiGet( "GRID_EMPOWERER_Fixedcolumns") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( "DDO_GRID_Filteredtextto_get") ;
         Dvelop_confirmpanel_btnobservacionespedidoanterior_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNOBSERVACIONESPEDIDOANTERIOR_Result") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavDisobslin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavDisobslin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDISOBSLIN");
            GX_FocusControl = edtavDisobslin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV31DisObsLin = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31DisObsLin", GXutil.str( AV31DisObsLin, 1, 0));
         }
         else
         {
            AV31DisObsLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtavDisobslin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31DisObsLin", GXutil.str( AV31DisObsLin, 1, 0));
         }
         AV32DisObsTxt = httpContext.cgiGet( edtavDisobstxt_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32DisObsTxt", AV32DisObsTxt);
         AV48Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48Pgmname", AV48Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"WWHojaRutaObs");
         AV48Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48Pgmname", AV48Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV48Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("formulaciontinte\\wwhojarutaobs:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e192832 ();
      if (returnInSub) return;
   }

   public void e192832( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV33Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wwhojarutaobs_impl.this.GXt_char1 = GXv_char2[0] ;
      AV33Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Station", AV33Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV33Station, ""))));
      GXv_char2[0] = AV34EmprCod ;
      GXv_char3[0] = AV35EmprNom ;
      GXv_char4[0] = AV36UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV33Station, GXv_char2, GXv_char3, GXv_char4) ;
      wwhojarutaobs_impl.this.AV34EmprCod = GXv_char2[0] ;
      wwhojarutaobs_impl.this.AV35EmprNom = GXv_char3[0] ;
      wwhojarutaobs_impl.this.AV36UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34EmprCod", AV34EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV34EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV36UsurCod", AV36UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV36UsurCod, "@!"))));
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Observaciones del pedido", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV19DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV19DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_int7 = AV44moda21 ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV34EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int8) ;
      wwhojarutaobs_impl.this.GXt_int7 = GXv_int8[0] ;
      AV44moda21 = GXt_int7 ;
      bttBtntipospresentacion_Visible = (((GXutil.strcmp(Gx_mode, "DSP")==0) ? false : true) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntipospresentacion_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntipospresentacion_Visible), 5, 0), true);
      bttBtnobservacionespedidoanterior_Visible = ((((GXutil.strcmp(Gx_mode, "DSP")==0)||(0==AV44moda21)) ? false : true) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtnobservacionespedidoanterior_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnobservacionespedidoanterior_Visible), 5, 0), true);
   }

   public void e202832( )
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
      S142 ();
      if (returnInSub) return;
      AV21GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21GridCurrentPage), 10, 0));
      AV22GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22GridPageCount), 10, 0));
      GXt_int7 = AV31DisObsLin ;
      GXv_int8[0] = GXt_int7 ;
      new app.getdisobsdisobslin(remoteHandle, context).execute( AV34EmprCod, AV24DisCod, AV25BarPri, GXv_int8) ;
      wwhojarutaobs_impl.this.GXt_int7 = GXv_int8[0] ;
      AV31DisObsLin = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31DisObsLin", GXutil.str( AV31DisObsLin, 1, 0));
      AV49Formulaciontinte_wwhojarutaobsds_1_tfdisobslin = AV15TFDisObsLin ;
      AV50Formulaciontinte_wwhojarutaobsds_2_tfdisobslin_to = AV16TFDisObsLin_To ;
      AV51Formulaciontinte_wwhojarutaobsds_3_tfdisobstxt = AV17TFDisObsTxt ;
      AV52Formulaciontinte_wwhojarutaobsds_4_tfdisobstxt_sel = AV18TFDisObsTxt_Sel ;
      /*  Sending Event outputs  */
   }

   public void e122832( )
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
         AV20PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV20PageToGo) ;
      }
   }

   public void e132832( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e142832( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisObsLin") == 0 )
         {
            AV15TFDisObsLin = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15TFDisObsLin", GXutil.str( AV15TFDisObsLin, 1, 0));
            AV16TFDisObsLin_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16TFDisObsLin_To", GXutil.str( AV16TFDisObsLin_To, 1, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisObsTxt") == 0 )
         {
            AV17TFDisObsTxt = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17TFDisObsTxt", AV17TFDisObsTxt);
            AV18TFDisObsTxt_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18TFDisObsTxt_Sel", AV18TFDisObsTxt_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e212832( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(46) ;
      }
      sendrow_462( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_46_Refreshing )
      {
         httpContext.doAjaxLoad(46, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV23GridActions, 4, 0)) );
   }

   public void e162832( )
   {
      /* 'DoAgregar' Routine */
      returnInSub = false ;
      if ( (0==AV31DisObsLin) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Linea NO valida", ""));
         GX_FocusControl = edtavDisobslin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         GXt_boolean10 = AV43isCommit ;
         GXv_boolean11[0] = GXt_boolean10 ;
         new app.setgetdisobsdisobs(remoteHandle, context).execute( AV34EmprCod, AV24DisCod, AV25BarPri, AV31DisObsLin, AV32DisObsTxt, GXv_boolean11) ;
         wwhojarutaobs_impl.this.GXt_boolean10 = GXv_boolean11[0] ;
         AV43isCommit = GXt_boolean10 ;
         if ( ! AV43isCommit )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo ya existe !", ""));
         }
         AV32DisObsTxt = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32DisObsTxt", AV32DisObsTxt);
         gxgrgrid_refresh( subGrid_Rows, AV34EmprCod, AV24DisCod, AV25BarPri, AV15TFDisObsLin, AV16TFDisObsLin_To, AV17TFDisObsTxt, AV18TFDisObsTxt_Sel, AV48Pgmname, AV12OrderedBy, AV13OrderedDsc, Gx_mode, AV26CliCod, AV27CliNom, AV28BarSer, AV29BarSerDsc, AV30BarFecGen, AV36UsurCod, AV33Station) ;
         GXt_int7 = AV31DisObsLin ;
         GXv_int8[0] = GXt_int7 ;
         new app.getdisobsdisobslin(remoteHandle, context).execute( AV34EmprCod, AV24DisCod, AV25BarPri, GXv_int8) ;
         wwhojarutaobs_impl.this.GXt_int7 = GXv_int8[0] ;
         AV31DisObsLin = GXt_int7 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31DisObsLin", GXutil.str( AV31DisObsLin, 1, 0));
      }
      /*  Sending Event outputs  */
   }

   public void e172832( )
   {
      /* 'DoTiposPresentacion' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.pedidos.tiposdepresentacion_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV34EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV24DisCod,8,0))}, new String[] {"Emprcod","DisCod"}) , new Object[] {});
      new app.pordlinobs(remoteHandle, context).execute( AV34EmprCod, AV24DisCod) ;
      GXt_int7 = AV31DisObsLin ;
      GXv_int8[0] = GXt_int7 ;
      new app.getdisobsdisobslin(remoteHandle, context).execute( AV34EmprCod, AV24DisCod, AV25BarPri, GXv_int8) ;
      wwhojarutaobs_impl.this.GXt_int7 = GXv_int8[0] ;
      AV31DisObsLin = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31DisObsLin", GXutil.str( AV31DisObsLin, 1, 0));
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e152832( )
   {
      /* Dvelop_confirmpanel_btnobservacionespedidoanterior_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_btnobservacionespedidoanterior_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION OBSERVACIONESPEDIDOANTERIOR' */
         S172 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e182832( )
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
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.pedidos.disobs", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A376DisObsLin,1,0))}, new String[] {"Mode","EmprCod","DisCod","DisObsLin"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S162( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.pedidos.disobs", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A376DisObsLin,1,0))}, new String[] {"Mode","EmprCod","DisCod","DisObsLin"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV14Session.getValue(AV48Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV48Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV14Session.getValue(AV48Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV53GXV1 = 1 ;
      while ( AV53GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV53GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISOBSLIN") == 0 )
         {
            AV15TFDisObsLin = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15TFDisObsLin", GXutil.str( AV15TFDisObsLin, 1, 0));
            AV16TFDisObsLin_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16TFDisObsLin_To", GXutil.str( AV16TFDisObsLin_To, 1, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISOBSTXT") == 0 )
         {
            AV17TFDisObsTxt = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17TFDisObsTxt", AV17TFDisObsTxt);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISOBSTXT_SEL") == 0 )
         {
            AV18TFDisObsTxt_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18TFDisObsTxt_Sel", AV18TFDisObsTxt_Sel);
         }
         AV53GXV1 = (int)(AV53GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV18TFDisObsTxt_Sel)==0), AV18TFDisObsTxt_Sel, GXv_char4) ;
      wwhojarutaobs_impl.this.GXt_char1 = GXv_char4[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV17TFDisObsTxt)==0), AV17TFDisObsTxt, GXv_char4) ;
      wwhojarutaobs_impl.this.GXt_char1 = GXv_char4[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV15TFDisObsLin) ? "" : GXutil.str( AV15TFDisObsLin, 1, 0))+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV16TFDisObsLin_To) ? "" : GXutil.str( AV16TFDisObsLin_To, 1, 0))+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S142( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV14Session.getValue(AV48Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState12[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFDISOBSLIN", "", !((0==AV15TFDisObsLin)&&(0==AV16TFDisObsLin_To)), (short)(0), GXutil.trim( GXutil.str( AV15TFDisObsLin, 1, 0)), GXutil.trim( GXutil.str( AV16TFDisObsLin_To, 1, 0))) ;
      AV10GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFDISOBSTXT", "", !(GXutil.strcmp("", AV17TFDisObsTxt)==0), (short)(0), AV17TFDisObsTxt, "", !(GXutil.strcmp("", AV18TFDisObsTxt_Sel)==0), AV18TFDisObsTxt_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState12[0] ;
      if ( ! (GXutil.strcmp("", Gx_mode)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MODE" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( Gx_mode );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV24DisCod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&DISCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV24DisCod, 8, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV25BarPri)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARPRI" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV25BarPri );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV26CliCod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV26CliCod, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV27CliNom)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLINOM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV27CliNom );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV28BarSer)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARSER" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV28BarSer );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV29BarSerDsc)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARSERDSC" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV29BarSerDsc );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV30BarFecGen)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARFECGEN" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV30BarFecGen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV48Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV48Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "Pedidos.DisObs" );
      AV14Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S172( )
   {
      /* 'DO ACTION OBSERVACIONESPEDIDOANTERIOR' Routine */
      returnInSub = false ;
      AV40Var_Discod = (int)(AV24DisCod-1) ;
      GXv_objcol_SdtMessages_Message13[0] = AV41messages ;
      new app.pobscopyenc2(remoteHandle, context).execute( AV34EmprCod, AV24DisCod, AV40Var_Discod, AV36UsurCod, AV33Station, GXv_objcol_SdtMessages_Message13) ;
      AV41messages = GXv_objcol_SdtMessages_Message13[0] ;
      new app.pordlinobs(remoteHandle, context).execute( AV34EmprCod, AV24DisCod) ;
      GXt_int7 = AV31DisObsLin ;
      GXv_int8[0] = GXt_int7 ;
      new app.getdisobsdisobslin(remoteHandle, context).execute( AV34EmprCod, AV24DisCod, AV25BarPri, GXv_int8) ;
      wwhojarutaobs_impl.this.GXt_int7 = GXv_int8[0] ;
      AV31DisObsLin = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31DisObsLin", GXutil.str( AV31DisObsLin, 1, 0));
      httpContext.doAjaxRefresh();
   }

   public void wb_table1_72_2832( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_btnobservacionespedidoanterior_Internalname, tblTabledvelop_confirmpanel_btnobservacionespedidoanterior_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_btnobservacionespedidoanterior.setProperty("Title", Dvelop_confirmpanel_btnobservacionespedidoanterior_Title);
         ucDvelop_confirmpanel_btnobservacionespedidoanterior.setProperty("ConfirmationText", Dvelop_confirmpanel_btnobservacionespedidoanterior_Confirmationtext);
         ucDvelop_confirmpanel_btnobservacionespedidoanterior.setProperty("YesButtonCaption", Dvelop_confirmpanel_btnobservacionespedidoanterior_Yesbuttoncaption);
         ucDvelop_confirmpanel_btnobservacionespedidoanterior.setProperty("NoButtonCaption", Dvelop_confirmpanel_btnobservacionespedidoanterior_Nobuttoncaption);
         ucDvelop_confirmpanel_btnobservacionespedidoanterior.setProperty("CancelButtonCaption", Dvelop_confirmpanel_btnobservacionespedidoanterior_Cancelbuttoncaption);
         ucDvelop_confirmpanel_btnobservacionespedidoanterior.setProperty("YesButtonPosition", Dvelop_confirmpanel_btnobservacionespedidoanterior_Yesbuttonposition);
         ucDvelop_confirmpanel_btnobservacionespedidoanterior.setProperty("ConfirmType", Dvelop_confirmpanel_btnobservacionespedidoanterior_Confirmtype);
         ucDvelop_confirmpanel_btnobservacionespedidoanterior.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_btnobservacionespedidoanterior_Internalname, "DVELOP_CONFIRMPANEL_BTNOBSERVACIONESPEDIDOANTERIORContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_BTNOBSERVACIONESPEDIDOANTERIORContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_72_2832e( true) ;
      }
      else
      {
         wb_table1_72_2832e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      Gx_mode = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      AV24DisCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24DisCod), 8, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV24DisCod), "ZZZZZZZ9")));
      AV25BarPri = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25BarPri", AV25BarPri);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPRI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV25BarPri, "9"))));
      AV26CliCod = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26CliCod), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV26CliCod), "ZZZZZ9")));
      AV27CliNom = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27CliNom", AV27CliNom);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27CliNom, ""))));
      AV28BarSer = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28BarSer", AV28BarSer);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV28BarSer, ""))));
      AV29BarSerDsc = (String)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29BarSerDsc", AV29BarSerDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSERDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV29BarSerDsc, ""))));
      AV30BarFecGen = (java.util.Date)getParm(obj,7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30BarFecGen", localUtil.format(AV30BarFecGen, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFECGEN", getSecureSignedToken( "", AV30BarFecGen));
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
      pa2832( ) ;
      ws2832( ) ;
      we2832( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211615257", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/wwhojarutaobs.js", "?20268211615257", false, true);
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

   public void subsflControlProps_462( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_46_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_46_idx ;
      edtDisCod_Internalname = "DISCOD_"+sGXsfl_46_idx ;
      edtDisFec_Internalname = "DISFEC_"+sGXsfl_46_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_46_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_46_idx ;
      edtDisArtCod_Internalname = "DISARTCOD_"+sGXsfl_46_idx ;
      edtDisArtDsc_Internalname = "DISARTDSC_"+sGXsfl_46_idx ;
      edtDisObsULin_Internalname = "DISOBSULIN_"+sGXsfl_46_idx ;
      edtDisObsLin_Internalname = "DISOBSLIN_"+sGXsfl_46_idx ;
      edtDisObsTxt_Internalname = "DISOBSTXT_"+sGXsfl_46_idx ;
   }

   public void subsflControlProps_fel_462( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_46_fel_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_46_fel_idx ;
      edtDisCod_Internalname = "DISCOD_"+sGXsfl_46_fel_idx ;
      edtDisFec_Internalname = "DISFEC_"+sGXsfl_46_fel_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_46_fel_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_46_fel_idx ;
      edtDisArtCod_Internalname = "DISARTCOD_"+sGXsfl_46_fel_idx ;
      edtDisArtDsc_Internalname = "DISARTDSC_"+sGXsfl_46_fel_idx ;
      edtDisObsULin_Internalname = "DISOBSULIN_"+sGXsfl_46_fel_idx ;
      edtDisObsLin_Internalname = "DISOBSLIN_"+sGXsfl_46_fel_idx ;
      edtDisObsTxt_Internalname = "DISOBSTXT_"+sGXsfl_46_fel_idx ;
   }

   public void sendrow_462( )
   {
      subsflControlProps_462( ) ;
      wb2830( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_46_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_46_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_46_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 47,'',false,'"+sGXsfl_46_idx+"',46)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_46_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV23GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV23GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV23GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(7),"'"+""+"'"+",false,"+"'"+"e222832_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,47);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV23GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_46_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisCod_Internalname,GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisFec_Internalname,localUtil.format(A369DisFec, "99/99/99"),localUtil.format( A369DisFec, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisArtCod_Internalname,GXutil.rtrim( A335DisArtCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisArtCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisArtDsc_Internalname,GXutil.rtrim( A337DisArtDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisArtDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisObsULin_Internalname,GXutil.ltrim( localUtil.ntoc( A378DisObsULin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A378DisObsULin), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisObsULin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisObsLin_Internalname,GXutil.ltrim( localUtil.ntoc( A376DisObsLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A376DisObsLin), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisObsLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisObsTxt_Internalname,GXutil.rtrim( A377DisObsTxt),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisObsTxt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes2832( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_46_idx = ((subGrid_Islastpage==1)&&(nGXsfl_46_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_46_idx+1) ;
         sGXsfl_46_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_46_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_462( ) ;
      }
      /* End function sendrow_462 */
   }

   public void startgridcontrol46( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"46\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ConvertToDDO"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Empresa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Disposicion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Pedido", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Artículo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Artículo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ultima Linea", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Observacion", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV23GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A369DisFec, "99/99/99"));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A279CliNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A335DisArtCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A337DisArtDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A378DisObsULin, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A376DisObsLin, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A377DisObsTxt));
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
      edtavDisobslin_Internalname = "vDISOBSLIN" ;
      edtavDisobstxt_Internalname = "vDISOBSTXT" ;
      divTableforms_Internalname = "TABLEFORMS" ;
      bttBtnagregar_Internalname = "BTNAGREGAR" ;
      bttBtntipospresentacion_Internalname = "BTNTIPOSPRESENTACION" ;
      bttBtnobservacionespedidoanterior_Internalname = "BTNOBSERVACIONESPEDIDOANTERIOR" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      divTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtDisCod_Internalname = "DISCOD" ;
      edtDisFec_Internalname = "DISFEC" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtDisArtCod_Internalname = "DISARTCOD" ;
      edtDisArtDsc_Internalname = "DISARTDSC" ;
      edtDisObsULin_Internalname = "DISOBSULIN" ;
      edtDisObsLin_Internalname = "DISOBSLIN" ;
      edtDisObsTxt_Internalname = "DISOBSTXT" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Dvelop_confirmpanel_btnobservacionespedidoanterior_Internalname = "DVELOP_CONFIRMPANEL_BTNOBSERVACIONESPEDIDOANTERIOR" ;
      tblTabledvelop_confirmpanel_btnobservacionespedidoanterior_Internalname = "TABLEDVELOP_CONFIRMPANEL_BTNOBSERVACIONESPEDIDOANTERIOR" ;
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
      edtDisObsTxt_Jsonclick = "" ;
      edtDisObsLin_Jsonclick = "" ;
      edtDisObsULin_Jsonclick = "" ;
      edtDisArtDsc_Jsonclick = "" ;
      edtDisArtCod_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtDisFec_Jsonclick = "" ;
      edtDisCod_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtnobservacionespedidoanterior_Visible = 1 ;
      bttBtntipospresentacion_Visible = 1 ;
      edtavDisobstxt_Jsonclick = "" ;
      edtavDisobstxt_Enabled = 1 ;
      edtavDisobslin_Jsonclick = "" ;
      edtavDisobslin_Enabled = 1 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;" ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_btnobservacionespedidoanterior_Confirmtype = "1" ;
      Dvelop_confirmpanel_btnobservacionespedidoanterior_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btnobservacionespedidoanterior_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btnobservacionespedidoanterior_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btnobservacionespedidoanterior_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btnobservacionespedidoanterior_Confirmationtext = "¿Desea copiar las observaciones del Pedido Anterior?" ;
      Dvelop_confirmpanel_btnobservacionespedidoanterior_Title = "" ;
      Ddo_grid_Datalistproc = "FormulacionTinte.WWHojaRutaObsGetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic" ;
      Ddo_grid_Includedatalist = "|T" ;
      Ddo_grid_Filterisrange = "T|" ;
      Ddo_grid_Filtertype = "Numeric|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "1|2" ;
      Ddo_grid_Columnids = "9:DisObsLin|10:DisObsTxt" ;
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
      Form.setCaption( httpContext.getMessage( " Observaciones del pedido", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_46_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV23GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV23GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23GridActions), 4, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV34EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV24DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV25BarPri',fld:'vBARPRI',pic:'9',hsh:true},{av:'AV15TFDisObsLin',fld:'vTFDISOBSLIN',pic:'9'},{av:'AV16TFDisObsLin_To',fld:'vTFDISOBSLIN_TO',pic:'9'},{av:'AV17TFDisObsTxt',fld:'vTFDISOBSTXT',pic:''},{av:'AV18TFDisObsTxt_Sel',fld:'vTFDISOBSTXT_SEL',pic:''},{av:'AV48Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV26CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV27CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV28BarSer',fld:'vBARSER',pic:'',hsh:true},{av:'AV29BarSerDsc',fld:'vBARSERDSC',pic:'',hsh:true},{av:'AV30BarFecGen',fld:'vBARFECGEN',pic:'',hsh:true},{av:'AV36UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV33Station',fld:'vSTATION',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV21GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV22GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV31DisObsLin',fld:'vDISOBSLIN',pic:'9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e122832',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV34EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV24DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV25BarPri',fld:'vBARPRI',pic:'9',hsh:true},{av:'AV15TFDisObsLin',fld:'vTFDISOBSLIN',pic:'9'},{av:'AV16TFDisObsLin_To',fld:'vTFDISOBSLIN_TO',pic:'9'},{av:'AV17TFDisObsTxt',fld:'vTFDISOBSTXT',pic:''},{av:'AV18TFDisObsTxt_Sel',fld:'vTFDISOBSTXT_SEL',pic:''},{av:'AV48Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV26CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV27CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV28BarSer',fld:'vBARSER',pic:'',hsh:true},{av:'AV29BarSerDsc',fld:'vBARSERDSC',pic:'',hsh:true},{av:'AV30BarFecGen',fld:'vBARFECGEN',pic:'',hsh:true},{av:'AV36UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV33Station',fld:'vSTATION',pic:'',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e132832',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV34EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV24DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV25BarPri',fld:'vBARPRI',pic:'9',hsh:true},{av:'AV15TFDisObsLin',fld:'vTFDISOBSLIN',pic:'9'},{av:'AV16TFDisObsLin_To',fld:'vTFDISOBSLIN_TO',pic:'9'},{av:'AV17TFDisObsTxt',fld:'vTFDISOBSTXT',pic:''},{av:'AV18TFDisObsTxt_Sel',fld:'vTFDISOBSTXT_SEL',pic:''},{av:'AV48Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV26CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV27CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV28BarSer',fld:'vBARSER',pic:'',hsh:true},{av:'AV29BarSerDsc',fld:'vBARSERDSC',pic:'',hsh:true},{av:'AV30BarFecGen',fld:'vBARFECGEN',pic:'',hsh:true},{av:'AV36UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV33Station',fld:'vSTATION',pic:'',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e142832',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV34EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV24DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV25BarPri',fld:'vBARPRI',pic:'9',hsh:true},{av:'AV15TFDisObsLin',fld:'vTFDISOBSLIN',pic:'9'},{av:'AV16TFDisObsLin_To',fld:'vTFDISOBSLIN_TO',pic:'9'},{av:'AV17TFDisObsTxt',fld:'vTFDISOBSTXT',pic:''},{av:'AV18TFDisObsTxt_Sel',fld:'vTFDISOBSTXT_SEL',pic:''},{av:'AV48Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV26CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV27CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV28BarSer',fld:'vBARSER',pic:'',hsh:true},{av:'AV29BarSerDsc',fld:'vBARSERDSC',pic:'',hsh:true},{av:'AV30BarFecGen',fld:'vBARFECGEN',pic:'',hsh:true},{av:'AV36UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV33Station',fld:'vSTATION',pic:'',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15TFDisObsLin',fld:'vTFDISOBSLIN',pic:'9'},{av:'AV16TFDisObsLin_To',fld:'vTFDISOBSLIN_TO',pic:'9'},{av:'AV17TFDisObsTxt',fld:'vTFDISOBSTXT',pic:''},{av:'AV18TFDisObsTxt_Sel',fld:'vTFDISOBSTXT_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e212832',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV23GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e222832',iparms:[{av:'cmbavGridactions'},{av:'AV23GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A376DisObsLin',fld:'DISOBSLIN',pic:'9',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV23GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("'DOAGREGAR'","{handler:'e162832',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV34EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV24DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV25BarPri',fld:'vBARPRI',pic:'9',hsh:true},{av:'AV15TFDisObsLin',fld:'vTFDISOBSLIN',pic:'9'},{av:'AV16TFDisObsLin_To',fld:'vTFDISOBSLIN_TO',pic:'9'},{av:'AV17TFDisObsTxt',fld:'vTFDISOBSTXT',pic:''},{av:'AV18TFDisObsTxt_Sel',fld:'vTFDISOBSTXT_SEL',pic:''},{av:'AV48Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV26CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV27CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV28BarSer',fld:'vBARSER',pic:'',hsh:true},{av:'AV29BarSerDsc',fld:'vBARSERDSC',pic:'',hsh:true},{av:'AV30BarFecGen',fld:'vBARFECGEN',pic:'',hsh:true},{av:'AV36UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV33Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV31DisObsLin',fld:'vDISOBSLIN',pic:'9'},{av:'AV32DisObsTxt',fld:'vDISOBSTXT',pic:''}]");
      setEventMetadata("'DOAGREGAR'",",oparms:[{av:'AV32DisObsTxt',fld:'vDISOBSTXT',pic:''},{av:'AV31DisObsLin',fld:'vDISOBSLIN',pic:'9'},{av:'AV21GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV22GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOTIPOSPRESENTACION'","{handler:'e172832',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV34EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV24DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV25BarPri',fld:'vBARPRI',pic:'9',hsh:true},{av:'AV15TFDisObsLin',fld:'vTFDISOBSLIN',pic:'9'},{av:'AV16TFDisObsLin_To',fld:'vTFDISOBSLIN_TO',pic:'9'},{av:'AV17TFDisObsTxt',fld:'vTFDISOBSTXT',pic:''},{av:'AV18TFDisObsTxt_Sel',fld:'vTFDISOBSTXT_SEL',pic:''},{av:'AV48Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV26CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV27CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV28BarSer',fld:'vBARSER',pic:'',hsh:true},{av:'AV29BarSerDsc',fld:'vBARSERDSC',pic:'',hsh:true},{av:'AV30BarFecGen',fld:'vBARFECGEN',pic:'',hsh:true},{av:'AV36UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV33Station',fld:'vSTATION',pic:'',hsh:true}]");
      setEventMetadata("'DOTIPOSPRESENTACION'",",oparms:[{av:'AV31DisObsLin',fld:'vDISOBSLIN',pic:'9'},{av:'AV21GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV22GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOOBSERVACIONESPEDIDOANTERIOR'","{handler:'e112831',iparms:[]");
      setEventMetadata("'DOOBSERVACIONESPEDIDOANTERIOR'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNOBSERVACIONESPEDIDOANTERIOR.CLOSE","{handler:'e152832',iparms:[{av:'Dvelop_confirmpanel_btnobservacionespedidoanterior_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNOBSERVACIONESPEDIDOANTERIOR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV34EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV24DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV25BarPri',fld:'vBARPRI',pic:'9',hsh:true},{av:'AV15TFDisObsLin',fld:'vTFDISOBSLIN',pic:'9'},{av:'AV16TFDisObsLin_To',fld:'vTFDISOBSLIN_TO',pic:'9'},{av:'AV17TFDisObsTxt',fld:'vTFDISOBSTXT',pic:''},{av:'AV18TFDisObsTxt_Sel',fld:'vTFDISOBSTXT_SEL',pic:''},{av:'AV48Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV26CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV27CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV28BarSer',fld:'vBARSER',pic:'',hsh:true},{av:'AV29BarSerDsc',fld:'vBARSERDSC',pic:'',hsh:true},{av:'AV30BarFecGen',fld:'vBARFECGEN',pic:'',hsh:true},{av:'AV36UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV33Station',fld:'vSTATION',pic:'',hsh:true}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNOBSERVACIONESPEDIDOANTERIOR.CLOSE",",oparms:[{av:'AV31DisObsLin',fld:'vDISOBSLIN',pic:'9'},{av:'AV21GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV22GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e182832',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_DISCOD","{handler:'valid_Discod',iparms:[]");
      setEventMetadata("VALID_DISCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Disobstxt',iparms:[]");
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
      wcpOGx_mode = "" ;
      wcpOAV25BarPri = "" ;
      wcpOAV27CliNom = "" ;
      wcpOAV28BarSer = "" ;
      wcpOAV29BarSerDsc = "" ;
      wcpOAV30BarFecGen = GXutil.nullDate() ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Dvelop_confirmpanel_btnobservacionespedidoanterior_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      AV25BarPri = "" ;
      AV27CliNom = "" ;
      AV28BarSer = "" ;
      AV29BarSerDsc = "" ;
      AV30BarFecGen = GXutil.nullDate() ;
      AV34EmprCod = "" ;
      AV17TFDisObsTxt = "" ;
      AV18TFDisObsTxt_Sel = "" ;
      AV48Pgmname = "" ;
      AV36UsurCod = "" ;
      AV33Station = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV19DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV32DisObsTxt = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnagregar_Jsonclick = "" ;
      bttBtntipospresentacion_Jsonclick = "" ;
      bttBtnobservacionespedidoanterior_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A396EmprCod = "" ;
      A369DisFec = GXutil.nullDate() ;
      A279CliNom = "" ;
      A335DisArtCod = "" ;
      A337DisArtDsc = "" ;
      A377DisObsTxt = "" ;
      scmdbuf = "" ;
      lV51Formulaciontinte_wwhojarutaobsds_3_tfdisobstxt = "" ;
      AV52Formulaciontinte_wwhojarutaobsds_4_tfdisobstxt_sel = "" ;
      AV51Formulaciontinte_wwhojarutaobsds_3_tfdisobstxt = "" ;
      H02832_A377DisObsTxt = new String[] {""} ;
      H02832_A376DisObsLin = new byte[1] ;
      H02832_A378DisObsULin = new byte[1] ;
      H02832_A337DisArtDsc = new String[] {""} ;
      H02832_A335DisArtCod = new String[] {""} ;
      H02832_A279CliNom = new String[] {""} ;
      H02832_A252CliCod = new int[1] ;
      H02832_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      H02832_A361DisCod = new int[1] ;
      H02832_A396EmprCod = new String[] {""} ;
      H02833_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      GXv_char2 = new String[1] ;
      AV35EmprNom = "" ;
      GXv_char3 = new String[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      GXv_boolean11 = new boolean[1] ;
      AV14Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_SdtWWPGridState12 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      AV41messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXv_objcol_SdtMessages_Message13 = new GXBaseCollection[1] ;
      GXv_int8 = new byte[1] ;
      ucDvelop_confirmpanel_btnobservacionespedidoanterior = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.wwhojarutaobs__default(),
         new Object[] {
             new Object[] {
            H02832_A377DisObsTxt, H02832_A376DisObsLin, H02832_A378DisObsULin, H02832_A337DisArtDsc, H02832_A335DisArtCod, H02832_A279CliNom, H02832_A252CliCod, H02832_A369DisFec, H02832_A361DisCod, H02832_A396EmprCod
            }
            , new Object[] {
            H02833_AGRID_nRecordCount
            }
         }
      );
      AV48Pgmname = "FormulacionTinte.WWHojaRutaObs" ;
      /* GeneXus formulas. */
      AV48Pgmname = "FormulacionTinte.WWHojaRutaObs" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV15TFDisObsLin ;
   private byte AV16TFDisObsLin_To ;
   private byte gxajaxcallmode ;
   private byte AV31DisObsLin ;
   private byte A378DisObsULin ;
   private byte A376DisObsLin ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV49Formulaciontinte_wwhojarutaobsds_1_tfdisobslin ;
   private byte AV50Formulaciontinte_wwhojarutaobsds_2_tfdisobslin_to ;
   private byte AV44moda21 ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
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
   private short AV23GridActions ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV24DisCod ;
   private int wcpOAV26CliCod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_46 ;
   private int AV24DisCod ;
   private int AV26CliCod ;
   private int nGXsfl_46_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavDisobslin_Enabled ;
   private int edtavDisobstxt_Enabled ;
   private int bttBtntipospresentacion_Visible ;
   private int bttBtnobservacionespedidoanterior_Visible ;
   private int edtavPgmname_Enabled ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV20PageToGo ;
   private int AV53GXV1 ;
   private int AV40Var_Discod ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV21GridCurrentPage ;
   private long AV22GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String wcpOGx_mode ;
   private String wcpOAV25BarPri ;
   private String wcpOAV27CliNom ;
   private String wcpOAV28BarSer ;
   private String wcpOAV29BarSerDsc ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Dvelop_confirmpanel_btnobservacionespedidoanterior_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String AV25BarPri ;
   private String AV27CliNom ;
   private String AV28BarSer ;
   private String AV29BarSerDsc ;
   private String sGXsfl_46_idx="0001" ;
   private String AV34EmprCod ;
   private String AV17TFDisObsTxt ;
   private String AV18TFDisObsTxt_Sel ;
   private String AV48Pgmname ;
   private String AV36UsurCod ;
   private String AV33Station ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
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
   private String Dvelop_confirmpanel_btnobservacionespedidoanterior_Title ;
   private String Dvelop_confirmpanel_btnobservacionespedidoanterior_Confirmationtext ;
   private String Dvelop_confirmpanel_btnobservacionespedidoanterior_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btnobservacionespedidoanterior_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btnobservacionespedidoanterior_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btnobservacionespedidoanterior_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btnobservacionespedidoanterior_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Fixedcolumns ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableforms_Internalname ;
   private String edtavDisobslin_Internalname ;
   private String TempTags ;
   private String edtavDisobslin_Jsonclick ;
   private String edtavDisobstxt_Internalname ;
   private String AV32DisObsTxt ;
   private String edtavDisobstxt_Jsonclick ;
   private String divTableactions_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnagregar_Internalname ;
   private String bttBtnagregar_Jsonclick ;
   private String bttBtntipospresentacion_Internalname ;
   private String bttBtntipospresentacion_Jsonclick ;
   private String bttBtnobservacionespedidoanterior_Internalname ;
   private String bttBtnobservacionespedidoanterior_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divTablerightheader_Internalname ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String edtDisCod_Internalname ;
   private String edtDisFec_Internalname ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A335DisArtCod ;
   private String edtDisArtCod_Internalname ;
   private String A337DisArtDsc ;
   private String edtDisArtDsc_Internalname ;
   private String edtDisObsULin_Internalname ;
   private String edtDisObsLin_Internalname ;
   private String A377DisObsTxt ;
   private String edtDisObsTxt_Internalname ;
   private String scmdbuf ;
   private String lV51Formulaciontinte_wwhojarutaobsds_3_tfdisobstxt ;
   private String AV52Formulaciontinte_wwhojarutaobsds_4_tfdisobstxt_sel ;
   private String AV51Formulaciontinte_wwhojarutaobsds_3_tfdisobstxt ;
   private String hsh ;
   private String GXv_char2[] ;
   private String AV35EmprNom ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String tblTabledvelop_confirmpanel_btnobservacionespedidoanterior_Internalname ;
   private String Dvelop_confirmpanel_btnobservacionespedidoanterior_Internalname ;
   private String sGXsfl_46_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtEmprCod_Jsonclick ;
   private String edtDisCod_Jsonclick ;
   private String edtDisFec_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtDisArtCod_Jsonclick ;
   private String edtDisArtDsc_Jsonclick ;
   private String edtDisObsULin_Jsonclick ;
   private String edtDisObsLin_Jsonclick ;
   private String edtDisObsTxt_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV30BarFecGen ;
   private java.util.Date AV30BarFecGen ;
   private java.util.Date A369DisFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV13OrderedDsc ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Gridpaginationbar_Showfirst ;
   private boolean Gridpaginationbar_Showprevious ;
   private boolean Gridpaginationbar_Shownext ;
   private boolean Gridpaginationbar_Showlast ;
   private boolean Gridpaginationbar_Rowsperpageselector ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_46_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV43isCommit ;
   private boolean GXt_boolean10 ;
   private boolean GXv_boolean11[] ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV14Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btnobservacionespedidoanterior ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGridactions ;
   private IDataStoreProvider pr_default ;
   private String[] H02832_A377DisObsTxt ;
   private byte[] H02832_A376DisObsLin ;
   private byte[] H02832_A378DisObsULin ;
   private String[] H02832_A337DisArtDsc ;
   private String[] H02832_A335DisArtCod ;
   private String[] H02832_A279CliNom ;
   private int[] H02832_A252CliCod ;
   private java.util.Date[] H02832_A369DisFec ;
   private int[] H02832_A361DisCod ;
   private String[] H02832_A396EmprCod ;
   private long[] H02833_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV41messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message13[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState12[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV19DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class wwhojarutaobs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H02832( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV49Formulaciontinte_wwhojarutaobsds_1_tfdisobslin ,
                                          byte AV50Formulaciontinte_wwhojarutaobsds_2_tfdisobslin_to ,
                                          String AV52Formulaciontinte_wwhojarutaobsds_4_tfdisobstxt_sel ,
                                          String AV51Formulaciontinte_wwhojarutaobsds_3_tfdisobstxt ,
                                          byte A376DisObsLin ,
                                          String A377DisObsTxt ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV34EmprCod ,
                                          int AV24DisCod ,
                                          String A396EmprCod ,
                                          int A361DisCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[11];
      Object[] GXv_Object15 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.DisObsTxt, T1.DisObsLin, T2.DisObsULin, T2.DisArtDsc, T2.DisArtCod, T3.CliNom, T2.CliCod, T2.DisFec, T1.DisCod, T1.EmprCod" ;
      sFromString = " FROM ((TXPOBSERV T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod" ;
      sFromString += " = T2.CliCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.DisCod = ?)");
      if ( ! (0==AV49Formulaciontinte_wwhojarutaobsds_1_tfdisobslin) )
      {
         addWhere(sWhereString, "(T1.DisObsLin >= ?)");
      }
      else
      {
         GXv_int14[2] = (byte)(1) ;
      }
      if ( ! (0==AV50Formulaciontinte_wwhojarutaobsds_2_tfdisobslin_to) )
      {
         addWhere(sWhereString, "(T1.DisObsLin <= ?)");
      }
      else
      {
         GXv_int14[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52Formulaciontinte_wwhojarutaobsds_4_tfdisobstxt_sel)==0) && ( ! (GXutil.strcmp("", AV51Formulaciontinte_wwhojarutaobsds_3_tfdisobstxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisObsTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Formulaciontinte_wwhojarutaobsds_4_tfdisobstxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisObsTxt = ?)");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
      }
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.DisObsLin" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.DisObsLin DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.DisObsTxt" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.DisObsTxt DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.DisCod, T1.DisObsLin" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_H02833( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV49Formulaciontinte_wwhojarutaobsds_1_tfdisobslin ,
                                          byte AV50Formulaciontinte_wwhojarutaobsds_2_tfdisobslin_to ,
                                          String AV52Formulaciontinte_wwhojarutaobsds_4_tfdisobstxt_sel ,
                                          String AV51Formulaciontinte_wwhojarutaobsds_3_tfdisobstxt ,
                                          byte A376DisObsLin ,
                                          String A377DisObsTxt ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV34EmprCod ,
                                          int AV24DisCod ,
                                          String A396EmprCod ,
                                          int A361DisCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[6];
      Object[] GXv_Object17 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM ((TXPOBSERV T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.CliCod = T2.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.DisCod = ?)");
      if ( ! (0==AV49Formulaciontinte_wwhojarutaobsds_1_tfdisobslin) )
      {
         addWhere(sWhereString, "(T1.DisObsLin >= ?)");
      }
      else
      {
         GXv_int16[2] = (byte)(1) ;
      }
      if ( ! (0==AV50Formulaciontinte_wwhojarutaobsds_2_tfdisobslin_to) )
      {
         addWhere(sWhereString, "(T1.DisObsLin <= ?)");
      }
      else
      {
         GXv_int16[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52Formulaciontinte_wwhojarutaobsds_4_tfdisobstxt_sel)==0) && ( ! (GXutil.strcmp("", AV51Formulaciontinte_wwhojarutaobsds_3_tfdisobstxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisObsTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Formulaciontinte_wwhojarutaobsds_4_tfdisobstxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisObsTxt = ?)");
      }
      else
      {
         GXv_int16[5] = (byte)(1) ;
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
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
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
                  return conditional_H02832(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Boolean) dynConstraints[7]).booleanValue() , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() );
            case 1 :
                  return conditional_H02833(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Boolean) dynConstraints[7]).booleanValue() , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02832", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02833", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
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
                  stmt.setByte(sIdx, ((Number) parms[13]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[14]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 60);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 60);
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
                  stmt.setByte(sIdx, ((Number) parms[8]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[9]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 60);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 60);
               }
               return;
      }
   }

}

