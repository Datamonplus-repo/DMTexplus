package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class documentotransporteproveedor_1ww_impl extends GXDataArea
{
   public documentotransporteproveedor_1ww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public documentotransporteproveedor_1ww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentotransporteproveedor_1ww_impl.class ));
   }

   public documentotransporteproveedor_1ww_impl( int remoteHandle ,
                                                 ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavAlbproanul = new HTMLChoice();
      cmbavGridactions = new HTMLChoice();
      cmbAlbProSta = new HTMLChoice();
      cmbAlbProAnul = new HTMLChoice();
      cmbAlbProStAT = new HTMLChoice();
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
      nRC_GXsfl_52 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_52"))) ;
      nGXsfl_52_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_52_idx"))) ;
      sGXsfl_52_idx = httpContext.GetPar( "sGXsfl_52_idx") ;
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
      AV81AlbProID = (int)(GXutil.lval( httpContext.GetPar( "AlbProID"))) ;
      cmbavAlbproanul.fromJSonString( httpContext.GetNextPar( ));
      AV82AlbProAnul = httpContext.GetPar( "AlbProAnul") ;
      AV83AlbProPrvID = (int)(GXutil.lval( httpContext.GetPar( "AlbProPrvID"))) ;
      AV84AlbProDatefrom = localUtil.parseDateParm( httpContext.GetPar( "AlbProDatefrom")) ;
      AV85AlbProDateto = localUtil.parseDateParm( httpContext.GetPar( "AlbProDateto")) ;
      AV47Emprcod = httpContext.GetPar( "Emprcod") ;
      Gx_date = localUtil.parseDateParm( httpContext.GetPar( "Gx_date")) ;
      AV90TFAlbProPrvNom = httpContext.GetPar( "TFAlbProPrvNom") ;
      AV91TFAlbProPrvNom_Sel = httpContext.GetPar( "TFAlbProPrvNom_Sel") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV80TFAlbProSta_Sels);
      AV69TFAlbProSal = localUtil.parseDTimeParm( httpContext.GetPar( "TFAlbProSal")) ;
      AV36TFAlbProIDAT = httpContext.GetPar( "TFAlbProIDAT") ;
      AV37TFAlbProIDAT_Sel = httpContext.GetPar( "TFAlbProIDAT_Sel") ;
      AV48TFAlbProATCUD = httpContext.GetPar( "TFAlbProATCUD") ;
      AV49TFAlbProATCUD_Sel = httpContext.GetPar( "TFAlbProATCUD_Sel") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV72TFAlbProStAT_Sels);
      AV32TFAlbProSys = localUtil.parseDTimeParm( httpContext.GetPar( "TFAlbProSys")) ;
      AV33TFAlbProSys_To = localUtil.parseDTimeParm( httpContext.GetPar( "TFAlbProSys_To")) ;
      AV75TFAlbProFm4dig = httpContext.GetPar( "TFAlbProFm4dig") ;
      AV76TFAlbProFm4dig_Sel = httpContext.GetPar( "TFAlbProFm4dig_Sel") ;
      AV94Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV50Cadena = httpContext.GetPar( "Cadena") ;
      AV52Hash = httpContext.GetPar( "Hash") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV81AlbProID, AV82AlbProAnul, AV83AlbProPrvID, AV84AlbProDatefrom, AV85AlbProDateto, AV47Emprcod, Gx_date, AV90TFAlbProPrvNom, AV91TFAlbProPrvNom_Sel, AV80TFAlbProSta_Sels, AV69TFAlbProSal, AV36TFAlbProIDAT, AV37TFAlbProIDAT_Sel, AV48TFAlbProATCUD, AV49TFAlbProATCUD_Sel, AV72TFAlbProStAT_Sels, AV32TFAlbProSys, AV33TFAlbProSys_To, AV75TFAlbProFm4dig, AV76TFAlbProFm4dig_Sel, AV94Pgmname, AV12OrderedBy, AV13OrderedDsc, AV50Cadena, AV52Hash) ;
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
      pa1WM2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1WM2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.stocksquimicos.documentotransporteproveedor_1ww", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV47Emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTODAY", getSecureSignedToken( "", Gx_date));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCADENA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV50Cadena, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHASH", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV52Hash, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"DocumentoTransporteProveedor_1WW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV94Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("stocksquimicos\\documentotransporteproveedor_1ww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vALBPROID", GXutil.ltrim( localUtil.ntoc( AV81AlbProID, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vALBPROANUL", GXutil.rtrim( AV82AlbProAnul));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vALBPROPRVID", GXutil.ltrim( localUtil.ntoc( AV83AlbProPrvID, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vALBPRODATEFROM", localUtil.format(AV84AlbProDatefrom, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vALBPRODATETO", localUtil.format(AV85AlbProDateto, "99/99/99"));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_52", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_52, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV42GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV43GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV40DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV40DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV47Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV47Emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTODAY", localUtil.dtoc( Gx_date, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTODAY", getSecureSignedToken( "", Gx_date));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROPRVNOM", GXutil.rtrim( AV90TFAlbProPrvNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROPRVNOM_SEL", GXutil.rtrim( AV91TFAlbProPrvNom_Sel));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFALBPROSTA_SELS", AV80TFAlbProSta_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFALBPROSTA_SELS", AV80TFAlbProSta_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROSAL", localUtil.ttoc( AV69TFAlbProSal, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROIDAT", GXutil.rtrim( AV36TFAlbProIDAT));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROIDAT_SEL", GXutil.rtrim( AV37TFAlbProIDAT_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROATCUD", GXutil.rtrim( AV48TFAlbProATCUD));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROATCUD_SEL", GXutil.rtrim( AV49TFAlbProATCUD_Sel));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFALBPROSTAT_SELS", AV72TFAlbProStAT_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFALBPROSTAT_SELS", AV72TFAlbProStAT_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROSYS", localUtil.ttoc( AV32TFAlbProSys, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROSYS_TO", localUtil.ttoc( AV33TFAlbProSys_To, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROFM4DIG", GXutil.rtrim( AV75TFAlbProFm4dig));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROFM4DIG_SEL", GXutil.rtrim( AV76TFAlbProFm4dig_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vCADENA", AV50Cadena);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCADENA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV50Cadena, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vHASH", AV52Hash);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHASH", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV52Hash, ""))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFILTERDOCUMENTOTRANSPORTEPROVEEDOR_1", AV88FilterDocumentoTransporteProveedor_1);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFILTERDOCUMENTOTRANSPORTEPROVEEDOR_1", AV88FilterDocumentoTransporteProveedor_1);
      }
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Allowmultipleselection", GXutil.rtrim( Ddo_grid_Allowmultipleselection));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistfixedvalues", GXutil.rtrim( Ddo_grid_Datalistfixedvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Grid_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Grid_titlescategories_Gridtitlescategories));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hascategories", GXutil.booltostr( Grid_empowerer_Hascategories));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
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
         we1WM2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1WM2( ) ;
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
      return formatLink("app.stocksquimicos.documentotransporteproveedor_1ww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "StocksQuimicos.DocumentoTransporteProveedor_1WW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Documento Transporte Proveedor", "") ;
   }

   public void wb1WM0( )
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
         app.GxWebStd.gx_div_start( httpContext, divTableactions_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 52, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\DocumentoTransporteProveedor_1WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbproid_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbproid_Internalname, httpContext.getMessage( "Nº Guia", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'" + sGXsfl_52_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbproid_Internalname, GXutil.ltrim( localUtil.ntoc( AV81AlbProID, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbproid_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV81AlbProID), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV81AlbProID), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,23);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbproid_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbproid_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_1WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavAlbproanul.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavAlbproanul.getInternalname(), httpContext.getMessage( "Tipo", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'" + sGXsfl_52_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavAlbproanul, cmbavAlbproanul.getInternalname(), GXutil.rtrim( AV82AlbProAnul), 1, cmbavAlbproanul.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavAlbproanul.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,27);\"", "", true, (byte)(0), "HLP_StocksQuimicos\\DocumentoTransporteProveedor_1WW.htm");
         cmbavAlbproanul.setValue( GXutil.rtrim( AV82AlbProAnul) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlbproanul.getInternalname(), "Values", cmbavAlbproanul.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbproprvid_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbproprvid_Internalname, httpContext.getMessage( "Proveedor", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'" + sGXsfl_52_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbproprvid_Internalname, GXutil.ltrim( localUtil.ntoc( AV83AlbProPrvID, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbproprvid_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV83AlbProPrvID), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV83AlbProPrvID), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbproprvid_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbproprvid_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_1WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprodatefrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprodatefrom_Internalname, httpContext.getMessage( "Data Inicial", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'" + sGXsfl_52_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavAlbprodatefrom_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprodatefrom_Internalname, localUtil.format(AV84AlbProDatefrom, "99/99/99"), localUtil.format( AV84AlbProDatefrom, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprodatefrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprodatefrom_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_1WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavAlbprodatefrom_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavAlbprodatefrom_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_1WW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprodateto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprodateto_Internalname, httpContext.getMessage( "Data Final", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'" + sGXsfl_52_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavAlbprodateto_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprodateto_Internalname, localUtil.format(AV85AlbProDateto, "99/99/99"), localUtil.format( AV85AlbProDateto, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprodateto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprodateto_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_1WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavAlbprodateto_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavAlbprodateto_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_1WW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table1_41_1WM2( true) ;
      }
      else
      {
         wb_table1_41_1WM2( false) ;
      }
      return  ;
   }

   public void wb_table1_41_1WM2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         startgridcontrol52( ) ;
      }
      if ( wbEnd == 52 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_52 = (int)(nGXsfl_52_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV42GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV43GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV94Pgmname), GXutil.rtrim( localUtil.format( AV94Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_1WW.htm");
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
         ucDdo_grid.setProperty("AllowMultipleSelection", Ddo_grid_Allowmultipleselection);
         ucDdo_grid.setProperty("DataListFixedValues", Ddo_grid_Datalistfixedvalues);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV40DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucGrid_titlescategories.setProperty("GridTitlesCategories", Grid_titlescategories_Gridtitlescategories);
         ucGrid_titlescategories.render(context, "dvelop.gridtitlescategories", Grid_titlescategories_Internalname, "GRID_TITLESCATEGORIESContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasCategories", Grid_empowerer_Hascategories);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_albprosalauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'" + sGXsfl_52_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_albprosalauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_albprosalauxdate_Internalname, localUtil.format(AV70DDO_AlbProSalAuxDate, "99/99/99"), localUtil.format( AV70DDO_AlbProSalAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,87);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_albprosalauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_1WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_albprosalauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_1WW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_albprosysauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'" + sGXsfl_52_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_albprosysauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_albprosysauxdate_Internalname, localUtil.format(AV34DDO_AlbProSysAuxDate, "99/99/99"), localUtil.format( AV34DDO_AlbProSysAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_albprosysauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_1WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_albprosysauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_1WW.htm");
         httpContext.writeTextNL( "</div>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'" + sGXsfl_52_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_albprosysauxdateto_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_albprosysauxdateto_Internalname, localUtil.format(AV35DDO_AlbProSysAuxDateTo, "99/99/99"), localUtil.format( AV35DDO_AlbProSysAuxDateTo, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,90);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_albprosysauxdateto_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_1WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_albprosysauxdateto_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_1WW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 52 )
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

   public void start1WM2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Documento Transporte Proveedor", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1WM0( ) ;
   }

   public void ws1WM2( )
   {
      start1WM2( ) ;
      evt1WM2( ) ;
   }

   public void evt1WM2( )
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
                           e111WM2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121WM2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131WM2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e141WM2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VALBPROPRVID.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e151WM2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VALBPROID.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e161WM2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VALBPRODATEFROM.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e171WM2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VALBPRODATETO.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e181WM2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VALBPROANUL.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e191WM2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) )
                        {
                           nGXsfl_52_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_522( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV44GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44GridActions), 4, 0));
                           A13418AlbProID = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbProID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A13419AlbProPrvI = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbProPrvI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A13420AlbProPrvN = httpContext.cgiGet( edtAlbProPrvN_Internalname) ;
                           n13420AlbProPrvN = false ;
                           cmbAlbProSta.setName( cmbAlbProSta.getInternalname() );
                           cmbAlbProSta.setValue( httpContext.cgiGet( cmbAlbProSta.getInternalname()) );
                           A13437AlbProSta = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbProSta.getInternalname()))) ;
                           cmbAlbProAnul.setName( cmbAlbProAnul.getInternalname() );
                           cmbAlbProAnul.setValue( httpContext.cgiGet( cmbAlbProAnul.getInternalname()) );
                           A13440AlbProAnul = httpContext.cgiGet( cmbAlbProAnul.getInternalname()) ;
                           A13430AlbProDate = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtAlbProDate_Internalname), 0)) ;
                           A13429AlbProSal = localUtil.ctot( httpContext.cgiGet( edtAlbProSal_Internalname), 0) ;
                           A13436AlbProIDAT = httpContext.cgiGet( edtAlbProIDAT_Internalname) ;
                           A14190AlbProATCU = httpContext.cgiGet( edtAlbProATCU_Internalname) ;
                           n14190AlbProATCU = false ;
                           cmbAlbProStAT.setName( cmbAlbProStAT.getInternalname() );
                           cmbAlbProStAT.setValue( httpContext.cgiGet( cmbAlbProStAT.getInternalname()) );
                           A13438AlbProStAT = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbProStAT.getInternalname()))) ;
                           A13431AlbProSys = localUtil.ctot( httpContext.cgiGet( edtAlbProSys_Internalname), 0) ;
                           A14376AlbProFm4d = httpContext.cgiGet( edtAlbProFm4d_Internalname) ;
                           A13435AlbProEnvA = httpContext.cgiGet( edtAlbProEnvA_Internalname) ;
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A13433AlbProHh = httpContext.cgiGet( edtAlbProHh_Internalname) ;
                           A13434AlbProHhCt = httpContext.cgiGet( edtAlbProHhCt_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e201WM2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e211WM2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e221WM2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e231WM2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Albproid Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vALBPROID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV81AlbProID )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Albproanul Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vALBPROANUL"), AV82AlbProAnul) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Albproprvid Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vALBPROPRVID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV83AlbProPrvID )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Albprodatefrom Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vALBPRODATEFROM"), 0), AV84AlbProDatefrom) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Albprodateto Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vALBPRODATETO"), 0), AV85AlbProDateto) ) )
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

   public void we1WM2( )
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

   public void pa1WM2( )
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
            GX_FocusControl = edtavAlbproid_Internalname ;
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
      subsflControlProps_522( ) ;
      while ( nGXsfl_52_idx <= nRC_GXsfl_52 )
      {
         sendrow_522( ) ;
         nGXsfl_52_idx = ((subGrid_Islastpage==1)&&(nGXsfl_52_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_52_idx+1) ;
         sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_522( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 int AV81AlbProID ,
                                 String AV82AlbProAnul ,
                                 int AV83AlbProPrvID ,
                                 java.util.Date AV84AlbProDatefrom ,
                                 java.util.Date AV85AlbProDateto ,
                                 String AV47Emprcod ,
                                 java.util.Date Gx_date ,
                                 String AV90TFAlbProPrvNom ,
                                 String AV91TFAlbProPrvNom_Sel ,
                                 GXSimpleCollection<Byte> AV80TFAlbProSta_Sels ,
                                 java.util.Date AV69TFAlbProSal ,
                                 String AV36TFAlbProIDAT ,
                                 String AV37TFAlbProIDAT_Sel ,
                                 String AV48TFAlbProATCUD ,
                                 String AV49TFAlbProATCUD_Sel ,
                                 GXSimpleCollection<Byte> AV72TFAlbProStAT_Sels ,
                                 java.util.Date AV32TFAlbProSys ,
                                 java.util.Date AV33TFAlbProSys_To ,
                                 String AV75TFAlbProFm4dig ,
                                 String AV76TFAlbProFm4dig_Sel ,
                                 String AV94Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 String AV50Cadena ,
                                 String AV52Hash )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e211WM2 ();
      GRID_nCurrentRecord = 0 ;
      rf1WM2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"DocumentoTransporteProveedor_1WW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV94Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("stocksquimicos\\documentotransporteproveedor_1ww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBPROANUL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A13440AlbProAnul, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROANUL", GXutil.rtrim( A13440AlbProAnul));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBPROSTAT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A13438AlbProStAT), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROSTAT", GXutil.ltrim( localUtil.ntoc( A13438AlbProStAT, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBPROIDAT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A13436AlbProIDAT, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROIDAT", GXutil.rtrim( A13436AlbProIDAT));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBPROSYS", getSecureSignedToken( "", localUtil.format( A13431AlbProSys, "99/99/99 99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROSYS", localUtil.ttoc( A13431AlbProSys, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBPROSAL", getSecureSignedToken( "", localUtil.format( A13429AlbProSal, "99/99/99 99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROSAL", localUtil.ttoc( A13429AlbProSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBPRODATE", getSecureSignedToken( "", A13430AlbProDate));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPRODATE", localUtil.format(A13430AlbProDate, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBPROPRVI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A13419AlbProPrvI), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROPRVI", GXutil.ltrim( localUtil.ntoc( A13419AlbProPrvI, (byte)(6), (byte)(0), ".", "")));
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
      if ( cmbavAlbproanul.getItemCount() > 0 )
      {
         AV82AlbProAnul = cmbavAlbproanul.getValidValue(AV82AlbProAnul) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV82AlbProAnul", AV82AlbProAnul);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavAlbproanul.setValue( GXutil.rtrim( AV82AlbProAnul) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlbproanul.getInternalname(), "Values", cmbavAlbproanul.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1WM2( ) ;
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
      AV94Pgmname = "StocksQuimicos.DocumentoTransporteProveedor_1WW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV94Pgmname", AV94Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1WM2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(52) ;
      /* Execute user event: Refresh */
      e211WM2 ();
      nGXsfl_52_idx = 1 ;
      sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_522( ) ;
      bGXsfl_52_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
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
         subsflControlProps_522( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Byte.valueOf(A13437AlbProSta) ,
                                              AV98Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels ,
                                              Byte.valueOf(A13438AlbProStAT) ,
                                              AV104Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels ,
                                              AV97Stocksquimicos_documentotransporteproveedor_1wwds_2_tfalbproprvnom_sel ,
                                              AV96Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom ,
                                              Integer.valueOf(AV98Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels.size()) ,
                                              AV99Stocksquimicos_documentotransporteproveedor_1wwds_4_tfalbprosal ,
                                              AV101Stocksquimicos_documentotransporteproveedor_1wwds_6_tfalbproidat_sel ,
                                              AV100Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat ,
                                              AV103Stocksquimicos_documentotransporteproveedor_1wwds_8_tfalbproatcud_sel ,
                                              AV102Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud ,
                                              Integer.valueOf(AV104Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels.size()) ,
                                              AV105Stocksquimicos_documentotransporteproveedor_1wwds_10_tfalbprosys ,
                                              AV106Stocksquimicos_documentotransporteproveedor_1wwds_11_tfalbprosys_to ,
                                              AV108Stocksquimicos_documentotransporteproveedor_1wwds_13_tfalbprofm4dig_sel ,
                                              AV107Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig ,
                                              Integer.valueOf(AV81AlbProID) ,
                                              Integer.valueOf(AV83AlbProPrvID) ,
                                              AV84AlbProDatefrom ,
                                              AV85AlbProDateto ,
                                              A13420AlbProPrvN ,
                                              A13429AlbProSal ,
                                              A13436AlbProIDAT ,
                                              A14190AlbProATCU ,
                                              A13431AlbProSys ,
                                              A13433AlbProHh ,
                                              Integer.valueOf(A13418AlbProID) ,
                                              Integer.valueOf(A13419AlbProPrvI) ,
                                              A13430AlbProDate ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              A13440AlbProAnul ,
                                              AV82AlbProAnul ,
                                              AV47Emprcod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING,
                                              TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                              TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV96Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom = GXutil.padr( GXutil.rtrim( AV96Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom), 30, "%") ;
         lV100Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat = GXutil.padr( GXutil.rtrim( AV100Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat), 20, "%") ;
         lV102Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud = GXutil.padr( GXutil.rtrim( AV102Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud), 20, "%") ;
         lV107Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig = GXutil.padr( GXutil.rtrim( AV107Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig), 4, "%") ;
         /* Using cursor H01WM2 */
         pr_default.execute(0, new Object[] {AV47Emprcod, AV82AlbProAnul, AV82AlbProAnul, lV96Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom, AV97Stocksquimicos_documentotransporteproveedor_1wwds_2_tfalbproprvnom_sel, AV99Stocksquimicos_documentotransporteproveedor_1wwds_4_tfalbprosal, lV100Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat, AV101Stocksquimicos_documentotransporteproveedor_1wwds_6_tfalbproidat_sel, lV102Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud, AV103Stocksquimicos_documentotransporteproveedor_1wwds_8_tfalbproatcud_sel, AV105Stocksquimicos_documentotransporteproveedor_1wwds_10_tfalbprosys, AV106Stocksquimicos_documentotransporteproveedor_1wwds_11_tfalbprosys_to, lV107Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig, AV108Stocksquimicos_documentotransporteproveedor_1wwds_13_tfalbprofm4dig_sel, Integer.valueOf(AV81AlbProID), Integer.valueOf(AV83AlbProPrvID), AV84AlbProDatefrom, AV85AlbProDateto, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_52_idx = 1 ;
         sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_522( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A13434AlbProHhCt = H01WM2_A13434AlbProHhCt[0] ;
            A396EmprCod = H01WM2_A396EmprCod[0] ;
            A13435AlbProEnvA = H01WM2_A13435AlbProEnvA[0] ;
            A13431AlbProSys = H01WM2_A13431AlbProSys[0] ;
            A13438AlbProStAT = H01WM2_A13438AlbProStAT[0] ;
            A14190AlbProATCU = H01WM2_A14190AlbProATCU[0] ;
            n14190AlbProATCU = H01WM2_n14190AlbProATCU[0] ;
            A13436AlbProIDAT = H01WM2_A13436AlbProIDAT[0] ;
            A13429AlbProSal = H01WM2_A13429AlbProSal[0] ;
            A13430AlbProDate = H01WM2_A13430AlbProDate[0] ;
            A13440AlbProAnul = H01WM2_A13440AlbProAnul[0] ;
            A13437AlbProSta = H01WM2_A13437AlbProSta[0] ;
            A13420AlbProPrvN = H01WM2_A13420AlbProPrvN[0] ;
            n13420AlbProPrvN = H01WM2_n13420AlbProPrvN[0] ;
            A13419AlbProPrvI = H01WM2_A13419AlbProPrvI[0] ;
            A13418AlbProID = H01WM2_A13418AlbProID[0] ;
            A13433AlbProHh = H01WM2_A13433AlbProHh[0] ;
            A13420AlbProPrvN = H01WM2_A13420AlbProPrvN[0] ;
            n13420AlbProPrvN = H01WM2_n13420AlbProPrvN[0] ;
            A14376AlbProFm4d = GXutil.substring( A13433AlbProHh, 1, 1) + GXutil.substring( A13433AlbProHh, 11, 1) + GXutil.substring( A13433AlbProHh, 21, 1) + GXutil.substring( A13433AlbProHh, 31, 1) ;
            e221WM2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(52) ;
         wb1WM0( ) ;
      }
      bGXsfl_52_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1WM2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV47Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV47Emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTODAY", localUtil.dtoc( Gx_date, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTODAY", getSecureSignedToken( "", Gx_date));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBPROANUL"+"_"+sGXsfl_52_idx, getSecureSignedToken( sGXsfl_52_idx, GXutil.rtrim( localUtil.format( A13440AlbProAnul, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBPROSTAT"+"_"+sGXsfl_52_idx, getSecureSignedToken( sGXsfl_52_idx, localUtil.format( DecimalUtil.doubleToDec(A13438AlbProStAT), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBPROIDAT"+"_"+sGXsfl_52_idx, getSecureSignedToken( sGXsfl_52_idx, GXutil.rtrim( localUtil.format( A13436AlbProIDAT, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBPROSYS"+"_"+sGXsfl_52_idx, getSecureSignedToken( sGXsfl_52_idx, localUtil.format( A13431AlbProSys, "99/99/99 99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBPROSAL"+"_"+sGXsfl_52_idx, getSecureSignedToken( sGXsfl_52_idx, localUtil.format( A13429AlbProSal, "99/99/99 99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBPRODATE"+"_"+sGXsfl_52_idx, getSecureSignedToken( sGXsfl_52_idx, A13430AlbProDate));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBPROPRVI"+"_"+sGXsfl_52_idx, getSecureSignedToken( sGXsfl_52_idx, localUtil.format( DecimalUtil.doubleToDec(A13419AlbProPrvI), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCADENA", AV50Cadena);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCADENA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV50Cadena, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vHASH", AV52Hash);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHASH", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV52Hash, ""))));
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
      AV96Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom = AV90TFAlbProPrvNom ;
      AV97Stocksquimicos_documentotransporteproveedor_1wwds_2_tfalbproprvnom_sel = AV91TFAlbProPrvNom_Sel ;
      AV98Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels = AV80TFAlbProSta_Sels ;
      AV99Stocksquimicos_documentotransporteproveedor_1wwds_4_tfalbprosal = AV69TFAlbProSal ;
      AV100Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat = AV36TFAlbProIDAT ;
      AV101Stocksquimicos_documentotransporteproveedor_1wwds_6_tfalbproidat_sel = AV37TFAlbProIDAT_Sel ;
      AV102Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud = AV48TFAlbProATCUD ;
      AV103Stocksquimicos_documentotransporteproveedor_1wwds_8_tfalbproatcud_sel = AV49TFAlbProATCUD_Sel ;
      AV104Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels = AV72TFAlbProStAT_Sels ;
      AV105Stocksquimicos_documentotransporteproveedor_1wwds_10_tfalbprosys = AV32TFAlbProSys ;
      AV106Stocksquimicos_documentotransporteproveedor_1wwds_11_tfalbprosys_to = AV33TFAlbProSys_To ;
      AV107Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig = AV75TFAlbProFm4dig ;
      AV108Stocksquimicos_documentotransporteproveedor_1wwds_13_tfalbprofm4dig_sel = AV76TFAlbProFm4dig_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(A13437AlbProSta) ,
                                           AV98Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels ,
                                           Byte.valueOf(A13438AlbProStAT) ,
                                           AV104Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels ,
                                           AV97Stocksquimicos_documentotransporteproveedor_1wwds_2_tfalbproprvnom_sel ,
                                           AV96Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom ,
                                           Integer.valueOf(AV98Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels.size()) ,
                                           AV99Stocksquimicos_documentotransporteproveedor_1wwds_4_tfalbprosal ,
                                           AV101Stocksquimicos_documentotransporteproveedor_1wwds_6_tfalbproidat_sel ,
                                           AV100Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat ,
                                           AV103Stocksquimicos_documentotransporteproveedor_1wwds_8_tfalbproatcud_sel ,
                                           AV102Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud ,
                                           Integer.valueOf(AV104Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels.size()) ,
                                           AV105Stocksquimicos_documentotransporteproveedor_1wwds_10_tfalbprosys ,
                                           AV106Stocksquimicos_documentotransporteproveedor_1wwds_11_tfalbprosys_to ,
                                           AV108Stocksquimicos_documentotransporteproveedor_1wwds_13_tfalbprofm4dig_sel ,
                                           AV107Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig ,
                                           Integer.valueOf(AV81AlbProID) ,
                                           Integer.valueOf(AV83AlbProPrvID) ,
                                           AV84AlbProDatefrom ,
                                           AV85AlbProDateto ,
                                           A13420AlbProPrvN ,
                                           A13429AlbProSal ,
                                           A13436AlbProIDAT ,
                                           A14190AlbProATCU ,
                                           A13431AlbProSys ,
                                           A13433AlbProHh ,
                                           Integer.valueOf(A13418AlbProID) ,
                                           Integer.valueOf(A13419AlbProPrvI) ,
                                           A13430AlbProDate ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           A13440AlbProAnul ,
                                           AV82AlbProAnul ,
                                           AV47Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV96Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom = GXutil.padr( GXutil.rtrim( AV96Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom), 30, "%") ;
      lV100Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat = GXutil.padr( GXutil.rtrim( AV100Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat), 20, "%") ;
      lV102Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud = GXutil.padr( GXutil.rtrim( AV102Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud), 20, "%") ;
      lV107Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig = GXutil.padr( GXutil.rtrim( AV107Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig), 4, "%") ;
      /* Using cursor H01WM3 */
      pr_default.execute(1, new Object[] {AV47Emprcod, AV82AlbProAnul, AV82AlbProAnul, lV96Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom, AV97Stocksquimicos_documentotransporteproveedor_1wwds_2_tfalbproprvnom_sel, AV99Stocksquimicos_documentotransporteproveedor_1wwds_4_tfalbprosal, lV100Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat, AV101Stocksquimicos_documentotransporteproveedor_1wwds_6_tfalbproidat_sel, lV102Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud, AV103Stocksquimicos_documentotransporteproveedor_1wwds_8_tfalbproatcud_sel, AV105Stocksquimicos_documentotransporteproveedor_1wwds_10_tfalbprosys, AV106Stocksquimicos_documentotransporteproveedor_1wwds_11_tfalbprosys_to, lV107Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig, AV108Stocksquimicos_documentotransporteproveedor_1wwds_13_tfalbprofm4dig_sel, Integer.valueOf(AV81AlbProID), Integer.valueOf(AV83AlbProPrvID), AV84AlbProDatefrom, AV85AlbProDateto});
      GRID_nRecordCount = H01WM3_AGRID_nRecordCount[0] ;
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
      AV96Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom = AV90TFAlbProPrvNom ;
      AV97Stocksquimicos_documentotransporteproveedor_1wwds_2_tfalbproprvnom_sel = AV91TFAlbProPrvNom_Sel ;
      AV98Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels = AV80TFAlbProSta_Sels ;
      AV99Stocksquimicos_documentotransporteproveedor_1wwds_4_tfalbprosal = AV69TFAlbProSal ;
      AV100Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat = AV36TFAlbProIDAT ;
      AV101Stocksquimicos_documentotransporteproveedor_1wwds_6_tfalbproidat_sel = AV37TFAlbProIDAT_Sel ;
      AV102Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud = AV48TFAlbProATCUD ;
      AV103Stocksquimicos_documentotransporteproveedor_1wwds_8_tfalbproatcud_sel = AV49TFAlbProATCUD_Sel ;
      AV104Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels = AV72TFAlbProStAT_Sels ;
      AV105Stocksquimicos_documentotransporteproveedor_1wwds_10_tfalbprosys = AV32TFAlbProSys ;
      AV106Stocksquimicos_documentotransporteproveedor_1wwds_11_tfalbprosys_to = AV33TFAlbProSys_To ;
      AV107Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig = AV75TFAlbProFm4dig ;
      AV108Stocksquimicos_documentotransporteproveedor_1wwds_13_tfalbprofm4dig_sel = AV76TFAlbProFm4dig_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV81AlbProID, AV82AlbProAnul, AV83AlbProPrvID, AV84AlbProDatefrom, AV85AlbProDateto, AV47Emprcod, Gx_date, AV90TFAlbProPrvNom, AV91TFAlbProPrvNom_Sel, AV80TFAlbProSta_Sels, AV69TFAlbProSal, AV36TFAlbProIDAT, AV37TFAlbProIDAT_Sel, AV48TFAlbProATCUD, AV49TFAlbProATCUD_Sel, AV72TFAlbProStAT_Sels, AV32TFAlbProSys, AV33TFAlbProSys_To, AV75TFAlbProFm4dig, AV76TFAlbProFm4dig_Sel, AV94Pgmname, AV12OrderedBy, AV13OrderedDsc, AV50Cadena, AV52Hash) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV96Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom = AV90TFAlbProPrvNom ;
      AV97Stocksquimicos_documentotransporteproveedor_1wwds_2_tfalbproprvnom_sel = AV91TFAlbProPrvNom_Sel ;
      AV98Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels = AV80TFAlbProSta_Sels ;
      AV99Stocksquimicos_documentotransporteproveedor_1wwds_4_tfalbprosal = AV69TFAlbProSal ;
      AV100Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat = AV36TFAlbProIDAT ;
      AV101Stocksquimicos_documentotransporteproveedor_1wwds_6_tfalbproidat_sel = AV37TFAlbProIDAT_Sel ;
      AV102Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud = AV48TFAlbProATCUD ;
      AV103Stocksquimicos_documentotransporteproveedor_1wwds_8_tfalbproatcud_sel = AV49TFAlbProATCUD_Sel ;
      AV104Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels = AV72TFAlbProStAT_Sels ;
      AV105Stocksquimicos_documentotransporteproveedor_1wwds_10_tfalbprosys = AV32TFAlbProSys ;
      AV106Stocksquimicos_documentotransporteproveedor_1wwds_11_tfalbprosys_to = AV33TFAlbProSys_To ;
      AV107Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig = AV75TFAlbProFm4dig ;
      AV108Stocksquimicos_documentotransporteproveedor_1wwds_13_tfalbprofm4dig_sel = AV76TFAlbProFm4dig_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV81AlbProID, AV82AlbProAnul, AV83AlbProPrvID, AV84AlbProDatefrom, AV85AlbProDateto, AV47Emprcod, Gx_date, AV90TFAlbProPrvNom, AV91TFAlbProPrvNom_Sel, AV80TFAlbProSta_Sels, AV69TFAlbProSal, AV36TFAlbProIDAT, AV37TFAlbProIDAT_Sel, AV48TFAlbProATCUD, AV49TFAlbProATCUD_Sel, AV72TFAlbProStAT_Sels, AV32TFAlbProSys, AV33TFAlbProSys_To, AV75TFAlbProFm4dig, AV76TFAlbProFm4dig_Sel, AV94Pgmname, AV12OrderedBy, AV13OrderedDsc, AV50Cadena, AV52Hash) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV96Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom = AV90TFAlbProPrvNom ;
      AV97Stocksquimicos_documentotransporteproveedor_1wwds_2_tfalbproprvnom_sel = AV91TFAlbProPrvNom_Sel ;
      AV98Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels = AV80TFAlbProSta_Sels ;
      AV99Stocksquimicos_documentotransporteproveedor_1wwds_4_tfalbprosal = AV69TFAlbProSal ;
      AV100Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat = AV36TFAlbProIDAT ;
      AV101Stocksquimicos_documentotransporteproveedor_1wwds_6_tfalbproidat_sel = AV37TFAlbProIDAT_Sel ;
      AV102Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud = AV48TFAlbProATCUD ;
      AV103Stocksquimicos_documentotransporteproveedor_1wwds_8_tfalbproatcud_sel = AV49TFAlbProATCUD_Sel ;
      AV104Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels = AV72TFAlbProStAT_Sels ;
      AV105Stocksquimicos_documentotransporteproveedor_1wwds_10_tfalbprosys = AV32TFAlbProSys ;
      AV106Stocksquimicos_documentotransporteproveedor_1wwds_11_tfalbprosys_to = AV33TFAlbProSys_To ;
      AV107Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig = AV75TFAlbProFm4dig ;
      AV108Stocksquimicos_documentotransporteproveedor_1wwds_13_tfalbprofm4dig_sel = AV76TFAlbProFm4dig_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV81AlbProID, AV82AlbProAnul, AV83AlbProPrvID, AV84AlbProDatefrom, AV85AlbProDateto, AV47Emprcod, Gx_date, AV90TFAlbProPrvNom, AV91TFAlbProPrvNom_Sel, AV80TFAlbProSta_Sels, AV69TFAlbProSal, AV36TFAlbProIDAT, AV37TFAlbProIDAT_Sel, AV48TFAlbProATCUD, AV49TFAlbProATCUD_Sel, AV72TFAlbProStAT_Sels, AV32TFAlbProSys, AV33TFAlbProSys_To, AV75TFAlbProFm4dig, AV76TFAlbProFm4dig_Sel, AV94Pgmname, AV12OrderedBy, AV13OrderedDsc, AV50Cadena, AV52Hash) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV96Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom = AV90TFAlbProPrvNom ;
      AV97Stocksquimicos_documentotransporteproveedor_1wwds_2_tfalbproprvnom_sel = AV91TFAlbProPrvNom_Sel ;
      AV98Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels = AV80TFAlbProSta_Sels ;
      AV99Stocksquimicos_documentotransporteproveedor_1wwds_4_tfalbprosal = AV69TFAlbProSal ;
      AV100Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat = AV36TFAlbProIDAT ;
      AV101Stocksquimicos_documentotransporteproveedor_1wwds_6_tfalbproidat_sel = AV37TFAlbProIDAT_Sel ;
      AV102Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud = AV48TFAlbProATCUD ;
      AV103Stocksquimicos_documentotransporteproveedor_1wwds_8_tfalbproatcud_sel = AV49TFAlbProATCUD_Sel ;
      AV104Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels = AV72TFAlbProStAT_Sels ;
      AV105Stocksquimicos_documentotransporteproveedor_1wwds_10_tfalbprosys = AV32TFAlbProSys ;
      AV106Stocksquimicos_documentotransporteproveedor_1wwds_11_tfalbprosys_to = AV33TFAlbProSys_To ;
      AV107Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig = AV75TFAlbProFm4dig ;
      AV108Stocksquimicos_documentotransporteproveedor_1wwds_13_tfalbprofm4dig_sel = AV76TFAlbProFm4dig_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV81AlbProID, AV82AlbProAnul, AV83AlbProPrvID, AV84AlbProDatefrom, AV85AlbProDateto, AV47Emprcod, Gx_date, AV90TFAlbProPrvNom, AV91TFAlbProPrvNom_Sel, AV80TFAlbProSta_Sels, AV69TFAlbProSal, AV36TFAlbProIDAT, AV37TFAlbProIDAT_Sel, AV48TFAlbProATCUD, AV49TFAlbProATCUD_Sel, AV72TFAlbProStAT_Sels, AV32TFAlbProSys, AV33TFAlbProSys_To, AV75TFAlbProFm4dig, AV76TFAlbProFm4dig_Sel, AV94Pgmname, AV12OrderedBy, AV13OrderedDsc, AV50Cadena, AV52Hash) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV96Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom = AV90TFAlbProPrvNom ;
      AV97Stocksquimicos_documentotransporteproveedor_1wwds_2_tfalbproprvnom_sel = AV91TFAlbProPrvNom_Sel ;
      AV98Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels = AV80TFAlbProSta_Sels ;
      AV99Stocksquimicos_documentotransporteproveedor_1wwds_4_tfalbprosal = AV69TFAlbProSal ;
      AV100Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat = AV36TFAlbProIDAT ;
      AV101Stocksquimicos_documentotransporteproveedor_1wwds_6_tfalbproidat_sel = AV37TFAlbProIDAT_Sel ;
      AV102Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud = AV48TFAlbProATCUD ;
      AV103Stocksquimicos_documentotransporteproveedor_1wwds_8_tfalbproatcud_sel = AV49TFAlbProATCUD_Sel ;
      AV104Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels = AV72TFAlbProStAT_Sels ;
      AV105Stocksquimicos_documentotransporteproveedor_1wwds_10_tfalbprosys = AV32TFAlbProSys ;
      AV106Stocksquimicos_documentotransporteproveedor_1wwds_11_tfalbprosys_to = AV33TFAlbProSys_To ;
      AV107Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig = AV75TFAlbProFm4dig ;
      AV108Stocksquimicos_documentotransporteproveedor_1wwds_13_tfalbprofm4dig_sel = AV76TFAlbProFm4dig_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV81AlbProID, AV82AlbProAnul, AV83AlbProPrvID, AV84AlbProDatefrom, AV85AlbProDateto, AV47Emprcod, Gx_date, AV90TFAlbProPrvNom, AV91TFAlbProPrvNom_Sel, AV80TFAlbProSta_Sels, AV69TFAlbProSal, AV36TFAlbProIDAT, AV37TFAlbProIDAT_Sel, AV48TFAlbProATCUD, AV49TFAlbProATCUD_Sel, AV72TFAlbProStAT_Sels, AV32TFAlbProSys, AV33TFAlbProSys_To, AV75TFAlbProFm4dig, AV76TFAlbProFm4dig_Sel, AV94Pgmname, AV12OrderedBy, AV13OrderedDsc, AV50Cadena, AV52Hash) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_date = GXutil.today( ) ;
      AV94Pgmname = "StocksQuimicos.DocumentoTransporteProveedor_1WW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV94Pgmname", AV94Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1WM0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e201WM2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV40DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_52 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_52"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV42GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV43GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         Ddo_grid_Allowmultipleselection = httpContext.cgiGet( "DDO_GRID_Allowmultipleselection") ;
         Ddo_grid_Datalistfixedvalues = httpContext.cgiGet( "DDO_GRID_Datalistfixedvalues") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( "DDO_GRID_Datalistproc") ;
         Grid_titlescategories_Gridinternalname = httpContext.cgiGet( "GRID_TITLESCATEGORIES_Gridinternalname") ;
         Grid_titlescategories_Gridtitlescategories = httpContext.cgiGet( "GRID_TITLESCATEGORIES_Gridtitlescategories") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hascategories = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hascategories")) ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Fixedcolumns = httpContext.cgiGet( "GRID_EMPOWERER_Fixedcolumns") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( "DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbproid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbproid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBPROID");
            GX_FocusControl = edtavAlbproid_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV81AlbProID = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV81AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81AlbProID), 8, 0));
         }
         else
         {
            AV81AlbProID = (int)(localUtil.ctol( httpContext.cgiGet( edtavAlbproid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV81AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81AlbProID), 8, 0));
         }
         cmbavAlbproanul.setName( cmbavAlbproanul.getInternalname() );
         cmbavAlbproanul.setValue( httpContext.cgiGet( cmbavAlbproanul.getInternalname()) );
         AV82AlbProAnul = httpContext.cgiGet( cmbavAlbproanul.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV82AlbProAnul", AV82AlbProAnul);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbproprvid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbproprvid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBPROPRVID");
            GX_FocusControl = edtavAlbproprvid_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV83AlbProPrvID = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83AlbProPrvID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83AlbProPrvID), 6, 0));
         }
         else
         {
            AV83AlbProPrvID = (int)(localUtil.ctol( httpContext.cgiGet( edtavAlbproprvid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83AlbProPrvID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83AlbProPrvID), 6, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavAlbprodatefrom_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vALBPRODATEFROM");
            GX_FocusControl = edtavAlbprodatefrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV84AlbProDatefrom = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV84AlbProDatefrom", localUtil.format(AV84AlbProDatefrom, "99/99/99"));
         }
         else
         {
            AV84AlbProDatefrom = localUtil.ctod( httpContext.cgiGet( edtavAlbprodatefrom_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV84AlbProDatefrom", localUtil.format(AV84AlbProDatefrom, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavAlbprodateto_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vALBPRODATETO");
            GX_FocusControl = edtavAlbprodateto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV85AlbProDateto = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85AlbProDateto", localUtil.format(AV85AlbProDateto, "99/99/99"));
         }
         else
         {
            AV85AlbProDateto = localUtil.ctod( httpContext.cgiGet( edtavAlbprodateto_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85AlbProDateto", localUtil.format(AV85AlbProDateto, "99/99/99"));
         }
         AV94Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV94Pgmname", AV94Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_albprosalauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_ALBPROSALAUXDATE");
            GX_FocusControl = edtavDdo_albprosalauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV70DDO_AlbProSalAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70DDO_AlbProSalAuxDate", localUtil.format(AV70DDO_AlbProSalAuxDate, "99/99/99"));
         }
         else
         {
            AV70DDO_AlbProSalAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_albprosalauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70DDO_AlbProSalAuxDate", localUtil.format(AV70DDO_AlbProSalAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_albprosysauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_ALBPROSYSAUXDATE");
            GX_FocusControl = edtavDdo_albprosysauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV34DDO_AlbProSysAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34DDO_AlbProSysAuxDate", localUtil.format(AV34DDO_AlbProSysAuxDate, "99/99/99"));
         }
         else
         {
            AV34DDO_AlbProSysAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_albprosysauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34DDO_AlbProSysAuxDate", localUtil.format(AV34DDO_AlbProSysAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_albprosysauxdateto_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_ALBPROSYSAUXDATETO");
            GX_FocusControl = edtavDdo_albprosysauxdateto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV35DDO_AlbProSysAuxDateTo = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35DDO_AlbProSysAuxDateTo", localUtil.format(AV35DDO_AlbProSysAuxDateTo, "99/99/99"));
         }
         else
         {
            AV35DDO_AlbProSysAuxDateTo = localUtil.ctod( httpContext.cgiGet( edtavDdo_albprosysauxdateto_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35DDO_AlbProSysAuxDateTo", localUtil.format(AV35DDO_AlbProSysAuxDateTo, "99/99/99"));
         }
         /* Read subfile selected row values. */
         nGXsfl_52_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_522( ) ;
         if ( nGXsfl_52_idx > 0 )
         {
            cmbavGridactions.setName( cmbavGridactions.getInternalname() );
            cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
            AV44GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44GridActions), 4, 0));
            A13418AlbProID = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbProID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A13419AlbProPrvI = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbProPrvI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A13420AlbProPrvN = httpContext.cgiGet( edtAlbProPrvN_Internalname) ;
            n13420AlbProPrvN = false ;
            cmbAlbProSta.setName( cmbAlbProSta.getInternalname() );
            cmbAlbProSta.setValue( httpContext.cgiGet( cmbAlbProSta.getInternalname()) );
            A13437AlbProSta = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbProSta.getInternalname()))) ;
            cmbAlbProAnul.setName( cmbAlbProAnul.getInternalname() );
            cmbAlbProAnul.setValue( httpContext.cgiGet( cmbAlbProAnul.getInternalname()) );
            A13440AlbProAnul = httpContext.cgiGet( cmbAlbProAnul.getInternalname()) ;
            A13430AlbProDate = localUtil.ctod( httpContext.cgiGet( edtAlbProDate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            A13429AlbProSal = localUtil.ctot( httpContext.cgiGet( edtAlbProSal_Internalname)) ;
            A13436AlbProIDAT = httpContext.cgiGet( edtAlbProIDAT_Internalname) ;
            A14190AlbProATCU = httpContext.cgiGet( edtAlbProATCU_Internalname) ;
            n14190AlbProATCU = false ;
            cmbAlbProStAT.setName( cmbAlbProStAT.getInternalname() );
            cmbAlbProStAT.setValue( httpContext.cgiGet( cmbAlbProStAT.getInternalname()) );
            A13438AlbProStAT = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbProStAT.getInternalname()))) ;
            A13431AlbProSys = localUtil.ctot( httpContext.cgiGet( edtAlbProSys_Internalname)) ;
            A14376AlbProFm4d = httpContext.cgiGet( edtAlbProFm4d_Internalname) ;
            A13435AlbProEnvA = httpContext.cgiGet( edtAlbProEnvA_Internalname) ;
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            A13433AlbProHh = httpContext.cgiGet( edtAlbProHh_Internalname) ;
            A13434AlbProHhCt = httpContext.cgiGet( edtAlbProHhCt_Internalname) ;
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"DocumentoTransporteProveedor_1WW");
         AV94Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV94Pgmname", AV94Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV94Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("stocksquimicos\\documentotransporteproveedor_1ww:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vALBPROID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV81AlbProID )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vALBPROANUL"), AV82AlbProAnul) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vALBPROPRVID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV83AlbProPrvID )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vALBPRODATEFROM"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV84AlbProDatefrom)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vALBPRODATETO"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV85AlbProDateto)) ) )
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
      e201WM2 ();
      if (returnInSub) return;
   }

   public void e201WM2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV82AlbProAnul = "T" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV82AlbProAnul", AV82AlbProAnul);
      /* Execute user subroutine: 'LOADFILTERFORM' */
      S112 ();
      if (returnInSub) return;
      if ( (GXutil.strcmp("", AV88FilterDocumentoTransporteProveedor_1.getgxTv_SdtFilterDocumentoTransporteProveedor_1_Albproanulado())==0) )
      {
         AV82AlbProAnul = "T" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV82AlbProAnul", AV82AlbProAnul);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88FilterDocumentoTransporteProveedor_1.getgxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodatefrom())) || ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88FilterDocumentoTransporteProveedor_1.getgxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodateto())) )
      {
         AV84AlbProDatefrom = AV88FilterDocumentoTransporteProveedor_1.getgxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodatefrom() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV84AlbProDatefrom", localUtil.format(AV84AlbProDatefrom, "99/99/99"));
         AV85AlbProDateto = AV88FilterDocumentoTransporteProveedor_1.getgxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodateto() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV85AlbProDateto", localUtil.format(AV85AlbProDateto, "99/99/99"));
      }
      else
      {
         if ( (0==AV88FilterDocumentoTransporteProveedor_1.getgxTv_SdtFilterDocumentoTransporteProveedor_1_Albproid()) )
         {
            AV84AlbProDatefrom = GXutil.dadd(Gx_date,-(30)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV84AlbProDatefrom", localUtil.format(AV84AlbProDatefrom, "99/99/99"));
            AV85AlbProDateto = Gx_date ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85AlbProDateto", localUtil.format(AV85AlbProDateto, "99/99/99"));
         }
      }
      GXt_char1 = AV46Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      documentotransporteproveedor_1ww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV46Station = GXt_char1 ;
      GXv_char2[0] = AV47Emprcod ;
      GXv_char3[0] = AV62EmprNom ;
      GXv_char4[0] = AV45UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV46Station, GXv_char2, GXv_char3, GXv_char4) ;
      documentotransporteproveedor_1ww_impl.this.AV47Emprcod = GXv_char2[0] ;
      documentotransporteproveedor_1ww_impl.this.AV62EmprNom = GXv_char3[0] ;
      documentotransporteproveedor_1ww_impl.this.AV45UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47Emprcod", AV47Emprcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV47Emprcod, "@!"))));
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Grid_titlescategories_Gridinternalname = subGrid_Internalname ;
      ucGrid_titlescategories.sendProperty(context, "", false, Grid_titlescategories_Internalname, "GridInternalName", Grid_titlescategories_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Documento Transporte Proveedor", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV40DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV40DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_int7 = (byte)(AV78FirmaD) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV47Emprcod, httpContext.getMessage( "FIRDGG", ""), GXv_int8) ;
      documentotransporteproveedor_1ww_impl.this.GXt_int7 = GXv_int8[0] ;
      AV78FirmaD = GXt_int7 ;
   }

   public void e211WM2( )
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
      AV42GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42GridCurrentPage), 10, 0));
      AV43GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43GridPageCount), 10, 0));
      cmbavGridactions.setColumnHeaderClass( "WWActionGroupColumn" );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Columnheaderclass", cmbavGridactions.getColumnHeaderClass(), !bGXsfl_52_Refreshing);
      edtAlbProID_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProID_Internalname, "Columnheaderclass", edtAlbProID_Columnheaderclass, !bGXsfl_52_Refreshing);
      edtAlbProPrvI_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProPrvI_Internalname, "Columnheaderclass", edtAlbProPrvI_Columnheaderclass, !bGXsfl_52_Refreshing);
      edtAlbProPrvN_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProPrvN_Internalname, "Columnheaderclass", edtAlbProPrvN_Columnheaderclass, !bGXsfl_52_Refreshing);
      cmbAlbProSta.setColumnHeaderClass( "WWColumn hidden-xs" );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProSta.getInternalname(), "Columnheaderclass", cmbAlbProSta.getColumnHeaderClass(), !bGXsfl_52_Refreshing);
      cmbAlbProAnul.setColumnHeaderClass( "WWColumn" );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProAnul.getInternalname(), "Columnheaderclass", cmbAlbProAnul.getColumnHeaderClass(), !bGXsfl_52_Refreshing);
      edtAlbProDate_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProDate_Internalname, "Columnheaderclass", edtAlbProDate_Columnheaderclass, !bGXsfl_52_Refreshing);
      edtAlbProSal_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProSal_Internalname, "Columnheaderclass", edtAlbProSal_Columnheaderclass, !bGXsfl_52_Refreshing);
      edtAlbProIDAT_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProIDAT_Internalname, "Columnheaderclass", edtAlbProIDAT_Columnheaderclass, !bGXsfl_52_Refreshing);
      edtAlbProATCU_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProATCU_Internalname, "Columnheaderclass", edtAlbProATCU_Columnheaderclass, !bGXsfl_52_Refreshing);
      cmbAlbProStAT.setColumnHeaderClass( "WWColumn" );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProStAT.getInternalname(), "Columnheaderclass", cmbAlbProStAT.getColumnHeaderClass(), !bGXsfl_52_Refreshing);
      edtAlbProSys_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProSys_Internalname, "Columnheaderclass", edtAlbProSys_Columnheaderclass, !bGXsfl_52_Refreshing);
      edtAlbProFm4d_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProFm4d_Internalname, "Columnheaderclass", edtAlbProFm4d_Columnheaderclass, !bGXsfl_52_Refreshing);
      GXv_date10[0] = AV85AlbProDateto ;
      new app.stocksquimicos.documentotransporteproveedor_ultimafecha(remoteHandle, context).execute( AV47Emprcod, GXv_date10) ;
      documentotransporteproveedor_1ww_impl.this.AV85AlbProDateto = GXv_date10[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV85AlbProDateto", localUtil.format(AV85AlbProDateto, "99/99/99"));
      AV85AlbProDateto = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV85AlbProDateto)) ? Gx_date : AV85AlbProDateto) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV85AlbProDateto", localUtil.format(AV85AlbProDateto, "99/99/99"));
      AV96Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom = AV90TFAlbProPrvNom ;
      AV97Stocksquimicos_documentotransporteproveedor_1wwds_2_tfalbproprvnom_sel = AV91TFAlbProPrvNom_Sel ;
      AV98Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels = AV80TFAlbProSta_Sels ;
      AV99Stocksquimicos_documentotransporteproveedor_1wwds_4_tfalbprosal = AV69TFAlbProSal ;
      AV100Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat = AV36TFAlbProIDAT ;
      AV101Stocksquimicos_documentotransporteproveedor_1wwds_6_tfalbproidat_sel = AV37TFAlbProIDAT_Sel ;
      AV102Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud = AV48TFAlbProATCUD ;
      AV103Stocksquimicos_documentotransporteproveedor_1wwds_8_tfalbproatcud_sel = AV49TFAlbProATCUD_Sel ;
      AV104Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels = AV72TFAlbProStAT_Sels ;
      AV105Stocksquimicos_documentotransporteproveedor_1wwds_10_tfalbprosys = AV32TFAlbProSys ;
      AV106Stocksquimicos_documentotransporteproveedor_1wwds_11_tfalbprosys_to = AV33TFAlbProSys_To ;
      AV107Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig = AV75TFAlbProFm4dig ;
      AV108Stocksquimicos_documentotransporteproveedor_1wwds_13_tfalbprofm4dig_sel = AV76TFAlbProFm4dig_Sel ;
      /*  Sending Event outputs  */
   }

   public void e111WM2( )
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
         AV41PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV41PageToGo) ;
      }
   }

   public void e121WM2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e131WM2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProPrvNom") == 0 )
         {
            AV90TFAlbProPrvNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV90TFAlbProPrvNom", AV90TFAlbProPrvNom);
            AV91TFAlbProPrvNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV91TFAlbProPrvNom_Sel", AV91TFAlbProPrvNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProSta") == 0 )
         {
            AV79TFAlbProSta_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79TFAlbProSta_SelsJson", AV79TFAlbProSta_SelsJson);
            AV80TFAlbProSta_Sels.fromJSonString(GXutil.strReplace( AV79TFAlbProSta_SelsJson, "\"", ""), null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProSal") == 0 )
         {
            AV69TFAlbProSal = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69TFAlbProSal", localUtil.ttoc( AV69TFAlbProSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProIDAT") == 0 )
         {
            AV36TFAlbProIDAT = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFAlbProIDAT", AV36TFAlbProIDAT);
            AV37TFAlbProIDAT_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFAlbProIDAT_Sel", AV37TFAlbProIDAT_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProATCUD") == 0 )
         {
            AV48TFAlbProATCUD = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFAlbProATCUD", AV48TFAlbProATCUD);
            AV49TFAlbProATCUD_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFAlbProATCUD_Sel", AV49TFAlbProATCUD_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProStAT") == 0 )
         {
            AV71TFAlbProStAT_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TFAlbProStAT_SelsJson", AV71TFAlbProStAT_SelsJson);
            AV72TFAlbProStAT_Sels.fromJSonString(GXutil.strReplace( AV71TFAlbProStAT_SelsJson, "\"", ""), null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProSys") == 0 )
         {
            AV32TFAlbProSys = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFAlbProSys", localUtil.ttoc( AV32TFAlbProSys, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV33TFAlbProSys_To = localUtil.ctot( Ddo_grid_Filteredtextto_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFAlbProSys_To", localUtil.ttoc( AV33TFAlbProSys_To, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            if ( ! GXutil.dateCompare(GXutil.nullDate(), AV33TFAlbProSys_To) )
            {
               AV33TFAlbProSys_To = localUtil.ymdhmsToT( (short)(GXutil.year( AV33TFAlbProSys_To)), (byte)(GXutil.month( AV33TFAlbProSys_To)), (byte)(GXutil.day( AV33TFAlbProSys_To)), (byte)(23), (byte)(59), (byte)(59)) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV33TFAlbProSys_To", localUtil.ttoc( AV33TFAlbProSys_To, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProFm4dig") == 0 )
         {
            AV75TFAlbProFm4dig = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV75TFAlbProFm4dig", AV75TFAlbProFm4dig);
            AV76TFAlbProFm4dig_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76TFAlbProFm4dig_Sel", AV76TFAlbProFm4dig_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV72TFAlbProStAT_Sels", AV72TFAlbProStAT_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV80TFAlbProSta_Sels", AV80TFAlbProSta_Sels);
   }

   private void e221WM2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_display", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "Anular GUIA", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("4", GXutil.format( "%1;%2", httpContext.getMessage( "Lineas", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("5", GXutil.format( "%1;%2", httpContext.getMessage( "Imprimir", ""), "fa fa-file-pdf", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("6", GXutil.format( "%1;%2", httpContext.getMessage( "Envio AT", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("7", GXutil.format( "%1;%2", httpContext.getMessage( "Entrada Manual Codigo de AT", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.setColumnClass( ((GXutil.strcmp(A13440AlbProAnul, "A")==0) ? "WWActionGroupColumn WWColumnDanger WWColumnDangerFirstColumn" : "WWActionGroupColumn") );
      edtAlbProID_Columnclass = ((GXutil.strcmp(A13440AlbProAnul, "A")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      edtAlbProPrvI_Columnclass = ((GXutil.strcmp(A13440AlbProAnul, "A")==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
      edtAlbProPrvN_Columnclass = ((GXutil.strcmp(A13440AlbProAnul, "A")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      cmbAlbProSta.setColumnClass( ((GXutil.strcmp(A13440AlbProAnul, "A")==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") );
      cmbAlbProAnul.setColumnClass( ((GXutil.strcmp(A13440AlbProAnul, "A")==0) ? "WWColumn WWColumnDanger" : "WWColumn") );
      edtAlbProDate_Columnclass = ((GXutil.strcmp(A13440AlbProAnul, "A")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      edtAlbProSal_Columnclass = ((GXutil.strcmp(A13440AlbProAnul, "A")==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
      edtAlbProIDAT_Columnclass = ((GXutil.strcmp(A13440AlbProAnul, "A")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      edtAlbProATCU_Columnclass = ((GXutil.strcmp(A13440AlbProAnul, "A")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      cmbAlbProStAT.setColumnClass( ((GXutil.strcmp(A13440AlbProAnul, "A")==0) ? "WWColumn WWColumnDanger" : "WWColumn") );
      edtAlbProSys_Columnclass = ((GXutil.strcmp(A13440AlbProAnul, "A")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      edtAlbProFm4d_Columnclass = ((GXutil.strcmp(A13440AlbProAnul, "A")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(52) ;
      }
      sendrow_522( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_52_Refreshing )
      {
         httpContext.doAjaxLoad(52, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV44GridActions, 4, 0)) );
   }

   public void e231WM2( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV44GridActions == 1 )
      {
         /* Execute user subroutine: 'DO DISPLAY' */
         S162 ();
         if (returnInSub) return;
      }
      else if ( AV44GridActions == 2 )
      {
         /* Execute user subroutine: 'DO UPDATE' */
         S172 ();
         if (returnInSub) return;
      }
      else if ( AV44GridActions == 3 )
      {
         /* Execute user subroutine: 'DO ANULARGUIA' */
         S182 ();
         if (returnInSub) return;
      }
      else if ( AV44GridActions == 4 )
      {
         /* Execute user subroutine: 'DO LINEASV02' */
         S192 ();
         if (returnInSub) return;
      }
      else if ( AV44GridActions == 5 )
      {
         /* Execute user subroutine: 'DO IMPRIMIR' */
         S202 ();
         if (returnInSub) return;
      }
      else if ( AV44GridActions == 6 )
      {
         /* Execute user subroutine: 'DO ENVIOAT' */
         S212 ();
         if (returnInSub) return;
      }
      else if ( AV44GridActions == 7 )
      {
         /* Execute user subroutine: 'DO MANUALCODIGOAT' */
         S222 ();
         if (returnInSub) return;
      }
      AV44GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV44GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
   }

   public void e141WM2( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.stocksquimicos.documentotransporteproveedor_1", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim(AV47Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"Mode","EmprCod","AlbProID"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'DO DISPLAY' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.stocksquimicos.documentotransporteproveedor_1_2", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A13418AlbProID,8,0))}, new String[] {"Mode","EmprCod","AlbProID"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S172( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(A13440AlbProAnul, httpContext.getMessage( "A", "")) == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Guia Anulada ¡¡¡", ""));
      }
      else
      {
         if ( A13438AlbProStAT == 3 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Atenção.Este guia foi enviado para AT", ""));
         }
         else
         {
            callWebObject(formatLink("app.stocksquimicos.documentotransporteproveedor_1", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A13418AlbProID,8,0))}, new String[] {"Mode","EmprCod","AlbProID"}) );
            httpContext.wjLocDisableFrm = (byte)(1) ;
         }
      }
   }

   public void S182( )
   {
      /* 'DO ANULARGUIA' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(A13440AlbProAnul, "A") == 0 )
      {
         Gx_msg = httpContext.getMessage( "Este Guia foi ANULADA", "") ;
         httpContext.GX_msglist.addItem(Gx_msg);
      }
      else
      {
         if ( (GXutil.strcmp("", A13436AlbProIDAT)==0) )
         {
            Gx_msg = httpContext.getMessage( "Este guia não tem código AT", "") ;
            httpContext.GX_msglist.addItem(Gx_msg);
         }
         else
         {
            if ( A13438AlbProStAT == 0 )
            {
               Gx_msg = httpContext.getMessage( "Este guia não foi enviado para a AT", "") ;
               httpContext.GX_msglist.addItem(Gx_msg);
            }
            else
            {
               httpContext.popup(formatLink("app.stocksquimicos.documentotransporteproveedor_anulacion", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A13418AlbProID,8,0)),GXutil.URLEncode(GXutil.formatDateTimeParm(A13431AlbProSys)),GXutil.URLEncode(GXutil.formatDateTimeParm(A13429AlbProSal)),GXutil.URLEncode(GXutil.formatDateParm(A13430AlbProDate)),GXutil.URLEncode(GXutil.rtrim(A13436AlbProIDAT))}, new String[] {"EmprCod","AlbProID","AlbProSys","AlbProSal","AlbProDate","AlbProIDAT"}) , new Object[] {});
            }
         }
      }
      httpContext.doAjaxRefresh();
   }

   public void S192( )
   {
      /* 'DO LINEASV02' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.stocksquimicos.documentotransporteproveedor_7", new String[] {GXutil.URLEncode(GXutil.rtrim(AV47Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(A13418AlbProID,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A13419AlbProPrvI,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A13438AlbProStAT,1,0)),GXutil.URLEncode(GXutil.rtrim(A13436AlbProIDAT)),GXutil.URLEncode(GXutil.formatDateTimeParm(A13431AlbProSys)),GXutil.URLEncode(GXutil.formatDateParm(A13430AlbProDate))}, new String[] {"Emprcod","AlbProID","AlbProPrvID","AlbProStAT","ALbProIDAT","AlbProSys","AlbProDate"}) , new Object[] {});
   }

   public void S202( )
   {
      /* 'DO IMPRIMIR' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.stocksquimicos.imprimirdocumentosproveedor", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A13418AlbProID,8,0))}, new String[] {"Emprcod","AlbProID"}) , new Object[] {"A396EmprCod","A13418AlbProID"});
      httpContext.doAjaxRefresh();
   }

   public void S212( )
   {
      /* 'DO ENVIOAT' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(A13436AlbProIDAT, " ") != 0 )
      {
         Gx_msg = httpContext.getMessage( "Atenção, este guia já tem o código AT= ", "") + A13436AlbProIDAT ;
         httpContext.GX_msglist.addItem(Gx_msg);
      }
      else
      {
         if ( A13438AlbProStAT == 3 )
         {
            Gx_msg = httpContext.getMessage( "Atenção, este guia ya fue enviada a AT", "") ;
            httpContext.GX_msglist.addItem(Gx_msg);
         }
         else
         {
            callWebObject(formatLink("app.stocksquimicos.preparoxmldocumentoproveedorat", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A13418AlbProID,8,0)),GXutil.URLEncode(GXutil.formatDateTimeParm(A13431AlbProSys)),GXutil.URLEncode(GXutil.formatDateParm(A13430AlbProDate)),GXutil.URLEncode(GXutil.formatDateTimeParm(A13429AlbProSal)),GXutil.URLEncode(GXutil.rtrim(AV50Cadena)),GXutil.URLEncode(GXutil.rtrim(AV52Hash))}, new String[] {"EmprCod","AlbProID","AlbProSys","AlbProDate","AlbProSal","Cadena","Hash"}) );
            httpContext.wjLocDisableFrm = (byte)(1) ;
         }
      }
      httpContext.doAjaxRefresh();
   }

   public void S222( )
   {
      /* 'DO MANUALCODIGOAT' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(A13436AlbProIDAT, " ") != 0 )
      {
         Gx_msg = httpContext.getMessage( "Atenção, este guia já tem o código AT= ", "") + A13436AlbProIDAT ;
         httpContext.GX_msglist.addItem(Gx_msg);
      }
      else
      {
         if ( A13438AlbProStAT == 3 )
         {
            Gx_msg = httpContext.getMessage( "Atenção, este guia ya fue enviada a AT", "") ;
            httpContext.GX_msglist.addItem(Gx_msg);
         }
         else
         {
            httpContext.popup(formatLink("app.stocksquimicos.documentotransporteproveedor_6", new String[] {GXutil.URLEncode(GXutil.rtrim(AV47Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(A13418AlbProID,8,0)),GXutil.URLEncode(GXutil.formatDateTimeParm(A13429AlbProSal)),GXutil.URLEncode(GXutil.formatDateTimeParm(A13431AlbProSys)),GXutil.URLEncode(GXutil.formatDateParm(A13430AlbProDate))}, new String[] {"Emprcod","AlbProId","AlbProSal","AlbProSys","AlbProDate"}) , new Object[] {});
            httpContext.doAjaxRefresh();
         }
      }
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV94Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV94Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV94Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      AV110GXV1 = 1 ;
      while ( AV110GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV110GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROPRVNOM") == 0 )
         {
            AV90TFAlbProPrvNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV90TFAlbProPrvNom", AV90TFAlbProPrvNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROPRVNOM_SEL") == 0 )
         {
            AV91TFAlbProPrvNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV91TFAlbProPrvNom_Sel", AV91TFAlbProPrvNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROSTA_SEL") == 0 )
         {
            AV79TFAlbProSta_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79TFAlbProSta_SelsJson", AV79TFAlbProSta_SelsJson);
            AV80TFAlbProSta_Sels.fromJSonString(AV79TFAlbProSta_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROSAL") == 0 )
         {
            AV69TFAlbProSal = localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69TFAlbProSal", localUtil.ttoc( AV69TFAlbProSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV70DDO_AlbProSalAuxDate = GXutil.resetTime(AV69TFAlbProSal) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70DDO_AlbProSalAuxDate", localUtil.format(AV70DDO_AlbProSalAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROIDAT") == 0 )
         {
            AV36TFAlbProIDAT = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFAlbProIDAT", AV36TFAlbProIDAT);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROIDAT_SEL") == 0 )
         {
            AV37TFAlbProIDAT_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFAlbProIDAT_Sel", AV37TFAlbProIDAT_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROATCUD") == 0 )
         {
            AV48TFAlbProATCUD = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFAlbProATCUD", AV48TFAlbProATCUD);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROATCUD_SEL") == 0 )
         {
            AV49TFAlbProATCUD_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFAlbProATCUD_Sel", AV49TFAlbProATCUD_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROSTAT_SEL") == 0 )
         {
            AV71TFAlbProStAT_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TFAlbProStAT_SelsJson", AV71TFAlbProStAT_SelsJson);
            AV72TFAlbProStAT_Sels.fromJSonString(AV71TFAlbProStAT_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROSYS") == 0 )
         {
            AV32TFAlbProSys = localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFAlbProSys", localUtil.ttoc( AV32TFAlbProSys, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV33TFAlbProSys_To = localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFAlbProSys_To", localUtil.ttoc( AV33TFAlbProSys_To, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV34DDO_AlbProSysAuxDate = GXutil.resetTime(AV32TFAlbProSys) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34DDO_AlbProSysAuxDate", localUtil.format(AV34DDO_AlbProSysAuxDate, "99/99/99"));
            AV35DDO_AlbProSysAuxDateTo = GXutil.resetTime(AV33TFAlbProSys_To) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35DDO_AlbProSysAuxDateTo", localUtil.format(AV35DDO_AlbProSysAuxDateTo, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROFM4DIG") == 0 )
         {
            AV75TFAlbProFm4dig = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV75TFAlbProFm4dig", AV75TFAlbProFm4dig);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROFM4DIG_SEL") == 0 )
         {
            AV76TFAlbProFm4dig_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76TFAlbProFm4dig_Sel", AV76TFAlbProFm4dig_Sel);
         }
         AV110GXV1 = (int)(AV110GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV91TFAlbProPrvNom_Sel)==0), AV91TFAlbProPrvNom_Sel, GXv_char4) ;
      documentotransporteproveedor_1ww_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char11 = "" ;
      GXv_char3[0] = GXt_char11 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV37TFAlbProIDAT_Sel)==0), AV37TFAlbProIDAT_Sel, GXv_char3) ;
      documentotransporteproveedor_1ww_impl.this.GXt_char11 = GXv_char3[0] ;
      GXt_char12 = "" ;
      GXv_char2[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV49TFAlbProATCUD_Sel)==0), AV49TFAlbProATCUD_Sel, GXv_char2) ;
      documentotransporteproveedor_1ww_impl.this.GXt_char12 = GXv_char2[0] ;
      GXt_char13 = "" ;
      GXv_char14[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV76TFAlbProFm4dig_Sel)==0), AV76TFAlbProFm4dig_Sel, GXv_char14) ;
      documentotransporteproveedor_1ww_impl.this.GXt_char13 = GXv_char14[0] ;
      Ddo_grid_Selectedvalue_set = "||"+GXt_char1+"|"+((AV80TFAlbProSta_Sels.size()==0) ? "" : AV79TFAlbProSta_SelsJson)+"||||"+GXt_char11+"|"+GXt_char12+"|"+((AV72TFAlbProStAT_Sels.size()==0) ? "" : AV71TFAlbProStAT_SelsJson)+"||"+GXt_char13 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char13 = "" ;
      GXv_char14[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV90TFAlbProPrvNom)==0), AV90TFAlbProPrvNom, GXv_char14) ;
      documentotransporteproveedor_1ww_impl.this.GXt_char13 = GXv_char14[0] ;
      GXt_char12 = "" ;
      GXv_char4[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV36TFAlbProIDAT)==0), AV36TFAlbProIDAT, GXv_char4) ;
      documentotransporteproveedor_1ww_impl.this.GXt_char12 = GXv_char4[0] ;
      GXt_char11 = "" ;
      GXv_char3[0] = GXt_char11 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV48TFAlbProATCUD)==0), AV48TFAlbProATCUD, GXv_char3) ;
      documentotransporteproveedor_1ww_impl.this.GXt_char11 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV75TFAlbProFm4dig)==0), AV75TFAlbProFm4dig, GXv_char2) ;
      documentotransporteproveedor_1ww_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = "||"+GXt_char13+"||||"+(GXutil.dateCompare(GXutil.nullDate(), AV69TFAlbProSal) ? "" : localUtil.dtoc( AV70DDO_AlbProSalAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char12+"|"+GXt_char11+"||"+(GXutil.dateCompare(GXutil.nullDate(), AV32TFAlbProSys) ? "" : localUtil.dtoc( AV34DDO_AlbProSysAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||||||||||"+(GXutil.dateCompare(GXutil.nullDate(), AV33TFAlbProSys_To) ? "" : localUtil.dtoc( AV35DDO_AlbProSysAuxDateTo, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
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
      AV10GridState.fromxml(AV22Session.getValue(AV94Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState15[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState15, "TFALBPROPRVNOM", "", !(GXutil.strcmp("", AV90TFAlbProPrvNom)==0), (short)(0), AV90TFAlbProPrvNom, "", !(GXutil.strcmp("", AV91TFAlbProPrvNom_Sel)==0), AV91TFAlbProPrvNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState15[0] ;
      GXv_SdtWWPGridState15[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState15, "TFALBPROSTA_SEL", "", !(AV80TFAlbProSta_Sels.size()==0), (short)(0), AV80TFAlbProSta_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState15[0] ;
      GXv_SdtWWPGridState15[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState15, "TFALBPROSAL", "", !GXutil.dateCompare(GXutil.nullDate(), AV69TFAlbProSal), (short)(0), GXutil.trim( localUtil.ttoc( AV69TFAlbProSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState15[0] ;
      GXv_SdtWWPGridState15[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState15, "TFALBPROIDAT", "", !(GXutil.strcmp("", AV36TFAlbProIDAT)==0), (short)(0), AV36TFAlbProIDAT, "", !(GXutil.strcmp("", AV37TFAlbProIDAT_Sel)==0), AV37TFAlbProIDAT_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState15[0] ;
      GXv_SdtWWPGridState15[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState15, "TFALBPROATCUD", "", !(GXutil.strcmp("", AV48TFAlbProATCUD)==0), (short)(0), AV48TFAlbProATCUD, "", !(GXutil.strcmp("", AV49TFAlbProATCUD_Sel)==0), AV49TFAlbProATCUD_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState15[0] ;
      GXv_SdtWWPGridState15[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState15, "TFALBPROSTAT_SEL", "", !(AV72TFAlbProStAT_Sels.size()==0), (short)(0), AV72TFAlbProStAT_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState15[0] ;
      GXv_SdtWWPGridState15[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState15, "TFALBPROSYS", "", !(GXutil.dateCompare(GXutil.nullDate(), AV32TFAlbProSys)&&GXutil.dateCompare(GXutil.nullDate(), AV33TFAlbProSys_To)), (short)(0), GXutil.trim( localUtil.ttoc( AV32TFAlbProSys, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), GXutil.trim( localUtil.ttoc( AV33TFAlbProSys_To, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))) ;
      AV10GridState = GXv_SdtWWPGridState15[0] ;
      GXv_SdtWWPGridState15[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState15, "TFALBPROFM4DIG", "", !(GXutil.strcmp("", AV75TFAlbProFm4dig)==0), (short)(0), AV75TFAlbProFm4dig, "", !(GXutil.strcmp("", AV76TFAlbProFm4dig_Sel)==0), AV76TFAlbProFm4dig_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState15[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV94Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV94Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "StocksQuimicos.DocumentoTransporteProveedor_1" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void e151WM2( )
   {
      /* Albproprvid_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S232 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV88FilterDocumentoTransporteProveedor_1", AV88FilterDocumentoTransporteProveedor_1);
   }

   public void e161WM2( )
   {
      /* Albproid_Controlvaluechanged Routine */
      returnInSub = false ;
      if ( (0==AV81AlbProID) )
      {
         AV84AlbProDatefrom = GXutil.dadd(Gx_date,-(30)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV84AlbProDatefrom", localUtil.format(AV84AlbProDatefrom, "99/99/99"));
         AV85AlbProDateto = Gx_date ;
         httpContext.ajax_rsp_assign_attri("", false, "AV85AlbProDateto", localUtil.format(AV85AlbProDateto, "99/99/99"));
         AV83AlbProPrvID = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV83AlbProPrvID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83AlbProPrvID), 6, 0));
         /* Execute user subroutine: 'SAVEFILTERFORM' */
         S232 ();
         if (returnInSub) return;
      }
      else
      {
         AV84AlbProDatefrom = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV84AlbProDatefrom", localUtil.format(AV84AlbProDatefrom, "99/99/99"));
         AV85AlbProDateto = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV85AlbProDateto", localUtil.format(AV85AlbProDateto, "99/99/99"));
         AV83AlbProPrvID = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV83AlbProPrvID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83AlbProPrvID), 6, 0));
         /* Execute user subroutine: 'SAVEFILTERFORM' */
         S232 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV88FilterDocumentoTransporteProveedor_1", AV88FilterDocumentoTransporteProveedor_1);
   }

   public void e171WM2( )
   {
      /* Albprodatefrom_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S232 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV88FilterDocumentoTransporteProveedor_1", AV88FilterDocumentoTransporteProveedor_1);
   }

   public void e181WM2( )
   {
      /* Albprodateto_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S232 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV88FilterDocumentoTransporteProveedor_1", AV88FilterDocumentoTransporteProveedor_1);
   }

   public void e191WM2( )
   {
      /* Albproanul_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S232 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV88FilterDocumentoTransporteProveedor_1", AV88FilterDocumentoTransporteProveedor_1);
   }

   public void S112( )
   {
      /* 'LOADFILTERFORM' Routine */
      returnInSub = false ;
      AV88FilterDocumentoTransporteProveedor_1.fromJSonString(AV89WebSession.getValue(httpContext.getMessage( "FilterDocumentoTransporteProveedor_1", "")), null);
      AV81AlbProID = AV88FilterDocumentoTransporteProveedor_1.getgxTv_SdtFilterDocumentoTransporteProveedor_1_Albproid() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV81AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81AlbProID), 8, 0));
      AV82AlbProAnul = AV88FilterDocumentoTransporteProveedor_1.getgxTv_SdtFilterDocumentoTransporteProveedor_1_Albproanulado() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV82AlbProAnul", AV82AlbProAnul);
      AV83AlbProPrvID = AV88FilterDocumentoTransporteProveedor_1.getgxTv_SdtFilterDocumentoTransporteProveedor_1_Albproprvid() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV83AlbProPrvID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83AlbProPrvID), 6, 0));
      AV84AlbProDatefrom = AV88FilterDocumentoTransporteProveedor_1.getgxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodatefrom() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV84AlbProDatefrom", localUtil.format(AV84AlbProDatefrom, "99/99/99"));
      AV85AlbProDateto = AV88FilterDocumentoTransporteProveedor_1.getgxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodateto() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV85AlbProDateto", localUtil.format(AV85AlbProDateto, "99/99/99"));
   }

   public void S232( )
   {
      /* 'SAVEFILTERFORM' Routine */
      returnInSub = false ;
      AV88FilterDocumentoTransporteProveedor_1.setgxTv_SdtFilterDocumentoTransporteProveedor_1_Albproprvid( AV83AlbProPrvID );
      AV88FilterDocumentoTransporteProveedor_1.setgxTv_SdtFilterDocumentoTransporteProveedor_1_Albproid( AV81AlbProID );
      AV88FilterDocumentoTransporteProveedor_1.setgxTv_SdtFilterDocumentoTransporteProveedor_1_Albproanulado( AV82AlbProAnul );
      AV88FilterDocumentoTransporteProveedor_1.setgxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodatefrom( AV84AlbProDatefrom );
      AV88FilterDocumentoTransporteProveedor_1.setgxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodateto( AV85AlbProDateto );
      AV89WebSession.setValue(httpContext.getMessage( "FilterDocumentoTransporteProveedor_1", ""), AV88FilterDocumentoTransporteProveedor_1.toJSonString(false, true));
   }

   public void wb_table1_41_1WM2( boolean wbgen )
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
         wb_table1_41_1WM2e( true) ;
      }
      else
      {
         wb_table1_41_1WM2e( false) ;
      }
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
      pa1WM2( ) ;
      ws1WM2( ) ;
      we1WM2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026101812391", true, true);
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
      httpContext.AddJavascriptSource("stocksquimicos/documentotransporteproveedor_1ww.js", "?2026101812392", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_522( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_52_idx );
      edtAlbProID_Internalname = "ALBPROID_"+sGXsfl_52_idx ;
      edtAlbProPrvI_Internalname = "ALBPROPRVI_"+sGXsfl_52_idx ;
      edtAlbProPrvN_Internalname = "ALBPROPRVN_"+sGXsfl_52_idx ;
      cmbAlbProSta.setInternalname( "ALBPROSTA_"+sGXsfl_52_idx );
      cmbAlbProAnul.setInternalname( "ALBPROANUL_"+sGXsfl_52_idx );
      edtAlbProDate_Internalname = "ALBPRODATE_"+sGXsfl_52_idx ;
      edtAlbProSal_Internalname = "ALBPROSAL_"+sGXsfl_52_idx ;
      edtAlbProIDAT_Internalname = "ALBPROIDAT_"+sGXsfl_52_idx ;
      edtAlbProATCU_Internalname = "ALBPROATCU_"+sGXsfl_52_idx ;
      cmbAlbProStAT.setInternalname( "ALBPROSTAT_"+sGXsfl_52_idx );
      edtAlbProSys_Internalname = "ALBPROSYS_"+sGXsfl_52_idx ;
      edtAlbProFm4d_Internalname = "ALBPROFM4D_"+sGXsfl_52_idx ;
      edtAlbProEnvA_Internalname = "ALBPROENVA_"+sGXsfl_52_idx ;
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_52_idx ;
      edtAlbProHh_Internalname = "ALBPROHH_"+sGXsfl_52_idx ;
      edtAlbProHhCt_Internalname = "ALBPROHHCT_"+sGXsfl_52_idx ;
   }

   public void subsflControlProps_fel_522( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_52_fel_idx );
      edtAlbProID_Internalname = "ALBPROID_"+sGXsfl_52_fel_idx ;
      edtAlbProPrvI_Internalname = "ALBPROPRVI_"+sGXsfl_52_fel_idx ;
      edtAlbProPrvN_Internalname = "ALBPROPRVN_"+sGXsfl_52_fel_idx ;
      cmbAlbProSta.setInternalname( "ALBPROSTA_"+sGXsfl_52_fel_idx );
      cmbAlbProAnul.setInternalname( "ALBPROANUL_"+sGXsfl_52_fel_idx );
      edtAlbProDate_Internalname = "ALBPRODATE_"+sGXsfl_52_fel_idx ;
      edtAlbProSal_Internalname = "ALBPROSAL_"+sGXsfl_52_fel_idx ;
      edtAlbProIDAT_Internalname = "ALBPROIDAT_"+sGXsfl_52_fel_idx ;
      edtAlbProATCU_Internalname = "ALBPROATCU_"+sGXsfl_52_fel_idx ;
      cmbAlbProStAT.setInternalname( "ALBPROSTAT_"+sGXsfl_52_fel_idx );
      edtAlbProSys_Internalname = "ALBPROSYS_"+sGXsfl_52_fel_idx ;
      edtAlbProFm4d_Internalname = "ALBPROFM4D_"+sGXsfl_52_fel_idx ;
      edtAlbProEnvA_Internalname = "ALBPROENVA_"+sGXsfl_52_fel_idx ;
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_52_fel_idx ;
      edtAlbProHh_Internalname = "ALBPROHH_"+sGXsfl_52_fel_idx ;
      edtAlbProHhCt_Internalname = "ALBPROHHCT_"+sGXsfl_52_fel_idx ;
   }

   public void sendrow_522( )
   {
      subsflControlProps_522( ) ;
      wb1WM0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_52_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_52_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_52_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 53,'',false,'"+sGXsfl_52_idx+"',52)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_52_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV44GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV44GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV44GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_52_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO",cmbavGridactions.getColumnClass(),cmbavGridactions.getColumnHeaderClass(),TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,53);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV44GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_52_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProID_Internalname,GXutil.ltrim( localUtil.ntoc( A13418AlbProID, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13418AlbProID), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProID_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtAlbProID_Columnclass,edtAlbProID_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProPrvI_Internalname,GXutil.ltrim( localUtil.ntoc( A13419AlbProPrvI, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13419AlbProPrvI), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProPrvI_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtAlbProPrvI_Columnclass,edtAlbProPrvI_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProPrvN_Internalname,GXutil.rtrim( A13420AlbProPrvN),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProPrvN_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtAlbProPrvN_Columnclass,edtAlbProPrvN_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( cmbAlbProSta.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBPROSTA_" + sGXsfl_52_idx ;
            cmbAlbProSta.setName( GXCCtl );
            cmbAlbProSta.setWebtags( "" );
            cmbAlbProSta.addItem("0", httpContext.getMessage( "Pdte. Imprimir", ""), (short)(0));
            cmbAlbProSta.addItem("1", httpContext.getMessage( "Imprimido", ""), (short)(0));
            if ( cmbAlbProSta.getItemCount() > 0 )
            {
               A13437AlbProSta = (byte)(GXutil.lval( cmbAlbProSta.getValidValue(GXutil.trim( GXutil.str( A13437AlbProSta, 1, 0))))) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbProSta,cmbAlbProSta.getInternalname(),GXutil.trim( GXutil.str( A13437AlbProSta, 1, 0)),Integer.valueOf(1),cmbAlbProSta.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute",cmbAlbProSta.getColumnClass(),cmbAlbProSta.getColumnHeaderClass(),"","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbProSta.setValue( GXutil.trim( GXutil.str( A13437AlbProSta, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbProSta.getInternalname(), "Values", cmbAlbProSta.ToJavascriptSource(), !bGXsfl_52_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( cmbAlbProAnul.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBPROANUL_" + sGXsfl_52_idx ;
            cmbAlbProAnul.setName( GXCCtl );
            cmbAlbProAnul.setWebtags( "" );
            cmbAlbProAnul.addItem("", httpContext.getMessage( "Em preparação ", ""), (short)(0));
            cmbAlbProAnul.addItem("F", httpContext.getMessage( "Finalizado", ""), (short)(0));
            cmbAlbProAnul.addItem("A", httpContext.getMessage( "Anulado", ""), (short)(0));
            if ( cmbAlbProAnul.getItemCount() > 0 )
            {
               A13440AlbProAnul = cmbAlbProAnul.getValidValue(A13440AlbProAnul) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbProAnul,cmbAlbProAnul.getInternalname(),GXutil.rtrim( A13440AlbProAnul),Integer.valueOf(1),cmbAlbProAnul.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute",cmbAlbProAnul.getColumnClass(),cmbAlbProAnul.getColumnHeaderClass(),"","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbProAnul.setValue( GXutil.rtrim( A13440AlbProAnul) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbProAnul.getInternalname(), "Values", cmbAlbProAnul.ToJavascriptSource(), !bGXsfl_52_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProDate_Internalname,localUtil.format(A13430AlbProDate, "99/99/99"),localUtil.format( A13430AlbProDate, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProDate_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtAlbProDate_Columnclass,edtAlbProDate_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProSal_Internalname,localUtil.ttoc( A13429AlbProSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A13429AlbProSal, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProSal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtAlbProSal_Columnclass,edtAlbProSal_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProIDAT_Internalname,GXutil.rtrim( A13436AlbProIDAT),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProIDAT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtAlbProIDAT_Columnclass,edtAlbProIDAT_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProATCU_Internalname,GXutil.rtrim( A14190AlbProATCU),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProATCU_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtAlbProATCU_Columnclass,edtAlbProATCU_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( cmbAlbProStAT.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBPROSTAT_" + sGXsfl_52_idx ;
            cmbAlbProStAT.setName( GXCCtl );
            cmbAlbProStAT.setWebtags( "" );
            cmbAlbProStAT.addItem("0", httpContext.getMessage( "Pdte. Envio", ""), (short)(0));
            cmbAlbProStAT.addItem("3", httpContext.getMessage( "Enviada AT", ""), (short)(0));
            if ( cmbAlbProStAT.getItemCount() > 0 )
            {
               A13438AlbProStAT = (byte)(GXutil.lval( cmbAlbProStAT.getValidValue(GXutil.trim( GXutil.str( A13438AlbProStAT, 1, 0))))) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbProStAT,cmbAlbProStAT.getInternalname(),GXutil.trim( GXutil.str( A13438AlbProStAT, 1, 0)),Integer.valueOf(1),cmbAlbProStAT.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute",cmbAlbProStAT.getColumnClass(),cmbAlbProStAT.getColumnHeaderClass(),"","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbProStAT.setValue( GXutil.trim( GXutil.str( A13438AlbProStAT, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbProStAT.getInternalname(), "Values", cmbAlbProStAT.ToJavascriptSource(), !bGXsfl_52_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProSys_Internalname,localUtil.ttoc( A13431AlbProSys, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A13431AlbProSys, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProSys_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtAlbProSys_Columnclass,edtAlbProSys_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProFm4d_Internalname,GXutil.rtrim( A14376AlbProFm4d),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProFm4d_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtAlbProFm4d_Columnclass,edtAlbProFm4d_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProEnvA_Internalname,GXutil.rtrim( A13435AlbProEnvA),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProEnvA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProHh_Internalname,A13433AlbProHh,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProHh_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(200),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProHhCt_Internalname,A13434AlbProHhCt,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProHhCt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(200),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1WM2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_52_idx = ((subGrid_Islastpage==1)&&(nGXsfl_52_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_52_idx+1) ;
         sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_522( ) ;
      }
      /* End function sendrow_522 */
   }

   public void startgridcontrol52( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"52\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeValue( httpContext.getMessage( "Nº Guia", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Proveedor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "E", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Data", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Data-Hora", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo AT", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "ATCUD", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Envio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Dia-Hora", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hash", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "A/M", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Empresa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hash", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hash Control", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV44GridActions, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbavGridactions.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbavGridactions.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13418AlbProID, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtAlbProID_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtAlbProID_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13419AlbProPrvI, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtAlbProPrvI_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtAlbProPrvI_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13420AlbProPrvN));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtAlbProPrvN_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtAlbProPrvN_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13437AlbProSta, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbAlbProSta.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbAlbProSta.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13440AlbProAnul));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbAlbProAnul.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbAlbProAnul.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A13430AlbProDate, "99/99/99"));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtAlbProDate_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtAlbProDate_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A13429AlbProSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtAlbProSal_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtAlbProSal_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13436AlbProIDAT));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtAlbProIDAT_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtAlbProIDAT_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14190AlbProATCU));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtAlbProATCU_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtAlbProATCU_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13438AlbProStAT, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbAlbProStAT.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbAlbProStAT.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A13431AlbProSys, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtAlbProSys_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtAlbProSys_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14376AlbProFm4d));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtAlbProFm4d_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtAlbProFm4d_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13435AlbProEnvA));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A13433AlbProHh);
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A13434AlbProHhCt);
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
      bttBtninsert_Internalname = "BTNINSERT" ;
      edtavAlbproid_Internalname = "vALBPROID" ;
      cmbavAlbproanul.setInternalname( "vALBPROANUL" );
      edtavAlbproprvid_Internalname = "vALBPROPRVID" ;
      edtavAlbprodatefrom_Internalname = "vALBPRODATEFROM" ;
      edtavAlbprodateto_Internalname = "vALBPRODATETO" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtAlbProID_Internalname = "ALBPROID" ;
      edtAlbProPrvI_Internalname = "ALBPROPRVI" ;
      edtAlbProPrvN_Internalname = "ALBPROPRVN" ;
      cmbAlbProSta.setInternalname( "ALBPROSTA" );
      cmbAlbProAnul.setInternalname( "ALBPROANUL" );
      edtAlbProDate_Internalname = "ALBPRODATE" ;
      edtAlbProSal_Internalname = "ALBPROSAL" ;
      edtAlbProIDAT_Internalname = "ALBPROIDAT" ;
      edtAlbProATCU_Internalname = "ALBPROATCU" ;
      cmbAlbProStAT.setInternalname( "ALBPROSTAT" );
      edtAlbProSys_Internalname = "ALBPROSYS" ;
      edtAlbProFm4d_Internalname = "ALBPROFM4D" ;
      edtAlbProEnvA_Internalname = "ALBPROENVA" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtAlbProHh_Internalname = "ALBPROHH" ;
      edtAlbProHhCt_Internalname = "ALBPROHHCT" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Grid_titlescategories_Internalname = "GRID_TITLESCATEGORIES" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_albprosalauxdate_Internalname = "vDDO_ALBPROSALAUXDATE" ;
      divDdo_albprosalauxdates_Internalname = "DDO_ALBPROSALAUXDATES" ;
      edtavDdo_albprosysauxdate_Internalname = "vDDO_ALBPROSYSAUXDATE" ;
      edtavDdo_albprosysauxdateto_Internalname = "vDDO_ALBPROSYSAUXDATETO" ;
      divDdo_albprosysauxdates_Internalname = "DDO_ALBPROSYSAUXDATES" ;
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
      edtAlbProHhCt_Jsonclick = "" ;
      edtAlbProHh_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      edtAlbProEnvA_Jsonclick = "" ;
      edtAlbProFm4d_Jsonclick = "" ;
      edtAlbProFm4d_Columnclass = "WWColumn" ;
      edtAlbProSys_Jsonclick = "" ;
      edtAlbProSys_Columnclass = "WWColumn" ;
      cmbAlbProStAT.setJsonclick( "" );
      cmbAlbProStAT.setColumnClass( "WWColumn" );
      edtAlbProATCU_Jsonclick = "" ;
      edtAlbProATCU_Columnclass = "WWColumn" ;
      edtAlbProIDAT_Jsonclick = "" ;
      edtAlbProIDAT_Columnclass = "WWColumn" ;
      edtAlbProSal_Jsonclick = "" ;
      edtAlbProSal_Columnclass = "WWColumn hidden-xs" ;
      edtAlbProDate_Jsonclick = "" ;
      edtAlbProDate_Columnclass = "WWColumn" ;
      cmbAlbProAnul.setJsonclick( "" );
      cmbAlbProAnul.setColumnClass( "WWColumn" );
      cmbAlbProSta.setJsonclick( "" );
      cmbAlbProSta.setColumnClass( "WWColumn hidden-xs" );
      edtAlbProPrvN_Jsonclick = "" ;
      edtAlbProPrvN_Columnclass = "WWColumn" ;
      edtAlbProPrvI_Jsonclick = "" ;
      edtAlbProPrvI_Columnclass = "WWColumn hidden-xs" ;
      edtAlbProID_Jsonclick = "" ;
      edtAlbProID_Columnclass = "WWColumn" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      cmbavGridactions.setColumnClass( "WWActionGroupColumn" );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtAlbProFm4d_Columnheaderclass = "" ;
      edtAlbProSys_Columnheaderclass = "" ;
      cmbAlbProStAT.setColumnHeaderClass( "" );
      edtAlbProATCU_Columnheaderclass = "" ;
      edtAlbProIDAT_Columnheaderclass = "" ;
      edtAlbProSal_Columnheaderclass = "" ;
      edtAlbProDate_Columnheaderclass = "" ;
      cmbAlbProAnul.setColumnHeaderClass( "" );
      cmbAlbProSta.setColumnHeaderClass( "" );
      edtAlbProPrvN_Columnheaderclass = "" ;
      edtAlbProPrvI_Columnheaderclass = "" ;
      edtAlbProID_Columnheaderclass = "" ;
      cmbavGridactions.setColumnHeaderClass( "" );
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_albprosysauxdateto_Jsonclick = "" ;
      edtavDdo_albprosysauxdate_Jsonclick = "" ;
      edtavDdo_albprosalauxdate_Jsonclick = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavAlbprodateto_Jsonclick = "" ;
      edtavAlbprodateto_Enabled = 1 ;
      edtavAlbprodatefrom_Jsonclick = "" ;
      edtavAlbprodatefrom_Enabled = 1 ;
      edtavAlbproprvid_Jsonclick = "" ;
      edtavAlbproprvid_Enabled = 1 ;
      cmbavAlbproanul.setJsonclick( "" );
      cmbavAlbproanul.setEnabled( 1 );
      edtavAlbproid_Jsonclick = "" ;
      edtavAlbproid_Enabled = 1 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;;;;;Salida;AT;AT;AT;AT;AT;;;;" ;
      Ddo_grid_Datalistproc = "StocksQuimicos.DocumentoTransporteProveedor_1WWGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "|||0:Pdte. Imprimir,1:Imprimido||||||0:Pdte. Envio,3:Enviada AT||" ;
      Ddo_grid_Allowmultipleselection = "|||T||||||T||" ;
      Ddo_grid_Datalisttype = "||Dynamic|FixedValues||||Dynamic|Dynamic|FixedValues||Dynamic" ;
      Ddo_grid_Includedatalist = "||T|T||||T|T|T||T" ;
      Ddo_grid_Filterisrange = "||||||||||T|" ;
      Ddo_grid_Filtertype = "||Character||||Date|Character|Character||Date|Character" ;
      Ddo_grid_Includefilter = "||T||||T|T|T||T|T" ;
      Ddo_grid_Includesortasc = "T|T|T|T|T|T|T|T|T|T|T|" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7|8|9|10|11|12|" ;
      Ddo_grid_Columnids = "1:AlbProID|2:AlbProPrvID|3:AlbProPrvNom|4:AlbProSta|5:AlbProAnulado|6:AlbProDate|7:AlbProSal|8:AlbProIDAT|9:AlbProATCUD|10:AlbProStAT|11:AlbProSys|12:AlbProFm4dig" ;
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
      Form.setCaption( httpContext.getMessage( " Documento Transporte Proveedor", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavAlbproanul.setName( "vALBPROANUL" );
      cmbavAlbproanul.setWebtags( "" );
      cmbavAlbproanul.addItem("T", httpContext.getMessage( "Todas", ""), (short)(0));
      cmbavAlbproanul.addItem("", httpContext.getMessage( "Em preparação ", ""), (short)(0));
      cmbavAlbproanul.addItem("F", httpContext.getMessage( "Finalizado", ""), (short)(0));
      cmbavAlbproanul.addItem("A", httpContext.getMessage( "Anulado", ""), (short)(0));
      if ( cmbavAlbproanul.getItemCount() > 0 )
      {
         AV82AlbProAnul = cmbavAlbproanul.getValidValue(AV82AlbProAnul) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV82AlbProAnul", AV82AlbProAnul);
      }
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_52_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV44GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV44GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44GridActions), 4, 0));
      }
      GXCCtl = "ALBPROSTA_" + sGXsfl_52_idx ;
      cmbAlbProSta.setName( GXCCtl );
      cmbAlbProSta.setWebtags( "" );
      cmbAlbProSta.addItem("0", httpContext.getMessage( "Pdte. Imprimir", ""), (short)(0));
      cmbAlbProSta.addItem("1", httpContext.getMessage( "Imprimido", ""), (short)(0));
      if ( cmbAlbProSta.getItemCount() > 0 )
      {
         A13437AlbProSta = (byte)(GXutil.lval( cmbAlbProSta.getValidValue(GXutil.trim( GXutil.str( A13437AlbProSta, 1, 0))))) ;
      }
      GXCCtl = "ALBPROANUL_" + sGXsfl_52_idx ;
      cmbAlbProAnul.setName( GXCCtl );
      cmbAlbProAnul.setWebtags( "" );
      cmbAlbProAnul.addItem("", httpContext.getMessage( "Em preparação ", ""), (short)(0));
      cmbAlbProAnul.addItem("F", httpContext.getMessage( "Finalizado", ""), (short)(0));
      cmbAlbProAnul.addItem("A", httpContext.getMessage( "Anulado", ""), (short)(0));
      if ( cmbAlbProAnul.getItemCount() > 0 )
      {
         A13440AlbProAnul = cmbAlbProAnul.getValidValue(A13440AlbProAnul) ;
      }
      GXCCtl = "ALBPROSTAT_" + sGXsfl_52_idx ;
      cmbAlbProStAT.setName( GXCCtl );
      cmbAlbProStAT.setWebtags( "" );
      cmbAlbProStAT.addItem("0", httpContext.getMessage( "Pdte. Envio", ""), (short)(0));
      cmbAlbProStAT.addItem("3", httpContext.getMessage( "Enviada AT", ""), (short)(0));
      if ( cmbAlbProStAT.getItemCount() > 0 )
      {
         A13438AlbProStAT = (byte)(GXutil.lval( cmbAlbProStAT.getValidValue(GXutil.trim( GXutil.str( A13438AlbProStAT, 1, 0))))) ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV81AlbProID',fld:'vALBPROID',pic:'ZZZZZZZ9'},{av:'cmbavAlbproanul'},{av:'AV82AlbProAnul',fld:'vALBPROANUL',pic:''},{av:'AV83AlbProPrvID',fld:'vALBPROPRVID',pic:'ZZZZZ9'},{av:'AV84AlbProDatefrom',fld:'vALBPRODATEFROM',pic:''},{av:'AV85AlbProDateto',fld:'vALBPRODATETO',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV47Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'AV90TFAlbProPrvNom',fld:'vTFALBPROPRVNOM',pic:''},{av:'AV91TFAlbProPrvNom_Sel',fld:'vTFALBPROPRVNOM_SEL',pic:''},{av:'AV80TFAlbProSta_Sels',fld:'vTFALBPROSTA_SELS',pic:''},{av:'AV69TFAlbProSal',fld:'vTFALBPROSAL',pic:'99/99/99 99:99'},{av:'AV36TFAlbProIDAT',fld:'vTFALBPROIDAT',pic:''},{av:'AV37TFAlbProIDAT_Sel',fld:'vTFALBPROIDAT_SEL',pic:''},{av:'AV48TFAlbProATCUD',fld:'vTFALBPROATCUD',pic:''},{av:'AV49TFAlbProATCUD_Sel',fld:'vTFALBPROATCUD_SEL',pic:''},{av:'AV72TFAlbProStAT_Sels',fld:'vTFALBPROSTAT_SELS',pic:''},{av:'AV32TFAlbProSys',fld:'vTFALBPROSYS',pic:'99/99/99 99:99'},{av:'AV33TFAlbProSys_To',fld:'vTFALBPROSYS_TO',pic:'99/99/99 99:99'},{av:'AV75TFAlbProFm4dig',fld:'vTFALBPROFM4DIG',pic:''},{av:'AV76TFAlbProFm4dig_Sel',fld:'vTFALBPROFM4DIG_SEL',pic:''},{av:'AV94Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV50Cadena',fld:'vCADENA',pic:'',hsh:true},{av:'AV52Hash',fld:'vHASH',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV42GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV43GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactions'},{av:'edtAlbProID_Columnheaderclass',ctrl:'ALBPROID',prop:'Columnheaderclass'},{av:'edtAlbProPrvI_Columnheaderclass',ctrl:'ALBPROPRVI',prop:'Columnheaderclass'},{av:'edtAlbProPrvN_Columnheaderclass',ctrl:'ALBPROPRVN',prop:'Columnheaderclass'},{av:'cmbAlbProSta'},{av:'cmbAlbProAnul'},{av:'edtAlbProDate_Columnheaderclass',ctrl:'ALBPRODATE',prop:'Columnheaderclass'},{av:'edtAlbProSal_Columnheaderclass',ctrl:'ALBPROSAL',prop:'Columnheaderclass'},{av:'edtAlbProIDAT_Columnheaderclass',ctrl:'ALBPROIDAT',prop:'Columnheaderclass'},{av:'edtAlbProATCU_Columnheaderclass',ctrl:'ALBPROATCU',prop:'Columnheaderclass'},{av:'cmbAlbProStAT'},{av:'edtAlbProSys_Columnheaderclass',ctrl:'ALBPROSYS',prop:'Columnheaderclass'},{av:'edtAlbProFm4d_Columnheaderclass',ctrl:'ALBPROFM4D',prop:'Columnheaderclass'},{av:'AV85AlbProDateto',fld:'vALBPRODATETO',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e111WM2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV81AlbProID',fld:'vALBPROID',pic:'ZZZZZZZ9'},{av:'cmbavAlbproanul'},{av:'AV82AlbProAnul',fld:'vALBPROANUL',pic:''},{av:'AV83AlbProPrvID',fld:'vALBPROPRVID',pic:'ZZZZZ9'},{av:'AV84AlbProDatefrom',fld:'vALBPRODATEFROM',pic:''},{av:'AV85AlbProDateto',fld:'vALBPRODATETO',pic:''},{av:'AV47Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'AV90TFAlbProPrvNom',fld:'vTFALBPROPRVNOM',pic:''},{av:'AV91TFAlbProPrvNom_Sel',fld:'vTFALBPROPRVNOM_SEL',pic:''},{av:'AV80TFAlbProSta_Sels',fld:'vTFALBPROSTA_SELS',pic:''},{av:'AV69TFAlbProSal',fld:'vTFALBPROSAL',pic:'99/99/99 99:99'},{av:'AV36TFAlbProIDAT',fld:'vTFALBPROIDAT',pic:''},{av:'AV37TFAlbProIDAT_Sel',fld:'vTFALBPROIDAT_SEL',pic:''},{av:'AV48TFAlbProATCUD',fld:'vTFALBPROATCUD',pic:''},{av:'AV49TFAlbProATCUD_Sel',fld:'vTFALBPROATCUD_SEL',pic:''},{av:'AV72TFAlbProStAT_Sels',fld:'vTFALBPROSTAT_SELS',pic:''},{av:'AV32TFAlbProSys',fld:'vTFALBPROSYS',pic:'99/99/99 99:99'},{av:'AV33TFAlbProSys_To',fld:'vTFALBPROSYS_TO',pic:'99/99/99 99:99'},{av:'AV75TFAlbProFm4dig',fld:'vTFALBPROFM4DIG',pic:''},{av:'AV76TFAlbProFm4dig_Sel',fld:'vTFALBPROFM4DIG_SEL',pic:''},{av:'AV94Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV50Cadena',fld:'vCADENA',pic:'',hsh:true},{av:'AV52Hash',fld:'vHASH',pic:'',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e121WM2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV81AlbProID',fld:'vALBPROID',pic:'ZZZZZZZ9'},{av:'cmbavAlbproanul'},{av:'AV82AlbProAnul',fld:'vALBPROANUL',pic:''},{av:'AV83AlbProPrvID',fld:'vALBPROPRVID',pic:'ZZZZZ9'},{av:'AV84AlbProDatefrom',fld:'vALBPRODATEFROM',pic:''},{av:'AV85AlbProDateto',fld:'vALBPRODATETO',pic:''},{av:'AV47Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'AV90TFAlbProPrvNom',fld:'vTFALBPROPRVNOM',pic:''},{av:'AV91TFAlbProPrvNom_Sel',fld:'vTFALBPROPRVNOM_SEL',pic:''},{av:'AV80TFAlbProSta_Sels',fld:'vTFALBPROSTA_SELS',pic:''},{av:'AV69TFAlbProSal',fld:'vTFALBPROSAL',pic:'99/99/99 99:99'},{av:'AV36TFAlbProIDAT',fld:'vTFALBPROIDAT',pic:''},{av:'AV37TFAlbProIDAT_Sel',fld:'vTFALBPROIDAT_SEL',pic:''},{av:'AV48TFAlbProATCUD',fld:'vTFALBPROATCUD',pic:''},{av:'AV49TFAlbProATCUD_Sel',fld:'vTFALBPROATCUD_SEL',pic:''},{av:'AV72TFAlbProStAT_Sels',fld:'vTFALBPROSTAT_SELS',pic:''},{av:'AV32TFAlbProSys',fld:'vTFALBPROSYS',pic:'99/99/99 99:99'},{av:'AV33TFAlbProSys_To',fld:'vTFALBPROSYS_TO',pic:'99/99/99 99:99'},{av:'AV75TFAlbProFm4dig',fld:'vTFALBPROFM4DIG',pic:''},{av:'AV76TFAlbProFm4dig_Sel',fld:'vTFALBPROFM4DIG_SEL',pic:''},{av:'AV94Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV50Cadena',fld:'vCADENA',pic:'',hsh:true},{av:'AV52Hash',fld:'vHASH',pic:'',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e131WM2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV81AlbProID',fld:'vALBPROID',pic:'ZZZZZZZ9'},{av:'cmbavAlbproanul'},{av:'AV82AlbProAnul',fld:'vALBPROANUL',pic:''},{av:'AV83AlbProPrvID',fld:'vALBPROPRVID',pic:'ZZZZZ9'},{av:'AV84AlbProDatefrom',fld:'vALBPRODATEFROM',pic:''},{av:'AV85AlbProDateto',fld:'vALBPRODATETO',pic:''},{av:'AV47Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'AV90TFAlbProPrvNom',fld:'vTFALBPROPRVNOM',pic:''},{av:'AV91TFAlbProPrvNom_Sel',fld:'vTFALBPROPRVNOM_SEL',pic:''},{av:'AV80TFAlbProSta_Sels',fld:'vTFALBPROSTA_SELS',pic:''},{av:'AV69TFAlbProSal',fld:'vTFALBPROSAL',pic:'99/99/99 99:99'},{av:'AV36TFAlbProIDAT',fld:'vTFALBPROIDAT',pic:''},{av:'AV37TFAlbProIDAT_Sel',fld:'vTFALBPROIDAT_SEL',pic:''},{av:'AV48TFAlbProATCUD',fld:'vTFALBPROATCUD',pic:''},{av:'AV49TFAlbProATCUD_Sel',fld:'vTFALBPROATCUD_SEL',pic:''},{av:'AV72TFAlbProStAT_Sels',fld:'vTFALBPROSTAT_SELS',pic:''},{av:'AV32TFAlbProSys',fld:'vTFALBPROSYS',pic:'99/99/99 99:99'},{av:'AV33TFAlbProSys_To',fld:'vTFALBPROSYS_TO',pic:'99/99/99 99:99'},{av:'AV75TFAlbProFm4dig',fld:'vTFALBPROFM4DIG',pic:''},{av:'AV76TFAlbProFm4dig_Sel',fld:'vTFALBPROFM4DIG_SEL',pic:''},{av:'AV94Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV50Cadena',fld:'vCADENA',pic:'',hsh:true},{av:'AV52Hash',fld:'vHASH',pic:'',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV75TFAlbProFm4dig',fld:'vTFALBPROFM4DIG',pic:''},{av:'AV76TFAlbProFm4dig_Sel',fld:'vTFALBPROFM4DIG_SEL',pic:''},{av:'AV32TFAlbProSys',fld:'vTFALBPROSYS',pic:'99/99/99 99:99'},{av:'AV33TFAlbProSys_To',fld:'vTFALBPROSYS_TO',pic:'99/99/99 99:99'},{av:'AV71TFAlbProStAT_SelsJson',fld:'vTFALBPROSTAT_SELSJSON',pic:''},{av:'AV72TFAlbProStAT_Sels',fld:'vTFALBPROSTAT_SELS',pic:''},{av:'AV48TFAlbProATCUD',fld:'vTFALBPROATCUD',pic:''},{av:'AV49TFAlbProATCUD_Sel',fld:'vTFALBPROATCUD_SEL',pic:''},{av:'AV36TFAlbProIDAT',fld:'vTFALBPROIDAT',pic:''},{av:'AV37TFAlbProIDAT_Sel',fld:'vTFALBPROIDAT_SEL',pic:''},{av:'AV69TFAlbProSal',fld:'vTFALBPROSAL',pic:'99/99/99 99:99'},{av:'AV79TFAlbProSta_SelsJson',fld:'vTFALBPROSTA_SELSJSON',pic:''},{av:'AV80TFAlbProSta_Sels',fld:'vTFALBPROSTA_SELS',pic:''},{av:'AV90TFAlbProPrvNom',fld:'vTFALBPROPRVNOM',pic:''},{av:'AV91TFAlbProPrvNom_Sel',fld:'vTFALBPROPRVNOM_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e221WM2',iparms:[{av:'cmbAlbProAnul'},{av:'A13440AlbProAnul',fld:'ALBPROANUL',pic:'',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV44GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'edtAlbProID_Columnclass',ctrl:'ALBPROID',prop:'Columnclass'},{av:'edtAlbProPrvI_Columnclass',ctrl:'ALBPROPRVI',prop:'Columnclass'},{av:'edtAlbProPrvN_Columnclass',ctrl:'ALBPROPRVN',prop:'Columnclass'},{av:'cmbAlbProSta'},{av:'cmbAlbProAnul'},{av:'edtAlbProDate_Columnclass',ctrl:'ALBPRODATE',prop:'Columnclass'},{av:'edtAlbProSal_Columnclass',ctrl:'ALBPROSAL',prop:'Columnclass'},{av:'edtAlbProIDAT_Columnclass',ctrl:'ALBPROIDAT',prop:'Columnclass'},{av:'edtAlbProATCU_Columnclass',ctrl:'ALBPROATCU',prop:'Columnclass'},{av:'cmbAlbProStAT'},{av:'edtAlbProSys_Columnclass',ctrl:'ALBPROSYS',prop:'Columnclass'},{av:'edtAlbProFm4d_Columnclass',ctrl:'ALBPROFM4D',prop:'Columnclass'}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e231WM2',iparms:[{av:'cmbavGridactions'},{av:'AV44GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13418AlbProID',fld:'ALBPROID',pic:'ZZZZZZZ9'},{av:'cmbAlbProAnul'},{av:'A13440AlbProAnul',fld:'ALBPROANUL',pic:'',hsh:true},{av:'cmbAlbProStAT'},{av:'A13438AlbProStAT',fld:'ALBPROSTAT',pic:'9',hsh:true},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV81AlbProID',fld:'vALBPROID',pic:'ZZZZZZZ9'},{av:'cmbavAlbproanul'},{av:'AV82AlbProAnul',fld:'vALBPROANUL',pic:''},{av:'AV83AlbProPrvID',fld:'vALBPROPRVID',pic:'ZZZZZ9'},{av:'AV84AlbProDatefrom',fld:'vALBPRODATEFROM',pic:''},{av:'AV85AlbProDateto',fld:'vALBPRODATETO',pic:''},{av:'AV47Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'AV90TFAlbProPrvNom',fld:'vTFALBPROPRVNOM',pic:''},{av:'AV91TFAlbProPrvNom_Sel',fld:'vTFALBPROPRVNOM_SEL',pic:''},{av:'AV80TFAlbProSta_Sels',fld:'vTFALBPROSTA_SELS',pic:''},{av:'AV69TFAlbProSal',fld:'vTFALBPROSAL',pic:'99/99/99 99:99'},{av:'AV36TFAlbProIDAT',fld:'vTFALBPROIDAT',pic:''},{av:'AV37TFAlbProIDAT_Sel',fld:'vTFALBPROIDAT_SEL',pic:''},{av:'AV48TFAlbProATCUD',fld:'vTFALBPROATCUD',pic:''},{av:'AV49TFAlbProATCUD_Sel',fld:'vTFALBPROATCUD_SEL',pic:''},{av:'AV72TFAlbProStAT_Sels',fld:'vTFALBPROSTAT_SELS',pic:''},{av:'AV32TFAlbProSys',fld:'vTFALBPROSYS',pic:'99/99/99 99:99'},{av:'AV33TFAlbProSys_To',fld:'vTFALBPROSYS_TO',pic:'99/99/99 99:99'},{av:'AV75TFAlbProFm4dig',fld:'vTFALBPROFM4DIG',pic:''},{av:'AV76TFAlbProFm4dig_Sel',fld:'vTFALBPROFM4DIG_SEL',pic:''},{av:'AV94Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV50Cadena',fld:'vCADENA',pic:'',hsh:true},{av:'AV52Hash',fld:'vHASH',pic:'',hsh:true},{av:'A13436AlbProIDAT',fld:'ALBPROIDAT',pic:'',hsh:true},{av:'A13431AlbProSys',fld:'ALBPROSYS',pic:'99/99/99 99:99',hsh:true},{av:'A13429AlbProSal',fld:'ALBPROSAL',pic:'99/99/99 99:99',hsh:true},{av:'A13430AlbProDate',fld:'ALBPRODATE',pic:'',hsh:true},{av:'A13419AlbProPrvI',fld:'ALBPROPRVI',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV44GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A13418AlbProID',fld:'ALBPROID',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV42GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV43GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtAlbProID_Columnheaderclass',ctrl:'ALBPROID',prop:'Columnheaderclass'},{av:'edtAlbProPrvI_Columnheaderclass',ctrl:'ALBPROPRVI',prop:'Columnheaderclass'},{av:'edtAlbProPrvN_Columnheaderclass',ctrl:'ALBPROPRVN',prop:'Columnheaderclass'},{av:'cmbAlbProSta'},{av:'cmbAlbProAnul'},{av:'edtAlbProDate_Columnheaderclass',ctrl:'ALBPRODATE',prop:'Columnheaderclass'},{av:'edtAlbProSal_Columnheaderclass',ctrl:'ALBPROSAL',prop:'Columnheaderclass'},{av:'edtAlbProIDAT_Columnheaderclass',ctrl:'ALBPROIDAT',prop:'Columnheaderclass'},{av:'edtAlbProATCU_Columnheaderclass',ctrl:'ALBPROATCU',prop:'Columnheaderclass'},{av:'cmbAlbProStAT'},{av:'edtAlbProSys_Columnheaderclass',ctrl:'ALBPROSYS',prop:'Columnheaderclass'},{av:'edtAlbProFm4d_Columnheaderclass',ctrl:'ALBPROFM4D',prop:'Columnheaderclass'},{av:'AV85AlbProDateto',fld:'vALBPRODATETO',pic:''}]}");
      setEventMetadata("'DOINSERT'","{handler:'e141WM2',iparms:[{av:'AV47Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A13418AlbProID',fld:'ALBPROID',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOINSERT'",",oparms:[]}");
      setEventMetadata("VALBPROPRVID.CONTROLVALUECHANGED","{handler:'e151WM2',iparms:[{av:'AV83AlbProPrvID',fld:'vALBPROPRVID',pic:'ZZZZZ9'},{av:'AV88FilterDocumentoTransporteProveedor_1',fld:'vFILTERDOCUMENTOTRANSPORTEPROVEEDOR_1',pic:''},{av:'AV81AlbProID',fld:'vALBPROID',pic:'ZZZZZZZ9'},{av:'cmbavAlbproanul'},{av:'AV82AlbProAnul',fld:'vALBPROANUL',pic:''},{av:'AV84AlbProDatefrom',fld:'vALBPRODATEFROM',pic:''},{av:'AV85AlbProDateto',fld:'vALBPRODATETO',pic:''}]");
      setEventMetadata("VALBPROPRVID.CONTROLVALUECHANGED",",oparms:[{av:'AV88FilterDocumentoTransporteProveedor_1',fld:'vFILTERDOCUMENTOTRANSPORTEPROVEEDOR_1',pic:''}]}");
      setEventMetadata("VALBPROID.CONTROLVALUECHANGED","{handler:'e161WM2',iparms:[{av:'AV81AlbProID',fld:'vALBPROID',pic:'ZZZZZZZ9'},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'AV83AlbProPrvID',fld:'vALBPROPRVID',pic:'ZZZZZ9'},{av:'AV88FilterDocumentoTransporteProveedor_1',fld:'vFILTERDOCUMENTOTRANSPORTEPROVEEDOR_1',pic:''},{av:'cmbavAlbproanul'},{av:'AV82AlbProAnul',fld:'vALBPROANUL',pic:''},{av:'AV84AlbProDatefrom',fld:'vALBPRODATEFROM',pic:''},{av:'AV85AlbProDateto',fld:'vALBPRODATETO',pic:''}]");
      setEventMetadata("VALBPROID.CONTROLVALUECHANGED",",oparms:[{av:'AV84AlbProDatefrom',fld:'vALBPRODATEFROM',pic:''},{av:'AV85AlbProDateto',fld:'vALBPRODATETO',pic:''},{av:'AV83AlbProPrvID',fld:'vALBPROPRVID',pic:'ZZZZZ9'},{av:'AV88FilterDocumentoTransporteProveedor_1',fld:'vFILTERDOCUMENTOTRANSPORTEPROVEEDOR_1',pic:''}]}");
      setEventMetadata("VALBPRODATEFROM.CONTROLVALUECHANGED","{handler:'e171WM2',iparms:[{av:'AV83AlbProPrvID',fld:'vALBPROPRVID',pic:'ZZZZZ9'},{av:'AV88FilterDocumentoTransporteProveedor_1',fld:'vFILTERDOCUMENTOTRANSPORTEPROVEEDOR_1',pic:''},{av:'AV81AlbProID',fld:'vALBPROID',pic:'ZZZZZZZ9'},{av:'cmbavAlbproanul'},{av:'AV82AlbProAnul',fld:'vALBPROANUL',pic:''},{av:'AV84AlbProDatefrom',fld:'vALBPRODATEFROM',pic:''},{av:'AV85AlbProDateto',fld:'vALBPRODATETO',pic:''}]");
      setEventMetadata("VALBPRODATEFROM.CONTROLVALUECHANGED",",oparms:[{av:'AV88FilterDocumentoTransporteProveedor_1',fld:'vFILTERDOCUMENTOTRANSPORTEPROVEEDOR_1',pic:''}]}");
      setEventMetadata("VALBPRODATETO.CONTROLVALUECHANGED","{handler:'e181WM2',iparms:[{av:'AV83AlbProPrvID',fld:'vALBPROPRVID',pic:'ZZZZZ9'},{av:'AV88FilterDocumentoTransporteProveedor_1',fld:'vFILTERDOCUMENTOTRANSPORTEPROVEEDOR_1',pic:''},{av:'AV81AlbProID',fld:'vALBPROID',pic:'ZZZZZZZ9'},{av:'cmbavAlbproanul'},{av:'AV82AlbProAnul',fld:'vALBPROANUL',pic:''},{av:'AV84AlbProDatefrom',fld:'vALBPRODATEFROM',pic:''},{av:'AV85AlbProDateto',fld:'vALBPRODATETO',pic:''}]");
      setEventMetadata("VALBPRODATETO.CONTROLVALUECHANGED",",oparms:[{av:'AV88FilterDocumentoTransporteProveedor_1',fld:'vFILTERDOCUMENTOTRANSPORTEPROVEEDOR_1',pic:''}]}");
      setEventMetadata("VALBPROANUL.CONTROLVALUECHANGED","{handler:'e191WM2',iparms:[{av:'AV83AlbProPrvID',fld:'vALBPROPRVID',pic:'ZZZZZ9'},{av:'AV88FilterDocumentoTransporteProveedor_1',fld:'vFILTERDOCUMENTOTRANSPORTEPROVEEDOR_1',pic:''},{av:'AV81AlbProID',fld:'vALBPROID',pic:'ZZZZZZZ9'},{av:'cmbavAlbproanul'},{av:'AV82AlbProAnul',fld:'vALBPROANUL',pic:''},{av:'AV84AlbProDatefrom',fld:'vALBPRODATEFROM',pic:''},{av:'AV85AlbProDateto',fld:'vALBPRODATETO',pic:''}]");
      setEventMetadata("VALBPROANUL.CONTROLVALUECHANGED",",oparms:[{av:'AV88FilterDocumentoTransporteProveedor_1',fld:'vFILTERDOCUMENTOTRANSPORTEPROVEEDOR_1',pic:''}]}");
      setEventMetadata("VALID_ALBPROPRVI","{handler:'valid_Albproprvi',iparms:[]");
      setEventMetadata("VALID_ALBPROPRVI",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBPROHH","{handler:'valid_Albprohh',iparms:[]");
      setEventMetadata("VALID_ALBPROHH",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Albprohhct',iparms:[]");
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
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV82AlbProAnul = "" ;
      AV84AlbProDatefrom = GXutil.nullDate() ;
      AV85AlbProDateto = GXutil.nullDate() ;
      AV47Emprcod = "" ;
      Gx_date = GXutil.nullDate() ;
      AV90TFAlbProPrvNom = "" ;
      AV91TFAlbProPrvNom_Sel = "" ;
      AV80TFAlbProSta_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV69TFAlbProSal = GXutil.resetTime( GXutil.nullDate() );
      AV36TFAlbProIDAT = "" ;
      AV37TFAlbProIDAT_Sel = "" ;
      AV48TFAlbProATCUD = "" ;
      AV49TFAlbProATCUD_Sel = "" ;
      AV72TFAlbProStAT_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV32TFAlbProSys = GXutil.resetTime( GXutil.nullDate() );
      AV33TFAlbProSys_To = GXutil.resetTime( GXutil.nullDate() );
      AV75TFAlbProFm4dig = "" ;
      AV76TFAlbProFm4dig_Sel = "" ;
      AV94Pgmname = "" ;
      AV50Cadena = "" ;
      AV52Hash = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV40DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV88FilterDocumentoTransporteProveedor_1 = new app.stocksquimicos.SdtFilterDocumentoTransporteProveedor_1(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_titlescategories_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtninsert_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV70DDO_AlbProSalAuxDate = GXutil.nullDate() ;
      AV34DDO_AlbProSysAuxDate = GXutil.nullDate() ;
      AV35DDO_AlbProSysAuxDateTo = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A13420AlbProPrvN = "" ;
      A13440AlbProAnul = "" ;
      A13430AlbProDate = GXutil.nullDate() ;
      A13429AlbProSal = GXutil.resetTime( GXutil.nullDate() );
      A13436AlbProIDAT = "" ;
      A14190AlbProATCU = "" ;
      A13431AlbProSys = GXutil.resetTime( GXutil.nullDate() );
      A14376AlbProFm4d = "" ;
      A13435AlbProEnvA = "" ;
      A396EmprCod = "" ;
      A13433AlbProHh = "" ;
      A13434AlbProHhCt = "" ;
      AV98Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV104Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      scmdbuf = "" ;
      lV96Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom = "" ;
      lV100Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat = "" ;
      lV102Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud = "" ;
      lV107Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig = "" ;
      AV97Stocksquimicos_documentotransporteproveedor_1wwds_2_tfalbproprvnom_sel = "" ;
      AV96Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom = "" ;
      AV99Stocksquimicos_documentotransporteproveedor_1wwds_4_tfalbprosal = GXutil.resetTime( GXutil.nullDate() );
      AV101Stocksquimicos_documentotransporteproveedor_1wwds_6_tfalbproidat_sel = "" ;
      AV100Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat = "" ;
      AV103Stocksquimicos_documentotransporteproveedor_1wwds_8_tfalbproatcud_sel = "" ;
      AV102Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud = "" ;
      AV105Stocksquimicos_documentotransporteproveedor_1wwds_10_tfalbprosys = GXutil.resetTime( GXutil.nullDate() );
      AV106Stocksquimicos_documentotransporteproveedor_1wwds_11_tfalbprosys_to = GXutil.resetTime( GXutil.nullDate() );
      AV108Stocksquimicos_documentotransporteproveedor_1wwds_13_tfalbprofm4dig_sel = "" ;
      AV107Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig = "" ;
      H01WM2_A13434AlbProHhCt = new String[] {""} ;
      H01WM2_A396EmprCod = new String[] {""} ;
      H01WM2_A13435AlbProEnvA = new String[] {""} ;
      H01WM2_A13431AlbProSys = new java.util.Date[] {GXutil.nullDate()} ;
      H01WM2_A13438AlbProStAT = new byte[1] ;
      H01WM2_A14190AlbProATCU = new String[] {""} ;
      H01WM2_n14190AlbProATCU = new boolean[] {false} ;
      H01WM2_A13436AlbProIDAT = new String[] {""} ;
      H01WM2_A13429AlbProSal = new java.util.Date[] {GXutil.nullDate()} ;
      H01WM2_A13430AlbProDate = new java.util.Date[] {GXutil.nullDate()} ;
      H01WM2_A13440AlbProAnul = new String[] {""} ;
      H01WM2_A13437AlbProSta = new byte[1] ;
      H01WM2_A13420AlbProPrvN = new String[] {""} ;
      H01WM2_n13420AlbProPrvN = new boolean[] {false} ;
      H01WM2_A13419AlbProPrvI = new int[1] ;
      H01WM2_A13418AlbProID = new int[1] ;
      H01WM2_A13433AlbProHh = new String[] {""} ;
      H01WM3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV46Station = "" ;
      AV62EmprNom = "" ;
      AV45UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      GXv_int8 = new byte[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GXv_date10 = new java.util.Date[1] ;
      AV79TFAlbProSta_SelsJson = "" ;
      AV71TFAlbProStAT_SelsJson = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      Gx_msg = "" ;
      AV22Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char13 = "" ;
      GXv_char14 = new String[1] ;
      GXt_char12 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char11 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState15 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      AV89WebSession = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.documentotransporteproveedor_1ww__default(),
         new Object[] {
             new Object[] {
            H01WM2_A13434AlbProHhCt, H01WM2_A396EmprCod, H01WM2_A13435AlbProEnvA, H01WM2_A13431AlbProSys, H01WM2_A13438AlbProStAT, H01WM2_A14190AlbProATCU, H01WM2_n14190AlbProATCU, H01WM2_A13436AlbProIDAT, H01WM2_A13429AlbProSal, H01WM2_A13430AlbProDate,
            H01WM2_A13440AlbProAnul, H01WM2_A13437AlbProSta, H01WM2_A13420AlbProPrvN, H01WM2_n13420AlbProPrvN, H01WM2_A13419AlbProPrvI, H01WM2_A13418AlbProID, H01WM2_A13433AlbProHh
            }
            , new Object[] {
            H01WM3_AGRID_nRecordCount
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV94Pgmname = "StocksQuimicos.DocumentoTransporteProveedor_1WW" ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      AV94Pgmname = "StocksQuimicos.DocumentoTransporteProveedor_1WW" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte A13437AlbProSta ;
   private byte A13438AlbProStAT ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
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
   private short AV44GridActions ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV78FirmaD ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_52 ;
   private int nGXsfl_52_idx=1 ;
   private int AV81AlbProID ;
   private int AV83AlbProPrvID ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavAlbproid_Enabled ;
   private int edtavAlbproprvid_Enabled ;
   private int edtavAlbprodatefrom_Enabled ;
   private int edtavAlbprodateto_Enabled ;
   private int edtavPgmname_Enabled ;
   private int A13418AlbProID ;
   private int A13419AlbProPrvI ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV98Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels_size ;
   private int AV104Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels_size ;
   private int AV41PageToGo ;
   private int AV110GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV42GridCurrentPage ;
   private long AV43GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_52_idx="0001" ;
   private String AV82AlbProAnul ;
   private String AV47Emprcod ;
   private String AV90TFAlbProPrvNom ;
   private String AV91TFAlbProPrvNom_Sel ;
   private String AV36TFAlbProIDAT ;
   private String AV37TFAlbProIDAT_Sel ;
   private String AV48TFAlbProATCUD ;
   private String AV49TFAlbProATCUD_Sel ;
   private String AV75TFAlbProFm4dig ;
   private String AV76TFAlbProFm4dig_Sel ;
   private String AV94Pgmname ;
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
   private String Ddo_grid_Allowmultipleselection ;
   private String Ddo_grid_Datalistfixedvalues ;
   private String Ddo_grid_Datalistproc ;
   private String Grid_titlescategories_Gridinternalname ;
   private String Grid_titlescategories_Gridtitlescategories ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Fixedcolumns ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtninsert_Internalname ;
   private String bttBtninsert_Jsonclick ;
   private String edtavAlbproid_Internalname ;
   private String edtavAlbproid_Jsonclick ;
   private String edtavAlbproprvid_Internalname ;
   private String edtavAlbproprvid_Jsonclick ;
   private String edtavAlbprodatefrom_Internalname ;
   private String edtavAlbprodatefrom_Jsonclick ;
   private String edtavAlbprodateto_Internalname ;
   private String edtavAlbprodateto_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_titlescategories_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_albprosalauxdates_Internalname ;
   private String edtavDdo_albprosalauxdate_Internalname ;
   private String edtavDdo_albprosalauxdate_Jsonclick ;
   private String divDdo_albprosysauxdates_Internalname ;
   private String edtavDdo_albprosysauxdate_Internalname ;
   private String edtavDdo_albprosysauxdate_Jsonclick ;
   private String edtavDdo_albprosysauxdateto_Internalname ;
   private String edtavDdo_albprosysauxdateto_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtAlbProID_Internalname ;
   private String edtAlbProPrvI_Internalname ;
   private String A13420AlbProPrvN ;
   private String edtAlbProPrvN_Internalname ;
   private String A13440AlbProAnul ;
   private String edtAlbProDate_Internalname ;
   private String edtAlbProSal_Internalname ;
   private String A13436AlbProIDAT ;
   private String edtAlbProIDAT_Internalname ;
   private String A14190AlbProATCU ;
   private String edtAlbProATCU_Internalname ;
   private String edtAlbProSys_Internalname ;
   private String A14376AlbProFm4d ;
   private String edtAlbProFm4d_Internalname ;
   private String A13435AlbProEnvA ;
   private String edtAlbProEnvA_Internalname ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String edtAlbProHh_Internalname ;
   private String edtAlbProHhCt_Internalname ;
   private String scmdbuf ;
   private String lV96Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom ;
   private String lV100Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat ;
   private String lV102Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud ;
   private String lV107Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig ;
   private String AV97Stocksquimicos_documentotransporteproveedor_1wwds_2_tfalbproprvnom_sel ;
   private String AV96Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom ;
   private String AV101Stocksquimicos_documentotransporteproveedor_1wwds_6_tfalbproidat_sel ;
   private String AV100Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat ;
   private String AV103Stocksquimicos_documentotransporteproveedor_1wwds_8_tfalbproatcud_sel ;
   private String AV102Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud ;
   private String AV108Stocksquimicos_documentotransporteproveedor_1wwds_13_tfalbprofm4dig_sel ;
   private String AV107Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig ;
   private String hsh ;
   private String AV46Station ;
   private String AV62EmprNom ;
   private String AV45UsurCod ;
   private String edtAlbProID_Columnheaderclass ;
   private String edtAlbProPrvI_Columnheaderclass ;
   private String edtAlbProPrvN_Columnheaderclass ;
   private String edtAlbProDate_Columnheaderclass ;
   private String edtAlbProSal_Columnheaderclass ;
   private String edtAlbProIDAT_Columnheaderclass ;
   private String edtAlbProATCU_Columnheaderclass ;
   private String edtAlbProSys_Columnheaderclass ;
   private String edtAlbProFm4d_Columnheaderclass ;
   private String edtAlbProID_Columnclass ;
   private String edtAlbProPrvI_Columnclass ;
   private String edtAlbProPrvN_Columnclass ;
   private String edtAlbProDate_Columnclass ;
   private String edtAlbProSal_Columnclass ;
   private String edtAlbProIDAT_Columnclass ;
   private String edtAlbProATCU_Columnclass ;
   private String edtAlbProSys_Columnclass ;
   private String edtAlbProFm4d_Columnclass ;
   private String Gx_msg ;
   private String GXt_char13 ;
   private String GXv_char14[] ;
   private String GXt_char12 ;
   private String GXv_char4[] ;
   private String GXt_char11 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTablerightheader_Internalname ;
   private String sGXsfl_52_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtAlbProID_Jsonclick ;
   private String edtAlbProPrvI_Jsonclick ;
   private String edtAlbProPrvN_Jsonclick ;
   private String edtAlbProDate_Jsonclick ;
   private String edtAlbProSal_Jsonclick ;
   private String edtAlbProIDAT_Jsonclick ;
   private String edtAlbProATCU_Jsonclick ;
   private String edtAlbProSys_Jsonclick ;
   private String edtAlbProFm4d_Jsonclick ;
   private String edtAlbProEnvA_Jsonclick ;
   private String edtEmprCod_Jsonclick ;
   private String edtAlbProHh_Jsonclick ;
   private String edtAlbProHhCt_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV69TFAlbProSal ;
   private java.util.Date AV32TFAlbProSys ;
   private java.util.Date AV33TFAlbProSys_To ;
   private java.util.Date A13429AlbProSal ;
   private java.util.Date A13431AlbProSys ;
   private java.util.Date AV99Stocksquimicos_documentotransporteproveedor_1wwds_4_tfalbprosal ;
   private java.util.Date AV105Stocksquimicos_documentotransporteproveedor_1wwds_10_tfalbprosys ;
   private java.util.Date AV106Stocksquimicos_documentotransporteproveedor_1wwds_11_tfalbprosys_to ;
   private java.util.Date AV84AlbProDatefrom ;
   private java.util.Date AV85AlbProDateto ;
   private java.util.Date Gx_date ;
   private java.util.Date AV70DDO_AlbProSalAuxDate ;
   private java.util.Date AV34DDO_AlbProSysAuxDate ;
   private java.util.Date AV35DDO_AlbProSysAuxDateTo ;
   private java.util.Date A13430AlbProDate ;
   private java.util.Date GXv_date10[] ;
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
   private boolean Grid_empowerer_Hascategories ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n13420AlbProPrvN ;
   private boolean n14190AlbProATCU ;
   private boolean bGXsfl_52_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV79TFAlbProSta_SelsJson ;
   private String AV71TFAlbProStAT_SelsJson ;
   private String AV50Cadena ;
   private String AV52Hash ;
   private String A13433AlbProHh ;
   private String A13434AlbProHhCt ;
   private GXSimpleCollection<Byte> AV98Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels ;
   private GXSimpleCollection<Byte> AV104Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels ;
   private GXSimpleCollection<Byte> AV80TFAlbProSta_Sels ;
   private GXSimpleCollection<Byte> AV72TFAlbProStAT_Sels ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private com.genexus.webpanels.WebSession AV89WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavAlbproanul ;
   private HTMLChoice cmbavGridactions ;
   private HTMLChoice cmbAlbProSta ;
   private HTMLChoice cmbAlbProAnul ;
   private HTMLChoice cmbAlbProStAT ;
   private IDataStoreProvider pr_default ;
   private String[] H01WM2_A13434AlbProHhCt ;
   private String[] H01WM2_A396EmprCod ;
   private String[] H01WM2_A13435AlbProEnvA ;
   private java.util.Date[] H01WM2_A13431AlbProSys ;
   private byte[] H01WM2_A13438AlbProStAT ;
   private String[] H01WM2_A14190AlbProATCU ;
   private boolean[] H01WM2_n14190AlbProATCU ;
   private String[] H01WM2_A13436AlbProIDAT ;
   private java.util.Date[] H01WM2_A13429AlbProSal ;
   private java.util.Date[] H01WM2_A13430AlbProDate ;
   private String[] H01WM2_A13440AlbProAnul ;
   private byte[] H01WM2_A13437AlbProSta ;
   private String[] H01WM2_A13420AlbProPrvN ;
   private boolean[] H01WM2_n13420AlbProPrvN ;
   private int[] H01WM2_A13419AlbProPrvI ;
   private int[] H01WM2_A13418AlbProID ;
   private String[] H01WM2_A13433AlbProHh ;
   private long[] H01WM3_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV40DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState15[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.stocksquimicos.SdtFilterDocumentoTransporteProveedor_1 AV88FilterDocumentoTransporteProveedor_1 ;
}

final  class documentotransporteproveedor_1ww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01WM2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A13437AlbProSta ,
                                          GXSimpleCollection<Byte> AV98Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels ,
                                          byte A13438AlbProStAT ,
                                          GXSimpleCollection<Byte> AV104Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels ,
                                          String AV97Stocksquimicos_documentotransporteproveedor_1wwds_2_tfalbproprvnom_sel ,
                                          String AV96Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom ,
                                          int AV98Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels_size ,
                                          java.util.Date AV99Stocksquimicos_documentotransporteproveedor_1wwds_4_tfalbprosal ,
                                          String AV101Stocksquimicos_documentotransporteproveedor_1wwds_6_tfalbproidat_sel ,
                                          String AV100Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat ,
                                          String AV103Stocksquimicos_documentotransporteproveedor_1wwds_8_tfalbproatcud_sel ,
                                          String AV102Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud ,
                                          int AV104Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels_size ,
                                          java.util.Date AV105Stocksquimicos_documentotransporteproveedor_1wwds_10_tfalbprosys ,
                                          java.util.Date AV106Stocksquimicos_documentotransporteproveedor_1wwds_11_tfalbprosys_to ,
                                          String AV108Stocksquimicos_documentotransporteproveedor_1wwds_13_tfalbprofm4dig_sel ,
                                          String AV107Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig ,
                                          int AV81AlbProID ,
                                          int AV83AlbProPrvID ,
                                          java.util.Date AV84AlbProDatefrom ,
                                          java.util.Date AV85AlbProDateto ,
                                          String A13420AlbProPrvN ,
                                          java.util.Date A13429AlbProSal ,
                                          String A13436AlbProIDAT ,
                                          String A14190AlbProATCU ,
                                          java.util.Date A13431AlbProSys ,
                                          String A13433AlbProHh ,
                                          int A13418AlbProID ,
                                          int A13419AlbProPrvI ,
                                          java.util.Date A13430AlbProDate ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String A13440AlbProAnul ,
                                          String AV82AlbProAnul ,
                                          String AV47Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[23];
      Object[] GXv_Object17 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.AlbProHhCt, T1.EmprCod, T1.AlbProEnvA, T1.AlbProSys, T1.AlbProStAT, T1.AlbProATCU, T1.AlbProIDAT, T1.AlbProSal, T1.AlbProDate, T1.AlbProAnul, T1.AlbProSta, T2.PrvNom" ;
      sSelectString += " AS AlbProPrvN, T1.AlbProPrvI AS AlbProPrvI, T1.AlbProID, T1.AlbProHh" ;
      sFromString = " FROM (TXPCALPRO T1 INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.AlbProPrvI)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbProAnul = ? or ? = 'T')");
      if ( (GXutil.strcmp("", AV97Stocksquimicos_documentotransporteproveedor_1wwds_2_tfalbproprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV96Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Stocksquimicos_documentotransporteproveedor_1wwds_2_tfalbproprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNom = ?)");
      }
      else
      {
         GXv_int16[4] = (byte)(1) ;
      }
      if ( AV98Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV98Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels, "T1.AlbProSta IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV99Stocksquimicos_documentotransporteproveedor_1wwds_4_tfalbprosal) )
      {
         addWhere(sWhereString, "(T1.AlbProSal >= ?)");
      }
      else
      {
         GXv_int16[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Stocksquimicos_documentotransporteproveedor_1wwds_6_tfalbproidat_sel)==0) && ( ! (GXutil.strcmp("", AV100Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProIDAT) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Stocksquimicos_documentotransporteproveedor_1wwds_6_tfalbproidat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProIDAT = ?)");
      }
      else
      {
         GXv_int16[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Stocksquimicos_documentotransporteproveedor_1wwds_8_tfalbproatcud_sel)==0) && ( ! (GXutil.strcmp("", AV102Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProATCU) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Stocksquimicos_documentotransporteproveedor_1wwds_8_tfalbproatcud_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProATCU = ?)");
      }
      else
      {
         GXv_int16[9] = (byte)(1) ;
      }
      if ( AV104Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV104Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels, "T1.AlbProStAT IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV105Stocksquimicos_documentotransporteproveedor_1wwds_10_tfalbprosys) )
      {
         addWhere(sWhereString, "(T1.AlbProSys >= ?)");
      }
      else
      {
         GXv_int16[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV106Stocksquimicos_documentotransporteproveedor_1wwds_11_tfalbprosys_to) )
      {
         addWhere(sWhereString, "(T1.AlbProSys <= ?)");
      }
      else
      {
         GXv_int16[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Stocksquimicos_documentotransporteproveedor_1wwds_13_tfalbprofm4dig_sel)==0) && ( ! (GXutil.strcmp("", AV107Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(T1.AlbProHh, 1, 1) || SUBSTR(T1.AlbProHh, 11, 1) || SUBSTR(T1.AlbProHh, 21, 1) || SUBSTR(T1.AlbProHh, 31, 1)) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Stocksquimicos_documentotransporteproveedor_1wwds_13_tfalbprofm4dig_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(T1.AlbProHh, 1, 1) || SUBSTR(T1.AlbProHh, 11, 1) || SUBSTR(T1.AlbProHh, 21, 1) || SUBSTR(T1.AlbProHh, 31, 1) = ?)");
      }
      else
      {
         GXv_int16[13] = (byte)(1) ;
      }
      if ( ! (0==AV81AlbProID) )
      {
         addWhere(sWhereString, "(T1.AlbProID = ?)");
      }
      else
      {
         GXv_int16[14] = (byte)(1) ;
      }
      if ( ! (0==AV83AlbProPrvID) )
      {
         addWhere(sWhereString, "(T1.AlbProPrvI = ?)");
      }
      else
      {
         GXv_int16[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV84AlbProDatefrom)) )
      {
         addWhere(sWhereString, "(T1.AlbProDate >= ?)");
      }
      else
      {
         GXv_int16[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV85AlbProDateto)) )
      {
         addWhere(sWhereString, "(T1.AlbProDate <= ?)");
      }
      else
      {
         GXv_int16[17] = (byte)(1) ;
      }
      if ( AV12OrderedBy == 1 )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.AlbProID DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbProID" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbProID DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbProPrvI" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbProPrvI DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.PrvNom" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.PrvNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbProSta" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbProSta DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbProAnul" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbProAnul DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbProDate" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbProDate DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbProSal" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbProSal DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbProIDAT" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbProIDAT DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbProATCU" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbProATCU DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbProStAT" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbProStAT DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbProSys" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbProSys DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.AlbProID" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
   }

   protected Object[] conditional_H01WM3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A13437AlbProSta ,
                                          GXSimpleCollection<Byte> AV98Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels ,
                                          byte A13438AlbProStAT ,
                                          GXSimpleCollection<Byte> AV104Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels ,
                                          String AV97Stocksquimicos_documentotransporteproveedor_1wwds_2_tfalbproprvnom_sel ,
                                          String AV96Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom ,
                                          int AV98Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels_size ,
                                          java.util.Date AV99Stocksquimicos_documentotransporteproveedor_1wwds_4_tfalbprosal ,
                                          String AV101Stocksquimicos_documentotransporteproveedor_1wwds_6_tfalbproidat_sel ,
                                          String AV100Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat ,
                                          String AV103Stocksquimicos_documentotransporteproveedor_1wwds_8_tfalbproatcud_sel ,
                                          String AV102Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud ,
                                          int AV104Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels_size ,
                                          java.util.Date AV105Stocksquimicos_documentotransporteproveedor_1wwds_10_tfalbprosys ,
                                          java.util.Date AV106Stocksquimicos_documentotransporteproveedor_1wwds_11_tfalbprosys_to ,
                                          String AV108Stocksquimicos_documentotransporteproveedor_1wwds_13_tfalbprofm4dig_sel ,
                                          String AV107Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig ,
                                          int AV81AlbProID ,
                                          int AV83AlbProPrvID ,
                                          java.util.Date AV84AlbProDatefrom ,
                                          java.util.Date AV85AlbProDateto ,
                                          String A13420AlbProPrvN ,
                                          java.util.Date A13429AlbProSal ,
                                          String A13436AlbProIDAT ,
                                          String A14190AlbProATCU ,
                                          java.util.Date A13431AlbProSys ,
                                          String A13433AlbProHh ,
                                          int A13418AlbProID ,
                                          int A13419AlbProPrvI ,
                                          java.util.Date A13430AlbProDate ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String A13440AlbProAnul ,
                                          String AV82AlbProAnul ,
                                          String AV47Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[18];
      Object[] GXv_Object20 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPCALPRO T1 INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.AlbProPrvI)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbProAnul = ? or ? = 'T')");
      if ( (GXutil.strcmp("", AV97Stocksquimicos_documentotransporteproveedor_1wwds_2_tfalbproprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV96Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Stocksquimicos_documentotransporteproveedor_1wwds_2_tfalbproprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNom = ?)");
      }
      else
      {
         GXv_int19[4] = (byte)(1) ;
      }
      if ( AV98Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV98Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels, "T1.AlbProSta IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV99Stocksquimicos_documentotransporteproveedor_1wwds_4_tfalbprosal) )
      {
         addWhere(sWhereString, "(T1.AlbProSal >= ?)");
      }
      else
      {
         GXv_int19[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Stocksquimicos_documentotransporteproveedor_1wwds_6_tfalbproidat_sel)==0) && ( ! (GXutil.strcmp("", AV100Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProIDAT) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Stocksquimicos_documentotransporteproveedor_1wwds_6_tfalbproidat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProIDAT = ?)");
      }
      else
      {
         GXv_int19[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Stocksquimicos_documentotransporteproveedor_1wwds_8_tfalbproatcud_sel)==0) && ( ! (GXutil.strcmp("", AV102Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProATCU) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Stocksquimicos_documentotransporteproveedor_1wwds_8_tfalbproatcud_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProATCU = ?)");
      }
      else
      {
         GXv_int19[9] = (byte)(1) ;
      }
      if ( AV104Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV104Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels, "T1.AlbProStAT IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV105Stocksquimicos_documentotransporteproveedor_1wwds_10_tfalbprosys) )
      {
         addWhere(sWhereString, "(T1.AlbProSys >= ?)");
      }
      else
      {
         GXv_int19[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV106Stocksquimicos_documentotransporteproveedor_1wwds_11_tfalbprosys_to) )
      {
         addWhere(sWhereString, "(T1.AlbProSys <= ?)");
      }
      else
      {
         GXv_int19[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Stocksquimicos_documentotransporteproveedor_1wwds_13_tfalbprofm4dig_sel)==0) && ( ! (GXutil.strcmp("", AV107Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(T1.AlbProHh, 1, 1) || SUBSTR(T1.AlbProHh, 11, 1) || SUBSTR(T1.AlbProHh, 21, 1) || SUBSTR(T1.AlbProHh, 31, 1)) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Stocksquimicos_documentotransporteproveedor_1wwds_13_tfalbprofm4dig_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(T1.AlbProHh, 1, 1) || SUBSTR(T1.AlbProHh, 11, 1) || SUBSTR(T1.AlbProHh, 21, 1) || SUBSTR(T1.AlbProHh, 31, 1) = ?)");
      }
      else
      {
         GXv_int19[13] = (byte)(1) ;
      }
      if ( ! (0==AV81AlbProID) )
      {
         addWhere(sWhereString, "(T1.AlbProID = ?)");
      }
      else
      {
         GXv_int19[14] = (byte)(1) ;
      }
      if ( ! (0==AV83AlbProPrvID) )
      {
         addWhere(sWhereString, "(T1.AlbProPrvI = ?)");
      }
      else
      {
         GXv_int19[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV84AlbProDatefrom)) )
      {
         addWhere(sWhereString, "(T1.AlbProDate >= ?)");
      }
      else
      {
         GXv_int19[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV85AlbProDateto)) )
      {
         addWhere(sWhereString, "(T1.AlbProDate <= ?)");
      }
      else
      {
         GXv_int19[17] = (byte)(1) ;
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
                  return conditional_H01WM2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (String)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Boolean) dynConstraints[31]).booleanValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] );
            case 1 :
                  return conditional_H01WM3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (String)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Boolean) dynConstraints[31]).booleanValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01WM2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01WM3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 20);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(8);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((int[]) buf[15])[0] = rslt.getInt(14);
               ((String[]) buf[16])[0] = rslt.getVarchar(15);
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
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[28], false);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 20);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[33], false);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[34], false);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 4);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[39]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[40]);
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
                  stmt.setString(sIdx, (String)parms[19], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[23], false);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 20);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[28], false);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[29], false);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 4);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[34]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[35]);
               }
               return;
      }
   }

}

