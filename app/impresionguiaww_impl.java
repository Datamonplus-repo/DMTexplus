package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class impresionguiaww_impl extends GXDataArea
{
   public impresionguiaww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public impresionguiaww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( impresionguiaww_impl.class ));
   }

   public impresionguiaww_impl( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavPrio = new HTMLChoice();
      cmbavManaut = new HTMLChoice();
      chkavVermail = UIFactory.getCheckbox(this);
      cmbavCopias2 = new HTMLChoice();
      chkavSelected = UIFactory.getCheckbox(this);
      chkCliValA = UIFactory.getCheckbox(this);
      chkCliMailGrE = UIFactory.getCheckbox(this);
      chkCliMailPkE = UIFactory.getCheckbox(this);
      chkBarTipCor = UIFactory.getCheckbox(this);
      chkavSelectall = UIFactory.getCheckbox(this);
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetNextPar( ) ;
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
            gxfirstwebparm = httpContext.GetNextPar( ) ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetNextPar( ) ;
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
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgrid_newrow_invoke( )
   {
      nRC_GXsfl_124 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_124"))) ;
      nGXsfl_124_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_124_idx"))) ;
      sGXsfl_124_idx = httpContext.GetPar( "sGXsfl_124_idx") ;
      chkavSelected.setTitleFormat( (short)(GXutil.lval( httpContext.GetNextPar( ))) );
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
      AV21AlbProfchfrom = localUtil.parseDateParm( httpContext.GetPar( "AlbProfchfrom")) ;
      AV22AlbProfchto = localUtil.parseDateParm( httpContext.GetPar( "AlbProfchto")) ;
      AV19AlbProCodfrom = GXutil.lval( httpContext.GetPar( "AlbProCodfrom")) ;
      AV20AlbProCodto = GXutil.lval( httpContext.GetPar( "AlbProCodto")) ;
      cmbavPrio.fromJSonString( httpContext.GetNextPar( ));
      AV18PRIO = httpContext.GetPar( "PRIO") ;
      cmbavManaut.fromJSonString( httpContext.GetNextPar( ));
      AV15ManAut = httpContext.GetPar( "ManAut") ;
      AV23CliCodfrom = (int)(GXutil.lval( httpContext.GetPar( "CliCodfrom"))) ;
      AV24CliCodto = (int)(GXutil.lval( httpContext.GetPar( "CliCodto"))) ;
      AV44EmprCod = httpContext.GetPar( "EmprCod") ;
      AV91LoadGridData = GXutil.strtobool( httpContext.GetPar( "LoadGridData")) ;
      AV67EmprCodJson = httpContext.GetPar( "EmprCodJson") ;
      AV71AlbProCodJson = httpContext.GetPar( "AlbProCodJson") ;
      AV75BarCodJson = httpContext.GetPar( "BarCodJson") ;
      AV79BarCodReoJson = httpContext.GetPar( "BarCodReoJson") ;
      AV83BarCodParJson = httpContext.GetPar( "BarCodParJson") ;
      AV125Pgmname = httpContext.GetPar( "Pgmname") ;
      chkavSelected.setTitleFormat( (short)(GXutil.lval( httpContext.GetNextPar( ))) );
      AV17PATHPDF = httpContext.GetPar( "PATHPDF") ;
      cmbavCopias2.fromJSonString( httpContext.GetNextPar( ));
      AV14Copias2 = (short)(GXutil.lval( httpContext.GetPar( "Copias2"))) ;
      AV65i = GXutil.lval( httpContext.GetPar( "i")) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV66EmprCodCol);
      AV69EmprCodToFind = httpContext.GetPar( "EmprCodToFind") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV70AlbProCodCol);
      AV73AlbProCodToFind = GXutil.lval( httpContext.GetPar( "AlbProCodToFind")) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV74BarCodCol);
      AV77BarCodToFind = (int)(GXutil.lval( httpContext.GetPar( "BarCodToFind"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV78BarCodReoCol);
      AV81BarCodReoToFind = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReoToFind"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV82BarCodParCol);
      AV85BarCodParToFind = httpContext.GetPar( "BarCodParToFind") ;
      AV16VerMail = GXutil.strtobool( httpContext.GetPar( "VerMail")) ;
      AV86SelectAll = GXutil.strtobool( httpContext.GetPar( "SelectAll")) ;
      AV110CliNom = httpContext.GetPar( "CliNom") ;
      AV108Usumail = httpContext.GetPar( "Usumail") ;
      AV45EmprNom = httpContext.GetPar( "EmprNom") ;
      AV116MostrarMail = GXutil.strtobool( httpContext.GetPar( "MostrarMail")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV21AlbProfchfrom, AV22AlbProfchto, AV19AlbProCodfrom, AV20AlbProCodto, AV18PRIO, AV15ManAut, AV23CliCodfrom, AV24CliCodto, AV44EmprCod, AV91LoadGridData, AV67EmprCodJson, AV71AlbProCodJson, AV75BarCodJson, AV79BarCodReoJson, AV83BarCodParJson, AV125Pgmname, AV17PATHPDF, AV14Copias2, AV65i, AV66EmprCodCol, AV69EmprCodToFind, AV70AlbProCodCol, AV73AlbProCodToFind, AV74BarCodCol, AV77BarCodToFind, AV78BarCodReoCol, AV81BarCodReoToFind, AV82BarCodParCol, AV85BarCodParToFind, AV16VerMail, AV86SelectAll, AV110CliNom, AV108Usumail, AV45EmprNom, AV116MostrarMail) ;
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
      pa2972( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2972( ) ;
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
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.impresionguiaww", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV110CliNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSUMAIL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV108Usumail, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV45EmprNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV44EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMOSTRARMAIL", getSecureSignedToken( "", AV116MostrarMail));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"ImpresionGuiaww");
      AV16VerMail = GXutil.strtobool( GXutil.booltostr( AV16VerMail)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16VerMail", AV16VerMail);
      forbiddenHiddens.add("VerMail", GXutil.booltostr( AV16VerMail));
      forbiddenHiddens.add("PATHPDF", GXutil.rtrim( localUtil.format( AV17PATHPDF, "")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV125Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("impresionguiaww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vALBPROFCHFROM", localUtil.format(AV21AlbProfchfrom, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vALBPROFCHTO", localUtil.format(AV22AlbProfchto, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vALBPROCODFROM", GXutil.ltrim( localUtil.ntoc( AV19AlbProCodfrom, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vALBPROCODTO", GXutil.ltrim( localUtil.ntoc( AV20AlbProCodto, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vPRIO", GXutil.rtrim( AV18PRIO));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vMANAUT", GXutil.rtrim( AV15ManAut));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vCLICODFROM", GXutil.ltrim( localUtil.ntoc( AV23CliCodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vCLICODTO", GXutil.ltrim( localUtil.ntoc( AV24CliCodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_124", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_124, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICODFROM_DATA", AV40CliCodfrom_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICODFROM_DATA", AV40CliCodfrom_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICODTO_DATA", AV42CliCodto_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICODTO_DATA", AV42CliCodto_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV38GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV39GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vLOADGRIDDATA", AV91LoadGridData);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCODJSON", AV67EmprCodJson);
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROCODJSON", AV71AlbProCodJson);
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODJSON", AV75BarCodJson);
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREOJSON", AV79BarCodReoJson);
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPARJSON", AV83BarCodParJson);
      app.GxWebStd.gx_hidden_field( httpContext, "vI", GXutil.ltrim( localUtil.ntoc( AV65i, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vEMPRCODCOL", AV66EmprCodCol);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vEMPRCODCOL", AV66EmprCodCol);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCODTOFIND", GXutil.rtrim( AV69EmprCodToFind));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vALBPROCODCOL", AV70AlbProCodCol);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vALBPROCODCOL", AV70AlbProCodCol);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROCODTOFIND", GXutil.ltrim( localUtil.ntoc( AV73AlbProCodToFind, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vBARCODCOL", AV74BarCodCol);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vBARCODCOL", AV74BarCodCol);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODTOFIND", GXutil.ltrim( localUtil.ntoc( AV77BarCodToFind, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vBARCODREOCOL", AV78BarCodReoCol);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vBARCODREOCOL", AV78BarCodReoCol);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREOTOFIND", GXutil.ltrim( localUtil.ntoc( AV81BarCodReoToFind, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vBARCODPARCOL", AV82BarCodParCol);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vBARCODPARCOL", AV82BarCodParCol);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPARTOFIND", GXutil.rtrim( AV85BarCodParToFind));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSELECTEDROWS", AV63SelectedRows);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSELECTEDROWS", AV63SelectedRows);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTEXTOSEPARADOR", AV105TextoSeparador);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vLISTACORREOSDESTINO", AV107ListaCorreosDestino);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vLISTACORREOSDESTINO", AV107ListaCorreosDestino);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vLISTACORREOSCOPIA", AV113ListaCorreosCopia);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vLISTACORREOSCOPIA", AV113ListaCorreosCopia);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vLISTACORREOSCOPIAOCULTA", AV111ListaCorreosCopiaOculta);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vLISTACORREOSCOPIAOCULTA", AV111ListaCorreosCopiaOculta);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vASUNTO", AV119Asunto);
      app.GxWebStd.gx_hidden_field( httpContext, "vTEXTOCORREO", AV112TextoCorreo);
      app.GxWebStd.gx_hidden_field( httpContext, "vICON_GXI", AV128Icon_GXI);
      app.GxWebStd.gx_hidden_field( httpContext, "vCLIMAILGR", GXutil.rtrim( AV109CliMailGr));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLINOM", GXutil.rtrim( AV110CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV110CliNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSUMAIL", GXutil.rtrim( AV108Usumail));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSUMAIL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV108Usumail, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRNOM", GXutil.rtrim( AV45EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV45EmprNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPATHXLS_EMAIL", AV102PathXLS_Email);
      app.GxWebStd.gx_hidden_field( httpContext, "vPATHPDF_EMAIL", AV101PathPDF_Email);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV44EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV44EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROPRI", GXutil.rtrim( A39AlbProPri));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vNOMBRESADJUNTOS", AV104NombresAdjuntos);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vNOMBRESADJUNTOS", AV104NombresAdjuntos);
      }
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vMOSTRARMAIL", AV116MostrarMail);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMOSTRARMAIL", getSecureSignedToken( "", AV116MostrarMail));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Cls", GXutil.rtrim( Combo_clicodfrom_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Selectedvalue_set", GXutil.rtrim( Combo_clicodfrom_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Emptyitemtext", GXutil.rtrim( Combo_clicodfrom_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Cls", GXutil.rtrim( Combo_clicodto_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Selectedvalue_set", GXutil.rtrim( Combo_clicodto_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Emptyitemtext", GXutil.rtrim( Combo_clicodto_Emptyitemtext));
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Selectedvalue_get", GXutil.rtrim( Combo_clicodto_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Selectedvalue_get", GXutil.rtrim( Combo_clicodfrom_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "vSELECTED_Titleformat", GXutil.ltrim( localUtil.ntoc( chkavSelected.getTitleFormat(), (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
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
         we2972( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2972( ) ;
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
      return formatLink("app.impresionguiaww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "ImpresionGuiaww" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Impression de Guias", "") ;
   }

   public void wb2970( )
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
         app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", divLayoutmaintable_Class, "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divDivheader_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "header");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_clicodfrom_Internalname, httpContext.getMessage( "Cliente Inicial", ""), "", "", lblTextblockcombo_clicodfrom_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ImpresionGuiaww.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_clicodfrom.setProperty("Caption", Combo_clicodfrom_Caption);
         ucCombo_clicodfrom.setProperty("Cls", Combo_clicodfrom_Cls);
         ucCombo_clicodfrom.setProperty("EmptyItemText", Combo_clicodfrom_Emptyitemtext);
         ucCombo_clicodfrom.setProperty("DropDownOptionsData", AV40CliCodfrom_Data);
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_clicodto_Internalname, httpContext.getMessage( "Cliente Final", ""), "", "", lblTextblockcombo_clicodto_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ImpresionGuiaww.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_clicodto.setProperty("Caption", Combo_clicodto_Caption);
         ucCombo_clicodto.setProperty("Cls", Combo_clicodto_Cls);
         ucCombo_clicodto.setProperty("EmptyItemText", Combo_clicodto_Emptyitemtext);
         ucCombo_clicodto.setProperty("DropDownOptionsData", AV42CliCodto_Data);
         ucCombo_clicodto.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clicodto_Internalname, "COMBO_CLICODTOContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprofchfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprofchfrom_Internalname, httpContext.getMessage( "Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavAlbprofchfrom_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprofchfrom_Internalname, localUtil.format(AV21AlbProfchfrom, "99/99/99"), localUtil.format( AV21AlbProfchfrom, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,48);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprofchfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprofchfrom_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ImpresionGuiaww.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavAlbprofchfrom_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavAlbprofchfrom_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ImpresionGuiaww.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprofchto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprofchto_Internalname, httpContext.getMessage( "Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavAlbprofchto_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprofchto_Internalname, localUtil.format(AV22AlbProfchto, "99/99/99"), localUtil.format( AV22AlbProfchto, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,52);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprofchto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprofchto_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ImpresionGuiaww.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavAlbprofchto_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavAlbprofchto_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ImpresionGuiaww.htm");
         httpContext.writeTextNL( "</div>") ;
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprocodfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprocodfrom_Internalname, httpContext.getMessage( "Nº Documento Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprocodfrom_Internalname, GXutil.ltrim( localUtil.ntoc( AV19AlbProCodfrom, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbprocodfrom_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV19AlbProCodfrom), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV19AlbProCodfrom), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,63);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprocodfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprocodfrom_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ImpresionGuiaww.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprocodto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprocodto_Internalname, httpContext.getMessage( "Nº Documento Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprocodto_Internalname, GXutil.ltrim( localUtil.ntoc( AV20AlbProCodto, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbprocodto_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV20AlbProCodto), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV20AlbProCodto), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,67);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprocodto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprocodto_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ImpresionGuiaww.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavPrio.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavPrio.getInternalname(), httpContext.getMessage( "Tipo de Guia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavPrio, cmbavPrio.getInternalname(), GXutil.rtrim( AV18PRIO), 1, cmbavPrio.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavPrio.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,74);\"", "", true, (byte)(0), "HLP_ImpresionGuiaww.htm");
         cmbavPrio.setValue( GXutil.rtrim( AV18PRIO) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavPrio.getInternalname(), "Values", cmbavPrio.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavManaut.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavManaut.getInternalname(), httpContext.getMessage( "Tipo de Impresion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavManaut, cmbavManaut.getInternalname(), GXutil.rtrim( AV15ManAut), 1, cmbavManaut.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavManaut.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,78);\"", "", true, (byte)(0), "HLP_ImpresionGuiaww.htm");
         cmbavManaut.setValue( GXutil.rtrim( AV15ManAut) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavManaut.getInternalname(), "Values", cmbavManaut.ToJavascriptSource(), true);
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
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable_acciones_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucBarradeprogreso.render(context, "gxprogressindicator", Barradeprogreso_Internalname, "BARRADEPROGRESOContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_search_Internalname, "gx.evt.setGridEvt("+GXutil.str( 124, 3, 0)+","+"null"+");", httpContext.getMessage( "Ver resultado", ""), bttBtn_search_Jsonclick, 5, httpContext.getMessage( "GX_BtnSearch", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOSEARCH\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ImpresionGuiaww.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "header");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop24", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableoptions_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divTableaction_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+chkavVermail.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavVermail.getInternalname(), httpContext.getMessage( "Veja a ecran de envio de correio?", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavVermail.getInternalname(), GXutil.booltostr( AV16VerMail), "", httpContext.getMessage( "Veja a ecran de envio de correio?", ""), 1, chkavVermail.getEnabled(), "true", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(101, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,101);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavPathpdf_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPathpdf_Internalname, httpContext.getMessage( "Path", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPathpdf_Internalname, GXutil.rtrim( AV17PATHPDF), GXutil.rtrim( localUtil.format( AV17PATHPDF, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,105);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPathpdf_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPathpdf_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ImpresionGuiaww.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+cmbavCopias2.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavCopias2.getInternalname(), httpContext.getMessage( "Copias", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavCopias2, cmbavCopias2.getInternalname(), GXutil.trim( GXutil.str( AV14Copias2, 4, 0)), 1, cmbavCopias2.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavCopias2.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,109);\"", "", true, (byte)(0), "HLP_ImpresionGuiaww.htm");
         cmbavCopias2.setValue( GXutil.trim( GXutil.str( AV14Copias2, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCopias2.getInternalname(), "Values", cmbavCopias2.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavInfo_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavInfo_Internalname, AV115Info, GXutil.rtrim( localUtil.format( AV115Info, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,113);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavInfo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavInfo_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ImpresionGuiaww.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;align-self:flex-end;", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 115,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial WWPBtnNeedMultiRowSelection" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnprocessar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 124, 3, 0)+","+"null"+");", httpContext.getMessage( "Processar", ""), bttBtnprocessar_Jsonclick, 5, httpContext.getMessage( "Clique para processar os relatorios!", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOPROCESSAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ImpresionGuiaww.htm");
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
         startgridcontrol124( ) ;
      }
      if ( wbEnd == 124 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_124 = (int)(nGXsfl_124_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV38GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV39GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV125Pgmname), GXutil.rtrim( localUtil.format( AV125Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ImpresionGuiaww.htm");
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
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 158,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicodfrom_Internalname, GXutil.ltrim( localUtil.ntoc( AV23CliCodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV23CliCodfrom), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,158);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicodfrom_Jsonclick, 0, "Attribute", "", "", "", "", edtavClicodfrom_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ImpresionGuiaww.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 159,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicodto_Internalname, GXutil.ltrim( localUtil.ntoc( AV24CliCodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV24CliCodto), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,159);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicodto_Jsonclick, 0, "Attribute", "", "", "", "", edtavClicodto_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ImpresionGuiaww.htm");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 160,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavSelectall.getInternalname(), GXutil.booltostr( AV86SelectAll), "", "", chkavSelectall.getVisible(), 1, "true", "", StyleString, ClassString, "", "", TempTags+" onblur=\""+""+";gx.evt.onblur(this,160);\"");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 124 )
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

   public void start2972( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Impression de Guias", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2970( ) ;
   }

   public void ws2972( )
   {
      start2972( ) ;
      evt2972( ) ;
   }

   public void evt2972( )
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
                           e112972 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "COMBO_CLICODTO.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e122972 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e132972 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e142972 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOSEARCH'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoSearch' */
                           e152972 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOPROCESSAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoProcessar' */
                           e162972 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VSELECTALL.CLICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e172972 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 11), "VICON.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 15), "VSELECTED.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 15), "VSELECTED.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 11), "VICON.CLICK") == 0 ) )
                        {
                           nGXsfl_124_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_124_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_124_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1242( ) ;
                           AV62Selected = GXutil.strtobool( httpContext.cgiGet( chkavSelected.getInternalname())) ;
                           httpContext.ajax_rsp_assign_attri("", false, chkavSelected.getInternalname(), AV62Selected);
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A30AlbProCod = localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A1243GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( edtGuiRemCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1244GuiRemCln = httpContext.cgiGet( edtGuiRemCln_Internalname) ;
                           A1902CliValA = ((GXutil.strcmp(httpContext.cgiGet( chkCliValA.getInternalname()), "S")==0) ? "S" : "N") ;
                           A11622CliMailGrE = ((GXutil.strcmp(httpContext.cgiGet( chkCliMailGrE.getInternalname()), "S")==0) ? "S" : "N") ;
                           A11620CliMailGr = httpContext.cgiGet( edtCliMailGr_Internalname) ;
                           A11623CliMailPkE = ((GXutil.strcmp(httpContext.cgiGet( chkCliMailPkE.getInternalname()), "S")==0) ? "S" : "N") ;
                           A11621CliMailPk = httpContext.cgiGet( edtCliMailPk_Internalname) ;
                           A34AlbProfch = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtAlbProfch_Internalname), 0)) ;
                           A5291BarTipCor = ((GXutil.strcmp(httpContext.cgiGet( chkBarTipCor.getInternalname()), "SI")==0) ? "SI" : "NO") ;
                           A10301Cod_pais = (short)(localUtil.ctol( httpContext.cgiGet( edtCod_pais_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n10301Cod_pais = false ;
                           A33AlbProEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbProEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           AV87Icon = httpContext.cgiGet( edtavIcon_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavIcon_Internalname, "Bitmap", ((GXutil.strcmp("", AV87Icon)==0) ? AV128Icon_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV87Icon))), !bGXsfl_124_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavIcon_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV87Icon), true);
                           AV98Grid_PathPdf = httpContext.cgiGet( edtavGrid_pathpdf_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavGrid_pathpdf_Internalname, AV98Grid_PathPdf);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRID_PATHPDF"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, GXutil.rtrim( localUtil.format( AV98Grid_PathPdf, ""))));
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGrid_nmrcopia_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGrid_nmrcopia_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGRID_NMRCOPIA");
                              GX_FocusControl = edtavGrid_nmrcopia_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV100Grid_NmrCopia = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavGrid_nmrcopia_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV100Grid_NmrCopia), 4, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRID_NMRCOPIA"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, localUtil.format( DecimalUtil.doubleToDec(AV100Grid_NmrCopia), "ZZZ9")));
                           }
                           else
                           {
                              AV100Grid_NmrCopia = (short)(localUtil.ctol( httpContext.cgiGet( edtavGrid_nmrcopia_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavGrid_nmrcopia_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV100Grid_NmrCopia), 4, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRID_NMRCOPIA"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, localUtil.format( DecimalUtil.doubleToDec(AV100Grid_NmrCopia), "ZZZ9")));
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
                                 e182972 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e192972 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e202972 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VICON.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e212972 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VSELECTED.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e222972 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Albprofchfrom Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vALBPROFCHFROM"), 0), AV21AlbProfchfrom) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Albprofchto Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vALBPROFCHTO"), 0), AV22AlbProfchto) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Albprocodfrom Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vALBPROCODFROM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV19AlbProCodfrom )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Albprocodto Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vALBPROCODTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV20AlbProCodto )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Prio Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vPRIO"), AV18PRIO) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Manaut Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vMANAUT"), AV15ManAut) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Clicodfrom Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLICODFROM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV23CliCodfrom )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Clicodto Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLICODTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV24CliCodto )
                                    {
                                       Rfr0gs = true ;
                                    }
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

   public void we2972( )
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

   public void pa2972( )
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
            GX_FocusControl = edtavAlbprofchfrom_Internalname ;
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
      subsflControlProps_1242( ) ;
      while ( nGXsfl_124_idx <= nRC_GXsfl_124 )
      {
         sendrow_1242( ) ;
         nGXsfl_124_idx = ((subGrid_Islastpage==1)&&(nGXsfl_124_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_124_idx+1) ;
         sGXsfl_124_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_124_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1242( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 java.util.Date AV21AlbProfchfrom ,
                                 java.util.Date AV22AlbProfchto ,
                                 long AV19AlbProCodfrom ,
                                 long AV20AlbProCodto ,
                                 String AV18PRIO ,
                                 String AV15ManAut ,
                                 int AV23CliCodfrom ,
                                 int AV24CliCodto ,
                                 String AV44EmprCod ,
                                 boolean AV91LoadGridData ,
                                 String AV67EmprCodJson ,
                                 String AV71AlbProCodJson ,
                                 String AV75BarCodJson ,
                                 String AV79BarCodReoJson ,
                                 String AV83BarCodParJson ,
                                 String AV125Pgmname ,
                                 String AV17PATHPDF ,
                                 short AV14Copias2 ,
                                 long AV65i ,
                                 GXSimpleCollection<String> AV66EmprCodCol ,
                                 String AV69EmprCodToFind ,
                                 GXSimpleCollection<Long> AV70AlbProCodCol ,
                                 long AV73AlbProCodToFind ,
                                 GXSimpleCollection<Integer> AV74BarCodCol ,
                                 int AV77BarCodToFind ,
                                 GXSimpleCollection<Byte> AV78BarCodReoCol ,
                                 byte AV81BarCodReoToFind ,
                                 GXSimpleCollection<String> AV82BarCodParCol ,
                                 String AV85BarCodParToFind ,
                                 boolean AV16VerMail ,
                                 boolean AV86SelectAll ,
                                 String AV110CliNom ,
                                 String AV108Usumail ,
                                 String AV45EmprNom ,
                                 boolean AV116MostrarMail )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e192972 ();
      GRID_nCurrentRecord = 0 ;
      rf2972( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"ImpresionGuiaww");
      AV16VerMail = GXutil.strtobool( GXutil.booltostr( AV16VerMail)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16VerMail", AV16VerMail);
      forbiddenHiddens.add("VerMail", GXutil.booltostr( AV16VerMail));
      forbiddenHiddens.add("PATHPDF", GXutil.rtrim( localUtil.format( AV17PATHPDF, "")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV125Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("impresionguiaww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRID_PATHPDF", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV98Grid_PathPdf, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRID_PATHPDF", AV98Grid_PathPdf);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRID_NMRCOPIA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV100Grid_NmrCopia), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRID_NMRCOPIA", GXutil.ltrim( localUtil.ntoc( AV100Grid_NmrCopia, (byte)(4), (byte)(0), ".", "")));
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
      if ( cmbavPrio.getItemCount() > 0 )
      {
         AV18PRIO = cmbavPrio.getValidValue(AV18PRIO) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18PRIO", AV18PRIO);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavPrio.setValue( GXutil.rtrim( AV18PRIO) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavPrio.getInternalname(), "Values", cmbavPrio.ToJavascriptSource(), true);
      }
      if ( cmbavManaut.getItemCount() > 0 )
      {
         AV15ManAut = cmbavManaut.getValidValue(AV15ManAut) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15ManAut", AV15ManAut);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavManaut.setValue( GXutil.rtrim( AV15ManAut) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavManaut.getInternalname(), "Values", cmbavManaut.ToJavascriptSource(), true);
      }
      AV16VerMail = GXutil.strtobool( GXutil.booltostr( AV16VerMail)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16VerMail", AV16VerMail);
      if ( cmbavCopias2.getItemCount() > 0 )
      {
         AV14Copias2 = (short)(GXutil.lval( cmbavCopias2.getValidValue(GXutil.trim( GXutil.str( AV14Copias2, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Copias2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14Copias2), 4, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavCopias2.setValue( GXutil.trim( GXutil.str( AV14Copias2, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCopias2.getInternalname(), "Values", cmbavCopias2.ToJavascriptSource(), true);
      }
      AV86SelectAll = GXutil.strtobool( GXutil.booltostr( AV86SelectAll)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86SelectAll", AV86SelectAll);
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf2972( ) ;
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
      AV125Pgmname = "ImpresionGuiaww" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV125Pgmname", AV125Pgmname);
      Gx_err = (short)(0) ;
      chkavVermail.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavVermail.getInternalname(), "Enabled", GXutil.ltrimstr( chkavVermail.getEnabled(), 5, 0), true);
      edtavPathpdf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPathpdf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPathpdf_Enabled), 5, 0), true);
      edtavInfo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavInfo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInfo_Enabled), 5, 0), true);
      edtavGrid_pathpdf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGrid_pathpdf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGrid_pathpdf_Enabled), 5, 0), !bGXsfl_124_Refreshing);
      edtavGrid_nmrcopia_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGrid_nmrcopia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGrid_nmrcopia_Enabled), 5, 0), !bGXsfl_124_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2972( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(124) ;
      /* Execute user event: Refresh */
      e192972 ();
      nGXsfl_124_idx = 1 ;
      sGXsfl_124_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_124_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1242( ) ;
      bGXsfl_124_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_1242( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Boolean.valueOf(AV91LoadGridData) ,
                                              Long.valueOf(AV19AlbProCodfrom) ,
                                              AV15ManAut ,
                                              Long.valueOf(AV20AlbProCodto) ,
                                              AV21AlbProfchfrom ,
                                              AV22AlbProfchto ,
                                              Integer.valueOf(AV23CliCodfrom) ,
                                              Integer.valueOf(AV24CliCodto) ,
                                              A396EmprCod ,
                                              Long.valueOf(A30AlbProCod) ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              A34AlbProfch ,
                                              Integer.valueOf(A1243GuiRemCli) ,
                                              Byte.valueOf(A33AlbProEst) ,
                                              A39AlbProPri ,
                                              AV18PRIO ,
                                              AV44EmprCod } ,
                                              new int[]{
                                              TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.LONG,
                                              TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         /* Using cursor H02972 */
         pr_default.execute(0, new Object[] {AV44EmprCod, AV18PRIO, Long.valueOf(AV19AlbProCodfrom), Long.valueOf(AV20AlbProCodto), AV21AlbProfchfrom, AV22AlbProfchto, Integer.valueOf(AV23CliCodfrom), Integer.valueOf(AV24CliCodto), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_124_idx = 1 ;
         sGXsfl_124_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_124_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1242( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A252CliCod = H02972_A252CliCod[0] ;
            n252CliCod = H02972_n252CliCod[0] ;
            A1253EmprGuiRem = H02972_A1253EmprGuiRem[0] ;
            A39AlbProPri = H02972_A39AlbProPri[0] ;
            A33AlbProEst = H02972_A33AlbProEst[0] ;
            A10301Cod_pais = H02972_A10301Cod_pais[0] ;
            n10301Cod_pais = H02972_n10301Cod_pais[0] ;
            A5291BarTipCor = H02972_A5291BarTipCor[0] ;
            A34AlbProfch = H02972_A34AlbProfch[0] ;
            A11621CliMailPk = H02972_A11621CliMailPk[0] ;
            A11623CliMailPkE = H02972_A11623CliMailPkE[0] ;
            A11620CliMailGr = H02972_A11620CliMailGr[0] ;
            A11622CliMailGrE = H02972_A11622CliMailGrE[0] ;
            A1902CliValA = H02972_A1902CliValA[0] ;
            A1244GuiRemCln = H02972_A1244GuiRemCln[0] ;
            A1243GuiRemCli = H02972_A1243GuiRemCli[0] ;
            A130BarCodPar = H02972_A130BarCodPar[0] ;
            A132BarCodReo = H02972_A132BarCodReo[0] ;
            A129BarCod = H02972_A129BarCod[0] ;
            A30AlbProCod = H02972_A30AlbProCod[0] ;
            A396EmprCod = H02972_A396EmprCod[0] ;
            A252CliCod = H02972_A252CliCod[0] ;
            n252CliCod = H02972_n252CliCod[0] ;
            A5291BarTipCor = H02972_A5291BarTipCor[0] ;
            A1253EmprGuiRem = H02972_A1253EmprGuiRem[0] ;
            A39AlbProPri = H02972_A39AlbProPri[0] ;
            A33AlbProEst = H02972_A33AlbProEst[0] ;
            A34AlbProfch = H02972_A34AlbProfch[0] ;
            A1243GuiRemCli = H02972_A1243GuiRemCli[0] ;
            A1244GuiRemCln = H02972_A1244GuiRemCln[0] ;
            A10301Cod_pais = H02972_A10301Cod_pais[0] ;
            n10301Cod_pais = H02972_n10301Cod_pais[0] ;
            A11621CliMailPk = H02972_A11621CliMailPk[0] ;
            A11623CliMailPkE = H02972_A11623CliMailPkE[0] ;
            A11620CliMailGr = H02972_A11620CliMailGr[0] ;
            A11622CliMailGrE = H02972_A11622CliMailGrE[0] ;
            A1902CliValA = H02972_A1902CliValA[0] ;
            e202972 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(124) ;
         wb2970( ) ;
      }
      bGXsfl_124_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2972( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRID_PATHPDF"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, GXutil.rtrim( localUtil.format( AV98Grid_PathPdf, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRID_NMRCOPIA"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, localUtil.format( DecimalUtil.doubleToDec(AV100Grid_NmrCopia), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLINOM", GXutil.rtrim( AV110CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV110CliNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSUMAIL", GXutil.rtrim( AV108Usumail));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSUMAIL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV108Usumail, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRNOM", GXutil.rtrim( AV45EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV45EmprNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV44EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV44EmprCod, "@!"))));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vMOSTRARMAIL", AV116MostrarMail);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMOSTRARMAIL", getSecureSignedToken( "", AV116MostrarMail));
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
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Boolean.valueOf(AV91LoadGridData) ,
                                           Long.valueOf(AV19AlbProCodfrom) ,
                                           AV15ManAut ,
                                           Long.valueOf(AV20AlbProCodto) ,
                                           AV21AlbProfchfrom ,
                                           AV22AlbProfchto ,
                                           Integer.valueOf(AV23CliCodfrom) ,
                                           Integer.valueOf(AV24CliCodto) ,
                                           A396EmprCod ,
                                           Long.valueOf(A30AlbProCod) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A34AlbProfch ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           Byte.valueOf(A33AlbProEst) ,
                                           A39AlbProPri ,
                                           AV18PRIO ,
                                           AV44EmprCod } ,
                                           new int[]{
                                           TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.LONG,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor H02973 */
      pr_default.execute(1, new Object[] {AV44EmprCod, AV18PRIO, Long.valueOf(AV19AlbProCodfrom), Long.valueOf(AV20AlbProCodto), AV21AlbProfchfrom, AV22AlbProfchto, Integer.valueOf(AV23CliCodfrom), Integer.valueOf(AV24CliCodto)});
      GRID_nRecordCount = H02973_AGRID_nRecordCount[0] ;
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
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV21AlbProfchfrom, AV22AlbProfchto, AV19AlbProCodfrom, AV20AlbProCodto, AV18PRIO, AV15ManAut, AV23CliCodfrom, AV24CliCodto, AV44EmprCod, AV91LoadGridData, AV67EmprCodJson, AV71AlbProCodJson, AV75BarCodJson, AV79BarCodReoJson, AV83BarCodParJson, AV125Pgmname, AV17PATHPDF, AV14Copias2, AV65i, AV66EmprCodCol, AV69EmprCodToFind, AV70AlbProCodCol, AV73AlbProCodToFind, AV74BarCodCol, AV77BarCodToFind, AV78BarCodReoCol, AV81BarCodReoToFind, AV82BarCodParCol, AV85BarCodParToFind, AV16VerMail, AV86SelectAll, AV110CliNom, AV108Usumail, AV45EmprNom, AV116MostrarMail) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
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
         gxgrgrid_refresh( subGrid_Rows, AV21AlbProfchfrom, AV22AlbProfchto, AV19AlbProCodfrom, AV20AlbProCodto, AV18PRIO, AV15ManAut, AV23CliCodfrom, AV24CliCodto, AV44EmprCod, AV91LoadGridData, AV67EmprCodJson, AV71AlbProCodJson, AV75BarCodJson, AV79BarCodReoJson, AV83BarCodParJson, AV125Pgmname, AV17PATHPDF, AV14Copias2, AV65i, AV66EmprCodCol, AV69EmprCodToFind, AV70AlbProCodCol, AV73AlbProCodToFind, AV74BarCodCol, AV77BarCodToFind, AV78BarCodReoCol, AV81BarCodReoToFind, AV82BarCodParCol, AV85BarCodParToFind, AV16VerMail, AV86SelectAll, AV110CliNom, AV108Usumail, AV45EmprNom, AV116MostrarMail) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV21AlbProfchfrom, AV22AlbProfchto, AV19AlbProCodfrom, AV20AlbProCodto, AV18PRIO, AV15ManAut, AV23CliCodfrom, AV24CliCodto, AV44EmprCod, AV91LoadGridData, AV67EmprCodJson, AV71AlbProCodJson, AV75BarCodJson, AV79BarCodReoJson, AV83BarCodParJson, AV125Pgmname, AV17PATHPDF, AV14Copias2, AV65i, AV66EmprCodCol, AV69EmprCodToFind, AV70AlbProCodCol, AV73AlbProCodToFind, AV74BarCodCol, AV77BarCodToFind, AV78BarCodReoCol, AV81BarCodReoToFind, AV82BarCodParCol, AV85BarCodParToFind, AV16VerMail, AV86SelectAll, AV110CliNom, AV108Usumail, AV45EmprNom, AV116MostrarMail) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV21AlbProfchfrom, AV22AlbProfchto, AV19AlbProCodfrom, AV20AlbProCodto, AV18PRIO, AV15ManAut, AV23CliCodfrom, AV24CliCodto, AV44EmprCod, AV91LoadGridData, AV67EmprCodJson, AV71AlbProCodJson, AV75BarCodJson, AV79BarCodReoJson, AV83BarCodParJson, AV125Pgmname, AV17PATHPDF, AV14Copias2, AV65i, AV66EmprCodCol, AV69EmprCodToFind, AV70AlbProCodCol, AV73AlbProCodToFind, AV74BarCodCol, AV77BarCodToFind, AV78BarCodReoCol, AV81BarCodReoToFind, AV82BarCodParCol, AV85BarCodParToFind, AV16VerMail, AV86SelectAll, AV110CliNom, AV108Usumail, AV45EmprNom, AV116MostrarMail) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV21AlbProfchfrom, AV22AlbProfchto, AV19AlbProCodfrom, AV20AlbProCodto, AV18PRIO, AV15ManAut, AV23CliCodfrom, AV24CliCodto, AV44EmprCod, AV91LoadGridData, AV67EmprCodJson, AV71AlbProCodJson, AV75BarCodJson, AV79BarCodReoJson, AV83BarCodParJson, AV125Pgmname, AV17PATHPDF, AV14Copias2, AV65i, AV66EmprCodCol, AV69EmprCodToFind, AV70AlbProCodCol, AV73AlbProCodToFind, AV74BarCodCol, AV77BarCodToFind, AV78BarCodReoCol, AV81BarCodReoToFind, AV82BarCodParCol, AV85BarCodParToFind, AV16VerMail, AV86SelectAll, AV110CliNom, AV108Usumail, AV45EmprNom, AV116MostrarMail) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_date = GXutil.today( ) ;
      AV125Pgmname = "ImpresionGuiaww" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV125Pgmname", AV125Pgmname);
      Gx_err = (short)(0) ;
      chkavVermail.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavVermail.getInternalname(), "Enabled", GXutil.ltrimstr( chkavVermail.getEnabled(), 5, 0), true);
      edtavPathpdf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPathpdf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPathpdf_Enabled), 5, 0), true);
      edtavInfo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavInfo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInfo_Enabled), 5, 0), true);
      edtavGrid_pathpdf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGrid_pathpdf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGrid_pathpdf_Enabled), 5, 0), !bGXsfl_124_Refreshing);
      edtavGrid_nmrcopia_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGrid_nmrcopia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGrid_nmrcopia_Enabled), 5, 0), !bGXsfl_124_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2970( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e182972 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICODFROM_DATA"), AV40CliCodfrom_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICODTO_DATA"), AV42CliCodto_Data);
         /* Read saved values. */
         nRC_GXsfl_124 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_124"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV38GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV39GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Combo_clicodfrom_Cls = httpContext.cgiGet( "COMBO_CLICODFROM_Cls") ;
         Combo_clicodfrom_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLICODFROM_Selectedvalue_set") ;
         Combo_clicodfrom_Emptyitemtext = httpContext.cgiGet( "COMBO_CLICODFROM_Emptyitemtext") ;
         Combo_clicodto_Cls = httpContext.cgiGet( "COMBO_CLICODTO_Cls") ;
         Combo_clicodto_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLICODTO_Selectedvalue_set") ;
         Combo_clicodto_Emptyitemtext = httpContext.cgiGet( "COMBO_CLICODTO_Emptyitemtext") ;
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
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Fixedcolumns = httpContext.cgiGet( "GRID_EMPOWERER_Fixedcolumns") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Combo_clicodto_Selectedvalue_get = httpContext.cgiGet( "COMBO_CLICODTO_Selectedvalue_get") ;
         Combo_clicodfrom_Selectedvalue_get = httpContext.cgiGet( "COMBO_CLICODFROM_Selectedvalue_get") ;
         /* Read variables values. */
         if ( localUtil.vcdate( httpContext.cgiGet( edtavAlbprofchfrom_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vALBPROFCHFROM");
            GX_FocusControl = edtavAlbprofchfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV21AlbProfchfrom = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21AlbProfchfrom", localUtil.format(AV21AlbProfchfrom, "99/99/99"));
         }
         else
         {
            AV21AlbProfchfrom = localUtil.ctod( httpContext.cgiGet( edtavAlbprofchfrom_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21AlbProfchfrom", localUtil.format(AV21AlbProfchfrom, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavAlbprofchto_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vALBPROFCHTO");
            GX_FocusControl = edtavAlbprofchto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV22AlbProfchto = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22AlbProfchto", localUtil.format(AV22AlbProfchto, "99/99/99"));
         }
         else
         {
            AV22AlbProfchto = localUtil.ctod( httpContext.cgiGet( edtavAlbprofchto_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22AlbProfchto", localUtil.format(AV22AlbProfchto, "99/99/99"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbprocodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbprocodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBPROCODFROM");
            GX_FocusControl = edtavAlbprocodfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV19AlbProCodfrom = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19AlbProCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19AlbProCodfrom), 10, 0));
         }
         else
         {
            AV19AlbProCodfrom = localUtil.ctol( httpContext.cgiGet( edtavAlbprocodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19AlbProCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19AlbProCodfrom), 10, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbprocodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbprocodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBPROCODTO");
            GX_FocusControl = edtavAlbprocodto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV20AlbProCodto = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20AlbProCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20AlbProCodto), 10, 0));
         }
         else
         {
            AV20AlbProCodto = localUtil.ctol( httpContext.cgiGet( edtavAlbprocodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20AlbProCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20AlbProCodto), 10, 0));
         }
         cmbavPrio.setName( cmbavPrio.getInternalname() );
         cmbavPrio.setValue( httpContext.cgiGet( cmbavPrio.getInternalname()) );
         AV18PRIO = httpContext.cgiGet( cmbavPrio.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18PRIO", AV18PRIO);
         cmbavManaut.setName( cmbavManaut.getInternalname() );
         cmbavManaut.setValue( httpContext.cgiGet( cmbavManaut.getInternalname()) );
         AV15ManAut = httpContext.cgiGet( cmbavManaut.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15ManAut", AV15ManAut);
         AV16VerMail = GXutil.strtobool( httpContext.cgiGet( chkavVermail.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16VerMail", AV16VerMail);
         AV17PATHPDF = httpContext.cgiGet( edtavPathpdf_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17PATHPDF", AV17PATHPDF);
         cmbavCopias2.setName( cmbavCopias2.getInternalname() );
         cmbavCopias2.setValue( httpContext.cgiGet( cmbavCopias2.getInternalname()) );
         AV14Copias2 = (short)(GXutil.lval( httpContext.cgiGet( cmbavCopias2.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Copias2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14Copias2), 4, 0));
         AV115Info = httpContext.cgiGet( edtavInfo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV115Info", AV115Info);
         AV125Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV125Pgmname", AV125Pgmname);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICODFROM");
            GX_FocusControl = edtavClicodfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV23CliCodfrom = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23CliCodfrom), 6, 0));
         }
         else
         {
            AV23CliCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23CliCodfrom), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICODTO");
            GX_FocusControl = edtavClicodto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV24CliCodto = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24CliCodto), 6, 0));
         }
         else
         {
            AV24CliCodto = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24CliCodto), 6, 0));
         }
         AV86SelectAll = GXutil.strtobool( httpContext.cgiGet( chkavSelectall.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV86SelectAll", AV86SelectAll);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"ImpresionGuiaww");
         AV16VerMail = GXutil.strtobool( httpContext.cgiGet( chkavVermail.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16VerMail", AV16VerMail);
         forbiddenHiddens.add("VerMail", GXutil.booltostr( AV16VerMail));
         AV17PATHPDF = httpContext.cgiGet( edtavPathpdf_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17PATHPDF", AV17PATHPDF);
         forbiddenHiddens.add("PATHPDF", GXutil.rtrim( localUtil.format( AV17PATHPDF, "")));
         AV125Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV125Pgmname", AV125Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV125Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("impresionguiaww:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vALBPROFCHFROM"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV21AlbProfchfrom)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vALBPROFCHTO"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV22AlbProfchto)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vALBPROCODFROM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV19AlbProCodfrom )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vALBPROCODTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV20AlbProCodto )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vPRIO"), AV18PRIO) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vMANAUT"), AV15ManAut) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLICODFROM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV23CliCodfrom )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLICODTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV24CliCodto )
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
      e182972 ();
      if (returnInSub) return;
   }

   public void e182972( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV43Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      impresionguiaww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV43Station = GXt_char1 ;
      GXv_char2[0] = AV44EmprCod ;
      GXv_char3[0] = AV45EmprNom ;
      GXv_char4[0] = AV46UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV43Station, GXv_char2, GXv_char3, GXv_char4) ;
      impresionguiaww_impl.this.AV44EmprCod = GXv_char2[0] ;
      impresionguiaww_impl.this.AV45EmprNom = GXv_char3[0] ;
      impresionguiaww_impl.this.AV46UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44EmprCod", AV44EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV44EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV45EmprNom", AV45EmprNom);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV45EmprNom, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV46UsurCod", AV46UsurCod);
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
      chkavSelectall.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavSelectall.getInternalname(), "Visible", GXutil.ltrimstr( chkavSelectall.getVisible(), 5, 0), true);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Impression de Guias", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      chkavSelected.setTitleFormat( (short)(1) );
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      AV18PRIO = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18PRIO", AV18PRIO);
      AV47Copia[1-1] = "Original" ;
      AV47Copia[2-1] = "Duplicado" ;
      AV47Copia[3-1] = "Triplicado" ;
      AV47Copia[4-1] = "Quadriplicado" ;
      GXv_int5[0] = AV94Copias ;
      new app.pbuscon(remoteHandle, context).execute( AV44EmprCod, "100005", GXv_int5) ;
      impresionguiaww_impl.this.AV94Copias = (short)((short)(GXv_int5[0])) ;
      if ( AV94Copias == 0 )
      {
         AV94Copias = (short)(1) ;
      }
      AV14Copias2 = AV94Copias ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Copias2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14Copias2), 4, 0));
      AV15ManAut = "M" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15ManAut", AV15ManAut);
      GXt_char1 = AV17PATHPDF ;
      GXv_char4[0] = GXt_char1 ;
      new app.pbusemplin(remoteHandle, context).execute( AV44EmprCod, "WEBPDF", GXv_char4) ;
      impresionguiaww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV17PATHPDF = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17PATHPDF", AV17PATHPDF);
      AV17PATHPDF = GXutil.trim( AV17PATHPDF) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17PATHPDF", AV17PATHPDF);
      AV16VerMail = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16VerMail", AV16VerMail);
      AV96Ano = (short)(GXutil.year( Gx_date)) ;
      AV97Mes = (short)(GXutil.month( Gx_date)) ;
      AV92IniDate = localUtil.ymdtod( AV96Ano, 1, 1) ;
      AV93EndDate = GXutil.eomdate( Gx_date) ;
      AV21AlbProfchfrom = AV92IniDate ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21AlbProfchfrom", localUtil.format(AV21AlbProfchfrom, "99/99/99"));
      AV22AlbProfchto = AV93EndDate ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22AlbProfchto", localUtil.format(AV22AlbProfchto, "99/99/99"));
      GXt_int6 = (byte)(AV103Moda21) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, "MODA21", GXv_int7) ;
      impresionguiaww_impl.this.GXt_int6 = GXv_int7[0] ;
      AV103Moda21 = GXt_int6 ;
      /* Using cursor H02974 */
      pr_default.execute(2, new Object[] {AV46UsurCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A850UsurCod = H02974_A850UsurCod[0] ;
         A10513UsuMail = H02974_A10513UsuMail[0] ;
         AV108Usumail = A10513UsuMail ;
         httpContext.ajax_rsp_assign_attri("", false, "AV108Usumail", AV108Usumail);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSUMAIL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV108Usumail, ""))));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   public void e192972( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext8[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext8) ;
      AV6WWPContext = GXv_SdtWWPContext8[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      chkavSelected.setTitle( GXutil.format( "<input name=\"selectAllCheckbox\" type=\"checkbox\" value=\"Select All\" onchange=\"$(%1).click();\" class=\"AttributeCheckBox\" onMouseOver=\"WWPSelectAllRemoveParentOnClick(this)\" >", "'#"+chkavSelectall.getInternalname()+"'", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkavSelected.getInternalname(), "Title", chkavSelected.getTitle(), !bGXsfl_124_Refreshing);
      AV86SelectAll = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86SelectAll", AV86SelectAll);
      Gridpaginationbar_Emptygridcaption = (AV91LoadGridData ? httpContext.getMessage( "WWP_PagingEmptyGridCaption", "") : httpContext.getMessage( "WWP_PressSearchToShowData", "")) ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "EmptyGridCaption", Gridpaginationbar_Emptygridcaption);
      AV38GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38GridCurrentPage), 10, 0));
      AV39GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39GridPageCount), 10, 0));
      AV66EmprCodCol.fromJSonString(AV67EmprCodJson, null);
      AV70AlbProCodCol.fromJSonString(AV71AlbProCodJson, null);
      AV74BarCodCol.fromJSonString(AV75BarCodJson, null);
      AV78BarCodReoCol.fromJSonString(AV79BarCodReoJson, null);
      AV82BarCodParCol.fromJSonString(AV83BarCodParJson, null);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV66EmprCodCol", AV66EmprCodCol);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV70AlbProCodCol", AV70AlbProCodCol);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV74BarCodCol", AV74BarCodCol);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV78BarCodReoCol", AV78BarCodReoCol);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV82BarCodParCol", AV82BarCodParCol);
   }

   public void e152972( )
   {
      /* 'DoSearch' Routine */
      returnInSub = false ;
      AV91LoadGridData = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91LoadGridData", AV91LoadGridData);
      httpContext.doAjaxRefresh();
      if ( AV91LoadGridData )
      {
         this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "ClickElement", "", new Object[] {"#Title_DVPANEL_PANEL_FILTROSContainer"});
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV66EmprCodCol", AV66EmprCodCol);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV70AlbProCodCol", AV70AlbProCodCol);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV74BarCodCol", AV74BarCodCol);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV78BarCodReoCol", AV78BarCodReoCol);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV82BarCodParCol", AV82BarCodParCol);
   }

   public void e132972( )
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
         AV37PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV37PageToGo) ;
      }
   }

   public void e142972( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e202972( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV98Grid_PathPdf = AV17PATHPDF ;
      httpContext.ajax_rsp_assign_attri("", false, edtavGrid_pathpdf_Internalname, AV98Grid_PathPdf);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRID_PATHPDF"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, GXutil.rtrim( localUtil.format( AV98Grid_PathPdf, ""))));
      AV100Grid_NmrCopia = AV14Copias2 ;
      httpContext.ajax_rsp_assign_attri("", false, edtavGrid_nmrcopia_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV100Grid_NmrCopia), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRID_NMRCOPIA"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, localUtil.format( DecimalUtil.doubleToDec(AV100Grid_NmrCopia), "ZZZ9")));
      edtavIcon_Visible = 0 ;
      AV62Selected = false ;
      httpContext.ajax_rsp_assign_attri("", false, chkavSelected.getInternalname(), AV62Selected);
      if ( ( GXutil.strcmp(A11622CliMailGrE, "S") == 0 ) || ( GXutil.strcmp(A11623CliMailPkE, "S") == 0 ) )
      {
         edtavIcon_gximage = "Email" ;
         AV87Icon = context.getHttpContext().getImagePath( "1b09bc09-7c40-49bb-a9b2-73bc4af027c1", "", context.getHttpContext().getTheme( )) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavIcon_Internalname, AV87Icon);
         AV128Icon_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "1b09bc09-7c40-49bb-a9b2-73bc4af027c1", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         edtavIcon_Tooltiptext = httpContext.getMessage( "Liberado para enviar por mail !", "") ;
         edtavIcon_Visible = 1 ;
      }
      if ( ( GXutil.strcmp(A11622CliMailGrE, "S") == 0 ) && (GXutil.strcmp("", A11620CliMailGr)==0) )
      {
         edtavIcon_gximage = "EmailError" ;
         AV87Icon = context.getHttpContext().getImagePath( "b1ab6750-3ef5-4f59-b70d-90e710e751d7", "", context.getHttpContext().getTheme( )) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavIcon_Internalname, AV87Icon);
         AV128Icon_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "b1ab6750-3ef5-4f59-b70d-90e710e751d7", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         edtavIcon_Tooltiptext = httpContext.getMessage( "Guia Remessa : NO tiene mail", "") ;
      }
      if ( ( GXutil.strcmp(A11623CliMailPkE, "S") == 0 ) && (GXutil.strcmp("", A11621CliMailPk)==0) )
      {
         edtavIcon_gximage = "EmailError" ;
         AV87Icon = context.getHttpContext().getImagePath( "b1ab6750-3ef5-4f59-b70d-90e710e751d7", "", context.getHttpContext().getTheme( )) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavIcon_Internalname, AV87Icon);
         AV128Icon_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "b1ab6750-3ef5-4f59-b70d-90e710e751d7", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         edtavIcon_Tooltiptext = httpContext.getMessage( "Packing List : NO tiene mail", "") ;
      }
      AV69EmprCodToFind = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69EmprCodToFind", AV69EmprCodToFind);
      AV73AlbProCodToFind = A30AlbProCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73AlbProCodToFind", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73AlbProCodToFind), 10, 0));
      AV77BarCodToFind = A129BarCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77BarCodToFind", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77BarCodToFind), 8, 0));
      AV81BarCodReoToFind = A132BarCodReo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV81BarCodReoToFind", GXutil.str( AV81BarCodReoToFind, 1, 0));
      AV85BarCodParToFind = A130BarCodPar ;
      httpContext.ajax_rsp_assign_attri("", false, "AV85BarCodParToFind", AV85BarCodParToFind);
      /* Execute user subroutine: 'GETINDEXOFSELECTEDROW' */
      S162 ();
      if (returnInSub) return;
      if ( AV65i > 0 )
      {
         AV62Selected = true ;
         httpContext.ajax_rsp_assign_attri("", false, chkavSelected.getInternalname(), AV62Selected);
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(124) ;
      }
      sendrow_1242( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_124_Refreshing )
      {
         httpContext.doAjaxLoad(124, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e222972( )
   {
      /* Selected_Click Routine */
      returnInSub = false ;
      if ( AV62Selected )
      {
         AV66EmprCodCol.add(A396EmprCod, 0);
         AV70AlbProCodCol.add((long)(A30AlbProCod), 0);
         AV74BarCodCol.add((int)(A129BarCod), 0);
         AV78BarCodReoCol.add((byte)(A132BarCodReo), 0);
         AV82BarCodParCol.add(A130BarCodPar, 0);
      }
      else
      {
         AV69EmprCodToFind = A396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV69EmprCodToFind", AV69EmprCodToFind);
         AV73AlbProCodToFind = A30AlbProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV73AlbProCodToFind", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73AlbProCodToFind), 10, 0));
         AV77BarCodToFind = A129BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV77BarCodToFind", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77BarCodToFind), 8, 0));
         AV81BarCodReoToFind = A132BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV81BarCodReoToFind", GXutil.str( AV81BarCodReoToFind, 1, 0));
         AV85BarCodParToFind = A130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "AV85BarCodParToFind", AV85BarCodParToFind);
         /* Execute user subroutine: 'GETINDEXOFSELECTEDROW' */
         S162 ();
         if (returnInSub) return;
         AV66EmprCodCol.removeItem((int)(AV65i));
         AV70AlbProCodCol.removeItem((int)(AV65i));
         AV74BarCodCol.removeItem((int)(AV65i));
         AV78BarCodReoCol.removeItem((int)(AV65i));
         AV82BarCodParCol.removeItem((int)(AV65i));
      }
      AV67EmprCodJson = AV66EmprCodCol.toJSonString(false) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67EmprCodJson", AV67EmprCodJson);
      AV71AlbProCodJson = AV70AlbProCodCol.toJSonString(false) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71AlbProCodJson", AV71AlbProCodJson);
      AV75BarCodJson = AV74BarCodCol.toJSonString(false) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75BarCodJson", AV75BarCodJson);
      AV79BarCodReoJson = AV78BarCodReoCol.toJSonString(false) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV79BarCodReoJson", AV79BarCodReoJson);
      AV83BarCodParJson = AV82BarCodParCol.toJSonString(false) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV83BarCodParJson", AV83BarCodParJson);
      divLayoutmaintable_Class = "Table TableWithSelectableGrid"+((AV66EmprCodCol.size()>0) ? " WWPMultiRowSelected" : "") ;
      httpContext.ajax_rsp_assign_prop("", false, divLayoutmaintable_Internalname, "Class", divLayoutmaintable_Class, true);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV66EmprCodCol", AV66EmprCodCol);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV70AlbProCodCol", AV70AlbProCodCol);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV74BarCodCol", AV74BarCodCol);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV78BarCodReoCol", AV78BarCodReoCol);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV82BarCodParCol", AV82BarCodParCol);
   }

   public void e162972( )
   {
      /* 'DoProcessar' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADSELECTEDROWS' */
      S172 ();
      if (returnInSub) return;
      if ( AV63SelectedRows.size() == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_NoRecordSelected", ""));
      }
      if ( AV63SelectedRows.size() > 0 )
      {
         AV104NombresAdjuntos.clear();
         GXv_char4[0] = AV101PathPDF_Email ;
         GXv_char3[0] = AV102PathXLS_Email ;
         new app.documentoguiaremessa(remoteHandle, context).execute( AV63SelectedRows, AV14Copias2, GXv_char4, GXv_char3) ;
         impresionguiaww_impl.this.AV101PathPDF_Email = GXv_char4[0] ;
         impresionguiaww_impl.this.AV102PathXLS_Email = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV101PathPDF_Email", AV101PathPDF_Email);
         httpContext.ajax_rsp_assign_attri("", false, "AV102PathXLS_Email", AV102PathXLS_Email);
         AV104NombresAdjuntos.add(AV101PathPDF_Email, 0);
         AV104NombresAdjuntos.add(AV102PathXLS_Email, 0);
         /* Execute user subroutine: 'GENERARDATOSCORREO' */
         S182 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.enviarcorreoarchivosadjuntos", new String[] {GXutil.URLEncode(GXutil.rtrim(AV105TextoSeparador)),GXutil.URLEncode(GXutil.rtrim(AV107ListaCorreosDestino.toJSonString(false))),GXutil.URLEncode(GXutil.rtrim(AV113ListaCorreosCopia.toJSonString(false))),GXutil.URLEncode(GXutil.rtrim(AV111ListaCorreosCopiaOculta.toJSonString(false))),GXutil.URLEncode(GXutil.rtrim(AV119Asunto)),GXutil.URLEncode(GXutil.rtrim(AV112TextoCorreo)),GXutil.URLEncode(GXutil.rtrim(AV104NombresAdjuntos.toJSonString(false))),GXutil.URLEncode(GXutil.booltostr(AV16VerMail))}, new String[] {"TextoSeparador","parametroCorreosDestinoJson","parametroCorreosCopiaJson","parametroCorreosCopiaOcultaJson","parametroAsunto","parametroTextoCorreo","NombresAdjuntosJson","MostrarMail"}) , new Object[] {});
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Selecione al menos una linea !", ""));
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV104NombresAdjuntos", AV104NombresAdjuntos);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV63SelectedRows", AV63SelectedRows);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV66EmprCodCol", AV66EmprCodCol);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV70AlbProCodCol", AV70AlbProCodCol);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV74BarCodCol", AV74BarCodCol);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV78BarCodReoCol", AV78BarCodReoCol);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV82BarCodParCol", AV82BarCodParCol);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV107ListaCorreosDestino", AV107ListaCorreosDestino);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV113ListaCorreosCopia", AV113ListaCorreosCopia);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV111ListaCorreosCopiaOculta", AV111ListaCorreosCopiaOculta);
   }

   public void e172972( )
   {
      /* Selectall_Click Routine */
      returnInSub = false ;
      AV66EmprCodCol = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV70AlbProCodCol = new GXSimpleCollection<Long>(Long.class, "internal", "") ;
      AV74BarCodCol = new GXSimpleCollection<Integer>(Integer.class, "internal", "") ;
      AV78BarCodReoCol = new GXSimpleCollection<Byte>(Byte.class, "internal", "") ;
      AV82BarCodParCol = new GXSimpleCollection<String>(String.class, "internal", "") ;
      if ( AV86SelectAll )
      {
         /* Execute user subroutine: 'ADD ALL RECORDS' */
         S192 ();
         if (returnInSub) return;
      }
      /* Start For Each Line */
      nRC_GXsfl_124 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_124"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_124_fel_idx = 0 ;
      while ( nGXsfl_124_fel_idx < nRC_GXsfl_124 )
      {
         nGXsfl_124_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_124_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_124_fel_idx+1) ;
         sGXsfl_124_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_124_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_1242( ) ;
         AV62Selected = GXutil.strtobool( httpContext.cgiGet( chkavSelected.getInternalname())) ;
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         A30AlbProCod = localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
         A1243GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( edtGuiRemCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A1244GuiRemCln = httpContext.cgiGet( edtGuiRemCln_Internalname) ;
         A1902CliValA = ((GXutil.strcmp(httpContext.cgiGet( chkCliValA.getInternalname()), "S")==0) ? "S" : "N") ;
         A11622CliMailGrE = ((GXutil.strcmp(httpContext.cgiGet( chkCliMailGrE.getInternalname()), "S")==0) ? "S" : "N") ;
         A11620CliMailGr = httpContext.cgiGet( edtCliMailGr_Internalname) ;
         A11623CliMailPkE = ((GXutil.strcmp(httpContext.cgiGet( chkCliMailPkE.getInternalname()), "S")==0) ? "S" : "N") ;
         A11621CliMailPk = httpContext.cgiGet( edtCliMailPk_Internalname) ;
         A34AlbProfch = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtAlbProfch_Internalname), 0)) ;
         A5291BarTipCor = ((GXutil.strcmp(httpContext.cgiGet( chkBarTipCor.getInternalname()), "SI")==0) ? "SI" : "NO") ;
         A10301Cod_pais = (short)(localUtil.ctol( httpContext.cgiGet( edtCod_pais_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n10301Cod_pais = false ;
         A33AlbProEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbProEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV87Icon = httpContext.cgiGet( edtavIcon_Internalname) ;
         AV98Grid_PathPdf = httpContext.cgiGet( edtavGrid_pathpdf_Internalname) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGrid_nmrcopia_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGrid_nmrcopia_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGRID_NMRCOPIA");
            GX_FocusControl = edtavGrid_nmrcopia_Internalname ;
            wbErr = true ;
            AV100Grid_NmrCopia = (short)(0) ;
         }
         else
         {
            AV100Grid_NmrCopia = (short)(localUtil.ctol( httpContext.cgiGet( edtavGrid_nmrcopia_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         AV62Selected = AV86SelectAll ;
         httpContext.ajax_rsp_assign_attri("", false, chkavSelected.getInternalname(), AV62Selected);
         /* End For Each Line */
      }
      if ( nGXsfl_124_fel_idx == 0 )
      {
         nGXsfl_124_idx = 1 ;
         sGXsfl_124_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_124_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1242( ) ;
      }
      nGXsfl_124_fel_idx = 1 ;
      AV67EmprCodJson = AV66EmprCodCol.toJSonString(false) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67EmprCodJson", AV67EmprCodJson);
      AV71AlbProCodJson = AV70AlbProCodCol.toJSonString(false) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71AlbProCodJson", AV71AlbProCodJson);
      AV75BarCodJson = AV74BarCodCol.toJSonString(false) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75BarCodJson", AV75BarCodJson);
      AV79BarCodReoJson = AV78BarCodReoCol.toJSonString(false) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV79BarCodReoJson", AV79BarCodReoJson);
      AV83BarCodParJson = AV82BarCodParCol.toJSonString(false) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV83BarCodParJson", AV83BarCodParJson);
      divLayoutmaintable_Class = "Table TableWithSelectableGrid"+((AV66EmprCodCol.size()>0) ? " WWPMultiRowSelected" : "") ;
      httpContext.ajax_rsp_assign_prop("", false, divLayoutmaintable_Internalname, "Class", divLayoutmaintable_Class, true);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV66EmprCodCol", AV66EmprCodCol);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV70AlbProCodCol", AV70AlbProCodCol);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV74BarCodCol", AV74BarCodCol);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV78BarCodReoCol", AV78BarCodReoCol);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV82BarCodParCol", AV82BarCodParCol);
   }

   public void e122972( )
   {
      /* Combo_clicodto_Onoptionclicked Routine */
      returnInSub = false ;
      AV24CliCodto = (int)(GXutil.lval( Combo_clicodto_Selectedvalue_get)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24CliCodto), 6, 0));
      /*  Sending Event outputs  */
   }

   public void e112972( )
   {
      /* Combo_clicodfrom_Onoptionclicked Routine */
      returnInSub = false ;
      AV23CliCodfrom = (int)(GXutil.lval( Combo_clicodfrom_Selectedvalue_get)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23CliCodfrom), 6, 0));
      /*  Sending Event outputs  */
   }

   public void S162( )
   {
      /* 'GETINDEXOFSELECTEDROW' Routine */
      returnInSub = false ;
      AV65i = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65i", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65i), 10, 0));
      AV130GXV1 = 1 ;
      while ( AV130GXV1 <= AV66EmprCodCol.size() )
      {
         AV68EmprCodColItem = (String)AV66EmprCodCol.elementAt(-1+AV130GXV1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV68EmprCodColItem", AV68EmprCodColItem);
         if ( ( GXutil.strcmp(AV68EmprCodColItem, AV69EmprCodToFind) == 0 ) && ( ((Number) AV70AlbProCodCol.elementAt(-1+(int)(AV65i))).longValue() == AV73AlbProCodToFind ) && ( ((Number) AV74BarCodCol.elementAt(-1+(int)(AV65i))).intValue() == AV77BarCodToFind ) && ( ((Number) AV78BarCodReoCol.elementAt(-1+(int)(AV65i))).byteValue() == AV81BarCodReoToFind ) && ( GXutil.strcmp((String)AV82BarCodParCol.elementAt(-1+(int)(AV65i)), AV85BarCodParToFind) == 0 ) )
         {
            if (true) break;
         }
         AV65i = (long)(AV65i+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV65i", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65i), 10, 0));
         AV130GXV1 = (int)(AV130GXV1+1) ;
      }
      if ( AV65i > AV66EmprCodCol.size() )
      {
         AV65i = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV65i", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65i), 10, 0));
      }
   }

   public void S172( )
   {
      /* 'LOADSELECTEDROWS' Routine */
      returnInSub = false ;
      AV63SelectedRows = new GXBaseCollection<app.SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem>(app.SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem.class, "ImpresionGuiawwSDTItem", "TexplusNET", remoteHandle) ;
      AV66EmprCodCol.fromJSonString(AV67EmprCodJson, null);
      AV70AlbProCodCol.fromJSonString(AV71AlbProCodJson, null);
      AV74BarCodCol.fromJSonString(AV75BarCodJson, null);
      AV78BarCodReoCol.fromJSonString(AV79BarCodReoJson, null);
      AV82BarCodParCol.fromJSonString(AV83BarCodParJson, null);
      AV65i = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65i", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65i), 10, 0));
      AV131GXV2 = 1 ;
      while ( AV131GXV2 <= AV66EmprCodCol.size() )
      {
         AV68EmprCodColItem = (String)AV66EmprCodCol.elementAt(-1+AV131GXV2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV68EmprCodColItem", AV68EmprCodColItem);
         AV64SelectedRow = (app.SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem)new app.SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem(remoteHandle, context);
         AV72AlbProCodColItem = ((Number) AV70AlbProCodCol.elementAt(-1+(int)(AV65i))).longValue() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV72AlbProCodColItem", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72AlbProCodColItem), 10, 0));
         AV76BarCodColItem = ((Number) AV74BarCodCol.elementAt(-1+(int)(AV65i))).intValue() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV76BarCodColItem", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76BarCodColItem), 8, 0));
         AV80BarCodReoColItem = ((Number) AV78BarCodReoCol.elementAt(-1+(int)(AV65i))).byteValue() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV80BarCodReoColItem", GXutil.str( AV80BarCodReoColItem, 1, 0));
         AV84BarCodParColItem = (String)AV82BarCodParCol.elementAt(-1+(int)(AV65i)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV84BarCodParColItem", AV84BarCodParColItem);
         /* Using cursor H02975 */
         pr_default.execute(3, new Object[] {AV68EmprCodColItem, Long.valueOf(AV72AlbProCodColItem), Integer.valueOf(AV76BarCodColItem), Byte.valueOf(AV80BarCodReoColItem), AV84BarCodParColItem});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A252CliCod = H02975_A252CliCod[0] ;
            n252CliCod = H02975_n252CliCod[0] ;
            A1253EmprGuiRem = H02975_A1253EmprGuiRem[0] ;
            A130BarCodPar = H02975_A130BarCodPar[0] ;
            A132BarCodReo = H02975_A132BarCodReo[0] ;
            A129BarCod = H02975_A129BarCod[0] ;
            A30AlbProCod = H02975_A30AlbProCod[0] ;
            A396EmprCod = H02975_A396EmprCod[0] ;
            A1243GuiRemCli = H02975_A1243GuiRemCli[0] ;
            A1244GuiRemCln = H02975_A1244GuiRemCln[0] ;
            A1902CliValA = H02975_A1902CliValA[0] ;
            A11622CliMailGrE = H02975_A11622CliMailGrE[0] ;
            A11620CliMailGr = H02975_A11620CliMailGr[0] ;
            A11623CliMailPkE = H02975_A11623CliMailPkE[0] ;
            A11621CliMailPk = H02975_A11621CliMailPk[0] ;
            A34AlbProfch = H02975_A34AlbProfch[0] ;
            A5291BarTipCor = H02975_A5291BarTipCor[0] ;
            A10301Cod_pais = H02975_A10301Cod_pais[0] ;
            n10301Cod_pais = H02975_n10301Cod_pais[0] ;
            A33AlbProEst = H02975_A33AlbProEst[0] ;
            A252CliCod = H02975_A252CliCod[0] ;
            n252CliCod = H02975_n252CliCod[0] ;
            A5291BarTipCor = H02975_A5291BarTipCor[0] ;
            A1253EmprGuiRem = H02975_A1253EmprGuiRem[0] ;
            A1243GuiRemCli = H02975_A1243GuiRemCli[0] ;
            A34AlbProfch = H02975_A34AlbProfch[0] ;
            A33AlbProEst = H02975_A33AlbProEst[0] ;
            A1244GuiRemCln = H02975_A1244GuiRemCln[0] ;
            A1902CliValA = H02975_A1902CliValA[0] ;
            A11622CliMailGrE = H02975_A11622CliMailGrE[0] ;
            A11620CliMailGr = H02975_A11620CliMailGr[0] ;
            A11623CliMailPkE = H02975_A11623CliMailPkE[0] ;
            A11621CliMailPk = H02975_A11621CliMailPk[0] ;
            A10301Cod_pais = H02975_A10301Cod_pais[0] ;
            n10301Cod_pais = H02975_n10301Cod_pais[0] ;
            AV64SelectedRow.setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Emprcod( A396EmprCod );
            AV64SelectedRow.setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albprocod( A30AlbProCod );
            AV64SelectedRow.setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Barcod( A129BarCod );
            AV64SelectedRow.setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Barcodreo( A132BarCodReo );
            AV64SelectedRow.setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Barcodpar( A130BarCodPar );
            AV64SelectedRow.setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Guiremcli( A1243GuiRemCli );
            AV64SelectedRow.setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Guiremcln( A1244GuiRemCln );
            AV64SelectedRow.setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Clivala( A1902CliValA );
            AV64SelectedRow.setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailgre( A11622CliMailGrE );
            AV64SelectedRow.setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailgr( A11620CliMailGr );
            AV64SelectedRow.setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailpke( A11623CliMailPkE );
            AV64SelectedRow.setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailpk( A11621CliMailPk );
            AV64SelectedRow.setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albprofch( A34AlbProfch );
            AV64SelectedRow.setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Bartipcor( A5291BarTipCor );
            AV64SelectedRow.setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Cod_pais( A10301Cod_pais );
            AV64SelectedRow.setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albproest( A33AlbProEst );
            if ( ( GXutil.strcmp(A11622CliMailGrE, "S") == 0 ) || ( GXutil.strcmp(A11623CliMailPkE, "S") == 0 ) )
            {
               edtavIcon_gximage = "Email" ;
               httpContext.ajax_rsp_assign_prop("", false, edtavIcon_Internalname, "gximage", edtavIcon_gximage, !bGXsfl_124_Refreshing);
               AV87Icon = context.getHttpContext().getImagePath( "1b09bc09-7c40-49bb-a9b2-73bc4af027c1", "", context.getHttpContext().getTheme( )) ;
               httpContext.ajax_rsp_assign_prop("", false, edtavIcon_Internalname, "Bitmap", ((GXutil.strcmp("", AV87Icon)==0) ? AV128Icon_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV87Icon))), !bGXsfl_124_Refreshing);
               httpContext.ajax_rsp_assign_prop("", false, edtavIcon_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV87Icon), true);
               AV128Icon_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "1b09bc09-7c40-49bb-a9b2-73bc4af027c1", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
               httpContext.ajax_rsp_assign_prop("", false, edtavIcon_Internalname, "Bitmap", ((GXutil.strcmp("", AV87Icon)==0) ? AV128Icon_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV87Icon))), !bGXsfl_124_Refreshing);
               httpContext.ajax_rsp_assign_prop("", false, edtavIcon_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV87Icon), true);
               edtavIcon_Tooltiptext = httpContext.getMessage( "Liberado para enviar por mail !", "") ;
               httpContext.ajax_rsp_assign_prop("", false, edtavIcon_Internalname, "Tooltiptext", edtavIcon_Tooltiptext, !bGXsfl_124_Refreshing);
               edtavIcon_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavIcon_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIcon_Visible), 5, 0), !bGXsfl_124_Refreshing);
            }
            if ( ( GXutil.strcmp(A11622CliMailGrE, "S") == 0 ) && (GXutil.strcmp("", A11620CliMailGr)==0) )
            {
               edtavIcon_gximage = "EmailError" ;
               httpContext.ajax_rsp_assign_prop("", false, edtavIcon_Internalname, "gximage", edtavIcon_gximage, !bGXsfl_124_Refreshing);
               AV87Icon = context.getHttpContext().getImagePath( "b1ab6750-3ef5-4f59-b70d-90e710e751d7", "", context.getHttpContext().getTheme( )) ;
               httpContext.ajax_rsp_assign_prop("", false, edtavIcon_Internalname, "Bitmap", ((GXutil.strcmp("", AV87Icon)==0) ? AV128Icon_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV87Icon))), !bGXsfl_124_Refreshing);
               httpContext.ajax_rsp_assign_prop("", false, edtavIcon_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV87Icon), true);
               AV128Icon_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "b1ab6750-3ef5-4f59-b70d-90e710e751d7", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
               httpContext.ajax_rsp_assign_prop("", false, edtavIcon_Internalname, "Bitmap", ((GXutil.strcmp("", AV87Icon)==0) ? AV128Icon_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV87Icon))), !bGXsfl_124_Refreshing);
               httpContext.ajax_rsp_assign_prop("", false, edtavIcon_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV87Icon), true);
               edtavIcon_Tooltiptext = httpContext.getMessage( "Guia Remessa : NO tiene mail", "") ;
               httpContext.ajax_rsp_assign_prop("", false, edtavIcon_Internalname, "Tooltiptext", edtavIcon_Tooltiptext, !bGXsfl_124_Refreshing);
            }
            if ( ( GXutil.strcmp(A11623CliMailPkE, "S") == 0 ) && (GXutil.strcmp("", A11621CliMailPk)==0) )
            {
               edtavIcon_gximage = "EmailError" ;
               httpContext.ajax_rsp_assign_prop("", false, edtavIcon_Internalname, "gximage", edtavIcon_gximage, !bGXsfl_124_Refreshing);
               AV87Icon = context.getHttpContext().getImagePath( "b1ab6750-3ef5-4f59-b70d-90e710e751d7", "", context.getHttpContext().getTheme( )) ;
               httpContext.ajax_rsp_assign_prop("", false, edtavIcon_Internalname, "Bitmap", ((GXutil.strcmp("", AV87Icon)==0) ? AV128Icon_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV87Icon))), !bGXsfl_124_Refreshing);
               httpContext.ajax_rsp_assign_prop("", false, edtavIcon_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV87Icon), true);
               AV128Icon_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "b1ab6750-3ef5-4f59-b70d-90e710e751d7", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
               httpContext.ajax_rsp_assign_prop("", false, edtavIcon_Internalname, "Bitmap", ((GXutil.strcmp("", AV87Icon)==0) ? AV128Icon_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV87Icon))), !bGXsfl_124_Refreshing);
               httpContext.ajax_rsp_assign_prop("", false, edtavIcon_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV87Icon), true);
               edtavIcon_Tooltiptext = httpContext.getMessage( "Packing List : NO tiene mail", "") ;
               httpContext.ajax_rsp_assign_prop("", false, edtavIcon_Internalname, "Tooltiptext", edtavIcon_Tooltiptext, !bGXsfl_124_Refreshing);
            }
            AV64SelectedRow.setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Icon( AV87Icon );
            AV64SelectedRow.setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Icon_gxi( AV128Icon_GXI );
            AV64SelectedRow.setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Grid_pathpdf( AV98Grid_PathPdf );
            AV64SelectedRow.setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Grid_nmrcopia( AV100Grid_NmrCopia );
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
         AV63SelectedRows.add(AV64SelectedRow, 0);
         AV65i = (long)(AV65i+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV65i", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65i), 10, 0));
         AV131GXV2 = (int)(AV131GXV2+1) ;
      }
   }

   public void S142( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV25Session.getValue(AV125Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV125Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV25Session.getValue(AV125Pgmname+"GridState"), null, null);
      }
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV25Session.getValue(AV125Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV125Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S132( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV125Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "ALBBAR" );
      AV25Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S192( )
   {
      /* 'ADD ALL RECORDS' Routine */
      returnInSub = false ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           Long.valueOf(AV19AlbProCodfrom) ,
                                           AV15ManAut ,
                                           Long.valueOf(AV20AlbProCodto) ,
                                           AV21AlbProfchfrom ,
                                           AV22AlbProfchto ,
                                           Integer.valueOf(AV23CliCodfrom) ,
                                           Integer.valueOf(AV24CliCodto) ,
                                           Long.valueOf(A30AlbProCod) ,
                                           A34AlbProfch ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           Byte.valueOf(A33AlbProEst) ,
                                           A39AlbProPri ,
                                           AV18PRIO ,
                                           AV44EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor H02976 */
      pr_default.execute(4, new Object[] {AV44EmprCod, AV18PRIO, Long.valueOf(AV19AlbProCodfrom), Long.valueOf(AV20AlbProCodto), AV21AlbProfchfrom, AV22AlbProfchto, Integer.valueOf(AV23CliCodfrom), Integer.valueOf(AV24CliCodto)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A33AlbProEst = H02976_A33AlbProEst[0] ;
         A1243GuiRemCli = H02976_A1243GuiRemCli[0] ;
         A34AlbProfch = H02976_A34AlbProfch[0] ;
         A30AlbProCod = H02976_A30AlbProCod[0] ;
         A39AlbProPri = H02976_A39AlbProPri[0] ;
         A396EmprCod = H02976_A396EmprCod[0] ;
         A129BarCod = H02976_A129BarCod[0] ;
         A132BarCodReo = H02976_A132BarCodReo[0] ;
         A130BarCodPar = H02976_A130BarCodPar[0] ;
         A33AlbProEst = H02976_A33AlbProEst[0] ;
         A1243GuiRemCli = H02976_A1243GuiRemCli[0] ;
         A34AlbProfch = H02976_A34AlbProfch[0] ;
         A39AlbProPri = H02976_A39AlbProPri[0] ;
         AV66EmprCodCol.add(A396EmprCod, 0);
         AV70AlbProCodCol.add((long)(A30AlbProCod), 0);
         AV74BarCodCol.add((int)(A129BarCod), 0);
         AV78BarCodReoCol.add((byte)(A132BarCodReo), 0);
         AV82BarCodParCol.add(A130BarCodPar, 0);
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void S122( )
   {
      /* 'LOADCOMBOCLICODTO' Routine */
      returnInSub = false ;
      /* Using cursor H02977 */
      pr_default.execute(5);
      while ( (pr_default.getStatus(5) != 101) )
      {
         A10045CliAct = H02977_A10045CliAct[0] ;
         A396EmprCod = H02977_A396EmprCod[0] ;
         A13735CliCNom = H02977_A13735CliCNom[0] ;
         A252CliCod = H02977_A252CliCod[0] ;
         n252CliCod = H02977_n252CliCod[0] ;
         A279CliNom = H02977_A279CliNom[0] ;
         AV41Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV41Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV41Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV42CliCodto_Data.add(AV41Combo_DataItem, 0);
         pr_default.readNext(5);
      }
      pr_default.close(5);
      Combo_clicodto_Selectedvalue_set = ((0==AV24CliCodto) ? "" : GXutil.trim( GXutil.str( AV24CliCodto, 6, 0))) ;
      ucCombo_clicodto.sendProperty(context, "", false, Combo_clicodto_Internalname, "SelectedValue_set", Combo_clicodto_Selectedvalue_set);
   }

   public void S112( )
   {
      /* 'LOADCOMBOCLICODFROM' Routine */
      returnInSub = false ;
      /* Using cursor H02978 */
      pr_default.execute(6);
      while ( (pr_default.getStatus(6) != 101) )
      {
         A10045CliAct = H02978_A10045CliAct[0] ;
         A396EmprCod = H02978_A396EmprCod[0] ;
         A13735CliCNom = H02978_A13735CliCNom[0] ;
         A252CliCod = H02978_A252CliCod[0] ;
         n252CliCod = H02978_n252CliCod[0] ;
         A279CliNom = H02978_A279CliNom[0] ;
         AV41Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV41Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV41Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV40CliCodfrom_Data.add(AV41Combo_DataItem, 0);
         pr_default.readNext(6);
      }
      pr_default.close(6);
      Combo_clicodfrom_Selectedvalue_set = ((0==AV23CliCodfrom) ? "" : GXutil.trim( GXutil.str( AV23CliCodfrom, 6, 0))) ;
      ucCombo_clicodfrom.sendProperty(context, "", false, Combo_clicodfrom_Internalname, "SelectedValue_set", Combo_clicodfrom_Selectedvalue_set);
   }

   public void e212972( )
   {
      /* Icon_Click Routine */
      returnInSub = false ;
      AV109CliMailGr = A11620CliMailGr ;
      httpContext.ajax_rsp_assign_attri("", false, "AV109CliMailGr", AV109CliMailGr);
      AV114CLIMAILPK = A11621CliMailPk ;
      AV117ImpresionGuiawwSDT = new GXBaseCollection<app.SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem>(app.SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem.class, "ImpresionGuiawwSDTItem", "TexplusNET", remoteHandle) ;
      AV118ImpresionGuiawwSDTItem = (app.SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem)new app.SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem(remoteHandle, context);
      AV118ImpresionGuiawwSDTItem.setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albprocod( A30AlbProCod );
      AV118ImpresionGuiawwSDTItem.setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Emprcod( A396EmprCod );
      AV118ImpresionGuiawwSDTItem.setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albprocod( A30AlbProCod );
      AV118ImpresionGuiawwSDTItem.setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Barcod( A129BarCod );
      AV118ImpresionGuiawwSDTItem.setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Barcodreo( A132BarCodReo );
      AV118ImpresionGuiawwSDTItem.setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Barcodpar( A130BarCodPar );
      AV118ImpresionGuiawwSDTItem.setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Guiremcli( A1243GuiRemCli );
      AV118ImpresionGuiawwSDTItem.setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Guiremcln( A1244GuiRemCln );
      AV118ImpresionGuiawwSDTItem.setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Clivala( A1902CliValA );
      AV118ImpresionGuiawwSDTItem.setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailgre( A11622CliMailGrE );
      AV118ImpresionGuiawwSDTItem.setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailgr( A11620CliMailGr );
      AV118ImpresionGuiawwSDTItem.setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailpke( A11623CliMailPkE );
      AV118ImpresionGuiawwSDTItem.setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailpk( A11621CliMailPk );
      AV118ImpresionGuiawwSDTItem.setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albprofch( A34AlbProfch );
      AV118ImpresionGuiawwSDTItem.setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Bartipcor( A5291BarTipCor );
      AV118ImpresionGuiawwSDTItem.setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Cod_pais( A10301Cod_pais );
      AV118ImpresionGuiawwSDTItem.setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albproest( A33AlbProEst );
      AV118ImpresionGuiawwSDTItem.setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Grid_pathpdf( AV17PATHPDF );
      AV118ImpresionGuiawwSDTItem.setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Grid_nmrcopia( AV14Copias2 );
      AV117ImpresionGuiawwSDT.add(AV118ImpresionGuiawwSDTItem, 0);
      GXv_char4[0] = AV101PathPDF_Email ;
      GXv_char3[0] = AV102PathXLS_Email ;
      new app.documentoguiaremessa(remoteHandle, context).execute( AV117ImpresionGuiawwSDT, AV14Copias2, GXv_char4, GXv_char3) ;
      impresionguiaww_impl.this.AV101PathPDF_Email = GXv_char4[0] ;
      impresionguiaww_impl.this.AV102PathXLS_Email = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV101PathPDF_Email", AV101PathPDF_Email);
      httpContext.ajax_rsp_assign_attri("", false, "AV102PathXLS_Email", AV102PathXLS_Email);
      AV104NombresAdjuntos.add(AV101PathPDF_Email, 0);
      AV104NombresAdjuntos.add(AV102PathXLS_Email, 0);
      /* Execute user subroutine: 'GENERARDATOSCORREO' */
      S182 ();
      if (returnInSub) return;
      httpContext.popup(formatLink("app.enviarcorreoarchivosadjuntos", new String[] {GXutil.URLEncode(GXutil.rtrim(AV105TextoSeparador)),GXutil.URLEncode(GXutil.rtrim(AV107ListaCorreosDestino.toJSonString(false))),GXutil.URLEncode(GXutil.rtrim(AV113ListaCorreosCopia.toJSonString(false))),GXutil.URLEncode(GXutil.rtrim(AV111ListaCorreosCopiaOculta.toJSonString(false))),GXutil.URLEncode(GXutil.rtrim(AV119Asunto)),GXutil.URLEncode(GXutil.rtrim(AV112TextoCorreo)),GXutil.URLEncode(GXutil.rtrim(AV104NombresAdjuntos.toJSonString(false))),GXutil.URLEncode(GXutil.booltostr(AV116MostrarMail))}, new String[] {"TextoSeparador","parametroCorreosDestinoJson","parametroCorreosCopiaJson","parametroCorreosCopiaOcultaJson","parametroAsunto","parametroTextoCorreo","NombresAdjuntosJson","MostrarMail"}) , new Object[] {});
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV104NombresAdjuntos", AV104NombresAdjuntos);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV107ListaCorreosDestino", AV107ListaCorreosDestino);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV113ListaCorreosCopia", AV113ListaCorreosCopia);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV111ListaCorreosCopiaOculta", AV111ListaCorreosCopiaOculta);
   }

   public void S182( )
   {
      /* 'GENERARDATOSCORREO' Routine */
      returnInSub = false ;
      AV105TextoSeparador = "|#@|" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV105TextoSeparador", AV105TextoSeparador);
      AV106CadenaRegistrar = AV109CliMailGr ;
      AV106CadenaRegistrar += AV105TextoSeparador + GXutil.trim( AV110CliNom) ;
      AV107ListaCorreosDestino.clear();
      AV107ListaCorreosDestino.add(AV106CadenaRegistrar, 0);
      AV113ListaCorreosCopia.clear();
      AV106CadenaRegistrar = AV108Usumail ;
      AV106CadenaRegistrar += AV105TextoSeparador + AV45EmprNom ;
      AV111ListaCorreosCopiaOculta.clear();
      AV111ListaCorreosCopiaOculta.add(AV106CadenaRegistrar, 0);
      if ( ! (GXutil.strcmp("", AV102PathXLS_Email)==0) )
      {
         AV112TextoCorreo = httpContext.getMessage( "Envio GUIA e PACKING por e-mail", "") + "<br>" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV112TextoCorreo", AV112TextoCorreo);
         AV112TextoCorreo += httpContext.getMessage( "Arquivos anexados: ", "") + AV102PathXLS_Email + "<br>" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV112TextoCorreo", AV112TextoCorreo);
         AV119Asunto = httpContext.getMessage( "Envio de GUIA e PACKING", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV119Asunto", AV119Asunto);
      }
      else
      {
         AV112TextoCorreo = httpContext.getMessage( "Envio GUIA por e-mail", "") + "<br>" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV112TextoCorreo", AV112TextoCorreo);
         AV112TextoCorreo += httpContext.getMessage( "No arquivo em anexo:", "") + GXutil.trim( AV101PathPDF_Email) + "<br>" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV112TextoCorreo", AV112TextoCorreo);
         AV119Asunto = httpContext.getMessage( "Envio de GUIA", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV119Asunto", AV119Asunto);
      }
      AV112TextoCorreo += httpContext.getMessage( "Atenciosamente,", "") + "<br>" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV112TextoCorreo", AV112TextoCorreo);
      AV112TextoCorreo += AV45EmprNom + "<br>" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV112TextoCorreo", AV112TextoCorreo);
      AV112TextoCorreo += "<br>" + "<br>" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV112TextoCorreo", AV112TextoCorreo);
      AV112TextoCorreo += httpContext.getMessage( "Se enviará a: ", "") + GXutil.trim( AV109CliMailGr) + "<br>" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV112TextoCorreo", AV112TextoCorreo);
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
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
      pa2972( ) ;
      ws2972( ) ;
      we2972( ) ;
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
      httpContext.AddStyleSheetFile("GXProgressIndicator/css/bootstrap-progressbar-3.0.1.css", "");
      httpContext.AddStyleSheetFile("DVelop/DVPaginationBar/DVPaginationBar.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116152579", true, true);
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
      httpContext.AddJavascriptSource("impresionguiaww.js", "?202682116152579", false, true);
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
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_1242( )
   {
      chkavSelected.setInternalname( "vSELECTED_"+sGXsfl_124_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_124_idx ;
      edtAlbProCod_Internalname = "ALBPROCOD_"+sGXsfl_124_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_124_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_124_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_124_idx ;
      edtGuiRemCli_Internalname = "GUIREMCLI_"+sGXsfl_124_idx ;
      edtGuiRemCln_Internalname = "GUIREMCLN_"+sGXsfl_124_idx ;
      chkCliValA.setInternalname( "CLIVALA_"+sGXsfl_124_idx );
      chkCliMailGrE.setInternalname( "CLIMAILGRE_"+sGXsfl_124_idx );
      edtCliMailGr_Internalname = "CLIMAILGR_"+sGXsfl_124_idx ;
      chkCliMailPkE.setInternalname( "CLIMAILPKE_"+sGXsfl_124_idx );
      edtCliMailPk_Internalname = "CLIMAILPK_"+sGXsfl_124_idx ;
      edtAlbProfch_Internalname = "ALBPROFCH_"+sGXsfl_124_idx ;
      chkBarTipCor.setInternalname( "BARTIPCOR_"+sGXsfl_124_idx );
      edtCod_pais_Internalname = "COD_PAIS_"+sGXsfl_124_idx ;
      edtAlbProEst_Internalname = "ALBPROEST_"+sGXsfl_124_idx ;
      edtavIcon_Internalname = "vICON_"+sGXsfl_124_idx ;
      edtavGrid_pathpdf_Internalname = "vGRID_PATHPDF_"+sGXsfl_124_idx ;
      edtavGrid_nmrcopia_Internalname = "vGRID_NMRCOPIA_"+sGXsfl_124_idx ;
   }

   public void subsflControlProps_fel_1242( )
   {
      chkavSelected.setInternalname( "vSELECTED_"+sGXsfl_124_fel_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_124_fel_idx ;
      edtAlbProCod_Internalname = "ALBPROCOD_"+sGXsfl_124_fel_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_124_fel_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_124_fel_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_124_fel_idx ;
      edtGuiRemCli_Internalname = "GUIREMCLI_"+sGXsfl_124_fel_idx ;
      edtGuiRemCln_Internalname = "GUIREMCLN_"+sGXsfl_124_fel_idx ;
      chkCliValA.setInternalname( "CLIVALA_"+sGXsfl_124_fel_idx );
      chkCliMailGrE.setInternalname( "CLIMAILGRE_"+sGXsfl_124_fel_idx );
      edtCliMailGr_Internalname = "CLIMAILGR_"+sGXsfl_124_fel_idx ;
      chkCliMailPkE.setInternalname( "CLIMAILPKE_"+sGXsfl_124_fel_idx );
      edtCliMailPk_Internalname = "CLIMAILPK_"+sGXsfl_124_fel_idx ;
      edtAlbProfch_Internalname = "ALBPROFCH_"+sGXsfl_124_fel_idx ;
      chkBarTipCor.setInternalname( "BARTIPCOR_"+sGXsfl_124_fel_idx );
      edtCod_pais_Internalname = "COD_PAIS_"+sGXsfl_124_fel_idx ;
      edtAlbProEst_Internalname = "ALBPROEST_"+sGXsfl_124_fel_idx ;
      edtavIcon_Internalname = "vICON_"+sGXsfl_124_fel_idx ;
      edtavGrid_pathpdf_Internalname = "vGRID_PATHPDF_"+sGXsfl_124_fel_idx ;
      edtavGrid_nmrcopia_Internalname = "vGRID_NMRCOPIA_"+sGXsfl_124_fel_idx ;
   }

   public void sendrow_1242( )
   {
      subsflControlProps_1242( ) ;
      wb2970( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_124_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_124_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_124_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavSelected.getEnabled()!=0)&&(chkavSelected.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 125,'',false,'"+sGXsfl_124_idx+"',124)\"" : " ") ;
         ClassString = "AttributeCheckBox" ;
         StyleString = "" ;
         GXCCtl = "vSELECTED_" + sGXsfl_124_idx ;
         chkavSelected.setName( GXCCtl );
         chkavSelected.setWebtags( "" );
         chkavSelected.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavSelected.getInternalname(), "TitleCaption", chkavSelected.getCaption(), !bGXsfl_124_Refreshing);
         chkavSelected.setCheckedValue( "false" );
         AV62Selected = GXutil.strtobool( GXutil.booltostr( AV62Selected)) ;
         httpContext.ajax_rsp_assign_attri("", false, chkavSelected.getInternalname(), AV62Selected);
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSelected.getInternalname(),GXutil.booltostr( AV62Selected),"","",Integer.valueOf(-1),Integer.valueOf(1),"true","",StyleString,ClassString,"","",TempTags+((chkavSelected.getEnabled()!=0)&&(chkavSelected.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,125);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(124),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProCod_Internalname,GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(124),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(124),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(124),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(124),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGuiRemCli_Internalname,GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1243GuiRemCli), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGuiRemCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(124),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGuiRemCln_Internalname,GXutil.rtrim( A1244GuiRemCln),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGuiRemCln_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(124),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "CLIVALA_" + sGXsfl_124_idx ;
         chkCliValA.setName( GXCCtl );
         chkCliValA.setWebtags( "" );
         chkCliValA.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkCliValA.getInternalname(), "TitleCaption", chkCliValA.getCaption(), !bGXsfl_124_Refreshing);
         chkCliValA.setCheckedValue( "N" );
         A1902CliValA = ((GXutil.strcmp(GXutil.rtrim( A1902CliValA), "S")==0) ? "S" : "N") ;
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkCliValA.getInternalname(),A1902CliValA,"","",Integer.valueOf(0),Integer.valueOf(0),"S","",StyleString,ClassString,"WWColumn","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "CLIMAILGRE_" + sGXsfl_124_idx ;
         chkCliMailGrE.setName( GXCCtl );
         chkCliMailGrE.setWebtags( "" );
         chkCliMailGrE.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkCliMailGrE.getInternalname(), "TitleCaption", chkCliMailGrE.getCaption(), !bGXsfl_124_Refreshing);
         chkCliMailGrE.setCheckedValue( "N" );
         A11622CliMailGrE = ((GXutil.strcmp(GXutil.rtrim( A11622CliMailGrE), "S")==0) ? "S" : "N") ;
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkCliMailGrE.getInternalname(),A11622CliMailGrE,"","",Integer.valueOf(-1),Integer.valueOf(0),"S","",StyleString,ClassString,"WWColumn","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliMailGr_Internalname,GXutil.rtrim( A11620CliMailGr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliMailGr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(124),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "CLIMAILPKE_" + sGXsfl_124_idx ;
         chkCliMailPkE.setName( GXCCtl );
         chkCliMailPkE.setWebtags( "" );
         chkCliMailPkE.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkCliMailPkE.getInternalname(), "TitleCaption", chkCliMailPkE.getCaption(), !bGXsfl_124_Refreshing);
         chkCliMailPkE.setCheckedValue( "N" );
         A11623CliMailPkE = ((GXutil.strcmp(GXutil.rtrim( A11623CliMailPkE), "S")==0) ? "S" : "N") ;
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkCliMailPkE.getInternalname(),A11623CliMailPkE,"","",Integer.valueOf(-1),Integer.valueOf(0),"S","",StyleString,ClassString,"WWColumn","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliMailPk_Internalname,GXutil.rtrim( A11621CliMailPk),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliMailPk_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(124),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProfch_Internalname,localUtil.format(A34AlbProfch, "99/99/99"),localUtil.format( A34AlbProfch, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProfch_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(124),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "BARTIPCOR_" + sGXsfl_124_idx ;
         chkBarTipCor.setName( GXCCtl );
         chkBarTipCor.setWebtags( "" );
         chkBarTipCor.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkBarTipCor.getInternalname(), "TitleCaption", chkBarTipCor.getCaption(), !bGXsfl_124_Refreshing);
         chkBarTipCor.setCheckedValue( "NO" );
         A5291BarTipCor = ((GXutil.strcmp(GXutil.rtrim( A5291BarTipCor), "SI")==0) ? "SI" : "NO") ;
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkBarTipCor.getInternalname(),A5291BarTipCor,"","",Integer.valueOf(0),Integer.valueOf(0),"SI","",StyleString,ClassString,"WWColumn hidden-xs","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCod_pais_Internalname,GXutil.ltrim( localUtil.ntoc( A10301Cod_pais, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A10301Cod_pais), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCod_pais_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(124),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProEst_Internalname,GXutil.ltrim( localUtil.ntoc( A33AlbProEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A33AlbProEst), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProEst_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(124),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((edtavIcon_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Active Bitmap Variable */
         TempTags = " " + ((edtavIcon_Enabled!=0)&&(edtavIcon_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 142,'',false,'',124)\"" : " ") ;
         ClassString = "ResponsiveImageAttribute" + " " + ((GXutil.strcmp(edtavIcon_gximage, "")==0) ? "" : "GX_Image_"+edtavIcon_gximage+"_Class") ;
         StyleString = "" ;
         AV87Icon_IsBlob = (boolean)(((GXutil.strcmp("", AV87Icon)==0)&&(GXutil.strcmp("", AV128Icon_GXI)==0))||!(GXutil.strcmp("", AV87Icon)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV87Icon)==0) ? AV128Icon_GXI : httpContext.getResourceRelative(AV87Icon)) ;
         GridRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavIcon_Internalname,sImgUrl,"","","",context.getHttpContext().getTheme( ),Integer.valueOf(edtavIcon_Visible),Integer.valueOf(1),"",edtavIcon_Tooltiptext,Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),"px",Integer.valueOf(0),"px",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(5),edtavIcon_Jsonclick,"'"+""+"'"+",false,"+"'"+"EVICON.CLICK."+sGXsfl_124_idx+"'",StyleString,ClassString,"WWColumn","","","",""+TempTags,"","",Integer.valueOf(1),Boolean.valueOf(AV87Icon_IsBlob),Boolean.valueOf(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavGrid_pathpdf_Enabled!=0)&&(edtavGrid_pathpdf_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 143,'',false,'"+sGXsfl_124_idx+"',124)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGrid_pathpdf_Internalname,AV98Grid_PathPdf,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavGrid_pathpdf_Enabled!=0)&&(edtavGrid_pathpdf_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,143);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGrid_pathpdf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavGrid_pathpdf_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(180),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(124),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavGrid_nmrcopia_Enabled!=0)&&(edtavGrid_nmrcopia_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 144,'',false,'"+sGXsfl_124_idx+"',124)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGrid_nmrcopia_Internalname,GXutil.ltrim( localUtil.ntoc( AV100Grid_NmrCopia, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavGrid_nmrcopia_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV100Grid_NmrCopia), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV100Grid_NmrCopia), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavGrid_nmrcopia_Enabled!=0)&&(edtavGrid_nmrcopia_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,144);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGrid_nmrcopia_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavGrid_nmrcopia_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(124),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes2972( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_124_idx = ((subGrid_Islastpage==1)&&(nGXsfl_124_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_124_idx+1) ;
         sGXsfl_124_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_124_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1242( ) ;
      }
      /* End function sendrow_1242 */
   }

   public void startgridcontrol124( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"124\">") ;
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
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"AttributeCheckBox"+"\" "+" style=\""+""+""+"\" "+">") ;
         if ( chkavSelected.getTitleFormat() == 0 )
         {
            httpContext.writeValue( chkavSelected.getTitle()) ;
         }
         else
         {
            httpContext.writeText( chkavSelected.getTitle()) ;
         }
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Empresa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "HDR", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "HDR", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Imprimir Albaran Valorado ?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Envia Guia Email S/N", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "E-mail Guia Remessa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Envia Packing Email S/N", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "E-mail Packing List", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "CL,RL,CO", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pais", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Estado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ResponsiveImageAttribute"+" "+((GXutil.strcmp(edtavIcon_gximage, "")==0) ? "" : "GX_Image_"+edtavIcon_gximage+"_Class")+"\" "+" style=\""+((edtavIcon_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
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
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.booltostr( AV62Selected));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( chkavSelected.getTitle()));
         GridColumn.AddObjectProperty("Titleformat", GXutil.ltrim( localUtil.ntoc( chkavSelected.getTitleFormat(), (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1244GuiRemCln));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1902CliValA));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11622CliMailGrE));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11620CliMailGr));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11623CliMailPkE));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11621CliMailPk));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A34AlbProfch, "99/99/99"));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5291BarTipCor));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10301Cod_pais, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A33AlbProEst, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", httpContext.convertURL( AV87Icon));
         GridColumn.AddObjectProperty("Tooltiptext", GXutil.rtrim( edtavIcon_Tooltiptext));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavIcon_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", AV98Grid_PathPdf);
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGrid_pathpdf_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV100Grid_NmrCopia, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGrid_nmrcopia_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      lblTextblockcombo_clicodfrom_Internalname = "TEXTBLOCKCOMBO_CLICODFROM" ;
      Combo_clicodfrom_Internalname = "COMBO_CLICODFROM" ;
      divTablesplittedclicodfrom_Internalname = "TABLESPLITTEDCLICODFROM" ;
      lblTextblockcombo_clicodto_Internalname = "TEXTBLOCKCOMBO_CLICODTO" ;
      Combo_clicodto_Internalname = "COMBO_CLICODTO" ;
      divTablesplittedclicodto_Internalname = "TABLESPLITTEDCLICODTO" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      edtavAlbprofchfrom_Internalname = "vALBPROFCHFROM" ;
      edtavAlbprofchto_Internalname = "vALBPROFCHTO" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtavAlbprocodfrom_Internalname = "vALBPROCODFROM" ;
      edtavAlbprocodto_Internalname = "vALBPROCODTO" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      cmbavPrio.setInternalname( "vPRIO" );
      cmbavManaut.setInternalname( "vMANAUT" );
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      divTable_acciones_Internalname = "TABLE_ACCIONES" ;
      Barradeprogreso_Internalname = "BARRADEPROGRESO" ;
      bttBtn_search_Internalname = "BTN_SEARCH" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      divDivheader_Internalname = "DIVHEADER" ;
      chkavVermail.setInternalname( "vVERMAIL" );
      edtavPathpdf_Internalname = "vPATHPDF" ;
      cmbavCopias2.setInternalname( "vCOPIAS2" );
      edtavInfo_Internalname = "vINFO" ;
      bttBtnprocessar_Internalname = "BTNPROCESSAR" ;
      divTableaction_Internalname = "TABLEACTION" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      divTableoptions_Internalname = "TABLEOPTIONS" ;
      chkavSelected.setInternalname( "vSELECTED" );
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtAlbProCod_Internalname = "ALBPROCOD" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtGuiRemCli_Internalname = "GUIREMCLI" ;
      edtGuiRemCln_Internalname = "GUIREMCLN" ;
      chkCliValA.setInternalname( "CLIVALA" );
      chkCliMailGrE.setInternalname( "CLIMAILGRE" );
      edtCliMailGr_Internalname = "CLIMAILGR" ;
      chkCliMailPkE.setInternalname( "CLIMAILPKE" );
      edtCliMailPk_Internalname = "CLIMAILPK" ;
      edtAlbProfch_Internalname = "ALBPROFCH" ;
      chkBarTipCor.setInternalname( "BARTIPCOR" );
      edtCod_pais_Internalname = "COD_PAIS" ;
      edtAlbProEst_Internalname = "ALBPROEST" ;
      edtavIcon_Internalname = "vICON" ;
      edtavGrid_pathpdf_Internalname = "vGRID_PATHPDF" ;
      edtavGrid_nmrcopia_Internalname = "vGRID_NMRCOPIA" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavClicodfrom_Internalname = "vCLICODFROM" ;
      edtavClicodto_Internalname = "vCLICODTO" ;
      chkavSelectall.setInternalname( "vSELECTALL" );
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
      edtavGrid_nmrcopia_Jsonclick = "" ;
      edtavGrid_nmrcopia_Visible = 0 ;
      edtavGrid_nmrcopia_Enabled = 1 ;
      edtavGrid_pathpdf_Jsonclick = "" ;
      edtavGrid_pathpdf_Visible = 0 ;
      edtavGrid_pathpdf_Enabled = 1 ;
      edtavIcon_Jsonclick = "" ;
      edtavIcon_Enabled = 1 ;
      edtAlbProEst_Jsonclick = "" ;
      edtCod_pais_Jsonclick = "" ;
      chkBarTipCor.setCaption( "" );
      edtAlbProfch_Jsonclick = "" ;
      edtCliMailPk_Jsonclick = "" ;
      chkCliMailPkE.setCaption( "" );
      edtCliMailGr_Jsonclick = "" ;
      chkCliMailGrE.setCaption( "" );
      chkCliValA.setCaption( "" );
      edtGuiRemCln_Jsonclick = "" ;
      edtGuiRemCli_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtAlbProCod_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      chkavSelected.setCaption( "" );
      chkavSelected.setVisible( -1 );
      chkavSelected.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavIcon_Visible = -1 ;
      edtavIcon_Tooltiptext = "" ;
      edtavIcon_gximage = "" ;
      chkavSelected.setTitle( "" );
      chkavSelectall.setVisible( 1 );
      edtavClicodto_Jsonclick = "" ;
      edtavClicodto_Visible = 1 ;
      edtavClicodfrom_Jsonclick = "" ;
      edtavClicodfrom_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavInfo_Jsonclick = "" ;
      edtavInfo_Enabled = 1 ;
      cmbavCopias2.setJsonclick( "" );
      cmbavCopias2.setEnabled( 1 );
      edtavPathpdf_Jsonclick = "" ;
      edtavPathpdf_Enabled = 1 ;
      chkavVermail.setEnabled( 1 );
      cmbavManaut.setJsonclick( "" );
      cmbavManaut.setEnabled( 1 );
      cmbavPrio.setJsonclick( "" );
      cmbavPrio.setEnabled( 1 );
      edtavAlbprocodto_Jsonclick = "" ;
      edtavAlbprocodto_Enabled = 1 ;
      edtavAlbprocodfrom_Jsonclick = "" ;
      edtavAlbprocodfrom_Enabled = 1 ;
      edtavAlbprofchto_Jsonclick = "" ;
      edtavAlbprofchto_Enabled = 1 ;
      edtavAlbprofchfrom_Jsonclick = "" ;
      edtavAlbprofchfrom_Enabled = 1 ;
      divLayoutmaintable_Class = "Table TableWithSelectableGrid" ;
      chkavSelected.setTitleFormat( (short)(0) );
      Grid_empowerer_Fixedcolumns = ";;;;;;;;;;;;;;;;;R;;" ;
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
      Dvpanel_panel_filtros_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Iconposition = "Right" ;
      Dvpanel_panel_filtros_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtros_Title = httpContext.getMessage( "<i class=\"fas fa-filter\"></i> Filtros", "") ;
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
      Combo_clicodto_Emptyitemtext = "Todos" ;
      Combo_clicodto_Cls = "ExtendedCombo AttributeFL" ;
      Combo_clicodfrom_Emptyitemtext = "Todos" ;
      Combo_clicodfrom_Cls = "ExtendedCombo AttributeFL" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( " Impression de Guias", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavPrio.setName( "vPRIO" );
      cmbavPrio.setWebtags( "" );
      cmbavPrio.addItem("1", httpContext.getMessage( "Guia Remessa", ""), (short)(0));
      cmbavPrio.addItem("0", httpContext.getMessage( "Guia Transporte", ""), (short)(0));
      if ( cmbavPrio.getItemCount() > 0 )
      {
         AV18PRIO = cmbavPrio.getValidValue(AV18PRIO) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18PRIO", AV18PRIO);
      }
      cmbavManaut.setName( "vMANAUT" );
      cmbavManaut.setWebtags( "" );
      cmbavManaut.addItem("A", httpContext.getMessage( "Automatica", ""), (short)(0));
      cmbavManaut.addItem("M", httpContext.getMessage( "Manual", ""), (short)(0));
      if ( cmbavManaut.getItemCount() > 0 )
      {
         AV15ManAut = cmbavManaut.getValidValue(AV15ManAut) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15ManAut", AV15ManAut);
      }
      chkavVermail.setName( "vVERMAIL" );
      chkavVermail.setWebtags( "" );
      chkavVermail.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavVermail.getInternalname(), "TitleCaption", chkavVermail.getCaption(), true);
      chkavVermail.setCheckedValue( "false" );
      AV16VerMail = GXutil.strtobool( GXutil.booltostr( AV16VerMail)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16VerMail", AV16VerMail);
      cmbavCopias2.setName( "vCOPIAS2" );
      cmbavCopias2.setWebtags( "" );
      cmbavCopias2.addItem("1", "1", (short)(0));
      cmbavCopias2.addItem("2", "2", (short)(0));
      cmbavCopias2.addItem("3", "3", (short)(0));
      cmbavCopias2.addItem("4", "4", (short)(0));
      if ( cmbavCopias2.getItemCount() > 0 )
      {
         AV14Copias2 = (short)(GXutil.lval( cmbavCopias2.getValidValue(GXutil.trim( GXutil.str( AV14Copias2, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Copias2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14Copias2), 4, 0));
      }
      GXCCtl = "vSELECTED_" + sGXsfl_124_idx ;
      chkavSelected.setName( GXCCtl );
      chkavSelected.setWebtags( "" );
      chkavSelected.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSelected.getInternalname(), "TitleCaption", chkavSelected.getCaption(), !bGXsfl_124_Refreshing);
      chkavSelected.setCheckedValue( "false" );
      AV62Selected = GXutil.strtobool( GXutil.booltostr( AV62Selected)) ;
      httpContext.ajax_rsp_assign_attri("", false, chkavSelected.getInternalname(), AV62Selected);
      GXCCtl = "CLIVALA_" + sGXsfl_124_idx ;
      chkCliValA.setName( GXCCtl );
      chkCliValA.setWebtags( "" );
      chkCliValA.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkCliValA.getInternalname(), "TitleCaption", chkCliValA.getCaption(), !bGXsfl_124_Refreshing);
      chkCliValA.setCheckedValue( "N" );
      A1902CliValA = ((GXutil.strcmp(GXutil.rtrim( A1902CliValA), "S")==0) ? "S" : "N") ;
      GXCCtl = "CLIMAILGRE_" + sGXsfl_124_idx ;
      chkCliMailGrE.setName( GXCCtl );
      chkCliMailGrE.setWebtags( "" );
      chkCliMailGrE.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkCliMailGrE.getInternalname(), "TitleCaption", chkCliMailGrE.getCaption(), !bGXsfl_124_Refreshing);
      chkCliMailGrE.setCheckedValue( "N" );
      A11622CliMailGrE = ((GXutil.strcmp(GXutil.rtrim( A11622CliMailGrE), "S")==0) ? "S" : "N") ;
      GXCCtl = "CLIMAILPKE_" + sGXsfl_124_idx ;
      chkCliMailPkE.setName( GXCCtl );
      chkCliMailPkE.setWebtags( "" );
      chkCliMailPkE.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkCliMailPkE.getInternalname(), "TitleCaption", chkCliMailPkE.getCaption(), !bGXsfl_124_Refreshing);
      chkCliMailPkE.setCheckedValue( "N" );
      A11623CliMailPkE = ((GXutil.strcmp(GXutil.rtrim( A11623CliMailPkE), "S")==0) ? "S" : "N") ;
      GXCCtl = "BARTIPCOR_" + sGXsfl_124_idx ;
      chkBarTipCor.setName( GXCCtl );
      chkBarTipCor.setWebtags( "" );
      chkBarTipCor.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkBarTipCor.getInternalname(), "TitleCaption", chkBarTipCor.getCaption(), !bGXsfl_124_Refreshing);
      chkBarTipCor.setCheckedValue( "NO" );
      A5291BarTipCor = ((GXutil.strcmp(GXutil.rtrim( A5291BarTipCor), "SI")==0) ? "SI" : "NO") ;
      chkavSelectall.setName( "vSELECTALL" );
      chkavSelectall.setWebtags( "" );
      chkavSelectall.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSelectall.getInternalname(), "TitleCaption", chkavSelectall.getCaption(), true);
      chkavSelectall.setCheckedValue( "false" );
      AV86SelectAll = GXutil.strtobool( GXutil.booltostr( AV86SelectAll)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86SelectAll", AV86SelectAll);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV21AlbProfchfrom',fld:'vALBPROFCHFROM',pic:''},{av:'AV22AlbProfchto',fld:'vALBPROFCHTO',pic:''},{av:'AV19AlbProCodfrom',fld:'vALBPROCODFROM',pic:'ZZZZZZZZZ9'},{av:'AV20AlbProCodto',fld:'vALBPROCODTO',pic:'ZZZZZZZZZ9'},{av:'cmbavPrio'},{av:'AV18PRIO',fld:'vPRIO',pic:'9'},{av:'cmbavManaut'},{av:'AV15ManAut',fld:'vMANAUT',pic:''},{av:'AV23CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV24CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'chkavSelected.getTitleFormat()',ctrl:'vSELECTED',prop:'Titleformat'},{av:'cmbavCopias2'},{av:'AV14Copias2',fld:'vCOPIAS2',pic:'ZZZ9'},{av:'AV65i',fld:'vI',pic:'ZZZZZZZZZ9'},{av:'AV66EmprCodCol',fld:'vEMPRCODCOL',pic:''},{av:'AV69EmprCodToFind',fld:'vEMPRCODTOFIND',pic:'@!'},{av:'AV70AlbProCodCol',fld:'vALBPROCODCOL',pic:''},{av:'AV73AlbProCodToFind',fld:'vALBPROCODTOFIND',pic:'ZZZZZZZZZ9'},{av:'AV74BarCodCol',fld:'vBARCODCOL',pic:''},{av:'AV77BarCodToFind',fld:'vBARCODTOFIND',pic:'ZZZZZZZ9'},{av:'AV78BarCodReoCol',fld:'vBARCODREOCOL',pic:''},{av:'AV81BarCodReoToFind',fld:'vBARCODREOTOFIND',pic:'9'},{av:'AV82BarCodParCol',fld:'vBARCODPARCOL',pic:''},{av:'AV85BarCodParToFind',fld:'vBARCODPARTOFIND',pic:''},{av:'AV91LoadGridData',fld:'vLOADGRIDDATA',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV44EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV67EmprCodJson',fld:'vEMPRCODJSON',pic:''},{av:'AV71AlbProCodJson',fld:'vALBPROCODJSON',pic:''},{av:'AV75BarCodJson',fld:'vBARCODJSON',pic:''},{av:'AV79BarCodReoJson',fld:'vBARCODREOJSON',pic:''},{av:'AV83BarCodParJson',fld:'vBARCODPARJSON',pic:''},{av:'AV125Pgmname',fld:'vPGMNAME',pic:''},{av:'AV17PATHPDF',fld:'vPATHPDF',pic:''},{av:'AV16VerMail',fld:'vVERMAIL',pic:''},{av:'AV86SelectAll',fld:'vSELECTALL',pic:''},{av:'AV110CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV108Usumail',fld:'vUSUMAIL',pic:'',hsh:true},{av:'AV45EmprNom',fld:'vEMPRNOM',pic:'',hsh:true},{av:'AV116MostrarMail',fld:'vMOSTRARMAIL',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'chkavSelected.getTitle()',ctrl:'vSELECTED',prop:'Title'},{av:'AV86SelectAll',fld:'vSELECTALL',pic:''},{av:'Gridpaginationbar_Emptygridcaption',ctrl:'GRIDPAGINATIONBAR',prop:'EmptyGridCaption'},{av:'AV38GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV39GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV66EmprCodCol',fld:'vEMPRCODCOL',pic:''},{av:'AV70AlbProCodCol',fld:'vALBPROCODCOL',pic:''},{av:'AV74BarCodCol',fld:'vBARCODCOL',pic:''},{av:'AV78BarCodReoCol',fld:'vBARCODREOCOL',pic:''},{av:'AV82BarCodParCol',fld:'vBARCODPARCOL',pic:''}]}");
      setEventMetadata("'DOSEARCH'","{handler:'e152972',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV21AlbProfchfrom',fld:'vALBPROFCHFROM',pic:''},{av:'AV22AlbProfchto',fld:'vALBPROFCHTO',pic:''},{av:'AV19AlbProCodfrom',fld:'vALBPROCODFROM',pic:'ZZZZZZZZZ9'},{av:'AV20AlbProCodto',fld:'vALBPROCODTO',pic:'ZZZZZZZZZ9'},{av:'cmbavPrio'},{av:'AV18PRIO',fld:'vPRIO',pic:'9'},{av:'cmbavManaut'},{av:'AV15ManAut',fld:'vMANAUT',pic:''},{av:'AV23CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV24CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV44EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV91LoadGridData',fld:'vLOADGRIDDATA',pic:''},{av:'AV67EmprCodJson',fld:'vEMPRCODJSON',pic:''},{av:'AV71AlbProCodJson',fld:'vALBPROCODJSON',pic:''},{av:'AV75BarCodJson',fld:'vBARCODJSON',pic:''},{av:'AV79BarCodReoJson',fld:'vBARCODREOJSON',pic:''},{av:'AV83BarCodParJson',fld:'vBARCODPARJSON',pic:''},{av:'AV125Pgmname',fld:'vPGMNAME',pic:''},{av:'chkavSelected.getTitleFormat()',ctrl:'vSELECTED',prop:'Titleformat'},{av:'AV17PATHPDF',fld:'vPATHPDF',pic:''},{av:'cmbavCopias2'},{av:'AV14Copias2',fld:'vCOPIAS2',pic:'ZZZ9'},{av:'AV65i',fld:'vI',pic:'ZZZZZZZZZ9'},{av:'AV66EmprCodCol',fld:'vEMPRCODCOL',pic:''},{av:'AV69EmprCodToFind',fld:'vEMPRCODTOFIND',pic:'@!'},{av:'AV70AlbProCodCol',fld:'vALBPROCODCOL',pic:''},{av:'AV73AlbProCodToFind',fld:'vALBPROCODTOFIND',pic:'ZZZZZZZZZ9'},{av:'AV74BarCodCol',fld:'vBARCODCOL',pic:''},{av:'AV77BarCodToFind',fld:'vBARCODTOFIND',pic:'ZZZZZZZ9'},{av:'AV78BarCodReoCol',fld:'vBARCODREOCOL',pic:''},{av:'AV81BarCodReoToFind',fld:'vBARCODREOTOFIND',pic:'9'},{av:'AV82BarCodParCol',fld:'vBARCODPARCOL',pic:''},{av:'AV85BarCodParToFind',fld:'vBARCODPARTOFIND',pic:''},{av:'AV16VerMail',fld:'vVERMAIL',pic:''},{av:'AV86SelectAll',fld:'vSELECTALL',pic:''},{av:'AV110CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV108Usumail',fld:'vUSUMAIL',pic:'',hsh:true},{av:'AV45EmprNom',fld:'vEMPRNOM',pic:'',hsh:true},{av:'AV116MostrarMail',fld:'vMOSTRARMAIL',pic:'',hsh:true}]");
      setEventMetadata("'DOSEARCH'",",oparms:[{av:'AV91LoadGridData',fld:'vLOADGRIDDATA',pic:''},{av:'chkavSelected.getTitle()',ctrl:'vSELECTED',prop:'Title'},{av:'AV86SelectAll',fld:'vSELECTALL',pic:''},{av:'Gridpaginationbar_Emptygridcaption',ctrl:'GRIDPAGINATIONBAR',prop:'EmptyGridCaption'},{av:'AV38GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV39GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV66EmprCodCol',fld:'vEMPRCODCOL',pic:''},{av:'AV70AlbProCodCol',fld:'vALBPROCODCOL',pic:''},{av:'AV74BarCodCol',fld:'vBARCODCOL',pic:''},{av:'AV78BarCodReoCol',fld:'vBARCODREOCOL',pic:''},{av:'AV82BarCodParCol',fld:'vBARCODPARCOL',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e132972',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV21AlbProfchfrom',fld:'vALBPROFCHFROM',pic:''},{av:'AV22AlbProfchto',fld:'vALBPROFCHTO',pic:''},{av:'AV19AlbProCodfrom',fld:'vALBPROCODFROM',pic:'ZZZZZZZZZ9'},{av:'AV20AlbProCodto',fld:'vALBPROCODTO',pic:'ZZZZZZZZZ9'},{av:'cmbavPrio'},{av:'AV18PRIO',fld:'vPRIO',pic:'9'},{av:'cmbavManaut'},{av:'AV15ManAut',fld:'vMANAUT',pic:''},{av:'AV23CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV24CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV44EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV91LoadGridData',fld:'vLOADGRIDDATA',pic:''},{av:'AV67EmprCodJson',fld:'vEMPRCODJSON',pic:''},{av:'AV71AlbProCodJson',fld:'vALBPROCODJSON',pic:''},{av:'AV75BarCodJson',fld:'vBARCODJSON',pic:''},{av:'AV79BarCodReoJson',fld:'vBARCODREOJSON',pic:''},{av:'AV83BarCodParJson',fld:'vBARCODPARJSON',pic:''},{av:'AV125Pgmname',fld:'vPGMNAME',pic:''},{av:'chkavSelected.getTitleFormat()',ctrl:'vSELECTED',prop:'Titleformat'},{av:'AV17PATHPDF',fld:'vPATHPDF',pic:''},{av:'cmbavCopias2'},{av:'AV14Copias2',fld:'vCOPIAS2',pic:'ZZZ9'},{av:'AV65i',fld:'vI',pic:'ZZZZZZZZZ9'},{av:'AV66EmprCodCol',fld:'vEMPRCODCOL',pic:''},{av:'AV69EmprCodToFind',fld:'vEMPRCODTOFIND',pic:'@!'},{av:'AV70AlbProCodCol',fld:'vALBPROCODCOL',pic:''},{av:'AV73AlbProCodToFind',fld:'vALBPROCODTOFIND',pic:'ZZZZZZZZZ9'},{av:'AV74BarCodCol',fld:'vBARCODCOL',pic:''},{av:'AV77BarCodToFind',fld:'vBARCODTOFIND',pic:'ZZZZZZZ9'},{av:'AV78BarCodReoCol',fld:'vBARCODREOCOL',pic:''},{av:'AV81BarCodReoToFind',fld:'vBARCODREOTOFIND',pic:'9'},{av:'AV82BarCodParCol',fld:'vBARCODPARCOL',pic:''},{av:'AV85BarCodParToFind',fld:'vBARCODPARTOFIND',pic:''},{av:'AV16VerMail',fld:'vVERMAIL',pic:''},{av:'AV86SelectAll',fld:'vSELECTALL',pic:''},{av:'AV110CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV108Usumail',fld:'vUSUMAIL',pic:'',hsh:true},{av:'AV45EmprNom',fld:'vEMPRNOM',pic:'',hsh:true},{av:'AV116MostrarMail',fld:'vMOSTRARMAIL',pic:'',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e142972',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV21AlbProfchfrom',fld:'vALBPROFCHFROM',pic:''},{av:'AV22AlbProfchto',fld:'vALBPROFCHTO',pic:''},{av:'AV19AlbProCodfrom',fld:'vALBPROCODFROM',pic:'ZZZZZZZZZ9'},{av:'AV20AlbProCodto',fld:'vALBPROCODTO',pic:'ZZZZZZZZZ9'},{av:'cmbavPrio'},{av:'AV18PRIO',fld:'vPRIO',pic:'9'},{av:'cmbavManaut'},{av:'AV15ManAut',fld:'vMANAUT',pic:''},{av:'AV23CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV24CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV44EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV91LoadGridData',fld:'vLOADGRIDDATA',pic:''},{av:'AV67EmprCodJson',fld:'vEMPRCODJSON',pic:''},{av:'AV71AlbProCodJson',fld:'vALBPROCODJSON',pic:''},{av:'AV75BarCodJson',fld:'vBARCODJSON',pic:''},{av:'AV79BarCodReoJson',fld:'vBARCODREOJSON',pic:''},{av:'AV83BarCodParJson',fld:'vBARCODPARJSON',pic:''},{av:'AV125Pgmname',fld:'vPGMNAME',pic:''},{av:'chkavSelected.getTitleFormat()',ctrl:'vSELECTED',prop:'Titleformat'},{av:'AV17PATHPDF',fld:'vPATHPDF',pic:''},{av:'cmbavCopias2'},{av:'AV14Copias2',fld:'vCOPIAS2',pic:'ZZZ9'},{av:'AV65i',fld:'vI',pic:'ZZZZZZZZZ9'},{av:'AV66EmprCodCol',fld:'vEMPRCODCOL',pic:''},{av:'AV69EmprCodToFind',fld:'vEMPRCODTOFIND',pic:'@!'},{av:'AV70AlbProCodCol',fld:'vALBPROCODCOL',pic:''},{av:'AV73AlbProCodToFind',fld:'vALBPROCODTOFIND',pic:'ZZZZZZZZZ9'},{av:'AV74BarCodCol',fld:'vBARCODCOL',pic:''},{av:'AV77BarCodToFind',fld:'vBARCODTOFIND',pic:'ZZZZZZZ9'},{av:'AV78BarCodReoCol',fld:'vBARCODREOCOL',pic:''},{av:'AV81BarCodReoToFind',fld:'vBARCODREOTOFIND',pic:'9'},{av:'AV82BarCodParCol',fld:'vBARCODPARCOL',pic:''},{av:'AV85BarCodParToFind',fld:'vBARCODPARTOFIND',pic:''},{av:'AV16VerMail',fld:'vVERMAIL',pic:''},{av:'AV86SelectAll',fld:'vSELECTALL',pic:''},{av:'AV110CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV108Usumail',fld:'vUSUMAIL',pic:'',hsh:true},{av:'AV45EmprNom',fld:'vEMPRNOM',pic:'',hsh:true},{av:'AV116MostrarMail',fld:'vMOSTRARMAIL',pic:'',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e202972',iparms:[{av:'AV17PATHPDF',fld:'vPATHPDF',pic:''},{av:'cmbavCopias2'},{av:'AV14Copias2',fld:'vCOPIAS2',pic:'ZZZ9'},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''},{av:'A11620CliMailGr',fld:'CLIMAILGR',pic:''},{av:'A11621CliMailPk',fld:'CLIMAILPK',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV65i',fld:'vI',pic:'ZZZZZZZZZ9'},{av:'AV66EmprCodCol',fld:'vEMPRCODCOL',pic:''},{av:'AV69EmprCodToFind',fld:'vEMPRCODTOFIND',pic:'@!'},{av:'AV70AlbProCodCol',fld:'vALBPROCODCOL',pic:''},{av:'AV73AlbProCodToFind',fld:'vALBPROCODTOFIND',pic:'ZZZZZZZZZ9'},{av:'AV74BarCodCol',fld:'vBARCODCOL',pic:''},{av:'AV77BarCodToFind',fld:'vBARCODTOFIND',pic:'ZZZZZZZ9'},{av:'AV78BarCodReoCol',fld:'vBARCODREOCOL',pic:''},{av:'AV81BarCodReoToFind',fld:'vBARCODREOTOFIND',pic:'9'},{av:'AV82BarCodParCol',fld:'vBARCODPARCOL',pic:''},{av:'AV85BarCodParToFind',fld:'vBARCODPARTOFIND',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV98Grid_PathPdf',fld:'vGRID_PATHPDF',pic:'',hsh:true},{av:'AV100Grid_NmrCopia',fld:'vGRID_NMRCOPIA',pic:'ZZZ9',hsh:true},{av:'edtavIcon_Visible',ctrl:'vICON',prop:'Visible'},{av:'AV62Selected',fld:'vSELECTED',pic:''},{av:'AV87Icon',fld:'vICON',pic:''},{av:'edtavIcon_Tooltiptext',ctrl:'vICON',prop:'Tooltiptext'},{av:'AV69EmprCodToFind',fld:'vEMPRCODTOFIND',pic:'@!'},{av:'AV73AlbProCodToFind',fld:'vALBPROCODTOFIND',pic:'ZZZZZZZZZ9'},{av:'AV77BarCodToFind',fld:'vBARCODTOFIND',pic:'ZZZZZZZ9'},{av:'AV81BarCodReoToFind',fld:'vBARCODREOTOFIND',pic:'9'},{av:'AV85BarCodParToFind',fld:'vBARCODPARTOFIND',pic:''},{av:'AV65i',fld:'vI',pic:'ZZZZZZZZZ9'},{av:'AV68EmprCodColItem',fld:'vEMPRCODCOLITEM',pic:'@!'}]}");
      setEventMetadata("VSELECTED.CLICK","{handler:'e222972',iparms:[{av:'AV62Selected',fld:'vSELECTED',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV66EmprCodCol',fld:'vEMPRCODCOL',pic:''},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV70AlbProCodCol',fld:'vALBPROCODCOL',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV74BarCodCol',fld:'vBARCODCOL',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'AV78BarCodReoCol',fld:'vBARCODREOCOL',pic:''},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV82BarCodParCol',fld:'vBARCODPARCOL',pic:''},{av:'AV65i',fld:'vI',pic:'ZZZZZZZZZ9'},{av:'AV69EmprCodToFind',fld:'vEMPRCODTOFIND',pic:'@!'},{av:'AV73AlbProCodToFind',fld:'vALBPROCODTOFIND',pic:'ZZZZZZZZZ9'},{av:'AV77BarCodToFind',fld:'vBARCODTOFIND',pic:'ZZZZZZZ9'},{av:'AV81BarCodReoToFind',fld:'vBARCODREOTOFIND',pic:'9'},{av:'AV85BarCodParToFind',fld:'vBARCODPARTOFIND',pic:''}]");
      setEventMetadata("VSELECTED.CLICK",",oparms:[{av:'AV69EmprCodToFind',fld:'vEMPRCODTOFIND',pic:'@!'},{av:'AV73AlbProCodToFind',fld:'vALBPROCODTOFIND',pic:'ZZZZZZZZZ9'},{av:'AV77BarCodToFind',fld:'vBARCODTOFIND',pic:'ZZZZZZZ9'},{av:'AV81BarCodReoToFind',fld:'vBARCODREOTOFIND',pic:'9'},{av:'AV85BarCodParToFind',fld:'vBARCODPARTOFIND',pic:''},{av:'AV66EmprCodCol',fld:'vEMPRCODCOL',pic:''},{av:'AV70AlbProCodCol',fld:'vALBPROCODCOL',pic:''},{av:'AV74BarCodCol',fld:'vBARCODCOL',pic:''},{av:'AV78BarCodReoCol',fld:'vBARCODREOCOL',pic:''},{av:'AV82BarCodParCol',fld:'vBARCODPARCOL',pic:''},{av:'AV67EmprCodJson',fld:'vEMPRCODJSON',pic:''},{av:'AV71AlbProCodJson',fld:'vALBPROCODJSON',pic:''},{av:'AV75BarCodJson',fld:'vBARCODJSON',pic:''},{av:'AV79BarCodReoJson',fld:'vBARCODREOJSON',pic:''},{av:'AV83BarCodParJson',fld:'vBARCODPARJSON',pic:''},{av:'divLayoutmaintable_Class',ctrl:'LAYOUTMAINTABLE',prop:'Class'},{av:'AV65i',fld:'vI',pic:'ZZZZZZZZZ9'},{av:'AV68EmprCodColItem',fld:'vEMPRCODCOLITEM',pic:'@!'}]}");
      setEventMetadata("'DOPROCESSAR'","{handler:'e162972',iparms:[{av:'AV63SelectedRows',fld:'vSELECTEDROWS',pic:''},{av:'cmbavCopias2'},{av:'AV14Copias2',fld:'vCOPIAS2',pic:'ZZZ9'},{av:'AV105TextoSeparador',fld:'vTEXTOSEPARADOR',pic:''},{av:'AV107ListaCorreosDestino',fld:'vLISTACORREOSDESTINO',pic:''},{av:'AV113ListaCorreosCopia',fld:'vLISTACORREOSCOPIA',pic:''},{av:'AV111ListaCorreosCopiaOculta',fld:'vLISTACORREOSCOPIAOCULTA',pic:''},{av:'AV119Asunto',fld:'vASUNTO',pic:''},{av:'AV112TextoCorreo',fld:'vTEXTOCORREO',pic:''},{av:'AV16VerMail',fld:'vVERMAIL',pic:''},{av:'AV67EmprCodJson',fld:'vEMPRCODJSON',pic:''},{av:'AV71AlbProCodJson',fld:'vALBPROCODJSON',pic:''},{av:'AV75BarCodJson',fld:'vBARCODJSON',pic:''},{av:'AV79BarCodReoJson',fld:'vBARCODREOJSON',pic:''},{av:'AV83BarCodParJson',fld:'vBARCODPARJSON',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A1243GuiRemCli',fld:'GUIREMCLI',pic:'ZZZZZ9'},{av:'A1244GuiRemCln',fld:'GUIREMCLN',pic:''},{av:'A1902CliValA',fld:'CLIVALA',pic:'@!'},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11620CliMailGr',fld:'CLIMAILGR',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''},{av:'A11621CliMailPk',fld:'CLIMAILPK',pic:''},{av:'A34AlbProfch',fld:'ALBPROFCH',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''},{av:'A10301Cod_pais',fld:'COD_PAIS',pic:'ZZZ9'},{av:'A33AlbProEst',fld:'ALBPROEST',pic:'9'},{av:'AV87Icon',fld:'vICON',pic:''},{av:'AV128Icon_GXI',fld:'vICON_GXI',pic:''},{av:'AV98Grid_PathPdf',fld:'vGRID_PATHPDF',pic:'',hsh:true},{av:'AV100Grid_NmrCopia',fld:'vGRID_NMRCOPIA',pic:'ZZZ9',hsh:true},{av:'AV109CliMailGr',fld:'vCLIMAILGR',pic:''},{av:'AV110CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV108Usumail',fld:'vUSUMAIL',pic:'',hsh:true},{av:'AV45EmprNom',fld:'vEMPRNOM',pic:'',hsh:true},{av:'AV102PathXLS_Email',fld:'vPATHXLS_EMAIL',pic:''},{av:'AV101PathPDF_Email',fld:'vPATHPDF_EMAIL',pic:''}]");
      setEventMetadata("'DOPROCESSAR'",",oparms:[{av:'AV104NombresAdjuntos',fld:'vNOMBRESADJUNTOS',pic:''},{av:'AV102PathXLS_Email',fld:'vPATHXLS_EMAIL',pic:''},{av:'AV101PathPDF_Email',fld:'vPATHPDF_EMAIL',pic:''},{av:'AV63SelectedRows',fld:'vSELECTEDROWS',pic:''},{av:'AV66EmprCodCol',fld:'vEMPRCODCOL',pic:''},{av:'AV70AlbProCodCol',fld:'vALBPROCODCOL',pic:''},{av:'AV74BarCodCol',fld:'vBARCODCOL',pic:''},{av:'AV78BarCodReoCol',fld:'vBARCODREOCOL',pic:''},{av:'AV82BarCodParCol',fld:'vBARCODPARCOL',pic:''},{av:'AV65i',fld:'vI',pic:'ZZZZZZZZZ9'},{av:'AV68EmprCodColItem',fld:'vEMPRCODCOLITEM',pic:'@!'},{av:'AV72AlbProCodColItem',fld:'vALBPROCODCOLITEM',pic:'ZZZZZZZZZ9'},{av:'AV76BarCodColItem',fld:'vBARCODCOLITEM',pic:'ZZZZZZZ9'},{av:'AV80BarCodReoColItem',fld:'vBARCODREOCOLITEM',pic:'9'},{av:'AV84BarCodParColItem',fld:'vBARCODPARCOLITEM',pic:''},{av:'AV87Icon',fld:'vICON',pic:''},{av:'edtavIcon_Tooltiptext',ctrl:'vICON',prop:'Tooltiptext'},{av:'edtavIcon_Visible',ctrl:'vICON',prop:'Visible'},{av:'AV105TextoSeparador',fld:'vTEXTOSEPARADOR',pic:''},{av:'AV107ListaCorreosDestino',fld:'vLISTACORREOSDESTINO',pic:''},{av:'AV113ListaCorreosCopia',fld:'vLISTACORREOSCOPIA',pic:''},{av:'AV111ListaCorreosCopiaOculta',fld:'vLISTACORREOSCOPIAOCULTA',pic:''},{av:'AV112TextoCorreo',fld:'vTEXTOCORREO',pic:''},{av:'AV119Asunto',fld:'vASUNTO',pic:''}]}");
      setEventMetadata("VSELECTALL.CLICK","{handler:'e172972',iparms:[{av:'AV86SelectAll',fld:'vSELECTALL',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',grid:124,pic:'@!'},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_124',ctrl:'GRID',grid:124,prop:'GridRC',grid:124},{av:'AV44EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A39AlbProPri',fld:'ALBPROPRI',pic:'9'},{av:'cmbavPrio'},{av:'AV18PRIO',fld:'vPRIO',pic:'9'},{av:'cmbavManaut'},{av:'AV15ManAut',fld:'vMANAUT',pic:''},{av:'A30AlbProCod',fld:'ALBPROCOD',grid:124,pic:'ZZZZZZZZZ9'},{av:'AV19AlbProCodfrom',fld:'vALBPROCODFROM',pic:'ZZZZZZZZZ9'},{av:'AV20AlbProCodto',fld:'vALBPROCODTO',pic:'ZZZZZZZZZ9'},{av:'A34AlbProfch',fld:'ALBPROFCH',grid:124,pic:''},{av:'AV21AlbProfchfrom',fld:'vALBPROFCHFROM',pic:''},{av:'AV22AlbProfchto',fld:'vALBPROFCHTO',pic:''},{av:'A1243GuiRemCli',fld:'GUIREMCLI',grid:124,pic:'ZZZZZ9'},{av:'AV23CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV24CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'A33AlbProEst',fld:'ALBPROEST',grid:124,pic:'9'},{av:'AV66EmprCodCol',fld:'vEMPRCODCOL',pic:''},{av:'AV70AlbProCodCol',fld:'vALBPROCODCOL',pic:''},{av:'A129BarCod',fld:'BARCOD',grid:124,pic:'ZZZZZZZ9'},{av:'AV74BarCodCol',fld:'vBARCODCOL',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',grid:124,pic:'9'},{av:'AV78BarCodReoCol',fld:'vBARCODREOCOL',pic:''},{av:'A130BarCodPar',fld:'BARCODPAR',grid:124,pic:''},{av:'AV82BarCodParCol',fld:'vBARCODPARCOL',pic:''}]");
      setEventMetadata("VSELECTALL.CLICK",",oparms:[{av:'AV66EmprCodCol',fld:'vEMPRCODCOL',pic:''},{av:'AV70AlbProCodCol',fld:'vALBPROCODCOL',pic:''},{av:'AV74BarCodCol',fld:'vBARCODCOL',pic:''},{av:'AV78BarCodReoCol',fld:'vBARCODREOCOL',pic:''},{av:'AV82BarCodParCol',fld:'vBARCODPARCOL',pic:''},{av:'AV62Selected',fld:'vSELECTED',pic:''},{av:'AV67EmprCodJson',fld:'vEMPRCODJSON',pic:''},{av:'AV71AlbProCodJson',fld:'vALBPROCODJSON',pic:''},{av:'AV75BarCodJson',fld:'vBARCODJSON',pic:''},{av:'AV79BarCodReoJson',fld:'vBARCODREOJSON',pic:''},{av:'AV83BarCodParJson',fld:'vBARCODPARJSON',pic:''},{av:'divLayoutmaintable_Class',ctrl:'LAYOUTMAINTABLE',prop:'Class'}]}");
      setEventMetadata("COMBO_CLICODTO.ONOPTIONCLICKED","{handler:'e122972',iparms:[{av:'Combo_clicodto_Selectedvalue_get',ctrl:'COMBO_CLICODTO',prop:'SelectedValue_get'}]");
      setEventMetadata("COMBO_CLICODTO.ONOPTIONCLICKED",",oparms:[{av:'AV24CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'}]}");
      setEventMetadata("COMBO_CLICODFROM.ONOPTIONCLICKED","{handler:'e112972',iparms:[{av:'Combo_clicodfrom_Selectedvalue_get',ctrl:'COMBO_CLICODFROM',prop:'SelectedValue_get'}]");
      setEventMetadata("COMBO_CLICODFROM.ONOPTIONCLICKED",",oparms:[{av:'AV23CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'}]}");
      setEventMetadata("VICON.CLICK","{handler:'e212972',iparms:[{av:'A11620CliMailGr',fld:'CLIMAILGR',pic:''},{av:'A11621CliMailPk',fld:'CLIMAILPK',pic:''},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A1243GuiRemCli',fld:'GUIREMCLI',pic:'ZZZZZ9'},{av:'A1244GuiRemCln',fld:'GUIREMCLN',pic:''},{av:'A1902CliValA',fld:'CLIVALA',pic:'@!'},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''},{av:'A34AlbProfch',fld:'ALBPROFCH',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''},{av:'A10301Cod_pais',fld:'COD_PAIS',pic:'ZZZ9'},{av:'A33AlbProEst',fld:'ALBPROEST',pic:'9'},{av:'AV17PATHPDF',fld:'vPATHPDF',pic:''},{av:'cmbavCopias2'},{av:'AV14Copias2',fld:'vCOPIAS2',pic:'ZZZ9'},{av:'AV104NombresAdjuntos',fld:'vNOMBRESADJUNTOS',pic:''},{av:'AV105TextoSeparador',fld:'vTEXTOSEPARADOR',pic:''},{av:'AV107ListaCorreosDestino',fld:'vLISTACORREOSDESTINO',pic:''},{av:'AV113ListaCorreosCopia',fld:'vLISTACORREOSCOPIA',pic:''},{av:'AV111ListaCorreosCopiaOculta',fld:'vLISTACORREOSCOPIAOCULTA',pic:''},{av:'AV119Asunto',fld:'vASUNTO',pic:''},{av:'AV112TextoCorreo',fld:'vTEXTOCORREO',pic:''},{av:'AV116MostrarMail',fld:'vMOSTRARMAIL',pic:'',hsh:true},{av:'AV109CliMailGr',fld:'vCLIMAILGR',pic:''},{av:'AV110CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV108Usumail',fld:'vUSUMAIL',pic:'',hsh:true},{av:'AV45EmprNom',fld:'vEMPRNOM',pic:'',hsh:true},{av:'AV102PathXLS_Email',fld:'vPATHXLS_EMAIL',pic:''},{av:'AV101PathPDF_Email',fld:'vPATHPDF_EMAIL',pic:''}]");
      setEventMetadata("VICON.CLICK",",oparms:[{av:'AV109CliMailGr',fld:'vCLIMAILGR',pic:''},{av:'AV102PathXLS_Email',fld:'vPATHXLS_EMAIL',pic:''},{av:'AV101PathPDF_Email',fld:'vPATHPDF_EMAIL',pic:''},{av:'AV104NombresAdjuntos',fld:'vNOMBRESADJUNTOS',pic:''},{av:'AV105TextoSeparador',fld:'vTEXTOSEPARADOR',pic:''},{av:'AV107ListaCorreosDestino',fld:'vLISTACORREOSDESTINO',pic:''},{av:'AV113ListaCorreosCopia',fld:'vLISTACORREOSCOPIA',pic:''},{av:'AV111ListaCorreosCopiaOculta',fld:'vLISTACORREOSCOPIAOCULTA',pic:''},{av:'AV112TextoCorreo',fld:'vTEXTOCORREO',pic:''},{av:'AV119Asunto',fld:'vASUNTO',pic:''}]}");
      setEventMetadata("VALIDV_PRIO","{handler:'validv_Prio',iparms:[]");
      setEventMetadata("VALIDV_PRIO",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBPROCOD","{handler:'valid_Albprocod',iparms:[]");
      setEventMetadata("VALID_ALBPROCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_GUIREMCLI","{handler:'valid_Guiremcli',iparms:[]");
      setEventMetadata("VALID_GUIREMCLI",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Grid_nmrcopia',iparms:[]");
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
      Gridpaginationbar_Selectedpage = "" ;
      Combo_clicodto_Selectedvalue_get = "" ;
      Combo_clicodfrom_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV21AlbProfchfrom = GXutil.nullDate() ;
      AV22AlbProfchto = GXutil.nullDate() ;
      AV18PRIO = "" ;
      AV15ManAut = "" ;
      AV44EmprCod = "" ;
      AV67EmprCodJson = "" ;
      AV71AlbProCodJson = "" ;
      AV75BarCodJson = "" ;
      AV79BarCodReoJson = "" ;
      AV83BarCodParJson = "" ;
      AV125Pgmname = "" ;
      AV17PATHPDF = "" ;
      AV66EmprCodCol = new GXSimpleCollection<String>(String.class, "internal", "");
      AV69EmprCodToFind = "" ;
      AV70AlbProCodCol = new GXSimpleCollection<Long>(Long.class, "internal", "");
      AV74BarCodCol = new GXSimpleCollection<Integer>(Integer.class, "internal", "");
      AV78BarCodReoCol = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV82BarCodParCol = new GXSimpleCollection<String>(String.class, "internal", "");
      AV85BarCodParToFind = "" ;
      AV110CliNom = "" ;
      AV108Usumail = "" ;
      AV45EmprNom = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV40CliCodfrom_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV42CliCodto_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV63SelectedRows = new GXBaseCollection<app.SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem>(app.SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem.class, "ImpresionGuiawwSDTItem", "TexplusNET", remoteHandle);
      AV105TextoSeparador = "" ;
      AV107ListaCorreosDestino = new GXSimpleCollection<String>(String.class, "internal", "");
      AV113ListaCorreosCopia = new GXSimpleCollection<String>(String.class, "internal", "");
      AV111ListaCorreosCopiaOculta = new GXSimpleCollection<String>(String.class, "internal", "");
      AV119Asunto = "" ;
      AV112TextoCorreo = "" ;
      AV128Icon_GXI = "" ;
      AV109CliMailGr = "" ;
      AV102PathXLS_Email = "" ;
      AV101PathPDF_Email = "" ;
      A39AlbProPri = "" ;
      AV104NombresAdjuntos = new GXSimpleCollection<String>(String.class, "internal", "");
      Combo_clicodfrom_Selectedvalue_set = "" ;
      Combo_clicodto_Selectedvalue_set = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_filtrosgenerales = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_clicodfrom_Jsonclick = "" ;
      ucCombo_clicodfrom = new com.genexus.webpanels.GXUserControl();
      Combo_clicodfrom_Caption = "" ;
      lblTextblockcombo_clicodto_Jsonclick = "" ;
      ucCombo_clicodto = new com.genexus.webpanels.GXUserControl();
      Combo_clicodto_Caption = "" ;
      TempTags = "" ;
      ucBarradeprogreso = new com.genexus.webpanels.GXUserControl();
      ClassString = "" ;
      StyleString = "" ;
      bttBtn_search_Jsonclick = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      AV115Info = "" ;
      bttBtnprocessar_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A1244GuiRemCln = "" ;
      A1902CliValA = "" ;
      A11622CliMailGrE = "" ;
      A11620CliMailGr = "" ;
      A11623CliMailPkE = "" ;
      A11621CliMailPk = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A5291BarTipCor = "" ;
      AV87Icon = "" ;
      AV98Grid_PathPdf = "" ;
      Gx_date = GXutil.nullDate() ;
      scmdbuf = "" ;
      H02972_A252CliCod = new int[1] ;
      H02972_n252CliCod = new boolean[] {false} ;
      H02972_A1253EmprGuiRem = new String[] {""} ;
      H02972_A39AlbProPri = new String[] {""} ;
      H02972_A33AlbProEst = new byte[1] ;
      H02972_A10301Cod_pais = new short[1] ;
      H02972_n10301Cod_pais = new boolean[] {false} ;
      H02972_A5291BarTipCor = new String[] {""} ;
      H02972_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      H02972_A11621CliMailPk = new String[] {""} ;
      H02972_A11623CliMailPkE = new String[] {""} ;
      H02972_A11620CliMailGr = new String[] {""} ;
      H02972_A11622CliMailGrE = new String[] {""} ;
      H02972_A1902CliValA = new String[] {""} ;
      H02972_A1244GuiRemCln = new String[] {""} ;
      H02972_A1243GuiRemCli = new int[1] ;
      H02972_A130BarCodPar = new String[] {""} ;
      H02972_A132BarCodReo = new byte[1] ;
      H02972_A129BarCod = new int[1] ;
      H02972_A30AlbProCod = new long[1] ;
      H02972_A396EmprCod = new String[] {""} ;
      A1253EmprGuiRem = "" ;
      H02973_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV43Station = "" ;
      GXv_char2 = new String[1] ;
      AV46UsurCod = "" ;
      AV47Copia = new String[4] ;
      GX_I = 1 ;
      while ( GX_I <= 4 )
      {
         AV47Copia[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      GXv_int5 = new int[1] ;
      GXt_char1 = "" ;
      AV92IniDate = GXutil.nullDate() ;
      AV93EndDate = GXutil.nullDate() ;
      GXv_int7 = new byte[1] ;
      H02974_A850UsurCod = new String[] {""} ;
      H02974_A10513UsuMail = new String[] {""} ;
      A850UsurCod = "" ;
      A10513UsuMail = "" ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext8 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV68EmprCodColItem = "" ;
      AV64SelectedRow = new app.SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem(remoteHandle, context);
      AV84BarCodParColItem = "" ;
      H02975_A252CliCod = new int[1] ;
      H02975_n252CliCod = new boolean[] {false} ;
      H02975_A1253EmprGuiRem = new String[] {""} ;
      H02975_A130BarCodPar = new String[] {""} ;
      H02975_A132BarCodReo = new byte[1] ;
      H02975_A129BarCod = new int[1] ;
      H02975_A30AlbProCod = new long[1] ;
      H02975_A396EmprCod = new String[] {""} ;
      H02975_A1243GuiRemCli = new int[1] ;
      H02975_A1244GuiRemCln = new String[] {""} ;
      H02975_A1902CliValA = new String[] {""} ;
      H02975_A11622CliMailGrE = new String[] {""} ;
      H02975_A11620CliMailGr = new String[] {""} ;
      H02975_A11623CliMailPkE = new String[] {""} ;
      H02975_A11621CliMailPk = new String[] {""} ;
      H02975_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      H02975_A5291BarTipCor = new String[] {""} ;
      H02975_A10301Cod_pais = new short[1] ;
      H02975_n10301Cod_pais = new boolean[] {false} ;
      H02975_A33AlbProEst = new byte[1] ;
      AV25Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      H02976_A33AlbProEst = new byte[1] ;
      H02976_A1243GuiRemCli = new int[1] ;
      H02976_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      H02976_A30AlbProCod = new long[1] ;
      H02976_A39AlbProPri = new String[] {""} ;
      H02976_A396EmprCod = new String[] {""} ;
      H02976_A129BarCod = new int[1] ;
      H02976_A132BarCodReo = new byte[1] ;
      H02976_A130BarCodPar = new String[] {""} ;
      H02977_A10045CliAct = new String[] {""} ;
      H02977_A396EmprCod = new String[] {""} ;
      H02977_A13735CliCNom = new String[] {""} ;
      H02977_A252CliCod = new int[1] ;
      H02977_n252CliCod = new boolean[] {false} ;
      H02977_A279CliNom = new String[] {""} ;
      A10045CliAct = "" ;
      A13735CliCNom = "" ;
      A279CliNom = "" ;
      AV41Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      H02978_A10045CliAct = new String[] {""} ;
      H02978_A396EmprCod = new String[] {""} ;
      H02978_A13735CliCNom = new String[] {""} ;
      H02978_A252CliCod = new int[1] ;
      H02978_n252CliCod = new boolean[] {false} ;
      H02978_A279CliNom = new String[] {""} ;
      AV114CLIMAILPK = "" ;
      AV117ImpresionGuiawwSDT = new GXBaseCollection<app.SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem>(app.SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem.class, "ImpresionGuiawwSDTItem", "TexplusNET", remoteHandle);
      AV118ImpresionGuiawwSDTItem = new app.SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem(remoteHandle, context);
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      AV106CadenaRegistrar = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      sImgUrl = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.impresionguiaww__default(),
         new Object[] {
             new Object[] {
            H02972_A252CliCod, H02972_n252CliCod, H02972_A1253EmprGuiRem, H02972_A39AlbProPri, H02972_A33AlbProEst, H02972_A10301Cod_pais, H02972_n10301Cod_pais, H02972_A5291BarTipCor, H02972_A34AlbProfch, H02972_A11621CliMailPk,
            H02972_A11623CliMailPkE, H02972_A11620CliMailGr, H02972_A11622CliMailGrE, H02972_A1902CliValA, H02972_A1244GuiRemCln, H02972_A1243GuiRemCli, H02972_A130BarCodPar, H02972_A132BarCodReo, H02972_A129BarCod, H02972_A30AlbProCod,
            H02972_A396EmprCod
            }
            , new Object[] {
            H02973_AGRID_nRecordCount
            }
            , new Object[] {
            H02974_A850UsurCod, H02974_A10513UsuMail
            }
            , new Object[] {
            H02975_A252CliCod, H02975_n252CliCod, H02975_A1253EmprGuiRem, H02975_A130BarCodPar, H02975_A132BarCodReo, H02975_A129BarCod, H02975_A30AlbProCod, H02975_A396EmprCod, H02975_A1243GuiRemCli, H02975_A1244GuiRemCln,
            H02975_A1902CliValA, H02975_A11622CliMailGrE, H02975_A11620CliMailGr, H02975_A11623CliMailPkE, H02975_A11621CliMailPk, H02975_A34AlbProfch, H02975_A5291BarTipCor, H02975_A10301Cod_pais, H02975_n10301Cod_pais, H02975_A33AlbProEst
            }
            , new Object[] {
            H02976_A33AlbProEst, H02976_A1243GuiRemCli, H02976_A34AlbProfch, H02976_A30AlbProCod, H02976_A39AlbProPri, H02976_A396EmprCod, H02976_A129BarCod, H02976_A132BarCodReo, H02976_A130BarCodPar
            }
            , new Object[] {
            H02977_A10045CliAct, H02977_A396EmprCod, H02977_A13735CliCNom, H02977_A252CliCod, H02977_A279CliNom
            }
            , new Object[] {
            H02978_A10045CliAct, H02978_A396EmprCod, H02978_A13735CliCNom, H02978_A252CliCod, H02978_A279CliNom
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV125Pgmname = "ImpresionGuiaww" ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      AV125Pgmname = "ImpresionGuiaww" ;
      Gx_err = (short)(0) ;
      chkavVermail.setEnabled( 0 );
      edtavPathpdf_Enabled = 0 ;
      edtavInfo_Enabled = 0 ;
      edtavGrid_pathpdf_Enabled = 0 ;
      edtavGrid_nmrcopia_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV81BarCodReoToFind ;
   private byte gxajaxcallmode ;
   private byte A132BarCodReo ;
   private byte A33AlbProEst ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte GXt_int6 ;
   private byte GXv_int7[] ;
   private byte AV80BarCodReoColItem ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
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
   private short AV14Copias2 ;
   private short wbEnd ;
   private short wbStart ;
   private short A10301Cod_pais ;
   private short AV100Grid_NmrCopia ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV94Copias ;
   private short AV96Ano ;
   private short AV97Mes ;
   private short AV103Moda21 ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_124 ;
   private int nGXsfl_124_idx=1 ;
   private int AV23CliCodfrom ;
   private int AV24CliCodto ;
   private int AV77BarCodToFind ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavAlbprofchfrom_Enabled ;
   private int edtavAlbprofchto_Enabled ;
   private int edtavAlbprocodfrom_Enabled ;
   private int edtavAlbprocodto_Enabled ;
   private int edtavPathpdf_Enabled ;
   private int edtavInfo_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavClicodfrom_Visible ;
   private int edtavClicodto_Visible ;
   private int A129BarCod ;
   private int A1243GuiRemCli ;
   private int subGrid_Islastpage ;
   private int edtavGrid_pathpdf_Enabled ;
   private int edtavGrid_nmrcopia_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int A252CliCod ;
   private int GXv_int5[] ;
   private int AV37PageToGo ;
   private int edtavIcon_Visible ;
   private int nGXsfl_124_fel_idx=1 ;
   private int AV130GXV1 ;
   private int AV131GXV2 ;
   private int AV76BarCodColItem ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavIcon_Enabled ;
   private int edtavGrid_pathpdf_Visible ;
   private int edtavGrid_nmrcopia_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private int GX_I ;
   private long GRID_nFirstRecordOnPage ;
   private long AV19AlbProCodfrom ;
   private long AV20AlbProCodto ;
   private long AV65i ;
   private long AV73AlbProCodToFind ;
   private long AV38GridCurrentPage ;
   private long AV39GridPageCount ;
   private long A30AlbProCod ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private long AV72AlbProCodColItem ;
   private String Gridpaginationbar_Selectedpage ;
   private String Combo_clicodto_Selectedvalue_get ;
   private String Combo_clicodfrom_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_124_idx="0001" ;
   private String AV18PRIO ;
   private String AV15ManAut ;
   private String AV44EmprCod ;
   private String AV125Pgmname ;
   private String AV17PATHPDF ;
   private String AV69EmprCodToFind ;
   private String AV85BarCodParToFind ;
   private String AV110CliNom ;
   private String AV108Usumail ;
   private String AV45EmprNom ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV109CliMailGr ;
   private String A39AlbProPri ;
   private String Combo_clicodfrom_Cls ;
   private String Combo_clicodfrom_Selectedvalue_set ;
   private String Combo_clicodfrom_Emptyitemtext ;
   private String Combo_clicodto_Cls ;
   private String Combo_clicodto_Selectedvalue_set ;
   private String Combo_clicodto_Emptyitemtext ;
   private String Dvpanel_panel_filtrosgenerales_Width ;
   private String Dvpanel_panel_filtrosgenerales_Cls ;
   private String Dvpanel_panel_filtrosgenerales_Title ;
   private String Dvpanel_panel_filtrosgenerales_Iconposition ;
   private String Dvpanel_panel_filtros_Width ;
   private String Dvpanel_panel_filtros_Cls ;
   private String Dvpanel_panel_filtros_Title ;
   private String Dvpanel_panel_filtros_Iconposition ;
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
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Fixedcolumns ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divLayoutmaintable_Class ;
   private String divTablemain_Internalname ;
   private String divDivheader_Internalname ;
   private String Dvpanel_panel_filtros_Internalname ;
   private String divPanel_filtros_Internalname ;
   private String Dvpanel_panel_filtrosgenerales_Internalname ;
   private String divPanel_filtrosgenerales_Internalname ;
   private String divTable_filtrosgenerales_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable5_Internalname ;
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
   private String divUnnamedtable6_Internalname ;
   private String edtavAlbprofchfrom_Internalname ;
   private String TempTags ;
   private String edtavAlbprofchfrom_Jsonclick ;
   private String edtavAlbprofchto_Internalname ;
   private String edtavAlbprofchto_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtavAlbprocodfrom_Internalname ;
   private String edtavAlbprocodfrom_Jsonclick ;
   private String edtavAlbprocodto_Internalname ;
   private String edtavAlbprocodto_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String divTable_acciones_Internalname ;
   private String Barradeprogreso_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtn_search_Internalname ;
   private String bttBtn_search_Jsonclick ;
   private String divTableoptions_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableaction_Internalname ;
   private String edtavPathpdf_Internalname ;
   private String edtavPathpdf_Jsonclick ;
   private String edtavInfo_Internalname ;
   private String edtavInfo_Jsonclick ;
   private String bttBtnprocessar_Internalname ;
   private String bttBtnprocessar_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavClicodfrom_Internalname ;
   private String edtavClicodfrom_Jsonclick ;
   private String edtavClicodto_Internalname ;
   private String edtavClicodto_Jsonclick ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String edtAlbProCod_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String edtGuiRemCli_Internalname ;
   private String A1244GuiRemCln ;
   private String edtGuiRemCln_Internalname ;
   private String A1902CliValA ;
   private String A11622CliMailGrE ;
   private String A11620CliMailGr ;
   private String edtCliMailGr_Internalname ;
   private String A11623CliMailPkE ;
   private String A11621CliMailPk ;
   private String edtCliMailPk_Internalname ;
   private String edtAlbProfch_Internalname ;
   private String A5291BarTipCor ;
   private String edtCod_pais_Internalname ;
   private String edtAlbProEst_Internalname ;
   private String edtavIcon_Internalname ;
   private String edtavGrid_pathpdf_Internalname ;
   private String edtavGrid_nmrcopia_Internalname ;
   private String scmdbuf ;
   private String A1253EmprGuiRem ;
   private String hsh ;
   private String AV43Station ;
   private String GXv_char2[] ;
   private String AV46UsurCod ;
   private String GXt_char1 ;
   private String A850UsurCod ;
   private String A10513UsuMail ;
   private String edtavIcon_gximage ;
   private String edtavIcon_Tooltiptext ;
   private String sGXsfl_124_fel_idx="0001" ;
   private String AV68EmprCodColItem ;
   private String AV84BarCodParColItem ;
   private String A10045CliAct ;
   private String A279CliNom ;
   private String AV114CLIMAILPK ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtEmprCod_Jsonclick ;
   private String edtAlbProCod_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtGuiRemCli_Jsonclick ;
   private String edtGuiRemCln_Jsonclick ;
   private String edtCliMailGr_Jsonclick ;
   private String edtCliMailPk_Jsonclick ;
   private String edtAlbProfch_Jsonclick ;
   private String edtCod_pais_Jsonclick ;
   private String edtAlbProEst_Jsonclick ;
   private String sImgUrl ;
   private String edtavIcon_Jsonclick ;
   private String edtavGrid_pathpdf_Jsonclick ;
   private String edtavGrid_nmrcopia_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV21AlbProfchfrom ;
   private java.util.Date AV22AlbProfchto ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date Gx_date ;
   private java.util.Date AV92IniDate ;
   private java.util.Date AV93EndDate ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV91LoadGridData ;
   private boolean AV16VerMail ;
   private boolean AV86SelectAll ;
   private boolean AV116MostrarMail ;
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
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean AV62Selected ;
   private boolean n10301Cod_pais ;
   private boolean bGXsfl_124_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV87Icon_IsBlob ;
   private String AV67EmprCodJson ;
   private String AV71AlbProCodJson ;
   private String AV75BarCodJson ;
   private String AV79BarCodReoJson ;
   private String AV83BarCodParJson ;
   private String AV105TextoSeparador ;
   private String AV119Asunto ;
   private String AV112TextoCorreo ;
   private String AV128Icon_GXI ;
   private String AV102PathXLS_Email ;
   private String AV101PathPDF_Email ;
   private String AV115Info ;
   private String AV98Grid_PathPdf ;
   private String AV47Copia[] ;
   private String A13735CliCNom ;
   private String AV106CadenaRegistrar ;
   private String AV87Icon ;
   private GXSimpleCollection<Byte> AV78BarCodReoCol ;
   private GXSimpleCollection<Integer> AV74BarCodCol ;
   private GXSimpleCollection<Long> AV70AlbProCodCol ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV25Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicodfrom ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicodto ;
   private com.genexus.webpanels.GXUserControl ucBarradeprogreso ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavPrio ;
   private HTMLChoice cmbavManaut ;
   private ICheckbox chkavVermail ;
   private HTMLChoice cmbavCopias2 ;
   private ICheckbox chkavSelected ;
   private ICheckbox chkCliValA ;
   private ICheckbox chkCliMailGrE ;
   private ICheckbox chkCliMailPkE ;
   private ICheckbox chkBarTipCor ;
   private ICheckbox chkavSelectall ;
   private IDataStoreProvider pr_default ;
   private int[] H02972_A252CliCod ;
   private boolean[] H02972_n252CliCod ;
   private String[] H02972_A1253EmprGuiRem ;
   private String[] H02972_A39AlbProPri ;
   private byte[] H02972_A33AlbProEst ;
   private short[] H02972_A10301Cod_pais ;
   private boolean[] H02972_n10301Cod_pais ;
   private String[] H02972_A5291BarTipCor ;
   private java.util.Date[] H02972_A34AlbProfch ;
   private String[] H02972_A11621CliMailPk ;
   private String[] H02972_A11623CliMailPkE ;
   private String[] H02972_A11620CliMailGr ;
   private String[] H02972_A11622CliMailGrE ;
   private String[] H02972_A1902CliValA ;
   private String[] H02972_A1244GuiRemCln ;
   private int[] H02972_A1243GuiRemCli ;
   private String[] H02972_A130BarCodPar ;
   private byte[] H02972_A132BarCodReo ;
   private int[] H02972_A129BarCod ;
   private long[] H02972_A30AlbProCod ;
   private String[] H02972_A396EmprCod ;
   private long[] H02973_AGRID_nRecordCount ;
   private String[] H02974_A850UsurCod ;
   private String[] H02974_A10513UsuMail ;
   private int[] H02975_A252CliCod ;
   private boolean[] H02975_n252CliCod ;
   private String[] H02975_A1253EmprGuiRem ;
   private String[] H02975_A130BarCodPar ;
   private byte[] H02975_A132BarCodReo ;
   private int[] H02975_A129BarCod ;
   private long[] H02975_A30AlbProCod ;
   private String[] H02975_A396EmprCod ;
   private int[] H02975_A1243GuiRemCli ;
   private String[] H02975_A1244GuiRemCln ;
   private String[] H02975_A1902CliValA ;
   private String[] H02975_A11622CliMailGrE ;
   private String[] H02975_A11620CliMailGr ;
   private String[] H02975_A11623CliMailPkE ;
   private String[] H02975_A11621CliMailPk ;
   private java.util.Date[] H02975_A34AlbProfch ;
   private String[] H02975_A5291BarTipCor ;
   private short[] H02975_A10301Cod_pais ;
   private boolean[] H02975_n10301Cod_pais ;
   private byte[] H02975_A33AlbProEst ;
   private byte[] H02976_A33AlbProEst ;
   private int[] H02976_A1243GuiRemCli ;
   private java.util.Date[] H02976_A34AlbProfch ;
   private long[] H02976_A30AlbProCod ;
   private String[] H02976_A39AlbProPri ;
   private String[] H02976_A396EmprCod ;
   private int[] H02976_A129BarCod ;
   private byte[] H02976_A132BarCodReo ;
   private String[] H02976_A130BarCodPar ;
   private String[] H02977_A10045CliAct ;
   private String[] H02977_A396EmprCod ;
   private String[] H02977_A13735CliCNom ;
   private int[] H02977_A252CliCod ;
   private boolean[] H02977_n252CliCod ;
   private String[] H02977_A279CliNom ;
   private String[] H02978_A10045CliAct ;
   private String[] H02978_A396EmprCod ;
   private String[] H02978_A13735CliCNom ;
   private int[] H02978_A252CliCod ;
   private boolean[] H02978_n252CliCod ;
   private String[] H02978_A279CliNom ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV66EmprCodCol ;
   private GXSimpleCollection<String> AV82BarCodParCol ;
   private GXSimpleCollection<String> AV107ListaCorreosDestino ;
   private GXSimpleCollection<String> AV113ListaCorreosCopia ;
   private GXSimpleCollection<String> AV111ListaCorreosCopiaOculta ;
   private GXSimpleCollection<String> AV104NombresAdjuntos ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV40CliCodfrom_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV42CliCodto_Data ;
   private GXBaseCollection<app.SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem> AV63SelectedRows ;
   private GXBaseCollection<app.SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem> AV117ImpresionGuiawwSDT ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext8[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV41Combo_DataItem ;
   private app.SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem AV64SelectedRow ;
   private app.SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem AV118ImpresionGuiawwSDTItem ;
}

final  class impresionguiaww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H02972( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          boolean AV91LoadGridData ,
                                          long AV19AlbProCodfrom ,
                                          String AV15ManAut ,
                                          long AV20AlbProCodto ,
                                          java.util.Date AV21AlbProfchfrom ,
                                          java.util.Date AV22AlbProfchto ,
                                          int AV23CliCodfrom ,
                                          int AV24CliCodto ,
                                          String A396EmprCod ,
                                          long A30AlbProCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          java.util.Date A34AlbProfch ,
                                          int A1243GuiRemCli ,
                                          byte A33AlbProEst ,
                                          String A39AlbProPri ,
                                          String AV18PRIO ,
                                          String AV44EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[13];
      Object[] GXv_Object10 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T2.CliCod, T3.EmprGuiRem AS EmprGuiRem, T3.AlbProPri, T3.AlbProEst, T5.Cod_pais, T2.BarTipCor, T3.AlbProfch, T5.CliMailPk, T5.CliMailPkE, T5.CliMailGr, T5.CliMailGrE," ;
      sSelectString += " T5.CliValA, T4.CliNom AS GuiRemCln, T3.GuiRemCli AS GuiRemCli, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.AlbProCod, T1.EmprCod" ;
      sFromString = " FROM ((((TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      sFromString += " LEFT JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T2.CliCod) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbProCod = T1.AlbProCod)" ;
      sFromString += " INNER JOIN TXPCLIENT T4 ON T4.EmprCod = T3.EmprGuiRem AND T4.CliCod = T3.GuiRemCli)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T3.AlbProPri = ?)");
      if ( ! AV91LoadGridData )
      {
         addWhere(sWhereString, "(T1.EmprCod IS NULL and Not T1.EmprCod IS NULL and T1.AlbProCod IS NULL and T1.BarCod IS NULL and T1.BarCodReo IS NULL and T1.BarCodPar IS NULL)");
      }
      if ( ! (0==AV19AlbProCodfrom) && ( GXutil.strcmp(AV15ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int9[2] = (byte)(1) ;
      }
      if ( ! (0==AV20AlbProCodto) && ( GXutil.strcmp(AV15ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int9[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV21AlbProfchfrom)) && ( GXutil.strcmp(AV15ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T3.AlbProfch >= ?)");
      }
      else
      {
         GXv_int9[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV22AlbProfchto)) && ( GXutil.strcmp(AV15ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T3.AlbProfch <= ?)");
      }
      else
      {
         GXv_int9[5] = (byte)(1) ;
      }
      if ( ! (0==AV23CliCodfrom) && ( GXutil.strcmp(AV15ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T3.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int9[6] = (byte)(1) ;
      }
      if ( ! (0==AV24CliCodto) && ( GXutil.strcmp(AV15ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T3.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int9[7] = (byte)(1) ;
      }
      if ( GXutil.strcmp(AV15ManAut, "A") == 0 )
      {
         addWhere(sWhereString, "(T3.AlbProEst = 0)");
      }
      sOrderString += " ORDER BY T1.EmprCod" ;
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object10[0] = scmdbuf ;
      GXv_Object10[1] = GXv_int9 ;
      return GXv_Object10 ;
   }

   protected Object[] conditional_H02973( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          boolean AV91LoadGridData ,
                                          long AV19AlbProCodfrom ,
                                          String AV15ManAut ,
                                          long AV20AlbProCodto ,
                                          java.util.Date AV21AlbProfchfrom ,
                                          java.util.Date AV22AlbProfchto ,
                                          int AV23CliCodfrom ,
                                          int AV24CliCodto ,
                                          String A396EmprCod ,
                                          long A30AlbProCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          java.util.Date A34AlbProfch ,
                                          int A1243GuiRemCli ,
                                          byte A33AlbProEst ,
                                          String A39AlbProPri ,
                                          String AV18PRIO ,
                                          String AV44EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[8];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM ((((TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T2.CliCod) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbProCod" ;
      scmdbuf += " = T1.AlbProCod) INNER JOIN TXPCLIENT T5 ON T5.EmprCod = T3.EmprGuiRem AND T5.CliCod = T3.GuiRemCli)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T3.AlbProPri = ?)");
      if ( ! AV91LoadGridData )
      {
         addWhere(sWhereString, "(T1.EmprCod IS NULL and Not T1.EmprCod IS NULL and T1.AlbProCod IS NULL and T1.BarCod IS NULL and T1.BarCodReo IS NULL and T1.BarCodPar IS NULL)");
      }
      if ( ! (0==AV19AlbProCodfrom) && ( GXutil.strcmp(AV15ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int11[2] = (byte)(1) ;
      }
      if ( ! (0==AV20AlbProCodto) && ( GXutil.strcmp(AV15ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int11[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV21AlbProfchfrom)) && ( GXutil.strcmp(AV15ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T3.AlbProfch >= ?)");
      }
      else
      {
         GXv_int11[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV22AlbProfchto)) && ( GXutil.strcmp(AV15ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T3.AlbProfch <= ?)");
      }
      else
      {
         GXv_int11[5] = (byte)(1) ;
      }
      if ( ! (0==AV23CliCodfrom) && ( GXutil.strcmp(AV15ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T3.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int11[6] = (byte)(1) ;
      }
      if ( ! (0==AV24CliCodto) && ( GXutil.strcmp(AV15ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T3.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int11[7] = (byte)(1) ;
      }
      if ( GXutil.strcmp(AV15ManAut, "A") == 0 )
      {
         addWhere(sWhereString, "(T3.AlbProEst = 0)");
      }
      scmdbuf += sWhereString ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_H02976( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          long AV19AlbProCodfrom ,
                                          String AV15ManAut ,
                                          long AV20AlbProCodto ,
                                          java.util.Date AV21AlbProfchfrom ,
                                          java.util.Date AV22AlbProfchto ,
                                          int AV23CliCodfrom ,
                                          int AV24CliCodto ,
                                          long A30AlbProCod ,
                                          java.util.Date A34AlbProfch ,
                                          int A1243GuiRemCli ,
                                          byte A33AlbProEst ,
                                          String A39AlbProPri ,
                                          String AV18PRIO ,
                                          String AV44EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int13 = new byte[8];
      Object[] GXv_Object14 = new Object[2];
      scmdbuf = "SELECT T2.AlbProEst, T2.GuiRemCli AS GuiRemCli, T2.AlbProfch, T1.AlbProCod, T2.AlbProPri, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar FROM (TXPALBBAR T1 INNER" ;
      scmdbuf += " JOIN TXPCALPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T2.AlbProPri = ?)");
      if ( ! (0==AV19AlbProCodfrom) && ( GXutil.strcmp(AV15ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int13[2] = (byte)(1) ;
      }
      if ( ! (0==AV20AlbProCodto) && ( GXutil.strcmp(AV15ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int13[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV21AlbProfchfrom)) && ( GXutil.strcmp(AV15ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T2.AlbProfch >= ?)");
      }
      else
      {
         GXv_int13[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV22AlbProfchto)) && ( GXutil.strcmp(AV15ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T2.AlbProfch <= ?)");
      }
      else
      {
         GXv_int13[5] = (byte)(1) ;
      }
      if ( ! (0==AV23CliCodfrom) && ( GXutil.strcmp(AV15ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T2.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int13[6] = (byte)(1) ;
      }
      if ( ! (0==AV24CliCodto) && ( GXutil.strcmp(AV15ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T2.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int13[7] = (byte)(1) ;
      }
      if ( GXutil.strcmp(AV15ManAut, "A") == 0 )
      {
         addWhere(sWhereString, "(T2.AlbProEst = 0)");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object14[0] = scmdbuf ;
      GXv_Object14[1] = GXv_int13 ;
      return GXv_Object14 ;
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
                  return conditional_H02972(context, remoteHandle, httpContext, ((Boolean) dynConstraints[0]).booleanValue() , ((Number) dynConstraints[1]).longValue() , (String)dynConstraints[2] , ((Number) dynConstraints[3]).longValue() , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , ((Number) dynConstraints[9]).longValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] );
            case 1 :
                  return conditional_H02973(context, remoteHandle, httpContext, ((Boolean) dynConstraints[0]).booleanValue() , ((Number) dynConstraints[1]).longValue() , (String)dynConstraints[2] , ((Number) dynConstraints[3]).longValue() , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , ((Number) dynConstraints[9]).longValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] );
            case 4 :
                  return conditional_H02976(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).longValue() , (String)dynConstraints[1] , ((Number) dynConstraints[2]).longValue() , (java.util.Date)dynConstraints[3] , (java.util.Date)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).longValue() , (java.util.Date)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02972", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02973", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02974", "SELECT UsurCod, UsuMail FROM TXPUSUARI WHERE UsurCod = ? ORDER BY UsurCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H02975", "SELECT T2.CliCod, T3.EmprGuiRem AS EmprGuiRem, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.AlbProCod, T1.EmprCod, T3.GuiRemCli AS GuiRemCli, T4.CliNom AS GuiRemCln, T5.CliValA, T5.CliMailGrE, T5.CliMailGr, T5.CliMailPkE, T5.CliMailPk, T3.AlbProfch, T2.BarTipCor, T5.Cod_pais, T3.AlbProEst FROM ((((TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T2.CliCod) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbProCod = T1.AlbProCod) INNER JOIN TXPCLIENT T4 ON T4.EmprCod = T3.EmprGuiRem AND T4.CliCod = T3.GuiRemCli) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H02976", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02977", "SELECT CliAct, EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, CliCod, CliNom FROM TXPCLIENT WHERE CliAct = 'S' ORDER BY CliCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02978", "SELECT CliAct, EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, CliCod, CliNom FROM TXPCLIENT WHERE CliAct = 'S' ORDER BY CliCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 2);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 100);
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((String[]) buf[11])[0] = rslt.getString(10, 100);
               ((String[]) buf[12])[0] = rslt.getString(11, 1);
               ((String[]) buf[13])[0] = rslt.getString(12, 1);
               ((String[]) buf[14])[0] = rslt.getString(13, 30);
               ((int[]) buf[15])[0] = rslt.getInt(14);
               ((String[]) buf[16])[0] = rslt.getString(15, 1);
               ((byte[]) buf[17])[0] = rslt.getByte(16);
               ((int[]) buf[18])[0] = rslt.getInt(17);
               ((long[]) buf[19])[0] = rslt.getLong(18);
               ((String[]) buf[20])[0] = rslt.getString(19, 3);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((long[]) buf[6])[0] = rslt.getLong(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((String[]) buf[12])[0] = rslt.getString(12, 100);
               ((String[]) buf[13])[0] = rslt.getString(13, 1);
               ((String[]) buf[14])[0] = rslt.getString(14, 100);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 2);
               ((short[]) buf[17])[0] = rslt.getShort(17);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(18);
               return;
            case 4 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
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
                  stmt.setString(sIdx, (String)parms[13], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[15]).longValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[16]).longValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[17]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[18]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[10]).longValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[11]).longValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[12]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[10]).longValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[11]).longValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[12]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               return;
      }
   }

}

