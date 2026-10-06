package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class generarjobfactura_impl extends GXDataArea
{
   public generarjobfactura_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public generarjobfactura_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( generarjobfactura_impl.class ));
   }

   public generarjobfactura_impl( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void executeCmdLine( String args[] )
   {
      try
      {
         AV30FacCodfrom = (int) GXutil.lval( args[0]);
         AV14CliCodfrom = (int) GXutil.lval( args[1]);
         AV34FacFchfrom = (java.util.Date) localUtil.ctod( args[2], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      nGotPars = 1 ;
      webExecute();
   }

   protected void createObjects( )
   {
      chkavVersumlin = UIFactory.getCheckbox(this);
      cmbavF_header = new HTMLChoice();
      cmbavAgr_fases = new HTMLChoice();
      chkavMail = UIFactory.getCheckbox(this);
      chkavManaut = UIFactory.getCheckbox(this);
      chkavOpi = UIFactory.getCheckbox(this);
      cmbavGridactiongroup1 = new HTMLChoice();
      cmbJobStat = new HTMLChoice();
      chkavVermail = UIFactory.getCheckbox(this);
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetFirstPar( "FacCodfrom") ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "FacCodfrom") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "FacCodfrom") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Listjobgrid") == 0 )
         {
            gxnrlistjobgrid_newrow_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Listjobgrid") == 0 )
         {
            gxgrlistjobgrid_refresh_invoke( ) ;
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
            AV30FacCodfrom = (int)(GXutil.lval( gxfirstwebparm)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30FacCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30FacCodfrom), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFACCODFROM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV30FacCodfrom), "ZZZZZZZ9")));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV14CliCodfrom = (int)(GXutil.lval( httpContext.GetPar( "CliCodfrom"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14CliCodfrom), 6, 0));
               AV34FacFchfrom = localUtil.parseDateParm( httpContext.GetPar( "FacFchfrom")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV34FacFchfrom", localUtil.format(AV34FacFchfrom, "99/99/99"));
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

   public void gxnrlistjobgrid_newrow_invoke( )
   {
      nRC_GXsfl_139 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_139"))) ;
      nGXsfl_139_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_139_idx"))) ;
      sGXsfl_139_idx = httpContext.GetPar( "sGXsfl_139_idx") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrlistjobgrid_newrow( ) ;
      /* End function gxnrListjobgrid_newrow_invoke */
   }

   public void gxgrlistjobgrid_refresh_invoke( )
   {
      subListjobgrid_Rows = (int)(GXutil.lval( httpContext.GetPar( "subListjobgrid_Rows"))) ;
      AV122PrgPct = (short)(GXutil.lval( httpContext.GetPar( "PrgPct"))) ;
      AV120i = (short)(GXutil.lval( httpContext.GetPar( "i"))) ;
      AV64VerSumLin = (byte)(GXutil.lval( httpContext.GetPar( "VerSumLin"))) ;
      AV42Mail = httpContext.GetPar( "Mail") ;
      AV43ManAut = httpContext.GetPar( "ManAut") ;
      AV45Opi = httpContext.GetPar( "Opi") ;
      AV63VerMail = GXutil.strtobool( httpContext.GetPar( "VerMail")) ;
      AV49PRIO = httpContext.GetPar( "PRIO") ;
      AV97PATHTEMP = httpContext.GetPar( "PATHTEMP") ;
      AV30FacCodfrom = (int)(GXutil.lval( httpContext.GetPar( "FacCodfrom"))) ;
      AV47PATHPDF = httpContext.GetPar( "PATHPDF") ;
      AV145Pgmname = httpContext.GetPar( "Pgmname") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrlistjobgrid_refresh( subListjobgrid_Rows, AV122PrgPct, AV120i, AV64VerSumLin, AV42Mail, AV43ManAut, AV45Opi, AV63VerMail, AV49PRIO, AV97PATHTEMP, AV30FacCodfrom, AV47PATHPDF, AV145Pgmname) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrListjobgrid_refresh_invoke */
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
      pa2BU2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2BU2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Popover/WWPPopoverRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.facturacion.generarjobfactura", new String[] {GXutil.URLEncode(GXutil.ltrimstr(AV30FacCodfrom,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV14CliCodfrom,6,0)),GXutil.URLEncode(GXutil.formatDateParm(AV34FacFchfrom))}, new String[] {"FacCodfrom","CliCodfrom","FacFchfrom"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRIO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV49PRIO, "9"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPATHTEMP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV97PATHTEMP, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFACCODFROM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV30FacCodfrom), "ZZZZZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"GenerarJobFactura");
      forbiddenHiddens.add("PATHPDF", GXutil.rtrim( localUtil.format( AV47PATHPDF, "")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV145Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\generarjobfactura:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_139", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_139, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV25DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV25DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICODFROM_DATA", AV15CliCodfrom_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICODFROM_DATA", AV15CliCodfrom_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICODTO_DATA", AV17CliCodto_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICODTO_DATA", AV17CliCodto_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vLISTPRINTER_DATA", AV40ListPrinter_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vLISTPRINTER_DATA", AV40ListPrinter_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vLISTJOBGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV107ListJobGridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vI", GXutil.ltrim( localUtil.ntoc( AV120i, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DOCID", GXutil.ltrim( localUtil.ntoc( A14470DocId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV26EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vFACFCH", localUtil.dtoc( AV129FacFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD", GXutil.ltrim( localUtil.ntoc( AV133CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLINOM", GXutil.rtrim( AV132CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLIEMF", GXutil.rtrim( AV127Cliemf));
      app.GxWebStd.gx_hidden_field( httpContext, "FACCOD", GXutil.ltrim( localUtil.ntoc( A430FacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFACCOD", GXutil.ltrim( localUtil.ntoc( AV128FacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACFCH", localUtil.dtoc( A436FacFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLINOM", GXutil.rtrim( A279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIEMF", GXutil.rtrim( A10050Cliemf));
      app.GxWebStd.gx_hidden_field( httpContext, "FACENVMAIL", localUtil.ttoc( A14420FacEnvMail, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vJOBID_SELECTED", AV125JobId_Selected.toString());
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV61UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "FACEST", GXutil.ltrim( localUtil.ntoc( A435FacEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACPRI", GXutil.rtrim( A450FacPri));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRIO", GXutil.rtrim( AV49PRIO));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRIO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV49PRIO, "9"))));
      app.GxWebStd.gx_hidden_field( httpContext, "FACTIPFAC", GXutil.ltrim( localUtil.ntoc( A1153FacTipFac, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFACEST", GXutil.ltrim( localUtil.ntoc( AV32FacEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFACESTTO", GXutil.ltrim( localUtil.ntoc( AV33FacEstto, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPATHTEMP", AV97PATHTEMP);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPATHTEMP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV97PATHTEMP, ""))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vNOTIFICATIONINFO", AV113NotificationInfo);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vNOTIFICATIONINFO", AV113NotificationInfo);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vASYNC_JOBID", AV114Async_JobId.toString());
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( LISTJOBGRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRID_nEOF", GXutil.ltrim( localUtil.ntoc( LISTJOBGRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRID_Rows", GXutil.ltrim( localUtil.ntoc( subListjobgrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Cls", GXutil.rtrim( Combo_clicodfrom_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Selectedvalue_set", GXutil.rtrim( Combo_clicodfrom_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Emptyitemtext", GXutil.rtrim( Combo_clicodfrom_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Cls", GXutil.rtrim( Combo_clicodto_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Selectedvalue_set", GXutil.rtrim( Combo_clicodto_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Emptyitemtext", GXutil.rtrim( Combo_clicodto_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LISTPRINTER_Cls", GXutil.rtrim( Combo_listprinter_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LISTPRINTER_Selectedvalue_set", GXutil.rtrim( Combo_listprinter_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LISTPRINTER_Selectedtext_set", GXutil.rtrim( Combo_listprinter_Selectedtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LISTPRINTER_Visible", GXutil.booltostr( Combo_listprinter_Visible));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LISTPRINTER_Emptyitem", GXutil.booltostr( Combo_listprinter_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Width", GXutil.rtrim( Dvpanel_panel_filtrosgenerales_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Autowidth", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Autoheight", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Cls", GXutil.rtrim( Dvpanel_panel_filtrosgenerales_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Title", GXutil.rtrim( Dvpanel_panel_filtrosgenerales_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Collapsible", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Collapsed", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Showcollapseicon", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Iconposition", GXutil.rtrim( Dvpanel_panel_filtrosgenerales_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Autoscroll", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Width", GXutil.rtrim( Dvpanel_panel_filtros_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Autowidth", GXutil.booltostr( Dvpanel_panel_filtros_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Autoheight", GXutil.booltostr( Dvpanel_panel_filtros_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Cls", GXutil.rtrim( Dvpanel_panel_filtros_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Title", GXutil.rtrim( Dvpanel_panel_filtros_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Collapsible", GXutil.booltostr( Dvpanel_panel_filtros_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Collapsed", GXutil.booltostr( Dvpanel_panel_filtros_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Showcollapseicon", GXutil.booltostr( Dvpanel_panel_filtros_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Iconposition", GXutil.rtrim( Dvpanel_panel_filtros_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Autoscroll", GXutil.booltostr( Dvpanel_panel_filtros_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRIDPAGINATIONBAR_Class", GXutil.rtrim( Listjobgridpaginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRIDPAGINATIONBAR_Showfirst", GXutil.booltostr( Listjobgridpaginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRIDPAGINATIONBAR_Showprevious", GXutil.booltostr( Listjobgridpaginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRIDPAGINATIONBAR_Shownext", GXutil.booltostr( Listjobgridpaginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRIDPAGINATIONBAR_Showlast", GXutil.booltostr( Listjobgridpaginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRIDPAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Listjobgridpaginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRIDPAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Listjobgridpaginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRIDPAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Listjobgridpaginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRIDPAGINATIONBAR_Emptygridclass", GXutil.rtrim( Listjobgridpaginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRIDPAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Listjobgridpaginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Listjobgridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRIDPAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Listjobgridpaginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRIDPAGINATIONBAR_Previous", GXutil.rtrim( Listjobgridpaginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRIDPAGINATIONBAR_Next", GXutil.rtrim( Listjobgridpaginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRIDPAGINATIONBAR_Caption", GXutil.rtrim( Listjobgridpaginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRIDPAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Listjobgridpaginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRIDPAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Listjobgridpaginationbar_Rowsperpagecaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELWCCOMPONENT_Width", GXutil.rtrim( Dvpanel_panelwccomponent_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELWCCOMPONENT_Autowidth", GXutil.booltostr( Dvpanel_panelwccomponent_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELWCCOMPONENT_Autoheight", GXutil.booltostr( Dvpanel_panelwccomponent_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELWCCOMPONENT_Cls", GXutil.rtrim( Dvpanel_panelwccomponent_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELWCCOMPONENT_Title", GXutil.rtrim( Dvpanel_panelwccomponent_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELWCCOMPONENT_Collapsible", GXutil.booltostr( Dvpanel_panelwccomponent_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELWCCOMPONENT_Collapsed", GXutil.booltostr( Dvpanel_panelwccomponent_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELWCCOMPONENT_Showcollapseicon", GXutil.booltostr( Dvpanel_panelwccomponent_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELWCCOMPONENT_Iconposition", GXutil.rtrim( Dvpanel_panelwccomponent_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELWCCOMPONENT_Autoscroll", GXutil.booltostr( Dvpanel_panelwccomponent_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DATAMONJS_Paramstr", GXutil.rtrim( Datamonjs_Paramstr));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_JOBDESC_Gridinternalname", GXutil.rtrim( Popover_jobdesc_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_JOBDESC_Iteminternalname", GXutil.rtrim( Popover_jobdesc_Iteminternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_JOBDESC_Isgriditem", GXutil.booltostr( Popover_jobdesc_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_JOBDESC_Trigger", GXutil.rtrim( Popover_jobdesc_Trigger));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_JOBDESC_Popoverwidth", GXutil.ltrim( localUtil.ntoc( Popover_jobdesc_Popoverwidth, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_JOBDESC_Position", GXutil.rtrim( Popover_jobdesc_Position));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DELETED_Title", GXutil.rtrim( Dvelop_confirmpanel_deleted_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DELETED_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_deleted_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DELETED_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_deleted_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DELETED_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_deleted_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DELETED_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_deleted_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DELETED_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_deleted_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DELETED_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_deleted_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Title", GXutil.rtrim( Dvelop_confirmpanel_enter_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_enter_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_enter_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_enter_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Listjobgrid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRID_EMPOWERER_Popoversingrid", GXutil.rtrim( Listjobgrid_empowerer_Popoversingrid));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRID_Rows", GXutil.ltrim( localUtil.ntoc( subListjobgrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Listjobgridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Listjobgridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DELETED_Result", GXutil.rtrim( Dvelop_confirmpanel_deleted_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Result", GXutil.rtrim( Dvelop_confirmpanel_enter_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LISTPRINTER_Selectedvalue_get", GXutil.rtrim( Combo_listprinter_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Selectedvalue_get", GXutil.rtrim( Combo_clicodto_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Selectedvalue_get", GXutil.rtrim( Combo_clicodfrom_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "vNOTIFICATIONINFO_Id", GXutil.rtrim( AV113NotificationInfo.getgxTv_SdtNotificationInfo_Id()));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRID_Rows", GXutil.ltrim( localUtil.ntoc( subListjobgrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Listjobgridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Listjobgridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DELETED_Result", GXutil.rtrim( Dvelop_confirmpanel_deleted_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Result", GXutil.rtrim( Dvelop_confirmpanel_enter_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Selectedvalue_get", GXutil.rtrim( Combo_clicodto_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Selectedvalue_get", GXutil.rtrim( Combo_clicodfrom_Selectedvalue_get));
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
      if ( ! ( WebComp_Listjobgrid_dwc == null ) )
      {
         WebComp_Listjobgrid_dwc.componentjscripts();
      }
      if ( ! ( WebComp_Wwpaux_wc == null ) )
      {
         WebComp_Wwpaux_wc.componentjscripts();
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
         we2BU2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2BU2( ) ;
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
      return formatLink("app.facturacion.generarjobfactura", new String[] {GXutil.URLEncode(GXutil.ltrimstr(AV30FacCodfrom,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV14CliCodfrom,6,0)),GXutil.URLEncode(GXutil.formatDateParm(AV34FacFchfrom))}, new String[] {"FacCodfrom","CliCodfrom","FacFchfrom"})  ;
   }

   public String getPgmname( )
   {
      return "Facturacion.GenerarJobFactura" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Impresion Factura", "") ;
   }

   public void wb2BU0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_panel_filtros.setProperty("Width", Dvpanel_panel_filtros_Width);
         ucDvpanel_panel_filtros.setProperty("AutoWidth", Dvpanel_panel_filtros_Autowidth);
         ucDvpanel_panel_filtros.setProperty("AutoHeight", Dvpanel_panel_filtros_Autoheight);
         ucDvpanel_panel_filtros.setProperty("Cls", Dvpanel_panel_filtros_Cls);
         ucDvpanel_panel_filtros.setProperty("Title", Dvpanel_panel_filtros_Title);
         ucDvpanel_panel_filtros.setProperty("Collapsible", Dvpanel_panel_filtros_Collapsible);
         ucDvpanel_panel_filtros.setProperty("Collapsed", Dvpanel_panel_filtros_Collapsed);
         ucDvpanel_panel_filtros.setProperty("ShowCollapseIcon", Dvpanel_panel_filtros_Showcollapseicon);
         ucDvpanel_panel_filtros.setProperty("IconPosition", Dvpanel_panel_filtros_Iconposition);
         ucDvpanel_panel_filtros.setProperty("AutoScroll", Dvpanel_panel_filtros_Autoscroll);
         ucDvpanel_panel_filtros.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panel_filtros_Internalname, "DVPANEL_PANEL_FILTROSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANEL_FILTROSContainer"+"Panel_Filtros"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanel_filtros_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_panel_filtrosgenerales.setProperty("Width", Dvpanel_panel_filtrosgenerales_Width);
         ucDvpanel_panel_filtrosgenerales.setProperty("AutoWidth", Dvpanel_panel_filtrosgenerales_Autowidth);
         ucDvpanel_panel_filtrosgenerales.setProperty("AutoHeight", Dvpanel_panel_filtrosgenerales_Autoheight);
         ucDvpanel_panel_filtrosgenerales.setProperty("Cls", Dvpanel_panel_filtrosgenerales_Cls);
         ucDvpanel_panel_filtrosgenerales.setProperty("Title", Dvpanel_panel_filtrosgenerales_Title);
         ucDvpanel_panel_filtrosgenerales.setProperty("Collapsible", Dvpanel_panel_filtrosgenerales_Collapsible);
         ucDvpanel_panel_filtrosgenerales.setProperty("Collapsed", Dvpanel_panel_filtrosgenerales_Collapsed);
         ucDvpanel_panel_filtrosgenerales.setProperty("ShowCollapseIcon", Dvpanel_panel_filtrosgenerales_Showcollapseicon);
         ucDvpanel_panel_filtrosgenerales.setProperty("IconPosition", Dvpanel_panel_filtrosgenerales_Iconposition);
         ucDvpanel_panel_filtrosgenerales.setProperty("AutoScroll", Dvpanel_panel_filtrosgenerales_Autoscroll);
         ucDvpanel_panel_filtrosgenerales.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panel_filtrosgenerales_Internalname, "DVPANEL_PANEL_FILTROSGENERALESContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANEL_FILTROSGENERALESContainer"+"Panel_FiltrosGenerales"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanel_filtrosgenerales_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable_filtrosgenerales_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedclicodfrom_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_clicodfrom_Internalname, httpContext.getMessage( "Cliente Inicial", ""), "", "", lblTextblockcombo_clicodfrom_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Facturacion\\GenerarJobFactura.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_clicodfrom.setProperty("Caption", Combo_clicodfrom_Caption);
         ucCombo_clicodfrom.setProperty("Cls", Combo_clicodfrom_Cls);
         ucCombo_clicodfrom.setProperty("EmptyItemText", Combo_clicodfrom_Emptyitemtext);
         ucCombo_clicodfrom.setProperty("DropDownOptionsTitleSettingsIcons", AV25DDO_TitleSettingsIcons);
         ucCombo_clicodfrom.setProperty("DropDownOptionsData", AV15CliCodfrom_Data);
         ucCombo_clicodfrom.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clicodfrom_Internalname, "COMBO_CLICODFROMContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedclicodto_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_clicodto_Internalname, httpContext.getMessage( "Cliente Final", ""), "", "", lblTextblockcombo_clicodto_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Facturacion\\GenerarJobFactura.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_clicodto.setProperty("Caption", Combo_clicodto_Caption);
         ucCombo_clicodto.setProperty("Cls", Combo_clicodto_Cls);
         ucCombo_clicodto.setProperty("EmptyItemText", Combo_clicodto_Emptyitemtext);
         ucCombo_clicodto.setProperty("DropDownOptionsTitleSettingsIcons", AV25DDO_TitleSettingsIcons);
         ucCombo_clicodto.setProperty("DropDownOptionsData", AV17CliCodto_Data);
         ucCombo_clicodto.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clicodto_Internalname, "COMBO_CLICODTOContainer");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFacfchfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFacfchfrom_Internalname, httpContext.getMessage( "Fecha Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_139_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFacfchfrom_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFacfchfrom_Internalname, localUtil.format(AV34FacFchfrom, "99/99/99"), localUtil.format( AV34FacFchfrom, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFacfchfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFacfchfrom_Enabled, 1, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\GenerarJobFactura.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFacfchfrom_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFacfchfrom_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Facturacion\\GenerarJobFactura.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFacfchto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFacfchto_Internalname, httpContext.getMessage( "Fecha Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_139_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFacfchto_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFacfchto_Internalname, localUtil.format(AV35FacFchto, "99/99/99"), localUtil.format( AV35FacFchto, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,55);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFacfchto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFacfchto_Enabled, 1, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\GenerarJobFactura.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFacfchto_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFacfchto_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Facturacion\\GenerarJobFactura.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFaccodfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFaccodfrom_Internalname, httpContext.getMessage( "Factura Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_139_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFaccodfrom_Internalname, GXutil.ltrim( localUtil.ntoc( AV30FacCodfrom, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30FacCodfrom), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,63);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFaccodfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFaccodfrom_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\GenerarJobFactura.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFaccodto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFaccodto_Internalname, httpContext.getMessage( "Factura Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_139_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFaccodto_Internalname, GXutil.ltrim( localUtil.ntoc( AV31FacCodto, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV31FacCodto), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,67);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFaccodto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFaccodto_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\GenerarJobFactura.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCopias2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCopias2_Internalname, httpContext.getMessage( "Nº Copias", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'" + sGXsfl_139_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCopias2_Internalname, GXutil.ltrim( localUtil.ntoc( AV23Copias2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCopias2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV23Copias2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV23Copias2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,75);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCopias2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCopias2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\GenerarJobFactura.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavVersumlin.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavVersumlin.getInternalname(), httpContext.getMessage( "Ver Suma Total", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'" + sGXsfl_139_idx + "',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavVersumlin.getInternalname(), GXutil.str( AV64VerSumLin, 1, 0), "", httpContext.getMessage( "Ver Suma Total", ""), 1, chkavVersumlin.getEnabled(), "1", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(79, this, 1, 0,"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,79);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavF_header.getInternalname()+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'" + sGXsfl_139_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavF_header, cmbavF_header.getInternalname(), GXutil.trim( GXutil.str( AV28F_header, 1, 0)), 1, cmbavF_header.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavF_header.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,83);\"", "", true, (byte)(0), "HLP_Facturacion\\GenerarJobFactura.htm");
         cmbavF_header.setValue( GXutil.trim( GXutil.str( AV28F_header, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavF_header.getInternalname(), "Values", cmbavF_header.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavAgr_fases.getInternalname()+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'" + sGXsfl_139_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavAgr_fases, cmbavAgr_fases.getInternalname(), GXutil.trim( GXutil.str( AV11Agr_Fases, 4, 0)), 1, cmbavAgr_fases.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavAgr_fases.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,87);\"", "", true, (byte)(0), "HLP_Facturacion\\GenerarJobFactura.htm");
         cmbavAgr_fases.setValue( GXutil.trim( GXutil.str( AV11Agr_Fases, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAgr_fases.getInternalname(), "Values", cmbavAgr_fases.ToJavascriptSource(), true);
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavMail.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavMail.getInternalname(), httpContext.getMessage( "Envio Faturas por E-mail?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'" + sGXsfl_139_idx + "',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavMail.getInternalname(), AV42Mail, "", httpContext.getMessage( "Envio Faturas por E-mail?", ""), 1, chkavMail.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(95, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,95);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPathpdf_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPathpdf_Internalname, httpContext.getMessage( "Path", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'" + sGXsfl_139_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPathpdf_Internalname, GXutil.rtrim( AV47PATHPDF), GXutil.rtrim( localUtil.format( AV47PATHPDF, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPathpdf_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPathpdf_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\GenerarJobFactura.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavManaut.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavManaut.getInternalname(), httpContext.getMessage( "Automatico?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'" + sGXsfl_139_idx + "',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavManaut.getInternalname(), AV43ManAut, "", httpContext.getMessage( "Automatico?", ""), 1, chkavManaut.getEnabled(), "A", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(107, this, 'A', 'M',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,107);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavOpi.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavOpi.getInternalname(), httpContext.getMessage( "Ecrã", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'" + sGXsfl_139_idx + "',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavOpi.getInternalname(), AV45Opi, "", httpContext.getMessage( "Ecrã", ""), 1, chkavOpi.getEnabled(), "1", "", StyleString, ClassString, "", "", TempTags+" onblur=\""+""+";gx.evt.onblur(this,111);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-7 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedlistprinter_Internalname, divTablesplittedlistprinter_Visible, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_listprinter_Internalname, httpContext.getMessage( "Impressora Servidor", ""), "", "", lblTextblockcombo_listprinter_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Facturacion\\GenerarJobFactura.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_listprinter.setProperty("Caption", Combo_listprinter_Caption);
         ucCombo_listprinter.setProperty("Cls", Combo_listprinter_Cls);
         ucCombo_listprinter.setProperty("EmptyItem", Combo_listprinter_Emptyitem);
         ucCombo_listprinter.setProperty("DropDownOptionsTitleSettingsIcons", AV25DDO_TitleSettingsIcons);
         ucCombo_listprinter.setProperty("DropDownOptionsData", AV40ListPrinter_Data);
         ucCombo_listprinter.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_listprinter_Internalname, "COMBO_LISTPRINTERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable_acciones_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "gx.evt.setGridEvt("+GXutil.str( 139, 3, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\GenerarJobFactura.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 128,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 139, 3, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 7, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e112bu1_client"+"'", TempTags, "", 2, "HLP_Facturacion\\GenerarJobFactura.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop30", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_panelwccomponent.setProperty("Width", Dvpanel_panelwccomponent_Width);
         ucDvpanel_panelwccomponent.setProperty("AutoWidth", Dvpanel_panelwccomponent_Autowidth);
         ucDvpanel_panelwccomponent.setProperty("AutoHeight", Dvpanel_panelwccomponent_Autoheight);
         ucDvpanel_panelwccomponent.setProperty("Cls", Dvpanel_panelwccomponent_Cls);
         ucDvpanel_panelwccomponent.setProperty("Title", Dvpanel_panelwccomponent_Title);
         ucDvpanel_panelwccomponent.setProperty("Collapsible", Dvpanel_panelwccomponent_Collapsible);
         ucDvpanel_panelwccomponent.setProperty("Collapsed", Dvpanel_panelwccomponent_Collapsed);
         ucDvpanel_panelwccomponent.setProperty("ShowCollapseIcon", Dvpanel_panelwccomponent_Showcollapseicon);
         ucDvpanel_panelwccomponent.setProperty("IconPosition", Dvpanel_panelwccomponent_Iconposition);
         ucDvpanel_panelwccomponent.setProperty("AutoScroll", Dvpanel_panelwccomponent_Autoscroll);
         ucDvpanel_panelwccomponent.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panelwccomponent_Internalname, "DVPANEL_PANELWCCOMPONENTContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANELWCCOMPONENTContainer"+"PanelWCComponent"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanelwccomponent_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divListjobgridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         ListjobgridContainer.SetWrapped(nGXWrapped);
         startgridcontrol139( ) ;
      }
      if ( wbEnd == 139 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_139 = (int)(nGXsfl_139_idx-1) ;
         if ( ListjobgridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"ListjobgridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Listjobgrid", ListjobgridContainer, subListjobgrid_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "ListjobgridContainerData", ListjobgridContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "ListjobgridContainerData"+"V", ListjobgridContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"ListjobgridContainerData"+"V"+"\" value='"+ListjobgridContainer.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucListjobgridpaginationbar.setProperty("Class", Listjobgridpaginationbar_Class);
         ucListjobgridpaginationbar.setProperty("ShowFirst", Listjobgridpaginationbar_Showfirst);
         ucListjobgridpaginationbar.setProperty("ShowPrevious", Listjobgridpaginationbar_Showprevious);
         ucListjobgridpaginationbar.setProperty("ShowNext", Listjobgridpaginationbar_Shownext);
         ucListjobgridpaginationbar.setProperty("ShowLast", Listjobgridpaginationbar_Showlast);
         ucListjobgridpaginationbar.setProperty("PagesToShow", Listjobgridpaginationbar_Pagestoshow);
         ucListjobgridpaginationbar.setProperty("PagingButtonsPosition", Listjobgridpaginationbar_Pagingbuttonsposition);
         ucListjobgridpaginationbar.setProperty("PagingCaptionPosition", Listjobgridpaginationbar_Pagingcaptionposition);
         ucListjobgridpaginationbar.setProperty("EmptyGridClass", Listjobgridpaginationbar_Emptygridclass);
         ucListjobgridpaginationbar.setProperty("RowsPerPageSelector", Listjobgridpaginationbar_Rowsperpageselector);
         ucListjobgridpaginationbar.setProperty("RowsPerPageOptions", Listjobgridpaginationbar_Rowsperpageoptions);
         ucListjobgridpaginationbar.setProperty("Previous", Listjobgridpaginationbar_Previous);
         ucListjobgridpaginationbar.setProperty("Next", Listjobgridpaginationbar_Next);
         ucListjobgridpaginationbar.setProperty("Caption", Listjobgridpaginationbar_Caption);
         ucListjobgridpaginationbar.setProperty("EmptyGridCaption", Listjobgridpaginationbar_Emptygridcaption);
         ucListjobgridpaginationbar.setProperty("RowsPerPageCaption", Listjobgridpaginationbar_Rowsperpagecaption);
         ucListjobgridpaginationbar.setProperty("CurrentPage", AV106ListJobGridCurrentPage);
         ucListjobgridpaginationbar.setProperty("PageCount", AV107ListJobGridPageCount);
         ucListjobgridpaginationbar.render(context, "dvelop.dvpaginationbar", Listjobgridpaginationbar_Internalname, "LISTJOBGRIDPAGINATIONBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divCell_listjobgrid_dwc_Internalname, 1, 0, "px", 0, "px", divCell_listjobgrid_dwc_Class, "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0162"+"", GXutil.rtrim( WebComp_Listjobgrid_dwc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0162"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_139_Refreshing )
            {
               if ( GXutil.len( WebComp_Listjobgrid_dwc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldListjobgrid_dwc), GXutil.lower( WebComp_Listjobgrid_dwc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp("gxHTMLWrpW0162"+"");
                  }
                  WebComp_Listjobgrid_dwc.componentdraw();
                  if ( GXutil.strcmp(GXutil.lower( OldListjobgrid_dwc), GXutil.lower( WebComp_Listjobgrid_dwc_Component)) != 0 )
                  {
                     httpContext.ajax_rspEndCmp();
                  }
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
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable_progress_Internalname, 1, 0, "px", 0, "px", "Table_ProgressBar", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucProgressbar.render(context, "gxprogressindicator", Progressbar_Internalname, "PROGRESSBARContainer");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV145Pgmname), GXutil.rtrim( localUtil.format( AV145Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\GenerarJobFactura.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDatamonjs.setProperty("Paramstr", Datamonjs_Paramstr);
         ucDatamonjs.render(context, "datamonjs", Datamonjs_Internalname, "DATAMONJSContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucInnewwindowpdf.render(context, "innewwindow", Innewwindowpdf_Internalname, "INNEWWINDOWPDFContainer");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 182,'',false,'" + sGXsfl_139_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicodfrom_Internalname, GXutil.ltrim( localUtil.ntoc( AV14CliCodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV14CliCodfrom), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,182);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicodfrom_Jsonclick, 0, "Attribute", "", "", "", "", edtavClicodfrom_Visible, edtavClicodfrom_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\GenerarJobFactura.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 183,'',false,'" + sGXsfl_139_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicodto_Internalname, GXutil.ltrim( localUtil.ntoc( AV16CliCodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV16CliCodto), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,183);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicodto_Jsonclick, 0, "Attribute", "", "", "", "", edtavClicodto_Visible, edtavClicodto_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\GenerarJobFactura.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 184,'',false,'" + sGXsfl_139_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavListprinter_Internalname, AV39ListPrinter, GXutil.rtrim( localUtil.format( AV39ListPrinter, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,184);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavListprinter_Jsonclick, 0, "Attribute", "", "", "", "", edtavListprinter_Visible, 1, 0, "text", "", 80, "chr", 1, "row", 150, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\GenerarJobFactura.htm");
         /* User Defined Control */
         ucPopover_jobdesc.setProperty("IsGridItem", Popover_jobdesc_Isgriditem);
         ucPopover_jobdesc.setProperty("Trigger", Popover_jobdesc_Trigger);
         ucPopover_jobdesc.setProperty("PopoverWidth", Popover_jobdesc_Popoverwidth);
         ucPopover_jobdesc.setProperty("Position", Popover_jobdesc_Position);
         ucPopover_jobdesc.render(context, "dvelop.wwppopover", Popover_jobdesc_Internalname, "POPOVER_JOBDESCContainer");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'" + sGXsfl_139_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavListjobgridcurrentpage_Internalname, GXutil.ltrim( localUtil.ntoc( AV106ListJobGridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV106ListJobGridCurrentPage), "ZZZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,186);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavListjobgridcurrentpage_Jsonclick, 0, "Attribute", "", "", "", "", edtavListjobgridcurrentpage_Visible, 1, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\GenerarJobFactura.htm");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 187,'',false,'" + sGXsfl_139_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavVermail.getInternalname(), GXutil.booltostr( AV63VerMail), "", "", chkavVermail.getVisible(), 1, "true", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(187, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,187);\"");
         wb_table1_188_2BU2( true) ;
      }
      else
      {
         wb_table1_188_2BU2( false) ;
      }
      return  ;
   }

   public void wb_table1_188_2BU2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_193_2BU2( true) ;
      }
      else
      {
         wb_table2_193_2BU2( false) ;
      }
      return  ;
   }

   public void wb_table2_193_2BU2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucListjobgrid_empowerer.setProperty("PopoversInGrid", Listjobgrid_empowerer_Popoversingrid);
         ucListjobgrid_empowerer.render(context, "wwp.gridempowerer", Listjobgrid_empowerer_Internalname, "LISTJOBGRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDiv_wwpauxwc_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0200"+"", GXutil.rtrim( WebComp_Wwpaux_wc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0200"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_139_Refreshing )
            {
               if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldWwpaux_wc), GXutil.lower( WebComp_Wwpaux_wc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp("gxHTMLWrpW0200"+"");
                  }
                  WebComp_Wwpaux_wc.componentdraw();
                  if ( GXutil.strcmp(GXutil.lower( OldWwpaux_wc), GXutil.lower( WebComp_Wwpaux_wc_Component)) != 0 )
                  {
                     httpContext.ajax_rspEndCmp();
                  }
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
      }
      if ( wbEnd == 139 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( ListjobgridContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"ListjobgridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Listjobgrid", ListjobgridContainer, subListjobgrid_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "ListjobgridContainerData", ListjobgridContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "ListjobgridContainerData"+"V", ListjobgridContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"ListjobgridContainerData"+"V"+"\" value='"+ListjobgridContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start2BU2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Impresion Factura", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2BU0( ) ;
   }

   public void ws2BU2( )
   {
      start2BU2( ) ;
      evt2BU2( ) ;
   }

   public void evt2BU2( )
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
                        else if ( GXutil.strcmp(sEvt, "COMBO_CLICODFROM.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e122BU2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "COMBO_CLICODTO.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e132BU2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LISTJOBGRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e142BU2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LISTJOBGRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e152BU2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_DELETED.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e162BU2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ENTER.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e172BU2 ();
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
                                 e182BU2 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "VFACCODFROM.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e192BU2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "ONMESSAGE_GX1") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Onmessage_gx1 */
                           e202BU2 ();
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 16), "LISTJOBGRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 23), "VGRIDACTIONGROUP1.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "VRUN.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 19), "LISTJOBGRID.REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 13), "ONMESSAGE_GX1") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 23), "VGRIDACTIONGROUP1.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "VRUN.CLICK") == 0 ) )
                        {
                           nGXsfl_139_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_139_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_139_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1392( ) ;
                           cmbavGridactiongroup1.setName( cmbavGridactiongroup1.getInternalname() );
                           cmbavGridactiongroup1.setValue( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()) );
                           AV110GridActionGroup1 = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV110GridActionGroup1), 4, 0));
                           AV109DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavDetailwebcomponent_Internalname, AV109DetailWebComponent);
                           A14423JobId = GXutil.strToGuid(httpContext.cgiGet( edtJobId_Internalname)) ;
                           AV118JobDescWithTags = httpContext.cgiGet( edtavJobdescwithtags_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavJobdescwithtags_Internalname, AV118JobDescWithTags);
                           A14485JobDesc = httpContext.cgiGet( edtJobDesc_Internalname) ;
                           n14485JobDesc = false ;
                           A14424JobType = httpContext.cgiGet( edtJobType_Internalname) ;
                           n14424JobType = false ;
                           A14457OkItem = localUtil.ctol( httpContext.cgiGet( edtOkItem_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           n14457OkItem = false ;
                           A14458ErItem = localUtil.ctol( httpContext.cgiGet( edtErItem_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           n14458ErItem = false ;
                           A14456PrcItem = localUtil.ctol( httpContext.cgiGet( edtPrcItem_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           n14456PrcItem = false ;
                           A14459PrgPct = (short)(localUtil.ctol( httpContext.cgiGet( edtPrgPct_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n14459PrgPct = false ;
                           A14455TotItem = localUtil.ctol( httpContext.cgiGet( edtTotItem_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           n14455TotItem = false ;
                           cmbJobStat.setName( cmbJobStat.getInternalname() );
                           cmbJobStat.setValue( httpContext.cgiGet( cmbJobStat.getInternalname()) );
                           A14450JobStat = httpContext.cgiGet( cmbJobStat.getInternalname()) ;
                           n14450JobStat = false ;
                           A14463ZipPath = httpContext.cgiGet( edtZipPath_Internalname) ;
                           n14463ZipPath = false ;
                           A14464ZipUrl = httpContext.cgiGet( edtZipUrl_Internalname) ;
                           n14464ZipUrl = false ;
                           AV111Run = httpContext.cgiGet( edtavRun_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavRun_Internalname, AV111Run);
                           AV121Row = httpContext.cgiGet( edtavRow_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavRow_Internalname, AV121Row);
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPrgpct_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPrgpct_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPRGPCT");
                              GX_FocusControl = edtavPrgpct_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV122PrgPct = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavPrgpct_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV122PrgPct), 3, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRGPCT"+"_"+sGXsfl_139_idx, getSecureSignedToken( sGXsfl_139_idx, localUtil.format( DecimalUtil.doubleToDec(AV122PrgPct), "ZZ9")));
                           }
                           else
                           {
                              AV122PrgPct = (short)(localUtil.ctol( httpContext.cgiGet( edtavPrgpct_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavPrgpct_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV122PrgPct), 3, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRGPCT"+"_"+sGXsfl_139_idx, getSecureSignedToken( sGXsfl_139_idx, localUtil.format( DecimalUtil.doubleToDec(AV122PrgPct), "ZZ9")));
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
                                 e212BU2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e222BU2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LISTJOBGRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e232BU2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONGROUP1.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e242BU2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VRUN.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e252BU2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LISTJOBGRID.REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e262BU2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ONMESSAGE_GX1") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Onmessage_gx1 */
                                 e202BU2 ();
                                 /* No code required for Cancel button. It is implemented as the Reset button. */
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                              }
                              else if ( GXutil.strcmp(sEvt, "ONMESSAGE_GX1") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Onmessage_gx1 */
                                 e202BU2 ();
                              }
                           }
                           else
                           {
                           }
                        }
                     }
                  }
                  else if ( GXutil.strcmp(sEvtType, "W") == 0 )
                  {
                     sEvtType = GXutil.left( sEvt, 4) ;
                     sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-4) ;
                     nCmpId = (short)(GXutil.lval( sEvtType)) ;
                     if ( nCmpId == 162 )
                     {
                        OldListjobgrid_dwc = httpContext.cgiGet( "W0162") ;
                        if ( ( GXutil.len( OldListjobgrid_dwc) == 0 ) || ( GXutil.strcmp(OldListjobgrid_dwc, WebComp_Listjobgrid_dwc_Component) != 0 ) )
                        {
                           WebComp_Listjobgrid_dwc = WebUtils.getWebComponent(getClass(), "app." + OldListjobgrid_dwc + "_impl", remoteHandle, context);
                           WebComp_Listjobgrid_dwc_Component = OldListjobgrid_dwc ;
                        }
                        if ( GXutil.len( WebComp_Listjobgrid_dwc_Component) != 0 )
                        {
                           WebComp_Listjobgrid_dwc.componentprocess("W0162", "", sEvt);
                        }
                        WebComp_Listjobgrid_dwc_Component = OldListjobgrid_dwc ;
                     }
                     else if ( nCmpId == 200 )
                     {
                        OldWwpaux_wc = httpContext.cgiGet( "W0200") ;
                        if ( ( GXutil.len( OldWwpaux_wc) == 0 ) || ( GXutil.strcmp(OldWwpaux_wc, WebComp_Wwpaux_wc_Component) != 0 ) )
                        {
                           WebComp_Wwpaux_wc = WebUtils.getWebComponent(getClass(), "app." + OldWwpaux_wc + "_impl", remoteHandle, context);
                           WebComp_Wwpaux_wc_Component = OldWwpaux_wc ;
                        }
                        if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
                        {
                           WebComp_Wwpaux_wc.componentprocess("W0200", "", sEvt);
                        }
                        WebComp_Wwpaux_wc_Component = OldWwpaux_wc ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we2BU2( )
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

   public void pa2BU2( )
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
            GX_FocusControl = edtavFacfchto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrlistjobgrid_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_1392( ) ;
      while ( nGXsfl_139_idx <= nRC_GXsfl_139 )
      {
         sendrow_1392( ) ;
         nGXsfl_139_idx = ((subListjobgrid_Islastpage==1)&&(nGXsfl_139_idx+1>sublistjobgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_139_idx+1) ;
         sGXsfl_139_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_139_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1392( ) ;
      }
      addString( httpContext.getJSONContainerResponse( ListjobgridContainer)) ;
      /* End function gxnrListjobgrid_newrow */
   }

   public void gxgrlistjobgrid_refresh( int subListjobgrid_Rows ,
                                        short AV122PrgPct ,
                                        short AV120i ,
                                        byte AV64VerSumLin ,
                                        String AV42Mail ,
                                        String AV43ManAut ,
                                        String AV45Opi ,
                                        boolean AV63VerMail ,
                                        String AV49PRIO ,
                                        String AV97PATHTEMP ,
                                        int AV30FacCodfrom ,
                                        String AV47PATHPDF ,
                                        String AV145Pgmname )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e222BU2 ();
      LISTJOBGRID_nCurrentRecord = 0 ;
      rf2BU2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"GenerarJobFactura");
      forbiddenHiddens.add("PATHPDF", GXutil.rtrim( localUtil.format( AV47PATHPDF, "")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV145Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\generarjobfactura:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrListjobgrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_JOBTYPE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A14424JobType, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "JOBTYPE", A14424JobType);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRGPCT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV122PrgPct), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRGPCT", GXutil.ltrim( localUtil.ntoc( AV122PrgPct, (byte)(3), (byte)(0), ".", "")));
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
      AV64VerSumLin = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( AV64VerSumLin, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64VerSumLin", GXutil.str( AV64VerSumLin, 1, 0));
      if ( cmbavF_header.getItemCount() > 0 )
      {
         AV28F_header = (byte)(GXutil.lval( cmbavF_header.getValidValue(GXutil.trim( GXutil.str( AV28F_header, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28F_header", GXutil.str( AV28F_header, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavF_header.setValue( GXutil.trim( GXutil.str( AV28F_header, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavF_header.getInternalname(), "Values", cmbavF_header.ToJavascriptSource(), true);
      }
      if ( cmbavAgr_fases.getItemCount() > 0 )
      {
         AV11Agr_Fases = (short)(GXutil.lval( cmbavAgr_fases.getValidValue(GXutil.trim( GXutil.str( AV11Agr_Fases, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11Agr_Fases", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11Agr_Fases), 4, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavAgr_fases.setValue( GXutil.trim( GXutil.str( AV11Agr_Fases, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAgr_fases.getInternalname(), "Values", cmbavAgr_fases.ToJavascriptSource(), true);
      }
      AV42Mail = ((GXutil.strcmp(GXutil.rtrim( AV42Mail), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42Mail", AV42Mail);
      AV43ManAut = ((GXutil.strcmp(GXutil.rtrim( AV43ManAut), "A")==0) ? "A" : "M") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43ManAut", AV43ManAut);
      AV45Opi = ((GXutil.strcmp(GXutil.rtrim( AV45Opi), "1")==0) ? "1" : "0") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45Opi", AV45Opi);
      AV63VerMail = GXutil.strtobool( GXutil.booltostr( AV63VerMail)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63VerMail", AV63VerMail);
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      /* Execute user event: Refresh */
      e222BU2 ();
      rf2BU2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      AV145Pgmname = "Facturacion.GenerarJobFactura" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV145Pgmname", AV145Pgmname);
      Gx_err = (short)(0) ;
      edtavPathpdf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPathpdf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPathpdf_Enabled), 5, 0), true);
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_139_Refreshing);
      edtavJobdescwithtags_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavJobdescwithtags_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavJobdescwithtags_Enabled), 5, 0), !bGXsfl_139_Refreshing);
      edtavRun_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRun_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRun_Enabled), 5, 0), !bGXsfl_139_Refreshing);
      edtavRow_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRow_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRow_Enabled), 5, 0), !bGXsfl_139_Refreshing);
      edtavPrgpct_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrgpct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrgpct_Enabled), 5, 0), !bGXsfl_139_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2BU2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         ListjobgridContainer.ClearRows();
      }
      wbStart = (short)(139) ;
      e262BU2 ();
      nGXsfl_139_idx = 1 ;
      sGXsfl_139_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_139_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1392( ) ;
      bGXsfl_139_Refreshing = true ;
      ListjobgridContainer.AddObjectProperty("GridName", "Listjobgrid");
      ListjobgridContainer.AddObjectProperty("CmpContext", "");
      ListjobgridContainer.AddObjectProperty("InMasterPage", "false");
      ListjobgridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      ListjobgridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      ListjobgridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      ListjobgridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subListjobgrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      ListjobgridContainer.setPageSize( sublistjobgrid_fnc_recordsperpage( ) );
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Listjobgrid_dwc_Component) != 0 )
            {
               WebComp_Listjobgrid_dwc.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
            {
               WebComp_Wwpaux_wc.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_1392( ) ;
         GXPagingFrom2 = (int)(((subListjobgrid_Rows==0) ? 1 : LISTJOBGRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subListjobgrid_Rows==0) ? 10000 : LISTJOBGRID_nFirstRecordOnPage+sublistjobgrid_fnc_recordsperpage( )+1)) ;
         /* Using cursor H02BU2 */
         pr_default.execute(0, new Object[] {Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_139_idx = 1 ;
         sGXsfl_139_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_139_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1392( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subListjobgrid_Rows == 0 ) || ( LISTJOBGRID_nCurrentRecord < sublistjobgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A14452DtCreat = H02BU2_A14452DtCreat[0] ;
            n14452DtCreat = H02BU2_n14452DtCreat[0] ;
            A14464ZipUrl = H02BU2_A14464ZipUrl[0] ;
            n14464ZipUrl = H02BU2_n14464ZipUrl[0] ;
            A14463ZipPath = H02BU2_A14463ZipPath[0] ;
            n14463ZipPath = H02BU2_n14463ZipPath[0] ;
            A14450JobStat = H02BU2_A14450JobStat[0] ;
            n14450JobStat = H02BU2_n14450JobStat[0] ;
            A14455TotItem = H02BU2_A14455TotItem[0] ;
            n14455TotItem = H02BU2_n14455TotItem[0] ;
            A14459PrgPct = H02BU2_A14459PrgPct[0] ;
            n14459PrgPct = H02BU2_n14459PrgPct[0] ;
            A14456PrcItem = H02BU2_A14456PrcItem[0] ;
            n14456PrcItem = H02BU2_n14456PrcItem[0] ;
            A14458ErItem = H02BU2_A14458ErItem[0] ;
            n14458ErItem = H02BU2_n14458ErItem[0] ;
            A14457OkItem = H02BU2_A14457OkItem[0] ;
            n14457OkItem = H02BU2_n14457OkItem[0] ;
            A14424JobType = H02BU2_A14424JobType[0] ;
            n14424JobType = H02BU2_n14424JobType[0] ;
            A14485JobDesc = H02BU2_A14485JobDesc[0] ;
            n14485JobDesc = H02BU2_n14485JobDesc[0] ;
            A14423JobId = H02BU2_A14423JobId[0] ;
            e232BU2 ();
            pr_default.readNext(0);
         }
         LISTJOBGRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRID_nEOF", GXutil.ltrim( localUtil.ntoc( LISTJOBGRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(139) ;
         wb2BU0( ) ;
      }
      bGXsfl_139_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2BU2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPRIO", GXutil.rtrim( AV49PRIO));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRIO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV49PRIO, "9"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPATHTEMP", AV97PATHTEMP);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPATHTEMP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV97PATHTEMP, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_JOBTYPE"+"_"+sGXsfl_139_idx, getSecureSignedToken( sGXsfl_139_idx, GXutil.rtrim( localUtil.format( A14424JobType, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRGPCT"+"_"+sGXsfl_139_idx, getSecureSignedToken( sGXsfl_139_idx, localUtil.format( DecimalUtil.doubleToDec(AV122PrgPct), "ZZ9")));
   }

   public int sublistjobgrid_fnc_pagecount( )
   {
      LISTJOBGRID_nRecordCount = sublistjobgrid_fnc_recordcount( ) ;
      if ( ((int)((LISTJOBGRID_nRecordCount) % (sublistjobgrid_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( LISTJOBGRID_nRecordCount/ (double) (sublistjobgrid_fnc_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( LISTJOBGRID_nRecordCount/ (double) (sublistjobgrid_fnc_recordsperpage( )))+1) ;
   }

   public int sublistjobgrid_fnc_recordcount( )
   {
      /* Using cursor H02BU3 */
      pr_default.execute(1);
      LISTJOBGRID_nRecordCount = H02BU3_ALISTJOBGRID_nRecordCount[0] ;
      pr_default.close(1);
      return (int)(LISTJOBGRID_nRecordCount) ;
   }

   public int sublistjobgrid_fnc_recordsperpage( )
   {
      if ( subListjobgrid_Rows > 0 )
      {
         return subListjobgrid_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int sublistjobgrid_fnc_currentpage( )
   {
      return (int)(GXutil.Int( LISTJOBGRID_nFirstRecordOnPage/ (double) (sublistjobgrid_fnc_recordsperpage( )))+1) ;
   }

   public short sublistjobgrid_firstpage( )
   {
      LISTJOBGRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( LISTJOBGRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrlistjobgrid_refresh( subListjobgrid_Rows, AV122PrgPct, AV120i, AV64VerSumLin, AV42Mail, AV43ManAut, AV45Opi, AV63VerMail, AV49PRIO, AV97PATHTEMP, AV30FacCodfrom, AV47PATHPDF, AV145Pgmname) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short sublistjobgrid_nextpage( )
   {
      LISTJOBGRID_nRecordCount = sublistjobgrid_fnc_recordcount( ) ;
      if ( ( LISTJOBGRID_nRecordCount >= sublistjobgrid_fnc_recordsperpage( ) ) && ( LISTJOBGRID_nEOF == 0 ) )
      {
         LISTJOBGRID_nFirstRecordOnPage = (long)(LISTJOBGRID_nFirstRecordOnPage+sublistjobgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( LISTJOBGRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      ListjobgridContainer.AddObjectProperty("LISTJOBGRID_nFirstRecordOnPage", LISTJOBGRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrlistjobgrid_refresh( subListjobgrid_Rows, AV122PrgPct, AV120i, AV64VerSumLin, AV42Mail, AV43ManAut, AV45Opi, AV63VerMail, AV49PRIO, AV97PATHTEMP, AV30FacCodfrom, AV47PATHPDF, AV145Pgmname) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((LISTJOBGRID_nEOF==0) ? 0 : 2)) ;
   }

   public short sublistjobgrid_previouspage( )
   {
      if ( LISTJOBGRID_nFirstRecordOnPage >= sublistjobgrid_fnc_recordsperpage( ) )
      {
         LISTJOBGRID_nFirstRecordOnPage = (long)(LISTJOBGRID_nFirstRecordOnPage-sublistjobgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( LISTJOBGRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrlistjobgrid_refresh( subListjobgrid_Rows, AV122PrgPct, AV120i, AV64VerSumLin, AV42Mail, AV43ManAut, AV45Opi, AV63VerMail, AV49PRIO, AV97PATHTEMP, AV30FacCodfrom, AV47PATHPDF, AV145Pgmname) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short sublistjobgrid_lastpage( )
   {
      LISTJOBGRID_nRecordCount = sublistjobgrid_fnc_recordcount( ) ;
      if ( LISTJOBGRID_nRecordCount > sublistjobgrid_fnc_recordsperpage( ) )
      {
         if ( ((int)((LISTJOBGRID_nRecordCount) % (sublistjobgrid_fnc_recordsperpage( )))) == 0 )
         {
            LISTJOBGRID_nFirstRecordOnPage = (long)(LISTJOBGRID_nRecordCount-sublistjobgrid_fnc_recordsperpage( )) ;
         }
         else
         {
            LISTJOBGRID_nFirstRecordOnPage = (long)(LISTJOBGRID_nRecordCount-((int)((LISTJOBGRID_nRecordCount) % (sublistjobgrid_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         LISTJOBGRID_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( LISTJOBGRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrlistjobgrid_refresh( subListjobgrid_Rows, AV122PrgPct, AV120i, AV64VerSumLin, AV42Mail, AV43ManAut, AV45Opi, AV63VerMail, AV49PRIO, AV97PATHTEMP, AV30FacCodfrom, AV47PATHPDF, AV145Pgmname) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int sublistjobgrid_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         LISTJOBGRID_nFirstRecordOnPage = (long)(sublistjobgrid_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         LISTJOBGRID_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( LISTJOBGRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrlistjobgrid_refresh( subListjobgrid_Rows, AV122PrgPct, AV120i, AV64VerSumLin, AV42Mail, AV43ManAut, AV45Opi, AV63VerMail, AV49PRIO, AV97PATHTEMP, AV30FacCodfrom, AV47PATHPDF, AV145Pgmname) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_date = GXutil.today( ) ;
      AV145Pgmname = "Facturacion.GenerarJobFactura" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV145Pgmname", AV145Pgmname);
      Gx_err = (short)(0) ;
      edtavPathpdf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPathpdf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPathpdf_Enabled), 5, 0), true);
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_139_Refreshing);
      edtavJobdescwithtags_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavJobdescwithtags_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavJobdescwithtags_Enabled), 5, 0), !bGXsfl_139_Refreshing);
      edtavRun_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRun_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRun_Enabled), 5, 0), !bGXsfl_139_Refreshing);
      edtavRow_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRow_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRow_Enabled), 5, 0), !bGXsfl_139_Refreshing);
      edtavPrgpct_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrgpct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrgpct_Enabled), 5, 0), !bGXsfl_139_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2BU0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e212BU2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV25DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICODFROM_DATA"), AV15CliCodfrom_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICODTO_DATA"), AV17CliCodto_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vLISTPRINTER_DATA"), AV40ListPrinter_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vNOTIFICATIONINFO"), AV113NotificationInfo);
         /* Read saved values. */
         nRC_GXsfl_139 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_139"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV107ListJobGridPageCount = localUtil.ctol( httpContext.cgiGet( "vLISTJOBGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         LISTJOBGRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "LISTJOBGRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         LISTJOBGRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "LISTJOBGRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subListjobgrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "LISTJOBGRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRID_Rows", GXutil.ltrim( localUtil.ntoc( subListjobgrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Combo_clicodfrom_Cls = httpContext.cgiGet( "COMBO_CLICODFROM_Cls") ;
         Combo_clicodfrom_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLICODFROM_Selectedvalue_set") ;
         Combo_clicodfrom_Emptyitemtext = httpContext.cgiGet( "COMBO_CLICODFROM_Emptyitemtext") ;
         Combo_clicodto_Cls = httpContext.cgiGet( "COMBO_CLICODTO_Cls") ;
         Combo_clicodto_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLICODTO_Selectedvalue_set") ;
         Combo_clicodto_Emptyitemtext = httpContext.cgiGet( "COMBO_CLICODTO_Emptyitemtext") ;
         Combo_listprinter_Cls = httpContext.cgiGet( "COMBO_LISTPRINTER_Cls") ;
         Combo_listprinter_Selectedvalue_set = httpContext.cgiGet( "COMBO_LISTPRINTER_Selectedvalue_set") ;
         Combo_listprinter_Selectedtext_set = httpContext.cgiGet( "COMBO_LISTPRINTER_Selectedtext_set") ;
         Combo_listprinter_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_LISTPRINTER_Visible")) ;
         Combo_listprinter_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_LISTPRINTER_Emptyitem")) ;
         Dvpanel_panel_filtrosgenerales_Width = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Width") ;
         Dvpanel_panel_filtrosgenerales_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Autowidth")) ;
         Dvpanel_panel_filtrosgenerales_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Autoheight")) ;
         Dvpanel_panel_filtrosgenerales_Cls = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Cls") ;
         Dvpanel_panel_filtrosgenerales_Title = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Title") ;
         Dvpanel_panel_filtrosgenerales_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Collapsible")) ;
         Dvpanel_panel_filtrosgenerales_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Collapsed")) ;
         Dvpanel_panel_filtrosgenerales_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Showcollapseicon")) ;
         Dvpanel_panel_filtrosgenerales_Iconposition = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Iconposition") ;
         Dvpanel_panel_filtrosgenerales_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Autoscroll")) ;
         Dvpanel_panel_filtros_Width = httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Width") ;
         Dvpanel_panel_filtros_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Autowidth")) ;
         Dvpanel_panel_filtros_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Autoheight")) ;
         Dvpanel_panel_filtros_Cls = httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Cls") ;
         Dvpanel_panel_filtros_Title = httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Title") ;
         Dvpanel_panel_filtros_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Collapsible")) ;
         Dvpanel_panel_filtros_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Collapsed")) ;
         Dvpanel_panel_filtros_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Showcollapseicon")) ;
         Dvpanel_panel_filtros_Iconposition = httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Iconposition") ;
         Dvpanel_panel_filtros_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Autoscroll")) ;
         Listjobgridpaginationbar_Class = httpContext.cgiGet( "LISTJOBGRIDPAGINATIONBAR_Class") ;
         Listjobgridpaginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( "LISTJOBGRIDPAGINATIONBAR_Showfirst")) ;
         Listjobgridpaginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( "LISTJOBGRIDPAGINATIONBAR_Showprevious")) ;
         Listjobgridpaginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( "LISTJOBGRIDPAGINATIONBAR_Shownext")) ;
         Listjobgridpaginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( "LISTJOBGRIDPAGINATIONBAR_Showlast")) ;
         Listjobgridpaginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( "LISTJOBGRIDPAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Listjobgridpaginationbar_Pagingbuttonsposition = httpContext.cgiGet( "LISTJOBGRIDPAGINATIONBAR_Pagingbuttonsposition") ;
         Listjobgridpaginationbar_Pagingcaptionposition = httpContext.cgiGet( "LISTJOBGRIDPAGINATIONBAR_Pagingcaptionposition") ;
         Listjobgridpaginationbar_Emptygridclass = httpContext.cgiGet( "LISTJOBGRIDPAGINATIONBAR_Emptygridclass") ;
         Listjobgridpaginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( "LISTJOBGRIDPAGINATIONBAR_Rowsperpageselector")) ;
         Listjobgridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "LISTJOBGRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Listjobgridpaginationbar_Rowsperpageoptions = httpContext.cgiGet( "LISTJOBGRIDPAGINATIONBAR_Rowsperpageoptions") ;
         Listjobgridpaginationbar_Previous = httpContext.cgiGet( "LISTJOBGRIDPAGINATIONBAR_Previous") ;
         Listjobgridpaginationbar_Next = httpContext.cgiGet( "LISTJOBGRIDPAGINATIONBAR_Next") ;
         Listjobgridpaginationbar_Caption = httpContext.cgiGet( "LISTJOBGRIDPAGINATIONBAR_Caption") ;
         Listjobgridpaginationbar_Emptygridcaption = httpContext.cgiGet( "LISTJOBGRIDPAGINATIONBAR_Emptygridcaption") ;
         Listjobgridpaginationbar_Rowsperpagecaption = httpContext.cgiGet( "LISTJOBGRIDPAGINATIONBAR_Rowsperpagecaption") ;
         Dvpanel_panelwccomponent_Width = httpContext.cgiGet( "DVPANEL_PANELWCCOMPONENT_Width") ;
         Dvpanel_panelwccomponent_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELWCCOMPONENT_Autowidth")) ;
         Dvpanel_panelwccomponent_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELWCCOMPONENT_Autoheight")) ;
         Dvpanel_panelwccomponent_Cls = httpContext.cgiGet( "DVPANEL_PANELWCCOMPONENT_Cls") ;
         Dvpanel_panelwccomponent_Title = httpContext.cgiGet( "DVPANEL_PANELWCCOMPONENT_Title") ;
         Dvpanel_panelwccomponent_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELWCCOMPONENT_Collapsible")) ;
         Dvpanel_panelwccomponent_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELWCCOMPONENT_Collapsed")) ;
         Dvpanel_panelwccomponent_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELWCCOMPONENT_Showcollapseicon")) ;
         Dvpanel_panelwccomponent_Iconposition = httpContext.cgiGet( "DVPANEL_PANELWCCOMPONENT_Iconposition") ;
         Dvpanel_panelwccomponent_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELWCCOMPONENT_Autoscroll")) ;
         Datamonjs_Paramstr = httpContext.cgiGet( "DATAMONJS_Paramstr") ;
         Popover_jobdesc_Gridinternalname = httpContext.cgiGet( "POPOVER_JOBDESC_Gridinternalname") ;
         Popover_jobdesc_Iteminternalname = httpContext.cgiGet( "POPOVER_JOBDESC_Iteminternalname") ;
         Popover_jobdesc_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "POPOVER_JOBDESC_Isgriditem")) ;
         Popover_jobdesc_Trigger = httpContext.cgiGet( "POPOVER_JOBDESC_Trigger") ;
         Popover_jobdesc_Popoverwidth = (int)(localUtil.ctol( httpContext.cgiGet( "POPOVER_JOBDESC_Popoverwidth"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Popover_jobdesc_Position = httpContext.cgiGet( "POPOVER_JOBDESC_Position") ;
         Dvelop_confirmpanel_deleted_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DELETED_Title") ;
         Dvelop_confirmpanel_deleted_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DELETED_Confirmationtext") ;
         Dvelop_confirmpanel_deleted_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DELETED_Yesbuttoncaption") ;
         Dvelop_confirmpanel_deleted_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DELETED_Nobuttoncaption") ;
         Dvelop_confirmpanel_deleted_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DELETED_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_deleted_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DELETED_Yesbuttonposition") ;
         Dvelop_confirmpanel_deleted_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DELETED_Confirmtype") ;
         Dvelop_confirmpanel_enter_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Title") ;
         Dvelop_confirmpanel_enter_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Confirmationtext") ;
         Dvelop_confirmpanel_enter_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Yesbuttoncaption") ;
         Dvelop_confirmpanel_enter_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Nobuttoncaption") ;
         Dvelop_confirmpanel_enter_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_enter_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Yesbuttonposition") ;
         Dvelop_confirmpanel_enter_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Confirmtype") ;
         Listjobgrid_empowerer_Gridinternalname = httpContext.cgiGet( "LISTJOBGRID_EMPOWERER_Gridinternalname") ;
         Listjobgrid_empowerer_Popoversingrid = httpContext.cgiGet( "LISTJOBGRID_EMPOWERER_Popoversingrid") ;
         subListjobgrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "LISTJOBGRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRID_Rows", GXutil.ltrim( localUtil.ntoc( subListjobgrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Listjobgridpaginationbar_Selectedpage = httpContext.cgiGet( "LISTJOBGRIDPAGINATIONBAR_Selectedpage") ;
         Listjobgridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "LISTJOBGRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Dvelop_confirmpanel_deleted_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DELETED_Result") ;
         Dvelop_confirmpanel_enter_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Result") ;
         Combo_clicodto_Selectedvalue_get = httpContext.cgiGet( "COMBO_CLICODTO_Selectedvalue_get") ;
         Combo_clicodfrom_Selectedvalue_get = httpContext.cgiGet( "COMBO_CLICODFROM_Selectedvalue_get") ;
         /* Read variables values. */
         if ( localUtil.vcdate( httpContext.cgiGet( edtavFacfchto_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFACFCHTO");
            GX_FocusControl = edtavFacfchto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV35FacFchto = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35FacFchto", localUtil.format(AV35FacFchto, "99/99/99"));
         }
         else
         {
            AV35FacFchto = localUtil.ctod( httpContext.cgiGet( edtavFacfchto_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35FacFchto", localUtil.format(AV35FacFchto, "99/99/99"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavFaccodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavFaccodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFACCODTO");
            GX_FocusControl = edtavFaccodto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV31FacCodto = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31FacCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31FacCodto), 8, 0));
         }
         else
         {
            AV31FacCodto = (int)(localUtil.ctol( httpContext.cgiGet( edtavFaccodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31FacCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31FacCodto), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCopias2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCopias2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOPIAS2");
            GX_FocusControl = edtavCopias2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV23Copias2 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23Copias2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Copias2), 4, 0));
         }
         else
         {
            AV23Copias2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavCopias2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23Copias2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Copias2), 4, 0));
         }
         if ( ( ( ((GXutil.strcmp(httpContext.cgiGet( chkavVersumlin.getInternalname()), "1")==0) ? 1 : 0) < 0 ) ) || ( ( ((GXutil.strcmp(httpContext.cgiGet( chkavVersumlin.getInternalname()), "1")==0) ? 1 : 0) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVERSUMLIN");
            GX_FocusControl = chkavVersumlin.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV64VerSumLin = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64VerSumLin", GXutil.str( AV64VerSumLin, 1, 0));
         }
         else
         {
            AV64VerSumLin = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkavVersumlin.getInternalname()), "1")==0) ? 1 : 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64VerSumLin", GXutil.str( AV64VerSumLin, 1, 0));
         }
         cmbavF_header.setName( cmbavF_header.getInternalname() );
         cmbavF_header.setValue( httpContext.cgiGet( cmbavF_header.getInternalname()) );
         AV28F_header = (byte)(GXutil.lval( httpContext.cgiGet( cmbavF_header.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28F_header", GXutil.str( AV28F_header, 1, 0));
         cmbavAgr_fases.setName( cmbavAgr_fases.getInternalname() );
         cmbavAgr_fases.setValue( httpContext.cgiGet( cmbavAgr_fases.getInternalname()) );
         AV11Agr_Fases = (short)(GXutil.lval( httpContext.cgiGet( cmbavAgr_fases.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11Agr_Fases", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11Agr_Fases), 4, 0));
         AV42Mail = ((GXutil.strcmp(httpContext.cgiGet( chkavMail.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42Mail", AV42Mail);
         AV47PATHPDF = httpContext.cgiGet( edtavPathpdf_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47PATHPDF", AV47PATHPDF);
         AV43ManAut = ((GXutil.strcmp(httpContext.cgiGet( chkavManaut.getInternalname()), "A")==0) ? "A" : "M") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43ManAut", AV43ManAut);
         AV45Opi = ((GXutil.strcmp(httpContext.cgiGet( chkavOpi.getInternalname()), "1")==0) ? "1" : "0") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45Opi", AV45Opi);
         AV145Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV145Pgmname", AV145Pgmname);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICODTO");
            GX_FocusControl = edtavClicodto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV16CliCodto = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16CliCodto), 6, 0));
         }
         else
         {
            AV16CliCodto = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16CliCodto), 6, 0));
         }
         AV39ListPrinter = httpContext.cgiGet( edtavListprinter_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39ListPrinter", AV39ListPrinter);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavListjobgridcurrentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavListjobgridcurrentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vLISTJOBGRIDCURRENTPAGE");
            GX_FocusControl = edtavListjobgridcurrentpage_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV106ListJobGridCurrentPage = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV106ListJobGridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106ListJobGridCurrentPage), 10, 0));
         }
         else
         {
            AV106ListJobGridCurrentPage = localUtil.ctol( httpContext.cgiGet( edtavListjobgridcurrentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV106ListJobGridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106ListJobGridCurrentPage), 10, 0));
         }
         AV63VerMail = GXutil.strtobool( httpContext.cgiGet( chkavVermail.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV63VerMail", AV63VerMail);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"GenerarJobFactura");
         AV47PATHPDF = httpContext.cgiGet( edtavPathpdf_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47PATHPDF", AV47PATHPDF);
         forbiddenHiddens.add("PATHPDF", GXutil.rtrim( localUtil.format( AV47PATHPDF, "")));
         AV145Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV145Pgmname", AV145Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV145Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("facturacion\\generarjobfactura:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e212BU2 ();
      if (returnInSub) return;
   }

   public void e212BU2( )
   {
      /* Start Routine */
      returnInSub = false ;
      edtavFaccodfrom_Enabled = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFaccodfrom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFaccodfrom_Enabled), 5, 0), true);
      edtavFaccodto_Enabled = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFaccodto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFaccodto_Enabled), 5, 0), true);
      edtavClicodfrom_Enabled = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicodfrom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicodfrom_Enabled), 5, 0), true);
      edtavClicodto_Enabled = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicodto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicodto_Enabled), 5, 0), true);
      edtavFacfchfrom_Enabled = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFacfchfrom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacfchfrom_Enabled), 5, 0), true);
      edtavFacfchto_Enabled = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFacfchto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacfchto_Enabled), 5, 0), true);
      if ( ! (0==AV30FacCodfrom) )
      {
         AV31FacCodto = AV30FacCodfrom ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31FacCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31FacCodto), 8, 0));
         AV16CliCodto = AV14CliCodfrom ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16CliCodto), 6, 0));
         AV35FacFchto = AV34FacFchfrom ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35FacFchto", localUtil.format(AV35FacFchto, "99/99/99"));
      }
      else
      {
         AV35FacFchto = Gx_date ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35FacFchto", localUtil.format(AV35FacFchto, "99/99/99"));
         AV34FacFchfrom = GXutil.dadd(GXutil.serverDate( context, remoteHandle, pr_default),-(7)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34FacFchfrom", localUtil.format(AV34FacFchfrom, "99/99/99"));
      }
      GXv_SdtWWPContext1[0] = AV65WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV65WWPContext = GXv_SdtWWPContext1[0] ;
      GXt_char2 = AV95Station ;
      GXv_char3[0] = GXt_char2 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char3) ;
      generarjobfactura_impl.this.GXt_char2 = GXv_char3[0] ;
      AV95Station = GXt_char2 ;
      GXv_char3[0] = AV26EmprCod ;
      GXv_char4[0] = AV27EmprNom ;
      GXv_char5[0] = AV61UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV95Station, GXv_char3, GXv_char4, GXv_char5) ;
      generarjobfactura_impl.this.AV26EmprCod = GXv_char3[0] ;
      generarjobfactura_impl.this.AV27EmprNom = GXv_char4[0] ;
      generarjobfactura_impl.this.AV61UsurCod = GXv_char5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26EmprCod", AV26EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV61UsurCod", AV61UsurCod);
      Popover_jobdesc_Gridinternalname = subListjobgrid_Internalname ;
      ucPopover_jobdesc.sendProperty(context, "", false, Popover_jobdesc_Internalname, "GridInternalName", Popover_jobdesc_Gridinternalname);
      Popover_jobdesc_Iteminternalname = edtavJobdescwithtags_Internalname ;
      ucPopover_jobdesc.sendProperty(context, "", false, Popover_jobdesc_Internalname, "ItemInternalName", Popover_jobdesc_Iteminternalname);
      divCell_listjobgrid_dwc_Class = "Invisible WCD_"+GXutil.upper( subListjobgrid_Internalname) ;
      httpContext.ajax_rsp_assign_prop("", false, divCell_listjobgrid_dwc_Internalname, "Class", divCell_listjobgrid_dwc_Class, true);
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = AV25DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] ;
      AV25DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      edtavListprinter_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavListprinter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavListprinter_Visible), 5, 0), true);
      edtavClicodto_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicodto_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicodto_Visible), 5, 0), true);
      edtavClicodfrom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicodfrom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicodfrom_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOCLICODFROM' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOCLICODTO' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOLISTPRINTER' */
      S132 ();
      if (returnInSub) return;
      chkavVermail.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavVermail.getInternalname(), "Visible", GXutil.ltrimstr( chkavVermail.getVisible(), 5, 0), true);
      Listjobgrid_empowerer_Gridinternalname = subListjobgrid_Internalname ;
      ucListjobgrid_empowerer.sendProperty(context, "", false, Listjobgrid_empowerer_Internalname, "GridInternalName", Listjobgrid_empowerer_Gridinternalname);
      subListjobgrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRID_Rows", GXutil.ltrim( localUtil.ntoc( subListjobgrid_Rows, (byte)(6), (byte)(0), ".", "")));
      AV106ListJobGridCurrentPage = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV106ListJobGridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106ListJobGridCurrentPage), 10, 0));
      edtavListjobgridcurrentpage_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavListjobgridcurrentpage_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavListjobgridcurrentpage_Visible), 5, 0), true);
      AV107ListJobGridPageCount = -1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV107ListJobGridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV107ListJobGridPageCount), 10, 0));
      Listjobgridpaginationbar_Rowsperpageselectedvalue = subListjobgrid_Rows ;
      ucListjobgridpaginationbar.sendProperty(context, "", false, Listjobgridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Listjobgridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      AV63VerMail = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63VerMail", AV63VerMail);
      AV45Opi = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45Opi", AV45Opi);
      GXt_char2 = AV47PATHPDF ;
      GXv_char5[0] = GXt_char2 ;
      new app.pbusemplin(remoteHandle, context).execute( AV26EmprCod, httpContext.getMessage( "WEBPDF", ""), GXv_char5) ;
      generarjobfactura_impl.this.GXt_char2 = GXv_char5[0] ;
      AV47PATHPDF = GXt_char2 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47PATHPDF", AV47PATHPDF);
      GXt_char2 = AV97PATHTEMP ;
      GXv_char5[0] = GXt_char2 ;
      new app.pbusemplin(remoteHandle, context).execute( AV26EmprCod, httpContext.getMessage( "WEBPDF", ""), GXv_char5) ;
      generarjobfactura_impl.this.GXt_char2 = GXv_char5[0] ;
      AV97PATHTEMP = GXt_char2 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV97PATHTEMP", AV97PATHTEMP);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPATHTEMP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV97PATHTEMP, ""))));
      if ( ! (GXutil.strcmp("", AV65WWPContext.getgxTv_SdtWWPContext_Usurprint())==0) )
      {
         AV39ListPrinter = AV65WWPContext.getgxTv_SdtWWPContext_Usurprint() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39ListPrinter", AV39ListPrinter);
         Combo_listprinter_Selectedtext_set = AV39ListPrinter ;
         ucCombo_listprinter.sendProperty(context, "", false, Combo_listprinter_Internalname, "SelectedText_set", Combo_listprinter_Selectedtext_set);
         Combo_listprinter_Selectedvalue_set = AV39ListPrinter ;
         ucCombo_listprinter.sendProperty(context, "", false, Combo_listprinter_Internalname, "SelectedValue_set", Combo_listprinter_Selectedvalue_set);
      }
      AV43ManAut = "M" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43ManAut", AV43ManAut);
      AV64VerSumLin = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64VerSumLin", GXutil.str( AV64VerSumLin, 1, 0));
      AV28F_header = (byte)(2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28F_header", GXutil.str( AV28F_header, 1, 0));
      AV11Agr_Fases = (short)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Agr_Fases", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11Agr_Fases), 4, 0));
      AV62Var_OutPut = httpContext.getMessage( "PRN", "") ;
      AV49PRIO = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49PRIO", AV49PRIO);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRIO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV49PRIO, "9"))));
      GXt_int8 = AV22Copias ;
      GXv_int9[0] = GXt_int8 ;
      new app.pbuscon(remoteHandle, context).execute( AV26EmprCod, "100005", GXv_int9) ;
      generarjobfactura_impl.this.GXt_int8 = GXv_int9[0] ;
      AV22Copias = (short)(GXt_int8) ;
      if ( AV22Copias == 0 )
      {
         AV22Copias = (short)(1) ;
      }
      AV23Copias2 = AV22Copias ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Copias2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Copias2), 4, 0));
      AV98Copia[1-1] = httpContext.getMessage( "Original", "") ;
      AV98Copia[2-1] = httpContext.getMessage( "Duplicado", "") ;
      AV98Copia[3-1] = httpContext.getMessage( "Triplicado", "") ;
      AV98Copia[4-1] = httpContext.getMessage( "Quadriplicado", "") ;
      AV67Year = (short)(GXutil.year( Gx_date)) ;
      AV24Day = (short)(GXutil.day( Gx_date)) ;
      AV44Mounth = (short)(GXutil.month( Gx_date)) ;
      AV120i = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV120i", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV120i), 4, 0));
   }

   public void e222BU2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      AV137RecordCount = (short)(sublistjobgrid_fnc_recordcount( )) ;
      AV107ListJobGridPageCount = (long)(AV137RecordCount/ (double) (subListjobgrid_Rows)+((((int)((AV137RecordCount) % (subListjobgrid_Rows)))>0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV107ListJobGridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV107ListJobGridPageCount), 10, 0));
      /*  Sending Event outputs  */
   }

   private void e232BU2( )
   {
      /* Listjobgrid_Load Routine */
      returnInSub = false ;
      AV120i = (short)(AV120i+1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV120i", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV120i), 4, 0));
      AV122PrgPct = A14459PrgPct ;
      httpContext.ajax_rsp_assign_attri("", false, edtavPrgpct_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV122PrgPct), 3, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRGPCT"+"_"+sGXsfl_139_idx, getSecureSignedToken( sGXsfl_139_idx, localUtil.format( DecimalUtil.doubleToDec(AV122PrgPct), "ZZ9")));
      AV121Row = GXutil.format( "%1%2", httpContext.getMessage( "span_PRGPCT_", ""), GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV120i), "9999")), "", "", "", "", "", "", "") ;
      httpContext.ajax_rsp_assign_attri("", false, edtavRow_Internalname, AV121Row);
      this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "SetProgress", "", new Object[] {AV121Row,GXutil.str( A14459PrgPct, 3, 0),"100"});
      cmbavGridactiongroup1.removeAllItems();
      cmbavGridactiongroup1.addItem("0", ";FontColorIconInfo far fa-caret-square-down", (short)(0));
      cmbavGridactiongroup1.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Email", ""), "fas fa-envelope-open-text", "", "", "", "", "", "", ""), (short)(0));
      if ( GXutil.strcmp(A14450JobStat, "DONE") == 0 )
      {
         cmbavGridactiongroup1.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "Imprimir", ""), "fas fa-print", "", "", "", "", "", "", ""), (short)(0));
      }
      if ( GXutil.strcmp(A14450JobStat, "DONE") == 0 )
      {
         cmbavGridactiongroup1.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "Preview", ""), "far fa-file-pdf", "", "", "", "", "", "", ""), (short)(0));
      }
      cmbavGridactiongroup1.addItem("4", GXutil.format( "%1;%2", httpContext.getMessage( "Apagar", ""), "fas fa-trash-alt", "", "", "", "", "", "", ""), (short)(0));
      AV109DetailWebComponent = "<i class=\"fas fa-angle-right ArrowIcon\"></i>" ;
      httpContext.ajax_rsp_assign_attri("", false, edtavDetailwebcomponent_Internalname, AV109DetailWebComponent);
      AV111Run = "<i class=\"FontColorIcon fas fa-angle-double-right\"></i>" ;
      httpContext.ajax_rsp_assign_attri("", false, edtavRun_Internalname, AV111Run);
      if ( A14458ErItem > 0 )
      {
         edtavRun_Class = "Attribute" ;
      }
      else
      {
         edtavRun_Class = "Invisible" ;
      }
      AV118JobDescWithTags = A14485JobDesc ;
      httpContext.ajax_rsp_assign_attri("", false, edtavJobdescwithtags_Internalname, AV118JobDescWithTags);
      AV118JobDescWithTags += "<i class='WWPPopoverIcon TagAfterText fa fa-caret-down fas fa-info'></i>" ;
      httpContext.ajax_rsp_assign_attri("", false, edtavJobdescwithtags_Internalname, AV118JobDescWithTags);
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(139) ;
      }
      sendrow_1392( ) ;
      LISTJOBGRID_nCurrentRecord = (long)(LISTJOBGRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_139_Refreshing )
      {
         httpContext.doAjaxLoad(139, ListjobgridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV110GridActionGroup1, 4, 0)) );
   }

   public void e142BU2( )
   {
      /* Listjobgridpaginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Listjobgridpaginationbar_Selectedpage, "Previous") == 0 )
      {
         AV106ListJobGridCurrentPage = (long)(AV106ListJobGridCurrentPage-1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV106ListJobGridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106ListJobGridCurrentPage), 10, 0));
         sublistjobgrid_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Listjobgridpaginationbar_Selectedpage, "Next") == 0 )
      {
         AV106ListJobGridCurrentPage = (long)(AV106ListJobGridCurrentPage+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV106ListJobGridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106ListJobGridCurrentPage), 10, 0));
         sublistjobgrid_nextpage( ) ;
      }
      else
      {
         AV105PageToGo = (int)(GXutil.lval( Listjobgridpaginationbar_Selectedpage)) ;
         AV106ListJobGridCurrentPage = AV105PageToGo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV106ListJobGridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106ListJobGridCurrentPage), 10, 0));
         sublistjobgrid_gotopage( AV105PageToGo) ;
      }
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e152BU2( )
   {
      /* Listjobgridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subListjobgrid_Rows = Listjobgridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRID_Rows", GXutil.ltrim( localUtil.ntoc( subListjobgrid_Rows, (byte)(6), (byte)(0), ".", "")));
      AV106ListJobGridCurrentPage = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV106ListJobGridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106ListJobGridCurrentPage), 10, 0));
      sublistjobgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e242BU2( )
   {
      /* Gridactiongroup1_Click Routine */
      returnInSub = false ;
      if ( AV110GridActionGroup1 == 1 )
      {
         /* Execute user subroutine: 'DO ENVIAREMAIL' */
         S142 ();
         if (returnInSub) return;
      }
      else if ( AV110GridActionGroup1 == 2 )
      {
         /* Execute user subroutine: 'DO PRINTER' */
         S152 ();
         if (returnInSub) return;
      }
      else if ( AV110GridActionGroup1 == 3 )
      {
         /* Execute user subroutine: 'DO PREVIEW' */
         S162 ();
         if (returnInSub) return;
      }
      else if ( AV110GridActionGroup1 == 4 )
      {
         /* Execute user subroutine: 'DO DELETED' */
         S172 ();
         if (returnInSub) return;
      }
      AV110GridActionGroup1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV110GridActionGroup1), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV110GridActionGroup1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), true);
   }

   public void e162BU2( )
   {
      /* Dvelop_confirmpanel_deleted_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_deleted_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION DELETED' */
         S182 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e182BU2 ();
      if (returnInSub) return;
   }

   public void e182BU2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      if ( (0==AV30FacCodfrom) && (0==AV31FacCodto) && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV34FacFchfrom)) && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV35FacFchto)) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atenção: Não foi introduzido qualquer valor em Fatura, Data", ""));
      }
      else
      {
         if ( (0==AV30FacCodfrom) && (0==AV31FacCodto) && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV34FacFchfrom)) && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV35FacFchto)) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Atenção: Não foi introduzido qualquer valor em  Fatura", ""));
         }
         else
         {
            if ( (0==AV30FacCodfrom) && ! (0==AV31FacCodto) )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Atenção: Não foi introduzido qualquer valor em  Fatura inicial", ""));
            }
            else
            {
               if ( ! (0==AV30FacCodfrom) && (0==AV31FacCodto) )
               {
                  httpContext.GX_msglist.addItem(httpContext.getMessage( "Atenção: Não foi introduzido qualquer valor em  Fatura final", ""));
               }
               else
               {
                  if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV34FacFchfrom)) && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV35FacFchto)) && (0==AV30FacCodfrom) && (0==AV31FacCodto) )
                  {
                     httpContext.GX_msglist.addItem(httpContext.getMessage( "Atenção: Não foi introduzido qualquer valor em  Data", ""));
                  }
                  else
                  {
                     if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV34FacFchfrom)) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV35FacFchto)) )
                     {
                        httpContext.GX_msglist.addItem(httpContext.getMessage( "Atenção: Não foi introduzido qualquer valor em  Data inicial", ""));
                     }
                     else
                     {
                        if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV34FacFchfrom)) && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV35FacFchto)) )
                        {
                           httpContext.GX_msglist.addItem(httpContext.getMessage( "Atenção: Não foi introduzido qualquer valor em  Data final", ""));
                        }
                        else
                        {
                           AV32FacEst = (byte)(0) ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV32FacEst", GXutil.str( AV32FacEst, 1, 0));
                           AV33FacEstto = (byte)(((GXutil.strcmp(AV43ManAut, "A")==0) ? 0 : 2)) ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV33FacEstto", GXutil.str( AV33FacEstto, 1, 0));
                           AV126Numerodefacturas = (short)(0) ;
                           /* Optimized group. */
                           pr_default.dynParam(2, new Object[]{ new Object[]{
                                                                Integer.valueOf(AV30FacCodfrom) ,
                                                                Integer.valueOf(AV31FacCodto) ,
                                                                AV34FacFchfrom ,
                                                                AV35FacFchto ,
                                                                Integer.valueOf(AV14CliCodfrom) ,
                                                                Integer.valueOf(AV16CliCodto) ,
                                                                Integer.valueOf(A430FacCod) ,
                                                                A436FacFch ,
                                                                Integer.valueOf(A252CliCod) ,
                                                                AV26EmprCod ,
                                                                Byte.valueOf(AV32FacEst) ,
                                                                Byte.valueOf(AV33FacEstto) ,
                                                                AV49PRIO } ,
                                                                new int[]{
                                                                TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING,
                                                                TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING
                                                                }
                           });
                           /* Using cursor H02BU4 */
                           pr_default.execute(2, new Object[] {AV26EmprCod, Byte.valueOf(AV32FacEst), Byte.valueOf(AV33FacEstto), AV49PRIO, Integer.valueOf(AV30FacCodfrom), Integer.valueOf(AV31FacCodto), AV34FacFchfrom, AV35FacFchto, Integer.valueOf(AV14CliCodfrom), Integer.valueOf(AV16CliCodto)});
                           cV126Numerodefacturas = H02BU4_AV126Numerodefacturas[0] ;
                           pr_default.close(2);
                           AV126Numerodefacturas = (short)(AV126Numerodefacturas+cV126Numerodefacturas*1) ;
                           /* End optimized group. */
                           if ( AV126Numerodefacturas == 0 )
                           {
                              httpContext.GX_msglist.addItem(httpContext.getMessage( "Não há faturas a processar.", ""));
                           }
                           else
                           {
                              if ( AV126Numerodefacturas > 50 )
                              {
                                 httpContext.GX_msglist.addItem(httpContext.getMessage( "Atenção. O número de faturas a processar ", "")+localUtil.format( DecimalUtil.doubleToDec(AV126Numerodefacturas), "ZZZ9")+httpContext.getMessage( ", ultrapassará as 50.", ""));
                              }
                              else
                              {
                                 Dvelop_confirmpanel_enter_Confirmationtext = httpContext.getMessage( "O número de faturas a processar é ", "")+localUtil.format( DecimalUtil.doubleToDec(AV126Numerodefacturas), "ZZZ9")+httpContext.getMessage( ". Pretende imprimi-las?", "") ;
                                 ucDvelop_confirmpanel_enter.sendProperty(context, "", false, Dvelop_confirmpanel_enter_Internalname, "ConfirmationText", Dvelop_confirmpanel_enter_Confirmationtext);
                                 this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ENTERContainer", "Confirm", "", new Object[] {});
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void e172BU2( )
   {
      /* Dvelop_confirmpanel_enter_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_enter_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ENTER' */
         S192 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e132BU2( )
   {
      /* Combo_clicodto_Onoptionclicked Routine */
      returnInSub = false ;
      AV16CliCodto = (int)(GXutil.lval( Combo_clicodto_Selectedvalue_get)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16CliCodto), 6, 0));
      /*  Sending Event outputs  */
   }

   public void e122BU2( )
   {
      /* Combo_clicodfrom_Onoptionclicked Routine */
      returnInSub = false ;
      AV14CliCodfrom = (int)(GXutil.lval( Combo_clicodfrom_Selectedvalue_get)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14CliCodfrom), 6, 0));
      /*  Sending Event outputs  */
   }

   public void S142( )
   {
      /* 'DO ENVIAREMAIL' Routine */
      returnInSub = false ;
      AV134AuxJobId = A14423JobId ;
      httpContext.ajax_rsp_assign_attri("", false, "AV134AuxJobId", AV134AuxJobId.toString());
      /* Using cursor H02BU5 */
      pr_default.execute(3, new Object[] {AV134AuxJobId});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A14423JobId = H02BU5_A14423JobId[0] ;
         A14470DocId = H02BU5_A14470DocId[0] ;
         n14470DocId = H02BU5_n14470DocId[0] ;
         AV128FacCod = (int)(A14470DocId) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV128FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV128FacCod), 8, 0));
         /* Execute user subroutine: 'BUSCARDADOSFACTURA' */
         S224 ();
         if ( returnInSub )
         {
            pr_default.close(3);
            returnInSub = true;
            if (true) return;
         }
         new app.facturacion.facturaenviomail(remoteHandle, context).execute( AV26EmprCod, AV134AuxJobId, AV128FacCod, AV129FacFch, AV133CliCod, AV132CliNom, AV127Cliemf, true) ;
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void S152( )
   {
      /* 'DO PRINTER' Routine */
      returnInSub = false ;
      if ( ! (GXutil.strcmp("", AV39ListPrinter)==0) )
      {
         AV112Aviso = AV5AppTool.printto(A14463ZipPath, AV39ListPrinter, (byte)(1), true, false) ;
         httpContext.GX_msglist.addItem(AV112Aviso);
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Selecione una impressora !", ""));
      }
   }

   public void S162( )
   {
      /* 'DO PREVIEW' Routine */
      returnInSub = false ;
      this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "windows", "", new Object[] {A14464ZipUrl,"_blank"});
   }

   public void S172( )
   {
      /* 'DO DELETED' Routine */
      returnInSub = false ;
      AV125JobId_Selected = A14423JobId ;
      httpContext.ajax_rsp_assign_attri("", false, "AV125JobId_Selected", AV125JobId_Selected.toString());
      this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_DELETEDContainer", "Confirm", "", new Object[] {});
   }

   public void S182( )
   {
      /* 'DO ACTION DELETED' Routine */
      returnInSub = false ;
      new app.asyncbatch.jobdelete(remoteHandle, context).execute( AV125JobId_Selected, AV26EmprCod, AV61UsurCod) ;
      httpContext.doAjaxRefresh();
   }

   public void S192( )
   {
      /* 'DO ACTION ENTER' Routine */
      returnInSub = false ;
      AV32FacEst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32FacEst", GXutil.str( AV32FacEst, 1, 0));
      AV33FacEstto = (byte)(((GXutil.strcmp(AV43ManAut, "A")==0) ? 0 : 2)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33FacEstto", GXutil.str( AV33FacEstto, 1, 0));
      AV81Total = (short)(0) ;
      AV82Seq = (short)(0) ;
      AV75JobItem = new GXBaseCollection<app.asyncbatch.SdtJobItemSdt_Item>(app.asyncbatch.SdtJobItemSdt_Item.class, "Item", "TexplusNET", remoteHandle) ;
      AV72JobId = GXutil.strToGuid(java.util.UUID.randomUUID( ).toString()) ;
      AV124Cliente = "" ;
      AV141Now = GXutil.now( ) ;
      AV142Timestamp = GXutil.padl( GXutil.trim( GXutil.str( GXutil.year( AV141Now), 10, 0)), (short)(4), "0") + GXutil.padl( GXutil.trim( GXutil.str( GXutil.month( AV141Now), 10, 0)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.str( GXutil.day( AV141Now), 10, 0)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.str( GXutil.hour( AV141Now), 10, 0)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.str( GXutil.minute( AV141Now), 10, 0)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.str( GXutil.second( AV141Now), 10, 0)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.str( GXutil.millisecond( AV141Now), 10, 0)), (short)(3), "0") ;
      AV149GXLvl445 = (byte)(0) ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           Integer.valueOf(AV30FacCodfrom) ,
                                           Integer.valueOf(AV31FacCodto) ,
                                           AV34FacFchfrom ,
                                           AV35FacFchto ,
                                           Integer.valueOf(AV14CliCodfrom) ,
                                           Integer.valueOf(AV16CliCodto) ,
                                           Integer.valueOf(A430FacCod) ,
                                           A436FacFch ,
                                           Integer.valueOf(A252CliCod) ,
                                           Byte.valueOf(A435FacEst) ,
                                           Byte.valueOf(AV32FacEst) ,
                                           Byte.valueOf(AV33FacEstto) ,
                                           A450FacPri ,
                                           AV49PRIO ,
                                           Byte.valueOf(A1153FacTipFac) ,
                                           AV26EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor H02BU6 */
      pr_default.execute(4, new Object[] {AV26EmprCod, Byte.valueOf(AV32FacEst), Byte.valueOf(AV33FacEstto), AV49PRIO, Integer.valueOf(AV30FacCodfrom), Integer.valueOf(AV31FacCodto), AV34FacFchfrom, AV35FacFchto, Integer.valueOf(AV14CliCodfrom), Integer.valueOf(AV16CliCodto)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A1153FacTipFac = H02BU6_A1153FacTipFac[0] ;
         A450FacPri = H02BU6_A450FacPri[0] ;
         A252CliCod = H02BU6_A252CliCod[0] ;
         A436FacFch = H02BU6_A436FacFch[0] ;
         A430FacCod = H02BU6_A430FacCod[0] ;
         A435FacEst = H02BU6_A435FacEst[0] ;
         A396EmprCod = H02BU6_A396EmprCod[0] ;
         A279CliNom = H02BU6_A279CliNom[0] ;
         A279CliNom = H02BU6_A279CliNom[0] ;
         AV149GXLvl445 = (byte)(1) ;
         AV82Seq = (short)(AV82Seq+1) ;
         AV140Bar = "\\" ;
         AV138Folder = GXutil.trim( AV47PATHPDF) + GXutil.trim( AV140Bar) ;
         AV80FileNm = GXutil.format( httpContext.getMessage( "%1_%2_%3.pdf", ""), GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(A430FacCod), "ZZZZZZZ9")), AV142Timestamp, "", "", "", "", "", "") ;
         AV79OutFile = GXutil.trim( AV47PATHPDF) + AV140Bar + AV80FileNm ;
         AV78OutUrl = GXutil.format( "./webpdf/%1", AV80FileNm, "", "", "", "", "", "", "", "") ;
         AV139Directory.setSource( AV138Folder );
         if ( ! AV139Directory.exists() )
         {
            AV139Directory.create();
         }
         AV124Cliente = GXutil.format( "%1-%2", GXutil.trim( GXutil.str( A252CliCod, 6, 0)), GXutil.trim( A279CliNom), "", "", "", "", "", "", "") ;
         AV76JobItem_Row = (app.asyncbatch.SdtJobItemSdt_Item)new app.asyncbatch.SdtJobItemSdt_Item(remoteHandle, context);
         AV76JobItem_Row.setgxTv_SdtJobItemSdt_Item_Jobid( AV72JobId );
         AV76JobItem_Row.setgxTv_SdtJobItemSdt_Item_Itmid( AV82Seq );
         AV76JobItem_Row.setgxTv_SdtJobItemSdt_Item_Docid( A430FacCod );
         AV76JobItem_Row.setgxTv_SdtJobItemSdt_Item_Doclbl( GXutil.format( "#%1_%2", GXutil.trim( GXutil.str( AV82Seq, 4, 0)), AV124Cliente, "", "", "", "", "", "", "") );
         AV76JobItem_Row.setgxTv_SdtJobItemSdt_Item_Itmsts( "WAIT" );
         AV76JobItem_Row.setgxTv_SdtJobItemSdt_Item_Retryqt( (short)(1) );
         AV76JobItem_Row.setgxTv_SdtJobItemSdt_Item_Outfile( AV79OutFile );
         AV76JobItem_Row.setgxTv_SdtJobItemSdt_Item_Outurl( AV78OutUrl );
         AV76JobItem_Row.setgxTv_SdtJobItemSdt_Item_Filenm( AV80FileNm );
         AV75JobItem.add(AV76JobItem_Row, 0);
         AV99isExist = true ;
         pr_default.readNext(4);
      }
      pr_default.close(4);
      if ( AV149GXLvl445 == 0 )
      {
         AV99isExist = false ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Registro no localizado !", ""));
      }
      if ( AV99isExist )
      {
         GXt_boolean10 = AV88isOk ;
         GXv_boolean11[0] = GXt_boolean10 ;
         new app.asyncbatch.jobcreate(remoteHandle, context).execute( AV72JobId, "FATURA", AV75JobItem, AV47PATHPDF, AV97PATHTEMP, GXv_boolean11) ;
         generarjobfactura_impl.this.GXt_boolean10 = GXv_boolean11[0] ;
         AV88isOk = GXt_boolean10 ;
         if ( AV88isOk )
         {
            this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "FormSerialize", "", new Object[] {AV72JobId,"Enpoint or object send Serialize"});
            httpContext.GX_msglist.addItem(httpContext.getMessage( "JOB creado con sucesso !", ""));
         }
      }
      this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "ClickElement", "", new Object[] {httpContext.getMessage( "#Title_DVPANEL_PANEL_FILTROSContainer", "")});
      gxgrlistjobgrid_refresh( subListjobgrid_Rows, AV122PrgPct, AV120i, AV64VerSumLin, AV42Mail, AV43ManAut, AV45Opi, AV63VerMail, AV49PRIO, AV97PATHTEMP, AV30FacCodfrom, AV47PATHPDF, AV145Pgmname) ;
      callSubmit( 1 , new Object[]{ AV72JobId,AV26EmprCod,AV61UsurCod });
   }

   public void S132( )
   {
      /* 'LOADCOMBOLISTPRINTER' Routine */
      returnInSub = false ;
      if ( ! (GXutil.strcmp("", AV65WWPContext.getgxTv_SdtWWPContext_Usurprint())==0) )
      {
         AV41ListPrinter_Data_Item = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV41ListPrinter_Data_Item.setgxTv_SdtDVB_SDTComboData_Item_Id( AV65WWPContext.getgxTv_SdtWWPContext_Usurprint() );
         AV41ListPrinter_Data_Item.setgxTv_SdtDVB_SDTComboData_Item_Title( AV65WWPContext.getgxTv_SdtWWPContext_Usurprint() );
         AV40ListPrinter_Data.add(AV41ListPrinter_Data_Item, 0);
      }
      /* Execute user subroutine: 'LOADPRINTERFROMSERVER' */
      S232 ();
      if (returnInSub) return;
      AV40ListPrinter_Data.sort("Title");
      Combo_listprinter_Selectedvalue_set = AV39ListPrinter ;
      ucCombo_listprinter.sendProperty(context, "", false, Combo_listprinter_Internalname, "SelectedValue_set", Combo_listprinter_Selectedvalue_set);
   }

   public void S122( )
   {
      /* 'LOADCOMBOCLICODTO' Routine */
      returnInSub = false ;
      /* Using cursor H02BU7 */
      pr_default.execute(5);
      while ( (pr_default.getStatus(5) != 101) )
      {
         A10045CliAct = H02BU7_A10045CliAct[0] ;
         A279CliNom = H02BU7_A279CliNom[0] ;
         A252CliCod = H02BU7_A252CliCod[0] ;
         A13735CliCNom = GXutil.trim( GXutil.str( A252CliCod, 6, 0)) + "-" + GXutil.trim( A279CliNom) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13735CliCNom", A13735CliCNom);
         AV20Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV20Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV20Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV17CliCodto_Data.add(AV20Combo_DataItem, 0);
         pr_default.readNext(5);
      }
      pr_default.close(5);
      Combo_clicodto_Selectedvalue_set = ((0==AV16CliCodto) ? "" : GXutil.trim( GXutil.str( AV16CliCodto, 6, 0))) ;
      ucCombo_clicodto.sendProperty(context, "", false, Combo_clicodto_Internalname, "SelectedValue_set", Combo_clicodto_Selectedvalue_set);
      AV17CliCodto_Data.sort("Title");
      Combo_clicodto_Selectedvalue_set = ((0==AV16CliCodto) ? "" : GXutil.trim( GXutil.str( AV16CliCodto, 6, 0))) ;
      ucCombo_clicodto.sendProperty(context, "", false, Combo_clicodto_Internalname, "SelectedValue_set", Combo_clicodto_Selectedvalue_set);
   }

   public void S112( )
   {
      /* 'LOADCOMBOCLICODFROM' Routine */
      returnInSub = false ;
      /* Using cursor H02BU8 */
      pr_default.execute(6);
      while ( (pr_default.getStatus(6) != 101) )
      {
         A10045CliAct = H02BU8_A10045CliAct[0] ;
         A279CliNom = H02BU8_A279CliNom[0] ;
         A252CliCod = H02BU8_A252CliCod[0] ;
         A13735CliCNom = GXutil.trim( GXutil.str( A252CliCod, 6, 0)) + "-" + GXutil.trim( A279CliNom) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13735CliCNom", A13735CliCNom);
         AV20Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV20Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV20Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV15CliCodfrom_Data.add(AV20Combo_DataItem, 0);
         pr_default.readNext(6);
      }
      pr_default.close(6);
      Combo_clicodfrom_Selectedvalue_set = ((0==AV14CliCodfrom) ? "" : GXutil.trim( GXutil.str( AV14CliCodfrom, 6, 0))) ;
      ucCombo_clicodfrom.sendProperty(context, "", false, Combo_clicodfrom_Internalname, "SelectedValue_set", Combo_clicodfrom_Selectedvalue_set);
      AV15CliCodfrom_Data.sort("Title");
      Combo_clicodfrom_Selectedvalue_set = ((0==AV14CliCodfrom) ? "" : GXutil.trim( GXutil.str( AV14CliCodfrom, 6, 0))) ;
      ucCombo_clicodfrom.sendProperty(context, "", false, Combo_clicodfrom_Internalname, "SelectedValue_set", Combo_clicodfrom_Selectedvalue_set);
   }

   public void e252BU2( )
   {
      /* Run_Click Routine */
      returnInSub = false ;
      callSubmit( 2 , new Object[]{ A14423JobId,AV26EmprCod,AV61UsurCod });
      /*  Sending Event outputs  */
   }

   public void e262BU2( )
   {
      /* Listjobgrid_Refresh Routine */
      returnInSub = false ;
      AV120i = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV120i", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV120i), 4, 0));
      /* Start For Each Line in Listjobgrid */
      nRC_GXsfl_139 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_139"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_139_fel_idx = 0 ;
      while ( nGXsfl_139_fel_idx < nRC_GXsfl_139 )
      {
         nGXsfl_139_fel_idx = ((subListjobgrid_Islastpage==1)&&(nGXsfl_139_fel_idx+1>sublistjobgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_139_fel_idx+1) ;
         sGXsfl_139_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_139_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_1392( ) ;
         cmbavGridactiongroup1.setName( cmbavGridactiongroup1.getInternalname() );
         cmbavGridactiongroup1.setValue( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()) );
         AV110GridActionGroup1 = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()))) ;
         AV109DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
         A14423JobId = GXutil.strToGuid(httpContext.cgiGet( edtJobId_Internalname)) ;
         AV118JobDescWithTags = httpContext.cgiGet( edtavJobdescwithtags_Internalname) ;
         A14485JobDesc = httpContext.cgiGet( edtJobDesc_Internalname) ;
         n14485JobDesc = false ;
         A14424JobType = httpContext.cgiGet( edtJobType_Internalname) ;
         n14424JobType = false ;
         A14457OkItem = localUtil.ctol( httpContext.cgiGet( edtOkItem_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         n14457OkItem = false ;
         A14458ErItem = localUtil.ctol( httpContext.cgiGet( edtErItem_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         n14458ErItem = false ;
         A14456PrcItem = localUtil.ctol( httpContext.cgiGet( edtPrcItem_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         n14456PrcItem = false ;
         A14459PrgPct = (short)(localUtil.ctol( httpContext.cgiGet( edtPrgPct_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n14459PrgPct = false ;
         A14455TotItem = localUtil.ctol( httpContext.cgiGet( edtTotItem_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         n14455TotItem = false ;
         cmbJobStat.setName( cmbJobStat.getInternalname() );
         cmbJobStat.setValue( httpContext.cgiGet( cmbJobStat.getInternalname()) );
         A14450JobStat = httpContext.cgiGet( cmbJobStat.getInternalname()) ;
         n14450JobStat = false ;
         A14463ZipPath = httpContext.cgiGet( edtZipPath_Internalname) ;
         n14463ZipPath = false ;
         A14464ZipUrl = httpContext.cgiGet( edtZipUrl_Internalname) ;
         n14464ZipUrl = false ;
         AV111Run = httpContext.cgiGet( edtavRun_Internalname) ;
         AV121Row = httpContext.cgiGet( edtavRow_Internalname) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPrgpct_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPrgpct_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPRGPCT");
            GX_FocusControl = edtavPrgpct_Internalname ;
            wbErr = true ;
            AV122PrgPct = (short)(0) ;
         }
         else
         {
            AV122PrgPct = (short)(localUtil.ctol( httpContext.cgiGet( edtavPrgpct_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         AV120i = (short)(AV120i+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV120i", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV120i), 4, 0));
         AV121Row = GXutil.format( "%1%2", httpContext.getMessage( "span_PRGPCT_", ""), GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV120i), "9999")), "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_attri("", false, edtavRow_Internalname, AV121Row);
         this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "SetProgress", "", new Object[] {AV121Row,GXutil.str( AV122PrgPct, 3, 0),"100"});
         /* End For Each Line */
      }
      if ( nGXsfl_139_fel_idx == 0 )
      {
         nGXsfl_139_idx = 1 ;
         sGXsfl_139_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_139_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1392( ) ;
      }
      nGXsfl_139_fel_idx = 1 ;
      /*  Sending Event outputs  */
   }

   public void e202BU2( )
   {
      /* Onmessage_gx1 Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV113NotificationInfo.getgxTv_SdtNotificationInfo_Message(), "DONE") == 0 )
      {
         gxgrlistjobgrid_refresh( subListjobgrid_Rows, AV122PrgPct, AV120i, AV64VerSumLin, AV42Mail, AV43ManAut, AV45Opi, AV63VerMail, AV49PRIO, AV97PATHTEMP, AV30FacCodfrom, AV47PATHPDF, AV145Pgmname) ;
         AV114Async_JobId = GXutil.strToGuid(AV113NotificationInfo.getgxTv_SdtNotificationInfo_Id()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV114Async_JobId", AV114Async_JobId.toString());
         GXt_char2 = AV116PARM_OPT ;
         GXv_char5[0] = GXt_char2 ;
         new app.asyncbatch.getjobpar(remoteHandle, context).execute( AV114Async_JobId, "OPI", GXv_char5) ;
         generarjobfactura_impl.this.GXt_char2 = GXv_char5[0] ;
         AV116PARM_OPT = GXt_char2 ;
         if ( GXutil.strcmp(AV116PARM_OPT, "S") == 0 )
         {
            /* Execute user subroutine: 'PREVIEWASYNC' */
            S202 ();
            if (returnInSub) return;
         }
         else
         {
            if ( (GXutil.strcmp("", AV39ListPrinter)==0) )
            {
               GXt_char2 = AV39ListPrinter ;
               GXv_char5[0] = GXt_char2 ;
               new app.asyncbatch.getjobpar(remoteHandle, context).execute( AV114Async_JobId, "LISTPRINTER", GXv_char5) ;
               generarjobfactura_impl.this.GXt_char2 = GXv_char5[0] ;
               AV39ListPrinter = GXt_char2 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV39ListPrinter", AV39ListPrinter);
            }
            if ( ! (GXutil.strcmp("", AV39ListPrinter)==0) )
            {
               /* Execute user subroutine: 'PRINTER' */
               S212 ();
               if (returnInSub) return;
            }
            else
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Impressora no localizada !", ""));
            }
         }
      }
      if ( GXutil.strcmp(AV113NotificationInfo.getgxTv_SdtNotificationInfo_Message(), "PROGRESS") == 0 )
      {
         gxgrlistjobgrid_refresh( subListjobgrid_Rows, AV122PrgPct, AV120i, AV64VerSumLin, AV42Mail, AV43ManAut, AV45Opi, AV63VerMail, AV49PRIO, AV97PATHTEMP, AV30FacCodfrom, AV47PATHPDF, AV145Pgmname) ;
      }
      /*  Sending Event outputs  */
   }

   public void e192BU2( )
   {
      /* Faccodfrom_Isvalid Routine */
      returnInSub = false ;
      AV31FacCodto = AV30FacCodfrom ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31FacCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31FacCodto), 8, 0));
      if ( AV30FacCodfrom > 0 )
      {
         AV34FacFchfrom = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34FacFchfrom", localUtil.format(AV34FacFchfrom, "99/99/99"));
         AV35FacFchto = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35FacFchto", localUtil.format(AV35FacFchto, "99/99/99"));
      }
      /*  Sending Event outputs  */
   }

   public void S224( )
   {
      /* 'BUSCARDADOSFACTURA' Routine */
      returnInSub = false ;
      /* Using cursor H02BU9 */
      pr_default.execute(7, new Object[] {Integer.valueOf(AV128FacCod)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A396EmprCod = H02BU9_A396EmprCod[0] ;
         A430FacCod = H02BU9_A430FacCod[0] ;
         A436FacFch = H02BU9_A436FacFch[0] ;
         A252CliCod = H02BU9_A252CliCod[0] ;
         A279CliNom = H02BU9_A279CliNom[0] ;
         A10050Cliemf = H02BU9_A10050Cliemf[0] ;
         A14420FacEnvMail = H02BU9_A14420FacEnvMail[0] ;
         A279CliNom = H02BU9_A279CliNom[0] ;
         A10050Cliemf = H02BU9_A10050Cliemf[0] ;
         AV129FacFch = A436FacFch ;
         httpContext.ajax_rsp_assign_attri("", false, "AV129FacFch", localUtil.format(AV129FacFch, "99/99/99"));
         AV133CliCod = A252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV133CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV133CliCod), 6, 0));
         AV132CliNom = A279CliNom ;
         httpContext.ajax_rsp_assign_attri("", false, "AV132CliNom", AV132CliNom);
         AV127Cliemf = A10050Cliemf ;
         httpContext.ajax_rsp_assign_attri("", false, "AV127Cliemf", AV127Cliemf);
         AV131FacEnvMail = A14420FacEnvMail ;
         pr_default.readNext(7);
      }
      pr_default.close(7);
   }

   public void S202( )
   {
      /* 'PREVIEWASYNC' Routine */
      returnInSub = false ;
      /* Using cursor H02BU10 */
      pr_default.execute(8, new Object[] {AV114Async_JobId});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A14423JobId = H02BU10_A14423JobId[0] ;
         A14464ZipUrl = H02BU10_A14464ZipUrl[0] ;
         n14464ZipUrl = H02BU10_n14464ZipUrl[0] ;
         AV117ZipUrl = A14464ZipUrl ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(8);
      if ( ! (GXutil.strcmp("", AV117ZipUrl)==0) )
      {
         this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "windows", "", new Object[] {AV117ZipUrl,"_blank"});
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Documento no encontrado!", ""));
      }
   }

   public void S232( )
   {
      /* 'LOADPRINTERFROMSERVER' Routine */
      returnInSub = false ;
      AV57STR_SDTListPrinter = AV5AppTool.listprinter() ;
      if ( AV92SDTListPrinter.fromJSonString(AV57STR_SDTListPrinter, AV94Messages) )
      {
         AV155GXV1 = 1 ;
         while ( AV155GXV1 <= AV92SDTListPrinter.size() )
         {
            AV93SDTListPrinter_item = (app.SdtSDTListPrinter_SDTListPrinterItem)((app.SdtSDTListPrinter_SDTListPrinterItem)AV92SDTListPrinter.elementAt(-1+AV155GXV1));
            if ( GXutil.strcmp(AV65WWPContext.getgxTv_SdtWWPContext_Usurprint(), AV93SDTListPrinter_item.getgxTv_SdtSDTListPrinter_SDTListPrinterItem_Name()) != 0 )
            {
               AV41ListPrinter_Data_Item = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
               AV41ListPrinter_Data_Item.setgxTv_SdtDVB_SDTComboData_Item_Id( AV93SDTListPrinter_item.getgxTv_SdtSDTListPrinter_SDTListPrinterItem_Name() );
               AV41ListPrinter_Data_Item.setgxTv_SdtDVB_SDTComboData_Item_Title( AV93SDTListPrinter_item.getgxTv_SdtSDTListPrinter_SDTListPrinterItem_Name() );
               AV40ListPrinter_Data.add(AV41ListPrinter_Data_Item, 0);
            }
            AV155GXV1 = (int)(AV155GXV1+1) ;
         }
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Ninguna impressora localizada", ""));
      }
   }

   public void S212( )
   {
      /* 'PRINTER' Routine */
      returnInSub = false ;
      /* Using cursor H02BU11 */
      pr_default.execute(9, new Object[] {AV114Async_JobId});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A14423JobId = H02BU11_A14423JobId[0] ;
         A14463ZipPath = H02BU11_A14463ZipPath[0] ;
         n14463ZipPath = H02BU11_n14463ZipPath[0] ;
         AV115ZipPath = A14463ZipPath ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).info(httpContext.getMessage( "Starting print file to :", "")+AV39ListPrinter+httpContext.getMessage( "Doc:", "")+AV115ZipPath, AV145Pgmname) ;
      GXt_char2 = AV39ListPrinter ;
      GXv_char5[0] = GXt_char2 ;
      new app.asyncbatch.getjobpar(remoteHandle, context).execute( AV114Async_JobId, "LISTPRINTER", GXv_char5) ;
      generarjobfactura_impl.this.GXt_char2 = GXv_char5[0] ;
      AV39ListPrinter = GXt_char2 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39ListPrinter", AV39ListPrinter);
      AV112Aviso = AV5AppTool.printto(AV115ZipPath, AV39ListPrinter, (byte)(1), true, false) ;
      httpContext.GX_msglist.addItem(AV112Aviso);
   }

   public void wb_table2_193_2BU2( boolean wbgen )
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
         wb_table2_193_2BU2e( true) ;
      }
      else
      {
         wb_table2_193_2BU2e( false) ;
      }
   }

   public void wb_table1_188_2BU2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_deleted_Internalname, tblTabledvelop_confirmpanel_deleted_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_deleted.setProperty("Title", Dvelop_confirmpanel_deleted_Title);
         ucDvelop_confirmpanel_deleted.setProperty("ConfirmationText", Dvelop_confirmpanel_deleted_Confirmationtext);
         ucDvelop_confirmpanel_deleted.setProperty("YesButtonCaption", Dvelop_confirmpanel_deleted_Yesbuttoncaption);
         ucDvelop_confirmpanel_deleted.setProperty("NoButtonCaption", Dvelop_confirmpanel_deleted_Nobuttoncaption);
         ucDvelop_confirmpanel_deleted.setProperty("CancelButtonCaption", Dvelop_confirmpanel_deleted_Cancelbuttoncaption);
         ucDvelop_confirmpanel_deleted.setProperty("YesButtonPosition", Dvelop_confirmpanel_deleted_Yesbuttonposition);
         ucDvelop_confirmpanel_deleted.setProperty("ConfirmType", Dvelop_confirmpanel_deleted_Confirmtype);
         ucDvelop_confirmpanel_deleted.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_deleted_Internalname, "DVELOP_CONFIRMPANEL_DELETEDContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_DELETEDContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_188_2BU2e( true) ;
      }
      else
      {
         wb_table1_188_2BU2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV30FacCodfrom = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30FacCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30FacCodfrom), 8, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFACCODFROM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV30FacCodfrom), "ZZZZZZZ9")));
      AV14CliCodfrom = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14CliCodfrom), 6, 0));
      AV34FacFchfrom = (java.util.Date)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34FacFchfrom", localUtil.format(AV34FacFchfrom, "99/99/99"));
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
      pa2BU2( ) ;
      ws2BU2( ) ;
      we2BU2( ) ;
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
      httpContext.AddStyleSheetFile("GXProgressIndicator/css/bootstrap-progressbar-3.0.1.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Listjobgrid_dwc == null ) )
      {
         if ( GXutil.len( WebComp_Listjobgrid_dwc_Component) != 0 )
         {
            WebComp_Listjobgrid_dwc.componentthemes();
         }
      }
      if ( ! ( WebComp_Wwpaux_wc == null ) )
      {
         if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
         {
            WebComp_Wwpaux_wc.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202692314494434", true, true);
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
      httpContext.AddJavascriptSource("facturacion/generarjobfactura.js", "?202692314494434", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Popover/WWPPopoverRender.js", "", false, true);
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

   public void subsflControlProps_1392( )
   {
      cmbavGridactiongroup1.setInternalname( "vGRIDACTIONGROUP1_"+sGXsfl_139_idx );
      edtavDetailwebcomponent_Internalname = "vDETAILWEBCOMPONENT_"+sGXsfl_139_idx ;
      edtJobId_Internalname = "JOBID_"+sGXsfl_139_idx ;
      edtavJobdescwithtags_Internalname = "vJOBDESCWITHTAGS_"+sGXsfl_139_idx ;
      edtJobDesc_Internalname = "JOBDESC_"+sGXsfl_139_idx ;
      edtJobType_Internalname = "JOBTYPE_"+sGXsfl_139_idx ;
      edtOkItem_Internalname = "OKITEM_"+sGXsfl_139_idx ;
      edtErItem_Internalname = "ERITEM_"+sGXsfl_139_idx ;
      edtPrcItem_Internalname = "PRCITEM_"+sGXsfl_139_idx ;
      edtPrgPct_Internalname = "PRGPCT_"+sGXsfl_139_idx ;
      edtTotItem_Internalname = "TOTITEM_"+sGXsfl_139_idx ;
      cmbJobStat.setInternalname( "JOBSTAT_"+sGXsfl_139_idx );
      edtZipPath_Internalname = "ZIPPATH_"+sGXsfl_139_idx ;
      edtZipUrl_Internalname = "ZIPURL_"+sGXsfl_139_idx ;
      edtavRun_Internalname = "vRUN_"+sGXsfl_139_idx ;
      edtavRow_Internalname = "vROW_"+sGXsfl_139_idx ;
      edtavPrgpct_Internalname = "vPRGPCT_"+sGXsfl_139_idx ;
   }

   public void subsflControlProps_fel_1392( )
   {
      cmbavGridactiongroup1.setInternalname( "vGRIDACTIONGROUP1_"+sGXsfl_139_fel_idx );
      edtavDetailwebcomponent_Internalname = "vDETAILWEBCOMPONENT_"+sGXsfl_139_fel_idx ;
      edtJobId_Internalname = "JOBID_"+sGXsfl_139_fel_idx ;
      edtavJobdescwithtags_Internalname = "vJOBDESCWITHTAGS_"+sGXsfl_139_fel_idx ;
      edtJobDesc_Internalname = "JOBDESC_"+sGXsfl_139_fel_idx ;
      edtJobType_Internalname = "JOBTYPE_"+sGXsfl_139_fel_idx ;
      edtOkItem_Internalname = "OKITEM_"+sGXsfl_139_fel_idx ;
      edtErItem_Internalname = "ERITEM_"+sGXsfl_139_fel_idx ;
      edtPrcItem_Internalname = "PRCITEM_"+sGXsfl_139_fel_idx ;
      edtPrgPct_Internalname = "PRGPCT_"+sGXsfl_139_fel_idx ;
      edtTotItem_Internalname = "TOTITEM_"+sGXsfl_139_fel_idx ;
      cmbJobStat.setInternalname( "JOBSTAT_"+sGXsfl_139_fel_idx );
      edtZipPath_Internalname = "ZIPPATH_"+sGXsfl_139_fel_idx ;
      edtZipUrl_Internalname = "ZIPURL_"+sGXsfl_139_fel_idx ;
      edtavRun_Internalname = "vRUN_"+sGXsfl_139_fel_idx ;
      edtavRow_Internalname = "vROW_"+sGXsfl_139_fel_idx ;
      edtavPrgpct_Internalname = "vPRGPCT_"+sGXsfl_139_fel_idx ;
   }

   public void sendrow_1392( )
   {
      subsflControlProps_1392( ) ;
      wb2BU0( ) ;
      if ( ( subListjobgrid_Rows * 1 == 0 ) || ( nGXsfl_139_idx <= sublistjobgrid_fnc_recordsperpage( ) * 1 ) )
      {
         ListjobgridRow = GXWebRow.GetNew(context,ListjobgridContainer) ;
         if ( subListjobgrid_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subListjobgrid_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subListjobgrid_Class, "") != 0 )
            {
               subListjobgrid_Linesclass = subListjobgrid_Class+"Odd" ;
            }
         }
         else if ( subListjobgrid_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subListjobgrid_Backstyle = (byte)(0) ;
            subListjobgrid_Backcolor = subListjobgrid_Allbackcolor ;
            if ( GXutil.strcmp(subListjobgrid_Class, "") != 0 )
            {
               subListjobgrid_Linesclass = subListjobgrid_Class+"Uniform" ;
            }
         }
         else if ( subListjobgrid_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subListjobgrid_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subListjobgrid_Class, "") != 0 )
            {
               subListjobgrid_Linesclass = subListjobgrid_Class+"Odd" ;
            }
            subListjobgrid_Backcolor = (int)(0x0) ;
         }
         else if ( subListjobgrid_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subListjobgrid_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_139_idx) % (2))) == 0 )
            {
               subListjobgrid_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subListjobgrid_Class, "") != 0 )
               {
                  subListjobgrid_Linesclass = subListjobgrid_Class+"Even" ;
               }
            }
            else
            {
               subListjobgrid_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subListjobgrid_Class, "") != 0 )
               {
                  subListjobgrid_Linesclass = subListjobgrid_Class+"Odd" ;
               }
            }
         }
         if ( ListjobgridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_139_idx+"\">") ;
         }
         /* Subfile cell */
         if ( ListjobgridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 140,'',false,'"+sGXsfl_139_idx+"',139)\"" : " ") ;
         if ( ( cmbavGridactiongroup1.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_139_idx ;
            cmbavGridactiongroup1.setName( GXCCtl );
            cmbavGridactiongroup1.setWebtags( "" );
            if ( cmbavGridactiongroup1.getItemCount() > 0 )
            {
               AV110GridActionGroup1 = (short)(GXutil.lval( cmbavGridactiongroup1.getValidValue(GXutil.trim( GXutil.str( AV110GridActionGroup1, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV110GridActionGroup1), 4, 0));
            }
         }
         /* ComboBox */
         ListjobgridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactiongroup1,cmbavGridactiongroup1.getInternalname(),GXutil.trim( GXutil.str( AV110GridActionGroup1, 4, 0)),Integer.valueOf(1),cmbavGridactiongroup1.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONGROUP1.CLICK."+sGXsfl_139_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,140);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV110GridActionGroup1, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), !bGXsfl_139_Refreshing);
         /* Subfile cell */
         if ( ListjobgridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 141,'',false,'"+sGXsfl_139_idx+"',139)\"" : " ") ;
         ROClassString = "Attribute" ;
         ListjobgridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDetailwebcomponent_Internalname,GXutil.rtrim( AV109DetailWebComponent),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,141);\"" : " "),"'"+""+"'"+",false,"+"'"+"e272bu2_client"+"'","","","","",edtavDetailwebcomponent_Jsonclick,Integer.valueOf(7),"Attribute","",ROClassString,"WWIconActionColumn WCD_ActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDetailwebcomponent_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(139),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( ListjobgridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         ListjobgridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtJobId_Internalname,A14423JobId.toString(),A14423JobId.toString(),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtJobId_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(139),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Boolean.valueOf(true),"","",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( ListjobgridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavJobdescwithtags_Enabled!=0)&&(edtavJobdescwithtags_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 143,'',false,'"+sGXsfl_139_idx+"',139)\"" : " ") ;
         ROClassString = "Attribute" ;
         ListjobgridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavJobdescwithtags_Internalname,AV118JobDescWithTags,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavJobdescwithtags_Enabled!=0)&&(edtavJobdescwithtags_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,143);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavJobdescwithtags_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavJobdescwithtags_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(139),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( ListjobgridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         ListjobgridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtJobDesc_Internalname,A14485JobDesc,"","","'"+""+"'"+",false,"+"'"+"e282bu2_client"+"'","","","","",edtJobDesc_Jsonclick,Integer.valueOf(7),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(139),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( ListjobgridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         ListjobgridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtJobType_Internalname,A14424JobType,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtJobType_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(139),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( ListjobgridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         ListjobgridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOkItem_Internalname,GXutil.ltrim( localUtil.ntoc( A14457OkItem, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14457OkItem), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOkItem_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(139),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( ListjobgridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         ListjobgridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtErItem_Internalname,GXutil.ltrim( localUtil.ntoc( A14458ErItem, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14458ErItem), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtErItem_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(139),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( ListjobgridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         ListjobgridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrcItem_Internalname,GXutil.ltrim( localUtil.ntoc( A14456PrcItem, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14456PrcItem), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrcItem_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(139),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( ListjobgridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         ListjobgridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrgPct_Internalname,GXutil.ltrim( localUtil.ntoc( A14459PrgPct, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14459PrgPct), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrgPct_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(100),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(139),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( ListjobgridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         ListjobgridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTotItem_Internalname,GXutil.ltrim( localUtil.ntoc( A14455TotItem, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14455TotItem), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTotItem_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(139),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( ListjobgridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         if ( ( cmbJobStat.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "JOBSTAT_" + sGXsfl_139_idx ;
            cmbJobStat.setName( GXCCtl );
            cmbJobStat.setWebtags( "" );
            cmbJobStat.addItem("WAINTING", httpContext.getMessage( "Aguarde", ""), (short)(0));
            cmbJobStat.addItem("PROCESSING", httpContext.getMessage( "Processando", ""), (short)(0));
            cmbJobStat.addItem("SUCCESS", httpContext.getMessage( "Sucesso", ""), (short)(0));
            cmbJobStat.addItem("ERROR", httpContext.getMessage( "Error", ""), (short)(0));
            cmbJobStat.addItem("DONE", httpContext.getMessage( "Finalizado", ""), (short)(0));
            cmbJobStat.addItem("DONE_ERR", httpContext.getMessage( "Finalizado con errors", ""), (short)(0));
            if ( cmbJobStat.getItemCount() > 0 )
            {
               A14450JobStat = cmbJobStat.getValidValue(A14450JobStat) ;
               n14450JobStat = false ;
            }
         }
         /* ComboBox */
         ListjobgridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbJobStat,cmbJobStat.getInternalname(),GXutil.rtrim( A14450JobStat),Integer.valueOf(1),cmbJobStat.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","svchar","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbJobStat.setValue( GXutil.rtrim( A14450JobStat) );
         httpContext.ajax_rsp_assign_prop("", false, cmbJobStat.getInternalname(), "Values", cmbJobStat.ToJavascriptSource(), !bGXsfl_139_Refreshing);
         /* Subfile cell */
         if ( ListjobgridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         ListjobgridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtZipPath_Internalname,A14463ZipPath,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtZipPath_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(200),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(139),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( ListjobgridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         ListjobgridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtZipUrl_Internalname,A14464ZipUrl,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtZipUrl_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(200),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(139),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( ListjobgridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavRun_Enabled!=0)&&(edtavRun_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 154,'',false,'"+sGXsfl_139_idx+"',139)\"" : " ") ;
         ROClassString = edtavRun_Class ;
         ListjobgridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRun_Internalname,GXutil.rtrim( AV111Run),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavRun_Enabled!=0)&&(edtavRun_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,154);\"" : " "),"'"+""+"'"+",false,"+"'"+"EVRUN.CLICK."+sGXsfl_139_idx+"'","","",httpContext.getMessage( "Generar Facturas", ""),"",edtavRun_Jsonclick,Integer.valueOf(5),edtavRun_Class,"",ROClassString,"WWIconActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavRun_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(139),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( ListjobgridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavRow_Enabled!=0)&&(edtavRow_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 155,'',false,'"+sGXsfl_139_idx+"',139)\"" : " ") ;
         ROClassString = "Attribute" ;
         ListjobgridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRow_Internalname,AV121Row,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavRow_Enabled!=0)&&(edtavRow_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,155);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavRow_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavRow_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(139),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( ListjobgridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPrgpct_Enabled!=0)&&(edtavPrgpct_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 156,'',false,'"+sGXsfl_139_idx+"',139)\"" : " ") ;
         ROClassString = "Attribute" ;
         ListjobgridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrgpct_Internalname,GXutil.ltrim( localUtil.ntoc( AV122PrgPct, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrgpct_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV122PrgPct), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV122PrgPct), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavPrgpct_Enabled!=0)&&(edtavPrgpct_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,156);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPrgpct_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavPrgpct_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(139),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes2BU2( ) ;
         ListjobgridContainer.AddRow(ListjobgridRow);
         nGXsfl_139_idx = ((subListjobgrid_Islastpage==1)&&(nGXsfl_139_idx+1>sublistjobgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_139_idx+1) ;
         sGXsfl_139_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_139_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1392( ) ;
      }
      /* End function sendrow_1392 */
   }

   public void startgridcontrol139( )
   {
      if ( ListjobgridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"ListjobgridContainer"+"DivS\" data-gxgridid=\"139\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subListjobgrid_Internalname, subListjobgrid_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subListjobgrid_Backcolorstyle == 0 )
         {
            subListjobgrid_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subListjobgrid_Class) > 0 )
            {
               subListjobgrid_Linesclass = subListjobgrid_Class+"Title" ;
            }
         }
         else
         {
            subListjobgrid_Titlebackstyle = (byte)(1) ;
            if ( subListjobgrid_Backcolorstyle == 1 )
            {
               subListjobgrid_Titlebackcolor = subListjobgrid_Allbackcolor ;
               if ( GXutil.len( subListjobgrid_Class) > 0 )
               {
                  subListjobgrid_Linesclass = subListjobgrid_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subListjobgrid_Class) > 0 )
               {
                  subListjobgrid_Linesclass = subListjobgrid_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ConvertToDDO"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Job", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Type", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Success", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Error", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Procesado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrimstr( DecimalUtil.doubleToDec(100), 4, 0)+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Progress", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Total", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Situacion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Zip Path", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Url Zip", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+edtavRun_Class+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Progress", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         ListjobgridContainer.AddObjectProperty("GridName", "Listjobgrid");
      }
      else
      {
         if ( isAjaxCallMode( ) )
         {
            ListjobgridContainer = new com.genexus.webpanels.GXWebGrid(context);
         }
         else
         {
            ListjobgridContainer.Clear();
         }
         ListjobgridContainer.SetWrapped(nGXWrapped);
         ListjobgridContainer.AddObjectProperty("GridName", "Listjobgrid");
         ListjobgridContainer.AddObjectProperty("Header", subListjobgrid_Header);
         ListjobgridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         ListjobgridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         ListjobgridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         ListjobgridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subListjobgrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         ListjobgridContainer.AddObjectProperty("CmpContext", "");
         ListjobgridContainer.AddObjectProperty("InMasterPage", "false");
         ListjobgridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         ListjobgridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV110GridActionGroup1, (byte)(4), (byte)(0), ".", "")));
         ListjobgridContainer.AddColumnProperties(ListjobgridColumn);
         ListjobgridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         ListjobgridColumn.AddObjectProperty("Value", GXutil.rtrim( AV109DetailWebComponent));
         ListjobgridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDetailwebcomponent_Enabled, (byte)(5), (byte)(0), ".", "")));
         ListjobgridContainer.AddColumnProperties(ListjobgridColumn);
         ListjobgridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         ListjobgridColumn.AddObjectProperty("Value", A14423JobId.toString());
         ListjobgridContainer.AddColumnProperties(ListjobgridColumn);
         ListjobgridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         ListjobgridColumn.AddObjectProperty("Value", AV118JobDescWithTags);
         ListjobgridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavJobdescwithtags_Enabled, (byte)(5), (byte)(0), ".", "")));
         ListjobgridContainer.AddColumnProperties(ListjobgridColumn);
         ListjobgridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         ListjobgridColumn.AddObjectProperty("Value", A14485JobDesc);
         ListjobgridContainer.AddColumnProperties(ListjobgridColumn);
         ListjobgridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         ListjobgridColumn.AddObjectProperty("Value", A14424JobType);
         ListjobgridContainer.AddColumnProperties(ListjobgridColumn);
         ListjobgridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         ListjobgridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14457OkItem, (byte)(10), (byte)(0), ".", "")));
         ListjobgridContainer.AddColumnProperties(ListjobgridColumn);
         ListjobgridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         ListjobgridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14458ErItem, (byte)(10), (byte)(0), ".", "")));
         ListjobgridContainer.AddColumnProperties(ListjobgridColumn);
         ListjobgridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         ListjobgridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14456PrcItem, (byte)(10), (byte)(0), ".", "")));
         ListjobgridContainer.AddColumnProperties(ListjobgridColumn);
         ListjobgridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         ListjobgridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14459PrgPct, (byte)(3), (byte)(0), ".", "")));
         ListjobgridContainer.AddColumnProperties(ListjobgridColumn);
         ListjobgridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         ListjobgridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14455TotItem, (byte)(10), (byte)(0), ".", "")));
         ListjobgridContainer.AddColumnProperties(ListjobgridColumn);
         ListjobgridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         ListjobgridColumn.AddObjectProperty("Value", A14450JobStat);
         ListjobgridContainer.AddColumnProperties(ListjobgridColumn);
         ListjobgridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         ListjobgridColumn.AddObjectProperty("Value", A14463ZipPath);
         ListjobgridContainer.AddColumnProperties(ListjobgridColumn);
         ListjobgridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         ListjobgridColumn.AddObjectProperty("Value", A14464ZipUrl);
         ListjobgridContainer.AddColumnProperties(ListjobgridColumn);
         ListjobgridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         ListjobgridColumn.AddObjectProperty("Value", GXutil.rtrim( AV111Run));
         ListjobgridColumn.AddObjectProperty("Class", GXutil.rtrim( edtavRun_Class));
         ListjobgridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRun_Enabled, (byte)(5), (byte)(0), ".", "")));
         ListjobgridContainer.AddColumnProperties(ListjobgridColumn);
         ListjobgridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         ListjobgridColumn.AddObjectProperty("Value", AV121Row);
         ListjobgridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRow_Enabled, (byte)(5), (byte)(0), ".", "")));
         ListjobgridContainer.AddColumnProperties(ListjobgridColumn);
         ListjobgridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         ListjobgridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV122PrgPct, (byte)(3), (byte)(0), ".", "")));
         ListjobgridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrgpct_Enabled, (byte)(5), (byte)(0), ".", "")));
         ListjobgridContainer.AddColumnProperties(ListjobgridColumn);
         ListjobgridContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subListjobgrid_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         ListjobgridContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subListjobgrid_Allowselection, (byte)(1), (byte)(0), ".", "")));
         ListjobgridContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subListjobgrid_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         ListjobgridContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subListjobgrid_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         ListjobgridContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subListjobgrid_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         ListjobgridContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subListjobgrid_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         ListjobgridContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subListjobgrid_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      lblTextblockcombo_clicodfrom_Internalname = "TEXTBLOCKCOMBO_CLICODFROM" ;
      Combo_clicodfrom_Internalname = "COMBO_CLICODFROM" ;
      divTablesplittedclicodfrom_Internalname = "TABLESPLITTEDCLICODFROM" ;
      lblTextblockcombo_clicodto_Internalname = "TEXTBLOCKCOMBO_CLICODTO" ;
      Combo_clicodto_Internalname = "COMBO_CLICODTO" ;
      divTablesplittedclicodto_Internalname = "TABLESPLITTEDCLICODTO" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtavFacfchfrom_Internalname = "vFACFCHFROM" ;
      edtavFacfchto_Internalname = "vFACFCHTO" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtavFaccodfrom_Internalname = "vFACCODFROM" ;
      edtavFaccodto_Internalname = "vFACCODTO" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtavCopias2_Internalname = "vCOPIAS2" ;
      chkavVersumlin.setInternalname( "vVERSUMLIN" );
      cmbavF_header.setInternalname( "vF_HEADER" );
      cmbavAgr_fases.setInternalname( "vAGR_FASES" );
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      chkavMail.setInternalname( "vMAIL" );
      edtavPathpdf_Internalname = "vPATHPDF" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      chkavManaut.setInternalname( "vMANAUT" );
      chkavOpi.setInternalname( "vOPI" );
      lblTextblockcombo_listprinter_Internalname = "TEXTBLOCKCOMBO_LISTPRINTER" ;
      Combo_listprinter_Internalname = "COMBO_LISTPRINTER" ;
      divTablesplittedlistprinter_Internalname = "TABLESPLITTEDLISTPRINTER" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divTable_acciones_Internalname = "TABLE_ACCIONES" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      cmbavGridactiongroup1.setInternalname( "vGRIDACTIONGROUP1" );
      edtavDetailwebcomponent_Internalname = "vDETAILWEBCOMPONENT" ;
      edtJobId_Internalname = "JOBID" ;
      edtavJobdescwithtags_Internalname = "vJOBDESCWITHTAGS" ;
      edtJobDesc_Internalname = "JOBDESC" ;
      edtJobType_Internalname = "JOBTYPE" ;
      edtOkItem_Internalname = "OKITEM" ;
      edtErItem_Internalname = "ERITEM" ;
      edtPrcItem_Internalname = "PRCITEM" ;
      edtPrgPct_Internalname = "PRGPCT" ;
      edtTotItem_Internalname = "TOTITEM" ;
      cmbJobStat.setInternalname( "JOBSTAT" );
      edtZipPath_Internalname = "ZIPPATH" ;
      edtZipUrl_Internalname = "ZIPURL" ;
      edtavRun_Internalname = "vRUN" ;
      edtavRow_Internalname = "vROW" ;
      edtavPrgpct_Internalname = "vPRGPCT" ;
      Listjobgridpaginationbar_Internalname = "LISTJOBGRIDPAGINATIONBAR" ;
      divCell_listjobgrid_dwc_Internalname = "CELL_LISTJOBGRID_DWC" ;
      divListjobgridtablewithpaginationbar_Internalname = "LISTJOBGRIDTABLEWITHPAGINATIONBAR" ;
      divPanelwccomponent_Internalname = "PANELWCCOMPONENT" ;
      Dvpanel_panelwccomponent_Internalname = "DVPANEL_PANELWCCOMPONENT" ;
      Progressbar_Internalname = "PROGRESSBAR" ;
      divTable_progress_Internalname = "TABLE_PROGRESS" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      Innewwindowpdf_Internalname = "INNEWWINDOWPDF" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavClicodfrom_Internalname = "vCLICODFROM" ;
      edtavClicodto_Internalname = "vCLICODTO" ;
      edtavListprinter_Internalname = "vLISTPRINTER" ;
      Popover_jobdesc_Internalname = "POPOVER_JOBDESC" ;
      edtavListjobgridcurrentpage_Internalname = "vLISTJOBGRIDCURRENTPAGE" ;
      chkavVermail.setInternalname( "vVERMAIL" );
      Dvelop_confirmpanel_deleted_Internalname = "DVELOP_CONFIRMPANEL_DELETED" ;
      tblTabledvelop_confirmpanel_deleted_Internalname = "TABLEDVELOP_CONFIRMPANEL_DELETED" ;
      Dvelop_confirmpanel_enter_Internalname = "DVELOP_CONFIRMPANEL_ENTER" ;
      tblTabledvelop_confirmpanel_enter_Internalname = "TABLEDVELOP_CONFIRMPANEL_ENTER" ;
      Listjobgrid_empowerer_Internalname = "LISTJOBGRID_EMPOWERER" ;
      divDiv_wwpauxwc_Internalname = "DIV_WWPAUXWC" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subListjobgrid_Internalname = "LISTJOBGRID" ;
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
      subListjobgrid_Allowcollapsing = (byte)(0) ;
      subListjobgrid_Allowselection = (byte)(0) ;
      subListjobgrid_Header = "" ;
      edtavPrgpct_Jsonclick = "" ;
      edtavPrgpct_Visible = 0 ;
      edtavPrgpct_Enabled = 1 ;
      edtavRow_Jsonclick = "" ;
      edtavRow_Visible = 0 ;
      edtavRow_Enabled = 1 ;
      edtavRun_Jsonclick = "" ;
      edtavRun_Class = "Attribute" ;
      edtavRun_Visible = -1 ;
      edtavRun_Enabled = 1 ;
      edtZipUrl_Jsonclick = "" ;
      edtZipPath_Jsonclick = "" ;
      cmbJobStat.setJsonclick( "" );
      edtTotItem_Jsonclick = "" ;
      edtPrgPct_Jsonclick = "" ;
      edtPrcItem_Jsonclick = "" ;
      edtErItem_Jsonclick = "" ;
      edtOkItem_Jsonclick = "" ;
      edtJobType_Jsonclick = "" ;
      edtJobDesc_Jsonclick = "" ;
      edtavJobdescwithtags_Jsonclick = "" ;
      edtavJobdescwithtags_Visible = -1 ;
      edtavJobdescwithtags_Enabled = 1 ;
      edtJobId_Jsonclick = "" ;
      edtavDetailwebcomponent_Jsonclick = "" ;
      edtavDetailwebcomponent_Visible = -1 ;
      edtavDetailwebcomponent_Enabled = 1 ;
      cmbavGridactiongroup1.setJsonclick( "" );
      cmbavGridactiongroup1.setVisible( -1 );
      cmbavGridactiongroup1.setEnabled( 1 );
      subListjobgrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subListjobgrid_Backcolorstyle = (byte)(0) ;
      chkavVermail.setVisible( 1 );
      edtavListjobgridcurrentpage_Jsonclick = "" ;
      edtavListjobgridcurrentpage_Visible = 1 ;
      edtavListprinter_Jsonclick = "" ;
      edtavListprinter_Visible = 1 ;
      edtavClicodto_Jsonclick = "" ;
      edtavClicodto_Enabled = 1 ;
      edtavClicodto_Visible = 1 ;
      edtavClicodfrom_Jsonclick = "" ;
      edtavClicodfrom_Enabled = 0 ;
      edtavClicodfrom_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      divCell_listjobgrid_dwc_Class = "col-xs-12" ;
      Combo_listprinter_Caption = "" ;
      divTablesplittedlistprinter_Visible = 1 ;
      chkavOpi.setEnabled( 1 );
      chkavManaut.setEnabled( 1 );
      edtavPathpdf_Jsonclick = "" ;
      edtavPathpdf_Enabled = 1 ;
      chkavMail.setEnabled( 1 );
      cmbavAgr_fases.setJsonclick( "" );
      cmbavAgr_fases.setEnabled( 1 );
      cmbavF_header.setJsonclick( "" );
      cmbavF_header.setEnabled( 1 );
      chkavVersumlin.setEnabled( 1 );
      edtavCopias2_Jsonclick = "" ;
      edtavCopias2_Enabled = 1 ;
      edtavFaccodto_Jsonclick = "" ;
      edtavFaccodto_Enabled = 1 ;
      edtavFaccodfrom_Jsonclick = "" ;
      edtavFaccodfrom_Enabled = 0 ;
      edtavFacfchto_Jsonclick = "" ;
      edtavFacfchto_Enabled = 1 ;
      edtavFacfchfrom_Jsonclick = "" ;
      edtavFacfchfrom_Enabled = 0 ;
      Combo_clicodto_Caption = "" ;
      Combo_clicodfrom_Caption = "" ;
      Listjobgrid_empowerer_Popoversingrid = "Popover_JobDesc" ;
      Dvelop_confirmpanel_enter_Confirmtype = "1" ;
      Dvelop_confirmpanel_enter_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_enter_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_enter_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_enter_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_enter_Confirmationtext = "¿Pretende imprimir as faturas??" ;
      Dvelop_confirmpanel_enter_Title = "" ;
      Dvelop_confirmpanel_deleted_Confirmtype = "1" ;
      Dvelop_confirmpanel_deleted_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_deleted_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_deleted_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_deleted_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_deleted_Confirmationtext = "Realmente desea borrar ?" ;
      Dvelop_confirmpanel_deleted_Title = httpContext.getMessage( "Aviso", "") ;
      Popover_jobdesc_Position = "Bottom" ;
      Popover_jobdesc_Popoverwidth = 400 ;
      Popover_jobdesc_Trigger = "Click" ;
      Popover_jobdesc_Isgriditem = GXutil.toBoolean( -1) ;
      Popover_jobdesc_Iteminternalname = "" ;
      Datamonjs_Paramstr = "&JobParJson" ;
      Dvpanel_panelwccomponent_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panelwccomponent_Iconposition = "Right" ;
      Dvpanel_panelwccomponent_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panelwccomponent_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panelwccomponent_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_panelwccomponent_Title = httpContext.getMessage( "Lista", "") ;
      Dvpanel_panelwccomponent_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panelwccomponent_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panelwccomponent_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panelwccomponent_Width = "100%" ;
      Listjobgridpaginationbar_Rowsperpagecaption = "WWP_PagingRowsPerPage" ;
      Listjobgridpaginationbar_Emptygridcaption = "WWP_PagingEmptyGridCaption" ;
      Listjobgridpaginationbar_Caption = httpContext.getMessage( "WWP_PagingCaption", "") ;
      Listjobgridpaginationbar_Next = "WWP_PagingNextCaption" ;
      Listjobgridpaginationbar_Previous = "WWP_PagingPreviousCaption" ;
      Listjobgridpaginationbar_Rowsperpageoptions = "5:WWP_Rows5,10:WWP_Rows10,20:WWP_Rows20,50:WWP_Rows50" ;
      Listjobgridpaginationbar_Rowsperpageselectedvalue = 10 ;
      Listjobgridpaginationbar_Rowsperpageselector = GXutil.toBoolean( -1) ;
      Listjobgridpaginationbar_Emptygridclass = "PaginationBarEmptyGrid" ;
      Listjobgridpaginationbar_Pagingcaptionposition = "Left" ;
      Listjobgridpaginationbar_Pagingbuttonsposition = "Right" ;
      Listjobgridpaginationbar_Pagestoshow = 5 ;
      Listjobgridpaginationbar_Showlast = GXutil.toBoolean( 0) ;
      Listjobgridpaginationbar_Shownext = GXutil.toBoolean( -1) ;
      Listjobgridpaginationbar_Showprevious = GXutil.toBoolean( -1) ;
      Listjobgridpaginationbar_Showfirst = GXutil.toBoolean( 0) ;
      Listjobgridpaginationbar_Class = "PaginationBar" ;
      Dvpanel_panel_filtros_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Iconposition = "Right" ;
      Dvpanel_panel_filtros_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtros_Title = httpContext.getMessage( "<i class=\"fas fa-filter\"></i> Generar Impression de Factura", "") ;
      Dvpanel_panel_filtros_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panel_filtros_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtros_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Width = "100%" ;
      Dvpanel_panel_filtrosgenerales_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosgenerales_Iconposition = "Right" ;
      Dvpanel_panel_filtrosgenerales_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosgenerales_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosgenerales_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtrosgenerales_Title = httpContext.getMessage( "Generales", "") ;
      Dvpanel_panel_filtrosgenerales_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panel_filtrosgenerales_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtrosgenerales_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosgenerales_Width = "100%" ;
      Combo_listprinter_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_listprinter_Visible = GXutil.toBoolean( -1) ;
      Combo_listprinter_Cls = "ExtendedCombo AttributeFL" ;
      Combo_clicodto_Emptyitemtext = "Todos" ;
      Combo_clicodto_Cls = "ExtendedCombo AttributeFL" ;
      Combo_clicodfrom_Emptyitemtext = "Todos" ;
      Combo_clicodfrom_Cls = "ExtendedCombo AttributeFL" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Impresion Factura", "") );
      subListjobgrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      chkavVersumlin.setName( "vVERSUMLIN" );
      chkavVersumlin.setWebtags( "" );
      chkavVersumlin.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavVersumlin.getInternalname(), "TitleCaption", chkavVersumlin.getCaption(), true);
      chkavVersumlin.setCheckedValue( "0" );
      AV64VerSumLin = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( AV64VerSumLin, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64VerSumLin", GXutil.str( AV64VerSumLin, 1, 0));
      cmbavF_header.setName( "vF_HEADER" );
      cmbavF_header.setWebtags( "" );
      cmbavF_header.addItem("1", httpContext.getMessage( "Formato Inicial", ""), (short)(0));
      cmbavF_header.addItem("2", httpContext.getMessage( "Formato Novo", ""), (short)(0));
      if ( cmbavF_header.getItemCount() > 0 )
      {
         AV28F_header = (byte)(GXutil.lval( cmbavF_header.getValidValue(GXutil.trim( GXutil.str( AV28F_header, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28F_header", GXutil.str( AV28F_header, 1, 0));
      }
      cmbavAgr_fases.setName( "vAGR_FASES" );
      cmbavAgr_fases.setWebtags( "" );
      cmbavAgr_fases.addItem("1", httpContext.getMessage( "Agrupaçao Fases", ""), (short)(0));
      cmbavAgr_fases.addItem("2", httpContext.getMessage( "Agrupaçao + Detalle Fases ", ""), (short)(0));
      cmbavAgr_fases.addItem("3", httpContext.getMessage( "Detalle Fases", ""), (short)(0));
      if ( cmbavAgr_fases.getItemCount() > 0 )
      {
         AV11Agr_Fases = (short)(GXutil.lval( cmbavAgr_fases.getValidValue(GXutil.trim( GXutil.str( AV11Agr_Fases, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11Agr_Fases", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11Agr_Fases), 4, 0));
      }
      chkavMail.setName( "vMAIL" );
      chkavMail.setWebtags( "" );
      chkavMail.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavMail.getInternalname(), "TitleCaption", chkavMail.getCaption(), true);
      chkavMail.setCheckedValue( "N" );
      AV42Mail = ((GXutil.strcmp(GXutil.rtrim( AV42Mail), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42Mail", AV42Mail);
      chkavManaut.setName( "vMANAUT" );
      chkavManaut.setWebtags( "" );
      chkavManaut.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavManaut.getInternalname(), "TitleCaption", chkavManaut.getCaption(), true);
      chkavManaut.setCheckedValue( "M" );
      AV43ManAut = ((GXutil.strcmp(GXutil.rtrim( AV43ManAut), "A")==0) ? "A" : "M") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43ManAut", AV43ManAut);
      chkavOpi.setName( "vOPI" );
      chkavOpi.setWebtags( "" );
      chkavOpi.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavOpi.getInternalname(), "TitleCaption", chkavOpi.getCaption(), true);
      chkavOpi.setCheckedValue( "0" );
      AV45Opi = ((GXutil.strcmp(GXutil.rtrim( AV45Opi), "1")==0) ? "1" : "0") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45Opi", AV45Opi);
      GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_139_idx ;
      cmbavGridactiongroup1.setName( GXCCtl );
      cmbavGridactiongroup1.setWebtags( "" );
      if ( cmbavGridactiongroup1.getItemCount() > 0 )
      {
         AV110GridActionGroup1 = (short)(GXutil.lval( cmbavGridactiongroup1.getValidValue(GXutil.trim( GXutil.str( AV110GridActionGroup1, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV110GridActionGroup1), 4, 0));
      }
      GXCCtl = "JOBSTAT_" + sGXsfl_139_idx ;
      cmbJobStat.setName( GXCCtl );
      cmbJobStat.setWebtags( "" );
      cmbJobStat.addItem("WAINTING", httpContext.getMessage( "Aguarde", ""), (short)(0));
      cmbJobStat.addItem("PROCESSING", httpContext.getMessage( "Processando", ""), (short)(0));
      cmbJobStat.addItem("SUCCESS", httpContext.getMessage( "Sucesso", ""), (short)(0));
      cmbJobStat.addItem("ERROR", httpContext.getMessage( "Error", ""), (short)(0));
      cmbJobStat.addItem("DONE", httpContext.getMessage( "Finalizado", ""), (short)(0));
      cmbJobStat.addItem("DONE_ERR", httpContext.getMessage( "Finalizado con errors", ""), (short)(0));
      if ( cmbJobStat.getItemCount() > 0 )
      {
         A14450JobStat = cmbJobStat.getValidValue(A14450JobStat) ;
         n14450JobStat = false ;
      }
      chkavVermail.setName( "vVERMAIL" );
      chkavVermail.setWebtags( "" );
      chkavVermail.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavVermail.getInternalname(), "TitleCaption", chkavVermail.getCaption(), true);
      chkavVermail.setCheckedValue( "false" );
      AV63VerMail = GXutil.strtobool( GXutil.booltostr( AV63VerMail)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63VerMail", AV63VerMail);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'LISTJOBGRID_nFirstRecordOnPage'},{av:'LISTJOBGRID_nEOF'},{av:'AV122PrgPct',fld:'vPRGPCT',pic:'ZZ9',hsh:true},{av:'AV120i',fld:'vI',pic:'9999'},{av:'subListjobgrid_Rows',ctrl:'LISTJOBGRID',prop:'Rows'},{av:'AV64VerSumLin',fld:'vVERSUMLIN',pic:'9'},{av:'AV42Mail',fld:'vMAIL',pic:''},{av:'AV43ManAut',fld:'vMANAUT',pic:''},{av:'AV45Opi',fld:'vOPI',pic:''},{av:'AV63VerMail',fld:'vVERMAIL',pic:''},{av:'AV49PRIO',fld:'vPRIO',pic:'9',hsh:true},{av:'AV97PATHTEMP',fld:'vPATHTEMP',pic:'',hsh:true},{av:'AV30FacCodfrom',fld:'vFACCODFROM',pic:'ZZZZZZZ9',hsh:true},{av:'AV47PATHPDF',fld:'vPATHPDF',pic:''},{av:'AV145Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV107ListJobGridPageCount',fld:'vLISTJOBGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("LISTJOBGRID.LOAD","{handler:'e232BU2',iparms:[{av:'AV120i',fld:'vI',pic:'9999'},{av:'A14459PrgPct',fld:'PRGPCT',pic:'ZZ9'},{av:'cmbJobStat'},{av:'A14450JobStat',fld:'JOBSTAT',pic:''},{av:'A14458ErItem',fld:'ERITEM',pic:'ZZZZZZZZZ9'},{av:'A14485JobDesc',fld:'JOBDESC',pic:''}]");
      setEventMetadata("LISTJOBGRID.LOAD",",oparms:[{av:'AV120i',fld:'vI',pic:'9999'},{av:'AV122PrgPct',fld:'vPRGPCT',pic:'ZZ9',hsh:true},{av:'AV121Row',fld:'vROW',pic:''},{av:'cmbavGridactiongroup1'},{av:'AV110GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'AV109DetailWebComponent',fld:'vDETAILWEBCOMPONENT',pic:''},{av:'AV111Run',fld:'vRUN',pic:''},{av:'edtavRun_Class',ctrl:'vRUN',prop:'Class'},{av:'AV118JobDescWithTags',fld:'vJOBDESCWITHTAGS',pic:''}]}");
      setEventMetadata("LISTJOBGRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e142BU2',iparms:[{av:'LISTJOBGRID_nFirstRecordOnPage'},{av:'LISTJOBGRID_nEOF'},{av:'subListjobgrid_Rows',ctrl:'LISTJOBGRID',prop:'Rows'},{av:'AV122PrgPct',fld:'vPRGPCT',pic:'ZZ9',hsh:true},{av:'AV120i',fld:'vI',pic:'9999'},{av:'AV64VerSumLin',fld:'vVERSUMLIN',pic:'9'},{av:'AV42Mail',fld:'vMAIL',pic:''},{av:'AV43ManAut',fld:'vMANAUT',pic:''},{av:'AV45Opi',fld:'vOPI',pic:''},{av:'AV63VerMail',fld:'vVERMAIL',pic:''},{av:'AV49PRIO',fld:'vPRIO',pic:'9',hsh:true},{av:'AV97PATHTEMP',fld:'vPATHTEMP',pic:'',hsh:true},{av:'AV30FacCodfrom',fld:'vFACCODFROM',pic:'ZZZZZZZ9',hsh:true},{av:'AV47PATHPDF',fld:'vPATHPDF',pic:''},{av:'AV145Pgmname',fld:'vPGMNAME',pic:''},{av:'Listjobgridpaginationbar_Selectedpage',ctrl:'LISTJOBGRIDPAGINATIONBAR',prop:'SelectedPage'},{av:'AV106ListJobGridCurrentPage',fld:'vLISTJOBGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("LISTJOBGRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[{av:'AV106ListJobGridCurrentPage',fld:'vLISTJOBGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV107ListJobGridPageCount',fld:'vLISTJOBGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("LISTJOBGRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e152BU2',iparms:[{av:'LISTJOBGRID_nFirstRecordOnPage'},{av:'LISTJOBGRID_nEOF'},{av:'subListjobgrid_Rows',ctrl:'LISTJOBGRID',prop:'Rows'},{av:'AV122PrgPct',fld:'vPRGPCT',pic:'ZZ9',hsh:true},{av:'AV120i',fld:'vI',pic:'9999'},{av:'AV64VerSumLin',fld:'vVERSUMLIN',pic:'9'},{av:'AV42Mail',fld:'vMAIL',pic:''},{av:'AV43ManAut',fld:'vMANAUT',pic:''},{av:'AV45Opi',fld:'vOPI',pic:''},{av:'AV63VerMail',fld:'vVERMAIL',pic:''},{av:'AV49PRIO',fld:'vPRIO',pic:'9',hsh:true},{av:'AV97PATHTEMP',fld:'vPATHTEMP',pic:'',hsh:true},{av:'AV30FacCodfrom',fld:'vFACCODFROM',pic:'ZZZZZZZ9',hsh:true},{av:'AV47PATHPDF',fld:'vPATHPDF',pic:''},{av:'AV145Pgmname',fld:'vPGMNAME',pic:''},{av:'Listjobgridpaginationbar_Rowsperpageselectedvalue',ctrl:'LISTJOBGRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("LISTJOBGRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subListjobgrid_Rows',ctrl:'LISTJOBGRID',prop:'Rows'},{av:'AV106ListJobGridCurrentPage',fld:'vLISTJOBGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK","{handler:'e242BU2',iparms:[{av:'cmbavGridactiongroup1'},{av:'AV110GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'A14423JobId',fld:'JOBID',pic:''},{av:'A14470DocId',fld:'DOCID',pic:'ZZZZZZZZZ9'},{av:'AV26EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV129FacFch',fld:'vFACFCH',pic:''},{av:'AV133CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV132CliNom',fld:'vCLINOM',pic:''},{av:'AV127Cliemf',fld:'vCLIEMF',pic:''},{av:'AV39ListPrinter',fld:'vLISTPRINTER',pic:''},{av:'A14463ZipPath',fld:'ZIPPATH',pic:''},{av:'A14464ZipUrl',fld:'ZIPURL',pic:''},{av:'A430FacCod',fld:'FACCOD',pic:'ZZZZZZZ9'},{av:'AV128FacCod',fld:'vFACCOD',pic:'ZZZZZZZ9'},{av:'A436FacFch',fld:'FACFCH',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A10050Cliemf',fld:'CLIEMF',pic:''},{av:'A14420FacEnvMail',fld:'FACENVMAIL',pic:'99/99/99 99:99'}]");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV110GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'AV134AuxJobId',fld:'vAUXJOBID',pic:''},{av:'AV128FacCod',fld:'vFACCOD',pic:'ZZZZZZZ9'},{av:'AV125JobId_Selected',fld:'vJOBID_SELECTED',pic:''},{av:'AV129FacFch',fld:'vFACFCH',pic:''},{av:'AV133CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV132CliNom',fld:'vCLINOM',pic:''},{av:'AV127Cliemf',fld:'vCLIEMF',pic:''}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_DELETED.CLOSE","{handler:'e162BU2',iparms:[{av:'Dvelop_confirmpanel_deleted_Result',ctrl:'DVELOP_CONFIRMPANEL_DELETED',prop:'Result'},{av:'LISTJOBGRID_nFirstRecordOnPage'},{av:'LISTJOBGRID_nEOF'},{av:'subListjobgrid_Rows',ctrl:'LISTJOBGRID',prop:'Rows'},{av:'AV122PrgPct',fld:'vPRGPCT',pic:'ZZ9',hsh:true},{av:'AV120i',fld:'vI',pic:'9999'},{av:'AV64VerSumLin',fld:'vVERSUMLIN',pic:'9'},{av:'AV42Mail',fld:'vMAIL',pic:''},{av:'AV43ManAut',fld:'vMANAUT',pic:''},{av:'AV45Opi',fld:'vOPI',pic:''},{av:'AV63VerMail',fld:'vVERMAIL',pic:''},{av:'AV49PRIO',fld:'vPRIO',pic:'9',hsh:true},{av:'AV97PATHTEMP',fld:'vPATHTEMP',pic:'',hsh:true},{av:'AV30FacCodfrom',fld:'vFACCODFROM',pic:'ZZZZZZZ9',hsh:true},{av:'AV47PATHPDF',fld:'vPATHPDF',pic:''},{av:'AV145Pgmname',fld:'vPGMNAME',pic:''},{av:'AV125JobId_Selected',fld:'vJOBID_SELECTED',pic:''},{av:'AV26EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV61UsurCod',fld:'vUSURCOD',pic:'@!'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_DELETED.CLOSE",",oparms:[{av:'AV107ListJobGridPageCount',fld:'vLISTJOBGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("ENTER","{handler:'e182BU2',iparms:[{av:'AV30FacCodfrom',fld:'vFACCODFROM',pic:'ZZZZZZZ9',hsh:true},{av:'AV31FacCodto',fld:'vFACCODTO',pic:'ZZZZZZZ9'},{av:'AV34FacFchfrom',fld:'vFACFCHFROM',pic:''},{av:'AV35FacFchto',fld:'vFACFCHTO',pic:''},{av:'AV43ManAut',fld:'vMANAUT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A430FacCod',fld:'FACCOD',pic:'ZZZZZZZ9'},{av:'AV26EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A435FacEst',fld:'FACEST',pic:'9'},{av:'A436FacFch',fld:'FACFCH',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV14CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV16CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'A450FacPri',fld:'FACPRI',pic:'9'},{av:'AV49PRIO',fld:'vPRIO',pic:'9',hsh:true},{av:'A1153FacTipFac',fld:'FACTIPFAC',pic:'9'},{av:'AV32FacEst',fld:'vFACEST',pic:'9'},{av:'AV33FacEstto',fld:'vFACESTTO',pic:'9'}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV32FacEst',fld:'vFACEST',pic:'9'},{av:'AV33FacEstto',fld:'vFACESTTO',pic:'9'},{av:'Dvelop_confirmpanel_enter_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_ENTER',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE","{handler:'e172BU2',iparms:[{av:'Dvelop_confirmpanel_enter_Result',ctrl:'DVELOP_CONFIRMPANEL_ENTER',prop:'Result'},{av:'LISTJOBGRID_nFirstRecordOnPage'},{av:'LISTJOBGRID_nEOF'},{av:'subListjobgrid_Rows',ctrl:'LISTJOBGRID',prop:'Rows'},{av:'AV122PrgPct',fld:'vPRGPCT',pic:'ZZ9',hsh:true},{av:'AV120i',fld:'vI',pic:'9999'},{av:'AV64VerSumLin',fld:'vVERSUMLIN',pic:'9'},{av:'AV42Mail',fld:'vMAIL',pic:''},{av:'AV43ManAut',fld:'vMANAUT',pic:''},{av:'AV45Opi',fld:'vOPI',pic:''},{av:'AV63VerMail',fld:'vVERMAIL',pic:''},{av:'AV49PRIO',fld:'vPRIO',pic:'9',hsh:true},{av:'AV97PATHTEMP',fld:'vPATHTEMP',pic:'',hsh:true},{av:'AV30FacCodfrom',fld:'vFACCODFROM',pic:'ZZZZZZZ9',hsh:true},{av:'AV47PATHPDF',fld:'vPATHPDF',pic:''},{av:'AV145Pgmname',fld:'vPGMNAME',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A430FacCod',fld:'FACCOD',pic:'ZZZZZZZ9'},{av:'AV26EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A435FacEst',fld:'FACEST',pic:'9'},{av:'AV31FacCodto',fld:'vFACCODTO',pic:'ZZZZZZZ9'},{av:'A436FacFch',fld:'FACFCH',pic:''},{av:'AV34FacFchfrom',fld:'vFACFCHFROM',pic:''},{av:'AV35FacFchto',fld:'vFACFCHTO',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV14CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV16CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'A450FacPri',fld:'FACPRI',pic:'9'},{av:'A1153FacTipFac',fld:'FACTIPFAC',pic:'9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'AV61UsurCod',fld:'vUSURCOD',pic:'@!'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE",",oparms:[{av:'AV32FacEst',fld:'vFACEST',pic:'9'},{av:'AV33FacEstto',fld:'vFACESTTO',pic:'9'},{av:'AV61UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV26EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV107ListJobGridPageCount',fld:'vLISTJOBGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e112BU1',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("JOBDESC.CLICK","{handler:'e282BU2',iparms:[{av:'A14423JobId',fld:'JOBID',pic:''},{av:'A14424JobType',fld:'JOBTYPE',pic:'',hsh:true}]");
      setEventMetadata("JOBDESC.CLICK",",oparms:[{ctrl:'WWPAUX_WC'}]}");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK","{handler:'e272BU2',iparms:[{av:'A14423JobId',fld:'JOBID',pic:''}]");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK",",oparms:[{ctrl:'LISTJOBGRID_DWC'}]}");
      setEventMetadata("COMBO_CLICODTO.ONOPTIONCLICKED","{handler:'e132BU2',iparms:[{av:'Combo_clicodto_Selectedvalue_get',ctrl:'COMBO_CLICODTO',prop:'SelectedValue_get'}]");
      setEventMetadata("COMBO_CLICODTO.ONOPTIONCLICKED",",oparms:[{av:'AV16CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'}]}");
      setEventMetadata("COMBO_CLICODFROM.ONOPTIONCLICKED","{handler:'e122BU2',iparms:[{av:'Combo_clicodfrom_Selectedvalue_get',ctrl:'COMBO_CLICODFROM',prop:'SelectedValue_get'}]");
      setEventMetadata("COMBO_CLICODFROM.ONOPTIONCLICKED",",oparms:[{av:'AV14CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'}]}");
      setEventMetadata("VRUN.CLICK","{handler:'e252BU2',iparms:[{av:'A14423JobId',fld:'JOBID',pic:''},{av:'AV26EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV61UsurCod',fld:'vUSURCOD',pic:'@!'}]");
      setEventMetadata("VRUN.CLICK",",oparms:[{av:'AV61UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV26EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A14423JobId',fld:'JOBID',pic:''}]}");
      setEventMetadata("LISTJOBGRID.REFRESH","{handler:'e262BU2',iparms:[{av:'AV122PrgPct',fld:'vPRGPCT',grid:139,pic:'ZZ9',hsh:true},{av:'LISTJOBGRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_139',ctrl:'LISTJOBGRID',grid:139,prop:'GridRC',grid:139}]");
      setEventMetadata("LISTJOBGRID.REFRESH",",oparms:[{av:'AV120i',fld:'vI',pic:'9999'},{av:'AV121Row',fld:'vROW',pic:''}]}");
      setEventMetadata("VFACCODFROM.ISVALID","{handler:'e192BU2',iparms:[{av:'AV30FacCodfrom',fld:'vFACCODFROM',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("VFACCODFROM.ISVALID",",oparms:[{av:'AV31FacCodto',fld:'vFACCODTO',pic:'ZZZZZZZ9'},{av:'AV34FacFchfrom',fld:'vFACFCHFROM',pic:''},{av:'AV35FacFchto',fld:'vFACFCHTO',pic:''}]}");
      setEventMetadata("ONMESSAGE_GX1","{handler:'e202BU2',iparms:[{av:'LISTJOBGRID_nFirstRecordOnPage'},{av:'LISTJOBGRID_nEOF'},{av:'subListjobgrid_Rows',ctrl:'LISTJOBGRID',prop:'Rows'},{av:'AV122PrgPct',fld:'vPRGPCT',pic:'ZZ9',hsh:true},{av:'AV120i',fld:'vI',pic:'9999'},{av:'AV64VerSumLin',fld:'vVERSUMLIN',pic:'9'},{av:'AV42Mail',fld:'vMAIL',pic:''},{av:'AV43ManAut',fld:'vMANAUT',pic:''},{av:'AV45Opi',fld:'vOPI',pic:''},{av:'AV63VerMail',fld:'vVERMAIL',pic:''},{av:'AV49PRIO',fld:'vPRIO',pic:'9',hsh:true},{av:'AV97PATHTEMP',fld:'vPATHTEMP',pic:'',hsh:true},{av:'AV30FacCodfrom',fld:'vFACCODFROM',pic:'ZZZZZZZ9',hsh:true},{av:'AV47PATHPDF',fld:'vPATHPDF',pic:''},{av:'AV145Pgmname',fld:'vPGMNAME',pic:''},{av:'AV113NotificationInfo',fld:'vNOTIFICATIONINFO',pic:''},{av:'AV39ListPrinter',fld:'vLISTPRINTER',pic:''},{av:'A14423JobId',fld:'JOBID',pic:''},{av:'AV114Async_JobId',fld:'vASYNC_JOBID',pic:''},{av:'A14464ZipUrl',fld:'ZIPURL',pic:''},{av:'A14463ZipPath',fld:'ZIPPATH',pic:''}]");
      setEventMetadata("ONMESSAGE_GX1",",oparms:[{av:'AV114Async_JobId',fld:'vASYNC_JOBID',pic:''},{av:'AV39ListPrinter',fld:'vLISTPRINTER',pic:''},{av:'AV107ListJobGridPageCount',fld:'vLISTJOBGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("NULL","{handler:'validv_Prgpct',iparms:[]");
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
   public void submit( int submitId ,
                       Object [] submitParms ,
                       ModelContext submitContext )
   {
      UserInformation submitUI = (UserInformation) GXObjectHelper.getUserInformation(context, -1);
      int remoteHandle = submitUI.getHandle();
      try
      {
         switch ( submitId )
         {
               case 1 :
                  new app.asyncbatch.jobrun(remoteHandle, submitContext).execute( (java.util.UUID)submitParms[0], (String)submitParms[1], (String)submitParms[2]) ;
                  try { Application.getConnectionManager().disconnect(remoteHandle); } catch(Exception submitExc) { ; }
                  break;
               case 2 :
                  new app.asyncbatch.jobrun(remoteHandle, submitContext).execute( (java.util.UUID)submitParms[0], (String)submitParms[1], (String)submitParms[2]) ;
                  try { Application.getConnectionManager().disconnect(remoteHandle); } catch(Exception submitExc) { ; }
                  break;
         }
      }
      catch ( Exception e )
      {
         Application.cleanupConnection(remoteHandle);
         e.printStackTrace();
      }
   }

   public void initialize( )
   {
      wcpOAV34FacFchfrom = GXutil.nullDate() ;
      Listjobgridpaginationbar_Selectedpage = "" ;
      Dvelop_confirmpanel_deleted_Result = "" ;
      Dvelop_confirmpanel_enter_Result = "" ;
      Combo_listprinter_Selectedvalue_get = "" ;
      Combo_clicodto_Selectedvalue_get = "" ;
      Combo_clicodfrom_Selectedvalue_get = "" ;
      AV113NotificationInfo = new com.genexuscore.genexus.server.SdtNotificationInfo(remoteHandle, context);
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV34FacFchfrom = GXutil.nullDate() ;
      AV42Mail = "" ;
      AV43ManAut = "" ;
      AV45Opi = "" ;
      AV49PRIO = "" ;
      AV97PATHTEMP = "" ;
      AV47PATHPDF = "" ;
      AV145Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV25DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV15CliCodfrom_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV17CliCodto_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV40ListPrinter_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV26EmprCod = "" ;
      AV129FacFch = GXutil.nullDate() ;
      AV132CliNom = "" ;
      AV127Cliemf = "" ;
      A436FacFch = GXutil.nullDate() ;
      A279CliNom = "" ;
      A10050Cliemf = "" ;
      A14420FacEnvMail = GXutil.resetTime( GXutil.nullDate() );
      AV125JobId_Selected = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      AV61UsurCod = "" ;
      A396EmprCod = "" ;
      A450FacPri = "" ;
      AV114Async_JobId = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      Combo_clicodfrom_Selectedvalue_set = "" ;
      Combo_clicodto_Selectedvalue_set = "" ;
      Combo_listprinter_Selectedvalue_set = "" ;
      Combo_listprinter_Selectedtext_set = "" ;
      Popover_jobdesc_Gridinternalname = "" ;
      Listjobgrid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_filtrosgenerales = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_clicodfrom_Jsonclick = "" ;
      ucCombo_clicodfrom = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_clicodto_Jsonclick = "" ;
      ucCombo_clicodto = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV35FacFchto = GXutil.nullDate() ;
      lblTextblockcombo_listprinter_Jsonclick = "" ;
      ucCombo_listprinter = new com.genexus.webpanels.GXUserControl();
      bttBtnenter_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucDvpanel_panelwccomponent = new com.genexus.webpanels.GXUserControl();
      ListjobgridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucListjobgridpaginationbar = new com.genexus.webpanels.GXUserControl();
      WebComp_Listjobgrid_dwc_Component = "" ;
      OldListjobgrid_dwc = "" ;
      ucProgressbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucInnewwindowpdf = new com.genexus.webpanels.GXUserControl();
      AV39ListPrinter = "" ;
      ucPopover_jobdesc = new com.genexus.webpanels.GXUserControl();
      ucListjobgrid_empowerer = new com.genexus.webpanels.GXUserControl();
      WebComp_Wwpaux_wc_Component = "" ;
      OldWwpaux_wc = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV109DetailWebComponent = "" ;
      A14423JobId = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      AV118JobDescWithTags = "" ;
      A14485JobDesc = "" ;
      A14424JobType = "" ;
      A14450JobStat = "" ;
      A14463ZipPath = "" ;
      A14464ZipUrl = "" ;
      AV111Run = "" ;
      AV121Row = "" ;
      Gx_date = GXutil.nullDate() ;
      scmdbuf = "" ;
      H02BU2_A14452DtCreat = new java.util.Date[] {GXutil.nullDate()} ;
      H02BU2_n14452DtCreat = new boolean[] {false} ;
      H02BU2_A14464ZipUrl = new String[] {""} ;
      H02BU2_n14464ZipUrl = new boolean[] {false} ;
      H02BU2_A14463ZipPath = new String[] {""} ;
      H02BU2_n14463ZipPath = new boolean[] {false} ;
      H02BU2_A14450JobStat = new String[] {""} ;
      H02BU2_n14450JobStat = new boolean[] {false} ;
      H02BU2_A14455TotItem = new long[1] ;
      H02BU2_n14455TotItem = new boolean[] {false} ;
      H02BU2_A14459PrgPct = new short[1] ;
      H02BU2_n14459PrgPct = new boolean[] {false} ;
      H02BU2_A14456PrcItem = new long[1] ;
      H02BU2_n14456PrcItem = new boolean[] {false} ;
      H02BU2_A14458ErItem = new long[1] ;
      H02BU2_n14458ErItem = new boolean[] {false} ;
      H02BU2_A14457OkItem = new long[1] ;
      H02BU2_n14457OkItem = new boolean[] {false} ;
      H02BU2_A14424JobType = new String[] {""} ;
      H02BU2_n14424JobType = new boolean[] {false} ;
      H02BU2_A14485JobDesc = new String[] {""} ;
      H02BU2_n14485JobDesc = new boolean[] {false} ;
      H02BU2_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      A14452DtCreat = GXutil.resetTime( GXutil.nullDate() );
      H02BU3_ALISTJOBGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV65WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV95Station = "" ;
      GXv_char3 = new String[1] ;
      AV27EmprNom = "" ;
      GXv_char4 = new String[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV62Var_OutPut = "" ;
      GXv_int9 = new int[1] ;
      AV98Copia = new String[4] ;
      GX_I = 1 ;
      while ( GX_I <= 4 )
      {
         AV98Copia[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      ListjobgridRow = new com.genexus.webpanels.GXWebRow();
      H02BU4_AV126Numerodefacturas = new short[1] ;
      ucDvelop_confirmpanel_enter = new com.genexus.webpanels.GXUserControl();
      AV134AuxJobId = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      H02BU5_A14468ItmId = new long[1] ;
      H02BU5_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      H02BU5_A14470DocId = new long[1] ;
      H02BU5_n14470DocId = new boolean[] {false} ;
      AV112Aviso = "" ;
      AV5AppTool = new app.SdtAppTool(remoteHandle, context);
      AV75JobItem = new GXBaseCollection<app.asyncbatch.SdtJobItemSdt_Item>(app.asyncbatch.SdtJobItemSdt_Item.class, "Item", "TexplusNET", remoteHandle);
      AV72JobId = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      AV124Cliente = "" ;
      AV141Now = GXutil.resetTime( GXutil.nullDate() );
      AV142Timestamp = "" ;
      H02BU6_A1153FacTipFac = new byte[1] ;
      H02BU6_A450FacPri = new String[] {""} ;
      H02BU6_A252CliCod = new int[1] ;
      H02BU6_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      H02BU6_A430FacCod = new int[1] ;
      H02BU6_A435FacEst = new byte[1] ;
      H02BU6_A396EmprCod = new String[] {""} ;
      H02BU6_A279CliNom = new String[] {""} ;
      AV140Bar = "" ;
      AV138Folder = "" ;
      AV80FileNm = "" ;
      AV79OutFile = "" ;
      AV78OutUrl = "" ;
      AV139Directory = new com.genexus.util.GXDirectory();
      AV76JobItem_Row = new app.asyncbatch.SdtJobItemSdt_Item(remoteHandle, context);
      GXv_boolean11 = new boolean[1] ;
      AV41ListPrinter_Data_Item = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      H02BU7_A396EmprCod = new String[] {""} ;
      H02BU7_A10045CliAct = new String[] {""} ;
      H02BU7_A279CliNom = new String[] {""} ;
      H02BU7_A252CliCod = new int[1] ;
      A10045CliAct = "" ;
      A13735CliCNom = "" ;
      AV20Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      H02BU8_A396EmprCod = new String[] {""} ;
      H02BU8_A10045CliAct = new String[] {""} ;
      H02BU8_A279CliNom = new String[] {""} ;
      H02BU8_A252CliCod = new int[1] ;
      AV116PARM_OPT = "" ;
      H02BU9_A396EmprCod = new String[] {""} ;
      H02BU9_A430FacCod = new int[1] ;
      H02BU9_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      H02BU9_A252CliCod = new int[1] ;
      H02BU9_A279CliNom = new String[] {""} ;
      H02BU9_A10050Cliemf = new String[] {""} ;
      H02BU9_A14420FacEnvMail = new java.util.Date[] {GXutil.nullDate()} ;
      AV131FacEnvMail = GXutil.resetTime( GXutil.nullDate() );
      H02BU10_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      H02BU10_A14464ZipUrl = new String[] {""} ;
      H02BU10_n14464ZipUrl = new boolean[] {false} ;
      AV117ZipUrl = "" ;
      AV57STR_SDTListPrinter = "" ;
      AV94Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV92SDTListPrinter = new GXBaseCollection<app.SdtSDTListPrinter_SDTListPrinterItem>(app.SdtSDTListPrinter_SDTListPrinterItem.class, "SDTListPrinterItem", "TexplusNET", remoteHandle);
      AV93SDTListPrinter_item = new app.SdtSDTListPrinter_SDTListPrinterItem(remoteHandle, context);
      H02BU11_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      H02BU11_A14463ZipPath = new String[] {""} ;
      H02BU11_n14463ZipPath = new boolean[] {false} ;
      AV115ZipPath = "" ;
      GXt_char2 = "" ;
      GXv_char5 = new String[1] ;
      ucDvelop_confirmpanel_deleted = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subListjobgrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      ListjobgridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.generarjobfactura__default(),
         new Object[] {
             new Object[] {
            H02BU2_A14452DtCreat, H02BU2_n14452DtCreat, H02BU2_A14464ZipUrl, H02BU2_n14464ZipUrl, H02BU2_A14463ZipPath, H02BU2_n14463ZipPath, H02BU2_A14450JobStat, H02BU2_n14450JobStat, H02BU2_A14455TotItem, H02BU2_n14455TotItem,
            H02BU2_A14459PrgPct, H02BU2_n14459PrgPct, H02BU2_A14456PrcItem, H02BU2_n14456PrcItem, H02BU2_A14458ErItem, H02BU2_n14458ErItem, H02BU2_A14457OkItem, H02BU2_n14457OkItem, H02BU2_A14424JobType, H02BU2_n14424JobType,
            H02BU2_A14485JobDesc, H02BU2_n14485JobDesc, H02BU2_A14423JobId
            }
            , new Object[] {
            H02BU3_ALISTJOBGRID_nRecordCount
            }
            , new Object[] {
            H02BU4_AV126Numerodefacturas
            }
            , new Object[] {
            H02BU5_A14468ItmId, H02BU5_A14423JobId, H02BU5_A14470DocId, H02BU5_n14470DocId
            }
            , new Object[] {
            H02BU6_A1153FacTipFac, H02BU6_A450FacPri, H02BU6_A252CliCod, H02BU6_A436FacFch, H02BU6_A430FacCod, H02BU6_A435FacEst, H02BU6_A396EmprCod, H02BU6_A279CliNom
            }
            , new Object[] {
            H02BU7_A396EmprCod, H02BU7_A10045CliAct, H02BU7_A279CliNom, H02BU7_A252CliCod
            }
            , new Object[] {
            H02BU8_A396EmprCod, H02BU8_A10045CliAct, H02BU8_A279CliNom, H02BU8_A252CliCod
            }
            , new Object[] {
            H02BU9_A396EmprCod, H02BU9_A430FacCod, H02BU9_A436FacFch, H02BU9_A252CliCod, H02BU9_A279CliNom, H02BU9_A10050Cliemf, H02BU9_A14420FacEnvMail
            }
            , new Object[] {
            H02BU10_A14423JobId, H02BU10_A14464ZipUrl, H02BU10_n14464ZipUrl
            }
            , new Object[] {
            H02BU11_A14423JobId, H02BU11_A14463ZipPath, H02BU11_n14463ZipPath
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV145Pgmname = "Facturacion.GenerarJobFactura" ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      AV145Pgmname = "Facturacion.GenerarJobFactura" ;
      Gx_err = (short)(0) ;
      edtavPathpdf_Enabled = 0 ;
      edtavDetailwebcomponent_Enabled = 0 ;
      edtavJobdescwithtags_Enabled = 0 ;
      edtavRun_Enabled = 0 ;
      edtavRow_Enabled = 0 ;
      edtavPrgpct_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      WebComp_Listjobgrid_dwc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wwpaux_wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte LISTJOBGRID_nEOF ;
   private byte GxWebError ;
   private byte AV64VerSumLin ;
   private byte gxajaxcallmode ;
   private byte A435FacEst ;
   private byte A1153FacTipFac ;
   private byte AV32FacEst ;
   private byte AV33FacEstto ;
   private byte AV28F_header ;
   private byte nDonePA ;
   private byte subListjobgrid_Backcolorstyle ;
   private byte AV149GXLvl445 ;
   private byte nGXWrapped ;
   private byte subListjobgrid_Backstyle ;
   private byte subListjobgrid_Titlebackstyle ;
   private byte subListjobgrid_Allowselection ;
   private byte subListjobgrid_Allowhovering ;
   private byte subListjobgrid_Allowcollapsing ;
   private byte subListjobgrid_Collapsed ;
   private short nRcdExists_10 ;
   private short nIsMod_10 ;
   private short nRcdExists_9 ;
   private short nIsMod_9 ;
   private short nRcdExists_8 ;
   private short nIsMod_8 ;
   private short nRcdExists_7 ;
   private short nIsMod_7 ;
   private short nRcdExists_6 ;
   private short nIsMod_6 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV122PrgPct ;
   private short AV120i ;
   private short wbEnd ;
   private short wbStart ;
   private short AV23Copias2 ;
   private short AV11Agr_Fases ;
   private short AV110GridActionGroup1 ;
   private short A14459PrgPct ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV22Copias ;
   private short AV67Year ;
   private short AV24Day ;
   private short AV44Mounth ;
   private short AV137RecordCount ;
   private short AV126Numerodefacturas ;
   private short cV126Numerodefacturas ;
   private short AV81Total ;
   private short AV82Seq ;
   private int wcpOAV30FacCodfrom ;
   private int wcpOAV14CliCodfrom ;
   private int subListjobgrid_Rows ;
   private int Listjobgridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_139 ;
   private int AV30FacCodfrom ;
   private int AV14CliCodfrom ;
   private int nGXsfl_139_idx=1 ;
   private int AV133CliCod ;
   private int A430FacCod ;
   private int AV128FacCod ;
   private int A252CliCod ;
   private int Listjobgridpaginationbar_Pagestoshow ;
   private int Popover_jobdesc_Popoverwidth ;
   private int edtavFacfchfrom_Enabled ;
   private int edtavFacfchto_Enabled ;
   private int edtavFaccodfrom_Enabled ;
   private int AV31FacCodto ;
   private int edtavFaccodto_Enabled ;
   private int edtavCopias2_Enabled ;
   private int edtavPathpdf_Enabled ;
   private int divTablesplittedlistprinter_Visible ;
   private int edtavPgmname_Enabled ;
   private int edtavClicodfrom_Visible ;
   private int edtavClicodfrom_Enabled ;
   private int AV16CliCodto ;
   private int edtavClicodto_Visible ;
   private int edtavClicodto_Enabled ;
   private int edtavListprinter_Visible ;
   private int edtavListjobgridcurrentpage_Visible ;
   private int subListjobgrid_Islastpage ;
   private int edtavDetailwebcomponent_Enabled ;
   private int edtavJobdescwithtags_Enabled ;
   private int edtavRun_Enabled ;
   private int edtavRow_Enabled ;
   private int edtavPrgpct_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int GXt_int8 ;
   private int GXv_int9[] ;
   private int AV105PageToGo ;
   private int nGXsfl_139_fel_idx=1 ;
   private int AV155GXV1 ;
   private int idxLst ;
   private int subListjobgrid_Backcolor ;
   private int subListjobgrid_Allbackcolor ;
   private int edtavDetailwebcomponent_Visible ;
   private int edtavJobdescwithtags_Visible ;
   private int edtavRun_Visible ;
   private int edtavRow_Visible ;
   private int edtavPrgpct_Visible ;
   private int subListjobgrid_Titlebackcolor ;
   private int subListjobgrid_Selectedindex ;
   private int subListjobgrid_Selectioncolor ;
   private int subListjobgrid_Hoveringcolor ;
   private int GX_I ;
   private long LISTJOBGRID_nFirstRecordOnPage ;
   private long AV107ListJobGridPageCount ;
   private long A14470DocId ;
   private long AV106ListJobGridCurrentPage ;
   private long A14457OkItem ;
   private long A14458ErItem ;
   private long A14456PrcItem ;
   private long A14455TotItem ;
   private long LISTJOBGRID_nCurrentRecord ;
   private long LISTJOBGRID_nRecordCount ;
   private String Listjobgridpaginationbar_Selectedpage ;
   private String Dvelop_confirmpanel_deleted_Result ;
   private String Dvelop_confirmpanel_enter_Result ;
   private String Combo_listprinter_Selectedvalue_get ;
   private String Combo_clicodto_Selectedvalue_get ;
   private String Combo_clicodfrom_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_139_idx="0001" ;
   private String AV42Mail ;
   private String AV43ManAut ;
   private String AV45Opi ;
   private String AV49PRIO ;
   private String AV47PATHPDF ;
   private String AV145Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV26EmprCod ;
   private String AV132CliNom ;
   private String AV127Cliemf ;
   private String A279CliNom ;
   private String A10050Cliemf ;
   private String AV61UsurCod ;
   private String A396EmprCod ;
   private String A450FacPri ;
   private String Combo_clicodfrom_Cls ;
   private String Combo_clicodfrom_Selectedvalue_set ;
   private String Combo_clicodfrom_Emptyitemtext ;
   private String Combo_clicodto_Cls ;
   private String Combo_clicodto_Selectedvalue_set ;
   private String Combo_clicodto_Emptyitemtext ;
   private String Combo_listprinter_Cls ;
   private String Combo_listprinter_Selectedvalue_set ;
   private String Combo_listprinter_Selectedtext_set ;
   private String Dvpanel_panel_filtrosgenerales_Width ;
   private String Dvpanel_panel_filtrosgenerales_Cls ;
   private String Dvpanel_panel_filtrosgenerales_Title ;
   private String Dvpanel_panel_filtrosgenerales_Iconposition ;
   private String Dvpanel_panel_filtros_Width ;
   private String Dvpanel_panel_filtros_Cls ;
   private String Dvpanel_panel_filtros_Title ;
   private String Dvpanel_panel_filtros_Iconposition ;
   private String Listjobgridpaginationbar_Class ;
   private String Listjobgridpaginationbar_Pagingbuttonsposition ;
   private String Listjobgridpaginationbar_Pagingcaptionposition ;
   private String Listjobgridpaginationbar_Emptygridclass ;
   private String Listjobgridpaginationbar_Rowsperpageoptions ;
   private String Listjobgridpaginationbar_Previous ;
   private String Listjobgridpaginationbar_Next ;
   private String Listjobgridpaginationbar_Caption ;
   private String Listjobgridpaginationbar_Emptygridcaption ;
   private String Listjobgridpaginationbar_Rowsperpagecaption ;
   private String Dvpanel_panelwccomponent_Width ;
   private String Dvpanel_panelwccomponent_Cls ;
   private String Dvpanel_panelwccomponent_Title ;
   private String Dvpanel_panelwccomponent_Iconposition ;
   private String Datamonjs_Paramstr ;
   private String Popover_jobdesc_Gridinternalname ;
   private String Popover_jobdesc_Iteminternalname ;
   private String Popover_jobdesc_Trigger ;
   private String Popover_jobdesc_Position ;
   private String Dvelop_confirmpanel_deleted_Title ;
   private String Dvelop_confirmpanel_deleted_Confirmationtext ;
   private String Dvelop_confirmpanel_deleted_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_deleted_Nobuttoncaption ;
   private String Dvelop_confirmpanel_deleted_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_deleted_Yesbuttonposition ;
   private String Dvelop_confirmpanel_deleted_Confirmtype ;
   private String Dvelop_confirmpanel_enter_Title ;
   private String Dvelop_confirmpanel_enter_Confirmationtext ;
   private String Dvelop_confirmpanel_enter_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_enter_Nobuttoncaption ;
   private String Dvelop_confirmpanel_enter_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_enter_Yesbuttonposition ;
   private String Dvelop_confirmpanel_enter_Confirmtype ;
   private String Listjobgrid_empowerer_Gridinternalname ;
   private String Listjobgrid_empowerer_Popoversingrid ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_panel_filtros_Internalname ;
   private String divPanel_filtros_Internalname ;
   private String Dvpanel_panel_filtrosgenerales_Internalname ;
   private String divPanel_filtrosgenerales_Internalname ;
   private String divTable_filtrosgenerales_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divTablesplittedclicodfrom_Internalname ;
   private String lblTextblockcombo_clicodfrom_Internalname ;
   private String lblTextblockcombo_clicodfrom_Jsonclick ;
   private String Combo_clicodfrom_Caption ;
   private String Combo_clicodfrom_Internalname ;
   private String divTablesplittedclicodto_Internalname ;
   private String lblTextblockcombo_clicodto_Internalname ;
   private String lblTextblockcombo_clicodto_Jsonclick ;
   private String Combo_clicodto_Caption ;
   private String Combo_clicodto_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtavFacfchfrom_Internalname ;
   private String TempTags ;
   private String edtavFacfchfrom_Jsonclick ;
   private String edtavFacfchto_Internalname ;
   private String edtavFacfchto_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtavFaccodfrom_Internalname ;
   private String edtavFaccodfrom_Jsonclick ;
   private String edtavFaccodto_Internalname ;
   private String edtavFaccodto_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String edtavCopias2_Internalname ;
   private String edtavCopias2_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String edtavPathpdf_Internalname ;
   private String edtavPathpdf_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String divTablesplittedlistprinter_Internalname ;
   private String lblTextblockcombo_listprinter_Internalname ;
   private String lblTextblockcombo_listprinter_Jsonclick ;
   private String Combo_listprinter_Caption ;
   private String Combo_listprinter_Internalname ;
   private String divTable_acciones_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String Dvpanel_panelwccomponent_Internalname ;
   private String divPanelwccomponent_Internalname ;
   private String divListjobgridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subListjobgrid_Internalname ;
   private String Listjobgridpaginationbar_Internalname ;
   private String divCell_listjobgrid_dwc_Internalname ;
   private String divCell_listjobgrid_dwc_Class ;
   private String WebComp_Listjobgrid_dwc_Component ;
   private String OldListjobgrid_dwc ;
   private String divTable_progress_Internalname ;
   private String Progressbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String Innewwindowpdf_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavClicodfrom_Internalname ;
   private String edtavClicodfrom_Jsonclick ;
   private String edtavClicodto_Internalname ;
   private String edtavClicodto_Jsonclick ;
   private String edtavListprinter_Internalname ;
   private String edtavListprinter_Jsonclick ;
   private String Popover_jobdesc_Internalname ;
   private String edtavListjobgridcurrentpage_Internalname ;
   private String edtavListjobgridcurrentpage_Jsonclick ;
   private String Listjobgrid_empowerer_Internalname ;
   private String divDiv_wwpauxwc_Internalname ;
   private String WebComp_Wwpaux_wc_Component ;
   private String OldWwpaux_wc ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV109DetailWebComponent ;
   private String edtavDetailwebcomponent_Internalname ;
   private String edtJobId_Internalname ;
   private String edtavJobdescwithtags_Internalname ;
   private String edtJobDesc_Internalname ;
   private String edtJobType_Internalname ;
   private String edtOkItem_Internalname ;
   private String edtErItem_Internalname ;
   private String edtPrcItem_Internalname ;
   private String edtPrgPct_Internalname ;
   private String edtTotItem_Internalname ;
   private String edtZipPath_Internalname ;
   private String edtZipUrl_Internalname ;
   private String AV111Run ;
   private String edtavRun_Internalname ;
   private String edtavRow_Internalname ;
   private String edtavPrgpct_Internalname ;
   private String scmdbuf ;
   private String hsh ;
   private String AV95Station ;
   private String GXv_char3[] ;
   private String AV27EmprNom ;
   private String GXv_char4[] ;
   private String AV62Var_OutPut ;
   private String AV98Copia[] ;
   private String edtavRun_Class ;
   private String Dvelop_confirmpanel_enter_Internalname ;
   private String A10045CliAct ;
   private String sGXsfl_139_fel_idx="0001" ;
   private String GXt_char2 ;
   private String GXv_char5[] ;
   private String tblTabledvelop_confirmpanel_enter_Internalname ;
   private String tblTabledvelop_confirmpanel_deleted_Internalname ;
   private String Dvelop_confirmpanel_deleted_Internalname ;
   private String subListjobgrid_Class ;
   private String subListjobgrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtavDetailwebcomponent_Jsonclick ;
   private String edtJobId_Jsonclick ;
   private String edtavJobdescwithtags_Jsonclick ;
   private String edtJobDesc_Jsonclick ;
   private String edtJobType_Jsonclick ;
   private String edtOkItem_Jsonclick ;
   private String edtErItem_Jsonclick ;
   private String edtPrcItem_Jsonclick ;
   private String edtPrgPct_Jsonclick ;
   private String edtTotItem_Jsonclick ;
   private String edtZipPath_Jsonclick ;
   private String edtZipUrl_Jsonclick ;
   private String edtavRun_Jsonclick ;
   private String edtavRow_Jsonclick ;
   private String edtavPrgpct_Jsonclick ;
   private String subListjobgrid_Header ;
   private java.util.Date A14420FacEnvMail ;
   private java.util.Date A14452DtCreat ;
   private java.util.Date AV141Now ;
   private java.util.Date AV131FacEnvMail ;
   private java.util.Date wcpOAV34FacFchfrom ;
   private java.util.Date AV34FacFchfrom ;
   private java.util.Date AV129FacFch ;
   private java.util.Date A436FacFch ;
   private java.util.Date AV35FacFchto ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV63VerMail ;
   private boolean Combo_listprinter_Visible ;
   private boolean Combo_listprinter_Emptyitem ;
   private boolean Dvpanel_panel_filtrosgenerales_Autowidth ;
   private boolean Dvpanel_panel_filtrosgenerales_Autoheight ;
   private boolean Dvpanel_panel_filtrosgenerales_Collapsible ;
   private boolean Dvpanel_panel_filtrosgenerales_Collapsed ;
   private boolean Dvpanel_panel_filtrosgenerales_Showcollapseicon ;
   private boolean Dvpanel_panel_filtrosgenerales_Autoscroll ;
   private boolean Dvpanel_panel_filtros_Autowidth ;
   private boolean Dvpanel_panel_filtros_Autoheight ;
   private boolean Dvpanel_panel_filtros_Collapsible ;
   private boolean Dvpanel_panel_filtros_Collapsed ;
   private boolean Dvpanel_panel_filtros_Showcollapseicon ;
   private boolean Dvpanel_panel_filtros_Autoscroll ;
   private boolean Listjobgridpaginationbar_Showfirst ;
   private boolean Listjobgridpaginationbar_Showprevious ;
   private boolean Listjobgridpaginationbar_Shownext ;
   private boolean Listjobgridpaginationbar_Showlast ;
   private boolean Listjobgridpaginationbar_Rowsperpageselector ;
   private boolean Dvpanel_panelwccomponent_Autowidth ;
   private boolean Dvpanel_panelwccomponent_Autoheight ;
   private boolean Dvpanel_panelwccomponent_Collapsible ;
   private boolean Dvpanel_panelwccomponent_Collapsed ;
   private boolean Dvpanel_panelwccomponent_Showcollapseicon ;
   private boolean Dvpanel_panelwccomponent_Autoscroll ;
   private boolean Popover_jobdesc_Isgriditem ;
   private boolean wbLoad ;
   private boolean bGXsfl_139_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n14485JobDesc ;
   private boolean n14424JobType ;
   private boolean n14457OkItem ;
   private boolean n14458ErItem ;
   private boolean n14456PrcItem ;
   private boolean n14459PrgPct ;
   private boolean n14455TotItem ;
   private boolean n14450JobStat ;
   private boolean n14463ZipPath ;
   private boolean n14464ZipUrl ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n14452DtCreat ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean n14470DocId ;
   private boolean AV99isExist ;
   private boolean AV88isOk ;
   private boolean GXt_boolean10 ;
   private boolean GXv_boolean11[] ;
   private String AV78OutUrl ;
   private String AV57STR_SDTListPrinter ;
   private String AV97PATHTEMP ;
   private String AV39ListPrinter ;
   private String AV118JobDescWithTags ;
   private String A14485JobDesc ;
   private String A14424JobType ;
   private String A14450JobStat ;
   private String A14463ZipPath ;
   private String A14464ZipUrl ;
   private String AV121Row ;
   private String AV112Aviso ;
   private String AV124Cliente ;
   private String AV142Timestamp ;
   private String AV140Bar ;
   private String AV138Folder ;
   private String AV80FileNm ;
   private String AV79OutFile ;
   private String A13735CliCNom ;
   private String AV116PARM_OPT ;
   private String AV117ZipUrl ;
   private String AV115ZipPath ;
   private java.util.UUID AV125JobId_Selected ;
   private java.util.UUID AV114Async_JobId ;
   private java.util.UUID A14423JobId ;
   private java.util.UUID AV134AuxJobId ;
   private java.util.UUID AV72JobId ;
   private com.genexus.webpanels.GXWebGrid ListjobgridContainer ;
   private com.genexus.webpanels.GXWebRow ListjobgridRow ;
   private com.genexus.webpanels.GXWebColumn ListjobgridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Listjobgrid_dwc ;
   private GXWebComponent WebComp_Wwpaux_wc ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicodfrom ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicodto ;
   private com.genexus.webpanels.GXUserControl ucCombo_listprinter ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panelwccomponent ;
   private com.genexus.webpanels.GXUserControl ucListjobgridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucProgressbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucInnewwindowpdf ;
   private com.genexus.webpanels.GXUserControl ucPopover_jobdesc ;
   private com.genexus.webpanels.GXUserControl ucListjobgrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_enter ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_deleted ;
   private com.genexus.util.GXDirectory AV139Directory ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private GXBaseCollection<app.SdtSDTListPrinter_SDTListPrinterItem> AV92SDTListPrinter ;
   private app.SdtAppTool AV5AppTool ;
   private com.genexuscore.genexus.server.SdtNotificationInfo AV113NotificationInfo ;
   private ICheckbox chkavVersumlin ;
   private HTMLChoice cmbavF_header ;
   private HTMLChoice cmbavAgr_fases ;
   private ICheckbox chkavMail ;
   private ICheckbox chkavManaut ;
   private ICheckbox chkavOpi ;
   private HTMLChoice cmbavGridactiongroup1 ;
   private HTMLChoice cmbJobStat ;
   private ICheckbox chkavVermail ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] H02BU2_A14452DtCreat ;
   private boolean[] H02BU2_n14452DtCreat ;
   private String[] H02BU2_A14464ZipUrl ;
   private boolean[] H02BU2_n14464ZipUrl ;
   private String[] H02BU2_A14463ZipPath ;
   private boolean[] H02BU2_n14463ZipPath ;
   private String[] H02BU2_A14450JobStat ;
   private boolean[] H02BU2_n14450JobStat ;
   private long[] H02BU2_A14455TotItem ;
   private boolean[] H02BU2_n14455TotItem ;
   private short[] H02BU2_A14459PrgPct ;
   private boolean[] H02BU2_n14459PrgPct ;
   private long[] H02BU2_A14456PrcItem ;
   private boolean[] H02BU2_n14456PrcItem ;
   private long[] H02BU2_A14458ErItem ;
   private boolean[] H02BU2_n14458ErItem ;
   private long[] H02BU2_A14457OkItem ;
   private boolean[] H02BU2_n14457OkItem ;
   private String[] H02BU2_A14424JobType ;
   private boolean[] H02BU2_n14424JobType ;
   private String[] H02BU2_A14485JobDesc ;
   private boolean[] H02BU2_n14485JobDesc ;
   private java.util.UUID[] H02BU2_A14423JobId ;
   private long[] H02BU3_ALISTJOBGRID_nRecordCount ;
   private short[] H02BU4_AV126Numerodefacturas ;
   private long[] H02BU5_A14468ItmId ;
   private java.util.UUID[] H02BU5_A14423JobId ;
   private long[] H02BU5_A14470DocId ;
   private boolean[] H02BU5_n14470DocId ;
   private byte[] H02BU6_A1153FacTipFac ;
   private String[] H02BU6_A450FacPri ;
   private int[] H02BU6_A252CliCod ;
   private java.util.Date[] H02BU6_A436FacFch ;
   private int[] H02BU6_A430FacCod ;
   private byte[] H02BU6_A435FacEst ;
   private String[] H02BU6_A396EmprCod ;
   private String[] H02BU6_A279CliNom ;
   private String[] H02BU7_A396EmprCod ;
   private String[] H02BU7_A10045CliAct ;
   private String[] H02BU7_A279CliNom ;
   private int[] H02BU7_A252CliCod ;
   private String[] H02BU8_A396EmprCod ;
   private String[] H02BU8_A10045CliAct ;
   private String[] H02BU8_A279CliNom ;
   private int[] H02BU8_A252CliCod ;
   private String[] H02BU9_A396EmprCod ;
   private int[] H02BU9_A430FacCod ;
   private java.util.Date[] H02BU9_A436FacFch ;
   private int[] H02BU9_A252CliCod ;
   private String[] H02BU9_A279CliNom ;
   private String[] H02BU9_A10050Cliemf ;
   private java.util.Date[] H02BU9_A14420FacEnvMail ;
   private java.util.UUID[] H02BU10_A14423JobId ;
   private String[] H02BU10_A14464ZipUrl ;
   private boolean[] H02BU10_n14464ZipUrl ;
   private java.util.UUID[] H02BU11_A14423JobId ;
   private String[] H02BU11_A14463ZipPath ;
   private boolean[] H02BU11_n14463ZipPath ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV15CliCodfrom_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV17CliCodto_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV40ListPrinter_Data ;
   private GXBaseCollection<app.asyncbatch.SdtJobItemSdt_Item> AV75JobItem ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV94Messages ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV41ListPrinter_Data_Item ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV20Combo_DataItem ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV25DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[] ;
   private app.asyncbatch.SdtJobItemSdt_Item AV76JobItem_Row ;
   private app.SdtSDTListPrinter_SDTListPrinterItem AV93SDTListPrinter_item ;
   private app.wwpbaseobjects.SdtWWPContext AV65WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
}

final  class generarjobfactura__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H02BU4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV30FacCodfrom ,
                                          int AV31FacCodto ,
                                          java.util.Date AV34FacFchfrom ,
                                          java.util.Date AV35FacFchto ,
                                          int AV14CliCodfrom ,
                                          int AV16CliCodto ,
                                          int A430FacCod ,
                                          java.util.Date A436FacFch ,
                                          int A252CliCod ,
                                          String AV26EmprCod ,
                                          byte AV32FacEst ,
                                          byte AV33FacEstto ,
                                          String AV49PRIO )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[10];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM TXPCFAVEN" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(FacEst >= ?)");
      addWhere(sWhereString, "(FacEst <= ?)");
      addWhere(sWhereString, "(FacPri = ?)");
      addWhere(sWhereString, "(FacTipFac = 0)");
      if ( ! (0==AV30FacCodfrom) )
      {
         addWhere(sWhereString, "(FacCod >= ?)");
      }
      else
      {
         GXv_int12[4] = (byte)(1) ;
      }
      if ( ! (0==AV31FacCodto) )
      {
         addWhere(sWhereString, "(FacCod <= ?)");
      }
      else
      {
         GXv_int12[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV34FacFchfrom)) )
      {
         addWhere(sWhereString, "(FacFch >= ?)");
      }
      else
      {
         GXv_int12[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV35FacFchto)) )
      {
         addWhere(sWhereString, "(FacFch <= ?)");
      }
      else
      {
         GXv_int12[7] = (byte)(1) ;
      }
      if ( ! (0==AV14CliCodfrom) )
      {
         addWhere(sWhereString, "(CliCod >= ?)");
      }
      else
      {
         GXv_int12[8] = (byte)(1) ;
      }
      if ( ! (0==AV16CliCodto) )
      {
         addWhere(sWhereString, "(CliCod <= ?)");
      }
      else
      {
         GXv_int12[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_H02BU6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV30FacCodfrom ,
                                          int AV31FacCodto ,
                                          java.util.Date AV34FacFchfrom ,
                                          java.util.Date AV35FacFchto ,
                                          int AV14CliCodfrom ,
                                          int AV16CliCodto ,
                                          int A430FacCod ,
                                          java.util.Date A436FacFch ,
                                          int A252CliCod ,
                                          byte A435FacEst ,
                                          byte AV32FacEst ,
                                          byte AV33FacEstto ,
                                          String A450FacPri ,
                                          String AV49PRIO ,
                                          byte A1153FacTipFac ,
                                          String AV26EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[10];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.FacTipFac, T1.FacPri, T1.CliCod, T1.FacFch, T1.FacCod, T1.FacEst, T1.EmprCod, T2.CliNom FROM (TXPCFAVEN T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.FacEst >= ?)");
      addWhere(sWhereString, "(T1.FacEst <= ?)");
      addWhere(sWhereString, "(T1.FacPri = ?)");
      addWhere(sWhereString, "(T1.FacTipFac = 0)");
      if ( ! (0==AV30FacCodfrom) )
      {
         addWhere(sWhereString, "(T1.FacCod >= ?)");
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
      }
      if ( ! (0==AV31FacCodto) )
      {
         addWhere(sWhereString, "(T1.FacCod <= ?)");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV34FacFchfrom)) )
      {
         addWhere(sWhereString, "(T1.FacFch >= ?)");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV35FacFchto)) )
      {
         addWhere(sWhereString, "(T1.FacFch <= ?)");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( ! (0==AV14CliCodfrom) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( ! (0==AV16CliCodto) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.FacCod" ;
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
            case 2 :
                  return conditional_H02BU4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] );
            case 4 :
                  return conditional_H02BU6(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , (String)dynConstraints[16] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02BU2", "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT  DtCreat, ZipUrl, ZipPath, JobStat, TotItem, PrgPct, PrcItem, ErItem, OkItem, JobType, JobDesc, JobId FROM TXPJOB WHERE JobType = 'FATURA' ORDER BY DtCreat DESC) GX_CTE) WHERE GX_ROW_NUMBER BETWEEN ? AND ? OR ? < ? AND GX_ROW_NUMBER >= ?",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02BU3", "SELECT COUNT(*) FROM TXPJOB WHERE JobType = 'FATURA' ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02BU4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02BU5", "SELECT ItmId, JobId, DocId FROM TXPJOBITE WHERE JobId = ? ORDER BY JobId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02BU6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02BU7", "SELECT EmprCod, CliAct, CliNom, CliCod FROM TXPCLIENT WHERE CliAct = 'S' ORDER BY CliNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02BU8", "SELECT EmprCod, CliAct, CliNom, CliCod FROM TXPCLIENT WHERE CliAct = 'S' ORDER BY CliNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02BU9", "SELECT T1.EmprCod, T1.FacCod, T1.FacFch, T1.CliCod, T2.CliNom, T2.Cliemf, T1.FacEnvMail FROM (TXPCFAVEN T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.FacCod = ? ORDER BY T1.EmprCod, T1.FacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02BU10", "SELECT JobId, ZipUrl FROM TXPJOB WHERE JobId = ? ORDER BY JobId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H02BU11", "SELECT JobId, ZipPath FROM TXPJOB WHERE JobId = ? ORDER BY JobId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((long[]) buf[12])[0] = rslt.getLong(7);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((long[]) buf[14])[0] = rslt.getLong(8);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((long[]) buf[16])[0] = rslt.getLong(9);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.util.UUID[]) buf[22])[0] = rslt.getGUID(12);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((java.util.UUID[]) buf[1])[0] = rslt.getGUID(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 4 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 40);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               return;
            case 8 :
               ((java.util.UUID[]) buf[0])[0] = rslt.getGUID(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 9 :
               ((java.util.UUID[]) buf[0])[0] = rslt.getGUID(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[11]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[12]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[16]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[17]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               return;
            case 3 :
               stmt.setGUID(1, (java.util.UUID)parms[0]);
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[11]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[12]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[16]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[17]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               return;
            case 7 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 8 :
               stmt.setGUID(1, (java.util.UUID)parms[0]);
               return;
            case 9 :
               stmt.setGUID(1, (java.util.UUID)parms[0]);
               return;
      }
   }

}

