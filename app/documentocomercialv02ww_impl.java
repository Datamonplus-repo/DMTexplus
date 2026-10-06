package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class documentocomercialv02ww_impl extends GXDataArea
{
   public documentocomercialv02ww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public documentocomercialv02ww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentocomercialv02ww_impl.class ));
   }

   public documentocomercialv02ww_impl( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavAlbcompri = new HTMLChoice();
      cmbavGridactions = new HTMLChoice();
      cmbAlbComEAT = new HTMLChoice();
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
      nRC_GXsfl_34 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_34"))) ;
      nGXsfl_34_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_34_idx"))) ;
      sGXsfl_34_idx = httpContext.GetPar( "sGXsfl_34_idx") ;
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
      cmbavAlbcompri.fromJSonString( httpContext.GetNextPar( ));
      AV55AlbComPri = httpContext.GetPar( "AlbComPri") ;
      AV29TFAlbComFch_To = localUtil.parseDateParm( httpContext.GetPar( "TFAlbComFch_To")) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      AV26TFAlbComCod = (int)(GXutil.lval( httpContext.GetPar( "TFAlbComCod"))) ;
      AV27TFAlbComCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFAlbComCod_To"))) ;
      AV34TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV35TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV36TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV37TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV28TFAlbComFch = localUtil.parseDateParm( httpContext.GetPar( "TFAlbComFch")) ;
      AV42TFAlbComHor = localUtil.parseDTimeParm( httpContext.GetPar( "TFAlbComHor")) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV60TFAlbComEAT_Sels);
      AV63TFAlbComID = httpContext.GetPar( "TFAlbComID") ;
      AV64TFAlbComID_Sel = httpContext.GetPar( "TFAlbComID_Sel") ;
      AV65TFAlbComAT = httpContext.GetPar( "TFAlbComAT") ;
      AV66TFAlbComAT_Sel = httpContext.GetPar( "TFAlbComAT_Sel") ;
      AV61TFAlbComATCUD = httpContext.GetPar( "TFAlbComATCUD") ;
      AV62TFAlbComATCUD_Sel = httpContext.GetPar( "TFAlbComATCUD_Sel") ;
      AV67TFAlbComSt = httpContext.GetPar( "TFAlbComSt") ;
      AV68TFAlbComSt_Sel = httpContext.GetPar( "TFAlbComSt_Sel") ;
      AV69TFAlbComFs = localUtil.parseDTimeParm( httpContext.GetPar( "TFAlbComFs")) ;
      AV73TFAlbComFdD = httpContext.GetPar( "TFAlbComFdD") ;
      AV74TFAlbComFdD_Sel = httpContext.GetPar( "TFAlbComFdD_Sel") ;
      AV83Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV75Emprcod = httpContext.GetPar( "Emprcod") ;
      A16AlbComEst = (byte)(GXutil.lval( httpContext.GetPar( "AlbComEst"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV55AlbComPri, AV29TFAlbComFch_To, A396EmprCod, AV26TFAlbComCod, AV27TFAlbComCod_To, AV34TFCliCod, AV35TFCliCod_To, AV36TFCliNom, AV37TFCliNom_Sel, AV28TFAlbComFch, AV42TFAlbComHor, AV60TFAlbComEAT_Sels, AV63TFAlbComID, AV64TFAlbComID_Sel, AV65TFAlbComAT, AV66TFAlbComAT_Sel, AV61TFAlbComATCUD, AV62TFAlbComATCUD_Sel, AV67TFAlbComSt, AV68TFAlbComSt_Sel, AV69TFAlbComFs, AV73TFAlbComFdD, AV74TFAlbComFdD_Sel, AV83Pgmname, AV12OrderedBy, AV13OrderedDsc, AV75Emprcod, A16AlbComEst) ;
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
      pa1772( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1772( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.documentocomercialv02ww", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBCOMEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A16AlbComEst), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV75Emprcod, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"DocumentoComercialv02WW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV83Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("documentocomercialv02ww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vALBCOMPRI", GXutil.rtrim( AV55AlbComPri));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_34", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_34, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV52GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV53GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV50DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV50DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOMCOD", GXutil.ltrim( localUtil.ntoc( AV26TFAlbComCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOMCOD_TO", GXutil.ltrim( localUtil.ntoc( AV27TFAlbComCod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV34TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV35TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM", GXutil.rtrim( AV36TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM_SEL", GXutil.rtrim( AV37TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOMFCH", localUtil.dtoc( AV28TFAlbComFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOMHOR", localUtil.ttoc( AV42TFAlbComHor, 10, 8, 0, 0, "/", ":", " "));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFALBCOMEAT_SELS", AV60TFAlbComEAT_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFALBCOMEAT_SELS", AV60TFAlbComEAT_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOMID", GXutil.rtrim( AV63TFAlbComID));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOMID_SEL", GXutil.rtrim( AV64TFAlbComID_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOMAT", GXutil.rtrim( AV65TFAlbComAT));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOMAT_SEL", GXutil.rtrim( AV66TFAlbComAT_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOMATCUD", GXutil.rtrim( AV61TFAlbComATCUD));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOMATCUD_SEL", GXutil.rtrim( AV62TFAlbComATCUD_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOMST", GXutil.rtrim( AV67TFAlbComSt));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOMST_SEL", GXutil.rtrim( AV68TFAlbComSt_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOMFS", localUtil.ttoc( AV69TFAlbComFs, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOMFDD", GXutil.rtrim( AV73TFAlbComFdD));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOMFDD_SEL", GXutil.rtrim( AV74TFAlbComFdD_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMEST", GXutil.ltrim( localUtil.ntoc( A16AlbComEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBCOMEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A16AlbComEst), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV75Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV75Emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOMFCH_TO", localUtil.dtoc( AV29TFAlbComFch_To, 0, "/"));
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
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
         we1772( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1772( ) ;
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
      return formatLink("app.documentocomercialv02ww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "DocumentoComercialv02WW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Documento Comercial (v02)", "") ;
   }

   public void wb1770( )
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
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableactions_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 34, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoComercialv02WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+cmbavAlbcompri.getInternalname()+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'" + sGXsfl_34_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavAlbcompri, cmbavAlbcompri.getInternalname(), GXutil.rtrim( AV55AlbComPri), 1, cmbavAlbcompri.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavAlbcompri.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,21);\"", "", true, (byte)(0), "HLP_DocumentoComercialv02WW.htm");
         cmbavAlbcompri.setValue( GXutil.rtrim( AV55AlbComPri) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlbcompri.getInternalname(), "Values", cmbavAlbcompri.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_1772( true) ;
      }
      else
      {
         wb_table1_23_1772( false) ;
      }
      return  ;
   }

   public void wb_table1_23_1772e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         startgridcontrol34( ) ;
      }
      if ( wbEnd == 34 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_34 = (int)(nGXsfl_34_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV52GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV53GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV83Pgmname), GXutil.rtrim( localUtil.format( AV83Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoComercialv02WW.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV50DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_albcomfchauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'" + sGXsfl_34_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_albcomfchauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_albcomfchauxdate_Internalname, localUtil.format(AV30DDO_AlbComFchAuxDate, "99/99/99"), localUtil.format( AV30DDO_AlbComFchAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_albcomfchauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoComercialv02WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_albcomfchauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_DocumentoComercialv02WW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_albcomhorauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_34_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_albcomhorauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_albcomhorauxdate_Internalname, localUtil.format(AV44DDO_AlbComHorAuxDate, "99/99/99"), localUtil.format( AV44DDO_AlbComHorAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,67);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_albcomhorauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoComercialv02WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_albcomhorauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_DocumentoComercialv02WW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_albcomfsauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'" + sGXsfl_34_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_albcomfsauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_albcomfsauxdate_Internalname, localUtil.format(AV71DDO_AlbComFsAuxDate, "99/99/99"), localUtil.format( AV71DDO_AlbComFsAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_albcomfsauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoComercialv02WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_albcomfsauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_DocumentoComercialv02WW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 34 )
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

   public void start1772( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Documento Comercial (v02)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1770( ) ;
   }

   public void ws1772( )
   {
      start1772( ) ;
      evt1772( ) ;
   }

   public void evt1772( )
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
                           e111772 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121772 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131772 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e141772 ();
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
                           nGXsfl_34_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_34_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_34_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_342( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV54GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54GridActions), 4, 0));
                           A14AlbComCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbComCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A17AlbComFch = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtAlbComFch_Internalname), 0)) ;
                           A4829AlbComHor = localUtil.ctot( httpContext.cgiGet( edtAlbComHor_Internalname), 0) ;
                           cmbAlbComEAT.setName( cmbAlbComEAT.getInternalname() );
                           cmbAlbComEAT.setValue( httpContext.cgiGet( cmbAlbComEAT.getInternalname()) );
                           A10739AlbComEAT = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbComEAT.getInternalname()))) ;
                           A10740AlbComID = httpContext.cgiGet( edtAlbComID_Internalname) ;
                           A10764AlbComAT = httpContext.cgiGet( edtAlbComAT_Internalname) ;
                           A22AlbComPri = httpContext.cgiGet( edtAlbComPri_Internalname) ;
                           A14248AlbComATCU = httpContext.cgiGet( edtAlbComATCU_Internalname) ;
                           A10738AlbComSt = httpContext.cgiGet( edtAlbComSt_Internalname) ;
                           A10013AlbComFs = localUtil.ctot( httpContext.cgiGet( edtAlbComFs_Internalname), 0) ;
                           A10015AlbComFdD = httpContext.cgiGet( edtAlbComFdD_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e151772 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e161772 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e171772 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e181772 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Albcompri Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vALBCOMPRI"), AV55AlbComPri) != 0 )
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

   public void we1772( )
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

   public void pa1772( )
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
            GX_FocusControl = cmbavAlbcompri.getInternalname() ;
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
      subsflControlProps_342( ) ;
      while ( nGXsfl_34_idx <= nRC_GXsfl_34 )
      {
         sendrow_342( ) ;
         nGXsfl_34_idx = ((subGrid_Islastpage==1)&&(nGXsfl_34_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_34_idx+1) ;
         sGXsfl_34_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_34_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_342( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV55AlbComPri ,
                                 java.util.Date AV29TFAlbComFch_To ,
                                 String A396EmprCod ,
                                 int AV26TFAlbComCod ,
                                 int AV27TFAlbComCod_To ,
                                 int AV34TFCliCod ,
                                 int AV35TFCliCod_To ,
                                 String AV36TFCliNom ,
                                 String AV37TFCliNom_Sel ,
                                 java.util.Date AV28TFAlbComFch ,
                                 java.util.Date AV42TFAlbComHor ,
                                 GXSimpleCollection<Byte> AV60TFAlbComEAT_Sels ,
                                 String AV63TFAlbComID ,
                                 String AV64TFAlbComID_Sel ,
                                 String AV65TFAlbComAT ,
                                 String AV66TFAlbComAT_Sel ,
                                 String AV61TFAlbComATCUD ,
                                 String AV62TFAlbComATCUD_Sel ,
                                 String AV67TFAlbComSt ,
                                 String AV68TFAlbComSt_Sel ,
                                 java.util.Date AV69TFAlbComFs ,
                                 String AV73TFAlbComFdD ,
                                 String AV74TFAlbComFdD_Sel ,
                                 String AV83Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 String AV75Emprcod ,
                                 byte A16AlbComEst )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e161772 ();
      GRID_nCurrentRecord = 0 ;
      rf1772( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"DocumentoComercialv02WW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV83Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("documentocomercialv02ww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBCOMPRI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A22AlbComPri, "9"))));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMPRI", GXutil.rtrim( A22AlbComPri));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBCOMEAT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A10739AlbComEAT), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMEAT", GXutil.ltrim( localUtil.ntoc( A10739AlbComEAT, (byte)(1), (byte)(0), ".", "")));
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
      if ( cmbavAlbcompri.getItemCount() > 0 )
      {
         AV55AlbComPri = cmbavAlbcompri.getValidValue(AV55AlbComPri) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV55AlbComPri", AV55AlbComPri);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavAlbcompri.setValue( GXutil.rtrim( AV55AlbComPri) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlbcompri.getInternalname(), "Values", cmbavAlbcompri.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1772( ) ;
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
      AV83Pgmname = "DocumentoComercialv02WW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV83Pgmname", AV83Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1772( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(34) ;
      /* Execute user event: Refresh */
      e161772 ();
      nGXsfl_34_idx = 1 ;
      sGXsfl_34_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_34_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_342( ) ;
      bGXsfl_34_Refreshing = true ;
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
         subsflControlProps_342( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Byte.valueOf(A10739AlbComEAT) ,
                                              AV93Documentocomercialv02wwds_9_tfalbcomeat_sels ,
                                              Integer.valueOf(AV85Documentocomercialv02wwds_1_tfalbcomcod) ,
                                              Integer.valueOf(AV86Documentocomercialv02wwds_2_tfalbcomcod_to) ,
                                              Integer.valueOf(AV87Documentocomercialv02wwds_3_tfclicod) ,
                                              Integer.valueOf(AV88Documentocomercialv02wwds_4_tfclicod_to) ,
                                              AV90Documentocomercialv02wwds_6_tfclinom_sel ,
                                              AV89Documentocomercialv02wwds_5_tfclinom ,
                                              AV91Documentocomercialv02wwds_7_tfalbcomfch ,
                                              AV92Documentocomercialv02wwds_8_tfalbcomhor ,
                                              Integer.valueOf(AV93Documentocomercialv02wwds_9_tfalbcomeat_sels.size()) ,
                                              AV95Documentocomercialv02wwds_11_tfalbcomid_sel ,
                                              AV94Documentocomercialv02wwds_10_tfalbcomid ,
                                              AV97Documentocomercialv02wwds_13_tfalbcomat_sel ,
                                              AV96Documentocomercialv02wwds_12_tfalbcomat ,
                                              AV99Documentocomercialv02wwds_15_tfalbcomatcud_sel ,
                                              AV98Documentocomercialv02wwds_14_tfalbcomatcud ,
                                              AV101Documentocomercialv02wwds_17_tfalbcomst_sel ,
                                              AV100Documentocomercialv02wwds_16_tfalbcomst ,
                                              AV102Documentocomercialv02wwds_18_tfalbcomfs ,
                                              AV104Documentocomercialv02wwds_20_tfalbcomfdd_sel ,
                                              AV103Documentocomercialv02wwds_19_tfalbcomfdd ,
                                              AV28TFAlbComFch ,
                                              AV29TFAlbComFch_To ,
                                              Integer.valueOf(A14AlbComCod) ,
                                              Integer.valueOf(A252CliCod) ,
                                              A279CliNom ,
                                              A17AlbComFch ,
                                              A4829AlbComHor ,
                                              A10740AlbComID ,
                                              A10764AlbComAT ,
                                              A14248AlbComATCU ,
                                              A10738AlbComSt ,
                                              A10013AlbComFs ,
                                              A10015AlbComFdD ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              A22AlbComPri ,
                                              AV55AlbComPri ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV89Documentocomercialv02wwds_5_tfclinom = GXutil.padr( GXutil.rtrim( AV89Documentocomercialv02wwds_5_tfclinom), 30, "%") ;
         lV94Documentocomercialv02wwds_10_tfalbcomid = GXutil.padr( GXutil.rtrim( AV94Documentocomercialv02wwds_10_tfalbcomid), 20, "%") ;
         lV96Documentocomercialv02wwds_12_tfalbcomat = GXutil.padr( GXutil.rtrim( AV96Documentocomercialv02wwds_12_tfalbcomat), 1, "%") ;
         lV98Documentocomercialv02wwds_14_tfalbcomatcud = GXutil.padr( GXutil.rtrim( AV98Documentocomercialv02wwds_14_tfalbcomatcud), 20, "%") ;
         lV100Documentocomercialv02wwds_16_tfalbcomst = GXutil.padr( GXutil.rtrim( AV100Documentocomercialv02wwds_16_tfalbcomst), 1, "%") ;
         lV103Documentocomercialv02wwds_19_tfalbcomfdd = GXutil.padr( GXutil.rtrim( AV103Documentocomercialv02wwds_19_tfalbcomfdd), 200, "%") ;
         /* Using cursor H01772 */
         pr_default.execute(0, new Object[] {A396EmprCod, AV55AlbComPri, Integer.valueOf(AV85Documentocomercialv02wwds_1_tfalbcomcod), Integer.valueOf(AV86Documentocomercialv02wwds_2_tfalbcomcod_to), Integer.valueOf(AV87Documentocomercialv02wwds_3_tfclicod), Integer.valueOf(AV88Documentocomercialv02wwds_4_tfclicod_to), lV89Documentocomercialv02wwds_5_tfclinom, AV90Documentocomercialv02wwds_6_tfclinom_sel, AV91Documentocomercialv02wwds_7_tfalbcomfch, AV92Documentocomercialv02wwds_8_tfalbcomhor, lV94Documentocomercialv02wwds_10_tfalbcomid, AV95Documentocomercialv02wwds_11_tfalbcomid_sel, lV96Documentocomercialv02wwds_12_tfalbcomat, AV97Documentocomercialv02wwds_13_tfalbcomat_sel, lV98Documentocomercialv02wwds_14_tfalbcomatcud, AV99Documentocomercialv02wwds_15_tfalbcomatcud_sel, lV100Documentocomercialv02wwds_16_tfalbcomst, AV101Documentocomercialv02wwds_17_tfalbcomst_sel, AV102Documentocomercialv02wwds_18_tfalbcomfs, lV103Documentocomercialv02wwds_19_tfalbcomfdd, AV104Documentocomercialv02wwds_20_tfalbcomfdd_sel, AV28TFAlbComFch, AV29TFAlbComFch_To, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_34_idx = 1 ;
         sGXsfl_34_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_34_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_342( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A16AlbComEst = H01772_A16AlbComEst[0] ;
            A10015AlbComFdD = H01772_A10015AlbComFdD[0] ;
            A10013AlbComFs = H01772_A10013AlbComFs[0] ;
            A10738AlbComSt = H01772_A10738AlbComSt[0] ;
            A14248AlbComATCU = H01772_A14248AlbComATCU[0] ;
            A22AlbComPri = H01772_A22AlbComPri[0] ;
            A10764AlbComAT = H01772_A10764AlbComAT[0] ;
            A10740AlbComID = H01772_A10740AlbComID[0] ;
            A10739AlbComEAT = H01772_A10739AlbComEAT[0] ;
            A4829AlbComHor = H01772_A4829AlbComHor[0] ;
            A17AlbComFch = H01772_A17AlbComFch[0] ;
            A279CliNom = H01772_A279CliNom[0] ;
            A252CliCod = H01772_A252CliCod[0] ;
            A14AlbComCod = H01772_A14AlbComCod[0] ;
            A279CliNom = H01772_A279CliNom[0] ;
            e171772 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(34) ;
         wb1770( ) ;
      }
      bGXsfl_34_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1772( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBCOMPRI"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( A22AlbComPri, "9"))));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMEST", GXutil.ltrim( localUtil.ntoc( A16AlbComEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBCOMEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A16AlbComEst), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBCOMEAT"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, localUtil.format( DecimalUtil.doubleToDec(A10739AlbComEAT), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV75Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV75Emprcod, "@!"))));
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
      AV85Documentocomercialv02wwds_1_tfalbcomcod = AV26TFAlbComCod ;
      AV86Documentocomercialv02wwds_2_tfalbcomcod_to = AV27TFAlbComCod_To ;
      AV87Documentocomercialv02wwds_3_tfclicod = AV34TFCliCod ;
      AV88Documentocomercialv02wwds_4_tfclicod_to = AV35TFCliCod_To ;
      AV89Documentocomercialv02wwds_5_tfclinom = AV36TFCliNom ;
      AV90Documentocomercialv02wwds_6_tfclinom_sel = AV37TFCliNom_Sel ;
      AV91Documentocomercialv02wwds_7_tfalbcomfch = AV28TFAlbComFch ;
      AV92Documentocomercialv02wwds_8_tfalbcomhor = AV42TFAlbComHor ;
      AV93Documentocomercialv02wwds_9_tfalbcomeat_sels = AV60TFAlbComEAT_Sels ;
      AV94Documentocomercialv02wwds_10_tfalbcomid = AV63TFAlbComID ;
      AV95Documentocomercialv02wwds_11_tfalbcomid_sel = AV64TFAlbComID_Sel ;
      AV96Documentocomercialv02wwds_12_tfalbcomat = AV65TFAlbComAT ;
      AV97Documentocomercialv02wwds_13_tfalbcomat_sel = AV66TFAlbComAT_Sel ;
      AV98Documentocomercialv02wwds_14_tfalbcomatcud = AV61TFAlbComATCUD ;
      AV99Documentocomercialv02wwds_15_tfalbcomatcud_sel = AV62TFAlbComATCUD_Sel ;
      AV100Documentocomercialv02wwds_16_tfalbcomst = AV67TFAlbComSt ;
      AV101Documentocomercialv02wwds_17_tfalbcomst_sel = AV68TFAlbComSt_Sel ;
      AV102Documentocomercialv02wwds_18_tfalbcomfs = AV69TFAlbComFs ;
      AV103Documentocomercialv02wwds_19_tfalbcomfdd = AV73TFAlbComFdD ;
      AV104Documentocomercialv02wwds_20_tfalbcomfdd_sel = AV74TFAlbComFdD_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(A10739AlbComEAT) ,
                                           AV93Documentocomercialv02wwds_9_tfalbcomeat_sels ,
                                           Integer.valueOf(AV85Documentocomercialv02wwds_1_tfalbcomcod) ,
                                           Integer.valueOf(AV86Documentocomercialv02wwds_2_tfalbcomcod_to) ,
                                           Integer.valueOf(AV87Documentocomercialv02wwds_3_tfclicod) ,
                                           Integer.valueOf(AV88Documentocomercialv02wwds_4_tfclicod_to) ,
                                           AV90Documentocomercialv02wwds_6_tfclinom_sel ,
                                           AV89Documentocomercialv02wwds_5_tfclinom ,
                                           AV91Documentocomercialv02wwds_7_tfalbcomfch ,
                                           AV92Documentocomercialv02wwds_8_tfalbcomhor ,
                                           Integer.valueOf(AV93Documentocomercialv02wwds_9_tfalbcomeat_sels.size()) ,
                                           AV95Documentocomercialv02wwds_11_tfalbcomid_sel ,
                                           AV94Documentocomercialv02wwds_10_tfalbcomid ,
                                           AV97Documentocomercialv02wwds_13_tfalbcomat_sel ,
                                           AV96Documentocomercialv02wwds_12_tfalbcomat ,
                                           AV99Documentocomercialv02wwds_15_tfalbcomatcud_sel ,
                                           AV98Documentocomercialv02wwds_14_tfalbcomatcud ,
                                           AV101Documentocomercialv02wwds_17_tfalbcomst_sel ,
                                           AV100Documentocomercialv02wwds_16_tfalbcomst ,
                                           AV102Documentocomercialv02wwds_18_tfalbcomfs ,
                                           AV104Documentocomercialv02wwds_20_tfalbcomfdd_sel ,
                                           AV103Documentocomercialv02wwds_19_tfalbcomfdd ,
                                           AV28TFAlbComFch ,
                                           AV29TFAlbComFch_To ,
                                           Integer.valueOf(A14AlbComCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A17AlbComFch ,
                                           A4829AlbComHor ,
                                           A10740AlbComID ,
                                           A10764AlbComAT ,
                                           A14248AlbComATCU ,
                                           A10738AlbComSt ,
                                           A10013AlbComFs ,
                                           A10015AlbComFdD ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           A22AlbComPri ,
                                           AV55AlbComPri ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV89Documentocomercialv02wwds_5_tfclinom = GXutil.padr( GXutil.rtrim( AV89Documentocomercialv02wwds_5_tfclinom), 30, "%") ;
      lV94Documentocomercialv02wwds_10_tfalbcomid = GXutil.padr( GXutil.rtrim( AV94Documentocomercialv02wwds_10_tfalbcomid), 20, "%") ;
      lV96Documentocomercialv02wwds_12_tfalbcomat = GXutil.padr( GXutil.rtrim( AV96Documentocomercialv02wwds_12_tfalbcomat), 1, "%") ;
      lV98Documentocomercialv02wwds_14_tfalbcomatcud = GXutil.padr( GXutil.rtrim( AV98Documentocomercialv02wwds_14_tfalbcomatcud), 20, "%") ;
      lV100Documentocomercialv02wwds_16_tfalbcomst = GXutil.padr( GXutil.rtrim( AV100Documentocomercialv02wwds_16_tfalbcomst), 1, "%") ;
      lV103Documentocomercialv02wwds_19_tfalbcomfdd = GXutil.padr( GXutil.rtrim( AV103Documentocomercialv02wwds_19_tfalbcomfdd), 200, "%") ;
      /* Using cursor H01773 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV55AlbComPri, Integer.valueOf(AV85Documentocomercialv02wwds_1_tfalbcomcod), Integer.valueOf(AV86Documentocomercialv02wwds_2_tfalbcomcod_to), Integer.valueOf(AV87Documentocomercialv02wwds_3_tfclicod), Integer.valueOf(AV88Documentocomercialv02wwds_4_tfclicod_to), lV89Documentocomercialv02wwds_5_tfclinom, AV90Documentocomercialv02wwds_6_tfclinom_sel, AV91Documentocomercialv02wwds_7_tfalbcomfch, AV92Documentocomercialv02wwds_8_tfalbcomhor, lV94Documentocomercialv02wwds_10_tfalbcomid, AV95Documentocomercialv02wwds_11_tfalbcomid_sel, lV96Documentocomercialv02wwds_12_tfalbcomat, AV97Documentocomercialv02wwds_13_tfalbcomat_sel, lV98Documentocomercialv02wwds_14_tfalbcomatcud, AV99Documentocomercialv02wwds_15_tfalbcomatcud_sel, lV100Documentocomercialv02wwds_16_tfalbcomst, AV101Documentocomercialv02wwds_17_tfalbcomst_sel, AV102Documentocomercialv02wwds_18_tfalbcomfs, lV103Documentocomercialv02wwds_19_tfalbcomfdd, AV104Documentocomercialv02wwds_20_tfalbcomfdd_sel, AV28TFAlbComFch, AV29TFAlbComFch_To});
      GRID_nRecordCount = H01773_AGRID_nRecordCount[0] ;
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
      AV85Documentocomercialv02wwds_1_tfalbcomcod = AV26TFAlbComCod ;
      AV86Documentocomercialv02wwds_2_tfalbcomcod_to = AV27TFAlbComCod_To ;
      AV87Documentocomercialv02wwds_3_tfclicod = AV34TFCliCod ;
      AV88Documentocomercialv02wwds_4_tfclicod_to = AV35TFCliCod_To ;
      AV89Documentocomercialv02wwds_5_tfclinom = AV36TFCliNom ;
      AV90Documentocomercialv02wwds_6_tfclinom_sel = AV37TFCliNom_Sel ;
      AV91Documentocomercialv02wwds_7_tfalbcomfch = AV28TFAlbComFch ;
      AV92Documentocomercialv02wwds_8_tfalbcomhor = AV42TFAlbComHor ;
      AV93Documentocomercialv02wwds_9_tfalbcomeat_sels = AV60TFAlbComEAT_Sels ;
      AV94Documentocomercialv02wwds_10_tfalbcomid = AV63TFAlbComID ;
      AV95Documentocomercialv02wwds_11_tfalbcomid_sel = AV64TFAlbComID_Sel ;
      AV96Documentocomercialv02wwds_12_tfalbcomat = AV65TFAlbComAT ;
      AV97Documentocomercialv02wwds_13_tfalbcomat_sel = AV66TFAlbComAT_Sel ;
      AV98Documentocomercialv02wwds_14_tfalbcomatcud = AV61TFAlbComATCUD ;
      AV99Documentocomercialv02wwds_15_tfalbcomatcud_sel = AV62TFAlbComATCUD_Sel ;
      AV100Documentocomercialv02wwds_16_tfalbcomst = AV67TFAlbComSt ;
      AV101Documentocomercialv02wwds_17_tfalbcomst_sel = AV68TFAlbComSt_Sel ;
      AV102Documentocomercialv02wwds_18_tfalbcomfs = AV69TFAlbComFs ;
      AV103Documentocomercialv02wwds_19_tfalbcomfdd = AV73TFAlbComFdD ;
      AV104Documentocomercialv02wwds_20_tfalbcomfdd_sel = AV74TFAlbComFdD_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV55AlbComPri, AV29TFAlbComFch_To, A396EmprCod, AV26TFAlbComCod, AV27TFAlbComCod_To, AV34TFCliCod, AV35TFCliCod_To, AV36TFCliNom, AV37TFCliNom_Sel, AV28TFAlbComFch, AV42TFAlbComHor, AV60TFAlbComEAT_Sels, AV63TFAlbComID, AV64TFAlbComID_Sel, AV65TFAlbComAT, AV66TFAlbComAT_Sel, AV61TFAlbComATCUD, AV62TFAlbComATCUD_Sel, AV67TFAlbComSt, AV68TFAlbComSt_Sel, AV69TFAlbComFs, AV73TFAlbComFdD, AV74TFAlbComFdD_Sel, AV83Pgmname, AV12OrderedBy, AV13OrderedDsc, AV75Emprcod, A16AlbComEst) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV85Documentocomercialv02wwds_1_tfalbcomcod = AV26TFAlbComCod ;
      AV86Documentocomercialv02wwds_2_tfalbcomcod_to = AV27TFAlbComCod_To ;
      AV87Documentocomercialv02wwds_3_tfclicod = AV34TFCliCod ;
      AV88Documentocomercialv02wwds_4_tfclicod_to = AV35TFCliCod_To ;
      AV89Documentocomercialv02wwds_5_tfclinom = AV36TFCliNom ;
      AV90Documentocomercialv02wwds_6_tfclinom_sel = AV37TFCliNom_Sel ;
      AV91Documentocomercialv02wwds_7_tfalbcomfch = AV28TFAlbComFch ;
      AV92Documentocomercialv02wwds_8_tfalbcomhor = AV42TFAlbComHor ;
      AV93Documentocomercialv02wwds_9_tfalbcomeat_sels = AV60TFAlbComEAT_Sels ;
      AV94Documentocomercialv02wwds_10_tfalbcomid = AV63TFAlbComID ;
      AV95Documentocomercialv02wwds_11_tfalbcomid_sel = AV64TFAlbComID_Sel ;
      AV96Documentocomercialv02wwds_12_tfalbcomat = AV65TFAlbComAT ;
      AV97Documentocomercialv02wwds_13_tfalbcomat_sel = AV66TFAlbComAT_Sel ;
      AV98Documentocomercialv02wwds_14_tfalbcomatcud = AV61TFAlbComATCUD ;
      AV99Documentocomercialv02wwds_15_tfalbcomatcud_sel = AV62TFAlbComATCUD_Sel ;
      AV100Documentocomercialv02wwds_16_tfalbcomst = AV67TFAlbComSt ;
      AV101Documentocomercialv02wwds_17_tfalbcomst_sel = AV68TFAlbComSt_Sel ;
      AV102Documentocomercialv02wwds_18_tfalbcomfs = AV69TFAlbComFs ;
      AV103Documentocomercialv02wwds_19_tfalbcomfdd = AV73TFAlbComFdD ;
      AV104Documentocomercialv02wwds_20_tfalbcomfdd_sel = AV74TFAlbComFdD_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV55AlbComPri, AV29TFAlbComFch_To, A396EmprCod, AV26TFAlbComCod, AV27TFAlbComCod_To, AV34TFCliCod, AV35TFCliCod_To, AV36TFCliNom, AV37TFCliNom_Sel, AV28TFAlbComFch, AV42TFAlbComHor, AV60TFAlbComEAT_Sels, AV63TFAlbComID, AV64TFAlbComID_Sel, AV65TFAlbComAT, AV66TFAlbComAT_Sel, AV61TFAlbComATCUD, AV62TFAlbComATCUD_Sel, AV67TFAlbComSt, AV68TFAlbComSt_Sel, AV69TFAlbComFs, AV73TFAlbComFdD, AV74TFAlbComFdD_Sel, AV83Pgmname, AV12OrderedBy, AV13OrderedDsc, AV75Emprcod, A16AlbComEst) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV85Documentocomercialv02wwds_1_tfalbcomcod = AV26TFAlbComCod ;
      AV86Documentocomercialv02wwds_2_tfalbcomcod_to = AV27TFAlbComCod_To ;
      AV87Documentocomercialv02wwds_3_tfclicod = AV34TFCliCod ;
      AV88Documentocomercialv02wwds_4_tfclicod_to = AV35TFCliCod_To ;
      AV89Documentocomercialv02wwds_5_tfclinom = AV36TFCliNom ;
      AV90Documentocomercialv02wwds_6_tfclinom_sel = AV37TFCliNom_Sel ;
      AV91Documentocomercialv02wwds_7_tfalbcomfch = AV28TFAlbComFch ;
      AV92Documentocomercialv02wwds_8_tfalbcomhor = AV42TFAlbComHor ;
      AV93Documentocomercialv02wwds_9_tfalbcomeat_sels = AV60TFAlbComEAT_Sels ;
      AV94Documentocomercialv02wwds_10_tfalbcomid = AV63TFAlbComID ;
      AV95Documentocomercialv02wwds_11_tfalbcomid_sel = AV64TFAlbComID_Sel ;
      AV96Documentocomercialv02wwds_12_tfalbcomat = AV65TFAlbComAT ;
      AV97Documentocomercialv02wwds_13_tfalbcomat_sel = AV66TFAlbComAT_Sel ;
      AV98Documentocomercialv02wwds_14_tfalbcomatcud = AV61TFAlbComATCUD ;
      AV99Documentocomercialv02wwds_15_tfalbcomatcud_sel = AV62TFAlbComATCUD_Sel ;
      AV100Documentocomercialv02wwds_16_tfalbcomst = AV67TFAlbComSt ;
      AV101Documentocomercialv02wwds_17_tfalbcomst_sel = AV68TFAlbComSt_Sel ;
      AV102Documentocomercialv02wwds_18_tfalbcomfs = AV69TFAlbComFs ;
      AV103Documentocomercialv02wwds_19_tfalbcomfdd = AV73TFAlbComFdD ;
      AV104Documentocomercialv02wwds_20_tfalbcomfdd_sel = AV74TFAlbComFdD_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV55AlbComPri, AV29TFAlbComFch_To, A396EmprCod, AV26TFAlbComCod, AV27TFAlbComCod_To, AV34TFCliCod, AV35TFCliCod_To, AV36TFCliNom, AV37TFCliNom_Sel, AV28TFAlbComFch, AV42TFAlbComHor, AV60TFAlbComEAT_Sels, AV63TFAlbComID, AV64TFAlbComID_Sel, AV65TFAlbComAT, AV66TFAlbComAT_Sel, AV61TFAlbComATCUD, AV62TFAlbComATCUD_Sel, AV67TFAlbComSt, AV68TFAlbComSt_Sel, AV69TFAlbComFs, AV73TFAlbComFdD, AV74TFAlbComFdD_Sel, AV83Pgmname, AV12OrderedBy, AV13OrderedDsc, AV75Emprcod, A16AlbComEst) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV85Documentocomercialv02wwds_1_tfalbcomcod = AV26TFAlbComCod ;
      AV86Documentocomercialv02wwds_2_tfalbcomcod_to = AV27TFAlbComCod_To ;
      AV87Documentocomercialv02wwds_3_tfclicod = AV34TFCliCod ;
      AV88Documentocomercialv02wwds_4_tfclicod_to = AV35TFCliCod_To ;
      AV89Documentocomercialv02wwds_5_tfclinom = AV36TFCliNom ;
      AV90Documentocomercialv02wwds_6_tfclinom_sel = AV37TFCliNom_Sel ;
      AV91Documentocomercialv02wwds_7_tfalbcomfch = AV28TFAlbComFch ;
      AV92Documentocomercialv02wwds_8_tfalbcomhor = AV42TFAlbComHor ;
      AV93Documentocomercialv02wwds_9_tfalbcomeat_sels = AV60TFAlbComEAT_Sels ;
      AV94Documentocomercialv02wwds_10_tfalbcomid = AV63TFAlbComID ;
      AV95Documentocomercialv02wwds_11_tfalbcomid_sel = AV64TFAlbComID_Sel ;
      AV96Documentocomercialv02wwds_12_tfalbcomat = AV65TFAlbComAT ;
      AV97Documentocomercialv02wwds_13_tfalbcomat_sel = AV66TFAlbComAT_Sel ;
      AV98Documentocomercialv02wwds_14_tfalbcomatcud = AV61TFAlbComATCUD ;
      AV99Documentocomercialv02wwds_15_tfalbcomatcud_sel = AV62TFAlbComATCUD_Sel ;
      AV100Documentocomercialv02wwds_16_tfalbcomst = AV67TFAlbComSt ;
      AV101Documentocomercialv02wwds_17_tfalbcomst_sel = AV68TFAlbComSt_Sel ;
      AV102Documentocomercialv02wwds_18_tfalbcomfs = AV69TFAlbComFs ;
      AV103Documentocomercialv02wwds_19_tfalbcomfdd = AV73TFAlbComFdD ;
      AV104Documentocomercialv02wwds_20_tfalbcomfdd_sel = AV74TFAlbComFdD_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV55AlbComPri, AV29TFAlbComFch_To, A396EmprCod, AV26TFAlbComCod, AV27TFAlbComCod_To, AV34TFCliCod, AV35TFCliCod_To, AV36TFCliNom, AV37TFCliNom_Sel, AV28TFAlbComFch, AV42TFAlbComHor, AV60TFAlbComEAT_Sels, AV63TFAlbComID, AV64TFAlbComID_Sel, AV65TFAlbComAT, AV66TFAlbComAT_Sel, AV61TFAlbComATCUD, AV62TFAlbComATCUD_Sel, AV67TFAlbComSt, AV68TFAlbComSt_Sel, AV69TFAlbComFs, AV73TFAlbComFdD, AV74TFAlbComFdD_Sel, AV83Pgmname, AV12OrderedBy, AV13OrderedDsc, AV75Emprcod, A16AlbComEst) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV85Documentocomercialv02wwds_1_tfalbcomcod = AV26TFAlbComCod ;
      AV86Documentocomercialv02wwds_2_tfalbcomcod_to = AV27TFAlbComCod_To ;
      AV87Documentocomercialv02wwds_3_tfclicod = AV34TFCliCod ;
      AV88Documentocomercialv02wwds_4_tfclicod_to = AV35TFCliCod_To ;
      AV89Documentocomercialv02wwds_5_tfclinom = AV36TFCliNom ;
      AV90Documentocomercialv02wwds_6_tfclinom_sel = AV37TFCliNom_Sel ;
      AV91Documentocomercialv02wwds_7_tfalbcomfch = AV28TFAlbComFch ;
      AV92Documentocomercialv02wwds_8_tfalbcomhor = AV42TFAlbComHor ;
      AV93Documentocomercialv02wwds_9_tfalbcomeat_sels = AV60TFAlbComEAT_Sels ;
      AV94Documentocomercialv02wwds_10_tfalbcomid = AV63TFAlbComID ;
      AV95Documentocomercialv02wwds_11_tfalbcomid_sel = AV64TFAlbComID_Sel ;
      AV96Documentocomercialv02wwds_12_tfalbcomat = AV65TFAlbComAT ;
      AV97Documentocomercialv02wwds_13_tfalbcomat_sel = AV66TFAlbComAT_Sel ;
      AV98Documentocomercialv02wwds_14_tfalbcomatcud = AV61TFAlbComATCUD ;
      AV99Documentocomercialv02wwds_15_tfalbcomatcud_sel = AV62TFAlbComATCUD_Sel ;
      AV100Documentocomercialv02wwds_16_tfalbcomst = AV67TFAlbComSt ;
      AV101Documentocomercialv02wwds_17_tfalbcomst_sel = AV68TFAlbComSt_Sel ;
      AV102Documentocomercialv02wwds_18_tfalbcomfs = AV69TFAlbComFs ;
      AV103Documentocomercialv02wwds_19_tfalbcomfdd = AV73TFAlbComFdD ;
      AV104Documentocomercialv02wwds_20_tfalbcomfdd_sel = AV74TFAlbComFdD_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV55AlbComPri, AV29TFAlbComFch_To, A396EmprCod, AV26TFAlbComCod, AV27TFAlbComCod_To, AV34TFCliCod, AV35TFCliCod_To, AV36TFCliNom, AV37TFCliNom_Sel, AV28TFAlbComFch, AV42TFAlbComHor, AV60TFAlbComEAT_Sels, AV63TFAlbComID, AV64TFAlbComID_Sel, AV65TFAlbComAT, AV66TFAlbComAT_Sel, AV61TFAlbComATCUD, AV62TFAlbComATCUD_Sel, AV67TFAlbComSt, AV68TFAlbComSt_Sel, AV69TFAlbComFs, AV73TFAlbComFdD, AV74TFAlbComFdD_Sel, AV83Pgmname, AV12OrderedBy, AV13OrderedDsc, AV75Emprcod, A16AlbComEst) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_date = GXutil.today( ) ;
      AV83Pgmname = "DocumentoComercialv02WW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV83Pgmname", AV83Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1770( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e151772 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV50DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_34 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_34"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV52GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV53GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
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
         cmbavAlbcompri.setName( cmbavAlbcompri.getInternalname() );
         cmbavAlbcompri.setValue( httpContext.cgiGet( cmbavAlbcompri.getInternalname()) );
         AV55AlbComPri = httpContext.cgiGet( cmbavAlbcompri.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV55AlbComPri", AV55AlbComPri);
         AV83Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV83Pgmname", AV83Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_albcomfchauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_ALBCOMFCHAUXDATE");
            GX_FocusControl = edtavDdo_albcomfchauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV30DDO_AlbComFchAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30DDO_AlbComFchAuxDate", localUtil.format(AV30DDO_AlbComFchAuxDate, "99/99/99"));
         }
         else
         {
            AV30DDO_AlbComFchAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_albcomfchauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30DDO_AlbComFchAuxDate", localUtil.format(AV30DDO_AlbComFchAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_albcomhorauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_ALBCOMHORAUXDATE");
            GX_FocusControl = edtavDdo_albcomhorauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV44DDO_AlbComHorAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44DDO_AlbComHorAuxDate", localUtil.format(AV44DDO_AlbComHorAuxDate, "99/99/99"));
         }
         else
         {
            AV44DDO_AlbComHorAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_albcomhorauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44DDO_AlbComHorAuxDate", localUtil.format(AV44DDO_AlbComHorAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_albcomfsauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_ALBCOMFSAUXDATE");
            GX_FocusControl = edtavDdo_albcomfsauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV71DDO_AlbComFsAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71DDO_AlbComFsAuxDate", localUtil.format(AV71DDO_AlbComFsAuxDate, "99/99/99"));
         }
         else
         {
            AV71DDO_AlbComFsAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_albcomfsauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71DDO_AlbComFsAuxDate", localUtil.format(AV71DDO_AlbComFsAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"DocumentoComercialv02WW");
         AV83Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV83Pgmname", AV83Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV83Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("documentocomercialv02ww:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vALBCOMPRI"), AV55AlbComPri) != 0 )
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
      e151772 ();
      if (returnInSub) return;
   }

   public void e151772( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV56Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      documentocomercialv02ww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV56Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV57EmprNom ;
      GXv_char4[0] = AV58UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV56Station, GXv_char2, GXv_char3, GXv_char4) ;
      documentocomercialv02ww_impl.this.A396EmprCod = GXv_char2[0] ;
      documentocomercialv02ww_impl.this.AV57EmprNom = GXv_char3[0] ;
      documentocomercialv02ww_impl.this.AV58UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      AV28TFAlbComFch = GXutil.dadd(Gx_date,-(30)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28TFAlbComFch", localUtil.format(AV28TFAlbComFch, "99/99/99"));
      AV29TFAlbComFch_To = Gx_date ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29TFAlbComFch_To", localUtil.format(AV29TFAlbComFch_To, "99/99/99"));
      AV55AlbComPri = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55AlbComPri", AV55AlbComPri);
      GXt_char1 = AV56Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      documentocomercialv02ww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV56Station = GXt_char1 ;
      GXv_char4[0] = AV75Emprcod ;
      GXv_char3[0] = AV57EmprNom ;
      GXv_char2[0] = AV58UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV56Station, GXv_char4, GXv_char3, GXv_char2) ;
      documentocomercialv02ww_impl.this.AV75Emprcod = GXv_char4[0] ;
      documentocomercialv02ww_impl.this.AV57EmprNom = GXv_char3[0] ;
      documentocomercialv02ww_impl.this.AV58UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75Emprcod", AV75Emprcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV75Emprcod, "@!"))));
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Documento Comercial (v02)", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV50DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV50DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e161772( )
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
      AV52GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52GridCurrentPage), 10, 0));
      AV53GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53GridPageCount), 10, 0));
      AV85Documentocomercialv02wwds_1_tfalbcomcod = AV26TFAlbComCod ;
      AV86Documentocomercialv02wwds_2_tfalbcomcod_to = AV27TFAlbComCod_To ;
      AV87Documentocomercialv02wwds_3_tfclicod = AV34TFCliCod ;
      AV88Documentocomercialv02wwds_4_tfclicod_to = AV35TFCliCod_To ;
      AV89Documentocomercialv02wwds_5_tfclinom = AV36TFCliNom ;
      AV90Documentocomercialv02wwds_6_tfclinom_sel = AV37TFCliNom_Sel ;
      AV91Documentocomercialv02wwds_7_tfalbcomfch = AV28TFAlbComFch ;
      AV92Documentocomercialv02wwds_8_tfalbcomhor = AV42TFAlbComHor ;
      AV93Documentocomercialv02wwds_9_tfalbcomeat_sels = AV60TFAlbComEAT_Sels ;
      AV94Documentocomercialv02wwds_10_tfalbcomid = AV63TFAlbComID ;
      AV95Documentocomercialv02wwds_11_tfalbcomid_sel = AV64TFAlbComID_Sel ;
      AV96Documentocomercialv02wwds_12_tfalbcomat = AV65TFAlbComAT ;
      AV97Documentocomercialv02wwds_13_tfalbcomat_sel = AV66TFAlbComAT_Sel ;
      AV98Documentocomercialv02wwds_14_tfalbcomatcud = AV61TFAlbComATCUD ;
      AV99Documentocomercialv02wwds_15_tfalbcomatcud_sel = AV62TFAlbComATCUD_Sel ;
      AV100Documentocomercialv02wwds_16_tfalbcomst = AV67TFAlbComSt ;
      AV101Documentocomercialv02wwds_17_tfalbcomst_sel = AV68TFAlbComSt_Sel ;
      AV102Documentocomercialv02wwds_18_tfalbcomfs = AV69TFAlbComFs ;
      AV103Documentocomercialv02wwds_19_tfalbcomfdd = AV73TFAlbComFdD ;
      AV104Documentocomercialv02wwds_20_tfalbcomfdd_sel = AV74TFAlbComFdD_Sel ;
      /*  Sending Event outputs  */
   }

   public void e111772( )
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
         AV51PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV51PageToGo) ;
      }
   }

   public void e121772( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e131772( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbComCod") == 0 )
         {
            AV26TFAlbComCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFAlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFAlbComCod), 8, 0));
            AV27TFAlbComCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFAlbComCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFAlbComCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV34TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFCliCod), 6, 0));
            AV35TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV36TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFCliNom", AV36TFCliNom);
            AV37TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFCliNom_Sel", AV37TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbComFch") == 0 )
         {
            AV28TFAlbComFch = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFAlbComFch", localUtil.format(AV28TFAlbComFch, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbComHor") == 0 )
         {
            AV42TFAlbComHor = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFAlbComHor", localUtil.ttoc( AV42TFAlbComHor, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbComEAT") == 0 )
         {
            AV59TFAlbComEAT_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFAlbComEAT_SelsJson", AV59TFAlbComEAT_SelsJson);
            AV60TFAlbComEAT_Sels.fromJSonString(GXutil.strReplace( AV59TFAlbComEAT_SelsJson, "\"", ""), null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbComID") == 0 )
         {
            AV63TFAlbComID = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFAlbComID", AV63TFAlbComID);
            AV64TFAlbComID_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFAlbComID_Sel", AV64TFAlbComID_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbComAT") == 0 )
         {
            AV65TFAlbComAT = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFAlbComAT", AV65TFAlbComAT);
            AV66TFAlbComAT_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFAlbComAT_Sel", AV66TFAlbComAT_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbComATCUD") == 0 )
         {
            AV61TFAlbComATCUD = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFAlbComATCUD", AV61TFAlbComATCUD);
            AV62TFAlbComATCUD_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFAlbComATCUD_Sel", AV62TFAlbComATCUD_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbComSt") == 0 )
         {
            AV67TFAlbComSt = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFAlbComSt", AV67TFAlbComSt);
            AV68TFAlbComSt_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFAlbComSt_Sel", AV68TFAlbComSt_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbComFs") == 0 )
         {
            AV69TFAlbComFs = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69TFAlbComFs", localUtil.ttoc( AV69TFAlbComFs, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbComFdD") == 0 )
         {
            AV73TFAlbComFdD = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73TFAlbComFdD", AV73TFAlbComFdD);
            AV74TFAlbComFdD_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFAlbComFdD_Sel", AV74TFAlbComFdD_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV60TFAlbComEAT_Sels", AV60TFAlbComEAT_Sels);
   }

   private void e171772( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_display", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "Observaciones", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("4", GXutil.format( "%1;%2", httpContext.getMessage( "Generar HASH", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("5", GXutil.format( "%1;%2", httpContext.getMessage( "Enviar a AT", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("6", GXutil.format( "%1;%2", httpContext.getMessage( "Imprimir", ""), "fa fa-file-pdf", "", "", "", "", "", "", ""), (short)(0));
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(34) ;
      }
      sendrow_342( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_34_Refreshing )
      {
         httpContext.doAjaxLoad(34, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV54GridActions, 4, 0)) );
   }

   public void e181772( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV54GridActions == 1 )
      {
         /* Execute user subroutine: 'DO DISPLAY' */
         S152 ();
         if (returnInSub) return;
      }
      else if ( AV54GridActions == 2 )
      {
         /* Execute user subroutine: 'DO UPDATE' */
         S162 ();
         if (returnInSub) return;
      }
      else if ( AV54GridActions == 3 )
      {
         /* Execute user subroutine: 'DO OBSERVACIONES' */
         S172 ();
         if (returnInSub) return;
      }
      else if ( AV54GridActions == 4 )
      {
         /* Execute user subroutine: 'DO HASH' */
         S182 ();
         if (returnInSub) return;
      }
      else if ( AV54GridActions == 5 )
      {
         /* Execute user subroutine: 'DO ENVIARAAT' */
         S192 ();
         if (returnInSub) return;
      }
      else if ( AV54GridActions == 6 )
      {
         /* Execute user subroutine: 'DO IMPRIMIR' */
         S202 ();
         if (returnInSub) return;
      }
      AV54GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV54GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
   }

   public void e141772( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.documentocomercialv02", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(AV55AlbComPri))}, new String[] {"Mode","EmprCod","AlbComCod","AlbComPri"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.doAjaxRefresh();
      if ( 1 == 0 )
      {
         callWebObject(formatLink("app.documentocomercialv02", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(AV55AlbComPri))}, new String[] {"Mode","EmprCod","AlbComCod","AlbComPri"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      /*  Sending Event outputs  */
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
      /* 'DO DISPLAY' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.documentocomercialv02", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A14AlbComCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A22AlbComPri))}, new String[] {"Mode","EmprCod","AlbComCod","AlbComPri"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S162( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      if ( A16AlbComEst > 1 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Documento Facturado", ""));
      }
      else
      {
         if ( A10739AlbComEAT == 3 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Documento comunicado a AT", ""));
         }
         else
         {
            callWebObject(formatLink("app.documentocomercialv02", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A14AlbComCod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV55AlbComPri))}, new String[] {"Mode","EmprCod","AlbComCod","AlbComPri"}) );
            httpContext.wjLocDisableFrm = (byte)(1) ;
            httpContext.doAjaxRefresh();
         }
      }
   }

   public void S172( )
   {
      /* 'DO OBSERVACIONES' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.albaranescomerciales.talcobs", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(AV75Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(A14AlbComCod,8,0))}, new String[] {"Mode","EmprCod","AlbComCod"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S182( )
   {
      /* 'DO HASH' Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int8[0] = A14AlbComCod ;
      GXv_date9[0] = A17AlbComFch ;
      GXv_dtime10[0] = A10013AlbComFs ;
      GXv_int11[0] = (short)(2) ;
      GXv_int12[0] = (byte)(3) ;
      GXv_int13[0] = (byte)(1) ;
      GXv_char3[0] = AV79Cadena ;
      new app.albaranescomerciales.obtengocadenaparahashalbarancomercial(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_date9, GXv_dtime10, GXv_int11, GXv_int12, GXv_int13, GXv_char3) ;
      documentocomercialv02ww_impl.this.A396EmprCod = GXv_char4[0] ;
      documentocomercialv02ww_impl.this.A14AlbComCod = GXv_int8[0] ;
      documentocomercialv02ww_impl.this.A17AlbComFch = GXv_date9[0] ;
      documentocomercialv02ww_impl.this.A10013AlbComFs = GXv_dtime10[0] ;
      documentocomercialv02ww_impl.this.AV79Cadena = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      GXv_char4[0] = AV80Hash ;
      GXv_objcol_SdtMessages_Message14[0] = AV76Messages ;
      GXv_boolean15[0] = AV77OK ;
      new app.hash_obtener(remoteHandle, context).execute( AV79Cadena, GXv_char4, GXv_objcol_SdtMessages_Message14, GXv_boolean15) ;
      documentocomercialv02ww_impl.this.AV80Hash = GXv_char4[0] ;
      AV76Messages = GXv_objcol_SdtMessages_Message14[0] ;
      documentocomercialv02ww_impl.this.AV77OK = GXv_boolean15[0] ;
      if ( AV77OK )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A14AlbComCod ;
         GXv_char3[0] = AV79Cadena ;
         GXv_char2[0] = AV80Hash ;
         new app.albaranescomerciales.actualizohashalbarancomercial(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3, GXv_char2) ;
         documentocomercialv02ww_impl.this.A396EmprCod = GXv_char4[0] ;
         documentocomercialv02ww_impl.this.A14AlbComCod = GXv_int8[0] ;
         documentocomercialv02ww_impl.this.AV79Cadena = GXv_char3[0] ;
         documentocomercialv02ww_impl.this.AV80Hash = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.popup(formatLink("app.albaranescomerciales.horasalidaalbarancomercialenvioat", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A14AlbComCod,8,0)),GXutil.URLEncode(GXutil.formatDateTimeParm(A10013AlbComFs)),GXutil.URLEncode(GXutil.formatDateTimeParm(A4829AlbComHor)),GXutil.URLEncode(GXutil.rtrim(AV79Cadena)),GXutil.URLEncode(GXutil.rtrim(AV80Hash))}, new String[] {"Emprcod","ALbComCod","AlbComFs","AlbComHor","AlbComPri","Cadena","Hash"}) , new Object[] {"A4829AlbComHor",});
      }
      else
      {
         AV105GXV1 = 1 ;
         while ( AV105GXV1 <= AV76Messages.size() )
         {
            AV78Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV76Messages.elementAt(-1+AV105GXV1));
            httpContext.GX_msglist.addItem(AV78Message.getgxTv_SdtMessages_Message_Description());
            AV105GXV1 = (int)(AV105GXV1+1) ;
         }
      }
      httpContext.doAjaxRefresh();
   }

   public void S192( )
   {
      /* 'DO ENVIARAAT' Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int8[0] = A14AlbComCod ;
      GXv_date9[0] = A17AlbComFch ;
      GXv_dtime10[0] = A10013AlbComFs ;
      GXv_int11[0] = (short)(2) ;
      GXv_int13[0] = (byte)(3) ;
      GXv_int12[0] = (byte)(1) ;
      GXv_char3[0] = AV79Cadena ;
      new app.albaranescomerciales.obtengocadenaparahashalbarancomercial(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_date9, GXv_dtime10, GXv_int11, GXv_int13, GXv_int12, GXv_char3) ;
      documentocomercialv02ww_impl.this.A396EmprCod = GXv_char4[0] ;
      documentocomercialv02ww_impl.this.A14AlbComCod = GXv_int8[0] ;
      documentocomercialv02ww_impl.this.A17AlbComFch = GXv_date9[0] ;
      documentocomercialv02ww_impl.this.A10013AlbComFs = GXv_dtime10[0] ;
      documentocomercialv02ww_impl.this.AV79Cadena = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      GXv_char4[0] = AV80Hash ;
      GXv_objcol_SdtMessages_Message14[0] = AV76Messages ;
      GXv_boolean15[0] = AV77OK ;
      new app.hash_obtener(remoteHandle, context).execute( AV79Cadena, GXv_char4, GXv_objcol_SdtMessages_Message14, GXv_boolean15) ;
      documentocomercialv02ww_impl.this.AV80Hash = GXv_char4[0] ;
      AV76Messages = GXv_objcol_SdtMessages_Message14[0] ;
      documentocomercialv02ww_impl.this.AV77OK = GXv_boolean15[0] ;
      if ( AV77OK )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A14AlbComCod ;
         GXv_char3[0] = AV79Cadena ;
         GXv_char2[0] = AV80Hash ;
         new app.albaranescomerciales.actualizohashalbarancomercial(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3, GXv_char2) ;
         documentocomercialv02ww_impl.this.A396EmprCod = GXv_char4[0] ;
         documentocomercialv02ww_impl.this.A14AlbComCod = GXv_int8[0] ;
         documentocomercialv02ww_impl.this.AV79Cadena = GXv_char3[0] ;
         documentocomercialv02ww_impl.this.AV80Hash = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.popup(formatLink("app.albaranescomerciales.horasalidaalbarancomercialenvioat", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A14AlbComCod,8,0)),GXutil.URLEncode(GXutil.formatDateTimeParm(A10013AlbComFs)),GXutil.URLEncode(GXutil.formatDateTimeParm(A4829AlbComHor)),GXutil.URLEncode(GXutil.rtrim(AV79Cadena)),GXutil.URLEncode(GXutil.rtrim(AV80Hash))}, new String[] {"Emprcod","ALbComCod","AlbComFs","AlbComHor","AlbComPri","Cadena","Hash"}) , new Object[] {"A4829AlbComHor",});
      }
      else
      {
         AV106GXV2 = 1 ;
         while ( AV106GXV2 <= AV76Messages.size() )
         {
            AV78Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV76Messages.elementAt(-1+AV106GXV2));
            httpContext.GX_msglist.addItem(AV78Message.getgxTv_SdtMessages_Message_Description());
            AV106GXV2 = (int)(AV106GXV2+1) ;
         }
      }
      httpContext.doAjaxRefresh();
   }

   public void S202( )
   {
      /* 'DO IMPRIMIR' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.imprimirdocumentocomercial", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A14AlbComCod,8,0))}, new String[] {"Emprcod","AlbComCod"}) , new Object[] {"A396EmprCod","A14AlbComCod"});
      httpContext.doAjaxRefresh();
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV83Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV83Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV83Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV107GXV3 = 1 ;
      while ( AV107GXV3 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV107GXV3));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMCOD") == 0 )
         {
            AV26TFAlbComCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFAlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFAlbComCod), 8, 0));
            AV27TFAlbComCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFAlbComCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFAlbComCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV34TFCliCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFCliCod), 6, 0));
            AV35TFCliCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV36TFCliNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFCliNom", AV36TFCliNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV37TFCliNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFCliNom_Sel", AV37TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFCH") == 0 )
         {
            AV28TFAlbComFch = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFAlbComFch", localUtil.format(AV28TFAlbComFch, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMHOR") == 0 )
         {
            AV42TFAlbComHor = localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFAlbComHor", localUtil.ttoc( AV42TFAlbComHor, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV44DDO_AlbComHorAuxDate = GXutil.resetTime(AV42TFAlbComHor) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44DDO_AlbComHorAuxDate", localUtil.format(AV44DDO_AlbComHorAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMEAT_SEL") == 0 )
         {
            AV59TFAlbComEAT_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFAlbComEAT_SelsJson", AV59TFAlbComEAT_SelsJson);
            AV60TFAlbComEAT_Sels.fromJSonString(AV59TFAlbComEAT_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMID") == 0 )
         {
            AV63TFAlbComID = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFAlbComID", AV63TFAlbComID);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMID_SEL") == 0 )
         {
            AV64TFAlbComID_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFAlbComID_Sel", AV64TFAlbComID_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMAT") == 0 )
         {
            AV65TFAlbComAT = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFAlbComAT", AV65TFAlbComAT);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMAT_SEL") == 0 )
         {
            AV66TFAlbComAT_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFAlbComAT_Sel", AV66TFAlbComAT_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMATCUD") == 0 )
         {
            AV61TFAlbComATCUD = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFAlbComATCUD", AV61TFAlbComATCUD);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMATCUD_SEL") == 0 )
         {
            AV62TFAlbComATCUD_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFAlbComATCUD_Sel", AV62TFAlbComATCUD_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMST") == 0 )
         {
            AV67TFAlbComSt = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFAlbComSt", AV67TFAlbComSt);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMST_SEL") == 0 )
         {
            AV68TFAlbComSt_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFAlbComSt_Sel", AV68TFAlbComSt_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFS") == 0 )
         {
            AV69TFAlbComFs = localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69TFAlbComFs", localUtil.ttoc( AV69TFAlbComFs, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV71DDO_AlbComFsAuxDate = GXutil.resetTime(AV69TFAlbComFs) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71DDO_AlbComFsAuxDate", localUtil.format(AV71DDO_AlbComFsAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFDD") == 0 )
         {
            AV73TFAlbComFdD = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73TFAlbComFdD", AV73TFAlbComFdD);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFDD_SEL") == 0 )
         {
            AV74TFAlbComFdD_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFAlbComFdD_Sel", AV74TFAlbComFdD_Sel);
         }
         AV107GXV3 = (int)(AV107GXV3+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV37TFCliNom_Sel)==0), AV37TFCliNom_Sel, GXv_char4) ;
      documentocomercialv02ww_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char16 = "" ;
      GXv_char3[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV64TFAlbComID_Sel)==0), AV64TFAlbComID_Sel, GXv_char3) ;
      documentocomercialv02ww_impl.this.GXt_char16 = GXv_char3[0] ;
      GXt_char17 = "" ;
      GXv_char2[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV66TFAlbComAT_Sel)==0), AV66TFAlbComAT_Sel, GXv_char2) ;
      documentocomercialv02ww_impl.this.GXt_char17 = GXv_char2[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV62TFAlbComATCUD_Sel)==0), AV62TFAlbComATCUD_Sel, GXv_char19) ;
      documentocomercialv02ww_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV68TFAlbComSt_Sel)==0), AV68TFAlbComSt_Sel, GXv_char21) ;
      documentocomercialv02ww_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV74TFAlbComFdD_Sel)==0), AV74TFAlbComFdD_Sel, GXv_char23) ;
      documentocomercialv02ww_impl.this.GXt_char22 = GXv_char23[0] ;
      Ddo_grid_Selectedvalue_set = "||"+GXt_char1+"|||"+((AV60TFAlbComEAT_Sels.size()==0) ? "" : AV59TFAlbComEAT_SelsJson)+"|"+GXt_char16+"|"+GXt_char17+"|"+GXt_char18+"|"+GXt_char20+"||"+GXt_char22 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV36TFCliNom)==0), AV36TFCliNom, GXv_char23) ;
      documentocomercialv02ww_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV63TFAlbComID)==0), AV63TFAlbComID, GXv_char21) ;
      documentocomercialv02ww_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV65TFAlbComAT)==0), AV65TFAlbComAT, GXv_char19) ;
      documentocomercialv02ww_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char17 = "" ;
      GXv_char4[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV61TFAlbComATCUD)==0), AV61TFAlbComATCUD, GXv_char4) ;
      documentocomercialv02ww_impl.this.GXt_char17 = GXv_char4[0] ;
      GXt_char16 = "" ;
      GXv_char3[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV67TFAlbComSt)==0), AV67TFAlbComSt, GXv_char3) ;
      documentocomercialv02ww_impl.this.GXt_char16 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV73TFAlbComFdD)==0), AV73TFAlbComFdD, GXv_char2) ;
      documentocomercialv02ww_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV26TFAlbComCod) ? "" : GXutil.str( AV26TFAlbComCod, 8, 0))+"|"+((0==AV34TFCliCod) ? "" : GXutil.str( AV34TFCliCod, 6, 0))+"|"+GXt_char22+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV28TFAlbComFch)) ? "" : localUtil.dtoc( AV28TFAlbComFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV42TFAlbComHor) ? "" : localUtil.dtoc( AV44DDO_AlbComHorAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"||"+GXt_char20+"|"+GXt_char18+"|"+GXt_char17+"|"+GXt_char16+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV69TFAlbComFs) ? "" : localUtil.dtoc( AV71DDO_AlbComFsAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV27TFAlbComCod_To) ? "" : GXutil.str( AV27TFAlbComCod_To, 8, 0))+"|"+((0==AV35TFCliCod_To) ? "" : GXutil.str( AV35TFCliCod_To, 6, 0))+"||||||||||" ;
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
      AV10GridState.fromxml(AV22Session.getValue(AV83Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFALBCOMCOD", "", !((0==AV26TFAlbComCod)&&(0==AV27TFAlbComCod_To)), (short)(0), GXutil.trim( GXutil.str( AV26TFAlbComCod, 8, 0)), GXutil.trim( GXutil.str( AV27TFAlbComCod_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFCLICOD", "", !((0==AV34TFCliCod)&&(0==AV35TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV34TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV35TFCliCod_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFCLINOM", "", !(GXutil.strcmp("", AV36TFCliNom)==0), (short)(0), AV36TFCliNom, "", !(GXutil.strcmp("", AV37TFCliNom_Sel)==0), AV37TFCliNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFALBCOMFCH", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV28TFAlbComFch)), (short)(0), GXutil.trim( localUtil.dtoc( AV28TFAlbComFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFALBCOMHOR", "", !GXutil.dateCompare(GXutil.nullDate(), AV42TFAlbComHor), (short)(0), GXutil.trim( localUtil.ttoc( AV42TFAlbComHor, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFALBCOMEAT_SEL", "", !(AV60TFAlbComEAT_Sels.size()==0), (short)(0), AV60TFAlbComEAT_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFALBCOMID", "", !(GXutil.strcmp("", AV63TFAlbComID)==0), (short)(0), AV63TFAlbComID, "", !(GXutil.strcmp("", AV64TFAlbComID_Sel)==0), AV64TFAlbComID_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFALBCOMAT", "", !(GXutil.strcmp("", AV65TFAlbComAT)==0), (short)(0), AV65TFAlbComAT, "", !(GXutil.strcmp("", AV66TFAlbComAT_Sel)==0), AV66TFAlbComAT_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFALBCOMATCUD", "", !(GXutil.strcmp("", AV61TFAlbComATCUD)==0), (short)(0), AV61TFAlbComATCUD, "", !(GXutil.strcmp("", AV62TFAlbComATCUD_Sel)==0), AV62TFAlbComATCUD_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFALBCOMST", "", !(GXutil.strcmp("", AV67TFAlbComSt)==0), (short)(0), AV67TFAlbComSt, "", !(GXutil.strcmp("", AV68TFAlbComSt_Sel)==0), AV68TFAlbComSt_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFALBCOMFS", "", !GXutil.dateCompare(GXutil.nullDate(), AV69TFAlbComFs), (short)(0), GXutil.trim( localUtil.ttoc( AV69TFAlbComFs, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFALBCOMFDD", "", !(GXutil.strcmp("", AV73TFAlbComFdD)==0), (short)(0), AV73TFAlbComFdD, "", !(GXutil.strcmp("", AV74TFAlbComFdD_Sel)==0), AV74TFAlbComFdD_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV83Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV83Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "DocumentoComercialv02" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_23_1772( boolean wbgen )
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
         wb_table1_23_1772e( true) ;
      }
      else
      {
         wb_table1_23_1772e( false) ;
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
      pa1772( ) ;
      ws1772( ) ;
      we1772( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116131696", true, true);
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
      httpContext.AddJavascriptSource("documentocomercialv02ww.js", "?202682116131697", false, true);
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
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_342( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_34_idx );
      edtAlbComCod_Internalname = "ALBCOMCOD_"+sGXsfl_34_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_34_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_34_idx ;
      edtAlbComFch_Internalname = "ALBCOMFCH_"+sGXsfl_34_idx ;
      edtAlbComHor_Internalname = "ALBCOMHOR_"+sGXsfl_34_idx ;
      cmbAlbComEAT.setInternalname( "ALBCOMEAT_"+sGXsfl_34_idx );
      edtAlbComID_Internalname = "ALBCOMID_"+sGXsfl_34_idx ;
      edtAlbComAT_Internalname = "ALBCOMAT_"+sGXsfl_34_idx ;
      edtAlbComPri_Internalname = "ALBCOMPRI_"+sGXsfl_34_idx ;
      edtAlbComATCU_Internalname = "ALBCOMATCU_"+sGXsfl_34_idx ;
      edtAlbComSt_Internalname = "ALBCOMST_"+sGXsfl_34_idx ;
      edtAlbComFs_Internalname = "ALBCOMFS_"+sGXsfl_34_idx ;
      edtAlbComFdD_Internalname = "ALBCOMFDD_"+sGXsfl_34_idx ;
   }

   public void subsflControlProps_fel_342( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_34_fel_idx );
      edtAlbComCod_Internalname = "ALBCOMCOD_"+sGXsfl_34_fel_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_34_fel_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_34_fel_idx ;
      edtAlbComFch_Internalname = "ALBCOMFCH_"+sGXsfl_34_fel_idx ;
      edtAlbComHor_Internalname = "ALBCOMHOR_"+sGXsfl_34_fel_idx ;
      cmbAlbComEAT.setInternalname( "ALBCOMEAT_"+sGXsfl_34_fel_idx );
      edtAlbComID_Internalname = "ALBCOMID_"+sGXsfl_34_fel_idx ;
      edtAlbComAT_Internalname = "ALBCOMAT_"+sGXsfl_34_fel_idx ;
      edtAlbComPri_Internalname = "ALBCOMPRI_"+sGXsfl_34_fel_idx ;
      edtAlbComATCU_Internalname = "ALBCOMATCU_"+sGXsfl_34_fel_idx ;
      edtAlbComSt_Internalname = "ALBCOMST_"+sGXsfl_34_fel_idx ;
      edtAlbComFs_Internalname = "ALBCOMFS_"+sGXsfl_34_fel_idx ;
      edtAlbComFdD_Internalname = "ALBCOMFDD_"+sGXsfl_34_fel_idx ;
   }

   public void sendrow_342( )
   {
      subsflControlProps_342( ) ;
      wb1770( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_34_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_34_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_34_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 35,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_34_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV54GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV54GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV54GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_34_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,35);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV54GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_34_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComCod_Internalname,GXutil.ltrim( localUtil.ntoc( A14AlbComCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14AlbComCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComFch_Internalname,localUtil.format(A17AlbComFch, "99/99/99"),localUtil.format( A17AlbComFch, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComFch_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComHor_Internalname,localUtil.ttoc( A4829AlbComHor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A4829AlbComHor, "99/99/99 99:99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComHor_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( cmbAlbComEAT.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBCOMEAT_" + sGXsfl_34_idx ;
            cmbAlbComEAT.setName( GXCCtl );
            cmbAlbComEAT.setWebtags( "" );
            cmbAlbComEAT.addItem("0", httpContext.getMessage( "Pdte. Envio", ""), (short)(0));
            cmbAlbComEAT.addItem("3", httpContext.getMessage( "Enviada AT", ""), (short)(0));
            if ( cmbAlbComEAT.getItemCount() > 0 )
            {
               A10739AlbComEAT = (byte)(GXutil.lval( cmbAlbComEAT.getValidValue(GXutil.trim( GXutil.str( A10739AlbComEAT, 1, 0))))) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbComEAT,cmbAlbComEAT.getInternalname(),GXutil.trim( GXutil.str( A10739AlbComEAT, 1, 0)),Integer.valueOf(1),cmbAlbComEAT.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbComEAT.setValue( GXutil.trim( GXutil.str( A10739AlbComEAT, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbComEAT.getInternalname(), "Values", cmbAlbComEAT.ToJavascriptSource(), !bGXsfl_34_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComID_Internalname,GXutil.rtrim( A10740AlbComID),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComID_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComAT_Internalname,GXutil.rtrim( A10764AlbComAT),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComAT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComPri_Internalname,GXutil.rtrim( A22AlbComPri),GXutil.rtrim( localUtil.format( A22AlbComPri, "9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComPri_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComATCU_Internalname,GXutil.rtrim( A14248AlbComATCU),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComATCU_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComSt_Internalname,GXutil.rtrim( A10738AlbComSt),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComSt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComFs_Internalname,localUtil.ttoc( A10013AlbComFs, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A10013AlbComFs, "99/99/99 99:99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComFs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComFdD_Internalname,GXutil.rtrim( A10015AlbComFdD),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComFdD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(200),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1772( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_34_idx = ((subGrid_Islastpage==1)&&(nGXsfl_34_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_34_idx+1) ;
         sGXsfl_34_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_34_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_342( ) ;
      }
      /* End function sendrow_342 */
   }

   public void startgridcontrol34( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"34\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Documento", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Hora Salida", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "AT", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo AT", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "M/A", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "ATCUD", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Anulada?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Invoice System", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hash", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV54GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14AlbComCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A279CliNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A17AlbComFch, "99/99/99"));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A4829AlbComHor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10739AlbComEAT, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A10740AlbComID));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A10764AlbComAT));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A22AlbComPri));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14248AlbComATCU));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A10738AlbComSt));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A10013AlbComFs, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A10015AlbComFdD));
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
      cmbavAlbcompri.setInternalname( "vALBCOMPRI" );
      divTableactions_Internalname = "TABLEACTIONS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtAlbComCod_Internalname = "ALBCOMCOD" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtAlbComFch_Internalname = "ALBCOMFCH" ;
      edtAlbComHor_Internalname = "ALBCOMHOR" ;
      cmbAlbComEAT.setInternalname( "ALBCOMEAT" );
      edtAlbComID_Internalname = "ALBCOMID" ;
      edtAlbComAT_Internalname = "ALBCOMAT" ;
      edtAlbComPri_Internalname = "ALBCOMPRI" ;
      edtAlbComATCU_Internalname = "ALBCOMATCU" ;
      edtAlbComSt_Internalname = "ALBCOMST" ;
      edtAlbComFs_Internalname = "ALBCOMFS" ;
      edtAlbComFdD_Internalname = "ALBCOMFDD" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_albcomfchauxdate_Internalname = "vDDO_ALBCOMFCHAUXDATE" ;
      divDdo_albcomfchauxdates_Internalname = "DDO_ALBCOMFCHAUXDATES" ;
      edtavDdo_albcomhorauxdate_Internalname = "vDDO_ALBCOMHORAUXDATE" ;
      divDdo_albcomhorauxdates_Internalname = "DDO_ALBCOMHORAUXDATES" ;
      edtavDdo_albcomfsauxdate_Internalname = "vDDO_ALBCOMFSAUXDATE" ;
      divDdo_albcomfsauxdates_Internalname = "DDO_ALBCOMFSAUXDATES" ;
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
      edtAlbComFdD_Jsonclick = "" ;
      edtAlbComFs_Jsonclick = "" ;
      edtAlbComSt_Jsonclick = "" ;
      edtAlbComATCU_Jsonclick = "" ;
      edtAlbComPri_Jsonclick = "" ;
      edtAlbComAT_Jsonclick = "" ;
      edtAlbComID_Jsonclick = "" ;
      cmbAlbComEAT.setJsonclick( "" );
      edtAlbComHor_Jsonclick = "" ;
      edtAlbComFch_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtAlbComCod_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_albcomfsauxdate_Jsonclick = "" ;
      edtavDdo_albcomhorauxdate_Jsonclick = "" ;
      edtavDdo_albcomfchauxdate_Jsonclick = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      cmbavAlbcompri.setJsonclick( "" );
      cmbavAlbcompri.setEnabled( 1 );
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;" ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_grid_Datalistproc = "DocumentoComercialv02WWGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "|||||0:Pdte. Envio,3:Enviada AT||||||" ;
      Ddo_grid_Allowmultipleselection = "|||||T||||||" ;
      Ddo_grid_Datalisttype = "||Dynamic|||FixedValues|Dynamic|Dynamic|Dynamic|Dynamic||Dynamic" ;
      Ddo_grid_Includedatalist = "||T|||T|T|T|T|T||T" ;
      Ddo_grid_Filterisrange = "T|T||||||||||" ;
      Ddo_grid_Filtertype = "Numeric|Numeric|Character|Date|Date||Character|Character|Character|Character|Date|Character" ;
      Ddo_grid_Includefilter = "T|T|T|T|T||T|T|T|T|T|T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7|8|9|10|11|12|13" ;
      Ddo_grid_Columnids = "1:AlbComCod|2:CliCod|3:CliNom|4:AlbComFch|5:AlbComHor|6:AlbComEAT|7:AlbComID|8:AlbComAT|10:AlbComATCUD|11:AlbComSt|12:AlbComFs|13:AlbComFdD" ;
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
      Form.setCaption( httpContext.getMessage( " Documento Comercial (v02)", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavAlbcompri.setName( "vALBCOMPRI" );
      cmbavAlbcompri.setWebtags( "" );
      cmbavAlbcompri.addItem("1", httpContext.getMessage( "Guia Remessa", ""), (short)(0));
      cmbavAlbcompri.addItem("0", httpContext.getMessage( "Guia Transporte", ""), (short)(0));
      if ( cmbavAlbcompri.getItemCount() > 0 )
      {
         AV55AlbComPri = cmbavAlbcompri.getValidValue(AV55AlbComPri) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV55AlbComPri", AV55AlbComPri);
      }
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_34_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV54GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV54GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54GridActions), 4, 0));
      }
      GXCCtl = "ALBCOMEAT_" + sGXsfl_34_idx ;
      cmbAlbComEAT.setName( GXCCtl );
      cmbAlbComEAT.setWebtags( "" );
      cmbAlbComEAT.addItem("0", httpContext.getMessage( "Pdte. Envio", ""), (short)(0));
      cmbAlbComEAT.addItem("3", httpContext.getMessage( "Enviada AT", ""), (short)(0));
      if ( cmbAlbComEAT.getItemCount() > 0 )
      {
         A10739AlbComEAT = (byte)(GXutil.lval( cmbAlbComEAT.getValidValue(GXutil.trim( GXutil.str( A10739AlbComEAT, 1, 0))))) ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'cmbavAlbcompri'},{av:'AV55AlbComPri',fld:'vALBCOMPRI',pic:''},{av:'AV29TFAlbComFch_To',fld:'vTFALBCOMFCH_TO',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV26TFAlbComCod',fld:'vTFALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV27TFAlbComCod_To',fld:'vTFALBCOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV34TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV35TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV36TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV37TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV28TFAlbComFch',fld:'vTFALBCOMFCH',pic:''},{av:'AV42TFAlbComHor',fld:'vTFALBCOMHOR',pic:'99/99/99 99:99:99'},{av:'AV60TFAlbComEAT_Sels',fld:'vTFALBCOMEAT_SELS',pic:''},{av:'AV63TFAlbComID',fld:'vTFALBCOMID',pic:''},{av:'AV64TFAlbComID_Sel',fld:'vTFALBCOMID_SEL',pic:''},{av:'AV65TFAlbComAT',fld:'vTFALBCOMAT',pic:''},{av:'AV66TFAlbComAT_Sel',fld:'vTFALBCOMAT_SEL',pic:''},{av:'AV61TFAlbComATCUD',fld:'vTFALBCOMATCUD',pic:''},{av:'AV62TFAlbComATCUD_Sel',fld:'vTFALBCOMATCUD_SEL',pic:''},{av:'AV67TFAlbComSt',fld:'vTFALBCOMST',pic:''},{av:'AV68TFAlbComSt_Sel',fld:'vTFALBCOMST_SEL',pic:''},{av:'AV69TFAlbComFs',fld:'vTFALBCOMFS',pic:'99/99/99 99:99:99'},{av:'AV73TFAlbComFdD',fld:'vTFALBCOMFDD',pic:''},{av:'AV74TFAlbComFdD_Sel',fld:'vTFALBCOMFDD_SEL',pic:''},{av:'AV83Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV75Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A16AlbComEst',fld:'ALBCOMEST',pic:'9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV52GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV53GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e111772',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'cmbavAlbcompri'},{av:'AV55AlbComPri',fld:'vALBCOMPRI',pic:''},{av:'AV29TFAlbComFch_To',fld:'vTFALBCOMFCH_TO',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV26TFAlbComCod',fld:'vTFALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV27TFAlbComCod_To',fld:'vTFALBCOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV34TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV35TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV36TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV37TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV28TFAlbComFch',fld:'vTFALBCOMFCH',pic:''},{av:'AV42TFAlbComHor',fld:'vTFALBCOMHOR',pic:'99/99/99 99:99:99'},{av:'AV60TFAlbComEAT_Sels',fld:'vTFALBCOMEAT_SELS',pic:''},{av:'AV63TFAlbComID',fld:'vTFALBCOMID',pic:''},{av:'AV64TFAlbComID_Sel',fld:'vTFALBCOMID_SEL',pic:''},{av:'AV65TFAlbComAT',fld:'vTFALBCOMAT',pic:''},{av:'AV66TFAlbComAT_Sel',fld:'vTFALBCOMAT_SEL',pic:''},{av:'AV61TFAlbComATCUD',fld:'vTFALBCOMATCUD',pic:''},{av:'AV62TFAlbComATCUD_Sel',fld:'vTFALBCOMATCUD_SEL',pic:''},{av:'AV67TFAlbComSt',fld:'vTFALBCOMST',pic:''},{av:'AV68TFAlbComSt_Sel',fld:'vTFALBCOMST_SEL',pic:''},{av:'AV69TFAlbComFs',fld:'vTFALBCOMFS',pic:'99/99/99 99:99:99'},{av:'AV73TFAlbComFdD',fld:'vTFALBCOMFDD',pic:''},{av:'AV74TFAlbComFdD_Sel',fld:'vTFALBCOMFDD_SEL',pic:''},{av:'AV83Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV75Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A16AlbComEst',fld:'ALBCOMEST',pic:'9',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e121772',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'cmbavAlbcompri'},{av:'AV55AlbComPri',fld:'vALBCOMPRI',pic:''},{av:'AV29TFAlbComFch_To',fld:'vTFALBCOMFCH_TO',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV26TFAlbComCod',fld:'vTFALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV27TFAlbComCod_To',fld:'vTFALBCOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV34TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV35TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV36TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV37TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV28TFAlbComFch',fld:'vTFALBCOMFCH',pic:''},{av:'AV42TFAlbComHor',fld:'vTFALBCOMHOR',pic:'99/99/99 99:99:99'},{av:'AV60TFAlbComEAT_Sels',fld:'vTFALBCOMEAT_SELS',pic:''},{av:'AV63TFAlbComID',fld:'vTFALBCOMID',pic:''},{av:'AV64TFAlbComID_Sel',fld:'vTFALBCOMID_SEL',pic:''},{av:'AV65TFAlbComAT',fld:'vTFALBCOMAT',pic:''},{av:'AV66TFAlbComAT_Sel',fld:'vTFALBCOMAT_SEL',pic:''},{av:'AV61TFAlbComATCUD',fld:'vTFALBCOMATCUD',pic:''},{av:'AV62TFAlbComATCUD_Sel',fld:'vTFALBCOMATCUD_SEL',pic:''},{av:'AV67TFAlbComSt',fld:'vTFALBCOMST',pic:''},{av:'AV68TFAlbComSt_Sel',fld:'vTFALBCOMST_SEL',pic:''},{av:'AV69TFAlbComFs',fld:'vTFALBCOMFS',pic:'99/99/99 99:99:99'},{av:'AV73TFAlbComFdD',fld:'vTFALBCOMFDD',pic:''},{av:'AV74TFAlbComFdD_Sel',fld:'vTFALBCOMFDD_SEL',pic:''},{av:'AV83Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV75Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A16AlbComEst',fld:'ALBCOMEST',pic:'9',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e131772',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'cmbavAlbcompri'},{av:'AV55AlbComPri',fld:'vALBCOMPRI',pic:''},{av:'AV29TFAlbComFch_To',fld:'vTFALBCOMFCH_TO',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV26TFAlbComCod',fld:'vTFALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV27TFAlbComCod_To',fld:'vTFALBCOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV34TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV35TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV36TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV37TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV28TFAlbComFch',fld:'vTFALBCOMFCH',pic:''},{av:'AV42TFAlbComHor',fld:'vTFALBCOMHOR',pic:'99/99/99 99:99:99'},{av:'AV60TFAlbComEAT_Sels',fld:'vTFALBCOMEAT_SELS',pic:''},{av:'AV63TFAlbComID',fld:'vTFALBCOMID',pic:''},{av:'AV64TFAlbComID_Sel',fld:'vTFALBCOMID_SEL',pic:''},{av:'AV65TFAlbComAT',fld:'vTFALBCOMAT',pic:''},{av:'AV66TFAlbComAT_Sel',fld:'vTFALBCOMAT_SEL',pic:''},{av:'AV61TFAlbComATCUD',fld:'vTFALBCOMATCUD',pic:''},{av:'AV62TFAlbComATCUD_Sel',fld:'vTFALBCOMATCUD_SEL',pic:''},{av:'AV67TFAlbComSt',fld:'vTFALBCOMST',pic:''},{av:'AV68TFAlbComSt_Sel',fld:'vTFALBCOMST_SEL',pic:''},{av:'AV69TFAlbComFs',fld:'vTFALBCOMFS',pic:'99/99/99 99:99:99'},{av:'AV73TFAlbComFdD',fld:'vTFALBCOMFDD',pic:''},{av:'AV74TFAlbComFdD_Sel',fld:'vTFALBCOMFDD_SEL',pic:''},{av:'AV83Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV75Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A16AlbComEst',fld:'ALBCOMEST',pic:'9',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV73TFAlbComFdD',fld:'vTFALBCOMFDD',pic:''},{av:'AV74TFAlbComFdD_Sel',fld:'vTFALBCOMFDD_SEL',pic:''},{av:'AV69TFAlbComFs',fld:'vTFALBCOMFS',pic:'99/99/99 99:99:99'},{av:'AV67TFAlbComSt',fld:'vTFALBCOMST',pic:''},{av:'AV68TFAlbComSt_Sel',fld:'vTFALBCOMST_SEL',pic:''},{av:'AV61TFAlbComATCUD',fld:'vTFALBCOMATCUD',pic:''},{av:'AV62TFAlbComATCUD_Sel',fld:'vTFALBCOMATCUD_SEL',pic:''},{av:'AV65TFAlbComAT',fld:'vTFALBCOMAT',pic:''},{av:'AV66TFAlbComAT_Sel',fld:'vTFALBCOMAT_SEL',pic:''},{av:'AV63TFAlbComID',fld:'vTFALBCOMID',pic:''},{av:'AV64TFAlbComID_Sel',fld:'vTFALBCOMID_SEL',pic:''},{av:'AV59TFAlbComEAT_SelsJson',fld:'vTFALBCOMEAT_SELSJSON',pic:''},{av:'AV60TFAlbComEAT_Sels',fld:'vTFALBCOMEAT_SELS',pic:''},{av:'AV42TFAlbComHor',fld:'vTFALBCOMHOR',pic:'99/99/99 99:99:99'},{av:'AV28TFAlbComFch',fld:'vTFALBCOMFCH',pic:''},{av:'AV36TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV37TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV34TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV35TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV26TFAlbComCod',fld:'vTFALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV27TFAlbComCod_To',fld:'vTFALBCOMCOD_TO',pic:'ZZZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e171772',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV54GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e181772',iparms:[{av:'cmbavGridactions'},{av:'AV54GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A14AlbComCod',fld:'ALBCOMCOD',pic:'ZZZZZZZ9'},{av:'A22AlbComPri',fld:'ALBCOMPRI',pic:'9',hsh:true},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'cmbavAlbcompri'},{av:'AV55AlbComPri',fld:'vALBCOMPRI',pic:''},{av:'AV29TFAlbComFch_To',fld:'vTFALBCOMFCH_TO',pic:''},{av:'AV26TFAlbComCod',fld:'vTFALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV27TFAlbComCod_To',fld:'vTFALBCOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV34TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV35TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV36TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV37TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV28TFAlbComFch',fld:'vTFALBCOMFCH',pic:''},{av:'AV42TFAlbComHor',fld:'vTFALBCOMHOR',pic:'99/99/99 99:99:99'},{av:'AV60TFAlbComEAT_Sels',fld:'vTFALBCOMEAT_SELS',pic:''},{av:'AV63TFAlbComID',fld:'vTFALBCOMID',pic:''},{av:'AV64TFAlbComID_Sel',fld:'vTFALBCOMID_SEL',pic:''},{av:'AV65TFAlbComAT',fld:'vTFALBCOMAT',pic:''},{av:'AV66TFAlbComAT_Sel',fld:'vTFALBCOMAT_SEL',pic:''},{av:'AV61TFAlbComATCUD',fld:'vTFALBCOMATCUD',pic:''},{av:'AV62TFAlbComATCUD_Sel',fld:'vTFALBCOMATCUD_SEL',pic:''},{av:'AV67TFAlbComSt',fld:'vTFALBCOMST',pic:''},{av:'AV68TFAlbComSt_Sel',fld:'vTFALBCOMST_SEL',pic:''},{av:'AV69TFAlbComFs',fld:'vTFALBCOMFS',pic:'99/99/99 99:99:99'},{av:'AV73TFAlbComFdD',fld:'vTFALBCOMFDD',pic:''},{av:'AV74TFAlbComFdD_Sel',fld:'vTFALBCOMFDD_SEL',pic:''},{av:'AV83Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV75Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A16AlbComEst',fld:'ALBCOMEST',pic:'9',hsh:true},{av:'cmbAlbComEAT'},{av:'A10739AlbComEAT',fld:'ALBCOMEAT',pic:'9',hsh:true},{av:'A17AlbComFch',fld:'ALBCOMFCH',pic:''},{av:'A10013AlbComFs',fld:'ALBCOMFS',pic:'99/99/99 99:99:99'},{av:'A4829AlbComHor',fld:'ALBCOMHOR',pic:'99/99/99 99:99:99'}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV54GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A10013AlbComFs',fld:'ALBCOMFS',pic:'99/99/99 99:99:99'},{av:'A17AlbComFch',fld:'ALBCOMFCH',pic:''},{av:'A14AlbComCod',fld:'ALBCOMCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4829AlbComHor',fld:'ALBCOMHOR',pic:'99/99/99 99:99:99'},{av:'AV52GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV53GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e141772',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'cmbavAlbcompri'},{av:'AV55AlbComPri',fld:'vALBCOMPRI',pic:''},{av:'AV29TFAlbComFch_To',fld:'vTFALBCOMFCH_TO',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV26TFAlbComCod',fld:'vTFALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV27TFAlbComCod_To',fld:'vTFALBCOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV34TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV35TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV36TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV37TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV28TFAlbComFch',fld:'vTFALBCOMFCH',pic:''},{av:'AV42TFAlbComHor',fld:'vTFALBCOMHOR',pic:'99/99/99 99:99:99'},{av:'AV60TFAlbComEAT_Sels',fld:'vTFALBCOMEAT_SELS',pic:''},{av:'AV63TFAlbComID',fld:'vTFALBCOMID',pic:''},{av:'AV64TFAlbComID_Sel',fld:'vTFALBCOMID_SEL',pic:''},{av:'AV65TFAlbComAT',fld:'vTFALBCOMAT',pic:''},{av:'AV66TFAlbComAT_Sel',fld:'vTFALBCOMAT_SEL',pic:''},{av:'AV61TFAlbComATCUD',fld:'vTFALBCOMATCUD',pic:''},{av:'AV62TFAlbComATCUD_Sel',fld:'vTFALBCOMATCUD_SEL',pic:''},{av:'AV67TFAlbComSt',fld:'vTFALBCOMST',pic:''},{av:'AV68TFAlbComSt_Sel',fld:'vTFALBCOMST_SEL',pic:''},{av:'AV69TFAlbComFs',fld:'vTFALBCOMFS',pic:'99/99/99 99:99:99'},{av:'AV73TFAlbComFdD',fld:'vTFALBCOMFDD',pic:''},{av:'AV74TFAlbComFdD_Sel',fld:'vTFALBCOMFDD_SEL',pic:''},{av:'AV83Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV75Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A16AlbComEst',fld:'ALBCOMEST',pic:'9',hsh:true},{av:'A14AlbComCod',fld:'ALBCOMCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOINSERT'",",oparms:[{av:'AV52GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV53GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Albcomfdd',iparms:[]");
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
      AV55AlbComPri = "" ;
      AV29TFAlbComFch_To = GXutil.nullDate() ;
      A396EmprCod = "" ;
      AV36TFCliNom = "" ;
      AV37TFCliNom_Sel = "" ;
      AV28TFAlbComFch = GXutil.nullDate() ;
      AV42TFAlbComHor = GXutil.resetTime( GXutil.nullDate() );
      AV60TFAlbComEAT_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV63TFAlbComID = "" ;
      AV64TFAlbComID_Sel = "" ;
      AV65TFAlbComAT = "" ;
      AV66TFAlbComAT_Sel = "" ;
      AV61TFAlbComATCUD = "" ;
      AV62TFAlbComATCUD_Sel = "" ;
      AV67TFAlbComSt = "" ;
      AV68TFAlbComSt_Sel = "" ;
      AV69TFAlbComFs = GXutil.resetTime( GXutil.nullDate() );
      AV73TFAlbComFdD = "" ;
      AV74TFAlbComFdD_Sel = "" ;
      AV83Pgmname = "" ;
      AV75Emprcod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV50DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
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
      ClassString = "" ;
      StyleString = "" ;
      bttBtninsert_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV30DDO_AlbComFchAuxDate = GXutil.nullDate() ;
      AV44DDO_AlbComHorAuxDate = GXutil.nullDate() ;
      AV71DDO_AlbComFsAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A279CliNom = "" ;
      A17AlbComFch = GXutil.nullDate() ;
      A4829AlbComHor = GXutil.resetTime( GXutil.nullDate() );
      A10740AlbComID = "" ;
      A10764AlbComAT = "" ;
      A22AlbComPri = "" ;
      A14248AlbComATCU = "" ;
      A10738AlbComSt = "" ;
      A10013AlbComFs = GXutil.resetTime( GXutil.nullDate() );
      A10015AlbComFdD = "" ;
      Gx_date = GXutil.nullDate() ;
      AV93Documentocomercialv02wwds_9_tfalbcomeat_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      scmdbuf = "" ;
      lV89Documentocomercialv02wwds_5_tfclinom = "" ;
      lV94Documentocomercialv02wwds_10_tfalbcomid = "" ;
      lV96Documentocomercialv02wwds_12_tfalbcomat = "" ;
      lV98Documentocomercialv02wwds_14_tfalbcomatcud = "" ;
      lV100Documentocomercialv02wwds_16_tfalbcomst = "" ;
      lV103Documentocomercialv02wwds_19_tfalbcomfdd = "" ;
      AV90Documentocomercialv02wwds_6_tfclinom_sel = "" ;
      AV89Documentocomercialv02wwds_5_tfclinom = "" ;
      AV91Documentocomercialv02wwds_7_tfalbcomfch = GXutil.nullDate() ;
      AV92Documentocomercialv02wwds_8_tfalbcomhor = GXutil.resetTime( GXutil.nullDate() );
      AV95Documentocomercialv02wwds_11_tfalbcomid_sel = "" ;
      AV94Documentocomercialv02wwds_10_tfalbcomid = "" ;
      AV97Documentocomercialv02wwds_13_tfalbcomat_sel = "" ;
      AV96Documentocomercialv02wwds_12_tfalbcomat = "" ;
      AV99Documentocomercialv02wwds_15_tfalbcomatcud_sel = "" ;
      AV98Documentocomercialv02wwds_14_tfalbcomatcud = "" ;
      AV101Documentocomercialv02wwds_17_tfalbcomst_sel = "" ;
      AV100Documentocomercialv02wwds_16_tfalbcomst = "" ;
      AV102Documentocomercialv02wwds_18_tfalbcomfs = GXutil.resetTime( GXutil.nullDate() );
      AV104Documentocomercialv02wwds_20_tfalbcomfdd_sel = "" ;
      AV103Documentocomercialv02wwds_19_tfalbcomfdd = "" ;
      H01772_A396EmprCod = new String[] {""} ;
      H01772_A16AlbComEst = new byte[1] ;
      H01772_A10015AlbComFdD = new String[] {""} ;
      H01772_A10013AlbComFs = new java.util.Date[] {GXutil.nullDate()} ;
      H01772_A10738AlbComSt = new String[] {""} ;
      H01772_A14248AlbComATCU = new String[] {""} ;
      H01772_A22AlbComPri = new String[] {""} ;
      H01772_A10764AlbComAT = new String[] {""} ;
      H01772_A10740AlbComID = new String[] {""} ;
      H01772_A10739AlbComEAT = new byte[1] ;
      H01772_A4829AlbComHor = new java.util.Date[] {GXutil.nullDate()} ;
      H01772_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      H01772_A279CliNom = new String[] {""} ;
      H01772_A252CliCod = new int[1] ;
      H01772_A14AlbComCod = new int[1] ;
      H01773_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV56Station = "" ;
      AV57EmprNom = "" ;
      AV58UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV59TFAlbComEAT_SelsJson = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV79Cadena = "" ;
      AV80Hash = "" ;
      AV76Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV78Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      GXv_date9 = new java.util.Date[1] ;
      GXv_dtime10 = new java.util.Date[1] ;
      GXv_int11 = new short[1] ;
      GXv_int13 = new byte[1] ;
      GXv_int12 = new byte[1] ;
      GXv_objcol_SdtMessages_Message14 = new GXBaseCollection[1] ;
      GXv_boolean15 = new boolean[1] ;
      GXv_int8 = new int[1] ;
      AV22Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char22 = "" ;
      GXv_char23 = new String[1] ;
      GXt_char20 = "" ;
      GXv_char21 = new String[1] ;
      GXt_char18 = "" ;
      GXv_char19 = new String[1] ;
      GXt_char17 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char16 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState24 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentocomercialv02ww__default(),
         new Object[] {
             new Object[] {
            H01772_A396EmprCod, H01772_A16AlbComEst, H01772_A10015AlbComFdD, H01772_A10013AlbComFs, H01772_A10738AlbComSt, H01772_A14248AlbComATCU, H01772_A22AlbComPri, H01772_A10764AlbComAT, H01772_A10740AlbComID, H01772_A10739AlbComEAT,
            H01772_A4829AlbComHor, H01772_A17AlbComFch, H01772_A279CliNom, H01772_A252CliCod, H01772_A14AlbComCod
            }
            , new Object[] {
            H01773_AGRID_nRecordCount
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV83Pgmname = "DocumentoComercialv02WW" ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      AV83Pgmname = "DocumentoComercialv02WW" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte A16AlbComEst ;
   private byte gxajaxcallmode ;
   private byte A10739AlbComEAT ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXv_int13[] ;
   private byte GXv_int12[] ;
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
   private short AV54GridActions ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short GXv_int11[] ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_34 ;
   private int nGXsfl_34_idx=1 ;
   private int AV26TFAlbComCod ;
   private int AV27TFAlbComCod_To ;
   private int AV34TFCliCod ;
   private int AV35TFCliCod_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int A14AlbComCod ;
   private int A252CliCod ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV93Documentocomercialv02wwds_9_tfalbcomeat_sels_size ;
   private int AV85Documentocomercialv02wwds_1_tfalbcomcod ;
   private int AV86Documentocomercialv02wwds_2_tfalbcomcod_to ;
   private int AV87Documentocomercialv02wwds_3_tfclicod ;
   private int AV88Documentocomercialv02wwds_4_tfclicod_to ;
   private int AV51PageToGo ;
   private int AV105GXV1 ;
   private int GXv_int8[] ;
   private int AV106GXV2 ;
   private int AV107GXV3 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV52GridCurrentPage ;
   private long AV53GridPageCount ;
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
   private String sGXsfl_34_idx="0001" ;
   private String AV55AlbComPri ;
   private String A396EmprCod ;
   private String AV36TFCliNom ;
   private String AV37TFCliNom_Sel ;
   private String AV63TFAlbComID ;
   private String AV64TFAlbComID_Sel ;
   private String AV65TFAlbComAT ;
   private String AV66TFAlbComAT_Sel ;
   private String AV61TFAlbComATCUD ;
   private String AV62TFAlbComATCUD_Sel ;
   private String AV67TFAlbComSt ;
   private String AV68TFAlbComSt_Sel ;
   private String AV73TFAlbComFdD ;
   private String AV74TFAlbComFdD_Sel ;
   private String AV83Pgmname ;
   private String AV75Emprcod ;
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
   private String divDdo_albcomfchauxdates_Internalname ;
   private String edtavDdo_albcomfchauxdate_Internalname ;
   private String edtavDdo_albcomfchauxdate_Jsonclick ;
   private String divDdo_albcomhorauxdates_Internalname ;
   private String edtavDdo_albcomhorauxdate_Internalname ;
   private String edtavDdo_albcomhorauxdate_Jsonclick ;
   private String divDdo_albcomfsauxdates_Internalname ;
   private String edtavDdo_albcomfsauxdate_Internalname ;
   private String edtavDdo_albcomfsauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtAlbComCod_Internalname ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String edtAlbComFch_Internalname ;
   private String edtAlbComHor_Internalname ;
   private String A10740AlbComID ;
   private String edtAlbComID_Internalname ;
   private String A10764AlbComAT ;
   private String edtAlbComAT_Internalname ;
   private String A22AlbComPri ;
   private String edtAlbComPri_Internalname ;
   private String A14248AlbComATCU ;
   private String edtAlbComATCU_Internalname ;
   private String A10738AlbComSt ;
   private String edtAlbComSt_Internalname ;
   private String edtAlbComFs_Internalname ;
   private String A10015AlbComFdD ;
   private String edtAlbComFdD_Internalname ;
   private String scmdbuf ;
   private String lV89Documentocomercialv02wwds_5_tfclinom ;
   private String lV94Documentocomercialv02wwds_10_tfalbcomid ;
   private String lV96Documentocomercialv02wwds_12_tfalbcomat ;
   private String lV98Documentocomercialv02wwds_14_tfalbcomatcud ;
   private String lV100Documentocomercialv02wwds_16_tfalbcomst ;
   private String lV103Documentocomercialv02wwds_19_tfalbcomfdd ;
   private String AV90Documentocomercialv02wwds_6_tfclinom_sel ;
   private String AV89Documentocomercialv02wwds_5_tfclinom ;
   private String AV95Documentocomercialv02wwds_11_tfalbcomid_sel ;
   private String AV94Documentocomercialv02wwds_10_tfalbcomid ;
   private String AV97Documentocomercialv02wwds_13_tfalbcomat_sel ;
   private String AV96Documentocomercialv02wwds_12_tfalbcomat ;
   private String AV99Documentocomercialv02wwds_15_tfalbcomatcud_sel ;
   private String AV98Documentocomercialv02wwds_14_tfalbcomatcud ;
   private String AV101Documentocomercialv02wwds_17_tfalbcomst_sel ;
   private String AV100Documentocomercialv02wwds_16_tfalbcomst ;
   private String AV104Documentocomercialv02wwds_20_tfalbcomfdd_sel ;
   private String AV103Documentocomercialv02wwds_19_tfalbcomfdd ;
   private String hsh ;
   private String AV56Station ;
   private String AV57EmprNom ;
   private String AV58UsurCod ;
   private String AV79Cadena ;
   private String AV80Hash ;
   private String GXt_char22 ;
   private String GXv_char23[] ;
   private String GXt_char20 ;
   private String GXv_char21[] ;
   private String GXt_char18 ;
   private String GXv_char19[] ;
   private String GXt_char17 ;
   private String GXv_char4[] ;
   private String GXt_char16 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTablerightheader_Internalname ;
   private String sGXsfl_34_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtAlbComCod_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtAlbComFch_Jsonclick ;
   private String edtAlbComHor_Jsonclick ;
   private String edtAlbComID_Jsonclick ;
   private String edtAlbComAT_Jsonclick ;
   private String edtAlbComPri_Jsonclick ;
   private String edtAlbComATCU_Jsonclick ;
   private String edtAlbComSt_Jsonclick ;
   private String edtAlbComFs_Jsonclick ;
   private String edtAlbComFdD_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV42TFAlbComHor ;
   private java.util.Date AV69TFAlbComFs ;
   private java.util.Date A4829AlbComHor ;
   private java.util.Date A10013AlbComFs ;
   private java.util.Date AV92Documentocomercialv02wwds_8_tfalbcomhor ;
   private java.util.Date AV102Documentocomercialv02wwds_18_tfalbcomfs ;
   private java.util.Date GXv_dtime10[] ;
   private java.util.Date AV29TFAlbComFch_To ;
   private java.util.Date AV28TFAlbComFch ;
   private java.util.Date AV30DDO_AlbComFchAuxDate ;
   private java.util.Date AV44DDO_AlbComHorAuxDate ;
   private java.util.Date AV71DDO_AlbComFsAuxDate ;
   private java.util.Date A17AlbComFch ;
   private java.util.Date Gx_date ;
   private java.util.Date AV91Documentocomercialv02wwds_7_tfalbcomfch ;
   private java.util.Date GXv_date9[] ;
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
   private boolean bGXsfl_34_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV77OK ;
   private boolean GXv_boolean15[] ;
   private String AV59TFAlbComEAT_SelsJson ;
   private GXSimpleCollection<Byte> AV93Documentocomercialv02wwds_9_tfalbcomeat_sels ;
   private GXSimpleCollection<Byte> AV60TFAlbComEAT_Sels ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavAlbcompri ;
   private HTMLChoice cmbavGridactions ;
   private HTMLChoice cmbAlbComEAT ;
   private IDataStoreProvider pr_default ;
   private String[] H01772_A396EmprCod ;
   private byte[] H01772_A16AlbComEst ;
   private String[] H01772_A10015AlbComFdD ;
   private java.util.Date[] H01772_A10013AlbComFs ;
   private String[] H01772_A10738AlbComSt ;
   private String[] H01772_A14248AlbComATCU ;
   private String[] H01772_A22AlbComPri ;
   private String[] H01772_A10764AlbComAT ;
   private String[] H01772_A10740AlbComID ;
   private byte[] H01772_A10739AlbComEAT ;
   private java.util.Date[] H01772_A4829AlbComHor ;
   private java.util.Date[] H01772_A17AlbComFch ;
   private String[] H01772_A279CliNom ;
   private int[] H01772_A252CliCod ;
   private int[] H01772_A14AlbComCod ;
   private long[] H01773_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV76Messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message14[] ;
   private com.genexus.SdtMessages_Message AV78Message ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV50DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState24[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class documentocomercialv02ww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01772( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A10739AlbComEAT ,
                                          GXSimpleCollection<Byte> AV93Documentocomercialv02wwds_9_tfalbcomeat_sels ,
                                          int AV85Documentocomercialv02wwds_1_tfalbcomcod ,
                                          int AV86Documentocomercialv02wwds_2_tfalbcomcod_to ,
                                          int AV87Documentocomercialv02wwds_3_tfclicod ,
                                          int AV88Documentocomercialv02wwds_4_tfclicod_to ,
                                          String AV90Documentocomercialv02wwds_6_tfclinom_sel ,
                                          String AV89Documentocomercialv02wwds_5_tfclinom ,
                                          java.util.Date AV91Documentocomercialv02wwds_7_tfalbcomfch ,
                                          java.util.Date AV92Documentocomercialv02wwds_8_tfalbcomhor ,
                                          int AV93Documentocomercialv02wwds_9_tfalbcomeat_sels_size ,
                                          String AV95Documentocomercialv02wwds_11_tfalbcomid_sel ,
                                          String AV94Documentocomercialv02wwds_10_tfalbcomid ,
                                          String AV97Documentocomercialv02wwds_13_tfalbcomat_sel ,
                                          String AV96Documentocomercialv02wwds_12_tfalbcomat ,
                                          String AV99Documentocomercialv02wwds_15_tfalbcomatcud_sel ,
                                          String AV98Documentocomercialv02wwds_14_tfalbcomatcud ,
                                          String AV101Documentocomercialv02wwds_17_tfalbcomst_sel ,
                                          String AV100Documentocomercialv02wwds_16_tfalbcomst ,
                                          java.util.Date AV102Documentocomercialv02wwds_18_tfalbcomfs ,
                                          String AV104Documentocomercialv02wwds_20_tfalbcomfdd_sel ,
                                          String AV103Documentocomercialv02wwds_19_tfalbcomfdd ,
                                          java.util.Date AV28TFAlbComFch ,
                                          java.util.Date AV29TFAlbComFch_To ,
                                          int A14AlbComCod ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          java.util.Date A17AlbComFch ,
                                          java.util.Date A4829AlbComHor ,
                                          String A10740AlbComID ,
                                          String A10764AlbComAT ,
                                          String A14248AlbComATCU ,
                                          String A10738AlbComSt ,
                                          java.util.Date A10013AlbComFs ,
                                          String A10015AlbComFdD ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String A22AlbComPri ,
                                          String AV55AlbComPri ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int25 = new byte[28];
      Object[] GXv_Object26 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.EmprCod, T1.AlbComEst, T1.AlbComFdD, T1.AlbComFs, T1.AlbComSt, T1.AlbComATCU, T1.AlbComPri, T1.AlbComAT, T1.AlbComID, T1.AlbComEAT, T1.AlbComHor, T1.AlbComFch," ;
      sSelectString += " T2.CliNom, T1.CliCod, T1.AlbComCod" ;
      sFromString = " FROM (TXPCALCOM T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbComPri = ?)");
      if ( ! (0==AV85Documentocomercialv02wwds_1_tfalbcomcod) )
      {
         addWhere(sWhereString, "(T1.AlbComCod >= ?)");
      }
      else
      {
         GXv_int25[2] = (byte)(1) ;
      }
      if ( ! (0==AV86Documentocomercialv02wwds_2_tfalbcomcod_to) )
      {
         addWhere(sWhereString, "(T1.AlbComCod <= ?)");
      }
      else
      {
         GXv_int25[3] = (byte)(1) ;
      }
      if ( ! (0==AV87Documentocomercialv02wwds_3_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int25[4] = (byte)(1) ;
      }
      if ( ! (0==AV88Documentocomercialv02wwds_4_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int25[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Documentocomercialv02wwds_6_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV89Documentocomercialv02wwds_5_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Documentocomercialv02wwds_6_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int25[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Documentocomercialv02wwds_7_tfalbcomfch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int25[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV92Documentocomercialv02wwds_8_tfalbcomhor) )
      {
         addWhere(sWhereString, "(T1.AlbComHor >= ?)");
      }
      else
      {
         GXv_int25[9] = (byte)(1) ;
      }
      if ( AV93Documentocomercialv02wwds_9_tfalbcomeat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV93Documentocomercialv02wwds_9_tfalbcomeat_sels, "T1.AlbComEAT IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV95Documentocomercialv02wwds_11_tfalbcomid_sel)==0) && ( ! (GXutil.strcmp("", AV94Documentocomercialv02wwds_10_tfalbcomid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Documentocomercialv02wwds_11_tfalbcomid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComID = ?)");
      }
      else
      {
         GXv_int25[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Documentocomercialv02wwds_13_tfalbcomat_sel)==0) && ( ! (GXutil.strcmp("", AV96Documentocomercialv02wwds_12_tfalbcomat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComAT) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Documentocomercialv02wwds_13_tfalbcomat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComAT = ?)");
      }
      else
      {
         GXv_int25[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Documentocomercialv02wwds_15_tfalbcomatcud_sel)==0) && ( ! (GXutil.strcmp("", AV98Documentocomercialv02wwds_14_tfalbcomatcud)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComATCU) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Documentocomercialv02wwds_15_tfalbcomatcud_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComATCU = ?)");
      }
      else
      {
         GXv_int25[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Documentocomercialv02wwds_17_tfalbcomst_sel)==0) && ( ! (GXutil.strcmp("", AV100Documentocomercialv02wwds_16_tfalbcomst)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComSt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Documentocomercialv02wwds_17_tfalbcomst_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComSt = ?)");
      }
      else
      {
         GXv_int25[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV102Documentocomercialv02wwds_18_tfalbcomfs) )
      {
         addWhere(sWhereString, "(T1.AlbComFs >= ?)");
      }
      else
      {
         GXv_int25[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Documentocomercialv02wwds_20_tfalbcomfdd_sel)==0) && ( ! (GXutil.strcmp("", AV103Documentocomercialv02wwds_19_tfalbcomfdd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComFdD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Documentocomercialv02wwds_20_tfalbcomfdd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComFdD = ?)");
      }
      else
      {
         GXv_int25[20] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV28TFAlbComFch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int25[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV29TFAlbComFch_To)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch <= ?)");
      }
      else
      {
         GXv_int25[22] = (byte)(1) ;
      }
      if ( AV12OrderedBy == 1 )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.AlbComFch DESC, T1.AlbComCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbComCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbComCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbComFch" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbComFch DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbComHor" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbComHor DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbComEAT" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbComEAT DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbComID" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbComID DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbComAT" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbComAT DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbComATCU" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbComATCU DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbComSt" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbComSt DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbComFs" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbComFs DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbComFdD" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbComFdD DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.AlbComCod" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object26[0] = scmdbuf ;
      GXv_Object26[1] = GXv_int25 ;
      return GXv_Object26 ;
   }

   protected Object[] conditional_H01773( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A10739AlbComEAT ,
                                          GXSimpleCollection<Byte> AV93Documentocomercialv02wwds_9_tfalbcomeat_sels ,
                                          int AV85Documentocomercialv02wwds_1_tfalbcomcod ,
                                          int AV86Documentocomercialv02wwds_2_tfalbcomcod_to ,
                                          int AV87Documentocomercialv02wwds_3_tfclicod ,
                                          int AV88Documentocomercialv02wwds_4_tfclicod_to ,
                                          String AV90Documentocomercialv02wwds_6_tfclinom_sel ,
                                          String AV89Documentocomercialv02wwds_5_tfclinom ,
                                          java.util.Date AV91Documentocomercialv02wwds_7_tfalbcomfch ,
                                          java.util.Date AV92Documentocomercialv02wwds_8_tfalbcomhor ,
                                          int AV93Documentocomercialv02wwds_9_tfalbcomeat_sels_size ,
                                          String AV95Documentocomercialv02wwds_11_tfalbcomid_sel ,
                                          String AV94Documentocomercialv02wwds_10_tfalbcomid ,
                                          String AV97Documentocomercialv02wwds_13_tfalbcomat_sel ,
                                          String AV96Documentocomercialv02wwds_12_tfalbcomat ,
                                          String AV99Documentocomercialv02wwds_15_tfalbcomatcud_sel ,
                                          String AV98Documentocomercialv02wwds_14_tfalbcomatcud ,
                                          String AV101Documentocomercialv02wwds_17_tfalbcomst_sel ,
                                          String AV100Documentocomercialv02wwds_16_tfalbcomst ,
                                          java.util.Date AV102Documentocomercialv02wwds_18_tfalbcomfs ,
                                          String AV104Documentocomercialv02wwds_20_tfalbcomfdd_sel ,
                                          String AV103Documentocomercialv02wwds_19_tfalbcomfdd ,
                                          java.util.Date AV28TFAlbComFch ,
                                          java.util.Date AV29TFAlbComFch_To ,
                                          int A14AlbComCod ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          java.util.Date A17AlbComFch ,
                                          java.util.Date A4829AlbComHor ,
                                          String A10740AlbComID ,
                                          String A10764AlbComAT ,
                                          String A14248AlbComATCU ,
                                          String A10738AlbComSt ,
                                          java.util.Date A10013AlbComFs ,
                                          String A10015AlbComFdD ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String A22AlbComPri ,
                                          String AV55AlbComPri ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int28 = new byte[23];
      Object[] GXv_Object29 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPCALCOM T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbComPri = ?)");
      if ( ! (0==AV85Documentocomercialv02wwds_1_tfalbcomcod) )
      {
         addWhere(sWhereString, "(T1.AlbComCod >= ?)");
      }
      else
      {
         GXv_int28[2] = (byte)(1) ;
      }
      if ( ! (0==AV86Documentocomercialv02wwds_2_tfalbcomcod_to) )
      {
         addWhere(sWhereString, "(T1.AlbComCod <= ?)");
      }
      else
      {
         GXv_int28[3] = (byte)(1) ;
      }
      if ( ! (0==AV87Documentocomercialv02wwds_3_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int28[4] = (byte)(1) ;
      }
      if ( ! (0==AV88Documentocomercialv02wwds_4_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int28[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Documentocomercialv02wwds_6_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV89Documentocomercialv02wwds_5_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Documentocomercialv02wwds_6_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int28[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Documentocomercialv02wwds_7_tfalbcomfch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int28[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV92Documentocomercialv02wwds_8_tfalbcomhor) )
      {
         addWhere(sWhereString, "(T1.AlbComHor >= ?)");
      }
      else
      {
         GXv_int28[9] = (byte)(1) ;
      }
      if ( AV93Documentocomercialv02wwds_9_tfalbcomeat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV93Documentocomercialv02wwds_9_tfalbcomeat_sels, "T1.AlbComEAT IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV95Documentocomercialv02wwds_11_tfalbcomid_sel)==0) && ( ! (GXutil.strcmp("", AV94Documentocomercialv02wwds_10_tfalbcomid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Documentocomercialv02wwds_11_tfalbcomid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComID = ?)");
      }
      else
      {
         GXv_int28[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Documentocomercialv02wwds_13_tfalbcomat_sel)==0) && ( ! (GXutil.strcmp("", AV96Documentocomercialv02wwds_12_tfalbcomat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComAT) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Documentocomercialv02wwds_13_tfalbcomat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComAT = ?)");
      }
      else
      {
         GXv_int28[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Documentocomercialv02wwds_15_tfalbcomatcud_sel)==0) && ( ! (GXutil.strcmp("", AV98Documentocomercialv02wwds_14_tfalbcomatcud)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComATCU) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Documentocomercialv02wwds_15_tfalbcomatcud_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComATCU = ?)");
      }
      else
      {
         GXv_int28[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Documentocomercialv02wwds_17_tfalbcomst_sel)==0) && ( ! (GXutil.strcmp("", AV100Documentocomercialv02wwds_16_tfalbcomst)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComSt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Documentocomercialv02wwds_17_tfalbcomst_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComSt = ?)");
      }
      else
      {
         GXv_int28[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV102Documentocomercialv02wwds_18_tfalbcomfs) )
      {
         addWhere(sWhereString, "(T1.AlbComFs >= ?)");
      }
      else
      {
         GXv_int28[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Documentocomercialv02wwds_20_tfalbcomfdd_sel)==0) && ( ! (GXutil.strcmp("", AV103Documentocomercialv02wwds_19_tfalbcomfdd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComFdD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Documentocomercialv02wwds_20_tfalbcomfdd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComFdD = ?)");
      }
      else
      {
         GXv_int28[20] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV28TFAlbComFch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int28[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV29TFAlbComFch_To)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch <= ?)");
      }
      else
      {
         GXv_int28[22] = (byte)(1) ;
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
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object29[0] = scmdbuf ;
      GXv_Object29[1] = GXv_int28 ;
      return GXv_Object29 ;
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
                  return conditional_H01772(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Boolean) dynConstraints[36]).booleanValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] );
            case 1 :
                  return conditional_H01773(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Boolean) dynConstraints[36]).booleanValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01772", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01773", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 200);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(11);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 30);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((int[]) buf[14])[0] = rslt.getInt(15);
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
                  stmt.setString(sIdx, (String)parms[28], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[36]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[37], false);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[46], false);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 200);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 200);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[49]);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[50]);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               return;
            case 1 :
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
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[31]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[32], false);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[41], false);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 200);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 200);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[44]);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[45]);
               }
               return;
      }
   }

}

